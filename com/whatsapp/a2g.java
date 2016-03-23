package com.whatsapp;

import android.os.AsyncTask;

class a2g extends AsyncTask {
    final ChatInfoActivity a;
    String b;

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public a2g(ChatInfoActivity chatInfoActivity, String str) {
        this.a = chatInfoActivity;
        this.b = str;
    }

    protected Void a(Void[] voidArr) {
        this.a.runOnUiThread(new aq7(this, App.aK.a(this.b, new gk(this))));
        return null;
    }
}
