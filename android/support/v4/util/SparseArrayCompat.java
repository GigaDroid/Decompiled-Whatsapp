package android.support.v4.util;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class SparseArrayCompat implements Cloneable {
    private static final Object DELETED;
    private static final String[] z;
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public Object get(int i) {
        return get(i, null);
    }

    public int keyAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i];
    }

    public void put(int i, Object obj) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
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
                binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i) ^ -1;
            }
            if (this.mSize >= this.mKeys.length) {
                int idealIntArraySize = ContainerHelpers.idealIntArraySize(this.mSize + 1);
                Object obj2 = new int[idealIntArraySize];
                Object obj3 = new Object[idealIntArraySize];
                System.arraycopy(this.mKeys, 0, obj2, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, obj3, 0, this.mValues.length);
                this.mKeys = obj2;
                this.mValues = obj3;
            }
            if (this.mSize - binarySearch != 0) {
                System.arraycopy(this.mKeys, binarySearch, this.mKeys, binarySearch + 1, this.mSize - binarySearch);
                System.arraycopy(this.mValues, binarySearch, this.mValues, binarySearch + 1, this.mSize - binarySearch);
            }
            this.mKeys[binarySearch] = i;
            this.mValues[binarySearch] = obj;
            this.mSize++;
            return;
        }
        this.mKeys[binarySearch] = i;
        this.mValues[binarySearch] = obj;
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public int indexOfKey(int i) {
        if (this.mGarbage) {
            gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
    }

    public Object valueAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mValues[i];
    }

    public void removeAt(int i) {
        if (this.mValues[i] != DELETED) {
            this.mValues[i] = DELETED;
            this.mGarbage = true;
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "\u0012\u0012s\"l\u001a+z;6";
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
                        i3 = 58;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 27;
                        break;
                    case at.o /*3*/:
                        i3 = 75;
                        break;
                    default:
                        i3 = 31;
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
                    str = "A\u001b";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    DELETED = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016F";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public SparseArrayCompat() {
        this(10);
    }

    public Object get(int i, Object obj) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        return (binarySearch < 0 || this.mValues[binarySearch] == DELETED) ? obj : this.mValues[binarySearch];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SparseArrayCompat(int r4) {
        /*
        r3 = this;
        r2 = 0;
        r3.<init>();
        r3.mGarbage = r2;
        if (r4 != 0) goto L_0x0014;
    L_0x0008:
        r0 = android.support.v4.util.ContainerHelpers.EMPTY_INTS;
        r3.mKeys = r0;
        r0 = android.support.v4.util.ContainerHelpers.EMPTY_OBJECTS;
        r3.mValues = r0;
        r0 = android.support.v4.util.LruCache.a;
        if (r0 == 0) goto L_0x0020;
    L_0x0014:
        r0 = android.support.v4.util.ContainerHelpers.idealIntArraySize(r4);
        r1 = new int[r0];
        r3.mKeys = r1;
        r0 = new java.lang.Object[r0];
        r3.mValues = r0;
    L_0x0020:
        r3.mSize = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.SparseArrayCompat.<init>(int):void");
    }

    public SparseArrayCompat clone() {
        try {
            SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) super.clone();
            try {
                sparseArrayCompat.mKeys = (int[]) this.mKeys.clone();
                sparseArrayCompat.mValues = (Object[]) this.mValues.clone();
                return sparseArrayCompat;
            } catch (CloneNotSupportedException e) {
                return sparseArrayCompat;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public void remove(int i) {
        delete(i);
    }

    public Object m47clone() {
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

    private void gc() {
        boolean z = LruCache.a;
        int i = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            Object obj = objArr[i2];
            if (obj != DELETED) {
                if (i2 != i3) {
                    iArr[i3] = iArr[i2];
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r6 = this;
        r1 = 0;
        r2 = android.support.v4.util.LruCache.a;
        r0 = r6.size();
        if (r0 > 0) goto L_0x000f;
    L_0x0009:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
    L_0x000e:
        return r0;
    L_0x000f:
        r3 = new java.lang.StringBuilder;
        r0 = r6.mSize;
        r0 = r0 * 28;
        r3.<init>(r0);
        r0 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r3.append(r0);
        r0 = r1;
    L_0x001e:
        r4 = r6.mSize;
        if (r0 >= r4) goto L_0x004e;
    L_0x0022:
        if (r0 <= 0) goto L_0x002c;
    L_0x0024:
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r3.append(r4);
    L_0x002c:
        r4 = r6.keyAt(r0);
        r3.append(r4);
        r4 = 61;
        r3.append(r4);
        r4 = r6.valueAt(r0);
        if (r4 == r6) goto L_0x0043;
    L_0x003e:
        r3.append(r4);
        if (r2 == 0) goto L_0x004a;
    L_0x0043:
        r4 = z;
        r4 = r4[r1];
        r3.append(r4);
    L_0x004a:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x001e;
    L_0x004e:
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r3.append(r0);
        r0 = r3.toString();
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.SparseArrayCompat.toString():java.lang.String");
    }

    public void delete(int i) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        if (binarySearch >= 0 && this.mValues[binarySearch] != DELETED) {
            this.mValues[binarySearch] = DELETED;
            this.mGarbage = true;
        }
    }
}
