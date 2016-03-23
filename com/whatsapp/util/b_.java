package com.whatsapp.util;

import android.os.Process;
import com.whatsapp.App;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.v;
import org.whispersystems.at;

public class b_ {
    private static final String[] z;
    private final ThreadPoolExecutor a;
    private final Map b;
    private final Map c;
    private final BlockingQueue d;
    private final Map e;
    private final AtomicBoolean f;

    static {
        String[] strArr = new String[6];
        String str = "w~";
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
                        i3 = 94;
                        break;
                    case at.g /*1*/:
                        i3 = 94;
                        break;
                    case at.i /*2*/:
                        i3 = 70;
                        break;
                    case at.o /*3*/:
                        i3 = 81;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\t6'%T\u001f.6\u0006H,5##T~/34R;~10N*~xq\u0012~3/?T";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "3-";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "/+#$B:~20T5df";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ",+(?N09f%F-5|q\u000f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "3-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public synchronized void a(Runnable runnable) {
        this.b.put(runnable, Long.valueOf(a()));
        Runnable runnable2 = (Runnable) this.d.peek();
        if (runnable2 != null) {
            Long l = (Long) this.b.get(runnable2);
            if (l != null && a() - l.longValue() > 300000) {
                b();
            }
        }
    }

    public synchronized void b(Runnable runnable) {
        if (this.e.containsKey(runnable)) {
            this.e.remove(runnable);
            this.c.remove(runnable);
        }
    }

    private static long a() {
        return Process.getElapsedCpuTime();
    }

    public b_(ThreadPoolExecutor threadPoolExecutor, BlockingQueue blockingQueue) {
        this.f = new AtomicBoolean();
        this.b = new WeakHashMap();
        this.e = new WeakHashMap();
        this.c = new WeakHashMap();
        this.a = threadPoolExecutor;
        this.d = blockingQueue;
    }

    private synchronized void b() {
        if (this.f.compareAndSet(false, true)) {
            StringBuilder append = new StringBuilder(Log.i()).append("\n");
            append.append(this.a.toString()).append("\n");
            for (Runnable runnable : this.e.keySet()) {
                append.append(z[5]).append((String) this.c.get(runnable)).append(z[0]).append(runnable.getClass().getName()).append(" ").append(a() - ((Long) this.e.get(runnable)).longValue()).append(z[3]).append('\n');
            }
            for (Runnable runnable2 : this.d) {
                append.append(z[4]).append(runnable2.getClass().getName()).append(" ");
                if (this.b.containsKey(runnable2)) {
                    append.append(a() - ((Long) this.b.get(runnable2)).longValue()).append(z[1]);
                }
                append.append('\n');
            }
            append.append(Log.e());
            Log.i(append.toString());
            App.a(z[2], false, null);
        }
    }

    public synchronized void a(Thread thread, Runnable runnable) {
        if (!this.b.containsKey(runnable)) {
            this.b.remove(runnable);
        }
        this.e.put(runnable, Long.valueOf(a()));
        this.c.put(runnable, thread.getName());
    }
}
