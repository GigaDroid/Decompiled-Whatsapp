package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class fl extends AsyncTask {
    private static final String z;
    final Main a;

    static {
        char[] toCharArray = "alcC\u000fkb~Baoyc[Ixt".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 12;
                    break;
                case at.g /*1*/:
                    i2 = 13;
                    break;
                case at.i /*2*/:
                    i2 = 10;
                    break;
                case at.o /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onPreExecute() {
        if (!this.a.isFinishing()) {
            this.a.showDialog(arj.Theme_editTextStyle);
        }
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected Void a(Void[] voidArr) {
        boolean z = DialogToastActivity.f;
        int i = 0;
        while (qm.d && i < 45000) {
            try {
                i += 200;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    if (z) {
                        break;
                    }
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        }
        if (i >= 45000) {
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

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public fl(Main main) {
        this.a = main;
    }

    protected void a(Void voidR) {
        this.a.removeDialog(arj.Theme_editTextStyle);
        Log.e(z);
        Main.a(this.a);
    }
}
