package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class CapturePhoto extends FragmentActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "nB\u001cx*\u007fF\u001cd0yLCh:~W\u001ec&";
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
                        i3 = 13;
                        break;
                    case at.g /*1*/:
                        i3 = 35;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 12;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "lM\b~0dGBa:iJ\r\">nW\u0005c1#j!M\u0018H|/M\u000fYv>I";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "nB\u001cx*\u007fF\u001cd0yLCo-hB\u0018i";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "bV\u0018|*y";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[3]);
        super.onCreate(bundle);
        if (bundle == null) {
            a();
        }
    }

    private void a() {
        if (RequestPermissionActivity.a((Activity) this, 30)) {
            startActivityForResult(new Intent(z[2]).putExtra(z[1], Uri.fromFile(r.a())), 1);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        switch (i) {
            case at.g /*1*/:
                setResult(i2, intent);
                finish();
                if (!z) {
                    return;
                }
                break;
            case arj.Theme_actionModeSplitBackground /*30*/:
                break;
        }
        if (i2 == -1) {
            a();
            if (!z) {
                return;
            }
        }
        finish();
        if (z) {
            super.onActivityResult(i, i2, intent);
        }
    }
}
