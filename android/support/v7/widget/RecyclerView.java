package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.os.TraceCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.support.v4.widget.ScrollerCompat;
import android.support.v7.recyclerview.R;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild {
    private static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    private static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static boolean a;
    private static final Interpolator sQuinticInterpolator;
    private static final String[] z;
    private RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    private OnItemTouchListener mActiveOnItemTouchListener;
    private Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    private boolean mAdapterUpdateDuringMeasure;
    private EdgeEffectCompat mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    private boolean mClipToPadding;
    private boolean mDataSetHasChangedAfterLayout;
    private boolean mEatRequestLayout;
    private int mEatenAccessibilityChangeFlags;
    private boolean mFirstLayoutComplete;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    private final ArrayList mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    private LayoutManager mLayout;
    private boolean mLayoutFrozen;
    private int mLayoutOrScrollCounter;
    private boolean mLayoutRequestEaten;
    private EdgeEffectCompat mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List mOnChildAttachStateListeners;
    private final ArrayList mOnItemTouchListeners;
    private SavedState mPendingSavedState;
    private final boolean mPostUpdatesOnAnimation;
    private boolean mPostedAnimatorRunner;
    final Recycler mRecycler;
    private RecyclerListener mRecyclerListener;
    private EdgeEffectCompat mRightGlow;
    private final int[] mScrollConsumed;
    private float mScrollFactor;
    private OnScrollListener mScrollListener;
    private List mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private final NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    private final Rect mTempRect;
    private EdgeEffectCompat mTopGlow;
    private int mTouchSlop;
    private final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    private final ViewFlinger mViewFlinger;
    private final ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;

    public abstract class ViewHolder {
        private static final List FULLUPDATE_PAYLOADS;
        public static int a;
        private static final String[] z;
        public final View itemView;
        private int mFlags;
        private boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        int mOldPosition;
        RecyclerView mOwnerRecyclerView;
        List mPayloads;
        int mPosition;
        int mPreLayoutPosition;
        private Recycler mScrapContainer;
        ViewHolder mShadowedHolder;
        ViewHolder mShadowingHolder;
        List mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        private void onEnteredHiddenState() {
            this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(this.itemView);
            ViewCompat.setImportantForAccessibility(this.itemView, 4);
        }

        void clearPayload() {
            try {
                if (this.mPayloads != null) {
                    this.mPayloads.clear();
                }
                this.mFlags &= -1025;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        boolean isScrap() {
            try {
                return this.mScrapContainer != null;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        boolean isInvalid() {
            try {
                return (this.mFlags & 4) != 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        static void access$1600(ViewHolder viewHolder) {
            viewHolder.onEnteredHiddenState();
        }

        void setScrapContainer(Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        boolean needsUpdate() {
            try {
                return (this.mFlags & 2) != 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        void addFlags(int i) {
            this.mFlags |= i;
        }

        private boolean doesTransientStatePreventRecycling() {
            try {
                if ((this.mFlags & 16) == 0) {
                    if (ViewCompat.hasTransientState(this.itemView)) {
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

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        private void onLeftHiddenState() {
            ViewCompat.setImportantForAccessibility(this.itemView, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public final boolean isRecyclable() {
            try {
                if ((this.mFlags & 16) == 0) {
                    if (!ViewCompat.hasTransientState(this.itemView)) {
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

        public final int getLayoutPosition() {
            try {
                return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(z[3] + Integer.toHexString(hashCode()) + z[14] + this.mPosition + z[9] + this.mItemId + z[10] + this.mOldPosition + z[13] + this.mPreLayoutPosition);
            try {
                if (isScrap()) {
                    stringBuilder.append(z[11]).append(this.mInChangeScrap ? z[17] : z[7]);
                }
                try {
                    if (isInvalid()) {
                        stringBuilder.append(z[6]);
                    }
                    try {
                        if (!isBound()) {
                            stringBuilder.append(z[1]);
                        }
                        try {
                            if (needsUpdate()) {
                                stringBuilder.append(z[8]);
                            }
                            try {
                                if (isRemoved()) {
                                    stringBuilder.append(z[12]);
                                }
                                try {
                                    if (shouldIgnore()) {
                                        stringBuilder.append(z[4]);
                                    }
                                    try {
                                        if (isTmpDetached()) {
                                            stringBuilder.append(z[15]);
                                        }
                                        try {
                                            if (!isRecyclable()) {
                                                stringBuilder.append(z[16] + this.mIsRecyclableCount + ")");
                                            }
                                            try {
                                                if (isAdapterPositionUnknown()) {
                                                    stringBuilder.append(z[2]);
                                                }
                                                try {
                                                    if (this.itemView.getParent() == null) {
                                                        stringBuilder.append(z[5]);
                                                    }
                                                    stringBuilder.append("}");
                                                    return stringBuilder.toString();
                                                } catch (IllegalArgumentException e) {
                                                    throw e;
                                                }
                                            } catch (IllegalArgumentException e2) {
                                                throw e2;
                                            }
                                        } catch (IllegalArgumentException e22) {
                                            throw e22;
                                        }
                                    } catch (IllegalArgumentException e222) {
                                        throw e222;
                                    }
                                } catch (IllegalArgumentException e2222) {
                                    throw e2222;
                                }
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
            } catch (IllegalArgumentException e222222222) {
                throw e222222222;
            } catch (IllegalArgumentException e2222222222) {
                throw e2222222222;
            }
        }

        public final void setIsRecyclable(boolean z) {
            int i = a;
            if (z) {
                try {
                    int i2 = this.mIsRecyclableCount - 1;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i2 = this.mIsRecyclableCount + 1;
            try {
                this.mIsRecyclableCount = i2;
                if (this.mIsRecyclableCount < 0) {
                    this.mIsRecyclableCount = 0;
                    Log.e(z[19], z[18] + this);
                    if (i == 0) {
                        return;
                    }
                }
                if (!z) {
                    try {
                        if (this.mIsRecyclableCount == 1) {
                            try {
                                this.mFlags |= 16;
                                if (i == 0) {
                                    return;
                                }
                            } catch (IllegalArgumentException e2) {
                                try {
                                    throw e2;
                                } catch (IllegalArgumentException e22) {
                                    throw e22;
                                }
                            }
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
                if (z) {
                    try {
                        if (this.mIsRecyclableCount == 0) {
                            this.mFlags &= -17;
                        }
                    } catch (IllegalArgumentException e2222) {
                        throw e2222;
                    }
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            } catch (IllegalArgumentException e222222) {
                try {
                    throw e222222;
                } catch (IllegalArgumentException e2222222) {
                    throw e2222222;
                }
            }
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        void unScrap() {
            this.mScrapContainer.unscrapView(this);
        }

        static boolean access$4700(ViewHolder viewHolder) {
            return viewHolder.doesTransientStatePreventRecycling();
        }

        boolean isBound() {
            try {
                return (this.mFlags & 1) != 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        boolean isAdapterPositionUnknown() {
            try {
                if ((this.mFlags & 512) == 0) {
                    if (!isInvalid()) {
                        return false;
                    }
                }
                return true;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }

        static {
            String[] strArr = new String[20];
            String str = "]V(e\u001d]G:(&U[mf$@\u0002/mkZW!d";
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
                            i3 = 52;
                            break;
                        case at.g /*1*/:
                            i3 = 34;
                            break;
                        case at.i /*2*/:
                            i3 = 77;
                            break;
                        case at.o /*3*/:
                            i3 = 8;
                            break;
                        default:
                            i3 = 75;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u0014W#l.RK#m/\u0014C)i;@G?(;[Q$|\"[L";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "bK(\u007f\u0003[N)m9O";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "\u0014K*f$FG)";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "\u0014L\"(;UP(f?";
                        obj = 4;
                        strArr2 = strArr3;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\u0014K#~*XK)";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "oC9|*WJ(l\u0018WP,x\u0016";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        str = "\u0014W=l*@G";
                        obj = 7;
                        i = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        strArr2 = strArr3;
                        str = "\u0014K)5";
                        obj = 8;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\u0018\u0002\"d/dM>5";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "\u0014Q.z*D\u0002";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "\u0014P(e$BG)";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "\u0018\u0002=D;[Qw";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "\u0014R\"{\"@K\"fv";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "\u0014V x\u000fQV,k#QF";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "\u0014L\"|kFG.q(XC/d.\u001c";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "oA%i%SG\u001ek9UR\u0010";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "]Q\u001fm(MA!i)XGml.WP(e.ZV(lkVG!g<\u0014\u0012w(>ZO,|(\\G)(;UK?($R\u0002>m?}Q\u001fm(MC/d.\u001c\u000bmk*XN>(-[Pm";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "bK(\u007f";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        z = strArr3;
                        FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u0014W#j$AL)";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                try {
                    addFlags(1024);
                    if (a == 0) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            if ((this.mFlags & 1024) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void saveOldPosition() {
            try {
                if (this.mOldPosition == -1) {
                    this.mOldPosition = this.mPosition;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        boolean isUpdated() {
            try {
                return (this.mFlags & 2) != 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        boolean hasAnyOfTheFlags(int i) {
            try {
                return (this.mFlags & i) != 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        boolean wasReturnedFromScrap() {
            try {
                return (this.mFlags & 32) != 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean isTmpDetached() {
            try {
                return (this.mFlags & 256) != 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        static Recycler access$4802(ViewHolder viewHolder, Recycler recycler) {
            viewHolder.mScrapContainer = recycler;
            return recycler;
        }

        static boolean access$6100(ViewHolder viewHolder) {
            return viewHolder.shouldBeKeptAsChild();
        }

        private void createPayloadsIfNeeded() {
            try {
                if (this.mPayloads == null) {
                    this.mPayloads = new ArrayList();
                    this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        boolean isRemoved() {
            try {
                return (this.mFlags & 8) != 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        void setFlags(int i, int i2) {
            this.mFlags = (this.mFlags & (i2 ^ -1)) | (i & i2);
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public ViewHolder(View view) {
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mItemViewType = -1;
            this.mPreLayoutPosition = -1;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            this.mPayloads = null;
            this.mUnmodifiedPayloads = null;
            this.mIsRecyclableCount = 0;
            this.mScrapContainer = null;
            this.mInChangeScrap = false;
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            if (view == null) {
                throw new IllegalArgumentException(z[0]);
            }
            this.itemView = view;
        }

        static boolean access$4900(ViewHolder viewHolder) {
            return viewHolder.mInChangeScrap;
        }

        boolean shouldIgnore() {
            try {
                return (this.mFlags & 128) != 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        private boolean shouldBeKeptAsChild() {
            try {
                return (this.mFlags & 16) != 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public final int getAdapterPosition() {
            try {
                if (this.mOwnerRecyclerView == null) {
                    return -1;
                }
                return RecyclerView.access$5500(this.mOwnerRecyclerView, this);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        static int access$6300(ViewHolder viewHolder) {
            return viewHolder.mFlags;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        List getUnmodifiedPayloads() {
            try {
                if ((this.mFlags & 1024) != 0) {
                    return FULLUPDATE_PAYLOADS;
                }
                if (this.mPayloads != null) {
                    try {
                        if (this.mPayloads.size() != 0) {
                            return this.mUnmodifiedPayloads;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                return FULLUPDATE_PAYLOADS;
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }

        static boolean access$4902(ViewHolder viewHolder, boolean z) {
            viewHolder.mInChangeScrap = z;
            return z;
        }

        void offsetPosition(int i, boolean z) {
            try {
                if (this.mOldPosition == -1) {
                    this.mOldPosition = this.mPosition;
                }
                try {
                    if (this.mPreLayoutPosition == -1) {
                        this.mPreLayoutPosition = this.mPosition;
                    }
                    if (z) {
                        try {
                            this.mPreLayoutPosition += i;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    try {
                        this.mPosition += i;
                        if (this.itemView.getLayoutParams() != null) {
                            ((LayoutParams) this.itemView.getLayoutParams()).mInsetsDirty = true;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }

        static void access$1700(ViewHolder viewHolder) {
            viewHolder.onLeftHiddenState();
        }
    }

    public abstract class Adapter {
        private static final String[] z;
        private boolean mHasStableIds;
        private final AdapterDataObservable mObservable;

        static {
            String[] strArr = new String[2];
            String str = "\n\u0012\nWt\u001a-D|L1!]";
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
                            i3 = 88;
                            break;
                        case at.g /*1*/:
                            i3 = 68;
                            break;
                        case at.i /*2*/:
                            i3 = 42;
                            break;
                        case at.o /*3*/:
                            i3 = 24;
                            break;
                        default:
                            i3 = 26;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "\n\u0012\n[h=%^}L1!]";
                        obj = null;
                }
            }
        }

        public abstract int getItemCount();

        public abstract void onBindViewHolder(ViewHolder viewHolder, int i);

        public abstract ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i);

        public void registerAdapterDataObserver(AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public long getItemId(int i) {
            return -1;
        }

        public void onViewRecycled(ViewHolder viewHolder) {
        }

        public void onViewDetachedFromWindow(ViewHolder viewHolder) {
        }

        public void unregisterAdapterDataObserver(AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public final void bindViewHolder(ViewHolder viewHolder, int i) {
            viewHolder.mPosition = i;
            if (hasStableIds()) {
                viewHolder.mItemId = getItemId(i);
            }
            viewHolder.setFlags(1, 519);
            TraceCompat.beginSection(z[0]);
            onBindViewHolder(viewHolder, i, viewHolder.getUnmodifiedPayloads());
            viewHolder.clearPayload();
            TraceCompat.endSection();
        }

        public Adapter() {
            this.mObservable = new AdapterDataObservable();
            this.mHasStableIds = false;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public boolean onFailedToRecycleView(ViewHolder viewHolder) {
            return false;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onBindViewHolder(ViewHolder viewHolder, int i, List list) {
            onBindViewHolder(viewHolder, i);
        }

        public void onViewAttachedToWindow(ViewHolder viewHolder) {
        }

        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
        }

        public final ViewHolder createViewHolder(ViewGroup viewGroup, int i) {
            TraceCompat.beginSection(z[1]);
            ViewHolder onCreateViewHolder = onCreateViewHolder(viewGroup, i);
            onCreateViewHolder.mItemViewType = i;
            TraceCompat.endSection();
            return onCreateViewHolder;
        }
    }

    public abstract class ItemAnimator {
        private long mAddDuration;
        private long mChangeDuration;
        private ArrayList mFinishedListeners;
        private ItemAnimatorListener mListener;
        private long mMoveDuration;
        private long mRemoveDuration;

        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        interface ItemAnimatorListener {
            void onAnimationFinished(ViewHolder viewHolder);
        }

        public class ItemHolderInfo {
            public int bottom;
            public int left;
            public int right;
            public int top;

            public ItemHolderInfo setFrom(ViewHolder viewHolder, int i) {
                View view = viewHolder.itemView;
                this.left = view.getLeft();
                this.top = view.getTop();
                this.right = view.getRight();
                this.bottom = view.getBottom();
                return this;
            }

            public ItemHolderInfo setFrom(ViewHolder viewHolder) {
                return setFrom(viewHolder, 0);
            }
        }

        public abstract boolean animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract void endAnimation(ViewHolder viewHolder);

        public abstract void endAnimations();

        public abstract boolean isRunning();

        public abstract void runPendingAnimations();

        static int buildAdapterChangeFlagsForAnimations(ViewHolder viewHolder) {
            int access$6300 = ViewHolder.access$6300(viewHolder) & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((access$6300 & 4) != 0) {
                return access$6300;
            }
            int oldPosition = viewHolder.getOldPosition();
            int adapterPosition = viewHolder.getAdapterPosition();
            if (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) {
                return access$6300;
            }
            return access$6300 | 2048;
        }

        @NonNull
        public ItemHolderInfo recordPreLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder, int i, @NonNull List list) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        public void onAnimationFinished(ViewHolder viewHolder) {
        }

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public final void dispatchAnimationsFinished() {
            int i = ViewHolder.a;
            int size = this.mFinishedListeners.size();
            int i2 = 0;
            while (i2 < size) {
                ((ItemAnimatorFinishedListener) this.mFinishedListeners.get(i2)).onAnimationsFinished();
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            this.mFinishedListeners.clear();
        }

        void setListener(ItemAnimatorListener itemAnimatorListener) {
            this.mListener = itemAnimatorListener;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        @NonNull
        public ItemHolderInfo recordPostLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        public ItemHolderInfo obtainHolderInfo() {
            return new ItemHolderInfo();
        }

        public ItemAnimator() {
            this.mListener = null;
            this.mFinishedListeners = new ArrayList();
            this.mAddDuration = 120;
            this.mRemoveDuration = 120;
            this.mMoveDuration = 250;
            this.mChangeDuration = 250;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public final void dispatchAnimationFinished(ViewHolder viewHolder) {
            onAnimationFinished(viewHolder);
            if (this.mListener != null) {
                this.mListener.onAnimationFinished(viewHolder);
            }
        }

        public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
            return true;
        }
    }

    public abstract class LayoutManager {
        private static final String[] z;
        ChildHelper mChildHelper;
        private boolean mIsAttachedToWindow;
        RecyclerView mRecyclerView;
        private boolean mRequestedSimpleAnimations;
        @Nullable
        SmoothScroller mSmoothScroller;

        static {
            String[] strArr = new String[4];
            String str = "\rg\u0002)p:&\u0001(i+&\rg|&o\u0000#?(t\u0003*? i\u0002jz6o\u001f3v aL.q*c\u0014}";
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
                            i3 = 78;
                            break;
                        case at.g /*1*/:
                            i3 = 6;
                            break;
                        case at.i /*2*/:
                            i3 = arj.Theme_spinnerStyle;
                            break;
                        case at.o /*3*/:
                            i3 = 71;
                            break;
                        default:
                            i3 = 31;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u0017i\u0019gr;u\u0018gp8c\u001e5v*cL(q\u0002g\u0015(j:E\u0004.s*t\t)7\u001cc\u000f>|\"c\u001egm+e\u0015$s+t@gL:g\u0018\"?=r\r3zg&";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "\u000fb\b\"{nP\u0005\"hnn\r4?\u001cc\u000f>|\"c\u001e\u0011v+qL&lnv\r5z rL%j:&\u001a.z9&\u00054? i\u0018g~nt\t&sne\u0004.s*(L\u0012q(o\u00003z<c\bgv b\t?%";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u001cc\u000f>|\"c\u001e\u0011v+q";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public boolean isSmoothScrolling() {
            try {
                if (this.mSmoothScroller != null) {
                    if (this.mSmoothScroller.isRunning()) {
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

        void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                try {
                    if (!childViewHolderInt.isRemoved()) {
                        if (!this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                            onInitializeAccessibilityNodeInfoForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, accessibilityNodeInfoCompat);
                        }
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        }

        public int computeVerticalScrollRange(State state) {
            return 0;
        }

        public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
            return 0;
        }

        public int getPaddingBottom() {
            try {
                return this.mRecyclerView != null ? this.mRecyclerView.getPaddingBottom() : 0;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, recycler);
        }

        @Nullable
        public View onFocusSearchFailed(View view, int i, Recycler recycler, State state) {
            return null;
        }

        public View findViewByPosition(int i) {
            int i2 = ViewHolder.a;
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (!(childViewHolderInt == null && i2 == 0)) {
                    try {
                        if (childViewHolderInt.getLayoutPosition() == i) {
                            if (!childViewHolderInt.shouldIgnore()) {
                                try {
                                    if (this.mRecyclerView.mState.isPreLayout()) {
                                        return childAt;
                                    }
                                    try {
                                        if (!childViewHolderInt.isRemoved()) {
                                            return childAt;
                                        }
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            }
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                }
                int i4 = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = i4;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(Recycler recycler, State state, AccessibilityEvent accessibilityEvent) {
            boolean z = true;
            AccessibilityRecordCompat asRecord = AccessibilityEventCompat.asRecord(accessibilityEvent);
            try {
                if (this.mRecyclerView != null && asRecord != null) {
                    try {
                        if (!ViewCompat.canScrollVertically(this.mRecyclerView, 1)) {
                            if (!ViewCompat.canScrollVertically(this.mRecyclerView, -1)) {
                                try {
                                    if (!ViewCompat.canScrollHorizontally(this.mRecyclerView, -1)) {
                                        try {
                                            if (!ViewCompat.canScrollHorizontally(this.mRecyclerView, 1)) {
                                                z = false;
                                            }
                                        } catch (IllegalStateException e) {
                                            throw e;
                                        }
                                    }
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            }
                        }
                        try {
                            asRecord.setScrollable(z);
                            if (RecyclerView.access$2900(this.mRecyclerView) != null) {
                                asRecord.setItemCount(RecyclerView.access$2900(this.mRecyclerView).getItemCount());
                            }
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    } catch (IllegalStateException e222) {
                        throw e222;
                    } catch (IllegalStateException e2222) {
                        throw e2222;
                    }
                }
            } catch (IllegalStateException e22222) {
                throw e22222;
            } catch (IllegalStateException e222222) {
                throw e222222;
            }
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
            return false;
        }

        public void scrollToPosition(int i) {
        }

        public boolean isLayoutHierarchical(Recycler recycler, State state) {
            return false;
        }

        public int computeVerticalScrollExtent(State state) {
            return 0;
        }

        private void scrapOrRecycleView(Recycler recycler, int i, View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            try {
                if (!childViewHolderInt.shouldIgnore()) {
                    try {
                        if (childViewHolderInt.isInvalid()) {
                            if (!childViewHolderInt.isRemoved()) {
                                try {
                                    if (!RecyclerView.access$2900(this.mRecyclerView).hasStableIds()) {
                                        try {
                                            removeViewAt(i);
                                            recycler.recycleViewHolderInternal(childViewHolderInt);
                                            if (ViewHolder.a == 0) {
                                                return;
                                            }
                                        } catch (IllegalStateException e) {
                                            throw e;
                                        }
                                    }
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            }
                        }
                        detachViewAt(i);
                        recycler.scrapView(view);
                    } catch (IllegalStateException e22) {
                        throw e22;
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void attachView(android.view.View r3, int r4, android.support.v7.widget.RecyclerView.LayoutParams r5) {
            /*
            r2 = this;
            r0 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(r3);
            r1 = r0.isRemoved();	 Catch:{ IllegalStateException -> 0x0026 }
            if (r1 == 0) goto L_0x0015;
        L_0x000a:
            r1 = r2.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0028 }
            r1 = r1.mViewInfoStore;	 Catch:{ IllegalStateException -> 0x0028 }
            r1.addToDisappearedInLayout(r0);	 Catch:{ IllegalStateException -> 0x0028 }
            r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IllegalStateException -> 0x0028 }
            if (r1 == 0) goto L_0x001c;
        L_0x0015:
            r1 = r2.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0028 }
            r1 = r1.mViewInfoStore;	 Catch:{ IllegalStateException -> 0x0028 }
            r1.removeFromDisappearedInLayout(r0);	 Catch:{ IllegalStateException -> 0x0028 }
        L_0x001c:
            r1 = r2.mChildHelper;
            r0 = r0.isRemoved();
            r1.attachViewToParent(r3, r4, r5, r0);
            return;
        L_0x0026:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0028 }
        L_0x0028:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.LayoutManager.attachView(android.view.View, int, android.support.v7.widget.RecyclerView$LayoutParams):void");
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
            return performAccessibilityActionForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, i, bundle);
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return rect.right + (view.getMeasuredWidth() + rect.left);
        }

        private void onSmoothScrollerStopped(SmoothScroller smoothScroller) {
            try {
                if (this.mSmoothScroller == smoothScroller) {
                    this.mSmoothScroller = null;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public int computeHorizontalScrollRange(State state) {
            return 0;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void addViewInt(android.view.View r8, int r9, boolean r10) {
            /*
            r7 = this;
            r6 = -1;
            r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            r2 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(r8);
            if (r10 != 0) goto L_0x000f;
        L_0x0009:
            r0 = r2.isRemoved();	 Catch:{ IllegalStateException -> 0x0087 }
            if (r0 == 0) goto L_0x0018;
        L_0x000f:
            r0 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0089 }
            r0 = r0.mViewInfoStore;	 Catch:{ IllegalStateException -> 0x0089 }
            r0.addToDisappearedInLayout(r2);	 Catch:{ IllegalStateException -> 0x0089 }
            if (r1 == 0) goto L_0x001f;
        L_0x0018:
            r0 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0089 }
            r0 = r0.mViewInfoStore;	 Catch:{ IllegalStateException -> 0x0089 }
            r0.removeFromDisappearedInLayout(r2);	 Catch:{ IllegalStateException -> 0x0089 }
        L_0x001f:
            r0 = r8.getLayoutParams();
            r0 = (android.support.v7.widget.RecyclerView.LayoutParams) r0;
            r3 = r2.wasReturnedFromScrap();	 Catch:{ IllegalStateException -> 0x008b }
            if (r3 != 0) goto L_0x0031;
        L_0x002b:
            r3 = r2.isScrap();	 Catch:{ IllegalStateException -> 0x008d }
            if (r3 == 0) goto L_0x004b;
        L_0x0031:
            r3 = r2.isScrap();	 Catch:{ IllegalStateException -> 0x008f }
            if (r3 == 0) goto L_0x003c;
        L_0x0037:
            r2.unScrap();	 Catch:{ IllegalStateException -> 0x0091 }
            if (r1 == 0) goto L_0x003f;
        L_0x003c:
            r2.clearReturnedFromScrapFlag();	 Catch:{ IllegalStateException -> 0x0091 }
        L_0x003f:
            r3 = r7.mChildHelper;	 Catch:{ IllegalStateException -> 0x0093 }
            r4 = r8.getLayoutParams();	 Catch:{ IllegalStateException -> 0x0093 }
            r5 = 0;
            r3.attachViewToParent(r8, r9, r4, r5);	 Catch:{ IllegalStateException -> 0x0093 }
            if (r1 == 0) goto L_0x00bc;
        L_0x004b:
            r3 = r8.getParent();	 Catch:{ IllegalStateException -> 0x0093 }
            r4 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0093 }
            if (r3 != r4) goto L_0x00a2;
        L_0x0053:
            r3 = r7.mChildHelper;
            r3 = r3.indexOfChild(r8);
            if (r9 != r6) goto L_0x0061;
        L_0x005b:
            r4 = r7.mChildHelper;
            r9 = r4.getChildCount();
        L_0x0061:
            if (r3 != r6) goto L_0x0095;
        L_0x0063:
            r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0085 }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0085 }
            r1.<init>();	 Catch:{ IllegalStateException -> 0x0085 }
            r2 = z;	 Catch:{ IllegalStateException -> 0x0085 }
            r3 = 3;
            r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0085 }
            r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0085 }
            r2 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0085 }
            r2 = r2.indexOfChild(r8);	 Catch:{ IllegalStateException -> 0x0085 }
            r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0085 }
            r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0085 }
            r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0085 }
            throw r0;	 Catch:{ IllegalStateException -> 0x0085 }
        L_0x0085:
            r0 = move-exception;
            throw r0;
        L_0x0087:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0089 }
        L_0x0089:
            r0 = move-exception;
            throw r0;
        L_0x008b:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x008d }
        L_0x008d:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x008f }
        L_0x008f:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0091 }
        L_0x0091:
            r0 = move-exception;
            throw r0;
        L_0x0093:
            r0 = move-exception;
            throw r0;
        L_0x0095:
            if (r3 == r9) goto L_0x00a0;
        L_0x0097:
            r4 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x00c9 }
            r4 = android.support.v7.widget.RecyclerView.access$1100(r4);	 Catch:{ IllegalStateException -> 0x00c9 }
            r4.moveView(r3, r9);	 Catch:{ IllegalStateException -> 0x00c9 }
        L_0x00a0:
            if (r1 == 0) goto L_0x00bc;
        L_0x00a2:
            r1 = r7.mChildHelper;	 Catch:{ IllegalStateException -> 0x00cb }
            r3 = 0;
            r1.addView(r8, r9, r3);	 Catch:{ IllegalStateException -> 0x00cb }
            r1 = 1;
            r0.mInsetsDirty = r1;	 Catch:{ IllegalStateException -> 0x00cb }
            r1 = r7.mSmoothScroller;	 Catch:{ IllegalStateException -> 0x00cb }
            if (r1 == 0) goto L_0x00bc;
        L_0x00af:
            r1 = r7.mSmoothScroller;	 Catch:{ IllegalStateException -> 0x00cd }
            r1 = r1.isRunning();	 Catch:{ IllegalStateException -> 0x00cd }
            if (r1 == 0) goto L_0x00bc;
        L_0x00b7:
            r1 = r7.mSmoothScroller;	 Catch:{ IllegalStateException -> 0x00cd }
            r1.onChildAttachedToWindow(r8);	 Catch:{ IllegalStateException -> 0x00cd }
        L_0x00bc:
            r1 = r0.mPendingInvalidate;	 Catch:{ IllegalStateException -> 0x00cf }
            if (r1 == 0) goto L_0x00c8;
        L_0x00c0:
            r1 = r2.itemView;	 Catch:{ IllegalStateException -> 0x00cf }
            r1.invalidate();	 Catch:{ IllegalStateException -> 0x00cf }
            r1 = 0;
            r0.mPendingInvalidate = r1;	 Catch:{ IllegalStateException -> 0x00cf }
        L_0x00c8:
            return;
        L_0x00c9:
            r0 = move-exception;
            throw r0;
        L_0x00cb:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x00cd }
        L_0x00cd:
            r0 = move-exception;
            throw r0;
        L_0x00cf:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.LayoutManager.addViewInt(android.view.View, int, boolean):void");
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        public int getChildCount() {
            try {
                return this.mChildHelper != null ? this.mChildHelper.getChildCount() : 0;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            onInitializeAccessibilityNodeInfo(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityNodeInfoCompat);
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void removeAndRecycleAllViews(Recycler recycler) {
            int i = ViewHolder.a;
            int childCount = getChildCount() - 1;
            while (childCount >= 0) {
                try {
                    if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                        removeAndRecycleViewAt(childCount, recycler);
                    }
                    childCount--;
                    if (i != 0) {
                        return;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }

        public void removeView(View view) {
            this.mChildHelper.removeView(view);
        }

        public int getLayoutDirection() {
            return ViewCompat.getLayoutDirection(this.mRecyclerView);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean performAccessibilityAction(android.support.v7.widget.RecyclerView.Recycler r8, android.support.v7.widget.RecyclerView.State r9, int r10, android.os.Bundle r11) {
            /*
            r7 = this;
            r4 = -1;
            r2 = 1;
            r1 = 0;
            r0 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0008 }
            if (r0 != 0) goto L_0x000a;
        L_0x0007:
            return r1;
        L_0x0008:
            r0 = move-exception;
            throw r0;
        L_0x000a:
            switch(r10) {
                case 4096: goto L_0x008b;
                case 8192: goto L_0x001a;
                default: goto L_0x000d;
            };
        L_0x000d:
            r0 = r1;
            r3 = r1;
        L_0x000f:
            if (r3 != 0) goto L_0x0013;
        L_0x0011:
            if (r0 == 0) goto L_0x0007;
        L_0x0013:
            r1 = r7.mRecyclerView;
            r1.scrollBy(r0, r3);
            r1 = r2;
            goto L_0x0007;
        L_0x001a:
            r0 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x007e }
            r3 = -1;
            r0 = android.support.v4.view.ViewCompat.canScrollVertically(r0, r3);	 Catch:{ IllegalStateException -> 0x007e }
            if (r0 == 0) goto L_0x0089;
        L_0x0023:
            r0 = r7.getHeight();
            r3 = r7.getPaddingTop();
            r0 = r0 - r3;
            r3 = r7.getPaddingBottom();
            r0 = r0 - r3;
            r0 = -r0;
        L_0x0032:
            r3 = r7.mRecyclerView;
            r3 = android.support.v4.view.ViewCompat.canScrollHorizontally(r3, r4);
            if (r3 == 0) goto L_0x0086;
        L_0x003a:
            r3 = r7.getWidth();
            r4 = r7.getPaddingLeft();
            r3 = r3 - r4;
            r4 = r7.getPaddingRight();
            r3 = r3 - r4;
            r3 = -r3;
            r4 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IllegalStateException -> 0x0080 }
            if (r4 == 0) goto L_0x0082;
        L_0x004d:
            r4 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0080 }
            r5 = 1;
            r4 = android.support.v4.view.ViewCompat.canScrollVertically(r4, r5);	 Catch:{ IllegalStateException -> 0x0080 }
            if (r4 == 0) goto L_0x0064;
        L_0x0056:
            r0 = r7.getHeight();
            r4 = r7.getPaddingTop();
            r0 = r0 - r4;
            r4 = r7.getPaddingBottom();
            r0 = r0 - r4;
        L_0x0064:
            r4 = r7.mRecyclerView;
            r4 = android.support.v4.view.ViewCompat.canScrollHorizontally(r4, r2);
            if (r4 == 0) goto L_0x0082;
        L_0x006c:
            r3 = r7.getWidth();
            r4 = r7.getPaddingLeft();
            r3 = r3 - r4;
            r4 = r7.getPaddingRight();
            r3 = r3 - r4;
            r6 = r3;
            r3 = r0;
            r0 = r6;
            goto L_0x000f;
        L_0x007e:
            r0 = move-exception;
            throw r0;
        L_0x0080:
            r0 = move-exception;
            throw r0;
        L_0x0082:
            r6 = r3;
            r3 = r0;
            r0 = r6;
            goto L_0x000f;
        L_0x0086:
            r3 = r0;
            r0 = r1;
            goto L_0x000f;
        L_0x0089:
            r0 = r1;
            goto L_0x0032;
        L_0x008b:
            r3 = r1;
            r0 = r1;
            goto L_0x004d;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.LayoutManager.performAccessibilityAction(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, int, android.os.Bundle):boolean");
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onAdapterChanged(Adapter adapter, Adapter adapter2) {
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public int getBottomDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
        }

        public void addView(View view) {
            addView(view, -1);
        }

        boolean performAccessibilityAction(int i, Bundle bundle) {
            return performAccessibilityAction(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, i, bundle);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onInitializeAccessibilityNodeInfo(android.support.v7.widget.RecyclerView.Recycler r5, android.support.v7.widget.RecyclerView.State r6, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat r7) {
            /*
            r4 = this;
            r0 = r4.mRecyclerView;	 Catch:{ IllegalStateException -> 0x004e }
            r1 = -1;
            r0 = android.support.v4.view.ViewCompat.canScrollVertically(r0, r1);	 Catch:{ IllegalStateException -> 0x004e }
            if (r0 != 0) goto L_0x0012;
        L_0x0009:
            r0 = r4.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0050 }
            r1 = -1;
            r0 = android.support.v4.view.ViewCompat.canScrollHorizontally(r0, r1);	 Catch:{ IllegalStateException -> 0x0050 }
            if (r0 == 0) goto L_0x001b;
        L_0x0012:
            r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            r7.addAction(r0);	 Catch:{ IllegalStateException -> 0x0050 }
            r0 = 1;
            r7.setScrollable(r0);	 Catch:{ IllegalStateException -> 0x0050 }
        L_0x001b:
            r0 = r4.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0052 }
            r1 = 1;
            r0 = android.support.v4.view.ViewCompat.canScrollVertically(r0, r1);	 Catch:{ IllegalStateException -> 0x0052 }
            if (r0 != 0) goto L_0x002d;
        L_0x0024:
            r0 = r4.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0054 }
            r1 = 1;
            r0 = android.support.v4.view.ViewCompat.canScrollHorizontally(r0, r1);	 Catch:{ IllegalStateException -> 0x0054 }
            if (r0 == 0) goto L_0x0036;
        L_0x002d:
            r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            r7.addAction(r0);	 Catch:{ IllegalStateException -> 0x0054 }
            r0 = 1;
            r7.setScrollable(r0);	 Catch:{ IllegalStateException -> 0x0054 }
        L_0x0036:
            r0 = r4.getRowCountForAccessibility(r5, r6);
            r1 = r4.getColumnCountForAccessibility(r5, r6);
            r2 = r4.isLayoutHierarchical(r5, r6);
            r3 = r4.getSelectionModeForAccessibility(r5, r6);
            r0 = android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r0, r1, r2, r3);
            r7.setCollectionInfo(r0);
            return;
        L_0x004e:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0050 }
        L_0x0050:
            r0 = move-exception;
            throw r0;
        L_0x0052:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0054 }
        L_0x0054:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.LayoutManager.onInitializeAccessibilityNodeInfo(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat):void");
        }

        static boolean access$2402(LayoutManager layoutManager, boolean z) {
            layoutManager.mRequestedSimpleAnimations = z;
            return z;
        }

        public void onMeasure(Recycler recycler, State state, int i, int i2) {
            RecyclerView.access$5300(this.mRecyclerView, i, i2);
        }

        public LayoutManager() {
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        }

        public View onInterceptFocusSearch(View view, int i) {
            return null;
        }

        static boolean access$2400(LayoutManager layoutManager) {
            return layoutManager.mRequestedSimpleAnimations;
        }

        public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            try {
                if (layoutParams instanceof LayoutParams) {
                    return new LayoutParams((LayoutParams) layoutParams);
                }
                try {
                    return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void detachAndScrapAttachedViews(Recycler recycler) {
            int i = ViewHolder.a;
            int childCount = getChildCount() - 1;
            while (childCount >= 0) {
                scrapOrRecycleView(recycler, childCount, getChildAt(childCount));
                childCount--;
                if (i != 0) {
                    return;
                }
            }
        }

        public int getHeight() {
            try {
                return this.mRecyclerView != null ? this.mRecyclerView.getHeight() : 0;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            view.measure(getChildMeasureSpec(getWidth(), ((itemDecorInsetsForChild.left + itemDecorInsetsForChild.right) + i) + (((getPaddingLeft() + getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin), layoutParams.width, canScrollHorizontally()), getChildMeasureSpec(getHeight(), ((itemDecorInsetsForChild.bottom + itemDecorInsetsForChild.top) + i2) + (((getPaddingTop() + getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin), layoutParams.height, canScrollVertically()));
        }

        public void removeAndRecycleView(View view, Recycler recycler) {
            removeView(view);
            recycler.recycleView(view);
        }

        public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
            int i4 = 1073741824;
            int i5 = 0;
            int i6 = ViewHolder.a;
            int max = Math.max(0, i - i2);
            if (z) {
                if (i3 < 0 || i6 != 0) {
                    if (i6 == 0) {
                        i4 = 0;
                        i3 = 0;
                    }
                }
                return MeasureSpec.makeMeasureSpec(i3, i4);
            }
            if (i3 >= 0) {
                if (i6 != 0) {
                    i5 = 1073741824;
                    int i7 = i3;
                }
                return MeasureSpec.makeMeasureSpec(i3, i4);
            }
            i7 = 0;
            if (i3 != -1) {
                i4 = i5;
                i5 = i7;
            } else if (i6 != 0) {
                i5 = max;
            } else {
                i3 = max;
                return MeasureSpec.makeMeasureSpec(i3, i4);
            }
            if (i3 == -2) {
                i4 = Integer.MIN_VALUE;
                i3 = max;
            } else {
                i3 = i5;
            }
            return MeasureSpec.makeMeasureSpec(i3, i4);
        }

        public int getBaseline() {
            return -1;
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                try {
                    throw new IllegalArgumentException(z[0] + i);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            detachViewAt(i);
            attachView(childAt, i2);
        }

        public int computeHorizontalScrollExtent(State state) {
            return 0;
        }

        public int getLeftDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.left;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getPaddingRight() {
            try {
                return this.mRecyclerView != null ? this.mRecyclerView.getPaddingRight() : 0;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public View getFocusedChild() {
            try {
                if (this.mRecyclerView == null) {
                    return null;
                }
                View focusedChild = this.mRecyclerView.getFocusedChild();
                if (focusedChild == null) {
                    return null;
                }
                try {
                    if (this.mChildHelper.isHidden(focusedChild)) {
                        return null;
                    }
                    return focusedChild;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }

        public boolean canScrollVertically() {
            return false;
        }

        public int getRowCountForAccessibility(Recycler recycler, State state) {
            int i = 1;
            try {
                if (this.mRecyclerView != null) {
                    if (RecyclerView.access$2900(this.mRecyclerView) != null) {
                        try {
                            if (canScrollVertically()) {
                                i = RecyclerView.access$2900(this.mRecyclerView).getItemCount();
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                }
                return i;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }

        public int getPosition(View view) {
            return ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int computeVerticalScrollOffset(State state) {
            return 0;
        }

        private void detachViewInternal(int i, View view) {
            this.mChildHelper.detachViewFromParent(i);
        }

        public void onScrollStateChanged(int i) {
        }

        public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            view.layout(rect.left + i, rect.top + i2, i3 - rect.right, i4 - rect.bottom);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, State state, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public int getTopDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.top;
        }

        public void assertNotInLayoutOrScroll(String str) {
            try {
                if (this.mRecyclerView != null) {
                    this.mRecyclerView.assertNotInLayoutOrScroll(str);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            onInitializeAccessibilityEvent(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityEvent);
        }

        public int getPaddingTop() {
            try {
                return this.mRecyclerView != null ? this.mRecyclerView.getPaddingTop() : 0;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public boolean performAccessibilityActionForItem(Recycler recycler, State state, View view, int i, Bundle bundle) {
            return false;
        }

        static void access$5800(LayoutManager layoutManager, SmoothScroller smoothScroller) {
            layoutManager.onSmoothScrollerStopped(smoothScroller);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return rect.bottom + (view.getMeasuredHeight() + rect.top);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void removeAndRecycleScrapInt(android.support.v7.widget.RecyclerView.Recycler r8) {
            /*
            r7 = this;
            r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            r2 = r8.getScrapCount();
            r0 = r2 + -1;
        L_0x0008:
            if (r0 < 0) goto L_0x0042;
        L_0x000a:
            r3 = r8.getScrapViewAt(r0);
            r4 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(r3);
            r5 = r4.shouldIgnore();	 Catch:{ IllegalStateException -> 0x004d }
            if (r5 == 0) goto L_0x001a;
        L_0x0018:
            if (r1 == 0) goto L_0x003e;
        L_0x001a:
            r5 = 0;
            r4.setIsRecyclable(r5);	 Catch:{ IllegalStateException -> 0x0051 }
            r5 = r4.isTmpDetached();	 Catch:{ IllegalStateException -> 0x0051 }
            if (r5 == 0) goto L_0x002a;
        L_0x0024:
            r5 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0051 }
            r6 = 0;
            r5.removeDetachedView(r3, r6);	 Catch:{ IllegalStateException -> 0x0051 }
        L_0x002a:
            r5 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0053 }
            r5 = r5.mItemAnimator;	 Catch:{ IllegalStateException -> 0x0053 }
            if (r5 == 0) goto L_0x0037;
        L_0x0030:
            r5 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0053 }
            r5 = r5.mItemAnimator;	 Catch:{ IllegalStateException -> 0x0053 }
            r5.endAnimation(r4);	 Catch:{ IllegalStateException -> 0x0053 }
        L_0x0037:
            r5 = 1;
            r4.setIsRecyclable(r5);
            r8.quickRecycleScrapView(r3);
        L_0x003e:
            r0 = r0 + -1;
            if (r1 == 0) goto L_0x0008;
        L_0x0042:
            r8.clearScrap();	 Catch:{ IllegalStateException -> 0x0055 }
            if (r2 <= 0) goto L_0x004c;
        L_0x0047:
            r0 = r7.mRecyclerView;	 Catch:{ IllegalStateException -> 0x0055 }
            r0.invalidate();	 Catch:{ IllegalStateException -> 0x0055 }
        L_0x004c:
            return;
        L_0x004d:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x004f }
        L_0x004f:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0051 }
        L_0x0051:
            r0 = move-exception;
            throw r0;
        L_0x0053:
            r0 = move-exception;
            throw r0;
        L_0x0055:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.LayoutManager.removeAndRecycleScrapInt(android.support.v7.widget.RecyclerView$Recycler):void");
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                try {
                    this.mRecyclerView = null;
                    this.mChildHelper = null;
                    if (ViewHolder.a == 0) {
                        return;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.mChildHelper;
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void offsetChildrenVertical(int i) {
            try {
                if (this.mRecyclerView != null) {
                    this.mRecyclerView.offsetChildrenVertical(i);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public void onInitializeAccessibilityNodeInfoForItem(Recycler recycler, State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            try {
                int position = canScrollVertically() ? getPosition(view) : 0;
                try {
                    int position2;
                    if (canScrollHorizontally()) {
                        position2 = getPosition(view);
                    } else {
                        position2 = 0;
                    }
                    accessibilityNodeInfoCompat.setCollectionItemInfo(CollectionItemInfoCompat.obtain(position, 1, position2, 1, false, false));
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }

        public void requestLayout() {
            try {
                if (this.mRecyclerView != null) {
                    this.mRecyclerView.requestLayout();
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public void offsetChildrenHorizontal(int i) {
            try {
                if (this.mRecyclerView != null) {
                    this.mRecyclerView.offsetChildrenHorizontal(i);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public void removeAndRecycleViewAt(int i, Recycler recycler) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            recycler.recycleView(childAt);
        }

        public int getColumnCountForAccessibility(Recycler recycler, State state) {
            int i = 1;
            try {
                if (this.mRecyclerView != null) {
                    if (RecyclerView.access$2900(this.mRecyclerView) != null) {
                        try {
                            if (canScrollHorizontally()) {
                                i = RecyclerView.access$2900(this.mRecyclerView).getItemCount();
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                }
                return i;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }

        public int getPaddingLeft() {
            try {
                return this.mRecyclerView != null ? this.mRecyclerView.getPaddingLeft() : 0;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public int getSelectionModeForAccessibility(Recycler recycler, State state) {
            return 0;
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void attachView(View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        public int scrollVerticallyBy(int i, Recycler recycler, State state) {
            return 0;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            try {
                if (!isSmoothScrolling()) {
                    if (!recyclerView.isComputingLayout()) {
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

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                try {
                    this.mChildHelper.removeViewAt(i);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public int getRightDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.right;
        }

        public View getChildAt(int i) {
            try {
                return this.mChildHelper != null ? this.mChildHelper.getChildAt(i) : null;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public int computeHorizontalScrollOffset(State state) {
            return 0;
        }

        public int getWidth() {
            try {
                return this.mRecyclerView != null ? this.mRecyclerView.getWidth() : 0;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public void onLayoutChildren(Recycler recycler, State state) {
            Log.e(z[1], z[2]);
        }

        void stopSmoothScroller() {
            try {
                if (this.mSmoothScroller != null) {
                    this.mSmoothScroller.stop();
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean requestChildRectangleOnScreen(android.support.v7.widget.RecyclerView r15, android.view.View r16, android.graphics.Rect r17, boolean r18) {
            /*
            r14 = this;
            r5 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            r6 = r14.getPaddingLeft();
            r7 = r14.getPaddingTop();
            r1 = r14.getWidth();
            r2 = r14.getPaddingRight();
            r1 = r1 - r2;
            r2 = r14.getHeight();
            r3 = r14.getPaddingBottom();
            r8 = r2 - r3;
            r2 = r16.getLeft();
            r0 = r17;
            r3 = r0.left;
            r9 = r2 + r3;
            r2 = r16.getTop();
            r0 = r17;
            r3 = r0.top;
            r10 = r2 + r3;
            r2 = r17.width();
            r11 = r9 + r2;
            r2 = r17.height();
            r12 = r10 + r2;
            r2 = 0;
            r3 = r9 - r6;
            r3 = java.lang.Math.min(r2, r3);
            r2 = 0;
            r4 = r10 - r7;
            r4 = java.lang.Math.min(r2, r4);
            r2 = 0;
            r13 = r11 - r1;
            r2 = java.lang.Math.max(r2, r13);
            r13 = 0;
            r8 = r12 - r8;
            r8 = java.lang.Math.max(r13, r8);
            r12 = r14.getLayoutDirection();	 Catch:{ IllegalStateException -> 0x007c }
            r13 = 1;
            if (r12 != r13) goto L_0x0065;
        L_0x0060:
            if (r2 == 0) goto L_0x0080;
        L_0x0062:
            r1 = r2;
        L_0x0063:
            if (r5 == 0) goto L_0x00a3;
        L_0x0065:
            if (r3 == 0) goto L_0x0087;
        L_0x0067:
            r1 = r3;
        L_0x0068:
            r2 = r1;
        L_0x0069:
            if (r4 == 0) goto L_0x008e;
        L_0x006b:
            r1 = r4;
        L_0x006c:
            if (r2 != 0) goto L_0x0070;
        L_0x006e:
            if (r1 == 0) goto L_0x0097;
        L_0x0070:
            if (r18 == 0) goto L_0x0077;
        L_0x0072:
            r15.scrollBy(r2, r1);	 Catch:{ IllegalStateException -> 0x0095 }
            if (r5 == 0) goto L_0x007a;
        L_0x0077:
            r15.smoothScrollBy(r2, r1);	 Catch:{ IllegalStateException -> 0x0095 }
        L_0x007a:
            r1 = 1;
        L_0x007b:
            return r1;
        L_0x007c:
            r1 = move-exception;
            throw r1;	 Catch:{ IllegalStateException -> 0x007e }
        L_0x007e:
            r1 = move-exception;
            throw r1;
        L_0x0080:
            r1 = r11 - r1;
            r1 = java.lang.Math.max(r3, r1);
            goto L_0x0063;
        L_0x0087:
            r1 = r9 - r6;
            r1 = java.lang.Math.min(r1, r2);
            goto L_0x0068;
        L_0x008e:
            r1 = r10 - r7;
            r1 = java.lang.Math.min(r1, r8);
            goto L_0x006c;
        L_0x0095:
            r1 = move-exception;
            throw r1;
        L_0x0097:
            r1 = 0;
            r2 = android.support.v7.widget.RecyclerView.a;	 Catch:{ IllegalStateException -> 0x00a1 }
            if (r2 == 0) goto L_0x007b;
        L_0x009c:
            r2 = r5 + 1;
            android.support.v7.widget.RecyclerView.ViewHolder.a = r2;	 Catch:{ IllegalStateException -> 0x00a1 }
            goto L_0x007b;
        L_0x00a1:
            r1 = move-exception;
            throw r1;
        L_0x00a3:
            r2 = r1;
            goto L_0x0069;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.LayoutManager.requestChildRectangleOnScreen(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean):boolean");
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        }

        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            onDetachedFromWindow(recyclerView);
        }
    }

    class 1 implements Runnable {
        final RecyclerView this$0;

        public void run() {
            if (RecyclerView.access$100(this.this$0) && !this.this$0.isLayoutRequested()) {
                if (RecyclerView.access$200(this.this$0)) {
                    RecyclerView.access$302(this.this$0, true);
                } else {
                    RecyclerView.access$400(this.this$0);
                }
            }
        }

        1(RecyclerView recyclerView) {
            this.this$0 = recyclerView;
        }
    }

    class 2 implements Runnable {
        final RecyclerView this$0;

        public void run() {
            if (this.this$0.mItemAnimator != null) {
                this.this$0.mItemAnimator.runPendingAnimations();
            }
            RecyclerView.access$602(this.this$0, false);
        }

        2(RecyclerView recyclerView) {
            this.this$0 = recyclerView;
        }
    }

    final class 3 implements Interpolator {
        3() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    }

    class 4 implements ProcessCallback {
        final RecyclerView this$0;

        public void processAppeared(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2) {
            RecyclerView.access$800(this.this$0, viewHolder, itemHolderInfo, itemHolderInfo2);
        }

        public void processPersistent(ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
            viewHolder.setIsRecyclable(false);
            if (RecyclerView.access$900(this.this$0)) {
                if (this.this$0.mItemAnimator.animateChange(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    RecyclerView.access$1000(this.this$0);
                    if (ViewHolder.a == 0) {
                        return;
                    }
                }
                return;
            }
            if (this.this$0.mItemAnimator.animatePersistence(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                RecyclerView.access$1000(this.this$0);
            }
        }

        public void processDisappeared(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2) {
            this.this$0.mRecycler.unscrapView(viewHolder);
            RecyclerView.access$700(this.this$0, viewHolder, itemHolderInfo, itemHolderInfo2);
        }

        public void unused(ViewHolder viewHolder) {
            RecyclerView.access$1100(this.this$0).removeAndRecycleView(viewHolder.itemView, this.this$0.mRecycler);
        }

        4(RecyclerView recyclerView) {
            this.this$0 = recyclerView;
        }
    }

    class 5 implements Callback {
        private static final String[] z;
        final RecyclerView this$0;

        static {
            String[] strArr = new String[2];
            String str = ":p:[g\u001d17Cv\u0018r>\u0017m\u001717\u0017a\u0011x:S\"\u000ey?TjYx%\u0017l\u0016evSg\rp5_g\u001d+v";
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
                            i3 = 17;
                            break;
                        case at.i /*2*/:
                            i3 = 86;
                            break;
                        case at.o /*3*/:
                            i3 = 55;
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "\u001ap:[g\u001d12Rv\u0018r>\u0017m\u001717Y\"\u0018}$Rc\u001dhvSg\rp5_g\u001d15_k\u0015uv";
                        obj = null;
                }
            }
        }

        public void onLeftHiddenState(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                try {
                    ViewHolder.access$1700(childViewHolderInt);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }

        public void addView(View view, int i) {
            this.this$0.addView(view, i);
            RecyclerView.access$1200(this.this$0, view);
        }

        public View getChildAt(int i) {
            return this.this$0.getChildAt(i);
        }

        public ViewHolder getChildViewHolder(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        5(RecyclerView recyclerView) {
            this.this$0 = recyclerView;
        }

        public void onEnteredHiddenState(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                try {
                    ViewHolder.access$1600(childViewHolderInt);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }

        public int getChildCount() {
            return this.this$0.getChildCount();
        }

        public void detachViewFromParent(int i) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null) {
                    try {
                        if (childViewHolderInt.isTmpDetached()) {
                            if (!childViewHolderInt.shouldIgnore()) {
                                throw new IllegalArgumentException(z[1] + childViewHolderInt);
                            }
                        }
                        childViewHolderInt.addFlags(256);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
            RecyclerView.access$1500(this.this$0, i);
        }

        public int indexOfChild(View view) {
            return this.this$0.indexOfChild(view);
        }

        public void removeViewAt(int i) {
            View childAt = this.this$0.getChildAt(i);
            if (childAt != null) {
                try {
                    RecyclerView.access$1300(this.this$0, childAt);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            this.this$0.removeViewAt(i);
        }

        public void removeAllViews() {
            int i = ViewHolder.a;
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                RecyclerView.access$1300(this.this$0, getChildAt(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
            this.this$0.removeAllViews();
        }

        public void attachViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                try {
                    if (!childViewHolderInt.isTmpDetached()) {
                        if (!childViewHolderInt.shouldIgnore()) {
                            throw new IllegalArgumentException(z[0] + childViewHolderInt);
                        }
                    }
                    childViewHolderInt.clearTmpDetachFlag();
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            RecyclerView.access$1400(this.this$0, view, i, layoutParams);
        }
    }

    class 6 implements Callback {
        final RecyclerView this$0;

        public ViewHolder findViewHolder(int i) {
            ViewHolder findViewHolderForPosition = this.this$0.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition == null || this.this$0.mChildHelper.isHidden(findViewHolderForPosition.itemView)) {
                return null;
            }
            return findViewHolderForPosition;
        }

        public void offsetPositionsForAdd(int i, int i2) {
            this.this$0.offsetPositionRecordsForInsert(i, i2);
            this.this$0.mItemsAddedOrRemoved = true;
        }

        public void onDispatchSecondPass(UpdateOp updateOp) {
            dispatchUpdate(updateOp);
        }

        6(RecyclerView recyclerView) {
            this.this$0 = recyclerView;
        }

        public void offsetPositionsForRemovingInvisible(int i, int i2) {
            this.this$0.offsetPositionRecordsForRemove(i, i2, true);
            this.this$0.mItemsAddedOrRemoved = true;
            State.access$1812(this.this$0.mState, i2);
        }

        public void markViewHoldersUpdated(int i, int i2, Object obj) {
            this.this$0.viewRangeUpdate(i, i2, obj);
            this.this$0.mItemsChanged = true;
        }

        public void offsetPositionsForMove(int i, int i2) {
            this.this$0.offsetPositionRecordsForMove(i, i2);
            this.this$0.mItemsAddedOrRemoved = true;
        }

        public void offsetPositionsForRemovingLaidOutOrNewView(int i, int i2) {
            this.this$0.offsetPositionRecordsForRemove(i, i2, false);
            this.this$0.mItemsAddedOrRemoved = true;
        }

        public void onDispatchFirstPass(UpdateOp updateOp) {
            dispatchUpdate(updateOp);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void dispatchUpdate(android.support.v7.widget.AdapterHelper.UpdateOp r7) {
            /*
            r6 = this;
            r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            r1 = r7.cmd;
            switch(r1) {
                case 1: goto L_0x0008;
                case 2: goto L_0x0019;
                case 3: goto L_0x0007;
                case 4: goto L_0x002a;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x0007;
                case 8: goto L_0x003d;
                default: goto L_0x0007;
            };
        L_0x0007:
            return;
        L_0x0008:
            r1 = r6.this$0;
            r1 = android.support.v7.widget.RecyclerView.access$1100(r1);
            r2 = r6.this$0;
            r3 = r7.positionStart;
            r4 = r7.itemCount;
            r1.onItemsAdded(r2, r3, r4);
            if (r0 == 0) goto L_0x0007;
        L_0x0019:
            r1 = r6.this$0;
            r1 = android.support.v7.widget.RecyclerView.access$1100(r1);
            r2 = r6.this$0;
            r3 = r7.positionStart;
            r4 = r7.itemCount;
            r1.onItemsRemoved(r2, r3, r4);
            if (r0 == 0) goto L_0x0007;
        L_0x002a:
            r1 = r6.this$0;
            r1 = android.support.v7.widget.RecyclerView.access$1100(r1);
            r2 = r6.this$0;
            r3 = r7.positionStart;
            r4 = r7.itemCount;
            r5 = r7.payload;
            r1.onItemsUpdated(r2, r3, r4, r5);
            if (r0 == 0) goto L_0x0007;
        L_0x003d:
            r0 = r6.this$0;
            r0 = android.support.v7.widget.RecyclerView.access$1100(r0);
            r1 = r6.this$0;
            r2 = r7.positionStart;
            r3 = r7.itemCount;
            r4 = 1;
            r0.onItemsMoved(r1, r2, r3, r4);
            goto L_0x0007;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.6.dispatchUpdate(android.support.v7.widget.AdapterHelper$UpdateOp):void");
        }
    }

    class AdapterDataObservable extends Observable {
        AdapterDataObservable() {
        }

        public void notifyChanged() {
            int i = ViewHolder.a;
            int size = this.mObservers.size() - 1;
            while (size >= 0) {
                ((AdapterDataObserver) this.mObservers.get(size)).onChanged();
                int i2 = size - 1;
                if (i == 0) {
                    size = i2;
                } else {
                    return;
                }
            }
        }
    }

    public abstract class AdapterDataObserver {
        public void onChanged() {
        }
    }

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i, int i2);
    }

    class ItemAnimatorRestoreListener implements ItemAnimatorListener {
        final RecyclerView this$0;

        ItemAnimatorRestoreListener(RecyclerView recyclerView, 1 1) {
            this(recyclerView);
        }

        public void onAnimationFinished(ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (!ViewHolder.access$6100(viewHolder) && !RecyclerView.access$6200(this.this$0, viewHolder.itemView) && viewHolder.isTmpDetached()) {
                this.this$0.removeDetachedView(viewHolder.itemView, false);
            }
        }

        private ItemAnimatorRestoreListener(RecyclerView recyclerView) {
            this.this$0 = recyclerView;
        }
    }

    public abstract class ItemDecoration {
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
            onDrawOver(canvas, recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
            onDraw(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }

        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    public class LayoutParams extends MarginLayoutParams {
        final Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        ViewHolder mViewHolder;

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(View view);

        void onChildViewDetachedFromWindow(View view);
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public abstract class OnScrollListener {
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }
    }

    public class RecycledViewPool {
        private int mAttachCount;
        private SparseIntArray mMaxScrap;
        private SparseArray mScrap;

        private ArrayList getScrapHeapForType(int i) {
            ArrayList arrayList = (ArrayList) this.mScrap.get(i);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.mScrap.put(i, arrayList);
                if (this.mMaxScrap.indexOfKey(i) < 0) {
                    this.mMaxScrap.put(i, 5);
                }
            }
            return arrayList;
        }

        void detach() {
            this.mAttachCount--;
        }

        void onAdapterChanged(Adapter adapter, Adapter adapter2, boolean z) {
            if (adapter != null) {
                detach();
            }
            if (!z && this.mAttachCount == 0) {
                clear();
            }
            if (adapter2 != null) {
                attach(adapter2);
            }
        }

        public RecycledViewPool() {
            this.mScrap = new SparseArray();
            this.mMaxScrap = new SparseIntArray();
            this.mAttachCount = 0;
        }

        void attach(Adapter adapter) {
            this.mAttachCount++;
        }

        public void putRecycledView(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList scrapHeapForType = getScrapHeapForType(itemViewType);
            if (this.mMaxScrap.get(itemViewType) > scrapHeapForType.size()) {
                viewHolder.resetInternal();
                scrapHeapForType.add(viewHolder);
            }
        }

        public ViewHolder getRecycledView(int i) {
            ArrayList arrayList = (ArrayList) this.mScrap.get(i);
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            int size = arrayList.size() - 1;
            ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
            arrayList.remove(size);
            return viewHolder;
        }

        public void clear() {
            this.mScrap.clear();
        }
    }

    public final class Recycler {
        private static final String[] z;
        final ArrayList mAttachedScrap;
        final ArrayList mCachedViews;
        private ArrayList mChangedScrap;
        private RecycledViewPool mRecyclerPool;
        private final List mUnmodifiableAttachedScrap;
        private ViewCacheExtension mViewCacheExtension;
        private int mViewCacheMax;
        final RecyclerView this$0;

        static {
            String[] strArr = new String[20];
            String str = "\u0010\u001b\u001d6^7Z\u00029I2\nQ,R6\rQ-R'\u0012Q;Us\u0013\u001f,Z?\u0013\u0015zM:\u001f\u0006t\u001b\u001a\u0014\u0007;W:\u001eQ,R6\r\u0002zX2\u0014\u001f5Os\u0018\u0014zI6\u000f\u0002?_s\u001c\u00035Vs\t\u0012(Z#VQ.S6\u0003Q)S<\u000f\u001d>\u001b!\u001f\u00135N=\u001eQ<I<\u0017Q(^0\u0003\u00126^!Z\u00015T?T";
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
                            i3 = 83;
                            break;
                        case at.g /*1*/:
                            i3 = 122;
                            break;
                        case at.i /*2*/:
                            i3 = 113;
                            break;
                        case at.o /*3*/:
                            i3 = 90;
                            break;
                        default:
                            i3 = 59;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "s\u0018\u0004.\u001b6\u0002\u0001?X'\u001f\u0015z";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\u0001\u001f\u0012#X?\u001f\u0003\fR6\r";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "s\u0013\u00024\u001c'Z\u00153I'\u0003Q8N'Z\u0019;H";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "s\r\u00035U4Z\u00073^$Z\u0005#K6[Qr]<\u000f\u001f>\u001b";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\u0000\u0019\u0003;Ks\f\u0018?Ls\u001c\u001e(\u001b#\u0015\u00023O:\u0015\u001fz";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "?\u001b\b5N'Z\u00184_6\u0002Q)S<\u000f\u001d>\u001b=\u0015\u0005zY6Z\\k\u001b2\u001c\u0005?Is\u000f\u001f2R7\u0013\u001f=\u001b2Z\u00073^$@";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "\u0007\u0017\u0001z_6\u000e\u00109S6\u001eQ,R6\rQ)S<\u000f\u001d>\u001b1\u001fQ(^>\u0015\u0007?_s\u001c\u00035Vs(\u00149B0\u0016\u0014(m:\u001f\u0006zY6\u001c\u001e(^s\u0013\u0005zX2\u0014Q8^s\b\u00149B0\u0016\u0014>\u0001s";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "\u0000\u0019\u0003;K#\u001f\u0015zT!Z\u0010.O2\u0019\u0019?_s\f\u0018?L Z\u001c;Bs\u0014\u001e.\u001b1\u001fQ(^0\u0003\u00126^7TQ3H\u0000\u0019\u0003;Ki";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\u0007\b\b3U4Z\u00055\u001b!\u001f\u0012#X?\u001fQ;Us\u0013\u00164T!\u001f\u0015zM:\u001f\u0006zS<\u0016\u0015?I}Z(5Ns\t\u00195N?\u001eQ<R!\t\u0005zX2\u0016\u001dzH'\u0015\u0001\u0013\\=\u0015\u00033U4,\u0018?L{\f\u0018?LzZ\u0013?]<\b\u0014zX2\u0016\u001d3U4Z\u0003?X*\u0019\u001d?\u0015";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "s\u0013\u0002\u001bO'\u001b\u00122^7@";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "{\u0015\u0017<H6\u000eK";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "zT";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "\u001a\u0014\u0007;W:\u001eQ3O6\u0017Q*T \u0013\u00053T=Z";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = " \u000e\u0010.^i";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "4\u001f\u0005\fR6\r75I\u0003\u0015\u00023O:\u0015\u001f\u001bU7.\b*^s\b\u0014.N!\u0014\u0014>\u001b2Z\u00073^$Z\u00052Z'Z\u0018)\u001b:\u001d\u001f5I6\u001e_zb<\u000fQ7N \u000eQ9Z?\u0016Q)O<\n8=U<\b\u00184\\s\u0018\u0014<T!\u001fQ(^'\u000f\u00034R=\u001dQ.S:\tQ,R6\r_";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "\u001a\u0014\u00125U \u0013\u0002.^=\u0019\bz_6\u000e\u00149O6\u001e_zr=\f\u00106R7Z\u0018.^>Z\u00015H:\u000e\u00185Us";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "zTQ\u0013O6\u0017Q9T&\u0014\u0005`";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "4\u001f\u0005\fR6\r75I\u0003\u0015\u00023O:\u0015\u001f\u001bU7.\b*^s\b\u0014.N!\u0014\u0014>\u001b2Z\u00073^$Z\u00062R0\u0012Q>T6\tQ4T'Z\u0019;M6Z\u0010zm:\u001f\u0006\u0012T?\u001e\u0014(";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u001a\u0014\u00125U \u0013\u0002.^=\u0019\bz_6\u000e\u00149O6\u001e_zr=\f\u00106R7Z\u00073^$Z\u00195W7\u001f\u0003zZ7\u001b\u0001.^!Z\u00015H:\u000e\u00185U";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        View getScrapViewAt(int i) {
            return ((ViewHolder) this.mAttachedScrap.get(i)).itemView;
        }

        void recycleViewHolderInternal(ViewHolder viewHolder) {
            boolean z = true;
            boolean z2 = false;
            try {
                if (!viewHolder.isScrap()) {
                    if (viewHolder.itemView.getParent() == null) {
                        try {
                            if (viewHolder.isTmpDetached()) {
                                throw new IllegalArgumentException(z[8] + viewHolder);
                            }
                            try {
                                if (viewHolder.shouldIgnore()) {
                                    throw new IllegalArgumentException(z[10]);
                                }
                                boolean access$4700 = ViewHolder.access$4700(viewHolder);
                                try {
                                    boolean z3;
                                    int size;
                                    if (RecyclerView.access$2900(this.this$0) != null && access$4700) {
                                        try {
                                            if (RecyclerView.access$2900(this.this$0).onFailedToRecycleView(viewHolder)) {
                                                z3 = true;
                                                if (!z3) {
                                                    try {
                                                        if (!viewHolder.isRecyclable()) {
                                                            z = false;
                                                            this.this$0.mViewInfoStore.removeViewHolder(viewHolder);
                                                            if (!z && !r1 && access$4700) {
                                                                try {
                                                                    viewHolder.mOwnerRecyclerView = null;
                                                                    return;
                                                                } catch (IndexOutOfBoundsException e) {
                                                                    throw e;
                                                                }
                                                            }
                                                            return;
                                                        }
                                                    } catch (IndexOutOfBoundsException e2) {
                                                        throw e2;
                                                    }
                                                }
                                                if (!viewHolder.hasAnyOfTheFlags(14)) {
                                                    size = this.mCachedViews.size();
                                                    try {
                                                        if (size == this.mViewCacheMax && size > 0) {
                                                            recycleCachedViewAt(0);
                                                        }
                                                        if (size < this.mViewCacheMax) {
                                                            this.mCachedViews.add(viewHolder);
                                                            z3 = true;
                                                            if (z3) {
                                                                addViewHolderToRecycledViewPool(viewHolder);
                                                                z2 = true;
                                                                z = z3;
                                                            } else {
                                                                z = z3;
                                                            }
                                                            this.this$0.mViewInfoStore.removeViewHolder(viewHolder);
                                                            if (!z) {
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    } catch (IndexOutOfBoundsException e22) {
                                                        throw e22;
                                                    } catch (IndexOutOfBoundsException e222) {
                                                        throw e222;
                                                    }
                                                }
                                                z3 = false;
                                                if (z3) {
                                                    z = z3;
                                                } else {
                                                    addViewHolderToRecycledViewPool(viewHolder);
                                                    z2 = true;
                                                    z = z3;
                                                }
                                                this.this$0.mViewInfoStore.removeViewHolder(viewHolder);
                                                if (!z) {
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (IndexOutOfBoundsException e2222) {
                                            throw e2222;
                                        }
                                    }
                                    z3 = false;
                                    if (z3) {
                                        if (viewHolder.isRecyclable()) {
                                            z = false;
                                            this.this$0.mViewInfoStore.removeViewHolder(viewHolder);
                                            if (!z) {
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (viewHolder.hasAnyOfTheFlags(14)) {
                                        size = this.mCachedViews.size();
                                        recycleCachedViewAt(0);
                                        if (size < this.mViewCacheMax) {
                                            this.mCachedViews.add(viewHolder);
                                            z3 = true;
                                            if (z3) {
                                                addViewHolderToRecycledViewPool(viewHolder);
                                                z2 = true;
                                                z = z3;
                                            } else {
                                                z = z3;
                                            }
                                            this.this$0.mViewInfoStore.removeViewHolder(viewHolder);
                                            if (!z) {
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    z3 = false;
                                    if (z3) {
                                        z = z3;
                                    } else {
                                        addViewHolderToRecycledViewPool(viewHolder);
                                        z2 = true;
                                        z = z3;
                                    }
                                    try {
                                        this.this$0.mViewInfoStore.removeViewHolder(viewHolder);
                                        if (!z) {
                                            return;
                                        }
                                        return;
                                    } catch (IndexOutOfBoundsException e22222) {
                                        throw e22222;
                                    } catch (IndexOutOfBoundsException e222222) {
                                        throw e222222;
                                    }
                                } catch (IndexOutOfBoundsException e2222222) {
                                    throw e2222222;
                                } catch (IndexOutOfBoundsException e22222222) {
                                    throw e22222222;
                                }
                            } catch (IndexOutOfBoundsException e222222222) {
                                throw e222222222;
                            }
                        } catch (IndexOutOfBoundsException e2222222222) {
                            throw e2222222222;
                        }
                    }
                }
                try {
                    StringBuilder append = new StringBuilder().append(z[9]).append(viewHolder.isScrap()).append(z[11]);
                    if (viewHolder.itemView.getParent() == null) {
                        z = false;
                    }
                    throw new IllegalArgumentException(append.append(z).toString());
                } catch (IndexOutOfBoundsException e22222222222) {
                    throw e22222222222;
                }
            } catch (IndexOutOfBoundsException e222222222222) {
                throw e222222222222;
            } catch (IndexOutOfBoundsException e2222222222222) {
                throw e2222222222222;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        android.view.View getViewForPosition(int r12, boolean r13) {
            /*
            r11 = this;
            r1 = 0;
            r2 = 1;
            r3 = 0;
            r7 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            if (r12 < 0) goto L_0x0011;
        L_0x0007:
            r0 = r11.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r0 = r0.mState;	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r0 = r0.getItemCount();	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            if (r12 < r0) goto L_0x0051;
        L_0x0011:
            r0 = new java.lang.IndexOutOfBoundsException;	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r1 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r1.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r2 = z;	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r3 = 14;
            r2 = r2[r3];	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r1 = r1.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r1 = r1.append(r12);	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r2 = "(";
            r1 = r1.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r1 = r1.append(r12);	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r2 = z;	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r3 = 18;
            r2 = r2[r3];	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r1 = r1.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r2 = r11.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r2 = r2.mState;	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r2 = r2.getItemCount();	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r1 = r1.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r1 = r1.toString();	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            r0.<init>(r1);	 Catch:{ IndexOutOfBoundsException -> 0x004f }
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x004f }
        L_0x004f:
            r0 = move-exception;
            throw r0;
        L_0x0051:
            r0 = r11.this$0;
            r0 = r0.mState;
            r0 = r0.isPreLayout();
            if (r0 == 0) goto L_0x0287;
        L_0x005b:
            r4 = r11.getChangedScrapViewForPosition(r12);
            if (r4 == 0) goto L_0x0100;
        L_0x0061:
            r0 = r2;
        L_0x0062:
            r10 = r4;
            r4 = r0;
            r0 = r10;
        L_0x0065:
            if (r0 != 0) goto L_0x0284;
        L_0x0067:
            r0 = -1;
            r0 = r11.getScrapViewForPosition(r12, r0, r13);
            if (r0 == 0) goto L_0x0284;
        L_0x006e:
            r5 = r11.validateViewHolderForOffsetPosition(r0);	 Catch:{ IndexOutOfBoundsException -> 0x0103 }
            if (r5 != 0) goto L_0x010d;
        L_0x0074:
            if (r13 != 0) goto L_0x0099;
        L_0x0076:
            r5 = 4;
            r0.addFlags(r5);	 Catch:{ IndexOutOfBoundsException -> 0x0107 }
            r5 = r0.isScrap();	 Catch:{ IndexOutOfBoundsException -> 0x0107 }
            if (r5 == 0) goto L_0x008d;
        L_0x0080:
            r5 = r11.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x0109 }
            r6 = r0.itemView;	 Catch:{ IndexOutOfBoundsException -> 0x0109 }
            r8 = 0;
            r5.removeDetachedView(r6, r8);	 Catch:{ IndexOutOfBoundsException -> 0x0109 }
            r0.unScrap();	 Catch:{ IndexOutOfBoundsException -> 0x0109 }
            if (r7 == 0) goto L_0x0096;
        L_0x008d:
            r5 = r0.wasReturnedFromScrap();	 Catch:{ IndexOutOfBoundsException -> 0x010b }
            if (r5 == 0) goto L_0x0096;
        L_0x0093:
            r0.clearReturnedFromScrapFlag();	 Catch:{ IndexOutOfBoundsException -> 0x010b }
        L_0x0096:
            r11.recycleViewHolderInternal(r0);
        L_0x0099:
            r0 = r1;
            r1 = r4;
        L_0x009b:
            if (r0 != 0) goto L_0x0280;
        L_0x009d:
            r4 = r11.this$0;
            r4 = r4.mAdapterHelper;
            r4 = r4.findPositionOffset(r12);
            if (r4 < 0) goto L_0x00b3;
        L_0x00a7:
            r5 = r11.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r5 = android.support.v7.widget.RecyclerView.access$2900(r5);	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r5 = r5.getItemCount();	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            if (r4 < r5) goto L_0x010f;
        L_0x00b3:
            r0 = new java.lang.IndexOutOfBoundsException;	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r1 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r1.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r2 = z;	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r3 = 17;
            r2 = r2[r3];	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r1 = r1.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r1 = r1.append(r12);	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r2 = z;	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r3 = 12;
            r2 = r2[r3];	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r1 = r1.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r1 = r1.append(r4);	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r2 = z;	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r3 = 13;
            r2 = r2[r3];	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r1 = r1.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r2 = z;	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r3 = 15;
            r2 = r2[r3];	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r1 = r1.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r2 = r11.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r2 = r2.mState;	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r2 = r2.getItemCount();	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r1 = r1.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r1 = r1.toString();	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            r0.<init>(r1);	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x00fe }
        L_0x00fe:
            r0 = move-exception;
            throw r0;
        L_0x0100:
            r0 = r3;
            goto L_0x0062;
        L_0x0103:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0105 }
        L_0x0105:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0107 }
        L_0x0107:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0109 }
        L_0x0109:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x010b }
        L_0x010b:
            r0 = move-exception;
            throw r0;
        L_0x010d:
            r1 = r2;
            goto L_0x009b;
        L_0x010f:
            r5 = r11.this$0;
            r5 = android.support.v7.widget.RecyclerView.access$2900(r5);
            r5 = r5.getItemViewType(r4);
            r6 = r11.this$0;
            r6 = android.support.v7.widget.RecyclerView.access$2900(r6);
            r6 = r6.hasStableIds();
            if (r6 == 0) goto L_0x0138;
        L_0x0125:
            r0 = r11.this$0;
            r0 = android.support.v7.widget.RecyclerView.access$2900(r0);
            r8 = r0.getItemId(r4);
            r0 = r11.getScrapViewForId(r8, r5, r13);
            if (r0 == 0) goto L_0x0138;
        L_0x0135:
            r0.mPosition = r4;
            r1 = r2;
        L_0x0138:
            if (r0 != 0) goto L_0x0172;
        L_0x013a:
            r4 = r11.mViewCacheExtension;	 Catch:{ IndexOutOfBoundsException -> 0x015c }
            if (r4 == 0) goto L_0x0172;
        L_0x013e:
            r4 = r11.mViewCacheExtension;
            r4 = r4.getViewForPositionAndType(r11, r12, r5);
            if (r4 == 0) goto L_0x0172;
        L_0x0146:
            r0 = r11.this$0;
            r0 = r0.getChildViewHolder(r4);
            if (r0 != 0) goto L_0x015e;
        L_0x014e:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IndexOutOfBoundsException -> 0x015a }
            r1 = z;	 Catch:{ IndexOutOfBoundsException -> 0x015a }
            r2 = 19;
            r1 = r1[r2];	 Catch:{ IndexOutOfBoundsException -> 0x015a }
            r0.<init>(r1);	 Catch:{ IndexOutOfBoundsException -> 0x015a }
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x015a }
        L_0x015a:
            r0 = move-exception;
            throw r0;
        L_0x015c:
            r0 = move-exception;
            throw r0;
        L_0x015e:
            r4 = r0.shouldIgnore();	 Catch:{ IndexOutOfBoundsException -> 0x0170 }
            if (r4 == 0) goto L_0x0172;
        L_0x0164:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IndexOutOfBoundsException -> 0x0170 }
            r1 = z;	 Catch:{ IndexOutOfBoundsException -> 0x0170 }
            r2 = 16;
            r1 = r1[r2];	 Catch:{ IndexOutOfBoundsException -> 0x0170 }
            r0.<init>(r1);	 Catch:{ IndexOutOfBoundsException -> 0x0170 }
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0170 }
        L_0x0170:
            r0 = move-exception;
            throw r0;
        L_0x0172:
            if (r0 != 0) goto L_0x018a;
        L_0x0174:
            r0 = r11.getRecycledViewPool();
            r0 = r0.getRecycledView(r5);
            if (r0 == 0) goto L_0x018a;
        L_0x017e:
            r0.resetInternal();	 Catch:{ IndexOutOfBoundsException -> 0x0262 }
            r4 = android.support.v7.widget.RecyclerView.access$4400();	 Catch:{ IndexOutOfBoundsException -> 0x0262 }
            if (r4 == 0) goto L_0x018a;
        L_0x0187:
            r11.invalidateDisplayListInt(r0);	 Catch:{ IndexOutOfBoundsException -> 0x0262 }
        L_0x018a:
            if (r0 != 0) goto L_0x0280;
        L_0x018c:
            r0 = r11.this$0;
            r0 = android.support.v7.widget.RecyclerView.access$2900(r0);
            r4 = r11.this$0;
            r0 = r0.createViewHolder(r4, r5);
            r5 = r0;
            r6 = r1;
        L_0x019a:
            if (r6 == 0) goto L_0x01d9;
        L_0x019c:
            r0 = r11.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x0264 }
            r0 = r0.mState;	 Catch:{ IndexOutOfBoundsException -> 0x0264 }
            r0 = r0.isPreLayout();	 Catch:{ IndexOutOfBoundsException -> 0x0264 }
            if (r0 != 0) goto L_0x01d9;
        L_0x01a6:
            r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            r0 = r5.hasAnyOfTheFlags(r0);	 Catch:{ IndexOutOfBoundsException -> 0x0266 }
            if (r0 == 0) goto L_0x01d9;
        L_0x01ae:
            r0 = 0;
            r1 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            r5.setFlags(r0, r1);	 Catch:{ IndexOutOfBoundsException -> 0x0266 }
            r0 = r11.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x0266 }
            r0 = r0.mState;	 Catch:{ IndexOutOfBoundsException -> 0x0266 }
            r0 = android.support.v7.widget.RecyclerView.State.access$2300(r0);	 Catch:{ IndexOutOfBoundsException -> 0x0266 }
            if (r0 == 0) goto L_0x01d9;
        L_0x01be:
            r0 = android.support.v7.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(r5);
            r0 = r0 | 4096;
            r1 = r11.this$0;
            r1 = r1.mItemAnimator;
            r4 = r11.this$0;
            r4 = r4.mState;
            r8 = r5.getUnmodifiedPayloads();
            r0 = r1.recordPreLayoutInformation(r4, r5, r0, r8);
            r1 = r11.this$0;
            android.support.v7.widget.RecyclerView.access$4500(r1, r5, r0);
        L_0x01d9:
            r0 = r11.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x0268 }
            r0 = r0.mState;	 Catch:{ IndexOutOfBoundsException -> 0x0268 }
            r0 = r0.isPreLayout();	 Catch:{ IndexOutOfBoundsException -> 0x0268 }
            if (r0 == 0) goto L_0x01ed;
        L_0x01e3:
            r0 = r5.isBound();	 Catch:{ IndexOutOfBoundsException -> 0x026a }
            if (r0 == 0) goto L_0x01ed;
        L_0x01e9:
            r5.mPreLayoutPosition = r12;	 Catch:{ IndexOutOfBoundsException -> 0x026c }
            if (r7 == 0) goto L_0x027e;
        L_0x01ed:
            r0 = r5.isBound();	 Catch:{ IndexOutOfBoundsException -> 0x026e }
            if (r0 == 0) goto L_0x01ff;
        L_0x01f3:
            r0 = r5.needsUpdate();	 Catch:{ IndexOutOfBoundsException -> 0x0270 }
            if (r0 != 0) goto L_0x01ff;
        L_0x01f9:
            r0 = r5.isInvalid();	 Catch:{ IndexOutOfBoundsException -> 0x0270 }
            if (r0 == 0) goto L_0x027e;
        L_0x01ff:
            r0 = r11.this$0;
            r0 = r0.mAdapterHelper;
            r0 = r0.findPositionOffset(r12);
            r1 = r11.this$0;
            r5.mOwnerRecyclerView = r1;
            r1 = r11.this$0;
            r1 = android.support.v7.widget.RecyclerView.access$2900(r1);
            r1.bindViewHolder(r5, r0);
            r0 = r5.itemView;
            r11.attachAccessibilityDelegate(r0);
            r0 = r11.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x0272 }
            r0 = r0.mState;	 Catch:{ IndexOutOfBoundsException -> 0x0272 }
            r0 = r0.isPreLayout();	 Catch:{ IndexOutOfBoundsException -> 0x0272 }
            if (r0 == 0) goto L_0x027c;
        L_0x0223:
            r5.mPreLayoutPosition = r12;	 Catch:{ IndexOutOfBoundsException -> 0x0272 }
            r4 = r2;
        L_0x0226:
            r0 = r5.itemView;
            r1 = r0.getLayoutParams();
            if (r1 != 0) goto L_0x023d;
        L_0x022e:
            r0 = r11.this$0;
            r0 = r0.generateDefaultLayoutParams();
            r0 = (android.support.v7.widget.RecyclerView.LayoutParams) r0;
            r8 = r5.itemView;	 Catch:{ IndexOutOfBoundsException -> 0x0274 }
            r8.setLayoutParams(r0);	 Catch:{ IndexOutOfBoundsException -> 0x0274 }
            if (r7 == 0) goto L_0x0257;
        L_0x023d:
            r0 = r11.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x0274 }
            r0 = r0.checkLayoutParams(r1);	 Catch:{ IndexOutOfBoundsException -> 0x0274 }
            if (r0 != 0) goto L_0x0254;
        L_0x0245:
            r0 = r11.this$0;
            r0 = r0.generateLayoutParams(r1);
            r0 = (android.support.v7.widget.RecyclerView.LayoutParams) r0;
            r8 = r5.itemView;
            r8.setLayoutParams(r0);
            if (r7 == 0) goto L_0x0257;
        L_0x0254:
            r0 = r1;
            r0 = (android.support.v7.widget.RecyclerView.LayoutParams) r0;
        L_0x0257:
            r0.mViewHolder = r5;	 Catch:{ IndexOutOfBoundsException -> 0x0276 }
            if (r6 == 0) goto L_0x027a;
        L_0x025b:
            if (r4 == 0) goto L_0x027a;
        L_0x025d:
            r0.mPendingInvalidate = r2;
            r0 = r5.itemView;
            return r0;
        L_0x0262:
            r0 = move-exception;
            throw r0;
        L_0x0264:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0266 }
        L_0x0266:
            r0 = move-exception;
            throw r0;
        L_0x0268:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x026a }
        L_0x026a:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x026c }
        L_0x026c:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x026e }
        L_0x026e:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0270 }
        L_0x0270:
            r0 = move-exception;
            throw r0;
        L_0x0272:
            r0 = move-exception;
            throw r0;
        L_0x0274:
            r0 = move-exception;
            throw r0;
        L_0x0276:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0278 }
        L_0x0278:
            r0 = move-exception;
            throw r0;
        L_0x027a:
            r2 = r3;
            goto L_0x025d;
        L_0x027c:
            r4 = r2;
            goto L_0x0226;
        L_0x027e:
            r4 = r3;
            goto L_0x0226;
        L_0x0280:
            r5 = r0;
            r6 = r1;
            goto L_0x019a;
        L_0x0284:
            r1 = r4;
            goto L_0x009b;
        L_0x0287:
            r0 = r1;
            r4 = r3;
            goto L_0x0065;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.Recycler.getViewForPosition(int, boolean):android.view.View");
        }

        void markItemDecorInsetsDirty() {
            int i = ViewHolder.a;
            int size = this.mCachedViews.size();
            int i2 = 0;
            while (i2 < size) {
                LayoutParams layoutParams = (LayoutParams) ((ViewHolder) this.mCachedViews.get(i2)).itemView.getLayoutParams();
                if (layoutParams != null) {
                    try {
                        layoutParams.mInsetsDirty = true;
                    } catch (IndexOutOfBoundsException e) {
                        throw e;
                    }
                }
                int i3 = i2 + 1;
                if (i == 0) {
                    i2 = i3;
                } else {
                    return;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        android.support.v7.widget.RecyclerView.ViewHolder getScrapViewForPosition(int r9, int r10, boolean r11) {
            /*
            r8 = this;
            r1 = 0;
            r7 = -1;
            r3 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            r0 = r8.mAttachedScrap;
            r4 = r0.size();
            r2 = r1;
        L_0x000b:
            if (r2 >= r4) goto L_0x00a7;
        L_0x000d:
            r0 = r8.mAttachedScrap;
            r0 = r0.get(r2);
            r0 = (android.support.v7.widget.RecyclerView.ViewHolder) r0;
            r5 = r0.wasReturnedFromScrap();	 Catch:{ IndexOutOfBoundsException -> 0x0093 }
            if (r5 != 0) goto L_0x00a3;
        L_0x001b:
            r5 = r0.getLayoutPosition();	 Catch:{ IndexOutOfBoundsException -> 0x0095 }
            if (r5 != r9) goto L_0x00a3;
        L_0x0021:
            r5 = r0.isInvalid();	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            if (r5 != 0) goto L_0x00a3;
        L_0x0027:
            r5 = r8.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x0099 }
            r5 = r5.mState;	 Catch:{ IndexOutOfBoundsException -> 0x0099 }
            r5 = android.support.v7.widget.RecyclerView.State.access$2200(r5);	 Catch:{ IndexOutOfBoundsException -> 0x0099 }
            if (r5 != 0) goto L_0x0037;
        L_0x0031:
            r5 = r0.isRemoved();	 Catch:{ IndexOutOfBoundsException -> 0x009b }
            if (r5 != 0) goto L_0x00a3;
        L_0x0037:
            if (r10 == r7) goto L_0x008d;
        L_0x0039:
            r2 = r0.getItemViewType();	 Catch:{ IndexOutOfBoundsException -> 0x009f }
            if (r2 == r10) goto L_0x008d;
        L_0x003f:
            r2 = z;	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4 = 3;
            r2 = r2[r4];	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r5 = z;	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r6 = 6;
            r5 = r5[r6];	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4 = r4.append(r5);	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4 = r4.append(r9);	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r5 = z;	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r6 = 4;
            r5 = r5[r6];	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4 = r4.append(r5);	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r5 = z;	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r6 = 5;
            r5 = r5[r6];	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4 = r4.append(r5);	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r5 = r0.getItemViewType();	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4 = r4.append(r5);	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r5 = z;	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r6 = 2;
            r5 = r5[r6];	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4 = r4.append(r5);	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4 = r4.append(r10);	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r5 = ")";
            r4 = r4.append(r5);	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            r4 = r4.toString();	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            android.util.Log.e(r2, r4);	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
            if (r3 == 0) goto L_0x00a7;
        L_0x008d:
            r1 = 32;
            r0.addFlags(r1);	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
        L_0x0092:
            return r0;
        L_0x0093:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0095 }
        L_0x0095:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
        L_0x0097:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0099 }
        L_0x0099:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x009b }
        L_0x009b:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x009d }
        L_0x009d:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x009f }
        L_0x009f:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception;
            throw r0;
        L_0x00a3:
            r0 = r2 + 1;
            if (r3 == 0) goto L_0x012a;
        L_0x00a7:
            if (r11 != 0) goto L_0x00f6;
        L_0x00a9:
            r0 = r8.this$0;
            r0 = r0.mChildHelper;
            r2 = r0.findHiddenNonRemovedView(r9, r10);
            if (r2 == 0) goto L_0x00f6;
        L_0x00b3:
            r0 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(r2);
            r1 = r8.this$0;
            r1 = r1.mChildHelper;
            r1.unhide(r2);
            r1 = r8.this$0;
            r1 = r1.mChildHelper;
            r1 = r1.indexOfChild(r2);
            if (r1 != r7) goto L_0x00e6;
        L_0x00c8:
            r1 = new java.lang.IllegalStateException;	 Catch:{ IndexOutOfBoundsException -> 0x00e4 }
            r2 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x00e4 }
            r2.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x00e4 }
            r3 = z;	 Catch:{ IndexOutOfBoundsException -> 0x00e4 }
            r4 = 7;
            r3 = r3[r4];	 Catch:{ IndexOutOfBoundsException -> 0x00e4 }
            r2 = r2.append(r3);	 Catch:{ IndexOutOfBoundsException -> 0x00e4 }
            r0 = r2.append(r0);	 Catch:{ IndexOutOfBoundsException -> 0x00e4 }
            r0 = r0.toString();	 Catch:{ IndexOutOfBoundsException -> 0x00e4 }
            r1.<init>(r0);	 Catch:{ IndexOutOfBoundsException -> 0x00e4 }
            throw r1;	 Catch:{ IndexOutOfBoundsException -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception;
            throw r0;
        L_0x00e6:
            r3 = r8.this$0;
            r3 = r3.mChildHelper;
            r3.detachViewFromParent(r1);
            r8.scrapView(r2);
            r1 = 8224; // 0x2020 float:1.1524E-41 double:4.063E-320;
            r0.addFlags(r1);
            goto L_0x0092;
        L_0x00f6:
            r0 = r8.mCachedViews;
            r2 = r0.size();
        L_0x00fc:
            if (r1 >= r2) goto L_0x0125;
        L_0x00fe:
            r0 = r8.mCachedViews;
            r0 = r0.get(r1);
            r0 = (android.support.v7.widget.RecyclerView.ViewHolder) r0;
            r4 = r0.isInvalid();	 Catch:{ IndexOutOfBoundsException -> 0x011d }
            if (r4 != 0) goto L_0x0121;
        L_0x010c:
            r4 = r0.getLayoutPosition();	 Catch:{ IndexOutOfBoundsException -> 0x011f }
            if (r4 != r9) goto L_0x0121;
        L_0x0112:
            if (r11 != 0) goto L_0x0092;
        L_0x0114:
            r2 = r8.mCachedViews;	 Catch:{ IndexOutOfBoundsException -> 0x011b }
            r2.remove(r1);	 Catch:{ IndexOutOfBoundsException -> 0x011b }
            goto L_0x0092;
        L_0x011b:
            r0 = move-exception;
            throw r0;
        L_0x011d:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x011f }
        L_0x011f:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x011b }
        L_0x0121:
            r0 = r1 + 1;
            if (r3 == 0) goto L_0x0128;
        L_0x0125:
            r0 = 0;
            goto L_0x0092;
        L_0x0128:
            r1 = r0;
            goto L_0x00fc;
        L_0x012a:
            r2 = r0;
            goto L_0x000b;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.Recycler.getScrapViewForPosition(int, int, boolean):android.support.v7.widget.RecyclerView$ViewHolder");
        }

        void offsetPositionRecordsForInsert(int i, int i2) {
            int i3 = ViewHolder.a;
            int size = this.mCachedViews.size();
            int i4 = 0;
            while (i4 < size) {
                ViewHolder viewHolder = (ViewHolder) this.mCachedViews.get(i4);
                if (viewHolder != null) {
                    try {
                        if (viewHolder.getLayoutPosition() >= i) {
                            viewHolder.offsetPosition(i2, true);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        throw e;
                    }
                }
                int i5 = i4 + 1;
                if (i3 == 0) {
                    i4 = i5;
                } else {
                    return;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void offsetPositionRecordsForMove(int r10, int r11) {
            /*
            r9 = this;
            r4 = 0;
            r5 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            if (r10 >= r11) goto L_0x0008;
        L_0x0005:
            r0 = -1;
            if (r5 == 0) goto L_0x0049;
        L_0x0008:
            r0 = 1;
            r1 = r0;
            r2 = r10;
            r3 = r11;
        L_0x000c:
            r0 = r9.mCachedViews;
            r6 = r0.size();
        L_0x0012:
            if (r4 >= r6) goto L_0x003c;
        L_0x0014:
            r0 = r9.mCachedViews;
            r0 = r0.get(r4);
            r0 = (android.support.v7.widget.RecyclerView.ViewHolder) r0;
            if (r0 == 0) goto L_0x0038;
        L_0x001e:
            r7 = r0.mPosition;	 Catch:{ IndexOutOfBoundsException -> 0x003d }
            if (r7 < r3) goto L_0x0038;
        L_0x0022:
            r7 = r0.mPosition;	 Catch:{ IndexOutOfBoundsException -> 0x003f }
            if (r7 <= r2) goto L_0x0028;
        L_0x0026:
            if (r5 == 0) goto L_0x0038;
        L_0x0028:
            r7 = r0.mPosition;	 Catch:{ IndexOutOfBoundsException -> 0x0043 }
            if (r7 != r10) goto L_0x0034;
        L_0x002c:
            r7 = r11 - r10;
            r8 = 0;
            r0.offsetPosition(r7, r8);	 Catch:{ IndexOutOfBoundsException -> 0x0045 }
            if (r5 == 0) goto L_0x0038;
        L_0x0034:
            r7 = 0;
            r0.offsetPosition(r1, r7);	 Catch:{ IndexOutOfBoundsException -> 0x0045 }
        L_0x0038:
            r0 = r4 + 1;
            if (r5 == 0) goto L_0x0047;
        L_0x003c:
            return;
        L_0x003d:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x003f }
        L_0x003f:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0041 }
        L_0x0041:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0043 }
        L_0x0043:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0045 }
        L_0x0045:
            r0 = move-exception;
            throw r0;
        L_0x0047:
            r4 = r0;
            goto L_0x0012;
        L_0x0049:
            r1 = r0;
            r2 = r11;
            r3 = r10;
            goto L_0x000c;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.Recycler.offsetPositionRecordsForMove(int, int):void");
        }

        public List getScrapList() {
            return this.mUnmodifiableAttachedScrap;
        }

        void markKnownViewsInvalid() {
            int i = ViewHolder.a;
            try {
                if (RecyclerView.access$2900(this.this$0) != null && RecyclerView.access$2900(this.this$0).hasStableIds()) {
                    int size = this.mCachedViews.size();
                    int i2 = 0;
                    while (i2 < size) {
                        ViewHolder viewHolder = (ViewHolder) this.mCachedViews.get(i2);
                        if (viewHolder != null) {
                            try {
                                viewHolder.addFlags(6);
                                viewHolder.addChangePayload(null);
                            } catch (IndexOutOfBoundsException e) {
                                throw e;
                            }
                        }
                        int i3 = i2 + 1;
                        if (i != 0) {
                            break;
                        }
                        i2 = i3;
                    }
                    if (i == 0) {
                        return;
                    }
                }
                try {
                    recycleAndClearCachedViews();
                } catch (IndexOutOfBoundsException e2) {
                    throw e2;
                }
            } catch (IndexOutOfBoundsException e22) {
                throw e22;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void scrapView(android.view.View r4) {
            /*
            r3 = this;
            r0 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(r4);
            r1 = 12;
            r1 = r0.hasAnyOfTheFlags(r1);	 Catch:{ IndexOutOfBoundsException -> 0x003f }
            if (r1 != 0) goto L_0x001a;
        L_0x000c:
            r1 = r0.isUpdated();	 Catch:{ IndexOutOfBoundsException -> 0x0041 }
            if (r1 == 0) goto L_0x001a;
        L_0x0012:
            r1 = r3.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x0043 }
            r1 = android.support.v7.widget.RecyclerView.access$5000(r1, r0);	 Catch:{ IndexOutOfBoundsException -> 0x0043 }
            if (r1 == 0) goto L_0x0056;
        L_0x001a:
            r1 = r0.isInvalid();	 Catch:{ IndexOutOfBoundsException -> 0x0045 }
            if (r1 == 0) goto L_0x0049;
        L_0x0020:
            r1 = r0.isRemoved();	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
            if (r1 != 0) goto L_0x0049;
        L_0x0026:
            r1 = r3.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x003d }
            r1 = android.support.v7.widget.RecyclerView.access$2900(r1);	 Catch:{ IndexOutOfBoundsException -> 0x003d }
            r1 = r1.hasStableIds();	 Catch:{ IndexOutOfBoundsException -> 0x003d }
            if (r1 != 0) goto L_0x0049;
        L_0x0032:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IndexOutOfBoundsException -> 0x003d }
            r1 = z;	 Catch:{ IndexOutOfBoundsException -> 0x003d }
            r2 = 0;
            r1 = r1[r2];	 Catch:{ IndexOutOfBoundsException -> 0x003d }
            r0.<init>(r1);	 Catch:{ IndexOutOfBoundsException -> 0x003d }
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x003d }
        L_0x003d:
            r0 = move-exception;
            throw r0;
        L_0x003f:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0041 }
        L_0x0041:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0043 }
        L_0x0043:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0045 }
        L_0x0045:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0047 }
        L_0x0047:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x003d }
        L_0x0049:
            r1 = 0;
            r0.setScrapContainer(r3, r1);	 Catch:{ IndexOutOfBoundsException -> 0x006b }
            r1 = r3.mAttachedScrap;	 Catch:{ IndexOutOfBoundsException -> 0x006b }
            r1.add(r0);	 Catch:{ IndexOutOfBoundsException -> 0x006b }
            r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IndexOutOfBoundsException -> 0x006b }
            if (r1 == 0) goto L_0x006a;
        L_0x0056:
            r1 = r3.mChangedScrap;	 Catch:{ IndexOutOfBoundsException -> 0x006d }
            if (r1 != 0) goto L_0x0061;
        L_0x005a:
            r1 = new java.util.ArrayList;	 Catch:{ IndexOutOfBoundsException -> 0x006d }
            r1.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x006d }
            r3.mChangedScrap = r1;	 Catch:{ IndexOutOfBoundsException -> 0x006d }
        L_0x0061:
            r1 = 1;
            r0.setScrapContainer(r3, r1);
            r1 = r3.mChangedScrap;
            r1.add(r0);
        L_0x006a:
            return;
        L_0x006b:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x006d }
        L_0x006d:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.Recycler.scrapView(android.view.View):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void recycleView(android.view.View r4) {
            /*
            r3 = this;
            r0 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(r4);
            r1 = r0.isTmpDetached();	 Catch:{ IndexOutOfBoundsException -> 0x002a }
            if (r1 == 0) goto L_0x0010;
        L_0x000a:
            r1 = r3.this$0;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
            r2 = 0;
            r1.removeDetachedView(r4, r2);	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        L_0x0010:
            r1 = r0.isScrap();	 Catch:{ IndexOutOfBoundsException -> 0x002c }
            if (r1 == 0) goto L_0x001d;
        L_0x0016:
            r0.unScrap();	 Catch:{ IndexOutOfBoundsException -> 0x002e }
            r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IndexOutOfBoundsException -> 0x002e }
            if (r1 == 0) goto L_0x0026;
        L_0x001d:
            r1 = r0.wasReturnedFromScrap();	 Catch:{ IndexOutOfBoundsException -> 0x0030 }
            if (r1 == 0) goto L_0x0026;
        L_0x0023:
            r0.clearReturnedFromScrapFlag();	 Catch:{ IndexOutOfBoundsException -> 0x0030 }
        L_0x0026:
            r3.recycleViewHolderInternal(r0);
            return;
        L_0x002a:
            r0 = move-exception;
            throw r0;
        L_0x002c:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x002e }
        L_0x002e:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0030 }
        L_0x0030:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.Recycler.recycleView(android.view.View):void");
        }

        void viewRangeUpdate(int i, int i2) {
            int i3 = ViewHolder.a;
            int i4 = i + i2;
            int size = this.mCachedViews.size() - 1;
            while (size >= 0) {
                ViewHolder viewHolder = (ViewHolder) this.mCachedViews.get(size);
                if (!(viewHolder == null && i3 == 0)) {
                    int layoutPosition = viewHolder.getLayoutPosition();
                    if (layoutPosition >= i && layoutPosition < i4) {
                        try {
                            viewHolder.addFlags(2);
                            recycleCachedViewAt(size);
                        } catch (IndexOutOfBoundsException e) {
                            throw e;
                        }
                    }
                }
                int i5 = size - 1;
                if (i3 == 0) {
                    size = i5;
                } else {
                    return;
                }
            }
        }

        void dispatchViewRecycled(ViewHolder viewHolder) {
            try {
                if (RecyclerView.access$5100(this.this$0) != null) {
                    RecyclerView.access$5100(this.this$0).onViewRecycled(viewHolder);
                }
                try {
                    if (RecyclerView.access$2900(this.this$0) != null) {
                        RecyclerView.access$2900(this.this$0).onViewRecycled(viewHolder);
                    }
                    try {
                        if (this.this$0.mState != null) {
                            this.this$0.mViewInfoStore.removeViewHolder(viewHolder);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        throw e;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    throw e2;
                }
            } catch (IndexOutOfBoundsException e22) {
                throw e22;
            }
        }

        void setAdapterPositionsAsUnknown() {
            int i = ViewHolder.a;
            int size = this.mCachedViews.size();
            int i2 = 0;
            while (i2 < size) {
                ViewHolder viewHolder = (ViewHolder) this.mCachedViews.get(i2);
                if (viewHolder != null) {
                    try {
                        viewHolder.addFlags(512);
                    } catch (IndexOutOfBoundsException e) {
                        throw e;
                    }
                }
                int i3 = i2 + 1;
                if (i == 0) {
                    i2 = i3;
                } else {
                    return;
                }
            }
        }

        ViewHolder getScrapViewForId(long j, int i, boolean z) {
            int i2;
            int i3 = ViewHolder.a;
            int size = this.mAttachedScrap.size() - 1;
            while (size >= 0) {
                ViewHolder viewHolder = (ViewHolder) this.mAttachedScrap.get(size);
                try {
                    if (viewHolder.getItemId() == j) {
                        if (!viewHolder.wasReturnedFromScrap()) {
                            try {
                                if (i == viewHolder.getItemViewType()) {
                                    try {
                                        viewHolder.addFlags(32);
                                        if (!viewHolder.isRemoved()) {
                                            return viewHolder;
                                        }
                                        try {
                                            if (this.this$0.mState.isPreLayout()) {
                                                return viewHolder;
                                            }
                                            viewHolder.setFlags(2, 14);
                                            return viewHolder;
                                        } catch (IndexOutOfBoundsException e) {
                                            throw e;
                                        }
                                    } catch (IndexOutOfBoundsException e2) {
                                        throw e2;
                                    }
                                } else if (!z) {
                                    try {
                                        this.mAttachedScrap.remove(size);
                                        this.this$0.removeDetachedView(viewHolder.itemView, false);
                                        quickRecycleScrapView(viewHolder.itemView);
                                    } catch (IndexOutOfBoundsException e22) {
                                        throw e22;
                                    }
                                }
                            } catch (IndexOutOfBoundsException e222) {
                                throw e222;
                            }
                        }
                    }
                    i2 = size - 1;
                    if (i3 != 0) {
                        break;
                    }
                    size = i2;
                } catch (IndexOutOfBoundsException e2222) {
                    throw e2222;
                } catch (IndexOutOfBoundsException e22222) {
                    throw e22222;
                }
            }
            size = this.mCachedViews.size() - 1;
            while (size >= 0) {
                viewHolder = (ViewHolder) this.mCachedViews.get(size);
                try {
                    if (viewHolder.getItemId() == j) {
                        if (i == viewHolder.getItemViewType()) {
                            if (z) {
                                return viewHolder;
                            }
                            try {
                                this.mCachedViews.remove(size);
                                return viewHolder;
                            } catch (IndexOutOfBoundsException e222222) {
                                throw e222222;
                            }
                        } else if (!z) {
                            try {
                                recycleCachedViewAt(size);
                            } catch (IndexOutOfBoundsException e2222222) {
                                throw e2222222;
                            }
                        }
                    }
                    i2 = size - 1;
                    if (i3 != 0) {
                        break;
                    }
                    size = i2;
                } catch (IndexOutOfBoundsException e22222222) {
                    throw e22222222;
                } catch (IndexOutOfBoundsException e222222222) {
                    throw e222222222;
                }
            }
            return null;
        }

        void quickRecycleScrapView(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            ViewHolder.access$4802(childViewHolderInt, null);
            ViewHolder.access$4902(childViewHolderInt, false);
            childViewHolderInt.clearReturnedFromScrapFlag();
            recycleViewHolderInternal(childViewHolderInt);
        }

        void addViewHolderToRecycledViewPool(ViewHolder viewHolder) {
            ViewCompat.setAccessibilityDelegate(viewHolder.itemView, null);
            dispatchViewRecycled(viewHolder);
            viewHolder.mOwnerRecyclerView = null;
            getRecycledViewPool().putRecycledView(viewHolder);
        }

        boolean validateViewHolderForOffsetPosition(ViewHolder viewHolder) {
            try {
                if (viewHolder.isRemoved()) {
                    return this.this$0.mState.isPreLayout();
                }
                try {
                    if (viewHolder.mPosition >= 0) {
                        if (viewHolder.mPosition < RecyclerView.access$2900(this.this$0).getItemCount()) {
                            if (!this.this$0.mState.isPreLayout()) {
                                try {
                                    if (RecyclerView.access$2900(this.this$0).getItemViewType(viewHolder.mPosition) != viewHolder.getItemViewType()) {
                                        return false;
                                    }
                                } catch (IndexOutOfBoundsException e) {
                                    throw e;
                                }
                            }
                            try {
                                if (!RecyclerView.access$2900(this.this$0).hasStableIds()) {
                                    return true;
                                }
                                if (viewHolder.getItemId() != RecyclerView.access$2900(this.this$0).getItemId(viewHolder.mPosition)) {
                                    return false;
                                }
                                return true;
                            } catch (IndexOutOfBoundsException e2) {
                                throw e2;
                            } catch (IndexOutOfBoundsException e22) {
                                throw e22;
                            }
                        }
                    }
                    throw new IndexOutOfBoundsException(z[1] + viewHolder);
                } catch (IndexOutOfBoundsException e222) {
                    throw e222;
                } catch (IndexOutOfBoundsException e2222) {
                    throw e2222;
                }
            } catch (IndexOutOfBoundsException e22222) {
                throw e22222;
            }
        }

        void onAdapterChanged(Adapter adapter, Adapter adapter2, boolean z) {
            clear();
            getRecycledViewPool().onAdapterChanged(adapter, adapter2, z);
        }

        void recycleAndClearCachedViews() {
            int i = ViewHolder.a;
            int size = this.mCachedViews.size() - 1;
            while (size >= 0) {
                recycleCachedViewAt(size);
                size--;
                if (i != 0) {
                    break;
                }
            }
            this.mCachedViews.clear();
        }

        public Recycler(RecyclerView recyclerView) {
            this.this$0 = recyclerView;
            this.mAttachedScrap = new ArrayList();
            this.mChangedScrap = null;
            this.mCachedViews = new ArrayList();
            this.mUnmodifiableAttachedScrap = Collections.unmodifiableList(this.mAttachedScrap);
            this.mViewCacheMax = 2;
        }

        private void invalidateDisplayListInt(ViewGroup viewGroup, boolean z) {
            int i = ViewHolder.a;
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                int i2;
                View childAt = viewGroup.getChildAt(childCount);
                try {
                    if (childAt instanceof ViewGroup) {
                        invalidateDisplayListInt((ViewGroup) childAt, true);
                    }
                    i2 = childCount - 1;
                    if (i != 0) {
                        break;
                    }
                    childCount = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                }
            }
            if (z) {
                try {
                    if (viewGroup.getVisibility() == 4) {
                        viewGroup.setVisibility(0);
                        viewGroup.setVisibility(4);
                        if (i == 0) {
                            return;
                        }
                    }
                    i2 = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(i2);
                } catch (IndexOutOfBoundsException e2) {
                    throw e2;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void unscrapView(android.support.v7.widget.RecyclerView.ViewHolder r2) {
            /*
            r1 = this;
            r0 = android.support.v7.widget.RecyclerView.ViewHolder.access$4900(r2);	 Catch:{ IndexOutOfBoundsException -> 0x0020 }
            if (r0 == 0) goto L_0x000f;
        L_0x0006:
            r0 = r1.mChangedScrap;	 Catch:{ IndexOutOfBoundsException -> 0x0022 }
            r0.remove(r2);	 Catch:{ IndexOutOfBoundsException -> 0x0022 }
            r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IndexOutOfBoundsException -> 0x0022 }
            if (r0 == 0) goto L_0x0014;
        L_0x000f:
            r0 = r1.mAttachedScrap;	 Catch:{ IndexOutOfBoundsException -> 0x0022 }
            r0.remove(r2);	 Catch:{ IndexOutOfBoundsException -> 0x0022 }
        L_0x0014:
            r0 = 0;
            android.support.v7.widget.RecyclerView.ViewHolder.access$4802(r2, r0);
            r0 = 0;
            android.support.v7.widget.RecyclerView.ViewHolder.access$4902(r2, r0);
            r2.clearReturnedFromScrapFlag();
            return;
        L_0x0020:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x0022 }
        L_0x0022:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.Recycler.unscrapView(android.support.v7.widget.RecyclerView$ViewHolder):void");
        }

        static ArrayList access$2700(Recycler recycler) {
            return recycler.mChangedScrap;
        }

        RecycledViewPool getRecycledViewPool() {
            try {
                if (this.mRecyclerPool == null) {
                    this.mRecyclerPool = new RecycledViewPool();
                }
                return this.mRecyclerPool;
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }

        public void clear() {
            this.mAttachedScrap.clear();
            recycleAndClearCachedViews();
        }

        void clearOldPositions() {
            int i = 0;
            int i2 = ViewHolder.a;
            int size = this.mCachedViews.size();
            int i3 = 0;
            while (i3 < size) {
                ((ViewHolder) this.mCachedViews.get(i3)).clearOldPosition();
                int i4 = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = i4;
            }
            size = this.mAttachedScrap.size();
            i3 = 0;
            while (i3 < size) {
                ((ViewHolder) this.mAttachedScrap.get(i3)).clearOldPosition();
                i4 = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = i4;
            }
            if (this.mChangedScrap != null) {
                i3 = this.mChangedScrap.size();
                while (i < i3) {
                    ((ViewHolder) this.mChangedScrap.get(i)).clearOldPosition();
                    i4 = i + 1;
                    if (i2 == 0) {
                        i = i4;
                    } else {
                        return;
                    }
                }
            }
        }

        public View getViewForPosition(int i) {
            return getViewForPosition(i, false);
        }

        private void attachAccessibilityDelegate(View view) {
            try {
                if (this.this$0.isAccessibilityEnabled()) {
                    if (ViewCompat.getImportantForAccessibility(view) == 0) {
                        ViewCompat.setImportantForAccessibility(view, 1);
                    }
                    try {
                        if (!ViewCompat.hasAccessibilityDelegate(view)) {
                            ViewCompat.setAccessibilityDelegate(view, RecyclerView.access$4600(this.this$0).getItemDelegate());
                        }
                    } catch (IndexOutOfBoundsException e) {
                        throw e;
                    }
                }
            } catch (IndexOutOfBoundsException e2) {
                throw e2;
            } catch (IndexOutOfBoundsException e22) {
                throw e22;
            }
        }

        void clearScrap() {
            try {
                this.mAttachedScrap.clear();
                if (this.mChangedScrap != null) {
                    this.mChangedScrap.clear();
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }

        ViewHolder getChangedScrapViewForPosition(int i) {
            int i2 = 0;
            int i3 = ViewHolder.a;
            if (this.mChangedScrap != null) {
                int size = this.mChangedScrap.size();
                if (size != 0) {
                    ViewHolder viewHolder;
                    int i4;
                    int i5 = 0;
                    while (i5 < size) {
                        viewHolder = (ViewHolder) this.mChangedScrap.get(i5);
                        try {
                            if (!viewHolder.wasReturnedFromScrap()) {
                                if (viewHolder.getLayoutPosition() == i) {
                                    viewHolder.addFlags(32);
                                    return viewHolder;
                                }
                            }
                            i4 = i5 + 1;
                            if (i3 != 0) {
                                break;
                            }
                            i5 = i4;
                        } catch (IndexOutOfBoundsException e) {
                            throw e;
                        } catch (IndexOutOfBoundsException e2) {
                            throw e2;
                        }
                    }
                    if (RecyclerView.access$2900(this.this$0).hasStableIds()) {
                        i4 = this.this$0.mAdapterHelper.findPositionOffset(i);
                        if (i4 > 0) {
                            try {
                                if (i4 < RecyclerView.access$2900(this.this$0).getItemCount()) {
                                    long itemId = RecyclerView.access$2900(this.this$0).getItemId(i4);
                                    while (i2 < size) {
                                        viewHolder = (ViewHolder) this.mChangedScrap.get(i2);
                                        try {
                                            if (!viewHolder.wasReturnedFromScrap()) {
                                                if (viewHolder.getItemId() == itemId) {
                                                    viewHolder.addFlags(32);
                                                    return viewHolder;
                                                }
                                            }
                                            i4 = i2 + 1;
                                            if (i3 != 0) {
                                                break;
                                            }
                                            i2 = i4;
                                        } catch (IndexOutOfBoundsException e22) {
                                            throw e22;
                                        } catch (IndexOutOfBoundsException e222) {
                                            throw e222;
                                        }
                                    }
                                }
                            } catch (IndexOutOfBoundsException e2222) {
                                throw e2222;
                            }
                        }
                    }
                    return null;
                }
            }
            return null;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void offsetPositionRecordsForRemove(int r6, int r7, boolean r8) {
            /*
            r5 = this;
            r2 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            r3 = r6 + r7;
            r0 = r5.mCachedViews;
            r0 = r0.size();
            r0 = r0 + -1;
            r1 = r0;
        L_0x000d:
            if (r1 < 0) goto L_0x0037;
        L_0x000f:
            r0 = r5.mCachedViews;
            r0 = r0.get(r1);
            r0 = (android.support.v7.widget.RecyclerView.ViewHolder) r0;
            if (r0 == 0) goto L_0x0033;
        L_0x0019:
            r4 = r0.getLayoutPosition();	 Catch:{ IndexOutOfBoundsException -> 0x0038 }
            if (r4 < r3) goto L_0x0025;
        L_0x001f:
            r4 = -r7;
            r0.offsetPosition(r4, r8);	 Catch:{ IndexOutOfBoundsException -> 0x003a }
            if (r2 == 0) goto L_0x0033;
        L_0x0025:
            r4 = r0.getLayoutPosition();	 Catch:{ IndexOutOfBoundsException -> 0x003c }
            if (r4 < r6) goto L_0x0033;
        L_0x002b:
            r4 = 8;
            r0.addFlags(r4);	 Catch:{ IndexOutOfBoundsException -> 0x003c }
            r5.recycleCachedViewAt(r1);	 Catch:{ IndexOutOfBoundsException -> 0x003c }
        L_0x0033:
            r0 = r1 + -1;
            if (r2 == 0) goto L_0x003e;
        L_0x0037:
            return;
        L_0x0038:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x003a }
        L_0x003a:
            r0 = move-exception;
            throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x003c }
        L_0x003c:
            r0 = move-exception;
            throw r0;
        L_0x003e:
            r1 = r0;
            goto L_0x000d;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.Recycler.offsetPositionRecordsForRemove(int, int, boolean):void");
        }

        private void invalidateDisplayListInt(ViewHolder viewHolder) {
            try {
                if (viewHolder.itemView instanceof ViewGroup) {
                    invalidateDisplayListInt((ViewGroup) viewHolder.itemView, false);
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }

        int getScrapCount() {
            return this.mAttachedScrap.size();
        }

        void recycleCachedViewAt(int i) {
            addViewHolderToRecycledViewPool((ViewHolder) this.mCachedViews.get(i));
            this.mCachedViews.remove(i);
        }
    }

    public interface RecyclerListener {
        void onViewRecycled(ViewHolder viewHolder);
    }

    class RecyclerViewDataObserver extends AdapterDataObserver {
        final RecyclerView this$0;

        RecyclerViewDataObserver(RecyclerView recyclerView, 1 1) {
            this(recyclerView);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged() {
            /*
            r3 = this;
            r2 = 1;
            r0 = r3.this$0;
            r1 = 0;
            r0.assertNotInLayoutOrScroll(r1);
            r0 = r3.this$0;
            r0 = android.support.v7.widget.RecyclerView.access$2900(r0);
            r0 = r0.hasStableIds();
            if (r0 == 0) goto L_0x0023;
        L_0x0013:
            r0 = r3.this$0;
            r0 = r0.mState;
            android.support.v7.widget.RecyclerView.State.access$1902(r0, r2);
            r0 = r3.this$0;
            android.support.v7.widget.RecyclerView.access$3800(r0);
            r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            if (r0 == 0) goto L_0x002f;
        L_0x0023:
            r0 = r3.this$0;
            r0 = r0.mState;
            android.support.v7.widget.RecyclerView.State.access$1902(r0, r2);
            r0 = r3.this$0;
            android.support.v7.widget.RecyclerView.access$3800(r0);
        L_0x002f:
            r0 = r3.this$0;
            r0 = r0.mAdapterHelper;
            r0 = r0.hasPendingUpdates();
            if (r0 != 0) goto L_0x003e;
        L_0x0039:
            r0 = r3.this$0;
            r0.requestLayout();
        L_0x003e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.RecyclerViewDataObserver.onChanged():void");
        }

        private RecyclerViewDataObserver(RecyclerView recyclerView) {
            this.this$0 = recyclerView;
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        Parcelable mLayoutState;

        final class 1 implements Creator {
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public Object[] m38newArray(int i) {
                return newArray(i);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            1() {
            }

            public Object m37createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.mLayoutState, 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.mLayoutState = parcel.readParcelable(LayoutManager.class.getClassLoader());
        }

        static void access$2000(SavedState savedState, SavedState savedState2) {
            savedState.copyFrom(savedState2);
        }

        static {
            CREATOR = new 1();
        }

        private void copyFrom(SavedState savedState) {
            this.mLayoutState = savedState.mLayoutState;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public abstract class SmoothScroller {
        private static final String[] z;
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final Action mRecyclingAction;
        private boolean mRunning;
        private int mTargetPosition;
        private View mTargetView;

        public class Action {
            private static final String[] z;
            private boolean changed;
            private int consecutiveUpdates;
            private int mDuration;
            private int mDx;
            private int mDy;
            private Interpolator mInterpolator;
            private int mJumpToPosition;

            static {
                String[] strArr = new String[4];
                String str = "h\u00046?VSI\n3PT\u00055pCX\u001d0?L\u001b\u0000*p@^\u000077\u0002N\u0019=1V^\ry$MTI?\"GJ\u001c<>VW\u0010wpoZ\u0002<pQN\u001b<p[T\u001cy1P^I7?V\u001b\n11L\\\u000077\u0002R\u001dy%LW\f*#\u0002U\f:5QH\b+)";
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
                                i3 = 59;
                                break;
                            case at.g /*1*/:
                                i3 = arj.Theme_radioButtonStyle;
                                break;
                            case at.i /*2*/:
                                i3 = 89;
                                break;
                            case at.o /*3*/:
                                i3 = 80;
                                break;
                            default:
                                i3 = 34;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case v.m /*0*/:
                            strArr2[i] = str;
                            str = "r\u000fy)MNI)\"MM\u0000=5\u0002Z\u0007y9LO\f+ MW\b-?P\u0017I ?W\u001b\u0004,#V\u001b\u001a<$\u0002ZI)?QR\u001d0&G\u001b\r,\"CO\u00006>";
                            i = 2;
                            strArr2 = strArr3;
                            obj = 1;
                            break;
                        case at.g /*1*/:
                            strArr2[i] = str;
                            i = 3;
                            strArr2 = strArr3;
                            str = "h\n+?NWI=%PZ\u001d0?L\u001b\u0004,#V\u001b\u000b<pC\u001b\u00196#KO\u0000/5\u0002U\u001c42GI";
                            obj = 2;
                            break;
                        case at.i /*2*/:
                            strArr2[i] = str;
                            z = strArr3;
                            return;
                        default:
                            strArr2[i] = str;
                            str = "i\f:)AW\f+\u0006K^\u001e";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            static void access$5900(Action action, RecyclerView recyclerView) {
                action.runIfNecessary(recyclerView);
            }

            private void validate() {
                try {
                    if (this.mInterpolator != null) {
                        if (this.mDuration < 1) {
                            throw new IllegalStateException(z[2]);
                        }
                    }
                    try {
                        if (this.mDuration < 1) {
                            throw new IllegalStateException(z[3]);
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            }

            public Action(int i, int i2, int i3, Interpolator interpolator) {
                this.mJumpToPosition = -1;
                this.changed = false;
                this.consecutiveUpdates = 0;
                this.mDx = i;
                this.mDy = i2;
                this.mDuration = i3;
                this.mInterpolator = interpolator;
            }

            boolean hasJumpTarget() {
                try {
                    return this.mJumpToPosition >= 0;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void runIfNecessary(android.support.v7.widget.RecyclerView r7) {
                /*
                r6 = this;
                r2 = 0;
                r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
                r1 = r6.mJumpToPosition;
                if (r1 < 0) goto L_0x0012;
            L_0x0007:
                r0 = r6.mJumpToPosition;
                r1 = -1;
                r6.mJumpToPosition = r1;
                android.support.v7.widget.RecyclerView.access$6000(r7, r0);
                r6.changed = r2;
            L_0x0011:
                return;
            L_0x0012:
                r1 = r6.changed;	 Catch:{ IllegalStateException -> 0x0072 }
                if (r1 == 0) goto L_0x006c;
            L_0x0016:
                r6.validate();	 Catch:{ IllegalStateException -> 0x0074 }
                r1 = r6.mInterpolator;	 Catch:{ IllegalStateException -> 0x0074 }
                if (r1 != 0) goto L_0x003f;
            L_0x001d:
                r1 = r6.mDuration;	 Catch:{ IllegalStateException -> 0x0076 }
                r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
                if (r1 != r2) goto L_0x0030;
            L_0x0023:
                r1 = android.support.v7.widget.RecyclerView.access$5700(r7);	 Catch:{ IllegalStateException -> 0x0078 }
                r2 = r6.mDx;	 Catch:{ IllegalStateException -> 0x0078 }
                r3 = r6.mDy;	 Catch:{ IllegalStateException -> 0x0078 }
                r1.smoothScrollBy(r2, r3);	 Catch:{ IllegalStateException -> 0x0078 }
                if (r0 == 0) goto L_0x004e;
            L_0x0030:
                r1 = android.support.v7.widget.RecyclerView.access$5700(r7);	 Catch:{ IllegalStateException -> 0x007a }
                r2 = r6.mDx;	 Catch:{ IllegalStateException -> 0x007a }
                r3 = r6.mDy;	 Catch:{ IllegalStateException -> 0x007a }
                r4 = r6.mDuration;	 Catch:{ IllegalStateException -> 0x007a }
                r1.smoothScrollBy(r2, r3, r4);	 Catch:{ IllegalStateException -> 0x007a }
                if (r0 == 0) goto L_0x004e;
            L_0x003f:
                r1 = android.support.v7.widget.RecyclerView.access$5700(r7);	 Catch:{ IllegalStateException -> 0x007a }
                r2 = r6.mDx;	 Catch:{ IllegalStateException -> 0x007a }
                r3 = r6.mDy;	 Catch:{ IllegalStateException -> 0x007a }
                r4 = r6.mDuration;	 Catch:{ IllegalStateException -> 0x007a }
                r5 = r6.mInterpolator;	 Catch:{ IllegalStateException -> 0x007a }
                r1.smoothScrollBy(r2, r3, r4, r5);	 Catch:{ IllegalStateException -> 0x007a }
            L_0x004e:
                r1 = r6.consecutiveUpdates;	 Catch:{ IllegalStateException -> 0x007c }
                r1 = r1 + 1;
                r6.consecutiveUpdates = r1;	 Catch:{ IllegalStateException -> 0x007c }
                r1 = r6.consecutiveUpdates;	 Catch:{ IllegalStateException -> 0x007c }
                r2 = 10;
                if (r1 <= r2) goto L_0x0067;
            L_0x005a:
                r1 = z;	 Catch:{ IllegalStateException -> 0x007c }
                r2 = 1;
                r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x007c }
                r2 = z;	 Catch:{ IllegalStateException -> 0x007c }
                r3 = 0;
                r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x007c }
                android.util.Log.e(r1, r2);	 Catch:{ IllegalStateException -> 0x007c }
            L_0x0067:
                r1 = 0;
                r6.changed = r1;	 Catch:{ IllegalStateException -> 0x0070 }
                if (r0 == 0) goto L_0x0011;
            L_0x006c:
                r0 = 0;
                r6.consecutiveUpdates = r0;	 Catch:{ IllegalStateException -> 0x0070 }
                goto L_0x0011;
            L_0x0070:
                r0 = move-exception;
                throw r0;
            L_0x0072:
                r0 = move-exception;
                throw r0;	 Catch:{ IllegalStateException -> 0x0074 }
            L_0x0074:
                r0 = move-exception;
                throw r0;	 Catch:{ IllegalStateException -> 0x0076 }
            L_0x0076:
                r0 = move-exception;
                throw r0;	 Catch:{ IllegalStateException -> 0x0078 }
            L_0x0078:
                r0 = move-exception;
                throw r0;	 Catch:{ IllegalStateException -> 0x007a }
            L_0x007a:
                r0 = move-exception;
                throw r0;
            L_0x007c:
                r0 = move-exception;
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.SmoothScroller.Action.runIfNecessary(android.support.v7.widget.RecyclerView):void");
            }

            public Action(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }
        }

        static {
            String[] strArr = new String[2];
            String str = "L\\Ec8r\\TL2{N";
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
                            i3 = 30;
                            break;
                        case at.g /*1*/:
                            i3 = 57;
                            break;
                        case at.i /*2*/:
                            i3 = 38;
                            break;
                        case at.o /*3*/:
                            i3 = 26;
                            break;
                        default:
                            i3 = 91;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "NXUi>z\u0019Il>l\u0019R{)y\\R:+qJOn2qW\u0006m3wUC:(sVIn3>JEh4rUOt<0";
                        obj = null;
                }
            }
        }

        protected abstract void onSeekTargetStep(int i, int i2, State state, Action action);

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, State state, Action action);

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        protected final void stop() {
            if (this.mRunning) {
                onStop();
                State.access$5602(this.mRecyclerView.mState, -1);
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mRunning = false;
                LayoutManager.access$5800(this.mLayoutManager, this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void onAnimation(int r8, int r9) {
            /*
            r7 = this;
            r6 = 1;
            r5 = 0;
            r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            r1 = r7.mRecyclerView;
            r2 = r7.mRunning;
            if (r2 == 0) goto L_0x0011;
        L_0x000a:
            r2 = r7.mTargetPosition;
            r3 = -1;
            if (r2 == r3) goto L_0x0011;
        L_0x000f:
            if (r1 != 0) goto L_0x0014;
        L_0x0011:
            r7.stop();
        L_0x0014:
            r7.mPendingInitialRun = r5;
            r2 = r7.mTargetView;
            if (r2 == 0) goto L_0x0045;
        L_0x001a:
            r2 = r7.mTargetView;
            r2 = r7.getChildPosition(r2);
            r3 = r7.mTargetPosition;
            if (r2 != r3) goto L_0x0037;
        L_0x0024:
            r2 = r7.mTargetView;
            r3 = r1.mState;
            r4 = r7.mRecyclingAction;
            r7.onTargetFound(r2, r3, r4);
            r2 = r7.mRecyclingAction;
            android.support.v7.widget.RecyclerView.SmoothScroller.Action.access$5900(r2, r1);
            r7.stop();
            if (r0 == 0) goto L_0x0045;
        L_0x0037:
            r2 = z;
            r2 = r2[r5];
            r3 = z;
            r3 = r3[r6];
            android.util.Log.e(r2, r3);
            r2 = 0;
            r7.mTargetView = r2;
        L_0x0045:
            r2 = r7.mRunning;
            if (r2 == 0) goto L_0x006f;
        L_0x0049:
            r2 = r1.mState;
            r3 = r7.mRecyclingAction;
            r7.onSeekTargetStep(r8, r9, r2, r3);
            r2 = r7.mRecyclingAction;
            r2 = r2.hasJumpTarget();
            r3 = r7.mRecyclingAction;
            android.support.v7.widget.RecyclerView.SmoothScroller.Action.access$5900(r3, r1);
            if (r2 == 0) goto L_0x006f;
        L_0x005d:
            r2 = r7.mRunning;
            if (r2 == 0) goto L_0x006c;
        L_0x0061:
            r7.mPendingInitialRun = r6;
            r1 = android.support.v7.widget.RecyclerView.access$5700(r1);
            r1.postOnAnimation();
            if (r0 == 0) goto L_0x006f;
        L_0x006c:
            r7.stop();
        L_0x006f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.SmoothScroller.onAnimation(int, int):void");
        }

        public SmoothScroller() {
            this.mTargetPosition = -1;
            this.mRecyclingAction = new Action(0, 0);
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        static void access$3300(SmoothScroller smoothScroller, int i, int i2) {
            smoothScroller.onAnimation(i, i2);
        }

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }
    }

    public class State {
        private static final String[] z;
        private SparseArray mData;
        private int mDeletedInvisibleItemCountSincePreviousLayout;
        private boolean mInPreLayout;
        int mItemCount;
        private int mPreviousLayoutItemCount;
        private boolean mRunPredictiveAnimations;
        private boolean mRunSimpleAnimations;
        private boolean mStructureChanged;
        private int mTargetPosition;
        private boolean mTrackOldChangeHolders;

        static {
            String[] strArr = new String[9];
            String str = "fREeC8\u0007KBB8\u0017k^V$\u0015MR\n";
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
                            i3 = 74;
                            break;
                        case at.g /*1*/:
                            i3 = 114;
                            break;
                        case at.i /*2*/:
                            i3 = 40;
                            break;
                        case at.o /*3*/:
                            i3 = 54;
                            break;
                        default:
                            i3 = 55;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "fRErR&\u0017\\SS\u0003\u001c^_D#\u0010DS~>\u0017EuX?\u001c\\e^$\u0011MfE/\u0004AYB9>IOX?\u0006\u0015";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\u0019\u0006IBR1\u001f|WE-\u0017\\fX9\u001b\\_X$O";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "fREfE/\u0004AYB9>IOX?\u0006aBR'1GCY>O";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "fRE\u007fY\u001a\u0000MzV3\u001d]B\n";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "fREdB$\"ZSS#\u0011\\_A/3F_Z+\u0006AYY9O";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "fREdB$!A[G&\u0017iX^'\u0013\\_X$\u0001\u0015";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "fRE\u007fC/\u001fkYB$\u0006\u0015";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "fRErV>\u0013\u0015";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        static boolean access$2100(State state) {
            return state.mRunPredictiveAnimations;
        }

        static boolean access$2500(State state) {
            return state.mTrackOldChangeHolders;
        }

        static boolean access$2502(State state, boolean z) {
            state.mTrackOldChangeHolders = z;
            return z;
        }

        static int access$1802(State state, int i) {
            state.mDeletedInvisibleItemCountSincePreviousLayout = i;
            return i;
        }

        static boolean access$2202(State state, boolean z) {
            state.mInPreLayout = z;
            return z;
        }

        public boolean willRunPredictiveAnimations() {
            return this.mRunPredictiveAnimations;
        }

        static boolean access$2102(State state, boolean z) {
            state.mRunPredictiveAnimations = z;
            return z;
        }

        public int getItemCount() {
            return this.mInPreLayout ? this.mPreviousLayoutItemCount - this.mDeletedInvisibleItemCountSincePreviousLayout : this.mItemCount;
        }

        public boolean hasTargetScrollPosition() {
            return this.mTargetPosition != -1;
        }

        static boolean access$2200(State state) {
            return state.mInPreLayout;
        }

        public String toString() {
            return z[3] + this.mTargetPosition + z[1] + this.mData + z[8] + this.mItemCount + z[4] + this.mPreviousLayoutItemCount + z[2] + this.mDeletedInvisibleItemCountSincePreviousLayout + z[0] + this.mStructureChanged + z[5] + this.mInPreLayout + z[7] + this.mRunSimpleAnimations + z[6] + this.mRunPredictiveAnimations + '}';
        }

        static boolean access$2302(State state, boolean z) {
            state.mRunSimpleAnimations = z;
            return z;
        }

        static int access$5602(State state, int i) {
            state.mTargetPosition = i;
            return i;
        }

        static boolean access$1902(State state, boolean z) {
            state.mStructureChanged = z;
            return z;
        }

        static boolean access$1900(State state) {
            return state.mStructureChanged;
        }

        static int access$2602(State state, int i) {
            state.mPreviousLayoutItemCount = i;
            return i;
        }

        static boolean access$2300(State state) {
            return state.mRunSimpleAnimations;
        }

        static int access$1812(State state, int i) {
            int i2 = state.mDeletedInvisibleItemCountSincePreviousLayout + i;
            state.mDeletedInvisibleItemCountSincePreviousLayout = i2;
            return i2;
        }

        public boolean isPreLayout() {
            return this.mInPreLayout;
        }

        public State() {
            this.mTargetPosition = -1;
            this.mItemCount = 0;
            this.mPreviousLayoutItemCount = 0;
            this.mDeletedInvisibleItemCountSincePreviousLayout = 0;
            this.mStructureChanged = false;
            this.mInPreLayout = false;
            this.mRunSimpleAnimations = false;
            this.mRunPredictiveAnimations = false;
            this.mTrackOldChangeHolders = false;
        }
    }

    public abstract class ViewCacheExtension {
        public abstract View getViewForPositionAndType(Recycler recycler, int i, int i2);
    }

    class ViewFlinger implements Runnable {
        private static final String z;
        private boolean mEatRunOnAnimationRequest;
        private Interpolator mInterpolator;
        private int mLastFlingX;
        private int mLastFlingY;
        private boolean mReSchedulePostAnimationCallback;
        private ScrollerCompat mScroller;
        final RecyclerView this$0;

        static {
            char[] toCharArray = "0,\"?A\u0010\u0015n\u0000".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 98;
                        break;
                    case at.g /*1*/:
                        i2 = 122;
                        break;
                    case at.i /*2*/:
                        i2 = 2;
                        break;
                    case at.o /*3*/:
                        i2 = arj.Theme_spinnerStyle;
                        break;
                    default:
                        i2 = 34;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public void fling(int i, int i2) {
            RecyclerView.access$3700(this.this$0, 2);
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            this.mScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            postOnAnimation();
        }

        public void smoothScrollBy(int i, int i2, int i3, int i4) {
            smoothScrollBy(i, i2, computeScrollDuration(i, i2, i3, i4));
        }

        void postOnAnimation() {
            if (this.mEatRunOnAnimationRequest) {
                this.mReSchedulePostAnimationCallback = true;
                if (ViewHolder.a == 0) {
                    return;
                }
            }
            this.this$0.removeCallbacks(this);
            ViewCompat.postOnAnimation(this.this$0, this);
        }

        private int computeScrollDuration(int i, int i2, int i3, int i4) {
            Object obj;
            int width;
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                obj = 1;
            } else {
                obj = null;
            }
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            if (obj != null) {
                width = this.this$0.getWidth();
            } else {
                width = this.this$0.getHeight();
            }
            int i6 = width / 2;
            float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) sqrt2) * 1.0f) / ((float) width))) * ((float) i6)) + ((float) i6);
            if (sqrt > 0) {
                sqrt = Math.round(Math.abs(distanceInfluenceForSnapDuration / ((float) sqrt)) * 1000.0f) * 4;
                if (ViewHolder.a == 0) {
                    i5 = sqrt;
                    return Math.min(i5, 2000);
                }
            }
            if (obj != null) {
                i5 = abs;
            } else {
                i5 = abs2;
            }
            i5 = (int) (((((float) i5) / ((float) width)) + 1.0f) * 300.0f);
            return Math.min(i5, 2000);
        }

        public void stop() {
            this.this$0.removeCallbacks(this);
            this.mScroller.abortAnimation();
        }

        public ViewFlinger(RecyclerView recyclerView) {
            this.this$0 = recyclerView;
            this.mInterpolator = RecyclerView.access$2800();
            this.mEatRunOnAnimationRequest = false;
            this.mReSchedulePostAnimationCallback = false;
            this.mScroller = ScrollerCompat.create(recyclerView.getContext(), RecyclerView.access$2800());
        }

        public void smoothScrollBy(int i, int i2, int i3) {
            smoothScrollBy(i, i2, i3, RecyclerView.access$2800());
        }

        private void disableRunOnAnimationRequests() {
            this.mReSchedulePostAnimationCallback = false;
            this.mEatRunOnAnimationRequest = true;
        }

        public void smoothScrollBy(int i, int i2, int i3, Interpolator interpolator) {
            if (this.mInterpolator != interpolator) {
                this.mInterpolator = interpolator;
                this.mScroller = ScrollerCompat.create(this.this$0.getContext(), interpolator);
            }
            RecyclerView.access$3700(this.this$0, 2);
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            this.mScroller.startScroll(0, 0, i, i2, i3);
            postOnAnimation();
        }

        private void enableRunOnAnimationRequests() {
            this.mEatRunOnAnimationRequest = false;
            if (this.mReSchedulePostAnimationCallback) {
                postOnAnimation();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            r17 = this;
            r8 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            r17.disableRunOnAnimationRequests();
            r0 = r17;
            r1 = r0.this$0;
            android.support.v7.widget.RecyclerView.access$400(r1);
            r0 = r17;
            r9 = r0.mScroller;
            r0 = r17;
            r1 = r0.this$0;
            r1 = android.support.v7.widget.RecyclerView.access$1100(r1);
            r10 = r1.mSmoothScroller;
            r1 = r9.computeScrollOffset();
            if (r1 == 0) goto L_0x01b4;
        L_0x0020:
            r11 = r9.getCurrX();
            r12 = r9.getCurrY();
            r0 = r17;
            r1 = r0.mLastFlingX;
            r13 = r11 - r1;
            r0 = r17;
            r1 = r0.mLastFlingY;
            r14 = r12 - r1;
            r4 = 0;
            r2 = 0;
            r0 = r17;
            r0.mLastFlingX = r11;
            r0 = r17;
            r0.mLastFlingY = r12;
            r3 = 0;
            r1 = 0;
            r0 = r17;
            r5 = r0.this$0;
            r5 = android.support.v7.widget.RecyclerView.access$2900(r5);
            if (r5 == 0) goto L_0x00e8;
        L_0x004a:
            r0 = r17;
            r5 = r0.this$0;
            r5.eatRequestLayout();
            r0 = r17;
            r5 = r0.this$0;
            android.support.v7.widget.RecyclerView.access$3000(r5);
            r5 = z;
            android.support.v4.os.TraceCompat.beginSection(r5);
            if (r13 == 0) goto L_0x0079;
        L_0x005f:
            r0 = r17;
            r3 = r0.this$0;
            r3 = android.support.v7.widget.RecyclerView.access$1100(r3);
            r0 = r17;
            r4 = r0.this$0;
            r4 = r4.mRecycler;
            r0 = r17;
            r5 = r0.this$0;
            r5 = r5.mState;
            r4 = r3.scrollHorizontallyBy(r13, r4, r5);
            r3 = r13 - r4;
        L_0x0079:
            if (r14 == 0) goto L_0x0095;
        L_0x007b:
            r0 = r17;
            r1 = r0.this$0;
            r1 = android.support.v7.widget.RecyclerView.access$1100(r1);
            r0 = r17;
            r2 = r0.this$0;
            r2 = r2.mRecycler;
            r0 = r17;
            r5 = r0.this$0;
            r5 = r5.mState;
            r2 = r1.scrollVerticallyBy(r14, r2, r5);
            r1 = r14 - r2;
        L_0x0095:
            android.support.v4.os.TraceCompat.endSection();
            r0 = r17;
            r5 = r0.this$0;
            android.support.v7.widget.RecyclerView.access$3100(r5);
            r0 = r17;
            r5 = r0.this$0;
            android.support.v7.widget.RecyclerView.access$3200(r5);
            r0 = r17;
            r5 = r0.this$0;
            r6 = 0;
            r5.resumeRequestLayout(r6);
            if (r10 == 0) goto L_0x00e8;
        L_0x00b0:
            r5 = r10.isPendingInitialRun();
            if (r5 != 0) goto L_0x00e8;
        L_0x00b6:
            r5 = r10.isRunning();
            if (r5 == 0) goto L_0x00e8;
        L_0x00bc:
            r0 = r17;
            r5 = r0.this$0;
            r5 = r5.mState;
            r5 = r5.getItemCount();
            if (r5 != 0) goto L_0x00cd;
        L_0x00c8:
            r10.stop();
            if (r8 == 0) goto L_0x00e8;
        L_0x00cd:
            r6 = r10.getTargetPosition();
            if (r6 < r5) goto L_0x00e1;
        L_0x00d3:
            r5 = r5 + -1;
            r10.setTargetPosition(r5);
            r5 = r13 - r3;
            r6 = r14 - r1;
            android.support.v7.widget.RecyclerView.SmoothScroller.access$3300(r10, r5, r6);
            if (r8 == 0) goto L_0x00e8;
        L_0x00e1:
            r5 = r13 - r3;
            r6 = r14 - r1;
            android.support.v7.widget.RecyclerView.SmoothScroller.access$3300(r10, r5, r6);
        L_0x00e8:
            r16 = r3;
            r3 = r2;
            r2 = r16;
            r0 = r17;
            r5 = r0.this$0;
            r5 = android.support.v7.widget.RecyclerView.access$3400(r5);
            r5 = r5.isEmpty();
            if (r5 != 0) goto L_0x0102;
        L_0x00fb:
            r0 = r17;
            r5 = r0.this$0;
            r5.invalidate();
        L_0x0102:
            r0 = r17;
            r5 = r0.this$0;
            r5 = android.support.v4.view.ViewCompat.getOverScrollMode(r5);
            r6 = 2;
            if (r5 == r6) goto L_0x0114;
        L_0x010d:
            r0 = r17;
            r5 = r0.this$0;
            android.support.v7.widget.RecyclerView.access$3500(r5, r13, r14);
        L_0x0114:
            if (r2 != 0) goto L_0x0118;
        L_0x0116:
            if (r1 == 0) goto L_0x0153;
        L_0x0118:
            r5 = r9.getCurrVelocity();
            r6 = (int) r5;
            r5 = 0;
            if (r2 == r11) goto L_0x01e5;
        L_0x0120:
            if (r2 >= 0) goto L_0x01ce;
        L_0x0122:
            r5 = -r6;
        L_0x0123:
            r7 = r5;
        L_0x0124:
            r5 = 0;
            if (r1 == r12) goto L_0x01e2;
        L_0x0127:
            if (r1 >= 0) goto L_0x01d6;
        L_0x0129:
            r6 = -r6;
        L_0x012a:
            r0 = r17;
            r5 = r0.this$0;
            r5 = android.support.v4.view.ViewCompat.getOverScrollMode(r5);
            r15 = 2;
            if (r5 == r15) goto L_0x013c;
        L_0x0135:
            r0 = r17;
            r5 = r0.this$0;
            r5.absorbGlows(r7, r6);
        L_0x013c:
            if (r7 != 0) goto L_0x0146;
        L_0x013e:
            if (r2 == r11) goto L_0x0146;
        L_0x0140:
            r2 = r9.getFinalX();
            if (r2 != 0) goto L_0x0153;
        L_0x0146:
            if (r6 != 0) goto L_0x0150;
        L_0x0148:
            if (r1 == r12) goto L_0x0150;
        L_0x014a:
            r1 = r9.getFinalY();
            if (r1 != 0) goto L_0x0153;
        L_0x0150:
            r9.abortAnimation();
        L_0x0153:
            if (r4 != 0) goto L_0x0157;
        L_0x0155:
            if (r3 == 0) goto L_0x015e;
        L_0x0157:
            r0 = r17;
            r1 = r0.this$0;
            r1.dispatchOnScrolled(r4, r3);
        L_0x015e:
            r0 = r17;
            r1 = r0.this$0;
            r1 = android.support.v7.widget.RecyclerView.access$3600(r1);
            if (r1 != 0) goto L_0x016f;
        L_0x0168:
            r0 = r17;
            r1 = r0.this$0;
            r1.invalidate();
        L_0x016f:
            if (r14 == 0) goto L_0x01db;
        L_0x0171:
            r0 = r17;
            r1 = r0.this$0;
            r1 = android.support.v7.widget.RecyclerView.access$1100(r1);
            r1 = r1.canScrollVertically();
            if (r1 == 0) goto L_0x01db;
        L_0x017f:
            if (r3 != r14) goto L_0x01db;
        L_0x0181:
            r1 = 1;
            r2 = r1;
        L_0x0183:
            if (r13 == 0) goto L_0x01de;
        L_0x0185:
            r0 = r17;
            r1 = r0.this$0;
            r1 = android.support.v7.widget.RecyclerView.access$1100(r1);
            r1 = r1.canScrollHorizontally();
            if (r1 == 0) goto L_0x01de;
        L_0x0193:
            if (r4 != r13) goto L_0x01de;
        L_0x0195:
            r1 = 1;
        L_0x0196:
            if (r13 != 0) goto L_0x019a;
        L_0x0198:
            if (r14 == 0) goto L_0x019e;
        L_0x019a:
            if (r1 != 0) goto L_0x019e;
        L_0x019c:
            if (r2 == 0) goto L_0x01e0;
        L_0x019e:
            r1 = 1;
        L_0x019f:
            r2 = r9.isFinished();
            if (r2 != 0) goto L_0x01a7;
        L_0x01a5:
            if (r1 != 0) goto L_0x01b1;
        L_0x01a7:
            r0 = r17;
            r1 = r0.this$0;
            r2 = 0;
            android.support.v7.widget.RecyclerView.access$3700(r1, r2);
            if (r8 == 0) goto L_0x01b4;
        L_0x01b1:
            r17.postOnAnimation();
        L_0x01b4:
            if (r10 == 0) goto L_0x01ca;
        L_0x01b6:
            r1 = r10.isPendingInitialRun();
            if (r1 == 0) goto L_0x01c1;
        L_0x01bc:
            r1 = 0;
            r2 = 0;
            android.support.v7.widget.RecyclerView.SmoothScroller.access$3300(r10, r1, r2);
        L_0x01c1:
            r0 = r17;
            r1 = r0.mReSchedulePostAnimationCallback;
            if (r1 != 0) goto L_0x01ca;
        L_0x01c7:
            r10.stop();
        L_0x01ca:
            r17.enableRunOnAnimationRequests();
            return;
        L_0x01ce:
            if (r2 <= 0) goto L_0x01d3;
        L_0x01d0:
            r5 = r6;
            goto L_0x0123;
        L_0x01d3:
            r5 = 0;
            goto L_0x0123;
        L_0x01d6:
            if (r1 > 0) goto L_0x012a;
        L_0x01d8:
            r6 = 0;
            goto L_0x012a;
        L_0x01db:
            r1 = 0;
            r2 = r1;
            goto L_0x0183;
        L_0x01de:
            r1 = 0;
            goto L_0x0196;
        L_0x01e0:
            r1 = 0;
            goto L_0x019f;
        L_0x01e2:
            r6 = r5;
            goto L_0x012a;
        L_0x01e5:
            r7 = r5;
            goto L_0x0124;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.ViewFlinger.run():void");
        }

        public void smoothScrollBy(int i, int i2) {
            smoothScrollBy(i, i2, 0, 0);
        }

        private float distanceInfluenceForSnapDuration(float f) {
            return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
        }
    }

    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void onExitLayoutOrScroll() {
        try {
            this.mLayoutOrScrollCounter--;
            if (this.mLayoutOrScrollCounter < 1) {
                this.mLayoutOrScrollCounter = 0;
                dispatchContentChangedIfNecessary();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    private void addAnimatingView(ViewHolder viewHolder) {
        Object obj = 1;
        int i = ViewHolder.a;
        View view = viewHolder.itemView;
        try {
            if (view.getParent() != this) {
                obj = null;
            }
            try {
                this.mRecycler.unscrapView(getChildViewHolder(view));
                if (viewHolder.isTmpDetached()) {
                    this.mChildHelper.attachViewToParent(view, -1, view.getLayoutParams(), true);
                    if (i == 0) {
                        return;
                    }
                }
                if (obj == null) {
                    try {
                        this.mChildHelper.addView(view, true);
                        if (i == 0) {
                            return;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                this.mChildHelper.hide(view);
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                try {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    private void stopScrollersInternal() {
        try {
            this.mViewFlinger.stop();
            if (this.mLayout != null) {
                this.mLayout.stopSmoothScroller();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void requestLayout() {
        try {
            if (!this.mEatRequestLayout) {
                if (!this.mLayoutFrozen) {
                    try {
                        super.requestLayout();
                        if (ViewHolder.a == 0) {
                            return;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
            this.mLayoutRequestEaten = true;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public int computeHorizontalScrollRange() {
        try {
            return this.mLayout.canScrollHorizontally() ? this.mLayout.computeHorizontalScrollRange(this.mState) : 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        try {
            if (this.mLayout != null) {
                return this.mLayout.generateLayoutParams(getContext(), attributeSet);
            }
            throw new IllegalStateException(z[39]);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int computeVerticalScrollExtent() {
        try {
            return this.mLayout.canScrollVertically() ? this.mLayout.computeVerticalScrollExtent(this.mState) : 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    void clearOldPositions() {
        int i = ViewHolder.a;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i2 = 0;
        while (i2 < unfilteredChildCount) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i2));
            try {
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.clearOldPosition();
                }
                i2++;
                if (i != 0) {
                    break;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.mRecycler.clearOldPositions();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        eatRequestLayout();
        TraceCompat.beginSection(z[11]);
        dispatchLayout();
        TraceCompat.endSection();
        resumeRequestLayout(false);
        this.mFirstLayoutComplete = true;
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        requestLayout();
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mScrollingChildHelper.dispatchNestedFling(f, f2, z);
    }

    static boolean access$602(RecyclerView recyclerView, boolean z) {
        recyclerView.mPostedAnimatorRunner = z;
        return z;
    }

    static void access$1000(RecyclerView recyclerView) {
        recyclerView.postAnimationRunner();
    }

    static void access$6000(RecyclerView recyclerView, int i) {
        recyclerView.jumpToPositionForSmoothScroller(i);
    }

    static RecyclerListener access$5100(RecyclerView recyclerView) {
        return recyclerView.mRecyclerListener;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void repositionShadowingViews() {
        /*
        r8 = this;
        r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r8.mChildHelper;
        r2 = r0.getChildCount();
        r0 = 0;
    L_0x0009:
        if (r0 >= r2) goto L_0x0044;
    L_0x000b:
        r3 = r8.mChildHelper;
        r3 = r3.getChildAt(r0);
        r4 = r8.getChildViewHolder(r3);
        if (r4 == 0) goto L_0x0040;
    L_0x0017:
        r5 = r4.mShadowingHolder;	 Catch:{ IllegalStateException -> 0x0045 }
        if (r5 == 0) goto L_0x0040;
    L_0x001b:
        r4 = r4.mShadowingHolder;
        r4 = r4.itemView;
        r5 = r3.getLeft();
        r3 = r3.getTop();
        r6 = r4.getLeft();	 Catch:{ IllegalStateException -> 0x0047 }
        if (r5 != r6) goto L_0x0033;
    L_0x002d:
        r6 = r4.getTop();	 Catch:{ IllegalStateException -> 0x0049 }
        if (r3 == r6) goto L_0x0040;
    L_0x0033:
        r6 = r4.getWidth();	 Catch:{ IllegalStateException -> 0x0049 }
        r6 = r6 + r5;
        r7 = r4.getHeight();	 Catch:{ IllegalStateException -> 0x0049 }
        r7 = r7 + r3;
        r4.layout(r5, r3, r6, r7);	 Catch:{ IllegalStateException -> 0x0049 }
    L_0x0040:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0009;
    L_0x0044:
        return;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.repositionShadowingViews():void");
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            super.onSizeChanged(i, i2, i3, i4);
            if (i != i3 || i2 != i4) {
                invalidateGlows();
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        try {
            if (this.mItemAnimator != null) {
                if (this.mLayout.supportsPredictiveItemAnimations()) {
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

    static void access$3200(RecyclerView recyclerView) {
        recyclerView.onExitLayoutOrScroll();
    }

    public int getBaseline() {
        try {
            return this.mLayout != null ? this.mLayout.getBaseline() : super.getBaseline();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fling(int r7, int r8) {
        /*
        r6 = this;
        r2 = 1;
        r1 = 0;
        r0 = r6.mLayout;	 Catch:{ IllegalStateException -> 0x0016 }
        if (r0 != 0) goto L_0x0018;
    L_0x0006:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0016 }
        r2 = 31;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0016 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0016 }
        r3 = 32;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0016 }
        android.util.Log.e(r0, r2);	 Catch:{ IllegalStateException -> 0x0016 }
    L_0x0015:
        return r1;
    L_0x0016:
        r0 = move-exception;
        throw r0;
    L_0x0018:
        r0 = r6.mLayoutFrozen;	 Catch:{ IllegalStateException -> 0x0077 }
        if (r0 != 0) goto L_0x0015;
    L_0x001c:
        r0 = r6.mLayout;
        r0 = r0.canScrollHorizontally();
        r3 = r6.mLayout;
        r3 = r3.canScrollVertically();
        if (r0 == 0) goto L_0x0032;
    L_0x002a:
        r4 = java.lang.Math.abs(r7);	 Catch:{ IllegalStateException -> 0x0079 }
        r5 = r6.mMinFlingVelocity;	 Catch:{ IllegalStateException -> 0x0079 }
        if (r4 >= r5) goto L_0x0033;
    L_0x0032:
        r7 = r1;
    L_0x0033:
        if (r3 == 0) goto L_0x003d;
    L_0x0035:
        r4 = java.lang.Math.abs(r8);	 Catch:{ IllegalStateException -> 0x007b }
        r5 = r6.mMinFlingVelocity;	 Catch:{ IllegalStateException -> 0x007b }
        if (r4 >= r5) goto L_0x003e;
    L_0x003d:
        r8 = r1;
    L_0x003e:
        if (r7 != 0) goto L_0x0042;
    L_0x0040:
        if (r8 == 0) goto L_0x0015;
    L_0x0042:
        r4 = (float) r7;
        r5 = (float) r8;
        r4 = r6.dispatchNestedPreFling(r4, r5);	 Catch:{ IllegalStateException -> 0x007d }
        if (r4 != 0) goto L_0x0015;
    L_0x004a:
        if (r0 != 0) goto L_0x004e;
    L_0x004c:
        if (r3 == 0) goto L_0x0083;
    L_0x004e:
        r0 = r2;
    L_0x004f:
        r3 = (float) r7;
        r4 = (float) r8;
        r6.dispatchNestedFling(r3, r4, r0);
        if (r0 == 0) goto L_0x0015;
    L_0x0056:
        r0 = r6.mMaxFlingVelocity;
        r0 = -r0;
        r1 = r6.mMaxFlingVelocity;
        r1 = java.lang.Math.min(r7, r1);
        r0 = java.lang.Math.max(r0, r1);
        r1 = r6.mMaxFlingVelocity;
        r1 = -r1;
        r3 = r6.mMaxFlingVelocity;
        r3 = java.lang.Math.min(r8, r3);
        r1 = java.lang.Math.max(r1, r3);
        r3 = r6.mViewFlinger;
        r3.fling(r0, r1);
        r1 = r2;
        goto L_0x0015;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = r1;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.fling(int, int):boolean");
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            if (this.mLayout != null) {
                return this.mLayout.generateLayoutParams(layoutParams);
            }
            throw new IllegalStateException(z[25]);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static Interpolator access$2800() {
        return sQuinticInterpolator;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void defaultOnMeasure(int r6, int r7) {
        /*
        r5 = this;
        r2 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r3 = android.view.View.MeasureSpec.getMode(r6);
        r4 = android.view.View.MeasureSpec.getMode(r7);
        r1 = android.view.View.MeasureSpec.getSize(r6);
        r0 = android.view.View.MeasureSpec.getSize(r7);
        switch(r3) {
            case -2147483648: goto L_0x0024;
            case 1073741824: goto L_0x0024;
            default: goto L_0x0015;
        };
    L_0x0015:
        r1 = android.support.v4.view.ViewCompat.getMinimumWidth(r5);
    L_0x0019:
        switch(r4) {
            case -2147483648: goto L_0x0027;
            case 1073741824: goto L_0x0027;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = android.support.v4.view.ViewCompat.getMinimumHeight(r5);
    L_0x0020:
        r5.setMeasuredDimension(r1, r0);
        return;
    L_0x0024:
        if (r2 == 0) goto L_0x0019;
    L_0x0026:
        goto L_0x0015;
    L_0x0027:
        if (r2 == 0) goto L_0x0020;
    L_0x0029:
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.defaultOnMeasure(int, int):void");
    }

    public boolean hasPendingAdapterUpdates() {
        try {
            if (this.mFirstLayoutComplete) {
                if (!this.mDataSetHasChangedAfterLayout) {
                    try {
                        if (!this.mAdapterHelper.hasPendingUpdates()) {
                            return false;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
            return true;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new 6(this));
    }

    private void setAdapterInternal(Adapter adapter, boolean z, boolean z2) {
        try {
            if (this.mAdapter != null) {
                this.mAdapter.unregisterAdapterDataObserver(this.mObserver);
                this.mAdapter.onDetachedFromRecyclerView(this);
            }
            if (!z || z2) {
                try {
                    if (this.mItemAnimator != null) {
                        this.mItemAnimator.endAnimations();
                    }
                    try {
                        if (this.mLayout != null) {
                            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
                            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
                        }
                        this.mRecycler.clear();
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            this.mAdapterHelper.reset();
            Adapter adapter2 = this.mAdapter;
            try {
                this.mAdapter = adapter;
                if (adapter != null) {
                    adapter.registerAdapterDataObserver(this.mObserver);
                    adapter.onAttachedToRecyclerView(this);
                }
                try {
                    if (this.mLayout != null) {
                        this.mLayout.onAdapterChanged(adapter2, this.mAdapter);
                    }
                    this.mRecycler.onAdapterChanged(adapter2, this.mAdapter, z);
                    State.access$1902(this.mState, true);
                    markKnownViewsInvalid();
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    static boolean access$6200(RecyclerView recyclerView, View view) {
        return recyclerView.removeAnimatingView(view);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean dispatchOnItemTouch(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r2 = 0;
        r1 = 1;
        r4 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r8.getAction();
        r3 = r7.mActiveOnItemTouchListener;	 Catch:{ IllegalStateException -> 0x0022 }
        if (r3 == 0) goto L_0x002c;
    L_0x000c:
        if (r0 != 0) goto L_0x0013;
    L_0x000e:
        r3 = 0;
        r7.mActiveOnItemTouchListener = r3;	 Catch:{ IllegalStateException -> 0x0026 }
        if (r4 == 0) goto L_0x002c;
    L_0x0013:
        r2 = r7.mActiveOnItemTouchListener;	 Catch:{ IllegalStateException -> 0x0028 }
        r2.onTouchEvent(r7, r8);	 Catch:{ IllegalStateException -> 0x0028 }
        r2 = 3;
        if (r0 == r2) goto L_0x001d;
    L_0x001b:
        if (r0 != r1) goto L_0x0020;
    L_0x001d:
        r0 = 0;
        r7.mActiveOnItemTouchListener = r0;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x0020:
        r0 = r1;
    L_0x0021:
        return r0;
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        if (r0 == 0) goto L_0x004f;
    L_0x002e:
        r0 = r7.mOnItemTouchListeners;
        r5 = r0.size();
        r3 = r2;
    L_0x0035:
        if (r3 >= r5) goto L_0x004f;
    L_0x0037:
        r0 = r7.mOnItemTouchListeners;
        r0 = r0.get(r3);
        r0 = (android.support.v7.widget.RecyclerView.OnItemTouchListener) r0;
        r6 = r0.onInterceptTouchEvent(r7, r8);	 Catch:{ IllegalStateException -> 0x0049 }
        if (r6 == 0) goto L_0x004b;
    L_0x0045:
        r7.mActiveOnItemTouchListener = r0;	 Catch:{ IllegalStateException -> 0x0049 }
        r0 = r1;
        goto L_0x0021;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x0051;
    L_0x004f:
        r0 = r2;
        goto L_0x0021;
    L_0x0051:
        r3 = r0;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.dispatchOnItemTouch(android.view.MotionEvent):boolean");
    }

    private String getFullClassName(Context context, String str) {
        try {
            if (str.charAt(0) == '.') {
                return context.getPackageName() + str;
            }
            try {
                if (str.contains(".")) {
                    return str;
                }
                return RecyclerView.class.getPackage().getName() + '.' + str;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w(z[9], z[10]);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            if (layoutParams instanceof LayoutParams) {
                if (this.mLayout.checkLayoutParams((LayoutParams) layoutParams)) {
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

    static void access$3700(RecyclerView recyclerView, int i) {
        recyclerView.setScrollState(i);
    }

    static void access$3500(RecyclerView recyclerView, int i, int i2) {
        recyclerView.considerReleasingGlowsOnScroll(i, i2);
    }

    static boolean access$302(RecyclerView recyclerView, boolean z) {
        recyclerView.mLayoutRequestEaten = z;
        return z;
    }

    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            if (this.mItemAnimator != null) {
                this.mItemAnimator.endAnimations();
            }
            try {
                this.mFirstLayoutComplete = false;
                stopScroll();
                this.mIsAttached = false;
                if (this.mLayout != null) {
                    this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
                }
                removeCallbacks(this.mItemAnimatorRunner);
                this.mViewInfoStore.onDetach();
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void stopNestedScroll() {
        this.mScrollingChildHelper.stopNestedScroll();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        try {
            this.mPendingSavedState = (SavedState) parcelable;
            super.onRestoreInstanceState(this.mPendingSavedState.getSuperState());
            if (this.mLayout == null) {
                return;
            }
            if (this.mPendingSavedState.mLayoutState != null) {
                this.mLayout.onRestoreInstanceState(this.mPendingSavedState.mLayoutState);
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean scrollByInternal(int r12, int r13, android.view.MotionEvent r14) {
        /*
        r11 = this;
        r7 = 1;
        r6 = 0;
        r11.consumePendingUpdateOperations();	 Catch:{ IllegalStateException -> 0x00c8 }
        r0 = r11.mAdapter;	 Catch:{ IllegalStateException -> 0x00c8 }
        if (r0 == 0) goto L_0x00e2;
    L_0x0009:
        r11.eatRequestLayout();	 Catch:{ IllegalStateException -> 0x00c8 }
        r11.onEnterLayoutOrScroll();	 Catch:{ IllegalStateException -> 0x00c8 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x00c8 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x00c8 }
        android.support.v4.os.TraceCompat.beginSection(r0);	 Catch:{ IllegalStateException -> 0x00c8 }
        if (r12 == 0) goto L_0x00de;
    L_0x0019:
        r0 = r11.mLayout;
        r1 = r11.mRecycler;
        r2 = r11.mState;
        r2 = r0.scrollHorizontallyBy(r12, r1, r2);
        r3 = r12 - r2;
    L_0x0025:
        if (r13 == 0) goto L_0x00da;
    L_0x0027:
        r0 = r11.mLayout;
        r1 = r11.mRecycler;
        r4 = r11.mState;
        r0 = r0.scrollVerticallyBy(r13, r1, r4);
        r1 = r13 - r0;
    L_0x0033:
        android.support.v4.os.TraceCompat.endSection();
        r11.repositionShadowingViews();
        r11.onExitLayoutOrScroll();
        r11.resumeRequestLayout(r6);
        r4 = r1;
        r1 = r2;
        r2 = r0;
    L_0x0042:
        r0 = r11.mItemDecorations;	 Catch:{ IllegalStateException -> 0x00ca }
        r0 = r0.isEmpty();	 Catch:{ IllegalStateException -> 0x00ca }
        if (r0 != 0) goto L_0x004d;
    L_0x004a:
        r11.invalidate();	 Catch:{ IllegalStateException -> 0x00ca }
    L_0x004d:
        r5 = r11.mScrollOffset;	 Catch:{ IllegalStateException -> 0x00cc }
        r0 = r11;
        r0 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5);	 Catch:{ IllegalStateException -> 0x00cc }
        if (r0 == 0) goto L_0x0099;
    L_0x0056:
        r0 = r11.mLastTouchX;	 Catch:{ IllegalStateException -> 0x00ce }
        r5 = r11.mScrollOffset;	 Catch:{ IllegalStateException -> 0x00ce }
        r8 = 0;
        r5 = r5[r8];	 Catch:{ IllegalStateException -> 0x00ce }
        r0 = r0 - r5;
        r11.mLastTouchX = r0;	 Catch:{ IllegalStateException -> 0x00ce }
        r0 = r11.mLastTouchY;	 Catch:{ IllegalStateException -> 0x00ce }
        r5 = r11.mScrollOffset;	 Catch:{ IllegalStateException -> 0x00ce }
        r8 = 1;
        r5 = r5[r8];	 Catch:{ IllegalStateException -> 0x00ce }
        r0 = r0 - r5;
        r11.mLastTouchY = r0;	 Catch:{ IllegalStateException -> 0x00ce }
        if (r14 == 0) goto L_0x007b;
    L_0x006c:
        r0 = r11.mScrollOffset;	 Catch:{ IllegalStateException -> 0x00ce }
        r5 = 0;
        r0 = r0[r5];	 Catch:{ IllegalStateException -> 0x00ce }
        r0 = (float) r0;	 Catch:{ IllegalStateException -> 0x00ce }
        r5 = r11.mScrollOffset;	 Catch:{ IllegalStateException -> 0x00ce }
        r8 = 1;
        r5 = r5[r8];	 Catch:{ IllegalStateException -> 0x00ce }
        r5 = (float) r5;	 Catch:{ IllegalStateException -> 0x00ce }
        r14.offsetLocation(r0, r5);	 Catch:{ IllegalStateException -> 0x00ce }
    L_0x007b:
        r0 = r11.mNestedOffsets;	 Catch:{ IllegalStateException -> 0x00d0 }
        r5 = 0;
        r8 = r0[r5];	 Catch:{ IllegalStateException -> 0x00d0 }
        r9 = r11.mScrollOffset;	 Catch:{ IllegalStateException -> 0x00d0 }
        r10 = 0;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x00d0 }
        r8 = r8 + r9;
        r0[r5] = r8;	 Catch:{ IllegalStateException -> 0x00d0 }
        r0 = r11.mNestedOffsets;	 Catch:{ IllegalStateException -> 0x00d0 }
        r5 = 1;
        r8 = r0[r5];	 Catch:{ IllegalStateException -> 0x00d0 }
        r9 = r11.mScrollOffset;	 Catch:{ IllegalStateException -> 0x00d0 }
        r10 = 1;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x00d0 }
        r8 = r8 + r9;
        r0[r5] = r8;	 Catch:{ IllegalStateException -> 0x00d0 }
        r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IllegalStateException -> 0x00d0 }
        if (r0 == 0) goto L_0x00b2;
    L_0x0099:
        r0 = android.support.v4.view.ViewCompat.getOverScrollMode(r11);	 Catch:{ IllegalStateException -> 0x00d2 }
        r5 = 2;
        if (r0 == r5) goto L_0x00b2;
    L_0x00a0:
        if (r14 == 0) goto L_0x00af;
    L_0x00a2:
        r0 = r14.getX();	 Catch:{ IllegalStateException -> 0x00d4 }
        r3 = (float) r3;	 Catch:{ IllegalStateException -> 0x00d4 }
        r5 = r14.getY();	 Catch:{ IllegalStateException -> 0x00d4 }
        r4 = (float) r4;	 Catch:{ IllegalStateException -> 0x00d4 }
        r11.pullGlows(r0, r3, r5, r4);	 Catch:{ IllegalStateException -> 0x00d4 }
    L_0x00af:
        r11.considerReleasingGlowsOnScroll(r12, r13);
    L_0x00b2:
        if (r1 != 0) goto L_0x00b6;
    L_0x00b4:
        if (r2 == 0) goto L_0x00b9;
    L_0x00b6:
        r11.dispatchOnScrolled(r1, r2);	 Catch:{ IllegalStateException -> 0x00d6 }
    L_0x00b9:
        r0 = r11.awakenScrollBars();	 Catch:{ IllegalStateException -> 0x00d8 }
        if (r0 != 0) goto L_0x00c2;
    L_0x00bf:
        r11.invalidate();	 Catch:{ IllegalStateException -> 0x00d8 }
    L_0x00c2:
        if (r1 != 0) goto L_0x00c6;
    L_0x00c4:
        if (r2 == 0) goto L_0x00c7;
    L_0x00c6:
        r6 = r7;
    L_0x00c7:
        return r6;
    L_0x00c8:
        r0 = move-exception;
        throw r0;
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r0 = r6;
        r1 = r6;
        goto L_0x0033;
    L_0x00de:
        r2 = r6;
        r3 = r6;
        goto L_0x0025;
    L_0x00e2:
        r2 = r6;
        r1 = r6;
        r4 = r6;
        r3 = r6;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.scrollByInternal(int, int, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r9, float r10, float r11, float r12) {
        /*
        r8 = this;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 1;
        r6 = 0;
        r2 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r1 = 0;
        r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r3 >= 0) goto L_0x0029;
    L_0x000b:
        r8.ensureLeftGlow();	 Catch:{ IllegalStateException -> 0x0094 }
        r3 = r8.mLeftGlow;	 Catch:{ IllegalStateException -> 0x0094 }
        r4 = -r10;
        r5 = r8.getWidth();	 Catch:{ IllegalStateException -> 0x0094 }
        r5 = (float) r5;	 Catch:{ IllegalStateException -> 0x0094 }
        r4 = r4 / r5;
        r5 = r8.getHeight();	 Catch:{ IllegalStateException -> 0x0094 }
        r5 = (float) r5;	 Catch:{ IllegalStateException -> 0x0094 }
        r5 = r11 / r5;
        r5 = r7 - r5;
        r3 = r3.onPull(r4, r5);	 Catch:{ IllegalStateException -> 0x0094 }
        if (r3 == 0) goto L_0x0047;
    L_0x0026:
        if (r2 == 0) goto L_0x00a0;
    L_0x0028:
        r1 = r0;
    L_0x0029:
        r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x0047;
    L_0x002d:
        r8.ensureRightGlow();	 Catch:{ IllegalStateException -> 0x0096 }
        r3 = r8.mRightGlow;	 Catch:{ IllegalStateException -> 0x0096 }
        r4 = r8.getWidth();	 Catch:{ IllegalStateException -> 0x0096 }
        r4 = (float) r4;	 Catch:{ IllegalStateException -> 0x0096 }
        r4 = r10 / r4;
        r5 = r8.getHeight();	 Catch:{ IllegalStateException -> 0x0096 }
        r5 = (float) r5;	 Catch:{ IllegalStateException -> 0x0096 }
        r5 = r11 / r5;
        r3 = r3.onPull(r4, r5);	 Catch:{ IllegalStateException -> 0x0096 }
        if (r3 == 0) goto L_0x0047;
    L_0x0046:
        r1 = r0;
    L_0x0047:
        r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r3 >= 0) goto L_0x0067;
    L_0x004b:
        r8.ensureTopGlow();	 Catch:{ IllegalStateException -> 0x0098 }
        r3 = r8.mTopGlow;	 Catch:{ IllegalStateException -> 0x0098 }
        r4 = -r12;
        r5 = r8.getHeight();	 Catch:{ IllegalStateException -> 0x0098 }
        r5 = (float) r5;	 Catch:{ IllegalStateException -> 0x0098 }
        r4 = r4 / r5;
        r5 = r8.getWidth();	 Catch:{ IllegalStateException -> 0x0098 }
        r5 = (float) r5;	 Catch:{ IllegalStateException -> 0x0098 }
        r5 = r9 / r5;
        r3 = r3.onPull(r4, r5);	 Catch:{ IllegalStateException -> 0x0098 }
        if (r3 == 0) goto L_0x009e;
    L_0x0064:
        if (r2 == 0) goto L_0x0086;
    L_0x0066:
        r1 = r0;
    L_0x0067:
        r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x009e;
    L_0x006b:
        r8.ensureBottomGlow();	 Catch:{ IllegalStateException -> 0x009a }
        r2 = r8.mBottomGlow;	 Catch:{ IllegalStateException -> 0x009a }
        r3 = r8.getHeight();	 Catch:{ IllegalStateException -> 0x009a }
        r3 = (float) r3;	 Catch:{ IllegalStateException -> 0x009a }
        r3 = r12 / r3;
        r4 = r8.getWidth();	 Catch:{ IllegalStateException -> 0x009a }
        r4 = (float) r4;	 Catch:{ IllegalStateException -> 0x009a }
        r4 = r9 / r4;
        r4 = r7 - r4;
        r2 = r2.onPull(r3, r4);	 Catch:{ IllegalStateException -> 0x009a }
        if (r2 == 0) goto L_0x009e;
    L_0x0086:
        if (r0 != 0) goto L_0x0090;
    L_0x0088:
        r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x0090;
    L_0x008c:
        r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x0093;
    L_0x0090:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r8);	 Catch:{ IllegalStateException -> 0x009c }
    L_0x0093:
        return;
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r0 = move-exception;
        throw r0;
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = r1;
        goto L_0x0086;
    L_0x00a0:
        r1 = r0;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private boolean dispatchOnItemTouchIntercept(MotionEvent motionEvent) {
        int i = ViewHolder.a;
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            try {
                this.mActiveOnItemTouchListener = null;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        int size = this.mOnItemTouchListeners.size();
        int i2 = 0;
        while (i2 < size) {
            OnItemTouchListener onItemTouchListener = (OnItemTouchListener) this.mOnItemTouchListeners.get(i2);
            try {
                if (!onItemTouchListener.onInterceptTouchEvent(this, motionEvent) || action == 3) {
                    int i3 = i2 + 1;
                    if (i != 0) {
                        break;
                    }
                    i2 = i3;
                } else {
                    this.mActiveOnItemTouchListener = onItemTouchListener;
                    return true;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        return false;
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.mScrollingChildHelper.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    void markItemDecorInsetsDirty() {
        int i = ViewHolder.a;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i2 = 0;
        while (i2 < unfilteredChildCount) {
            ((LayoutParams) this.mChildHelper.getUnfilteredChildAt(i2).getLayoutParams()).mInsetsDirty = true;
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        this.mRecycler.markItemDecorInsetsDirty();
    }

    public int computeVerticalScrollOffset() {
        try {
            return this.mLayout.canScrollVertically() ? this.mLayout.computeVerticalScrollOffset(this.mState) : 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void dispatchChildDetached(View view) {
        int i = ViewHolder.a;
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        try {
            onChildDetachedFromWindow(view);
            if (!(this.mAdapter == null || childViewHolderInt == null)) {
                this.mAdapter.onViewDetachedFromWindow(childViewHolderInt);
            }
            if (this.mOnChildAttachStateListeners != null) {
                int size = this.mOnChildAttachStateListeners.size() - 1;
                while (size >= 0) {
                    ((OnChildAttachStateChangeListener) this.mOnChildAttachStateListeners.get(size)).onChildViewDetachedFromWindow(view);
                    int i2 = size - 1;
                    if (i == 0) {
                        size = i2;
                    } else {
                        return;
                    }
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void cancelTouch() {
        resetTouch();
        setScrollState(0);
    }

    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    static boolean access$100(RecyclerView recyclerView) {
        return recyclerView.mFirstLayoutComplete;
    }

    static void access$1400(RecyclerView recyclerView, View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        recyclerView.attachViewToParent(view, i, layoutParams);
    }

    void markKnownViewsInvalid() {
        int i = ViewHolder.a;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i2 = 0;
        while (i2 < unfilteredChildCount) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i2));
            if (childViewHolderInt != null) {
                try {
                    if (!childViewHolderInt.shouldIgnore()) {
                        childViewHolderInt.addFlags(6);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.markKnownViewsInvalid();
    }

    void ensureLeftGlow() {
        try {
            if (this.mLeftGlow == null) {
                try {
                    this.mLeftGlow = new EdgeEffectCompat(getContext());
                    if (this.mClipToPadding) {
                        this.mLeftGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        if (ViewHolder.a == 0) {
                            return;
                        }
                    }
                    this.mLeftGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    void saveOldPositions() {
        int i = ViewHolder.a;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i2 = 0;
        while (i2 < unfilteredChildCount) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i2));
            try {
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.saveOldPosition();
                }
                i2++;
                if (i != 0) {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    public boolean isComputingLayout() {
        try {
            return this.mLayoutOrScrollCounter > 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int computeVerticalScrollRange() {
        try {
            return this.mLayout.canScrollVertically() ? this.mLayout.computeVerticalScrollRange(this.mState) : 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static ViewFlinger access$5700(RecyclerView recyclerView) {
        return recyclerView.mViewFlinger;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        try {
            if (this.mLayout != null) {
                return this.mLayout.generateDefaultLayoutParams();
            }
            throw new IllegalStateException(z[8]);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
        r14 = this;
        r4 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r14.mLayoutFrozen;	 Catch:{ IllegalStateException -> 0x000c }
        if (r0 != 0) goto L_0x000a;
    L_0x0006:
        r0 = r14.mIgnoreMotionEventTillDown;	 Catch:{ IllegalStateException -> 0x000e }
        if (r0 == 0) goto L_0x0010;
    L_0x000a:
        r0 = 0;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x000e }
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = r14.dispatchOnItemTouch(r15);	 Catch:{ IllegalStateException -> 0x001b }
        if (r0 == 0) goto L_0x001d;
    L_0x0016:
        r14.cancelTouch();	 Catch:{ IllegalStateException -> 0x001b }
        r0 = 1;
        goto L_0x000b;
    L_0x001b:
        r0 = move-exception;
        throw r0;
    L_0x001d:
        r0 = r14.mLayout;	 Catch:{ IllegalStateException -> 0x0023 }
        if (r0 != 0) goto L_0x0025;
    L_0x0021:
        r0 = 0;
        goto L_0x000b;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r0 = r14.mLayout;
        r5 = r0.canScrollHorizontally();
        r0 = r14.mLayout;
        r6 = r0.canScrollVertically();
        r0 = r14.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x0074 }
        if (r0 != 0) goto L_0x003b;
    L_0x0035:
        r0 = android.view.VelocityTracker.obtain();	 Catch:{ IllegalStateException -> 0x0074 }
        r14.mVelocityTracker = r0;	 Catch:{ IllegalStateException -> 0x0074 }
    L_0x003b:
        r2 = 0;
        r7 = android.view.MotionEvent.obtain(r15);
        r0 = android.support.v4.view.MotionEventCompat.getActionMasked(r15);
        r1 = android.support.v4.view.MotionEventCompat.getActionIndex(r15);
        if (r0 != 0) goto L_0x0055;
    L_0x004a:
        r3 = r14.mNestedOffsets;	 Catch:{ IllegalStateException -> 0x0076 }
        r8 = 0;
        r9 = r14.mNestedOffsets;	 Catch:{ IllegalStateException -> 0x0076 }
        r10 = 1;
        r11 = 0;
        r9[r10] = r11;	 Catch:{ IllegalStateException -> 0x0076 }
        r3[r8] = r11;	 Catch:{ IllegalStateException -> 0x0076 }
    L_0x0055:
        r3 = r14.mNestedOffsets;
        r8 = 0;
        r3 = r3[r8];
        r3 = (float) r3;
        r8 = r14.mNestedOffsets;
        r9 = 1;
        r8 = r8[r9];
        r8 = (float) r8;
        r7.offsetLocation(r3, r8);
        switch(r0) {
            case 0: goto L_0x0078;
            case 1: goto L_0x01b8;
            case 2: goto L_0x00c4;
            case 3: goto L_0x01f9;
            case 4: goto L_0x0067;
            case 5: goto L_0x00a4;
            case 6: goto L_0x01b3;
            default: goto L_0x0067;
        };
    L_0x0067:
        r0 = r2;
    L_0x0068:
        if (r0 != 0) goto L_0x006f;
    L_0x006a:
        r0 = r14.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x021d }
        r0.addMovement(r7);	 Catch:{ IllegalStateException -> 0x021d }
    L_0x006f:
        r7.recycle();
        r0 = 1;
        goto L_0x000b;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = 0;
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r15, r0);
        r14.mScrollPointerId = r0;
        r0 = r15.getX();
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r3;
        r0 = (int) r0;
        r14.mLastTouchX = r0;
        r14.mInitialTouchX = r0;
        r0 = r15.getY();
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r3;
        r0 = (int) r0;
        r14.mLastTouchY = r0;
        r14.mInitialTouchY = r0;
        r0 = 0;
        if (r5 == 0) goto L_0x009b;
    L_0x009a:
        r0 = 1;
    L_0x009b:
        if (r6 == 0) goto L_0x009f;
    L_0x009d:
        r0 = r0 | 2;
    L_0x009f:
        r14.startNestedScroll(r0);	 Catch:{ IllegalStateException -> 0x00f8 }
        if (r4 == 0) goto L_0x0067;
    L_0x00a4:
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r15, r1);	 Catch:{ IllegalStateException -> 0x00f8 }
        r14.mScrollPointerId = r0;	 Catch:{ IllegalStateException -> 0x00f8 }
        r0 = android.support.v4.view.MotionEventCompat.getX(r15, r1);	 Catch:{ IllegalStateException -> 0x00f8 }
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r3;
        r0 = (int) r0;	 Catch:{ IllegalStateException -> 0x00f8 }
        r14.mLastTouchX = r0;	 Catch:{ IllegalStateException -> 0x00f8 }
        r14.mInitialTouchX = r0;	 Catch:{ IllegalStateException -> 0x00f8 }
        r0 = android.support.v4.view.MotionEventCompat.getY(r15, r1);	 Catch:{ IllegalStateException -> 0x00f8 }
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r0 = (int) r0;	 Catch:{ IllegalStateException -> 0x00f8 }
        r14.mLastTouchY = r0;	 Catch:{ IllegalStateException -> 0x00f8 }
        r14.mInitialTouchY = r0;	 Catch:{ IllegalStateException -> 0x00f8 }
        if (r4 == 0) goto L_0x0067;
    L_0x00c4:
        r0 = r14.mScrollPointerId;
        r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r15, r0);
        if (r0 >= 0) goto L_0x00fc;
    L_0x00cc:
        r0 = z;	 Catch:{ IllegalStateException -> 0x00fa }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x00fa }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00fa }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00fa }
        r2 = z;	 Catch:{ IllegalStateException -> 0x00fa }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00fa }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00fa }
        r2 = r14.mScrollPointerId;	 Catch:{ IllegalStateException -> 0x00fa }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00fa }
        r2 = z;	 Catch:{ IllegalStateException -> 0x00fa }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00fa }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00fa }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x00fa }
        android.util.Log.e(r0, r1);	 Catch:{ IllegalStateException -> 0x00fa }
        r0 = 0;
        goto L_0x000b;
    L_0x00f8:
        r0 = move-exception;
        throw r0;
    L_0x00fa:
        r0 = move-exception;
        throw r0;
    L_0x00fc:
        r1 = android.support.v4.view.MotionEventCompat.getX(r15, r0);
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r1 + r3;
        r8 = (int) r1;
        r0 = android.support.v4.view.MotionEventCompat.getY(r15, r0);
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r9 = (int) r0;
        r0 = r14.mLastTouchX;
        r1 = r0 - r8;
        r0 = r14.mLastTouchY;
        r0 = r0 - r9;
        r3 = r14.mScrollConsumed;
        r10 = r14.mScrollOffset;
        r3 = r14.dispatchNestedPreScroll(r1, r0, r3, r10);
        if (r3 == 0) goto L_0x0152;
    L_0x011d:
        r3 = r14.mScrollConsumed;
        r10 = 0;
        r3 = r3[r10];
        r1 = r1 - r3;
        r3 = r14.mScrollConsumed;
        r10 = 1;
        r3 = r3[r10];
        r0 = r0 - r3;
        r3 = r14.mScrollOffset;
        r10 = 0;
        r3 = r3[r10];
        r3 = (float) r3;
        r10 = r14.mScrollOffset;
        r11 = 1;
        r10 = r10[r11];
        r10 = (float) r10;
        r7.offsetLocation(r3, r10);
        r3 = r14.mNestedOffsets;
        r10 = 0;
        r11 = r3[r10];
        r12 = r14.mScrollOffset;
        r13 = 0;
        r12 = r12[r13];
        r11 = r11 + r12;
        r3[r10] = r11;
        r3 = r14.mNestedOffsets;
        r10 = 1;
        r11 = r3[r10];
        r12 = r14.mScrollOffset;
        r13 = 1;
        r12 = r12[r13];
        r11 = r11 + r12;
        r3[r10] = r11;
    L_0x0152:
        r3 = r14.mScrollState;
        r10 = 1;
        if (r3 == r10) goto L_0x0188;
    L_0x0157:
        r3 = 0;
        if (r5 == 0) goto L_0x016d;
    L_0x015a:
        r10 = java.lang.Math.abs(r1);	 Catch:{ IllegalStateException -> 0x0201 }
        r11 = r14.mTouchSlop;	 Catch:{ IllegalStateException -> 0x0201 }
        if (r10 <= r11) goto L_0x016d;
    L_0x0162:
        if (r1 <= 0) goto L_0x0169;
    L_0x0164:
        r3 = r14.mTouchSlop;
        r1 = r1 - r3;
        if (r4 == 0) goto L_0x016c;
    L_0x0169:
        r3 = r14.mTouchSlop;
        r1 = r1 + r3;
    L_0x016c:
        r3 = 1;
    L_0x016d:
        if (r6 == 0) goto L_0x0182;
    L_0x016f:
        r10 = java.lang.Math.abs(r0);	 Catch:{ IllegalStateException -> 0x0203 }
        r11 = r14.mTouchSlop;	 Catch:{ IllegalStateException -> 0x0203 }
        if (r10 <= r11) goto L_0x0182;
    L_0x0177:
        if (r0 <= 0) goto L_0x017e;
    L_0x0179:
        r3 = r14.mTouchSlop;
        r0 = r0 - r3;
        if (r4 == 0) goto L_0x0181;
    L_0x017e:
        r3 = r14.mTouchSlop;
        r0 = r0 + r3;
    L_0x0181:
        r3 = 1;
    L_0x0182:
        if (r3 == 0) goto L_0x0188;
    L_0x0184:
        r3 = 1;
        r14.setScrollState(r3);	 Catch:{ IllegalStateException -> 0x0205 }
    L_0x0188:
        r3 = r14.mScrollState;	 Catch:{ IllegalStateException -> 0x0207 }
        r10 = 1;
        if (r3 != r10) goto L_0x01b1;
    L_0x018d:
        r3 = r14.mScrollOffset;	 Catch:{ IllegalStateException -> 0x0209 }
        r10 = 0;
        r3 = r3[r10];	 Catch:{ IllegalStateException -> 0x0209 }
        r3 = r8 - r3;
        r14.mLastTouchX = r3;	 Catch:{ IllegalStateException -> 0x0209 }
        r3 = r14.mScrollOffset;	 Catch:{ IllegalStateException -> 0x0209 }
        r8 = 1;
        r3 = r3[r8];	 Catch:{ IllegalStateException -> 0x0209 }
        r3 = r9 - r3;
        r14.mLastTouchY = r3;	 Catch:{ IllegalStateException -> 0x0209 }
        if (r5 == 0) goto L_0x020b;
    L_0x01a1:
        if (r6 == 0) goto L_0x020d;
    L_0x01a3:
        r0 = r14.scrollByInternal(r1, r0, r7);	 Catch:{ IllegalStateException -> 0x020f }
        if (r0 == 0) goto L_0x01b1;
    L_0x01a9:
        r0 = r14.getParent();	 Catch:{ IllegalStateException -> 0x020f }
        r1 = 1;
        r0.requestDisallowInterceptTouchEvent(r1);	 Catch:{ IllegalStateException -> 0x020f }
    L_0x01b1:
        if (r4 == 0) goto L_0x0067;
    L_0x01b3:
        r14.onPointerUp(r15);	 Catch:{ IllegalStateException -> 0x0211 }
        if (r4 == 0) goto L_0x0067;
    L_0x01b8:
        r0 = r14.mVelocityTracker;
        r0.addMovement(r7);
        r2 = 1;
        r0 = r14.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x0213 }
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r14.mMaxFlingVelocity;	 Catch:{ IllegalStateException -> 0x0213 }
        r3 = (float) r3;	 Catch:{ IllegalStateException -> 0x0213 }
        r0.computeCurrentVelocity(r1, r3);	 Catch:{ IllegalStateException -> 0x0213 }
        if (r5 == 0) goto L_0x0215;
    L_0x01ca:
        r0 = r14.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x0213 }
        r1 = r14.mScrollPointerId;	 Catch:{ IllegalStateException -> 0x0213 }
        r0 = android.support.v4.view.VelocityTrackerCompat.getXVelocity(r0, r1);	 Catch:{ IllegalStateException -> 0x0213 }
        r0 = -r0;
    L_0x01d3:
        if (r6 == 0) goto L_0x0219;
    L_0x01d5:
        r1 = r14.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x0217 }
        r3 = r14.mScrollPointerId;	 Catch:{ IllegalStateException -> 0x0217 }
        r1 = android.support.v4.view.VelocityTrackerCompat.getYVelocity(r1, r3);	 Catch:{ IllegalStateException -> 0x0217 }
        r1 = -r1;
    L_0x01de:
        r3 = 0;
        r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r3 != 0) goto L_0x01e8;
    L_0x01e3:
        r3 = 0;
        r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r3 == 0) goto L_0x01f0;
    L_0x01e8:
        r0 = (int) r0;
        r1 = (int) r1;
        r0 = r14.fling(r0, r1);	 Catch:{ IllegalStateException -> 0x021b }
        if (r0 != 0) goto L_0x01f4;
    L_0x01f0:
        r0 = 0;
        r14.setScrollState(r0);	 Catch:{ IllegalStateException -> 0x021b }
    L_0x01f4:
        r14.resetTouch();	 Catch:{ IllegalStateException -> 0x01ff }
        if (r4 == 0) goto L_0x0067;
    L_0x01f9:
        r0 = r2;
        r14.cancelTouch();	 Catch:{ IllegalStateException -> 0x01ff }
        goto L_0x0068;
    L_0x01ff:
        r0 = move-exception;
        throw r0;
    L_0x0201:
        r0 = move-exception;
        throw r0;
    L_0x0203:
        r0 = move-exception;
        throw r0;
    L_0x0205:
        r0 = move-exception;
        throw r0;
    L_0x0207:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0209 }
    L_0x0209:
        r0 = move-exception;
        throw r0;
    L_0x020b:
        r1 = 0;
        goto L_0x01a1;
    L_0x020d:
        r0 = 0;
        goto L_0x01a3;
    L_0x020f:
        r0 = move-exception;
        throw r0;
    L_0x0211:
        r0 = move-exception;
        throw r0;
    L_0x0213:
        r0 = move-exception;
        throw r0;
    L_0x0215:
        r0 = 0;
        goto L_0x01d3;
    L_0x0217:
        r0 = move-exception;
        throw r0;
    L_0x0219:
        r1 = 0;
        goto L_0x01de;
    L_0x021b:
        r0 = move-exception;
        throw r0;
    L_0x021d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onScrolled(int i, int i2) {
    }

    void assertNotInLayoutOrScroll(String str) {
        try {
            if (!isComputingLayout()) {
                return;
            }
            if (str == null) {
                throw new IllegalStateException(z[33]);
            }
            throw new IllegalStateException(str);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    Rect getItemDecorInsetsForChild(View view) {
        int i = ViewHolder.a;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        try {
            if (!layoutParams.mInsetsDirty) {
                return layoutParams.mDecorInsets;
            }
            Rect rect = layoutParams.mDecorInsets;
            rect.set(0, 0, 0, 0);
            int size = this.mItemDecorations.size();
            int i2 = 0;
            while (i2 < size) {
                this.mTempRect.set(0, 0, 0, 0);
                ((ItemDecoration) this.mItemDecorations.get(i2)).getItemOffsets(this.mTempRect, view, this, this.mState);
                rect.left += this.mTempRect.left;
                rect.top += this.mTempRect.top;
                rect.right += this.mTempRect.right;
                rect.bottom += this.mTempRect.bottom;
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            layoutParams.mInsetsDirty = false;
            return rect;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void removeDetachedView(android.view.View r6, boolean r7) {
        /*
        r5 = this;
        r0 = getChildViewHolderInt(r6);
        if (r0 == 0) goto L_0x003c;
    L_0x0006:
        r1 = r0.isTmpDetached();	 Catch:{ IllegalStateException -> 0x0038 }
        if (r1 == 0) goto L_0x0013;
    L_0x000c:
        r0.clearTmpDetachFlag();	 Catch:{ IllegalStateException -> 0x003a }
        r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IllegalStateException -> 0x003a }
        if (r1 == 0) goto L_0x003c;
    L_0x0013:
        r1 = r0.shouldIgnore();	 Catch:{ IllegalStateException -> 0x0036 }
        if (r1 != 0) goto L_0x003c;
    L_0x0019:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x0036 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0036 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0036 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0036 }
        r4 = 38;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0036 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0036 }
        r0 = r2.append(r0);	 Catch:{ IllegalStateException -> 0x0036 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0036 }
        r1.<init>(r0);	 Catch:{ IllegalStateException -> 0x0036 }
        throw r1;	 Catch:{ IllegalStateException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0036 }
    L_0x003c:
        r5.dispatchChildDetached(r6);
        super.removeDetachedView(r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.removeDetachedView(android.view.View, boolean):void");
    }

    void offsetPositionRecordsForInsert(int i, int i2) {
        int i3 = 0;
        int i4 = ViewHolder.a;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        while (i3 < unfilteredChildCount) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i3));
            if (childViewHolderInt != null) {
                try {
                    if (!childViewHolderInt.shouldIgnore()) {
                        if (childViewHolderInt.mPosition >= i) {
                            childViewHolderInt.offsetPosition(i2, false);
                            State.access$1902(this.mState, true);
                        }
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            i3++;
            if (i4 != 0) {
                break;
            }
        }
        this.mRecycler.offsetPositionRecordsForInsert(i, i2);
        requestLayout();
    }

    void dispatchOnScrolled(int i, int i2) {
        int i3 = ViewHolder.a;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        try {
            onScrollChanged(scrollX, scrollY, scrollX, scrollY);
            onScrolled(i, i2);
            if (this.mScrollListener != null) {
                this.mScrollListener.onScrolled(this, i, i2);
            }
            if (this.mScrollListeners != null) {
                scrollY = this.mScrollListeners.size() - 1;
                while (scrollY >= 0) {
                    ((OnScrollListener) this.mScrollListeners.get(scrollY)).onScrolled(this, i, i2);
                    scrollX = scrollY - 1;
                    if (i3 == 0) {
                        scrollY = scrollX;
                    } else {
                        return;
                    }
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void dispatchChildAttached(View view) {
        int i = ViewHolder.a;
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        try {
            onChildAttachedToWindow(view);
            if (!(this.mAdapter == null || childViewHolderInt == null)) {
                this.mAdapter.onViewAttachedToWindow(childViewHolderInt);
            }
            if (this.mOnChildAttachStateListeners != null) {
                int size = this.mOnChildAttachStateListeners.size() - 1;
                while (size >= 0) {
                    ((OnChildAttachStateChangeListener) this.mOnChildAttachStateListeners.get(size)).onChildViewAttachedToWindow(view);
                    int i2 = size - 1;
                    if (i == 0) {
                        size = i2;
                    } else {
                        return;
                    }
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static LayoutManager access$1100(RecyclerView recyclerView) {
        return recyclerView.mLayout;
    }

    private boolean didChildRangeChange(int i, int i2) {
        int i3 = ViewHolder.a;
        int childCount = this.mChildHelper.getChildCount();
        if (childCount != 0) {
            int i4 = 0;
            while (i4 < childCount) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i4));
                try {
                    if (!(childViewHolderInt.shouldIgnore() && i3 == 0)) {
                        int layoutPosition = childViewHolderInt.getLayoutPosition();
                        if (layoutPosition < i || layoutPosition > i2) {
                            return true;
                        }
                    }
                    i4++;
                    if (i3 != 0) {
                        return false;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return false;
        } else if (i == 0 && i2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.mScrollingChildHelper.isNestedScrollingEnabled();
    }

    public ViewHolder getChildViewHolder(View view) {
        Object parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        try {
            throw new IllegalArgumentException(z[34] + view + z[35] + this);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static boolean access$900(RecyclerView recyclerView) {
        return recyclerView.mDataSetHasChangedAfterLayout;
    }

    static void access$4500(RecyclerView recyclerView, ViewHolder viewHolder, ItemHolderInfo itemHolderInfo) {
        recyclerView.recordAnimationInfoIfBouncedHiddenView(viewHolder, itemHolderInfo);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes;
        if (accessibilityEvent != null) {
            contentChangeTypes = AccessibilityEventCompat.getContentChangeTypes(accessibilityEvent);
        } else {
            contentChangeTypes = 0;
        }
        if (contentChangeTypes != 0) {
            i = contentChangeTypes;
        }
        this.mEatenAccessibilityChangeFlags = i | this.mEatenAccessibilityChangeFlags;
        return true;
    }

    public int getChildLayoutPosition(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt == null) {
            return -1;
        }
        try {
            return childViewHolderInt.getLayoutPosition();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.mScrollingChildHelper.hasNestedScrollingParent();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int i = ViewHolder.a;
        int size = this.mOnItemTouchListeners.size();
        int i2 = 0;
        while (i2 < size) {
            ((OnItemTouchListener) this.mOnItemTouchListeners.get(i2)).onRequestDisallowInterceptTouchEvent(z);
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    void dispatchOnScrollStateChanged(int i) {
        int i2 = ViewHolder.a;
        try {
            if (this.mLayout != null) {
                this.mLayout.onScrollStateChanged(i);
            }
            try {
                onScrollStateChanged(i);
                if (this.mScrollListener != null) {
                    this.mScrollListener.onScrollStateChanged(this, i);
                }
                if (this.mScrollListeners != null) {
                    int size = this.mScrollListeners.size() - 1;
                    while (size >= 0) {
                        ((OnScrollListener) this.mScrollListeners.get(size)).onScrollStateChanged(this, i);
                        int i3 = size - 1;
                        if (i2 == 0) {
                            size = i3;
                        } else {
                            return;
                        }
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static void access$700(RecyclerView recyclerView, ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2) {
        recyclerView.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
    }

    void ensureBottomGlow() {
        try {
            if (this.mBottomGlow == null) {
                try {
                    this.mBottomGlow = new EdgeEffectCompat(getContext());
                    if (this.mClipToPadding) {
                        this.mBottomGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        if (ViewHolder.a == 0) {
                            return;
                        }
                    }
                    this.mBottomGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public boolean startNestedScroll(int i) {
        return this.mScrollingChildHelper.startNestedScroll(i);
    }

    private void initChildrenHelper() {
        this.mChildHelper = new ChildHelper(new 5(this));
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        ViewCompat.setAccessibilityDelegate(this, this.mAccessibilityDelegate);
    }

    static void access$1200(RecyclerView recyclerView, View view) {
        recyclerView.dispatchChildAttached(view);
    }

    public void requestChildFocus(View view, View view2) {
        try {
            if (!(this.mLayout.onRequestChildFocus(this, this.mState, view, view2) || view2 == null)) {
                Rect rect;
                this.mTempRect.set(0, 0, view2.getWidth(), view2.getHeight());
                android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                    if (!layoutParams2.mInsetsDirty) {
                        Rect rect2 = layoutParams2.mDecorInsets;
                        rect = this.mTempRect;
                        rect.left -= rect2.left;
                        rect = this.mTempRect;
                        rect.right += rect2.right;
                        rect = this.mTempRect;
                        rect.top -= rect2.top;
                        rect = this.mTempRect;
                        rect.bottom = rect2.bottom + rect.bottom;
                    }
                }
                try {
                    boolean z;
                    offsetDescendantRectToMyCoords(view2, this.mTempRect);
                    offsetRectIntoDescendantCoords(view, this.mTempRect);
                    rect = this.mTempRect;
                    if (this.mFirstLayoutComplete) {
                        z = false;
                    } else {
                        z = true;
                    }
                    requestChildRectangleOnScreen(view, rect, z);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            super.requestChildFocus(view, view2);
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        try {
            if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mScrollPointerId) {
                if (actionIndex == 0) {
                    actionIndex = 1;
                } else {
                    actionIndex = 0;
                }
                this.mScrollPointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                int x = (int) (MotionEventCompat.getX(motionEvent, actionIndex) + 0.5f);
                this.mLastTouchX = x;
                this.mInitialTouchX = x;
                actionIndex = (int) (MotionEventCompat.getY(motionEvent, actionIndex) + 0.5f);
                this.mLastTouchY = actionIndex;
                this.mInitialTouchY = actionIndex;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void offsetChildrenVertical(int i) {
        int i2 = ViewHolder.a;
        int childCount = this.mChildHelper.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            this.mChildHelper.getChildAt(i3).offsetTopAndBottom(i);
            i3++;
            if (i2 != 0) {
                return;
            }
        }
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int i = ViewHolder.a;
        int childCount = this.mChildHelper.getChildCount();
        if (childCount == 0) {
            try {
                iArr[0] = 0;
                iArr[1] = 0;
                return;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = 0;
        while (i4 < childCount) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i4));
            try {
                int layoutPosition;
                if (!(childViewHolderInt.shouldIgnore() && i == 0)) {
                    layoutPosition = childViewHolderInt.getLayoutPosition();
                    if (layoutPosition < i2) {
                        i2 = layoutPosition;
                    }
                    if (layoutPosition > i3) {
                        i3 = layoutPosition;
                    }
                }
                layoutPosition = i4 + 1;
                if (i != 0) {
                    break;
                }
                i4 = layoutPosition;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public void setLayoutFrozen(boolean z) {
        try {
            if (z != this.mLayoutFrozen) {
                assertNotInLayoutOrScroll(z[27]);
                if (!z) {
                    try {
                        this.mLayoutFrozen = z;
                        if (this.mLayoutRequestEaten) {
                            try {
                                if (this.mLayout != null) {
                                    try {
                                        if (this.mAdapter != null) {
                                            requestLayout();
                                        }
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                }
                            } catch (IllegalStateException e2) {
                                throw e2;
                            }
                        }
                        this.mLayoutRequestEaten = false;
                        if (ViewHolder.a == 0) {
                            return;
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutFrozen = z;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void createLayoutManager(android.content.Context r9, java.lang.String r10, android.util.AttributeSet r11, int r12, int r13) {
        /*
        r8 = this;
        if (r10 == 0) goto L_0x005c;
    L_0x0002:
        r0 = r10.trim();
        r1 = r0.length();
        if (r1 == 0) goto L_0x005c;
    L_0x000c:
        r3 = r8.getFullClassName(r9, r0);
        r0 = r8.isInEditMode();	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        if (r0 == 0) goto L_0x0022;
    L_0x0016:
        r0 = r8.getClass();	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r0 = r0.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        if (r1 == 0) goto L_0x0026;
    L_0x0022:
        r0 = r9.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
    L_0x0026:
        r0 = r0.loadClass(r3);	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r1 = android.support.v7.widget.RecyclerView.LayoutManager.class;
        r4 = r0.asSubclass(r1);	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r1 = 0;
        r0 = LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;	 Catch:{ NoSuchMethodException -> 0x005d }
        r2 = r4.getConstructor(r0);	 Catch:{ NoSuchMethodException -> 0x005d }
        r0 = 4;
        r0 = new java.lang.Object[r0];	 Catch:{ NoSuchMethodException -> 0x005d }
        r5 = 0;
        r0[r5] = r9;	 Catch:{ NoSuchMethodException -> 0x005d }
        r5 = 1;
        r0[r5] = r11;	 Catch:{ NoSuchMethodException -> 0x005d }
        r5 = 2;
        r6 = java.lang.Integer.valueOf(r12);	 Catch:{ NoSuchMethodException -> 0x005d }
        r0[r5] = r6;	 Catch:{ NoSuchMethodException -> 0x005d }
        r5 = 3;
        r6 = java.lang.Integer.valueOf(r13);	 Catch:{ NoSuchMethodException -> 0x005d }
        r0[r5] = r6;	 Catch:{ NoSuchMethodException -> 0x005d }
        r1 = r2;
    L_0x004f:
        r2 = 1;
        r1.setAccessible(r2);	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r0 = r1.newInstance(r0);	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r0 = (android.support.v7.widget.RecyclerView.LayoutManager) r0;	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r8.setLayoutManager(r0);	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
    L_0x005c:
        return;
    L_0x005d:
        r0 = move-exception;
        r2 = 0;
        r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x0069 }
        r0 = r4.getConstructor(r2);	 Catch:{ NoSuchMethodException -> 0x0069 }
        r7 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x004f;
    L_0x0069:
        r1 = move-exception;
        r1.initCause(r0);	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r0 = new java.lang.IllegalStateException;	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r4 = r11.getPositionDescription();	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r2 = r2.append(r4);	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r4 = z;	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r5 = 19;
        r4 = r4[r5];	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r2 = r2.append(r4);	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r2 = r2.append(r3);	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r2 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        r0.<init>(r2, r1);	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0092, InvocationTargetException -> 0x00b8, InstantiationException -> 0x00de, IllegalAccessException -> 0x0104, ClassCastException -> 0x012a }
    L_0x0092:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = r11.getPositionDescription();
        r2 = r2.append(r4);
        r4 = z;
        r5 = 18;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x00b8:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = r11.getPositionDescription();
        r2 = r2.append(r4);
        r4 = z;
        r5 = 17;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x00de:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = r11.getPositionDescription();
        r2 = r2.append(r4);
        r4 = z;
        r5 = 20;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x0104:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = r11.getPositionDescription();
        r2 = r2.append(r4);
        r4 = z;
        r5 = 16;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x012a:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = r11.getPositionDescription();
        r2 = r2.append(r4);
        r4 = z;
        r5 = 21;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.createLayoutManager(android.content.Context, java.lang.String, android.util.AttributeSet, int, int):void");
    }

    static RecyclerViewAccessibilityDelegate access$4600(RecyclerView recyclerView) {
        return recyclerView.mAccessibilityDelegate;
    }

    protected void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            this.mLayoutOrScrollCounter = 0;
            this.mIsAttached = true;
            this.mFirstLayoutComplete = false;
            if (this.mLayout != null) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
            this.mPostedAnimatorRunner = false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static boolean access$200(RecyclerView recyclerView) {
        return recyclerView.mLayoutFrozen;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r5, int r6) {
        /*
        r4 = this;
        r3 = 0;
        r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r1 = r4.mAdapterUpdateDuringMeasure;	 Catch:{ IllegalStateException -> 0x005a }
        if (r1 == 0) goto L_0x002d;
    L_0x0007:
        r4.eatRequestLayout();	 Catch:{ IllegalStateException -> 0x005c }
        r4.processAdapterUpdatesAndSetAnimationFlags();	 Catch:{ IllegalStateException -> 0x005c }
        r1 = r4.mState;	 Catch:{ IllegalStateException -> 0x005c }
        r1 = android.support.v7.widget.RecyclerView.State.access$2100(r1);	 Catch:{ IllegalStateException -> 0x005c }
        if (r1 == 0) goto L_0x001d;
    L_0x0015:
        r1 = r4.mState;	 Catch:{ IllegalStateException -> 0x005e }
        r2 = 1;
        android.support.v7.widget.RecyclerView.State.access$2202(r1, r2);	 Catch:{ IllegalStateException -> 0x005e }
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r1 = r4.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x005e }
        r1.consumeUpdatesInOnePass();	 Catch:{ IllegalStateException -> 0x005e }
        r1 = r4.mState;	 Catch:{ IllegalStateException -> 0x005e }
        r2 = 0;
        android.support.v7.widget.RecyclerView.State.access$2202(r1, r2);	 Catch:{ IllegalStateException -> 0x005e }
    L_0x0028:
        r4.mAdapterUpdateDuringMeasure = r3;
        r4.resumeRequestLayout(r3);
    L_0x002d:
        r1 = r4.mAdapter;	 Catch:{ IllegalStateException -> 0x0060 }
        if (r1 == 0) goto L_0x003d;
    L_0x0031:
        r1 = r4.mState;	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = r4.mAdapter;	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = r2.getItemCount();	 Catch:{ IllegalStateException -> 0x0062 }
        r1.mItemCount = r2;	 Catch:{ IllegalStateException -> 0x0062 }
        if (r0 == 0) goto L_0x0042;
    L_0x003d:
        r1 = r4.mState;	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = 0;
        r1.mItemCount = r2;	 Catch:{ IllegalStateException -> 0x0062 }
    L_0x0042:
        r1 = r4.mLayout;	 Catch:{ IllegalStateException -> 0x0064 }
        if (r1 != 0) goto L_0x004b;
    L_0x0046:
        r4.defaultOnMeasure(r5, r6);	 Catch:{ IllegalStateException -> 0x0066 }
        if (r0 == 0) goto L_0x0054;
    L_0x004b:
        r0 = r4.mLayout;	 Catch:{ IllegalStateException -> 0x0066 }
        r1 = r4.mRecycler;	 Catch:{ IllegalStateException -> 0x0066 }
        r2 = r4.mState;	 Catch:{ IllegalStateException -> 0x0066 }
        r0.onMeasure(r1, r2, r5, r6);	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0054:
        r0 = r4.mState;
        android.support.v7.widget.RecyclerView.State.access$2202(r0, r3);
        return;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onMeasure(int, int):void");
    }

    void resumeRequestLayout(boolean z) {
        try {
            if (this.mEatRequestLayout) {
                if (z) {
                    try {
                        if (this.mLayoutRequestEaten) {
                            try {
                                if (!this.mLayoutFrozen) {
                                    try {
                                        if (this.mLayout != null) {
                                            try {
                                                if (this.mAdapter != null) {
                                                    dispatchLayout();
                                                }
                                            } catch (IllegalStateException e) {
                                                throw e;
                                            }
                                        }
                                    } catch (IllegalStateException e2) {
                                        throw e2;
                                    }
                                }
                            } catch (IllegalStateException e22) {
                                throw e22;
                            }
                        }
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                }
                try {
                    this.mEatRequestLayout = false;
                    if (!this.mLayoutFrozen) {
                        this.mLayoutRequestEaten = false;
                    }
                } catch (IllegalStateException e2222) {
                    throw e2222;
                }
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    static Adapter access$2900(RecyclerView recyclerView) {
        return recyclerView.mAdapter;
    }

    static ArrayList access$3400(RecyclerView recyclerView) {
        return recyclerView.mItemDecorations;
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        try {
            if (this.mLayout != null) {
                if (this.mLayout.onAddFocusables(this, arrayList, i, i2)) {
                    return;
                }
            }
            super.addFocusables(arrayList, i, i2);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void processAdapterUpdatesAndSetAnimationFlags() {
        /*
        r5 = this;
        r2 = 1;
        r1 = 0;
        r0 = r5.mDataSetHasChangedAfterLayout;	 Catch:{ IllegalStateException -> 0x0078 }
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r0 = r5.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x0078 }
        r0.reset();	 Catch:{ IllegalStateException -> 0x0078 }
        r5.markKnownViewsInvalid();	 Catch:{ IllegalStateException -> 0x0078 }
        r0 = r5.mLayout;	 Catch:{ IllegalStateException -> 0x0078 }
        r0.onItemsChanged(r5);	 Catch:{ IllegalStateException -> 0x0078 }
    L_0x0013:
        r0 = r5.mItemAnimator;	 Catch:{ IllegalStateException -> 0x007a }
        if (r0 == 0) goto L_0x0028;
    L_0x0017:
        r0 = r5.mLayout;	 Catch:{ IllegalStateException -> 0x007c }
        r0 = r0.supportsPredictiveItemAnimations();	 Catch:{ IllegalStateException -> 0x007c }
        if (r0 == 0) goto L_0x0028;
    L_0x001f:
        r0 = r5.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x007e }
        r0.preProcess();	 Catch:{ IllegalStateException -> 0x007e }
        r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IllegalStateException -> 0x007e }
        if (r0 == 0) goto L_0x002d;
    L_0x0028:
        r0 = r5.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x007e }
        r0.consumeUpdatesInOnePass();	 Catch:{ IllegalStateException -> 0x007e }
    L_0x002d:
        r0 = r5.mItemsAddedOrRemoved;	 Catch:{ IllegalStateException -> 0x0080 }
        if (r0 != 0) goto L_0x0035;
    L_0x0031:
        r0 = r5.mItemsChanged;	 Catch:{ IllegalStateException -> 0x0082 }
        if (r0 == 0) goto L_0x0084;
    L_0x0035:
        r0 = r2;
    L_0x0036:
        r4 = r5.mState;	 Catch:{ IllegalStateException -> 0x0086 }
        r3 = r5.mFirstLayoutComplete;	 Catch:{ IllegalStateException -> 0x0086 }
        if (r3 == 0) goto L_0x0094;
    L_0x003c:
        r3 = r5.mItemAnimator;	 Catch:{ IllegalStateException -> 0x0088 }
        if (r3 == 0) goto L_0x0094;
    L_0x0040:
        r3 = r5.mDataSetHasChangedAfterLayout;	 Catch:{ IllegalStateException -> 0x008a }
        if (r3 != 0) goto L_0x004e;
    L_0x0044:
        if (r0 != 0) goto L_0x004e;
    L_0x0046:
        r3 = r5.mLayout;	 Catch:{ IllegalStateException -> 0x008e }
        r3 = android.support.v7.widget.RecyclerView.LayoutManager.access$2400(r3);	 Catch:{ IllegalStateException -> 0x008e }
        if (r3 == 0) goto L_0x0094;
    L_0x004e:
        r3 = r5.mDataSetHasChangedAfterLayout;	 Catch:{ IllegalStateException -> 0x0090 }
        if (r3 == 0) goto L_0x005a;
    L_0x0052:
        r3 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x0092 }
        r3 = r3.hasStableIds();	 Catch:{ IllegalStateException -> 0x0092 }
        if (r3 == 0) goto L_0x0094;
    L_0x005a:
        r3 = r2;
    L_0x005b:
        android.support.v7.widget.RecyclerView.State.access$2302(r4, r3);	 Catch:{ IllegalStateException -> 0x0096 }
        r3 = r5.mState;	 Catch:{ IllegalStateException -> 0x0096 }
        r4 = r5.mState;	 Catch:{ IllegalStateException -> 0x0096 }
        r4 = android.support.v7.widget.RecyclerView.State.access$2300(r4);	 Catch:{ IllegalStateException -> 0x0096 }
        if (r4 == 0) goto L_0x009e;
    L_0x0068:
        if (r0 == 0) goto L_0x009e;
    L_0x006a:
        r0 = r5.mDataSetHasChangedAfterLayout;	 Catch:{ IllegalStateException -> 0x009a }
        if (r0 != 0) goto L_0x009e;
    L_0x006e:
        r0 = r5.predictiveItemAnimationsEnabled();	 Catch:{ IllegalStateException -> 0x009c }
        if (r0 == 0) goto L_0x009e;
    L_0x0074:
        android.support.v7.widget.RecyclerView.State.access$2102(r3, r2);
        return;
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = r1;
        goto L_0x0036;
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008a }
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r3 = r1;
        goto L_0x005b;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r2 = r1;
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.processAdapterUpdatesAndSetAnimationFlags():void");
    }

    static void access$1300(RecyclerView recyclerView, View view) {
        recyclerView.dispatchChildDetached(view);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.os.Parcelable onSaveInstanceState() {
        /*
        r3 = this;
        r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r1 = new android.support.v7.widget.RecyclerView$SavedState;
        r2 = super.onSaveInstanceState();
        r1.<init>(r2);
        r2 = r3.mPendingSavedState;	 Catch:{ IllegalStateException -> 0x0028 }
        if (r2 == 0) goto L_0x0016;
    L_0x000f:
        r2 = r3.mPendingSavedState;	 Catch:{ IllegalStateException -> 0x002a }
        android.support.v7.widget.RecyclerView.SavedState.access$2000(r1, r2);	 Catch:{ IllegalStateException -> 0x002a }
        if (r0 == 0) goto L_0x0027;
    L_0x0016:
        r2 = r3.mLayout;	 Catch:{ IllegalStateException -> 0x002c }
        if (r2 == 0) goto L_0x0024;
    L_0x001a:
        r2 = r3.mLayout;	 Catch:{ IllegalStateException -> 0x002e }
        r2 = r2.onSaveInstanceState();	 Catch:{ IllegalStateException -> 0x002e }
        r1.mLayoutState = r2;	 Catch:{ IllegalStateException -> 0x002e }
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0 = 0;
        r1.mLayoutState = r0;	 Catch:{ IllegalStateException -> 0x002e }
    L_0x0027:
        return r1;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onSaveInstanceState():android.os.Parcelable");
    }

    public void smoothScrollBy(int i, int i2) {
        int i3 = 0;
        try {
            if (this.mLayout == null) {
                Log.e(z[5], z[4]);
                return;
            }
            try {
                if (!this.mLayoutFrozen) {
                    if (!this.mLayout.canScrollHorizontally()) {
                        i = 0;
                    }
                    if (this.mLayout.canScrollVertically()) {
                        i3 = i2;
                    }
                    if (i != 0 || i3 != 0) {
                        try {
                            this.mViewFlinger.smoothScrollBy(i, i3);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void onDraw(Canvas canvas) {
        int i = ViewHolder.a;
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        int i2 = 0;
        while (i2 < size) {
            ((ItemDecoration) this.mItemDecorations.get(i2)).onDraw(canvas, this, this.mState);
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    private boolean removeAnimatingView(View view) {
        eatRequestLayout();
        boolean removeViewIfHidden = this.mChildHelper.removeViewIfHidden(view);
        if (removeViewIfHidden) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.unscrapView(childViewHolderInt);
            this.mRecycler.recycleViewHolderInternal(childViewHolderInt);
        }
        resumeRequestLayout(false);
        return removeViewIfHidden;
    }

    private void resetTouch() {
        try {
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.clear();
            }
            stopNestedScroll();
            releaseGlows();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mScrollingChildHelper.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mViewHolder;
    }

    private void postAnimationRunner() {
        try {
            if (!this.mPostedAnimatorRunner) {
                if (this.mIsAttached) {
                    ViewCompat.postOnAnimation(this, this.mItemAnimatorRunner);
                    this.mPostedAnimatorRunner = true;
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
        try {
            viewHolder.setIsRecyclable(false);
            if (viewHolder != viewHolder2) {
                viewHolder.mShadowedHolder = viewHolder2;
                addAnimatingView(viewHolder);
                this.mRecycler.unscrapView(viewHolder);
                viewHolder2.setIsRecyclable(false);
                viewHolder2.mShadowingHolder = viewHolder;
            }
            try {
                if (this.mItemAnimator.animateChange(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2)) {
                    postAnimationRunner();
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void considerReleasingGlowsOnScroll(int i, int i2) {
        int i3 = 0;
        try {
            if (this.mLeftGlow != null) {
                if (!this.mLeftGlow.isFinished() && i > 0) {
                    i3 = this.mLeftGlow.onRelease();
                }
            }
            try {
                if (this.mRightGlow != null) {
                    if (!this.mRightGlow.isFinished() && i < 0) {
                        i3 |= this.mRightGlow.onRelease();
                    }
                }
                try {
                    if (this.mTopGlow != null) {
                        if (!this.mTopGlow.isFinished() && i2 > 0) {
                            i3 |= this.mTopGlow.onRelease();
                        }
                    }
                    try {
                        if (this.mBottomGlow != null) {
                            if (!this.mBottomGlow.isFinished() && i2 < 0) {
                                i3 |= this.mBottomGlow.onRelease();
                            }
                        }
                        if (i3 != 0) {
                            try {
                                ViewCompat.postInvalidateOnAnimation(this);
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                } catch (IllegalStateException e2222) {
                    throw e2222;
                }
            } catch (IllegalStateException e22222) {
                throw e22222;
            } catch (IllegalStateException e222222) {
                throw e222222;
            }
        } catch (IllegalStateException e2222222) {
            throw e2222222;
        } catch (IllegalStateException e22222222) {
            throw e22222222;
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int i2 = ViewHolder.a;
        int childCount = this.mChildHelper.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            this.mChildHelper.getChildAt(i3).offsetLeftAndRight(i);
            i3++;
            if (i2 != 0) {
                return;
            }
        }
    }

    protected int getChildDrawingOrder(int i, int i2) {
        try {
            if (this.mChildDrawingOrderCallback == null) {
                return super.getChildDrawingOrder(i, i2);
            }
            return this.mChildDrawingOrderCallback.onGetChildDrawingOrder(i, i2);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static void access$3100(RecyclerView recyclerView) {
        recyclerView.repositionShadowingViews();
    }

    public RecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void jumpToPositionForSmoothScroller(int i) {
        try {
            if (this.mLayout != null) {
                this.mLayout.scrollToPosition(i);
                awakenScrollBars();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void releaseGlows() {
        int i = 0;
        if (this.mLeftGlow != null) {
            i = this.mLeftGlow.onRelease();
        }
        if (this.mTopGlow != null) {
            i |= this.mTopGlow.onRelease();
        }
        if (this.mRightGlow != null) {
            i |= this.mRightGlow.onRelease();
        }
        if (this.mBottomGlow != null) {
            i |= this.mBottomGlow.onRelease();
        }
        if (i != 0) {
            try {
                ViewCompat.postInvalidateOnAnimation(this);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r4 = 0;
        r1 = 0;
        r3 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r5.mLayout;	 Catch:{ IllegalStateException -> 0x0009 }
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        return r4;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r0 = r5.mLayoutFrozen;	 Catch:{ IllegalStateException -> 0x0056 }
        if (r0 != 0) goto L_0x0008;
    L_0x000f:
        r0 = android.support.v4.view.MotionEventCompat.getSource(r6);	 Catch:{ IllegalStateException -> 0x0058 }
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0008;
    L_0x0017:
        r0 = r6.getAction();	 Catch:{ IllegalStateException -> 0x005a }
        r2 = 8;
        if (r0 != r2) goto L_0x0008;
    L_0x001f:
        r0 = r5.mLayout;	 Catch:{ IllegalStateException -> 0x005a }
        r0 = r0.canScrollVertically();	 Catch:{ IllegalStateException -> 0x005a }
        if (r0 == 0) goto L_0x0030;
    L_0x0027:
        r0 = 9;
        r0 = android.support.v4.view.MotionEventCompat.getAxisValue(r6, r0);
        r0 = -r0;
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        r0 = r1;
    L_0x0031:
        r2 = r5.mLayout;
        r2 = r2.canScrollHorizontally();
        if (r2 == 0) goto L_0x0041;
    L_0x0039:
        r2 = 10;
        r2 = android.support.v4.view.MotionEventCompat.getAxisValue(r6, r2);
        if (r3 == 0) goto L_0x0042;
    L_0x0041:
        r2 = r1;
    L_0x0042:
        r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r3 != 0) goto L_0x004a;
    L_0x0046:
        r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1));
        if (r1 == 0) goto L_0x0008;
    L_0x004a:
        r1 = r5.getScrollFactor();
        r2 = r2 * r1;
        r2 = (int) r2;
        r0 = r0 * r1;
        r0 = (int) r0;
        r5.scrollByInternal(r2, r0, r6);
        goto L_0x0008;
    L_0x0056:
        r0 = move-exception;
        throw r0;
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    static void access$1500(RecyclerView recyclerView, int i) {
        recyclerView.detachViewFromParent(i);
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        try {
            this.mEatenAccessibilityChangeFlags = 0;
            if (i != 0 && isAccessibilityEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                AccessibilityEventCompat.setContentChangeTypes(obtain, i);
                sendAccessibilityEventUnchecked(obtain);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static void access$3800(RecyclerView recyclerView) {
        recyclerView.setDataSetChangedAfterLayout();
    }

    private void animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2) {
        try {
            addAnimatingView(viewHolder);
            viewHolder.setIsRecyclable(false);
            if (this.mItemAnimator.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                postAnimationRunner();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    void ensureRightGlow() {
        try {
            if (this.mRightGlow == null) {
                try {
                    this.mRightGlow = new EdgeEffectCompat(getContext());
                    if (this.mClipToPadding) {
                        this.mRightGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        if (ViewHolder.a == 0) {
                            return;
                        }
                    }
                    this.mRightGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
        r10 = this;
        r1 = -1;
        r9 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r3 = 0;
        r2 = 1;
        r4 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r10.mLayoutFrozen;	 Catch:{ IllegalStateException -> 0x000c }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        return r3;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = r10.dispatchOnItemTouchIntercept(r11);	 Catch:{ IllegalStateException -> 0x0019 }
        if (r0 == 0) goto L_0x001b;
    L_0x0014:
        r10.cancelTouch();	 Catch:{ IllegalStateException -> 0x0019 }
        r3 = r2;
        goto L_0x000b;
    L_0x0019:
        r0 = move-exception;
        throw r0;
    L_0x001b:
        r0 = r10.mLayout;	 Catch:{ IllegalStateException -> 0x004b }
        if (r0 == 0) goto L_0x000b;
    L_0x001f:
        r0 = r10.mLayout;
        r5 = r0.canScrollHorizontally();
        r0 = r10.mLayout;
        r6 = r0.canScrollVertically();
        r0 = r10.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x004d }
        if (r0 != 0) goto L_0x0035;
    L_0x002f:
        r0 = android.view.VelocityTracker.obtain();	 Catch:{ IllegalStateException -> 0x004d }
        r10.mVelocityTracker = r0;	 Catch:{ IllegalStateException -> 0x004d }
    L_0x0035:
        r0 = r10.mVelocityTracker;
        r0.addMovement(r11);
        r0 = android.support.v4.view.MotionEventCompat.getActionMasked(r11);
        r7 = android.support.v4.view.MotionEventCompat.getActionIndex(r11);
        switch(r0) {
            case 0: goto L_0x004f;
            case 1: goto L_0x013f;
            case 2: goto L_0x00b2;
            case 3: goto L_0x0149;
            case 4: goto L_0x0045;
            case 5: goto L_0x0096;
            case 6: goto L_0x013a;
            default: goto L_0x0045;
        };
    L_0x0045:
        r0 = r10.mScrollState;	 Catch:{ IllegalStateException -> 0x0160 }
        if (r0 != r2) goto L_0x0162;
    L_0x0049:
        r3 = r2;
        goto L_0x000b;
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = r10.mIgnoreMotionEventTillDown;	 Catch:{ IllegalStateException -> 0x00ea }
        if (r0 == 0) goto L_0x0056;
    L_0x0053:
        r0 = 0;
        r10.mIgnoreMotionEventTillDown = r0;	 Catch:{ IllegalStateException -> 0x00ea }
    L_0x0056:
        r0 = 0;
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r11, r0);	 Catch:{ IllegalStateException -> 0x00ec }
        r10.mScrollPointerId = r0;	 Catch:{ IllegalStateException -> 0x00ec }
        r0 = r11.getX();	 Catch:{ IllegalStateException -> 0x00ec }
        r0 = r0 + r9;
        r0 = (int) r0;	 Catch:{ IllegalStateException -> 0x00ec }
        r10.mLastTouchX = r0;	 Catch:{ IllegalStateException -> 0x00ec }
        r10.mInitialTouchX = r0;	 Catch:{ IllegalStateException -> 0x00ec }
        r0 = r11.getY();	 Catch:{ IllegalStateException -> 0x00ec }
        r0 = r0 + r9;
        r0 = (int) r0;	 Catch:{ IllegalStateException -> 0x00ec }
        r10.mLastTouchY = r0;	 Catch:{ IllegalStateException -> 0x00ec }
        r10.mInitialTouchY = r0;	 Catch:{ IllegalStateException -> 0x00ec }
        r0 = r10.mScrollState;	 Catch:{ IllegalStateException -> 0x00ec }
        r8 = 2;
        if (r0 != r8) goto L_0x0082;
    L_0x0076:
        r0 = r10.getParent();	 Catch:{ IllegalStateException -> 0x00ec }
        r8 = 1;
        r0.requestDisallowInterceptTouchEvent(r8);	 Catch:{ IllegalStateException -> 0x00ec }
        r0 = 1;
        r10.setScrollState(r0);	 Catch:{ IllegalStateException -> 0x00ec }
    L_0x0082:
        r0 = r10.mNestedOffsets;
        r8 = r10.mNestedOffsets;
        r8[r2] = r3;
        r0[r3] = r3;
        if (r5 == 0) goto L_0x0167;
    L_0x008c:
        r0 = r2;
    L_0x008d:
        if (r6 == 0) goto L_0x0091;
    L_0x008f:
        r0 = r0 | 2;
    L_0x0091:
        r10.startNestedScroll(r0);	 Catch:{ IllegalStateException -> 0x00ee }
        if (r4 == 0) goto L_0x0045;
    L_0x0096:
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r11, r7);	 Catch:{ IllegalStateException -> 0x00ee }
        r10.mScrollPointerId = r0;	 Catch:{ IllegalStateException -> 0x00ee }
        r0 = android.support.v4.view.MotionEventCompat.getX(r11, r7);	 Catch:{ IllegalStateException -> 0x00ee }
        r0 = r0 + r9;
        r0 = (int) r0;	 Catch:{ IllegalStateException -> 0x00ee }
        r10.mLastTouchX = r0;	 Catch:{ IllegalStateException -> 0x00ee }
        r10.mInitialTouchX = r0;	 Catch:{ IllegalStateException -> 0x00ee }
        r0 = android.support.v4.view.MotionEventCompat.getY(r11, r7);	 Catch:{ IllegalStateException -> 0x00ee }
        r0 = r0 + r9;
        r0 = (int) r0;	 Catch:{ IllegalStateException -> 0x00ee }
        r10.mLastTouchY = r0;	 Catch:{ IllegalStateException -> 0x00ee }
        r10.mInitialTouchY = r0;	 Catch:{ IllegalStateException -> 0x00ee }
        if (r4 == 0) goto L_0x0045;
    L_0x00b2:
        r0 = r10.mScrollPointerId;
        r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r11, r0);
        if (r0 >= 0) goto L_0x00f0;
    L_0x00ba:
        r0 = z;	 Catch:{ IllegalStateException -> 0x00e8 }
        r1 = 22;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x00e8 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00e8 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00e8 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x00e8 }
        r4 = 24;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x00e8 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00e8 }
        r2 = r10.mScrollPointerId;	 Catch:{ IllegalStateException -> 0x00e8 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00e8 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x00e8 }
        r4 = 23;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x00e8 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00e8 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x00e8 }
        android.util.Log.e(r0, r1);	 Catch:{ IllegalStateException -> 0x00e8 }
        goto L_0x000b;
    L_0x00e8:
        r0 = move-exception;
        throw r0;
    L_0x00ea:
        r0 = move-exception;
        throw r0;
    L_0x00ec:
        r0 = move-exception;
        throw r0;
    L_0x00ee:
        r0 = move-exception;
        throw r0;
    L_0x00f0:
        r7 = android.support.v4.view.MotionEventCompat.getX(r11, r0);
        r7 = r7 + r9;
        r7 = (int) r7;
        r0 = android.support.v4.view.MotionEventCompat.getY(r11, r0);
        r0 = r0 + r9;
        r0 = (int) r0;
        r8 = r10.mScrollState;
        if (r8 == r2) goto L_0x0138;
    L_0x0100:
        r8 = r10.mInitialTouchX;
        r7 = r7 - r8;
        r8 = r10.mInitialTouchY;
        r8 = r0 - r8;
        if (r5 == 0) goto L_0x0165;
    L_0x0109:
        r0 = java.lang.Math.abs(r7);	 Catch:{ IllegalStateException -> 0x0150 }
        r5 = r10.mTouchSlop;	 Catch:{ IllegalStateException -> 0x0150 }
        if (r0 <= r5) goto L_0x0165;
    L_0x0111:
        r5 = r10.mInitialTouchX;	 Catch:{ IllegalStateException -> 0x0152 }
        r9 = r10.mTouchSlop;	 Catch:{ IllegalStateException -> 0x0152 }
        if (r7 >= 0) goto L_0x0154;
    L_0x0117:
        r0 = r1;
    L_0x0118:
        r0 = r0 * r9;
        r0 = r0 + r5;
        r10.mLastTouchX = r0;
        r0 = r2;
    L_0x011d:
        if (r6 == 0) goto L_0x0132;
    L_0x011f:
        r5 = java.lang.Math.abs(r8);	 Catch:{ IllegalStateException -> 0x0156 }
        r6 = r10.mTouchSlop;	 Catch:{ IllegalStateException -> 0x0156 }
        if (r5 <= r6) goto L_0x0132;
    L_0x0127:
        r0 = r10.mInitialTouchY;	 Catch:{ IllegalStateException -> 0x0158 }
        r5 = r10.mTouchSlop;	 Catch:{ IllegalStateException -> 0x0158 }
        if (r8 >= 0) goto L_0x015a;
    L_0x012d:
        r1 = r1 * r5;
        r0 = r0 + r1;
        r10.mLastTouchY = r0;
        r0 = r2;
    L_0x0132:
        if (r0 == 0) goto L_0x0138;
    L_0x0134:
        r0 = 1;
        r10.setScrollState(r0);	 Catch:{ IllegalStateException -> 0x015c }
    L_0x0138:
        if (r4 == 0) goto L_0x0045;
    L_0x013a:
        r10.onPointerUp(r11);	 Catch:{ IllegalStateException -> 0x015e }
        if (r4 == 0) goto L_0x0045;
    L_0x013f:
        r0 = r10.mVelocityTracker;	 Catch:{ IllegalStateException -> 0x014e }
        r0.clear();	 Catch:{ IllegalStateException -> 0x014e }
        r10.stopNestedScroll();	 Catch:{ IllegalStateException -> 0x014e }
        if (r4 == 0) goto L_0x0045;
    L_0x0149:
        r10.cancelTouch();	 Catch:{ IllegalStateException -> 0x014e }
        goto L_0x0045;
    L_0x014e:
        r0 = move-exception;
        throw r0;
    L_0x0150:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0152 }
    L_0x0152:
        r0 = move-exception;
        throw r0;
    L_0x0154:
        r0 = r2;
        goto L_0x0118;
    L_0x0156:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0158 }
    L_0x0158:
        r0 = move-exception;
        throw r0;
    L_0x015a:
        r1 = r2;
        goto L_0x012d;
    L_0x015c:
        r0 = move-exception;
        throw r0;
    L_0x015e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x014e }
    L_0x0160:
        r0 = move-exception;
        throw r0;
    L_0x0162:
        r2 = r3;
        goto L_0x0049;
    L_0x0165:
        r0 = r3;
        goto L_0x011d;
    L_0x0167:
        r0 = r3;
        goto L_0x008d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    static void access$400(RecyclerView recyclerView) {
        recyclerView.consumePendingUpdateOperations();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void dispatchLayout() {
        /*
        r10 = this;
        r1 = 1;
        r2 = 0;
        r4 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r10.mAdapter;	 Catch:{ IllegalStateException -> 0x0018 }
        if (r0 != 0) goto L_0x001a;
    L_0x0008:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0018 }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0018 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0018 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0018 }
        android.util.Log.e(r0, r1);	 Catch:{ IllegalStateException -> 0x0018 }
    L_0x0017:
        return;
    L_0x0018:
        r0 = move-exception;
        throw r0;
    L_0x001a:
        r0 = r10.mLayout;	 Catch:{ IllegalStateException -> 0x002e }
        if (r0 != 0) goto L_0x0030;
    L_0x001e:
        r0 = z;	 Catch:{ IllegalStateException -> 0x002e }
        r1 = 15;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x002e }
        r1 = z;	 Catch:{ IllegalStateException -> 0x002e }
        r2 = 14;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x002e }
        android.util.Log.e(r0, r1);	 Catch:{ IllegalStateException -> 0x002e }
        goto L_0x0017;
    L_0x002e:
        r0 = move-exception;
        throw r0;
    L_0x0030:
        r0 = r10.mViewInfoStore;	 Catch:{ IllegalStateException -> 0x024a }
        r0.clear();	 Catch:{ IllegalStateException -> 0x024a }
        r10.eatRequestLayout();	 Catch:{ IllegalStateException -> 0x024a }
        r10.onEnterLayoutOrScroll();	 Catch:{ IllegalStateException -> 0x024a }
        r10.processAdapterUpdatesAndSetAnimationFlags();	 Catch:{ IllegalStateException -> 0x024a }
        r3 = r10.mState;	 Catch:{ IllegalStateException -> 0x024a }
        r0 = r10.mState;	 Catch:{ IllegalStateException -> 0x024a }
        r0 = android.support.v7.widget.RecyclerView.State.access$2300(r0);	 Catch:{ IllegalStateException -> 0x024a }
        if (r0 == 0) goto L_0x024e;
    L_0x0048:
        r0 = r10.mItemsChanged;	 Catch:{ IllegalStateException -> 0x024c }
        if (r0 == 0) goto L_0x024e;
    L_0x004c:
        r0 = r1;
    L_0x004d:
        android.support.v7.widget.RecyclerView.State.access$2502(r3, r0);
        r10.mItemsChanged = r2;
        r10.mItemsAddedOrRemoved = r2;
        r0 = r10.mState;
        r3 = r10.mState;
        r3 = android.support.v7.widget.RecyclerView.State.access$2100(r3);
        android.support.v7.widget.RecyclerView.State.access$2202(r0, r3);
        r0 = r10.mState;
        r3 = r10.mAdapter;
        r3 = r3.getItemCount();
        r0.mItemCount = r3;
        r0 = r10.mMinMaxLayoutPositions;
        r10.findMinMaxChildLayoutPositions(r0);
        r0 = r10.mState;
        r0 = android.support.v7.widget.RecyclerView.State.access$2300(r0);
        if (r0 == 0) goto L_0x00e1;
    L_0x0076:
        r0 = r10.mChildHelper;
        r3 = r0.getChildCount();
        r0 = r2;
    L_0x007d:
        if (r0 >= r3) goto L_0x00e1;
    L_0x007f:
        r5 = r10.mChildHelper;
        r5 = r5.getChildAt(r0);
        r5 = getChildViewHolderInt(r5);
        r6 = r5.shouldIgnore();	 Catch:{ IllegalStateException -> 0x0251 }
        if (r6 != 0) goto L_0x00dd;
    L_0x008f:
        r6 = r5.isInvalid();	 Catch:{ IllegalStateException -> 0x0253 }
        if (r6 == 0) goto L_0x009f;
    L_0x0095:
        r6 = r10.mAdapter;	 Catch:{ IllegalStateException -> 0x0255 }
        r6 = r6.hasStableIds();	 Catch:{ IllegalStateException -> 0x0255 }
        if (r6 != 0) goto L_0x009f;
    L_0x009d:
        if (r4 == 0) goto L_0x00dd;
    L_0x009f:
        r6 = r10.mItemAnimator;
        r7 = r10.mState;
        r8 = android.support.v7.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(r5);
        r9 = r5.getUnmodifiedPayloads();
        r6 = r6.recordPreLayoutInformation(r7, r5, r8, r9);
        r7 = r10.mViewInfoStore;	 Catch:{ IllegalStateException -> 0x0257 }
        r7.addToPreLayout(r5, r6);	 Catch:{ IllegalStateException -> 0x0257 }
        r6 = r10.mState;	 Catch:{ IllegalStateException -> 0x0257 }
        r6 = android.support.v7.widget.RecyclerView.State.access$2500(r6);	 Catch:{ IllegalStateException -> 0x0257 }
        if (r6 == 0) goto L_0x00dd;
    L_0x00bc:
        r6 = r5.isUpdated();	 Catch:{ IllegalStateException -> 0x0259 }
        if (r6 == 0) goto L_0x00dd;
    L_0x00c2:
        r6 = r5.isRemoved();	 Catch:{ IllegalStateException -> 0x025b }
        if (r6 != 0) goto L_0x00dd;
    L_0x00c8:
        r6 = r5.shouldIgnore();	 Catch:{ IllegalStateException -> 0x025d }
        if (r6 != 0) goto L_0x00dd;
    L_0x00ce:
        r6 = r5.isInvalid();	 Catch:{ IllegalStateException -> 0x025d }
        if (r6 != 0) goto L_0x00dd;
    L_0x00d4:
        r6 = r10.getChangedHolderKey(r5);
        r8 = r10.mViewInfoStore;
        r8.addToOldChangeHolders(r6, r5);
    L_0x00dd:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x007d;
    L_0x00e1:
        r0 = r10.mState;
        r0 = android.support.v7.widget.RecyclerView.State.access$2100(r0);
        if (r0 == 0) goto L_0x015c;
    L_0x00e9:
        r10.saveOldPositions();
        r0 = r10.mState;
        r0 = android.support.v7.widget.RecyclerView.State.access$1900(r0);
        r3 = r10.mState;
        android.support.v7.widget.RecyclerView.State.access$1902(r3, r2);
        r3 = r10.mLayout;
        r5 = r10.mRecycler;
        r6 = r10.mState;
        r3.onLayoutChildren(r5, r6);
        r3 = r10.mState;
        android.support.v7.widget.RecyclerView.State.access$1902(r3, r0);
        r0 = r2;
    L_0x0106:
        r3 = r10.mChildHelper;
        r3 = r3.getChildCount();
        if (r0 >= r3) goto L_0x0152;
    L_0x010e:
        r3 = r10.mChildHelper;
        r3 = r3.getChildAt(r0);
        r5 = getChildViewHolderInt(r3);
        r3 = r5.shouldIgnore();	 Catch:{ IllegalStateException -> 0x025f }
        if (r3 == 0) goto L_0x0120;
    L_0x011e:
        if (r4 == 0) goto L_0x014e;
    L_0x0120:
        r3 = r10.mViewInfoStore;	 Catch:{ IllegalStateException -> 0x0261 }
        r3 = r3.isInPreLayout(r5);	 Catch:{ IllegalStateException -> 0x0261 }
        if (r3 != 0) goto L_0x014e;
    L_0x0128:
        r3 = android.support.v7.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(r5);
        r6 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r6 = r5.hasAnyOfTheFlags(r6);
        if (r6 != 0) goto L_0x0136;
    L_0x0134:
        r3 = r3 | 4096;
    L_0x0136:
        r7 = r10.mItemAnimator;
        r8 = r10.mState;
        r9 = r5.getUnmodifiedPayloads();
        r3 = r7.recordPreLayoutInformation(r8, r5, r3, r9);
        if (r6 == 0) goto L_0x0149;
    L_0x0144:
        r10.recordAnimationInfoIfBouncedHiddenView(r5, r3);	 Catch:{ IllegalStateException -> 0x0263 }
        if (r4 == 0) goto L_0x014e;
    L_0x0149:
        r6 = r10.mViewInfoStore;	 Catch:{ IllegalStateException -> 0x0263 }
        r6.addToAppearedInPreLayoutHolders(r5, r3);	 Catch:{ IllegalStateException -> 0x0263 }
    L_0x014e:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0106;
    L_0x0152:
        r10.clearOldPositions();	 Catch:{ IllegalStateException -> 0x0265 }
        r0 = r10.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x0265 }
        r0.consumePostponedUpdates();	 Catch:{ IllegalStateException -> 0x0265 }
        if (r4 == 0) goto L_0x015f;
    L_0x015c:
        r10.clearOldPositions();	 Catch:{ IllegalStateException -> 0x0265 }
    L_0x015f:
        r0 = r10.mState;	 Catch:{ IllegalStateException -> 0x0267 }
        r3 = r10.mAdapter;	 Catch:{ IllegalStateException -> 0x0267 }
        r3 = r3.getItemCount();	 Catch:{ IllegalStateException -> 0x0267 }
        r0.mItemCount = r3;	 Catch:{ IllegalStateException -> 0x0267 }
        r0 = r10.mState;	 Catch:{ IllegalStateException -> 0x0267 }
        r3 = 0;
        android.support.v7.widget.RecyclerView.State.access$1802(r0, r3);	 Catch:{ IllegalStateException -> 0x0267 }
        r0 = r10.mState;	 Catch:{ IllegalStateException -> 0x0267 }
        r3 = 0;
        android.support.v7.widget.RecyclerView.State.access$2202(r0, r3);	 Catch:{ IllegalStateException -> 0x0267 }
        r0 = r10.mLayout;	 Catch:{ IllegalStateException -> 0x0267 }
        r3 = r10.mRecycler;	 Catch:{ IllegalStateException -> 0x0267 }
        r5 = r10.mState;	 Catch:{ IllegalStateException -> 0x0267 }
        r0.onLayoutChildren(r3, r5);	 Catch:{ IllegalStateException -> 0x0267 }
        r0 = r10.mState;	 Catch:{ IllegalStateException -> 0x0267 }
        r3 = 0;
        android.support.v7.widget.RecyclerView.State.access$1902(r0, r3);	 Catch:{ IllegalStateException -> 0x0267 }
        r0 = 0;
        r10.mPendingSavedState = r0;	 Catch:{ IllegalStateException -> 0x0267 }
        r0 = r10.mState;	 Catch:{ IllegalStateException -> 0x0267 }
        r3 = r10.mState;	 Catch:{ IllegalStateException -> 0x0267 }
        r3 = android.support.v7.widget.RecyclerView.State.access$2300(r3);	 Catch:{ IllegalStateException -> 0x0267 }
        if (r3 == 0) goto L_0x026b;
    L_0x0191:
        r3 = r10.mItemAnimator;	 Catch:{ IllegalStateException -> 0x0269 }
        if (r3 == 0) goto L_0x026b;
    L_0x0195:
        android.support.v7.widget.RecyclerView.State.access$2302(r0, r1);
        r0 = r10.mState;
        r0 = android.support.v7.widget.RecyclerView.State.access$2300(r0);
        if (r0 == 0) goto L_0x01ef;
    L_0x01a0:
        r0 = r10.mChildHelper;
        r0 = r0.getChildCount();
    L_0x01a6:
        if (r2 >= r0) goto L_0x01e8;
    L_0x01a8:
        r1 = r10.mChildHelper;
        r1 = r1.getChildAt(r2);
        r1 = getChildViewHolderInt(r1);
        r3 = r1.shouldIgnore();	 Catch:{ IllegalStateException -> 0x026e }
        if (r3 == 0) goto L_0x01ba;
    L_0x01b8:
        if (r4 == 0) goto L_0x01e4;
    L_0x01ba:
        r6 = r10.getChangedHolderKey(r1);
        r3 = r10.mItemAnimator;
        r5 = r10.mState;
        r3 = r3.recordPostLayoutInformation(r5, r1);
        r5 = r10.mViewInfoStore;
        r5 = r5.getFromOldChangeHolders(r6);
        if (r5 == 0) goto L_0x01df;
    L_0x01ce:
        r6 = r5.shouldIgnore();	 Catch:{ IllegalStateException -> 0x0270 }
        if (r6 != 0) goto L_0x01df;
    L_0x01d4:
        r6 = r10.mViewInfoStore;
        r6 = r6.popFromPreLayout(r5);
        r10.animateChange(r5, r1, r6, r3);	 Catch:{ IllegalStateException -> 0x0272 }
        if (r4 == 0) goto L_0x01e4;
    L_0x01df:
        r5 = r10.mViewInfoStore;	 Catch:{ IllegalStateException -> 0x0272 }
        r5.addToPostLayout(r1, r3);	 Catch:{ IllegalStateException -> 0x0272 }
    L_0x01e4:
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x01a6;
    L_0x01e8:
        r0 = r10.mViewInfoStore;
        r1 = r10.mViewInfoProcessCallback;
        r0.process(r1);
    L_0x01ef:
        r0 = 0;
        r10.resumeRequestLayout(r0);	 Catch:{ IllegalStateException -> 0x0274 }
        r0 = r10.mLayout;	 Catch:{ IllegalStateException -> 0x0274 }
        r1 = r10.mRecycler;	 Catch:{ IllegalStateException -> 0x0274 }
        r0.removeAndRecycleScrapInt(r1);	 Catch:{ IllegalStateException -> 0x0274 }
        r0 = r10.mState;	 Catch:{ IllegalStateException -> 0x0274 }
        r1 = r10.mState;	 Catch:{ IllegalStateException -> 0x0274 }
        r1 = r1.mItemCount;	 Catch:{ IllegalStateException -> 0x0274 }
        android.support.v7.widget.RecyclerView.State.access$2602(r0, r1);	 Catch:{ IllegalStateException -> 0x0274 }
        r0 = 0;
        r10.mDataSetHasChangedAfterLayout = r0;	 Catch:{ IllegalStateException -> 0x0274 }
        r0 = r10.mState;	 Catch:{ IllegalStateException -> 0x0274 }
        r1 = 0;
        android.support.v7.widget.RecyclerView.State.access$2302(r0, r1);	 Catch:{ IllegalStateException -> 0x0274 }
        r0 = r10.mState;	 Catch:{ IllegalStateException -> 0x0274 }
        r1 = 0;
        android.support.v7.widget.RecyclerView.State.access$2102(r0, r1);	 Catch:{ IllegalStateException -> 0x0274 }
        r10.onExitLayoutOrScroll();	 Catch:{ IllegalStateException -> 0x0274 }
        r0 = r10.mLayout;	 Catch:{ IllegalStateException -> 0x0274 }
        r1 = 0;
        android.support.v7.widget.RecyclerView.LayoutManager.access$2402(r0, r1);	 Catch:{ IllegalStateException -> 0x0274 }
        r0 = r10.mRecycler;	 Catch:{ IllegalStateException -> 0x0274 }
        r0 = android.support.v7.widget.RecyclerView.Recycler.access$2700(r0);	 Catch:{ IllegalStateException -> 0x0274 }
        if (r0 == 0) goto L_0x022c;
    L_0x0223:
        r0 = r10.mRecycler;	 Catch:{ IllegalStateException -> 0x0274 }
        r0 = android.support.v7.widget.RecyclerView.Recycler.access$2700(r0);	 Catch:{ IllegalStateException -> 0x0274 }
        r0.clear();	 Catch:{ IllegalStateException -> 0x0274 }
    L_0x022c:
        r0 = r10.mViewInfoStore;	 Catch:{ IllegalStateException -> 0x0248 }
        r0.clear();	 Catch:{ IllegalStateException -> 0x0248 }
        r0 = r10.mMinMaxLayoutPositions;	 Catch:{ IllegalStateException -> 0x0248 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0248 }
        r1 = r10.mMinMaxLayoutPositions;	 Catch:{ IllegalStateException -> 0x0248 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0248 }
        r0 = r10.didChildRangeChange(r0, r1);	 Catch:{ IllegalStateException -> 0x0248 }
        if (r0 == 0) goto L_0x0017;
    L_0x0241:
        r0 = 0;
        r1 = 0;
        r10.dispatchOnScrolled(r0, r1);	 Catch:{ IllegalStateException -> 0x0248 }
        goto L_0x0017;
    L_0x0248:
        r0 = move-exception;
        throw r0;
    L_0x024a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x024c }
    L_0x024c:
        r0 = move-exception;
        throw r0;
    L_0x024e:
        r0 = r2;
        goto L_0x004d;
    L_0x0251:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0253 }
    L_0x0253:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0255 }
    L_0x0255:
        r0 = move-exception;
        throw r0;
    L_0x0257:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0259 }
    L_0x0259:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x025b }
    L_0x025b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x025d }
    L_0x025d:
        r0 = move-exception;
        throw r0;
    L_0x025f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0261 }
    L_0x0261:
        r0 = move-exception;
        throw r0;
    L_0x0263:
        r0 = move-exception;
        throw r0;
    L_0x0265:
        r0 = move-exception;
        throw r0;
    L_0x0267:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0269 }
    L_0x0269:
        r0 = move-exception;
        throw r0;
    L_0x026b:
        r1 = r2;
        goto L_0x0195;
    L_0x026e:
        r0 = move-exception;
        throw r0;
    L_0x0270:
        r0 = move-exception;
        throw r0;
    L_0x0272:
        r0 = move-exception;
        throw r0;
    L_0x0274:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.dispatchLayout():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void offsetPositionRecordsForRemove(int r8, int r9, boolean r10) {
        /*
        r7 = this;
        r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r2 = r8 + r9;
        r0 = r7.mChildHelper;
        r3 = r0.getUnfilteredChildCount();
        r0 = 0;
    L_0x000b:
        if (r0 >= r3) goto L_0x0043;
    L_0x000d:
        r4 = r7.mChildHelper;
        r4 = r4.getUnfilteredChildAt(r0);
        r4 = getChildViewHolderInt(r4);
        if (r4 == 0) goto L_0x003f;
    L_0x0019:
        r5 = r4.shouldIgnore();	 Catch:{ IllegalStateException -> 0x004c }
        if (r5 != 0) goto L_0x003f;
    L_0x001f:
        r5 = r4.mPosition;	 Catch:{ IllegalStateException -> 0x004e }
        if (r5 < r2) goto L_0x002f;
    L_0x0023:
        r5 = -r9;
        r4.offsetPosition(r5, r10);	 Catch:{ IllegalStateException -> 0x0050 }
        r5 = r7.mState;	 Catch:{ IllegalStateException -> 0x0050 }
        r6 = 1;
        android.support.v7.widget.RecyclerView.State.access$1902(r5, r6);	 Catch:{ IllegalStateException -> 0x0050 }
        if (r1 == 0) goto L_0x003f;
    L_0x002f:
        r5 = r4.mPosition;	 Catch:{ IllegalStateException -> 0x0052 }
        if (r5 < r8) goto L_0x003f;
    L_0x0033:
        r5 = r8 + -1;
        r6 = -r9;
        r4.flagRemovedAndOffsetPosition(r5, r6, r10);	 Catch:{ IllegalStateException -> 0x0052 }
        r4 = r7.mState;	 Catch:{ IllegalStateException -> 0x0052 }
        r5 = 1;
        android.support.v7.widget.RecyclerView.State.access$1902(r4, r5);	 Catch:{ IllegalStateException -> 0x0052 }
    L_0x003f:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000b;
    L_0x0043:
        r0 = r7.mRecycler;
        r0.offsetPositionRecordsForRemove(r8, r9, r10);
        r7.requestLayout();
        return;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.offsetPositionRecordsForRemove(int, int, boolean):void");
    }

    public RecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2 = false;
        int i2 = ViewHolder.a;
        super(context, attributeSet, i);
        this.mObserver = new RecyclerViewDataObserver(this, null);
        this.mRecycler = new Recycler(this);
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new 1(this);
        this.mTempRect = new Rect();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mDataSetHasChangedAfterLayout = false;
        this.mLayoutOrScrollCounter = 0;
        this.mItemAnimator = new DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScrollFactor = Float.MIN_VALUE;
        this.mViewFlinger = new ViewFlinger(this);
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new ItemAnimatorRestoreListener(this, null);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mNestedOffsets = new int[2];
        this.mItemAnimatorRunner = new 2(this);
        this.mViewInfoProcessCallback = new 4(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        if (VERSION.SDK_INT >= 16) {
            z = true;
        } else {
            z = false;
        }
        this.mPostUpdatesOnAnimation = z;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        try {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
            this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
            this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            if (ViewCompat.getOverScrollMode(this) == 2) {
                z = true;
            } else {
                z = false;
            }
            try {
                setWillNotDraw(z);
                this.mItemAnimator.setListener(this.mItemAnimatorListener);
                initAdapterManager();
                initChildrenHelper();
                if (ViewCompat.getImportantForAccessibility(this) == 0) {
                    ViewCompat.setImportantForAccessibility(this, 1);
                }
                this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService(z[26]);
                setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
                if (attributeSet != null) {
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i, 0);
                    String string = obtainStyledAttributes.getString(R.styleable.RecyclerView_layoutManager);
                    obtainStyledAttributes.recycle();
                    createLayoutManager(context, string, attributeSet, i, 0);
                }
                try {
                    this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
                    setNestedScrollingEnabled(true);
                    if (i2 != 0) {
                        if (!a) {
                            z2 = true;
                        }
                        a = z2;
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

    public void setLayoutManager(LayoutManager layoutManager) {
        try {
            if (layoutManager != this.mLayout) {
                try {
                    if (this.mLayout != null) {
                        if (this.mIsAttached) {
                            this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
                        }
                        this.mLayout.setRecyclerView(null);
                    }
                    try {
                        this.mRecycler.clear();
                        this.mChildHelper.removeAllViewsUnfiltered();
                        this.mLayout = layoutManager;
                        if (layoutManager != null) {
                            if (layoutManager.mRecyclerView != null) {
                                throw new IllegalArgumentException(z[37] + layoutManager + z[36] + layoutManager.mRecyclerView);
                            }
                            try {
                                this.mLayout.setRecyclerView(this);
                                if (this.mIsAttached) {
                                    this.mLayout.dispatchAttachedToWindow(this);
                                }
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                        requestLayout();
                    } catch (IllegalStateException e2) {
                        throw e2;
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                } catch (IllegalStateException e2222) {
                    throw e2222;
                }
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    long getChangedHolderKey(ViewHolder viewHolder) {
        try {
            return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : (long) viewHolder.mPosition;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.mScrollingChildHelper.setNestedScrollingEnabled(z);
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        try {
            if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
                super.sendAccessibilityEventUnchecked(accessibilityEvent);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void consumePendingUpdateOperations() {
        /*
        r3 = this;
        r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r1 = r3.mFirstLayoutComplete;	 Catch:{ IllegalStateException -> 0x0007 }
        if (r1 != 0) goto L_0x0009;
    L_0x0006:
        return;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        r1 = r3.mDataSetHasChangedAfterLayout;	 Catch:{ IllegalStateException -> 0x001d }
        if (r1 == 0) goto L_0x001f;
    L_0x000d:
        r0 = z;	 Catch:{ IllegalStateException -> 0x001d }
        r1 = 28;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x001d }
        android.support.v4.os.TraceCompat.beginSection(r0);	 Catch:{ IllegalStateException -> 0x001d }
        r3.dispatchLayout();	 Catch:{ IllegalStateException -> 0x001d }
        android.support.v4.os.TraceCompat.endSection();	 Catch:{ IllegalStateException -> 0x001d }
        goto L_0x0006;
    L_0x001d:
        r0 = move-exception;
        throw r0;
    L_0x001f:
        r1 = r3.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x0082 }
        r1 = r1.hasPendingUpdates();	 Catch:{ IllegalStateException -> 0x0082 }
        if (r1 == 0) goto L_0x0006;
    L_0x0027:
        r1 = r3.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x0084 }
        r2 = 4;
        r1 = r1.hasAnyUpdateTypes(r2);	 Catch:{ IllegalStateException -> 0x0084 }
        if (r1 == 0) goto L_0x0068;
    L_0x0030:
        r1 = r3.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x0086 }
        r2 = 11;
        r1 = r1.hasAnyUpdateTypes(r2);	 Catch:{ IllegalStateException -> 0x0086 }
        if (r1 != 0) goto L_0x0068;
    L_0x003a:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0088 }
        r2 = 30;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0088 }
        android.support.v4.os.TraceCompat.beginSection(r1);	 Catch:{ IllegalStateException -> 0x0088 }
        r3.eatRequestLayout();	 Catch:{ IllegalStateException -> 0x0088 }
        r1 = r3.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x0088 }
        r1.preProcess();	 Catch:{ IllegalStateException -> 0x0088 }
        r1 = r3.mLayoutRequestEaten;	 Catch:{ IllegalStateException -> 0x0088 }
        if (r1 != 0) goto L_0x005f;
    L_0x004f:
        r1 = r3.hasUpdatedView();	 Catch:{ IllegalStateException -> 0x008a }
        if (r1 == 0) goto L_0x005a;
    L_0x0055:
        r3.dispatchLayout();	 Catch:{ IllegalStateException -> 0x008c }
        if (r0 == 0) goto L_0x005f;
    L_0x005a:
        r1 = r3.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x008c }
        r1.consumePostponedUpdates();	 Catch:{ IllegalStateException -> 0x008c }
    L_0x005f:
        r1 = 1;
        r3.resumeRequestLayout(r1);	 Catch:{ IllegalStateException -> 0x008e }
        android.support.v4.os.TraceCompat.endSection();	 Catch:{ IllegalStateException -> 0x008e }
        if (r0 == 0) goto L_0x0006;
    L_0x0068:
        r0 = r3.mAdapterHelper;	 Catch:{ IllegalStateException -> 0x0080 }
        r0 = r0.hasPendingUpdates();	 Catch:{ IllegalStateException -> 0x0080 }
        if (r0 == 0) goto L_0x0006;
    L_0x0070:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0080 }
        r1 = 29;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0080 }
        android.support.v4.os.TraceCompat.beginSection(r0);	 Catch:{ IllegalStateException -> 0x0080 }
        r3.dispatchLayout();	 Catch:{ IllegalStateException -> 0x0080 }
        android.support.v4.os.TraceCompat.endSection();	 Catch:{ IllegalStateException -> 0x0080 }
        goto L_0x0006;
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008a }
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0080 }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.consumePendingUpdateOperations():void");
    }

    public int computeHorizontalScrollOffset() {
        try {
            return this.mLayout.canScrollHorizontally() ? this.mLayout.computeHorizontalScrollOffset(this.mState) : 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static boolean access$3600(RecyclerView recyclerView) {
        return recyclerView.awakenScrollBars();
    }

    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void absorbGlows(int r4, int r5) {
        /*
        r3 = this;
        r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        if (r4 >= 0) goto L_0x000f;
    L_0x0004:
        r3.ensureLeftGlow();	 Catch:{ IllegalStateException -> 0x0038 }
        r1 = r3.mLeftGlow;	 Catch:{ IllegalStateException -> 0x0038 }
        r2 = -r4;
        r1.onAbsorb(r2);	 Catch:{ IllegalStateException -> 0x0038 }
        if (r0 == 0) goto L_0x0019;
    L_0x000f:
        if (r4 <= 0) goto L_0x0019;
    L_0x0011:
        r3.ensureRightGlow();	 Catch:{ IllegalStateException -> 0x003a }
        r1 = r3.mRightGlow;	 Catch:{ IllegalStateException -> 0x003a }
        r1.onAbsorb(r4);	 Catch:{ IllegalStateException -> 0x003a }
    L_0x0019:
        if (r5 >= 0) goto L_0x0026;
    L_0x001b:
        r3.ensureTopGlow();	 Catch:{ IllegalStateException -> 0x003c }
        r1 = r3.mTopGlow;	 Catch:{ IllegalStateException -> 0x003c }
        r2 = -r5;
        r1.onAbsorb(r2);	 Catch:{ IllegalStateException -> 0x003c }
        if (r0 == 0) goto L_0x0030;
    L_0x0026:
        if (r5 <= 0) goto L_0x0030;
    L_0x0028:
        r3.ensureBottomGlow();	 Catch:{ IllegalStateException -> 0x003e }
        r0 = r3.mBottomGlow;	 Catch:{ IllegalStateException -> 0x003e }
        r0.onAbsorb(r5);	 Catch:{ IllegalStateException -> 0x003e }
    L_0x0030:
        if (r4 != 0) goto L_0x0034;
    L_0x0032:
        if (r5 == 0) goto L_0x0037;
    L_0x0034:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r3);	 Catch:{ IllegalStateException -> 0x0040 }
    L_0x0037:
        return;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.absorbGlows(int, int):void");
    }

    private void animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
        try {
            viewHolder.setIsRecyclable(false);
            if (this.mItemAnimator.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                postAnimationRunner();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void setScrollState(int i) {
        try {
            if (i != this.mScrollState) {
                try {
                    this.mScrollState = i;
                    if (i != 2) {
                        stopScrollersInternal();
                    }
                    dispatchOnScrollStateChanged(i);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static void access$5300(RecyclerView recyclerView, int i, int i2) {
        recyclerView.defaultOnMeasure(i, i2);
    }

    static {
        String[] strArr = new String[40];
        String str = "\\\u0005)&\u001e9\u0007)&\u000f|\u0004( \u0002~W(*\u001ev\u001b7rLi\u00182'\u0018|\u0005{ \u0002}\u0012#i\nv\u0005{ \b9";
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
                        i4 = 25;
                        break;
                    case at.g /*1*/:
                        i4 = 119;
                        break;
                    case at.i /*2*/:
                        i4 = 91;
                        break;
                    case at.o /*3*/:
                        i4 = 73;
                        break;
                    default:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "K!{\u001a\u000fk\u00187%";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "Z\u00165'\u0003mW($\u0003v\u00033i\u001fz\u00054%\u00009\u00002=\u0004v\u0002/i\r9;:0\u0003l\u0003\u0016(\u0002x\u0010>;Lj\u0012/gLZ\u00167%Lj\u0012/\u0005\r`\u0018.=!x\u0019:.\tkW, \u0018qW:i\u0002v\u0019v'\u0019u\u001b{(\u001e~\u00026,\u0002mY";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "Z\u00165'\u0003mW(*\u001ev\u001b7i\u001bp\u00033&\u0019mW:i x\u000e4<\u0018T\u00165(\u000b|\u0005{:\tmY{\n\ru\u001b{:\tm;:0\u0003l\u0003\u0016(\u0002x\u0010>;Ln\u001e/!LxW5&\u00024\u0019.%\u00009\u0016).\u0019t\u00125=B";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000{!\rjW5&LU\u0016\"&\u0019m::'\r~\u0012)";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000{-\u0003|\u0004{'\u0003mW(<\u001ci\u0018)=Lj\u0014)&\u0000u\u001e5.Lm\u0018{(\u00029\u00169:\u0003u\u0002/,Li\u0018( \u0018p\u00185gLL\u0004>i\u001fz\u00054%\u0000M\u0018\u000b&\u001fp\u00032&\u00029\u001e5:\u0018|\u0016?";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "K!{\u0006\u0002U\u0016\"&\u0019m";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "W\u0018{(\bx\u0007/,\u001e9\u0016/=\rz\u001f>-W9\u00040 \u001ci\u001e5.Lu\u0016\"&\u0019m";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "W\u0018{%\r`\u0018.=Lt\u00165(\u000b|\u0005{(\u0018m\u00168!\t}L{:\u0007p\u0007+ \u0002~W7(\u0015v\u0002/";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "#W\u0018(\u0002w\u0018/i\rz\u0014>:\u001f9\u00194'Ai\u00029%\u0005zW8&\u0002j\u0003)<\u000fm\u0018)i";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "#W\u0018&\u0019u\u0013{'\u0003mW2'\u001fm\u00165=\u0005x\u0003>i\u0018q\u0012{\u0005\r`\u0018.=!x\u0019:.\tkM{";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "#W\u000e'\r{\u001b>i\u0018vW= \u0002}W\u0017(\u0015v\u0002/\u0004\rw\u0016<,\u001e9";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "#W\u001e;\u001ev\u0005{*\u001e|\u0016/ \u0002~W\u0017(\u0015v\u0002/\u0004\rw\u0016<,\u001e9";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "#W\u0018&\u0019u\u0013{'\u0003mW2'\u001fm\u00165=\u0005x\u0003>i\u0018q\u0012{\u0005\r`\u0018.=!x\u0019:.\tkM{";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "#W\u0018%\rj\u0004{ \u001f9\u00194=LxW\u0017(\u0015v\u0002/\u0004\rw\u0016<,\u001e9";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "9\u00194=L\u007f\u0018.'\b7W\u001f \b9\u001650LT\u0018/ \u0003w2-,\u0002m\u0004{.\tmW(\"\u0005i\u0007>-S";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\\\u0005)&\u001e9\u0007)&\u000f|\u0004( \u0002~W(*\u001ev\u001b7rLi\u00182'\u0018|\u0005{ \u0002}\u0012#i\nv\u0005{ \b9";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000{!\rjW5&LU\u0016\"&\u0019m::'\r~\u0012)";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "x\u00148,\u001fj\u001e9 \u0000p\u0003\"";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "]\u0018{'\u0003mW(,\u0018U\u0016\"&\u0019m1)&\u0016|\u0019{ \u00029\u001b:0\u0003l\u0003{&\u001e9\u00048;\u0003u\u001b";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "K!{\u000f\u0019u\u001b\u0012'\u001ax\u001b2-\rm\u0012";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "K!{\u000f\u0019u\u001b\u0012'\u001ax\u001b2-\rm\u0012";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "K!{\u0019\rk\u00032(\u0000P\u0019-(\u0000p\u0013:=\t";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "Z\u00165'\u0003mW=%\u0005w\u0010{>\u0005m\u001f4<\u00189\u0016{\u0005\r`\u0018.=!x\u0019:.\tkW(,\u00187W\u0018(\u0000uW(,\u0018U\u0016\"&\u0019m::'\r~\u0012)i\u001bp\u00033i\r9\u00194'Aw\u00027%Lx\u0005<<\u0001|\u0019/g";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "Z\u00165'\u0003mW8(\u0000uW/!\u0005jW6,\u0018q\u0018?i\u001bq\u001e7,LK\u001280\u000fu\u0012)\u001f\u0005|\u0000{ \u001f9\u00144$\u001cl\u00032'\u000b9\u0016{%\r`\u0018.=Lv\u0005{:\u000fk\u00187%\u0005w\u0010";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "O\u001e>>L";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "9\u001e(i\u0002v\u0003{(L}\u001e),\u000fmW8!\u0005u\u0013{&\n9";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "9\u001e(i\ru\u0005>(\b`W:=\u0018x\u00143,\b9\u00034i\r9%>*\u0015z\u001b>;:p\u0012,sL";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "U\u0016\"&\u0019m::'\r~\u0012)i";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "Z\u00167%\t}W),\u0001v\u0001>\r\tm\u00168!\t}!2,\u001b9\u00002=\u00049\u0016{?\u0005|\u0000{>\u0004p\u00143i\u0005jW5&\u00189\u00117(\u000b~\u0012?i\rjW/$\u001c9\u0013>=\rz\u001f>-B";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "K\u001280\u000fu\u0012)\u001f\u0005|\u0000{!\rjW5&LU\u0016\"&\u0019m::'\r~\u0012)";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    try {
                        boolean z;
                        if (VERSION.SDK_INT != 18) {
                            if (VERSION.SDK_INT != 19) {
                                try {
                                    if (VERSION.SDK_INT != 20) {
                                        z = false;
                                        FORCE_INVALIDATE_DISPLAY_LIST = z;
                                        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
                                        sQuinticInterpolator = new 3();
                                        return;
                                    }
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            }
                        }
                        z = true;
                        FORCE_INVALIDATE_DISPLAY_LIST = z;
                        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
                        sQuinticInterpolator = new 3();
                        return;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                default:
                    strArr2[i2] = str;
                    str = "9\u00194=L\u007f\u0018.'\b7W\u001f \b9\u001650LT\u0018/ \u0003w2-,\u0002m\u0004{.\tmW(\"\u0005i\u0007>-S";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public View focusSearch(View view, int i) {
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        onInterceptFocusSearch = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (onInterceptFocusSearch == null) {
            try {
                if (this.mAdapter != null) {
                    if (this.mLayout != null) {
                        try {
                            if (!(isComputingLayout() || this.mLayoutFrozen)) {
                                eatRequestLayout();
                                onInterceptFocusSearch = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                                resumeRequestLayout(false);
                            }
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
        if (onInterceptFocusSearch == null) {
            return super.focusSearch(view, i);
        }
        return onInterceptFocusSearch;
    }

    private int getAdapterPositionFor(ViewHolder viewHolder) {
        try {
            if (!viewHolder.hasAnyOfTheFlags(524)) {
                if (viewHolder.isBound()) {
                    return this.mAdapterHelper.applyPendingUpdatesToPosition(viewHolder.mPosition);
                }
            }
            return -1;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static boolean access$5000(RecyclerView recyclerView, ViewHolder viewHolder) {
        return recyclerView.canReuseUpdatedViewHolder(viewHolder);
    }

    void eatRequestLayout() {
        try {
            if (!this.mEatRequestLayout) {
                this.mEatRequestLayout = true;
                if (!this.mLayoutFrozen) {
                    this.mLayoutRequestEaten = false;
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    ViewHolder findViewHolderForPosition(int i, boolean z) {
        int i2 = ViewHolder.a;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i3 = 0;
        while (i3 < unfilteredChildCount) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i3));
            if (childViewHolderInt != null) {
                try {
                    if (!childViewHolderInt.isRemoved()) {
                        if (z) {
                            try {
                                if (childViewHolderInt.mPosition == i) {
                                    return childViewHolderInt;
                                }
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                        try {
                            if (childViewHolderInt.getLayoutPosition() == i) {
                                return childViewHolderInt;
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
            int i4 = i3 + 1;
            if (i2 != 0) {
                break;
            }
            i3 = i4;
        }
        return null;
    }

    static void access$800(RecyclerView recyclerView, ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2) {
        recyclerView.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
    }

    void ensureTopGlow() {
        try {
            if (this.mTopGlow == null) {
                try {
                    this.mTopGlow = new EdgeEffectCompat(getContext());
                    if (this.mClipToPadding) {
                        this.mTopGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        if (ViewHolder.a == 0) {
                            return;
                        }
                    }
                    this.mTopGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void onScrollStateChanged(int i) {
    }

    static boolean access$4400() {
        return FORCE_INVALIDATE_DISPLAY_LIST;
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mScrollingChildHelper.dispatchNestedPreFling(f, f2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r9) {
        /*
        r8 = this;
        r2 = 1;
        r1 = 0;
        r4 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        super.draw(r9);
        r0 = r8.mItemDecorations;
        r5 = r0.size();
        r3 = r1;
    L_0x000e:
        if (r3 >= r5) goto L_0x0021;
    L_0x0010:
        r0 = r8.mItemDecorations;
        r0 = r0.get(r3);
        r0 = (android.support.v7.widget.RecyclerView.ItemDecoration) r0;
        r6 = r8.mState;
        r0.onDrawOver(r9, r8, r6);
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x0174;
    L_0x0021:
        r0 = r8.mLeftGlow;	 Catch:{ IllegalStateException -> 0x0135 }
        if (r0 == 0) goto L_0x0171;
    L_0x0025:
        r0 = r8.mLeftGlow;	 Catch:{ IllegalStateException -> 0x0135 }
        r0 = r0.isFinished();	 Catch:{ IllegalStateException -> 0x0135 }
        if (r0 != 0) goto L_0x0171;
    L_0x002d:
        r3 = r9.save();
        r0 = r8.mClipToPadding;	 Catch:{ IllegalStateException -> 0x0137 }
        if (r0 == 0) goto L_0x0139;
    L_0x0035:
        r0 = r8.getPaddingBottom();	 Catch:{ IllegalStateException -> 0x0137 }
    L_0x0039:
        r5 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r9.rotate(r5);	 Catch:{ IllegalStateException -> 0x013c }
        r5 = r8.getHeight();	 Catch:{ IllegalStateException -> 0x013c }
        r5 = -r5;
        r0 = r0 + r5;
        r0 = (float) r0;	 Catch:{ IllegalStateException -> 0x013c }
        r5 = 0;
        r9.translate(r0, r5);	 Catch:{ IllegalStateException -> 0x013c }
        r0 = r8.mLeftGlow;	 Catch:{ IllegalStateException -> 0x013c }
        if (r0 == 0) goto L_0x0140;
    L_0x004d:
        r0 = r8.mLeftGlow;	 Catch:{ IllegalStateException -> 0x013e }
        r0 = r0.draw(r9);	 Catch:{ IllegalStateException -> 0x013e }
        if (r0 == 0) goto L_0x0140;
    L_0x0055:
        r0 = r2;
    L_0x0056:
        r9.restoreToCount(r3);
        r3 = r0;
    L_0x005a:
        r0 = r8.mTopGlow;	 Catch:{ IllegalStateException -> 0x0143 }
        if (r0 == 0) goto L_0x008c;
    L_0x005e:
        r0 = r8.mTopGlow;	 Catch:{ IllegalStateException -> 0x0143 }
        r0 = r0.isFinished();	 Catch:{ IllegalStateException -> 0x0143 }
        if (r0 != 0) goto L_0x008c;
    L_0x0066:
        r5 = r9.save();
        r0 = r8.mClipToPadding;	 Catch:{ IllegalStateException -> 0x0145 }
        if (r0 == 0) goto L_0x007b;
    L_0x006e:
        r0 = r8.getPaddingLeft();	 Catch:{ IllegalStateException -> 0x0145 }
        r0 = (float) r0;	 Catch:{ IllegalStateException -> 0x0145 }
        r6 = r8.getPaddingTop();	 Catch:{ IllegalStateException -> 0x0145 }
        r6 = (float) r6;	 Catch:{ IllegalStateException -> 0x0145 }
        r9.translate(r0, r6);	 Catch:{ IllegalStateException -> 0x0145 }
    L_0x007b:
        r0 = r8.mTopGlow;	 Catch:{ IllegalStateException -> 0x0147 }
        if (r0 == 0) goto L_0x014b;
    L_0x007f:
        r0 = r8.mTopGlow;	 Catch:{ IllegalStateException -> 0x0149 }
        r0 = r0.draw(r9);	 Catch:{ IllegalStateException -> 0x0149 }
        if (r0 == 0) goto L_0x014b;
    L_0x0087:
        r0 = r2;
    L_0x0088:
        r3 = r3 | r0;
        r9.restoreToCount(r5);
    L_0x008c:
        r0 = r8.mRightGlow;	 Catch:{ IllegalStateException -> 0x014e }
        if (r0 == 0) goto L_0x016e;
    L_0x0090:
        r0 = r8.mRightGlow;	 Catch:{ IllegalStateException -> 0x014e }
        r0 = r0.isFinished();	 Catch:{ IllegalStateException -> 0x014e }
        if (r0 != 0) goto L_0x016e;
    L_0x0098:
        r5 = r9.save();
        r6 = r8.getWidth();
        r0 = r8.mClipToPadding;	 Catch:{ IllegalStateException -> 0x0150 }
        if (r0 == 0) goto L_0x0152;
    L_0x00a4:
        r0 = r8.getPaddingTop();	 Catch:{ IllegalStateException -> 0x0150 }
    L_0x00a8:
        r7 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r9.rotate(r7);	 Catch:{ IllegalStateException -> 0x0155 }
        r0 = -r0;
        r0 = (float) r0;	 Catch:{ IllegalStateException -> 0x0155 }
        r6 = -r6;
        r6 = (float) r6;	 Catch:{ IllegalStateException -> 0x0155 }
        r9.translate(r0, r6);	 Catch:{ IllegalStateException -> 0x0155 }
        r0 = r8.mRightGlow;	 Catch:{ IllegalStateException -> 0x0155 }
        if (r0 == 0) goto L_0x0159;
    L_0x00b8:
        r0 = r8.mRightGlow;	 Catch:{ IllegalStateException -> 0x0157 }
        r0 = r0.draw(r9);	 Catch:{ IllegalStateException -> 0x0157 }
        if (r0 == 0) goto L_0x0159;
    L_0x00c0:
        r0 = r2;
    L_0x00c1:
        r0 = r0 | r3;
        r9.restoreToCount(r5);
    L_0x00c5:
        r3 = r8.mBottomGlow;	 Catch:{ IllegalStateException -> 0x015c }
        if (r3 == 0) goto L_0x0119;
    L_0x00c9:
        r3 = r8.mBottomGlow;	 Catch:{ IllegalStateException -> 0x015c }
        r3 = r3.isFinished();	 Catch:{ IllegalStateException -> 0x015c }
        if (r3 != 0) goto L_0x0119;
    L_0x00d1:
        r3 = r9.save();
        r5 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r9.rotate(r5);	 Catch:{ IllegalStateException -> 0x015e }
        r5 = r8.mClipToPadding;	 Catch:{ IllegalStateException -> 0x015e }
        if (r5 == 0) goto L_0x00f9;
    L_0x00de:
        r5 = r8.getWidth();	 Catch:{ IllegalStateException -> 0x0160 }
        r5 = -r5;
        r6 = r8.getPaddingRight();	 Catch:{ IllegalStateException -> 0x0160 }
        r5 = r5 + r6;
        r5 = (float) r5;	 Catch:{ IllegalStateException -> 0x0160 }
        r6 = r8.getHeight();	 Catch:{ IllegalStateException -> 0x0160 }
        r6 = -r6;
        r7 = r8.getPaddingBottom();	 Catch:{ IllegalStateException -> 0x0160 }
        r6 = r6 + r7;
        r6 = (float) r6;	 Catch:{ IllegalStateException -> 0x0160 }
        r9.translate(r5, r6);	 Catch:{ IllegalStateException -> 0x0160 }
        if (r4 == 0) goto L_0x0108;
    L_0x00f9:
        r4 = r8.getWidth();	 Catch:{ IllegalStateException -> 0x0160 }
        r4 = -r4;
        r4 = (float) r4;	 Catch:{ IllegalStateException -> 0x0160 }
        r5 = r8.getHeight();	 Catch:{ IllegalStateException -> 0x0160 }
        r5 = -r5;
        r5 = (float) r5;	 Catch:{ IllegalStateException -> 0x0160 }
        r9.translate(r4, r5);	 Catch:{ IllegalStateException -> 0x0160 }
    L_0x0108:
        r4 = r8.mBottomGlow;	 Catch:{ IllegalStateException -> 0x0162 }
        if (r4 == 0) goto L_0x0115;
    L_0x010c:
        r4 = r8.mBottomGlow;	 Catch:{ IllegalStateException -> 0x0164 }
        r4 = r4.draw(r9);	 Catch:{ IllegalStateException -> 0x0164 }
        if (r4 == 0) goto L_0x0115;
    L_0x0114:
        r1 = r2;
    L_0x0115:
        r0 = r0 | r1;
        r9.restoreToCount(r3);
    L_0x0119:
        if (r0 != 0) goto L_0x016c;
    L_0x011b:
        r1 = r8.mItemAnimator;	 Catch:{ IllegalStateException -> 0x0166 }
        if (r1 == 0) goto L_0x016c;
    L_0x011f:
        r1 = r8.mItemDecorations;	 Catch:{ IllegalStateException -> 0x0168 }
        r1 = r1.size();	 Catch:{ IllegalStateException -> 0x0168 }
        if (r1 <= 0) goto L_0x016c;
    L_0x0127:
        r1 = r8.mItemAnimator;	 Catch:{ IllegalStateException -> 0x0168 }
        r1 = r1.isRunning();	 Catch:{ IllegalStateException -> 0x0168 }
        if (r1 == 0) goto L_0x016c;
    L_0x012f:
        if (r2 == 0) goto L_0x0134;
    L_0x0131:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r8);	 Catch:{ IllegalStateException -> 0x016a }
    L_0x0134:
        return;
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r0 = move-exception;
        throw r0;
    L_0x0139:
        r0 = r1;
        goto L_0x0039;
    L_0x013c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x013e }
    L_0x013e:
        r0 = move-exception;
        throw r0;
    L_0x0140:
        r0 = r1;
        goto L_0x0056;
    L_0x0143:
        r0 = move-exception;
        throw r0;
    L_0x0145:
        r0 = move-exception;
        throw r0;
    L_0x0147:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0149 }
    L_0x0149:
        r0 = move-exception;
        throw r0;
    L_0x014b:
        r0 = r1;
        goto L_0x0088;
    L_0x014e:
        r0 = move-exception;
        throw r0;
    L_0x0150:
        r0 = move-exception;
        throw r0;
    L_0x0152:
        r0 = r1;
        goto L_0x00a8;
    L_0x0155:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0157 }
    L_0x0157:
        r0 = move-exception;
        throw r0;
    L_0x0159:
        r0 = r1;
        goto L_0x00c1;
    L_0x015c:
        r0 = move-exception;
        throw r0;
    L_0x015e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0160 }
    L_0x0160:
        r0 = move-exception;
        throw r0;
    L_0x0162:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0164 }
    L_0x0164:
        r0 = move-exception;
        throw r0;
    L_0x0166:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0168 }
    L_0x0168:
        r0 = move-exception;
        throw r0;
    L_0x016a:
        r0 = move-exception;
        throw r0;
    L_0x016c:
        r2 = r0;
        goto L_0x012f;
    L_0x016e:
        r0 = r3;
        goto L_0x00c5;
    L_0x0171:
        r3 = r1;
        goto L_0x005a;
    L_0x0174:
        r3 = r0;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void offsetPositionRecordsForMove(int r11, int r12) {
        /*
        r10 = this;
        r1 = 1;
        r4 = 0;
        r5 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r10.mChildHelper;
        r6 = r0.getUnfilteredChildCount();
        if (r11 >= r12) goto L_0x000f;
    L_0x000c:
        r0 = -1;
        if (r5 == 0) goto L_0x0056;
    L_0x000f:
        r0 = r1;
        r2 = r11;
        r3 = r12;
    L_0x0012:
        if (r4 >= r6) goto L_0x0043;
    L_0x0014:
        r7 = r10.mChildHelper;
        r7 = r7.getUnfilteredChildAt(r4);
        r7 = getChildViewHolderInt(r7);
        if (r7 == 0) goto L_0x003f;
    L_0x0020:
        r8 = r7.mPosition;	 Catch:{ IllegalStateException -> 0x004c }
        if (r8 < r3) goto L_0x003f;
    L_0x0024:
        r8 = r7.mPosition;	 Catch:{ IllegalStateException -> 0x004e }
        if (r8 <= r2) goto L_0x002a;
    L_0x0028:
        if (r5 == 0) goto L_0x003f;
    L_0x002a:
        r8 = r7.mPosition;	 Catch:{ IllegalStateException -> 0x0052 }
        if (r8 != r11) goto L_0x0036;
    L_0x002e:
        r8 = r12 - r11;
        r9 = 0;
        r7.offsetPosition(r8, r9);	 Catch:{ IllegalStateException -> 0x0054 }
        if (r5 == 0) goto L_0x003a;
    L_0x0036:
        r8 = 0;
        r7.offsetPosition(r0, r8);	 Catch:{ IllegalStateException -> 0x0054 }
    L_0x003a:
        r7 = r10.mState;
        android.support.v7.widget.RecyclerView.State.access$1902(r7, r1);
    L_0x003f:
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x0012;
    L_0x0043:
        r0 = r10.mRecycler;
        r0.offsetPositionRecordsForMove(r11, r12);
        r10.requestLayout();
        return;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r2 = r12;
        r3 = r11;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.offsetPositionRecordsForMove(int, int):void");
    }

    private void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo) {
        try {
            viewHolder.setFlags(0, 8192);
            if (State.access$2500(this.mState)) {
                if (viewHolder.isUpdated()) {
                    try {
                        if (!(viewHolder.isRemoved() || viewHolder.shouldIgnore())) {
                            this.mViewInfoStore.addToOldChangeHolders(getChangedHolderKey(viewHolder), viewHolder);
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
            this.mViewInfoStore.addToPreLayout(viewHolder, itemHolderInfo);
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    boolean isAccessibilityEnabled() {
        try {
            if (this.mAccessibilityManager != null) {
                if (this.mAccessibilityManager.isEnabled()) {
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

    public void setClipToPadding(boolean z) {
        try {
            if (z != this.mClipToPadding) {
                invalidateGlows();
            }
            try {
                this.mClipToPadding = z;
                super.setClipToPadding(z);
                if (this.mFirstLayoutComplete) {
                    requestLayout();
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void setDataSetChangedAfterLayout() {
        int i = ViewHolder.a;
        try {
            if (!this.mDataSetHasChangedAfterLayout) {
                this.mDataSetHasChangedAfterLayout = true;
                int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
                int i2 = 0;
                while (i2 < unfilteredChildCount) {
                    ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i2));
                    if (childViewHolderInt != null) {
                        try {
                            if (!childViewHolderInt.shouldIgnore()) {
                                childViewHolderInt.addFlags(512);
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    i2++;
                    if (i != 0) {
                        break;
                    }
                }
                this.mRecycler.setAdapterPositionsAsUnknown();
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void scrollBy(int i, int i2) {
        try {
            if (this.mLayout == null) {
                Log.e(z[6], z[7]);
                return;
            }
            try {
                if (!this.mLayoutFrozen) {
                    boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
                    boolean canScrollVertically = this.mLayout.canScrollVertically();
                    if (canScrollHorizontally || canScrollVertically) {
                        if (!canScrollHorizontally) {
                            i = 0;
                        }
                        if (!canScrollVertically) {
                            i2 = 0;
                        }
                        scrollByInternal(i, i2, null);
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private boolean hasUpdatedView() {
        int i = ViewHolder.a;
        int childCount = this.mChildHelper.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i2));
            if (childViewHolderInt != null) {
                try {
                    if (!(childViewHolderInt.shouldIgnore() && i == 0)) {
                        try {
                            if (childViewHolderInt.isUpdated()) {
                                return true;
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
            i2++;
            if (i != 0) {
                return false;
            }
        }
        return false;
    }

    void viewRangeUpdate(int i, int i2, Object obj) {
        int i3 = ViewHolder.a;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i4 = i + i2;
        int i5 = 0;
        while (i5 < unfilteredChildCount) {
            View unfilteredChildAt = this.mChildHelper.getUnfilteredChildAt(i5);
            ViewHolder childViewHolderInt = getChildViewHolderInt(unfilteredChildAt);
            if (childViewHolderInt != null) {
                try {
                    if (!(childViewHolderInt.shouldIgnore() && i3 == 0)) {
                        try {
                            if (childViewHolderInt.mPosition >= i) {
                                try {
                                    if (childViewHolderInt.mPosition < i4) {
                                        childViewHolderInt.addFlags(2);
                                        childViewHolderInt.addChangePayload(obj);
                                        ((LayoutParams) unfilteredChildAt.getLayoutParams()).mInsetsDirty = true;
                                    }
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
            int i6 = i5 + 1;
            if (i3 != 0) {
                break;
            }
            i5 = i6;
        }
        this.mRecycler.viewRangeUpdate(i, i2);
    }

    private boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        try {
            if (this.mItemAnimator != null) {
                if (!this.mItemAnimator.canReuseUpdatedViewHolder(viewHolder)) {
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

    public void onChildDetachedFromWindow(View view) {
    }

    static void access$3000(RecyclerView recyclerView) {
        recyclerView.onEnterLayoutOrScroll();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float getScrollFactor() {
        /*
        r4 = this;
        r0 = r4.mScrollFactor;
        r1 = 1;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x003a;
    L_0x0007:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r1 = r4.getContext();	 Catch:{ IllegalStateException -> 0x0036 }
        r1 = r1.getTheme();	 Catch:{ IllegalStateException -> 0x0036 }
        r2 = 16842829; // 0x101004d float:2.3693774E-38 double:8.321463E-317;
        r3 = 1;
        r1 = r1.resolveAttribute(r2, r0, r3);	 Catch:{ IllegalStateException -> 0x0036 }
        if (r1 == 0) goto L_0x0034;
    L_0x001e:
        r1 = r4.getContext();	 Catch:{ IllegalStateException -> 0x0038 }
        r1 = r1.getResources();	 Catch:{ IllegalStateException -> 0x0038 }
        r1 = r1.getDisplayMetrics();	 Catch:{ IllegalStateException -> 0x0038 }
        r0 = r0.getDimension(r1);	 Catch:{ IllegalStateException -> 0x0038 }
        r4.mScrollFactor = r0;	 Catch:{ IllegalStateException -> 0x0038 }
        r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IllegalStateException -> 0x0038 }
        if (r0 == 0) goto L_0x003a;
    L_0x0034:
        r0 = 0;
    L_0x0035:
        return r0;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r0 = r4.mScrollFactor;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.getScrollFactor():float");
    }

    private void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    static int access$5500(RecyclerView recyclerView, ViewHolder viewHolder) {
        return recyclerView.getAdapterPositionFor(viewHolder);
    }

    public int computeHorizontalScrollExtent() {
        try {
            return this.mLayout.canScrollHorizontally() ? this.mLayout.computeHorizontalScrollExtent(this.mState) : 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
