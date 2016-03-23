package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class a9 implements OnClickListener {
    final Settings a;

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a, SettingsHelp.class));
    }

    a9(Settings settings) {
        this.a = settings;
    }
}
