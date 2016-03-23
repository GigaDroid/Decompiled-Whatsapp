package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.FragmentManager.OnBackStackChangedListener;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

/* compiled from: FragmentManager */
final class FragmentManagerImpl extends FragmentManager implements LayoutInflaterFactory {
    static final Interpolator ACCELERATE_CUBIC;
    static final Interpolator ACCELERATE_QUINT;
    static boolean DEBUG;
    static final Interpolator DECELERATE_CUBIC;
    static final Interpolator DECELERATE_QUINT;
    static final boolean HONEYCOMB;
    static Field sAnimationListenerField;
    private static final String[] z;
    ArrayList mActive;
    ArrayList mAdded;
    ArrayList mAvailBackStackIndices;
    ArrayList mAvailIndices;
    ArrayList mBackStack;
    ArrayList mBackStackChangeListeners;
    ArrayList mBackStackIndices;
    FragmentContainer mContainer;
    ArrayList mCreatedMenus;
    int mCurState;
    boolean mDestroyed;
    Runnable mExecCommit;
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    FragmentHostCallback mHost;
    boolean mNeedMenuInvalidate;
    String mNoTransactionsBecause;
    Fragment mParent;
    ArrayList mPendingActions;
    SparseArray mStateArray;
    Bundle mStateBundle;
    boolean mStateSaved;
    Runnable[] mTmpActions;

    class 1 implements Runnable {
        final FragmentManagerImpl this$0;

        public void run() {
            this.this$0.execPendingActions();
        }

        1(FragmentManagerImpl fragmentManagerImpl) {
            this.this$0 = fragmentManagerImpl;
        }
    }

    class 4 implements Runnable {
        final FragmentManagerImpl this$0;
        final int val$flags;
        final int val$id;

        4(FragmentManagerImpl fragmentManagerImpl, int i, int i2) {
            this.this$0 = fragmentManagerImpl;
            this.val$id = i;
            this.val$flags = i2;
        }

        public void run() {
            this.this$0.popBackStackState(this.this$0.mHost.getHandler(), null, this.val$id, this.val$flags);
        }
    }

    /* compiled from: FragmentManager */
    class AnimateOnHWLayerIfNeededListener implements AnimationListener {
        private AnimationListener mOrignalListener;
        private boolean mShouldRunOnHWLayer;
        private View mView;

        class 1 implements Runnable {
            final AnimateOnHWLayerIfNeededListener this$0;

            1(AnimateOnHWLayerIfNeededListener animateOnHWLayerIfNeededListener) {
                this.this$0 = animateOnHWLayerIfNeededListener;
            }

            public void run() {
                ViewCompat.setLayerType(AnimateOnHWLayerIfNeededListener.access$000(this.this$0), 2, null);
            }
        }

        class 2 implements Runnable {
            final AnimateOnHWLayerIfNeededListener this$0;

            public void run() {
                ViewCompat.setLayerType(AnimateOnHWLayerIfNeededListener.access$000(this.this$0), 0, null);
            }

            2(AnimateOnHWLayerIfNeededListener animateOnHWLayerIfNeededListener) {
                this.this$0 = animateOnHWLayerIfNeededListener;
            }
        }

        @CallSuper
        public void onAnimationStart(Animation animation) {
            if (this.mView != null) {
                this.mShouldRunOnHWLayer = FragmentManagerImpl.shouldRunOnHWLayer(this.mView, animation);
                if (this.mShouldRunOnHWLayer) {
                    this.mView.post(new 1(this));
                }
            }
            if (this.mOrignalListener != null) {
                this.mOrignalListener.onAnimationStart(animation);
            }
        }

        public AnimateOnHWLayerIfNeededListener(View view, Animation animation, AnimationListener animationListener) {
            this.mOrignalListener = null;
            this.mShouldRunOnHWLayer = false;
            this.mView = null;
            if (view != null && animation != null) {
                this.mOrignalListener = animationListener;
                this.mView = view;
            }
        }

        static View access$000(AnimateOnHWLayerIfNeededListener animateOnHWLayerIfNeededListener) {
            return animateOnHWLayerIfNeededListener.mView;
        }

        @CallSuper
        public void onAnimationEnd(Animation animation) {
            if (this.mView != null && this.mShouldRunOnHWLayer) {
                this.mView.post(new 2(this));
            }
            if (this.mOrignalListener != null) {
                this.mOrignalListener.onAnimationEnd(animation);
            }
        }

        public AnimateOnHWLayerIfNeededListener(View view, Animation animation) {
            this.mOrignalListener = null;
            this.mShouldRunOnHWLayer = false;
            this.mView = null;
            if (view != null && animation != null) {
                this.mView = view;
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.mOrignalListener != null) {
                this.mOrignalListener.onAnimationRepeat(animation);
            }
        }
    }

    class 5 extends AnimateOnHWLayerIfNeededListener {
        final FragmentManagerImpl this$0;
        final Fragment val$fragment;

        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            if (this.val$fragment.mAnimatingAway != null) {
                this.val$fragment.mAnimatingAway = null;
                this.this$0.moveToState(this.val$fragment, this.val$fragment.mStateAfterAnimating, 0, 0, false);
            }
        }

