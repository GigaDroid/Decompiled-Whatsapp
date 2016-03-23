package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

public abstract class WearableListenerService extends Service implements CapabilityListener, ChannelListener, DataListener, MessageListener, NodeListener, com.google.android.gms.wearable.NodeApi.zza {
    public static int a;
    private boolean zzLA;
    private String zzOZ;
    private Handler zzaZc;
    private Object zzaZd;
    private volatile int zzacB;
    private IBinder zzacE;

    class zza extends com.google.android.gms.wearable.internal.zzav.zza {
        boolean zzaZe;
        final WearableListenerService zzaZf;

        class 1 implements Runnable {
            final DataHolder zzaZg;
            final zza zzaZh;

            1(zza com_google_android_gms_wearable_WearableListenerService_zza, DataHolder dataHolder) {
                this.zzaZh = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaZg = dataHolder;
            }

            public void run() {
                DataEventBuffer dataEventBuffer = new DataEventBuffer(this.zzaZg);
                try {
                    this.zzaZh.zzaZf.onDataChanged(dataEventBuffer);
                } finally {
                    dataEventBuffer.release();
                }
            }
        }

        class 2 implements Runnable {
            final zza zzaZh;
            final MessageEventParcelable zzaZi;

            2(zza com_google_android_gms_wearable_WearableListenerService_zza, MessageEventParcelable messageEventParcelable) {
                this.zzaZh = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaZi = messageEventParcelable;
            }

            public void run() {
                this.zzaZh.zzaZf.onMessageReceived(this.zzaZi);
            }
        }

        class 3 implements Runnable {
            final zza zzaZh;
            final NodeParcelable zzaZj;

            3(zza com_google_android_gms_wearable_WearableListenerService_zza, NodeParcelable nodeParcelable) {
                this.zzaZh = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaZj = nodeParcelable;
            }

            public void run() {
                this.zzaZh.zzaZf.onPeerConnected(this.zzaZj);
            }
        }

        class 4 implements Runnable {
            final zza zzaZh;
            final NodeParcelable zzaZj;

            4(zza com_google_android_gms_wearable_WearableListenerService_zza, NodeParcelable nodeParcelable) {
                this.zzaZh = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaZj = nodeParcelable;
            }

            public void run() {
                this.zzaZh.zzaZf.onPeerDisconnected(this.zzaZj);
            }
        }

        class 5 implements Runnable {
            final zza zzaZh;
            final List zzaZk;

            5(zza com_google_android_gms_wearable_WearableListenerService_zza, List list) {
                this.zzaZh = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaZk = list;
            }

            public void run() {
                this.zzaZh.zzaZf.onConnectedNodes(this.zzaZk);
            }
        }

        class 6 implements Runnable {
            final zza zzaZh;
            final CapabilityInfoParcelable zzaZl;

            6(zza com_google_android_gms_wearable_WearableListenerService_zza, CapabilityInfoParcelable capabilityInfoParcelable) {
                this.zzaZh = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaZl = capabilityInfoParcelable;
            }

            public void run() {
                this.zzaZh.zzaZf.onCapabilityChanged(this.zzaZl);
            }
        }

        class 7 implements Runnable {
            final zza zzaZh;
            final zzj zzaZm;
            final AncsNotificationParcelable zzaZn;

            7(zza com_google_android_gms_wearable_WearableListenerService_zza, zzj com_google_android_gms_wearable_zzj, AncsNotificationParcelable ancsNotificationParcelable) {
                this.zzaZh = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaZm = com_google_android_gms_wearable_zzj;
                this.zzaZn = ancsNotificationParcelable;
            }

            public void run() {
                this.zzaZm.zza(this.zzaZn);
            }
        }

        class 8 implements Runnable {
            final zza zzaZh;
            final zzj zzaZm;
            final AmsEntityUpdateParcelable zzaZo;

