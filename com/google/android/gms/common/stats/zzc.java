package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzkq;

public final class zzc {
    public static zzkq zzafC;

    public final class zza {
        public static zzkq zzafD;
        public static zzkq zzafE;
        public static zzkq zzafF;
        public static zzkq zzafG;
        public static zzkq zzafH;
        public static zzkq zzafI;

        static {
            zzafD = zzkq.zza("gms:common:stats:connections:level", Integer.valueOf(zzd.LOG_LEVEL_OFF));
            zzafE = zzkq.zzu("gms:common:stats:connections:ignored_calling_processes", "");
            zzafF = zzkq.zzu("gms:common:stats:connections:ignored_calling_services", "");
            zzafG = zzkq.zzu("gms:common:stats:connections:ignored_target_processes", "");
            zzafH = zzkq.zzu("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
            zzafI = zzkq.zza("gms:common:stats:connections:time_out_duration", Long.valueOf(600000));
        }
    }

    static {
        zzafC = zzkq.zza("gms:common:stats:max_num_of_events", Integer.valueOf(100));
    }
}
