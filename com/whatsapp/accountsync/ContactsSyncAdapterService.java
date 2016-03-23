package com.whatsapp.accountsync;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;

public class ContactsSyncAdapterService extends Service {
    private final AbstractThreadedSyncAdapter a;

    public ContactsSyncAdapterService() {
        this.a = new g(this, this, true);
    }

    public IBinder onBind(Intent intent) {
        return this.a.getSyncAdapterBinder();
    }
}
