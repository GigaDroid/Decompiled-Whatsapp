package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

class CircleImageView extends ImageView {
    private AnimationListener mListener;
    private int mShadowRadius;

    class OvalShadow extends OvalShape {
        private int mCircleDiameter;
        private RadialGradient mRadialGradient;
        private Paint mShadowPaint;
        final CircleImageView this$0;

        public OvalShadow(CircleImageView circleImageView, int i, int i2) {
            this.this$0 = circleImageView;
            this.mShadowPaint = new Paint();
            CircleImageView.access$002(circleImageView, i);
            this.mCircleDiameter = i2;
            this.mRadialGradient = new RadialGradient((float) (this.mCircleDiameter / 2), (float) (this.mCircleDiameter / 2), (float) CircleImageView.access$000(circleImageView), new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.mShadowPaint.setShader(this.mRadialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.this$0.getWidth();
            int height = this.this$0.getHeight();
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) ((this.mCircleDiameter / 2) + CircleImageView.access$000(this.this$0)), this.mShadowPaint);
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (this.mCircleDiameter / 2), paint);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CircleImageView(android.content.Context r7, int r8, float r9) {
        /*
        r6 = this;
        r6.<init>(r7);
        r0 = r6.getContext();
        r0 = r0.getResources();
        r0 = r0.getDisplayMetrics();
        r1 = r0.density;
        r0 = r9 * r1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 * r2;
        r2 = (int) r0;
        r0 = 1071644672; // 0x3fe00000 float:1.75 double:5.29462817E-315;
        r0 = r0 * r1;
        r3 = (int) r0;
        r0 = 0;
        r0 = r0 * r1;
        r4 = (int) r0;
        r0 = 1080033280; // 0x40600000 float:3.5 double:5.3360734E-315;
        r0 = r0 * r1;
        r0 = (int) r0;
        r6.mShadowRadius = r0;
        r0 = r6.elevationSupported();
        if (r0 == 0) goto L_0x003e;
    L_0x002a:
        r0 = new android.graphics.drawable.ShapeDrawable;
        r5 = new android.graphics.drawable.shapes.OvalShape;
        r5.<init>();
        r0.<init>(r5);
        r5 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r1 = r1 * r5;
        android.support.v4.view.ViewCompat.setElevation(r6, r1);
        r1 = android.support.v4.widget.CursorAdapter.a;
        if (r1 == 0) goto L_0x0065;
    L_0x003e:
        r1 = new android.support.v4.widget.CircleImageView$OvalShadow;
        r0 = r6.mShadowRadius;
        r1.<init>(r6, r0, r2);
        r0 = new android.graphics.drawable.ShapeDrawable;
        r0.<init>(r1);
        r1 = 1;
        r2 = r0.getPaint();
        android.support.v4.view.ViewCompat.setLayerType(r6, r1, r2);
        r1 = r0.getPaint();
        r2 = r6.mShadowRadius;
        r2 = (float) r2;
        r4 = (float) r4;
        r3 = (float) r3;
        r5 = 503316480; // 0x1e000000 float:6.7762636E-21 double:2.48671382E-315;
        r1.setShadowLayer(r2, r4, r3, r5);
        r1 = r6.mShadowRadius;
        r6.setPadding(r1, r1, r1, r1);
    L_0x0065:
        r1 = r0.getPaint();
        r1.setColor(r8);
        r6.setBackgroundDrawable(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.CircleImageView.<init>(android.content.Context, int, float):void");
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!elevationSupported()) {
            setMeasuredDimension(getMeasuredWidth() + (this.mShadowRadius * 2), getMeasuredHeight() + (this.mShadowRadius * 2));
        }
    }

    private boolean elevationSupported() {
        return VERSION.SDK_INT >= 21;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.mListener != null) {
            this.mListener.onAnimationEnd(getAnimation());
        }
    }

    static int access$002(CircleImageView circleImageView, int i) {
        circleImageView.mShadowRadius = i;
        return i;
    }

    static int access$000(CircleImageView circleImageView) {
        return circleImageView.mShadowRadius;
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        if (this.mListener != null) {
            this.mListener.onAnimationStart(getAnimation());
        }
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.mListener = animationListener;
    }
}
