package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public interface zzau extends IInterface {

    public abstract class zza extends Binder implements zzau {
        public static boolean a;

        public zza() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
            r4 = this;
            r1 = 0;
            r2 = 1;
            r3 = a;
            switch(r5) {
                case 2: goto L_0x0014;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00d1;
                case 5: goto L_0x00f1;
                case 6: goto L_0x010e;
                case 7: goto L_0x012e;
                case 8: goto L_0x014e;
                case 9: goto L_0x016e;
                case 10: goto L_0x018e;
                case 11: goto L_0x028e;
                case 12: goto L_0x02ae;
                case 13: goto L_0x0033;
                case 14: goto L_0x01ae;
                case 15: goto L_0x01ce;
                case 16: goto L_0x01ee;
                case 17: goto L_0x020e;
                case 18: goto L_0x022e;
                case 19: goto L_0x024e;
                case 20: goto L_0x026e;
                case 22: goto L_0x02ce;
                case 23: goto L_0x02ee;
                case 26: goto L_0x030e;
                case 27: goto L_0x032e;
                case 28: goto L_0x0052;
                case 29: goto L_0x0071;
                case 30: goto L_0x0091;
                case 1598968902: goto L_0x000c;
                default: goto L_0x0007;
            };
        L_0x0007:
            r0 = super.onTransact(r5, r6, r7, r8);
        L_0x000b:
            return r0;
        L_0x000c:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r7.writeString(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x0014:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x002a;
        L_0x0020:
            r0 = com.google.android.gms.wearable.internal.GetConfigResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetConfigResponse) r0;
            if (r3 == 0) goto L_0x002b;
        L_0x002a:
            r0 = r1;
        L_0x002b:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x0033:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0049;
        L_0x003f:
            r0 = com.google.android.gms.wearable.internal.GetConfigsResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetConfigsResponse) r0;
            if (r3 == 0) goto L_0x004a;
        L_0x0049:
            r0 = r1;
        L_0x004a:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x0052:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0068;
        L_0x005e:
            r0 = com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse) r0;
            if (r3 == 0) goto L_0x0069;
        L_0x0068:
            r0 = r1;
        L_0x0069:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x0071:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0087;
        L_0x007d:
            r0 = com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse) r0;
            if (r3 == 0) goto L_0x0088;
        L_0x0087:
            r0 = r1;
        L_0x0088:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x0091:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x00a7;
        L_0x009d:
            r0 = com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse) r0;
            if (r3 == 0) goto L_0x00a8;
        L_0x00a7:
            r0 = r1;
        L_0x00a8:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x00b1:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x00c7;
        L_0x00bd:
            r0 = com.google.android.gms.wearable.internal.PutDataResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.PutDataResponse) r0;
            if (r3 == 0) goto L_0x00c8;
        L_0x00c7:
            r0 = r1;
        L_0x00c8:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x00d1:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x00e7;
        L_0x00dd:
            r0 = com.google.android.gms.wearable.internal.GetDataItemResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetDataItemResponse) r0;
            if (r3 == 0) goto L_0x00e8;
        L_0x00e7:
            r0 = r1;
        L_0x00e8:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x00f1:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0105;
        L_0x00fd:
            r0 = com.google.android.gms.common.data.DataHolder.CREATOR;
            r0 = r0.zzaa(r6);
            if (r3 == 0) goto L_0x034e;
        L_0x0105:
            r4.zzae(r1);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x010e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0124;
        L_0x011a:
            r0 = com.google.android.gms.wearable.internal.DeleteDataItemsResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.DeleteDataItemsResponse) r0;
            if (r3 == 0) goto L_0x0125;
        L_0x0124:
            r0 = r1;
        L_0x0125:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x012e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0144;
        L_0x013a:
            r0 = com.google.android.gms.wearable.internal.SendMessageResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.SendMessageResponse) r0;
            if (r3 == 0) goto L_0x0145;
        L_0x0144:
            r0 = r1;
        L_0x0145:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x014e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0164;
        L_0x015a:
            r0 = com.google.android.gms.wearable.internal.GetFdForAssetResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetFdForAssetResponse) r0;
            if (r3 == 0) goto L_0x0165;
        L_0x0164:
            r0 = r1;
        L_0x0165:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x016e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0184;
        L_0x017a:
            r0 = com.google.android.gms.wearable.internal.GetLocalNodeResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetLocalNodeResponse) r0;
            if (r3 == 0) goto L_0x0185;
        L_0x0184:
            r0 = r1;
        L_0x0185:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x018e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x01a4;
        L_0x019a:
            r0 = com.google.android.gms.wearable.internal.GetConnectedNodesResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetConnectedNodesResponse) r0;
            if (r3 == 0) goto L_0x01a5;
        L_0x01a4:
            r0 = r1;
        L_0x01a5:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x01ae:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x01c4;
        L_0x01ba:
            r0 = com.google.android.gms.wearable.internal.OpenChannelResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.OpenChannelResponse) r0;
            if (r3 == 0) goto L_0x01c5;
        L_0x01c4:
            r0 = r1;
        L_0x01c5:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x01ce:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x01e4;
        L_0x01da:
            r0 = com.google.android.gms.wearable.internal.CloseChannelResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.CloseChannelResponse) r0;
            if (r3 == 0) goto L_0x01e5;
        L_0x01e4:
            r0 = r1;
        L_0x01e5:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x01ee:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0204;
        L_0x01fa:
            r0 = com.google.android.gms.wearable.internal.CloseChannelResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.CloseChannelResponse) r0;
            if (r3 == 0) goto L_0x0205;
        L_0x0204:
            r0 = r1;
        L_0x0205:
            r4.zzb(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x020e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0224;
        L_0x021a:
            r0 = com.google.android.gms.wearable.internal.GetChannelInputStreamResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetChannelInputStreamResponse) r0;
            if (r3 == 0) goto L_0x0225;
        L_0x0224:
            r0 = r1;
        L_0x0225:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x022e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0244;
        L_0x023a:
            r0 = com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse) r0;
            if (r3 == 0) goto L_0x0245;
        L_0x0244:
            r0 = r1;
        L_0x0245:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x024e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0264;
        L_0x025a:
            r0 = com.google.android.gms.wearable.internal.ChannelReceiveFileResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.ChannelReceiveFileResponse) r0;
            if (r3 == 0) goto L_0x0265;
        L_0x0264:
            r0 = r1;
        L_0x0265:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x026e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0284;
        L_0x027a:
            r0 = com.google.android.gms.wearable.internal.ChannelSendFileResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.ChannelSendFileResponse) r0;
            if (r3 == 0) goto L_0x0285;
        L_0x0284:
            r0 = r1;
        L_0x0285:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x028e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x02a4;
        L_0x029a:
            r0 = com.google.android.gms.common.api.Status.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.common.api.Status) r0;
            if (r3 == 0) goto L_0x02a5;
        L_0x02a4:
            r0 = r1;
        L_0x02a5:
            r4.zzc(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x02ae:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x02c4;
        L_0x02ba:
            r0 = com.google.android.gms.wearable.internal.StorageInfoResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.StorageInfoResponse) r0;
            if (r3 == 0) goto L_0x02c5;
        L_0x02c4:
            r0 = r1;
        L_0x02c5:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x02ce:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x02e4;
        L_0x02da:
            r0 = com.google.android.gms.wearable.internal.GetCapabilityResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetCapabilityResponse) r0;
            if (r3 == 0) goto L_0x02e5;
        L_0x02e4:
            r0 = r1;
        L_0x02e5:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x02ee:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0304;
        L_0x02fa:
            r0 = com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse) r0;
            if (r3 == 0) goto L_0x0305;
        L_0x0304:
            r0 = r1;
        L_0x0305:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x030e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0324;
        L_0x031a:
            r0 = com.google.android.gms.wearable.internal.AddLocalCapabilityResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.AddLocalCapabilityResponse) r0;
            if (r3 == 0) goto L_0x0325;
        L_0x0324:
            r0 = r1;
        L_0x0325:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x032e:
            r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0344;
        L_0x033a:
            r0 = com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse) r0;
            if (r3 == 0) goto L_0x0345;
        L_0x0344:
            r0 = r1;
        L_0x0345:
            r4.zza(r0);
            r7.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x034e:
            r1 = r0;
            goto L_0x0105;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzau.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void zza(AddLocalCapabilityResponse addLocalCapabilityResponse);

    void zza(ChannelReceiveFileResponse channelReceiveFileResponse);

    void zza(ChannelSendFileResponse channelSendFileResponse);

    void zza(CloseChannelResponse closeChannelResponse);

    void zza(DeleteDataItemsResponse deleteDataItemsResponse);

    void zza(GetAllCapabilitiesResponse getAllCapabilitiesResponse);

    void zza(GetCapabilityResponse getCapabilityResponse);

    void zza(GetChannelInputStreamResponse getChannelInputStreamResponse);

    void zza(GetChannelOutputStreamResponse getChannelOutputStreamResponse);

    void zza(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse);

    void zza(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse);

    void zza(GetCloudSyncSettingResponse getCloudSyncSettingResponse);

    void zza(GetConfigResponse getConfigResponse);

    void zza(GetConfigsResponse getConfigsResponse);

    void zza(GetConnectedNodesResponse getConnectedNodesResponse);

    void zza(GetDataItemResponse getDataItemResponse);

    void zza(GetFdForAssetResponse getFdForAssetResponse);

    void zza(GetLocalNodeResponse getLocalNodeResponse);

    void zza(OpenChannelResponse openChannelResponse);

    void zza(PutDataResponse putDataResponse);

    void zza(RemoveLocalCapabilityResponse removeLocalCapabilityResponse);

    void zza(SendMessageResponse sendMessageResponse);

    void zza(StorageInfoResponse storageInfoResponse);

    void zzae(DataHolder dataHolder);

    void zzb(CloseChannelResponse closeChannelResponse);

    void zzc(Status status);
}
