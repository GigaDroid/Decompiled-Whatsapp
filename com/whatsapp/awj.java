package com.whatsapp;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

class awj extends AsyncTask {
    private String a;
    private Handler b;
    private boolean c;
    private long d;
    private Runnable e;
    final Conversation f;

    protected String a(Void[] voidArr) {
        return qm.b(this.a);
    }

    protected void a(String str) {
        if (this.a.equals(this.f.aI.p)) {
            Conversation.g(this.f, str);
            this.b = new Handler(Looper.getMainLooper());
            this.e = new atb(this);
            if (this.c) {
                this.b.postAtTime(this.e, this.d + 3000);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            this.e.run();
        }
    }

    public awj(Conversation conversation, String str, boolean z) {
        this.f = conversation;
        this.a = str;
        this.c = z;
        this.d = SystemClock.uptimeMillis();
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((String) obj);
    }

    static String a(awj com_whatsapp_awj) {
        return com_whatsapp_awj.a;
    }

    protected void a() {
        super.cancel(false);
        if (this.b != null) {
            this.b.removeCallbacks(this.e);
        }
        this.b = null;
        this.e = null;
    }
}
