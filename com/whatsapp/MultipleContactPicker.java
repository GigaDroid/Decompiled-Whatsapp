package com.whatsapp;

import android.content.res.Configuration;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class MultipleContactPicker extends DialogToastListActivity implements tm {
    private static final String[] I;
    private View A;
    private final TextWatcher B;
    private boolean C;
    private int D;
    private ArrayList E;
    private Set F;
    private ArrayList G;
    private ImageButton H;
    private ArrayList t;
    private InputMethodManager u;
    private boolean v;
    private a2_ w;
    private aee x;
    private int y;
    private EditText z;

    static {
        String[] strArr = new String[9];
        String str = "kH*e'qDom5";
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
                        i3 = 5;
                        break;
                    case at.g /*1*/:
                        i3 = 39;
                        break;
                    case at.i /*2*/:
                        i3 = 7;
                        break;
                    case at.o /*3*/:
                        i3 = 8;
                        break;
                    default:
                        i3 = 70;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "kH*e'qDom5";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "iNja2";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "vBkm%qBc";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    str = "qNsd#";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "hRk|/uKbk)kSfk2uNdc#w\bdz#dSb";
                    obj = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    str = "lIw}2ZJb|.jC";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "iNja2ZPfz(lI`W4`Th}4fBX{2w";
                    obj = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    I = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "hRk|/uKbk)kSfk2uNdc#w\bcm5qUhq";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(MultipleContactPicker multipleContactPicker, ArrayList arrayList) {
        multipleContactPicker.a(arrayList);
    }

    public void onBackPressed() {
        try {
            if (this.C) {
                b();
                this.C = false;
                this.z.setText("");
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

    static int k(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.D;
    }

    public void a() {
        d();
        this.x.notifyDataSetChanged();
    }

    static void a(MultipleContactPicker multipleContactPicker, int i) {
        multipleContactPicker.b(i);
    }

    static boolean a(MultipleContactPicker multipleContactPicker, boolean z) {
        multipleContactPicker.C = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r8 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = r8.E;
        monitor-enter(r3);
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00af }
        r1.<init>();	 Catch:{ all -> 0x00af }
        r0 = r8.E;	 Catch:{ all -> 0x00af }
        r4 = r0.iterator();	 Catch:{ all -> 0x00af }
    L_0x0010:
        r0 = r4.hasNext();	 Catch:{ all -> 0x00af }
        if (r0 == 0) goto L_0x0027;
    L_0x0016:
        r0 = r4.next();	 Catch:{ all -> 0x00af }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ all -> 0x00af }
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r5 = r0.e;	 Catch:{ IllegalArgumentException -> 0x00ab }
        if (r5 == 0) goto L_0x0025;
    L_0x0022:
        r1.add(r0);	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x0025:
        if (r2 == 0) goto L_0x0010;
    L_0x0027:
        r0 = r8.E;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0.clear();	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r4 = r8.E;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0.d(r4);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0 = r8.E;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r4 = 20;
        if (r0 >= r4) goto L_0x004d;
    L_0x003d:
        r0 = r8.A;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r4 = 2131755700; // 0x7f1002b4 float:1.9142287E38 double:1.0532272567E-314;
        r0 = r0.findViewById(r4);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        if (r2 == 0) goto L_0x005a;
    L_0x004d:
        r0 = r8.A;	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r4 = 2131755700; // 0x7f1002b4 float:1.9142287E38 double:1.0532272567E-314;
        r0 = r0.findViewById(r4);	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x005a:
        r4 = new com.whatsapp.a3d;	 Catch:{ all -> 0x00af }
        r0 = r8.getApplicationContext();	 Catch:{ all -> 0x00af }
        r4.<init>(r0);	 Catch:{ all -> 0x00af }
        r5 = r1.iterator();	 Catch:{ all -> 0x00af }
    L_0x0067:
        r0 = r5.hasNext();	 Catch:{ all -> 0x00af }
        if (r0 == 0) goto L_0x0098;
    L_0x006d:
        r0 = r5.next();	 Catch:{ all -> 0x00af }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ all -> 0x00af }
        r1 = r8.E;	 Catch:{ all -> 0x00af }
        r6 = r1.iterator();	 Catch:{ all -> 0x00af }
    L_0x0079:
        r1 = r6.hasNext();	 Catch:{ all -> 0x00af }
        if (r1 == 0) goto L_0x0096;
    L_0x007f:
        r1 = r6.next();	 Catch:{ all -> 0x00af }
        r1 = (com.whatsapp.l5) r1;	 Catch:{ all -> 0x00af }
        if (r0 == 0) goto L_0x0094;
    L_0x0087:
        if (r1 == 0) goto L_0x0094;
    L_0x0089:
        r7 = r4.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        if (r7 != 0) goto L_0x0094;
    L_0x008f:
        r7 = 1;
        r1.e = r7;	 Catch:{ IllegalArgumentException -> 0x00b8 }
        if (r2 == 0) goto L_0x0079;
    L_0x0094:
        if (r2 == 0) goto L_0x0079;
    L_0x0096:
        if (r2 == 0) goto L_0x0067;
    L_0x0098:
        r0 = r8.E;	 Catch:{ all -> 0x00af }
        r1 = new com.whatsapp.a3d;	 Catch:{ all -> 0x00af }
        r2 = r8.getApplicationContext();	 Catch:{ all -> 0x00af }
        r1.<init>(r2);	 Catch:{ all -> 0x00af }
        java.util.Collections.sort(r0, r1);	 Catch:{ all -> 0x00af }
        r8.b();	 Catch:{ all -> 0x00af }
        monitor-exit(r3);	 Catch:{ all -> 0x00af }
        return;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00af }
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00af }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00af }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MultipleContactPicker.d():void");
    }

    public void b(String str) {
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        l5 l5Var = (l5) a().getItemAtPosition(((AdapterContextMenuInfo) contextMenuInfo).position);
        if (l5Var != null) {
            try {
                if (!a(l5Var)) {
                    try {
                        if (aup.a(l5Var.p)) {
                            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
                            contextMenu.add(0, 0, 0, String.format(getString(2131230843), new Object[]{l5Var.a(this.x.getContext())}));
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

    static boolean f(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.v;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        l5 l5Var = (l5) a().getItemAtPosition(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        try {
            switch (menuItem.getItemId()) {
                case v.m /*0*/:
                    aup.a(this, false, l5Var.p);
                    return true;
                default:
                    return super.onContextItemSelected(menuItem);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    static ArrayList i(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.E;
    }

    static a2_ j(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.w;
    }

    public void onPause() {
        super.onPause();
        App.a((tm) this);
    }

    public MultipleContactPicker() {
        this.v = true;
        this.E = new ArrayList();
        this.t = new ArrayList();
        this.F = new HashSet();
        this.w = new a2_();
        this.B = new vg(this);
    }

    static ImageButton c(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.H;
    }

    static EditText e(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r4 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r4.t;	 Catch:{ IllegalArgumentException -> 0x002e }
        if (r0 == 0) goto L_0x000b;
    L_0x0006:
        r0 = r4.t;	 Catch:{ IllegalArgumentException -> 0x002e }
        r0.clear();	 Catch:{ IllegalArgumentException -> 0x002e }
    L_0x000b:
        r0 = r4.E;
        r2 = r0.iterator();
    L_0x0011:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0024;
    L_0x0017:
        r0 = r2.next();
        r0 = (com.whatsapp.l5) r0;
        r3 = r4.t;
        r3.add(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x0024:
        r0 = r4.x;	 Catch:{ IllegalArgumentException -> 0x0030 }
        if (r0 == 0) goto L_0x002d;
    L_0x0028:
        r0 = r4.x;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r0.notifyDataSetChanged();	 Catch:{ IllegalArgumentException -> 0x0030 }
    L_0x002d:
        return;
    L_0x002e:
        r0 = move-exception;
        throw r0;
    L_0x0030:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MultipleContactPicker.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
        r8 = this;
        r7 = 11;
        r3 = 1;
        r6 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = I;
        r2 = 6;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r9);
        r0 = r8.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r3);
        r0 = r8.getSupportActionBar();
        r0.setDisplayShowCustomEnabled(r3);
        r0 = r8.getLayoutInflater();
        r2 = 2130903229; // 0x7f0300bd float:1.741327E38 double:1.05280608E-314;
        r3 = 0;
        r0 = r0.inflate(r2, r3, r6);
        r8.setContentView(r0);
        r0 = r8.getIntent();
        r2 = I;
        r3 = 3;
        r2 = r2[r3];
        r3 = -1;
        r0 = r0.getIntExtra(r2, r3);
        r8.y = r0;
        r0 = r8.getIntent();
        r2 = I;
        r3 = 8;
        r2 = r2[r3];
        r3 = 2131231349; // 0x7f080275 float:1.8078777E38 double:1.052968193E-314;
        r0 = r0.getIntExtra(r2, r3);
        r8.D = r0;
        r0 = r8.getIntent();
        r2 = I;
        r3 = 5;
        r2 = r2[r3];
        r0 = r0.getStringExtra(r2);
        r8.setTitle(r0);
        r2 = r8.a();
        r0 = new com.whatsapp.util.bz;	 Catch:{ IllegalArgumentException -> 0x020e }
        r3 = r8.getResources();	 Catch:{ IllegalArgumentException -> 0x020e }
        r4 = 2130837747; // 0x7f0200f3 float:1.7280457E38 double:1.0527737277E-314;
        r3 = r3.getDrawable(r4);	 Catch:{ IllegalArgumentException -> 0x020e }
        r0.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x020e }
        r2.setDivider(r0);	 Catch:{ IllegalArgumentException -> 0x020e }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x020e }
        if (r0 < r7) goto L_0x0085;
    L_0x007c:
        r0 = 1;
        r2.setFastScrollAlwaysVisible(r0);	 Catch:{ IllegalArgumentException -> 0x020e }
        r0 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r2.setScrollBarStyle(r0);	 Catch:{ IllegalArgumentException -> 0x020e }
    L_0x0085:
        r0 = r8.getLayoutInflater();
        r3 = 2130903232; // 0x7f0300c0 float:1.7413276E38 double:1.0528060815E-314;
        r0 = com.whatsapp.aam.a(r0, r3, r2, r6);
        r8.A = r0;
        r0 = r8.A;
        r2.addHeaderView(r0);
        r0 = r8.A;
        r3 = 2131755795; // 0x7f100313 float:1.914248E38 double:1.0532273036E-314;
        r0 = r0.findViewById(r3);
        r0 = (android.widget.EditText) r0;
        r8.z = r0;
        r0 = r8.z;
        r3 = r8.B;
        r0.addTextChangedListener(r3);
        r0 = r8.z;
        com.whatsapp.aam.a(r0);
        r0 = r8.z;
        r3 = r8.getResources();
        r4 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r3 = r3.getDimensionPixelSize(r4);
        r4 = r8.getResources();
        r5 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r4 = r4.getDimensionPixelSize(r5);
        com.whatsapp.aam.a(r0, r3, r4);
        r0 = r8.A;
        r3 = 2131755796; // 0x7f100314 float:1.9142481E38 double:1.053227304E-314;
        r0 = r0.findViewById(r3);
        r0 = (android.widget.ImageButton) r0;
        r8.H = r0;
        r0 = r8.H;
        r3 = new com.whatsapp.aeh;
        r3.<init>(r8);
        r0.setOnClickListener(r3);
        r0 = I;
        r3 = 7;
        r0 = r0[r3];
        r0 = r8.getSystemService(r0);
        r0 = (android.view.inputmethod.InputMethodManager) r0;
        r8.u = r0;
        r8.d();
        r0 = new java.util.HashSet;
        r0.<init>();
        r8.F = r0;
        r0 = r8.getIntent();
        r3 = I;
        r4 = 4;
        r3 = r3[r4];
        r0 = r0.getStringExtra(r3);
        r3 = android.text.TextUtils.isEmpty(r0);
        if (r3 != 0) goto L_0x0139;
    L_0x010c:
        r3 = ",";
        r3 = r0.split(r3);
        r0 = r8.E;
        r4 = r0.iterator();
    L_0x0119:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0139;
    L_0x011f:
        r0 = r4.next();
        r0 = (com.whatsapp.l5) r0;
        r5 = r0.p;	 Catch:{ IllegalArgumentException -> 0x0210 }
        r5 = com.whatsapp.util.ax.a(r3, r5);	 Catch:{ IllegalArgumentException -> 0x0210 }
        if (r5 == 0) goto L_0x0137;
    L_0x012d:
        r5 = 1;
        r0.e = r5;	 Catch:{ IllegalArgumentException -> 0x0210 }
        r5 = r8.F;	 Catch:{ IllegalArgumentException -> 0x0210 }
        r0 = r0.p;	 Catch:{ IllegalArgumentException -> 0x0210 }
        r5.add(r0);	 Catch:{ IllegalArgumentException -> 0x0210 }
    L_0x0137:
        if (r1 == 0) goto L_0x0119;
    L_0x0139:
        r0 = r8.getApplicationContext();
        r0 = com.whatsapp.App.v(r0);
        if (r0 == 0) goto L_0x0152;
    L_0x0143:
        r0 = 2131755468; // 0x7f1001cc float:1.9141816E38 double:1.053227142E-314;
        r0 = r8.findViewById(r0);
        r0.setVisibility(r6);
        r2.setEmptyView(r0);
        if (r1 == 0) goto L_0x015f;
    L_0x0152:
        r0 = 2131755381; // 0x7f100175 float:1.914164E38 double:1.053227099E-314;
        r0 = r8.findViewById(r0);
        r0.setVisibility(r6);
        r2.setEmptyView(r0);
    L_0x015f:
        r0 = 1;
        r2.setFastScrollEnabled(r0);	 Catch:{ IllegalArgumentException -> 0x0212 }
        r0 = 1;
        r2.setScrollbarFadingEnabled(r0);	 Catch:{ IllegalArgumentException -> 0x0212 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0212 }
        if (r0 < r7) goto L_0x01b1;
    L_0x016b:
        r0 = com.whatsapp.App.av;	 Catch:{ IllegalArgumentException -> 0x0214 }
        if (r0 == 0) goto L_0x0190;
    L_0x016f:
        r0 = 1;
        r2.setVerticalScrollbarPosition(r0);	 Catch:{ IllegalArgumentException -> 0x0216 }
        r0 = r8.getResources();	 Catch:{ IllegalArgumentException -> 0x0216 }
        r3 = 2131427352; // 0x7f0b0018 float:1.8476318E38 double:1.053065031E-314;
        r0 = r0.getDimensionPixelSize(r3);	 Catch:{ IllegalArgumentException -> 0x0216 }
        r3 = 0;
        r4 = r8.getResources();	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5 = 2131427351; // 0x7f0b0017 float:1.8476316E38 double:1.0530650307E-314;
        r4 = r4.getDimensionPixelSize(r5);	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5 = 0;
        r2.setPadding(r0, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0216 }
        if (r1 == 0) goto L_0x01b7;
    L_0x0190:
        r0 = 2;
        r2.setVerticalScrollbarPosition(r0);	 Catch:{ IllegalArgumentException -> 0x0218 }
        r0 = r8.getResources();	 Catch:{ IllegalArgumentException -> 0x0218 }
        r3 = 2131427351; // 0x7f0b0017 float:1.8476316E38 double:1.0530650307E-314;
        r0 = r0.getDimensionPixelSize(r3);	 Catch:{ IllegalArgumentException -> 0x0218 }
        r3 = 0;
        r4 = r8.getResources();	 Catch:{ IllegalArgumentException -> 0x0218 }
        r5 = 2131427352; // 0x7f0b0018 float:1.8476318E38 double:1.053065031E-314;
        r4 = r4.getDimensionPixelSize(r5);	 Catch:{ IllegalArgumentException -> 0x0218 }
        r5 = 0;
        r2.setPadding(r0, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0218 }
        if (r1 == 0) goto L_0x01b7;
    L_0x01b1:
        r0 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r2.setSelector(r0);	 Catch:{ IllegalArgumentException -> 0x0218 }
    L_0x01b7:
        r0 = new com.whatsapp.awd;
        r0.<init>(r8);
        r2.setOnItemClickListener(r0);
        r0 = r8.F;
        r0 = r0.size();
        r8.b(r0);
        r0 = new com.whatsapp.aee;
        r1 = 2130903230; // 0x7f0300be float:1.7413272E38 double:1.0528060806E-314;
        r3 = r8.t;
        r0.<init>(r8, r8, r1, r3);
        r8.x = r0;
        r0 = r8.x;
        r8.a(r0);
        r0 = r8.getSupportActionBar();
        r1 = 2131231074; // 0x7f080162 float:1.8078219E38 double:1.052968057E-314;
        r1 = r8.getString(r1);
        r3 = new com.whatsapp.aty;
        r3.<init>(r8);
        com.whatsapp.akz.a(r8, r0, r1, r3);
        r0 = 2131755660; // 0x7f10028c float:1.9142206E38 double:1.053227237E-314;
        r0 = r8.findViewById(r0);
        r1 = new com.whatsapp.sq;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = 2131755659; // 0x7f10028b float:1.9142204E38 double:1.0532272364E-314;
        r0 = r8.findViewById(r0);
        r1 = new com.whatsapp.y8;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r8.registerForContextMenu(r2);
        return;
    L_0x020e:
        r0 = move-exception;
        throw r0;
    L_0x0210:
        r0 = move-exception;
        throw r0;
    L_0x0212:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0214 }
    L_0x0214:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0216 }
    L_0x0216:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0218 }
    L_0x0218:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MultipleContactPicker.onCreate(android.os.Bundle):void");
    }

    private static boolean a(l5 l5Var) {
        return I[2].equals(l5Var.p);
    }

    private void b(int i) {
        getSupportActionBar().setSubtitle(String.format(App.az.a(2131296294, i), new Object[]{Integer.valueOf(i)}));
    }

    public void onDestroy() {
        Log.i(I[1]);
        super.onDestroy();
        this.E.clear();
        this.t.clear();
        this.w.a();
    }

    static Set d(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.F;
    }

    public boolean onSearchRequested() {
        try {
            if (!this.C) {
                if (this.E.size() > 0) {
                    findViewById(2131755700).setVisibility(0);
                    this.u.toggleSoftInput(0, 0);
                    this.z.requestFocus();
                    this.z.setText("");
                    a().post(new xj(this));
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void a(String str) {
        l5 b = App.as.b(str);
        if (b != null) {
            try {
                if (l5.a(this.E, new aa_(b))) {
                    this.x.notifyDataSetChanged();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    static boolean b(l5 l5Var) {
        return a(l5Var);
    }

    static ArrayList b(MultipleContactPicker multipleContactPicker, ArrayList arrayList) {
        multipleContactPicker.G = arrayList;
        return arrayList;
    }

    public void c(String str) {
        l5 b = App.as.b(str);
        if (b != null) {
            try {
                if (l5.a(this.E, new aad(b))) {
                    this.x.notifyDataSetChanged();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    finish();
                    break;
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static aee a(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.ArrayList r6) {
        /*
        r5 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = r5.t;
        monitor-enter(r2);
        r0 = r5.t;	 Catch:{ all -> 0x005d }
        r0.clear();	 Catch:{ all -> 0x005d }
        r0 = r5.E;	 Catch:{ all -> 0x005d }
        r3 = r0.iterator();	 Catch:{ all -> 0x005d }
    L_0x0010:
        r0 = r3.hasNext();	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x002d;
    L_0x0016:
        r0 = r3.next();	 Catch:{ all -> 0x005d }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ all -> 0x005d }
        r4 = r0.l;	 Catch:{ IllegalArgumentException -> 0x0059 }
        if (r4 == 0) goto L_0x002b;
    L_0x0020:
        r4 = r0.a(r6);	 Catch:{ IllegalArgumentException -> 0x0059 }
        if (r4 == 0) goto L_0x002b;
    L_0x0026:
        r4 = r5.t;	 Catch:{ IllegalArgumentException -> 0x005b }
        r4.add(r0);	 Catch:{ IllegalArgumentException -> 0x005b }
    L_0x002b:
        if (r1 == 0) goto L_0x0010;
    L_0x002d:
        r0 = r5.t;	 Catch:{ all -> 0x005d }
        r0 = r0.size();	 Catch:{ all -> 0x005d }
        if (r0 != 0) goto L_0x0044;
    L_0x0035:
        r0 = new com.whatsapp.l5;	 Catch:{ all -> 0x005d }
        r1 = I;	 Catch:{ all -> 0x005d }
        r3 = 0;
        r1 = r1[r3];	 Catch:{ all -> 0x005d }
        r0.<init>(r1);	 Catch:{ all -> 0x005d }
        r1 = r5.t;	 Catch:{ all -> 0x005d }
        r1.add(r0);	 Catch:{ all -> 0x005d }
    L_0x0044:
        monitor-exit(r2);	 Catch:{ all -> 0x005d }
        r0 = r5.t;
        r1 = new com.whatsapp.a3d;
        r2 = r5.getApplicationContext();
        r1.<init>(r2);
        java.util.Collections.sort(r0, r1);
        r0 = r5.x;
        r0.notifyDataSetChanged();
        return;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x005d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MultipleContactPicker.a(java.util.ArrayList):void");
    }

    static void g(MultipleContactPicker multipleContactPicker) {
        multipleContactPicker.b();
    }

    public void onResume() {
        super.onResume();
        App.b((tm) this);
        this.x.notifyDataSetChanged();
    }

    static int h(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.y;
    }

    public void d(String str) {
        if (!qm.i(str)) {
            l5 b = App.as.b(str);
            if (b != null) {
                try {
                    if (l5.a(this.E, new aas(b))) {
                        this.x.notifyDataSetChanged();
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
    }

    public void a(Collection collection) {
        this.x.notifyDataSetChanged();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    static ArrayList b(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.G;
    }
}
