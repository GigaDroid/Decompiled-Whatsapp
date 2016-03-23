package android.support.v7.widget;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class AppCompatProgressBarHelper {
    private static final int[] TINT_ATTRS;
    private Bitmap mSampleTile;
    final TintManager mTintManager;
    private final ProgressBar mView;

    void loadFromAttributes(AttributeSet attributeSet, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, TINT_ATTRS, i, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.mView.setIndeterminateDrawable(tileifyIndeterminate(drawableIfKnown));
        }
        drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(1);
        if (drawableIfKnown != null) {
            this.mView.setProgressDrawable(tileify(drawableIfKnown, false));
        }
        obtainStyledAttributes.recycle();
    }

    AppCompatProgressBarHelper(ProgressBar progressBar, TintManager tintManager) {
        this.mView = progressBar;
        this.mTintManager = tintManager;
    }

    Bitmap getSampleTime() {
        return this.mSampleTile;
    }

    private Drawable tileifyIndeterminate(Drawable drawable) {
        boolean z = LinearLayoutCompat.a;
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        Drawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        int i = 0;
        while (i < numberOfFrames) {
            Drawable tileify = tileify(animationDrawable.getFrame(i), true);
            tileify.setLevel(10000);
            animationDrawable2.addFrame(tileify, animationDrawable.getDuration(i));
            i++;
            if (z) {
                break;
            }
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    private Shape getDrawableShape() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    static {
        TINT_ATTRS = new int[]{16843067, 16843068};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable tileify(android.graphics.drawable.Drawable r10, boolean r11) {
        /*
        r9 = this;
        r2 = 1;
        r1 = 0;
        r4 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r10 instanceof android.support.v4.graphics.drawable.DrawableWrapper;
        if (r0 == 0) goto L_0x001d;
    L_0x0008:
        r0 = r10;
        r0 = (android.support.v4.graphics.drawable.DrawableWrapper) r0;
        r0 = r0.getWrappedDrawable();
        if (r0 == 0) goto L_0x001b;
    L_0x0011:
        r3 = r9.tileify(r0, r11);
        r0 = r10;
        r0 = (android.support.v4.graphics.drawable.DrawableWrapper) r0;
        r0.setWrappedDrawable(r3);
    L_0x001b:
        if (r4 == 0) goto L_0x0092;
    L_0x001d:
        r0 = r10 instanceof android.graphics.drawable.LayerDrawable;
        if (r0 == 0) goto L_0x005e;
    L_0x0021:
        r10 = (android.graphics.drawable.LayerDrawable) r10;
        r5 = r10.getNumberOfLayers();
        r6 = new android.graphics.drawable.Drawable[r5];
        r3 = r1;
    L_0x002a:
        if (r3 >= r5) goto L_0x0049;
    L_0x002c:
        r0 = r10.getId(r3);
        r7 = r10.getDrawable(r3);
        r8 = 16908301; // 0x102000d float:2.3877265E-38 double:8.3538107E-317;
        if (r0 == r8) goto L_0x003e;
    L_0x0039:
        r8 = 16908303; // 0x102000f float:2.387727E-38 double:8.3538116E-317;
        if (r0 != r8) goto L_0x005c;
    L_0x003e:
        r0 = r2;
    L_0x003f:
        r0 = r9.tileify(r7, r0);
        r6[r3] = r0;
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x0094;
    L_0x0049:
        r0 = new android.graphics.drawable.LayerDrawable;
        r0.<init>(r6);
    L_0x004e:
        if (r1 >= r5) goto L_0x005b;
    L_0x0050:
        r2 = r10.getId(r1);
        r0.setId(r1, r2);
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x004e;
    L_0x005b:
        return r0;
    L_0x005c:
        r0 = r1;
        goto L_0x003f;
    L_0x005e:
        r0 = r10 instanceof android.graphics.drawable.BitmapDrawable;
        if (r0 == 0) goto L_0x0092;
    L_0x0062:
        r10 = (android.graphics.drawable.BitmapDrawable) r10;
        r0 = r10.getBitmap();
        r1 = r9.mSampleTile;
        if (r1 != 0) goto L_0x006e;
    L_0x006c:
        r9.mSampleTile = r0;
    L_0x006e:
        r1 = new android.graphics.drawable.ShapeDrawable;
        r3 = r9.getDrawableShape();
        r1.<init>(r3);
        r3 = new android.graphics.BitmapShader;
        r4 = android.graphics.Shader.TileMode.REPEAT;
        r5 = android.graphics.Shader.TileMode.CLAMP;
        r3.<init>(r0, r4, r5);
        r0 = r1.getPaint();
        r0.setShader(r3);
        if (r11 == 0) goto L_0x0090;
    L_0x0089:
        r0 = new android.graphics.drawable.ClipDrawable;
        r3 = 3;
        r0.<init>(r1, r3, r2);
        goto L_0x005b;
    L_0x0090:
        r0 = r1;
        goto L_0x005b;
    L_0x0092:
        r0 = r10;
        goto L_0x005b;
    L_0x0094:
        r3 = r0;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatProgressBarHelper.tileify(android.graphics.drawable.Drawable, boolean):android.graphics.drawable.Drawable");
    }
}
