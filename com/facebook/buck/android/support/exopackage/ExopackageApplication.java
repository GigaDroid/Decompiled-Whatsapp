package com.facebook.buck.android.support.exopackage;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

public abstract class ExopackageApplication extends Application {
    private final String a;
    private b b;
    private final int c;

    private boolean e() {
        try {
            return (this.c & 2) != 0;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @TargetApi(14)
    public final void onTrimMemory(int i) {
        try {
            super.onTrimMemory(i);
            if (this.b != null) {
                this.b.a(i);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
            if (this.b != null) {
                this.b.a(configuration);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    protected ExopackageApplication(String str, int i) {
        this.a = str;
        this.c = i;
    }

    private boolean b() {
        try {
            return (this.c & 1) != 0;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public final void onLowMemory() {
        try {
            super.onLowMemory();
            if (this.b != null) {
                this.b.c();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public final void onTerminate() {
        try {
            super.onTerminate();
            if (this.b != null) {
                this.b.b();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private synchronized void c() {
        try {
            if (this.b == null) {
                this.b = d();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public final void onCreate() {
        super.onCreate();
        c();
        this.b.a();
    }

    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        a();
        c();
    }

    private b d() {
        try {
            if (b()) {
                a.a(this);
            }
            try {
                if (e()) {
                    d.a(this);
                }
                try {
                    return (b) Class.forName(this.a).getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this});
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e22) {
            throw e22;
        }
    }

    protected void a() {
    }
}
