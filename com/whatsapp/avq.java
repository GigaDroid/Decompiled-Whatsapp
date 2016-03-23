package com.whatsapp;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Debug;
import android.text.format.Formatter;
import com.whatsapp.memory.c;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class avq implements Runnable {
    private static final String[] z;
    final Context a;

    static {
        String[] strArr = new String[16];
        String str = "A\u001c";
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
                        i3 = 97;
                        break;
                    case at.g /*1*/:
                        i3 = 52;
                        break;
                    case at.i /*2*/:
                        i3 = 46;
                        break;
                    case at.o /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 93;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "A_l";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0005QX%>\u0004\u001bC)0\u000eFWc.\u0018GZ)0NUX-4\rUL 8A";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "A_lc<\rXA/<\u0015QJl";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "A_lc;\u0013QKl";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "A_lc<\rXA/<\u0015QJl";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0005QX%>\u0004\u001bC)0\u000eFWc9\u0000XX%6NGG68A";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0005QX%>\u0004\u001bC)0\u000eFWc3\u0000@G:8NGG68A";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\r[Y\u00018\f[\\5`";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "H\u0014";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "A_llu\u001f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "Ayle";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "A_lc;\u0013QKl";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "A_l";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0000WZ%+\b@W";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0005QX%>\u0004\u001bC)0\u000eFWc0\u0000L\u000e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService(z[15]);
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        Log.i(z[3] + Formatter.formatFileSize(this.a, memoryInfo.availMem) + z[0] + Formatter.formatFileSize(this.a, memoryInfo.threshold) + z[10] + z[9] + memoryInfo.lowMemory);
        long freeMemory = Runtime.getRuntime().freeMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        long j = totalMemory - freeMemory;
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        long j2 = nativeHeapFreeSize + nativeHeapAllocatedSize;
        long maxMemory = Runtime.getRuntime().maxMemory();
        StringBuilder append = new StringBuilder().append(z[1]);
        Log.i(append.append(maxMemory / 1024).append(z[11]).append(c.a()).append(z[12]).toString());
        Log.i(z[8] + (j2 / 1024) + z[6] + (nativeHeapAllocatedSize / 1024) + z[5] + (nativeHeapFreeSize / 1024) + z[14]);
        Log.i(z[7] + (totalMemory / 1024) + z[4] + (j / 1024) + z[13] + (freeMemory / 1024) + z[2]);
    }

    avq(Context context) {
        this.a = context;
    }
}
