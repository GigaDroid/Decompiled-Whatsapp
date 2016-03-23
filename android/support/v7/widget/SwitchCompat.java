package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.CompoundButton;
import org.v;
import org.whispersystems.at;

public class SwitchCompat extends CompoundButton {
    private static final int[] CHECKED_STATE_SET;
    private static final String[] z;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    private ThumbAnimation mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private CharSequence mTextOff;
    private CharSequence mTextOn;
    private TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    private float mThumbPosition;
    private int mThumbTextPadding;
    private int mThumbWidth;
    private final TintManager mTintManager;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private VelocityTracker mVelocityTracker;

    class 1 implements AnimationListener {
        final SwitchCompat this$0;
        final boolean val$newCheckedState;

        public void onAnimationEnd(Animation animation) {
            if (SwitchCompat.access$100(this.this$0) == animation) {
                float f;
                SwitchCompat switchCompat = this.this$0;
                if (this.val$newCheckedState) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                SwitchCompat.access$200(switchCompat, f);
                SwitchCompat.access$102(this.this$0, null);
            }
        }

        public void onAnimationStart(Animation animation) {
        }

        1(SwitchCompat switchCompat, boolean z) {
            this.this$0 = switchCompat;
            this.val$newCheckedState = z;
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    class ThumbAnimation extends Animation {
        final float mDiff;
        final float mEndPosition;
        final float mStartPosition;
        final SwitchCompat this$0;

        ThumbAnimation(SwitchCompat switchCompat, float f, float f2, 1 1) {
            this(switchCompat, f, f2);
        }

        private ThumbAnimation(SwitchCompat switchCompat, float f, float f2) {
            this.this$0 = switchCompat;
            this.mStartPosition = f;
            this.mEndPosition = f2;
            this.mDiff = f2 - f;
        }

        protected void applyTransformation(float f, Transformation transformation) {
            SwitchCompat.access$200(this.this$0, this.mStartPosition + (this.mDiff * f));
        }
    }

    private static float constrain(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    private void cancelSuperTouch(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getThumbScrollRange() {
        /*
        r4 = this;
        r0 = r4.mTrackDrawable;
        if (r0 == 0) goto L_0x002f;
    L_0x0004:
        r1 = r4.mTempRect;
        r0 = r4.mTrackDrawable;
        r0.getPadding(r1);
        r0 = r4.mThumbDrawable;
        if (r0 == 0) goto L_0x0019;
    L_0x000f:
        r0 = r4.mThumbDrawable;
        r0 = android.support.v7.widget.DrawableUtils.getOpticalBounds(r0);
        r2 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r2 == 0) goto L_0x001b;
    L_0x0019:
        r0 = android.support.v7.widget.DrawableUtils.INSETS_NONE;
    L_0x001b:
        r2 = r4.mSwitchWidth;
        r3 = r4.mThumbWidth;
        r2 = r2 - r3;
        r3 = r1.left;
        r2 = r2 - r3;
        r1 = r1.right;
        r1 = r2 - r1;
        r2 = r0.left;
        r1 = r1 - r2;
        r0 = r0.right;
        r0 = r1 - r0;
    L_0x002e:
        return r0;
    L_0x002f:
        r0 = 0;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.getThumbScrollRange():int");
    }

    private void cancelPositionAnimator() {
        if (this.mPositionAnimator != null) {
            clearAnimation();
            this.mPositionAnimator = null;
        }
    }

    public void jumpDrawablesToCurrentState() {
        if (VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.mThumbDrawable != null) {
                this.mThumbDrawable.jumpToCurrentState();
            }
            if (this.mTrackDrawable != null) {
                this.mTrackDrawable.jumpToCurrentState();
            }
            cancelPositionAnimator();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (VERSION.SDK_INT >= 14) {
            CharSequence charSequence;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(z[0]);
            if (isChecked()) {
                charSequence = this.mTextOn;
            } else {
                charSequence = this.mTextOff;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    if (!LinearLayoutCompat.a) {
                        return;
                    }
                }
                CharSequence stringBuilder = new StringBuilder();
                stringBuilder.append(text).append(' ').append(charSequence);
                accessibilityNodeInfo.setText(stringBuilder);
            }
        }
    }

    public void setSwitchTypeface(Typeface typeface) {
        if (this.mTextPaint.getTypeface() != typeface) {
            this.mTextPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.mThumbDrawable != null) {
            DrawableCompat.setHotspot(this.mThumbDrawable, f, f2);
        }
        if (this.mTrackDrawable != null) {
            DrawableCompat.setHotspot(this.mTrackDrawable, f, f2);
        }
    }

    static void access$200(SwitchCompat switchCompat, float f) {
        switchCompat.setThumbPosition(f);
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r11) {
        /*
        r10 = this;
        r2 = android.support.v7.widget.LinearLayoutCompat.a;
        super.onDraw(r11);
        r0 = r10.mTempRect;
        r1 = r10.mTrackDrawable;
        if (r1 == 0) goto L_0x0010;
    L_0x000b:
        r1.getPadding(r0);
        if (r2 == 0) goto L_0x0013;
    L_0x0010:
        r0.setEmpty();
    L_0x0013:
        r3 = r10.mSwitchTop;
        r4 = r10.mSwitchBottom;
        r5 = r0.top;
        r3 = r3 + r5;
        r5 = r0.bottom;
        r4 = r4 - r5;
        r5 = r10.mThumbDrawable;
        if (r1 == 0) goto L_0x0051;
    L_0x0021:
        r6 = r10.mSplitTrack;
        if (r6 == 0) goto L_0x004e;
    L_0x0025:
        if (r5 == 0) goto L_0x004e;
    L_0x0027:
        r6 = android.support.v7.widget.DrawableUtils.getOpticalBounds(r5);
        r5.copyBounds(r0);
        r7 = r0.left;
        r8 = r6.left;
        r7 = r7 + r8;
        r0.left = r7;
        r7 = r0.right;
        r6 = r6.right;
        r6 = r7 - r6;
        r0.right = r6;
        r6 = r11.save();
        r7 = android.graphics.Region.Op.DIFFERENCE;
        r11.clipRect(r0, r7);
        r1.draw(r11);
        r11.restoreToCount(r6);
        if (r2 == 0) goto L_0x0051;
    L_0x004e:
        r1.draw(r11);
    L_0x0051:
        r6 = r11.save();
        if (r5 == 0) goto L_0x005a;
    L_0x0057:
        r5.draw(r11);
    L_0x005a:
        r0 = r10.getTargetCheckedState();
        if (r0 == 0) goto L_0x00ae;
    L_0x0060:
        r0 = r10.mOnLayout;
        r1 = r0;
    L_0x0063:
        if (r1 == 0) goto L_0x00aa;
    L_0x0065:
        r0 = r10.getDrawableState();
        r7 = r10.mTextColors;
        if (r7 == 0) goto L_0x0079;
    L_0x006d:
        r7 = r10.mTextPaint;
        r8 = r10.mTextColors;
        r9 = 0;
        r8 = r8.getColorForState(r0, r9);
        r7.setColor(r8);
    L_0x0079:
        r7 = r10.mTextPaint;
        r7.drawableState = r0;
        if (r5 == 0) goto L_0x008a;
    L_0x007f:
        r0 = r5.getBounds();
        r5 = r0.left;
        r0 = r0.right;
        r0 = r0 + r5;
        if (r2 == 0) goto L_0x008e;
    L_0x008a:
        r0 = r10.getWidth();
    L_0x008e:
        r0 = r0 / 2;
        r2 = r1.getWidth();
        r2 = r2 / 2;
        r0 = r0 - r2;
        r2 = r3 + r4;
        r2 = r2 / 2;
        r3 = r1.getHeight();
        r3 = r3 / 2;
        r2 = r2 - r3;
        r0 = (float) r0;
        r2 = (float) r2;
        r11.translate(r0, r2);
        r1.draw(r11);
    L_0x00aa:
        r11.restoreToCount(r6);
        return;
    L_0x00ae:
        r0 = r10.mOffLayout;
        r1 = r0;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onDraw(android.graphics.Canvas):void");
    }

    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && ViewCompat.isLaidOut(this) && isShown()) {
            animateThumbToCheckedState(isChecked);
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        cancelPositionAnimator();
        if (isChecked) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    private void setSwitchTypefaceByIndex(int i, int i2) {
        Typeface typeface = null;
        switch (i) {
            case at.g /*1*/:
                typeface = Typeface.SANS_SERIF;
                break;
            case at.i /*2*/:
                typeface = Typeface.SERIF;
                break;
            case at.o /*3*/:
                typeface = Typeface.MONOSPACE;
                break;
        }
        setSwitchTypeface(typeface, i2);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
        r10 = this;
        r7 = r10.mTempRect;
        r1 = r10.mSwitchLeft;
        r3 = r10.mSwitchTop;
        r4 = r10.mSwitchRight;
        r5 = r10.mSwitchBottom;
        r0 = r10.getThumbOffset();
        r2 = r1 + r0;
        r0 = r10.mThumbDrawable;
        if (r0 == 0) goto L_0x001e;
    L_0x0014:
        r0 = r10.mThumbDrawable;
        r0 = android.support.v7.widget.DrawableUtils.getOpticalBounds(r0);
        r6 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r6 == 0) goto L_0x0020;
    L_0x001e:
        r0 = android.support.v7.widget.DrawableUtils.INSETS_NONE;
    L_0x0020:
        r6 = r10.mTrackDrawable;
        if (r6 == 0) goto L_0x0091;
    L_0x0024:
        r6 = r10.mTrackDrawable;
        r6.getPadding(r7);
        r6 = r7.left;
        r6 = r6 + r2;
        if (r0 == 0) goto L_0x008e;
    L_0x002e:
        r2 = r0.left;
        r8 = r7.left;
        if (r2 <= r8) goto L_0x003a;
    L_0x0034:
        r2 = r0.left;
        r8 = r7.left;
        r2 = r2 - r8;
        r1 = r1 + r2;
    L_0x003a:
        r2 = r0.top;
        r8 = r7.top;
        if (r2 <= r8) goto L_0x008c;
    L_0x0040:
        r2 = r0.top;
        r8 = r7.top;
        r2 = r2 - r8;
        r2 = r2 + r3;
    L_0x0046:
        r8 = r0.right;
        r9 = r7.right;
        if (r8 <= r9) goto L_0x0052;
    L_0x004c:
        r8 = r0.right;
        r9 = r7.right;
        r8 = r8 - r9;
        r4 = r4 - r8;
    L_0x0052:
        r8 = r0.bottom;
        r9 = r7.bottom;
        if (r8 <= r9) goto L_0x008a;
    L_0x0058:
        r0 = r0.bottom;
        r8 = r7.bottom;
        r0 = r0 - r8;
        r0 = r5 - r0;
    L_0x005f:
        r8 = r10.mTrackDrawable;
        r8.setBounds(r1, r2, r4, r0);
        r0 = r6;
    L_0x0065:
        r1 = r10.mThumbDrawable;
        if (r1 == 0) goto L_0x0086;
    L_0x0069:
        r1 = r10.mThumbDrawable;
        r1.getPadding(r7);
        r1 = r7.left;
        r1 = r0 - r1;
        r2 = r10.mThumbWidth;
        r0 = r0 + r2;
        r2 = r7.right;
        r0 = r0 + r2;
        r2 = r10.mThumbDrawable;
        r2.setBounds(r1, r3, r0, r5);
        r2 = r10.getBackground();
        if (r2 == 0) goto L_0x0086;
    L_0x0083:
        android.support.v4.graphics.drawable.DrawableCompat.setHotspotBounds(r2, r1, r3, r0, r5);
    L_0x0086:
        super.draw(r11);
        return;
    L_0x008a:
        r0 = r5;
        goto L_0x005f;
    L_0x008c:
        r2 = r3;
        goto L_0x0046;
    L_0x008e:
        r0 = r5;
        r2 = r3;
        goto L_0x005f;
    L_0x0091:
        r0 = r2;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.draw(android.graphics.Canvas):void");
    }

    static ThumbAnimation access$102(SwitchCompat switchCompat, ThumbAnimation thumbAnimation) {
        switchCompat.mPositionAnimator = thumbAnimation;
        return thumbAnimation;
    }

    public void toggle() {
        boolean z;
        if (isChecked()) {
            z = false;
        } else {
            z = true;
        }
        setChecked(z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void stopDrag(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r7 = 0;
        r1 = 1;
        r2 = 0;
        r4 = android.support.v7.widget.LinearLayoutCompat.a;
        r8.mTouchMode = r2;
        r0 = r9.getAction();
        if (r0 != r1) goto L_0x0052;
    L_0x000d:
        r0 = r8.isEnabled();
        if (r0 == 0) goto L_0x0052;
    L_0x0013:
        r0 = r1;
    L_0x0014:
        r3 = r8.isChecked();
        if (r0 == 0) goto L_0x0045;
    L_0x001a:
        r0 = r8.mVelocityTracker;
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.computeCurrentVelocity(r5);
        r0 = r8.mVelocityTracker;
        r0 = r0.getXVelocity();
        r5 = java.lang.Math.abs(r0);
        r6 = r8.mMinFlingVelocity;
        r6 = (float) r6;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x003f;
    L_0x0032:
        r5 = android.support.v7.widget.ViewUtils.isLayoutRtl(r8);
        if (r5 == 0) goto L_0x0056;
    L_0x0038:
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 >= 0) goto L_0x0054;
    L_0x003c:
        r0 = r1;
    L_0x003d:
        if (r4 == 0) goto L_0x0043;
    L_0x003f:
        r0 = r8.getTargetCheckedState();
    L_0x0043:
        if (r4 == 0) goto L_0x0046;
    L_0x0045:
        r0 = r3;
    L_0x0046:
        if (r0 == r3) goto L_0x004b;
    L_0x0048:
        r8.playSoundEffect(r2);
    L_0x004b:
        r8.setChecked(r0);
        r8.cancelSuperTouch(r9);
        return;
    L_0x0052:
        r0 = r2;
        goto L_0x0014;
    L_0x0054:
        r0 = r2;
        goto L_0x003d;
    L_0x0056:
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 <= 0) goto L_0x005c;
    L_0x005a:
        r0 = r1;
        goto L_0x003d;
    L_0x005c:
        r0 = r2;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.stopDrag(android.view.MotionEvent):void");
    }

    static ThumbAnimation access$100(SwitchCompat switchCompat) {
        return switchCompat.mPositionAnimator;
    }

    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(z[1]);
    }

