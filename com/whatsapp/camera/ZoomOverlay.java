package com.whatsapp.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.v7.appcompat.R;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class ZoomOverlay extends View {
    private static final String[] z;
    private Paint a;
    private RectF b;
    private Runnable c;
    private TextPaint d;
    private float e;
    private float f;

    static {
        String[] strArr = new String[3];
        String str = "\u0014}L\u001bM";
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
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 77;
                        break;
                    case at.i /*2*/:
                        i3 = 124;
                        break;
                    case at.o /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 125;
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
                    str = "IcMS";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0014}L\u001bM";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        int i = CameraActivity.I;
        this.a.setStrokeWidth(getContext().getResources().getDimension(2131427415));
        this.a.setStyle(Style.STROKE);
        this.a.setColor(-1711276033);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float min = ((float) Math.min(width, height)) * 0.9f;
        this.b.set(((float) width) - min, ((float) height) - min, ((float) width) + min, ((float) height) + min);
        canvas.drawOval(this.b, this.a);
        float dimension = getResources().getDimension(R.dimen.abc_text_size_title_material_toolbar);
        this.d.setTextSize(dimension);
        this.d.setColor(-1711276033);
        this.d.setTextAlign(Align.CENTER);
        this.d.setFakeBoldText(true);
        canvas.drawText("x" + String.format(z[2], new Object[]{Float.valueOf(this.e)}), (float) width, (dimension / 2.0f) + ((float) height), this.d);
        dimension = this.d.measureText(z[1]);
        this.b.set(((float) width) - dimension, ((float) height) - dimension, ((float) width) + dimension, ((float) height) + dimension);
        canvas.drawOval(this.b, this.a);
        dimension *= this.f;
        if (dimension <= min) {
            min = dimension;
        }
        this.a.setColor(-13388315);
        this.b.set(((float) width) - min, ((float) height) - min, ((float) width) + min, min + ((float) height));
        canvas.drawOval(this.b, this.a);
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }

    public ZoomOverlay(Context context) {
        super(context);
        this.b = new RectF();
        this.a = new Paint(1);
        this.d = new TextPaint(1);
        this.c = new f(this);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new RectF();
        this.a = new Paint(1);
        this.d = new TextPaint(1);
        this.c = new f(this);
    }

    public void a(float f, float f2) {
        this.f = f;
        this.e = f2;
        invalidate();
    }

    public float a() {
        return (((float) Math.min(getWidth() / 2, getHeight() / 2)) * 0.9f) / this.d.measureText(z[0]);
    }

    public void b() {
        invalidate();
        postDelayed(this.c, 300);
    }

    public void a(float f) {
        setVisibility(0);
        this.f = f;
        invalidate();
        removeCallbacks(this.c);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new RectF();
        this.a = new Paint(1);
        this.d = new TextPaint(1);
        this.c = new f(this);
    }
}
