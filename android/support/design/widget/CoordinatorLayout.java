package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.design.R;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.whatsapp.arj;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent {
    static final Class[] CONSTRUCTOR_PARAMS;
    static final CoordinatorLayoutInsetsHelper INSETS_HELPER;
    static final Comparator TOP_SORTED_CHILDREN_COMPARATOR;
    static final String WIDGET_PACKAGE_NAME;
    public static boolean a;
    static final ThreadLocal sConstructors;
    private static final String[] z;
    private View mBehaviorTouchView;
    private final List mDependencySortedChildren;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private WindowInsetsCompat mLastInsets;
    final Comparator mLayoutDependencyComparator;
    private boolean mNeedsPreDrawListener;
    private View mNestedScrollingDirectChild;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private OnHierarchyChangeListener mOnHierarchyChangeListener;
    private OnPreDrawListener mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List mTempDependenciesList;
    private final int[] mTempIntPair;
    private final List mTempList1;
    private final Rect mTempRect1;
    private final Rect mTempRect2;
    private final Rect mTempRect3;

    public abstract class Behavior {
        public static int a;

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
            return false;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            return getScrimOpacity(coordinatorLayout, view) > 0.0f;
        }

        public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            return BaseSavedState.EMPTY_STATE;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        public final int getScrimColor(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public final float getScrimOpacity(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        }
    }

    class 1 implements Comparator {
        final CoordinatorLayout this$0;

        1(CoordinatorLayout coordinatorLayout) {
            this.this$0 = coordinatorLayout;
        }

        public int compare(View view, View view2) {
            if (view == view2) {
                return 0;
            }
            if (((LayoutParams) view.getLayoutParams()).dependsOn(this.this$0, view, view2)) {
                return 1;
            }
            return ((LayoutParams) view2.getLayoutParams()).dependsOn(this.this$0, view2, view) ? -1 : 0;
        }

        public int compare(Object obj, Object obj2) {
            return compare((View) obj, (View) obj2);
        }
    }

    final class ApplyInsetsListener implements OnApplyWindowInsetsListener {
        final CoordinatorLayout this$0;

        ApplyInsetsListener(CoordinatorLayout coordinatorLayout) {
            this.this$0 = coordinatorLayout;
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            CoordinatorLayout.access$000(this.this$0, windowInsetsCompat);
            return windowInsetsCompat.consumeSystemWindowInsets();
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class value();
    }

    final class HierarchyChangeListener implements OnHierarchyChangeListener {
        final CoordinatorLayout this$0;

        public void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.access$100(this.this$0) != null) {
                CoordinatorLayout.access$100(this.this$0).onChildViewAdded(view, view2);
            }
        }

        HierarchyChangeListener(CoordinatorLayout coordinatorLayout) {
            this.this$0 = coordinatorLayout;
        }

        public void onChildViewRemoved(View view, View view2) {
            this.this$0.dispatchDependentViewRemoved(view2);
            if (CoordinatorLayout.access$100(this.this$0) != null) {
                CoordinatorLayout.access$100(this.this$0).onChildViewRemoved(view, view2);
            }
        }
    }

    public class LayoutParams extends MarginLayoutParams {
        private static final String[] z;
        public int anchorGravity;
        public int gravity;
        public int keyline;
        View mAnchorDirectChild;
        int mAnchorId;
        View mAnchorView;
        Behavior mBehavior;
        boolean mBehaviorResolved;
        Object mBehaviorTag;
        private boolean mDidAcceptNestedScroll;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        final Rect mLastChildRect;

        static {
            String[] strArr = new String[3];
            String str = "kEJK\u007f\bDPS;NCQC;kEPU\u007fAD^StZf^^t]^\u001fC~[IZI\u007fIDK\u0007mAOH\u0007lA^W\u0007rL\n";
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
                            i3 = 40;
                            break;
                        case at.g /*1*/:
                            i3 = 42;
                            break;
                        case at.i /*2*/:
                            i3 = 63;
                            break;
                        case at.o /*3*/:
                            i3 = 39;
                            break;
                        default:
                            i3 = 27;
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
                        str = "iD\\OtZ\nRRh\\\nQHo\bHZ\u0007z\bNZTxMD[Fu\\\nPA;\\BZ\u0007zFIWHiMN\u001fQrM]";
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\b^P\u0007zFIWHi\b\\VBl\b";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        void acceptNestedScroll(boolean z) {
            this.mDidAcceptNestedScroll = z;
        }

        boolean checkAnchorChanged() {
            try {
                if (this.mAnchorView == null) {
                    if (this.mAnchorId != -1) {
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

        public Behavior getBehavior() {
            return this.mBehavior;
        }

        LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.mLastChildRect = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout_LayoutParams);
            try {
                this.gravity = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_LayoutParams_android_layout_gravity, 0);
                this.mAnchorId = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_LayoutParams_layout_anchor, -1);
                this.anchorGravity = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_LayoutParams_layout_anchorGravity, 0);
                this.keyline = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_LayoutParams_layout_keyline, -1);
                this.mBehaviorResolved = obtainStyledAttributes.hasValue(R.styleable.CoordinatorLayout_LayoutParams_layout_behavior);
                if (this.mBehaviorResolved) {
                    this.mBehavior = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(R.styleable.CoordinatorLayout_LayoutParams_layout_behavior));
                }
                obtainStyledAttributes.recycle();
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        boolean getChangedAfterNestedScroll() {
            return this.mDidChangeAfterNestedScroll;
        }

        void setLastChildRect(Rect rect) {
            this.mLastChildRect.set(rect);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void resolveAnchorView(android.view.View r5, android.support.design.widget.CoordinatorLayout r6) {
            /*
            r4 = this;
            r2 = android.support.design.widget.CoordinatorLayout.a;
            r0 = r4.mAnchorId;
            r0 = r6.findViewById(r0);
            r4.mAnchorView = r0;
            r0 = r4.mAnchorView;
            if (r0 == 0) goto L_0x0046;
        L_0x000e:
            r0 = r4.mAnchorView;
            r1 = r4.mAnchorView;
            r1 = r1.getParent();
        L_0x0016:
            if (r1 == r6) goto L_0x0042;
        L_0x0018:
            if (r1 == 0) goto L_0x0042;
        L_0x001a:
            if (r1 != r5) goto L_0x0035;
        L_0x001c:
            r0 = r6.isInEditMode();	 Catch:{ IllegalStateException -> 0x0028 }
            if (r0 == 0) goto L_0x002a;
        L_0x0022:
            r0 = 0;
            r4.mAnchorDirectChild = r0;	 Catch:{ IllegalStateException -> 0x0028 }
            r4.mAnchorView = r0;	 Catch:{ IllegalStateException -> 0x0028 }
        L_0x0027:
            return;
        L_0x0028:
            r0 = move-exception;
            throw r0;
        L_0x002a:
            r0 = new java.lang.IllegalStateException;
            r1 = z;
            r2 = 2;
            r1 = r1[r2];
            r0.<init>(r1);
            throw r0;
        L_0x0035:
            r3 = r1 instanceof android.view.View;
            if (r3 == 0) goto L_0x003c;
        L_0x0039:
            r0 = r1;
            r0 = (android.view.View) r0;
        L_0x003c:
            r1 = r1.getParent();
            if (r2 == 0) goto L_0x0016;
        L_0x0042:
            r4.mAnchorDirectChild = r0;	 Catch:{ IllegalStateException -> 0x0054 }
            if (r2 == 0) goto L_0x0027;
        L_0x0046:
            r0 = r6.isInEditMode();	 Catch:{ IllegalStateException -> 0x0052 }
            if (r0 == 0) goto L_0x0056;
        L_0x004c:
            r0 = 0;
            r4.mAnchorDirectChild = r0;	 Catch:{ IllegalStateException -> 0x0052 }
            r4.mAnchorView = r0;	 Catch:{ IllegalStateException -> 0x0052 }
            goto L_0x0027;
        L_0x0052:
            r0 = move-exception;
            throw r0;
        L_0x0054:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0052 }
        L_0x0056:
            r0 = new java.lang.IllegalStateException;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = z;
            r3 = 0;
            r2 = r2[r3];
            r1 = r1.append(r2);
            r2 = r6.getResources();
            r3 = r4.mAnchorId;
            r2 = r2.getResourceName(r3);
            r1 = r1.append(r2);
            r2 = z;
            r3 = 1;
            r2 = r2[r3];
            r1 = r1.append(r2);
            r1 = r1.append(r5);
            r1 = r1.toString();
            r0.<init>(r1);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.LayoutParams.resolveAnchorView(android.view.View, android.support.design.widget.CoordinatorLayout):void");
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.mLastChildRect = new Rect();
        }

        private boolean verifyAnchorView(View view, CoordinatorLayout coordinatorLayout) {
            boolean z = CoordinatorLayout.a;
            try {
                if (this.mAnchorView.getId() != this.mAnchorId) {
                    return false;
                }
                View view2 = this.mAnchorView;
                View parent = this.mAnchorView.getParent();
                while (parent != coordinatorLayout) {
                    if (parent != null && parent != view) {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                        parent = parent.getParent();
                        if (z) {
                            break;
                        }
                    }
                    try {
                        this.mAnchorDirectChild = null;
                        this.mAnchorView = null;
                        return false;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                this.mAnchorDirectChild = view2;
                return true;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.mLastChildRect = new Rect();
        }

        boolean isNestedScrollAccepted() {
            return this.mDidAcceptNestedScroll;
        }

        void resetTouchBehaviorTracking() {
            this.mDidBlockInteraction = false;
        }

        void setChangedAfterNestedScroll(boolean z) {
            this.mDidChangeAfterNestedScroll = z;
        }

        Rect getLastChildRect() {
            return this.mLastChildRect;
        }

        void resetNestedScroll() {
            this.mDidAcceptNestedScroll = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.mLastChildRect = new Rect();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        android.view.View findAnchorView(android.support.design.widget.CoordinatorLayout r4, android.view.View r5) {
            /*
            r3 = this;
            r0 = 0;
            r1 = r3.mAnchorId;	 Catch:{ IllegalStateException -> 0x000c }
            r2 = -1;
            if (r1 != r2) goto L_0x000e;
        L_0x0006:
            r1 = 0;
            r3.mAnchorDirectChild = r1;	 Catch:{ IllegalStateException -> 0x000c }
            r3.mAnchorView = r1;	 Catch:{ IllegalStateException -> 0x000c }
        L_0x000b:
            return r0;
        L_0x000c:
            r0 = move-exception;
            throw r0;
        L_0x000e:
            r0 = r3.mAnchorView;	 Catch:{ IllegalStateException -> 0x001e }
            if (r0 == 0) goto L_0x0018;
        L_0x0012:
            r0 = r3.verifyAnchorView(r5, r4);	 Catch:{ IllegalStateException -> 0x0020 }
            if (r0 != 0) goto L_0x001b;
        L_0x0018:
            r3.resolveAnchorView(r5, r4);	 Catch:{ IllegalStateException -> 0x0020 }
        L_0x001b:
            r0 = r3.mAnchorView;
            goto L_0x000b;
        L_0x001e:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0020 }
        L_0x0020:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.LayoutParams.findAnchorView(android.support.design.widget.CoordinatorLayout, android.view.View):android.view.View");
        }

        public void setBehavior(Behavior behavior) {
            try {
                if (this.mBehavior != behavior) {
                    this.mBehavior = behavior;
                    this.mBehaviorTag = null;
                    this.mBehaviorResolved = true;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        void resetChangedAfterNestedScroll() {
            this.mDidChangeAfterNestedScroll = false;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        boolean dependsOn(android.support.design.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
            r1 = this;
            r0 = r1.mAnchorDirectChild;	 Catch:{ IllegalStateException -> 0x0012 }
            if (r4 == r0) goto L_0x0010;
        L_0x0004:
            r0 = r1.mBehavior;	 Catch:{ IllegalStateException -> 0x0014 }
            if (r0 == 0) goto L_0x0018;
        L_0x0008:
            r0 = r1.mBehavior;	 Catch:{ IllegalStateException -> 0x0016 }
            r0 = r0.layoutDependsOn(r2, r3, r4);	 Catch:{ IllegalStateException -> 0x0016 }
            if (r0 == 0) goto L_0x0018;
        L_0x0010:
            r0 = 1;
        L_0x0011:
            return r0;
        L_0x0012:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0014 }
        L_0x0014:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0016 }
        L_0x0016:
            r0 = move-exception;
            throw r0;
        L_0x0018:
            r0 = 0;
            goto L_0x0011;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.LayoutParams.dependsOn(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.mLastChildRect = new Rect();
        }

        boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            try {
                if (this.mDidBlockInteraction) {
                    return true;
                }
                try {
                    boolean blocksInteractionBelow = (this.mBehavior != null ? this.mBehavior.blocksInteractionBelow(coordinatorLayout, view) : 0) | this.mDidBlockInteraction;
                    this.mDidBlockInteraction = blocksInteractionBelow;
                    return blocksInteractionBelow;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }

        boolean didBlockInteraction() {
            try {
                if (this.mBehavior == null) {
                    this.mDidBlockInteraction = false;
                }
                return this.mDidBlockInteraction;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public int getAnchorId() {
            return this.mAnchorId;
        }
    }

    class OnPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener {
        final CoordinatorLayout this$0;

        public boolean onPreDraw() {
            this.this$0.dispatchOnDependentViewChanged(false);
            return true;
        }

        OnPreDrawListener(CoordinatorLayout coordinatorLayout) {
            this.this$0 = coordinatorLayout;
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        SparseArray behaviorStates;

        final class 1 implements ParcelableCompatCreatorCallbacks {
            public Object[] m10newArray(int i) {
                return newArray(i);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            1() {
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object m9createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return createFromParcel(parcel, classLoader);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            int size;
            int i2 = 0;
            boolean z = CoordinatorLayout.a;
            super.writeToParcel(parcel, i);
            if (this.behaviorStates != null) {
                size = this.behaviorStates.size();
            } else {
                size = 0;
            }
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            while (i2 < size) {
                iArr[i2] = this.behaviorStates.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.behaviorStates.valueAt(i2);
                i2++;
                if (z) {
                    break;
                }
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z = CoordinatorLayout.a;
            super(parcel);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.behaviorStates = new SparseArray(readInt);
            int i = 0;
            while (i < readInt) {
                this.behaviorStates.append(iArr[i], readParcelableArray[i]);
                i++;
                if (z) {
                    return;
                }
            }
        }

        static {
            CREATOR = ParcelableCompat.newCreator(new 1());
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class ViewElevationComparator implements Comparator {
        ViewElevationComparator() {
        }

        public int compare(View view, View view2) {
            float z = ViewCompat.getZ(view);
            float z2 = ViewCompat.getZ(view2);
            if (z > z2) {
                return -1;
            }
            if (z < z2) {
                return 1;
            }
            return 0;
        }

        public int compare(Object obj, Object obj2) {
            return compare((View) obj, (View) obj2);
        }
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            try {
                return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    void removePreDrawListener() {
        try {
            if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
                getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
            }
            this.mNeedsPreDrawListener = false;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r27, int r28) {
        /*
        r26 = this;
        r15 = a;
        r26.prepareChildren();
        r26.ensurePreDrawListener();
        r16 = r26.getPaddingLeft();
        r2 = r26.getPaddingTop();
        r17 = r26.getPaddingRight();
        r3 = r26.getPaddingBottom();
        r18 = android.support.v4.view.ViewCompat.getLayoutDirection(r26);
        r1 = 1;
        r0 = r18;
        if (r0 != r1) goto L_0x0142;
    L_0x0021:
        r1 = 1;
        r9 = r1;
    L_0x0023:
        r19 = android.view.View.MeasureSpec.getMode(r27);
        r20 = android.view.View.MeasureSpec.getSize(r27);
        r21 = android.view.View.MeasureSpec.getMode(r28);
        r22 = android.view.View.MeasureSpec.getSize(r28);
        r23 = r16 + r17;
        r24 = r2 + r3;
        r13 = r26.getSuggestedMinimumWidth();
        r12 = r26.getSuggestedMinimumHeight();
        r11 = 0;
        r0 = r26;
        r1 = r0.mLastInsets;	 Catch:{ RuntimeException -> 0x0146 }
        if (r1 == 0) goto L_0x014a;
    L_0x0046:
        r1 = android.support.v4.view.ViewCompat.getFitsSystemWindows(r26);	 Catch:{ RuntimeException -> 0x0148 }
        if (r1 == 0) goto L_0x014a;
    L_0x004c:
        r1 = 1;
        r10 = r1;
    L_0x004e:
        r0 = r26;
        r1 = r0.mDependencySortedChildren;
        r25 = r1.size();
        r1 = 0;
        r14 = r1;
    L_0x0058:
        r0 = r25;
        if (r14 >= r0) goto L_0x015f;
    L_0x005c:
        r0 = r26;
        r1 = r0.mDependencySortedChildren;
        r3 = r1.get(r14);
        r3 = (android.view.View) r3;
        r1 = r3.getLayoutParams();
        r8 = r1;
        r8 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r8;
        r5 = 0;
        r1 = r8.keyline;	 Catch:{ RuntimeException -> 0x014e }
        if (r1 < 0) goto L_0x00af;
    L_0x0072:
        if (r19 == 0) goto L_0x00af;
    L_0x0074:
        r1 = r8.keyline;
        r0 = r26;
        r1 = r0.getKeyline(r1);
        r2 = r8.gravity;
        r2 = resolveKeylineGravity(r2);
        r0 = r18;
        r2 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r2, r0);
        r2 = r2 & 7;
        r4 = 3;
        if (r2 != r4) goto L_0x008f;
    L_0x008d:
        if (r9 == 0) goto L_0x0094;
    L_0x008f:
        r4 = 5;
        if (r2 != r4) goto L_0x009e;
    L_0x0092:
        if (r9 == 0) goto L_0x009e;
    L_0x0094:
        r4 = 0;
        r5 = r20 - r17;
        r5 = r5 - r1;
        r5 = java.lang.Math.max(r4, r5);
        if (r15 == 0) goto L_0x00af;
    L_0x009e:
        r4 = 5;
        if (r2 != r4) goto L_0x00a3;
    L_0x00a1:
        if (r9 == 0) goto L_0x00a8;
    L_0x00a3:
        r4 = 3;
        if (r2 != r4) goto L_0x00af;
    L_0x00a6:
        if (r9 == 0) goto L_0x00af;
    L_0x00a8:
        r2 = 0;
        r1 = r1 - r16;
        r5 = java.lang.Math.max(r2, r1);
    L_0x00af:
        if (r10 == 0) goto L_0x015a;
    L_0x00b1:
        r1 = android.support.v4.view.ViewCompat.getFitsSystemWindows(r3);	 Catch:{ RuntimeException -> 0x0150 }
        if (r1 != 0) goto L_0x015a;
    L_0x00b7:
        r0 = r26;
        r1 = r0.mLastInsets;
        r1 = r1.getSystemWindowInsetLeft();
        r0 = r26;
        r2 = r0.mLastInsets;
        r2 = r2.getSystemWindowInsetRight();
        r1 = r1 + r2;
        r0 = r26;
        r2 = r0.mLastInsets;
        r2 = r2.getSystemWindowInsetTop();
        r0 = r26;
        r4 = r0.mLastInsets;
        r4 = r4.getSystemWindowInsetBottom();
        r2 = r2 + r4;
        r1 = r20 - r1;
        r0 = r19;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0);
        r1 = r22 - r2;
        r0 = r21;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0);
    L_0x00e9:
        r1 = r8.getBehavior();
        if (r1 == 0) goto L_0x00f8;
    L_0x00ef:
        r7 = 0;
        r2 = r26;
        r1 = r1.onMeasureChild(r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0152 }
        if (r1 != 0) goto L_0x00fe;
    L_0x00f8:
        r7 = 0;
        r2 = r26;
        r2.onMeasureChild(r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0152 }
    L_0x00fe:
        r1 = r3.getMeasuredWidth();
        r1 = r1 + r23;
        r2 = r8.leftMargin;
        r1 = r1 + r2;
        r2 = r8.rightMargin;
        r1 = r1 + r2;
        r4 = java.lang.Math.max(r13, r1);
        r1 = r3.getMeasuredHeight();
        r1 = r1 + r24;
        r2 = r8.topMargin;
        r1 = r1 + r2;
        r2 = r8.bottomMargin;
        r1 = r1 + r2;
        r2 = java.lang.Math.max(r12, r1);
        r1 = android.support.v4.view.ViewCompat.getMeasuredState(r3);
        r1 = android.support.v4.view.ViewCompat.combineMeasuredStates(r11, r1);
        r3 = r14 + 1;
        if (r15 == 0) goto L_0x0154;
    L_0x012a:
        r3 = r4;
    L_0x012b:
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r4 = r4 & r1;
        r0 = r27;
        r3 = android.support.v4.view.ViewCompat.resolveSizeAndState(r3, r0, r4);
        r1 = r1 << 16;
        r0 = r28;
        r1 = android.support.v4.view.ViewCompat.resolveSizeAndState(r2, r0, r1);
        r0 = r26;
        r0.setMeasuredDimension(r3, r1);
        return;
    L_0x0142:
        r1 = 0;
        r9 = r1;
        goto L_0x0023;
    L_0x0146:
        r1 = move-exception;
        throw r1;	 Catch:{ RuntimeException -> 0x0148 }
    L_0x0148:
        r1 = move-exception;
        throw r1;
    L_0x014a:
        r1 = 0;
        r10 = r1;
        goto L_0x004e;
    L_0x014e:
        r1 = move-exception;
        throw r1;
    L_0x0150:
        r1 = move-exception;
        throw r1;
    L_0x0152:
        r1 = move-exception;
        throw r1;
    L_0x0154:
        r14 = r3;
        r11 = r1;
        r12 = r2;
        r13 = r4;
        goto L_0x0058;
    L_0x015a:
        r6 = r28;
        r4 = r27;
        goto L_0x00e9;
    L_0x015f:
        r1 = r11;
        r2 = r12;
        r3 = r13;
        goto L_0x012b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    static OnHierarchyChangeListener access$100(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.mOnHierarchyChangeListener;
    }

    private static int resolveGravity(int i) {
        return i == 0 ? 8388659 : i;
    }

    static {
        String[] strArr = new String[11];
        String str = "9\u0004O]JZ\u0005UE\u000e\u0013\u0005\\]O\u000e\u000e\u001asK\u0012\nLXA\bKIDL\u0019\u0007[B]Z";
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
                        i4 = 122;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 58;
                        break;
                    case at.o /*3*/:
                        i4 = 49;
                        break;
                    default:
                        i4 = 46;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "4\u0004\u001aZK\u0003\u0007S_K\tK^TH\u0013\u0005_U\u000e\u001c\u0004H\u0011";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "1\u000eC]G\u0014\u000e\u001aX@\u001e\u000eB\u0011";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "9\u0004UCJ\u0013\u0005[EA\b'[HA\u000f\u001f";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "Z\u0004OE\u000e\u0015\r\u001aCO\u0014\f_\u0011H\u0015\u0019\u001a";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "ZF\u001aPZ\u000e\u000eWAZ\u001f\u000f\u001aX@\u001e\u000eB\u0011B\u0015\u0004QD^Z";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = ";\u0005\u001aP@\u0019\u0003UC\u000e\u0017\nC\u0011@\u0015\u001f\u001aSKZ\bRP@\u001d\u000e^\u0011O\u001c\u001f_C\u000e9\u0004UCJ\u0013\u0005[EA\b'[HA\u000f\u001f\u001a\\K\u001b\u0018OCK\u0017\u000eTE\u000e\u0018\u000e]X@\tKXTH\u0015\u0019_\u0011B\u001b\u0012UDZZ\u0002I\u0011M\u0015\u0006J]K\u000e\u000e\u0014";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "9\u0004UCJ\u0013\u0005[EA\b'[HA\u000f\u001f";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = ">\u000e\\P[\u0016\u001f\u001aSK\u0012\nLXA\bKY]O\t\u0018\u001a";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "Z\bUDB\u001eKT^ZZ\t_\u0011G\u0014\u0018NP@\u000e\u0002[EK\u001eE\u001auG\u001eKC^[Z\rUCI\u001f\u001f\u001aP\u000e\u001e\u000e\\P[\u0016\u001f\u001aRA\u0014\u0018NC[\u0019\u001fUC\u0011";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    String name;
                    strArr2[i2] = str;
                    z = strArr3;
                    Package packageR = CoordinatorLayout.class.getPackage();
                    if (packageR != null) {
                        try {
                            name = packageR.getName();
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    name = null;
                    try {
                        WIDGET_PACKAGE_NAME = name;
                        if (VERSION.SDK_INT >= 21) {
                            TOP_SORTED_CHILDREN_COMPARATOR = new ViewElevationComparator();
                            INSETS_HELPER = new CoordinatorLayoutInsetsHelperLollipop();
                        } else {
                            TOP_SORTED_CHILDREN_COMPARATOR = null;
                            INSETS_HELPER = null;
                        }
                        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
                        sConstructors = new ThreadLocal();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                default:
                    strArr2[i2] = str;
                    str = "9\u0004UCJ\u0013\u0005[EA\b'[HA\u000f\u001f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    void recordLastChildRect(View view, Rect rect) {
        ((LayoutParams) view.getLayoutParams()).setLastChildRect(rect);
    }

    void getChildRect(View view, boolean z, Rect rect) {
        try {
            if (!view.isLayoutRequested()) {
                if (view.getVisibility() != 8) {
                    if (z) {
                        try {
                            getDescendantRect(view, rect);
                            if (!a) {
                                return;
                            }
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    return;
                }
            }
            rect.set(0, 0, 0, 0);
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    private void layoutChildWithAnchor(View view, View view2, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = this.mTempRect1;
        Rect rect2 = this.mTempRect2;
        getDescendantRect(view2, rect);
        getDesiredAnchoredChildRect(view, i, rect, rect2);
        view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    protected Parcelable onSaveInstanceState() {
        boolean z = a;
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (!(id == -1 || behavior == null)) {
                Parcelable onSaveInstanceState = behavior.onSaveInstanceState(this, childAt);
                if (onSaveInstanceState != null) {
                    try {
                        sparseArray.append(id, onSaveInstanceState);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        savedState.behaviorStates = sparseArray;
        return savedState;
    }

    void dispatchDependentViewRemoved(View view) {
        boolean z = a;
        int size = this.mDependencySortedChildren.size();
        int i = 0;
        Object obj = null;
        while (i < size) {
            int i2;
            Object obj2;
            View view2 = (View) this.mDependencySortedChildren.get(i);
            if (view2 == view) {
                if (z) {
                    obj = 1;
                } else {
                    int i3 = 1;
                    i2 = i + 1;
                    if (z) {
                        i = i2;
                        obj = obj2;
                    } else {
                        return;
                    }
                }
            }
            if (obj != null) {
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    try {
                        if (layoutParams.dependsOn(this, view2, view)) {
                            behavior.onDependentViewRemoved(this, view2, view);
                            obj2 = obj;
                            i2 = i + 1;
                            if (z) {
                                i = i2;
                                obj = obj2;
                            } else {
                                return;
                            }
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            }
            obj2 = obj;
            i2 = i + 1;
            if (z) {
                i = i2;
                obj = obj2;
            } else {
                return;
            }
        }
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        boolean z = a;
        int childCount = getChildCount();
        int i = 0;
        boolean z2 = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            try {
                boolean onNestedPreFling;
                int i2;
                if (layoutParams.isNestedScrollAccepted() || z) {
                    Behavior behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        onNestedPreFling = z2 | behavior.onNestedPreFling(this, childAt, view, f, f2);
                        i2 = i + 1;
                        if (z) {
                            return onNestedPreFling;
                        }
                        i = i2;
                        z2 = onNestedPreFling;
                    }
                }
                onNestedPreFling = z2;
                i2 = i + 1;
                if (z) {
                    return onNestedPreFling;
                }
                i = i2;
                z2 = onNestedPreFling;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return z2;
    }

    private void dispatchChildApplyWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        boolean z = a;
        try {
            if (!windowInsetsCompat.isConsumed()) {
                int childCount = getChildCount();
                int i = 0;
                WindowInsetsCompat windowInsetsCompat2 = windowInsetsCompat;
                while (i < childCount) {
                    View childAt = getChildAt(i);
                    if (ViewCompat.getFitsSystemWindows(childAt)) {
                        WindowInsetsCompat onApplyWindowInsets;
                        Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
                        if (behavior != null) {
                            onApplyWindowInsets = behavior.onApplyWindowInsets(this, childAt, windowInsetsCompat2);
                            try {
                                if (onApplyWindowInsets.isConsumed() && !z) {
                                    return;
                                }
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        }
                        onApplyWindowInsets = windowInsetsCompat2;
                        windowInsetsCompat2 = ViewCompat.dispatchApplyWindowInsets(childAt, onApplyWindowInsets);
                        try {
                            if (windowInsetsCompat2.isConsumed() && !z) {
                                return;
                            }
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (RuntimeException e22) {
                            throw e22;
                        }
                    }
                    int i2 = i + 1;
                    if (!z) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CoordinatorLayout(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        r7 = this;
        r0 = 0;
        r1 = a;
        r7.<init>(r8, r9, r10);
        r2 = new android.support.design.widget.CoordinatorLayout$1;
        r2.<init>(r7);
        r7.mLayoutDependencyComparator = r2;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r7.mDependencySortedChildren = r2;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r7.mTempList1 = r2;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r7.mTempDependenciesList = r2;
        r2 = new android.graphics.Rect;
        r2.<init>();
        r7.mTempRect1 = r2;
        r2 = new android.graphics.Rect;
        r2.<init>();
        r7.mTempRect2 = r2;
        r2 = new android.graphics.Rect;
        r2.<init>();
        r7.mTempRect3 = r2;
        r2 = 2;
        r2 = new int[r2];
        r7.mTempIntPair = r2;
        r2 = new android.support.v4.view.NestedScrollingParentHelper;
        r2.<init>(r7);
        r7.mNestedScrollingParentHelper = r2;
        android.support.design.widget.ThemeUtils.checkAppCompatTheme(r8);
        r2 = android.support.design.R.styleable.CoordinatorLayout;
        r3 = android.support.design.R.style.Widget_Design_CoordinatorLayout;
        r2 = r8.obtainStyledAttributes(r9, r2, r10, r3);
        r3 = android.support.design.R.styleable.CoordinatorLayout_keylines;
        r3 = r2.getResourceId(r3, r0);
        if (r3 == 0) goto L_0x0078;
    L_0x0056:
        r4 = r8.getResources();
        r3 = r4.getIntArray(r3);
        r7.mKeylines = r3;
        r3 = r4.getDisplayMetrics();
        r3 = r3.density;
        r4 = r7.mKeylines;
        r4 = r4.length;
    L_0x0069:
        if (r0 >= r4) goto L_0x0078;
    L_0x006b:
        r5 = r7.mKeylines;
        r6 = r5[r0];
        r6 = (float) r6;
        r6 = r6 * r3;
        r6 = (int) r6;
        r5[r0] = r6;
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0069;
    L_0x0078:
        r0 = android.support.design.R.styleable.CoordinatorLayout_statusBarBackground;	 Catch:{ RuntimeException -> 0x009a }
        r0 = r2.getDrawable(r0);	 Catch:{ RuntimeException -> 0x009a }
        r7.mStatusBarBackground = r0;	 Catch:{ RuntimeException -> 0x009a }
        r2.recycle();	 Catch:{ RuntimeException -> 0x009a }
        r0 = INSETS_HELPER;	 Catch:{ RuntimeException -> 0x009a }
        if (r0 == 0) goto L_0x0091;
    L_0x0087:
        r0 = INSETS_HELPER;	 Catch:{ RuntimeException -> 0x009a }
        r1 = new android.support.design.widget.CoordinatorLayout$ApplyInsetsListener;	 Catch:{ RuntimeException -> 0x009a }
        r1.<init>(r7);	 Catch:{ RuntimeException -> 0x009a }
        r0.setupForWindowInsets(r7, r1);	 Catch:{ RuntimeException -> 0x009a }
    L_0x0091:
        r0 = new android.support.design.widget.CoordinatorLayout$HierarchyChangeListener;
        r0.<init>(r7);
        super.setOnHierarchyChangeListener(r0);
        return;
    L_0x009a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            if (layoutParams instanceof LayoutParams) {
                if (super.checkLayoutParams(layoutParams)) {
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

    LayoutParams getResolvedLayoutParams(View view) {
        boolean z = a;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mBehaviorResolved) {
            Class cls = view.getClass();
            DefaultBehavior defaultBehavior = null;
            while (cls != null) {
                defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
                cls = cls.getSuperclass();
                if (z) {
                    break;
                }
            }
            DefaultBehavior defaultBehavior2 = defaultBehavior;
            if (defaultBehavior2 != null) {
                try {
                    layoutParams.setBehavior((Behavior) defaultBehavior2.value().newInstance());
                } catch (Throwable e) {
                    Log.e(z[8], z[9] + defaultBehavior2.value().getName() + z[10], e);
                }
            }
            layoutParams.mBehaviorResolved = true;
        }
        return layoutParams;
    }

    void getLastChildRect(View view, Rect rect) {
        rect.set(((LayoutParams) view.getLayoutParams()).getLastChildRect());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void layoutChildWithKeyline(android.view.View r11, int r12, int r13) {
        /*
        r10 = this;
        r4 = a;
        r0 = r11.getLayoutParams();
        r0 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r0;
        r1 = r0.gravity;
        r1 = resolveKeylineGravity(r1);
        r1 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r1, r13);
        r3 = r1 & 7;
        r5 = r1 & 112;
        r6 = r10.getWidth();
        r7 = r10.getHeight();
        r8 = r11.getMeasuredWidth();
        r9 = r11.getMeasuredHeight();
        r1 = 1;
        if (r13 != r1) goto L_0x002b;
    L_0x0029:
        r12 = r6 - r12;
    L_0x002b:
        r1 = r10.getKeyline(r12);
        r1 = r1 - r8;
        r2 = 0;
        switch(r3) {
            case 1: goto L_0x0039;
            case 5: goto L_0x0036;
            default: goto L_0x0034;
        };
    L_0x0034:
        if (r4 == 0) goto L_0x0088;
    L_0x0036:
        r1 = r1 + r8;
        if (r4 == 0) goto L_0x0088;
    L_0x0039:
        r3 = r8 / 2;
        r1 = r1 + r3;
        r3 = r1;
    L_0x003d:
        switch(r5) {
            case 16: goto L_0x0086;
            case 80: goto L_0x0042;
            default: goto L_0x0040;
        };
    L_0x0040:
        if (r4 == 0) goto L_0x0049;
    L_0x0042:
        r1 = r2 + r9;
        if (r4 == 0) goto L_0x0084;
    L_0x0046:
        r2 = r9 / 2;
        r2 = r2 + r1;
    L_0x0049:
        r1 = r10.getPaddingLeft();
        r4 = r0.leftMargin;
        r1 = r1 + r4;
        r4 = r10.getPaddingRight();
        r4 = r6 - r4;
        r4 = r4 - r8;
        r5 = r0.rightMargin;
        r4 = r4 - r5;
        r3 = java.lang.Math.min(r3, r4);
        r1 = java.lang.Math.max(r1, r3);
        r3 = r10.getPaddingTop();
        r4 = r0.topMargin;
        r3 = r3 + r4;
        r4 = r10.getPaddingBottom();
        r4 = r7 - r4;
        r4 = r4 - r9;
        r0 = r0.bottomMargin;
        r0 = r4 - r0;
        r0 = java.lang.Math.min(r2, r0);
        r0 = java.lang.Math.max(r3, r0);
        r2 = r1 + r8;
        r3 = r0 + r9;
        r11.layout(r1, r0, r2, r3);
        return;
    L_0x0084:
        r2 = r1;
        goto L_0x0049;
    L_0x0086:
        r1 = r2;
        goto L_0x0046;
    L_0x0088:
        r3 = r1;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.layoutChildWithKeyline(android.view.View, int, int):void");
    }

    public android.view.ViewGroup.LayoutParams m7generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    private void layoutChild(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = this.mTempRect1;
        try {
            rect.set(getPaddingLeft() + layoutParams.leftMargin, getPaddingTop() + layoutParams.topMargin, (getWidth() - getPaddingRight()) - layoutParams.rightMargin, (getHeight() - getPaddingBottom()) - layoutParams.bottomMargin);
            if (this.mLastInsets != null) {
                if (ViewCompat.getFitsSystemWindows(this)) {
                    try {
                        if (!ViewCompat.getFitsSystemWindows(view)) {
                            rect.left += this.mLastInsets.getSystemWindowInsetLeft();
                            rect.top += this.mLastInsets.getSystemWindowInsetTop();
                            rect.right -= this.mLastInsets.getSystemWindowInsetRight();
                            rect.bottom -= this.mLastInsets.getSystemWindowInsetBottom();
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            }
            Rect rect2 = this.mTempRect2;
            GravityCompat.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    void addPreDrawListener() {
        try {
            if (this.mIsAttachedToWindow) {
                if (this.mOnPreDrawListener == null) {
                    this.mOnPreDrawListener = new OnPreDrawListener(this);
                }
                getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
            }
            this.mNeedsPreDrawListener = true;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        boolean z = a;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray sparseArray = savedState.behaviorStates;
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = getResolvedLayoutParams(childAt).getBehavior();
            if (!(id == -1 || behavior == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    try {
                        behavior.onRestoreInstanceState(this, childAt, parcelable2);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            }
            id = i + 1;
            if (!z) {
                i = id;
            } else {
                return;
            }
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void dispatchOnDependentViewChanged(boolean r12) {
        /*
        r11 = this;
        r4 = 0;
        r6 = a;
        r7 = android.support.v4.view.ViewCompat.getLayoutDirection(r11);
        r0 = r11.mDependencySortedChildren;
        r8 = r0.size();
        r5 = r4;
    L_0x000e:
        if (r5 >= r8) goto L_0x0087;
    L_0x0010:
        r0 = r11.mDependencySortedChildren;
        r0 = r0.get(r5);
        r0 = (android.view.View) r0;
        r1 = r0.getLayoutParams();
        r1 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r1;
        r3 = r4;
    L_0x001f:
        if (r3 >= r5) goto L_0x0034;
    L_0x0021:
        r2 = r11.mDependencySortedChildren;
        r2 = r2.get(r3);
        r2 = (android.view.View) r2;
        r9 = r1.mAnchorDirectChild;	 Catch:{ RuntimeException -> 0x0088 }
        if (r9 != r2) goto L_0x0030;
    L_0x002d:
        r11.offsetChildToAnchor(r0, r7);	 Catch:{ RuntimeException -> 0x0088 }
    L_0x0030:
        r2 = r3 + 1;
        if (r6 == 0) goto L_0x0099;
    L_0x0034:
        r1 = r11.mTempRect1;
        r2 = r11.mTempRect2;
        r11.getLastChildRect(r0, r1);	 Catch:{ RuntimeException -> 0x008a }
        r3 = 1;
        r11.getChildRect(r0, r3, r2);	 Catch:{ RuntimeException -> 0x008a }
        r1 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x008a }
        if (r1 == 0) goto L_0x0047;
    L_0x0045:
        if (r6 == 0) goto L_0x0083;
    L_0x0047:
        r11.recordLastChildRect(r0, r2);
        r1 = r5 + 1;
        r3 = r1;
    L_0x004d:
        if (r3 >= r8) goto L_0x0083;
    L_0x004f:
        r1 = r11.mDependencySortedChildren;
        r1 = r1.get(r3);
        r1 = (android.view.View) r1;
        r2 = r1.getLayoutParams();
        r2 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r2;
        r9 = r2.getBehavior();
        if (r9 == 0) goto L_0x007f;
    L_0x0063:
        r10 = r9.layoutDependsOn(r11, r1, r0);	 Catch:{ RuntimeException -> 0x008c }
        if (r10 == 0) goto L_0x007f;
    L_0x0069:
        if (r12 != 0) goto L_0x0076;
    L_0x006b:
        r10 = r2.getChangedAfterNestedScroll();	 Catch:{ RuntimeException -> 0x0090 }
        if (r10 == 0) goto L_0x0076;
    L_0x0071:
        r2.resetChangedAfterNestedScroll();	 Catch:{ RuntimeException -> 0x0090 }
        if (r6 == 0) goto L_0x007f;
    L_0x0076:
        r1 = r9.onDependentViewChanged(r11, r1, r0);
        if (r12 == 0) goto L_0x007f;
    L_0x007c:
        r2.setChangedAfterNestedScroll(r1);	 Catch:{ RuntimeException -> 0x0092 }
    L_0x007f:
        r1 = r3 + 1;
        if (r6 == 0) goto L_0x0097;
    L_0x0083:
        r0 = r5 + 1;
        if (r6 == 0) goto L_0x0094;
    L_0x0087:
        return;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r5 = r0;
        goto L_0x000e;
    L_0x0097:
        r3 = r1;
        goto L_0x004d;
    L_0x0099:
        r3 = r2;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.dispatchOnDependentViewChanged(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getTopSortedChildren(java.util.List r6) {
        /*
        r5 = this;
        r2 = a;
        r6.clear();
        r3 = r5.isChildrenDrawingOrderEnabled();
        r4 = r5.getChildCount();
        r1 = r4 + -1;
    L_0x000f:
        if (r1 < 0) goto L_0x0022;
    L_0x0011:
        if (r3 == 0) goto L_0x002e;
    L_0x0013:
        r0 = r5.getChildDrawingOrder(r4, r1);	 Catch:{ RuntimeException -> 0x002c }
    L_0x0017:
        r0 = r5.getChildAt(r0);
        r6.add(r0);
        r1 = r1 + -1;
        if (r2 == 0) goto L_0x000f;
    L_0x0022:
        r0 = TOP_SORTED_CHILDREN_COMPARATOR;	 Catch:{ RuntimeException -> 0x0030 }
        if (r0 == 0) goto L_0x002b;
    L_0x0026:
        r0 = TOP_SORTED_CHILDREN_COMPARATOR;	 Catch:{ RuntimeException -> 0x0030 }
        java.util.Collections.sort(r6, r0);	 Catch:{ RuntimeException -> 0x0030 }
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = r1;
        goto L_0x0017;
    L_0x0030:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.getTopSortedChildren(java.util.List):void");
    }

    static void access$000(CoordinatorLayout coordinatorLayout, WindowInsetsCompat windowInsetsCompat) {
        coordinatorLayout.setWindowInsets(windowInsetsCompat);
    }

    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            resetTouchBehaviors();
            if (this.mNeedsPreDrawListener) {
                if (this.mOnPreDrawListener == null) {
                    this.mOnPreDrawListener = new OnPreDrawListener(this);
                }
                getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
            }
            try {
                if (this.mLastInsets == null) {
                    if (ViewCompat.getFitsSystemWindows(this)) {
                        ViewCompat.requestApplyInsets(this);
                    }
                }
                this.mIsAttachedToWindow = true;
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
        r6 = this;
        r3 = a;
        r4 = android.support.v4.view.ViewCompat.getLayoutDirection(r6);
        r0 = r6.mDependencySortedChildren;
        r5 = r0.size();
        r0 = 0;
        r2 = r0;
    L_0x000e:
        if (r2 >= r5) goto L_0x0031;
    L_0x0010:
        r0 = r6.mDependencySortedChildren;
        r0 = r0.get(r2);
        r0 = (android.view.View) r0;
        r1 = r0.getLayoutParams();
        r1 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r1;
        r1 = r1.getBehavior();
        if (r1 == 0) goto L_0x002a;
    L_0x0024:
        r1 = r1.onLayoutChild(r6, r0, r4);	 Catch:{ RuntimeException -> 0x0032 }
        if (r1 != 0) goto L_0x002d;
    L_0x002a:
        r6.onLayoutChild(r0, r4);	 Catch:{ RuntimeException -> 0x0032 }
    L_0x002d:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x0034;
    L_0x0031:
        return;
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r2 = r0;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onLayout(boolean, int, int, int, int):void");
    }

    private int getKeyline(int i) {
        try {
            if (this.mKeylines == null) {
                Log.e(z[1], z[2] + this + z[6] + i);
                return 0;
            }
            if (i >= 0) {
                try {
                    if (i < this.mKeylines.length) {
                        return this.mKeylines[i];
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            Log.e(z[4], z[3] + i + z[5] + this);
            return 0;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    protected android.view.ViewGroup.LayoutParams m8generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public void onStopNestedScroll(View view) {
        boolean z = a;
        this.mNestedScrollingParentHelper.onStopNestedScroll(view);
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            try {
                if (layoutParams.isNestedScrollAccepted() || z) {
                    Behavior behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        try {
                            behavior.onStopNestedScroll(this, childAt, view);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    layoutParams.resetNestedScroll();
                    layoutParams.resetChangedAfterNestedScroll();
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        this.mNestedScrollingDirectChild = null;
        this.mNestedScrollingTarget = null;
    }

    public boolean doViewsOverlap(View view, View view2) {
        try {
            if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
                return false;
            }
            Rect rect = this.mTempRect1;
            try {
                boolean z;
                if (view.getParent() != this) {
                    z = true;
                } else {
                    z = false;
                }
                getChildRect(view, z, rect);
                Rect rect2 = this.mTempRect2;
                try {
                    try {
                        getChildRect(view2, view2.getParent() != this, rect2);
                        if (rect.left <= rect2.right) {
                            if (rect.top <= rect2.bottom) {
                                try {
                                    if (rect.right >= rect2.left) {
                                        try {
                                            if (rect.bottom >= rect2.top) {
                                                return true;
                                            }
                                        } catch (RuntimeException e) {
                                            throw e;
                                        }
                                    }
                                } catch (RuntimeException e2) {
                                    throw e2;
                                }
                            }
                        }
                        return false;
                    } catch (RuntimeException e22) {
                        throw e22;
                    } catch (RuntimeException e222) {
                        throw e222;
                    }
                } catch (RuntimeException e2222) {
                    throw e2222;
                }
            } catch (RuntimeException e22222) {
                throw e22222;
            }
        } catch (RuntimeException e222222) {
            throw e222222;
        }
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        boolean z = a;
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        this.mNestedScrollingDirectChild = view;
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            try {
                if (layoutParams.isNestedScrollAccepted() || z) {
                    Behavior behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        try {
                            behavior.onNestedScrollAccepted(this, childAt, view, view2, i);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                }
                int i3 = i2 + 1;
                if (!z) {
                    i2 = i3;
                } else {
                    return;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    public void onLayoutChild(View view, int i) {
        boolean z = a;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        try {
            if (layoutParams.checkAnchorChanged()) {
                throw new IllegalStateException(z[7]);
            }
            try {
                if (layoutParams.mAnchorView != null) {
                    layoutChildWithAnchor(view, layoutParams.mAnchorView, i);
                    if (!z) {
                        return;
                    }
                }
                try {
                    if (layoutParams.keyline >= 0) {
                        try {
                            layoutChildWithKeyline(view, layoutParams.keyline, i);
                            if (!z) {
                                return;
                            }
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    layoutChild(view, i);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (RuntimeException e22) {
                throw e22;
            } catch (RuntimeException e222) {
                throw e222;
            }
        } catch (RuntimeException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void ensurePreDrawListener() {
        /*
        r5 = this;
        r0 = 0;
        r2 = a;
        r3 = r5.getChildCount();
        r1 = r0;
    L_0x0008:
        if (r1 >= r3) goto L_0x001b;
    L_0x000a:
        r4 = r5.getChildAt(r1);
        r4 = r5.hasDependencies(r4);
        if (r4 == 0) goto L_0x0017;
    L_0x0014:
        r0 = 1;
        if (r2 == 0) goto L_0x001b;
    L_0x0017:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0008;
    L_0x001b:
        r1 = r5.mNeedsPreDrawListener;	 Catch:{ RuntimeException -> 0x002a }
        if (r0 == r1) goto L_0x0029;
    L_0x001f:
        if (r0 == 0) goto L_0x0026;
    L_0x0021:
        r5.addPreDrawListener();	 Catch:{ RuntimeException -> 0x002e }
        if (r2 == 0) goto L_0x0029;
    L_0x0026:
        r5.removePreDrawListener();	 Catch:{ RuntimeException -> 0x002e }
    L_0x0029:
        return;
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.ensurePreDrawListener():void");
    }

    void offsetChildToAnchor(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mAnchorView != null) {
            Rect rect = this.mTempRect1;
            Rect rect2 = this.mTempRect2;
            Rect rect3 = this.mTempRect3;
            getDescendantRect(layoutParams.mAnchorView, rect);
            getChildRect(view, false, rect2);
            getDesiredAnchoredChildRect(view, i, rect, rect3);
            int i2 = rect3.left - rect2.left;
            int i3 = rect3.top - rect2.top;
            if (i2 != 0) {
                try {
                    view.offsetLeftAndRight(i2);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            if (i3 != 0) {
                try {
                    view.offsetTopAndBottom(i3);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
            if (i2 != 0 || i3 != 0) {
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    try {
                        behavior.onDependentViewChanged(this, view, layoutParams.mAnchorView);
                    } catch (RuntimeException e22) {
                        throw e22;
                    }
                }
            }
        }
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public void onDraw(Canvas canvas) {
        int i = 0;
        try {
            super.onDraw(canvas);
            if (!this.mDrawStatusBarBackground) {
                return;
            }
            if (this.mStatusBarBackground != null) {
                try {
                    if (this.mLastInsets != null) {
                        i = this.mLastInsets.getSystemWindowInsetTop();
                    }
                    if (i > 0) {
                        try {
                            this.mStatusBarBackground.setBounds(0, 0, getWidth(), i);
                            this.mStatusBarBackground.draw(canvas);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        } catch (RuntimeException e22) {
            throw e22;
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    private void prepareChildren() {
        boolean z = a;
        this.mDependencySortedChildren.clear();
        int i = 0;
        int childCount = getChildCount();
        while (i < childCount) {
            View childAt = getChildAt(i);
            getResolvedLayoutParams(childAt).findAnchorView(this, childAt);
            this.mDependencySortedChildren.add(childAt);
            i++;
            if (z) {
                break;
            }
        }
        selectionSort(this.mDependencySortedChildren, this.mLayoutDependencyComparator);
    }

    void getDescendantRect(View view, Rect rect) {
        ViewGroupUtils.getDescendantRect(this, view, rect);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean onNestedFling;
        boolean z2 = a;
        int childCount = getChildCount();
        int i = 0;
        boolean z3 = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            try {
                int i2;
                if (layoutParams.isNestedScrollAccepted() || z2) {
                    Behavior behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        onNestedFling = z3 | behavior.onNestedFling(this, childAt, view, f, f2, z);
                        i2 = i + 1;
                        if (z2) {
                            break;
                        }
                        i = i2;
                        z3 = onNestedFling;
                    }
                }
                onNestedFling = z3;
                i2 = i + 1;
                if (z2) {
                    break;
                }
                i = i2;
                z3 = onNestedFling;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        onNestedFling = z3;
        if (onNestedFling) {
            try {
                dispatchOnDependentViewChanged(true);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        return onNestedFling;
    }

    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    private static void selectionSort(List list, Comparator comparator) {
        int i = 0;
        boolean z = a;
        if (list != null) {
            try {
                if (list.size() >= 2) {
                    View[] viewArr = new View[list.size()];
                    list.toArray(viewArr);
                    int length = viewArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i2 + 1;
                        int i4 = i2;
                        while (i3 < length) {
                            if (comparator.compare(viewArr[i3], viewArr[i4]) < 0) {
                                i4 = i3;
                            }
                            i3++;
                            if (z) {
                                break;
                            }
                        }
                        if (i2 != i4) {
                            View view = viewArr[i4];
                            viewArr[i4] = viewArr[i2];
                            viewArr[i2] = view;
                        }
                        i2++;
                        if (z) {
                            break;
                        }
                    }
                    list.clear();
                    while (i < length) {
                        list.add(viewArr[i]);
                        i++;
                        if (z) {
                            return;
                        }
                    }
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = null;
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 0) {
            try {
                resetTouchBehaviors();
            } catch (RuntimeException e) {
                throw e;
            }
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (motionEvent2 != null) {
            try {
                motionEvent2.recycle();
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            try {
                resetTouchBehaviors();
            } catch (RuntimeException e22) {
                throw e22;
            }
        }
        return performIntercept;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setWindowInsets(android.support.v4.view.WindowInsetsCompat r4) {
        /*
        r3 = this;
        r0 = 1;
        r1 = 0;
        r2 = r3.mLastInsets;	 Catch:{ RuntimeException -> 0x0027 }
        if (r2 == r4) goto L_0x0026;
    L_0x0006:
        r3.mLastInsets = r4;	 Catch:{ RuntimeException -> 0x0029 }
        if (r4 == 0) goto L_0x002d;
    L_0x000a:
        r2 = r4.getSystemWindowInsetTop();	 Catch:{ RuntimeException -> 0x002b }
        if (r2 <= 0) goto L_0x002d;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        r3.mDrawStatusBarBackground = r2;	 Catch:{ RuntimeException -> 0x002f }
        r2 = r3.mDrawStatusBarBackground;	 Catch:{ RuntimeException -> 0x002f }
        if (r2 != 0) goto L_0x0033;
    L_0x0017:
        r2 = r3.getBackground();	 Catch:{ RuntimeException -> 0x0031 }
        if (r2 != 0) goto L_0x0033;
    L_0x001d:
        r3.setWillNotDraw(r0);
        r3.dispatchChildApplyWindowInsets(r4);
        r3.requestLayout();
    L_0x0026:
        return;
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r2 = r1;
        goto L_0x0011;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        r0 = r1;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.setWindowInsets(android.support.v4.view.WindowInsetsCompat):void");
    }

    public boolean isPointInChildBounds(View view, int i, int i2) {
        Rect rect = this.mTempRect1;
        getDescendantRect(view, rect);
        return rect.contains(i, i2);
    }

    private static int resolveKeylineGravity(int i) {
        return i == 0 ? 8388661 : i;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartNestedScroll(android.view.View r12, android.view.View r13, int r14) {
        /*
        r11 = this;
        r0 = 0;
        r9 = a;
        r10 = r11.getChildCount();
        r8 = r0;
        r7 = r0;
    L_0x0009:
        if (r8 >= r10) goto L_0x003b;
    L_0x000b:
        r2 = r11.getChildAt(r8);
        r0 = r2.getLayoutParams();
        r6 = r0;
        r6 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r6;
        r0 = r6.getBehavior();
        if (r0 == 0) goto L_0x0039;
    L_0x001c:
        r1 = r11;
        r3 = r12;
        r4 = r13;
        r5 = r14;
        r1 = r0.onStartNestedScroll(r1, r2, r3, r4, r5);
        r0 = r7 | r1;
        r6.acceptNestedScroll(r1);	 Catch:{ RuntimeException -> 0x0034 }
        if (r9 == 0) goto L_0x002f;
    L_0x002b:
        r1 = 0;
        r6.acceptNestedScroll(r1);	 Catch:{ RuntimeException -> 0x0034 }
    L_0x002f:
        r1 = r8 + 1;
        if (r9 == 0) goto L_0x0036;
    L_0x0033:
        return r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r8 = r1;
        r7 = r0;
        goto L_0x0009;
    L_0x0039:
        r0 = r7;
        goto L_0x002b;
    L_0x003b:
        r0 = r7;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onStartNestedScroll(android.view.View, android.view.View, int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean performIntercept(android.view.MotionEvent r23, int r24) {
        /*
        r22 = this;
        r17 = a;
        r14 = 0;
        r6 = 0;
        r5 = 0;
        r18 = android.support.v4.view.MotionEventCompat.getActionMasked(r23);
        r0 = r22;
        r0 = r0.mTempList1;
        r19 = r0;
        r0 = r22;
        r1 = r19;
        r0.getTopSortedChildren(r1);
        r20 = r19.size();
        r4 = 0;
        r15 = r4;
        r16 = r6;
    L_0x001e:
        r0 = r20;
        if (r15 >= r0) goto L_0x00b5;
    L_0x0022:
        r0 = r19;
        r4 = r0.get(r15);
        r12 = r4;
        r12 = (android.view.View) r12;
        r4 = r12.getLayoutParams();
        r13 = r4;
        r13 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r13;
        r21 = r13.getBehavior();
        if (r14 != 0) goto L_0x003a;
    L_0x0038:
        if (r16 == 0) goto L_0x00b3;
    L_0x003a:
        if (r18 == 0) goto L_0x00b3;
    L_0x003c:
        if (r21 == 0) goto L_0x00ae;
    L_0x003e:
        if (r5 != 0) goto L_0x00ac;
    L_0x0040:
        r4 = android.os.SystemClock.uptimeMillis();
        r8 = 3;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r6 = r4;
        r6 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11);
    L_0x004d:
        switch(r24) {
            case 0: goto L_0x007e;
            case 1: goto L_0x0087;
            default: goto L_0x0050;
        };
    L_0x0050:
        if (r17 == 0) goto L_0x00c2;
    L_0x0052:
        if (r14 != 0) goto L_0x00c0;
    L_0x0054:
        if (r21 == 0) goto L_0x00c0;
    L_0x0056:
        switch(r24) {
            case 0: goto L_0x0091;
            case 1: goto L_0x009d;
            default: goto L_0x0059;
        };
    L_0x0059:
        r4 = r14;
    L_0x005a:
        if (r4 == 0) goto L_0x0060;
    L_0x005c:
        r0 = r22;
        r0.mBehaviorTouchView = r12;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x0060:
        r5 = r13.didBlockInteraction();
        r0 = r22;
        r7 = r13.isBlockingInteractionBelow(r0, r12);
        if (r7 == 0) goto L_0x00aa;
    L_0x006c:
        if (r5 != 0) goto L_0x00aa;
    L_0x006e:
        r5 = 1;
    L_0x006f:
        if (r7 == 0) goto L_0x00be;
    L_0x0071:
        if (r5 != 0) goto L_0x00be;
    L_0x0073:
        if (r17 == 0) goto L_0x007a;
    L_0x0075:
        r7 = r5;
    L_0x0076:
        r5 = r15 + 1;
        if (r17 == 0) goto L_0x00b7;
    L_0x007a:
        r19.clear();
        return r4;
    L_0x007e:
        r0 = r21;
        r1 = r22;
        r0.onInterceptTouchEvent(r1, r12, r6);	 Catch:{ RuntimeException -> 0x008f }
        if (r17 == 0) goto L_0x0050;
    L_0x0087:
        r0 = r21;
        r1 = r22;
        r0.onTouchEvent(r1, r12, r6);	 Catch:{ RuntimeException -> 0x008f }
        goto L_0x0050;
    L_0x008f:
        r4 = move-exception;
        throw r4;
    L_0x0091:
        r0 = r21;
        r1 = r22;
        r2 = r23;
        r4 = r0.onInterceptTouchEvent(r1, r12, r2);
        if (r17 == 0) goto L_0x005a;
    L_0x009d:
        r0 = r21;
        r1 = r22;
        r2 = r23;
        r4 = r0.onTouchEvent(r1, r12, r2);
        goto L_0x005a;
    L_0x00a8:
        r4 = move-exception;
        throw r4;
    L_0x00aa:
        r5 = 0;
        goto L_0x006f;
    L_0x00ac:
        r6 = r5;
        goto L_0x004d;
    L_0x00ae:
        r6 = r5;
        r7 = r16;
        r4 = r14;
        goto L_0x0076;
    L_0x00b3:
        r6 = r5;
        goto L_0x0052;
    L_0x00b5:
        r4 = r14;
        goto L_0x007a;
    L_0x00b7:
        r15 = r5;
        r16 = r7;
        r14 = r4;
        r5 = r6;
        goto L_0x001e;
    L_0x00be:
        r7 = r5;
        goto L_0x0076;
    L_0x00c0:
        r4 = r14;
        goto L_0x0060;
    L_0x00c2:
        r7 = r16;
        r4 = r14;
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.performIntercept(android.view.MotionEvent, int):boolean");
    }

    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            resetTouchBehaviors();
            if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
                getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
            }
            try {
                if (this.mNestedScrollingTarget != null) {
                    onStopNestedScroll(this.mNestedScrollingTarget);
                }
                this.mIsAttachedToWindow = false;
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        r11 = this;
        r4 = 3;
        r10 = 1;
        r5 = 0;
        r7 = 0;
        r2 = 0;
        r9 = android.support.v4.view.MotionEventCompat.getActionMasked(r12);
        r0 = r11.mBehaviorTouchView;
        if (r0 != 0) goto L_0x006b;
    L_0x000d:
        r0 = r11.performIntercept(r12, r10);
        if (r0 == 0) goto L_0x0068;
    L_0x0013:
        r1 = r0;
    L_0x0014:
        r0 = r11.mBehaviorTouchView;
        r0 = r0.getLayoutParams();
        r0 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r0;
        r0 = r0.getBehavior();
        if (r0 == 0) goto L_0x0066;
    L_0x0022:
        r3 = r11.mBehaviorTouchView;
        r0 = r0.onTouchEvent(r11, r3, r12);
    L_0x0028:
        r3 = r11.mBehaviorTouchView;
        if (r3 != 0) goto L_0x0035;
    L_0x002c:
        r3 = super.onTouchEvent(r12);
        r0 = r0 | r3;
        r3 = a;	 Catch:{ RuntimeException -> 0x005a }
        if (r3 == 0) goto L_0x0049;
    L_0x0035:
        r8 = r0;
        if (r1 == 0) goto L_0x0064;
    L_0x0038:
        if (r2 != 0) goto L_0x0062;
    L_0x003a:
        r0 = android.os.SystemClock.uptimeMillis();
        r2 = r0;
        r6 = r5;
        r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7);
    L_0x0044:
        super.onTouchEvent(r0);
        r2 = r0;
        r0 = r8;
    L_0x0049:
        if (r0 != 0) goto L_0x004d;
    L_0x004b:
        if (r9 != 0) goto L_0x004d;
    L_0x004d:
        if (r2 == 0) goto L_0x0052;
    L_0x004f:
        r2.recycle();	 Catch:{ RuntimeException -> 0x005e }
    L_0x0052:
        if (r9 == r10) goto L_0x0056;
    L_0x0054:
        if (r9 != r4) goto L_0x0059;
    L_0x0056:
        r11.resetTouchBehaviors();	 Catch:{ RuntimeException -> 0x0060 }
    L_0x0059:
        return r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = r2;
        goto L_0x0044;
    L_0x0064:
        r0 = r8;
        goto L_0x0049;
    L_0x0066:
        r0 = r7;
        goto L_0x0028;
    L_0x0068:
        r1 = r0;
        r0 = r7;
        goto L_0x0028;
    L_0x006b:
        r1 = r7;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    static Behavior parseBehavior(Context context, AttributeSet attributeSet, String str) {
        boolean z = a;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Map map;
            HashMap hashMap;
            Map map2;
            Constructor constructor;
            if (str.startsWith(".")) {
                String str2 = context.getPackageName() + str;
                if (!z) {
                    str = str2;
                    map = (Map) sConstructors.get();
                    if (map != null) {
                        hashMap = new HashMap();
                        sConstructors.set(hashMap);
                        map2 = hashMap;
                    } else {
                        map2 = map;
                    }
                    constructor = (Constructor) map2.get(str);
                    if (constructor == null) {
                        constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                        constructor.setAccessible(true);
                        map2.put(str, constructor);
                    }
                    return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
                }
            }
            try {
                if (str.indexOf(46) < 0 || z) {
                    try {
                        if (!TextUtils.isEmpty(WIDGET_PACKAGE_NAME)) {
                            str = WIDGET_PACKAGE_NAME + '.' + str;
                        }
                    } catch (Exception e) {
                        throw e;
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
                try {
                    map = (Map) sConstructors.get();
                    if (map != null) {
                        map2 = map;
                    } else {
                        hashMap = new HashMap();
                        sConstructors.set(hashMap);
                        map2 = hashMap;
                    }
                    constructor = (Constructor) map2.get(str);
                    if (constructor == null) {
                        constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                        constructor.setAccessible(true);
                        map2.put(str, constructor);
                    }
                    return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Throwable e3) {
                    throw new RuntimeException(z[0] + str, e3);
                }
            } catch (Exception e22) {
                throw e22;
            }
        } catch (Exception e222) {
            throw e222;
        }
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    private static int resolveAnchoredChildGravity(int i) {
        return i == 0 ? 17 : i;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        try {
            super.requestDisallowInterceptTouchEvent(z);
            if (z) {
                resetTouchBehaviors();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        try {
            if (layoutParams.mBehavior != null) {
                if (layoutParams.mBehavior.getScrimOpacity(this, view) > 0.0f) {
                    try {
                        if (this.mScrimPaint == null) {
                            this.mScrimPaint = new Paint();
                        }
                        this.mScrimPaint.setColor(layoutParams.mBehavior.getScrimColor(this, view));
                        canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.mScrimPaint);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            }
            return super.drawChild(canvas, view, j);
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Object obj;
        boolean z = a;
        int childCount = getChildCount();
        Object obj2 = null;
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            try {
                int i6;
                if (layoutParams.isNestedScrollAccepted() || z) {
                    Behavior behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4);
                        obj = 1;
                        i6 = i5 + 1;
                        if (z) {
                            break;
                        }
                        i5 = i6;
                        obj2 = obj;
                    }
                }
                obj = obj2;
                i6 = i5 + 1;
                if (z) {
                    break;
                }
                i5 = i6;
                obj2 = obj;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        obj = obj2;
        if (obj != null) {
            try {
                dispatchOnDependentViewChanged(true);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int max;
        int i3;
        Object obj;
        boolean z = a;
        int i4 = 0;
        int i5 = 0;
        Object obj2 = null;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            try {
                int i7;
                if (layoutParams.isNestedScrollAccepted() || z) {
                    Behavior behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        try {
                            int[] iArr2 = this.mTempIntPair;
                            this.mTempIntPair[1] = 0;
                            iArr2[0] = 0;
                            behavior.onNestedPreScroll(this, childAt, view, i, i2, this.mTempIntPair);
                            int max2 = i > 0 ? Math.max(i4, this.mTempIntPair[0]) : Math.min(i4, this.mTempIntPair[0]);
                            if (i2 > 0) {
                                try {
                                    max = Math.max(i5, this.mTempIntPair[1]);
                                } catch (RuntimeException e) {
                                    throw e;
                                }
                            }
                            max = Math.min(i5, this.mTempIntPair[1]);
                            i3 = max2;
                            obj = 1;
                            i7 = i6 + 1;
                            if (z) {
                                break;
                            }
                            i6 = i7;
                            i5 = max;
                            i4 = i3;
                            obj2 = obj;
                        } catch (RuntimeException e2) {
                            throw e2;
                        }
                    }
                }
                obj = obj2;
                i3 = i4;
                max = i5;
                i7 = i6 + 1;
                if (z) {
                    break;
                }
                i6 = i7;
                i5 = max;
                i4 = i3;
                obj2 = obj;
            } catch (RuntimeException e22) {
                throw e22;
            }
        }
        obj = obj2;
        i3 = i4;
        max = i5;
        try {
            iArr[0] = i3;
            iArr[1] = max;
            if (obj != null) {
                dispatchOnDependentViewChanged(true);
            }
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    public List getDependencies(View view) {
        boolean z = a;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        List list = this.mTempDependenciesList;
        list.clear();
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt != view || z) {
                try {
                    if (layoutParams.dependsOn(this, view, childAt)) {
                        list.add(childAt);
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            i++;
            if (z) {
                break;
            }
        }
        return list;
    }

    boolean hasDependencies(View view) {
        boolean z = a;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        try {
            if (layoutParams.mAnchorView != null) {
                return true;
            }
            int childCount = getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = getChildAt(i);
                if (childAt != view || z) {
                    try {
                        if (layoutParams.dependsOn(this, view, childAt)) {
                            return true;
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void getDesiredAnchoredChildRect(android.view.View r10, int r11, android.graphics.Rect r12, android.graphics.Rect r13) {
        /*
        r9 = this;
        r4 = a;
        r0 = r10.getLayoutParams();
        r0 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r0;
        r1 = r0.gravity;
        r1 = resolveAnchoredChildGravity(r1);
        r1 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r1, r11);
        r2 = r0.anchorGravity;
        r2 = resolveGravity(r2);
        r2 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r2, r11);
        r3 = r1 & 7;
        r5 = r1 & 112;
        r1 = r2 & 7;
        r2 = r2 & 112;
        r6 = r10.getMeasuredWidth();
        r7 = r10.getMeasuredHeight();
        switch(r1) {
            case 1: goto L_0x0037;
            case 5: goto L_0x0033;
            default: goto L_0x002f;
        };
    L_0x002f:
        r1 = r12.left;
        if (r4 == 0) goto L_0x0040;
    L_0x0033:
        r1 = r12.right;
        if (r4 == 0) goto L_0x0040;
    L_0x0037:
        r1 = r12.left;
        r8 = r12.width();
        r8 = r8 / 2;
        r1 = r1 + r8;
    L_0x0040:
        switch(r2) {
            case 16: goto L_0x004b;
            case 80: goto L_0x0047;
            default: goto L_0x0043;
        };
    L_0x0043:
        r2 = r12.top;
        if (r4 == 0) goto L_0x0054;
    L_0x0047:
        r2 = r12.bottom;
        if (r4 == 0) goto L_0x0054;
    L_0x004b:
        r2 = r12.top;
        r8 = r12.height();
        r8 = r8 / 2;
        r2 = r2 + r8;
    L_0x0054:
        switch(r3) {
            case 1: goto L_0x005c;
            case 5: goto L_0x005a;
            default: goto L_0x0057;
        };
    L_0x0057:
        r1 = r1 - r6;
        if (r4 == 0) goto L_0x00b1;
    L_0x005a:
        if (r4 == 0) goto L_0x00b1;
    L_0x005c:
        r3 = r6 / 2;
        r1 = r1 - r3;
        r3 = r1;
    L_0x0060:
        switch(r5) {
            case 16: goto L_0x00ad;
            case 80: goto L_0x00af;
            default: goto L_0x0063;
        };
    L_0x0063:
        r1 = r2 - r7;
        if (r4 == 0) goto L_0x006c;
    L_0x0067:
        if (r4 == 0) goto L_0x006c;
    L_0x0069:
        r2 = r7 / 2;
        r1 = r1 - r2;
    L_0x006c:
        r2 = r9.getWidth();
        r4 = r9.getHeight();
        r5 = r9.getPaddingLeft();
        r8 = r0.leftMargin;
        r5 = r5 + r8;
        r8 = r9.getPaddingRight();
        r2 = r2 - r8;
        r2 = r2 - r6;
        r8 = r0.rightMargin;
        r2 = r2 - r8;
        r2 = java.lang.Math.min(r3, r2);
        r2 = java.lang.Math.max(r5, r2);
        r3 = r9.getPaddingTop();
        r5 = r0.topMargin;
        r3 = r3 + r5;
        r5 = r9.getPaddingBottom();
        r4 = r4 - r5;
        r4 = r4 - r7;
        r0 = r0.bottomMargin;
        r0 = r4 - r0;
        r0 = java.lang.Math.min(r1, r0);
        r0 = java.lang.Math.max(r3, r0);
        r1 = r2 + r6;
        r3 = r0 + r7;
        r13.set(r2, r0, r1, r3);
        return;
    L_0x00ad:
        r1 = r2;
        goto L_0x0069;
    L_0x00af:
        r1 = r2;
        goto L_0x0067;
    L_0x00b1:
        r3 = r1;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.getDesiredAnchoredChildRect(android.view.View, int, android.graphics.Rect, android.graphics.Rect):void");
    }

    protected android.view.ViewGroup.LayoutParams m6generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    private void resetTouchBehaviors() {
        int i = 0;
        boolean z = a;
        if (this.mBehaviorTouchView != null) {
            Behavior behavior = ((LayoutParams) this.mBehaviorTouchView.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                behavior.onTouchEvent(this, this.mBehaviorTouchView, obtain);
                obtain.recycle();
            }
            this.mBehaviorTouchView = null;
        }
        int childCount = getChildCount();
        while (i < childCount) {
            ((LayoutParams) getChildAt(i).getLayoutParams()).resetTouchBehaviorTracking();
            i++;
            if (z) {
                return;
            }
        }
    }

    public void dispatchDependentViewsChanged(View view) {
        boolean z = a;
        int size = this.mDependencySortedChildren.size();
        int i = 0;
        Object obj = null;
        while (i < size) {
            int i2;
            Object obj2;
            View view2 = (View) this.mDependencySortedChildren.get(i);
            if (view2 == view) {
                if (z) {
                    obj = 1;
                } else {
                    int i3 = 1;
                    i2 = i + 1;
                    if (z) {
                        i = i2;
                        obj = obj2;
                    } else {
                        return;
                    }
                }
            }
            if (obj != null) {
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    try {
                        if (layoutParams.dependsOn(this, view2, view)) {
                            behavior.onDependentViewChanged(this, view2, view);
                            obj2 = obj;
                            i2 = i + 1;
                            if (z) {
                                i = i2;
                                obj = obj2;
                            } else {
                                return;
                            }
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            }
            obj2 = obj;
            i2 = i + 1;
            if (z) {
                i = i2;
                obj = obj2;
            } else {
                return;
            }
        }
    }
}
