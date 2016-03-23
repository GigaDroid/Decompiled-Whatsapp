package com.whatsapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.design.R;
import android.view.View;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class TosUpdateActivity extends DialogToastActivity {
    private static final String[] z;
    private int n;
    private boolean o;
    private boolean p;

    static {
        String[] strArr = new String[8];
        String str = "\u0012Yl\tp\b]";
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
                        i3 = 125;
                        break;
                    case at.g /*1*/:
                        i3 = 41;
                        break;
                    case at.i /*2*/:
                        i3 = 24;
                        break;
                    case at.o /*3*/:
                        i3 = 86;
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
                    str = "\u0012Yl\tp\b]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\tFk#o\u0019Hl30\u0019Lk\"m\u0012P";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\tFk#o\u0019Hl30\u000fLk#r\u0018";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000fLy22\tLj;l";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001c\\l9r\u001c]q9q\"]w%@\bY|7k\u0018vk\"~\u001aL";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\tFk#o\u0019Hl30\u001e[}7k\u0018";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\tFk#o\u0019Hl30\u0012Gy5k\u0014_q\"f\u000fLk#s\t\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
        r13 = this;
        r12 = 2131755912; // 0x7f100388 float:1.9142717E38 double:1.0532273614E-314;
        r11 = 2130839477; // 0x7f0207b5 float:1.7283966E38 double:1.0527745824E-314;
        r10 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r13.b(r2);
        r13.a(r2);
        super.onCreate(r14);
        r0 = r13.getLayoutInflater();
        r1 = 2130903281; // 0x7f0300f1 float:1.7413376E38 double:1.0528061058E-314;
        r4 = 0;
        r0 = com.whatsapp.aam.a(r0, r1, r4, r2);
        r13.setContentView(r0);
        r0 = com.whatsapp.App.j;
        r1 = 3;
        if (r0 != r1) goto L_0x0040;
    L_0x002f:
        r0 = r13.getIntent();
        r1 = z;
        r4 = 6;
        r1 = r1[r4];
        r0 = r0.getIntExtra(r1, r10);
        r13.n = r0;
        if (r3 == 0) goto L_0x0046;
    L_0x0040:
        r0 = com.whatsapp.vh.a(r13);
        r13.n = r0;
    L_0x0046:
        r0 = r13.n;
        if (r0 != r10) goto L_0x0068;
    L_0x004a:
        r0 = com.whatsapp.vh.c(r13);
        r4 = java.text.SimpleDateFormat.getDateInstance(r10);
        r5 = 2131232165; // 0x7f0805a5 float:1.8080432E38 double:1.052968596E-314;
        r6 = new java.lang.Object[r10];
        r7 = new java.util.Date;
        r7.<init>(r0);
        r0 = r4.format(r7);
        r6[r2] = r0;
        r0 = r13.getString(r5, r6);
        if (r3 == 0) goto L_0x006f;
    L_0x0068:
        r0 = 2131232166; // 0x7f0805a6 float:1.8080434E38 double:1.0529685965E-314;
        r0 = r13.getString(r0);
    L_0x006f:
        r4 = new android.text.SpannableStringBuilder;
        r0 = android.text.Html.fromHtml(r0);
        r4.<init>(r0);
        r0 = r4.length();
        r1 = android.text.style.URLSpan.class;
        r0 = r4.getSpans(r2, r0, r1);
        r0 = (android.text.style.URLSpan[]) r0;
        if (r0 == 0) goto L_0x00b8;
    L_0x0086:
        r5 = r0.length;
        r1 = r2;
    L_0x0088:
        if (r1 >= r5) goto L_0x00b8;
    L_0x008a:
        r6 = r0[r1];
        r7 = z;
        r8 = 5;
        r7 = r7[r8];
        r8 = r6.getURL();
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x00b4;
    L_0x009b:
        r7 = r4.getSpanStart(r6);
        r8 = r4.getSpanEnd(r6);
        r9 = r4.getSpanFlags(r6);
        r4.removeSpan(r6);
        r6 = new com.whatsapp.aow;
        r6.<init>(r13);
        r4.setSpan(r6, r7, r8, r9);
        if (r3 == 0) goto L_0x00b8;
    L_0x00b4:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0088;
    L_0x00b8:
        r0 = 2131755914; // 0x7f10038a float:1.914272E38 double:1.0532273624E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = android.text.method.LinkMovementMethod.getInstance();
        r0.setMovementMethod(r1);
        r0.setText(r4);
        r0 = 2131755916; // 0x7f10038c float:1.9142725E38 double:1.0532273634E-314;
        r0 = r13.findViewById(r0);
        r1 = new com.whatsapp.zu;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        r0 = r13.n;
        if (r0 != 0) goto L_0x00e3;
    L_0x00de:
        r13.a();
        if (r3 == 0) goto L_0x010d;
    L_0x00e3:
        r0 = r13.n;
        if (r0 != r10) goto L_0x0105;
    L_0x00e7:
        r0 = r13.findViewById(r12);
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.App.a1();
        if (r1 == 0) goto L_0x00f8;
    L_0x00f3:
        r0.setCompoundDrawablesWithIntrinsicBounds(r11, r2, r2, r2);
        if (r3 == 0) goto L_0x00fb;
    L_0x00f8:
        r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r11, r2);
    L_0x00fb:
        r1 = new com.whatsapp.zm;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        if (r3 == 0) goto L_0x010d;
    L_0x0105:
        r0 = r13.findViewById(r12);
        r1 = 4;
        r0.setVisibility(r1);
    L_0x010d:
        r0 = 2131755915; // 0x7f10038b float:1.9142723E38 double:1.053227363E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.Button) r0;
        com.whatsapp.a4d.a(r0);
        r1 = new com.whatsapp.z2;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        r13.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TosUpdateActivity.onCreate(android.os.Bundle):void");
    }

    private void a() {
        this.o = true;
        finish();
    }

    public void onResume() {
        super.onResume();
        Log.i(z[4]);
        if (App.j != 3 && vh.a(this) == 0) {
            a();
        }
    }

    private void c() {
        View findViewById = findViewById(2131755562);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new atp(this, findViewById));
    }

    static void b(TosUpdateActivity tosUpdateActivity) {
        tosUpdateActivity.b();
    }

    static boolean a(TosUpdateActivity tosUpdateActivity) {
        return tosUpdateActivity.p;
    }

    public void finish() {
        if (this.o) {
            super.finish();
        }
    }

    static void c(TosUpdateActivity tosUpdateActivity) {
        tosUpdateActivity.a();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case at.g /*1*/:
                if (i2 == 0 && intent != null) {
                    this.p = intent.getBooleanExtra(z[0], false);
                }
                Log.i(z[1] + this.p);
                if (DialogToastActivity.f) {
                    break;
                }
                return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    public void onDestroy() {
        Log.i(z[3]);
        super.onDestroy();
    }

    private void b() {
        Intent intent = new Intent(this, TosUpdateDetailsActivity.class);
        intent.putExtra(z[2], this.p);
        startActivityForResult(intent, 1);
        overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_fade_out);
    }
}
