package com.whatsapp;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.model.Marker;
import com.whatsapp.protocol.cx;
import java.util.ArrayList;

class awp implements OnMarkerClickListener {
    final GroupChatLiveLocationsActivity2 a;

    awp(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }

    public boolean onMarkerClick(Marker marker) {
        ArrayList arrayList = (ArrayList) GroupChatLiveLocationsActivity2.b(this.a).get(marker);
        GroupChatLiveLocationsActivity2.a(this.a).a(arrayList);
        if (arrayList.size() == 1) {
            GroupChatLiveLocationsActivity2.a(this.a, (cx) arrayList.get(0));
        }
        GroupChatLiveLocationsActivity2.j(this.a);
        GroupChatLiveLocationsActivity2.a(this.a, true);
        GroupChatLiveLocationsActivity2.d(this.a).animateCamera(CameraUpdateFactory.newLatLng(marker.getPosition()));
        return true;
    }
}
