import android.content.ContentValues;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class h implements k {
    public static String h;
    private static String i;
    private static final String[] z;
    private String a;
    private String b;
    private String c;
    public List d;
    private int e;
    private boolean f;
    private s g;
    private m j;

    private String a(List list) {
        boolean z = m.e;
        int size = list.size();
        if (size > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String append : list) {
                stringBuilder.append(append).append(";");
                if (z) {
                    break;
                }
            }
            size = stringBuilder.length();
            if (size > 0) {
                try {
                    if (stringBuilder.charAt(size - 1) == ';') {
                        return stringBuilder.substring(0, size - 1);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
            return stringBuilder.toString();
        } else if (size != 1) {
            return "";
        } else {
            try {
                return (String) list.get(0);
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        boolean z = m.e;
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 61) {
                i++;
                try {
                    int a = a(bArr[i]);
                    i++;
                    byteArrayOutputStream.write((char) ((a << 4) + a(bArr[i])));
                } catch (Throwable e) {
                    throw new n(z[11], e);
                }
            }
            byteArrayOutputStream.write(b);
            i++;
            if (z) {
                break;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r4) {
        /*
        r3 = this;
        r0 = r3.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002a }
        if (r0 == 0) goto L_0x0012;
    L_0x0004:
        r0 = r3.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002c }
        r1 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002c }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002c }
        r0 = r0.equalsIgnoreCase(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002c }
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r3.j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
        r0 = r0.d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
        r0.add(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
        r0 = m.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
        if (r0 == 0) goto L_0x0026;
    L_0x001d:
        r0 = r3.j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
        r0 = r0.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
        r1 = r3.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
        r0.put(r1, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
    L_0x0026:
        r0 = 0;
        r3.a = r0;
        return;
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b(java.lang.String):void");
    }

    public void e(String str) {
        this.a = str;
    }

    public void d() {
    }

    public void a() {
        ((s) this.d.get(this.e)).a = 0;
        while (this.e > 0) {
            this.e--;
            if (((s) this.d.get(this.e)).a == 1) {
                break;
            }
        }
        this.g = (s) this.d.get(this.e);
    }

    private String a(String str, String str2) {
        try {
            if (this.c.equalsIgnoreCase(str2)) {
                return str;
            }
            ByteBuffer encode = Charset.forName(this.c).encode(str);
            byte[] bArr = new byte[encode.remaining()];
            encode.get(bArr);
            try {
                return new String(bArr, str2);
            } catch (UnsupportedEncodingException e) {
                Log.e(z[0] + str2);
                return new String(bArr);
            }
        } catch (UnsupportedEncodingException e2) {
            throw e2;
        }
    }

    public h() {
        this(h, h, false);
    }

    public void a(String str) {
        this.j.h.add(str);
    }

    private static int a(byte b) {
        int digit = Character.digit((char) b, 16);
        if (digit != -1) {
            return digit;
        }
        try {
            throw new n(z[10] + b);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public void c(String str) {
        this.j.a = str;
    }

    public void c() {
        this.g.c.add(this.j);
    }

    public void d(String str) {
        boolean z = m.e;
        s sVar = new s();
        try {
            sVar.a = 1;
            sVar.b = str;
            this.d.add(sVar);
            this.e = this.d.size() - 1;
            this.g = (s) this.d.get(this.e);
            if (WAAppCompatActivity.c != 0) {
                m.e = !z;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public void m1045a(List list) {
        boolean z = m.e;
        if (list != null) {
            try {
                if (list.size() != 0) {
                    String str;
                    ContentValues contentValues = this.j.b;
                    String str2 = h;
                    String asString = contentValues.getAsString(z[12]);
                    if (str2 != null) {
                        try {
                            if (str2.length() != 0) {
                                str = str2;
                                for (String str22 : list) {
                                    this.j.f.add(a(str22, str, asString));
                                    if (z) {
                                        break;
                                    }
                                }
                                this.j.c = a(this.j.f);
                                return;
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw e;
                        }
                    }
                    str = this.b;
                    while (r4.hasNext()) {
                        this.j.f.add(a(str22, str, asString));
                        if (z) {
                            break;
                            this.j.c = a(this.j.f);
                            return;
                        }
                    }
                    this.j.c = a(this.j.f);
                    return;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        }
        this.j.g = null;
        this.j.f.clear();
        this.j.f.add("");
        this.j.c = "";
    }

    public void e() {
        this.j = new m();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
        r2 = this;
        r0 = m.e;
        r2.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2.d = r1;
        r1 = 0;
        r2.e = r1;
        if (r3 == 0) goto L_0x0015;
    L_0x0011:
        r2.c = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0026 }
        if (r0 == 0) goto L_0x0019;
    L_0x0015:
        r1 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0026 }
        r2.c = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0026 }
    L_0x0019:
        if (r4 == 0) goto L_0x001f;
    L_0x001b:
        r2.b = r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0028 }
        if (r0 == 0) goto L_0x0023;
    L_0x001f:
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0028 }
        r2.b = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0028 }
    L_0x0023:
        r2.f = r5;
        return;
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: h.<init>(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
        r11 = this;
        r9 = 10;
        r3 = 0;
        r4 = m.e;
        if (r14 == 0) goto L_0x016b;
    L_0x0007:
        r0 = z;	 Catch:{ UnsupportedEncodingException -> 0x0029 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ UnsupportedEncodingException -> 0x0029 }
        r0 = r14.equals(r0);	 Catch:{ UnsupportedEncodingException -> 0x0029 }
        if (r0 != 0) goto L_0x001b;
    L_0x0012:
        r0 = "B";
        r0 = r14.equals(r0);	 Catch:{ UnsupportedEncodingException -> 0x002b }
        if (r0 == 0) goto L_0x002f;
    L_0x001b:
        r0 = r11.j;	 Catch:{ UnsupportedEncodingException -> 0x002d }
        r1 = r12.getBytes();	 Catch:{ UnsupportedEncodingException -> 0x002d }
        r2 = 0;
        r1 = android.backport.util.Base64.decode(r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x002d }
        r0.g = r1;	 Catch:{ UnsupportedEncodingException -> 0x002d }
    L_0x0028:
        return r12;
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        r0 = r14.equals(r0);
        if (r0 == 0) goto L_0x016b;
    L_0x003a:
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        r1 = " ";
        r0 = r12.replaceAll(r0, r1);
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r2 = "\t";
        r5 = r0.replaceAll(r1, r2);
        r0 = r11.f;
        if (r0 == 0) goto L_0x0061;
    L_0x0056:
        r0 = z;
        r1 = 6;
        r0 = r0[r1];
        r0 = r5.split(r0);
        if (r4 == 0) goto L_0x00c7;
    L_0x0061:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r6 = r5.length();
        r7 = new java.util.ArrayList;
        r7.<init>();
        r1 = r3;
    L_0x0070:
        if (r1 >= r6) goto L_0x00b2;
    L_0x0072:
        r8 = r5.charAt(r1);
        if (r8 != r9) goto L_0x0182;
    L_0x0078:
        r0 = r0.toString();
        r7.add(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        if (r4 == 0) goto L_0x00ae;
    L_0x0086:
        r2 = r0;
    L_0x0087:
        r0 = 13;
        if (r8 != r0) goto L_0x017e;
    L_0x008b:
        r0 = r2.toString();
        r7.add(r0);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r6 + -1;
        if (r1 >= r0) goto L_0x017b;
    L_0x009b:
        r0 = r1 + 1;
        r0 = r5.charAt(r0);
        if (r0 != r9) goto L_0x0178;
    L_0x00a3:
        r0 = r1 + 1;
    L_0x00a5:
        if (r4 == 0) goto L_0x0174;
    L_0x00a7:
        r1 = r2;
    L_0x00a8:
        r1.append(r8);	 Catch:{ UnsupportedEncodingException -> 0x0122 }
        r10 = r0;
        r0 = r1;
        r1 = r10;
    L_0x00ae:
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0070;
    L_0x00b2:
        r0 = r0.toString();
        r1 = r0.length();	 Catch:{ UnsupportedEncodingException -> 0x0124 }
        if (r1 <= 0) goto L_0x00bf;
    L_0x00bc:
        r7.add(r0);	 Catch:{ UnsupportedEncodingException -> 0x0124 }
    L_0x00bf:
        r0 = new java.lang.String[r3];
        r0 = r7.toArray(r0);
        r0 = (java.lang.String[]) r0;
    L_0x00c7:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r0.length;
        r2 = r3;
    L_0x00ce:
        if (r2 >= r6) goto L_0x00ec;
    L_0x00d0:
        r1 = r0[r2];
        r7 = "=";
        r7 = r1.endsWith(r7);
        if (r7 == 0) goto L_0x00e5;
    L_0x00db:
        r7 = r1.length();
        r7 = r7 + -1;
        r1 = r1.substring(r3, r7);
    L_0x00e5:
        r5.append(r1);
        r1 = r2 + 1;
        if (r4 == 0) goto L_0x0171;
    L_0x00ec:
        r0 = r5.toString();	 Catch:{ UnsupportedEncodingException -> 0x0126 }
        r1 = r11.c;	 Catch:{ UnsupportedEncodingException -> 0x0126 }
        r0 = r0.getBytes(r1);	 Catch:{ UnsupportedEncodingException -> 0x0126 }
    L_0x00f6:
        r0 = a(r0);	 Catch:{ n -> 0x014c }
        r12 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0101 }
        r12.<init>(r0, r13);	 Catch:{ UnsupportedEncodingException -> 0x0101 }
        goto L_0x0028;
    L_0x0101:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r13);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        r12 = new java.lang.String;
        r12.<init>(r0);
        goto L_0x0028;
    L_0x0122:
        r0 = move-exception;
        throw r0;
    L_0x0124:
        r0 = move-exception;
        throw r0;
    L_0x0126:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.c;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r5.toString();
        r0 = r0.getBytes();
        goto L_0x00f6;
    L_0x014c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r12 = "";
        goto L_0x0028;
    L_0x016b:
        r12 = r11.a(r12, r13);
        goto L_0x0028;
    L_0x0171:
        r2 = r1;
        goto L_0x00ce;
    L_0x0174:
        r1 = r0;
        r0 = r2;
        goto L_0x00ae;
    L_0x0178:
        r0 = r1;
        goto L_0x00a5;
    L_0x017b:
        r0 = r2;
        goto L_0x00ae;
    L_0x017e:
        r0 = r1;
        r1 = r2;
        goto L_0x00a8;
    L_0x0182:
        r2 = r0;
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public void b() {
    }

    static {
        Object obj = -1;
        String[] strArr = new String[13];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "cR#\u0010BA\u0013>\u0013\u0007@])\u0013C@\tj\u001fODA9\u0019S\u0018";
        Object obj2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 37;
                        break;
                    case at.g /*1*/:
                        i3 = 51;
                        break;
                    case at.i /*2*/:
                        i3 = 74;
                        break;
                    case at.o /*3*/:
                        i3 = 124;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "tf\u0005(ba\u001e\u001a.nkg\u000b>k`";
                    i = 2;
                    strArr2 = strArr3;
                    obj2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0018\u0013";
                    i = 3;
                    strArr2 = strArr3;
                    obj2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "gr\u00199\u0011\u0011";
                    obj2 = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "cR#\u0010BA\u0013>\u0013\u0007AV)\u0013C@\u0013;\tHQV.QWWZ$\bFG_/F\u0007";
                    obj2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "(9";
                    obj2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0018:";
                    obj2 = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "cR#\u0010BA\u0013>\u0013\u0007@])\u0013C@\tj\u001fODA9\u0019S\u0018";
                    obj2 = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "qj\u001a9";
                    obj2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "l]<\u001dKLWj)ui\u0013/\u0012DJW#\u0012@\u001f\u0013$\u0013S\u0005Rj\nFIZ.\\CLT#\b\u0007\rA+\u0018N]\u0013{J\u000e\u001f\u0013";
                    obj2 = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "l]<\u001dKLWj\rRJG/\u0018\nUA#\u0012SDQ&\u0019\u0007@])\u0013CL]-";
                    obj2 = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "`}\t3cl}\r";
                    obj2 = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    String str2 = "sw\u000b(fgF#\u0010C@A";
                    while (true) {
                        char[] toCharArray2 = str2.toCharArray();
                        int length2 = toCharArray2.length;
                        char[] cArr2 = toCharArray2;
                        for (int i4 = 0; length2 > i4; i4++) {
                            int i5;
                            char c2 = cArr2[i4];
                            switch (i4 % 5) {
                                case v.m /*0*/:
                                    i5 = 37;
                                    break;
                                case at.g /*1*/:
                                    i5 = 51;
                                    break;
                                case at.i /*2*/:
                                    i5 = 74;
                                    break;
                                case at.o /*3*/:
                                    i5 = 124;
                                    break;
                                default:
                                    i5 = 39;
                                    break;
                            }
                            cArr2[i4] = (char) (i5 ^ c2);
                        }
                        str2 = new String(cArr2).intern();
                        switch (obj) {
                            case v.m /*0*/:
                                h = str2;
                                return;
                            default:
                                i = str2;
                                str2 = "pg\fQ\u001f";
                                obj = null;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "cR#\u0010BA\u0013>\u0013\u0007@])\u0013C@\tj\u001fODA9\u0019S\u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj2 = null;
                    break;
            }
        }
    }
}
