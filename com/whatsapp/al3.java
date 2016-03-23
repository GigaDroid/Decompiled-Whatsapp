package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class al3 implements OnPreferenceChangeListener {
    final SettingsDataUsage a;

    al3(SettingsDataUsage settingsDataUsage) {
        this.a = settingsDataUsage;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        int a = SettingsDataUsage.a((CharSequence[]) obj);
        App.a(3, a);
        if ((a & 4) != 0) {
            this.a.showDialog(1);
        }
        return true;
    }
}
