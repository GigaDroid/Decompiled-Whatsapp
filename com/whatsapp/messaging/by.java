package com.whatsapp.messaging;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

@SuppressLint({"HandlerLeak"})
final class by extends Handler implements a8 {
    private static final String[] z;
    final ah a;

    static {
        String[] strArr = new String[16];
        String str = "8lYM\u001e#nGST#u@R_orLSUobFS_%b]\u0012";
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
                        i3 = 64;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = 41;
                        break;
                    case at.o /*3*/:
                        i3 = 61;
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
                    str = "!b]TG%^JR_.dJIX/o";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "0`ZNX6d\t";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "!wHT]!cEX";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "&`EQS!bBN";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "!b]TG%";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "0v";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ")qHYU2dZN";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "*hM";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "8lYM\u001e#nGST#u@R_osL^GobFS_%b]";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "!wHT]!cEX";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "&`EQS!bBN";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ")qHYU2dZN";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "0v";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "!b]TG%^JR_.dJIX/o";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "*hM";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public by(ah ahVar) {
        this.a = ahVar;
        super(ahVar.getLooper());
    }

    public void c() {
        obtainMessage(6).sendToTarget();
    }

    public void a(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        obtainMessage(1, i, 0).sendToTarget();
    }

    public void e() {
        obtainMessage(7).sendToTarget();
    }

    public void a() {
        obtainMessage(5).sendToTarget();
    }

    public void a(String str, byte[] bArr, String str2, boolean z, boolean z2, ArrayList arrayList) {
        String str3;
        StringBuilder append = new StringBuilder().append(z[0]);
        if (z2) {
            str3 = z[6];
        } else {
            str3 = z[3] + App.t(ah.b(this.a));
        }
        Log.i(append.append(str3).toString());
        Message obtainMessage = obtainMessage(0);
        Bundle data = obtainMessage.getData();
        data.putString(z[1], str);
        data.putByteArray(z[7], bArr);
        data.putString(z[8], str2);
        data.putBoolean(z[4], z);
        data.putBoolean(z[2], z2);
        data.putSerializable(z[5], arrayList);
        obtainMessage.sendToTarget();
    }

    public void a(Message message) {
        message.what = 3;
        sendMessage(message);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r12) {
        /*
        r11 = this;
        r7 = 1;
        r8 = com.whatsapp.messaging.co.a;
        r0 = r12.what;
        switch(r0) {
            case 0: goto L_0x0009;
            case 1: goto L_0x005b;
            case 2: goto L_0x0075;
            case 3: goto L_0x007c;
            case 4: goto L_0x0083;
            case 5: goto L_0x0067;
            case 6: goto L_0x006e;
            case 7: goto L_0x008a;
            default: goto L_0x0008;
        };
    L_0x0008:
        return;
    L_0x0009:
        r0 = z;
        r1 = 10;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r6 = r12.getData();
        r0 = r11.a;
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        r1 = r6.getString(r1);
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r2 = r6.getByteArray(r2);
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r3 = r6.getString(r3);
        r4 = z;
        r5 = 11;
        r4 = r4[r5];
        r4 = r6.getBoolean(r4);
        r5 = z;
        r9 = 15;
        r5 = r5[r9];
        r5 = r6.getBoolean(r5);
        r9 = z;
        r10 = 12;
        r9 = r9[r10];
        r6 = r6.getSerializable(r9);
        r6 = (java.util.ArrayList) r6;
        com.whatsapp.messaging.ah.a(r0, r1, r2, r3, r4, r5, r6);
        if (r8 == 0) goto L_0x0008;
    L_0x005b:
        r1 = r11.a;
        r0 = r12.arg1;
        if (r0 != r7) goto L_0x0091;
    L_0x0061:
        r0 = r7;
    L_0x0062:
        com.whatsapp.messaging.ah.a(r1, r0);
        if (r8 == 0) goto L_0x0008;
    L_0x0067:
        r0 = r11.a;
        com.whatsapp.messaging.ah.d(r0);
        if (r8 == 0) goto L_0x0008;
    L_0x006e:
        r0 = r11.a;
        com.whatsapp.messaging.ah.g(r0);
        if (r8 == 0) goto L_0x0008;
    L_0x0075:
        r0 = r11.a;
        com.whatsapp.messaging.ah.a(r0);
        if (r8 == 0) goto L_0x0008;
    L_0x007c:
        r0 = r11.a;
        com.whatsapp.messaging.ah.a(r0, r12);
        if (r8 == 0) goto L_0x0008;
    L_0x0083:
        r0 = r11.a;
        com.whatsapp.messaging.ah.e(r0);
        if (r8 == 0) goto L_0x0008;
    L_0x008a:
        r0 = r11.a;
        com.whatsapp.messaging.ah.h(r0);
        goto L_0x0008;
    L_0x0091:
        r0 = 0;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.by.handleMessage(android.os.Message):void");
    }

    public void b() {
        obtainMessage(4).sendToTarget();
    }

    public void d() {
        obtainMessage(2).sendToTarget();
    }
}
