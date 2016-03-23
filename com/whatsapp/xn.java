package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.co;

class xn extends AsyncTask {
    final co a;
    final adn b;

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    xn(adn com_whatsapp_adn, co coVar) {
        this.b = com_whatsapp_adn;
        this.a = coVar;
    }

    protected void a(byte[] bArr) {
        boolean z;
        ((MediaData) this.a.Q).transferring = false;
        this.a.u = 1;
        this.a.a(bArr);
        ael com_whatsapp_ael = App.aK;
        co coVar = this.a;
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        com_whatsapp_ael.a(coVar, z, -1);
    }

    protected void onPostExecute(Object obj) {
        a((byte[]) obj);
    }

    protected byte[] a(Void[] voidArr) {
        return xo.a(this.a.m, this.a.l);
    }
}
