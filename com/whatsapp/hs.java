package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class hs implements OnPreferenceChangeListener {
    final SettingsChat a;

    hs(SettingsChat settingsChat) {
        this.a = settingsChat;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        String charSequence = listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString();
        preference.setTitle(this.a.getString(2131231921, new Object[]{charSequence}));
        return true;
    }
}
