package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

class bx implements OnGlobalLayoutListener {
    private static final String[] z;
    final TextView a;
    final View b;
    final cc c;

    static {
        String[] strArr = new String[5];
        String str = "\u0003-P[\u001a\u0016+LZ\u0017\"+LY\nX9L[\u001d::K@-\u0005*KV\u0018\u00036J[\nW,N\\\t\u0007:A";
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
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 37;
                        break;
                    case at.o /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0003-P[\u001a\u0016+LZ\u0017\"+LY\nX9L[\u001d::K@-\u0005*KV\u0018\u00036J[\nW,LQCW";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0003-P[\u001a\u0016+LZ\u0017\"+LY\nX9L[\u001d::K@-\u0005*KV\u0018\u00036J[\nW+@M\rM\u007f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0003-P[\u001a\u0016+LZ\u0017\"+LY\nX9L[\u001d::K@-\u0005*KV\u0018\u00036J[\nW\u001bJ[^\u0003\u007fQT\u0012\u0012\u007fVF";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0003-P[\u001a\u0016+LZ\u0017\"+LY\nX9L[\u001d::K@-\u0005*KV\u0018\u00036J[\nW4@LCW";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
        r10 = this;
        r9 = 1;
        r8 = 0;
        r2 = com.whatsapp.util.Log.h;
        r0 = r10.b;
        r0 = r0.getHeight();
        r1 = r10.b;
        r1 = r1.getWidth();
        r0 = r0 * r1;
        r0 = (long) r0;
        r3 = r10.b;
        r3 = r3.hashCode();
        r4 = (long) r3;
        r3 = r10.b;
        r6 = r3.getDrawingTime();
        r4 = r4 + r6;
        r0 = r0 + r4;
        r3 = com.whatsapp.util.u.n;
        if (r3 == 0) goto L_0x002f;
    L_0x0025:
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        if (r2 == 0) goto L_0x0052;
    L_0x002f:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r4 = r4[r9];
        r3 = r3.append(r4);
        r3 = r3.append(r0);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = r10.a;
        r4 = r10.c;
        r4 = r4.b;
        r4 = r4.a;
        com.whatsapp.util.u.b(r3, r0, r9, r4);
    L_0x0052:
        r3 = com.whatsapp.util.u.e();
        if (r3 == 0) goto L_0x0066;
    L_0x0058:
        r3 = com.whatsapp.util.u.e();
        r4 = java.lang.Long.valueOf(r0);
        r3 = r3.containsKey(r4);
        if (r3 != 0) goto L_0x006e;
    L_0x0066:
        r0 = z;
        r0 = r0[r8];
        com.whatsapp.util.Log.i(r0);
    L_0x006d:
        return;
    L_0x006e:
        r3 = com.whatsapp.util.u.e();
        r0 = java.lang.Long.valueOf(r0);
        r0 = r3.get(r0);
        r0 = (java.lang.Integer) r0;
        r3 = r0.intValue();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r4 = 2;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r10.a;
        r0 = r0.getLayout();
        r1 = r10.a;
        r4 = r1.getPaint();
        r1 = r10.a;
        r1 = r1.getText();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 3;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r1);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r5 = r10.a;
        r5 = r5.getLineCount();
        if (r5 <= 0) goto L_0x00de;
    L_0x00cc:
        r6 = r5 + -1;
        r6 = r0.getLineStart(r6);
        r5 = r5 + -1;
        r0 = r0.getLineEnd(r5);
        r0 = r1.subSequence(r6, r0);
        if (r2 == 0) goto L_0x00df;
    L_0x00de:
        r0 = r1;
    L_0x00df:
        r1 = r1.toString();
        r5 = r10.a;
        r5 = r5.getWidth();
        r6 = r10.a;
        r6 = r6.getCompoundPaddingLeft();
        r5 = r5 - r6;
        r6 = r10.a;
        r6 = r6.getCompoundPaddingRight();
        r5 = r5 - r6;
        r5 = (float) r5;
        r6 = r0.length();
        r4 = r4.measureText(r0, r8, r6);
        r0 = 0;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x006d;
    L_0x0105:
        r0 = r10.a;
        r0 = com.whatsapp.util.u.a(r0);
        if (r0 == 0) goto L_0x006d;
    L_0x010d:
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x006d;
    L_0x0113:
        r0 = com.whatsapp.util.u.f();
        if (r0 == 0) goto L_0x006d;
    L_0x0119:
        r6 = new org.json.JSONArray;
        r6.<init>();
        r0 = 10;
        if (r3 >= r0) goto L_0x017d;
    L_0x0122:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = "0";
        r0 = r0.append(r7);
        r0 = r0.append(r3);
        r0 = r0.toString();
    L_0x0136:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r7 = com.whatsapp.util.u.c();
        r3 = r3.append(r7);
        r7 = "-";
        r3 = r3.append(r7);
        r0 = r3.append(r0);
        r0 = r0.toString();
        r6.put(r0);
        r6.put(r1);
        r0 = (double) r5;
        r0 = java.lang.Double.valueOf(r0);
        r6.put(r0);
        r0 = (double) r4;
        r0 = java.lang.Double.valueOf(r0);
        r6.put(r0);
        r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r0 <= 0) goto L_0x0171;
    L_0x016c:
        r6.put(r9);
        if (r2 == 0) goto L_0x0174;
    L_0x0171:
        r6.put(r8);
    L_0x0174:
        r0 = com.whatsapp.util.u.b();
        r0.put(r6);
        goto L_0x006d;
    L_0x017d:
        r0 = java.lang.String.valueOf(r3);
        goto L_0x0136;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bx.onGlobalLayout():void");
    }

    bx(cc ccVar, View view, TextView textView) {
        this.c = ccVar;
        this.b = view;
        this.a = textView;
    }
}
