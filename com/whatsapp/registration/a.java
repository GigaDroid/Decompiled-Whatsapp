package com.whatsapp.registration;

import android.backport.util.Base64;
import com.whatsapp.arj;
import java.util.Arrays;
import org.v;
import org.whispersystems.at;

public final class a {
    private static final byte[] b;
    private static final String[] z;
    private boolean a;
    private final byte[] c;
    private int d;

    public int hashCode() {
        if (this.a) {
            return this.d;
        }
        this.d = Arrays.hashCode(this.c);
        this.a = true;
        return this.d;
    }

    static {
        String[] strArr = new String[6];
        String str = "yq,;?";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 44;
                        break;
                    case at.g /*1*/:
                        i4 = 37;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i4 = 22;
                        break;
                    default:
                        i4 = 7;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "yq,;?";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0003W\u000fe(HW\u000bafNI\u000f;oHU\u00039fNJ\u001fbX@J\ry)\\K\r";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "OJ\u00078pDD\u001eef\\U";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "dh+UTdd[";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    char[] toCharArray2 = "|N>aL\u007f\u007f\u001bCamp\u0013D7^u;.ouoZaI_t;%c{\u0014A%ToK\u0013B_eC/W\u007fTv]#A[N.p3\u001bR$`(O\u001d\u001aF4\\\u0015-NL~\u0013%YVAM\u0013SU[]]\"a[\u00148OTy\u0014Z_3^\u0014\roEza\bDM\u0018\u0015\u001a\u007fcFh^'@\u001dl[yI".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i5 = 0; length2 > i5; i5++) {
                        char c2 = cArr2[i5];
                        switch (i5 % 5) {
                            case v.m /*0*/:
                                i = 44;
                                break;
                            case at.g /*1*/:
                                i = 37;
                                break;
                            case at.i /*2*/:
                                i = arj.Theme_ratingBarStyle;
                                break;
                            case at.o /*3*/:
                                i = 22;
                                break;
                            default:
                                i = 7;
                                break;
                        }
                        cArr2[i5] = (char) (i ^ c2);
                    }
                    b = Base64.decode(new String(cArr2).intern(), 0);
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0003W\u000fe(HW\u000bafNI\u000f;oHU\u0003;q\u0018\n\u000bthYQ5zhKJDfiK";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private a(byte[] bArr) {
        this.c = bArr;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass().equals(obj.getClass()) && Arrays.equals(this.c, ((a) obj).c));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.registration.a a(android.content.Context r9, java.lang.String r10) {
        /*
        r8 = 3;
        r1 = 0;
        r0 = 0;
        r4 = com.whatsapp.registration.CodeInputField.b;
        r2 = com.whatsapp.App.j;	 Catch:{ IOException -> 0x0013 }
        if (r2 != r8) goto L_0x0015;
    L_0x0009:
        r0 = new com.whatsapp.registration.a;	 Catch:{ IOException -> 0x0013 }
        r1 = 20;
        r1 = new byte[r1];	 Catch:{ IOException -> 0x0013 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0013 }
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r5 = new java.io.ByteArrayOutputStream;
        r5.<init>();
        r2 = r9.getPackageName();
        if (r2 == 0) goto L_0x0012;
    L_0x0020:
        r3 = z;	 Catch:{ IOException -> 0x00bf }
        r6 = 4;
        r3 = r3[r6];	 Catch:{ IOException -> 0x00bf }
        r3 = r3.equals(r2);	 Catch:{ IOException -> 0x00bf }
        if (r3 == 0) goto L_0x0012;
    L_0x002b:
        r3 = z;	 Catch:{ IOException -> 0x00c3 }
        r6 = 0;
        r3 = r3[r6];	 Catch:{ IOException -> 0x00c3 }
        r2 = r2.getBytes(r3);	 Catch:{ IOException -> 0x00c3 }
        r5.write(r2);	 Catch:{ IOException -> 0x00c3 }
        r2 = com.whatsapp.registration.a.class;
        r3 = z;
        r3 = r3[r8];
        r2 = r2.getResourceAsStream(r3);
        if (r2 != 0) goto L_0x00fb;
    L_0x0043:
        r2 = com.whatsapp.registration.a.class;
        r3 = z;
        r6 = 1;
        r3 = r3[r6];
        r2 = r2.getResourceAsStream(r3);
        r3 = r2;
    L_0x004f:
        if (r3 == 0) goto L_0x0012;
    L_0x0051:
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r6 = new byte[r2];
        r2 = r3.read(r6);	 Catch:{ IOException -> 0x00ca, all -> 0x00d3 }
    L_0x0059:
        r7 = -1;
        if (r2 == r7) goto L_0x0066;
    L_0x005c:
        r7 = 0;
        r5.write(r6, r7, r2);	 Catch:{ IOException -> 0x00ca, all -> 0x00d3 }
        r2 = r3.read(r6);	 Catch:{ IOException -> 0x00ca, all -> 0x00d3 }
        if (r4 == 0) goto L_0x0059;
    L_0x0066:
        r3.close();	 Catch:{ IOException -> 0x00f6 }
    L_0x0069:
        r2 = r5.toByteArray();
        r3 = b;
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r2 = com.whatsapp.ve.a(r2, r3, r5, r6);
        r3 = z;	 Catch:{ NoSuchAlgorithmException -> 0x00d8 }
        r5 = 5;
        r3 = r3[r5];	 Catch:{ NoSuchAlgorithmException -> 0x00d8 }
        r3 = javax.crypto.Mac.getInstance(r3);	 Catch:{ NoSuchAlgorithmException -> 0x00d8 }
        r3.init(r2);	 Catch:{ InvalidKeyException -> 0x00df }
        r2 = com.whatsapp.util.aq.a(r9);
        if (r2 == 0) goto L_0x0012;
    L_0x0089:
        r5 = r2.length;	 Catch:{ IOException -> 0x00e6 }
        if (r5 == 0) goto L_0x0012;
    L_0x008c:
        r5 = r2.length;
        r0 = r1;
    L_0x008e:
        if (r0 >= r5) goto L_0x009d;
    L_0x0090:
        r1 = r2[r0];
        r1 = r1.toByteArray();
        r3.update(r1);
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x008e;
    L_0x009d:
        r0 = com.whatsapp.App.am;
        if (r8 != r0) goto L_0x00ea;
    L_0x00a1:
        r0 = 16;
        r0 = new byte[r0];
    L_0x00a5:
        r3.update(r0);
        r0 = z;	 Catch:{ UnsupportedEncodingException -> 0x00ef }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ UnsupportedEncodingException -> 0x00ef }
        r0 = r10.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x00ef }
        r3.update(r0);
        r0 = new com.whatsapp.registration.a;
        r1 = r3.doFinal();
        r0.<init>(r1);
        goto L_0x0012;
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;
    L_0x00c3:
        r0 = move-exception;
        r1 = new java.lang.Error;
        r1.<init>(r0);
        throw r1;
    L_0x00ca:
        r1 = move-exception;
        r3.close();	 Catch:{ IOException -> 0x00d0 }
        goto L_0x0012;
    L_0x00d0:
        r1 = move-exception;
        goto L_0x0012;
    L_0x00d3:
        r0 = move-exception;
        r3.close();	 Catch:{ IOException -> 0x00f9 }
    L_0x00d7:
        throw r0;
    L_0x00d8:
        r0 = move-exception;
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
    L_0x00df:
        r0 = move-exception;
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        throw r0;
    L_0x00ea:
        r0 = com.whatsapp.ve.a(r9);
        goto L_0x00a5;
    L_0x00ef:
        r0 = move-exception;
        r1 = new java.lang.Error;
        r1.<init>(r0);
        throw r1;
    L_0x00f6:
        r2 = move-exception;
        goto L_0x0069;
    L_0x00f9:
        r1 = move-exception;
        goto L_0x00d7;
    L_0x00fb:
        r3 = r2;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.a.a(android.content.Context, java.lang.String):com.whatsapp.registration.a");
    }

    public String toString() {
        return Base64.encodeToString(this.c, 2);
    }
}
