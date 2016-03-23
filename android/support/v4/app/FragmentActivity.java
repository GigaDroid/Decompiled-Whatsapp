package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback;
import android.support.v4.app.ActivityCompatApi23.RequestPermissionsRequestCodeValidator;
import android.support.v4.util.SimpleArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class FragmentActivity extends BaseFragmentActivityHoneycomb implements OnRequestPermissionsResultCallback, RequestPermissionsRequestCodeValidator {
    public static int a;
    private static final String[] z;
    boolean mCreated;
    final FragmentController mFragments;
    final Handler mHandler;
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;

    class 1 extends Handler {
        final FragmentActivity this$0;

        1(FragmentActivity fragmentActivity) {
            this.this$0 = fragmentActivity;
        }

        public void handleMessage(Message message) {
            boolean z = Fragment.a;
            switch (message.what) {
                case at.g /*1*/:
                    if (this.this$0.mStopped) {
                        this.this$0.doReallyStop(false);
                        if (!z) {
                            return;
                        }
                    }
                    return;
                    break;
                case at.i /*2*/:
                    break;
            }
            this.this$0.onResumeFragments();
            this.this$0.mFragments.execPendingActions();
            if (z) {
                super.handleMessage(message);
            }
        }
    }

    class HostCallbacks extends FragmentHostCallback {
        final FragmentActivity this$0;

        public int onGetWindowAnimations() {
            Window window = this.this$0.getWindow();
            return window == null ? 0 : window.getAttributes().windowAnimations;
        }

        @Nullable
        public View onFindViewById(int i) {
            return this.this$0.findViewById(i);
        }

        public void onAttachFragment(Fragment fragment) {
            this.this$0.onAttachFragment(fragment);
        }

        public HostCallbacks(FragmentActivity fragmentActivity) {
            this.this$0 = fragmentActivity;
            super(fragmentActivity);
        }

        public LayoutInflater onGetLayoutInflater() {
            return this.this$0.getLayoutInflater().cloneInContext(this.this$0);
        }

        public boolean onHasView() {
            Window window = this.this$0.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i) {
            this.this$0.startActivityFromFragment(fragment, intent, i);
        }

        public void onSupportInvalidateOptionsMenu() {
            this.this$0.supportInvalidateOptionsMenu();
        }

        public void onDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            this.this$0.dump(str, fileDescriptor, printWriter, strArr);
        }

        public boolean onHasWindowAnimations() {
            return this.this$0.getWindow() != null;
        }

        public boolean onShouldSaveFragmentState(Fragment fragment) {
            return !this.this$0.isFinishing();
        }
    }

    final class NonConfigurationInstances {
        Object custom;
        List fragments;
        SimpleArrayMap loaders;

        NonConfigurationInstances() {
        }
    }

    static {
        String[] strArr = new String[27];
        String str = "Jp?Rpg}(Rjztq\u001ep~t#R.?13\u001bkz17\u001dm)c4\u0003jlb%1pmt";
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
                        i3 = 9;
                        break;
                    case at.g /*1*/:
                        i3 = 17;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
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
                    str = ")1";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ")|\u0002\u0006pya4\u0016\"";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "dR#\u0017~}t5O";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ")1";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "E~2\u0013s)W#\u0013xdt?\u0006^je8\u0004v}hq";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ")B%\u0013kl+";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "_x4\u0005?Ax4\u0000~{r9\u000b%";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = ")|\u0003\u0017~e}(!kfa!\u0017{4";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = ")1";
                    obj = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "gd=\u001e";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "Jp?Rpg}(Rjztq\u001ep~t#R')s8\u0006l)w>\u0000?{t \u0007zze\u0012\u001d{l";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "ha!";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "h\u007f5\u0000p`u";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ")2";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "Jp?Rpg}(Rjztq\u001ep~t#R.?13\u001bkz17\u001dm)c4\u0003jlb%1pmt";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    str = "Oc0\u0015rl\u007f%3|}x'\u001bkp";
                    obj = 16;
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    strArr2 = strArr3;
                    str = "Hr%\u001bi`e(Rmlb$\u001ek)\u007f>Ry{p6\u001fzgeq\u0017g`b%\u0001?o~#Rvgu4\n%)!)";
                    obj = 17;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "Oc0\u0015rl\u007f%3|}x'\u001bkp";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "Hr%\u001bi`e(Rmlb$\u001ek)w#\u0013xdt?\u0006?`\u007f5\u0017g)~$\u0006?fwq\u0000~gv4H?9i";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "h\u007f5\u0000p`uk\u0001jya>\u0000k3w#\u0013xdt?\u0006l";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "h\u007f5\u0000p`uk\u0001jya>\u0000k3w#\u0013xdt?\u0006l";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "Oc0\u0015rl\u007f%3|}x'\u001bkp";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "Hr%\u001bi`e(Rmlb$\u001ek)w#\u0013xdt?\u0006?`\u007f5\u0017g)~$\u0006?fwq\u0000~gv4H?9i";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "Oc0\u0015rl\u007f%3|}x'\u001bkp";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "Hr%\u001bi`e(Rmlb$\u001ek)\u007f>Ry{p6\u001fzgeq\u0017g`b%\u0001?o~#Rvgu4\n%)!)";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "dC4\u0001jdt5O";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.dispatchConfigurationChanged(configuration);
    }

    public void supportInvalidateOptionsMenu() {
        try {
            if (VERSION.SDK_INT >= 11) {
                ActivityCompatHoneycomb.invalidateOptionsMenu(this);
            } else {
                this.mOptionsMenuInvalidated = true;
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    protected void onCreate(@Nullable Bundle bundle) {
        this.mFragments.attachHost(null);
        super.onCreate(bundle);
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            try {
                this.mFragments.restoreLoaderNonConfig(nonConfigurationInstances.loaders);
            } catch (NotFoundException e) {
                throw e;
            }
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable(z[21]);
            try {
                List list;
                FragmentController fragmentController = this.mFragments;
                if (nonConfigurationInstances != null) {
                    list = nonConfigurationInstances.fragments;
                } else {
                    list = null;
                }
                fragmentController.restoreAllState(parcelable, list);
            } catch (NotFoundException e2) {
                throw e2;
            }
        }
        this.mFragments.dispatchCreate();
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case v.m /*0*/:
                try {
                    this.mFragments.dispatchOptionsMenuClosed(menu);
                    break;
                } catch (NotFoundException e) {
                    throw e;
                }
        }
        super.onPanelClosed(i, menu);
    }

    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition(this);
    }

    public final Object onRetainNonConfigurationInstance() {
        try {
            if (this.mStopped) {
                doReallyStop(true);
            }
            Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
            List retainNonConfig = this.mFragments.retainNonConfig();
            SimpleArrayMap retainLoaderNonConfig = this.mFragments.retainLoaderNonConfig();
            if (retainNonConfig == null && retainLoaderNonConfig == null && onRetainCustomNonConfigurationInstance == null) {
                return null;
            }
            Object nonConfigurationInstances = new NonConfigurationInstances();
            nonConfigurationInstances.custom = onRetainCustomNonConfigurationInstance;
            nonConfigurationInstances.fragments = retainNonConfig;
            nonConfigurationInstances.loaders = retainLoaderNonConfig;
            return nonConfigurationInstances;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public final void validateRequestPermissionsRequestCode(int i) {
        try {
            if (this.mRequestedPermissionsFromFragment) {
                this.mRequestedPermissionsFromFragment = false;
                if (!Fragment.a) {
                    return;
                }
            }
            if ((i & -256) != 0) {
                try {
                    throw new IllegalArgumentException(z[12]);
                } catch (NotFoundException e) {
                    throw e;
                }
            }
        } catch (NotFoundException e2) {
            throw e2;
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    protected void onResumeFragments() {
        this.mFragments.dispatchResume();
    }

    protected void onPause() {
        try {
            super.onPause();
            this.mResumed = false;
            if (this.mHandler.hasMessages(2)) {
                this.mHandler.removeMessages(2);
                onResumeFragments();
            }
            this.mFragments.dispatchPause();
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        try {
            if (this.mOptionsMenuInvalidated) {
                this.mOptionsMenuInvalidated = false;
                menu.clear();
                onCreatePanelMenu(i, menu);
            }
            return onPrepareOptionsPanel(view, menu) | this.mFragments.dispatchPrepareOptionsMenu(menu);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        if (VERSION.SDK_INT >= 11) {
            printWriter.print(str);
            printWriter.print(z[6]);
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(z[7]);
            str2 = str + z[2];
            printWriter.print(str2);
            printWriter.print(z[4]);
            printWriter.print(this.mCreated);
            printWriter.print(z[1]);
            printWriter.print(this.mResumed);
            printWriter.print(z[3]);
            printWriter.print(this.mStopped);
            printWriter.print(z[9]);
            printWriter.println(this.mReallyStopped);
            this.mFragments.dumpLoaders(str2, fileDescriptor, printWriter, strArr);
            this.mFragments.getSupportFragmentManager().dump(str, fileDescriptor, printWriter, strArr);
            printWriter.print(str);
            printWriter.println(z[8]);
            dumpViewHierarchy(str + z[5], printWriter, getWindow().getDecorView());
        } else {
            printWriter.print(str);
            printWriter.print(z[6]);
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(z[7]);
            str2 = str + z[2];
            printWriter.print(str2);
            printWriter.print(z[4]);
            printWriter.print(this.mCreated);
            printWriter.print(z[1]);
            printWriter.print(this.mResumed);
            printWriter.print(z[3]);
            printWriter.print(this.mStopped);
            printWriter.print(z[9]);
            printWriter.println(this.mReallyStopped);
            this.mFragments.dumpLoaders(str2, fileDescriptor, printWriter, strArr);
            this.mFragments.getSupportFragmentManager().dump(str, fileDescriptor, printWriter, strArr);
            printWriter.print(str);
            printWriter.println(z[8]);
            dumpViewHierarchy(str + z[5], printWriter, getWindow().getDecorView());
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int i2 = (i >> 8) & 255;
        if (i2 != 0) {
            i2--;
            int activeFragmentsCount = this.mFragments.getActiveFragmentsCount();
            if (activeFragmentsCount == 0 || i2 < 0 || i2 >= activeFragmentsCount) {
                try {
                    Log.w(z[17], z[20] + Integer.toHexString(i));
                    return;
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            Fragment fragment = (Fragment) this.mFragments.getActiveFragments(new ArrayList(activeFragmentsCount)).get(i2);
            if (fragment == null) {
                try {
                    Log.w(z[19], z[18] + Integer.toHexString(i));
                    if (!Fragment.a) {
                        return;
                    }
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
            fragment.onRequestPermissionsResult(i & 255, strArr, iArr);
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        doReallyStop(false);
        this.mFragments.dispatchDestroy();
        this.mFragments.doLoaderDestroy();
    }

    void doReallyStop(boolean z) {
        try {
            if (!this.mReallyStopped) {
                this.mReallyStopped = true;
                this.mRetaining = z;
                this.mHandler.removeMessages(1);
                onReallyStop();
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.dispatchLowMemory();
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.startPostponedEnterTransition(this);
    }

    public void onBackPressed() {
        try {
            if (!this.mFragments.getSupportFragmentManager().popBackStackImmediate()) {
                supportFinishAfterTransition();
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    protected void onStart() {
        try {
            super.onStart();
            this.mStopped = false;
            this.mReallyStopped = false;
            this.mHandler.removeMessages(1);
            if (!this.mCreated) {
                this.mCreated = true;
                this.mFragments.dispatchActivityCreated();
            }
            this.mFragments.noteStateNotSaved();
            this.mFragments.execPendingActions();
            this.mFragments.doLoaderStart();
            this.mFragments.dispatchStart();
            this.mFragments.reportLoaderStart();
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (i == -1 || (-65536 & i) == 0) {
            super.startActivityForResult(intent, i);
            return;
        }
        try {
            throw new IllegalArgumentException(z[0]);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String viewToString(android.view.View r8) {
        /*
        r2 = 86;
        r1 = 70;
        r7 = 44;
        r6 = 32;
        r0 = 46;
        r4 = android.support.v4.app.Fragment.a;
        r5 = new java.lang.StringBuilder;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r5.<init>(r3);
        r3 = r8.getClass();	 Catch:{ NotFoundException -> 0x0144 }
        r3 = r3.getName();	 Catch:{ NotFoundException -> 0x0144 }
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0144 }
        r3 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0144 }
        r3 = java.lang.System.identityHashCode(r8);	 Catch:{ NotFoundException -> 0x0144 }
        r3 = java.lang.Integer.toHexString(r3);	 Catch:{ NotFoundException -> 0x0144 }
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0144 }
        r3 = 32;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0144 }
        r3 = r8.getVisibility();	 Catch:{ NotFoundException -> 0x0144 }
        switch(r3) {
            case 0: goto L_0x012d;
            case 4: goto L_0x0134;
            case 8: goto L_0x013b;
            default: goto L_0x003a;
        };
    L_0x003a:
        r3 = 46;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x014a }
    L_0x003f:
        r3 = r8.isFocusable();	 Catch:{ NotFoundException -> 0x014c }
        if (r3 == 0) goto L_0x014e;
    L_0x0045:
        r3 = r1;
    L_0x0046:
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0151 }
        r3 = r8.isEnabled();	 Catch:{ NotFoundException -> 0x0151 }
        if (r3 == 0) goto L_0x0153;
    L_0x004f:
        r3 = 69;
    L_0x0051:
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0156 }
        r3 = r8.willNotDraw();	 Catch:{ NotFoundException -> 0x0156 }
        if (r3 == 0) goto L_0x0158;
    L_0x005a:
        r3 = r0;
    L_0x005b:
        r5.append(r3);	 Catch:{ NotFoundException -> 0x015c }
        r3 = r8.isHorizontalScrollBarEnabled();	 Catch:{ NotFoundException -> 0x015c }
        if (r3 == 0) goto L_0x015e;
    L_0x0064:
        r3 = 72;
    L_0x0066:
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0161 }
        r3 = r8.isVerticalScrollBarEnabled();	 Catch:{ NotFoundException -> 0x0161 }
        if (r3 == 0) goto L_0x0163;
    L_0x006f:
        r5.append(r2);	 Catch:{ NotFoundException -> 0x0166 }
        r2 = r8.isClickable();	 Catch:{ NotFoundException -> 0x0166 }
        if (r2 == 0) goto L_0x0168;
    L_0x0078:
        r2 = 67;
    L_0x007a:
        r5.append(r2);	 Catch:{ NotFoundException -> 0x016b }
        r2 = r8.isLongClickable();	 Catch:{ NotFoundException -> 0x016b }
        if (r2 == 0) goto L_0x016d;
    L_0x0083:
        r2 = 76;
    L_0x0085:
        r5.append(r2);	 Catch:{ NotFoundException -> 0x0170 }
        r2 = 32;
        r5.append(r2);	 Catch:{ NotFoundException -> 0x0170 }
        r2 = r8.isFocused();	 Catch:{ NotFoundException -> 0x0170 }
        if (r2 == 0) goto L_0x0172;
    L_0x0093:
        r5.append(r1);	 Catch:{ NotFoundException -> 0x0175 }
        r1 = r8.isSelected();	 Catch:{ NotFoundException -> 0x0175 }
        if (r1 == 0) goto L_0x0177;
    L_0x009c:
        r1 = 83;
    L_0x009e:
        r5.append(r1);	 Catch:{ NotFoundException -> 0x017a }
        r1 = r8.isPressed();	 Catch:{ NotFoundException -> 0x017a }
        if (r1 == 0) goto L_0x00a9;
    L_0x00a7:
        r0 = 80;
    L_0x00a9:
        r5.append(r0);
        r5.append(r6);
        r0 = r8.getLeft();
        r5.append(r0);
        r5.append(r7);
        r0 = r8.getTop();
        r5.append(r0);
        r0 = 45;
        r5.append(r0);
        r0 = r8.getRight();
        r5.append(r0);
        r5.append(r7);
        r0 = r8.getBottom();
        r5.append(r0);
        r1 = r8.getId();
        r0 = -1;
        if (r1 == r0) goto L_0x0122;
    L_0x00dd:
        r0 = z;
        r2 = 15;
        r0 = r0[r2];
        r5.append(r0);
        r0 = java.lang.Integer.toHexString(r1);
        r5.append(r0);
        r2 = r8.getResources();
        if (r1 == 0) goto L_0x0122;
    L_0x00f3:
        if (r2 == 0) goto L_0x0122;
    L_0x00f5:
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0 = r0 & r1;
        switch(r0) {
            case 16777216: goto L_0x0184;
            case 2130706432: goto L_0x017c;
            default: goto L_0x00fb;
        };
    L_0x00fb:
        r0 = r2.getResourcePackageName(r1);	 Catch:{ NotFoundException -> 0x018e }
    L_0x00ff:
        r3 = r2.getResourceTypeName(r1);	 Catch:{ NotFoundException -> 0x018e }
        r1 = r2.getResourceEntryName(r1);	 Catch:{ NotFoundException -> 0x018e }
        r2 = " ";
        r5.append(r2);	 Catch:{ NotFoundException -> 0x018e }
        r5.append(r0);	 Catch:{ NotFoundException -> 0x018e }
        r0 = ":";
        r5.append(r0);	 Catch:{ NotFoundException -> 0x018e }
        r5.append(r3);	 Catch:{ NotFoundException -> 0x018e }
        r0 = "/";
        r5.append(r0);	 Catch:{ NotFoundException -> 0x018e }
        r5.append(r1);	 Catch:{ NotFoundException -> 0x018e }
    L_0x0122:
        r0 = "}";
        r5.append(r0);
        r0 = r5.toString();
        return r0;
    L_0x012d:
        r3 = 86;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0144 }
        if (r4 == 0) goto L_0x003f;
    L_0x0134:
        r3 = 73;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0146 }
        if (r4 == 0) goto L_0x003f;
    L_0x013b:
        r3 = 71;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0148 }
        if (r4 == 0) goto L_0x003f;
    L_0x0142:
        goto L_0x003a;
    L_0x0144:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0146 }
    L_0x0146:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0148 }
    L_0x0148:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x014a }
    L_0x014a:
        r0 = move-exception;
        throw r0;
    L_0x014c:
        r0 = move-exception;
        throw r0;
    L_0x014e:
        r3 = r0;
        goto L_0x0046;
    L_0x0151:
        r0 = move-exception;
        throw r0;
    L_0x0153:
        r3 = r0;
        goto L_0x0051;
    L_0x0156:
        r0 = move-exception;
        throw r0;
    L_0x0158:
        r3 = 68;
        goto L_0x005b;
    L_0x015c:
        r0 = move-exception;
        throw r0;
    L_0x015e:
        r3 = r0;
        goto L_0x0066;
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r2 = r0;
        goto L_0x006f;
    L_0x0166:
        r0 = move-exception;
        throw r0;
    L_0x0168:
        r2 = r0;
        goto L_0x007a;
    L_0x016b:
        r0 = move-exception;
        throw r0;
    L_0x016d:
        r2 = r0;
        goto L_0x0085;
    L_0x0170:
        r0 = move-exception;
        throw r0;
    L_0x0172:
        r1 = r0;
        goto L_0x0093;
    L_0x0175:
        r0 = move-exception;
        throw r0;
    L_0x0177:
        r1 = r0;
        goto L_0x009e;
    L_0x017a:
        r0 = move-exception;
        throw r0;
    L_0x017c:
        r0 = z;	 Catch:{ NotFoundException -> 0x018e }
        r3 = 13;
        r0 = r0[r3];	 Catch:{ NotFoundException -> 0x018e }
        if (r4 == 0) goto L_0x00ff;
    L_0x0184:
        r0 = z;	 Catch:{ NotFoundException -> 0x018e }
        r3 = 14;
        r0 = r0[r3];	 Catch:{ NotFoundException -> 0x018e }
        if (r4 == 0) goto L_0x00ff;
    L_0x018c:
        goto L_0x00fb;
    L_0x018e:
        r0 = move-exception;
        goto L_0x0122;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentActivity.viewToString(android.view.View):java.lang.String");
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable saveAllState = this.mFragments.saveAllState();
        if (saveAllState != null) {
            try {
                bundle.putParcelable(z[22], saveAllState);
            } catch (NotFoundException e) {
                throw e;
            }
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        try {
            if (super.onMenuItemSelected(i, menuItem)) {
                return true;
            }
            switch (i) {
                case v.m /*0*/:
                    try {
                        return this.mFragments.dispatchOptionsItemSelected(menuItem);
                    } catch (NotFoundException e) {
                        throw e;
                    }
                case Y.f /*6*/:
                    return this.mFragments.dispatchContextItemSelected(menuItem);
                default:
                    return false;
            }
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    void onReallyStop() {
        this.mFragments.doLoaderStop(this.mRetaining);
        this.mFragments.dispatchReallyStop();
    }

    protected void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        onResumeFragments();
        this.mFragments.execPendingActions();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (VERSION.SDK_INT < 5 && i == 4) {
                try {
                    if (keyEvent.getRepeatCount() == 0) {
                        onBackPressed();
                        return true;
                    }
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            return super.onKeyDown(i, keyEvent);
        } catch (NotFoundException e2) {
            throw e2;
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    protected void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.execPendingActions();
    }

    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        this.mHandler.sendEmptyMessage(1);
        this.mFragments.dispatchStop();
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.onCreateView(view, str, context, attributeSet);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.noteStateNotSaved();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        if (i == -1) {
            try {
                super.startActivityForResult(intent, -1);
            } catch (NotFoundException e) {
                throw e;
            }
        } else if ((-65536 & i) != 0) {
            try {
                throw new IllegalArgumentException(z[16]);
            } catch (NotFoundException e2) {
                throw e2;
            }
        } else {
            super.startActivityForResult(intent, ((fragment.mIndex + 1) << 16) + (65535 & i));
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    private void dumpViewHierarchy(String str, PrintWriter printWriter, View view) {
        boolean z = Fragment.a;
        try {
            printWriter.print(str);
            if (view == null) {
                printWriter.println(z[11]);
                return;
            }
            try {
                printWriter.println(viewToString(view));
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    if (childCount > 0) {
                        String str2 = str + z[10];
                        int i = 0;
                        while (i < childCount) {
                            dumpViewHierarchy(str2, printWriter, viewGroup.getChildAt(i));
                            i++;
                            if (z) {
                                return;
                            }
                        }
                    }
                }
            } catch (NotFoundException e) {
                throw e;
            }
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        try {
            return VERSION.SDK_INT >= 11 ? super.onCreatePanelMenu(i, menu) | this.mFragments.dispatchCreateOptionsMenu(menu, getMenuInflater()) : true;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.postponeEnterTransition(this);
    }

    public LoaderManager getSupportLoaderManager() {
        return this.mFragments.getSupportLoaderManager();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.noteStateNotSaved();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            int activeFragmentsCount = this.mFragments.getActiveFragmentsCount();
            if (activeFragmentsCount == 0 || i3 < 0 || i3 >= activeFragmentsCount) {
                try {
                    Log.w(z[25], z[24] + Integer.toHexString(i));
                    return;
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            Fragment fragment = (Fragment) this.mFragments.getActiveFragments(new ArrayList(activeFragmentsCount)).get(i3);
            if (fragment == null) {
                try {
                    Log.w(z[23], z[26] + Integer.toHexString(i));
                    if (!Fragment.a) {
                        return;
                    }
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
            fragment.onActivityResult(65535 & i, i2, intent);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public FragmentActivity() {
        this.mHandler = new 1(this);
        this.mFragments = FragmentController.createController(new HostCallbacks(this));
    }
}
