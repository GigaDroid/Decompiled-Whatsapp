package android.support.v7.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.helper.ItemTouchHelper.ViewDropHandler;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.whatsapp.arj;
import java.util.List;
import org.v;
import org.whispersystems.at;

public class LinearLayoutManager extends LayoutManager implements ViewDropHandler {
    private static final String z;
    final AnchorInfo mAnchorInfo;
    private boolean mLastStackFromEnd;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    class AnchorInfo {
        private static final String[] z;
        int mCoordinate;
        boolean mLayoutFromEnd;
        int mPosition;
        final LinearLayoutManager this$0;

        static {
            String[] strArr = new String[3];
            String str = ";\"UWWxp\\}Vvv])";
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
                            i3 = 23;
                            break;
                        case at.g /*1*/:
                            i3 = 2;
                            break;
                        case at.i /*2*/:
                            i3 = 56;
                            break;
                        case at.o /*3*/:
                            i3 = 20;
                            break;
                        default:
                            i3 = 56;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = ";\"UXYnmM`~emUQVs?";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "Vl[|WeKVrWloh{K~vQ{V*";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        static boolean access$000(AnchorInfo anchorInfo, View view, State state) {
            return anchorInfo.isViewValidAsAnchor(view, state);
        }

        public void assignFromViewAndKeepVisibleRect(View view) {
            int totalSpaceChange = this.this$0.mOrientationHelper.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                assignFromView(view);
                return;
            }
            int endAfterPadding;
            int decoratedMeasurement;
            this.mPosition = this.this$0.getPosition(view);
            if (this.mLayoutFromEnd) {
                endAfterPadding = (this.this$0.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - this.this$0.mOrientationHelper.getDecoratedEnd(view);
                this.mCoordinate = this.this$0.mOrientationHelper.getEndAfterPadding() - endAfterPadding;
                if (endAfterPadding > 0) {
                    decoratedMeasurement = this.mCoordinate - this.this$0.mOrientationHelper.getDecoratedMeasurement(view);
                    int startAfterPadding = this.this$0.mOrientationHelper.getStartAfterPadding();
                    decoratedMeasurement -= startAfterPadding + Math.min(this.this$0.mOrientationHelper.getDecoratedStart(view) - startAfterPadding, 0);
                    if (decoratedMeasurement < 0) {
                        this.mCoordinate = Math.min(endAfterPadding, -decoratedMeasurement) + this.mCoordinate;
                    }
                }
                if (ViewHolder.a == 0) {
                    return;
                }
            }
            endAfterPadding = this.this$0.mOrientationHelper.getDecoratedStart(view);
            decoratedMeasurement = endAfterPadding - this.this$0.mOrientationHelper.getStartAfterPadding();
            this.mCoordinate = endAfterPadding;
            if (decoratedMeasurement > 0) {
                totalSpaceChange = (this.this$0.mOrientationHelper.getEndAfterPadding() - Math.min(0, (this.this$0.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - this.this$0.mOrientationHelper.getDecoratedEnd(view))) - (endAfterPadding + this.this$0.mOrientationHelper.getDecoratedMeasurement(view));
                if (totalSpaceChange < 0) {
                    this.mCoordinate -= Math.min(decoratedMeasurement, -totalSpaceChange);
                }
            }
        }

        private boolean isViewValidAsAnchor(View view, State state) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return !layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < state.getItemCount();
        }

        void assignCoordinateFromPadding() {
            int endAfterPadding;
            if (this.mLayoutFromEnd) {
                endAfterPadding = this.this$0.mOrientationHelper.getEndAfterPadding();
            } else {
                endAfterPadding = this.this$0.mOrientationHelper.getStartAfterPadding();
            }
            this.mCoordinate = endAfterPadding;
        }

        public String toString() {
            return z[1] + this.mPosition + z[0] + this.mCoordinate + z[2] + this.mLayoutFromEnd + '}';
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void assignFromView(android.view.View r3) {
            /*
            r2 = this;
            r0 = r2.mLayoutFromEnd;
            if (r0 == 0) goto L_0x001b;
        L_0x0004:
            r0 = r2.this$0;
            r0 = r0.mOrientationHelper;
            r0 = r0.getDecoratedEnd(r3);
            r1 = r2.this$0;
            r1 = r1.mOrientationHelper;
            r1 = r1.getTotalSpaceChange();
            r0 = r0 + r1;
            r2.mCoordinate = r0;
            r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            if (r0 == 0) goto L_0x0025;
        L_0x001b:
            r0 = r2.this$0;
            r0 = r0.mOrientationHelper;
            r0 = r0.getDecoratedStart(r3);
            r2.mCoordinate = r0;
        L_0x0025:
            r0 = r2.this$0;
            r0 = r0.getPosition(r3);
            r2.mPosition = r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.AnchorInfo.assignFromView(android.view.View):void");
        }

        AnchorInfo(LinearLayoutManager linearLayoutManager) {
            this.this$0 = linearLayoutManager;
        }

        void reset() {
            this.mPosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
        }
    }

    public class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        void resetInternal() {
            this.mConsumed = 0;
            this.mFinished = false;
            this.mIgnoreConsumed = false;
            this.mFocusable = false;
        }

        protected LayoutChunkResult() {
        }
    }

    class LayoutState {
        int mAvailable;
        int mCurrentPosition;
        int mExtra;
        boolean mIsPreLayout;
        int mItemDirection;
        int mLastScrollDelta;
        int mLayoutDirection;
        int mOffset;
        boolean mRecycle;
        List mScrapList;
        int mScrollingOffset;

        public void assignPositionFromScrapList(View view) {
            View nextViewInLimitedList = nextViewInLimitedList(view);
            if (nextViewInLimitedList == null) {
                this.mCurrentPosition = -1;
                if (ViewHolder.a == 0) {
                    return;
                }
            }
            this.mCurrentPosition = ((LayoutParams) nextViewInLimitedList.getLayoutParams()).getViewLayoutPosition();
        }

        boolean hasMore(State state) {
            return this.mCurrentPosition >= 0 && this.mCurrentPosition < state.getItemCount();
        }

        LayoutState() {
            this.mRecycle = true;
            this.mExtra = 0;
            this.mIsPreLayout = false;
            this.mScrapList = null;
        }

        View next(Recycler recycler) {
            if (this.mScrapList != null) {
                return nextViewFromScrapList();
            }
            View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
            this.mCurrentPosition += this.mItemDirection;
            return viewForPosition;
        }

        public void assignPositionFromScrapList() {
            assignPositionFromScrapList(null);
        }

        public View nextViewInLimitedList(View view) {
            int i = ViewHolder.a;
            int size = this.mScrapList.size();
            View view2 = null;
            int i2 = 0;
            int i3 = Integer.MAX_VALUE;
            while (i2 < size) {
                int i4;
                View view3;
                int i5;
                View view4 = ((ViewHolder) this.mScrapList.get(i2)).itemView;
                LayoutParams layoutParams = (LayoutParams) view4.getLayoutParams();
                if (!(view4 == view || (layoutParams.isItemRemoved() && i == 0))) {
                    int viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.mCurrentPosition) * this.mItemDirection;
                    if ((viewLayoutPosition >= 0 || i != 0) && viewLayoutPosition < i3) {
                        if (viewLayoutPosition == 0 && i == 0) {
                            return view4;
                        }
                        i4 = viewLayoutPosition;
                        view3 = view4;
                        i5 = i2 + 1;
                        if (i != 0) {
                            return view3;
                        }
                        i2 = i5;
                        i3 = i4;
                        view2 = view3;
                    }
                }
                view3 = view2;
                i4 = i3;
                i5 = i2 + 1;
                if (i != 0) {
                    return view3;
                }
                i2 = i5;
                i3 = i4;
                view2 = view3;
            }
            return view2;
        }

        private View nextViewFromScrapList() {
            int i = ViewHolder.a;
            int size = this.mScrapList.size();
            int i2 = 0;
            while (i2 < size) {
                View view = ((ViewHolder) this.mScrapList.get(i2)).itemView;
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (!(layoutParams.isItemRemoved() && i == 0) && this.mCurrentPosition == layoutParams.getViewLayoutPosition()) {
                    assignPositionFromScrapList(view);
                    return view;
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            return null;
        }
    }

    public class SavedState implements Parcelable {
        public static final Creator CREATOR;
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        final class 1 implements Creator {
            1() {
            }

            public Object m83createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] m84newArray(int i) {
                return newArray(i);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        SavedState(Parcel parcel) {
            boolean z = true;
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.mAnchorLayoutFromEnd = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            if (this.mAnchorLayoutFromEnd) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
        }

        boolean hasValidAnchor() {
            return this.mAnchorPosition >= 0;
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }

        public int describeContents() {
            return 0;
        }

        static {
            CREATOR = new 1();
        }
    }

    static {
        char[] toCharArray = "~'\"\u001e\u0019~-t\u0010\u0007~,:\u000b\u0014c ;\u0011O".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 127;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private int computeScrollOffset(State state) {
        boolean z = false;
        try {
            if (getChildCount() == 0) {
                return 0;
            }
            try {
                ensureLayoutState();
                OrientationHelper orientationHelper = this.mOrientationHelper;
                try {
                    View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
                    if (!this.mSmoothScrollbarEnabled) {
                        z = true;
                    }
                    return ScrollbarHelper.computeScrollOffset(state, orientationHelper, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(z, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r10, int r11, android.support.v7.widget.RecyclerView.Recycler r12, android.support.v7.widget.RecyclerView.State r13) {
        /*
        r9 = this;
        r8 = 0;
        r7 = -1;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = 0;
        r3 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r9.resolveShouldLayoutReverse();	 Catch:{ IllegalArgumentException -> 0x0011 }
        r1 = r9.getChildCount();	 Catch:{ IllegalArgumentException -> 0x0011 }
        if (r1 != 0) goto L_0x0013;
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r4 = r9.convertFocusDirectionToLayoutDirection(r11);
        if (r4 == r6) goto L_0x0010;
    L_0x0019:
        r9.ensureLayoutState();
        if (r4 != r7) goto L_0x0024;
    L_0x001e:
        r1 = r9.findReferenceChildClosestToStart(r12, r13);
        if (r3 == 0) goto L_0x0063;
    L_0x0024:
        r1 = r9.findReferenceChildClosestToEnd(r12, r13);
        r2 = r1;
    L_0x0029:
        if (r2 == 0) goto L_0x0010;
    L_0x002b:
        r9.ensureLayoutState();
        r1 = 1051260355; // 0x3ea8f5c3 float:0.33 double:5.19391626E-315;
        r5 = r9.mOrientationHelper;
        r5 = r5.getTotalSpace();
        r5 = (float) r5;
        r1 = r1 * r5;
        r1 = (int) r1;
        r9.updateLayoutState(r4, r1, r8, r13);
        r1 = r9.mLayoutState;
        r1.mScrollingOffset = r6;
        r1 = r9.mLayoutState;
        r1.mRecycle = r8;
        r1 = r9.mLayoutState;
        r5 = 1;
        r9.fill(r12, r1, r13, r5);
        if (r4 != r7) goto L_0x0053;
    L_0x004d:
        r1 = r9.getChildClosestToStart();
        if (r3 == 0) goto L_0x0057;
    L_0x0053:
        r1 = r9.getChildClosestToEnd();
    L_0x0057:
        if (r1 == r2) goto L_0x0010;
    L_0x0059:
        r2 = r1.isFocusable();	 Catch:{ IllegalArgumentException -> 0x0061 }
        if (r2 == 0) goto L_0x0010;
    L_0x005f:
        r0 = r1;
        goto L_0x0010;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r2 = r1;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.onFocusSearchFailed(android.view.View, int, android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State):android.view.View");
    }

    private int fixLayoutStartGap(int i, Recycler recycler, State state, boolean z) {
        int startAfterPadding = i - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding > 0) {
            startAfterPadding = -scrollBy(startAfterPadding, recycler, state);
            try {
                if (ViewHolder.a == 0) {
                    int i2 = i + startAfterPadding;
                    if (!z) {
                        return startAfterPadding;
                    }
                    i2 -= this.mOrientationHelper.getStartAfterPadding();
                    if (i2 <= 0) {
                        return startAfterPadding;
                    }
                    try {
                        this.mOrientationHelper.offsetChildren(-i2);
                        return startAfterPadding - i2;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return 0;
    }

    public int computeHorizontalScrollOffset(State state) {
        return computeScrollOffset(state);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void resolveShouldLayoutReverse() {
        /*
        r2 = this;
        r0 = 1;
        r1 = r2.mOrientation;	 Catch:{ IllegalArgumentException -> 0x001a }
        if (r1 == r0) goto L_0x000b;
    L_0x0005:
        r1 = r2.isLayoutRTL();	 Catch:{ IllegalArgumentException -> 0x001c }
        if (r1 != 0) goto L_0x0013;
    L_0x000b:
        r1 = r2.mReverseLayout;	 Catch:{ IllegalArgumentException -> 0x001e }
        r2.mShouldReverseLayout = r1;	 Catch:{ IllegalArgumentException -> 0x001e }
        r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IllegalArgumentException -> 0x001e }
        if (r1 == 0) goto L_0x0019;
    L_0x0013:
        r1 = r2.mReverseLayout;	 Catch:{ IllegalArgumentException -> 0x0020 }
        if (r1 != 0) goto L_0x0022;
    L_0x0017:
        r2.mShouldReverseLayout = r0;
    L_0x0019:
        return;
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = 0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.resolveShouldLayoutReverse():void");
    }

    protected int getExtraLayoutSpace(State state) {
        try {
            return state.hasTargetScrollPosition() ? this.mOrientationHelper.getTotalSpace() : 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setReverseLayout(boolean z) {
        try {
            assertNotInLayoutOrScroll(null);
            if (z != this.mReverseLayout) {
                this.mReverseLayout = z;
                requestLayout();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected boolean isLayoutRTL() {
        try {
            return getLayoutDirection() == 1;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void updateAnchorInfoForLayout(Recycler recycler, State state, AnchorInfo anchorInfo) {
        try {
            if (!updateAnchorFromPendingData(state, anchorInfo)) {
                try {
                    if (!updateAnchorFromChildren(recycler, state, anchorInfo)) {
                        try {
                            anchorInfo.assignCoordinateFromPadding();
                            anchorInfo.mPosition = this.mStackFromEnd ? state.getItemCount() - 1 : 0;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void scrollToPosition(int i) {
        try {
            this.mPendingScrollPosition = i;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            if (this.mPendingSavedState != null) {
                this.mPendingSavedState.invalidateAnchor();
            }
            requestLayout();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        try {
            if (this.mPendingSavedState == null) {
                if (this.mLastStackFromEnd == this.mStackFromEnd) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        try {
            if (this.mOrientation == 0) {
                return 0;
            }
            return scrollBy(i, recycler, state);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    void ensureLayoutState() {
        try {
            if (this.mLayoutState == null) {
                this.mLayoutState = createLayoutState();
            }
            try {
                if (this.mOrientationHelper == null) {
                    this.mOrientationHelper = OrientationHelper.createOrientationHelper(this, this.mOrientation);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        int i2 = 1;
        int i3 = Integer.MIN_VALUE;
        switch (i) {
            case at.g /*1*/:
                return -1;
            case at.i /*2*/:
                return 1;
            case arj.Toolbar_maxButtonHeight /*17*/:
                try {
                    if (this.mOrientation != 0) {
                        return Integer.MIN_VALUE;
                    }
                    return -1;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case arj.Theme_actionModeCopyDrawable /*33*/:
                try {
                    if (this.mOrientation != 1) {
                        return Integer.MIN_VALUE;
                    }
                    return -1;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                try {
                    if (this.mOrientation != 0) {
                        i2 = Integer.MIN_VALUE;
                    }
                    return i2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            case 130:
                try {
                    if (this.mOrientation == 1) {
                        i3 = 1;
                    }
                    return i3;
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            default:
                return Integer.MIN_VALUE;
        }
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int computeVerticalScrollExtent(State state) {
        return computeScrollExtent(state);
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void layoutChunk(android.support.v7.widget.RecyclerView.Recycler r11, android.support.v7.widget.RecyclerView.State r12, android.support.v7.widget.LinearLayoutManager.LayoutState r13, android.support.v7.widget.LinearLayoutManager.LayoutChunkResult r14) {
        /*
        r10 = this;
        r8 = -1;
        r2 = 1;
        r3 = 0;
        r5 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r1 = r13.next(r11);
        if (r1 != 0) goto L_0x0011;
    L_0x000b:
        r0 = 1;
        r14.mFinished = r0;	 Catch:{ IllegalArgumentException -> 0x000f }
    L_0x000e:
        return;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = r1.getLayoutParams();
        r6 = r0;
        r6 = (android.support.v7.widget.RecyclerView.LayoutParams) r6;
        r0 = r13.mScrapList;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        if (r0 != 0) goto L_0x0030;
    L_0x001c:
        r4 = r10.mShouldReverseLayout;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r0 = r13.mLayoutDirection;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        if (r0 != r8) goto L_0x00db;
    L_0x0022:
        r0 = r2;
    L_0x0023:
        if (r4 != r0) goto L_0x002a;
    L_0x0025:
        r10.addView(r1);	 Catch:{ IllegalArgumentException -> 0x00de }
        if (r5 == 0) goto L_0x0042;
    L_0x002a:
        r0 = 0;
        r10.addView(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00e0 }
        if (r5 == 0) goto L_0x0042;
    L_0x0030:
        r4 = r10.mShouldReverseLayout;	 Catch:{ IllegalArgumentException -> 0x00e2 }
        r0 = r13.mLayoutDirection;	 Catch:{ IllegalArgumentException -> 0x00e2 }
        if (r0 != r8) goto L_0x00e4;
    L_0x0036:
        r0 = r2;
    L_0x0037:
        if (r4 != r0) goto L_0x003e;
    L_0x0039:
        r10.addDisappearingView(r1);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        if (r5 == 0) goto L_0x0042;
    L_0x003e:
        r0 = 0;
        r10.addDisappearingView(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00e7 }
    L_0x0042:
        r0 = 0;
        r3 = 0;
        r10.measureChildWithMargins(r1, r0, r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r0 = r10.mOrientationHelper;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r0 = r0.getDecoratedMeasurement(r1);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r14.mConsumed = r0;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r0 = r10.mOrientation;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        if (r0 != r2) goto L_0x008d;
    L_0x0053:
        r0 = r10.isLayoutRTL();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        if (r0 == 0) goto L_0x006c;
    L_0x0059:
        r0 = r10.getWidth();
        r2 = r10.getPaddingRight();
        r0 = r0 - r2;
        r2 = r10.mOrientationHelper;
        r2 = r2.getDecoratedMeasurementInOther(r1);
        r2 = r0 - r2;
        if (r5 == 0) goto L_0x0077;
    L_0x006c:
        r2 = r10.getPaddingLeft();
        r0 = r10.mOrientationHelper;
        r0 = r0.getDecoratedMeasurementInOther(r1);
        r0 = r0 + r2;
    L_0x0077:
        r3 = r13.mLayoutDirection;
        if (r3 != r8) goto L_0x0084;
    L_0x007b:
        r3 = r13.mOffset;
        r4 = r13.mOffset;
        r7 = r14.mConsumed;
        r4 = r4 - r7;
        if (r5 == 0) goto L_0x00f3;
    L_0x0084:
        r4 = r13.mOffset;
        r3 = r13.mOffset;
        r7 = r14.mConsumed;
        r3 = r3 + r7;
        if (r5 == 0) goto L_0x00f3;
    L_0x008d:
        r3 = r10.getPaddingTop();
        r0 = r10.mOrientationHelper;
        r0 = r0.getDecoratedMeasurementInOther(r1);
        r0 = r0 + r3;
        r2 = r13.mLayoutDirection;
        if (r2 != r8) goto L_0x00a5;
    L_0x009c:
        r2 = r13.mOffset;
        r4 = r13.mOffset;
        r7 = r14.mConsumed;
        r4 = r4 - r7;
        if (r5 == 0) goto L_0x00ef;
    L_0x00a5:
        r4 = r13.mOffset;
        r2 = r13.mOffset;
        r5 = r14.mConsumed;
        r2 = r2 + r5;
        r9 = r2;
        r2 = r4;
        r4 = r9;
    L_0x00af:
        r5 = r6.leftMargin;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r2 = r2 + r5;
        r5 = r6.topMargin;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r3 = r3 + r5;
        r5 = r6.rightMargin;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r4 = r4 - r5;
        r5 = r6.bottomMargin;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r5 = r0 - r5;
        r0 = r10;
        r0.layoutDecorated(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = r6.isItemRemoved();	 Catch:{ IllegalArgumentException -> 0x00eb }
        if (r0 != 0) goto L_0x00cc;
    L_0x00c6:
        r0 = r6.isItemChanged();	 Catch:{ IllegalArgumentException -> 0x00ed }
        if (r0 == 0) goto L_0x00cf;
    L_0x00cc:
        r0 = 1;
        r14.mIgnoreConsumed = r0;	 Catch:{ IllegalArgumentException -> 0x00ed }
    L_0x00cf:
        r0 = r1.isFocusable();
        r14.mFocusable = r0;
        goto L_0x000e;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d9 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r0 = r3;
        goto L_0x0023;
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r0 = r3;
        goto L_0x0037;
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ed }
    L_0x00ed:
        r0 = move-exception;
        throw r0;
    L_0x00ef:
        r9 = r2;
        r2 = r4;
        r4 = r9;
        goto L_0x00af;
    L_0x00f3:
        r9 = r3;
        r3 = r4;
        r4 = r0;
        r0 = r9;
        goto L_0x00af;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.layoutChunk(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, android.support.v7.widget.LinearLayoutManager$LayoutState, android.support.v7.widget.LinearLayoutManager$LayoutChunkResult):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateLayoutState(int r7, int r8, boolean r9, android.support.v7.widget.RecyclerView.State r10) {
        /*
        r6 = this;
        r1 = -1;
        r2 = 1;
        r0 = r6.mLayoutState;
        r3 = r6.getExtraLayoutSpace(r10);
        r0.mExtra = r3;
        r0 = r6.mLayoutState;
        r0.mLayoutDirection = r7;
        if (r7 != r2) goto L_0x0052;
    L_0x0010:
        r0 = r6.mLayoutState;
        r3 = r0.mExtra;
        r4 = r6.mOrientationHelper;
        r4 = r4.getEndPadding();
        r3 = r3 + r4;
        r0.mExtra = r3;
        r3 = r6.getChildClosestToEnd();
        r4 = r6.mLayoutState;	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r0 = r6.mShouldReverseLayout;	 Catch:{ IllegalArgumentException -> 0x00a2 }
        if (r0 == 0) goto L_0x00a4;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        r4.mItemDirection = r0;
        r0 = r6.mLayoutState;
        r4 = r6.getPosition(r3);
        r5 = r6.mLayoutState;
        r5 = r5.mItemDirection;
        r4 = r4 + r5;
        r0.mCurrentPosition = r4;
        r0 = r6.mLayoutState;
        r4 = r6.mOrientationHelper;
        r4 = r4.getDecoratedEnd(r3);
        r0.mOffset = r4;
        r0 = r6.mOrientationHelper;
        r0 = r0.getDecoratedEnd(r3);
        r3 = r6.mOrientationHelper;
        r3 = r3.getEndAfterPadding();
        r0 = r0 - r3;
        r3 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        if (r3 == 0) goto L_0x0090;
    L_0x0052:
        r0 = r6.getChildClosestToStart();
        r3 = r6.mLayoutState;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r4 = r3.mExtra;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r5 = r6.mOrientationHelper;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r5 = r5.getStartAfterPadding();	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r4 = r4 + r5;
        r3.mExtra = r4;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r3 = r6.mLayoutState;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r4 = r6.mShouldReverseLayout;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        if (r4 == 0) goto L_0x00a8;
    L_0x0069:
        r3.mItemDirection = r2;
        r1 = r6.mLayoutState;
        r2 = r6.getPosition(r0);
        r3 = r6.mLayoutState;
        r3 = r3.mItemDirection;
        r2 = r2 + r3;
        r1.mCurrentPosition = r2;
        r1 = r6.mLayoutState;
        r2 = r6.mOrientationHelper;
        r2 = r2.getDecoratedStart(r0);
        r1.mOffset = r2;
        r1 = r6.mOrientationHelper;
        r0 = r1.getDecoratedStart(r0);
        r0 = -r0;
        r1 = r6.mOrientationHelper;
        r1 = r1.getStartAfterPadding();
        r0 = r0 + r1;
    L_0x0090:
        r1 = r6.mLayoutState;	 Catch:{ IllegalArgumentException -> 0x00aa }
        r1.mAvailable = r8;	 Catch:{ IllegalArgumentException -> 0x00aa }
        if (r9 == 0) goto L_0x009d;
    L_0x0096:
        r1 = r6.mLayoutState;	 Catch:{ IllegalArgumentException -> 0x00aa }
        r2 = r1.mAvailable;	 Catch:{ IllegalArgumentException -> 0x00aa }
        r2 = r2 - r0;
        r1.mAvailable = r2;	 Catch:{ IllegalArgumentException -> 0x00aa }
    L_0x009d:
        r1 = r6.mLayoutState;
        r1.mScrollingOffset = r0;
        return;
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        r0 = r2;
        goto L_0x0028;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r2 = r1;
        goto L_0x0069;
    L_0x00aa:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.updateLayoutState(int, int, boolean, android.support.v7.widget.RecyclerView$State):void");
    }

    public void assertNotInLayoutOrScroll(String str) {
        try {
            if (this.mPendingSavedState == null) {
                super.assertNotInLayoutOrScroll(str);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        try {
            return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            if (parcelable instanceof SavedState) {
                this.mPendingSavedState = (SavedState) parcelable;
                requestLayout();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        try {
            int i3;
            this.mLayoutState.mAvailable = this.mOrientationHelper.getEndAfterPadding() - i2;
            LayoutState layoutState = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            layoutState.mItemDirection = i3;
            this.mLayoutState.mCurrentPosition = i;
            this.mLayoutState.mLayoutDirection = 1;
            this.mLayoutState.mOffset = i2;
            this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    View findReferenceChild(Recycler recycler, State state, int i, int i2, int i3) {
        int i4;
        View view;
        View view2;
        View view3 = null;
        int i5 = ViewHolder.a;
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view4 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                try {
                    if (((LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                        if (view4 == null) {
                            if (i5 != 0) {
                                view4 = childAt;
                            } else {
                                view = view3;
                                i += i4;
                                if (i5 == 0) {
                                    view2 = childAt;
                                    break;
                                }
                                view3 = view;
                                view4 = childAt;
                            }
                        }
                    }
                    try {
                        if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding) {
                            if (this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                                return childAt;
                            }
                        }
                        if (view3 == null) {
                            if (i5 == 0) {
                                view = childAt;
                                childAt = view4;
                                i += i4;
                                if (i5 == 0) {
                                    view2 = childAt;
                                    break;
                                }
                                view3 = view;
                                view4 = childAt;
                            } else {
                                return childAt;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            view = view3;
            childAt = view4;
            i += i4;
            if (i5 == 0) {
                view2 = childAt;
                break;
            }
            view3 = view;
            view4 = childAt;
        }
        view = view3;
        view2 = view4;
        if (view == null) {
            return view2;
        }
        return view;
    }

    private View findReferenceChildClosestToStart(Recycler recycler, State state) {
        try {
            return this.mShouldReverseLayout ? findLastReferenceChild(recycler, state) : findFirstReferenceChild(recycler, state);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            try {
                assertNotInLayoutOrScroll(null);
                if (i != this.mOrientation) {
                    this.mOrientation = i;
                    this.mOrientationHelper = null;
                    requestLayout();
                    return;
                }
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            throw new IllegalArgumentException(z + i);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int fill(android.support.v7.widget.RecyclerView.Recycler r9, android.support.v7.widget.LinearLayoutManager.LayoutState r10, android.support.v7.widget.RecyclerView.State r11, boolean r12) {
        /*
        r8 = this;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r2 = r10.mAvailable;
        r0 = r10.mScrollingOffset;	 Catch:{ IllegalArgumentException -> 0x007e }
        if (r0 == r7) goto L_0x0018;
    L_0x000a:
        r0 = r10.mAvailable;	 Catch:{ IllegalArgumentException -> 0x0080 }
        if (r0 >= 0) goto L_0x0015;
    L_0x000e:
        r0 = r10.mScrollingOffset;	 Catch:{ IllegalArgumentException -> 0x0080 }
        r3 = r10.mAvailable;	 Catch:{ IllegalArgumentException -> 0x0080 }
        r0 = r0 + r3;
        r10.mScrollingOffset = r0;	 Catch:{ IllegalArgumentException -> 0x0080 }
    L_0x0015:
        r8.recycleByLayoutState(r9, r10);
    L_0x0018:
        r0 = r10.mAvailable;
        r3 = r10.mExtra;
        r0 = r0 + r3;
        r3 = new android.support.v7.widget.LinearLayoutManager$LayoutChunkResult;
        r3.<init>();
    L_0x0022:
        if (r0 <= 0) goto L_0x0079;
    L_0x0024:
        r4 = r10.hasMore(r11);	 Catch:{ IllegalArgumentException -> 0x0082 }
        if (r4 == 0) goto L_0x0079;
    L_0x002a:
        r3.resetInternal();	 Catch:{ IllegalArgumentException -> 0x0084 }
        r8.layoutChunk(r9, r11, r10, r3);	 Catch:{ IllegalArgumentException -> 0x0084 }
        r4 = r3.mFinished;	 Catch:{ IllegalArgumentException -> 0x0084 }
        if (r4 == 0) goto L_0x0036;
    L_0x0034:
        if (r1 == 0) goto L_0x0079;
    L_0x0036:
        r4 = r10.mOffset;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r5 = r3.mConsumed;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r6 = r10.mLayoutDirection;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r5 = r5 * r6;
        r4 = r4 + r5;
        r10.mOffset = r4;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r4 = r3.mIgnoreConsumed;	 Catch:{ IllegalArgumentException -> 0x0088 }
        if (r4 == 0) goto L_0x0050;
    L_0x0044:
        r4 = r8.mLayoutState;	 Catch:{ IllegalArgumentException -> 0x008a }
        r4 = r4.mScrapList;	 Catch:{ IllegalArgumentException -> 0x008a }
        if (r4 != 0) goto L_0x0050;
    L_0x004a:
        r4 = r11.isPreLayout();	 Catch:{ IllegalArgumentException -> 0x008a }
        if (r4 != 0) goto L_0x005a;
    L_0x0050:
        r4 = r10.mAvailable;
        r5 = r3.mConsumed;
        r4 = r4 - r5;
        r10.mAvailable = r4;
        r4 = r3.mConsumed;
        r0 = r0 - r4;
    L_0x005a:
        r4 = r10.mScrollingOffset;	 Catch:{ IllegalArgumentException -> 0x008c }
        if (r4 == r7) goto L_0x0073;
    L_0x005e:
        r4 = r10.mScrollingOffset;	 Catch:{ IllegalArgumentException -> 0x008e }
        r5 = r3.mConsumed;	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = r4 + r5;
        r10.mScrollingOffset = r4;	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = r10.mAvailable;	 Catch:{ IllegalArgumentException -> 0x008e }
        if (r4 >= 0) goto L_0x0070;
    L_0x0069:
        r4 = r10.mScrollingOffset;	 Catch:{ IllegalArgumentException -> 0x008e }
        r5 = r10.mAvailable;	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = r4 + r5;
        r10.mScrollingOffset = r4;	 Catch:{ IllegalArgumentException -> 0x008e }
    L_0x0070:
        r8.recycleByLayoutState(r9, r10);
    L_0x0073:
        if (r12 == 0) goto L_0x0022;
    L_0x0075:
        r4 = r3.mFocusable;
        if (r4 == 0) goto L_0x0022;
    L_0x0079:
        r0 = r10.mAvailable;
        r0 = r2 - r0;
        return r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0084 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x008a }
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.fill(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.LinearLayoutManager$LayoutState, android.support.v7.widget.RecyclerView$State, boolean):int");
    }

    private View findLastReferenceChild(Recycler recycler, State state) {
        return findReferenceChild(recycler, state, getChildCount() - 1, -1, state.getItemCount());
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo) {
        updateLayoutStateToFillStart(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void layoutForPredictiveAnimations(android.support.v7.widget.RecyclerView.Recycler r11, android.support.v7.widget.RecyclerView.State r12, int r13, int r14) {
        /*
        r10 = this;
        r5 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r12.willRunPredictiveAnimations();	 Catch:{ IllegalArgumentException -> 0x001b }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r10.getChildCount();	 Catch:{ IllegalArgumentException -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x000e:
        r0 = r12.isPreLayout();	 Catch:{ IllegalArgumentException -> 0x001f }
        if (r0 != 0) goto L_0x001a;
    L_0x0014:
        r0 = r10.supportsPredictiveItemAnimations();	 Catch:{ IllegalArgumentException -> 0x0021 }
        if (r0 != 0) goto L_0x0023;
    L_0x001a:
        return;
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r1 = 0;
        r2 = 0;
        r6 = r11.getScrapList();
        r7 = r6.size();
        r0 = 0;
        r0 = r10.getChildAt(r0);
        r8 = r10.getPosition(r0);
        r0 = 0;
        r4 = r0;
    L_0x0038:
        if (r4 >= r7) goto L_0x00cb;
    L_0x003a:
        r0 = r6.get(r4);
        r0 = (android.support.v7.widget.RecyclerView.ViewHolder) r0;
        r3 = r0.isRemoved();	 Catch:{ IllegalArgumentException -> 0x00bd }
        if (r3 == 0) goto L_0x0048;
    L_0x0046:
        if (r5 == 0) goto L_0x00c9;
    L_0x0048:
        r3 = r0.getLayoutPosition();
        if (r3 >= r8) goto L_0x00bf;
    L_0x004e:
        r3 = 1;
    L_0x004f:
        r9 = r10.mShouldReverseLayout;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        if (r3 == r9) goto L_0x00c3;
    L_0x0053:
        r3 = -1;
    L_0x0054:
        r9 = -1;
        if (r3 != r9) goto L_0x0062;
    L_0x0057:
        r3 = r10.mOrientationHelper;
        r9 = r0.itemView;
        r3 = r3.getDecoratedMeasurement(r9);
        r1 = r1 + r3;
        if (r5 == 0) goto L_0x00c9;
    L_0x0062:
        r3 = r10.mOrientationHelper;
        r0 = r0.itemView;
        r0 = r3.getDecoratedMeasurement(r0);
        r2 = r2 + r0;
        r0 = r2;
    L_0x006c:
        r2 = r4 + 1;
        if (r5 == 0) goto L_0x00c5;
    L_0x0070:
        r2 = r10.mLayoutState;
        r2.mScrapList = r6;
        if (r1 <= 0) goto L_0x0095;
    L_0x0076:
        r2 = r10.getChildClosestToStart();
        r2 = r10.getPosition(r2);
        r10.updateLayoutStateToFillStart(r2, r13);
        r2 = r10.mLayoutState;
        r2.mExtra = r1;
        r1 = r10.mLayoutState;
        r2 = 0;
        r1.mAvailable = r2;
        r1 = r10.mLayoutState;
        r1.assignPositionFromScrapList();
        r1 = r10.mLayoutState;
        r2 = 0;
        r10.fill(r11, r1, r12, r2);
    L_0x0095:
        if (r0 <= 0) goto L_0x00b6;
    L_0x0097:
        r1 = r10.getChildClosestToEnd();
        r1 = r10.getPosition(r1);
        r10.updateLayoutStateToFillEnd(r1, r14);
        r1 = r10.mLayoutState;
        r1.mExtra = r0;
        r0 = r10.mLayoutState;
        r1 = 0;
        r0.mAvailable = r1;
        r0 = r10.mLayoutState;
        r0.assignPositionFromScrapList();
        r0 = r10.mLayoutState;
        r1 = 0;
        r10.fill(r11, r0, r12, r1);
    L_0x00b6:
        r0 = r10.mLayoutState;
        r1 = 0;
        r0.mScrapList = r1;
        goto L_0x001a;
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r3 = 0;
        goto L_0x004f;
    L_0x00c1:
        r0 = move-exception;
        throw r0;
    L_0x00c3:
        r3 = 1;
        goto L_0x0054;
    L_0x00c5:
        r4 = r2;
        r2 = r0;
        goto L_0x0038;
    L_0x00c9:
        r0 = r2;
        goto L_0x006c;
    L_0x00cb:
        r0 = r2;
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.layoutForPredictiveAnimations(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, int, int):void");
    }

    private boolean updateAnchorFromPendingData(State state, AnchorInfo anchorInfo) {
        boolean z = false;
        int i = ViewHolder.a;
        try {
            if (!state.isPreLayout()) {
                if (this.mPendingScrollPosition != -1) {
                    try {
                        if (this.mPendingScrollPosition >= 0) {
                            if (this.mPendingScrollPosition < state.getItemCount()) {
                                try {
                                    anchorInfo.mPosition = this.mPendingScrollPosition;
                                    if (this.mPendingSavedState != null) {
                                        if (this.mPendingSavedState.hasValidAnchor()) {
                                            try {
                                                anchorInfo.mLayoutFromEnd = this.mPendingSavedState.mAnchorLayoutFromEnd;
                                                if (anchorInfo.mLayoutFromEnd) {
                                                    try {
                                                        anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - this.mPendingSavedState.mAnchorOffset;
                                                        if (i == 0) {
                                                            return true;
                                                        }
                                                    } catch (IllegalArgumentException e) {
                                                        throw e;
                                                    }
                                                }
                                                anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingSavedState.mAnchorOffset;
                                                return true;
                                            } catch (IllegalArgumentException e2) {
                                                throw e2;
                                            }
                                        }
                                    }
                                    if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                                        View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                                        if (findViewByPosition != null) {
                                            try {
                                                if (this.mOrientationHelper.getDecoratedMeasurement(findViewByPosition) > this.mOrientationHelper.getTotalSpace()) {
                                                    anchorInfo.assignCoordinateFromPadding();
                                                    return true;
                                                } else if (this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                                                    try {
                                                        anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding();
                                                        anchorInfo.mLayoutFromEnd = false;
                                                        return true;
                                                    } catch (IllegalArgumentException e22) {
                                                        throw e22;
                                                    }
                                                } else if (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition) < 0) {
                                                    try {
                                                        anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding();
                                                        anchorInfo.mLayoutFromEnd = true;
                                                        return true;
                                                    } catch (IllegalArgumentException e222) {
                                                        throw e222;
                                                    }
                                                } else {
                                                    try {
                                                        int decoratedEnd;
                                                        if (anchorInfo.mLayoutFromEnd) {
                                                            decoratedEnd = this.mOrientationHelper.getDecoratedEnd(findViewByPosition) + this.mOrientationHelper.getTotalSpaceChange();
                                                        } else {
                                                            decoratedEnd = this.mOrientationHelper.getDecoratedStart(findViewByPosition);
                                                        }
                                                        try {
                                                            anchorInfo.mCoordinate = decoratedEnd;
                                                            if (i == 0) {
                                                                return true;
                                                            }
                                                        } catch (IllegalArgumentException e2222) {
                                                            throw e2222;
                                                        }
                                                    } catch (IllegalArgumentException e22222) {
                                                        throw e22222;
                                                    }
                                                }
                                            } catch (IllegalArgumentException e222222) {
                                                throw e222222;
                                            }
                                        }
                                        if (getChildCount() > 0) {
                                            try {
                                                boolean z2;
                                                if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                try {
                                                    if (z2 == this.mShouldReverseLayout) {
                                                        z = true;
                                                    }
                                                    anchorInfo.mLayoutFromEnd = z;
                                                } catch (IllegalArgumentException e2222222) {
                                                    throw e2222222;
                                                }
                                            } catch (IllegalArgumentException e22222222) {
                                                throw e22222222;
                                            }
                                        }
                                        anchorInfo.assignCoordinateFromPadding();
                                        return true;
                                    }
                                    try {
                                        anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
                                        if (this.mShouldReverseLayout) {
                                            anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                                            if (i == 0) {
                                                return true;
                                            }
                                        }
                                        anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                                        return true;
                                    } catch (IllegalArgumentException e222222222) {
                                        throw e222222222;
                                    } catch (IllegalArgumentException e2222222222) {
                                        throw e2222222222;
                                    }
                                } catch (IllegalArgumentException e22222222222) {
                                    throw e22222222222;
                                } catch (IllegalArgumentException e222222222222) {
                                    throw e222222222222;
                                }
                            }
                        }
                        this.mPendingScrollPosition = -1;
                        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                        return false;
                    } catch (IllegalArgumentException e2222222222222) {
                        throw e2222222222222;
                    } catch (IllegalArgumentException e22222222222222) {
                        throw e22222222222222;
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException e222222222222222) {
            throw e222222222222222;
        } catch (IllegalArgumentException e2222222222222222) {
            throw e2222222222222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
        r5 = this;
        r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r5.mPendingSavedState;	 Catch:{ IllegalArgumentException -> 0x000e }
        if (r0 == 0) goto L_0x0010;
    L_0x0006:
        r0 = new android.support.v7.widget.LinearLayoutManager$SavedState;	 Catch:{ IllegalArgumentException -> 0x000e }
        r1 = r5.mPendingSavedState;	 Catch:{ IllegalArgumentException -> 0x000e }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x000e }
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = new android.support.v7.widget.LinearLayoutManager$SavedState;
        r0.<init>();
        r2 = r5.getChildCount();
        if (r2 <= 0) goto L_0x005d;
    L_0x001b:
        r5.ensureLayoutState();
        r2 = r5.mLastStackFromEnd;
        r3 = r5.mShouldReverseLayout;
        r2 = r2 ^ r3;
        r0.mAnchorLayoutFromEnd = r2;
        if (r2 == 0) goto L_0x0042;
    L_0x0027:
        r2 = r5.getChildClosestToEnd();
        r3 = r5.mOrientationHelper;
        r3 = r3.getEndAfterPadding();
        r4 = r5.mOrientationHelper;
        r4 = r4.getDecoratedEnd(r2);
        r3 = r3 - r4;
        r0.mAnchorOffset = r3;
        r2 = r5.getPosition(r2);
        r0.mAnchorPosition = r2;
        if (r1 == 0) goto L_0x005b;
    L_0x0042:
        r2 = r5.getChildClosestToStart();
        r3 = r5.getPosition(r2);
        r0.mAnchorPosition = r3;
        r3 = r5.mOrientationHelper;
        r2 = r3.getDecoratedStart(r2);
        r3 = r5.mOrientationHelper;
        r3 = r3.getStartAfterPadding();
        r2 = r2 - r3;
        r0.mAnchorOffset = r2;
    L_0x005b:
        if (r1 == 0) goto L_0x000d;
    L_0x005d:
        r0.invalidateAnchor();	 Catch:{ IllegalArgumentException -> 0x0061 }
        goto L_0x000d;
    L_0x0061:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.onSaveInstanceState():android.os.Parcelable");
    }

    void onAnchorReady(Recycler recycler, State state, AnchorInfo anchorInfo) {
    }

    private void recycleChildren(Recycler recycler, int i, int i2) {
        int i3 = ViewHolder.a;
        if (i != i2) {
            if (i2 > i) {
                int i4 = i2 - 1;
                while (i4 >= i) {
                    removeAndRecycleViewAt(i4, recycler);
                    i4--;
                    if (i3 != 0) {
                        break;
                    }
                }
                if (i3 == 0) {
                    return;
                }
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, recycler);
                i--;
                if (i3 != 0) {
                    return;
                }
            }
        }
    }

    private int fixLayoutEndGap(int i, Recycler recycler, State state, boolean z) {
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i;
        if (endAfterPadding > 0) {
            endAfterPadding = -scrollBy(-endAfterPadding, recycler, state);
            try {
                if (ViewHolder.a == 0) {
                    int i2 = i + endAfterPadding;
                    if (!z) {
                        return endAfterPadding;
                    }
                    i2 = this.mOrientationHelper.getEndAfterPadding() - i2;
                    if (i2 <= 0) {
                        return endAfterPadding;
                    }
                    try {
                        this.mOrientationHelper.offsetChildren(i2);
                        return endAfterPadding + i2;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return 0;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            AccessibilityRecordCompat asRecord = AccessibilityEventCompat.asRecord(accessibilityEvent);
            asRecord.setFromIndex(findFirstVisibleItemPosition());
            asRecord.setToIndex(findLastVisibleItemPosition());
        }
    }

    public boolean canScrollHorizontally() {
        try {
            return this.mOrientation == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler r12, android.support.v7.widget.RecyclerView.State r13) {
        /*
        r11 = this;
        r9 = 1;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = -1;
        r1 = 0;
        r5 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r11.mPendingSavedState;	 Catch:{ IllegalArgumentException -> 0x0019 }
        if (r0 != 0) goto L_0x000f;
    L_0x000b:
        r0 = r11.mPendingScrollPosition;	 Catch:{ IllegalArgumentException -> 0x001b }
        if (r0 == r4) goto L_0x001f;
    L_0x000f:
        r0 = r13.getItemCount();	 Catch:{ IllegalArgumentException -> 0x001d }
        if (r0 != 0) goto L_0x001f;
    L_0x0015:
        r11.removeAndRecycleAllViews(r12);	 Catch:{ IllegalArgumentException -> 0x001d }
    L_0x0018:
        return;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;
    L_0x001f:
        r0 = r11.mPendingSavedState;	 Catch:{ IllegalArgumentException -> 0x01c0 }
        if (r0 == 0) goto L_0x0031;
    L_0x0023:
        r0 = r11.mPendingSavedState;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r0 = r0.hasValidAnchor();	 Catch:{ IllegalArgumentException -> 0x01c2 }
        if (r0 == 0) goto L_0x0031;
    L_0x002b:
        r0 = r11.mPendingSavedState;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r0 = r0.mAnchorPosition;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r11.mPendingScrollPosition = r0;	 Catch:{ IllegalArgumentException -> 0x01c2 }
    L_0x0031:
        r11.ensureLayoutState();
        r0 = r11.mLayoutState;
        r0.mRecycle = r1;
        r11.resolveShouldLayoutReverse();
        r0 = r11.mAnchorInfo;
        r0.reset();
        r0 = r11.mAnchorInfo;
        r2 = r11.mShouldReverseLayout;
        r3 = r11.mStackFromEnd;
        r2 = r2 ^ r3;
        r0.mLayoutFromEnd = r2;
        r0 = r11.mAnchorInfo;
        r11.updateAnchorInfoForLayout(r12, r13, r0);
        r0 = r11.getExtraLayoutSpace(r13);
        r2 = r11.mLayoutState;
        r2 = r2.mLastScrollDelta;
        if (r2 < 0) goto L_0x005a;
    L_0x0058:
        if (r5 == 0) goto L_0x01de;
    L_0x005a:
        r2 = r0;
        r0 = r1;
    L_0x005c:
        r3 = r11.mOrientationHelper;
        r3 = r3.getStartAfterPadding();
        r2 = r2 + r3;
        r3 = r11.mOrientationHelper;
        r3 = r3.getEndPadding();
        r3 = r3 + r0;
        r0 = r13.isPreLayout();	 Catch:{ IllegalArgumentException -> 0x01c4 }
        if (r0 == 0) goto L_0x01db;
    L_0x0070:
        r0 = r11.mPendingScrollPosition;	 Catch:{ IllegalArgumentException -> 0x01c6 }
        if (r0 == r4) goto L_0x01db;
    L_0x0074:
        r0 = r11.mPendingScrollPositionOffset;	 Catch:{ IllegalArgumentException -> 0x01c6 }
        if (r0 == r6) goto L_0x01db;
    L_0x0078:
        r0 = r11.mPendingScrollPosition;
        r4 = r11.findViewByPosition(r0);
        if (r4 == 0) goto L_0x01db;
    L_0x0080:
        r0 = r11.mShouldReverseLayout;	 Catch:{ IllegalArgumentException -> 0x01c8 }
        if (r0 == 0) goto L_0x0096;
    L_0x0084:
        r0 = r11.mOrientationHelper;
        r0 = r0.getEndAfterPadding();
        r6 = r11.mOrientationHelper;
        r6 = r6.getDecoratedEnd(r4);
        r0 = r0 - r6;
        r6 = r11.mPendingScrollPositionOffset;
        r0 = r0 - r6;
        if (r5 == 0) goto L_0x01d8;
    L_0x0096:
        r0 = r11.mOrientationHelper;
        r0 = r0.getDecoratedStart(r4);
        r4 = r11.mOrientationHelper;
        r4 = r4.getStartAfterPadding();
        r0 = r0 - r4;
        r4 = r11.mPendingScrollPositionOffset;
        r0 = r4 - r0;
        r4 = r0;
    L_0x00a8:
        if (r4 <= 0) goto L_0x01d5;
    L_0x00aa:
        r0 = r2 + r4;
        if (r5 == 0) goto L_0x01d1;
    L_0x00ae:
        r2 = r3 - r4;
        r10 = r2;
        r2 = r0;
        r0 = r10;
    L_0x00b3:
        r3 = r11.mAnchorInfo;
        r11.onAnchorReady(r12, r13, r3);
        r11.detachAndScrapAttachedViews(r12);
        r3 = r11.mLayoutState;
        r4 = r13.isPreLayout();
        r3.mIsPreLayout = r4;
        r3 = r11.mAnchorInfo;
        r3 = r3.mLayoutFromEnd;
        if (r3 == 0) goto L_0x0123;
    L_0x00c9:
        r3 = r11.mAnchorInfo;
        r11.updateLayoutStateToFillStart(r3);
        r3 = r11.mLayoutState;
        r3.mExtra = r2;
        r3 = r11.mLayoutState;
        r11.fill(r12, r3, r13, r1);
        r3 = r11.mLayoutState;
        r4 = r3.mOffset;
        r3 = r11.mLayoutState;
        r6 = r3.mCurrentPosition;
        r3 = r11.mLayoutState;
        r3 = r3.mAvailable;
        if (r3 <= 0) goto L_0x00ea;
    L_0x00e5:
        r3 = r11.mLayoutState;
        r3 = r3.mAvailable;
        r0 = r0 + r3;
    L_0x00ea:
        r3 = r11.mAnchorInfo;
        r11.updateLayoutStateToFillEnd(r3);
        r3 = r11.mLayoutState;
        r3.mExtra = r0;
        r3 = r11.mLayoutState;
        r7 = r3.mCurrentPosition;
        r8 = r11.mLayoutState;
        r8 = r8.mItemDirection;
        r7 = r7 + r8;
        r3.mCurrentPosition = r7;
        r3 = r11.mLayoutState;
        r11.fill(r12, r3, r13, r1);
        r3 = r11.mLayoutState;
        r3 = r3.mOffset;
        r7 = r11.mLayoutState;
        r7 = r7.mAvailable;
        if (r7 <= 0) goto L_0x0121;
    L_0x010d:
        r2 = r11.mLayoutState;
        r2 = r2.mAvailable;
        r11.updateLayoutStateToFillStart(r6, r4);
        r4 = r11.mLayoutState;
        r4.mExtra = r2;
        r4 = r11.mLayoutState;
        r11.fill(r12, r4, r13, r1);
        r4 = r11.mLayoutState;
        r4 = r4.mOffset;
    L_0x0121:
        if (r5 == 0) goto L_0x01ce;
    L_0x0123:
        r3 = r11.mAnchorInfo;
        r11.updateLayoutStateToFillEnd(r3);
        r3 = r11.mLayoutState;
        r3.mExtra = r0;
        r0 = r11.mLayoutState;
        r11.fill(r12, r0, r13, r1);
        r0 = r11.mLayoutState;
        r0 = r0.mOffset;
        r3 = r11.mLayoutState;
        r3 = r3.mCurrentPosition;
        r4 = r11.mLayoutState;
        r4 = r4.mAvailable;
        if (r4 <= 0) goto L_0x0144;
    L_0x013f:
        r4 = r11.mLayoutState;
        r4 = r4.mAvailable;
        r2 = r2 + r4;
    L_0x0144:
        r4 = r11.mAnchorInfo;
        r11.updateLayoutStateToFillStart(r4);
        r4 = r11.mLayoutState;
        r4.mExtra = r2;
        r2 = r11.mLayoutState;
        r4 = r2.mCurrentPosition;
        r6 = r11.mLayoutState;
        r6 = r6.mItemDirection;
        r4 = r4 + r6;
        r2.mCurrentPosition = r4;
        r2 = r11.mLayoutState;
        r11.fill(r12, r2, r13, r1);
        r2 = r11.mLayoutState;
        r2 = r2.mOffset;
        r4 = r11.mLayoutState;
        r4 = r4.mAvailable;
        if (r4 <= 0) goto L_0x017b;
    L_0x0167:
        r4 = r11.mLayoutState;
        r4 = r4.mAvailable;
        r11.updateLayoutStateToFillEnd(r3, r0);
        r0 = r11.mLayoutState;
        r0.mExtra = r4;
        r0 = r11.mLayoutState;
        r11.fill(r12, r0, r13, r1);
        r0 = r11.mLayoutState;
        r0 = r0.mOffset;
    L_0x017b:
        r3 = r11.getChildCount();	 Catch:{ IllegalArgumentException -> 0x01ca }
        if (r3 <= 0) goto L_0x01a2;
    L_0x0181:
        r3 = r11.mShouldReverseLayout;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r4 = r11.mStackFromEnd;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r3 = r3 ^ r4;
        if (r3 == 0) goto L_0x0196;
    L_0x0188:
        r3 = r11.fixLayoutEndGap(r0, r12, r13, r9);
        r2 = r2 + r3;
        r0 = r0 + r3;
        r3 = r11.fixLayoutStartGap(r2, r12, r13, r1);
        r2 = r2 + r3;
        r0 = r0 + r3;
        if (r5 == 0) goto L_0x01a2;
    L_0x0196:
        r3 = r11.fixLayoutStartGap(r2, r12, r13, r9);
        r2 = r2 + r3;
        r0 = r0 + r3;
        r1 = r11.fixLayoutEndGap(r0, r12, r13, r1);
        r2 = r2 + r1;
        r0 = r0 + r1;
    L_0x01a2:
        r11.layoutForPredictiveAnimations(r12, r13, r2, r0);	 Catch:{ IllegalArgumentException -> 0x01cc }
        r0 = r13.isPreLayout();	 Catch:{ IllegalArgumentException -> 0x01cc }
        if (r0 != 0) goto L_0x01b7;
    L_0x01ab:
        r0 = -1;
        r11.mPendingScrollPosition = r0;	 Catch:{ IllegalArgumentException -> 0x01cc }
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r11.mPendingScrollPositionOffset = r0;	 Catch:{ IllegalArgumentException -> 0x01cc }
        r0 = r11.mOrientationHelper;	 Catch:{ IllegalArgumentException -> 0x01cc }
        r0.onLayoutComplete();	 Catch:{ IllegalArgumentException -> 0x01cc }
    L_0x01b7:
        r0 = r11.mStackFromEnd;
        r11.mLastStackFromEnd = r0;
        r0 = 0;
        r11.mPendingSavedState = r0;
        goto L_0x0018;
    L_0x01c0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c2 }
    L_0x01c2:
        r0 = move-exception;
        throw r0;
    L_0x01c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c6 }
    L_0x01c6:
        r0 = move-exception;
        throw r0;
    L_0x01c8:
        r0 = move-exception;
        throw r0;
    L_0x01ca:
        r0 = move-exception;
        throw r0;
    L_0x01cc:
        r0 = move-exception;
        throw r0;
    L_0x01ce:
        r0 = r3;
        r2 = r4;
        goto L_0x017b;
    L_0x01d1:
        r2 = r0;
        r0 = r3;
        goto L_0x00b3;
    L_0x01d5:
        r0 = r2;
        goto L_0x00ae;
    L_0x01d8:
        r4 = r0;
        goto L_0x00a8;
    L_0x01db:
        r0 = r3;
        goto L_0x00b3;
    L_0x01de:
        r2 = r1;
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.onLayoutChildren(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State):void");
    }

    private int computeScrollRange(State state) {
        boolean z = false;
        try {
            if (getChildCount() == 0) {
                return 0;
            }
            try {
                ensureLayoutState();
                OrientationHelper orientationHelper = this.mOrientationHelper;
                try {
                    View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
                    if (!this.mSmoothScrollbarEnabled) {
                        z = true;
                    }
                    return ScrollbarHelper.computeScrollRange(state, orientationHelper, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(z, true), this, this.mSmoothScrollbarEnabled);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private View findFirstReferenceChild(Recycler recycler, State state) {
        return findReferenceChild(recycler, state, 0, getChildCount(), state.getItemCount());
    }

    private View getChildClosestToEnd() {
        try {
            return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        return findOneVisibleChild == null ? -1 : getPosition(findOneVisibleChild);
    }

    private View getChildClosestToStart() {
        try {
            return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int computeVerticalScrollRange(State state) {
        return computeScrollRange(state);
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            try {
                if (getPosition(childAt) == i) {
                    return childAt;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return super.findViewByPosition(i);
    }

    View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4 = ViewHolder.a;
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        View view = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(childAt);
            int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(childAt);
            if (decoratedStart < endAfterPadding && decoratedEnd > startAfterPadding) {
                if (z) {
                    if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                        return childAt;
                    }
                    if (z2 && r1 == null) {
                        if (i4 == 0) {
                            view = childAt;
                        }
                    }
                }
                return childAt;
            }
            i += i3;
            if (i4 != 0) {
                break;
            }
        }
        return view;
    }

    private void recycleByLayoutState(Recycler recycler, LayoutState layoutState) {
        try {
            if (layoutState.mRecycle) {
                try {
                    if (layoutState.mLayoutDirection == -1) {
                        recycleViewsFromEnd(recycler, layoutState.mScrollingOffset);
                        if (ViewHolder.a == 0) {
                            return;
                        }
                    }
                    recycleViewsFromStart(recycler, layoutState.mScrollingOffset);
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo(this);
        setOrientation(i);
        setReverseLayout(z);
    }

    private View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        try {
            return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo) {
        updateLayoutStateToFillEnd(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    public boolean canScrollVertically() {
        try {
            return this.mOrientation == 1;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void recycleViewsFromStart(Recycler recycler, int i) {
        int i2 = 0;
        int i3 = ViewHolder.a;
        if (i >= 0) {
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                int i4 = childCount - 1;
                while (i4 >= 0) {
                    try {
                        if (this.mOrientationHelper.getDecoratedEnd(getChildAt(i4)) <= i) {
                            i4--;
                            if (i3 != 0) {
                                break;
                            }
                        }
                        recycleChildren(recycler, childCount - 1, i4);
                        return;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                if (i3 == 0) {
                    return;
                }
            }
            while (i2 < childCount) {
                try {
                    if (this.mOrientationHelper.getDecoratedEnd(getChildAt(i2)) > i) {
                        recycleChildren(recycler, 0, i2);
                        return;
                    }
                    i2++;
                    if (i3 != 0) {
                        return;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        }
    }

    LayoutState createLayoutState() {
        return new LayoutState();
    }

    public int computeHorizontalScrollExtent(State state) {
        return computeScrollExtent(state);
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
        try {
            super.onDetachedFromWindow(recyclerView, recycler);
            if (this.mRecycleChildrenOnDetach) {
                removeAndRecycleAllViews(recycler);
                recycler.clear();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int computeVerticalScrollOffset(State state) {
        return computeScrollOffset(state);
    }

    private void recycleViewsFromEnd(Recycler recycler, int i) {
        int i2 = 0;
        int i3 = ViewHolder.a;
        int childCount = getChildCount();
        if (i >= 0) {
            int end = this.mOrientationHelper.getEnd() - i;
            if (this.mShouldReverseLayout) {
                while (i2 < childCount) {
                    try {
                        if (this.mOrientationHelper.getDecoratedStart(getChildAt(i2)) >= end) {
                            i2++;
                            if (i3 != 0) {
                                break;
                            }
                        }
                        recycleChildren(recycler, 0, i2);
                        return;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                if (i3 == 0) {
                    return;
                }
            }
            i2 = childCount - 1;
            while (i2 >= 0) {
                try {
                    if (this.mOrientationHelper.getDecoratedStart(getChildAt(i2)) < end) {
                        recycleChildren(recycler, childCount - 1, i2);
                        return;
                    }
                    i2--;
                    if (i3 != 0) {
                        return;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        }
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        try {
            if (this.mOrientation == 1) {
                return 0;
            }
            return scrollBy(i, recycler, state);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private View findReferenceChildClosestToEnd(Recycler recycler, State state) {
        try {
            return this.mShouldReverseLayout ? findFirstReferenceChild(recycler, state) : findLastReferenceChild(recycler, state);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    int scrollBy(int i, Recycler recycler, State state) {
        try {
            if (getChildCount() == 0 || i == 0) {
                return 0;
            }
            try {
                int i2;
                this.mLayoutState.mRecycle = true;
                ensureLayoutState();
                if (i > 0) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                int abs = Math.abs(i);
                updateLayoutState(i2, abs, true, state);
                int fill = this.mLayoutState.mScrollingOffset + fill(recycler, this.mLayoutState, state, false);
                if (fill < 0) {
                    return 0;
                }
                if (abs > fill) {
                    i = i2 * fill;
                }
                this.mOrientationHelper.offsetChildren(-i);
                this.mLayoutState.mLastScrollDelta = i;
                return i;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private boolean updateAnchorFromChildren(Recycler recycler, State state, AnchorInfo anchorInfo) {
        try {
            if (getChildCount() == 0) {
                return false;
            }
            View focusedChild = getFocusedChild();
            if (focusedChild != null) {
                try {
                    if (AnchorInfo.access$000(anchorInfo, focusedChild, state)) {
                        anchorInfo.assignFromViewAndKeepVisibleRect(focusedChild);
                        return true;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            try {
                if (this.mLastStackFromEnd != this.mStackFromEnd) {
                    return false;
                }
                try {
                    if (anchorInfo.mLayoutFromEnd) {
                        focusedChild = findReferenceChildClosestToEnd(recycler, state);
                    } else {
                        focusedChild = findReferenceChildClosestToStart(recycler, state);
                    }
                    if (focusedChild == null) {
                        return false;
                    }
                    try {
                        anchorInfo.assignFromView(focusedChild);
                        if (!state.isPreLayout()) {
                            if (supportsPredictiveItemAnimations()) {
                                try {
                                    boolean z;
                                    int startAfterPadding;
                                    if (this.mOrientationHelper.getDecoratedStart(focusedChild) < this.mOrientationHelper.getEndAfterPadding()) {
                                        try {
                                            if (this.mOrientationHelper.getDecoratedEnd(focusedChild) >= this.mOrientationHelper.getStartAfterPadding()) {
                                                z = false;
                                                if (z) {
                                                    try {
                                                        if (anchorInfo.mLayoutFromEnd) {
                                                            startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
                                                        } else {
                                                            startAfterPadding = this.mOrientationHelper.getEndAfterPadding();
                                                        }
                                                        anchorInfo.mCoordinate = startAfterPadding;
                                                    } catch (IllegalArgumentException e2) {
                                                        throw e2;
                                                    }
                                                }
                                            }
                                        } catch (IllegalArgumentException e22) {
                                            throw e22;
                                        }
                                    }
                                    z = true;
                                    if (z) {
                                        if (anchorInfo.mLayoutFromEnd) {
                                            startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
                                        } else {
                                            startAfterPadding = this.mOrientationHelper.getEndAfterPadding();
                                        }
                                        anchorInfo.mCoordinate = startAfterPadding;
                                    }
                                } catch (IllegalArgumentException e222) {
                                    throw e222;
                                }
                            }
                        }
                        return true;
                    } catch (IllegalArgumentException e2222) {
                        throw e2222;
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                }
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            }
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        }
    }

    public int computeHorizontalScrollRange(State state) {
        return computeScrollRange(state);
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        try {
            int i3;
            this.mLayoutState.mAvailable = i2 - this.mOrientationHelper.getStartAfterPadding();
            this.mLayoutState.mCurrentPosition = i;
            LayoutState layoutState = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            layoutState.mItemDirection = i3;
            this.mLayoutState.mLayoutDirection = -1;
            this.mLayoutState.mOffset = i2;
            this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private int computeScrollExtent(State state) {
        boolean z = false;
        try {
            if (getChildCount() == 0) {
                return 0;
            }
            try {
                ensureLayoutState();
                OrientationHelper orientationHelper = this.mOrientationHelper;
                try {
                    View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
                    if (!this.mSmoothScrollbarEnabled) {
                        z = true;
                    }
                    return ScrollbarHelper.computeScrollExtent(state, orientationHelper, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(z, true), this, this.mSmoothScrollbarEnabled);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }
}
