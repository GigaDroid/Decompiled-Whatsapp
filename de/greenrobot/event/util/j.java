package de.greenrobot.event.util;

import android.app.Activity;
import de.greenrobot.event.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class j {
    private Class a;
    private h b;
    private Executor c;

    j(l lVar) {
        this();
    }

    public e a() {
        return a(null);
    }

    private j() {
    }

    public e a(Activity activity) {
        return a(activity.getClass());
    }

    public e a(Object obj) {
        if (this.b == null) {
            this.b = h.b();
        }
        if (this.c == null) {
            this.c = Executors.newCachedThreadPool();
        }
        if (this.a == null) {
            this.a = f.class;
        }
        return new e(this.c, this.b, this.a, obj, null);
    }

    public j a(h hVar) {
        this.b = hVar;
        return this;
    }

    public j a(Executor executor) {
        this.c = executor;
        return this;
    }

    public j a(Class cls) {
        this.a = cls;
        return this;
    }
}
