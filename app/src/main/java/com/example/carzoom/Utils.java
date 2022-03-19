package com.example.carzoom;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.view.View;

import org.joda.time.DateTime;

public class Utils {
    public static View.OnClickListener callDealerListener(Context context, String phoneNumber) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        };
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

    public static String readFromSharedPref(Application application, SharedPreferences sharedPref) {
        return sharedPref.getString(application.getString(R.string.preference_last_sync_key), "");
    }

    public static void writeToSharedPref(Application application, SharedPreferences sharedPref) {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(application.getString(R.string.preference_last_sync_key), DateTime.now().toString());
        editor.apply();
    }
}
