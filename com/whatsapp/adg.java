package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class adg implements OnPreferenceClickListener {
    final SettingsDataUsage a;

    adg(SettingsDataUsage settingsDataUsage) {
        this.a = settingsDataUsage;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsNetworkUsage.class));
        return false;
    }
}
