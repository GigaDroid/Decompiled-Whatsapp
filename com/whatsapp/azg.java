package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.whatsapp.fieldstats.bn;
import com.whatsapp.fieldstats.i;
import com.whatsapp.util.bq;

class azg implements OnPreferenceChangeListener {
    final SettingsPrivacy a;

    azg(SettingsPrivacy settingsPrivacy) {
        this.a = settingsPrivacy;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        if (Boolean.TRUE.equals(obj)) {
            bq.a(new atd(this));
        }
        i.a(this.a.getApplicationContext(), bn.RECEIPTS_ENABLED, Boolean.valueOf(Boolean.TRUE.equals(obj)));
        return true;
    }
}
