package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.whatsapp.fieldstats.cd;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.wallpaper.k;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class BroadcastDetails extends DialogToastActivity {
    private static final String[] z;
    private final tm n;
    private l5 o;
    private final a2_ p;
    private final akc q;
    private zp r;
    private co s;
    private String[] t;

    static {
        String[] strArr = new String[4];
        String str = "\u000e2!p_\u000f!=e_\t4/xW\u001fo*tH\u00182!h";
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
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 64;
                        break;
                    case at.i /*2*/:
                        i3 = 78;
                        break;
                    case at.o /*3*/:
                        i3 = 17;
                        break;
                    default:
                        i3 = 59;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0005$";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u000e2!p_\u000f!=e";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000e2!p_\u000f!=e_\t4/xW\u001fo-c^\r4+";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static boolean a(BroadcastDetails broadcastDetails, l5 l5Var, int i) {
        return broadcastDetails.a(l5Var, i);
    }

    static l5 b(BroadcastDetails broadcastDetails) {
        return broadcastDetails.o;
    }

    static String[] d(BroadcastDetails broadcastDetails) {
        return broadcastDetails.t;
    }

    static zp c(BroadcastDetails broadcastDetails) {
        return broadcastDetails.r;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    static l5 a(BroadcastDetails broadcastDetails, l5 l5Var) {
        broadcastDetails.o = l5Var;
        return l5Var;
    }

    private boolean a(l5 l5Var, int i) {
        switch (i) {
            case v.m /*0*/:
                if (l5Var.l != null) {
                    ContactInfo.a(l5Var, (Activity) this);
                    break;
                }
                break;
            case at.g /*1*/:
                startActivity(Conversation.a(l5Var));
                break;
            case at.p /*4*/:
                App.a(l5Var, (Activity) this, cd.ANDROID_BROADCAST_DETAILS, false);
                break;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(2130903083);
        Log.i(z[1]);
        App.aK.b(this.q);
        App.b(this.n);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.s = App.aK.a(new c3(z[3], true, intent.getStringExtra(z[2])));
        if (this.s == null || this.s.t == null) {
            finish();
            return;
        }
        this.t = this.s.t.split(",");
        ListView listView = (ListView) findViewById(16908298);
        this.r = new zp(this, this);
        listView.setAdapter(this.r);
        listView.setOnItemClickListener(new u9(this));
        getSupportActionBar().setTitle(String.format(App.az.a(2131296264, this.t.length), new Object[]{Integer.valueOf(this.t.length)}));
        ((TextView) findViewById(2131755350)).setText(getString(2131230854, new Object[]{Integer.valueOf(this.t.length)}));
        View a = ConversationRowsActivity.a((Context) this, this.s);
        a.q();
        ViewGroup viewGroup = (ViewGroup) findViewById(2131755349);
        viewGroup.addView(a, -2, -2);
        ((LayoutParams) a.getChildAt(1).getLayoutParams()).rightMargin = 0;
        ((LayoutParams) a.getChildAt(1).getLayoutParams()).leftMargin = 0;
        ((LayoutParams) a.getChildAt(1).getLayoutParams()).addRule(11, 0);
        Drawable g = k.g(this);
        if (g != null) {
            a = findViewById(2131755348);
            a.setBackgroundDrawable(new p0(this, g, a));
        }
        View findViewById = findViewById(2131755348);
        viewGroup.measure(MeasureSpec.makeMeasureSpec(-1, 0), MeasureSpec.makeMeasureSpec(-2, 0));
        int height = getWindowManager().getDefaultDisplay().getHeight() / 2;
        if (viewGroup.getMeasuredHeight() > height) {
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(-1, height));
        }
    }

    static a2_ e(BroadcastDetails broadcastDetails) {
        return broadcastDetails.p;
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case at.o /*3*/:
                if (this.o == null) {
                    return super.onCreateDialog(i);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(getString(2131231445, new Object[]{this.o.i()}));
                arrayList2.add(Integer.valueOf(1));
                arrayList.add(getString(2131230866, new Object[]{this.o.i()}));
                arrayList2.add(Integer.valueOf(4));
                if (this.o.l != null) {
                    arrayList.add(getString(2131232228, new Object[]{this.o.i()}));
                    arrayList2.add(Integer.valueOf(0));
                }
                CharSequence[] charSequenceArr = new String[arrayList.size()];
                arrayList.toArray(charSequenceArr);
                Builder builder = new Builder(this);
                builder.setItems(charSequenceArr, new av4(this, arrayList2));
                Dialog create = builder.create();
                create.setOnCancelListener(new kp(this));
                create.requestWindowFeature(1);
                return create;
            default:
                return super.onCreateDialog(i);
        }
    }

    public BroadcastDetails() {
        this.p = new a2_();
        this.q = new akj(this);
        this.n = new xp(this);
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

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
        this.p.a();
        App.aK.a(this.q);
        App.a(this.n);
    }

    static co a(BroadcastDetails broadcastDetails) {
        return broadcastDetails.s;
    }
}
