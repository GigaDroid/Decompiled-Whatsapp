package com.whatsapp.jobqueue.job;

import com.google.hx;
import com.whatsapp.App;
import com.whatsapp.awc;
import com.whatsapp.proto.E2E.Message;
import com.whatsapp.proto.E2E.Message.Builder;
import java.util.concurrent.Callable;
import org.v;
import org.whispersystems.aR;
import org.whispersystems.at;
import org.whispersystems.bI;

class a implements Callable {
    private static final String z;
    final SendE2EMessageJob a;

    static {
        char[] toCharArray = "\u0010@h$z1G52b \u001d(6f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 80;
                    break;
                case at.g /*1*/:
                    i2 = 51;
                    break;
                case at.i /*2*/:
                    i2 = 70;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Object call() {
        return a();
    }

    a(SendE2EMessageJob sendE2EMessageJob) {
        this.a = sendE2EMessageJob;
    }

    public Message a() {
        byte[] b = new aR(SendE2EMessageJob.b(this.a).c()).a(new bI(SendE2EMessageJob.a(this.a), awc.e(App.ay.jabber_id + z))).b();
        Builder newBuilder = Message.newBuilder();
        newBuilder.getSenderKeyDistributionMessageBuilder().setGroupId(SendE2EMessageJob.a(this.a));
        newBuilder.getSenderKeyDistributionMessageBuilder().setAxolotlSenderKeyDistributionMessage(hx.a(b));
        return newBuilder.build();
    }
}
