package com.whatsapp.jobqueue.requirement;

import com.whatsapp.f;
import de.greenrobot.event.h;
import org.whispersystems.jobqueue.requirements.a;
import org.whispersystems.jobqueue.requirements.b;

public final class c implements a {
    private b a;

    public void a(b bVar) {
        this.a = bVar;
    }

    public c() {
        h.b().e(this);
    }

    public void onEvent(f fVar) {
        if (this.a != null) {
            this.a.a();
        }
    }
}
