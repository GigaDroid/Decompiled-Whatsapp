package com.whatsapp.memory.dump;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.at;

public class k {
    static final Pattern a;
    private final Context b;

    File[] a(String str) {
        return new File(str).listFiles(new o(this));
    }

    String b() {
        return this.b.getCacheDir().getPath();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(java.io.File r8, java.io.File r9) {
        /*
        r7 = this;
        r0 = com.whatsapp.memory.dump.n.a;
        r1 = new java.io.FileInputStream;
        r1.<init>(r8);
        r2 = new java.io.FileOutputStream;	 Catch:{ all -> 0x003f }
        r2.<init>(r9);	 Catch:{ all -> 0x003f }
        r3 = new java.util.zip.GZIPOutputStream;	 Catch:{ all -> 0x003a }
        r3.<init>(r2);	 Catch:{ all -> 0x003a }
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r4 = new byte[r4];	 Catch:{ all -> 0x0035 }
    L_0x0015:
        r5 = r1.read(r4);	 Catch:{ all -> 0x0035 }
        r6 = -1;
        if (r5 == r6) goto L_0x0028;
    L_0x001c:
        r6 = 0;
        r3.write(r4, r6, r5);	 Catch:{ all -> 0x0035 }
        if (r0 == 0) goto L_0x0015;
    L_0x0022:
        r0 = com.whatsapp.WAAppCompatActivity.c;	 Catch:{ all -> 0x0035 }
        r0 = r0 + 1;
        com.whatsapp.WAAppCompatActivity.c = r0;	 Catch:{ all -> 0x0035 }
    L_0x0028:
        r3.flush();	 Catch:{ all -> 0x0035 }
        r3.close();	 Catch:{ all -> 0x003a }
        r2.close();	 Catch:{ all -> 0x003f }
        r1.close();
        return;
    L_0x0035:
        r0 = move-exception;
        r3.close();	 Catch:{ all -> 0x003a }
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x003f }
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        r1.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.memory.dump.k.a(java.io.File, java.io.File):void");
    }

    static {
        char[] toCharArray = "$0\u0010b3n-\r`\u0000&kW".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 64;
                    break;
                case at.g /*1*/:
                    i2 = 69;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 18;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        a = Pattern.compile(new String(cArr).intern());
    }

    public k(Context context) {
        this.b = context.getApplicationContext();
    }

    boolean a() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        StatFs statFs = new StatFs(b());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) > maxMemory * 3;
    }
}
