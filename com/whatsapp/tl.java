package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.maps.GeoPoint;
import com.whatsapp.protocol.cx;
import java.util.ArrayList;

class tl implements OnClickListener {
    final ArrayList a;
    final GeoPoint b;
    final GroupChatLiveLocationsActivity c;

    public void onClick(View view) {
        GroupChatLiveLocationsActivity.f(this.c).a(this.a);
        if (this.a.size() == 1) {
            GroupChatLiveLocationsActivity.a(this.c, (cx) this.a.get(0));
        }
        GroupChatLiveLocationsActivity.g(this.c).getController().animateTo(this.b);
        GroupChatLiveLocationsActivity.d(this.c);
    }

    tl(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, ArrayList arrayList, GeoPoint geoPoint) {
        this.c = groupChatLiveLocationsActivity;
        this.a = arrayList;
        this.b = geoPoint;
    }
}
