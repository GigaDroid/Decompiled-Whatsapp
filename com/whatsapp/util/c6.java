package com.whatsapp.util;

import com.whatsapp.App;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class c6 {
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "~7g01h?h=8iu|0-;";
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
                        i3 = 27;
                        break;
                    case at.g /*1*/:
                        i3 = 90;
                        break;
                    case at.i /*2*/:
                        i3 = 6;
                        break;
                    case at.o /*3*/:
                        i3 = 89;
                        break;
                    default:
                        i3 = 93;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "~7g01h?h=8iu|0-45s-}";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "~7g01h?h=8iu|0-45s-}";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "~7g01h?h=8iu|0-43hy";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "w5a*sa3v";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "~7g01h?h=8iu|0-45s-}";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "w5a*sa3v";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "~7g01h?h=8iu|0-43hy";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "~7g01h?h=8iu|0-43hy";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static File a(List list, boolean z) {
        IOException e;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        BufferedInputStream bufferedInputStream2 = null;
        int i = Log.h;
        if (list != null) {
            try {
                if (App.a3 != null) {
                    if (list.size() != 0) {
                        File file;
                        ZipOutputStream zipOutputStream;
                        if (z) {
                            try {
                                file = new File(App.a3, z[7]);
                            } catch (IOException e2) {
                                e = e2;
                                zipOutputStream = null;
                                bufferedInputStream = null;
                                try {
                                    Log.e(z[0] + e.toString());
                                    if (bufferedInputStream != null) {
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e3) {
                                            Log.e(z[8] + e3.toString());
                                        }
                                    }
                                    if (zipOutputStream != null) {
                                        try {
                                            zipOutputStream.close();
                                        } catch (IOException e32) {
                                            Log.e(z[2] + e32.toString());
                                            return null;
                                        }
                                    }
                                    return null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedInputStream2 = bufferedInputStream;
                                    if (bufferedInputStream2 != null) {
                                        try {
                                            bufferedInputStream2.close();
                                        } catch (IOException e4) {
                                            Log.e(z[1] + e4.toString());
                                        }
                                    }
                                    if (zipOutputStream != null) {
                                        try {
                                            zipOutputStream.close();
                                        } catch (IOException e42) {
                                            Log.e(z[6] + e42.toString());
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                zipOutputStream = null;
                                if (bufferedInputStream2 != null) {
                                    bufferedInputStream2.close();
                                }
                                if (zipOutputStream != null) {
                                    zipOutputStream.close();
                                }
                                throw th;
                            }
                        }
                        file = new File(App.J.b(), z[5]);
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                        try {
                            File file2;
                            byte[] bArr = new byte[16384];
                            for (File file22 : list) {
                                bufferedInputStream = new BufferedInputStream(new FileInputStream(file22), 16384);
                                try {
                                    zipOutputStream.putNextEntry(new ZipEntry(file22.getName()));
                                    do {
                                        int read = bufferedInputStream.read(bArr, 0, 16384);
                                        if (read == -1) {
                                            break;
                                        }
                                        zipOutputStream.write(bArr, 0, read);
                                    } while (i == 0);
                                    bufferedInputStream.close();
                                    if (i != 0) {
                                        break;
                                    }
                                } catch (IOException e5) {
                                    e32 = e5;
                                }
                            }
                            BufferedInputStream bufferedInputStream3 = null;
                            if (null != null) {
                                try {
                                    bufferedInputStream3.close();
                                } catch (IOException e322) {
                                    Log.e(z[4] + e322.toString());
                                    file22 = null;
                                }
                            }
                            file22 = file;
                            if (zipOutputStream == null) {
                                return file22;
                            }
                            try {
                                zipOutputStream.close();
                                return file22;
                            } catch (IOException e3222) {
                                Log.e(z[3] + e3222.toString());
                                return null;
                            }
                        } catch (IOException e6) {
                            e3222 = e6;
                            bufferedInputStream = null;
                            Log.e(z[0] + e3222.toString());
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            if (zipOutputStream != null) {
                                zipOutputStream.close();
                            }
                            return null;
                        } catch (Throwable th4) {
                            th = th4;
                            if (bufferedInputStream2 != null) {
                                bufferedInputStream2.close();
                            }
                            if (zipOutputStream != null) {
                                zipOutputStream.close();
                            }
                            throw th;
                        }
                    }
                }
            } catch (IOException e32222) {
                throw e32222;
            } catch (IOException e322222) {
                try {
                    throw e322222;
                } catch (IOException e3222222) {
                    throw e3222222;
                }
            }
        }
        return null;
    }
}