    private Layout makeLayout(CharSequence charSequence) {
        CharSequence transformation;
        int ceil;
        if (this.mSwitchTransformationMethod != null) {
            transformation = this.mSwitchTransformationMethod.getTransformation(charSequence, this);
        } else {
            transformation = charSequence;
        }
        TextPaint textPaint = this.mTextPaint;
        if (transformation != null) {
            ceil = (int) Math.ceil((double) Layout.getDesiredWidth(transformation, this.mTextPaint));
        } else {
            ceil = 0;
        }
        return new StaticLayout(transformation, textPaint, ceil, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mTempRect = new Rect();
        this.mTextPaint = new TextPaint(1);
        Resources resources = getResources();
        this.mTextPaint.density = resources.getDisplayMetrics().density;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.SwitchCompat, i, 0);
        this.mThumbDrawable = obtainStyledAttributes.getDrawable(R.styleable.SwitchCompat_android_thumb);
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.setCallback(this);
        }
        this.mTrackDrawable = obtainStyledAttributes.getDrawable(R.styleable.SwitchCompat_track);
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.setCallback(this);
        }
        this.mTextOn = obtainStyledAttributes.getText(R.styleable.SwitchCompat_android_textOn);
        this.mTextOff = obtainStyledAttributes.getText(R.styleable.SwitchCompat_android_textOff);
        this.mShowText = obtainStyledAttributes.getBoolean(R.styleable.SwitchCompat_showText, true);
        this.mThumbTextPadding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.mSwitchMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchCompat_switchMinWidth, 0);
        this.mSwitchPadding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchCompat_switchPadding, 0);
        this.mSplitTrack = obtainStyledAttributes.getBoolean(R.styleable.SwitchCompat_splitTrack, false);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        this.mTintManager = obtainStyledAttributes.getTintManager();
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    static {
        String[] strArr = new String[2];
        String str = "\u001am\u0000^a\u0012gJ[g\u001fd\u0001X (t\rXm\u0013";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 123;
                        break;
                    case at.g /*1*/:
                        i4 = 3;
                        break;
                    case at.i /*2*/:
                        i4 = 100;
                        break;
                    case at.o /*3*/:
                        i4 = 44;
                        break;
                    default:
                        i4 = 14;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CHECKED_STATE_SET = new int[]{16842912};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001am\u0000^a\u0012gJ[g\u001fd\u0001X (t\rXm\u0013";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.setState(drawableState);
        }
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.setState(drawableState);
        }
        invalidate();
    }

    @TargetApi(14)
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Object obj;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            obj = this.mTextOn;
        } else {
            obj = this.mTextOff;
        }
        if (obj != null) {
            accessibilityEvent.getText().add(obj);
        }
    }

    private boolean hitThumb(float f, float f2) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i = this.mSwitchTop - this.mTouchSlop;
        thumbOffset = (thumbOffset + this.mSwitchLeft) - this.mTouchSlop;
        int i2 = (((this.mThumbWidth + thumbOffset) + this.mTempRect.left) + this.mTempRect.right) + this.mTouchSlop;
        int i3 = this.mSwitchBottom + this.mTouchSlop;
        if (f <= ((float) thumbOffset) || f >= ((float) i2) || f2 <= ((float) i) || f2 >= ((float) i3)) {
            return false;
        }
        return true;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    public int getCompoundPaddingLeft() {
        if (!ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        if (TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft;
        }
        return compoundPaddingLeft + this.mSwitchPadding;
    }

    public int getCompoundPaddingRight() {
        if (ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        if (TextUtils.isEmpty(getText())) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + this.mSwitchPadding;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
        r6 = this;
        r0 = 0;
        r4 = android.support.v7.widget.LinearLayoutCompat.a;
        super.onLayout(r7, r8, r9, r10, r11);
        r1 = r6.mThumbDrawable;
        if (r1 == 0) goto L_0x009c;
    L_0x000a:
        r2 = r6.mTempRect;
        r1 = r6.mTrackDrawable;
        if (r1 == 0) goto L_0x0017;
    L_0x0010:
        r1 = r6.mTrackDrawable;
        r1.getPadding(r2);
        if (r4 == 0) goto L_0x001a;
    L_0x0017:
        r2.setEmpty();
    L_0x001a:
        r1 = r6.mThumbDrawable;
        r3 = android.support.v7.widget.DrawableUtils.getOpticalBounds(r1);
        r1 = r3.left;
        r5 = r2.left;
        r1 = r1 - r5;
        r1 = java.lang.Math.max(r0, r1);
        r3 = r3.right;
        r2 = r2.right;
        r2 = r3 - r2;
        r0 = java.lang.Math.max(r0, r2);
    L_0x0033:
        r2 = android.support.v7.widget.ViewUtils.isLayoutRtl(r6);
        if (r2 == 0) goto L_0x0045;
    L_0x0039:
        r2 = r6.getPaddingLeft();
        r2 = r2 + r1;
        r3 = r6.mSwitchWidth;
        r3 = r3 + r2;
        r3 = r3 - r1;
        r3 = r3 - r0;
        if (r4 == 0) goto L_0x0099;
    L_0x0045:
        r2 = r6.getWidth();
        r3 = r6.getPaddingRight();
        r2 = r2 - r3;
        r2 = r2 - r0;
        r3 = r6.mSwitchWidth;
        r3 = r2 - r3;
        r1 = r1 + r3;
        r0 = r0 + r1;
        r1 = r2;
    L_0x0056:
        r2 = r6.getGravity();
        r2 = r2 & 112;
        switch(r2) {
            case 16: goto L_0x0068;
            case 80: goto L_0x0083;
            default: goto L_0x005f;
        };
    L_0x005f:
        r3 = r6.getPaddingTop();
        r2 = r6.mSwitchHeight;
        r2 = r2 + r3;
        if (r4 == 0) goto L_0x0090;
    L_0x0068:
        r2 = r6.getPaddingTop();
        r3 = r6.getHeight();
        r2 = r2 + r3;
        r3 = r6.getPaddingBottom();
        r2 = r2 - r3;
        r2 = r2 / 2;
        r3 = r6.mSwitchHeight;
        r3 = r3 / 2;
        r3 = r2 - r3;
        r2 = r6.mSwitchHeight;
        r2 = r2 + r3;
        if (r4 == 0) goto L_0x0090;
    L_0x0083:
        r2 = r6.getHeight();
        r3 = r6.getPaddingBottom();
        r2 = r2 - r3;
        r3 = r6.mSwitchHeight;
        r3 = r2 - r3;
    L_0x0090:
        r6.mSwitchLeft = r0;
        r6.mSwitchTop = r3;
        r6.mSwitchBottom = r2;
        r6.mSwitchRight = r1;
        return;
    L_0x0099:
        r0 = r2;
        r1 = r3;
        goto L_0x0056;
    L_0x009c:
        r1 = r0;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onLayout(boolean, int, int, int, int):void");
    }

    private void animateThumbToCheckedState(boolean z) {
        float f;
        if (this.mPositionAnimator != null) {
            cancelPositionAnimator();
        }
        float f2 = this.mThumbPosition;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.mPositionAnimator = new ThumbAnimation(this, f2, f, null);
        this.mPositionAnimator.setDuration(250);
        this.mPositionAnimator.setAnimationListener(new 1(this, z));
        startAnimation(this.mPositionAnimator);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSwitchTextAppearance(android.content.Context r8, int r9) {
        /*
        r7 = this;
        r6 = 0;
        r5 = -1;
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        r1 = android.support.v7.appcompat.R.styleable.TextAppearance;
        r1 = r8.obtainStyledAttributes(r9, r1);
        r2 = android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor;
        r2 = r1.getColorStateList(r2);
        if (r2 == 0) goto L_0x0016;
    L_0x0012:
        r7.mTextColors = r2;
        if (r0 == 0) goto L_0x001c;
    L_0x0016:
        r2 = r7.getTextColors();
        r7.mTextColors = r2;
    L_0x001c:
        r2 = android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize;
        r2 = r1.getDimensionPixelSize(r2, r6);
        if (r2 == 0) goto L_0x0038;
    L_0x0024:
        r3 = (float) r2;
        r4 = r7.mTextPaint;
        r4 = r4.getTextSize();
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 == 0) goto L_0x0038;
    L_0x002f:
        r3 = r7.mTextPaint;
        r2 = (float) r2;
        r3.setTextSize(r2);
        r7.requestLayout();
    L_0x0038:
        r2 = android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface;
        r2 = r1.getInt(r2, r5);
        r3 = android.support.v7.appcompat.R.styleable.TextAppearance_android_textStyle;
        r3 = r1.getInt(r3, r5);
        r7.setSwitchTypefaceByIndex(r2, r3);
        r2 = android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps;
        r2 = r1.getBoolean(r2, r6);
        if (r2 == 0) goto L_0x005c;
    L_0x004f:
        r2 = new android.support.v7.text.AllCapsTransformationMethod;
        r3 = r7.getContext();
        r2.<init>(r3);
        r7.mSwitchTransformationMethod = r2;
        if (r0 == 0) goto L_0x005f;
    L_0x005c:
        r0 = 0;
        r7.mSwitchTransformationMethod = r0;
    L_0x005f:
        r1.recycle();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.setSwitchTextAppearance(android.content.Context, int):void");
    }

    private void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r7 = 2;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = 0;
        r2 = 1;
        r3 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r8.mVelocityTracker;
        r0.addMovement(r9);
        r0 = android.support.v4.view.MotionEventCompat.getActionMasked(r9);
        switch(r0) {
            case 0: goto L_0x0018;
            case 1: goto L_0x003b;
            case 2: goto L_0x0034;
            case 3: goto L_0x003b;
            default: goto L_0x0013;
        };
    L_0x0013:
        r0 = super.onTouchEvent(r9);
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r9.getX();
        r4 = r9.getY();
        r5 = r8.isEnabled();
        if (r5 == 0) goto L_0x0013;
    L_0x0026:
        r5 = r8.hitThumb(r0, r4);
        if (r5 == 0) goto L_0x0013;
    L_0x002c:
        r8.mTouchMode = r2;
        r8.mTouchX = r0;
        r8.mTouchY = r4;
        if (r3 == 0) goto L_0x0013;
    L_0x0034:
        r0 = r8.mTouchMode;
        switch(r0) {
            case 0: goto L_0x0047;
            case 1: goto L_0x0049;
            case 2: goto L_0x007e;
            default: goto L_0x0039;
        };
    L_0x0039:
        if (r3 == 0) goto L_0x0013;
    L_0x003b:
        r0 = r8.mTouchMode;
        if (r0 != r7) goto L_0x00b5;
    L_0x003f:
        r8.stopDrag(r9);
        super.onTouchEvent(r9);
        r0 = r2;
        goto L_0x0017;
    L_0x0047:
        if (r3 == 0) goto L_0x0039;
    L_0x0049:
        r0 = r9.getX();
        r1 = r9.getY();
        r4 = r8.mTouchX;
        r4 = r0 - r4;
        r4 = java.lang.Math.abs(r4);
        r5 = r8.mTouchSlop;
        r5 = (float) r5;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 > 0) goto L_0x006f;
    L_0x0060:
        r4 = r8.mTouchY;
        r4 = r1 - r4;
        r4 = java.lang.Math.abs(r4);
        r5 = r8.mTouchSlop;
        r5 = (float) r5;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 <= 0) goto L_0x0039;
    L_0x006f:
        r8.mTouchMode = r7;
        r3 = r8.getParent();
        r3.requestDisallowInterceptTouchEvent(r2);
        r8.mTouchX = r0;
        r8.mTouchY = r1;
        r0 = r2;
        goto L_0x0017;
    L_0x007e:
        r4 = r9.getX();
        r0 = r8.getThumbScrollRange();
        r5 = r8.mTouchX;
        r5 = r4 - r5;
        if (r0 == 0) goto L_0x0091;
    L_0x008c:
        r0 = (float) r0;
        r0 = r5 / r0;
        if (r3 == 0) goto L_0x0096;
    L_0x0091:
        r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00b2;
    L_0x0095:
        r0 = r1;
    L_0x0096:
        r3 = android.support.v7.widget.ViewUtils.isLayoutRtl(r8);
        if (r3 == 0) goto L_0x009d;
    L_0x009c:
        r0 = -r0;
    L_0x009d:
        r3 = r8.mThumbPosition;
        r0 = r0 + r3;
        r0 = constrain(r0, r6, r1);
        r1 = r8.mThumbPosition;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 == 0) goto L_0x00af;
    L_0x00aa:
        r8.mTouchX = r4;
        r8.setThumbPosition(r0);
    L_0x00af:
        r0 = r2;
        goto L_0x0017;
    L_0x00b2:
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        goto L_0x0096;
    L_0x00b5:
        r0 = 0;
        r8.mTouchMode = r0;
        r0 = r8.mVelocityTracker;
        r0.clear();
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        r1 = 0;
        r4 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r7.mShowText;
        if (r0 == 0) goto L_0x001f;
    L_0x0007:
        r0 = r7.mOnLayout;
        if (r0 != 0) goto L_0x0013;
    L_0x000b:
        r0 = r7.mTextOn;
        r0 = r7.makeLayout(r0);
        r7.mOnLayout = r0;
    L_0x0013:
        r0 = r7.mOffLayout;
        if (r0 != 0) goto L_0x001f;
    L_0x0017:
        r0 = r7.mTextOff;
        r0 = r7.makeLayout(r0);
        r7.mOffLayout = r0;
    L_0x001f:
        r5 = r7.mTempRect;
        r0 = r7.mThumbDrawable;
        if (r0 == 0) goto L_0x003f;
    L_0x0025:
        r0 = r7.mThumbDrawable;
        r0.getPadding(r5);
        r0 = r7.mThumbDrawable;
        r0 = r0.getIntrinsicWidth();
        r2 = r5.left;
        r0 = r0 - r2;
        r2 = r5.right;
        r2 = r0 - r2;
        r0 = r7.mThumbDrawable;
        r0 = r0.getIntrinsicHeight();
        if (r4 == 0) goto L_0x0041;
    L_0x003f:
        r0 = r1;
        r2 = r1;
    L_0x0041:
        r3 = r7.mShowText;
        if (r3 == 0) goto L_0x005c;
    L_0x0045:
        r3 = r7.mOnLayout;
        r3 = r3.getWidth();
        r6 = r7.mOffLayout;
        r6 = r6.getWidth();
        r3 = java.lang.Math.max(r3, r6);
        r6 = r7.mThumbTextPadding;
        r6 = r6 * 2;
        r3 = r3 + r6;
        if (r4 == 0) goto L_0x005d;
    L_0x005c:
        r3 = r1;
    L_0x005d:
        r2 = java.lang.Math.max(r3, r2);
        r7.mThumbWidth = r2;
        r2 = r7.mTrackDrawable;
        if (r2 == 0) goto L_0x0074;
    L_0x0067:
        r2 = r7.mTrackDrawable;
        r2.getPadding(r5);
        r2 = r7.mTrackDrawable;
        r2 = r2.getIntrinsicHeight();
        if (r4 == 0) goto L_0x00b6;
    L_0x0074:
        r5.setEmpty();
    L_0x0077:
        r3 = r5.left;
        r2 = r5.right;
        r4 = r7.mThumbDrawable;
        if (r4 == 0) goto L_0x0091;
    L_0x007f:
        r4 = r7.mThumbDrawable;
        r4 = android.support.v7.widget.DrawableUtils.getOpticalBounds(r4);
        r5 = r4.left;
        r3 = java.lang.Math.max(r3, r5);
        r4 = r4.right;
        r2 = java.lang.Math.max(r2, r4);
    L_0x0091:
        r4 = r7.mSwitchMinWidth;
        r5 = r7.mThumbWidth;
        r5 = r5 * 2;
        r3 = r3 + r5;
        r2 = r2 + r3;
        r2 = java.lang.Math.max(r4, r2);
        r0 = java.lang.Math.max(r1, r0);
        r7.mSwitchWidth = r2;
        r7.mSwitchHeight = r0;
        super.onMeasure(r8, r9);
        r1 = r7.getMeasuredHeight();
        if (r1 >= r0) goto L_0x00b5;
    L_0x00ae:
        r1 = android.support.v4.view.ViewCompat.getMeasuredWidthAndState(r7);
        r7.setMeasuredDimension(r1, r0);
    L_0x00b5:
        return;
    L_0x00b6:
        r1 = r2;
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onMeasure(int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getThumbOffset() {
        /*
        r2 = this;
        r0 = android.support.v7.widget.ViewUtils.isLayoutRtl(r2);
        if (r0 == 0) goto L_0x000f;
    L_0x0006:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = r2.mThumbPosition;
        r0 = r0 - r1;
        r1 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r1 == 0) goto L_0x0011;
    L_0x000f:
        r0 = r2.mThumbPosition;
    L_0x0011:
        r1 = r2.getThumbScrollRange();
        r1 = (float) r1;
        r0 = r0 * r1;
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r0 = (int) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.getThumbOffset():int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSwitchTypeface(android.graphics.Typeface r7, int r8) {
        /*
        r6 = this;
        r2 = 0;
        r1 = 0;
        r3 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r8 <= 0) goto L_0x0036;
    L_0x0006:
        if (r7 != 0) goto L_0x000e;
    L_0x0008:
        r7 = android.graphics.Typeface.defaultFromStyle(r8);
        if (r3 == 0) goto L_0x0012;
    L_0x000e:
        r7 = android.graphics.Typeface.create(r7, r8);
    L_0x0012:
        r6.setSwitchTypeface(r7);
        if (r7 == 0) goto L_0x0044;
    L_0x0017:
        r0 = r7.getStyle();
    L_0x001b:
        r0 = r0 ^ -1;
        r4 = r8 & r0;
        r5 = r6.mTextPaint;
        r0 = r4 & 1;
        if (r0 == 0) goto L_0x0046;
    L_0x0025:
        r0 = 1;
    L_0x0026:
        r5.setFakeBoldText(r0);
        r5 = r6.mTextPaint;
        r0 = r4 & 2;
        if (r0 == 0) goto L_0x0048;
    L_0x002f:
        r0 = -1098907648; // 0xffffffffbe800000 float:-0.25 double:NaN;
    L_0x0031:
        r5.setTextSkewX(r0);
        if (r3 == 0) goto L_0x0043;
    L_0x0036:
        r0 = r6.mTextPaint;
        r0.setFakeBoldText(r1);
        r0 = r6.mTextPaint;
        r0.setTextSkewX(r2);
        r6.setSwitchTypeface(r7);
    L_0x0043:
        return;
    L_0x0044:
        r0 = r1;
        goto L_0x001b;
    L_0x0046:
        r0 = r1;
        goto L_0x0026;
    L_0x0048:
        r0 = r2;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.setSwitchTypeface(android.graphics.Typeface, int):void");
    }
}
