package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;
import com.whatsapp.gdrive.bi;
import com.whatsapp.gdrive.dg;

final class au5 implements ServiceConnection {
    final bi a;
    final ConditionVariable b;

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        DeleteAccountConfirmation.a(((dg) iBinder).a());
        this.b.open();
        DeleteAccountConfirmation.b().b(this.a);
        DeleteAccountConfirmation.b().u();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.b.close();
        DeleteAccountConfirmation.a(null);
    }

    au5(ConditionVariable conditionVariable, bi biVar) {
        this.b = conditionVariable;
        this.a = biVar;
    }
}
