package com.whatsapp;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.location.LocationServices;
import com.whatsapp.util.Log;
import java.util.HashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class di {
    private static final String[] z;
    private LocationManager a;
    private GoogleApiClient b;
    private HashMap c;
    private cw d;

    static {
        String[] strArr = new String[14];
        String str = "@u8";
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
                        i3 = 39;
                        break;
                    case at.g /*1*/:
                        i3 = 5;
                        break;
                    case at.i /*2*/:
                        i3 = 75;
                        break;
                    case at.o /*3*/:
                        i3 = 78;
                        break;
                    default:
                        i3 = 36;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "I`?9KUn";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Fk/<KNae>AUh\"=WNj%`edF\u000e\u001dwxC\u0002\u0000axI\u0004\resL\u0004\u0000";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "Ap8+@Kj(/PNj%>VHs\"*AU%/!\u0004Ij?nLFs.nGHd9=A\u0007i$-ESl$ \u0004W`9#MTv\"!J";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    str = "Ap8+@Kj(/PNj%>VHs\"*AU";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "Ap8+@Kj(/PNj%>VHs\"*AU%/!\u0004Ij?nLFs.nBNk.nHHf*:MHkk>AUh\"=WNj%";
                    obj = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Ap8+@Kj(/PNj%>VHs\"*AU";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "Kj(/PNj%";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Ap8+@Kj(/PNj%>VHs\"*AU%/!\u0004Ij?nLFs.nHHf*:MHkk>AUh\"=WNj%=";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "I`?9KUn";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "Fk/<KNae>AUh\"=WNj%`edF\u000e\u001dwxF\u0004\u000fvt@\u0014\u0002kdD\u001f\u0007ki";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "@u8";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "Fk/<KNae>AUh\"=WNj%`edF\u000e\u001dwxC\u0002\u0000axI\u0004\resL\u0004\u0000";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Fk/<KNae>AUh\"=WNj%`edF\u000e\u001dwxF\u0004\u000fvt@\u0014\u0002kdD\u001f\u0007ki";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static GoogleApiClient b(di diVar) {
        return diVar.b;
    }

    static HashMap a(di diVar) {
        return diVar.c;
    }

    public di(Context context) {
        if (VERSION.SDK_INT >= 9) {
            try {
                if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
                    this.d = new cw(this);
                    this.c = new HashMap();
                    this.b = new Builder(context).addApi(LocationServices.API).addConnectionCallbacks(this.d).addOnConnectionFailedListener(this.d).build();
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        this.a = (LocationManager) context.getSystemService(z[8]);
    }

    @Nullable
    public Location a(int i) {
        try {
            if (App.u(App.z())) {
                if (this.b != null) {
                    try {
                        if (this.b.isConnected()) {
                            return LocationServices.FusedLocationApi.getLastLocation(this.b);
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
                if (i == 1) {
                    try {
                        if (App.p.o(z[13]) == 0) {
                            return this.a.getLastKnownLocation(z[12]);
                        }
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                }
                try {
                    if (App.p.o(z[11]) == 0) {
                        return this.a.getLastKnownLocation(z[10]);
                    }
                } catch (RuntimeException e22) {
                    throw e22;
                }
            }
            Log.w(z[9]);
            return null;
        } catch (RuntimeException e222) {
            throw e222;
        } catch (RuntimeException e2222) {
            throw e2222;
        }
    }

    public void a(LocationListener locationListener) {
        if (this.b != null) {
            ad1 com_whatsapp_ad1 = (ad1) this.c.remove(locationListener);
            if (com_whatsapp_ad1 != null) {
                try {
                    if (this.b.isConnected()) {
                        LocationServices.FusedLocationApi.removeLocationUpdates(this.b, com_whatsapp_ad1);
                    }
                    try {
                        if (this.c.isEmpty()) {
                            this.b.disconnect();
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
            try {
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (RuntimeException e22) {
                throw e22;
            } catch (RuntimeException e222) {
                throw e222;
            }
        }
        if (App.u(App.z())) {
            this.a.removeUpdates(locationListener);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r9, long r10, float r12, android.location.LocationListener r13) {
        /*
        r8 = this;
        r5 = 1;
        r0 = 0;
        r7 = com.whatsapp.DialogToastActivity.f;
        r1 = r8.b;	 Catch:{ RuntimeException -> 0x00aa }
        if (r1 == 0) goto L_0x0059;
    L_0x0008:
        r1 = r8.c;	 Catch:{ RuntimeException -> 0x00aa }
        r1 = r1.isEmpty();	 Catch:{ RuntimeException -> 0x00aa }
        if (r1 == 0) goto L_0x0015;
    L_0x0010:
        r1 = r8.b;	 Catch:{ RuntimeException -> 0x00ac }
        r1.connect();	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0015:
        r1 = new com.whatsapp.ad1;	 Catch:{ RuntimeException -> 0x00ae }
        r2 = r9 & 1;
        if (r2 == 0) goto L_0x00b0;
    L_0x001b:
        r2 = r10;
        r4 = r12;
        r6 = r13;
        r1.<init>(r2, r4, r5, r6);
        r0 = r8.c;
        r0.put(r13, r1);
        r0 = r8.b;
        r0 = r0.isConnected();
        if (r0 == 0) goto L_0x0057;
    L_0x002e:
        r2 = com.google.android.gms.location.LocationRequest.create();
        r0 = com.whatsapp.ad1.a(r1);	 Catch:{ RuntimeException -> 0x00b3 }
        if (r0 == 0) goto L_0x00b5;
    L_0x0038:
        r0 = 100;
    L_0x003a:
        r2.setPriority(r0);
        r4 = com.whatsapp.ad1.b(r1);
        r2.setInterval(r4);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2.setFastestInterval(r4);
        r0 = com.whatsapp.ad1.c(r1);
        r2.setSmallestDisplacement(r0);
        r0 = com.google.android.gms.location.LocationServices.FusedLocationApi;
        r3 = r8.b;
        r0.requestLocationUpdates(r3, r2, r1);
    L_0x0057:
        if (r7 == 0) goto L_0x00a9;
    L_0x0059:
        r0 = r9 & 1;
        if (r0 == 0) goto L_0x0081;
    L_0x005d:
        r0 = com.whatsapp.App.p;	 Catch:{ RuntimeException -> 0x00b8 }
        r1 = z;	 Catch:{ RuntimeException -> 0x00b8 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x00b8 }
        r0 = r0.o(r1);	 Catch:{ RuntimeException -> 0x00b8 }
        if (r0 != 0) goto L_0x0079;
    L_0x006a:
        r0 = r8.a;	 Catch:{ RuntimeException -> 0x00b8 }
        r1 = z;	 Catch:{ RuntimeException -> 0x00b8 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x00b8 }
        r2 = r10;
        r4 = r12;
        r5 = r13;
        r0.requestLocationUpdates(r1, r2, r4, r5);	 Catch:{ RuntimeException -> 0x00b8 }
        if (r7 == 0) goto L_0x0081;
    L_0x0079:
        r0 = z;	 Catch:{ RuntimeException -> 0x00ba }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x00ba }
        com.whatsapp.util.Log.w(r0);	 Catch:{ RuntimeException -> 0x00ba }
    L_0x0081:
        r0 = r9 & 2;
        if (r0 == 0) goto L_0x00a9;
    L_0x0085:
        r0 = com.whatsapp.App.p;	 Catch:{ RuntimeException -> 0x00c6 }
        r1 = z;	 Catch:{ RuntimeException -> 0x00c6 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x00c6 }
        r0 = r0.o(r1);	 Catch:{ RuntimeException -> 0x00c6 }
        if (r0 != 0) goto L_0x00a1;
    L_0x0092:
        r0 = r8.a;	 Catch:{ RuntimeException -> 0x00c6 }
        r1 = z;	 Catch:{ RuntimeException -> 0x00c6 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x00c6 }
        r2 = r10;
        r4 = r12;
        r5 = r13;
        r0.requestLocationUpdates(r1, r2, r4, r5);	 Catch:{ RuntimeException -> 0x00c6 }
        if (r7 == 0) goto L_0x00a9;
    L_0x00a1:
        r0 = z;	 Catch:{ RuntimeException -> 0x00c8 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x00c8 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ RuntimeException -> 0x00c8 }
    L_0x00a9:
        return;
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r5 = r0;
        goto L_0x001b;
    L_0x00b3:
        r0 = move-exception;
        throw r0;
    L_0x00b5:
        r0 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        goto L_0x003a;
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0081;
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00c8 }
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x00a9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.di.a(int, long, float, android.location.LocationListener):void");
    }

    public void a(long j, float f, LocationListener locationListener) {
        a(3, j, f, locationListener);
    }
}
