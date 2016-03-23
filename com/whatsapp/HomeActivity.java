package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.appcompat.R;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.notification.aw;
import com.whatsapp.observablelistview.ObservableListView;
import com.whatsapp.observablelistview.e;
import com.whatsapp.observablelistview.h;
import com.whatsapp.observablelistview.k;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import com.whatsapp.util.bz;
import java.util.Iterator;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class HomeActivity extends DialogToastActivity implements a_, aau, h, OnSharedPreferenceChangeListener {
    private static final int A;
    private static final int E;
    private static boolean K;
    private static final String[] L;
    private View B;
    private int C;
    private c6 D;
    private View F;
    private TextView G;
    private View H;
    private boolean I;
    private long J;
    private ActionBar n;
    private SearchView o;
    private ce p;
    private Toolbar q;
    private int r;
    private Menu s;
    private MenuItem t;
    private int u;
    private TabsPager v;
    private SimpleOnPageChangeListener w;
    private boolean x;
    private int y;
    final InputMethodManager z;

    final class 16 extends View {
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(getContext().getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material), 1073741824));
        }

        16(Context context) {
            super(context);
        }
    }

    public class TabsPager extends ViewPager {
        private boolean a;

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (this.a) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.a) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }

        public TabsPager(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setCurrentItem(int r6) {
            /*
            r5 = this;
            r4 = 8;
            r3 = 0;
            r0 = r5.getCurrentItem();
            if (r6 != r0) goto L_0x003d;
        L_0x0009:
            r0 = r5.getContext();
            r0 = (com.whatsapp.HomeActivity) r0;
            r1 = com.whatsapp.HomeActivity.a(r0, r6);
            if (r1 == 0) goto L_0x003d;
        L_0x0015:
            r1 = (android.support.v4.app.Fragment) r1;
            r1 = r1.getView();
            r2 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
            r1 = r1.findViewById(r2);
            r1 = (android.widget.ListView) r1;
            if (r1 == 0) goto L_0x003d;
        L_0x0026:
            r2 = android.os.Build.VERSION.SDK_INT;
            if (r2 < r4) goto L_0x0037;
        L_0x002a:
            r2 = r1.getFirstVisiblePosition();
            if (r2 >= r4) goto L_0x0037;
        L_0x0030:
            r1.smoothScrollToPosition(r3);
            r2 = com.whatsapp.DialogToastActivity.f;
            if (r2 == 0) goto L_0x003a;
        L_0x0037:
            r1.setSelection(r3);
        L_0x003a:
            com.whatsapp.HomeActivity.e(r0);
        L_0x003d:
            super.setCurrentItem(r6);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.TabsPager.setCurrentItem(int):void");
        }
    }

    public static View a(View view, Fragment fragment) {
        Context activity = fragment.getActivity();
        if (activity instanceof h) {
            ObservableListView observableListView = (ObservableListView) view.findViewById(16908298);
            observableListView.addHeaderView(new 16(activity), null, false);
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                try {
                    if (arguments.containsKey(L[17])) {
                        int i = arguments.getInt(L[18], 0);
                        if (i != 0) {
                            try {
                                view.getViewTreeObserver().addOnGlobalLayoutListener(new q5(observableListView, i));
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            observableListView.setScrollViewCallbacks((h) activity);
        }
        return view;
    }

    private void a(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(new lt(this, view));
    }

    public void b() {
        n();
    }

    static ce g(HomeActivity homeActivity) {
        return homeActivity.p;
    }

    public void a(String str, boolean z) {
    }

    static boolean b(HomeActivity homeActivity) {
        return homeActivity.g();
    }

    static void c(HomeActivity homeActivity) {
        homeActivity.t();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r10 = this;
        r8 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r7 = 1;
        r6 = 0;
        r5 = 0;
        r0 = r10.C;	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r0 == 0) goto L_0x004a;
    L_0x0009:
        r0 = r10.B;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0.clearAnimation();	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r1 = 11;
        if (r0 < r1) goto L_0x0033;
    L_0x0014:
        r0 = r10.B;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r1 = L;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0050 }
        r2 = 1;
        r2 = new float[r2];	 Catch:{ IllegalArgumentException -> 0x0050 }
        r3 = 0;
        r4 = 0;
        r2[r3] = r4;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0 = android.animation.ObjectAnimator.ofFloat(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0050 }
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r0 = r0.setDuration(r2);	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0.start();	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r0 == 0) goto L_0x0048;
    L_0x0033:
        r0 = r10.B;
        r0.setPadding(r5, r5, r5, r5);
        r0 = new android.view.animation.TranslateAnimation;
        r1 = r10.C;
        r1 = (float) r1;
        r0.<init>(r6, r6, r1, r6);
        r0.setDuration(r8);
        r1 = r10.B;
        r1.startAnimation(r0);
    L_0x0048:
        r10.C = r5;
    L_0x004a:
        r10.e(r7);
        return;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.c():void");
    }

    private void k() {
        if (this.o == null) {
            this.H.setBackgroundResource(2130839748);
            aam.a(getLayoutInflater(), 2130903199, (ViewGroup) this.H, true);
            this.o = (SearchView) this.H.findViewById(2131755700);
            ((TextView) this.o.findViewById(R.id.search_src_text)).setTextColor(ContextCompat.getColor(this, R.color.primary_text_default_material_light));
            this.o.setIconifiedByDefault(false);
            this.o.setQueryHint(getString(2131231848));
            this.o.setOnQueryTextListener(new gd(this));
            ((ImageView) this.o.findViewById(R.id.search_mag_icon)).setImageDrawable(new ar3(this, ContextCompat.getDrawable(this, 2130839457), 0));
            ImageView imageView = (ImageView) this.H.findViewById(2131755699);
            imageView.setImageDrawable(new bz(ContextCompat.getDrawable(this, 2130839457)));
            imageView.setOnClickListener(new ai_(this));
        }
    }

    public boolean onSearchRequested() {
        p();
        return false;
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (L[7].equals(str)) {
                this.x = true;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void c(co coVar) {
        i8.f();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    static void e(HomeActivity homeActivity) {
        homeActivity.c();
    }

    public void e(String str) {
        runOnUiThread(new asw(this));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onPause() {
        Log.i(L[23]);
        super.onPause();
        this.p.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        r8 = 3;
        r0 = 1;
        r1 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = L;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r4 = 15;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00dc }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3 = com.whatsapp.a42.a();	 Catch:{ IllegalArgumentException -> 0x00dc }
        r4 = r9.J;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3.a(r4);	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3 = L;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r4 = 16;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3 = com.whatsapp.tp.a(r3);	 Catch:{ IllegalArgumentException -> 0x00dc }
        r9.p = r3;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3 = r9.p;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r4 = r9.J;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3.b(r4);	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3 = r9.p;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r4 = com.whatsapp.t4.PRE_CREATE;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r6 = r9.J;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3.a(r4, r6);	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3 = r9.p;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r4 = com.whatsapp.t4.PRE_CREATE;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3.a(r4);	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3 = r9.p;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r4 = com.whatsapp.t4.ON_CREATE;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3.b(r4);	 Catch:{ IllegalArgumentException -> 0x00dc }
        r3 = r9.p;	 Catch:{ IllegalArgumentException -> 0x00dc }
        r4 = com.whatsapp.tb.FROM_SAVED_STATE;	 Catch:{ IllegalArgumentException -> 0x00dc }
        if (r10 == 0) goto L_0x00de;
    L_0x0047:
        r3.a(r4, r0);	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r0 = r9.p;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r3 = com.whatsapp.tb.FIRST_INIT;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r4 = K;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r0.a(r3, r4);	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r0 = 0;
        K = r0;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r0 = 0;
        r9.x = r0;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r0 = com.whatsapp.App.j;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        if (r0 != r8) goto L_0x0060;
    L_0x005d:
        com.whatsapp.util.u.a(r9);	 Catch:{ IllegalArgumentException -> 0x00e1 }
    L_0x0060:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r3 = 21;
        if (r0 < r3) goto L_0x006f;
    L_0x0066:
        r0 = r9.getWindow();	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0.addFlags(r3);	 Catch:{ IllegalArgumentException -> 0x00e3 }
    L_0x006f:
        r0 = 5;
        r9.supportRequestWindowFeature(r0);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        super.onCreate(r10);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = 2130903198; // 0x7f03009e float:1.7413207E38 double:1.0528060647E-314;
        r9.setContentView(r0);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = 2131755438; // 0x7f1001ae float:1.9141755E38 double:1.0532271273E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = (android.support.v7.widget.Toolbar) r0;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r9.q = r0;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = r9.q;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r9.setSupportActionBar(r0);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = 2131755330; // 0x7f100142 float:1.9141536E38 double:1.053227074E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r9.B = r0;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = 2131755698; // 0x7f1002b2 float:1.9142283E38 double:1.0532272557E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r9.H = r0;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = r9.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r3 = 0;
        r0.setDisplayHomeAsUpEnabled(r3);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = 0;
        r9.setSupportProgressBarIndeterminateVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = com.whatsapp.App.ay;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        if (r0 == 0) goto L_0x00bc;
    L_0x00ae:
        r0 = com.whatsapp.App.aK;	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r0 = r0.E();	 Catch:{ IllegalArgumentException -> 0x00e7 }
        if (r0 == 0) goto L_0x00bc;
    L_0x00b6:
        r0 = com.whatsapp.App.t(r9);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        if (r0 == r8) goto L_0x00e9;
    L_0x00bc:
        r0 = L;
        r1 = 11;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = L;
        r1 = 14;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r9, r1);
        r9.startActivity(r0);
        r9.finish();
    L_0x00db:
        return;
    L_0x00dc:
        r0 = move-exception;
        throw r0;
    L_0x00de:
        r0 = r1;
        goto L_0x0047;
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = com.whatsapp.App.g;	 Catch:{ IllegalArgumentException -> 0x0218 }
        r0.stop();	 Catch:{ IllegalArgumentException -> 0x0218 }
        r0 = com.whatsapp.App.U();	 Catch:{ IllegalArgumentException -> 0x0218 }
        if (r0 == 0) goto L_0x0107;
    L_0x00f4:
        r0 = L;	 Catch:{ IllegalArgumentException -> 0x021a }
        r3 = 9;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x021a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalArgumentException -> 0x021a }
        r0 = new com.whatsapp.DialogToastActivity$UnsupportedDeviceDialogFragment;	 Catch:{ IllegalArgumentException -> 0x021a }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x021a }
        r9.a(r0);	 Catch:{ IllegalArgumentException -> 0x021a }
        if (r2 == 0) goto L_0x0149;
    L_0x0107:
        r0 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x021c }
        r0 = r0.F();	 Catch:{ IllegalArgumentException -> 0x021c }
        if (r0 == 0) goto L_0x0122;
    L_0x010f:
        r0 = L;	 Catch:{ IllegalArgumentException -> 0x021e }
        r3 = 10;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x021e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalArgumentException -> 0x021e }
        r0 = new com.whatsapp.DialogToastActivity$ClockWrongDialogFragment;	 Catch:{ IllegalArgumentException -> 0x021e }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x021e }
        r9.a(r0);	 Catch:{ IllegalArgumentException -> 0x021e }
        if (r2 == 0) goto L_0x0149;
    L_0x0122:
        r0 = com.whatsapp.App.a4();	 Catch:{ IllegalArgumentException -> 0x0220 }
        if (r0 == 0) goto L_0x013b;
    L_0x0128:
        r0 = L;	 Catch:{ IllegalArgumentException -> 0x0222 }
        r3 = 12;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x0222 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalArgumentException -> 0x0222 }
        r0 = new com.whatsapp.DialogToastActivity$SoftwareExpiredDialogFragment;	 Catch:{ IllegalArgumentException -> 0x0222 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0222 }
        r9.a(r0);	 Catch:{ IllegalArgumentException -> 0x0222 }
        if (r2 == 0) goto L_0x0149;
    L_0x013b:
        r0 = com.whatsapp.App.aC();	 Catch:{ IllegalArgumentException -> 0x0224 }
        if (r0 == 0) goto L_0x0149;
    L_0x0141:
        r0 = new com.whatsapp.DialogToastActivity$SoftwareAboutToExpireDialogFragment;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0224 }
        r9.b(r0);	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x0149:
        r0 = 2131755458; // 0x7f1001c2 float:1.9141796E38 double:1.053227137E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0 = (com.whatsapp.HomeActivity.TabsPager) r0;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r9.v = r0;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0 = new com.whatsapp.c6;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r3 = r9.getSupportFragmentManager();	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0.<init>(r9, r3);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r9.D = r0;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0 = r9.v;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r3 = r9.D;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0.setAdapter(r3);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0 = r9.v;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r3 = 3;
        r0.setOffscreenPageLimit(r3);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0 = r9.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x0226 }
        r9.n = r0;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0 = r9.n;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r3 = 0;
        r0.setElevation(r3);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0 = r9.B;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r3 = r9.getResources();	 Catch:{ IllegalArgumentException -> 0x0226 }
        r4 = 2131427411; // 0x7f0b0053 float:1.8476437E38 double:1.0530650604E-314;
        r3 = r3.getDimension(r4);	 Catch:{ IllegalArgumentException -> 0x0226 }
        android.support.v4.view.ViewCompat.setElevation(r0, r3);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0 = L;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r3 = 8;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x0226 }
        r3 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x0226 }
        r3 = r3.getAction();	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x0226 }
        if (r0 == 0) goto L_0x01a8;
    L_0x019c:
        r0 = r9.v;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r3 = 0;
        r4 = 0;
        r0.setCurrentItem(r3, r4);	 Catch:{ IllegalArgumentException -> 0x0228 }
        r0 = 0;
        r9.r = r0;	 Catch:{ IllegalArgumentException -> 0x0228 }
        if (r2 == 0) goto L_0x01b2;
    L_0x01a8:
        r0 = r9.v;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r2 = 1;
        r3 = 0;
        r0.setCurrentItem(r2, r3);	 Catch:{ IllegalArgumentException -> 0x0228 }
        r0 = 1;
        r9.r = r0;	 Catch:{ IllegalArgumentException -> 0x0228 }
    L_0x01b2:
        r0 = 2131755457; // 0x7f1001c1 float:1.9141794E38 double:1.0532271366E-314;
        r0 = r9.findViewById(r0);
        r0 = (com.whatsapp.PagerSlidingTabStrip) r0;
        android.support.v4.view.ViewCompat.setLayoutDirection(r0, r1);
        r2 = r9.v;
        r0.setViewPager(r2);
        r2 = r9.w;
        r0.setOnPageChangeListener(r2);
        r9.n();
        r0 = r9.g();
        r9.e(r0);
        com.whatsapp.App.b(r9);
        com.whatsapp.App.b(r9);
        r0 = 2131755487; // 0x7f1001df float:1.9141855E38 double:1.0532271515E-314;
        r0 = r9.findViewById(r0);
        r9.F = r0;
        r0 = r9.F;
        r2 = new com.whatsapp.bb;
        r2.<init>(r9);
        r0.setOnClickListener(r2);
        r0 = 2131755488; // 0x7f1001e0 float:1.9141857E38 double:1.053227152E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.G = r0;
        r0 = r9.B;
        r9.a(r0);
        r9.l();
        r0 = com.whatsapp.App.z();
        r2 = L;
        r3 = 13;
        r2 = r2[r3];
        r0 = r0.getSharedPreferences(r2, r1);
        r0.registerOnSharedPreferenceChangeListener(r9);
        r0 = r9.p;
        r1 = com.whatsapp.t4.ON_CREATE;
        r0.a(r1);
        goto L_0x00db;
    L_0x0218:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x021a }
    L_0x021a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x021c }
    L_0x021c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x021e }
    L_0x021e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0220 }
    L_0x0220:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0222 }
    L_0x0222:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x0224:
        r0 = move-exception;
        throw r0;
    L_0x0226:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0228 }
    L_0x0228:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    static void a(HomeActivity homeActivity, boolean z) {
        homeActivity.d(z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(boolean r6) {
        /*
        r5 = this;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r5.q;
        r2 = r0.getHeight();
        r4 = r5.D;	 Catch:{ IllegalArgumentException -> 0x005d }
        if (r6 == 0) goto L_0x005f;
    L_0x000d:
        r0 = r1;
    L_0x000e:
        r4.a(r0);
    L_0x0011:
        r0 = r5.D;
        r0 = r0.getCount();
        if (r1 >= r0) goto L_0x005c;
    L_0x0019:
        r0 = r5.v;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r0 = r0.getCurrentItem();	 Catch:{ IllegalArgumentException -> 0x0061 }
        if (r1 != r0) goto L_0x0023;
    L_0x0021:
        if (r3 == 0) goto L_0x0058;
    L_0x0023:
        r0 = r5.a(r1);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 != 0) goto L_0x002d;
    L_0x002b:
        if (r3 == 0) goto L_0x0058;
    L_0x002d:
        r0 = r0.getView();
        if (r0 != 0) goto L_0x0035;
    L_0x0033:
        if (r3 == 0) goto L_0x0058;
    L_0x0035:
        r4 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
        r0 = r0.findViewById(r4);
        r0 = (com.whatsapp.observablelistview.ObservableListView) r0;
        if (r0 == 0) goto L_0x0058;
    L_0x0040:
        if (r6 == 0) goto L_0x004e;
    L_0x0042:
        r4 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0063 }
        if (r4 <= 0) goto L_0x0058;
    L_0x0048:
        r4 = 0;
        r0.setSelection(r4);	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r3 == 0) goto L_0x0058;
    L_0x004e:
        r4 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r4 >= r2) goto L_0x0058;
    L_0x0054:
        r4 = 1;
        r0.setSelection(r4);	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0058:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0011;
    L_0x005c:
        return;
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r0 = r2;
        goto L_0x000e;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.e(boolean):void");
    }

    static View k(HomeActivity homeActivity) {
        return homeActivity.H;
    }

    static void j(HomeActivity homeActivity) {
        homeActivity.n();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            if (menuItem.getItemId() == 2131755047) {
                p();
                return true;
            } else if (menuItem.getItemId() == 2131755053) {
                startActivity(new Intent(this, SetStatus.class));
                return true;
            } else if (menuItem.getItemId() == 2131755049) {
                startActivity(new Intent(this, Settings.class));
                return true;
            } else if (menuItem.getItemId() != 2131755034) {
                return super.onOptionsItemSelected(menuItem);
            } else {
                try {
                    startActivity(new Intent(this, Class.forName(L[26])));
                    return true;
                } catch (ClassNotFoundException e) {
                    return true;
                }
            }
        } catch (ClassNotFoundException e2) {
            throw e2;
        }
    }

    private void j() {
        finish();
        startActivity(getIntent());
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        try {
            if (intent.getLongExtra(L[0], -1) == -1) {
                if (s()) {
                    this.H.postDelayed(new sl(this), (long) getResources().getInteger(17694722));
                }
            }
            super.startActivityFromFragment(fragment, intent, i);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static void b(HomeActivity homeActivity, boolean z) {
        homeActivity.c(z);
    }

    private void r() {
        this.F.setVisibility(0);
        this.G.setText("");
    }

    static int b(HomeActivity homeActivity, int i) {
        homeActivity.r = i;
        return i;
    }

    static int h(HomeActivity homeActivity) {
        return homeActivity.r;
    }

    static o3 a(HomeActivity homeActivity, int i) {
        return homeActivity.a(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r10 = this;
        r8 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r7 = 0;
        r6 = 0;
        r0 = r10.q;
        r0 = r0.getHeight();
        r1 = r10.C;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r2 = -r0;
        if (r1 == r2) goto L_0x0051;
    L_0x000f:
        r1 = r10.B;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r1.clearAnimation();	 Catch:{ IllegalArgumentException -> 0x0057 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = 11;
        if (r1 < r2) goto L_0x003b;
    L_0x001a:
        r1 = r10.B;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = L;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r3 = 25;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0057 }
        r3 = 1;
        r3 = new float[r3];	 Catch:{ IllegalArgumentException -> 0x0057 }
        r4 = 0;
        r5 = -r0;
        r5 = (float) r5;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r3[r4] = r5;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r1 = android.animation.ObjectAnimator.ofFloat(r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r1 = r1.setDuration(r2);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r1.start();	 Catch:{ IllegalArgumentException -> 0x0057 }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r1 == 0) goto L_0x004e;
    L_0x003b:
        r1 = r10.B;
        r2 = -r0;
        r1.setPadding(r6, r2, r6, r6);
        r1 = new android.view.animation.TranslateAnimation;
        r1.<init>(r7, r7, r7, r7);
        r1.setDuration(r8);
        r2 = r10.B;
        r2.startAnimation(r1);
    L_0x004e:
        r0 = -r0;
        r10.C = r0;
    L_0x0051:
        r10.e(r6);
        return;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.i():void");
    }

    private void d(boolean z) {
        if (z) {
            try {
                if (!App.as.e().r().exists()) {
                    if (!ProfilePhotoReminder.p) {
                        try {
                            if (App.Q()) {
                                try {
                                    if (ProfilePhotoReminder.g()) {
                                        ProfilePhotoReminder.c();
                                        startActivity(new Intent(this, ProfilePhotoReminder.class));
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
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } else {
            try {
                if (!isFinishing()) {
                    showDialog(0);
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void p() {
        /*
        r8 = this;
        r7 = 2131427550; // 0x7f0b00de float:1.847672E38 double:1.053065129E-314;
        r6 = 21;
        r5 = 0;
        r4 = 0;
        r0 = r8.s();	 Catch:{ IllegalArgumentException -> 0x00ed }
        if (r0 != 0) goto L_0x00ec;
    L_0x000d:
        r8.k();	 Catch:{ IllegalArgumentException -> 0x00ef }
        r0 = r8.B;	 Catch:{ IllegalArgumentException -> 0x00ef }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x00ef }
        r0 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00ef }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x00ef }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x00ef }
        if (r0 < r6) goto L_0x006f;
    L_0x0021:
        r0 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00ef }
        r0 = r0.isAttachedToWindow();	 Catch:{ IllegalArgumentException -> 0x00ef }
        if (r0 == 0) goto L_0x008c;
    L_0x0029:
        r0 = r8.H;
        r0 = r0.getWidth();
        r1 = r8.getResources();
        r2 = 2131427369; // 0x7f0b0029 float:1.8476352E38 double:1.0530650396E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r0 = r0 - r1;
        r1 = r8.getResources();
        r2 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r1 = r1 * 3;
        r1 = r1 / 2;
        r1 = r0 - r1;
        r2 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00f1 }
        r0 = com.whatsapp.App.a1();	 Catch:{ IllegalArgumentException -> 0x00f1 }
        if (r0 == 0) goto L_0x00f3;
    L_0x0054:
        r0 = r1;
    L_0x0055:
        r3 = r8.H;
        r3 = r3.getHeight();
        r3 = r3 / 2;
        r1 = (float) r1;
        r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r0, r3, r4, r1);
        r1 = E;
        r2 = (long) r1;
        r0.setDuration(r2);
        r0.start();
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x008c;
    L_0x006f:
        r0 = new android.view.animation.TranslateAnimation;
        r1 = r8.H;
        r1 = r1.getHeight();
        r1 = -r1;
        r1 = (float) r1;
        r0.<init>(r4, r4, r1, r4);
        r1 = E;
        r2 = (long) r1;
        r0.setDuration(r2);
        r1 = r8.H;
        r1.clearAnimation();
        r1 = r8.H;
        r1.startAnimation(r0);
    L_0x008c:
        r0 = new android.view.animation.TranslateAnimation;
        r1 = r8.getResources();
        r1 = r1.getDimensionPixelSize(r7);
        r1 = -r1;
        r1 = (float) r1;
        r0.<init>(r4, r4, r4, r1);
        r1 = E;
        r2 = (long) r1;
        r0.setDuration(r2);
        r1 = r8.B;
        r1.startAnimation(r0);
        r0 = 2131755697; // 0x7f1002b1 float:1.914228E38 double:1.053227255E-314;
        r0 = r8.findViewById(r0);
        r0.setPadding(r5, r5, r5, r5);
        r0.clearAnimation();
        r1 = new android.view.animation.TranslateAnimation;
        r2 = r8.getResources();
        r2 = r2.getDimensionPixelSize(r7);
        r2 = (float) r2;
        r1.<init>(r4, r4, r2, r4);
        r2 = E;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r2 = r2 * 4;
        r2 = r2 / 3;
        r2 = (long) r2;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r1.setDuration(r2);	 Catch:{ IllegalArgumentException -> 0x00fc }
        r2 = new com.whatsapp.a5z;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r2.<init>(r8);	 Catch:{ IllegalArgumentException -> 0x00fc }
        r1.setAnimationListener(r2);	 Catch:{ IllegalArgumentException -> 0x00fc }
        r0.startAnimation(r1);	 Catch:{ IllegalArgumentException -> 0x00fc }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x00fc }
        if (r0 < r6) goto L_0x00ec;
    L_0x00da:
        r0 = r8.getWindow();	 Catch:{ IllegalArgumentException -> 0x00fc }
        r1 = r8.getResources();	 Catch:{ IllegalArgumentException -> 0x00fc }
        r2 = 2131624032; // 0x7f0e0060 float:1.8875232E38 double:1.053162204E-314;
        r1 = r1.getColor(r2);	 Catch:{ IllegalArgumentException -> 0x00fc }
        r0.setStatusBarColor(r1);	 Catch:{ IllegalArgumentException -> 0x00fc }
    L_0x00ec:
        return;
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ef }
    L_0x00ef:
        r0 = move-exception;
        throw r0;
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        r0 = r8.H;
        r0 = r0.getWidth();
        r0 = r0 - r1;
        goto L_0x0055;
    L_0x00fc:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.p():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    private ObservableListView m() {
        Fragment o = o();
        if (o != null) {
            View view = o.getView();
            if (view != null) {
                try {
                    return (ObservableListView) view.findViewById(16908298);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.observablelistview.k r10, int r11, boolean r12, boolean r13) {
        /*
        r9 = this;
        r8 = 11;
        r1 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.m();	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r10 == r0) goto L_0x000e;
    L_0x000b:
        return;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = r9.s();
        if (r0 == 0) goto L_0x002b;
    L_0x0014:
        r0 = r9.getCurrentFocus();
        if (r0 == 0) goto L_0x000b;
    L_0x001a:
        if (r12 != 0) goto L_0x000b;
    L_0x001c:
        if (r13 == 0) goto L_0x000b;
    L_0x001e:
        r1 = r9.z;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r0 = r0.getWindowToken();	 Catch:{ IllegalArgumentException -> 0x0029 }
        r2 = 2;
        r1.hideSoftInputFromWindow(r0, r2);	 Catch:{ IllegalArgumentException -> 0x0029 }
        goto L_0x000b;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = r9.q;
        r3 = r0.getHeight();
        r0 = r9.y;	 Catch:{ IllegalArgumentException -> 0x00a5 }
        if (r0 >= r11) goto L_0x00a7;
    L_0x0035:
        r0 = 1;
    L_0x0036:
        r9.y = r11;	 Catch:{ IllegalArgumentException -> 0x00a9 }
        if (r12 != 0) goto L_0x003e;
    L_0x003a:
        r4 = r9.I;	 Catch:{ IllegalArgumentException -> 0x00ab }
        if (r4 == r0) goto L_0x0069;
    L_0x003e:
        r9.I = r0;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = r9.C;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = r0 + r11;
        r9.u = r0;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = r9.B;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0.clearAnimation();	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x00ad }
        if (r0 < r8) goto L_0x0058;
    L_0x004e:
        r0 = r9.B;	 Catch:{ IllegalArgumentException -> 0x00af }
        r4 = r9.C;	 Catch:{ IllegalArgumentException -> 0x00af }
        r4 = (float) r4;	 Catch:{ IllegalArgumentException -> 0x00af }
        r0.setTranslationY(r4);	 Catch:{ IllegalArgumentException -> 0x00af }
        if (r2 == 0) goto L_0x0069;
    L_0x0058:
        r0 = r9.B;	 Catch:{ IllegalArgumentException -> 0x00af }
        r4 = 0;
        r5 = r9.C;	 Catch:{ IllegalArgumentException -> 0x00af }
        r6 = r9.B;	 Catch:{ IllegalArgumentException -> 0x00af }
        r6 = r6.getTop();	 Catch:{ IllegalArgumentException -> 0x00af }
        r5 = r5 - r6;
        r6 = 0;
        r7 = 0;
        r0.setPadding(r4, r5, r6, r7);	 Catch:{ IllegalArgumentException -> 0x00af }
    L_0x0069:
        r0 = r9.u;
        r0 = r11 - r0;
        r0 = -r0;
        r3 = -r3;
        r0 = java.lang.Math.min(r0, r1);
        r0 = java.lang.Math.max(r3, r0);
        r1 = r9.C;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        if (r0 == r1) goto L_0x000b;
    L_0x007b:
        r9.C = r0;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r0 = r9.B;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r0.clearAnimation();	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        if (r0 < r8) goto L_0x0090;
    L_0x0086:
        r0 = r9.B;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r1 = r9.C;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r1 = (float) r1;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r0.setTranslationY(r1);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        if (r2 == 0) goto L_0x000b;
    L_0x0090:
        r0 = r9.B;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r1 = 0;
        r2 = r9.C;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r3 = r9.B;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r3 = r3.getTop();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2 = r2 - r3;
        r3 = 0;
        r4 = 0;
        r0.setPadding(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        goto L_0x000b;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = r1;
        goto L_0x0036;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.a(com.whatsapp.observablelistview.k, int, boolean, boolean):void");
    }

    private void t() {
        zb.g();
        bq.a(new jv(this, null), new Void[0]);
    }

    private void a(DialogFragment dialogFragment) {
        App.ac = true;
        App.p.R();
        b(dialogFragment);
    }

    public void a(k kVar) {
        Object obj = null;
        try {
            if (kVar == m()) {
                if ((-this.C) > this.q.getHeight() / 2) {
                    ObservableListView m = m();
                    if (m == null || m.a() >= this.q.getHeight()) {
                        int i = 1;
                    }
                }
                if (obj != null) {
                    try {
                        i();
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                c();
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void onBackPressed() {
        try {
            if (s()) {
                c(true);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            super.onBackPressed();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void b(co coVar) {
        this.F.setVisibility(8);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(L[5], s());
    }

    public void a(e eVar) {
    }

    private void n() {
        int i;
        boolean z = DialogToastActivity.f;
        Iterator it = qa.h().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            try {
                i = App.as.b((String) it.next()).d != 0 ? i2 + 1 : i2;
                if (z) {
                    break;
                }
                i2 = i;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        i = i2;
        c6.a(this.D, 1).d = i;
        c6.a(this.D, 0).d = aw.a().d().size();
        q();
    }

    static ObservableListView d(HomeActivity homeActivity) {
        return homeActivity.m();
    }

    public void a() {
    }

    public void a(co coVar) {
    }

    private boolean g() {
        try {
            return this.C == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNewIntent(android.content.Intent r4) {
        /*
        r3 = this;
        super.onNewIntent(r4);
        r0 = L;
        r1 = 22;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = L;
        r1 = 19;
        r0 = r0[r1];
        r0 = r4.getStringExtra(r0);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x006c }
        if (r1 != 0) goto L_0x0035;
    L_0x001c:
        r1 = com.whatsapp.qm.h(r0);	 Catch:{ IllegalArgumentException -> 0x006e }
        if (r1 != 0) goto L_0x0029;
    L_0x0022:
        com.whatsapp.App.k(r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r1 == 0) goto L_0x0035;
    L_0x0029:
        r1 = 1;
        com.whatsapp.App.c(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1 = new com.whatsapp.a2f;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1.<init>(r3, r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        com.whatsapp.util.bq.a(r1);	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0035:
        r0 = L;
        r1 = 21;
        r0 = r0[r1];
        r0 = r4.getStringExtra(r0);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r1 != 0) goto L_0x0051;
    L_0x0045:
        r1 = 1;
        com.whatsapp.App.c(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = new com.whatsapp.ob;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1.<init>(r3, r0);	 Catch:{ IllegalArgumentException -> 0x0072 }
        com.whatsapp.util.bq.a(r1);	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x0051:
        r0 = L;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r1 = 20;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0074 }
        r1 = r4.getAction();	 Catch:{ IllegalArgumentException -> 0x0074 }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x0074 }
        if (r0 == 0) goto L_0x006b;
    L_0x0061:
        r0 = r3.v;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r1 = 0;
        r2 = 0;
        r0.setCurrentItem(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0074 }
        r0 = 0;
        r3.r = r0;	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x006b:
        return;
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onNewIntent(android.content.Intent):void");
    }

    private o3 a(int i) {
        boolean z = DialogToastActivity.f;
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                if (i == 1) {
                    try {
                        if (fragment instanceof ConversationsFragment) {
                            return (o3) fragment;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                if (i == 0) {
                    try {
                        if (fragment instanceof CallsFragment) {
                            return (o3) fragment;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                if (i == 2) {
                    try {
                        if (fragment instanceof ContactsFragment) {
                            return (o3) fragment;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        return null;
    }

    static SearchView a(HomeActivity homeActivity) {
        return homeActivity.o;
    }

    public void onStop() {
        super.onStop();
    }

    public void a(String str, long j) {
        try {
            if (this.F.getVisibility() != 0) {
                this.F.setVisibility(0);
            }
            this.G.setText(DateUtils.formatElapsedTime(j / 1000));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void l() {
        try {
            if (!(zb.b() || zb.c())) {
                try {
                    bq.a(new jv(this, null), new Void[0]);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            try {
                d(zb.d());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                d(false);
            }
        } catch (InterruptedException e3) {
            throw e3;
        } catch (InterruptedException e32) {
            throw e32;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r10) {
        /*
        r9 = this;
        r4 = 2131427550; // 0x7f0b00de float:1.847672E38 double:1.053065129E-314;
        r8 = 21;
        r7 = 1;
        r3 = 0;
        r6 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.s();
        if (r0 == 0) goto L_0x00f4;
    L_0x0010:
        r0 = r9.B;
        r0.setVisibility(r3);
        r0 = r9.o;
        r1 = "";
        r0.setQuery(r1, r3);
        r0 = 2131755697; // 0x7f1002b1 float:1.914228E38 double:1.053227255E-314;
        r0 = r9.findViewById(r0);
        r1 = r9.getResources();
        r1 = r1.getDimensionPixelSize(r4);
        r0.setPadding(r3, r1, r3, r3);
        if (r10 == 0) goto L_0x00d2;
    L_0x0031:
        r1 = new android.view.animation.TranslateAnimation;
        r3 = r9.getResources();
        r3 = r3.getDimensionPixelSize(r4);
        r3 = -r3;
        r3 = (float) r3;
        r1.<init>(r6, r6, r3, r6);
        r3 = A;
        r4 = (long) r3;
        r1.setDuration(r4);
        r3 = r9.B;
        r3.startAnimation(r1);
        r0.startAnimation(r1);
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r8) goto L_0x009e;
    L_0x0052:
        r0 = r9.H;
        r0 = r0.getWidth();
        r1 = r9.getResources();
        r3 = 2131427369; // 0x7f0b0029 float:1.8476352E38 double:1.0530650396E-314;
        r1 = r1.getDimensionPixelSize(r3);
        r0 = r0 - r1;
        r1 = r9.getResources();
        r3 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r1 = r1.getDimensionPixelSize(r3);
        r1 = r1 * 3;
        r1 = r1 / 2;
        r1 = r0 - r1;
        r3 = r9.H;	 Catch:{ IllegalArgumentException -> 0x00f5 }
        r0 = com.whatsapp.App.a1();	 Catch:{ IllegalArgumentException -> 0x00f5 }
        if (r0 == 0) goto L_0x00f7;
    L_0x007d:
        r0 = r1;
    L_0x007e:
        r4 = r9.H;
        r4 = r4.getHeight();
        r4 = r4 / 2;
        r1 = (float) r1;
        r0 = android.view.ViewAnimationUtils.createCircularReveal(r3, r0, r4, r1, r6);
        r1 = A;
        r4 = (long) r1;
        r0.setDuration(r4);
        r1 = new com.whatsapp.axc;
        r1.<init>(r9);
        r0.addListener(r1);
        r0.start();
        if (r2 == 0) goto L_0x00d0;
    L_0x009e:
        r0 = new android.view.animation.AlphaAnimation;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.<init>(r1, r6);
        r1 = new android.view.animation.TranslateAnimation;
        r3 = r9.H;
        r3 = r3.getHeight();
        r3 = -r3;
        r3 = (float) r3;
        r1.<init>(r6, r6, r6, r3);
        r3 = new android.view.animation.AnimationSet;
        r3.<init>(r7);
        r3.addAnimation(r0);
        r3.addAnimation(r1);
        r0 = A;
        r0 = (long) r0;
        r3.setDuration(r0);
        r0 = new com.whatsapp.p9;
        r0.<init>(r9);
        r3.setAnimationListener(r0);
        r0 = r9.H;
        r0.startAnimation(r3);
    L_0x00d0:
        if (r2 == 0) goto L_0x00de;
    L_0x00d2:
        r0 = r9.o;	 Catch:{ IllegalArgumentException -> 0x00ff }
        r1 = 1;
        r0.setIconified(r1);	 Catch:{ IllegalArgumentException -> 0x00ff }
        r0 = r9.H;	 Catch:{ IllegalArgumentException -> 0x00ff }
        r1 = 4;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x00ff }
    L_0x00de:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0101 }
        if (r0 < r8) goto L_0x00f4;
    L_0x00e2:
        r0 = r9.getWindow();	 Catch:{ IllegalArgumentException -> 0x0101 }
        r1 = r9.getResources();	 Catch:{ IllegalArgumentException -> 0x0101 }
        r2 = 2131624054; // 0x7f0e0076 float:1.8875277E38 double:1.053162215E-314;
        r1 = r1.getColor(r2);	 Catch:{ IllegalArgumentException -> 0x0101 }
        r0.setStatusBarColor(r1);	 Catch:{ IllegalArgumentException -> 0x0101 }
    L_0x00f4:
        return;
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = r9.H;
        r0 = r0.getWidth();
        r0 = r0 - r1;
        goto L_0x007e;
    L_0x00ff:
        r0 = move-exception;
        throw r0;
    L_0x0101:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.c(boolean):void");
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case v.m /*0*/:
                return new Builder(this).setTitle(2131231372).setMessage(getString(2131231370, new Object[]{getString(2131230939)})).setCancelable(false).setPositiveButton(2131231371, new p4(this)).create();
            case at.g /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setTitle(getString(2131231814));
                progressDialog.setMessage(getString(2131231813));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            default:
                return null;
        }
    }

    private Fragment o() {
        return (Fragment) a(this.r);
    }

    public void onDestroy() {
        Log.i(L[28]);
        super.onDestroy();
        App.a((a_) this);
        App.a((aau) this);
        this.p.b();
        App.z().getSharedPreferences(L[27], 0).unregisterOnSharedPreferenceChangeListener(this);
    }

    public HomeActivity() {
        this.J = a2c.a();
        this.w = new asl(this);
        this.z = (InputMethodManager) App.z().getSystemService(L[1]);
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        try {
            super.onRestoreInstanceState(bundle);
            if (bundle.getBoolean(L[24])) {
                p();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r6 = this;
        r3 = 3;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = L;	 Catch:{ IllegalArgumentException -> 0x004e }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x004e }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalArgumentException -> 0x004e }
        r1 = r6.p;	 Catch:{ IllegalArgumentException -> 0x004e }
        r2 = com.whatsapp.t4.ON_RESUME;	 Catch:{ IllegalArgumentException -> 0x004e }
        r1.b(r2);	 Catch:{ IllegalArgumentException -> 0x004e }
        r1 = r6.x;	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r1 == 0) goto L_0x001c;
    L_0x0016:
        r1 = 0;
        r6.x = r1;	 Catch:{ IllegalArgumentException -> 0x004e }
        r6.j();	 Catch:{ IllegalArgumentException -> 0x004e }
    L_0x001c:
        super.onResume();	 Catch:{ IllegalArgumentException -> 0x0050 }
        r1 = com.whatsapp.App.ay;	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r1 == 0) goto L_0x0031;
    L_0x0023:
        r1 = com.whatsapp.App.aK;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r1 = r1.E();	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r1 == 0) goto L_0x0031;
    L_0x002b:
        r1 = com.whatsapp.App.t(r6);	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r1 == r3) goto L_0x0054;
    L_0x0031:
        r0 = L;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = L;
        r0 = r0[r3];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r6.finish();
    L_0x004d:
        return;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        com.whatsapp.notification.d.a();	 Catch:{ IllegalArgumentException -> 0x00bf }
        r1 = com.whatsapp.App.g;	 Catch:{ IllegalArgumentException -> 0x00bf }
        r1.stop();	 Catch:{ IllegalArgumentException -> 0x00bf }
        r1 = com.whatsapp.App.aI();	 Catch:{ IllegalArgumentException -> 0x00bf }
        if (r1 == 0) goto L_0x0067;
    L_0x0062:
        r6.b();	 Catch:{ IllegalArgumentException -> 0x00c1 }
        if (r0 == 0) goto L_0x0091;
    L_0x0067:
        r1 = com.whatsapp.App.Y;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r1 == 0) goto L_0x0075;
    L_0x006b:
        r1 = new com.whatsapp.DialogToastActivity$ClockWrongDialogFragment;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r6.a(r1);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        if (r0 == 0) goto L_0x0091;
    L_0x0075:
        r1 = com.whatsapp.App.r;	 Catch:{ IllegalArgumentException -> 0x00c7 }
        if (r1 == 0) goto L_0x0083;
    L_0x0079:
        r1 = new com.whatsapp.DialogToastActivity$SoftwareExpiredDialogFragment;	 Catch:{ IllegalArgumentException -> 0x00c9 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00c9 }
        r6.a(r1);	 Catch:{ IllegalArgumentException -> 0x00c9 }
        if (r0 == 0) goto L_0x0091;
    L_0x0083:
        r1 = com.whatsapp.App.aC();	 Catch:{ IllegalArgumentException -> 0x00cb }
        if (r1 == 0) goto L_0x0091;
    L_0x0089:
        r1 = new com.whatsapp.DialogToastActivity$SoftwareAboutToExpireDialogFragment;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00cb }
        r6.b(r1);	 Catch:{ IllegalArgumentException -> 0x00cb }
    L_0x0091:
        r1 = r6.r;	 Catch:{ IllegalArgumentException -> 0x00cd }
        if (r1 != 0) goto L_0x00a5;
    L_0x0095:
        r1 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1 = r1.M();	 Catch:{ IllegalArgumentException -> 0x00cd }
        r2 = new com.whatsapp.lr;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r2.<init>(r6);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r1.postDelayed(r2, r4);	 Catch:{ IllegalArgumentException -> 0x00cd }
    L_0x00a5:
        r1 = com.whatsapp.Voip.d();	 Catch:{ IllegalArgumentException -> 0x00cf }
        if (r1 == 0) goto L_0x00b0;
    L_0x00ab:
        r6.r();	 Catch:{ IllegalArgumentException -> 0x00d1 }
        if (r0 == 0) goto L_0x00b7;
    L_0x00b0:
        r0 = r6.F;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00b7:
        r0 = r6.p;
        r1 = com.whatsapp.t4.ON_RESUME;
        r0.a(r1);
        goto L_0x004d;
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c7 }
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onResume():void");
    }

    private boolean s() {
        try {
            return this.H.getVisibility() == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void onStart() {
        this.p.b(t4.ON_START);
        super.onStart();
        this.p.a(t4.ON_START);
    }

    static void f(HomeActivity homeActivity) {
        homeActivity.q();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r8) {
        /*
        r7 = this;
        r6 = 3;
        r5 = 1;
        r3 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        super.onPrepareOptionsMenu(r8);
        r7.s = r8;
        r1 = r8.size();
        if (r1 != 0) goto L_0x0148;
    L_0x0010:
        r1 = 2131755047; // 0x7f100027 float:1.9140962E38 double:1.053226934E-314;
        r2 = 2131231845; // 0x7f080465 float:1.8079783E38 double:1.052968438E-314;
        r1 = r8.add(r3, r1, r3, r2);
        r2 = 2130839445; // 0x7f020795 float:1.72839E38 double:1.0527745666E-314;
        r1 = r1.setIcon(r2);
        r2 = 2;
        android.support.v4.view.MenuItemCompat.setShowAsAction(r1, r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 1;
        r2 = 2131755040; // 0x7f100020 float:1.9140948E38 double:1.0532269306E-314;
        r3 = 0;
        r4 = 2131231434; // 0x7f0802ca float:1.8078949E38 double:1.052968235E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2130839442; // 0x7f020792 float:1.7283895E38 double:1.052774565E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r1 = r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r7.t = r1;	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = r7.t;	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2;
        android.support.v4.view.MenuItemCompat.setShowAsAction(r1, r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 1;
        r2 = 2131755020; // 0x7f10000c float:1.9140907E38 double:1.0532269207E-314;
        r3 = 0;
        r4 = 2131230916; // 0x7f0800c4 float:1.8077898E38 double:1.052967979E-314;
        r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 2;
        r2 = 2131755042; // 0x7f100022 float:1.9140952E38 double:1.0532269316E-314;
        r3 = 0;
        r4 = 2131231433; // 0x7f0802c9 float:1.8078947E38 double:1.0529682344E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2130839430; // 0x7f020786 float:1.728387E38 double:1.052774559E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r1 = r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2;
        android.support.v4.view.MenuItemCompat.setShowAsAction(r1, r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 2;
        r2 = 2131755043; // 0x7f100023 float:1.9140954E38 double:1.053226932E-314;
        r3 = 0;
        r4 = 2131231429; // 0x7f0802c5 float:1.8078939E38 double:1.0529682324E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2130839513; // 0x7f0207d9 float:1.7284039E38 double:1.0527746E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 2;
        r2 = 2131755039; // 0x7f10001f float:1.9140946E38 double:1.05322693E-314;
        r3 = 0;
        r4 = 2131231430; // 0x7f0802c6 float:1.807894E38 double:1.052968233E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2130839507; // 0x7f0207d3 float:1.7284027E38 double:1.052774597E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 98;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 2;
        r2 = 2131755046; // 0x7f100026 float:1.914096E38 double:1.0532269336E-314;
        r3 = 0;
        r4 = 2131231441; // 0x7f0802d1 float:1.8078963E38 double:1.0529682383E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2130839523; // 0x7f0207e3 float:1.7284059E38 double:1.052774605E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 2;
        r2 = 2131755052; // 0x7f10002c float:1.9140972E38 double:1.0532269365E-314;
        r3 = 0;
        r4 = 2131231439; // 0x7f0802cf float:1.807896E38 double:1.0529682373E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 3;
        r2 = 2131755041; // 0x7f100021 float:1.914095E38 double:1.053226931E-314;
        r3 = 0;
        r4 = 2131231435; // 0x7f0802cb float:1.807895E38 double:1.0529682354E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2130839422; // 0x7f02077e float:1.7283854E38 double:1.052774555E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r1 = r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2;
        android.support.v4.view.MenuItemCompat.setShowAsAction(r1, r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 3;
        r2 = 2131755044; // 0x7f100024 float:1.9140956E38 double:1.0532269326E-314;
        r3 = 0;
        r4 = 2131231436; // 0x7f0802cc float:1.8078953E38 double:1.052968236E-314;
        r4 = r7.getString(r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2130839517; // 0x7f0207dd float:1.7284047E38 double:1.052774602E-314;
        r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 4;
        r2 = 2131755053; // 0x7f10002d float:1.9140974E38 double:1.053226937E-314;
        r3 = 0;
        r4 = 2131231440; // 0x7f0802d0 float:1.8078961E38 double:1.052968238E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2130839522; // 0x7f0207e2 float:1.7284057E38 double:1.0527746046E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = 4;
        r2 = 2131755049; // 0x7f100029 float:1.9140966E38 double:1.053226935E-314;
        r3 = 0;
        r4 = 2131231438; // 0x7f0802ce float:1.8078957E38 double:1.052968237E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 2130839520; // 0x7f0207e0 float:1.7284053E38 double:1.0527746036E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1 = com.whatsapp.App.am;	 Catch:{ IllegalArgumentException -> 0x014e }
        if (r1 != r6) goto L_0x0148;
    L_0x012e:
        r1 = 4;
        r2 = 2131755034; // 0x7f10001a float:1.9140936E38 double:1.0532269276E-314;
        r3 = 0;
        r4 = 2131231428; // 0x7f0802c4 float:1.8078937E38 double:1.052968232E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x014e }
        r2 = r7.getResources();	 Catch:{ IllegalArgumentException -> 0x014e }
        r3 = 2130839640; // 0x7f020858 float:1.7284296E38 double:1.052774663E-314;
        r2 = r2.getDrawable(r3);	 Catch:{ IllegalArgumentException -> 0x014e }
        r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x014e }
    L_0x0148:
        r1 = r7.r;	 Catch:{ IllegalArgumentException -> 0x0184 }
        switch(r1) {
            case 0: goto L_0x0150;
            case 1: goto L_0x0161;
            case 2: goto L_0x0172;
            default: goto L_0x014d;
        };
    L_0x014d:
        return r5;
    L_0x014e:
        r0 = move-exception;
        throw r0;
    L_0x0150:
        r1 = 1;
        r2 = 1;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0186 }
        r1 = 2;
        r2 = 0;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0186 }
        r1 = 3;
        r2 = 0;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0186 }
        if (r0 == 0) goto L_0x014d;
    L_0x0161:
        r1 = 1;
        r2 = 0;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0182 }
        r1 = 2;
        r2 = 1;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0182 }
        r1 = 3;
        r2 = 0;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0182 }
        if (r0 == 0) goto L_0x014d;
    L_0x0172:
        r0 = 1;
        r1 = 0;
        r8.setGroupVisible(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
        r0 = 2;
        r1 = 0;
        r8.setGroupVisible(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
        r0 = 3;
        r1 = 1;
        r8.setGroupVisible(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
        goto L_0x014d;
    L_0x0182:
        r0 = move-exception;
        throw r0;
    L_0x0184:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0186 }
    L_0x0186:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0182 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    static {
        String[] strArr = new String[29];
        String str = "\u0012\u001e\u001f\rc\u0004";
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
                        i3 = 96;
                        break;
                    case at.g /*1*/:
                        i3 = 113;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = 10;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\b\u001e\u00057%\u0012\u0014\u001b'g\u0005^\u0006='\r\u0014E=xM\u001c\u001b5y\u0014\u001e\u001a7'\u0004\u0013";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0003\u001e\u0006$o\u0012\u0002\t&c\u000f\u001f\u001brh\u000f\u0004\u00061o@\u0005\u0007rg\u0001\u0018\u0006";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\b\u001e\u00057%\u0012\u0014\u001b'g\u0005";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0013\u0014\t i\b";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0014\u0003\t<y\f\u0010\u001c;e\u000e(";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0006\u001e\u001a1o\u0004.\u00043d\u0007\u0004\t5o";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0003\u001e\u0005|}\b\u0010\u001c!k\u0010\u0001F;d\u0014\u0014\u0006&$\u0001\u0012\u001c;e\u000e_+\u0013F,\"";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\b\u001e\u00057%\u0004\u0014\u001e;i\u0005\\\u0006=~M\u0002\u001d\"z\u000f\u0003\u001c7n";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    str = "\b\u001e\u00057%\u0003\u001d\u00071aM\u0006\u001a=d\u0007";
                    obj = 9;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "\b\u001e\u00057%\u0003\u0003\r3~\u0005^\u0006='\r\u0014E=xM\u001c\u001b5y\u0014\u001e\u001a7'\u0004\u0013";
                    obj = 10;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\b\u001e\u00057%\u0013\u0006E7r\u0010\u0018\u001a7n";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0003\u001e\u0005|}\b\u0010\u001c!k\u0010\u00017\"x\u0005\u0017\r o\u000e\u0012\r!";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0003\u001e\u0006$o\u0012\u0002\t&c\u000f\u001f\u001brh\u000f\u0004\u00061o@\u0005\u0007rg\u0001\u0018\u0006";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\b\u001e\u00057%\u0003\u0003\r3~\u0005";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "(\u001e\u00057K\u0003\u0005\u0001$c\u0014\b!<c\u0014";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "!#/\rC.8<\u001bK,.8\u001dY)%!\u001dD";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "!#/\rC.8<\u001bK,.8\u001dY)%!\u001dD";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0005\t\u0001&U\u0007\u0003\u0007'z?\u001b\u00016";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0003\u001e\u0005|}\b\u0010\u001c!k\u0010\u0001F;d\u0014\u0014\u0006&$\u0001\u0012\u001c;e\u000e_+\u0013F,\"";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    str = "\u0005\u001f\f\rm\u0012\u001e\u001d\"U\n\u0018\f";
                    obj = 20;
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    strArr2 = strArr3;
                    str = "\b\u001e\u00057%\u000e\u0014\u001f;d\u0014\u0014\u0006&";
                    obj = 21;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\b\u001e\u00057%\u0010\u0010\u001d!o";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0013\u0014\t i\b";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0014\u0003\t<y\f\u0010\u001c;e\u000e(";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0003\u001e\u0005|}\b\u0010\u001c!k\u0010\u0001F\u0013n\u0016\u0010\u00061o\u0004";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0003\u001e\u0005|}\b\u0010\u001c!k\u0010\u00017\"x\u0005\u0017\r o\u000e\u0012\r!";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\b\u001e\u00057%\u0004\u0014\u001b&x\u000f\b";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    L = strArr3;
                    try {
                        K = true;
                        try {
                            E = VERSION.SDK_INT >= 21 ? 250 : 220;
                            A = VERSION.SDK_INT >= 21 ? 250 : 220;
                            return;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                default:
                    strArr2[i] = str;
                    str = "\t\u001f\u0018'~?\u001c\r&b\u000f\u0015";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q() {
        /*
        r8 = this;
        r0 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
    L_0x0003:
        r2 = 3;
        if (r0 >= r2) goto L_0x005d;
    L_0x0006:
        r2 = r8.D;
        r2 = com.whatsapp.c6.a(r2, r0);
        r3 = r2.d;	 Catch:{ IllegalArgumentException -> 0x005e }
        if (r3 <= 0) goto L_0x003e;
    L_0x0010:
        r3 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0060 }
        r4 = 0;
        r3.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0060 }
        r3 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0060 }
        r4 = java.text.NumberFormat.getInstance();	 Catch:{ IllegalArgumentException -> 0x0060 }
        r5 = r2.d;	 Catch:{ IllegalArgumentException -> 0x0060 }
        r6 = (long) r5;	 Catch:{ IllegalArgumentException -> 0x0060 }
        r4 = r4.format(r6);	 Catch:{ IllegalArgumentException -> 0x0060 }
        r3.setText(r4);	 Catch:{ IllegalArgumentException -> 0x0060 }
        r3 = r8.r;	 Catch:{ IllegalArgumentException -> 0x0060 }
        if (r0 != r3) goto L_0x0034;
    L_0x002a:
        r3 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0062 }
        r4 = 2130839784; // 0x7f0208e8 float:1.7284588E38 double:1.052774734E-314;
        r3.setBackgroundResource(r4);	 Catch:{ IllegalArgumentException -> 0x0062 }
        if (r1 == 0) goto L_0x0045;
    L_0x0034:
        r3 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r4 = 2130839785; // 0x7f0208e9 float:1.728459E38 double:1.0527747346E-314;
        r3.setBackgroundResource(r4);	 Catch:{ IllegalArgumentException -> 0x0064 }
        if (r1 == 0) goto L_0x0045;
    L_0x003e:
        r3 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r4 = 8;
        r3.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x0045:
        r3 = r8.r;	 Catch:{ IllegalArgumentException -> 0x0066 }
        if (r0 != r3) goto L_0x0051;
    L_0x0049:
        r3 = r2.a;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r4 = -1;
        r3.setTextColor(r4);	 Catch:{ IllegalArgumentException -> 0x0068 }
        if (r1 == 0) goto L_0x0059;
    L_0x0051:
        r2 = r2.a;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r3 = -2130706433; // 0xffffffff80ffffff float:-2.3509886E-38 double:NaN;
        r2.setTextColor(r3);	 Catch:{ IllegalArgumentException -> 0x0068 }
    L_0x0059:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0003;
    L_0x005d:
        return;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.q():void");
    }

    static Toolbar i(HomeActivity homeActivity) {
        return homeActivity.q;
    }
}
