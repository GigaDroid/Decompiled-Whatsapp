package com.whatsapp.wallpaper;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.whatsapp.WAAppCompatActivity;

class l {
    private final Paint a;
    boolean b;
    Rect c;
    RectF d;
    private a e;
    private boolean f;
    private int g;
    private boolean h;
    Matrix i;
    private RectF j;
    private final Paint k;
    View l;
    private final Paint m;
    private float n;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void b(int r8, float r9, float r10) {
        /*
        r7 = this;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = 0;
        r2 = com.whatsapp.wallpaper.CropImage.c;
        r1 = r8 & 6;
        if (r1 != 0) goto L_0x01f5;
    L_0x0009:
        r1 = r0;
    L_0x000a:
        r3 = r8 & 24;
        if (r3 != 0) goto L_0x000f;
    L_0x000e:
        r10 = r0;
    L_0x000f:
        r3 = r7.h;
        if (r3 == 0) goto L_0x0024;
    L_0x0013:
        r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r3 == 0) goto L_0x001d;
    L_0x0017:
        r3 = r7.n;
        r10 = r1 / r3;
        if (r2 == 0) goto L_0x0024;
    L_0x001d:
        r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r3 == 0) goto L_0x0024;
    L_0x0021:
        r1 = r7.n;
        r1 = r1 * r10;
    L_0x0024:
        r3 = new android.graphics.RectF;
        r4 = r7.d;
        r3.<init>(r4);
        r4 = r7.h;
        if (r4 == 0) goto L_0x003c;
    L_0x002f:
        r4 = r8 & 18;
        r5 = 18;
        if (r4 == r5) goto L_0x003b;
    L_0x0035:
        r4 = r8 & 12;
        r5 = 12;
        if (r4 != r5) goto L_0x003c;
    L_0x003b:
        r10 = -r10;
    L_0x003c:
        r4 = r8 & 2;
        if (r4 == 0) goto L_0x0061;
    L_0x0040:
        r4 = r3.left;
        r4 = r4 + r1;
        r3.left = r4;
        r4 = r7.h;
        if (r4 == 0) goto L_0x0061;
    L_0x0049:
        r4 = r8 & 16;
        if (r4 != 0) goto L_0x0061;
    L_0x004d:
        r4 = r8 & 8;
        if (r4 != 0) goto L_0x0061;
    L_0x0051:
        r4 = r3.top;
        r5 = r10 / r6;
        r4 = r4 + r5;
        r3.top = r4;
        r4 = r3.bottom;
        r5 = r10 / r6;
        r5 = r10 - r5;
        r4 = r4 - r5;
        r3.bottom = r4;
    L_0x0061:
        r4 = r8 & 4;
        if (r4 == 0) goto L_0x0086;
    L_0x0065:
        r4 = r3.right;
        r4 = r4 + r1;
        r3.right = r4;
        r4 = r7.h;
        if (r4 == 0) goto L_0x0086;
    L_0x006e:
        r4 = r8 & 16;
        if (r4 != 0) goto L_0x0086;
    L_0x0072:
        r4 = r8 & 8;
        if (r4 != 0) goto L_0x0086;
    L_0x0076:
        r4 = r3.top;
        r5 = r10 / r6;
        r5 = r10 - r5;
        r4 = r4 - r5;
        r3.top = r4;
        r4 = r3.bottom;
        r5 = r10 / r6;
        r4 = r4 + r5;
        r3.bottom = r4;
    L_0x0086:
        r4 = r8 & 8;
        if (r4 == 0) goto L_0x00ab;
    L_0x008a:
        r4 = r3.top;
        r4 = r4 + r10;
        r3.top = r4;
        r4 = r7.h;
        if (r4 == 0) goto L_0x00ab;
    L_0x0093:
        r4 = r8 & 2;
        if (r4 != 0) goto L_0x00ab;
    L_0x0097:
        r4 = r8 & 4;
        if (r4 != 0) goto L_0x00ab;
    L_0x009b:
        r4 = r3.left;
        r5 = r1 / r6;
        r4 = r4 + r5;
        r3.left = r4;
        r4 = r3.right;
        r5 = r1 / r6;
        r5 = r1 - r5;
        r4 = r4 - r5;
        r3.right = r4;
    L_0x00ab:
        r4 = r8 & 16;
        if (r4 == 0) goto L_0x00cf;
    L_0x00af:
        r4 = r3.bottom;
        r4 = r4 + r10;
        r3.bottom = r4;
        r4 = r7.h;
        if (r4 == 0) goto L_0x00cf;
    L_0x00b8:
        r4 = r8 & 2;
        if (r4 != 0) goto L_0x00cf;
    L_0x00bc:
        r4 = r8 & 4;
        if (r4 != 0) goto L_0x00cf;
    L_0x00c0:
        r4 = r3.left;
        r5 = r1 / r6;
        r5 = r1 - r5;
        r4 = r4 - r5;
        r3.left = r4;
        r4 = r3.right;
        r1 = r1 / r6;
        r1 = r1 + r4;
        r3.right = r1;
    L_0x00cf:
        r1 = 1103626240; // 0x41c80000 float:25.0 double:5.45263811E-315;
        r4 = r7.g;
        r4 = (float) r4;
        r1 = java.lang.Math.max(r1, r4);
        r4 = r3.width();
        r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r4 >= 0) goto L_0x0101;
    L_0x00e0:
        r4 = r8 & 2;
        if (r4 == 0) goto L_0x00eb;
    L_0x00e4:
        r4 = r3.right;
        r4 = r4 - r1;
        r3.left = r4;
        if (r2 == 0) goto L_0x0101;
    L_0x00eb:
        r4 = r8 & 4;
        if (r4 == 0) goto L_0x00f6;
    L_0x00ef:
        r4 = r3.left;
        r4 = r4 + r1;
        r3.right = r4;
        if (r2 == 0) goto L_0x0101;
    L_0x00f6:
        r4 = r3.width();
        r4 = r1 - r4;
        r4 = -r4;
        r4 = r4 / r6;
        r3.inset(r4, r0);
    L_0x0101:
        r4 = r7.h;
        if (r4 == 0) goto L_0x0108;
    L_0x0105:
        r4 = r7.n;
        r1 = r1 / r4;
    L_0x0108:
        r4 = r3.height();
        r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r4 >= 0) goto L_0x0130;
    L_0x0110:
        r4 = r8 & 8;
        if (r4 == 0) goto L_0x011b;
    L_0x0114:
        r4 = r3.bottom;
        r4 = r4 - r1;
        r3.top = r4;
        if (r2 == 0) goto L_0x0130;
    L_0x011b:
        r4 = r8 & 16;
        if (r4 == 0) goto L_0x0126;
    L_0x011f:
        r4 = r3.top;
        r4 = r4 + r1;
        r3.bottom = r4;
        if (r2 == 0) goto L_0x0130;
    L_0x0126:
        r4 = r3.height();
        r1 = r1 - r4;
        r1 = -r1;
        r1 = r1 / r6;
        r3.inset(r0, r1);
    L_0x0130:
        r1 = r3.width();
        r4 = r7.j;
        r4 = r4.width();
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x015b;
    L_0x013e:
        r1 = r3.left;
        r4 = r7.j;
        r4 = r4.width();
        r1 = r1 + r4;
        r3.right = r1;
        r1 = r7.h;
        if (r1 == 0) goto L_0x015b;
    L_0x014d:
        r1 = r3.top;
        r4 = r7.j;
        r4 = r4.width();
        r5 = r7.n;
        r4 = r4 / r5;
        r1 = r1 + r4;
        r3.bottom = r1;
    L_0x015b:
        r1 = r3.height();
        r4 = r7.j;
        r4 = r4.height();
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x0186;
    L_0x0169:
        r1 = r3.top;
        r4 = r7.j;
        r4 = r4.height();
        r1 = r1 + r4;
        r3.bottom = r1;
        r1 = r7.h;
        if (r1 == 0) goto L_0x0186;
    L_0x0178:
        r1 = r3.left;
        r4 = r7.j;
        r4 = r4.height();
        r5 = r7.n;
        r4 = r4 * r5;
        r1 = r1 + r4;
        r3.right = r1;
    L_0x0186:
        r1 = r3.left;
        r4 = r7.j;
        r4 = r4.left;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x019c;
    L_0x0190:
        r1 = r7.j;
        r1 = r1.left;
        r4 = r3.left;
        r1 = r1 - r4;
        r3.offset(r1, r0);
        if (r2 == 0) goto L_0x01b1;
    L_0x019c:
        r1 = r3.right;
        r4 = r7.j;
        r4 = r4.right;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x01b1;
    L_0x01a6:
        r1 = r3.right;
        r4 = r7.j;
        r4 = r4.right;
        r1 = r1 - r4;
        r1 = -r1;
        r3.offset(r1, r0);
    L_0x01b1:
        r1 = r3.top;
        r4 = r7.j;
        r4 = r4.top;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x01c7;
    L_0x01bb:
        r1 = r7.j;
        r1 = r1.top;
        r4 = r3.top;
        r1 = r1 - r4;
        r3.offset(r0, r1);
        if (r2 == 0) goto L_0x01dc;
    L_0x01c7:
        r1 = r3.bottom;
        r4 = r7.j;
        r4 = r4.bottom;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x01dc;
    L_0x01d1:
        r1 = r3.bottom;
        r4 = r7.j;
        r4 = r4.bottom;
        r1 = r1 - r4;
        r1 = -r1;
        r3.offset(r0, r1);
    L_0x01dc:
        r0 = r7.d;
        r0.set(r3);
        r0 = r7.b();
        r7.c = r0;
        r0 = r7.l;
        r0.invalidate();
        r0 = com.whatsapp.WAAppCompatActivity.c;
        if (r0 == 0) goto L_0x01f4;
    L_0x01f0:
        r0 = r2 + 1;
        com.whatsapp.wallpaper.CropImage.c = r0;
    L_0x01f4:
        return;
    L_0x01f5:
        r1 = r9;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.l.b(int, float, float):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(int r12, float r13, float r14) {
        /*
        r11 = this;
        r10 = 2;
        r9 = 0;
        r1 = 1;
        r8 = 0;
        r2 = com.whatsapp.wallpaper.CropImage.c;
        r0 = r11.b();
        if (r12 != r1) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r3 = 32;
        if (r12 != r3) goto L_0x003c;
    L_0x0011:
        r3 = new android.graphics.RectF;
        r3.<init>(r0);
        r3.offset(r13, r14);
        r0 = new android.graphics.Matrix;
        r0.<init>();
        r4 = r11.i;
        r4 = r4.invert(r0);
        if (r4 == 0) goto L_0x0029;
    L_0x0026:
        r0.mapRect(r3);
    L_0x0029:
        r0 = r3.left;
        r4 = r11.d;
        r4 = r4.left;
        r0 = r0 - r4;
        r3 = r3.top;
        r4 = r11.d;
        r4 = r4.top;
        r3 = r3 - r4;
        r11.b(r0, r3);
        if (r2 == 0) goto L_0x000c;
    L_0x003c:
        r0 = new float[r10];
        r0[r9] = r13;
        r0[r1] = r14;
        r3 = new android.graphics.Matrix;
        r3.<init>();
        r4 = r11.i;
        r4 = r4.invert(r3);
        if (r4 == 0) goto L_0x0052;
    L_0x004f:
        r3.mapVectors(r0);
    L_0x0052:
        r4 = r0[r9];
        r5 = r0[r1];
        r0 = r12 & 8;
        if (r0 == 0) goto L_0x0155;
    L_0x005a:
        r6 = new float[r10];
        r6 = {0, 1065353216};
        r3.mapVectors(r6);
        r0 = r6[r9];
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x0152;
    L_0x0068:
        r0 = r6[r1];
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 != 0) goto L_0x0152;
    L_0x006e:
        r0 = 3;
        if (r2 == 0) goto L_0x0093;
    L_0x0071:
        r7 = r6[r9];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x0081;
    L_0x0077:
        r7 = r6[r1];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x0081;
    L_0x007d:
        r0 = r0 | 16;
        if (r2 == 0) goto L_0x0093;
    L_0x0081:
        r7 = r6[r9];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x0091;
    L_0x0087:
        r6 = r6[r1];
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x0091;
    L_0x008d:
        r0 = r0 | 4;
        if (r2 == 0) goto L_0x0093;
    L_0x0091:
        r0 = r0 | 8;
    L_0x0093:
        r6 = r12 & 16;
        if (r6 == 0) goto L_0x00d1;
    L_0x0097:
        r6 = new float[r10];
        r6 = {0, -1082130432};
        r3.mapVectors(r6);
        r7 = r6[r9];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 <= 0) goto L_0x00af;
    L_0x00a5:
        r7 = r6[r1];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x00af;
    L_0x00ab:
        r0 = r0 | 2;
        if (r2 == 0) goto L_0x00d1;
    L_0x00af:
        r7 = r6[r9];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x00bf;
    L_0x00b5:
        r7 = r6[r1];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 <= 0) goto L_0x00bf;
    L_0x00bb:
        r0 = r0 | 8;
        if (r2 == 0) goto L_0x00d1;
    L_0x00bf:
        r7 = r6[r9];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x00cf;
    L_0x00c5:
        r6 = r6[r1];
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x00cf;
    L_0x00cb:
        r0 = r0 | 4;
        if (r2 == 0) goto L_0x00d1;
    L_0x00cf:
        r0 = r0 | 16;
    L_0x00d1:
        r6 = r12 & 4;
        if (r6 == 0) goto L_0x010f;
    L_0x00d5:
        r6 = new float[r10];
        r6 = {1065353216, 0};
        r3.mapVectors(r6);
        r7 = r6[r9];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x00ed;
    L_0x00e3:
        r7 = r6[r1];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x00ed;
    L_0x00e9:
        r0 = r0 | 8;
        if (r2 == 0) goto L_0x010f;
    L_0x00ed:
        r7 = r6[r9];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x00fd;
    L_0x00f3:
        r7 = r6[r1];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x00fd;
    L_0x00f9:
        r0 = r0 | 2;
        if (r2 == 0) goto L_0x010f;
    L_0x00fd:
        r7 = r6[r9];
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x010d;
    L_0x0103:
        r6 = r6[r1];
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 <= 0) goto L_0x010d;
    L_0x0109:
        r0 = r0 | 16;
        if (r2 == 0) goto L_0x010f;
    L_0x010d:
        r0 = r0 | 4;
    L_0x010f:
        r6 = r12 & 2;
        if (r6 == 0) goto L_0x014d;
    L_0x0113:
        r6 = new float[r10];
        r6 = {-1082130432, 0};
        r3.mapVectors(r6);
        r3 = r6[r9];
        r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r3 != 0) goto L_0x012b;
    L_0x0121:
        r3 = r6[r1];
        r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r3 >= 0) goto L_0x012b;
    L_0x0127:
        r0 = r0 | 8;
        if (r2 == 0) goto L_0x014d;
    L_0x012b:
        r3 = r6[r9];
        r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r3 <= 0) goto L_0x013b;
    L_0x0131:
        r3 = r6[r1];
        r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r3 != 0) goto L_0x013b;
    L_0x0137:
        r0 = r0 | 4;
        if (r2 == 0) goto L_0x014d;
    L_0x013b:
        r3 = r6[r9];
        r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r3 != 0) goto L_0x014b;
    L_0x0141:
        r1 = r6[r1];
        r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x014b;
    L_0x0147:
        r0 = r0 | 16;
        if (r2 == 0) goto L_0x014d;
    L_0x014b:
        r0 = r0 | 2;
    L_0x014d:
        r11.b(r0, r4, r5);
        goto L_0x000c;
    L_0x0152:
        r0 = r1;
        goto L_0x0071;
    L_0x0155:
        r0 = r1;
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.l.a(int, float, float):void");
    }

    private Rect b() {
        RectF rectF = new RectF(this.d.left, this.d.top, this.d.right, this.d.bottom);
        this.i.mapRect(rectF);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public boolean a() {
        return this.b;
    }

    private void d() {
    }

    public Rect c() {
        return new Rect((int) this.d.left, (int) this.d.top, (int) this.d.right, (int) this.d.bottom);
    }

    public l(View view) {
        this.e = a.None;
        this.h = false;
        this.f = false;
        this.m = new Paint();
        this.k = new Paint();
        this.a = new Paint();
        this.l = view;
    }

    public void e() {
        this.c = b();
    }

    public void a(Matrix matrix, Rect rect, RectF rectF, boolean z, boolean z2, boolean z3, int i) {
        boolean z4 = true;
        if (z) {
            z2 = true;
        }
        this.i = new Matrix(matrix);
        this.d = rectF;
        this.j = new RectF(rect);
        if (!(z2 || z3)) {
            z4 = false;
        }
        this.h = z4;
        this.f = z;
        this.g = i;
        this.n = this.d.width() / this.d.height();
        this.c = b();
        this.m.setARGB(125, 50, 50, 50);
        this.k.setARGB(125, 50, 50, 50);
        this.a.setStyle(Style.STROKE);
        this.a.setAntiAlias(false);
        this.e = a.None;
        d();
    }

    public void a(a aVar) {
        if (aVar != this.e) {
            this.e = aVar;
            this.l.invalidate();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(float r14, float r15) {
        /*
        r13 = this;
        r4 = 32;
        r3 = 0;
        r12 = 0;
        r1 = 1;
        r2 = com.whatsapp.wallpaper.CropImage.c;
        r5 = r13.b();
        r0 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
        r6 = r13.l;
        r6 = r6.getResources();
        r6 = r6.getDisplayMetrics();
        r6 = r6.density;
        r6 = r6 * r0;
        r0 = r13.f;
        if (r0 == 0) goto L_0x00e5;
    L_0x001e:
        r0 = r5.centerX();
        r0 = (float) r0;
        r7 = r14 - r0;
        r0 = r5.centerY();
        r0 = (float) r0;
        r0 = r15 - r0;
        r8 = r7 * r7;
        r9 = r0 * r0;
        r8 = r8 + r9;
        r8 = (double) r8;
        r8 = java.lang.Math.sqrt(r8);
        r8 = (int) r8;
        r9 = r13.c;
        r9 = r9.width();
        r9 = r9 / 2;
        r10 = r8 - r9;
        r10 = java.lang.Math.abs(r10);
        r10 = (float) r10;
        r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r10 > 0) goto L_0x006c;
    L_0x004a:
        r10 = java.lang.Math.abs(r0);
        r11 = java.lang.Math.abs(r7);
        r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1));
        if (r10 <= 0) goto L_0x0062;
    L_0x0056:
        r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1));
        if (r0 >= 0) goto L_0x005e;
    L_0x005a:
        r0 = 8;
        if (r2 == 0) goto L_0x0071;
    L_0x005e:
        r0 = 16;
        if (r2 == 0) goto L_0x0071;
    L_0x0062:
        r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1));
        if (r0 >= 0) goto L_0x0069;
    L_0x0066:
        r0 = 2;
        if (r2 == 0) goto L_0x0071;
    L_0x0069:
        r0 = 4;
        if (r2 == 0) goto L_0x0071;
    L_0x006c:
        if (r8 >= r9) goto L_0x0070;
    L_0x006e:
        if (r2 == 0) goto L_0x00e3;
    L_0x0070:
        r0 = r1;
    L_0x0071:
        if (r2 == 0) goto L_0x00e0;
    L_0x0073:
        r2 = r5.top;
        r2 = (float) r2;
        r2 = r2 - r6;
        r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x00e1;
    L_0x007b:
        r2 = r5.bottom;
        r2 = (float) r2;
        r2 = r2 + r6;
        r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x00e1;
    L_0x0083:
        r2 = r1;
    L_0x0084:
        r7 = r5.left;
        r7 = (float) r7;
        r7 = r7 - r6;
        r7 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1));
        if (r7 < 0) goto L_0x0095;
    L_0x008c:
        r7 = r5.right;
        r7 = (float) r7;
        r7 = r7 + r6;
        r7 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1));
        if (r7 >= 0) goto L_0x0095;
    L_0x0094:
        r3 = r1;
    L_0x0095:
        r7 = r5.left;
        r7 = (float) r7;
        r7 = r7 - r14;
        r7 = java.lang.Math.abs(r7);
        r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r7 >= 0) goto L_0x00a5;
    L_0x00a1:
        if (r2 == 0) goto L_0x00a5;
    L_0x00a3:
        r0 = r0 | 2;
    L_0x00a5:
        r7 = r5.right;
        r7 = (float) r7;
        r7 = r7 - r14;
        r7 = java.lang.Math.abs(r7);
        r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r7 >= 0) goto L_0x00b5;
    L_0x00b1:
        if (r2 == 0) goto L_0x00b5;
    L_0x00b3:
        r0 = r0 | 4;
    L_0x00b5:
        r2 = r5.top;
        r2 = (float) r2;
        r2 = r2 - r15;
        r2 = java.lang.Math.abs(r2);
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x00c5;
    L_0x00c1:
        if (r3 == 0) goto L_0x00c5;
    L_0x00c3:
        r0 = r0 | 8;
    L_0x00c5:
        r2 = r5.bottom;
        r2 = (float) r2;
        r2 = r2 - r15;
        r2 = java.lang.Math.abs(r2);
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x00d5;
    L_0x00d1:
        if (r3 == 0) goto L_0x00d5;
    L_0x00d3:
        r0 = r0 | 16;
    L_0x00d5:
        if (r0 != r1) goto L_0x00e0;
    L_0x00d7:
        r1 = (int) r14;
        r2 = (int) r15;
        r1 = r5.contains(r1, r2);
        if (r1 == 0) goto L_0x00e0;
    L_0x00df:
        r0 = r4;
    L_0x00e0:
        return r0;
    L_0x00e1:
        r2 = r3;
        goto L_0x0084;
    L_0x00e3:
        r0 = r4;
        goto L_0x0071;
    L_0x00e5:
        r0 = r1;
        goto L_0x0073;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.l.a(float, float):int");
    }

    void b(float f, float f2) {
        Rect rect = new Rect(this.c);
        this.d.offset(f, f2);
        this.d.offset(Math.max(0.0f, this.j.left - this.d.left), Math.max(0.0f, this.j.top - this.d.top));
        this.d.offset(Math.min(0.0f, this.j.right - this.d.right), Math.min(0.0f, this.j.bottom - this.d.bottom));
        this.c = b();
        rect.union(this.c);
        rect.inset(-10, -10);
        this.l.invalidate(rect);
    }

    public void a(boolean z) {
        this.b = z;
    }

    protected void a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int min;
        int min2;
        int i5;
        int i6;
        Paint paint;
        int i7 = CropImage.c;
        Path path = new Path();
        float f = this.l.getResources().getDisplayMetrics().density;
        this.a.setStrokeWidth(0.5f + f);
        Rect rect = new Rect();
        this.l.getDrawingRect(rect);
        if (this.f) {
            float width = (float) this.c.width();
            path.addCircle(((float) this.c.left) + (width / 2.0f), (((float) this.c.height()) / 2.0f) + ((float) this.c.top), width / 2.0f, Direction.CW);
            this.a.setColor(-1112874);
            if (i7 != 0) {
                WAAppCompatActivity.c++;
            }
            canvas.drawPath(path, this.a);
            i7 = Math.round(2.0f * f);
            i = this.c.left + i7;
            i2 = this.c.right - i7;
            i3 = this.c.top + i7;
            i4 = this.c.bottom - i7;
            min = Math.min((int) (24.0f * f), this.c.width() / 4);
            min2 = Math.min((int) (24.0f * f), this.c.height() / 4);
            i5 = this.c.left + ((this.c.right - this.c.left) / 2);
            i6 = this.c.top + ((this.c.bottom - this.c.top) / 2);
            this.a.setStrokeWidth(2.0f * f);
            this.a.setColor(-1);
            this.a.setStrokeCap(Cap.SQUARE);
            canvas.drawLine((float) (i5 - (min / 2)), (float) i3, (float) ((min / 2) + i5), (float) i3, this.a);
            canvas.drawLine((float) (i5 - (min / 2)), (float) i4, (float) ((min / 2) + i5), (float) i4, this.a);
            canvas.drawLine((float) i, (float) (i6 - (min2 / 2)), (float) i, (float) ((min2 / 2) + i6), this.a);
            canvas.drawLine((float) i2, (float) (i6 - (min2 / 2)), (float) i2, (float) ((min2 / 2) + i6), this.a);
            canvas.drawLine((float) i, (float) i3, (float) (i + min), (float) i3, this.a);
            canvas.drawLine((float) i, (float) i3, (float) i, (float) (i3 + min2), this.a);
            canvas.drawLine((float) i2, (float) i3, (float) (i2 - min), (float) i3, this.a);
            canvas.drawLine((float) i2, (float) i3, (float) i2, (float) (i3 + min2), this.a);
            canvas.drawLine((float) i2, (float) i4, (float) (i2 - min), (float) i4, this.a);
            canvas.drawLine((float) i2, (float) i4, (float) i2, (float) (i4 - min2), this.a);
            canvas.drawLine((float) i, (float) i4, (float) (i + min), (float) i4, this.a);
            canvas.drawLine((float) i, (float) i4, (float) i, (float) (i4 - min2), this.a);
        }
        path.addRect(new RectF(this.c), Direction.CW);
        this.a.setColor(1728053247);
        Rect rect2 = new Rect();
        rect2.set(rect);
        rect2.right = this.c.left;
        if (a()) {
            paint = this.m;
        } else {
            paint = this.k;
        }
        canvas.drawRect(rect2, paint);
        rect2.set(rect);
        rect2.right = this.c.right;
        rect2.left = this.c.left;
        rect2.bottom = this.c.top;
        if (a()) {
            paint = this.m;
        } else {
            paint = this.k;
        }
        canvas.drawRect(rect2, paint);
        rect2.set(rect);
        rect2.right = this.c.right;
        rect2.left = this.c.left;
        rect2.top = this.c.bottom;
        if (a()) {
            paint = this.m;
        } else {
            paint = this.k;
        }
        canvas.drawRect(rect2, paint);
        rect2.set(rect);
        rect2.left = this.c.right;
        if (a()) {
            paint = this.m;
        } else {
            paint = this.k;
        }
        canvas.drawRect(rect2, paint);
        i7 = Math.round(f);
        i2 = this.c.left + i7;
        i3 = this.c.right - i7;
        i4 = this.c.top + i7;
        min = this.c.bottom - i7;
        canvas.drawLine((float) i2, (float) (this.c.top + ((this.c.bottom - this.c.top) / 3)), (float) i3, (float) (this.c.top + ((this.c.bottom - this.c.top) / 3)), this.a);
        canvas.drawLine((float) i2, (float) (this.c.bottom - ((this.c.bottom - this.c.top) / 3)), (float) i3, (float) (this.c.bottom - ((this.c.bottom - this.c.top) / 3)), this.a);
        canvas.drawLine((float) (this.c.left + ((this.c.right - this.c.left) / 3)), (float) i4, (float) (this.c.left + ((this.c.right - this.c.left) / 3)), (float) min, this.a);
        canvas.drawLine((float) (this.c.right - ((this.c.right - this.c.left) / 3)), (float) i4, (float) (this.c.right - ((this.c.right - this.c.left) / 3)), (float) min, this.a);
        canvas.drawPath(path, this.a);
        i7 = Math.round(2.0f * f);
        i = this.c.left + i7;
        i2 = this.c.right - i7;
        i3 = this.c.top + i7;
        i4 = this.c.bottom - i7;
        min = Math.min((int) (24.0f * f), this.c.width() / 4);
        min2 = Math.min((int) (24.0f * f), this.c.height() / 4);
        i5 = this.c.left + ((this.c.right - this.c.left) / 2);
        i6 = this.c.top + ((this.c.bottom - this.c.top) / 2);
        this.a.setStrokeWidth(2.0f * f);
        this.a.setColor(-1);
        this.a.setStrokeCap(Cap.SQUARE);
        canvas.drawLine((float) (i5 - (min / 2)), (float) i3, (float) ((min / 2) + i5), (float) i3, this.a);
        canvas.drawLine((float) (i5 - (min / 2)), (float) i4, (float) ((min / 2) + i5), (float) i4, this.a);
        canvas.drawLine((float) i, (float) (i6 - (min2 / 2)), (float) i, (float) ((min2 / 2) + i6), this.a);
        canvas.drawLine((float) i2, (float) (i6 - (min2 / 2)), (float) i2, (float) ((min2 / 2) + i6), this.a);
        canvas.drawLine((float) i, (float) i3, (float) (i + min), (float) i3, this.a);
        canvas.drawLine((float) i, (float) i3, (float) i, (float) (i3 + min2), this.a);
        canvas.drawLine((float) i2, (float) i3, (float) (i2 - min), (float) i3, this.a);
        canvas.drawLine((float) i2, (float) i3, (float) i2, (float) (i3 + min2), this.a);
        canvas.drawLine((float) i2, (float) i4, (float) (i2 - min), (float) i4, this.a);
        canvas.drawLine((float) i2, (float) i4, (float) i2, (float) (i4 - min2), this.a);
        canvas.drawLine((float) i, (float) i4, (float) (i + min), (float) i4, this.a);
        canvas.drawLine((float) i, (float) i4, (float) i, (float) (i4 - min2), this.a);
    }
}
