package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class azy implements OnPreferenceChangeListener {
    final SettingsJidNotificationActivity a;
    final a3b b;

    azy(SettingsJidNotificationActivity settingsJidNotificationActivity, a3b com_whatsapp_a3b) {
        this.a = settingsJidNotificationActivity;
        this.b = com_whatsapp_a3b;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        this.b.a(SettingsJidNotificationActivity.b(this.a), Boolean.TRUE.equals(obj));
        SettingsJidNotificationActivity.a(this.a);
        return true;
    }
}
