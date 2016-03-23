package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class j extends AsyncTask {
    private static final String z;
    final ListChatInfo a;

    static {
        char[] toCharArray = "w\u000e\u0014B\nx\u000f\u0006B\nr\t\u0001Yzn\u0017\u0003W!~\u0003".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 27;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 54;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(Void voidR) {
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        if (this.a.findViewById(2131755756).getVisibility() == 0) {
            this.a.d();
        }
        if (ListChatInfo.b(this.a).c()) {
            ListChatInfo.a(this.a, ListChatInfo.c(this.a));
        }
        Log.i(z);
    }

    public Void a(Void[] voidArr) {
        if (!isCancelled()) {
            a();
        }
        if (!isCancelled()) {
            b();
        }
        return null;
    }

    public void onPostExecute(Object obj) {
        a((Void) obj);
    }

    j(ListChatInfo listChatInfo, az_ com_whatsapp_az_) {
        this(listChatInfo);
    }

    private void a() {
        ArrayList a = App.aK.a(ListChatInfo.f(this.a).p, 12, new ame(this));
        if (!isCancelled()) {
            this.a.runOnUiThread(new r9(this, a));
        }
    }

    private j(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    private void b() {
        this.a.runOnUiThread(new ad8(this, App.aK.K(ListChatInfo.f(this.a).p)));
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
