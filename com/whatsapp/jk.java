package com.whatsapp;

import android.preference.CheckBoxPreference;
import android.preference.Preference.OnPreferenceClickListener;

class jk implements OnPreferenceClickListener {
    final SettingsChat a;
    final CheckBoxPreference b;

    jk(SettingsChat settingsChat, CheckBoxPreference checkBoxPreference) {
        this.a = settingsChat;
        this.b = checkBoxPreference;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceClick(android.preference.Preference r3) {
        /*
        r2 = this;
        r1 = 1;
        r0 = r2.b;
        r0 = r0.isChecked();
        if (r0 == 0) goto L_0x000f;
    L_0x0009:
        com.whatsapp.Conversation.G = r1;
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0012;
    L_0x000f:
        r0 = 0;
        com.whatsapp.Conversation.G = r0;
    L_0x0012:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jk.onPreferenceClick(android.preference.Preference):boolean");
    }
}
