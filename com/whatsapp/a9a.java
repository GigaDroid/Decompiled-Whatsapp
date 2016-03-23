package com.whatsapp;

import android.app.Activity;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class a9a extends a9z {
    private static final String[] G;
    final Conversation F;

    static {
        String[] strArr = new String[13];
        String str = "nylcbdy@yg";
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
                        i3 = 3;
                        break;
                    case at.g /*1*/:
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = 31;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 3;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "br{bljx1`fqqvcpjsq>QF_PBG\\]JTJL";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "br{bljx1`fqqvcpjsq>QF_PBG\\]JTJL";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "sym}\\gyqyboCrupp}xu\\jx";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "br{bljx1`fqqvcpjsq>QF][OF[HZBMBP@CWLN^WF";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "br{bljx1`fqqvcpjsq>TQUKU\\FDKUQM]SOPWSMQDF";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "gn~gbapzOjg";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "br{bljx1`fqqvcpjsq>QF_PBG\\]JTJL";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "nylcbdy@yg";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "sym}\\gyqyboCrupp}xu\\jx";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "sym}jpov\u007fmp";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "gn~gbapzOjgo";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    G = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "sym}jpov\u007fmp";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean b() {
        /*
        r13 = this;
        r12 = 2;
        r11 = 3;
        r1 = 1;
        r2 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.aO();
        if (r0 != 0) goto L_0x00d0;
    L_0x000c:
        r0 = r1;
    L_0x000d:
        r3 = r13.F;
        r5 = G;
        r5 = r5[r12];
        r3 = com.whatsapp.App.h(r3, r5);
        if (r3 == 0) goto L_0x00d3;
    L_0x0019:
        r3 = r1;
    L_0x001a:
        if (r3 == 0) goto L_0x0077;
    L_0x001c:
        if (r0 == 0) goto L_0x0077;
    L_0x001e:
        r5 = r13.F;
        r6 = new android.content.Intent;
        r7 = r13.F;
        r8 = com.whatsapp.RequestPermissionActivity.class;
        r6.<init>(r7, r8);
        r7 = G;
        r8 = 12;
        r7 = r7[r8];
        r8 = new int[r11];
        r8 = {2130839704, 2130839702, 2130839701};
        r6 = r6.putExtra(r7, r8);
        r7 = G;
        r7 = r7[r2];
        r8 = 2131231646; // 0x7f08039e float:1.8079379E38 double:1.0529683396E-314;
        r6 = r6.putExtra(r7, r8);
        r7 = G;
        r8 = 10;
        r7 = r7[r8];
        r8 = 2131231643; // 0x7f08039b float:1.8079373E38 double:1.052968338E-314;
        r6 = r6.putExtra(r7, r8);
        r7 = G;
        r8 = 11;
        r7 = r7[r8];
        r8 = new java.lang.String[r11];
        r9 = G;
        r10 = 8;
        r9 = r9[r10];
        r8[r2] = r9;
        r9 = G;
        r10 = 6;
        r9 = r9[r10];
        r8[r1] = r9;
        r9 = G;
        r10 = 5;
        r9 = r9[r10];
        r8[r12] = r9;
        r6 = r6.putExtra(r7, r8);
        r5.startActivity(r6);
        if (r4 == 0) goto L_0x00cb;
    L_0x0077:
        if (r0 == 0) goto L_0x0086;
    L_0x0079:
        r5 = r13.F;
        r6 = 2131231666; // 0x7f0803b2 float:1.807942E38 double:1.0529683495E-314;
        r7 = 2131231663; // 0x7f0803af float:1.8079413E38 double:1.052968348E-314;
        com.whatsapp.RequestPermissionActivity.a(r5, r6, r7);
        if (r4 == 0) goto L_0x00cb;
    L_0x0086:
        if (r3 == 0) goto L_0x00cb;
    L_0x0088:
        r4 = r13.F;
        r5 = new android.content.Intent;
        r6 = r13.F;
        r7 = com.whatsapp.RequestPermissionActivity.class;
        r5.<init>(r6, r7);
        r6 = G;
        r7 = 7;
        r6 = r6[r7];
        r7 = 2130839701; // 0x7f020895 float:1.728442E38 double:1.052774693E-314;
        r5 = r5.putExtra(r6, r7);
        r6 = G;
        r7 = 9;
        r6 = r6[r7];
        r7 = 2131231626; // 0x7f08038a float:1.8079338E38 double:1.0529683297E-314;
        r5 = r5.putExtra(r6, r7);
        r6 = G;
        r7 = 4;
        r6 = r6[r7];
        r7 = 2131231625; // 0x7f080389 float:1.8079336E38 double:1.052968329E-314;
        r5 = r5.putExtra(r6, r7);
        r6 = G;
        r6 = r6[r1];
        r7 = new java.lang.String[r1];
        r8 = G;
        r8 = r8[r11];
        r7[r2] = r8;
        r5 = r5.putExtra(r6, r7);
        r4.startActivity(r5);
    L_0x00cb:
        if (r3 != 0) goto L_0x00d6;
    L_0x00cd:
        if (r0 != 0) goto L_0x00d6;
    L_0x00cf:
        return r1;
    L_0x00d0:
        r0 = r2;
        goto L_0x000d;
    L_0x00d3:
        r3 = r2;
        goto L_0x001a;
    L_0x00d6:
        r1 = r2;
        goto L_0x00cf;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a9a.b():boolean");
    }

    a9a(Conversation conversation, Activity activity, by byVar) {
        this.F = conversation;
        super(activity, byVar);
    }

    public void j() {
        Conversation.G(this.F);
    }
}
