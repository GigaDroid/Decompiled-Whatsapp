package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.gdrive.b9;
import com.whatsapp.gdrive.d5;
import com.whatsapp.gdrive.fk;
import com.whatsapp.util.Log;
import com.whatsapp.util.l;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class ga extends b9 {
    private static final String[] z;
    @d5
    private int a;
    private boolean b;
    private long c;
    private int d;
    final ConversationsFragment e;

    static {
        String[] strArr = new String[15];
        String str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'q_w\u0006gq_)\u0002ivIa\u0016'p^g\u0013zg\u0017i\u001b{pSj\u0015";
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
                        i3 = 58;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = 8;
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
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'q_w\u0006gq_)\u0002ivIa\u0016'mU)\u0005aeS";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'p_p_efIw\u0013of\u0015w\u001agt\u0017m\u001clfNa\u0000ejTe\u0006m";
                    obj = 2;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "vTa\nxfYp\u0017l#Ip\u0013|f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'fHv\u001dz.^q\u0000am])\u0000mpNk\u0000m,";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'q_w\u0006gq_)\u0017fg\u001a";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "#\\e\u001bdf^>R";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "#Ha\u0001}oN>R";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'q_w\u0006gq_)\u0017fg\u0015j\u001d|kSj\u0015%wU)\u0000mpNk\u0000m";
                    obj = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'q_w\u0006gq_)\u0017fg\u001ap\u001d|bV>R";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'q_w\u0006gq_)\u0001|bHp";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'q_w\u0006gq_)\u0002ivIa\u0016'oUs_jbNp\u0017zz";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'q_w\u0006gq_)\u0011imYa\u001edf^";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'q_w\u0006gq_)\u0002ivIa\u0016'mU)\u0016iw[)\u0011gmTa\u0011|jUj";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "`Uj\u0004mqIe\u0006alTw_ogHm\u0004m.Uf\u0001mqLa\u0000'q_w\u0006gq_)\u0002ivIa\u0016'p^g\u0013zg\u0017q\u001celOj\u0006mg";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r11, long r12, long r14) {
        /*
        r10 = this;
        r3 = 8;
        r5 = 1;
        r8 = 0;
        r4 = 0;
        r6 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x002a }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x002a }
        r1 = z;	 Catch:{ IllegalStateException -> 0x002a }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x002a }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x002a }
        r0 = r0.append(r11);	 Catch:{ IllegalStateException -> 0x002a }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x002a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x002a }
        r0 = r10.e;	 Catch:{ IllegalStateException -> 0x002a }
        r0 = r0.isAdded();	 Catch:{ IllegalStateException -> 0x002a }
        if (r0 != 0) goto L_0x002c;
    L_0x0029:
        return;
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = r10.e;
        r7 = r0.getActivity();
        if (r7 == 0) goto L_0x0029;
    L_0x0034:
        r10.d = r3;
        r0 = -1;
        r10.c = r0;
        r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x0058;
    L_0x003e:
        r0 = 2131231212; // 0x7f0801ec float:1.8078499E38 double:1.052968125E-314;
        r1 = 2;
        r1 = new java.lang.Object[r1];
        r2 = r14 - r12;
        r2 = com.whatsapp.util.l.a(r7, r2);
        r1[r4] = r2;
        r2 = com.whatsapp.util.l.a(r7, r12);
        r1[r5] = r2;
        r3 = r7.getString(r0, r1);
        if (r6 == 0) goto L_0x0067;
    L_0x0058:
        r0 = 2131231211; // 0x7f0801eb float:1.8078497E38 double:1.0529681247E-314;
        r1 = new java.lang.Object[r5];
        r2 = com.whatsapp.util.l.a(r7, r14);
        r1[r4] = r2;
        r3 = r7.getString(r0, r1);
    L_0x0067:
        r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x007e;
    L_0x006b:
        r1 = 4;
        r0 = r10.e;	 Catch:{ IllegalStateException -> 0x00d4 }
        r2 = 2131231220; // 0x7f0801f4 float:1.8078515E38 double:1.052968129E-314;
        r2 = r0.getString(r2);	 Catch:{ IllegalStateException -> 0x00d4 }
        r4 = 100;
        r5 = 0;
        r0 = r10;
        r0.a(r1, r2, r3, r4, r5);	 Catch:{ IllegalStateException -> 0x00d4 }
        if (r6 == 0) goto L_0x0029;
    L_0x007e:
        r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1));
        if (r0 != 0) goto L_0x009b;
    L_0x0082:
        r0 = z;	 Catch:{ IllegalStateException -> 0x00d8 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x00d8 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x00d8 }
        r0 = r7.isFinishing();	 Catch:{ IllegalStateException -> 0x00d8 }
        if (r0 != 0) goto L_0x0029;
    L_0x0091:
        r0 = new com.whatsapp.wb;	 Catch:{ IllegalStateException -> 0x00d2 }
        r0.<init>(r10);	 Catch:{ IllegalStateException -> 0x00d2 }
        r7.runOnUiThread(r0);	 Catch:{ IllegalStateException -> 0x00d2 }
        if (r6 == 0) goto L_0x0029;
    L_0x009b:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00d2 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x00d2 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x00d2 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00d2 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x00d2 }
        r0 = r0.append(r14);	 Catch:{ IllegalStateException -> 0x00d2 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x00d2 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00d2 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x00d2 }
        r0 = r0.append(r12);	 Catch:{ IllegalStateException -> 0x00d2 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x00d2 }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00d2 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x00d2 }
        r0 = r0.append(r11);	 Catch:{ IllegalStateException -> 0x00d2 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x00d2 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x00d2 }
        goto L_0x0029;
    L_0x00d2:
        r0 = move-exception;
        throw r0;
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ga.a(boolean, long, long):void");
    }

    private ga(ConversationsFragment conversationsFragment) {
        this.e = conversationsFragment;
        this.c = -1;
    }

    public void f() {
        try {
            Log.i(z[13]);
            if (this.e.isAdded()) {
                Activity activity = this.e.getActivity();
                try {
                    if (!activity.isFinishing()) {
                        activity.runOnUiThread(new azp(this));
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    ga(ConversationsFragment conversationsFragment, bm bmVar) {
        this(conversationsFragment);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(@com.whatsapp.gdrive.d5 int r7, @android.support.annotation.NonNull java.lang.String r8, @android.support.annotation.NonNull java.lang.String r9, int r10, boolean r11) {
        /*
        r6 = this;
        r5 = 5;
        r4 = 2;
        r3 = 4;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r6.e;	 Catch:{ IllegalStateException -> 0x000e }
        r1 = r1.isAdded();	 Catch:{ IllegalStateException -> 0x000e }
        if (r1 != 0) goto L_0x0010;
    L_0x000d:
        return;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r1 = r6.e;
        r1 = r1.getActivity();
        if (r1 == 0) goto L_0x000d;
    L_0x0018:
        switch(r7) {
            case 2: goto L_0x0032;
            case 3: goto L_0x0057;
            case 4: goto L_0x006a;
            case 5: goto L_0x0092;
            default: goto L_0x001b;
        };
    L_0x001b:
        r0 = r6.b;	 Catch:{ IllegalStateException -> 0x00d0 }
        if (r11 == r0) goto L_0x000d;
    L_0x001f:
        r0 = r1.isFinishing();	 Catch:{ IllegalStateException -> 0x0030 }
        if (r0 != 0) goto L_0x000d;
    L_0x0025:
        r0 = new com.whatsapp.dz;	 Catch:{ IllegalStateException -> 0x0030 }
        r0.<init>(r6, r11);	 Catch:{ IllegalStateException -> 0x0030 }
        r1.runOnUiThread(r0);	 Catch:{ IllegalStateException -> 0x0030 }
        r6.b = r11;	 Catch:{ IllegalStateException -> 0x0030 }
        goto L_0x000d;
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r2 = r6.a;	 Catch:{ IllegalStateException -> 0x0064 }
        if (r2 == r4) goto L_0x0047;
    L_0x0036:
        r2 = r1.isFinishing();	 Catch:{ IllegalStateException -> 0x0066 }
        if (r2 != 0) goto L_0x0047;
    L_0x003c:
        r2 = new com.whatsapp.akx;	 Catch:{ IllegalStateException -> 0x0066 }
        r2.<init>(r6);	 Catch:{ IllegalStateException -> 0x0066 }
        r1.runOnUiThread(r2);	 Catch:{ IllegalStateException -> 0x0066 }
        r2 = 2;
        r6.a = r2;	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0047:
        r2 = r1.isFinishing();	 Catch:{ IllegalStateException -> 0x0068 }
        if (r2 != 0) goto L_0x001b;
    L_0x004d:
        r2 = new com.whatsapp.mr;	 Catch:{ IllegalStateException -> 0x0062 }
        r2.<init>(r6, r8, r9);	 Catch:{ IllegalStateException -> 0x0062 }
        r1.runOnUiThread(r2);	 Catch:{ IllegalStateException -> 0x0062 }
        if (r0 == 0) goto L_0x001b;
    L_0x0057:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0062 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0062 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0062 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0062 }
    L_0x006a:
        com.whatsapp.auv.a(r9);	 Catch:{ IllegalStateException -> 0x00c4 }
        r2 = r6.a;	 Catch:{ IllegalStateException -> 0x00c4 }
        if (r2 == r3) goto L_0x0082;
    L_0x0071:
        r2 = r1.isFinishing();	 Catch:{ IllegalStateException -> 0x00c6 }
        if (r2 != 0) goto L_0x0082;
    L_0x0077:
        r2 = new com.whatsapp.vu;	 Catch:{ IllegalStateException -> 0x00c6 }
        r2.<init>(r6);	 Catch:{ IllegalStateException -> 0x00c6 }
        r1.runOnUiThread(r2);	 Catch:{ IllegalStateException -> 0x00c6 }
        r2 = 4;
        r6.a = r2;	 Catch:{ IllegalStateException -> 0x00c6 }
    L_0x0082:
        r2 = r1.isFinishing();	 Catch:{ IllegalStateException -> 0x00c8 }
        if (r2 != 0) goto L_0x001b;
    L_0x0088:
        r2 = new com.whatsapp._0;	 Catch:{ IllegalStateException -> 0x00ca }
        r2.<init>(r6, r10, r8, r9);	 Catch:{ IllegalStateException -> 0x00ca }
        r1.runOnUiThread(r2);	 Catch:{ IllegalStateException -> 0x00ca }
        if (r0 == 0) goto L_0x001b;
    L_0x0092:
        com.whatsapp.auv.a(r9);	 Catch:{ IllegalStateException -> 0x00cc }
        r0 = r6.a;	 Catch:{ IllegalStateException -> 0x00cc }
        if (r0 == r5) goto L_0x00b2;
    L_0x0099:
        r0 = z;	 Catch:{ IllegalStateException -> 0x00ce }
        r2 = 3;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x00ce }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x00ce }
        r0 = r1.isFinishing();	 Catch:{ IllegalStateException -> 0x00ce }
        if (r0 != 0) goto L_0x00b2;
    L_0x00a7:
        r0 = new com.whatsapp.azo;	 Catch:{ IllegalStateException -> 0x00ce }
        r0.<init>(r6);	 Catch:{ IllegalStateException -> 0x00ce }
        r1.runOnUiThread(r0);	 Catch:{ IllegalStateException -> 0x00ce }
        r0 = 5;
        r6.a = r0;	 Catch:{ IllegalStateException -> 0x00ce }
    L_0x00b2:
        r0 = r1.isFinishing();	 Catch:{ IllegalStateException -> 0x00c2 }
        if (r0 != 0) goto L_0x001b;
    L_0x00b8:
        r0 = new com.whatsapp.akt;	 Catch:{ IllegalStateException -> 0x00c2 }
        r0.<init>(r6, r9, r8);	 Catch:{ IllegalStateException -> 0x00c2 }
        r1.runOnUiThread(r0);	 Catch:{ IllegalStateException -> 0x00c2 }
        goto L_0x001b;
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0030 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ga.a(int, java.lang.String, java.lang.String, int, boolean):void");
    }

    public void d(long j, long j2) {
        try {
            Log.i(z[2]);
            if (this.e.isAdded()) {
                int i;
                this.d = 3;
                String string = this.e.getString(2131231216);
                if (j2 > 0) {
                    try {
                        i = (int) ((100 * j) / j2);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                i = -1;
                a(4, this.e.getString(2131231221), string, i, false);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void a(long j, long j2, long j3) {
        try {
            if (this.e.isAdded()) {
                Context activity = this.e.getActivity();
                if (activity != null) {
                    String a = l.a(activity, j);
                    try {
                        if (this.d == 1) {
                            if (l.a(activity, j).equals(l.a(activity, this.c))) {
                                return;
                            }
                        }
                        this.c = j;
                        a(4, this.e.getString(2131231222), this.e.getString(2131231213, new Object[]{a, l.a(activity, j3), Long.valueOf((100 * j) / j3)}), (int) ((100 * j) / j3), true);
                        this.d = 1;
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void l(long j, long j2) {
        try {
            Log.i(z[12]);
            if (this.e.isAdded()) {
                int i;
                this.d = 5;
                String string = this.e.getString(2131231214);
                if (j2 > 0) {
                    try {
                        i = (int) ((100 * j) / j2);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                i = -1;
                a(4, this.e.getString(2131231221), string, i, false);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void h(long j, long j2) {
        try {
            Log.i(z[14]);
            if (this.e.isAdded()) {
                int i;
                this.d = 4;
                String string = this.e.getString(2131231215);
                if (j2 > 0) {
                    try {
                        i = (int) ((100 * j) / j2);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                i = -1;
                a(4, this.e.getString(2131231221), string, i, false);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void a(@fk int i) {
        try {
            if (this.e.isAdded()) {
                try {
                    this.d = 2;
                    if (i != 10) {
                        Log.i(z[5] + i);
                        a(2, this.e.getString(2131231219), this.e.getString(2131232319), 0, false);
                        ConversationsFragment.p(this.e).ad().h();
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void a(long j, long j2) {
        try {
            Log.i(z[0]);
            if (this.e.isAdded()) {
                try {
                    int i;
                    this.d = 7;
                    if (j2 > 0) {
                        i = (int) ((100 * j) / j2);
                    } else {
                        i = -1;
                    }
                    a(5, this.e.getString(2131231221), this.e.getString(2131231242), i, false);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void b(long j, long j2) {
        try {
            Log.i(z[1]);
            if (this.e.isAdded()) {
                int i;
                this.d = 6;
                String string = this.e.getString(2131232321);
                if (j2 > 0) {
                    try {
                        i = (int) ((100 * j) / j2);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                i = -1;
                a(4, this.e.getString(2131231221), string, i, false);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void f(int i) {
        try {
            if (this.e.isAdded() && i > 0) {
                try {
                    this.d = 10;
                    a(5, this.e.getString(2131231222), this.e.getString(2131231218, new Object[]{Integer.valueOf(i)}), i, true);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void c() {
        try {
            Log.i(z[11]);
            if (this.e.isAdded()) {
                this.d = 9;
                a(5, this.e.getString(2131231222), this.e.getString(2131231217), -1, true);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
