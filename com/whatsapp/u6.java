package com.whatsapp;

import com.whatsapp.protocol.bz;
import org.v;
import org.whispersystems.at;

final class u6 implements Runnable {
    private static final String[] z;
    private final byte[] a;
    private final bz[] b;
    private final bz c;
    final dt d;
    private final int e;
    private final boolean f;

    static {
        String[] strArr = new String[4];
        String str = "\u001cw?{`\tcpdj\u0013k9yh]}5c}\u0004/\"rl\u0018f c4]b5d|\u001ch59d\u0018vm";
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
                        i3 = 125;
                        break;
                    case at.g /*1*/:
                        i3 = 15;
                        break;
                    case at.i /*2*/:
                        i3 = 80;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 15;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001cw?{`\tcpyj\u0018k#7{\u0012/#ra\u0019/\"r{\u000fvpej\u001ej9g{F/=r|\u000en7r!\u0016j)*";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "F/<xl\u001cc\u0002rh\u0014|$en\tf?yF\u00192";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001cw?{`\tcpdj\u0013k9yh]c?tn\u0011/ ej]d5n|]{?7|\u0018}&r}F/<xl\u001cc\u0002rh\u0014|$en\tf?yF\u00192";
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
        r6 = this;
        r5 = 1;
        r0 = r6.d;
        r0 = com.whatsapp.dt.a(r0);
        r0 = r0.b();
        if (r0 == 0) goto L_0x00b1;
    L_0x000d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r6.d;
        r1 = com.whatsapp.dt.a(r1);
        r1 = r1.k;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r6.e;
        r0 = org.whispersystems.aw.c(r0);
        r1 = r6.f;
        if (r1 == 0) goto L_0x0060;
    L_0x0038:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r5];
        r1 = r1.append(r2);
        r2 = r6.e;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r6.a;
        r2 = 5;
        r3 = r6.b;
        r4 = r6.c;
        com.whatsapp.App.a(r1, r0, r2, r3, r4);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x006d;
    L_0x0060:
        r1 = r6.d;
        r1 = com.whatsapp.dt.a(r1);
        r1 = r1.C;
        if (r1 <= r5) goto L_0x006d;
    L_0x006a:
        com.whatsapp.App.aP();
    L_0x006d:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r6.d;
        r2 = com.whatsapp.dt.a(r2);
        r2 = r2.k;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r6.e;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r6.d;
        r1 = com.whatsapp.dt.a(r1);
        r2 = r6.d;
        r2 = com.whatsapp.dt.a(r2);
        r2 = r2.C;
        r2 = r2 + 1;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r0, r3);
    L_0x00b1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.u6.run():void");
    }

    u6(dt dtVar) {
        this.d = dtVar;
        this.f = adn.b(dtVar.b).h();
        this.e = adn.b(dtVar.b).a();
        this.a = adn.b(dtVar.b).f();
        this.b = adn.b(dtVar.b).g();
        this.c = adn.b(dtVar.b).i().b();
    }
}
