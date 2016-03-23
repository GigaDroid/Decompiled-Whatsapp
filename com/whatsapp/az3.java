package com.whatsapp;

import com.whatsapp.fieldstats.bd;
import java.util.TimerTask;

class az3 extends TimerTask {
    final aw2 a;

    public void run() {
        if (!aw2.a(this.a)) {
            this.a.k = true;
            aw2.a().remove(aw2.b(this.a).toString());
            if (!this.a.i) {
                aw2.j.obtainMessage(2, this.a.h).sendToTarget();
            }
            aw2.a(this.a, bd.TIMEOUT);
            if (this.a.l != null) {
                wn.a(this.a.l.b, 500);
            }
        }
    }

    public az3(aw2 com_whatsapp_aw2) {
        this.a = com_whatsapp_aw2;
    }
}
