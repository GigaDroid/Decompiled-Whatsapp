package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

class a98 extends AsyncTask {
    final int a;
    final VoipActivity b;

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    a98(VoipActivity voipActivity, int i) {
        this.b = voipActivity;
        this.a = i;
    }

    protected Bitmap a(Void[] voidArr) {
        Bitmap bitmap = null;
        int priority = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(5);
        try {
            String peerJid = Voip.getPeerJid();
            if (peerJid != null) {
                l5 f = App.as.f(peerJid);
                if (f == null) {
                    Thread.currentThread().setPriority(priority);
                } else {
                    bitmap = f.a(this.a, 0.0f, false);
                    Thread.currentThread().setPriority(priority);
                }
            }
            return bitmap;
        } finally {
            Thread.currentThread().setPriority(priority);
        }
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    protected void a(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.b.findViewById(2131755901);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        imageView.setImageResource(2130837612);
    }
}
