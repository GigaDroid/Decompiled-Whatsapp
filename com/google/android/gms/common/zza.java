package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class zza implements ServiceConnection {
    boolean zzYg;
    private final BlockingQueue zzYh;

    public zza() {
        this.zzYg = false;
        this.zzYh = new LinkedBlockingQueue();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zzYh.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public IBinder zzmS() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
            }
            try {
                if (this.zzYg) {
                    throw new IllegalStateException();
                }
                this.zzYg = true;
                return (IBinder) this.zzYh.take();
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
