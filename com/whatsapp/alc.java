package com.whatsapp;

import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.view.View.OnClickListener;

class alc implements OnClickListener {
    final SettingsSecurity a;
    final SwitchCompat b;

    alc(SettingsSecurity settingsSecurity, SwitchCompat switchCompat) {
        this.a = settingsSecurity;
        this.b = switchCompat;
    }

    public void onClick(View view) {
        this.b.setChecked(!this.b.isChecked());
    }
}
