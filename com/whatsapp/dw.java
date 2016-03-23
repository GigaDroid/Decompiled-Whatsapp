package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.format.DateUtils;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class dw extends Handler {
    private static final String z;
    final a9z a;
    long b;

    static {
        char[] toCharArray = "(t\n\u001dv0t\u0017\u001b<8r\u000f\u001b\u007f7v\n\n3".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 94;
                    break;
                case at.g /*1*/:
                    i2 = 27;
                    break;
                case at.i /*2*/:
                    i2 = 99;
                    break;
                case at.o /*3*/:
                    i2 = 126;
                    break;
                default:
                    i2 = 19;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void handleMessage(Message message) {
        if (a9z.i(this.a) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - a9z.k(this.a);
            a9z.e(this.a).setText(DateUtils.formatElapsedTime((long) ((int) (elapsedRealtime / 1000))));
            a9z.j(this.a).sendEmptyMessageDelayed(0, 50);
            if (a9z.b(this.a) == null && elapsedRealtime > 1000 && a9z.i(this.a).a().length() > 0) {
                Object mediaData = new MediaData();
                mediaData.autodownloadRetryEnabled = true;
                mediaData.file = a9z.i(this.a).a();
                co coVar = new co(a9z.f(this.a), (byte[]) null, mediaData);
                coVar.b = App.av();
                coVar.u = 1;
                coVar.c = (byte) 2;
                coVar.r = 1;
                coVar.A = mediaData.file.getName();
                coVar.z = 0;
                App.b(coVar, qa.d(a9z.f(this.a)));
                a9z.a(this.a, new ss(coVar));
                mediaData.uploader = a9z.b(this.a);
                a9z.b(this.a).d();
            }
            if (this.b + 1250 < System.currentTimeMillis() && a9z.f(this.a) != null) {
                this.b = System.currentTimeMillis();
                App.b(a9z.f(this.a), 1);
                if (a9z.i(this.a).a().length() > ((long) a59.e) * 1048576) {
                    Log.i(z + a9z.i(this.a).a().length());
                    this.a.b(true);
                }
            }
        }
    }

    dw(a9z com_whatsapp_a9z, Looper looper) {
        this.a = com_whatsapp_a9z;
        super(looper);
    }
}
