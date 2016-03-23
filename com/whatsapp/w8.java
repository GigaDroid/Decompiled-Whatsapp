package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.co;
import java.util.ArrayList;
import java.util.Iterator;

class w8 extends AsyncTask {
    final u1 a;
    final adn b;

    protected void a(ArrayList arrayList) {
        boolean z = DialogToastActivity.f;
        int az = App.az();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            co coVar = (co) it.next();
            if (App.p(coVar) && App.a(az, coVar)) {
                this.a.a(coVar);
                continue;
            }
            if (z) {
                return;
            }
        }
    }

    protected void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    w8(adn com_whatsapp_adn, u1 u1Var) {
        this.b = com_whatsapp_adn;
        this.a = u1Var;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected ArrayList a(Void[] voidArr) {
        return App.aK.b(System.currentTimeMillis() - 86400000, 32);
    }
}
