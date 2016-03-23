package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class dl implements OnPreferenceClickListener {
    final SettingsAccount a;

    dl(SettingsAccount settingsAccount) {
        this.a = settingsAccount;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, ChangeNumberOverview.class));
        return true;
    }
}
