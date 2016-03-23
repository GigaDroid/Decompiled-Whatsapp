package com.whatsapp.jobqueue.job;

import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.awc;
import com.whatsapp.protocol.b1;
import java.util.concurrent.Callable;
import org.v;
import org.whispersystems.aG;
import org.whispersystems.aR;
import org.whispersystems.at;
import org.whispersystems.bI;
import org.whispersystems.i;
import org.whispersystems.m;

class b implements Callable {
    private static final String z;
    final boolean a;
    final SendE2EMessageJob b;
    final byte[] c;

    static {
        char[] toCharArray = "YO\u001f{PxHBmHi\u0012_iL".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 25;
                    break;
                case at.g /*1*/:
                    i2 = 60;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    b(SendE2EMessageJob sendE2EMessageJob, boolean z, byte[] bArr) {
        this.b = sendE2EMessageJob;
        this.a = z;
        this.c = bArr;
    }

    public b1 a() {
        if (this.a) {
            bI bIVar = new bI(SendE2EMessageJob.a(this.b), awc.e(App.ay.jabber_id + z));
            new aR(SendE2EMessageJob.b(this.b).c()).a(bIVar);
            return new b1(2, 2, new aG(SendE2EMessageJob.b(this.b).c(), bIVar).a(this.c));
        }
        m a = new i(SendE2EMessageJob.b(this.b), SendE2EMessageJob.b(this.b), SendE2EMessageJob.b(this.b).i(), SendE2EMessageJob.b(this.b), awc.e(TextUtils.isEmpty(SendE2EMessageJob.c(this.b)) ? SendE2EMessageJob.a(this.b) : SendE2EMessageJob.c(this.b))).a(this.c);
        return new b1(2, SendE2EMessageJob.b(a.a()), a.b());
    }

    public Object call() {
        return a();
    }
}
