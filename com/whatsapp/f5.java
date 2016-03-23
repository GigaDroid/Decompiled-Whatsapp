package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;
import com.whatsapp.gdrive.dg;

class f5 implements ServiceConnection {
    final ConditionVariable a;
    final q6 b;

    f5(q6 q6Var, ConditionVariable conditionVariable) {
        this.b = q6Var;
        this.a = conditionVariable;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ChangeNumber.a(((dg) iBinder).a());
        this.a.open();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.a.close();
        ChangeNumber.a(null);
    }
}
