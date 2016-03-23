package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.util.ArrayList;
import java.util.Collection;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class CallLogActivity extends DialogToastActivity implements tm {
    private static final String[] z;
    private View n;
    private mu o;
    private ax1 p;
    private ArrayList q;
    private ImageView r;
    private l5 s;
    private ListView t;

    static {
        String[] strArr = new String[12];
        String str = "\u0000^l";
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
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 55;
                        break;
                    case at.i /*2*/:
                        i3 = 8;
                        break;
                    case at.o /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 116;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\tVdm\u0018\u0005P't\u0004\u000eV|d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0000^l";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0000^l";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\tVdm\u0018\u0005P'e\u0011\u0019Czn\r";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0000^l";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\tVdm\u0007";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "\tVdm\u0018\u0005P'b\u0006\u000fV|d";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "\tVdm\u0018\u0005P'e\u0011\u0006R|d";
                    obj = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\tVdm\u0018\u0005P'o\u0011\u001dhkn\u001a\u001cRzr\u0015\u001e^go";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0000^l";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0000^l";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755042, 0, 2131231433).setIcon(2130839440).setAlphabeticShortcut('n'), 2);
        menu.add(0, 2131755020, 0, 2131230920).setIcon(2130839433);
        menu.add(0, 2131755055, 0, 2131232177);
        menu.add(0, 2131755016, 0, 2131230839);
        return true;
    }

    public void c(String str) {
        if (str.equals(getIntent().getStringExtra(z[11]))) {
            c();
        }
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case v.m /*0*/:
                return new Builder(this).setMessage(getString(2131230840, new Object[]{this.s.a((Context) this)})).setPositiveButton(2131231580, new xx(this)).setNegativeButton(2131230884, null).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    public void a(String str) {
        if (str.equals(getIntent().getStringExtra(z[1]))) {
            c();
        }
    }

    public void b(String str) {
        if (str.equals(getIntent().getStringExtra(z[0]))) {
            ((TextView) findViewById(2131755429)).setText(this.s.d());
        }
    }

    public void a(Collection collection) {
    }

    private void c() {
        Log.i(z[2]);
        this.s = qa.d(getIntent().getStringExtra(z[3]));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131427523);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.s.w(), dimensionPixelSize, dimensionPixelSize, true);
        if (createScaledBitmap != null) {
            this.r.setImageBitmap(createScaledBitmap);
        }
        ((TextEmojiLabel) findViewById(2131755428)).setContact(this.s);
        ((TextView) findViewById(2131755429)).setText(this.s.d());
        if (this.p != null) {
            this.p.cancel(true);
        }
        this.p = new ax1(this);
        bq.a(this.p, new Void[0]);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() == 2131755020) {
            Log.i(z[9]);
            if (this.q == null) {
                return true;
            }
            App.aK.b(this.q);
            finish();
            return true;
        } else if (menuItem.getItemId() == 2131755042) {
            Log.i(z[10]);
            startActivity(Conversation.a(this.s));
            finish();
            return true;
        } else if (menuItem.getItemId() == 2131755055) {
            aup.a(this, false, this.s.p);
            return true;
        } else if (menuItem.getItemId() != 2131755016) {
            return false;
        } else {
            showDialog(0);
            return true;
        }
    }

    public void a() {
        c();
    }

    public static int b(co coVar) {
        if (coVar.k.a) {
            return 2131231587;
        }
        if (coVar.H > 0) {
            return 2131231362;
        }
        return 2131230996;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r4 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r4.t;
        r2 = 0;
        r0 = r0.getChildAt(r2);
        if (r0 == 0) goto L_0x0052;
    L_0x000b:
        r2 = r4.t;
        r2 = r2.getWidth();
        r3 = r4.t;
        r3 = r3.getHeight();
        if (r2 <= r3) goto L_0x003e;
    L_0x0019:
        r2 = r4.t;
        r2 = r2.getFirstVisiblePosition();
        if (r2 != 0) goto L_0x0027;
    L_0x0021:
        r0 = r0.getTop();
        if (r1 == 0) goto L_0x0030;
    L_0x0027:
        r0 = r4.n;
        r0 = r0.getHeight();
        r0 = -r0;
        r0 = r0 + 1;
    L_0x0030:
        r2 = r4.n;
        r3 = r4.n;
        r3 = r3.getTop();
        r0 = r0 - r3;
        r2.offsetTopAndBottom(r0);
        if (r1 == 0) goto L_0x0052;
    L_0x003e:
        r0 = r4.n;
        r0 = r0.getTop();
        if (r0 == 0) goto L_0x0052;
    L_0x0046:
        r0 = r4.n;
        r1 = r4.n;
        r1 = r1.getTop();
        r1 = -r1;
        r0.offsetTopAndBottom(r1);
    L_0x0052:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CallLogActivity.b():void");
    }

    static l5 a(CallLogActivity callLogActivity) {
        return callLogActivity.s;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean a = aup.a(this.s.p);
        MenuItem findItem = menu.findItem(2131755055);
        if (findItem != null) {
            findItem.setVisible(a);
        }
        findItem = menu.findItem(2131755016);
        if (findItem != null) {
            if (a) {
                a = false;
            } else {
                a = true;
            }
            findItem.setVisible(a);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(long r10, android.content.Context r12) {
        /*
        r8 = 1;
        r6 = 4652218415073722368; // 0x4090000000000000 float:0.0 double:1024.0;
        r1 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r2 = (double) r10;
        r0 = r1;
    L_0x0008:
        r5 = 3;
        if (r0 >= r5) goto L_0x0014;
    L_0x000b:
        r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x0014;
    L_0x000f:
        r2 = r2 / r6;
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0008;
    L_0x0014:
        switch(r0) {
            case 0: goto L_0x0029;
            case 1: goto L_0x0040;
            case 2: goto L_0x0045;
            case 3: goto L_0x004a;
            default: goto L_0x0017;
        };
    L_0x0017:
        r0 = r1;
    L_0x0018:
        r0 = r12.getString(r0);
        r4 = new java.lang.Object[r8];
        r2 = java.lang.Double.valueOf(r2);
        r4[r1] = r2;
        r0 = java.lang.String.format(r0, r4);
    L_0x0028:
        return r0;
    L_0x0029:
        r0 = com.whatsapp.App.az;
        r2 = 2131296297; // 0x7f090029 float:1.8210507E38 double:1.0530002815E-314;
        r3 = (int) r10;
        r0 = r0.a(r2, r3);
        r2 = new java.lang.Object[r8];
        r3 = java.lang.Long.valueOf(r10);
        r2[r1] = r3;
        r0 = java.lang.String.format(r0, r2);
        goto L_0x0028;
    L_0x0040:
        r0 = 2131231522; // 0x7f080322 float:1.8079127E38 double:1.0529682784E-314;
        if (r4 == 0) goto L_0x0018;
    L_0x0045:
        r0 = 2131231523; // 0x7f080323 float:1.807913E38 double:1.052968279E-314;
        if (r4 == 0) goto L_0x0018;
    L_0x004a:
        r0 = 2131231520; // 0x7f080320 float:1.8079123E38 double:1.0529682774E-314;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CallLogActivity.a(long, android.content.Context):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r8) {
        /*
        r7 = this;
        r4 = 1;
        r6 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r2 = 8;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r8);
        r0 = r7.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r4);
        r0 = 2130903095; // 0x7f030037 float:1.7412998E38 double:1.052806014E-314;
        r7.setContentView(r0);
        r0 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r7.t = r0;
        r0 = r7.getLayoutInflater();
        r2 = 2130903096; // 0x7f030038 float:1.7413E38 double:1.0528060144E-314;
        r3 = r7.t;
        r0 = com.whatsapp.aam.a(r0, r2, r3, r6);
        r2 = r7.t;
        r3 = 0;
        r2.addHeaderView(r0, r3, r6);
        r0 = 2131755330; // 0x7f100142 float:1.9141536E38 double:1.053227074E-314;
        r0 = r7.findViewById(r0);
        r7.n = r0;
        r0 = r7.n;
        r0.setClickable(r4);
        r0 = r7.t;
        r2 = new com.whatsapp.he;
        r2.<init>(r7);
        r0.setOnScrollListener(r2);
        r0 = r7.t;
        r0 = r0.getViewTreeObserver();
        r2 = new com.whatsapp.aiw;
        r2.<init>(r7);
        r0.addOnGlobalLayoutListener(r2);
        r0 = 2131755426; // 0x7f1001a2 float:1.914173E38 double:1.0532271213E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r7.r = r0;
        r0 = r7.r;
        r2 = new com.whatsapp.zz;
        r3 = r7.getIntent();
        r4 = z;
        r5 = 6;
        r4 = r4[r5];
        r3 = r3.getStringExtra(r4);
        r2.<init>(r3, r7);
        r0.setOnClickListener(r2);
        r0 = 2131755384; // 0x7f100178 float:1.9141646E38 double:1.0532271006E-314;
        r0 = r7.findViewById(r0);
        r2 = new com.whatsapp.yi;
        r2.<init>(r7);
        r0.setOnClickListener(r2);
        r0 = new com.whatsapp.mu;
        r0.<init>(r7, r7);
        r7.o = r0;
        r0 = r7.t;
        r2 = r7.o;
        r0.setAdapter(r2);
        r0 = r7.getIntent();
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r0 = r0.getParcelableArrayListExtra(r2);
        if (r0 == 0) goto L_0x0126;
    L_0x00af:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r7.q = r2;
        r2 = r0.iterator();
    L_0x00ba:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00d9;
    L_0x00c0:
        r0 = r2.next();
        r0 = (android.os.Parcelable) r0;
        r0 = (com.whatsapp.a4p) r0;
        r3 = com.whatsapp.App.aK;
        r0 = r0.a;
        r0 = r3.a(r0);
        if (r0 == 0) goto L_0x00d7;
    L_0x00d2:
        r3 = r7.q;
        r3.add(r0);
    L_0x00d7:
        if (r1 == 0) goto L_0x00ba;
    L_0x00d9:
        r0 = r7.o;
        r2 = r7.q;
        r0.a(r2);
        r0 = r7.q;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x012d;
    L_0x00e8:
        r0 = r7.q;
        r0 = r0.get(r6);
        r0 = (com.whatsapp.protocol.co) r0;
        r2 = com.whatsapp.App.o(r0);
        r0 = 2131755432; // 0x7f1001a8 float:1.9141743E38 double:1.0532271243E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r4 = android.text.format.DateUtils.isToday(r2);
        if (r4 == 0) goto L_0x010b;
    L_0x0103:
        r4 = 2131232150; // 0x7f080596 float:1.8080401E38 double:1.0529685886E-314;
        r0.setText(r4);
        if (r1 == 0) goto L_0x0126;
    L_0x010b:
        r4 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = r4 + r2;
        r4 = android.text.format.DateUtils.isToday(r4);
        if (r4 == 0) goto L_0x011d;
    L_0x0115:
        r4 = 2131232299; // 0x7f08062b float:1.8080703E38 double:1.052968662E-314;
        r0.setText(r4);
        if (r1 == 0) goto L_0x0126;
    L_0x011d:
        r1 = 16;
        r1 = android.text.format.DateUtils.formatDateTime(r7, r2, r1);
        r0.setText(r1);
    L_0x0126:
        r7.c();
        com.whatsapp.App.b(r7);
        return;
    L_0x012d:
        r7.finish();
        goto L_0x0126;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CallLogActivity.onCreate(android.os.Bundle):void");
    }

    static ImageView c(CallLogActivity callLogActivity) {
        return callLogActivity.r;
    }

    public static int a(co coVar) {
        if (coVar.k.a) {
            return 2130837706;
        }
        if (coVar.H > 0) {
            return 2130837704;
        }
        return 2130837705;
    }

    public void d(String str) {
        if (str.equals(getIntent().getStringExtra(z[4]))) {
            c();
        }
    }

    static void b(CallLogActivity callLogActivity) {
        callLogActivity.b();
    }

    public void onDestroy() {
        Log.i(z[5]);
        super.onDestroy();
        if (this.p != null) {
            this.p.cancel(true);
        }
        App.a((tm) this);
    }
}
