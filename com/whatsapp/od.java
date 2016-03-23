package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class od implements OnPreferenceClickListener {
    final SettingsAccount a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.showDialog(1);
        return false;
    }

    od(SettingsAccount settingsAccount) {
        this.a = settingsAccount;
    }
}
