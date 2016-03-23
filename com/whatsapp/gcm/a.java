package com.whatsapp.gcm;

import android.content.Context;
import com.whatsapp.a47;
import com.whatsapp.a_3;
import com.whatsapp.amm;
import com.whatsapp.arj;
import com.whatsapp.fieldstats.be;
import com.whatsapp.fieldstats.i;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class a {
    private static final String[] z;

    static {
        String[] strArr = new String[10];
        String str = "*\u0019\u0001KB^O\tTCx]\t\u001b";
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
                        i3 = 17;
                        break;
                    case at.g /*1*/:
                        i3 = 57;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 38;
                        break;
                    default:
                        i3 = 49;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "Ru)gc";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "*\u0019\u0005V\f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "*\u0019\u0018U\f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "ME";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "*\u0019\nDXaJQ";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "r\u000b\bK\u001e|T\u001fy^g\\\u001eTXu\\CO_gX\u0000OUNV\u001aCCcP\bC\u000b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "r\u000b\bK\u001e|T\u001fy^g\\\u001eTXu\\CO_gX\u0000OUNW\u0019KStK\u001f\u001c";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "xW\u001aG]x]LRX|\\\u001fRP|ILTTr\\\u0005PTu\u0019\u0005H\u0011r\u000b\bK\u0011aL\u001fN\u000b1";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Vz!\u0006AdJ\u0004\u0006CtZ\tOGt]W\u0006Xu\u0004";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
        r6 = com.whatsapp.gcm.RegistrationIntentService.b;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00c3 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x00c3 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x00c3 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.append(r8);	 Catch:{ NumberFormatException -> 0x00c3 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x00c3 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.append(r9);	 Catch:{ NumberFormatException -> 0x00c3 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x00c3 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.append(r10);	 Catch:{ NumberFormatException -> 0x00c3 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x00c3 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.append(r11);	 Catch:{ NumberFormatException -> 0x00c3 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x00c3 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.append(r12);	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x00c3 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = 0;
        com.whatsapp.App.a(r7, r0);	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = 1;
        com.whatsapp.App.ao = r0;	 Catch:{ NumberFormatException -> 0x00c3 }
        r0 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NumberFormatException -> 0x00c3 }
        com.whatsapp.App.aU = r0;	 Catch:{ NumberFormatException -> 0x00c3 }
        if (r13 == 0) goto L_0x006a;
    L_0x005e:
        r0 = android.text.TextUtils.isEmpty(r10);	 Catch:{ NumberFormatException -> 0x00c3 }
        if (r0 != 0) goto L_0x006a;
    L_0x0064:
        a(r7, r10);	 Catch:{ NumberFormatException -> 0x00c5 }
        com.whatsapp.gcm.experiment.d.a(r10);	 Catch:{ NumberFormatException -> 0x00c5 }
    L_0x006a:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00c7 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00c7 }
        r0 = r0.equalsIgnoreCase(r11);	 Catch:{ NumberFormatException -> 0x00c7 }
        if (r0 == 0) goto L_0x007d;
    L_0x0075:
        r0 = 0;
        r2 = 0;
        com.whatsapp.App.a(r7, r0, r2);	 Catch:{ NumberFormatException -> 0x00c7 }
        if (r6 == 0) goto L_0x00a9;
    L_0x007d:
        r0 = android.text.TextUtils.isEmpty(r11);	 Catch:{ NumberFormatException -> 0x00c9 }
        if (r0 != 0) goto L_0x00a9;
    L_0x0083:
        r0 = z;
        r1 = 5;
        r0 = r0[r1];
        r1 = 3;
        r0 = r11.split(r0, r1);
        r1 = r0.length;
        r2 = 3;
        if (r1 != r2) goto L_0x00e8;
    L_0x0091:
        r1 = 1;
        r1 = r0[r1];	 Catch:{ NumberFormatException -> 0x00cb }
        r2 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x00cb }
        r1 = 2;
        r1 = r0[r1];	 Catch:{ NumberFormatException -> 0x00cb }
        r4 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x00cb }
        r2 = r2 + r4;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r4;
        r1 = 0;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00cb }
        com.whatsapp.App.a(r7, r0, r2);	 Catch:{ NumberFormatException -> 0x00cb }
    L_0x00a9:
        if (r12 == 0) goto L_0x0106;
    L_0x00ab:
        r0 = ",";
        r5 = r12.split(r0);	 Catch:{ NumberFormatException -> 0x0104 }
    L_0x00b2:
        r1 = 1;
        r2 = 1;
        r3 = 1;
        r0 = r7;
        r4 = r9;
        com.whatsapp.messaging.MessageService.a(r0, r1, r2, r3, r4, r5);	 Catch:{ NumberFormatException -> 0x0108 }
        r0 = com.whatsapp.WAAppCompatActivity.c;	 Catch:{ NumberFormatException -> 0x0108 }
        if (r0 == 0) goto L_0x00c2;
    L_0x00be:
        r0 = r6 + 1;
        com.whatsapp.gcm.RegistrationIntentService.b = r0;	 Catch:{ NumberFormatException -> 0x0108 }
    L_0x00c2:
        return;
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0102 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0102 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x0102 }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0102 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0102 }
        r0 = r0.append(r11);	 Catch:{ NumberFormatException -> 0x0102 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0102 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0102 }
        if (r6 == 0) goto L_0x00a9;
    L_0x00e8:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0102 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0102 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x0102 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0102 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0102 }
        r0 = r0.append(r11);	 Catch:{ NumberFormatException -> 0x0102 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0102 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0102 }
        goto L_0x00a9;
    L_0x0102:
        r0 = move-exception;
        throw r0;
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r5 = 0;
        goto L_0x00b2;
    L_0x0108:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gcm.a.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    private static void a(Context context, String str) {
        try {
            long parseLong = Long.parseLong(str) * 1000;
            amm com_whatsapp_amm = (amm) h.b().b(amm.class);
            a_3 com_whatsapp_a_3 = (a_3) h.b().b(a_3.class);
            a47 com_whatsapp_a47 = (a47) h.b().b(a47.class);
            av beVar = new be();
            long a = com_whatsapp_amm.a();
            try {
                Double valueOf;
                beVar.c = Double.valueOf((double) (a - parseLong));
                beVar.a = Double.valueOf((double) (a - com_whatsapp_a_3.c));
                if (com_whatsapp_a47.a) {
                    valueOf = Double.valueOf(1.0d);
                } else {
                    valueOf = Double.valueOf(0.0d);
                }
                beVar.b = valueOf;
                i.a(context, beVar);
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            Log.e(z[9] + str);
        }
    }
}
