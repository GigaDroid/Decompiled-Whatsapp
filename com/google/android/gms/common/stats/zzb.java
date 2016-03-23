package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.stats.zzc.zza;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlw;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class zzb {
    private static final Object zzadT;
    private static Integer zzafB;
    private static zzb zzafu;
    private static final ComponentName zzafz;
    private zze zzafA;
    private final List zzafv;
    private final List zzafw;
    private final List zzafx;
    private final List zzafy;

    static {
        zzadT = new Object();
        zzafz = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    }

    private zzb() {
        if (getLogLevel() == zzd.LOG_LEVEL_OFF) {
            this.zzafv = Collections.EMPTY_LIST;
            this.zzafw = Collections.EMPTY_LIST;
            this.zzafx = Collections.EMPTY_LIST;
            this.zzafy = Collections.EMPTY_LIST;
            return;
        }
        List list;
        String str = (String) zza.zzafE.get();
        if (str == null) {
            try {
                list = Collections.EMPTY_LIST;
            } catch (SecurityException e) {
                throw e;
            }
        }
        list = Arrays.asList(str.split(","));
        this.zzafv = list;
        str = (String) zza.zzafF.get();
        if (str == null) {
            try {
                list = Collections.EMPTY_LIST;
            } catch (SecurityException e2) {
                throw e2;
            }
        }
        list = Arrays.asList(str.split(","));
        this.zzafw = list;
        str = (String) zza.zzafG.get();
        if (str == null) {
            try {
                list = Collections.EMPTY_LIST;
            } catch (SecurityException e22) {
                throw e22;
            }
        }
        list = Arrays.asList(str.split(","));
        this.zzafx = list;
        str = (String) zza.zzafH.get();
        if (str == null) {
            try {
                list = Collections.EMPTY_LIST;
            } catch (SecurityException e222) {
                throw e222;
            }
        }
        list = Arrays.asList(str.split(","));
        this.zzafy = list;
        this.zzafA = new zze(1024, ((Long) zza.zzafI.get()).longValue());
    }

    private static int getLogLevel() {
        if (zzafB == null) {
            try {
                zzafB = Integer.valueOf(zzll.zzjk() ? ((Integer) zza.zzafD.get()).intValue() : zzd.LOG_LEVEL_OFF);
            } catch (SecurityException e) {
                throw e;
            } catch (SecurityException e2) {
                zzafB = Integer.valueOf(zzd.LOG_LEVEL_OFF);
            }
        }
        return zzafB.intValue();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zza(android.content.Context r23, android.content.ServiceConnection r24, java.lang.String r25, android.content.Intent r26, int r27) {
        /*
        r22 = this;
        r2 = com.google.android.gms.common.internal.zzd.zzacF;	 Catch:{ SecurityException -> 0x0005 }
        if (r2 != 0) goto L_0x0007;
    L_0x0004:
        return;
    L_0x0005:
        r2 = move-exception;
        throw r2;
    L_0x0007:
        r0 = r22;
        r1 = r24;
        r6 = r0.zzb(r1);
        r2 = r22;
        r3 = r23;
        r4 = r25;
        r5 = r26;
        r7 = r27;
        r2 = r2.zza(r3, r4, r5, r6, r7);	 Catch:{ SecurityException -> 0x009a }
        if (r2 == 0) goto L_0x0004;
    L_0x001f:
        r9 = java.lang.System.currentTimeMillis();
        r16 = 0;
        r2 = getLogLevel();
        r3 = com.google.android.gms.common.stats.zzd.zzafM;
        r2 = r2 & r3;
        if (r2 == 0) goto L_0x0034;
    L_0x002e:
        r2 = 3;
        r3 = 5;
        r16 = com.google.android.gms.internal.zzlw.zzm(r2, r3);
    L_0x0034:
        r20 = 0;
        r2 = getLogLevel();
        r3 = com.google.android.gms.common.stats.zzd.zzafO;
        r2 = r2 & r3;
        if (r2 == 0) goto L_0x0043;
    L_0x003f:
        r20 = android.os.Debug.getNativeHeapAllocatedSize();
    L_0x0043:
        r2 = 1;
        r0 = r27;
        if (r0 == r2) goto L_0x004d;
    L_0x0048:
        r2 = 4;
        r0 = r27;
        if (r0 != r2) goto L_0x0062;
    L_0x004d:
        r8 = new com.google.android.gms.common.stats.ConnectionEvent;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r18 = android.os.SystemClock.elapsedRealtime();
        r11 = r27;
        r17 = r6;
        r8.<init>(r9, r11, r12, r13, r14, r15, r16, r17, r18, r20);
        r2 = com.google.android.gms.common.stats.zzd.a;
        if (r2 == 0) goto L_0x0081;
    L_0x0062:
        r0 = r23;
        r1 = r26;
        r2 = zzc(r0, r1);
        r8 = new com.google.android.gms.common.stats.ConnectionEvent;
        r12 = com.google.android.gms.internal.zzlw.zzap(r23);
        r14 = r2.processName;
        r15 = r2.name;
        r18 = android.os.SystemClock.elapsedRealtime();
        r11 = r27;
        r13 = r25;
        r17 = r6;
        r8.<init>(r9, r11, r12, r13, r14, r15, r16, r17, r18, r20);
    L_0x0081:
        r2 = new android.content.Intent;
        r2.<init>();
        r3 = zzafz;
        r2 = r2.setComponent(r3);
        r3 = "com.google.android.gms.common.stats.EXTRA_LOG_EVENT";
        r2 = r2.putExtra(r3, r8);
        r0 = r23;
        r0.startService(r2);
        goto L_0x0004;
    L_0x009a:
        r2 = move-exception;
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.zzb.zza(android.content.Context, android.content.ServiceConnection, java.lang.String, android.content.Intent, int):void");
    }

    private boolean zza(Context context, String str, Intent intent, String str2, int i) {
        int logLevel = getLogLevel();
        try {
            if (logLevel == zzd.LOG_LEVEL_OFF) {
                return false;
            }
            if (this.zzafA == null) {
                return false;
            }
            if (i == 4 || i == 1) {
                try {
                    return this.zzafA.zzcz(str2);
                } catch (SecurityException e) {
                    throw e;
                }
            }
            ServiceInfo zzc = zzc(context, intent);
            if (zzc == null) {
                try {
                    Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[]{str, intent.toUri(0)}));
                    return false;
                } catch (SecurityException e2) {
                    throw e2;
                }
            }
            String zzap = zzlw.zzap(context);
            String str3 = zzc.processName;
            String str4 = zzc.name;
            try {
                if (this.zzafv.contains(zzap)) {
                    return false;
                }
                if (this.zzafw.contains(str)) {
                    return false;
                }
                try {
                    if (this.zzafx.contains(str3)) {
                        return false;
                    }
                    try {
                        if (this.zzafy.contains(str4)) {
                            return false;
                        }
                        try {
                            if (str3.equals(zzap)) {
                                try {
                                    if ((logLevel & zzd.zzafN) != 0) {
                                        return false;
                                    }
                                } catch (SecurityException e22) {
                                    throw e22;
                                }
                            }
                            this.zzafA.zzcy(str2);
                            return true;
                        } catch (SecurityException e222) {
                            throw e222;
                        }
                    } catch (SecurityException e2222) {
                        throw e2222;
                    }
                } catch (SecurityException e22222) {
                    throw e22222;
                }
            } catch (SecurityException e222222) {
                throw e222222;
            } catch (SecurityException e2222222) {
                throw e2222222;
            }
        } catch (SecurityException e22222222) {
            throw e22222222;
        } catch (SecurityException e222222222) {
            throw e222222222;
        }
    }

    private String zzb(ServiceConnection serviceConnection) {
        return String.valueOf((Process.myPid() << 32) | System.identityHashCode(serviceConnection));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean zzb(android.content.Context r4, android.content.Intent r5) {
        /*
        r3 = this;
        r0 = r5.getComponent();
        if (r0 == 0) goto L_0x0017;
    L_0x0006:
        r1 = com.google.android.gms.common.internal.zzd.zzacF;	 Catch:{ SecurityException -> 0x0019 }
        if (r1 == 0) goto L_0x001d;
    L_0x000a:
        r1 = "com.google.android.gms";
        r2 = r0.getPackageName();	 Catch:{ SecurityException -> 0x001b }
        r1 = r1.equals(r2);	 Catch:{ SecurityException -> 0x001b }
        if (r1 == 0) goto L_0x001d;
    L_0x0017:
        r0 = 0;
    L_0x0018:
        return r0;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;
    L_0x001d:
        r0 = r0.getPackageName();
        r0 = com.google.android.gms.internal.zzll.zzi(r4, r0);
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.zzb.zzb(android.content.Context, android.content.Intent):boolean");
    }

    private static ServiceInfo zzc(Context context, Intent intent) {
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        if (queryIntentServices != null) {
            try {
                if (queryIntentServices.size() != 0) {
                    if (queryIntentServices.size() > 1) {
                        Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), zzlw.zzm(3, 20)}));
                        Iterator it = queryIntentServices.iterator();
                        if (it.hasNext()) {
                            Log.w("ConnectionTracker", ((ResolveInfo) it.next()).serviceInfo.name);
                            return null;
                        }
                    }
                    return ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
        Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), zzlw.zzm(3, 20)}));
        return null;
    }

    public static zzb zzpD() {
        synchronized (zzadT) {
            if (zzafu == null) {
                zzafu = new zzb();
            }
        }
        return zzafu;
    }

    public void zza(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
        zza(context, serviceConnection, null, null, 1);
    }

    public void zza(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
        zza(context, serviceConnection, str, intent, 3);
    }

    public boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        try {
            if (zzb(context, intent)) {
                Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                return false;
            }
            boolean bindService = context.bindService(intent, serviceConnection, i);
            if (bindService) {
                try {
                    zza(context, serviceConnection, str, intent, 2);
                } catch (SecurityException e) {
                    throw e;
                }
            }
            return bindService;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public void zzb(Context context, ServiceConnection serviceConnection) {
        zza(context, serviceConnection, null, null, 4);
    }
}
