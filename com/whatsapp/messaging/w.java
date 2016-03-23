package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.protocol.by;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class w extends Handler implements aa {
    private static final String z;
    final v a;

    static {
        char[] toCharArray = "QAcm\u001b^^ziQ[\u0003axW_\u0003prZGIpiQM".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 41;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 19;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public w(v vVar) {
        this.a = vVar;
        super(vVar.getLooper());
    }

    public void a(Message message) {
        message.what = 2;
        sendMessage(message);
    }

    public void a() {
        sendEmptyMessage(1);
    }

    public void handleMessage(Message message) {
        int i = co.a;
        switch (message.what) {
            case v.m /*0*/:
                Log.i(z);
                v.a(this.a, (by) message.obj);
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
        v.b(this.a);
        if (i == 0) {
            return;
        }
        v.a(this.a, message);
    }

    public void a(by byVar) {
        obtainMessage(0, byVar).sendToTarget();
    }
}
