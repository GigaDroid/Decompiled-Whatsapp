package com.whatsapp;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.view.View.OnClickListener;

class a5x implements OnClickListener {
    final Settings a;

    public void onClick(View view) {
        ActivityCompat.startActivity(this.a, new Intent(this.a, ProfileInfoActivity.class), ActivityOptionsCompat.makeSceneTransitionAnimation(this.a, Settings.a(this.a), this.a.getString(2131232335)).toBundle());
    }

    a5x(Settings settings) {
        this.a = settings;
    }
}
