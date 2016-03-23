package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.support.v4.content.Loader.OnLoadCanceledListener;
import android.support.v4.content.Loader.OnLoadCompleteListener;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

/* compiled from: LoaderManager */
class LoaderManagerImpl extends LoaderManager {
    static boolean DEBUG;
    private static final String[] z;
    boolean mCreatingLoader;
    private FragmentHostCallback mHost;
    final SparseArrayCompat mInactiveLoaders;
    final SparseArrayCompat mLoaders;
    boolean mRetaining;
    boolean mStarted;
    final String mWho;

    /* compiled from: LoaderManager */
    final class LoaderInfo implements OnLoadCompleteListener, OnLoadCanceledListener {
        private static final String[] z;
        final Bundle mArgs;
        LoaderCallbacks mCallbacks;
        Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId;
        boolean mListenerRegistered;
        Loader mLoader;
        LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;
        final LoaderManagerImpl this$0;

        static {
            String[] strArr = new String[56];
            String str = "3'?0K\r\u0005?:O\u0018-,";
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
                            i3 = 127;
                            break;
                        case at.g /*1*/:
                            i3 = 72;
                            break;
                        case at.i /*2*/:
                            i3 = 94;
                            break;
                        case at.o /*3*/:
                            i3 = 84;
                            break;
                        default:
                            i3 = 46;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u0012\u001a; O\u0016&7:IB";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "_%\u001f&I\fu";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "\u0012\u0001:i";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "_%\u0012=]\u000b-01\\--9=]\u000b-,1JB";
                        obj = 4;
                        strArr2 = strArr3;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "_%\f1Z\u001e!0=@\u0018\u001b*5\\\u000b-:i";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "/-00G\u0011/~\u0018A\u001e,;&\u000e";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "_h";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "_%\f1^\u0010:*\u001aK\u0007<\r O\r<c";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\u0012\u0000?\"K;)*5\u0013";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "_%\u001a1]\u000b:1-K\u001bu";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "\u0012\u000415J\u001a:c";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "\u0012\f? OB";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "\u0012\u001b*5\\\u000b-:i";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "_h";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "\u0012\u000b?8B\u001d)=?]B";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "_h3\u0010K\u0013!(1\\\u001a,\u001a5Z\u001eu";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "_r~";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "_k";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "\u00025";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseContentDescription /*19*/:
                        strArr2[i] = str;
                        i = 21;
                        str = "3'?0K\r\u000102A\u0004";
                        obj = 20;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationIcon /*20*/:
                        strArr2[i] = str;
                        i = 22;
                        str = "_h\r A\u000f87:IEh";
                        obj = 21;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationContentDescription /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 22;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_logoDescription /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleTextColor /*23*/:
                        strArr2[i] = str;
                        i = 25;
                        str = "_h\r#G\u000b+6=@\u0018h*;\u000e\u000f-00G\u0011/~8A\u001e,;&\u0014_";
                        obj = 24;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_subtitleTextColor /*24*/:
                        strArr2[i] = str;
                        i = 26;
                        str = "_h\u00173@\u0010:7:I_$15J_+?:M\u001a$;0\u000eRe~0K\f<,;W\u001a,";
                        obj = 25;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextAppearance /*25*/:
                        strArr2[i] = str;
                        i = 27;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 26;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextColor /*26*/:
                        strArr2[i] = str;
                        i = 28;
                        str = "\u0010&\u0012;O\u001b\u000b?:M\u001a$;0\u0014_";
                        obj = 27;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeStyle /*27*/:
                        strArr2[i] = str;
                        i = 29;
                        str = "_h\u00173@\u0010:7:I_$15J_+?:M\u001a$;0\u000eRe~:A\u000bh?7Z\u0016>;";
                        obj = 28;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCloseButtonStyle /*28*/:
                        strArr2[i] = str;
                        i = 30;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 29;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeBackground /*29*/:
                        strArr2[i] = str;
                        i = 31;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 30;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSplitBackground /*30*/:
                        strArr2[i] = str;
                        i = 32;
                        str = "\u0010&\u0012;O\u001b\u000b19^\u0013-*1\u0014_";
                        obj = 31;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCloseDrawable /*31*/:
                        strArr2[i] = str;
                        i = 33;
                        str = "_h\u00173@\u0010:7:I_$15J_+19^\u0013-*1\u000eRe~0K\f<,;W\u001a,";
                        obj = 32;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCutDrawable /*32*/:
                        strArr2[i] = str;
                        i = 34;
                        str = "_h\u00173@\u0010:7:I_$15J_+19^\u0013-*1\u000eRe~:A\u000bh?7Z\u0016>;";
                        obj = 33;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCopyDrawable /*33*/:
                        strArr2[i] = str;
                        i = 35;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 34;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePasteDrawable /*34*/:
                        strArr2[i] = str;
                        i = 36;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 35;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSelectAllDrawable /*35*/:
                        strArr2[i] = str;
                        i = 37;
                        str = "_h\r#G\u000b+6=@\u0018h*;\u000e\u000f-00G\u0011/~8A\u001e,;&\u0014_";
                        obj = 36;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeShareDrawable /*36*/:
                        strArr2[i] = str;
                        i = 38;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 37;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeFindDrawable /*37*/:
                        strArr2[i] = str;
                        i = 39;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 38;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeWebSearchDrawable /*38*/:
                        strArr2[i] = str;
                        i = 40;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 39;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePopupWindowStyle /*39*/:
                        strArr2[i] = str;
                        i = 41;
                        str = "_h1:b\u0010):\u0012G\u0011!-<K\u001bh7:\u000e";
                        obj = 40;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                        strArr2[i] = str;
                        i = 42;
                        str = "Eh";
                        obj = 41;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                        strArr2[i] = str;
                        i = 43;
                        str = "\u0010&\u0012;O\u001b\u000e7:G\f ;0";
                        obj = 42;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dialogTheme /*42*/:
                        strArr2[i] = str;
                        i = 44;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 43;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dialogPreferredPadding /*43*/:
                        strArr2[i] = str;
                        i = 45;
                        str = "_h\u0018=@\u0016;61J_\u001a; O\u0016&7:IEh";
                        obj = 44;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listDividerAlertDialog /*44*/:
                        strArr2[i] = str;
                        str = "0*41M\u000bh,1Z\n:01J_.,;C_'0\u0017\\\u001a)*1b\u0010):1\\_%+'Z_&1 \u000e\u001d-~5\u000e\u0011'0y]\u000b)*=M_!0:K\rh31C\u001d-,tM\u0013)-'\u0014_";
                        obj = 45;
                        i = 46;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionDropDownStyle /*45*/:
                        strArr2[i] = str;
                        i = 47;
                        strArr2 = strArr3;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 46;
                        break;
                    case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                        strArr2[i] = str;
                        i = 48;
                        str = "_h\r O\r<7:IEh";
                        obj = 47;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_spinnerDropDownItemStyle /*47*/:
                        strArr2[i] = str;
                        i = 49;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 48;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_homeAsUpIndicator /*48*/:
                        strArr2[i] = str;
                        i = 50;
                        str = "_h\u001d5@\u001c-2=@\u0018r~";
                        obj = 49;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionButtonStyle /*49*/:
                        strArr2[i] = str;
                        i = 51;
                        str = "_h\f1]\u001a<7:IEh";
                        obj = 50;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonBarStyle /*50*/:
                        strArr2[i] = str;
                        i = 52;
                        str = "\u0010&\u0012;O\u001b-,\u0006K\f-*";
                        obj = 51;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonBarButtonStyle /*51*/:
                        strArr2[i] = str;
                        i = 53;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 52;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_selectableItemBackground /*52*/:
                        strArr2[i] = str;
                        i = 54;
                        str = "3'?0K\r\u0005?:O\u0018-,";
                        obj = 53;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                        strArr2[i] = str;
                        i = 55;
                        str = "_h\u001a1]\u000b:1-G\u0011/dt";
                        obj = 54;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_borderlessButtonStyle /*54*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "_h\f1Z\u001e!0=@\u0018r~";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        void start() {
            try {
                if (this.mRetaining) {
                    if (this.mRetainingStarted) {
                        this.mStarted = true;
                        return;
                    }
                }
                try {
                    if (!this.mStarted) {
                        try {
                            this.mStarted = true;
                            if (LoaderManagerImpl.DEBUG) {
                                Log.v(z[47], z[48] + this);
                            }
                            try {
                                if (this.mLoader == null) {
                                    if (this.mCallbacks != null) {
                                        this.mLoader = this.mCallbacks.onCreateLoader(this.mId, this.mArgs);
                                    }
                                }
                                try {
                                    if (this.mLoader != null) {
                                        if (this.mLoader.getClass().isMemberClass()) {
                                            try {
                                                if (!Modifier.isStatic(this.mLoader.getClass().getModifiers())) {
                                                    throw new IllegalArgumentException(z[46] + this.mLoader);
                                                }
                                            } catch (IllegalArgumentException e) {
                                                throw e;
                                            }
                                        }
                                        try {
                                            if (!this.mListenerRegistered) {
                                                this.mLoader.registerListener(this.mId, this);
                                                this.mLoader.registerOnLoadCanceledListener(this);
                                                this.mListenerRegistered = true;
                                            }
                                            this.mLoader.startLoading();
                                        } catch (IllegalArgumentException e2) {
                                            throw e2;
                                        }
                                    }
                                } catch (IllegalArgumentException e22) {
                                    throw e22;
                                } catch (IllegalArgumentException e222) {
                                    throw e222;
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
                } catch (IllegalArgumentException e2222222) {
                    throw e2222222;
                }
            } catch (IllegalArgumentException e22222222) {
                throw e22222222;
            } catch (IllegalArgumentException e222222222) {
                throw e222222222;
            }
        }

        void stop() {
            try {
                if (LoaderManagerImpl.DEBUG) {
                    Log.v(z[23], z[22] + this);
                }
                try {
                    this.mStarted = false;
                    if (!this.mRetaining) {
                        if (this.mLoader != null) {
                            try {
                                if (this.mListenerRegistered) {
                                    this.mListenerRegistered = false;
                                    this.mLoader.unregisterListener(this);
                                    this.mLoader.unregisterOnLoadCanceledListener(this);
                                    this.mLoader.stopLoading();
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
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

        void callOnLoadFinished(Loader loader, Object obj) {
            if (this.mCallbacks != null) {
                String str;
                if (LoaderManagerImpl.access$000(this.this$0) != null) {
                    String str2 = LoaderManagerImpl.access$000(this.this$0).mFragmentManager.mNoTransactionsBecause;
                    LoaderManagerImpl.access$000(this.this$0).mFragmentManager.mNoTransactionsBecause = z[43];
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (LoaderManagerImpl.DEBUG) {
                        Log.v(z[40], z[41] + loader + z[42] + loader.dataToString(obj));
                    }
                    this.mCallbacks.onLoadFinished(loader, obj);
                    if (LoaderManagerImpl.access$000(this.this$0) != null) {
                        LoaderManagerImpl.access$000(this.this$0).mFragmentManager.mNoTransactionsBecause = str;
                    }
                    this.mDeliveredData = true;
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (Throwable th) {
                    try {
                        if (LoaderManagerImpl.access$000(this.this$0) != null) {
                            LoaderManagerImpl.access$000(this.this$0).mFragmentManager.mNoTransactionsBecause = str;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
        }

        public void onLoadCanceled(Loader loader) {
            try {
                if (LoaderManagerImpl.DEBUG) {
                    Log.v(z[27], z[28] + this);
                }
                try {
                    if (!this.mDestroyed) {
                        try {
                            if (this.this$0.mLoaders.get(this.mId) == this) {
                                LoaderInfo loaderInfo = this.mPendingLoader;
                                if (loaderInfo != null) {
                                    try {
                                        if (LoaderManagerImpl.DEBUG) {
                                            Log.v(z[30], z[25] + loaderInfo);
                                        }
                                        this.mPendingLoader = null;
                                        this.this$0.mLoaders.put(this.mId, null);
                                        destroy();
                                        this.this$0.installLoader(loaderInfo);
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                            } else if (LoaderManagerImpl.DEBUG) {
                                Log.v(z[24], z[29]);
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    } else if (LoaderManagerImpl.DEBUG) {
                        Log.v(z[31], z[26]);
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        }

        void finishRetain() {
            try {
                if (this.mRetaining) {
                    if (LoaderManagerImpl.DEBUG) {
                        Log.v(z[44], z[45] + this);
                    }
                    try {
                        this.mRetaining = false;
                        if (this.mStarted != this.mRetainingStarted) {
                            if (!this.mStarted) {
                                stop();
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                try {
                    if (!this.mStarted) {
                        return;
                    }
                    if (this.mHaveData) {
                        try {
                            if (!this.mReportNextStart) {
                                callOnLoadFinished(this.mLoader, this.mData);
                            }
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
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            }
        }

        void reportStart() {
            try {
                if (!this.mStarted) {
                    return;
                }
                if (this.mReportNextStart) {
                    try {
                        this.mReportNextStart = false;
                        if (this.mHaveData) {
                            callOnLoadFinished(this.mLoader, this.mData);
                        }
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

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLoadComplete(android.support.v4.content.Loader r7, java.lang.Object r8) {
            /*
            r6 = this;
            r5 = 0;
            r0 = android.support.v4.app.LoaderManagerImpl.DEBUG;	 Catch:{ IllegalArgumentException -> 0x003d }
            if (r0 == 0) goto L_0x0025;
        L_0x0005:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x003d }
            r1 = 35;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x003d }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003d }
            r1.<init>();	 Catch:{ IllegalArgumentException -> 0x003d }
            r2 = z;	 Catch:{ IllegalArgumentException -> 0x003d }
            r3 = 32;
            r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x003d }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
            r1 = r1.append(r6);	 Catch:{ IllegalArgumentException -> 0x003d }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x003d }
            android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x003d }
        L_0x0025:
            r0 = r6.mDestroyed;	 Catch:{ IllegalArgumentException -> 0x003f }
            if (r0 == 0) goto L_0x0043;
        L_0x0029:
            r0 = android.support.v4.app.LoaderManagerImpl.DEBUG;	 Catch:{ IllegalArgumentException -> 0x0041 }
            if (r0 == 0) goto L_0x003c;
        L_0x002d:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0041 }
            r1 = 38;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0041 }
            r1 = z;	 Catch:{ IllegalArgumentException -> 0x0041 }
            r2 = 33;
            r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0041 }
            android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0041 }
        L_0x003c:
            return;
        L_0x003d:
            r0 = move-exception;
            throw r0;
        L_0x003f:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
        L_0x0041:
            r0 = move-exception;
            throw r0;
        L_0x0043:
            r0 = r6.this$0;	 Catch:{ IllegalArgumentException -> 0x0065 }
            r0 = r0.mLoaders;	 Catch:{ IllegalArgumentException -> 0x0065 }
            r1 = r6.mId;	 Catch:{ IllegalArgumentException -> 0x0065 }
            r0 = r0.get(r1);	 Catch:{ IllegalArgumentException -> 0x0065 }
            if (r0 == r6) goto L_0x0067;
        L_0x004f:
            r0 = android.support.v4.app.LoaderManagerImpl.DEBUG;	 Catch:{ IllegalArgumentException -> 0x0063 }
            if (r0 == 0) goto L_0x003c;
        L_0x0053:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0063 }
            r1 = 36;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0063 }
            r1 = z;	 Catch:{ IllegalArgumentException -> 0x0063 }
            r2 = 34;
            r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0063 }
            android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0063 }
            goto L_0x003c;
        L_0x0063:
            r0 = move-exception;
            throw r0;
        L_0x0065:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0063 }
        L_0x0067:
            r0 = r6.mPendingLoader;
            if (r0 == 0) goto L_0x00a5;
        L_0x006b:
            r1 = android.support.v4.app.LoaderManagerImpl.DEBUG;	 Catch:{ IllegalArgumentException -> 0x00a3 }
            if (r1 == 0) goto L_0x008f;
        L_0x006f:
            r1 = z;	 Catch:{ IllegalArgumentException -> 0x00a3 }
            r2 = 39;
            r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00a3 }
            r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00a3 }
            r2.<init>();	 Catch:{ IllegalArgumentException -> 0x00a3 }
            r3 = z;	 Catch:{ IllegalArgumentException -> 0x00a3 }
            r4 = 37;
            r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00a3 }
            r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x00a3 }
            r2 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00a3 }
            r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00a3 }
            android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        L_0x008f:
            r6.mPendingLoader = r5;
            r1 = r6.this$0;
            r1 = r1.mLoaders;
            r2 = r6.mId;
            r1.put(r2, r5);
            r6.destroy();
            r1 = r6.this$0;
            r1.installLoader(r0);
            goto L_0x003c;
        L_0x00a3:
            r0 = move-exception;
            throw r0;
        L_0x00a5:
            r0 = r6.mData;	 Catch:{ IllegalArgumentException -> 0x00f7 }
            if (r0 != r8) goto L_0x00ad;
        L_0x00a9:
            r0 = r6.mHaveData;	 Catch:{ IllegalArgumentException -> 0x00f9 }
            if (r0 != 0) goto L_0x00b9;
        L_0x00ad:
            r6.mData = r8;	 Catch:{ IllegalArgumentException -> 0x00fb }
            r0 = 1;
            r6.mHaveData = r0;	 Catch:{ IllegalArgumentException -> 0x00fb }
            r0 = r6.mStarted;	 Catch:{ IllegalArgumentException -> 0x00fb }
            if (r0 == 0) goto L_0x00b9;
        L_0x00b6:
            r6.callOnLoadFinished(r7, r8);	 Catch:{ IllegalArgumentException -> 0x00fb }
        L_0x00b9:
            r0 = r6.this$0;
            r0 = r0.mInactiveLoaders;
            r1 = r6.mId;
            r0 = r0.get(r1);
            r0 = (android.support.v4.app.LoaderManagerImpl.LoaderInfo) r0;
            if (r0 == 0) goto L_0x00d8;
        L_0x00c7:
            if (r0 == r6) goto L_0x00d8;
        L_0x00c9:
            r1 = 0;
            r0.mDeliveredData = r1;	 Catch:{ IllegalArgumentException -> 0x00fd }
            r0.destroy();	 Catch:{ IllegalArgumentException -> 0x00fd }
            r0 = r6.this$0;	 Catch:{ IllegalArgumentException -> 0x00fd }
            r0 = r0.mInactiveLoaders;	 Catch:{ IllegalArgumentException -> 0x00fd }
            r1 = r6.mId;	 Catch:{ IllegalArgumentException -> 0x00fd }
            r0.remove(r1);	 Catch:{ IllegalArgumentException -> 0x00fd }
        L_0x00d8:
            r0 = r6.this$0;	 Catch:{ IllegalArgumentException -> 0x00ff }
            r0 = android.support.v4.app.LoaderManagerImpl.access$000(r0);	 Catch:{ IllegalArgumentException -> 0x00ff }
            if (r0 == 0) goto L_0x003c;
        L_0x00e0:
            r0 = r6.this$0;	 Catch:{ IllegalArgumentException -> 0x00f5 }
            r0 = r0.hasRunningLoaders();	 Catch:{ IllegalArgumentException -> 0x00f5 }
            if (r0 != 0) goto L_0x003c;
        L_0x00e8:
            r0 = r6.this$0;	 Catch:{ IllegalArgumentException -> 0x00f5 }
            r0 = android.support.v4.app.LoaderManagerImpl.access$000(r0);	 Catch:{ IllegalArgumentException -> 0x00f5 }
            r0 = r0.mFragmentManager;	 Catch:{ IllegalArgumentException -> 0x00f5 }
            r0.startPendingDeferredFragments();	 Catch:{ IllegalArgumentException -> 0x00f5 }
            goto L_0x003c;
        L_0x00f5:
            r0 = move-exception;
            throw r0;
        L_0x00f7:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00fb }
        L_0x00fb:
            r0 = move-exception;
            throw r0;
        L_0x00fd:
            r0 = move-exception;
            throw r0;
        L_0x00ff:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00f5 }
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.LoaderInfo.onLoadComplete(android.support.v4.content.Loader, java.lang.Object):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            /*
            r4 = this;
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r1 = 4;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0125 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r0 = r4.mId;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r1 = 3;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0125 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r0 = r4.mArgs;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r1 = 16;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0125 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r0 = r4.mCallbacks;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r1 = 12;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0125 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x0125 }
            if (r0 == 0) goto L_0x005f;
        L_0x0043:
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0125 }
            r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r2 = z;	 Catch:{ IllegalArgumentException -> 0x0125 }
            r3 = 8;
            r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0125 }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0125 }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0125 }
            r0.dump(r1, r6, r7, r8);	 Catch:{ IllegalArgumentException -> 0x0125 }
        L_0x005f:
            r0 = r4.mHaveData;	 Catch:{ IllegalArgumentException -> 0x0127 }
            if (r0 != 0) goto L_0x0067;
        L_0x0063:
            r0 = r4.mDeliveredData;	 Catch:{ IllegalArgumentException -> 0x0129 }
            if (r0 == 0) goto L_0x0097;
        L_0x0067:
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x0129 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0129 }
            r1 = 10;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0129 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0129 }
            r0 = r4.mHaveData;	 Catch:{ IllegalArgumentException -> 0x0129 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0129 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0129 }
            r1 = 17;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0129 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0129 }
            r0 = r4.mDeliveredData;	 Catch:{ IllegalArgumentException -> 0x0129 }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x0129 }
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x0129 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0129 }
            r1 = 13;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0129 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0129 }
            r0 = r4.mData;	 Catch:{ IllegalArgumentException -> 0x0129 }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x0129 }
        L_0x0097:
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = 14;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = r4.mStarted;	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = 9;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = r4.mReportNextStart;	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = 11;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = r4.mDestroyed;	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = 2;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = r4.mRetaining;	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = 6;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = r4.mRetainingStarted;	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = 5;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = r4.mListenerRegistered;	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = r4.mPendingLoader;	 Catch:{ IllegalArgumentException -> 0x012b }
            if (r0 == 0) goto L_0x0124;
        L_0x00f2:
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = 7;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = r4.mPendingLoader;	 Catch:{ IllegalArgumentException -> 0x012b }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = ":";
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
            r0 = r4.mPendingLoader;	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x012b }
            r1.<init>();	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x012b }
            r2 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
            r3 = 15;
            r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x012b }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x012b }
            r0.dump(r1, r6, r7, r8);	 Catch:{ IllegalArgumentException -> 0x012b }
        L_0x0124:
            return;
        L_0x0125:
            r0 = move-exception;
            throw r0;
        L_0x0127:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0129 }
        L_0x0129:
            r0 = move-exception;
            throw r0;
        L_0x012b:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.LoaderInfo.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
        }

        public LoaderInfo(LoaderManagerImpl loaderManagerImpl, int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
            this.this$0 = loaderManagerImpl;
            this.mId = i;
            this.mArgs = bundle;
            this.mCallbacks = loaderCallbacks;
        }

        void destroy() {
            String str;
            try {
                if (LoaderManagerImpl.DEBUG) {
                    Log.v(z[53], z[55] + this);
                }
                this.mDestroyed = true;
                boolean z = this.mDeliveredData;
                try {
                    this.mDeliveredData = false;
                    if (!(this.mCallbacks == null || this.mLoader == null)) {
                        if (this.mHaveData && z) {
                            try {
                                if (LoaderManagerImpl.DEBUG) {
                                    try {
                                        Log.v(z[54], z[51] + this);
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                                if (LoaderManagerImpl.access$000(this.this$0) != null) {
                                    String str2 = LoaderManagerImpl.access$000(this.this$0).mFragmentManager.mNoTransactionsBecause;
                                    LoaderManagerImpl.access$000(this.this$0).mFragmentManager.mNoTransactionsBecause = z[52];
                                    str = str2;
                                } else {
                                    str = null;
                                }
                                try {
                                    this.mCallbacks.onLoaderReset(this.mLoader);
                                } finally {
                                    try {
                                        if (LoaderManagerImpl.access$000(this.this$0) != null) {
                                            LoaderManagerImpl.access$000(this.this$0).mFragmentManager.mNoTransactionsBecause = str;
                                        }
                                    } catch (IllegalArgumentException e2) {
                                        throw e2;
                                    }
                                }
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                    }
                    try {
                        this.mCallbacks = null;
                        this.mData = null;
                        this.mHaveData = false;
                        if (this.mLoader != null) {
                            if (this.mListenerRegistered) {
                                this.mListenerRegistered = false;
                                this.mLoader.unregisterListener(this);
                                this.mLoader.unregisterOnLoadCanceledListener(this);
                            }
                            this.mLoader.reset();
                        }
                        try {
                            if (this.mPendingLoader != null) {
                                this.mPendingLoader.destroy();
                            }
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                    } catch (IllegalArgumentException e2222) {
                        throw e2222;
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                } catch (IllegalArgumentException e2222222) {
                    try {
                        throw e2222222;
                    } catch (IllegalArgumentException e22222222) {
                        throw e22222222;
                    }
                }
            } catch (IllegalArgumentException e222222222) {
                throw e222222222;
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append(z[21]);
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(z[19]);
            stringBuilder.append(this.mId);
            stringBuilder.append(z[18]);
            DebugUtils.buildShortClassTag(this.mLoader, stringBuilder);
            stringBuilder.append(z[20]);
            return stringBuilder.toString();
        }

        void retain() {
            try {
                if (LoaderManagerImpl.DEBUG) {
                    Log.v(z[0], z[1] + this);
                }
                this.mRetaining = true;
                this.mRetainingStarted = this.mStarted;
                this.mStarted = false;
                this.mCallbacks = null;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        void cancel() {
            try {
                if (LoaderManagerImpl.DEBUG) {
                    Log.v(z[49], z[50] + this);
                }
                try {
                    if (!this.mStarted) {
                        return;
                    }
                    if (this.mLoader != null) {
                        try {
                            if (this.mListenerRegistered) {
                                try {
                                    if (!this.mLoader.cancelLoad()) {
                                        onLoadCanceled(this.mLoader);
                                    }
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
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
    }

    void installLoader(LoaderInfo loaderInfo) {
        try {
            this.mLoaders.put(loaderInfo.mId, loaderInfo);
            if (this.mStarted) {
                loaderInfo.start();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.content.Loader initLoader(int r6, android.os.Bundle r7, android.support.v4.app.LoaderManager.LoaderCallbacks r8) {
        /*
        r5 = this;
        r0 = r5.mCreatingLoader;	 Catch:{ IllegalStateException -> 0x0010 }
        if (r0 == 0) goto L_0x0012;
    L_0x0004:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0010 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0010 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0010 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0010 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r0 = r5.mLoaders;
        r0 = r0.get(r6);
        r0 = (android.support.v4.app.LoaderManagerImpl.LoaderInfo) r0;
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x00b0 }
        if (r1 == 0) goto L_0x004c;
    L_0x001e:
        r1 = z;	 Catch:{ IllegalStateException -> 0x00b0 }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00b0 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00b0 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x00b0 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00b0 }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00b0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00b0 }
        r2 = r2.append(r5);	 Catch:{ IllegalStateException -> 0x00b0 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00b0 }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00b0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00b0 }
        r2 = r2.append(r7);	 Catch:{ IllegalStateException -> 0x00b0 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x00b0 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x00b0 }
    L_0x004c:
        if (r0 != 0) goto L_0x0079;
    L_0x004e:
        r0 = r5.createAndInstallLoader(r6, r7, r8);
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x00b2 }
        if (r1 == 0) goto L_0x009e;
    L_0x0056:
        r1 = z;	 Catch:{ IllegalStateException -> 0x00b4 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00b4 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00b4 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x00b4 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00b4 }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00b4 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00b4 }
        r2 = r2.append(r0);	 Catch:{ IllegalStateException -> 0x00b4 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x00b4 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x00b4 }
        r1 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalStateException -> 0x00b4 }
        if (r1 == 0) goto L_0x009e;
    L_0x0079:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x00b6 }
        if (r1 == 0) goto L_0x009c;
    L_0x007d:
        r1 = z;	 Catch:{ IllegalStateException -> 0x00b6 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00b6 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00b6 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x00b6 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00b6 }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00b6 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00b6 }
        r2 = r2.append(r0);	 Catch:{ IllegalStateException -> 0x00b6 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x00b6 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x00b6 }
    L_0x009c:
        r0.mCallbacks = r8;
    L_0x009e:
        r1 = r0.mHaveData;	 Catch:{ IllegalStateException -> 0x00b8 }
        if (r1 == 0) goto L_0x00ad;
    L_0x00a2:
        r1 = r5.mStarted;	 Catch:{ IllegalStateException -> 0x00ba }
        if (r1 == 0) goto L_0x00ad;
    L_0x00a6:
        r1 = r0.mLoader;	 Catch:{ IllegalStateException -> 0x00ba }
        r2 = r0.mData;	 Catch:{ IllegalStateException -> 0x00ba }
        r0.callOnLoadFinished(r1, r2);	 Catch:{ IllegalStateException -> 0x00ba }
    L_0x00ad:
        r0 = r0.mLoader;
        return r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.initLoader(int, android.os.Bundle, android.support.v4.app.LoaderManager$LoaderCallbacks):android.support.v4.content.Loader");
    }

    void doRetain() {
        boolean z = Fragment.a;
        try {
            if (DEBUG) {
                Log.v(z[51], z[52] + this);
            }
            if (this.mStarted) {
                this.mRetaining = true;
                this.mStarted = false;
                int size = this.mLoaders.size() - 1;
                while (size >= 0) {
                    ((LoaderInfo) this.mLoaders.valueAt(size)).retain();
                    int i = size - 1;
                    if (!z) {
                        size = i;
                    } else {
                        return;
                    }
                }
                return;
            }
            Throwable runtimeException = new RuntimeException(z[49]);
            runtimeException.fillInStackTrace();
            Log.w(z[53], z[50] + this, runtimeException);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.content.Loader restartLoader(int r9, android.os.Bundle r10, android.support.v4.app.LoaderManager.LoaderCallbacks r11) {
        /*
        r8 = this;
        r7 = 0;
        r2 = android.support.v4.app.Fragment.a;
        r0 = r8.mCreatingLoader;	 Catch:{ IllegalStateException -> 0x0013 }
        if (r0 == 0) goto L_0x0015;
    L_0x0007:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0013 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0013 }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0013 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0013 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0013 }
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r0 = r8.mLoaders;
        r0 = r0.get(r9);
        r0 = (android.support.v4.app.LoaderManagerImpl.LoaderInfo) r0;
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x011c }
        if (r1 == 0) goto L_0x004f;
    L_0x0021:
        r1 = z;	 Catch:{ IllegalStateException -> 0x011c }
        r3 = 29;
        r1 = r1[r3];	 Catch:{ IllegalStateException -> 0x011c }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x011c }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x011c }
        r4 = z;	 Catch:{ IllegalStateException -> 0x011c }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x011c }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x011c }
        r3 = r3.append(r8);	 Catch:{ IllegalStateException -> 0x011c }
        r4 = z;	 Catch:{ IllegalStateException -> 0x011c }
        r5 = 21;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x011c }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x011c }
        r3 = r3.append(r10);	 Catch:{ IllegalStateException -> 0x011c }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x011c }
        android.util.Log.v(r1, r3);	 Catch:{ IllegalStateException -> 0x011c }
    L_0x004f:
        if (r0 == 0) goto L_0x0160;
    L_0x0051:
        r1 = r8.mInactiveLoaders;
        r1 = r1.get(r9);
        r1 = (android.support.v4.app.LoaderManagerImpl.LoaderInfo) r1;
        if (r1 == 0) goto L_0x0132;
    L_0x005b:
        r3 = r0.mHaveData;	 Catch:{ IllegalStateException -> 0x011e }
        if (r3 == 0) goto L_0x0095;
    L_0x005f:
        r3 = DEBUG;	 Catch:{ IllegalStateException -> 0x0120 }
        if (r3 == 0) goto L_0x0083;
    L_0x0063:
        r3 = z;	 Catch:{ IllegalStateException -> 0x0120 }
        r4 = 25;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0120 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0120 }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x0120 }
        r5 = z;	 Catch:{ IllegalStateException -> 0x0120 }
        r6 = 22;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x0120 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x0120 }
        r4 = r4.append(r0);	 Catch:{ IllegalStateException -> 0x0120 }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x0120 }
        android.util.Log.v(r3, r4);	 Catch:{ IllegalStateException -> 0x0120 }
    L_0x0083:
        r3 = 0;
        r1.mDeliveredData = r3;	 Catch:{ IllegalStateException -> 0x0122 }
        r1.destroy();	 Catch:{ IllegalStateException -> 0x0122 }
        r1 = r0.mLoader;	 Catch:{ IllegalStateException -> 0x0122 }
        r1.abandon();	 Catch:{ IllegalStateException -> 0x0122 }
        r1 = r8.mInactiveLoaders;	 Catch:{ IllegalStateException -> 0x0122 }
        r1.put(r9, r0);	 Catch:{ IllegalStateException -> 0x0122 }
        if (r2 == 0) goto L_0x0160;
    L_0x0095:
        r1 = r0.mStarted;	 Catch:{ IllegalStateException -> 0x0124 }
        if (r1 != 0) goto L_0x00b7;
    L_0x0099:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x0126 }
        if (r1 == 0) goto L_0x00ac;
    L_0x009d:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = 18;
        r1 = r1[r3];	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0126 }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0126 }
        android.util.Log.v(r1, r3);	 Catch:{ IllegalStateException -> 0x0126 }
    L_0x00ac:
        r1 = r8.mLoaders;	 Catch:{ IllegalStateException -> 0x0128 }
        r3 = 0;
        r1.put(r9, r3);	 Catch:{ IllegalStateException -> 0x0128 }
        r0.destroy();	 Catch:{ IllegalStateException -> 0x0128 }
        if (r2 == 0) goto L_0x0160;
    L_0x00b7:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x012a }
        if (r1 == 0) goto L_0x00ca;
    L_0x00bb:
        r1 = z;	 Catch:{ IllegalStateException -> 0x012a }
        r2 = 16;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x012a }
        r2 = z;	 Catch:{ IllegalStateException -> 0x012a }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x012a }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x012a }
    L_0x00ca:
        r0.cancel();	 Catch:{ IllegalStateException -> 0x012c }
        r1 = r0.mPendingLoader;	 Catch:{ IllegalStateException -> 0x012c }
        if (r1 == 0) goto L_0x00fe;
    L_0x00d1:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x012e }
        if (r1 == 0) goto L_0x00f7;
    L_0x00d5:
        r1 = z;	 Catch:{ IllegalStateException -> 0x012e }
        r2 = 19;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x012e }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x012e }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x012e }
        r3 = z;	 Catch:{ IllegalStateException -> 0x012e }
        r4 = 15;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x012e }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x012e }
        r3 = r0.mPendingLoader;	 Catch:{ IllegalStateException -> 0x012e }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x012e }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x012e }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x012e }
    L_0x00f7:
        r1 = r0.mPendingLoader;
        r1.destroy();
        r0.mPendingLoader = r7;
    L_0x00fe:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x0130 }
        if (r1 == 0) goto L_0x0111;
    L_0x0102:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0130 }
        r2 = 28;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0130 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0130 }
        r3 = 23;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0130 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x0130 }
    L_0x0111:
        r1 = r8.createLoader(r9, r10, r11);
        r0.mPendingLoader = r1;
        r0 = r0.mPendingLoader;
        r0 = r0.mLoader;
    L_0x011b:
        return r0;
    L_0x011c:
        r0 = move-exception;
        throw r0;
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0120 }
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x0124:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0126 }
    L_0x0126:
        r0 = move-exception;
        throw r0;
    L_0x0128:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x012a }
    L_0x012a:
        r0 = move-exception;
        throw r0;
    L_0x012c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x012e }
    L_0x012e:
        r0 = move-exception;
        throw r0;
    L_0x0130:
        r0 = move-exception;
        throw r0;
    L_0x0132:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x0167 }
        if (r1 == 0) goto L_0x0156;
    L_0x0136:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0167 }
        r2 = 27;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0167 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0167 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0167 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0167 }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0167 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0167 }
        r2 = r2.append(r0);	 Catch:{ IllegalStateException -> 0x0167 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0167 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x0167 }
    L_0x0156:
        r1 = r0.mLoader;
        r1.abandon();
        r1 = r8.mInactiveLoaders;
        r1.put(r9, r0);
    L_0x0160:
        r0 = r8.createAndInstallLoader(r9, r10, r11);
        r0 = r0.mLoader;
        goto L_0x011b;
    L_0x0167:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.restartLoader(int, android.os.Bundle, android.support.v4.app.LoaderManager$LoaderCallbacks):android.support.v4.content.Loader");
    }

    void doReportNextStart() {
        boolean z = Fragment.a;
        int size = this.mLoaders.size() - 1;
        while (size >= 0) {
            ((LoaderInfo) this.mLoaders.valueAt(size)).mReportNextStart = true;
            int i = size - 1;
            if (!z) {
                size = i;
            } else {
                return;
            }
        }
    }

    public boolean hasRunningLoaders() {
        boolean z = Fragment.a;
        int size = this.mLoaders.size();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.valueAt(i);
            try {
                int i2;
                boolean z3;
                int i3;
                if (loaderInfo.mStarted) {
                    if (!loaderInfo.mDeliveredData) {
                        i2 = 1;
                        z3 = i2 | z2;
                        i3 = i + 1;
                        if (z) {
                            return z3;
                        }
                        i = i3;
                        z2 = z3;
                    }
                }
                i2 = 0;
                z3 = i2 | z2;
                i3 = i + 1;
                if (z) {
                    return z3;
                }
                i = i3;
                z2 = z3;
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        return z2;
    }

    void doDestroy() {
        boolean z = Fragment.a;
        try {
            int size;
            int i;
            if (!this.mRetaining) {
                if (DEBUG) {
                    Log.v(z[30], z[31] + this);
                }
                size = this.mLoaders.size() - 1;
                while (size >= 0) {
                    ((LoaderInfo) this.mLoaders.valueAt(size)).destroy();
                    i = size - 1;
                    if (z) {
                        break;
                    }
                    size = i;
                }
                this.mLoaders.clear();
            }
            try {
                if (DEBUG) {
                    Log.v(z[33], z[32] + this);
                }
                size = this.mInactiveLoaders.size() - 1;
                while (size >= 0) {
                    ((LoaderInfo) this.mInactiveLoaders.valueAt(size)).destroy();
                    i = size - 1;
                    if (z) {
                        break;
                    }
                    size = i;
                }
                this.mInactiveLoaders.clear();
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void destroyLoader(int i) {
        try {
            if (this.mCreatingLoader) {
                throw new IllegalStateException(z[57]);
            }
            try {
                LoaderInfo loaderInfo;
                if (DEBUG) {
                    Log.v(z[54], z[55] + this + z[56] + i);
                }
                int indexOfKey = this.mLoaders.indexOfKey(i);
                if (indexOfKey >= 0) {
                    loaderInfo = (LoaderInfo) this.mLoaders.valueAt(indexOfKey);
                    this.mLoaders.removeAt(indexOfKey);
                    loaderInfo.destroy();
                }
                indexOfKey = this.mInactiveLoaders.indexOfKey(i);
                if (indexOfKey >= 0) {
                    loaderInfo = (LoaderInfo) this.mInactiveLoaders.valueAt(indexOfKey);
                    this.mInactiveLoaders.removeAt(indexOfKey);
                    loaderInfo.destroy();
                }
                try {
                    if (this.mHost == null) {
                        return;
                    }
                    if (!hasRunningLoaders()) {
                        this.mHost.mFragmentManager.startPendingDeferredFragments();
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

    void finishRetain() {
        boolean z = Fragment.a;
        try {
            if (this.mRetaining) {
                if (DEBUG) {
                    Log.v(z[48], z[47] + this);
                }
                this.mRetaining = false;
                int size = this.mLoaders.size() - 1;
                while (size >= 0) {
                    ((LoaderInfo) this.mLoaders.valueAt(size)).finishRetain();
                    int i = size - 1;
                    if (!z) {
                        size = i;
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

    LoaderManagerImpl(String str, FragmentHostCallback fragmentHostCallback, boolean z) {
        this.mLoaders = new SparseArrayCompat();
        this.mInactiveLoaders = new SparseArrayCompat();
        this.mWho = str;
        this.mHost = fragmentHostCallback;
        this.mStarted = z;
    }

    void doStart() {
        boolean z = Fragment.a;
        try {
            if (DEBUG) {
                Log.v(z[2], z[3] + this);
            }
            if (this.mStarted) {
                Throwable runtimeException = new RuntimeException(z[0]);
                runtimeException.fillInStackTrace();
                Log.w(z[4], z[1] + this, runtimeException);
                return;
            }
            this.mStarted = true;
            int size = this.mLoaders.size() - 1;
            while (size >= 0) {
                ((LoaderInfo) this.mLoaders.valueAt(size)).start();
                int i = size - 1;
                if (!z) {
                    size = i;
                } else {
                    return;
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[61];
        String str = "#\u0002\u0006<";
        boolean z = true;
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
                        i3 = 75;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 116;
                        break;
                    case at.o /*3*/:
                        i3 = 89;
                        break;
                    default:
                        i3 = 63;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0018\u0013\u0015+K\"\t\u0013yV%G";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\b\u0006\u00185Z/G\u00031V'\u0002T:M.\u0006\u00000Q,G\u0015yS$\u0006\u0010<M";
                    z = true;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "kG7+Z*\u0013\u0011=\u001f%\u0002\u0003yS$\u0006\u0010<Mk";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "kG&<\u0012>\u0014\u001d7Xk\u0002\f0L?\u000e\u001a>\u001f'\b\u0015=Z9G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "qG\u0015+X8Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\"\t\u001d-s$\u0006\u0010<Mk\u000e\u001ay";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\b\u0006\u00185Z/G\u00031V'\u0002T:M.\u0006\u00000Q,G\u0015yS$\u0006\u0010<M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "kG7,M9\u0002\u001a-\u001f'\b\u0015=Z9G\u001d*\u001f8\u0013\u001b)O.\u0003OyM.\u0017\u00188\\\"\t\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "kG&<R$\u0011\u001d7Xk\u0017\u00117[\"\t\u0013yS$\u0006\u0010<MqG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\b\u0006\u00185Z/G\u00031V'\u0002T:M.\u0006\u00000Q,G\u0015yS$\u0006\u0010<M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "9\u0002\u0007-^9\u001386^/\u0002\u0006yV%G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "qG\u0015+X8Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "kG&<R$\u0011\u001d7Xk\u000b\u0015*Kk\u000e\u001a8\\?\u000e\u0002<\u001f'\b\u0015=Z9]T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "kG17N>\u0002\u00010Q,G\u0015*\u001f%\u0002\u0003yO.\t\u00100Q,G\u00186^/\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "kG98T\"\t\u0013yS*\u0014\u0000yS$\u0006\u0010<Mk\u000e\u001a8\\?\u000e\u0002<\u0005k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "kG7,M9\u0002\u001a-\u001f'\b\u0015=Z9G\u001d*\u001f9\u0012\u001a7V%\u0000Oy^?\u0013\u00114O?\u000e\u001a>\u001f?\bT:^%\u0004\u00115";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u000f\u0002\u0007-M$\u001e\u001d7Xk&\u0017-V=\u0002T0Qk";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u000f\u0002\u0007-M$\u001e\u001d7Xk.\u001a8\\?\u000e\u0002<\u001f\"\tT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0018\u0013\u001b)O\"\t\u0013yV%G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\b\u0006\u00185Z/G\u00106l?\b\u0004yH#\u0002\u001ayQ$\u0013T*K*\u0015\u0000<[qG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "#\u0002\u0006<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "kGTy";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "qG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0002\t\u0015:K\"\u0011\u0011ys$\u0006\u0010<M8]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "kGW";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "kGTy";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "qG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\n\u0004\u00000I.G86^/\u0002\u0006*\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "kGW";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\r\u000e\u001a0L#\u0002\u0010ym.\u0013\u00150Q\"\t\u0013yV%G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "#\u0002\u0006<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\b\u0006\u00185Z/G\u00106m.\u0013\u00150Qk\u0010\u001c<Qk\t\u001b-\u001f8\u0013\u0015+K.\u0003Ny";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0019\u0002\u00008V%\u000e\u001a>\u001f\"\tT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "/\u0002\u0007-M$\u001e86^/\u0002\u0006yV%G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "k\b\u0012y";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\b\u0006\u00185Z/G\u00031V'\u0002T:M.\u0006\u00000Q,G\u0015yS$\u0006\u0010<M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0007\b\u0015=Z9*\u00157^,\u0002\u0006\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "6\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "k\u000e\u001ay";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    z = strArr3;
                    DEBUG = false;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\b\u0006\u00185Z/G\u00106l?\u0006\u0006-\u001f<\u000f\u00117\u001f*\u000b\u0006<^/\u001eT*K*\u0015\u0000<[qG";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    static FragmentHostCallback access$000(LoaderManagerImpl loaderManagerImpl) {
        return loaderManagerImpl.mHost;
    }

    public Loader getLoader(int i) {
        try {
            if (this.mCreatingLoader) {
                throw new IllegalStateException(z[5]);
            }
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.get(i);
            if (loaderInfo == null) {
                return null;
            }
            try {
                return loaderInfo.mPendingLoader != null ? loaderInfo.mPendingLoader.mLoader : loaderInfo.mLoader;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    void doStop() {
        boolean z = Fragment.a;
        try {
            if (DEBUG) {
                Log.v(z[35], z[34] + this);
            }
            if (this.mStarted) {
                int size = this.mLoaders.size() - 1;
                while (size >= 0) {
                    ((LoaderInfo) this.mLoaders.valueAt(size)).stop();
                    int i = size - 1;
                    if (z) {
                        break;
                    }
                    size = i;
                }
                this.mStarted = false;
                return;
            }
            Throwable runtimeException = new RuntimeException(z[38]);
            runtimeException.fillInStackTrace();
            Log.w(z[37], z[36] + this, runtimeException);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    void updateHostController(FragmentHostCallback fragmentHostCallback) {
        this.mHost = fragmentHostCallback;
    }

    private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        try {
            this.mCreatingLoader = true;
            LoaderInfo createLoader = createLoader(i, bundle, loaderCallbacks);
            installLoader(createLoader);
            return createLoader;
        } finally {
            this.mCreatingLoader = false;
        }
    }

    void doReportStart() {
        boolean z = Fragment.a;
        int size = this.mLoaders.size() - 1;
        while (size >= 0) {
            ((LoaderInfo) this.mLoaders.valueAt(size)).reportStart();
            int i = size - 1;
            if (!z) {
                size = i;
            } else {
                return;
            }
        }
    }

    private LoaderInfo createLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        LoaderInfo loaderInfo = new LoaderInfo(this, i, bundle, loaderCallbacks);
        loaderInfo.mLoader = loaderCallbacks.onCreateLoader(i, bundle);
        return loaderInfo;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        boolean z = Fragment.a;
        if (this.mLoaders.size() > 0) {
            printWriter.print(str);
            printWriter.println(z[45]);
            String str2 = str + z[39];
            int i2 = 0;
            while (i2 < this.mLoaders.size()) {
                LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.valueAt(i2);
                printWriter.print(str);
                printWriter.print(z[42]);
                printWriter.print(this.mLoaders.keyAt(i2));
                printWriter.print(z[44]);
                printWriter.println(loaderInfo.toString());
                loaderInfo.dump(str2, fileDescriptor, printWriter, strArr);
                int i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
            }
        }
        if (this.mInactiveLoaders.size() > 0) {
            printWriter.print(str);
            printWriter.println(z[41]);
            String str3 = str + z[43];
            while (i < this.mInactiveLoaders.size()) {
                loaderInfo = (LoaderInfo) this.mInactiveLoaders.valueAt(i);
                printWriter.print(str);
                printWriter.print(z[46]);
                printWriter.print(this.mInactiveLoaders.keyAt(i));
                printWriter.print(z[40]);
                printWriter.println(loaderInfo.toString());
                loaderInfo.dump(str3, fileDescriptor, printWriter, strArr);
                i++;
                if (z) {
                    return;
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(z[58]);
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(z[60]);
        DebugUtils.buildShortClassTag(this.mHost, stringBuilder);
        stringBuilder.append(z[59]);
        return stringBuilder.toString();
    }
}
