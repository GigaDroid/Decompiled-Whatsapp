package com.whatsapp;

import com.whatsapp.Voip.CallState;
import org.v;
import org.whispersystems.at;

class aqb implements Runnable {
    private static final String[] z;
    final VoipActivity a;
    final CallState b;

    static {
        String[] strArr = new String[3];
        String str = "\u0001\n&9v!\n&9\u0018\u0014\u0011&?0\u0003\u001c`*8\u001b\t\u001c=8\u0003\u0000\f!8\u0019\u0002*-y\u0004\u0011.=<WXri\u00178+\ni?\u001e\u000b&:1\u001e\u000b(i:\u0002\u0017=,7\u0003E.*-\u001e\u0013&= ";
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
                        i3 = 119;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.i /*2*/:
                        i3 = 79;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 89;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0014\u0004!i7\u0018\u0011o:1\u0018\u0012o*8\u001b\to/8\u001e\t*-y\u001a\u0000<:8\u0010\u0000o+<\u0014\u0004::<W\u0013  :\u0012E<,+\u0001\f,,y\u001e\u0016o',\u001b\ta";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0001\n&9v!\n&9\u0018\u0014\u0011&?0\u0003\u001c`*8\u001b\t\u001c=8\u0003\u0000\f!8\u0019\u0002*-y\u0004\u0011.=<WXri\u00178+\ni*\u001f\n8 7\u0010E;,!\u0003_o";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r4 = this;
        r3 = 1;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r4.b;
        r2 = com.whatsapp.Voip.CallState.NONE;
        if (r1 != r2) goto L_0x008f;
    L_0x0009:
        r1 = r4.a;
        com.whatsapp.VoipActivity.b(r1);
        r1 = r4.a;
        r1 = com.whatsapp.VoipActivity.h(r1);
        if (r1 == 0) goto L_0x0080;
    L_0x0016:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r4.a;
        r2 = com.whatsapp.VoipActivity.h(r2);
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r4.a;
        r1 = com.whatsapp.VoipActivity.c(r1);
        if (r1 == 0) goto L_0x0043;
    L_0x003c:
        r1 = r4.a;
        r1.k();
        if (r0 == 0) goto L_0x00a0;
    L_0x0043:
        r1 = com.whatsapp.App.ay();
        if (r1 == 0) goto L_0x005d;
    L_0x0049:
        r1 = com.whatsapp.App.z();
        r2 = r4.a;
        r2 = com.whatsapp.VoipActivity.h(r2);
        com.whatsapp.App.a(r1, r2, r3);
        r1 = r4.a;
        r1.finish();
        if (r0 == 0) goto L_0x00a0;
    L_0x005d:
        r1 = r4.a;
        r1 = com.whatsapp.VoipActivity.e(r1);
        if (r1 == 0) goto L_0x0076;
    L_0x0065:
        r1 = r4.a;
        r1 = com.whatsapp.VoipActivity.e(r1);
        r2 = r4.a;
        r2 = com.whatsapp.VoipActivity.h(r2);
        r1.a(r2);
        if (r0 == 0) goto L_0x00a0;
    L_0x0076:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
        if (r0 == 0) goto L_0x00a0;
    L_0x0080:
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = r4.a;
        r1.finish();
        if (r0 == 0) goto L_0x00a0;
    L_0x008f:
        r0 = r4.b;
        r1 = com.whatsapp.Voip.CallState.ACTIVE;
        if (r0 != r1) goto L_0x00a0;
    L_0x0095:
        r0 = r4.a;
        r0 = r0.getWindow();
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0.clearFlags(r1);
    L_0x00a0:
        r0 = r4.a;
        com.whatsapp.VoipActivity.f(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aqb.run():void");
    }

    aqb(VoipActivity voipActivity, CallState callState) {
        this.a = voipActivity;
        this.b = callState;
    }
}
