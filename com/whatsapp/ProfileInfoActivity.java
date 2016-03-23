package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.fieldstats.k;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import java.util.Collection;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class ProfileInfoActivity extends DialogToastActivity implements tm {
    private static final String[] z;
    private boolean n;
    private l5 o;
    private TextEmojiLabel p;
    private final Handler q;
    private Runnable r;
    private Handler s;
    private View t;
    private TextEmojiLabel u;
    private ImageView v;
    private View w;

    static {
        String[] strArr = new String[8];
        String str = "HV2J\u0000TA4B\u000fW\u000b>^\fYP8";
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
                        i3 = 56;
                        break;
                    case at.g /*1*/:
                        i3 = 36;
                        break;
                    case at.i /*2*/:
                        i3 = 93;
                        break;
                    case at.o /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "YF2^\u001dQJ:\f\rMA}X\u0006\u0018J<X\u0000NA}@\u0000ZV<^\u0000]W}A\u0000KW4B\u000e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "YJ9^\u0006Q@sE\u0007LA3XGYG)E\u0006V\n\u001cx=yg\u0015s-yp\u001c";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "HV2J\u0000TA4B\u000fW\u000b>^\fYP8\u0003\u0007W\t0I";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "HV2J\u0000TA4B\u000fW\u000b9I\u001aLV2U";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "QW\u0002^\fKA)";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "xWs[\u0001YP.M\u0019H\n3I\u001d";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "[K3Z\fJW<X\u0000WJ.\f\u000bWQ3O\f\u0018P2\f\u0004YM3";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        switch (i) {
            case Y.p /*12*/:
                if (i2 == -1) {
                    if (intent != null && intent.getBooleanExtra(z[6], false)) {
                        this.t.setVisibility(0);
                        r.a(this.o, (Activity) this);
                        if (!z) {
                            return;
                        }
                    }
                    r.a(intent, this.o, this, 13, this);
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
            if (r.b(this.o, this)) {
                c();
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

    private void b() {
        App.a(App.ad() + z[7], 0, new Messenger(this.q));
    }

    private void e(@Nullable String str) {
        if (str == null) {
            this.w.setVisibility(8);
            return;
        }
        this.w.setVisibility(0);
        this.u.a(str);
    }

    static View c(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.t;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r10 = this;
        r9 = 4;
        r8 = 1;
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r6 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.t;
        r2 = 8;
        r0.setVisibility(r2);
        r0 = r10.getResources();
        r2 = 2131427532; // 0x7f0b00cc float:1.8476683E38 double:1.05306512E-314;
        r2 = r0.getDimensionPixelSize(r2);
        r0 = r10.o;
        r0 = r0.p;
        r0 = com.whatsapp.aw2.a(r0);
        if (r0 == 0) goto L_0x002f;
    L_0x0023:
        r0 = r10.v;
        r0.setEnabled(r6);
        r0 = r10.t;
        r0.setVisibility(r6);
        if (r1 == 0) goto L_0x0039;
    L_0x002f:
        r0 = r10.v;
        r0.setEnabled(r8);
        r0 = r10.t;
        r0.setVisibility(r9);
    L_0x0039:
        r0 = r10.o;
        r0 = r0.a(r2, r7, r6);
        if (r0 != 0) goto L_0x008a;
    L_0x0041:
        r0 = r10.o;
        r0 = r0.o;
        if (r0 != 0) goto L_0x007a;
    L_0x0047:
        r0 = r10.o;
        r0 = r0.c;
        if (r0 != 0) goto L_0x007a;
    L_0x004d:
        r0 = r10.t;
        r0.setVisibility(r6);
        r0 = r10.s;
        if (r0 != 0) goto L_0x0068;
    L_0x0056:
        r0 = new android.os.Handler;
        r3 = android.os.Looper.getMainLooper();
        r0.<init>(r3);
        r10.s = r0;
        r0 = new com.whatsapp.cm;
        r0.<init>(r10);
        r10.r = r0;
    L_0x0068:
        r0 = r10.s;
        r3 = r10.r;
        r0.removeCallbacks(r3);
        r0 = r10.s;
        r3 = r10.r;
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.postDelayed(r3, r4);
        if (r1 == 0) goto L_0x007f;
    L_0x007a:
        r0 = r10.t;
        r0.setVisibility(r9);
    L_0x007f:
        r0 = 2130837613; // 0x7f02006d float:1.7280185E38 double:1.0527736614E-314;
        r0 = com.whatsapp.l5.a(r0, r2, r7);
        r10.n = r6;
        if (r1 == 0) goto L_0x008c;
    L_0x008a:
        r10.n = r8;
    L_0x008c:
        r1 = r10.v;
        r1.setImageBitmap(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ProfileInfoActivity.c():void");
    }

    public ProfileInfoActivity() {
        this.q = new Handler(new amq(this));
    }

    static TextEmojiLabel e(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.p;
    }

    static ImageView d(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.v;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[5]);
        if (this.o != null) {
            App.a((tm) this);
        }
        if (this.s != null) {
            this.s.removeCallbacks(this.r);
        }
    }

    public void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        Log.i(z[0]);
        if (WhatsAppLibLoader.a(null)) {
            setContentView(2130903253);
            nf.a(k.PROFILE);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setDisplayHomeAsUpEnabled(true);
            }
            this.o = App.as.e();
            if (this.o == null) {
                Log.i(z[4]);
                App.v(z[1]);
                startActivity(new Intent(this, Main.class));
                finish();
                return;
            }
            this.p = (TextEmojiLabel) findViewById(2131755858);
            this.p.a(App.h((Context) this));
            findViewById(2131755860).setOnClickListener(new ig(this));
            this.v = (ImageView) findViewById(2131755426);
            this.v.setOnClickListener(new ud(this));
            View findViewById = findViewById(2131755804);
            findViewById.setOnClickListener(new f0(this));
            if (VERSION.SDK_INT >= 21 && bundle == null) {
                findViewById.setVisibility(4);
                getWindow().getSharedElementEnterTransition().addListener(new auo(this, findViewById));
            }
            this.t = findViewById(2131755497);
            c();
            ((TextView) findViewById(2131755338)).setText(this.o.s());
            findViewById(2131755861).setOnClickListener(new yy(this));
            this.w = findViewById(2131755448);
            this.u = (TextEmojiLabel) findViewById(2131755352);
            this.w.setOnClickListener(new zo(this));
            if (!App.S) {
                b();
            }
            e(App.v);
            App.b((tm) this);
            if (z[3].equals(getIntent().getAction())) {
                r.a(getIntent(), this.o, this, 13, this);
                return;
            }
            return;
        }
        Log.i(z[2]);
        finish();
    }

    public void c(String str) {
    }

    static void a(ProfileInfoActivity profileInfoActivity, String str) {
        profileInfoActivity.e(str);
    }

    public void b(String str) {
    }

    static l5 b(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.o;
    }

    public void a(Collection collection) {
    }

    static boolean a(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.n;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r3) {
        /*
        r2 = this;
        r0 = r3.getItemId();
        switch(r0) {
            case 16908332: goto L_0x000c;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.onOptionsItemSelected(r3);
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x0019;
    L_0x0012:
        r2.finishAfterTransition();
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x001c;
    L_0x0019:
        r2.finish();
    L_0x001c:
        r0 = 1;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ProfileInfoActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public void d(String str) {
        if (this.o != null && str.equals(this.o.p)) {
            this.o = App.as.e();
            c();
        }
    }

    public void a(String str) {
        runOnUiThread(new _j(this, str));
    }

    public void a() {
    }
}
