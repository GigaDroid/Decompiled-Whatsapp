package com.whatsapp.messaging;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.protocol.by;
import com.whatsapp.protocol.c3;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

@SuppressLint({"HandlerLeak"})
final class az extends Handler implements o {
    private static final String z;
    final ah a;

    static {
        char[] toCharArray = "nO\tUtuM\u0017K>uV\u0010J59P\u001cF-9Q\u001cK?\u007fL\u001ez8~C\u0017K>z}\u000b@:r[".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 22;
                    break;
                case at.g /*1*/:
                    i2 = 34;
                    break;
                case at.i /*2*/:
                    i2 = 121;
                    break;
                case at.o /*3*/:
                    i2 = 37;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(by byVar) {
        obtainMessage(1, byVar).sendToTarget();
    }

    public void a(c3 c3Var) {
        obtainMessage(2, c3Var).sendToTarget();
    }

    public void handleMessage(Message message) {
        int i = co.a;
        switch (message.what) {
            case v.m /*0*/:
                Log.i(z);
                ah.a(this.a, (aa) message.obj);
                if (i == 0) {
                    return;
                }
                break;
            case at.g /*1*/:
                break;
            case at.i /*2*/:
                break;
            default:
                return;
        }
        ah.a(this.a, (by) message.obj);
        if (i == 0) {
            return;
        }
        ah.a(this.a, (c3) message.obj);
    }

    public void a(aa aaVar) {
        obtainMessage(0, aaVar).sendToTarget();
    }

    public az(ah ahVar) {
        this.a = ahVar;
        super(ahVar.getLooper());
    }
}
