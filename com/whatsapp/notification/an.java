package com.whatsapp.notification;

import android.content.Context;
import com.whatsapp.App;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public abstract class an {
    public static boolean a;
    private static final an b;
    private static an c;
    private static final an[] d;
    private static final String[] z;

    public abstract List a();

    public abstract void a(int i);

    String c() {
        return App.z().getPackageName();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.notification.an a(android.content.Context r9) {
        /*
        r1 = 0;
        r2 = a;
        r0 = c;	 Catch:{ Exception -> 0x000a }
        if (r0 == 0) goto L_0x000c;
    L_0x0007:
        r0 = c;	 Catch:{ Exception -> 0x000a }
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r0 = android.os.Build.MANUFACTURER;	 Catch:{ Exception -> 0x00d2 }
        r3 = z;	 Catch:{ Exception -> 0x00d2 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ Exception -> 0x00d2 }
        r0 = r0.equalsIgnoreCase(r3);	 Catch:{ Exception -> 0x00d2 }
        if (r0 == 0) goto L_0x0022;
    L_0x0019:
        r0 = new com.whatsapp.notification.a_;	 Catch:{ Exception -> 0x00d2 }
        r0.<init>();	 Catch:{ Exception -> 0x00d2 }
        c = r0;	 Catch:{ Exception -> 0x00d2 }
        if (r2 == 0) goto L_0x00a9;
    L_0x0022:
        r0 = new android.content.Intent;	 Catch:{ Exception -> 0x00d8 }
        r3 = z;	 Catch:{ Exception -> 0x00d8 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ Exception -> 0x00d8 }
        r0.<init>(r3);	 Catch:{ Exception -> 0x00d8 }
        r3 = z;	 Catch:{ Exception -> 0x00d8 }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ Exception -> 0x00d8 }
        r0.addCategory(r3);	 Catch:{ Exception -> 0x00d8 }
        r3 = r9.getPackageManager();	 Catch:{ Exception -> 0x00d8 }
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r3.queryIntentActivities(r0, r4);	 Catch:{ Exception -> 0x00d8 }
        if (r0 == 0) goto L_0x0091;
    L_0x0040:
        r3 = r0.iterator();	 Catch:{ Exception -> 0x00d8 }
    L_0x0044:
        r0 = r3.hasNext();	 Catch:{ Exception -> 0x00d8 }
        if (r0 == 0) goto L_0x008f;
    L_0x004a:
        r0 = r3.next();	 Catch:{ Exception -> 0x00d8 }
        r0 = (android.content.pm.ResolveInfo) r0;	 Catch:{ Exception -> 0x00d8 }
        r0 = r0.activityInfo;	 Catch:{ Exception -> 0x00d8 }
        r4 = r0.packageName;	 Catch:{ Exception -> 0x00d8 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00d8 }
        r0.<init>();	 Catch:{ Exception -> 0x00d8 }
        r5 = z;	 Catch:{ Exception -> 0x00d8 }
        r6 = 4;
        r5 = r5[r6];	 Catch:{ Exception -> 0x00d8 }
        r0 = r0.append(r5);	 Catch:{ Exception -> 0x00d8 }
        r0 = r0.append(r4);	 Catch:{ Exception -> 0x00d8 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00d8 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00d8 }
        r5 = d;	 Catch:{ Exception -> 0x00d8 }
        r6 = r5.length;	 Catch:{ Exception -> 0x00d8 }
        r0 = r1;
    L_0x0071:
        if (r0 >= r6) goto L_0x0087;
    L_0x0073:
        r7 = r5[r0];	 Catch:{ Exception -> 0x00d8 }
        r8 = r7.a();	 Catch:{ Exception -> 0x00d4 }
        r8 = r8.contains(r4);	 Catch:{ Exception -> 0x00d4 }
        if (r8 == 0) goto L_0x0083;
    L_0x007f:
        c = r7;	 Catch:{ Exception -> 0x00d4 }
        if (r2 == 0) goto L_0x0087;
    L_0x0083:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0071;
    L_0x0087:
        r0 = c;	 Catch:{ Exception -> 0x00f7 }
        if (r0 == 0) goto L_0x008d;
    L_0x008b:
        if (r2 == 0) goto L_0x008f;
    L_0x008d:
        if (r2 == 0) goto L_0x0044;
    L_0x008f:
        if (r2 == 0) goto L_0x0099;
    L_0x0091:
        r0 = z;	 Catch:{ Exception -> 0x00fb }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00fb }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x00fb }
    L_0x0099:
        r0 = c;	 Catch:{ Exception -> 0x00fd }
        if (r0 != 0) goto L_0x00a9;
    L_0x009d:
        r0 = z;	 Catch:{ Exception -> 0x00fd }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00fd }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00fd }
        r0 = b;	 Catch:{ Exception -> 0x00fd }
        c = r0;	 Catch:{ Exception -> 0x00fd }
    L_0x00a9:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = d;
        r1 = java.util.Arrays.asList(r1);
        r2 = c;
        r1 = r1.indexOf(r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = c;
        goto L_0x0009;
    L_0x00d2:
        r0 = move-exception;
        throw r0;
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.getMessage();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0099;
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00f9 }
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00d8 }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00d8 }
    L_0x00fd:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.an.a(android.content.Context):com.whatsapp.notification.an");
    }

    String b() {
        return z[8];
    }

    public static boolean a(an anVar) {
        return (anVar == null || anVar == b) ? false : true;
    }

    static {
        String[] strArr = new String[9];
        String str = "U`PS*E.Z['XlQ";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 55;
                        break;
                    case at.g /*1*/:
                        i4 = 1;
                        break;
                    case at.i /*2*/:
                        i4 = 52;
                        break;
                    case at.o /*3*/:
                        i4 = 52;
                        break;
                    default:
                        i4 = 79;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "ohU[\"^";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "U`PS*E.SQ;U`PS*E!";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "U`PS*E.\\[\"RqUW$VfQ\u001b";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "U`PS*E.SQ;U`PS*E!";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "VoPF ^e\u001a]!CdZ@aT`@Q(XsM\u001a\u0007xLq";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "U`PS*E.SQ;U`PS*E.Z[;QnAZ+";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "TnY\u001a8_`@G.Gq\u001ay.^o";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    b = new ad(null);
                    d = new an[]{new a_(), new ax(), new a2(), new au(), new as(), new am()};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "VoPF ^e\u001a]!CdZ@aVb@] Y/yu\u0006y";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    Context d() {
        return App.z();
    }
}
