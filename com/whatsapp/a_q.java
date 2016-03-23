package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class a_q implements OnPreferenceClickListener {
    final SettingsChatHistory a;

    a_q(SettingsChatHistory settingsChatHistory) {
        this.a = settingsChatHistory;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.showDialog(4);
        return true;
    }
}
