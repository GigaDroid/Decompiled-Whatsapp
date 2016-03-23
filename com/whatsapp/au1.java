package com.whatsapp;

import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.ct;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class au1 implements Runnable {
    private static final String[] z;
    final c3 a;
    final ct b;
    final adn c;

    static {
        String[] strArr = new String[12];
        String str = "Pl\u0001M=ExNE7]q\u001aH<V4\u001dD!B}\u0001O!\u0011r\u0001Sr";
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
                        i3 = 49;
                        break;
                    case at.g /*1*/:
                        i3 = 20;
                        break;
                    case at.i /*2*/:
                        i3 = 110;
                        break;
                    case at.o /*3*/:
                        i3 = 33;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "Tz\rS+A`1T ]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Tz\rS+A`1M=Ru\u001aH=_";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "Tz\rS+A`1W`";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Tz\rS+A`1C>Xg\u001a";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Tz\rS+A`1F ^a\u001e~5Tz\\";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Tz\rS+A`1H?Ps\u000b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "Tz\rS+A`1B=_`\u000fB&";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Tz\rS+A`1@'U}\u0001";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Tz\rS+A`1W;Uq\u0001";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0011p\u001bDrE{NR7Cb\u000bSrAx\u000fH<Eq\u0016UrCq\rD;A`NG=C4";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "U{\rT?Tz\u001a";
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
        r7 = this;
        r3 = 0;
        r2 = 1;
        r0 = r7.a;
        r0 = r0.c;
        r0 = com.whatsapp.qm.i(r0);
        r1 = r7.a;
        r1 = r1.c;
        r1 = com.whatsapp.protocol.co.a(r1);
        if (r0 != 0) goto L_0x0016;
    L_0x0014:
        if (r1 == 0) goto L_0x001e;
    L_0x0016:
        r0 = r7.b;
        r0 = r0.d;
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0022;
    L_0x001e:
        r0 = r7.a;
        r0 = r0.c;
    L_0x0022:
        r1 = com.whatsapp.App.aK;
        r4 = r7.a;
        r4 = r4.c;
        r1 = r1.F(r4);
        if (r1 == 0) goto L_0x015d;
    L_0x002e:
        r1 = r2;
    L_0x002f:
        r4 = com.whatsapp.awc.e(r0);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r3 = r6[r3];
        r3 = r5.append(r3);
        r3 = r3.append(r4);
        r5 = z;
        r6 = 11;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r5 = r7.a;
        r3 = r3.append(r5);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = r7.c;
        r3 = com.whatsapp.adn.b(r3);
        r5 = r4.b();
        r3.b(r5);
        r3 = r7.c;
        r3 = com.whatsapp.adn.b(r3);
        r4 = r4.b();
        r5 = 0;
        r3.a(r4, r5);
        r3 = new android.support.v4.util.ArrayMap;
        r3.<init>(r2);
        r4 = new java.util.Vector;
        r5 = 15;
        r4.<init>(r5);
        r5 = new com.whatsapp.protocol.ce;
        r6 = z;
        r2 = r6[r2];
        r6 = com.whatsapp.air.NONE;
        r6 = r6.getText();
        r5.<init>(r2, r6);
        r4.add(r5);
        r2 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 9;
        r5 = r5[r6];
        r6 = com.whatsapp.a3m.NONE;
        r6 = r6.getText();
        r2.<init>(r5, r6);
        r4.add(r2);
        r2 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 5;
        r5 = r5[r6];
        r6 = com.whatsapp.a5i.NONE;
        r6 = r6.getText();
        r2.<init>(r5, r6);
        r4.add(r2);
        r2 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 8;
        r5 = r5[r6];
        r6 = com.whatsapp.a2t.NONE;
        r6 = r6.getText();
        r2.<init>(r5, r6);
        r4.add(r2);
        r2 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 6;
        r5 = r5[r6];
        r6 = com.whatsapp.ao4.NONE;
        r6 = r6.getText();
        r2.<init>(r5, r6);
        r4.add(r2);
        r2 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 7;
        r5 = r5[r6];
        r6 = com.whatsapp.tq.NONE;
        r6 = r6.getText();
        r2.<init>(r5, r6);
        r4.add(r2);
        r2 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 3;
        r5 = r5[r6];
        r6 = com.whatsapp.asu.NONE;
        r6 = r6.getText();
        r2.<init>(r5, r6);
        r4.add(r2);
        r2 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 2;
        r5 = r5[r6];
        r6 = com.whatsapp.uq.NONE;
        r6 = r6.getText();
        r2.<init>(r5, r6);
        r4.add(r2);
        r2 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 4;
        r5 = r5[r6];
        r6 = com.whatsapp.ms.NONE;
        r6 = r6.getText();
        r2.<init>(r5, r6);
        r4.add(r2);
        r2 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 10;
        r5 = r5[r6];
        r6 = com.whatsapp.a3m.NONE;
        r6 = r6.getText();
        r2.<init>(r5, r6);
        r4.add(r2);
        r3.put(r0, r4);
        r2 = com.whatsapp.App.as;
        r2.a(r3);
        r2 = r7.c;
        r2 = com.whatsapp.adn.c(r2);
        r2 = r2.M();
        r3 = new com.whatsapp._f;
        r3.<init>(r7, r1, r0);
        r2.post(r3);
        return;
    L_0x015d:
        r1 = r3;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.au1.run():void");
    }

    au1(adn com_whatsapp_adn, c3 c3Var, ct ctVar) {
        this.c = com_whatsapp_adn;
        this.a = c3Var;
        this.b = ctVar;
    }
}
