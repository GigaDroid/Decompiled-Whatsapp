package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.whatsapp.notification.d;
import com.whatsapp.preference.WaRingtonePreference;

class avt implements OnPreferenceChangeListener {
    final SettingsJidNotificationActivity a;
    final WaRingtonePreference b;
    final a3b c;

    avt(SettingsJidNotificationActivity settingsJidNotificationActivity, WaRingtonePreference waRingtonePreference, a3b com_whatsapp_a3b) {
        this.a = settingsJidNotificationActivity;
        this.b = waRingtonePreference;
        this.c = com_whatsapp_a3b;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        String obj2 = obj.toString();
        this.b.a(obj2);
        this.b.setSummary(d.a(preference.getContext(), obj2));
        this.c.b(SettingsJidNotificationActivity.b(this.a), obj2);
        return true;
    }
}
