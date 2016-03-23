package com.whatsapp;

import android.support.v4.app.SharedElementCallback;
import android.view.View;
import java.util.List;
import java.util.Map;

class s5 extends SharedElementCallback {
    final ViewProfilePhoto a;

    public void onSharedElementEnd(List list, List list2, List list3) {
        if (!ViewProfilePhoto.a(this.a) && !list2.isEmpty()) {
            this.a.getWindow().setReturnTransition(ViewProfilePhoto.a(this.a, (View) list2.get(0)));
        }
    }

    public void onSharedElementStart(List list, List list2, List list3) {
        if (ViewProfilePhoto.a(this.a) && !list2.isEmpty()) {
            this.a.getWindow().setEnterTransition(ViewProfilePhoto.a(this.a, (View) list2.get(0)));
        }
    }

    public void onMapSharedElements(List list, Map map) {
    }

    s5(ViewProfilePhoto viewProfilePhoto) {
        this.a = viewProfilePhoto;
    }
}
