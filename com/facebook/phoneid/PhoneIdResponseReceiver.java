package com.facebook.phoneid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.whatsapp.arj;
import com.whatsapp.auv;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public final class PhoneIdResponseReceiver extends BroadcastReceiver {
    private static final String[] z;
    @Nullable
    private final c a;
    @NonNull
    private final d b;

    static {
        String[] strArr = new String[6];
        String str = "%K\u0001t.%C\u0001a";
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
                        i3 = 81;
                        break;
                    case at.g /*1*/:
                        i3 = 34;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 17;
                        break;
                    default:
                        i3 = 93;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "#G\u000ft4'G\b1-9M\u0002t}8FLw/>OL";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "$L\u001fd>2G\u001fb;$NLa5>L\t145\u0002\u001dd8#[Le2q";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "$R\bp)4FLa5>L\t145\u0002\nc2<\u0002";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "qV\u00031";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "k\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public PhoneIdResponseReceiver(@NonNull d dVar, @Nullable c cVar) {
        this.b = (d) auv.a((Object) dVar);
        this.a = cVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (getResultCode() == -1) {
            e eVar = new e(getResultData(), getResultExtras(true).getLong(z[0], Long.MAX_VALUE));
            Log.d(z[2] + intent.getPackage() + z[1] + eVar);
            a(eVar, intent.getPackage());
            if (!e.a) {
                return;
            }
        }
        Log.d(z[3] + intent.getPackage());
    }

    private void a(e eVar, String str) {
        e a = this.b.a();
        if (eVar.c != null && eVar.b < a.b) {
            this.b.a(eVar);
            if (this.a != null) {
                this.a.a(a, eVar, str);
            }
            Log.i(z[4] + a + z[5] + eVar);
        }
    }
}
