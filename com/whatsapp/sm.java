package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class sm implements OnPreferenceClickListener {
    final SettingsAccount a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, DeleteAccount.class));
        return true;
    }

    sm(SettingsAccount settingsAccount) {
        this.a = settingsAccount;
    }
}
