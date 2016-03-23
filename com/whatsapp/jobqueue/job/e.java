package com.whatsapp.jobqueue.job;

import com.google.hx;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.awc;
import com.whatsapp.proto.E2E.Message;
import com.whatsapp.proto.E2E.Message.Builder;
import com.whatsapp.protocol.co;
import java.util.concurrent.Callable;
import org.v;
import org.whispersystems.aR;
import org.whispersystems.at;
import org.whispersystems.bI;

class e implements Callable {
    private static final String z;
    final co a;
    final boolean b;
    final SendSenderKeyJob c;

    static {
        char[] toCharArray = "0\\IUb\u0011[\u0014Cz\u0000\u0001\tG~".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 112;
                    break;
                case at.g /*1*/:
                    i2 = 47;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 34;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    e(SendSenderKeyJob sendSenderKeyJob, boolean z, co coVar) {
        this.c = sendSenderKeyJob;
        this.b = z;
        this.a = coVar;
    }

    public Object call() {
        return a();
    }

    public Message a() {
        byte[] b = new aR(SendSenderKeyJob.a(this.c).c()).a(new bI(SendSenderKeyJob.b(this.c), awc.e(App.ay.jabber_id + z))).b();
        Builder newBuilder = Message.newBuilder();
        newBuilder.getSenderKeyDistributionMessageBuilder().setGroupId(SendSenderKeyJob.b(this.c));
        newBuilder.getSenderKeyDistributionMessageBuilder().setAxolotlSenderKeyDistributionMessage(hx.a(b));
        if (this.b) {
            newBuilder.setConversation(this.a.c());
        }
        return newBuilder.build();
    }
}
