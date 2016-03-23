package com.google;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.v;
import org.whispersystems.at;

class dw {
    private static final Set a;
    private static final Map b;
    private static final Logger c;
    private static final String z;

    static ho b(int i) {
        if (!a.contains(Integer.valueOf(i))) {
            return null;
        }
        synchronized (b) {
            if (!b.containsKey(Integer.valueOf(i))) {
                a(i);
            }
        }
        return (ho) b.get(Integer.valueOf(i));
    }

    private static void a(int i) {
        IOException e;
        Throwable th;
        int i2 = e2.F;
        InputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(fz.class.getResourceAsStream(z + i));
            try {
                hw hwVar = new hw();
                hwVar.readExternal(objectInputStream);
                for (ho hoVar : hwVar.a()) {
                    b.put(Integer.valueOf(hoVar.L()), hoVar);
                    if (i2 != 0) {
                        break;
                    }
                }
                a(objectInputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    c.log(Level.WARNING, e.toString());
                    a(objectInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    a(objectInputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            objectInputStream = null;
            c.log(Level.WARNING, e.toString());
            a(objectInputStream);
        } catch (Throwable th3) {
            th = th3;
            objectInputStream = null;
            a(objectInputStream);
            throw th;
        }
    }

    static {
        char[] toCharArray = "'\ryb\u0000o\u0001yhCmA\u007f>\u0017fAfg@f\u000bxzBj\u000bd|\u0000l\u000fbn\u0000X\u0006yaJF\u001b{mJz/z{Jz\u0000w{JN\u0001dbN|\u001dF}@|\u0001I".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 8;
                    break;
                case at.g /*1*/:
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = 22;
                    break;
                case at.o /*3*/:
                    i2 = 15;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        c = Logger.getLogger(dw.class.getName());
        b = Collections.synchronizedMap(new HashMap());
        a = f5.a();
    }

    private dw() {
    }

    private static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                c.log(Level.WARNING, e.toString());
            }
        }
    }
}
