package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.whatsapp.fieldstats.k;

class f1 implements OnPreferenceClickListener {
    final SettingsHelp a;

    f1(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }

    public boolean onPreferenceClick(Preference preference) {
        nf.a(k.ABOUT);
        this.a.startActivity(new Intent(this.a, About.class));
        return true;
    }
}
