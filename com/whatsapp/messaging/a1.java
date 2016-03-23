package com.whatsapp.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

public final class a1 extends AsyncTask {
    private final Context a;

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    protected void a(Boolean bool) {
        if (bool.booleanValue()) {
            Intent intent = new Intent(this.a, CaptivePortalActivity.class);
            intent.setFlags(268435456);
            this.a.startActivity(intent);
        }
    }

    public a1(Context context) {
        this.a = context;
    }

    protected Boolean a(Void[] voidArr) {
        try {
            return Boolean.valueOf(MessageService.v());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return Boolean.valueOf(false);
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
