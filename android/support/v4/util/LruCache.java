package android.support.v4.util;

import android.support.v4.app.FragmentActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

public class LruCache {
    public static boolean a;
    private static final String[] z;
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    static {
        String[] strArr = new String[7];
        String str = "6\u0017\u001cle\u0011\u0004\u001e-b\u0011\b\u001e71";
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
                        i3 = 120;
                        break;
                    case at.g /*1*/:
                        i3 = 114;
                        break;
                    case at.i /*2*/:
                        i3 = 123;
                        break;
                    case at.o /*3*/:
                        i3 = 13;
                        break;
                    default:
                        i3 = 17;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0013\u0017\u0002-,ER\u0015x}\u0014";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "4\u0000\u000eNp\u001b\u001a\u001eV|\u0019\n(dk\u001dO^i=\u0010\u001b\u000f~,]\u0016W`x\u000b\u0001\u001e~,]\u0016Wex\f \u001aytEW\u001f(4%";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0013\u0017\u0002-,ER\u0015x}\u0014R\u0007q1\u000e\u0013\u0017xtXOF-\u007f\r\u001e\u0017";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0013\u0017\u0002-,ER\u0015x}\u0014";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "V\u0001\u0012wt7\u0014S$1\u0011\u0001[\u007ft\b\u001d\tyx\u0016\u0015[d\u007f\u001b\u001d\u0015~x\u000b\u0006\u001eceX\u0000\u001e~d\u0014\u0006\b,";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0015\u0013\u0003^x\u0002\u0017[1,XB";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Object create(Object obj) {
        return null;
    }

    public LruCache(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(z[1]);
        }
        this.maxSize = i;
        this.map = new LinkedHashMap(0, 0.75f, true);
    }

    protected void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    protected int sizeOf(Object obj, Object obj2) {
        return 1;
    }

    private int safeSizeOf(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        try {
            throw new IllegalStateException(z[0] + obj + "=" + obj2);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final Object put(Object obj, Object obj2) {
        boolean z = a;
        if (obj == null || obj2 == null) {
            try {
                throw new NullPointerException(z[4]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        Object put;
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(obj, obj2);
            put = this.map.put(obj, obj2);
            if (put != null) {
                try {
                    this.size -= safeSizeOf(obj, put);
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        }
        if (put != null) {
            try {
                entryRemoved(false, obj, put, obj2);
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        trimToSize(this.maxSize);
        if (z) {
            FragmentActivity.a++;
        }
        return put;
    }

    public void trimToSize(int i) {
        boolean z = a;
        do {
            Object key;
            Object value;
            synchronized (this) {
                if (this.size >= 0) {
                    try {
                        if (!this.map.isEmpty() || this.size == 0) {
                            if (this.size <= i || this.map.isEmpty()) {
                                if (!z) {
                                    return;
                                }
                            }
                            Entry entry = (Entry) this.map.entrySet().iterator().next();
                            key = entry.getKey();
                            value = entry.getValue();
                            this.map.remove(key);
                            this.size -= safeSizeOf(key, value);
                            this.evictionCount++;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                throw new IllegalStateException(getClass().getName() + z[6]);
            }
            entryRemoved(true, key, value, null);
        } while (!z);
    }

    public final synchronized Map snapshot() {
        return new LinkedHashMap(this.map);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
        r4 = this;
        if (r5 != 0) goto L_0x000f;
    L_0x0002:
        r0 = new java.lang.NullPointerException;	 Catch:{ IllegalArgumentException -> 0x000d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x000d }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x000d }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x000d }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000d }
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        monitor-enter(r4);
        r0 = r4.map;	 Catch:{ all -> 0x002f }
        r0 = r0.get(r5);	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x0020;
    L_0x0018:
        r1 = r4.hitCount;	 Catch:{ all -> 0x002f }
        r1 = r1 + 1;
        r4.hitCount = r1;	 Catch:{ all -> 0x002f }
        monitor-exit(r4);	 Catch:{ all -> 0x002f }
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = r4.missCount;	 Catch:{ all -> 0x002f }
        r0 = r0 + 1;
        r4.missCount = r0;	 Catch:{ all -> 0x002f }
        monitor-exit(r4);	 Catch:{ all -> 0x002f }
        r1 = r4.create(r5);
        if (r1 != 0) goto L_0x0032;
    L_0x002d:
        r0 = 0;
        goto L_0x001f;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x002f }
        throw r0;
    L_0x0032:
        monitor-enter(r4);
        r0 = r4.createCount;	 Catch:{ all -> 0x0061 }
        r0 = r0 + 1;
        r4.createCount = r0;	 Catch:{ all -> 0x0061 }
        r0 = r4.map;	 Catch:{ all -> 0x0061 }
        r0 = r0.put(r5, r1);	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x004a;
    L_0x0041:
        r2 = r4.map;	 Catch:{ IllegalArgumentException -> 0x005d }
        r2.put(r5, r0);	 Catch:{ IllegalArgumentException -> 0x005d }
        r2 = a;	 Catch:{ IllegalArgumentException -> 0x005d }
        if (r2 == 0) goto L_0x0053;
    L_0x004a:
        r2 = r4.size;	 Catch:{ IllegalArgumentException -> 0x005f }
        r3 = r4.safeSizeOf(r5, r1);	 Catch:{ IllegalArgumentException -> 0x005f }
        r2 = r2 + r3;
        r4.size = r2;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x0053:
        monitor-exit(r4);	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0064;
    L_0x0056:
        r2 = 0;
        r4.entryRemoved(r2, r5, r1, r0);	 Catch:{ IllegalArgumentException -> 0x005b }
        goto L_0x001f;
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0061 }
        throw r0;
    L_0x0064:
        r0 = r4.maxSize;
        r4.trimToSize(r0);
        r0 = r1;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.LruCache.get(java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        String format;
        boolean z = false;
        synchronized (this) {
            boolean z2 = a;
            int i = this.hitCount + this.missCount;
            if (i != 0) {
                try {
                    i = (this.hitCount * 100) / i;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } else {
                i = 0;
            }
            try {
                format = String.format(z[3], new Object[]{Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i)});
                if (FragmentActivity.a != 0) {
                    if (!z2) {
                        z = true;
                    }
                    a = z;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        return format;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final Object remove(Object obj) {
        if (obj == null) {
            try {
                throw new NullPointerException(z[2]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        Object remove;
        synchronized (this) {
            remove = this.map.remove(obj);
            if (remove != null) {
                try {
                    this.size -= safeSizeOf(obj, remove);
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        }
        if (remove != null) {
            try {
                entryRemoved(false, obj, remove, null);
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        return remove;
    }
}
