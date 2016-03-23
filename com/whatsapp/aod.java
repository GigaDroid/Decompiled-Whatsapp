package com.whatsapp;

import android.location.Location;
import com.google.android.maps.GeoPoint;
import com.whatsapp.protocol.cx;

class aod extends aox {
    final GroupChatLiveLocationsActivity p;
    boolean q;

    public void a(cx cxVar, boolean z) {
        GroupChatLiveLocationsActivity.a(this.p, cxVar);
        GroupChatLiveLocationsActivity.g(this.p).getController().animateTo(new GeoPoint((int) (cxVar.a * 1000000.0d), (int) (cxVar.b * 1000000.0d)));
        if (z && GroupChatLiveLocationsActivity.g(this.p).getZoomLevel() < 17) {
            GroupChatLiveLocationsActivity.g(this.p).getController().setZoom(17);
        }
        GroupChatLiveLocationsActivity.d(this.p);
    }

    public void a() {
        GroupChatLiveLocationsActivity.d(this.p);
        GroupChatLiveLocationsActivity.a(this.p).a();
        if (!(this.q || GroupChatLiveLocationsActivity.f(this.p).j.isEmpty())) {
            this.q = true;
            GroupChatLiveLocationsActivity.e(this.p);
        }
        if (GroupChatLiveLocationsActivity.c(this.p) != null) {
            GroupChatLiveLocationsActivity.g(this.p).getController().animateTo(new GeoPoint((int) (GroupChatLiveLocationsActivity.c(this.p).a * 1000000.0d), (int) (GroupChatLiveLocationsActivity.c(this.p).b * 1000000.0d)));
        }
    }

    public Location f() {
        Location location = new Location("");
        GeoPoint myLocation = GroupChatLiveLocationsActivity.b(this.p).getMyLocation();
        if (myLocation != null) {
            location.setLatitude(((double) myLocation.getLatitudeE6()) / 1000000.0d);
            location.setLongitude(((double) myLocation.getLongitudeE6()) / 1000000.0d);
        }
        return location;
    }

    aod(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.p = groupChatLiveLocationsActivity;
    }
}
