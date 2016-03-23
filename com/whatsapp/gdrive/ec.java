package com.whatsapp.gdrive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ec implements OnClickListener {
    private static final String[] z;
    final SettingsGoogleDrive a;

    static {
        String[] strArr = new String[5];
        String str = "\f1,7\u0007\u000f\u0007$?";
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
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 88;
                        break;
                    case at.i /*2*/:
                        i3 = 77;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001b=9/\u0001\u0006?>v\u000f\f*$-\rG+%4\u001fE6(/\u001f\u0007*&v\u0018\u001a=+";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001c197\r";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u001b=!>\u000b\u001c=)\u0004\u0001\u001c= \u0004\u0001\u0006<(#";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0001,(6\u001b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ec(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }

    public void onClick(View view) {
        Log.i(z[2]);
        Fragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(z[0], 11);
        bundle.putString(z[3], this.a.getString(2131231952));
        bundle.putStringArray(z[1], this.a.getResources().getStringArray(2131689485));
        bundle.putInt(z[4], GoogleDriveService.j());
        singleChoiceListDialogFragment.setArguments(bundle);
        if (!fn.a(this.a)) {
            FragmentTransaction beginTransaction = this.a.getSupportFragmentManager().beginTransaction();
            beginTransaction.add(singleChoiceListDialogFragment, null);
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
