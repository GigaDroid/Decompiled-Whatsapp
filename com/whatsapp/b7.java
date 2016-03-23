package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class b7 implements OnPreferenceClickListener {
    final SettingsChat a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsChatHistory.class));
        return true;
    }

    b7(SettingsChat settingsChat) {
        this.a = settingsChat;
    }
}
