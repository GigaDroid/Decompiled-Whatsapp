package com.google;

import com.whatsapp.arj;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import org.v;
import org.whispersystems.at;

public class eE implements Closeable, Flushable {
    public static int h;
    private static final String[] i;
    private static final String[] l;
    private static final String[] z;
    private int[] a;
    private boolean b;
    private final Writer c;
    private boolean d;
    private boolean e;
    private String f;
    private int g;
    private String j;
    private String k;

    public eE a() {
        i();
        return a(3, "{");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r4) {
        /*
        r3 = this;
        r0 = h;
        r1 = r3.f();	 Catch:{ NullPointerException -> 0x0028 }
        switch(r1) {
            case 1: goto L_0x0045;
            case 2: goto L_0x004e;
            case 3: goto L_0x0009;
            case 4: goto L_0x005a;
            case 5: goto L_0x0009;
            case 6: goto L_0x002a;
            case 7: goto L_0x0016;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NullPointerException -> 0x0014 }
        r1 = z;	 Catch:{ NullPointerException -> 0x0014 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0014 }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x0014 }
        throw r0;	 Catch:{ NullPointerException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r1 = r3.b;	 Catch:{ NullPointerException -> 0x0026 }
        if (r1 != 0) goto L_0x002a;
    L_0x001a:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NullPointerException -> 0x0026 }
        r1 = z;	 Catch:{ NullPointerException -> 0x0026 }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0026 }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x0026 }
        throw r0;	 Catch:{ NullPointerException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0026 }
    L_0x002a:
        r1 = r3.b;	 Catch:{ NullPointerException -> 0x003d }
        if (r1 != 0) goto L_0x003f;
    L_0x002e:
        if (r4 != 0) goto L_0x003f;
    L_0x0030:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NullPointerException -> 0x003b }
        r1 = z;	 Catch:{ NullPointerException -> 0x003b }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x003b }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x003b }
        throw r0;	 Catch:{ NullPointerException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003b }
    L_0x003f:
        r1 = 7;
        r3.b(r1);	 Catch:{ NullPointerException -> 0x0068 }
        if (r0 == 0) goto L_0x0067;
    L_0x0045:
        r1 = 2;
        r3.b(r1);	 Catch:{ NullPointerException -> 0x006a }
        r3.d();	 Catch:{ NullPointerException -> 0x006a }
        if (r0 == 0) goto L_0x0067;
    L_0x004e:
        r1 = r3.c;	 Catch:{ NullPointerException -> 0x006c }
        r2 = 44;
        r1.append(r2);	 Catch:{ NullPointerException -> 0x006c }
        r3.d();	 Catch:{ NullPointerException -> 0x006c }
        if (r0 == 0) goto L_0x0067;
    L_0x005a:
        r1 = r3.c;	 Catch:{ NullPointerException -> 0x0014 }
        r2 = r3.f;	 Catch:{ NullPointerException -> 0x0014 }
        r1.append(r2);	 Catch:{ NullPointerException -> 0x0014 }
        r1 = 5;
        r3.b(r1);	 Catch:{ NullPointerException -> 0x0014 }
        if (r0 != 0) goto L_0x0009;
    L_0x0067:
        return;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0014 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eE.c(boolean):void");
    }

    public eE c() {
        i();
        return a(1, "[");
    }

    public eE(Writer writer) {
        this.a = new int[32];
        this.g = 0;
        a(6);
        this.f = ":";
        this.e = true;
        if (writer == null) {
            throw new NullPointerException(z[19]);
        }
        this.c = writer;
    }

    public void flush() {
        try {
            if (this.g == 0) {
                throw new IllegalStateException(z[20]);
            }
            this.c.flush();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.eE a(java.lang.Number r5) {
        /*
        r4 = this;
        if (r5 != 0) goto L_0x0009;
    L_0x0002:
        r4 = r4.b();	 Catch:{ NullPointerException -> 0x0007 }
    L_0x0006:
        return r4;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        r4.i();
        r0 = r5.toString();
        r1 = r4.b;	 Catch:{ NullPointerException -> 0x0057 }
        if (r1 != 0) goto L_0x005d;
    L_0x0014:
        r1 = z;	 Catch:{ NullPointerException -> 0x0059 }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0059 }
        r1 = r0.equals(r1);	 Catch:{ NullPointerException -> 0x0059 }
        if (r1 != 0) goto L_0x0038;
    L_0x0020:
        r1 = z;	 Catch:{ NullPointerException -> 0x005b }
        r2 = 15;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x005b }
        r1 = r0.equals(r1);	 Catch:{ NullPointerException -> 0x005b }
        if (r1 != 0) goto L_0x0038;
    L_0x002c:
        r1 = z;	 Catch:{ NullPointerException -> 0x0055 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0055 }
        r1 = r0.equals(r1);	 Catch:{ NullPointerException -> 0x0055 }
        if (r1 == 0) goto L_0x005d;
    L_0x0038:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ NullPointerException -> 0x0055 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0055 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x0055 }
        r2 = z;	 Catch:{ NullPointerException -> 0x0055 }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0055 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0055 }
        r1 = r1.append(r5);	 Catch:{ NullPointerException -> 0x0055 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0055 }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x0055 }
        throw r0;	 Catch:{ NullPointerException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0055 }
    L_0x005d:
        r1 = 0;
        r4.c(r1);
        r1 = r4.c;
        r1.append(r0);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eE.a(java.lang.Number):com.google.eE");
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[21];
        char[] toCharArray = "h[rr".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "zHkd\u000e".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "RLtc\u0002rN'g\u0019sKkr\u00062".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "@\\5'Y%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "@\\5'Y$".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "UGdx\u0006lEbc\u000e<Mht\u001eqLic".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "RLtc\u0002rN'g\u0019sKkr\u00062".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "VzHYKq\\tcKo]fe\u001f<^nc\u0003<Hi7\nn[fnKs['v\u0005<Fe}\u000e\u007f])".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "VzHYKq\\tcKtHqrKsGknKsGb7\u001fsY*{\u000ejLk7\u001d}ErrE".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "r\\k{".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "RLtc\u0002rN'g\u0019sKkr\u00062".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "XHip\u0007uG`7\u0005}Db-K".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "1`iq\u0002r@sn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "RHI".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "R\\jr\u0019uJ'a\np\\bdKq\\tcK~L'q\u0002r@srG<KrcKkHt7".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = "UGa~\u0005u]~".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "VZhy<n@sr\u0019<@t7\bpFtr\u000f2".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "VZhy<n@sr\u0019<@t7\bpFtr\u000f2".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        toCharArray = "rHjrK!\u0014'y\u001epE".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[18] = new String(cArr).intern();
        toCharArray = "s\\s7V!\tib\u0007p".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[19] = new String(cArr).intern();
        toCharArray = "VZhy<n@sr\u0019<@t7\bpFtr\u000f2".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[20] = new String(cArr).intern();
        z = strArr;
        i = new String[128];
        int i3 = 0;
        while (i3 <= 31) {
            try {
                String[] strArr2 = i;
                toCharArray = "@\\\"'_d".toCharArray();
                length = toCharArray.length;
                cArr = toCharArray;
                for (i = 0; length > i; i++) {
                    c2 = cArr[i];
                    switch (i % 5) {
                        case v.m /*0*/:
                            i2 = 28;
                            break;
                        case at.g /*1*/:
                            i2 = 41;
                            break;
                        case at.i /*2*/:
                            i2 = 7;
                            break;
                        case at.o /*3*/:
                            i2 = 23;
                            break;
                        default:
                            i2 = arj.Theme_seekBarStyle;
                            break;
                    }
                    cArr[i] = (char) (i2 ^ c2);
                }
                String intern = new String(cArr).intern();
                strArr2[i3] = String.format(intern, new Object[]{Integer.valueOf(i3)});
                i3++;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        strArr = i;
        toCharArray = "@\u000b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[34] = new String(cArr).intern();
        strArr = i;
        toCharArray = "@u".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[92] = new String(cArr).intern();
        strArr = i;
        toCharArray = "@]".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        strArr = i;
        toCharArray = "@K".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        strArr = i;
        toCharArray = "@G".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        strArr = i;
        toCharArray = "@[".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        strArr = i;
        toCharArray = "@O".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        l = (String[]) i.clone();
        strArr = l;
        toCharArray = "@\\7'X\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[60] = new String(cArr).intern();
        strArr = l;
        toCharArray = "@\\7'Xy".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[62] = new String(cArr).intern();
        strArr = l;
        toCharArray = "@\\7'Y*".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[38] = new String(cArr).intern();
        strArr = l;
        toCharArray = "@\\7'Xx".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[61] = new String(cArr).intern();
        String[] strArr3 = l;
        toCharArray = "@\\7'Y+".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr3[39] = new String(cArr).intern();
    }

    private void d() {
        int i = h;
        try {
            if (this.j != null) {
                this.c.write("\n");
                int i2 = 1;
                int i3 = this.g;
                while (i2 < i3) {
                    this.c.write(this.j);
                    i2++;
                    if (i != 0) {
                        return;
                    }
                }
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public final void b(boolean z) {
        this.b = z;
    }

    private eE a(int i, int i2, String str) {
        int f = f();
        if (f == i2 || f == i) {
            try {
                if (this.k != null) {
                    throw new IllegalStateException(z[11] + this.k);
                }
                try {
                    this.g--;
                    if (f == i2) {
                        d();
                    }
                    this.c.write(str);
                    return this;
                } catch (NullPointerException e) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        try {
            throw new IllegalStateException(z[10]);
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    private void b(int i) {
        this.a[this.g - 1] = i;
    }

    public eE a(boolean z) {
        try {
            String str;
            i();
            c(false);
            Writer writer = this.c;
            if (z) {
                str = z[0];
            } else {
                str = z[1];
            }
            writer.write(str);
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public eE g() {
        return a(3, 5, "}");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r9) {
        /*
        r8 = this;
        r1 = 0;
        r4 = h;
        r0 = r8.d;	 Catch:{ NullPointerException -> 0x0061 }
        if (r0 == 0) goto L_0x0063;
    L_0x0007:
        r0 = l;	 Catch:{ NullPointerException -> 0x0061 }
    L_0x0009:
        r2 = r8.c;
        r3 = "\"";
        r2.write(r3);
        r5 = r9.length();
        r3 = r1;
    L_0x0016:
        if (r3 >= r5) goto L_0x004e;
    L_0x0018:
        r6 = r9.charAt(r3);
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r6 >= r2) goto L_0x0026;
    L_0x0020:
        r2 = r0[r6];
        if (r2 != 0) goto L_0x003a;
    L_0x0024:
        if (r4 == 0) goto L_0x004a;
    L_0x0026:
        r2 = 8232; // 0x2028 float:1.1535E-41 double:4.067E-320;
        if (r6 != r2) goto L_0x0031;
    L_0x002a:
        r2 = z;
        r7 = 4;
        r2 = r2[r7];
        if (r4 == 0) goto L_0x003a;
    L_0x0031:
        r2 = 8233; // 0x2029 float:1.1537E-41 double:4.0676E-320;
        if (r6 != r2) goto L_0x004a;
    L_0x0035:
        r2 = z;
        r6 = 3;
        r2 = r2[r6];
    L_0x003a:
        if (r1 >= r3) goto L_0x0043;
    L_0x003c:
        r6 = r8.c;	 Catch:{ NullPointerException -> 0x0066 }
        r7 = r3 - r1;
        r6.write(r9, r1, r7);	 Catch:{ NullPointerException -> 0x0066 }
    L_0x0043:
        r1 = r8.c;
        r1.write(r2);
        r1 = r3 + 1;
    L_0x004a:
        r2 = r3 + 1;
        if (r4 == 0) goto L_0x006a;
    L_0x004e:
        r0 = r1;
        if (r0 >= r5) goto L_0x0058;
    L_0x0051:
        r1 = r8.c;	 Catch:{ NullPointerException -> 0x0068 }
        r2 = r5 - r0;
        r1.write(r9, r0, r2);	 Catch:{ NullPointerException -> 0x0068 }
    L_0x0058:
        r0 = r8.c;
        r1 = "\"";
        r0.write(r1);
        return;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = i;
        goto L_0x0009;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r3 = r2;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eE.a(java.lang.String):void");
    }

    public eE c(String str) {
        if (str == null) {
            try {
                throw new NullPointerException(z[18]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            if (this.k != null) {
                throw new IllegalStateException();
            }
            try {
                if (this.g == 0) {
                    throw new IllegalStateException(z[17]);
                }
                this.k = str;
                return this;
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    private int f() {
        try {
            if (this.g != 0) {
                return this.a[this.g - 1];
            }
            throw new IllegalStateException(z[16]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void i() {
        try {
            if (this.k != null) {
                h();
                a(this.k);
                this.k = null;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public eE b(String str) {
        if (str == null) {
            try {
                this = b();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        i();
        c(false);
        a(str);
        return this;
    }

    private eE a(int i, String str) {
        c(true);
        a(i);
        this.c.write(str);
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.eE b() {
        /*
        r3 = this;
        r0 = r3.k;	 Catch:{ NullPointerException -> 0x0013 }
        if (r0 == 0) goto L_0x0019;
    L_0x0004:
        r0 = r3.e;	 Catch:{ NullPointerException -> 0x0015 }
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r3.i();	 Catch:{ NullPointerException -> 0x0017 }
        r0 = h;	 Catch:{ NullPointerException -> 0x0017 }
        if (r0 == 0) goto L_0x0019;
    L_0x000f:
        r0 = 0;
        r3.k = r0;	 Catch:{ NullPointerException -> 0x0017 }
    L_0x0012:
        return r3;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r0 = 0;
        r3.c(r0);
        r0 = r3.c;
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        r0.write(r1);
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eE.b():com.google.eE");
    }

    private void a(int i) {
        if (this.g == this.a.length) {
            Object obj = new int[(this.g * 2)];
            System.arraycopy(this.a, 0, obj, 0, this.g);
            this.a = obj;
        }
        int[] iArr = this.a;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr[i2] = i;
    }

    public eE e() {
        return a(1, 2, "]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
        r3 = this;
        r0 = r3.f();
        r1 = 5;
        if (r0 != r1) goto L_0x0012;
    L_0x0007:
        r1 = r3.c;	 Catch:{ NullPointerException -> 0x0022 }
        r2 = 44;
        r1.write(r2);	 Catch:{ NullPointerException -> 0x0022 }
        r1 = h;	 Catch:{ NullPointerException -> 0x0022 }
        if (r1 == 0) goto L_0x0024;
    L_0x0012:
        r1 = 3;
        if (r0 == r1) goto L_0x0024;
    L_0x0015:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NullPointerException -> 0x0020 }
        r1 = z;	 Catch:{ NullPointerException -> 0x0020 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0020 }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x0020 }
        throw r0;	 Catch:{ NullPointerException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0020 }
    L_0x0024:
        r3.d();
        r0 = 4;
        r3.b(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eE.h():void");
    }

    public eE a(long j) {
        i();
        c(false);
        this.c.write(Long.toString(j));
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
        r3 = this;
        r1 = 1;
        r0 = r3.c;
        r0.close();
        r0 = r3.g;
        if (r0 > r1) goto L_0x0015;
    L_0x000a:
        if (r0 != r1) goto L_0x0022;
    L_0x000c:
        r1 = r3.a;	 Catch:{ NullPointerException -> 0x0020 }
        r0 = r0 + -1;
        r0 = r1[r0];	 Catch:{ NullPointerException -> 0x0020 }
        r1 = 7;
        if (r0 == r1) goto L_0x0022;
    L_0x0015:
        r0 = new java.io.IOException;	 Catch:{ NullPointerException -> 0x0020 }
        r1 = z;	 Catch:{ NullPointerException -> 0x0020 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x0020 }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x0020 }
        throw r0;	 Catch:{ NullPointerException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = 0;
        r3.g = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eE.close():void");
    }
}
