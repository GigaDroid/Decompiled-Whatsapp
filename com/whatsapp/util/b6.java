package com.whatsapp.util;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class b6 implements Closeable {
    private static final Charset a;
    private static final String[] z;
    private final int b;
    private final long c;
    private final ExecutorService d;
    private int e;
    private final File f;
    private final File g;
    private final File h;
    private long i;
    private final Callable j;
    private final LinkedHashMap k;
    private final int l;
    private Writer m;
    private long n;

    static void d(b6 b6Var) {
        b6Var.a();
    }

    public static b6 a(File file, int i, int i2, long j) {
        if (j <= 0) {
            try {
                throw new IllegalArgumentException(z[27]);
            } catch (IOException e) {
                throw e;
            }
        } else if (i2 <= 0) {
            try {
                throw new IllegalArgumentException(z[28]);
            } catch (IOException e2) {
                throw e2;
            }
        } else {
            b6 b6Var = new b6(file, i, i2, j);
            try {
                if (b6Var.f.exists()) {
                    try {
                        b6Var.e();
                        b6Var.g();
                        b6Var.m = new BufferedWriter(new FileWriter(b6Var.f, true), 8192);
                        return b6Var;
                    } catch (IOException e3) {
                        b6Var.d();
                    }
                }
                file.mkdirs();
                b6Var = new b6(file, i, i2, j);
                b6Var.a();
                return b6Var;
            } catch (IllegalArgumentException e4) {
                throw e4;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void close() {
        /*
        r4 = this;
        monitor-enter(r4);
        r1 = com.whatsapp.util.Log.h;	 Catch:{ all -> 0x000b }
        r0 = r4.m;	 Catch:{ IllegalArgumentException -> 0x0009 }
        if (r0 != 0) goto L_0x000e;
    L_0x0007:
        monitor-exit(r4);
        return;
    L_0x0009:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000b }
    L_0x000b:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x000e:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x000b }
        r2 = r4.k;	 Catch:{ all -> 0x000b }
        r2 = r2.values();	 Catch:{ all -> 0x000b }
        r0.<init>(r2);	 Catch:{ all -> 0x000b }
        r2 = r0.iterator();	 Catch:{ all -> 0x000b }
    L_0x001d:
        r0 = r2.hasNext();	 Catch:{ all -> 0x000b }
        if (r0 == 0) goto L_0x0038;
    L_0x0023:
        r0 = r2.next();	 Catch:{ all -> 0x000b }
        r0 = (com.whatsapp.util.bl) r0;	 Catch:{ all -> 0x000b }
        r3 = com.whatsapp.util.bl.b(r0);	 Catch:{ IllegalArgumentException -> 0x0044 }
        if (r3 == 0) goto L_0x0036;
    L_0x002f:
        r0 = com.whatsapp.util.bl.b(r0);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0.b();	 Catch:{ IllegalArgumentException -> 0x0044 }
    L_0x0036:
        if (r1 == 0) goto L_0x001d;
    L_0x0038:
        r4.h();	 Catch:{ all -> 0x000b }
        r0 = r4.m;	 Catch:{ all -> 0x000b }
        r0.close();	 Catch:{ all -> 0x000b }
        r0 = 0;
        r4.m = r0;	 Catch:{ all -> 0x000b }
        goto L_0x0007;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b6.close():void");
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    static void f(b6 b6Var) {
        b6Var.h();
    }

    private void d(String str) {
        try {
            if (!str.contains(" ")) {
                if (!str.contains("\n")) {
                    try {
                        if (!str.contains("\r")) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            throw new IllegalArgumentException(z[19] + str + "\"");
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public static String a(InputStream inputStream) {
        int i = Log.h;
        StringBuilder stringBuilder = new StringBuilder(80);
        do {
            int read = inputStream.read();
            if (read != -1) {
                if (read == 10 && i == 0) {
                    break;
                }
                try {
                    stringBuilder.append((char) read);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new EOFException();
        } while (i == 0);
        i = stringBuilder.length();
        if (i > 0) {
            try {
                if (stringBuilder.charAt(i - 1) == '\r') {
                    stringBuilder.setLength(i - 1);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return stringBuilder.toString();
    }

    static {
        String[] strArr = new String[29];
        String str = "i{\u000bC~bxPE}s";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            int i2;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i2 = 3;
                        break;
                    case at.g /*1*/:
                        i2 = 20;
                        break;
                    case at.i /*2*/:
                        i2 = 126;
                        break;
                    case at.o /*3*/:
                        i2 = 49;
                        break;
                    default:
                        i2 = 16;
                        break;
                }
                cArr[i3] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "o}\u001cR\u007fqqPX\u007f-P\u0017B{Of\u000brq`|\u001b";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "vz\u001bI`fw\nTt#~\u0011Dbmu\u0012\u0011xfu\u001aTb94%";
                    obj = 2;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "/4";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "/4";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "/4";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "QQ?u0";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "G],eI#";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "o}\u001cR\u007fqqPX\u007f-P\u0017B{Of\u000brq`|\u001b";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "@X;p^#";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "vz\u001bI`fw\nTt#~\u0011Dbmu\u0012\u0011|jz\u001b\u000b0";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "QQ?u";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "@X;p^";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "G],eI";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "vz\u001bI`fw\nTt#~\u0011Dbmu\u0012\u0011|jz\u001b\u000b0";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    str = "QQ3~FF";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "QQ3~FF4";
                    obj = 16;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "eu\u0017]ug4\n^0gq\u0012Tdf4";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "hq\u0007B0na\rE0m{\n\u0011slz\nPym4\rAq`q\r\u0011\u007fq4\u0010Tgo}\u0010Tc94\\";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    str = "`u\u001dYu#}\r\u0011so{\rTt";
                    obj = 19;
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    strArr2 = strArr3;
                    str = "eu\u0017]ug4\n^0gq\u0012Tdf4\u0018X|f.^";
                    obj = 20;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "m{\n\u0011q#p\u0017Cu``\u0011Ci94";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "G],eI#";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "fp\u0017E0g}\u001a_7w4\u001dCub`\u001b\u0011vjx\u001b\u0011";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "QQ3~FF4";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "@X;p^#";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "nu\u0006byyq^\r-#$";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "uu\u0012Du@{\u000b_d#(C\u0011 ";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "V@8\u001c(".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (i2 = 0; length2 > i2; i2++) {
                        int i4;
                        char c2 = cArr2[i2];
                        switch (i2 % 5) {
                            case v.m /*0*/:
                                i4 = 3;
                                break;
                            case at.g /*1*/:
                                i4 = 20;
                                break;
                            case at.i /*2*/:
                                i4 = 126;
                                break;
                            case at.o /*3*/:
                                i4 = 49;
                                break;
                            default:
                                i4 = 16;
                                break;
                        }
                        cArr2[i2] = (char) (i4 ^ c2);
                    }
                    a = Charset.forName(new String(cArr2).intern());
                    return;
                default:
                    strArr2[i] = str;
                    str = "i{\u000bC~bx";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private boolean f() {
        try {
            if (this.e >= 2000) {
                if (this.e >= this.k.size()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public synchronized b1 b(String str) {
        b1 b1Var = null;
        synchronized (this) {
            int i = Log.h;
            c();
            d(str);
            bl blVar = (bl) this.k.get(str);
            if (blVar != null) {
                try {
                    if (bl.d(blVar)) {
                        InputStream[] inputStreamArr = new InputStream[this.b];
                        int i2 = 0;
                        do {
                            try {
                                if (i2 < this.b) {
                                    inputStreamArr[i2] = new FileInputStream(blVar.a(i2));
                                    i2++;
                                }
                                this.e++;
                                this.m.append(z[7] + str + '\n');
                                if (f()) {
                                    this.d.submit(this.j);
                                }
                                b1Var = new b1(this, str, bl.c(blVar), inputStreamArr, null);
                            } catch (FileNotFoundException e) {
                            }
                        } while (i == 0);
                        this.e++;
                        this.m.append(z[7] + str + '\n');
                        if (f()) {
                            this.d.submit(this.j);
                        }
                        b1Var = new b1(this, str, bl.c(blVar), inputStreamArr, null);
                    }
                } catch (FileNotFoundException e2) {
                    throw e2;
                } catch (FileNotFoundException e22) {
                    throw e22;
                }
            }
        }
        return b1Var;
    }

    private b6(File file, int i, int i2, long j) {
        this.i = 0;
        this.k = new LinkedHashMap(0, 0.75f, true);
        this.n = 0;
        this.d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.j = new aa(this);
        this.g = file;
        this.l = i;
        this.f = new File(file, z[1]);
        this.h = new File(file, z[0]);
        this.b = i2;
        this.c = j;
    }

    private void g() {
        int i = Log.h;
        a(this.h);
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            int i2;
            bl blVar = (bl) it.next();
            if (bl.b(blVar) == null) {
                i2 = 0;
                while (i2 < this.b) {
                    this.i += bl.e(blVar)[i2];
                    i2++;
                    if (i != 0) {
                        break;
                    }
                }
                if (i == 0) {
                    continue;
                    if (i != 0) {
                        return;
                    }
                }
            }
            bl.a(blVar, null);
            i2 = 0;
            while (i2 < this.b) {
                a(blVar.a(i2));
                a(blVar.b(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
            it.remove();
            continue;
            if (i != 0) {
                return;
            }
        }
    }

    public void d() {
        close();
        b(this.g);
    }

    static int a(b6 b6Var, int i) {
        b6Var.e = i;
        return i;
    }

    static int e(b6 b6Var) {
        return b6Var.b;
    }

    private void c() {
        try {
            if (this.m == null) {
                throw new IllegalStateException(z[20]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void e() {
        Closeable bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f), 8192);
        try {
            String a = a((InputStream) bufferedInputStream);
            String a2 = a((InputStream) bufferedInputStream);
            String a3 = a((InputStream) bufferedInputStream);
            String a4 = a((InputStream) bufferedInputStream);
            String a5 = a((InputStream) bufferedInputStream);
            try {
                if (z[2].equals(a) && "1".equals(a2)) {
                    if (Integer.toString(this.l).equals(a3)) {
                        try {
                            if (Integer.toString(this.b).equals(a4)) {
                                try {
                                    if ("".equals(a5)) {
                                        while (true) {
                                            try {
                                                a(a((InputStream) bufferedInputStream));
                                            } catch (EOFException e) {
                                                a(bufferedInputStream);
                                                return;
                                            }
                                        }
                                    }
                                } catch (EOFException e2) {
                                    throw e2;
                                }
                            }
                        } catch (EOFException e22) {
                            throw e22;
                        }
                    }
                }
                throw new IOException(z[3] + a + z[4] + a2 + z[5] + a4 + z[6] + a5 + "]");
            } catch (EOFException e222) {
                throw e222;
            } catch (EOFException e2222) {
                throw e2222;
            }
        } catch (EOFException e22222) {
            throw e22222;
        } catch (Throwable th) {
            a(bufferedInputStream);
        }
    }

    static File c(b6 b6Var) {
        return b6Var.g;
    }

    private static Object[] a(Object[] objArr, int i, int i2) {
        int length = objArr.length;
        if (i > i2) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i < 0 || i > length) {
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
            System.arraycopy(objArr, i, objArr2, 0, min);
            return objArr2;
        }
    }

    private static void a(File file) {
        try {
            if (!file.exists()) {
                return;
            }
            if (!file.delete()) {
                throw new IOException();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.whatsapp.util.x a(java.lang.String r7, long r8) {
        /*
        r6 = this;
        r1 = 0;
        monitor-enter(r6);
        r6.c();	 Catch:{ all -> 0x0025 }
        r6.d(r7);	 Catch:{ all -> 0x0025 }
        r0 = r6.k;	 Catch:{ all -> 0x0025 }
        r0 = r0.get(r7);	 Catch:{ all -> 0x0025 }
        r0 = (com.whatsapp.util.bl) r0;	 Catch:{ all -> 0x0025 }
        r2 = -1;
        r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x0028;
    L_0x0016:
        if (r0 == 0) goto L_0x0020;
    L_0x0018:
        r2 = com.whatsapp.util.bl.c(r0);	 Catch:{ IllegalArgumentException -> 0x0023 }
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 == 0) goto L_0x0028;
    L_0x0020:
        r0 = r1;
    L_0x0021:
        monitor-exit(r6);
        return r0;
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0028:
        if (r0 != 0) goto L_0x0039;
    L_0x002a:
        r0 = new com.whatsapp.util.bl;	 Catch:{ all -> 0x0025 }
        r2 = 0;
        r0.<init>(r6, r7, r2);	 Catch:{ all -> 0x0025 }
        r2 = r6.k;	 Catch:{ IllegalArgumentException -> 0x0041 }
        r2.put(r7, r0);	 Catch:{ IllegalArgumentException -> 0x0041 }
        r2 = com.whatsapp.util.Log.h;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r2 == 0) goto L_0x0077;
    L_0x0039:
        r2 = com.whatsapp.util.bl.b(r0);	 Catch:{ IllegalArgumentException -> 0x0043 }
        if (r2 == 0) goto L_0x0045;
    L_0x003f:
        r0 = r1;
        goto L_0x0021;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0025 }
    L_0x0045:
        r1 = r0;
    L_0x0046:
        r0 = new com.whatsapp.util.x;	 Catch:{ all -> 0x0025 }
        r2 = 0;
        r0.<init>(r6, r1, r2);	 Catch:{ all -> 0x0025 }
        com.whatsapp.util.bl.a(r1, r0);	 Catch:{ all -> 0x0025 }
        r1 = r6.m;	 Catch:{ all -> 0x0025 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0025 }
        r2.<init>();	 Catch:{ all -> 0x0025 }
        r3 = z;	 Catch:{ all -> 0x0025 }
        r4 = 23;
        r3 = r3[r4];	 Catch:{ all -> 0x0025 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0025 }
        r2 = r2.append(r7);	 Catch:{ all -> 0x0025 }
        r3 = 10;
        r2 = r2.append(r3);	 Catch:{ all -> 0x0025 }
        r2 = r2.toString();	 Catch:{ all -> 0x0025 }
        r1.write(r2);	 Catch:{ all -> 0x0025 }
        r1 = r6.m;	 Catch:{ all -> 0x0025 }
        r1.flush();	 Catch:{ all -> 0x0025 }
        goto L_0x0021;
    L_0x0077:
        r1 = r0;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b6.a(java.lang.String, long):com.whatsapp.util.x");
    }

    public static void b(File file) {
        int i = Log.h;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            try {
                throw new IllegalArgumentException(z[22] + file);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int length = listFiles.length;
        int i2 = 0;
        while (i2 < length) {
            File file2 = listFiles[i2];
            try {
                if (file2.isDirectory()) {
                    b(file2);
                }
                try {
                    if (file2.delete()) {
                        i2++;
                        if (i != 0) {
                            return;
                        }
                    }
                    throw new IOException(z[21] + file2);
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    static Writer a(b6 b6Var) {
        return b6Var.m;
    }

    private void h() {
        int i = Log.h;
        while (this.i > this.c) {
            c((String) ((Entry) this.k.entrySet().iterator().next()).getKey());
            if (i != 0) {
                return;
            }
        }
    }

    public boolean b() {
        try {
            return this.m == null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static boolean b(b6 b6Var) {
        return b6Var.f();
    }

    public x e(String str) {
        return a(str, -1);
    }

    static void a(b6 b6Var, x xVar, boolean z) {
        b6Var.a(xVar, z);
    }

    public synchronized boolean c(String str) {
        boolean z;
        int i = 0;
        synchronized (this) {
            int i2 = Log.h;
            c();
            d(str);
            bl blVar = (bl) this.k.get(str);
            if (blVar != null) {
                try {
                    if (bl.b(blVar) == null) {
                        do {
                            if (i < this.b) {
                                File a = blVar.a(i);
                                if (a.delete()) {
                                    this.i -= bl.e(blVar)[i];
                                    bl.e(blVar)[i] = 0;
                                    i++;
                                } else {
                                    throw new IOException(z[18] + a);
                                }
                            }
                            break;
                        } while (i2 == 0);
                        break;
                        this.e++;
                        this.m.append(z[17] + str + '\n');
                        this.k.remove(str);
                        if (f()) {
                            this.d.submit(this.j);
                        }
                        z = true;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            z = false;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a() {
        /*
        r7 = this;
        monitor-enter(r7);
        r1 = com.whatsapp.util.Log.h;	 Catch:{ all -> 0x00e8 }
        r0 = r7.m;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        if (r0 == 0) goto L_0x000c;
    L_0x0007:
        r0 = r7.m;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r0.close();	 Catch:{ IllegalArgumentException -> 0x00e6 }
    L_0x000c:
        r2 = new java.io.BufferedWriter;	 Catch:{ all -> 0x00e8 }
        r0 = new java.io.FileWriter;	 Catch:{ all -> 0x00e8 }
        r3 = r7.h;	 Catch:{ all -> 0x00e8 }
        r0.<init>(r3);	 Catch:{ all -> 0x00e8 }
        r3 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r2.<init>(r0, r3);	 Catch:{ all -> 0x00e8 }
        r0 = z;	 Catch:{ all -> 0x00e8 }
        r3 = 9;
        r0 = r0[r3];	 Catch:{ all -> 0x00e8 }
        r2.write(r0);	 Catch:{ all -> 0x00e8 }
        r0 = "\n";
        r2.write(r0);	 Catch:{ all -> 0x00e8 }
        r0 = "1";
        r2.write(r0);	 Catch:{ all -> 0x00e8 }
        r0 = "\n";
        r2.write(r0);	 Catch:{ all -> 0x00e8 }
        r0 = r7.l;	 Catch:{ all -> 0x00e8 }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ all -> 0x00e8 }
        r2.write(r0);	 Catch:{ all -> 0x00e8 }
        r0 = "\n";
        r2.write(r0);	 Catch:{ all -> 0x00e8 }
        r0 = r7.b;	 Catch:{ all -> 0x00e8 }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ all -> 0x00e8 }
        r2.write(r0);	 Catch:{ all -> 0x00e8 }
        r0 = "\n";
        r2.write(r0);	 Catch:{ all -> 0x00e8 }
        r0 = "\n";
        r2.write(r0);	 Catch:{ all -> 0x00e8 }
        r0 = r7.k;	 Catch:{ all -> 0x00e8 }
        r0 = r0.values();	 Catch:{ all -> 0x00e8 }
        r3 = r0.iterator();	 Catch:{ all -> 0x00e8 }
    L_0x0063:
        r0 = r3.hasNext();	 Catch:{ all -> 0x00e8 }
        if (r0 == 0) goto L_0x00c9;
    L_0x0069:
        r0 = r3.next();	 Catch:{ all -> 0x00e8 }
        r0 = (com.whatsapp.util.bl) r0;	 Catch:{ all -> 0x00e8 }
        r4 = com.whatsapp.util.bl.b(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        if (r4 == 0) goto L_0x009b;
    L_0x0075:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ed }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x00ed }
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x00ed }
        r6 = 8;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x00ed }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r5 = com.whatsapp.util.bl.a(r0);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r5 = 10;
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r4 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x00ed }
        r2.write(r4);	 Catch:{ IllegalArgumentException -> 0x00ed }
        if (r1 == 0) goto L_0x00c7;
    L_0x009b:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ed }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x00ed }
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x00ed }
        r6 = 10;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x00ed }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r5 = com.whatsapp.util.bl.a(r0);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r0 = r0.a();	 Catch:{ IllegalArgumentException -> 0x00ed }
        r0 = r4.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r4 = 10;
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00ed }
        r2.write(r0);	 Catch:{ IllegalArgumentException -> 0x00ed }
    L_0x00c7:
        if (r1 == 0) goto L_0x0063;
    L_0x00c9:
        r2.close();	 Catch:{ all -> 0x00e8 }
        r0 = r7.h;	 Catch:{ all -> 0x00e8 }
        r1 = r7.f;	 Catch:{ all -> 0x00e8 }
        r0.renameTo(r1);	 Catch:{ all -> 0x00e8 }
        r0 = new java.io.BufferedWriter;	 Catch:{ all -> 0x00e8 }
        r1 = new java.io.FileWriter;	 Catch:{ all -> 0x00e8 }
        r2 = r7.f;	 Catch:{ all -> 0x00e8 }
        r3 = 1;
        r1.<init>(r2, r3);	 Catch:{ all -> 0x00e8 }
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r0.<init>(r1, r2);	 Catch:{ all -> 0x00e8 }
        r7.m = r0;	 Catch:{ all -> 0x00e8 }
        monitor-exit(r7);
        return;
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ed }
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e8 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b6.a():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(com.whatsapp.util.x r11, boolean r12) {
        /*
        r10 = this;
        r0 = 0;
        monitor-enter(r10);
        r2 = com.whatsapp.util.Log.h;	 Catch:{ all -> 0x0016 }
        r3 = com.whatsapp.util.x.a(r11);	 Catch:{ all -> 0x0016 }
        r1 = com.whatsapp.util.bl.b(r3);	 Catch:{ IllegalArgumentException -> 0x0014 }
        if (r1 == r11) goto L_0x0019;
    L_0x000e:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0014 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0014 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        monitor-exit(r10);
        throw r0;
    L_0x0019:
        if (r12 == 0) goto L_0x0058;
    L_0x001b:
        r1 = com.whatsapp.util.bl.d(r3);	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r1 != 0) goto L_0x0058;
    L_0x0021:
        r1 = r0;
    L_0x0022:
        r4 = r10.b;	 Catch:{ all -> 0x0016 }
        if (r1 >= r4) goto L_0x0058;
    L_0x0026:
        r4 = r3.b(r1);	 Catch:{ IllegalArgumentException -> 0x0050 }
        r4 = r4.exists();	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r4 != 0) goto L_0x0054;
    L_0x0030:
        r11.b();	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0050 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0050 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0050 }
        r1 = r2.append(r1);	 Catch:{ IllegalArgumentException -> 0x0050 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0050 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0054:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0022;
    L_0x0058:
        r1 = r10.b;	 Catch:{ all -> 0x0016 }
        if (r0 >= r1) goto L_0x008f;
    L_0x005c:
        r1 = r3.b(r0);	 Catch:{ all -> 0x0016 }
        if (r12 == 0) goto L_0x0088;
    L_0x0062:
        r4 = r1.exists();	 Catch:{ IllegalArgumentException -> 0x0126 }
        if (r4 == 0) goto L_0x008b;
    L_0x0068:
        r4 = r3.a(r0);	 Catch:{ all -> 0x0016 }
        r1.renameTo(r4);	 Catch:{ all -> 0x0016 }
        r5 = com.whatsapp.util.bl.e(r3);	 Catch:{ all -> 0x0016 }
        r6 = r5[r0];	 Catch:{ all -> 0x0016 }
        r4 = r4.length();	 Catch:{ all -> 0x0016 }
        r8 = com.whatsapp.util.bl.e(r3);	 Catch:{ IllegalArgumentException -> 0x0128 }
        r8[r0] = r4;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r8 = r10.i;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r6 = r8 - r6;
        r4 = r4 + r6;
        r10.i = r4;	 Catch:{ IllegalArgumentException -> 0x0128 }
        if (r2 == 0) goto L_0x008b;
    L_0x0088:
        a(r1);	 Catch:{ IllegalArgumentException -> 0x0128 }
    L_0x008b:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0058;
    L_0x008f:
        r0 = r10.e;	 Catch:{ IllegalArgumentException -> 0x012a }
        r0 = r0 + 1;
        r10.e = r0;	 Catch:{ IllegalArgumentException -> 0x012a }
        r0 = 0;
        com.whatsapp.util.bl.a(r3, r0);	 Catch:{ IllegalArgumentException -> 0x012a }
        r0 = com.whatsapp.util.bl.d(r3);	 Catch:{ IllegalArgumentException -> 0x012a }
        r0 = r0 | r12;
        if (r0 == 0) goto L_0x00e0;
    L_0x00a0:
        r0 = 1;
        com.whatsapp.util.bl.a(r3, r0);	 Catch:{ IllegalArgumentException -> 0x012c }
        r0 = r10.m;	 Catch:{ IllegalArgumentException -> 0x012c }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x012c }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x012c }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x012c }
        r5 = 26;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x012c }
        r1 = r1.append(r4);	 Catch:{ IllegalArgumentException -> 0x012c }
        r4 = com.whatsapp.util.bl.a(r3);	 Catch:{ IllegalArgumentException -> 0x012c }
        r1 = r1.append(r4);	 Catch:{ IllegalArgumentException -> 0x012c }
        r4 = r3.a();	 Catch:{ IllegalArgumentException -> 0x012c }
        r1 = r1.append(r4);	 Catch:{ IllegalArgumentException -> 0x012c }
        r4 = 10;
        r1 = r1.append(r4);	 Catch:{ IllegalArgumentException -> 0x012c }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x012c }
        r0.write(r1);	 Catch:{ IllegalArgumentException -> 0x012c }
        if (r12 == 0) goto L_0x010f;
    L_0x00d4:
        r0 = r10.n;	 Catch:{ IllegalArgumentException -> 0x012e }
        r4 = 1;
        r4 = r4 + r0;
        r10.n = r4;	 Catch:{ IllegalArgumentException -> 0x012e }
        com.whatsapp.util.bl.a(r3, r0);	 Catch:{ IllegalArgumentException -> 0x012e }
        if (r2 == 0) goto L_0x010f;
    L_0x00e0:
        r0 = r10.k;	 Catch:{ IllegalArgumentException -> 0x012e }
        r1 = com.whatsapp.util.bl.a(r3);	 Catch:{ IllegalArgumentException -> 0x012e }
        r0.remove(r1);	 Catch:{ IllegalArgumentException -> 0x012e }
        r0 = r10.m;	 Catch:{ IllegalArgumentException -> 0x012e }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x012e }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x012e }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x012e }
        r4 = 25;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x012e }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x012e }
        r2 = com.whatsapp.util.bl.a(r3);	 Catch:{ IllegalArgumentException -> 0x012e }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x012e }
        r2 = 10;
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x012e }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x012e }
        r0.write(r1);	 Catch:{ IllegalArgumentException -> 0x012e }
    L_0x010f:
        r0 = r10.i;	 Catch:{ IllegalArgumentException -> 0x0130 }
        r2 = r10.c;	 Catch:{ IllegalArgumentException -> 0x0130 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x011d;
    L_0x0117:
        r0 = r10.f();	 Catch:{ IllegalArgumentException -> 0x0132 }
        if (r0 == 0) goto L_0x0124;
    L_0x011d:
        r0 = r10.d;	 Catch:{ IllegalArgumentException -> 0x0132 }
        r1 = r10.j;	 Catch:{ IllegalArgumentException -> 0x0132 }
        r0.submit(r1);	 Catch:{ IllegalArgumentException -> 0x0132 }
    L_0x0124:
        monitor-exit(r10);
        return;
    L_0x0126:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0128:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x012a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x012c }
    L_0x012c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x012e }
    L_0x012e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0130:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0132 }
    L_0x0132:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0016 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b6.a(com.whatsapp.util.x, boolean):void");
    }

    private void a(String str) {
        int i = Log.h;
        Object[] split = str.split(" ");
        try {
            if (split.length < 2) {
                throw new IOException(z[11] + str);
            }
            String str2 = split[1];
            try {
                bl blVar;
                if (split[0].equals(z[16])) {
                    if (split.length == 2) {
                        this.k.remove(str2);
                        return;
                    }
                }
                bl blVar2 = (bl) this.k.get(str2);
                if (blVar2 == null) {
                    blVar2 = new bl(this, str2, null);
                    this.k.put(str2, blVar2);
                    blVar = blVar2;
                } else {
                    blVar = blVar2;
                }
                try {
                    if (split[0].equals(z[13])) {
                        if (split.length == this.b + 2) {
                            try {
                                bl.a(blVar, true);
                                bl.a(blVar, null);
                                bl.a(blVar, (String[]) a(split, 2, split.length));
                                if (i == 0) {
                                    return;
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                    }
                    try {
                        if (split[0].equals(z[14])) {
                            try {
                                if (split.length == 2) {
                                    try {
                                        bl.a(blVar, new x(this, blVar, null));
                                        if (i == 0) {
                                            return;
                                        }
                                    } catch (IllegalArgumentException e2) {
                                        throw e2;
                                    }
                                }
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                    try {
                        if (split[0].equals(z[12])) {
                            try {
                                if (split.length == 2) {
                                    return;
                                }
                            } catch (IllegalArgumentException e2222) {
                                throw e2222;
                            }
                        }
                        throw new IOException(z[15] + str);
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                } catch (IllegalArgumentException e2222222) {
                    throw e2222222;
                }
            } catch (IllegalArgumentException e22222222) {
                throw e22222222;
            } catch (IllegalArgumentException e222222222) {
                throw e222222222;
            }
        } catch (IllegalArgumentException e2222222222) {
            throw e2222222222;
        }
    }
}
