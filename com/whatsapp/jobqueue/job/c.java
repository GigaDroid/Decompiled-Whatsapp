package com.whatsapp.jobqueue.job;

import com.whatsapp.awc;
import com.whatsapp.protocol.b1;
import java.util.concurrent.Callable;
import org.whispersystems.i;
import org.whispersystems.m;

class c implements Callable {
    final SendE2EMessageJob a;
    final String b;
    final byte[] c;

    public b1 a() {
        m a = new i(SendE2EMessageJob.b(this.a), SendE2EMessageJob.b(this.a), SendE2EMessageJob.b(this.a).i(), SendE2EMessageJob.b(this.a), awc.e(this.b)).a(this.c);
        return new b1(2, SendE2EMessageJob.b(a.a()), a.b());
    }

    public Object call() {
        return a();
    }

    c(SendE2EMessageJob sendE2EMessageJob, String str, byte[] bArr) {
        this.a = sendE2EMessageJob;
        this.b = str;
        this.c = bArr;
    }
}
