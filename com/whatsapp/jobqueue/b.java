package com.whatsapp.jobqueue;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.auv;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.n;

public final class b implements ServiceConnection {
    public static boolean c;
    private final Context a;
    private MessageService b;
    private boolean d;

    public synchronized void b() {
        if (this.d) {
            this.a.unbindService(this);
            this.d = false;
        }
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z = c;
        this.b = ((n) iBinder).a();
        notifyAll();
        if (WAAppCompatActivity.c != 0) {
            c = !z;
        }
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
        this.b = null;
    }

    public b(Context context) {
        this.a = context;
    }

    public synchronized void c() {
        if (!this.d) {
            this.a.bindService(new Intent(this.a, MessageService.class), this, 1);
            this.d = true;
        }
    }

    public synchronized MessageService a() {
        MessageService messageService;
        boolean z = c;
        auv.b();
        c();
        messageService = this.b;
        while (messageService == null) {
            wait();
            messageService = this.b;
            if (z) {
                WAAppCompatActivity.c++;
                break;
            }
        }
        return messageService;
    }
}
