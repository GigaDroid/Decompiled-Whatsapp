package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class hn implements OnPreferenceClickListener {
    final SettingsPrivacy a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, BlockList.class));
        return true;
    }

    hn(SettingsPrivacy settingsPrivacy) {
        this.a = settingsPrivacy;
    }
}
