package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class tz implements OnClickListener {
    final Settings a;

    tz(Settings settings) {
        this.a = settings;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a, SettingsAccount.class));
    }
}
