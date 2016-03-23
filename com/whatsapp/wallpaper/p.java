package com.whatsapp.wallpaper;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class p {
    private Bitmap a;
    private Matrix b;

    public void a(Matrix matrix) {
        this.b = matrix;
    }

    public int e() {
        return c() ? this.a.getHeight() : this.a.getWidth();
    }

    public Bitmap f() {
        return this.a;
    }

    public boolean c() {
        if (this.b == null) {
            return false;
        }
        float[] fArr = new float[]{0.0f, 1.0f};
        this.b.mapVectors(fArr);
        if (fArr[0] != 0.0f) {
            return true;
        }
        return false;
    }

    public Matrix d() {
        return this.b;
    }

    public void a(Bitmap bitmap) {
        this.a = bitmap;
    }

    public Matrix a() {
        Matrix matrix = new Matrix();
        if (this.b != null) {
            matrix.preTranslate((float) (-(this.a.getWidth() / 2)), (float) (-(this.a.getHeight() / 2)));
            matrix.postConcat(this.b);
            matrix.postTranslate((float) (e() / 2), (float) (b() / 2));
        }
        return matrix;
    }

    public int b() {
        return c() ? this.a.getWidth() : this.a.getHeight();
    }

    public p(Bitmap bitmap) {
        this.a = bitmap;
    }
}
