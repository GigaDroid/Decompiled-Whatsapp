package com.google;

import com.whatsapp.arj;
import java.io.IOException;
import java.io.InputStream;
import org.v;
import org.whispersystems.at;

public abstract class gH implements T {
    private static final h a;
    private static final String[] z;

    public fO a(byte[] bArr) {
        return a(bArr, a);
    }

    public fO a(byte[] bArr, h hVar) {
        return b(bArr, 0, bArr.length, hVar);
    }

    public fO a(byte[] bArr, int i, int i2, h hVar) {
        fO fOVar;
        try {
            ad a = ad.a(bArr, i, i2);
            fOVar = (fO) parsePartialFrom(a, hVar);
            a.e(0);
            return fOVar;
        } catch (fN e) {
            throw e.a(fOVar);
        } catch (Throwable e2) {
            throw new RuntimeException(z[0], e2);
        } catch (fN e3) {
            throw e3;
        }
    }

    private x a(fO fOVar) {
        try {
            return fOVar instanceof bs ? ((bs) fOVar).a() : new x(fOVar);
        } catch (x e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "4\tKth\b\u000b\nvs\t\u0001\nq!\u0004\u0015^u!\u0007\u001eXqxF\u0018Bbd\u0011LK~!/#ohb\u0003\u001c^yn\bL\u0002ci\t\u0019Ft!\b\t\\usF\u0004K`q\u0003\u0002\u0003>".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.i /*2*/:
                    i2 = 42;
                    break;
                case at.o /*3*/:
                    i2 = 16;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "4\tKth\b\u000b\nvs\t\u0001\nq!$\u0015^uR\u0012\u001eC~fF\u0018Bbd\u0011LK~!/#ohb\u0003\u001c^yn\bL\u0002ci\t\u0019Ft!\b\t\\usF\u0004K`q\u0003\u0002\u0003>".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            char c2 = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.i /*2*/:
                    i2 = 42;
                    break;
                case at.o /*3*/:
                    i2 = 16;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[length] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
        a = h.a();
    }

    public Object m439b(InputStream inputStream, h hVar) {
        return d(inputStream, hVar);
    }

    public fO a(InputStream inputStream, h hVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return b(new bX(inputStream, ad.a(read, inputStream)), hVar);
        } catch (IOException e) {
            throw new fN(e.getMessage());
        }
    }

    public Object m436a(byte[] bArr, h hVar) {
        return a(bArr, hVar);
    }

    public Object m438b(InputStream inputStream) {
        return a(inputStream);
    }

    public fO b(InputStream inputStream) {
        return d(inputStream, a);
    }

    private fO b(fO fOVar) {
        if (fOVar != null) {
            try {
                if (!fOVar.isInitialized()) {
                    throw a(fOVar).b().a(fOVar);
                }
            } catch (x e) {
                throw e;
            }
        }
        return fOVar;
    }

    public fO a(ad adVar, h hVar) {
        return b((fO) parsePartialFrom(adVar, hVar));
    }

    public Object m433a(InputStream inputStream) {
        return b(inputStream);
    }

    public fO b(hx hxVar, h hVar) {
        return b(a(hxVar, hVar));
    }

    public fO a(hx hxVar, h hVar) {
        fO fOVar;
        try {
            ad f = hxVar.f();
            fOVar = (fO) parsePartialFrom(f, hVar);
            f.e(0);
            return fOVar;
        } catch (fN e) {
            throw e.a(fOVar);
        } catch (Throwable e2) {
            throw new RuntimeException(z[1], e2);
        } catch (fN e3) {
            throw e3;
        }
    }

    public fO d(InputStream inputStream, h hVar) {
        return b(b(inputStream, hVar));
    }

    public Object m434a(InputStream inputStream, h hVar) {
        return c(inputStream, hVar);
    }

    public fO a(ad adVar) {
        return a(adVar, a);
    }

    public fO b(InputStream inputStream, h hVar) {
        ad a = ad.a(inputStream);
        fO fOVar = (fO) parsePartialFrom(a, hVar);
        try {
            a.e(0);
            return fOVar;
        } catch (fN e) {
            throw e.a(fOVar);
        }
    }

    public fO c(InputStream inputStream, h hVar) {
        return b(a(inputStream, hVar));
    }

    public fO a(hx hxVar) {
        return b(hxVar, a);
    }

    public Object m430a(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public Object m437b(hx hxVar, h hVar) {
        return b(hxVar, hVar);
    }

    public fO a(InputStream inputStream) {
        return c(inputStream, a);
    }

    public Object m431a(hx hxVar) {
        return a(hxVar);
    }

    public Object m432a(hx hxVar, h hVar) {
        return a(hxVar, hVar);
    }

    public fO b(byte[] bArr, int i, int i2, h hVar) {
        return b(a(bArr, i, i2, hVar));
    }

    public Object m429a(ad adVar) {
        return a(adVar);
    }

    public Object m435a(byte[] bArr) {
        return a(bArr);
    }
}
