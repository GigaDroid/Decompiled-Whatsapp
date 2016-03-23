package com.whatsapp;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class a4l extends CursorAdapter {
    private static final String[] z;
    final Conversation a;
    private int b;
    private co c;

    static {
        String[] strArr = new String[10];
        String str = "fHA;e\"P_1=";
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
                        i3 = 2;
                        break;
                    case at.g /*1*/:
                        i3 = 61;
                        break;
                    case at.i /*2*/:
                        i3 = 44;
                        break;
                    case at.o /*3*/:
                        i3 = 86;
                        break;
                    default:
                        i3 = 28;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "+\u001d\f%uxX\u0016";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\"\u0015";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "aRB ypNM\"umS\u00037xhH_\"\u007fc^D33cM\\3rfXH";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "n\\U9ivbE8zn\\X3n";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "ARB ypNM\"umS~9k";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "rOI%ylIE8{\"^M:p\"QC1<kS\f5slKI$ocIE9r\"MM1y";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "aRB ypNM\"umS\u00031yvKE3k-OC!<kN\f8inQ\rvqqZ\u0011";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "aRB ypNM\"umSM2}rII$3lX[vlcOM;<kN\f8inQ\r";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "aRB ypNM\"umSM2}rII$3eXX?hgP\u0003&sqTX?sl\u0012E8jcQE2<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Object getItem(int i) {
        return b(i);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = null;
        if (context == null || cursor == null) {
            try {
                Log.w(z[9]);
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            view = ConversationRowsActivity.a(this.a, App.aK.a(cursor, this.a.ae));
        } catch (Throwable e2) {
            Log.a(e2);
        }
        return view;
    }

    static int a(a4l com_whatsapp_a4l) {
        return com_whatsapp_a4l.a();
    }

    protected void onContentChanged() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
        r12 = this;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r1 = 6;
        r0 = r0[r1];
        r1 = 20;
        r5 = com.whatsapp.tp.a(r0, r1);
        r0 = com.whatsapp.a5a.POSITION;	 Catch:{ IllegalStateException -> 0x0071 }
        r5.a(r0, r13);	 Catch:{ IllegalStateException -> 0x0071 }
        r1 = com.whatsapp.tb.REQUIRES_INFLATE;	 Catch:{ IllegalStateException -> 0x0071 }
        if (r14 != 0) goto L_0x0073;
    L_0x0016:
        r0 = 1;
    L_0x0017:
        r5.a(r1, r0);
        r5.e();
        r0 = com.whatsapp.t4.FILL;
        r5.b(r0);
        r6 = r12.b(r13);
        r0 = com.whatsapp.t4.FILL;	 Catch:{ IllegalStateException -> 0x0075 }
        r5.a(r0);	 Catch:{ IllegalStateException -> 0x0075 }
        r0 = com.whatsapp.lx.ITEM_TYPE;	 Catch:{ IllegalStateException -> 0x0075 }
        r1 = r6.c;	 Catch:{ IllegalStateException -> 0x0075 }
        r1 = com.whatsapp.protocol.co.a(r1);	 Catch:{ IllegalStateException -> 0x0075 }
        r5.a(r0, r1);	 Catch:{ IllegalStateException -> 0x0075 }
        r1 = com.whatsapp.tb.FIRST_INIT;	 Catch:{ IllegalStateException -> 0x0075 }
        r0 = com.whatsapp.Conversation.E();	 Catch:{ IllegalStateException -> 0x0075 }
        r2 = r6.c;	 Catch:{ IllegalStateException -> 0x0075 }
        r2 = java.lang.Byte.valueOf(r2);	 Catch:{ IllegalStateException -> 0x0075 }
        r0 = r0.contains(r2);	 Catch:{ IllegalStateException -> 0x0075 }
        if (r0 != 0) goto L_0x0077;
    L_0x0048:
        r0 = 1;
    L_0x0049:
        r5.a(r1, r0);	 Catch:{ IllegalStateException -> 0x0079 }
        r0 = com.whatsapp.Conversation.E();	 Catch:{ IllegalStateException -> 0x0079 }
        r1 = r6.c;	 Catch:{ IllegalStateException -> 0x0079 }
        r1 = java.lang.Byte.valueOf(r1);	 Catch:{ IllegalStateException -> 0x0079 }
        r0.add(r1);	 Catch:{ IllegalStateException -> 0x0079 }
        r0 = r6.c;	 Catch:{ IllegalStateException -> 0x0079 }
        r1 = 8;
        if (r0 != r1) goto L_0x007b;
    L_0x005f:
        r0 = com.whatsapp.App.am;	 Catch:{ IllegalStateException -> 0x006f }
        r1 = 3;
        if (r0 < r1) goto L_0x007b;
    L_0x0064:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x006f }
        r1 = z;	 Catch:{ IllegalStateException -> 0x006f }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x006f }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x006f }
        throw r0;	 Catch:{ IllegalStateException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = 0;
        goto L_0x0017;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = 0;
        goto L_0x0049;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006f }
    L_0x007b:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x00d2 }
        r0 = com.whatsapp.Conversation.f(r0);	 Catch:{ IllegalStateException -> 0x00d2 }
        if (r0 <= 0) goto L_0x00d4;
    L_0x0083:
        r0 = r12.a();	 Catch:{ IllegalStateException -> 0x00d2 }
        if (r13 != r0) goto L_0x00d4;
    L_0x0089:
        r0 = r12.a;
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 2130903143; // 0x7f030067 float:1.7413096E38 double:1.0528060376E-314;
        r2 = 0;
        r1 = com.whatsapp.aam.a(r0, r1, r15, r2);
        r0 = 2131755568; // 0x7f100230 float:1.9142019E38 double:1.0532271915E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = com.whatsapp.App.az;
        r3 = 2131296319; // 0x7f09003f float:1.8210551E38 double:1.0530002923E-314;
        r4 = r12.a;
        r4 = com.whatsapp.Conversation.am(r4);
        r2 = r2.a(r3, r4);
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r4 = 0;
        r6 = r12.a;
        r6 = com.whatsapp.Conversation.am(r6);
        r6 = java.lang.Integer.valueOf(r6);
        r3[r4] = r6;
        r2 = java.lang.String.format(r2, r3);
        r0.setText(r2);
        r5.d();
        r0 = r1;
    L_0x00d1:
        return r0;
    L_0x00d2:
        r0 = move-exception;
        throw r0;
    L_0x00d4:
        if (r14 == 0) goto L_0x012f;
    L_0x00d6:
        r0 = r14.getTag();	 Catch:{ IllegalStateException -> 0x0292 }
        if (r0 == 0) goto L_0x012f;
    L_0x00dc:
        r1 = com.whatsapp.ConversationRowsActivity.b(r6);	 Catch:{ IllegalStateException -> 0x0292 }
        r0 = r14.getTag();	 Catch:{ IllegalStateException -> 0x0292 }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ IllegalStateException -> 0x0292 }
        r0 = com.whatsapp.ConversationRowsActivity.b(r0);	 Catch:{ IllegalStateException -> 0x0292 }
        if (r1 != r0) goto L_0x012f;
    L_0x00ec:
        r14 = (com.whatsapp.ConversationRow) r14;
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x0294 }
        r0 = com.whatsapp.Conversation.B(r0);	 Catch:{ IllegalStateException -> 0x0294 }
        r1 = r6.k;	 Catch:{ IllegalStateException -> 0x0294 }
        r0 = r0.contains(r1);	 Catch:{ IllegalStateException -> 0x0294 }
        if (r0 != 0) goto L_0x0120;
    L_0x00fc:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x0296 }
        r0 = com.whatsapp.Conversation.m(r0);	 Catch:{ IllegalStateException -> 0x0296 }
        r0 = r0.contains(r6);	 Catch:{ IllegalStateException -> 0x0296 }
        if (r0 != 0) goto L_0x0120;
    L_0x0108:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x0298 }
        r0 = r0.v;	 Catch:{ IllegalStateException -> 0x0298 }
        if (r0 != 0) goto L_0x0120;
    L_0x010e:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x029a }
        r0 = com.whatsapp.Conversation.j(r0);	 Catch:{ IllegalStateException -> 0x029a }
        if (r0 != 0) goto L_0x0120;
    L_0x0116:
        r0 = r14.C;	 Catch:{ IllegalStateException -> 0x029c }
        r1 = r12.a;	 Catch:{ IllegalStateException -> 0x029c }
        r1 = com.whatsapp.Conversation.au(r1);	 Catch:{ IllegalStateException -> 0x029c }
        if (r0 == r1) goto L_0x029e;
    L_0x0120:
        r0 = 1;
    L_0x0121:
        r14.a(r6, r0);
        r0 = r12.a;
        r0 = com.whatsapp.Conversation.m(r0);
        r0.remove(r6);
        if (r4 == 0) goto L_0x02e4;
    L_0x012f:
        r0 = com.whatsapp.t4.INFLATE;
        r5.b(r0);
        r0 = r12.a;
        r3 = com.whatsapp.ConversationRowsActivity.a(r0, r6);
        r0 = com.whatsapp.t4.INFLATE;	 Catch:{ IllegalStateException -> 0x02a1 }
        r5.a(r0);	 Catch:{ IllegalStateException -> 0x02a1 }
        if (r3 != 0) goto L_0x015f;
    L_0x0141:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x02a1 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x02a1 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x02a1 }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x02a1 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x02a1 }
        r1 = com.whatsapp.util.Log.a(r6);	 Catch:{ IllegalStateException -> 0x02a1 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x02a1 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x02a1 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalStateException -> 0x02a1 }
    L_0x015f:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x02a3 }
        r0 = com.whatsapp.Conversation.au(r0);	 Catch:{ IllegalStateException -> 0x02a3 }
        r3.C = r0;	 Catch:{ IllegalStateException -> 0x02a3 }
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x02a3 }
        r0 = com.whatsapp.Conversation.B(r0);	 Catch:{ IllegalStateException -> 0x02a3 }
        r1 = r6.k;	 Catch:{ IllegalStateException -> 0x02a3 }
        r0 = r0.contains(r1);	 Catch:{ IllegalStateException -> 0x02a3 }
        if (r0 == 0) goto L_0x018d;
    L_0x0175:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x02a5 }
        r0 = com.whatsapp.Conversation.B(r0);	 Catch:{ IllegalStateException -> 0x02a5 }
        r1 = r6.k;	 Catch:{ IllegalStateException -> 0x02a5 }
        r0.remove(r1);	 Catch:{ IllegalStateException -> 0x02a5 }
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x02a5 }
        r0 = r0.e();	 Catch:{ IllegalStateException -> 0x02a5 }
        if (r0 != 0) goto L_0x018d;
    L_0x0188:
        r0 = r6.P;	 Catch:{ IllegalStateException -> 0x02a5 }
        r3.a(r0);	 Catch:{ IllegalStateException -> 0x02a5 }
    L_0x018d:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x02a7 }
        r0 = com.whatsapp.Conversation.Z(r0);	 Catch:{ IllegalStateException -> 0x02a7 }
        if (r0 == 0) goto L_0x01ac;
    L_0x0195:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x02a9 }
        r0 = com.whatsapp.Conversation.Z(r0);	 Catch:{ IllegalStateException -> 0x02a9 }
        r1 = r6.k;	 Catch:{ IllegalStateException -> 0x02a9 }
        r0 = r0.equals(r1);	 Catch:{ IllegalStateException -> 0x02a9 }
        if (r0 == 0) goto L_0x01ac;
    L_0x01a3:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x02a9 }
        r1 = 0;
        com.whatsapp.Conversation.a(r0, r1);	 Catch:{ IllegalStateException -> 0x02a9 }
        r3.f();	 Catch:{ IllegalStateException -> 0x02a9 }
    L_0x01ac:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x02ab }
        r0 = com.whatsapp.Conversation.d(r0);	 Catch:{ IllegalStateException -> 0x02ab }
        if (r0 == 0) goto L_0x01d4;
    L_0x01b4:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x02ad }
        r0 = com.whatsapp.Conversation.d(r0);	 Catch:{ IllegalStateException -> 0x02ad }
        r1 = r6.k;	 Catch:{ IllegalStateException -> 0x02ad }
        r0 = r0.equals(r1);	 Catch:{ IllegalStateException -> 0x02ad }
        if (r0 == 0) goto L_0x01d4;
    L_0x01c2:
        r0 = r12.a;	 Catch:{ IllegalStateException -> 0x02ad }
        r1 = 0;
        com.whatsapp.Conversation.b(r0, r1);	 Catch:{ IllegalStateException -> 0x02ad }
        r0 = r3.getViewTreeObserver();	 Catch:{ IllegalStateException -> 0x02ad }
        r1 = new com.whatsapp.arp;	 Catch:{ IllegalStateException -> 0x02ad }
        r1.<init>(r12, r3);	 Catch:{ IllegalStateException -> 0x02ad }
        r0.addOnPreDrawListener(r1);	 Catch:{ IllegalStateException -> 0x02ad }
    L_0x01d4:
        r1 = 0;
        r0 = 0;
        if (r13 != 0) goto L_0x01de;
    L_0x01d8:
        r2 = 1;
        r3.b(r2);	 Catch:{ IllegalStateException -> 0x02af }
        if (r4 == 0) goto L_0x01f8;
    L_0x01de:
        r0 = r13 + -1;
        r1 = r12.b(r0);
        r8 = r1.b;
        r10 = r6.b;
        r0 = com.whatsapp.util.cs.a(r8, r10);
        if (r0 != 0) goto L_0x01f4;
    L_0x01ee:
        r2 = 1;
        r3.b(r2);	 Catch:{ IllegalStateException -> 0x02b1 }
        if (r4 == 0) goto L_0x01f8;
    L_0x01f4:
        r2 = 0;
        r3.b(r2);	 Catch:{ IllegalStateException -> 0x02b1 }
    L_0x01f8:
        r2 = 0;
        if (r0 == 0) goto L_0x02e1;
    L_0x01fb:
        if (r1 == 0) goto L_0x02e1;
    L_0x01fd:
        r0 = r1.k;	 Catch:{ IllegalStateException -> 0x02b3 }
        r0 = r0.a;	 Catch:{ IllegalStateException -> 0x02b3 }
        r7 = r6.k;	 Catch:{ IllegalStateException -> 0x02b3 }
        r7 = r7.a;	 Catch:{ IllegalStateException -> 0x02b3 }
        if (r0 != r7) goto L_0x02e1;
    L_0x0207:
        r0 = r6.d;	 Catch:{ IllegalStateException -> 0x02b5 }
        r7 = 6;
        if (r0 == r7) goto L_0x02e1;
    L_0x020c:
        r0 = r1.d;	 Catch:{ IllegalStateException -> 0x02b7 }
        r7 = 6;
        if (r0 == r7) goto L_0x02e1;
    L_0x0211:
        r0 = r6.k;	 Catch:{ IllegalStateException -> 0x02b7 }
        r0 = r0.a;	 Catch:{ IllegalStateException -> 0x02b7 }
        if (r0 == 0) goto L_0x021a;
    L_0x0217:
        r0 = 1;
        if (r4 == 0) goto L_0x0229;
    L_0x021a:
        r0 = r6.t;	 Catch:{ IllegalStateException -> 0x02b9 }
        if (r0 == 0) goto L_0x0228;
    L_0x021e:
        r0 = r6.t;	 Catch:{ IllegalStateException -> 0x02bb }
        r1 = r1.t;	 Catch:{ IllegalStateException -> 0x02bb }
        r0 = r0.equals(r1);	 Catch:{ IllegalStateException -> 0x02bb }
        if (r0 == 0) goto L_0x02bd;
    L_0x0228:
        r0 = 1;
    L_0x0229:
        r1 = r13 + 1;
        r7 = r12.b(r1);
        if (r7 == 0) goto L_0x02c2;
    L_0x0231:
        r8 = r7.b;	 Catch:{ IllegalStateException -> 0x02c0 }
        r10 = r6.b;	 Catch:{ IllegalStateException -> 0x02c0 }
        r1 = com.whatsapp.util.cs.a(r8, r10);	 Catch:{ IllegalStateException -> 0x02c0 }
    L_0x0239:
        r2 = 0;
        if (r1 == 0) goto L_0x02df;
    L_0x023c:
        if (r7 == 0) goto L_0x02df;
    L_0x023e:
        r1 = r7.k;	 Catch:{ IllegalStateException -> 0x02c5 }
        r1 = r1.a;	 Catch:{ IllegalStateException -> 0x02c5 }
        r8 = r6.k;	 Catch:{ IllegalStateException -> 0x02c5 }
        r8 = r8.a;	 Catch:{ IllegalStateException -> 0x02c5 }
        if (r1 != r8) goto L_0x02df;
    L_0x0248:
        r1 = r6.d;	 Catch:{ IllegalStateException -> 0x02c7 }
        r8 = 6;
        if (r1 == r8) goto L_0x02df;
    L_0x024d:
        r1 = r7.d;	 Catch:{ IllegalStateException -> 0x02c9 }
        r8 = 6;
        if (r1 == r8) goto L_0x02df;
    L_0x0252:
        r1 = r6.k;	 Catch:{ IllegalStateException -> 0x02c9 }
        r1 = r1.a;	 Catch:{ IllegalStateException -> 0x02c9 }
        if (r1 == 0) goto L_0x025b;
    L_0x0258:
        r1 = 1;
        if (r4 == 0) goto L_0x026a;
    L_0x025b:
        r1 = r6.t;	 Catch:{ IllegalStateException -> 0x02cb }
        if (r1 == 0) goto L_0x0269;
    L_0x025f:
        r1 = r6.t;	 Catch:{ IllegalStateException -> 0x02cd }
        r2 = r7.t;	 Catch:{ IllegalStateException -> 0x02cd }
        r1 = r1.equals(r2);	 Catch:{ IllegalStateException -> 0x02cd }
        if (r1 == 0) goto L_0x02cf;
    L_0x0269:
        r1 = 1;
    L_0x026a:
        if (r0 == 0) goto L_0x0274;
    L_0x026c:
        if (r1 == 0) goto L_0x0274;
    L_0x026e:
        r2 = 2;
        r3.b(r2);	 Catch:{ IllegalStateException -> 0x02d1 }
        if (r4 == 0) goto L_0x028c;
    L_0x0274:
        if (r0 == 0) goto L_0x027e;
    L_0x0276:
        if (r1 != 0) goto L_0x027e;
    L_0x0278:
        r2 = 3;
        r3.b(r2);	 Catch:{ IllegalStateException -> 0x02d7 }
        if (r4 == 0) goto L_0x028c;
    L_0x027e:
        if (r0 != 0) goto L_0x0288;
    L_0x0280:
        if (r1 == 0) goto L_0x0288;
    L_0x0282:
        r0 = 1;
        r3.b(r0);	 Catch:{ IllegalStateException -> 0x02dd }
        if (r4 == 0) goto L_0x028c;
    L_0x0288:
        r0 = -1;
        r3.b(r0);	 Catch:{ IllegalStateException -> 0x02dd }
    L_0x028c:
        r5.d();
        r0 = r3;
        goto L_0x00d1;
    L_0x0292:
        r0 = move-exception;
        throw r0;
    L_0x0294:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0296 }
    L_0x0296:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0298 }
    L_0x0298:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x029a }
    L_0x029a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x029c }
    L_0x029c:
        r0 = move-exception;
        throw r0;
    L_0x029e:
        r0 = 0;
        goto L_0x0121;
    L_0x02a1:
        r0 = move-exception;
        throw r0;
    L_0x02a3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02a5 }
    L_0x02a5:
        r0 = move-exception;
        throw r0;
    L_0x02a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02a9 }
    L_0x02a9:
        r0 = move-exception;
        throw r0;
    L_0x02ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02ad }
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
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02b5 }
    L_0x02b5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02b7 }
    L_0x02b7:
        r0 = move-exception;
        throw r0;
    L_0x02b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02bb }
    L_0x02bb:
        r0 = move-exception;
        throw r0;
    L_0x02bd:
        r0 = 0;
        goto L_0x0229;
    L_0x02c0:
        r0 = move-exception;
        throw r0;
    L_0x02c2:
        r1 = 1;
        goto L_0x0239;
    L_0x02c5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02c7 }
    L_0x02c7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02c9 }
    L_0x02c9:
        r0 = move-exception;
        throw r0;
    L_0x02cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02cd }
    L_0x02cd:
        r0 = move-exception;
        throw r0;
    L_0x02cf:
        r1 = 0;
        goto L_0x026a;
    L_0x02d1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02d3 }
    L_0x02d3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02d5 }
    L_0x02d5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02d7 }
    L_0x02d7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02d9 }
    L_0x02d9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02db }
    L_0x02db:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02dd }
    L_0x02dd:
        r0 = move-exception;
        throw r0;
    L_0x02df:
        r1 = r2;
        goto L_0x026a;
    L_0x02e1:
        r0 = r2;
        goto L_0x0229;
    L_0x02e4:
        r3 = r14;
        goto L_0x015f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a4l.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private int a() {
        return getCursor().getCount() - Conversation.f(this.a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.protocol.co b(int r6) {
        /*
        r5 = this;
        r2 = 1;
        r0 = 0;
        r1 = 0;
        r3 = r5.getCursor();
        r3 = r3.getCount();
        r4 = r5.a;	 Catch:{ IllegalStateException -> 0x004d }
        r4 = com.whatsapp.Conversation.f(r4);	 Catch:{ IllegalStateException -> 0x004d }
        if (r4 <= 0) goto L_0x0014;
    L_0x0013:
        r1 = r2;
    L_0x0014:
        r1 = r6 - r1;
        if (r1 >= r3) goto L_0x00da;
    L_0x0018:
        r0 = r5.a;
        r0 = com.whatsapp.Conversation.b(r0);
        r1 = java.lang.Integer.valueOf(r6);
        r0 = r0.get(r1);
        r0 = (com.whatsapp.protocol.co) r0;
        if (r0 != 0) goto L_0x004c;
    L_0x002a:
        r0 = r5.a;	 Catch:{ IllegalStateException -> 0x004f }
        r0 = com.whatsapp.Conversation.f(r0);	 Catch:{ IllegalStateException -> 0x004f }
        if (r0 <= 0) goto L_0x0055;
    L_0x0032:
        r0 = r5.a();	 Catch:{ IllegalStateException -> 0x0051 }
        if (r6 != r0) goto L_0x0055;
    L_0x0038:
        r0 = r5.c;	 Catch:{ IllegalStateException -> 0x0053 }
        if (r0 != 0) goto L_0x004a;
    L_0x003c:
        r0 = new com.whatsapp.protocol.co;	 Catch:{ IllegalStateException -> 0x0053 }
        r1 = 0;
        r2 = z;	 Catch:{ IllegalStateException -> 0x0053 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0053 }
        r3 = 0;
        r0.<init>(r1, r2, r3);	 Catch:{ IllegalStateException -> 0x0053 }
        r5.c = r0;	 Catch:{ IllegalStateException -> 0x0053 }
    L_0x004a:
        r0 = r5.c;
    L_0x004c:
        return r0;
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = r5.a;	 Catch:{ IllegalStateException -> 0x00d4 }
        r0 = com.whatsapp.Conversation.f(r0);	 Catch:{ IllegalStateException -> 0x00d4 }
        if (r0 <= 0) goto L_0x0069;
    L_0x005d:
        r0 = r5.a();	 Catch:{ IllegalStateException -> 0x00d4 }
        if (r6 <= r0) goto L_0x0069;
    L_0x0063:
        r0 = r6 + -1;
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x006a;
    L_0x0069:
        r0 = r6;
    L_0x006a:
        r1 = r5.a;
        r1 = r1.bd;
        r1 = r1.getCursor();
        r1 = r1.getPosition();
        r2 = r5.a;
        r2 = r2.bd;
        r2 = r2.getCursor();
        r3 = r3 + -1;
        r0 = r3 - r0;
        r2.moveToPosition(r0);
        r0 = r5.a;
        r0 = r0.bd;
        r0 = r0.getCursor();
        r2 = r0.getPosition();
        r0 = com.whatsapp.App.aK;
        r3 = r5.a;
        r3 = r3.bd;
        r3 = r3.getCursor();
        r4 = r5.a;
        r4 = r4.ae;
        r0 = r0.a(r3, r4);
        if (r2 >= r1) goto L_0x00c5;
    L_0x00a5:
        r1 = r5.b;	 Catch:{ IllegalStateException -> 0x00d6 }
        if (r2 <= r1) goto L_0x00af;
    L_0x00a9:
        r1 = r5.b;	 Catch:{ IllegalStateException -> 0x00d8 }
        r1 = r1 + 50;
        if (r2 <= r1) goto L_0x00c5;
    L_0x00af:
        r1 = 0;
        r2 = r2 + -50;
        r1 = java.lang.Math.max(r1, r2);	 Catch:{ IllegalStateException -> 0x00d8 }
        r5.b = r1;	 Catch:{ IllegalStateException -> 0x00d8 }
        r1 = r5.a;	 Catch:{ IllegalStateException -> 0x00d8 }
        r1 = r1.bd;	 Catch:{ IllegalStateException -> 0x00d8 }
        r1 = r1.getCursor();	 Catch:{ IllegalStateException -> 0x00d8 }
        r2 = r5.b;	 Catch:{ IllegalStateException -> 0x00d8 }
        r1.moveToPosition(r2);	 Catch:{ IllegalStateException -> 0x00d8 }
    L_0x00c5:
        r1 = r5.a;
        r1 = com.whatsapp.Conversation.b(r1);
        r2 = java.lang.Integer.valueOf(r6);
        r1.put(r2, r0);
        goto L_0x004c;
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r1 = r6 - r3;
        r4 = r5.a;	 Catch:{ IllegalStateException -> 0x0102 }
        r4 = com.whatsapp.Conversation.f(r4);	 Catch:{ IllegalStateException -> 0x0102 }
        if (r4 <= 0) goto L_0x00e6;
    L_0x00e4:
        r1 = r1 + -1;
    L_0x00e6:
        if (r1 < 0) goto L_0x0106;
    L_0x00e8:
        r4 = r5.a;	 Catch:{ IllegalStateException -> 0x0104 }
        r4 = com.whatsapp.Conversation.aj(r4);	 Catch:{ IllegalStateException -> 0x0104 }
        r4 = r4.size();	 Catch:{ IllegalStateException -> 0x0104 }
        if (r1 >= r4) goto L_0x0106;
    L_0x00f4:
        r0 = r5.a;
        r0 = com.whatsapp.Conversation.aj(r0);
        r0 = r0.get(r1);
        r0 = (com.whatsapp.protocol.co) r0;
        goto L_0x004c;
    L_0x0102:
        r0 = move-exception;
        throw r0;
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r2 = r4[r2];
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r2 = z;
        r4 = 3;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.a;
        r2 = com.whatsapp.Conversation.aj(r2);
        r2 = r2.size();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a4l.b(int):com.whatsapp.protocol.co");
    }

    static void a(a4l com_whatsapp_a4l, int i) {
        com_whatsapp_a4l.a(i);
    }

    public int getViewTypeCount() {
        try {
            return (Conversation.f(this.a) > 0 ? 1 : 0) + 21;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int getCount() {
        int i = 0;
        try {
            if (!Conversation.K(this.a)) {
                return 0;
            }
            if (getCursor() == null) {
                return 0;
            }
            try {
                int count = getCursor().getCount() + Conversation.aj(this.a).size();
                if (Conversation.f(this.a) > 0) {
                    i = 1;
                }
                return i + count;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public boolean hasStableIds() {
        return true;
    }

    public a4l(Conversation conversation, Context context, Cursor cursor, boolean z) {
        this.a = conversation;
        super(context, cursor, z);
    }

    public int getItemViewType(int i) {
        try {
            if (!Conversation.K(this.a)) {
                return -1;
            }
            try {
                if (Conversation.f(this.a) > 0) {
                    if (i == a()) {
                        return 20;
                    }
                }
                return ConversationRowsActivity.b(b(i));
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private void a(int i) {
        boolean z = DialogToastActivity.f;
        int count = getCursor().getCount();
        if (i < count) {
            int i2 = i;
            while (i2 < count) {
                if (((co) Conversation.b(this.a).get(Integer.valueOf(i2))) != null) {
                    try {
                        Conversation.b(this.a).remove(Integer.valueOf(i2));
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                int i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
            }
            if (!z) {
                return;
            }
        }
        Log.w(z[4]);
        Conversation.aj(this.a).remove(i - count);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void bindView(View view, Context context, Cursor cursor) {
    }

    public void notifyDataSetChanged() {
        try {
            if (!Conversation.an(this.a)) {
                super.notifyDataSetChanged();
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            try {
                if (Conversation.ax(this.a)) {
                    Conversation.i(this.a, false);
                    Conversation.d(this.a, false);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }
}
