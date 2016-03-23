package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class akk extends AsyncTask {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "\n\u0011}\u0003[2\n|\u0010DB\u0016b\u0012J\u0019\u0006v".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case at.g /*1*/:
                    i2 = 99;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Void a(Void[] voidArr) {
        if (!isCancelled()) {
            c();
        }
        if (!isCancelled()) {
            b();
        }
        if (!(isCancelled() || App.B())) {
            a();
        }
        return null;
    }

    private void c() {
        ArrayList a = App.aK.a(GroupChatInfo.z(this.a).p, 12, new bh(this));
        if (!isCancelled()) {
            this.a.runOnUiThread(new rf(this, a));
        }
    }

    private void b() {
        this.a.runOnUiThread(new hk(this, App.aK.K(GroupChatInfo.z(this.a).p)));
    }

    private void a() {
        ArrayList H = App.aK.H(GroupChatInfo.q(this.a));
        if (!isCancelled()) {
            this.a.runOnUiThread(new a9d(this, H));
        }
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public void onPostExecute(Object obj) {
        a((Void) obj);
    }

    public void a(Void voidR) {
        GroupChatInfo.f(this.a).a(GroupChatInfo.m(this.a), GroupChatInfo.l(this.a), GroupChatInfo.o(this.a), GroupChatInfo.c(this.a));
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        if (this.a.findViewById(2131755756).getVisibility() == 0) {
            this.a.d();
        }
        Log.i(z);
        if (GroupChatInfo.j(this.a).c()) {
            GroupChatInfo.a(this.a, GroupChatInfo.f(this.a));
        }
    }

    akk(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
