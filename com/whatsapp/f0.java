package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class f0 implements OnClickListener {
    final ProfileInfoActivity a;

    public void onClick(View view) {
        r.a(ProfileInfoActivity.b(this.a), this.a, 12);
    }

    f0(ProfileInfoActivity profileInfoActivity) {
        this.a = profileInfoActivity;
    }
}
