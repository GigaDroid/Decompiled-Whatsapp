package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class a9o implements OnPreferenceChangeListener {
    final SettingsDataUsage a;

    public boolean onPreferenceChange(Preference preference, Object obj) {
        App.a(1, SettingsDataUsage.a((CharSequence[]) obj));
        return true;
    }

    a9o(SettingsDataUsage settingsDataUsage) {
        this.a = settingsDataUsage;
    }
}
