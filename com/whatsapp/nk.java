package com.whatsapp;

import android.content.Context;
import android.net.NetworkInfo;
import com.whatsapp.fieldstats.a8;
import com.whatsapp.fieldstats.i;

class nk implements Runnable {
    final NetworkInfo a;
    final Context b;
    final ConnectivityReceiver c;

    nk(ConnectivityReceiver connectivityReceiver, NetworkInfo networkInfo, Context context) {
        this.c = connectivityReceiver;
        this.a = networkInfo;
        this.b = context;
    }

    public void run() {
        av a8Var = new a8();
        Double valueOf = (this.a == null || !this.a.isRoaming()) ? Double.valueOf(0.0d) : Double.valueOf(1.0d);
        a8Var.b = valueOf;
        valueOf = (this.a == null || this.a.getType() != 1) ? Double.valueOf(0.0d) : Double.valueOf(1.0d);
        a8Var.c = valueOf;
        int a = nf.a(this.a);
        a8Var.a = a != -1 ? Double.valueOf((double) a) : null;
        i.a(this.b, a8Var);
    }
}
