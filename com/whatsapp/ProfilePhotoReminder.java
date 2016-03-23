package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Date;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ProfilePhotoReminder extends DialogToastActivity implements tm {
    public static boolean p;
    private static long q;
    private static final String[] z;
    private EditText n;
    private Runnable o;
    private Handler r;
    private TextView s;
    private l5 t;
    private Bitmap u;
    private k3 v;
    private ImageView w;
    private View x;
    private a23 y;

    static View c(ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.x;
    }

    public void a(Collection collection) {
    }

    public static boolean g() {
        if (App.p.F()) {
            return false;
        }
        if (q < 0) {
            q = d();
        }
        if (q < 0) {
            return true;
        }
        if ((new Date(System.currentTimeMillis()).getTime() - new Date(q).getTime()) / 86400000 < 90) {
            return false;
        }
        return true;
    }

    public static void c() {
        p = true;
        b();
    }

    private static long d() {
        return App.z().getSharedPreferences(z[7], 0).getLong(z[6], -1);
    }

    public void b(String str) {
    }

    public void c(String str) {
    }

    public ProfilePhotoReminder() {
        this.y = new az4(this);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[1]);
        if (this.t != null) {
            App.a((tm) this);
        }
        if (this.r != null) {
            this.r.removeCallbacks(this.o);
        }
    }

    static l5 a(ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.t;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        switch (i) {
            case Y.p /*12*/:
                if (i2 == -1) {
                    if (intent != null && intent.getBooleanExtra(z[0], false)) {
                        this.x.setVisibility(0);
                        r.a(this.t, (Activity) this);
                        if (!z) {
                            return;
                        }
                    }
                    r.a(intent, this.t, this, 13, this);
                    if (!z) {
                        return;
                    }
                }
                return;
                break;
            case Y.q /*13*/:
                break;
            default:
                return;
        }
        r.a().delete();
        if (i2 == -1) {
            if (r.b(this.t, this)) {
                this.x.setVisibility(0);
                if (!z) {
                    return;
                }
            }
            return;
        }
        if (i2 == 0 && intent != null) {
            r.a(intent, (by) this);
        }
    }

    private void a(Bitmap bitmap) {
        this.w.setImageBitmap(bitmap);
    }

    public void a() {
    }

    public void a(String str) {
    }

    static EditText b(ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.n;
    }

    public void d(String str) {
        if (this.t != null && str.equals(this.t.p)) {
            this.t = App.as.e();
            f();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
        r6 = this;
        r5 = 25;
        r4 = 1;
        r0 = z;
        r1 = 9;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r7);
        r0 = r6.getSupportActionBar();
        r0.setDisplayShowCustomEnabled(r4);
        r0 = 2130903254; // 0x7f0300d6 float:1.741332E38 double:1.0528060924E-314;
        r6.setContentView(r0);
        r0 = com.whatsapp.App.as;
        r0 = r0.e();
        r6.t = r0;
        r0 = r6.t;
        if (r0 != 0) goto L_0x0048;
    L_0x0028:
        r0 = z;
        r1 = 8;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 10;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r6.finish();
    L_0x0047:
        return;
    L_0x0048:
        r0 = 2131755862; // 0x7f100356 float:1.9142615E38 double:1.0532273367E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r6.s = r0;
        r0 = 2131755630; // 0x7f10026e float:1.9142145E38 double:1.053227222E-314;
        r0 = r6.findViewById(r0);
        r1 = new com.whatsapp.aw3;
        r1.<init>(r6);
        r0.setOnClickListener(r1);
        r0 = new com.whatsapp.k3;
        r0.<init>(r6);
        r6.v = r0;
        r0 = r6.v;
        r1 = r6.y;
        r0.a(r1);
        r0 = 2131755804; // 0x7f10031c float:1.9142498E38 double:1.053227308E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r6.w = r0;
        r0 = new com.whatsapp.ux;
        r0.<init>(r6);
        r1 = r6.w;
        r1.setOnClickListener(r0);
        r0 = r6.getSupportActionBar();
        r1 = 2131231548; // 0x7f08033c float:1.807918E38 double:1.052968291E-314;
        r1 = r6.getString(r1);
        r2 = new com.whatsapp.ae9;
        r2.<init>(r6);
        com.whatsapp.akz.a(r6, r0, r1, r2);
        r0 = 2131755497; // 0x7f1001e9 float:1.9141875E38 double:1.0532271564E-314;
        r0 = r6.findViewById(r0);
        r6.x = r0;
        r6.f();
        r0 = 2131755858; // 0x7f100352 float:1.9142607E38 double:1.053227335E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r6.n = r0;
        r0 = r6.n;
        com.whatsapp.aam.a(r0);
        r0 = r6.n;
        r1 = new com.whatsapp.hu;
        r2 = r6.n;
        r3 = r6.s;
        r1.<init>(r2, r3, r5);
        r0.addTextChangedListener(r1);
        r0 = r6.n;
        r1 = new android.text.InputFilter[r4];
        r2 = 0;
        r3 = new com.whatsapp.aes;
        r3.<init>(r5);
        r1[r2] = r3;
        r0.setFilters(r1);
        r0 = com.whatsapp.App.h(r6);
        r1 = r6.n;
        r1.setText(r0);
        r1 = r6.n;
        com.whatsapp.aam.a(r1, r0);
        r0 = r6.n;
        r1 = r6.n;
        r1 = r1.length();
        r0.setSelection(r1);
        r0 = com.whatsapp.App.p;
        r0 = r0.F();
        if (r0 == 0) goto L_0x0102;
    L_0x00f2:
        r0 = z;
        r1 = 11;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r6.d();
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0114;
    L_0x0102:
        r0 = com.whatsapp.App.a4();
        if (r0 == 0) goto L_0x0114;
    L_0x0108:
        r0 = z;
        r1 = 12;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r6.f();
    L_0x0114:
        com.whatsapp.App.b(r6);
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ProfilePhotoReminder.onCreate(android.os.Bundle):void");
    }

    private static void b() {
        if (App.p.F()) {
            Log.w(z[3]);
            return;
        }
        q = System.currentTimeMillis();
        Editor edit = App.z().getSharedPreferences(z[2], 0).edit();
        edit.putLong(z[5], q);
        if (!edit.commit()) {
            Log.e(z[4] + q);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.v.a(configuration);
    }

    static k3 d(ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.v;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
        r7 = this;
        r6 = 4;
        r4 = 0;
        r0 = r7.x;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r7.getResources();
        r1 = 2131427540; // 0x7f0b00d4 float:1.84767E38 double:1.053065124E-314;
        r1 = r0.getDimensionPixelSize(r1);
        r0 = r7.getResources();
        r2 = 2131427358; // 0x7f0b001e float:1.847633E38 double:1.053065034E-314;
        r2 = r0.getDimension(r2);
        r0 = r7.t;
        r0 = r0.p;
        r0 = com.whatsapp.aw2.a(r0);
        if (r0 == 0) goto L_0x0045;
    L_0x0029:
        r0 = r7.w;
        r0.setEnabled(r4);
        r0 = r7.x;
        r0.setVisibility(r4);
        r0 = r7.u;
        if (r0 != 0) goto L_0x003f;
    L_0x0037:
        r0 = android.graphics.Bitmap.Config.ALPHA_8;
        r0 = android.graphics.Bitmap.createBitmap(r1, r1, r0);
        r7.u = r0;
    L_0x003f:
        r0 = r7.u;
    L_0x0041:
        r7.a(r0);
        return;
    L_0x0045:
        r0 = r7.w;
        r3 = 1;
        r0.setEnabled(r3);
        r0 = r7.x;
        r0.setVisibility(r6);
        r0 = r7.t;
        r0 = r0.a(r1, r2, r4);
        if (r0 != 0) goto L_0x0041;
    L_0x0058:
        r0 = r7.t;
        r0 = r0.o;
        if (r0 != 0) goto L_0x0093;
    L_0x005e:
        r0 = r7.t;
        r0 = r0.c;
        if (r0 != 0) goto L_0x0093;
    L_0x0064:
        r0 = r7.x;
        r0.setVisibility(r4);
        r0 = r7.r;
        if (r0 != 0) goto L_0x007f;
    L_0x006d:
        r0 = new android.os.Handler;
        r3 = android.os.Looper.getMainLooper();
        r0.<init>(r3);
        r7.r = r0;
        r0 = new com.whatsapp.i3;
        r0.<init>(r7);
        r7.o = r0;
    L_0x007f:
        r0 = r7.r;
        r3 = r7.o;
        r0.removeCallbacks(r3);
        r0 = r7.r;
        r3 = r7.o;
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.postDelayed(r3, r4);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0098;
    L_0x0093:
        r0 = r7.x;
        r0.setVisibility(r6);
    L_0x0098:
        r0 = 2130837611; // 0x7f02006b float:1.728018E38 double:1.0527736605E-314;
        r0 = com.whatsapp.l5.a(r0, r1, r2);
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ProfilePhotoReminder.f():void");
    }

    static {
        String[] strArr = new String[13];
        String str = "pW$4DjA\u000f";
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
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 36;
                        break;
                    case at.i /*2*/:
                        i3 = 123;
                        break;
                    case at.o /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "zK\u0016hVqE\u000f5@iT$6S|B\u001e4DwG\u001e5";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "iV\u0014 HuA\u000b.NmK\t#LpJ\u001f#S6W\u001a0DuE\b2S|I\u0012(E|V\u000f/L|W\u000f'Li\u000b\u0018*NzO[/R9S\t)O~\b[(Nm\u0004\b'WpJ\u001cfMxW\u000ffQkK\u001d/M|\u0004\u000b.NmK[4DtM\u0015\"Dk\u0004\u000f/L|";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "iV\u0014 HuA\u000b.NmK\t#LpJ\u001f#S6W\u001a0DuE\b2S|I\u0012(E|V\u000f/L|W\u000f'Li\u000b\u001d'HuA\u001ffUv\u0004\b'W|\u0004\t#LpJ\u001f#S9P\u0012+D9K\u001df";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "nE$*@jP$4DtM\u0015\"Dk{\u000f/L|W\u000f'Li";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "nE$*@jP$4DtM\u0015\"Dk{\u000f/L|W\u000f'Li";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "zK\u0016hVqE\u000f5@iT$6S|B\u001e4DwG\u001e5";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "iV\u0014 HuA\u000b.NmK\t#LpJ\u001f#S6G\t#@mAT(N4I\u001e";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "iV\u0014 HuA\u000b.NmK\t#LpJ\u001f#S6G\t#@mA";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "zK\u00150DkW\u001a2HvJ\bfCvQ\u0015%D9P\u0014fLxM\u0015";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "iV\u0014 HuA\u000b.NmK\t#LpJ\u001f#S6G\u0017)Br\t\f4NwC";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "iV\u0014 HuA\u000b.NmK\t#LpJ\u001f#S6W\fkDaT\u00124D}";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    q = -1;
                    return;
                default:
                    strArr2[i] = str;
                    str = "iV\u0014 HuA\u000b.NmK\t#LpJ\u001f#S6@\u001e5UkK\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
