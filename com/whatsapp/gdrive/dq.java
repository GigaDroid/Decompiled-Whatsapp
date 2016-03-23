package com.whatsapp.gdrive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class dq implements OnClickListener {
    private static final String[] z;
    final SettingsGoogleDrive a;

    static {
        String[] strArr = new String[4];
        String str = "k^>\u0018[rG(.MnE9\u001eA";
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
                        i3 = 27;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 77;
                        break;
                    case at.o /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 47;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "vT>\u0002N|T";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "uT*\u0010[rG(.MnE9\u001eA";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007fX,\u001d@|n$\u0015";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        Fragment promptDialogFragment = new PromptDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(z[1], 12);
        bundle.putString(z[2], this.a.getString(2131231195));
        bundle.putString(z[0], this.a.getString(2131232028));
        bundle.putString(z[3], this.a.getString(2131230884));
        promptDialogFragment.setArguments(bundle);
        FragmentTransaction beginTransaction = this.a.getSupportFragmentManager().beginTransaction();
        beginTransaction.add(promptDialogFragment, null);
        beginTransaction.commitAllowingStateLoss();
    }

    dq(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }
}
