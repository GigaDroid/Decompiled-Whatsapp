package com.whatsapp.jobqueue.requirement;

import com.whatsapp.ji;
import de.greenrobot.event.h;
import org.whispersystems.jobqueue.requirements.a;

public final class b implements a {
    private org.whispersystems.jobqueue.requirements.b a;

    public void a(org.whispersystems.jobqueue.requirements.b bVar) {
        this.a = bVar;
    }

    public void onEvent(ji jiVar) {
        if (this.a != null) {
            this.a.a();
        }
    }

    public b() {
        h.b().e(this);
    }
}
