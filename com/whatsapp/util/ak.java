package com.whatsapp.util;

import com.whatsapp.arj;
import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

public class ak {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "E8";
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
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 9;
                        break;
                    case at.i /*2*/:
                        i3 = 57;
                        break;
                    case at.o /*3*/:
                        i3 = 67;
                        break;
                    default:
                        i3 = 119;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0012p@:Z&D\u0014'\u0013";
                    obj = null;
            }
        }
    }

    public static void a(FileChannel fileChannel, WritableByteChannel writableByteChannel) {
        int i = Log.h;
        long j = 0;
        while (j < fileChannel.size()) {
            fileChannel.transferTo(j, Math.min(131072, fileChannel.size() - j), writableByteChannel);
            j += 131072;
            if (i != 0) {
                return;
            }
        }
    }

    private static String a(String str, String str2) {
        return str.substring(str.indexOf(46)) + str2;
    }

    private static boolean a(File file, int i) {
        float currentTimeMillis = (float) ((System.currentTimeMillis() - file.lastModified()) / 86400000);
        try {
            if (file.exists()) {
                if ((System.currentTimeMillis() - file.lastModified()) / 86400000 <= ((long) i)) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static File a(File file, String str) {
        Date date = new Date();
        String a = a(file.getName(), date);
        String a2 = a(file.getName(), str);
        String str2 = "1";
        String a3 = a(file, date, str);
        if (a3 != null) {
            int length = a.length() + 1;
            int length2 = a3.length() - a2.length();
            if (length < length2) {
                try {
                    str2 = Integer.toString(Integer.parseInt(a3.substring(length, length2)) + 1);
                } catch (NumberFormatException e) {
                }
            }
        }
        File file2 = new File(file.getParent(), a + "." + str2 + a2);
        file2.createNewFile();
        return file2;
    }

    public static String a(File file, Date date, String str) {
        int i = Log.h;
        String a = a(file.getName(), date);
        String a2 = a(file.getName(), str);
        int i2 = 0;
        File file2 = null;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i3 = 0;
            while (i3 < length) {
                File file3 = listFiles[i3];
                String name = file3.getName();
                try {
                    if (name.startsWith(a) && name.endsWith(a2)) {
                        int length2 = a.length() + 1;
                        int length3 = name.length() - a2.length();
                        try {
                            if (length3 < name.length() && length2 < length3) {
                                try {
                                    int i4;
                                    int parseInt = Integer.parseInt(name.substring(length2, length3));
                                    if (parseInt > i2) {
                                        i4 = parseInt;
                                    } else {
                                        file3 = file2;
                                        i4 = i2;
                                    }
                                    i2 = i4;
                                    file2 = file3;
                                } catch (NumberFormatException e) {
                                }
                            }
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                    int i5 = i3 + 1;
                    if (i != 0) {
                        break;
                    }
                    i3 = i5;
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
        }
        if (file2 == null) {
            return a + z[0] + a2;
        }
        try {
            return file2.getName();
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    public static boolean b(File file, File file2) {
        boolean z = false;
        if (file.exists()) {
            try {
                z = file.renameTo(new File(file2.getPath() + "." + (c(file, file2) + 1)));
            } catch (SecurityException e) {
            }
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList a(java.io.File r20, int r21, java.lang.String[] r22) {
        /*
        r5 = com.whatsapp.util.Log.h;
        r6 = a();
        r7 = new java.util.ArrayList;
        r7.<init>();
        r8 = new java.util.Date;
        r8.<init>();
        r9 = r6.toPattern();
        r2 = r20.getName();
        r10 = b(r2);
        r2 = r20.getName();
        r3 = "";
        r11 = a(r2, r3);
        r0 = r22;
        r2 = r0.length;
        r12 = new java.lang.String[r2];
        r2 = 0;
    L_0x002d:
        r3 = r12.length;
        if (r2 >= r3) goto L_0x0040;
    L_0x0030:
        r3 = r20.getName();
        r4 = r22[r2];
        r3 = a(r3, r4);
        r12[r2] = r3;
        r2 = r2 + 1;
        if (r5 == 0) goto L_0x002d;
    L_0x0040:
        r2 = r20.getParentFile();
        r13 = r2.listFiles();
        if (r13 == 0) goto L_0x00c4;
    L_0x004a:
        r14 = r13.length;
        r2 = 0;
        r4 = r2;
    L_0x004d:
        if (r4 >= r14) goto L_0x00c4;
    L_0x004f:
        r15 = r13[r4];
        r16 = r15.getName();
        r0 = r16;
        r2 = r0.startsWith(r10);	 Catch:{ ParseException -> 0x011a }
        if (r2 != 0) goto L_0x005f;
    L_0x005d:
        if (r5 == 0) goto L_0x00c0;
    L_0x005f:
        r0 = r16;
        r3 = r0.endsWith(r11);
        r0 = r12.length;
        r17 = r0;
        r2 = 0;
        r19 = r2;
        r2 = r3;
        r3 = r19;
    L_0x006e:
        r0 = r17;
        if (r3 >= r0) goto L_0x0089;
    L_0x0072:
        r18 = r12[r3];
        if (r2 == 0) goto L_0x0078;
    L_0x0076:
        if (r5 == 0) goto L_0x0089;
    L_0x0078:
        if (r2 != 0) goto L_0x0084;
    L_0x007a:
        r0 = r16;
        r1 = r18;
        r2 = r0.endsWith(r1);	 Catch:{ ParseException -> 0x011c }
        if (r2 == 0) goto L_0x0120;
    L_0x0084:
        r2 = 1;
    L_0x0085:
        r3 = r3 + 1;
        if (r5 == 0) goto L_0x006e;
    L_0x0089:
        if (r2 == 0) goto L_0x00c0;
    L_0x008b:
        r2 = r10.length();
        r3 = r10.length();
        r17 = r9.length();
        r3 = r3 + r17;
        r0 = r16;
        r2 = r0.substring(r2, r3);
        r2 = r6.parse(r2);	 Catch:{ ParseException -> 0x0125 }
        r16 = r8.getTime();	 Catch:{ ParseException -> 0x0125 }
        r2 = r2.getTime();	 Catch:{ ParseException -> 0x0125 }
        r2 = r16 - r2;
        r16 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r2 = r2 / r16;
        if (r21 < 0) goto L_0x00bd;
    L_0x00b4:
        r0 = r21;
        r0 = (long) r0;
        r16 = r0;
        r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r2 >= 0) goto L_0x00c0;
    L_0x00bd:
        r7.add(r15);	 Catch:{ ParseException -> 0x0123 }
    L_0x00c0:
        r2 = r4 + 1;
        if (r5 == 0) goto L_0x012f;
    L_0x00c4:
        if (r21 >= 0) goto L_0x00cc;
    L_0x00c6:
        r2 = r20.exists();	 Catch:{ ParseException -> 0x0127 }
        if (r2 != 0) goto L_0x00d2;
    L_0x00cc:
        r2 = a(r20, r21);	 Catch:{ ParseException -> 0x0129 }
        if (r2 == 0) goto L_0x00d7;
    L_0x00d2:
        r0 = r20;
        r7.add(r0);	 Catch:{ ParseException -> 0x0129 }
    L_0x00d7:
        r0 = r22;
        r3 = r0.length;
        r2 = 0;
    L_0x00db:
        if (r2 >= r3) goto L_0x0110;
    L_0x00dd:
        r4 = r22[r2];
        r6 = new java.io.File;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = r20.getPath();
        r8 = r8.append(r9);
        r4 = r8.append(r4);
        r4 = r4.toString();
        r6.<init>(r4);
        if (r21 >= 0) goto L_0x0101;
    L_0x00fb:
        r4 = r6.exists();	 Catch:{ ParseException -> 0x012b }
        if (r4 != 0) goto L_0x0109;
    L_0x0101:
        r0 = r21;
        r4 = a(r6, r0);	 Catch:{ ParseException -> 0x012d }
        if (r4 == 0) goto L_0x010c;
    L_0x0109:
        r7.add(r6);	 Catch:{ ParseException -> 0x012d }
    L_0x010c:
        r2 = r2 + 1;
        if (r5 == 0) goto L_0x00db;
    L_0x0110:
        r2 = new com.whatsapp.util.f;
        r3 = 0;
        r2.<init>(r3);
        java.util.Collections.sort(r7, r2);
        return r7;
    L_0x011a:
        r2 = move-exception;
        throw r2;
    L_0x011c:
        r2 = move-exception;
        throw r2;	 Catch:{ ParseException -> 0x011e }
    L_0x011e:
        r2 = move-exception;
        throw r2;
    L_0x0120:
        r2 = 0;
        goto L_0x0085;
    L_0x0123:
        r2 = move-exception;
        throw r2;	 Catch:{ ParseException -> 0x0125 }
    L_0x0125:
        r2 = move-exception;
        goto L_0x00c0;
    L_0x0127:
        r2 = move-exception;
        throw r2;	 Catch:{ ParseException -> 0x0129 }
    L_0x0129:
        r2 = move-exception;
        throw r2;
    L_0x012b:
        r2 = move-exception;
        throw r2;	 Catch:{ ParseException -> 0x012d }
    L_0x012d:
        r2 = move-exception;
        throw r2;
    L_0x012f:
        r4 = r2;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ak.a(java.io.File, int, java.lang.String[]):java.util.ArrayList");
    }

    public static boolean b(File file, String str) {
        boolean z = false;
        if (file.exists()) {
            try {
                z = file.renameTo(new File(file.getParentFile(), a(file, new Date(), str)));
            } catch (SecurityException e) {
            }
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.File r18, int r19, java.lang.String r20, boolean r21) {
        /*
        r6 = com.whatsapp.util.Log.h;
        r7 = a();
        r8 = new java.util.Date;
        r8.<init>();
        r9 = r7.toPattern();
        r2 = r18.getName();
        r0 = r20;
        r10 = a(r2, r0);
        r2 = r18.getName();
        r11 = b(r2);
        r2 = 0;
        if (r19 >= 0) goto L_0x003b;
    L_0x0024:
        r2 = r18.getName();
        r3 = 46;
        r2 = r2.indexOf(r3);
        r3 = -1;
        if (r2 != r3) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r3 = r18.getName();
        r4 = 0;
        r2 = r3.substring(r4, r2);
    L_0x003b:
        r3 = r18.getParentFile();
        r12 = r3.listFiles();
        if (r12 == 0) goto L_0x0031;
    L_0x0045:
        r13 = r12.length;
        r3 = 0;
    L_0x0047:
        if (r3 >= r13) goto L_0x0031;
    L_0x0049:
        r14 = r12[r3];
        r4 = r14.getName();
        if (r19 >= 0) goto L_0x0066;
    L_0x0051:
        r5 = r4.startsWith(r2);	 Catch:{ SecurityException -> 0x005f }
        if (r5 == 0) goto L_0x005a;
    L_0x0057:
        r14.delete();	 Catch:{ SecurityException -> 0x0063 }
    L_0x005a:
        r3 = r3 + 1;
        if (r6 == 0) goto L_0x0047;
    L_0x005e:
        goto L_0x0031;
    L_0x005f:
        r2 = move-exception;
        throw r2;	 Catch:{ ParseException -> 0x0061 }
    L_0x0061:
        r2 = move-exception;
        throw r2;
    L_0x0063:
        r5 = move-exception;
        if (r6 == 0) goto L_0x005a;
    L_0x0066:
        r5 = r4.startsWith(r11);	 Catch:{ SecurityException -> 0x00b5 }
        if (r5 == 0) goto L_0x005a;
    L_0x006c:
        r5 = r4.endsWith(r10);	 Catch:{ SecurityException -> 0x00b7 }
        if (r5 == 0) goto L_0x005a;
    L_0x0072:
        r5 = r11.length();
        r15 = r9.length();
        r5 = r5 + r15;
        r15 = r4.length();	 Catch:{ SecurityException -> 0x00b9 }
        if (r5 <= r15) goto L_0x0083;
    L_0x0081:
        if (r6 == 0) goto L_0x005a;
    L_0x0083:
        r15 = r11.length();
        r4 = r4.substring(r15, r5);
        r4 = r7.parse(r4);	 Catch:{ ParseException -> 0x00b3, SecurityException -> 0x00bb }
        r16 = r8.getTime();	 Catch:{ ParseException -> 0x00b3, SecurityException -> 0x00bb }
        r4 = r4.getTime();	 Catch:{ ParseException -> 0x00b3, SecurityException -> 0x00bb }
        r4 = r16 - r4;
        r16 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = r4 / r16;
        if (r21 == 0) goto L_0x00a4;
    L_0x00a0:
        r4 = java.lang.Math.abs(r4);	 Catch:{ ParseException -> 0x00b3, SecurityException -> 0x00bb }
    L_0x00a4:
        r0 = r19;
        r0 = (long) r0;
        r16 = r0;
        r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1));
        if (r4 <= 0) goto L_0x005a;
    L_0x00ad:
        r14.delete();	 Catch:{ SecurityException -> 0x00b1, ParseException -> 0x00b3 }
        goto L_0x005a;
    L_0x00b1:
        r4 = move-exception;
        throw r4;	 Catch:{ ParseException -> 0x00b3, SecurityException -> 0x00bb }
    L_0x00b3:
        r4 = move-exception;
        goto L_0x005a;
    L_0x00b5:
        r2 = move-exception;
        throw r2;	 Catch:{ SecurityException -> 0x00b7 }
    L_0x00b7:
        r2 = move-exception;
        throw r2;
    L_0x00b9:
        r2 = move-exception;
        throw r2;
    L_0x00bb:
        r4 = move-exception;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ak.a(java.io.File, int, java.lang.String, boolean):void");
    }

    private static int a(String str) {
        return str.indexOf(46) + "-".length();
    }

    private static int c(File file, File file2) {
        int i = 0;
        int i2 = Log.h;
        String name = file2.getName();
        int length = name.length() + 1;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            int length2 = listFiles.length;
            int i3 = 0;
            while (i3 < length2) {
                int parseInt;
                String name2 = listFiles[i3].getName();
                if (name2.startsWith(name)) {
                    int length3 = name2.length();
                    try {
                        if (length3 <= name2.length() && length < length3) {
                            try {
                                parseInt = Integer.parseInt(name2.substring(length, length3));
                                if (parseInt <= i) {
                                    parseInt = i;
                                }
                                i = parseInt;
                            } catch (NumberFormatException e) {
                            }
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                parseInt = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = parseInt;
            }
        }
        return i;
    }

    public static ArrayList a(File file, File file2) {
        int i = Log.h;
        ArrayList arrayList = new ArrayList();
        int c = c(file, file2);
        String parent = file.getParent();
        int i2 = 1;
        while (i2 <= c) {
            File file3 = new File(parent, file2.getName() + "." + i2);
            try {
                if (file3.exists()) {
                    arrayList.add(file3);
                }
                i2++;
                if (i != 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return arrayList;
    }

    private static SimpleDateFormat a() {
        return new SimpleDateFormat(z[1], Locale.US);
    }

    private static String a(String str, Date date) {
        return str.substring(0, str.indexOf(46)) + "-" + a().format(date);
    }

    public static ArrayList a(ArrayList arrayList) {
        Collections.sort(arrayList, new f(null));
        return arrayList;
    }

    private static String b(String str) {
        return a(str, new Date()).substring(0, a(str));
    }

    public static ArrayList a(File file, int i, String str) {
        int i2 = Log.h;
        SimpleDateFormat a = a();
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        String toPattern = a.toPattern();
        String a2 = a(file.getName(), str);
        String b = b(file.getName());
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles);
            int length = listFiles.length;
            int i3 = 0;
            while (i3 < length) {
                File file2 = listFiles[i3];
                String name = file2.getName();
                try {
                    if (name.startsWith(b) && name.endsWith(a2)) {
                        try {
                            if ((date.getTime() - a.parse(name.substring(b.length(), b.length() + toPattern.length())).getTime()) / 86400000 < ((long) i)) {
                                arrayList.add(file2);
                            }
                        } catch (ParseException e) {
                            throw e;
                        } catch (ParseException e2) {
                        }
                    }
                    i3++;
                    if (i2 != 0) {
                        break;
                    }
                } catch (ParseException e3) {
                    throw e3;
                }
            }
        }
        return arrayList;
    }
}
