package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.design.R;
import android.support.design.widget.CoordinatorLayout.DefaultBehavior;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.whatsapp.arj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;

@DefaultBehavior(Behavior.class)
public class AppBarLayout extends LinearLayout {
    private static final String z;
    private int mDownPreScrollRange;
    private int mDownScrollRange;
    boolean mHaveChildWithInterpolator;
    private WindowInsetsCompat mLastInsets;
    private final List mListeners;
    private int mPendingAction;
    private float mTargetElevation;
    private int mTotalScrollRange;

    class 1 implements OnApplyWindowInsetsListener {
        final AppBarLayout this$0;

        1(AppBarLayout appBarLayout) {
            this.this$0 = appBarLayout;
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            AppBarLayout.access$000(this.this$0, windowInsetsCompat);
            return windowInsetsCompat.consumeSystemWindowInsets();
        }
    }

    public class Behavior extends HeaderBehavior {
        private ValueAnimatorCompat mAnimator;
        private WeakReference mLastNestedScrollingChildRef;
        private int mOffsetDelta;
        private int mOffsetToChildIndexOnLayout;
        private boolean mOffsetToChildIndexOnLayoutIsMinHeight;
        private float mOffsetToChildIndexOnLayoutPerc;
        private DragCallback mOnDragCallback;
        private boolean mSkipNestedPreScroll;
        private boolean mWasFlung;

        class 1 implements AnimatorUpdateListener {
            final Behavior this$0;
            final AppBarLayout val$child;
            final CoordinatorLayout val$coordinatorLayout;

            public void onAnimationUpdate(ValueAnimatorCompat valueAnimatorCompat) {
                this.this$0.setHeaderTopBottomOffset(this.val$coordinatorLayout, this.val$child, valueAnimatorCompat.getAnimatedIntValue());
            }

            1(Behavior behavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.this$0 = behavior;
                this.val$coordinatorLayout = coordinatorLayout;
                this.val$child = appBarLayout;
            }
        }

        public abstract class DragCallback {
            public abstract boolean canDrag(@NonNull AppBarLayout appBarLayout);
        }

        public class SavedState extends BaseSavedState {
            public static final Creator CREATOR;
            boolean firstVisibileChildAtMinimumHeight;
            float firstVisibileChildPercentageShown;
            int firstVisibleChildIndex;

            final class 1 implements ParcelableCompatCreatorCallbacks {
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }

                1() {
                }

