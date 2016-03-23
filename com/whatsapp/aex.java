package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.whatsapp.fieldstats.k;
import com.whatsapp.util.bq;

class aex implements OnPreferenceClickListener {
    final SettingsChat a;

    public boolean onPreferenceClick(Preference preference) {
        nf.a(k.BACKUP_CONVERSATIONS);
        if (App.a(SettingsChat.a(this.a))) {
            bq.a(new amh(this.a, new nd(this)), new Void[0]);
        }
        return true;
    }

    aex(SettingsChat settingsChat) {
        this.a = settingsChat;
    }
}
