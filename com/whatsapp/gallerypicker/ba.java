package com.whatsapp.gallerypicker;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v4.util.LruCache;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class ba {
    @SuppressLint({"NewApi"})
    private static LruCache b;
    private static final String[] z;
    private final ArrayList a;
    private Handler c;
    private boolean d;
    private Thread e;
    private ContentResolver f;

    public static void c() {
        b.trimToSize(-1);
    }

    private void d() {
        if (this.e == null) {
            this.d = false;
            Thread thread = new Thread(new bb(this, null));
            thread.setName(z[1]);
            this.e = thread;
            thread.start();
        }
    }

    static Handler a(ba baVar) {
        return baVar.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.whatsapp.gallerypicker.b7 r7) {
        /*
        r6 = this;
        r1 = 0;
        r4 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r7 != 0) goto L_0x0007;
    L_0x0005:
        r0 = r1;
    L_0x0006:
        return r0;
    L_0x0007:
        r5 = r6.a;
        monitor-enter(r5);
        r3 = -1;
        r2 = r1;
    L_0x000c:
        r0 = r6.a;	 Catch:{ all -> 0x0031 }
        r0 = r0.size();	 Catch:{ all -> 0x0031 }
        if (r2 >= r0) goto L_0x003d;
    L_0x0014:
        r0 = r6.a;	 Catch:{ all -> 0x0031 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x0031 }
        r0 = (com.whatsapp.gallerypicker.a4) r0;	 Catch:{ all -> 0x0031 }
        r0 = r0.b;	 Catch:{ all -> 0x0031 }
        if (r0 != r7) goto L_0x003b;
    L_0x0020:
        if (r4 == 0) goto L_0x0039;
    L_0x0022:
        r0 = r2;
    L_0x0023:
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x0037;
    L_0x0027:
        if (r0 < 0) goto L_0x0034;
    L_0x0029:
        r1 = r6.a;	 Catch:{ all -> 0x0031 }
        r1.remove(r0);	 Catch:{ all -> 0x0031 }
        r0 = 1;
        monitor-exit(r5);	 Catch:{ all -> 0x0031 }
        goto L_0x0006;
    L_0x0031:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0031 }
        throw r0;
    L_0x0034:
        monitor-exit(r5);	 Catch:{ all -> 0x0031 }
        r0 = r1;
        goto L_0x0006;
    L_0x0037:
        r3 = r0;
        goto L_0x000c;
    L_0x0039:
        r0 = r2;
        goto L_0x0027;
    L_0x003b:
        r0 = r3;
        goto L_0x0023;
    L_0x003d:
        r0 = r3;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ba.a(com.whatsapp.gallerypicker.b7):boolean");
    }

    static LruCache a() {
        return b;
    }

    static ArrayList c(ba baVar) {
        return baVar.a;
    }

    public void b() {
        synchronized (this.a) {
            this.d = true;
            this.a.notifyAll();
        }
        if (this.e != null) {
            try {
                Thread thread = this.e;
                m.a().a(thread, this.f);
                thread.join();
                this.e = null;
            } catch (InterruptedException e) {
            }
        }
    }

    static boolean b(ba baVar) {
        return baVar.d;
    }

    public ba(ContentResolver contentResolver, Handler handler) {
        this.a = new ArrayList();
        this.f = contentResolver;
        this.c = handler;
        d();
        Log.i(z[0] + b.maxSize());
    }

    static {
        String[] strArr = new String[2];
        String str = "t\\[\u001c5q^[\u001f5o\u001eY\u001a3uTI\u0012*x\u000b";
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
                        i3 = 29;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 80;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new br((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8));
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "t\\[\u001c50]U\u001a4xC";
                    obj = null;
            }
        }
    }

    public static void a(String str) {
        b.remove(str);
    }

    public void a(b7 b7Var, a8 a8Var) {
        if (this.e == null) {
            d();
        }
        Bitmap bitmap = null;
        if (b7Var.a() != null) {
            bitmap = (Bitmap) b.get(b7Var.a());
        }
        if (bitmap != null) {
            a8Var.a(bitmap, true);
            if (MediaGalleryFragmentBase.e == 0) {
                return;
            }
        }
        a8Var.a();
        synchronized (this.a) {
            this.a.add(new a4(b7Var, a8Var));
            this.a.notifyAll();
        }
    }
}
