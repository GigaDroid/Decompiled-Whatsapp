package com.whatsapp.gdrive;

import android.os.ConditionVariable;
import com.whatsapp.a47;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import java.util.concurrent.atomic.AtomicBoolean;
import org.v;
import org.whispersystems.at;

class dw {
    private static final String z;
    final GoogleDriveService a;
    final AtomicBoolean b;
    final ConditionVariable c;

    static {
        char[] toCharArray = "CH\u0016<\u0019A\u0001\u00170\u001dRE\u00070@FM\u0007>\u001aT\u0001\t4\u001f\u000bA\u00172\u001cA^\u0012<\fA\u0001\u0007:\u0001JI\u0007!\n@\u0003".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 100;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onEventAsync(a47 com_whatsapp_a47) {
        Log.i(z + com_whatsapp_a47.a);
        if (com_whatsapp_a47.a) {
            this.b.set(true);
            this.c.open();
        }
    }

    dw(GoogleDriveService googleDriveService, AtomicBoolean atomicBoolean, ConditionVariable conditionVariable) {
        this.a = googleDriveService;
        this.b = atomicBoolean;
        this.c = conditionVariable;
        h.b().e(this);
    }
}