            8(zza com_google_android_gms_wearable_WearableListenerService_zza, zzj com_google_android_gms_wearable_zzj, AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
                this.zzaZh = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaZm = com_google_android_gms_wearable_zzj;
                this.zzaZo = amsEntityUpdateParcelable;
            }

            public void run() {
                this.zzaZm.zza(this.zzaZo);
            }
        }

        class 9 implements Runnable {
            final zza zzaZh;
            final ChannelEventParcelable zzaZp;

            9(zza com_google_android_gms_wearable_WearableListenerService_zza, ChannelEventParcelable channelEventParcelable) {
                this.zzaZh = com_google_android_gms_wearable_WearableListenerService_zza;
                this.zzaZp = channelEventParcelable;
            }

            public void run() {
                this.zzaZp.zza(this.zzaZh.zzaZf);
            }
        }

        zza(WearableListenerService wearableListenerService) {
            this.zzaZf = wearableListenerService;
            this.zzaZe = false;
            this.zzaZe = wearableListenerService instanceof zzj;
        }

        public void onConnectedNodes(List list) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onConnectedNodes: " + WearableListenerService.zza(this.zzaZf) + ": " + list);
            }
            WearableListenerService.zzb(this.zzaZf);
            synchronized (WearableListenerService.zzc(this.zzaZf)) {
                if (WearableListenerService.zzd(this.zzaZf)) {
                    return;
                }
                WearableListenerService.zze(this.zzaZf).post(new 5(this, list));
            }
        }

        public void zza(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onEntityUpdate: " + amsEntityUpdateParcelable);
            }
            if (this.zzaZe) {
                WearableListenerService.zzb(this.zzaZf);
                zzj com_google_android_gms_wearable_zzj = (zzj) this.zzaZf;
                synchronized (WearableListenerService.zzc(this.zzaZf)) {
                    if (WearableListenerService.zzd(this.zzaZf)) {
                        return;
                    }
                    WearableListenerService.zze(this.zzaZf).post(new 8(this, com_google_android_gms_wearable_zzj, amsEntityUpdateParcelable));
                }
            }
        }

        public void zza(AncsNotificationParcelable ancsNotificationParcelable) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onNotificationReceived: " + ancsNotificationParcelable);
            }
            if (this.zzaZe) {
                WearableListenerService.zzb(this.zzaZf);
                zzj com_google_android_gms_wearable_zzj = (zzj) this.zzaZf;
                synchronized (WearableListenerService.zzc(this.zzaZf)) {
                    if (WearableListenerService.zzd(this.zzaZf)) {
                        return;
                    }
                    WearableListenerService.zze(this.zzaZf).post(new 7(this, com_google_android_gms_wearable_zzj, ancsNotificationParcelable));
                }
            }
        }

        public void zza(CapabilityInfoParcelable capabilityInfoParcelable) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onConnectedCapabilityChanged: " + capabilityInfoParcelable);
            }
            WearableListenerService.zzb(this.zzaZf);
            synchronized (WearableListenerService.zzc(this.zzaZf)) {
                if (WearableListenerService.zzd(this.zzaZf)) {
                    return;
                }
                WearableListenerService.zze(this.zzaZf).post(new 6(this, capabilityInfoParcelable));
            }
        }

        public void zza(ChannelEventParcelable channelEventParcelable) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onChannelEvent: " + channelEventParcelable);
            }
            WearableListenerService.zzb(this.zzaZf);
            synchronized (WearableListenerService.zzc(this.zzaZf)) {
                if (WearableListenerService.zzd(this.zzaZf)) {
                    return;
                }
                WearableListenerService.zze(this.zzaZf).post(new 9(this, channelEventParcelable));
            }
        }

        public void zza(MessageEventParcelable messageEventParcelable) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onMessageReceived: " + messageEventParcelable);
            }
            WearableListenerService.zzb(this.zzaZf);
            synchronized (WearableListenerService.zzc(this.zzaZf)) {
                if (WearableListenerService.zzd(this.zzaZf)) {
                    return;
                }
                WearableListenerService.zze(this.zzaZf).post(new 2(this, messageEventParcelable));
            }
        }

        public void zza(NodeParcelable nodeParcelable) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onPeerConnected: " + WearableListenerService.zza(this.zzaZf) + ": " + nodeParcelable);
            }
            WearableListenerService.zzb(this.zzaZf);
            synchronized (WearableListenerService.zzc(this.zzaZf)) {
                if (WearableListenerService.zzd(this.zzaZf)) {
                    return;
                }
                WearableListenerService.zze(this.zzaZf).post(new 3(this, nodeParcelable));
            }
        }

        public void zzad(DataHolder dataHolder) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onDataItemChanged: " + WearableListenerService.zza(this.zzaZf) + ": " + dataHolder);
            }
            WearableListenerService.zzb(this.zzaZf);
            synchronized (WearableListenerService.zzc(this.zzaZf)) {
                if (WearableListenerService.zzd(this.zzaZf)) {
                    dataHolder.close();
                    return;
                }
                WearableListenerService.zze(this.zzaZf).post(new 1(this, dataHolder));
            }
        }

        public void zzb(NodeParcelable nodeParcelable) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onPeerDisconnected: " + WearableListenerService.zza(this.zzaZf) + ": " + nodeParcelable);
            }
            WearableListenerService.zzb(this.zzaZf);
            synchronized (WearableListenerService.zzc(this.zzaZf)) {
                if (WearableListenerService.zzd(this.zzaZf)) {
                    return;
                }
                WearableListenerService.zze(this.zzaZf).post(new 4(this, nodeParcelable));
            }
        }
    }

    public WearableListenerService() {
        this.zzacB = -1;
        this.zzaZd = new Object();
    }

    private void zzCs() {
        int callingUid = Binder.getCallingUid();
        try {
            if (callingUid != this.zzacB) {
                try {
                    if (GooglePlayServicesUtil.zze(this, callingUid)) {
                        this.zzacB = callingUid;
                        return;
                    }
                    throw new SecurityException("Caller is not GooglePlayServices");
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static String zza(WearableListenerService wearableListenerService) {
        return wearableListenerService.zzOZ;
    }

    static void zzb(WearableListenerService wearableListenerService) {
        wearableListenerService.zzCs();
    }

    static Object zzc(WearableListenerService wearableListenerService) {
        return wearableListenerService.zzaZd;
    }

    static boolean zzd(WearableListenerService wearableListenerService) {
        return wearableListenerService.zzLA;
    }

    static Handler zze(WearableListenerService wearableListenerService) {
        return wearableListenerService.zzaZc;
    }

    public final IBinder onBind(Intent intent) {
        try {
            return "com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()) ? this.zzacE : null;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
    }

    public void onChannelClosed(Channel channel, int i, int i2) {
    }

    public void onChannelOpened(Channel channel) {
    }

    public void onConnectedNodes(List list) {
    }

    public void onCreate() {
        try {
            super.onCreate();
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onCreate: " + getPackageName());
            }
            this.zzOZ = getPackageName();
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.zzaZc = new Handler(handlerThread.getLooper());
            this.zzacE = new zza(this);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onDataChanged(DataEventBuffer dataEventBuffer) {
    }

    public void onDestroy() {
        synchronized (this.zzaZd) {
            this.zzLA = true;
            if (this.zzaZc == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
            }
            this.zzaZc.getLooper().quit();
        }
        super.onDestroy();
    }

    public void onInputClosed(Channel channel, int i, int i2) {
    }

    public void onMessageReceived(MessageEvent messageEvent) {
    }

    public void onOutputClosed(Channel channel, int i, int i2) {
    }

    public void onPeerConnected(Node node) {
    }

    public void onPeerDisconnected(Node node) {
    }
}
