package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class o7 implements OnPreferenceChangeListener {
    final a3b a;
    final SettingsJidNotificationActivity b;

    o7(SettingsJidNotificationActivity settingsJidNotificationActivity, a3b com_whatsapp_a3b) {
        this.b = settingsJidNotificationActivity;
        this.a = com_whatsapp_a3b;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        preference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString());
        this.a.c(SettingsJidNotificationActivity.b(this.b), obj.toString());
        return true;
    }
}
