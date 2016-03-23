package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class k implements OnClickListener {
    final Settings a;

    k(Settings settings) {
        this.a = settings;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a, SettingsNotifications.class));
    }
}
