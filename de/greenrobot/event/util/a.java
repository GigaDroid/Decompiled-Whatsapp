package de.greenrobot.event.util;

import com.whatsapp.arj;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

public class a {
    private static final String z;
    public final Map a;

    static {
        char[] toCharArray = "HR\u0005Y\u0016c^LL\u000fe\u001dHO\u0015u\\BOFtXVY\tsOFOFOy\u0005L\tsSA\n\u0000iO\u0005".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 6;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 37;
                    break;
                case at.o /*3*/:
                    i2 = 42;
                    break;
                default:
                    i2 = arj.Theme_checkboxStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer a(java.lang.Throwable r4) {
        /*
        r3 = this;
        r0 = 20;
        r1 = r4;
    L_0x0003:
        r2 = r3.b(r1);
        if (r2 == 0) goto L_0x000b;
    L_0x0009:
        r0 = r2;
    L_0x000a:
        return r0;
    L_0x000b:
        r1 = r1.getCause();
        r0 = r0 + -1;
        if (r0 <= 0) goto L_0x0017;
    L_0x0013:
        if (r1 == r4) goto L_0x0017;
    L_0x0015:
        if (r1 != 0) goto L_0x0003;
    L_0x0017:
        r0 = de.greenrobot.event.h.q;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r1 = r1.append(r2);
        r1 = r1.append(r4);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
        r0 = 0;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.util.a.a(java.lang.Throwable):java.lang.Integer");
    }

    public a a(Class cls, int i) {
        this.a.put(cls, Integer.valueOf(i));
        return this;
    }

    protected Integer b(Throwable th) {
        boolean z = g.b;
        Class cls = th.getClass();
        Integer num = (Integer) this.a.get(cls);
        if (num != null) {
            return num;
        }
        Class cls2 = null;
        Integer num2 = num;
        for (Entry entry : this.a.entrySet()) {
            Integer num3;
            Class cls3;
            Class cls4 = (Class) entry.getKey();
            if (cls4.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(cls4))) {
                Class cls5 = cls4;
                num3 = (Integer) entry.getValue();
                cls3 = cls5;
            } else {
                cls3 = cls2;
                num3 = num2;
            }
            if (z) {
                return num3;
            }
            cls2 = cls3;
            num2 = num3;
        }
        return num2;
    }

    public a() {
        this.a = new HashMap();
    }
}
