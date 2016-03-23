package com.whatsapp.util;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class i {
    private static final byte[] b;
    private static final byte[] c;
    private static final byte[] e;
    private static w f;
    private static final byte[] h;
    private static final byte[] i;
    private static final byte[] j;
    private static final String[] k;
    private static final String[] z;
    private File a;
    private boolean d;
    private int g;

    static {
        String[] strArr = new String[9];
        String str = "wcbn?,";
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
                        i3 = 88;
                        break;
                    case at.g /*1*/:
                        i3 = 32;
                        break;
                    case at.i /*2*/:
                        i3 = 13;
                        break;
                    case at.o /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 81;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "(Dkk0*Shi~6U`y4*Fbi<9T\"";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "wttk4";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "wpl|4+";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "wfdw%=R";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "wfaz%=dhx><E";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "wooq\u0002,M";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "wlhu6,H";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    String str2 = "}pI]|";
                    Object obj2 = -1;
                    while (true) {
                        char[] toCharArray2 = str2.toCharArray();
                        int length2 = toCharArray2.length;
                        char[] cArr2 = toCharArray2;
                        for (int i4 = 0; length2 > i4; i4++) {
                            int i5;
                            char c2 = cArr2[i4];
                            switch (i4 % 5) {
                                case v.m /*0*/:
                                    i5 = 88;
                                    break;
                                case at.g /*1*/:
                                    i5 = 32;
                                    break;
                                case at.i /*2*/:
                                    i5 = 13;
                                    break;
                                case at.o /*3*/:
                                    i5 = 27;
                                    break;
                                default:
                                    i5 = 81;
                                    break;
                            }
                            cArr2[i4] = (char) (i5 ^ c2);
                        }
                        str2 = new String(cArr2).intern();
                        switch (obj2) {
                            case v.m /*0*/:
                                c = str2.getBytes();
                                str2 = "xOoq";
                                obj2 = 1;
                                break;
                            case at.g /*1*/:
                                e = str2.getBytes();
                                str2 = "=Nit32";
                                obj2 = 2;
                                break;
                            case at.i /*2*/:
                                i = str2.getBytes();
                                str2 = "+T\u007f~05";
                                obj2 = 3;
                                break;
                            case at.o /*3*/:
                                h = str2.getBytes();
                                str2 = "=Nih%*Elv";
                                obj2 = 4;
                                break;
                            case at.p /*4*/:
                                b = str2.getBytes();
                                strArr = new String[6];
                                str = "wrdx9\u0015Eir0";
                                obj = 8;
                                strArr2 = strArr;
                                strArr3 = strArr;
                                i = 0;
                                continue;
                            default:
                                j = str2.getBytes();
                                str2 = "}pI]|";
                                obj2 = null;
                                break;
                        }
                    }
                case aF.u /*8*/:
                    strArr2[i] = str;
                    str = "wj^";
                    obj = 9;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    str = "wjlm0\u000bC\u007fr!,";
                    obj = 10;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "waL";
                    obj = 11;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    str = "wlln?;H";
                    obj = 12;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "wrdx9\u0015Eir0\u0011N~o06Ch";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    k = strArr3;
                    f = new w(null);
                    return;
                default:
                    strArr2[i] = str;
                    str = "wpli46T";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void c(InputStream inputStream) {
        if (inputStream.read() == 13) {
            try {
                inputStream.read();
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    private static boolean b(int i) {
        return i == 47 || i == 60 || i == 62 || i == 91 || i == 93 || i == 40 || i == 41 || i == -1;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    public void a() {
        this.g = 0;
        this.d = false;
        Closeable bufferedInputStream = new BufferedInputStream(new FileInputStream(this.a));
        byte[] bArr = new byte[5];
        try {
            bufferedInputStream.read(bArr);
            if (Arrays.equals(bArr, j) || Arrays.equals(bArr, c)) {
                try {
                    a((InputStream) bufferedInputStream, true);
                } finally {
                    a(bufferedInputStream);
                }
            } else {
                a(bufferedInputStream);
                throw new aw();
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void e(InputStream inputStream) {
        int i = Log.h;
        while (true) {
            int read = inputStream.read();
            if (read == 92) {
                inputStream.read();
                if (i == 0) {
                    continue;
                }
            }
            if (read == 41) {
                return;
            }
            if ((read == -1 && i == 0) || i != 0) {
                return;
            }
        }
    }

    public int b() {
        return this.g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.util.Map b(java.io.InputStream r10) {
        /*
        r9 = this;
        r7 = 62;
        r6 = -1;
        r2 = com.whatsapp.util.Log.h;
        r3 = new java.util.HashMap;
        r3.<init>();
        r0 = d(r10);
    L_0x000e:
        r1 = a(r0);
        if (r1 == 0) goto L_0x0018;
    L_0x0014:
        r0 = d(r10);
    L_0x0018:
        if (r0 != r6) goto L_0x001c;
    L_0x001a:
        if (r2 == 0) goto L_0x008d;
    L_0x001c:
        if (r0 != r7) goto L_0x0026;
    L_0x001e:
        r1 = r10.read();
        if (r1 != r7) goto L_0x0026;
    L_0x0024:
        if (r2 == 0) goto L_0x008d;
    L_0x0026:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
    L_0x002b:
        r0 = (char) r0;
        r4.append(r0);
        r0 = r10.read();
        r1 = b(r0);
        if (r1 != 0) goto L_0x003f;
    L_0x0039:
        r1 = a(r0);
        if (r1 == 0) goto L_0x002b;
    L_0x003f:
        r1 = a(r0);
        if (r1 == 0) goto L_0x0049;
    L_0x0045:
        r0 = d(r10);
    L_0x0049:
        if (r0 != r6) goto L_0x004d;
    L_0x004b:
        if (r2 == 0) goto L_0x008d;
    L_0x004d:
        r1 = 0;
        switch(r0) {
            case 40: goto L_0x00ab;
            case 60: goto L_0x008e;
            case 91: goto L_0x00a2;
            default: goto L_0x0051;
        };
    L_0x0051:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r5 = 47;
        if (r0 != r5) goto L_0x0062;
    L_0x005a:
        r0 = (char) r0;
        r1.append(r0);
        r0 = r10.read();
    L_0x0062:
        r5 = b(r0);
        if (r5 == 0) goto L_0x006e;
    L_0x0068:
        r5 = a(r0);
        if (r5 == 0) goto L_0x0078;
    L_0x006e:
        r0 = (char) r0;
        r1.append(r0);
        r0 = r10.read();
        if (r2 == 0) goto L_0x0062;
    L_0x0078:
        r1 = r1.toString();
        r1 = r1.trim();
    L_0x0080:
        r4 = r4.toString();
        r4 = r4.trim();
        r3.put(r4, r1);
        if (r2 == 0) goto L_0x000e;
    L_0x008d:
        return r3;
    L_0x008e:
        r0 = r10.read();
        r5 = 60;
        if (r0 != r5) goto L_0x0080;
    L_0x0096:
        r0 = r9.b(r10);
        r1 = r10.read();
        r8 = r0;
        r0 = r1;
        r1 = r8;
        goto L_0x0080;
    L_0x00a2:
        f(r10);
        r0 = r10.read();
        if (r2 == 0) goto L_0x0080;
    L_0x00ab:
        e(r10);
        r0 = r10.read();
        if (r2 == 0) goto L_0x0080;
    L_0x00b4:
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.i.b(java.io.InputStream):java.util.Map");
    }

    private static boolean a(int i) {
        return i == 0 || i == 9 || i == 10 || i == 12 || i == 13 || i == 32;
    }

    public i(File file) {
        this.a = file;
    }

    private void a(Map map) {
        int i = Log.h;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                a((String) entry.getKey());
                Object value = entry.getValue();
                try {
                    if (value instanceof String) {
                        a((String) value);
                        if (i == 0) {
                            continue;
                            if (i != 0) {
                                return;
                            }
                        }
                    }
                    try {
                        if (value instanceof Map) {
                            a((Map) value);
                            continue;
                        } else {
                            continue;
                        }
                        if (i != 0) {
                            return;
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
        }
    }

    private void a(String str) {
        int i = Log.h;
        String b = b(str);
        String[] strArr = k;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                if (strArr[i2].equals(b)) {
                    this.d = true;
                }
                i2++;
                if (i != 0) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.io.InputStream r4) {
        /*
        r3 = -1;
        r1 = com.whatsapp.util.Log.h;
        r0 = d(r4);
        if (r0 != r3) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r2 = 40;
        if (r0 != r2) goto L_0x0013;
    L_0x000e:
        e(r4);	 Catch:{ NumberFormatException -> 0x0034 }
        if (r1 == 0) goto L_0x002d;
    L_0x0013:
        r2 = 60;
        if (r0 != r2) goto L_0x001c;
    L_0x0017:
        a(r4);	 Catch:{ NumberFormatException -> 0x0038 }
        if (r1 == 0) goto L_0x002d;
    L_0x001c:
        r2 = 91;
        if (r0 != r2) goto L_0x0025;
    L_0x0020:
        f(r4);	 Catch:{ NumberFormatException -> 0x003c }
        if (r1 == 0) goto L_0x002d;
    L_0x0025:
        r2 = 93;
        if (r0 == r2) goto L_0x0009;
    L_0x0029:
        if (r0 != r3) goto L_0x002d;
    L_0x002b:
        if (r1 == 0) goto L_0x0009;
    L_0x002d:
        r0 = r4.read();
        if (r1 == 0) goto L_0x000a;
    L_0x0033:
        goto L_0x0009;
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.i.f(java.io.InputStream):void");
    }

    public static void a(InputStream inputStream) {
        int i = Log.h;
        do {
            if (inputStream.read() == 62 && i == 0) {
                return;
            }
        } while (i == 0);
    }

    public boolean c() {
        return this.d;
    }

    private static boolean a(InputStream inputStream, byte[] bArr) {
        int i = Log.h;
        int read = inputStream.read();
        while (read >= 0) {
            try {
                f.a((byte) read);
                if (!f.a(bArr)) {
                    read = inputStream.read();
                    if (i != 0) {
                        break;
                    }
                }
                return true;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.io.InputStream r11, boolean r12) {
        /*
        r10 = this;
        r9 = 60;
        r1 = 0;
        r8 = -1;
        r4 = com.whatsapp.util.Log.h;
    L_0x0006:
        r0 = r11.read();
        if (r0 != r8) goto L_0x000e;
    L_0x000c:
        if (r4 == 0) goto L_0x00dd;
    L_0x000e:
        if (r12 == 0) goto L_0x001a;
    L_0x0010:
        r0 = e;	 Catch:{ NumberFormatException -> 0x00de }
        r0 = a(r11, r0);	 Catch:{ NumberFormatException -> 0x00de }
        if (r0 != 0) goto L_0x001a;
    L_0x0018:
        if (r4 == 0) goto L_0x00dd;
    L_0x001a:
        r2 = d(r11);
        if (r2 != r8) goto L_0x0022;
    L_0x0020:
        if (r4 == 0) goto L_0x00dd;
    L_0x0022:
        r0 = 0;
        r3 = r2;
    L_0x0024:
        if (r3 == r8) goto L_0x011b;
    L_0x0026:
        if (r3 != r9) goto L_0x00e2;
    L_0x0028:
        r2 = r11.read();
        if (r2 != r9) goto L_0x00e2;
    L_0x002e:
        r0 = r10.b(r11);
        r2 = r0;
    L_0x0033:
        r10.a(r2);	 Catch:{ NumberFormatException -> 0x00e9 }
        if (r3 != r8) goto L_0x003a;
    L_0x0038:
        if (r4 == 0) goto L_0x00dd;
    L_0x003a:
        r0 = z;
        r3 = 3;
        r0 = r0[r3];
        r3 = r2.get(r0);
        r0 = z;	 Catch:{ NumberFormatException -> 0x00eb }
        r5 = 4;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x00eb }
        r0 = r0.equals(r3);	 Catch:{ NumberFormatException -> 0x00eb }
        if (r0 == 0) goto L_0x006d;
    L_0x004e:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00eb }
        r5 = 1;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x00eb }
        r0 = r2.containsKey(r0);	 Catch:{ NumberFormatException -> 0x00eb }
        if (r0 != 0) goto L_0x006d;
    L_0x0059:
        r0 = z;
        r0 = r0[r1];
        r0 = r2.get(r0);
        if (r0 == 0) goto L_0x006d;
    L_0x0063:
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x00ed }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00ed }
        r10.g = r0;	 Catch:{ NumberFormatException -> 0x00ed }
    L_0x006d:
        r0 = z;
        r5 = 8;
        r0 = r0[r5];
        r0 = r2.get(r0);
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x00ef }
        if (r5 != 0) goto L_0x0112;
    L_0x007f:
        r5 = r0.length();	 Catch:{ NumberFormatException -> 0x00ef }
        r5 = r5 + -1;
        r5 = r0.charAt(r5);	 Catch:{ NumberFormatException -> 0x00ef }
        r6 = 82;
        if (r5 != r6) goto L_0x00f3;
    L_0x008d:
        r0 = r1;
    L_0x008e:
        r5 = z;
        r6 = 7;
        r5 = r5[r6];
        r3 = r5.equals(r3);
        if (r3 == 0) goto L_0x00d0;
    L_0x0099:
        r3 = h;
        a(r11, r3);
        c(r11);
        r3 = new com.whatsapp.util.cu;
        r3.<init>(r11, r0);
        r5 = z;
        r6 = 5;
        r5 = r5[r6];
        r2 = r2.get(r5);
        r5 = z;
        r6 = 6;
        r5 = r5[r6];
        r2 = r5.equals(r2);
        if (r2 == 0) goto L_0x00ca;
    L_0x00ba:
        r2 = new java.io.BufferedInputStream;
        r5 = new java.util.zip.InflaterInputStream;
        r5.<init>(r3);
        r2.<init>(r5);
        r3 = 0;
        r10.a(r2, r3);	 Catch:{ NumberFormatException -> 0x0115 }
        if (r4 == 0) goto L_0x00ce;
    L_0x00ca:
        r2 = (long) r0;	 Catch:{ NumberFormatException -> 0x0115 }
        r11.skip(r2);	 Catch:{ NumberFormatException -> 0x0115 }
    L_0x00ce:
        if (r4 == 0) goto L_0x00d4;
    L_0x00d0:
        r2 = (long) r0;
        r11.skip(r2);	 Catch:{ NumberFormatException -> 0x0117 }
    L_0x00d4:
        if (r12 == 0) goto L_0x00db;
    L_0x00d6:
        r0 = i;	 Catch:{ NumberFormatException -> 0x0119 }
        a(r11, r0);	 Catch:{ NumberFormatException -> 0x0119 }
    L_0x00db:
        if (r4 == 0) goto L_0x0006;
    L_0x00dd:
        return;
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r2 = r11.read();
        r3 = r2;
        goto L_0x0024;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = move-exception;
        throw r0;
    L_0x00ed:
        r0 = move-exception;
        throw r0;
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00f8 }
        goto L_0x008e;
    L_0x00f8:
        r5 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 2;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r0 = r5.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x0112:
        r0 = r1;
        goto L_0x008e;
    L_0x0115:
        r0 = move-exception;
        throw r0;
    L_0x0117:
        r0 = move-exception;
        throw r0;
    L_0x0119:
        r0 = move-exception;
        throw r0;
    L_0x011b:
        r2 = r0;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.i.a(java.io.InputStream, boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(java.lang.String r9) {
        /*
        r8 = this;
        r7 = 35;
        r0 = 0;
        r1 = com.whatsapp.util.Log.h;
        r2 = android.text.TextUtils.isEmpty(r9);	 Catch:{ NumberFormatException -> 0x0015 }
        if (r2 != 0) goto L_0x0014;
    L_0x000b:
        r2 = 0;
        r2 = r9.charAt(r2);	 Catch:{ NumberFormatException -> 0x0017 }
        r3 = 47;
        if (r2 == r3) goto L_0x0019;
    L_0x0014:
        return r9;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r2 = 35;
        r2 = r9.indexOf(r2);	 Catch:{ NumberFormatException -> 0x0058 }
        if (r2 < 0) goto L_0x0014;
    L_0x0021:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r9.length();
    L_0x002a:
        if (r0 >= r3) goto L_0x0053;
    L_0x002c:
        r4 = r9.charAt(r0);
        if (r4 != r7) goto L_0x004c;
    L_0x0032:
        r5 = r3 + -3;
        if (r0 > r5) goto L_0x004c;
    L_0x0036:
        r5 = r0 + 1;
        r6 = r0 + 3;
        r5 = r9.substring(r5, r6);
        r6 = 16;
        r5 = java.lang.Integer.parseInt(r5, r6);
        r5 = (char) r5;
        r2.append(r5);	 Catch:{ NumberFormatException -> 0x005a }
        r0 = r0 + 2;
        if (r1 == 0) goto L_0x004f;
    L_0x004c:
        r2.append(r4);	 Catch:{ NumberFormatException -> 0x005a }
    L_0x004f:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x002a;
    L_0x0053:
        r9 = r2.toString();
        goto L_0x0014;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.i.b(java.lang.String):java.lang.String");
    }

    public static int d(InputStream inputStream) {
        int i = Log.h;
        int read = inputStream.read();
        while (a(read)) {
            read = inputStream.read();
            if (i != 0) {
                break;
            }
        }
        return read;
    }
}
