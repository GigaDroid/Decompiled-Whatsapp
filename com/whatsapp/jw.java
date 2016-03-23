package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.model.CameraPosition;

class jw implements OnCameraChangeListener {
    final GroupChatLiveLocationsActivity2 a;

    jw(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }

    public void onCameraChange(CameraPosition cameraPosition) {
        if (((int) (GroupChatLiveLocationsActivity2.g(this.a) * 5.0f)) != ((int) (cameraPosition.zoom * 5.0f))) {
            GroupChatLiveLocationsActivity2.b(this.a, cameraPosition.zoom);
            GroupChatLiveLocationsActivity2.j(this.a);
        }
    }
}
