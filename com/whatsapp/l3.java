package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.whatsapp.notification.d;
import com.whatsapp.preference.WaRingtonePreference;

class l3 implements OnPreferenceChangeListener {
    final WaRingtonePreference a;
    final a3b b;
    final SettingsJidNotificationActivity c;

    public boolean onPreferenceChange(Preference preference, Object obj) {
        String obj2 = obj.toString();
        this.a.a(obj2);
        this.a.setSummary(d.a(preference.getContext(), obj2));
        this.b.a(SettingsJidNotificationActivity.b(this.c), obj2);
        return true;
    }

    l3(SettingsJidNotificationActivity settingsJidNotificationActivity, WaRingtonePreference waRingtonePreference, a3b com_whatsapp_a3b) {
        this.c = settingsJidNotificationActivity;
        this.a = waRingtonePreference;
        this.b = com_whatsapp_a3b;
    }
}
