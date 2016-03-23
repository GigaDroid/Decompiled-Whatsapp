package com.whatsapp;

import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.messaging.co;
import java.util.List;

final class ik implements Runnable {
    final String a;
    final List b;

    ik(List list, String str) {
        this.b = list;
        this.a = str;
    }

    public void run() {
        List b = App.b(this.b);
        if (b.size() > 0) {
            String str;
            if (this.a == null) {
                str = Integer.toString(App.as.b()) + App.aK.B();
            } else {
                str = this.a;
            }
            _d _dVar = new _d(new s7(this.b, str));
            String u = wn.u();
            App.p.ai.a(new SendWebForwardJob(u, co.a(u, b, str, _dVar)));
        }
    }
}
