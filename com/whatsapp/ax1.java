package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;

class ax1 extends AsyncTask {
    final CallLogActivity a;

    public Void a(Void[] voidArr) {
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(2131427523);
        Bitmap a = CallLogActivity.a(this.a).a(dimensionPixelSize, this.a.getResources().getDimension(2131427357), false);
        if (a == null) {
            a = CallLogActivity.a(this.a).w();
            if (a != null) {
                a = Bitmap.createScaledBitmap(a, dimensionPixelSize, dimensionPixelSize, true);
            }
        }
        if (!(a == null || isCancelled())) {
            this.a.runOnUiThread(new ait(this, a));
        }
        return null;
    }

    ax1(CallLogActivity callLogActivity) {
        this.a = callLogActivity;
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
