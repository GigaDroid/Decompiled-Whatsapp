package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.model.LatLng;

class adh implements OnMapClickListener {
    final GroupChatLiveLocationsActivity2 a;

    public void onMapClick(LatLng latLng) {
        GroupChatLiveLocationsActivity2.a(this.a, null);
        GroupChatLiveLocationsActivity2.a(this.a).d();
        GroupChatLiveLocationsActivity2.j(this.a);
    }

    adh(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }
}
