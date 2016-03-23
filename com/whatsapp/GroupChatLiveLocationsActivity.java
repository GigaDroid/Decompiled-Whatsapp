package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MyLocationOverlay;
import com.whatsapp.protocol.cx;
import com.whatsapp.util.Log;
import com.whatsapp.util.u;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class GroupChatLiveLocationsActivity extends WAMapActivity implements a97 {
    private static final String[] z;
    private GoogleMapView a;
    private ar2 b;
    private cx c;
    private aox d;
    private int e;
    private MyLocationOverlay f;
    private ArrayList g;

    class 3 extends GoogleMapView {
        final GroupChatLiveLocationsActivity f;

        3(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, Context context) {
            this.f = groupChatLiveLocationsActivity;
            super(context);
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            GroupChatLiveLocationsActivity.a(this.f, null);
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        String[] strArr = new String[8];
        String str = "UG";
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
                        i3 = 121;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 13;
                        break;
                    default:
                        i3 = 112;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\\Vw!^H\u0001";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\\Vw!^H\u0001";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0015\u0006*b\u0005\r8:c\u0016\u0015\u0006'h\u0002";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0013\u000e7";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001e\u0015<x\u0000\u0015\b0l\u0004\u0010\b=~_\u001a\u00156l\u0004\u001c";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001e\u0015<x\u0000\u0015\b0l\u0004\u0010\b=~_\u001d\u0002 y\u0002\u0016\u001e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "UG";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void d(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        groupChatLiveLocationsActivity.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r22 = this;
        r10 = com.whatsapp.DialogToastActivity.f;
        r0 = r22;
        r2 = r0.g;
        r3 = r2.iterator();
    L_0x000a:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x001f;
    L_0x0010:
        r2 = r3.next();
        r2 = (android.view.View) r2;
        r0 = r22;
        r4 = r0.a;
        r4.removeView(r2);
        if (r10 == 0) goto L_0x000a;
    L_0x001f:
        r0 = r22;
        r2 = r0.a;
        r2 = r2.getWidth();
        r0 = r22;
        r3 = r0.a;
        r3 = r3.getHeight();
        if (r2 == 0) goto L_0x0033;
    L_0x0031:
        if (r3 != 0) goto L_0x0034;
    L_0x0033:
        return;
    L_0x0034:
        r2 = java.lang.Math.min(r2, r3);
        r2 = r2 / 10;
        r0 = r22;
        r3 = r0.a;
        r3 = r3.getZoomLevel();
        r4 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r6 = (double) r3;
        r4 = java.lang.Math.pow(r4, r6);
        r6 = 4643211215818981376; // 0x4070000000000000 float:0.0 double:256.0;
        r4 = r4 * r6;
        r6 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r4 = r4 / r6;
        r2 = r2 * 360;
        r2 = (double) r2;
        r4 = r2 / r4;
        r2 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r6 = r4 / r2;
        r8 = new java.util.HashMap;
        r8.<init>();
        r9 = new android.graphics.Point;
        r9.<init>();
        r0 = r22;
        r2 = r0.d;
        r2 = r2.j;
        r11 = r2.iterator();
    L_0x006c:
        r2 = r11.hasNext();
        if (r2 == 0) goto L_0x00f6;
    L_0x0072:
        r2 = r11.next();
        r2 = (com.whatsapp.protocol.cx) r2;
        r12 = r2.b;
        r14 = r2.a;
        r3 = new com.google.android.maps.GeoPoint;
        r0 = r2.a;
        r16 = r0;
        r18 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r16 = r16 * r18;
        r0 = r16;
        r0 = (int) r0;
        r16 = r0;
        r0 = r2.b;
        r18 = r0;
        r20 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r18 = r18 * r20;
        r0 = r18;
        r0 = (int) r0;
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r3.<init>(r0, r1);
        r0 = r22;
        r0 = r0.a;
        r16 = r0;
        r16 = r16.getProjection();
        r0 = r16;
        r0.toPixels(r3, r9);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r16 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r12 = r12 + r16;
        r12 = r12 / r4;
        r12 = (int) r12;
        r3 = r3.append(r12);
        r12 = " ";
        r3 = r3.append(r12);
        r12 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r12 = r12 + r14;
        r12 = r12 / r6;
        r12 = (int) r12;
        r3 = r3.append(r12);
        r3 = r3.toString();
        r12 = r8.containsKey(r3);
        if (r12 != 0) goto L_0x00eb;
    L_0x00e3:
        r12 = new java.util.ArrayList;
        r12.<init>();
        r8.put(r3, r12);
    L_0x00eb:
        r3 = r8.get(r3);
        r3 = (java.util.ArrayList) r3;
        r3.add(r2);
        if (r10 == 0) goto L_0x006c;
    L_0x00f6:
        r2 = new java.util.ArrayList;
        r3 = r8.values();
        r2.<init>(r3);
        r3 = new com.whatsapp.aiy;
        r0 = r22;
        r3.<init>(r0);
        java.util.Collections.sort(r2, r3);
        r11 = new java.util.ArrayList;
        r11.<init>();
        r12 = new java.util.ArrayList;
        r12.<init>();
        r13 = r2.iterator();
    L_0x0117:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0223;
    L_0x011d:
        r2 = r13.next();
        r2 = (java.util.ArrayList) r2;
        r14 = new android.widget.LinearLayout;
        r0 = r22;
        r14.<init>(r0);
        r3 = 0;
        r14.setOrientation(r3);
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 1088421888; // 0x40e00000 float:7.0 double:5.37751863E-315;
        r7 = com.whatsapp.a4d.a();
        r7 = r7.g;
        r6 = r6 * r7;
        r6 = (int) r6;
        r14.setPadding(r3, r4, r5, r6);
        r15 = new android.widget.LinearLayout;
        r0 = r22;
        r15.<init>(r0);
        r3 = 1;
        r15.setOrientation(r3);
        r14.addView(r15);
        r3 = 1;
        r15.setClickable(r3);
        r3 = 1;
        r15.setFocusable(r3);
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r0 = r22;
        r3 = r0.getSystemService(r3);
        r3 = (android.view.LayoutInflater) r3;
        r4 = new com.whatsapp.ci;
        r4.<init>();
        r5 = 1094713344; // 0x41400000 float:12.0 double:5.408602553E-315;
        r6 = com.whatsapp.a4d.a();
        r6 = r6.g;
        r5 = r5 * r6;
        r5 = (int) r5;
        r4.a(r5);
        r15.setBackgroundDrawable(r4);
        r8 = 0;
        r6 = 0;
        r4 = 0;
        r16 = r2.iterator();
        r5 = r4;
    L_0x0180:
        r4 = r16.hasNext();
        if (r4 == 0) goto L_0x0253;
    L_0x0186:
        r4 = r16.next();
        r4 = (com.whatsapp.protocol.cx) r4;
        r17 = 2130903102; // 0x7f03003e float:1.7413012E38 double:1.0528060173E-314;
        r18 = 0;
        r0 = r17;
        r1 = r18;
        r17 = com.whatsapp.aam.a(r3, r0, r1);
        r0 = r22;
        r1 = r17;
        r0.a(r1, r4);
        r0 = r17;
        r15.addView(r0);
        r0 = r17;
        r0.setTag(r4);
        r0 = r4.a;
        r18 = r0;
        r8 = r8 + r18;
        r0 = r4.b;
        r18 = r0;
        r6 = r6 + r18;
        r0 = r22;
        r0 = r0.d;
        r17 = r0;
        r0 = r17;
        r0 = r0.i;
        r17 = r0;
        r0 = r17;
        r4 = r0.contains(r4);
        if (r4 == 0) goto L_0x0250;
    L_0x01ca:
        r4 = 1;
    L_0x01cb:
        if (r10 == 0) goto L_0x024d;
    L_0x01cd:
        r3 = new com.google.android.maps.GeoPoint;
        r5 = r2.size();
        r0 = (double) r5;
        r16 = r0;
        r8 = r8 / r16;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r8 = r8 * r16;
        r5 = (int) r8;
        r8 = r2.size();
        r8 = (double) r8;
        r6 = r6 / r8;
        r8 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r6 = r6 * r8;
        r6 = (int) r6;
        r3.<init>(r5, r6);
        r15.setTag(r2);
        r15.setSelected(r4);
        r5 = new com.whatsapp.tl;
        r0 = r22;
        r5.<init>(r0, r2, r3);
        r15.setOnClickListener(r5);
        if (r4 == 0) goto L_0x020a;
    L_0x0202:
        r11.add(r14);
        r12.add(r3);
        if (r10 == 0) goto L_0x021a;
    L_0x020a:
        r0 = r22;
        r2 = r0.a;
        r4 = new com.google.android.maps.MapView$LayoutParams;
        r5 = -2;
        r6 = -2;
        r7 = 81;
        r4.<init>(r5, r6, r3, r7);
        r2.addView(r14, r4);
    L_0x021a:
        r0 = r22;
        r2 = r0.g;
        r2.add(r14);
        if (r10 == 0) goto L_0x0117;
    L_0x0223:
        r2 = 0;
        r4 = r2;
    L_0x0225:
        r2 = r11.size();
        if (r4 >= r2) goto L_0x0033;
    L_0x022b:
        r0 = r22;
        r5 = r0.a;
        r2 = r11.get(r4);
        r2 = (android.view.View) r2;
        r6 = new com.google.android.maps.MapView$LayoutParams;
        r7 = -2;
        r8 = -2;
        r3 = r12.get(r4);
        r3 = (com.google.android.maps.GeoPoint) r3;
        r9 = 81;
        r6.<init>(r7, r8, r3, r9);
        r5.addView(r2, r6);
        r2 = r4 + 1;
        if (r10 != 0) goto L_0x0033;
    L_0x024b:
        r4 = r2;
        goto L_0x0225;
    L_0x024d:
        r5 = r4;
        goto L_0x0180;
    L_0x0250:
        r4 = r5;
        goto L_0x01cb;
    L_0x0253:
        r4 = r5;
        goto L_0x01cd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatLiveLocationsActivity.a():void");
    }

    static MyLocationOverlay b(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.f;
    }

    static ar2 a(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.b;
    }

    protected boolean isRouteDisplayed() {
        return false;
    }

    static void e(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        groupChatLiveLocationsActivity.b();
    }

    public GroupChatLiveLocationsActivity() {
        this.g = new ArrayList();
        this.e = -1;
        this.d = new aod(this);
    }

    static GoogleMapView g(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r18 = this;
        r12 = com.whatsapp.DialogToastActivity.f;
        r8 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r6 = -4587338432941916160; // 0xc056800000000000 float:0.0 double:-90.0;
        r4 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r2 = -4582834833314545664; // 0xc066800000000000 float:0.0 double:-180.0;
        r0 = r18;
        r10 = r0.d;
        r10 = r10.j;
        r13 = r10.iterator();
        r10 = r8;
        r8 = r6;
        r6 = r4;
        r4 = r2;
    L_0x0024:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0100;
    L_0x002a:
        r2 = r13.next();
        r2 = (com.whatsapp.protocol.cx) r2;
        r14 = r2.a;
        r10 = java.lang.Math.min(r10, r14);
        r14 = r2.a;
        r8 = java.lang.Math.max(r8, r14);
        r14 = r2.b;
        r6 = java.lang.Math.min(r6, r14);
        r2 = r2.b;
        r2 = java.lang.Math.max(r4, r2);
        if (r12 == 0) goto L_0x00fd;
    L_0x004a:
        r4 = new com.google.android.maps.GeoPoint;
        r14 = r10 + r8;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r5 = (int) r14;
        r14 = r8 - r10;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4618441417868443648; // 0x4018000000000000 float:0.0 double:6.0;
        r14 = r14 / r16;
        r13 = (int) r14;
        r5 = r5 + r13;
        r14 = r6 + r2;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r13 = (int) r14;
        r4.<init>(r5, r13);
        r0 = r18;
        r5 = r0.d;
        r5 = r5.j;
        r5 = r5.size();
        if (r5 <= 0) goto L_0x0093;
    L_0x0086:
        r0 = r18;
        r5 = r0.a;
        r5 = r5.getController();
        r5.setCenter(r4);
        if (r12 == 0) goto L_0x00a1;
    L_0x0093:
        r0 = r18;
        r4 = r0.f;
        r5 = new com.whatsapp.t3;
        r0 = r18;
        r5.<init>(r0);
        r4.runOnFirstFix(r5);
    L_0x00a1:
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
        r3 = r0.d;
        r3 = r3.j;
        r3 = r3.size();
        r5 = 1;
        if (r3 > r5) goto L_0x00da;
    L_0x00cb:
        r0 = r18;
        r3 = r0.a;
        r3 = r3.getController();
        r5 = 17;
        r3.setZoom(r5);
        if (r12 == 0) goto L_0x00e5;
    L_0x00da:
        r0 = r18;
        r3 = r0.a;
        r3 = r3.getController();
        r3.zoomToSpan(r4, r2);
    L_0x00e5:
        r0 = r18;
        r2 = r0.a;
        r2 = r2.getZoomLevel();
        r3 = 1;
        if (r2 > r3) goto L_0x00fc;
    L_0x00f0:
        r0 = r18;
        r2 = r0.a;
        r2 = r2.getController();
        r3 = 2;
        r2.setZoom(r3);
    L_0x00fc:
        return;
    L_0x00fd:
        r4 = r2;
        goto L_0x0024;
    L_0x0100:
        r2 = r4;
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatLiveLocationsActivity.b():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231418).setIcon(2130837695), 2);
        if (App.j == 3) {
            u.b((Activity) this);
        }
        return true;
    }

    static ArrayList h(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.g;
    }

    static cx a(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, cx cxVar) {
        groupChatLiveLocationsActivity.c = cxVar;
        return cxVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.view.View r19, com.whatsapp.protocol.cx r20) {
        /*
        r18 = this;
        r11 = com.whatsapp.DialogToastActivity.f;
        r2 = com.whatsapp.App.as;
        r0 = r20;
        r3 = r0.f;
        r12 = r2.b(r3);
        r2 = 2131755455; // 0x7f1001bf float:1.914179E38 double:1.0532271357E-314;
        r0 = r19;
        r2 = r0.findViewById(r2);
        r9 = r2;
        r9 = (android.widget.TextView) r9;
        r0 = r18;
        r2 = r12.a(r0);
        r9.setText(r2);
        r2 = 2131755456; // 0x7f1001c0 float:1.9141792E38 double:1.053227136E-314;
        r0 = r19;
        r2 = r0.findViewById(r2);
        r10 = r2;
        r10 = (android.widget.TextView) r10;
        r2 = java.lang.System.currentTimeMillis();
        r0 = r20;
        r4 = r0.g;
        r2 = r2 - r4;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x0048;
    L_0x003d:
        r2 = 2131231407; // 0x7f0802af float:1.8078894E38 double:1.0529682215E-314;
        r0 = r18;
        r2 = r0.getString(r2);
        if (r11 == 0) goto L_0x005c;
    L_0x0048:
        r0 = r20;
        r2 = r0.g;
        r4 = java.lang.System.currentTimeMillis();
        r6 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r8 = 0;
        r2 = android.text.format.DateUtils.getRelativeTimeSpanString(r2, r4, r6, r8);
        r2 = r2.toString();
    L_0x005c:
        r0 = r20;
        r3 = r0.c;
        if (r3 == 0) goto L_0x0093;
    L_0x0062:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = 2131231404; // 0x7f0802ac float:1.8078888E38 double:1.05296822E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r0 = r20;
        r6 = r0.c;
        r6 = java.lang.Integer.valueOf(r6);
        r4[r5] = r6;
        r0 = r18;
        r3 = r0.getString(r3, r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x0093:
        r0 = r20;
        r3 = r0.i;
        r4 = (double) r3;
        r6 = 4601724776627584746; // 0x3fdc9c4da9003eea float:-2.847628E-14 double:0.44704;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x0143;
    L_0x00a1:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = java.util.Locale.US;
        r4 = com.whatsapp.aqu.f();
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0104;
    L_0x00c3:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = 2131231412; // 0x7f0802b4 float:1.8078904E38 double:1.052968224E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = z;
        r7 = 2;
        r6 = r6[r7];
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r0 = r20;
        r13 = r0.i;
        r14 = (double) r13;
        r16 = 4612219559875242487; // 0x4001e540cc78e9f7 float:-6.5251292E7 double:2.23694;
        r14 = r14 * r16;
        r13 = java.lang.Double.valueOf(r14);
        r7[r8] = r13;
        r6 = java.lang.String.format(r6, r7);
        r4[r5] = r6;
        r0 = r18;
        r3 = r0.getString(r3, r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        if (r11 == 0) goto L_0x0143;
    L_0x0104:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = 2131231411; // 0x7f0802b3 float:1.8078902E38 double:1.0529682235E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = z;
        r7 = 3;
        r6 = r6[r7];
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r0 = r20;
        r13 = r0.i;
        r14 = (double) r13;
        r16 = 4615288898129284301; // 0x400ccccccccccccd float:-1.07374184E8 double:3.6;
        r14 = r14 * r16;
        r13 = java.lang.Double.valueOf(r14);
        r7[r8] = r13;
        r6 = java.lang.String.format(r6, r7);
        r4[r5] = r6;
        r0 = r18;
        r3 = r0.getString(r3, r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x0143:
        r10.setText(r2);
        r2 = 2131755454; // 0x7f1001be float:1.9141788E38 double:1.053227135E-314;
        r0 = r19;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r3 = r18.getResources();
        r4 = 2131427544; // 0x7f0b00d8 float:1.8476707E38 double:1.053065126E-314;
        r3 = r3.getDimensionPixelSize(r4);
        r4 = r18.getResources();
        r5 = 2131427359; // 0x7f0b001f float:1.8476332E38 double:1.0530650347E-314;
        r4 = r4.getDimension(r5);
        r5 = 1;
        r3 = r12.a(r3, r4, r5);
        if (r3 == 0) goto L_0x0173;
    L_0x016e:
        r2.setImageBitmap(r3);
        if (r11 == 0) goto L_0x017a;
    L_0x0173:
        r3 = r12.z();
        r2.setImageResource(r3);
    L_0x017a:
        r2 = 8;
        r9.setVisibility(r2);
        r2 = 8;
        r10.setVisibility(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatLiveLocationsActivity.a(android.view.View, com.whatsapp.protocol.cx):void");
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[6]);
        aam.a(getWindow());
        super.onCreate(bundle);
        DialogToastActivity.a((Activity) this, 2130903196);
        Toolbar toolbar = (Toolbar) findViewById(2131755438);
        toolbar.setTitle(a28.b(qa.d(getIntent().getStringExtra(z[5])).a((Context) this), this));
        onCreateOptionsMenu(toolbar.getMenu());
        toolbar.setOnMenuItemClickListener(new v3(this));
        this.d.a((Activity) this);
        this.a = new 3(this, this);
        this.a.setClickable(true);
        this.a.setEnabled(true);
        this.a.setMapListener(this);
        this.a.setBuiltInZoomControls(false);
        this.a.getController().setZoom(17);
        ((ViewGroup) findViewById(2131755560)).addView(this.a);
        this.f = new mv(this, this, this.a);
        this.a.getOverlays().add(this.f);
        this.b = new ar2(this);
        this.b.a();
        this.a.getOverlays().add(this.b);
        this.a.getViewTreeObserver().addOnPreDrawListener(new a4x(this));
        findViewById(2131755690).setOnClickListener(new a3g(this));
    }

    protected void onResume() {
        super.onResume();
        this.f.enableMyLocation();
        this.d.e();
    }

    static cx c(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.c;
    }

    public void a(GeoPoint geoPoint, int i, int i2) {
        int zoomLevel = this.a.getZoomLevel();
        if (zoomLevel <= 1) {
            zoomLevel = 2;
            this.a.getController().setZoom(2);
        }
        if (this.e != zoomLevel) {
            this.e = zoomLevel;
            a();
        }
    }

    static aox f(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.d;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case v.m /*0*/:
                this.a.setSatellite(!this.a.isSatellite());
                return true;
            case 16908332:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    protected void onPause() {
        super.onPause();
        this.f.disableMyLocation();
        this.d.h();
    }

    public void onDestroy() {
        Log.i(z[7]);
        super.onDestroy();
        this.d.b();
    }
}
