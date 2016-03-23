package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ScrollView;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class NestedScrollView extends FrameLayout implements NestedScrollingParent, NestedScrollingChild, ScrollingView {
    private static final AccessibilityDelegate ACCESSIBILITY_DELEGATE;
    private static final int[] SCROLLVIEW_STYLEABLE;
    private static final String[] z;
    private int mActivePointerId;
    private final NestedScrollingChildHelper mChildHelper;
    private View mChildToScrollTo;
    private EdgeEffectCompat mEdgeGlowBottom;
    private EdgeEffectCompat mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private OnScrollChangeListener mOnScrollChangeListener;
    private final NestedScrollingParentHelper mParentHelper;
    private SavedState mSavedState;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private ScrollerCompat mScroller;
    private boolean mSmoothScrollingEnabled;
    private final Rect mTempRect;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;

    class AccessibilityDelegate extends AccessibilityDelegateCompat {
        AccessibilityDelegate() {
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int min;
            switch (i) {
                case 4096:
                    min = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), NestedScrollView.access$000(nestedScrollView));
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.smoothScrollTo(0, min);
                    return true;
                case 8192:
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.smoothScrollTo(0, min);
                    return true;
                default:
                    return false;
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int access$000 = NestedScrollView.access$000(nestedScrollView);
                if (access$000 > 0) {
                    accessibilityNodeInfoCompat.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        accessibilityNodeInfoCompat.addAction(8192);
                    }
                    if (nestedScrollView.getScrollY() < access$000) {
                        accessibilityNodeInfoCompat.addAction(4096);
                    }
                }
            }
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            AccessibilityRecordCompat asRecord = AccessibilityEventCompat.asRecord(accessibilityEvent);
            if (NestedScrollView.access$000(nestedScrollView) > 0) {
                z = true;
            } else {
                z = false;
            }
            asRecord.setScrollable(z);
            asRecord.setScrollX(nestedScrollView.getScrollX());
            asRecord.setScrollY(nestedScrollView.getScrollY());
            asRecord.setMaxScrollX(nestedScrollView.getScrollX());
            asRecord.setMaxScrollY(NestedScrollView.access$000(nestedScrollView));
        }
    }

    public interface OnScrollChangeListener {
        void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        private static final String[] z;
        public int scrollPosition;

        final class 1 implements Creator {
            public Object m61createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            1() {
            }

            public Object[] m62newArray(int i) {
                return newArray(i);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.scrollPosition);
        }

        static {
            String[] strArr = new String[2];
            String str = "cG4rmDF2z{xK4t{G~/~`\u0005{'mrO{2zcNS";
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
                            i3 = 43;
                            break;
                        case at.g /*1*/:
                            i3 = 40;
                            break;
                        case at.i /*2*/:
                            i3 = 70;
                            break;
                        case at.o /*3*/:
                            i3 = 27;
                            break;
                        default:
                            i3 = 23;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        CREATOR = new 1();
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "\u000b[%ixGD\u0016tdB\\/ty\u0016";
                        obj = null;
                }
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return z[0] + Integer.toHexString(System.identityHashCode(this)) + z[1] + this.scrollPosition + "}";
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.scrollPosition = parcel.readInt();
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.mVerticalScrollFactor == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            try {
                if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                    this.mVerticalScrollFactor = typedValue.getDimension(context.getResources().getDisplayMetrics());
                } else {
                    throw new IllegalStateException(z[8]);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return this.mVerticalScrollFactor;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTempRect = new Rect();
        this.mIsLayoutDirty = true;
        this.mIsLaidOut = false;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        initScrollView();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SCROLLVIEW_STYLEABLE, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.mParentHelper = new NestedScrollingParentHelper(this);
        this.mChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, ACCESSIBILITY_DELEGATE);
    }

    private boolean isWithinDeltaOfScreen(View view, int i, int i2) {
        try {
            view.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(view, this.mTempRect);
            if (this.mTempRect.bottom + i >= getScrollY()) {
                if (this.mTempRect.top - i <= getScrollY() + i2) {
                    return true;
                }
            }
            return false;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    private void flingWithNestedDispatch(int i) {
        boolean z;
        int scrollY = getScrollY();
        if (scrollY > 0 || i > 0) {
            try {
                if (scrollY < getScrollRange() || i < 0) {
                    z = true;
                    if (!dispatchNestedPreFling(0.0f, (float) i)) {
                        dispatchNestedFling(0.0f, (float) i, z);
                        if (z) {
                            fling(i);
                        }
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        z = false;
        try {
            if (!dispatchNestedPreFling(0.0f, (float) i)) {
                dispatchNestedFling(0.0f, (float) i, z);
                if (z) {
                    fling(i);
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public void onStopNestedScroll(View view) {
        this.mParentHelper.onStopNestedScroll(view);
        stopNestedScroll();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void smoothScrollBy(int r6, int r7) {
        /*
        r5 = this;
        r4 = 0;
        r0 = r5.getChildCount();	 Catch:{ IllegalStateException -> 0x0008 }
        if (r0 != 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        r2 = r5.mLastScroll;
        r0 = r0 - r2;
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0054;
    L_0x0017:
        r0 = r5.getHeight();
        r1 = r5.getPaddingBottom();
        r0 = r0 - r1;
        r1 = r5.getPaddingTop();
        r0 = r0 - r1;
        r1 = r5.getChildAt(r4);
        r1 = r1.getHeight();
        r0 = r1 - r0;
        r0 = java.lang.Math.max(r4, r0);
        r1 = r5.getScrollY();
        r2 = r1 + r7;
        r0 = java.lang.Math.min(r2, r0);
        r0 = java.lang.Math.max(r4, r0);
        r7 = r0 - r1;
        r0 = r5.mScroller;	 Catch:{ IllegalStateException -> 0x006b }
        r2 = r5.getScrollX();	 Catch:{ IllegalStateException -> 0x006b }
        r3 = 0;
        r0.startScroll(r2, r1, r3, r7);	 Catch:{ IllegalStateException -> 0x006b }
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r5);	 Catch:{ IllegalStateException -> 0x006b }
        r0 = android.support.v4.widget.CursorAdapter.a;	 Catch:{ IllegalStateException -> 0x006b }
        if (r0 == 0) goto L_0x0064;
    L_0x0054:
        r0 = r5.mScroller;	 Catch:{ IllegalStateException -> 0x006d }
        r0 = r0.isFinished();	 Catch:{ IllegalStateException -> 0x006d }
        if (r0 != 0) goto L_0x0061;
    L_0x005c:
        r0 = r5.mScroller;	 Catch:{ IllegalStateException -> 0x006d }
        r0.abortAnimation();	 Catch:{ IllegalStateException -> 0x006d }
    L_0x0061:
        r5.scrollBy(r6, r7);
    L_0x0064:
        r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        r5.mLastScroll = r0;
        goto L_0x0007;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.smoothScrollBy(int, int):void");
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
            if (this.mFillViewport && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                int measuredHeight = getMeasuredHeight();
                if (childAt.getMeasuredHeight() < measuredHeight) {
                    childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    private boolean canScroll() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        try {
            if (getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom()) {
                return true;
            }
            return false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean overScrollByCompat(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, boolean r19) {
        /*
        r10 = this;
        r8 = android.support.v4.widget.CursorAdapter.a;
        r3 = android.support.v4.view.ViewCompat.getOverScrollMode(r10);
        r1 = r10.computeHorizontalScrollRange();	 Catch:{ IllegalStateException -> 0x006f }
        r2 = r10.computeHorizontalScrollExtent();	 Catch:{ IllegalStateException -> 0x006f }
        if (r1 <= r2) goto L_0x0071;
    L_0x0010:
        r1 = 1;
    L_0x0011:
        r2 = r10.computeVerticalScrollRange();	 Catch:{ IllegalStateException -> 0x0073 }
        r4 = r10.computeVerticalScrollExtent();	 Catch:{ IllegalStateException -> 0x0073 }
        if (r2 <= r4) goto L_0x0075;
    L_0x001b:
        r2 = 1;
    L_0x001c:
        if (r3 == 0) goto L_0x0023;
    L_0x001e:
        r4 = 1;
        if (r3 != r4) goto L_0x0077;
    L_0x0021:
        if (r1 == 0) goto L_0x0077;
    L_0x0023:
        r1 = 1;
    L_0x0024:
        if (r3 == 0) goto L_0x002b;
    L_0x0026:
        r4 = 1;
        if (r3 != r4) goto L_0x0079;
    L_0x0029:
        if (r2 == 0) goto L_0x0079;
    L_0x002b:
        r2 = 1;
    L_0x002c:
        r7 = r13 + r11;
        if (r1 != 0) goto L_0x0032;
    L_0x0030:
        r17 = 0;
    L_0x0032:
        r5 = r14 + r12;
        if (r2 != 0) goto L_0x0038;
    L_0x0036:
        r18 = 0;
    L_0x0038:
        r0 = r17;
        r6 = -r0;
        r2 = r17 + r15;
        r0 = r18;
        r4 = -r0;
        r3 = r18 + r16;
        r1 = 0;
        if (r7 <= r2) goto L_0x0089;
    L_0x0045:
        r1 = 1;
        if (r8 == 0) goto L_0x0087;
    L_0x0048:
        if (r2 >= r6) goto L_0x0087;
    L_0x004a:
        r1 = 1;
        r9 = r1;
        r2 = r6;
    L_0x004d:
        r1 = 0;
        if (r5 <= r3) goto L_0x0085;
    L_0x0050:
        r1 = 1;
        if (r8 == 0) goto L_0x0083;
    L_0x0053:
        if (r3 >= r4) goto L_0x0083;
    L_0x0055:
        r1 = 1;
        r8 = r1;
        r3 = r4;
    L_0x0058:
        if (r8 == 0) goto L_0x0066;
    L_0x005a:
        r1 = r10.mScroller;	 Catch:{ IllegalStateException -> 0x007b }
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = r10.getScrollRange();	 Catch:{ IllegalStateException -> 0x007b }
        r1.springBack(r2, r3, r4, r5, r6, r7);	 Catch:{ IllegalStateException -> 0x007b }
    L_0x0066:
        r10.onOverScrolled(r2, r3, r9, r8);	 Catch:{ IllegalStateException -> 0x007d }
        if (r9 != 0) goto L_0x006d;
    L_0x006b:
        if (r8 == 0) goto L_0x0081;
    L_0x006d:
        r1 = 1;
    L_0x006e:
        return r1;
    L_0x006f:
        r1 = move-exception;
        throw r1;
    L_0x0071:
        r1 = 0;
        goto L_0x0011;
    L_0x0073:
        r1 = move-exception;
        throw r1;
    L_0x0075:
        r2 = 0;
        goto L_0x001c;
    L_0x0077:
        r1 = 0;
        goto L_0x0024;
    L_0x0079:
        r2 = 0;
        goto L_0x002c;
    L_0x007b:
        r1 = move-exception;
        throw r1;
    L_0x007d:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x007f }
    L_0x007f:
        r1 = move-exception;
        throw r1;
    L_0x0081:
        r1 = 0;
        goto L_0x006e;
    L_0x0083:
        r8 = r1;
        goto L_0x0058;
    L_0x0085:
        r3 = r5;
        goto L_0x0053;
    L_0x0087:
        r9 = r1;
        goto L_0x004d;
    L_0x0089:
        r2 = r7;
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.overScrollByCompat(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
        r20 = this;
        r16 = android.support.v4.widget.CursorAdapter.a;
        r20.initVelocityTrackerIfNotExists();
        r17 = android.view.MotionEvent.obtain(r21);
        r2 = android.support.v4.view.MotionEventCompat.getActionMasked(r21);
        if (r2 != 0) goto L_0x0014;
    L_0x000f:
        r3 = 0;
        r0 = r20;
        r0.mNestedYOffset = r3;	 Catch:{ IllegalStateException -> 0x0036 }
    L_0x0014:
        r3 = 0;
        r0 = r20;
        r4 = r0.mNestedYOffset;	 Catch:{ IllegalStateException -> 0x0040 }
        r4 = (float) r4;	 Catch:{ IllegalStateException -> 0x0040 }
        r0 = r17;
        r0.offsetLocation(r3, r4);	 Catch:{ IllegalStateException -> 0x0040 }
        switch(r2) {
            case 0: goto L_0x0038;
            case 1: goto L_0x0251;
            case 2: goto L_0x008c;
            case 3: goto L_0x02a6;
            case 4: goto L_0x0022;
            case 5: goto L_0x02d8;
            case 6: goto L_0x02f3;
            default: goto L_0x0022;
        };
    L_0x0022:
        r0 = r20;
        r2 = r0.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x0348 }
        if (r2 == 0) goto L_0x0031;
    L_0x0028:
        r0 = r20;
        r2 = r0.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x0348 }
        r0 = r17;
        r2.addMovement(r0);	 Catch:{ IllegalStateException -> 0x0348 }
    L_0x0031:
        r17.recycle();
        r2 = 1;
    L_0x0035:
        return r2;
    L_0x0036:
        r2 = move-exception;
        throw r2;
    L_0x0038:
        r2 = r20.getChildCount();	 Catch:{ IllegalStateException -> 0x0042 }
        if (r2 != 0) goto L_0x0044;
    L_0x003e:
        r2 = 0;
        goto L_0x0035;
    L_0x0040:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0042 }
    L_0x0042:
        r2 = move-exception;
        throw r2;
    L_0x0044:
        r0 = r20;
        r2 = r0.mScroller;	 Catch:{ IllegalStateException -> 0x030f }
        r2 = r2.isFinished();	 Catch:{ IllegalStateException -> 0x030f }
        if (r2 != 0) goto L_0x0311;
    L_0x004e:
        r2 = 1;
    L_0x004f:
        r0 = r20;
        r0.mIsBeingDragged = r2;
        if (r2 == 0) goto L_0x005f;
    L_0x0055:
        r2 = r20.getParent();
        if (r2 == 0) goto L_0x005f;
    L_0x005b:
        r3 = 1;
        r2.requestDisallowInterceptTouchEvent(r3);	 Catch:{ IllegalStateException -> 0x0314 }
    L_0x005f:
        r0 = r20;
        r2 = r0.mScroller;	 Catch:{ IllegalStateException -> 0x0316 }
        r2 = r2.isFinished();	 Catch:{ IllegalStateException -> 0x0316 }
        if (r2 != 0) goto L_0x0070;
    L_0x0069:
        r0 = r20;
        r2 = r0.mScroller;	 Catch:{ IllegalStateException -> 0x0316 }
        r2.abortAnimation();	 Catch:{ IllegalStateException -> 0x0316 }
    L_0x0070:
        r2 = r21.getY();
        r2 = (int) r2;
        r0 = r20;
        r0.mLastMotionY = r2;
        r2 = 0;
        r0 = r21;
        r2 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r2);
        r0 = r20;
        r0.mActivePointerId = r2;
        r2 = 2;
        r0 = r20;
        r0.startNestedScroll(r2);
        if (r16 == 0) goto L_0x0022;
    L_0x008c:
        r0 = r20;
        r2 = r0.mActivePointerId;
        r0 = r21;
        r18 = android.support.v4.view.MotionEventCompat.findPointerIndex(r0, r2);
        r2 = -1;
        r0 = r18;
        if (r0 != r2) goto L_0x00c8;
    L_0x009b:
        r2 = z;	 Catch:{ IllegalStateException -> 0x0318 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0318 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0318 }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x0318 }
        r4 = z;	 Catch:{ IllegalStateException -> 0x0318 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0318 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x0318 }
        r0 = r20;
        r4 = r0.mActivePointerId;	 Catch:{ IllegalStateException -> 0x0318 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x0318 }
        r4 = z;	 Catch:{ IllegalStateException -> 0x0318 }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0318 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x0318 }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x0318 }
        android.util.Log.e(r2, r3);	 Catch:{ IllegalStateException -> 0x0318 }
        if (r16 == 0) goto L_0x0022;
    L_0x00c8:
        r0 = r21;
        r1 = r18;
        r2 = android.support.v4.view.MotionEventCompat.getY(r0, r1);
        r3 = (int) r2;
        r0 = r20;
        r2 = r0.mLastMotionY;
        r2 = r2 - r3;
        r4 = 0;
        r0 = r20;
        r5 = r0.mScrollConsumed;
        r0 = r20;
        r6 = r0.mScrollOffset;
        r0 = r20;
        r4 = r0.dispatchNestedPreScroll(r4, r2, r5, r6);
        if (r4 == 0) goto L_0x010d;
    L_0x00e7:
        r0 = r20;
        r4 = r0.mScrollConsumed;
        r5 = 1;
        r4 = r4[r5];
        r2 = r2 - r4;
        r4 = 0;
        r0 = r20;
        r5 = r0.mScrollOffset;
        r6 = 1;
        r5 = r5[r6];
        r5 = (float) r5;
        r0 = r17;
        r0.offsetLocation(r4, r5);
        r0 = r20;
        r4 = r0.mNestedYOffset;
        r0 = r20;
        r5 = r0.mScrollOffset;
        r6 = 1;
        r5 = r5[r6];
        r4 = r4 + r5;
        r0 = r20;
        r0.mNestedYOffset = r4;
    L_0x010d:
        r0 = r20;
        r4 = r0.mIsBeingDragged;	 Catch:{ IllegalStateException -> 0x031a }
        if (r4 != 0) goto L_0x034a;
    L_0x0113:
        r4 = java.lang.Math.abs(r2);	 Catch:{ IllegalStateException -> 0x031a }
        r0 = r20;
        r5 = r0.mTouchSlop;	 Catch:{ IllegalStateException -> 0x031a }
        if (r4 <= r5) goto L_0x034a;
    L_0x011d:
        r4 = r20.getParent();
        if (r4 == 0) goto L_0x0127;
    L_0x0123:
        r5 = 1;
        r4.requestDisallowInterceptTouchEvent(r5);	 Catch:{ IllegalStateException -> 0x031c }
    L_0x0127:
        r4 = 1;
        r0 = r20;
        r0.mIsBeingDragged = r4;
        if (r2 <= 0) goto L_0x0135;
    L_0x012e:
        r0 = r20;
        r4 = r0.mTouchSlop;
        r2 = r2 - r4;
        if (r16 == 0) goto L_0x034a;
    L_0x0135:
        r0 = r20;
        r4 = r0.mTouchSlop;
        r2 = r2 + r4;
        r4 = r2;
    L_0x013b:
        r0 = r20;
        r2 = r0.mIsBeingDragged;
        if (r2 == 0) goto L_0x0022;
    L_0x0141:
        r0 = r20;
        r2 = r0.mScrollOffset;
        r5 = 1;
        r2 = r2[r5];
        r2 = r3 - r2;
        r0 = r20;
        r0.mLastMotionY = r2;
        r19 = r20.getScrollY();
        r8 = r20.getScrollRange();
        r2 = android.support.v4.view.ViewCompat.getOverScrollMode(r20);
        if (r2 == 0) goto L_0x0161;
    L_0x015c:
        r3 = 1;
        if (r2 != r3) goto L_0x031e;
    L_0x015f:
        if (r8 <= 0) goto L_0x031e;
    L_0x0161:
        r2 = 1;
        r15 = r2;
    L_0x0163:
        r3 = 0;
        r5 = 0;
        r6 = r20.getScrollY();	 Catch:{ IllegalStateException -> 0x0322 }
        r7 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 1;
        r2 = r20;
        r2 = r2.overScrollByCompat(r3, r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ IllegalStateException -> 0x0322 }
        if (r2 == 0) goto L_0x0182;
    L_0x0175:
        r2 = r20.hasNestedScrollingParent();	 Catch:{ IllegalStateException -> 0x0324 }
        if (r2 != 0) goto L_0x0182;
    L_0x017b:
        r0 = r20;
        r2 = r0.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x0324 }
        r2.clear();	 Catch:{ IllegalStateException -> 0x0324 }
    L_0x0182:
        r2 = r20.getScrollY();
        r11 = r2 - r19;
        r13 = r4 - r11;
        r10 = 0;
        r12 = 0;
        r0 = r20;
        r14 = r0.mScrollOffset;	 Catch:{ IllegalStateException -> 0x0326 }
        r9 = r20;
        r2 = r9.dispatchNestedScroll(r10, r11, r12, r13, r14);	 Catch:{ IllegalStateException -> 0x0326 }
        if (r2 == 0) goto L_0x01c8;
    L_0x0198:
        r0 = r20;
        r2 = r0.mLastMotionY;	 Catch:{ IllegalStateException -> 0x0328 }
        r0 = r20;
        r3 = r0.mScrollOffset;	 Catch:{ IllegalStateException -> 0x0328 }
        r5 = 1;
        r3 = r3[r5];	 Catch:{ IllegalStateException -> 0x0328 }
        r2 = r2 - r3;
        r0 = r20;
        r0.mLastMotionY = r2;	 Catch:{ IllegalStateException -> 0x0328 }
        r2 = 0;
        r0 = r20;
        r3 = r0.mScrollOffset;	 Catch:{ IllegalStateException -> 0x0328 }
        r5 = 1;
        r3 = r3[r5];	 Catch:{ IllegalStateException -> 0x0328 }
        r3 = (float) r3;	 Catch:{ IllegalStateException -> 0x0328 }
        r0 = r17;
        r0.offsetLocation(r2, r3);	 Catch:{ IllegalStateException -> 0x0328 }
        r0 = r20;
        r2 = r0.mNestedYOffset;	 Catch:{ IllegalStateException -> 0x0328 }
        r0 = r20;
        r3 = r0.mScrollOffset;	 Catch:{ IllegalStateException -> 0x0328 }
        r5 = 1;
        r3 = r3[r5];	 Catch:{ IllegalStateException -> 0x0328 }
        r2 = r2 + r3;
        r0 = r20;
        r0.mNestedYOffset = r2;	 Catch:{ IllegalStateException -> 0x0328 }
        if (r16 == 0) goto L_0x024f;
    L_0x01c8:
        if (r15 == 0) goto L_0x024f;
    L_0x01ca:
        r20.ensureGlows();
        r2 = r19 + r4;
        if (r2 >= 0) goto L_0x0200;
    L_0x01d1:
        r0 = r20;
        r3 = r0.mEdgeGlowTop;	 Catch:{ IllegalStateException -> 0x032a }
        r5 = (float) r4;	 Catch:{ IllegalStateException -> 0x032a }
        r6 = r20.getHeight();	 Catch:{ IllegalStateException -> 0x032a }
        r6 = (float) r6;	 Catch:{ IllegalStateException -> 0x032a }
        r5 = r5 / r6;
        r0 = r21;
        r1 = r18;
        r6 = android.support.v4.view.MotionEventCompat.getX(r0, r1);	 Catch:{ IllegalStateException -> 0x032a }
        r7 = r20.getWidth();	 Catch:{ IllegalStateException -> 0x032a }
        r7 = (float) r7;	 Catch:{ IllegalStateException -> 0x032a }
        r6 = r6 / r7;
        r3.onPull(r5, r6);	 Catch:{ IllegalStateException -> 0x032a }
        r0 = r20;
        r3 = r0.mEdgeGlowBottom;	 Catch:{ IllegalStateException -> 0x032a }
        r3 = r3.isFinished();	 Catch:{ IllegalStateException -> 0x032a }
        if (r3 != 0) goto L_0x0232;
    L_0x01f7:
        r0 = r20;
        r3 = r0.mEdgeGlowBottom;	 Catch:{ IllegalStateException -> 0x032c }
        r3.onRelease();	 Catch:{ IllegalStateException -> 0x032c }
        if (r16 == 0) goto L_0x0232;
    L_0x0200:
        if (r2 <= r8) goto L_0x0232;
    L_0x0202:
        r0 = r20;
        r2 = r0.mEdgeGlowBottom;	 Catch:{ IllegalStateException -> 0x0330 }
        r3 = (float) r4;	 Catch:{ IllegalStateException -> 0x0330 }
        r4 = r20.getHeight();	 Catch:{ IllegalStateException -> 0x0330 }
        r4 = (float) r4;	 Catch:{ IllegalStateException -> 0x0330 }
        r3 = r3 / r4;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r21;
        r1 = r18;
        r5 = android.support.v4.view.MotionEventCompat.getX(r0, r1);	 Catch:{ IllegalStateException -> 0x0330 }
        r6 = r20.getWidth();	 Catch:{ IllegalStateException -> 0x0330 }
        r6 = (float) r6;	 Catch:{ IllegalStateException -> 0x0330 }
        r5 = r5 / r6;
        r4 = r4 - r5;
        r2.onPull(r3, r4);	 Catch:{ IllegalStateException -> 0x0330 }
        r0 = r20;
        r2 = r0.mEdgeGlowTop;	 Catch:{ IllegalStateException -> 0x0330 }
        r2 = r2.isFinished();	 Catch:{ IllegalStateException -> 0x0330 }
        if (r2 != 0) goto L_0x0232;
    L_0x022b:
        r0 = r20;
        r2 = r0.mEdgeGlowTop;	 Catch:{ IllegalStateException -> 0x0330 }
        r2.onRelease();	 Catch:{ IllegalStateException -> 0x0330 }
    L_0x0232:
        r0 = r20;
        r2 = r0.mEdgeGlowTop;	 Catch:{ IllegalStateException -> 0x0332 }
        if (r2 == 0) goto L_0x024f;
    L_0x0238:
        r0 = r20;
        r2 = r0.mEdgeGlowTop;	 Catch:{ IllegalStateException -> 0x0334 }
        r2 = r2.isFinished();	 Catch:{ IllegalStateException -> 0x0334 }
        if (r2 == 0) goto L_0x024c;
    L_0x0242:
        r0 = r20;
        r2 = r0.mEdgeGlowBottom;	 Catch:{ IllegalStateException -> 0x0336 }
        r2 = r2.isFinished();	 Catch:{ IllegalStateException -> 0x0336 }
        if (r2 != 0) goto L_0x024f;
    L_0x024c:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r20);	 Catch:{ IllegalStateException -> 0x0336 }
    L_0x024f:
        if (r16 == 0) goto L_0x0022;
    L_0x0251:
        r0 = r20;
        r2 = r0.mIsBeingDragged;	 Catch:{ IllegalStateException -> 0x0338 }
        if (r2 == 0) goto L_0x029c;
    L_0x0257:
        r0 = r20;
        r2 = r0.mVelocityTracker;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r20;
        r4 = r0.mMaximumVelocity;
        r4 = (float) r4;
        r2.computeCurrentVelocity(r3, r4);
        r0 = r20;
        r3 = r0.mActivePointerId;
        r2 = android.support.v4.view.VelocityTrackerCompat.getYVelocity(r2, r3);
        r2 = (int) r2;
        r3 = java.lang.Math.abs(r2);	 Catch:{ IllegalStateException -> 0x033a }
        r0 = r20;
        r4 = r0.mMinimumVelocity;	 Catch:{ IllegalStateException -> 0x033a }
        if (r3 <= r4) goto L_0x0280;
    L_0x0278:
        r2 = -r2;
        r0 = r20;
        r0.flingWithNestedDispatch(r2);	 Catch:{ IllegalStateException -> 0x033c }
        if (r16 == 0) goto L_0x029c;
    L_0x0280:
        r0 = r20;
        r2 = r0.mScroller;	 Catch:{ IllegalStateException -> 0x033e }
        r3 = r20.getScrollX();	 Catch:{ IllegalStateException -> 0x033e }
        r4 = r20.getScrollY();	 Catch:{ IllegalStateException -> 0x033e }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = r20.getScrollRange();	 Catch:{ IllegalStateException -> 0x033e }
        r2 = r2.springBack(r3, r4, r5, r6, r7, r8);	 Catch:{ IllegalStateException -> 0x033e }
        if (r2 == 0) goto L_0x029c;
    L_0x0299:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r20);	 Catch:{ IllegalStateException -> 0x033e }
    L_0x029c:
        r2 = -1;
        r0 = r20;
        r0.mActivePointerId = r2;	 Catch:{ IllegalStateException -> 0x0340 }
        r20.endDrag();	 Catch:{ IllegalStateException -> 0x0340 }
        if (r16 == 0) goto L_0x0022;
    L_0x02a6:
        r0 = r20;
        r2 = r0.mIsBeingDragged;	 Catch:{ IllegalStateException -> 0x0342 }
        if (r2 == 0) goto L_0x02ce;
    L_0x02ac:
        r2 = r20.getChildCount();	 Catch:{ IllegalStateException -> 0x0344 }
        if (r2 <= 0) goto L_0x02ce;
    L_0x02b2:
        r0 = r20;
        r2 = r0.mScroller;	 Catch:{ IllegalStateException -> 0x0346 }
        r3 = r20.getScrollX();	 Catch:{ IllegalStateException -> 0x0346 }
        r4 = r20.getScrollY();	 Catch:{ IllegalStateException -> 0x0346 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = r20.getScrollRange();	 Catch:{ IllegalStateException -> 0x0346 }
        r2 = r2.springBack(r3, r4, r5, r6, r7, r8);	 Catch:{ IllegalStateException -> 0x0346 }
        if (r2 == 0) goto L_0x02ce;
    L_0x02cb:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r20);	 Catch:{ IllegalStateException -> 0x0346 }
    L_0x02ce:
        r2 = -1;
        r0 = r20;
        r0.mActivePointerId = r2;
        r20.endDrag();
        if (r16 == 0) goto L_0x0022;
    L_0x02d8:
        r2 = android.support.v4.view.MotionEventCompat.getActionIndex(r21);
        r0 = r21;
        r3 = android.support.v4.view.MotionEventCompat.getY(r0, r2);	 Catch:{ IllegalStateException -> 0x030d }
        r3 = (int) r3;	 Catch:{ IllegalStateException -> 0x030d }
        r0 = r20;
        r0.mLastMotionY = r3;	 Catch:{ IllegalStateException -> 0x030d }
        r0 = r21;
        r2 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r2);	 Catch:{ IllegalStateException -> 0x030d }
        r0 = r20;
        r0.mActivePointerId = r2;	 Catch:{ IllegalStateException -> 0x030d }
        if (r16 == 0) goto L_0x0022;
    L_0x02f3:
        r20.onSecondaryPointerUp(r21);	 Catch:{ IllegalStateException -> 0x030d }
        r0 = r20;
        r2 = r0.mActivePointerId;	 Catch:{ IllegalStateException -> 0x030d }
        r0 = r21;
        r2 = android.support.v4.view.MotionEventCompat.findPointerIndex(r0, r2);	 Catch:{ IllegalStateException -> 0x030d }
        r0 = r21;
        r2 = android.support.v4.view.MotionEventCompat.getY(r0, r2);	 Catch:{ IllegalStateException -> 0x030d }
        r2 = (int) r2;	 Catch:{ IllegalStateException -> 0x030d }
        r0 = r20;
        r0.mLastMotionY = r2;	 Catch:{ IllegalStateException -> 0x030d }
        goto L_0x0022;
    L_0x030d:
        r2 = move-exception;
        throw r2;
    L_0x030f:
        r2 = move-exception;
        throw r2;
    L_0x0311:
        r2 = 0;
        goto L_0x004f;
    L_0x0314:
        r2 = move-exception;
        throw r2;
    L_0x0316:
        r2 = move-exception;
        throw r2;
    L_0x0318:
        r2 = move-exception;
        throw r2;
    L_0x031a:
        r2 = move-exception;
        throw r2;
    L_0x031c:
        r2 = move-exception;
        throw r2;
    L_0x031e:
        r2 = 0;
        r15 = r2;
        goto L_0x0163;
    L_0x0322:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0324 }
    L_0x0324:
        r2 = move-exception;
        throw r2;
    L_0x0326:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0328 }
    L_0x0328:
        r2 = move-exception;
        throw r2;
    L_0x032a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x032c }
    L_0x032c:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x032e }
    L_0x032e:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0330 }
    L_0x0330:
        r2 = move-exception;
        throw r2;
    L_0x0332:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0334 }
    L_0x0334:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0336 }
    L_0x0336:
        r2 = move-exception;
        throw r2;
    L_0x0338:
        r2 = move-exception;
        throw r2;
    L_0x033a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x033c }
    L_0x033c:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x033e }
    L_0x033e:
        r2 = move-exception;
        throw r2;
    L_0x0340:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0342 }
    L_0x0342:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0344 }
    L_0x0344:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0346 }
    L_0x0346:
        r2 = move-exception;
        throw r2;
    L_0x0348:
        r2 = move-exception;
        throw r2;
    L_0x034a:
        r4 = r2;
        goto L_0x013b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getMaxScrollAmount() {
        return (int) (0.5f * ((float) getHeight()));
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void setFillViewport(boolean z) {
        try {
            if (z != this.mFillViewport) {
                this.mFillViewport = z;
                requestLayout();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void initOrResetVelocityTracker() {
        try {
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
                if (CursorAdapter.a == 0) {
                    return;
                }
            }
            this.mVelocityTracker.clear();
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void fling(int i) {
        if (getChildCount() > 0) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            int height2 = getChildAt(0).getHeight();
            this.mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, height2 - height), 0, height / 2);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect r9) {
        /*
        r8 = this;
        r3 = 0;
        r4 = android.support.v4.widget.CursorAdapter.a;
        r0 = r8.getChildCount();	 Catch:{ IllegalStateException -> 0x000a }
        if (r0 != 0) goto L_0x000c;
    L_0x0009:
        return r3;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r5 = r8.getHeight();
        r0 = r8.getScrollY();
        r1 = r0 + r5;
        r2 = r8.getVerticalFadingEdgeLength();
        r6 = r9.top;
        if (r6 <= 0) goto L_0x001f;
    L_0x001e:
        r0 = r0 + r2;
    L_0x001f:
        r6 = r9.bottom;
        r7 = r8.getChildAt(r3);
        r7 = r7.getHeight();
        if (r6 >= r7) goto L_0x002c;
    L_0x002b:
        r1 = r1 - r2;
    L_0x002c:
        r2 = r9.bottom;	 Catch:{ IllegalStateException -> 0x0077 }
        if (r2 <= r1) goto L_0x0083;
    L_0x0030:
        r2 = r9.top;	 Catch:{ IllegalStateException -> 0x0079 }
        if (r2 <= r0) goto L_0x0083;
    L_0x0034:
        r2 = r9.height();	 Catch:{ IllegalStateException -> 0x0079 }
        if (r2 <= r5) goto L_0x0081;
    L_0x003a:
        r2 = r9.top;
        r2 = r2 - r0;
        r2 = r2 + r3;
        if (r4 == 0) goto L_0x0044;
    L_0x0040:
        r6 = r9.bottom;
        r6 = r6 - r1;
        r2 = r2 + r6;
    L_0x0044:
        r3 = r8.getChildAt(r3);
        r3 = r3.getBottom();
        r3 = r3 - r1;
        r2 = java.lang.Math.min(r2, r3);
        if (r4 == 0) goto L_0x0075;
    L_0x0053:
        r3 = r9.top;	 Catch:{ IllegalStateException -> 0x007b }
        if (r3 >= r0) goto L_0x0075;
    L_0x0057:
        r3 = r9.bottom;	 Catch:{ IllegalStateException -> 0x007d }
        if (r3 >= r1) goto L_0x0075;
    L_0x005b:
        r3 = r9.height();	 Catch:{ IllegalStateException -> 0x007d }
        if (r3 <= r5) goto L_0x007f;
    L_0x0061:
        r3 = r9.bottom;
        r1 = r1 - r3;
        r1 = r2 - r1;
        if (r4 == 0) goto L_0x006c;
    L_0x0068:
        r2 = r9.top;
        r0 = r0 - r2;
        r1 = r1 - r0;
    L_0x006c:
        r0 = r8.getScrollY();
        r0 = -r0;
        r2 = java.lang.Math.max(r1, r0);
    L_0x0075:
        r3 = r2;
        goto L_0x0009;
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r1 = r2;
        goto L_0x0068;
    L_0x0081:
        r2 = r3;
        goto L_0x0040;
    L_0x0083:
        r2 = r3;
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect):int");
    }

    public boolean startNestedScroll(int i) {
        return this.mChildHelper.startNestedScroll(i);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    private static boolean isViewDescendantOf(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        try {
            boolean z;
            if (parent instanceof ViewGroup) {
                if (isViewDescendantOf((View) parent, view2)) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean onRequestFocusInDescendants(int r5, android.graphics.Rect r6) {
        /*
        r4 = this;
        r1 = 0;
        r0 = 2;
        if (r5 != r0) goto L_0x003d;
    L_0x0004:
        r0 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r2 = android.support.v4.widget.CursorAdapter.a;	 Catch:{ IllegalStateException -> 0x001f }
        if (r2 == 0) goto L_0x003b;
    L_0x000a:
        r2 = 1;
        if (r0 != r2) goto L_0x003b;
    L_0x000d:
        r0 = 33;
        r2 = r0;
    L_0x0010:
        if (r6 != 0) goto L_0x0023;
    L_0x0012:
        r0 = android.view.FocusFinder.getInstance();	 Catch:{ IllegalStateException -> 0x0021 }
        r3 = 0;
        r0 = r0.findNextFocus(r4, r3, r2);	 Catch:{ IllegalStateException -> 0x0021 }
    L_0x001b:
        if (r0 != 0) goto L_0x002c;
    L_0x001d:
        r0 = r1;
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = move-exception;
        throw r0;
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r0 = android.view.FocusFinder.getInstance();
        r0 = r0.findNextFocusFromRect(r4, r6, r2);
        goto L_0x001b;
    L_0x002c:
        r3 = r4.isOffScreen(r0);	 Catch:{ IllegalStateException -> 0x0034 }
        if (r3 == 0) goto L_0x0036;
    L_0x0032:
        r0 = r1;
        goto L_0x001e;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = r0.requestFocus(r2, r6);
        goto L_0x001e;
    L_0x003b:
        r2 = r0;
        goto L_0x0010;
    L_0x003d:
        r0 = r5;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onRequestFocusInDescendants(int, android.graphics.Rect):boolean");
    }

    public int getNestedScrollAxes() {
        return this.mParentHelper.getNestedScrollAxes();
    }

    private void initScrollView() {
        this.mScroller = new ScrollerCompat(getContext(), null);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        try {
            flingWithNestedDispatch((int) f2);
            return true;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        try {
            if (MotionEventCompat.getPointerId(motionEvent, action) == this.mActivePointerId) {
                if (action == 0) {
                    action = 1;
                } else {
                    action = 0;
                }
                try {
                    this.mLastMotionY = (int) MotionEventCompat.getY(motionEvent, action);
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, action);
                    if (this.mVelocityTracker != null) {
                        this.mVelocityTracker.clear();
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int clamp = clamp(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int clamp2 = clamp(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            try {
                if (clamp == getScrollX()) {
                    if (clamp2 == getScrollY()) {
                        return;
                    }
                }
                super.scrollTo(clamp, clamp2);
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    private boolean inChild(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        try {
            if (i2 < childAt.getTop() - scrollY) {
                return false;
            }
            if (i2 >= childAt.getBottom() - scrollY) {
                return false;
            }
            try {
                if (i < childAt.getLeft()) {
                    return false;
                }
                try {
                    if (i < childAt.getRight()) {
                        return true;
                    }
                    return false;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    static {
        String[] strArr = new String[11];
        String str = "SKD'_\u001dkDsU\u0001AOwD'M_dX6TOiD";
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
                        i4 = 115;
                        break;
                    case at.g /*1*/:
                        i4 = 34;
                        break;
                    case at.i /*2*/:
                        i4 = 42;
                        break;
                    case at.o /*3*/:
                        i4 = 7;
                        break;
                    default:
                        i4 = 48;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = ":L\\f\\\u001aF\nw_\u001aL^bB:F\u0017";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = " AXh\\\u001ftCbGSAKi\u0010\u001bMYs\u0010\u001cLF~\u0010\u001cLO'T\u001aPOdDSABn\\\u0017";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = " AXh\\\u001ftCbGSAKi\u0010\u001bMYs\u0010\u001cLF~\u0010\u001cLO'T\u001aPOdDSABn\\\u0017";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "=GYsU\u0017qIu_\u001fN|nU\u0004";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = ":L\\f\\\u001aF\nw_\u001aL^bB:F\u0017";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    str = "SKD'_\u001dvErS\u001bg\\b^\u0007";
                    i = 6;
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    strArr2 = strArr3;
                    str = "6ZZbS\u0007GN'D\u001bGGb\u0010\u0007M\ncU\u0015KDb\u0010\u001fKYs`\u0001GLbB\u0001GNND\u0016ObbY\u0014J^)";
                    i = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = " AXh\\\u001ftCbGSAKi\u0010\u001bMYs\u0010\u001cLF~\u0010\u001cLO'T\u001aPOdDSABn\\\u0017";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = " AXh\\\u001ftCbGSAKi\u0010\u001bMYs\u0010\u001cLF~\u0010\u001cLO'T\u001aPOdDSABn\\\u0017";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ACCESSIBILITY_DELEGATE = new AccessibilityDelegate();
                    SCROLLVIEW_STYLEABLE = new int[]{16843130};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "=GYsU\u0017qIu_\u001fN|nU\u0004";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.isNestedScrollingEnabled();
    }

    private void scrollToChild(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            try {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        try {
            super.onScrollChanged(i, i2, i3, i4);
            if (this.mOnScrollChangeListener != null) {
                this.mOnScrollChangeListener.onScrollChange(this, i, i2, i3, i4);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            if (!super.dispatchKeyEvent(keyEvent)) {
                if (!executeKeyEvent(keyEvent)) {
                    return false;
                }
            }
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void recycleVelocityTracker() {
        try {
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void doScrollY(int i) {
        if (i != 0) {
            try {
                if (this.mSmoothScrollingEnabled) {
                    smoothScrollBy(0, i);
                    if (CursorAdapter.a == 0) {
                        return;
                    }
                }
                scrollBy(0, i);
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean pageScroll(int r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        if (r5 != r1) goto L_0x0006;
    L_0x0005:
        r0 = 1;
    L_0x0006:
        r1 = r4.getHeight();
        if (r0 == 0) goto L_0x0039;
    L_0x000c:
        r0 = r4.mTempRect;
        r2 = r4.getScrollY();
        r2 = r2 + r1;
        r0.top = r2;
        r0 = r4.getChildCount();
        if (r0 <= 0) goto L_0x0035;
    L_0x001b:
        r0 = r0 + -1;
        r0 = r4.getChildAt(r0);
        r2 = r4.mTempRect;	 Catch:{ IllegalStateException -> 0x0063 }
        r2 = r2.top;	 Catch:{ IllegalStateException -> 0x0063 }
        r2 = r2 + r1;
        r3 = r0.getBottom();	 Catch:{ IllegalStateException -> 0x0063 }
        if (r2 <= r3) goto L_0x0035;
    L_0x002c:
        r2 = r4.mTempRect;	 Catch:{ IllegalStateException -> 0x0063 }
        r0 = r0.getBottom();	 Catch:{ IllegalStateException -> 0x0063 }
        r0 = r0 - r1;
        r2.top = r0;	 Catch:{ IllegalStateException -> 0x0063 }
    L_0x0035:
        r0 = android.support.v4.widget.CursorAdapter.a;	 Catch:{ IllegalStateException -> 0x0065 }
        if (r0 == 0) goto L_0x004d;
    L_0x0039:
        r0 = r4.mTempRect;	 Catch:{ IllegalStateException -> 0x0067 }
        r2 = r4.getScrollY();	 Catch:{ IllegalStateException -> 0x0067 }
        r2 = r2 - r1;
        r0.top = r2;	 Catch:{ IllegalStateException -> 0x0067 }
        r0 = r4.mTempRect;	 Catch:{ IllegalStateException -> 0x0067 }
        r0 = r0.top;	 Catch:{ IllegalStateException -> 0x0067 }
        if (r0 >= 0) goto L_0x004d;
    L_0x0048:
        r0 = r4.mTempRect;	 Catch:{ IllegalStateException -> 0x0067 }
        r2 = 0;
        r0.top = r2;	 Catch:{ IllegalStateException -> 0x0067 }
    L_0x004d:
        r0 = r4.mTempRect;
        r2 = r4.mTempRect;
        r2 = r2.top;
        r1 = r1 + r2;
        r0.bottom = r1;
        r0 = r4.mTempRect;
        r0 = r0.top;
        r1 = r4.mTempRect;
        r1 = r1.bottom;
        r0 = r4.scrollAndFocus(r5, r0, r1);
        return r0;
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.pageScroll(int):boolean");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        try {
            if (getChildCount() > 0) {
                throw new IllegalStateException(z[3]);
            }
            super.addView(view, layoutParams);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static int access$000(NestedScrollView nestedScrollView) {
        return nestedScrollView.getScrollRange();
    }

    public void setOnScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        this.mOnScrollChangeListener = onScrollChangeListener;
    }

    public void onAttachedToWindow() {
        this.mIsLaidOut = false;
    }

    public void stopNestedScroll() {
        this.mChildHelper.stopNestedScroll();
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.setNestedScrollingEnabled(z);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.mParentHelper.onNestedScrollAccepted(view, view2, i);
        startNestedScroll(2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            try {
                recycleVelocityTracker();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    private void initVelocityTrackerIfNotExists() {
        try {
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
        /*
        r1 = this;
        r0 = r1.mIsLayoutDirty;	 Catch:{ IllegalStateException -> 0x0011 }
        if (r0 != 0) goto L_0x000b;
    L_0x0004:
        r1.scrollToChild(r3);	 Catch:{ IllegalStateException -> 0x0013 }
        r0 = android.support.v4.widget.CursorAdapter.a;	 Catch:{ IllegalStateException -> 0x0013 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        r1.mChildToScrollTo = r3;	 Catch:{ IllegalStateException -> 0x0013 }
    L_0x000d:
        super.requestChildFocus(r2, r3);
        return;
    L_0x0011:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0013 }
    L_0x0013:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.requestChildFocus(android.view.View, android.view.View):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r3 = 2;
        r4 = -1;
        r0 = 1;
        r1 = 0;
        r7 = android.support.v4.widget.CursorAdapter.a;
        r2 = r10.getAction();
        if (r2 != r3) goto L_0x0013;
    L_0x000c:
        r3 = r9.mIsBeingDragged;	 Catch:{ IllegalStateException -> 0x0011 }
        if (r3 == 0) goto L_0x0013;
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r2 = r2 & 255;
        switch(r2) {
            case 0: goto L_0x0083;
            case 1: goto L_0x00bc;
            case 2: goto L_0x001b;
            case 3: goto L_0x00bc;
            case 4: goto L_0x0018;
            case 5: goto L_0x0018;
            case 6: goto L_0x00e4;
            default: goto L_0x0018;
        };
    L_0x0018:
        r0 = r9.mIsBeingDragged;
        goto L_0x0010;
    L_0x001b:
        r2 = r9.mActivePointerId;
        if (r2 != r4) goto L_0x0021;
    L_0x001f:
        if (r7 == 0) goto L_0x0018;
    L_0x0021:
        r3 = android.support.v4.view.MotionEventCompat.findPointerIndex(r10, r2);
        if (r3 != r4) goto L_0x0050;
    L_0x0027:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00eb }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00eb }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00eb }
        r5.<init>();	 Catch:{ IllegalStateException -> 0x00eb }
        r6 = z;	 Catch:{ IllegalStateException -> 0x00eb }
        r8 = 2;
        r6 = r6[r8];	 Catch:{ IllegalStateException -> 0x00eb }
        r5 = r5.append(r6);	 Catch:{ IllegalStateException -> 0x00eb }
        r2 = r5.append(r2);	 Catch:{ IllegalStateException -> 0x00eb }
        r5 = z;	 Catch:{ IllegalStateException -> 0x00eb }
        r6 = 0;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x00eb }
        r2 = r2.append(r5);	 Catch:{ IllegalStateException -> 0x00eb }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x00eb }
        android.util.Log.e(r4, r2);	 Catch:{ IllegalStateException -> 0x00eb }
        if (r7 == 0) goto L_0x0018;
    L_0x0050:
        r2 = android.support.v4.view.MotionEventCompat.getY(r10, r3);
        r2 = (int) r2;
        r3 = r9.mLastMotionY;
        r3 = r2 - r3;
        r3 = java.lang.Math.abs(r3);
        r4 = r9.mTouchSlop;	 Catch:{ IllegalStateException -> 0x00ed }
        if (r3 <= r4) goto L_0x0018;
    L_0x0061:
        r3 = r9.getNestedScrollAxes();	 Catch:{ IllegalStateException -> 0x00ed }
        r3 = r3 & 2;
        if (r3 != 0) goto L_0x0018;
    L_0x0069:
        r9.mIsBeingDragged = r0;
        r9.mLastMotionY = r2;
        r9.initVelocityTrackerIfNotExists();
        r2 = r9.mVelocityTracker;
        r2.addMovement(r10);
        r9.mNestedYOffset = r1;
        r2 = r9.getParent();
        if (r2 == 0) goto L_0x0081;
    L_0x007d:
        r3 = 1;
        r2.requestDisallowInterceptTouchEvent(r3);	 Catch:{ IllegalStateException -> 0x00ef }
    L_0x0081:
        if (r7 == 0) goto L_0x0018;
    L_0x0083:
        r2 = r10.getY();
        r2 = (int) r2;
        r3 = r10.getX();	 Catch:{ IllegalStateException -> 0x00f1 }
        r3 = (int) r3;	 Catch:{ IllegalStateException -> 0x00f1 }
        r3 = r9.inChild(r3, r2);	 Catch:{ IllegalStateException -> 0x00f1 }
        if (r3 != 0) goto L_0x009b;
    L_0x0093:
        r3 = 0;
        r9.mIsBeingDragged = r3;	 Catch:{ IllegalStateException -> 0x00f3 }
        r9.recycleVelocityTracker();	 Catch:{ IllegalStateException -> 0x00f3 }
        if (r7 == 0) goto L_0x0018;
    L_0x009b:
        r9.mLastMotionY = r2;	 Catch:{ IllegalStateException -> 0x00f5 }
        r2 = 0;
        r2 = android.support.v4.view.MotionEventCompat.getPointerId(r10, r2);	 Catch:{ IllegalStateException -> 0x00f5 }
        r9.mActivePointerId = r2;	 Catch:{ IllegalStateException -> 0x00f5 }
        r9.initOrResetVelocityTracker();	 Catch:{ IllegalStateException -> 0x00f5 }
        r2 = r9.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x00f5 }
        r2.addMovement(r10);	 Catch:{ IllegalStateException -> 0x00f5 }
        r2 = r9.mScroller;	 Catch:{ IllegalStateException -> 0x00f5 }
        r2 = r2.isFinished();	 Catch:{ IllegalStateException -> 0x00f5 }
        if (r2 != 0) goto L_0x00f7;
    L_0x00b4:
        r9.mIsBeingDragged = r0;	 Catch:{ IllegalStateException -> 0x00f9 }
        r0 = 2;
        r9.startNestedScroll(r0);	 Catch:{ IllegalStateException -> 0x00f9 }
        if (r7 == 0) goto L_0x0018;
    L_0x00bc:
        r0 = 0;
        r9.mIsBeingDragged = r0;	 Catch:{ IllegalStateException -> 0x00fb }
        r0 = -1;
        r9.mActivePointerId = r0;	 Catch:{ IllegalStateException -> 0x00fb }
        r9.recycleVelocityTracker();	 Catch:{ IllegalStateException -> 0x00fb }
        r0 = r9.mScroller;	 Catch:{ IllegalStateException -> 0x00fb }
        r1 = r9.getScrollX();	 Catch:{ IllegalStateException -> 0x00fb }
        r2 = r9.getScrollY();	 Catch:{ IllegalStateException -> 0x00fb }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = r9.getScrollRange();	 Catch:{ IllegalStateException -> 0x00fb }
        r0 = r0.springBack(r1, r2, r3, r4, r5, r6);	 Catch:{ IllegalStateException -> 0x00fb }
        if (r0 == 0) goto L_0x00df;
    L_0x00dc:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r9);	 Catch:{ IllegalStateException -> 0x00fb }
    L_0x00df:
        r9.stopNestedScroll();	 Catch:{ IllegalStateException -> 0x00e9 }
        if (r7 == 0) goto L_0x0018;
    L_0x00e4:
        r9.onSecondaryPointerUp(r10);	 Catch:{ IllegalStateException -> 0x00e9 }
        goto L_0x0018;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = move-exception;
        throw r0;
    L_0x00ed:
        r0 = move-exception;
        throw r0;
    L_0x00ef:
        r0 = move-exception;
        throw r0;
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = r1;
        goto L_0x00b4;
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mChildHelper.dispatchNestedFling(f, f2, z);
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int i = 33;
        boolean z = false;
        int i2 = CursorAdapter.a;
        try {
            this.mTempRect.setEmpty();
            if (canScroll()) {
                try {
                    if (keyEvent.getAction() != 0) {
                        return false;
                    }
                    switch (keyEvent.getKeyCode()) {
                        case arj.Toolbar_collapseContentDescription /*19*/:
                            if (!keyEvent.isAltPressed()) {
                                z = arrowScroll(33);
                                if (i2 == 0) {
                                    return z;
                                }
                            }
                            z = fullScroll(33);
                            if (i2 == 0) {
                                return z;
                            }
                            break;
                        case arj.Toolbar_navigationIcon /*20*/:
                            break;
                        case arj.Theme_editTextColor /*62*/:
                            break;
                        default:
                            return false;
                    }
                    try {
                        if (!keyEvent.isAltPressed()) {
                            z = arrowScroll(130);
                            if (i2 == 0) {
                                return z;
                            }
                        }
                        z = fullScroll(130);
                        if (i2 == 0) {
                            return z;
                        }
                        try {
                            if (!keyEvent.isShiftPressed()) {
                                i = 130;
                            }
                            pageScroll(i);
                            return z;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            } else {
                boolean z2;
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (!(findFocus == null || findFocus == this)) {
                    try {
                        if (findFocus.requestFocus(130)) {
                            z2 = true;
                            return z2;
                        }
                    } catch (IllegalStateException e2222) {
                        throw e2222;
                    }
                }
                z2 = false;
                return z2;
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }

    private static int clamp(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        if (i2 + i > i3) {
            return i3 - i2;
        }
        return i;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.mEdgeGlowTop != null) {
            int save;
            int width;
            int scrollY = getScrollY();
            if (!this.mEdgeGlowTop.isFinished()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                try {
                    canvas.translate((float) getPaddingLeft(), (float) Math.min(0, scrollY));
                    this.mEdgeGlowTop.setSize(width, getHeight());
                    if (this.mEdgeGlowTop.draw(canvas)) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                    canvas.restoreToCount(save);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            if (!this.mEdgeGlowBottom.isFinished()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                try {
                    canvas.translate((float) ((-width) + getPaddingLeft()), (float) (Math.max(getScrollRange(), scrollY) + height));
                    canvas.rotate(180.0f, (float) width, 0.0f);
                    this.mEdgeGlowBottom.setSize(width, height);
                    if (this.mEdgeGlowBottom.draw(canvas)) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                    canvas.restoreToCount(save);
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean scrollToChildRect(android.graphics.Rect r4, boolean r5) {
        /*
        r3 = this;
        r0 = 0;
        r1 = r3.computeScrollDeltaToGetChildRectOnScreen(r4);
        if (r1 == 0) goto L_0x0008;
    L_0x0007:
        r0 = 1;
    L_0x0008:
        if (r0 == 0) goto L_0x0018;
    L_0x000a:
        if (r5 == 0) goto L_0x0014;
    L_0x000c:
        r2 = 0;
        r3.scrollBy(r2, r1);	 Catch:{ IllegalStateException -> 0x0019 }
        r2 = android.support.v4.widget.CursorAdapter.a;	 Catch:{ IllegalStateException -> 0x0019 }
        if (r2 == 0) goto L_0x0018;
    L_0x0014:
        r2 = 0;
        r3.smoothScrollBy(r2, r1);	 Catch:{ IllegalStateException -> 0x0019 }
    L_0x0018:
        return r0;
    L_0x0019:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.scrollToChildRect(android.graphics.Rect, boolean):boolean");
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.scrollPosition = getScrollY();
        return savedState;
    }

    private void ensureGlows() {
        try {
            if (ViewCompat.getOverScrollMode(this) != 2) {
                if (this.mEdgeGlowTop == null) {
                    Context context = getContext();
                    try {
                        this.mEdgeGlowTop = new EdgeEffectCompat(context);
                        this.mEdgeGlowBottom = new EdgeEffectCompat(context);
                        if (CursorAdapter.a == 0) {
                            return;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                return;
            }
            this.mEdgeGlowTop = null;
            this.mEdgeGlowBottom = null;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.mChildHelper.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public boolean fullScroll(int i) {
        int i2;
        if (i == 130) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int height = getHeight();
        this.mTempRect.top = 0;
        this.mTempRect.bottom = height;
        if (i2 != 0) {
            i2 = getChildCount();
            if (i2 > 0) {
                View childAt = getChildAt(i2 - 1);
                this.mTempRect.bottom = childAt.getBottom() + getPaddingBottom();
                this.mTempRect.top = this.mTempRect.bottom - height;
            }
        }
        return scrollAndFocus(i, this.mTempRect.top, this.mTempRect.bottom);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        try {
            if ((MotionEventCompat.getSource(motionEvent) & 2) == 0) {
                return false;
            }
            switch (motionEvent.getAction()) {
                case aF.u /*8*/:
                    if (this.mIsBeingDragged) {
                        return false;
                    }
                    float axisValue = MotionEventCompat.getAxisValue(motionEvent, 9);
                    if (axisValue == 0.0f) {
                        return false;
                    }
                    int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                    int scrollRange = getScrollRange();
                    int scrollY = getScrollY();
                    verticalScrollFactorCompat = scrollY - verticalScrollFactorCompat;
                    if (verticalScrollFactorCompat < 0) {
                        try {
                            if (CursorAdapter.a != 0) {
                                verticalScrollFactorCompat = 0;
                            } else {
                                scrollRange = 0;
                                if (scrollRange != scrollY) {
                                    return false;
                                }
                                try {
                                    super.scrollTo(getScrollX(), scrollRange);
                                    return true;
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    }
                    if (verticalScrollFactorCompat <= scrollRange) {
                        scrollRange = verticalScrollFactorCompat;
                    }
                    if (scrollRange != scrollY) {
                        return false;
                    }
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                default:
                    return false;
            }
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r9) {
        /*
        r8 = this;
        r7 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r2 = 0;
        r4 = android.support.v4.widget.CursorAdapter.a;
        r0 = r8.findFocus();
        if (r0 != r8) goto L_0x000c;
    L_0x000b:
        r0 = 0;
    L_0x000c:
        r1 = android.view.FocusFinder.getInstance();
        r1 = r1.findNextFocus(r8, r0, r9);
        r3 = r8.getMaxScrollAmount();
        if (r1 == 0) goto L_0x003c;
    L_0x001a:
        r5 = r8.getHeight();	 Catch:{ IllegalStateException -> 0x0074 }
        r5 = r8.isWithinDeltaOfScreen(r1, r3, r5);	 Catch:{ IllegalStateException -> 0x0074 }
        if (r5 == 0) goto L_0x003c;
    L_0x0024:
        r5 = r8.mTempRect;
        r1.getDrawingRect(r5);
        r5 = r8.mTempRect;
        r8.offsetDescendantRectToMyCoords(r1, r5);
        r5 = r8.mTempRect;
        r5 = r8.computeScrollDeltaToGetChildRectOnScreen(r5);
        r8.doScrollY(r5);
        r1.requestFocus(r9);
        if (r4 == 0) goto L_0x007f;
    L_0x003c:
        r1 = 33;
        if (r9 != r1) goto L_0x00a2;
    L_0x0040:
        r1 = r8.getScrollY();	 Catch:{ IllegalStateException -> 0x0076 }
        if (r1 >= r3) goto L_0x00a2;
    L_0x0046:
        r1 = r8.getScrollY();
        if (r4 == 0) goto L_0x0070;
    L_0x004c:
        if (r9 != r7) goto L_0x0070;
    L_0x004e:
        r4 = r8.getChildCount();	 Catch:{ IllegalStateException -> 0x0078 }
        if (r4 <= 0) goto L_0x0070;
    L_0x0054:
        r4 = r8.getChildAt(r2);
        r4 = r4.getBottom();
        r5 = r8.getScrollY();
        r6 = r8.getHeight();
        r5 = r5 + r6;
        r6 = r8.getPaddingBottom();
        r5 = r5 - r6;
        r6 = r4 - r5;
        if (r6 >= r3) goto L_0x0070;
    L_0x006e:
        r1 = r4 - r5;
    L_0x0070:
        if (r1 != 0) goto L_0x007a;
    L_0x0072:
        r0 = r2;
    L_0x0073:
        return r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        if (r9 != r7) goto L_0x009e;
    L_0x007c:
        r8.doScrollY(r1);
    L_0x007f:
        if (r0 == 0) goto L_0x009c;
    L_0x0081:
        r1 = r0.isFocused();	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r1 == 0) goto L_0x009c;
    L_0x0087:
        r0 = r8.isOffScreen(r0);	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r0 == 0) goto L_0x009c;
    L_0x008d:
        r0 = r8.getDescendantFocusability();
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r8.setDescendantFocusability(r1);
        r8.requestFocus();
        r8.setDescendantFocusability(r0);
    L_0x009c:
        r0 = 1;
        goto L_0x0073;
    L_0x009e:
        r1 = -r1;
        goto L_0x007c;
    L_0x00a0:
        r0 = move-exception;
        throw r0;
    L_0x00a2:
        r1 = r3;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.arrowScroll(int):boolean");
    }

    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.hasNestedScrollingParent();
    }

    public void computeScroll() {
        if (this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                Object obj;
                int scrollRange = getScrollRange();
                int overScrollMode = ViewCompat.getOverScrollMode(this);
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    obj = 1;
                } else {
                    obj = null;
                }
                try {
                    overScrollByCompat(currX - scrollX, currY - scrollY, scrollX, scrollY, 0, scrollRange, 0, 0, false);
                    if (obj != null) {
                        ensureGlows();
                        if (currY <= 0 && scrollY > 0) {
                            try {
                                this.mEdgeGlowTop.onAbsorb((int) this.mScroller.getCurrVelocity());
                                if (CursorAdapter.a == 0) {
                                    return;
                                }
                            } catch (IllegalStateException e) {
                                try {
                                    throw e;
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            }
                        }
                        if (currY >= scrollRange && scrollY < scrollRange) {
                            try {
                                this.mEdgeGlowBottom.onAbsorb((int) this.mScroller.getCurrVelocity());
                            } catch (IllegalStateException e22) {
                                throw e22;
                            }
                        }
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                } catch (IllegalStateException e2222) {
                    try {
                        throw e2222;
                    } catch (IllegalStateException e22222) {
                        throw e22222;
                    }
                }
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        try {
            if (getChildCount() > 0) {
                throw new IllegalStateException(z[9]);
            }
            super.addView(view, i, layoutParams);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean scrollAndFocus(int r7, int r8, int r9) {
        /*
        r6 = this;
        r1 = 1;
        r2 = 0;
        r0 = r6.getHeight();
        r4 = r6.getScrollY();
        r5 = r4 + r0;
        r0 = 33;
        if (r7 != r0) goto L_0x0031;
    L_0x0010:
        r0 = r1;
    L_0x0011:
        r3 = r6.findFocusableViewInBounds(r0, r8, r9);
        if (r3 != 0) goto L_0x0018;
    L_0x0017:
        r3 = r6;
    L_0x0018:
        if (r8 < r4) goto L_0x003c;
    L_0x001a:
        if (r9 > r5) goto L_0x003c;
    L_0x001c:
        r1 = android.support.v4.widget.CursorAdapter.a;	 Catch:{ IllegalStateException -> 0x0033 }
        if (r1 == 0) goto L_0x0027;
    L_0x0020:
        if (r0 == 0) goto L_0x0037;
    L_0x0022:
        r0 = r8 - r4;
    L_0x0024:
        r6.doScrollY(r0);
    L_0x0027:
        r0 = r6.findFocus();	 Catch:{ IllegalStateException -> 0x003a }
        if (r3 == r0) goto L_0x0030;
    L_0x002d:
        r3.requestFocus(r7);	 Catch:{ IllegalStateException -> 0x003a }
    L_0x0030:
        return r2;
    L_0x0031:
        r0 = r2;
        goto L_0x0011;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r0 = r9 - r5;
        goto L_0x0024;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r2 = r1;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.scrollAndFocus(int, int, int):boolean");
    }

    protected float getTopFadingEdgeStrength() {
        try {
            if (getChildCount() == 0) {
                return 0.0f;
            }
            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
            int scrollY = getScrollY();
            return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            height = bottom - scrollY;
            try {
                if (CursorAdapter.a == 0) {
                    return height;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        height = bottom;
        if (scrollY > max) {
            return height + (scrollY - max);
        }
        return height;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
        r4 = this;
        r1 = 0;
        super.onLayout(r5, r6, r7, r8, r9);	 Catch:{ IllegalStateException -> 0x007f }
        r0 = 0;
        r4.mIsLayoutDirty = r0;	 Catch:{ IllegalStateException -> 0x007f }
        r0 = r4.mChildToScrollTo;	 Catch:{ IllegalStateException -> 0x007f }
        if (r0 == 0) goto L_0x0018;
    L_0x000b:
        r0 = r4.mChildToScrollTo;	 Catch:{ IllegalStateException -> 0x0081 }
        r0 = isViewDescendantOf(r0, r4);	 Catch:{ IllegalStateException -> 0x0081 }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r4.mChildToScrollTo;	 Catch:{ IllegalStateException -> 0x0081 }
        r4.scrollToChild(r0);	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x0018:
        r0 = 0;
        r4.mChildToScrollTo = r0;	 Catch:{ IllegalStateException -> 0x0083 }
        r0 = r4.mIsLaidOut;	 Catch:{ IllegalStateException -> 0x0083 }
        if (r0 != 0) goto L_0x0070;
    L_0x001f:
        r0 = r4.mSavedState;	 Catch:{ IllegalStateException -> 0x0085 }
        if (r0 == 0) goto L_0x0031;
    L_0x0023:
        r0 = r4.getScrollX();	 Catch:{ IllegalStateException -> 0x0085 }
        r2 = r4.mSavedState;	 Catch:{ IllegalStateException -> 0x0085 }
        r2 = r2.scrollPosition;	 Catch:{ IllegalStateException -> 0x0085 }
        r4.scrollTo(r0, r2);	 Catch:{ IllegalStateException -> 0x0085 }
        r0 = 0;
        r4.mSavedState = r0;	 Catch:{ IllegalStateException -> 0x0085 }
    L_0x0031:
        r0 = r4.getChildCount();	 Catch:{ IllegalStateException -> 0x0087 }
        if (r0 <= 0) goto L_0x0089;
    L_0x0037:
        r0 = 0;
        r0 = r4.getChildAt(r0);	 Catch:{ IllegalStateException -> 0x0087 }
        r0 = r0.getMeasuredHeight();	 Catch:{ IllegalStateException -> 0x0087 }
    L_0x0040:
        r2 = r9 - r7;
        r3 = r4.getPaddingBottom();
        r2 = r2 - r3;
        r3 = r4.getPaddingTop();
        r2 = r2 - r3;
        r0 = r0 - r2;
        r0 = java.lang.Math.max(r1, r0);
        r1 = r4.getScrollY();	 Catch:{ IllegalStateException -> 0x008b }
        if (r1 <= r0) goto L_0x0062;
    L_0x0057:
        r1 = r4.getScrollX();	 Catch:{ IllegalStateException -> 0x008d }
        r4.scrollTo(r1, r0);	 Catch:{ IllegalStateException -> 0x008d }
        r0 = android.support.v4.widget.CursorAdapter.a;	 Catch:{ IllegalStateException -> 0x008d }
        if (r0 == 0) goto L_0x0070;
    L_0x0062:
        r0 = r4.getScrollY();	 Catch:{ IllegalStateException -> 0x008f }
        if (r0 >= 0) goto L_0x0070;
    L_0x0068:
        r0 = r4.getScrollX();	 Catch:{ IllegalStateException -> 0x008f }
        r1 = 0;
        r4.scrollTo(r0, r1);	 Catch:{ IllegalStateException -> 0x008f }
    L_0x0070:
        r0 = r4.getScrollX();
        r1 = r4.getScrollY();
        r4.scrollTo(r0, r1);
        r0 = 1;
        r4.mIsLaidOut = r0;
        return;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = r1;
        goto L_0x0040;
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onLayout(boolean, int, int, int, int):void");
    }

    public void addView(View view) {
        try {
            if (getChildCount() > 0) {
                throw new IllegalStateException(z[10]);
            }
            super.addView(view);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && isWithinDeltaOfScreen(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(findFocus, this.mTempRect);
            doScrollY(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
        }
    }

    public final void smoothScrollTo(int i, int i2) {
        smoothScrollBy(i - getScrollX(), i2 - getScrollY());
    }

    private void endDrag() {
        try {
            this.mIsBeingDragged = false;
            recycleVelocityTracker();
            stopNestedScroll();
            if (this.mEdgeGlowTop != null) {
                this.mEdgeGlowTop.onRelease();
                this.mEdgeGlowBottom.onRelease();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return scrollToChildRect(rect, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mChildHelper.dispatchNestedPreFling(f, f2);
    }

    private boolean isOffScreen(View view) {
        try {
            return !isWithinDeltaOfScreen(view, 0, getHeight());
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View findFocusableViewInBounds(boolean r12, int r13, int r14) {
        /*
        r11 = this;
        r6 = android.support.v4.widget.CursorAdapter.a;
        r0 = 2;
        r7 = r11.getFocusables(r0);
        r2 = 0;
        r1 = 0;
        r8 = r7.size();
        r0 = 0;
        r3 = r0;
        r4 = r1;
        r1 = r2;
    L_0x0011:
        if (r3 >= r8) goto L_0x0066;
    L_0x0013:
        r0 = r7.get(r3);
        r0 = (android.view.View) r0;
        r9 = r0.getTop();
        r10 = r0.getBottom();
        if (r13 >= r10) goto L_0x0063;
    L_0x0023:
        if (r9 >= r14) goto L_0x0063;
    L_0x0025:
        if (r13 >= r9) goto L_0x0057;
    L_0x0027:
        if (r10 >= r14) goto L_0x0057;
    L_0x0029:
        r2 = 1;
    L_0x002a:
        if (r1 != 0) goto L_0x0061;
    L_0x002c:
        if (r6 == 0) goto L_0x0052;
    L_0x002e:
        r4 = r2;
        r5 = r0;
    L_0x0030:
        if (r12 == 0) goto L_0x0038;
    L_0x0032:
        r1 = r5.getTop();	 Catch:{ IllegalStateException -> 0x0059 }
        if (r9 < r1) goto L_0x0040;
    L_0x0038:
        if (r12 != 0) goto L_0x005f;
    L_0x003a:
        r1 = r5.getBottom();	 Catch:{ IllegalStateException -> 0x005d }
        if (r10 <= r1) goto L_0x005f;
    L_0x0040:
        r1 = 1;
    L_0x0041:
        if (r4 == 0) goto L_0x004a;
    L_0x0043:
        if (r2 == 0) goto L_0x0073;
    L_0x0045:
        if (r1 == 0) goto L_0x0073;
    L_0x0047:
        if (r6 == 0) goto L_0x0071;
    L_0x0049:
        r5 = r0;
    L_0x004a:
        if (r2 == 0) goto L_0x006e;
    L_0x004c:
        r2 = 1;
        if (r6 == 0) goto L_0x0052;
    L_0x004f:
        r4 = r0;
    L_0x0050:
        if (r1 == 0) goto L_0x006c;
    L_0x0052:
        r1 = r3 + 1;
        if (r6 == 0) goto L_0x0068;
    L_0x0056:
        return r0;
    L_0x0057:
        r2 = 0;
        goto L_0x002a;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r1 = 0;
        goto L_0x0041;
    L_0x0061:
        r5 = r1;
        goto L_0x0030;
    L_0x0063:
        r2 = r4;
        r0 = r1;
        goto L_0x0052;
    L_0x0066:
        r0 = r1;
        goto L_0x0056;
    L_0x0068:
        r3 = r1;
        r4 = r2;
        r1 = r0;
        goto L_0x0011;
    L_0x006c:
        r0 = r4;
        goto L_0x0052;
    L_0x006e:
        r2 = r4;
        r4 = r5;
        goto L_0x0050;
    L_0x0071:
        r2 = r4;
        goto L_0x0052;
    L_0x0073:
        r2 = r4;
        r0 = r5;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.findFocusableViewInBounds(boolean, int, int):android.view.View");
    }

    protected float getBottomFadingEdgeStrength() {
        try {
            if (getChildCount() == 0) {
                return 0.0f;
            }
            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
            int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
            return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mChildHelper.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public void addView(View view, int i) {
        try {
            if (getChildCount() > 0) {
                throw new IllegalStateException(z[4]);
            }
            super.addView(view, i);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mSavedState = savedState;
        requestLayout();
    }
}
