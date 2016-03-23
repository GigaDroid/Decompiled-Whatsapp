package com.whatsapp.gdrive;

import com.whatsapp.arj;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.at;

class ba implements Runnable {
    private static final String[] z;
    final GoogleDriveService a;
    final String b;
    final String c;
    final AtomicReference d;
    final File e;

    static {
        String[] strArr = new String[7];
        String str = "X:Yg\u001aZsXk\u001eI7HkC]?He\u0019OsMg\u0000Z~Mo\u0005S;O.\u0003Q~";
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
                        i3 = 63;
                        break;
                    case at.g /*1*/:
                        i3 = 94;
                        break;
                    case at.i /*2*/:
                        i3 = 43;
                        break;
                    case at.o /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "X:Yg\u001aZsXk\u001eI7HkC]?He\u0019OsMg\u0000Z~Mo\u0005S;O.\u0003Q~";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "X:Yg\u001aZsXk\u001eI7HkC]?He\u0019OsMg\u0000Z~Mo\u0005S;O.\u0003Q~";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "X:Yg\u001aZsXk\u001eI7HkC]?He\u0019OsMg\u0000Z~Mo\u0005S;O.\u0003Q~";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "X:Yg\u001aZsXk\u001eI7HkC]?He\u0019OsMg\u0000Z~Mo\u0005S;O.\u0003Q~";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "X:Yg\u001aZsXk\u001eI7HkCJ.Ga\r[qMg\u0000ZsEa\u0018\u00128D{\u0002[~";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "X:Yg\u001aZsXk\u001eI7HkC]?He\u0019OsMg\u0000Z";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        Throwable e;
        try {
            if (this.d.get() != null) {
                try {
                    GoogleDriveService.a(this.a, GoogleDriveService.h(this.a) & false);
                    GoogleDriveService.a(this.a).countDown();
                    if (GoogleDriveService.r()) {
                        Log.i(z[3] + this.e.getAbsolutePath());
                        return;
                    }
                    return;
                } catch (ei e2) {
                    throw e2;
                } catch (ei e22) {
                    throw e22;
                }
            }
            boolean a = GoogleDriveService.a(this.a, this.c, this.e, this.b, true);
            try {
                GoogleDriveService.a(this.a, GoogleDriveService.h(this.a) & a);
                GoogleDriveService.a(this.a).countDown();
                if (!a && GoogleDriveService.r()) {
                    Log.i(z[5] + this.e.getAbsolutePath());
                }
            } catch (ei e222) {
                throw e222;
            } catch (ei e2222) {
                throw e2222;
            }
        } catch (ei e3) {
            e = e3;
            Log.b(z[1], e);
            this.d.set(e);
            GoogleDriveService.a(this.a, GoogleDriveService.h(this.a) & false);
            GoogleDriveService.a(this.a).countDown();
            try {
                if (GoogleDriveService.r()) {
                    Log.i(z[4] + this.e.getAbsolutePath());
                }
            } catch (ei e22222) {
                throw e22222;
            }
        } catch (ea e4) {
            e = e4;
            Log.b(z[1], e);
            this.d.set(e);
            GoogleDriveService.a(this.a, GoogleDriveService.h(this.a) & false);
            GoogleDriveService.a(this.a).countDown();
            if (GoogleDriveService.r()) {
                Log.i(z[4] + this.e.getAbsolutePath());
            }
        } catch (e9 e5) {
            e = e5;
            Log.b(z[1], e);
            this.d.set(e);
            GoogleDriveService.a(this.a, GoogleDriveService.h(this.a) & false);
            GoogleDriveService.a(this.a).countDown();
            if (GoogleDriveService.r()) {
                Log.i(z[4] + this.e.getAbsolutePath());
            }
        } catch (ew e6) {
            e = e6;
            Log.b(z[1], e);
            this.d.set(e);
            GoogleDriveService.a(this.a, GoogleDriveService.h(this.a) & false);
            GoogleDriveService.a(this.a).countDown();
            if (GoogleDriveService.r()) {
                Log.i(z[4] + this.e.getAbsolutePath());
            }
        } catch (et e7) {
            e = e7;
            Log.b(z[1], e);
            this.d.set(e);
            GoogleDriveService.a(this.a, GoogleDriveService.h(this.a) & false);
            GoogleDriveService.a(this.a).countDown();
            if (GoogleDriveService.r()) {
                Log.i(z[4] + this.e.getAbsolutePath());
            }
        } catch (ez e8) {
            e = e8;
            Log.b(z[1], e);
            this.d.set(e);
            GoogleDriveService.a(this.a, GoogleDriveService.h(this.a) & false);
            GoogleDriveService.a(this.a).countDown();
            if (GoogleDriveService.r()) {
                Log.i(z[4] + this.e.getAbsolutePath());
            }
        } catch (FileNotFoundException e9) {
            Log.e(z[6] + this.e.getAbsolutePath());
            GoogleDriveService.a(this.a, GoogleDriveService.h(this.a) & false);
            GoogleDriveService.a(this.a).countDown();
            try {
                if (GoogleDriveService.r()) {
                    Log.i(z[0] + this.e.getAbsolutePath());
                }
            } catch (ei e222222) {
                throw e222222;
            }
        } catch (Throwable th) {
            try {
                GoogleDriveService.a(this.a, GoogleDriveService.h(this.a) & false);
                GoogleDriveService.a(this.a).countDown();
                if (GoogleDriveService.r()) {
                    Log.i(z[2] + this.e.getAbsolutePath());
                }
            } catch (ei e2222222) {
                throw e2222222;
            } catch (ei e22222222) {
                throw e22222222;
            }
        }
    }

    ba(GoogleDriveService googleDriveService, AtomicReference atomicReference, String str, File file, String str2) {
        this.a = googleDriveService;
        this.d = atomicReference;
        this.c = str;
        this.e = file;
        this.b = str2;
    }
}
