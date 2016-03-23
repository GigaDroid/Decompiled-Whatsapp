package com.whatsapp;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.RelativeLayout;
import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.at;

public class BubbleRelativeLayout extends RelativeLayout {
    private static final Drawable b;
    private static final Drawable d;
    private static final Drawable j;
    static Rect l;
    private static final Drawable m;
    static Rect n;
    private static final String z;
    boolean a;
    private Paint c;
    co e;
    private int f;
    private rj g;
    public int h;
    boolean i;
    private int k;
    private int o;
    private float p;
    Rect q;

    int b() {
        return a4d.a().t;
    }

    static float a(BubbleRelativeLayout bubbleRelativeLayout, float f) {
        bubbleRelativeLayout.p = f;
        return f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r12) {
        /*
        r11 = this;
        r1 = 0;
        r7 = 1;
        r6 = 0;
        r8 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.p;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x0051;
    L_0x000b:
        r0 = 1117388800; // 0x429a0000 float:77.0 double:5.52063419E-315;
        r2 = r11.p;
        r0 = r0 * r2;
        r0 = (int) r0;
        r0 = r0 << 24;
        r2 = 3388901; // 0x33b5e5 float:4.748862E-39 double:1.6743396E-317;
        r0 = r0 | r2;
        r2 = r11.c;	 Catch:{ OutOfMemoryError -> 0x012b }
        if (r2 != 0) goto L_0x0023;
    L_0x001b:
        r2 = new android.graphics.Paint;	 Catch:{ OutOfMemoryError -> 0x012b }
        r3 = 1;
        r2.<init>(r3);	 Catch:{ OutOfMemoryError -> 0x012b }
        r11.c = r2;	 Catch:{ OutOfMemoryError -> 0x012b }
    L_0x0023:
        r2 = r11.c;
        r2.setColor(r0);
        r0 = r11.f;
        r2 = l;
        r2 = r2.top;
        r0 = r0 - r2;
        r2 = com.whatsapp.a4d.a();
        r2 = r2.b;
        r0 = r0 - r2;
        r2 = (float) r0;
        r0 = r11.getWidth();
        r3 = (float) r0;
        r0 = r11.o;
        r4 = l;
        r4 = r4.bottom;
        r0 = r0 + r4;
        r4 = com.whatsapp.a4d.a();
        r4 = r4.s;
        r0 = r0 + r4;
        r4 = (float) r0;
        r5 = r11.c;
        r0 = r12;
        r0.drawRect(r1, r2, r3, r4, r5);
    L_0x0051:
        r0 = r11.isSelected();	 Catch:{ OutOfMemoryError -> 0x012d }
        if (r0 != 0) goto L_0x0063;
    L_0x0057:
        r0 = r11.isPressed();	 Catch:{ OutOfMemoryError -> 0x012d }
        if (r0 != 0) goto L_0x0063;
    L_0x005d:
        r0 = r11.isFocused();	 Catch:{ OutOfMemoryError -> 0x012f }
        if (r0 == 0) goto L_0x0133;
    L_0x0063:
        r0 = r7;
    L_0x0064:
        r2 = r11.i;	 Catch:{ OutOfMemoryError -> 0x0136 }
        if (r2 == 0) goto L_0x0228;
    L_0x0068:
        if (r0 == 0) goto L_0x0228;
    L_0x006a:
        r0 = r11.c;	 Catch:{ OutOfMemoryError -> 0x0138 }
        if (r0 != 0) goto L_0x0076;
    L_0x006e:
        r0 = new android.graphics.Paint;	 Catch:{ OutOfMemoryError -> 0x013a }
        r2 = 1;
        r0.<init>(r2);	 Catch:{ OutOfMemoryError -> 0x013a }
        r11.c = r0;	 Catch:{ OutOfMemoryError -> 0x013a }
    L_0x0076:
        r0 = r11.c;
        r2 = 1295234533; // 0x4d33b5e5 float:1.88440144E8 double:6.39930886E-315;
        r0.setColor(r2);
        r0 = r11.getWidth();
        r3 = (float) r0;
        r0 = r11.getHeight();
        r4 = (float) r0;
        r5 = r11.c;
        r0 = r12;
        r2 = r1;
        r0.drawRect(r1, r2, r3, r4, r5);
        r3 = r6;
    L_0x0090:
        r0 = r11.e;	 Catch:{ OutOfMemoryError -> 0x013c }
        r0 = r0.d;	 Catch:{ OutOfMemoryError -> 0x013c }
        r1 = -1;
        if (r0 == r1) goto L_0x0127;
    L_0x0097:
        r0 = r11.e;	 Catch:{ OutOfMemoryError -> 0x013c }
        r0 = r0.d;	 Catch:{ OutOfMemoryError -> 0x013c }
        r1 = 6;
        if (r0 != r1) goto L_0x00a6;
    L_0x009e:
        r0 = r11.e;	 Catch:{ OutOfMemoryError -> 0x013e }
        r0 = r0.c;	 Catch:{ OutOfMemoryError -> 0x013e }
        r1 = 8;
        if (r0 != r1) goto L_0x0127;
    L_0x00a6:
        r0 = r11.a();
        r1 = (int) r0;
        r0 = r11.e;	 Catch:{ OutOfMemoryError -> 0x0140 }
        r0 = r0.k;	 Catch:{ OutOfMemoryError -> 0x0140 }
        r0 = r0.a;	 Catch:{ OutOfMemoryError -> 0x0140 }
        if (r0 == 0) goto L_0x017e;
    L_0x00b3:
        r4 = r11.q;	 Catch:{ OutOfMemoryError -> 0x0140 }
        r0 = com.whatsapp.App.a1();	 Catch:{ OutOfMemoryError -> 0x0140 }
        r2 = r11.i;	 Catch:{ OutOfMemoryError -> 0x0140 }
        if (r0 == r2) goto L_0x0144;
    L_0x00bd:
        r0 = r11.getWidth();	 Catch:{ OutOfMemoryError -> 0x0142 }
        r0 = r0 - r1;
        r2 = r0;
    L_0x00c3:
        r0 = r11.f;	 Catch:{ OutOfMemoryError -> 0x0147 }
        r5 = l;	 Catch:{ OutOfMemoryError -> 0x0147 }
        r5 = r5.top;	 Catch:{ OutOfMemoryError -> 0x0147 }
        r5 = r0 - r5;
        r0 = com.whatsapp.App.a1();	 Catch:{ OutOfMemoryError -> 0x0147 }
        r9 = r11.i;	 Catch:{ OutOfMemoryError -> 0x0147 }
        if (r0 == r9) goto L_0x0149;
    L_0x00d3:
        r0 = r11.getWidth();	 Catch:{ OutOfMemoryError -> 0x0147 }
    L_0x00d7:
        r9 = r11.o;
        r10 = l;
        r10 = r10.bottom;
        r9 = r9 + r10;
        r4.set(r2, r5, r0, r9);
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x0162 }
        switch(r0) {
            case 2: goto L_0x014b;
            case 3: goto L_0x014b;
            default: goto L_0x00e6;
        };
    L_0x00e6:
        if (r3 == 0) goto L_0x01dd;
    L_0x00e8:
        r0 = r11.getContext();	 Catch:{ OutOfMemoryError -> 0x01db }
        r0 = r0.getResources();	 Catch:{ OutOfMemoryError -> 0x01db }
        r2 = 2130837627; // 0x7f02007b float:1.7280213E38 double:1.0527736684E-314;
        r0 = r0.getDrawable(r2);	 Catch:{ OutOfMemoryError -> 0x01db }
    L_0x00f7:
        r2 = r0;
    L_0x00f8:
        r4 = r11.q;	 Catch:{ OutOfMemoryError -> 0x01e1 }
        r0 = com.whatsapp.App.a1();	 Catch:{ OutOfMemoryError -> 0x01e1 }
        r5 = r11.i;	 Catch:{ OutOfMemoryError -> 0x01e1 }
        if (r0 == r5) goto L_0x01e3;
    L_0x0102:
        r0 = r11.b();	 Catch:{ OutOfMemoryError -> 0x01e1 }
        r0 = -r0;
    L_0x0107:
        r5 = 0;
        r4.offset(r0, r5);	 Catch:{ OutOfMemoryError -> 0x01e9 }
        if (r2 == 0) goto L_0x0127;
    L_0x010d:
        r4 = new com.whatsapp.util.bz;	 Catch:{ OutOfMemoryError -> 0x01e9 }
        r0 = r11.i;	 Catch:{ OutOfMemoryError -> 0x01e9 }
        r5 = com.whatsapp.App.a1();	 Catch:{ OutOfMemoryError -> 0x01e9 }
        if (r0 != r5) goto L_0x01ed;
    L_0x0117:
        r0 = r7;
    L_0x0118:
        r4.<init>(r2, r0);	 Catch:{ OutOfMemoryError -> 0x0162 }
        r0 = 1;
        r4.setDither(r0);	 Catch:{ OutOfMemoryError -> 0x0162 }
        r0 = r11.q;	 Catch:{ OutOfMemoryError -> 0x0162 }
        r4.setBounds(r0);	 Catch:{ OutOfMemoryError -> 0x0162 }
        r4.draw(r12);	 Catch:{ OutOfMemoryError -> 0x0162 }
    L_0x0127:
        super.onDraw(r12);
        return;
    L_0x012b:
        r0 = move-exception;
        throw r0;
    L_0x012d:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x012f }
    L_0x012f:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0131 }
    L_0x0131:
        r0 = move-exception;
        throw r0;
    L_0x0133:
        r0 = r6;
        goto L_0x0064;
    L_0x0136:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0138 }
    L_0x0138:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x013a }
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x013e }
    L_0x013e:
        r0 = move-exception;
        throw r0;
    L_0x0140:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0142 }
    L_0x0142:
        r0 = move-exception;
        throw r0;
    L_0x0144:
        r2 = r6;
        goto L_0x00c3;
    L_0x0147:
        r0 = move-exception;
        throw r0;
    L_0x0149:
        r0 = r1;
        goto L_0x00d7;
    L_0x014b:
        if (r3 == 0) goto L_0x01d8;
    L_0x014d:
        r0 = r11.getContext();	 Catch:{ OutOfMemoryError -> 0x0160 }
        r0 = r0.getResources();	 Catch:{ OutOfMemoryError -> 0x0160 }
        r2 = 2130837628; // 0x7f02007c float:1.7280215E38 double:1.052773669E-314;
        r0 = r0.getDrawable(r2);	 Catch:{ OutOfMemoryError -> 0x0160 }
    L_0x015c:
        if (r8 != 0) goto L_0x00e6;
    L_0x015e:
        r2 = r0;
        goto L_0x00f8;
    L_0x0160:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0162 }
    L_0x0162:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x01f0 }
        r2.<init>();	 Catch:{ OutOfMemoryError -> 0x01f0 }
        r4 = z;	 Catch:{ OutOfMemoryError -> 0x01f0 }
        r2 = r2.append(r4);	 Catch:{ OutOfMemoryError -> 0x01f0 }
        r0 = r2.append(r0);	 Catch:{ OutOfMemoryError -> 0x01f0 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x01f0 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ OutOfMemoryError -> 0x01f0 }
        com.whatsapp.util.ag.b();	 Catch:{ OutOfMemoryError -> 0x01f0 }
        if (r8 == 0) goto L_0x0127;
    L_0x017e:
        r2 = r11.q;	 Catch:{ OutOfMemoryError -> 0x01f2 }
        r0 = com.whatsapp.App.a1();	 Catch:{ OutOfMemoryError -> 0x01f2 }
        if (r0 == 0) goto L_0x01f4;
    L_0x0186:
        r0 = r6;
    L_0x0187:
        r4 = r11.f;	 Catch:{ OutOfMemoryError -> 0x01fa }
        r5 = n;	 Catch:{ OutOfMemoryError -> 0x01fa }
        r5 = r5.top;	 Catch:{ OutOfMemoryError -> 0x01fa }
        r4 = r4 - r5;
        r5 = com.whatsapp.App.a1();	 Catch:{ OutOfMemoryError -> 0x01fa }
        if (r5 == 0) goto L_0x01fc;
    L_0x0194:
        r5 = r11.o;
        r8 = n;
        r8 = r8.bottom;
        r5 = r5 + r8;
        r2.set(r0, r4, r1, r5);
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x0214 }
        switch(r0) {
            case 2: goto L_0x0201;
            case 3: goto L_0x0201;
            default: goto L_0x01a3;
        };
    L_0x01a3:
        if (r3 == 0) goto L_0x021d;
    L_0x01a5:
        r0 = r11.getContext();	 Catch:{ OutOfMemoryError -> 0x021b }
        r0 = r0.getResources();	 Catch:{ OutOfMemoryError -> 0x021b }
        r1 = 2130837621; // 0x7f020075 float:1.7280201E38 double:1.0527736654E-314;
        r0 = r0.getDrawable(r1);	 Catch:{ OutOfMemoryError -> 0x021b }
    L_0x01b4:
        r1 = r0;
    L_0x01b5:
        r2 = r11.q;	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0 = com.whatsapp.App.a1();	 Catch:{ OutOfMemoryError -> 0x0220 }
        if (r0 == 0) goto L_0x0222;
    L_0x01bd:
        r0 = r11.b();	 Catch:{ OutOfMemoryError -> 0x0220 }
    L_0x01c1:
        r2.offset(r0, r6);
        if (r1 == 0) goto L_0x0127;
    L_0x01c6:
        r0 = new com.whatsapp.util.bz;
        r0.<init>(r1);
        r1 = r11.q;
        r0.setBounds(r1);
        r0.setDither(r7);
        r0.draw(r12);
        goto L_0x0127;
    L_0x01d8:
        r0 = m;	 Catch:{ OutOfMemoryError -> 0x0162 }
        goto L_0x015c;
    L_0x01db:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0162 }
    L_0x01dd:
        r0 = b;	 Catch:{ OutOfMemoryError -> 0x0162 }
        goto L_0x00f7;
    L_0x01e1:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0162 }
    L_0x01e3:
        r0 = r11.b();	 Catch:{ OutOfMemoryError -> 0x0162 }
        goto L_0x0107;
    L_0x01e9:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x01eb }
    L_0x01eb:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0162 }
    L_0x01ed:
        r0 = r6;
        goto L_0x0118;
    L_0x01f0:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x01f2 }
    L_0x01f2:
        r0 = move-exception;
        throw r0;
    L_0x01f4:
        r0 = r11.getWidth();
        r0 = r0 - r1;
        goto L_0x0187;
    L_0x01fa:
        r0 = move-exception;
        throw r0;
    L_0x01fc:
        r1 = r11.getWidth();
        goto L_0x0194;
    L_0x0201:
        if (r3 == 0) goto L_0x0218;
    L_0x0203:
        r0 = r11.getContext();	 Catch:{ OutOfMemoryError -> 0x0216 }
        r0 = r0.getResources();	 Catch:{ OutOfMemoryError -> 0x0216 }
        r1 = 2130837622; // 0x7f020076 float:1.7280203E38 double:1.052773666E-314;
        r0 = r0.getDrawable(r1);	 Catch:{ OutOfMemoryError -> 0x0216 }
    L_0x0212:
        r1 = r0;
        goto L_0x01b5;
    L_0x0214:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0216 }
    L_0x0216:
        r0 = move-exception;
        throw r0;
    L_0x0218:
        r0 = j;
        goto L_0x0212;
    L_0x021b:
        r0 = move-exception;
        throw r0;
    L_0x021d:
        r0 = d;
        goto L_0x01b4;
    L_0x0220:
        r0 = move-exception;
        throw r0;
    L_0x0222:
        r0 = r11.b();
        r0 = -r0;
        goto L_0x01c1;
    L_0x0228:
        r3 = r0;
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.BubbleRelativeLayout.onDraw(android.graphics.Canvas):void");
    }

    public void d() {
        this.g = new rj(this, null);
        this.g.setDuration(2400);
        this.g.setInterpolator(new AccelerateInterpolator());
        startAnimation(this.g);
    }

    static {
        char[] toCharArray = "_p]_WXZMbW\\|PHO\u0012bMX^SZ]HY_iZ\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = 5;
                    break;
                case at.i /*2*/:
                    i2 = 63;
                    break;
                case at.o /*3*/:
                    i2 = 61;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        b = App.z().getResources().getDrawable(2130837625);
        m = App.z().getResources().getDrawable(2130837626);
        d = App.z().getResources().getDrawable(2130837619);
        j = App.z().getResources().getDrawable(2130837620);
        l = new Rect();
        n = new Rect();
        b.getPadding(l);
        d.getPadding(n);
    }

    public View c() {
        return getChildAt(1);
    }

    public BubbleRelativeLayout(Context context, co coVar) {
        super(context);
        this.q = new Rect();
        this.h = -1;
        this.e = coVar;
    }

    protected float a() {
        View c = c();
        this.f = c.getTop();
        this.o = c.getBottom();
        this.k = c.getMeasuredWidth();
        this.a = qm.i(this.e.k.c);
        return (float) ((this.e.k.a ? l.left + l.right : n.left + n.right) + this.k);
    }
}
