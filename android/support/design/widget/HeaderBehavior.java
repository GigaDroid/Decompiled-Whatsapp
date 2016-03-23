package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ScrollerCompat;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;

abstract class HeaderBehavior extends ViewOffsetBehavior {
    private int mActivePointerId;
    private Runnable mFlingRunnable;
    private boolean mIsBeingDragged;
    private int mLastMotionY;
    private ScrollerCompat mScroller;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    class FlingRunnable implements Runnable {
        private final View mLayout;
        private final CoordinatorLayout mParent;
        final HeaderBehavior this$0;

        public void run() {
            if (this.mLayout != null && HeaderBehavior.access$000(this.this$0) != null && HeaderBehavior.access$000(this.this$0).computeScrollOffset()) {
                this.this$0.setHeaderTopBottomOffset(this.mParent, this.mLayout, HeaderBehavior.access$000(this.this$0).getCurrY());
                ViewCompat.postOnAnimation(this.mLayout, this);
            }
        }

        FlingRunnable(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, View view) {
            this.this$0 = headerBehavior;
            this.mParent = coordinatorLayout;
            this.mLayout = view;
        }
    }

    int getScrollRangeForDragFling(View view) {
        return view.getHeight();
    }

    int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    boolean canDragView(View view) {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.support.design.widget.CoordinatorLayout r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
        r7 = this;
        r0 = 1;
        r6 = 0;
        r5 = -1;
        r1 = android.support.design.widget.CoordinatorLayout.a;
        r2 = r7.mTouchSlop;
        if (r2 >= 0) goto L_0x0017;
    L_0x0009:
        r2 = r8.getContext();
        r2 = android.view.ViewConfiguration.get(r2);
        r2 = r2.getScaledTouchSlop();
        r7.mTouchSlop = r2;
    L_0x0017:
        r2 = r10.getAction();
        r3 = 2;
        if (r2 != r3) goto L_0x0023;
    L_0x001e:
        r2 = r7.mIsBeingDragged;
        if (r2 == 0) goto L_0x0023;
    L_0x0022:
        return r0;
    L_0x0023:
        r2 = android.support.v4.view.MotionEventCompat.getActionMasked(r10);
        switch(r2) {
            case 0: goto L_0x0036;
            case 1: goto L_0x0080;
            case 2: goto L_0x005b;
            case 3: goto L_0x0080;
            default: goto L_0x002a;
        };
    L_0x002a:
        r0 = r7.mVelocityTracker;
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r7.mVelocityTracker;
        r0.addMovement(r10);
    L_0x0033:
        r0 = r7.mIsBeingDragged;
        goto L_0x0022;
    L_0x0036:
        r7.mIsBeingDragged = r6;
        r2 = r10.getX();
        r2 = (int) r2;
        r3 = r10.getY();
        r3 = (int) r3;
        r4 = r7.canDragView(r9);
        if (r4 == 0) goto L_0x002a;
    L_0x0048:
        r2 = r8.isPointInChildBounds(r9, r2, r3);
        if (r2 == 0) goto L_0x002a;
    L_0x004e:
        r7.mLastMotionY = r3;
        r2 = android.support.v4.view.MotionEventCompat.getPointerId(r10, r6);
        r7.mActivePointerId = r2;
        r7.ensureVelocityTracker();
        if (r1 == 0) goto L_0x002a;
    L_0x005b:
        r2 = r7.mActivePointerId;
        if (r2 != r5) goto L_0x0061;
    L_0x005f:
        if (r1 == 0) goto L_0x002a;
    L_0x0061:
        r2 = android.support.v4.view.MotionEventCompat.findPointerIndex(r10, r2);
        if (r2 != r5) goto L_0x0069;
    L_0x0067:
        if (r1 == 0) goto L_0x002a;
    L_0x0069:
        r2 = android.support.v4.view.MotionEventCompat.getY(r10, r2);
        r2 = (int) r2;
        r3 = r7.mLastMotionY;
        r3 = r2 - r3;
        r3 = java.lang.Math.abs(r3);
        r4 = r7.mTouchSlop;
        if (r3 <= r4) goto L_0x002a;
    L_0x007a:
        r7.mIsBeingDragged = r0;
        r7.mLastMotionY = r2;
        if (r1 == 0) goto L_0x002a;
    L_0x0080:
        r7.mIsBeingDragged = r6;
        r7.mActivePointerId = r5;
        r0 = r7.mVelocityTracker;
        if (r0 == 0) goto L_0x002a;
    L_0x0088:
        r0 = r7.mVelocityTracker;
        r0.recycle();
        r0 = 0;
        r7.mVelocityTracker = r0;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.HeaderBehavior.onInterceptTouchEvent(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    int getMaxDragOffset(View view) {
        return -view.getHeight();
    }

    static ScrollerCompat access$000(HeaderBehavior headerBehavior) {
        return headerBehavior.mScroller;
    }

    private void ensureVelocityTracker() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    final int scroll(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(coordinatorLayout, view, getTopBottomOffsetForScrollingSibling() - i, i2, i3);
    }

    final boolean fling(CoordinatorLayout coordinatorLayout, View view, int i, int i2, float f) {
        if (this.mFlingRunnable != null) {
            view.removeCallbacks(this.mFlingRunnable);
            this.mFlingRunnable = null;
        }
        if (this.mScroller == null) {
            this.mScroller = ScrollerCompat.create(view.getContext());
        }
        this.mScroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.mScroller.computeScrollOffset()) {
            return false;
        }
        this.mFlingRunnable = new FlingRunnable(this, coordinatorLayout, view);
        ViewCompat.postOnAnimation(view, this.mFlingRunnable);
        return true;
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, View view, int i) {
        return setHeaderTopBottomOffset(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 == 0 || topAndBottomOffset < i2 || topAndBottomOffset > i3) {
            return 0;
        }
        int constrain = MathUtils.constrain(i, i2, i3);
        if (topAndBottomOffset == constrain) {
            return 0;
        }
        setTopAndBottomOffset(constrain);
        return topAndBottomOffset - constrain;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.support.design.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
        r9 = this;
        r7 = 1;
        r8 = -1;
        r5 = 0;
        r6 = android.support.design.widget.CoordinatorLayout.a;
        r0 = r9.mTouchSlop;
        if (r0 >= 0) goto L_0x0017;
    L_0x0009:
        r0 = r10.getContext();
        r0 = android.view.ViewConfiguration.get(r0);
        r0 = r0.getScaledTouchSlop();
        r9.mTouchSlop = r0;
    L_0x0017:
        r0 = android.support.v4.view.MotionEventCompat.getActionMasked(r12);
        switch(r0) {
            case 0: goto L_0x0029;
            case 1: goto L_0x0088;
            case 2: goto L_0x004d;
            case 3: goto L_0x00ab;
            default: goto L_0x001e;
        };
    L_0x001e:
        r0 = r9.mVelocityTracker;
        if (r0 == 0) goto L_0x0027;
    L_0x0022:
        r0 = r9.mVelocityTracker;
        r0.addMovement(r12);
    L_0x0027:
        r5 = r7;
    L_0x0028:
        return r5;
    L_0x0029:
        r0 = r12.getX();
        r0 = (int) r0;
        r1 = r12.getY();
        r1 = (int) r1;
        r0 = r10.isPointInChildBounds(r11, r0, r1);
        if (r0 == 0) goto L_0x0028;
    L_0x0039:
        r0 = r9.canDragView(r11);
        if (r0 == 0) goto L_0x0028;
    L_0x003f:
        r9.mLastMotionY = r1;
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r12, r5);
        r9.mActivePointerId = r0;
        r9.ensureVelocityTracker();
        if (r6 == 0) goto L_0x001e;
    L_0x004c:
        goto L_0x0028;
    L_0x004d:
        r0 = r9.mActivePointerId;
        r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r12, r0);
        if (r0 == r8) goto L_0x0028;
    L_0x0055:
        r0 = android.support.v4.view.MotionEventCompat.getY(r12, r0);
        r1 = (int) r0;
        r0 = r9.mLastMotionY;
        r0 = r0 - r1;
        r2 = r9.mIsBeingDragged;
        if (r2 != 0) goto L_0x00bd;
    L_0x0061:
        r2 = java.lang.Math.abs(r0);
        r3 = r9.mTouchSlop;
        if (r2 <= r3) goto L_0x00bd;
    L_0x0069:
        r9.mIsBeingDragged = r7;
        if (r0 <= 0) goto L_0x0072;
    L_0x006d:
        r2 = r9.mTouchSlop;
        r0 = r0 - r2;
        if (r6 == 0) goto L_0x00bd;
    L_0x0072:
        r2 = r9.mTouchSlop;
        r0 = r0 + r2;
        r3 = r0;
    L_0x0076:
        r0 = r9.mIsBeingDragged;
        if (r0 == 0) goto L_0x001e;
    L_0x007a:
        r9.mLastMotionY = r1;
        r4 = r9.getMaxDragOffset(r11);
        r0 = r9;
        r1 = r10;
        r2 = r11;
        r0.scroll(r1, r2, r3, r4, r5);
        if (r6 == 0) goto L_0x001e;
    L_0x0088:
        r0 = r9.mVelocityTracker;
        if (r0 == 0) goto L_0x00ab;
    L_0x008c:
        r0 = r9.mVelocityTracker;
        r0.addMovement(r12);
        r0 = r9.mVelocityTracker;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.computeCurrentVelocity(r1);
        r0 = r9.mVelocityTracker;
        r1 = r9.mActivePointerId;
        r6 = android.support.v4.view.VelocityTrackerCompat.getYVelocity(r0, r1);
        r0 = r9.getScrollRangeForDragFling(r11);
        r4 = -r0;
        r1 = r9;
        r2 = r10;
        r3 = r11;
        r1.fling(r2, r3, r4, r5, r6);
    L_0x00ab:
        r9.mIsBeingDragged = r5;
        r9.mActivePointerId = r8;
        r0 = r9.mVelocityTracker;
        if (r0 == 0) goto L_0x001e;
    L_0x00b3:
        r0 = r9.mVelocityTracker;
        r0.recycle();
        r0 = 0;
        r9.mVelocityTracker = r0;
        goto L_0x001e;
    L_0x00bd:
        r3 = r0;
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.HeaderBehavior.onTouchEvent(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mActivePointerId = -1;
        this.mTouchSlop = -1;
    }

    public HeaderBehavior() {
        this.mActivePointerId = -1;
        this.mTouchSlop = -1;
    }
}
