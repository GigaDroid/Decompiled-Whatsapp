package com.whatsapp.messaging;

import android.view.View.OnClickListener;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class bw implements OnClickListener {
    private static final String[] z;
    final String a;
    final int b;
    final CaptivePortalActivity c;

    static {
        String[] strArr = new String[9];
        String str = "r\t\u0016{\u001b`\u0012\rr\u00194\u0011\rz\u00174\b\u0001h\t{\u0014\u000f<";
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
                        i3 = 20;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 100;
                        break;
                    case at.o /*3*/:
                        i3 = 28;
                        break;
                    default:
                        i3 = 126;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "r\u0007\rp\u001bpF\u0010s^p\u000f\u0017\u007f\u0011z\b\u0001\u007f\n4\u0000\u0016s\u00134\u0011\rz\u00174\b\u0001h\t{\u0014\u000f<";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "4\b\u0005q\u001bpF";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "4\b\u0005q\u001bpF";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "c\u000f\u0002u";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "4\b\u0005q\u001bpF";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "f\u0003\ts\bqF\ny\nc\t\u0016w^r\u0007\rp\u001bpF\u0002s\f4\u0011\rz\u00174\b\u0001h\t{\u0014\u000f<";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "4\b\u0005q\u001bpF";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "g\u0007\u0012y^w\t\nz\u0017s\u0013\u0016}\n}\t\n<\u0018u\u000f\by\u001a4\u0000\u000bn^c\u000f\u0002u^z\u0003\u0010k\u0011f\rD";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    bw(CaptivePortalActivity captivePortalActivity, int i, String str) {
        this.c = captivePortalActivity;
        this.b = i;
        this.a = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.b;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r4.c;
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.net.wifi.WifiManager) r0;
        r1 = r4.b;
        r1 = r0.removeNetwork(r1);
        if (r1 != 0) goto L_0x006e;
    L_0x0040:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r4.b;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r4.a;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        r1 = com.whatsapp.messaging.co.a;
        if (r1 == 0) goto L_0x009e;
    L_0x006e:
        r1 = r0.saveConfiguration();
        if (r1 != 0) goto L_0x009e;
    L_0x0074:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r4.b;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r4.a;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
    L_0x009e:
        r0 = r0.disconnect();
        if (r0 != 0) goto L_0x00ce;
    L_0x00a4:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.b;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x00ce:
        r0 = r4.c;
        r0.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.bw.onClick(android.view.View):void");
    }
}
