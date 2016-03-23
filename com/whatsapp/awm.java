package com.whatsapp;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class awm {
    private static final FileFilter a;
    public static boolean b;
    private static final String[] z;

    private static int a(byte[] bArr, int i) {
        boolean z = b;
        while (i < bArr.length) {
            try {
                if (bArr[i] == 10) {
                    break;
                } else if (bArr[i] < (byte) 48 || bArr[i] > (byte) 57) {
                    i++;
                    if (z) {
                        break;
                    }
                } else {
                    int i2 = i + 1;
                    while (i2 < bArr.length) {
                        try {
                            if (bArr[i2] >= (byte) 48) {
                                if (bArr[i2] > (byte) 57) {
                                    break;
                                }
                                i2++;
                                if (z) {
                                    break;
                                }
                            }
                            break;
                        } catch (SecurityException e) {
                            throw e;
                        } catch (SecurityException e2) {
                            throw e2;
                        }
                    }
                    return Integer.parseInt(new String(bArr, 0, i, i2 - i));
                }
            } catch (SecurityException e22) {
                throw e22;
            } catch (SecurityException e222) {
                throw e222;
            }
        }
        return -1;
    }

    public static int a() {
        int i = -1;
        try {
            if (VERSION.SDK_INT <= 10) {
                return 1;
            }
            try {
                return new File(z[3]).listFiles(a).length;
            } catch (SecurityException e) {
                return i;
            } catch (NullPointerException e2) {
                return i;
            }
        } catch (SecurityException e3) {
            throw e3;
        }
    }

    public static int b() {
        int i;
        boolean z = b;
        int i2 = 0;
        int i3 = -1;
        loop2:
        while (i2 < a()) {
            try {
                File file = new File(z[7] + i2 + z[6]);
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        i = 0;
                        do {
                            if (bArr[i] >= 48) {
                                try {
                                    if (bArr[i] <= 57 && i < bArr.length) {
                                        i++;
                                    }
                                } catch (NumberFormatException e) {
                                    throw e;
                                } catch (NumberFormatException e2) {
                                    throw e2;
                                } finally {
                                    fileInputStream.close();
                                }
                            }
                            break;
                        } while (!z);
                        break;
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i)));
                        if (valueOf.intValue() > i3) {
                            i3 = valueOf.intValue();
                        }
                        i = i3;
                    } catch (NumberFormatException e3) {
                        i = i3;
                        i3 = i2 + 1;
                        if (z) {
                            break loop2;
                            if (i == -1) {
                                return i;
                            }
                            FileInputStream fileInputStream2 = new FileInputStream(z[4]);
                            i3 = a(z[5], fileInputStream2) * 1000;
                            if (i3 > i) {
                                i = i3;
                            }
                            fileInputStream2.close();
                            return i;
                        }
                        i2 = i3;
                        i3 = i;
                    } finally {
                        fileInputStream.close();
                    }
                } else {
                    i = i3;
                }
                i3 = i2 + 1;
                if (z) {
                    break loop2;
                }
                i2 = i3;
                i3 = i;
            } catch (IOException e4) {
                return -1;
            } catch (Throwable th) {
                fileInputStream2.close();
            }
        }
        i = i3;
        if (i == -1) {
            return i;
        }
        FileInputStream fileInputStream22 = new FileInputStream(z[4]);
        i3 = a(z[5], fileInputStream22) * 1000;
        if (i3 > i) {
            i = i3;
        }
        fileInputStream22.close();
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r9, java.io.FileInputStream r10) {
        /*
        r8 = 10;
        r2 = b;
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3 = new byte[r0];
        r4 = r10.read(r3);	 Catch:{ IOException -> 0x003d, NumberFormatException -> 0x0044 }
        r0 = 0;
    L_0x000d:
        if (r0 >= r4) goto L_0x003e;
    L_0x000f:
        r1 = r3[r0];	 Catch:{ IOException -> 0x0037, NumberFormatException -> 0x0044 }
        if (r1 == r8) goto L_0x0015;
    L_0x0013:
        if (r0 != 0) goto L_0x004a;
    L_0x0015:
        r1 = r3[r0];	 Catch:{ IOException -> 0x0039, NumberFormatException -> 0x0044 }
        if (r1 != r8) goto L_0x001b;
    L_0x0019:
        r0 = r0 + 1;
    L_0x001b:
        r1 = r0;
    L_0x001c:
        if (r1 >= r4) goto L_0x004a;
    L_0x001e:
        r5 = r1 - r0;
        r6 = r3[r1];	 Catch:{ IOException -> 0x0040, NumberFormatException -> 0x0044 }
        r7 = r9.charAt(r5);	 Catch:{ IOException -> 0x0040, NumberFormatException -> 0x0044 }
        if (r6 == r7) goto L_0x002a;
    L_0x0028:
        if (r2 == 0) goto L_0x004a;
    L_0x002a:
        r6 = r9.length();	 Catch:{ IOException -> 0x0042, NumberFormatException -> 0x0044 }
        r6 = r6 + -1;
        if (r5 != r6) goto L_0x0046;
    L_0x0032:
        r0 = a(r3, r1);	 Catch:{ IOException -> 0x003d, NumberFormatException -> 0x0044 }
    L_0x0036:
        return r0;
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0039, NumberFormatException -> 0x0044 }
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x003b, NumberFormatException -> 0x0044 }
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x003d, NumberFormatException -> 0x0044 }
    L_0x003d:
        r0 = move-exception;
    L_0x003e:
        r0 = -1;
        goto L_0x0036;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0042, NumberFormatException -> 0x0044 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x003d, NumberFormatException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        goto L_0x003e;
    L_0x0046:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x001c;
    L_0x004a:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x000d;
    L_0x004e:
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.awm.a(java.lang.String, java.io.FileInputStream):int");
    }

    static {
        String[] strArr = new String[8];
        String str = ".,GFm.1PDgo:Z";
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
                        i3 = 1;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 53;
                        break;
                    case at.o /*3*/:
                        i3 = 41;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "`?A@xh(L";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "./LZ!e9C@md/\u001aZwr(PD!b,@\u0006";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ".,GFm.?E\\go:Z";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "b,@\tCI&";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ".?E\\hs9D\u0006mq)\\Ghn\u0003XHv^:GL\u007f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "./LZ!e9C@md/\u001aZwr(PD!b,@\u0006mq)";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new _e();
                    return;
                default:
                    strArr2[i] = str;
                    str = "L9X}au=Y";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    @TargetApi(16)
    public static long a(Context context) {
        if (VERSION.SDK_INT >= 16) {
            MemoryInfo memoryInfo = new MemoryInfo();
            try {
                ((ActivityManager) context.getSystemService(z[2])).getMemoryInfo(memoryInfo);
                if (memoryInfo != null) {
                    return memoryInfo.totalMem;
                }
                return -1;
            } catch (IOException e) {
                throw e;
            }
        }
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(z[0]);
            long a = ((long) a(z[1], fileInputStream)) * 1024;
            try {
                fileInputStream.close();
                return a;
            } catch (IOException e2) {
                return a;
            }
        } catch (IOException e3) {
            return -1;
        } catch (Throwable th) {
            fileInputStream.close();
        }
    }
}
