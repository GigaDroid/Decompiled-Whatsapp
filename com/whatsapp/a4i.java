package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class a4i implements OnClickListener {
    final Settings a;

    a4i(Settings settings) {
        this.a = settings;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a, SettingsDataUsage.class));
    }
}
