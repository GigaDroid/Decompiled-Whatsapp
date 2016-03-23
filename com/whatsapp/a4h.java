package com.whatsapp;

import android.database.Cursor;
import android.os.AsyncTask;
import android.support.v4.os.CancellationSignal;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a4h extends AsyncTask {
    private static final String z;
    private final String a;
    private CancellationSignal b;
    private Cursor c;
    private int d;
    final DocumentsGalleryFragment e;

    static {
        char[] toCharArray = "-v\u000e4Z,w\u00192P(u\u0001$E0\u007f\u001f P$|\u00035\u0018%v\f%~'[\f\"\\.k\u00024Y-9".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 73;
                    break;
                case at.g /*1*/:
                    i2 = 25;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case at.o /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    void a() {
        super.cancel(true);
        synchronized (this) {
            if (this.b != null) {
                this.b.cancel();
            }
        }
    }

    protected Void a(Void[] voidArr) {
        try {
            if (!isCancelled()) {
                synchronized (this) {
                    this.b = new CancellationSignal();
                }
                try {
                    this.c = App.aK.a(DocumentsGalleryFragment.f(this.e), this.a, this.b);
                    if (this.c != null) {
                        this.d = this.c.getCount();
                        Log.i(z + this.d);
                    }
                    synchronized (this) {
                        this.b = null;
                    }
                } catch (RuntimeException e) {
                    this.c.close();
                    this.c = null;
                    throw e;
                } catch (Throwable th) {
                    synchronized (this) {
                    }
                    this.b = null;
                }
            }
            return null;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected void a(Void voidR) {
        try {
            if (this.c != null) {
                this.e.a(this.c, this.a, this.d);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public a4h(DocumentsGalleryFragment documentsGalleryFragment, String str) {
        this.e = documentsGalleryFragment;
        this.a = str;
    }
}
