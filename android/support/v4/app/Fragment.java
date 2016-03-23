package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SimpleArrayMap;
import android.support.v4.view.LayoutInflaterCompat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener {
    static final Object USE_DEFAULT_TRANSITION;
    public static boolean a;
    private static final SimpleArrayMap sClassMap;
    private static final String[] z;
    boolean mAdded;
    Boolean mAllowEnterTransitionOverlap;
    Boolean mAllowReturnTransitionOverlap;
    View mAnimatingAway;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    boolean mCheckedForLoaderManager;
    FragmentManagerImpl mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    Object mEnterTransition;
    SharedElementCallback mEnterTransitionCallback;
    Object mExitTransition;
    SharedElementCallback mExitTransitionCallback;
    int mFragmentId;
    FragmentManagerImpl mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    FragmentHostCallback mHost;
    boolean mInLayout;
    int mIndex;
    View mInnerView;
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mMenuVisible;
    int mNextAnim;
    Fragment mParentFragment;
    Object mReenterTransition;
    boolean mRemoving;
    boolean mRestored;
    boolean mResumed;
    boolean mRetainInstance;
    boolean mRetaining;
    Object mReturnTransition;
    Bundle mSavedFragmentState;
    SparseArray mSavedViewState;
    Object mSharedElementEnterTransition;
    Object mSharedElementReturnTransition;
    int mState;
    int mStateAfterAnimating;
    String mTag;
    Fragment mTarget;
    int mTargetIndex;
    int mTargetRequestCode;
    boolean mUserVisibleHint;
    View mView;
    String mWho;

    class 1 extends FragmentContainer {
        private static final String z;
        final Fragment this$0;

        static {
            char[] toCharArray = "?`b\\5\u001c|w\u001b<\u0016wp\u001b6\u0016f#S9\u000fw#Zx\u000f{fL".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 121;
                        break;
                    case at.g /*1*/:
                        i2 = 18;
                        break;
                    case at.i /*2*/:
                        i2 = 3;
                        break;
                    case at.o /*3*/:
                        i2 = 59;
                        break;
                    default:
                        i2 = 88;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        1(Fragment fragment) {
            this.this$0 = fragment;
        }

        @Nullable
        public View onFindViewById(int i) {
            try {
                if (this.this$0.mView != null) {
                    return this.this$0.mView.findViewById(i);
                }
                throw new IllegalStateException(z);
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public boolean onHasView() {
            try {
                return this.this$0.mView != null;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    public class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exception) {
            super(str, exception);
        }
    }

    public class SavedState implements Parcelable {
        public static final Creator CREATOR;
        final Bundle mState;

        final class 1 implements Creator {
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public Object m35createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public Object[] m36newArray(int i) {
                return newArray(i);
            }

            1() {
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.mState);
        }

        SavedState(Bundle bundle) {
            this.mState = bundle;
        }

        public int describeContents() {
            return 0;
        }

        static {
            CREATOR = new 1();
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.mState = parcel.readBundle();
            if (classLoader != null && this.mState != null) {
                this.mState.setClassLoader(classLoader);
            }
        }
    }

    final void setIndex(int i, Fragment fragment) {
        try {
            this.mIndex = i;
            if (fragment != null) {
                this.mWho = fragment.mWho + ":" + this.mIndex;
                if (!a) {
                    return;
                }
            }
            this.mWho = z[8] + this.mIndex;
        } catch (InstantiationException e) {
            throw e;
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public final boolean isAdded() {
        try {
            if (this.mHost != null) {
                if (this.mAdded) {
                    return true;
                }
            }
            return false;
        } catch (InstantiationException e) {
            throw e;
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public Object getReenterTransition() {
        try {
            return this.mReenterTransition == USE_DEFAULT_TRANSITION ? getExitTransition() : this.mReenterTransition;
        } catch (InstantiationException e) {
            throw e;
        }
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        try {
            if (this.mHidden) {
                return false;
            }
            if (this.mHasMenu && this.mMenuVisible) {
                z = true;
                onPrepareOptionsMenu(menu);
            }
            return this.mChildFragmentManager != null ? z | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu) : z;
        } catch (InstantiationException e) {
            throw e;
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    void performStop() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchStop();
            }
            try {
                this.mCalled = false;
                onStop();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(z[2] + this + z[3]);
                }
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    void performDestroyView() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchDestroyView();
            }
            try {
                this.mCalled = false;
                onDestroyView();
                if (this.mCalled) {
                    try {
                        if (this.mLoaderManager != null) {
                            this.mLoaderManager.doReportNextStart();
                            return;
                        }
                        return;
                    } catch (InstantiationException e) {
                        throw e;
                    }
                }
                throw new SuperNotCalledException(z[5] + this + z[4]);
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    public boolean getAllowReturnTransitionOverlap() {
        try {
            return this.mAllowReturnTransitionOverlap == null ? true : this.mAllowReturnTransitionOverlap.booleanValue();
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public void onDestroyOptionsMenu() {
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        try {
            if (this.mHidden) {
                return false;
            }
            if (this.mHasMenu && this.mMenuVisible) {
                z = true;
                onCreateOptionsMenu(menu, menuInflater);
            }
            return this.mChildFragmentManager != null ? z | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater) : z;
        } catch (InstantiationException e) {
            throw e;
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        try {
            onConfigurationChanged(configuration);
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchConfigurationChanged(configuration);
            }
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    static {
        String[] strArr = new String[79];
        String str = "L\u001bPev\u0002\u0010M!5\r\u0013U!\"\u0004\rVt1\u0004_Mnv\u001f\nId$B\u0010WW?\t\bju7\u0018\u001akd%\u0018\u0010Kd2DV";
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
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 127;
                        break;
                    case at.i /*2*/:
                        i3 = 57;
                        break;
                    case at.o /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "*\rXf;\t\u0011M!";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "L\u001bPev\u0002\u0010M!5\r\u0013U!\"\u0004\rVt1\u0004_Mnv\u001f\nId$B\u0010WR\"\u0003\u000f\u0011(";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "L\u001bPev\u0002\u0010M!5\r\u0013U!\"\u0004\rVt1\u0004_Mnv\u001f\nId$B\u0010WE3\u001f\u000bKn/:\u0016\\v~E";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "*\rXf;\t\u0011M!";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "*\rXf;\t\u0011M!";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "L\u0011Vuv\r\u000bM`5\u0004\u001a]!\"\u0003_xb\"\u0005\tPu/";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\r\u0011]s9\u0005\u001b\u0003g$\r\u0018Td8\u0018E";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "*\rXf;\t\u0011M!";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "L\u001bPev\u0002\u0010M!5\r\u0013U!\"\u0004\rVt1\u0004_Mnv\u001f\nId$B\u0010WQ7\u0019\f\\)\u007f";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "L\u001bPev\u0002\u0010M!5\r\u0013U!\"\u0004\rVt1\u0004_Mnv\u001f\nId$B\u0010W@5\u0018\u0016Oh\"\u0015<Kd7\u0018\u001a])\u007f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "*\rXf;\t\u0011M!";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0001>Kf#\u0001\u001aWu%Q";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0001/Xs3\u0002\u000b\u007fs7\u000b\u0012\\o\"Q";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "L\u0012kd\"\r\u0016Wh8\u000bB";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "/\u0017Pm2L";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "L_";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0001>Wh;\r\u000bPo1-\bXxk";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "L\u0012m`1Q";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "L\u0012lr3\u001e)Pr?\u000e\u0013\\I?\u0002\u000b\u0004";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u00019K`1\u0001\u001aWu\u001b\r\u0011Xf3\u001eB";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "L\u0012po2\t\u0007\u0004";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "L\u0012zn8\u0018\u001ePo3\u001e6]<u";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "L\u0012td8\u0019)Pr?\u000e\u0013\\<";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "L\u0012\u007fs9\u00013Xx9\u0019\u000b\u0004";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "L\u0012kd%\u0019\u0012\\ek";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "L\u0012}d\"\r\u001cQd2Q";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "L\u0012m`$\u000b\u001aMS3\u001d\n\\r\"/\u0010]dk";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0001+Xs1\t\u000b\u0004";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0001,Xw3\b)Pd!?\u000bXu3Q";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u00019K`1\u0001\u001aWu\u001f\bB\u001a";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u00017Pe2\t\u0011\u0004";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u00011\\y\"-\u0011Plk";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u00017Vr\"Q";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0001,M`\"\t>_u3\u001e>Wh;\r\u000bPo1Q";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0001<Vo\"\r\u0016Wd$Q";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0001>]e3\bB";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0001-\\u7\u0005\u0011po%\u0018\u001eWb3Q";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0001,M`\"\tB";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "L\u0012q`%!\u001aWtk";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0001,Xw3\b9K`1\u0001\u001aWu\u0005\u0018\u001eMdk";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u00016Wo3\u001e)Pd!Q";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "L_";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0001)Pd!Q";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "L\u0012ni9Q";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "L\u0012{`5\u0007,M`5\u00071\\r\"\u0005\u0011^<";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "L\u0012kd;\u0003\tPo1Q";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "L\u0012po\u001a\r\u0006Vt\"Q";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = " \u0010Xe3\u001e_t`8\r\u0018\\sl";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "*\rXf;\t\u0011M!";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "L\u0011Vuv\r\u000bM`5\u0004\u001a]!\"\u0003_xb\"\u0005\tPu/";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "L\u001bPev\u0002\u0010M!5\r\u0013U!\"\u0004\rVt1\u0004_Mnv\u001f\nId$B\u0010WR\"\r\rM)\u007f";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "*\rXf;\t\u0011M!";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\r\u0011]s9\u0005\u001b\u0003r#\u001c\u000fVs\"V\u0019K`1\u0001\u001aWu%";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "L\u001bPev\u0002\u0010M!5\r\u0013U!\"\u0004\rVt1\u0004_Mnv\u001f\nId$B\u0010WB$\t\u001eMd~E";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "*\rXf;\t\u0011M!";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    str = "L\u0011Vuv\r\u000bM`5\u0004\u001a]!\"\u0003_xb\"\u0005\tPu/";
                    obj = 56;
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    strArr2 = strArr3;
                    str = "*\rXf;\t\u0011M!";
                    obj = 57;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "*\rXf;\t\u0011M!7\u0000\r\\`2\u0015_Xb\"\u0005\t\\";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "L\u0016]<f\u0014";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "L\\";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "L\u001bPev\u0002\u0010M!5\r\u0013U!\"\u0004\rVt1\u0004_Mnv\u001f\nId$B\u0010WS3\u001f\nTd~E";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "*\rXf;\t\u0011M!";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "L\u001aTq\"\u0015_Zn8\u001f\u000bKt5\u0018\u0010K!\"\u0004\u001eM!?\u001f_It4\u0000\u0016Z";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "9\u0011Xc:\t_Mnv\u0005\u0011Ju7\u0002\u000bP`\"\t__s7\u000b\u0012\\o\"L";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "9\u0011Xc:\t_Mnv\u0005\u0011Ju7\u0002\u000bP`\"\t__s7\u000b\u0012\\o\"L";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "V_T`=\t_Jt$\t_Zm7\u001f\f\u0019o7\u0001\u001a\u0019d.\u0005\fMrzL\u0016J!&\u0019\u001dUh5@_Xo2L\u0017Xrv\r\u0011";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "L\u001aTq\"\u0015_Zn8\u001f\u000bKt5\u0018\u0010K!\"\u0004\u001eM!?\u001f_It4\u0000\u0016Z";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "V_T`=\t_Jt$\t_Zm7\u001f\f\u0019o7\u0001\u001a\u0019d.\u0005\fMrzL\u0016J!&\u0019\u001dUh5@_Xo2L\u0017Xrv\r\u0011";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "L\u001aTq\"\u0015_Zn8\u001f\u000bKt5\u0018\u0010K!\"\u0004\u001eM!?\u001f_It4\u0000\u0016Z";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "V_T`=\t_Jt$\t_Zm7\u001f\f\u0019o7\u0001\u001a\u0019d.\u0005\fMrzL\u0016J!&\u0019\u001dUh5@_Xo2L\u0017Xrv\r\u0011";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "9\u0011Xc:\t_Mnv\u0005\u0011Ju7\u0002\u000bP`\"\t__s7\u000b\u0012\\o\"L";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "*\rXf;\t\u0011M!";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "L\u0011Vuv\r\u000bM`5\u0004\u001a]!\"\u0003_xb\"\u0005\tPu/";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "L\u001bPev\u0002\u0010M!5\r\u0013U!\"\u0004\rVt1\u0004_Mnv\u001f\nId$B\u0010WE3\u001f\u000bKn/DV";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "*\rXf;\t\u0011M!";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "\r\u0011]s9\u0005\u001b\u0003r#\u001c\u000fVs\"V\u0019K`1\u0001\u001aWu%";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "*\rXf;\t\u0011M!7\u0000\r\\`2\u0015_Xb\"\u0005\t\\";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sClassMap = new SimpleArrayMap();
                    USE_DEFAULT_TRANSITION = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    str = "*\rXf;\t\u0011M!";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    void performResume() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
                this.mChildFragmentManager.execPendingActions();
            }
            try {
                this.mCalled = false;
                onResume();
                if (this.mCalled) {
                    try {
                        if (this.mChildFragmentManager != null) {
                            this.mChildFragmentManager.dispatchResume();
                            this.mChildFragmentManager.execPendingActions();
                            return;
                        }
                        return;
                    } catch (InstantiationException e) {
                        throw e;
                    }
                }
                throw new SuperNotCalledException(z[63] + this + z[62]);
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    void performCreate(Bundle bundle) {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
            }
            try {
                this.mCalled = false;
                onCreate(bundle);
                if (!this.mCalled) {
                    throw new SuperNotCalledException(z[56] + this + z[55]);
                } else if (bundle != null) {
                    Parcelable parcelable = bundle.getParcelable(z[54]);
                    if (parcelable != null) {
                        try {
                            if (this.mChildFragmentManager == null) {
                                instantiateChildFragmentManager();
                            }
                            this.mChildFragmentManager.restoreAllState(parcelable, null);
                            this.mChildFragmentManager.dispatchCreate();
                        } catch (InstantiationException e) {
                            throw e;
                        }
                    }
                }
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    void performActivityCreated(Bundle bundle) {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
            }
            try {
                this.mCalled = false;
                onActivityCreated(bundle);
                if (this.mCalled) {
                    try {
                        if (this.mChildFragmentManager != null) {
                            this.mChildFragmentManager.dispatchActivityCreated();
                            return;
                        }
                        return;
                    } catch (InstantiationException e) {
                        throw e;
                    }
                }
                throw new SuperNotCalledException(z[12] + this + z[11]);
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    void performLowMemory() {
        try {
            onLowMemory();
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchLowMemory();
            }
        } catch (InstantiationException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.v4.app.FragmentManager getChildFragmentManager() {
        /*
        r3 = this;
        r0 = a;
        r1 = r3.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x003a }
        if (r1 != 0) goto L_0x0037;
    L_0x0006:
        r3.instantiateChildFragmentManager();	 Catch:{ InstantiationException -> 0x003c }
        r1 = r3.mState;	 Catch:{ InstantiationException -> 0x003c }
        r2 = 5;
        if (r1 < r2) goto L_0x0015;
    L_0x000e:
        r1 = r3.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x003e }
        r1.dispatchResume();	 Catch:{ InstantiationException -> 0x003e }
        if (r0 == 0) goto L_0x0037;
    L_0x0015:
        r1 = r3.mState;	 Catch:{ InstantiationException -> 0x0040 }
        r2 = 4;
        if (r1 < r2) goto L_0x0021;
    L_0x001a:
        r1 = r3.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x0042 }
        r1.dispatchStart();	 Catch:{ InstantiationException -> 0x0042 }
        if (r0 == 0) goto L_0x0037;
    L_0x0021:
        r1 = r3.mState;	 Catch:{ InstantiationException -> 0x0044 }
        r2 = 2;
        if (r1 < r2) goto L_0x002d;
    L_0x0026:
        r1 = r3.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x0046 }
        r1.dispatchActivityCreated();	 Catch:{ InstantiationException -> 0x0046 }
        if (r0 == 0) goto L_0x0037;
    L_0x002d:
        r0 = r3.mState;	 Catch:{ InstantiationException -> 0x0048 }
        r1 = 1;
        if (r0 < r1) goto L_0x0037;
    L_0x0032:
        r0 = r3.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x0048 }
        r0.dispatchCreate();	 Catch:{ InstantiationException -> 0x0048 }
    L_0x0037:
        r0 = r3.mChildFragmentManager;
        return r0;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.getChildFragmentManager():android.support.v4.app.FragmentManager");
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void setArguments(Bundle bundle) {
        try {
            if (this.mIndex >= 0) {
                throw new IllegalStateException(z[78]);
            }
            this.mArguments = bundle;
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public Object getEnterTransition() {
        return this.mEnterTransition;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = this.mHost.onGetLayoutInflater();
        getChildFragmentManager();
        LayoutInflaterCompat.setFactory(onGetLayoutInflater, this.mChildFragmentManager.getLayoutInflaterFactory());
        return onGetLayoutInflater;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Object getReturnTransition() {
        try {
            return this.mReturnTransition == USE_DEFAULT_TRANSITION ? getEnterTransition() : this.mReturnTransition;
        } catch (InstantiationException e) {
            throw e;
        }
    }

    final void restoreViewState(Bundle bundle) {
        try {
            if (this.mSavedViewState != null) {
                this.mInnerView.restoreHierarchyState(this.mSavedViewState);
                this.mSavedViewState = null;
            }
            try {
                this.mCalled = false;
                onViewStateRestored(bundle);
                if (!this.mCalled) {
                    throw new SuperNotCalledException(z[1] + this + z[0]);
                }
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    void performStart() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
                this.mChildFragmentManager.execPendingActions();
            }
            try {
                this.mCalled = false;
                onStart();
                if (this.mCalled) {
                    try {
                        if (this.mChildFragmentManager != null) {
                            this.mChildFragmentManager.dispatchStart();
                        }
                        try {
                            if (this.mLoaderManager != null) {
                                this.mLoaderManager.doReportStart();
                                return;
                            }
                            return;
                        } catch (InstantiationException e) {
                            throw e;
                        }
                    } catch (InstantiationException e2) {
                        throw e2;
                    }
                }
                throw new SuperNotCalledException(z[53] + this + z[52]);
            } catch (InstantiationException e22) {
                throw e22;
            }
        } catch (InstantiationException e222) {
            throw e222;
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        try {
            if (!this.mHidden) {
                if (this.mHasMenu) {
                    try {
                        if (this.mMenuVisible) {
                            try {
                                if (onOptionsItemSelected(menuItem)) {
                                    return true;
                                }
                            } catch (InstantiationException e) {
                                throw e;
                            }
                        }
                    } catch (InstantiationException e2) {
                        throw e2;
                    }
                }
                try {
                    if (this.mChildFragmentManager != null) {
                        if (this.mChildFragmentManager.dispatchOptionsItemSelected(menuItem)) {
                            return true;
                        }
                    }
                } catch (InstantiationException e22) {
                    throw e22;
                } catch (InstantiationException e222) {
                    throw e222;
                }
            }
            return false;
        } catch (InstantiationException e2222) {
            throw e2222;
        } catch (InstantiationException e22222) {
            throw e22222;
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
    }

    public Context getContext() {
        try {
            return this.mHost == null ? null : this.mHost.getContext();
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public final boolean isVisible() {
        try {
            if (isAdded()) {
                if (!isHidden()) {
                    try {
                        if (this.mView != null) {
                            try {
                                if (this.mView.getWindowToken() != null) {
                                    try {
                                        if (this.mView.getVisibility() == 0) {
                                            return true;
                                        }
                                    } catch (InstantiationException e) {
                                        throw e;
                                    }
                                }
                            } catch (InstantiationException e2) {
                                throw e2;
                            }
                        }
                    } catch (InstantiationException e22) {
                        throw e22;
                    }
                }
            }
            return false;
        } catch (InstantiationException e222) {
            throw e222;
        } catch (InstantiationException e2222) {
            throw e2222;
        }
    }

    public final boolean isResumed() {
        return this.mResumed;
    }

    void performReallyStop() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchReallyStop();
            }
            try {
                if (this.mLoadersStarted) {
                    this.mLoadersStarted = false;
                    if (!this.mCheckedForLoaderManager) {
                        this.mCheckedForLoaderManager = true;
                        this.mLoaderManager = this.mHost.getLoaderManager(this.mWho, this.mLoadersStarted, false);
                    }
                    try {
                        if (this.mLoaderManager != null) {
                            if (this.mHost.getRetainLoaders()) {
                                try {
                                    this.mLoaderManager.doRetain();
                                    if (!a) {
                                        return;
                                    }
                                } catch (InstantiationException e) {
                                    throw e;
                                }
                            }
                            this.mLoaderManager.doStop();
                        }
                    } catch (InstantiationException e2) {
                        throw e2;
                    } catch (InstantiationException e22) {
                        throw e22;
                    }
                }
            } catch (InstantiationException e222) {
                throw e222;
            } catch (InstantiationException e2222) {
                throw e2222;
            }
        } catch (InstantiationException e22222) {
            throw e22222;
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mResumed = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
        this.mLoaderManager = null;
        this.mLoadersStarted = false;
        this.mCheckedForLoaderManager = false;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z = a;
        try {
            printWriter.print(str);
            printWriter.print(z[31]);
            printWriter.print(Integer.toHexString(this.mFragmentId));
            printWriter.print(z[23]);
            printWriter.print(Integer.toHexString(this.mContainerId));
            printWriter.print(z[19]);
            printWriter.println(this.mTag);
            printWriter.print(str);
            printWriter.print(z[39]);
            printWriter.print(this.mState);
            printWriter.print(z[22]);
            printWriter.print(this.mIndex);
            printWriter.print(z[45]);
            printWriter.print(this.mWho);
            printWriter.print(z[46]);
            printWriter.println(this.mBackStackNesting);
            printWriter.print(str);
            printWriter.print(z[37]);
            printWriter.print(this.mAdded);
            printWriter.print(z[47]);
            printWriter.print(this.mRemoving);
            printWriter.print(z[26]);
            printWriter.print(this.mResumed);
            printWriter.print(z[25]);
            printWriter.print(this.mFromLayout);
            printWriter.print(z[48]);
            printWriter.println(this.mInLayout);
            printWriter.print(str);
            printWriter.print(z[32]);
            printWriter.print(this.mHidden);
            printWriter.print(z[27]);
            printWriter.print(this.mDetached);
            printWriter.print(z[24]);
            printWriter.print(this.mMenuVisible);
            printWriter.print(z[40]);
            printWriter.println(this.mHasMenu);
            printWriter.print(str);
            printWriter.print(z[38]);
            printWriter.print(this.mRetainInstance);
            printWriter.print(z[15]);
            printWriter.print(this.mRetaining);
            printWriter.print(z[20]);
            printWriter.println(this.mUserVisibleHint);
            if (this.mFragmentManager != null) {
                printWriter.print(str);
                printWriter.print(z[21]);
                printWriter.println(this.mFragmentManager);
            }
            try {
                if (this.mHost != null) {
                    printWriter.print(str);
                    printWriter.print(z[34]);
                    printWriter.println(this.mHost);
                }
                try {
                    if (this.mParentFragment != null) {
                        printWriter.print(str);
                        printWriter.print(z[14]);
                        printWriter.println(this.mParentFragment);
                    }
                    try {
                        if (this.mArguments != null) {
                            printWriter.print(str);
                            printWriter.print(z[13]);
                            printWriter.println(this.mArguments);
                        }
                        try {
                            if (this.mSavedFragmentState != null) {
                                printWriter.print(str);
                                printWriter.print(z[41]);
                                printWriter.println(this.mSavedFragmentState);
                            }
                            try {
                                if (this.mSavedViewState != null) {
                                    printWriter.print(str);
                                    printWriter.print(z[30]);
                                    printWriter.println(this.mSavedViewState);
                                }
                                try {
                                    if (this.mTarget != null) {
                                        printWriter.print(str);
                                        printWriter.print(z[29]);
                                        printWriter.print(this.mTarget);
                                        printWriter.print(z[28]);
                                        printWriter.println(this.mTargetRequestCode);
                                    }
                                    try {
                                        if (this.mNextAnim != 0) {
                                            printWriter.print(str);
                                            printWriter.print(z[33]);
                                            printWriter.println(this.mNextAnim);
                                        }
                                        try {
                                            if (this.mContainer != null) {
                                                printWriter.print(str);
                                                printWriter.print(z[36]);
                                                printWriter.println(this.mContainer);
                                            }
                                            try {
                                                if (this.mView != null) {
                                                    printWriter.print(str);
                                                    printWriter.print(z[44]);
                                                    printWriter.println(this.mView);
                                                }
                                                try {
                                                    if (this.mInnerView != null) {
                                                        printWriter.print(str);
                                                        printWriter.print(z[42]);
                                                        printWriter.println(this.mView);
                                                    }
                                                    try {
                                                        if (this.mAnimatingAway != null) {
                                                            printWriter.print(str);
                                                            printWriter.print(z[18]);
                                                            printWriter.println(this.mAnimatingAway);
                                                            printWriter.print(str);
                                                            printWriter.print(z[35]);
                                                            printWriter.println(this.mStateAfterAnimating);
                                                        }
                                                        try {
                                                            if (this.mLoaderManager != null) {
                                                                printWriter.print(str);
                                                                printWriter.println(z[49]);
                                                                this.mLoaderManager.dump(str + z[43], fileDescriptor, printWriter, strArr);
                                                            }
                                                            try {
                                                                if (this.mChildFragmentManager != null) {
                                                                    printWriter.print(str);
                                                                    printWriter.println(z[16] + this.mChildFragmentManager + ":");
                                                                    this.mChildFragmentManager.dump(str + z[17], fileDescriptor, printWriter, strArr);
                                                                }
                                                                if (z) {
                                                                    FragmentActivity.a++;
                                                                }
                                                            } catch (InstantiationException e) {
                                                                throw e;
                                                            }
                                                        } catch (InstantiationException e2) {
                                                            throw e2;
                                                        }
                                                    } catch (InstantiationException e22) {
                                                        throw e22;
                                                    }
                                                } catch (InstantiationException e222) {
                                                    throw e222;
                                                }
                                            } catch (InstantiationException e2222) {
                                                throw e2222;
                                            }
                                        } catch (InstantiationException e22222) {
                                            throw e22222;
                                        }
                                    } catch (InstantiationException e222222) {
                                        throw e222222;
                                    }
                                } catch (InstantiationException e2222222) {
                                    throw e2222222;
                                }
                            } catch (InstantiationException e22222222) {
                                throw e22222222;
                            }
                        } catch (InstantiationException e222222222) {
                            throw e222222222;
                        }
                    } catch (InstantiationException e2222222222) {
                        throw e2222222222;
                    }
                } catch (InstantiationException e22222222222) {
                    throw e22222222222;
                }
            } catch (InstantiationException e222222222222) {
                throw e222222222222;
            }
        } catch (InstantiationException e2222222222222) {
            throw e2222222222222;
        }
    }

    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public void setUserVisibleHint(boolean z) {
        try {
            if (!this.mUserVisibleHint && z) {
                try {
                    if (this.mState < 4) {
                        this.mFragmentManager.performPendingDeferredStart(this);
                    }
                } catch (InstantiationException e) {
                    throw e;
                }
            }
            try {
                boolean z2;
                this.mUserVisibleHint = z;
                if (z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.mDeferStart = z2;
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        } catch (InstantiationException e222) {
            throw e222;
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        try {
            if (this.mIndex >= 0) {
                throw new IllegalStateException(z[59]);
            }
            Bundle bundle;
            if (savedState != null) {
                try {
                    if (savedState.mState != null) {
                        bundle = savedState.mState;
                        this.mSavedFragmentState = bundle;
                    }
                } catch (InstantiationException e) {
                    throw e;
                }
            }
            bundle = null;
            this.mSavedFragmentState = bundle;
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    void performDestroy() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchDestroy();
            }
            try {
                this.mCalled = false;
                onDestroy();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(z[76] + this + z[75]);
                }
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    View performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
            }
            return onCreateView(layoutInflater, viewGroup, bundle);
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public final Resources getResources() {
        try {
            if (this.mHost != null) {
                return this.mHost.getContext().getResources();
            }
            throw new IllegalStateException(z[58] + this + z[57]);
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public static Fragment instantiate(Context context, String str, @Nullable Bundle bundle) {
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mArguments = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw e;
        } catch (Exception e2) {
            throw new InstantiationException(z[72] + str + z[69] + z[68], e2);
        } catch (Exception e22) {
            throw new InstantiationException(z[66] + str + z[67] + z[64], e22);
        } catch (Exception e222) {
            throw new InstantiationException(z[65] + str + z[71] + z[70], e222);
        }
    }

    public final FragmentActivity getActivity() {
        try {
            return this.mHost == null ? null : (FragmentActivity) this.mHost.getActivity();
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void onStart() {
        try {
            this.mCalled = true;
            if (!this.mLoadersStarted) {
                this.mLoadersStarted = true;
                if (!this.mCheckedForLoaderManager) {
                    this.mCheckedForLoaderManager = true;
                    this.mLoaderManager = this.mHost.getLoaderManager(this.mWho, this.mLoadersStarted, false);
                }
                try {
                    if (this.mLoaderManager != null) {
                        this.mLoaderManager.doStart();
                    }
                } catch (InstantiationException e) {
                    throw e;
                }
            }
        } catch (InstantiationException e2) {
            throw e2;
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public final String getString(@StringRes int i) {
        return getResources().getString(i);
    }

    void performOptionsMenuClosed(Menu menu) {
        try {
            if (!this.mHidden) {
                if (this.mHasMenu) {
                    try {
                        if (this.mMenuVisible) {
                            onOptionsMenuClosed(menu);
                        }
                    } catch (InstantiationException e) {
                        throw e;
                    }
                }
                try {
                    if (this.mChildFragmentManager != null) {
                        this.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
                    }
                } catch (InstantiationException e2) {
                    throw e2;
                }
            }
        } catch (InstantiationException e22) {
            throw e22;
        } catch (InstantiationException e222) {
            throw e222;
        }
    }

    public boolean getAllowEnterTransitionOverlap() {
        try {
            return this.mAllowEnterTransitionOverlap == null ? true : this.mAllowEnterTransitionOverlap.booleanValue();
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public final String getString(@StringRes int i, Object[] objArr) {
        return getResources().getString(i, objArr);
    }

    void instantiateChildFragmentManager() {
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mChildFragmentManager.attachController(this.mHost, new 1(this), this);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        if (this.mChildFragmentManager != null) {
            Parcelable saveAllState = this.mChildFragmentManager.saveAllState();
            if (saveAllState != null) {
                try {
                    bundle.putParcelable(z[77], saveAllState);
                } catch (InstantiationException e) {
                    throw e;
                }
            }
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    final boolean isInBackStack() {
        try {
            return this.mBackStackNesting > 0;
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public LoaderManager getLoaderManager() {
        try {
            if (this.mLoaderManager != null) {
                return this.mLoaderManager;
            }
            try {
                if (this.mHost == null) {
                    throw new IllegalStateException(z[50] + this + z[51]);
                }
                this.mCheckedForLoaderManager = true;
                this.mLoaderManager = this.mHost.getLoaderManager(this.mWho, this.mLoadersStarted, true);
                return this.mLoaderManager;
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        try {
            if (!this.mHidden) {
                if (onContextItemSelected(menuItem)) {
                    return true;
                }
                try {
                    if (this.mChildFragmentManager != null) {
                        if (this.mChildFragmentManager.dispatchContextItemSelected(menuItem)) {
                            return true;
                        }
                    }
                } catch (InstantiationException e) {
                    throw e;
                } catch (InstantiationException e2) {
                    throw e2;
                }
            }
            return false;
        } catch (InstantiationException e22) {
            throw e22;
        } catch (InstantiationException e222) {
            throw e222;
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public Fragment() {
        this.mState = 0;
        this.mIndex = -1;
        this.mTargetIndex = -1;
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mEnterTransition = null;
        this.mReturnTransition = USE_DEFAULT_TRANSITION;
        this.mExitTransition = null;
        this.mReenterTransition = USE_DEFAULT_TRANSITION;
        this.mSharedElementEnterTransition = null;
        this.mSharedElementReturnTransition = USE_DEFAULT_TRANSITION;
        this.mEnterTransitionCallback = null;
        this.mExitTransitionCallback = null;
    }

    public Object getSharedElementEnterTransition() {
        return this.mSharedElementEnterTransition;
    }

    public void onAttach(Context context) {
        try {
            Activity activity;
            this.mCalled = true;
            if (this.mHost == null) {
                activity = null;
            } else {
                activity = this.mHost.getActivity();
            }
            if (activity != null) {
                try {
                    this.mCalled = false;
                    onAttach(activity);
                } catch (InstantiationException e) {
                    throw e;
                }
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public void onHiddenChanged(boolean z) {
    }

    public Object getExitTransition() {
        return this.mExitTransition;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        try {
            Activity activity;
            this.mCalled = true;
            if (this.mHost == null) {
                activity = null;
            } else {
                activity = this.mHost.getActivity();
            }
            if (activity != null) {
                try {
                    this.mCalled = false;
                    onInflate(activity, attributeSet, bundle);
                } catch (InstantiationException e) {
                    throw e;
                }
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        try {
            DebugUtils.buildShortClassTag(this, stringBuilder);
            if (this.mIndex >= 0) {
                stringBuilder.append(z[61]);
                stringBuilder.append(this.mIndex);
            }
            try {
                if (this.mFragmentId != 0) {
                    stringBuilder.append(z[60]);
                    stringBuilder.append(Integer.toHexString(this.mFragmentId));
                }
                try {
                    if (this.mTag != null) {
                        stringBuilder.append(" ");
                        stringBuilder.append(this.mTag);
                    }
                    stringBuilder.append('}');
                    return stringBuilder.toString();
                } catch (InstantiationException e) {
                    throw e;
                }
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    public Object getSharedElementReturnTransition() {
        try {
            return this.mSharedElementReturnTransition == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : this.mSharedElementReturnTransition;
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public void onDestroy() {
        try {
            this.mCalled = true;
            if (!this.mCheckedForLoaderManager) {
                this.mCheckedForLoaderManager = true;
                this.mLoaderManager = this.mHost.getLoaderManager(this.mWho, this.mLoadersStarted, false);
            }
            try {
                if (this.mLoaderManager != null) {
                    this.mLoaderManager.doDestroy();
                }
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    void performPause() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchPause();
            }
            try {
                this.mCalled = false;
                onPause();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(z[9] + this + z[10]);
                }
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    static boolean isSupportFragmentClass(Context context, String str) {
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public void startActivity(Intent intent) {
        try {
            if (this.mHost == null) {
                throw new IllegalStateException(z[73] + this + z[74]);
            }
            this.mHost.onStartActivityFromFragment(this, intent, -1);
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        try {
            if (this.mHost == null) {
                throw new IllegalStateException(z[6] + this + z[7]);
            }
            this.mHost.onStartActivityFromFragment(this, intent, i);
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public void setMenuVisibility(boolean z) {
        try {
            if (this.mMenuVisible != z) {
                this.mMenuVisible = z;
                if (this.mHasMenu) {
                    try {
                        if (isAdded()) {
                            try {
                                if (!isHidden()) {
                                    this.mHost.onSupportInvalidateOptionsMenu();
                                }
                            } catch (InstantiationException e) {
                                throw e;
                            }
                        }
                    } catch (InstantiationException e2) {
                        throw e2;
                    }
                }
            }
        } catch (InstantiationException e22) {
            throw e22;
        } catch (InstantiationException e222) {
            throw e222;
        }
    }

    public void setHasOptionsMenu(boolean z) {
        try {
            if (this.mHasMenu != z) {
                this.mHasMenu = z;
                if (isAdded()) {
                    try {
                        if (!isHidden()) {
                            this.mHost.onSupportInvalidateOptionsMenu();
                        }
                    } catch (InstantiationException e) {
                        throw e;
                    }
                }
            }
        } catch (InstantiationException e2) {
            throw e2;
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }
}
