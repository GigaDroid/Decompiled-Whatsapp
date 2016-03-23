package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.support.design.R;
import android.support.design.widget.CoordinatorLayout.DefaultBehavior;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageButton;
import com.whatsapp.arj;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

@DefaultBehavior(Behavior.class)
public class FloatingActionButton extends ImageButton {
    private static final String[] z;
    private ColorStateList mBackgroundTint;
    private Mode mBackgroundTintMode;
    private int mBorderWidth;
    private int mContentPadding;
    private final FloatingActionButtonImpl mImpl;
    private int mRippleColor;
    private final Rect mShadowPadding;
    private int mSize;

    class 1 implements ShadowViewDelegate {
        final FloatingActionButton this$0;

        1(FloatingActionButton floatingActionButton) {
            this.this$0 = floatingActionButton;
        }

        public void setBackgroundDrawable(Drawable drawable) {
            FloatingActionButton.access$201(this.this$0, drawable);
        }

        public void setShadowPadding(int i, int i2, int i3, int i4) {
            FloatingActionButton.access$000(this.this$0).set(i, i2, i3, i4);
            this.this$0.setPadding(FloatingActionButton.access$100(this.this$0) + i, FloatingActionButton.access$100(this.this$0) + i2, FloatingActionButton.access$100(this.this$0) + i3, FloatingActionButton.access$100(this.this$0) + i4);
        }

        public float getRadius() {
            return ((float) this.this$0.getSizeDimension()) / 2.0f;
        }
    }

    public class Behavior extends android.support.design.widget.CoordinatorLayout.Behavior {
        private static final boolean SNACKBAR_BEHAVIOR_ENABLED;
        private float mFabTranslationY;
        private ValueAnimatorCompat mFabTranslationYAnimator;
        private Rect mTmpRect;

        class 1 implements AnimatorUpdateListener {
            final Behavior this$0;
            final FloatingActionButton val$fab;

            public void onAnimationUpdate(ValueAnimatorCompat valueAnimatorCompat) {
                ViewCompat.setTranslationY(this.val$fab, valueAnimatorCompat.getAnimatedFloatValue());
            }

