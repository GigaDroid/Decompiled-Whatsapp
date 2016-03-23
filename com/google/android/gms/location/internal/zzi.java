package com.google.android.gms.location.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.HashMap;
import java.util.Map;
import org.whispersystems.at;

public class zzi {
    private final Context mContext;
    private ContentProviderClient zzaCK;
    private boolean zzaCL;
    private Map zzaCM;
    private final zzn zzaCs;
    private Map zzaot;

    class zza extends com.google.android.gms.location.zzc.zza {
        private Handler zzaCN;

        private void zzb(int i, Object obj) {
            if (this.zzaCN == null) {
                Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = obj;
            this.zzaCN.sendMessage(obtain);
        }

        public void onLocationAvailability(LocationAvailability locationAvailability) {
            zzb(1, locationAvailability);
        }

        public void onLocationResult(LocationResult locationResult) {
            zzb(0, locationResult);
        }
    }

    class zzb extends Handler {
        private final LocationListener zzaCP;

        public zzb(LocationListener locationListener) {
            this.zzaCP = locationListener;
        }

        public zzb(LocationListener locationListener, Looper looper) {
            super(looper);
            this.zzaCP = locationListener;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case at.g /*1*/:
                    this.zzaCP.onLocationChanged(new Location((Location) message.obj));
                    if (zzj.b) {
                        break;
                    }
                    return;
            }
            Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
        }
    }

    class zzc extends com.google.android.gms.location.zzd.zza {
        private Handler zzaCN;

        zzc(LocationListener locationListener, Looper looper) {
            if (looper == null) {
                zzx.zza(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            this.zzaCN = looper == null ? new zzb(locationListener) : new zzb(locationListener, looper);
        }

        public void onLocationChanged(Location location) {
            if (this.zzaCN == null) {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = location;
            this.zzaCN.sendMessage(obtain);
        }

        public void release() {
            this.zzaCN = null;
        }
    }

    public zzi(Context context, zzn com_google_android_gms_location_internal_zzn) {
        this.zzaCK = null;
        this.zzaCL = false;
        this.zzaot = new HashMap();
        this.zzaCM = new HashMap();
        this.mContext = context;
        this.zzaCs = com_google_android_gms_location_internal_zzn;
    }

    private zzc zza(LocationListener locationListener, Looper looper) {
        zzc com_google_android_gms_location_internal_zzi_zzc;
        synchronized (this.zzaot) {
            com_google_android_gms_location_internal_zzi_zzc = (zzc) this.zzaot.get(locationListener);
            if (com_google_android_gms_location_internal_zzi_zzc == null) {
                com_google_android_gms_location_internal_zzi_zzc = new zzc(locationListener, looper);
            }
            this.zzaot.put(locationListener, com_google_android_gms_location_internal_zzi_zzc);
        }
        return com_google_android_gms_location_internal_zzi_zzc;
    }

    public Location getLastLocation() {
        this.zzaCs.zzoz();
        try {
            return ((zzg) this.zzaCs.zzoA()).zzdw(this.mContext.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeAllListeners() {
        /*
        r5 = this;
        r2 = com.google.android.gms.location.internal.zzj.b;
        r3 = r5.zzaot;	 Catch:{ RemoteException -> 0x0068 }
        monitor-enter(r3);	 Catch:{ RemoteException -> 0x0068 }
        r0 = r5.zzaot;	 Catch:{ all -> 0x0065 }
        r0 = r0.values();	 Catch:{ all -> 0x0065 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0065 }
    L_0x000f:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x002e;
    L_0x0015:
        r0 = r4.next();	 Catch:{ all -> 0x0065 }
        r0 = (com.google.android.gms.location.internal.zzi.zzc) r0;	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x002c;
    L_0x001d:
        r1 = r5.zzaCs;	 Catch:{ RemoteException -> 0x0063 }
        r1 = r1.zzoA();	 Catch:{ RemoteException -> 0x0063 }
        r1 = (com.google.android.gms.location.internal.zzg) r1;	 Catch:{ RemoteException -> 0x0063 }
        r0 = com.google.android.gms.location.internal.LocationRequestUpdateData.zzb(r0);	 Catch:{ RemoteException -> 0x0063 }
        r1.zza(r0);	 Catch:{ RemoteException -> 0x0063 }
    L_0x002c:
        if (r2 == 0) goto L_0x000f;
    L_0x002e:
        r0 = r5.zzaot;	 Catch:{ all -> 0x0065 }
        r0.clear();	 Catch:{ all -> 0x0065 }
        r0 = r5.zzaCM;	 Catch:{ all -> 0x0065 }
        r0 = r0.values();	 Catch:{ all -> 0x0065 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0065 }
    L_0x003d:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x005c;
    L_0x0043:
        r0 = r4.next();	 Catch:{ all -> 0x0065 }
        r0 = (com.google.android.gms.location.internal.zzi.zza) r0;	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x005a;
    L_0x004b:
        r1 = r5.zzaCs;	 Catch:{ RemoteException -> 0x006f }
        r1 = r1.zzoA();	 Catch:{ RemoteException -> 0x006f }
        r1 = (com.google.android.gms.location.internal.zzg) r1;	 Catch:{ RemoteException -> 0x006f }
        r0 = com.google.android.gms.location.internal.LocationRequestUpdateData.zza(r0);	 Catch:{ RemoteException -> 0x006f }
        r1.zza(r0);	 Catch:{ RemoteException -> 0x006f }
    L_0x005a:
        if (r2 == 0) goto L_0x003d;
    L_0x005c:
        r0 = r5.zzaCM;	 Catch:{ all -> 0x0065 }
        r0.clear();	 Catch:{ all -> 0x0065 }
        monitor-exit(r3);	 Catch:{ all -> 0x0065 }
        return;
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0065 }
        throw r0;	 Catch:{ RemoteException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r1.<init>(r0);
        throw r1;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0065 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.zzi.removeAllListeners():void");
    }

    public void zza(LocationListener locationListener) {
        this.zzaCs.zzoz();
        zzx.zzb((Object) locationListener, (Object) "Invalid null listener");
        synchronized (this.zzaot) {
            zzc com_google_android_gms_location_internal_zzi_zzc = (zzc) this.zzaot.remove(locationListener);
            try {
                if (this.zzaCK != null && this.zzaot.isEmpty()) {
                    this.zzaCK.release();
                    this.zzaCK = null;
                }
                if (com_google_android_gms_location_internal_zzi_zzc != null) {
                    try {
                        com_google_android_gms_location_internal_zzi_zzc.release();
                        ((zzg) this.zzaCs.zzoA()).zza(LocationRequestUpdateData.zzb(com_google_android_gms_location_internal_zzi_zzc));
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
    }

    public void zza(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        this.zzaCs.zzoz();
        ((zzg) this.zzaCs.zzoA()).zza(LocationRequestUpdateData.zzb(LocationRequestInternal.zzb(locationRequest), zza(locationListener, looper)));
    }

    public void zzag(boolean z) {
        this.zzaCs.zzoz();
        ((zzg) this.zzaCs.zzoA()).zzag(z);
        this.zzaCL = z;
    }

    public void zzvR() {
        try {
            if (this.zzaCL) {
                try {
                    zzag(false);
                } catch (Throwable e) {
                    throw new IllegalStateException(e);
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
