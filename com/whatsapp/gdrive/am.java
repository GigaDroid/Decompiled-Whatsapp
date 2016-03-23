package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.at;

class am implements Runnable {
    private static final String[] z;
    final List a;
    final GoogleDriveService b;
    final File c;
    final CountDownLatch d;
    final AtomicReference e;
    final boolean f;

    static {
        String[] strArr = new String[2];
        String str = "h\"\u0016\r?jk\u0017\u0001;y/\u0007\u0001fh#\u0010I/f*\u0001\u0017di)\u0016I<\u007f*\u000b\u0005-  \r\b,\"3\u0014\b&n\"I\u0014({.I\r:\"(\u0011\b% f";
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
                        i3 = 15;
                        break;
                    case at.g /*1*/:
                        i3 = 70;
                        break;
                    case at.i /*2*/:
                        i3 = 100;
                        break;
                    case at.o /*3*/:
                        i3 = 100;
                        break;
                    default:
                        i3 = 73;
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
                    str = "h\"\u0016\r?jk\u0017\u0001;y/\u0007\u0001fh#\u0010I/f*\u0001\u0017di)\u0016I<\u007f*\u000b\u0005-/ \r\b,Z6\b\u000b(k\u0016\u0005\u0010!//\u0017Dl|jD\u0002 c#-\u0000if5DA:#f\u0002\r%j\u0015\u0010\u0005=z5D\r:/c\u0017J";
                    obj = null;
            }
        }
    }

    public void run() {
        int i = 0;
        try {
            String b = fn.b(this.c.getAbsolutePath());
            if (b == null) {
                Log.e(z[0] + this.c);
                this.d.countDown();
                return;
            }
            fs c = GoogleDriveService.d(this.b).c(b);
            if (GoogleDriveService.g(this.b).a()) {
                i = GoogleDriveService.d(this.b).a(this.c.getAbsolutePath(), c);
                if (i != 3) {
                    try {
                        String str = z[1];
                        Object[] objArr = new Object[3];
                        objArr[0] = b;
                        objArr[1] = c != null ? c.g() : null;
                        objArr[2] = fn.d(i);
                        Log.i(String.format(str, objArr));
                        this.a.add(this.c);
                    } catch (ez e) {
                        throw e;
                    } catch (ez e2) {
                        throw e2;
                    }
                }
                GoogleDriveService.q(this.b).addAndGet(this.c.length());
                if (GoogleDriveService.g(this.b).a()) {
                    try {
                        if (GoogleDriveService.r() && this.f) {
                            GoogleDriveService.f(this.b).i(GoogleDriveService.q(this.b).get(), GoogleDriveService.k(this.b));
                        }
                        this.d.countDown();
                        return;
                    } catch (ez e22) {
                        throw e22;
                    } catch (ez e222) {
                        throw e222;
                    }
                } else {
                    this.d.countDown();
                    return;
                }
            }
            this.d.countDown();
        } catch (ez e2222) {
            this.e.set(e2222);
        } catch (Throwable th) {
            this.d.countDown();
        }
    }

    am(GoogleDriveService googleDriveService, File file, AtomicReference atomicReference, List list, boolean z, CountDownLatch countDownLatch) {
        this.b = googleDriveService;
        this.c = file;
        this.e = atomicReference;
        this.a = list;
        this.f = z;
        this.d = countDownLatch;
    }
}
