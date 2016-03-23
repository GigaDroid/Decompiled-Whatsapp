package com.whatsapp.jobqueue.job;

import android.os.Message;
import com.whatsapp.App;
import com.whatsapp.jobqueue.a;
import com.whatsapp.wn;
import java.util.concurrent.Future;
import org.whispersystems.at;
import org.whispersystems.jobqueue.s;
import org.whispersystems.jobqueue.v;

final class d extends v implements a {
    private static final String l;
    private static final long serialVersionUID = 1;
    private static final String z;
    private final transient Future f;
    private final transient String g;
    private transient App h;
    final SendWebForwardJob i;
    private final transient String j;
    private final transient Message k;

    static {
        String str = "Ey%\u000b=Y";
        Object obj = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case org.v.m /*0*/:
                        i2 = 50;
                        break;
                    case at.g /*1*/:
                        i2 = 28;
                        break;
                    case at.i /*2*/:
                        i2 = 71;
                        break;
                    case at.o /*3*/:
                        i2 = 74;
                        break;
                    default:
                        i2 = 94;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case org.v.m /*0*/:
                    l = str;
                    return;
                default:
                    z = str;
                    str = "Ey%\u000b=Y";
                    obj = null;
            }
        }
    }

    public d(SendWebForwardJob sendWebForwardJob, String str, String str2, Message message, Future future) {
        this.i = sendWebForwardJob;
        super(s.f().a(z).b());
        this.j = str;
        this.k = message;
        this.g = str2;
        this.f = future;
    }

    public void a(App app) {
        this.h = app;
    }

    public boolean a(Exception exception) {
        return false;
    }

    public void n() {
    }

    public void i() {
        this.f.get();
    }

    public void b() {
        if (this.g == null || wn.h(this.g)) {
            this.h.ai.a(new SendWebForwardJob(this.j, this.k));
        }
    }
}
