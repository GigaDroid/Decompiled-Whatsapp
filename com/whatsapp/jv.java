package com.whatsapp;

import android.os.AsyncTask;

class jv extends AsyncTask {
    final HomeActivity a;

    protected void a(Boolean bool) {
        this.a.removeDialog(1);
        HomeActivity.a(this.a, bool.booleanValue());
    }

    jv(HomeActivity homeActivity, asl com_whatsapp_asl) {
        this(homeActivity);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    private jv(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    protected void onPreExecute() {
        this.a.showDialog(1);
    }

    protected Boolean a(Void[] voidArr) {
        try {
            return Boolean.valueOf(zb.d());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return Boolean.valueOf(false);
        }
    }

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }
}
