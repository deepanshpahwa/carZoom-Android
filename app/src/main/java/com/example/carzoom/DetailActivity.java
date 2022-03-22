package com.example.carzoom;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.carzoom.RealmObjects.RelevantListingInfo;
import com.squareup.picasso.Picasso;

import io.realm.Realm;

public class DetailActivity extends AppCompatActivity {

    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        realm = Realm.getDefaultInstance();

        String carId = getIntent().getStringExtra("carId");
        RelevantListingInfo listing = realm.where(RelevantListingInfo.class).equalTo("id", carId).findFirst();

        ImageView carImageView = findViewById(R.id.iv_activity_detail_car_image);
        TextView carInfo = findViewById(R.id.tv_activity_detail_car_info);
        TextView carPriceAndMileage = findViewById(R.id.tv_activity_detail_price_mileage);

        TextView carLocation = findViewById(R.id.tv_activity_detail_location_value);
        TextView carExteriorColor = findViewById(R.id.tv_activity_detail_excolor_value);
        TextView carInteriorColor = findViewById(R.id.tv_activity_detail_incolor_value);
        TextView carDriveType = findViewById(R.id.tv_activity_detail_drivetype_value);
        TextView carTransmission = findViewById(R.id.tv_activity_detail_transmission_value);
        TextView carBodyStyle = findViewById(R.id.tv_activity_detail_bodystyle_value);
        TextView carEngine = findViewById(R.id.tv_activity_detail_engine_value);
        TextView carFuel = findViewById(R.id.tv_activity_detail_fuel_value);

        carInfo.setText(Utils.getTextForCarInfo(listing));
        carPriceAndMileage.setText(Utils.getTextForCarMileage(listing));
        carLocation.setText(Utils.getTextForCarLocation(listing));
        carExteriorColor.setText(listing.getExteriorColor());
        carInteriorColor.setText(listing.getInteriorColor());
        carDriveType.setText(listing.getDriveType());
        carTransmission.setText(listing.getTransmission());
        carBodyStyle.setText(listing.getBodyType());
        carEngine.setText(listing.getEngine());
        carFuel.setText(listing.getFuel());

        Picasso.get()
                .load(listing.getImageUrl())
                .placeholder(R.drawable.ic_car)
                .error(R.drawable.ic_car)
                .into(carImageView);

        Button button = findViewById(R.id.button_activity_detail_call_dealer);
        button.setOnClickListener(Utils.callDealerListener(getBaseContext(), listing.getPhone()));
    }
}