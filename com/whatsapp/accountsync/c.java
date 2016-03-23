package com.whatsapp.accountsync;

import android.os.AsyncTask;
import com.whatsapp.arj;
import com.whatsapp.qm;

public class c extends AsyncTask {
    final ProfileActivity a;

    protected Void a(Void[] voidArr) {
        int i = PerformSyncManager.c;
        int i2 = 0;
        while (qm.d && i2 < 45000) {
            try {
                i2 += 200;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    if (i != 0) {
                        break;
                    }
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        }
        if (i2 >= 45000) {
            try {
                if (qm.d) {
                    qm.b();
                }
            } catch (InterruptedException e22) {
                throw e22;
            }
        }
        return null;
    }

    protected void onPreExecute() {
        if (!this.a.isFinishing()) {
            this.a.showDialog(arj.Theme_editTextStyle);
        }
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    public c(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Void voidR) {
        this.a.removeDialog(arj.Theme_editTextStyle);
        ProfileActivity.a(this.a);
    }
}
