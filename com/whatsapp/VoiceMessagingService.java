package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class VoiceMessagingService extends SearchActionVerificationClientService {
    private static final String[] z;

    static {
        String[] strArr = new String[10];
        String str = "&\u0004)8~.\u000ec#\u007f3\u000f#>?\"\u001298pi>\b\u0012E";
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
                        i3 = 71;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 77;
                        break;
                    case at.o /*3*/:
                        i3 = 74;
                        break;
                    default:
                        i3 = 17;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ".\r#%c.\u0004*jg(\u0003./1*\u000f>9p \u000fm=x3\u0002m/|7\u001e4jr(\u00049/\u007f3\u0019vj{.\u000ep";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ".\r#%c.\u0004*jg(\u0003./1*\u000f>9p \u000fm.x5\u000f.>t#J,>1.\u0004;+}.\u000em x#Qm x#W";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ".\r#%c.\u0004*jg(\u0003./1*\u000f>9p \u000fm.d\"J9%1\u0013\u0005\u001ejd7\u000e,>tg\u00199+e\"";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0007\u0019c=y&\u001e>+a7D#/e";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "|J9/i3W";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "|J9/i3W";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "$\u0005 dv(\u0005*&ti\u000b#.c(\u0003)dg(\u0003./b\"\u000b?)yi\u000f5>c&D\u001f\u000fR\u000e:\u0004\u000f_\u00135\u000e\u0005_\u0013+\u000e\u001eN\u0004\"\f\u001eN\u000e.";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "4\u000f#.x)\rm<t5\u0003+#t#J;%x$\u000fm't4\u0019,-t|J'#uz";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ".\r#%c.\u0004*jd)\u001c(8x!\u0003(.11\u0005$)tg\u0007(9b&\r(";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean performAction(Intent intent, boolean z, Bundle bundle) {
        if (z) {
            String stringExtra = intent.getStringExtra(z[0]);
            String stringExtra2 = intent.getStringExtra(z[8]);
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
                Log.w(z[2] + stringExtra2 + z[7] + stringExtra);
                return false;
            } else if (!stringExtra2.endsWith(z[5])) {
                Log.w(z[3] + stringExtra2 + z[6] + stringExtra);
                return false;
            } else if (vh.j(this)) {
                Log.i(z[9] + stringExtra2);
                App.a(App.as.b(stringExtra2), stringExtra);
                return true;
            } else {
                Log.i(z[4]);
                return false;
            }
        }
        Log.w(z[1]);
        return false;
    }
}
