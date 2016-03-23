package com.whatsapp.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.v;
import org.whispersystems.at;

public class n {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "Z8D";
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
                        i3 = 116;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 62;
                        break;
                    case at.o /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 72;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "Z8D";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Z8D";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "Z8D";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Z+Sc";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean b(File file, File file2) {
        return ak.b(file, file2);
    }

    public static File a(File file) {
        return ak.a(file, z[4]);
    }

    public static ArrayList b(File file, int i) {
        return ak.a(file, i, z[3]);
    }

    public static File a(File file, File file2) {
        int i = Log.h;
        if (file2.exists()) {
            String a = ak.a(file, new Date(), z[0]);
            File file3 = new File(file.getParentFile(), a);
            File file4 = new File(file.getParentFile(), a + z[1]);
            WritableByteChannel writableByteChannel = null;
            FileChannel fileChannel = null;
            try {
                BufferedInputStream bufferedInputStream;
                int read;
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file4, false));
                byte[] bArr = new byte[32768];
                if (file3.length() > 0) {
                    bufferedInputStream = new BufferedInputStream(new GZIPInputStream(new FileInputStream(file3)));
                    read = bufferedInputStream.read(bArr, 0, bArr.length);
                    while (read != -1) {
                        gZIPOutputStream.write(bArr, 0, read);
                        read = bufferedInputStream.read(bArr, 0, bArr.length);
                        if (i != 0) {
                            break;
                        }
                    }
                    bufferedInputStream.close();
                }
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                read = bufferedInputStream.read(bArr, 0, bArr.length);
                while (read != -1) {
                    gZIPOutputStream.write(bArr, 0, read);
                    read = bufferedInputStream.read(bArr, 0, bArr.length);
                    if (i != 0) {
                        break;
                    }
                }
                bufferedInputStream.close();
                gZIPOutputStream.close();
                file4.renameTo(file3);
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (file4 != null) {
                    try {
                        if (file4.exists()) {
                            if (!file4.getAbsolutePath().equals(file3.getAbsolutePath())) {
                                try {
                                    file4.delete();
                                } catch (FileNotFoundException e) {
                                    throw e;
                                }
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        throw e2;
                    } catch (FileNotFoundException e22) {
                        throw e22;
                    }
                }
                if (writableByteChannel != null) {
                    try {
                        writableByteChannel.close();
                    } catch (FileNotFoundException e222) {
                        throw e222;
                    }
                }
            } catch (FileNotFoundException e3) {
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (FileNotFoundException e2222) {
                        throw e2222;
                    }
                }
                if (file4 != null) {
                    try {
                        if (file4.exists()) {
                            if (!file4.getAbsolutePath().equals(file3.getAbsolutePath())) {
                                try {
                                    file4.delete();
                                } catch (FileNotFoundException e22222) {
                                    throw e22222;
                                }
                            }
                        }
                    } catch (FileNotFoundException e222222) {
                        throw e222222;
                    } catch (FileNotFoundException e2222222) {
                        throw e2222222;
                    }
                }
                if (writableByteChannel != null) {
                    try {
                        writableByteChannel.close();
                    } catch (FileNotFoundException e22222222) {
                        throw e22222222;
                    }
                }
            } catch (Throwable th) {
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (FileNotFoundException e222222222) {
                        throw e222222222;
                    }
                }
                if (file4 != null) {
                    try {
                        if (file4.exists()) {
                            if (!file4.getAbsolutePath().equals(file3.getAbsolutePath())) {
                                file4.delete();
                            }
                        }
                    } catch (FileNotFoundException e2222222222) {
                        throw e2222222222;
                    } catch (FileNotFoundException e22222222222) {
                        throw e22222222222;
                    }
                }
                if (writableByteChannel != null) {
                    try {
                        writableByteChannel.close();
                    } catch (FileNotFoundException e222222222222) {
                        throw e222222222222;
                    }
                }
            }
            try {
                if (file3.exists()) {
                    return file3;
                }
            } catch (FileNotFoundException e2222222222222) {
                throw e2222222222222;
            }
        }
        return null;
    }

    public static void a(File file, int i) {
        ak.a(file, i, z[2], true);
    }
}
