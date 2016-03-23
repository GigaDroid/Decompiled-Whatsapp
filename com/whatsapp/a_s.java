package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import org.v;
import org.whispersystems.at;

class a_s extends Handler {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "73\u0014pI";
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
                        i3 = 82;
                        break;
                    case at.g /*1*/:
                        i3 = 67;
                        break;
                    case at.i /*2*/:
                        i3 = 123;
                        break;
                    case at.o /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "#1$w@&\"";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "#1\bvR!*\u0014}\u000e\"&\t`H!7:pU;,\u0015P@1+\u001e<G3*\u0017";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "73\u0014pI";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "#1$w@&\"";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a() {
        sendEmptyMessageDelayed(1, 2000);
    }

    public a_s() {
        super(Looper.getMainLooper());
    }

    public void b() {
        sendEmptyMessage(2);
    }

    public void handleMessage(Message message) {
        boolean z = DialogToastActivity.f;
        try {
            switch (message.what) {
                case at.g /*1*/:
                    removeMessages(1);
                    if (!hasMessages(2) || z) {
                        try {
                            synchronized (wn.l) {
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(wn.o()));
                                objectOutputStream.writeObject(wn.l);
                                objectOutputStream.close();
                                break;
                            }
                            wn.c(z[2], z[4], wn.e);
                            return;
                        } catch (Throwable e) {
                            Log.b(z[3], e);
                            if (!z) {
                                return;
                            }
                        }
                    }
                    return;
                    break;
                case at.i /*2*/:
                    break;
                default:
                    return;
            }
            removeMessages(1);
            removeMessages(2);
            synchronized (wn.l) {
                wn.o().delete();
            }
            wn.f(z[1], z[0]);
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }
}
