package org.spongycastle.util;

import com.whatsapp.arj;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import org.v;
import org.whispersystems.at;

public final class Arrays {
    private static final String z;

    public class Iterator implements java.util.Iterator {
        private static final String[] z;
        private final Object[] dataArray;
        private int position;

        static {
            String[] strArr = new String[2];
            char[] toCharArray = ">.P\u0015\u007f\toL\u001e}\u00129[[u\u0011*S\u001e~\toX\t\u007f\u0010o_\u00150<=L\u001aiS".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 125;
                        break;
                    case at.g /*1*/:
                        i2 = 79;
                        break;
                    case at.i /*2*/:
                        i2 = 62;
                        break;
                    case at.o /*3*/:
                        i2 = 123;
                        break;
                    default:
                        i2 = 16;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "2:J[\u007f\u001bo[\u0017u\u0010*P\u000fcGo".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = 125;
                        break;
                    case at.g /*1*/:
                        i2 = 79;
                        break;
                    case at.i /*2*/:
                        i2 = 62;
                        break;
                    case at.o /*3*/:
                        i2 = 123;
                        break;
                    default:
                        i2 = 16;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[1] = new String(cArr).intern();
            z = strArr;
        }

        public Object next() {
            try {
                if (this.position == this.dataArray.length) {
                    throw new NoSuchElementException(z[1] + this.position);
                }
                Object[] objArr = this.dataArray;
                int i = this.position;
                this.position = i + 1;
                return objArr[i];
            } catch (NoSuchElementException e) {
                throw e;
            }
        }

        public void remove() {
            throw new UnsupportedOperationException(z[0]);
        }

        public Iterator(Object[] objArr) {
            this.position = 0;
            this.dataArray = objArr;
        }

        public boolean hasNext() {
            try {
                return this.position < this.dataArray.length;
            } catch (NoSuchElementException e) {
                throw e;
            }
        }
    }

