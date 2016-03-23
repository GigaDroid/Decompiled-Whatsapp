package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;
import org.v;
import org.whispersystems.at;

class aub extends AsyncTask {
    private static final String z;
    Integer a;
    final SettingsAccount b;

    static {
        char[] toCharArray = "*!%Z`7#\"Oj:+$@}v".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 89;
                    break;
                case at.g /*1*/:
                    i2 = 68;
                    break;
                case at.i /*2*/:
                    i2 = 81;
                    break;
                case at.o /*3*/:
                    i2 = 46;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void a(Void voidR) {
        boolean z = DialogToastActivity.f;
        this.b.e();
        SettingsAccount.b(this.b);
        if (this.a != null) {
            if (this.a.intValue() == 405) {
                vh.a(this.b.getBaseContext(), false);
                App.b(this.b, 2131232157, 1);
                if (!z) {
                    return;
                }
            }
            App.a(this.b.getBaseContext(), 2131231557, 1);
            if (!z) {
                return;
            }
        }
        App.a(this.b.getBaseContext(), 2131232156, 1);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    aub(SettingsAccount settingsAccount) {
        this.b = settingsAccount;
    }

    protected Void a(Void[] voidArr) {
        Throwable e;
        try {
            App.a(true, new is(this));
        } catch (ExecutionException e2) {
            e = e2;
            Log.a(z, e);
            this.a = Integer.valueOf(-1);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            Log.a(z, e);
            this.a = Integer.valueOf(-1);
            return null;
        }
        return null;
    }
}
