package com.whatsapp;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import org.v;
import org.whispersystems.at;

@TargetApi(8)
public class GoogleMapView2 extends MapView {
    private static final String[] z;
    private float[] b;
    private int c;
    private float d;
    private Display e;
    private float f;
    private float g;
    private float[] h;
    private SensorManager i;
    private SensorEventListener j;
    private float[] k;
    private boolean l;
    private long m;

    static {
        String[] strArr = new String[2];
        String str = "\b+Omx\b";
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
                        i3 = 127;
                        break;
                    case at.g /*1*/:
                        i3 = 66;
                        break;
                    case at.i /*2*/:
                        i3 = 33;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\f'Ozx\r";
                    obj = null;
            }
        }
    }

    static Display f(GoogleMapView2 googleMapView2) {
        return googleMapView2.e;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.c != 2) {
            this.c = 2;
            a(this.c);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    static float b(GoogleMapView2 googleMapView2, float f) {
        googleMapView2.f = f;
        return f;
    }

    static float[] a(GoogleMapView2 googleMapView2) {
        return googleMapView2.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLocationMode(int r11) {
        /*
        r10 = this;
        r9 = 2;
        r8 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.getMap();
        r2 = r0.getCameraPosition();
        switch(r11) {
            case 0: goto L_0x0010;
            case 1: goto L_0x0083;
            case 2: goto L_0x00cf;
            default: goto L_0x000f;
        };
    L_0x000f:
        return;
    L_0x0010:
        r0 = r10.l;
        if (r0 == 0) goto L_0x000f;
    L_0x0014:
        r0 = r2.zoom;
        r10.d = r0;
        r0 = 0;
        r10.a(r0);
        r0 = r10.getMap();
        r3 = r0.getMyLocation();
        if (r3 == 0) goto L_0x0035;
    L_0x0026:
        r0 = new com.google.android.gms.maps.model.LatLng;
        r4 = r3.getLatitude();
        r6 = r3.getLongitude();
        r0.<init>(r4, r6);
        if (r1 == 0) goto L_0x0037;
    L_0x0035:
        r0 = r2.target;
    L_0x0037:
        if (r0 == 0) goto L_0x0077;
    L_0x0039:
        r4 = 4632233691727265792; // 0x4049000000000000 float:0.0 double:50.0;
        r3 = r10.f;
        r6 = (double) r3;
        r0 = a(r0, r4, r6);
        r3 = com.google.android.gms.maps.model.CameraPosition.builder();
        r4 = r10.g;
        r5 = 1116143616; // 0x42870000 float:67.5 double:5.514482165E-315;
        r4 = a(r4, r8, r5);
        r3 = r3.tilt(r4);
        r4 = r10.f;
        r3 = r3.bearing(r4);
        r4 = r10.d;
        r5 = 1097859072; // 0x41700000 float:15.0 double:5.424144515E-315;
        r4 = java.lang.Math.max(r4, r5);
        r3 = r3.zoom(r4);
        r0 = r3.target(r0);
        r0 = r0.build();
        r3 = r10.getMap();
        r0 = com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(r0);
        r3.animateCamera(r0);
    L_0x0077:
        r0 = new com.whatsapp.vd;
        r0.<init>(r10);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r10.postDelayed(r0, r4);
        if (r1 == 0) goto L_0x000f;
    L_0x0083:
        r0 = r10.getMap();
        r3 = r0.getMyLocation();
        if (r3 == 0) goto L_0x009f;
    L_0x008d:
        r0 = new com.google.android.gms.maps.model.LatLng;
        r4 = r3.getLatitude();
        r6 = r3.getLongitude();
        r0.<init>(r4, r6);
        r3 = 1;
        r10.c = r3;
        if (r1 == 0) goto L_0x00a3;
    L_0x009f:
        r0 = r2.target;
        r10.c = r9;
    L_0x00a3:
        r3 = com.google.android.gms.maps.model.CameraPosition.builder();
        r0 = r3.target(r0);
        r2 = r2.zoom;
        r0 = r0.zoom(r2);
        r0 = r0.tilt(r8);
        r0 = r0.bearing(r8);
        r0 = r0.build();
        r2 = r10.getMap();
        r0 = com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(r0);
        r2.animateCamera(r0);
        r0 = r10.c;
        r10.a(r0);
        if (r1 == 0) goto L_0x000f;
    L_0x00cf:
        r10.c = r9;
        r10.a(r9);
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GoogleMapView2.setLocationMode(int):void");
    }

    private void a(Context context) {
        this.i = (SensorManager) context.getSystemService(z[1]);
        this.e = ((WindowManager) context.getSystemService(z[0])).getDefaultDisplay();
    }

    static float c(GoogleMapView2 googleMapView2) {
        return googleMapView2.g;
    }

    static int g(GoogleMapView2 googleMapView2) {
        return googleMapView2.c;
    }

    public GoogleMapView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 2;
        this.k = new float[16];
        this.b = new float[3];
        this.h = new float[3];
        this.j = new ov(this);
        a(context);
    }

    public GoogleMapView2(Context context) {
        super(context);
        this.c = 2;
        this.k = new float[16];
        this.b = new float[3];
        this.h = new float[3];
        this.j = new ov(this);
        a(context);
    }

    static float a(GoogleMapView2 googleMapView2, float f, float f2) {
        return googleMapView2.a(f, f2);
    }

    public GoogleMapView2(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        this.c = 2;
        this.k = new float[16];
        this.b = new float[3];
        this.h = new float[3];
        this.j = new ov(this);
        a(context);
    }

    public void c() {
        if (this.i != null) {
            this.i.unregisterListener(this.j);
        }
    }

    static float a(GoogleMapView2 googleMapView2, float f) {
        googleMapView2.g = f;
        return f;
    }

    static int a(GoogleMapView2 googleMapView2, int i) {
        googleMapView2.c = i;
        return i;
    }

    public GoogleMapView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 2;
        this.k = new float[16];
        this.b = new float[3];
        this.h = new float[3];
        this.j = new ov(this);
        a(context);
    }

    public void a() {
        if (this.i != null) {
            boolean z;
            Sensor defaultSensor = this.i.getDefaultSensor(11);
            if (defaultSensor != null) {
                z = true;
            } else {
                z = false;
            }
            this.l = z;
            if (defaultSensor != null) {
                this.i.registerListener(this.j, defaultSensor, 16000);
            }
        }
    }

    public static LatLng a(LatLng latLng, double d, double d2) {
        double d3 = d / 6378137.0d;
        double toRadians = Math.toRadians(d2);
        double toRadians2 = Math.toRadians(latLng.latitude);
        double toRadians3 = Math.toRadians(latLng.longitude);
        double cos = Math.cos(d3);
        d3 = Math.sin(d3);
        double sin = Math.sin(toRadians2);
        toRadians2 = Math.cos(toRadians2);
        double cos2 = (cos * sin) + ((d3 * toRadians2) * Math.cos(toRadians));
        return new LatLng(Math.toDegrees(Math.asin(cos2)), Math.toDegrees(Math.atan2((d3 * toRadians2) * Math.sin(toRadians), cos - (sin * cos2)) + toRadians3));
    }

    static float d(GoogleMapView2 googleMapView2) {
        return googleMapView2.d;
    }

    static float[] e(GoogleMapView2 googleMapView2) {
        return googleMapView2.k;
    }

    public static float a(float f, float f2, float f3) {
        return Math.max(Math.min(f, f3), f2);
    }

    static float h(GoogleMapView2 googleMapView2) {
        return googleMapView2.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float a(float r10, float r11) {
        /*
        r9 = this;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r2 = com.whatsapp.DialogToastActivity.f;
        r4 = java.lang.System.currentTimeMillis();
        r6 = r9.m;
        r6 = r4 - r6;
        r1 = (float) r6;
        r3 = 1137180672; // 0x43c80000 float:400.0 double:5.61841903E-315;
        r1 = r1 / r3;
        r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0068;
    L_0x0016:
        r9.m = r4;
        r1 = r10 - r11;
        r1 = java.lang.Math.abs(r1);
        r3 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 >= 0) goto L_0x0038;
    L_0x0024:
        r1 = r10 - r11;
        r1 = java.lang.Math.abs(r1);
        r3 = 1114636288; // 0x42700000 float:60.0 double:5.507034975E-315;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 <= 0) goto L_0x0032;
    L_0x0030:
        if (r2 == 0) goto L_0x0065;
    L_0x0032:
        r1 = r10 - r11;
        r1 = r1 * r0;
        r1 = r1 + r11;
        if (r2 == 0) goto L_0x0066;
    L_0x0038:
        r4 = 4645040803167600640; // 0x4076800000000000 float:0.0 double:360.0;
        r1 = r10 - r11;
        r1 = java.lang.Math.abs(r1);
        r6 = (double) r1;
        r4 = r4 - r6;
        r6 = 4633641066610819072; // 0x404e000000000000 float:0.0 double:60.0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x004d;
    L_0x004b:
        if (r2 == 0) goto L_0x0065;
    L_0x004d:
        r1 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1));
        if (r1 <= 0) goto L_0x005b;
    L_0x0051:
        r1 = r8 + r10;
        r1 = r1 - r11;
        r1 = r1 % r8;
        r1 = r1 * r0;
        r1 = r1 + r11;
        r1 = r1 + r8;
        r1 = r1 % r8;
        if (r2 == 0) goto L_0x0066;
    L_0x005b:
        r1 = r8 - r10;
        r1 = r1 + r11;
        r1 = r1 % r8;
        r0 = r0 * r1;
        r0 = r11 - r0;
        r0 = r0 + r8;
        r10 = r0 % r8;
    L_0x0065:
        return r10;
    L_0x0066:
        r10 = r1;
        goto L_0x0065;
    L_0x0068:
        r0 = r1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GoogleMapView2.a(float, float):float");
    }

    static float[] b(GoogleMapView2 googleMapView2) {
        return googleMapView2.h;
    }

    public void a(int i) {
    }

    public void b() {
        boolean z = DialogToastActivity.f;
        switch (this.c) {
            case v.m /*0*/:
                setLocationMode(1);
                if (!z) {
                    return;
                }
                break;
            case at.g /*1*/:
                break;
            case at.i /*2*/:
                break;
            default:
                return;
        }
        setLocationMode(0);
        if (!z) {
            return;
        }
        setLocationMode(1);
    }
}
