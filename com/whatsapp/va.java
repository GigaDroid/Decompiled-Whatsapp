package com.whatsapp;

import android.os.AsyncTask;

class va extends AsyncTask {
    final StarredMessagesActivity a;
    final long b;

    va(StarredMessagesActivity starredMessagesActivity, long j) {
        this.a = starredMessagesActivity;
        this.b = j;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Void voidR) {
        this.a.e();
        this.a.getSupportLoaderManager().restartLoader(0, null, this.a);
        StarredMessagesActivity.a(this.a);
    }

    protected Void a(Void[] voidArr) {
        App.aK.f(StarredMessagesActivity.d(this.a), true);
        DialogToastActivity.a(this.b, 300);
        return null;
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }
}
