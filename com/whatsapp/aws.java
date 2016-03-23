package com.whatsapp;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import org.v;
import org.whispersystems.at;

final class aws extends Handler {
    private static final String z;
    private final WeakReference a;

    static {
        char[] toCharArray = "a$ZMUn,[C@c.ZA[r-XAA85AIVx4\\".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 40;
                    break;
                case at.o /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private aws(@NonNull Looper looper, WeakReference weakReference) {
        super((Looper) auv.a((Object) looper));
        this.a = weakReference;
    }

    aws(Looper looper, WeakReference weakReference, kw kwVar) {
        this(looper, weakReference);
    }

    private boolean a(Activity activity) {
        if (VERSION.SDK_INT >= 17) {
            return activity.isDestroyed();
        }
        return activity.isFinishing();
    }

    public void handleMessage(Message message) {
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            removeMessages(1);
            return;
        }
        switch (message.what) {
            case at.g /*1*/:
                Log.e(z);
                removeMessages(1);
                if (!a(activity)) {
                    activity.showDialog(200);
                }
            default:
        }
    }
}
