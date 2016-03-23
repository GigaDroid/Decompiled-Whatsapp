package com.whatsapp.accountsync;

import android.content.Context;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.a5a;
import com.whatsapp.arj;
import com.whatsapp.ce;
import com.whatsapp.tp;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class f implements Runnable {
    private static final String[] z;
    final Context a;

    static {
        String[] strArr = new String[2];
        String str = "T\u0002\f\u0002bV\n-\u001dcGD]\u0016xJ.\u0010&lG\f\u0019\u0016bQ\t\u001a";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 126;
                        break;
                    case at.o /*3*/:
                        i3 = 100;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "T\u0002\f\u0002bV\n\r\u001dcGH\u000e\u0001\u007fB\b\f\t~]\t\u001dK~O\u000e\u000e";
                    obj = null;
            }
        }
    }

    f(Context context) {
        this.a = context;
    }

    public void run() {
        int i = 0;
        int i2 = PerformSyncManager.c;
        ce a = tp.a(z[0]);
        a.e();
        synchronized (PerformSyncManager.b()) {
            PerformSyncManager.c().set(true);
        }
        do {
            synchronized (PerformSyncManager.b()) {
                boolean compareAndSet = PerformSyncManager.b().compareAndSet(true, false);
            }
            if (!compareAndSet) {
                if (i2 == 0) {
                    break;
                }
                WAAppCompatActivity.c++;
            }
            if (PerformSyncManager.a()) {
                PerformSyncManager.a(this.a);
                i++;
                if (i2 == 0) {
                    continue;
                }
            }
            Log.i(z[1]);
            continue;
        } while (i2 == 0);
        synchronized (PerformSyncManager.b()) {
            PerformSyncManager.c().set(false);
        }
        a.a(a5a.COUNT, i);
        a.d();
    }
}
