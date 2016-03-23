package com.whatsapp.notification;

import android.content.Context;
import android.os.AsyncTask;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class m extends AsyncTask {
    private static final String z;
    final aw a;
    final boolean b;
    final Context c;

    static {
        char[] toCharArray = "A+[\nYH!I\u0015PB-\\\u0010ZE!I\rUC,\u0007\u0017SX+N\u0000_C,^\u001cN_#\\\u0010SB1D\u0010OXmM\u000bNC0".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 44;
                    break;
                case at.g /*1*/:
                    i2 = 66;
                    break;
                case at.i /*2*/:
                    i2 = 40;
                    break;
                case at.o /*3*/:
                    i2 = 121;
                    break;
                default:
                    i2 = 60;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Void a(Void[] voidArr) {
        this.a.a(this.c, this.b);
        return null;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Void voidR) {
        try {
            App app = App.p;
            App.a7();
        } catch (Throwable e) {
            Log.c(z, e);
        }
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    m(aw awVar, Context context, boolean z) {
        this.a = awVar;
        this.c = context;
        this.b = z;
    }
}
