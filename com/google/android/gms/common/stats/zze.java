package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;

public class zze {
    private final long zzafP;
    private final int zzafQ;
    private final SimpleArrayMap zzafR;

    public zze() {
        this.zzafP = 60000;
        this.zzafQ = 10;
        this.zzafR = new SimpleArrayMap(10);
    }

    public zze(int i, long j) {
        this.zzafP = j;
        this.zzafQ = i;
        this.zzafR = new SimpleArrayMap();
    }

    private void zzb(long j, long j2) {
        boolean z = zzd.a;
        int size = this.zzafR.size() - 1;
        while (size >= 0) {
            if (j2 - ((Long) this.zzafR.valueAt(size)).longValue() > j) {
                this.zzafR.removeAt(size);
            }
            int i = size - 1;
            if (!z) {
                size = i;
            } else {
                return;
            }
        }
    }

    public Long zzcy(String str) {
        Long l;
        boolean z = zzd.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zzafP;
        synchronized (this) {
            do {
                if (this.zzafR.size() < this.zzafQ) {
                    break;
                }
                zzb(j, elapsedRealtime);
                j /= 2;
                Log.w("ConnectionTracker", "The max capacity " + this.zzafQ + " is not enough. Current durationThreshold is: " + j);
            } while (!z);
            l = (Long) this.zzafR.put(str, Long.valueOf(elapsedRealtime));
        }
        return l;
    }

    public boolean zzcz(String str) {
        boolean z;
        synchronized (this) {
            z = this.zzafR.remove(str) != null;
        }
        return z;
    }
}
