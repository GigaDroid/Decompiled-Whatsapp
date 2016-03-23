package com.whatsapp;

import android.os.AsyncTask;

class adw extends AsyncTask {
    final awb a;
    final ak4 b;
    final l5 c;

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((String) obj);
    }

    protected String a(Void[] voidArr) {
        return qm.b(this.c.p);
    }

    adw(awb com_whatsapp_awb, l5 l5Var, ak4 com_whatsapp_ak4) {
        this.a = com_whatsapp_awb;
        this.c = l5Var;
        this.b = com_whatsapp_ak4;
    }

    protected void a(String str) {
        if (this.b.a.getTag().equals(this.c.p)) {
            this.b.a.setText(str);
        }
    }
}
