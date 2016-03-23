package android.support.design.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import org.v;
import org.whispersystems.at;

@TargetApi(21)
class FloatingActionButtonLollipop extends FloatingActionButtonHoneycombMr1 {
    private static final String[] z;
    private Interpolator mInterpolator;

    static {
        String[] strArr = new String[3];
        String str = "o\u007f\u0003|Gwl\u0016{[uW";
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
                        i3 = 27;
                        break;
                    case at.g /*1*/:
                        i3 = 13;
                        break;
                    case at.i /*2*/:
                        i3 = 98;
                        break;
                    case at.o /*3*/:
                        i3 = 18;
                        break;
                    default:
                        i3 = 52;
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
                    str = "o\u007f\u0003|Gwl\u0016{[uW";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "o\u007f\u0003|Gwl\u0016{[uW";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    void setPressedTranslationZ(float f) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(PRESSED_ENABLED_STATE_SET, setupAnimator(ObjectAnimator.ofFloat(this.mView, z[1], new float[]{f})));
        stateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, setupAnimator(ObjectAnimator.ofFloat(this.mView, z[2], new float[]{f})));
        stateListAnimator.addState(EMPTY_STATE_SET, setupAnimator(ObjectAnimator.ofFloat(this.mView, z[0], new float[]{0.0f})));
        this.mView.setStateListAnimator(stateListAnimator);
    }

    public void setElevation(float f) {
        ViewCompat.setElevation(this.mView, f);
    }

    private Animator setupAnimator(Animator animator) {
        animator.setInterpolator(this.mInterpolator);
        return animator;
    }

    CircularBorderDrawable newCircularDrawable() {
        return new CircularBorderDrawableLollipop();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void setBackgroundDrawable(android.content.res.ColorStateList r7, android.graphics.PorterDuff.Mode r8, int r9, int r10) {
        /*
        r6 = this;
        r5 = 0;
        r4 = 0;
        r0 = r6.createShapeDrawable();
        r0 = android.support.v4.graphics.drawable.DrawableCompat.wrap(r0);
        r6.mShapeDrawable = r0;
        r0 = r6.mShapeDrawable;
        android.support.v4.graphics.drawable.DrawableCompat.setTintList(r0, r7);
        if (r8 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r6.mShapeDrawable;
        android.support.v4.graphics.drawable.DrawableCompat.setTintMode(r0, r8);
    L_0x0018:
        if (r10 <= 0) goto L_0x0035;
    L_0x001a:
        r0 = r6.createBorderDrawable(r10, r7);
        r6.mBorderDrawable = r0;
        r0 = new android.graphics.drawable.LayerDrawable;
        r1 = 2;
        r1 = new android.graphics.drawable.Drawable[r1];
        r2 = r6.mBorderDrawable;
        r1[r4] = r2;
        r2 = 1;
        r3 = r6.mShapeDrawable;
        r1[r2] = r3;
        r0.<init>(r1);
        r1 = android.support.design.widget.CoordinatorLayout.a;
        if (r1 == 0) goto L_0x0039;
    L_0x0035:
        r6.mBorderDrawable = r5;
        r0 = r6.mShapeDrawable;
    L_0x0039:
        r1 = new android.graphics.drawable.RippleDrawable;
        r2 = android.content.res.ColorStateList.valueOf(r9);
        r1.<init>(r2, r0, r5);
        r6.mRippleDrawable = r1;
        r0 = r6.mShadowViewDelegate;
        r1 = r6.mRippleDrawable;
        r0.setBackgroundDrawable(r1);
        r0 = r6.mShadowViewDelegate;
        r0.setShadowPadding(r4, r4, r4, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.FloatingActionButtonLollipop.setBackgroundDrawable(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, int, int):void");
    }

    boolean requirePreDrawListener() {
        return false;
    }

    FloatingActionButtonLollipop(View view, ShadowViewDelegate shadowViewDelegate) {
        super(view, shadowViewDelegate);
        if (!view.isInEditMode()) {
            this.mInterpolator = AnimationUtils.loadInterpolator(this.mView.getContext(), 17563661);
        }
    }

    void jumpDrawableToCurrentState() {
    }

    void onDrawableStateChanged(int[] iArr) {
    }
}
