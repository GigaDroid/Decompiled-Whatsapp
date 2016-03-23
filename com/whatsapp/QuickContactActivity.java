package com.whatsapp;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.support.v4.app.ActivityCompat;
import android.widget.ImageView;
import com.whatsapp.util.FloatingChildLayout;
import com.whatsapp.util.Log;
import java.util.Collection;
import org.v;
import org.whispersystems.at;

public class QuickContactActivity extends DialogToastActivity implements tm {
    private static final String[] z;
    private TextEmojiLabel n;
    private l5 o;
    private ImageView p;
    private FloatingChildLayout q;

    static {
        String[] strArr = new String[3];
        String str = "d\u0001\rtdv\u001b\ncnv\u0000\ryiz[\u0000r|a\u0006\u000bn";
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
                        i3 = 21;
                        break;
                    case at.g /*1*/:
                        i3 = 116;
                        break;
                    case at.i /*2*/:
                        i3 = 100;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 15;
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
                    str = "d\u0001\rtdv\u001b\ncnv\u0000\ryiz[\u0007ejt\u0000\u0001";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007f\u001d\u0000";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static l5 a(QuickContactActivity quickContactActivity) {
        return quickContactActivity.o;
    }

    static void d(QuickContactActivity quickContactActivity) {
        quickContactActivity.c();
    }

    public void b(String str) {
    }

    private void c() {
        if (this.q.e()) {
            c(true);
        }
    }

    static void a(QuickContactActivity quickContactActivity, boolean z) {
        quickContactActivity.c(z);
    }

