package com;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import com.whatsapp.arj;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class a {
    private static final byte[] a;
    public static boolean b;
    private static final String[] z;

    static byte[] b() {
        return a();
    }

    private static String g() {
        try {
            return (String) Build.class.getField(z[2]).get(null);
        } catch (Exception e) {
            return null;
        }
    }

    static {
        String[] strArr = new String[16];
        String str = "$ \u001a \fQ\u00112n[\u0015\u001d2j\u0014\u001f\u001b(-G\u0004\u0004,bF\u0005\u00118";
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
                        i3 = 113;
                        break;
                    case at.g /*1*/:
                        i3 = 116;
                        break;
                    case at.i /*2*/:
                        i3 = 92;
                        break;
                    case at.o /*3*/:
                        i3 = 13;
                        break;
                    default:
                        i3 = 52;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\"1\u000eDu=";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "#5\u0012Ik\u001d\u001b=ik\u0017\u001d0h";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "#5\u0012Ik\u0002\u00119i";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "7\u00155aQ\u0015T(b\u0014\u0002\u00119i\u0014>\u00049cg\"8|]f?3";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "^\u00109{\u001b\u0004\u0006=cP\u001e\u0019";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "$\u001a9uD\u0014\u0017(hPQ\u001a)`V\u0014\u0006|bRQ\u0016%yQ\u0002T.hU\u0015T:\u007f[\u001cT\u0010dZ\u0004\f|]f?3f-";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001e\u0006;#U\u0001\u0015?eQ_\u001c=\u007fY\u001e\u001a%#L\u001f\u0011(#D\u0003\u001b*dP\u0014\u0006rgG\u0002\u0011rCU\u0005\u001d*hw\u0003\r,y[";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001e\u0006;#U\u0001\u0015?eQ_\u001c=\u007fY\u001e\u001a%#L\u001f\u0011(#D\u0003\u001b*dP\u0014\u0006rgG\u0002\u0011rCU\u0005\u001d*hw\u0003\r,y[";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001f\u0011+-g\u0014\u0017)\u007fQ#\u00152i[\u001c\\u-V\u0010\u00177hPQ\u0016%-C\u0003\u001b2j\u0014!\u00063{]\u0015\u0011.7\u0014";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\"\u0011?xF\u0014&=cP\u001e\u0019rjQ\u0005=2~@\u0010\u001a?h\u001cS'\u0014L\u0005!&\u0012J\u0016XT>lW\u001a\u00118-V\bT+\u007f[\u001f\u0013|]F\u001e\u00025iQ\u0003N|";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\"\u0011?xF\u0014&=cP\u001e\u0019r^|0E\f_z6";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    str = "\"<\u001d<d#:\u001b-Z\u001e\u0000|lB\u0010\u001d0lV\u001d\u0011";
                    obj = 12;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    strArr2 = strArr3;
                    str = "\"<\u001d<d#:\u001b";
                    obj = 13;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "7\u00155aQ\u0015T(b\u0014\u0016\u00112hF\u0010\u00009-G\u0014\u00118";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = f();
                    return;
                default:
                    strArr2[i] = str;
                    str = "$ \u001a \f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void e() {
        c();
        d();
    }

    private static byte[] f() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            try {
                stringBuilder.append(str);
            } catch (UnsupportedEncodingException e) {
                throw e;
            }
        }
        str = g();
        if (str != null) {
            try {
                stringBuilder.append(str);
            } catch (UnsupportedEncodingException e2) {
                throw e2;
            }
        }
        try {
            return stringBuilder.toString().getBytes(z[1]);
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException(z[0]);
        }
    }

    private static void c() {
        try {
            if (VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 18) {
                try {
                    Class.forName(z[9]).getMethod(z[4], new Class[]{byte[].class}).invoke(null, new Object[]{a()});
                    int intValue = ((Integer) Class.forName(z[8]).getMethod(z[3], new Class[]{String.class, Long.TYPE}).invoke(null, new Object[]{z[6], Integer.valueOf(1024)})).intValue();
                    if (intValue != 1024) {
                        throw new IOException(z[7] + intValue);
                    }
                } catch (Exception e) {
                    throw e;
                } catch (Throwable e2) {
                    throw new SecurityException(z[5], e2);
                }
            }
        } catch (Exception e3) {
            throw e3;
        } catch (Exception e32) {
            throw e32;
        }
    }

    private static byte[] a() {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(a);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            throw new SecurityException(z[15], e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void d() {
        /*
        r2 = 1;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NoSuchAlgorithmException -> 0x0008 }
        r1 = 18;
        if (r0 <= r1) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = z;
        r1 = 12;
        r0 = r0[r1];
        r0 = java.security.Security.getProviders(r0);
        if (r0 == 0) goto L_0x0028;
    L_0x0016:
        r1 = r0.length;	 Catch:{ NoSuchAlgorithmException -> 0x006d }
        if (r1 < r2) goto L_0x0028;
    L_0x0019:
        r1 = com.c.class;
        r2 = 0;
        r0 = r0[r2];	 Catch:{ NoSuchAlgorithmException -> 0x006f }
        r0 = r0.getClass();	 Catch:{ NoSuchAlgorithmException -> 0x006f }
        r0 = r1.equals(r0);	 Catch:{ NoSuchAlgorithmException -> 0x006f }
        if (r0 != 0) goto L_0x0031;
    L_0x0028:
        r0 = new com.c;	 Catch:{ NoSuchAlgorithmException -> 0x0071 }
        r0.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x0071 }
        r1 = 1;
        java.security.Security.insertProviderAt(r0, r1);	 Catch:{ NoSuchAlgorithmException -> 0x0071 }
    L_0x0031:
        r0 = new java.security.SecureRandom;
        r0.<init>();
        r1 = com.c.class;
        r2 = r0.getProvider();	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r2 = r2.getClass();	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r1 = r1.equals(r2);	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        if (r1 != 0) goto L_0x0073;
    L_0x0046:
        r1 = new java.lang.SecurityException;	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r2 = new java.lang.StringBuilder;	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r2.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r3 = z;	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r2 = r2.append(r3);	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r0 = r0.getProvider();	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r0 = r0.getClass();	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r0 = r2.append(r0);	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r0 = r0.toString();	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        r1.<init>(r0);	 Catch:{ NoSuchAlgorithmException -> 0x006b }
        throw r1;	 Catch:{ NoSuchAlgorithmException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchAlgorithmException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchAlgorithmException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = z;	 Catch:{ NoSuchAlgorithmException -> 0x00b4 }
        r1 = 14;
        r0 = r0[r1];	 Catch:{ NoSuchAlgorithmException -> 0x00b4 }
        r0 = java.security.SecureRandom.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00b4 }
        r1 = com.c.class;
        r2 = r0.getProvider();	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r2 = r2.getClass();	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r1 = r1.equals(r2);	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        if (r1 != 0) goto L_0x0007;
    L_0x008d:
        r1 = new java.lang.SecurityException;	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r2.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r3 = z;	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r2 = r2.append(r3);	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r0 = r0.getProvider();	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r0 = r0.getClass();	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r0 = r2.append(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r0 = r0.toString();	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        r1.<init>(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
        throw r1;	 Catch:{ NoSuchAlgorithmException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r0 = move-exception;
        r1 = new java.lang.SecurityException;
        r2 = z;
        r3 = 13;
        r2 = r2[r3];
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.d():void");
    }
}
