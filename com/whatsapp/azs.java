package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class azs implements OnPreferenceClickListener {
    final SettingsChatHistory a;

    azs(SettingsChatHistory settingsChatHistory) {
        this.a = settingsChatHistory;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.showDialog(3);
        return true;
    }
}
