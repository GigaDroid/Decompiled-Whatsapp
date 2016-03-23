package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class _f implements Runnable {
    private static final String[] z;
    final au1 a;
    final boolean b;
    final String c;

    static {
        String[] strArr = new String[10];
        String str = "sT4j=f@{a=f\f:&\"~M2h&wT/& wO>o\"f\f=t=\u007f\f(i?wC5creD4&!zC.j6|\u000b/&:sZ>& wO>o$wH{r:w\f4t;uE5g>2A>u!sK>(r{K5i {B<=raX:h(sg>\u007fo";
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
                        i3 = 18;
                        break;
                    case at.g /*1*/:
                        i3 = 44;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
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
                    str = "sT4j=f@{k;a_2h52A>u!sK>&6g^2h52\\7g;|X>~&2^>e7{\\/=raX:h(sg>\u007fo";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ")\f4t;uE5g>_I(u3uI\u0010c+/";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "2M(&?wH2gr`I/t+2H.crfC{h7wH2h52X4& wY+j=sH{k7vE:&3a\f.h7|O)\u007f\"fI?&6gI{r=2_>t$w^{v>sE5r7jX{t7qI2v&";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "sT4j=f@{t7aI5b;|K{";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "sT4j=f@{r wM/o<u\f";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "2H.crfC{u7`Z>trb@:o<fI#rr`I8c;bX";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "wB8t+bX2i<2E(&>}O0c62C5=rgB:d>w\f/iraI5brb@:o<fI#rrs_{t7cY>u&wH{d+2^>e7{\\/=raX:h(sg>\u007fo";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ")\f4t;uE5g>_I(u3uI\u0010c+/";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ")\f4t;uE5g>_I(u3uI\u0010c+/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    _f(au1 com_whatsapp_au1, boolean z, String str) {
        this.a = com_whatsapp_au1;
        this.b = z;
        this.c = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r9 = this;
        r3 = 0;
        r8 = 3;
        r7 = 2;
        r6 = 1;
        r5 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r9.a;
        r1 = r1.b;
        com.whatsapp.App.b(r1);
        r1 = com.whatsapp.App.aK;
        r2 = r9.a;
        r2 = r2.a;
        r1 = r1.a(r2);
        if (r1 == 0) goto L_0x00ce;
    L_0x001a:
        r2 = r9.b;
        if (r2 != 0) goto L_0x00ce;
    L_0x001e:
        r1.a(r3);
        r1.b(r3);
        r2 = com.whatsapp.App.as;
        r3 = r9.a;
        r3 = r3.a;
        r3 = r3.c;
        r4 = r1.g;
        r2 = r2.a(r3, r4);
        r3 = r9.c;
        r2 = r2.contains(r3);
        if (r2 != 0) goto L_0x006a;
    L_0x003a:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r3 = r9.a;
        r3 = r3.b;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.a;
        r3 = r3.a;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        if (r0 == 0) goto L_0x00cc;
    L_0x006a:
        r2 = r1.c;
        if (r2 == r7) goto L_0x0076;
    L_0x006e:
        r2 = r1.c;
        if (r2 == r6) goto L_0x0076;
    L_0x0072:
        r2 = r1.c;
        if (r2 != r8) goto L_0x00a1;
    L_0x0076:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.a;
        r3 = r3.a;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        com.whatsapp.App.a(r1, r5);
        if (r0 == 0) goto L_0x00cc;
    L_0x00a1:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.a;
        r3 = r3.a;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        com.whatsapp.App.a(r1, r5, r2);
    L_0x00cc:
        if (r0 == 0) goto L_0x014b;
    L_0x00ce:
        r1 = r9.b;
        if (r1 != 0) goto L_0x0100;
    L_0x00d2:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r7];
        r1 = r1.append(r2);
        r2 = r9.a;
        r2 = r2.b;
        r1 = r1.append(r2);
        r2 = z;
        r2 = r2[r6];
        r1 = r1.append(r2);
        r2 = r9.a;
        r2 = r2.a;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        if (r0 == 0) goto L_0x014b;
    L_0x0100:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r9.a;
        r1 = r1.b;
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r8];
        r0 = r0.append(r1);
        r1 = r9.a;
        r1 = r1.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = new com.whatsapp.fieldstats.bz;
        r0.<init>();
        r1 = com.whatsapp.fieldstats.b4.PLAINTEXT_RECEIPT;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.a = r1;
        r1 = r9.a;
        r1 = r1.c;
        r1 = com.whatsapp.adn.a(r1);
        com.whatsapp.fieldstats.i.a(r1, r0);
    L_0x014b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._f.run():void");
    }
}
