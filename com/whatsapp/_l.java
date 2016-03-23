package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class _l implements OnPreferenceChangeListener {
    final a3b a;
    final SettingsJidNotificationActivity b;

    public boolean onPreferenceChange(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        preference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString());
        this.a.f(SettingsJidNotificationActivity.b(this.b), obj.toString());
        return true;
    }

    _l(SettingsJidNotificationActivity settingsJidNotificationActivity, a3b com_whatsapp_a3b) {
        this.b = settingsJidNotificationActivity;
        this.a = com_whatsapp_a3b;
    }
}
