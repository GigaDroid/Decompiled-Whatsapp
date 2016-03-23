package com.whatsapp;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.cs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

public class MessageDetailsActivity extends DialogToastActivity {
    public static String v;
    public static String y;
    private static final String[] z;
    private final akc n;
    private ConversationRow o;
    private ArrayList p;
    private final a2_ q;
    private final tm r;
    private long s;
    private final Runnable t;
    private ListView u;
    private co w;
    private BaseAdapter x;

    static ConversationRow a(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.o;
    }

    private boolean a(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            if (!str.equals(((au7) it.next()).a)) {
                if (z) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    static void f(MessageDetailsActivity messageDetailsActivity) {
        messageDetailsActivity.a();
    }

    static {
        Object obj = -1;
        String[] strArr = new String[3];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "[\u0014C\u0002\u001eQ\u0014T\u0014\u000bW\u0018\\\u0002PU\u0003U\u0010\u000bS";
        Object obj2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 54;
                        break;
                    case at.g /*1*/:
                        i3 = 113;
                        break;
                    case at.i /*2*/:
                        i3 = 48;
                        break;
                    case at.o /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 127;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "[\u0014C\u0002\u001eQ\u0014T\u0014\u000bW\u0018\\\u0002PR\u0014C\u0005\rY\b";
                    obj2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    String str2 = "]\u0014I.\u0016R";
                    while (true) {
                        char[] toCharArray2 = str2.toCharArray();
                        i3 = toCharArray2.length;
                        char[] cArr2 = toCharArray2;
                        for (i = 0; i3 > i; i++) {
                            int i4;
                            char c2 = cArr2[i];
                            switch (i % 5) {
                                case v.m /*0*/:
                                    i4 = 54;
                                    break;
                                case at.g /*1*/:
                                    i4 = 113;
                                    break;
                                case at.i /*2*/:
                                    i4 = 48;
                                    break;
                                case at.o /*3*/:
                                    i4 = 113;
                                    break;
                                default:
                                    i4 = 127;
                                    break;
                            }
                            cArr2[i] = (char) (i4 ^ c2);
                        }
                        str2 = new String(cArr2).intern();
                        switch (obj) {
                            case v.m /*0*/:
                                v = str2;
                                return;
                            default:
                                y = str2;
                                str2 = "]\u0014I.\rS\u001c_\u0005\u001ai\u001bY\u0015";
                                obj = null;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "[\u0014C\u0002\u001eQ\u0014T\u0014\u000bW\u0018\\\u0002P";
                    i = 1;
                    strArr2 = strArr3;
                    obj2 = null;
                    break;
            }
        }
    }

    static CharSequence a(MessageDetailsActivity messageDetailsActivity, long j) {
        return messageDetailsActivity.a(j);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    static void c(MessageDetailsActivity messageDetailsActivity) {
        messageDetailsActivity.b();
    }

    static a2_ h(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.q;
    }

    public void onDestroy() {
        Log.i(z[2]);
        super.onDestroy();
        this.q.a();
        App.p.M().removeCallbacks(this.t);
        App.aK.a(this.n);
        App.a(this.r);
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

    private CharSequence a(long j) {
        return cs.k(getBaseContext(), App.b(j));
    }

    private void a() {
        int i;
        int i2;
        boolean z = DialogToastActivity.f;
        this.p.clear();
        this.s = Long.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (Entry entry : App.aK.e(this.w.k).a.entrySet()) {
            x4 x4Var = (x4) entry.getValue();
            this.p.add(new au7((String) entry.getKey(), x4Var));
            long a = x4Var.a(5);
            long a2 = x4Var.a(13);
            long a3 = x4Var.a(8);
            if (a != 0) {
                this.s = Math.min(this.s, a);
                i = i5 + 1;
            } else {
                i = i5;
            }
            if (a2 != 0) {
                this.s = Math.min(this.s, a2);
                i2 = i3 + 1;
            } else {
                i2 = i3;
            }
            if (a3 != 0) {
                this.s = Math.min(this.s, a3);
                i5 = i4 + 1;
            } else {
                i5 = i4;
            }
            if (z) {
                break;
            }
            i3 = i2;
            i4 = i5;
            i5 = i;
        }
        i = i5;
        i2 = i3;
        i5 = i4;
        if (qm.i(this.w.k.c) || l5.g(this.w.k.c)) {
            if (i5 < this.w.L && this.w.c == 2 && this.w.r == 1) {
                this.p.add(new auf(this.w.L - i5, 8));
            }
            if (i2 < this.w.L) {
                this.p.add(new auf(this.w.L - i2, 13));
            }
            if (i < this.w.L) {
                this.p.add(new auf(this.w.L - i, 5));
            }
        }
        Collections.sort(this.p, new am9(this));
        if (this.x != null) {
            this.x.notifyDataSetChanged();
        }
        b();
    }

    static co e(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.w;
    }

    static BaseAdapter g(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.x;
    }

    static ListView d(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.u;
    }

    static boolean a(MessageDetailsActivity messageDetailsActivity, String str) {
        return messageDetailsActivity.a(str);
    }

    static ArrayList b(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.p;
    }

    public MessageDetailsActivity() {
        this.q = new a2_();
        this.p = new ArrayList();
        this.n = new ati(this);
        this.r = new a5s(this);
        this.t = new pw(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
        r13 = this;
        r12 = -1;
        r9 = -2;
        r3 = 1;
        r11 = 0;
        r1 = 0;
        r6 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = 9;
        r13.supportRequestWindowFeature(r0);
        r0 = 9;
        r13.requestWindowFeature(r0);
        super.onCreate(r14);
        r0 = r13.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r3);
        r0 = 2130903224; // 0x7f0300b8 float:1.741326E38 double:1.0528060776E-314;
        r13.setContentView(r0);
        r0 = r13.getSupportActionBar();
        r2 = new android.graphics.drawable.ColorDrawable;
        r4 = r13.getResources();
        r5 = 2131624053; // 0x7f0e0075 float:1.8875275E38 double:1.0531622144E-314;
        r4 = r4.getColor(r5);
        r2.<init>(r4);
        r0.setBackgroundDrawable(r2);
        r0.setDisplayShowHomeEnabled(r1);
        r0 = r13.getIntent();
        if (r0 != 0) goto L_0x004c;
    L_0x0048:
        r13.finish();
    L_0x004b:
        return;
    L_0x004c:
        r4 = com.whatsapp.App.aK;
        r5 = new com.whatsapp.protocol.c3;
        r7 = v;
        r7 = r0.getStringExtra(r7);
        r8 = y;
        r0 = r0.getStringExtra(r8);
        r5.<init>(r7, r3, r0);
        r0 = r4.a(r5);
        r13.w = r0;
        r0 = r13.w;
        if (r0 != 0) goto L_0x006d;
    L_0x0069:
        r13.finish();
        goto L_0x004b;
    L_0x006d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r4 = r4[r3];
        r0 = r0.append(r4);
        r4 = r13.w;
        r4 = r4.k;
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r13.a();
        r0 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r13.u = r0;
        r0 = r13.w;
        r0 = com.whatsapp.ConversationRowsActivity.a(r13, r0);
        r13.o = r0;
        r0 = r13.o;
        r0.setOnLongClickListener(r11);
        r0 = r13.getLayoutInflater();
        r4 = 2130903225; // 0x7f0300b9 float:1.7413262E38 double:1.052806078E-314;
        r0 = com.whatsapp.aam.a(r0, r4, r11, r1);
        r0 = (android.view.ViewGroup) r0;
        r4 = 2131755349; // 0x7f100155 float:1.9141575E38 double:1.0532270833E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.view.ViewGroup) r4;
        r5 = r13.o;
        r4.addView(r5, r12, r9);
        r5 = r13.getWindowManager();
        r5 = r5.getDefaultDisplay();
        r5 = r5.getWidth();
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7);
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r1);
        r4.measure(r5, r7);
        r5 = r13.getWindowManager();
        r5 = r5.getDefaultDisplay();
        r5 = r5.getHeight();
        r5 = r5 / 2;
        r7 = r4.getMeasuredHeight();
        if (r7 <= r5) goto L_0x0191;
    L_0x00ec:
        if (r3 == 0) goto L_0x00fc;
    L_0x00ee:
        r7 = r13.u;
        r7 = r7.getViewTreeObserver();
        r8 = new com.whatsapp.aim;
        r8.<init>(r13);
        r7.addOnGlobalLayoutListener(r8);
    L_0x00fc:
        r7 = r13.u;
        r7.addHeaderView(r0, r11, r1);
        r7 = new android.widget.ImageView;
        r7.<init>(r13);
        r8 = 2130839374; // 0x7f02074e float:1.7283757E38 double:1.0527745315E-314;
        r7.setImageResource(r8);
        r8 = android.widget.ImageView.ScaleType.FIT_XY;
        r7.setScaleType(r8);
        r8 = r13.u;
        r8.addHeaderView(r7, r11, r1);
        r7 = new android.view.View;
        r7.<init>(r13);
        r8 = new android.widget.AbsListView$LayoutParams;
        r9 = r13.getResources();
        r10 = 2131427424; // 0x7f0b0060 float:1.8476464E38 double:1.053065067E-314;
        r9 = r9.getDimensionPixelSize(r10);
        r8.<init>(r12, r9);
        r7.setLayoutParams(r8);
        r8 = r13.u;
        r8.addFooterView(r7, r11, r1);
        r1 = r13.w;
        r1 = r1.k;
        r1 = r1.c;
        r1 = com.whatsapp.qm.i(r1);
        if (r1 != 0) goto L_0x014b;
    L_0x013f:
        r1 = r13.w;
        r1 = r1.k;
        r1 = r1.c;
        r1 = com.whatsapp.l5.g(r1);
        if (r1 == 0) goto L_0x0154;
    L_0x014b:
        r1 = new com.whatsapp.u3;
        r1.<init>(r13);
        r13.x = r1;
        if (r6 == 0) goto L_0x015b;
    L_0x0154:
        r1 = new com.whatsapp.c4;
        r1.<init>(r13, r11);
        r13.x = r1;
    L_0x015b:
        r1 = r13.u;
        r7 = r13.x;
        r1.setAdapter(r7);
        r1 = com.whatsapp.wallpaper.k.g(r13);
        if (r1 == 0) goto L_0x0172;
    L_0x0168:
        r7 = new com.whatsapp.at;
        r7.<init>(r13, r1, r0);
        r0.setBackgroundDrawable(r7);
        if (r6 == 0) goto L_0x0178;
    L_0x0172:
        r1 = 2131623988; // 0x7f0e0034 float:1.8875143E38 double:1.0531621823E-314;
        r0.setBackgroundResource(r1);
    L_0x0178:
        r6 = r13.u;
        r0 = new com.whatsapp.w9;
        r1 = r13;
        r0.<init>(r1, r2, r3, r4, r5);
        r6.setOnScrollListener(r0);
        r0 = com.whatsapp.App.aK;
        r1 = r13.n;
        r0.b(r1);
        r0 = r13.r;
        com.whatsapp.App.b(r0);
        goto L_0x004b;
    L_0x0191:
        r3 = r1;
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MessageDetailsActivity.onCreate(android.os.Bundle):void");
    }

    private void b() {
        App.p.M().removeCallbacks(this.t);
        if (this.s != Long.MAX_VALUE) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.s;
            if (j < 3600000) {
                App.p.M().postDelayed(this.t, (((this.s + ((j / 60000) * 60000)) + 60000) - currentTimeMillis) + 1000);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            if (j < 86400000) {
                App.p.M().postDelayed(this.t, (((((j / 3600000) * 3600000) + this.s) + 3600000) - currentTimeMillis) + 1000);
            }
        }
    }
}
