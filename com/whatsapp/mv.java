package com.whatsapp;

import android.content.Context;
import android.location.Location;
import com.google.android.maps.MapView;

class mv extends m_ {
    final GroupChatLiveLocationsActivity h;

    public void onLocationChanged(Location location) {
        super.onLocationChanged(location);
    }

    mv(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, Context context, MapView mapView) {
        this.h = groupChatLiveLocationsActivity;
        super(context, mapView);
    }
}
