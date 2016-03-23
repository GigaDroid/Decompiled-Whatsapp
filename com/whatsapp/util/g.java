package com.whatsapp.util;

import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

public class g {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "x+8\u0010\f";
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
                        i3 = 88;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 116;
                        break;
                    default:
                        i3 = 49;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "++0\u0000Te";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "x\u007fqTP,\u007f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static void a(Thread thread, StackTraceElement[] stackTraceElementArr, StringBuilder stringBuilder) {
        int i = 0;
        int i2 = Log.h;
        stringBuilder.append(z[2]).append(thread.getState()).append(z[0]).append(thread.getId()).append('\n');
        stringBuilder.append(Log.i()).append('\n');
        int length = stackTraceElementArr.length;
        while (i < length) {
            stringBuilder.append(z[1]).append(stackTraceElementArr[i].toString()).append('\n');
            i++;
            if (i2 != 0) {
                break;
            }
        }
        stringBuilder.append(Log.e()).append('\n');
    }

    public static String a() {
        int i = Log.h;
        Map allStackTraces = Thread.getAllStackTraces();
        StringBuilder stringBuilder = new StringBuilder("\n");
        for (Entry entry : allStackTraces.entrySet()) {
            a((Thread) entry.getKey(), (StackTraceElement[]) entry.getValue(), stringBuilder);
            if (i != 0) {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
