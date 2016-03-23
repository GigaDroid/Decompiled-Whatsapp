package de.greenrobot.event.util;

import android.os.Bundle;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public abstract class g {
    public static boolean b;
    private static final String[] z;
    protected final d a;

    static {
        String[] strArr = new String[10];
        String str = "\u0010\u0000\u001e\u0004A\u0011\u0000^\u0011\\\u0016\nDMV\u0002\u0000^\u0017Q\u0001\u0016\u001e\u0006A\u0006\nB\u0007Z\u0015\t_\u0004\u001d\u0000\fD\u000fV";
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
                        i3 = 116;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.i /*2*/:
                        i3 = 48;
                        break;
                    case at.o /*3*/:
                        i3 = 99;
                        break;
                    default:
                        i3 = 51;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0010\u0000\u001e\u0004A\u0011\u0000^\u0011\\\u0016\nDMV\u0002\u0000^\u0017Q\u0001\u0016\u001e\u0006A\u0006\nB\u0007Z\u0015\t_\u0004\u001d\u0011\u0013U\rG+\u0011I\u0013V+\n^<P\u0018\nC\u0006";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0010\u0000\u001e\u0004A\u0011\u0000^\u0011\\\u0016\nDMV\u0002\u0000^\u0017Q\u0001\u0016\u001e\u0006A\u0006\nB\u0007Z\u0015\t_\u0004\u001d\u0012\f^\n@\u001c:Q\u0005G\u0011\u0017o\u0007Z\u0015\t_\u0004";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0010\u0000\u001e\u0004A\u0011\u0000^\u0011\\\u0016\nDMV\u0002\u0000^\u0017Q\u0001\u0016\u001e\u0006A\u0006\nB\u0007Z\u0015\t_\u0004\u001d\u0000\fD\u000fV";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0010\u0000\u001e\u0004A\u0011\u0000^\u0011\\\u0016\nDMV\u0002\u0000^\u0017Q\u0001\u0016\u001e\u0006A\u0006\nB\u0007Z\u0015\t_\u0004\u001d\u001d\u0006_\rl\u001d\u0001";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0010\u0000\u001e\u0004A\u0011\u0000^\u0011\\\u0016\nDMV\u0002\u0000^\u0017Q\u0001\u0016\u001e\u0006A\u0006\nB\u0007Z\u0015\t_\u0004\u001d\u0019\u0000C\u0010R\u0013\u0000";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0010\u0000\u001e\u0004A\u0011\u0000^\u0011\\\u0016\nDMV\u0002\u0000^\u0017Q\u0001\u0016\u001e\u0006A\u0006\nB\u0007Z\u0015\t_\u0004\u001d\u0019\u0000C\u0010R\u0013\u0000";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0010\u0000\u001e\u0004A\u0011\u0000^\u0011\\\u0016\nDMV\u0002\u0000^\u0017Q\u0001\u0016\u001e\u0006A\u0006\nB\u0007Z\u0015\t_\u0004\u001d\u0012\f^\n@\u001c:Q\u0005G\u0011\u0017o\u0007Z\u0015\t_\u0004";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0010\u0000\u001e\u0004A\u0011\u0000^\u0011\\\u0016\nDMV\u0002\u0000^\u0017Q\u0001\u0016\u001e\u0006A\u0006\nB\u0007Z\u0015\t_\u0004\u001d\u001d\u0006_\rl\u001d\u0001";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0010\u0000\u001e\u0004A\u0011\u0000^\u0011\\\u0016\nDMV\u0002\u0000^\u0017Q\u0001\u0016\u001e\u0006A\u0006\nB\u0007Z\u0015\t_\u0004\u001d\u0011\u0013U\rG+\u0011I\u0013V+\n^<P\u0018\nC\u0006";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected abstract Object a(f fVar, Bundle bundle);

    protected String c(f fVar, Bundle bundle) {
        return this.a.i.getString(this.a.a(fVar.c));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Object a(de.greenrobot.event.util.f r5, boolean r6, android.os.Bundle r7) {
        /*
        r4 = this;
        r0 = r5.a();
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        r0 = 0;
    L_0x0007:
        return r0;
    L_0x0008:
        if (r7 == 0) goto L_0x0014;
    L_0x000a:
        r0 = r7.clone();
        r0 = (android.os.Bundle) r0;
        r1 = b;
        if (r1 == 0) goto L_0x0019;
    L_0x0014:
        r0 = new android.os.Bundle;
        r0.<init>();
    L_0x0019:
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r1 = r0.containsKey(r1);
        if (r1 != 0) goto L_0x0030;
    L_0x0024:
        r1 = r4.b(r5, r0);
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r0.putString(r2, r1);
    L_0x0030:
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r1 = r0.containsKey(r1);
        if (r1 != 0) goto L_0x0047;
    L_0x003b:
        r1 = r4.c(r5, r0);
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r0.putString(r2, r1);
    L_0x0047:
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r1 = r0.containsKey(r1);
        if (r1 != 0) goto L_0x005b;
    L_0x0053:
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0.putBoolean(r1, r6);
    L_0x005b:
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r1 = r0.containsKey(r1);
        if (r1 != 0) goto L_0x0078;
    L_0x0066:
        r1 = r4.a;
        r1 = r1.d;
        if (r1 == 0) goto L_0x0078;
    L_0x006c:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r2 = r4.a;
        r2 = r2.d;
        r0.putSerializable(r1, r2);
    L_0x0078:
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        r1 = r0.containsKey(r1);
        if (r1 != 0) goto L_0x0096;
    L_0x0084:
        r1 = r4.a;
        r1 = r1.e;
        if (r1 == 0) goto L_0x0096;
    L_0x008a:
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r2 = r4.a;
        r2 = r2.e;
        r0.putInt(r1, r2);
    L_0x0096:
        r0 = r4.a(r5, r0);
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.util.g.a(de.greenrobot.event.util.f, boolean, android.os.Bundle):java.lang.Object");
    }

    protected g(d dVar) {
        this.a = dVar;
    }

    protected String b(f fVar, Bundle bundle) {
        return this.a.i.getString(this.a.c);
    }
}
