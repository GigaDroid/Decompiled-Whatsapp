package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.whatsapp.fieldstats.c;
import com.whatsapp.fieldstats.k;

class im implements OnPreferenceClickListener {
    final SettingsContacts a;

    im(SettingsContacts settingsContacts) {
        this.a = settingsContacts;
    }

    public boolean onPreferenceClick(Preference preference) {
        nf.a(k.TELL_A_FRIEND, c.SETTINGS_CONTACTS);
        App.b(this.a);
        return true;
    }
}
