package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.whatsapp.gdrive.SettingsGoogleDrive;

class bk implements OnPreferenceClickListener {
    final SettingsChat a;

    bk(SettingsChat settingsChat) {
        this.a = settingsChat;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsGoogleDrive.class));
        return true;
    }
}
