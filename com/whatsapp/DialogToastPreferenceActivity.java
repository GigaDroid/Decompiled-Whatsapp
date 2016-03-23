package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.u;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class DialogToastPreferenceActivity extends PreferenceActivity implements by, OnSharedPreferenceChangeListener {
    private static final String[] z;
    private AppCompatDelegate a;
    private String b;
    private boolean c;
    private int d;
    private boolean e;
    private g0 f;
    private ProgressDialog g;
    private int h;

    static {
        String[] strArr = new String[18];
        String str = "T\u001eT\u0016.V.J\u0014%U\u0004G\u0012.";
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
                        i3 = 50;
                        break;
                    case at.g /*1*/:
                        i3 = 113;
                        break;
                    case at.i /*2*/:
                        i3 = 38;
                        break;
                    case at.o /*3*/:
                        i3 = 117;
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
                    str = "_5O\u0014']\u0016r\u001a*A\u0005r\u001c?^\u0014o\u0011";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "_5O\u0014']\u0016r\u001a*A\u0005k\u00108A\u0010A\u0010\u0002V";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001c\u001eH&*D\u0014o\u001b8F\u0010H\u0016.a\u0005G\u0001.";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Q\u001eK[<Z\u0010R\u0006*B\u0001y\u00059W\u0017C\u0007.\\\u0012C\u0006";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001c\u001eH69W\u0010R\u0010";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Q\u001eK[<Z\u0010R\u0006*B\u0001y\u00059W\u0017C\u0007.\\\u0012C\u0006";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001c\u001eH1.A\u0005T\u001a2";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "V\u0018G\u0019$U\u0005I\u00148F\u0005T\u0010-W\u0003C\u001b(W\u0010E\u0001\"D\u0018R\fd]\u001fD\u0014(Y\u0001T\u00108A\u0014BZ*Q\u0005O\u0003\"F\b\u0006\u001b$\u0012\u0010E\u0001\"D\u0014";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001c\u001eH%*G\u0002C";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001c\u001eH&?S\u0003R";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "A\u0014R\u0001\"\\\u0016UZ9W\u0002S\u0018.\u001d\u0006T\u001a%U\\U\u0001*F\u0014\u0006";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001c\u001eH'.A\u0004K\u0010";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001c\u001eH&?]\u0001";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "_5O\u0014']\u0016r\u001a*A\u0005k\u00108A\u0010A\u0010";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "_5O\u0014']\u0016r\u001a*A\u0005r\u001c?^\u0014o\u0011";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "_5O\u0014']\u0016r\u001a*A\u0005k\u00108A\u0010A\u0010\u0002V";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "_5O\u0014']\u0016r\u001a*A\u0005k\u00108A\u0010A\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onResume() {
        Log.i(getClass().getName() + z[13]);
        if (this.e) {
            this.e = false;
            c();
        }
        App.a((by) this);
        super.onResume();
        this.f.sendEmptyMessageDelayed(0, 3000);
        this.c = true;
        if (App.t((Context) this) != 3 && App.t((Context) this) != 2) {
            Log.i(z[12] + App.t((Context) this));
            startActivity(new Intent(this, Main.class));
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        aqu.b();
        super.onConfigurationChanged(configuration);
        a().onConfigurationChanged(configuration);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        if (App.j == 3) {
            u.b((Activity) this);
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    protected void onDestroy() {
        Log.i(getClass().getName() + z[8]);
        super.onDestroy();
        a().onDestroy();
        App.z().getSharedPreferences(z[7], 0).unregisterOnSharedPreferenceChangeListener(this);
    }

    public void a(@Nullable Toolbar toolbar) {
        a().setSupportActionBar(toolbar);
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a().onPostCreate(bundle);
    }

    private AppCompatDelegate a() {
        if (this.a == null) {
            this.a = AppCompatDelegate.create((Activity) this, null);
        }
        return this.a;
    }

    public void a(int i, int i2, String[] strArr) {
        this.d = i;
        this.h = i2;
        if (!isFinishing()) {
            showDialog(500);
        }
    }

    public boolean a(String str, String str2) {
        return false;
    }

    public void onBackPressed() {
        if (this.c || VERSION.SDK_INT < 11) {
            super.onBackPressed();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Log.e(z[9]);
    }

    public boolean f() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public DialogToastPreferenceActivity() {
        this.c = true;
    }

    protected void onStart() {
        Log.i(getClass().getName() + z[11]);
        super.onStart();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.j == 3) {
            switch (i) {
                case arj.Toolbar_subtitleTextColor /*24*/:
                    u.c(this).show();
                    return true;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    u.d();
                    return true;
                case arj.Theme_colorAccent /*84*/:
                    u.a((Activity) this, false);
                    return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setContentView(@android.support.annotation.LayoutRes int r7) {
        /*
        r6 = this;
        r5 = 1;
        r4 = -1;
        r0 = r6.getLayoutInflater();
        r1 = 2130903280; // 0x7f0300f0 float:1.7413374E38 double:1.0528061053E-314;
        r2 = 0;
        r3 = 0;
        r0 = r0.inflate(r1, r2, r3);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r1 = r6.getTitle();
        r0.setTitle(r1);
        r1 = com.whatsapp.App.av;
        if (r1 == 0) goto L_0x0026;
    L_0x001c:
        r1 = 2130839455; // 0x7f02079f float:1.7283921E38 double:1.0527745715E-314;
        r0.setNavigationIcon(r1);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x002c;
    L_0x0026:
        r1 = 2130837526; // 0x7f020016 float:1.7280009E38 double:1.0527736185E-314;
        r0.setNavigationIcon(r1);
    L_0x002c:
        r1 = new android.widget.LinearLayout;
        r1.<init>(r6);
        r1.setOrientation(r5);
        r2 = r6.getResources();
        r3 = 2131427329; // 0x7f0b0001 float:1.8476271E38 double:1.05306502E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r1.addView(r0, r4, r2);
        r2 = new android.widget.FrameLayout;
        r2.<init>(r6);
        r3 = r6.getLayoutInflater();
        com.whatsapp.aam.a(r3, r7, r2, r5);
        r1.addView(r2, r4, r4);
        r6.setContentView(r1);
        r6.a(r0);
        r1 = new com.whatsapp.g6;
        r1.<init>(r6);
        r0.setNavigationOnClickListener(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastPreferenceActivity.setContentView(int):void");
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 500:
                Builder positiveButton = new Builder(this).setMessage(TextUtils.isEmpty(this.b) ? getString(this.h) : this.b).setPositiveButton(2131231580, new ald(this));
                if (this.d != 0) {
                    positiveButton.setTitle(this.d);
                }
                return positiveButton.create();
            case 501:
                Dialog progressDialog = new ProgressDialog(this);
                if (this.d != 0) {
                    progressDialog.setTitle(this.d);
                }
                progressDialog.setMessage(getString(this.h));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                this.g = progressDialog;
                return progressDialog;
            case 601:
                int i2;
                Builder title = new Builder(this).setTitle(getString(2131231479));
                if (App.V()) {
                    i2 = 2131231723;
                } else {
                    i2 = 2131231724;
                }
                return title.setMessage(getString(i2)).setPositiveButton(2131231580, new o(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    protected void onCreate(Bundle bundle) {
        Log.i(getClass().getName() + z[6]);
        aqu.b();
        this.e = false;
        aam.a(getWindow());
        getTheme().applyStyle(2131493081, true);
        a().installViewFactory();
        a().onCreate(bundle);
        super.onCreate(bundle);
        this.f = new g0(Looper.getMainLooper());
        if (VERSION.SDK_INT >= 11) {
            View findViewById = findViewById(16908298);
            if (findViewById != null) {
                int paddingLeft = findViewById.getPaddingLeft();
                int paddingLeft2 = findViewById.getPaddingLeft();
                ViewParent parent = findViewById.getParent();
                if (parent instanceof View) {
                    View view = (View) parent;
                    paddingLeft += view.getPaddingLeft();
                    paddingLeft2 += view.getPaddingRight();
                    view.setPadding(0, 0, 0, 0);
                }
                findViewById.setPadding(paddingLeft, 0, paddingLeft2, 0);
                findViewById.setScrollBarStyle(33554432);
            }
        }
        App.z().getSharedPreferences(z[5], 0).registerOnSharedPreferenceChangeListener(this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        Log.i(getClass().getName() + z[4]);
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(z[1], this.b);
        bundle.putInt(z[3], this.h);
        bundle.putInt(z[2], this.d);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (z[0].equals(str)) {
            this.e = true;
        }
    }

    protected void onPause() {
        Log.i(getClass().getName() + z[10]);
        App.c((by) this);
        super.onPause();
        if (this.f.hasMessages(0)) {
            this.f.removeMessages(0);
        }
        App.H();
        this.c = false;
    }

    protected void onPostResume() {
        super.onPostResume();
        a().onPostResume();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }

    public boolean m471b() {
        return false;
    }

    protected void onStop() {
        Log.i(getClass().getName() + z[14]);
        super.onStop();
        a().onStop();
    }

    public void e() {
        this.g = null;
        removeDialog(501);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        a().addContentView(view, layoutParams);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        a().setContentView(view, layoutParams);
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        a().setTitle(charSequence);
    }

    public void f(String str) {
        this.b = str;
        if (!isFinishing()) {
            showDialog(500);
        }
    }

    public ActionBar b() {
        return a().getSupportActionBar();
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case 500:
                ((AlertDialog) dialog).setMessage(TextUtils.isEmpty(this.b) ? getString(this.h) : this.b);
                if (DialogToastActivity.f) {
                    break;
                }
                return;
        }
        super.onPrepareDialog(i, dialog);
    }

    private void c() {
        finish();
        startActivity(getIntent());
    }

    public MenuInflater getMenuInflater() {
        return a().getMenuInflater();
    }

    public void invalidateOptionsMenu() {
        a().invalidateOptionsMenu();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (App.j == 3) {
            u.b((Activity) this);
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.b = bundle.getString(z[15]);
        this.h = bundle.getInt(z[17], 0);
        this.d = bundle.getInt(z[16], 0);
    }

    public void a(int i, int i2) {
        this.d = i;
        this.h = i2;
        if (!isFinishing()) {
            showDialog(501);
        }
    }

    public void a(int i) {
        this.h = i;
        if (!isFinishing()) {
            showDialog(500);
        }
    }

    public void g(@Nullable String str) {
        if (this.g != null) {
            this.g.setMessage(str);
        }
    }

    public void setContentView(View view) {
        a().setContentView(view);
    }
}
