package com.whatsapp;

import android.os.AsyncTask;

class au2 extends AsyncTask {
    final LocationPicker2 a;
    k1 b;

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPreExecute() {
        super.onPreExecute();
        LocationPicker2.y(this.a);
    }

    protected Void a(Void[] voidArr) {
        k1.c(this.b);
        return null;
    }

    public au2(LocationPicker2 locationPicker2, k1 k1Var) {
        this.a = locationPicker2;
        this.b = k1Var;
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected void a(Void voidR) {
        if (!isCancelled()) {
            LocationPicker2.f(this.a).notifyDataSetChanged();
            LocationPicker2.i(this.a);
            LocationPicker2.u(this.a).a(this.b.l());
            LocationPicker2.m(this.a);
        }
    }
}
