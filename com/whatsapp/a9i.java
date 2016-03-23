package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;

class a9i extends AsyncTask {
    final ViewSharedContactActivity a;

    protected Bitmap a(Void[] voidArr) {
        return ViewSharedContactActivity.f(this.a).a(96, 0.0f, true);
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    protected void a(Bitmap bitmap) {
        if (bitmap != null) {
            ViewSharedContactActivity.a(this.a, bitmap);
            ViewSharedContactActivity.a(this.a, true);
        }
    }

    a9i(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
