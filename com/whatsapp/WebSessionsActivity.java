package com.whatsapp;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog.Builder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.qrcode.QrCodeActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;
import org.v;
import org.whispersystems.at;

public class WebSessionsActivity extends DialogToastActivity {
    private static final String[] z;
    private ny n;
    private nh o;
    private View p;
    private View q;
    private final Runnable r;
    private HashMap s;

    public class LogoutAllConfirmationDialogFragment extends DialogFragment {
        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(2131230937).setNegativeButton(2131230884, null).setPositiveButton(2131231413, new w4(this)).create();
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "X\u0002+xh\\\u0014 dc\\H-n~[\u0015&r";
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
                        i3 = 47;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 73;
                        break;
                    case at.o /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "X\u0002+%zG\u0006=xl_\u0017ghbB";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "X\u0002+xh\\\u0014 dc\\H*yhN\u0013,";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static HashMap b(WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.s;
    }

    static ny c(WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.n;
    }

    private void a() {
        if (App.Q()) {
            startActivity(new Intent(this, QrCodeActivity.class));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.a(getBaseContext(), 2131231518, 0);
    }

    static void a(WebSessionsActivity webSessionsActivity, String str, long j) {
        webSessionsActivity.a(str, j);
    }

    private void a(String str, long j) {
        if (((CountDownTimer) this.s.get(str)) == null) {
            this.s.put(str, new ae_(this, j - System.currentTimeMillis(), 60000, str).start());
        }
    }

    static Runnable e(WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.r;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() != 2131755046) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            a();
            return true;
        }
    }

    static void a(WebSessionsActivity webSessionsActivity, String str) {
        webSessionsActivity.a(str);
    }

    private void a(String str) {
        CountDownTimer countDownTimer = (CountDownTimer) this.s.get(str);
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.s.remove(str);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755046, 0, 2131231437).setIcon(2130839421), 2);
        return true;
    }

    public WebSessionsActivity() {
        this.o = new u5(this);
        this.r = new i5(this);
    }

    static View a(WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.p;
    }

    public void onDestroy() {
        boolean z = DialogToastActivity.f;
        Log.i(z[0]);
        super.onDestroy();
        wn.b(this.o);
        App.p.M().removeCallbacks(this.r);
        for (CountDownTimer cancel : this.s.values()) {
            cancel.cancel();
            if (z) {
                return;
            }
        }
    }

    static View d(WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.q;
    }

    protected void onCreate(Bundle bundle) {
        Log.i(z[1]);
        super.onCreate(bundle);
        this.s = new HashMap();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        setContentView(2130903298);
        ListView listView = (ListView) findViewById(16908298);
        View a = aam.a(getLayoutInflater(), 2130903300, null, false);
        this.q = a.findViewById(2131755330);
        a4d.b((TextView) a.findViewById(2131755989));
        listView.addHeaderView(a, null, false);
        a = aam.a(getLayoutInflater(), 2130903299, null, false);
        this.p = a.findViewById(2131755481);
        a.findViewById(2131755988).setOnClickListener(new zr(this));
        ((TextView) a.findViewById(2131755866)).setText(getString(2131231716, new Object[]{z[2]}));
        listView.addFooterView(a, null, false);
        this.n = new ny(this, null);
        this.n.a(wn.e());
        if (this.n.getCount() == 0) {
            a();
            finish();
            return;
        }
        listView.setVisibility(0);
        listView.setAdapter(this.n);
        listView.setOnItemClickListener(new fq(this));
        App.p.M().postDelayed(this.r, 30000);
        wn.a(this.o);
    }
}
