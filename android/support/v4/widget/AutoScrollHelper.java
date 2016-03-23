package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import org.v;
import org.whispersystems.at;

public abstract class AutoScrollHelper implements OnTouchListener {
    private static final int DEFAULT_ACTIVATION_DELAY;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    private boolean mAnimating;
    private final Interpolator mEdgeInterpolator;
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    private float[] mMaximumEdges;
    private float[] mMaximumVelocity;
    private float[] mMinimumVelocity;
    private boolean mNeedsCancel;
    private boolean mNeedsReset;
    private float[] mRelativeEdges;
    private float[] mRelativeVelocity;
    private Runnable mRunnable;
    private final ClampedScroller mScroller;
    private final View mTarget;

    class ClampedScroller {
        private static final String z;
        private long mDeltaTime;
        private int mDeltaX;
        private int mDeltaY;
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private long mStartTime;
        private long mStopTime;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;

        static {
            char[] toCharArray = "d* \u0015RSk-\u0014PW>:\u001e\u001dT(<\u0014QKk*\u001eQS*n\u0019XA$<\u001e\u001dD*\"\u0017TI,n\bIF9:S\u0014".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 39;
                        break;
                    case at.g /*1*/:
                        i2 = 75;
                        break;
                    case at.i /*2*/:
                        i2 = 78;
                        break;
                    case at.o /*3*/:
                        i2 = 123;
                        break;
                    default:
                        i2 = 61;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public boolean isFinished() {
            try {
                if (this.mStopTime > 0) {
                    if (AnimationUtils.currentAnimationTimeMillis() > this.mStopTime + ((long) this.mEffectiveRampDown)) {
                        return true;
                    }
                }
                return false;
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }

        public int getVerticalDirection() {
            return (int) (this.mTargetVelocityY / Math.abs(this.mTargetVelocityY));
        }

        public void setRampUpDuration(int i) {
            this.mRampUpDuration = i;
        }

        public int getDeltaY() {
            return this.mDeltaY;
        }

        public ClampedScroller() {
            this.mStartTime = Long.MIN_VALUE;
            this.mStopTime = -1;
            this.mDeltaTime = 0;
            this.mDeltaX = 0;
            this.mDeltaY = 0;
        }

        public void requestStop() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mEffectiveRampDown = AutoScrollHelper.access$800((int) (currentAnimationTimeMillis - this.mStartTime), 0, this.mRampDownDuration);
            this.mStopValue = getValueAt(currentAnimationTimeMillis);
            this.mStopTime = currentAnimationTimeMillis;
        }

        public int getHorizontalDirection() {
            return (int) (this.mTargetVelocityX / Math.abs(this.mTargetVelocityX));
        }

        public void start() {
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mStopTime = -1;
            this.mDeltaTime = this.mStartTime;
            this.mStopValue = 0.5f;
            this.mDeltaX = 0;
            this.mDeltaY = 0;
        }

        private float getValueAt(long j) {
            try {
                if (j < this.mStartTime) {
                    return 0.0f;
                }
                try {
                    if (this.mStopTime < 0 || j < this.mStopTime) {
                        return AutoScrollHelper.access$900(((float) (j - this.mStartTime)) / ((float) this.mRampUpDuration), 0.0f, 1.0f) * 0.5f;
                    }
                    long j2 = j - this.mStopTime;
                    return (AutoScrollHelper.access$900(((float) j2) / ((float) this.mEffectiveRampDown), 0.0f, 1.0f) * this.mStopValue) + (1.0f - this.mStopValue);
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }

        public int getDeltaX() {
            return this.mDeltaX;
        }

        public void setRampDownDuration(int i) {
            this.mRampDownDuration = i;
        }

        private float interpolateValue(float f) {
            return ((-4.0f * f) * f) + (4.0f * f);
        }

        public void setTargetVelocity(float f, float f2) {
            this.mTargetVelocityX = f;
            this.mTargetVelocityY = f2;
        }

        public void computeScrollDelta() {
            try {
                if (this.mDeltaTime == 0) {
                    throw new RuntimeException(z);
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float interpolateValue = interpolateValue(getValueAt(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.mDeltaTime;
                this.mDeltaTime = currentAnimationTimeMillis;
                this.mDeltaX = (int) ((((float) j) * interpolateValue) * this.mTargetVelocityX);
                this.mDeltaY = (int) ((((float) j) * interpolateValue) * this.mTargetVelocityY);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    class ScrollAnimationRunnable implements Runnable {
        final AutoScrollHelper this$0;

        public void run() {
            if (AutoScrollHelper.access$100(this.this$0)) {
                if (AutoScrollHelper.access$200(this.this$0)) {
                    AutoScrollHelper.access$202(this.this$0, false);
                    AutoScrollHelper.access$300(this.this$0).start();
                }
                ClampedScroller access$300 = AutoScrollHelper.access$300(this.this$0);
                if (access$300.isFinished() || !AutoScrollHelper.access$400(this.this$0)) {
                    AutoScrollHelper.access$102(this.this$0, false);
                    return;
                }
                if (AutoScrollHelper.access$500(this.this$0)) {
                    AutoScrollHelper.access$502(this.this$0, false);
                    AutoScrollHelper.access$600(this.this$0);
                }
                access$300.computeScrollDelta();
                this.this$0.scrollTargetBy(access$300.getDeltaX(), access$300.getDeltaY());
                ViewCompat.postOnAnimation(AutoScrollHelper.access$700(this.this$0), this);
            }
        }

        private ScrollAnimationRunnable(AutoScrollHelper autoScrollHelper) {
            this.this$0 = autoScrollHelper;
        }

        ScrollAnimationRunnable(AutoScrollHelper autoScrollHelper, 1 1) {
            this(autoScrollHelper);
        }
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    public abstract void scrollTargetBy(int i, int i2);

    public AutoScrollHelper setMaximumVelocity(float f, float f2) {
        this.mMaximumVelocity[0] = f / 1000.0f;
        this.mMaximumVelocity[1] = f2 / 1000.0f;
        return this;
    }

    private boolean shouldAnimate() {
        ClampedScroller clampedScroller = this.mScroller;
        int verticalDirection = clampedScroller.getVerticalDirection();
        int horizontalDirection = clampedScroller.getHorizontalDirection();
        return (verticalDirection != 0 && canTargetScrollVertically(verticalDirection)) || (horizontalDirection != 0 && canTargetScrollHorizontally(horizontalDirection));
    }

    private void requestStop() {
        if (this.mNeedsReset) {
            this.mAnimating = false;
            if (CursorAdapter.a == 0) {
                return;
            }
        }
        this.mScroller.requestStop();
    }

    static boolean access$200(AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.mNeedsReset;
    }

    static ClampedScroller access$300(AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.mScroller;
    }

    static boolean access$100(AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.mAnimating;
    }

    private static int constrain(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    public AutoScrollHelper(View view) {
        int i = CursorAdapter.a;
        this.mScroller = new ClampedScroller();
        this.mEdgeInterpolator = new AccelerateInterpolator();
        this.mRelativeEdges = new float[]{0.0f, 0.0f};
        this.mMaximumEdges = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.mRelativeVelocity = new float[]{0.0f, 0.0f};
        this.mMinimumVelocity = new float[]{0.0f, 0.0f};
        this.mMaximumVelocity = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.mTarget = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i2 = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i3 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        setMaximumVelocity((float) i2, (float) i2);
        setMinimumVelocity((float) i3, (float) i3);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(DEFAULT_ACTIVATION_DELAY);
        setRampUpDuration(500);
        setRampDownDuration(500);
        if (FragmentActivity.a != 0) {
            CursorAdapter.a = i + 1;
        }
    }

    private float constrainEdgeValue(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.mEdgeType) {
            case v.m /*0*/:
            case at.g /*1*/:
                if (f >= f2) {
                    return 0.0f;
                }
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.mAnimating && this.mEdgeType == 1) {
                    return 1.0f;
                }
                return 0.0f;
            case at.i /*2*/:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float getEdgeValue(float r6, float r7, float r8, float r9) {
        /*
        r5 = this;
        r1 = 0;
        r2 = android.support.v4.widget.CursorAdapter.a;
        r0 = r6 * r7;
        r0 = constrain(r0, r1, r8);
        r3 = r5.constrainEdgeValue(r9, r0);
        r4 = r7 - r9;
        r0 = r5.constrainEdgeValue(r4, r0);
        r3 = r0 - r3;
        r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x0023;
    L_0x0019:
        r0 = r5.mEdgeInterpolator;
        r4 = -r3;
        r0 = r0.getInterpolation(r4);
        r0 = -r0;
        if (r2 == 0) goto L_0x0031;
    L_0x0023:
        r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x002f;
    L_0x0027:
        r0 = r5.mEdgeInterpolator;
        r0 = r0.getInterpolation(r3);
        if (r2 == 0) goto L_0x0031;
    L_0x002f:
        r0 = r1;
    L_0x0030:
        return r0;
    L_0x0031:
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = constrain(r0, r1, r2);
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.AutoScrollHelper.getEdgeValue(float, float, float, float):float");
    }

    static boolean access$502(AutoScrollHelper autoScrollHelper, boolean z) {
        autoScrollHelper.mNeedsCancel = z;
        return z;
    }

    public AutoScrollHelper setEdgeType(int i) {
        this.mEdgeType = i;
        return this;
    }

    static View access$700(AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.mTarget;
    }

    private static float constrain(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    public AutoScrollHelper setRampUpDuration(int i) {
        this.mScroller.setRampUpDuration(i);
        return this;
    }

    static boolean access$400(AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.shouldAnimate();
    }

    static float access$900(float f, float f2, float f3) {
        return constrain(f, f2, f3);
    }

    static int access$800(int i, int i2, int i3) {
        return constrain(i, i2, i3);
    }

    static boolean access$202(AutoScrollHelper autoScrollHelper, boolean z) {
        autoScrollHelper.mNeedsReset = z;
        return z;
    }

    private void cancelTargetTouch() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.mTarget.onTouchEvent(obtain);
        obtain.recycle();
    }

    public AutoScrollHelper setRampDownDuration(int i) {
        this.mScroller.setRampDownDuration(i);
        return this;
    }

    public AutoScrollHelper setEnabled(boolean z) {
        if (this.mEnabled && !z) {
            requestStop();
        }
        this.mEnabled = z;
        return this;
    }

    static boolean access$102(AutoScrollHelper autoScrollHelper, boolean z) {
        autoScrollHelper.mAnimating = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        r2 = r6.mEnabled;
        if (r2 != 0) goto L_0x0007;
    L_0x0006:
        return r1;
    L_0x0007:
        r2 = android.support.v4.view.MotionEventCompat.getActionMasked(r8);
        switch(r2) {
            case 0: goto L_0x0018;
            case 1: goto L_0x005a;
            case 2: goto L_0x001c;
            case 3: goto L_0x005a;
            default: goto L_0x000e;
        };
    L_0x000e:
        r2 = r6.mExclusive;
        if (r2 == 0) goto L_0x005e;
    L_0x0012:
        r2 = r6.mAnimating;
        if (r2 == 0) goto L_0x005e;
    L_0x0016:
        r1 = r0;
        goto L_0x0006;
    L_0x0018:
        r6.mNeedsCancel = r0;
        r6.mAlreadyDelayed = r1;
    L_0x001c:
        r2 = r8.getX();
        r3 = r7.getWidth();
        r3 = (float) r3;
        r4 = r6.mTarget;
        r4 = r4.getWidth();
        r4 = (float) r4;
        r2 = r6.computeTargetVelocity(r1, r2, r3, r4);
        r3 = r8.getY();
        r4 = r7.getHeight();
        r4 = (float) r4;
        r5 = r6.mTarget;
        r5 = r5.getHeight();
        r5 = (float) r5;
        r3 = r6.computeTargetVelocity(r0, r3, r4, r5);
        r4 = r6.mScroller;
        r4.setTargetVelocity(r2, r3);
        r2 = r6.mAnimating;
        if (r2 != 0) goto L_0x000e;
    L_0x004d:
        r2 = r6.shouldAnimate();
        if (r2 == 0) goto L_0x000e;
    L_0x0053:
        r6.startAnimating();
        r2 = android.support.v4.widget.CursorAdapter.a;
        if (r2 == 0) goto L_0x000e;
    L_0x005a:
        r6.requestStop();
        goto L_0x000e;
    L_0x005e:
        r0 = r1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    static {
        DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    }

    private float computeTargetVelocity(int i, float f, float f2, float f3) {
        float edgeValue = getEdgeValue(this.mRelativeEdges[i], f2, this.mMaximumEdges[i], f);
        if (edgeValue == 0.0f) {
            return 0.0f;
        }
        float f4 = this.mRelativeVelocity[i];
        float f5 = this.mMinimumVelocity[i];
        float f6 = this.mMaximumVelocity[i];
        f4 *= f3;
        return edgeValue > 0.0f ? constrain(edgeValue * f4, f5, f6) : -constrain((-edgeValue) * f4, f5, f6);
    }

    public AutoScrollHelper setRelativeEdges(float f, float f2) {
        this.mRelativeEdges[0] = f;
        this.mRelativeEdges[1] = f2;
        return this;
    }

    static boolean access$500(AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.mNeedsCancel;
    }

    public AutoScrollHelper setRelativeVelocity(float f, float f2) {
        this.mRelativeVelocity[0] = f / 1000.0f;
        this.mRelativeVelocity[1] = f2 / 1000.0f;
        return this;
    }

    public AutoScrollHelper setMaximumEdges(float f, float f2) {
        this.mMaximumEdges[0] = f;
        this.mMaximumEdges[1] = f2;
        return this;
    }

    static void access$600(AutoScrollHelper autoScrollHelper) {
        autoScrollHelper.cancelTargetTouch();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void startAnimating() {
        /*
        r5 = this;
        r4 = 1;
        r0 = r5.mRunnable;
        if (r0 != 0) goto L_0x000d;
    L_0x0005:
        r0 = new android.support.v4.widget.AutoScrollHelper$ScrollAnimationRunnable;
        r1 = 0;
        r0.<init>(r5, r1);
        r5.mRunnable = r0;
    L_0x000d:
        r5.mAnimating = r4;
        r5.mNeedsReset = r4;
        r0 = r5.mAlreadyDelayed;
        if (r0 != 0) goto L_0x0027;
    L_0x0015:
        r0 = r5.mActivationDelay;
        if (r0 <= 0) goto L_0x0027;
    L_0x0019:
        r0 = r5.mTarget;
        r1 = r5.mRunnable;
        r2 = r5.mActivationDelay;
        r2 = (long) r2;
        android.support.v4.view.ViewCompat.postOnAnimationDelayed(r0, r1, r2);
        r0 = android.support.v4.widget.CursorAdapter.a;
        if (r0 == 0) goto L_0x002c;
    L_0x0027:
        r0 = r5.mRunnable;
        r0.run();
    L_0x002c:
        r5.mAlreadyDelayed = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.AutoScrollHelper.startAnimating():void");
    }

    public AutoScrollHelper setMinimumVelocity(float f, float f2) {
        this.mMinimumVelocity[0] = f / 1000.0f;
        this.mMinimumVelocity[1] = f2 / 1000.0f;
        return this;
    }

    public AutoScrollHelper setActivationDelay(int i) {
        this.mActivationDelay = i;
        return this;
    }
}
