package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class q1 implements OnClickListener {
    final Settings a;

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a, SettingsChat.class));
    }

    q1(Settings settings) {
        this.a = settings;
    }
}
