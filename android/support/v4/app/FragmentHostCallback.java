package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.v;
import org.whispersystems.at;

public abstract class FragmentHostCallback extends FragmentContainer {
    private static final String[] z;
    private final Activity mActivity;
    private SimpleArrayMap mAllLoaderManagers;
    private boolean mCheckedForLoaderManager;
    final Context mContext;
    final FragmentManagerImpl mFragmentManager;
    private final Handler mHandler;
    private LoaderManagerImpl mLoaderManager;
    private boolean mLoadersStarted;
    private boolean mRetainLoaders;
    final int mWindowAnimations;

    static {
        String[] strArr = new String[7];
        String str = "\\2hhI]";
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
                        i3 = 116;
                        break;
                    case at.g /*1*/:
                        i3 = 64;
                        break;
                    case at.i /*2*/:
                        i3 = 7;
                        break;
                    case at.o /*3*/:
                        i3 = 7;
                        break;
                    default:
                        i3 = 61;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0018!~hH\u0000\u001fni[\u0018!sbO";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "8/fcX\u0006`JfS\u0015'bu\u001d";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0019\fhfY\u00112tTI\u00152sbYI";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "T`";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\\2hhI]";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "'4fuI\u001d.`'\\\u00174nqT\u00009'pT\u0000('f\u001d\u0006%vrX\u00074DhY\u0011`ubL\u0001)ubNT!'AO\u0015'jbS\u0000\u0001dsT\u0002)s~\u001d\u001c/ts";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean onHasView() {
        return true;
    }

    public LayoutInflater onGetLayoutInflater() {
        return (LayoutInflater) this.mContext.getSystemService(z[2]);
    }

    void inactivateFragment(String str) {
        if (this.mAllLoaderManagers != null) {
            LoaderManagerImpl loaderManagerImpl = (LoaderManagerImpl) this.mAllLoaderManagers.get(str);
            if (loaderManagerImpl != null) {
                try {
                    if (!loaderManagerImpl.mRetaining) {
                        loaderManagerImpl.doDestroy();
                        this.mAllLoaderManagers.remove(str);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
    }

    Activity getActivity() {
        return this.mActivity;
    }

    void dumpLoaders(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            printWriter.print(str);
            printWriter.print(z[4]);
            printWriter.println(this.mLoadersStarted);
            if (this.mLoaderManager != null) {
                printWriter.print(str);
                printWriter.print(z[3]);
                printWriter.print(Integer.toHexString(System.identityHashCode(this.mLoaderManager)));
                printWriter.println(":");
                this.mLoaderManager.dump(str + z[5], fileDescriptor, printWriter, strArr);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    LoaderManagerImpl getLoaderManagerImpl() {
        try {
            if (this.mLoaderManager != null) {
                return this.mLoaderManager;
            }
            this.mCheckedForLoaderManager = true;
            this.mLoaderManager = getLoaderManager(z[6], this.mLoadersStarted, true);
            return this.mLoaderManager;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    boolean getRetainLoaders() {
        return this.mRetainLoaders;
    }

    FragmentManagerImpl getFragmentManagerImpl() {
        return this.mFragmentManager;
    }

    @Nullable
    public View onFindViewById(int i) {
        return null;
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i) {
        if (i != -1) {
            try {
                throw new IllegalStateException(z[1]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.mContext.startActivity(intent);
    }

    public boolean onShouldSaveFragmentState(Fragment fragment) {
        return true;
    }

    Handler getHandler() {
        return this.mHandler;
    }

    public void onDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    void doLoaderDestroy() {
        try {
            if (this.mLoaderManager != null) {
                this.mLoaderManager.doDestroy();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    void doLoaderStop(boolean z) {
        try {
            this.mRetainLoaders = z;
            if (this.mLoaderManager != null) {
                try {
                    if (this.mLoadersStarted) {
                        try {
                            this.mLoadersStarted = false;
                            if (z) {
                                this.mLoaderManager.doRetain();
                                if (!Fragment.a) {
                                    return;
                                }
                            }
                            this.mLoaderManager.doStop();
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
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public void onSupportInvalidateOptionsMenu() {
    }

    Context getContext() {
        return this.mContext;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void doLoaderStart() {
        /*
        r4 = this;
        r3 = 1;
        r0 = r4.mLoadersStarted;	 Catch:{ IllegalStateException -> 0x0006 }
        if (r0 == 0) goto L_0x0008;
    L_0x0005:
        return;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        r0 = 1;
        r4.mLoadersStarted = r0;	 Catch:{ IllegalStateException -> 0x003c }
        r0 = r4.mLoaderManager;	 Catch:{ IllegalStateException -> 0x003c }
        if (r0 == 0) goto L_0x0018;
    L_0x000f:
        r0 = r4.mLoaderManager;	 Catch:{ IllegalStateException -> 0x003e }
        r0.doStart();	 Catch:{ IllegalStateException -> 0x003e }
        r0 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalStateException -> 0x003e }
        if (r0 == 0) goto L_0x0039;
    L_0x0018:
        r0 = r4.mCheckedForLoaderManager;	 Catch:{ IllegalStateException -> 0x0040 }
        if (r0 != 0) goto L_0x0039;
    L_0x001c:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0042 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0042 }
        r1 = r4.mLoadersStarted;	 Catch:{ IllegalStateException -> 0x0042 }
        r2 = 0;
        r0 = r4.getLoaderManager(r0, r1, r2);	 Catch:{ IllegalStateException -> 0x0042 }
        r4.mLoaderManager = r0;	 Catch:{ IllegalStateException -> 0x0042 }
        r0 = r4.mLoaderManager;	 Catch:{ IllegalStateException -> 0x0042 }
        if (r0 == 0) goto L_0x0039;
    L_0x002e:
        r0 = r4.mLoaderManager;	 Catch:{ IllegalStateException -> 0x0044 }
        r0 = r0.mStarted;	 Catch:{ IllegalStateException -> 0x0044 }
        if (r0 != 0) goto L_0x0039;
    L_0x0034:
        r0 = r4.mLoaderManager;	 Catch:{ IllegalStateException -> 0x0044 }
        r0.doStart();	 Catch:{ IllegalStateException -> 0x0044 }
    L_0x0039:
        r4.mCheckedForLoaderManager = r3;
        goto L_0x0005;
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentHostCallback.doLoaderStart():void");
    }

    void reportLoaderStart() {
        boolean z = Fragment.a;
        if (this.mAllLoaderManagers != null) {
            int i;
            int size = this.mAllLoaderManagers.size();
            LoaderManagerImpl[] loaderManagerImplArr = new LoaderManagerImpl[size];
            int i2 = size - 1;
            while (i2 >= 0) {
                loaderManagerImplArr[i2] = (LoaderManagerImpl) this.mAllLoaderManagers.valueAt(i2);
                i = i2 - 1;
                if (z) {
                    break;
                }
                i2 = i;
            }
            i = 0;
            while (i < size) {
                LoaderManagerImpl loaderManagerImpl = loaderManagerImplArr[i];
                loaderManagerImpl.finishRetain();
                loaderManagerImpl.doReportStart();
                i++;
                if (z) {
                    return;
                }
            }
        }
    }

    public int onGetWindowAnimations() {
        return this.mWindowAnimations;
    }

    void onAttachFragment(Fragment fragment) {
    }

    void restoreLoaderNonConfig(SimpleArrayMap simpleArrayMap) {
        this.mAllLoaderManagers = simpleArrayMap;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.support.v4.app.LoaderManagerImpl getLoaderManager(java.lang.String r3, boolean r4, boolean r5) {
        /*
        r2 = this;
        r0 = r2.mAllLoaderManagers;	 Catch:{ IllegalStateException -> 0x0029 }
        if (r0 != 0) goto L_0x000b;
    L_0x0004:
        r0 = new android.support.v4.util.SimpleArrayMap;	 Catch:{ IllegalStateException -> 0x0029 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0029 }
        r2.mAllLoaderManagers = r0;	 Catch:{ IllegalStateException -> 0x0029 }
    L_0x000b:
        r0 = r2.mAllLoaderManagers;
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.LoaderManagerImpl) r0;
        if (r0 != 0) goto L_0x0025;
    L_0x0015:
        if (r5 == 0) goto L_0x0028;
    L_0x0017:
        r0 = new android.support.v4.app.LoaderManagerImpl;
        r0.<init>(r3, r2, r4);
        r1 = r2.mAllLoaderManagers;	 Catch:{ IllegalStateException -> 0x002b }
        r1.put(r3, r0);	 Catch:{ IllegalStateException -> 0x002b }
        r1 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalStateException -> 0x002b }
        if (r1 == 0) goto L_0x0028;
    L_0x0025:
        r0.updateHostController(r2);	 Catch:{ IllegalStateException -> 0x002b }
    L_0x0028:
        return r0;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentHostCallback.getLoaderManager(java.lang.String, boolean, boolean):android.support.v4.app.LoaderManagerImpl");
    }

    FragmentHostCallback(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.mHandler, 0);
    }

    FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        this.mFragmentManager = new FragmentManagerImpl();
        this.mActivity = activity;
        this.mContext = context;
        this.mHandler = handler;
        this.mWindowAnimations = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.support.v4.util.SimpleArrayMap retainLoaderNonConfig() {
        /*
        r7 = this;
        r1 = 0;
        r3 = android.support.v4.app.Fragment.a;
        r0 = r7.mAllLoaderManagers;
        if (r0 == 0) goto L_0x0049;
    L_0x0007:
        r0 = r7.mAllLoaderManagers;
        r4 = r0.size();
        r5 = new android.support.v4.app.LoaderManagerImpl[r4];
        r0 = r4 + -1;
        r2 = r0;
    L_0x0012:
        if (r2 < 0) goto L_0x0022;
    L_0x0014:
        r0 = r7.mAllLoaderManagers;
        r0 = r0.valueAt(r2);
        r0 = (android.support.v4.app.LoaderManagerImpl) r0;
        r5[r2] = r0;
        r0 = r2 + -1;
        if (r3 == 0) goto L_0x0047;
    L_0x0022:
        r0 = r1;
    L_0x0023:
        if (r1 >= r4) goto L_0x003c;
    L_0x0025:
        r2 = r5[r1];
        r6 = r2.mRetaining;
        if (r6 == 0) goto L_0x002e;
    L_0x002b:
        r0 = 1;
        if (r3 == 0) goto L_0x0038;
    L_0x002e:
        r2.doDestroy();	 Catch:{ IllegalStateException -> 0x0041 }
        r6 = r7.mAllLoaderManagers;	 Catch:{ IllegalStateException -> 0x0041 }
        r2 = r2.mWho;	 Catch:{ IllegalStateException -> 0x0041 }
        r6.remove(r2);	 Catch:{ IllegalStateException -> 0x0041 }
    L_0x0038:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0023;
    L_0x003c:
        if (r0 == 0) goto L_0x0045;
    L_0x003e:
        r0 = r7.mAllLoaderManagers;	 Catch:{ IllegalStateException -> 0x0043 }
    L_0x0040:
        return r0;
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = 0;
        goto L_0x0040;
    L_0x0047:
        r2 = r0;
        goto L_0x0012;
    L_0x0049:
        r0 = r1;
        goto L_0x003c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentHostCallback.retainLoaderNonConfig():android.support.v4.util.SimpleArrayMap");
    }
}
