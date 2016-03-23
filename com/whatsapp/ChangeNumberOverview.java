package com.whatsapp;

import android.os.Bundle;
import com.whatsapp.fieldstats.k;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class ChangeNumberOverview extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "6~\u0005e60x\u0011f30d\u000b}4'`\rn&zr\u0001x%'y\u001d";
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
                        i3 = 85;
                        break;
                    case at.g /*1*/:
                        i3 = 22;
                        break;
                    case at.i /*2*/:
                        i3 = 100;
                        break;
                    case at.o /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = 81;
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
                    str = "6~\u0005e60x\u0011f30d\u000b}4'`\rn&zu\u0016n0!s";
                    obj = null;
            }
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(z[0]);
    }

    protected void onCreate(Bundle bundle) {
        Log.i(z[1]);
        super.onCreate(bundle);
        nf.a(k.CHANGE_NUMBER);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(2130903093);
        akz.a(this, getSupportActionBar(), getString(2131231548).toUpperCase(), new dn(this));
    }
}
