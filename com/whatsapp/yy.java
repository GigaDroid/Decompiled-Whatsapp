package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.util.ap;

class yy extends ap {
    final ProfileInfoActivity b;

    yy(ProfileInfoActivity profileInfoActivity) {
        this.b = profileInfoActivity;
    }

    public void a(View view) {
        this.b.startActivity(new Intent(this.b, ChangeNumberOverview.class));
    }
}
