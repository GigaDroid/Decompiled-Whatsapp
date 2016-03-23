package com.whatsapp;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.whispersystems.at;

final class a2x extends Handler {
    a2x(Looper looper) {
        super(looper);
    }

    private void a(String str) {
        l5 b = App.as.b(str);
        if (b != null) {
            b.o();
        }
        App.u(str);
    }

    public void handleMessage(Message message) {
        String str;
        boolean z = DialogToastActivity.f;
        switch (message.what) {
            case at.g /*1*/:
                str = (String) message.obj;
                a(str);
                if (qm.i(str)) {
                    int i;
                    Context applicationContext = App.z().getApplicationContext();
                    Application z2 = App.z();
                    if (message.arg1 == 1) {
                        i = 2131231316;
                    } else {
                        i = 2131231317;
                    }
                    App.b(applicationContext, z2.getString(i), 0);
                    if (!z) {
                        return;
                    }
                }
                l5 e = App.as.e();
                if (e != null && str.equals(e.p)) {
                    App.b(App.z().getApplicationContext(), App.z().getString(message.arg1 == 1 ? 2131231713 : 2131231714), 0);
                }
                if (!z) {
                    return;
                }
                break;
            case at.i /*2*/:
                break;
            case at.o /*3*/:
                break;
            default:
                return;
        }
        str = (String) message.obj;
        a(str);
        App.d(str, message.arg1);
        App.b(App.z().getApplicationContext(), App.z().getString(qm.i(str) ? 2131231145 : 2131231147), 0);
        if (!z) {
            return;
        }
        str = (String) message.obj;
        a(str);
        App.d(str, message.arg1);
        App.b(App.z().getApplicationContext(), App.z().getString(2131231146), 0);
    }
}
