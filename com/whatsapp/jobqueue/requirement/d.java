package com.whatsapp.jobqueue.requirement;

import com.whatsapp.a47;
import de.greenrobot.event.h;
import org.whispersystems.jobqueue.requirements.a;
import org.whispersystems.jobqueue.requirements.b;

public final class d implements a {
    private b a;

    public d() {
        h.b().e(this);
    }

    public void a(b bVar) {
        this.a = bVar;
    }

    public void onEvent(a47 com_whatsapp_a47) {
        if (this.a != null) {
            this.a.a();
        }
    }
}
