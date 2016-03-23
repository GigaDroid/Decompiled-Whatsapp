package com.whatsapp.jobqueue.requirement;

import com.whatsapp.a_3;
import de.greenrobot.event.h;
import org.whispersystems.jobqueue.requirements.b;

public final class a implements org.whispersystems.jobqueue.requirements.a {
    private b a;

    public a() {
        h.b().e(this);
    }

    public void onEvent(a_3 com_whatsapp_a_3) {
        if (this.a != null) {
            this.a.a();
        }
    }

    public void a(b bVar) {
        this.a = bVar;
    }
}
