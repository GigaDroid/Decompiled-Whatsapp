package com.whatsapp;

import android.os.AsyncTask;

class h extends AsyncTask {
    k1 a;
    final LocationPicker b;

    protected Void a(Void[] voidArr) {
        k1.c(this.a);
        return null;
    }

    protected void onPreExecute() {
        super.onPreExecute();
        LocationPicker.q(this.b);
    }

    protected void a(Void voidR) {
        if (!isCancelled()) {
            LocationPicker.j(this.b).notifyDataSetChanged();
            LocationPicker.i(this.b).a();
            LocationPicker.o(this.b).invalidate();
            LocationPicker.h(this.b).a(this.a.l());
            LocationPicker.e(this.b);
        }
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    public h(LocationPicker locationPicker, k1 k1Var) {
        this.b = locationPicker;
        this.a = k1Var;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
