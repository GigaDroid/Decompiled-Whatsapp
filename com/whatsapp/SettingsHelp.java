package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import org.v;
import org.whispersystems.at;

public class SettingsHelp extends DialogToastPreferenceActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "1\u0003]\t";
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
                        i3 = 89;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 49;
                        break;
                    case at.o /*3*/:
                        i3 = 121;
                        break;
                    default:
                        i3 = 7;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "*\u001fB\rb49B\rf-\u0013B";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "-\u0003C\u0014t\u0006\u0007_\u001dX)\u0014X\u000ff:\u001fn\th5\u000fR\u0000";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "8\u0004^\fs";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ":\t_\rf:\u0012n\ft";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Dialog onCreateDialog(int i) {
        Dialog ueVar;
        switch (i) {
            case arj.Theme_buttonStyleSmall /*101*/:
                ueVar = new ue(this);
                ueVar.setTitle(getString(2131231814));
                ueVar.setMessage(getString(2131231813));
                ueVar.setIndeterminate(true);
                ueVar.setCancelable(false);
                return ueVar;
            case arj.Theme_checkboxStyle /*102*/:
                return new Builder(this).setTitle(2131231558).setMessage(getString(2131231760, new Object[]{getString(2131230939)})).setPositiveButton(2131231580, new ami(this)).create();
            case 122:
                ueVar = new ProgressDialog(this);
                ueVar.setMessage(getString(2131231749));
                ueVar.setIndeterminate(true);
                ueVar.setCancelable(false);
                return ueVar;
            case 123:
                return new Builder(this).setMessage(2131231979).setPositiveButton(2131231582, new gr(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(2131099660);
        findPreference(z[4]).setOnPreferenceClickListener(new f1(this));
        findPreference(z[0]).setOnPreferenceClickListener(new aqf(this));
        findPreference(z[2]).setOnPreferenceClickListener(new atj(this));
        findPreference(z[3]).setOnPreferenceClickListener(new aoq(this));
        findPreference(z[1]).setOnPreferenceClickListener(new aut(this));
    }
}
