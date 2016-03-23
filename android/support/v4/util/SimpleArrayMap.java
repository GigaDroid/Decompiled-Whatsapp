package android.support.v4.util;

import com.whatsapp.arj;
import java.util.Map;
import org.v;
import org.whispersystems.at;

public class SimpleArrayMap {
    static Object[] mBaseCache;
    static int mBaseCacheSize;
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    private static final String[] z;
    Object[] mArray;
    int[] mHashes;
    int mSize;

    static {
        String[] strArr = new String[4];
        String str = "BJ";
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
                        i3 = 110;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 96;
                        break;
                    case at.o /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "F\u001e\b\u00079N'\u0001\u001ec";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "F\u001e\b\u00079N'\u0001\u001ec";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0015\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean isEmpty() {
        try {
            return this.mSize <= 0;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean containsKey(Object obj) {
        try {
            return indexOfKey(obj) >= 0;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public int size() {
        return this.mSize;
    }

    int indexOfNull() {
        boolean z = LruCache.a;
        int i = this.mSize;
        if (i == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpers.binarySearch(this.mHashes, i, 0);
        if (binarySearch < 0) {
            return binarySearch;
        }
        try {
            if (this.mArray[binarySearch << 1] == null) {
                return binarySearch;
            }
            int i2 = binarySearch + 1;
            while (i2 < i) {
                try {
                    if (this.mHashes[i2] != 0) {
                        break;
                    } else if (this.mArray[i2 << 1] != null) {
                        i2++;
                        if (z) {
                            break;
                        }
                    } else {
                        return i2;
                    }
                } catch (NullPointerException e) {
                    throw e;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            binarySearch--;
            while (binarySearch >= 0) {
                try {
                    if (this.mHashes[binarySearch] == 0) {
                        if (this.mArray[binarySearch << 1] != null) {
                            binarySearch--;
                            if (z) {
                                break;
                            }
                        }
                        return binarySearch;
                    }
                    break;
                } catch (NullPointerException e22) {
                    throw e22;
                } catch (NullPointerException e222) {
                    throw e222;
                }
            }
            return i2 ^ -1;
        } catch (NullPointerException e2222) {
            throw e2222;
        }
    }

    public Object setValueAt(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object obj2 = this.mArray[i2];
        this.mArray[i2] = obj;
        return obj2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object put(java.lang.Object r9, java.lang.Object r10) {
        /*
        r8 = this;
        r0 = 8;
        r1 = 4;
        r3 = 0;
        if (r9 != 0) goto L_0x000e;
    L_0x0006:
        r2 = r8.indexOfNull();
        r4 = android.support.v4.util.LruCache.a;
        if (r4 == 0) goto L_0x0016;
    L_0x000e:
        r3 = r9.hashCode();
        r2 = r8.indexOf(r9, r3);
    L_0x0016:
        if (r2 < 0) goto L_0x0025;
    L_0x0018:
        r0 = r2 << 1;
        r1 = r0 + 1;
        r0 = r8.mArray;
        r0 = r0[r1];
        r2 = r8.mArray;
        r2[r1] = r10;
    L_0x0024:
        return r0;
    L_0x0025:
        r2 = r2 ^ -1;
        r4 = r8.mSize;	 Catch:{ NullPointerException -> 0x0096 }
        r5 = r8.mHashes;	 Catch:{ NullPointerException -> 0x0096 }
        r5 = r5.length;	 Catch:{ NullPointerException -> 0x0096 }
        if (r4 < r5) goto L_0x005a;
    L_0x002e:
        r4 = r8.mSize;	 Catch:{ NullPointerException -> 0x0098 }
        if (r4 < r0) goto L_0x009a;
    L_0x0032:
        r0 = r8.mSize;	 Catch:{ NullPointerException -> 0x0098 }
        r1 = r8.mSize;	 Catch:{ NullPointerException -> 0x0098 }
        r1 = r1 >> 1;
        r0 = r0 + r1;
    L_0x0039:
        r1 = r8.mHashes;
        r4 = r8.mArray;
        r8.allocArrays(r0);	 Catch:{ NullPointerException -> 0x00a2 }
        r0 = r8.mHashes;	 Catch:{ NullPointerException -> 0x00a2 }
        r0 = r0.length;	 Catch:{ NullPointerException -> 0x00a2 }
        if (r0 <= 0) goto L_0x0055;
    L_0x0045:
        r0 = 0;
        r5 = r8.mHashes;	 Catch:{ NullPointerException -> 0x00a2 }
        r6 = 0;
        r7 = r1.length;	 Catch:{ NullPointerException -> 0x00a2 }
        java.lang.System.arraycopy(r1, r0, r5, r6, r7);	 Catch:{ NullPointerException -> 0x00a2 }
        r0 = 0;
        r5 = r8.mArray;	 Catch:{ NullPointerException -> 0x00a2 }
        r6 = 0;
        r7 = r4.length;	 Catch:{ NullPointerException -> 0x00a2 }
        java.lang.System.arraycopy(r4, r0, r5, r6, r7);	 Catch:{ NullPointerException -> 0x00a2 }
    L_0x0055:
        r0 = r8.mSize;
        freeArrays(r1, r4, r0);
    L_0x005a:
        r0 = r8.mSize;	 Catch:{ NullPointerException -> 0x00a4 }
        if (r2 >= r0) goto L_0x007c;
    L_0x005e:
        r0 = r8.mHashes;	 Catch:{ NullPointerException -> 0x00a4 }
        r1 = r8.mHashes;	 Catch:{ NullPointerException -> 0x00a4 }
        r4 = r2 + 1;
        r5 = r8.mSize;	 Catch:{ NullPointerException -> 0x00a4 }
        r5 = r5 - r2;
        java.lang.System.arraycopy(r0, r2, r1, r4, r5);	 Catch:{ NullPointerException -> 0x00a4 }
        r0 = r8.mArray;	 Catch:{ NullPointerException -> 0x00a4 }
        r1 = r2 << 1;
        r4 = r8.mArray;	 Catch:{ NullPointerException -> 0x00a4 }
        r5 = r2 + 1;
        r5 = r5 << 1;
        r6 = r8.mSize;	 Catch:{ NullPointerException -> 0x00a4 }
        r6 = r6 - r2;
        r6 = r6 << 1;
        java.lang.System.arraycopy(r0, r1, r4, r5, r6);	 Catch:{ NullPointerException -> 0x00a4 }
    L_0x007c:
        r0 = r8.mHashes;
        r0[r2] = r3;
        r0 = r8.mArray;
        r1 = r2 << 1;
        r0[r1] = r9;
        r0 = r8.mArray;
        r1 = r2 << 1;
        r1 = r1 + 1;
        r0[r1] = r10;
        r0 = r8.mSize;
        r0 = r0 + 1;
        r8.mSize = r0;
        r0 = 0;
        goto L_0x0024;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;
    L_0x009a:
        r4 = r8.mSize;	 Catch:{ NullPointerException -> 0x00a0 }
        if (r4 >= r1) goto L_0x0039;
    L_0x009e:
        r0 = r1;
        goto L_0x0039;
    L_0x00a0:
        r0 = move-exception;
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.SimpleArrayMap.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r5 = this;
        r0 = 0;
        r1 = android.support.v4.util.LruCache.a;
        r2 = r5.isEmpty();	 Catch:{ NullPointerException -> 0x000f }
        if (r2 == 0) goto L_0x0011;
    L_0x0009:
        r0 = z;	 Catch:{ NullPointerException -> 0x000f }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x000f }
    L_0x000e:
        return r0;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r2 = new java.lang.StringBuilder;
        r3 = r5.mSize;
        r3 = r3 * 28;
        r2.<init>(r3);
        r3 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r2.append(r3);
    L_0x001f:
        r3 = r5.mSize;
        if (r0 >= r3) goto L_0x005c;
    L_0x0023:
        if (r0 <= 0) goto L_0x002d;
    L_0x0025:
        r3 = z;	 Catch:{ NullPointerException -> 0x0066 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x0066 }
        r2.append(r3);	 Catch:{ NullPointerException -> 0x0066 }
    L_0x002d:
        r3 = r5.keyAt(r0);
        if (r3 == r5) goto L_0x0038;
    L_0x0033:
        r2.append(r3);	 Catch:{ NullPointerException -> 0x0068 }
        if (r1 == 0) goto L_0x0040;
    L_0x0038:
        r3 = z;	 Catch:{ NullPointerException -> 0x0068 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x0068 }
        r2.append(r3);	 Catch:{ NullPointerException -> 0x0068 }
    L_0x0040:
        r3 = 61;
        r2.append(r3);
        r3 = r5.valueAt(r0);
        if (r3 == r5) goto L_0x0050;
    L_0x004b:
        r2.append(r3);	 Catch:{ NullPointerException -> 0x006a }
        if (r1 == 0) goto L_0x0058;
    L_0x0050:
        r3 = z;	 Catch:{ NullPointerException -> 0x006a }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x006a }
        r2.append(r3);	 Catch:{ NullPointerException -> 0x006a }
    L_0x0058:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x001f;
    L_0x005c:
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r2.append(r0);
        r0 = r2.toString();
        goto L_0x000e;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.SimpleArrayMap.toString():java.lang.String");
    }

    public int hashCode() {
        boolean z = LruCache.a;
        int[] iArr = this.mHashes;
        Object[] objArr = this.mArray;
        int i = this.mSize;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            try {
                int i5;
                int i6 = iArr[i3];
                if (obj == null) {
                    i5 = 0;
                } else {
                    i5 = obj.hashCode();
                }
                i4 += i5 ^ i6;
                i3++;
                i5 = i2 + 2;
                if (z) {
                    break;
                }
                i2 = i5;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        return i4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object removeAt(int r10) {
        /*
        r9 = this;
        r8 = 0;
        r0 = 8;
        r1 = android.support.v4.util.LruCache.a;
        r2 = r9.mArray;
        r3 = r10 << 1;
        r3 = r3 + 1;
        r2 = r2[r3];
        r3 = r9.mSize;	 Catch:{ NullPointerException -> 0x00bb }
        r4 = 1;
        if (r3 > r4) goto L_0x0028;
    L_0x0012:
        r3 = r9.mHashes;	 Catch:{ NullPointerException -> 0x00bd }
        r4 = r9.mArray;	 Catch:{ NullPointerException -> 0x00bd }
        r5 = r9.mSize;	 Catch:{ NullPointerException -> 0x00bd }
        freeArrays(r3, r4, r5);	 Catch:{ NullPointerException -> 0x00bd }
        r3 = android.support.v4.util.ContainerHelpers.EMPTY_INTS;	 Catch:{ NullPointerException -> 0x00bd }
        r9.mHashes = r3;	 Catch:{ NullPointerException -> 0x00bd }
        r3 = android.support.v4.util.ContainerHelpers.EMPTY_OBJECTS;	 Catch:{ NullPointerException -> 0x00bd }
        r9.mArray = r3;	 Catch:{ NullPointerException -> 0x00bd }
        r3 = 0;
        r9.mSize = r3;	 Catch:{ NullPointerException -> 0x00bd }
        if (r1 == 0) goto L_0x00ba;
    L_0x0028:
        r3 = r9.mHashes;	 Catch:{ NullPointerException -> 0x00bf }
        r3 = r3.length;	 Catch:{ NullPointerException -> 0x00bf }
        if (r3 <= r0) goto L_0x0080;
    L_0x002d:
        r3 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c1 }
        r4 = r9.mHashes;	 Catch:{ NullPointerException -> 0x00c1 }
        r4 = r4.length;	 Catch:{ NullPointerException -> 0x00c1 }
        r4 = r4 / 3;
        if (r3 >= r4) goto L_0x0080;
    L_0x0036:
        r3 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c3 }
        if (r3 <= r0) goto L_0x0041;
    L_0x003a:
        r0 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c3 }
        r3 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c3 }
        r3 = r3 >> 1;
        r0 = r0 + r3;
    L_0x0041:
        r3 = r9.mHashes;
        r4 = r9.mArray;
        r9.allocArrays(r0);	 Catch:{ NullPointerException -> 0x00c5 }
        r0 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c5 }
        r0 = r0 + -1;
        r9.mSize = r0;	 Catch:{ NullPointerException -> 0x00c5 }
        if (r10 <= 0) goto L_0x0060;
    L_0x0050:
        r0 = 0;
        r5 = r9.mHashes;	 Catch:{ NullPointerException -> 0x00c5 }
        r6 = 0;
        java.lang.System.arraycopy(r3, r0, r5, r6, r10);	 Catch:{ NullPointerException -> 0x00c5 }
        r0 = 0;
        r5 = r9.mArray;	 Catch:{ NullPointerException -> 0x00c5 }
        r6 = 0;
        r7 = r10 << 1;
        java.lang.System.arraycopy(r4, r0, r5, r6, r7);	 Catch:{ NullPointerException -> 0x00c5 }
    L_0x0060:
        r0 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c7 }
        if (r10 >= r0) goto L_0x007e;
    L_0x0064:
        r0 = r10 + 1;
        r5 = r9.mHashes;	 Catch:{ NullPointerException -> 0x00c7 }
        r6 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c7 }
        r6 = r6 - r10;
        java.lang.System.arraycopy(r3, r0, r5, r10, r6);	 Catch:{ NullPointerException -> 0x00c7 }
        r0 = r10 + 1;
        r0 = r0 << 1;
        r3 = r9.mArray;	 Catch:{ NullPointerException -> 0x00c7 }
        r5 = r10 << 1;
        r6 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c7 }
        r6 = r6 - r10;
        r6 = r6 << 1;
        java.lang.System.arraycopy(r4, r0, r3, r5, r6);	 Catch:{ NullPointerException -> 0x00c7 }
    L_0x007e:
        if (r1 == 0) goto L_0x00ba;
    L_0x0080:
        r0 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c9 }
        r0 = r0 + -1;
        r9.mSize = r0;	 Catch:{ NullPointerException -> 0x00c9 }
        r0 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c9 }
        if (r10 >= r0) goto L_0x00a8;
    L_0x008a:
        r0 = r9.mHashes;	 Catch:{ NullPointerException -> 0x00c9 }
        r1 = r10 + 1;
        r3 = r9.mHashes;	 Catch:{ NullPointerException -> 0x00c9 }
        r4 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c9 }
        r4 = r4 - r10;
        java.lang.System.arraycopy(r0, r1, r3, r10, r4);	 Catch:{ NullPointerException -> 0x00c9 }
        r0 = r9.mArray;	 Catch:{ NullPointerException -> 0x00c9 }
        r1 = r10 + 1;
        r1 = r1 << 1;
        r3 = r9.mArray;	 Catch:{ NullPointerException -> 0x00c9 }
        r4 = r10 << 1;
        r5 = r9.mSize;	 Catch:{ NullPointerException -> 0x00c9 }
        r5 = r5 - r10;
        r5 = r5 << 1;
        java.lang.System.arraycopy(r0, r1, r3, r4, r5);	 Catch:{ NullPointerException -> 0x00c9 }
    L_0x00a8:
        r0 = r9.mArray;
        r1 = r9.mSize;
        r1 = r1 << 1;
        r0[r1] = r8;
        r0 = r9.mArray;
        r1 = r9.mSize;
        r1 = r1 << 1;
        r1 = r1 + 1;
        r0[r1] = r8;
    L_0x00ba:
        return r2;
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;
    L_0x00c9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.SimpleArrayMap.removeAt(int):java.lang.Object");
    }

    int indexOf(Object obj, int i) {
        boolean z = LruCache.a;
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpers.binarySearch(this.mHashes, i2, i);
        if (binarySearch < 0) {
            return binarySearch;
        }
        try {
            if (obj.equals(this.mArray[binarySearch << 1])) {
                return binarySearch;
            }
            int i3 = binarySearch + 1;
            while (i3 < i2) {
                try {
                    if (this.mHashes[i3] != i) {
                        break;
                    } else if (!obj.equals(this.mArray[i3 << 1])) {
                        i3++;
                        if (z) {
                            break;
                        }
                    } else {
                        return i3;
                    }
                } catch (NullPointerException e) {
                    throw e;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            binarySearch--;
            while (binarySearch >= 0) {
                try {
                    if (this.mHashes[binarySearch] == i) {
                        if (!obj.equals(this.mArray[binarySearch << 1])) {
                            binarySearch--;
                            if (z) {
                                break;
                            }
                        }
                        return binarySearch;
                    }
                    break;
                } catch (NullPointerException e22) {
                    throw e22;
                } catch (NullPointerException e222) {
                    throw e222;
                }
            }
            return i3 ^ -1;
        } catch (NullPointerException e2222) {
            throw e2222;
        }
    }

    public Object valueAt(int i) {
        return this.mArray[(i << 1) + 1];
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i) {
        int i2;
        boolean z = LruCache.a;
        if (iArr.length == 8) {
            synchronized (ArrayMap.class) {
                if (mTwiceBaseCacheSize < 10) {
                    objArr[0] = mTwiceBaseCache;
                    objArr[1] = iArr;
                    i2 = (i << 1) - 1;
                    while (i2 >= 2) {
                        objArr[i2] = null;
                        i2--;
                        if (z) {
                            break;
                        }
                    }
                    mTwiceBaseCache = objArr;
                    mTwiceBaseCacheSize++;
                }
            }
            if (!z) {
                return;
            }
        }
        try {
            if (iArr.length == 4) {
                synchronized (ArrayMap.class) {
                    if (mBaseCacheSize < 10) {
                        objArr[0] = mBaseCache;
                        objArr[1] = iArr;
                        i2 = (i << 1) - 1;
                        while (i2 >= 2) {
                            objArr[i2] = null;
                            i2--;
                            if (z) {
                                break;
                            }
                        }
                        mBaseCache = objArr;
                        mBaseCacheSize++;
                    }
                }
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean containsValue(Object obj) {
        try {
            return indexOfValue(obj) >= 0;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SimpleArrayMap(int r2) {
        /*
        r1 = this;
        r1.<init>();
        if (r2 != 0) goto L_0x0011;
    L_0x0005:
        r0 = android.support.v4.util.ContainerHelpers.EMPTY_INTS;	 Catch:{ NullPointerException -> 0x0018 }
        r1.mHashes = r0;	 Catch:{ NullPointerException -> 0x0018 }
        r0 = android.support.v4.util.ContainerHelpers.EMPTY_OBJECTS;	 Catch:{ NullPointerException -> 0x0018 }
        r1.mArray = r0;	 Catch:{ NullPointerException -> 0x0018 }
        r0 = android.support.v4.util.LruCache.a;	 Catch:{ NullPointerException -> 0x0018 }
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r1.allocArrays(r2);	 Catch:{ NullPointerException -> 0x0018 }
    L_0x0014:
        r0 = 0;
        r1.mSize = r0;
        return;
    L_0x0018:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.SimpleArrayMap.<init>(int):void");
    }

    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    public boolean equals(Object obj) {
        boolean z = LruCache.a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        try {
            if (size() != map.size()) {
                return false;
            }
            int i = 0;
            do {
                try {
                    if (i >= this.mSize) {
                        return true;
                    }
                    Object keyAt = keyAt(i);
                    Object valueAt = valueAt(i);
                    Object obj2 = map.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 == null) {
                            if (!map.containsKey(keyAt)) {
                            }
                        }
                        return false;
                    } else if (!valueAt.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e) {
                    throw e;
                } catch (ClassCastException e2) {
                    return false;
                } catch (NullPointerException e3) {
                    return false;
                }
            } while (!z);
            return true;
        } catch (NullPointerException e4) {
            throw e4;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void allocArrays(int r6) {
        /*
        r5 = this;
        r0 = 8;
        if (r6 != r0) goto L_0x0035;
    L_0x0004:
        r1 = android.support.v4.util.ArrayMap.class;
        monitor-enter(r1);
        r0 = mTwiceBaseCache;	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x0030;
    L_0x000b:
        r2 = mTwiceBaseCache;	 Catch:{ all -> 0x0067 }
        r5.mArray = r2;	 Catch:{ all -> 0x0067 }
        r0 = 0;
        r0 = r2[r0];	 Catch:{ all -> 0x0067 }
        r0 = (java.lang.Object[]) r0;	 Catch:{ all -> 0x0067 }
        r0 = (java.lang.Object[]) r0;	 Catch:{ all -> 0x0067 }
        mTwiceBaseCache = r0;	 Catch:{ all -> 0x0067 }
        r0 = 1;
        r0 = r2[r0];	 Catch:{ all -> 0x0067 }
        r0 = (int[]) r0;	 Catch:{ all -> 0x0067 }
        r0 = (int[]) r0;	 Catch:{ all -> 0x0067 }
        r5.mHashes = r0;	 Catch:{ all -> 0x0067 }
        r0 = 0;
        r3 = 1;
        r4 = 0;
        r2[r3] = r4;	 Catch:{ all -> 0x0067 }
        r2[r0] = r4;	 Catch:{ all -> 0x0067 }
        r0 = mTwiceBaseCacheSize;	 Catch:{ all -> 0x0067 }
        r0 = r0 + -1;
        mTwiceBaseCacheSize = r0;	 Catch:{ all -> 0x0067 }
        monitor-exit(r1);	 Catch:{ all -> 0x0067 }
    L_0x002f:
        return;
    L_0x0030:
        monitor-exit(r1);	 Catch:{ all -> 0x0067 }
        r0 = android.support.v4.util.LruCache.a;	 Catch:{ NullPointerException -> 0x006a }
        if (r0 == 0) goto L_0x006d;
    L_0x0035:
        r0 = 4;
        if (r6 != r0) goto L_0x006d;
    L_0x0038:
        r1 = android.support.v4.util.ArrayMap.class;
        monitor-enter(r1);
        r0 = mBaseCache;	 Catch:{ all -> 0x0064 }
        if (r0 == 0) goto L_0x006c;
    L_0x003f:
        r2 = mBaseCache;	 Catch:{ all -> 0x0064 }
        r5.mArray = r2;	 Catch:{ all -> 0x0064 }
        r0 = 0;
        r0 = r2[r0];	 Catch:{ all -> 0x0064 }
        r0 = (java.lang.Object[]) r0;	 Catch:{ all -> 0x0064 }
        r0 = (java.lang.Object[]) r0;	 Catch:{ all -> 0x0064 }
        mBaseCache = r0;	 Catch:{ all -> 0x0064 }
        r0 = 1;
        r0 = r2[r0];	 Catch:{ all -> 0x0064 }
        r0 = (int[]) r0;	 Catch:{ all -> 0x0064 }
        r0 = (int[]) r0;	 Catch:{ all -> 0x0064 }
        r5.mHashes = r0;	 Catch:{ all -> 0x0064 }
        r0 = 0;
        r3 = 1;
        r4 = 0;
        r2[r3] = r4;	 Catch:{ all -> 0x0064 }
        r2[r0] = r4;	 Catch:{ all -> 0x0064 }
        r0 = mBaseCacheSize;	 Catch:{ all -> 0x0064 }
        r0 = r0 + -1;
        mBaseCacheSize = r0;	 Catch:{ all -> 0x0064 }
        monitor-exit(r1);	 Catch:{ all -> 0x0064 }
        goto L_0x002f;
    L_0x0064:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0064 }
        throw r0;
    L_0x0067:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0067 }
        throw r0;
    L_0x006a:
        r0 = move-exception;
        throw r0;
    L_0x006c:
        monitor-exit(r1);	 Catch:{ all -> 0x0064 }
    L_0x006d:
        r0 = new int[r6];
        r5.mHashes = r0;
        r0 = r6 << 1;
        r0 = new java.lang.Object[r0];
        r5.mArray = r0;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.SimpleArrayMap.allocArrays(int):void");
    }

    public void clear() {
        try {
            if (this.mSize != 0) {
                freeArrays(this.mHashes, this.mArray, this.mSize);
                this.mHashes = ContainerHelpers.EMPTY_INTS;
                this.mArray = ContainerHelpers.EMPTY_OBJECTS;
                this.mSize = 0;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public Object get(Object obj) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey < 0) {
            return null;
        }
        try {
            return this.mArray[(indexOfKey << 1) + 1];
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public Object keyAt(int i) {
        return this.mArray[i << 1];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int indexOfValue(java.lang.Object r7) {
        /*
        r6 = this;
        r0 = 1;
        r2 = android.support.v4.util.LruCache.a;
        r1 = r6.mSize;
        r3 = r1 * 2;
        r4 = r6.mArray;
        if (r7 != 0) goto L_0x001d;
    L_0x000b:
        r1 = r0;
    L_0x000c:
        if (r1 >= r3) goto L_0x001b;
    L_0x000e:
        r5 = r4[r1];	 Catch:{ NullPointerException -> 0x0015 }
        if (r5 != 0) goto L_0x0017;
    L_0x0012:
        r0 = r1 >> 1;
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r1 = r1 + 2;
        if (r2 == 0) goto L_0x000c;
    L_0x001b:
        if (r2 == 0) goto L_0x0030;
    L_0x001d:
        if (r0 >= r3) goto L_0x0030;
    L_0x001f:
        r1 = r4[r0];	 Catch:{ NullPointerException -> 0x002a }
        r1 = r7.equals(r1);	 Catch:{ NullPointerException -> 0x002a }
        if (r1 == 0) goto L_0x002c;
    L_0x0027:
        r0 = r0 >> 1;
        goto L_0x0014;
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = r0 + 2;
        if (r2 == 0) goto L_0x001d;
    L_0x0030:
        r0 = -1;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.SimpleArrayMap.indexOfValue(java.lang.Object):int");
    }

    public Object remove(Object obj) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey < 0) {
            return null;
        }
        try {
            return removeAt(indexOfKey);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void ensureCapacity(int i) {
        if (this.mHashes.length < i) {
            Object obj = this.mHashes;
            Object obj2 = this.mArray;
            try {
                allocArrays(i);
                if (this.mSize > 0) {
                    System.arraycopy(obj, 0, this.mHashes, 0, this.mSize);
                    System.arraycopy(obj2, 0, this.mArray, 0, this.mSize << 1);
                }
                freeArrays(obj, obj2, this.mSize);
            } catch (NullPointerException e) {
                throw e;
            }
        }
    }

    public int indexOfKey(Object obj) {
        if (obj != null) {
            return indexOf(obj, obj.hashCode());
        }
        try {
            return indexOfNull();
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
