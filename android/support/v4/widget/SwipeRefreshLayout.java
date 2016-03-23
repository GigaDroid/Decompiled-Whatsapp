package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import org.v;
import org.whispersystems.at;

public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {
    private static final int[] LAYOUT_ATTRS;
    private static final String LOG_TAG;
    private static final String[] z;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private int mCircleHeight;
    private CircleImageView mCircleView;
    private int mCircleViewIndex;
    private int mCircleWidth;
    private int mCurrentTargetOffsetTop;
    private final DecelerateInterpolator mDecelerateInterpolator;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNestedScrollInProgress;
    private final NestedScrollingChildHelper mNestedScrollingChildHelper;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    private boolean mNotify;
    private boolean mOriginalOffsetCalculated;
    protected int mOriginalOffsetTop;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    private MaterialProgressDrawable mProgress;
    private AnimationListener mRefreshListener;
    private boolean mRefreshing;
    private boolean mReturningToStart;
    private boolean mScale;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    private float mSpinnerFinalOffset;
    private float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private float mTotalUnconsumed;
    private int mTouchSlop;
    private boolean mUsingCustomStart;

    class 1 implements AnimationListener {
        final SwipeRefreshLayout this$0;

        1(SwipeRefreshLayout swipeRefreshLayout) {
            this.this$0 = swipeRefreshLayout;
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAnimationEnd(android.view.animation.Animation r5) {
            /*
            r4 = this;
            r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
            r0 = android.support.v4.widget.CursorAdapter.a;
            r1 = r4.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$000(r1);
            if (r1 == 0) goto L_0x0039;
        L_0x000c:
            r1 = r4.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$100(r1);
            r1.setAlpha(r3);
            r1 = r4.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$100(r1);
            r1.start();
            r1 = r4.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$200(r1);
            if (r1 == 0) goto L_0x0073;
        L_0x0026:
            r1 = r4.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$300(r1);
            if (r1 == 0) goto L_0x0073;
        L_0x002e:
            r1 = r4.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$300(r1);
            r1.onRefresh();
            if (r0 == 0) goto L_0x0073;
        L_0x0039:
            r1 = r4.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$100(r1);
            r1.stop();
            r1 = r4.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$400(r1);
            r2 = 8;
            r1.setVisibility(r2);
            r1 = r4.this$0;
            android.support.v4.widget.SwipeRefreshLayout.access$500(r1, r3);
            r1 = r4.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$600(r1);
            if (r1 == 0) goto L_0x0062;
        L_0x005a:
            r1 = r4.this$0;
            r2 = 0;
            android.support.v4.widget.SwipeRefreshLayout.access$700(r1, r2);
            if (r0 == 0) goto L_0x0073;
        L_0x0062:
            r0 = r4.this$0;
            r1 = r4.this$0;
            r1 = r1.mOriginalOffsetTop;
            r2 = r4.this$0;
            r2 = android.support.v4.widget.SwipeRefreshLayout.access$800(r2);
            r1 = r1 - r2;
            r2 = 1;
            android.support.v4.widget.SwipeRefreshLayout.access$900(r0, r1, r2);
        L_0x0073:
            r0 = r4.this$0;
            r1 = r4.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$400(r1);
            r1 = r1.getTop();
            android.support.v4.widget.SwipeRefreshLayout.access$802(r0, r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.1.onAnimationEnd(android.view.animation.Animation):void");
        }
    }

    class 3 extends Animation {
        final SwipeRefreshLayout this$0;

        3(SwipeRefreshLayout swipeRefreshLayout) {
            this.this$0 = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.access$700(this.this$0, 1.0f - f);
        }
    }

    class 4 extends Animation {
        final SwipeRefreshLayout this$0;
        final int val$endingAlpha;
        final int val$startingAlpha;

        4(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
            this.this$0 = swipeRefreshLayout;
            this.val$startingAlpha = i;
            this.val$endingAlpha = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.access$100(this.this$0).setAlpha((int) (((float) this.val$startingAlpha) + (((float) (this.val$endingAlpha - this.val$startingAlpha)) * f)));
        }
    }

    class 5 implements AnimationListener {
        final SwipeRefreshLayout this$0;

        5(SwipeRefreshLayout swipeRefreshLayout) {
            this.this$0 = swipeRefreshLayout;
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            if (!SwipeRefreshLayout.access$600(this.this$0)) {
                SwipeRefreshLayout.access$1000(this.this$0, null);
            }
        }
    }

    class 6 extends Animation {
        final SwipeRefreshLayout this$0;

        6(SwipeRefreshLayout swipeRefreshLayout) {
            this.this$0 = swipeRefreshLayout;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void applyTransformation(float r4, android.view.animation.Transformation r5) {
            /*
            r3 = this;
            r0 = r3.this$0;
            r0 = android.support.v4.widget.SwipeRefreshLayout.access$1100(r0);
            if (r0 != 0) goto L_0x001d;
        L_0x0008:
            r0 = r3.this$0;
            r0 = android.support.v4.widget.SwipeRefreshLayout.access$1200(r0);
            r1 = r3.this$0;
            r1 = r1.mOriginalOffsetTop;
            r1 = java.lang.Math.abs(r1);
            r1 = (float) r1;
            r0 = r0 - r1;
            r0 = (int) r0;
            r1 = android.support.v4.widget.CursorAdapter.a;
            if (r1 == 0) goto L_0x0024;
        L_0x001d:
            r0 = r3.this$0;
            r0 = android.support.v4.widget.SwipeRefreshLayout.access$1200(r0);
            r0 = (int) r0;
        L_0x0024:
            r1 = r3.this$0;
            r1 = r1.mFrom;
            r2 = r3.this$0;
            r2 = r2.mFrom;
            r0 = r0 - r2;
            r0 = (float) r0;
            r0 = r0 * r4;
            r0 = (int) r0;
            r0 = r0 + r1;
            r1 = r3.this$0;
            r1 = android.support.v4.widget.SwipeRefreshLayout.access$400(r1);
            r1 = r1.getTop();
            r0 = r0 - r1;
            r1 = r3.this$0;
            r2 = 0;
            android.support.v4.widget.SwipeRefreshLayout.access$900(r1, r0, r2);
            r0 = r3.this$0;
            r0 = android.support.v4.widget.SwipeRefreshLayout.access$100(r0);
            r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r1 = r1 - r4;
            r0.setArrowScale(r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.6.applyTransformation(float, android.view.animation.Transformation):void");
        }
    }

    class 7 extends Animation {
        final SwipeRefreshLayout this$0;

        7(SwipeRefreshLayout swipeRefreshLayout) {
            this.this$0 = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.access$1300(this.this$0, f);
        }
    }

    class 8 extends Animation {
        final SwipeRefreshLayout this$0;

        8(SwipeRefreshLayout swipeRefreshLayout) {
            this.this$0 = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.access$700(this.this$0, SwipeRefreshLayout.access$1400(this.this$0) + ((-SwipeRefreshLayout.access$1400(this.this$0)) * f));
            SwipeRefreshLayout.access$1300(this.this$0, f);
        }
    }

    public interface OnRefreshListener {
        void onRefresh();
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.mCircleViewIndex < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.mCircleViewIndex;
        }
        if (i2 >= this.mCircleViewIndex) {
            return i2 + 1;
        }
        return i2;
    }

    private void ensureTarget() {
        int i = CursorAdapter.a;
        if (this.mTarget == null) {
            int i2 = 0;
            while (i2 < getChildCount()) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    if (i == 0) {
                        return;
                    }
                }
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }
    }

    private void moveToStart(float f) {
        setTargetOffsetTopAndBottom((this.mFrom + ((int) (((float) (this.mOriginalOffsetTop - this.mFrom)) * f))) - this.mCircleView.getTop(), false);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.mParentOffsetInWindow);
        int i5 = this.mParentOffsetInWindow[1] + i4;
        if (i5 < 0) {
            this.mTotalUnconsumed = ((float) Math.abs(i5)) + this.mTotalUnconsumed;
            moveSpinner(this.mTotalUnconsumed);
        }
    }

    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.stopNestedScroll();
    }

    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    static float access$1200(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mSpinnerFinalOffset;
    }

    private float getMotionEventY(MotionEvent motionEvent, int i) {
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (findPointerIndex < 0) {
            return -1.0f;
        }
        return MotionEventCompat.getY(motionEvent, findPointerIndex);
    }

    static void access$900(SwipeRefreshLayout swipeRefreshLayout, int i, boolean z) {
        swipeRefreshLayout.setTargetOffsetTopAndBottom(i, z);
    }

    static CircleImageView access$400(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mCircleView;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mNestedScrollingChildHelper.dispatchNestedFling(f, f2, z);
    }

    private void setColorViewAlpha(int i) {
        this.mCircleView.getBackground().setAlpha(i);
        this.mProgress.setAlpha(i);
    }

    static void access$700(SwipeRefreshLayout swipeRefreshLayout, float f) {
        swipeRefreshLayout.setAnimationProgress(f);
    }

    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 76);
    }

    static {
        String[] strArr = new String[4];
        String str = "6FU\r>2}hb1.dn{:QLWH\u0011\u0005\tCX\u000bQMNCX\u0005\tIL\t\u0014\t@C_\u0010JUD\t\u0014\tQB\u0016\u001f]D__\u0018M\u000f";
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
                        i4 = 113;
                        break;
                    case at.g /*1*/:
                        i4 = 41;
                        break;
                    case at.i /*2*/:
                        i4 = 33;
                        break;
                    case at.o /*3*/:
                        i4 = 45;
                        break;
                    default:
                        i4 = 127;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "6FU\r>2}hb1.|q\r\u001a\u0007LOY_\u0013\\U\r\u001b\u001eG\u0006Y_\u0019HWH_\u0010G\u0001L\u001c\u0005@WH_\u0001FHC\u000b\u0014[\u0001D\u001b_";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "6FU\r>2}hb1.dn{:QLWH\u0011\u0005\tCX\u000bQA@[\u001aQHO\r\u0016\u001f_@A\u0016\u0015\t@N\u000b\u0018_D\r\u000f\u001e@OY\u001a\u0003\tHIQ";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    LOG_TAG = SwipeRefreshLayout.class.getSimpleName();
                    LAYOUT_ATTRS = new int[]{16842766};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "6FU\r>2}hb1.ynd1%lsr;>~o\r\u001a\u0007LOY_\u0013\\U\r\u0017\u0010_D\r\u001e\u001f\tHC\t\u0010EHI_\u0010JUD\u0010\u001f\tHC\u001b\u0014Q\u000f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mNestedScrollingChildHelper.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    static MaterialProgressDrawable access$100(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mProgress;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.mNestedScrollingChildHelper.setNestedScrollingEnabled(z);
    }

    private Animation startAlphaAnimation(int i, int i2) {
        if (this.mScale && isAlphaUsedForScale()) {
            return null;
        }
        Animation 4 = new 4(this, i, i2);
        4.setDuration(300);
        this.mCircleView.setAnimationListener(null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(4);
        return 4;
    }

    static void access$1000(SwipeRefreshLayout swipeRefreshLayout, AnimationListener animationListener) {
        swipeRefreshLayout.startScaleDownAnimation(animationListener);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                actionIndex = 1;
            } else {
                actionIndex = 0;
            }
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
        }
    }

    private void animateOffsetToCorrectPosition(int i, AnimationListener animationListener) {
        this.mFrom = i;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200);
        this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void moveSpinner(float r15) {
        /*
        r14 = this;
        r6 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r13 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r12 = 0;
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r14.mProgress;
        r1 = 1;
        r0.showArrow(r1);
        r0 = r14.mTotalDragDistance;
        r0 = r15 / r0;
        r0 = java.lang.Math.abs(r0);
        r1 = java.lang.Math.min(r10, r0);
        r2 = (double) r1;
        r4 = 4600877379321698714; // 0x3fd999999999999a float:-1.5881868E-23 double:0.4;
        r2 = r2 - r4;
        r4 = 0;
        r2 = java.lang.Math.max(r2, r4);
        r0 = (float) r2;
        r2 = 1084227584; // 0x40a00000 float:5.0 double:5.356796015E-315;
        r0 = r0 * r2;
        r2 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r2 = r0 / r2;
        r0 = java.lang.Math.abs(r15);
        r3 = r14.mTotalDragDistance;
        r3 = r0 - r3;
        r0 = r14.mUsingCustomStart;
        if (r0 == 0) goto L_0x00ee;
    L_0x003d:
        r0 = r14.mSpinnerFinalOffset;
        r4 = r14.mOriginalOffsetTop;
        r4 = (float) r4;
        r0 = r0 - r4;
    L_0x0043:
        r4 = r0 * r11;
        r3 = java.lang.Math.min(r3, r4);
        r3 = r3 / r0;
        r3 = java.lang.Math.max(r12, r3);
        r4 = r3 / r6;
        r4 = (double) r4;
        r3 = r3 / r6;
        r6 = (double) r3;
        r8 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r6 = java.lang.Math.pow(r6, r8);
        r4 = r4 - r6;
        r3 = (float) r4;
        r3 = r3 * r11;
        r4 = r0 * r3;
        r4 = r4 * r11;
        r5 = r14.mOriginalOffsetTop;
        r0 = r0 * r1;
        r0 = r0 + r4;
        r0 = (int) r0;
        r0 = r0 + r5;
        r1 = r14.mCircleView;
        r1 = r1.getVisibility();
        if (r1 == 0) goto L_0x0073;
    L_0x006d:
        r1 = r14.mCircleView;
        r4 = 0;
        r1.setVisibility(r4);
    L_0x0073:
        r1 = r14.mScale;
        if (r1 != 0) goto L_0x0081;
    L_0x0077:
        r1 = r14.mCircleView;
        android.support.v4.view.ViewCompat.setScaleX(r1, r10);
        r1 = r14.mCircleView;
        android.support.v4.view.ViewCompat.setScaleY(r1, r10);
    L_0x0081:
        r1 = r14.mTotalDragDistance;
        r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1));
        if (r1 >= 0) goto L_0x00bf;
    L_0x0087:
        r1 = r14.mScale;
        if (r1 == 0) goto L_0x0092;
    L_0x008b:
        r1 = r14.mTotalDragDistance;
        r1 = r15 / r1;
        r14.setAnimationProgress(r1);
    L_0x0092:
        r1 = r14.mProgress;
        r1 = r1.getAlpha();
        r4 = 76;
        if (r1 <= r4) goto L_0x00a7;
    L_0x009c:
        r1 = r14.mAlphaStartAnimation;
        r1 = r14.isAnimationRunning(r1);
        if (r1 != 0) goto L_0x00a7;
    L_0x00a4:
        r14.startProgressAlphaStartAnimation();
    L_0x00a7:
        r1 = r2 * r13;
        r4 = r14.mProgress;
        r1 = java.lang.Math.min(r13, r1);
        r4.setStartEndTrim(r12, r1);
        r1 = r14.mProgress;
        r4 = java.lang.Math.min(r10, r2);
        r1.setArrowScale(r4);
        r1 = android.support.v4.widget.CursorAdapter.a;
        if (r1 == 0) goto L_0x00d4;
    L_0x00bf:
        r1 = r14.mProgress;
        r1 = r1.getAlpha();
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r1 >= r4) goto L_0x00d4;
    L_0x00c9:
        r1 = r14.mAlphaMaxAnimation;
        r1 = r14.isAnimationRunning(r1);
        if (r1 != 0) goto L_0x00d4;
    L_0x00d1:
        r14.startProgressAlphaMaxAnimation();
    L_0x00d4:
        r1 = -1098907648; // 0xffffffffbe800000 float:-0.25 double:NaN;
        r4 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        r2 = r2 * r4;
        r1 = r1 + r2;
        r2 = r3 * r11;
        r1 = r1 + r2;
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r1 * r2;
        r2 = r14.mProgress;
        r2.setProgressRotation(r1);
        r1 = r14.mCurrentTargetOffsetTop;
        r0 = r0 - r1;
        r1 = 1;
        r14.setTargetOffsetTopAndBottom(r0, r1);
        return;
    L_0x00ee:
        r0 = r14.mSpinnerFinalOffset;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.moveSpinner(float):void");
    }

    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 255);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r1 = 1;
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = 0;
        r2 = android.support.v4.widget.CursorAdapter.a;
        r3 = android.support.v4.view.MotionEventCompat.getActionMasked(r7);
        r4 = r6.mReturningToStart;
        if (r4 == 0) goto L_0x0012;
    L_0x000e:
        if (r3 != 0) goto L_0x0012;
    L_0x0010:
        r6.mReturningToStart = r0;
    L_0x0012:
        r4 = r6.isEnabled();
        if (r4 == 0) goto L_0x0026;
    L_0x0018:
        r4 = r6.mReturningToStart;
        if (r4 != 0) goto L_0x0026;
    L_0x001c:
        r4 = r6.canChildScrollUp();
        if (r4 != 0) goto L_0x0026;
    L_0x0022:
        r4 = r6.mNestedScrollInProgress;
        if (r4 == 0) goto L_0x0027;
    L_0x0026:
        return r0;
    L_0x0027:
        switch(r3) {
            case 0: goto L_0x002c;
            case 1: goto L_0x007d;
            case 2: goto L_0x0036;
            case 3: goto L_0x0026;
            case 4: goto L_0x002a;
            case 5: goto L_0x0060;
            case 6: goto L_0x0078;
            default: goto L_0x002a;
        };
    L_0x002a:
        r0 = r1;
        goto L_0x0026;
    L_0x002c:
        r3 = android.support.v4.view.MotionEventCompat.getPointerId(r7, r0);
        r6.mActivePointerId = r3;
        r6.mIsBeingDragged = r0;
        if (r2 == 0) goto L_0x002a;
    L_0x0036:
        r3 = r6.mActivePointerId;
        r3 = android.support.v4.view.MotionEventCompat.findPointerIndex(r7, r3);
        if (r3 >= 0) goto L_0x0049;
    L_0x003e:
        r1 = LOG_TAG;
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        android.util.Log.e(r1, r2);
        goto L_0x0026;
    L_0x0049:
        r3 = android.support.v4.view.MotionEventCompat.getY(r7, r3);
        r4 = r6.mInitialMotionY;
        r3 = r3 - r4;
        r3 = r3 * r5;
        r4 = r6.mIsBeingDragged;
        if (r4 == 0) goto L_0x002a;
    L_0x0055:
        r4 = 0;
        r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0026;
    L_0x005a:
        r6.moveSpinner(r3);
        if (r2 == 0) goto L_0x002a;
    L_0x005f:
        goto L_0x0026;
    L_0x0060:
        r3 = android.support.v4.view.MotionEventCompat.getActionIndex(r7);
        if (r3 >= 0) goto L_0x0070;
    L_0x0066:
        r2 = LOG_TAG;
        r3 = z;
        r1 = r3[r1];
        android.util.Log.e(r2, r1);
        goto L_0x0026;
    L_0x0070:
        r3 = android.support.v4.view.MotionEventCompat.getPointerId(r7, r3);
        r6.mActivePointerId = r3;
        if (r2 == 0) goto L_0x002a;
    L_0x0078:
        r6.onSecondaryPointerUp(r7);
        if (r2 == 0) goto L_0x002a;
    L_0x007d:
        r1 = r6.mActivePointerId;
        r1 = android.support.v4.view.MotionEventCompat.findPointerIndex(r7, r1);
        if (r1 >= 0) goto L_0x0090;
    L_0x0085:
        r1 = LOG_TAG;
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        android.util.Log.e(r1, r2);
        goto L_0x0026;
    L_0x0090:
        r1 = android.support.v4.view.MotionEventCompat.getY(r7, r1);
        r2 = r6.mInitialMotionY;
        r1 = r1 - r2;
        r1 = r1 * r5;
        r6.mIsBeingDragged = r0;
        r6.finishSpinner(r1);
        r1 = -1;
        r6.mActivePointerId = r1;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    static boolean access$200(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mNotify;
    }

    private void setRefreshing(boolean z, boolean z2) {
        if (this.mRefreshing != z) {
            this.mNotify = z2;
            ensureTarget();
            this.mRefreshing = z;
            if (this.mRefreshing) {
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
                if (CursorAdapter.a == 0) {
                    return;
                }
            }
            startScaleDownAnimation(this.mRefreshListener);
        }
    }

    static int access$800(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mCurrentTargetOffsetTop;
    }

    private void createProgressView() {
        this.mCircleView = new CircleImageView(getContext(), -328966, 20.0f);
        this.mProgress = new MaterialProgressDrawable(getContext(), this);
        this.mProgress.setBackgroundColor(-328966);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
    }

    private void setAnimationProgress(float f) {
        if (isAlphaUsedForScale()) {
            setColorViewAlpha((int) (255.0f * f));
            if (CursorAdapter.a == 0) {
                return;
            }
        }
        ViewCompat.setScaleX(this.mCircleView, f);
        ViewCompat.setScaleY(this.mCircleView, f);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r6 = 1;
        r5 = -1;
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = 0;
        r1 = android.support.v4.widget.CursorAdapter.a;
        r7.ensureTarget();
        r2 = android.support.v4.view.MotionEventCompat.getActionMasked(r8);
        r3 = r7.mReturningToStart;
        if (r3 == 0) goto L_0x0016;
    L_0x0012:
        if (r2 != 0) goto L_0x0016;
    L_0x0014:
        r7.mReturningToStart = r0;
    L_0x0016:
        r3 = r7.isEnabled();
        if (r3 == 0) goto L_0x002e;
    L_0x001c:
        r3 = r7.mReturningToStart;
        if (r3 != 0) goto L_0x002e;
    L_0x0020:
        r3 = r7.canChildScrollUp();
        if (r3 != 0) goto L_0x002e;
    L_0x0026:
        r3 = r7.mRefreshing;
        if (r3 != 0) goto L_0x002e;
    L_0x002a:
        r3 = r7.mNestedScrollInProgress;
        if (r3 == 0) goto L_0x002f;
    L_0x002e:
        return r0;
    L_0x002f:
        switch(r2) {
            case 0: goto L_0x0035;
            case 1: goto L_0x0095;
            case 2: goto L_0x0057;
            case 3: goto L_0x0095;
            case 4: goto L_0x0032;
            case 5: goto L_0x0032;
            case 6: goto L_0x0090;
            default: goto L_0x0032;
        };
    L_0x0032:
        r0 = r7.mIsBeingDragged;
        goto L_0x002e;
    L_0x0035:
        r2 = r7.mOriginalOffsetTop;
        r3 = r7.mCircleView;
        r3 = r3.getTop();
        r2 = r2 - r3;
        r7.setTargetOffsetTopAndBottom(r2, r6);
        r2 = android.support.v4.view.MotionEventCompat.getPointerId(r8, r0);
        r7.mActivePointerId = r2;
        r7.mIsBeingDragged = r0;
        r2 = r7.mActivePointerId;
        r2 = r7.getMotionEventY(r8, r2);
        r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r3 == 0) goto L_0x002e;
    L_0x0053:
        r7.mInitialDownY = r2;
        if (r1 == 0) goto L_0x0032;
    L_0x0057:
        r2 = r7.mActivePointerId;
        if (r2 != r5) goto L_0x0065;
    L_0x005b:
        r1 = LOG_TAG;
        r2 = z;
        r2 = r2[r0];
        android.util.Log.e(r1, r2);
        goto L_0x002e;
    L_0x0065:
        r2 = r7.mActivePointerId;
        r2 = r7.getMotionEventY(r8, r2);
        r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r3 == 0) goto L_0x002e;
    L_0x006f:
        r3 = r7.mInitialDownY;
        r2 = r2 - r3;
        r3 = r7.mTouchSlop;
        r3 = (float) r3;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x0032;
    L_0x0079:
        r2 = r7.mIsBeingDragged;
        if (r2 != 0) goto L_0x0032;
    L_0x007d:
        r2 = r7.mInitialDownY;
        r3 = r7.mTouchSlop;
        r3 = (float) r3;
        r2 = r2 + r3;
        r7.mInitialMotionY = r2;
        r7.mIsBeingDragged = r6;
        r2 = r7.mProgress;
        r3 = 76;
        r2.setAlpha(r3);
        if (r1 == 0) goto L_0x0032;
    L_0x0090:
        r7.onSecondaryPointerUp(r8);
        if (r1 == 0) goto L_0x0032;
    L_0x0095:
        r7.mIsBeingDragged = r0;
        r7.mActivePointerId = r5;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean isAnimationRunning(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mOriginalOffsetCalculated = false;
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new 1(this);
        this.mAnimateToCorrectPosition = new 6(this);
        this.mAnimateToStartPosition = new 7(this);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleWidth = (int) (displayMetrics.density * 40.0f);
        this.mCircleHeight = (int) (displayMetrics.density * 40.0f);
        createProgressView();
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        this.mSpinnerFinalOffset = displayMetrics.density * 64.0f;
        this.mTotalDragDistance = this.mSpinnerFinalOffset;
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        this.mNestedScrollingChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT < 21 && (this.mTarget instanceof AbsListView)) {
            return;
        }
        if (this.mTarget == null || ViewCompat.isNestedScrollingEnabled(this.mTarget)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    static boolean access$000(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mRefreshing;
    }

    private void setTargetOffsetTopAndBottom(int i, boolean z) {
        this.mCircleView.bringToFront();
        this.mCircleView.offsetTopAndBottom(i);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
        if (z && VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    static boolean access$1100(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mUsingCustomStart;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.mReturningToStart || this.mRefreshing || (i & 2) == 0) ? false : true;
    }

    private boolean isAlphaUsedForScale() {
        return VERSION.SDK_INT < 11;
    }

    static float access$1400(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mStartingScale;
    }

    static void access$500(SwipeRefreshLayout swipeRefreshLayout, int i) {
        swipeRefreshLayout.setColorViewAlpha(i);
    }

    public void onMeasure(int i, int i2) {
        int i3 = CursorAdapter.a;
        super.onMeasure(i, i2);
        if (this.mTarget == null) {
            ensureTarget();
        }
        if (this.mTarget != null) {
            int i4;
            this.mTarget.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.mCircleView.measure(MeasureSpec.makeMeasureSpec(this.mCircleWidth, 1073741824), MeasureSpec.makeMeasureSpec(this.mCircleHeight, 1073741824));
            if (!(this.mUsingCustomStart || this.mOriginalOffsetCalculated)) {
                this.mOriginalOffsetCalculated = true;
                i4 = -this.mCircleView.getMeasuredHeight();
                this.mOriginalOffsetTop = i4;
                this.mCurrentTargetOffsetTop = i4;
            }
            this.mCircleViewIndex = -1;
            i4 = 0;
            while (i4 < getChildCount()) {
                if (getChildAt(i4) == this.mCircleView) {
                    this.mCircleViewIndex = i4;
                    if (i3 == 0) {
                        return;
                    }
                }
                i4++;
                if (i3 != 0) {
                    return;
                }
            }
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.hasNestedScrollingParent();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.mTarget == null) {
                ensureTarget();
            }
            if (this.mTarget != null) {
                View view = this.mTarget;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                measuredHeight = this.mCircleView.getMeasuredWidth();
                this.mCircleView.layout((measuredWidth / 2) - (measuredHeight / 2), this.mCurrentTargetOffsetTop, (measuredWidth / 2) + (measuredHeight / 2), this.mCurrentTargetOffsetTop + this.mCircleView.getMeasuredHeight());
            }
        }
    }

    private void startScaleDownAnimation(AnimationListener animationListener) {
        this.mScaleDownAnimation = new 3(this);
        this.mScaleDownAnimation.setDuration(150);
        this.mCircleView.setAnimationListener(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    private void finishSpinner(float f) {
        if (f > this.mTotalDragDistance) {
            setRefreshing(true, true);
            if (CursorAdapter.a == 0) {
                return;
            }
        }
        this.mRefreshing = false;
        this.mProgress.setStartEndTrim(0.0f, 0.0f);
        AnimationListener animationListener = null;
        if (!this.mScale) {
            animationListener = new 5(this);
        }
        animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, animationListener);
        this.mProgress.showArrow(false);
    }

    static void access$1300(SwipeRefreshLayout swipeRefreshLayout, float f) {
        swipeRefreshLayout.moveToStart(f);
    }

    static int access$802(SwipeRefreshLayout swipeRefreshLayout, int i) {
        swipeRefreshLayout.mCurrentTargetOffsetTop = i;
        return i;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mNestedScrollingChildHelper.dispatchNestedPreFling(f, f2);
    }

    static OnRefreshListener access$300(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mListener;
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    static boolean access$600(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mScale;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void startScaleDownReturnToStartAnimation(int r5, android.view.animation.Animation.AnimationListener r6) {
        /*
        r4 = this;
        r4.mFrom = r5;
        r0 = r4.isAlphaUsedForScale();
        if (r0 == 0) goto L_0x0015;
    L_0x0008:
        r0 = r4.mProgress;
        r0 = r0.getAlpha();
        r0 = (float) r0;
        r4.mStartingScale = r0;
        r0 = android.support.v4.widget.CursorAdapter.a;
        if (r0 == 0) goto L_0x001d;
    L_0x0015:
        r0 = r4.mCircleView;
        r0 = android.support.v4.view.ViewCompat.getScaleX(r0);
        r4.mStartingScale = r0;
    L_0x001d:
        r0 = new android.support.v4.widget.SwipeRefreshLayout$8;
        r0.<init>(r4);
        r4.mScaleDownToStartAnimation = r0;
        r0 = r4.mScaleDownToStartAnimation;
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0.setDuration(r2);
        if (r6 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r4.mCircleView;
        r0.setAnimationListener(r6);
    L_0x0032:
        r0 = r4.mCircleView;
        r0.clearAnimation();
        r0 = r4.mCircleView;
        r1 = r4.mScaleDownToStartAnimation;
        r0.startAnimation(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.startScaleDownReturnToStartAnimation(int, android.view.animation.Animation$AnimationListener):void");
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        startNestedScroll(i & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    public boolean startNestedScroll(int i) {
        return this.mNestedScrollingChildHelper.startNestedScroll(i);
    }

    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.isNestedScrollingEnabled();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
        /*
        r6 = this;
        r5 = 0;
        r2 = 0;
        r4 = 1;
        if (r9 <= 0) goto L_0x002c;
    L_0x0005:
        r0 = r6.mTotalUnconsumed;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x002c;
    L_0x000b:
        r0 = (float) r9;
        r1 = r6.mTotalUnconsumed;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x001f;
    L_0x0012:
        r0 = r6.mTotalUnconsumed;
        r0 = (int) r0;
        r0 = r9 - r0;
        r10[r4] = r0;
        r6.mTotalUnconsumed = r2;
        r0 = android.support.v4.widget.CursorAdapter.a;
        if (r0 == 0) goto L_0x0027;
    L_0x001f:
        r0 = r6.mTotalUnconsumed;
        r1 = (float) r9;
        r0 = r0 - r1;
        r6.mTotalUnconsumed = r0;
        r10[r4] = r9;
    L_0x0027:
        r0 = r6.mTotalUnconsumed;
        r6.moveSpinner(r0);
    L_0x002c:
        r0 = r6.mUsingCustomStart;
        if (r0 == 0) goto L_0x0049;
    L_0x0030:
        if (r9 <= 0) goto L_0x0049;
    L_0x0032:
        r0 = r6.mTotalUnconsumed;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0049;
    L_0x0038:
        r0 = r10[r4];
        r0 = r9 - r0;
        r0 = java.lang.Math.abs(r0);
        if (r0 <= 0) goto L_0x0049;
    L_0x0042:
        r0 = r6.mCircleView;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0049:
        r0 = r6.mParentScrollConsumed;
        r1 = r10[r5];
        r1 = r8 - r1;
        r2 = r10[r4];
        r2 = r9 - r2;
        r3 = 0;
        r1 = r6.dispatchNestedPreScroll(r1, r2, r0, r3);
        if (r1 == 0) goto L_0x0068;
    L_0x005a:
        r1 = r10[r5];
        r2 = r0[r5];
        r1 = r1 + r2;
        r10[r5] = r1;
        r1 = r10[r4];
        r0 = r0[r4];
        r0 = r0 + r1;
        r10[r4] = r0;
    L_0x0068:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.onNestedPreScroll(android.view.View, int, int, int[]):void");
    }

    public boolean canChildScrollUp() {
        boolean z = false;
        if (VERSION.SDK_INT >= 14) {
            return ViewCompat.canScrollVertically(this.mTarget, -1);
        }
        if (this.mTarget instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.mTarget;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        }
        if (ViewCompat.canScrollVertically(this.mTarget, -1) || this.mTarget.getScrollY() > 0) {
            z = true;
        }
        return z;
    }

    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.onStopNestedScroll(view);
        this.mNestedScrollInProgress = false;
        if (this.mTotalUnconsumed > 0.0f) {
            finishSpinner(this.mTotalUnconsumed);
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    private void animateOffsetToStartPosition(int i, AnimationListener animationListener) {
        if (this.mScale) {
            startScaleDownReturnToStartAnimation(i, animationListener);
            if (CursorAdapter.a == 0) {
                return;
            }
        }
        this.mFrom = i;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200);
        this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }
}
