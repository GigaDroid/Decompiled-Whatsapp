package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ux implements OnClickListener {
    final ProfilePhotoReminder a;

    ux(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }

    public void onClick(View view) {
        r.a(ProfilePhotoReminder.a(this.a), this.a, 12);
    }
}
