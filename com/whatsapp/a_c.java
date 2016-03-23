package com.whatsapp;

import android.database.Cursor;
import android.os.AsyncTask;
import android.support.v4.os.CancellationSignal;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a_c extends AsyncTask {
    private static final String z;
    private Cursor a;
    private final String b;
    private int c;
    private CancellationSignal d;
    final LinksGalleryFragment e;

    static {
        char[] toCharArray = "1Co\"J:Km%\\/Sg;X:Gd'MrFn(]\u0014DC(Z6Ms&L3N!".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 93;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    void a() {
        super.cancel(true);
        synchronized (this) {
            if (this.d != null) {
                this.d.cancel();
            }
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected Void a(Void[] voidArr) {
        try {
            if (!isCancelled()) {
                synchronized (this) {
                    this.d = new CancellationSignal();
                }
                try {
                    this.a = App.aK.c(LinksGalleryFragment.f(this.e), this.b, this.d);
                    if (this.a != null) {
                        this.c = this.a.getCount();
                        Log.i(z + this.c);
                    }
                    synchronized (this) {
                        this.d = null;
                    }
                } catch (RuntimeException e) {
                    this.a.close();
                    this.a = null;
                    throw e;
                } catch (Throwable th) {
                    synchronized (this) {
                    }
                    this.d = null;
                }
            }
            return null;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public a_c(LinksGalleryFragment linksGalleryFragment, String str) {
        this.e = linksGalleryFragment;
        this.b = str;
    }

    protected void a(Void voidR) {
        try {
            if (this.a != null) {
                this.e.a(this.a, this.b, this.c);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }
}
