package com.whatsapp.gdrive;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.whatsapp.util.Log;
import java.util.Locale;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class c4 {
    private static final String[] z;
    @Nullable
    final fs a;
    @Nullable
    final fs b;
    final long c;
    @Nullable
    final bc d;
    final long e;
    @Nullable
    final String f;
    @Nullable
    final b6 g;
    final boolean h;
    final boolean i;

    static {
        String[] strArr = new String[14];
        String str = "g;S\u0012AH,\nXG\u0006(B\u0014YG*I?UU=v\u0012XB=BG\u0011UxC\u0018WI6T\u001cF_\u001aQ\u000eQ`7\\\u0019QTb\u0015\u000e\u0014I.U\u000fCT1D\u0018xI;Q\u0011rO4UG\u0011DxY\u000epI/^\u0011[G<c\u0014NC\u0002U\u000f[\u001c}R]XG+D0[B1V\u0014QBb\u0015\u000e\u0014R7D\u001cXd9S\u0016AV\u000bY\u0007Q\u001cx\u0015\u0019";
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
                        i3 = 38;
                        break;
                    case at.g /*1*/:
                        i3 = 88;
                        break;
                    case at.i /*2*/:
                        i3 = 48;
                        break;
                    case at.o /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 52;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "I.U\u000fCT1D\u0018kJ7S\u001cXy>Y\u0011QU";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "O+o\u0019[Q6\\\u0012UB\u0007C\u0014NC\u0007J\u0018FI";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "R7D\u001cXy:Q\u001e_S(o\u000e]\\=";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "G;S\u0012AH,o\u0013UK=";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "A<B\u0014BCuQ\u001e@O.Y\tM\t;B\u0018UR=\u001d\u000fQU,_\u000fQ\u000b<Q\tU\u000b>B\u0012Y\u000b:E\u0013PJ=\u001f]";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "G;S\u0012AH,o\u0013UK=\u0010\u001eUH6_\t\u0014D=\u0010\u0013AJ4\u001e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "R7D\u001cXy:Q\u001e_S(o\u000e]\\=";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "I.U\u000fCT1D\u0018kJ7S\u001cXy>Y\u0011QU";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "G;S\u0012AH,o\u0013UK=";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "J9C\tkK7T\u0014RO=T";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "O+o\u0019[Q6\\\u0012UB\u0007C\u0014NC\u0007J\u0018FI";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "G;S\u0012AH,o\u0013UK=";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "J9C\tkK7T\u0014RO=T";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(z[5], this.f);
        bundle.putLong(z[4], this.e);
        bundle.putLong(z[1], this.c);
        bundle.putBoolean(z[2], this.h);
        bundle.putBoolean(z[3], this.i);
        return bundle;
    }

    public static c4 a(@NonNull Bundle bundle) {
        try {
            if (bundle.containsKey(z[13])) {
                c4 c4Var = new c4(bundle.getString(z[10]), null, null, null, null, bundle.getLong(z[11], -1), bundle.getLong(z[8], -1), bundle.getBoolean(z[9]), bundle.getBoolean(z[12]));
                Log.i(z[6] + c4Var);
                return c4Var;
            }
            throw new IllegalStateException(z[7]);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public c4(@Nullable String str, @Nullable fs fsVar, @Nullable fs fsVar2, @Nullable b6 b6Var, @Nullable bc bcVar, long j, long j2, boolean z, boolean z2) {
        this.f = str;
        this.b = fsVar;
        this.a = fsVar2;
        this.g = b6Var;
        this.d = bcVar;
        this.c = j;
        this.e = j2;
        this.h = z;
        this.i = z2;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, z[0], new Object[]{fn.a(this.f), this.b, this.a, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Long.valueOf(this.c), Long.valueOf(this.e)});
    }
}