    static FloatingChildLayout c(QuickContactActivity quickContactActivity) {
        return quickContactActivity.q;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[0]);
        App.a((tm) this);
    }

    public void a(Collection collection) {
    }

    static ImageView b(QuickContactActivity quickContactActivity) {
        return quickContactActivity.p;
    }

    private void b() {
        boolean z = DialogToastActivity.f;
        Bitmap a = this.o.a(getResources().getDimensionPixelSize(2131427535), 0.0f, false);
        if (a != null) {
            this.p.setImageBitmap(a);
            if (!z) {
                return;
            }
        }
        if (this.o.c()) {
            this.p.setImageResource(2130837615);
            if (!z) {
                return;
            }
        }
        if (this.o.m()) {
            this.p.setImageResource(2130837610);
            if (!z) {
                return;
            }
        }
        this.p.setImageResource(2130837613);
    }

    public void onBackPressed() {
        c(true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        r9 = 0;
        r8 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r7 = 0;
        r6 = 2131755870; // 0x7f10035e float:1.9142631E38 double:1.0532273407E-314;
        r5 = 8;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r2 = 2;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r10.getWindow();
        r2 = 12;
        r0.requestFeature(r2);
        super.onCreate(r11);
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r0 < r2) goto L_0x002f;
    L_0x0026:
        r0 = r10.getWindow();
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0.addFlags(r2);
    L_0x002f:
        r2 = r10.getIntent();
        r0 = com.whatsapp.App.as;
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r3 = r2.getStringExtra(r3);
        r0 = r0.b(r3);
        r10.o = r0;
        r0 = r10.getWindow();
        r3 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r4 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0.setFlags(r3, r4);
        r0 = 2130903256; // 0x7f0300d8 float:1.7413325E38 double:1.0528060934E-314;
        r10.setContentView(r0);
        r0 = 2131755869; // 0x7f10035d float:1.914263E38 double:1.05322734E-314;
        r0 = r10.findViewById(r0);
        r0 = (com.whatsapp.util.FloatingChildLayout) r0;
        r10.q = r0;
        r0 = r10.q;
        r3 = new com.whatsapp.r1;
        r3.<init>(r10);
        r0.setOnOutsideTouchListener(r3);
        r0 = r2.getSourceBounds();
        if (r0 == 0) goto L_0x007b;
    L_0x0070:
        r2 = r10.q;
        r2.setChildTargetScreen(r0);
        r0 = r10.q;
        r2 = 1;
        r0.setCircularReveal(r2);
    L_0x007b:
        r0 = 2131755466; // 0x7f1001ca float:1.9141812E38 double:1.053227141E-314;
        r0 = r10.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r10.n = r0;
        r0 = r10.n;
        r2 = r10.o;
        r0.setContact(r2);
        r0 = r10.o;
        r0 = r0.m;
        if (r0 != 0) goto L_0x00a3;
    L_0x0093:
        r0 = r10.o;
        r0 = r0.c();
        if (r0 != 0) goto L_0x00a3;
    L_0x009b:
        r0 = r10.o;
        r0 = r0.m();
        if (r0 == 0) goto L_0x00b6;
    L_0x00a3:
        r0 = 2131755504; // 0x7f1001f0 float:1.914189E38 double:1.05322716E-314;
        r0 = r10.findViewById(r0);
        r0.setVisibility(r9);
        r0 = r10.findViewById(r6);
        r0.setVisibility(r5);
        if (r1 == 0) goto L_0x00c7;
    L_0x00b6:
        r0 = 2131755504; // 0x7f1001f0 float:1.914189E38 double:1.05322716E-314;
        r0 = r10.findViewById(r0);
        r0.setVisibility(r5);
        r0 = r10.findViewById(r6);
        r0.setVisibility(r9);
    L_0x00c7:
        r0 = 2131755434; // 0x7f1001aa float:1.9141747E38 double:1.0532271253E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r10.p = r0;
        r10.b();
        r0 = r10.p;
        r2 = new com.whatsapp.b4;
        r2.<init>(r10);
        r0.setOnClickListener(r2);
        r0 = 2131755871; // 0x7f10035f float:1.9142634E38 double:1.053227341E-314;
        r0 = r10.findViewById(r0);
        r2 = new com.whatsapp.zg;
        r2.<init>(r10);
        r0.setOnClickListener(r2);
        r0 = 2131755873; // 0x7f100361 float:1.9142638E38 double:1.053227342E-314;
        r0 = r10.findViewById(r0);
        r2 = new com.whatsapp.gt;
        r2.<init>(r8, r7, r8, r7);
        r0.setOnTouchListener(r2);
        r2 = r10.o;
        r2 = r2.c();
        if (r2 != 0) goto L_0x010d;
    L_0x0105:
        r2 = r10.o;
        r2 = r2.m();
        if (r2 == 0) goto L_0x011c;
    L_0x010d:
        r0.setVisibility(r5);
        r2 = 2131755872; // 0x7f100360 float:1.9142636E38 double:1.0532273417E-314;
        r2 = r10.findViewById(r2);
        r2.setVisibility(r5);
        if (r1 == 0) goto L_0x0124;
    L_0x011c:
        r1 = new com.whatsapp.aw0;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
    L_0x0124:
        r0 = 2131755874; // 0x7f100362 float:1.914264E38 double:1.0532273427E-314;
        r0 = r10.findViewById(r0);
        r1 = new com.whatsapp.aoi;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
        r0 = r10.findViewById(r6);
        r1 = new com.whatsapp.c3;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
        r0 = r10.q;
        r1 = new com.whatsapp.aen;
        r1.<init>(r10);
        com.whatsapp.util.FloatingChildLayout.b(r0, r1);
        com.whatsapp.App.b(r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.QuickContactActivity.onCreate(android.os.Bundle):void");
    }

    public void a() {
    }

    public void a(String str) {
    }

    public void d(String str) {
        b();
    }

    private void c(boolean z) {
        getSupportLoaderManager().destroyLoader(0);
        if (z) {
            this.q.b();
            if (!this.q.a(new n_(this))) {
                finish();
            }
            if (!DialogToastActivity.f) {
                return;
            }
        }
        ActivityCompat.finishAfterTransition(this);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void c(String str) {
    }
}
