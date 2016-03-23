package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class aez implements OnPreferenceChangeListener {
    final SettingsJidNotificationActivity a;
    final a3b b;

    aez(SettingsJidNotificationActivity settingsJidNotificationActivity, a3b com_whatsapp_a3b) {
        this.a = settingsJidNotificationActivity;
        this.b = com_whatsapp_a3b;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        preference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString());
        this.b.d(SettingsJidNotificationActivity.b(this.a), obj.toString());
        return true;
    }
}
