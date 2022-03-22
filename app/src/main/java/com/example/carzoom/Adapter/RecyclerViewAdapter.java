package com.example.carzoom.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.carzoom.R;
import com.example.carzoom.RealmObjects.RelevantListingInfo;
import com.example.carzoom.Utils;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<RelevantListingInfo> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private Context context;

    public RecyclerViewAdapter(Context context, List<RelevantListingInfo> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RelevantListingInfo listing = mData.get(position);
        holder.setCarID(listing.getId());
        holder.carInfo.setText(Utils.getTextForCarInfo(listing));
        holder.carMileage.setText(Utils.getTextForCarMileage(listing));
        holder.carLocation.setText(Utils.getTextForCarLocation(listing));
        holder.callDealerButton.setOnClickListener(Utils.callDealerListener(context, listing.getPhone()));

        Picasso.get()
                .load(listing.getImageUrl())
                .placeholder(R.drawable.ic_car)
                .error(R.drawable.ic_car_error)
                .into(holder.carImageView);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        String carId;
        TextView carInfo;
        TextView carMileage;
        TextView carLocation;
        TextView callDealerButton;
        ImageView carImageView;
        Context mContext;

        ViewHolder(View itemView, Context context) {
            super(itemView);
            mContext = context;

            carImageView = itemView.findViewById(R.id.iv_activity_main_car_image);
            carInfo = itemView.findViewById(R.id.tv_activity_main_car_info);
            carMileage = itemView.findViewById(R.id.tv_activity_main_price_mileage);
            carLocation = itemView.findViewById(R.id.tv_activity_main_location_value);
            callDealerButton = itemView.findViewById(R.id.button_call_dealer);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, carId);
        }
        public void setCarID(String id) {
            this.carId = id;
        }
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, String carId);
    }
}
