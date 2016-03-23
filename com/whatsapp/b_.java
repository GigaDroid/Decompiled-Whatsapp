package com.whatsapp;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import org.v;
import org.whispersystems.at;
import org.whispersystems.bp;

public final class b_ {
    private static final String[] z;
    @Nullable
    public final bp a;
    @NonNull
    public final String b;
    @Nullable
    public final bp c;

    static {
        String[] strArr = new String[5];
        String str = "p\u001c},OQ\u001b :W@A=>S";
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
                        i3 = 48;
                        break;
                    case at.g /*1*/:
                        i3 = 111;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001cO<7Cy\u000b65SY\u001b*f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "q\u0017<7HD\u0003\u001a?B^\u001b:/^u\u001965SK\u0005:?\u001a\u0017";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u001cO=>Py\u000b65SY\u001b*f";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Y\u000104UB\n0/\u0007Z\u00067a\u0007";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[3] + this.b + '\'' + z[2] + this.c + z[4] + this.a + '}';
    }

    public b_(@NonNull String str, @Nullable bp bpVar, @Nullable bp bpVar2) {
        this.b = (String) auv.a((CharSequence) str);
        if (str.endsWith(z[0])) {
            this.c = bpVar;
            this.a = bpVar2;
            return;
        }
        throw new IllegalArgumentException(z[1] + str);
    }
}