    static {
        char[] toCharArray = "^W\u0014".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.i /*2*/:
                    i2 = 52;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static void fill(char[] cArr, char c) {
        int i = Pack.a;
        int i2 = 0;
        while (i2 < cArr.length) {
            cArr[i2] = c;
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public static int[] prepend(int[] iArr, int i) {
        if (iArr == null) {
            try {
                return new int[]{i};
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int length = iArr.length;
        int[] iArr2 = new int[(length + 1)];
        System.arraycopy(iArr, 0, iArr2, 1, length);
        iArr2[0] = i;
        return iArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.math.BigInteger[] copyOf(java.math.BigInteger[] r4, int r5) {
        /*
        r0 = new java.math.BigInteger[r5];
        r1 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0015 }
        if (r5 >= r1) goto L_0x000e;
    L_0x0005:
        r1 = 0;
        r2 = 0;
        java.lang.System.arraycopy(r4, r1, r0, r2, r5);	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = org.spongycastle.util.Pack.a;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r1 == 0) goto L_0x0014;
    L_0x000e:
        r1 = 0;
        r2 = 0;
        r3 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0017 }
        java.lang.System.arraycopy(r4, r1, r0, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Arrays.copyOf(java.math.BigInteger[], int):java.math.BigInteger[]");
    }

    public static byte[][][] clone(byte[][][] bArr) {
        int i = Pack.a;
        if (bArr == null) {
            try {
                return (byte[][][]) null;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        byte[][][] bArr2 = new byte[bArr.length][][];
        int i2 = 0;
        while (i2 != bArr2.length) {
            bArr2[i2] = clone(bArr[i2]);
            i2++;
            if (i != 0) {
                break;
            }
        }
        return bArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.math.BigInteger[] copyOfRange(java.math.BigInteger[] r4, int r5, int r6) {
        /*
        r0 = getLength(r5, r6);
        r1 = new java.math.BigInteger[r0];
        r2 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0019 }
        r2 = r2 - r5;
        if (r2 >= r0) goto L_0x0014;
    L_0x000a:
        r2 = 0;
        r3 = r4.length;	 Catch:{ IllegalArgumentException -> 0x001b }
        r3 = r3 - r5;
        java.lang.System.arraycopy(r4, r5, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x001b }
        r2 = org.spongycastle.util.Pack.a;	 Catch:{ IllegalArgumentException -> 0x001b }
        if (r2 == 0) goto L_0x0018;
    L_0x0014:
        r2 = 0;
        java.lang.System.arraycopy(r4, r5, r1, r2, r0);	 Catch:{ IllegalArgumentException -> 0x001b }
    L_0x0018:
        return r1;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Arrays.copyOfRange(java.math.BigInteger[], int, int):java.math.BigInteger[]");
    }

    public static boolean areEqual(int[] iArr, int[] iArr2) {
        int i = Pack.a;
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null) {
            return false;
        }
        try {
            if (iArr.length != iArr2.length) {
                return false;
            }
            int i2 = 0;
            while (i2 != iArr.length) {
                try {
                    if (iArr[i2] == iArr2[i2]) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    return false;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static int[] clone(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static boolean areEqual(long[] jArr, long[] jArr2) {
        int i = Pack.a;
        if (jArr == jArr2) {
            return true;
        }
        if (jArr == null || jArr2 == null) {
            return false;
        }
        try {
            if (jArr.length != jArr2.length) {
                return false;
            }
            int i2 = 0;
            while (i2 != jArr.length) {
                try {
                    if (jArr[i2] == jArr2[i2]) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    return false;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static void fill(int[] iArr, int i) {
        int i2 = Pack.a;
        int i3 = 0;
        while (i3 < iArr.length) {
            iArr[i3] = i;
            i3++;
            if (i2 != 0) {
                return;
            }
        }
    }

    private static int getLength(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(z).append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static boolean areEqual(boolean[] zArr, boolean[] zArr2) {
        int i = Pack.a;
        if (zArr == zArr2) {
            return true;
        }
        if (zArr == null || zArr2 == null) {
            return false;
        }
        try {
            if (zArr.length != zArr2.length) {
                return false;
            }
            int i2 = 0;
            while (i2 != zArr.length) {
                try {
                    if (zArr[i2] == zArr2[i2]) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    return false;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static int hashCode(long[] jArr) {
        int i = Pack.a;
        if (jArr == null) {
            return 0;
        }
        int length = jArr.length;
        int i2 = length + 1;
        do {
            length--;
            if (length < 0) {
                return i2;
            }
            long j = jArr[length];
            i2 = (((i2 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        } while (i == 0);
        return i2;
    }

    public static int hashCode(long[] jArr, int i, int i2) {
        int i3 = Pack.a;
        if (jArr == null) {
            return 0;
        }
        int i4 = i2 + 1;
        do {
            i2--;
            if (i2 < 0) {
                return i4;
            }
            long j = jArr[i + i2];
            i4 = (((i4 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        } while (i3 == 0);
        return i4;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr2 != null && bArr3 != null) {
            Object obj = new byte[((bArr.length + bArr2.length) + bArr3.length)];
            System.arraycopy(bArr, 0, obj, 0, bArr.length);
            System.arraycopy(bArr2, 0, obj, bArr.length, bArr2.length);
            System.arraycopy(bArr3, 0, obj, bArr.length + bArr2.length, bArr3.length);
            return obj;
        } else if (bArr == null) {
            try {
                return concatenate(bArr2, bArr3);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (bArr2 != null) {
            return concatenate(bArr, bArr2);
        } else {
            try {
                return concatenate(bArr, bArr3);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public static BigInteger[] clone(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null) {
            return null;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[bigIntegerArr.length];
        System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, bigIntegerArr.length);
        return bigIntegerArr2;
    }

    public static int hashCode(byte[] bArr, int i, int i2) {
        int i3 = Pack.a;
        if (bArr == null) {
            return 0;
        }
        int i4 = i2 + 1;
        do {
            i2--;
            if (i2 < 0) {
                return i4;
            }
            i4 = (i4 * 257) ^ bArr[i + i2];
        } while (i3 == 0);
        return i4;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr != null && bArr2 != null && bArr3 != null && bArr4 != null) {
            Object obj = new byte[(((bArr.length + bArr2.length) + bArr3.length) + bArr4.length)];
            System.arraycopy(bArr, 0, obj, 0, bArr.length);
            System.arraycopy(bArr2, 0, obj, bArr.length, bArr2.length);
            System.arraycopy(bArr3, 0, obj, bArr.length + bArr2.length, bArr3.length);
            System.arraycopy(bArr4, 0, obj, (bArr.length + bArr2.length) + bArr3.length, bArr4.length);
            return obj;
        } else if (bArr4 == null) {
            try {
                return concatenate(bArr, bArr2, bArr3);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (bArr3 == null) {
            try {
                return concatenate(bArr, bArr2, bArr4);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else if (bArr2 != null) {
            return concatenate(bArr2, bArr3, bArr4);
        } else {
            try {
                return concatenate(bArr, bArr3, bArr4);
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    public static int hashCode(byte[] bArr) {
        int i = Pack.a;
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i2 = length + 1;
        do {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ bArr[length];
        } while (i == 0);
        return i2;
    }

    public static long[] clone(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    public static int hashCode(short[][] sArr) {
        int i = 0;
        int i2 = Pack.a;
        int i3 = 0;
        while (i != sArr.length) {
            i3 = (i3 * 257) + hashCode(sArr[i]);
            i++;
            if (i2 != 0) {
                break;
            }
        }
        return i3;
    }

    public static boolean contains(int[] iArr, int i) {
        int i2 = Pack.a;
        int i3 = 0;
        while (i3 < iArr.length) {
            try {
                if (iArr[i3] == i) {
                    return true;
                }
                i3++;
                if (i2 != 0) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }

    public static byte[] append(byte[] bArr, byte b) {
        if (bArr == null) {
            try {
                return new byte[]{b};
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[(length + 1)];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        bArr2[length] = b;
        return bArr2;
    }

    public static int[] reverse(int[] iArr) {
        int i = Pack.a;
        if (iArr == null) {
            return null;
        }
        int i2 = 0;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        while (true) {
            length--;
            if (length < 0) {
                return iArr2;
            }
            int i3 = i2 + 1;
            iArr2[length] = iArr[i2];
            if (i != 0) {
                return iArr2;
            }
            i2 = i3;
        }
    }

    public static boolean areEqual(byte[] bArr, byte[] bArr2) {
        int i = Pack.a;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null) {
            return false;
        }
        try {
            if (bArr.length != bArr2.length) {
                return false;
            }
            int i2 = 0;
            while (i2 != bArr.length) {
                try {
                    if (bArr[i2] == bArr2[i2]) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    return false;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static short[] append(short[] sArr, short s) {
        if (sArr == null) {
            try {
                return new short[]{s};
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int length = sArr.length;
        short[] sArr2 = new short[(length + 1)];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        sArr2[length] = s;
        return sArr2;
    }

    public static void fill(short[] sArr, short s) {
        int i = Pack.a;
        int i2 = 0;
        while (i2 < sArr.length) {
            sArr[i2] = s;
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public static int hashCode(Object[] objArr) {
        int i = Pack.a;
        if (objArr == null) {
            return 0;
        }
        int length = objArr.length;
        int i2 = length + 1;
        do {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ objArr[length].hashCode();
        } while (i == 0);
        return i2;
    }

    public static int hashCode(int[][] iArr) {
        int i = 0;
        int i2 = Pack.a;
        int i3 = 0;
        while (i != iArr.length) {
            i3 = (i3 * 257) + hashCode(iArr[i]);
            i++;
            if (i2 != 0) {
                break;
            }
        }
        return i3;
    }

    public static int hashCode(short[] sArr) {
        int i = Pack.a;
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i2 = length + 1;
        do {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ (sArr[length] & 255);
        } while (i == 0);
        return i2;
    }

    public static boolean contains(short[] sArr, short s) {
        int i = Pack.a;
        int i2 = 0;
        while (i2 < sArr.length) {
            try {
                if (sArr[i2] == s) {
                    return true;
                }
                i2++;
                if (i != 0) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }

    public static short[] prepend(short[] sArr, short s) {
        if (sArr == null) {
            try {
                return new short[]{s};
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int length = sArr.length;
        short[] sArr2 = new short[(length + 1)];
        System.arraycopy(sArr, 0, sArr2, 1, length);
        sArr2[0] = s;
        return sArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static char[] copyOf(char[] r4, int r5) {
        /*
        r0 = new char[r5];
        r1 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0015 }
        if (r5 >= r1) goto L_0x000e;
    L_0x0005:
        r1 = 0;
        r2 = 0;
        java.lang.System.arraycopy(r4, r1, r0, r2, r5);	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = org.spongycastle.util.Pack.a;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r1 == 0) goto L_0x0014;
    L_0x000e:
        r1 = 0;
        r2 = 0;
        r3 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0017 }
        java.lang.System.arraycopy(r4, r1, r0, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Arrays.copyOf(char[], int):char[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] copyOfRange(byte[] r4, int r5, int r6) {
        /*
        r0 = getLength(r5, r6);
        r1 = new byte[r0];
        r2 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0019 }
        r2 = r2 - r5;
        if (r2 >= r0) goto L_0x0014;
    L_0x000a:
        r2 = 0;
        r3 = r4.length;	 Catch:{ IllegalArgumentException -> 0x001b }
        r3 = r3 - r5;
        java.lang.System.arraycopy(r4, r5, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x001b }
        r2 = org.spongycastle.util.Pack.a;	 Catch:{ IllegalArgumentException -> 0x001b }
        if (r2 == 0) goto L_0x0018;
    L_0x0014:
        r2 = 0;
        java.lang.System.arraycopy(r4, r5, r1, r2, r0);	 Catch:{ IllegalArgumentException -> 0x001b }
    L_0x0018:
        return r1;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Arrays.copyOfRange(byte[], int, int):byte[]");
    }

    public static int hashCode(char[] cArr) {
        int i = Pack.a;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i2 = length + 1;
        do {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ cArr[length];
        } while (i == 0);
        return i2;
    }

    public static int hashCode(int[] iArr) {
        int i = Pack.a;
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i2 = length + 1;
        do {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ iArr[length];
        } while (i == 0);
        return i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] copyOfRange(int[] r4, int r5, int r6) {
        /*
        r0 = getLength(r5, r6);
        r1 = new int[r0];
        r2 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0019 }
        r2 = r2 - r5;
        if (r2 >= r0) goto L_0x0014;
    L_0x000a:
        r2 = 0;
        r3 = r4.length;	 Catch:{ IllegalArgumentException -> 0x001b }
        r3 = r3 - r5;
        java.lang.System.arraycopy(r4, r5, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x001b }
        r2 = org.spongycastle.util.Pack.a;	 Catch:{ IllegalArgumentException -> 0x001b }
        if (r2 == 0) goto L_0x0018;
    L_0x0014:
        r2 = 0;
        java.lang.System.arraycopy(r4, r5, r1, r2, r0);	 Catch:{ IllegalArgumentException -> 0x001b }
    L_0x0018:
        return r1;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Arrays.copyOfRange(int[], int, int):int[]");
    }

    public static short[] clone(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] copyOf(byte[] r4, int r5) {
        /*
        r0 = new byte[r5];
        r1 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0015 }
        if (r5 >= r1) goto L_0x000e;
    L_0x0005:
        r1 = 0;
        r2 = 0;
        java.lang.System.arraycopy(r4, r1, r0, r2, r5);	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = org.spongycastle.util.Pack.a;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r1 == 0) goto L_0x0014;
    L_0x000e:
        r1 = 0;
        r2 = 0;
        r3 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0017 }
        java.lang.System.arraycopy(r4, r1, r0, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Arrays.copyOf(byte[], int):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long[] copyOf(long[] r4, int r5) {
        /*
        r0 = new long[r5];
        r1 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0015 }
        if (r5 >= r1) goto L_0x000e;
    L_0x0005:
        r1 = 0;
        r2 = 0;
        java.lang.System.arraycopy(r4, r1, r0, r2, r5);	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = org.spongycastle.util.Pack.a;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r1 == 0) goto L_0x0014;
    L_0x000e:
        r1 = 0;
        r2 = 0;
        r3 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0017 }
        java.lang.System.arraycopy(r4, r1, r0, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Arrays.copyOf(long[], int):long[]");
    }

    public static boolean areEqual(Object[] objArr, Object[] objArr2) {
        int i = Pack.a;
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null) {
            return false;
        }
        try {
            if (objArr.length != objArr2.length) {
                return false;
            }
            int i2 = 0;
            while (i2 != objArr.length) {
                Object obj = objArr[i2];
                Object obj2 = objArr2[i2];
                if (obj != null) {
                    try {
                        if (!obj.equals(obj2)) {
                            return false;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } else if (obj2 != null) {
                    return false;
                }
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static byte[] prepend(byte[] bArr, byte b) {
        if (bArr == null) {
            try {
                return new byte[]{b};
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[(length + 1)];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b;
        return bArr2;
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            Object obj = new byte[(bArr.length + bArr2.length)];
            System.arraycopy(bArr, 0, obj, 0, bArr.length);
            System.arraycopy(bArr2, 0, obj, bArr.length, bArr2.length);
            return obj;
        } else if (bArr2 == null) {
            return clone(bArr);
        } else {
            try {
                return clone(bArr2);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private Arrays() {
    }

    public static int hashCode(short[][][] sArr) {
        int i = 0;
        int i2 = Pack.a;
        int i3 = 0;
        while (i != sArr.length) {
            i3 = (i3 * 257) + hashCode(sArr[i]);
            i++;
            if (i2 != 0) {
                break;
            }
        }
        return i3;
    }

    public static byte[] clone(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 != null) {
            try {
                if (bArr2.length == bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
                    return bArr2;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return clone(bArr);
    }

    public static boolean constantTimeAreEqual(byte[] bArr, byte[] bArr2) {
        int i = Pack.a;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null) {
            return false;
        }
        try {
            if (bArr.length != bArr2.length) {
                return false;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 != bArr.length) {
                i3 |= bArr[i2] ^ bArr2[i2];
                i2++;
                if (i != 0) {
                    break;
                }
            }
            if (i3 == 0) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static int[] append(int[] iArr, int i) {
        if (iArr == null) {
            try {
                return new int[]{i};
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int length = iArr.length;
        int[] iArr2 = new int[(length + 1)];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i;
        return iArr2;
    }

    public static byte[][] clone(byte[][] bArr) {
        int i = Pack.a;
        if (bArr == null) {
            try {
                return (byte[][]) null;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        byte[][] bArr2 = new byte[bArr.length][];
        int i2 = 0;
        while (i2 != bArr2.length) {
            bArr2[i2] = clone(bArr[i2]);
            i2++;
            if (i != 0) {
                break;
            }
        }
        return bArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] copyOf(int[] r4, int r5) {
        /*
        r0 = new int[r5];
        r1 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0015 }
        if (r5 >= r1) goto L_0x000e;
    L_0x0005:
        r1 = 0;
        r2 = 0;
        java.lang.System.arraycopy(r4, r1, r0, r2, r5);	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = org.spongycastle.util.Pack.a;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r1 == 0) goto L_0x0014;
    L_0x000e:
        r1 = 0;
        r2 = 0;
        r3 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0017 }
        java.lang.System.arraycopy(r4, r1, r0, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Arrays.copyOf(int[], int):int[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long[] copyOfRange(long[] r4, int r5, int r6) {
        /*
        r0 = getLength(r5, r6);
        r1 = new long[r0];
        r2 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0019 }
        r2 = r2 - r5;
        if (r2 >= r0) goto L_0x0014;
    L_0x000a:
        r2 = 0;
        r3 = r4.length;	 Catch:{ IllegalArgumentException -> 0x001b }
        r3 = r3 - r5;
        java.lang.System.arraycopy(r4, r5, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x001b }
        r2 = org.spongycastle.util.Pack.a;	 Catch:{ IllegalArgumentException -> 0x001b }
        if (r2 == 0) goto L_0x0018;
    L_0x0014:
        r2 = 0;
        java.lang.System.arraycopy(r4, r5, r1, r2, r0);	 Catch:{ IllegalArgumentException -> 0x001b }
    L_0x0018:
        return r1;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Arrays.copyOfRange(long[], int, int):long[]");
    }

    public static boolean areEqual(char[] cArr, char[] cArr2) {
        int i = Pack.a;
        if (cArr == cArr2) {
            return true;
        }
        if (cArr == null || cArr2 == null) {
            return false;
        }
        try {
            if (cArr.length != cArr2.length) {
                return false;
            }
            int i2 = 0;
            while (i2 != cArr.length) {
                try {
                    if (cArr[i2] == cArr2[i2]) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    return false;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static int hashCode(int[] iArr, int i, int i2) {
        int i3 = Pack.a;
        if (iArr == null) {
            return 0;
        }
        int i4 = i2 + 1;
        do {
            i2--;
            if (i2 < 0) {
                return i4;
            }
            i4 = (i4 * 257) ^ iArr[i + i2];
        } while (i3 == 0);
        return i4;
    }

    public static char[] clone(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        char[] cArr2 = new char[cArr.length];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    public static void fill(byte[] bArr, byte b) {
        int i = Pack.a;
        int i2 = 0;
        while (i2 < bArr.length) {
            bArr[i2] = b;
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public static void fill(long[] jArr, long j) {
        int i = Pack.a;
        int i2 = 0;
        while (i2 < jArr.length) {
            jArr[i2] = j;
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public static int[] concatenate(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            try {
                return clone(iArr2);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (iArr2 == null) {
            try {
                return clone(iArr);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            return iArr3;
        }
    }

    public static long[] clone(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 != null) {
            try {
                if (jArr2.length == jArr.length) {
                    System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
                    return jArr2;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return clone(jArr);
    }

    public static byte[] reverse(byte[] bArr) {
        int i = Pack.a;
        if (bArr == null) {
            return null;
        }
        int i2 = 0;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            int i3 = i2 + 1;
            bArr2[length] = bArr[i2];
            if (i != 0) {
                return bArr2;
            }
            i2 = i3;
        }
    }
}
