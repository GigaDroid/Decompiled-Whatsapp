package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class bx implements OnPreferenceChangeListener {
    final SettingsDataUsage a;

    public boolean onPreferenceChange(Preference preference, Object obj) {
        App.a(2, SettingsDataUsage.a((CharSequence[]) obj));
        return true;
    }

    bx(SettingsDataUsage settingsDataUsage) {
        this.a = settingsDataUsage;
    }
}
