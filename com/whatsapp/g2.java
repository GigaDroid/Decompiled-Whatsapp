package com.whatsapp;

import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import org.v;
import org.whispersystems.at;

final class g2 {
    private static final String[] z;
    final int a;
    final ConditionVariable b;
    final ConditionVariable c;
    final int d;

    static {
        String[] strArr = new String[2];
        String str = "\u0006KI<S\nKI<X\u0002U]<Z\u0015dT`L\u0014\u001bP}_\u0002IKf[\u0013^]";
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
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 59;
                        break;
                    case at.i /*2*/:
                        i3 = 57;
                        break;
                    case at.o /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 43;
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
                    str = "\u0006KI<S\nKI<X\u0002U]<Z\u0015dT`L\u0014\u001bXdJ\u000eO\u0019gB\n^Vf_G";
                    obj = null;
            }
        }
    }

    public void b() {
        boolean z = DialogToastActivity.f;
        try {
            if (this.b != null) {
                this.b.block(180000);
            }
            try {
                if (this.c != null && 1 == this.a) {
                    this.c.block(180000);
                }
                try {
                    if (3 == this.a) {
                        App.C().lock();
                        while (App.ab().get() < this.d) {
                            try {
                                if (!App.am().await(8, TimeUnit.SECONDS)) {
                                    Log.e(z[1] + App.ab().get() + ' ' + this.d);
                                    if (!z) {
                                        return;
                                    }
                                }
                            } catch (InterruptedException e) {
                                Log.e(z[0]);
                                return;
                            }
                        }
                    }
                } catch (InterruptedException e2) {
                    throw e2;
                }
            } catch (InterruptedException e22) {
                throw e22;
            } catch (InterruptedException e222) {
                throw e222;
            }
        } catch (InterruptedException e2222) {
            throw e2222;
        }
    }

    g2(ConditionVariable conditionVariable, ConditionVariable conditionVariable2, int i, int i2) {
        this.b = conditionVariable;
        this.c = conditionVariable2;
        this.a = i;
        this.d = i2;
    }

    public void a() {
        if (this.c != null && this.a == 0) {
            this.c.open();
        }
        if (3 == this.a) {
            App.ab().getAndIncrement();
            if (App.C().isHeldByCurrentThread()) {
                App.am().signalAll();
                App.C().unlock();
            }
        }
    }
}
