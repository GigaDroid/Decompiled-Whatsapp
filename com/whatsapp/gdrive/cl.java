package com.whatsapp.gdrive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class cl implements OnClickListener {
    private static final String[] z;
    final SettingsGoogleDrive a;

    static {
        String[] strArr = new String[5];
        String str = "f_w0\u0011";
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
                        i3 = 18;
                        break;
                    case at.g /*1*/:
                        i3 = 54;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 92;
                        break;
                    default:
                        i3 = 116;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "aSw(\u001d|Qpq\u0013vDj*\u0011=Ek3\u0003?Pq9\u0005?Fq9\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "{Bf1\u0007";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "v_b0\u001buij8";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "aSo9\u0017fSg\u0003\u001dfSn\u0003\u001d|Rf$";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    cl(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }

    public void onClick(View view) {
        Log.i(z[2]);
        Fragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(z[4], 10);
        bundle.putString(z[0], this.a.getString(2131231941));
        bundle.putStringArray(z[3], SettingsGoogleDrive.i(this.a));
        bundle.putInt(z[1], SettingsGoogleDrive.f(this.a));
        singleChoiceListDialogFragment.setArguments(bundle);
        if (!fn.a(this.a)) {
            FragmentTransaction beginTransaction = this.a.getSupportFragmentManager().beginTransaction();
            beginTransaction.add(singleChoiceListDialogFragment, null);
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
