package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

final class zzbm {

    abstract class zzb extends zza {
        private com.google.android.gms.common.api.zzc.zzb zzPW;

        public zzb(com.google.android.gms.common.api.zzc.zzb com_google_android_gms_common_api_zzc_zzb) {
            this.zzPW = com_google_android_gms_common_api_zzc_zzb;
        }

        public void zzR(Object obj) {
            com.google.android.gms.common.api.zzc.zzb com_google_android_gms_common_api_zzc_zzb = this.zzPW;
            if (com_google_android_gms_common_api_zzc_zzb != null) {
                com_google_android_gms_common_api_zzc_zzb.zzn(obj);
                this.zzPW = null;
            }
        }
    }

    final class zzj extends zzb {
        public zzj(com.google.android.gms.common.api.zzc.zzb com_google_android_gms_common_api_zzc_zzb) {
            super(com_google_android_gms_common_api_zzc_zzb);
        }

        public void zza(GetConnectedNodesResponse getConnectedNodesResponse) {
            List arrayList = new ArrayList();
            arrayList.addAll(getConnectedNodesResponse.zzbaz);
            zzR(new com.google.android.gms.wearable.internal.zzba.zzb(zzbj.zzfx(getConnectedNodesResponse.statusCode), arrayList));
        }
    }

    final class zzo extends zza {
        zzo() {
        }

        public void zzc(Status status) {
        }
    }
}