            1(Behavior behavior, FloatingActionButton floatingActionButton) {
                this.this$0 = behavior;
                this.val$fab = floatingActionButton;
            }
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return SNACKBAR_BEHAVIOR_ENABLED && (view instanceof SnackbarLayout);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void updateFabTranslationForSnackbar(android.support.design.widget.CoordinatorLayout r6, android.support.design.widget.FloatingActionButton r7, android.view.View r8) {
            /*
            r5 = this;
            r0 = r7.getVisibility();
            if (r0 == 0) goto L_0x0007;
        L_0x0006:
            return;
        L_0x0007:
            r0 = r5.getFabTranslationYForSnackbar(r6, r7);
            r1 = r5.mFabTranslationY;
            r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
            if (r1 == 0) goto L_0x0006;
        L_0x0011:
            r1 = android.support.v4.view.ViewCompat.getTranslationY(r7);
            r2 = r5.mFabTranslationYAnimator;
            if (r2 == 0) goto L_0x0026;
        L_0x0019:
            r2 = r5.mFabTranslationYAnimator;
            r2 = r2.isRunning();
            if (r2 == 0) goto L_0x0026;
        L_0x0021:
            r2 = r5.mFabTranslationYAnimator;
            r2.cancel();
        L_0x0026:
            r2 = r1 - r0;
            r2 = java.lang.Math.abs(r2);
            r3 = r7.getHeight();
            r3 = (float) r3;
            r4 = 1059766403; // 0x3f2ac083 float:0.667 double:5.235941723E-315;
            r3 = r3 * r4;
            r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
            if (r2 <= 0) goto L_0x0062;
        L_0x0039:
            r2 = r5.mFabTranslationYAnimator;
            if (r2 != 0) goto L_0x0054;
        L_0x003d:
            r2 = android.support.design.widget.ViewUtils.createAnimator();
            r5.mFabTranslationYAnimator = r2;
            r2 = r5.mFabTranslationYAnimator;
            r3 = android.support.design.widget.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            r2.setInterpolator(r3);
            r2 = r5.mFabTranslationYAnimator;
            r3 = new android.support.design.widget.FloatingActionButton$Behavior$1;
            r3.<init>(r5, r7);
            r2.setUpdateListener(r3);
        L_0x0054:
            r2 = r5.mFabTranslationYAnimator;
            r2.setFloatValues(r1, r0);
            r1 = r5.mFabTranslationYAnimator;
            r1.start();
            r1 = android.support.design.widget.CoordinatorLayout.a;
            if (r1 == 0) goto L_0x0065;
        L_0x0062:
            android.support.v4.view.ViewCompat.setTranslationY(r7, r0);
        L_0x0065:
            r5.mFabTranslationY = r0;
            goto L_0x0006;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.FloatingActionButton.Behavior.updateFabTranslationForSnackbar(android.support.design.widget.CoordinatorLayout, android.support.design.widget.FloatingActionButton, android.view.View):void");
        }

        static {
            SNACKBAR_BEHAVIOR_ENABLED = VERSION.SDK_INT >= 11;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            boolean z = CoordinatorLayout.a;
            List dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i2 = 0;
            while (i2 < size) {
                View view = (View) dependencies.get(i2);
                if ((view instanceof AppBarLayout) && updateFabVisibility(coordinatorLayout, (AppBarLayout) view, floatingActionButton) && !z) {
                    break;
                }
                int i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            offsetIfNeeded(coordinatorLayout, floatingActionButton);
            return true;
        }

        private float getFabTranslationYForSnackbar(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            boolean z = CoordinatorLayout.a;
            float f = 0.0f;
            List dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i = 0;
            while (i < size) {
                float min;
                View view = (View) dependencies.get(i);
                if ((view instanceof SnackbarLayout) && coordinatorLayout.doViewsOverlap(floatingActionButton, view)) {
                    min = Math.min(f, ViewCompat.getTranslationY(view) - ((float) view.getHeight()));
                } else {
                    min = f;
                }
                int i2 = i + 1;
                if (z) {
                    return min;
                }
                i = i2;
                f = min;
            }
            return f;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void offsetIfNeeded(android.support.design.widget.CoordinatorLayout r9, android.support.design.widget.FloatingActionButton r10) {
            /*
            r8 = this;
            r2 = 0;
            r3 = android.support.design.widget.CoordinatorLayout.a;
            r4 = android.support.design.widget.FloatingActionButton.access$000(r10);
            if (r4 == 0) goto L_0x0059;
        L_0x0009:
            r0 = r4.centerX();
            if (r0 <= 0) goto L_0x0059;
        L_0x000f:
            r0 = r4.centerY();
            if (r0 <= 0) goto L_0x0059;
        L_0x0015:
            r0 = r10.getLayoutParams();
            r0 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r0;
            r1 = r10.getRight();
            r5 = r9.getWidth();
            r6 = r0.rightMargin;
            r5 = r5 - r6;
            if (r1 < r5) goto L_0x005a;
        L_0x0028:
            r1 = r4.right;
            if (r3 == 0) goto L_0x0037;
        L_0x002c:
            r5 = r10.getLeft();
            r6 = r0.leftMargin;
            if (r5 > r6) goto L_0x0037;
        L_0x0034:
            r1 = r4.left;
            r1 = -r1;
        L_0x0037:
            r5 = r10.getBottom();
            r6 = r9.getBottom();
            r7 = r0.bottomMargin;
            r6 = r6 - r7;
            if (r5 < r6) goto L_0x0048;
        L_0x0044:
            r2 = r4.bottom;
            if (r3 == 0) goto L_0x0053;
        L_0x0048:
            r3 = r10.getTop();
            r0 = r0.topMargin;
            if (r3 > r0) goto L_0x0053;
        L_0x0050:
            r0 = r4.top;
            r2 = -r0;
        L_0x0053:
            r10.offsetTopAndBottom(r2);
            r10.offsetLeftAndRight(r1);
        L_0x0059:
            return;
        L_0x005a:
            r1 = r2;
            goto L_0x002c;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.FloatingActionButton.Behavior.offsetIfNeeded(android.support.design.widget.CoordinatorLayout, android.support.design.widget.FloatingActionButton):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean updateFabVisibility(android.support.design.widget.CoordinatorLayout r3, android.support.design.widget.AppBarLayout r4, android.support.design.widget.FloatingActionButton r5) {
            /*
            r2 = this;
            r0 = r5.getLayoutParams();
            r0 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r0;
            r0 = r0.getAnchorId();
            r1 = r4.getId();
            if (r0 == r1) goto L_0x0012;
        L_0x0010:
            r0 = 0;
        L_0x0011:
            return r0;
        L_0x0012:
            r0 = r2.mTmpRect;
            if (r0 != 0) goto L_0x001d;
        L_0x0016:
            r0 = new android.graphics.Rect;
            r0.<init>();
            r2.mTmpRect = r0;
        L_0x001d:
            r0 = r2.mTmpRect;
            android.support.design.widget.ViewGroupUtils.getDescendantRect(r3, r4, r0);
            r0 = r0.bottom;
            r1 = r4.getMinimumHeightForVisibleOverlappingContent();
            if (r0 > r1) goto L_0x0031;
        L_0x002a:
            r5.hide();
            r0 = android.support.design.widget.CoordinatorLayout.a;
            if (r0 == 0) goto L_0x0034;
        L_0x0031:
            r5.show();
        L_0x0034:
            r0 = 1;
            goto L_0x0011;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.FloatingActionButton.Behavior.updateFabVisibility(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.support.design.widget.FloatingActionButton):boolean");
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return onDependentViewChanged(coordinatorLayout, (FloatingActionButton) view, view2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onDependentViewChanged(android.support.design.widget.CoordinatorLayout r2, android.support.design.widget.FloatingActionButton r3, android.view.View r4) {
            /*
            r1 = this;
            r0 = r4 instanceof android.support.design.widget.Snackbar.SnackbarLayout;
            if (r0 == 0) goto L_0x000b;
        L_0x0004:
            r1.updateFabTranslationForSnackbar(r2, r3, r4);
            r0 = android.support.design.widget.CoordinatorLayout.a;
            if (r0 == 0) goto L_0x0014;
        L_0x000b:
            r0 = r4 instanceof android.support.design.widget.AppBarLayout;
            if (r0 == 0) goto L_0x0014;
        L_0x000f:
            r4 = (android.support.design.widget.AppBarLayout) r4;
            r1.updateFabVisibility(r2, r4, r3);
        L_0x0014:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.FloatingActionButton.Behavior.onDependentViewChanged(android.support.design.widget.CoordinatorLayout, android.support.design.widget.FloatingActionButton, android.view.View):boolean");
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return onLayoutChild(coordinatorLayout, (FloatingActionButton) view, i);
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return layoutDependsOn(coordinatorLayout, (FloatingActionButton) view, view2);
        }
    }

    static {
        String[] strArr = new String[6];
        String str = "j/t\u0010vE-|0aX*t\u001f@Y7o\u001el";
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
                        i3 = 44;
                        break;
                    case at.g /*1*/:
                        i3 = 67;
                        break;
                    case at.i /*2*/:
                        i3 = 27;
                        break;
                    case at.o /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 2;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u007f&o\u0005kB$;\u0010\"O6h\u0005mAcy\u0010aG$i\u001ewB';\u0018q\f-t\u0005\"_6k\u0001m^7~\u0015,";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "j/t\u0010vE-|0aX*t\u001f@Y7o\u001el";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "j/t\u0010vE-|0aX*t\u001f@Y7o\u001el";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u007f&o\u0005kB$;\u0010\"O6h\u0005mAcy\u0010aG$i\u001ewB';\u0018q\f-t\u0005\"_6k\u0001m^7~\u0015,";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007f&o\u0005kB$;\u0010\"O6h\u0005mAcy\u0010aG$i\u001ewB';\u0018q\f-t\u0005\"_6k\u0001m^7~\u0015,";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static int resolveAdjustedSize(int i, int i2) {
        boolean z = CoordinatorLayout.a;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                break;
            case v.m /*0*/:
                if (!z) {
                    return i;
                }
                break;
            case 1073741824:
                break;
            default:
                return i;
        }
        i = Math.min(i, size);
        if (!z) {
            return i;
        }
        return size;
    }

