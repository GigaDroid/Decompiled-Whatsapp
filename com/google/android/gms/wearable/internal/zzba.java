package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import java.util.ArrayList;
import java.util.List;

public final class zzba implements NodeApi {

    class 2 extends zzh {
        final zzba zzbaJ;

        2(zzba com_google_android_gms_wearable_internal_zzba, GoogleApiClient googleApiClient) {
            this.zzbaJ = com_google_android_gms_wearable_internal_zzba;
            super(googleApiClient);
        }

        protected void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) {
            zza((zzbn) com_google_android_gms_common_api_Api_zzb);
        }

        protected void zza(zzbn com_google_android_gms_wearable_internal_zzbn) {
            com_google_android_gms_wearable_internal_zzbn.zzp(this);
        }

        protected Result zzb(Status status) {
            return zzbv(status);
        }

        protected GetConnectedNodesResult zzbv(Status status) {
            return new zzb(status, new ArrayList());
        }
    }

    public class zzb implements GetConnectedNodesResult {
        private final Status zzQA;
        private final List zzbaM;

        public zzb(Status status, List list) {
            this.zzQA = status;
            this.zzbaM = list;
        }

        public List getNodes() {
            return this.zzbaM;
        }

        public Status getStatus() {
            return this.zzQA;
        }
    }

    public PendingResult getConnectedNodes(GoogleApiClient googleApiClient) {
        return googleApiClient.zza(new 2(this, googleApiClient));
    }
}