        5(FragmentManagerImpl fragmentManagerImpl, View view, Animation animation, Fragment fragment) {
            this.this$0 = fragmentManagerImpl;
            this.val$fragment = fragment;
            super(view, animation);
        }
    }

    /* compiled from: FragmentManager */
    class FragmentTag {
        public static final int[] Fragment;

        static {
            Fragment = new int[]{16842755, 16842960, 16842961};
        }
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        try {
            if (fragment.mIndex < 0) {
                throwException(new IllegalStateException(z[73] + fragment + z[72]));
            }
            bundle.putInt(str, fragment.mIndex);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Fragment findFragmentByTag(String str) {
        boolean z = Fragment.a;
        try {
            int size;
            Fragment fragment;
            int i;
            if (!(this.mAdded == null || str == null)) {
                size = this.mAdded.size() - 1;
                while (size >= 0) {
                    fragment = (Fragment) this.mAdded.get(size);
                    if (fragment != null) {
                        try {
                            if (str.equals(fragment.mTag)) {
                                return fragment;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    i = size - 1;
                    if (!z) {
                        size = i;
                    }
                }
            }
            try {
                break;
                if (!(this.mActive == null || str == null)) {
                    size = this.mActive.size() - 1;
                    while (size >= 0) {
                        fragment = (Fragment) this.mActive.get(size);
                        if (fragment != null) {
                            try {
                                if (str.equals(fragment.mTag)) {
                                    return fragment;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                        i = size - 1;
                        if (z) {
                            break;
                        }
                        size = i;
                    }
                }
                return null;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public void addFragment(Fragment fragment, boolean z) {
        try {
            if (this.mAdded == null) {
                this.mAdded = new ArrayList();
            }
            try {
                if (DEBUG) {
                    Log.v(z[20], z[19] + fragment);
                }
                try {
                    makeActive(fragment);
                    if (!fragment.mDetached) {
                        if (this.mAdded.contains(fragment)) {
                            throw new IllegalStateException(z[21] + fragment);
                        }
                        try {
                            this.mAdded.add(fragment);
                            fragment.mAdded = true;
                            fragment.mRemoving = false;
                            if (fragment.mHasMenu) {
                                if (fragment.mMenuVisible) {
                                    this.mNeedMenuInvalidate = true;
                                }
                            }
                            if (z) {
                                try {
                                    moveToState(fragment);
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }

    static {
        boolean z = true;
        String[] strArr = new String[192];
        String str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
        boolean z2 = true;
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
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 27;
                        break;
                    case at.i /*2*/:
                        i3 = 59;
                        break;
                    case at.o /*3*/:
                        i3 = 18;
                        break;
                    default:
                        i3 = 119;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "];";
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0014zMw6\u000bwhf\u0016\u0013~\u00012\u0016\u0003\u007fR|\u0010G}Is\u0010\n~UfWD";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0014zMw6\u000bwhf\u0016\u0013~\u00012\u0016\u0003\u007fR|\u0010GyZq\u001cGhOs\u0014\f;\u0018";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "!zR~\u0002\u0015~\u001ba\u0016\u0011rUuW\u0014oZf\u0012];Zq\u0003\u000em^2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "!zR~\u0002\u0015~\u001ba\u0016\u0011rUuW\u0014oZf\u0012];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "GsZaW\u0004w^s\u0005\u0002\u007f\u001b{\u0019\u0003~C(W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "GsZaW\u0013zIu\u0012\u0013;U}\u0003GrU2\u0011\u0015z\\\u007f\u0012\to\u001b\u007f\u0016\tz\\w\u0005];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0006u_`\u0018\u000e\u007f\u0001f\u0016\u0015|^f(\u0015~JM\u0004\u0013zOw";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "4zMw\u0013GhOs\u0003\u0002;TtW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    str = "];";
                    z2 = true;
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    strArr2 = strArr3;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0006u_`\u0018\u000e\u007f\u0001f\u0016\u0015|^f(\u0014oZf\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0014zMw6\u000bwhf\u0016\u0013~\u00012\u0019\b;]`\u0016\u0000v^|\u0003\u0014:";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "GsZaW\u0004w^s\u0005\u0002\u007f\u001b{\u0019\u0003~C(W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    str = "!zR~\u0002\u0015~\u001ba\u0016\u0011rUuW\u0014oZf\u0012];Zq\u0003\u000em^2";
                    z2 = true;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "\u0006\u007f_(W";
                    z2 = true;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "!iZu\u001a\u0002uO2\u0016\u000bi^s\u0013\u001e;Zv\u0013\u0002\u007f\u00012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "5~Xg\u0005\u0014rMwW\u0002uO`\u000eGoT2\u0012\u001f~Xg\u0003\u0002K^|\u0013\u000eu\\F\u0005\u0006uHs\u0014\u0013rT|\u0004";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "*nHfW\u0005~\u001bq\u0016\u000bw^vW\u0001iT\u007fW\nzR|W\u0013sIw\u0016\u0003;TtW\u0017iTq\u0012\u0014h";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "&wW}\u0014\u0006o^vW\u0001iZu\u001a\u0002uO2\u001e\t\u007f^jW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "!iZu\u001a\u0002uO2\u0019\b;W}\u0019\u0000~I2\u0012\u001frHf\u0004G}T`W\f~B2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    str = "!iZu\u001a\u0002uO2\u0019\b;W}\u0019\u0000~I2\u0012\u001frHf\u0004G}T`W\f~B2";
                    z2 = true;
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    strArr2 = strArr3;
                    str = "];R|\u0013\u0002c\u001b";
                    z2 = true;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "];R|\u0013\u0002c\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "$zU|\u0018\u0013;Zq\u0014\u0002hH26\trVs\u0003\u000etU5\u0004Gvw{\u0004\u0013~Uw\u0005G}Rw\u001b\u0003";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\nWRa\u0003\u0002u^`";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = ")t\u001bt\u001e\u0002w_2\u0000\u000eoS2\u0003\u000f~\u001b|\u0016\n~\u001b\u007f;\u000ehOw\u0019\u0002i\u001b{\u0004G}Tg\u0019\u0003;R|W&uR\u007f\u0016\u0013rT|W\u0004wZa\u0004";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "GrH2\u0019\bo\u001bq\u0002\u0015i^|\u0003\u000bb\u001b{\u0019GoSwW!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "!iZu\u001a\u0002uO2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "$zU2\u0019\bo\u001bb\u0012\u0015}T`\u001aGoS{\u0004GzXf\u001e\bu\u001b{\u0019\u0014r_wW\b}\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "$zU2\u0019\bo\u001bb\u0012\u0015}T`\u001aGoS{\u0004GzXf\u001e\bu\u001bs\u0011\u0013~I2\u0018\tHZd\u0012.uHf\u0016\tx^A\u0003\u0006o^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u000fr_wMG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "!i^w\u001e\t|\u001bt\u0005\u0006|Vw\u0019\u0013;R|\u0013\u0002c\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "&\u007f_{\u0019\u0000;Zd\u0016\u000ewZp\u001b\u0002;Ys\u0014\f;Hf\u0016\u0004p\u001b{\u0019\u0003~C2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "GoT2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "&\u007f_{\u0019\u0000;Ys\u0014\f;Hf\u0016\u0004p\u001b{\u0019\u0003~C2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "4~Of\u001e\t|\u001bp\u0016\u0004p\u001ba\u0003\u0006xP2\u001e\t\u007f^jW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "GlRf\u001fG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = ")t\u001bz\u0018\u0014o";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "&xO{\u0001\u000eoB2\u001f\u0006h\u001bp\u0012\u0002u\u001bv\u0012\u0014oI}\u000e\u0002\u007f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "!i^w\u001e\t|\u001bp\u0016\u0004p\u001ba\u0003\u0006xP2\u001e\t\u007f^jW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0014sTeMG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0006u_`\u0018\u000e\u007f\u0001g\u0004\u0002idd\u001e\u0014rY~\u00128sR|\u0003";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0006u_`\u0018\u000e\u007f\u0001d\u001e\u0002lda\u0003\u0006o^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "GrU2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u001af";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "G;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "!zR~\u0012\u0003;_g\u001a\u0017rUuW\u0014oZf\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "!zR~\u0012\u0003;_g\u001a\u0017rUuW\u0014oZf\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "G;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "&xO{\u0001\u000eoB2\u0004\u0013zOwM";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "GrH2\u0019\bo\u001bq\u0002\u0015i^|\u0003\u000bb\u001b{\u0019GoSwW!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "!iZu\u001a\u0002uO2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "\u0015~Os\u001e\tUT|4\bu]{\u0010];Pw\u0012\u0017rUuW\u0015~Os\u001e\t~_2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "N;]}\u0005G}Is\u0010\n~UfW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0006u_`\u0018\u000e\u007f\u0001g\u0004\u0002idd\u001e\u0014rY~\u00128sR|\u0003";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = ")t\u001bd\u001e\u0002l\u001bt\u0018\u0012u_2\u0011\bi\u001b{\u0013G+C";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "\ntMw\u0011\u0015tV26$OrD>3BdQ%\"ZoW3];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "\ntMw\u0003\b;x@2&O~VMG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u0006u_`\u0018\u000e\u007f\u0001f\u0016\u0015|^f(\u0014oZf\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "!iZu\u001a\u0002uO2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "G\u007fRvW\ttO2\u0014\u0006wW2\u0003\u000fiTg\u0010\u000f;O}W\u0014nKw\u0005ItUV\u0012\u0013zXz_N";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "\ntMw\u0011\u0015tV2$3TkB2#!\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u0006u_`\u0018\u000e\u007f\u0001f\u0016\u0015|^f(\u0015~JM\u0004\u0013zOw";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "\ntMw\u0011\u0015tV2$3ZiF2#!\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "\ntMw\u0003\b;zQ#.MrF.8XiW63^\u007f(W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "\ntMw\u0011\u0015tV2%\"Hn_2#!\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "\ntMw\u0003\b;iW$2V~VMG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "G\u007fRvW\ttO2\u0014\u0006wW2\u0003\u000fiTg\u0010\u000f;O}W\u0014nKw\u0005ItUS\u0003\u0013zXz_N";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "!iZu\u001a\u0002uO2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "\ntMw\u0003\b;hF65O~VMG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "\ntMw\u0011\u0015tV245^zF2#!\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "\u0006u_`\u0018\u000e\u007f\u0001d\u001e\u0002lda\u0003\u0006o^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "G3";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "GoT2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "&\u007f_{\u0019\u0000;Ys\u0014\f;Hf\u0016\u0004p\u001b{\u0019\u0003~C2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "4~Of\u001e\t|\u001bp\u0016\u0004p\u001ba\u0003\u0006xP2\u001e\t\u007f^jW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "GlRf\u001fG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "\u0015~V}\u0001\u0002;]`\u0018\n;_w\u0003\u0006xS(W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "\u0003~Os\u0014\u000f!\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "\u0015~Hf\u0018\u0015~z~\u001b4oZf\u0012];Ys\u0014\f;Hf\u0016\u0004p\u001b1";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = ")t\u001b{\u0019\u0014oZ|\u0003\u000ezOw\u0013G}Is\u0010\n~UfW\u0001tI2\u001e\t\u007f^jWD";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "\u0015~Hf\u0018\u0015~z~\u001b4oZf\u0012];IwZ\u0006oOs\u0014\u000frUuW\u0015~Os\u001e\t~_2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u0015~Hf\u0018\u0015~z~\u001b4oZf\u0012];Zd\u0016\u000ew\u001b1";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "G;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "\u0015~Hf\u0018\u0015~z~\u001b4oZf\u0012];Zq\u0003\u000em^2T";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "\u0006u_`\u0018\u000e\u007f\u0001d\u001e\u0002lda\u0003\u0006o^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "5~\u0016s\u0003\u0013zXz\u001e\t|\u001b`\u0012\u0013zR|\u0012\u0003;]`\u0016\u0000v^|\u0003G";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "GoZ`\u0010\u0002o\u001b|\u0018GwT|\u0010\u0002i\u001bw\u000f\u000ehOaMG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "&wIw\u0016\u0003b\u001bs\u0013\u0003~_3";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "\u0015~Hf\u0018\u0015~z~\u001b4oZf\u0012];Zv\u0013\u0002\u007f\u001b1";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "G3R|\u0013\u0002c\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "N!\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "G;VB\u0016\u0015~UfJ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "G;V\\\u00183iZ|\u0004\u0006xO{\u0018\thyw\u0014\u0006nHwJ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "G;\u0018";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "%zXyW4oZq\u001c]";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "!iZu\u001a\u0002uOaW$i^s\u0003\u0002\u007f\u001b_\u0012\tnH(";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "G;V\\\u0012\u0002\u007fvw\u0019\u0012RUd\u0016\u000br_s\u0003\u0002&";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "G;\u0018";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = "G;VS\u0001\u0006rW[\u0019\u0003rXw\u0004];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = "&xO{\u0001\u0002;}`\u0016\u0000v^|\u0003\u0014;R|W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "G;\u0018";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = "&\u007f_w\u0013G]Is\u0010\n~Uf\u0004]";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 151;
                    str = "G;\u0018";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 152;
                    str = "%zXyW4oZq\u001cGRUv\u001e\u0004~H(";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 153;
                    str = "G;VQ\u0002\u0015HOs\u0003\u0002&";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 154;
                    str = "G;\u001b2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 155;
                    str = "Gvhf\u0016\u0013~hs\u0001\u0002\u007f\u0006";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 156;
                    str = "Gv\u007fw\u0004\u0013iTk\u0012\u0003&";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 157;
                    str = "G;VQ\u0018\toZ{\u0019\u0002i\u0006";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 158;
                    str = "];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 159;
                    str = "G;\u0018";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 160;
                    str = "\nZMs\u001e\u000bYZq\u001c4oZq\u001c.u_{\u0014\u0002h\u00012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 161;
                    str = "7~Uv\u001e\t|\u001bS\u0014\u0013rT|\u0004]";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 162;
                    str = "G;VZ\u0018\u0014o\u0006";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 163;
                    str = "];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 164;
                    str = "G;\u0018";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 165;
                    str = "];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 166;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005GvRa\u0014GhOs\u0003\u0002!";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 167;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 168;
                    str = "\u0006\u007f_2\u0011\u0015tV2\u0016\u0013oZq\u001f];";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 169;
                    str = "\u0006oOs\u0014\u000f!\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 170;
                    str = "!iZu\u001a\u0002uO2\u0016\u000bi^s\u0013\u001e;Zv\u0013\u0002\u007f\u00012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 171;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 172;
                    str = "&wIw\u0016\u0003b\u001bs\u0003\u0013zXz\u0012\u0003";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 173;
                    str = "G~C{\u0004\u0013rUuJ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 174;
                    str = "\u0001iZu\u001a\u0002uO";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 175;
                    str = "];\u007fg\u0007\u000brXs\u0003\u0002;RvWWc";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 176;
                    str = "GlRf\u001fGzU}\u0003\u000f~I2\u0011\u0015z\\\u007f\u0012\to\u001bt\u0018\u0015;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 177;
                    str = "];vg\u0004\u0013;Hb\u0012\u0004r]kW\u0012uRc\u0002\u0002;Z|\u0013\u0015tRvM\u000e\u007f\u00172\u0016\t\u007fI}\u001e\u0003!Os\u0010K;T`W\u000fzMwW\u0006;Ks\u0005\u0002uO2\u0000\u000eoS2\u0016\t;RvW\u0001tI2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 178;
                    str = "K;Os\u0010G";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 179;
                    str = "!iZu\u001a\u0002uO2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 180;
                    str = "G\u007fRvW\ttO2\u0014\u0015~Zf\u0012Gz\u001bd\u001e\u0002l\u0015";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 181;
                    str = "G}Us\u001a\u0002&";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 182;
                    str = "K;T`W\u0017zIw\u0019\u0013;RvWWc";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 183;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 184;
                    str = "\u0004wZa\u0004";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 185;
                    str = "\bux`\u0012\u0006o^D\u001e\u0002l\u00012\u001e\u0003&\u000bj";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 186;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 187;
                    str = "\u0015~V}\u0001\u0002!\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 188;
                    str = "Gu^a\u0003\u000eu\\/";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 189;
                    str = "%z_2\u001e\u0003!\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 190;
                    str = "7tKb\u001e\t|\u001bp\u0016\u0004p\u001ba\u0003\u0006xP2\u0004\u0013zOwMG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 191;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        DEBUG = false;
                        if (VERSION.SDK_INT < 11) {
                            z = false;
                        }
                        HONEYCOMB = z;
                        sAnimationListenerField = null;
                        DECELERATE_QUINT = new DecelerateInterpolator(2.5f);
                        DECELERATE_CUBIC = new DecelerateInterpolator(1.5f);
                        ACCELERATE_QUINT = new AccelerateInterpolator(2.5f);
                        ACCELERATE_CUBIC = new AccelerateInterpolator(1.5f);
                        return;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "!iZu\u001a\u0002uO_\u0016\tz\\w\u0005";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    public void dispatchResume() {
        this.mStateSaved = false;
        moveToState(5, false);
    }

    public void dispatchOptionsMenuClosed(Menu menu) {
        boolean z = Fragment.a;
        if (this.mAdded != null) {
            int i = 0;
            while (i < this.mAdded.size()) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null) {
                    try {
                        fragment.performOptionsMenuClosed(menu);
                    } catch (IllegalArgumentException e) {
                        throw e;
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
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r3 = this;
        r0 = new java.lang.StringBuilder;
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0.<init>(r1);
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r2 = 60;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = java.lang.System.identityHashCode(r3);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = java.lang.Integer.toHexString(r1);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r2 = 59;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = r3.mParent;	 Catch:{ IllegalArgumentException -> 0x0044 }
        if (r1 == 0) goto L_0x0031;
    L_0x0028:
        r1 = r3.mParent;	 Catch:{ IllegalArgumentException -> 0x0046 }
        android.support.v4.util.DebugUtils.buildShortClassTag(r1, r0);	 Catch:{ IllegalArgumentException -> 0x0046 }
        r1 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalArgumentException -> 0x0046 }
        if (r1 == 0) goto L_0x0036;
    L_0x0031:
        r1 = r3.mHost;	 Catch:{ IllegalArgumentException -> 0x0046 }
        android.support.v4.util.DebugUtils.buildShortClassTag(r1, r0);	 Catch:{ IllegalArgumentException -> 0x0046 }
    L_0x0036:
        r1 = z;
        r2 = 61;
        r1 = r1[r2];
        r0.append(r1);
        r0 = r0.toString();
        return r0;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.toString():java.lang.String");
    }

    ArrayList retainNonConfig() {
        boolean z = Fragment.a;
        if (this.mActive == null) {
            return null;
        }
        ArrayList arrayList = null;
        int i = 0;
        while (i < this.mActive.size()) {
            Fragment fragment = (Fragment) this.mActive.get(i);
            if (fragment != null) {
                try {
                    if (fragment.mRetainInstance) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        try {
                            arrayList.add(fragment);
                            fragment.mRetaining = true;
                            try {
                                fragment.mTargetIndex = fragment.mTarget != null ? fragment.mTarget.mIndex : -1;
                                if (DEBUG) {
                                    Log.v(z[75], z[74] + fragment);
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            int i2 = i + 1;
            if (z) {
                return arrayList;
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean execPendingActions() {
        /*
        r7 = this;
        r2 = 1;
        r0 = 0;
        r4 = android.support.v4.app.Fragment.a;
        r1 = r7.mExecutingActions;	 Catch:{ IllegalArgumentException -> 0x0014 }
        if (r1 == 0) goto L_0x0016;
    L_0x0008:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0014 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0014 }
        r2 = 22;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0014 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0014 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r1 = android.os.Looper.myLooper();	 Catch:{ IllegalArgumentException -> 0x0032 }
        r3 = r7.mHost;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r3 = r3.getHandler();	 Catch:{ IllegalArgumentException -> 0x0032 }
        r3 = r3.getLooper();	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r1 == r3) goto L_0x0034;
    L_0x0026:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0032 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r1 = r0;
    L_0x0035:
        monitor-enter(r7);
        r3 = r7.mPendingActions;	 Catch:{ all -> 0x008d }
        if (r3 == 0) goto L_0x0042;
    L_0x003a:
        r3 = r7.mPendingActions;	 Catch:{ all -> 0x008d }
        r3 = r3.size();	 Catch:{ all -> 0x008d }
        if (r3 != 0) goto L_0x0045;
    L_0x0042:
        monitor-exit(r7);	 Catch:{ all -> 0x008d }
        if (r4 == 0) goto L_0x0090;
    L_0x0045:
        r1 = r7.mPendingActions;	 Catch:{ all -> 0x008d }
        r3 = r1.size();	 Catch:{ all -> 0x008d }
        r1 = r7.mTmpActions;	 Catch:{ IllegalArgumentException -> 0x0089 }
        if (r1 == 0) goto L_0x0054;
    L_0x004f:
        r1 = r7.mTmpActions;	 Catch:{ IllegalArgumentException -> 0x0089 }
        r1 = r1.length;	 Catch:{ IllegalArgumentException -> 0x0089 }
        if (r1 >= r3) goto L_0x0058;
    L_0x0054:
        r1 = new java.lang.Runnable[r3];	 Catch:{ IllegalArgumentException -> 0x008b }
        r7.mTmpActions = r1;	 Catch:{ IllegalArgumentException -> 0x008b }
    L_0x0058:
        r1 = r7.mPendingActions;	 Catch:{ all -> 0x008d }
        r5 = r7.mTmpActions;	 Catch:{ all -> 0x008d }
        r1.toArray(r5);	 Catch:{ all -> 0x008d }
        r1 = r7.mPendingActions;	 Catch:{ all -> 0x008d }
        r1.clear();	 Catch:{ all -> 0x008d }
        r1 = r7.mHost;	 Catch:{ all -> 0x008d }
        r1 = r1.getHandler();	 Catch:{ all -> 0x008d }
        r5 = r7.mExecCommit;	 Catch:{ all -> 0x008d }
        r1.removeCallbacks(r5);	 Catch:{ all -> 0x008d }
        monitor-exit(r7);	 Catch:{ all -> 0x008d }
        r7.mExecutingActions = r2;
        r1 = r0;
    L_0x0073:
        if (r1 >= r3) goto L_0x0085;
    L_0x0075:
        r5 = r7.mTmpActions;
        r5 = r5[r1];
        r5.run();
        r5 = r7.mTmpActions;
        r6 = 0;
        r5[r1] = r6;
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0073;
    L_0x0085:
        r7.mExecutingActions = r0;
        r1 = r2;
        goto L_0x0035;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x008d }
        throw r0;
    L_0x0090:
        r2 = r7.mHavePendingDeferredStart;
        if (r2 == 0) goto L_0x00bf;
    L_0x0094:
        r2 = r0;
        r3 = r0;
    L_0x0096:
        r0 = r7.mActive;
        r0 = r0.size();
        if (r2 >= r0) goto L_0x00b7;
    L_0x009e:
        r0 = r7.mActive;
        r0 = r0.get(r2);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 == 0) goto L_0x00b3;
    L_0x00a8:
        r5 = r0.mLoaderManager;	 Catch:{ IllegalArgumentException -> 0x00c0 }
        if (r5 == 0) goto L_0x00b3;
    L_0x00ac:
        r0 = r0.mLoaderManager;
        r0 = r0.hasRunningLoaders();
        r3 = r3 | r0;
    L_0x00b3:
        r0 = r2 + 1;
        if (r4 == 0) goto L_0x00c4;
    L_0x00b7:
        if (r3 != 0) goto L_0x00bf;
    L_0x00b9:
        r0 = 0;
        r7.mHavePendingDeferredStart = r0;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r7.startPendingDeferredFragments();	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00bf:
        return r1;
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r2 = r0;
        goto L_0x0096;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.execPendingActions():boolean");
    }

    public void enqueueAction(Runnable runnable, boolean z) {
        if (!z) {
            try {
                checkStateLoss();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        synchronized (this) {
            if (!this.mDestroyed) {
                try {
                    if (this.mHost != null) {
                        if (this.mPendingActions == null) {
                            this.mPendingActions = new ArrayList();
                        }
                        this.mPendingActions.add(runnable);
                        if (this.mPendingActions.size() == 1) {
                            this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                            this.mHost.getHandler().post(this.mExecCommit);
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            }
            throw new IllegalStateException(z[52]);
        }
    }

    void moveToState(int i, boolean z) {
        moveToState(i, 0, 0, z);
    }

    private void checkStateLoss() {
        try {
            if (this.mStateSaved) {
                throw new IllegalStateException(z[38]);
            }
            try {
                if (this.mNoTransactionsBecause != null) {
                    throw new IllegalStateException(z[37] + this.mNoTransactionsBecause);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void hideFragment(Fragment fragment, int i, int i2) {
        try {
            if (DEBUG) {
                Log.v(z[39], z[40] + fragment);
            }
            try {
                if (!fragment.mHidden) {
                    fragment.mHidden = true;
                    if (fragment.mView != null) {
                        Animation loadAnimation = loadAnimation(fragment, i, false, i2);
                        if (loadAnimation != null) {
                            try {
                                setHWLayerAnimListenerIfAlpha(fragment.mView, loadAnimation);
                                fragment.mView.startAnimation(loadAnimation);
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        fragment.mView.setVisibility(8);
                    }
                    try {
                        if (fragment.mAdded) {
                            if (fragment.mHasMenu) {
                                try {
                                    if (fragment.mMenuVisible) {
                                        this.mNeedMenuInvalidate = true;
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw e2;
                                }
                            }
                        }
                        fragment.onHiddenChanged(true);
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
    }

    Animation loadAnimation(Fragment fragment, int i, boolean z, int i2) {
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, fragment.mNextAnim);
        if (onCreateAnimation != null) {
            return onCreateAnimation;
        }
        if (fragment.mNextAnim != 0) {
            onCreateAnimation = AnimationUtils.loadAnimation(this.mHost.getContext(), fragment.mNextAnim);
            if (onCreateAnimation != null) {
                return onCreateAnimation;
            }
        }
        if (i == 0) {
            return null;
        }
        int transitToStyleIndex = transitToStyleIndex(i, z);
        if (transitToStyleIndex < 0) {
            return null;
        }
        switch (transitToStyleIndex) {
            case at.g /*1*/:
                try {
                    return makeOpenCloseAnimation(this.mHost.getContext(), 1.125f, 1.0f, 0.0f, 1.0f);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case at.i /*2*/:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.0f, 0.975f, 1.0f, 0.0f);
            case at.o /*3*/:
                return makeOpenCloseAnimation(this.mHost.getContext(), 0.975f, 1.0f, 0.0f, 1.0f);
            case at.p /*4*/:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.0f, 1.075f, 1.0f, 0.0f);
            case at.m /*5*/:
                return makeFadeAnimation(this.mHost.getContext(), 0.0f, 1.0f);
            case Y.f /*6*/:
                return makeFadeAnimation(this.mHost.getContext(), 1.0f, 0.0f);
            default:
                if (i2 == 0) {
                    try {
                        if (this.mHost.onHasWindowAnimations()) {
                            i2 = this.mHost.onGetWindowAnimations();
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                if (i2 == 0) {
                    return null;
                }
                return null;
        }
    }

    public void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions();
        moveToState(0, false);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
    }

    void moveToState(Fragment fragment) {
        moveToState(fragment, this.mCurState, 0, 0, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void restoreAllState(android.os.Parcelable r10, java.util.List r11) {
        /*
        r9 = this;
        r2 = 0;
        r4 = android.support.v4.app.Fragment.a;
        if (r10 != 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r10 = (android.support.v4.app.FragmentManagerState) r10;
        r0 = r10.mActive;	 Catch:{ IllegalArgumentException -> 0x0216 }
        if (r0 == 0) goto L_0x0005;
    L_0x000c:
        if (r11 == 0) goto L_0x007f;
    L_0x000e:
        r1 = r2;
    L_0x000f:
        r0 = r11.size();
        if (r1 >= r0) goto L_0x007f;
    L_0x0015:
        r0 = r11.get(r1);
        r0 = (android.support.v4.app.Fragment) r0;
        r3 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0218 }
        if (r3 == 0) goto L_0x003f;
    L_0x001f:
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0218 }
        r5 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x0218 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0218 }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x0218 }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x0218 }
        r7 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x0218 }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x0218 }
        r5 = r5.append(r0);	 Catch:{ IllegalArgumentException -> 0x0218 }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0218 }
        android.util.Log.v(r3, r5);	 Catch:{ IllegalArgumentException -> 0x0218 }
    L_0x003f:
        r3 = r10.mActive;
        r5 = r0.mIndex;
        r3 = r3[r5];
        r3.mInstance = r0;	 Catch:{ IllegalArgumentException -> 0x021a }
        r5 = 0;
        r0.mSavedViewState = r5;	 Catch:{ IllegalArgumentException -> 0x021a }
        r5 = 0;
        r0.mBackStackNesting = r5;	 Catch:{ IllegalArgumentException -> 0x021a }
        r5 = 0;
        r0.mInLayout = r5;	 Catch:{ IllegalArgumentException -> 0x021a }
        r5 = 0;
        r0.mAdded = r5;	 Catch:{ IllegalArgumentException -> 0x021a }
        r5 = 0;
        r0.mTarget = r5;	 Catch:{ IllegalArgumentException -> 0x021a }
        r5 = r3.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x021a }
        if (r5 == 0) goto L_0x007b;
    L_0x005a:
        r5 = r3.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = r9.mHost;	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = r6.getContext();	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = r6.getClassLoader();	 Catch:{ IllegalArgumentException -> 0x021a }
        r5.setClassLoader(r6);	 Catch:{ IllegalArgumentException -> 0x021a }
        r5 = r3.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x021a }
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x021a }
        r5 = r5.getSparseParcelableArray(r6);	 Catch:{ IllegalArgumentException -> 0x021a }
        r0.mSavedViewState = r5;	 Catch:{ IllegalArgumentException -> 0x021a }
        r3 = r3.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x021a }
        r0.mSavedFragmentState = r3;	 Catch:{ IllegalArgumentException -> 0x021a }
    L_0x007b:
        r0 = r1 + 1;
        if (r4 == 0) goto L_0x02da;
    L_0x007f:
        r0 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x021c }
        r1 = r10.mActive;	 Catch:{ IllegalArgumentException -> 0x021c }
        r1 = r1.length;	 Catch:{ IllegalArgumentException -> 0x021c }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x021c }
        r9.mActive = r0;	 Catch:{ IllegalArgumentException -> 0x021c }
        r0 = r9.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x021c }
        if (r0 == 0) goto L_0x0092;
    L_0x008d:
        r0 = r9.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x021c }
        r0.clear();	 Catch:{ IllegalArgumentException -> 0x021c }
    L_0x0092:
        r0 = r2;
    L_0x0093:
        r1 = r10.mActive;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0124;
    L_0x0098:
        r1 = r10.mActive;
        r1 = r1[r0];
        if (r1 == 0) goto L_0x00e2;
    L_0x009e:
        r3 = r9.mHost;
        r5 = r9.mParent;
        r3 = r1.instantiate(r3, r5);
        r5 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x021e }
        if (r5 == 0) goto L_0x00d8;
    L_0x00aa:
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x021e }
        r6 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x021e }
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x021e }
        r6.<init>();	 Catch:{ IllegalArgumentException -> 0x021e }
        r7 = z;	 Catch:{ IllegalArgumentException -> 0x021e }
        r8 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r7 = r7[r8];	 Catch:{ IllegalArgumentException -> 0x021e }
        r6 = r6.append(r7);	 Catch:{ IllegalArgumentException -> 0x021e }
        r6 = r6.append(r0);	 Catch:{ IllegalArgumentException -> 0x021e }
        r7 = z;	 Catch:{ IllegalArgumentException -> 0x021e }
        r8 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r7 = r7[r8];	 Catch:{ IllegalArgumentException -> 0x021e }
        r6 = r6.append(r7);	 Catch:{ IllegalArgumentException -> 0x021e }
        r6 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x021e }
        r6 = r6.toString();	 Catch:{ IllegalArgumentException -> 0x021e }
        android.util.Log.v(r5, r6);	 Catch:{ IllegalArgumentException -> 0x021e }
    L_0x00d8:
        r5 = r9.mActive;	 Catch:{ IllegalArgumentException -> 0x0220 }
        r5.add(r3);	 Catch:{ IllegalArgumentException -> 0x0220 }
        r3 = 0;
        r1.mInstance = r3;	 Catch:{ IllegalArgumentException -> 0x0220 }
        if (r4 == 0) goto L_0x0120;
    L_0x00e2:
        r1 = r9.mActive;	 Catch:{ IllegalArgumentException -> 0x0222 }
        r3 = 0;
        r1.add(r3);	 Catch:{ IllegalArgumentException -> 0x0222 }
        r1 = r9.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x0222 }
        if (r1 != 0) goto L_0x00f3;
    L_0x00ec:
        r1 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x0222 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0222 }
        r9.mAvailIndices = r1;	 Catch:{ IllegalArgumentException -> 0x0222 }
    L_0x00f3:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0224 }
        if (r1 == 0) goto L_0x0117;
    L_0x00f7:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0224 }
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r6 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3 = r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0224 }
        android.util.Log.v(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x0117:
        r1 = r9.mAvailIndices;
        r3 = java.lang.Integer.valueOf(r0);
        r1.add(r3);
    L_0x0120:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0093;
    L_0x0124:
        if (r11 == 0) goto L_0x0186;
    L_0x0126:
        r3 = r2;
    L_0x0127:
        r0 = r11.size();
        if (r3 >= r0) goto L_0x0186;
    L_0x012d:
        r0 = r11.get(r3);
        r0 = (android.support.v4.app.Fragment) r0;
        r1 = r0.mTargetIndex;	 Catch:{ IllegalArgumentException -> 0x0226 }
        if (r1 < 0) goto L_0x0182;
    L_0x0137:
        r1 = r0.mTargetIndex;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r5 = r9.mActive;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r5 = r5.size();	 Catch:{ IllegalArgumentException -> 0x0228 }
        if (r1 >= r5) goto L_0x014f;
    L_0x0141:
        r1 = r9.mActive;	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r0.mTargetIndex;	 Catch:{ IllegalArgumentException -> 0x022a }
        r1 = r1.get(r5);	 Catch:{ IllegalArgumentException -> 0x022a }
        r1 = (android.support.v4.app.Fragment) r1;	 Catch:{ IllegalArgumentException -> 0x022a }
        r0.mTarget = r1;	 Catch:{ IllegalArgumentException -> 0x022a }
        if (r4 == 0) goto L_0x0182;
    L_0x014f:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r1 = r1[r5];	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x022a }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x022a }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x022a }
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r5.append(r0);	 Catch:{ IllegalArgumentException -> 0x022a }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x022a }
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x022a }
        r6 = r0.mTargetIndex;	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x022a }
        android.util.Log.w(r1, r5);	 Catch:{ IllegalArgumentException -> 0x022a }
        r1 = 0;
        r0.mTarget = r1;	 Catch:{ IllegalArgumentException -> 0x022a }
    L_0x0182:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x02d7;
    L_0x0186:
        r0 = r10.mAdded;
        if (r0 == 0) goto L_0x023b;
    L_0x018a:
        r0 = new java.util.ArrayList;
        r1 = r10.mAdded;
        r1 = r1.length;
        r0.<init>(r1);
        r9.mAdded = r0;
        r1 = r2;
    L_0x0195:
        r0 = r10.mAdded;
        r0 = r0.length;
        if (r1 >= r0) goto L_0x0239;
    L_0x019a:
        r0 = r9.mActive;
        r3 = r10.mAdded;
        r3 = r3[r1];
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 != 0) goto L_0x01cb;
    L_0x01a8:
        r3 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x022c }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x022c }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x022c }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x022c }
        r7 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x022c }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x022c }
        r6 = r10.mAdded;	 Catch:{ IllegalArgumentException -> 0x022c }
        r6 = r6[r1];	 Catch:{ IllegalArgumentException -> 0x022c }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x022c }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x022c }
        r3.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x022c }
        r9.throwException(r3);	 Catch:{ IllegalArgumentException -> 0x022c }
    L_0x01cb:
        r3 = 1;
        r0.mAdded = r3;	 Catch:{ IllegalArgumentException -> 0x022e }
        r3 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x022e }
        if (r3 == 0) goto L_0x0200;
    L_0x01d2:
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x022e }
        r5 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x022e }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x022e }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x022e }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x022e }
        r7 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x022e }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x022e }
        r5 = r5.append(r1);	 Catch:{ IllegalArgumentException -> 0x022e }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x022e }
        r7 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x022e }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x022e }
        r5 = r5.append(r0);	 Catch:{ IllegalArgumentException -> 0x022e }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x022e }
        android.util.Log.v(r3, r5);	 Catch:{ IllegalArgumentException -> 0x022e }
    L_0x0200:
        r3 = r9.mAdded;	 Catch:{ IllegalArgumentException -> 0x0214 }
        r3 = r3.contains(r0);	 Catch:{ IllegalArgumentException -> 0x0214 }
        if (r3 == 0) goto L_0x0230;
    L_0x0208:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0214 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0214 }
        r2 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0214 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0214 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0214 }
    L_0x0214:
        r0 = move-exception;
        throw r0;
    L_0x0216:
        r0 = move-exception;
        throw r0;
    L_0x0218:
        r0 = move-exception;
        throw r0;
    L_0x021a:
        r0 = move-exception;
        throw r0;
    L_0x021c:
        r0 = move-exception;
        throw r0;
    L_0x021e:
        r0 = move-exception;
        throw r0;
    L_0x0220:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0222 }
    L_0x0222:
        r0 = move-exception;
        throw r0;
    L_0x0224:
        r0 = move-exception;
        throw r0;
    L_0x0226:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0228 }
    L_0x0228:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x022a }
    L_0x022a:
        r0 = move-exception;
        throw r0;
    L_0x022c:
        r0 = move-exception;
        throw r0;
    L_0x022e:
        r0 = move-exception;
        throw r0;
    L_0x0230:
        r3 = r9.mAdded;
        r3.add(r0);
        r0 = r1 + 1;
        if (r4 == 0) goto L_0x02d4;
    L_0x0239:
        if (r4 == 0) goto L_0x023e;
    L_0x023b:
        r0 = 0;
        r9.mAdded = r0;	 Catch:{ IllegalArgumentException -> 0x02d0 }
    L_0x023e:
        r0 = r10.mBackStack;
        if (r0 == 0) goto L_0x02c9;
    L_0x0242:
        r0 = new java.util.ArrayList;
        r1 = r10.mBackStack;
        r1 = r1.length;
        r0.<init>(r1);
        r9.mBackStack = r0;
        r0 = r2;
    L_0x024d:
        r1 = r10.mBackStack;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x02c7;
    L_0x0252:
        r1 = r10.mBackStack;
        r1 = r1[r0];
        r1 = r1.instantiate(r9);
        r3 = DEBUG;
        if (r3 == 0) goto L_0x02b5;
    L_0x025e:
        r3 = z;
        r5 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r3 = r3[r5];
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r0);
        r6 = z;
        r7 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r6 = r1.mIndex;
        r5 = r5.append(r6);
        r6 = z;
        r7 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r1);
        r5 = r5.toString();
        android.util.Log.v(r3, r5);
        r3 = new android.support.v4.util.LogWriter;
        r5 = z;
        r6 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r5 = r5[r6];
        r3.<init>(r5);
        r5 = new java.io.PrintWriter;
        r5.<init>(r3);
        r3 = z;
        r6 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r3 = r3[r6];
        r1.dump(r3, r5, r2);
    L_0x02b5:
        r3 = r9.mBackStack;	 Catch:{ IllegalArgumentException -> 0x02d2 }
        r3.add(r1);	 Catch:{ IllegalArgumentException -> 0x02d2 }
        r3 = r1.mIndex;	 Catch:{ IllegalArgumentException -> 0x02d2 }
        if (r3 < 0) goto L_0x02c3;
    L_0x02be:
        r3 = r1.mIndex;	 Catch:{ IllegalArgumentException -> 0x02d2 }
        r9.setBackStackIndex(r3, r1);	 Catch:{ IllegalArgumentException -> 0x02d2 }
    L_0x02c3:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x024d;
    L_0x02c7:
        if (r4 == 0) goto L_0x0005;
    L_0x02c9:
        r0 = 0;
        r9.mBackStack = r0;	 Catch:{ IllegalArgumentException -> 0x02ce }
        goto L_0x0005;
    L_0x02ce:
        r0 = move-exception;
        throw r0;
    L_0x02d0:
        r0 = move-exception;
        throw r0;
    L_0x02d2:
        r0 = move-exception;
        throw r0;
    L_0x02d4:
        r1 = r0;
        goto L_0x0195;
    L_0x02d7:
        r3 = r0;
        goto L_0x0127;
    L_0x02da:
        r1 = r0;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.restoreAllState(android.os.Parcelable, java.util.List):void");
    }

    public void detachFragment(Fragment fragment, int i, int i2) {
        try {
            if (DEBUG) {
                Log.v(z[112], z[114] + fragment);
            }
            try {
                if (!fragment.mDetached) {
                    fragment.mDetached = true;
                    if (fragment.mAdded) {
                        try {
                            if (this.mAdded != null) {
                                try {
                                    if (DEBUG) {
                                        Log.v(z[113], z[111] + fragment);
                                    }
                                    this.mAdded.remove(fragment);
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            }
                            try {
                                if (fragment.mHasMenu) {
                                    if (fragment.mMenuVisible) {
                                        this.mNeedMenuInvalidate = true;
                                    }
                                }
                                fragment.mAdded = false;
                                moveToState(fragment, 1, i, i2, false);
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                    }
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }

    public void noteStateNotSaved() {
        this.mStateSaved = false;
    }

    public void dispatchReallyStop() {
        moveToState(2, false);
    }

    public void attachFragment(Fragment fragment, int i, int i2) {
        try {
            if (DEBUG) {
                Log.v(z[167], z[169] + fragment);
            }
            try {
                if (fragment.mDetached) {
                    fragment.mDetached = false;
                    if (!fragment.mAdded) {
                        try {
                            if (this.mAdded == null) {
                                this.mAdded = new ArrayList();
                            }
                            try {
                                if (this.mAdded.contains(fragment)) {
                                    throw new IllegalStateException(z[170] + fragment);
                                }
                                try {
                                    if (DEBUG) {
                                        Log.v(z[171], z[168] + fragment);
                                    }
                                    try {
                                        this.mAdded.add(fragment);
                                        fragment.mAdded = true;
                                        if (fragment.mHasMenu) {
                                            if (fragment.mMenuVisible) {
                                                this.mNeedMenuInvalidate = true;
                                            }
                                        }
                                        moveToState(fragment, this.mCurState, i, i2, false);
                                    } catch (IllegalArgumentException e) {
                                        throw e;
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
                    }
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            }
        } catch (IllegalArgumentException e2222222) {
            throw e2222222;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        Fragment fragment;
        int i2;
        int i3 = 0;
        boolean z = Fragment.a;
        String str2 = str + z[154];
        if (this.mActive != null) {
            size = this.mActive.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print(z[148]);
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                i = 0;
                while (i < size) {
                    fragment = (Fragment) this.mActive.get(i);
                    try {
                        printWriter.print(str);
                        printWriter.print(z[149]);
                        printWriter.print(i);
                        printWriter.print(z[165]);
                        printWriter.println(fragment);
                        if (fragment != null) {
                            fragment.dump(str2, fileDescriptor, printWriter, strArr);
                        }
                        i2 = i + 1;
                        if (z) {
                            break;
                        }
                        i = i2;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
        }
        if (this.mAdded != null) {
            size = this.mAdded.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println(z[150]);
                i = 0;
                while (i < size) {
                    fragment = (Fragment) this.mAdded.get(i);
                    printWriter.print(str);
                    printWriter.print(z[151]);
                    printWriter.print(i);
                    printWriter.print(z[137]);
                    printWriter.println(fragment.toString());
                    i2 = i + 1;
                    if (z) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        if (this.mCreatedMenus != null) {
            size = this.mCreatedMenus.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println(z[144]);
                i = 0;
                while (i < size) {
                    fragment = (Fragment) this.mCreatedMenus.get(i);
                    printWriter.print(str);
                    printWriter.print(z[164]);
                    printWriter.print(i);
                    printWriter.print(z[142]);
                    printWriter.println(fragment.toString());
                    i2 = i + 1;
                    if (z) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        if (this.mBackStack != null) {
            size = this.mBackStack.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println(z[143]);
                i = 0;
                while (i < size) {
                    BackStackRecord backStackRecord = (BackStackRecord) this.mBackStack.get(i);
                    printWriter.print(str);
                    printWriter.print(z[159]);
                    printWriter.print(i);
                    printWriter.print(z[139]);
                    printWriter.println(backStackRecord.toString());
                    backStackRecord.dump(str2, fileDescriptor, printWriter, strArr);
                    i2 = i + 1;
                    if (z) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        synchronized (this) {
            if (this.mBackStackIndices != null) {
                int size2 = this.mBackStackIndices.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println(z[152]);
                    i = 0;
                    while (i < size2) {
                        backStackRecord = (BackStackRecord) this.mBackStackIndices.get(i);
                        printWriter.print(str);
                        printWriter.print(z[141]);
                        printWriter.print(i);
                        printWriter.print(z[158]);
                        printWriter.println(backStackRecord);
                        i2 = i + 1;
                        if (!z) {
                            i = i2;
                        }
                    }
                }
            }
            try {
                break;
                if (this.mAvailBackStackIndices != null && this.mAvailBackStackIndices.size() > 0) {
                    printWriter.print(str);
                    printWriter.print(z[160]);
                    printWriter.println(Arrays.toString(this.mAvailBackStackIndices.toArray()));
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        if (this.mPendingActions != null) {
            i = this.mPendingActions.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println(z[161]);
                while (i3 < i) {
                    Runnable runnable = (Runnable) this.mPendingActions.get(i3);
                    printWriter.print(str);
                    printWriter.print(z[146]);
                    printWriter.print(i3);
                    printWriter.print(z[163]);
                    printWriter.println(runnable);
                    i2 = i3 + 1;
                    if (!z) {
                        i3 = i2;
                    }
                }
            }
        }
        try {
            break;
            printWriter.print(str);
            printWriter.println(z[166]);
            printWriter.print(str);
            printWriter.print(z[162]);
            printWriter.println(this.mHost);
            printWriter.print(str);
            printWriter.print(z[157]);
            printWriter.println(this.mContainer);
            if (this.mParent != null) {
                printWriter.print(str);
                printWriter.print(z[138]);
                printWriter.println(this.mParent);
            }
            try {
                printWriter.print(str);
                printWriter.print(z[153]);
                printWriter.print(this.mCurState);
                printWriter.print(z[155]);
                printWriter.print(this.mStateSaved);
                printWriter.print(z[156]);
                printWriter.println(this.mDestroyed);
                if (this.mNeedMenuInvalidate) {
                    printWriter.print(str);
                    printWriter.print(z[145]);
                    printWriter.println(this.mNeedMenuInvalidate);
                }
                try {
                    if (this.mNoTransactionsBecause != null) {
                        printWriter.print(str);
                        printWriter.print(z[140]);
                        printWriter.println(this.mNoTransactionsBecause);
                    }
                    try {
                        if (this.mAvailIndices == null) {
                            return;
                        }
                        if (this.mAvailIndices.size() > 0) {
                            printWriter.print(str);
                            printWriter.print(z[147]);
                            printWriter.println(Arrays.toString(this.mAvailIndices.toArray()));
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
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
    }

    public void dispatchCreate() {
        this.mStateSaved = false;
        moveToState(1, false);
    }

    public void dispatchLowMemory() {
        boolean z = Fragment.a;
        if (this.mAdded != null) {
            int i = 0;
            while (i < this.mAdded.size()) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null) {
                    try {
                        fragment.performLowMemory();
                    } catch (IllegalArgumentException e) {
                        throw e;
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
    }

    public void dispatchStart() {
        this.mStateSaved = false;
        moveToState(4, false);
    }

    public Fragment findFragmentById(int i) {
        int size;
        Fragment fragment;
        int i2;
        boolean z = Fragment.a;
        if (this.mAdded != null) {
            size = this.mAdded.size() - 1;
            while (size >= 0) {
                fragment = (Fragment) this.mAdded.get(size);
                if (fragment != null) {
                    try {
                        if (fragment.mFragmentId == i) {
                            return fragment;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                i2 = size - 1;
                if (z) {
                    break;
                }
                size = i2;
            }
        }
        if (this.mActive != null) {
            size = this.mActive.size() - 1;
            while (size >= 0) {
                fragment = (Fragment) this.mActive.get(size);
                if (fragment != null) {
                    try {
                        if (fragment.mFragmentId == i) {
                            return fragment;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                i2 = size - 1;
                if (z) {
                    break;
                }
                size = i2;
            }
        }
        return null;
    }

    public static int reverseTransit(int i) {
        boolean z = Fragment.a;
        switch (i) {
            case 4097:
                if (!z) {
                    return 8194;
                }
                break;
            case 4099:
                break;
            case 8194:
                break;
            default:
                return 0;
        }
        if (!z) {
            return 4097;
        }
        return 4099;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
        r11 = this;
        r2 = 0;
        r1 = 0;
        r4 = -1;
        r10 = 1;
        r8 = android.support.v4.app.Fragment.a;
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r3 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x0013 }
        r0 = r0.equals(r13);	 Catch:{ IllegalArgumentException -> 0x0013 }
        if (r0 != 0) goto L_0x0015;
    L_0x0012:
        return r2;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r0 = z;
        r3 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r0 = r0[r3];
        r0 = r15.getAttributeValue(r2, r0);
        r3 = android.support.v4.app.FragmentManagerImpl.FragmentTag.Fragment;
        r3 = r14.obtainStyledAttributes(r15, r3);
        if (r0 != 0) goto L_0x01e6;
    L_0x0027:
        r0 = r3.getString(r1);
        r6 = r0;
    L_0x002c:
        r7 = r3.getResourceId(r10, r4);
        r0 = 2;
        r9 = r3.getString(r0);
        r3.recycle();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r11.mHost;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r0.getContext();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = android.support.v4.app.Fragment.isSupportFragmentClass(r0, r6);	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r0 == 0) goto L_0x0012;
    L_0x0044:
        if (r12 == 0) goto L_0x007b;
    L_0x0046:
        r0 = r12.getId();	 Catch:{ IllegalArgumentException -> 0x0079 }
    L_0x004a:
        if (r0 != r4) goto L_0x007d;
    L_0x004c:
        if (r7 != r4) goto L_0x007d;
    L_0x004e:
        if (r9 != 0) goto L_0x007d;
    L_0x0050:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = r15.getPositionDescription();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0075 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r1 = r1.append(r6);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0075 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = r1;
        goto L_0x004a;
    L_0x007d:
        if (r7 == r4) goto L_0x0162;
    L_0x007f:
        r1 = r11.findFragmentById(r7);	 Catch:{ IllegalArgumentException -> 0x0160 }
    L_0x0083:
        if (r1 != 0) goto L_0x008b;
    L_0x0085:
        if (r9 == 0) goto L_0x008b;
    L_0x0087:
        r1 = r11.findFragmentByTag(r9);
    L_0x008b:
        if (r1 != 0) goto L_0x0093;
    L_0x008d:
        if (r0 == r4) goto L_0x0093;
    L_0x008f:
        r1 = r11.findFragmentById(r0);
    L_0x0093:
        r2 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0165 }
        if (r2 == 0) goto L_0x00d7;
    L_0x0097:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0165 }
        r3 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0165 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0165 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0165 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0165 }
        r5 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0165 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0165 }
        r4 = java.lang.Integer.toHexString(r7);	 Catch:{ IllegalArgumentException -> 0x0165 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0165 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0165 }
        r5 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0165 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0165 }
        r3 = r3.append(r6);	 Catch:{ IllegalArgumentException -> 0x0165 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0165 }
        r5 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0165 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0165 }
        r3 = r3.append(r1);	 Catch:{ IllegalArgumentException -> 0x0165 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0165 }
        android.util.Log.v(r2, r3);	 Catch:{ IllegalArgumentException -> 0x0165 }
    L_0x00d7:
        if (r1 != 0) goto L_0x0103;
    L_0x00d9:
        r1 = android.support.v4.app.Fragment.instantiate(r14, r6);
        r2 = 1;
        r1.mFromLayout = r2;	 Catch:{ IllegalArgumentException -> 0x0167 }
        if (r7 == 0) goto L_0x0169;
    L_0x00e2:
        r2 = r7;
    L_0x00e3:
        r1.mFragmentId = r2;	 Catch:{ IllegalArgumentException -> 0x016c }
        r1.mContainerId = r0;	 Catch:{ IllegalArgumentException -> 0x016c }
        r1.mTag = r9;	 Catch:{ IllegalArgumentException -> 0x016c }
        r2 = 1;
        r1.mInLayout = r2;	 Catch:{ IllegalArgumentException -> 0x016c }
        r1.mFragmentManager = r11;	 Catch:{ IllegalArgumentException -> 0x016c }
        r2 = r11.mHost;	 Catch:{ IllegalArgumentException -> 0x016c }
        r1.mHost = r2;	 Catch:{ IllegalArgumentException -> 0x016c }
        r2 = r11.mHost;	 Catch:{ IllegalArgumentException -> 0x016c }
        r2 = r2.getContext();	 Catch:{ IllegalArgumentException -> 0x016c }
        r3 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x016c }
        r1.onInflate(r2, r15, r3);	 Catch:{ IllegalArgumentException -> 0x016c }
        r2 = 1;
        r11.addFragment(r1, r2);	 Catch:{ IllegalArgumentException -> 0x016c }
        if (r8 == 0) goto L_0x0180;
    L_0x0103:
        r2 = r1.mInLayout;	 Catch:{ IllegalArgumentException -> 0x015e }
        if (r2 == 0) goto L_0x016e;
    L_0x0107:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x015e }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x015e }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x015e }
        r3 = r15.getPositionDescription();	 Catch:{ IllegalArgumentException -> 0x015e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x015e }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x015e }
        r4 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x015e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x015e }
        r3 = java.lang.Integer.toHexString(r7);	 Catch:{ IllegalArgumentException -> 0x015e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x015e }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x015e }
        r4 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x015e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x015e }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x015e }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x015e }
        r4 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x015e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x015e }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalArgumentException -> 0x015e }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x015e }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x015e }
        r3 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x015e }
        r0 = r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x015e }
        r0 = r0.append(r6);	 Catch:{ IllegalArgumentException -> 0x015e }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x015e }
        r1.<init>(r0);	 Catch:{ IllegalArgumentException -> 0x015e }
        throw r1;	 Catch:{ IllegalArgumentException -> 0x015e }
    L_0x015e:
        r0 = move-exception;
        throw r0;
    L_0x0160:
        r0 = move-exception;
        throw r0;
    L_0x0162:
        r1 = r2;
        goto L_0x0083;
    L_0x0165:
        r0 = move-exception;
        throw r0;
    L_0x0167:
        r0 = move-exception;
        throw r0;
    L_0x0169:
        r2 = r0;
        goto L_0x00e3;
    L_0x016c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x015e }
    L_0x016e:
        r0 = 1;
        r1.mInLayout = r0;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r0 = r1.mRetaining;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        if (r0 != 0) goto L_0x0180;
    L_0x0175:
        r0 = r11.mHost;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r0 = r0.getContext();	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r2 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r1.onInflate(r0, r15, r2);	 Catch:{ IllegalArgumentException -> 0x01c2 }
    L_0x0180:
        r0 = r11.mCurState;	 Catch:{ IllegalArgumentException -> 0x01c4 }
        if (r0 >= r10) goto L_0x0192;
    L_0x0184:
        r0 = r1.mFromLayout;	 Catch:{ IllegalArgumentException -> 0x01c6 }
        if (r0 == 0) goto L_0x0192;
    L_0x0188:
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0 = r11;
        r0.moveToState(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x01c8 }
        if (r8 == 0) goto L_0x0195;
    L_0x0192:
        r11.moveToState(r1);	 Catch:{ IllegalArgumentException -> 0x01c8 }
    L_0x0195:
        r0 = r1.mView;	 Catch:{ IllegalArgumentException -> 0x01c0 }
        if (r0 != 0) goto L_0x01ca;
    L_0x0199:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r3 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r1 = r1.append(r6);	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x01c0 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x01c0 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c0 }
    L_0x01c0:
        r0 = move-exception;
        throw r0;
    L_0x01c2:
        r0 = move-exception;
        throw r0;
    L_0x01c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c6 }
    L_0x01c6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01c8 }
    L_0x01c8:
        r0 = move-exception;
        throw r0;
    L_0x01ca:
        if (r7 == 0) goto L_0x01d1;
    L_0x01cc:
        r0 = r1.mView;	 Catch:{ IllegalArgumentException -> 0x01e2 }
        r0.setId(r7);	 Catch:{ IllegalArgumentException -> 0x01e2 }
    L_0x01d1:
        r0 = r1.mView;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r0 = r0.getTag();	 Catch:{ IllegalArgumentException -> 0x01e4 }
        if (r0 != 0) goto L_0x01de;
    L_0x01d9:
        r0 = r1.mView;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r0.setTag(r9);	 Catch:{ IllegalArgumentException -> 0x01e4 }
    L_0x01de:
        r2 = r1.mView;
        goto L_0x0012;
    L_0x01e2:
        r0 = move-exception;
        throw r0;
    L_0x01e4:
        r0 = move-exception;
        throw r0;
    L_0x01e6:
        r6 = r0;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public void freeBackStackIndex(int i) {
        synchronized (this) {
            this.mBackStackIndices.set(i, null);
            if (this.mAvailBackStackIndices == null) {
                this.mAvailBackStackIndices = new ArrayList();
            }
            try {
                if (DEBUG) {
                    Log.v(z[54], z[53] + i);
                }
                this.mAvailBackStackIndices.add(Integer.valueOf(i));
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public void dispatchStop() {
        this.mStateSaved = true;
        moveToState(3, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void moveToState(android.support.v4.app.Fragment r9, int r10, int r11, int r12, boolean r13) {
        /*
        r8 = this;
        r7 = android.support.v4.app.Fragment.a;
        r0 = r9.mAdded;	 Catch:{ IllegalArgumentException -> 0x0033 }
        if (r0 == 0) goto L_0x000a;
    L_0x0006:
        r0 = r9.mDetached;	 Catch:{ IllegalArgumentException -> 0x0035 }
        if (r0 == 0) goto L_0x04da;
    L_0x000a:
        r0 = 1;
        if (r10 <= r0) goto L_0x04da;
    L_0x000d:
        r10 = 1;
        r6 = r10;
    L_0x000f:
        r0 = r9.mRemoving;	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r0 == 0) goto L_0x0019;
    L_0x0013:
        r0 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r6 <= r0) goto L_0x0019;
    L_0x0017:
        r6 = r9.mState;
    L_0x0019:
        r0 = r9.mDeferStart;	 Catch:{ IllegalArgumentException -> 0x0039 }
        if (r0 == 0) goto L_0x0026;
    L_0x001d:
        r0 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x003b }
        r1 = 4;
        if (r0 >= r1) goto L_0x0026;
    L_0x0022:
        r0 = 3;
        if (r6 <= r0) goto L_0x0026;
    L_0x0025:
        r6 = 3;
    L_0x0026:
        r0 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x003d }
        if (r0 >= r6) goto L_0x04d7;
    L_0x002a:
        r0 = r9.mFromLayout;	 Catch:{ IllegalArgumentException -> 0x003f }
        if (r0 == 0) goto L_0x0043;
    L_0x002e:
        r0 = r9.mInLayout;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r0 != 0) goto L_0x0043;
    L_0x0032:
        return;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r0 = move-exception;
        throw r0;
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = r9.mAnimatingAway;	 Catch:{ IllegalArgumentException -> 0x0068 }
        if (r0 == 0) goto L_0x0054;
    L_0x0047:
        r0 = 0;
        r9.mAnimatingAway = r0;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r2 = r9.mStateAfterAnimating;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r8;
        r1 = r9;
        r0.moveToState(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0068 }
    L_0x0054:
        r0 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x0135 }
        switch(r0) {
            case 0: goto L_0x006a;
            case 1: goto L_0x01a5;
            case 2: goto L_0x029e;
            case 3: goto L_0x029e;
            case 4: goto L_0x04d4;
            default: goto L_0x0059;
        };
    L_0x0059:
        r0 = r6;
    L_0x005a:
        if (r7 == 0) goto L_0x0065;
    L_0x005c:
        r1 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x0324 }
        if (r1 <= r0) goto L_0x0065;
    L_0x0060:
        r1 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x0326 }
        switch(r1) {
            case 1: goto L_0x0427;
            case 2: goto L_0x03ad;
            case 3: goto L_0x0383;
            case 4: goto L_0x0359;
            case 5: goto L_0x032c;
            default: goto L_0x0065;
        };
    L_0x0065:
        r9.mState = r0;
        goto L_0x0032;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0137 }
        if (r0 == 0) goto L_0x008e;
    L_0x006e:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1 = 77;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r3 = 86;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0137 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0137 }
    L_0x008e:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0139 }
        if (r0 == 0) goto L_0x00ea;
    L_0x0092:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x013b }
        r1 = r8.mHost;	 Catch:{ IllegalArgumentException -> 0x013b }
        r1 = r1.getContext();	 Catch:{ IllegalArgumentException -> 0x013b }
        r1 = r1.getClassLoader();	 Catch:{ IllegalArgumentException -> 0x013b }
        r0.setClassLoader(r1);	 Catch:{ IllegalArgumentException -> 0x013b }
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x013b }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x013b }
        r2 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x013b }
        r0 = r0.getSparseParcelableArray(r1);	 Catch:{ IllegalArgumentException -> 0x013b }
        r9.mSavedViewState = r0;	 Catch:{ IllegalArgumentException -> 0x013b }
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x013b }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x013b }
        r2 = 87;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x013b }
        r0 = r8.getFragment(r0, r1);	 Catch:{ IllegalArgumentException -> 0x013b }
        r9.mTarget = r0;	 Catch:{ IllegalArgumentException -> 0x013b }
        r0 = r9.mTarget;	 Catch:{ IllegalArgumentException -> 0x013b }
        if (r0 == 0) goto L_0x00d0;
    L_0x00c1:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x013b }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x013b }
        r2 = 91;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x013b }
        r2 = 0;
        r0 = r0.getInt(r1, r2);	 Catch:{ IllegalArgumentException -> 0x013b }
        r9.mTargetRequestCode = r0;	 Catch:{ IllegalArgumentException -> 0x013b }
    L_0x00d0:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x013d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x013d }
        r2 = 81;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x013d }
        r2 = 1;
        r0 = r0.getBoolean(r1, r2);	 Catch:{ IllegalArgumentException -> 0x013d }
        r9.mUserVisibleHint = r0;	 Catch:{ IllegalArgumentException -> 0x013d }
        r0 = r9.mUserVisibleHint;	 Catch:{ IllegalArgumentException -> 0x013d }
        if (r0 != 0) goto L_0x00ea;
    L_0x00e3:
        r0 = 1;
        r9.mDeferStart = r0;	 Catch:{ IllegalArgumentException -> 0x013d }
        r0 = 3;
        if (r6 <= r0) goto L_0x00ea;
    L_0x00e9:
        r6 = 3;
    L_0x00ea:
        r0 = r8.mHost;	 Catch:{ IllegalArgumentException -> 0x013f }
        r9.mHost = r0;	 Catch:{ IllegalArgumentException -> 0x013f }
        r0 = r8.mParent;	 Catch:{ IllegalArgumentException -> 0x013f }
        r9.mParentFragment = r0;	 Catch:{ IllegalArgumentException -> 0x013f }
        r0 = r8.mParent;	 Catch:{ IllegalArgumentException -> 0x013f }
        if (r0 == 0) goto L_0x0141;
    L_0x00f6:
        r0 = r8.mParent;	 Catch:{ IllegalArgumentException -> 0x013f }
        r0 = r0.mChildFragmentManager;	 Catch:{ IllegalArgumentException -> 0x013f }
    L_0x00fa:
        r9.mFragmentManager = r0;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = 0;
        r9.mCalled = r0;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = r8.mHost;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = r0.getContext();	 Catch:{ IllegalArgumentException -> 0x0133 }
        r9.onAttach(r0);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = r9.mCalled;	 Catch:{ IllegalArgumentException -> 0x0133 }
        if (r0 != 0) goto L_0x0148;
    L_0x010c:
        r0 = new android.support.v4.app.SuperNotCalledException;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0133 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r3 = 97;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r3 = 96;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0133 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        throw r0;
    L_0x0135:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0137 }
    L_0x0137:
        r0 = move-exception;
        throw r0;
    L_0x0139:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013b }
    L_0x013b:
        r0 = move-exception;
        throw r0;
    L_0x013d:
        r0 = move-exception;
        throw r0;
    L_0x013f:
        r0 = move-exception;
        throw r0;
    L_0x0141:
        r0 = r8.mHost;
        r0 = r0.getFragmentManagerImpl();
        goto L_0x00fa;
    L_0x0148:
        r0 = r9.mParentFragment;	 Catch:{ IllegalArgumentException -> 0x02fe }
        if (r0 != 0) goto L_0x0151;
    L_0x014c:
        r0 = r8.mHost;	 Catch:{ IllegalArgumentException -> 0x02fe }
        r0.onAttachFragment(r9);	 Catch:{ IllegalArgumentException -> 0x02fe }
    L_0x0151:
        r0 = r9.mRetaining;	 Catch:{ IllegalArgumentException -> 0x0300 }
        if (r0 != 0) goto L_0x015a;
    L_0x0155:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0300 }
        r9.performCreate(r0);	 Catch:{ IllegalArgumentException -> 0x0300 }
    L_0x015a:
        r0 = 0;
        r9.mRetaining = r0;	 Catch:{ IllegalArgumentException -> 0x0302 }
        r0 = r9.mFromLayout;	 Catch:{ IllegalArgumentException -> 0x0302 }
        if (r0 == 0) goto L_0x01a5;
    L_0x0161:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r0 = r9.getLayoutInflater(r0);	 Catch:{ IllegalArgumentException -> 0x0304 }
        r1 = 0;
        r2 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r0 = r9.performCreateView(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0304 }
        r9.mView = r0;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0304 }
        if (r0 == 0) goto L_0x01a2;
    L_0x0174:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0306 }
        r9.mInnerView = r0;	 Catch:{ IllegalArgumentException -> 0x0306 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0306 }
        r1 = 11;
        if (r0 < r1) goto L_0x0186;
    L_0x017e:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0308 }
        r1 = 0;
        android.support.v4.view.ViewCompat.setSaveFromParentEnabled(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0308 }
        if (r7 == 0) goto L_0x018e;
    L_0x0186:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0308 }
        r0 = android.support.v4.app.NoSaveStateFrameLayout.wrap(r0);	 Catch:{ IllegalArgumentException -> 0x0308 }
        r9.mView = r0;	 Catch:{ IllegalArgumentException -> 0x0308 }
    L_0x018e:
        r0 = r9.mHidden;	 Catch:{ IllegalArgumentException -> 0x030a }
        if (r0 == 0) goto L_0x0199;
    L_0x0192:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x030a }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x030a }
    L_0x0199:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x030c }
        r1 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x030c }
        r9.onViewCreated(r0, r1);	 Catch:{ IllegalArgumentException -> 0x030c }
        if (r7 == 0) goto L_0x01a5;
    L_0x01a2:
        r0 = 0;
        r9.mInnerView = r0;	 Catch:{ IllegalArgumentException -> 0x030c }
    L_0x01a5:
        r0 = 1;
        if (r6 <= r0) goto L_0x029e;
    L_0x01a8:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x030e }
        if (r0 == 0) goto L_0x01cc;
    L_0x01ac:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x030e }
        r1 = 79;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x030e }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x030e }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x030e }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x030e }
        r3 = 93;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x030e }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x030e }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x030e }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x030e }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x030e }
    L_0x01cc:
        r0 = r9.mFromLayout;
        if (r0 != 0) goto L_0x028d;
    L_0x01d0:
        r0 = 0;
        r1 = r9.mContainerId;
        if (r1 == 0) goto L_0x0230;
    L_0x01d5:
        r0 = r8.mContainer;
        r1 = r9.mContainerId;
        r0 = r0.onFindViewById(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0230;
    L_0x01e1:
        r1 = r9.mRestored;	 Catch:{ IllegalArgumentException -> 0x0310 }
        if (r1 != 0) goto L_0x0230;
    L_0x01e5:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0310 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0310 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0310 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0310 }
        r4 = 82;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0310 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0310 }
        r3 = r9.mContainerId;	 Catch:{ IllegalArgumentException -> 0x0310 }
        r3 = java.lang.Integer.toHexString(r3);	 Catch:{ IllegalArgumentException -> 0x0310 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0310 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0310 }
        r4 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0310 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0310 }
        r3 = r9.getResources();	 Catch:{ IllegalArgumentException -> 0x0310 }
        r4 = r9.mContainerId;	 Catch:{ IllegalArgumentException -> 0x0310 }
        r3 = r3.getResourceName(r4);	 Catch:{ IllegalArgumentException -> 0x0310 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0310 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0310 }
        r4 = 80;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0310 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0310 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x0310 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0310 }
        r1.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0310 }
        r8.throwException(r1);	 Catch:{ IllegalArgumentException -> 0x0310 }
    L_0x0230:
        r9.mContainer = r0;	 Catch:{ IllegalArgumentException -> 0x0312 }
        r1 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0312 }
        r1 = r9.getLayoutInflater(r1);	 Catch:{ IllegalArgumentException -> 0x0312 }
        r2 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0312 }
        r1 = r9.performCreateView(r1, r0, r2);	 Catch:{ IllegalArgumentException -> 0x0312 }
        r9.mView = r1;	 Catch:{ IllegalArgumentException -> 0x0312 }
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0312 }
        if (r1 == 0) goto L_0x028a;
    L_0x0244:
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0314 }
        r9.mInnerView = r1;	 Catch:{ IllegalArgumentException -> 0x0314 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0314 }
        r2 = 11;
        if (r1 < r2) goto L_0x0256;
    L_0x024e:
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0316 }
        r2 = 0;
        android.support.v4.view.ViewCompat.setSaveFromParentEnabled(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0316 }
        if (r7 == 0) goto L_0x025e;
    L_0x0256:
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0316 }
        r1 = android.support.v4.app.NoSaveStateFrameLayout.wrap(r1);	 Catch:{ IllegalArgumentException -> 0x0316 }
        r9.mView = r1;	 Catch:{ IllegalArgumentException -> 0x0316 }
    L_0x025e:
        if (r0 == 0) goto L_0x0276;
    L_0x0260:
        r1 = 1;
        r1 = r8.loadAnimation(r9, r11, r1, r12);
        if (r1 == 0) goto L_0x0271;
    L_0x0267:
        r2 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0318 }
        r8.setHWLayerAnimListenerIfAlpha(r2, r1);	 Catch:{ IllegalArgumentException -> 0x0318 }
        r2 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0318 }
        r2.startAnimation(r1);	 Catch:{ IllegalArgumentException -> 0x0318 }
    L_0x0271:
        r1 = r9.mView;
        r0.addView(r1);
    L_0x0276:
        r0 = r9.mHidden;	 Catch:{ IllegalArgumentException -> 0x031a }
        if (r0 == 0) goto L_0x0281;
    L_0x027a:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x031a }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x031a }
    L_0x0281:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x031c }
        r1 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x031c }
        r9.onViewCreated(r0, r1);	 Catch:{ IllegalArgumentException -> 0x031c }
        if (r7 == 0) goto L_0x028d;
    L_0x028a:
        r0 = 0;
        r9.mInnerView = r0;	 Catch:{ IllegalArgumentException -> 0x031c }
    L_0x028d:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x031e }
        r9.performActivityCreated(r0);	 Catch:{ IllegalArgumentException -> 0x031e }
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x031e }
        if (r0 == 0) goto L_0x029b;
    L_0x0296:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x031e }
        r9.restoreViewState(r0);	 Catch:{ IllegalArgumentException -> 0x031e }
    L_0x029b:
        r0 = 0;
        r9.mSavedFragmentState = r0;
    L_0x029e:
        r0 = r6;
        r1 = 3;
        if (r0 <= r1) goto L_0x02c9;
    L_0x02a2:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0320 }
        if (r1 == 0) goto L_0x02c6;
    L_0x02a6:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0320 }
        r2 = 83;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0320 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0320 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0320 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0320 }
        r4 = 100;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0320 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0320 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x0320 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0320 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0320 }
    L_0x02c6:
        r9.performStart();
    L_0x02c9:
        r1 = 4;
        if (r0 <= r1) goto L_0x005a;
    L_0x02cc:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0322 }
        if (r1 == 0) goto L_0x02f0;
    L_0x02d0:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0322 }
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0322 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0322 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0322 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0322 }
        r4 = 95;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0322 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0322 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x0322 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0322 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0322 }
    L_0x02f0:
        r1 = 1;
        r9.mResumed = r1;
        r9.performResume();
        r1 = 0;
        r9.mSavedFragmentState = r1;
        r1 = 0;
        r9.mSavedViewState = r1;
        goto L_0x005a;
    L_0x02fe:
        r0 = move-exception;
        throw r0;
    L_0x0300:
        r0 = move-exception;
        throw r0;
    L_0x0302:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0304 }
    L_0x0304:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0306 }
    L_0x0306:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0308 }
    L_0x0308:
        r0 = move-exception;
        throw r0;
    L_0x030a:
        r0 = move-exception;
        throw r0;
    L_0x030c:
        r0 = move-exception;
        throw r0;
    L_0x030e:
        r0 = move-exception;
        throw r0;
    L_0x0310:
        r0 = move-exception;
        throw r0;
    L_0x0312:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0314 }
    L_0x0314:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0316 }
    L_0x0316:
        r0 = move-exception;
        throw r0;
    L_0x0318:
        r0 = move-exception;
        throw r0;
    L_0x031a:
        r0 = move-exception;
        throw r0;
    L_0x031c:
        r0 = move-exception;
        throw r0;
    L_0x031e:
        r0 = move-exception;
        throw r0;
    L_0x0320:
        r0 = move-exception;
        throw r0;
    L_0x0322:
        r0 = move-exception;
        throw r0;
    L_0x0324:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0326 }
    L_0x0326:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0328 }
    L_0x0328:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x032a }
    L_0x032a:
        r0 = move-exception;
        throw r0;
    L_0x032c:
        r1 = 5;
        if (r0 >= r1) goto L_0x0359;
    L_0x032f:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x032a }
        if (r1 == 0) goto L_0x0353;
    L_0x0333:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x032a }
        r2 = 76;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x032a }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x032a }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x032a }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x032a }
        r4 = 94;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x032a }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x032a }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x032a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x032a }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x032a }
    L_0x0353:
        r9.performPause();
        r1 = 0;
        r9.mResumed = r1;
    L_0x0359:
        r1 = 4;
        if (r0 >= r1) goto L_0x0383;
    L_0x035c:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x04a1 }
        if (r1 == 0) goto L_0x0380;
    L_0x0360:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x04a1 }
        r2 = 99;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x04a1 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x04a1 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x04a1 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x04a1 }
        r4 = 92;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x04a1 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x04a1 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x04a1 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x04a1 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x04a1 }
    L_0x0380:
        r9.performStop();
    L_0x0383:
        r1 = 3;
        if (r0 >= r1) goto L_0x03ad;
    L_0x0386:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x04a3 }
        if (r1 == 0) goto L_0x03aa;
    L_0x038a:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x04a3 }
        r2 = 78;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x04a3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x04a3 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x04a3 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x04a3 }
        r4 = 90;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x04a3 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x04a3 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x04a3 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x04a3 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x04a3 }
    L_0x03aa:
        r9.performReallyStop();
    L_0x03ad:
        r1 = 2;
        if (r0 >= r1) goto L_0x0427;
    L_0x03b0:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x04a5 }
        if (r1 == 0) goto L_0x03d4;
    L_0x03b4:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x04a5 }
        r2 = 98;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x04a5 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x04a5 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x04a5 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x04a5 }
        r4 = 85;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x04a5 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x04a5 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x04a5 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x04a5 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x04a5 }
    L_0x03d4:
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x04a7 }
        if (r1 == 0) goto L_0x03e7;
    L_0x03d8:
        r1 = r8.mHost;	 Catch:{ IllegalArgumentException -> 0x04a9 }
        r1 = r1.onShouldSaveFragmentState(r9);	 Catch:{ IllegalArgumentException -> 0x04a9 }
        if (r1 == 0) goto L_0x03e7;
    L_0x03e0:
        r1 = r9.mSavedViewState;	 Catch:{ IllegalArgumentException -> 0x04ab }
        if (r1 != 0) goto L_0x03e7;
    L_0x03e4:
        r8.saveFragmentViewState(r9);	 Catch:{ IllegalArgumentException -> 0x04ab }
    L_0x03e7:
        r9.performDestroyView();	 Catch:{ IllegalArgumentException -> 0x04ad }
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x04ad }
        if (r1 == 0) goto L_0x041e;
    L_0x03ee:
        r1 = r9.mContainer;	 Catch:{ IllegalArgumentException -> 0x04ad }
        if (r1 == 0) goto L_0x041e;
    L_0x03f2:
        r1 = 0;
        r2 = r8.mCurState;	 Catch:{ IllegalArgumentException -> 0x04af }
        if (r2 <= 0) goto L_0x0400;
    L_0x03f7:
        r2 = r8.mDestroyed;	 Catch:{ IllegalArgumentException -> 0x04af }
        if (r2 != 0) goto L_0x0400;
    L_0x03fb:
        r1 = 0;
        r1 = r8.loadAnimation(r9, r11, r1, r12);
    L_0x0400:
        if (r1 == 0) goto L_0x0417;
    L_0x0402:
        r2 = r9.mView;
        r9.mAnimatingAway = r2;
        r9.mStateAfterAnimating = r0;
        r2 = r9.mView;
        r3 = new android.support.v4.app.FragmentManagerImpl$5;
        r3.<init>(r8, r2, r1, r9);
        r1.setAnimationListener(r3);
        r2 = r9.mView;
        r2.startAnimation(r1);
    L_0x0417:
        r1 = r9.mContainer;
        r2 = r9.mView;
        r1.removeView(r2);
    L_0x041e:
        r1 = 0;
        r9.mContainer = r1;
        r1 = 0;
        r9.mView = r1;
        r1 = 0;
        r9.mInnerView = r1;
    L_0x0427:
        r1 = 1;
        if (r0 >= r1) goto L_0x0065;
    L_0x042a:
        r1 = r8.mDestroyed;	 Catch:{ IllegalArgumentException -> 0x04b1 }
        if (r1 == 0) goto L_0x043a;
    L_0x042e:
        r1 = r9.mAnimatingAway;	 Catch:{ IllegalArgumentException -> 0x04b1 }
        if (r1 == 0) goto L_0x043a;
    L_0x0432:
        r1 = r9.mAnimatingAway;
        r2 = 0;
        r9.mAnimatingAway = r2;
        r1.clearAnimation();
    L_0x043a:
        r1 = r9.mAnimatingAway;
        if (r1 == 0) goto L_0x0443;
    L_0x043e:
        r9.mStateAfterAnimating = r0;
        r0 = 1;
        if (r7 == 0) goto L_0x0065;
    L_0x0443:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x04b3 }
        if (r1 == 0) goto L_0x0467;
    L_0x0447:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x04b3 }
        r2 = 84;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x04b3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x04b3 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x04b3 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x04b3 }
        r4 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x04b3 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x04b3 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x04b3 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x04b3 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x04b3 }
    L_0x0467:
        r1 = r9.mRetaining;	 Catch:{ IllegalArgumentException -> 0x04b5 }
        if (r1 != 0) goto L_0x046e;
    L_0x046b:
        r9.performDestroy();	 Catch:{ IllegalArgumentException -> 0x04b5 }
    L_0x046e:
        r1 = 0;
        r9.mCalled = r1;	 Catch:{ IllegalArgumentException -> 0x049f }
        r9.onDetach();	 Catch:{ IllegalArgumentException -> 0x049f }
        r1 = r9.mCalled;	 Catch:{ IllegalArgumentException -> 0x049f }
        if (r1 != 0) goto L_0x04b7;
    L_0x0478:
        r0 = new android.support.v4.app.SuperNotCalledException;	 Catch:{ IllegalArgumentException -> 0x049f }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x049f }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x049f }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x049f }
        r3 = 88;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x049f }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x049f }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x049f }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x049f }
        r3 = 89;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x049f }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x049f }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x049f }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x049f }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x049f }
    L_0x049f:
        r0 = move-exception;
        throw r0;
    L_0x04a1:
        r0 = move-exception;
        throw r0;
    L_0x04a3:
        r0 = move-exception;
        throw r0;
    L_0x04a5:
        r0 = move-exception;
        throw r0;
    L_0x04a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x04a9 }
    L_0x04a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x04ab }
    L_0x04ab:
        r0 = move-exception;
        throw r0;
    L_0x04ad:
        r0 = move-exception;
        throw r0;
    L_0x04af:
        r0 = move-exception;
        throw r0;
    L_0x04b1:
        r0 = move-exception;
        throw r0;
    L_0x04b3:
        r0 = move-exception;
        throw r0;
    L_0x04b5:
        r0 = move-exception;
        throw r0;
    L_0x04b7:
        if (r13 != 0) goto L_0x0065;
    L_0x04b9:
        r1 = r9.mRetaining;	 Catch:{ IllegalArgumentException -> 0x04d2 }
        if (r1 != 0) goto L_0x04c2;
    L_0x04bd:
        r8.makeInactive(r9);	 Catch:{ IllegalArgumentException -> 0x04d0 }
        if (r7 == 0) goto L_0x0065;
    L_0x04c2:
        r1 = 0;
        r9.mHost = r1;	 Catch:{ IllegalArgumentException -> 0x04d0 }
        r1 = 0;
        r9.mParentFragment = r1;	 Catch:{ IllegalArgumentException -> 0x04d0 }
        r1 = 0;
        r9.mFragmentManager = r1;	 Catch:{ IllegalArgumentException -> 0x04d0 }
        r1 = 0;
        r9.mChildFragmentManager = r1;	 Catch:{ IllegalArgumentException -> 0x04d0 }
        goto L_0x0065;
    L_0x04d0:
        r0 = move-exception;
        throw r0;
    L_0x04d2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x04d0 }
    L_0x04d4:
        r0 = r6;
        goto L_0x02c9;
    L_0x04d7:
        r0 = r6;
        goto L_0x005c;
    L_0x04da:
        r6 = r10;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.moveToState(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    void startPendingDeferredFragments() {
        boolean z = Fragment.a;
        try {
            if (this.mActive != null) {
                int i = 0;
                while (i < this.mActive.size()) {
                    Fragment fragment = (Fragment) this.mActive.get(i);
                    if (fragment != null) {
                        try {
                            performPendingDeferredStart(fragment);
                        } catch (IllegalArgumentException e) {
                            throw e;
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
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static int transitToStyleIndex(int i, boolean z) {
        int i2;
        boolean z2 = Fragment.a;
        switch (i) {
            case 4097:
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                if (!z2) {
                    return i2;
                }
                break;
            case 4099:
                break;
            case 8194:
                break;
            default:
                return -1;
        }
        i2 = z ? 3 : 4;
        if (!z2) {
            return i2;
        }
        if (z) {
            return 5;
        }
        return 6;
    }

    void addBackStackState(BackStackRecord backStackRecord) {
        try {
            if (this.mBackStack == null) {
                this.mBackStack = new ArrayList();
            }
            this.mBackStack.add(backStackRecord);
            reportBackStackChanged();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void throwException(java.lang.RuntimeException r6) {
        /*
        r5 = this;
        r0 = z;
        r1 = 63;
        r0 = r0[r1];
        r1 = r6.getMessage();
        android.util.Log.e(r0, r1);
        r0 = z;
        r1 = 65;
        r0 = r0[r1];
        r1 = z;
        r2 = 71;
        r1 = r1[r2];
        android.util.Log.e(r0, r1);
        r0 = new android.support.v4.util.LogWriter;
        r1 = z;
        r2 = 69;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = new java.io.PrintWriter;
        r1.<init>(r0);
        r0 = r5.mHost;
        if (r0 == 0) goto L_0x0054;
    L_0x0030:
        r0 = r5.mHost;	 Catch:{ Exception -> 0x0040 }
        r2 = z;	 Catch:{ Exception -> 0x0040 }
        r3 = 68;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0040 }
        r3 = 0;
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ Exception -> 0x0040 }
        r0.onDump(r2, r3, r1, r4);	 Catch:{ Exception -> 0x0040 }
    L_0x003f:
        throw r6;
    L_0x0040:
        r0 = move-exception;
        r2 = z;
        r3 = 62;
        r2 = r2[r3];
        r3 = z;
        r4 = 67;
        r3 = r3[r4];
        android.util.Log.e(r2, r3, r0);
        r0 = android.support.v4.app.Fragment.a;
        if (r0 == 0) goto L_0x003f;
    L_0x0054:
        r0 = z;	 Catch:{ Exception -> 0x0062 }
        r2 = 64;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0062 }
        r2 = 0;
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ Exception -> 0x0062 }
        r5.dump(r0, r2, r1, r3);	 Catch:{ Exception -> 0x0062 }
        goto L_0x003f;
    L_0x0062:
        r0 = move-exception;
        r1 = z;
        r2 = 70;
        r1 = r1[r2];
        r2 = z;
        r3 = 66;
        r2 = r2[r3];
        android.util.Log.e(r1, r2, r0);
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.throwException(java.lang.RuntimeException):void");
    }

    void reportBackStackChanged() {
        boolean z = Fragment.a;
        if (this.mBackStackChangeListeners != null) {
            int i = 0;
            while (i < this.mBackStackChangeListeners.size()) {
                ((OnBackStackChangedListener) this.mBackStackChangeListeners.get(i)).onBackStackChanged();
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public void dispatchActivityCreated() {
        this.mStateSaved = false;
        moveToState(2, false);
    }

    static boolean shouldRunOnHWLayer(View view, Animation animation) {
        try {
            if (VERSION.SDK_INT >= 19) {
                if (ViewCompat.getLayerType(view) == 0) {
                    try {
                        if (ViewCompat.hasOverlappingRendering(view)) {
                            try {
                                if (modifiesAlpha(animation)) {
                                    return true;
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public void showFragment(Fragment fragment, int i, int i2) {
        try {
            if (DEBUG) {
                Log.v(z[56], z[55] + fragment);
            }
            try {
                if (fragment.mHidden) {
                    fragment.mHidden = false;
                    if (fragment.mView != null) {
                        Animation loadAnimation = loadAnimation(fragment, i, true, i2);
                        if (loadAnimation != null) {
                            try {
                                setHWLayerAnimListenerIfAlpha(fragment.mView, loadAnimation);
                                fragment.mView.startAnimation(loadAnimation);
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        fragment.mView.setVisibility(0);
                    }
                    try {
                        if (fragment.mAdded) {
                            if (fragment.mHasMenu) {
                                try {
                                    if (fragment.mMenuVisible) {
                                        this.mNeedMenuInvalidate = true;
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw e2;
                                }
                            }
                        }
                        fragment.onHiddenChanged(false);
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
    }

    public boolean dispatchContextItemSelected(MenuItem menuItem) {
        boolean z = Fragment.a;
        if (this.mAdded == null) {
            return false;
        }
        int i = 0;
        while (i < this.mAdded.size()) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null) {
                try {
                    if (fragment.performContextItemSelected(menuItem)) {
                        return true;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            int i2 = i + 1;
            if (z) {
                return false;
            }
            i = i2;
        }
        return false;
    }

    public void attachController(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment) {
        try {
            if (this.mHost != null) {
                throw new IllegalStateException(z[172]);
            }
            this.mHost = fragmentHostCallback;
            this.mContainer = fragmentContainer;
            this.mParent = fragment;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void makeActive(android.support.v4.app.Fragment r5) {
        /*
        r4 = this;
        r0 = r5.mIndex;	 Catch:{ IllegalArgumentException -> 0x0005 }
        if (r0 < 0) goto L_0x0007;
    L_0x0004:
        return;
    L_0x0005:
        r0 = move-exception;
        throw r0;
    L_0x0007:
        r0 = r4.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x0079 }
        if (r0 == 0) goto L_0x0013;
    L_0x000b:
        r0 = r4.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x007b }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r0 > 0) goto L_0x0032;
    L_0x0013:
        r0 = r4.mActive;	 Catch:{ IllegalArgumentException -> 0x007d }
        if (r0 != 0) goto L_0x001e;
    L_0x0017:
        r0 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x007d }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x007d }
        r4.mActive = r0;	 Catch:{ IllegalArgumentException -> 0x007d }
    L_0x001e:
        r0 = r4.mActive;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r4.mParent;	 Catch:{ IllegalArgumentException -> 0x007f }
        r5.setIndex(r0, r1);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r4.mActive;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0.add(r5);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r0 == 0) goto L_0x0052;
    L_0x0032:
        r0 = r4.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r4.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r1.size();	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r1 + -1;
        r0 = r0.remove(r1);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r0.intValue();	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r4.mParent;	 Catch:{ IllegalArgumentException -> 0x007f }
        r5.setIndex(r0, r1);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r4.mActive;	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r5.mIndex;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0.set(r1, r5);	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x0052:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r0 == 0) goto L_0x0004;
    L_0x0056:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = 25;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r3 = 24;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0077 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0077 }
        goto L_0x0004;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.makeActive(android.support.v4.app.Fragment):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setBackStackIndex(int r7, android.support.v4.app.BackStackRecord r8) {
        /*
        r6 = this;
        r1 = android.support.v4.app.Fragment.a;
        monitor-enter(r6);
        r0 = r6.mBackStackIndices;	 Catch:{ all -> 0x00d0 }
        if (r0 != 0) goto L_0x000e;
    L_0x0007:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x00d0 }
        r0.<init>();	 Catch:{ all -> 0x00d0 }
        r6.mBackStackIndices = r0;	 Catch:{ all -> 0x00d0 }
    L_0x000e:
        r0 = r6.mBackStackIndices;	 Catch:{ all -> 0x00d0 }
        r0 = r0.size();	 Catch:{ all -> 0x00d0 }
        if (r7 >= r0) goto L_0x004f;
    L_0x0016:
        r2 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x00cc }
        if (r2 == 0) goto L_0x0048;
    L_0x001a:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = 47;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x00ce }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r5 = 49;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r3.append(r7);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r5 = 46;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r3.append(r8);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00ce }
        android.util.Log.v(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00ce }
    L_0x0048:
        r2 = r6.mBackStackIndices;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r2.set(r7, r8);	 Catch:{ IllegalArgumentException -> 0x00d3 }
        if (r1 == 0) goto L_0x00ca;
    L_0x004f:
        if (r0 >= r7) goto L_0x0093;
    L_0x0051:
        r2 = r6.mBackStackIndices;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r3 = 0;
        r2.add(r3);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r2 = r6.mAvailBackStackIndices;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        if (r2 != 0) goto L_0x0062;
    L_0x005b:
        r2 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r6.mAvailBackStackIndices = r2;	 Catch:{ IllegalArgumentException -> 0x00d5 }
    L_0x0062:
        r2 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        if (r2 == 0) goto L_0x0086;
    L_0x0066:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3 = 44;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r5 = 43;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3 = r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00d7 }
        android.util.Log.v(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00d7 }
    L_0x0086:
        r2 = r6.mAvailBackStackIndices;	 Catch:{ all -> 0x00d0 }
        r3 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00d0 }
        r2.add(r3);	 Catch:{ all -> 0x00d0 }
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x004f;
    L_0x0093:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        if (r0 == 0) goto L_0x00c5;
    L_0x0097:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = 45;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r3 = 48;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = r1.append(r7);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r3 = 50;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = r1.append(r8);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x00d9 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x00d9 }
    L_0x00c5:
        r0 = r6.mBackStackIndices;	 Catch:{ all -> 0x00d0 }
        r0.add(r8);	 Catch:{ all -> 0x00d0 }
    L_0x00ca:
        monitor-exit(r6);	 Catch:{ all -> 0x00d0 }
        return;
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00d0 }
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d0 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d0 }
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d0 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d0 }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.setBackStackIndex(int, android.support.v4.app.BackStackRecord):void");
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        boolean z = Fragment.a;
        if (this.mAdded == null) {
            return false;
        }
        int i = 0;
        boolean z2 = false;
        while (i < this.mAdded.size()) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null) {
                try {
                    if (fragment.performPrepareOptionsMenu(menu)) {
                        z2 = true;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            int i2 = i + 1;
            if (z) {
                return z2;
            }
            i = i2;
        }
        return z2;
    }

    static boolean modifiesAlpha(Animation animation) {
        boolean z = Fragment.a;
        try {
            if (animation instanceof AlphaAnimation) {
                return true;
            }
            if (!(animation instanceof AnimationSet)) {
                return false;
            }
            List animations = ((AnimationSet) animation).getAnimations();
            int i = 0;
            while (i < animations.size()) {
                try {
                    if (animations.get(i) instanceof AlphaAnimation) {
                        return true;
                    }
                    i++;
                    if (z) {
                        return false;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return false;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void performPendingDeferredStart(Fragment fragment) {
        try {
            if (!fragment.mDeferStart) {
                return;
            }
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
                return;
            }
            fragment.mDeferStart = false;
            moveToState(fragment, this.mCurState, 0, 0, false);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchCreateOptionsMenu(android.view.Menu r8, android.view.MenuInflater r9) {
        /*
        r7 = this;
        r3 = 0;
        r5 = android.support.v4.app.Fragment.a;
        r1 = 0;
        r0 = r7.mAdded;
        if (r0 == 0) goto L_0x005d;
    L_0x0008:
        r2 = r3;
        r4 = r3;
    L_0x000a:
        r0 = r7.mAdded;
        r0 = r0.size();
        if (r2 >= r0) goto L_0x0031;
    L_0x0012:
        r0 = r7.mAdded;
        r0 = r0.get(r2);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 == 0) goto L_0x002d;
    L_0x001c:
        r6 = r0.performCreateOptionsMenu(r8, r9);	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r6 == 0) goto L_0x002d;
    L_0x0022:
        r4 = 1;
        if (r1 != 0) goto L_0x002a;
    L_0x0025:
        r1 = new java.util.ArrayList;
        r1.<init>();
    L_0x002a:
        r1.add(r0);
    L_0x002d:
        r0 = r2 + 1;
        if (r5 == 0) goto L_0x005b;
    L_0x0031:
        r0 = r7.mCreatedMenus;
        if (r0 == 0) goto L_0x0054;
    L_0x0035:
        r0 = r7.mCreatedMenus;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x0054;
    L_0x003d:
        r0 = r7.mCreatedMenus;
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r1 == 0) goto L_0x004d;
    L_0x0047:
        r2 = r1.contains(r0);	 Catch:{ IllegalArgumentException -> 0x0059 }
        if (r2 != 0) goto L_0x0050;
    L_0x004d:
        r0.onDestroyOptionsMenu();	 Catch:{ IllegalArgumentException -> 0x0059 }
    L_0x0050:
        r3 = r3 + 1;
        if (r5 == 0) goto L_0x0035;
    L_0x0054:
        r7.mCreatedMenus = r1;
        return r4;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r2 = r0;
        goto L_0x000a;
    L_0x005d:
        r4 = r3;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.dispatchCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):boolean");
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
        boolean z = Fragment.a;
        if (this.mAdded != null) {
            int i = 0;
            while (i < this.mAdded.size()) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null) {
                    try {
                        fragment.performConfigurationChanged(configuration);
                    } catch (IllegalArgumentException e) {
                        throw e;
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
    }

    static Animation makeFadeAnimation(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    void moveToState(int i, int i2, int i3, boolean z) {
        boolean z2 = Fragment.a;
        try {
            if (this.mHost != null || i == 0) {
                if (!z) {
                    try {
                        if (this.mCurState == i) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                this.mCurState = i;
                if (this.mActive != null) {
                    int hasRunningLoaders;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < this.mActive.size()) {
                        int i6;
                        Fragment fragment = (Fragment) this.mActive.get(i4);
                        if (fragment != null) {
                            try {
                                moveToState(fragment, i, i2, i3, false);
                                if (fragment.mLoaderManager != null) {
                                    hasRunningLoaders = i5 | fragment.mLoaderManager.hasRunningLoaders();
                                    i6 = i4 + 1;
                                    if (z2) {
                                        break;
                                    }
                                    i4 = i6;
                                    i5 = hasRunningLoaders;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                        hasRunningLoaders = i5;
                        i6 = i4 + 1;
                        if (z2) {
                            break;
                        }
                        i4 = i6;
                        i5 = hasRunningLoaders;
                    }
                    hasRunningLoaders = i5;
                    if (hasRunningLoaders == 0) {
                        try {
                            startPendingDeferredFragments();
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                    try {
                        if (!this.mNeedMenuInvalidate) {
                            return;
                        }
                        if (this.mHost != null) {
                            try {
                                if (this.mCurState == 5) {
                                    this.mHost.onSupportInvalidateOptionsMenu();
                                    this.mNeedMenuInvalidate = false;
                                    return;
                                }
                                return;
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            }
                        }
                        return;
                    } catch (IllegalArgumentException e2222) {
                        throw e2222;
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                } else {
                    return;
                }
            }
            throw new IllegalStateException(z[51]);
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        } catch (IllegalArgumentException e2222222) {
            throw e2222222;
        }
    }

    LayoutInflaterFactory getLayoutInflaterFactory() {
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean popBackStackState(android.os.Handler r12, java.lang.String r13, int r14, int r15) {
        /*
        r11 = this;
        r4 = android.support.v4.app.Fragment.a;
        r0 = r11.mBackStack;	 Catch:{ IllegalArgumentException -> 0x0008 }
        if (r0 != 0) goto L_0x000a;
    L_0x0006:
        r0 = 0;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        if (r13 != 0) goto L_0x003d;
    L_0x000c:
        if (r14 >= 0) goto L_0x003d;
    L_0x000e:
        r0 = r15 & 1;
        if (r0 != 0) goto L_0x003d;
    L_0x0012:
        r0 = r11.mBackStack;
        r0 = r0.size();
        r0 = r0 + -1;
        if (r0 >= 0) goto L_0x001e;
    L_0x001c:
        r0 = 0;
        goto L_0x0007;
    L_0x001e:
        r1 = r11.mBackStack;
        r0 = r1.remove(r0);
        r0 = (android.support.v4.app.BackStackRecord) r0;
        r1 = new android.util.SparseArray;
        r1.<init>();
        r2 = new android.util.SparseArray;
        r2.<init>();
        r0.calculateBackFragments(r1, r2);
        r3 = 1;
        r5 = 0;
        r0.popFromBackStack(r3, r5, r1, r2);
        r11.reportBackStackChanged();
        if (r4 == 0) goto L_0x0137;
    L_0x003d:
        r0 = -1;
        if (r13 != 0) goto L_0x0042;
    L_0x0040:
        if (r14 < 0) goto L_0x0148;
    L_0x0042:
        r0 = r11.mBackStack;
        r0 = r0.size();
        r1 = r0 + -1;
    L_0x004a:
        if (r1 < 0) goto L_0x014e;
    L_0x004c:
        r0 = r11.mBackStack;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.BackStackRecord) r0;
        if (r13 == 0) goto L_0x0062;
    L_0x0056:
        r2 = r0.getName();	 Catch:{ IllegalArgumentException -> 0x0072 }
        r2 = r13.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r2 == 0) goto L_0x0062;
    L_0x0060:
        if (r4 == 0) goto L_0x014e;
    L_0x0062:
        if (r14 < 0) goto L_0x006a;
    L_0x0064:
        r0 = r0.mIndex;	 Catch:{ IllegalArgumentException -> 0x0078 }
        if (r14 != r0) goto L_0x006a;
    L_0x0068:
        if (r4 == 0) goto L_0x014e;
    L_0x006a:
        r0 = r1 + -1;
        if (r4 == 0) goto L_0x014b;
    L_0x006e:
        if (r0 >= 0) goto L_0x007c;
    L_0x0070:
        r0 = 0;
        goto L_0x0007;
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r1 = r15 & 1;
        if (r1 == 0) goto L_0x0148;
    L_0x0080:
        r1 = r0 + -1;
    L_0x0082:
        if (r1 < 0) goto L_0x00a3;
    L_0x0084:
        r0 = r11.mBackStack;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.BackStackRecord) r0;
        if (r13 == 0) goto L_0x0098;
    L_0x008e:
        r2 = r0.getName();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r2 = r13.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        if (r2 != 0) goto L_0x009e;
    L_0x0098:
        if (r14 < 0) goto L_0x00a3;
    L_0x009a:
        r0 = r0.mIndex;	 Catch:{ IllegalArgumentException -> 0x00b4 }
        if (r14 != r0) goto L_0x00a3;
    L_0x009e:
        r0 = r1 + -1;
        if (r4 == 0) goto L_0x0145;
    L_0x00a2:
        r1 = r0;
    L_0x00a3:
        r0 = r11.mBackStack;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r0 = r0 + -1;
        if (r1 != r0) goto L_0x00b8;
    L_0x00ad:
        r0 = 0;
        goto L_0x0007;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0 = r11.mBackStack;
        r0 = r0.size();
        r0 = r0 + -1;
    L_0x00c5:
        if (r0 <= r1) goto L_0x00d4;
    L_0x00c7:
        r2 = r11.mBackStack;
        r2 = r2.remove(r0);
        r5.add(r2);
        r0 = r0 + -1;
        if (r4 == 0) goto L_0x00c5;
    L_0x00d4:
        r0 = r5.size();
        r6 = r0 + -1;
        r7 = new android.util.SparseArray;
        r7.<init>();
        r8 = new android.util.SparseArray;
        r8.<init>();
        r0 = 0;
        r1 = r0;
    L_0x00e6:
        if (r1 > r6) goto L_0x00f5;
    L_0x00e8:
        r0 = r5.get(r1);
        r0 = (android.support.v4.app.BackStackRecord) r0;
        r0.calculateBackFragments(r7, r8);
        r0 = r1 + 1;
        if (r4 == 0) goto L_0x0143;
    L_0x00f5:
        r1 = 0;
        r0 = 0;
        r2 = r0;
        r3 = r1;
    L_0x00f9:
        if (r2 > r6) goto L_0x0134;
    L_0x00fb:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x013a }
        if (r0 == 0) goto L_0x0123;
    L_0x00ff:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x013a }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x013a }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x013a }
        r10 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x013a }
        r9 = r5.get(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x013a }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x013a }
    L_0x0123:
        r0 = r5.get(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
        r0 = (android.support.v4.app.BackStackRecord) r0;	 Catch:{ IllegalArgumentException -> 0x013c }
        if (r2 != r6) goto L_0x013e;
    L_0x012b:
        r1 = 1;
    L_0x012c:
        r1 = r0.popFromBackStack(r1, r3, r7, r8);
        r0 = r2 + 1;
        if (r4 == 0) goto L_0x0140;
    L_0x0134:
        r11.reportBackStackChanged();
    L_0x0137:
        r0 = 1;
        goto L_0x0007;
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r0 = move-exception;
        throw r0;
    L_0x013e:
        r1 = 0;
        goto L_0x012c;
    L_0x0140:
        r2 = r0;
        r3 = r1;
        goto L_0x00f9;
    L_0x0143:
        r1 = r0;
        goto L_0x00e6;
    L_0x0145:
        r1 = r0;
        goto L_0x0082;
    L_0x0148:
        r1 = r0;
        goto L_0x00a3;
    L_0x014b:
        r1 = r0;
        goto L_0x004a;
    L_0x014e:
        r0 = r1;
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.popBackStackState(android.os.Handler, java.lang.String, int, int):boolean");
    }

    public void dispatchDestroyView() {
        moveToState(1, false);
    }

    public boolean popBackStackImmediate() {
        checkStateLoss();
        executePendingTransactions();
        return popBackStackState(this.mHost.getHandler(), null, -1, 0);
    }

    public FragmentTransaction beginTransaction() {
        return new BackStackRecord(this);
    }

    Bundle saveFragmentBasicState(Fragment fragment) {
        try {
            Bundle bundle;
            if (this.mStateBundle == null) {
                this.mStateBundle = new Bundle();
            }
            fragment.performSaveInstanceState(this.mStateBundle);
            if (this.mStateBundle.isEmpty()) {
                bundle = null;
            } else {
                bundle = this.mStateBundle;
                this.mStateBundle = null;
            }
            try {
                if (fragment.mView != null) {
                    saveFragmentViewState(fragment);
                }
                try {
                    if (fragment.mSavedViewState != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray(z[58], fragment.mSavedViewState);
                    }
                    try {
                        if (!fragment.mUserVisibleHint) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBoolean(z[57], fragment.mUserVisibleHint);
                        }
                        return bundle;
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
    }

    public SavedState saveFragmentInstanceState(Fragment fragment) {
        try {
            if (fragment.mIndex < 0) {
                throwException(new IllegalStateException(z[36] + fragment + z[35]));
            }
            if (fragment.mState <= 0) {
                return null;
            }
            Bundle saveFragmentBasicState = saveFragmentBasicState(fragment);
            if (saveFragmentBasicState == null) {
                return null;
            }
            try {
                return new SavedState(saveFragmentBasicState);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int allocBackStackIndex(android.support.v4.app.BackStackRecord r6) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:android.support.v4.app.FragmentManagerImpl.allocBackStackIndex(android.support.v4.app.BackStackRecord):int. bs: [B:14:0x001e, B:36:0x0074]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.mAvailBackStackIndices;	 Catch:{ all -> 0x005b }
        if (r0 == 0) goto L_0x000d;
    L_0x0005:
        r0 = r5.mAvailBackStackIndices;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r0 > 0) goto L_0x0060;	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x000d:
        r0 = r5.mBackStackIndices;	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r0 != 0) goto L_0x0018;
    L_0x0011:
        r0 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x0059 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0059 }
        r5.mBackStackIndices = r0;	 Catch:{ IllegalArgumentException -> 0x0059 }
    L_0x0018:
        r0 = r5.mBackStackIndices;	 Catch:{ all -> 0x005b }
        r0 = r0.size();	 Catch:{ all -> 0x005b }
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x005e }
        if (r1 == 0) goto L_0x0050;	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x0022:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = 105; // 0x69 float:1.47E-43 double:5.2E-322;	 Catch:{ IllegalArgumentException -> 0x005e }
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x005e }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x005e }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;	 Catch:{ IllegalArgumentException -> 0x005e }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x005e }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = 106; // 0x6a float:1.49E-43 double:5.24E-322;	 Catch:{ IllegalArgumentException -> 0x005e }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r2.append(r6);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x005e }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x0050:
        r1 = r5.mBackStackIndices;	 Catch:{ all -> 0x005b }
        r1.add(r6);	 Catch:{ all -> 0x005b }
        monitor-exit(r5);	 Catch:{ all -> 0x005b }
    L_0x0056:
        return r0;
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005b }
    L_0x005b:
        r0 = move-exception;	 Catch:{ all -> 0x005b }
        monitor-exit(r5);	 Catch:{ all -> 0x005b }
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005b }
    L_0x0060:
        r0 = r5.mAvailBackStackIndices;	 Catch:{ all -> 0x005b }
        r1 = r5.mAvailBackStackIndices;	 Catch:{ all -> 0x005b }
        r1 = r1.size();	 Catch:{ all -> 0x005b }
        r1 = r1 + -1;	 Catch:{ all -> 0x005b }
        r0 = r0.remove(r1);	 Catch:{ all -> 0x005b }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x005b }
        r0 = r0.intValue();	 Catch:{ all -> 0x005b }
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x00ad }
        if (r1 == 0) goto L_0x00a6;	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x0078:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x00ad }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r4 = 107; // 0x6b float:1.5E-43 double:5.3E-322;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r4 = 110; // 0x6e float:1.54E-43 double:5.43E-322;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = r2.append(r6);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00ad }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x00a6:
        r1 = r5.mBackStackIndices;	 Catch:{ all -> 0x005b }
        r1.set(r0, r6);	 Catch:{ all -> 0x005b }
        monitor-exit(r5);	 Catch:{ all -> 0x005b }
        goto L_0x0056;	 Catch:{ all -> 0x005b }
    L_0x00ad:
        r0 = move-exception;	 Catch:{ all -> 0x005b }
        throw r0;	 Catch:{ all -> 0x005b }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.allocBackStackIndex(android.support.v4.app.BackStackRecord):int");
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        boolean z = Fragment.a;
        if (this.mAdded == null) {
            return false;
        }
        int i = 0;
        while (i < this.mAdded.size()) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null) {
                try {
                    if (fragment.performOptionsItemSelected(menuItem)) {
                        return true;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            int i2 = i + 1;
            if (z) {
                return false;
            }
            i = i2;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.os.Parcelable saveAllState() {
        /*
        r13 = this;
        r4 = 1;
        r2 = 0;
        r3 = 0;
        r6 = android.support.v4.app.Fragment.a;
        r13.execPendingActions();	 Catch:{ IllegalArgumentException -> 0x001c }
        r0 = HONEYCOMB;	 Catch:{ IllegalArgumentException -> 0x001c }
        if (r0 == 0) goto L_0x000f;
    L_0x000c:
        r0 = 1;
        r13.mStateSaved = r0;	 Catch:{ IllegalArgumentException -> 0x001c }
    L_0x000f:
        r0 = r13.mActive;	 Catch:{ IllegalArgumentException -> 0x001e }
        if (r0 == 0) goto L_0x001b;
    L_0x0013:
        r0 = r13.mActive;	 Catch:{ IllegalArgumentException -> 0x0020 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0020 }
        if (r0 > 0) goto L_0x0022;
    L_0x001b:
        return r2;
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = r13.mActive;
        r7 = r0.size();
        r8 = new android.support.v4.app.FragmentState[r7];
        r5 = r3;
        r1 = r3;
    L_0x002c:
        if (r5 >= r7) goto L_0x0256;
    L_0x002e:
        r0 = r13.mActive;
        r0 = r0.get(r5);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 == 0) goto L_0x0253;
    L_0x0038:
        r1 = r0.mIndex;	 Catch:{ IllegalArgumentException -> 0x0136 }
        if (r1 >= 0) goto L_0x0069;
    L_0x003c:
        r1 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0136 }
        r9 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0136 }
        r9.<init>();	 Catch:{ IllegalArgumentException -> 0x0136 }
        r10 = z;	 Catch:{ IllegalArgumentException -> 0x0136 }
        r11 = 5;
        r10 = r10[r11];	 Catch:{ IllegalArgumentException -> 0x0136 }
        r9 = r9.append(r10);	 Catch:{ IllegalArgumentException -> 0x0136 }
        r9 = r9.append(r0);	 Catch:{ IllegalArgumentException -> 0x0136 }
        r10 = z;	 Catch:{ IllegalArgumentException -> 0x0136 }
        r11 = 7;
        r10 = r10[r11];	 Catch:{ IllegalArgumentException -> 0x0136 }
        r9 = r9.append(r10);	 Catch:{ IllegalArgumentException -> 0x0136 }
        r10 = r0.mIndex;	 Catch:{ IllegalArgumentException -> 0x0136 }
        r9 = r9.append(r10);	 Catch:{ IllegalArgumentException -> 0x0136 }
        r9 = r9.toString();	 Catch:{ IllegalArgumentException -> 0x0136 }
        r1.<init>(r9);	 Catch:{ IllegalArgumentException -> 0x0136 }
        r13.throwException(r1);	 Catch:{ IllegalArgumentException -> 0x0136 }
    L_0x0069:
        r1 = new android.support.v4.app.FragmentState;
        r1.<init>(r0);
        r8[r5] = r1;	 Catch:{ IllegalArgumentException -> 0x0138 }
        r9 = r0.mState;	 Catch:{ IllegalArgumentException -> 0x0138 }
        if (r9 <= 0) goto L_0x00e1;
    L_0x0074:
        r9 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x013a }
        if (r9 != 0) goto L_0x00e1;
    L_0x0078:
        r9 = r13.saveFragmentBasicState(r0);	 Catch:{ IllegalArgumentException -> 0x013c }
        r1.mSavedFragmentState = r9;	 Catch:{ IllegalArgumentException -> 0x013c }
        r9 = r0.mTarget;	 Catch:{ IllegalArgumentException -> 0x013c }
        if (r9 == 0) goto L_0x00e5;
    L_0x0082:
        r9 = r0.mTarget;	 Catch:{ IllegalArgumentException -> 0x013e }
        r9 = r9.mIndex;	 Catch:{ IllegalArgumentException -> 0x013e }
        if (r9 >= 0) goto L_0x00b6;
    L_0x0088:
        r9 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x013e }
        r10 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x013e }
        r10.<init>();	 Catch:{ IllegalArgumentException -> 0x013e }
        r11 = z;	 Catch:{ IllegalArgumentException -> 0x013e }
        r12 = 6;
        r11 = r11[r12];	 Catch:{ IllegalArgumentException -> 0x013e }
        r10 = r10.append(r11);	 Catch:{ IllegalArgumentException -> 0x013e }
        r10 = r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x013e }
        r11 = z;	 Catch:{ IllegalArgumentException -> 0x013e }
        r12 = 8;
        r11 = r11[r12];	 Catch:{ IllegalArgumentException -> 0x013e }
        r10 = r10.append(r11);	 Catch:{ IllegalArgumentException -> 0x013e }
        r11 = r0.mTarget;	 Catch:{ IllegalArgumentException -> 0x013e }
        r10 = r10.append(r11);	 Catch:{ IllegalArgumentException -> 0x013e }
        r10 = r10.toString();	 Catch:{ IllegalArgumentException -> 0x013e }
        r9.<init>(r10);	 Catch:{ IllegalArgumentException -> 0x013e }
        r13.throwException(r9);	 Catch:{ IllegalArgumentException -> 0x013e }
    L_0x00b6:
        r9 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0140 }
        if (r9 != 0) goto L_0x00c1;
    L_0x00ba:
        r9 = new android.os.Bundle;	 Catch:{ IllegalArgumentException -> 0x0140 }
        r9.<init>();	 Catch:{ IllegalArgumentException -> 0x0140 }
        r1.mSavedFragmentState = r9;	 Catch:{ IllegalArgumentException -> 0x0140 }
    L_0x00c1:
        r9 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r10 = z;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r11 = 13;
        r10 = r10[r11];	 Catch:{ IllegalArgumentException -> 0x0142 }
        r11 = r0.mTarget;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r13.putFragment(r9, r10, r11);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r9 = r0.mTargetRequestCode;	 Catch:{ IllegalArgumentException -> 0x0142 }
        if (r9 == 0) goto L_0x00e5;
    L_0x00d2:
        r9 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r10 = z;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r11 = 9;
        r10 = r10[r11];	 Catch:{ IllegalArgumentException -> 0x0144 }
        r11 = r0.mTargetRequestCode;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r9.putInt(r10, r11);	 Catch:{ IllegalArgumentException -> 0x0144 }
        if (r6 == 0) goto L_0x00e5;
    L_0x00e1:
        r9 = r0.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r1.mSavedFragmentState = r9;	 Catch:{ IllegalArgumentException -> 0x0144 }
    L_0x00e5:
        r9 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0146 }
        if (r9 == 0) goto L_0x0250;
    L_0x00e9:
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x0146 }
        r10 = 17;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x0146 }
        r10 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0146 }
        r10.<init>();	 Catch:{ IllegalArgumentException -> 0x0146 }
        r11 = z;	 Catch:{ IllegalArgumentException -> 0x0146 }
        r12 = 10;
        r11 = r11[r12];	 Catch:{ IllegalArgumentException -> 0x0146 }
        r10 = r10.append(r11);	 Catch:{ IllegalArgumentException -> 0x0146 }
        r0 = r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x0146 }
        r10 = z;	 Catch:{ IllegalArgumentException -> 0x0146 }
        r11 = 2;
        r10 = r10[r11];	 Catch:{ IllegalArgumentException -> 0x0146 }
        r0 = r0.append(r10);	 Catch:{ IllegalArgumentException -> 0x0146 }
        r1 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0146 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0146 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0146 }
        android.util.Log.v(r9, r0);	 Catch:{ IllegalArgumentException -> 0x0146 }
        r0 = r4;
    L_0x0119:
        r1 = r5 + 1;
        if (r6 == 0) goto L_0x024c;
    L_0x011d:
        if (r0 != 0) goto L_0x0148;
    L_0x011f:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r0 == 0) goto L_0x001b;
    L_0x0123:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0134 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r3 = 14;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x0134 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0134 }
        goto L_0x001b;
    L_0x0134:
        r0 = move-exception;
        throw r0;
    L_0x0136:
        r0 = move-exception;
        throw r0;
    L_0x0138:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013a }
    L_0x013a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013c }
    L_0x013c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013e }
    L_0x013e:
        r0 = move-exception;
        throw r0;
    L_0x0140:
        r0 = move-exception;
        throw r0;
    L_0x0142:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0144 }
    L_0x0144:
        r0 = move-exception;
        throw r0;
    L_0x0146:
        r0 = move-exception;
        throw r0;
    L_0x0148:
        r0 = r13.mAdded;
        if (r0 == 0) goto L_0x024a;
    L_0x014c:
        r0 = r13.mAdded;
        r5 = r0.size();
        if (r5 <= 0) goto L_0x024a;
    L_0x0154:
        r1 = new int[r5];
        r4 = r3;
    L_0x0157:
        if (r4 >= r5) goto L_0x01d8;
    L_0x0159:
        r0 = r13.mAdded;	 Catch:{ IllegalArgumentException -> 0x023f }
        r0 = r0.get(r4);	 Catch:{ IllegalArgumentException -> 0x023f }
        r0 = (android.support.v4.app.Fragment) r0;	 Catch:{ IllegalArgumentException -> 0x023f }
        r0 = r0.mIndex;	 Catch:{ IllegalArgumentException -> 0x023f }
        r1[r4] = r0;	 Catch:{ IllegalArgumentException -> 0x023f }
        r0 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x023f }
        if (r0 >= 0) goto L_0x019e;
    L_0x0169:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x023f }
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x023f }
        r7.<init>();	 Catch:{ IllegalArgumentException -> 0x023f }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x023f }
        r10 = 18;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x023f }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x023f }
        r9 = r13.mAdded;	 Catch:{ IllegalArgumentException -> 0x023f }
        r9 = r9.get(r4);	 Catch:{ IllegalArgumentException -> 0x023f }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x023f }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x023f }
        r10 = 15;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x023f }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x023f }
        r9 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x023f }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x023f }
        r7 = r7.toString();	 Catch:{ IllegalArgumentException -> 0x023f }
        r0.<init>(r7);	 Catch:{ IllegalArgumentException -> 0x023f }
        r13.throwException(r0);	 Catch:{ IllegalArgumentException -> 0x023f }
    L_0x019e:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0241 }
        if (r0 == 0) goto L_0x01d4;
    L_0x01a2:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0241 }
        r7 = 0;
        r0 = r0[r7];	 Catch:{ IllegalArgumentException -> 0x0241 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0241 }
        r7.<init>();	 Catch:{ IllegalArgumentException -> 0x0241 }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x0241 }
        r10 = 3;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x0241 }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x0241 }
        r7 = r7.append(r4);	 Catch:{ IllegalArgumentException -> 0x0241 }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x0241 }
        r10 = 16;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x0241 }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x0241 }
        r9 = r13.mAdded;	 Catch:{ IllegalArgumentException -> 0x0241 }
        r9 = r9.get(r4);	 Catch:{ IllegalArgumentException -> 0x0241 }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x0241 }
        r7 = r7.toString();	 Catch:{ IllegalArgumentException -> 0x0241 }
        android.util.Log.v(r0, r7);	 Catch:{ IllegalArgumentException -> 0x0241 }
    L_0x01d4:
        r0 = r4 + 1;
        if (r6 == 0) goto L_0x0247;
    L_0x01d8:
        r0 = r13.mBackStack;
        if (r0 == 0) goto L_0x0231;
    L_0x01dc:
        r0 = r13.mBackStack;
        r4 = r0.size();
        if (r4 <= 0) goto L_0x0231;
    L_0x01e4:
        r2 = new android.support.v4.app.BackStackState[r4];
    L_0x01e6:
        if (r3 >= r4) goto L_0x0231;
    L_0x01e8:
        r5 = new android.support.v4.app.BackStackState;	 Catch:{ IllegalArgumentException -> 0x0243 }
        r0 = r13.mBackStack;	 Catch:{ IllegalArgumentException -> 0x0243 }
        r0 = r0.get(r3);	 Catch:{ IllegalArgumentException -> 0x0243 }
        r0 = (android.support.v4.app.BackStackRecord) r0;	 Catch:{ IllegalArgumentException -> 0x0243 }
        r5.<init>(r0);	 Catch:{ IllegalArgumentException -> 0x0243 }
        r2[r3] = r5;	 Catch:{ IllegalArgumentException -> 0x0243 }
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0243 }
        if (r0 == 0) goto L_0x022d;
    L_0x01fb:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0243 }
        r5 = 1;
        r0 = r0[r5];	 Catch:{ IllegalArgumentException -> 0x0243 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0243 }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x0243 }
        r7 = z;	 Catch:{ IllegalArgumentException -> 0x0243 }
        r9 = 4;
        r7 = r7[r9];	 Catch:{ IllegalArgumentException -> 0x0243 }
        r5 = r5.append(r7);	 Catch:{ IllegalArgumentException -> 0x0243 }
        r5 = r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x0243 }
        r7 = z;	 Catch:{ IllegalArgumentException -> 0x0243 }
        r9 = 11;
        r7 = r7[r9];	 Catch:{ IllegalArgumentException -> 0x0243 }
        r5 = r5.append(r7);	 Catch:{ IllegalArgumentException -> 0x0243 }
        r7 = r13.mBackStack;	 Catch:{ IllegalArgumentException -> 0x0243 }
        r7 = r7.get(r3);	 Catch:{ IllegalArgumentException -> 0x0243 }
        r5 = r5.append(r7);	 Catch:{ IllegalArgumentException -> 0x0243 }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0243 }
        android.util.Log.v(r0, r5);	 Catch:{ IllegalArgumentException -> 0x0243 }
    L_0x022d:
        r0 = r3 + 1;
        if (r6 == 0) goto L_0x0245;
    L_0x0231:
        r0 = new android.support.v4.app.FragmentManagerState;
        r0.<init>();
        r0.mActive = r8;
        r0.mAdded = r1;
        r0.mBackStack = r2;
        r2 = r0;
        goto L_0x001b;
    L_0x023f:
        r0 = move-exception;
        throw r0;
    L_0x0241:
        r0 = move-exception;
        throw r0;
    L_0x0243:
        r0 = move-exception;
        throw r0;
    L_0x0245:
        r3 = r0;
        goto L_0x01e6;
    L_0x0247:
        r4 = r0;
        goto L_0x0157;
    L_0x024a:
        r1 = r2;
        goto L_0x01d8;
    L_0x024c:
        r5 = r1;
        r1 = r0;
        goto L_0x002c;
    L_0x0250:
        r0 = r4;
        goto L_0x0119;
    L_0x0253:
        r0 = r1;
        goto L_0x0119;
    L_0x0256:
        r0 = r1;
        goto L_0x011d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.saveAllState():android.os.Parcelable");
    }

    public Fragment getFragment(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        try {
            if (i >= this.mActive.size()) {
                throwException(new IllegalStateException(z[26] + str + z[29] + i));
            }
            Fragment fragment = (Fragment) this.mActive.get(i);
            if (fragment != null) {
                return fragment;
            }
            try {
                throwException(new IllegalStateException(z[27] + str + z[28] + i));
                return fragment;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void dispatchPause() {
        moveToState(4, false);
    }

    public void popBackStack(int i, int i2) {
        if (i < 0) {
            try {
                throw new IllegalArgumentException(z[189] + i);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        enqueueAction(new 4(this, i, i2), false);
    }

    FragmentManagerImpl() {
        this.mCurState = 0;
        this.mStateBundle = null;
        this.mStateArray = null;
        this.mExecCommit = new 1(this);
    }

    static Animation makeOpenCloseAnimation(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(DECELERATE_QUINT);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(DECELERATE_CUBIC);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    public boolean executePendingTransactions() {
        return execPendingActions();
    }

    public void removeFragment(Fragment fragment, int i, int i2) {
        try {
            if (DEBUG) {
                Log.v(z[186], z[187] + fragment + z[188] + fragment.mBackStackNesting);
            }
            try {
                boolean z = !fragment.isInBackStack();
                try {
                    if (!fragment.mDetached || z) {
                        try {
                            if (this.mAdded != null) {
                                this.mAdded.remove(fragment);
                            }
                            try {
                                if (fragment.mHasMenu) {
                                    if (fragment.mMenuVisible) {
                                        this.mNeedMenuInvalidate = true;
                                    }
                                }
                                try {
                                    int i3;
                                    fragment.mAdded = false;
                                    fragment.mRemoving = true;
                                    if (z) {
                                        i3 = 0;
                                    } else {
                                        i3 = 1;
                                    }
                                    moveToState(fragment, i3, i, i2, false);
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                    }
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
    }

    public List getFragments() {
        return this.mActive;
    }

    void makeInactive(Fragment fragment) {
        try {
            if (fragment.mIndex >= 0) {
                try {
                    if (DEBUG) {
                        Log.v(z[41], z[42] + fragment);
                    }
                    try {
                        this.mActive.set(fragment.mIndex, null);
                        if (this.mAvailIndices == null) {
                            this.mAvailIndices = new ArrayList();
                        }
                        this.mAvailIndices.add(Integer.valueOf(fragment.mIndex));
                        this.mHost.inactivateFragment(fragment.mWho);
                        fragment.initState();
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void saveFragmentViewState(android.support.v4.app.Fragment r3) {
        /*
        r2 = this;
        r0 = r3.mInnerView;	 Catch:{ IllegalArgumentException -> 0x0005 }
        if (r0 != 0) goto L_0x0007;
    L_0x0004:
        return;
    L_0x0005:
        r0 = move-exception;
        throw r0;
    L_0x0007:
        r0 = r2.mStateArray;	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r0 != 0) goto L_0x0016;
    L_0x000b:
        r0 = new android.util.SparseArray;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0036 }
        r2.mStateArray = r0;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r2.mStateArray;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0.clear();	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x001b:
        r0 = r3.mInnerView;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1 = r2.mStateArray;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0.saveHierarchyState(r1);	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = r2.mStateArray;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r0 <= 0) goto L_0x0004;
    L_0x002a:
        r0 = r2.mStateArray;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r3.mSavedViewState = r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = 0;
        r2.mStateArray = r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
        goto L_0x0004;
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.saveFragmentViewState(android.support.v4.app.Fragment):void");
    }

    private void setHWLayerAnimListenerIfAlpha(View view, Animation animation) {
        if (view != null && animation != null && shouldRunOnHWLayer(view, animation)) {
            AnimationListener animationListener;
            try {
                if (sAnimationListenerField == null) {
                    sAnimationListenerField = Animation.class.getDeclaredField(z[32]);
                    sAnimationListenerField.setAccessible(true);
                }
                animationListener = (AnimationListener) sAnimationListenerField.get(animation);
            } catch (NoSuchFieldException e) {
                throw e;
            } catch (Throwable e2) {
                Log.e(z[34], z[31], e2);
                animationListener = null;
            } catch (Throwable e22) {
                Log.e(z[30], z[33], e22);
                animationListener = null;
            }
            animation.setAnimationListener(new AnimateOnHWLayerIfNeededListener(view, animation, animationListener));
        }
    }
}
