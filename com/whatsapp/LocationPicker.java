package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MyLocationOverlay;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.bb;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class LocationPicker extends WAMapActivity implements a97 {
    private static final String[] z;
    private r8 a;
    private boolean b;
    private PlaceInfo c;
    private Runnable d;
    private TextView e;
    private TextView f;
    private View g;
    private ListView h;
    private MyLocationOverlay i;
    private ak1 j;
    private Location k;
    private ProgressBar l;
    private fr m;
    private String n;
    private bb o;
    private boolean p;
    private i4 q;
    private GoogleMapView r;
    private Handler s;
    private long t;
    private k1 u;

    static {
        String[] strArr = new String[19];
        String str = "R.Z0lZ$\u0010+mG%P6-R#J+l]nm\u0007Ba\u0003v";
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
                        i3 = 51;
                        break;
                    case at.g /*1*/:
                        i3 = 64;
                        break;
                    case at.i /*2*/:
                        i3 = 62;
                        break;
                    case at.o /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 3;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "_!J";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "C,_!f@";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "I/Q/";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "_/P";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "C,_!f@";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "c,_!f@";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "_!J";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "_/]#wZ/P";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "T0M";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "I/Q/";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "_/]#wZ/P2jP+[0,P2[#wV`K,bQ,[bw\\`]0fR4[bs_!]'p\u0013$W0fP4Q0z";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "_/P";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "_/]#wZ/P2jP+[0,P2[#wV";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "R\"Q0wZ.YbgF%\u001e6l\u0013._6jE%\u001e.jQ2_0jV3\u001e/j@3W,d";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "]%J5lA+";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Y)Z";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u000f!\u001e*qV&\u0003ekG4N19\u001coX-vA3O7bA%\u0010!l^o\u0019|e\\5L1rF!L'?\u001c!\u0000";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "B5[0z";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onResume() {
        super.onResume();
        c();
        this.i.enableMyLocation();
        this.t = System.currentTimeMillis();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
        r11 = this;
        r10 = 2;
        r2 = 8;
        r9 = 0;
        r8 = 1;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r4 = 14;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        r0 = r11.getWindow();
        com.whatsapp.aam.a(r0);
        super.onCreate(r12);
        r0 = com.whatsapp.util.WhatsAppLibLoader.a(r9);
        if (r0 != 0) goto L_0x002e;
    L_0x0021:
        r0 = z;
        r1 = 15;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r11.finish();
    L_0x002d:
        return;
    L_0x002e:
        r0 = com.whatsapp.App.ay;
        if (r0 != 0) goto L_0x0036;
    L_0x0032:
        r11.finish();
        goto L_0x002d;
    L_0x0036:
        com.whatsapp.k1.e();
        r0 = 2130903210; // 0x7f0300aa float:1.7413232E38 double:1.0528060707E-314;
        com.whatsapp.DialogToastActivity.a(r11, r0);
        r0 = r11.getIntent();
        r4 = z;
        r5 = 17;
        r4 = r4[r5];
        r0 = r0.getStringExtra(r4);
        r11.n = r0;
        if (r12 == 0) goto L_0x005e;
    L_0x0051:
        r0 = z;
        r4 = 6;
        r0 = r0[r4];
        r0 = r12.getSerializable(r0);
        r0 = (com.whatsapp.k1) r0;
        r11.u = r0;
    L_0x005e:
        r0 = new com.whatsapp.GoogleMapView;
        r0.<init>(r11);
        r11.r = r0;
        r0 = r11.r;
        r0.setClickable(r8);
        r0 = r11.r;
        r0.setEnabled(r8);
        r0 = r11.r;
        r0.setMapListener(r11);
        r0 = r11.r;
        r0.setBuiltInZoomControls(r1);
        r0 = r11.r;
        r0 = r0.getController();
        r4 = 18;
        r0.setZoom(r4);
        r0 = 2131755560; // 0x7f100228 float:1.9142003E38 double:1.0532271875E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r4 = r11.r;
        r0.addView(r4);
        r0 = new com.whatsapp.m4;
        r4 = r11.r;
        r0.<init>(r11, r11, r4);
        r11.i = r0;
        r0 = new android.os.Handler;
        r4 = android.os.Looper.getMainLooper();
        r0.<init>(r4);
        r11.s = r0;
        r0 = new com.whatsapp.tx;
        r0.<init>(r11);
        r11.d = r0;
        r0 = r11.u;
        if (r0 != 0) goto L_0x00c6;
    L_0x00b1:
        r0 = r11.i;
        r4 = new com.whatsapp.ado;
        r4.<init>(r11);
        r0.runOnFirstFix(r4);
        r0 = r11.s;
        r4 = r11.d;
        r6 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        r0.postDelayed(r4, r6);
        if (r3 == 0) goto L_0x0116;
    L_0x00c6:
        if (r12 == 0) goto L_0x00ff;
    L_0x00c8:
        r0 = z;
        r4 = 11;
        r0 = r0[r4];
        r0 = r12.getInt(r0);
        if (r0 <= 0) goto L_0x00fd;
    L_0x00d4:
        r4 = new com.google.android.maps.GeoPoint;
        r5 = z;
        r5 = r5[r2];
        r5 = r12.getInt(r5);
        r6 = z;
        r7 = 13;
        r6 = r6[r7];
        r6 = r12.getInt(r6);
        r4.<init>(r5, r6);
        r5 = r11.r;
        r5 = r5.getController();
        r5.setCenter(r4);
        r4 = r11.r;
        r4 = r4.getController();
        r4.setZoom(r0);
    L_0x00fd:
        if (r3 == 0) goto L_0x0116;
    L_0x00ff:
        r0 = r11.u;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0116;
    L_0x0107:
        r0 = r11.r;
        r3 = r11.u;
        r3 = r3.a();
        r3 = com.whatsapp.GoogleMapView.a(r3);
        r0.b(r3);
    L_0x0116:
        r0 = new com.whatsapp.fr;
        r0.<init>(r11);
        r11.m = r0;
        r0 = r11.m;
        r0.a();
        r0 = r11.r;
        r0 = r0.getOverlays();
        r3 = r11.m;
        r0.add(r3);
        r0 = r11.r;
        r0 = r0.getOverlays();
        r3 = r11.i;
        r0.add(r3);
        r0 = 2131755736; // 0x7f1002d8 float:1.914236E38 double:1.0532272745E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r11.f = r0;
        r0 = 2131755734; // 0x7f1002d6 float:1.9142356E38 double:1.0532272735E-314;
        r3 = r11.findViewById(r0);
        r0 = new com.whatsapp.h_;
        r0.<init>(r11);
        r3.setOnClickListener(r0);
        r0 = new com.whatsapp.ak1;
        r0.<init>(r11);
        r11.j = r0;
        r0 = 2131755738; // 0x7f1002da float:1.9142364E38 double:1.0532272755E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r11.h = r0;
        r0 = new android.widget.TextView;
        r0.<init>(r11);
        r11.e = r0;
        r0 = r11.e;
        r4 = android.text.method.LinkMovementMethod.getInstance();
        r0.setMovementMethod(r4);
        r0 = r11.e;
        r4 = 17;
        r0.setGravity(r4);
        r0 = r11.e;
        r4 = com.whatsapp.a4d.a();
        r4 = r4.w;
        r4 = (int) r4;
        r5 = com.whatsapp.a4d.a();
        r5 = r5.w;
        r5 = (int) r5;
        r0.setPadding(r4, r1, r5, r1);
        r0 = r11.h;
        r0.setFooterDividersEnabled(r8);
        r0 = r11.h;
        r4 = r11.e;
        r0.addFooterView(r4, r9, r8);
        r0 = 2130903212; // 0x7f0300ac float:1.7413236E38 double:1.0528060717E-314;
        r0 = android.view.View.inflate(r11, r0, r9);
        r11.g = r0;
        r0 = r11.g;
        r0.setVisibility(r2);
        r0 = r11.h;
        r4 = r11.g;
        r0.addFooterView(r4, r9, r1);
        r0 = r11.h;
        r4 = r11.j;
        r0.setAdapter(r4);
        r11.a();
        r0 = r11.h;
        r4 = new com.whatsapp.sr;
        r4.<init>(r11);
        r0.setOnItemClickListener(r4);
        r0 = new com.whatsapp.i4;
        r0.<init>(r11, r9);
        r11.q = r0;
        r0 = r11.h;
        r4 = r11.q;
        r0.setOnScrollListener(r4);
        r0 = 2131755580; // 0x7f10023c float:1.9142043E38 double:1.0532271974E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r11.l = r0;
        r4 = r11.l;
        r0 = r11.u;
        if (r0 != 0) goto L_0x02cc;
    L_0x01e2:
        r0 = r1;
    L_0x01e3:
        r4.setVisibility(r0);
        r0 = 2131755733; // 0x7f1002d5 float:1.9142354E38 double:1.053227273E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r2);
        r0 = 2131755690; // 0x7f1002aa float:1.9142266E38 double:1.053227252E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r2 = 2130837676; // 0x7f0200ac float:1.7280313E38 double:1.0527736926E-314;
        r0.setImageResource(r2);
        r2 = new com.whatsapp.adq;
        r2.<init>(r11);
        r0.setOnClickListener(r2);
        r0 = com.whatsapp.App.am;
        r2 = 3;
        if (r0 != r2) goto L_0x0214;
    L_0x020c:
        r0 = new com.whatsapp.nz;
        r0.<init>(r11);
        r3.setOnLongClickListener(r0);
    L_0x0214:
        if (r12 != 0) goto L_0x023d;
    L_0x0216:
        r0 = z;
        r2 = 9;
        r0 = r0[r2];
        r0 = r11.getSystemService(r0);
        r0 = (android.location.LocationManager) r0;
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r2 = r0.isProviderEnabled(r2);
        if (r2 != 0) goto L_0x023d;
    L_0x022e:
        r2 = z;
        r3 = 16;
        r2 = r2[r3];
        r0 = r0.isProviderEnabled(r2);
        if (r0 != 0) goto L_0x023d;
    L_0x023a:
        r11.showDialog(r10);
    L_0x023d:
        r0 = 2131755438; // 0x7f1001ae float:1.9141755E38 double:1.0532271273E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r2 = r0.getMenu();
        r3 = 2131231845; // 0x7f080465 float:1.8079783E38 double:1.052968438E-314;
        r2 = r2.add(r1, r1, r1, r3);
        r3 = 2130839445; // 0x7f020795 float:1.72839E38 double:1.0527745666E-314;
        r2 = r2.setIcon(r3);
        android.support.v4.view.MenuItemCompat.setShowAsAction(r2, r10);
        r2 = r0.getMenu();
        r3 = 2131231737; // 0x7f0803f9 float:1.8079563E38 double:1.0529683846E-314;
        r1 = r2.add(r1, r8, r1, r3);
        r2 = 2130839443; // 0x7f020793 float:1.7283897E38 double:1.0527745656E-314;
        r1 = r1.setIcon(r2);
        android.support.v4.view.MenuItemCompat.setShowAsAction(r1, r10);
        r1 = new com.whatsapp.ww;
        r1.<init>(r11);
        r0.setOnMenuItemClickListener(r1);
        r0 = new java.io.File;
        r1 = com.whatsapp.App.z();
        r1 = r1.getCacheDir();
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r0.<init>(r1, r2);
        r1 = r0.mkdirs();
        if (r1 != 0) goto L_0x029f;
    L_0x0290:
        r1 = r0.isDirectory();
        if (r1 != 0) goto L_0x029f;
    L_0x0296:
        r1 = z;
        r2 = 12;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
    L_0x029f:
        r1 = new com.whatsapp.util.a3;
        r1.<init>(r0);
        r0 = com.whatsapp.a4d.a();
        r0 = r0.g;
        r2 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r0 = r0 * r2;
        r0 = (int) r0;
        r0 = r1.a(r0);
        r0 = r0.a();
        r11.o = r0;
        r0 = 2131755659; // 0x7f10028b float:1.9142204E38 double:1.0532272364E-314;
        r0 = r11.findViewById(r0);
        r1 = new com.whatsapp.yg;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r11.c();
        goto L_0x002d;
    L_0x02cc:
        r0 = r2;
        goto L_0x01e3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationPicker.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                a(a5.CANCEL);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    static Location a(LocationPicker locationPicker, Location location) {
        locationPicker.k = location;
        return location;
    }

    static k1 n(LocationPicker locationPicker) {
        return locationPicker.u;
    }

    static fr i(LocationPicker locationPicker) {
        return locationPicker.m;
    }

    static void q(LocationPicker locationPicker) {
        locationPicker.d();
    }

    private void a(a5 a5Var) {
        a(a5Var, 0);
    }

    static void a(LocationPicker locationPicker, Location location, int i, String str, boolean z) {
        locationPicker.a(location, i, str, z);
    }

    protected void onPause() {
        super.onPause();
        this.i.disableMyLocation();
    }

    static Location b(LocationPicker locationPicker) {
        return locationPicker.k;
    }

    public void onBackPressed() {
        a(a5.CANCEL);
        super.onBackPressed();
    }

    private void b() {
        this.e.setVisibility(8);
        this.g.setVisibility(8);
    }

    static void e(LocationPicker locationPicker) {
        locationPicker.a();
    }

    static k1 a(LocationPicker locationPicker, k1 k1Var) {
        locationPicker.u = k1Var;
        return k1Var;
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case at.i /*2*/:
                return new Builder(this).setTitle(2131231271).setMessage(2131231270).setCancelable(true).setPositiveButton(2131231580, new awz(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.s != null) {
            this.s.removeCallbacks(this.d);
        }
        if (this.a != null) {
            this.a.cancel(true);
            this.a = null;
        }
        this.o.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.fieldstats.a5 r15, int r16) {
        /*
        r14 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r12 = 0;
        r2 = r14.t;
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x0019;
    L_0x000c:
        r2 = 0;
        r4 = java.lang.System.currentTimeMillis();
        r6 = r14.t;
        r4 = r4 - r6;
        r12 = java.lang.Math.max(r2, r4);
    L_0x0019:
        r1 = r14.u;
        if (r1 != 0) goto L_0x0021;
    L_0x001d:
        r5 = com.whatsapp.fieldstats.b1.DID_NOT_REQUEST;
        if (r0 == 0) goto L_0x0040;
    L_0x0021:
        r1 = r14.u;
        r1 = r1.b();
        if (r1 != 0) goto L_0x002d;
    L_0x0029:
        r5 = com.whatsapp.fieldstats.b1.CANCEL;
        if (r0 == 0) goto L_0x0040;
    L_0x002d:
        r1 = com.whatsapp.dh.a;
        r2 = r14.u;
        r2 = r2.f();
        r2 = r2.ordinal();
        r1 = r1[r2];
        switch(r1) {
            case 1: goto L_0x0079;
            case 2: goto L_0x007d;
            case 3: goto L_0x0081;
            case 4: goto L_0x0085;
            case 5: goto L_0x0089;
            default: goto L_0x003e;
        };
    L_0x003e:
        r5 = com.whatsapp.fieldstats.b1.OK;
    L_0x0040:
        r0 = r14.u;
        if (r0 == 0) goto L_0x004c;
    L_0x0044:
        r0 = r14.u;
        r0 = r0.b();
        if (r0 != 0) goto L_0x008e;
    L_0x004c:
        r0 = com.whatsapp.k1.j();
    L_0x0050:
        r2 = com.whatsapp.k1.c(r0);
        r0 = com.whatsapp.k1.c();
        r3 = com.whatsapp.k1.c(r0);
        r0 = r14.u;
        if (r0 != 0) goto L_0x0095;
    L_0x0060:
        r6 = 0;
    L_0x0061:
        r7 = 0;
        r0 = r14.u;
        if (r0 != 0) goto L_0x009c;
    L_0x0066:
        r8 = 0;
    L_0x0067:
        r0 = r14.u;
        if (r0 != 0) goto L_0x00a3;
    L_0x006b:
        r9 = 0;
    L_0x006c:
        r0 = r14.u;
        if (r0 != 0) goto L_0x00ac;
    L_0x0070:
        r10 = 0;
    L_0x0071:
        r1 = r14;
        r4 = r15;
        r11 = r16;
        com.whatsapp.nf.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        return;
    L_0x0079:
        r5 = com.whatsapp.fieldstats.b1.OK;
        if (r0 == 0) goto L_0x0040;
    L_0x007d:
        r5 = com.whatsapp.fieldstats.b1.FAILED_COMMUNICATION;
        if (r0 == 0) goto L_0x0040;
    L_0x0081:
        r5 = com.whatsapp.fieldstats.b1.FAILED_OUT_OF_QUOTA;
        if (r0 == 0) goto L_0x0040;
    L_0x0085:
        r5 = com.whatsapp.fieldstats.b1.FAILED_OTHER;
        if (r0 == 0) goto L_0x0040;
    L_0x0089:
        r5 = com.whatsapp.fieldstats.b1.CANCEL;
        if (r0 == 0) goto L_0x0040;
    L_0x008d:
        goto L_0x003e;
    L_0x008e:
        r0 = r14.u;
        r0 = r0.b();
        goto L_0x0050;
    L_0x0095:
        r0 = r14.u;
        r6 = r0.n();
        goto L_0x0061;
    L_0x009c:
        r0 = r14.u;
        r8 = r0.g();
        goto L_0x0067;
    L_0x00a3:
        r0 = r14.u;
        r0 = r0.h();
        r9 = r0 + 1;
        goto L_0x006c;
    L_0x00ac:
        r0 = r14.u;
        r10 = r0.o();
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationPicker.a(com.whatsapp.fieldstats.a5, int):void");
    }

    static ak1 j(LocationPicker locationPicker) {
        return locationPicker.j;
    }

    static ListView l(LocationPicker locationPicker) {
        return locationPicker.h;
    }

    public LocationPicker() {
        this.b = true;
    }

    static boolean d(LocationPicker locationPicker) {
        return locationPicker.p;
    }

    private void a() {
        String str = null;
        if (this.u != null) {
            if (this.u.b() == 3) {
                str = getString(2131231405, new Object[]{z[18]});
            } else {
                str = this.u.s();
            }
        }
        this.g.setVisibility(8);
        if (str != null) {
            this.e.setText(Html.fromHtml(str));
            this.e.setVisibility(0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.e.setVisibility(8);
    }

    static void a(LocationPicker locationPicker, a5 a5Var) {
        locationPicker.a(a5Var);
    }

    private void a(Location location, int i, String str, boolean z) {
        this.s.removeCallbacks(this.d);
        this.l.setVisibility(0);
        findViewById(2131755739).setVisibility(8);
        b();
        this.u = new k1();
        this.q.a(false);
        this.j.notifyDataSetChanged();
        this.a = new r8(this, location, i, str, z);
        bq.a(this.a, new Void[0]);
    }

    static GoogleMapView o(LocationPicker locationPicker) {
        return locationPicker.r;
    }

    private void d() {
        this.e.setVisibility(8);
        this.g.setVisibility(0);
    }

    public void a(GeoPoint geoPoint, int i, int i2) {
    }

    static ProgressBar c(LocationPicker locationPicker) {
        return locationPicker.l;
    }

    public void onNewIntent(Intent intent) {
        if (z[0].equals(intent.getAction())) {
            a(this.r.b(), Math.max(this.r.c(), 1500), intent.getStringExtra(z[1]), true);
        }
    }

    static PlaceInfo a(LocationPicker locationPicker, PlaceInfo placeInfo) {
        locationPicker.c = placeInfo;
        return placeInfo;
    }

    static MyLocationOverlay f(LocationPicker locationPicker) {
        return locationPicker.i;
    }

    static bb m(LocationPicker locationPicker) {
        return locationPicker.o;
    }

    static boolean a(LocationPicker locationPicker, boolean z) {
        locationPicker.b = z;
        return z;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        GeoPoint mapCenter = this.r.getMapCenter();
        bundle.putInt(z[2], mapCenter.getLatitudeE6());
        bundle.putInt(z[5], mapCenter.getLongitudeE6());
        bundle.putInt(z[4], this.r.getZoomLevel());
        bundle.putSerializable(z[3], this.u);
    }

    static PlaceInfo g(LocationPicker locationPicker) {
        return locationPicker.c;
    }

    static boolean b(LocationPicker locationPicker, boolean z) {
        locationPicker.p = z;
        return z;
    }

    static String k(LocationPicker locationPicker) {
        return locationPicker.n;
    }

    static boolean a(LocationPicker locationPicker) {
        return locationPicker.b;
    }

    static TextView p(LocationPicker locationPicker) {
        return locationPicker.f;
    }

    public boolean onSearchRequested() {
        String str;
        this.b = false;
        ViewGroup viewGroup = (ViewGroup) findViewById(2131755557);
        if (viewGroup != null) {
            viewGroup.setLayoutParams(new LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
        }
        if (this.u == null) {
            str = null;
        } else {
            str = this.u.g();
        }
        startSearch(str, true, null, false);
        return true;
    }

    private void c() {
        boolean u = App.u((Context) this);
        ((Toolbar) findViewById(2131755438)).getMenu().findItem(0).setVisible(u);
        if (u) {
            findViewById(2131755740).setVisibility(8);
            findViewById(2131755734).setVisibility(0);
            findViewById(2131755690).setVisibility(0);
            findViewById(2131755737).setVisibility(0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        findViewById(2131755734).setVisibility(8);
        findViewById(2131755737).setVisibility(8);
        findViewById(2131755690).setVisibility(8);
        findViewById(2131755740).setVisibility(0);
    }

    static void a(LocationPicker locationPicker, a5 a5Var, int i) {
        locationPicker.a(a5Var, i);
    }

    static i4 h(LocationPicker locationPicker) {
        return locationPicker.q;
    }

    protected boolean isRouteDisplayed() {
        return false;
    }
}
