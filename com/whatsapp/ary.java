package com.whatsapp;

import android.os.AsyncTask;

class ary extends AsyncTask {
    final Conversations a;

    protected void a(Boolean bool) {
        this.a.removeDialog(1);
        Conversations.a(this.a, bool.booleanValue());
    }

    protected Boolean a(Void[] voidArr) {
        try {
            return Boolean.valueOf(zb.d());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return Boolean.valueOf(false);
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    private ary(Conversations conversations) {
        this.a = conversations;
    }

    ary(Conversations conversations, a93 com_whatsapp_a93) {
        this(conversations);
    }

    protected void onPreExecute() {
        this.a.showDialog(1);
    }

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }
}
