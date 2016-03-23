package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AlertDialog.Builder;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.MenuItem;
import android.widget.EditText;
import com.whatsapp.App.Me;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.ay;
import com.whatsapp.protocol.b5;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ChangeNumber extends EnterPhoneNumber {
    private static String D;
    private static String E;
    private static Handler F;
    private static GoogleDriveService I;
    private static String L;
    public static b5 N;
    public static Runnable O;
    private static String P;
    private static final String[] R;
    private final o6 G;
    private at6 H;
    private ay J;
    private b5 K;
    private Handler M;
    private Runnable Q;

    static ay b(ChangeNumber changeNumber) {
        return changeNumber.J;
    }

    public void onResume() {
        try {
            super.onResume();
            if (E != null) {
                this.H.e.setText(E);
            }
            RegisterPhone.a(this.H.e, this.H.f);
            RegisterPhone.a(this.H.c, this.H.h);
            RegisterPhone.a(this.v.e, this.v.f);
            RegisterPhone.a(this.v.c, this.v.h);
            Log.i(R[3]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static boolean g() {
        try {
            return App.ag() != null;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void k() {
        try {
            if (isFinishing()) {
                Log.i(R[36]);
                return;
            }
            z = null;
            y = 0;
            App.b(App.z(), VerifyNumber.b(z));
            String D = App.D(w + A);
            byte[] g = ve.g(D);
            if (g == null) {
                g = ve.d();
                ve.a(g, D);
            }
            bq.a(new a3r(this, this.Q, this.G), new byte[][]{w.getBytes(), A.getBytes(), g, null});
        } catch (NullPointerException e) {
            throw e;
        }
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case at.g /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131231749));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case at.i /*2*/:
                return new Builder(this).setMessage(2131230898).setPositiveButton(2131230858, new e2(this)).create();
            case arj.Theme_switchStyle /*109*/:
                return new Builder(this).setMessage(2131231791).setPositiveButton(2131230911, new akv(this)).setNegativeButton(2131230884, new asy(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static boolean a(ChangeNumber changeNumber, String str, String str2, at6 com_whatsapp_at6) {
        return changeNumber.a(str, str2, com_whatsapp_at6);
    }

    protected void onCreate(Bundle bundle) {
        Log.i(R[26]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(aam.a(getLayoutInflater(), 2130903092, null, false, new int[]{2131755413, 2131755417}));
        this.H = new at6();
        this.v = new at6();
        this.H.e = (EditText) findViewById(2131755414);
        this.v.e = (EditText) findViewById(2131755418);
        this.H.c = (EditText) findViewById(2131755415);
        this.v.c = (EditText) findViewById(2131755419);
        this.H.e.setFilters(new InputFilter[]{new LengthFilter(3)});
        this.H.c.setFilters(new InputFilter[]{new LengthFilter(17)});
        String networkCountryIso = App.W.getNetworkCountryIso();
        if (networkCountryIso != null) {
            try {
                E = u0.a(networkCountryIso);
            } catch (IOException e) {
                Log.e(R[28]);
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        try {
            this.H.e.addTextChangedListener(new a44(this, this.H));
            this.v.e.addTextChangedListener(new a44(this, this.v));
            this.H.c.requestFocus();
            this.H.h = RegisterPhone.a(this.H.c);
            this.H.f = RegisterPhone.a(this.H.e);
            this.v.h = RegisterPhone.a(this.v.c);
            this.v.f = RegisterPhone.a(this.v.e);
            akz.a(this, getSupportActionBar(), getString(2131231074).toUpperCase(), new yt(this));
            if (E != null) {
                this.H.e.setText(E);
                this.v.e.setText(E);
            }
            String str = this.H.d;
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        try {
                            Log.i(R[23] + str + R[24] + u0.d(str));
                        } catch (Throwable e3) {
                            Log.b(R[25] + str + R[27], e3);
                        }
                        a(str, this.H);
                        a(str, this.v);
                    }
                } catch (IOException e4) {
                    throw e4;
                } catch (NullPointerException e22) {
                    throw e22;
                }
            }
            this.B = a((Context) this);
        } catch (IOException e42) {
            throw e42;
        }
    }

    static Handler h() {
        return F;
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        E = bundle.getString(R[10]);
        L = bundle.getString(R[13]);
        w = bundle.getString(R[11]);
        A = bundle.getString(R[12]);
    }

    static b5 c(ChangeNumber changeNumber) {
        return changeNumber.K;
    }

    public void onPause() {
        super.onPause();
        Log.i(R[14]);
        this.H.h = RegisterPhone.a(this.H.c);
        this.H.f = RegisterPhone.a(this.H.e);
        this.v.h = RegisterPhone.a(this.v.c);
        this.v.f = RegisterPhone.a(this.v.e);
        String a = a((Context) this);
        try {
            if (this.B != null) {
                a((Context) this, w, A);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            if (a != null) {
                try {
                    b((Context) this);
                } catch (NullPointerException e) {
                    throw e;
                }
            }
        } catch (NullPointerException e2) {
            throw e2;
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    public static void b(Context context) {
        Editor edit = context.getSharedPreferences(R[29], 0).edit();
        try {
            edit.remove(R[31]);
            if (!edit.commit()) {
                Log.e(R[30]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void a(String str, at6 com_whatsapp_at6) {
        try {
            Log.i(R[21] + str + R[22] + u0.d(str));
        } catch (IOException e) {
            Log.e(R[19] + str + R[18] + e.toString());
        }
        try {
            if (com_whatsapp_at6.b != null) {
                com_whatsapp_at6.c.removeTextChangedListener(com_whatsapp_at6.b);
            }
            com_whatsapp_at6.b = new are(u0.d(str));
            com_whatsapp_at6.c.addTextChangedListener(com_whatsapp_at6.b);
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable e3) {
            Log.b(R[16], e3);
        } catch (Throwable e32) {
            Log.b(R[20] + str + R[17], e32);
        }
    }

    static String m() {
        return P;
    }

    public static void a(Context context, boolean z) {
        App.ae();
        aup.c();
        qm.a(true);
        l5 e = App.as.e();
        try {
            e.u();
            e.c(0, 0);
            App.S = false;
            if (z) {
                App.g(true);
            }
            MessageService.a(context, true, false, false, null, null);
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    protected void c(boolean z) {
        try {
            App.a((Context) this, w, A);
            if (z) {
                if (this.t) {
                    b();
                }
            }
            Me n = App.n((Context) this);
            try {
                boolean z2;
                n.jabber_id = App.A(App.z());
                if (n.jabber_id != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                try {
                    Log.b(z2);
                    if (App.b(n)) {
                        App.ay = n;
                        App.e(getApplication());
                        App.a3();
                        MessageService.b(App.z());
                        App.aY();
                        App.d((Context) this, 3);
                        ve.w();
                        a((Context) this, false);
                        finish();
                        return;
                    }
                    finish();
                } catch (NullPointerException e) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    public ChangeNumber() {
        this.Q = new amu(this);
        this.G = new fz(this);
        this.M = new ew(this, Looper.getMainLooper());
        this.J = new h1(this);
        this.K = new at5(this);
    }

    static String a(String str) {
        L = str;
        return str;
    }

    protected void onDestroy() {
        Log.i(R[15]);
        super.onDestroy();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(R[6], E);
        bundle.putCharSequence(R[8], L);
        bundle.putCharSequence(R[9], w);
        bundle.putCharSequence(R[7], A);
    }

    static GoogleDriveService a() {
        return I;
    }

    static Handler d(ChangeNumber changeNumber) {
        return changeNumber.M;
    }

    static at6 e(ChangeNumber changeNumber) {
        return changeNumber.H;
    }

    static {
        String[] strArr = new String[39];
        String str = "a1'8\u001fj?>e\tr.\u0015f\u001ag8/d\rl=/e";
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
                        i3 = 2;
                        break;
                    case at.g /*1*/:
                        i3 = 94;
                        break;
                    case at.i /*2*/:
                        i3 = 74;
                        break;
                    case at.o /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "a6+x\u000fg0?{\ng,etGq;>9\u000ec7&s\f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "a6+x\u000fg0?{\ng,ed\rq+'s";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "a6+x\u000fg0?{\ng,ed\rt;8bGo--e\u001cm,/r\n-6/w\u0004v63";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "a6+x\u000fg0?{\ng,ed\rt;8bEv1gy\u0004f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "a1?x\u001cp'\u0015u\u0007f;";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "q\u000e\"y\u0006g\u0010?{\ng,";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "r6%x\r]0?{\ng,";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "q\u001d%c\u0006v,3U\u0007f;";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "a1?x\u001cp'\u0015u\u0007f;";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "q\u001d%c\u0006v,3U\u0007f;";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "q\u000e\"y\u0006g\u0010?{\ng,";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "r6%x\r]0?{\ng,";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "a6+x\u000fg0?{\ng,ef\tw-/";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "a6+x\u000fg0?{\ng,er\rq*8y\u0011";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "a6+x\u000fg0?{\ng,ep\u0007p3+b\u001cg,gs\u0010a;:b\u0001m0";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\"=+c\u001bg:jw\u0006\"\u0017\u0005S\u0010a;:b\u0001m0";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "d?#z\rf~>yHn1%}\u001dr\u001d%c\u0006v,3W\n`,\bo&c3/6\u000ep1'6+m+$b\u001a{\u000e\"y\u0006g\u0017$p\u0007\"";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "a6+x\u000fg0?{\ng,eu\u0007w0>d\u00118~";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "a6+x\u000fg0?{\ng,eu\u0007w0>d\u00118";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "a6+x\u000fg0?{\ng,eu\u0007w0>d\u00118";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    str = "\"\"j";
                    obj = 21;
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    strArr2 = strArr3;
                    str = "a6+x\u000fg0?{\ng,eu\u0007w0>d\u00118";
                    obj = 22;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\"\"j";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "a6+x\u000fg0?{\ng,eu\u0007w0>d\u00118";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "a6+x\u000fg0?{\ng,eu\u001ag?>s";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\"8+\u007f\u0004g:jU\u0007w0>d\u0011R6%x\rK0,yFn1%}\u001dr\u001d%c\u0006v,3W\n`,\bo&c3/>A";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "a6+x\u000fg0?{\ng,e\u007f\u001bmq)y\fg~,w\u0001n;.6\u001cm~-s\u001c\"=%r\r\"88y\u0005\"\u001d%c\u0006v,3F\u0000m0/_\u0006d1";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "a1'8\u001fj?>e\tr.\u0015f\u001ag8/d\rl=/e";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "a6+x\u000fg0?{\ng,etGp;'y\u001egq,w\u0001n;.";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "a6+x\u000fg\u0001$c\u0005`;8I\u0006g)\u0015x\u001do</d7`?$x\rf";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "a6+x\u000fg0?{\ng,eu\u000b?";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "^\u001a";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "a6+x\u000fg0?{\ng,eu\u000b\"8+\u007f\u0004g:jb\u001ak3\u0006s\tf7$q2g,%6\u000ep1'6+m+$b\u001a{\u000e\"y\u0006g\u0017$p\u0007";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "-0?{\ng,w";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "a6+x\u000fg0?{\ng,e`\rp7,oGa?$u\rn";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "a6+x\u000fg\u0001$c\u0005`;8I\u0006g)\u0015x\u001do</d7`?$x\rf";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "a1'8\u001fj?>e\tr.\u0015f\u001ag8/d\rl=/e";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    R = strArr3;
                    E = null;
                    L = null;
                    P = null;
                    D = null;
                    I = null;
                    F = new q6(Looper.getMainLooper());
                    O = new ae5();
                    N = new sn();
                    return;
                default:
                    strArr2[i] = str;
                    str = "a6+x\u000fg\u0001$c\u0005`;8I\u0006g)\u0015x\u001do</d7`?$x\rf";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(ChangeNumber changeNumber) {
        changeNumber.k();
    }

    public static void a(Activity activity) {
        Log.i(R[5]);
        Me ag = App.ag();
        try {
            if (App.b(ag)) {
                App.ay = ag;
                try {
                    ve.b(ve.a(ag.jabber_id), ag.jabber_id);
                    VerifyNumber.a(false);
                    ve.o();
                    App.aT();
                    if (App.aK.c()) {
                        Log.i(R[4]);
                        App.aK.m();
                        App.e(App.z());
                        MessageService.b(App.z());
                        App.x();
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    }
                    MessageService.b(App.z());
                    return;
                } catch (NullPointerException e) {
                    throw e;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            activity.finish();
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    static String b() {
        return L;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    finish();
                    return true;
                default:
                    return false;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static String f(String str) {
        E = str;
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r7, java.lang.String r8, com.whatsapp.at6 r9) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = com.whatsapp.EnterPhoneNumber.a(r7, r8);
        switch(r3) {
            case 1: goto L_0x004f;
            case 2: goto L_0x00f2;
            case 3: goto L_0x00ef;
            case 4: goto L_0x00ed;
            case 5: goto L_0x00eb;
            case 6: goto L_0x00e9;
            case 7: goto L_0x00e7;
            default: goto L_0x000b;
        };
    L_0x000b:
        if (r1 == 0) goto L_0x004e;
    L_0x000d:
        r2 = java.lang.Integer.parseInt(r7);
        r0 = R;
        r3 = 33;
        r0 = r0[r3];
        r3 = "";
        r0 = r8.replaceAll(r0, r3);
        r0 = com.whatsapp.u0.a(r2, r0);	 Catch:{ IOException -> 0x00d8 }
    L_0x0022:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = R;
        r4 = 32;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r7);
        r3 = R;
        r4 = 35;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        w = r7;
        A = r0;
    L_0x004e:
        return r1;
    L_0x004f:
        if (r2 == 0) goto L_0x00e4;
    L_0x0051:
        r1 = 2131231738; // 0x7f0803fa float:1.8079565E38 double:1.052968385E-314;
        r6.a(r1);	 Catch:{ IOException -> 0x00cc }
        r1 = r9.e;	 Catch:{ IOException -> 0x00cc }
        r1.requestFocus();	 Catch:{ IOException -> 0x00cc }
        if (r2 == 0) goto L_0x00e4;
    L_0x005e:
        r1 = 2131231739; // 0x7f0803fb float:1.8079568E38 double:1.0529683856E-314;
        r6.a(r1);	 Catch:{ IOException -> 0x00ce }
        r1 = r9.e;	 Catch:{ IOException -> 0x00ce }
        r3 = "";
        r1.setText(r3);	 Catch:{ IOException -> 0x00ce }
        r1 = r9.e;	 Catch:{ IOException -> 0x00ce }
        r1.requestFocus();	 Catch:{ IOException -> 0x00ce }
        if (r2 == 0) goto L_0x00e4;
    L_0x0073:
        r1 = 2131231752; // 0x7f080408 float:1.8079594E38 double:1.052968392E-314;
        r6.a(r1);	 Catch:{ IOException -> 0x00d0 }
        r1 = r9.c;	 Catch:{ IOException -> 0x00d0 }
        r1.requestFocus();	 Catch:{ IOException -> 0x00d0 }
        if (r2 == 0) goto L_0x00e4;
    L_0x0080:
        r1 = 2131231744; // 0x7f080400 float:1.8079578E38 double:1.052968388E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x00d2 }
        r4 = 0;
        r5 = r9.d;	 Catch:{ IOException -> 0x00d2 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x00d2 }
        r1 = r6.getString(r1, r3);	 Catch:{ IOException -> 0x00d2 }
        r6.f(r1);	 Catch:{ IOException -> 0x00d2 }
        r1 = r9.c;	 Catch:{ IOException -> 0x00d2 }
        r1.requestFocus();	 Catch:{ IOException -> 0x00d2 }
        if (r2 == 0) goto L_0x00e4;
    L_0x0099:
        r1 = 2131231743; // 0x7f0803ff float:1.8079576E38 double:1.0529683875E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x00d4 }
        r4 = 0;
        r5 = r9.d;	 Catch:{ IOException -> 0x00d4 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x00d4 }
        r1 = r6.getString(r1, r3);	 Catch:{ IOException -> 0x00d4 }
        r6.f(r1);	 Catch:{ IOException -> 0x00d4 }
        r1 = r9.c;	 Catch:{ IOException -> 0x00d4 }
        r1.requestFocus();	 Catch:{ IOException -> 0x00d4 }
        if (r2 == 0) goto L_0x00e4;
    L_0x00b2:
        r1 = 2131231742; // 0x7f0803fe float:1.8079574E38 double:1.052968387E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ IOException -> 0x00d6 }
        r3 = 0;
        r4 = r9.d;	 Catch:{ IOException -> 0x00d6 }
        r2[r3] = r4;	 Catch:{ IOException -> 0x00d6 }
        r1 = r6.getString(r1, r2);	 Catch:{ IOException -> 0x00d6 }
        r6.f(r1);	 Catch:{ IOException -> 0x00d6 }
        r1 = r9.c;	 Catch:{ IOException -> 0x00d6 }
        r1.requestFocus();	 Catch:{ IOException -> 0x00d6 }
        r1 = r0;
        goto L_0x000b;
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r2 = move-exception;
        r3 = R;
        r4 = 34;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x0022;
    L_0x00e4:
        r1 = r0;
        goto L_0x000b;
    L_0x00e7:
        r0 = r1;
        goto L_0x00b2;
    L_0x00e9:
        r0 = r1;
        goto L_0x0099;
    L_0x00eb:
        r0 = r1;
        goto L_0x0080;
    L_0x00ed:
        r0 = r1;
        goto L_0x0073;
    L_0x00ef:
        r0 = r1;
        goto L_0x005e;
    L_0x00f2:
        r0 = r1;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ChangeNumber.a(java.lang.String, java.lang.String, com.whatsapp.at6):boolean");
    }

    static String n() {
        return E;
    }

    static String e(String str) {
        P = str;
        return str;
    }

    static String l() {
        return D;
    }

    static String d(String str) {
        D = str;
        return str;
    }

    public static void a(Context context, String str, String str2) {
        Editor edit = context.getSharedPreferences(R[0], 0).edit();
        try {
            edit.putString(R[1], "+" + str + str2);
            if (!edit.commit()) {
                Log.e(R[2]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static GoogleDriveService a(GoogleDriveService googleDriveService) {
        I = googleDriveService;
        return googleDriveService;
    }

    static void a(ChangeNumber changeNumber, String str, at6 com_whatsapp_at6) {
        changeNumber.a(str, com_whatsapp_at6);
    }

    public static String a(Context context) {
        return context.getSharedPreferences(R[38], 0).getString(R[37], null);
    }
}
