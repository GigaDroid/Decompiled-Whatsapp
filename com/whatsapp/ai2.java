package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ai2 implements OnClickListener {
    final Settings a;

    ai2(Settings settings) {
        this.a = settings;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a, SettingsContacts.class));
    }
}
