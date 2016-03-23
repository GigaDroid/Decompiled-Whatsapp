package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.internal.zzau.zza;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class zzae extends zzc implements DataItem {
    private final int zzasz;

    public zzae(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.zzasz = i2;
    }

    public Map getAssets() {
        boolean z = zza.a;
        Map hashMap = new HashMap(this.zzasz);
        int i = 0;
        while (i < this.zzasz) {
            zzab com_google_android_gms_wearable_internal_zzab = new zzab(this.zzYX, this.zzabg + i);
            if (com_google_android_gms_wearable_internal_zzab.getDataItemKey() != null) {
                hashMap.put(com_google_android_gms_wearable_internal_zzab.getDataItemKey(), com_google_android_gms_wearable_internal_zzab);
            }
            i++;
            if (z) {
                break;
            }
        }
        return hashMap;
    }

    public byte[] getData() {
        return getByteArray("data");
    }

    public Uri getUri() {
        return Uri.parse(getString("path"));
    }

    public String toString() {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean z) {
        boolean z2 = zza.a;
        byte[] data = getData();
        Map assets = getAssets();
        StringBuilder stringBuilder = new StringBuilder("DataItemInternal{ ");
        stringBuilder.append("uri=" + getUri());
        stringBuilder.append(", dataSz=" + (data == null ? "null" : Integer.valueOf(data.length)));
        stringBuilder.append(", numAssets=" + assets.size());
        if (z && !assets.isEmpty()) {
            stringBuilder.append(", assets=[");
            String str = "";
            for (Entry entry : assets.entrySet()) {
                stringBuilder.append(str + ((String) entry.getKey()) + ": " + ((DataItemAsset) entry.getValue()).getId());
                String str2 = ", ";
                if (z2) {
                    break;
                }
                str = str2;
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
