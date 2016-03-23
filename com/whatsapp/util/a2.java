package com.whatsapp.util;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class a2 extends Animation {
    private final float a;
    private final float b;
    private Camera c;
    protected final float d;
    protected final float e;
    private final float f;
    private final boolean g;

    public a2(float f, float f2, float f3, float f4, float f5, boolean z) {
        this.d = f;
        this.e = f2;
        this.b = f3;
        this.f = f4;
        this.a = f5;
        this.g = z;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        float f2 = this.d;
        f2 += (this.e - f2) * f;
        float f3 = this.b;
        float f4 = this.f;
        Camera camera = this.c;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        camera.translate(0.0f, 0.0f, (float) (((double) this.a) * Math.sin(3.141592653589793d * ((double) f))));
        camera.rotateY(f2);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-f3, -f4);
        matrix.postTranslate(f3, f4);
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.c = new Camera();
    }
}
