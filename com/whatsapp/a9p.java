package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class a9p implements OnPreferenceClickListener {
    final SettingsChatHistory a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.showDialog(5);
        return true;
    }

    a9p(SettingsChatHistory settingsChatHistory) {
        this.a = settingsChatHistory;
    }
}
