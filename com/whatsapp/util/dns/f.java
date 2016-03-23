package com.whatsapp.util.dns;

import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class f {
    private static final String[] z;
    private final int a;
    private final String[] b;
    private final short c;

    static {
        String[] strArr = new String[7];
        String str = "!#7T,c30\u00116-9,\\//?7T";
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
                        i3 = 90;
                        break;
                    case at.i /*2*/:
                        i3 = 67;
                        break;
                    case at.o /*3*/:
                        i3 = 49;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "*40D9%3 X:-.cU>7;";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0016\u000e\u0005\u001cg";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "75(T1c7\"H\u007f-57\u0011=&z/^1$?1\u0011++;-\u0011ipz!H+&)";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "75(T1c7\"H\u007f-57\u0011=&z/^1$?1\u0011++;-\u0011ipz!H+&)";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0016\u000e\u0005\u001cg";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "!#7T,c7\"H\u007f-57\u0011=&z-D3/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private f(String[] strArr, short s, int i) {
        this.b = strArr;
        this.c = s;
        this.a = i;
    }

    int a() {
        return this.a;
    }

    String[] c() {
        return this.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.whatsapp.util.dns.f a(java.lang.String[] r7, short r8) {
        /*
        r0 = 0;
        r2 = com.whatsapp.util.dns.i.a;
        r3 = r7.length;
        r1 = r0;
    L_0x0005:
        if (r1 >= r3) goto L_0x0033;
    L_0x0007:
        r4 = r7[r1];
        r5 = z;	 Catch:{ UnsupportedEncodingException -> 0x0024 }
        r6 = 6;
        r5 = r5[r6];	 Catch:{ UnsupportedEncodingException -> 0x0024 }
        r4 = r4.getBytes(r5);	 Catch:{ UnsupportedEncodingException -> 0x0024 }
        r5 = r4.length;	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r6 = 63;
        if (r5 <= r6) goto L_0x002b;
    L_0x0017:
        r0 = new java.lang.IllegalStateException;	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r0.<init>(r1);	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = move-exception;
        r1 = new java.lang.Error;
        r1.<init>(r0);
        throw r1;
    L_0x002b:
        r4 = r4.length;
        r4 = r4 + 1;
        r0 = r0 + r4;
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0005;
    L_0x0033:
        if (r8 != 0) goto L_0x0039;
    L_0x0035:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x003b;
    L_0x0039:
        r0 = r0 + 2;
    L_0x003b:
        r1 = new com.whatsapp.util.dns.f;
        r1.<init>(r7, r8, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.dns.f.a(java.lang.String[], short):com.whatsapp.util.dns.f");
    }

    static f a(byte[] bArr, int i) {
        short s = (short) 0;
        int i2 = i.a;
        if (bArr == null) {
            try {
                throw new NullPointerException(z[1]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (bArr.length < 1) {
                throw new IllegalArgumentException(z[2]);
            }
            ArrayList arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            int i3 = i;
            while (bArr[i3] != null && (bArr[i3] & 192) == 0) {
                byte b = (byte) (bArr[i3] & 63);
                int i4 = i3 + 1;
                try {
                    if (bArr.length >= (i4 + b) + 1) {
                        stringBuilder.setLength(0);
                        byte b2 = (byte) 0;
                        while (b2 < b) {
                            stringBuilder.append((char) bArr[i4 + b2]);
                            b2 = (byte) (b2 + 1);
                            if (i2 != 0) {
                                break;
                            }
                        }
                        i3 = i4 + b;
                        arrayList.add(stringBuilder.toString());
                        if (i2 != 0) {
                            break;
                        }
                    }
                    throw new IllegalArgumentException(z[0]);
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            if (bArr[i3] == null) {
                i3++;
                if (i2 == 0) {
                    i2 = i3;
                    return new f((String[]) arrayList.toArray(new String[arrayList.size()]), s, i2 - i);
                }
            }
            s = a.a((byte) (bArr[i3] & 63), bArr[i3 + 1]);
            i2 = i3 + 2;
            return new f((String[]) arrayList.toArray(new String[arrayList.size()]), s, i2 - i);
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(java.io.OutputStream r8) {
        /*
        r7 = this;
        r0 = 0;
        r1 = com.whatsapp.util.dns.i.a;
        r2 = r7.b;
        r3 = r2.length;
    L_0x0006:
        if (r0 >= r3) goto L_0x0030;
    L_0x0008:
        r4 = r2[r0];
        r5 = z;
        r6 = 3;
        r5 = r5[r6];
        r4 = r4.getBytes(r5);
        r5 = r4.length;	 Catch:{ IllegalStateException -> 0x0023 }
        r6 = 63;
        if (r5 <= r6) goto L_0x0025;
    L_0x0018:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0023 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0023 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0023 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0023 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r5 = r4.length;
        r8.write(r5);
        r8.write(r4);
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0006;
    L_0x0030:
        r0 = r7.c;	 Catch:{ IllegalStateException -> 0x004d }
        if (r0 == 0) goto L_0x0048;
    L_0x0034:
        r0 = r7.c;	 Catch:{ IllegalStateException -> 0x004f }
        r0 = r0 >>> 8;
        r0 = r0 & 63;
        r0 = r0 | 192;
        r8.write(r0);	 Catch:{ IllegalStateException -> 0x004f }
        r0 = r7.c;	 Catch:{ IllegalStateException -> 0x004f }
        r0 = r0 & 255;
        r8.write(r0);	 Catch:{ IllegalStateException -> 0x004f }
        if (r1 == 0) goto L_0x004c;
    L_0x0048:
        r0 = 0;
        r8.write(r0);	 Catch:{ IllegalStateException -> 0x004f }
    L_0x004c:
        return;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.dns.f.a(java.io.OutputStream):void");
    }

    short b() {
        return this.c;
    }
}
