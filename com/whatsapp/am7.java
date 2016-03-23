package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class am7 extends Handler {
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "qp\u0013t\u0011{e\u000e.\u0013so\u0013w\u0004;r\u001ds\u0015\u007fa\u0015q\u0000xvSd\u0013dm\u000e.";
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
                        i3 = 22;
                        break;
                    case at.g /*1*/:
                        i3 = 2;
                        break;
                    case at.i /*2*/:
                        i3 = 124;
                        break;
                    case at.o /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 97;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "qp\u0013t\u0011{e\u000e.\u0002yl\nd\u0013ec\bh\u000exqSm\u0004wt\u0019!\u0006dm\tq";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "qp\u0013t\u0011{e\u000e.\u0013so\u0013w\u0004;c\u0018l\bxqSd\u0013dm\u000e.";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "qp\u0013t\u0011{e\u000e.\u0000rfQq\u0000dv\u0015b\bfc\u0012uNsp\u000en\u00139";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "qp\u0013t\u0011{e\u000e.\twl\u0018m\u0004Ie\u000en\u0014fa\u0014`\u0015Iq\tc\u000bsa\b^\u0002~c\u0012f\u0004";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "qp\u0013t\u0011{e\u000e.\u0000rfQ`\u0005{k\u0012rNsp\u000en\u00139";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "qp\u0013t\u0011{e\u000e.\twl\u0018m\u0004Ic\u0018e>qp\u0013t\u0011uj\u001du>{q\u001b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "qp\u0013t\u0011{e\u000e.\twl\u0018m\u0004;k\u0012h\u0015;e\u000en\u0014f/\u001fi\u0000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r14) {
        /*
        r13 = this;
        r7 = 2131231139; // 0x7f0801a3 float:1.807835E38 double:1.052968089E-314;
        r12 = 2131231121; // 0x7f080191 float:1.8078314E38 double:1.05296808E-314;
        r11 = 2131231098; // 0x7f08017a float:1.8078267E38 double:1.052968069E-314;
        r10 = 1;
        r9 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r14.what;
        switch(r0) {
            case 0: goto L_0x0013;
            case 1: goto L_0x0025;
            case 2: goto L_0x003f;
            case 3: goto L_0x0050;
            case 4: goto L_0x006a;
            case 5: goto L_0x0073;
            case 6: goto L_0x00bb;
            case 7: goto L_0x00d3;
            case 8: goto L_0x0097;
            case 9: goto L_0x00ee;
            case 10: goto L_0x0106;
            case 11: goto L_0x0121;
            case 12: goto L_0x013c;
            case 13: goto L_0x015c;
            case 14: goto L_0x017c;
            case 15: goto L_0x019c;
            case 16: goto L_0x01b4;
            case 17: goto L_0x01cc;
            case 18: goto L_0x01e4;
            case 19: goto L_0x01fc;
            case 20: goto L_0x021c;
            case 21: goto L_0x0234;
            case 22: goto L_0x024c;
            case 23: goto L_0x0264;
            case 24: goto L_0x027c;
            case 25: goto L_0x0294;
            case 26: goto L_0x02ac;
            case 27: goto L_0x02c4;
            case 28: goto L_0x02dc;
            case 29: goto L_0x02f4;
            case 30: goto L_0x030c;
            case 31: goto L_0x0324;
            case 32: goto L_0x033c;
            case 33: goto L_0x0354;
            case 34: goto L_0x036c;
            case 35: goto L_0x0384;
            case 36: goto L_0x039c;
            case 37: goto L_0x0425;
            case 38: goto L_0x04ad;
            case 39: goto L_0x0536;
            default: goto L_0x0012;
        };
    L_0x0012:
        return;
    L_0x0013:
        r0 = z;
        r0 = r0[r10];
        com.whatsapp.util.Log.i(r0);
        r2 = com.whatsapp.App.aK;
        r0 = r14.obj;
        r0 = (com.whatsapp.protocol.co) r0;
        r2.a(r0);
        if (r1 == 0) goto L_0x0012;
    L_0x0025:
        r0 = z;
        r2 = 7;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r14.obj;
        r0 = (com.whatsapp.protocol.co) r0;
        r2 = com.whatsapp.App.aK;
        r2.a(r0);
        r0 = r0.k;
        r0 = r0.c;
        com.whatsapp.GroupChatInfo.n(r0);
        if (r1 == 0) goto L_0x0012;
    L_0x003f:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.n(r0);
        r0 = z;
        r2 = 2;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        if (r1 == 0) goto L_0x0012;
    L_0x0050:
        r0 = z;
        r2 = 5;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r14.obj;
        r0 = (com.whatsapp.protocol.co) r0;
        r2 = com.whatsapp.App.aK;
        r2.a(r0);
        r0 = r0.k;
        r0 = r0.c;
        com.whatsapp.GroupChatInfo.n(r0);
        if (r1 == 0) goto L_0x0012;
    L_0x006a:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.n(r0);
        if (r1 == 0) goto L_0x0012;
    L_0x0073:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r2 = com.whatsapp.App.z();
        r3 = com.whatsapp.App.z();
        r4 = 2131231141; // 0x7f0801a5 float:1.8078355E38 double:1.05296809E-314;
        r5 = new java.lang.Object[r10];
        r6 = com.whatsapp.App.as;
        r0 = r6.c(r0);
        r0 = r0.q;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.b(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0097:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r2 = com.whatsapp.App.z();
        r3 = com.whatsapp.App.z();
        r4 = 2131231141; // 0x7f0801a5 float:1.8078355E38 double:1.05296809E-314;
        r5 = new java.lang.Object[r10];
        r6 = com.whatsapp.App.as;
        r0 = r6.c(r0);
        r0 = r0.q;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.b(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x00bb:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.n(r0);
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getString(r7);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x00d3:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.n(r0);
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r3 = 2131231143; // 0x7f0801a7 float:1.8078359E38 double:1.052968091E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x00ee:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.n(r0);
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getString(r7);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0106:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.n(r0);
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r3 = 2131231143; // 0x7f0801a7 float:1.8078359E38 double:1.052968091E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0121:
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.GroupChatInfo.n(r0);
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r3 = 2131232084; // 0x7f080554 float:1.8080267E38 double:1.052968556E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.b(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x013c:
        r2 = com.whatsapp.App.z();
        r0 = com.whatsapp.App.z();
        r3 = r0.getResources();
        r4 = 2131231300; // 0x7f080244 float:1.8078677E38 double:1.0529681687E-314;
        r5 = new java.lang.Object[r10];
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.a(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x015c:
        r2 = com.whatsapp.App.z();
        r0 = com.whatsapp.App.z();
        r3 = r0.getResources();
        r4 = 2131231302; // 0x7f080246 float:1.8078681E38 double:1.0529681697E-314;
        r5 = new java.lang.Object[r10];
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.a(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x017c:
        r2 = com.whatsapp.App.z();
        r0 = com.whatsapp.App.z();
        r3 = r0.getResources();
        r4 = 2131231301; // 0x7f080245 float:1.807868E38 double:1.052968169E-314;
        r5 = new java.lang.Object[r10];
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.a(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x019c:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231311; // 0x7f08024f float:1.80787E38 double:1.052968174E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x01b4:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231313; // 0x7f080251 float:1.8078703E38 double:1.052968175E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x01cc:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231314; // 0x7f080252 float:1.8078706E38 double:1.0529681756E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x01e4:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231312; // 0x7f080250 float:1.8078701E38 double:1.0529681746E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x01fc:
        r2 = com.whatsapp.App.z();
        r0 = com.whatsapp.App.z();
        r3 = r0.getResources();
        r4 = 2131231315; // 0x7f080253 float:1.8078708E38 double:1.052968176E-314;
        r5 = new java.lang.Object[r10];
        r0 = r14.obj;
        r0 = (java.lang.String) r0;
        r5[r9] = r0;
        r0 = r3.getString(r4, r5);
        com.whatsapp.App.a(r2, r0, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x021c:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231292; // 0x7f08023c float:1.807866E38 double:1.0529681647E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0234:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231294; // 0x7f08023e float:1.8078665E38 double:1.0529681657E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x024c:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231295; // 0x7f08023f float:1.8078667E38 double:1.052968166E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0264:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231293; // 0x7f08023d float:1.8078663E38 double:1.052968165E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x027c:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231307; // 0x7f08024b float:1.8078691E38 double:1.052968172E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0294:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231309; // 0x7f08024d float:1.8078695E38 double:1.052968173E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x02ac:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231310; // 0x7f08024e float:1.8078697E38 double:1.0529681736E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x02c4:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231308; // 0x7f08024c float:1.8078693E38 double:1.0529681726E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x02dc:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231296; // 0x7f080240 float:1.807867E38 double:1.0529681667E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x02f4:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231298; // 0x7f080242 float:1.8078673E38 double:1.0529681677E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x030c:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231299; // 0x7f080243 float:1.8078675E38 double:1.052968168E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0324:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231297; // 0x7f080241 float:1.8078671E38 double:1.052968167E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x033c:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231304; // 0x7f080248 float:1.8078685E38 double:1.0529681706E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0354:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231306; // 0x7f08024a float:1.807869E38 double:1.0529681716E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x036c:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231305; // 0x7f080249 float:1.8078687E38 double:1.052968171E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0384:
        r0 = com.whatsapp.App.z();
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r3 = 2131231303; // 0x7f080247 float:1.8078683E38 double:1.05296817E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x039c:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r14.obj;
        r0 = (java.util.Hashtable) r0;
        r3 = r0.keySet();
        r3 = r3.iterator();
    L_0x03ad:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0418;
    L_0x03b3:
        r4 = r3.next();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 4;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r6 = "/";
        r5 = r5.append(r6);
        r6 = r0.get(r4);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        r5 = r0.get(r4);
        r5 = r5.toString();
        r5 = java.lang.Integer.parseInt(r5);
        r6 = com.whatsapp.App.as;
        r4 = r4.toString();
        r4 = r6.b(r4);
        switch(r5) {
            case 401: goto L_0x05bf;
            case 409: goto L_0x05e2;
            case 500: goto L_0x05e4;
            default: goto L_0x03f8;
        };
    L_0x03f8:
        r5 = com.whatsapp.App.z();
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.z();
        r4 = r4.a(r7);
        r6[r9] = r4;
        r4 = r5.getString(r11, r6);
        r4 = r2.append(r4);
        r5 = "\n";
        r4.append(r5);
    L_0x0416:
        if (r1 == 0) goto L_0x03ad;
    L_0x0418:
        r0 = com.whatsapp.App.z();
        r2 = r2.toString();
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0425:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r14.obj;
        r0 = (java.util.Hashtable) r0;
        r3 = r0.keySet();
        r3 = r3.iterator();
    L_0x0436:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x04a0;
    L_0x043c:
        r4 = r3.next();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r6 = r6[r9];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r6 = "/";
        r5 = r5.append(r6);
        r6 = r0.get(r4);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        r5 = r0.get(r4);
        r5 = r5.toString();
        r5 = java.lang.Integer.parseInt(r5);
        r6 = com.whatsapp.App.as;
        r4 = r4.toString();
        r4 = r6.b(r4);
        switch(r5) {
            case 404: goto L_0x0609;
            default: goto L_0x0480;
        };
    L_0x0480:
        r5 = com.whatsapp.App.z();
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.z();
        r4 = r4.a(r7);
        r6[r9] = r4;
        r4 = r5.getString(r12, r6);
        r4 = r2.append(r4);
        r5 = "\n";
        r4.append(r5);
    L_0x049e:
        if (r1 == 0) goto L_0x0436;
    L_0x04a0:
        r0 = com.whatsapp.App.z();
        r2 = r2.toString();
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x04ad:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r14.obj;
        r0 = (java.util.Hashtable) r0;
        r3 = r0.keySet();
        r3 = r3.iterator();
    L_0x04be:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0529;
    L_0x04c4:
        r4 = r3.next();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 6;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r6 = "/";
        r5 = r5.append(r6);
        r6 = r0.get(r4);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        r5 = r0.get(r4);
        r5 = r5.toString();
        r5 = java.lang.Integer.parseInt(r5);
        r6 = com.whatsapp.App.as;
        r4 = r4.toString();
        r4 = r6.b(r4);
        switch(r5) {
            case 404: goto L_0x060d;
            default: goto L_0x0509;
        };
    L_0x0509:
        r5 = com.whatsapp.App.z();
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.z();
        r4 = r4.a(r7);
        r6[r9] = r4;
        r4 = r5.getString(r11, r6);
        r4 = r2.append(r4);
        r5 = "\n";
        r4.append(r5);
    L_0x0527:
        if (r1 == 0) goto L_0x04be;
    L_0x0529:
        r0 = com.whatsapp.App.z();
        r2 = r2.toString();
        com.whatsapp.App.a(r0, r2, r9);
        if (r1 == 0) goto L_0x0012;
    L_0x0536:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r14.obj;
        r0 = (java.util.Hashtable) r0;
        r3 = r0.keySet();
        r3 = r3.iterator();
    L_0x0547:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x05b2;
    L_0x054d:
        r4 = r3.next();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 3;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r6 = "/";
        r5 = r5.append(r6);
        r6 = r0.get(r4);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        r5 = r0.get(r4);
        r5 = r5.toString();
        r5 = java.lang.Integer.parseInt(r5);
        r6 = com.whatsapp.App.as;
        r4 = r4.toString();
        r4 = r6.b(r4);
        switch(r5) {
            case 404: goto L_0x062f;
            default: goto L_0x0592;
        };
    L_0x0592:
        r5 = com.whatsapp.App.z();
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.z();
        r4 = r4.a(r7);
        r6[r9] = r4;
        r4 = r5.getString(r12, r6);
        r4 = r2.append(r4);
        r5 = "\n";
        r4.append(r5);
    L_0x05b0:
        if (r1 == 0) goto L_0x0547;
    L_0x05b2:
        r0 = com.whatsapp.App.z();
        r1 = r2.toString();
        com.whatsapp.App.a(r0, r1, r9);
        goto L_0x0012;
    L_0x05bf:
        r5 = com.whatsapp.App.z();
        r6 = 2131231099; // 0x7f08017b float:1.807827E38 double:1.0529680694E-314;
        r7 = new java.lang.Object[r10];
        r8 = com.whatsapp.App.z();
        r8 = r4.a(r8);
        r7[r9] = r8;
        r5 = r5.getString(r6, r7);
        r5 = r2.append(r5);
        r6 = "\n";
        r5.append(r6);
        if (r1 == 0) goto L_0x0416;
    L_0x05e2:
        if (r1 == 0) goto L_0x0416;
    L_0x05e4:
        r5 = com.whatsapp.App.z();
        r6 = 2131231100; // 0x7f08017c float:1.8078271E38 double:1.05296807E-314;
        r7 = new java.lang.Object[r10];
        r8 = com.whatsapp.App.z();
        r8 = r4.a(r8);
        r7[r9] = r8;
        r5 = r5.getString(r6, r7);
        r5 = r2.append(r5);
        r6 = "\n";
        r5.append(r6);
        if (r1 == 0) goto L_0x0416;
    L_0x0607:
        goto L_0x03f8;
    L_0x0609:
        if (r1 == 0) goto L_0x049e;
    L_0x060b:
        goto L_0x0480;
    L_0x060d:
        r5 = com.whatsapp.App.z();
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.z();
        r7 = r4.a(r7);
        r6[r9] = r7;
        r5 = r5.getString(r11, r6);
        r5 = r2.append(r5);
        r6 = "\n";
        r5.append(r6);
        if (r1 == 0) goto L_0x0527;
    L_0x062d:
        goto L_0x0509;
    L_0x062f:
        r5 = com.whatsapp.App.z();
        r6 = new java.lang.Object[r10];
        r7 = com.whatsapp.App.z();
        r7 = r4.a(r7);
        r6[r9] = r7;
        r5 = r5.getString(r12, r6);
        r5 = r2.append(r5);
        r6 = "\n";
        r5.append(r6);
        if (r1 == 0) goto L_0x05b0;
    L_0x064f:
        goto L_0x0592;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.am7.handleMessage(android.os.Message):void");
    }

    public am7() {
        super(Looper.getMainLooper());
    }
}
