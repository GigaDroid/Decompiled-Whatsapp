package com.whatsapp;

import android.os.PowerManager.WakeLock;
import com.whatsapp.util.Log;
import java.io.File;
import org.v;
import org.whispersystems.at;

class lw implements Runnable {
    private static final String[] z;
    final AlarmService a;
    final WakeLock b;

    static {
        String[] strArr = new String[2];
        String str = "Wy\u0019T\fAe#F\nUg\u0019QM";
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
                        i3 = 52;
                        break;
                    case at.g /*1*/:
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = 124;
                        break;
                    case at.o /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 98;
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
                    str = "\u00148\\";
                    obj = null;
            }
        }
    }

    lw(AlarmService alarmService, WakeLock wakeLock) {
        this.a = alarmService;
        this.b = wakeLock;
    }

    public void run() {
        int i = 0;
        boolean z = DialogToastActivity.f;
        try {
            AlarmService.b(this.a);
            File[] listFiles = dg.b().listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                while (i < length) {
                    File file = listFiles[i];
                    Log.i(z[0] + file.getName() + ":" + System.currentTimeMillis() + z[1] + file.lastModified());
                    if (System.currentTimeMillis() - file.lastModified() > 86400000) {
                        file.delete();
                    }
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
            this.b.release();
        } catch (Throwable th) {
            this.b.release();
        }
    }
}
