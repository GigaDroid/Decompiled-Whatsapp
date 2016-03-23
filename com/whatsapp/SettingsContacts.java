package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.at;

public class SettingsContacts extends DialogToastPreferenceActivity {
    private static final String[] z;
    private CheckBoxPreference i;

    static {
        String[] strArr = new String[2];
        String str = "\"\u0000C\u0001E7:I\u001fs3\u000bK";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 86;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.i /*2*/:
                        i3 = 47;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "%\r@\u001aE7\tC2y9\u000b[\fy\"\u0016";
                    obj = null;
            }
        }
    }

    static CheckBoxPreference a(SettingsContacts settingsContacts) {
        return settingsContacts.i;
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131231813));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            default:
                return super.onCreateDialog(i);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(2131099657);
        findPreference(z[0]).setOnPreferenceClickListener(new im(this));
        this.i = (CheckBoxPreference) findPreference(z[1]);
        this.i.setOnPreferenceClickListener(new an0(this));
    }
}