                public Object m24createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return createFromParcel(parcel, classLoader);
                }

                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                public Object[] m25newArray(int i) {
                    return newArray(i);
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel);
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibileChildPercentageShown = parcel.readFloat();
                this.firstVisibileChildAtMinimumHeight = parcel.readByte() != null;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibileChildPercentageShown);
                parcel.writeByte((byte) (this.firstVisibileChildAtMinimumHeight ? 1 : 0));
            }

            static {
                CREATOR = ParcelableCompat.newCreator(new 1());
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public Behavior() {
            this.mOffsetToChildIndexOnLayout = -1;
        }

        int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return setHeaderTopBottomOffset(coordinatorLayout, (AppBarLayout) view, i, i2, i3);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onNestedFling(android.support.design.widget.CoordinatorLayout r9, android.support.design.widget.AppBarLayout r10, android.view.View r11, float r12, float r13, boolean r14) {
            /*
            r8 = this;
            r6 = 1;
            r4 = 0;
            r7 = android.support.design.widget.CoordinatorLayout.a;
            if (r14 != 0) goto L_0x0042;
        L_0x0006:
            r0 = r10.getTotalScrollRange();
            r3 = -r0;
            r5 = -r13;
            r0 = r8;
            r1 = r9;
            r2 = r10;
            r0 = r0.fling(r1, r2, r3, r4, r5);
            if (r7 == 0) goto L_0x003f;
        L_0x0015:
            r1 = 0;
            r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1));
            if (r1 >= 0) goto L_0x0030;
        L_0x001a:
            r1 = r10.getTotalScrollRange();
            r1 = -r1;
            r2 = android.support.design.widget.AppBarLayout.access$200(r10);
            r1 = r1 + r2;
            r2 = r8.getTopBottomOffsetForScrollingSibling();
            if (r2 >= r1) goto L_0x002e;
        L_0x002a:
            r8.animateOffsetTo(r9, r10, r1);
            r0 = r6;
        L_0x002e:
            if (r7 == 0) goto L_0x003f;
        L_0x0030:
            r1 = android.support.design.widget.AppBarLayout.access$300(r10);
            r1 = -r1;
            r2 = r8.getTopBottomOffsetForScrollingSibling();
            if (r2 <= r1) goto L_0x003f;
        L_0x003b:
            r8.animateOffsetTo(r9, r10, r1);
            r0 = r6;
        L_0x003f:
            r8.mWasFlung = r0;
            return r0;
        L_0x0042:
            r0 = r4;
            goto L_0x0015;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.Behavior.onNestedFling(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.view.View, float, float, boolean):boolean");
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
            onStopNestedScroll(coordinatorLayout, (AppBarLayout) view, view2);
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
            return onNestedFling(coordinatorLayout, (AppBarLayout) view, view2, f, f2, z);
        }

        private View getChildOnOffset(AppBarLayout appBarLayout, int i) {
            boolean z = CoordinatorLayout.a;
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = appBarLayout.getChildAt(i2);
                if (childAt.getTop() <= (-i) && childAt.getBottom() >= (-i)) {
                    return childAt;
                }
                int i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
            }
            return null;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            onRestoreInstanceState(coordinatorLayout, (AppBarLayout) view, parcelable);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void animateOffsetTo(android.support.design.widget.CoordinatorLayout r5, android.support.design.widget.AppBarLayout r6, int r7) {
            /*
            r4 = this;
            r0 = r4.getTopBottomOffsetForScrollingSibling();
            if (r0 != r7) goto L_0x0018;
        L_0x0006:
            r0 = r4.mAnimator;
            if (r0 == 0) goto L_0x0017;
        L_0x000a:
            r0 = r4.mAnimator;
            r0 = r0.isRunning();
            if (r0 == 0) goto L_0x0017;
        L_0x0012:
            r0 = r4.mAnimator;
            r0.cancel();
        L_0x0017:
            return;
        L_0x0018:
            r1 = r4.mAnimator;
            if (r1 != 0) goto L_0x0037;
        L_0x001c:
            r1 = android.support.design.widget.ViewUtils.createAnimator();
            r4.mAnimator = r1;
            r1 = r4.mAnimator;
            r2 = android.support.design.widget.AnimationUtils.DECELERATE_INTERPOLATOR;
            r1.setInterpolator(r2);
            r1 = r4.mAnimator;
            r2 = new android.support.design.widget.AppBarLayout$Behavior$1;
            r2.<init>(r4, r5, r6);
            r1.setUpdateListener(r2);
            r1 = android.support.design.widget.CoordinatorLayout.a;
            if (r1 == 0) goto L_0x003c;
        L_0x0037:
            r1 = r4.mAnimator;
            r1.cancel();
        L_0x003c:
            r1 = r0 - r7;
            r1 = java.lang.Math.abs(r1);
            r1 = (float) r1;
            r2 = r5.getResources();
            r2 = r2.getDisplayMetrics();
            r2 = r2.density;
            r1 = r1 / r2;
            r2 = r4.mAnimator;
            r3 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
            r1 = r1 * r3;
            r3 = 1133903872; // 0x43960000 float:300.0 double:5.60222949E-315;
            r1 = r1 / r3;
            r1 = java.lang.Math.round(r1);
            r2.setDuration(r1);
            r1 = r4.mAnimator;
            r1.setIntValues(r0, r7);
            r0 = r4.mAnimator;
            r0.start();
            goto L_0x0017;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.Behavior.animateOffsetTo(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int):void");
        }

        public int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        int getMaxDragOffset(AppBarLayout appBarLayout) {
            return -AppBarLayout.access$400(appBarLayout);
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            boolean z = false;
            boolean z2 = CoordinatorLayout.a;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset > 0 || bottom < 0) {
                    int i2 = i + 1;
                    if (z2) {
                        break;
                    }
                    i = i2;
                } else {
                    SavedState savedState = new SavedState(onSaveInstanceState);
                    savedState.firstVisibleChildIndex = i;
                    if (bottom == ViewCompat.getMinimumHeight(childAt)) {
                        z = true;
                    }
                    savedState.firstVisibileChildAtMinimumHeight = z;
                    savedState.firstVisibileChildPercentageShown = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return onSaveInstanceState;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, savedState.getSuperState());
                this.mOffsetToChildIndexOnLayout = savedState.firstVisibleChildIndex;
                this.mOffsetToChildIndexOnLayoutPerc = savedState.firstVisibileChildPercentageShown;
                this.mOffsetToChildIndexOnLayoutIsMinHeight = savedState.firstVisibileChildAtMinimumHeight;
                if (!CoordinatorLayout.a) {
                    return;
                }
            }
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
            this.mOffsetToChildIndexOnLayout = -1;
        }

        int getMaxDragOffset(View view) {
            return getMaxDragOffset((AppBarLayout) view);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mOffsetToChildIndexOnLayout = -1;
        }

        int getScrollRangeForDragFling(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        public boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
            onNestedPreScroll(coordinatorLayout, (AppBarLayout) view, view2, i, i2, iArr);
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i) {
            boolean z;
            if ((i & 2) == 0 || !AppBarLayout.access$100(appBarLayout) || coordinatorLayout.getHeight() - view.getHeight() > appBarLayout.getHeight()) {
                z = false;
            } else {
                z = true;
            }
            if (z && this.mAnimator != null) {
                this.mAnimator.cancel();
            }
            this.mLastNestedScrollingChildRef = null;
            return z;
        }

        private int interpolateOffset(AppBarLayout appBarLayout, int i) {
            boolean z = CoordinatorLayout.a;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                int height;
                View childAt = appBarLayout.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (scrollInterpolator == null) {
                        return i;
                    }
                    int scrollFlags = layoutParams.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        height = (layoutParams.bottomMargin + (childAt.getHeight() + layoutParams.topMargin)) + 0;
                        if ((scrollFlags & 2) != 0) {
                            height -= ViewCompat.getMinimumHeight(childAt);
                        }
                    } else {
                        height = 0;
                    }
                    if (ViewCompat.getFitsSystemWindows(childAt)) {
                        height -= AppBarLayout.access$900(appBarLayout);
                    }
                    if (height > 0) {
                        return Integer.signum(i) * (Math.round(scrollInterpolator.getInterpolation(((float) (abs - childAt.getTop())) / ((float) height)) * ((float) height)) + childAt.getTop());
                    } else if (!z) {
                        return i;
                    }
                }
                height = i2 + 1;
                if (z) {
                    return i;
                }
                i2 = height;
            }
            return i;
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4) {
            if (i4 < 0) {
                scroll(coordinatorLayout, appBarLayout, i4, -AppBarLayout.access$400(appBarLayout), 0);
                this.mSkipNestedPreScroll = true;
                if (!CoordinatorLayout.a) {
                    return;
                }
            }
            this.mSkipNestedPreScroll = false;
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
            onNestedScroll(coordinatorLayout, (AppBarLayout) view, view2, i, i2, i3, i4);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNestedPreScroll(android.support.design.widget.CoordinatorLayout r8, android.support.design.widget.AppBarLayout r9, android.view.View r10, int r11, int r12, int[] r13) {
            /*
            r7 = this;
            if (r12 == 0) goto L_0x0028;
        L_0x0002:
            r0 = r7.mSkipNestedPreScroll;
            if (r0 != 0) goto L_0x0028;
        L_0x0006:
            if (r12 >= 0) goto L_0x0017;
        L_0x0008:
            r0 = r9.getTotalScrollRange();
            r4 = -r0;
            r0 = android.support.design.widget.AppBarLayout.access$200(r9);
            r5 = r4 + r0;
            r0 = android.support.design.widget.CoordinatorLayout.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0017:
            r0 = android.support.design.widget.AppBarLayout.access$300(r9);
            r4 = -r0;
            r5 = 0;
        L_0x001d:
            r6 = 1;
            r0 = r7;
            r1 = r8;
            r2 = r9;
            r3 = r12;
            r0 = r0.scroll(r1, r2, r3, r4, r5);
            r13[r6] = r0;
        L_0x0028:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.Behavior.onNestedPreScroll(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.view.View, int, int, int[]):void");
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (!this.mWasFlung) {
                snapToChildIfNeeded(coordinatorLayout, appBarLayout);
            }
            this.mSkipNestedPreScroll = false;
            this.mWasFlung = false;
            this.mLastNestedScrollingChildRef = new WeakReference(view);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onLayoutChild(android.support.design.widget.CoordinatorLayout r7, android.support.design.widget.AppBarLayout r8, int r9) {
            /*
            r6 = this;
            r1 = 0;
            r2 = android.support.design.widget.CoordinatorLayout.a;
            r3 = super.onLayoutChild(r7, r8, r9);
            r4 = android.support.design.widget.AppBarLayout.access$500(r8);
            if (r4 == 0) goto L_0x0037;
        L_0x000d:
            r0 = r4 & 4;
            if (r0 == 0) goto L_0x006b;
        L_0x0011:
            r0 = 1;
        L_0x0012:
            r5 = r4 & 2;
            if (r5 == 0) goto L_0x0027;
        L_0x0016:
            r5 = android.support.design.widget.AppBarLayout.access$300(r8);
            r5 = -r5;
            if (r0 == 0) goto L_0x0022;
        L_0x001d:
            r6.animateOffsetTo(r7, r8, r5);
            if (r2 == 0) goto L_0x0025;
        L_0x0022:
            r6.setHeaderTopBottomOffset(r7, r8, r5);
        L_0x0025:
            if (r2 == 0) goto L_0x0035;
        L_0x0027:
            r4 = r4 & 1;
            if (r4 == 0) goto L_0x0035;
        L_0x002b:
            if (r0 == 0) goto L_0x0032;
        L_0x002d:
            r6.animateOffsetTo(r7, r8, r1);
            if (r2 == 0) goto L_0x0035;
        L_0x0032:
            r6.setHeaderTopBottomOffset(r7, r8, r1);
        L_0x0035:
            if (r2 == 0) goto L_0x0061;
        L_0x0037:
            r0 = r6.mOffsetToChildIndexOnLayout;
            if (r0 < 0) goto L_0x0061;
        L_0x003b:
            r0 = r6.mOffsetToChildIndexOnLayout;
            r1 = r8.getChildAt(r0);
            r0 = r1.getBottom();
            r0 = -r0;
            r4 = r6.mOffsetToChildIndexOnLayoutIsMinHeight;
            if (r4 == 0) goto L_0x0051;
        L_0x004a:
            r4 = android.support.v4.view.ViewCompat.getMinimumHeight(r1);
            r0 = r0 + r4;
            if (r2 == 0) goto L_0x005e;
        L_0x0051:
            r1 = r1.getHeight();
            r1 = (float) r1;
            r2 = r6.mOffsetToChildIndexOnLayoutPerc;
            r1 = r1 * r2;
            r1 = java.lang.Math.round(r1);
            r0 = r0 + r1;
        L_0x005e:
            r6.setTopAndBottomOffset(r0);
        L_0x0061:
            android.support.design.widget.AppBarLayout.access$600(r8);
            r0 = -1;
            r6.mOffsetToChildIndexOnLayout = r0;
            r6.dispatchOffsetUpdates(r8);
            return r3;
        L_0x006b:
            r0 = r1;
            goto L_0x0012;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.Behavior.onLayoutChild(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int):boolean");
        }

        int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.mOffsetDelta;
        }

        boolean canDragView(View view) {
            return canDragView((AppBarLayout) view);
        }

        private void dispatchOffsetUpdates(AppBarLayout appBarLayout) {
            boolean z = CoordinatorLayout.a;
            List access$800 = AppBarLayout.access$800(appBarLayout);
            int size = access$800.size();
            int i = 0;
            while (i < size) {
                OnOffsetChangedListener onOffsetChangedListener = (OnOffsetChangedListener) access$800.get(i);
                if (onOffsetChangedListener != null) {
                    onOffsetChangedListener.onOffsetChanged(appBarLayout, getTopAndBottomOffset());
                }
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return onLayoutChild(coordinatorLayout, (AppBarLayout) view, i);
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
            return onStartNestedScroll(coordinatorLayout, (AppBarLayout) view, view2, view3, i);
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            View childOnOffset = getChildOnOffset(appBarLayout, topBottomOffsetForScrollingSibling);
            if (childOnOffset != null) {
                LayoutParams layoutParams = (LayoutParams) childOnOffset.getLayoutParams();
                if ((layoutParams.getScrollFlags() & 17) == 17) {
                    int minimumHeight;
                    int i = -childOnOffset.getTop();
                    int i2 = -childOnOffset.getBottom();
                    if ((layoutParams.getScrollFlags() & 2) == 2) {
                        minimumHeight = ViewCompat.getMinimumHeight(childOnOffset) + i2;
                    } else {
                        minimumHeight = i2;
                    }
                    if (topBottomOffsetForScrollingSibling >= (minimumHeight + i) / 2) {
                        minimumHeight = i;
                    }
                    animateOffsetTo(coordinatorLayout, appBarLayout, MathUtils.constrain(minimumHeight, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (i2 == 0 || topBottomOffsetForScrollingSibling < i2 || topBottomOffsetForScrollingSibling > i3) {
                return 0;
            }
            int constrain = MathUtils.constrain(i, i2, i3);
            if (topBottomOffsetForScrollingSibling == constrain) {
                return 0;
            }
            int interpolateOffset;
            if (AppBarLayout.access$700(appBarLayout)) {
                interpolateOffset = interpolateOffset(appBarLayout, constrain);
            } else {
                interpolateOffset = constrain;
            }
            boolean topAndBottomOffset = setTopAndBottomOffset(interpolateOffset);
            topBottomOffsetForScrollingSibling -= constrain;
            this.mOffsetDelta = constrain - interpolateOffset;
            if (!topAndBottomOffset && AppBarLayout.access$700(appBarLayout)) {
                coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
            }
            dispatchOffsetUpdates(appBarLayout);
            return topBottomOffsetForScrollingSibling;
        }

        int getScrollRangeForDragFling(View view) {
            return getScrollRangeForDragFling((AppBarLayout) view);
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            return onSaveInstanceState(coordinatorLayout, (AppBarLayout) view);
        }

        boolean canDragView(AppBarLayout appBarLayout) {
            if (this.mOnDragCallback != null) {
                return this.mOnDragCallback.canDrag(appBarLayout);
            }
            if (this.mLastNestedScrollingChildRef == null) {
                return true;
            }
            View view = (View) this.mLastNestedScrollingChildRef.get();
            return (view == null || !view.isShown() || ViewCompat.canScrollVertically(view, -1)) ? false : true;
        }
    }

    public class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        int mScrollFlags;
        Interpolator mScrollInterpolator;

        public void setScrollFlags(int i) {
            this.mScrollFlags = i;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mScrollFlags = 1;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mScrollFlags = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_LayoutParams);
            this.mScrollFlags = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_LayoutParams_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(R.styleable.AppBarLayout_LayoutParams_layout_scrollInterpolator)) {
                this.mScrollInterpolator = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(R.styleable.AppBarLayout_LayoutParams_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public Interpolator getScrollInterpolator() {
            return this.mScrollInterpolator;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mScrollFlags = 1;
        }

        public int getScrollFlags() {
            return this.mScrollFlags;
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.mScrollFlags = 1;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mScrollFlags = 1;
        }
    }

    public interface OnOffsetChangedListener {
        void onOffsetChanged(AppBarLayout appBarLayout, int i);
    }

    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        private int mOverlayTop;

        public boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        View findFirstDependency(List list) {
            boolean z = CoordinatorLayout.a;
            int size = list.size();
            int i = 0;
            while (i < size) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return view;
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Params);
            this.mOverlayTop = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Params_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        int getScrollRange(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.getScrollRange(view);
        }

        private boolean updateOffset(CoordinatorLayout coordinatorLayout, View view, View view2) {
            android.support.design.widget.CoordinatorLayout.Behavior behavior = ((android.support.design.widget.CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (!(behavior instanceof Behavior)) {
                return false;
            }
            int topBottomOffsetForScrollingSibling = ((Behavior) behavior).getTopBottomOffsetForScrollingSibling();
            setTopAndBottomOffset((view2.getHeight() + topBottomOffsetForScrollingSibling) - getOverlapForOffset(view2, topBottomOffsetForScrollingSibling));
            return true;
        }

        private int getOverlapForOffset(View view, int i) {
            if (this.mOverlayTop != 0 && (view instanceof AppBarLayout)) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int access$200 = AppBarLayout.access$200(appBarLayout);
                if (access$200 != 0 && totalScrollRange + i <= access$200) {
                    return 0;
                }
                totalScrollRange -= access$200;
                if (totalScrollRange != 0) {
                    return MathUtils.constrain(Math.round(((((float) i) / ((float) totalScrollRange)) + 1.0f) * ((float) this.mOverlayTop)), 0, this.mOverlayTop);
                }
            }
            return this.mOverlayTop;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            updateOffset(coordinatorLayout, view, view2);
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            boolean z = CoordinatorLayout.a;
            super.onLayoutChild(coordinatorLayout, view, i);
            List dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i2 = 0;
            while (i2 < size && (!updateOffset(coordinatorLayout, view, (View) dependencies.get(i2)) || z)) {
                int i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
            }
            return true;
        }
    }

    static {
        char[] toCharArray = "D\\\u0014.\u0011w`\u0005\u0015\u001fpXD\u0005\u0003%M\b\u001b\u0011|_D\u001a\u0015wX\r\u000f\u0011i\f\u0005\u0002\u0014%H\u000b\t\u0003%B\u000b\u0018PvY\u0014\u001c\u001fwXD\u0004\u001fwE\u001e\u0003\u001eqM\bL\u001fwE\u0001\u0002\u0004dX\r\u0003\u001e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 5;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 100;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private int getPendingAction() {
        return this.mPendingAction;
    }

    protected android.view.ViewGroup.LayoutParams m18generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = CoordinatorLayout.a;
        super.onLayout(z, i, i2, i3, i4);
        invalidateScrollRanges();
        this.mHaveChildWithInterpolator = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).getScrollInterpolator() != null) {
                try {
                    this.mHaveChildWithInterpolator = true;
                    if (!z2) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            int i6 = i5 + 1;
            if (!z2) {
                i5 = i6;
            } else {
                return;
            }
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    static void access$600(AppBarLayout appBarLayout) {
        appBarLayout.resetPendingAction();
    }

    public float getTargetElevation() {
        return this.mTargetElevation;
    }

    protected android.widget.LinearLayout.LayoutParams m19generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    static int access$400(AppBarLayout appBarLayout) {
        return appBarLayout.getDownNestedScrollRange();
    }

    static int access$900(AppBarLayout appBarLayout) {
        return appBarLayout.getTopInset();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    static List access$800(AppBarLayout appBarLayout) {
        return appBarLayout.mListeners;
    }

    protected android.view.ViewGroup.LayoutParams m21generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    static int access$500(AppBarLayout appBarLayout) {
        return appBarLayout.getPendingAction();
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        if (onOffsetChangedListener != null) {
            try {
                if (!this.mListeners.contains(onOffsetChangedListener)) {
                    this.mListeners.add(onOffsetChangedListener);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    static void access$000(AppBarLayout appBarLayout, WindowInsetsCompat windowInsetsCompat) {
        appBarLayout.setWindowInsets(windowInsetsCompat);
    }

    private void setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        boolean z = CoordinatorLayout.a;
        this.mTotalScrollRange = -1;
        this.mLastInsets = windowInsetsCompat;
        int i = 0;
        int childCount = getChildCount();
        while (i < childCount) {
            windowInsetsCompat = ViewCompat.dispatchApplyWindowInsets(getChildAt(i), windowInsetsCompat);
            try {
                if (!windowInsetsCompat.isConsumed() || z) {
                    i++;
                    if (z) {
                        return;
                    }
                }
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    static boolean access$100(AppBarLayout appBarLayout) {
        return appBarLayout.hasScrollableChildren();
    }

    public void setOrientation(int i) {
        if (i != 1) {
            try {
                throw new IllegalArgumentException(z);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        super.setOrientation(i);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        if (onOffsetChangedListener != null) {
            try {
                this.mListeners.remove(onOffsetChangedListener);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private boolean hasScrollableChildren() {
        try {
            return getTotalScrollRange() != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                return new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
            }
            try {
                return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static int access$200(AppBarLayout appBarLayout) {
        return appBarLayout.getDownNestedPreScrollRange();
    }

    private boolean hasChildWithInterpolator() {
        return this.mHaveChildWithInterpolator;
    }

    static int access$300(AppBarLayout appBarLayout) {
        return appBarLayout.getUpNestedPreScrollRange();
    }

    private int getTopInset() {
        try {
            return this.mLastInsets != null ? this.mLastInsets.getSystemWindowInsetTop() : 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public android.widget.LinearLayout.LayoutParams m22generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    private int getDownNestedScrollRange() {
        boolean z = CoordinatorLayout.a;
        try {
            if (this.mDownScrollRange != -1) {
                return this.mDownScrollRange;
            }
            int i;
            int childCount = getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + (layoutParams.topMargin + layoutParams.bottomMargin);
                int i4 = layoutParams.mScrollFlags;
                if ((i4 & 1) == 0) {
                    break;
                }
                i = i3 + measuredHeight;
                if ((i4 & 2) != 0) {
                    i -= ViewCompat.getMinimumHeight(childAt) + getTopInset();
                    if (!z) {
                        break;
                    }
                }
                i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
                i3 = i;
            }
            i = i3;
            i = Math.max(0, i);
            this.mDownScrollRange = i;
            return i;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected android.widget.LinearLayout.LayoutParams m23generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    static boolean access$700(AppBarLayout appBarLayout) {
        return appBarLayout.hasChildWithInterpolator();
    }

    final int getMinimumHeightForVisibleOverlappingContent() {
        try {
            int systemWindowInsetTop;
            if (this.mLastInsets != null) {
                systemWindowInsetTop = this.mLastInsets.getSystemWindowInsetTop();
            } else {
                systemWindowInsetTop = 0;
            }
            int minimumHeight = ViewCompat.getMinimumHeight(this);
            if (minimumHeight != 0) {
                return (minimumHeight * 2) + systemWindowInsetTop;
            }
            minimumHeight = getChildCount();
            if (minimumHeight < 1) {
                return 0;
            }
            try {
                return (ViewCompat.getMinimumHeight(getChildAt(minimumHeight - 1)) * 2) + systemWindowInsetTop;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getDownNestedPreScrollRange() {
        /*
        r9 = this;
        r3 = android.support.design.widget.CoordinatorLayout.a;
        r0 = r9.mDownPreScrollRange;	 Catch:{ IllegalArgumentException -> 0x000a }
        r1 = -1;
        if (r0 == r1) goto L_0x000c;
    L_0x0007:
        r0 = r9.mDownPreScrollRange;	 Catch:{ IllegalArgumentException -> 0x000a }
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r1 = 0;
        r0 = r9.getChildCount();
        r0 = r0 + -1;
        r2 = r0;
    L_0x0014:
        if (r2 < 0) goto L_0x004f;
    L_0x0016:
        r4 = r9.getChildAt(r2);
        r0 = r4.getLayoutParams();
        r0 = (android.support.design.widget.AppBarLayout.LayoutParams) r0;
        r5 = r4.getMeasuredHeight();
        r6 = r0.mScrollFlags;
        r7 = r6 & 5;
        r8 = 5;
        if (r7 != r8) goto L_0x004d;
    L_0x002b:
        r7 = r0.topMargin;
        r0 = r0.bottomMargin;
        r0 = r0 + r7;
        r0 = r0 + r1;
        r1 = r6 & 8;
        if (r1 == 0) goto L_0x003c;
    L_0x0035:
        r1 = android.support.v4.view.ViewCompat.getMinimumHeight(r4);
        r0 = r0 + r1;
        if (r3 == 0) goto L_0x0043;
    L_0x003c:
        r0 = r0 + r5;
        if (r3 == 0) goto L_0x0043;
    L_0x003f:
        if (r0 <= 0) goto L_0x0043;
    L_0x0041:
        if (r3 == 0) goto L_0x0047;
    L_0x0043:
        r1 = r2 + -1;
        if (r3 == 0) goto L_0x004a;
    L_0x0047:
        r9.mDownPreScrollRange = r0;
        goto L_0x0009;
    L_0x004a:
        r2 = r1;
        r1 = r0;
        goto L_0x0014;
    L_0x004d:
        r0 = r1;
        goto L_0x003f;
    L_0x004f:
        r0 = r1;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    private int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void setExpanded(boolean z, boolean z2) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        this.mPendingAction = i2 | i;
        requestLayout();
    }

    private void resetPendingAction() {
        this.mPendingAction = 0;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        invalidateScrollRanges();
    }

    public android.view.ViewGroup.LayoutParams m20generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    private void invalidateScrollRanges() {
        this.mTotalScrollRange = -1;
        this.mDownPreScrollRange = -1;
        this.mDownScrollRange = -1;
    }

    public final int getTotalScrollRange() {
        boolean z = CoordinatorLayout.a;
        try {
            if (this.mTotalScrollRange != -1) {
                return this.mTotalScrollRange;
            }
            int i;
            int childCount = getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.mScrollFlags;
                if ((i4 & 1) == 0) {
                    break;
                }
                i = (layoutParams.bottomMargin + (measuredHeight + layoutParams.topMargin)) + i3;
                if ((i4 & 2) != 0) {
                    i -= ViewCompat.getMinimumHeight(childAt);
                    if (!z) {
                        break;
                    }
                }
                i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
                i3 = i;
            }
            i = i3;
            i = Math.max(0, i - getTopInset());
            this.mTotalScrollRange = i;
            return i;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setExpanded(boolean z) {
        setExpanded(z, ViewCompat.isLaidOut(this));
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTotalScrollRange = -1;
        this.mDownPreScrollRange = -1;
        this.mDownScrollRange = -1;
        this.mPendingAction = 0;
        setOrientation(1);
        ThemeUtils.checkAppCompatTheme(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout, 0, R.style.Widget_Design_AppBarLayout);
        try {
            this.mTargetElevation = (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppBarLayout_elevation, 0);
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(R.styleable.AppBarLayout_android_background));
            if (obtainStyledAttributes.hasValue(R.styleable.AppBarLayout_expanded)) {
                setExpanded(obtainStyledAttributes.getBoolean(R.styleable.AppBarLayout_expanded, false));
            }
            obtainStyledAttributes.recycle();
            ViewUtils.setBoundsViewOutlineProvider(this);
            this.mListeners = new ArrayList();
            ViewCompat.setElevation(this, this.mTargetElevation);
            ViewCompat.setOnApplyWindowInsetsListener(this, new 1(this));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
