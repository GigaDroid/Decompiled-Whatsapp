package com.google.android.gms.common.api;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicReference;

public class zzc {

    public interface zzb {
        void zzn(Object obj);
    }

    public abstract class zza extends zza implements zzb, zze {
        private final com.google.android.gms.common.api.Api.zzc zzXW;
        private AtomicReference zzYO;

        protected zza(com.google.android.gms.common.api.Api.zzc com_google_android_gms_common_api_Api_zzc, GoogleApiClient googleApiClient) {
            super(((GoogleApiClient) zzx.zzb((Object) googleApiClient, (Object) "GoogleApiClient must not be null")).getLooper());
            this.zzYO = new AtomicReference();
            this.zzXW = (com.google.android.gms.common.api.Api.zzc) zzx.zzv(com_google_android_gms_common_api_Api_zzc);
        }

        private void zza(RemoteException remoteException) {
            zzx(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        protected abstract void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb);

        public void zza(zzd com_google_android_gms_common_api_zzi_zzd) {
            this.zzYO.set(com_google_android_gms_common_api_zzi_zzd);
        }

        public final void zzb(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) {
            try {
                zza(com_google_android_gms_common_api_Api_zzb);
            } catch (RemoteException e) {
                zza(e);
                throw e;
            } catch (RemoteException e2) {
                zza(e2);
            }
        }

        protected void zzmZ() {
            zzd com_google_android_gms_common_api_zzi_zzd = (zzd) this.zzYO.getAndSet(null);
            if (com_google_android_gms_common_api_zzi_zzd != null) {
                com_google_android_gms_common_api_zzi_zzd.zzc(this);
            }
        }

        public void zzn(Object obj) {
            super.zza((Result) obj);
        }

        public final com.google.android.gms.common.api.Api.zzc zznd() {
            return this.zzXW;
        }

        public int zzng() {
            return 0;
        }

        public final void zzx(Status status) {
            zzx.zzb(!status.isSuccess(), (Object) "Failed result must not be success");
            zza(zzb(status));
        }
    }
}
