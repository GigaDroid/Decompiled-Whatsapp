package com.whatsapp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.protocol.co;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class g7 extends BaseAdapter implements Filterable {
    private static final String[] z;
    private Filter a;
    private String b;
    final ConversationsFragment c;
    private ArrayList d;

    static {
        String[] strArr = new String[15];
        String str = "7\u000f";
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
                        i3 = 23;
                        break;
                    case at.g /*1*/:
                        i3 = 53;
                        break;
                    case at.i /*2*/:
                        i3 = 57;
                        break;
                    case at.o /*3*/:
                        i3 = 57;
                        break;
                    default:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "7\u001d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "tZWO\u000eeFXM\u0002x[Jf\u0019xB\u0016T\u0002dFPW\fHGTM4dGZ\u0003";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "c]PJK~A\\TK~F\u0019W\u0004c\u0015JL\u001bgZKM\u000es";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "DPZM\u0002x[";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "TZWM\ntA";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "TZWO\u000eeFXM\u0002x[";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "ZPJJ\npP";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "uGVX\u000ftTJM";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "TZWO\u000eeFXM\u0002x[\u007fK\npX\\W\u001f^A\\T";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "{T@V\u001ecjPW\r{TM\\\u0019";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "uGVX\u000ftTJM";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "}\\]\u0019\u0006bFM\u0019\u0005xA\u0019[\u000e7PTI\u001fn";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "uGVX\u000ftTJM";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "-\u0015";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int getCount() {
        return ConversationsFragment.m(this.c).size();
    }

    g7(ConversationsFragment conversationsFragment) {
        this.c = conversationsFragment;
        this.a = new _5(this, null);
        this.d = new ArrayList();
    }

    static ArrayList a(g7 g7Var, ArrayList arrayList) {
        g7Var.d = arrayList;
        return arrayList;
    }

    public long getItemId(int i) {
        return (long) ((p2) ConversationsFragment.m(this.c).get(i)).hashCode();
    }

    public p2 a(int i) {
        return (p2) ConversationsFragment.m(this.c).get(i);
    }

    public int getViewTypeCount() {
        return 2;
    }

    public Object getItem(int i) {
        return a(i);
    }

    static String a(g7 g7Var) {
        return g7Var.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.content.Context r11, android.view.View r12, com.whatsapp.wu r13, com.whatsapp.a9l r14) {
        /*
        r10 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.as;
        r1 = r13.a;
        r0 = r0.f(r1);
        if (r0 != 0) goto L_0x02b3;
    L_0x000c:
        r0 = new com.whatsapp.l5;
        r1 = r13.a;
        r0.<init>(r1);
        r1 = r0;
    L_0x0014:
        r0 = r1.p;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0028 }
        if (r0 == 0) goto L_0x002a;
    L_0x001c:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0028 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0028 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = r10.c;	 Catch:{ IllegalArgumentException -> 0x027b }
        r0 = com.whatsapp.ConversationsFragment.a(r0);	 Catch:{ IllegalArgumentException -> 0x027b }
        r3 = r14.c;	 Catch:{ IllegalArgumentException -> 0x027b }
        r0.b(r1, r3);	 Catch:{ IllegalArgumentException -> 0x027b }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x027b }
        r3 = 14;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x027b }
        r3 = r1.p;	 Catch:{ IllegalArgumentException -> 0x027b }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x027b }
        if (r0 != 0) goto L_0x0068;
    L_0x0043:
        r0 = r1.A();	 Catch:{ IllegalArgumentException -> 0x027b }
        if (r0 != 0) goto L_0x0068;
    L_0x0049:
        r0 = r14.c;
        r3 = 1;
        r0.setEnabled(r3);
        r0 = new com.whatsapp.zz;
        r3 = r1.p;
        r4 = r10.c;
        r4 = r4.getActivity();
        r0.<init>(r3, r4);
        r3 = r14.e;	 Catch:{ IllegalArgumentException -> 0x027d }
        r3.setOnClickListener(r0);	 Catch:{ IllegalArgumentException -> 0x027d }
        r3 = r14.c;	 Catch:{ IllegalArgumentException -> 0x027d }
        r3.setOnClickListener(r0);	 Catch:{ IllegalArgumentException -> 0x027d }
        if (r2 == 0) goto L_0x007a;
    L_0x0068:
        r0 = r14.c;	 Catch:{ IllegalArgumentException -> 0x027d }
        r3 = 0;
        r0.setEnabled(r3);	 Catch:{ IllegalArgumentException -> 0x027d }
        r0 = r14.e;	 Catch:{ IllegalArgumentException -> 0x027d }
        r3 = 0;
        r0.setOnClickListener(r3);	 Catch:{ IllegalArgumentException -> 0x027d }
        r0 = r14.c;	 Catch:{ IllegalArgumentException -> 0x027d }
        r3 = 0;
        r0.setOnClickListener(r3);	 Catch:{ IllegalArgumentException -> 0x027d }
    L_0x007a:
        r0 = r14.e;	 Catch:{ IllegalArgumentException -> 0x027f }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x027f }
        r0 = r14.g;	 Catch:{ IllegalArgumentException -> 0x027f }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x027f }
        r0 = r14.n;	 Catch:{ IllegalArgumentException -> 0x027f }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x027f }
        r0 = r14.l;	 Catch:{ IllegalArgumentException -> 0x027f }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x027f }
        r0 = r14.b;	 Catch:{ IllegalArgumentException -> 0x027f }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x027f }
        r0 = r14.a;	 Catch:{ IllegalArgumentException -> 0x027f }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x027f }
        r0 = r14.f;	 Catch:{ IllegalArgumentException -> 0x027f }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x027f }
        r0 = r14.j;	 Catch:{ IllegalArgumentException -> 0x027f }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r0.setPadding(r3, r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x027f }
        r0 = r1.m();	 Catch:{ IllegalArgumentException -> 0x027f }
        if (r0 == 0) goto L_0x00c3;
    L_0x00b3:
        r0 = r1.q;	 Catch:{ IllegalArgumentException -> 0x027f }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x027f }
        if (r0 == 0) goto L_0x00c3;
    L_0x00bb:
        r0 = r1.p;
        r0 = com.whatsapp.qm.b(r0);
        if (r2 == 0) goto L_0x00c7;
    L_0x00c3:
        r0 = r1.a(r11);
    L_0x00c7:
        r3 = r14.j;	 Catch:{ IllegalArgumentException -> 0x0281 }
        r4 = r10.d;	 Catch:{ IllegalArgumentException -> 0x0281 }
        r3.a(r0, r4);	 Catch:{ IllegalArgumentException -> 0x0281 }
        r0 = r1.d;	 Catch:{ IllegalArgumentException -> 0x0281 }
        if (r0 <= 0) goto L_0x00ea;
    L_0x00d2:
        r0 = r14.b;	 Catch:{ IllegalArgumentException -> 0x0283 }
        r3 = java.text.NumberFormat.getInstance();	 Catch:{ IllegalArgumentException -> 0x0283 }
        r4 = r1.d;	 Catch:{ IllegalArgumentException -> 0x0283 }
        r4 = (long) r4;	 Catch:{ IllegalArgumentException -> 0x0283 }
        r3 = r3.format(r4);	 Catch:{ IllegalArgumentException -> 0x0283 }
        r0.setText(r3);	 Catch:{ IllegalArgumentException -> 0x0283 }
        r0 = r14.b;	 Catch:{ IllegalArgumentException -> 0x0283 }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0283 }
        if (r2 == 0) goto L_0x0106;
    L_0x00ea:
        r0 = r1.d;	 Catch:{ IllegalArgumentException -> 0x0285 }
        r3 = -1;
        if (r0 != r3) goto L_0x00ff;
    L_0x00ef:
        r0 = r14.b;	 Catch:{ IllegalArgumentException -> 0x0287 }
        r3 = "";
        r0.setText(r3);	 Catch:{ IllegalArgumentException -> 0x0287 }
        r0 = r14.b;	 Catch:{ IllegalArgumentException -> 0x0287 }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0287 }
        if (r2 == 0) goto L_0x0106;
    L_0x00ff:
        r0 = r14.b;	 Catch:{ IllegalArgumentException -> 0x0287 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0287 }
    L_0x0106:
        r0 = com.whatsapp.App.aK;
        r3 = r1.p;
        r0 = r0.m(r3);
        if (r0 == 0) goto L_0x012d;
    L_0x0110:
        r3 = r0.c;	 Catch:{ IllegalArgumentException -> 0x0289 }
        if (r3 != 0) goto L_0x012d;
    L_0x0114:
        r4 = r0.z;	 Catch:{ IllegalArgumentException -> 0x028b }
        r6 = 2;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 == 0) goto L_0x0124;
    L_0x011c:
        r4 = r0.z;	 Catch:{ IllegalArgumentException -> 0x028d }
        r6 = 3;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x012d;
    L_0x0124:
        r3 = r14.j;	 Catch:{ IllegalArgumentException -> 0x028d }
        r4 = r0.c();	 Catch:{ IllegalArgumentException -> 0x028d }
        r3.setText(r4);	 Catch:{ IllegalArgumentException -> 0x028d }
    L_0x012d:
        r3 = 0;
        r10.a(r0, r1, r14, r3);	 Catch:{ IllegalArgumentException -> 0x028f }
        r0 = r14.d;	 Catch:{ IllegalArgumentException -> 0x028f }
        if (r0 == 0) goto L_0x0147;
    L_0x0135:
        r3 = r14.d;	 Catch:{ IllegalArgumentException -> 0x0291 }
        r0 = com.whatsapp.a3b.a(r11);	 Catch:{ IllegalArgumentException -> 0x0291 }
        r4 = r1.p;	 Catch:{ IllegalArgumentException -> 0x0291 }
        r0 = r0.e(r4);	 Catch:{ IllegalArgumentException -> 0x0291 }
        if (r0 == 0) goto L_0x0293;
    L_0x0143:
        r0 = 0;
    L_0x0144:
        r3.setVisibility(r0);
    L_0x0147:
        r0 = r14.k;	 Catch:{ IllegalArgumentException -> 0x0297 }
        if (r0 == 0) goto L_0x015b;
    L_0x014b:
        r3 = r14.k;	 Catch:{ IllegalArgumentException -> 0x0299 }
        r0 = com.whatsapp.j2.a;	 Catch:{ IllegalArgumentException -> 0x0299 }
        r4 = r1.p;	 Catch:{ IllegalArgumentException -> 0x0299 }
        r0 = r0.a(r4);	 Catch:{ IllegalArgumentException -> 0x0299 }
        if (r0 == 0) goto L_0x029b;
    L_0x0157:
        r0 = 0;
    L_0x0158:
        r3.setVisibility(r0);
    L_0x015b:
        r0 = r14.m;	 Catch:{ IllegalArgumentException -> 0x029f }
        if (r0 == 0) goto L_0x016f;
    L_0x015f:
        r3 = r14.m;	 Catch:{ IllegalArgumentException -> 0x02a1 }
        r0 = com.whatsapp.App.aK;	 Catch:{ IllegalArgumentException -> 0x02a1 }
        r4 = r1.p;	 Catch:{ IllegalArgumentException -> 0x02a1 }
        r0 = r0.b(r4);	 Catch:{ IllegalArgumentException -> 0x02a1 }
        if (r0 == 0) goto L_0x02a3;
    L_0x016b:
        r0 = 0;
    L_0x016c:
        r3.setVisibility(r0);
    L_0x016f:
        r0 = 0;
        r3 = r1.m();
        if (r3 != 0) goto L_0x018f;
    L_0x0176:
        r0 = r1.l();
        if (r0 == 0) goto L_0x018f;
    L_0x017c:
        r3 = r14.g;	 Catch:{ IllegalArgumentException -> 0x02a7 }
        r3.setText(r0);	 Catch:{ IllegalArgumentException -> 0x02a7 }
        r3 = r14.n;	 Catch:{ IllegalArgumentException -> 0x02a7 }
        r4 = 8;
        r3.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x02a7 }
        r3 = r14.f;	 Catch:{ IllegalArgumentException -> 0x02a7 }
        r4 = 8;
        r3.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x02a7 }
    L_0x018f:
        r3 = r14.j;	 Catch:{ IllegalArgumentException -> 0x02a9 }
        com.whatsapp.a4d.a(r3);	 Catch:{ IllegalArgumentException -> 0x02a9 }
        r3 = r1.d;	 Catch:{ IllegalArgumentException -> 0x02a9 }
        if (r3 == 0) goto L_0x01ac;
    L_0x0198:
        r3 = r14.l;	 Catch:{ IllegalArgumentException -> 0x02ab }
        r4 = r10.c;	 Catch:{ IllegalArgumentException -> 0x02ab }
        r4 = r4.getResources();	 Catch:{ IllegalArgumentException -> 0x02ab }
        r5 = 2131623986; // 0x7f0e0032 float:1.8875139E38 double:1.0531621813E-314;
        r4 = r4.getColor(r5);	 Catch:{ IllegalArgumentException -> 0x02ab }
        r3.setTextColor(r4);	 Catch:{ IllegalArgumentException -> 0x02ab }
        if (r2 == 0) goto L_0x01be;
    L_0x01ac:
        r3 = r14.l;	 Catch:{ IllegalArgumentException -> 0x02ab }
        r4 = r10.c;	 Catch:{ IllegalArgumentException -> 0x02ab }
        r4 = r4.getResources();	 Catch:{ IllegalArgumentException -> 0x02ab }
        r5 = 2131624032; // 0x7f0e0060 float:1.8875232E38 double:1.053162204E-314;
        r4 = r4.getColor(r5);	 Catch:{ IllegalArgumentException -> 0x02ab }
        r3.setTextColor(r4);	 Catch:{ IllegalArgumentException -> 0x02ab }
    L_0x01be:
        if (r0 == 0) goto L_0x01e0;
    L_0x01c0:
        r0 = r14.a;	 Catch:{ IllegalArgumentException -> 0x02ad }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x02ad }
        r0 = r14.g;	 Catch:{ IllegalArgumentException -> 0x02ad }
        r3 = r10.c;	 Catch:{ IllegalArgumentException -> 0x02ad }
        r3 = r3.getResources();	 Catch:{ IllegalArgumentException -> 0x02ad }
        r4 = 2131623986; // 0x7f0e0032 float:1.8875139E38 double:1.0531621813E-314;
        r3 = r3.getColor(r4);	 Catch:{ IllegalArgumentException -> 0x02ad }
        r0.setTextColor(r3);	 Catch:{ IllegalArgumentException -> 0x02ad }
        r0 = r14.g;	 Catch:{ IllegalArgumentException -> 0x02ad }
        com.whatsapp.a4d.a(r0);	 Catch:{ IllegalArgumentException -> 0x02ad }
        if (r2 == 0) goto L_0x01f9;
    L_0x01e0:
        r0 = r14.g;	 Catch:{ IllegalArgumentException -> 0x02ad }
        r2 = r10.c;	 Catch:{ IllegalArgumentException -> 0x02ad }
        r2 = r2.getResources();	 Catch:{ IllegalArgumentException -> 0x02ad }
        r3 = 2131624032; // 0x7f0e0060 float:1.8875232E38 double:1.053162204E-314;
        r2 = r2.getColor(r3);	 Catch:{ IllegalArgumentException -> 0x02ad }
        r0.setTextColor(r2);	 Catch:{ IllegalArgumentException -> 0x02ad }
        r0 = r14.g;	 Catch:{ IllegalArgumentException -> 0x02ad }
        r2 = 0;
        r3 = 0;
        r0.setTypeface(r2, r3);	 Catch:{ IllegalArgumentException -> 0x02ad }
    L_0x01f9:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x02af }
        r2 = 12;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x02af }
        r2 = r1.p;	 Catch:{ IllegalArgumentException -> 0x02af }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x02af }
        if (r0 == 0) goto L_0x0231;
    L_0x0207:
        r0 = r14.g;	 Catch:{ IllegalArgumentException -> 0x02af }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x02af }
        r0 = r14.n;	 Catch:{ IllegalArgumentException -> 0x02af }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x02af }
        r0 = r14.l;	 Catch:{ IllegalArgumentException -> 0x02af }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x02af }
        r0 = r14.b;	 Catch:{ IllegalArgumentException -> 0x02af }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x02af }
        r0 = r14.a;	 Catch:{ IllegalArgumentException -> 0x02af }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x02af }
        r0 = r14.f;	 Catch:{ IllegalArgumentException -> 0x02af }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x02af }
    L_0x0231:
        r0 = r10.c;	 Catch:{ IllegalArgumentException -> 0x02b1 }
        r0 = com.whatsapp.ConversationsFragment.e(r0);	 Catch:{ IllegalArgumentException -> 0x02b1 }
        if (r0 == 0) goto L_0x027a;
    L_0x0239:
        r0 = r10.c;	 Catch:{ IllegalArgumentException -> 0x02b1 }
        r0 = com.whatsapp.ConversationsFragment.e(r0);	 Catch:{ IllegalArgumentException -> 0x02b1 }
        r1 = r1.p;	 Catch:{ IllegalArgumentException -> 0x02b1 }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x02b1 }
        if (r0 == 0) goto L_0x027a;
    L_0x0247:
        r0 = r10.c;
        r1 = 0;
        com.whatsapp.ConversationsFragment.a(r0, r1);
        r9 = new android.view.animation.AnimationSet;
        r0 = 1;
        r9.<init>(r0);
        r0 = new android.view.animation.ScaleAnimation;
        r1 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 1;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = 1;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = new android.view.animation.AlphaAnimation;
        r2 = 0;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.<init>(r2, r3);
        r9.addAnimation(r0);
        r9.addAnimation(r1);
        r0 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r9.setDuration(r0);
        r12.startAnimation(r9);
    L_0x027a:
        return;
    L_0x027b:
        r0 = move-exception;
        throw r0;
    L_0x027d:
        r0 = move-exception;
        throw r0;
    L_0x027f:
        r0 = move-exception;
        throw r0;
    L_0x0281:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0283 }
    L_0x0283:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0285 }
    L_0x0285:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0287 }
    L_0x0287:
        r0 = move-exception;
        throw r0;
    L_0x0289:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x028b }
    L_0x028b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x028d }
    L_0x028d:
        r0 = move-exception;
        throw r0;
    L_0x028f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0291 }
    L_0x0291:
        r0 = move-exception;
        throw r0;
    L_0x0293:
        r0 = 8;
        goto L_0x0144;
    L_0x0297:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0299 }
    L_0x0299:
        r0 = move-exception;
        throw r0;
    L_0x029b:
        r0 = 8;
        goto L_0x0158;
    L_0x029f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02a1 }
    L_0x02a1:
        r0 = move-exception;
        throw r0;
    L_0x02a3:
        r0 = 8;
        goto L_0x016c;
    L_0x02a7:
        r0 = move-exception;
        throw r0;
    L_0x02a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02ab }
    L_0x02ab:
        r0 = move-exception;
        throw r0;
    L_0x02ad:
        r0 = move-exception;
        throw r0;
    L_0x02af:
        r0 = move-exception;
        throw r0;
    L_0x02b1:
        r0 = move-exception;
        throw r0;
    L_0x02b3:
        r1 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.g7.a(android.content.Context, android.view.View, com.whatsapp.wu, com.whatsapp.a9l):void");
    }

    static void a(g7 g7Var, Context context, View view, wu wuVar, a9l com_whatsapp_a9l) {
        g7Var.a(context, view, wuVar, com_whatsapp_a9l);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.content.Context r6, android.view.View r7, com.whatsapp.ans r8, com.whatsapp.a9l r9) {
        /*
        r5 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.as;
        r1 = r8.a;
        r0 = r0.f(r1);
        if (r0 != 0) goto L_0x012a;
    L_0x000c:
        r0 = new com.whatsapp.l5;
        r1 = r8.a;
        r0.<init>(r1);
        r1 = r0;
    L_0x0014:
        r0 = r5.c;	 Catch:{ IllegalArgumentException -> 0x011c }
        r0 = com.whatsapp.ConversationsFragment.a(r0);	 Catch:{ IllegalArgumentException -> 0x011c }
        r3 = r9.c;	 Catch:{ IllegalArgumentException -> 0x011c }
        r0.b(r1, r3);	 Catch:{ IllegalArgumentException -> 0x011c }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x011c }
        r3 = 9;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x011c }
        r3 = r1.p;	 Catch:{ IllegalArgumentException -> 0x011c }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x011c }
        if (r0 != 0) goto L_0x0052;
    L_0x002d:
        r0 = r1.A();	 Catch:{ IllegalArgumentException -> 0x011c }
        if (r0 != 0) goto L_0x0052;
    L_0x0033:
        r0 = r9.c;
        r3 = 1;
        r0.setEnabled(r3);
        r0 = new com.whatsapp.zz;
        r3 = r1.p;
        r4 = r5.c;
        r4 = r4.getActivity();
        r0.<init>(r3, r4);
        r3 = r9.e;	 Catch:{ IllegalArgumentException -> 0x011e }
        r3.setOnClickListener(r0);	 Catch:{ IllegalArgumentException -> 0x011e }
        r3 = r9.c;	 Catch:{ IllegalArgumentException -> 0x011e }
        r3.setOnClickListener(r0);	 Catch:{ IllegalArgumentException -> 0x011e }
        if (r2 == 0) goto L_0x0064;
    L_0x0052:
        r0 = r9.c;	 Catch:{ IllegalArgumentException -> 0x011e }
        r3 = 0;
        r0.setEnabled(r3);	 Catch:{ IllegalArgumentException -> 0x011e }
        r0 = r9.e;	 Catch:{ IllegalArgumentException -> 0x011e }
        r3 = 0;
        r0.setOnClickListener(r3);	 Catch:{ IllegalArgumentException -> 0x011e }
        r0 = r9.c;	 Catch:{ IllegalArgumentException -> 0x011e }
        r3 = 0;
        r0.setOnClickListener(r3);	 Catch:{ IllegalArgumentException -> 0x011e }
    L_0x0064:
        r0 = r9.e;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.g;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.n;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.l;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.b;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.a;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.f;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.i;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.a;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.f;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.k;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.m;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.l;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = r5.c;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = r3.getResources();	 Catch:{ IllegalArgumentException -> 0x0120 }
        r4 = 2131624032; // 0x7f0e0060 float:1.8875232E38 double:1.053162204E-314;
        r3 = r3.getColor(r4);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0.setTextColor(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r9.g;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = r5.c;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r3 = r3.getResources();	 Catch:{ IllegalArgumentException -> 0x0120 }
        r4 = 2131624032; // 0x7f0e0060 float:1.8875232E38 double:1.053162204E-314;
        r3 = r3.getColor(r4);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0.setTextColor(r3);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r1.m();	 Catch:{ IllegalArgumentException -> 0x0120 }
        if (r0 == 0) goto L_0x00ef;
    L_0x00df:
        r0 = r1.q;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0120 }
        if (r0 == 0) goto L_0x00ef;
    L_0x00e7:
        r0 = r1.p;
        r0 = com.whatsapp.qm.b(r0);
        if (r2 == 0) goto L_0x00f3;
    L_0x00ef:
        r0 = r1.a(r6);
    L_0x00f3:
        r2 = r9.j;
        r3 = r5.d;
        r2.a(r0, r3);
        r0 = r5.c;
        r0 = r0.getResources();
        r0 = r1.a(r0);
        if (r0 == 0) goto L_0x010b;
    L_0x0106:
        r2 = r9.l;	 Catch:{ IllegalArgumentException -> 0x0122 }
        r2.setText(r0);	 Catch:{ IllegalArgumentException -> 0x0122 }
    L_0x010b:
        r2 = r9.g;	 Catch:{ IllegalArgumentException -> 0x0124 }
        r0 = r1.w;	 Catch:{ IllegalArgumentException -> 0x0124 }
        if (r0 == 0) goto L_0x0126;
    L_0x0111:
        r0 = r1.w;	 Catch:{ IllegalArgumentException -> 0x0124 }
    L_0x0113:
        r2.a(r0);
        r0 = r9.j;
        com.whatsapp.a4d.a(r0);
        return;
    L_0x011c:
        r0 = move-exception;
        throw r0;
    L_0x011e:
        r0 = move-exception;
        throw r0;
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r0 = move-exception;
        throw r0;
    L_0x0124:
        r0 = move-exception;
        throw r0;
    L_0x0126:
        r0 = "";
        goto L_0x0113;
    L_0x012a:
        r1 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.g7.a(android.content.Context, android.view.View, com.whatsapp.ans, com.whatsapp.a9l):void");
    }

    public Filter getFilter() {
        return this.a;
    }

    static String a(g7 g7Var, String str) {
        g7Var.b = str;
        return str;
    }

    private int a(co coVar) {
        try {
            if (!coVar.k.a) {
                return 0;
            }
            switch (coVar.d) {
                case v.m /*0*/:
                    if (coVar.b + 86400000 < App.av()) {
                        return 2130839667;
                    }
                    return 2130839668;
                case at.p /*4*/:
                    return 2130839673;
                case at.m /*5*/:
                    return 2130839665;
                case aF.u /*8*/:
                case Y.q /*13*/:
                    return 2130839664;
                default:
                    return 2130839668;
            }
            throw e;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            try {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.whatsapp.protocol.co r10, com.whatsapp.l5 r11, com.whatsapp.a9l r12, java.util.ArrayList r13) {
        /*
        r9 = this;
        r3 = com.whatsapp.DialogToastActivity.f;
        r1 = "";
        r0 = "";
        r2 = r12.i;
        r4 = 8;
        r2.setVisibility(r4);
        r2 = r12.a;
        r4 = 0;
        r2.setVisibility(r4);
        r2 = r12.f;
        r4 = 8;
        r2.setVisibility(r4);
        if (r10 == 0) goto L_0x0243;
    L_0x001e:
        r1 = r10.c;
        if (r1 != 0) goto L_0x0040;
    L_0x0022:
        r0 = r10.d;	 Catch:{ IllegalArgumentException -> 0x0357 }
        r2 = 6;
        if (r0 == r2) goto L_0x002d;
    L_0x0027:
        r0 = r10.c();
        if (r3 == 0) goto L_0x0204;
    L_0x002d:
        r4 = r10.z;	 Catch:{ IllegalArgumentException -> 0x0359 }
        r0 = (int) r4;
        switch(r0) {
            case 2: goto L_0x036c;
            case 3: goto L_0x035b;
            default: goto L_0x0033;
        };
    L_0x0033:
        r0 = com.whatsapp.ConversationRowDivider.b(r10);
    L_0x0037:
        r2 = r12.a;	 Catch:{ IllegalArgumentException -> 0x037e }
        r4 = 8;
        r2.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x037e }
        if (r3 == 0) goto L_0x0204;
    L_0x0040:
        r0 = 1;
        if (r1 != r0) goto L_0x0067;
    L_0x0043:
        r0 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0380 }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x0380 }
        r0 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0380 }
        r2 = 2130839663; // 0x7f02086f float:1.7284343E38 double:1.0527746743E-314;
        r0.setImageResource(r2);	 Catch:{ IllegalArgumentException -> 0x0380 }
        r0 = r10.a;	 Catch:{ IllegalArgumentException -> 0x0380 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0380 }
        if (r0 == 0) goto L_0x0063;
    L_0x0059:
        r0 = r9.c;
        r0 = com.whatsapp.ConversationsFragment.d(r0);
        r0 = r0.k;
        if (r3 == 0) goto L_0x0204;
    L_0x0063:
        r0 = r10.a;
        if (r3 == 0) goto L_0x0204;
    L_0x0067:
        r0 = 9;
        if (r1 != r0) goto L_0x00b8;
    L_0x006b:
        r0 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0382 }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x0382 }
        r0 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0382 }
        r2 = 2130839666; // 0x7f020872 float:1.728435E38 double:1.052774676E-314;
        r0.setImageResource(r2);	 Catch:{ IllegalArgumentException -> 0x0382 }
        r0 = r10.a;	 Catch:{ IllegalArgumentException -> 0x0382 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0382 }
        if (r0 == 0) goto L_0x008b;
    L_0x0081:
        r0 = r9.c;
        r0 = com.whatsapp.ConversationsFragment.d(r0);
        r0 = r0.i;
        if (r3 == 0) goto L_0x008d;
    L_0x008b:
        r0 = r10.a;
    L_0x008d:
        r2 = r10.R;
        if (r2 == 0) goto L_0x0204;
    L_0x0091:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r2.append(r0);
        r2 = z;
        r4 = 2;
        r2 = r2[r4];
        r0 = r0.append(r2);
        r2 = com.whatsapp.util.cb.a(r10);
        r0 = r0.append(r2);
        r2 = ")";
        r0 = r0.append(r2);
        r0 = r0.toString();
        if (r3 == 0) goto L_0x0204;
    L_0x00b8:
        r0 = 2;
        if (r1 != r0) goto L_0x0133;
    L_0x00bb:
        r0 = r10.r;	 Catch:{ IllegalArgumentException -> 0x0384 }
        r2 = 1;
        if (r0 != r2) goto L_0x011b;
    L_0x00c0:
        r0 = r10.H;	 Catch:{ IllegalArgumentException -> 0x0384 }
        if (r0 == 0) goto L_0x00cd;
    L_0x00c4:
        r0 = r10.H;
        r4 = (long) r0;
        r0 = android.text.format.DateUtils.formatElapsedTime(r4);
        if (r3 == 0) goto L_0x00d5;
    L_0x00cd:
        r0 = r9.c;
        r0 = com.whatsapp.ConversationsFragment.d(r0);
        r0 = r0.f;
    L_0x00d5:
        r2 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0386 }
        r4 = 0;
        r2.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0386 }
        r2 = r10.k;	 Catch:{ IllegalArgumentException -> 0x0386 }
        r2 = r2.a;	 Catch:{ IllegalArgumentException -> 0x0386 }
        if (r2 == 0) goto L_0x00fb;
    L_0x00e1:
        r2 = r10.d;	 Catch:{ IllegalArgumentException -> 0x0388 }
        r4 = 8;
        if (r2 != r4) goto L_0x00f1;
    L_0x00e7:
        r2 = r12.f;	 Catch:{ IllegalArgumentException -> 0x038a }
        r4 = 2130839670; // 0x7f020876 float:1.7284357E38 double:1.0527746777E-314;
        r2.setImageResource(r4);	 Catch:{ IllegalArgumentException -> 0x038a }
        if (r3 == 0) goto L_0x0204;
    L_0x00f1:
        r2 = r12.f;	 Catch:{ IllegalArgumentException -> 0x038c }
        r4 = 2130839672; // 0x7f020878 float:1.7284361E38 double:1.0527746787E-314;
        r2.setImageResource(r4);	 Catch:{ IllegalArgumentException -> 0x038c }
        if (r3 == 0) goto L_0x0204;
    L_0x00fb:
        r2 = r10.d;	 Catch:{ IllegalArgumentException -> 0x038e }
        r4 = 9;
        if (r2 == r4) goto L_0x0107;
    L_0x0101:
        r2 = r10.d;	 Catch:{ IllegalArgumentException -> 0x0390 }
        r4 = 10;
        if (r2 != r4) goto L_0x0111;
    L_0x0107:
        r2 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0392 }
        r4 = 2130839670; // 0x7f020876 float:1.7284357E38 double:1.0527746777E-314;
        r2.setImageResource(r4);	 Catch:{ IllegalArgumentException -> 0x0392 }
        if (r3 == 0) goto L_0x0204;
    L_0x0111:
        r2 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0392 }
        r4 = 2130839671; // 0x7f020877 float:1.728436E38 double:1.052774678E-314;
        r2.setImageResource(r4);	 Catch:{ IllegalArgumentException -> 0x0392 }
        if (r3 == 0) goto L_0x0204;
    L_0x011b:
        r0 = r9.c;
        r0 = com.whatsapp.ConversationsFragment.d(r0);
        r0 = r0.d;
        r2 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0394 }
        r4 = 0;
        r2.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0394 }
        r2 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0394 }
        r4 = 2130839662; // 0x7f02086e float:1.728434E38 double:1.052774674E-314;
        r2.setImageResource(r4);	 Catch:{ IllegalArgumentException -> 0x0394 }
        if (r3 == 0) goto L_0x0204;
    L_0x0133:
        r0 = 3;
        if (r1 != r0) goto L_0x0160;
    L_0x0136:
        r0 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0396 }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x0396 }
        r0 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0396 }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x0396 }
        r0 = r12.f;	 Catch:{ IllegalArgumentException -> 0x0396 }
        r2 = 2130839674; // 0x7f02087a float:1.7284365E38 double:1.0527746797E-314;
        r0.setImageResource(r2);	 Catch:{ IllegalArgumentException -> 0x0396 }
        r0 = r10.a;	 Catch:{ IllegalArgumentException -> 0x0396 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0396 }
        if (r0 == 0) goto L_0x015c;
    L_0x0152:
        r0 = r9.c;
        r0 = com.whatsapp.ConversationsFragment.d(r0);
        r0 = r0.e;
        if (r3 == 0) goto L_0x0204;
    L_0x015c:
        r0 = r10.a;
        if (r3 == 0) goto L_0x0204;
    L_0x0160:
        r0 = 4;
        if (r1 != r0) goto L_0x016d;
    L_0x0163:
        r0 = r9.c;
        r0 = com.whatsapp.ConversationsFragment.d(r0);
        r0 = r0.a;
        if (r3 == 0) goto L_0x0204;
    L_0x016d:
        r0 = 5;
        if (r1 != r0) goto L_0x01ac;
    L_0x0170:
        r0 = r9.c;
        r0 = com.whatsapp.ConversationsFragment.d(r0);
        r0 = r0.b;
        r2 = r10.A;	 Catch:{ IllegalArgumentException -> 0x0398 }
        if (r2 == 0) goto L_0x019c;
    L_0x017c:
        r2 = r10.A;	 Catch:{ IllegalArgumentException -> 0x0398 }
        r2 = r2.length();	 Catch:{ IllegalArgumentException -> 0x0398 }
        if (r2 <= 0) goto L_0x019c;
    L_0x0184:
        r2 = r10.A;
        r4 = "\n";
        r2 = r2.split(r4);
        r4 = r2.length;	 Catch:{ IllegalArgumentException -> 0x039a }
        if (r4 <= 0) goto L_0x019c;
    L_0x0190:
        r4 = 0;
        r4 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x039a }
        r4 = r4.length();	 Catch:{ IllegalArgumentException -> 0x039a }
        if (r4 <= 0) goto L_0x019c;
    L_0x0199:
        r0 = 0;
        r0 = r2[r0];
    L_0x019c:
        r2 = r12.f;	 Catch:{ IllegalArgumentException -> 0x039c }
        r4 = 0;
        r2.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x039c }
        r2 = r12.f;	 Catch:{ IllegalArgumentException -> 0x039c }
        r4 = 2130839669; // 0x7f020875 float:1.7284355E38 double:1.0527746772E-314;
        r2.setImageResource(r4);	 Catch:{ IllegalArgumentException -> 0x039c }
        if (r3 == 0) goto L_0x0204;
    L_0x01ac:
        r0 = 8;
        if (r1 != r0) goto L_0x01fb;
    L_0x01b0:
        r0 = r10.H;	 Catch:{ IllegalArgumentException -> 0x03a0 }
        if (r0 != 0) goto L_0x01c5;
    L_0x01b4:
        r0 = r10.k;	 Catch:{ IllegalArgumentException -> 0x03a0 }
        r0 = r0.a;	 Catch:{ IllegalArgumentException -> 0x03a0 }
        if (r0 != 0) goto L_0x01c5;
    L_0x01ba:
        r0 = r9.c;
        r1 = 2131230996; // 0x7f080114 float:1.807806E38 double:1.0529680185E-314;
        r0 = r0.getString(r1);
        if (r3 == 0) goto L_0x0204;
    L_0x01c5:
        r0 = r10.k;	 Catch:{ IllegalArgumentException -> 0x03a2 }
        r0 = r0.a;	 Catch:{ IllegalArgumentException -> 0x03a2 }
        if (r0 == 0) goto L_0x01e3;
    L_0x01cb:
        r0 = r9.c;
        r1 = 2131230997; // 0x7f080115 float:1.8078063E38 double:1.052968019E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r4 = 0;
        r5 = r10.H;
        r6 = (long) r5;
        r5 = android.text.format.DateUtils.formatElapsedTime(r6);
        r2[r4] = r5;
        r0 = r0.getString(r1, r2);
        if (r3 == 0) goto L_0x0204;
    L_0x01e3:
        r0 = r9.c;
        r1 = 2131230995; // 0x7f080113 float:1.8078059E38 double:1.052968018E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r4 = 0;
        r5 = r10.H;
        r6 = (long) r5;
        r5 = android.text.format.DateUtils.formatElapsedTime(r6);
        r2[r4] = r5;
        r0 = r0.getString(r1, r2);
        if (r3 == 0) goto L_0x0204;
    L_0x01fb:
        r0 = r9.c;
        r1 = 2131231002; // 0x7f08011a float:1.8078073E38 double:1.0529680214E-314;
        r0 = r0.getString(r1);
    L_0x0204:
        r1 = r9.c;
        r1 = r1.getActivity();
        r4 = com.whatsapp.App.o(r10);
        r1 = com.whatsapp.util.cs.j(r1, r4);
        r2 = r9.a(r10);
        if (r2 == 0) goto L_0x0237;
    L_0x0218:
        r4 = r10.d;	 Catch:{ IllegalArgumentException -> 0x03a4 }
        r5 = 6;
        if (r4 != r5) goto L_0x0226;
    L_0x021d:
        r4 = r12.a;	 Catch:{ IllegalArgumentException -> 0x03a6 }
        r5 = 8;
        r4.setVisibility(r5);	 Catch:{ IllegalArgumentException -> 0x03a6 }
        if (r3 == 0) goto L_0x023e;
    L_0x0226:
        r4 = r12.a;	 Catch:{ IllegalArgumentException -> 0x03a8 }
        r5 = r9.c;	 Catch:{ IllegalArgumentException -> 0x03a8 }
        r5 = r5.getResources();	 Catch:{ IllegalArgumentException -> 0x03a8 }
        r2 = r5.getDrawable(r2);	 Catch:{ IllegalArgumentException -> 0x03a8 }
        r4.setImageDrawable(r2);	 Catch:{ IllegalArgumentException -> 0x03a8 }
        if (r3 == 0) goto L_0x023e;
    L_0x0237:
        r2 = r12.a;	 Catch:{ IllegalArgumentException -> 0x03a8 }
        r4 = 8;
        r2.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x03a8 }
    L_0x023e:
        if (r3 == 0) goto L_0x03c4;
    L_0x0240:
        r8 = r1;
        r1 = r0;
        r0 = r8;
    L_0x0243:
        r2 = r12.a;	 Catch:{ IllegalArgumentException -> 0x03aa }
        r4 = 8;
        r2.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x03aa }
        r2 = r0;
    L_0x024b:
        r0 = r12.n;	 Catch:{ IllegalArgumentException -> 0x03ac }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x03ac }
        r0 = r11.c();	 Catch:{ IllegalArgumentException -> 0x03ac }
        if (r0 != 0) goto L_0x025e;
    L_0x0258:
        r0 = r11.m();	 Catch:{ IllegalArgumentException -> 0x03ae }
        if (r0 == 0) goto L_0x0310;
    L_0x025e:
        r0 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalArgumentException -> 0x03b0 }
        if (r0 != 0) goto L_0x0310;
    L_0x0264:
        r0 = r10.d;	 Catch:{ IllegalArgumentException -> 0x03b2 }
        r4 = 6;
        if (r0 == r4) goto L_0x0310;
    L_0x0269:
        r0 = r10.t;	 Catch:{ IllegalArgumentException -> 0x03b4 }
        if (r0 == 0) goto L_0x02ed;
    L_0x026d:
        r0 = r10.k;	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r0 = r0.a;	 Catch:{ IllegalArgumentException -> 0x03b6 }
        if (r0 == 0) goto L_0x0278;
    L_0x0273:
        r0 = r10.d;	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r4 = 6;
        if (r0 != r4) goto L_0x02ed;
    L_0x0278:
        r0 = com.whatsapp.App.as;
        r4 = r10.t;
        r4 = r0.b(r4);
        r0 = r4.p;
        r5 = com.whatsapp.App.ad();
        r0 = r0.contains(r5);
        if (r0 == 0) goto L_0x0296;
    L_0x028c:
        r0 = r9.c;
        r0 = com.whatsapp.ConversationsFragment.d(r0);
        r0 = r0.c;
        if (r3 == 0) goto L_0x029a;
    L_0x0296:
        r0 = r4.i();
    L_0x029a:
        r4 = com.whatsapp.App.a1();	 Catch:{ IllegalArgumentException -> 0x03b8 }
        if (r4 == 0) goto L_0x02a6;
    L_0x02a0:
        r4 = com.whatsapp.aam.a(r0);	 Catch:{ IllegalArgumentException -> 0x03ba }
        if (r4 != 0) goto L_0x02b2;
    L_0x02a6:
        r4 = com.whatsapp.App.a1();	 Catch:{ IllegalArgumentException -> 0x03bc }
        if (r4 != 0) goto L_0x02ca;
    L_0x02ac:
        r4 = com.whatsapp.aam.a(r0);	 Catch:{ IllegalArgumentException -> 0x03bc }
        if (r4 != 0) goto L_0x02ca;
    L_0x02b2:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.toString();
        if (r3 == 0) goto L_0x02e0;
    L_0x02ca:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 0;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r4.append(r0);
        r0 = r0.toString();
    L_0x02e0:
        r4 = r12.n;	 Catch:{ IllegalArgumentException -> 0x03be }
        r4.a(r0);	 Catch:{ IllegalArgumentException -> 0x03be }
        r0 = r12.n;	 Catch:{ IllegalArgumentException -> 0x03be }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x03be }
        if (r3 == 0) goto L_0x0310;
    L_0x02ed:
        r0 = r10.k;	 Catch:{ IllegalArgumentException -> 0x03c0 }
        r0 = r0.a;	 Catch:{ IllegalArgumentException -> 0x03c0 }
        if (r0 != 0) goto L_0x0310;
    L_0x02f3:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x03c0 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x03c0 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x03c0 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x03c0 }
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x03c0 }
        r3 = com.whatsapp.util.Log.a(r10);	 Catch:{ IllegalArgumentException -> 0x03c0 }
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x03c0 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x03c0 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x03c0 }
    L_0x0310:
        r0 = r9.c;
        r0 = r0.getActivity();
        r0 = r0.getWindow();
        r0 = r0.getDecorView();
        r0 = r0.getWidth();
        r0 = (float) r0;
        r3 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r4 = r9.c;
        r4 = r4.getResources();
        r4 = r4.getDisplayMetrics();
        r4 = r4.density;
        r3 = r3 * r4;
        r4 = r9.c;
        r4 = r4.getResources();
        r4 = r4.getConfiguration();
        r4 = r4.fontScale;
        r3 = r3 * r4;
        r0 = r0 / r3;
        r0 = (int) r0;
        r3 = r1.length();
        if (r3 <= r0) goto L_0x03c2;
    L_0x0347:
        r3 = 0;
        r0 = r1.substring(r3, r0);
    L_0x034c:
        r1 = r12.g;
        r1.a(r0, r13);
        r0 = r12.l;
        r0.setText(r2);
        return;
    L_0x0357:
        r0 = move-exception;
        throw r0;
    L_0x0359:
        r0 = move-exception;
        throw r0;
    L_0x035b:
        r0 = r9.c;
        r0 = com.whatsapp.ConversationsFragment.d(r0);
        r0 = r0.h;
        r2 = r12.i;
        r4 = 8;
        r2.setVisibility(r4);
        if (r3 == 0) goto L_0x0037;
    L_0x036c:
        r0 = r9.c;
        r0 = com.whatsapp.ConversationsFragment.d(r0);
        r0 = r0.j;
        r2 = r12.i;
        r4 = 0;
        r2.setVisibility(r4);
        if (r3 == 0) goto L_0x0037;
    L_0x037c:
        goto L_0x0033;
    L_0x037e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0380 }
    L_0x0380:
        r0 = move-exception;
        throw r0;
    L_0x0382:
        r0 = move-exception;
        throw r0;
    L_0x0384:
        r0 = move-exception;
        throw r0;
    L_0x0386:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0388 }
    L_0x0388:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x038a }
    L_0x038a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x038c }
    L_0x038c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x038e }
    L_0x038e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0390 }
    L_0x0390:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0392 }
    L_0x0392:
        r0 = move-exception;
        throw r0;
    L_0x0394:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0396 }
    L_0x0396:
        r0 = move-exception;
        throw r0;
    L_0x0398:
        r0 = move-exception;
        throw r0;
    L_0x039a:
        r0 = move-exception;
        throw r0;
    L_0x039c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x039e }
    L_0x039e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03a0 }
    L_0x03a0:
        r0 = move-exception;
        throw r0;
    L_0x03a2:
        r0 = move-exception;
        throw r0;
    L_0x03a4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03a6 }
    L_0x03a6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03a8 }
    L_0x03a8:
        r0 = move-exception;
        throw r0;
    L_0x03aa:
        r0 = move-exception;
        throw r0;
    L_0x03ac:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03ae }
    L_0x03ae:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03b0 }
    L_0x03b0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03b2 }
    L_0x03b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03b4 }
    L_0x03b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03b6 }
    L_0x03b6:
        r0 = move-exception;
        throw r0;
    L_0x03b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03ba }
    L_0x03ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03bc }
    L_0x03bc:
        r0 = move-exception;
        throw r0;
    L_0x03be:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x03c0 }
    L_0x03c0:
        r0 = move-exception;
        throw r0;
    L_0x03c2:
        r0 = r1;
        goto L_0x034c;
    L_0x03c4:
        r2 = r1;
        r1 = r0;
        goto L_0x024b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.g7.a(com.whatsapp.protocol.co, com.whatsapp.l5, com.whatsapp.a9l, java.util.ArrayList):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
        r8 = this;
        r4 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r2 = r8.a(r9);
        r1 = z;
        r3 = 10;
        r1 = r1[r3];
        r3 = 20;
        r6 = com.whatsapp.tp.a(r1, r3);
        r1 = com.whatsapp.a5a.POSITION;	 Catch:{ IllegalArgumentException -> 0x005b }
        r6.a(r1, r9);	 Catch:{ IllegalArgumentException -> 0x005b }
        r1 = com.whatsapp.lx.ITEM_TYPE;	 Catch:{ IllegalArgumentException -> 0x005b }
        r3 = r8.a(r2);	 Catch:{ IllegalArgumentException -> 0x005b }
        r6.a(r1, r3);	 Catch:{ IllegalArgumentException -> 0x005b }
        r3 = com.whatsapp.tb.REQUIRES_INFLATE;	 Catch:{ IllegalArgumentException -> 0x005b }
        if (r10 != 0) goto L_0x005d;
    L_0x0025:
        r1 = 1;
    L_0x0026:
        r6.a(r3, r1);	 Catch:{ IllegalArgumentException -> 0x005f }
        r6.e();	 Catch:{ IllegalArgumentException -> 0x005f }
        r1 = r2 instanceof com.whatsapp.a_b;	 Catch:{ IllegalArgumentException -> 0x005f }
        if (r1 == 0) goto L_0x0061;
    L_0x0030:
        if (r10 != 0) goto L_0x0044;
    L_0x0032:
        r1 = r8.c;
        r1 = r1.getActivity();
        r1 = r1.getLayoutInflater();
        r3 = 2130903149; // 0x7f03006d float:1.7413108E38 double:1.0528060405E-314;
        r5 = 0;
        r10 = r1.inflate(r3, r5, r4);
    L_0x0044:
        r1 = 2131755127; // 0x7f100077 float:1.9141124E38 double:1.0532269736E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        com.whatsapp.a4d.a(r1);
        r2 = (com.whatsapp.a_b) r2;
        r2 = r2.a;
        r1.setText(r2);
        r6.d();
    L_0x005a:
        return r10;
    L_0x005b:
        r1 = move-exception;
        throw r1;
    L_0x005d:
        r1 = r4;
        goto L_0x0026;
    L_0x005f:
        r1 = move-exception;
        throw r1;
    L_0x0061:
        r1 = com.whatsapp.t4.INFLATE;
        r6.b(r1);
        if (r10 != 0) goto L_0x0111;
    L_0x0068:
        r1 = r8.c;
        r1 = r1.getActivity();
        r3 = z;
        r7 = 11;
        r3 = r3[r7];
        r1 = r1.getSystemService(r3);
        r1 = (android.view.LayoutInflater) r1;
        r3 = new com.whatsapp.a9l;
        r3.<init>();
        r7 = 2130903148; // 0x7f03006c float:1.7413106E38 double:1.05280604E-314;
        r4 = com.whatsapp.aam.a(r1, r7, r11, r4);
        r1 = 2131755573; // 0x7f100235 float:1.914203E38 double:1.053227194E-314;
        r1 = r4.findViewById(r1);
        r1 = (com.whatsapp.TextEmojiLabel) r1;
        r3.j = r1;
        r1 = 2131755580; // 0x7f10023c float:1.9142043E38 double:1.0532271974E-314;
        r1 = r4.findViewById(r1);
        r3.i = r1;
        r1 = 2131755351; // 0x7f100157 float:1.9141579E38 double:1.0532270843E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3.c = r1;
        r1 = 2131755383; // 0x7f100177 float:1.9141644E38 double:1.0532271E-314;
        r1 = r4.findViewById(r1);
        r3.e = r1;
        r1 = 2131755585; // 0x7f100241 float:1.9142053E38 double:1.0532272E-314;
        r1 = r4.findViewById(r1);
        r1 = (com.whatsapp.TextEmojiLabel) r1;
        r3.g = r1;
        r1 = 2131755574; // 0x7f100236 float:1.9142031E38 double:1.0532271944E-314;
        r1 = r4.findViewById(r1);
        r1 = (com.whatsapp.TextEmojiLabel) r1;
        r3.n = r1;
        r1 = 2131755589; // 0x7f100245 float:1.9142062E38 double:1.053227202E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r3.b = r1;
        r1 = 2131755583; // 0x7f10023f float:1.914205E38 double:1.053227199E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3.a = r1;
        r1 = 2131755584; // 0x7f100240 float:1.9142051E38 double:1.0532271994E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3.f = r1;
        r1 = 2131755586; // 0x7f100242 float:1.9142055E38 double:1.0532272004E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3.d = r1;
        r1 = 2131755587; // 0x7f100243 float:1.9142057E38 double:1.053227201E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3.k = r1;
        r1 = 2131755588; // 0x7f100244 float:1.914206E38 double:1.0532272014E-314;
        r1 = r4.findViewById(r1);
        r3.m = r1;
        r1 = 2131755582; // 0x7f10023e float:1.9142047E38 double:1.0532271984E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r3.l = r1;
        if (r5 == 0) goto L_0x0170;
    L_0x0111:
        r1 = r10.getTag();
        r1 = (com.whatsapp.a9l) r1;
        r3 = r1;
    L_0x0118:
        r1 = com.whatsapp.t4.INFLATE;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r6.a(r1);	 Catch:{ IllegalArgumentException -> 0x0166 }
        r3.h = r2;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r10.setTag(r3);	 Catch:{ IllegalArgumentException -> 0x0166 }
        r1 = com.whatsapp.t4.FILL;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r6.b(r1);	 Catch:{ IllegalArgumentException -> 0x0166 }
        r1 = r2 instanceof com.whatsapp.wu;	 Catch:{ IllegalArgumentException -> 0x0166 }
        if (r1 == 0) goto L_0x013a;
    L_0x012b:
        r1 = r8.c;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r4 = r1.getActivity();	 Catch:{ IllegalArgumentException -> 0x0168 }
        r0 = r2;
        r0 = (com.whatsapp.wu) r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
        r1 = r0;
        r8.a(r4, r10, r1, r3);	 Catch:{ IllegalArgumentException -> 0x0168 }
        if (r5 == 0) goto L_0x015c;
    L_0x013a:
        r1 = r2 instanceof com.whatsapp.ans;	 Catch:{ IllegalArgumentException -> 0x016a }
        if (r1 == 0) goto L_0x014d;
    L_0x013e:
        r1 = r8.c;	 Catch:{ IllegalArgumentException -> 0x016c }
        r4 = r1.getActivity();	 Catch:{ IllegalArgumentException -> 0x016c }
        r0 = r2;
        r0 = (com.whatsapp.ans) r0;	 Catch:{ IllegalArgumentException -> 0x016c }
        r1 = r0;
        r8.a(r4, r10, r1, r3);	 Catch:{ IllegalArgumentException -> 0x016c }
        if (r5 == 0) goto L_0x015c;
    L_0x014d:
        r1 = r2 instanceof com.whatsapp.df;	 Catch:{ IllegalArgumentException -> 0x016e }
        if (r1 == 0) goto L_0x015c;
    L_0x0151:
        r1 = r8.c;	 Catch:{ IllegalArgumentException -> 0x016e }
        r1 = r1.getActivity();	 Catch:{ IllegalArgumentException -> 0x016e }
        r2 = (com.whatsapp.df) r2;	 Catch:{ IllegalArgumentException -> 0x016e }
        r8.a(r1, r10, r2, r3);	 Catch:{ IllegalArgumentException -> 0x016e }
    L_0x015c:
        r1 = com.whatsapp.t4.FILL;
        r6.a(r1);
        r6.d();
        goto L_0x005a;
    L_0x0166:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0168 }
    L_0x0168:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x016a }
    L_0x016a:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x016c }
    L_0x016c:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x016e }
    L_0x016e:
        r1 = move-exception;
        throw r1;
    L_0x0170:
        r10 = r4;
        goto L_0x0118;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.g7.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private String a(p2 p2Var) {
        try {
            if (p2Var instanceof a_b) {
                return z[5];
            }
            try {
                if (p2Var instanceof wu) {
                    return z[7];
                }
                try {
                    if (p2Var instanceof ans) {
                        return z[6];
                    }
                    try {
                        if (p2Var instanceof df) {
                            return z[8];
                        }
                        throw new IllegalArgumentException(z[4]);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public boolean isEmpty() {
        try {
            if (!super.isEmpty()) {
                return false;
            }
            if (ConversationsFragment.g(this.c) != 0) {
                try {
                    if (TextUtils.isEmpty(this.b)) {
                        return false;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public int getItemViewType(int i) {
        try {
            return a(i) instanceof a_b ? 1 : 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.content.Context r5, android.view.View r6, com.whatsapp.df r7, com.whatsapp.a9l r8) {
        /*
        r4 = this;
        r3 = 0;
        r2 = 2131624032; // 0x7f0e0060 float:1.8875232E38 double:1.053162204E-314;
        r1 = 8;
        r0 = r8.e;
        r0.setVisibility(r1);
        r0 = r8.b;
        r0.setVisibility(r1);
        r0 = r8.a;
        r0.setVisibility(r1);
        r0 = r8.f;
        r0.setVisibility(r1);
        r0 = r8.d;
        r0.setVisibility(r1);
        r0 = r8.k;
        r0.setVisibility(r1);
        r0 = r8.m;
        r0.setVisibility(r1);
        r0 = r8.l;
        r1 = r4.c;
        r1 = r1.getResources();
        r1 = r1.getColor(r2);
        r0.setTextColor(r1);
        r0 = r8.g;
        r1 = r4.c;
        r1 = r1.getResources();
        r1 = r1.getColor(r2);
        r0.setTextColor(r1);
        r0 = r8.c;
        r1 = 0;
        r0.setEnabled(r1);
        r0 = r8.e;
        r0.setOnClickListener(r3);
        r0 = r8.c;
        r0.setOnClickListener(r3);
        r0 = com.whatsapp.App.as;
        r1 = r7.a;
        r1 = r1.k;
        r1 = r1.c;
        r0 = r0.f(r1);
        if (r0 != 0) goto L_0x00a1;
    L_0x0065:
        r0 = new com.whatsapp.l5;
        r1 = r7.a;
        r1 = r1.k;
        r1 = r1.c;
        r0.<init>(r1);
        r1 = r0;
    L_0x0071:
        r0 = r1.m();	 Catch:{ IllegalArgumentException -> 0x009f }
        if (r0 == 0) goto L_0x0089;
    L_0x0077:
        r0 = r1.q;	 Catch:{ IllegalArgumentException -> 0x009f }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x009f }
        if (r0 == 0) goto L_0x0089;
    L_0x007f:
        r0 = r1.p;
        r0 = com.whatsapp.qm.b(r0);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x008d;
    L_0x0089:
        r0 = r1.a(r5);
    L_0x008d:
        r2 = r8.j;
        r2.a(r0);
        r0 = r7.a;
        r2 = r4.d;
        r4.a(r0, r1, r8, r2);
        r0 = r8.j;
        com.whatsapp.a4d.a(r0);
        return;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r1 = r0;
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.g7.a(android.content.Context, android.view.View, com.whatsapp.df, com.whatsapp.a9l):void");
    }

    public boolean hasStableIds() {
        return true;
    }
}
