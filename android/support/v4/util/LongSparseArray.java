package android.support.v4.util;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class LongSparseArray implements Cloneable {
    private static final Object DELETED;
    private static final String[] z;
    private boolean mGarbage;
    private long[] mKeys;
    private int mSize;
    private Object[] mValues;

    public Object get(long j, Object obj) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        return (binarySearch < 0 || this.mValues[binarySearch] == DELETED) ? obj : this.mValues[binarySearch];
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public Object valueAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mValues[i];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r6 = this;
        r0 = 0;
        r1 = android.support.v4.util.LruCache.a;
        r2 = r6.size();
        if (r2 > 0) goto L_0x000e;
    L_0x0009:
        r1 = z;
        r0 = r1[r0];
    L_0x000d:
        return r0;
    L_0x000e:
        r2 = new java.lang.StringBuilder;
        r3 = r6.mSize;
        r3 = r3 * 28;
        r2.<init>(r3);
        r3 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r2.append(r3);
    L_0x001c:
        r3 = r6.mSize;
        if (r0 >= r3) goto L_0x004d;
    L_0x0020:
        if (r0 <= 0) goto L_0x002a;
    L_0x0022:
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r2.append(r3);
    L_0x002a:
        r4 = r6.keyAt(r0);
        r2.append(r4);
        r3 = 61;
        r2.append(r3);
        r3 = r6.valueAt(r0);
        if (r3 == r6) goto L_0x0041;
    L_0x003c:
        r2.append(r3);
        if (r1 == 0) goto L_0x0049;
    L_0x0041:
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2.append(r3);
    L_0x0049:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x001c;
    L_0x004d:
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r2.append(r0);
        r0 = r2.toString();
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.LongSparseArray.toString():java.lang.String");
    }

    static {
        String[] strArr = new String[3];
        String str = "\u0012M";
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
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 48;
                        break;
                    case at.i /*2*/:
                        i3 = 49;
                        break;
                    case at.o /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = 12;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "ADY7\u007fI}P.%";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    DELETED = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    str = "E\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LongSparseArray(int r4) {
        /*
        r3 = this;
        r2 = 0;
        r3.<init>();
        r3.mGarbage = r2;
        if (r4 != 0) goto L_0x0014;
    L_0x0008:
        r0 = android.support.v4.util.ContainerHelpers.EMPTY_LONGS;
        r3.mKeys = r0;
        r0 = android.support.v4.util.ContainerHelpers.EMPTY_OBJECTS;
        r3.mValues = r0;
        r0 = android.support.v4.util.LruCache.a;
        if (r0 == 0) goto L_0x0020;
    L_0x0014:
        r0 = android.support.v4.util.ContainerHelpers.idealLongArraySize(r4);
        r1 = new long[r0];
        r3.mKeys = r1;
        r0 = new java.lang.Object[r0];
        r3.mValues = r0;
    L_0x0020:
        r3.mSize = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.LongSparseArray.<init>(int):void");
    }

    private void gc() {
        boolean z = LruCache.a;
        int i = this.mSize;
        long[] jArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            Object obj = objArr[i2];
            if (obj != DELETED) {
                if (i2 != i3) {
                    jArr[i3] = jArr[i2];
                    objArr[i3] = obj;
                    objArr[i2] = null;
                }
                i3++;
            }
            i2++;
            if (z) {
                break;
            }
        }
        this.mGarbage = false;
        this.mSize = i3;
    }

    public void put(long j, Object obj) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = obj;
            if (!LruCache.a) {
                return;
            }
        }
        binarySearch ^= -1;
        if (binarySearch >= this.mSize || this.mValues[binarySearch] != DELETED) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                gc();
                binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j) ^ -1;
            }
            if (this.mSize >= this.mKeys.length) {
                int idealLongArraySize = ContainerHelpers.idealLongArraySize(this.mSize + 1);
                Object obj2 = new long[idealLongArraySize];
                Object obj3 = new Object[idealLongArraySize];
                System.arraycopy(this.mKeys, 0, obj2, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, obj3, 0, this.mValues.length);
                this.mKeys = obj2;
                this.mValues = obj3;
            }
            if (this.mSize - binarySearch != 0) {
                System.arraycopy(this.mKeys, binarySearch, this.mKeys, binarySearch + 1, this.mSize - binarySearch);
                System.arraycopy(this.mValues, binarySearch, this.mValues, binarySearch + 1, this.mSize - binarySearch);
            }
            this.mKeys[binarySearch] = j;
            this.mValues[binarySearch] = obj;
            this.mSize++;
            return;
        }
        this.mKeys[binarySearch] = j;
        this.mValues[binarySearch] = obj;
    }

    public Object get(long j) {
        return get(j, null);
    }

    public long keyAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i];
    }

    public void removeAt(int i) {
        if (this.mValues[i] != DELETED) {
            this.mValues[i] = DELETED;
            this.mGarbage = true;
        }
    }

    public Object m59clone() {
        return clone();
    }

    public void clear() {
        boolean z = LruCache.a;
        int i = this.mSize;
        Object[] objArr = this.mValues;
        int i2 = 0;
        while (i2 < i) {
            objArr[i2] = null;
            i2++;
            if (z) {
                break;
            }
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public LongSparseArray clone() {
        try {
            LongSparseArray longSparseArray = (LongSparseArray) super.clone();
            try {
                longSparseArray.mKeys = (long[]) this.mKeys.clone();
                longSparseArray.mValues = (Object[]) this.mValues.clone();
                return longSparseArray;
            } catch (CloneNotSupportedException e) {
                return longSparseArray;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public LongSparseArray() {
        this(10);
    }
}
