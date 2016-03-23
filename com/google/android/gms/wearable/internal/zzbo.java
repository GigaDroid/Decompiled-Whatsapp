package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.internal.zzav.zza;
import com.google.android.gms.wearable.zzc;
import java.util.List;

final class zzbo extends zza {
    private final String zzaZF;
    private final IntentFilter[] zzbal;
    private com.google.android.gms.wearable.zza.zza zzbbg;
    private zzc.zza zzbbh;
    private DataListener zzbbi;
    private MessageListener zzbbj;
    private NodeListener zzbbk;
    private NodeApi.zza zzbbl;
    private ChannelListener zzbbm;
    private CapabilityListener zzbbn;
    private final String zzbbo;

    public void clear() {
        this.zzbbg = null;
        this.zzbbh = null;
        this.zzbbi = null;
        this.zzbbj = null;
        this.zzbbk = null;
        this.zzbbl = null;
        this.zzbbm = null;
        this.zzbbn = null;
    }

    public void onConnectedNodes(List list) {
        if (this.zzbbl != null) {
            this.zzbbl.onConnectedNodes(list);
        }
    }

    public IntentFilter[] zzCJ() {
        return this.zzbal;
    }

    public String zzCK() {
        return this.zzbbo;
    }

    public String zzCL() {
        return this.zzaZF;
    }

    public void zza(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        if (this.zzbbg != null) {
            this.zzbbg.zza(amsEntityUpdateParcelable);
        }
    }

    public void zza(AncsNotificationParcelable ancsNotificationParcelable) {
        if (this.zzbbh != null) {
            this.zzbbh.zza(ancsNotificationParcelable);
        }
    }

    public void zza(CapabilityInfoParcelable capabilityInfoParcelable) {
        if (this.zzbbn != null) {
            this.zzbbn.onCapabilityChanged(capabilityInfoParcelable);
        }
    }

    public void zza(ChannelEventParcelable channelEventParcelable) {
        if (this.zzbbm != null) {
            channelEventParcelable.zza(this.zzbbm);
        }
    }

    public void zza(MessageEventParcelable messageEventParcelable) {
        if (this.zzbbj != null) {
            this.zzbbj.onMessageReceived(messageEventParcelable);
        }
    }

    public void zza(NodeParcelable nodeParcelable) {
        if (this.zzbbk != null) {
            this.zzbbk.onPeerConnected(nodeParcelable);
        }
    }

    public void zzad(DataHolder dataHolder) {
        if (this.zzbbi != null) {
            try {
                this.zzbbi.onDataChanged(new DataEventBuffer(dataHolder));
                if (!zzau.zza.a) {
                    return;
                }
            } finally {
                dataHolder.close();
            }
        }
        dataHolder.close();
    }

    public void zzb(NodeParcelable nodeParcelable) {
        if (this.zzbbk != null) {
            this.zzbbk.onPeerDisconnected(nodeParcelable);
        }
    }
}
