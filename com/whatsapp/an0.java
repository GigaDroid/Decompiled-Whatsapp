package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.whatsapp.util.bq;

class an0 implements OnPreferenceClickListener {
    final SettingsContacts a;

    an0(SettingsContacts settingsContacts) {
        this.a = settingsContacts;
    }

    public boolean onPreferenceClick(Preference preference) {
        bq.a(new anr(this.a, null), new Void[0]);
        return true;
    }
}
