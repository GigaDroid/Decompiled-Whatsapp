package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class WallPaperView extends ImageView {
    private static final String[] z;
    private h a;
    private Bitmap b;
    private boolean c;
    private Rect d;

    static {
        String[] strArr = new String[4];
        String str = "Cd~A&F!y[&_f\u007fW}";
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
                        i3 = 49;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = 26;
                        break;
                    case at.o /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = 71;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0011}:";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "Cd~A&F;";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0011}:";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public WallPaperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ScaleType.MATRIX);
    }

    protected boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float max = Math.max(((float) (i3 - i)) / ((float) drawable.getIntrinsicWidth()), ((float) (i4 - i2)) / ((float) drawable.getIntrinsicHeight()));
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public void a() {
        this.c = false;
        setImageDrawable(null);
        this.b = null;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.c = true;
        this.b = ((BitmapDrawable) drawable).getBitmap();
        setImageBitmap(this.b);
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        int i = 1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.d == null) {
            Log.i(z[3] + measuredWidth + z[1] + measuredHeight);
            this.d = new Rect(0, 0, measuredWidth, measuredHeight);
            if (CropImage.c != 0) {
                int i2 = 1;
            }
            super.onDraw(canvas);
            if ((i == 0 || this.c) && measuredHeight > 0 && measuredWidth > 0) {
                if (this.a != null) {
                    this.a.a(measuredWidth, measuredHeight);
                }
                if (this.b != null) {
                    this.c = false;
                }
            }
            return;
        }
        boolean z = false;
        if (this.d.width() == measuredWidth && this.d.height() == measuredHeight) {
            i = i2;
        } else {
            this.d.set(0, 0, measuredWidth, measuredHeight);
            Log.i(z[0] + measuredWidth + z[2] + measuredHeight);
        }
        super.onDraw(canvas);
        if (i == 0) {
        }
        if (this.a != null) {
            this.a.a(measuredWidth, measuredHeight);
        }
        if (this.b != null) {
            this.c = false;
        }
    }

    public void setOnSizeChangedListener(h hVar) {
        this.a = hVar;
    }
}
