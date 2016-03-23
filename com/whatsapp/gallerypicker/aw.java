package com.whatsapp.gallerypicker;

import com.whatsapp.aqu;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.v;
import org.whispersystems.at;

public class aw {
    private static SimpleDateFormat a;
    private static final String[] z;
    private a7 b;
    private a7 c;
    private Calendar d;
    private a7 e;

    static {
        String[] strArr = new String[2];
        String str = "^\n.7";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 19;
                        break;
                    case at.g /*1*/:
                        i4 = 71;
                        break;
                    case at.i /*2*/:
                        i4 = 99;
                        break;
                    case at.o /*3*/:
                        i4 = 122;
                        break;
                    default:
                        i4 = 74;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    try {
                        a = new SimpleDateFormat(z[1], aqu.f());
                        return;
                    } catch (IllegalArgumentException e) {
                        a = new SimpleDateFormat(z[0], aqu.f());
                        return;
                    }
                default:
                    strArr2[i2] = str;
                    str = "_\u000b/6";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    public a7 a(long j) {
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(new Date(j));
            if (instance.after(this.b)) {
                return this.b;
            }
            try {
                if (instance.after(this.e)) {
                    return this.e;
                }
                try {
                    if (instance.after(this.c)) {
                        return this.c;
                    }
                    try {
                        return instance.after(this.d) ? new a7(4, new GregorianCalendar(instance.get(1), instance.get(2), 1)) : new a7(5, new GregorianCalendar(instance.get(1), 1, 1));
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    static SimpleDateFormat a() {
        return a;
    }

    public aw() {
        this.b = new a7(1, Calendar.getInstance());
        this.b.add(6, -2);
        this.e = new a7(2, Calendar.getInstance());
        this.e.add(6, -7);
        this.c = new a7(3, Calendar.getInstance());
        this.c.add(6, -28);
        this.d = Calendar.getInstance();
        this.d.add(6, -366);
    }
}
