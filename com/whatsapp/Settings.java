package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.widget.ImageView;
import com.whatsapp.fieldstats.k;
import com.whatsapp.util.Log;
import java.util.Collection;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class Settings extends DialogToastActivity implements tm, OnSharedPreferenceChangeListener {
    private static final String[] z;
    private TextEmojiLabel n;
    private l5 o;
    private final Handler p;
    private a2_ q;
    private TextEmojiLabel r;
    private boolean s;
    private ImageView t;
    private int u;

    static {
        String[] strArr = new String[9];
        String str = "J^.z\u0005AP7'\u0013YA\u001c$\u0000LW&&\u0017GR&'";
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
                        i3 = 41;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 67;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 114;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "ZT7 \u001bGV0{\u0011[T\" \u0017\u0006_,y\u001fL";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "O^17\u0017Mn/5\u001cND\"3\u0017";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "iBm#\u001aHE05\u0002Y\u001f-1\u0006";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "YC,2\u001bET*:\u0014F\u001e'1\u0001]C,-";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "J^.z\u0005AP7'\u0013YA\u001c$\u0000LW&&\u0017GR&'";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "HD7;\u001fHE*;\u001cvE,'-\\A'5\u0006Ln0 \u0013NT";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "HD7;\u001fHE*;\u001cvE,'-\\A'5\u0006Ln0 \u0013NT";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "J^-\"\u0017[B\" \u001bF_0t\u0010FD-7\u0017\tE,t\u001fHX-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static TextEmojiLabel b(Settings settings) {
        return settings.r;
    }

    private void d() {
        App.a(App.ad() + z[4], 0, new Messenger(this.p));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.j == 3) {
            Intent intent;
            switch (i) {
                case arj.Theme_actionModeBackground /*29*/:
                    intent = new Intent(this, TosUpdateActivity.class);
                    intent.putExtra(z[8], 1);
                    startActivity(intent);
                    return true;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    intent = new Intent(this, TosUpdateActivity.class);
                    intent.putExtra(z[7], 2);
                    startActivity(intent);
                    return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public Settings() {
        this.p = new Handler(new _2(this));
    }

    public void a(Collection collection) {
    }

    static ImageView a(Settings settings) {
        return settings.t;
    }

    public void a() {
    }

    private void b() {
        if (this.o != null) {
            this.q.b(this.o, this.t);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.t.setImageBitmap(l5.a(2130837613, this.u, -1.0f));
    }

    public void b(String str) {
    }

    private void c() {
        finish();
        startActivity(getIntent());
    }

    public void a(String str) {
        runOnUiThread(new a8(this, str));
    }

    protected void onResume() {
        if (this.s) {
            this.s = false;
            c();
        }
        super.onResume();
        this.n.a(App.h((Context) this));
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (z[3].equals(str)) {
            this.s = true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[5]);
        App.a((tm) this);
        if (this.q != null) {
            this.q.a();
        }
        App.z().getSharedPreferences(z[6], 0).unregisterOnSharedPreferenceChangeListener(this);
    }

    public void c(String str) {
    }

    public void d(String str) {
        if (this.o != null && str.equals(this.o.p)) {
            this.o = App.as.e();
            b();
        }
    }

    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        nf.a(k.SETTINGS);
        setContentView(aam.a(getLayoutInflater(), 2130903251, null, false));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(getString(2131231968));
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        this.o = App.as.e();
        if (this.o == null) {
            Log.i(z[2]);
            App.v(z[1]);
            startActivity(new Intent(this, Main.class));
            finish();
            return;
        }
        this.u = getResources().getDimensionPixelSize(2131427533);
        this.q = new a2_(this.u, -1.0f);
        this.t = (ImageView) findViewById(2131755848);
        this.t.setVisibility(0);
        this.n = (TextEmojiLabel) findViewById(2131755849);
        this.n.setVisibility(0);
        this.n.a(App.h((Context) this));
        this.r = (TextEmojiLabel) findViewById(2131755850);
        this.r.setVisibility(0);
        if (!App.S) {
            d();
        }
        this.r.a(App.v);
        findViewById(2131755847).setOnClickListener(new a5x(this));
        b();
        App.b((tm) this);
        findViewById(2131755855).setOnClickListener(new a9(this));
        findViewById(2131755856).setOnClickListener(new ai2(this));
        findViewById(2131755851).setOnClickListener(new tz(this));
        findViewById(2131755852).setOnClickListener(new q1(this));
        findViewById(2131755854).setOnClickListener(new a4i(this));
        findViewById(2131755853).setOnClickListener(new k(this));
        this.s = false;
        App.z().getSharedPreferences(z[0], 0).registerOnSharedPreferenceChangeListener(this);
    }
}
