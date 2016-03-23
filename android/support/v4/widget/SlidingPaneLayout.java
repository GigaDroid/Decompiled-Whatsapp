package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ViewDragHelper.Callback;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.whatsapp.arj;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class SlidingPaneLayout extends ViewGroup {
    static final SlidingPanelLayoutImpl IMPL;
    private static final String[] z;
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private PanelSlideListener mPanelSlideListener;
    private int mParallaxBy;
    private float mParallaxOffset;
    private final ArrayList mPostedRunnables;
    private boolean mPreservedOpenState;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    private float mSlideOffset;
    private int mSlideRange;
    private View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect mTmpRect;
        final SlidingPaneLayout this$0;

        AccessibilityDelegate(SlidingPaneLayout slidingPaneLayout) {
            this.this$0 = slidingPaneLayout;
            this.mTmpRect = new Rect();
        }

        public boolean filter(View view) {
            return this.this$0.isDimmed(view);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (filter(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int i = CursorAdapter.a;
            AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, obtain);
            copyNodeInfoNoChildren(accessibilityNodeInfoCompat, obtain);
            obtain.recycle();
            accessibilityNodeInfoCompat.setClassName(SlidingPaneLayout.class.getName());
            accessibilityNodeInfoCompat.setSource(view);
            ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
            int childCount = this.this$0.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.this$0.getChildAt(i2);
                if (!filter(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.mTmpRect;
            accessibilityNodeInfoCompat2.getBoundsInParent(rect);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat2.getMovementGranularities());
        }
    }

    class DisableLayerRunnable implements Runnable {
        final View mChildView;
        final SlidingPaneLayout this$0;

        DisableLayerRunnable(SlidingPaneLayout slidingPaneLayout, View view) {
            this.this$0 = slidingPaneLayout;
            this.mChildView = view;
        }

        public void run() {
            if (this.mChildView.getParent() == this.this$0) {
                ViewCompat.setLayerType(this.mChildView, 0, null);
                SlidingPaneLayout.access$1000(this.this$0, this.mChildView);
            }
            SlidingPaneLayout.access$1100(this.this$0).remove(this);
        }
    }

    class DragHelperCallback extends Callback {
        final SlidingPaneLayout this$0;

        public void onViewReleased(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.access$700(this.this$0)) {
                int paddingRight = this.this$0.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.access$300(this.this$0) > 0.5f)) {
                    paddingRight += SlidingPaneLayout.access$800(this.this$0);
                }
                paddingRight = (this.this$0.getWidth() - paddingRight) - SlidingPaneLayout.access$400(this.this$0).getWidth();
                if (CursorAdapter.a == 0) {
                    i = paddingRight;
                    SlidingPaneLayout.access$200(this.this$0).settleCapturedViewAt(i, view.getTop());
                    this.this$0.invalidate();
                }
            }
            i = layoutParams.leftMargin + this.this$0.getPaddingLeft();
            if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.access$300(this.this$0) > 0.5f)) {
                i += SlidingPaneLayout.access$800(this.this$0);
            }
            SlidingPaneLayout.access$200(this.this$0).settleCapturedViewAt(i, view.getTop());
            this.this$0.invalidate();
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.access$400(this.this$0).getLayoutParams();
            if (SlidingPaneLayout.access$700(this.this$0)) {
                int width = this.this$0.getWidth() - ((this.this$0.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.access$400(this.this$0).getWidth());
                width = Math.max(Math.min(i, width), width - SlidingPaneLayout.access$800(this.this$0));
                if (CursorAdapter.a == 0) {
                    return width;
                }
            }
            int paddingLeft = layoutParams.leftMargin + this.this$0.getPaddingLeft();
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.access$800(this.this$0) + paddingLeft);
        }

        public boolean tryCaptureView(View view, int i) {
            if (SlidingPaneLayout.access$100(this.this$0)) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).slideable;
        }

        public void onViewCaptured(View view, int i) {
            this.this$0.setAllChildrenVisible();
        }

        private DragHelperCallback(SlidingPaneLayout slidingPaneLayout) {
            this.this$0 = slidingPaneLayout;
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.access$600(this.this$0, i);
            this.this$0.invalidate();
        }

        public void onViewDragStateChanged(int i) {
            if (SlidingPaneLayout.access$200(this.this$0).getViewDragState() == 0) {
                if (SlidingPaneLayout.access$300(this.this$0) == 0.0f) {
                    this.this$0.updateObscuredViewsVisibility(SlidingPaneLayout.access$400(this.this$0));
                    this.this$0.dispatchOnPanelClosed(SlidingPaneLayout.access$400(this.this$0));
                    SlidingPaneLayout.access$502(this.this$0, false);
                    if (CursorAdapter.a == 0) {
                        return;
                    }
                }
                this.this$0.dispatchOnPanelOpened(SlidingPaneLayout.access$400(this.this$0));
                SlidingPaneLayout.access$502(this.this$0, true);
            }
        }

        public void onEdgeDragStarted(int i, int i2) {
            SlidingPaneLayout.access$200(this.this$0).captureChildView(SlidingPaneLayout.access$400(this.this$0), i2);
        }

        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.access$800(this.this$0);
        }

        DragHelperCallback(SlidingPaneLayout slidingPaneLayout, 1 1) {
            this(slidingPaneLayout);
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }
    }

    public class LayoutParams extends MarginLayoutParams {
        private static final int[] ATTRS;
        Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
            this.weight = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        static {
            ATTRS = new int[]{16843137};
        }
    }

    public interface PanelSlideListener {
        void onPanelClosed(View view);

        void onPanelOpened(View view);

        void onPanelSlide(View view, float f);
    }

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        boolean isOpen;

        final class 1 implements Creator {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public Object[] m64newArray(int i) {
                return newArray(i);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public Object m63createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            1() {
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, 1 1) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.isOpen ? 1 : 0);
        }

        static {
            CREATOR = new 1();
        }

        private SavedState(Parcel parcel) {
            boolean z;
            super(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.isOpen = z;
        }
    }

    interface SlidingPanelLayoutImpl {
        void invalidateChildRegion(SlidingPaneLayout slidingPaneLayout, View view);
    }

    class SlidingPanelLayoutImplBase implements SlidingPanelLayoutImpl {
        SlidingPanelLayoutImplBase() {
        }

        public void invalidateChildRegion(SlidingPaneLayout slidingPaneLayout, View view) {
            ViewCompat.postInvalidateOnAnimation(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    class SlidingPanelLayoutImplJB extends SlidingPanelLayoutImplBase {
        private static final String[] z;
        private Method mGetDisplayList;
        private Field mRecreateDisplayList;

        static {
            String[] strArr = new String[8];
            String str = ">\u001d[/\n\u0003\u0016b*\r\b=S2\f\u0018\u0005";
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
                            i3 = arj.Theme_switchStyle;
                            break;
                        case at.g /*1*/:
                            i3 = 113;
                            break;
                        case at.i /*2*/:
                            i3 = 50;
                            break;
                        case at.o /*3*/:
                            i3 = 75;
                            break;
                        default:
                            i3 = 99;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = ">\u001d[/\n\u0003\u0016b*\r\b=S2\f\u0018\u0005";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = ">\u001d[/\n\u0003\u0016b*\r\b=S2\f\u0018\u0005";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = ".\u001eG'\u0007\u0003VFk\u0005\b\u0005Q#C\u0000#W(\u0011\b\u0010F.'\u0004\u0002B'\u0002\u0014=[8\u0017M\u0017[.\u000f\tJ\u0012/\n\u0000\u001c[%\u0004M\u0006['\u000fM\u0013Wk\u0010\u0001\u001eEe";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = ".\u001eG'\u0007\u0003VFk\u0005\b\u0005Q#C\n\u0014F\u000f\n\u001e\u0001^*\u001a!\u0018A?C\u0000\u0014F#\f\tJ\u0012/\n\u0000\u001c[%\u0004M\u0006]%D\u0019QE$\u0011\u0006Q@\"\u0004\u0005\u0005\u001c";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\n\u0014F\u000f\n\u001e\u0001^*\u001a!\u0018A?";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "\u0000#W(\u0011\b\u0010F.'\u0004\u0002B'\u0002\u0014=[8\u0017";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "(\u0003@$\u0011M\u0003W-\u0011\b\u0002Z\"\r\nQV\"\u0010\u001d\u001dS2C\u0001\u0018A?C\u001e\u0005S?\u0006";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invalidateChildRegion(android.support.v4.widget.SlidingPaneLayout r5, android.view.View r6) {
            /*
            r4 = this;
            r0 = r4.mGetDisplayList;	 Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x002e;
        L_0x0004:
            r0 = r4.mRecreateDisplayList;	 Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x002e;
        L_0x0008:
            r0 = r4.mRecreateDisplayList;	 Catch:{ Exception -> 0x001c }
            r1 = 1;
            r0.setBoolean(r6, r1);	 Catch:{ Exception -> 0x001c }
            r1 = r4.mGetDisplayList;	 Catch:{ Exception -> 0x001c }
            r0 = 0;
            r0 = (java.lang.Object[]) r0;	 Catch:{ Exception -> 0x001c }
            r1.invoke(r6, r0);	 Catch:{ Exception -> 0x001c }
        L_0x0016:
            super.invalidateChildRegion(r5, r6);
        L_0x0019:
            return;
        L_0x001a:
            r0 = move-exception;
            throw r0;
        L_0x001c:
            r0 = move-exception;
            r1 = z;	 Catch:{ Exception -> 0x0032 }
            r2 = 0;
            r1 = r1[r2];	 Catch:{ Exception -> 0x0032 }
            r2 = z;	 Catch:{ Exception -> 0x0032 }
            r3 = 1;
            r2 = r2[r3];	 Catch:{ Exception -> 0x0032 }
            android.util.Log.e(r1, r2, r0);	 Catch:{ Exception -> 0x0032 }
            r0 = android.support.v4.widget.CursorAdapter.a;	 Catch:{ Exception -> 0x0032 }
            if (r0 == 0) goto L_0x0016;
        L_0x002e:
            r6.invalidate();	 Catch:{ Exception -> 0x0032 }
            goto L_0x0019;
        L_0x0032:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.SlidingPanelLayoutImplJB.invalidateChildRegion(android.support.v4.widget.SlidingPaneLayout, android.view.View):void");
        }

        SlidingPanelLayoutImplJB() {
            try {
                this.mGetDisplayList = View.class.getDeclaredMethod(z[6], (Class[]) null);
            } catch (Throwable e) {
                Log.e(z[2], z[5], e);
            }
            try {
                this.mRecreateDisplayList = View.class.getDeclaredField(z[7]);
                this.mRecreateDisplayList.setAccessible(true);
            } catch (Throwable e2) {
                Log.e(z[3], z[4], e2);
            }
        }
    }

    class SlidingPanelLayoutImplJBMR1 extends SlidingPanelLayoutImplBase {
        public void invalidateChildRegion(SlidingPaneLayout slidingPaneLayout, View view) {
            ViewCompat.setLayerPaint(view, ((LayoutParams) view.getLayoutParams()).dimPaint);
        }

        SlidingPanelLayoutImplJBMR1() {
        }
    }

    boolean isDimmed(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        try {
            boolean z;
            if (this.mCanSlide) {
                if (layoutParams.dimWhenOffset) {
                    try {
                        if (this.mSlideOffset > 0.0f) {
                            z = true;
                            return z;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
            z = false;
            return z;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static void access$1000(SlidingPaneLayout slidingPaneLayout, View view) {
        slidingPaneLayout.invalidateChildRegion(view);
    }

    static ViewDragHelper access$200(SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mDragHelper;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        try {
            boolean isOpen;
            if (isSlideable()) {
                isOpen = isOpen();
            } else {
                isOpen = this.mPreservedOpenState;
            }
            savedState.isOpen = isOpen;
            return savedState;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    void dispatchOnPanelSlide(View view) {
        try {
            if (this.mPanelSlideListener != null) {
                this.mPanelSlideListener.onPanelSlide(view, this.mSlideOffset);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void invalidateChildRegion(View view) {
        IMPL.invalidateChildRegion(this, view);
    }

    void setAllChildrenVisible() {
        int i = 0;
        int i2 = CursorAdapter.a;
        int childCount = getChildCount();
        while (i < childCount) {
            View childAt = getChildAt(i);
            try {
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
                i++;
                if (i2 != 0) {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    static ArrayList access$1100(SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mPostedRunnables;
    }

    static void access$600(SlidingPaneLayout slidingPaneLayout, int i) {
        slidingPaneLayout.onPanelDragged(i);
    }

    private void onPanelDragged(int i) {
        try {
            if (this.mSlideableView == null) {
                this.mSlideOffset = 0.0f;
                return;
            }
            int i2;
            boolean isLayoutRtlSupport = isLayoutRtlSupport();
            LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
            int width = this.mSlideableView.getWidth();
            if (isLayoutRtlSupport) {
                try {
                    i = (getWidth() - i) - width;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            if (isLayoutRtlSupport) {
                try {
                    width = getPaddingRight();
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            width = getPaddingLeft();
            if (isLayoutRtlSupport) {
                try {
                    i2 = layoutParams.rightMargin;
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            }
            i2 = layoutParams.leftMargin;
            try {
                this.mSlideOffset = ((float) (i - (width + i2))) / ((float) this.mSlideRange);
                if (this.mParallaxBy != 0) {
                    parallaxOtherViews(this.mSlideOffset);
                }
                try {
                    if (layoutParams.dimWhenOffset) {
                        dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
                    }
                    dispatchOnPanelSlide(this.mSlideableView);
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void updateObscuredViewsVisibility(android.view.View r19) {
        /*
        r18 = this;
        r9 = android.support.v4.widget.CursorAdapter.a;
        r10 = r18.isLayoutRtlSupport();
        if (r10 == 0) goto L_0x009b;
    L_0x0008:
        r1 = r18.getWidth();	 Catch:{ IllegalStateException -> 0x0099 }
        r2 = r18.getPaddingRight();	 Catch:{ IllegalStateException -> 0x0099 }
        r1 = r1 - r2;
    L_0x0011:
        if (r10 == 0) goto L_0x00a3;
    L_0x0013:
        r2 = r18.getPaddingLeft();	 Catch:{ IllegalStateException -> 0x00a1 }
    L_0x0017:
        r11 = r18.getPaddingTop();
        r3 = r18.getHeight();
        r4 = r18.getPaddingBottom();
        r12 = r3 - r4;
        if (r19 == 0) goto L_0x003f;
    L_0x0027:
        r3 = viewIsOpaque(r19);	 Catch:{ IllegalStateException -> 0x00ae }
        if (r3 == 0) goto L_0x003f;
    L_0x002d:
        r6 = r19.getLeft();
        r5 = r19.getRight();
        r4 = r19.getTop();
        r3 = r19.getBottom();
        if (r9 == 0) goto L_0x0043;
    L_0x003f:
        r3 = 0;
        r4 = r3;
        r5 = r3;
        r6 = r3;
    L_0x0043:
        r7 = 0;
        r13 = r18.getChildCount();
        r8 = r7;
    L_0x0049:
        if (r8 >= r13) goto L_0x0098;
    L_0x004b:
        r0 = r18;
        r14 = r0.getChildAt(r8);
        r0 = r19;
        if (r14 != r0) goto L_0x0057;
    L_0x0055:
        if (r9 == 0) goto L_0x0098;
    L_0x0057:
        if (r10 == 0) goto L_0x00b0;
    L_0x0059:
        r7 = r2;
    L_0x005a:
        r15 = r14.getLeft();
        r15 = java.lang.Math.max(r7, r15);
        r7 = r14.getTop();
        r16 = java.lang.Math.max(r11, r7);
        if (r10 == 0) goto L_0x00b2;
    L_0x006c:
        r7 = r1;
    L_0x006d:
        r17 = r14.getRight();
        r0 = r17;
        r7 = java.lang.Math.min(r7, r0);
        r17 = r14.getBottom();
        r0 = r17;
        r17 = java.lang.Math.min(r12, r0);
        if (r15 < r6) goto L_0x0090;
    L_0x0083:
        r0 = r16;
        if (r0 < r4) goto L_0x0090;
    L_0x0087:
        if (r7 > r5) goto L_0x0090;
    L_0x0089:
        r0 = r17;
        if (r0 > r3) goto L_0x0090;
    L_0x008d:
        r7 = 4;
        if (r9 == 0) goto L_0x0091;
    L_0x0090:
        r7 = 0;
    L_0x0091:
        r14.setVisibility(r7);
        r7 = r8 + 1;
        if (r9 == 0) goto L_0x00b4;
    L_0x0098:
        return;
    L_0x0099:
        r1 = move-exception;
        throw r1;
    L_0x009b:
        r1 = r18.getPaddingLeft();
        goto L_0x0011;
    L_0x00a1:
        r1 = move-exception;
        throw r1;
    L_0x00a3:
        r2 = r18.getWidth();
        r3 = r18.getPaddingRight();
        r2 = r2 - r3;
        goto L_0x0017;
    L_0x00ae:
        r1 = move-exception;
        throw r1;
    L_0x00b0:
        r7 = r1;
        goto L_0x005a;
    L_0x00b2:
        r7 = r2;
        goto L_0x006d;
    L_0x00b4:
        r8 = r7;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.updateObscuredViewsVisibility(android.view.View):void");
    }

    private boolean closePane(View view, int i) {
        try {
            if (!this.mFirstLayout) {
                if (!smoothSlideTo(0.0f, i)) {
                    return false;
                }
            }
            this.mPreservedOpenState = false;
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean drawChild(android.graphics.Canvas r8, android.view.View r9, long r10) {
        /*
        r7 = this;
        r2 = 0;
        r3 = android.support.v4.widget.CursorAdapter.a;
        r0 = r9.getLayoutParams();
        r0 = (android.support.v4.widget.SlidingPaneLayout.LayoutParams) r0;
        r1 = 2;
        r4 = r8.save(r1);
        r1 = r7.mCanSlide;	 Catch:{ IllegalStateException -> 0x00c7 }
        if (r1 == 0) goto L_0x0050;
    L_0x0012:
        r1 = r0.slideable;	 Catch:{ IllegalStateException -> 0x00c9 }
        if (r1 != 0) goto L_0x0050;
    L_0x0016:
        r1 = r7.mSlideableView;	 Catch:{ IllegalStateException -> 0x00cb }
        if (r1 == 0) goto L_0x0050;
    L_0x001a:
        r1 = r7.mTmpRect;	 Catch:{ IllegalStateException -> 0x00cd }
        r8.getClipBounds(r1);	 Catch:{ IllegalStateException -> 0x00cd }
        r1 = r7.isLayoutRtlSupport();	 Catch:{ IllegalStateException -> 0x00cd }
        if (r1 == 0) goto L_0x0039;
    L_0x0025:
        r1 = r7.mTmpRect;	 Catch:{ IllegalStateException -> 0x00cf }
        r5 = r7.mTmpRect;	 Catch:{ IllegalStateException -> 0x00cf }
        r5 = r5.left;	 Catch:{ IllegalStateException -> 0x00cf }
        r6 = r7.mSlideableView;	 Catch:{ IllegalStateException -> 0x00cf }
        r6 = r6.getRight();	 Catch:{ IllegalStateException -> 0x00cf }
        r5 = java.lang.Math.max(r5, r6);	 Catch:{ IllegalStateException -> 0x00cf }
        r1.left = r5;	 Catch:{ IllegalStateException -> 0x00cf }
        if (r3 == 0) goto L_0x004b;
    L_0x0039:
        r1 = r7.mTmpRect;	 Catch:{ IllegalStateException -> 0x00cf }
        r5 = r7.mTmpRect;	 Catch:{ IllegalStateException -> 0x00cf }
        r5 = r5.right;	 Catch:{ IllegalStateException -> 0x00cf }
        r6 = r7.mSlideableView;	 Catch:{ IllegalStateException -> 0x00cf }
        r6 = r6.getLeft();	 Catch:{ IllegalStateException -> 0x00cf }
        r5 = java.lang.Math.min(r5, r6);	 Catch:{ IllegalStateException -> 0x00cf }
        r1.right = r5;	 Catch:{ IllegalStateException -> 0x00cf }
    L_0x004b:
        r1 = r7.mTmpRect;
        r8.clipRect(r1);
    L_0x0050:
        r1 = android.os.Build.VERSION.SDK_INT;
        r5 = 11;
        if (r1 < r5) goto L_0x005c;
    L_0x0056:
        r1 = super.drawChild(r8, r9, r10);
        if (r3 == 0) goto L_0x00db;
    L_0x005c:
        r1 = r0.dimWhenOffset;	 Catch:{ IllegalStateException -> 0x00d1 }
        if (r1 == 0) goto L_0x00b5;
    L_0x0060:
        r1 = r7.mSlideOffset;	 Catch:{ IllegalStateException -> 0x00d3 }
        r5 = 0;
        r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r1 <= 0) goto L_0x00b5;
    L_0x0067:
        r1 = r9.isDrawingCacheEnabled();	 Catch:{ IllegalStateException -> 0x00d5 }
        if (r1 != 0) goto L_0x0071;
    L_0x006d:
        r1 = 1;
        r9.setDrawingCacheEnabled(r1);	 Catch:{ IllegalStateException -> 0x00d5 }
    L_0x0071:
        r1 = r9.getDrawingCache();
        if (r1 == 0) goto L_0x0088;
    L_0x0077:
        r5 = r9.getLeft();
        r5 = (float) r5;
        r6 = r9.getTop();
        r6 = (float) r6;
        r0 = r0.dimPaint;
        r8.drawBitmap(r1, r5, r6, r0);
        if (r3 == 0) goto L_0x00d9;
    L_0x0088:
        r0 = z;
        r1 = 6;
        r0 = r0[r1];
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r5 = 4;
        r2 = r2[r5];
        r1 = r1.append(r2);
        r1 = r1.append(r9);
        r2 = z;
        r5 = 5;
        r2 = r2[r5];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.e(r0, r1);
        r0 = super.drawChild(r8, r9, r10);
    L_0x00b3:
        if (r3 == 0) goto L_0x00c3;
    L_0x00b5:
        r0 = r9.isDrawingCacheEnabled();	 Catch:{ IllegalStateException -> 0x00d7 }
        if (r0 == 0) goto L_0x00bf;
    L_0x00bb:
        r0 = 0;
        r9.setDrawingCacheEnabled(r0);	 Catch:{ IllegalStateException -> 0x00d7 }
    L_0x00bf:
        r0 = super.drawChild(r8, r9, r10);
    L_0x00c3:
        r8.restoreToCount(r4);
        return r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d3 }
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d5 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r0 = r2;
        goto L_0x00b3;
    L_0x00db:
        r0 = r1;
        goto L_0x00c3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    void dispatchOnPanelClosed(View view) {
        try {
            if (this.mPanelSlideListener != null) {
                this.mPanelSlideListener.onPanelClosed(view);
            }
            sendAccessibilityEvent(32);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSliderFadeColor = -858993460;
        this.mFirstLayout = true;
        this.mTmpRect = new Rect();
        this.mPostedRunnables = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        this.mOverhangSize = (int) ((32.0f * f) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate(this));
        ViewCompat.setImportantForAccessibility(this, 1);
        this.mDragHelper = ViewDragHelper.create(this, 0.5f, new DragHelperCallback(this, null));
        this.mDragHelper.setMinVelocity(f * 400.0f);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    static boolean access$100(SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mIsUnableToDrag;
    }

    static float access$300(SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mSlideOffset;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
        r19 = this;
        r10 = android.support.v4.widget.CursorAdapter.a;
        r11 = r19.isLayoutRtlSupport();
        if (r11 == 0) goto L_0x0012;
    L_0x0008:
        r0 = r19;
        r2 = r0.mDragHelper;	 Catch:{ IllegalStateException -> 0x0157 }
        r3 = 2;
        r2.setEdgeTrackingEnabled(r3);	 Catch:{ IllegalStateException -> 0x0157 }
        if (r10 == 0) goto L_0x001a;
    L_0x0012:
        r0 = r19;
        r2 = r0.mDragHelper;	 Catch:{ IllegalStateException -> 0x0157 }
        r3 = 1;
        r2.setEdgeTrackingEnabled(r3);	 Catch:{ IllegalStateException -> 0x0157 }
    L_0x001a:
        r12 = r23 - r21;
        if (r11 == 0) goto L_0x015b;
    L_0x001e:
        r2 = r19.getPaddingRight();	 Catch:{ IllegalStateException -> 0x0159 }
    L_0x0022:
        if (r11 == 0) goto L_0x0163;
    L_0x0024:
        r3 = r19.getPaddingLeft();	 Catch:{ IllegalStateException -> 0x0161 }
    L_0x0028:
        r13 = r19.getPaddingTop();
        r14 = r19.getChildCount();
        r0 = r19;
        r4 = r0.mFirstLayout;	 Catch:{ IllegalStateException -> 0x0169 }
        if (r4 == 0) goto L_0x0048;
    L_0x0036:
        r0 = r19;
        r4 = r0.mCanSlide;	 Catch:{ IllegalStateException -> 0x016b }
        if (r4 == 0) goto L_0x016f;
    L_0x003c:
        r0 = r19;
        r4 = r0.mPreservedOpenState;	 Catch:{ IllegalStateException -> 0x016d }
        if (r4 == 0) goto L_0x016f;
    L_0x0042:
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0044:
        r0 = r19;
        r0.mSlideOffset = r4;
    L_0x0048:
        r4 = 0;
        r9 = r4;
        r7 = r2;
        r8 = r2;
    L_0x004c:
        if (r9 >= r14) goto L_0x00f5;
    L_0x004e:
        r0 = r19;
        r15 = r0.getChildAt(r9);
        r2 = r15.getVisibility();	 Catch:{ IllegalStateException -> 0x0172 }
        r4 = 8;
        if (r2 != r4) goto L_0x005e;
    L_0x005c:
        if (r10 == 0) goto L_0x0197;
    L_0x005e:
        r2 = r15.getLayoutParams();
        r2 = (android.support.v4.widget.SlidingPaneLayout.LayoutParams) r2;
        r16 = r15.getMeasuredWidth();
        r6 = 0;
        r4 = r2.slideable;
        if (r4 == 0) goto L_0x00b7;
    L_0x006d:
        r4 = r2.leftMargin;
        r5 = r2.rightMargin;
        r4 = r4 + r5;
        r5 = r12 - r3;
        r0 = r19;
        r0 = r0.mOverhangSize;
        r17 = r0;
        r5 = r5 - r17;
        r5 = java.lang.Math.min(r7, r5);
        r5 = r5 - r8;
        r17 = r5 - r4;
        r0 = r17;
        r1 = r19;
        r1.mSlideRange = r0;	 Catch:{ IllegalStateException -> 0x0174 }
        if (r11 == 0) goto L_0x0176;
    L_0x008b:
        r4 = r2.rightMargin;	 Catch:{ IllegalStateException -> 0x0174 }
    L_0x008d:
        r5 = r8 + r4;
        r5 = r5 + r17;
        r18 = r16 / 2;
        r5 = r5 + r18;
        r18 = r12 - r3;
        r0 = r18;
        if (r5 <= r0) goto L_0x017c;
    L_0x009b:
        r5 = 1;
    L_0x009c:
        r2.dimWhenOffset = r5;
        r0 = r17;
        r2 = (float) r0;
        r0 = r19;
        r5 = r0.mSlideOffset;
        r2 = r2 * r5;
        r2 = (int) r2;
        r4 = r4 + r2;
        r5 = r8 + r4;
        r2 = (float) r2;
        r0 = r19;
        r4 = r0.mSlideRange;	 Catch:{ IllegalStateException -> 0x017f }
        r4 = (float) r4;	 Catch:{ IllegalStateException -> 0x017f }
        r2 = r2 / r4;
        r0 = r19;
        r0.mSlideOffset = r2;	 Catch:{ IllegalStateException -> 0x017f }
        if (r10 == 0) goto L_0x00d5;
    L_0x00b7:
        r0 = r19;
        r2 = r0.mCanSlide;	 Catch:{ IllegalStateException -> 0x0181 }
        if (r2 == 0) goto L_0x0194;
    L_0x00bd:
        r0 = r19;
        r2 = r0.mParallaxBy;	 Catch:{ IllegalStateException -> 0x0181 }
        if (r2 == 0) goto L_0x0194;
    L_0x00c3:
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r19;
        r4 = r0.mSlideOffset;
        r2 = r2 - r4;
        r0 = r19;
        r4 = r0.mParallaxBy;
        r4 = (float) r4;
        r2 = r2 * r4;
        r2 = (int) r2;
        if (r10 == 0) goto L_0x0190;
    L_0x00d3:
        r6 = r2;
        r5 = r7;
    L_0x00d5:
        if (r11 == 0) goto L_0x00df;
    L_0x00d7:
        r2 = r12 - r5;
        r4 = r2 + r6;
        r2 = r4 - r16;
        if (r10 == 0) goto L_0x00e3;
    L_0x00df:
        r2 = r5 - r6;
        r4 = r2 + r16;
    L_0x00e3:
        r6 = r15.getMeasuredHeight();
        r6 = r6 + r13;
        r15.layout(r2, r13, r4, r6);
        r2 = r15.getWidth();
        r2 = r2 + r7;
        r4 = r5;
    L_0x00f1:
        r5 = r9 + 1;
        if (r10 == 0) goto L_0x018b;
    L_0x00f5:
        r0 = r19;
        r2 = r0.mFirstLayout;	 Catch:{ IllegalStateException -> 0x0183 }
        if (r2 == 0) goto L_0x0151;
    L_0x00fb:
        r0 = r19;
        r2 = r0.mCanSlide;	 Catch:{ IllegalStateException -> 0x0185 }
        if (r2 == 0) goto L_0x0131;
    L_0x0101:
        r0 = r19;
        r2 = r0.mParallaxBy;	 Catch:{ IllegalStateException -> 0x0187 }
        if (r2 == 0) goto L_0x0110;
    L_0x0107:
        r0 = r19;
        r2 = r0.mSlideOffset;	 Catch:{ IllegalStateException -> 0x0187 }
        r0 = r19;
        r0.parallaxOtherViews(r2);	 Catch:{ IllegalStateException -> 0x0187 }
    L_0x0110:
        r0 = r19;
        r2 = r0.mSlideableView;	 Catch:{ IllegalStateException -> 0x0189 }
        r2 = r2.getLayoutParams();	 Catch:{ IllegalStateException -> 0x0189 }
        r2 = (android.support.v4.widget.SlidingPaneLayout.LayoutParams) r2;	 Catch:{ IllegalStateException -> 0x0189 }
        r2 = r2.dimWhenOffset;	 Catch:{ IllegalStateException -> 0x0189 }
        if (r2 == 0) goto L_0x0148;
    L_0x011e:
        r0 = r19;
        r2 = r0.mSlideableView;	 Catch:{ IllegalStateException -> 0x0189 }
        r0 = r19;
        r3 = r0.mSlideOffset;	 Catch:{ IllegalStateException -> 0x0189 }
        r0 = r19;
        r4 = r0.mSliderFadeColor;	 Catch:{ IllegalStateException -> 0x0189 }
        r0 = r19;
        r0.dimChildView(r2, r3, r4);	 Catch:{ IllegalStateException -> 0x0189 }
        if (r10 == 0) goto L_0x0148;
    L_0x0131:
        r2 = 0;
    L_0x0132:
        if (r2 >= r14) goto L_0x0148;
    L_0x0134:
        r0 = r19;
        r3 = r0.getChildAt(r2);
        r4 = 0;
        r0 = r19;
        r5 = r0.mSliderFadeColor;
        r0 = r19;
        r0.dimChildView(r3, r4, r5);
        r2 = r2 + 1;
        if (r10 == 0) goto L_0x0132;
    L_0x0148:
        r0 = r19;
        r2 = r0.mSlideableView;
        r0 = r19;
        r0.updateObscuredViewsVisibility(r2);
    L_0x0151:
        r2 = 0;
        r0 = r19;
        r0.mFirstLayout = r2;
        return;
    L_0x0157:
        r2 = move-exception;
        throw r2;
    L_0x0159:
        r2 = move-exception;
        throw r2;
    L_0x015b:
        r2 = r19.getPaddingLeft();
        goto L_0x0022;
    L_0x0161:
        r2 = move-exception;
        throw r2;
    L_0x0163:
        r3 = r19.getPaddingRight();
        goto L_0x0028;
    L_0x0169:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x016b }
    L_0x016b:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x016d }
    L_0x016d:
        r2 = move-exception;
        throw r2;
    L_0x016f:
        r4 = 0;
        goto L_0x0044;
    L_0x0172:
        r2 = move-exception;
        throw r2;
    L_0x0174:
        r2 = move-exception;
        throw r2;
    L_0x0176:
        r4 = r2.leftMargin;
        goto L_0x008d;
    L_0x017a:
        r2 = move-exception;
        throw r2;
    L_0x017c:
        r5 = 0;
        goto L_0x009c;
    L_0x017f:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0181 }
    L_0x0181:
        r2 = move-exception;
        throw r2;
    L_0x0183:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0185 }
    L_0x0185:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0187 }
    L_0x0187:
        r2 = move-exception;
        throw r2;
    L_0x0189:
        r2 = move-exception;
        throw r2;
    L_0x018b:
        r9 = r5;
        r7 = r2;
        r8 = r4;
        goto L_0x004c;
    L_0x0190:
        r6 = r2;
        r5 = r7;
        goto L_0x00d5;
    L_0x0194:
        r2 = r6;
        goto L_0x00d3;
    L_0x0197:
        r2 = r7;
        r4 = r8;
        goto L_0x00f1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            super.onSizeChanged(i, i2, i3, i4);
            if (i != i3) {
                this.mFirstLayout = true;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
        /*
        r1 = this;
        r2 = (android.support.v4.widget.SlidingPaneLayout.SavedState) r2;
        r0 = r2.getSuperState();	 Catch:{ IllegalStateException -> 0x001c }
        super.onRestoreInstanceState(r0);	 Catch:{ IllegalStateException -> 0x001c }
        r0 = r2.isOpen;	 Catch:{ IllegalStateException -> 0x001c }
        if (r0 == 0) goto L_0x0014;
    L_0x000d:
        r1.openPane();	 Catch:{ IllegalStateException -> 0x001e }
        r0 = android.support.v4.widget.CursorAdapter.a;	 Catch:{ IllegalStateException -> 0x001e }
        if (r0 == 0) goto L_0x0017;
    L_0x0014:
        r1.closePane();	 Catch:{ IllegalStateException -> 0x001e }
    L_0x0017:
        r0 = r2.isOpen;
        r1.mPreservedOpenState = r0;
        return;
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onRestoreInstanceState(android.os.Parcelable):void");
    }

    void dispatchOnPanelOpened(View view) {
        try {
            if (this.mPanelSlideListener != null) {
                this.mPanelSlideListener.onPanelOpened(view);
            }
            sendAccessibilityEvent(32);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void dimChildView(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (16777215 & i);
            try {
                if (layoutParams.dimPaint == null) {
                    layoutParams.dimPaint = new Paint();
                }
                try {
                    layoutParams.dimPaint.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
                    if (ViewCompat.getLayerType(view) != 2) {
                        ViewCompat.setLayerType(view, 2, layoutParams.dimPaint);
                    }
                    try {
                        invalidateChildRegion(view);
                        if (CursorAdapter.a == 0) {
                            return;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
        if (ViewCompat.getLayerType(view) != 0) {
            try {
                if (layoutParams.dimPaint != null) {
                    layoutParams.dimPaint.setColorFilter(null);
                }
                Runnable disableLayerRunnable = new DisableLayerRunnable(this, view);
                this.mPostedRunnables.add(disableLayerRunnable);
                ViewCompat.postOnAnimation(this, disableLayerRunnable);
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            if (layoutParams instanceof LayoutParams) {
                if (super.checkLayoutParams(layoutParams)) {
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

    static int access$800(SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mSlideRange;
    }

    public void computeScroll() {
        try {
            if (!this.mDragHelper.continueSettling(true)) {
                return;
            }
            if (this.mCanSlide) {
                ViewCompat.postInvalidateOnAnimation(this);
            } else {
                this.mDragHelper.abort();
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private boolean isLayoutRtlSupport() {
        try {
            return ViewCompat.getLayoutDirection(this) == 1;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        View childAt;
        int i = CursorAdapter.a;
        super.draw(canvas);
        if (isLayoutRtlSupport()) {
            Drawable drawable2 = this.mShadowDrawableRight;
            if (i == 0) {
                drawable = drawable2;
                if (getChildCount() <= 1) {
                    childAt = getChildAt(1);
                } else {
                    childAt = null;
                }
                if (childAt != null && drawable != null) {
                    int i2;
                    int i3;
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    if (isLayoutRtlSupport()) {
                        int right = childAt.getRight();
                        i2 = right + intrinsicWidth;
                        if (i == 0) {
                            i3 = i2;
                            i2 = right;
                            drawable.setBounds(i2, top, i3, bottom);
                            drawable.draw(canvas);
                            return;
                        }
                    }
                    i3 = childAt.getLeft();
                    i2 = i3 - intrinsicWidth;
                    drawable.setBounds(i2, top, i3, bottom);
                    drawable.draw(canvas);
                    return;
                }
            }
        }
        drawable = this.mShadowDrawableLeft;
        try {
            if (getChildCount() <= 1) {
                childAt = null;
            } else {
                childAt = getChildAt(1);
            }
            if (childAt != null) {
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean isOpen() {
        try {
            if (this.mCanSlide) {
                if (this.mSlideOffset != 1.0f) {
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

    private void parallaxOtherViews(float f) {
        int i = CursorAdapter.a;
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        try {
            Object obj;
            int childCount;
            int i2;
            View childAt;
            int i3;
            if (layoutParams.dimWhenOffset) {
                int i4;
                if (isLayoutRtlSupport) {
                    i4 = layoutParams.rightMargin;
                } else {
                    i4 = layoutParams.leftMargin;
                }
                if (i4 <= 0) {
                    obj = 1;
                    childCount = getChildCount();
                    i2 = 0;
                    while (i2 < childCount) {
                        childAt = getChildAt(i2);
                        try {
                            if (childAt != this.mSlideableView) {
                                i3 = (int) ((1.0f - this.mParallaxOffset) * ((float) this.mParallaxBy));
                                this.mParallaxOffset = f;
                                i3 -= (int) ((1.0f - f) * ((float) this.mParallaxBy));
                                if (isLayoutRtlSupport) {
                                    i3 = -i3;
                                }
                                try {
                                    childAt.offsetLeftAndRight(i3);
                                    if (obj != null) {
                                        dimChildView(childAt, isLayoutRtlSupport ? this.mParallaxOffset - 1.0f : 1.0f - this.mParallaxOffset, this.mCoveredFadeColor);
                                    }
                                } catch (IllegalStateException e) {
                                    throw e;
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            }
                            i3 = i2 + 1;
                            if (i != 0) {
                                i2 = i3;
                            } else {
                                return;
                            }
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    }
                }
            }
            obj = null;
            childCount = getChildCount();
            i2 = 0;
            while (i2 < childCount) {
                childAt = getChildAt(i2);
                if (childAt != this.mSlideableView) {
                    i3 = (int) ((1.0f - this.mParallaxOffset) * ((float) this.mParallaxBy));
                    this.mParallaxOffset = f;
                    i3 -= (int) ((1.0f - f) * ((float) this.mParallaxBy));
                    if (isLayoutRtlSupport) {
                        i3 = -i3;
                    }
                    childAt.offsetLeftAndRight(i3);
                    if (obj != null) {
                        if (isLayoutRtlSupport) {
                        }
                        dimChildView(childAt, isLayoutRtlSupport ? this.mParallaxOffset - 1.0f : 1.0f - this.mParallaxOffset, this.mCoveredFadeColor);
                    }
                }
                i3 = i2 + 1;
                if (i != 0) {
                    i2 = i3;
                } else {
                    return;
                }
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    boolean smoothSlideTo(float f, int i) {
        try {
            if (!this.mCanSlide) {
                return false;
            }
            int i2;
            LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
            if (isLayoutRtlSupport()) {
                int width = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (((float) this.mSlideRange) * f)) + ((float) this.mSlideableView.getWidth())));
                if (CursorAdapter.a == 0) {
                    i2 = width;
                    if (this.mDragHelper.smoothSlideViewTo(this.mSlideableView, i2, this.mSlideableView.getTop())) {
                        return false;
                    }
                    setAllChildrenVisible();
                    ViewCompat.postInvalidateOnAnimation(this);
                    return true;
                }
            }
            i2 = (int) (((float) (layoutParams.leftMargin + getPaddingLeft())) + (((float) this.mSlideRange) * f));
            try {
                if (this.mDragHelper.smoothSlideViewTo(this.mSlideableView, i2, this.mSlideableView.getTop())) {
                    return false;
                }
                setAllChildrenVisible();
                ViewCompat.postInvalidateOnAnimation(this);
                return true;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static View access$400(SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.mSlideableView;
    }

    protected void onDetachedFromWindow() {
        int i = CursorAdapter.a;
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        int size = this.mPostedRunnables.size();
        int i2 = 0;
        while (i2 < size) {
            ((DisableLayerRunnable) this.mPostedRunnables.get(i2)).run();
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        this.mPostedRunnables.clear();
    }

    static boolean access$502(SlidingPaneLayout slidingPaneLayout, boolean z) {
        slidingPaneLayout.mPreservedOpenState = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r19, int r20) {
        /*
        r18 = this;
        r13 = android.support.v4.widget.CursorAdapter.a;
        r4 = android.view.View.MeasureSpec.getMode(r19);
        r3 = android.view.View.MeasureSpec.getSize(r19);
        r2 = android.view.View.MeasureSpec.getMode(r20);
        r1 = android.view.View.MeasureSpec.getSize(r20);
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r4 == r5) goto L_0x0039;
    L_0x0016:
        r5 = r18.isInEditMode();	 Catch:{ IllegalStateException -> 0x0037 }
        if (r5 == 0) goto L_0x002a;
    L_0x001c:
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r4 != r5) goto L_0x0024;
    L_0x0020:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 == 0) goto L_0x0058;
    L_0x0024:
        if (r4 != 0) goto L_0x0058;
    L_0x0026:
        r3 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r13 == 0) goto L_0x0058;
    L_0x002a:
        r1 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0035 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0035 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0035 }
        r1.<init>(r2);	 Catch:{ IllegalStateException -> 0x0035 }
        throw r1;	 Catch:{ IllegalStateException -> 0x0035 }
    L_0x0035:
        r1 = move-exception;
        throw r1;
    L_0x0037:
        r1 = move-exception;
        throw r1;
    L_0x0039:
        if (r2 != 0) goto L_0x0058;
    L_0x003b:
        r4 = r18.isInEditMode();	 Catch:{ IllegalStateException -> 0x0056 }
        if (r4 == 0) goto L_0x0049;
    L_0x0041:
        if (r2 != 0) goto L_0x0058;
    L_0x0043:
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r1 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r13 == 0) goto L_0x0058;
    L_0x0049:
        r1 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0054 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0054 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0054 }
        r1.<init>(r2);	 Catch:{ IllegalStateException -> 0x0054 }
        throw r1;	 Catch:{ IllegalStateException -> 0x0054 }
    L_0x0054:
        r1 = move-exception;
        throw r1;
    L_0x0056:
        r1 = move-exception;
        throw r1;
    L_0x0058:
        r11 = r2;
        r12 = r3;
        r3 = r1;
        r1 = 0;
        r2 = -1;
        switch(r11) {
            case -2147483648: goto L_0x021f;
            case 1073741824: goto L_0x0212;
            default: goto L_0x0060;
        };
    L_0x0060:
        r4 = 0;
        r8 = 0;
        r3 = r18.getPaddingLeft();
        r3 = r12 - r3;
        r5 = r18.getPaddingRight();
        r10 = r3 - r5;
        r14 = r18.getChildCount();
        r3 = 2;
        if (r14 <= r3) goto L_0x0082;
    L_0x0075:
        r3 = z;	 Catch:{ IllegalStateException -> 0x022c }
        r5 = 0;
        r3 = r3[r5];	 Catch:{ IllegalStateException -> 0x022c }
        r5 = z;	 Catch:{ IllegalStateException -> 0x022c }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x022c }
        android.util.Log.e(r3, r5);	 Catch:{ IllegalStateException -> 0x022c }
    L_0x0082:
        r3 = 0;
        r0 = r18;
        r0.mSlideableView = r3;
        r3 = 0;
        r9 = r3;
        r7 = r10;
        r6 = r1;
        r3 = r4;
    L_0x008c:
        if (r9 >= r14) goto L_0x0308;
    L_0x008e:
        r0 = r18;
        r15 = r0.getChildAt(r9);
        r1 = r15.getLayoutParams();
        r1 = (android.support.v4.widget.SlidingPaneLayout.LayoutParams) r1;
        r4 = r15.getVisibility();	 Catch:{ IllegalStateException -> 0x022e }
        r5 = 8;
        if (r4 != r5) goto L_0x00a7;
    L_0x00a2:
        r4 = 0;
        r1.dimWhenOffset = r4;	 Catch:{ IllegalStateException -> 0x0230 }
        if (r13 == 0) goto L_0x0303;
    L_0x00a7:
        r4 = r1.weight;	 Catch:{ IllegalStateException -> 0x0230 }
        r5 = 0;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 <= 0) goto L_0x0234;
    L_0x00ae:
        r4 = r1.weight;
        r3 = r3 + r4;
        r4 = r1.width;	 Catch:{ IllegalStateException -> 0x0232 }
        if (r4 != 0) goto L_0x0234;
    L_0x00b5:
        r1 = r7;
        r4 = r3;
        r3 = r8;
    L_0x00b8:
        r5 = r9 + 1;
        if (r13 == 0) goto L_0x02f5;
    L_0x00bc:
        r7 = r3;
        r8 = r4;
        r9 = r6;
        r6 = r1;
    L_0x00c0:
        if (r7 != 0) goto L_0x00c7;
    L_0x00c2:
        r1 = 0;
        r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x01eb;
    L_0x00c7:
        r0 = r18;
        r1 = r0.mOverhangSize;
        r11 = r10 - r1;
        r1 = 0;
        r5 = r1;
    L_0x00cf:
        if (r5 >= r14) goto L_0x01eb;
    L_0x00d1:
        r0 = r18;
        r15 = r0.getChildAt(r5);
        r1 = r15.getVisibility();	 Catch:{ IllegalStateException -> 0x02c5 }
        r3 = 8;
        if (r1 != r3) goto L_0x00e1;
    L_0x00df:
        if (r13 == 0) goto L_0x01e7;
    L_0x00e1:
        r1 = r15.getLayoutParams();
        r1 = (android.support.v4.widget.SlidingPaneLayout.LayoutParams) r1;
        r3 = r15.getVisibility();	 Catch:{ IllegalStateException -> 0x02c7 }
        r4 = 8;
        if (r3 != r4) goto L_0x00f1;
    L_0x00ef:
        if (r13 == 0) goto L_0x01e7;
    L_0x00f1:
        r3 = r1.width;	 Catch:{ IllegalStateException -> 0x02cb }
        if (r3 != 0) goto L_0x02cf;
    L_0x00f5:
        r3 = r1.weight;	 Catch:{ IllegalStateException -> 0x02cd }
        r4 = 0;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x02cf;
    L_0x00fc:
        r3 = 1;
    L_0x00fd:
        if (r3 == 0) goto L_0x02d2;
    L_0x00ff:
        r4 = 0;
    L_0x0100:
        if (r7 == 0) goto L_0x0167;
    L_0x0102:
        r0 = r18;
        r0 = r0.mSlideableView;	 Catch:{ IllegalStateException -> 0x02d8 }
        r16 = r0;
        r0 = r16;
        if (r15 == r0) goto L_0x0167;
    L_0x010c:
        r0 = r1.width;	 Catch:{ IllegalStateException -> 0x02da }
        r16 = r0;
        if (r16 >= 0) goto L_0x01e7;
    L_0x0112:
        if (r4 > r11) goto L_0x011e;
    L_0x0114:
        r0 = r1.weight;	 Catch:{ IllegalStateException -> 0x02de }
        r16 = r0;
        r17 = 0;
        r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1));
        if (r16 <= 0) goto L_0x01e7;
    L_0x011e:
        if (r3 == 0) goto L_0x014c;
    L_0x0120:
        r3 = r1.height;	 Catch:{ IllegalStateException -> 0x02e0 }
        r16 = -2;
        r0 = r16;
        if (r3 != r0) goto L_0x0130;
    L_0x0128:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);
        if (r13 == 0) goto L_0x0158;
    L_0x0130:
        r3 = r1.height;	 Catch:{ IllegalStateException -> 0x02e2 }
        r16 = -1;
        r0 = r16;
        if (r3 != r0) goto L_0x0140;
    L_0x0138:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);
        if (r13 == 0) goto L_0x0158;
    L_0x0140:
        r3 = r1.height;
        r16 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r16;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0);
        if (r13 == 0) goto L_0x0158;
    L_0x014c:
        r3 = r15.getMeasuredHeight();
        r16 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r16;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0);
    L_0x0158:
        r16 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r16;
        r16 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r0);
        r0 = r16;
        r15.measure(r0, r3);	 Catch:{ IllegalStateException -> 0x02e4 }
        if (r13 == 0) goto L_0x01e7;
    L_0x0167:
        r3 = r1.weight;	 Catch:{ IllegalStateException -> 0x02e6 }
        r16 = 0;
        r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1));
        if (r3 <= 0) goto L_0x01e7;
    L_0x016f:
        r3 = r1.width;	 Catch:{ IllegalStateException -> 0x02e8 }
        if (r3 != 0) goto L_0x019f;
    L_0x0173:
        r3 = r1.height;	 Catch:{ IllegalStateException -> 0x02e8 }
        r16 = -2;
        r0 = r16;
        if (r3 != r0) goto L_0x0183;
    L_0x017b:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);
        if (r13 == 0) goto L_0x01ab;
    L_0x0183:
        r3 = r1.height;	 Catch:{ IllegalStateException -> 0x02ea }
        r16 = -1;
        r0 = r16;
        if (r3 != r0) goto L_0x0193;
    L_0x018b:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);
        if (r13 == 0) goto L_0x01ab;
    L_0x0193:
        r3 = r1.height;
        r16 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r16;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0);
        if (r13 == 0) goto L_0x01ab;
    L_0x019f:
        r3 = r15.getMeasuredHeight();
        r16 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r16;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0);
    L_0x01ab:
        if (r7 == 0) goto L_0x01ca;
    L_0x01ad:
        r0 = r1.leftMargin;
        r16 = r0;
        r0 = r1.rightMargin;
        r17 = r0;
        r16 = r16 + r17;
        r16 = r10 - r16;
        r17 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r17 = android.view.View.MeasureSpec.makeMeasureSpec(r16, r17);
        r0 = r16;
        if (r4 == r0) goto L_0x01c8;
    L_0x01c3:
        r0 = r17;
        r15.measure(r0, r3);	 Catch:{ IllegalStateException -> 0x02ec }
    L_0x01c8:
        if (r13 == 0) goto L_0x01e7;
    L_0x01ca:
        r16 = 0;
        r0 = r16;
        r16 = java.lang.Math.max(r0, r6);
        r1 = r1.weight;
        r0 = r16;
        r0 = (float) r0;
        r16 = r0;
        r1 = r1 * r16;
        r1 = r1 / r8;
        r1 = (int) r1;
        r1 = r1 + r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r4);
        r15.measure(r1, r3);
    L_0x01e7:
        r1 = r5 + 1;
        if (r13 == 0) goto L_0x02f2;
    L_0x01eb:
        r1 = r18.getPaddingTop();
        r1 = r1 + r9;
        r2 = r18.getPaddingBottom();
        r1 = r1 + r2;
        r0 = r18;
        r0.setMeasuredDimension(r12, r1);	 Catch:{ IllegalStateException -> 0x02ee }
        r0 = r18;
        r0.mCanSlide = r7;	 Catch:{ IllegalStateException -> 0x02ee }
        r0 = r18;
        r1 = r0.mDragHelper;	 Catch:{ IllegalStateException -> 0x02ee }
        r1 = r1.getViewDragState();	 Catch:{ IllegalStateException -> 0x02ee }
        if (r1 == 0) goto L_0x0211;
    L_0x0208:
        if (r7 != 0) goto L_0x0211;
    L_0x020a:
        r0 = r18;
        r1 = r0.mDragHelper;	 Catch:{ IllegalStateException -> 0x02f0 }
        r1.abort();	 Catch:{ IllegalStateException -> 0x02f0 }
    L_0x0211:
        return;
    L_0x0212:
        r1 = r18.getPaddingTop();
        r1 = r3 - r1;
        r2 = r18.getPaddingBottom();
        r1 = r1 - r2;
        if (r13 == 0) goto L_0x030e;
    L_0x021f:
        r2 = r18.getPaddingTop();
        r2 = r3 - r2;
        r3 = r18.getPaddingBottom();
        r2 = r2 - r3;
        goto L_0x0060;
    L_0x022c:
        r1 = move-exception;
        throw r1;
    L_0x022e:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0230 }
    L_0x0230:
        r1 = move-exception;
        throw r1;
    L_0x0232:
        r1 = move-exception;
        throw r1;
    L_0x0234:
        r4 = r1.leftMargin;
        r5 = r1.rightMargin;
        r5 = r5 + r4;
        r4 = r1.width;
        r16 = -2;
        r0 = r16;
        if (r4 != r0) goto L_0x024d;
    L_0x0241:
        r4 = r10 - r5;
        r16 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = r16;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0);
        if (r13 == 0) goto L_0x0267;
    L_0x024d:
        r4 = r1.width;	 Catch:{ IllegalStateException -> 0x02bd }
        r16 = -1;
        r0 = r16;
        if (r4 != r0) goto L_0x025f;
    L_0x0255:
        r4 = r10 - r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5);
        if (r13 == 0) goto L_0x0267;
    L_0x025f:
        r4 = r1.width;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5);
    L_0x0267:
        r5 = r1.height;
        r16 = -2;
        r0 = r16;
        if (r5 != r0) goto L_0x0277;
    L_0x026f:
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5);
        if (r13 == 0) goto L_0x0291;
    L_0x0277:
        r5 = r1.height;	 Catch:{ IllegalStateException -> 0x02bf }
        r16 = -1;
        r0 = r16;
        if (r5 != r0) goto L_0x0287;
    L_0x027f:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5);
        if (r13 == 0) goto L_0x0291;
    L_0x0287:
        r5 = r1.height;
        r16 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r16;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0);
    L_0x0291:
        r15.measure(r4, r5);
        r5 = r15.getMeasuredWidth();
        r4 = r15.getMeasuredHeight();
        r16 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = r16;
        if (r11 != r0) goto L_0x0301;
    L_0x02a2:
        if (r4 <= r6) goto L_0x0301;
    L_0x02a4:
        r4 = java.lang.Math.min(r4, r2);
    L_0x02a8:
        r7 = r7 - r5;
        if (r7 >= 0) goto L_0x02c1;
    L_0x02ab:
        r5 = 1;
    L_0x02ac:
        r1.slideable = r5;
        r8 = r8 | r5;
        r1 = r1.slideable;	 Catch:{ IllegalStateException -> 0x02c3 }
        if (r1 == 0) goto L_0x02fb;
    L_0x02b3:
        r0 = r18;
        r0.mSlideableView = r15;	 Catch:{ IllegalStateException -> 0x02c3 }
        r1 = r7;
        r6 = r4;
        r4 = r3;
        r3 = r8;
        goto L_0x00b8;
    L_0x02bd:
        r1 = move-exception;
        throw r1;
    L_0x02bf:
        r1 = move-exception;
        throw r1;
    L_0x02c1:
        r5 = 0;
        goto L_0x02ac;
    L_0x02c3:
        r1 = move-exception;
        throw r1;
    L_0x02c5:
        r1 = move-exception;
        throw r1;
    L_0x02c7:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x02c9 }
    L_0x02c9:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x02cb }
    L_0x02cb:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x02cd }
    L_0x02cd:
        r1 = move-exception;
        throw r1;
    L_0x02cf:
        r3 = 0;
        goto L_0x00fd;
    L_0x02d2:
        r4 = r15.getMeasuredWidth();
        goto L_0x0100;
    L_0x02d8:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x02da }
    L_0x02da:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x02dc }
    L_0x02dc:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x02de }
    L_0x02de:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x02e0 }
    L_0x02e0:
        r1 = move-exception;
        throw r1;
    L_0x02e2:
        r1 = move-exception;
        throw r1;
    L_0x02e4:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x02e6 }
    L_0x02e6:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x02e8 }
    L_0x02e8:
        r1 = move-exception;
        throw r1;
    L_0x02ea:
        r1 = move-exception;
        throw r1;
    L_0x02ec:
        r1 = move-exception;
        throw r1;
    L_0x02ee:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x02f0 }
    L_0x02f0:
        r1 = move-exception;
        throw r1;
    L_0x02f2:
        r5 = r1;
        goto L_0x00cf;
    L_0x02f5:
        r9 = r5;
        r7 = r1;
        r8 = r3;
        r3 = r4;
        goto L_0x008c;
    L_0x02fb:
        r1 = r7;
        r6 = r4;
        r4 = r3;
        r3 = r8;
        goto L_0x00b8;
    L_0x0301:
        r4 = r6;
        goto L_0x02a8;
    L_0x0303:
        r1 = r7;
        r4 = r3;
        r3 = r8;
        goto L_0x00b8;
    L_0x0308:
        r9 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r3;
        goto L_0x00c0;
    L_0x030e:
        r2 = r1;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    public boolean isSlideable() {
        return this.mCanSlide;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r0 = r6.mCanSlide;	 Catch:{ IllegalStateException -> 0x0009 }
        if (r0 != 0) goto L_0x000b;
    L_0x0004:
        r0 = super.onTouchEvent(r7);	 Catch:{ IllegalStateException -> 0x0009 }
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r0 = r6.mDragHelper;
        r0.processTouchEvent(r7);
        r1 = r7.getAction();
        r0 = 1;
        r1 = r1 & 255;
        switch(r1) {
            case 0: goto L_0x001b;
            case 1: goto L_0x002b;
            default: goto L_0x001a;
        };
    L_0x001a:
        goto L_0x0008;
    L_0x001b:
        r1 = r7.getX();
        r2 = r7.getY();
        r6.mInitialMotionX = r1;	 Catch:{ IllegalStateException -> 0x0068 }
        r6.mInitialMotionY = r2;	 Catch:{ IllegalStateException -> 0x0068 }
        r1 = android.support.v4.widget.CursorAdapter.a;	 Catch:{ IllegalStateException -> 0x0068 }
        if (r1 == 0) goto L_0x0008;
    L_0x002b:
        r1 = r6.mSlideableView;	 Catch:{ IllegalStateException -> 0x0068 }
        r1 = r6.isDimmed(r1);	 Catch:{ IllegalStateException -> 0x0068 }
        if (r1 == 0) goto L_0x0008;
    L_0x0033:
        r1 = r7.getX();
        r2 = r7.getY();
        r3 = r6.mInitialMotionX;
        r3 = r1 - r3;
        r4 = r6.mInitialMotionY;
        r4 = r2 - r4;
        r5 = r6.mDragHelper;
        r5 = r5.getTouchSlop();
        r3 = r3 * r3;
        r4 = r4 * r4;
        r3 = r3 + r4;
        r4 = r5 * r5;
        r4 = (float) r4;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x0008;
    L_0x0053:
        r3 = r6.mDragHelper;	 Catch:{ IllegalStateException -> 0x0066 }
        r4 = r6.mSlideableView;	 Catch:{ IllegalStateException -> 0x0066 }
        r1 = (int) r1;	 Catch:{ IllegalStateException -> 0x0066 }
        r2 = (int) r2;	 Catch:{ IllegalStateException -> 0x0066 }
        r1 = r3.isViewUnder(r4, r1, r2);	 Catch:{ IllegalStateException -> 0x0066 }
        if (r1 == 0) goto L_0x0008;
    L_0x005f:
        r1 = r6.mSlideableView;	 Catch:{ IllegalStateException -> 0x0066 }
        r2 = 0;
        r6.closePane(r1, r2);	 Catch:{ IllegalStateException -> 0x0066 }
        goto L_0x0008;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean closePane() {
        return closePane(this.mSlideableView, 0);
    }

    static {
        String[] strArr = new String[7];
        String str = "*8<)|\u00173\u0005,{\u001c\u001844z\f ";
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
                        i3 = 121;
                        break;
                    case at.g /*1*/:
                        i3 = 84;
                        break;
                    case at.i /*2*/:
                        i3 = 85;
                        break;
                    case at.o /*3*/:
                        i3 = 77;
                        break;
                    default:
                        i3 = 21;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0016:\u0018(t\n!'(/Y\u0019:?pY =,{Y \"\"5\u001a<<!qY\"<(b\nt4?pY::95\n!%=z\u000b 0);";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "11<*}\rt88f\rt;\"aY60m@7\u0007\u0005\bV0\u0012\u001c\bQ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001d&4:V\u0011=9)/Y7=$y\u001dt#$p\u000et";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Y&09`\u000b:0)5\u0017!9!5\u001d&4:|\u00173u.t\u001a<0";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "*8<)|\u00173\u0005,{\u001c\u001844z\f ";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    int i4 = VERSION.SDK_INT;
                    if (i4 >= 17) {
                        try {
                            IMPL = new SlidingPanelLayoutImplJBMR1();
                            return;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    } else if (i4 >= 16) {
                        try {
                            IMPL = new SlidingPanelLayoutImplJB();
                            return;
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    } else {
                        IMPL = new SlidingPanelLayoutImplBase();
                        return;
                    }
                default:
                    strArr2[i] = str;
                    str = ".=19}Y9 >aY<4;pY5;mp\u00015695\u000f598pY;'mX8\u0000\u0016\u0005J)\u0015\u0007\b[-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r2 = 0;
        r1 = 1;
        r3 = android.support.v4.view.MotionEventCompat.getActionMasked(r8);
        r0 = r7.mCanSlide;	 Catch:{ IllegalStateException -> 0x0041 }
        if (r0 != 0) goto L_0x002d;
    L_0x000a:
        if (r3 != 0) goto L_0x002d;
    L_0x000c:
        r0 = r7.getChildCount();	 Catch:{ IllegalStateException -> 0x0043 }
        if (r0 <= r1) goto L_0x002d;
    L_0x0012:
        r0 = r7.getChildAt(r1);
        if (r0 == 0) goto L_0x002d;
    L_0x0018:
        r4 = r7.mDragHelper;	 Catch:{ IllegalStateException -> 0x0045 }
        r5 = r8.getX();	 Catch:{ IllegalStateException -> 0x0045 }
        r5 = (int) r5;	 Catch:{ IllegalStateException -> 0x0045 }
        r6 = r8.getY();	 Catch:{ IllegalStateException -> 0x0045 }
        r6 = (int) r6;	 Catch:{ IllegalStateException -> 0x0045 }
        r0 = r4.isViewUnder(r0, r5, r6);	 Catch:{ IllegalStateException -> 0x0045 }
        if (r0 != 0) goto L_0x0047;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r7.mPreservedOpenState = r0;
    L_0x002d:
        r0 = r7.mCanSlide;	 Catch:{ IllegalStateException -> 0x0049 }
        if (r0 == 0) goto L_0x0037;
    L_0x0031:
        r0 = r7.mIsUnableToDrag;	 Catch:{ IllegalStateException -> 0x004b }
        if (r0 == 0) goto L_0x004f;
    L_0x0035:
        if (r3 == 0) goto L_0x004f;
    L_0x0037:
        r0 = r7.mDragHelper;	 Catch:{ IllegalStateException -> 0x004d }
        r0.cancel();	 Catch:{ IllegalStateException -> 0x004d }
        r2 = super.onInterceptTouchEvent(r8);	 Catch:{ IllegalStateException -> 0x004d }
    L_0x0040:
        return r2;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = r2;
        goto L_0x002b;
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = 3;
        if (r3 == r0) goto L_0x0054;
    L_0x0052:
        if (r3 != r1) goto L_0x005c;
    L_0x0054:
        r0 = r7.mDragHelper;	 Catch:{ IllegalStateException -> 0x005a }
        r0.cancel();	 Catch:{ IllegalStateException -> 0x005a }
        goto L_0x0040;
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        switch(r3) {
            case 0: goto L_0x006c;
            case 1: goto L_0x005f;
            case 2: goto L_0x00c7;
            default: goto L_0x005f;
        };
    L_0x005f:
        r0 = r2;
    L_0x0060:
        r3 = r7.mDragHelper;
        r3 = r3.shouldInterceptTouchEvent(r8);
        if (r3 != 0) goto L_0x006a;
    L_0x0068:
        if (r0 == 0) goto L_0x0040;
    L_0x006a:
        r2 = r1;
        goto L_0x0040;
    L_0x006c:
        r7.mIsUnableToDrag = r2;
        r0 = r8.getX();
        r3 = r8.getY();
        r7.mInitialMotionX = r0;	 Catch:{ IllegalStateException -> 0x00c3 }
        r7.mInitialMotionY = r3;	 Catch:{ IllegalStateException -> 0x00c3 }
        r4 = r7.mDragHelper;	 Catch:{ IllegalStateException -> 0x00c3 }
        r5 = r7.mSlideableView;	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = (int) r0;	 Catch:{ IllegalStateException -> 0x00c3 }
        r3 = (int) r3;	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = r4.isViewUnder(r5, r0, r3);	 Catch:{ IllegalStateException -> 0x00c3 }
        if (r0 == 0) goto L_0x005f;
    L_0x0086:
        r0 = r7.mSlideableView;	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = r7.isDimmed(r0);	 Catch:{ IllegalStateException -> 0x00c3 }
        if (r0 == 0) goto L_0x005f;
    L_0x008e:
        r0 = android.support.v4.widget.CursorAdapter.a;
        if (r0 == 0) goto L_0x00c5;
    L_0x0092:
        r0 = r1;
    L_0x0093:
        r3 = r8.getX();
        r4 = r8.getY();
        r5 = r7.mInitialMotionX;
        r3 = r3 - r5;
        r3 = java.lang.Math.abs(r3);
        r5 = r7.mInitialMotionY;
        r4 = r4 - r5;
        r4 = java.lang.Math.abs(r4);
        r5 = r7.mDragHelper;
        r5 = r5.getTouchSlop();
        r5 = (float) r5;
        r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x0060;
    L_0x00b4:
        r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x0060;
    L_0x00b8:
        r0 = r7.mDragHelper;	 Catch:{ IllegalStateException -> 0x00c1 }
        r0.cancel();	 Catch:{ IllegalStateException -> 0x00c1 }
        r0 = 1;
        r7.mIsUnableToDrag = r0;	 Catch:{ IllegalStateException -> 0x00c1 }
        goto L_0x0040;
    L_0x00c1:
        r0 = move-exception;
        throw r0;
    L_0x00c3:
        r0 = move-exception;
        throw r0;
    L_0x00c5:
        r0 = r1;
        goto L_0x0060;
    L_0x00c7:
        r0 = r2;
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    static boolean access$700(SlidingPaneLayout slidingPaneLayout) {
        return slidingPaneLayout.isLayoutRtlSupport();
    }

    public boolean openPane() {
        return openPane(this.mSlideableView, 0);
    }

    private boolean openPane(View view, int i) {
        try {
            if (!this.mFirstLayout) {
                if (!smoothSlideTo(1.0f, i)) {
                    return false;
                }
            }
            this.mPreservedOpenState = true;
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void requestChildFocus(View view, View view2) {
        try {
            super.requestChildFocus(view, view2);
            if (!isInTouchMode()) {
                if (!this.mCanSlide) {
                    try {
                        boolean z;
                        if (view == this.mSlideableView) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.mPreservedOpenState = z;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private static boolean viewIsOpaque(View view) {
        try {
            if (ViewCompat.isOpaque(view)) {
                return true;
            }
            try {
                if (VERSION.SDK_INT >= 18) {
                    return false;
                }
                Drawable background = view.getBackground();
                if (background == null) {
                    return false;
                }
                try {
                    if (background.getOpacity() != -1) {
                        return false;
                    }
                    return true;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }
}
