package com.whatsapp.jobqueue.job;

import android.content.Context;
import android.os.Message;
import com.whatsapp.App;
import com.whatsapp.auv;
import com.whatsapp.jobqueue.a;
import com.whatsapp.jobqueue.b;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.util.Log;
import com.whatsapp.wn;
import org.whispersystems.at;
import org.whispersystems.jobqueue.g;
import org.whispersystems.jobqueue.s;
import org.whispersystems.jobqueue.v;

public final class SendWebForwardJob extends v implements a, g {
    private static final String GROUP_ID;
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private final transient String f;
    private final transient Message g;
    private transient b h;
    private final transient String i;
    private transient App j;

    static {
        String[] strArr = new String[5];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "]\u0005{Z:D\u0004";
        Object obj = 4;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case org.v.m /*0*/:
                        i3 = 42;
                        break;
                    case at.g /*1*/:
                        i3 = 96;
                        break;
                    case at.i /*2*/:
                        i3 = 25;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case org.v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0011@kl9\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "@\u000f{&,O\u000e}^:H&v{(K\u0012}&0D2lg\u007fC\u0004$";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "]\u0005{Z:D\u0004";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                case at.p /*4*/:
                    GROUP_ID = str;
                    str = "\u0011@kl9\u0017";
                    obj = -1;
                    break;
                default:
                    strArr2[i] = str;
                    str = "@\u000f{&,O\u000e}^:H&v{(K\u0012}):R\u0003|y+C\u000fw2\u007fC\u0004$";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void n() {
    }

    public void a(App app) {
        this.j = app;
    }

    public boolean a(Exception exception) {
        Log.c(z[1] + this.i + z[0] + this.f, (Throwable) exception);
        if (this.f == null || wn.h(this.f)) {
            return true;
        }
        return false;
    }

    public void i() {
        Log.i(z[3] + this.i + z[2] + this.f);
        this.j.ai.a(new d(this, this.i, this.f, this.g, this.h.a().a(this.i, this.g)));
        this.h.b();
    }

    public void b() {
        this.h.b();
    }

    public SendWebForwardJob(String str, Message message) {
        super(s.f().a(z[4]).a(new ChatConnectionRequirement()).b());
        this.i = (String) auv.a((Object) str);
        this.g = (Message) auv.a((Object) message);
        this.f = wn.q;
    }

    public void a(Context context) {
        if (this.h == null) {
            this.h = new b(context);
        }
        this.h.c();
    }
}
