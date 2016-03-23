package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends ImageViewTouchBase {
    boolean m;
    float n;
    boolean o;
    float p;
    l q;
    ArrayList r;
    int s;

    public void clearFocus() {
        int i = CropImage.c;
        int i2 = 0;
        while (i2 < this.r.size()) {
            l lVar = (l) this.r.get(i2);
            lVar.a(false);
            lVar.e();
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = CropImage.c;
        super.onLayout(z, i, i2, i3, i4);
        if (this.g.f() != null) {
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                lVar.i.set(getImageMatrix());
                lVar.e();
                if (lVar.b) {
                    c(lVar);
                    continue;
                }
                if (i5 != 0) {
                    return;
                }
            }
        }
    }

    protected void onDraw(Canvas canvas) {
        int i = CropImage.c;
        if (!this.m) {
            super.onDraw(canvas);
        }
        int i2 = 0;
        while (i2 < this.r.size()) {
            ((l) this.r.get(i2)).a(canvas);
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    protected void b(float f, float f2) {
        int i = CropImage.c;
        super.b(f, f2);
        int i2 = 0;
        while (i2 < this.r.size()) {
            l lVar = (l) this.r.get(i2);
            lVar.i.postTranslate(f, f2);
            lVar.e();
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public void b(l lVar) {
        this.r.add(lVar);
        invalidate();
    }

    private void a(l lVar) {
        Rect rect = lVar.c;
        int max = Math.max(0, getLeft() - rect.left);
        int min = Math.min(0, getRight() - rect.right);
        int max2 = Math.max(0, getTop() - rect.top);
        int min2 = Math.min(0, getBottom() - rect.bottom);
        if (max == 0) {
            max = min;
        }
        if (max2 == 0) {
            max2 = min2;
        }
        if (max != 0 || max2 != 0) {
            a((float) max, (float) max2);
        }
    }

    public void d() {
        this.r.clear();
        super.d();
    }

    static void a(CropImageView cropImageView, l lVar) {
        cropImageView.a(lVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r3 = 0;
        r4 = 1;
        r5 = com.whatsapp.wallpaper.CropImage.c;
        r0 = r8.getContext();
        r0 = (com.whatsapp.wallpaper.CropImage) r0;
        r1 = r0.l;
        if (r1 == 0) goto L_0x000f;
    L_0x000e:
        return r3;
    L_0x000f:
        r1 = r9.getAction();
        switch(r1) {
            case 0: goto L_0x001f;
            case 1: goto L_0x0064;
            case 2: goto L_0x0092;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r9.getAction();
        switch(r0) {
            case 1: goto L_0x00c1;
            case 2: goto L_0x00c6;
            case 3: goto L_0x00c1;
            default: goto L_0x001d;
        };
    L_0x001d:
        r3 = r4;
        goto L_0x000e;
    L_0x001f:
        r2 = r3;
    L_0x0020:
        r1 = r8.r;
        r1 = r1.size();
        if (r2 >= r1) goto L_0x0062;
    L_0x0028:
        r1 = r8.r;
        r1 = r1.get(r2);
        r1 = (com.whatsapp.wallpaper.l) r1;
        r6 = r9.getX();
        r7 = r9.getY();
        r6 = r1.a(r6, r7);
        if (r6 == r4) goto L_0x005e;
    L_0x003e:
        r8.s = r6;
        r8.q = r1;
        r1 = r9.getX();
        r8.p = r1;
        r1 = r9.getY();
        r8.n = r1;
        r7 = r8.q;
        r1 = 32;
        if (r6 != r1) goto L_0x00be;
    L_0x0054:
        r1 = com.whatsapp.wallpaper.a.Move;
    L_0x0056:
        r7.a(r1);
        r8.a(r9);
        if (r5 == 0) goto L_0x0062;
    L_0x005e:
        r1 = r2 + 1;
        if (r5 == 0) goto L_0x00d5;
    L_0x0062:
        if (r5 == 0) goto L_0x0016;
    L_0x0064:
        r1 = r8.q;
        if (r1 == 0) goto L_0x008d;
    L_0x0068:
        r1 = r8.q;
        r0.q = r1;
        r0 = r8.q;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0081;
    L_0x0074:
        r0 = r8.q;
        r0.a(r3);
        r0 = r8.q;
        r0.e();
        r8.invalidate();
    L_0x0081:
        r0 = r8.q;
        r8.c(r0);
        r0 = r8.q;
        r1 = com.whatsapp.wallpaper.a.None;
        r0.a(r1);
    L_0x008d:
        r0 = 0;
        r8.q = r0;
        if (r5 == 0) goto L_0x0016;
    L_0x0092:
        r0 = r8.q;
        if (r0 == 0) goto L_0x0016;
    L_0x0096:
        r0 = r8.q;
        r1 = r8.s;
        r2 = r9.getX();
        r3 = r8.p;
        r2 = r2 - r3;
        r3 = r9.getY();
        r6 = r8.n;
        r3 = r3 - r6;
        r0.a(r1, r2, r3);
        r0 = r9.getX();
        r8.p = r0;
        r0 = r9.getY();
        r8.n = r0;
        r0 = r8.q;
        r8.a(r0);
        goto L_0x0016;
    L_0x00be:
        r1 = com.whatsapp.wallpaper.a.Grow;
        goto L_0x0056;
    L_0x00c1:
        r8.a(r4, r4);
        if (r5 == 0) goto L_0x001d;
    L_0x00c6:
        r0 = r8.b();
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x001d;
    L_0x00d0:
        r8.a(r4, r4);
        goto L_0x001d;
    L_0x00d5:
        r2 = r1;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.CropImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void c(l lVar) {
        Rect rect = lVar.c;
        float width = (float) getWidth();
        float max = Math.max(1.0f, Math.min((width / ((float) rect.width())) * 0.6f, (((float) getHeight()) / ((float) rect.height())) * 0.6f) * b());
        if (((double) (Math.abs(max - b()) / max)) > 0.1d) {
            float[] fArr = new float[]{lVar.d.centerX(), lVar.d.centerY()};
            getImageMatrix().mapPoints(fArr);
            a(max, fArr[0], fArr[1], 300.0f, new b(this, lVar));
        }
    }

    protected void a(float f, float f2, float f3) {
        int i = CropImage.c;
        super.a(f, f2, f3);
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            lVar.i.set(getImageMatrix());
            lVar.e();
            if (i != 0) {
                return;
            }
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new ArrayList();
        this.q = null;
        this.m = false;
    }

    private void a(MotionEvent motionEvent) {
        int i = CropImage.c;
        clearFocus();
        int i2 = 0;
        while (i2 < this.r.size()) {
            l lVar = (l) this.r.get(i2);
            if (lVar.a(motionEvent.getX(), motionEvent.getY()) != 1) {
                if (!lVar.a()) {
                    lVar.a(true);
                    lVar.e();
                    if (i == 0) {
                        break;
                    }
                }
                break;
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        invalidate();
    }
}