    public void hide() {
        this.mImpl.hide(null);
    }

    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mImpl.jumpDrawableToCurrentState();
    }

    public void setBackgroundResource(int i) {
        Log.i(z[0], z[1]);
    }

    public void setBackgroundTintMode(@Nullable Mode mode) {
        if (this.mBackgroundTintMode != mode) {
            this.mBackgroundTintMode = mode;
            this.mImpl.setBackgroundTintMode(mode);
        }
    }

    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        sizeDimension = Math.min(resolveAdjustedSize(sizeDimension, i), resolveAdjustedSize(sizeDimension, i2));
        setMeasuredDimension((this.mShadowPadding.left + sizeDimension) + this.mShadowPadding.right, (sizeDimension + this.mShadowPadding.top) + this.mShadowPadding.bottom);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.mImpl.onDrawableStateChanged(getDrawableState());
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mImpl.onDetachedFromWindow();
    }

    final int getSizeDimension() {
        switch (this.mSize) {
            case at.g /*1*/:
                return getResources().getDimensionPixelSize(R.dimen.design_fab_size_mini);
            default:
                return getResources().getDimensionPixelSize(R.dimen.design_fab_size_normal);
        }
    }

    static Mode parseTintMode(int i, Mode mode) {
        switch (i) {
            case at.o /*3*/:
                return Mode.SRC_OVER;
            case at.m /*5*/:
                return Mode.SRC_IN;
            case Y.l /*9*/:
                return Mode.SRC_ATOP;
            case arj.Toolbar_titleMarginEnd /*14*/:
                return Mode.MULTIPLY;
            case arj.Toolbar_titleMarginTop /*15*/:
                return Mode.SCREEN;
            default:
                return mode;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.mBackgroundTint;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mImpl.onAttachedToWindow();
    }

    static int access$100(FloatingActionButton floatingActionButton) {
        return floatingActionButton.mContentPadding;
    }

    public void show() {
        this.mImpl.show(null);
    }

    static void access$201(FloatingActionButton floatingActionButton, Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        Log.i(z[4], z[5]);
    }

    static Rect access$000(FloatingActionButton floatingActionButton) {
        return floatingActionButton.mShadowPadding;
    }

    @Nullable
    public Mode getBackgroundTintMode() {
        return this.mBackgroundTintMode;
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.mBackgroundTint != colorStateList) {
            this.mBackgroundTint = colorStateList;
            this.mImpl.setBackgroundTintList(colorStateList);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(z[3], z[2]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        r7 = this;
        r5 = 0;
        r4 = 0;
        r0 = android.support.design.widget.CoordinatorLayout.a;
        r7.<init>(r8, r9, r10);
        android.support.design.widget.ThemeUtils.checkAppCompatTheme(r8);
        r1 = new android.graphics.Rect;
        r1.<init>();
        r7.mShadowPadding = r1;
        r1 = android.support.design.R.styleable.FloatingActionButton;
        r2 = android.support.design.R.style.Widget_Design_FloatingActionButton;
        r1 = r8.obtainStyledAttributes(r9, r1, r10, r2);
        r2 = android.support.design.R.styleable.FloatingActionButton_backgroundTint;
        r2 = r1.getColorStateList(r2);
        r7.mBackgroundTint = r2;
        r2 = android.support.design.R.styleable.FloatingActionButton_backgroundTintMode;
        r3 = -1;
        r2 = r1.getInt(r2, r3);
        r3 = 0;
        r2 = parseTintMode(r2, r3);
        r7.mBackgroundTintMode = r2;
        r2 = android.support.design.R.styleable.FloatingActionButton_rippleColor;
        r2 = r1.getColor(r2, r4);
        r7.mRippleColor = r2;
        r2 = android.support.design.R.styleable.FloatingActionButton_fabSize;
        r2 = r1.getInt(r2, r4);
        r7.mSize = r2;
        r2 = android.support.design.R.styleable.FloatingActionButton_borderWidth;
        r2 = r1.getDimensionPixelSize(r2, r4);
        r7.mBorderWidth = r2;
        r2 = android.support.design.R.styleable.FloatingActionButton_elevation;
        r2 = r1.getDimension(r2, r5);
        r3 = android.support.design.R.styleable.FloatingActionButton_pressedTranslationZ;
        r3 = r1.getDimension(r3, r5);
        r1.recycle();
        r1 = new android.support.design.widget.FloatingActionButton$1;
        r1.<init>(r7);
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 21;
        if (r4 < r5) goto L_0x006a;
    L_0x0061:
        r5 = new android.support.design.widget.FloatingActionButtonLollipop;
        r5.<init>(r7, r1);
        r7.mImpl = r5;
        if (r0 == 0) goto L_0x007e;
    L_0x006a:
        r5 = 12;
        if (r4 < r5) goto L_0x0077;
    L_0x006e:
        r4 = new android.support.design.widget.FloatingActionButtonHoneycombMr1;
        r4.<init>(r7, r1);
        r7.mImpl = r4;
        if (r0 == 0) goto L_0x007e;
    L_0x0077:
        r0 = new android.support.design.widget.FloatingActionButtonEclairMr1;
        r0.<init>(r7, r1);
        r7.mImpl = r0;
    L_0x007e:
        r0 = r7.getResources();
        r1 = android.support.design.R.dimen.design_fab_content_size;
        r0 = r0.getDimension(r1);
        r0 = (int) r0;
        r1 = r7.getSizeDimension();
        r0 = r1 - r0;
        r0 = r0 / 2;
        r7.mContentPadding = r0;
        r0 = r7.mImpl;
        r1 = r7.mBackgroundTint;
        r4 = r7.mBackgroundTintMode;
        r5 = r7.mRippleColor;
        r6 = r7.mBorderWidth;
        r0.setBackgroundDrawable(r1, r4, r5, r6);
        r0 = r7.mImpl;
        r0.setElevation(r2);
        r0 = r7.mImpl;
        r0.setPressedTranslationZ(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
