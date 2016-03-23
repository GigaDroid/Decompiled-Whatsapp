package com.whatsapp.gdrive;

import android.annotation.TargetApi;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.whatsapp.App;
import com.whatsapp.a47;
import com.whatsapp.a59;
import com.whatsapp.arj;
import com.whatsapp.auv;
import com.whatsapp.azx;
import com.whatsapp.dg;
import com.whatsapp.fieldstats.aq;
import com.whatsapp.fieldstats.b9;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import com.whatsapp.vr;
import com.whatsapp.wallpaper.k;
import de.greenrobot.event.h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class GoogleDriveService extends IntentService {
    private static final AtomicBoolean C;
    private static boolean E;
    private static boolean F;
    private static boolean G;
    private static final ConditionVariable I;
    private static final String J;
    private static boolean K;
    private static final File[] Q;
    private static int R;
    private static boolean S;
    private static final d9 V;
    private static final Object W;
    private static int X;
    private static boolean aa;
    private static final dc ab;
    private static boolean ac;
    private static final ConditionVariable ad;
    private static final ConditionVariable af;
    private static boolean ag;
    private static boolean ah;
    private static boolean ai;
    private static SharedPreferences am;
    private static final ConditionVariable an;
    private static final String[] bb;
    public static boolean c;
    private static final AtomicBoolean f;
    private static final AtomicBoolean l;
    private static final ConditionVariable m;
    private static final Object p;
    private static final ConditionVariable s;
    private static int u;
    static final bs v;
    private static final Set w;
    private static final ConditionVariable x;
    private cy A;
    @Nullable
    private List B;
    private final dg D;
    private CountDownLatch H;
    private bc L;
    private final AtomicLong M;
    private final bs N;
    private final AtomicInteger O;
    private b9 P;
    private WifiLock T;
    private final AtomicBoolean U;
    private final AtomicLong Y;
    private List Z;
    private boolean a;
    private final AtomicLong ae;
    private String aj;
    private final bs ak;
    private b6 al;
    private long b;
    private aq d;
    private long e;
    @Nullable
    private fs g;
    @Nullable
    private fs h;
    private final bs i;
    @Nullable
    private List j;
    private final AtomicLong k;
    private long n;
    private final d_ o;
    private final AtomicLong q;
    private long r;
    private Intent t;
    private String y;
    private String z;

    private boolean a(@NonNull List list, @NonNull AtomicReference atomicReference) {
        try {
            if (r()) {
                Throwable th = (eo) atomicReference.get();
                if (th != null) {
                    try {
                        Log.a(bb[194], th);
                        if (th instanceof ei) {
                            throw ((ei) th);
                        }
                        try {
                            if (th instanceof ea) {
                                throw ((ea) th);
                            }
                            try {
                                if (th instanceof e9) {
                                    throw ((e9) th);
                                }
                                try {
                                    if (th instanceof ew) {
                                        throw ((ew) th);
                                    }
                                    try {
                                        if (th instanceof et) {
                                            throw ((et) th);
                                        }
                                        try {
                                            if (th instanceof ez) {
                                                throw ((ez) th);
                                            }
                                        } catch (NullPointerException e) {
                                            throw e;
                                        }
                                    } catch (NullPointerException e2) {
                                        throw e2;
                                    }
                                } catch (NullPointerException e22) {
                                    throw e22;
                                }
                            } catch (NullPointerException e222) {
                                throw e222;
                            }
                        } catch (NullPointerException e2222) {
                            throw e2222;
                        }
                    } catch (NullPointerException e22222) {
                        throw e22222;
                    }
                }
                try {
                    if (this.n > 0) {
                        if ((((double) this.Y.get()) * 100.0d) / ((double) this.n) > 1.0d) {
                            Log.i(bb[193] + ((((double) this.Y.get()) * 100.0d) / ((double) this.n)) + bb[189]);
                            return true;
                        }
                    }
                    try {
                        if (list.size() > 0) {
                            if ((((double) this.O.get()) * 100.0d) / ((double) list.size()) > 1.0d) {
                                Log.i(bb[190] + ((((double) this.O.get()) * 100.0d) / ((double) list.size())) + bb[191]);
                                return true;
                            }
                        }
                        return false;
                    } catch (NullPointerException e222222) {
                        throw e222222;
                    } catch (NullPointerException e2222222) {
                        throw e2222222;
                    }
                } catch (NullPointerException e22222222) {
                    throw e22222222;
                } catch (NullPointerException e222222222) {
                    throw e222222222;
                }
            }
            Log.i(bb[192]);
            return true;
        } catch (NullPointerException e2222222222) {
            throw e2222222222;
        }
    }

    static String f(String str) {
        return i(str);
    }

    private static SharedPreferences S() {
        try {
            if (am == null) {
                am = App.z().getSharedPreferences(bb[449], 0);
            }
            return am;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void l() {
        /*
        r0 = c;
        r1 = j();	 Catch:{ NumberFormatException -> 0x0047 }
        X = r1;	 Catch:{ NumberFormatException -> 0x0047 }
        r1 = av();	 Catch:{ NumberFormatException -> 0x0047 }
        u = r1;	 Catch:{ NumberFormatException -> 0x0047 }
        r1 = X;	 Catch:{ NumberFormatException -> 0x0047 }
        switch(r1) {
            case 0: goto L_0x0025;
            case 1: goto L_0x002d;
            default: goto L_0x0013;
        };	 Catch:{ NumberFormatException -> 0x0047 }
    L_0x0013:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0047 }
        r2 = 358; // 0x166 float:5.02E-43 double:1.77E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0047 }
    L_0x0019:
        r1 = u;	 Catch:{ NumberFormatException -> 0x0047 }
        switch(r1) {
            case 0: goto L_0x0036;
            case 1: goto L_0x003e;
            default: goto L_0x001e;
        };	 Catch:{ NumberFormatException -> 0x0047 }
    L_0x001e:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0047 }
        r1 = 361; // 0x169 float:5.06E-43 double:1.784E-321;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0047 }
    L_0x0024:
        return;
    L_0x0025:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0047 }
        r2 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0047 }
        if (r0 == 0) goto L_0x0019;
    L_0x002d:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0047 }
        r2 = 357; // 0x165 float:5.0E-43 double:1.764E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0047 }
        if (r0 == 0) goto L_0x0019;
    L_0x0035:
        goto L_0x0013;
    L_0x0036:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0047 }
        r2 = 362; // 0x16a float:5.07E-43 double:1.79E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0047 }
        if (r0 == 0) goto L_0x0024;
    L_0x003e:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0047 }
        r2 = 359; // 0x167 float:5.03E-43 double:1.774E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0047 }
        if (r0 == 0) goto L_0x0024;
    L_0x0046:
        goto L_0x001e;
    L_0x0047:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.l():void");
    }

    private static void b() {
        Intent intent = new Intent(App.z(), GoogleDriveService.class);
        intent.setAction(bb[21]);
        App.z().startService(intent);
    }

    private void p() {
        ConditionVariable conditionVariable = new ConditionVariable(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        dw dwVar = new dw(this, atomicBoolean, conditionVariable);
        try {
            if (!((a47) h.b().b(a47.class)).a) {
                Log.i(bb[318]);
                MessageService.a(App.z(), false, false, false, null, null);
                Log.i(bb[320]);
                if (!conditionVariable.block(86400000)) {
                    Log.i(bb[326]);
                    throw new e2(bb[324]);
                } else if (!atomicBoolean.get()) {
                    Log.e(bb[319]);
                    throw new e2(bb[323]);
                } else if (App.aI()) {
                    Log.e(bb[322]);
                    throw new e2(bb[321]);
                }
            }
            h.b().c(dwVar);
            Log.i(bb[325]);
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (NullPointerException e22) {
            throw e22;
        } catch (NullPointerException e222) {
            throw e222;
        } catch (Throwable th) {
            h.b().c(dwVar);
        }
    }

    public static boolean c(String str) {
        Editor edit = S().edit();
        try {
            edit.putString(bb[404], str);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[403]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private String c(@NonNull bs bsVar) {
        String str = null;
        try {
            if (this.g != null) {
                str = this.g.g();
            } else {
                fs b = b(bsVar);
                if (b == null) {
                    try {
                        Log.e(bb[300]);
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                try {
                    this.g = a(this.L, b, bsVar);
                    if (this.g == null) {
                        Log.i(bb[302]);
                        this.g = c(bb[301], bsVar);
                    }
                    try {
                        if (this.g != null) {
                            str = this.g.g();
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                } catch (NullPointerException e22) {
                    throw e22;
                }
            }
            return str;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    static boolean a(int i) {
        try {
            auv.b();
            switch (i) {
                case v.m /*0*/:
                case at.g /*1*/:
                    if (!c) {
                        X = i;
                        al();
                        Editor edit = S().edit();
                        try {
                            edit.putString(bb[178], String.valueOf(i));
                            if (edit.commit()) {
                                return true;
                            }
                            Log.w(bb[176]);
                            return false;
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    }
                    break;
            }
            Log.e(bb[177] + i);
            return false;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    static boolean c(@Nullable String str, long j) {
        if (str == null) {
            try {
                Log.e(bb[arj.Theme_buttonStyleSmall]);
                return false;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        Editor edit = S().edit();
        try {
            edit.putLong(bb[99] + str, j);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[100]);
            return false;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static boolean ak() {
        try {
            return ag() == 1;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static void P() {
        l();
    }

    public long T() {
        return this.k.get();
    }

    public static boolean v() {
        try {
            return ag() == 2;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static void W() {
        e(1);
        l();
        bq.a(new ab());
    }

    static void am() {
        K();
    }

    private boolean O() {
        try {
            if (ay()) {
                return true;
            }
            String a = a(this.N);
            if (a == null) {
                return false;
            }
            try {
                Boolean bool = (Boolean) by.a(this.N, new r(this, a), bb[570]);
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
                if (!bool.booleanValue()) {
                    return false;
                }
                b(this.N).a(bb[569], String.valueOf(true));
                return true;
            } catch (Throwable e) {
                throw new ew(e);
            }
        } catch (ee e2) {
            throw e2;
        }
    }

    @TargetApi(9)
    private static void b(long j) {
        Editor edit = S().edit();
        edit.putLong(bb[356], j);
        edit.apply();
    }

    public static boolean X() {
        try {
            if (App.am == 3 && !F) {
                return false;
            }
            try {
                if (VERSION.SDK_INT < 9 || !fn.a(App.j, App.am)) {
                    return false;
                }
                try {
                    int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(App.z());
                    if (isGooglePlayServicesAvailable == 0) {
                        return true;
                    }
                    try {
                        App.z().getPackageManager().getPackageInfo(bb[309], 0);
                        Log.i(bb[313] + fn.c(isGooglePlayServicesAvailable));
                        return true;
                    } catch (Throwable e) {
                        Log.i(bb[314] + fn.c(isGooglePlayServicesAvailable));
                        Log.a(bb[311], e);
                        return false;
                    }
                } catch (Throwable e2) {
                    Log.e(bb[310]);
                    Log.b(bb[312], e2);
                    return false;
                }
            } catch (NullPointerException e3) {
                throw e3;
            }
        } catch (NullPointerException e32) {
            throw e32;
        } catch (NullPointerException e322) {
            throw e322;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e() {
        /*
        r12 = 30;
        r10 = 2;
        r14 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = 0;
        r5 = 1;
        r6 = c;
        r0 = com.whatsapp.App.j;	 Catch:{ NumberFormatException -> 0x001e }
        r1 = com.whatsapp.App.am;	 Catch:{ NumberFormatException -> 0x001e }
        r0 = com.whatsapp.gdrive.fn.b(r0, r1);	 Catch:{ NumberFormatException -> 0x001e }
        if (r0 != 0) goto L_0x0020;
    L_0x0014:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x001e }
        r1 = 438; // 0x1b6 float:6.14E-43 double:2.164E-321;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x001e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x001e }
    L_0x001d:
        return r4;
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r7 = Y();
        r0 = g();
        r2 = d(r0);
        r0 = java.lang.System.currentTimeMillis();
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x005a;
    L_0x0034:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r8 = 444; // 0x1bc float:6.22E-43 double:2.194E-321;
        r1 = r1[r8];
        r0 = r0.append(r1);
        r0 = r0.append(r2);
        r1 = bb;
        r2 = 435; // 0x1b3 float:6.1E-43 double:2.15E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r2 = -1;
    L_0x005a:
        switch(r7) {
            case 0: goto L_0x0084;
            case 1: goto L_0x009a;
            case 2: goto L_0x009c;
            case 3: goto L_0x00b5;
            case 4: goto L_0x008f;
            default: goto L_0x005d;
        };
    L_0x005d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 432; // 0x1b0 float:6.05E-43 double:2.134E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r7);
        r1 = bb;
        r2 = 433; // 0x1b1 float:6.07E-43 double:2.14E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x0081:
        r0 = r4;
    L_0x0082:
        r4 = r0;
        goto L_0x001d;
    L_0x0084:
        r0 = bb;
        r1 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        if (r6 == 0) goto L_0x0081;
    L_0x008f:
        r0 = bb;
        r1 = 437; // 0x1b5 float:6.12E-43 double:2.16E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        if (r6 == 0) goto L_0x0081;
    L_0x009a:
        if (r6 == 0) goto L_0x01bc;
    L_0x009c:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0149 }
        r0 = r0 - r2;
        r8 = 518400000; // 0x1ee62800 float:2.4368741E-20 double:2.56123631E-315;
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 < 0) goto L_0x00aa;
    L_0x00a8:
        if (r6 == 0) goto L_0x01bc;
    L_0x00aa:
        r0 = bb;
        r1 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        if (r6 == 0) goto L_0x0081;
    L_0x00b5:
        r0 = java.util.Calendar.getInstance();
        r0.setTimeInMillis(r2);
        r1 = 5;
        r1 = r0.get(r1);
        r8 = r0.get(r10);
        r0 = r0.get(r5);
        if (r1 == r5) goto L_0x00cd;
    L_0x00cb:
        if (r1 != r10) goto L_0x01bf;
    L_0x00cd:
        if (r8 != r5) goto L_0x01bf;
    L_0x00cf:
        r8 = 2016; // 0x7e0 float:2.825E-42 double:9.96E-321;
        if (r0 != r8) goto L_0x01bf;
    L_0x00d3:
        r0 = com.whatsapp.App.ay;	 Catch:{ NumberFormatException -> 0x014b }
        if (r0 == 0) goto L_0x00eb;
    L_0x00d7:
        r0 = com.whatsapp.App.ay;	 Catch:{ NumberFormatException -> 0x014b }
        r0 = r0.jabber_id;	 Catch:{ NumberFormatException -> 0x014b }
        if (r0 == 0) goto L_0x00eb;
    L_0x00dd:
        r0 = com.whatsapp.App.ay;	 Catch:{ NumberFormatException -> 0x014d }
        r0 = r0.jabber_id;	 Catch:{ NumberFormatException -> 0x014d }
        r8 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x014d }
        r10 = 30;
        r8 = r8 % r10;
        r0 = (int) r8;	 Catch:{ NumberFormatException -> 0x014d }
        if (r6 == 0) goto L_0x00ff;
    L_0x00eb:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x014d }
        r8 = 439; // 0x1b7 float:6.15E-43 double:2.17E-321;
        r0 = r0[r8];	 Catch:{ NumberFormatException -> 0x014d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x014d }
        r0 = new java.util.Random;	 Catch:{ NumberFormatException -> 0x014d }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x014d }
        r8 = 30;
        r0 = r0.nextInt(r8);	 Catch:{ NumberFormatException -> 0x014d }
    L_0x00ff:
        r8 = S();
        r9 = bb;
        r10 = 436; // 0x1b4 float:6.11E-43 double:2.154E-321;
        r9 = r9[r10];
        r10 = 2592000000; // 0x9a7ec800 float:-5.2687528E-23 double:1.280618154E-314;
        r10 = r10 + r2;
        r8 = r8.getLong(r9, r10);
        r10 = (long) r0;
        r10 = r10 * r14;
        r8 = r8 + r10;
        r10 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0161 }
        r10.<init>();	 Catch:{ NumberFormatException -> 0x0161 }
        r11 = bb;	 Catch:{ NumberFormatException -> 0x0161 }
        r12 = 434; // 0x1b2 float:6.08E-43 double:2.144E-321;
        r11 = r11[r12];	 Catch:{ NumberFormatException -> 0x0161 }
        r10 = r10.append(r11);	 Catch:{ NumberFormatException -> 0x0161 }
        r1 = r10.append(r1);	 Catch:{ NumberFormatException -> 0x0161 }
        r10 = bb;	 Catch:{ NumberFormatException -> 0x0161 }
        r11 = 447; // 0x1bf float:6.26E-43 double:2.21E-321;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x0161 }
        r1 = r1.append(r10);	 Catch:{ NumberFormatException -> 0x0161 }
        r1 = r1.append(r8);	 Catch:{ NumberFormatException -> 0x0161 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x0161 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0161 }
        r10 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0161 }
        r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r1 < 0) goto L_0x0163;
    L_0x0146:
        r4 = r5;
        goto L_0x001d;
    L_0x0149:
        r0 = move-exception;
        throw r0;
    L_0x014b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x014d }
    L_0x014d:
        r0 = move-exception;
        r8 = bb;
        r9 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        r8 = r8[r9];
        com.whatsapp.util.Log.b(r8, r0);
        r0 = new java.util.Random;
        r0.<init>();
        r0 = r0.nextInt(r12);
        goto L_0x00ff;
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r10 = bb;
        r11 = 445; // 0x1bd float:6.24E-43 double:2.2E-321;
        r10 = r10[r11];
        r1 = r1.append(r10);
        r1 = r1.append(r8);
        r8 = bb;
        r9 = 440; // 0x1b8 float:6.17E-43 double:2.174E-321;
        r8 = r8[r9];
        r1 = r1.append(r8);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r0 = (long) r0;
        r0 = r0 * r14;
        r0 = r0 + r2;
    L_0x018a:
        r2 = java.lang.System.currentTimeMillis();
        r2 = r2 - r0;
        r8 = 2505600000; // 0x95586c00 float:-4.370605E-26 double:1.237930882E-314;
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 < 0) goto L_0x019a;
    L_0x0198:
        if (r6 == 0) goto L_0x01bc;
    L_0x019a:
        r2 = java.util.Locale.ENGLISH;
        r3 = bb;
        r8 = 446; // 0x1be float:6.25E-43 double:2.204E-321;
        r3 = r3[r8];
        r5 = new java.lang.Object[r5];
        r8 = java.lang.System.currentTimeMillis();
        r0 = r8 - r0;
        r0 = r0 / r14;
        r0 = java.lang.Long.valueOf(r0);
        r5[r4] = r0;
        r0 = java.lang.String.format(r2, r3, r5);
        com.whatsapp.util.Log.i(r0);
        if (r6 == 0) goto L_0x0081;
    L_0x01ba:
        goto L_0x005d;
    L_0x01bc:
        r0 = r5;
        goto L_0x0082;
    L_0x01bf:
        r0 = r2;
        goto L_0x018a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.e():boolean");
    }

    private static boolean D() {
        return C.get();
    }

    void b(String str) {
        try {
            if (this.L != null) {
                Log.e(bb[95]);
            }
            this.aj = str;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void as() {
        try {
            if (this.T == null) {
                return;
            }
            if (this.T.isHeld()) {
                this.T.release();
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static boolean b(int i) {
        return f(i);
    }

    static boolean a(GoogleDriveService googleDriveService, boolean z) {
        googleDriveService.a = z;
        return z;
    }

    private static String M() {
        return ah();
    }

    private static boolean c(long j) {
        Editor edit = S().edit();
        try {
            edit.putLong(bb[315], j);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[316]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public IBinder onBind(Intent intent) {
        return this.D;
    }

    static bs c(GoogleDriveService googleDriveService) {
        return googleDriveService.i;
    }

    static long a(@NonNull String str) {
        return S().getLong(bb[98] + str, -1);
    }

    static void at() {
        al();
    }

    static {
        String[] strArr = new String[654];
        String str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/9<k\u0005-";
        boolean z = true;
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
                        i3 = 2;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 78;
                        break;
                    case at.o /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = 116;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "k1:k\u0006d>-k+e;<g\u0002g\u0000,o\u0017i*>Q\u0012p:?{\u0011l<7";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "8\u007f";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ch\u001dn:=.\u0003c6:g\u001ae\u007f(a\u0006\">\"bTd6\"k\u0007\"+!.\u0016g\u007f<k\u0007v0<k\u0010,";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ch\u001dn:=.\u0011l.;k\u0001k1).\u0010m( b\u001bc;n.";
                    z = true;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ch\u001dn:=.\u0003c6:g\u001ae\u007f(a\u0006\"-+}\u0000m-+.\u0000m\u007f(g\u001ak,&4T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ch\u001dn:=!\u0012c6\"k\u0010/9'b\u0011qp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "e;<g\u0002g\u007f(g\u0018g\u007f#o\u0004\"6=.\u001aw3\" ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ch\u001dn:=.\u0013f-'x\u0011]9'b\u0011]2/~Tk,n`\u001bv\u007f'`\u001dv6/b\u001dx:*\"Tw1+v\u0004g<:k\u0010\"=;zTl0:.\u0012c+/bZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\"w";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ch\u001dn:=!\u001aw2ch\u001dn:=#\u0000mr,kYf09`\u0018m>*k\u0010-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "--+z\u0006{6 iYl09";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0012k3+}Yv0cl\u0011/;!y\u001an0/j\u0011f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\"9/g\u0018g;g";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ch\u001dn:=.\u0000j6=.\u0007v>:kTq7!{\u0018f\u007f&o\u0002g\u007f k\u0002g-nf\u0015r/+`\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ch\u001dn:=.\u0012c6\"k\u0010\"+!.\u0013g+nb\u001dq+na\u0012\"9'b\u0011q\u007f:aT`:n|\u0011q+!|\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "q:-a\u001af><w+`>=k+d0\"j\u0011p\u0000'j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0007g<!`\u0010c-7#\u0016c,+#\u0012m3*k\u0006-8+zYd6\"k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0007g<!`\u0010c-7#\u0016c,+#\u0012m3*k\u0006-6*#\u0011z6=z\u0007/=;zYd0\"j\u0011pr'}Yo6=}\u001dl8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "e;<g\u0002g\u0000+|\u0006m-\u0011m\u001bf:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "c<:g\u001bl\u0000<k\u0007v0<k+o:*g\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0004p6#o\u0006{r,o\u0007gr(a\u0018f:<.\u0019R-'c\u0015p&\fo\u0007g\u0019!b\u0010g-ng\u0007\"1!zTl*\"bTc1*.\u0015\"1+yT`>=k2m3*k\u0006\"6=.\u0016g6 iTc,=g\u0013l:*\"Tv7'}Tk,n{\u001ag'>k\u0017v:*.\\v7!{\u0013j\u007f a\u0000\"9/z\u0015nv`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "c<:g\u001bl\u0000,o\u0017i*>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "m1\"w+k9\u0011~\u0011l;'`\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "e;<g\u0002g\u0000\"o\u0007v\u0000={\u0017a:=}\u0012w3\u0011l\u0015a4;~+v6#k\u0007v>#~N";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\"=;zTc<-a\u0001l+\u0000o\u0019g\u007f/}\u0007m<'o\u0000g;ng\u0007\"1;b\u0018.\u007f'i\u001am-'`\u0013,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/+'c\u0011q+/c\u0004\"* o\u0016n:nz\u001b\"<!c\u0019k+nl\u0015a4;~Tv6#k\u0007v>#~Tv0n}\u001cc-+jTr-+h\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/+'c\u0011q+/c\u0004\"+&g\u0007\"6=.\u0003g6<jX\"3/}\u0000\",;m\u0017g,=h\u0001n\u007f,o\u0017i*>.\u0000k2+}\u0000c2>.\u001dq\u007f=k\u0000\"+!.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ca\u0002g-9|\u001dv:cb\u001ba>\"#\u0012k3+}Tw1/l\u0018g\u007f:aTa0#c\u001dv\u007f!x\u0011p(<g\u0000g\u007f\"a\u0017c3nh\u001dn:=.\u0000m\u007f=f\u0015p:*.\u0004p:(}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "e;<g\u0002g\u0000<k\u0007v0<k+m)+|\u0003p6:k+n0-o\u0018]9'b\u0011q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "e;<g\u0002g\u0000<k\u0007v0<k+m)+|\u0003p6:k+n0-o\u0018]9'b\u0011q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "e;<g\u0002g\u0000<k\u0007v0<k+q+/|\u0000]+'c\u0011q+/c\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/6 m\u0018w;+#\u0002k;+a\u0007-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "e;<g\u0002g\u0000'`\u0017n**k+t6*k\u001bq\u0000'`+`>-e\u0001r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\"* o\u0016n:nz\u001b\"<!c\u0019k+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "w1#a\u0001l++j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "w1#a\u0001l++j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=k\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "e;<g\u0002g\u0000#k\u0010k>\u0011|\u0011q+!|\u0011]1+z\u0003m-%Q\u0007g+:g\u001ae";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0019g;'oYp:=z\u001bp:c`\u0011v(!|\u001f/,+z\u0000k1)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:c`\u0011v(!|\u001f->-z\u001dt:\u0011`\u0011v(!|\u001f-('h\u001d\">-z\u001dt:n`\u0011v(!|\u001f\"6 h\u001b\"6=.\u001aw3\"\"Tl0nm\u001bl1+m\u0000k0 ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:c`\u0011v(!|\u001f->-z\u001dt:\u0011`\u0011v(!|\u001f-('h\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:c`\u0011v(!|\u001f->-z\u001dt:\u0011`\u0011v(!|\u001f-<+b\u0018w3/|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:c`\u0011v(!|\u001f->-z\u001dt:\u0011`\u0011v(!|\u001f--!o\u0019k1)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:c`\u0011v(!|\u001f-2+}\u0007c8+#\u0006g,:a\u0006gp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:c`\u0011v(!|\u001f->-z\u001dt:\u0011`\u0011v(!|\u001f-('h\u001d-</~\u0000k)+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:c`\u0011v(!|\u001f->-z\u001dt:\u0011`\u0011v(!|\u001f-1!`\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:c`\u0011v(!|\u001f-2+j\u001dcr<k\u0007v0<k[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:c`\u0011v(!|\u001f-=/m\u001fw/a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=k\u0000/=/m\u001fw/ch\u0015k3+jYa0;`\u0000\"* o\u0016n:nz\u001b\"<!c\u0019k+nl\u0015a4;~Td>'b\u0011f\u007f-a\u0001l+nz\u001b\",&o\u0006g;n~\u0006g9=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "e;<g\u0002g\u0000={\u0017a:=}\u001dt:\u0011l\u0015a4;~+d>'b\u0011f\u0000-a\u0001l+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "e;<g\u0002g\u0000={\u0017a:=}\u001dt:\u0011l\u0015a4;~+d>'b\u0011f\u0000-a\u0001l+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "e;<g\u0002gr=k\u0006t6-k[q:-a\u001af><wY`>=kYd0\"j\u0011pr o\u0019gr(a\u0006/-+}\u0000m-+.\u001ek;ng\u0007\"1;b\u0018.\u007f(o\u0000c3nk\u0006p0< ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:a|\u001bv>:kYa*<|\u0011l+cl\u0015a4;~Yd6\"kYv0c~\u0006g,+|\u0002gr'z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = " \u007ffy\u001ck3+.\u0018m0%g\u001ae\u007f'`Te;<g\u0002g\u0000(g\u0018g\u0000#o\u0004\"w=g\u000egen";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:n`\u0001o=+|Tm9nh\u001dn:=4T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ny\u0011k-*.\u0007k+;o\u0000k0 \"Tl0nc\u0011q,/i\u0011\"=/m\u001fw/nh\u001dn:nh\u001bw1*.\u0012m-n~\u0015v7n,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = " \u007f'`Tr-'c\u0015p&nl\u0015q:nh\u001bn;+|T ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:nh\u001dn:n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\"6=.\u0007c2+.\u0015q\u007f<k\u0019m++.\u0012k3+\"Tl0n`\u0011g;nz\u001b\";!y\u001an0/j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:n~\u0006k2/|\r\"=/}\u0011\"9!b\u0010g-ng\u0010\"6=.\u001aw3\"\"Tc=!|\u0000k1).\u0006g,:a\u0006gq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\"6 .";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:nm\u0015l1!zTq+/|\u0000\"-+}\u0000m-+\"T`>-e\u0001r\u007f'`Tr-!i\u0006g,= ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:n{\u001ac=\"kTv0nh\u0011v<&.\u0018k,:.\u001bd\u007f(g\u0018g,ng\u001a\"/<g\u0019c-7.\u0016c,+.\u0012m3*k\u0006,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:cc\u0011q,/i\u0011q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:nh\u001bw1*.\u0016c<%{\u0004\"9'b\u00118\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ao\u0007//+|Yo>>#\u0019fjca\u0012/2=i\u0007v0<kYk,c`\u0001n3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:nh\u0015k3+jTv0n|\u0011q+!|\u0011\";/z\u0015`>=kZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>!\u0001l>,b\u0011/+!#\u0012g+-fYe;<g\u0002gr(g\u0018gr#o\u0004/9'b\u0011q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "r-'c\u0015p&nl\u0015q:nh\u001bn;+|Tf0+}Tl0:.\u0011z6=z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "e;<g\u0002g\u0000(g\u0018g\u0000#o\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>.\u001dl6:.\u0013f-'x\u0011]9'b\u0011]2/~Td>'b\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>.\u001dl6:.\u001ag(ni\u0010p68k+d6\"k+o>>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "e;<g\u0002g\u0000(g\u0018g\u0000#o\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "e;<g\u0002g\u0000(g\u0018g\u0000#o\u0004]6*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>!\u001aw2\u0011k\u001av-'k\u0007-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>!\u0004p6#o\u0006{r,o\u0007gr(a\u0018f:<#\u001dfr'}Yl*\"b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>!\u0002g-'h\r/8*|\u001dt:ch\u001dn:cc\u0015rr+v\u001dq+=#\u001blr=k\u0006t:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>.\u0006g>*g\u001ae\u007f)j\u0006k)+Q\u0012k3+Q\u0019c/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>!\u0007g<!`\u0010c-7#\u0016c,+#\u0012m3*k\u0006/6*#\u001dqr {\u0018n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>!\u0007w<-k\u0007qp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>!\u001dl<!c\u0004n::kY`>-e\u0001rr(a\u0001l;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>!\u0012g+-fYo>>#\u0012k3+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1'zYo>>!\u001amr)j\u0006k)+#\u0012k3+#\u0019c/ch\u001dn:ch\u001bw1*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c<%{\u0004/9<k\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "k1:k\u0006d>-k+e;<g\u0002g\u0000,o\u0017i*>Q\u0012p:?{\u0011l<7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "3k~6A7j\u007f<G4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "3k~6A7jx8B4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "3k~6A7j\u007f<G:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "3k~6A7j\u007f<G7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "3k~6A7j\u007f<G5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0015a<!{\u001avr o\u0019g\u007f/m\u0017m* zTl>#kTk,n`\u001bv\u007f {\u0018n\u007f/`\u0010\">n`\u0011u\u007f/m\u0017m* zTl>#kTk,nl\u0011k1).\u0015q,'i\u001ag;b.\u0000j6=.\u001dq\u007f;`\u0011z/+m\u0000g;n&\u0000j0;i\u001c\"1!zTd>:o\u0018+q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "e;<g\u0002g\u0000;}\u0011p\u0000'`\u001dv6/z\u0011f\u0000,o\u0017i*>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/*=k\u0006/6 g\u0000k>:k\u0010\"* o\u0016n:nz\u001b\"<!c\u0019k+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "e;<g\u0002g\u0000\"o\u0007v\u0000={\u0017a:=}\u0012w3\u0011l\u0015a4;~+t6*k\u001b],'t\u00118";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "e;<g\u0002g\u0000\"o\u0007v\u0000={\u0017a:=}\u0012w3\u0011l\u0015a4;~+t6*k\u001b],'t\u00118";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/)'j\u0011mr=g\u000eg\u007f;`\u0015`3+.\u0000m\u007f-a\u0019o6:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/)'j\u0011mr=g\u000eg\u007f/m\u0017m* zTl>#kTk,n`\u0001n3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "e;<g\u0002gr=k\u0006t6-k[r-'c\u0015p&cl\u0015q:ch\u001bn;+|Yl>#kYd0<#\u0006g,:a\u0006g\u007f$g\u0010\"6=.\u001aw3\"\"Td>:o\u0018\":<|\u001bpq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "e;<g\u0002g\u0000<k\u0007v0<k+l0:g\u0012k</z\u001dm1\u0011x\u001dq6,g\u0018k+7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "e;<g\u0002g\u0000/~\u0004p06Q\u0019g;'o+f09`\u0018m>*Q\u0007k%+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "e;<g\u0002g\u0000#k\u0010k>\u0011|\u0011q+!|\u0011]1+z\u0003m-%Q\u0007g+:g\u001ae";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "e;<g\u0002g\u0000/b\u0006g>*w+f09`\u0018m>*k\u0010]=7z\u0011q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "e;<g\u0002g\u0000<k\u0007v0<k+m)+|\u0003p6:k+n0-o\u0018]9'b\u0011q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "e;<g\u0002g\u0000<k\u0007v0<k+q+/|\u0000]+'c\u0011q+/c\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "e;<g\u0002gr=k\u0006t6-k[a3+o\u001aw/co\u0012v:<#\u0019g;'oYp:=z\u001bp:nh\u0015k3+jTv0nm\u001bo2'zZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "\"2+j\u001dcr<k\u0007v0<kYp* `\u001dl8t.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "\"1+z\u0003m-%Q\u0015t>'b\u0015`3+Q\u0012m-\u0011c\u0011f6/Q\u0006g,:a\u0006gen";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "e;<g\u0002gr=k\u0006t6-k[v-'i\u0013g-c`\u001bv7'`\u0013\"6=#\u0016c<%{\u0004//+`\u0010k1)4T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "\"1+z\u0003m-%Q\u0015t>'b\u0015`3+Q\u0012m-\u0011l\u0015a4;~N\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "\"6=#\u0016c<%{\u0004/-;`\u001ak1)4T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = "e;<g\u0002gr=k\u0006t6-k[v-'i\u0013g-c~\u0011l;'`\u0013/2+j\u001dcr<k\u0007v0<k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "\"=/z\u0000g-7Q\u0015t>'b\u0015`3+Q\u0012m-\u0011l\u0015a4;~N\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "e;<g\u0002gr=k\u0006t6-k[v-'i\u0013g-c`\u001bv7'`\u0013-1!z\u001ck1)#\u0004g1*g\u001ae";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "\"=/z\u0000g-7Q\u0015t>'b\u0015`3+Q\u0012m-\u0011c\u0011f6/Q\u0006g,:a\u0006gen";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "\",*m\u0015p;\u0011o\u0002c6\"o\u0016n:t.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = "e;<g\u0002gr=k\u0006t6-k[v-'i\u0013g-c~\u0011l;'`\u0013/=/m\u001fw/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "e;<g\u0002gr=k\u0006t6-k[v-'i\u0013g-c`\u001bv7'`\u0013\"2+j\u001dcr<k\u0007v0<kYr: j\u001dl8t.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "\",*m\u0015p;\u0011o\u0002c6\"o\u0016n:t.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "e;<g\u0002g\u0000=z\u0015v:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0013f-'x\u0011/9'b\u0011/2/~To\u0018*|\u001dt:\bg\u0018g\u0012/~Tk,n`\u001bv\u007f {\u0018n\u007f/`\u0010\">n`\u0011u\u007f)j\u0006k)+H\u001dn:\u0003o\u0004\"6=.\u0016g6 iTc,=g\u0013l:*\"Tv7'}Tk,n{\u001ag'>k\u0017v:*.\\v7!{\u0013j\u007f a\u0000\"9/z\u0015nv`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "e;<g\u0002g\u0000,o\u0017i*>Q\u0007v><z+v6#k\u0007v>#~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/,:o\u0006vr:g\u0019g,:o\u0019r\u007f;`\u0015`3+.\u0000m\u007f-a\u0019o6:.\u0016c<%{\u0004\",:o\u0006v\u007f:g\u0019g,:o\u0019r\u007f:aTq7/|\u0011f\u007f>|\u0011d,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "e;<g\u0002gr=k\u0006t6-k[o><eY`>-e\u0001rr/}Ya0#~\u0018g++!\u0012c6\"k\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "e;<g\u0002gr=k\u0006t6-k[o><eY`>-e\u0001rr/}Ya0#~\u0018g++!\u0007w<-k\u0007q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "e;<g\u0002gr=k\u0006t6-k[o><eY`>-e\u0001rr/}Ya0#~\u0018g++!\u0001l:6~\u0011a++j[r-'c\u0015p&cl\u0015q:ch\u001bn;+|Yk,c`\u0001n3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "e;<g\u0002gr=k\u0006t6-k[o><eY`>-e\u0001rr/}Ya0#~\u0018g++";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"=/m\u001fw/nj\u001dp\u007ff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "\"9'b\u0011q\u007f(a\u0001l;nz\u001b\"=+.\u0010g3+z\u0011f\u007f'`Tv7'}Tq<<{\u0016.\u007f&o\u0006f\u007f\"g\u0019k+n|\u0011c<&k\u0010,\u007f\u0000aTo0<kTf:\"k\u0000k0 }Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016-/<g\u0019c-7#\u0016c,+#\u0012m3*k\u0006qr/|\u0011/1;b\u0018-9+z\u0017j6 iYv7+#\u0018k,:#\u0015e>'`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "e;<g\u0002gb=k\u0006t6-k[q<<{\u0016-/<g\u0019c-7#\u0015l;c}\u0011a0 j\u0015p&cl\u0015q:ch\u001bn;+|[n6=zYd6\"k\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016-=+}\u0000//<g\u0019c-7#\u0016c,+#\u0012m3*k\u0006\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"/<g\u0019c-7.\u0016c,+.\u0012m3*k\u0006\"6*.\u001dq\u007f {\u0018n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"9/g\u0018g;nz\u001b\";+b\u0011v:n+\u0010\"9'b\u0011qsn|\u0011v-7g\u001aeq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"9'b\u0011\"6=.\u0015\";'|\u0011a+!|\r.\u007f9f\u001da7n}\u001cm*\"jTl0:.\u001cc)+.\u001cc/>k\u001ag;`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f;`\u0015`3+.\u0000m\u007f'`\u0007g-:.\u001dl<!c\u0004n::kT`>-e\u0001r\u007f'`\u0010k</z\u001bpsnl\u0015f\u007f,{\u0000\"1!zTd>:o\u0018,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016-8!g\u001aer:aYf:\"k\u0000g\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\",+`\u0010k1).\u0006g.;k\u0007v\u007f:aTf:\"k\u0000g\u007fkjTd6\"k\u0007,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "\",+m\u001bl;/|\r\"9!b\u0010g-=.\u0003k+&.\u0000k+\"kT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"9/g\u0018g;nz\u001b\";+b\u0011v:n+\u0010\"9'b\u0011qsn|\u0011v-7g\u001aeq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016-;+b\u0011v6 iYq:-a\u001af><wYd0\"j\u0011pp a\u0000/9!{\u001af\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"1;b\u0018\"9'b\u0011q\u007f(a\u0001l;ny\u001dv7n`\u0015o:n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 151;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 152;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"</`\u001am+n~\u0011p9!|\u0019\",-|\u0001`\u007f'hT`>-e\u0001rp<k\u0007v0<kTk,n~\u0011l;'`\u0013,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 153;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 154;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016-;+b\u0011v6 iYr-'c\u0015p&ch\u001bn;+|[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 155;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"1;b\u0018\"9'b\u0011q\u007f(a\u0001l;ny\u001dv7n`\u0015o:n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 156;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"z*.\u001bd\u007fkjTd6\"k\u0007\"(+|\u0011\";+b\u0011v:* ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 157;
                    str = "\"7/}Tl0nh\u001dn:=.\\a0;b\u0010\"=+.\u0010w:nz\u001b\"1+z\u0003m-%.\u0011p-!|],";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 158;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 159;
                    str = "\"w-a\u0001n;nl\u0011\";;kTv0noTl::y\u001bp4nk\u0006p0<'Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 160;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"9'b\u0011\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 161;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"9'b\u0011\"6=.\u001dl\u007f)j\u0006k)+Q\u0012k3+Q\u0019c/nl\u0001v\u007f'}To6=}\u001dl8nh\u0006m2nI\u001bm8\"kTF-'x\u00118\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 162;
                    str = "\"/<g\u0019c-7.\u0012m3*k\u0006q\u007f9g\u0000j\u007f:g\u0000n:n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 163;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016-;+b\u0011v6 iYq:-a\u001af><wYd0\"j\u0011pp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 164;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016-9'b\u0011/7/}Yl0cz\u001dv3+!T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 165;
                    str = "\"w-a\u0001n;nl\u0011\";;kTv0noTl::y\u001bp4nk\u0006p0<'Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 166;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016-;+b\u0011v6 iYr-'c\u0015p&ch\u001bn;+|[l0:#\u0012m* jT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 167;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"/<g\u0019c-7.\u0016c,+.\u0012m3*k\u0006\"6=.\u001aw3\" ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 168;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"9!{\u001af\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 169;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\";+b\u0011v6 iTd6\"kTl0:.\u0018k,:k\u0010\"6 .3F\r\u0007X1]\u0019\u0007B1]\u0012\u000f^N\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 170;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"1!z\u001ck1).\u0000m\u007f*k\u0018g++ ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 171;
                    str = "\"7/}Tl*\"bTp:=a\u0001p<+.\u001dfsn}\u001fk/>g\u001aeq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 172;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016-,+m\u001bl;/|\r/=/}\u0011/9!b\u0010g-=#\u0015p:c`\u0001n3ah\u0011v<&g\u001aer:f\u0011/3'}\u0000/>)o\u001dl";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 173;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\",+m\u001bl;/|\r\"=/}\u0011\"9!b\u0010g-ng\u0010\"6=.\u001aw3\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 174;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016\"9!{\u001af\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 175;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0010p68kYc/'.\u0019F-'x\u0011C/'.\u001dq\u007f a\u0000\"1;b\u0018\"> jTc\u007f k\u0003\";<g\u0002g\u001e>gTm=$k\u0017v\u007f'}T`:'`\u0013\">=}\u001de1+jX\"+&g\u0007\"6=.\u0001l:6~\u0011a++jT*+&a\u0001e7n`\u001bv\u007f(o\u0000c3g ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 176;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/1+z\u0003m-%#\u0007g+:g\u001ae\u007f;`\u0015`3+.\u0000m\u007f-a\u0019o6:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 177;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/1+z\u0003m-%#\u0007g+:g\u001aep'`\u0017m-<k\u0017vr8o\u0018w:a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 178;
                    str = "k1:k\u0006d>-k+e;<g\u0002g\u0000,o\u0017i*>Q\u001ag+9a\u0006i\u0000=k\u0000v6 i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 179;
                    str = "e;<g\u0002g\u0000/b\u0006g>*w+w/\"a\u0015f:*Q\u0016{++}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 180;
                    str = "D>'b\u0011f\u007f:aTf09`\u0018m>*.\u0012k3+4T*z='";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 181;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:ch\u001dn:n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 182;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0012k3+}Yd0<#\u0001r3!o\u0010-6 #\u0019g;'oYd0\"j\u0011p\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 183;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr(g\u0018gp=e\u001dr/+jT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 184;
                    str = "\",'t\u00118";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 185;
                    str = "e;<g\u0002g\u0000\"o\u0007v\u0000={\u0017a:=}\u0012w3\u0011l\u0015a4;~+v0:o\u0018],'t\u00118";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 186;
                    str = "e;<g\u0002gr=k\u0006t6-k[l::y\u001bp4cy\u0015k+ac\u0011q,/i\u0011/-+}\u0000m-+.L4k~>D2onc\u001dn3'}\u0011a0 j\u0007.\u007f)g\u0002k1).\u0001r\u007f a\u0003,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 187;
                    str = "e;<g\u0002gr=k\u0006t6-k[l::y\u001bp4cy\u0015k+ac\u0011f6/#\u0006g,:a\u0006g\u007fv8@2o~>D\"2'b\u0018k,+m\u001bl;=\"Te68g\u001ae\u007f;~Tl09 ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 188;
                    str = "e;<g\u0002gr=k\u0006t6-k[l::y\u001bp4cy\u0015k+al\u0015a4;~T:iz>D2o~.\u0019k3\"g\u0007g<!`\u0010qsni\u001dt6 iTw/n`\u001buq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 189;
                    str = "'\u007f,w\u0000g,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 190;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rp:a\u001b/2/`\r/9/g\u0018w-+}[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 191;
                    str = "'\u007f(g\u0018g,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 192;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rp-o\u001aa:\"b\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 193;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rp:a\u001b/2/`\r/9/g\u0018w-+}[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 194;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 195;
                    str = "e;<g\u0002gr=k\u0006t6-k[p::|\r/9/g\u0018g;c|\u0011q+!|\u0011/9'b\u0011qp(o\u001dn:*#\u0000mr*k\u0018g++#\u0004n>-k\u001cm3*k\u0006-\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 196;
                    str = "e;<g\u0002gr#o\u0004--+z\u0006{r(o\u001dn:*#\u0006g,:a\u0006gr(g\u0018g,nj\u0006k)+O\u0004kq\"g\u0007v\u0019'b\u0011q\u007ff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 197;
                    str = "e;<g\u0002gr=k\u0006t6-k[p::|\r/9/g\u0018g;c|\u0011q+!|\u0011/9'b\u0011q\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 198;
                    str = "e;<g\u0002gr=k\u0006t6-k[p::|\r/9/g\u0018g;c|\u0011q+!|\u0011/9'b\u0011qp(o\u001dn:*#\u0007g<!`\u0010/>:z\u0011o/:!T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 199;
                    str = "e;<g\u0002gr=k\u0006t6-k[p::|\r/9/g\u0018g;c|\u0011q+!|\u0011/9'b\u0011q\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 200;
                    str = "\"9/g\u0018g;t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 201;
                    str = ".\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 202;
                    str = "e;<g\u0002gr=k\u0006t6-k[p::|\r/9/g\u0018g;c|\u0011q+!|\u0011/9'b\u0011qp(o\u001dn:*#\u0000mr*k\u0018g++#\u0004n>-k\u001cm3*k\u0006-\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 203;
                    str = "\"+!z\u0015ne";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 204;
                    str = "\"+!z\u0015ne";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 205;
                    str = "+\u007f<k\u0000w- k\u0010\"1;b\u0018,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 206;
                    str = "e;<g\u0002gr=k\u0006t6-k[p::|\r/9/g\u0018g;c|\u0011q+!|\u0011/9'b\u0011qp(o\u001dn:*#\u0000mr*k\u0018g++#\u0004n>-k\u001cm3*k\u0006-\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 207;
                    str = "e;<g\u0002gr=k\u0006t6-k[p::|\r/9/g\u0018g;c|\u0011q+!|\u0011/9'b\u0011q\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 208;
                    str = "\"9/g\u0018g;t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 209;
                    str = "\"+!z\u0015ne";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 210;
                    str = "e;<g\u0002gr=k\u0006t6-k[p::|\r/9/g\u0018g;c|\u0011q+!|\u0011/9'b\u0011qp\"a\u0017c3c~\u0015v7cg\u0007/1;b\u0018\"9'b\u0011W/\"a\u0015f\u000f/z\u001c8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 211;
                    str = "\"9/g\u0018g;t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 212;
                    str = "e;<g\u0002gr=k\u0006t6-k[q7!{\u0018fr,o\u0017i*>#\u001dlr*a\u0017w2+`\u0000/9!b\u0010g-n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 213;
                    str = "e;<g\u0002gr=k\u0006t6-k[q7!{\u0018fr,o\u0017i*>!\u001dlr8g\u0010g0ch\u001bn;+|T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 214;
                    str = "e;<g\u0002gr=k\u0006t6-k[a-+o\u0000gr=k\u0017m1*o\u0006{r,o\u0007gr(a\u0018f:<!\u0001l>,b\u0011/+!#\u0017p:/z\u0011/,+m\u001bl;/|\r/=/}\u0011/9!b\u0010g-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 215;
                    str = "e;<g\u0002gr=k\u0006t6-k[a-+o\u0000gr=k\u0017m1*o\u0006{r(a\u0018f:<!\u0012c6\"k\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 216;
                    str = "e;<g\u0002gr=k\u0006t6-k[a-+o\u0000gr=k\u0017m1*o\u0006{r,o\u0007gr(a\u0018f:<!\u0001l>,b\u0011/+!#\u0015a<+}\u0007//<g\u0019c-7#\u0016c,+#\u0012m3*k\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 217;
                    str = "e;<g\u0002gr=k\u0006t6-k[a-+o\u0000gr>|\u001do><wYd0\"j\u0011pp(o\u001dn:*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 218;
                    str = "e;<g\u0002gr=k\u0006t6-k[q;-o\u0006fr9o\u001dv\u007fv8@2o~>D\"2'b\u0018k,+m\u001bl;=\"Te68g\u001ae\u007f;~Tl09 ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 219;
                    str = "c<:g\u001bl\u0000*k\u0018g++";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 220;
                    str = "c<:g\u001bl\u0000*k\u0018g++";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 221;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0010g3+z\u0011C3\"H\u001dn:=.\u0007w<-k\u0011f:*.\u001dl\u007f(g\u0006q+no\u0000v:#~\u0000,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 222;
                    str = "F:\"k\u0000k1).3m0)b\u0011\"\u001b<g\u0002g\u007f,o\u0017i*>.\u0012m-n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 223;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0007v><z\u0011f\u007f9g\u0000j0;zTc1no\u0017v6!`Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 224;
                    str = "a0 x\u0011p+\u0011z\u001b]0\"j+`>=k+d0\"j\u0011p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 225;
                    str = "c<:g\u001bl\u0000,o\u0017i*>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 226;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0016c<%{\u0004\">;z\u001bo>:k\u0010\"=/m\u001fw/nm\u0015n3+jTv0!.\u0011c-\"wX\"6)`\u001bp:*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 227;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 228;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0010k>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 229;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 230;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0016c,+.\u0012m3*k\u0006\"1/c\u0011\"6=.\u001aw3\"\"Td>:o\u0018\":<|\u001bpq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 231;
                    str = "e0!i\u0018g\u007f*|\u001dt:n}\u001bo:nc\u0011f6/.\u0012k3+}Td>'b\u0011f\u007f:aTf09`\u0018m>*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 232;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0015a+'a\u001a\"6=.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 233;
                    str = "m3*Q\u0004j0 k+l*#l\u0011p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 234;
                    str = "c<:g\u001bl\u0000<k\u0007v0<k+o:*g\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 235;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0000m+/bYp:?{\u0011q+=#\u0000k3\"#\u0006g,:a\u0006gr#k\u0007q>)k\u0007-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 236;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0015`0;zTv0nm\u001cc1)kTl*#l\u0011p\u007f(|\u001bo\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 237;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 238;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 239;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007-2+j\u001dcr<k\u0007v0<kYr: j\u001dl8ac\u0007e,:a\u0006gr*a\u0003l3!o\u0010/: j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 240;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0016c<%{\u0004--+o\u0010/,:a\u0006c8+#\u0004g-#g\u0007q6!`Yf: g\u0011fp/l\u001bp+'`\u0013/=/m\u001fw/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 241;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.5A\u000b\u0007A:]\u001b\u000bB1V\u001anm\u0015n3+jTu6:fTl0n`\u0001o=+|Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 242;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0010k>az\u001bv>\"#\u0006g.;k\u0007v,cg\u001a/-+}\u0000m-+#\u0007g,=g\u001blp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 243;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0010k>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 244;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 245;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0010g3+z\u0011C3\"H\u001dn:=.\u0012c6\"k\u0010\"+9g\u0017gq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 246;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0017j> i\u0011\"1;c\u0016g-n|\u0011s*+}\u0000g;nl\u0001v\u007f k\u0003\"/&a\u001ag\u007f {\u0019`:<.\u0003c,n`\u001bv\u007f>o\u0007q:*.\u001dl\u007f:f\u0011\"-+\u007f\u0001g,: ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 247;
                    str = "\">-m\u001bw1:@\u0015o:ng\u0007\"1;b\u0018.\u007f-o\u001al0:.\u0004p0-k\u0011f\u007f({\u0006v7+|Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 248;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0016c<%{\u0004\"</`\u001am+n}\u0000c-:.\u0016c<%{\u0004.\u007f#k\u0010k>n|\u0011q+!|\u0011\"6 .\u0004g1*g\u001ae";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 249;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0010g3+z\u0011C3\"H\u001dn:=.\u0012c6\"k\u0010\"0 m\u0011\"=;zTq*-m\u0011g;+jTq:-a\u001af\u007f:g\u0019gq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 250;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 251;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007\"+!z\u0015n\u007f9o\u0018n\u007f:g\u0019g\u007f(a\u0006\"2+}\u0007c8+.\u0006g,:a\u0006gen+Z39n}\u0011a0 j\u0007,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 252;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 253;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0016c<%{\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 254;
                    str = "h6*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 255;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0015w+&#\u0012c6\"k\u0010-* e\u001am( #\u0017c*=k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 256;
                    str = "8\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 257;
                    str = "c<:g\u001bl\u0000<k\u0007v0<k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 258;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 259;
                    str = "c<:g\u001bl\u0000,o\u0017i*>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 260;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0015a<!{\u001av\u0011/c\u0011\"6=.\u001aw3\".I<\u007f;}\u0011p\u007f&o\u0007\"1+x\u0011p\u007f-a\u001ad6){\u0006g;nI\u001bm8\"kTF-'x\u0011\"=/m\u001fw/no\u001af\u007f'}Tl09.\u0010g3+z\u001dl8nY\u001cc+=O\u0004r\u007f/m\u0017m* zX\"1!z\u001ck1).\u0000m\u007f*k\u0018g++ ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 261;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0007v><z\u0011f\u007f9g\u0000j0;zTc1no\u0017v6!`Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 262;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0016c<%{\u0004\"> a\u0000j:<.\u0016c<%{\u0004\"6=.\u0015n-+o\u0010{\u007f<{\u001al6 iZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 263;
                    str = "c<:g\u001bl\u0000-f\u0015l8+Q\u001aw2,k\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 264;
                    str = "e0!i\u0018g\u007f*|\u001dt:nc\u0007e,:a\u0006g\u007f,o\u0017i*>.\u0012k3+.\u001am+nh\u001bw1*.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 265;
                    str = "w,+|+k1'z\u001dc++j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 266;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0010k>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 267;
                    str = "q*-m\u0011q,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 268;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0010k>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 269;
                    str = "l:9Q\u0004j0 k+l*#l\u0011p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 270;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0010k>n|\u0011q+!|\u0011\"6=.\u0015n-+o\u0010{\u007f<{\u001al6 iZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 271;
                    str = "c<-a\u0001l+\u0011`\u0015o:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 272;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 273;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0000m+/bYp:?{\u0011q+=#\u0000k3\"#\u0006g,:a\u0006gr#k\u0007q>)k\u0007-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 274;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0015w+&#\u0012c6\"k\u0010-* e\u001am( #\u0017c*=k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 275;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0010k>n|\u0011q+!|\u0011\"2+j\u001dc\u007f-o\u0018n:*.\u0016w+nc\u0011f6/.\u0006g,:a\u0006g\u007f'}Tl0:.\u0004g1*g\u001aesn|\u0011s*+}\u0000\"6)`\u001bp:* ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 276;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0017j> i\u0011\"1;c\u0016g-n|\u0011s*+}\u0000g;nl\u0001v\u007f!b\u0010\"/&a\u001ag\u007f {\u0019`:<.\u0003c,n`\u001bv\u007f>o\u0007q:*.\u001dl\u007f:f\u0011\"-+\u007f\u0001g,: ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 277;
                    str = "+\u007f(o\u001dn:* ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 278;
                    str = "\"+!.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 279;
                    str = "m1\"w+k9\u0011~\u0011l;'`\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 280;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 281;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 282;
                    str = "c<:g\u001bl\u0000\"g\u0007v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 283;
                    str = "d>'b\u0011f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 284;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0016c<%{\u0004\"\b&o\u0000q\u001e>~TN0)g\u001a\"7/}Td>'b\u0011fsni\u001bm8\"kTf-'x\u0011\"=/m\u001fw/no\u0016m-:k\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 285;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0000m+/bYp:?{\u0011q+=#\u0000k3\"#\u0006g,:a\u0006gr#k\u0007q>)k\u0007-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 286;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007\"-+}\u0000m-+.\u001dq\u007f/b\u0006g>*wTp* `\u001dl8`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 287;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0007q>)k\u0007\"9'`\u001dq7+jTu6:fTq*-m\u0011q,n}\u0000c+;}N\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 288;
                    str = "+\u007f={\u0017a:+j\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 289;
                    str = "\"+!.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 290;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0015l0:f\u0011p\u007f*k\u0018g+'a\u001a\"6=.\u0015n-+o\u0010{\u007f<{\u001al6 iZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 291;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0010k>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 292;
                    str = "a0 x\u0011p+\u0011z\u001b]1+y+`>=k+d0\"j\u0011p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 293;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0006g,:a\u0006gr#k\u0010k>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 294;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0017j> i\u0011\"1;c\u0016g-n&\u0012p0#.\u001bn;n`\u0001o=+|T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 295;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:.\u0017j> i\u0011\"1;c\u0016g-n&\u0012p0#.\u001bn;n`\u0001o=+|T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 296;
                    str = "c<:g\u001bl\u0000*k\u0018g++";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 297;
                    str = "v&>k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 298;
                    str = "\"+!.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 299;
                    str = "e;<g\u0002g\u0000/b\u0006g>*w+f09`\u0018m>*k\u0010]=7z\u0011q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 300;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0007g<!`\u0010c-7#\u0016c,+#\u0012m3*k\u0006/6*!\u0004p6#o\u0006{r,o\u0007gr(a\u0018f:<#\u001dqr {\u0018n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 301;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 302;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0007g<!`\u0010c-7#\u0016c,+#\u0012m3*k\u0006/6*!\u0018m0%g\u001aer'`Yq:-a\u001af><wYq//m\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 303;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> m\u0011nr#k\u0010k>c|\u0011q+!|\u0011-6 z\u0011p-;~\u0000/;<g\u0002gr/~\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 304;
                    str = "e;<g\u0002gr=k\u0006t6-k[f-'x\u0011/>>g[l*\"b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 305;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> m\u0011np a\u0000j6 iYv0cm\u0015l<+b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 306;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> m\u0011nr,o\u0017i*>!\u001dl++|\u0006w/:#\u0010p68kYc/'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 307;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> m\u0011nr>k\u001af6 iY`>-e\u0001rr/`\u0010/-+}\u0000m-+#\u001ddr/`\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 308;
                    str = "e;<g\u0002gr=k\u0006t6-k[f-'x\u0011/>>g[l*\"b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 309;
                    str = "a0# \u0015l;<a\u001dfq8k\u001af6 i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 310;
                    str = "e;<g\u0002gr=k\u0006t6-k[k,co\u0017a:=}Yr0=}\u001d`3+.3m0)b\u0011\"\u000f\"o\r\",+|\u0002k<+}Tc-+.\u001am+no\u0002c6\"o\u0016n:`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 311;
                    str = "e;<g\u0002gr=k\u0006t6-k\u0007-6=#\u0015a<+}\u0007//!}\u0007k=\"k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 312;
                    str = "e;<g\u0002gr=k\u0006t6-k[k,co\u0017a:=}Yr0=}\u001d`3+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 313;
                    str = "e;<g\u0002gr=k\u0006t6-k[k,co\u0017a:=}Yr0=}\u001d`3+.3m0)b\u0011\"\u000f\"o\r\",+|\u0002k<+}Tc-+.\u0019k,=g\u001ae\u007f/`\u0010\"</`T`:ng\u001aq+/b\u0018g;b.Tq+/z\u0001q\u007f-a\u0010gen";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 314;
                    str = "e;<g\u0002gr=k\u0006t6-k\u0007-6=#\u0015a<+}\u0007//!}\u0007k=\"kTE0!i\u0018g\u007f\u001eb\u0015{\u007f=k\u0006t6-k\u0007\"><kTo6=}\u001dl8no\u001af\u007f-o\u001al0:.\u0016g\u007f'`\u0007v>\"b\u0011fsn}\u0000c+;}Ta0*kN\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 315;
                    str = "e;<g\u0002g\u0000<k\u0007v0<k+q+/|\u0000]+'c\u0011q+/c\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 316;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0006g,:a\u0006gr=z\u0015p+cz\u001do:=z\u0015o/n{\u001ac=\"kTv0nm\u001bo2'zTp:=z\u001bp:n}\u0000c-:.\u0000k2+}\u0000c2>.\u0000m\u007f=f\u0015p:*.\u0004p:(}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 317;
                    str = "e;<g\u0002g\u0000/m\u0017m* z+l>#k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 318;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-2=i\u0007g-8g\u0017gr a\u0000/<!`\u001ag<:k\u0010-<!`\u001ag<:g\u001aer a\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 319;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-9/g\u0018g;cz\u001b/<!`\u001ag<:#\u0000mr#}\u0013q:<x\u001da:ao\u0016m-:#\u0016c<%{\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 320;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-(/g\u0000k1)#\u0012m-cc\u0007e,+|\u0002k<+#\u0000mr,kYa0 `\u0011a++j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 321;
                    str = "D>'b\u0011f\u007f:aTn0).\u001dl+!.#j>:}5r/n}\u0011p)+|\u0007,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 322;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-9/g\u0018g;cz\u001b/3!i\u001dlp/l\u001bp+cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 323;
                    str = "O:=}\u0015e:n}\u0011p)'m\u0011\"9/g\u0018g;nz\u001b\"<!`\u001ag<:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 324;
                    str = "V6#k\u001bw+ny\u001ck3+.\u0003c6:g\u001ae\u007f(a\u0006\"2+}\u0007c8+.\u0007g-8g\u0017g\u007f:aTa0 `\u0011a+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 325;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-2=i\u0007g-8g\u0017gr-a\u001al:-z\u0011fp:|\u0001g";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 326;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-+'c\u0011m*:#\u0003j6\"kYu>'z\u001dl8ch\u001bpr#}\u0013q:<x\u001da:cz\u001b/=+#\u0017m1 k\u0017v:*!\u0015`0<zY`>-e\u0001r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 327;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:c}\u0011v+'`\u0013q\u007f;`\u0015`3+.\u0000m\u007f-a\u0019o6:.\u0013f-'x\u0011\",+z\u0000k1)}Tv0n}\u001cc-+jTr-+h\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 328;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:c}\u0011v+'`\u0013qp\"a\u0017c3c}\u0011v+'`\u0013qr!l\u001eg<:#\u001dqr {\u0018n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 329;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:c}\u0011v+'`\u0013qp=k\u0000v6 iYn0-o\u0018/,+z\u0000k1)}T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 330;
                    str = "e;<g\u0002g\u007f(g\u0018g\u007f#o\u0004\"6=.\u001aw3\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 331;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 332;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 333;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 334;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 335;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006\"3+z\u0007\"9'`\u0010\"+&kTm1+.\u0003k+&.\u0019c'n`\u0001o=+|Tm9nh\u001dn:=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 336;
                    str = "\"('z\u001c\"9'b\u0011q\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 337;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 338;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006.\u007f\"g\u0007v\u0019'b\u0011q\u007f!`T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 339;
                    str = "\"6=.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 340;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006\"9'`\u0015n\u007f,o\u0007g\u0019!b\u0010g-\u0007jTk,n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 341;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006-* o\u0016n:cz\u001b/9+z\u0017jr:f\u0011/3'}\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 342;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006-1!`\u0011/9!{\u001af";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 343;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 344;
                    str = "W1%`\u001bu1nx\u0015n*+.\u0012m-n}\u0004c<+4T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 345;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006-2;b\u0000k/\"kYd0;`\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 346;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006/6*.\u0007g-'a\u0001q\u007f+|\u0006m-t.\u0019E;<g\u0002g\u0019'b\u0011O>>.\u001dq\u007f a\u0000\":#~\u0000{\u007f,{\u0000\"(+.\u0010m1izTj>8kTr-'c\u0015p&nl\u0015q:nh\u001bn;+|Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 347;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 348;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006/6*\"T`>=kTd0\"j\u0011p\u007f o\u0019g\u007f'}Tl*\"bX\"* k\fr:-z\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 349;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 350;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006-9/g\u0018g;cz\u001b/;+m\u001df:cl\u0011q+cl\u0015q:ch\u001bn;+|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 351;
                    str = "\"-+z\u0001p1+jTl*\"bZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 352;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006\"1;cTm9nh\u001dn:=.\u001dl\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 353;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c,+#\u0012m3*k\u0006-* o\u0016n:cz\u001b/>=}\u001ba6/z\u0011/,+m\u001bl;/|\r/('z\u001c//<g\u0019c-7#\u0016c,+#\u0012m3*k\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 354;
                    str = "e;<g\u0002gr=k\u0006t6-k[r-'c\u0015p&cl\u0015q:ch\u001bn;+|Yl>#kYd0<#\u0016c<%{\u0004\"5'jTk,n`\u0001n3b.\u0012c+/bTg-<a\u0006,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 355;
                    str = "e;<g\u0002gr=k\u0006t6-k[r-'c\u0015p&cl\u0015q:ch\u001bn;+|Yl>#kYd0<#\u0016c<%{\u0004\"\u001e>~Zo:ng\u0007\"1;b\u0018.\u007f-o\u001a%+n~\u0006m<+k\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 356;
                    str = "e;<g\u0002g\u0000/b\u0006g>*w+w/\"a\u0015f:*Q\u0016{++}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 357;
                    str = "U6cH\u001d\"0<.\u0017g3\"{\u0018c-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 358;
                    str = "w1%`\u001bu1";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 359;
                    str = "U6cH\u001d\"0<.\u0017g3\"{\u0018c-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 360;
                    str = "U6cH\u001d\"0 b\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 361;
                    str = "w1%`\u001bu1";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 362;
                    str = "U6cH\u001d\"0 b\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 363;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0019g;'oYp:=z\u001bp:c`\u0011v(!|\u001f/,+z\u0000k1)!\u001dl)/b\u001dfr8o\u0018w:a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 364;
                    str = "e;<g\u0002g\u0000#k\u0010k>\u0011|\u0011q+!|\u0011]1+z\u0003m-%Q\u0007g+:g\u001ae";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 365;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0019g;'oYp:=z\u001bp:c`\u0011v(!|\u001f/,+z\u0000k1).\u0001l>,b\u0011\"+!.\u0017m2#g\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 366;
                    str = "w1#a\u0001l++j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 367;
                    str = "e;<g\u0002gr=k\u0006t6-k[m==k\u0006t:<!\u0006g8'}\u0000g-+j[g-<a\u0006-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 368;
                    str = "w1#a\u0001l++j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 369;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-;+b\u0011v6 iT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 370;
                    str = "\"('z\u001c\"+'c\u0011q+/c\u00048";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 371;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-;+b\u0011v:ch\u001dn:=#\u0015d++|Yo>>#\u0016c<%{\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 372;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004\";+b\u0011v6 iTm3*.3F\r\u0007X1]\u0019\u0007B1]\u0012\u000f^+D\u0016\u0002K:C\u0012\u000b.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 373;
                    str = "e;<g\u0002g\u0000(g\u0018g\u0000#o\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 374;
                    str = "e;<g\u0002g\u0000(g\u0018g\u0000#o\u0004]6*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 375;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004\"/<g\u0019c-7.\u0016c,+.\u0012m3*k\u0006\"6*.\u001dq\u007f {\u0018nsno\u0016m-:g\u001ae\u007f)j\u0006k)+Q\u0012k3+Q\u0019c/nl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 376;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 377;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004\"9/g\u0018g;nz\u001b\"*>j\u0015v:nz\u001dv3+.\u001bd\u007f:f\u0011\"9'b\u0011\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 378;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 379;
                    str = "R-'c\u0015p&nl\u0015q:nh\u001bn;+|Tk;nm\u0015l1!zT`:n`\u0001n3no\u0000\"+&g\u0007\"/!g\u001av";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 380;
                    str = "\"+!.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 381;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-6 }\u0011p+c~\u0006m/+|\u0000{p)j\u0006k)+Q\u0012k3+Q\u0019c/\u0011g\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 382;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004\"1;c\u0016g-na\u0012\"0\"jTE\u001b\u001cG\"G\u0000\bG8G\u0000\u0003O$]\u0019\u0007B1L\u001e\u0003KTd6\"k\u00078\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 383;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-1!z\u001ck1)#\u0000mr*k\u0018g++#\u0004m,:#\u0016c<%{\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 384;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 385;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004\"3/z\u0011q+nh\u001dn:nf\u0015q\u007f#a\u0010k9'm\u0015v6!`Tv6#k\u0007v>#~N\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 386;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004-;+b\u0011v6!`Yd>'b\u0011f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 387;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004\"9/g\u0018g;nz\u001b\"<<k\u0015v:nh\u001dn:ni\u0010p68k+d6\"k+o>>.\u001dl\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 388;
                    str = "l*\"b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 389;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr#o\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 390;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0000m+/bY`>-e\u0001rr=g\u000eg\u007f;`\u0015`3+.\u0000m\u007f-a\u0019o6:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 391;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0000m+/bY`>-e\u0001rr=g\u000eg\u007f/m\u0017m* zTl>#kTk,n`\u0001n3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 392;
                    str = "e;<g\u0002g\u0000\"o\u0007v\u0000={\u0017a:=}\u0012w3\u0011l\u0015a4;~+v0:o\u0018],'t\u00118";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 393;
                    str = "\"*>b\u001bc;cz\u001bv>\"4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 394;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr(g\u0018g\u007f(g\u0018g\n>b\u001bc;\u001eo\u0000j\u007f'}Tl*\"bTd0<.\u0012k3+.\u0004c+&4T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 395;
                    str = "\";!k\u0007\"1!zTg''}\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 396;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr(g\u0018g\u007f,o\u0017i*>.\u001cc,nl\u0011g1nm\u0015l<+b\u0018g;`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 397;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr(g\u0018g\u007f(g\u0018g\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 398;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr(g\u0018gp+v\u0004g<:k\u0010/9'b\u0011/8!zYf6<k\u0017v0<wYk1=z\u0011c;a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 399;
                    str = ".\u007f;`\u0011z/+m\u0000g;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 400;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr(g\u0018gp-f\u0011a4cg\u001a/2+j\u001dcr(a\u0018f:<#\u0012c6\"k\u0010\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 401;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr(g\u0018gp;~\u0018m>*#\u0016c,+#\u0012m3*k\u0006/6=#\u001aw3\".";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 402;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rr(g\u0018gp:a\u001b/2/`\r/9/g\u0018w-+}Tw/\"a\u0015fr(o\u001dn:*4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 403;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0015a<!{\u001avr o\u0019g\u007f;`\u0015`3+.\u0000m\u007f-a\u0019o6:.\u0015a<!{\u001av\u007f o\u0019g\u007f:aTq7/|\u0011f\u007f>|\u0011d,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 404;
                    str = "e;<g\u0002g\u0000/m\u0017m* z+l>#k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 405;
                    str = "e;<g\u0002g\u0000,o\u0017i*>Q\u0007v><z+v6#k\u0007v>#~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 406;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1-|\u0011o: zY`>-e\u0001rr(o\u001dn:*#\u0017m* z[w/*o\u0000g;cm\u001bw1:!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 407;
                    str = "e;<g\u0002g\u0000={\u0017a:=}\u001dt:\u0011l\u0015a4;~+d>'b\u0011f\u0000-a\u0001l+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 408;
                    str = "e;<g\u0002g\u0000={\u0017a:=}\u001dt:\u0011l\u0015a4;~+d>'b\u0011f\u0000-a\u0001l+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 409;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1-|\u0011o: zY`>-e\u0001rr(o\u001dn:*#\u0017m* zTw1/l\u0018g\u007f:aTa0#c\u001dv\u007f,o\u0017i*>.\u0012c6\"k\u0010\"<!{\u001av\u007f:aTq7/|\u0011f\u007f>|\u0011d,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 410;
                    str = "e;<g\u0002gr=k\u0006t6-k[k,cg\u001aa0#~\u0018g++#\u0016c<%{\u0004/6 j\u001da>:a\u0006//<k\u0007g1:!\u0004p6#o\u0006{r,o\u0007gr(a\u0018f:<#\u001dqr {\u0018n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 411;
                    str = "k1-a\u0019r3+z\u0011]=/m\u001fw/\u0011c\u0015p4+|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 412;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0013f-'x\u0011/,:o\u0000gp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 413;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0010p68kYq+/z\u0011\"* o\u0016n:nz\u001b\"<!c\u0019k+ni\u001bm8\"kTf-'x\u0011\",:o\u0000g\u007f:aTq7/|\u0011f\u007f>|\u0011d,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 414;
                    str = "e;<g\u0002g\u0000=z\u0015v:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 415;
                    str = "e;<g\u0002gr=k\u0006t6-k[o6)|\u0015v:ca\u0018fr,o\u0007gr(a\u0018f:<!T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 416;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0004p6#o\u0006{r,o\u0007gr(a\u0018f:<#\u001dfp!b\u0010/9!b\u0010g-ch\u001bw1*\"Tp: o\u0019k1).\u001dv\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 417;
                    str = "d>'b\u0011f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 418;
                    str = "e;<g\u0002gr=k\u0006t6-k[o6)|\u0015v:ca\u0018fr,o\u0007gr(a\u0018f:<!\u0007g)+|\u0011/:<|\u001bpp!b\u0010/=/}\u0011/9!b\u0010g-c`\u0015o:cg\u0007/1;b\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 419;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 420;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 421;
                    str = "\"rp.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 422;
                    str = "\"rp.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 423;
                    str = "e;<g\u0002gr=k\u0006t6-k[o6)|\u0015v:ca\u0018fr,o\u0007gr(a\u0018f:<!\u0017c1 a\u0000/-+z\u0006k:8kY`>=kYd0\"j\u0011pr o\u0019g";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 424;
                    str = "e;<g\u0002gr=k\u0006t6-k[o6)|\u0015v:ca\u0018fr,o\u0007gr(a\u0018f:<!\u001am1+#\u0012m* j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 425;
                    str = "e;<g\u0002gr=k\u0006t6-k[o6)|\u0015v:ca\u0018fr,o\u0007gr(a\u0018f:<!\u0012c6\"k\u0010/+!#\u0013g+ch\u001bn;+|Yn6=z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 426;
                    str = "q*-m\u0011g;+j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 427;
                    str = "e;<g\u0002gr=k\u0006t6-k[o6)|\u0015v:ca\u0018fr,o\u0007gr(a\u0018f:<!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 428;
                    str = "e;<g\u0002gr=k\u0006t6-k[a3+o\u001aw/co\u0012v:<#\u0016c<%{\u0004\"9/g\u0018g;nz\u001b\"<!c\u0019k+`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 429;
                    str = "e;<g\u0002g\u0000,o\u0017i*>Q\u0007v><z+v6#k\u0007v>#~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 430;
                    str = "e;<g\u0002g\u0000/b\u0006g>*w+w/\"a\u0015f:*Q\u0016{++}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 431;
                    str = "e;<g\u0002g\u0000;}\u0011p\u0000'`\u001dv6/z\u0011f\u0000,o\u0017i*>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 432;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~Td-+\u007f\u0001g1-wTj>=.\u0001l:6~\u0011a++jTt>\"{\u00118\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 433;
                    str = ".\u007f aTc*:aT`>-e\u0001r,ny\u001dn3nl\u0011\"/+|\u0012m-#k\u0010,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 434;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~[d-+\u007f\u0001g1-w[o0 z\u001cn&nb\u0015q+nl\u0015a4;~Tu>=.\u001bl\u007f*o\r\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 435;
                    str = "\"sng\u0013l0<g\u001ae\u007f'z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 436;
                    str = "a3'k\u001av\u00008k\u0006q6!`+w/)|\u0015f:\u0011z\u001do:=z\u0015o/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 437;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~[d-+\u007f\u0001g1-w[o> {\u0015n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 438;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~[e;<g\u0002gr/m\u0017g,=#\u001am+co\u0018n09k\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 439;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~[d-+\u007f\u0001g1-w[o0 z\u001cn&nd\u0015`=+|Yk;ng\u0007\"1;b\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 440;
                    str = "\"+!.\u0004g-(a\u0006o\u007f/.\u0016c<%{\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 441;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~[d-+\u007f\u0001g1-w[l0 k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 442;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~[d-+\u007f\u0001g1-w[o0 z\u001cn&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 443;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~[d-+\u007f\u0001g1-w[u:+e\u0018{\u007f'z\u0007\"1!zT5\u007f*o\rq\u007f=g\u001aa:nz\u001cg\u007f\"o\u0007v\u007f={\u0017a:=}\u0012w3nl\u0015a4;~Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 444;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~[n>=zY`>-e\u0001rr:g\u0019g,:o\u0019rr'}Yk1ch\u0001v*<k[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 445;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~[d-+\u007f\u0001g1-w[o0 z\u001cn&ny\u0015k+nz\u001dn3nz\u001do:=z\u0015o/n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 446;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:){\u0018c-cl\u0015a4;~[d-+\u007f\u0001g1-w[o0 z\u001cn&ng\u0000q\u007f!`\u0018{\u007fkjTf>7}Tq6 m\u0011\"+&kTn>=zTq*-m\u0011q,({\u0018\"=/m\u001fw/`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 447;
                    str = "\"0(.2g=n<D3i`.&c1*a\u0019k%'`\u0013\"1+v\u0000\"=/m\u001fw/nz\u001b\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 448;
                    str = "e;<g\u0002gr=k\u0006t6-k[p:=z\u001bp:cc\u0011f6/.\u0012c6\"k\u0010\"+!.\u001dl6:.\u0013f-'x\u0011]9'b\u0011]2/~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 449;
                    str = "a0# \u0003j>:}\u0015r/\u0011~\u0006g9+|\u0011l<+}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 450;
                    str = "e;<g\u0002g\u0000/b\u0006g>*w+f09`\u0018m>*k\u0010]=7z\u0011q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 451;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>:z\u0011p&cy\u0015k+al\u0015a4;~T:iz>D2o~.\u0019k3\"g\u0007g<!`\u0010qsni\u001dt6 iTw/n`\u001buq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 452;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>:z\u0011p&cy\u0015k+ac\u0011f6/#\u0006g,:a\u0006g\u007fv8@2o~>D\"2'b\u0018k,+m\u001bl;=\"Te68g\u001ae\u007f;~Tl09 ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 453;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 454;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 455;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 456;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007-1;cYr-'c\u0015p&cl\u0015q:ch\u001bn;+|[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 457;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 458;
                    str = "e;<g\u0002gr=k\u0006t6-k[a0 x\u0011p+cz\u001b/0\"j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 459;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 460;
                    str = "D-!cN\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 461;
                    str = "\"+!4T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 462;
                    str = "e;<g\u0002gr=k\u0006t6-k[a0 x\u0011p+cz\u001b/0\"j[l*##\u0007g<!`\u0010c-7#\u0016c,+#\u0012m3*k\u0006-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 463;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:cl\u0015v++|\r/9!|Y`>-e\u0001rp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 464;
                    str = "e;<g\u0002gr=k\u0006t6-k[k8 a\u0006gr,o\u0000v:<wYq+/z\u0001qp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 465;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:cl\u0015v++|\r/9!|Yo:*g\u0015/-+}\u0000m-+!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 466;
                    str = "e;<g\u0002gr=k\u0006t6-k[a> #\u0001q:cl\u0015v++|\r-=/z\u0000g-7#\u0018g)+b[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 467;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 468;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007-1;cYq:-a\u001af><wY`>=kYd0\"j\u0011pp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 469;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 470;
                    str = "q:-a\u001af><wY`>=kYd0\"j\u0011p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 471;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007-9'b\u0011qr/|\u0011/1;b\u0018\"/<a\u0016c=\"wTf*+.\u0000m\u007f/.\u001ag+9a\u0006i\u007f'}\u0007w:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 472;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 473;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007-1;cYr-'c\u0015p&cl\u0015q:ch\u001bn;+|[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 474;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007-9/g\u0018g;cz\u001b/9+z\u0017jr\"g\u0007vr!hYr-'c\u0015p&cl\u0015q:ch\u001bn;+|\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 475;
                    str = "m3*#\u0004p6#o\u0006{r,o\u0007gr(a\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 476;
                    str = "-1;cYd6\"k\u0007-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 477;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007-1;cYm3*#\u0004p6#o\u0006{r,o\u0007gr(a\u0018f:<!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 478;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 479;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 480;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 481;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 482;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 483;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 484;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 485;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007-9/g\u0018g;cz\u001b/9+z\u0017jr\"g\u0007vr!hYm3*#\u0004p6#o\u0006{r,o\u0007gr(a\u0018f:<}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 486;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 487;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 488;
                    str = "e;<g\u0002gr=k\u0006t6-k[n6=zYd6\"k\u0007-9/g\u0018g;cz\u001b/9+z\u0017jr\"g\u0007vr!hYq:-a\u001af><wY`>=kYd0\"j\u0011p,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 489;
                    str = "r-'c\u0015p&cl\u0015q:ch\u001bn;+|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 490;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 491;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c<%{\u0004/+'c\u0011q+/c\u0004\">-m\u001bw1:@\u0015o:n~\u0015q,+jTk,n`\u0001n3`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 492;
                    str = "e;<g\u0002g\u0000\"o\u0007v\u0000={\u0017a:=}\u0012w3\u0011l\u0015a4;~+v6#k\u0007v>#~N";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 493;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c<%{\u0004/+'c\u0011q+/c\u0004\"* o\u0016n:nz\u001b\";+b\u0011v:na\u0018f\u007f%k\r\"8*|\u001dt:\u0011b\u0015q+\u0011}\u0001a<+}\u0007d*\"Q\u0016c<%{\u0004]+'c\u0011q+/c\u0004.\u007f:f\u001dq\u007f+|\u0006m-nm\u0015l\u007f,kTk8 a\u0006g;`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 494;
                    str = "e;<g\u0002g\u0000\"o\u0007v\u0000={\u0017a:=}\u0012w3\u0011l\u0015a4;~+v6#k\u0007v>#~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 495;
                    str = "e;<g\u0002g\u0000\"o\u0007v\u0000={\u0017a:=}\u0012w3\u0011l\u0015a4;~+v6#k\u0007v>#~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 496;
                    str = "e;<g\u0002gr=k\u0006t6-k[a7/`\u0013gr {\u0019`:<!\u0012c6\"k\u0010/+!#\u0012g+-fYc*:fYv0%k\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 497;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 498;
                    str = "e;<g\u0002gr=k\u0006t6-k[a7/`\u0013gr {\u0019`:<.\u0016c,+.\u0012m3*k\u0006\"1!zTd0;`\u0010\"9!|T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 499;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 500;
                    str = "e;<g\u0002gr=k\u0006t6-k[a7/`\u0013gr {\u0019`:<.\u0016c,+.\u0012m3*k\u0006%,n|\u0011q\u0016*.\u001am+nh\u001bw1*.\u0012m-n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 501;
                    str = "e;<g\u0002gr=k\u0006t6-k[a7/`\u0013gr {\u0019`:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 502;
                    str = "\"-+z\u0001p1+jTl*\"bX\"* k\fr:-z\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 503;
                    str = "e;<g\u0002gr=k\u0006t6-k[a7/`\u0013gr {\u0019`:<.\u0012g+-f\u001dl8nb\u001dq+na\u0012\"9'b\u0011q\u007f9g\u0000j\u007f o\u0019g\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 504;
                    str = "e;<g\u0002gr=k\u0006t6-k[d::m\u001c/+!e\u0011l";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 505;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0012k3+}Yk1ch\u001bn;+|[f:\"k\u0000g;cj\u0001p6 iYq</`T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 506;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0012k3+}Yk1ch\u001bn;+|[f:\"k\u0000g;cj\u0001p6 iYq</`T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 507;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0012k3+}Yk1ch\u001bn;+|[v6#k\u001bw+n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 508;
                    str = "`>-e\u0001rr\"a\u0017i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 509;
                    str = "u6(g";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 510;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:\"k\u0000gr(g\u0018g,a}\u0001a<+}\u0007-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 511;
                    str = "-1;cYd0\"j\u0011p,a}\u0011a0 j\u0015p&a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 512;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:\"k\u0000gr(g\u0018g,a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 513;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 514;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:\"k\u0000gr(g\u0018g,ah\u0015k3+jYv0ch\u0011v<&#\u0015w+&#\u0000m4+`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 515;
                    str = "\"-+z\u0001p1+jTl*\"bX\"* k\fr:-z\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 516;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 517;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:\"k\u0000gr(g\u0018g,nc5a<!{\u001av\u0011/c\u0011\"6=.\u001aw3\"\"Tl0:f\u001dl8nz\u001b\"=+.\u0010g3+z\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 518;
                    str = "-1;cYd0\"j\u0011p,a~\u0006k2/|\r-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 519;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:\"k\u0000gr(g\u0018g,nh\u0011v<&g\u001ae\u007f\"g\u0007v\u007f!hTq:-a\u001af><wT`>=kTd0\"j\u0011p,ny\u001dv7n`\u0015o:n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 520;
                    str = "\"-+z\u0001p1+jTl*\"bX\"* k\fr:-z\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 521;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:\"k\u0000gr(g\u0018g,a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 522;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:\"k\u0000gr(g\u0018g,al\u0015q:ch\u001bn;+|Yl0:#\u0012m* j[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 523;
                    str = "c/>J\u0015v>\ba\u0018f:<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 524;
                    str = "c/>M\u001bl++`\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 525;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:\"k\u0000gr(g\u0018g,nh\u0011v<&g\u001ae\u007f\"g\u0007v\u007f!hTr-'c\u0015p&nl\u0015q:nh\u001bn;+|\u0007\"('z\u001c\"1/c\u0011\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 526;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0012k3+}Yv0cl\u0011/;!y\u001an0/j\u0011f\u007f9o\u001dv6 iTd0<.\u0015n3nh\u001dn:=.\u0000m\u007f,kTr-!m\u0011q,+jZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 527;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0012k3+}Yv0cl\u0011/;!y\u001an0/j\u0011f\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 528;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0012k3+}Yv0cl\u0011/;!y\u001an0/j\u0011fp=e\u001dr/'`\u0013/1;b\u0018/;!y\u001an0/jYr>:fTp:\"o\u0000k)+.\u0004c+&4T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 529;
                    str = "e;<g\u0002gr=k\u0006t6-k[q:-a\u001af><wY`>=kYd0\"j\u0011pr o\u0019gr(a\u0006/=/m\u001fw/nO\u0004rq#kTk,n`\u0001n3b.\u0017c1izTr-!m\u0011g;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 530;
                    str = "e;<g\u0002gr=k\u0006t6-k[q:-a\u001af><wY`>=kYd0\"j\u0011pr o\u0019gr(a\u0006/=/m\u001fw/nd\u001df\u007f'}Tl*\"bX\"9/z\u0015n\u007f+|\u0006m-`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 531;
                    str = "e;<g\u0002gr=k\u0006t6-k[c,=a\u0017k>:kYq:-a\u001af><wYu6:fYr-'c\u0015p&ai\u001bm8\"kYf-'x\u0011/6=#\u0012w3\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 532;
                    str = "\",+m\u001bl;/|\r8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 533;
                    str = "-,+m\u001bl;/|\r8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 534;
                    str = "-9/g\u0018g;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 535;
                    str = "e;<g\u0002gr=k\u0006t6-k[c,=a\u0017k>:kYq:-a\u001af><wYu6:fYr-'c\u0015p&n~\u0006k2/|\r8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 536;
                    str = "e;<g\u0002gr=k\u0006t6-k[c,=a\u0017k>:kYq:-a\u001af><wYu6:fYr-'c\u0015p&ah\u0015k3+j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 537;
                    str = "e;<g\u0002gr=k\u0006t6-k[c,=a\u0017k>:kYq:-a\u001af><wYu6:fYr-'c\u0015p&a~\u0006k2/|\r8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 538;
                    str = "\";!k\u0007\"1!zTg''}\u0000,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 539;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f\"a\u001bi6 iTd0<.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 540;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rp-o\u001aa:\"b\u0011f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 541;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 542;
                    str = "\";!k\u0007\"1!zTg''}\u0000.\u007f#o\r\"=+.\u0001q:<.\u0010g3+z\u0011f\u007f'zTm-nb\u001ba>\".\u0016c<%{\u0004\"6=.\u0006w1 g\u001ae`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 543;
                    str = "D6\"kT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 544;
                    str = "W1+v\u0004g<:k\u0010\"9/g\u0018w-+4T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 545;
                    str = "o0;`\u0000g;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 546;
                    str = "k1:k\u0006d>-k+e;<g\u0002g\u0000,o\u0017i*>Q\u001ag+9a\u0006i\u0000=k\u0000v6 i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 547;
                    str = "e;<g\u0002gr=k\u0006t6-k[e::#\u0016c<%{\u0004/1+z\u0003m-%#\u0007g+:g\u001ae,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 548;
                    str = "\",;m\u0017g,=g\u0002g\u007f,o\u0017i*>}Tj>8kTd>'b\u0011fsnz\u001ck,ng\u0007\"/<a\u0016c=\"wTw1;}\u0001c3`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 549;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 550;
                    str = "e;<g\u0002gr=k\u0006t6-k[q<<{\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 551;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 552;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 553;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~[d0<m\u0011/=/m\u001fw/ca\u0002g-cm\u0011n3;b\u0015pp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 554;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 555;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 556;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~[v0:o\u0018/-+\u007f\u0001g,:}Yk1cl\u0015a4;~Yq:=}\u001dm1a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 557;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 558;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 559;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 560;
                    str = "e;<g\u0002gr=k\u0006t6-k[j> j\u0018gr'`\u0000g1:!\u0015w+&#\u0012c6\"k\u0010-* e\u001am( #\u0017c*=k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 561;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 562;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 563;
                    str = "e;<g\u0002gr=k\u0006t6-k[d::m\u001c/+!e\u0011lp k\u0000u0<eYd>'b\u0001p:co\u0000/+!e\u0011lr(k\u0000a7c}\u0000c8+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 564;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 565;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 566;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 567;
                    str = "e;<g\u0002gr=k\u0006t6-k[r:<h\u001bp2cl\u0015a4;~T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 568;
                    str = "e;<g\u0002g\u0000;}\u0011p\u0000'`\u001dv6/z\u0011f\u0000,o\u0017i*>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 569;
                    str = "k1-a\u0019r3+z\u0011]=/m\u001fw/\u0011c\u0015p4+|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 570;
                    str = "e;<g\u0002gr=k\u0006t6-k[k1=k\u0006vr'`\u0017m2>b\u0011v:cl\u0015a4;~Yk1*g\u0017c+!|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 571;
                    str = "/6 x\u001dq6,b\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 572;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0007g<!`\u0010c-7#\u0016c,+#\u0012m3*k\u0006\"2\u001dk\u0017m1*o\u0006{\u001d/}\u0011D0\"j\u0011p\u007f'}Tl0:.\u001aw3\".\u0015l;noTl:9.\u0016c,+H\u001bn;+|Tk,nl\u0011k1).\u0015q,'i\u001ag;b.\u0000j6=.\u001dq\u007f;`\u0011z/+m\u0000g;n&\u0000j0;i\u001c\"1!zTd>:o\u0018+q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 573;
                    str = "e;<g\u0002gr=k\u0006t6-k[w/\"a\u0015fp={\u0017a:=}Te;<g\u0002g\u007f(g\u0018g\u007f#o\u0004\"6=.\u001aw3\"\"Tf6*.\u0016c<%{\u0004\"9/g\u0018\">\"|\u0011c;71";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 574;
                    str = "\"-+}=fen";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 575;
                    str = "e;<g\u0002gr=k\u0006t6-k[w/\"a\u0015f\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 576;
                    str = "e;<g\u0002gr=k\u0006t6-k[w/\"a\u0015fr(g\u0018gp:a\u001b/2/`\r/9/g\u0018w-+}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 577;
                    str = "e;<g\u0002gr=k\u0006t6-k[w/\"a\u0015fp={\u0017a:=}T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 578;
                    str = "\",'t\u00118\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 579;
                    str = "e;<g\u0002gr=k\u0006t6-k[w/\"a\u0015fp={\u0017a:=}Te;<g\u0002g\u007f(g\u0018g\u007f#o\u0004\"6=.\u001aw3\"\"Tl0:g\u0012{\u007f,o\u0017i*>.\u0004p0)|\u0011q,n}\u0001r/<k\u0007q:*4T';a+\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 580;
                    str = "e;<g\u0002g\u0000'`\u0017n**k+t6*k\u001bq\u0000'`+`>-e\u0001r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 581;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:=z\u0006m&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 582;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f9o\u001dv6 iTd0<.\u0016c<%{\u0004\"+!.\u0012k1'}\u001c,q`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 583;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f,o\u0017i*>.\u0012c6\"k\u0010,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 584;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f>|\u001do><wT`>=kTd0\"j\u0011p\u007f'jTk,n`\u0001n3b.\u0015`0<z\u001dl8nl\u0015a4;~Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 585;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rp(g\u0018g,a}\u0001a<+}\u0007d*\"\"Tl09.\u0016c<%g\u001ae\u007f;~Te;<g\u0002g\u0000(g\u0018g\u0000#o\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 586;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rp-o\u001aa:\"b\u0011f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 587;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f;`\u0015`3+.\u0000m\u007f'`\u0007g-:.\u001dl<!c\u0004n::kT`>-e\u0001r\u007f'`\u0010k</z\u001bp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 588;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 589;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f,o\u0017i*>.\u0012k1'}\u001cg;`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 590;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f(g\u001af6 iTd6\"k\u0007V0\fk!r3!o\u0010g;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 591;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f(o\u001dn:*.\u0000m\u007f)k\u001ag-/z\u0011\"3'}\u0000\"0(.\u0012k3+}Tv0nl\u0011\"*>b\u001bc;+jZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 592;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f;`\u0015`3+.\u0000m\u007f-|\u0011c++.\u0007g<!`\u0010c-7.\u0016c,+.\u0012m3*k\u0006,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 593;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rp:a\u0000c3c}\u001dx:a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 594;
                    str = "e;<g\u0002gr=k\u0006t6-k[d6\"k\u0007/+!#\u0016gr;~\u0018m>*k\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 595;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f)j\u0006k)+Q\u0012k3+Q\u0019c/nl\u0015a4;~Tq*-m\u0011q,({\u0018,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 596;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f)j\u0006k)+Q\u0012k3+Q\u0019c/nl\u0015a4;~Td>'b\u0011fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 597;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f-o\u0018a*\"o\u0000k1).\u0000m+/bT`>-e\u0001r\u007f=g\u000eg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 598;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rp(g\u0018g,cz\u001b/=+#\u0001r3!o\u0010g;am\u001bw1:!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 599;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001rp-f\u0015vr*o\u0000c=/}\u0011/1!zYw/\"a\u0015f:*!\u0017c1-k\u0018/=/m\u001fw/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 600;
                    str = "e;<g\u0002gr=k\u0006t6-k[`>-e\u0001r\u007f=z\u0015p+'`\u0013\"6 g\u0000E;<g\u0002g\u0019'b\u0011O>>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 601;
                    str = "D6\"kT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 602;
                    str = "\"1!zT`>-e\u0011f\u007f;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 603;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0011p-!|[w1+v\u0004g<:k\u0010/,+|\u0002k<+#\u0007v><zYc<:g\u001blp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 604;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0011p-!|[k1:k\u001avr'}Yl*\"bTc1*.\u001am+&g\u001ae\u007f'}Tr: j\u001dl8n&\u0004p0,o\u0016n&nl\u0015a4;~Tc+:k\u0019r+nh\u0015k3+j]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 605;
                    str = "e;<g\u0002g\u0000+|\u0006m-\u0011m\u001bf:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 606;
                    str = "c<:g\u001bl\u0000<k\u0007v0<k+o:*g\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 607;
                    str = "c<:g\u001bl\u0000,o\u0017i*>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 608;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0011p-!|[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 609;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0011p-!|[w1/l\u0018gr:aYq>8kYv0c}\u001cc-+jYr-+h\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 610;
                    str = "c<:g\u001bl\u0000<k\u0007v0<k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 611;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:\"k\u0000gr(a\u0018f:<.\u0007w<-k\u0007q9;b\u0018{\u007f*k\u0018g++jTd0\"j\u0011p\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 612;
                    str = "e;<g\u0002gr=k\u0006t6-k[f:\"k\u0000gr(a\u0018f:<!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 613;
                    str = "\"> jTc3\".\u0012k3+}Tk1=g\u0010g\u007f'zZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 614;
                    str = "ok8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 615;
                    str = "o/+i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 616;
                    str = "m/;}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 617;
                    str = "m88";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 618;
                    str = "u>8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 619;
                    str = "c)'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 620;
                    str = "f0-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 621;
                    str = "r;(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 622;
                    str = "v':";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 623;
                    str = "r1)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 624;
                    str = "o/)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 625;
                    str = "18|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 626;
                    str = "o/}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 627;
                    str = "ok/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 628;
                    str = "f0-v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 629;
                    str = "c2<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 630;
                    str = "s<>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 631;
                    str = "u2/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 632;
                    str = "z3=v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 633;
                    str = "o/)o";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 634;
                    str = "r/:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 635;
                    str = "z3=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 636;
                    str = "m8/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 637;
                    str = "d38";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 638;
                    str = "h/+i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 639;
                    str = "h/)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 640;
                    str = "e6(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 641;
                    str = "c>-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 642;
                    str = "a>(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 643;
                    str = "m8)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 644;
                    str = "c,(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 645;
                    str = "r/:v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 646;
                    str = "18>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 647;
                    str = "u:,c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 648;
                    str = "o/z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 649;
                    str = "p+(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 650;
                    str = "18>~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 651;
                    str = "18/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 652;
                    str = "o08";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 653;
                    str = "u28";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    bb = strArr3;
                    J = GoogleDriveService.class.getCanonicalName();
                    Q = new File[]{dg.k(), dg.c(), dg.e(), dg.i(), dg.d(), dg.f()};
                    w = new TreeSet(Arrays.asList(new String[]{bb[639], bb[640], bb[623], bb[626], bb[629], bb[642], bb[630], bb[631], bb[641], bb[618], bb[648], bb[652], bb[646], bb[653], bb[651], bb[647], bb[617], bb[616], bb[636], bb[637], bb[619], bb[624], bb[650], bb[625], bb[627], bb[614], bb[633], bb[644], bb[621], bb[628], bb[645], bb[632], bb[620], bb[634], bb[635], bb[622], bb[649], bb[643], bb[638], bb[615]}));
                    F = true;
                    af = new ConditionVariable(false);
                    I = new ConditionVariable(false);
                    x = new ConditionVariable(false);
                    ai = false;
                    ag = false;
                    K = false;
                    m = new ConditionVariable(false);
                    ad = new ConditionVariable(false);
                    an = new ConditionVariable(false);
                    s = new ConditionVariable(false);
                    S = false;
                    E = false;
                    ac = false;
                    ah = false;
                    X = 0;
                    u = 0;
                    G = false;
                    aa = false;
                    l = new AtomicBoolean(false);
                    C = new AtomicBoolean(false);
                    f = new AtomicBoolean(false);
                    ab = new dc();
                    V = new bk();
                    v = new bv();
                    W = new ax();
                    p = new bl();
                    return;
                default:
                    strArr2[i] = str;
                    str = "e;<g\u0002gr=k\u0006t6-k[q::#\u0016c<%{\u0004/9<k\u0005\"* o\u0016n:nz\u001b\"<!c\u0019k+";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(@android.support.annotation.NonNull java.util.List r14, @android.support.annotation.NonNull java.io.File r15) {
        /*
        r13 = this;
        r9 = c;
        r10 = new java.util.ArrayList;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r10.<init>(r0);
        r0 = com.whatsapp.App.aO();	 Catch:{ IOException -> 0x0015 }
        if (r0 != 0) goto L_0x0017;
    L_0x000f:
        r0 = new com.whatsapp.gdrive.ez;	 Catch:{ IOException -> 0x0015 }
        r0.<init>();	 Catch:{ IOException -> 0x0015 }
        throw r0;	 Catch:{ IOException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r0 = r13.a(r10, r15);	 Catch:{ IOException -> 0x001f }
        if (r0 != 0) goto L_0x0021;
    L_0x001d:
        r0 = 0;
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = move-exception;
        throw r0;
    L_0x0021:
        r0 = com.whatsapp.App.am;
        r1 = 3;
        if (r0 != r1) goto L_0x0026;
    L_0x0026:
        r3 = new java.util.concurrent.atomic.AtomicReference;
        r0 = 0;
        r3.<init>(r0);
        r6 = new java.util.concurrent.CountDownLatch;
        r0 = r10.size();
        r6.<init>(r0);
        r11 = new java.util.concurrent.atomic.AtomicBoolean;
        r0 = 1;
        r11.<init>(r0);
        r0 = r10.size();	 Catch:{ IOException -> 0x005c }
        r1 = 100;
        if (r0 <= r1) goto L_0x005e;
    L_0x0043:
        r0 = r10.size();	 Catch:{ IOException -> 0x005c }
        r0 = r0 / 100;
        r7 = r0;
    L_0x004a:
        r0 = 0;
        r8 = r0;
    L_0x004c:
        r0 = r10.size();
        if (r8 >= r0) goto L_0x00cb;
    L_0x0052:
        r0 = r13.N;	 Catch:{ IOException -> 0x0061 }
        r0 = r0.a();	 Catch:{ IOException -> 0x0061 }
        if (r0 != 0) goto L_0x0063;
    L_0x005a:
        r0 = 0;
        goto L_0x001e;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = 1;
        r7 = r0;
        goto L_0x004a;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r2 = r10.get(r8);
        r2 = (java.io.File) r2;
        r0 = r2.exists();	 Catch:{ IOException -> 0x00df }
        if (r0 == 0) goto L_0x00e3;
    L_0x006f:
        r0 = r2.length();	 Catch:{ IOException -> 0x00df }
        r4 = 0;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x00e3;
    L_0x0079:
        r0 = 1;
    L_0x007a:
        r1 = com.whatsapp.dg.d(r2);	 Catch:{ IOException -> 0x00e5 }
    L_0x007e:
        if (r1 == 0) goto L_0x0085;
    L_0x0080:
        r1 = a(r2);
        r0 = r0 & r1;
    L_0x0085:
        if (r0 == 0) goto L_0x0098;
    L_0x0087:
        r0 = r8 % r7;
        if (r0 != 0) goto L_0x0107;
    L_0x008b:
        r5 = 1;
    L_0x008c:
        r0 = new com.whatsapp.gdrive.am;	 Catch:{ IOException -> 0x0109 }
        r1 = r13;
        r4 = r14;
        r0.<init>(r1, r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x0109 }
        com.whatsapp.gdrive.c0.a(r0);	 Catch:{ IOException -> 0x0109 }
        if (r9 == 0) goto L_0x00c7;
    L_0x0098:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0109 }
        r0.<init>();	 Catch:{ IOException -> 0x0109 }
        r1 = bb;	 Catch:{ IOException -> 0x0109 }
        r4 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0109 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0109 }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x0109 }
        r1 = bb;	 Catch:{ IOException -> 0x0109 }
        r4 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0109 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0109 }
        r4 = r2.length();	 Catch:{ IOException -> 0x0109 }
        r0 = r0.append(r4);	 Catch:{ IOException -> 0x0109 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0109 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0109 }
        r6.countDown();	 Catch:{ IOException -> 0x0109 }
    L_0x00c7:
        r0 = r8 + 1;
        if (r9 == 0) goto L_0x011c;
    L_0x00cb:
        r6.await();	 Catch:{ InterruptedException -> 0x010b }
    L_0x00ce:
        r0 = r3.get();
        r0 = (com.whatsapp.gdrive.eo) r0;
        if (r0 == 0) goto L_0x0116;
    L_0x00d6:
        r1 = r0 instanceof com.whatsapp.gdrive.ez;	 Catch:{ IOException -> 0x00dd }
        if (r1 == 0) goto L_0x0110;
    L_0x00da:
        r0 = (com.whatsapp.gdrive.ez) r0;	 Catch:{ IOException -> 0x00dd }
        throw r0;	 Catch:{ IOException -> 0x00dd }
    L_0x00dd:
        r0 = move-exception;
        throw r0;
    L_0x00df:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e1 }
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r0 = 0;
        goto L_0x007a;
    L_0x00e5:
        r1 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = bb;
        r12 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r5 = r5[r12];
        r4 = r4.append(r5);
        r4 = r4.append(r2);
        r4 = r4.toString();
        com.whatsapp.util.Log.b(r4, r1);
        r1 = 0;
        goto L_0x007e;
    L_0x0103:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0105 }
    L_0x0105:
        r0 = move-exception;
        throw r0;
    L_0x0107:
        r5 = 0;
        goto L_0x008c;
    L_0x0109:
        r0 = move-exception;
        throw r0;
    L_0x010b:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x00ce;
    L_0x0110:
        r1 = new java.lang.IllegalStateException;
        r1.<init>(r0);
        throw r1;
    L_0x0116:
        r0 = r11.get();
        goto L_0x001e;
    L_0x011c:
        r8 = r0;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.b(java.util.List, java.io.File):boolean");
    }

    static void e(long j) {
        a(j);
    }

    static String d(@NonNull Context context) {
        return a(context);
    }

    static boolean e(int i) {
        if (!(i == 0 || i == 1)) {
            Log.e(bb[363] + i);
            i = 0;
        }
        Editor edit = S().edit();
        try {
            edit.putString(bb[364], String.valueOf(i));
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[365]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static boolean m() {
        try {
            return ag() == 3;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static boolean h(GoogleDriveService googleDriveService) {
        return googleDriveService.a;
    }

    @NonNull
    private static String j(@NonNull String str) {
        try {
            if (!str.equals(bb[91])) {
                if (!str.equals(bb[93])) {
                    try {
                        if (!str.equals(bb[90])) {
                            try {
                                if (!str.equals(bb[94])) {
                                    try {
                                        if (!str.equals(bb[92])) {
                                            return str;
                                        }
                                    } catch (NullPointerException e) {
                                        throw e;
                                    }
                                }
                            } catch (NullPointerException e2) {
                                throw e2;
                            }
                        }
                    } catch (NullPointerException e22) {
                        throw e22;
                    }
                }
            }
            return azx.e;
        } catch (NullPointerException e222) {
            throw e222;
        } catch (NullPointerException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.whatsapp.gdrive.fs c(@android.support.annotation.NonNull java.lang.String r12, @android.support.annotation.NonNull com.whatsapp.gdrive.bs r13) {
        /*
        r11 = this;
        r7 = c;
        r0 = bb;	 Catch:{ ee -> 0x001d }
        r1 = 347; // 0x15b float:4.86E-43 double:1.714E-321;
        r0 = r0[r1];	 Catch:{ ee -> 0x001d }
        r0 = r12.equals(r0);	 Catch:{ ee -> 0x001d }
        if (r0 == 0) goto L_0x001f;
    L_0x000e:
        r2 = r11.z;	 Catch:{ ee -> 0x001d }
    L_0x0010:
        if (r2 != 0) goto L_0x0024;
    L_0x0012:
        r0 = bb;	 Catch:{ ee -> 0x0022 }
        r1 = 348; // 0x15c float:4.88E-43 double:1.72E-321;
        r0 = r0[r1];	 Catch:{ ee -> 0x0022 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x0022 }
        r0 = 0;
    L_0x001c:
        return r0;
    L_0x001d:
        r0 = move-exception;
        throw r0;
    L_0x001f:
        r2 = r11.y;
        goto L_0x0010;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r6 = 0;
        r0 = r13.a();	 Catch:{ ee -> 0x002d }
        if (r0 != 0) goto L_0x002f;
    L_0x002b:
        r0 = 0;
        goto L_0x001c;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = r11.L;
        r5 = 1;
        r1 = r12;
        r3 = r12;
        r4 = r13;
        r3 = r0.a(r1, r2, r3, r4, r5);
        if (r3 != 0) goto L_0x0048;
    L_0x003b:
        r0 = bb;	 Catch:{ ee -> 0x0046 }
        r1 = 341; // 0x155 float:4.78E-43 double:1.685E-321;
        r0 = r0[r1];	 Catch:{ ee -> 0x0046 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x0046 }
        r0 = 0;
        goto L_0x001c;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = bb;	 Catch:{ ee -> 0x00d8 }
        r1 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        r0 = r0[r1];	 Catch:{ ee -> 0x00d8 }
        r0 = r12.equals(r0);	 Catch:{ ee -> 0x00d8 }
        if (r0 == 0) goto L_0x0058;
    L_0x0054:
        r11.B = r3;	 Catch:{ ee -> 0x00d8 }
        if (r7 == 0) goto L_0x0066;
    L_0x0058:
        r0 = bb;	 Catch:{ ee -> 0x00da }
        r1 = 332; // 0x14c float:4.65E-43 double:1.64E-321;
        r0 = r0[r1];	 Catch:{ ee -> 0x00da }
        r0 = r12.equals(r0);	 Catch:{ ee -> 0x00da }
        if (r0 == 0) goto L_0x0066;
    L_0x0064:
        r11.j = r3;	 Catch:{ ee -> 0x00dc }
    L_0x0066:
        r0 = r3.size();	 Catch:{ ee -> 0x00de }
        if (r0 != 0) goto L_0x0281;
    L_0x006c:
        r0 = bb;	 Catch:{ ee -> 0x00de }
        r1 = 342; // 0x156 float:4.79E-43 double:1.69E-321;
        r0 = r0[r1];	 Catch:{ ee -> 0x00de }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x00de }
        r0 = bb;	 Catch:{ ee -> 0x00de }
        r1 = 349; // 0x15d float:4.89E-43 double:1.724E-321;
        r0 = r0[r1];	 Catch:{ ee -> 0x00de }
        r0 = r12.equals(r0);	 Catch:{ ee -> 0x00de }
        if (r0 == 0) goto L_0x00ea;
    L_0x0081:
        r0 = r11.aa();	 Catch:{ ee -> 0x00e0 }
        if (r0 == 0) goto L_0x00ea;
    L_0x0087:
        r0 = r11.L;
        r5 = 1;
        r1 = r12;
        r3 = r12;
        r4 = r13;
        r1 = r0.a(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x00e6;
    L_0x0093:
        r0 = r1.size();	 Catch:{ ee -> 0x00e2 }
        if (r0 <= 0) goto L_0x00e6;
    L_0x0099:
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ ee -> 0x00e4 }
        r0 = (com.whatsapp.gdrive.fs) r0;	 Catch:{ ee -> 0x00e4 }
    L_0x00a0:
        r2 = bb;	 Catch:{ ee -> 0x00e8 }
        r3 = 343; // 0x157 float:4.8E-43 double:1.695E-321;
        r2 = r2[r3];	 Catch:{ ee -> 0x00e8 }
        r2 = r12.equals(r2);	 Catch:{ ee -> 0x00e8 }
        if (r2 == 0) goto L_0x00ae;
    L_0x00ac:
        r11.B = r1;	 Catch:{ ee -> 0x00e8 }
    L_0x00ae:
        if (r0 == 0) goto L_0x01e9;
    L_0x00b0:
        r1 = bb;	 Catch:{ ee -> 0x01dc }
        r2 = 333; // 0x14d float:4.67E-43 double:1.645E-321;
        r1 = r1[r2];	 Catch:{ ee -> 0x01dc }
        r1 = r12.equals(r1);	 Catch:{ ee -> 0x01dc }
        if (r1 == 0) goto L_0x001c;
    L_0x00bc:
        r1 = r11.a(r13);	 Catch:{ ee -> 0x01de }
        if (r1 == 0) goto L_0x001c;
    L_0x00c2:
        r1 = r11.b(r13);	 Catch:{ NullPointerException -> 0x01e0 }
        r1 = r11.a(r1, r0, r13);	 Catch:{ NullPointerException -> 0x01e0 }
        if (r1 != 0) goto L_0x001c;
    L_0x00cc:
        r0 = bb;	 Catch:{ ee -> 0x01e2 }
        r1 = 353; // 0x161 float:4.95E-43 double:1.744E-321;
        r0 = r0[r1];	 Catch:{ ee -> 0x01e2 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x01e2 }
        r0 = 0;
        goto L_0x001c;
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        throw r0;
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = 0;
        goto L_0x00a0;
    L_0x00e8:
        r0 = move-exception;
        throw r0;
    L_0x00ea:
        r0 = 0;
        if (r7 == 0) goto L_0x00ae;
    L_0x00ed:
        r2 = r0;
    L_0x00ee:
        r0 = r3.size();	 Catch:{ ee -> 0x00fd }
        r1 = 1;
        if (r0 != r1) goto L_0x00ff;
    L_0x00f5:
        r0 = 0;
        r0 = r3.get(r0);
        r0 = (com.whatsapp.gdrive.fs) r0;
        goto L_0x00ae;
    L_0x00fd:
        r0 = move-exception;
        throw r0;
    L_0x00ff:
        r0 = bb;
        r1 = 345; // 0x159 float:4.83E-43 double:1.705E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = bb;
        r1 = 335; // 0x14f float:4.7E-43 double:1.655E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r1 = -1;
        r0 = 0;
        r5 = r3.iterator();
        r3 = r2;
        r2 = r1;
        r1 = r0;
    L_0x011a:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0279;
    L_0x0120:
        r0 = r5.next();
        r0 = (com.whatsapp.gdrive.fs) r0;
        r4 = r11.L;
        r6 = r0.g();
        r4 = r4.a(r6, r13);
        if (r4 != 0) goto L_0x015d;
    L_0x0132:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r6 = bb;
        r8 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r6 = r6[r8];
        r1 = r1.append(r6);
        r6 = r0.g();
        r1 = r1.append(r6);
        r6 = bb;
        r8 = 351; // 0x15f float:4.92E-43 double:1.734E-321;
        r6 = r6[r8];
        r1 = r1.append(r6);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        r1 = 1;
        if (r7 == 0) goto L_0x0279;
    L_0x015d:
        r4 = r4.size();
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r8 = bb;
        r9 = 352; // 0x160 float:4.93E-43 double:1.74E-321;
        r8 = r8[r9];
        r6 = r6.append(r8);
        r8 = r0.g();
        r6 = r6.append(r8);
        r8 = bb;
        r9 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r8 = r8[r9];
        r6 = r6.append(r8);
        r6 = r6.append(r4);
        r6 = r6.toString();
        com.whatsapp.util.Log.i(r6);
        if (r4 <= r2) goto L_0x0275;
    L_0x018f:
        r2 = r0;
        r0 = r4;
    L_0x0191:
        if (r7 == 0) goto L_0x027d;
    L_0x0193:
        r10 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r10;
    L_0x0197:
        if (r0 == 0) goto L_0x01a7;
    L_0x0199:
        r0 = bb;	 Catch:{ ee -> 0x01a5 }
        r1 = 350; // 0x15e float:4.9E-43 double:1.73E-321;
        r0 = r0[r1];	 Catch:{ ee -> 0x01a5 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x01a5 }
        r0 = 0;
        goto L_0x001c;
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x01d8 }
        r0.<init>();	 Catch:{ ee -> 0x01d8 }
        r3 = bb;	 Catch:{ ee -> 0x01d8 }
        r4 = 340; // 0x154 float:4.76E-43 double:1.68E-321;
        r3 = r3[r4];	 Catch:{ ee -> 0x01d8 }
        r3 = r0.append(r3);	 Catch:{ ee -> 0x01d8 }
        if (r1 == 0) goto L_0x01da;
    L_0x01b8:
        r0 = r1.g();	 Catch:{ ee -> 0x01d8 }
    L_0x01bc:
        r0 = r3.append(r0);
        r3 = bb;
        r4 = 336; // 0x150 float:4.71E-43 double:1.66E-321;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r1;
        goto L_0x00ae;
    L_0x01d8:
        r0 = move-exception;
        throw r0;
    L_0x01da:
        r0 = 0;
        goto L_0x01bc;
    L_0x01dc:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x01de }
    L_0x01de:
        r0 = move-exception;
        throw r0;
    L_0x01e0:
        r0 = move-exception;
        throw r0;
    L_0x01e2:
        r0 = move-exception;
        r1 = new com.whatsapp.gdrive.ew;
        r1.<init>(r0);
        throw r1;
    L_0x01e9:
        r0 = -1;
        r1 = r12.hashCode();	 Catch:{ ee -> 0x022e }
        switch(r1) {
            case -1914506823: goto L_0x0220;
            case 2084035352: goto L_0x0211;
            default: goto L_0x01f1;
        };
    L_0x01f1:
        switch(r0) {
            case 0: goto L_0x0232;
            case 1: goto L_0x0241;
            default: goto L_0x01f4;
        };
    L_0x01f4:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 344; // 0x158 float:4.82E-43 double:1.7E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r12);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0211:
        r1 = bb;	 Catch:{ ee -> 0x022e }
        r2 = 337; // 0x151 float:4.72E-43 double:1.665E-321;
        r1 = r1[r2];	 Catch:{ ee -> 0x022e }
        r1 = r12.equals(r1);	 Catch:{ ee -> 0x022e }
        if (r1 == 0) goto L_0x01f1;
    L_0x021d:
        r0 = 0;
        if (r7 == 0) goto L_0x01f1;
    L_0x0220:
        r1 = bb;	 Catch:{ ee -> 0x0230 }
        r2 = 331; // 0x14b float:4.64E-43 double:1.635E-321;
        r1 = r1[r2];	 Catch:{ ee -> 0x0230 }
        r1 = r12.equals(r1);	 Catch:{ ee -> 0x0230 }
        if (r1 == 0) goto L_0x01f1;
    L_0x022c:
        r0 = 1;
        goto L_0x01f1;
    L_0x022e:
        r0 = move-exception;
        throw r0;
    L_0x0230:
        r0 = move-exception;
        throw r0;
    L_0x0232:
        r0 = r11.d(r13);	 Catch:{ ee -> 0x023c }
        if (r0 == 0) goto L_0x023e;
    L_0x0238:
        r0 = r11.g;	 Catch:{ ee -> 0x023c }
        goto L_0x001c;
    L_0x023c:
        r0 = move-exception;
        throw r0;
    L_0x023e:
        r0 = 0;
        goto L_0x001c;
    L_0x0241:
        r0 = r11.al;	 Catch:{ ee -> 0x025b }
        if (r0 == 0) goto L_0x024d;
    L_0x0245:
        r0 = r11.al;	 Catch:{ ee -> 0x025d }
        r0 = r0.i();	 Catch:{ ee -> 0x025d }
        if (r0 > 0) goto L_0x0266;
    L_0x024d:
        r0 = r11.a();	 Catch:{ ee -> 0x025f }
        if (r0 == 0) goto L_0x0263;
    L_0x0253:
        r0 = r11.h;	 Catch:{ ee -> 0x0261 }
        if (r0 == 0) goto L_0x0263;
    L_0x0257:
        r0 = r11.h;	 Catch:{ ee -> 0x0261 }
        goto L_0x001c;
    L_0x025b:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x025d }
    L_0x025d:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x025f }
    L_0x025f:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0261 }
    L_0x0261:
        r0 = move-exception;
        throw r0;
    L_0x0263:
        r0 = 0;
        goto L_0x001c;
    L_0x0266:
        r0 = bb;
        r1 = 346; // 0x15a float:4.85E-43 double:1.71E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        java.lang.Thread.dumpStack();
        r0 = 0;
        goto L_0x001c;
    L_0x0275:
        r0 = r2;
        r2 = r3;
        goto L_0x0191;
    L_0x0279:
        r0 = r1;
        r1 = r3;
        goto L_0x0197;
    L_0x027d:
        r3 = r2;
        r2 = r0;
        goto L_0x011a;
    L_0x0281:
        r2 = r6;
        goto L_0x00ee;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.c(java.lang.String, com.whatsapp.gdrive.bs):com.whatsapp.gdrive.fs");
    }

    private static int av() {
        int i = 0;
        try {
            i = Integer.parseInt(S().getString(bb[40], String.valueOf(0)));
        } catch (Throwable e) {
            Log.b(bb[41], e);
        }
        return i;
    }

    private static void i() {
        Intent intent = new Intent(App.z(), GoogleDriveService.class);
        intent.setAction(bb[23]);
        intent.putExtra(bb[24], true);
        App.z().startService(intent);
    }

    static bc m(GoogleDriveService googleDriveService) {
        return googleDriveService.L;
    }

    static AtomicLong q(GoogleDriveService googleDriveService) {
        return googleDriveService.ae;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void d(@com.whatsapp.gdrive.fk int r7) {
        /*
        r6 = this;
        r5 = 10;
        r2 = c;
        switch(r7) {
            case 10: goto L_0x00d5;
            case 11: goto L_0x00e7;
            case 12: goto L_0x00de;
            case 13: goto L_0x00f0;
            case 14: goto L_0x00f9;
            case 15: goto L_0x0114;
            case 16: goto L_0x010b;
            case 17: goto L_0x0126;
            case 18: goto L_0x011d;
            case 19: goto L_0x0102;
            case 20: goto L_0x0138;
            case 21: goto L_0x012f;
            case 22: goto L_0x014a;
            case 23: goto L_0x0141;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = com.whatsapp.fieldstats.ct.UNKNOWN_ERROR;
        r0 = r0.getCode();
        r0 = (double) r0;
    L_0x000e:
        r3 = r6.d;	 Catch:{ NullPointerException -> 0x0155 }
        if (r3 == 0) goto L_0x001a;
    L_0x0012:
        r3 = r6.d;	 Catch:{ NullPointerException -> 0x0155 }
        r4 = java.lang.Double.valueOf(r0);	 Catch:{ NullPointerException -> 0x0155 }
        r3.k = r4;	 Catch:{ NullPointerException -> 0x0155 }
    L_0x001a:
        r3 = r6.P;	 Catch:{ NullPointerException -> 0x0157 }
        if (r3 == 0) goto L_0x0026;
    L_0x001e:
        r3 = r6.P;	 Catch:{ NullPointerException -> 0x0157 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ NullPointerException -> 0x0157 }
        r3.i = r0;	 Catch:{ NullPointerException -> 0x0157 }
    L_0x0026:
        r0 = com.whatsapp.gdrive.fn.a(r7);
        if (r7 == r5) goto L_0x0046;
    L_0x002c:
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0159 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x0159 }
        r3 = bb;	 Catch:{ NullPointerException -> 0x0159 }
        r4 = 608; // 0x260 float:8.52E-43 double:3.004E-321;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x0159 }
        r1 = r1.append(r3);	 Catch:{ NullPointerException -> 0x0159 }
        r0 = r1.append(r0);	 Catch:{ NullPointerException -> 0x0159 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x0159 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x0159 }
    L_0x0046:
        r0 = S();
        r0 = r0.edit();
        r1 = bb;	 Catch:{ NullPointerException -> 0x015b }
        r3 = 605; // 0x25d float:8.48E-43 double:2.99E-321;
        r1 = r1[r3];	 Catch:{ NullPointerException -> 0x015b }
        r0.putInt(r1, r7);	 Catch:{ NullPointerException -> 0x015b }
        r0 = r0.commit();	 Catch:{ NullPointerException -> 0x015b }
        if (r0 != 0) goto L_0x0066;
    L_0x005d:
        r0 = bb;	 Catch:{ NullPointerException -> 0x015b }
        r1 = 609; // 0x261 float:8.53E-43 double:3.01E-321;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x015b }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NullPointerException -> 0x015b }
    L_0x0066:
        r0 = v();	 Catch:{ NullPointerException -> 0x015d }
        if (r0 == 0) goto L_0x0073;
    L_0x006c:
        r0 = r6.o;	 Catch:{ NullPointerException -> 0x015f }
        r0.d(r7);	 Catch:{ NullPointerException -> 0x015f }
        if (r2 == 0) goto L_0x00d4;
    L_0x0073:
        r0 = m();	 Catch:{ NullPointerException -> 0x0161 }
        if (r0 == 0) goto L_0x0080;
    L_0x0079:
        r0 = r6.o;	 Catch:{ NullPointerException -> 0x0163 }
        r0.a(r7);	 Catch:{ NullPointerException -> 0x0163 }
        if (r2 == 0) goto L_0x00d4;
    L_0x0080:
        r0 = ak();	 Catch:{ NullPointerException -> 0x0165 }
        if (r0 == 0) goto L_0x008d;
    L_0x0086:
        r0 = r6.o;	 Catch:{ NullPointerException -> 0x0167 }
        r0.b(r7);	 Catch:{ NullPointerException -> 0x0167 }
        if (r2 == 0) goto L_0x00d4;
    L_0x008d:
        r0 = r6.t;	 Catch:{ NullPointerException -> 0x0167 }
        if (r0 == 0) goto L_0x00c6;
    L_0x0091:
        r0 = r6.t;
        r1 = r0.getAction();
        r0 = -1;
        r3 = r1.hashCode();	 Catch:{ NullPointerException -> 0x0196 }
        switch(r3) {
            case -1755890518: goto L_0x0178;
            case -818191995: goto L_0x0187;
            case 1035381739: goto L_0x0169;
            default: goto L_0x009f;
        };
    L_0x009f:
        switch(r0) {
            case 0: goto L_0x019c;
            case 1: goto L_0x01a3;
            case 2: goto L_0x01aa;
            default: goto L_0x00a2;
        };
    L_0x00a2:
        if (r7 == r5) goto L_0x00c4;
    L_0x00a4:
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x01b9 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x01b9 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x01b9 }
        r3 = 603; // 0x25b float:8.45E-43 double:2.98E-321;
        r1 = r1[r3];	 Catch:{ NullPointerException -> 0x01b9 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x01b9 }
        r1 = r6.t;	 Catch:{ NullPointerException -> 0x01b9 }
        r1 = r1.getAction();	 Catch:{ NullPointerException -> 0x01b9 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x01b9 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x01b9 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x01b9 }
    L_0x00c4:
        if (r2 == 0) goto L_0x00d4;
    L_0x00c6:
        r0 = bb;	 Catch:{ NullPointerException -> 0x01bb }
        r1 = 604; // 0x25c float:8.46E-43 double:2.984E-321;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x01bb }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x01bb }
        r0 = r6.o;	 Catch:{ NullPointerException -> 0x01bb }
        r0.b(r7);	 Catch:{ NullPointerException -> 0x01bb }
    L_0x00d4:
        return;
    L_0x00d5:
        r0 = com.whatsapp.fieldstats.ct.OK;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x00de:
        r0 = com.whatsapp.fieldstats.ct.ACCOUNT_MISSING_FROM_DEVICE;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x00e7:
        r0 = com.whatsapp.fieldstats.ct.AUTH_FAILED;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x00f0:
        r0 = com.whatsapp.fieldstats.ct.REMOTE_STORAGE_IS_FULL;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x00f9:
        r0 = com.whatsapp.fieldstats.ct.BACKUP_SERVER_UNREACHABLE;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x0102:
        r0 = com.whatsapp.fieldstats.ct.BACKUP_SERVER_NOT_WORKING;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x010b:
        r0 = com.whatsapp.fieldstats.ct.MISSING_CHAT_STORE;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x0114:
        r0 = com.whatsapp.fieldstats.ct.LOCAL_STORAGE_IS_FULL;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x011d:
        r0 = com.whatsapp.fieldstats.ct.BASE_FOLDER_DOES_NOT_EXIST;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x0126:
        r0 = com.whatsapp.fieldstats.ct.FILE_NOT_FOUND;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x012f:
        r0 = com.whatsapp.fieldstats.ct.SUPPORT_SERVICE_UNAVAILABLE_ON_DEVICE;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x0138:
        r0 = com.whatsapp.fieldstats.ct.WHATSAPP_SERVER_UNREACHABLE;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x0141:
        r0 = com.whatsapp.fieldstats.ct.READ_STORAGE_PERMISSION_DENIED;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x014a:
        r0 = com.whatsapp.fieldstats.ct.UNKNOWN_ERROR;
        r0 = r0.getCode();
        r0 = (double) r0;
        if (r2 == 0) goto L_0x000e;
    L_0x0153:
        goto L_0x0007;
    L_0x0155:
        r0 = move-exception;
        throw r0;
    L_0x0157:
        r0 = move-exception;
        throw r0;
    L_0x0159:
        r0 = move-exception;
        throw r0;
    L_0x015b:
        r0 = move-exception;
        throw r0;
    L_0x015d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x015f }
    L_0x015f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0161 }
    L_0x0161:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0163 }
    L_0x0163:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0165 }
    L_0x0165:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0167 }
    L_0x0167:
        r0 = move-exception;
        throw r0;
    L_0x0169:
        r3 = bb;	 Catch:{ NullPointerException -> 0x0196 }
        r4 = 607; // 0x25f float:8.5E-43 double:3.0E-321;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x0196 }
        r3 = r1.equals(r3);	 Catch:{ NullPointerException -> 0x0196 }
        if (r3 == 0) goto L_0x009f;
    L_0x0175:
        r0 = 0;
        if (r2 == 0) goto L_0x009f;
    L_0x0178:
        r3 = bb;	 Catch:{ NullPointerException -> 0x0198 }
        r4 = 606; // 0x25e float:8.49E-43 double:2.994E-321;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x0198 }
        r3 = r1.equals(r3);	 Catch:{ NullPointerException -> 0x0198 }
        if (r3 == 0) goto L_0x009f;
    L_0x0184:
        r0 = 1;
        if (r2 == 0) goto L_0x009f;
    L_0x0187:
        r3 = bb;	 Catch:{ NullPointerException -> 0x019a }
        r4 = 610; // 0x262 float:8.55E-43 double:3.014E-321;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x019a }
        r1 = r1.equals(r3);	 Catch:{ NullPointerException -> 0x019a }
        if (r1 == 0) goto L_0x009f;
    L_0x0193:
        r0 = 2;
        goto L_0x009f;
    L_0x0196:
        r0 = move-exception;
        throw r0;
    L_0x0198:
        r0 = move-exception;
        throw r0;
    L_0x019a:
        r0 = move-exception;
        throw r0;
    L_0x019c:
        r0 = r6.o;	 Catch:{ NullPointerException -> 0x01b3 }
        r0.b(r7);	 Catch:{ NullPointerException -> 0x01b3 }
        if (r2 == 0) goto L_0x00c4;
    L_0x01a3:
        r0 = r6.o;	 Catch:{ NullPointerException -> 0x01b5 }
        r0.d(r7);	 Catch:{ NullPointerException -> 0x01b5 }
        if (r2 == 0) goto L_0x00c4;
    L_0x01aa:
        r0 = r6.o;	 Catch:{ NullPointerException -> 0x01b7 }
        r0.a(r7);	 Catch:{ NullPointerException -> 0x01b7 }
        if (r2 == 0) goto L_0x00c4;
    L_0x01b1:
        goto L_0x00a2;
    L_0x01b3:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01b5 }
    L_0x01b5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01b7 }
    L_0x01b7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01b9 }
    L_0x01b9:
        r0 = move-exception;
        throw r0;
    L_0x01bb:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.d(int):void");
    }

    static long k(GoogleDriveService googleDriveService) {
        return googleDriveService.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r12) {
        /*
        r11 = this;
        r4 = c;
        r0 = r11.o;
        r0.d();
        r0 = 1;
        f(r0);
        r0 = de.greenrobot.event.h.b();
        r1 = com.whatsapp.vr.class;
        r0 = r0.b(r1);
        r0 = (com.whatsapp.vr) r0;
        r2 = aa;
        if (r12 == 0) goto L_0x0254;
    L_0x001b:
        if (r0 == 0) goto L_0x0254;
    L_0x001d:
        r1 = r0.c();	 Catch:{ ei -> 0x0250 }
        if (r1 != 0) goto L_0x0254;
    L_0x0023:
        r1 = 1;
    L_0x0024:
        aa = r1;
        a(r0);
        r0 = aa;
        if (r2 == r0) goto L_0x002d;
    L_0x002d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 553; // 0x229 float:7.75E-43 double:2.73E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = G;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new com.whatsapp.fieldstats.aq;
        r0.<init>();
        r11.d = r0;
        r0 = r11.L;
        r0.a();
        r1 = 0;
        r0 = r11.aj;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r2 = r11.N;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r0 = r11.a(r0, r2);	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        if (r0 == 0) goto L_0x0066;
    L_0x0060:
        r1 = r11.ao();	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        if (r4 == 0) goto L_0x007f;
    L_0x0066:
        r0 = bb;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r2 = 563; // 0x233 float:7.89E-43 double:2.78E-321;
        r0 = r0[r2];	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r0 = r11.d;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r2 = com.whatsapp.fieldstats.b5.AUTH_REQUEST;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r2 = r2.getCode();	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r2 = (double) r2;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r0.b = r2;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r1 = 0;
    L_0x007f:
        if (r1 != 0) goto L_0x008c;
    L_0x0081:
        r0 = r();	 Catch:{ ei -> 0x0257, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        if (r0 == 0) goto L_0x008c;
    L_0x0087:
        r0 = 14;
        r11.d(r0);	 Catch:{ ei -> 0x0259, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
    L_0x008c:
        if (r1 == 0) goto L_0x00c3;
    L_0x008e:
        r0 = 0;
        f(r0);	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r2 = new com.whatsapp.util.ab;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r0 = bb;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r3 = 550; // 0x226 float:7.71E-43 double:2.717E-321;
        r0 = r0[r3];	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r2.<init>(r0);	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r0 = r11.o;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r0.b();	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r0 = r11.Q();	 Catch:{ all -> 0x0291 }
        if (r0 == 0) goto L_0x00ad;
    L_0x00a8:
        r3 = 10;
        r11.d(r3);	 Catch:{ ei -> 0x028f }
    L_0x00ad:
        if (r0 != 0) goto L_0x00ba;
    L_0x00af:
        r0 = r();	 Catch:{ ei -> 0x02ad }
        if (r0 == 0) goto L_0x00ba;
    L_0x00b5:
        r0 = 14;
        r11.d(r0);	 Catch:{ ei -> 0x02af }
    L_0x00ba:
        r0 = l;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r3 = 0;
        r0.set(r3);	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r2.b();	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
    L_0x00c3:
        if (r1 == 0) goto L_0x022e;
    L_0x00c5:
        r0 = r11.d;	 Catch:{ ei -> 0x033f }
        r1 = r11.al;	 Catch:{ ei -> 0x033f }
        r2 = r1.b();	 Catch:{ ei -> 0x033f }
        r2 = (double) r2;	 Catch:{ ei -> 0x033f }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x033f }
        r0.i = r1;	 Catch:{ ei -> 0x033f }
        r0 = r11.d;	 Catch:{ ei -> 0x033f }
        r1 = r11.al;	 Catch:{ ei -> 0x033f }
        r2 = r1.l();	 Catch:{ ei -> 0x033f }
        r2 = (double) r2;	 Catch:{ ei -> 0x033f }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x033f }
        r0.c = r1;	 Catch:{ ei -> 0x033f }
        r0 = r11.d;	 Catch:{ ei -> 0x033f }
        r1 = r11.al;	 Catch:{ ei -> 0x033f }
        r2 = r1.j();	 Catch:{ ei -> 0x033f }
        r2 = (double) r2;	 Catch:{ ei -> 0x033f }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x033f }
        r0.l = r1;	 Catch:{ ei -> 0x033f }
        r0 = r11.d;	 Catch:{ ei -> 0x033f }
        r1 = r11.al;	 Catch:{ ei -> 0x033f }
        r1 = r1.a();	 Catch:{ ei -> 0x033f }
        r2 = (double) r1;	 Catch:{ ei -> 0x033f }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x033f }
        r0.a = r1;	 Catch:{ ei -> 0x033f }
        r0 = r11.d;	 Catch:{ ei -> 0x033f }
        r1 = com.whatsapp.fieldstats.ct.OK;	 Catch:{ ei -> 0x033f }
        r1 = r1.getCode();	 Catch:{ ei -> 0x033f }
        r2 = (double) r1;	 Catch:{ ei -> 0x033f }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x033f }
        r0.k = r1;	 Catch:{ ei -> 0x033f }
        r0 = r11.d;	 Catch:{ ei -> 0x033f }
        r1 = L();	 Catch:{ ei -> 0x033f }
        r2 = (double) r1;	 Catch:{ ei -> 0x033f }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x033f }
        r0.h = r1;	 Catch:{ ei -> 0x033f }
        r2 = r11.d;	 Catch:{ ei -> 0x033f }
        r0 = s();	 Catch:{ ei -> 0x033f }
        if (r0 == 0) goto L_0x0343;
    L_0x0125:
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x0127:
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ ei -> 0x0347 }
        r2.e = r0;	 Catch:{ ei -> 0x0347 }
        r2 = r11.d;	 Catch:{ ei -> 0x0347 }
        r0 = R;	 Catch:{ ei -> 0x0347 }
        r1 = 1;
        if (r0 != r1) goto L_0x0349;
    L_0x0134:
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x0136:
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ ei -> 0x034d }
        r2.o = r0;	 Catch:{ ei -> 0x034d }
        r0 = r11.d;	 Catch:{ ei -> 0x034d }
        r0 = r0.b;	 Catch:{ ei -> 0x034d }
        if (r0 != 0) goto L_0x0151;
    L_0x0142:
        r0 = r11.d;	 Catch:{ ei -> 0x034d }
        r1 = com.whatsapp.fieldstats.b5.UNKNOWN;	 Catch:{ ei -> 0x034d }
        r1 = r1.getCode();	 Catch:{ ei -> 0x034d }
        r2 = (double) r1;	 Catch:{ ei -> 0x034d }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x034d }
        r0.b = r1;	 Catch:{ ei -> 0x034d }
    L_0x0151:
        r0 = r11.L;
        r0 = r0.c();
        r1 = new java.lang.StringBuilder;	 Catch:{ ei -> 0x034f }
        r1.<init>();	 Catch:{ ei -> 0x034f }
        r2 = bb;	 Catch:{ ei -> 0x034f }
        r3 = 556; // 0x22c float:7.79E-43 double:2.747E-321;
        r2 = r2[r3];	 Catch:{ ei -> 0x034f }
        r1 = r1.append(r2);	 Catch:{ ei -> 0x034f }
        r1 = r1.append(r0);	 Catch:{ ei -> 0x034f }
        r1 = r1.toString();	 Catch:{ ei -> 0x034f }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ei -> 0x034f }
        r1 = r11.d;	 Catch:{ ei -> 0x034f }
        r2 = (double) r0;	 Catch:{ ei -> 0x034f }
        r0 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x034f }
        r1.j = r0;	 Catch:{ ei -> 0x034f }
        r0 = g();	 Catch:{ ei -> 0x034f }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ ei -> 0x034f }
        b(r0, r2);	 Catch:{ ei -> 0x034f }
        r0 = g();	 Catch:{ ei -> 0x034f }
        r1 = r11.al;	 Catch:{ ei -> 0x034f }
        r2 = r1.j();	 Catch:{ ei -> 0x034f }
        a(r0, r2);	 Catch:{ ei -> 0x034f }
        r0 = g();	 Catch:{ ei -> 0x034f }
        r1 = r11.al;	 Catch:{ ei -> 0x034f }
        r2 = r1.m();	 Catch:{ ei -> 0x034f }
        c(r0, r2);	 Catch:{ ei -> 0x034f }
        c();	 Catch:{ ei -> 0x034f }
        y();	 Catch:{ ei -> 0x034f }
        r0 = r11.L;	 Catch:{ ei -> 0x034f }
        r0.b();	 Catch:{ ei -> 0x034f }
        r0 = 0;
        r11.n = r0;	 Catch:{ ei -> 0x034f }
        r0 = r11.M;	 Catch:{ ei -> 0x034f }
        r2 = 0;
        r0.set(r2);	 Catch:{ ei -> 0x034f }
        r0 = r11.Y;	 Catch:{ ei -> 0x034f }
        r2 = 0;
        r0.set(r2);	 Catch:{ ei -> 0x034f }
        r0 = r11.O;	 Catch:{ ei -> 0x034f }
        r1 = 0;
        r0.set(r1);	 Catch:{ ei -> 0x034f }
        r0 = 0;
        G = r0;	 Catch:{ ei -> 0x034f }
        com.whatsapp.gdrive.by.a();	 Catch:{ ei -> 0x034f }
        r0 = r11.L;	 Catch:{ ei -> 0x034f }
        r0 = r0.f();	 Catch:{ ei -> 0x034f }
        if (r0 == 0) goto L_0x01d7;
    L_0x01d0:
        r0 = r11.o;	 Catch:{ ei -> 0x034f }
        r0.a();	 Catch:{ ei -> 0x034f }
        if (r4 == 0) goto L_0x022c;
    L_0x01d7:
        r0 = r11.o;
        r1 = 1;
        r0.a(r1);
        r2 = 0;
        r5 = Q;
        r6 = r5.length;
        r0 = 0;
        r10 = r0;
        r0 = r2;
        r2 = r10;
    L_0x01e6:
        if (r2 >= r6) goto L_0x01f7;
    L_0x01e8:
        r3 = r5[r2];
        r0 = (double) r0;
        r7 = 0;
        r8 = com.whatsapp.gdrive.fn.a(r3, r7);
        r8 = (double) r8;
        r0 = r0 + r8;
        r0 = (long) r0;
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x01e6;
    L_0x01f7:
        r2 = r11.d;
        r0 = (double) r0;
        r0 = java.lang.Double.valueOf(r0);
        r2.a = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 557; // 0x22d float:7.8E-43 double:2.75E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.d;
        r1 = com.whatsapp.gdrive.fn.a(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r11.d;
        com.whatsapp.fieldstats.i.a(r11, r0);
        r0 = 0;
        r11.d = r0;
        r0 = 0;
        r11.e = r0;
    L_0x022c:
        if (r4 == 0) goto L_0x024f;
    L_0x022e:
        com.whatsapp.gdrive.by.a();	 Catch:{ ei -> 0x0351 }
        r0 = r11.Y;	 Catch:{ ei -> 0x0351 }
        r2 = 0;
        r0.set(r2);	 Catch:{ ei -> 0x0351 }
        r0 = r11.O;	 Catch:{ ei -> 0x0351 }
        r1 = 0;
        r0.set(r1);	 Catch:{ ei -> 0x0351 }
        r0 = r11.L;	 Catch:{ ei -> 0x0351 }
        r0 = r0.f();	 Catch:{ ei -> 0x0351 }
        if (r0 == 0) goto L_0x0355;
    L_0x0246:
        r0 = 0;
        f(r0);	 Catch:{ ei -> 0x0353 }
        r0 = r11.o;	 Catch:{ ei -> 0x0353 }
        r0.a();	 Catch:{ ei -> 0x0353 }
    L_0x024f:
        return;
    L_0x0250:
        r0 = move-exception;
        throw r0;	 Catch:{ ei -> 0x0252 }
    L_0x0252:
        r0 = move-exception;
        throw r0;
    L_0x0254:
        r1 = 0;
        goto L_0x0024;
    L_0x0257:
        r0 = move-exception;
        throw r0;	 Catch:{ ei -> 0x0259, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
    L_0x0259:
        r0 = move-exception;
        throw r0;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
    L_0x025b:
        r0 = move-exception;
        r2 = bb;
        r3 = 554; // 0x22a float:7.76E-43 double:2.737E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = r0.getCause();
        if (r0 != 0) goto L_0x027b;
    L_0x026b:
        r2 = bb;	 Catch:{ ei -> 0x02b1 }
        r3 = 560; // 0x230 float:7.85E-43 double:2.767E-321;
        r2 = r2[r3];	 Catch:{ ei -> 0x02b1 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ei -> 0x02b1 }
        r2 = 11;
        r11.d(r2);	 Catch:{ ei -> 0x02b1 }
        if (r4 == 0) goto L_0x00c3;
    L_0x027b:
        r0 = r0 instanceof com.google.android.gms.auth.GooglePlayServicesAvailabilityException;	 Catch:{ ei -> 0x02b3 }
        if (r0 == 0) goto L_0x0286;
    L_0x027f:
        r0 = 21;
        r11.d(r0);	 Catch:{ ei -> 0x02b5 }
        if (r4 == 0) goto L_0x00c3;
    L_0x0286:
        r0 = 11;
        r11.d(r0);	 Catch:{ ei -> 0x028d }
        goto L_0x00c3;
    L_0x028d:
        r0 = move-exception;
        throw r0;
    L_0x028f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0291 }
    L_0x0291:
        r0 = move-exception;
        r3 = l;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r5 = 0;
        r3.set(r5);	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        r2.b();	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
        throw r0;	 Catch:{ ei -> 0x025b, ea -> 0x029c, ew -> 0x02b7, eu -> 0x02c8, et -> 0x02d9, e9 -> 0x02ea, e2 -> 0x02fb, e5 -> 0x030c, en -> 0x031d, ez -> 0x032e }
    L_0x029c:
        r0 = move-exception;
        r2 = bb;
        r3 = 564; // 0x234 float:7.9E-43 double:2.787E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = 12;
        r11.d(r0);
        goto L_0x00c3;
    L_0x02ad:
        r0 = move-exception;
        throw r0;	 Catch:{ ei -> 0x02af }
    L_0x02af:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0291 }
    L_0x02b1:
        r0 = move-exception;
        throw r0;	 Catch:{ ei -> 0x02b3 }
    L_0x02b3:
        r0 = move-exception;
        throw r0;	 Catch:{ ei -> 0x02b5 }
    L_0x02b5:
        r0 = move-exception;
        throw r0;	 Catch:{ ei -> 0x028d }
    L_0x02b7:
        r0 = move-exception;
        r2 = bb;
        r3 = 565; // 0x235 float:7.92E-43 double:2.79E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = 18;
        r11.d(r0);
        goto L_0x00c3;
    L_0x02c8:
        r0 = move-exception;
        r2 = bb;
        r3 = 561; // 0x231 float:7.86E-43 double:2.77E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = 15;
        r11.d(r0);
        goto L_0x00c3;
    L_0x02d9:
        r0 = move-exception;
        r2 = bb;
        r3 = 549; // 0x225 float:7.7E-43 double:2.71E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = 19;
        r11.d(r0);
        goto L_0x00c3;
    L_0x02ea:
        r0 = move-exception;
        r2 = bb;
        r3 = 552; // 0x228 float:7.74E-43 double:2.727E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = 13;
        r11.d(r0);
        goto L_0x00c3;
    L_0x02fb:
        r0 = move-exception;
        r2 = bb;
        r3 = 551; // 0x227 float:7.72E-43 double:2.72E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = 20;
        r11.d(r0);
        goto L_0x00c3;
    L_0x030c:
        r0 = move-exception;
        r2 = bb;
        r3 = 558; // 0x22e float:7.82E-43 double:2.757E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = 16;
        r11.d(r0);
        goto L_0x00c3;
    L_0x031d:
        r0 = move-exception;
        r2 = bb;
        r3 = 555; // 0x22b float:7.78E-43 double:2.74E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = 22;
        r11.d(r0);
        goto L_0x00c3;
    L_0x032e:
        r0 = move-exception;
        r2 = bb;
        r3 = 562; // 0x232 float:7.88E-43 double:2.777E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r0 = 23;
        r11.d(r0);
        goto L_0x00c3;
    L_0x033f:
        r0 = move-exception;
        throw r0;	 Catch:{ ei -> 0x0341 }
    L_0x0341:
        r0 = move-exception;
        throw r0;
    L_0x0343:
        r0 = 0;
        goto L_0x0127;
    L_0x0347:
        r0 = move-exception;
        throw r0;
    L_0x0349:
        r0 = 0;
        goto L_0x0136;
    L_0x034d:
        r0 = move-exception;
        throw r0;
    L_0x034f:
        r0 = move-exception;
        throw r0;
    L_0x0351:
        r0 = move-exception;
        throw r0;	 Catch:{ ei -> 0x0353 }
    L_0x0353:
        r0 = move-exception;
        throw r0;
    L_0x0355:
        r0 = r11.o;	 Catch:{ ei -> 0x045d }
        r1 = 0;
        r0.a(r1);	 Catch:{ ei -> 0x045d }
        ab();	 Catch:{ ei -> 0x045d }
        r0 = L();	 Catch:{ ei -> 0x045d }
        r1 = 4;
        if (r0 < r1) goto L_0x038d;
    L_0x0365:
        r0 = new java.lang.StringBuilder;	 Catch:{ ei -> 0x045d }
        r0.<init>();	 Catch:{ ei -> 0x045d }
        r1 = bb;	 Catch:{ ei -> 0x045d }
        r2 = 566; // 0x236 float:7.93E-43 double:2.796E-321;
        r1 = r1[r2];	 Catch:{ ei -> 0x045d }
        r0 = r0.append(r1);	 Catch:{ ei -> 0x045d }
        r1 = L();	 Catch:{ ei -> 0x045d }
        r0 = r0.append(r1);	 Catch:{ ei -> 0x045d }
        r1 = bb;	 Catch:{ ei -> 0x045d }
        r2 = 548; // 0x224 float:7.68E-43 double:2.707E-321;
        r1 = r1[r2];	 Catch:{ ei -> 0x045d }
        r0 = r0.append(r1);	 Catch:{ ei -> 0x045d }
        r0 = r0.toString();	 Catch:{ ei -> 0x045d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ei -> 0x045d }
    L_0x038d:
        r0 = com.whatsapp.App.aK;	 Catch:{ IOException -> 0x0461 }
        r0 = r0.t();	 Catch:{ IOException -> 0x0461 }
        r2 = r11.d;	 Catch:{ ei -> 0x045f }
        if (r0 == 0) goto L_0x0477;
    L_0x0397:
        r0 = r0.length();	 Catch:{ ei -> 0x045f }
        r0 = (double) r0;
    L_0x039c:
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ IOException -> 0x0461 }
        r2.i = r0;	 Catch:{ IOException -> 0x0461 }
    L_0x03a2:
        r0 = r11.d;
        r2 = r11.n;
        r2 = (double) r2;
        r1 = r11.d;
        r1 = r1.i;
        r6 = r1.doubleValue();
        r2 = r2 - r6;
        r1 = java.lang.Double.valueOf(r2);
        r0.c = r1;
        r0 = r11.d;
        r2 = r11.e;
        r2 = (double) r2;
        r1 = java.lang.Double.valueOf(r2);
        r0.l = r1;
        r2 = 0;
        r5 = Q;
        r6 = r5.length;
        r0 = 0;
        r10 = r0;
        r0 = r2;
        r2 = r10;
    L_0x03ca:
        if (r2 >= r6) goto L_0x03db;
    L_0x03cc:
        r3 = r5[r2];
        r0 = (double) r0;
        r7 = 0;
        r8 = com.whatsapp.gdrive.fn.a(r3, r7);
        r8 = (double) r8;
        r0 = r0 + r8;
        r0 = (long) r0;
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x03ca;
    L_0x03db:
        r2 = r11.d;	 Catch:{ ei -> 0x047b }
        r0 = (double) r0;	 Catch:{ ei -> 0x047b }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ ei -> 0x047b }
        r2.a = r0;	 Catch:{ ei -> 0x047b }
        r0 = r11.d;	 Catch:{ ei -> 0x047b }
        r1 = L();	 Catch:{ ei -> 0x047b }
        r2 = (double) r1;	 Catch:{ ei -> 0x047b }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x047b }
        r0.h = r1;	 Catch:{ ei -> 0x047b }
        r2 = r11.d;	 Catch:{ ei -> 0x047b }
        r0 = s();	 Catch:{ ei -> 0x047b }
        if (r0 == 0) goto L_0x047d;
    L_0x03f9:
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x03fb:
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ ei -> 0x0481 }
        r2.e = r0;	 Catch:{ ei -> 0x0481 }
        r2 = r11.d;	 Catch:{ ei -> 0x0481 }
        r0 = R;	 Catch:{ ei -> 0x0481 }
        r1 = 1;
        if (r0 != r1) goto L_0x0483;
    L_0x0408:
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x040a:
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ ei -> 0x0486 }
        r2.o = r0;	 Catch:{ ei -> 0x0486 }
        r0 = r11.d;	 Catch:{ ei -> 0x0486 }
        r0 = r0.b;	 Catch:{ ei -> 0x0486 }
        if (r0 != 0) goto L_0x0425;
    L_0x0416:
        r0 = r11.d;	 Catch:{ ei -> 0x0486 }
        r1 = com.whatsapp.fieldstats.b5.UNKNOWN;	 Catch:{ ei -> 0x0486 }
        r1 = r1.getCode();	 Catch:{ ei -> 0x0486 }
        r2 = (double) r1;	 Catch:{ ei -> 0x0486 }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ ei -> 0x0486 }
        r0.b = r1;	 Catch:{ ei -> 0x0486 }
    L_0x0425:
        r0 = r11.d;
        com.whatsapp.fieldstats.i.a(r11, r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 567; // 0x237 float:7.95E-43 double:2.8E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.d;
        r1 = com.whatsapp.gdrive.fn.a(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = 0;
        r11.d = r0;
        r0 = 0;
        r11.e = r0;
        r0 = 0;
        f(r0);
        r0 = l;
        r1 = 0;
        r0.set(r1);
        goto L_0x024f;
    L_0x045d:
        r0 = move-exception;
        throw r0;
    L_0x045f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0461 }
    L_0x0461:
        r0 = move-exception;
        r1 = bb;
        r2 = 559; // 0x22f float:7.83E-43 double:2.76E-321;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r0 = r11.d;
        r2 = 0;
        r1 = java.lang.Double.valueOf(r2);
        r0.i = r1;
        goto L_0x03a2;
    L_0x0477:
        r0 = 0;
        goto L_0x039c;
    L_0x047b:
        r0 = move-exception;
        throw r0;
    L_0x047d:
        r0 = 0;
        goto L_0x03fb;
    L_0x0481:
        r0 = move-exception;
        throw r0;
    L_0x0483:
        r0 = 0;
        goto L_0x040a;
    L_0x0486:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.b(boolean):void");
    }

    private static long A() {
        return S().getLong(bb[405], -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u() {
        /*
        r3 = this;
        r0 = c;
        r1 = bb;	 Catch:{ NullPointerException -> 0x010c }
        r2 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x010c }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x010c }
        r1 = ak();	 Catch:{ NullPointerException -> 0x010c }
        if (r1 != 0) goto L_0x0017;
    L_0x0011:
        r1 = r();	 Catch:{ NullPointerException -> 0x010e }
        if (r1 == 0) goto L_0x006d;
    L_0x0017:
        r1 = l;	 Catch:{ NullPointerException -> 0x0110 }
        r2 = 0;
        r1.set(r2);	 Catch:{ NullPointerException -> 0x0110 }
        com.whatsapp.gdrive.by.a();	 Catch:{ NullPointerException -> 0x0110 }
        r1 = m;	 Catch:{ NullPointerException -> 0x0110 }
        r1.open();	 Catch:{ NullPointerException -> 0x0110 }
        r1 = r3.L;	 Catch:{ NullPointerException -> 0x0110 }
        if (r1 == 0) goto L_0x0044;
    L_0x0029:
        r1 = bb;	 Catch:{ NullPointerException -> 0x0112 }
        r2 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0112 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0112 }
        r1 = r3.L;	 Catch:{ NullPointerException -> 0x0112 }
        r2 = 0;
        r1.a(r2);	 Catch:{ NullPointerException -> 0x0112 }
        r1 = af;	 Catch:{ NullPointerException -> 0x0112 }
        r1.open();	 Catch:{ NullPointerException -> 0x0112 }
        r1 = ad;	 Catch:{ NullPointerException -> 0x0112 }
        r1.open();	 Catch:{ NullPointerException -> 0x0112 }
        if (r0 == 0) goto L_0x005f;
    L_0x0044:
        r1 = bb;	 Catch:{ NullPointerException -> 0x0112 }
        r2 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0112 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0112 }
        r1 = af;	 Catch:{ NullPointerException -> 0x0112 }
        r1.open();	 Catch:{ NullPointerException -> 0x0112 }
        r1 = ad;	 Catch:{ NullPointerException -> 0x0112 }
        r1.open();	 Catch:{ NullPointerException -> 0x0112 }
        r1 = new com.whatsapp.gdrive.fx;	 Catch:{ NullPointerException -> 0x0112 }
        r1.<init>(r3);	 Catch:{ NullPointerException -> 0x0112 }
        com.whatsapp.util.bq.a(r1);	 Catch:{ NullPointerException -> 0x0112 }
    L_0x005f:
        r1 = r3.A;	 Catch:{ NullPointerException -> 0x0114 }
        r1.h();	 Catch:{ NullPointerException -> 0x0114 }
        r1 = 0;
        G = r1;	 Catch:{ NullPointerException -> 0x0114 }
        r1 = 0;
        f(r1);	 Catch:{ NullPointerException -> 0x0114 }
        if (r0 == 0) goto L_0x00fc;
    L_0x006d:
        r1 = v();	 Catch:{ NullPointerException -> 0x0116 }
        if (r1 == 0) goto L_0x00c3;
    L_0x0073:
        r1 = f;	 Catch:{ NullPointerException -> 0x0118 }
        r2 = 0;
        r1.set(r2);	 Catch:{ NullPointerException -> 0x0118 }
        r1 = m;	 Catch:{ NullPointerException -> 0x0118 }
        r1.open();	 Catch:{ NullPointerException -> 0x0118 }
        r1 = r3.L;	 Catch:{ NullPointerException -> 0x0118 }
        if (r1 == 0) goto L_0x00a6;
    L_0x0082:
        r1 = bb;	 Catch:{ NullPointerException -> 0x011a }
        r2 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x011a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x011a }
        r1 = r3.L;	 Catch:{ NullPointerException -> 0x011a }
        r2 = 0;
        r1.a(r2);	 Catch:{ NullPointerException -> 0x011a }
        r1 = I;	 Catch:{ NullPointerException -> 0x011a }
        r1.open();	 Catch:{ NullPointerException -> 0x011a }
        r1 = an;	 Catch:{ NullPointerException -> 0x011a }
        r1.open();	 Catch:{ NullPointerException -> 0x011a }
        r1 = r3.o;	 Catch:{ NullPointerException -> 0x011a }
        r1.g();	 Catch:{ NullPointerException -> 0x011a }
        r1 = 0;
        f(r1);	 Catch:{ NullPointerException -> 0x011a }
        if (r0 == 0) goto L_0x00fc;
    L_0x00a6:
        r1 = bb;	 Catch:{ NullPointerException -> 0x011c }
        r2 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x011c }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x011c }
        r1 = I;	 Catch:{ NullPointerException -> 0x011c }
        r1.open();	 Catch:{ NullPointerException -> 0x011c }
        r1 = an;	 Catch:{ NullPointerException -> 0x011c }
        r1.open();	 Catch:{ NullPointerException -> 0x011c }
        r1 = new com.whatsapp.gdrive.e0;	 Catch:{ NullPointerException -> 0x011c }
        r1.<init>(r3);	 Catch:{ NullPointerException -> 0x011c }
        com.whatsapp.util.bq.a(r1);	 Catch:{ NullPointerException -> 0x011c }
        if (r0 == 0) goto L_0x00fc;
    L_0x00c3:
        r1 = m();	 Catch:{ NullPointerException -> 0x011e }
        if (r1 == 0) goto L_0x00f3;
    L_0x00c9:
        r1 = C;	 Catch:{ NullPointerException -> 0x0120 }
        r2 = 0;
        r1.set(r2);	 Catch:{ NullPointerException -> 0x0120 }
        r1 = m;	 Catch:{ NullPointerException -> 0x0120 }
        r1.open();	 Catch:{ NullPointerException -> 0x0120 }
        r1 = r3.L;	 Catch:{ NullPointerException -> 0x0120 }
        if (r1 == 0) goto L_0x00de;
    L_0x00d8:
        r1 = r3.L;	 Catch:{ NullPointerException -> 0x0120 }
        r2 = 0;
        r1.a(r2);	 Catch:{ NullPointerException -> 0x0120 }
    L_0x00de:
        r1 = x;	 Catch:{ NullPointerException -> 0x0122 }
        r1.open();	 Catch:{ NullPointerException -> 0x0122 }
        r1 = s;	 Catch:{ NullPointerException -> 0x0122 }
        r1.open();	 Catch:{ NullPointerException -> 0x0122 }
        r1 = r3.A;	 Catch:{ NullPointerException -> 0x0122 }
        r1.h();	 Catch:{ NullPointerException -> 0x0122 }
        r1 = 0;
        f(r1);	 Catch:{ NullPointerException -> 0x0122 }
        if (r0 == 0) goto L_0x00fc;
    L_0x00f3:
        r0 = bb;	 Catch:{ NullPointerException -> 0x0122 }
        r1 = 305; // 0x131 float:4.27E-43 double:1.507E-321;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0122 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0122 }
    L_0x00fc:
        r0 = 10;
        r3.d(r0);	 Catch:{ NullPointerException -> 0x0124 }
        r0 = ar();	 Catch:{ NullPointerException -> 0x0124 }
        if (r0 == 0) goto L_0x010b;
    L_0x0107:
        r0 = 0;
        e(r0);	 Catch:{ NullPointerException -> 0x0124 }
    L_0x010b:
        return;
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x010e }
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0112 }
    L_0x0112:
        r0 = move-exception;
        throw r0;
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0116 }
    L_0x0116:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x011a }
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x011c }
    L_0x011c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x011e }
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0120 }
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r0 = move-exception;
        throw r0;
    L_0x0124:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.u():void");
    }

    private void aq() {
        if (this.T == null) {
            this.T = ((WifiManager) getSystemService(bb[509])).createWifiLock(1, bb[508]);
            this.T.setReferenceCounted(false);
        }
        this.T.acquire();
    }

    static void f() {
        G = true;
        bq.a(new bg());
    }

    static boolean a(GoogleDriveService googleDriveService, File file, fs fsVar) {
        return googleDriveService.a(file, fsVar);
    }

    static boolean s(GoogleDriveService googleDriveService) {
        return googleDriveService.Z();
    }

    private static String ah() {
        try {
            if (App.ay == null) {
                Log.i(bb[529]);
                return null;
            }
            String str = App.ay.jabber_id;
            if (str != null) {
                return j(str);
            }
            try {
                Log.e(bb[530]);
                return null;
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean F() {
        /*
        r12 = this;
        r0 = 0;
        r3 = 1;
        r2 = 0;
        r5 = c;
        r1 = V();
        if (r1 == 0) goto L_0x01bf;
    L_0x000b:
        r1 = r12.ak;
        r6 = r12.a(r1);
        if (r6 != 0) goto L_0x0020;
    L_0x0013:
        r0 = bb;	 Catch:{ NullPointerException -> 0x001e }
        r1 = 62;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x001e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x001e }
        r0 = r2;
    L_0x001d:
        return r0;
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r1 = ag();	 Catch:{ NullPointerException -> 0x0031 }
        if (r1 != r3) goto L_0x0033;
    L_0x0026:
        r0 = bb;	 Catch:{ NullPointerException -> 0x0031 }
        r1 = 64;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0031 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x0031 }
        r0 = r2;
        goto L_0x001d;
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        r1 = r12.al;	 Catch:{ NullPointerException -> 0x0042 }
        if (r1 != 0) goto L_0x0046;
    L_0x0037:
        r1 = 1;
        r4 = v;	 Catch:{ NullPointerException -> 0x0044 }
        r1 = r12.a(r1, r4);	 Catch:{ NullPointerException -> 0x0044 }
        if (r1 != 0) goto L_0x0046;
    L_0x0040:
        r0 = r2;
        goto L_0x001d;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r7 = com.whatsapp.azf.f();
        r8 = r7.length;
        r4 = r2;
        r1 = r0;
    L_0x004d:
        if (r4 >= r8) goto L_0x0081;
    L_0x004f:
        r0 = r7[r4];
        r0 = r0.getAbsolutePath();
        r1 = com.whatsapp.gdrive.fn.b(r0);
        r0 = r12.al;
        r0 = r0.c(r1);
        if (r0 == 0) goto L_0x007d;
    L_0x0061:
        r9 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00d1 }
        r9.<init>();	 Catch:{ NullPointerException -> 0x00d1 }
        r10 = bb;	 Catch:{ NullPointerException -> 0x00d1 }
        r11 = 67;
        r10 = r10[r11];	 Catch:{ NullPointerException -> 0x00d1 }
        r9 = r9.append(r10);	 Catch:{ NullPointerException -> 0x00d1 }
        r9 = r9.append(r0);	 Catch:{ NullPointerException -> 0x00d1 }
        r9 = r9.toString();	 Catch:{ NullPointerException -> 0x00d1 }
        com.whatsapp.util.Log.i(r9);	 Catch:{ NullPointerException -> 0x00d1 }
        if (r5 == 0) goto L_0x0081;
    L_0x007d:
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x004d;
    L_0x0081:
        if (r0 != 0) goto L_0x011b;
    L_0x0083:
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00d3 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x00d3 }
        r3 = bb;	 Catch:{ NullPointerException -> 0x00d3 }
        r4 = 58;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00d3 }
        r0 = r0.append(r3);	 Catch:{ NullPointerException -> 0x00d3 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00d3 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x00d3 }
        r3 = 59;
        r1 = r1[r3];	 Catch:{ NullPointerException -> 0x00d3 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00d3 }
        r0 = r0.append(r6);	 Catch:{ NullPointerException -> 0x00d3 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x00d3 }
        r3 = 56;
        r1 = r1[r3];	 Catch:{ NullPointerException -> 0x00d3 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00d3 }
        r1 = r12.al;	 Catch:{ NullPointerException -> 0x00d3 }
        r1 = r1.i();	 Catch:{ NullPointerException -> 0x00d3 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00d3 }
        r1 = ")";
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00d3 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x00d3 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x00d3 }
        r0 = r12.ak;	 Catch:{ NullPointerException -> 0x00d3 }
        r0 = r0.a();	 Catch:{ NullPointerException -> 0x00d3 }
        if (r0 != 0) goto L_0x00d5;
    L_0x00ce:
        r0 = r2;
        goto L_0x001d;
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = r12.L;
        r1 = r12.ak;
        r0 = r0.a(r6, r1);
        if (r0 != 0) goto L_0x00ea;
    L_0x00df:
        r1 = bb;	 Catch:{ NullPointerException -> 0x0119 }
        r3 = 65;
        r1 = r1[r3];	 Catch:{ NullPointerException -> 0x0119 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NullPointerException -> 0x0119 }
        if (r5 == 0) goto L_0x0116;
    L_0x00ea:
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0119 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x0119 }
        r3 = bb;	 Catch:{ NullPointerException -> 0x0119 }
        r4 = 57;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x0119 }
        r1 = r1.append(r3);	 Catch:{ NullPointerException -> 0x0119 }
        r0 = r0.size();	 Catch:{ NullPointerException -> 0x0119 }
        r0 = r1.append(r0);	 Catch:{ NullPointerException -> 0x0119 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x0119 }
        r3 = 63;
        r1 = r1[r3];	 Catch:{ NullPointerException -> 0x0119 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0119 }
        r0 = r0.append(r6);	 Catch:{ NullPointerException -> 0x0119 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x0119 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0119 }
    L_0x0116:
        r0 = r2;
        goto L_0x001d;
    L_0x0119:
        r0 = move-exception;
        throw r0;
    L_0x011b:
        r1 = r0.h();	 Catch:{ NullPointerException -> 0x012d }
        if (r1 != 0) goto L_0x012f;
    L_0x0121:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NullPointerException -> 0x012d }
        r1 = bb;	 Catch:{ NullPointerException -> 0x012d }
        r2 = 68;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x012d }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x012d }
        throw r0;	 Catch:{ NullPointerException -> 0x012d }
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r1 = new java.io.File;
        r4 = r0.e();
        r4 = com.whatsapp.gdrive.fn.c(r4);
        r1.<init>(r4);
        r4 = r1.exists();	 Catch:{ NullPointerException -> 0x0181 }
        if (r4 == 0) goto L_0x0196;
    L_0x0142:
        r4 = r1.length();	 Catch:{ NullPointerException -> 0x0183 }
        r6 = 0;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x0196;
    L_0x014c:
        r4 = r0.h();	 Catch:{ NullPointerException -> 0x0185 }
        r5 = com.whatsapp.gdrive.fn.a(r1);	 Catch:{ NullPointerException -> 0x0185 }
        r4 = r4.equals(r5);	 Catch:{ NullPointerException -> 0x0185 }
        if (r4 == 0) goto L_0x0187;
    L_0x015a:
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0185 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x0185 }
        r2 = bb;	 Catch:{ NullPointerException -> 0x0185 }
        r4 = 60;
        r2 = r2[r4];	 Catch:{ NullPointerException -> 0x0185 }
        r0 = r0.append(r2);	 Catch:{ NullPointerException -> 0x0185 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0185 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x0185 }
        r2 = 61;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0185 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0185 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x0185 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0185 }
        r0 = r3;
        goto L_0x001d;
    L_0x0181:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0183 }
    L_0x0183:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0185 }
    L_0x0185:
        r0 = move-exception;
        throw r0;
    L_0x0187:
        r4 = bb;
        r5 = 55;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r4 = "";
        com.whatsapp.util.ak.b(r1, r4);
    L_0x0196:
        r4 = r12.ak;
        r5 = new com.whatsapp.gdrive.l;
        r5.<init>(r12, r0, r1);
        r0 = bb;
        r1 = 66;
        r0 = r0[r1];
        r0 = com.whatsapp.gdrive.by.a(r4, r5, r0);
        r0 = (java.lang.Boolean) r0;
        if (r0 == 0) goto L_0x01b1;
    L_0x01ab:
        r0 = r0.booleanValue();	 Catch:{ NullPointerException -> 0x01bd }
        if (r0 != 0) goto L_0x01bf;
    L_0x01b1:
        r0 = bb;	 Catch:{ NullPointerException -> 0x01bd }
        r1 = 69;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x01bd }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x01bd }
        r0 = r2;
        goto L_0x001d;
    L_0x01bd:
        r0 = move-exception;
        throw r0;
    L_0x01bf:
        r12.an();
        r0 = r3;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.F():boolean");
    }

    private static String C() {
        try {
            if (App.ay == null) {
                Log.i(bb[355]);
                return null;
            }
            String str = App.ay.jabber_id;
            if (str != null) {
                return i(str);
            }
            try {
                Log.e(bb[354]);
                return null;
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(@android.support.annotation.NonNull java.lang.String r12, @android.support.annotation.NonNull java.io.File r13, @android.support.annotation.NonNull java.lang.String r14, boolean r15) {
        /*
        r11 = this;
        r4 = 2;
        r6 = 1;
        r7 = 0;
        r8 = c;
        r0 = r11.n;	 Catch:{ NullPointerException -> 0x002b }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x002f;
    L_0x000d:
        r0 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r2 = r11.Y;	 Catch:{ NullPointerException -> 0x002b }
        r2 = r2.get();	 Catch:{ NullPointerException -> 0x002b }
        r2 = (double) r2;	 Catch:{ NullPointerException -> 0x002b }
        r0 = r0 * r2;
        r2 = r11.n;	 Catch:{ NullPointerException -> 0x002b }
        r2 = (double) r2;
        r0 = r0 / r2;
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x002f;
    L_0x0021:
        r0 = bb;	 Catch:{ NullPointerException -> 0x002d }
        r1 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x002d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x002d }
    L_0x002a:
        return r7;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = r11.N;	 Catch:{ NullPointerException -> 0x0138 }
        r0 = r0.a();	 Catch:{ NullPointerException -> 0x0138 }
        if (r0 == 0) goto L_0x002a;
    L_0x0037:
        r0 = R;	 Catch:{ NullPointerException -> 0x013a }
        if (r0 != r4) goto L_0x0045;
    L_0x003b:
        r0 = r11.d;	 Catch:{ NullPointerException -> 0x013a }
        r2 = 0;
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ NullPointerException -> 0x013a }
        r0.m = r1;	 Catch:{ NullPointerException -> 0x013a }
    L_0x0045:
        r9 = 0;
        r10 = r11.N;	 Catch:{ all -> 0x013e }
        r0 = new com.whatsapp.gdrive.i;	 Catch:{ all -> 0x013e }
        r1 = r11;
        r2 = r15;
        r3 = r14;
        r4 = r12;
        r5 = r13;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x013e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x013e }
        r1.<init>();	 Catch:{ all -> 0x013e }
        r2 = bb;	 Catch:{ all -> 0x013e }
        r3 = 575; // 0x23f float:8.06E-43 double:2.84E-321;
        r2 = r2[r3];	 Catch:{ all -> 0x013e }
        r1 = r1.append(r2);	 Catch:{ all -> 0x013e }
        r2 = r13.getAbsolutePath();	 Catch:{ all -> 0x013e }
        r1 = r1.append(r2);	 Catch:{ all -> 0x013e }
        r1 = r1.toString();	 Catch:{ all -> 0x013e }
        r0 = com.whatsapp.gdrive.by.a(r10, r0, r1);	 Catch:{ all -> 0x013e }
        r0 = (com.whatsapp.gdrive.fs) r0;	 Catch:{ all -> 0x013e }
        if (r0 != 0) goto L_0x0083;
    L_0x0075:
        r1 = r11.Y;	 Catch:{ NullPointerException -> 0x013c }
        r2 = r13.length();	 Catch:{ NullPointerException -> 0x013c }
        r1.addAndGet(r2);	 Catch:{ NullPointerException -> 0x013c }
        r1 = r11.O;	 Catch:{ NullPointerException -> 0x013c }
        r1.incrementAndGet();	 Catch:{ NullPointerException -> 0x013c }
    L_0x0083:
        r1 = r11.N;	 Catch:{ NullPointerException -> 0x0152 }
        r1 = r1.a();	 Catch:{ NullPointerException -> 0x0152 }
        if (r1 == 0) goto L_0x002a;
    L_0x008b:
        if (r0 == 0) goto L_0x0132;
    L_0x008d:
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0154 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x0154 }
        r2 = bb;	 Catch:{ NullPointerException -> 0x0154 }
        r3 = 577; // 0x241 float:8.09E-43 double:2.85E-321;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0154 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0154 }
        r2 = r0.e();	 Catch:{ NullPointerException -> 0x0154 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0154 }
        r2 = bb;	 Catch:{ NullPointerException -> 0x0154 }
        r3 = 574; // 0x23e float:8.04E-43 double:2.836E-321;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0154 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0154 }
        r2 = r0.g();	 Catch:{ NullPointerException -> 0x0154 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0154 }
        r2 = bb;	 Catch:{ NullPointerException -> 0x0154 }
        r3 = 578; // 0x242 float:8.1E-43 double:2.856E-321;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0154 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0154 }
        r2 = r0.b();	 Catch:{ NullPointerException -> 0x0154 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0154 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0154 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0154 }
        r1 = r11.al;	 Catch:{ NullPointerException -> 0x0154 }
        if (r1 == 0) goto L_0x00da;
    L_0x00d3:
        r1 = r11.al;	 Catch:{ NullPointerException -> 0x0156 }
        r1.a(r0);	 Catch:{ NullPointerException -> 0x0156 }
        if (r8 == 0) goto L_0x00e3;
    L_0x00da:
        r1 = bb;	 Catch:{ NullPointerException -> 0x0156 }
        r2 = 573; // 0x23d float:8.03E-43 double:2.83E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0156 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0156 }
    L_0x00e3:
        if (r15 == 0) goto L_0x0132;
    L_0x00e5:
        r1 = r11.M;	 Catch:{ NullPointerException -> 0x0158 }
        r2 = r0.b();	 Catch:{ NullPointerException -> 0x0158 }
        r1.addAndGet(r2);	 Catch:{ NullPointerException -> 0x0158 }
        r1 = r11.M;	 Catch:{ NullPointerException -> 0x0158 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x0158 }
        b(r2);	 Catch:{ NullPointerException -> 0x0158 }
        r1 = r11.al;	 Catch:{ NullPointerException -> 0x0158 }
        if (r1 == 0) goto L_0x010a;
    L_0x00fb:
        r1 = r11.o;	 Catch:{ NullPointerException -> 0x015a }
        r2 = r11.M;	 Catch:{ NullPointerException -> 0x015a }
        r2 = r2.get();	 Catch:{ NullPointerException -> 0x015a }
        r4 = r11.n;	 Catch:{ NullPointerException -> 0x015a }
        r1.l(r2, r4);	 Catch:{ NullPointerException -> 0x015a }
        if (r8 == 0) goto L_0x0132;
    L_0x010a:
        r1 = java.util.Locale.ENGLISH;	 Catch:{ NullPointerException -> 0x015a }
        r2 = bb;	 Catch:{ NullPointerException -> 0x015a }
        r3 = 579; // 0x243 float:8.11E-43 double:2.86E-321;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x015a }
        r3 = 2;
        r3 = new java.lang.Object[r3];	 Catch:{ NullPointerException -> 0x015a }
        r4 = 0;
        r5 = r11.M;	 Catch:{ NullPointerException -> 0x015a }
        r8 = r5.get();	 Catch:{ NullPointerException -> 0x015a }
        r5 = java.lang.Long.valueOf(r8);	 Catch:{ NullPointerException -> 0x015a }
        r3[r4] = r5;	 Catch:{ NullPointerException -> 0x015a }
        r4 = 1;
        r8 = r11.n;	 Catch:{ NullPointerException -> 0x015a }
        r5 = java.lang.Long.valueOf(r8);	 Catch:{ NullPointerException -> 0x015a }
        r3[r4] = r5;	 Catch:{ NullPointerException -> 0x015a }
        r1 = java.lang.String.format(r1, r2, r3);	 Catch:{ NullPointerException -> 0x015a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x015a }
    L_0x0132:
        if (r0 == 0) goto L_0x015c;
    L_0x0134:
        r0 = r6;
    L_0x0135:
        r7 = r0;
        goto L_0x002a;
    L_0x0138:
        r0 = move-exception;
        throw r0;
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r0 = move-exception;
        throw r0;
    L_0x013e:
        r0 = move-exception;
        if (r9 != 0) goto L_0x014f;
    L_0x0141:
        r1 = r11.Y;	 Catch:{ NullPointerException -> 0x0150 }
        r2 = r13.length();	 Catch:{ NullPointerException -> 0x0150 }
        r1.addAndGet(r2);	 Catch:{ NullPointerException -> 0x0150 }
        r1 = r11.O;	 Catch:{ NullPointerException -> 0x0150 }
        r1.incrementAndGet();	 Catch:{ NullPointerException -> 0x0150 }
    L_0x014f:
        throw r0;
    L_0x0150:
        r0 = move-exception;
        throw r0;
    L_0x0152:
        r0 = move-exception;
        throw r0;
    L_0x0154:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0156 }
    L_0x0156:
        r0 = move-exception;
        throw r0;
    L_0x0158:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x015a }
    L_0x015a:
        r0 = move-exception;
        throw r0;
    L_0x015c:
        r0 = r7;
        goto L_0x0135;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.a(java.lang.String, java.io.File, java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean E() {
        /*
        r0 = 0;
        r1 = r();	 Catch:{ NullPointerException -> 0x001c }
        if (r1 == 0) goto L_0x0020;
    L_0x0007:
        r1 = af;	 Catch:{ NullPointerException -> 0x001e }
        r2 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r1 = r1.block(r2);	 Catch:{ NullPointerException -> 0x001e }
        if (r1 != 0) goto L_0x005b;
    L_0x0012:
        r1 = bb;	 Catch:{ NullPointerException -> 0x001e }
        r2 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x001e }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NullPointerException -> 0x001e }
    L_0x001b:
        return r0;
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r1 = ai();	 Catch:{ NullPointerException -> 0x0055 }
        if (r1 == 0) goto L_0x003e;
    L_0x0026:
        r1 = I;	 Catch:{ NullPointerException -> 0x0057 }
        r2 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r1 = r1.block(r2);	 Catch:{ NullPointerException -> 0x0057 }
        if (r1 != 0) goto L_0x005b;
    L_0x0031:
        r1 = bb;	 Catch:{ NullPointerException -> 0x0059 }
        r2 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0059 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NullPointerException -> 0x0059 }
        r1 = c;	 Catch:{ NullPointerException -> 0x0059 }
        if (r1 == 0) goto L_0x005b;
    L_0x003e:
        r1 = x;	 Catch:{ NullPointerException -> 0x0053 }
        r2 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r1 = r1.block(r2);	 Catch:{ NullPointerException -> 0x0053 }
        if (r1 != 0) goto L_0x005b;
    L_0x0049:
        r1 = bb;	 Catch:{ NullPointerException -> 0x0053 }
        r2 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0053 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NullPointerException -> 0x0053 }
        goto L_0x001b;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0053 }
    L_0x005b:
        r0 = 1;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.E():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(@android.support.annotation.NonNull java.util.List r19, @android.support.annotation.NonNull java.util.Set r20, boolean r21) {
        /*
        r18 = this;
        r13 = c;
        r10 = new java.util.concurrent.atomic.AtomicReference;
        r2 = 0;
        r10.<init>(r2);
        r0 = r18;
        r2 = r0.al;
        r3 = r2.s();
        r4 = new java.util.concurrent.atomic.AtomicBoolean;
        r2 = 1;
        r4.<init>(r2);
        r11 = new java.util.concurrent.CountDownLatch;
        r2 = r3.size();
        r11.<init>(r2);
        r2 = 0;
        r14 = r3.size();
        r5 = com.whatsapp.App.aO();	 Catch:{ InterruptedException -> 0x0030 }
        if (r5 != 0) goto L_0x0032;
    L_0x002a:
        r2 = new com.whatsapp.gdrive.ez;	 Catch:{ InterruptedException -> 0x0030 }
        r2.<init>();	 Catch:{ InterruptedException -> 0x0030 }
        throw r2;	 Catch:{ InterruptedException -> 0x0030 }
    L_0x0030:
        r2 = move-exception;
        throw r2;
    L_0x0032:
        r15 = r3.iterator();
    L_0x0036:
        r3 = r15.hasNext();
        if (r3 == 0) goto L_0x0109;
    L_0x003c:
        r8 = r15.next();
        r8 = (java.lang.String) r8;
        r3 = r2 % 100;
        if (r3 != 0) goto L_0x006b;
    L_0x0046:
        r3 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0079 }
        r3.<init>();	 Catch:{ InterruptedException -> 0x0079 }
        r5 = bb;	 Catch:{ InterruptedException -> 0x0079 }
        r6 = 527; // 0x20f float:7.38E-43 double:2.604E-321;
        r5 = r5[r6];	 Catch:{ InterruptedException -> 0x0079 }
        r3 = r3.append(r5);	 Catch:{ InterruptedException -> 0x0079 }
        r3 = r3.append(r2);	 Catch:{ InterruptedException -> 0x0079 }
        r5 = "/";
        r3 = r3.append(r5);	 Catch:{ InterruptedException -> 0x0079 }
        r3 = r3.append(r14);	 Catch:{ InterruptedException -> 0x0079 }
        r3 = r3.toString();	 Catch:{ InterruptedException -> 0x0079 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ InterruptedException -> 0x0079 }
    L_0x006b:
        r12 = r2 + 1;
        r0 = r18;
        r2 = r0.i;	 Catch:{ InterruptedException -> 0x007b }
        r2 = r2.a();	 Catch:{ InterruptedException -> 0x007b }
        if (r2 != 0) goto L_0x007d;
    L_0x0077:
        r2 = 0;
    L_0x0078:
        return r2;
    L_0x0079:
        r2 = move-exception;
        throw r2;
    L_0x007b:
        r2 = move-exception;
        throw r2;
    L_0x007d:
        r2 = r10.get();
        r2 = (com.whatsapp.gdrive.eo) r2;
        if (r2 == 0) goto L_0x0096;
    L_0x0085:
        r3 = r2 instanceof com.whatsapp.gdrive.ez;	 Catch:{ InterruptedException -> 0x008e }
        if (r3 == 0) goto L_0x0090;
    L_0x0089:
        r2 = (com.whatsapp.gdrive.ez) r2;	 Catch:{ InterruptedException -> 0x008c }
        throw r2;	 Catch:{ InterruptedException -> 0x008c }
    L_0x008c:
        r2 = move-exception;
        throw r2;
    L_0x008e:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x008c }
    L_0x0090:
        r3 = new java.lang.IllegalStateException;
        r3.<init>(r2);
        throw r3;
    L_0x0096:
        r0 = r18;
        r2 = r0.o;
        r6 = (long) r12;
        r0 = (long) r14;
        r16 = r0;
        r0 = r16;
        r2.d(r6, r0);
        r0 = r18;
        r2 = r0.al;
        r7 = r2.c(r8);
        r2 = com.whatsapp.gdrive.fn.c(r8);
        if (r2 != 0) goto L_0x00d0;
    L_0x00b1:
        r3 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x011a }
        r3.<init>();	 Catch:{ InterruptedException -> 0x011a }
        r5 = bb;	 Catch:{ InterruptedException -> 0x011a }
        r6 = 528; // 0x210 float:7.4E-43 double:2.61E-321;
        r5 = r5[r6];	 Catch:{ InterruptedException -> 0x011a }
        r3 = r3.append(r5);	 Catch:{ InterruptedException -> 0x011a }
        r3 = r3.append(r8);	 Catch:{ InterruptedException -> 0x011a }
        r3 = r3.toString();	 Catch:{ InterruptedException -> 0x011a }
        com.whatsapp.util.Log.e(r3);	 Catch:{ InterruptedException -> 0x011a }
        r11.countDown();	 Catch:{ InterruptedException -> 0x011a }
        if (r13 == 0) goto L_0x0141;
    L_0x00d0:
        r6 = new java.io.File;
        r6.<init>(r2);
        r2 = 0;
        r5 = r20.iterator();
        r3 = r2;
    L_0x00db:
        r2 = r5.hasNext();
        if (r2 == 0) goto L_0x0148;
    L_0x00e1:
        r2 = r5.next();
        r2 = (java.lang.String) r2;
        r2 = r8.startsWith(r2);
        if (r2 == 0) goto L_0x0146;
    L_0x00ed:
        r2 = 1;
        if (r13 == 0) goto L_0x00f2;
    L_0x00f0:
        if (r13 == 0) goto L_0x0144;
    L_0x00f2:
        if (r2 != 0) goto L_0x00f9;
    L_0x00f4:
        r11.countDown();	 Catch:{ InterruptedException -> 0x011c }
        if (r13 == 0) goto L_0x0107;
    L_0x00f9:
        r2 = new com.whatsapp.gdrive.cv;	 Catch:{ InterruptedException -> 0x011e }
        r3 = r18;
        r5 = r21;
        r9 = r19;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ InterruptedException -> 0x011e }
        com.whatsapp.gdrive.c0.a(r2);	 Catch:{ InterruptedException -> 0x011e }
    L_0x0107:
        if (r13 == 0) goto L_0x0141;
    L_0x0109:
        r2 = r10.get();
        r2 = (com.whatsapp.gdrive.eo) r2;
        if (r2 == 0) goto L_0x0128;
    L_0x0111:
        r3 = r2 instanceof com.whatsapp.gdrive.ez;	 Catch:{ InterruptedException -> 0x0120 }
        if (r3 == 0) goto L_0x0122;
    L_0x0115:
        r2 = (com.whatsapp.gdrive.ez) r2;	 Catch:{ InterruptedException -> 0x0118 }
        throw r2;	 Catch:{ InterruptedException -> 0x0118 }
    L_0x0118:
        r2 = move-exception;
        throw r2;
    L_0x011a:
        r2 = move-exception;
        throw r2;
    L_0x011c:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x011e }
    L_0x011e:
        r2 = move-exception;
        throw r2;
    L_0x0120:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0118 }
    L_0x0122:
        r3 = new java.lang.IllegalStateException;
        r3.<init>(r2);
        throw r3;
    L_0x0128:
        r2 = bb;	 Catch:{ InterruptedException -> 0x013a }
        r3 = 526; // 0x20e float:7.37E-43 double:2.6E-321;
        r2 = r2[r3];	 Catch:{ InterruptedException -> 0x013a }
        com.whatsapp.util.Log.i(r2);	 Catch:{ InterruptedException -> 0x013a }
        r11.await();	 Catch:{ InterruptedException -> 0x013a }
        r2 = r4.get();
        goto L_0x0078;
    L_0x013a:
        r2 = move-exception;
        com.whatsapp.util.Log.a(r2);
        r2 = 0;
        goto L_0x0078;
    L_0x0141:
        r2 = r12;
        goto L_0x0036;
    L_0x0144:
        r3 = r2;
        goto L_0x00db;
    L_0x0146:
        r2 = r3;
        goto L_0x00f0;
    L_0x0148:
        r2 = r3;
        goto L_0x00f2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.a(java.util.List, java.util.Set, boolean):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean H() {
        /*
        r9 = this;
        r7 = 0;
        r8 = c;
        r0 = r9.al;
        r1 = r9.N;
        r0 = r0.b(r1);
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        r0 = r7;
    L_0x000e:
        return r0;
    L_0x000f:
        r1 = r9.al;	 Catch:{ JSONException -> 0x003a }
        r2 = r9.r;	 Catch:{ JSONException -> 0x003a }
        r4 = Y();	 Catch:{ JSONException -> 0x003a }
        r5 = j();	 Catch:{ JSONException -> 0x003a }
        r6 = s();	 Catch:{ JSONException -> 0x003a }
        r1 = r1.a(r2, r4, r5, r6);	 Catch:{ JSONException -> 0x003a }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x003a }
        r2 = r9.N;
        r2 = r9.a(r2);
        if (r2 != 0) goto L_0x0048;
    L_0x002f:
        r0 = bb;	 Catch:{ JSONException -> 0x0046 }
        r1 = 375; // 0x177 float:5.25E-43 double:1.853E-321;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x0046 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x0046 }
        r0 = r7;
        goto L_0x000e;
    L_0x003a:
        r0 = move-exception;
        r1 = bb;
        r2 = 384; // 0x180 float:5.38E-43 double:1.897E-321;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r0 = r7;
        goto L_0x000e;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r3 = r9.N;	 Catch:{ FileNotFoundException -> 0x007f, ez -> 0x0261 }
        r4 = new com.whatsapp.gdrive.h;	 Catch:{ FileNotFoundException -> 0x007f, ez -> 0x0261 }
        r4.<init>(r9, r2, r0, r1);	 Catch:{ FileNotFoundException -> 0x007f, ez -> 0x0261 }
        r0 = bb;	 Catch:{ FileNotFoundException -> 0x007f, ez -> 0x0261 }
        r1 = 389; // 0x185 float:5.45E-43 double:1.92E-321;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x007f, ez -> 0x0261 }
        r0 = com.whatsapp.gdrive.by.a(r3, r4, r0);	 Catch:{ FileNotFoundException -> 0x007f, ez -> 0x0261 }
        r0 = (com.whatsapp.gdrive.fs) r0;	 Catch:{ FileNotFoundException -> 0x007f, ez -> 0x0261 }
        if (r0 != 0) goto L_0x0091;
    L_0x005d:
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x008f }
        r0.<init>();	 Catch:{ JSONException -> 0x008f }
        r1 = bb;	 Catch:{ JSONException -> 0x008f }
        r2 = 387; // 0x183 float:5.42E-43 double:1.91E-321;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x008f }
        r0 = r0.append(r1);	 Catch:{ JSONException -> 0x008f }
        r1 = r9.N;	 Catch:{ JSONException -> 0x008f }
        r1 = r9.a(r1);	 Catch:{ JSONException -> 0x008f }
        r0 = r0.append(r1);	 Catch:{ JSONException -> 0x008f }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x008f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x008f }
        r0 = r7;
        goto L_0x000e;
    L_0x007f:
        r0 = move-exception;
    L_0x0080:
        r1 = bb;
        r2 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r1 = new com.whatsapp.gdrive.en;
        r1.<init>(r0);
        throw r1;
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r1 = r9.N;
        r1 = r9.a(r1);
        if (r1 != 0) goto L_0x00a7;
    L_0x0099:
        r0 = new java.lang.IllegalStateException;	 Catch:{ JSONException -> 0x00a5 }
        r1 = bb;	 Catch:{ JSONException -> 0x00a5 }
        r2 = 379; // 0x17b float:5.31E-43 double:1.873E-321;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x00a5 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x00a5 }
        throw r0;	 Catch:{ JSONException -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r9.p();
        r2 = r9.N;	 Catch:{ ee -> 0x010d }
        r3 = new com.whatsapp.gdrive.o;	 Catch:{ ee -> 0x010d }
        r3.<init>(r9, r1, r0);	 Catch:{ ee -> 0x010d }
        r1 = bb;	 Catch:{ ee -> 0x010d }
        r4 = 381; // 0x17d float:5.34E-43 double:1.88E-321;
        r1 = r1[r4];	 Catch:{ ee -> 0x010d }
        r1 = com.whatsapp.gdrive.by.a(r2, r3, r1);	 Catch:{ ee -> 0x010d }
        r1 = (java.lang.Boolean) r1;	 Catch:{ ee -> 0x010d }
        if (r1 != 0) goto L_0x00c1;
    L_0x00bf:
        r1 = java.lang.Boolean.FALSE;	 Catch:{ ee -> 0x010d }
    L_0x00c1:
        r1 = r1.booleanValue();	 Catch:{ JSONException -> 0x011d }
        if (r1 == 0) goto L_0x00dc;
    L_0x00c7:
        r1 = r9.N;	 Catch:{ JSONException -> 0x011d }
        r1 = r9.b(r1);	 Catch:{ JSONException -> 0x011d }
        r2 = bb;	 Catch:{ JSONException -> 0x011d }
        r3 = 374; // 0x176 float:5.24E-43 double:1.85E-321;
        r2 = r2[r3];	 Catch:{ JSONException -> 0x011d }
        r3 = r0.g();	 Catch:{ JSONException -> 0x011d }
        r1.a(r2, r3);	 Catch:{ JSONException -> 0x011d }
        if (r8 == 0) goto L_0x0121;
    L_0x00dc:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x011f }
        r1.<init>();	 Catch:{ JSONException -> 0x011f }
        r2 = bb;	 Catch:{ JSONException -> 0x011f }
        r3 = 377; // 0x179 float:5.28E-43 double:1.863E-321;
        r2 = r2[r3];	 Catch:{ JSONException -> 0x011f }
        r1 = r1.append(r2);	 Catch:{ JSONException -> 0x011f }
        r0 = r1.append(r0);	 Catch:{ JSONException -> 0x011f }
        r1 = bb;	 Catch:{ JSONException -> 0x011f }
        r2 = 380; // 0x17c float:5.32E-43 double:1.877E-321;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x011f }
        r0 = r0.append(r1);	 Catch:{ JSONException -> 0x011f }
        r1 = bb;	 Catch:{ JSONException -> 0x011f }
        r2 = 373; // 0x175 float:5.23E-43 double:1.843E-321;
        r1 = r1[r2];	 Catch:{ JSONException -> 0x011f }
        r0 = r0.append(r1);	 Catch:{ JSONException -> 0x011f }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x011f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ JSONException -> 0x011f }
        r0 = r7;
        goto L_0x000e;
    L_0x010d:
        r0 = move-exception;
        r1 = bb;
        r2 = 378; // 0x17a float:5.3E-43 double:1.87E-321;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r1 = new com.whatsapp.gdrive.ew;
        r1.<init>(r0);
        throw r1;
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x011f }
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r2 = new java.util.ArrayList;
        r1 = r9.al;
        r1 = r1.e();
        r2.<init>(r1);
        r3 = r2.iterator();
    L_0x0130:
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x0158;
    L_0x0136:
        r1 = r3.next();
        r1 = (com.whatsapp.gdrive.fs) r1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = bb;
        r6 = 369; // 0x171 float:5.17E-43 double:1.823E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r1 = r4.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        if (r8 == 0) goto L_0x0130;
    L_0x0158:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x023e }
        r1.<init>();	 Catch:{ JSONException -> 0x023e }
        r3 = bb;	 Catch:{ JSONException -> 0x023e }
        r4 = 382; // 0x17e float:5.35E-43 double:1.887E-321;
        r3 = r3[r4];	 Catch:{ JSONException -> 0x023e }
        r3 = r1.append(r3);	 Catch:{ JSONException -> 0x023e }
        r1 = r9.Z;	 Catch:{ JSONException -> 0x023e }
        if (r1 == 0) goto L_0x0240;
    L_0x016b:
        r1 = r9.Z;	 Catch:{ JSONException -> 0x023e }
        r1 = r1.size();	 Catch:{ JSONException -> 0x023e }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ JSONException -> 0x023e }
    L_0x0175:
        r1 = r3.append(r1);	 Catch:{ JSONException -> 0x0248 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0248 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ JSONException -> 0x0248 }
        r1 = r9.Z;	 Catch:{ JSONException -> 0x0248 }
        if (r1 == 0) goto L_0x0215;
    L_0x0184:
        r1 = r9.Z;	 Catch:{ JSONException -> 0x0248 }
        r1 = r1.size();	 Catch:{ JSONException -> 0x0248 }
        if (r1 <= 0) goto L_0x0215;
    L_0x018c:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = bb;
        r4 = 385; // 0x181 float:5.4E-43 double:1.9E-321;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r4 = r0.c();
        r1 = r1.append(r4);
        r3 = " ";
        r1 = r1.append(r3);
        r4 = r0.c();
        r3 = com.whatsapp.util.cs.o(r9, r4);
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r9.Z;
        r3 = r1.iterator();
    L_0x01c3:
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x0210;
    L_0x01c9:
        r1 = r3.next();
        r1 = (com.whatsapp.gdrive.fs) r1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = bb;
        r6 = 372; // 0x174 float:5.21E-43 double:1.84E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r1);
        r5 = bb;
        r6 = 370; // 0x172 float:5.18E-43 double:1.83E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r6 = r1.c();
        r4 = r4.append(r6);
        r5 = " ";
        r4 = r4.append(r5);
        r6 = r1.c();
        r1 = com.whatsapp.util.cs.o(r9, r6);
        r1 = r4.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        if (r8 == 0) goto L_0x01c3;
    L_0x0210:
        r1 = r9.Z;
        r2.addAll(r1);
    L_0x0215:
        r1 = r2.size();	 Catch:{ JSONException -> 0x024a }
        if (r1 <= 0) goto L_0x0257;
    L_0x021b:
        r1 = r9.N;	 Catch:{ ee -> 0x024c }
        r3 = new com.whatsapp.gdrive.p;	 Catch:{ ee -> 0x024c }
        r3.<init>(r9, r2);	 Catch:{ ee -> 0x024c }
        r2 = bb;	 Catch:{ ee -> 0x024c }
        r4 = 371; // 0x173 float:5.2E-43 double:1.833E-321;
        r2 = r2[r4];	 Catch:{ ee -> 0x024c }
        com.whatsapp.gdrive.by.a(r1, r3, r2);	 Catch:{ ee -> 0x024c }
    L_0x022b:
        r1 = r9.al;
        r1.c(r0);
        r1 = r9.al;
        r1.f();
        r0 = java.util.Collections.singletonList(r0);
        r9.Z = r0;
        r0 = 1;
        goto L_0x000e;
    L_0x023e:
        r0 = move-exception;
        throw r0;
    L_0x0240:
        r1 = bb;
        r4 = 388; // 0x184 float:5.44E-43 double:1.917E-321;
        r1 = r1[r4];
        goto L_0x0175;
    L_0x0248:
        r0 = move-exception;
        throw r0;
    L_0x024a:
        r0 = move-exception;
        throw r0;
    L_0x024c:
        r1 = move-exception;
        r2 = bb;
        r3 = 386; // 0x182 float:5.41E-43 double:1.907E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x022b;
    L_0x0257:
        r1 = bb;
        r2 = 383; // 0x17f float:5.37E-43 double:1.89E-321;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        goto L_0x022b;
    L_0x0261:
        r0 = move-exception;
        goto L_0x0080;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.H():boolean");
    }

    private File q() {
        AtomicReference atomicReference = new AtomicReference();
        try {
            Boolean bool = (Boolean) by.a(this.N, new ak(this, atomicReference), bb[539] + atomicReference);
            try {
                if (r()) {
                    if (bool != null) {
                        try {
                            if (bool.booleanValue()) {
                                return (File) atomicReference.get();
                            }
                        } catch (eo e) {
                            throw e;
                        }
                    }
                    Log.e(bb[541] + atomicReference + bb[542]);
                    throw new e5(bb[543] + atomicReference + bb[538]);
                }
                Log.i(bb[540]);
                return null;
            } catch (eo e2) {
                throw e2;
            }
        } catch (Throwable e3) {
            throw new IllegalStateException(bb[544], e3);
        }
    }

    private boolean d(@NonNull bs bsVar) {
        try {
            this.g = (fs) by.a(this.N, new x(this), bb[215]);
            if (this.g == null) {
                Log.e(bb[214]);
                return false;
            }
            fs b = b(bsVar);
            if (b == null) {
                try {
                    Log.e(bb[216]);
                    return false;
                } catch (ee e) {
                    throw e;
                }
            }
            try {
                return a(b, this.g, bsVar);
            } catch (Throwable e2) {
                throw new ew(e2);
            }
        } catch (ee e3) {
            throw e3;
        }
    }

    private static boolean ar() {
        return S().getBoolean(bb[568], false);
    }

    private boolean ay() {
        fs b = b(this.N);
        if (b == null) {
            try {
                Log.e(bb[410]);
                return false;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        String b2 = b.b(bb[411]);
        if (b2 == null) {
            return false;
        }
        try {
            if (Boolean.parseBoolean(b2)) {
                return true;
            }
            return false;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean Q() {
        /*
        r14 = this;
        r10 = 2;
        r13 = 100;
        r7 = 1;
        r6 = 0;
        r8 = c;
        r0 = bb;	 Catch:{ ee -> 0x0020 }
        r1 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r0 = r0[r1];	 Catch:{ ee -> 0x0020 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x0020 }
        r0 = ag();	 Catch:{ ee -> 0x0020 }
        if (r0 == 0) goto L_0x0022;
    L_0x0016:
        r0 = bb;	 Catch:{ ee -> 0x0020 }
        r1 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r0 = r0[r1];	 Catch:{ ee -> 0x0020 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x0020 }
    L_0x001f:
        return r6;
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = r14.N;	 Catch:{ ee -> 0x007d }
        r0 = r0.a();	 Catch:{ ee -> 0x007d }
        if (r0 == 0) goto L_0x001f;
    L_0x002a:
        r0 = r14.B;	 Catch:{ ee -> 0x007f }
        if (r0 != 0) goto L_0x0050;
    L_0x002e:
        r0 = bb;	 Catch:{ ee -> 0x007f }
        r1 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r0 = r0[r1];	 Catch:{ ee -> 0x007f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x007f }
        r0 = r14.L;	 Catch:{ ee -> 0x007f }
        r1 = bb;	 Catch:{ ee -> 0x007f }
        r2 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r1 = r1[r2];	 Catch:{ ee -> 0x007f }
        r2 = r14.z;	 Catch:{ ee -> 0x007f }
        r3 = bb;	 Catch:{ ee -> 0x007f }
        r4 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r3 = r3[r4];	 Catch:{ ee -> 0x007f }
        r4 = r14.N;	 Catch:{ ee -> 0x007f }
        r5 = 1;
        r0 = r0.a(r1, r2, r3, r4, r5);	 Catch:{ ee -> 0x007f }
        r14.B = r0;	 Catch:{ ee -> 0x007f }
    L_0x0050:
        r0 = r14.B;	 Catch:{ ee -> 0x007b }
        if (r0 != 0) goto L_0x0081;
    L_0x0054:
        r0 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x007b }
        r0.<init>();	 Catch:{ ee -> 0x007b }
        r1 = bb;	 Catch:{ ee -> 0x007b }
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r1 = r1[r2];	 Catch:{ ee -> 0x007b }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x007b }
        r1 = r14.z;	 Catch:{ ee -> 0x007b }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x007b }
        r1 = bb;	 Catch:{ ee -> 0x007b }
        r2 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r1 = r1[r2];	 Catch:{ ee -> 0x007b }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x007b }
        r0 = r0.toString();	 Catch:{ ee -> 0x007b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x007b }
        goto L_0x001f;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r0 = r14.j;	 Catch:{ ee -> 0x00d4 }
        if (r0 != 0) goto L_0x00a6;
    L_0x0085:
        r0 = bb;	 Catch:{ ee -> 0x00d4 }
        r1 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r0 = r0[r1];	 Catch:{ ee -> 0x00d4 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x00d4 }
        r0 = r14.L;	 Catch:{ ee -> 0x00d4 }
        r1 = bb;	 Catch:{ ee -> 0x00d4 }
        r2 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r1 = r1[r2];	 Catch:{ ee -> 0x00d4 }
        r2 = r14.y;	 Catch:{ ee -> 0x00d4 }
        r3 = bb;	 Catch:{ ee -> 0x00d4 }
        r4 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r3 = r3[r4];	 Catch:{ ee -> 0x00d4 }
        r4 = r14.N;	 Catch:{ ee -> 0x00d4 }
        r0 = r0.a(r1, r2, r3, r4);	 Catch:{ ee -> 0x00d4 }
        r14.j = r0;	 Catch:{ ee -> 0x00d4 }
    L_0x00a6:
        r0 = r14.j;	 Catch:{ ee -> 0x00d2 }
        if (r0 != 0) goto L_0x00d6;
    L_0x00aa:
        r0 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x00d2 }
        r0.<init>();	 Catch:{ ee -> 0x00d2 }
        r1 = bb;	 Catch:{ ee -> 0x00d2 }
        r2 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r1 = r1[r2];	 Catch:{ ee -> 0x00d2 }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x00d2 }
        r1 = r14.y;	 Catch:{ ee -> 0x00d2 }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x00d2 }
        r1 = bb;	 Catch:{ ee -> 0x00d2 }
        r2 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r1 = r1[r2];	 Catch:{ ee -> 0x00d2 }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x00d2 }
        r0 = r0.toString();	 Catch:{ ee -> 0x00d2 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x00d2 }
        goto L_0x001f;
    L_0x00d2:
        r0 = move-exception;
        throw r0;
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r0 = r14.N;
        r0 = r14.b(r0);
        r1 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x0103 }
        r1.<init>();	 Catch:{ ee -> 0x0103 }
        r2 = bb;	 Catch:{ ee -> 0x0103 }
        r3 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r2 = r2[r3];	 Catch:{ ee -> 0x0103 }
        r1 = r1.append(r2);	 Catch:{ ee -> 0x0103 }
        r1 = r1.append(r0);	 Catch:{ ee -> 0x0103 }
        r1 = r1.toString();	 Catch:{ ee -> 0x0103 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ee -> 0x0103 }
        if (r0 != 0) goto L_0x0105;
    L_0x00f8:
        r0 = bb;	 Catch:{ ee -> 0x0103 }
        r1 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r0 = r0[r1];	 Catch:{ ee -> 0x0103 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x0103 }
        goto L_0x001f;
    L_0x0103:
        r0 = move-exception;
        throw r0;
    L_0x0105:
        r1 = r0.g();
        if (r1 != 0) goto L_0x0114;
    L_0x010b:
        r0 = bb;	 Catch:{ ee -> 0x0129 }
        r2 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r0 = r0[r2];	 Catch:{ ee -> 0x0129 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x0129 }
    L_0x0114:
        r0 = r14.N;
        r2 = r14.c(r0);
        if (r2 != 0) goto L_0x012b;
    L_0x011c:
        r0 = bb;	 Catch:{ ee -> 0x0127 }
        r1 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r0 = r0[r1];	 Catch:{ ee -> 0x0127 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x0127 }
        goto L_0x001f;
    L_0x0127:
        r0 = move-exception;
        throw r0;
    L_0x0129:
        r0 = move-exception;
        throw r0;
    L_0x012b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = bb;
        r4 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r3 = r14.B;
        r3 = r3.size();
        r0 = r0.append(r3);
        r3 = bb;
        r4 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r3 = r14.z;
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r14.B;
        r3 = r0.iterator();
    L_0x0161:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x019c;
    L_0x0167:
        r0 = r3.next();
        r0 = (com.whatsapp.gdrive.fs) r0;
        r4 = r0.g();	 Catch:{ ew -> 0x026c }
        r4 = r4.equals(r1);	 Catch:{ ew -> 0x026c }
        if (r4 != 0) goto L_0x019a;
    L_0x0177:
        r4 = new java.lang.StringBuilder;	 Catch:{ ew -> 0x026c }
        r4.<init>();	 Catch:{ ew -> 0x026c }
        r5 = bb;	 Catch:{ ew -> 0x026c }
        r9 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r5 = r5[r9];	 Catch:{ ew -> 0x026c }
        r4 = r4.append(r5);	 Catch:{ ew -> 0x026c }
        r4 = r4.append(r0);	 Catch:{ ew -> 0x026c }
        r4 = r4.toString();	 Catch:{ ew -> 0x026c }
        com.whatsapp.util.Log.i(r4);	 Catch:{ ew -> 0x026c }
        r4 = r0.g();	 Catch:{ ee -> 0x026e }
        r5 = r14.N;	 Catch:{ ee -> 0x026e }
        r14.b(r4, r5);	 Catch:{ ee -> 0x026e }
    L_0x019a:
        if (r8 == 0) goto L_0x0161;
    L_0x019c:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r3 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r14.j;
        r1 = r1.size();
        r0 = r0.append(r1);
        r1 = bb;
        r3 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r14.y;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r14.j;
        r1 = r0.iterator();
    L_0x01d2:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0211;
    L_0x01d8:
        r0 = r1.next();
        r0 = (com.whatsapp.gdrive.fs) r0;
        r3 = r0.g();	 Catch:{ ew -> 0x028b }
        r3 = r3.equals(r2);	 Catch:{ ew -> 0x028b }
        if (r3 != 0) goto L_0x020f;
    L_0x01e8:
        r3 = new java.lang.StringBuilder;	 Catch:{ ew -> 0x028b }
        r3.<init>();	 Catch:{ ew -> 0x028b }
        r4 = bb;	 Catch:{ ew -> 0x028b }
        r5 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r4 = r4[r5];	 Catch:{ ew -> 0x028b }
        r3 = r3.append(r4);	 Catch:{ ew -> 0x028b }
        r4 = r0.g();	 Catch:{ ew -> 0x028b }
        r3 = r3.append(r4);	 Catch:{ ew -> 0x028b }
        r3 = r3.toString();	 Catch:{ ew -> 0x028b }
        com.whatsapp.util.Log.i(r3);	 Catch:{ ew -> 0x028b }
        r3 = r0.g();	 Catch:{ ee -> 0x028d }
        r4 = r14.N;	 Catch:{ ee -> 0x028d }
        r14.b(r3, r4);	 Catch:{ ee -> 0x028d }
    L_0x020f:
        if (r8 == 0) goto L_0x01d2;
    L_0x0211:
        r0 = r14.N;	 Catch:{ ee -> 0x02aa }
        r0 = r0.a();	 Catch:{ ee -> 0x02aa }
        if (r0 == 0) goto L_0x001f;
    L_0x0219:
        r0 = bb;
        r1 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r14.L;
        r1 = new java.lang.String[r10];
        r2 = r14.N;
        r2 = r14.a(r2);
        r1[r6] = r2;
        r2 = r14.N;
        r2 = r14.c(r2);
        r1[r7] = r2;
        r2 = r14.N;
        r2 = r0.a(r1, r2);
        if (r2 != 0) goto L_0x02ac;
    L_0x023e:
        r0 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x026a }
        r0.<init>();	 Catch:{ ee -> 0x026a }
        r1 = bb;	 Catch:{ ee -> 0x026a }
        r2 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r1 = r1[r2];	 Catch:{ ee -> 0x026a }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x026a }
        r1 = r14.N;	 Catch:{ ee -> 0x026a }
        r1 = r14.a(r1);	 Catch:{ ee -> 0x026a }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x026a }
        r1 = bb;	 Catch:{ ee -> 0x026a }
        r2 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r1 = r1[r2];	 Catch:{ ee -> 0x026a }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x026a }
        r0 = r0.toString();	 Catch:{ ee -> 0x026a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x026a }
        goto L_0x001f;
    L_0x026a:
        r0 = move-exception;
        throw r0;
    L_0x026c:
        r0 = move-exception;
        throw r0;
    L_0x026e:
        r4 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = bb;
        r9 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r5 = r5[r9];
        r4 = r4.append(r5);
        r0 = r4.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x019a;
    L_0x028b:
        r0 = move-exception;
        throw r0;
    L_0x028d:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = bb;
        r5 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x020f;
    L_0x02aa:
        r0 = move-exception;
        throw r0;
    L_0x02ac:
        r3 = r2.size();
        r4 = new java.util.ArrayList;
        r4.<init>(r13);
        r1 = r6;
    L_0x02b6:
        r0 = r2.size();
        if (r1 >= r0) goto L_0x03cf;
    L_0x02bc:
        r0 = r4.size();	 Catch:{ ee -> 0x051c }
        if (r0 >= r13) goto L_0x03cf;
    L_0x02c2:
        r0 = r14.N;	 Catch:{ ee -> 0x051c }
        r0 = r0.a();	 Catch:{ ee -> 0x051c }
        if (r0 == 0) goto L_0x001f;
    L_0x02ca:
        r0 = r14.o;
        r5 = r1 * 100;
        r9 = r2.size();
        r5 = r5 / r9;
        r9 = r4.size();
        r9 = r9 * 100;
        r9 = r9 / 100;
        r5 = java.lang.Math.max(r5, r9);
        r0.c(r5);
        r0 = r2.get(r1);
        r0 = (com.whatsapp.gdrive.fs) r0;
        r5 = r0.e();	 Catch:{ ee -> 0x0520 }
        if (r5 != 0) goto L_0x0308;
    L_0x02ee:
        r5 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x0520 }
        r5.<init>();	 Catch:{ ee -> 0x0520 }
        r9 = bb;	 Catch:{ ee -> 0x0520 }
        r10 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r9 = r9[r10];	 Catch:{ ee -> 0x0520 }
        r5 = r5.append(r9);	 Catch:{ ee -> 0x0520 }
        r5 = r5.append(r0);	 Catch:{ ee -> 0x0520 }
        r5 = r5.toString();	 Catch:{ ee -> 0x0520 }
        com.whatsapp.util.Log.e(r5);	 Catch:{ ee -> 0x0520 }
    L_0x0308:
        r5 = r0.g();	 Catch:{ ee -> 0x0522 }
        if (r5 != 0) goto L_0x0334;
    L_0x030e:
        r5 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x0522 }
        r5.<init>();	 Catch:{ ee -> 0x0522 }
        r9 = bb;	 Catch:{ ee -> 0x0522 }
        r10 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r9 = r9[r10];	 Catch:{ ee -> 0x0522 }
        r5 = r5.append(r9);	 Catch:{ ee -> 0x0522 }
        r5 = r5.append(r0);	 Catch:{ ee -> 0x0522 }
        r9 = bb;	 Catch:{ ee -> 0x0522 }
        r10 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r9 = r9[r10];	 Catch:{ ee -> 0x0522 }
        r5 = r5.append(r9);	 Catch:{ ee -> 0x0522 }
        r5 = r5.toString();	 Catch:{ ee -> 0x0522 }
        com.whatsapp.util.Log.e(r5);	 Catch:{ ee -> 0x0522 }
        if (r8 == 0) goto L_0x03cb;
    L_0x0334:
        r5 = r0.g();	 Catch:{ ee -> 0x0524 }
        r9 = r14.N;	 Catch:{ ee -> 0x0524 }
        r9 = r14.a(r9);	 Catch:{ ee -> 0x0524 }
        r5 = r5.equals(r9);	 Catch:{ ee -> 0x0524 }
        if (r5 != 0) goto L_0x03cb;
    L_0x0344:
        r5 = r0.g();	 Catch:{ ee -> 0x0526 }
        r9 = r14.N;	 Catch:{ ee -> 0x0526 }
        r9 = r14.c(r9);	 Catch:{ ee -> 0x0526 }
        r5 = r5.equals(r9);	 Catch:{ ee -> 0x0526 }
        if (r5 == 0) goto L_0x0356;
    L_0x0354:
        if (r8 == 0) goto L_0x03cb;
    L_0x0356:
        r5 = r0.g();	 Catch:{ ee -> 0x052a }
        r9 = r14.al;	 Catch:{ ee -> 0x052a }
        r9 = r9.r();	 Catch:{ ee -> 0x052a }
        r9 = r9.g();	 Catch:{ ee -> 0x052a }
        r5 = r5.equals(r9);	 Catch:{ ee -> 0x052a }
        if (r5 == 0) goto L_0x036c;
    L_0x036a:
        if (r8 == 0) goto L_0x03cb;
    L_0x036c:
        r5 = r14.al;	 Catch:{ ee -> 0x052e }
        r9 = r0.e();	 Catch:{ ee -> 0x052e }
        r5 = r5.c(r9);	 Catch:{ ee -> 0x052e }
        if (r5 == 0) goto L_0x0388;
    L_0x0378:
        r5 = r14.al;	 Catch:{ ee -> 0x0530 }
        r9 = r0.e();	 Catch:{ ee -> 0x0530 }
        r5 = r5.c(r9);	 Catch:{ ee -> 0x0530 }
        r5 = r0.equals(r5);	 Catch:{ ee -> 0x0530 }
        if (r5 != 0) goto L_0x03cb;
    L_0x0388:
        r5 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x0532 }
        r5.<init>();	 Catch:{ ee -> 0x0532 }
        r9 = bb;	 Catch:{ ee -> 0x0532 }
        r10 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r9 = r9[r10];	 Catch:{ ee -> 0x0532 }
        r5 = r5.append(r9);	 Catch:{ ee -> 0x0532 }
        r5 = r5.append(r0);	 Catch:{ ee -> 0x0532 }
        r5 = r5.toString();	 Catch:{ ee -> 0x0532 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ ee -> 0x0532 }
        r5 = r0.f();	 Catch:{ ee -> 0x0532 }
        if (r5 != 0) goto L_0x03ad;
    L_0x03a8:
        r4.add(r0);	 Catch:{ ee -> 0x0534 }
        if (r8 == 0) goto L_0x03cb;
    L_0x03ad:
        r5 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x0536 }
        r5.<init>();	 Catch:{ ee -> 0x0536 }
        r9 = bb;	 Catch:{ ee -> 0x0536 }
        r10 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r9 = r9[r10];	 Catch:{ ee -> 0x0536 }
        r5 = r5.append(r9);	 Catch:{ ee -> 0x0536 }
        r0 = r0.g();	 Catch:{ ee -> 0x0536 }
        r0 = r5.append(r0);	 Catch:{ ee -> 0x0536 }
        r0 = r0.toString();	 Catch:{ ee -> 0x0536 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x0536 }
    L_0x03cb:
        r0 = r1 + 1;
        if (r8 == 0) goto L_0x0553;
    L_0x03cf:
        r1 = r4.size();
        if (r1 != r13) goto L_0x03f9;
    L_0x03d5:
        r0 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x0538 }
        r0.<init>();	 Catch:{ ee -> 0x0538 }
        r5 = bb;	 Catch:{ ee -> 0x0538 }
        r9 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r5 = r5[r9];	 Catch:{ ee -> 0x0538 }
        r0 = r0.append(r5);	 Catch:{ ee -> 0x0538 }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x0538 }
        r5 = bb;	 Catch:{ ee -> 0x0538 }
        r9 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r5 = r5[r9];	 Catch:{ ee -> 0x0538 }
        r0 = r0.append(r5);	 Catch:{ ee -> 0x0538 }
        r0 = r0.toString();	 Catch:{ ee -> 0x0538 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x0538 }
    L_0x03f9:
        r0 = r4.size();	 Catch:{ ee -> 0x053a }
        if (r0 != 0) goto L_0x040a;
    L_0x03ff:
        r0 = bb;	 Catch:{ ee -> 0x053a }
        r5 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r0 = r0[r5];	 Catch:{ ee -> 0x053a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x053a }
        if (r8 == 0) goto L_0x04c0;
    L_0x040a:
        r0 = java.util.Locale.ENGLISH;	 Catch:{ ee -> 0x053c }
        r5 = bb;	 Catch:{ ee -> 0x053c }
        r9 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r5 = r5[r9];	 Catch:{ ee -> 0x053c }
        r9 = 1;
        r9 = new java.lang.Object[r9];	 Catch:{ ee -> 0x053c }
        r10 = 0;
        r11 = java.lang.Integer.valueOf(r1);	 Catch:{ ee -> 0x053c }
        r9[r10] = r11;	 Catch:{ ee -> 0x053c }
        r0 = java.lang.String.format(r0, r5, r9);	 Catch:{ ee -> 0x053c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x053c }
        r0 = 10;
        if (r1 >= r0) goto L_0x044c;
    L_0x0427:
        r0 = r6;
    L_0x0428:
        if (r0 >= r1) goto L_0x044c;
    L_0x042a:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r9 = bb;
        r10 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r9 = r9[r10];
        r5 = r5.append(r9);
        r9 = r4.get(r0);
        r5 = r5.append(r9);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r0 = r0 + 1;
        if (r8 == 0) goto L_0x0428;
    L_0x044c:
        r0 = r14.N;	 Catch:{ ee -> 0x04b6 }
        r5 = new com.whatsapp.gdrive.y;	 Catch:{ ee -> 0x04b6 }
        r5.<init>(r14, r4);	 Catch:{ ee -> 0x04b6 }
        r4 = java.util.Locale.ENGLISH;	 Catch:{ ee -> 0x04b6 }
        r9 = bb;	 Catch:{ ee -> 0x04b6 }
        r10 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r9 = r9[r10];	 Catch:{ ee -> 0x04b6 }
        r10 = 1;
        r10 = new java.lang.Object[r10];	 Catch:{ ee -> 0x04b6 }
        r11 = 0;
        r12 = java.lang.Integer.valueOf(r1);	 Catch:{ ee -> 0x04b6 }
        r10[r11] = r12;	 Catch:{ ee -> 0x04b6 }
        r4 = java.lang.String.format(r4, r9, r10);	 Catch:{ ee -> 0x04b6 }
        r0 = com.whatsapp.gdrive.by.a(r0, r5, r4);	 Catch:{ ee -> 0x04b6 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ ee -> 0x04b6 }
        if (r0 != 0) goto L_0x0473;
    L_0x0471:
        r0 = java.lang.Boolean.FALSE;	 Catch:{ ee -> 0x04b6 }
    L_0x0473:
        r0 = r0.booleanValue();	 Catch:{ ee -> 0x053e }
        if (r0 == 0) goto L_0x049b;
    L_0x0479:
        r0 = java.util.Locale.ENGLISH;	 Catch:{ ee -> 0x053e }
        r4 = bb;	 Catch:{ ee -> 0x053e }
        r5 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r4 = r4[r5];	 Catch:{ ee -> 0x053e }
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ ee -> 0x053e }
        r9 = 0;
        r10 = java.lang.Integer.valueOf(r1);	 Catch:{ ee -> 0x053e }
        r5[r9] = r10;	 Catch:{ ee -> 0x053e }
        r9 = 1;
        r10 = java.lang.Integer.valueOf(r3);	 Catch:{ ee -> 0x053e }
        r5[r9] = r10;	 Catch:{ ee -> 0x053e }
        r0 = java.lang.String.format(r0, r4, r5);	 Catch:{ ee -> 0x053e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x053e }
        if (r8 == 0) goto L_0x04c0;
    L_0x049b:
        r0 = java.util.Locale.ENGLISH;	 Catch:{ ee -> 0x04b6 }
        r4 = bb;	 Catch:{ ee -> 0x04b6 }
        r5 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r4 = r4[r5];	 Catch:{ ee -> 0x04b6 }
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ ee -> 0x04b6 }
        r9 = 0;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ ee -> 0x04b6 }
        r5[r9] = r1;	 Catch:{ ee -> 0x04b6 }
        r0 = java.lang.String.format(r0, r4, r5);	 Catch:{ ee -> 0x04b6 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x04b6 }
        goto L_0x001f;
    L_0x04b6:
        r0 = move-exception;
        r1 = bb;
        r4 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r1 = r1[r4];
        com.whatsapp.util.Log.b(r1, r0);
    L_0x04c0:
        r0 = r14.o;
        r0.c(r13);
        r0 = r14.al;
        r0 = r0.i();
        if (r3 >= r0) goto L_0x0519;
    L_0x04cd:
        r1 = new java.util.TreeSet;
        r1.<init>(r2);
        r0 = r14.al;
        r0 = r0.d();
        r2 = r0.iterator();
    L_0x04dc:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x050a;
    L_0x04e2:
        r0 = r2.next();
        r0 = (com.whatsapp.gdrive.fs) r0;
        r3 = r1.contains(r0);	 Catch:{ ee -> 0x0540 }
        if (r3 != 0) goto L_0x0508;
    L_0x04ee:
        r3 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x0540 }
        r3.<init>();	 Catch:{ ee -> 0x0540 }
        r4 = bb;	 Catch:{ ee -> 0x0540 }
        r5 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r4 = r4[r5];	 Catch:{ ee -> 0x0540 }
        r3 = r3.append(r4);	 Catch:{ ee -> 0x0540 }
        r0 = r3.append(r0);	 Catch:{ ee -> 0x0540 }
        r0 = r0.toString();	 Catch:{ ee -> 0x0540 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x0540 }
    L_0x0508:
        if (r8 == 0) goto L_0x04dc;
    L_0x050a:
        r0 = r14.O();	 Catch:{ ee -> 0x0542 }
        if (r0 != 0) goto L_0x0519;
    L_0x0510:
        r0 = bb;	 Catch:{ ee -> 0x0542 }
        r1 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r0 = r0[r1];	 Catch:{ ee -> 0x0542 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x0542 }
    L_0x0519:
        r6 = r7;
        goto L_0x001f;
    L_0x051c:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x051e }
    L_0x051e:
        r0 = move-exception;
        throw r0;
    L_0x0520:
        r0 = move-exception;
        throw r0;
    L_0x0522:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0524 }
    L_0x0524:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0526 }
    L_0x0526:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0528 }
    L_0x0528:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x052a }
    L_0x052a:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x052c }
    L_0x052c:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x052e }
    L_0x052e:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0530 }
    L_0x0530:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0532 }
    L_0x0532:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0534 }
    L_0x0534:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0536 }
    L_0x0536:
        r0 = move-exception;
        throw r0;
    L_0x0538:
        r0 = move-exception;
        throw r0;
    L_0x053a:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x053c }
    L_0x053c:
        r0 = move-exception;
        throw r0;
    L_0x053e:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x04b6 }
    L_0x0540:
        r0 = move-exception;
        throw r0;
    L_0x0542:
        r0 = move-exception;
        throw r0;	 Catch:{ ew -> 0x0544, e9 -> 0x054f, et -> 0x0551 }
    L_0x0544:
        r0 = move-exception;
    L_0x0545:
        r1 = bb;
        r2 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0519;
    L_0x054f:
        r0 = move-exception;
        goto L_0x0545;
    L_0x0551:
        r0 = move-exception;
        goto L_0x0545;
    L_0x0553:
        r1 = r0;
        goto L_0x02b6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.Q():boolean");
    }

    private static boolean aj() {
        try {
            if (m.block(86400000)) {
                return true;
            }
            Log.e(bb[218]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static bs r(GoogleDriveService googleDriveService) {
        return googleDriveService.ak;
    }

    static Set b(Context context) {
        Set hashSet = new HashSet();
        hashSet.add(k.b(context));
        return hashSet;
    }

    static boolean G() {
        return D();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(@android.support.annotation.NonNull java.util.ArrayList r13, int r14) {
        /*
        r12 = this;
        r3 = c;
        r0 = r12.ak;
        r1 = r12.a(r0);
        r0 = r12.i;
        r2 = r12.c(r0);
        if (r2 == 0) goto L_0x001b;
    L_0x0010:
        r0 = 2;
        r0 = new java.lang.String[r0];
        r4 = 0;
        r0[r4] = r1;
        r4 = 1;
        r0[r4] = r2;
        if (r3 == 0) goto L_0x0021;
    L_0x001b:
        r0 = 1;
        r0 = new java.lang.String[r0];
        r4 = 0;
        r0[r4] = r1;
    L_0x0021:
        r4 = r12.L;
        r5 = r12.i;
        r4 = r4.a(r0, r5);
        if (r4 != 0) goto L_0x0061;
    L_0x002b:
        r0 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x005f }
        r0.<init>();	 Catch:{ ee -> 0x005f }
        r3 = bb;	 Catch:{ ee -> 0x005f }
        r4 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r3 = r3[r4];	 Catch:{ ee -> 0x005f }
        r0 = r0.append(r3);	 Catch:{ ee -> 0x005f }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x005f }
        r1 = bb;	 Catch:{ ee -> 0x005f }
        r3 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r1 = r1[r3];	 Catch:{ ee -> 0x005f }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x005f }
        r0 = r0.append(r2);	 Catch:{ ee -> 0x005f }
        r1 = bb;	 Catch:{ ee -> 0x005f }
        r2 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r1 = r1[r2];	 Catch:{ ee -> 0x005f }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x005f }
        r0 = r0.toString();	 Catch:{ ee -> 0x005f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x005f }
        r0 = 0;
    L_0x005e:
        return r0;
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r5 = new java.util.HashSet;
        r5.<init>();
        r1 = r13.iterator();
    L_0x006a:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x007f;
    L_0x0070:
        r0 = r1.next();
        r0 = (com.whatsapp.gdrive.fs) r0;
        r0 = r0.e();
        r5.add(r0);
        if (r3 == 0) goto L_0x006a;
    L_0x007f:
        r4 = r4.iterator();
    L_0x0083:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x014e;
    L_0x0089:
        r0 = r4.next();
        r0 = (com.whatsapp.gdrive.fs) r0;
        r1 = r0.e();
        r1 = com.whatsapp.gdrive.fn.c(r1);
        r2 = r0.e();	 Catch:{ ee -> 0x0151 }
        if (r2 == 0) goto L_0x014c;
    L_0x009d:
        r2 = r0.e();	 Catch:{ ee -> 0x0151 }
        r2 = r5.contains(r2);	 Catch:{ ee -> 0x0151 }
        if (r2 == 0) goto L_0x014c;
    L_0x00a7:
        if (r1 != 0) goto L_0x00c9;
    L_0x00a9:
        r2 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x0155 }
        r2.<init>();	 Catch:{ ee -> 0x0155 }
        r6 = bb;	 Catch:{ ee -> 0x0155 }
        r7 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r6 = r6[r7];	 Catch:{ ee -> 0x0155 }
        r2 = r2.append(r6);	 Catch:{ ee -> 0x0155 }
        r6 = r0.e();	 Catch:{ ee -> 0x0155 }
        r2 = r2.append(r6);	 Catch:{ ee -> 0x0155 }
        r2 = r2.toString();	 Catch:{ ee -> 0x0155 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ee -> 0x0155 }
        if (r3 == 0) goto L_0x0083;
    L_0x00c9:
        r6 = new java.io.File;
        r6.<init>(r1);
        r2 = 0;
        r2 = r12.a(r6, r0);	 Catch:{ ee -> 0x0159, ez -> 0x028e }
        if (r2 == 0) goto L_0x00fa;
    L_0x00d5:
        r1 = r12.k;	 Catch:{ ee -> 0x0157, ez -> 0x028e }
        r8 = r0.b();	 Catch:{ ee -> 0x0157, ez -> 0x028e }
        r1.addAndGet(r8);	 Catch:{ ee -> 0x0157, ez -> 0x028e }
        r1 = r12.k;	 Catch:{ ee -> 0x0157, ez -> 0x028e }
        r8 = r1.get();	 Catch:{ ee -> 0x0157, ez -> 0x028e }
        a(r8);	 Catch:{ ee -> 0x0157, ez -> 0x028e }
        r1 = r12.q;	 Catch:{ ee -> 0x0157, ez -> 0x028e }
        r8 = -1;
        r10 = r0.b();	 Catch:{ ee -> 0x0157, ez -> 0x028e }
        r8 = r8 * r10;
        r1.addAndGet(r8);	 Catch:{ ee -> 0x0157, ez -> 0x028e }
        r1 = r0.e();	 Catch:{ ee -> 0x0157, ez -> 0x028e }
        r5.remove(r1);	 Catch:{ ee -> 0x0157, ez -> 0x028e }
    L_0x00fa:
        if (r2 != 0) goto L_0x0112;
    L_0x00fc:
        r1 = r6.exists();	 Catch:{ ee -> 0x01c7 }
        if (r1 == 0) goto L_0x0112;
    L_0x0102:
        r8 = r6.length();	 Catch:{ ee -> 0x01c9 }
        r10 = 0;
        r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r1 != 0) goto L_0x0112;
    L_0x010c:
        r1 = r6.delete();	 Catch:{ ee -> 0x01cb }
        if (r1 == 0) goto L_0x01cf;
    L_0x0112:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r6 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r2 = r2[r6];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = bb;
        r2 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r5.size();
        r0 = r0.append(r1);
        r1 = bb;
        r2 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r14);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x014c:
        if (r3 == 0) goto L_0x0083;
    L_0x014e:
        r0 = 1;
        goto L_0x005e;
    L_0x0151:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0153 }
    L_0x0153:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0155 }
    L_0x0155:
        r0 = move-exception;
        throw r0;
    L_0x0157:
        r1 = move-exception;
        throw r1;	 Catch:{ ee -> 0x0159, ez -> 0x028e }
    L_0x0159:
        r1 = move-exception;
    L_0x015a:
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0215 }
        r7.<init>();	 Catch:{ all -> 0x0215 }
        r8 = bb;	 Catch:{ all -> 0x0215 }
        r9 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r8 = r8[r9];	 Catch:{ all -> 0x0215 }
        r7 = r7.append(r8);	 Catch:{ all -> 0x0215 }
        r7 = r7.append(r6);	 Catch:{ all -> 0x0215 }
        r7 = r7.toString();	 Catch:{ all -> 0x0215 }
        com.whatsapp.util.Log.b(r7, r1);	 Catch:{ all -> 0x0215 }
        if (r2 != 0) goto L_0x018c;
    L_0x0176:
        r1 = r6.exists();	 Catch:{ ee -> 0x01ef }
        if (r1 == 0) goto L_0x018c;
    L_0x017c:
        r8 = r6.length();	 Catch:{ ee -> 0x01ef }
        r10 = 0;
        r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r1 != 0) goto L_0x018c;
    L_0x0186:
        r1 = r6.delete();	 Catch:{ ee -> 0x01f1 }
        if (r1 == 0) goto L_0x01f5;
    L_0x018c:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r6 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r2 = r2[r6];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = bb;
        r2 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r5.size();
        r0 = r0.append(r1);
        r1 = bb;
        r2 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r14);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x014c;
    L_0x01c7:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x01c9 }
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x01cb }
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r7 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r2 = r2[r7];
        r1 = r1.append(r2);
        r2 = r6.getAbsolutePath();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x0112;
    L_0x01ef:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x01f1 }
    L_0x01f1:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x01f3 }
    L_0x01f3:
        r0 = move-exception;
        throw r0;
    L_0x01f5:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r7 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r2 = r2[r7];
        r1 = r1.append(r2);
        r2 = r6.getAbsolutePath();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x018c;
    L_0x0215:
        r1 = move-exception;
        if (r2 != 0) goto L_0x022e;
    L_0x0218:
        r2 = r6.exists();	 Catch:{ ee -> 0x0269 }
        if (r2 == 0) goto L_0x022e;
    L_0x021e:
        r2 = r6.length();	 Catch:{ ee -> 0x026b }
        r8 = 0;
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 != 0) goto L_0x022e;
    L_0x0228:
        r2 = r6.delete();	 Catch:{ ee -> 0x026d }
        if (r2 == 0) goto L_0x026f;
    L_0x022e:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r2 = bb;
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r5.size();
        r0 = r0.append(r2);
        r2 = bb;
        r3 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r14);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        throw r1;
    L_0x0269:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x026b }
    L_0x026b:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x026d }
    L_0x026d:
        r0 = move-exception;
        throw r0;
    L_0x026f:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r6.getAbsolutePath();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        goto L_0x022e;
    L_0x028e:
        r1 = move-exception;
        goto L_0x015a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.a(java.util.ArrayList, int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.util.List r13, java.io.File r14) {
        /*
        r12 = this;
        r2 = c;
        r0 = aj();	 Catch:{ NullPointerException -> 0x0028 }
        if (r0 != 0) goto L_0x002a;
    L_0x0008:
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0028 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x0028 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x0028 }
        r2 = 507; // 0x1fb float:7.1E-43 double:2.505E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0028 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0028 }
        r1 = r14.getAbsolutePath();	 Catch:{ NullPointerException -> 0x0028 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0028 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x0028 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x0028 }
        r0 = 0;
    L_0x0027:
        return r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r3 = new java.util.LinkedList;
        r3.<init>();
        r3.add(r14);
    L_0x0032:
        r0 = r3.peek();
        if (r0 == 0) goto L_0x00c9;
    L_0x0038:
        r0 = r3.poll();
        r0 = (java.io.File) r0;
        r1 = r0.exists();	 Catch:{ NullPointerException -> 0x00cc }
        if (r1 == 0) goto L_0x00a9;
    L_0x0044:
        r1 = r0.isDirectory();	 Catch:{ NullPointerException -> 0x00cc }
        if (r1 == 0) goto L_0x009a;
    L_0x004a:
        r4 = r0.listFiles();
        if (r4 == 0) goto L_0x0098;
    L_0x0050:
        r5 = r4.length;
        r1 = 0;
    L_0x0052:
        if (r1 >= r5) goto L_0x0098;
    L_0x0054:
        r6 = r4[r1];
        r7 = r6.exists();	 Catch:{ NullPointerException -> 0x00ce }
        if (r7 == 0) goto L_0x0076;
    L_0x005c:
        r7 = r6.isDirectory();	 Catch:{ NullPointerException -> 0x00d0 }
        if (r7 == 0) goto L_0x0067;
    L_0x0062:
        r3.add(r6);	 Catch:{ NullPointerException -> 0x00d2 }
        if (r2 == 0) goto L_0x0094;
    L_0x0067:
        r8 = r6.length();	 Catch:{ NullPointerException -> 0x00d4 }
        r10 = 0;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 <= 0) goto L_0x0094;
    L_0x0071:
        r13.add(r6);	 Catch:{ NullPointerException -> 0x00d6 }
        if (r2 == 0) goto L_0x0094;
    L_0x0076:
        r7 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00d6 }
        r7.<init>();	 Catch:{ NullPointerException -> 0x00d6 }
        r8 = bb;	 Catch:{ NullPointerException -> 0x00d6 }
        r9 = 505; // 0x1f9 float:7.08E-43 double:2.495E-321;
        r8 = r8[r9];	 Catch:{ NullPointerException -> 0x00d6 }
        r7 = r7.append(r8);	 Catch:{ NullPointerException -> 0x00d6 }
        r6 = r6.getAbsolutePath();	 Catch:{ NullPointerException -> 0x00d6 }
        r6 = r7.append(r6);	 Catch:{ NullPointerException -> 0x00d6 }
        r6 = r6.toString();	 Catch:{ NullPointerException -> 0x00d6 }
        com.whatsapp.util.Log.w(r6);	 Catch:{ NullPointerException -> 0x00d6 }
    L_0x0094:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0052;
    L_0x0098:
        if (r2 == 0) goto L_0x00c7;
    L_0x009a:
        r4 = r0.length();	 Catch:{ NullPointerException -> 0x00d8 }
        r6 = 0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x00c7;
    L_0x00a4:
        r13.add(r0);	 Catch:{ NullPointerException -> 0x00da }
        if (r2 == 0) goto L_0x00c7;
    L_0x00a9:
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00da }
        r1.<init>();	 Catch:{ NullPointerException -> 0x00da }
        r4 = bb;	 Catch:{ NullPointerException -> 0x00da }
        r5 = 506; // 0x1fa float:7.09E-43 double:2.5E-321;
        r4 = r4[r5];	 Catch:{ NullPointerException -> 0x00da }
        r1 = r1.append(r4);	 Catch:{ NullPointerException -> 0x00da }
        r0 = r0.getAbsolutePath();	 Catch:{ NullPointerException -> 0x00da }
        r0 = r1.append(r0);	 Catch:{ NullPointerException -> 0x00da }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x00da }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NullPointerException -> 0x00da }
    L_0x00c7:
        if (r2 == 0) goto L_0x0032;
    L_0x00c9:
        r0 = 1;
        goto L_0x0027;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.a(java.util.List, java.io.File):boolean");
    }

    private boolean a(boolean z) {
        boolean z2 = c;
        if (z) {
            try {
                String M = M();
            } catch (eo e) {
                throw e;
            }
        }
        M = C();
        if (z) {
            try {
                String C = C();
            } catch (eo e2) {
                throw e2;
            }
        }
        C = M();
        if (M == null || C == null) {
            try {
                throw new IllegalStateException(bb[460] + M + bb[461] + C);
            } catch (eo e22) {
                throw e22;
            }
        }
        try {
            if (!a(this.aj, v)) {
                return false;
            }
            try {
                List<fs> a = this.L.a(bb[454], M, bb[453], v);
                Log.i(bb[456] + this.z + "/" + a.size());
                for (fs g : a) {
                    if (this.L.b(g.g(), C, bb[459])) {
                        if (z2) {
                            break;
                        }
                    }
                    return false;
                }
                if (!z) {
                    a = this.L.a(bb[455], this.y, bb[457], v);
                    Log.i(bb[462] + this.y + "/" + a.size());
                    for (fs g2 : a) {
                        if (b(g2.g(), v)) {
                            if (z2) {
                                break;
                            }
                        }
                        return false;
                    }
                }
                return true;
            } catch (Throwable e3) {
                Log.b(bb[458], e3);
                return false;
            }
        } catch (NullPointerException e4) {
            throw e4;
        }
    }

    public static void w() {
        boolean z = c;
        try {
            auv.b();
            if (v()) {
                if (!ai()) {
                    try {
                        K();
                        l();
                        al();
                        if (ag) {
                            try {
                                if (E) {
                                    try {
                                        if (ah) {
                                            try {
                                                b();
                                                Log.i(bb[115]);
                                                if (!z) {
                                                    return;
                                                }
                                            } catch (NullPointerException e) {
                                                throw e;
                                            }
                                        }
                                    } catch (NullPointerException e2) {
                                        throw e2;
                                    }
                                }
                            } catch (NullPointerException e22) {
                                throw e22;
                            }
                        }
                        try {
                            Log.i(bb[121] + v() + bb[110] + ai() + bb[111] + ag + bb[118] + E + bb[119] + ah);
                            if (!z) {
                                return;
                            }
                        } catch (NullPointerException e222) {
                            throw e222;
                        }
                    } catch (NullPointerException e2222) {
                        throw e2222;
                    }
                }
            }
            try {
                if (ak()) {
                    try {
                        if (!r()) {
                            try {
                                K();
                                l();
                                al();
                                if (ai) {
                                    try {
                                        if (S) {
                                            try {
                                                if (ah) {
                                                    try {
                                                        i();
                                                        Log.i(bb[120]);
                                                        if (!z) {
                                                            return;
                                                        }
                                                    } catch (NullPointerException e22222) {
                                                        throw e22222;
                                                    }
                                                }
                                            } catch (NullPointerException e222222) {
                                                throw e222222;
                                            }
                                        }
                                    } catch (NullPointerException e2222222) {
                                        throw e2222222;
                                    }
                                }
                                try {
                                    Log.i(bb[112] + ak() + bb[114] + r() + bb[113] + ai + bb[116] + S + bb[122] + ah);
                                    if (!z) {
                                        return;
                                    }
                                } catch (NullPointerException e22222222) {
                                    throw e22222222;
                                }
                            } catch (NullPointerException e222222222) {
                                throw e222222222;
                            }
                        }
                    } catch (NullPointerException e2222222222) {
                        throw e2222222222;
                    }
                }
                Log.i(bb[117]);
            } catch (NullPointerException e22222222222) {
                throw e22222222222;
            }
        } catch (NullPointerException e222222222222) {
            throw e222222222222;
        } catch (NullPointerException e2222222222222) {
            throw e2222222222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.whatsapp.gdrive.bi r9) {
        /*
        r8 = this;
        r6 = 0;
        r0 = c;
        r1 = r8.o;	 Catch:{ NullPointerException -> 0x016b }
        r1.registerObserver(r9);	 Catch:{ NullPointerException -> 0x016b }
        r1 = ak();	 Catch:{ NullPointerException -> 0x016b }
        if (r1 != 0) goto L_0x0015;
    L_0x000f:
        r1 = r();	 Catch:{ NullPointerException -> 0x016d }
        if (r1 == 0) goto L_0x00a2;
    L_0x0015:
        r1 = ai;	 Catch:{ NullPointerException -> 0x016f }
        if (r1 != 0) goto L_0x0037;
    L_0x0019:
        r1 = X;	 Catch:{ NullPointerException -> 0x0171 }
        if (r1 != 0) goto L_0x002a;
    L_0x001d:
        r1 = r8.M;	 Catch:{ NullPointerException -> 0x0173 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x0173 }
        r4 = r8.n;	 Catch:{ NullPointerException -> 0x0173 }
        r9.j(r2, r4);	 Catch:{ NullPointerException -> 0x0173 }
        if (r0 == 0) goto L_0x0097;
    L_0x002a:
        r1 = r8.M;	 Catch:{ NullPointerException -> 0x0175 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x0175 }
        r4 = r8.n;	 Catch:{ NullPointerException -> 0x0175 }
        r9.e(r2, r4);	 Catch:{ NullPointerException -> 0x0175 }
        if (r0 == 0) goto L_0x0097;
    L_0x0037:
        r1 = S;	 Catch:{ NullPointerException -> 0x0177 }
        if (r1 != 0) goto L_0x0048;
    L_0x003b:
        r1 = r8.M;	 Catch:{ NullPointerException -> 0x0179 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x0179 }
        r4 = r8.n;	 Catch:{ NullPointerException -> 0x0179 }
        r9.g(r2, r4);	 Catch:{ NullPointerException -> 0x0179 }
        if (r0 == 0) goto L_0x0097;
    L_0x0048:
        r1 = ah;	 Catch:{ NullPointerException -> 0x017b }
        if (r1 != 0) goto L_0x0076;
    L_0x004c:
        r1 = bb;	 Catch:{ NullPointerException -> 0x017d }
        r2 = 366; // 0x16e float:5.13E-43 double:1.81E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x017d }
        r2 = android.os.Environment.getExternalStorageState();	 Catch:{ NullPointerException -> 0x017d }
        r1 = r1.equals(r2);	 Catch:{ NullPointerException -> 0x017d }
        if (r1 == 0) goto L_0x0069;
    L_0x005c:
        r1 = r8.M;	 Catch:{ NullPointerException -> 0x017f }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x017f }
        r4 = r8.n;	 Catch:{ NullPointerException -> 0x017f }
        r9.k(r2, r4);	 Catch:{ NullPointerException -> 0x017f }
        if (r0 == 0) goto L_0x0097;
    L_0x0069:
        r1 = r8.M;	 Catch:{ NullPointerException -> 0x0181 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x0181 }
        r4 = r8.n;	 Catch:{ NullPointerException -> 0x0181 }
        r9.f(r2, r4);	 Catch:{ NullPointerException -> 0x0181 }
        if (r0 == 0) goto L_0x0097;
    L_0x0076:
        r2 = r8.n;	 Catch:{ NullPointerException -> 0x0183 }
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x0089;
    L_0x007c:
        r1 = r8.M;	 Catch:{ NullPointerException -> 0x0185 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x0185 }
        r4 = r8.n;	 Catch:{ NullPointerException -> 0x0185 }
        r9.i(r2, r4);	 Catch:{ NullPointerException -> 0x0185 }
        if (r0 == 0) goto L_0x0097;
    L_0x0089:
        r1 = ak();	 Catch:{ NullPointerException -> 0x0187 }
        if (r1 == 0) goto L_0x0094;
    L_0x008f:
        r9.g();	 Catch:{ NullPointerException -> 0x0189 }
        if (r0 == 0) goto L_0x0097;
    L_0x0094:
        r9.d();	 Catch:{ NullPointerException -> 0x0189 }
    L_0x0097:
        r1 = r8.o;	 Catch:{ NullPointerException -> 0x018b }
        r2 = r8.o();	 Catch:{ NullPointerException -> 0x018b }
        r1.b(r2);	 Catch:{ NullPointerException -> 0x018b }
        if (r0 == 0) goto L_0x016a;
    L_0x00a2:
        r1 = ai();	 Catch:{ NullPointerException -> 0x018d }
        if (r1 != 0) goto L_0x00ae;
    L_0x00a8:
        r1 = v();	 Catch:{ NullPointerException -> 0x018f }
        if (r1 == 0) goto L_0x0137;
    L_0x00ae:
        r1 = ag;	 Catch:{ NullPointerException -> 0x0191 }
        if (r1 != 0) goto L_0x00d0;
    L_0x00b2:
        r1 = u;	 Catch:{ NullPointerException -> 0x0193 }
        if (r1 != 0) goto L_0x00c3;
    L_0x00b6:
        r1 = r8.k;	 Catch:{ NullPointerException -> 0x0195 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x0195 }
        r4 = r8.b;	 Catch:{ NullPointerException -> 0x0195 }
        r9.d(r2, r4);	 Catch:{ NullPointerException -> 0x0195 }
        if (r0 == 0) goto L_0x012c;
    L_0x00c3:
        r1 = r8.k;	 Catch:{ NullPointerException -> 0x0197 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x0197 }
        r4 = r8.b;	 Catch:{ NullPointerException -> 0x0197 }
        r9.h(r2, r4);	 Catch:{ NullPointerException -> 0x0197 }
        if (r0 == 0) goto L_0x012c;
    L_0x00d0:
        r1 = E;	 Catch:{ NullPointerException -> 0x0199 }
        if (r1 != 0) goto L_0x00e1;
    L_0x00d4:
        r1 = r8.k;	 Catch:{ NullPointerException -> 0x019b }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x019b }
        r4 = r8.b;	 Catch:{ NullPointerException -> 0x019b }
        r9.l(r2, r4);	 Catch:{ NullPointerException -> 0x019b }
        if (r0 == 0) goto L_0x012c;
    L_0x00e1:
        r1 = ah;	 Catch:{ NullPointerException -> 0x019d }
        if (r1 != 0) goto L_0x010f;
    L_0x00e5:
        r1 = bb;	 Catch:{ NullPointerException -> 0x019f }
        r2 = 368; // 0x170 float:5.16E-43 double:1.82E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x019f }
        r2 = android.os.Environment.getExternalStorageState();	 Catch:{ NullPointerException -> 0x019f }
        r1 = r1.equals(r2);	 Catch:{ NullPointerException -> 0x019f }
        if (r1 == 0) goto L_0x0102;
    L_0x00f5:
        r1 = r8.k;	 Catch:{ NullPointerException -> 0x01a1 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x01a1 }
        r4 = r8.b;	 Catch:{ NullPointerException -> 0x01a1 }
        r9.b(r2, r4);	 Catch:{ NullPointerException -> 0x01a1 }
        if (r0 == 0) goto L_0x012c;
    L_0x0102:
        r1 = r8.k;	 Catch:{ NullPointerException -> 0x01a3 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x01a3 }
        r4 = r8.b;	 Catch:{ NullPointerException -> 0x01a3 }
        r9.a(r2, r4);	 Catch:{ NullPointerException -> 0x01a3 }
        if (r0 == 0) goto L_0x012c;
    L_0x010f:
        r2 = r8.b;	 Catch:{ NullPointerException -> 0x01a5 }
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x0129;
    L_0x0115:
        r1 = r8.k;	 Catch:{ NullPointerException -> 0x01a7 }
        r2 = r1.get();	 Catch:{ NullPointerException -> 0x01a7 }
        r1 = r8.q;	 Catch:{ NullPointerException -> 0x01a7 }
        r4 = r1.get();	 Catch:{ NullPointerException -> 0x01a7 }
        r6 = r8.b;	 Catch:{ NullPointerException -> 0x01a7 }
        r1 = r9;
        r1.a(r2, r4, r6);	 Catch:{ NullPointerException -> 0x01a7 }
        if (r0 == 0) goto L_0x012c;
    L_0x0129:
        r9.c();	 Catch:{ NullPointerException -> 0x01a7 }
    L_0x012c:
        r1 = r8.o;	 Catch:{ NullPointerException -> 0x01a9 }
        r2 = r8.o();	 Catch:{ NullPointerException -> 0x01a9 }
        r1.d(r2);	 Catch:{ NullPointerException -> 0x01a9 }
        if (r0 == 0) goto L_0x016a;
    L_0x0137:
        r1 = m();	 Catch:{ NullPointerException -> 0x01ab }
        if (r1 == 0) goto L_0x0161;
    L_0x013d:
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x01ad }
        r1.<init>();	 Catch:{ NullPointerException -> 0x01ad }
        r2 = bb;	 Catch:{ NullPointerException -> 0x01ad }
        r3 = 367; // 0x16f float:5.14E-43 double:1.813E-321;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x01ad }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x01ad }
        r2 = r8.o();	 Catch:{ NullPointerException -> 0x01ad }
        r2 = com.whatsapp.gdrive.fn.a(r2);	 Catch:{ NullPointerException -> 0x01ad }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x01ad }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x01ad }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x01ad }
        if (r0 == 0) goto L_0x016a;
    L_0x0161:
        r0 = r8.o;	 Catch:{ NullPointerException -> 0x01ad }
        r1 = r8.o();	 Catch:{ NullPointerException -> 0x01ad }
        r0.b(r1);	 Catch:{ NullPointerException -> 0x01ad }
    L_0x016a:
        return;
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x016d }
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0173 }
    L_0x0173:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0175 }
    L_0x0175:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0177 }
    L_0x0177:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0179 }
    L_0x0179:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x017b }
    L_0x017b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x017d }
    L_0x017d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x017f }
    L_0x017f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0181 }
    L_0x0181:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0183 }
    L_0x0183:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0185 }
    L_0x0185:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0187 }
    L_0x0187:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0189 }
    L_0x0189:
        r0 = move-exception;
        throw r0;
    L_0x018b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x018d }
    L_0x018d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x018f }
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0193 }
    L_0x0193:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0195 }
    L_0x0195:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0197 }
    L_0x0197:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0199 }
    L_0x0199:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x019b }
    L_0x019b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x019d }
    L_0x019d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x019f }
    L_0x019f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01a1 }
    L_0x01a1:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01a3 }
    L_0x01a3:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01a5 }
    L_0x01a5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01a7 }
    L_0x01a7:
        r0 = move-exception;
        throw r0;
    L_0x01a9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01ab }
    L_0x01ab:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01ad }
    L_0x01ad:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.b(com.whatsapp.gdrive.bi):void");
    }

    void a(fs fsVar) {
        try {
            if (this.g != null) {
                Log.e(bb[572]);
            }
            this.g = fsVar;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static long k(@NonNull String str) {
        return S().getLong(bb[185] + str, -1);
    }

    private static boolean e(boolean z) {
        Editor edit = S().edit();
        try {
            edit.putBoolean(bb[96], z);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[97]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(@android.support.annotation.NonNull java.util.Set r12, boolean r13) {
        /*
        r11 = this;
        r8 = c;
        r0 = R;	 Catch:{ InterruptedException -> 0x0029 }
        r1 = 2;
        if (r0 != r1) goto L_0x0011;
    L_0x0007:
        r0 = r11.P;	 Catch:{ InterruptedException -> 0x0029 }
        r2 = 0;
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ InterruptedException -> 0x0029 }
        r0.d = r1;	 Catch:{ InterruptedException -> 0x0029 }
    L_0x0011:
        r0 = r11.al;	 Catch:{ InterruptedException -> 0x002b }
        if (r0 != 0) goto L_0x002f;
    L_0x0015:
        r0 = bb;	 Catch:{ InterruptedException -> 0x002b }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x002b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ InterruptedException -> 0x002b }
        r0 = 1;
        r1 = r11.i;	 Catch:{ InterruptedException -> 0x002b }
        r0 = r11.a(r0, r1);	 Catch:{ InterruptedException -> 0x002b }
        if (r0 != 0) goto L_0x002f;
    L_0x0027:
        r0 = 0;
    L_0x0028:
        return r0;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = r11.al;	 Catch:{ InterruptedException -> 0x0048 }
        if (r0 != 0) goto L_0x004a;
    L_0x0033:
        r0 = bb;	 Catch:{ InterruptedException -> 0x0048 }
        r1 = 15;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x0048 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ InterruptedException -> 0x0048 }
        r0 = new java.lang.IllegalStateException;	 Catch:{ InterruptedException -> 0x0048 }
        r1 = bb;	 Catch:{ InterruptedException -> 0x0048 }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x0048 }
        r0.<init>(r1);	 Catch:{ InterruptedException -> 0x0048 }
        throw r0;	 Catch:{ InterruptedException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r9 = java.util.Collections.synchronizedList(r0);
        r0 = new com.whatsapp.util.ab;
        r1 = bb;
        r2 = 13;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = r11.a(r9, r12, r13);	 Catch:{ InterruptedException -> 0x0072 }
        if (r1 != 0) goto L_0x0074;
    L_0x0064:
        r1 = bb;	 Catch:{ InterruptedException -> 0x0072 }
        r2 = 16;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x0072 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ InterruptedException -> 0x0072 }
        r0.b();	 Catch:{ InterruptedException -> 0x0072 }
        r0 = 0;
        goto L_0x0028;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 11;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r9.size();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r0.b();
        r2 = ae();
        r11.b = r2;
        r4 = r9.iterator();
    L_0x009f:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00be;
    L_0x00a5:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r1 = r11.al;
        r0 = r1.c(r0);
        r6 = r11.b;	 Catch:{ InterruptedException -> 0x0170 }
        if (r0 == 0) goto L_0x0172;
    L_0x00b5:
        r0 = r0.b();	 Catch:{ InterruptedException -> 0x0170 }
    L_0x00b9:
        r0 = r0 + r6;
        r11.b = r0;
        if (r8 == 0) goto L_0x009f;
    L_0x00be:
        r0 = new com.whatsapp.gdrive.b5;	 Catch:{ InterruptedException -> 0x0176 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x0176 }
        java.util.Collections.sort(r9, r0);	 Catch:{ InterruptedException -> 0x0176 }
        r0 = r11.P;	 Catch:{ InterruptedException -> 0x0176 }
        if (r0 == 0) goto L_0x00d7;
    L_0x00ca:
        r0 = r11.P;	 Catch:{ InterruptedException -> 0x0176 }
        r1 = r9.size();	 Catch:{ InterruptedException -> 0x0176 }
        r4 = (double) r1;	 Catch:{ InterruptedException -> 0x0176 }
        r1 = java.lang.Double.valueOf(r4);	 Catch:{ InterruptedException -> 0x0176 }
        r0.b = r1;	 Catch:{ InterruptedException -> 0x0176 }
    L_0x00d7:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0 = r11.k;
        r0.set(r2);
        r0 = r11.q;
        r2 = 0;
        r0.set(r2);
        r6 = new java.util.concurrent.CountDownLatch;
        r0 = r9.size();
        r6.<init>(r0);
        r0 = 0;
        r4 = new java.util.concurrent.atomic.AtomicReference;
        r1 = 0;
        r4.<init>(r1);
        r10 = r9.iterator();
    L_0x00fc:
        r1 = r10.hasNext();
        if (r1 == 0) goto L_0x0154;
    L_0x0102:
        r3 = r10.next();
        r3 = (java.lang.String) r3;
        r7 = r0 + 1;
        r0 = r7 % 100;
        if (r0 != 0) goto L_0x0143;
    L_0x010e:
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0178 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x0178 }
        r1 = bb;	 Catch:{ InterruptedException -> 0x0178 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x0178 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x0178 }
        r0 = r0.append(r7);	 Catch:{ InterruptedException -> 0x0178 }
        r1 = "/";
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x0178 }
        r1 = r9.size();	 Catch:{ InterruptedException -> 0x0178 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x0178 }
        r1 = bb;	 Catch:{ InterruptedException -> 0x0178 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x0178 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x0178 }
        r0 = r0.append(r3);	 Catch:{ InterruptedException -> 0x0178 }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x0178 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0178 }
    L_0x0143:
        r0 = r11.al;
        r2 = r0.c(r3);
        r0 = new com.whatsapp.gdrive.f2;
        r1 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        com.whatsapp.gdrive.fd.a(r0);
        if (r8 == 0) goto L_0x024e;
    L_0x0154:
        r0 = bb;	 Catch:{ InterruptedException -> 0x017a }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x017a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x017a }
        r6.await();	 Catch:{ InterruptedException -> 0x017a }
        r0 = r4.get();
        r0 = (com.whatsapp.gdrive.eo) r0;
        if (r0 == 0) goto L_0x019c;
    L_0x0167:
        r1 = r0 instanceof com.whatsapp.gdrive.ei;	 Catch:{ InterruptedException -> 0x016e }
        if (r1 == 0) goto L_0x0181;
    L_0x016b:
        r0 = (com.whatsapp.gdrive.ei) r0;	 Catch:{ InterruptedException -> 0x016e }
        throw r0;	 Catch:{ InterruptedException -> 0x016e }
    L_0x016e:
        r0 = move-exception;
        throw r0;
    L_0x0170:
        r0 = move-exception;
        throw r0;
    L_0x0172:
        r0 = 0;
        goto L_0x00b9;
    L_0x0176:
        r0 = move-exception;
        throw r0;
    L_0x0178:
        r0 = move-exception;
        throw r0;
    L_0x017a:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = 0;
        goto L_0x0028;
    L_0x0181:
        r1 = r0 instanceof com.whatsapp.gdrive.ea;	 Catch:{ InterruptedException -> 0x0188 }
        if (r1 == 0) goto L_0x018a;
    L_0x0185:
        r0 = (com.whatsapp.gdrive.ea) r0;	 Catch:{ InterruptedException -> 0x0188 }
        throw r0;	 Catch:{ InterruptedException -> 0x0188 }
    L_0x0188:
        r0 = move-exception;
        throw r0;
    L_0x018a:
        r1 = r0 instanceof com.whatsapp.gdrive.eu;	 Catch:{ InterruptedException -> 0x0191 }
        if (r1 == 0) goto L_0x0193;
    L_0x018e:
        r0 = (com.whatsapp.gdrive.eu) r0;	 Catch:{ InterruptedException -> 0x0191 }
        throw r0;	 Catch:{ InterruptedException -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        throw r0;
    L_0x0193:
        r1 = r0 instanceof com.whatsapp.gdrive.et;	 Catch:{ InterruptedException -> 0x019a }
        if (r1 == 0) goto L_0x019c;
    L_0x0197:
        r0 = (com.whatsapp.gdrive.et) r0;	 Catch:{ InterruptedException -> 0x019a }
        throw r0;	 Catch:{ InterruptedException -> 0x019a }
    L_0x019a:
        r0 = move-exception;
        throw r0;
    L_0x019c:
        r0 = r5.size();	 Catch:{ InterruptedException -> 0x0248 }
        if (r0 <= 0) goto L_0x01d0;
    L_0x01a2:
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0248 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x0248 }
        r1 = bb;	 Catch:{ InterruptedException -> 0x0248 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x0248 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x0248 }
        r1 = r5.size();	 Catch:{ InterruptedException -> 0x0248 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x0248 }
        r1 = bb;	 Catch:{ InterruptedException -> 0x0248 }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x0248 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x0248 }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x0248 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0248 }
        r0 = r9.size();	 Catch:{ InterruptedException -> 0x0248 }
        r11.a(r5, r0);	 Catch:{ InterruptedException -> 0x0248 }
    L_0x01d0:
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x024a }
        r0.<init>();	 Catch:{ InterruptedException -> 0x024a }
        r1 = bb;	 Catch:{ InterruptedException -> 0x024a }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x024a }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x024a }
        r1 = r11.k;	 Catch:{ InterruptedException -> 0x024a }
        r2 = r1.get();	 Catch:{ InterruptedException -> 0x024a }
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x024a }
        r1 = "/";
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x024a }
        r2 = r11.b;	 Catch:{ InterruptedException -> 0x024a }
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x024a }
        r1 = bb;	 Catch:{ InterruptedException -> 0x024a }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x024a }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x024a }
        r1 = r11.q;	 Catch:{ InterruptedException -> 0x024a }
        r2 = r1.get();	 Catch:{ InterruptedException -> 0x024a }
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x024a }
        r1 = bb;	 Catch:{ InterruptedException -> 0x024a }
        r2 = 14;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x024a }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x024a }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x024a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x024a }
        r0 = r11.k;	 Catch:{ InterruptedException -> 0x024a }
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x024a }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x0232;
    L_0x0226:
        r0 = r11.q;	 Catch:{ InterruptedException -> 0x024c }
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x024c }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0245;
    L_0x0232:
        r1 = r11.o;	 Catch:{ InterruptedException -> 0x024c }
        r0 = r11.k;	 Catch:{ InterruptedException -> 0x024c }
        r2 = r0.get();	 Catch:{ InterruptedException -> 0x024c }
        r0 = r11.q;	 Catch:{ InterruptedException -> 0x024c }
        r4 = r0.get();	 Catch:{ InterruptedException -> 0x024c }
        r6 = r11.b;	 Catch:{ InterruptedException -> 0x024c }
        r1.a(r2, r4, r6);	 Catch:{ InterruptedException -> 0x024c }
    L_0x0245:
        r0 = 1;
        goto L_0x0028;
    L_0x0248:
        r0 = move-exception;
        throw r0;
    L_0x024a:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x024c }
    L_0x024c:
        r0 = move-exception;
        throw r0;
    L_0x024e:
        r0 = r7;
        goto L_0x00fc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.a(java.util.Set, boolean):boolean");
    }

    static b9 b(GoogleDriveService googleDriveService) {
        return googleDriveService.P;
    }

    public static boolean z() {
        try {
            if (fn.b(App.j, App.am)) {
                if (X()) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static boolean d(boolean z) {
        Editor edit = S().edit();
        try {
            edit.putBoolean(bb[30], z);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[29]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    void ac() {
        Log.i(bb[39]);
        this.h = null;
        this.g = null;
        this.L = null;
        this.Z = null;
        this.al = null;
    }

    static boolean r() {
        return l.get();
    }

    static boolean a(@NonNull File file) {
        boolean e;
        try {
            e = dg.e(file);
        } catch (Throwable e2) {
            Log.b(bb[213] + file, e2);
            e = false;
        }
        try {
            if (!s() && r1) {
                return false;
            }
            long j = ((long) (a59.e * 2)) * 1048576;
            long j2 = ((long) (a59.i * 2)) * 1048576;
            try {
                e = dg.b(file);
            } catch (Throwable e22) {
                Log.b(bb[212] + file, e22);
                e = false;
            }
            try {
                long length = file.length();
                if (!e) {
                    j2 = j;
                }
                if (length > j2) {
                    return false;
                }
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(".");
                if (lastIndexOf == -1) {
                    return false;
                }
                try {
                    if (lastIndexOf == name.length() - 1) {
                        return false;
                    }
                    try {
                        if (w.contains(name.substring(lastIndexOf + 1))) {
                            return true;
                        }
                        return false;
                    } catch (IOException e3) {
                        throw e3;
                    }
                } catch (IOException e32) {
                    throw e32;
                }
            } catch (IOException e322) {
                throw e322;
            }
        } catch (IOException e3222) {
            throw e3222;
        } catch (IOException e32222) {
            throw e32222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r12) {
        /*
        r11 = this;
        r6 = c;
        r0 = X();	 Catch:{ ea -> 0x0009 }
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        return;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r11.t = r12;	 Catch:{ ea -> 0x0021 }
        if (r12 == 0) goto L_0x0023;
    L_0x000f:
        r0 = r12.getAction();	 Catch:{ ea -> 0x0021 }
    L_0x0013:
        if (r0 != 0) goto L_0x0025;
    L_0x0015:
        r0 = bb;	 Catch:{ ea -> 0x001f }
        r1 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x001f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x001f }
        goto L_0x0008;
    L_0x001f:
        r0 = move-exception;
        throw r0;
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r0 = 0;
        goto L_0x0013;
    L_0x0025:
        K();	 Catch:{ ea -> 0x0070 }
        l();	 Catch:{ ea -> 0x0070 }
        al();	 Catch:{ ea -> 0x0070 }
        r1 = bb;	 Catch:{ ea -> 0x0070 }
        r2 = 259; // 0x103 float:3.63E-43 double:1.28E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x0070 }
        r1 = r1.equals(r0);	 Catch:{ ea -> 0x0070 }
        if (r1 == 0) goto L_0x0048;
    L_0x003a:
        r1 = C();	 Catch:{ ea -> 0x0070 }
        r11.z = r1;	 Catch:{ ea -> 0x0070 }
        r1 = ah();	 Catch:{ ea -> 0x0070 }
        r11.y = r1;	 Catch:{ ea -> 0x0070 }
        if (r6 == 0) goto L_0x0054;
    L_0x0048:
        r1 = c(r11);	 Catch:{ ea -> 0x0072 }
        r11.z = r1;	 Catch:{ ea -> 0x0072 }
        r1 = a(r11);	 Catch:{ ea -> 0x0072 }
        r11.y = r1;	 Catch:{ ea -> 0x0072 }
    L_0x0054:
        r1 = r11.z;	 Catch:{ ea -> 0x0074 }
        if (r1 != 0) goto L_0x0076;
    L_0x0058:
        r1 = bb;	 Catch:{ ea -> 0x0074 }
        r2 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x0074 }
        r1 = r0.equals(r1);	 Catch:{ ea -> 0x0074 }
        if (r1 != 0) goto L_0x0076;
    L_0x0064:
        r0 = bb;	 Catch:{ ea -> 0x006e }
        r1 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x006e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x006e }
        goto L_0x0008;
    L_0x006e:
        r0 = move-exception;
        throw r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x006e }
    L_0x0076:
        r1 = bb;
        r2 = 265; // 0x109 float:3.71E-43 double:1.31E-321;
        r1 = r1[r2];
        r2 = bb;
        r3 = 297; // 0x129 float:4.16E-43 double:1.467E-321;
        r2 = r2[r3];
        r2 = r12.getStringExtra(r2);
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0092;
    L_0x008c:
        r2 = 1;
        e(r2);	 Catch:{ ea -> 0x00c5 }
        if (r6 == 0) goto L_0x090e;
    L_0x0092:
        r1 = ar();
        r2 = r1;
    L_0x0097:
        r1 = r11.A;	 Catch:{ ea -> 0x00c7 }
        r1.d(r2);	 Catch:{ ea -> 0x00c7 }
        r1 = g();	 Catch:{ ea -> 0x00c7 }
        r11.aj = r1;	 Catch:{ ea -> 0x00c7 }
        r1 = r11.aj;	 Catch:{ ea -> 0x00c7 }
        if (r1 != 0) goto L_0x00ef;
    L_0x00a6:
        r1 = bb;	 Catch:{ ea -> 0x00c7 }
        r2 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x00c7 }
        r0 = r0.equals(r1);	 Catch:{ ea -> 0x00c7 }
        if (r0 == 0) goto L_0x00c9;
    L_0x00b2:
        r0 = bb;	 Catch:{ ea -> 0x00c3 }
        r1 = 260; // 0x104 float:3.64E-43 double:1.285E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x00c3 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ea -> 0x00c3 }
        r0 = r11.o;	 Catch:{ ea -> 0x00c3 }
        r1 = 1;
        r0.c(r1);	 Catch:{ ea -> 0x00c3 }
        goto L_0x0008;
    L_0x00c3:
        r0 = move-exception;
        throw r0;
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x00c3 }
    L_0x00c9:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 280; // 0x118 float:3.92E-43 double:1.383E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r1 = bb;
        r2 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0008;
    L_0x00ef:
        r1 = new com.whatsapp.gdrive.bc;
        r3 = r11.aj;
        r1.<init>(r3, r11);
        r11.L = r1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = bb;
        r4 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = -1;
        r3 = r0.hashCode();	 Catch:{ ea -> 0x01a3 }
        switch(r3) {
            case -1755890518: goto L_0x0149;
            case -818191995: goto L_0x013a;
            case -60294196: goto L_0x0185;
            case 691374533: goto L_0x0194;
            case 1035381739: goto L_0x012b;
            case 1096596436: goto L_0x0158;
            case 1583504647: goto L_0x0176;
            case 1996912751: goto L_0x0167;
            default: goto L_0x011a;
        };
    L_0x011a:
        r0 = r1;
    L_0x011b:
        switch(r0) {
            case 0: goto L_0x01b3;
            case 1: goto L_0x0270;
            case 2: goto L_0x0382;
            case 3: goto L_0x0633;
            case 4: goto L_0x078c;
            case 5: goto L_0x08d3;
            case 6: goto L_0x08d8;
            case 7: goto L_0x08de;
            default: goto L_0x011e;
        };
    L_0x011e:
        r0 = bb;	 Catch:{ ea -> 0x0129 }
        r1 = 261; // 0x105 float:3.66E-43 double:1.29E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x0129 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x0129 }
        goto L_0x0008;
    L_0x0129:
        r0 = move-exception;
        throw r0;
    L_0x012b:
        r3 = bb;	 Catch:{ ea -> 0x01a3 }
        r4 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x01a3 }
        r3 = r0.equals(r3);	 Catch:{ ea -> 0x01a3 }
        if (r3 == 0) goto L_0x011a;
    L_0x0137:
        r1 = 0;
        if (r6 == 0) goto L_0x011a;
    L_0x013a:
        r3 = bb;	 Catch:{ ea -> 0x01a5 }
        r4 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x01a5 }
        r3 = r0.equals(r3);	 Catch:{ ea -> 0x01a5 }
        if (r3 == 0) goto L_0x011a;
    L_0x0146:
        r1 = 1;
        if (r6 == 0) goto L_0x011a;
    L_0x0149:
        r3 = bb;	 Catch:{ ea -> 0x01a7 }
        r4 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x01a7 }
        r3 = r0.equals(r3);	 Catch:{ ea -> 0x01a7 }
        if (r3 == 0) goto L_0x011a;
    L_0x0155:
        r1 = 2;
        if (r6 == 0) goto L_0x011a;
    L_0x0158:
        r3 = bb;	 Catch:{ ea -> 0x01a9 }
        r4 = 296; // 0x128 float:4.15E-43 double:1.46E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x01a9 }
        r3 = r0.equals(r3);	 Catch:{ ea -> 0x01a9 }
        if (r3 == 0) goto L_0x011a;
    L_0x0164:
        r1 = 3;
        if (r6 == 0) goto L_0x011a;
    L_0x0167:
        r3 = bb;	 Catch:{ ea -> 0x01ab }
        r4 = 263; // 0x107 float:3.69E-43 double:1.3E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x01ab }
        r3 = r0.equals(r3);	 Catch:{ ea -> 0x01ab }
        if (r3 == 0) goto L_0x011a;
    L_0x0173:
        r1 = 4;
        if (r6 == 0) goto L_0x011a;
    L_0x0176:
        r3 = bb;	 Catch:{ ea -> 0x01ad }
        r4 = 282; // 0x11a float:3.95E-43 double:1.393E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x01ad }
        r3 = r0.equals(r3);	 Catch:{ ea -> 0x01ad }
        if (r3 == 0) goto L_0x011a;
    L_0x0182:
        r1 = 5;
        if (r6 == 0) goto L_0x011a;
    L_0x0185:
        r3 = bb;	 Catch:{ ea -> 0x01af }
        r4 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x01af }
        r3 = r0.equals(r3);	 Catch:{ ea -> 0x01af }
        if (r3 == 0) goto L_0x011a;
    L_0x0191:
        r1 = 6;
        if (r6 == 0) goto L_0x011a;
    L_0x0194:
        r3 = bb;	 Catch:{ ea -> 0x01b1 }
        r4 = 292; // 0x124 float:4.09E-43 double:1.443E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x01b1 }
        r0 = r0.equals(r3);	 Catch:{ ea -> 0x01b1 }
        if (r0 == 0) goto L_0x011a;
    L_0x01a0:
        r0 = 7;
        goto L_0x011b;
    L_0x01a3:
        r0 = move-exception;
        throw r0;
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = move-exception;
        throw r0;
    L_0x01a9:
        r0 = move-exception;
        throw r0;
    L_0x01ab:
        r0 = move-exception;
        throw r0;
    L_0x01ad:
        r0 = move-exception;
        throw r0;
    L_0x01af:
        r0 = move-exception;
        throw r0;
    L_0x01b1:
        r0 = move-exception;
        throw r0;
    L_0x01b3:
        r0 = bb;
        r1 = 279; // 0x117 float:3.91E-43 double:1.38E-321;
        r0 = r0[r1];
        r1 = 0;
        r1 = r12.getBooleanExtra(r0, r1);
        r0 = bb;	 Catch:{ ea -> 0x01f6 }
        r3 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r0 = r0[r3];	 Catch:{ ea -> 0x01f6 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ea -> 0x01f6 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ ea -> 0x01f6 }
        r0 = r11.aj;	 Catch:{ ea -> 0x01f6 }
        r8 = d(r0);	 Catch:{ ea -> 0x01f6 }
        r4 = r4 - r8;
        r8 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x01f8;
    L_0x01d9:
        r0 = 1;
    L_0x01da:
        if (r1 == 0) goto L_0x01e2;
    L_0x01dc:
        r1 = ak();	 Catch:{ ea -> 0x01fa }
        if (r1 == 0) goto L_0x0202;
    L_0x01e2:
        if (r2 != 0) goto L_0x01e6;
    L_0x01e4:
        if (r0 == 0) goto L_0x0202;
    L_0x01e6:
        r0 = 1;
    L_0x01e7:
        if (r0 != 0) goto L_0x0204;
    L_0x01e9:
        r0 = bb;	 Catch:{ ea -> 0x01f4 }
        r1 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x01f4 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ea -> 0x01f4 }
        goto L_0x0008;
    L_0x01f4:
        r0 = move-exception;
        throw r0;
    L_0x01f6:
        r0 = move-exception;
        throw r0;
    L_0x01f8:
        r0 = 0;
        goto L_0x01da;
    L_0x01fa:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x01fc }
    L_0x01fc:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x01fe }
    L_0x01fe:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0200 }
    L_0x0200:
        r0 = move-exception;
        throw r0;
    L_0x0202:
        r0 = 0;
        goto L_0x01e7;
    L_0x0204:
        r0 = com.whatsapp.App.aI();	 Catch:{ ea -> 0x0215 }
        if (r0 == 0) goto L_0x0217;
    L_0x020a:
        r0 = bb;	 Catch:{ ea -> 0x0215 }
        r1 = 284; // 0x11c float:3.98E-43 double:1.403E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x0215 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x0215 }
        goto L_0x0008;
    L_0x0215:
        r0 = move-exception;
        throw r0;
    L_0x0217:
        r0 = com.whatsapp.App.aO();	 Catch:{ ea -> 0x022d }
        if (r0 != 0) goto L_0x022f;
    L_0x021d:
        r0 = bb;	 Catch:{ ea -> 0x022d }
        r1 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x022d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x022d }
        r0 = 23;
        r11.d(r0);	 Catch:{ ea -> 0x022d }
        goto L_0x0008;
    L_0x022d:
        r0 = move-exception;
        throw r0;
    L_0x022f:
        r0 = v();	 Catch:{ ea -> 0x0240 }
        if (r0 == 0) goto L_0x0242;
    L_0x0235:
        r0 = bb;	 Catch:{ ea -> 0x0240 }
        r1 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x0240 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x0240 }
        goto L_0x0008;
    L_0x0240:
        r0 = move-exception;
        throw r0;
    L_0x0242:
        r0 = l;	 Catch:{ ea -> 0x0256 }
        r1 = 1;
        r0 = r0.getAndSet(r1);	 Catch:{ ea -> 0x0256 }
        if (r0 == 0) goto L_0x0258;
    L_0x024b:
        r0 = bb;	 Catch:{ ea -> 0x0256 }
        r1 = 262; // 0x106 float:3.67E-43 double:1.294E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x0256 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x0256 }
        goto L_0x0008;
    L_0x0256:
        r0 = move-exception;
        throw r0;
    L_0x0258:
        r0 = r11.o();	 Catch:{ ea -> 0x02f4 }
        r1 = 10;
        if (r0 == r1) goto L_0x0265;
    L_0x0260:
        r0 = 10;
        r11.d(r0);	 Catch:{ ea -> 0x02f4 }
    L_0x0265:
        r11.aq();	 Catch:{ all -> 0x02f6 }
        r11.b(r2);	 Catch:{ all -> 0x02f6 }
        r11.as();
        if (r6 == 0) goto L_0x0008;
    L_0x0270:
        r0 = com.whatsapp.App.aK;	 Catch:{ ea -> 0x02fb }
        r0 = r0.c();	 Catch:{ ea -> 0x02fb }
        if (r0 == 0) goto L_0x0289;
    L_0x0278:
        r0 = bb;	 Catch:{ ea -> 0x02fd }
        r1 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x02fd }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ea -> 0x02fd }
        r0 = r11.o;	 Catch:{ ea -> 0x02fd }
        r1 = 1;
        r0.b(r1);	 Catch:{ ea -> 0x02fd }
        if (r6 == 0) goto L_0x0008;
    L_0x0289:
        r0 = C;	 Catch:{ ea -> 0x02ff }
        r1 = 1;
        r0 = r0.getAndSet(r1);	 Catch:{ ea -> 0x02ff }
        if (r0 == 0) goto L_0x029d;
    L_0x0292:
        r0 = bb;	 Catch:{ ea -> 0x0301 }
        r1 = 286; // 0x11e float:4.01E-43 double:1.413E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x0301 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x0301 }
        if (r6 == 0) goto L_0x0008;
    L_0x029d:
        r1 = 0;
        r2 = h();	 Catch:{ all -> 0x03af }
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x02af;
    L_0x02a8:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x03af }
        c(r2);	 Catch:{ all -> 0x03af }
    L_0x02af:
        r0 = r11.o;	 Catch:{ all -> 0x03af }
        r0.f();	 Catch:{ all -> 0x03af }
        r0 = 3;
        f(r0);	 Catch:{ all -> 0x03af }
        r0 = r11.aj;	 Catch:{ ea -> 0x0399, ei -> 0x03d7, ew -> 0x041d, ee -> 0x0433, eu -> 0x045b, et -> 0x0471, ez -> 0x0487 }
        r4 = r11.ak;	 Catch:{ ea -> 0x0399, ei -> 0x03d7, ew -> 0x041d, ee -> 0x0433, eu -> 0x045b, et -> 0x0471, ez -> 0x0487 }
        r0 = r11.a(r0, r4);	 Catch:{ ea -> 0x0399, ei -> 0x03d7, ew -> 0x041d, ee -> 0x0433, eu -> 0x045b, et -> 0x0471, ez -> 0x0487 }
        if (r0 != 0) goto L_0x0303;
    L_0x02c2:
        r0 = 11;
        r11.d(r0);	 Catch:{ ea -> 0x0399, ei -> 0x03d7, ew -> 0x041d, ee -> 0x0433, eu -> 0x045b, et -> 0x0471, ez -> 0x0487 }
        r0 = r11.o;	 Catch:{ all -> 0x03af }
        r0.b(r1);	 Catch:{ all -> 0x03af }
        r0 = C;
        r1 = 0;
        r0.set(r1);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 273; // 0x111 float:3.83E-43 double:1.35E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.L;
        r1 = r1.c();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0008;
    L_0x02f4:
        r0 = move-exception;
        throw r0;
    L_0x02f6:
        r0 = move-exception;
        r11.as();
        throw r0;
    L_0x02fb:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x02fd }
    L_0x02fd:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x02ff }
    L_0x02ff:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0301 }
    L_0x0301:
        r0 = move-exception;
        throw r0;
    L_0x0303:
        r1 = r11.F();	 Catch:{ ea -> 0x0399, ei -> 0x03d7, ew -> 0x041d, ee -> 0x0433, eu -> 0x045b, et -> 0x0471, ez -> 0x0487 }
        if (r1 != 0) goto L_0x0310;
    L_0x0309:
        r0 = 14;
        r11.d(r0);	 Catch:{ ea -> 0x0395, ei -> 0x03d7, ew -> 0x041d, ee -> 0x0433, eu -> 0x045b, et -> 0x0471, ez -> 0x0487 }
        if (r6 == 0) goto L_0x0315;
    L_0x0310:
        r0 = 10;
        r11.d(r0);	 Catch:{ ea -> 0x0397, ei -> 0x03d7, ew -> 0x041d, ee -> 0x0433, eu -> 0x045b, et -> 0x0471, ez -> 0x0487 }
    L_0x0315:
        r0 = r11.o;	 Catch:{ all -> 0x03af }
        r0.b(r1);	 Catch:{ all -> 0x03af }
    L_0x031a:
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x03af }
        r0 = java.util.Locale.ENGLISH;	 Catch:{ all -> 0x03af }
        r7 = bb;	 Catch:{ all -> 0x03af }
        r8 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r7 = r7[r8];	 Catch:{ all -> 0x03af }
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ all -> 0x03af }
        r9 = 0;
        r2 = r4 - r2;
        r2 = (double) r2;	 Catch:{ all -> 0x03af }
        r4 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r2 = r2 / r4;
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ all -> 0x03af }
        r8[r9] = r2;	 Catch:{ all -> 0x03af }
        r0 = java.lang.String.format(r0, r7, r8);	 Catch:{ all -> 0x03af }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x03af }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03af }
        r0.<init>();	 Catch:{ all -> 0x03af }
        r2 = bb;	 Catch:{ all -> 0x03af }
        r3 = 287; // 0x11f float:4.02E-43 double:1.42E-321;
        r2 = r2[r3];	 Catch:{ all -> 0x03af }
        r0 = r0.append(r2);	 Catch:{ all -> 0x03af }
        r0 = r0.append(r1);	 Catch:{ all -> 0x03af }
        r0 = r0.toString();	 Catch:{ all -> 0x03af }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x03af }
        r0 = C;
        r1 = 0;
        r0.set(r1);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 285; // 0x11d float:4.0E-43 double:1.41E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.L;
        r1 = r1.c();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r6 == 0) goto L_0x0008;
    L_0x0382:
        r0 = v();	 Catch:{ ea -> 0x049d }
        if (r0 != 0) goto L_0x049f;
    L_0x0388:
        r0 = bb;	 Catch:{ ea -> 0x0393 }
        r1 = 275; // 0x113 float:3.85E-43 double:1.36E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x0393 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ea -> 0x0393 }
        goto L_0x0008;
    L_0x0393:
        r0 = move-exception;
        throw r0;
    L_0x0395:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0397, ei -> 0x03d7, ew -> 0x041d, ee -> 0x0433, eu -> 0x045b, et -> 0x0471, ez -> 0x0487 }
    L_0x0397:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0399, ei -> 0x03d7, ew -> 0x041d, ee -> 0x0433, eu -> 0x045b, et -> 0x0471, ez -> 0x0487 }
    L_0x0399:
        r0 = move-exception;
        r4 = 12;
        r11.d(r4);	 Catch:{ all -> 0x0416 }
        r4 = bb;	 Catch:{ all -> 0x0416 }
        r5 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0416 }
        com.whatsapp.util.Log.b(r4, r0);	 Catch:{ all -> 0x0416 }
        r0 = r11.o;	 Catch:{ all -> 0x03af }
        r0.b(r1);	 Catch:{ all -> 0x03af }
        goto L_0x031a;
    L_0x03af:
        r0 = move-exception;
        r1 = C;
        r2 = 0;
        r1.set(r2);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r11.L;
        r2 = r2.c();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        throw r0;
    L_0x03d7:
        r0 = move-exception;
        r4 = bb;	 Catch:{ all -> 0x0416 }
        r5 = 272; // 0x110 float:3.81E-43 double:1.344E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0416 }
        com.whatsapp.util.Log.b(r4, r0);	 Catch:{ all -> 0x0416 }
        r0 = r0.getCause();	 Catch:{ all -> 0x0416 }
        if (r0 != 0) goto L_0x03f7;
    L_0x03e7:
        r4 = bb;	 Catch:{ ea -> 0x040e }
        r5 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        r4 = r4[r5];	 Catch:{ ea -> 0x040e }
        com.whatsapp.util.Log.e(r4);	 Catch:{ ea -> 0x040e }
        r4 = 11;
        r11.d(r4);	 Catch:{ ea -> 0x040e }
        if (r6 == 0) goto L_0x0407;
    L_0x03f7:
        r0 = r0 instanceof com.google.android.gms.auth.GooglePlayServicesAvailabilityException;	 Catch:{ ea -> 0x0410 }
        if (r0 == 0) goto L_0x0402;
    L_0x03fb:
        r0 = 21;
        r11.d(r0);	 Catch:{ ea -> 0x0412 }
        if (r6 == 0) goto L_0x0407;
    L_0x0402:
        r0 = 11;
        r11.d(r0);	 Catch:{ ea -> 0x0414 }
    L_0x0407:
        r0 = r11.o;	 Catch:{ all -> 0x03af }
        r0.b(r1);	 Catch:{ all -> 0x03af }
        goto L_0x031a;
    L_0x040e:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0410 }
    L_0x0410:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0412 }
    L_0x0412:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0414 }
    L_0x0414:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0416 }
    L_0x0416:
        r0 = move-exception;
        r2 = r11.o;	 Catch:{ all -> 0x03af }
        r2.b(r1);	 Catch:{ all -> 0x03af }
        throw r0;	 Catch:{ all -> 0x03af }
    L_0x041d:
        r0 = move-exception;
        r4 = 18;
        r11.d(r4);	 Catch:{ all -> 0x0416 }
        r4 = bb;	 Catch:{ all -> 0x0416 }
        r5 = 258; // 0x102 float:3.62E-43 double:1.275E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0416 }
        com.whatsapp.util.Log.b(r4, r0);	 Catch:{ all -> 0x0416 }
        r0 = r11.o;	 Catch:{ all -> 0x03af }
        r0.b(r1);	 Catch:{ all -> 0x03af }
        goto L_0x031a;
    L_0x0433:
        r0 = move-exception;
        r4 = 17;
        r11.d(r4);	 Catch:{ ea -> 0x0459 }
        r4 = bb;	 Catch:{ ea -> 0x0459 }
        r5 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r4 = r4[r5];	 Catch:{ ea -> 0x0459 }
        com.whatsapp.util.Log.b(r4, r0);	 Catch:{ ea -> 0x0459 }
        r0 = com.whatsapp.App.j;	 Catch:{ ea -> 0x0459 }
        r4 = 1;
        if (r0 != r4) goto L_0x0452;
    L_0x0447:
        r0 = bb;	 Catch:{ ea -> 0x0459 }
        r4 = 264; // 0x108 float:3.7E-43 double:1.304E-321;
        r0 = r0[r4];	 Catch:{ ea -> 0x0459 }
        r4 = 0;
        r5 = 0;
        com.whatsapp.App.a(r0, r4, r5);	 Catch:{ ea -> 0x0459 }
    L_0x0452:
        r0 = r11.o;	 Catch:{ all -> 0x03af }
        r0.b(r1);	 Catch:{ all -> 0x03af }
        goto L_0x031a;
    L_0x0459:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0416 }
    L_0x045b:
        r0 = move-exception;
        r4 = 15;
        r11.d(r4);	 Catch:{ all -> 0x0416 }
        r4 = bb;	 Catch:{ all -> 0x0416 }
        r5 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0416 }
        com.whatsapp.util.Log.b(r4, r0);	 Catch:{ all -> 0x0416 }
        r0 = r11.o;	 Catch:{ all -> 0x03af }
        r0.b(r1);	 Catch:{ all -> 0x03af }
        goto L_0x031a;
    L_0x0471:
        r0 = move-exception;
        r4 = 19;
        r11.d(r4);	 Catch:{ all -> 0x0416 }
        r4 = bb;	 Catch:{ all -> 0x0416 }
        r5 = 281; // 0x119 float:3.94E-43 double:1.39E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0416 }
        com.whatsapp.util.Log.b(r4, r0);	 Catch:{ all -> 0x0416 }
        r0 = r11.o;	 Catch:{ all -> 0x03af }
        r0.b(r1);	 Catch:{ all -> 0x03af }
        goto L_0x031a;
    L_0x0487:
        r0 = move-exception;
        r4 = 23;
        r11.d(r4);	 Catch:{ all -> 0x0416 }
        r4 = bb;	 Catch:{ all -> 0x0416 }
        r5 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0416 }
        com.whatsapp.util.Log.b(r4, r0);	 Catch:{ all -> 0x0416 }
        r0 = r11.o;	 Catch:{ all -> 0x03af }
        r0.b(r1);	 Catch:{ all -> 0x03af }
        goto L_0x031a;
    L_0x049d:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0393 }
    L_0x049f:
        r0 = f;	 Catch:{ ea -> 0x0509 }
        r1 = 1;
        r0 = r0.getAndSet(r1);	 Catch:{ ea -> 0x0509 }
        if (r0 == 0) goto L_0x04b3;
    L_0x04a8:
        r0 = bb;	 Catch:{ ea -> 0x0509 }
        r1 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x0509 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x0509 }
        if (r6 == 0) goto L_0x0008;
    L_0x04b3:
        r0 = r11.o();	 Catch:{ ea -> 0x050b }
        r1 = 10;
        if (r0 == r1) goto L_0x04c0;
    L_0x04bb:
        r0 = 10;
        r11.d(r0);	 Catch:{ ea -> 0x050d }
    L_0x04c0:
        r0 = r11.o;
        r0.c();
        r0 = new com.whatsapp.fieldstats.b9;
        r0.<init>();
        r11.P = r0;
        r0 = r11.P;
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r1 = java.lang.Double.valueOf(r2);
        r0.g = r1;
        r0 = h();	 Catch:{ all -> 0x065d }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x04e7;
    L_0x04e0:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x065d }
        c(r0);	 Catch:{ all -> 0x065d }
    L_0x04e7:
        r0 = r11.L;	 Catch:{ all -> 0x065d }
        r0.a();	 Catch:{ all -> 0x065d }
        ax();	 Catch:{ all -> 0x065d }
        r0 = r11.aj;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r1 = r11.i;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r11.a(r0, r1);	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        if (r0 != 0) goto L_0x050f;
    L_0x04f9:
        r0 = 11;
        r11.d(r0);	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = f;
        r1 = 0;
        r0.set(r1);
        r0 = 0;
        r11.P = r0;
        goto L_0x0008;
    L_0x0509:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x050b }
    L_0x050b:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x050d }
    L_0x050d:
        r0 = move-exception;
        throw r0;
    L_0x050f:
        r1 = r11.t();	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        if (r1 == 0) goto L_0x0526;
    L_0x0515:
        r0 = r11.P;	 Catch:{ ea -> 0x0649, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = com.whatsapp.fieldstats.ct.OK;	 Catch:{ ea -> 0x0649, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r2.getCode();	 Catch:{ ea -> 0x0649, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = (double) r2;	 Catch:{ ea -> 0x0649, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ea -> 0x0649, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.i = r2;	 Catch:{ ea -> 0x0649, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        if (r6 == 0) goto L_0x052b;
    L_0x0526:
        r0 = 14;
        r11.d(r0);	 Catch:{ ea -> 0x064b, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x052b:
        r0 = R;	 Catch:{ ea -> 0x0668, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = 1;
        if (r0 != r2) goto L_0x053c;
    L_0x0530:
        r0 = r11.P;	 Catch:{ ea -> 0x0668, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ea -> 0x0668, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.d = r2;	 Catch:{ ea -> 0x0668, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        if (r6 == 0) goto L_0x054b;
    L_0x053c:
        r0 = R;	 Catch:{ ea -> 0x066a, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = 2;
        if (r0 != r2) goto L_0x054b;
    L_0x0541:
        r0 = r11.P;	 Catch:{ ea -> 0x066c, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = 0;
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ea -> 0x066c, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.d = r2;	 Catch:{ ea -> 0x066c, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x054b:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r11.P;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r4 = h();	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r2 - r4;
        r2 = (double) r2;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.e = r2;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r11.P;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r11.b;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = (double) r2;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.l = r2;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r11.P;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r11.q;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r2.get();	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = (double) r2;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.a = r2;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = com.whatsapp.App.j;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = 1;
        if (r0 != r2) goto L_0x0593;
    L_0x057c:
        r0 = r11.q;	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r0.get();	 Catch:{ ea -> 0x06a1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0593;
    L_0x0588:
        r0 = bb;	 Catch:{ ea -> 0x06a3, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r0 = r0[r2];	 Catch:{ ea -> 0x06a3, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = 0;
        r3 = 0;
        com.whatsapp.App.a(r0, r2, r3);	 Catch:{ ea -> 0x06a3, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x0593:
        r0 = r11.al;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        if (r0 == 0) goto L_0x0604;
    L_0x0597:
        r0 = r11.P;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r11.al;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r2.j();	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = (double) r2;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.j = r2;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r11.P;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r11.al;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r2.b();	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = (double) r2;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.h = r2;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r11.P;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r11.al;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r2.l();	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = (double) r2;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.c = r2;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r11.L;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r0.c();	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r11.P;	 Catch:{ ea -> 0x06b6, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r4 = (double) r0;	 Catch:{ ea -> 0x06b6, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r3 = java.lang.Double.valueOf(r4);	 Catch:{ ea -> 0x06b6, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2.f = r3;	 Catch:{ ea -> 0x06b6, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r4 = r11.P;	 Catch:{ ea -> 0x06b6, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r11.al;	 Catch:{ ea -> 0x06b6, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r2.h();	 Catch:{ ea -> 0x06b6, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        if (r2 == 0) goto L_0x06c9;
    L_0x05dd:
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x05df:
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r4.k = r2;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = new java.lang.StringBuilder;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2.<init>();	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r3 = bb;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r4 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r2.append(r3);	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r2.append(r0);	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r0.toString();	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r11.P;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        com.whatsapp.fieldstats.i.a(r11, r0);	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x0604:
        r0 = f;	 Catch:{ ea -> 0x06cd, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0 = r0.get();	 Catch:{ ea -> 0x06cd, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        if (r0 == 0) goto L_0x0623;
    L_0x060c:
        r0 = r11.o();	 Catch:{ ea -> 0x06cd, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = 10;
        if (r0 != r2) goto L_0x0628;
    L_0x0614:
        r0 = r11.o;	 Catch:{ ea -> 0x06cf, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r11.q;	 Catch:{ ea -> 0x06cf, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r2 = r2.get();	 Catch:{ ea -> 0x06cf, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r4 = r11.b;	 Catch:{ ea -> 0x06cf, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.a(r1, r2, r4);	 Catch:{ ea -> 0x06cf, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        if (r6 == 0) goto L_0x0628;
    L_0x0623:
        r0 = r11.o;	 Catch:{ ea -> 0x06d1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
        r0.g();	 Catch:{ ea -> 0x06d1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x0628:
        r0 = f;
        r1 = 0;
        r0.set(r1);
        r0 = 0;
        r11.P = r0;
        if (r6 == 0) goto L_0x0008;
    L_0x0633:
        r0 = r11.U;	 Catch:{ ea -> 0x06fb }
        r1 = 1;
        r0 = r0.getAndSet(r1);	 Catch:{ ea -> 0x06fb }
        if (r0 == 0) goto L_0x06fd;
    L_0x063c:
        r0 = bb;	 Catch:{ ea -> 0x0647 }
        r1 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x0647 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x0647 }
        goto L_0x0008;
    L_0x0647:
        r0 = move-exception;
        throw r0;
    L_0x0649:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x064b, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x064b:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x064d:
        r0 = move-exception;
        r1 = 12;
        r11.d(r1);	 Catch:{ all -> 0x065d }
        r1 = bb;	 Catch:{ all -> 0x065d }
        r2 = 291; // 0x123 float:4.08E-43 double:1.44E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x065d }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x065d }
        goto L_0x0628;
    L_0x065d:
        r0 = move-exception;
        r1 = f;
        r2 = 0;
        r1.set(r2);
        r1 = 0;
        r11.P = r1;
        throw r0;
    L_0x0668:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x066a, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x066a:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x066c, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x066c:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x066e:
        r0 = move-exception;
        r1 = bb;	 Catch:{ all -> 0x065d }
        r2 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x065d }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x065d }
        r0 = r0.getCause();	 Catch:{ all -> 0x065d }
        if (r0 != 0) goto L_0x068e;
    L_0x067e:
        r1 = bb;	 Catch:{ ea -> 0x06e4 }
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x06e4 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ ea -> 0x06e4 }
        r1 = 11;
        r11.d(r1);	 Catch:{ ea -> 0x06e4 }
        if (r6 == 0) goto L_0x0628;
    L_0x068e:
        r0 = r0 instanceof com.google.android.gms.auth.GooglePlayServicesAvailabilityException;	 Catch:{ ea -> 0x06e6 }
        if (r0 == 0) goto L_0x0699;
    L_0x0692:
        r0 = 21;
        r11.d(r0);	 Catch:{ ea -> 0x06e8 }
        if (r6 == 0) goto L_0x0628;
    L_0x0699:
        r0 = 11;
        r11.d(r0);	 Catch:{ ea -> 0x069f }
        goto L_0x0628;
    L_0x069f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x065d }
    L_0x06a1:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x06a3, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x06a3:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x06a5:
        r0 = move-exception;
        r1 = 18;
        r11.d(r1);	 Catch:{ all -> 0x065d }
        r1 = bb;	 Catch:{ all -> 0x065d }
        r2 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x065d }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x065d }
        goto L_0x0628;
    L_0x06b6:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x06b8:
        r0 = move-exception;
        r1 = 15;
        r11.d(r1);	 Catch:{ all -> 0x065d }
        r1 = bb;	 Catch:{ all -> 0x065d }
        r2 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x065d }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x065d }
        goto L_0x0628;
    L_0x06c9:
        r2 = 0;
        goto L_0x05df;
    L_0x06cd:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x06cf, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x06cf:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x06d1, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x06d1:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x064d, ei -> 0x066e, ew -> 0x06a5, eu -> 0x06b8, et -> 0x06d3, ez -> 0x06ea }
    L_0x06d3:
        r0 = move-exception;
        r1 = 19;
        r11.d(r1);	 Catch:{ all -> 0x065d }
        r1 = bb;	 Catch:{ all -> 0x065d }
        r2 = 293; // 0x125 float:4.1E-43 double:1.45E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x065d }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x065d }
        goto L_0x0628;
    L_0x06e4:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x06e6 }
    L_0x06e6:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x06e8 }
    L_0x06e8:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x069f }
    L_0x06ea:
        r0 = move-exception;
        r1 = 23;
        r11.d(r1);	 Catch:{ all -> 0x065d }
        r1 = bb;	 Catch:{ all -> 0x065d }
        r2 = 268; // 0x10c float:3.76E-43 double:1.324E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x065d }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x065d }
        goto L_0x0628;
    L_0x06fb:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0647 }
    L_0x06fd:
        r0 = 0;
        r1 = bb;	 Catch:{ ea -> 0x07b1, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        r2 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x07b1, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        r2 = r12.getStringExtra(r1);	 Catch:{ ea -> 0x07b1, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        r1 = bb;	 Catch:{ ea -> 0x07af, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        r3 = 271; // 0x10f float:3.8E-43 double:1.34E-321;
        r1 = r1[r3];	 Catch:{ ea -> 0x07af, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        r1 = r12.getStringExtra(r1);	 Catch:{ ea -> 0x07af, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        r11.aj = r1;	 Catch:{ ea -> 0x07af, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        if (r2 != 0) goto L_0x0721;
    L_0x0716:
        r1 = bb;	 Catch:{ ea -> 0x07af, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        r3 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        r1 = r1[r3];	 Catch:{ ea -> 0x07af, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ ea -> 0x07af, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        if (r6 == 0) goto L_0x074c;
    L_0x0721:
        r1 = r11.h(r2);	 Catch:{ ea -> 0x07b1, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
        if (r1 != 0) goto L_0x090b;
    L_0x0727:
        r0 = r11.h(r2);	 Catch:{ ea -> 0x07d8, ei -> 0x0902, et -> 0x08f9 }
        if (r0 == 0) goto L_0x0738;
    L_0x072d:
        r1 = bb;	 Catch:{ ea -> 0x07cf, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
        r2 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x07cf, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ea -> 0x07cf, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
        if (r6 == 0) goto L_0x074c;
    L_0x0738:
        r1 = bb;	 Catch:{ ea -> 0x07d1, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
        r2 = 245; // 0xf5 float:3.43E-43 double:1.21E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x07d1, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ea -> 0x07d1, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
        if (r6 == 0) goto L_0x074c;
    L_0x0743:
        r1 = bb;	 Catch:{ ea -> 0x07d3, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
        r2 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x07d3, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ea -> 0x07d3, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
    L_0x074c:
        r1 = r11.U;
        r2 = 0;
        r1.set(r2);
        r1 = r11.o;
        r1.c(r0);
        r1 = r0;
    L_0x0758:
        r0 = new java.lang.StringBuilder;	 Catch:{ ea -> 0x0828 }
        r0.<init>();	 Catch:{ ea -> 0x0828 }
        r2 = bb;	 Catch:{ ea -> 0x0828 }
        r3 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r2 = r2[r3];	 Catch:{ ea -> 0x0828 }
        r0 = r0.append(r2);	 Catch:{ ea -> 0x0828 }
        r2 = r11.aj;	 Catch:{ ea -> 0x0828 }
        r0 = r0.append(r2);	 Catch:{ ea -> 0x0828 }
        r2 = bb;	 Catch:{ ea -> 0x0828 }
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r2 = r2[r3];	 Catch:{ ea -> 0x0828 }
        r2 = r0.append(r2);	 Catch:{ ea -> 0x0828 }
        if (r1 == 0) goto L_0x082a;
    L_0x0779:
        r0 = bb;	 Catch:{ ea -> 0x0828 }
        r1 = 267; // 0x10b float:3.74E-43 double:1.32E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x0828 }
    L_0x077f:
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.App.v(r0);
        if (r6 == 0) goto L_0x0008;
    L_0x078c:
        r0 = bb;
        r1 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r0 = r0[r1];
        r0 = r12.getStringExtra(r0);
        r1 = bb;
        r2 = 269; // 0x10d float:3.77E-43 double:1.33E-321;
        r1 = r1[r2];
        r1 = r12.getStringExtra(r1);
        if (r0 != 0) goto L_0x0832;
    L_0x07a2:
        r0 = bb;	 Catch:{ ea -> 0x07ad }
        r1 = 276; // 0x114 float:3.87E-43 double:1.364E-321;
        r0 = r0[r1];	 Catch:{ ea -> 0x07ad }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x07ad }
        goto L_0x0008;
    L_0x07ad:
        r0 = move-exception;
        throw r0;
    L_0x07af:
        r1 = move-exception;
        throw r1;	 Catch:{ ea -> 0x07b1, ei -> 0x07da, et -> 0x07f9, all -> 0x0818 }
    L_0x07b1:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x07b5:
        r2 = 12;
        r11.d(r2);	 Catch:{ all -> 0x08f0 }
        r2 = bb;	 Catch:{ all -> 0x08f0 }
        r3 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        r2 = r2[r3];	 Catch:{ all -> 0x08f0 }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ all -> 0x08f0 }
        r0 = r11.U;
        r2 = 0;
        r0.set(r2);
        r0 = r11.o;
        r0.c(r1);
        goto L_0x0758;
    L_0x07cf:
        r1 = move-exception;
        throw r1;	 Catch:{ ea -> 0x07d1, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
    L_0x07d1:
        r1 = move-exception;
        throw r1;	 Catch:{ ea -> 0x07d3, ei -> 0x0905, et -> 0x08fc, all -> 0x08f3 }
    L_0x07d3:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
        throw r0;	 Catch:{ ea -> 0x07d8, ei -> 0x0902, et -> 0x08f9 }
    L_0x07d8:
        r0 = move-exception;
        goto L_0x07b5;
    L_0x07da:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x07de:
        r2 = 11;
        r11.d(r2);	 Catch:{ all -> 0x08f0 }
        r2 = bb;	 Catch:{ all -> 0x08f0 }
        r3 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        r2 = r2[r3];	 Catch:{ all -> 0x08f0 }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ all -> 0x08f0 }
        r0 = r11.U;
        r2 = 0;
        r0.set(r2);
        r0 = r11.o;
        r0.c(r1);
        goto L_0x0758;
    L_0x07f9:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x07fd:
        r2 = 19;
        r11.d(r2);	 Catch:{ all -> 0x08f0 }
        r2 = bb;	 Catch:{ all -> 0x08f0 }
        r3 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r2 = r2[r3];	 Catch:{ all -> 0x08f0 }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ all -> 0x08f0 }
        r0 = r11.U;
        r2 = 0;
        r0.set(r2);
        r0 = r11.o;
        r0.c(r1);
        goto L_0x0758;
    L_0x0818:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x081c:
        r2 = r11.U;
        r3 = 0;
        r2.set(r3);
        r2 = r11.o;
        r2.c(r1);
        throw r0;
    L_0x0828:
        r0 = move-exception;
        throw r0;
    L_0x082a:
        r0 = bb;
        r1 = 283; // 0x11b float:3.97E-43 double:1.4E-321;
        r0 = r0[r1];
        goto L_0x077f;
    L_0x0832:
        if (r1 != 0) goto L_0x083d;
    L_0x0834:
        r2 = bb;	 Catch:{ ea -> 0x08e6 }
        r3 = 246; // 0xf6 float:3.45E-43 double:1.215E-321;
        r2 = r2[r3];	 Catch:{ ea -> 0x08e6 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ea -> 0x08e6 }
    L_0x083d:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r3 = bb;
        r4 = 278; // 0x116 float:3.9E-43 double:1.374E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r11.a(r0, r1);
        if (r2 == 0) goto L_0x089f;
    L_0x086b:
        r2 = new java.lang.StringBuilder;	 Catch:{ ea -> 0x08e8 }
        r2.<init>();	 Catch:{ ea -> 0x08e8 }
        r3 = bb;	 Catch:{ ea -> 0x08e8 }
        r4 = 294; // 0x126 float:4.12E-43 double:1.453E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x08e8 }
        r2 = r2.append(r3);	 Catch:{ ea -> 0x08e8 }
        r2 = r2.append(r0);	 Catch:{ ea -> 0x08e8 }
        r3 = bb;	 Catch:{ ea -> 0x08e8 }
        r4 = 298; // 0x12a float:4.18E-43 double:1.47E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x08e8 }
        r2 = r2.append(r3);	 Catch:{ ea -> 0x08e8 }
        r2 = r2.append(r1);	 Catch:{ ea -> 0x08e8 }
        r3 = bb;	 Catch:{ ea -> 0x08e8 }
        r4 = 288; // 0x120 float:4.04E-43 double:1.423E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x08e8 }
        r2 = r2.append(r3);	 Catch:{ ea -> 0x08e8 }
        r2 = r2.toString();	 Catch:{ ea -> 0x08e8 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ ea -> 0x08e8 }
        if (r6 == 0) goto L_0x0008;
    L_0x089f:
        r2 = new java.lang.StringBuilder;	 Catch:{ ea -> 0x08ea }
        r2.<init>();	 Catch:{ ea -> 0x08ea }
        r3 = bb;	 Catch:{ ea -> 0x08ea }
        r4 = 295; // 0x127 float:4.13E-43 double:1.457E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x08ea }
        r2 = r2.append(r3);	 Catch:{ ea -> 0x08ea }
        r0 = r2.append(r0);	 Catch:{ ea -> 0x08ea }
        r2 = bb;	 Catch:{ ea -> 0x08ea }
        r3 = 289; // 0x121 float:4.05E-43 double:1.43E-321;
        r2 = r2[r3];	 Catch:{ ea -> 0x08ea }
        r0 = r0.append(r2);	 Catch:{ ea -> 0x08ea }
        r0 = r0.append(r1);	 Catch:{ ea -> 0x08ea }
        r1 = bb;	 Catch:{ ea -> 0x08ea }
        r2 = 277; // 0x115 float:3.88E-43 double:1.37E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x08ea }
        r0 = r0.append(r1);	 Catch:{ ea -> 0x08ea }
        r0 = r0.toString();	 Catch:{ ea -> 0x08ea }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x08ea }
        if (r6 == 0) goto L_0x0008;
    L_0x08d3:
        r11.J();	 Catch:{ ea -> 0x08ec }
        if (r6 == 0) goto L_0x0008;
    L_0x08d8:
        r0 = 0;
        r11.a(r0);	 Catch:{ ea -> 0x08ee }
        if (r6 == 0) goto L_0x0008;
    L_0x08de:
        r0 = 1;
        r11.a(r0);	 Catch:{ ea -> 0x0129 }
        if (r6 == 0) goto L_0x0008;
    L_0x08e4:
        goto L_0x011e;
    L_0x08e6:
        r0 = move-exception;
        throw r0;
    L_0x08e8:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x08ea }
    L_0x08ea:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x08ec }
    L_0x08ec:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x08ee }
    L_0x08ee:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0129 }
    L_0x08f0:
        r0 = move-exception;
        goto L_0x081c;
    L_0x08f3:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
        goto L_0x081c;
    L_0x08f9:
        r0 = move-exception;
        goto L_0x07fd;
    L_0x08fc:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
        goto L_0x07fd;
    L_0x0902:
        r0 = move-exception;
        goto L_0x07de;
    L_0x0905:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
        goto L_0x07de;
    L_0x090b:
        r0 = r1;
        goto L_0x0743;
    L_0x090e:
        r2 = r1;
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.onHandleIntent(android.content.Intent):void");
    }

    static void b(vr vrVar) {
        a(vrVar);
    }

    private String a(@NonNull bs bsVar) {
        fs b = b(bsVar);
        if (b == null) {
            return null;
        }
        try {
            return b.g();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean Z() {
        /*
        r10 = this;
        r0 = 1;
        r1 = 0;
        r4 = c;
        r3 = K;
        r2 = ac;
        r5 = r();
        if (r5 == 0) goto L_0x0014;
    L_0x000e:
        r3 = ai;
        r2 = S;
        if (r4 == 0) goto L_0x001e;
    L_0x0014:
        r5 = ai();	 Catch:{ NullPointerException -> 0x002d }
        if (r5 == 0) goto L_0x001e;
    L_0x001a:
        r3 = ag;
        r2 = E;
    L_0x001e:
        if (r3 == 0) goto L_0x0031;
    L_0x0020:
        if (r2 == 0) goto L_0x0031;
    L_0x0022:
        r5 = ah;	 Catch:{ NullPointerException -> 0x002f }
        if (r5 == 0) goto L_0x0031;
    L_0x0026:
        r1 = r10.L;	 Catch:{ NullPointerException -> 0x002f }
        r2 = 1;
        r1.a(r2);	 Catch:{ NullPointerException -> 0x002f }
    L_0x002c:
        return r0;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        if (r3 != 0) goto L_0x003a;
    L_0x0033:
        r3 = ag();	 Catch:{ NullPointerException -> 0x00c7 }
        switch(r3) {
            case 0: goto L_0x003a;
            case 1: goto L_0x0069;
            case 2: goto L_0x0097;
            default: goto L_0x003a;
        };
    L_0x003a:
        if (r2 != 0) goto L_0x0043;
    L_0x003c:
        r2 = ag();	 Catch:{ NullPointerException -> 0x0101 }
        switch(r2) {
            case 0: goto L_0x0043;
            case 1: goto L_0x00d5;
            case 2: goto L_0x00ea;
            default: goto L_0x0043;
        };
    L_0x0043:
        r2 = ah;	 Catch:{ NullPointerException -> 0x0107 }
        if (r2 != 0) goto L_0x004e;
    L_0x0047:
        r2 = ag();	 Catch:{ NullPointerException -> 0x0109 }
        switch(r2) {
            case 0: goto L_0x004e;
            case 1: goto L_0x0117;
            case 2: goto L_0x0145;
            default: goto L_0x004e;
        };
    L_0x004e:
        r2 = E();	 Catch:{ NullPointerException -> 0x0175 }
        if (r2 == 0) goto L_0x0179;
    L_0x0054:
        r2 = ap();	 Catch:{ NullPointerException -> 0x0177 }
        if (r2 == 0) goto L_0x0179;
    L_0x005a:
        r2 = aj();	 Catch:{ NullPointerException -> 0x0067 }
        if (r2 == 0) goto L_0x0179;
    L_0x0060:
        r1 = r10.L;	 Catch:{ NullPointerException -> 0x0067 }
        r2 = 1;
        r1.a(r2);	 Catch:{ NullPointerException -> 0x0067 }
        goto L_0x002c;
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r3 = X;	 Catch:{ NullPointerException -> 0x00c9 }
        if (r3 != 0) goto L_0x0082;
    L_0x006d:
        r3 = r10.o;	 Catch:{ NullPointerException -> 0x00cb }
        r5 = r10.M;	 Catch:{ NullPointerException -> 0x00cb }
        r6 = r5.get();	 Catch:{ NullPointerException -> 0x00cb }
        r8 = r10.n;	 Catch:{ NullPointerException -> 0x00cb }
        r3.m(r6, r8);	 Catch:{ NullPointerException -> 0x00cb }
        r3 = r10.L;	 Catch:{ NullPointerException -> 0x00cb }
        r5 = 0;
        r3.a(r5);	 Catch:{ NullPointerException -> 0x00cb }
        if (r4 == 0) goto L_0x003a;
    L_0x0082:
        r3 = r10.o;	 Catch:{ NullPointerException -> 0x00cd }
        r5 = r10.M;	 Catch:{ NullPointerException -> 0x00cd }
        r6 = r5.get();	 Catch:{ NullPointerException -> 0x00cd }
        r8 = r10.n;	 Catch:{ NullPointerException -> 0x00cd }
        r3.f(r6, r8);	 Catch:{ NullPointerException -> 0x00cd }
        r3 = r10.L;	 Catch:{ NullPointerException -> 0x00cd }
        r5 = 0;
        r3.a(r5);	 Catch:{ NullPointerException -> 0x00cd }
        if (r4 == 0) goto L_0x003a;
    L_0x0097:
        r3 = u;	 Catch:{ NullPointerException -> 0x00cf }
        if (r3 != 0) goto L_0x00b0;
    L_0x009b:
        r3 = r10.o;	 Catch:{ NullPointerException -> 0x00d1 }
        r5 = r10.k;	 Catch:{ NullPointerException -> 0x00d1 }
        r6 = r5.get();	 Catch:{ NullPointerException -> 0x00d1 }
        r8 = r10.b;	 Catch:{ NullPointerException -> 0x00d1 }
        r3.k(r6, r8);	 Catch:{ NullPointerException -> 0x00d1 }
        r3 = r10.L;	 Catch:{ NullPointerException -> 0x00d1 }
        r5 = 0;
        r3.a(r5);	 Catch:{ NullPointerException -> 0x00d1 }
        if (r4 == 0) goto L_0x003a;
    L_0x00b0:
        r3 = r10.o;	 Catch:{ NullPointerException -> 0x00d3 }
        r5 = r10.k;	 Catch:{ NullPointerException -> 0x00d3 }
        r6 = r5.get();	 Catch:{ NullPointerException -> 0x00d3 }
        r8 = r10.b;	 Catch:{ NullPointerException -> 0x00d3 }
        r3.h(r6, r8);	 Catch:{ NullPointerException -> 0x00d3 }
        r3 = r10.L;	 Catch:{ NullPointerException -> 0x00d3 }
        r5 = 0;
        r3.a(r5);	 Catch:{ NullPointerException -> 0x00d3 }
        if (r4 == 0) goto L_0x003a;
    L_0x00c5:
        goto L_0x003a;
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00d3 }
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r2 = r10.o;	 Catch:{ NullPointerException -> 0x0103 }
        r3 = r10.M;	 Catch:{ NullPointerException -> 0x0103 }
        r6 = r3.get();	 Catch:{ NullPointerException -> 0x0103 }
        r8 = r10.n;	 Catch:{ NullPointerException -> 0x0103 }
        r2.e(r6, r8);	 Catch:{ NullPointerException -> 0x0103 }
        r2 = r10.L;	 Catch:{ NullPointerException -> 0x0103 }
        r3 = 0;
        r2.a(r3);	 Catch:{ NullPointerException -> 0x0103 }
        if (r4 == 0) goto L_0x0043;
    L_0x00ea:
        r2 = r10.o;	 Catch:{ NullPointerException -> 0x0105 }
        r3 = r10.k;	 Catch:{ NullPointerException -> 0x0105 }
        r6 = r3.get();	 Catch:{ NullPointerException -> 0x0105 }
        r8 = r10.b;	 Catch:{ NullPointerException -> 0x0105 }
        r2.b(r6, r8);	 Catch:{ NullPointerException -> 0x0105 }
        r2 = r10.L;	 Catch:{ NullPointerException -> 0x0105 }
        r3 = 0;
        r2.a(r3);	 Catch:{ NullPointerException -> 0x0105 }
        if (r4 == 0) goto L_0x0043;
    L_0x00ff:
        goto L_0x0043;
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0103 }
    L_0x0103:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0105 }
    L_0x0105:
        r0 = move-exception;
        throw r0;
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0109 }
    L_0x0109:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x010b }
    L_0x010b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x010d }
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0111 }
    L_0x0111:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0113 }
    L_0x0113:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0115 }
    L_0x0115:
        r0 = move-exception;
        throw r0;
    L_0x0117:
        r2 = bb;	 Catch:{ NullPointerException -> 0x010b }
        r3 = 38;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x010b }
        r3 = android.os.Environment.getExternalStorageState();	 Catch:{ NullPointerException -> 0x010b }
        r2 = r2.equals(r3);	 Catch:{ NullPointerException -> 0x010b }
        if (r2 == 0) goto L_0x0136;
    L_0x0127:
        r2 = r10.o;	 Catch:{ NullPointerException -> 0x010d }
        r3 = r10.M;	 Catch:{ NullPointerException -> 0x010d }
        r6 = r3.get();	 Catch:{ NullPointerException -> 0x010d }
        r8 = r10.n;	 Catch:{ NullPointerException -> 0x010d }
        r2.c(r6, r8);	 Catch:{ NullPointerException -> 0x010d }
        if (r4 == 0) goto L_0x004e;
    L_0x0136:
        r2 = r10.o;	 Catch:{ NullPointerException -> 0x010f }
        r3 = r10.M;	 Catch:{ NullPointerException -> 0x010f }
        r6 = r3.get();	 Catch:{ NullPointerException -> 0x010f }
        r8 = r10.n;	 Catch:{ NullPointerException -> 0x010f }
        r2.n(r6, r8);	 Catch:{ NullPointerException -> 0x010f }
        if (r4 == 0) goto L_0x004e;
    L_0x0145:
        r2 = bb;	 Catch:{ NullPointerException -> 0x0111 }
        r3 = 37;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0111 }
        r3 = android.os.Environment.getExternalStorageState();	 Catch:{ NullPointerException -> 0x0111 }
        r2 = r2.equals(r3);	 Catch:{ NullPointerException -> 0x0111 }
        if (r2 == 0) goto L_0x0164;
    L_0x0155:
        r2 = r10.o;	 Catch:{ NullPointerException -> 0x0113 }
        r3 = r10.k;	 Catch:{ NullPointerException -> 0x0113 }
        r6 = r3.get();	 Catch:{ NullPointerException -> 0x0113 }
        r8 = r10.b;	 Catch:{ NullPointerException -> 0x0113 }
        r2.a(r6, r8);	 Catch:{ NullPointerException -> 0x0113 }
        if (r4 == 0) goto L_0x004e;
    L_0x0164:
        r2 = r10.o;	 Catch:{ NullPointerException -> 0x0115 }
        r3 = r10.k;	 Catch:{ NullPointerException -> 0x0115 }
        r6 = r3.get();	 Catch:{ NullPointerException -> 0x0115 }
        r8 = r10.b;	 Catch:{ NullPointerException -> 0x0115 }
        r2.g(r6, r8);	 Catch:{ NullPointerException -> 0x0115 }
        if (r4 == 0) goto L_0x004e;
    L_0x0173:
        goto L_0x004e;
    L_0x0175:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0177 }
    L_0x0177:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0067 }
    L_0x0179:
        r0 = r1;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.Z():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean au() {
        /*
        r4 = this;
        r0 = r4.N;
        r0 = r4.a(r0);
        if (r0 != 0) goto L_0x0015;
    L_0x0008:
        r0 = bb;	 Catch:{ ee -> 0x0013 }
        r1 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r0 = r0[r1];	 Catch:{ ee -> 0x0013 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x0013 }
        r0 = 0;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r1 = r4.N;	 Catch:{ ee -> 0x0051 }
        r2 = new com.whatsapp.gdrive.s;	 Catch:{ ee -> 0x0051 }
        r2.<init>(r4, r0);	 Catch:{ ee -> 0x0051 }
        r0 = bb;	 Catch:{ ee -> 0x0051 }
        r3 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r0 = r0[r3];	 Catch:{ ee -> 0x0051 }
        r0 = com.whatsapp.gdrive.by.a(r1, r2, r0);	 Catch:{ ee -> 0x0051 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ ee -> 0x0051 }
        if (r0 != 0) goto L_0x002c;
    L_0x002a:
        r0 = java.lang.Boolean.FALSE;	 Catch:{ ee -> 0x0051 }
    L_0x002c:
        r1 = r0.booleanValue();	 Catch:{ ee -> 0x004d }
        if (r1 == 0) goto L_0x003f;
    L_0x0032:
        r1 = bb;	 Catch:{ ee -> 0x004d }
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r1 = r1[r2];	 Catch:{ ee -> 0x004d }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ee -> 0x004d }
        r1 = c;	 Catch:{ ee -> 0x004d }
        if (r1 == 0) goto L_0x0048;
    L_0x003f:
        r1 = bb;	 Catch:{ ee -> 0x004f }
        r2 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r1 = r1[r2];	 Catch:{ ee -> 0x004f }
        com.whatsapp.util.Log.e(r1);	 Catch:{ ee -> 0x004f }
    L_0x0048:
        r0 = r0.booleanValue();	 Catch:{ ee -> 0x0051 }
        goto L_0x0012;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        r1 = new com.whatsapp.gdrive.ew;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.au():boolean");
    }

    public static boolean az() {
        return f(1);
    }

    private boolean aa() {
        boolean z = c;
        String C = C();
        if (C == null) {
            try {
                Log.e(bb[423]);
                return false;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        String M = M();
        if (M == null) {
            try {
                Log.e(bb[418]);
                return false;
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        List<fs> a = this.L.a(bb[420], M, bb[419], this.N);
        if (a == null) {
            try {
                Log.e(bb[425]);
                return false;
            } catch (NullPointerException e22) {
                throw e22;
            }
        }
        try {
            if (a.size() == 0) {
                Log.i(bb[424]);
                return false;
            }
            boolean z2 = true;
            for (fs fsVar : a) {
                int i;
                boolean z3;
                Log.i(bb[416] + fsVar.e() + bb[421] + C);
                Boolean bool = (Boolean) by.a(v, new aw(this, fsVar, C), bb[415] + fsVar.e() + bb[422] + C);
                if (bool != null) {
                    try {
                        if (bool.booleanValue()) {
                            i = 1;
                            z3 = i & z2;
                            if (z) {
                                z2 = z3;
                                break;
                            }
                            z2 = z3;
                        }
                    } catch (NullPointerException e222) {
                        throw e222;
                    }
                }
                i = 0;
                z3 = i & z2;
                if (z) {
                    z2 = z3;
                    break;
                }
                z2 = z3;
            }
            try {
                StringBuilder append = new StringBuilder().append(bb[427]);
                if (z2) {
                    M = bb[426];
                } else {
                    M = bb[417];
                }
                Log.i(append.append(M).toString());
                return z2;
            } catch (NullPointerException e2222) {
                throw e2222;
            }
        } catch (NullPointerException e22222) {
            throw e22222;
        }
    }

    public void a(bi biVar) {
        try {
            this.o.unregisterObserver(biVar);
        } catch (IllegalStateException e) {
        }
    }

    private static long af() {
        return S().getLong(bb[179], 0);
    }

    static boolean R() {
        return ai();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean ao() {
        /*
        r12 = this;
        r4 = c;
        r0 = bb;
        r1 = 588; // 0x24c float:8.24E-43 double:2.905E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.o;
        r0.e();
        r5 = r12.q();
        r0 = r();	 Catch:{ InterruptedException -> 0x0025 }
        if (r0 != 0) goto L_0x0027;
    L_0x001a:
        r0 = bb;	 Catch:{ InterruptedException -> 0x0025 }
        r1 = 586; // 0x24a float:8.21E-43 double:2.895E-321;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x0025 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0025 }
        r0 = 0;
    L_0x0024:
        return r0;
    L_0x0025:
        r0 = move-exception;
        throw r0;
    L_0x0027:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1.add(r5);
        r0 = Q;
        java.util.Collections.addAll(r1, r0);
        r0 = b(r12);
        r2 = r0.iterator();
    L_0x003c:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x004d;
    L_0x0042:
        r0 = r2.next();
        r0 = (java.io.File) r0;
        r1.add(r0);
        if (r4 == 0) goto L_0x003c;
    L_0x004d:
        r0 = r12.N;	 Catch:{ InterruptedException -> 0x0060 }
        r0 = r12.a(r0);	 Catch:{ InterruptedException -> 0x0060 }
        if (r0 != 0) goto L_0x0062;
    L_0x0055:
        r0 = bb;	 Catch:{ InterruptedException -> 0x0060 }
        r1 = 584; // 0x248 float:8.18E-43 double:2.885E-321;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x0060 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ InterruptedException -> 0x0060 }
        r0 = 0;
        goto L_0x0024;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = r12.N;	 Catch:{ InterruptedException -> 0x0075 }
        r0 = r12.c(r0);	 Catch:{ InterruptedException -> 0x0075 }
        if (r0 != 0) goto L_0x0077;
    L_0x006a:
        r0 = bb;	 Catch:{ InterruptedException -> 0x0075 }
        r1 = 592; // 0x250 float:8.3E-43 double:2.925E-321;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x0075 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ InterruptedException -> 0x0075 }
        r0 = 0;
        goto L_0x0024;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = bb;	 Catch:{ InterruptedException -> 0x008a }
        r2 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r0 = r0[r2];	 Catch:{ InterruptedException -> 0x008a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x008a }
        r0 = r12.N;	 Catch:{ InterruptedException -> 0x008a }
        r0 = r0.a();	 Catch:{ InterruptedException -> 0x008a }
        if (r0 != 0) goto L_0x008c;
    L_0x0088:
        r0 = 0;
        goto L_0x0024;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = 0;
        r2 = r12.N;	 Catch:{ InterruptedException -> 0x0097 }
        r0 = r12.a(r0, r2);	 Catch:{ InterruptedException -> 0x0097 }
        if (r0 != 0) goto L_0x0099;
    L_0x0095:
        r0 = 0;
        goto L_0x0024;
    L_0x0097:
        r0 = move-exception;
        throw r0;
    L_0x0099:
        r0 = com.whatsapp.App.aK;
        r0 = r0.p();
        r2 = (long) r0;
        r12.r = r2;
        r2 = 0;
        r12.n = r2;
        r0 = new java.util.ArrayList;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.<init>(r2);
        r6 = java.util.Collections.synchronizedList(r0);
        r0 = r12.ae;
        r2 = 0;
        r0.set(r2);
        r0 = bb;
        r2 = 597; // 0x255 float:8.37E-43 double:2.95E-321;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r2 = r1.iterator();
    L_0x00c5:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00e0;
    L_0x00cb:
        r0 = r2.next();
        r0 = (java.io.File) r0;
        if (r0 == 0) goto L_0x00de;
    L_0x00d3:
        r8 = r12.e;	 Catch:{ InterruptedException -> 0x012f }
        r3 = V;	 Catch:{ InterruptedException -> 0x012f }
        r10 = com.whatsapp.gdrive.fn.a(r0, r3);	 Catch:{ InterruptedException -> 0x012f }
        r8 = r8 + r10;
        r12.e = r8;	 Catch:{ InterruptedException -> 0x012f }
    L_0x00de:
        if (r4 == 0) goto L_0x00c5;
    L_0x00e0:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = bb;
        r3 = 593; // 0x251 float:8.31E-43 double:2.93E-321;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r12.e;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = bb;
        r2 = 590; // 0x24e float:8.27E-43 double:2.915E-321;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r2 = new com.whatsapp.util.ab;
        r0 = bb;
        r3 = 594; // 0x252 float:8.32E-43 double:2.935E-321;
        r0 = r0[r3];
        r2.<init>(r0);
        r0 = 1;
        r3 = r1.iterator();
        r1 = r0;
    L_0x0116:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0350;
    L_0x011c:
        r0 = r3.next();
        r0 = (java.io.File) r0;
        if (r0 == 0) goto L_0x034d;
    L_0x0124:
        r1 = r12.N;	 Catch:{ InterruptedException -> 0x0131 }
        r1 = r1.a();	 Catch:{ InterruptedException -> 0x0131 }
        if (r1 != 0) goto L_0x0135;
    L_0x012c:
        r0 = 0;
        goto L_0x0024;
    L_0x012f:
        r0 = move-exception;
        throw r0;
    L_0x0131:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        throw r0;
    L_0x0135:
        r0 = r12.b(r6, r0);
        if (r0 != 0) goto L_0x013d;
    L_0x013b:
        if (r4 == 0) goto L_0x013f;
    L_0x013d:
        if (r4 == 0) goto L_0x034a;
    L_0x013f:
        r2.b();	 Catch:{ InterruptedException -> 0x0150 }
        if (r0 != 0) goto L_0x0152;
    L_0x0144:
        r0 = bb;	 Catch:{ InterruptedException -> 0x0150 }
        r1 = 591; // 0x24f float:8.28E-43 double:2.92E-321;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x0150 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ InterruptedException -> 0x0150 }
        r0 = 0;
        goto L_0x0024;
    L_0x0150:
        r0 = move-exception;
        throw r0;
    L_0x0152:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 598; // 0x256 float:8.38E-43 double:2.955E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r6.size();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r1 = r6.iterator();
    L_0x0174:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x018b;
    L_0x017a:
        r0 = r1.next();
        r0 = (java.io.File) r0;
        r2 = r12.n;
        r8 = r0.length();
        r2 = r2 + r8;
        r12.n = r2;
        if (r4 == 0) goto L_0x0174;
    L_0x018b:
        r0 = r12.N;	 Catch:{ InterruptedException -> 0x0196 }
        r0 = r0.a();	 Catch:{ InterruptedException -> 0x0196 }
        if (r0 != 0) goto L_0x0198;
    L_0x0193:
        r0 = 0;
        goto L_0x0024;
    L_0x0196:
        r0 = move-exception;
        throw r0;
    L_0x0198:
        r0 = r12.e;	 Catch:{ InterruptedException -> 0x020a }
        r2 = r12.al;	 Catch:{ InterruptedException -> 0x020a }
        r2 = r2.q();	 Catch:{ InterruptedException -> 0x020a }
        r0 = r0 + r2;
        r12.e = r0;	 Catch:{ InterruptedException -> 0x020a }
        r0 = R;	 Catch:{ InterruptedException -> 0x020a }
        r1 = 1;
        if (r0 != r1) goto L_0x01b4;
    L_0x01a8:
        r0 = r12.d;	 Catch:{ InterruptedException -> 0x020a }
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ InterruptedException -> 0x020a }
        r0.m = r1;	 Catch:{ InterruptedException -> 0x020a }
        if (r4 == 0) goto L_0x01c3;
    L_0x01b4:
        r0 = R;	 Catch:{ InterruptedException -> 0x020c }
        r1 = 2;
        if (r0 != r1) goto L_0x01c3;
    L_0x01b9:
        r0 = r12.d;	 Catch:{ InterruptedException -> 0x020e }
        r2 = 0;
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ InterruptedException -> 0x020e }
        r0.m = r1;	 Catch:{ InterruptedException -> 0x020e }
    L_0x01c3:
        r0 = A();
        r2 = 0;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x01d4;
    L_0x01cd:
        r0 = java.lang.System.currentTimeMillis();
        d(r0);
    L_0x01d4:
        r2 = r0;
        r0 = af();
        r7 = r12.M;	 Catch:{ InterruptedException -> 0x0210 }
        r7.set(r0);	 Catch:{ InterruptedException -> 0x0210 }
        r8 = r12.n;	 Catch:{ InterruptedException -> 0x0210 }
        r0 = r0 + r8;
        r12.n = r0;	 Catch:{ InterruptedException -> 0x0210 }
        r0 = r12.o;	 Catch:{ InterruptedException -> 0x0210 }
        r1 = r12.M;	 Catch:{ InterruptedException -> 0x0210 }
        r8 = r1.get();	 Catch:{ InterruptedException -> 0x0210 }
        r10 = r12.n;	 Catch:{ InterruptedException -> 0x0210 }
        r0.l(r8, r10);	 Catch:{ InterruptedException -> 0x0210 }
        r0 = r12.n;	 Catch:{ InterruptedException -> 0x0210 }
        r8 = 0;
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x0214;
    L_0x01f8:
        r0 = r12.O();	 Catch:{ InterruptedException -> 0x0210 }
        if (r0 != 0) goto L_0x0214;
    L_0x01fe:
        r0 = bb;	 Catch:{ InterruptedException -> 0x0212 }
        r1 = 587; // 0x24b float:8.23E-43 double:2.9E-321;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x0212 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ InterruptedException -> 0x0212 }
        r0 = 0;
        goto L_0x0024;
    L_0x020a:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x020c }
    L_0x020c:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x020e }
    L_0x020e:
        r0 = move-exception;
        throw r0;
    L_0x0210:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0212 }
    L_0x0212:
        r0 = move-exception;
        throw r0;
    L_0x0214:
        r0 = 1;
        r1 = 1;
        r12.a = r1;
        r7 = new java.util.concurrent.atomic.AtomicReference;
        r1 = 0;
        r7.<init>(r1);
        r1 = new java.util.concurrent.CountDownLatch;
        r8 = r6.size();
        r1.<init>(r8);
        r12.H = r1;
        r8 = r6.iterator();
        r1 = r0;
    L_0x022e:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x0347;
    L_0x0234:
        r0 = r8.next();
        r0 = (java.io.File) r0;
        r9 = r12.a(r6, r7);	 Catch:{ InterruptedException -> 0x0243 }
        if (r9 == 0) goto L_0x0245;
    L_0x0240:
        r0 = 0;
        goto L_0x0024;
    L_0x0243:
        r0 = move-exception;
        throw r0;
    L_0x0245:
        r0 = r12.a(r0, r7);
        r0 = r0 & r1;
        if (r4 == 0) goto L_0x0344;
    L_0x024c:
        r1 = bb;
        r8 = 582; // 0x246 float:8.16E-43 double:2.875E-321;
        r1 = r1[r8];
        com.whatsapp.util.Log.i(r1);
        r1 = r12.H;	 Catch:{ InterruptedException -> 0x026a }
        r8 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x026a }
        r1 = r1.await(r8, r10);	 Catch:{ InterruptedException -> 0x026a }
        r0 = r0 & r1;
    L_0x0261:
        r1 = r12.a(r6, r7);	 Catch:{ InterruptedException -> 0x0270 }
        if (r1 == 0) goto L_0x0272;
    L_0x0267:
        r0 = 0;
        goto L_0x0024;
    L_0x026a:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = 0;
        goto L_0x0261;
    L_0x0270:
        r0 = move-exception;
        throw r0;
    L_0x0272:
        r1 = r12.al;	 Catch:{ InterruptedException -> 0x02b2 }
        r6 = r5.getAbsolutePath();	 Catch:{ InterruptedException -> 0x02b2 }
        r6 = com.whatsapp.gdrive.fn.b(r6);	 Catch:{ InterruptedException -> 0x02b2 }
        r1 = r1.c(r6);	 Catch:{ InterruptedException -> 0x02b2 }
        if (r1 != 0) goto L_0x02b4;
    L_0x0282:
        r0 = bb;	 Catch:{ InterruptedException -> 0x02b2 }
        r1 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x02b2 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ InterruptedException -> 0x02b2 }
        r0 = new com.whatsapp.gdrive.e5;	 Catch:{ InterruptedException -> 0x02b2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x02b2 }
        r1.<init>();	 Catch:{ InterruptedException -> 0x02b2 }
        r2 = bb;	 Catch:{ InterruptedException -> 0x02b2 }
        r3 = 601; // 0x259 float:8.42E-43 double:2.97E-321;
        r2 = r2[r3];	 Catch:{ InterruptedException -> 0x02b2 }
        r1 = r1.append(r2);	 Catch:{ InterruptedException -> 0x02b2 }
        r1 = r1.append(r5);	 Catch:{ InterruptedException -> 0x02b2 }
        r2 = bb;	 Catch:{ InterruptedException -> 0x02b2 }
        r3 = 602; // 0x25a float:8.44E-43 double:2.974E-321;
        r2 = r2[r3];	 Catch:{ InterruptedException -> 0x02b2 }
        r1 = r1.append(r2);	 Catch:{ InterruptedException -> 0x02b2 }
        r1 = r1.toString();	 Catch:{ InterruptedException -> 0x02b2 }
        r0.<init>(r1);	 Catch:{ InterruptedException -> 0x02b2 }
        throw r0;	 Catch:{ InterruptedException -> 0x02b2 }
    L_0x02b2:
        r0 = move-exception;
        throw r0;
    L_0x02b4:
        r1 = r12.a;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x02e5;
    L_0x02b9:
        r0 = bb;
        r1 = 585; // 0x249 float:8.2E-43 double:2.89E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.H();
        if (r0 == 0) goto L_0x02d7;
    L_0x02c8:
        r0 = bb;
        r1 = 595; // 0x253 float:8.34E-43 double:2.94E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.au();
        if (r4 == 0) goto L_0x02ee;
    L_0x02d7:
        r0 = bb;	 Catch:{ InterruptedException -> 0x02e3 }
        r1 = 596; // 0x254 float:8.35E-43 double:2.945E-321;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x02e3 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x02e3 }
        r0 = 0;
        goto L_0x0024;
    L_0x02e3:
        r0 = move-exception;
        throw r0;
    L_0x02e5:
        r1 = bb;
        r4 = 583; // 0x247 float:8.17E-43 double:2.88E-321;
        r1 = r1[r4];
        com.whatsapp.util.Log.i(r1);
    L_0x02ee:
        r6 = java.lang.System.currentTimeMillis();
        r1 = r12.d;	 Catch:{ InterruptedException -> 0x033f }
        r4 = r12.M;	 Catch:{ InterruptedException -> 0x033f }
        r4 = r4.get();	 Catch:{ InterruptedException -> 0x033f }
        r8 = r12.Y;	 Catch:{ InterruptedException -> 0x033f }
        r8 = r8.get();	 Catch:{ InterruptedException -> 0x033f }
        r4 = r4 + r8;
        r4 = (double) r4;	 Catch:{ InterruptedException -> 0x033f }
        r4 = java.lang.Double.valueOf(r4);	 Catch:{ InterruptedException -> 0x033f }
        r1.d = r4;	 Catch:{ InterruptedException -> 0x033f }
        r1 = r12.d;	 Catch:{ InterruptedException -> 0x033f }
        r4 = r12.Y;	 Catch:{ InterruptedException -> 0x033f }
        r4 = r4.get();	 Catch:{ InterruptedException -> 0x033f }
        r4 = (double) r4;	 Catch:{ InterruptedException -> 0x033f }
        r4 = java.lang.Double.valueOf(r4);	 Catch:{ InterruptedException -> 0x033f }
        r1.g = r4;	 Catch:{ InterruptedException -> 0x033f }
        r1 = r12.d;	 Catch:{ InterruptedException -> 0x033f }
        r4 = r12.n;	 Catch:{ InterruptedException -> 0x033f }
        r8 = r12.e;	 Catch:{ InterruptedException -> 0x033f }
        r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r4 != 0) goto L_0x0341;
    L_0x0321:
        r4 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x0323:
        r4 = java.lang.Double.valueOf(r4);
        r1.n = r4;
        r1 = r12.d;
        r2 = r6 - r2;
        r2 = (double) r2;
        r2 = java.lang.Double.valueOf(r2);
        r1.f = r2;
        r1 = bb;
        r2 = 589; // 0x24d float:8.25E-43 double:2.91E-321;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        goto L_0x0024;
    L_0x033f:
        r0 = move-exception;
        throw r0;
    L_0x0341:
        r4 = 0;
        goto L_0x0323;
    L_0x0344:
        r1 = r0;
        goto L_0x022e;
    L_0x0347:
        r0 = r1;
        goto L_0x024c;
    L_0x034a:
        r1 = r0;
        goto L_0x0116;
    L_0x034d:
        r0 = r1;
        goto L_0x013d;
    L_0x0350:
        r0 = r1;
        goto L_0x013f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.ao():boolean");
    }

    static boolean b(@Nullable String str, long j) {
        if (str == null) {
            try {
                Log.e(bb[28] + j + bb[26]);
                return false;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        Editor edit = S().edit();
        try {
            edit.putLong(bb[25] + str, j);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[27]);
            return false;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    private boolean a(@NonNull fs fsVar, @NonNull fs fsVar2, @NonNull bs bsVar) {
        Log.i(bb[537] + fsVar.g() + bb[533] + fsVar2.g());
        Boolean bool = (Boolean) by.a(bsVar, new q(this, fsVar, fsVar2), bb[536]);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        try {
            if (!bool.booleanValue()) {
                Log.e(bb[535] + fsVar.g() + bb[532] + fsVar2.g() + bb[534]);
            }
            return bool.booleanValue();
        } catch (e9 e) {
            throw e;
        } catch (e9 e2) {
            Log.e(bb[531]);
            return false;
        }
    }

    private boolean b(@NonNull String str, @NonNull bs bsVar) {
        Boolean bool = (Boolean) by.a(bsVar, new z(this, str), bb[612] + str);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        try {
            if (!bool.booleanValue()) {
                return false;
            }
            Log.i(bb[611] + str + bb[613]);
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private boolean t() {
        boolean z = false;
        try {
            if (this.al == null) {
                if (!a(true, this.i)) {
                    Log.e(bb[448]);
                    return z;
                }
            }
            z = V();
            Set hashSet = new HashSet();
            hashSet.add(dg.g().getName());
            hashSet.add(fn.a());
            z = a(hashSet, z);
            try {
                f(0);
                if (z) {
                    x();
                }
                return z;
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(boolean r11, @android.support.annotation.NonNull com.whatsapp.gdrive.bs r12) {
        /*
        r10 = this;
        r2 = 1;
        r4 = 0;
        r3 = 0;
        r5 = c;
        if (r11 != 0) goto L_0x002f;
    L_0x0007:
        r0 = r10.ay();	 Catch:{ ee -> 0x002b }
        if (r0 == 0) goto L_0x002f;
    L_0x000d:
        r1 = r2;
    L_0x000e:
        r6 = r10.a(r12);
        if (r6 != 0) goto L_0x0031;
    L_0x0014:
        r0 = bb;	 Catch:{ ee -> 0x0029 }
        r1 = 80;
        r0 = r0[r1];	 Catch:{ ee -> 0x0029 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x0029 }
        r0 = new com.whatsapp.gdrive.ew;	 Catch:{ ee -> 0x0029 }
        r1 = bb;	 Catch:{ ee -> 0x0029 }
        r2 = 73;
        r1 = r1[r2];	 Catch:{ ee -> 0x0029 }
        r0.<init>(r1);	 Catch:{ ee -> 0x0029 }
        throw r0;	 Catch:{ ee -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r1 = r3;
        goto L_0x000e;
    L_0x0031:
        if (r1 == 0) goto L_0x0041;
    L_0x0033:
        r0 = bb;	 Catch:{ ee -> 0x007d }
        r7 = 85;
        r0 = r0[r7];	 Catch:{ ee -> 0x007d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x007d }
        r0 = 0;
        r10.al = r0;	 Catch:{ ee -> 0x007d }
        if (r5 == 0) goto L_0x00d8;
    L_0x0041:
        r0 = r10.b(r12);
        r7 = bb;
        r8 = 78;
        r7 = r7[r8];
        r0 = r0.b(r7);
        if (r0 == 0) goto L_0x00a3;
    L_0x0051:
        r7 = new com.whatsapp.gdrive.ao;	 Catch:{ ee -> 0x0083 }
        r7.<init>(r10, r0);	 Catch:{ ee -> 0x0083 }
        r0 = bb;	 Catch:{ ee -> 0x0083 }
        r8 = 81;
        r0 = r0[r8];	 Catch:{ ee -> 0x0083 }
        r0 = com.whatsapp.gdrive.by.a(r12, r7, r0);	 Catch:{ ee -> 0x0083 }
        r0 = (com.whatsapp.gdrive.fs) r0;	 Catch:{ ee -> 0x0083 }
        if (r0 == 0) goto L_0x006c;
    L_0x0064:
        r0 = java.util.Collections.singletonList(r0);	 Catch:{ ee -> 0x007f }
        r10.Z = r0;	 Catch:{ ee -> 0x007f }
        if (r5 == 0) goto L_0x006f;
    L_0x006c:
        r0 = 0;
        r10.Z = r0;	 Catch:{ ee -> 0x0081 }
    L_0x006f:
        r0 = r10.Z;	 Catch:{ ee -> 0x00ba }
        if (r0 != 0) goto L_0x00bc;
    L_0x0073:
        r0 = bb;	 Catch:{ ee -> 0x00ba }
        r1 = 71;
        r0 = r0[r1];	 Catch:{ ee -> 0x00ba }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x00ba }
    L_0x007c:
        return r3;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ ee -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        r7 = bb;	 Catch:{ ee -> 0x00b8 }
        r8 = 86;
        r7 = r7[r8];	 Catch:{ ee -> 0x00b8 }
        com.whatsapp.util.Log.b(r7, r0);	 Catch:{ ee -> 0x00b8 }
        r0 = r10.L;	 Catch:{ ee -> 0x00b8 }
        r7 = bb;	 Catch:{ ee -> 0x00b8 }
        r8 = 74;
        r7 = r7[r8];	 Catch:{ ee -> 0x00b8 }
        r8 = bb;	 Catch:{ ee -> 0x00b8 }
        r9 = 72;
        r8 = r8[r9];	 Catch:{ ee -> 0x00b8 }
        r0 = r0.a(r6, r7, r8, r12);	 Catch:{ ee -> 0x00b8 }
        r10.Z = r0;	 Catch:{ ee -> 0x00b8 }
        if (r5 == 0) goto L_0x006f;
    L_0x00a3:
        r0 = r10.L;	 Catch:{ ee -> 0x00b8 }
        r7 = bb;	 Catch:{ ee -> 0x00b8 }
        r8 = 77;
        r7 = r7[r8];	 Catch:{ ee -> 0x00b8 }
        r8 = bb;	 Catch:{ ee -> 0x00b8 }
        r9 = 70;
        r8 = r8[r9];	 Catch:{ ee -> 0x00b8 }
        r0 = r0.a(r6, r7, r8, r12);	 Catch:{ ee -> 0x00b8 }
        r10.Z = r0;	 Catch:{ ee -> 0x00b8 }
        goto L_0x006f;
    L_0x00b8:
        r0 = move-exception;
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = r10.Z;
        r0 = r0.size();
        if (r0 != 0) goto L_0x00cf;
    L_0x00c4:
        r0 = bb;
        r7 = 87;
        r0 = r0[r7];
        com.whatsapp.util.Log.i(r0);
        if (r5 == 0) goto L_0x00d8;
    L_0x00cf:
        r0 = r10.Z;
        r0 = r0.get(r3);
        r0 = (com.whatsapp.gdrive.fs) r0;
        r4 = r0;
    L_0x00d8:
        r0 = r10.L;	 Catch:{ ee -> 0x00ff }
        r0 = r0.f();	 Catch:{ ee -> 0x00ff }
        if (r0 != 0) goto L_0x007c;
    L_0x00e0:
        r0 = r10.al;
        if (r0 != 0) goto L_0x010a;
    L_0x00e4:
        r0 = bb;
        r7 = 82;
        r0 = r0[r7];
        com.whatsapp.util.Log.i(r0);
        r7 = r10.c(r12);
        if (r7 != 0) goto L_0x0101;
    L_0x00f3:
        r0 = bb;	 Catch:{ ee -> 0x00fd }
        r1 = 83;
        r0 = r0[r1];	 Catch:{ ee -> 0x00fd }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x00fd }
        goto L_0x007c;
    L_0x00fd:
        r0 = move-exception;
        throw r0;
    L_0x00ff:
        r0 = move-exception;
        throw r0;
    L_0x0101:
        r0 = new com.whatsapp.gdrive.b6;
        r3 = r10.L;
        r0.<init>(r3, r6, r7, r4);
        if (r5 == 0) goto L_0x010c;
    L_0x010a:
        r0 = r10.al;
    L_0x010c:
        r3 = r0.k();
        if (r3 != 0) goto L_0x016c;
    L_0x0112:
        r2 = bb;
        r3 = 76;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r3 = r0.a(r1, r12);
    L_0x011f:
        if (r3 == 0) goto L_0x0145;
    L_0x0121:
        r10.al = r0;	 Catch:{ ee -> 0x016a }
        r0 = new java.lang.StringBuilder;	 Catch:{ ee -> 0x016a }
        r0.<init>();	 Catch:{ ee -> 0x016a }
        r1 = bb;	 Catch:{ ee -> 0x016a }
        r2 = 79;
        r1 = r1[r2];	 Catch:{ ee -> 0x016a }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x016a }
        r1 = r10.al;	 Catch:{ ee -> 0x016a }
        r1 = r1.i();	 Catch:{ ee -> 0x016a }
        r0 = r0.append(r1);	 Catch:{ ee -> 0x016a }
        r0 = r0.toString();	 Catch:{ ee -> 0x016a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ee -> 0x016a }
        if (r5 == 0) goto L_0x014e;
    L_0x0145:
        r0 = bb;	 Catch:{ ee -> 0x016a }
        r1 = 75;
        r0 = r0[r1];	 Catch:{ ee -> 0x016a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ee -> 0x016a }
    L_0x014e:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 84;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x007c;
    L_0x016a:
        r0 = move-exception;
        throw r0;
    L_0x016c:
        r3 = r2;
        goto L_0x011f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.a(boolean, com.whatsapp.gdrive.bs):boolean");
    }

    static fs a(@NonNull bc bcVar, @NonNull fs fsVar, @NonNull bs bsVar) {
        String b = fsVar.b(bb[17]);
        if (b == null) {
            return null;
        }
        try {
            return (fs) by.a(bsVar, new w(bcVar, b), bb[18]);
        } catch (ee e) {
            Log.e(bb[19]);
            return null;
        }
    }

    private static boolean f(@at int i) {
        Log.i(bb[412] + i);
        Editor edit = S().edit();
        try {
            edit.putInt(bb[414], i);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[413]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public GoogleDriveService() {
        super(J);
        this.D = new dg(this);
        this.U = new AtomicBoolean(false);
        this.k = new AtomicLong(0);
        this.q = new AtomicLong(0);
        this.M = new AtomicLong(0);
        this.O = new AtomicInteger(0);
        this.Y = new AtomicLong(0);
        this.ae = new AtomicLong(0);
        this.o = new d_(null);
        this.N = new b4(this);
        this.i = new br(this);
        this.ak = new bq(this);
        if (this.A == null) {
            this.A = new cy(App.z());
            b(this.A);
        }
    }

    public static String g() {
        return S().getString(bb[317], null);
    }

    static bs g(GoogleDriveService googleDriveService) {
        return googleDriveService.N;
    }

    static String n(GoogleDriveService googleDriveService) {
        return googleDriveService.z;
    }

    private static long h() {
        return S().getLong(bb[33], -1);
    }

    private static long ae() {
        return S().getLong(bb[299], 0);
    }

    public static long d(@Nullable String str) {
        if (str == null) {
            try {
                Log.w(bb[491]);
                return 0;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        long j = S().getLong(bb[492] + str, 0);
        if (j != 0) {
            return j;
        }
        j = S().getLong(bb[495], 0);
        if (j == 0) {
            return j;
        }
        b(str, j);
        Editor edit = S().edit();
        try {
            edit.remove(bb[494]);
            if (edit.commit()) {
                return j;
            }
            Log.w(bb[493]);
            return j;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static b6 d(GoogleDriveService googleDriveService) {
        return googleDriveService.al;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(@android.support.annotation.Nullable com.whatsapp.vr r8) {
        /*
        r3 = 1;
        r1 = 0;
        if (r8 == 0) goto L_0x00d5;
    L_0x0004:
        r4 = r8.b();	 Catch:{ NullPointerException -> 0x00d3 }
        r6 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x00d5;
    L_0x000e:
        r4 = r8.b();	 Catch:{ NullPointerException -> 0x00d3 }
        r0 = (int) r4;
    L_0x0013:
        if (r8 == 0) goto L_0x001b;
    L_0x0015:
        r2 = r8.d();	 Catch:{ NullPointerException -> 0x00d8 }
        if (r2 == 0) goto L_0x001b;
    L_0x001b:
        r2 = s;	 Catch:{ NullPointerException -> 0x00da }
        r2.open();	 Catch:{ NullPointerException -> 0x00da }
        r2 = 1;
        ac = r2;	 Catch:{ NullPointerException -> 0x00da }
        r2 = aa;	 Catch:{ NullPointerException -> 0x00da }
        if (r2 != 0) goto L_0x002f;
    L_0x0027:
        if (r8 == 0) goto L_0x004c;
    L_0x0029:
        r2 = r8.c();	 Catch:{ NullPointerException -> 0x00de }
        if (r2 == 0) goto L_0x004c;
    L_0x002f:
        r2 = ad;	 Catch:{ NullPointerException -> 0x00e0 }
        r2.open();	 Catch:{ NullPointerException -> 0x00e0 }
        r2 = an;	 Catch:{ NullPointerException -> 0x00e0 }
        r2.open();	 Catch:{ NullPointerException -> 0x00e0 }
        r2 = S;	 Catch:{ NullPointerException -> 0x00e0 }
        if (r2 == 0) goto L_0x0041;
    L_0x003d:
        r2 = E;	 Catch:{ NullPointerException -> 0x00e2 }
        if (r2 != 0) goto L_0x00e4;
    L_0x0041:
        r2 = r3;
    L_0x0042:
        r4 = 1;
        S = r4;	 Catch:{ NullPointerException -> 0x00e7 }
        r4 = 1;
        E = r4;	 Catch:{ NullPointerException -> 0x00e7 }
        r4 = c;	 Catch:{ NullPointerException -> 0x00e7 }
        if (r4 == 0) goto L_0x00f2;
    L_0x004c:
        r2 = ad;	 Catch:{ NullPointerException -> 0x00e9 }
        r2.close();	 Catch:{ NullPointerException -> 0x00e9 }
        r2 = an;	 Catch:{ NullPointerException -> 0x00e9 }
        r2.close();	 Catch:{ NullPointerException -> 0x00e9 }
        r2 = S;	 Catch:{ NullPointerException -> 0x00e9 }
        if (r2 != 0) goto L_0x005e;
    L_0x005a:
        r2 = E;	 Catch:{ NullPointerException -> 0x00eb }
        if (r2 == 0) goto L_0x00ed;
    L_0x005e:
        S = r1;
        E = r1;
    L_0x0062:
        if (r3 == 0) goto L_0x00d2;
    L_0x0064:
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00f0 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x00f0 }
        r2 = bb;	 Catch:{ NullPointerException -> 0x00f0 }
        r3 = 466; // 0x1d2 float:6.53E-43 double:2.3E-321;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00f0 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r1.append(r0);	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x00f0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00f0 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x00f0 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x00f0 }
        r2 = 463; // 0x1cf float:6.49E-43 double:2.288E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00f0 }
        r1 = S;	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x00f0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00f0 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x00f0 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x00f0 }
        r2 = 465; // 0x1d1 float:6.52E-43 double:2.297E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00f0 }
        r1 = E;	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x00f0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00f0 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x00f0 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x00f0 }
        r2 = 464; // 0x1d0 float:6.5E-43 double:2.29E-321;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00f0 }
        r1 = aa;	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00f0 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x00f0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x00f0 }
    L_0x00d2:
        return;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = r1;
        goto L_0x0013;
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r2 = r1;
        goto L_0x0042;
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00eb }
    L_0x00eb:
        r0 = move-exception;
        throw r0;
    L_0x00ed:
        r3 = r1;
        goto L_0x005e;
    L_0x00f0:
        r0 = move-exception;
        throw r0;
    L_0x00f2:
        r3 = r2;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.a(com.whatsapp.vr):void");
    }

    static boolean V() {
        return S().getBoolean(bb[32], false);
    }

    static boolean c(int i) {
        switch (i) {
            case v.m /*0*/:
            case at.g /*1*/:
            case at.i /*2*/:
            case at.o /*3*/:
            case at.p /*4*/:
                if (!c) {
                    Editor edit = S().edit();
                    try {
                        edit.putString(bb[2], String.valueOf(i));
                        if (edit.commit()) {
                            return true;
                        }
                        Log.w(bb[1]);
                        return false;
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                break;
        }
        try {
            Log.e(bb[0] + i);
            return false;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static boolean B() {
        return f(0);
    }

    public long U() {
        auv.a(this.al);
        return this.al.b();
    }

    private static boolean ap() {
        try {
            if (!r()) {
                try {
                    if (ai()) {
                        if (!an.block(86400000)) {
                            Log.e(bb[452]);
                            return false;
                        }
                    }
                } catch (NullPointerException e) {
                    throw e;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            } else if (!ad.block(86400000)) {
                Log.e(bb[451]);
                return false;
            }
            return true;
        } catch (NullPointerException e22) {
            throw e22;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    static boolean d() {
        return E();
    }

    private static boolean c() {
        Editor edit = S().edit();
        try {
            edit.putInt(bb[52], 0);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[51]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public long N() {
        return this.b;
    }

    static String j(GoogleDriveService googleDriveService) {
        return googleDriveService.y;
    }

    static void I() {
        aa = true;
        a((vr) h.b().b(vr.class));
        bq.a(new da());
    }

    static boolean c(boolean z) {
        Editor edit = S().edit();
        try {
            edit.putBoolean(bb[35], z);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[34] + z + bb[36]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static boolean x() {
        Editor edit = S().edit();
        try {
            edit.remove(bb[arj.Theme_ratingBarStyle]);
            edit.remove(bb[arj.Theme_checkedTextViewStyle]);
            edit.remove(bb[arj.Theme_seekBarStyle]);
            edit.remove(bb[arj.Theme_spinnerStyle]);
            edit.remove(bb[arj.Theme_radioButtonStyle]);
            edit.remove(bb[arj.Theme_editTextStyle]);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[arj.Theme_switchStyle]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static long i(GoogleDriveService googleDriveService) {
        return googleDriveService.n;
    }

    @TargetApi(9)
    private static void a(long j) {
        Editor edit = S().edit();
        edit.putLong(bb[450], j);
        edit.apply();
    }

    static long e(GoogleDriveService googleDriveService) {
        return googleDriveService.b;
    }

    static String c(@NonNull Context context) {
        String A = App.A(context);
        if (A != null) {
            return i(A);
        }
        try {
            Log.e(bb[arj.Theme_checkboxStyle]);
            return null;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public cy ad() {
        return this.A;
    }

    static String g(String str) {
        return j(str);
    }

    public static int j() {
        int i = 0;
        try {
            i = Integer.parseInt(S().getString(bb[546], String.valueOf(0)));
        } catch (Throwable e) {
            Log.b(bb[547], e);
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r14, java.lang.String r15) {
        /*
        r13 = this;
        r12 = 11;
        r10 = 1;
        r11 = 0;
        r0 = r13.aj;	 Catch:{ NullPointerException -> 0x001d }
        r1 = v;	 Catch:{ NullPointerException -> 0x001d }
        r0 = r13.a(r0, r1);	 Catch:{ NullPointerException -> 0x001d }
        if (r0 != 0) goto L_0x001f;
    L_0x000e:
        r0 = bb;	 Catch:{ NullPointerException -> 0x001d }
        r1 = 496; // 0x1f0 float:6.95E-43 double:2.45E-321;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x001d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x001d }
        r0 = 11;
        r13.d(r0);	 Catch:{ NullPointerException -> 0x001d }
    L_0x001c:
        return r11;
    L_0x001d:
        r0 = move-exception;
        throw r0;
    L_0x001f:
        r2 = i(r14);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = r13.L;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r1 = bb;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r3 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        r1 = r1[r3];	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r3 = bb;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r4 = 497; // 0x1f1 float:6.96E-43 double:2.456E-321;
        r3 = r3[r4];	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r4 = v;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r5 = 1;
        r0 = r0.a(r1, r2, r3, r4, r5);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        if (r0 != 0) goto L_0x0069;
    L_0x003a:
        r0 = new java.lang.StringBuilder;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0.<init>();	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r1 = bb;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r3 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        r1 = r1[r3];	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = r0.append(r1);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r1 = bb;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r2 = 502; // 0x1f6 float:7.03E-43 double:2.48E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = r0.append(r1);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = r0.toString();	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        goto L_0x001c;
    L_0x005f:
        r0 = move-exception;
        r1 = 12;
        r13.d(r1);
        com.whatsapp.util.Log.a(r0);
        goto L_0x001c;
    L_0x0069:
        r1 = r0.size();	 Catch:{ NullPointerException -> 0x0092 }
        if (r1 != 0) goto L_0x0094;
    L_0x006f:
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0092 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x0092 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x0092 }
        r3 = 498; // 0x1f2 float:6.98E-43 double:2.46E-321;
        r1 = r1[r3];	 Catch:{ NullPointerException -> 0x0092 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0092 }
        r0 = r0.append(r2);	 Catch:{ NullPointerException -> 0x0092 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x0092 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x0092 }
        goto L_0x001c;
    L_0x008a:
        r0 = move-exception;
        r13.d(r12);
        com.whatsapp.util.Log.a(r0);
        goto L_0x001c;
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r1 = 0;
        r0 = r0.get(r1);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = (com.whatsapp.gdrive.fs) r0;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        if (r0 == 0) goto L_0x00a3;
    L_0x009d:
        r1 = r0.g();	 Catch:{ ea -> 0x00ca, ei -> 0x008a, et -> 0x00bf }
        if (r1 != 0) goto L_0x00cc;
    L_0x00a3:
        r0 = new java.lang.StringBuilder;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0.<init>();	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r1 = bb;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r3 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r1 = r1[r3];	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = r0.append(r1);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = r0.toString();	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        goto L_0x001c;
    L_0x00bf:
        r0 = move-exception;
        r1 = 19;
        r13.d(r1);
        com.whatsapp.util.Log.a(r0);
        goto L_0x001c;
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
    L_0x00cc:
        r7 = r0.g();	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r1 = r13.L;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r3 = v;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = a(r1, r0, r3);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        if (r0 == 0) goto L_0x0103;
    L_0x00da:
        r8 = r0.g();	 Catch:{ ea -> 0x0101, ei -> 0x008a, et -> 0x00bf }
    L_0x00de:
        r0 = v;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r3 = new com.whatsapp.gdrive.ae;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r4 = r13;
        r5 = r15;
        r6 = r14;
        r9 = r2;
        r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r1 = bb;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r2 = 501; // 0x1f5 float:7.02E-43 double:2.475E-321;
        r1 = r1[r2];	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = com.whatsapp.gdrive.by.a(r0, r3, r1);	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        r0 = (java.lang.Boolean) r0;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
        if (r0 == 0) goto L_0x0109;
    L_0x00f7:
        r0 = r0.booleanValue();	 Catch:{ ea -> 0x0105, ei -> 0x008a, et -> 0x00bf }
        if (r0 == 0) goto L_0x0109;
    L_0x00fd:
        r0 = r10;
    L_0x00fe:
        r11 = r0;
        goto L_0x001c;
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
    L_0x0103:
        r8 = 0;
        goto L_0x00de;
    L_0x0105:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x0107, ei -> 0x008a, et -> 0x00bf }
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ ea -> 0x005f, ei -> 0x008a, et -> 0x00bf }
    L_0x0109:
        r0 = r11;
        goto L_0x00fe;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.a(java.lang.String, java.lang.String):boolean");
    }

    static int L() {
        return S().getInt(bb[53], 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void al() {
        /*
        r2 = 1;
        r1 = 0;
        r4 = c;
        com.whatsapp.auv.b();
        r0 = com.whatsapp.App.az();
        R = r0;
        r0 = R;
        switch(r0) {
            case 0: goto L_0x018f;
            case 1: goto L_0x006a;
            case 2: goto L_0x0108;
            case 3: goto L_0x015f;
            default: goto L_0x0012;
        };
    L_0x0012:
        r0 = r1;
    L_0x0013:
        if (r0 == 0) goto L_0x0069;
    L_0x0015:
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0208 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x0208 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x0208 }
        r2 = 46;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0208 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0208 }
        r1 = K;	 Catch:{ NullPointerException -> 0x0208 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0208 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x0208 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0208 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0208 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x0208 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x0208 }
        r2 = 49;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0208 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0208 }
        r1 = ag;	 Catch:{ NullPointerException -> 0x0208 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0208 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x0208 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0208 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0208 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x0208 }
        r1 = bb;	 Catch:{ NullPointerException -> 0x0208 }
        r2 = 50;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0208 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0208 }
        r1 = ai;	 Catch:{ NullPointerException -> 0x0208 }
        r0 = r0.append(r1);	 Catch:{ NullPointerException -> 0x0208 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x0208 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0208 }
    L_0x0069:
        return;
    L_0x006a:
        r0 = com.whatsapp.App.ad;
        r3 = r0.getActiveNetworkInfo();
        if (r3 != 0) goto L_0x00a2;
    L_0x0072:
        r0 = bb;	 Catch:{ NullPointerException -> 0x01bc }
        r5 = 42;
        r0 = r0[r5];	 Catch:{ NullPointerException -> 0x01bc }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x01bc }
        r0 = x;	 Catch:{ NullPointerException -> 0x01bc }
        r0.close();	 Catch:{ NullPointerException -> 0x01bc }
        r0 = I;	 Catch:{ NullPointerException -> 0x01bc }
        r0.close();	 Catch:{ NullPointerException -> 0x01bc }
        r0 = af;	 Catch:{ NullPointerException -> 0x01bc }
        r0.close();	 Catch:{ NullPointerException -> 0x01bc }
        r0 = K;	 Catch:{ NullPointerException -> 0x01bc }
        if (r0 != 0) goto L_0x0096;
    L_0x008e:
        r0 = ag;	 Catch:{ NullPointerException -> 0x01be }
        if (r0 != 0) goto L_0x0096;
    L_0x0092:
        r0 = ai;	 Catch:{ NullPointerException -> 0x01c0 }
        if (r0 == 0) goto L_0x01c2;
    L_0x0096:
        r0 = r2;
    L_0x0097:
        r5 = 0;
        K = r5;	 Catch:{ NullPointerException -> 0x01c5 }
        r5 = 0;
        ag = r5;	 Catch:{ NullPointerException -> 0x01c5 }
        r5 = 0;
        ai = r5;	 Catch:{ NullPointerException -> 0x01c5 }
        if (r4 == 0) goto L_0x0013;
    L_0x00a2:
        r0 = com.whatsapp.messaging.CaptivePortalActivity.a(r3);	 Catch:{ NullPointerException -> 0x01c7 }
        if (r0 == 0) goto L_0x00d8;
    L_0x00a8:
        r0 = bb;	 Catch:{ NullPointerException -> 0x01c9 }
        r3 = 47;
        r0 = r0[r3];	 Catch:{ NullPointerException -> 0x01c9 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x01c9 }
        r0 = x;	 Catch:{ NullPointerException -> 0x01c9 }
        r0.close();	 Catch:{ NullPointerException -> 0x01c9 }
        r0 = I;	 Catch:{ NullPointerException -> 0x01c9 }
        r0.close();	 Catch:{ NullPointerException -> 0x01c9 }
        r0 = af;	 Catch:{ NullPointerException -> 0x01c9 }
        r0.close();	 Catch:{ NullPointerException -> 0x01c9 }
        r0 = K;	 Catch:{ NullPointerException -> 0x01c9 }
        if (r0 != 0) goto L_0x00cc;
    L_0x00c4:
        r0 = ag;	 Catch:{ NullPointerException -> 0x01cb }
        if (r0 != 0) goto L_0x00cc;
    L_0x00c8:
        r0 = ai;	 Catch:{ NullPointerException -> 0x01cd }
        if (r0 == 0) goto L_0x01cf;
    L_0x00cc:
        r0 = r2;
    L_0x00cd:
        r3 = 0;
        K = r3;	 Catch:{ NullPointerException -> 0x01d2 }
        r3 = 0;
        ag = r3;	 Catch:{ NullPointerException -> 0x01d2 }
        r3 = 0;
        ai = r3;	 Catch:{ NullPointerException -> 0x01d2 }
        if (r4 == 0) goto L_0x0013;
    L_0x00d8:
        r0 = bb;	 Catch:{ NullPointerException -> 0x01d4 }
        r3 = 43;
        r0 = r0[r3];	 Catch:{ NullPointerException -> 0x01d4 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x01d4 }
        r0 = x;	 Catch:{ NullPointerException -> 0x01d4 }
        r0.open();	 Catch:{ NullPointerException -> 0x01d4 }
        r0 = I;	 Catch:{ NullPointerException -> 0x01d4 }
        r0.open();	 Catch:{ NullPointerException -> 0x01d4 }
        r0 = af;	 Catch:{ NullPointerException -> 0x01d4 }
        r0.open();	 Catch:{ NullPointerException -> 0x01d4 }
        r0 = K;	 Catch:{ NullPointerException -> 0x01d4 }
        if (r0 == 0) goto L_0x00fc;
    L_0x00f4:
        r0 = ag;	 Catch:{ NullPointerException -> 0x01d6 }
        if (r0 == 0) goto L_0x00fc;
    L_0x00f8:
        r0 = ai;	 Catch:{ NullPointerException -> 0x01d8 }
        if (r0 != 0) goto L_0x01da;
    L_0x00fc:
        r0 = r2;
    L_0x00fd:
        r3 = 1;
        K = r3;	 Catch:{ NullPointerException -> 0x01dd }
        r3 = 1;
        ag = r3;	 Catch:{ NullPointerException -> 0x01dd }
        r3 = 1;
        ai = r3;	 Catch:{ NullPointerException -> 0x01dd }
        if (r4 == 0) goto L_0x0013;
    L_0x0108:
        r0 = bb;	 Catch:{ NullPointerException -> 0x01df }
        r3 = 44;
        r0 = r0[r3];	 Catch:{ NullPointerException -> 0x01df }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x01df }
        r0 = x;	 Catch:{ NullPointerException -> 0x01df }
        r0.open();	 Catch:{ NullPointerException -> 0x01df }
        r0 = K;	 Catch:{ NullPointerException -> 0x01df }
        if (r0 != 0) goto L_0x01e1;
    L_0x011a:
        r0 = r2;
    L_0x011b:
        r3 = 1;
        K = r3;	 Catch:{ NullPointerException -> 0x01e4 }
        r3 = G;	 Catch:{ NullPointerException -> 0x01e4 }
        if (r3 != 0) goto L_0x0126;
    L_0x0122:
        r3 = X;	 Catch:{ NullPointerException -> 0x01e6 }
        if (r3 != r2) goto L_0x0135;
    L_0x0126:
        r3 = af;	 Catch:{ NullPointerException -> 0x01e8 }
        r3.open();	 Catch:{ NullPointerException -> 0x01e8 }
        r3 = ai;	 Catch:{ NullPointerException -> 0x01e8 }
        if (r3 != 0) goto L_0x01ea;
    L_0x012f:
        r3 = r2;
    L_0x0130:
        r0 = r0 | r3;
        ai = r2;
        if (r4 == 0) goto L_0x020d;
    L_0x0135:
        r3 = af;
        r3.close();
        r3 = ai;
        r3 = r3 | r0;
        ai = r1;
    L_0x013f:
        r0 = u;	 Catch:{ NullPointerException -> 0x01ed }
        if (r0 != r2) goto L_0x020a;
    L_0x0143:
        r0 = I;	 Catch:{ NullPointerException -> 0x01ef }
        r0.open();	 Catch:{ NullPointerException -> 0x01ef }
        r0 = ag;	 Catch:{ NullPointerException -> 0x01ef }
        if (r0 != 0) goto L_0x01f1;
    L_0x014c:
        r0 = r2;
    L_0x014d:
        r0 = r0 | r3;
        ag = r2;
        if (r4 == 0) goto L_0x0013;
    L_0x0152:
        r3 = I;
        r3.close();
        r3 = ag;
        r0 = r0 | r3;
        r3 = 0;
        ag = r3;	 Catch:{ NullPointerException -> 0x01f4 }
        if (r4 == 0) goto L_0x0013;
    L_0x015f:
        r0 = bb;	 Catch:{ NullPointerException -> 0x01f6 }
        r3 = 45;
        r0 = r0[r3];	 Catch:{ NullPointerException -> 0x01f6 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x01f6 }
        r0 = x;	 Catch:{ NullPointerException -> 0x01f6 }
        r0.open();	 Catch:{ NullPointerException -> 0x01f6 }
        r0 = I;	 Catch:{ NullPointerException -> 0x01f6 }
        r0.close();	 Catch:{ NullPointerException -> 0x01f6 }
        r0 = af;	 Catch:{ NullPointerException -> 0x01f6 }
        r0.close();	 Catch:{ NullPointerException -> 0x01f6 }
        r0 = K;	 Catch:{ NullPointerException -> 0x01f6 }
        if (r0 == 0) goto L_0x0183;
    L_0x017b:
        r0 = ag;	 Catch:{ NullPointerException -> 0x01f8 }
        if (r0 != 0) goto L_0x0183;
    L_0x017f:
        r0 = ai;	 Catch:{ NullPointerException -> 0x01fa }
        if (r0 == 0) goto L_0x01fc;
    L_0x0183:
        r0 = r2;
    L_0x0184:
        r3 = 1;
        K = r3;	 Catch:{ NullPointerException -> 0x01fe }
        r3 = 0;
        ag = r3;	 Catch:{ NullPointerException -> 0x01fe }
        r3 = 0;
        ai = r3;	 Catch:{ NullPointerException -> 0x01fe }
        if (r4 == 0) goto L_0x0013;
    L_0x018f:
        r0 = bb;	 Catch:{ NullPointerException -> 0x0200 }
        r3 = 48;
        r0 = r0[r3];	 Catch:{ NullPointerException -> 0x0200 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NullPointerException -> 0x0200 }
        r0 = x;	 Catch:{ NullPointerException -> 0x0200 }
        r0.close();	 Catch:{ NullPointerException -> 0x0200 }
        r0 = I;	 Catch:{ NullPointerException -> 0x0200 }
        r0.close();	 Catch:{ NullPointerException -> 0x0200 }
        r0 = af;	 Catch:{ NullPointerException -> 0x0200 }
        r0.close();	 Catch:{ NullPointerException -> 0x0200 }
        r0 = K;	 Catch:{ NullPointerException -> 0x0200 }
        if (r0 != 0) goto L_0x01b3;
    L_0x01ab:
        r0 = ag;	 Catch:{ NullPointerException -> 0x0202 }
        if (r0 != 0) goto L_0x01b3;
    L_0x01af:
        r0 = ai;	 Catch:{ NullPointerException -> 0x0204 }
        if (r0 == 0) goto L_0x0206;
    L_0x01b3:
        K = r1;
        ag = r1;
        ai = r1;
        r0 = r2;
        goto L_0x0013;
    L_0x01bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01be }
    L_0x01be:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01c0 }
    L_0x01c0:
        r0 = move-exception;
        throw r0;
    L_0x01c2:
        r0 = r1;
        goto L_0x0097;
    L_0x01c5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01c7 }
    L_0x01c7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01c9 }
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01cb }
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r0 = r1;
        goto L_0x00cd;
    L_0x01d2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01d4 }
    L_0x01d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01d6 }
    L_0x01d6:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01d8 }
    L_0x01d8:
        r0 = move-exception;
        throw r0;
    L_0x01da:
        r0 = r1;
        goto L_0x00fd;
    L_0x01dd:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01df }
    L_0x01df:
        r0 = move-exception;
        throw r0;
    L_0x01e1:
        r0 = r1;
        goto L_0x011b;
    L_0x01e4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01e6 }
    L_0x01e6:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01e8 }
    L_0x01e8:
        r0 = move-exception;
        throw r0;
    L_0x01ea:
        r3 = r1;
        goto L_0x0130;
    L_0x01ed:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01ef }
    L_0x01ef:
        r0 = move-exception;
        throw r0;
    L_0x01f1:
        r0 = r1;
        goto L_0x014d;
    L_0x01f4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01f6 }
    L_0x01f6:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01f8 }
    L_0x01f8:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01fa }
    L_0x01fa:
        r0 = move-exception;
        throw r0;
    L_0x01fc:
        r0 = r1;
        goto L_0x0184;
    L_0x01fe:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0200 }
    L_0x0200:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0202 }
    L_0x0202:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0204 }
    L_0x0204:
        r0 = move-exception;
        throw r0;
    L_0x0206:
        r2 = r1;
        goto L_0x01b3;
    L_0x0208:
        r0 = move-exception;
        throw r0;
    L_0x020a:
        r0 = r3;
        goto L_0x0152;
    L_0x020d:
        r3 = r0;
        goto L_0x013f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.al():void");
    }

    private static boolean ai() {
        return f.get();
    }

    private static void K() {
        e(Environment.getExternalStorageState());
    }

    void a(b6 b6Var) {
        try {
            if (this.al != null) {
                Log.e(bb[124]);
            }
            this.al = b6Var;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static boolean ax() {
        return f(2);
    }

    private static String a(@NonNull Context context) {
        String A = App.A(context);
        if (A != null) {
            return j(A);
        }
        try {
            Log.e(bb[54]);
            return null;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private boolean a(@NonNull File file, @NonNull AtomicReference atomicReference) {
        try {
            if (file.exists()) {
                try {
                    if (file.isDirectory()) {
                        throw new IllegalStateException(bb[398] + file.getAbsolutePath());
                    }
                    try {
                        if (r()) {
                            try {
                                if (this.n <= 0 || (100.0d * ((double) this.Y.get())) / ((double) this.n) <= 1.0d) {
                                    String b = fn.b(file.getAbsolutePath());
                                    if (b == null) {
                                        try {
                                            Log.e(bb[394] + file.getAbsolutePath() + bb[399]);
                                            return false;
                                        } catch (IOException e) {
                                            throw e;
                                        }
                                    }
                                    boolean d;
                                    String c;
                                    try {
                                        d = dg.d(file);
                                    } catch (Throwable e2) {
                                        Log.b(bb[400] + file.getAbsolutePath(), e2);
                                        d = false;
                                    }
                                    if (d) {
                                        try {
                                            c = c(this.N);
                                        } catch (IOException e3) {
                                            throw e3;
                                        }
                                    }
                                    c = a(this.N);
                                    if (c == null) {
                                        try {
                                            Log.e(bb[401] + file.getAbsolutePath());
                                            return false;
                                        } catch (IOException e32) {
                                            throw e32;
                                        }
                                    }
                                    fd.a(new ba(this, atomicReference, c, file, b));
                                    return true;
                                }
                                Log.i(bb[402] + this.Y.get() + bb[393] + this.n);
                                return false;
                            } catch (IOException e322) {
                                throw e322;
                            } catch (IOException e3222) {
                                throw e3222;
                            }
                        }
                        Log.i(bb[396]);
                        this.H.countDown();
                        return false;
                    } catch (IOException e32222) {
                        throw e32222;
                    }
                } catch (IOException e322222) {
                    throw e322222;
                }
            }
            Log.i(bb[397] + file.getAbsolutePath() + bb[395]);
            this.O.incrementAndGet();
            this.H.countDown();
            return true;
        } catch (IOException e3222222) {
            throw e3222222;
        }
    }

    @NonNull
    private static String i(@NonNull String str) {
        return j(str) + bb[571];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void J() {
        /*
        r11 = this;
        r6 = c;
        r0 = r11.aj;	 Catch:{ NullPointerException -> 0x000d }
        r1 = v;	 Catch:{ NullPointerException -> 0x000d }
        r0 = r11.a(r0, r1);	 Catch:{ NullPointerException -> 0x000d }
        if (r0 != 0) goto L_0x000f;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = r11.L;	 Catch:{ eo -> 0x0032 }
        r1 = bb;	 Catch:{ eo -> 0x0032 }
        r2 = 472; // 0x1d8 float:6.61E-43 double:2.33E-321;
        r1 = r1[r2];	 Catch:{ eo -> 0x0032 }
        r2 = r11.z;	 Catch:{ eo -> 0x0032 }
        r3 = bb;	 Catch:{ eo -> 0x0032 }
        r4 = 482; // 0x1e2 float:6.75E-43 double:2.38E-321;
        r3 = r3[r4];	 Catch:{ eo -> 0x0032 }
        r4 = v;	 Catch:{ eo -> 0x0032 }
        r5 = 1;
        r7 = r0.a(r1, r2, r3, r4, r5);	 Catch:{ eo -> 0x0032 }
        if (r7 != 0) goto L_0x003d;
    L_0x0028:
        r0 = bb;	 Catch:{ eo -> 0x0032 }
        r1 = 474; // 0x1da float:6.64E-43 double:2.34E-321;
        r0 = r0[r1];	 Catch:{ eo -> 0x0032 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ eo -> 0x0032 }
        goto L_0x000c;
    L_0x0032:
        r0 = move-exception;
        r1 = bb;
        r2 = 481; // 0x1e1 float:6.74E-43 double:2.376E-321;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x000c;
    L_0x003d:
        r0 = new java.lang.StringBuilder;	 Catch:{ eo -> 0x0032 }
        r0.<init>();	 Catch:{ eo -> 0x0032 }
        r1 = bb;	 Catch:{ eo -> 0x0032 }
        r2 = 473; // 0x1d9 float:6.63E-43 double:2.337E-321;
        r1 = r1[r2];	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r1 = r11.z;	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r1 = "/";
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r1 = r7.size();	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r0 = r0.toString();	 Catch:{ eo -> 0x0032 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ eo -> 0x0032 }
        r0 = r11.L;	 Catch:{ eo -> 0x0032 }
        r1 = bb;	 Catch:{ eo -> 0x0032 }
        r2 = 490; // 0x1ea float:6.87E-43 double:2.42E-321;
        r1 = r1[r2];	 Catch:{ eo -> 0x0032 }
        r2 = r11.y;	 Catch:{ eo -> 0x0032 }
        r3 = bb;	 Catch:{ eo -> 0x0032 }
        r4 = 469; // 0x1d5 float:6.57E-43 double:2.317E-321;
        r3 = r3[r4];	 Catch:{ eo -> 0x0032 }
        r4 = v;	 Catch:{ eo -> 0x0032 }
        r5 = 1;
        r2 = r0.a(r1, r2, r3, r4, r5);	 Catch:{ eo -> 0x0032 }
        if (r2 != 0) goto L_0x008b;
    L_0x0081:
        r0 = bb;	 Catch:{ eo -> 0x0032 }
        r1 = 485; // 0x1e5 float:6.8E-43 double:2.396E-321;
        r0 = r0[r1];	 Catch:{ eo -> 0x0032 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ eo -> 0x0032 }
        goto L_0x000c;
    L_0x008b:
        r0 = new java.lang.StringBuilder;	 Catch:{ eo -> 0x0032 }
        r0.<init>();	 Catch:{ eo -> 0x0032 }
        r1 = bb;	 Catch:{ eo -> 0x0032 }
        r3 = 477; // 0x1dd float:6.68E-43 double:2.357E-321;
        r1 = r1[r3];	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r1 = r11.y;	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r1 = "/";
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r1 = r2.size();	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r0 = r0.toString();	 Catch:{ eo -> 0x0032 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ eo -> 0x0032 }
        r0 = r11.L;	 Catch:{ eo -> 0x0032 }
        r1 = bb;	 Catch:{ eo -> 0x0032 }
        r3 = 487; // 0x1e7 float:6.82E-43 double:2.406E-321;
        r1 = r1[r3];	 Catch:{ eo -> 0x0032 }
        r3 = r11.y;	 Catch:{ eo -> 0x0032 }
        r4 = bb;	 Catch:{ eo -> 0x0032 }
        r5 = 467; // 0x1d3 float:6.54E-43 double:2.307E-321;
        r4 = r4[r5];	 Catch:{ eo -> 0x0032 }
        r5 = v;	 Catch:{ eo -> 0x0032 }
        r3 = r0.a(r1, r3, r4, r5);	 Catch:{ eo -> 0x0032 }
        if (r3 != 0) goto L_0x00d9;
    L_0x00ce:
        r0 = bb;	 Catch:{ eo -> 0x0032 }
        r1 = 488; // 0x1e8 float:6.84E-43 double:2.41E-321;
        r0 = r0[r1];	 Catch:{ eo -> 0x0032 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ eo -> 0x0032 }
        goto L_0x000c;
    L_0x00d9:
        r0 = new java.lang.StringBuilder;	 Catch:{ eo -> 0x0032 }
        r0.<init>();	 Catch:{ eo -> 0x0032 }
        r1 = bb;	 Catch:{ eo -> 0x0032 }
        r4 = 468; // 0x1d4 float:6.56E-43 double:2.31E-321;
        r1 = r1[r4];	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r1 = r11.y;	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r1 = "/";
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r1 = r3.size();	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r0 = r0.toString();	 Catch:{ eo -> 0x0032 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ eo -> 0x0032 }
        r0 = new java.util.ArrayList;	 Catch:{ eo -> 0x0032 }
        r0.<init>();	 Catch:{ eo -> 0x0032 }
        r1 = r11.L;	 Catch:{ eo -> 0x0032 }
        r4 = bb;	 Catch:{ eo -> 0x0032 }
        r5 = 479; // 0x1df float:6.71E-43 double:2.367E-321;
        r4 = r4[r5];	 Catch:{ eo -> 0x0032 }
        r5 = bb;	 Catch:{ eo -> 0x0032 }
        r8 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r5 = r5[r8];	 Catch:{ eo -> 0x0032 }
        r1 = r1.c(r4, r5);	 Catch:{ eo -> 0x0032 }
        r0.add(r1);	 Catch:{ eo -> 0x0032 }
        r1 = r11.L;	 Catch:{ eo -> 0x0032 }
        r4 = bb;	 Catch:{ eo -> 0x0032 }
        r5 = 478; // 0x1de float:6.7E-43 double:2.36E-321;
        r4 = r4[r5];	 Catch:{ eo -> 0x0032 }
        r5 = bb;	 Catch:{ eo -> 0x0032 }
        r8 = 483; // 0x1e3 float:6.77E-43 double:2.386E-321;
        r5 = r5[r8];	 Catch:{ eo -> 0x0032 }
        r1 = r1.c(r4, r5);	 Catch:{ eo -> 0x0032 }
        r0.add(r1);	 Catch:{ eo -> 0x0032 }
        r0.addAll(r7);	 Catch:{ eo -> 0x0032 }
        r0.addAll(r2);	 Catch:{ eo -> 0x0032 }
        r0.addAll(r3);	 Catch:{ eo -> 0x0032 }
        r4 = r0.iterator();	 Catch:{ eo -> 0x0032 }
    L_0x0140:
        r0 = r4.hasNext();	 Catch:{ eo -> 0x0032 }
        if (r0 == 0) goto L_0x000c;
    L_0x0146:
        r0 = r4.next();	 Catch:{ eo -> 0x0032 }
        r0 = (com.whatsapp.gdrive.fs) r0;	 Catch:{ eo -> 0x0032 }
        r1 = r0.e();	 Catch:{ eo -> 0x0032 }
        r5 = r7.contains(r0);	 Catch:{ eo -> 0x0032 }
        if (r5 == 0) goto L_0x015e;
    L_0x0156:
        r1 = bb;	 Catch:{ eo -> 0x0032 }
        r5 = 489; // 0x1e9 float:6.85E-43 double:2.416E-321;
        r1 = r1[r5];	 Catch:{ eo -> 0x0032 }
        if (r6 == 0) goto L_0x0178;
    L_0x015e:
        r5 = r2.contains(r0);	 Catch:{ eo -> 0x0200 }
        if (r5 == 0) goto L_0x016c;
    L_0x0164:
        r1 = bb;	 Catch:{ eo -> 0x0032 }
        r5 = 475; // 0x1db float:6.66E-43 double:2.347E-321;
        r1 = r1[r5];	 Catch:{ eo -> 0x0032 }
        if (r6 == 0) goto L_0x0178;
    L_0x016c:
        r5 = r3.contains(r0);	 Catch:{ eo -> 0x0202 }
        if (r5 == 0) goto L_0x0178;
    L_0x0172:
        r1 = bb;	 Catch:{ eo -> 0x0032 }
        r5 = 470; // 0x1d6 float:6.59E-43 double:2.32E-321;
        r1 = r1[r5];	 Catch:{ eo -> 0x0032 }
    L_0x0178:
        r5 = new java.lang.StringBuilder;	 Catch:{ eo -> 0x0032 }
        r5.<init>();	 Catch:{ eo -> 0x0032 }
        r8 = bb;	 Catch:{ eo -> 0x0032 }
        r9 = 486; // 0x1e6 float:6.81E-43 double:2.4E-321;
        r8 = r8[r9];	 Catch:{ eo -> 0x0032 }
        r5 = r5.append(r8);	 Catch:{ eo -> 0x0032 }
        r5 = r5.append(r1);	 Catch:{ eo -> 0x0032 }
        r8 = "/";
        r5 = r5.append(r8);	 Catch:{ eo -> 0x0032 }
        r5 = r5.append(r0);	 Catch:{ eo -> 0x0032 }
        r5 = r5.toString();	 Catch:{ eo -> 0x0032 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ eo -> 0x0032 }
        r5 = r11.L;	 Catch:{ eo -> 0x0032 }
        r8 = r0.g();	 Catch:{ eo -> 0x0032 }
        r9 = v;	 Catch:{ eo -> 0x0032 }
        r5 = r5.a(r8, r9);	 Catch:{ eo -> 0x0032 }
        if (r5 != 0) goto L_0x01b6;
    L_0x01ab:
        r8 = bb;	 Catch:{ eo -> 0x0204 }
        r9 = 471; // 0x1d7 float:6.6E-43 double:2.327E-321;
        r8 = r8[r9];	 Catch:{ eo -> 0x0204 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ eo -> 0x0204 }
        if (r6 == 0) goto L_0x01fc;
    L_0x01b6:
        r8 = new java.lang.StringBuilder;	 Catch:{ eo -> 0x0032 }
        r8.<init>();	 Catch:{ eo -> 0x0032 }
        r9 = bb;	 Catch:{ eo -> 0x0032 }
        r10 = 484; // 0x1e4 float:6.78E-43 double:2.39E-321;
        r9 = r9[r10];	 Catch:{ eo -> 0x0032 }
        r8 = r8.append(r9);	 Catch:{ eo -> 0x0032 }
        r1 = r8.append(r1);	 Catch:{ eo -> 0x0032 }
        r8 = "/";
        r1 = r1.append(r8);	 Catch:{ eo -> 0x0032 }
        r0 = r0.e();	 Catch:{ eo -> 0x0032 }
        r0 = r1.append(r0);	 Catch:{ eo -> 0x0032 }
        r1 = bb;	 Catch:{ eo -> 0x0032 }
        r8 = 476; // 0x1dc float:6.67E-43 double:2.35E-321;
        r1 = r1[r8];	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r1 = r5.size();	 Catch:{ eo -> 0x0032 }
        r0 = r0.append(r1);	 Catch:{ eo -> 0x0032 }
        r0 = r0.toString();	 Catch:{ eo -> 0x0032 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ eo -> 0x0032 }
        r0 = 0;
    L_0x01f2:
        r1 = r5.size();	 Catch:{ eo -> 0x0032 }
        if (r0 >= r1) goto L_0x01fc;
    L_0x01f8:
        r0 = r0 + 1;
        if (r6 == 0) goto L_0x01f2;
    L_0x01fc:
        if (r6 == 0) goto L_0x0140;
    L_0x01fe:
        goto L_0x000c;
    L_0x0200:
        r0 = move-exception;
        throw r0;	 Catch:{ eo -> 0x0032 }
    L_0x0202:
        r0 = move-exception;
        throw r0;	 Catch:{ eo -> 0x0032 }
    L_0x0204:
        r0 = move-exception;
        throw r0;	 Catch:{ eo -> 0x0032 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.J():void");
    }

    private static boolean d(long j) {
        Editor edit = S().edit();
        try {
            edit.putLong(bb[125], j);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[126]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private boolean h(@NonNull String str) {
        boolean z = true;
        boolean z2 = c;
        try {
            if (this.aj == null) {
                Log.i(bb[517]);
                return true;
            }
            String i = i(str);
            String j = j(str);
            try {
                this.L = new bc(this.aj, this);
                if (a(this.aj, v)) {
                    Collection a = this.L.a(bb[523], i, bb[513], v, true);
                    if (a == null) {
                        try {
                            Log.e(bb[525] + i + bb[520]);
                            return false;
                        } catch (ee e) {
                            throw e;
                        }
                    }
                    Collection a2 = this.L.a(bb[516], j, bb[524], v);
                    if (a2 == null) {
                        try {
                            Log.e(bb[519] + j + bb[515]);
                            return false;
                        } catch (ee e2) {
                            throw e2;
                        }
                    }
                    Log.i(bb[512] + i + bb[518] + a.size());
                    Log.i(bb[521] + j + bb[511] + a2.size());
                    List<fs> arrayList = new ArrayList();
                    arrayList.addAll(a);
                    arrayList.addAll(a2);
                    for (fs fsVar : arrayList) {
                        try {
                            z &= b(fsVar.g(), v);
                            continue;
                        } catch (Throwable e3) {
                            Log.b(bb[522] + fsVar.g(), e3);
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    this.al = null;
                    Log.i(bb[510] + z);
                    return z;
                }
                Log.e(bb[514]);
                return false;
            } catch (ee e22) {
                throw e22;
            }
        } catch (ee e222) {
            throw e222;
        }
    }

    static AtomicLong l(GoogleDriveService googleDriveService) {
        return googleDriveService.q;
    }

    private boolean a() {
        try {
            this.h = (fs) by.a(this.N, new ai(this), bb[217]);
            return this.h != null;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static boolean a(@Nullable String str, long j) {
        if (str == null) {
            try {
                Log.e(bb[391]);
                return false;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        Editor edit = S().edit();
        try {
            edit.putLong(bb[392] + str, j);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[390]);
            return false;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    private fs b(@NonNull bs bsVar) {
        try {
            if (this.h == null) {
                this.h = c(bb[31], bsVar);
            }
            return this.h;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private boolean a(@NonNull File file, @NonNull fs fsVar) {
        Boolean bool = (Boolean) by.a(this.i, new m(this, file, fsVar), bb[181] + file.getAbsolutePath());
        if (bool != null) {
            try {
                if (bool.booleanValue()) {
                    return true;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        throw new et(String.format(Locale.ENGLISH, bb[180], new Object[]{fsVar.toString()}));
    }

    static boolean s() {
        return S().getBoolean(bb[580], false);
    }

    public static int Y() {
        int i = 0;
        try {
            i = Integer.parseInt(S().getString(bb[89], String.valueOf(0)));
        } catch (Throwable e) {
            Log.b(bb[88], e);
        }
        return i;
    }

    static CountDownLatch a(GoogleDriveService googleDriveService) {
        return googleDriveService.H;
    }

    @fk
    public int o() {
        return S().getInt(bb[20], 10);
    }

    private static boolean ab() {
        int i = S().getInt(bb[407], 0) + 1;
        Log.i(bb[406] + i);
        Editor edit = S().edit();
        try {
            edit.putInt(bb[408], i);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[409]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static AtomicLong p(GoogleDriveService googleDriveService) {
        return googleDriveService.k;
    }

    @at
    private static int ag() {
        return S().getInt(bb[123], 0);
    }

    private boolean a(@NonNull String str, @NonNull bs bsVar) {
        Boolean bool = (Boolean) by.a(bsVar, new a9(this, str), bb[504]);
        if (bool != null) {
            try {
                if (bool.booleanValue()) {
                    return true;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        return false;
    }

    void a(bc bcVar) {
        try {
            if (this.L != null) {
                Log.e(bb[175]);
            }
            this.L = bcVar;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public long n() {
        return this.n;
    }

    public static void e(String str) {
        try {
            auv.b();
            if (bb[545].equals(str)) {
                m.open();
                if (!ah) {
                    try {
                        ah = true;
                        if (X()) {
                            try {
                                w();
                                if (!c) {
                                    return;
                                }
                            } catch (NullPointerException e) {
                                throw e;
                            }
                        }
                        return;
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                } else {
                    return;
                }
            }
            m.close();
            ah = false;
        } catch (NullPointerException e22) {
            throw e22;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    static void k() {
        aa = true;
        a((vr) h.b().b(vr.class));
        bq.a(new a2());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean an() {
        /*
        r7 = this;
        r1 = 0;
        r2 = 1;
        r0 = r7.al;	 Catch:{ NullPointerException -> 0x00a3 }
        if (r0 == 0) goto L_0x00a5;
    L_0x0006:
        r0 = r2;
    L_0x0007:
        r3 = bb;	 Catch:{ NullPointerException -> 0x00a8 }
        r4 = 330; // 0x14a float:4.62E-43 double:1.63E-321;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00a8 }
        com.whatsapp.auv.a(r0, r3);	 Catch:{ NullPointerException -> 0x00a8 }
        r0 = r7.aj;	 Catch:{ NullPointerException -> 0x00a8 }
        if (r0 == 0) goto L_0x003e;
    L_0x0014:
        r0 = r7.aj;	 Catch:{ NullPointerException -> 0x00a8 }
        c(r0);	 Catch:{ NullPointerException -> 0x00a8 }
        r0 = r7.aj;	 Catch:{ NullPointerException -> 0x00a8 }
        r3 = r7.al;	 Catch:{ NullPointerException -> 0x00a8 }
        r3 = r3.r();	 Catch:{ NullPointerException -> 0x00a8 }
        r4 = r3.c();	 Catch:{ NullPointerException -> 0x00a8 }
        b(r0, r4);	 Catch:{ NullPointerException -> 0x00a8 }
        r0 = r7.aj;	 Catch:{ NullPointerException -> 0x00a8 }
        r3 = r7.al;	 Catch:{ NullPointerException -> 0x00a8 }
        r4 = r3.j();	 Catch:{ NullPointerException -> 0x00a8 }
        a(r0, r4);	 Catch:{ NullPointerException -> 0x00a8 }
        r0 = r7.aj;	 Catch:{ NullPointerException -> 0x00a8 }
        r3 = r7.al;	 Catch:{ NullPointerException -> 0x00a8 }
        r4 = r3.m();	 Catch:{ NullPointerException -> 0x00a8 }
        c(r0, r4);	 Catch:{ NullPointerException -> 0x00a8 }
    L_0x003e:
        r0 = r7.al;
        r0 = r0.c();
        r3 = r7.al;
        r3 = r3.n();
        r4 = r7.al;
        r4 = r4.h();
        if (r0 < 0) goto L_0x00b0;
    L_0x0052:
        r0 = c(r0);
    L_0x0056:
        if (r3 < 0) goto L_0x005d;
    L_0x0058:
        r3 = a(r3);
        r0 = r0 & r3;
    L_0x005d:
        r3 = c(r4);
        r0 = r0 & r3;
        r3 = r7.al;
        r3 = r3.g();
        if (r3 == 0) goto L_0x008d;
    L_0x006a:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = bb;
        r6 = 329; // 0x149 float:4.61E-43 double:1.625E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r3);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r3 = com.whatsapp.rw.a(r3);
        r0 = r0 & r3;
        r3 = c;	 Catch:{ NullPointerException -> 0x00aa }
        if (r3 == 0) goto L_0x0096;
    L_0x008d:
        r3 = bb;	 Catch:{ NullPointerException -> 0x00aa }
        r4 = 328; // 0x148 float:4.6E-43 double:1.62E-321;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00aa }
        com.whatsapp.util.Log.i(r3);	 Catch:{ NullPointerException -> 0x00aa }
    L_0x0096:
        if (r0 != 0) goto L_0x00ae;
    L_0x0098:
        r0 = bb;	 Catch:{ NullPointerException -> 0x00ac }
        r2 = 327; // 0x147 float:4.58E-43 double:1.616E-321;
        r0 = r0[r2];	 Catch:{ NullPointerException -> 0x00ac }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NullPointerException -> 0x00ac }
        r0 = r1;
    L_0x00a2:
        return r0;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = r1;
        goto L_0x0007;
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        throw r0;
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r0 = r2;
        goto L_0x00a2;
    L_0x00b0:
        r0 = r2;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveService.an():boolean");
    }

    void b(fs fsVar) {
        try {
            if (this.h != null) {
                Log.e(bb[22]);
            }
            this.h = fsVar;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static d_ f(GoogleDriveService googleDriveService) {
        return googleDriveService.o;
    }

    public void onDestroy() {
        try {
            Log.i(bb[581]);
            if (this.A != null) {
                this.A.i();
            }
            try {
                a(this.A);
                if (this.L != null) {
                    this.L.a(false);
                }
                as();
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static long aw() {
        return fn.a(dg.c(), V);
    }

    private static boolean y() {
        Editor edit = S().edit();
        try {
            edit.remove(bb[429]);
            edit.remove(bb[430]);
            edit.remove(bb[431]);
            if (edit.commit()) {
                return true;
            }
            Log.w(bb[428]);
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static AtomicLong o(GoogleDriveService googleDriveService) {
        return googleDriveService.M;
    }

    static boolean a(GoogleDriveService googleDriveService, String str, File file, String str2, boolean z) {
        return googleDriveService.a(str, file, str2, z);
    }
}
