package android.support.v4.util;

import org.v;
import org.whispersystems.at;

public final class Pools {

    public interface Pool {
        Object acquire();

        boolean release(Object obj);
    }

    public class SimplePool implements Pool {
        private static final String[] z;
        private final Object[] mPool;
        private int mPoolSize;

        static {
            String[] strArr = new String[2];
            String str = "\u0017$=qb\"4x!`, x\"f9)x<z08x3jcrxa";
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
                            i3 = 76;
                            break;
                        case at.i /*2*/:
                            i3 = 88;
                            break;
                        case at.o /*3*/:
                            i3 = 81;
                            break;
                        default:
                            i3 = 15;
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
                        str = "\u0002 *4n'5x8ac804/3#7=.";
                        obj = null;
                }
            }
        }

        public Object acquire() {
            if (this.mPoolSize <= 0) {
                return null;
            }
            int i = this.mPoolSize - 1;
            Object obj = this.mPool[i];
            this.mPool[i] = null;
            this.mPoolSize--;
            return obj;
        }

        public boolean release(Object obj) {
            try {
                if (isInPool(obj)) {
                    throw new IllegalStateException(z[1]);
                }
                try {
                    if (this.mPoolSize >= this.mPool.length) {
                        return false;
                    }
                    this.mPool[this.mPoolSize] = obj;
                    this.mPoolSize++;
                    return true;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }

        public SimplePool(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException(z[0]);
            }
            this.mPool = new Object[i];
        }

        private boolean isInPool(Object obj) {
            boolean z = LruCache.a;
            int i = 0;
            while (i < this.mPoolSize) {
                try {
                    if (this.mPool[i] == obj) {
                        return true;
                    }
                    i++;
                    if (z) {
                        return false;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return false;
        }
    }
}
