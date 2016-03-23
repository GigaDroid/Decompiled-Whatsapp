package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MenuItemCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView.LayoutParams;
import com.google.android.maps.MyLocationOverlay;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class GroupChatRecentLocationsActivity extends WAMapActivity implements a97 {
    private static final String[] z;
    private amn a;
    private TextView b;
    private GoogleMapView c;
    private OnLongClickListener d;
    private int e;
    private String f;
    private int g;
    private l5 h;
    private ArrayList i;
    private ArrayList j;
    private final akc k;
    private MyLocationOverlay l;

    static {
        String[] strArr = new String[7];
        String str = "qihssiWxr`qieyt";
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
                        i3 = 29;
                        break;
                    case at.g /*1*/:
                        i3 = 8;
                        break;
                    case at.i /*2*/:
                        i3 = 17;
                        break;
                    case at.o /*3*/:
                        i3 = 28;
                        break;
                    default:
                        i3 = 6;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "zz~iv~`phtxktrrqgr}rtg\u007fo)~zt}rx";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "wau";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "zz~iv~`phtxktrrqgr}rtg\u007fo)ymbhtrq";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "zz~iv~`phtxktrrqgr}rtg\u007fo)ombiji'rshiirh&sge<gyltx";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "zz~iv~`phtxktrrqgr}rtg\u007fo)ombiji'bwom'rshiirh&sge<gyltx";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "zmeFireSirig\u007foErfeniqdtn";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231418).setIcon(2130837695), 2);
        if (App.j == 3) {
            u.b((Activity) this);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.app.Dialog onCreateDialog(int r7) {
        /*
        r6 = this;
        r5 = 0;
        r4 = 1;
        switch(r7) {
            case 0: goto L_0x0007;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = 0;
    L_0x0006:
        return r0;
    L_0x0007:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 2131231445; // 0x7f0802d5 float:1.8078971E38 double:1.0529682403E-314;
        r2 = new java.lang.Object[r4];
        r3 = r6.h;
        r3 = r3.a(r6);
        r2[r5] = r3;
        r1 = r6.getString(r1, r2);
        r0.add(r1);
        r1 = 2131230866; // 0x7f080092 float:1.8077797E38 double:1.0529679542E-314;
        r2 = new java.lang.Object[r4];
        r3 = r6.h;
        r3 = r3.a(r6);
        r2[r5] = r3;
        r1 = r6.getString(r1, r2);
        r0.add(r1);
        r1 = r6.h;
        r1 = r1.l;
        if (r1 == 0) goto L_0x0052;
    L_0x003a:
        r1 = 2131232228; // 0x7f0805e4 float:1.808056E38 double:1.052968627E-314;
        r2 = new java.lang.Object[r4];
        r3 = r6.h;
        r3 = r3.a(r6);
        r2[r5] = r3;
        r1 = r6.getString(r1, r2);
        r0.add(r1);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0066;
    L_0x0052:
        r1 = 2131230786; // 0x7f080042 float:1.8077635E38 double:1.0529679147E-314;
        r1 = r6.getString(r1);
        r0.add(r1);
        r1 = 2131230789; // 0x7f080045 float:1.807764E38 double:1.052967916E-314;
        r1 = r6.getString(r1);
        r0.add(r1);
    L_0x0066:
        r1 = r0.size();
        r1 = new java.lang.String[r1];
        r0.toArray(r1);
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r6);
        r2 = new com.whatsapp.axw;
        r2.<init>(r6);
        r0.setItems(r1, r2);
        r0 = r0.create();
        r0.requestWindowFeature(r4);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatRecentLocationsActivity.onCreateDialog(int):android.app.Dialog");
    }

    public GroupChatRecentLocationsActivity() {
        this.j = new ArrayList();
        this.g = -1;
        this.i = new ArrayList();
        this.k = new ak8(this);
    }

    static l5 k(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.h;
    }

    static TextView l(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.b;
    }

    static int j(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        int i = groupChatRecentLocationsActivity.e;
        groupChatRecentLocationsActivity.e = i + 1;
        return i;
    }

    static void e(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        groupChatRecentLocationsActivity.a();
    }

    protected boolean isRouteDisplayed() {
        return false;
    }

    static int d(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        int i = groupChatRecentLocationsActivity.e;
        groupChatRecentLocationsActivity.e = i - 1;
        return i;
    }

    private co a(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            co coVar = (co) it.next();
            if (!str.equals(coVar.t)) {
                if (z) {
                    break;
                }
            }
            return coVar;
        }
        return null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case v.m /*0*/:
                this.c.setSatellite(!this.c.isSatellite());
                return true;
            case 16908332:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    static void g(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        groupChatRecentLocationsActivity.b();
    }

    static l5 a(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity, l5 l5Var) {
        groupChatRecentLocationsActivity.h = l5Var;
        return l5Var;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        switch (i) {
            case Y.t /*10*/:
                if (i2 == -1) {
                    if (!(intent == null || intent.getData() == null)) {
                        App.as.a(intent.getData(), this.h);
                        if (!z) {
                            return;
                        }
                    }
                    App.as.n(this.h);
                    if (!z) {
                        return;
                    }
                }
                Log.i(z[5]);
                if (!z) {
                    return;
                }
                break;
            case Y.j /*11*/:
                break;
            default:
                return;
        }
        if (i2 == -1) {
            App.as.n(this.h);
            if (!z) {
                return;
            }
        }
        Log.i(z[6]);
    }

    static co a(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity, String str) {
        return groupChatRecentLocationsActivity.a(str);
    }

    static int a(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity, int i) {
        groupChatRecentLocationsActivity.e = i;
        return i;
    }

    public void a(GeoPoint geoPoint, int i, int i2) {
        if (this.g != this.c.getZoomLevel()) {
            this.g = this.c.getZoomLevel();
            b();
        }
    }

    protected void onResume() {
        super.onResume();
        this.l.enableMyLocation();
    }

    static String h(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
        r18 = this;
        r12 = com.whatsapp.DialogToastActivity.f;
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = r18.getWindow();
        com.whatsapp.aam.a(r2);
        super.onCreate(r19);
        r2 = 2130903197; // 0x7f03009d float:1.7413205E38 double:1.0528060643E-314;
        r0 = r18;
        com.whatsapp.DialogToastActivity.a(r0, r2);
        r2 = r18.getIntent();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.getStringExtra(r3);
        r0 = r18;
        r0.f = r2;
        r0 = r18;
        r2 = r0.f;
        r3 = com.whatsapp.qa.d(r2);
        r2 = 2131755438; // 0x7f1001ae float:1.9141755E38 double:1.0532271273E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.support.v7.widget.Toolbar) r2;
        r0 = r18;
        r3 = r3.a(r0);
        r0 = r18;
        r3 = com.whatsapp.a28.b(r3, r0);
        r2.setTitle(r3);
        r3 = r2.getMenu();
        r0 = r18;
        r0.onCreateOptionsMenu(r3);
        r3 = new com.whatsapp.nu;
        r0 = r18;
        r3.<init>(r0);
        r2.setOnMenuItemClickListener(r3);
        r2 = 2131755692; // 0x7f1002ac float:1.914227E38 double:1.0532272527E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (com.whatsapp.GoogleMapView) r2;
        r0 = r18;
        r0.c = r2;
        r0 = r18;
        r2 = r0.c;
        r0 = r18;
        r2.setMapListener(r0);
        r0 = r18;
        r2 = r0.c;
        r3 = 1;
        r2.setBuiltInZoomControls(r3);
        r2 = 2131755352; // 0x7f100158 float:1.914158E38 double:1.053227085E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r0 = r18;
        r0.b = r2;
        r2 = new com.whatsapp.m_;
        r0 = r18;
        r3 = r0.c;
        r0 = r18;
        r2.<init>(r0, r3);
        r0 = r18;
        r0.l = r2;
        r0 = r18;
        r2 = r0.c;
        r2 = r2.getOverlays();
        r0 = r18;
        r3 = r0.l;
        r2.add(r3);
        r2 = com.whatsapp.App.aK;
        r0 = r18;
        r3 = r0.f;
        r2 = r2.H(r3);
        r0 = r18;
        r0.j = r2;
        r0 = r18;
        r2 = r0.j;
        r3 = new com.whatsapp.vv;
        r0 = r18;
        r3.<init>(r0);
        java.util.Collections.sort(r2, r3);
        r2 = new com.whatsapp.a2d;
        r0 = r18;
        r2.<init>(r0);
        r0 = r18;
        r0.d = r2;
        r8 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r6 = -4587338432941916160; // 0xc056800000000000 float:0.0 double:-90.0;
        r4 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r2 = -4582834833314545664; // 0xc066800000000000 float:0.0 double:-180.0;
        r0 = r18;
        r10 = r0.j;
        r13 = r10.iterator();
        r10 = r8;
        r8 = r6;
        r6 = r4;
        r4 = r2;
    L_0x00f6:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x024f;
    L_0x00fc:
        r2 = r13.next();
        r2 = (com.whatsapp.protocol.co) r2;
        r14 = r2.m;
        r10 = java.lang.Math.min(r10, r14);
        r14 = r2.m;
        r8 = java.lang.Math.max(r8, r14);
        r14 = r2.l;
        r6 = java.lang.Math.min(r6, r14);
        r2 = r2.l;
        r2 = java.lang.Math.max(r4, r2);
        if (r12 == 0) goto L_0x024c;
    L_0x011c:
        r4 = new com.google.android.maps.GeoPoint;
        r14 = r10 + r8;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r5 = (int) r14;
        r14 = r6 + r2;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r13 = (int) r14;
        r4.<init>(r5, r13);
        r0 = r18;
        r5 = r0.c;
        r5 = r5.getController();
        r5.setCenter(r4);
        r4 = r8 - r10;
        r8 = 4608533498688228557; // 0x3ff4cccccccccccd float:-1.07374184E8 double:1.3;
        r4 = r4 * r8;
        r8 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r4 = r4 * r8;
        r4 = (int) r4;
        r2 = r2 - r6;
        r6 = 4608533498688228557; // 0x3ff4cccccccccccd float:-1.07374184E8 double:1.3;
        r2 = r2 * r6;
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r2 = r2 * r6;
        r2 = (int) r2;
        r0 = r18;
        r3 = r0.j;	 Catch:{ NoSuchMethodException -> 0x023d }
        r3 = r3.size();	 Catch:{ NoSuchMethodException -> 0x023d }
        r5 = 1;
        if (r3 > r5) goto L_0x017f;
    L_0x0170:
        r0 = r18;
        r3 = r0.c;	 Catch:{ NoSuchMethodException -> 0x023d }
        r3 = r3.getController();	 Catch:{ NoSuchMethodException -> 0x023d }
        r5 = 17;
        r3.setZoom(r5);	 Catch:{ NoSuchMethodException -> 0x023d }
        if (r12 == 0) goto L_0x018a;
    L_0x017f:
        r0 = r18;
        r3 = r0.c;	 Catch:{ NoSuchMethodException -> 0x023f }
        r3 = r3.getController();	 Catch:{ NoSuchMethodException -> 0x023f }
        r3.zoomToSpan(r4, r2);	 Catch:{ NoSuchMethodException -> 0x023f }
    L_0x018a:
        r18.b();
        r0 = r18;
        r2 = r0.j;
        r2 = r2.size();
        r2 = r2 + -1;
        r0 = r18;
        r0.e = r2;
        r2 = new com.whatsapp.amn;
        r0 = r18;
        r2.<init>(r0);
        r0 = r18;
        r0.a = r2;
        r0 = r18;
        r2 = r0.a;
        r2.a();
        r0 = r18;
        r2 = r0.c;
        r2 = r2.getOverlays();
        r0 = r18;
        r3 = r0.a;
        r2.add(r3);
        r2 = 2131755695; // 0x7f1002af float:1.9142277E38 double:1.053227254E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r3 = new com.whatsapp.os;
        r0 = r18;
        r3.<init>(r0);
        r2.setOnClickListener(r3);
        r2 = 2131755696; // 0x7f1002b0 float:1.9142279E38 double:1.0532272547E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r3 = new com.whatsapp.aq_;
        r0 = r18;
        r3.<init>(r0);
        r2.setOnClickListener(r3);
        r2 = 2131755694; // 0x7f1002ae float:1.9142275E38 double:1.0532272537E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r3 = new com.whatsapp.axm;
        r0 = r18;
        r3.<init>(r0);
        r2.setOnClickListener(r3);
        r3 = 0;
        r2 = 0;
        r0 = r18;
        r4 = r0.c;	 Catch:{ NoSuchMethodException -> 0x0248 }
        r4 = r4.getClass();	 Catch:{ NoSuchMethodException -> 0x0248 }
        r5 = z;	 Catch:{ NoSuchMethodException -> 0x0248 }
        r6 = 1;
        r5 = r5[r6];	 Catch:{ NoSuchMethodException -> 0x0248 }
        r6 = 0;
        r6 = new java.lang.Class[r6];	 Catch:{ NoSuchMethodException -> 0x0248 }
        r2 = r4.getMethod(r5, r6);	 Catch:{ NoSuchMethodException -> 0x0248 }
    L_0x020b:
        if (r2 == 0) goto L_0x024a;
    L_0x020d:
        r4 = 0;
        r0 = r18;
        r5 = r0.c;	 Catch:{ IllegalAccessException -> 0x0241, InvocationTargetException -> 0x0246 }
        r6 = 0;
        r6 = new java.lang.Object[r6];	 Catch:{ IllegalAccessException -> 0x0241, InvocationTargetException -> 0x0246 }
        r2 = r2.invoke(r5, r6);	 Catch:{ IllegalAccessException -> 0x0241, InvocationTargetException -> 0x0246 }
        r2 = (android.widget.ZoomButtonsController) r2;	 Catch:{ IllegalAccessException -> 0x0241, InvocationTargetException -> 0x0246 }
    L_0x021b:
        if (r2 == 0) goto L_0x024a;
    L_0x021d:
        r2 = r2.getZoomControls();
    L_0x0221:
        if (r2 == 0) goto L_0x0233;
    L_0x0223:
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = com.whatsapp.a4d.a();	 Catch:{ NoSuchMethodException -> 0x0244 }
        r6 = r6.g;	 Catch:{ NoSuchMethodException -> 0x0244 }
        r7 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r6 = r6 * r7;
        r6 = (int) r6;	 Catch:{ NoSuchMethodException -> 0x0244 }
        r2.setPadding(r3, r4, r5, r6);	 Catch:{ NoSuchMethodException -> 0x0244 }
    L_0x0233:
        r2 = com.whatsapp.App.aK;
        r0 = r18;
        r3 = r0.k;
        r2.b(r3);
        return;
    L_0x023d:
        r2 = move-exception;
        throw r2;	 Catch:{ NoSuchMethodException -> 0x023f }
    L_0x023f:
        r2 = move-exception;
        throw r2;
    L_0x0241:
        r2 = move-exception;
    L_0x0242:
        r2 = r4;
        goto L_0x021b;
    L_0x0244:
        r2 = move-exception;
        throw r2;
    L_0x0246:
        r2 = move-exception;
        goto L_0x0242;
    L_0x0248:
        r4 = move-exception;
        goto L_0x020b;
    L_0x024a:
        r2 = r3;
        goto L_0x0221;
    L_0x024c:
        r4 = r2;
        goto L_0x00f6;
    L_0x024f:
        r2 = r4;
        goto L_0x011c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatRecentLocationsActivity.onCreate(android.os.Bundle):void");
    }

    static MyLocationOverlay c(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.l;
    }

    private void a() {
        if (this.e == -1 && this.l.getMyLocation() == null) {
            this.e = 0;
        }
        if (this.e == -1) {
            this.c.getController().animateTo(this.l.getMyLocation());
            this.c.getController().setZoom(17);
            this.b.setText(getString(2131231513));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        if (this.e < this.j.size()) {
            co coVar = (co) this.j.get(this.e);
            this.c.getController().animateTo(new GeoPoint((int) (coVar.m * 1000000.0d), (int) (coVar.l * 1000000.0d)));
            this.c.getController().setZoom(17);
            this.b.setText(getString(2131231406, new Object[]{Integer.valueOf(this.e + 1), Integer.valueOf(this.j.size())}));
        }
    }

    public void onDestroy() {
        Log.i(z[4]);
        super.onDestroy();
        App.aK.a(this.k);
    }

    protected void onPause() {
        super.onPause();
        this.l.disableMyLocation();
    }

    static ArrayList f(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.view.View r6, com.whatsapp.protocol.co r7) {
        /*
        r5 = this;
        r0 = com.whatsapp.App.as;
        r1 = r7.t;
        r1 = r0.b(r1);
        r0 = 2131755455; // 0x7f1001bf float:1.914179E38 double:1.0532271357E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = r1.a(r5);
        r0.setText(r2);
        r0 = 2131755456; // 0x7f1001c0 float:1.9141792E38 double:1.053227136E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = com.whatsapp.App.o(r7);
        r2 = com.whatsapp.util.cs.a(r5, r2);
        r0.setText(r2);
        r0 = 2131755454; // 0x7f1001be float:1.9141788E38 double:1.053227135E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r2 = r5.getResources();
        r3 = 2131427544; // 0x7f0b00d8 float:1.8476707E38 double:1.053065126E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r3 = r5.getResources();
        r4 = 2131427359; // 0x7f0b001f float:1.8476332E38 double:1.0530650347E-314;
        r3 = r3.getDimension(r4);
        r4 = 1;
        r2 = r1.a(r2, r3, r4);
        if (r2 == 0) goto L_0x0059;
    L_0x0052:
        r0.setImageBitmap(r2);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0060;
    L_0x0059:
        r1 = r1.z();
        r0.setImageResource(r1);
    L_0x0060:
        r0 = r7.t;
        r6.setTag(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatRecentLocationsActivity.a(android.view.View, com.whatsapp.protocol.co):void");
    }

    static amn b(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.a;
    }

    private void b() {
        boolean z = DialogToastActivity.f;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            this.c.removeView((View) it.next());
            if (z) {
                break;
            }
        }
        double min = ((double) ((Math.min(this.c.getWidth(), this.c.getHeight()) / 10) * 360)) / ((Math.pow(2.0d, (double) this.c.getZoomLevel()) * 256.0d) / 2.0d);
        double d = min / 2.0d;
        HashMap hashMap = new HashMap();
        Point point = new Point();
        Iterator it2 = this.j.iterator();
        while (it2.hasNext()) {
            co coVar = (co) it2.next();
            double d2 = coVar.l;
            double d3 = coVar.m;
            GeoPoint geoPoint = new GeoPoint((int) (coVar.m * 1000000.0d), (int) (coVar.l * 1000000.0d));
            this.c.getProjection().toPixels(geoPoint, point);
            String str = ((int) ((d2 + 180.0d) / min)) + " " + ((int) ((90.0d + d3) / d));
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new ArrayList());
            }
            ((ArrayList) hashMap.get(str)).add(coVar);
            if (z) {
                break;
            }
        }
        Object arrayList = new ArrayList(hashMap.values());
        Collections.sort(arrayList, new aw1(this));
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList2 = (ArrayList) it2.next();
            View linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(0, 0, 0, (int) (7.0f * a4d.a().g));
            View linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            linearLayout.addView(linearLayout2);
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(z[0]);
            Drawable ciVar = new ci();
            ciVar.a((int) (12.0f * a4d.a().g));
            linearLayout2.setBackgroundDrawable(ciVar);
            Iterator it3 = arrayList2.iterator();
            double d4 = 0.0d;
            d = 0.0d;
            while (it3.hasNext()) {
                co coVar2 = (co) it3.next();
                View a = aam.a(layoutInflater, 2130903102, null);
                a.setClickable(true);
                a.setBackgroundResource(2130839767);
                a(a, coVar2);
                linearLayout2.addView(a);
                a.setOnLongClickListener(this.d);
                d4 += coVar2.m;
                min = coVar2.l + d;
                if (z) {
                    break;
                }
                d = min;
            }
            min = d;
            this.c.addView(linearLayout, new LayoutParams(-2, -2, new GeoPoint((int) ((d4 / ((double) arrayList2.size())) * 1000000.0d), (int) ((min / ((double) arrayList2.size())) * 1000000.0d)), 81));
            this.i.add(linearLayout);
            if (z) {
                return;
            }
        }
    }

    static int i(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.e;
    }

    static GoogleMapView a(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.c;
    }
}
