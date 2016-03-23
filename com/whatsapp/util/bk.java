package com.whatsapp.util;

import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class bk {
    private static final String[] z;
    private boolean a;
    private final Lock b;
    private File c;
    private final File d;

    static {
        String[] strArr = new String[12];
        String str = ".w!ck&b+*|06+&x ~<'94~0/|cu+&x7\u007f7$97s439%\u007f5&";
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 22;
                        break;
                    case at.i /*2*/:
                        i3 = 89;
                        break;
                    case at.o /*3*/:
                        i3 = 67;
                        break;
                    default:
                        i3 = 25;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "ct80|nr014&n00m0,";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "7d80qlu+&x7s-&t3r016%w0/|'6<;m&d7\"une-,k\"q<nj7w-&#";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ".w!ck&b+*|06+&x ~<'94~0/|cu+&x7\u007f7$97s439'\u007f+";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "7d80qlu+&x7s-&t3r016%w0/|'6-,m\"zt0m,d8$|y";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "ct80|nr0144d07|\"t5&#";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "7d80qlu+&x7s-&t3r016%w0/|'6";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "cp+&|ne-,k\"q<y";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "7d80qls43m:;-1x0~v,l7;6%4.s4,k:6";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "7d80qlr</|7st1| c+0p5sv,l7;6%4.s4,k:6";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "7d80qlu+&x7st7k\"e1n}*dv%x*z<'";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "7d80qlu+&x7s-&t3r016%w0/|'6;\"j&;=*ky";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File a() {
        /*
        r7 = this;
        r6 = 10;
        r2 = 0;
        r4 = com.whatsapp.util.Log.h;
        r7.f();
        r0 = new java.io.File;
        r1 = r7.c;
        r3 = java.util.UUID.randomUUID();
        r3 = r3.toString();
        r0.<init>(r1, r3);
        r1 = r2;
    L_0x0018:
        r3 = r1 + 1;
        if (r1 >= r6) goto L_0x0033;
    L_0x001c:
        r1 = r0.createNewFile();
        if (r1 != 0) goto L_0x0033;
    L_0x0022:
        r0 = new java.io.File;
        r1 = r7.c;
        r5 = java.util.UUID.randomUUID();
        r5 = r5.toString();
        r0.<init>(r1, r5);
        if (r4 == 0) goto L_0x0040;
    L_0x0033:
        if (r3 <= r6) goto L_0x003f;
    L_0x0035:
        r0 = new java.io.IOException;
        r1 = z;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x003f:
        return r0;
    L_0x0040:
        r1 = r3;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bk.a():java.io.File");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void f() {
        /*
        r6 = this;
        r5 = 10;
        monitor-enter(r6);
        r2 = com.whatsapp.util.Log.h;	 Catch:{ all -> 0x00fe }
        r6.c();	 Catch:{ all -> 0x00fe }
        r0 = r6.c;	 Catch:{ all -> 0x00fe }
        if (r0 == 0) goto L_0x0014;
    L_0x000c:
        r0 = r6.c;	 Catch:{ all -> 0x00fe }
        r0 = r0.exists();	 Catch:{ all -> 0x00fe }
        if (r0 != 0) goto L_0x0101;
    L_0x0014:
        r0 = 0;
        r1 = new java.io.File;	 Catch:{ all -> 0x00fe }
        r3 = r6.d;	 Catch:{ all -> 0x00fe }
        r4 = java.util.UUID.randomUUID();	 Catch:{ all -> 0x00fe }
        r4 = r4.toString();	 Catch:{ all -> 0x00fe }
        r1.<init>(r3, r4);	 Catch:{ all -> 0x00fe }
        r6.c = r1;	 Catch:{ all -> 0x00fe }
    L_0x0026:
        r1 = r0 + 1;
        if (r0 >= r5) goto L_0x0045;
    L_0x002a:
        r0 = r6.c;	 Catch:{ all -> 0x00fe }
        r0 = r0.mkdir();	 Catch:{ all -> 0x00fe }
        if (r0 != 0) goto L_0x0045;
    L_0x0032:
        r0 = new java.io.File;	 Catch:{ all -> 0x00fe }
        r3 = r6.d;	 Catch:{ all -> 0x00fe }
        r4 = java.util.UUID.randomUUID();	 Catch:{ all -> 0x00fe }
        r4 = r4.toString();	 Catch:{ all -> 0x00fe }
        r0.<init>(r3, r4);	 Catch:{ all -> 0x00fe }
        r6.c = r0;	 Catch:{ all -> 0x00fe }
        if (r2 == 0) goto L_0x0103;
    L_0x0045:
        if (r1 <= r5) goto L_0x0101;
    L_0x0047:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fe }
        r0.<init>();	 Catch:{ all -> 0x00fe }
        r1 = z;	 Catch:{ all -> 0x00fe }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r1 = r6.c;	 Catch:{ all -> 0x00fe }
        r1 = r1.toString();	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r0 = r0.toString();	 Catch:{ all -> 0x00fe }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x00fe }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fe }
        r0.<init>();	 Catch:{ all -> 0x00fe }
        r1 = z;	 Catch:{ all -> 0x00fe }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r2 = com.whatsapp.App.ba();	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r2);	 Catch:{ all -> 0x00fe }
        r1 = z;	 Catch:{ all -> 0x00fe }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r2 = com.whatsapp.App.T();	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r2);	 Catch:{ all -> 0x00fe }
        r0 = r0.toString();	 Catch:{ all -> 0x00fe }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x00fe }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fe }
        r0.<init>();	 Catch:{ all -> 0x00fe }
        r1 = z;	 Catch:{ all -> 0x00fe }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r1 = android.os.Environment.getExternalStorageState();	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r0 = r0.toString();	 Catch:{ all -> 0x00fe }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x00fe }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fe }
        r0.<init>();	 Catch:{ all -> 0x00fe }
        r1 = z;	 Catch:{ all -> 0x00fe }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r1 = r6.d;	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r1 = z;	 Catch:{ all -> 0x00fe }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r1 = r6.d;	 Catch:{ all -> 0x00fe }
        r1 = r1.exists();	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r1 = z;	 Catch:{ all -> 0x00fe }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r1 = r6.d;	 Catch:{ all -> 0x00fe }
        r1 = r1.canWrite();	 Catch:{ all -> 0x00fe }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00fe }
        r0 = r0.toString();	 Catch:{ all -> 0x00fe }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x00fe }
        r0 = new java.io.IOException;	 Catch:{ all -> 0x00fe }
        r1 = z;	 Catch:{ all -> 0x00fe }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ all -> 0x00fe }
        r0.<init>(r1);	 Catch:{ all -> 0x00fe }
        throw r0;	 Catch:{ all -> 0x00fe }
    L_0x00fe:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0101:
        monitor-exit(r6);
        return;
    L_0x0103:
        r0 = r1;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bk.f():void");
    }

    public bk(File file) {
        this.c = null;
        this.a = false;
        this.b = new ReentrantLock();
        this.d = file;
    }

    public File b() {
        c();
        return this.d;
    }

    public void d() {
        this.b.lock();
        if (!this.a) {
            this.b.unlock();
            bq.a(new c1(this));
            if (Log.h == 0) {
                return;
            }
        }
        this.b.unlock();
    }

    public static boolean a(File file) {
        int i = Log.h;
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i2 = 0;
                    while (i2 < length) {
                        if (a(listFiles[i2])) {
                            i2++;
                            if (i != 0) {
                                break;
                            }
                        }
                        return false;
                    }
                }
            } catch (OutOfMemoryError e) {
                Log.e(z[10] + file.getAbsolutePath());
                return false;
            }
        }
        return file.delete();
    }

    public void e() {
        int i = Log.h;
        if (this.d.exists()) {
            File[] listFiles;
            this.b.lock();
            this.a = true;
            File[] fileArr = new File[0];
            try {
                listFiles = this.d.listFiles();
            } catch (OutOfMemoryError e) {
                Log.e(z[9] + this.d.getAbsolutePath());
                listFiles = fileArr;
            } catch (Throwable th) {
                this.a = false;
                this.b.unlock();
            }
            if (listFiles != null) {
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file = listFiles[i2];
                    try {
                        if (!(this.c != null && file.getName().equals(this.c.getName()) && i == 0)) {
                            this.b.unlock();
                            a(file);
                            this.b.lock();
                        }
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    } catch (OutOfMemoryError e2) {
                        throw e2;
                    } catch (OutOfMemoryError e22) {
                        throw e22;
                    }
                }
            }
            this.a = false;
            this.b.unlock();
        }
    }

    private void c() {
        if (!this.d.exists()) {
            this.d.mkdirs();
            if (!this.d.exists() && !this.d.mkdir()) {
                Log.w(z[11]);
            }
        }
    }
}
