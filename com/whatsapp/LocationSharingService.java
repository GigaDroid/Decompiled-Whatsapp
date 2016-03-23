package com.whatsapp;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import com.whatsapp.protocol.cx;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class LocationSharingService extends Service implements LocationListener {
    private static Location b;
    private static final String[] z;
    private Location a;
    private Runnable c;
    private di d;
    private WakeLock e;
    private Handler f;

    static {
        String[] strArr = new String[12];
        String str = "64\u001e\u0010\u000434\u0013\u0002\u0018;)\u0014\u001f\u0017)>\u000f\u0007\u00199>R\u0016\u0000)t\u0018\u0003\u00025)]";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = 91;
                        break;
                    case at.i /*2*/:
                        i3 = 125;
                        break;
                    case at.o /*3*/:
                        i3 = 113;
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
                    str = "64\u001e\u0010\u000434\u0013\u0002\u0018;)\u0014\u001f\u0017)>\u000f\u0007\u00199>R\u0012\u0002?:\t\u0014";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\t3\u001c\u0003\u0015\u00164\u001e\u0010\u000434\u0013\"\u0015(-\u0014\u0012\u0015";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "64\u001e\u0010\u000434\u0013\u0002\u0018;)\u0014\u001f\u0017)>\u000f\u0007\u00199>R\u0012\u0002?:\t\u0014_*6";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "64\u001e\u0010\u000434\u0013\u0002\u0018;)\u0014\u001f\u0017)>\u000f\u0007\u00199>R\u001e\u001e64\u001e\u0010\u000434\u0013\u0012\u0018;5\u001a\u0014\u0014z";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "64\u001e\u0010\u000434\u0013\u0002\u0018;)\u0014\u001f\u0017)>\u000f\u0007\u00199>R\u0015\u0015)/\u000f\u001e\t";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "64\u001e\u0010\u000434\u0013\u0002\u0018;)\u0014\u001f\u0017)>\u000f\u0007\u00199>R\u0002\u00045+";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "94\u0010_\u00072:\t\u0002\u0011*+S\"\u0018;)\u0018=\u001f9:\t\u0018\u001f4\b\u0018\u0003\u000638\u0018_#\u000e\u0014-";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "64\u001e\u0010\u000434\u0013\u0002\u0018;)\u0014\u001f\u0017)>\u000f\u0007\u00199>R\u0002\u0004;)\tQ\u001c;(\tKP";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "64\u001e\u0010\u000434\u0013\u0002\u0018;)\u0014\u001f\u0017)>\u000f\u0007\u00199>R\u0002\u0004;)\tQ\u0014/)\u001c\u0005\u001955G";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ">.\u000f\u0010\u000434\u0013";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "*4\n\u0014\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onLocationChanged(Location location) {
        try {
            Log.i(z[5] + location);
            if (a(location, b)) {
                a(location);
                this.a = location;
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            try {
                if (location.getAccuracy() < 80.0f) {
                    this.a = location;
                }
                try {
                    if (this.a == null) {
                        return;
                    }
                    if (b.getTime() + 40000 < this.a.getTime()) {
                        a(this.a);
                    }
                } catch (RuntimeException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (RuntimeException e22) {
                throw e22;
            }
        } catch (RuntimeException e222) {
            throw e222;
        } catch (RuntimeException e2222) {
            throw e2222;
        }
    }

    public void onCreate() {
        Log.i(z[2]);
        try {
            PowerManager powerManager = (PowerManager) getSystemService(z[1]);
            if (powerManager != null) {
                try {
                    if (this.e == null) {
                        this.e = powerManager.newWakeLock(1, z[3]);
                    }
                    try {
                        if (!(this.e == null || this.e.isHeld())) {
                            this.e.acquire();
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                } catch (RuntimeException e22) {
                    throw e22;
                } catch (RuntimeException e222) {
                    throw e222;
                }
            }
        } catch (Throwable e3) {
            Log.b(z[4], e3);
        }
        this.f.postDelayed(this.c, 40000);
        this.d = new di(this);
        try {
            this.d.a(1000, 0.0f, this);
        } catch (IllegalArgumentException e4) {
            Log.w(z[0] + e4.toString());
        }
    }

    private void a(Location location) {
        b = location;
        cx cxVar = new cx();
        try {
            cxVar.a = ((double) Math.round(location.getLatitude() * 1000000.0d)) / 1000000.0d;
            cxVar.b = ((double) Math.round(location.getLongitude() * 1000000.0d)) / 1000000.0d;
            if (location.hasAccuracy()) {
                cxVar.c = (int) location.getAccuracy();
            }
            try {
                if (location.hasSpeed()) {
                    cxVar.i = ((float) ((int) (location.getSpeed() * 100.0f))) / 100.0f;
                }
                try {
                    if (location.hasBearing()) {
                        cxVar.h = (int) location.getBearing();
                    }
                    try {
                        cxVar.g = location.getTime();
                        if (cxVar.g > System.currentTimeMillis()) {
                            cxVar.g = System.currentTimeMillis();
                        }
                        App.a(cxVar);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (RuntimeException e22) {
                throw e22;
            }
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public LocationSharingService() {
        this.f = new Handler(Looper.getMainLooper());
        this.c = new ab(this);
    }

    private static boolean a(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        try {
            if (location2.getTime() + 120000 < location.getTime()) {
                return true;
            }
            try {
                if (location2.getAccuracy() > location.getAccuracy()) {
                    return true;
                }
                try {
                    if (TextUtils.equals(location2.getProvider(), location.getProvider())) {
                        if (location2.distanceTo(location) > Math.max(10.0f, location.getAccuracy())) {
                            return true;
                        }
                    }
                    return false;
                } catch (RuntimeException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (RuntimeException e22) {
                throw e22;
            }
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r10, int r11, int r12) {
        /*
        r9 = this;
        r0 = 40000; // 0x9c40 float:5.6052E-41 double:1.97626E-319;
        r8 = 1;
        r2 = r9.f;	 Catch:{ RuntimeException -> 0x00b1 }
        r3 = r9.c;	 Catch:{ RuntimeException -> 0x00b1 }
        r2.removeCallbacks(r3);	 Catch:{ RuntimeException -> 0x00b1 }
        if (r10 == 0) goto L_0x002c;
    L_0x000d:
        r2 = r10.getAction();	 Catch:{ RuntimeException -> 0x00b3 }
        r3 = z;	 Catch:{ RuntimeException -> 0x00b3 }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x00b3 }
        r2 = r2.equals(r3);	 Catch:{ RuntimeException -> 0x00b3 }
        if (r2 == 0) goto L_0x002c;
    L_0x001d:
        r2 = z;	 Catch:{ RuntimeException -> 0x00b3 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00b3 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ RuntimeException -> 0x00b3 }
        r9.stopSelf();	 Catch:{ RuntimeException -> 0x00b3 }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ RuntimeException -> 0x00b3 }
        if (r2 == 0) goto L_0x00b0;
    L_0x002c:
        if (r10 == 0) goto L_0x0038;
    L_0x002e:
        r2 = z;
        r3 = 11;
        r2 = r2[r3];
        r0 = r10.getLongExtra(r2, r0);
    L_0x0038:
        r2 = r9.f;	 Catch:{ RuntimeException -> 0x00b5 }
        r3 = r9.c;	 Catch:{ RuntimeException -> 0x00b5 }
        r2.postDelayed(r3, r0);	 Catch:{ RuntimeException -> 0x00b5 }
        r2 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00b5 }
        r2.<init>();	 Catch:{ RuntimeException -> 0x00b5 }
        r3 = z;	 Catch:{ RuntimeException -> 0x00b5 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x00b5 }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x00b5 }
        r0 = r2.append(r0);	 Catch:{ RuntimeException -> 0x00b5 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x00b5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x00b5 }
        r0 = b;	 Catch:{ RuntimeException -> 0x00b5 }
        if (r0 == 0) goto L_0x006f;
    L_0x005d:
        r0 = b;	 Catch:{ RuntimeException -> 0x00b5 }
        r0 = r0.getTime();	 Catch:{ RuntimeException -> 0x00b5 }
        r2 = 120000; // 0x1d4c0 float:1.68156E-40 double:5.9288E-319;
        r0 = r0 + r2;
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ RuntimeException -> 0x00b5 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x00b0;
    L_0x006f:
        r0 = r9.d;
        r1 = r0.a(r8);
        r0 = r9.d;
        r2 = 2;
        r0 = r0.a(r2);
        if (r1 != 0) goto L_0x00b7;
    L_0x007e:
        if (r0 == 0) goto L_0x0091;
    L_0x0080:
        r2 = r0.getTime();	 Catch:{ RuntimeException -> 0x00cc }
        r4 = 7200000; // 0x6ddd00 float:1.0089349E-38 double:3.5572727E-317;
        r2 = r2 + r4;
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ RuntimeException -> 0x00cc }
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x0091;
    L_0x0090:
        r0 = 0;
    L_0x0091:
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00ce }
        r1.<init>();	 Catch:{ RuntimeException -> 0x00ce }
        r2 = z;	 Catch:{ RuntimeException -> 0x00ce }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00ce }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x00ce }
        r1 = r1.append(r0);	 Catch:{ RuntimeException -> 0x00ce }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x00ce }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x00ce }
        if (r0 == 0) goto L_0x00b0;
    L_0x00ad:
        r9.a(r0);	 Catch:{ RuntimeException -> 0x00ce }
    L_0x00b0:
        return r8;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        if (r0 != 0) goto L_0x00bb;
    L_0x00b9:
        r0 = r1;
        goto L_0x007e;
    L_0x00bb:
        r2 = r1.getTime();
        r4 = r0.getTime();
        r6 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r4 = r4 - r6;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x007e;
    L_0x00ca:
        r0 = r1;
        goto L_0x007e;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationSharingService.onStartCommand(android.content.Intent, int, int):int");
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onDestroy() {
        try {
            Log.i(z[6]);
            this.f.removeCallbacks(this.c);
            this.d.a((LocationListener) this);
            if (this.e == null) {
                return;
            }
            if (this.e.isHeld()) {
                this.e.release();
                this.e = null;
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }
}
