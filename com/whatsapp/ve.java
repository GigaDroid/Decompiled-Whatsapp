package com.whatsapp;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.backport.util.Base64;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.ao;
import com.whatsapp.util.aq;
import dalvik.system.DexFile;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ve {
    private static final String[] a;
    private static Boolean b;
    private static final byte[] c;
    private static Boolean d;
    private static Boolean e;
    private static int f;
    private static Boolean g;
    private static String h;
    private static String i;
    private static final byte[] j;
    private static final byte[] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final String[] z;

    public static boolean b(byte[] bArr, String str) {
        try {
            if (!a(q(), bArr, azx.i + str, j)) {
                return false;
            }
            App.K = bArr;
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private static void a(byte[] bArr, File file) {
        Closeable objectOutputStream;
        Throwable th;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            try {
                objectOutputStream.writeObject(bArr);
                ao.a(objectOutputStream);
            } catch (Throwable th2) {
                th = th2;
                ao.a(objectOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
            ao.a(objectOutputStream);
            throw th;
        }
    }

    private static void a(boolean z) {
        int i = 0;
        Log.i(z[41]);
        Editor edit = App.z().getSharedPreferences(z[42], 0).edit();
        try {
            String str = z[40];
            if (z) {
                i = 1;
            }
            try {
                edit.putInt(str, i);
                if (!edit.commit()) {
                    Log.w(z[39]);
                }
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    private static File k() {
        return new File(App.z().getFilesDir(), z[158]);
    }

    public static boolean c(byte[] bArr, String str) {
        try {
            if (!a(s(), bArr, azx.i + str, j)) {
                return false;
            }
            App.K = bArr;
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static String h() {
        String str = null;
        File k = k();
        try {
            if (!k.exists()) {
                return str;
            }
            byte[] a = a(k);
            if (a == null) {
                return str;
            }
            try {
                MessageDigest instance = MessageDigest.getInstance(z[166]);
                instance.reset();
                instance.update(a);
                return Base64.encodeToString(instance.digest(), 2);
            } catch (Throwable e) {
                Log.a(e);
                return str;
            }
        } catch (NoSuchAlgorithmException e2) {
            throw e2;
        }
    }

    public static boolean E() {
        try {
            ask f = f();
            if (f == null) {
                return false;
            }
            try {
                if (f.c.b == null) {
                    return false;
                }
                if (f.b == null) {
                    return false;
                }
                return Arrays.equals(a(f.c.b), f.b);
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable e3) {
            Log.c(z[47], e3);
            return false;
        }
    }

    public static String Q() {
        String r = r();
        if (r != null) {
            return f(r);
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean l() {
        /*
        r3 = 0;
        r0 = e;	 Catch:{ Exception -> 0x000c }
        if (r0 == 0) goto L_0x000e;
    L_0x0005:
        r0 = e;	 Catch:{ Exception -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ Exception -> 0x000c }
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x003c }
        r1 = z;	 Catch:{ Exception -> 0x003c }
        r2 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r1 = r1[r2];	 Catch:{ Exception -> 0x003c }
        r0.<init>(r1);	 Catch:{ Exception -> 0x003c }
        r0 = r0.exists();	 Catch:{ Exception -> 0x0038 }
        if (r0 == 0) goto L_0x002a;
    L_0x001f:
        r0 = 1;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ Exception -> 0x0038 }
        e = r0;	 Catch:{ Exception -> 0x0038 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ Exception -> 0x0038 }
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ Exception -> 0x003a }
        e = r0;	 Catch:{ Exception -> 0x003a }
    L_0x0031:
        r0 = e;
        r0 = r0.booleanValue();
        goto L_0x000b;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        r0 = java.lang.Boolean.valueOf(r3);
        e = r0;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ve.l():boolean");
    }

    private static byte[] D() {
        return a(16);
    }

    public static boolean F() {
        try {
            if (b == null) {
                b = Boolean.valueOf(y());
            }
            return b.booleanValue();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean y() {
        /*
        r3 = 2;
        r2 = 0;
        r1 = 1;
        r0 = android.os.Build.TAGS;
        if (r0 == 0) goto L_0x0018;
    L_0x0007:
        r4 = z;	 Catch:{ Exception -> 0x0014 }
        r5 = 18;
        r4 = r4[r5];	 Catch:{ Exception -> 0x0014 }
        r0 = r0.contains(r4);	 Catch:{ Exception -> 0x0014 }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        return r1;
    L_0x0014:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        throw r0;
    L_0x0018:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x01ab }
        r4 = z;	 Catch:{ Exception -> 0x01ab }
        r5 = 21;
        r4 = r4[r5];	 Catch:{ Exception -> 0x01ab }
        r0.<init>(r4);	 Catch:{ Exception -> 0x01ab }
        r0 = r0.exists();	 Catch:{ Exception -> 0x01ab }
        if (r0 != 0) goto L_0x0013;
    L_0x0029:
        r7 = new java.io.File;
        r0 = z;
        r4 = 20;
        r0 = r0[r4];
        r7.<init>(r0);
        r8 = new java.io.File;
        r0 = z;
        r4 = 22;
        r0 = r0[r4];
        r8.<init>(r0);
        r5 = 0;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x011a, NoSuchMethodError -> 0x012d }
        r4 = 9;
        if (r0 < r4) goto L_0x01ae;
    L_0x0046:
        r0 = r7.canExecute();	 Catch:{ Exception -> 0x011a, NoSuchMethodError -> 0x012d }
        if (r0 == 0) goto L_0x0122;
    L_0x004c:
        r0 = r1;
    L_0x004d:
        r3 = r8.canExecute();	 Catch:{ Exception -> 0x0125, NoSuchMethodError -> 0x01a9 }
        if (r3 == 0) goto L_0x012a;
    L_0x0053:
        r3 = r1;
    L_0x0054:
        r9 = p();
        r4 = j();
        if (r4 != 0) goto L_0x014f;
    L_0x005e:
        r4 = "4";
    L_0x0061:
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0161 }
        r6.<init>();	 Catch:{ Exception -> 0x0161 }
        r10 = z;	 Catch:{ Exception -> 0x0161 }
        r11 = 15;
        r10 = r10[r11];	 Catch:{ Exception -> 0x0161 }
        r10 = r6.append(r10);	 Catch:{ Exception -> 0x0161 }
        r6 = r7.exists();	 Catch:{ Exception -> 0x0161 }
        if (r6 == 0) goto L_0x0163;
    L_0x0076:
        r6 = r1;
    L_0x0077:
        r10 = r10.append(r6);	 Catch:{ Exception -> 0x0166 }
        r6 = r7.canRead();	 Catch:{ Exception -> 0x0166 }
        if (r6 == 0) goto L_0x0168;
    L_0x0081:
        r6 = r1;
    L_0x0082:
        r10 = r10.append(r6);	 Catch:{ Exception -> 0x016b }
        r6 = r7.canWrite();	 Catch:{ Exception -> 0x016b }
        if (r6 == 0) goto L_0x016d;
    L_0x008c:
        r6 = r1;
    L_0x008d:
        r6 = r10.append(r6);	 Catch:{ Exception -> 0x0170 }
        r6 = r6.append(r0);	 Catch:{ Exception -> 0x0170 }
        if (r9 == 0) goto L_0x0172;
    L_0x0097:
        r0 = z;	 Catch:{ Exception -> 0x0170 }
        r10 = 19;
        r0 = r0[r10];	 Catch:{ Exception -> 0x0170 }
    L_0x009d:
        r0 = r6.append(r0);	 Catch:{ Exception -> 0x0177 }
        r0 = r0.append(r4);	 Catch:{ Exception -> 0x0177 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0177 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0177 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0177 }
        r0.<init>();	 Catch:{ Exception -> 0x0177 }
        r6 = z;	 Catch:{ Exception -> 0x0177 }
        r10 = 17;
        r6 = r6[r10];	 Catch:{ Exception -> 0x0177 }
        r6 = r0.append(r6);	 Catch:{ Exception -> 0x0177 }
        r0 = r8.exists();	 Catch:{ Exception -> 0x0177 }
        if (r0 == 0) goto L_0x0179;
    L_0x00c1:
        r0 = r1;
    L_0x00c2:
        r6 = r6.append(r0);	 Catch:{ Exception -> 0x017c }
        r0 = r8.canRead();	 Catch:{ Exception -> 0x017c }
        if (r0 == 0) goto L_0x017e;
    L_0x00cc:
        r0 = r1;
    L_0x00cd:
        r6 = r6.append(r0);	 Catch:{ Exception -> 0x0181 }
        r0 = r8.canWrite();	 Catch:{ Exception -> 0x0181 }
        if (r0 == 0) goto L_0x0183;
    L_0x00d7:
        r0 = r1;
    L_0x00d8:
        r0 = r6.append(r0);	 Catch:{ Exception -> 0x0186 }
        r3 = r0.append(r3);	 Catch:{ Exception -> 0x0186 }
        if (r9 == 0) goto L_0x0188;
    L_0x00e2:
        r0 = z;	 Catch:{ Exception -> 0x0186 }
        r6 = 14;
        r0 = r0[r6];	 Catch:{ Exception -> 0x0186 }
    L_0x00e8:
        r0 = r3.append(r0);	 Catch:{ Exception -> 0x018d }
        r0 = r0.append(r4);	 Catch:{ Exception -> 0x018d }
        r0 = r0.toString();	 Catch:{ Exception -> 0x018d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x018d }
        r0 = r7.exists();	 Catch:{ Exception -> 0x018d }
        if (r0 != 0) goto L_0x0013;
    L_0x00fd:
        r0 = r8.exists();	 Catch:{ Exception -> 0x018f }
        if (r0 != 0) goto L_0x0013;
    L_0x0103:
        r3 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0191, all -> 0x0198 }
        r3.<init>(r7);	 Catch:{ Exception -> 0x0191, all -> 0x0198 }
        com.whatsapp.util.ao.a(r3);
    L_0x010b:
        if (r3 != 0) goto L_0x0013;
    L_0x010d:
        r0 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x019d, all -> 0x01a4 }
        r0.<init>(r8);	 Catch:{ Exception -> 0x019d, all -> 0x01a4 }
        com.whatsapp.util.ao.a(r0);
    L_0x0115:
        if (r0 != 0) goto L_0x0013;
    L_0x0117:
        r1 = r2;
        goto L_0x0013;
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x011c, NoSuchMethodError -> 0x012d }
    L_0x011c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x011e, NoSuchMethodError -> 0x012d }
    L_0x011e:
        r0 = move-exception;
        r0 = r3;
        goto L_0x0054;
    L_0x0122:
        r0 = r2;
        goto L_0x004d;
    L_0x0125:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0127, NoSuchMethodError -> 0x01a9 }
    L_0x0127:
        r4 = move-exception;
        goto L_0x0054;
    L_0x012a:
        r3 = r2;
        goto L_0x0054;
    L_0x012d:
        r0 = move-exception;
        r0 = r3;
    L_0x012f:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r6 = z;
        r9 = 16;
        r6 = r6[r9];
        r4 = r4.append(r6);
        r6 = android.os.Build.VERSION.SDK_INT;
        r4 = r4.append(r6);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        goto L_0x0054;
    L_0x014d:
        r0 = move-exception;
        throw r0;
    L_0x014f:
        r4 = r4.booleanValue();	 Catch:{ Exception -> 0x015a }
        if (r4 == 0) goto L_0x015c;
    L_0x0155:
        r4 = "3";
        goto L_0x0061;
    L_0x015a:
        r0 = move-exception;
        throw r0;
    L_0x015c:
        r4 = "";
        goto L_0x0061;
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r6 = r2;
        goto L_0x0077;
    L_0x0166:
        r0 = move-exception;
        throw r0;
    L_0x0168:
        r6 = r2;
        goto L_0x0082;
    L_0x016b:
        r0 = move-exception;
        throw r0;
    L_0x016d:
        r6 = r2;
        goto L_0x008d;
    L_0x0170:
        r0 = move-exception;
        throw r0;
    L_0x0172:
        r0 = "";
        goto L_0x009d;
    L_0x0177:
        r0 = move-exception;
        throw r0;
    L_0x0179:
        r0 = r2;
        goto L_0x00c2;
    L_0x017c:
        r0 = move-exception;
        throw r0;
    L_0x017e:
        r0 = r2;
        goto L_0x00cd;
    L_0x0181:
        r0 = move-exception;
        throw r0;
    L_0x0183:
        r0 = r2;
        goto L_0x00d8;
    L_0x0186:
        r0 = move-exception;
        throw r0;
    L_0x0188:
        r0 = "";
        goto L_0x00e8;
    L_0x018d:
        r0 = move-exception;
        throw r0;
    L_0x018f:
        r0 = move-exception;
        throw r0;
    L_0x0191:
        r0 = move-exception;
        com.whatsapp.util.ao.a(r5);
        r3 = r5;
        goto L_0x010b;
    L_0x0198:
        r0 = move-exception;
        com.whatsapp.util.ao.a(r5);
        throw r0;
    L_0x019d:
        r0 = move-exception;
        com.whatsapp.util.ao.a(r3);
        r0 = r3;
        goto L_0x0115;
    L_0x01a4:
        r0 = move-exception;
        com.whatsapp.util.ao.a(r3);
        throw r0;
    L_0x01a9:
        r4 = move-exception;
        goto L_0x012f;
    L_0x01ab:
        r0 = move-exception;
        goto L_0x0029;
    L_0x01ae:
        r0 = r3;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ve.y():boolean");
    }

    private static File s() {
        return new File(App.z().getFilesDir(), z[48]);
    }

    public static String v() {
        boolean z = DialogToastActivity.f;
        StringBuilder stringBuilder = new StringBuilder();
        int i = 15;
        try {
            Enumeration entries = new DexFile(App.z().getApplicationInfo().sourceDir).entries();
            while (entries.hasMoreElements()) {
                int i2 = i - 1;
                if (i2 < 0 && !z) {
                    break;
                }
                stringBuilder.append((String) entries.nextElement());
                stringBuilder.append(";");
                if (z) {
                    break;
                }
                i = i2;
            }
        } catch (Throwable e) {
            Log.a(e);
        }
        return stringBuilder.toString();
    }

    public static boolean a(byte[] bArr, String str) {
        File k = k();
        boolean a = a(k, bArr, azx.k + str + r(), m);
        File J = J();
        try {
            if (J.exists() || J.mkdirs()) {
                J = i();
                byte[] a2 = a(k);
                try {
                    a(a2, J);
                    Log.i(z[46] + Arrays.equals(a2, a(J)));
                } catch (Throwable e) {
                    Log.b(z[45], e);
                }
            }
            return a;
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }

    public static Boolean P() {
        File i = i();
        try {
            if (!i.exists()) {
                return null;
            }
            File k = k();
            try {
                if (!k.exists()) {
                    return null;
                }
                byte[] a = a(k);
                byte[] a2 = a(i);
                if (a != null && a2 != null) {
                    return Boolean.valueOf(Arrays.equals(a, a2));
                }
                try {
                    return Boolean.valueOf(false);
                } catch (NullPointerException e) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    private static File q() {
        return new File(App.z().getFilesDir(), z[43]);
    }

    private static File z() {
        return new File(App.z().getFilesDir(), z[167]);
    }

    public static Boolean O() {
        boolean z = true;
        int i = App.z().getSharedPreferences(z[130], 0).getInt(z[129], -1);
        if (i == -1) {
            return null;
        }
        if (i != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static boolean G() {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        Throwable e;
        Throwable th;
        BufferedInputStream bufferedInputStream3 = null;
        boolean z = false;
        try {
            Process exec = Runtime.getRuntime().exec(z[12]);
            bufferedInputStream = new BufferedInputStream(exec.getInputStream());
            try {
                bufferedInputStream2 = new BufferedInputStream(exec.getErrorStream());
            } catch (Exception e2) {
                e = e2;
                bufferedInputStream2 = null;
                bufferedInputStream3 = bufferedInputStream;
                try {
                    Log.a(e);
                    if (bufferedInputStream3 != null) {
                        try {
                            bufferedInputStream3.close();
                        } catch (NullPointerException e3) {
                            throw e3;
                        } catch (IOException e4) {
                        }
                    }
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (NullPointerException e32) {
                            throw e32;
                        } catch (IOException e5) {
                        }
                    }
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream3;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (NullPointerException e322) {
                            throw e322;
                        } catch (IOException e6) {
                        }
                    }
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (NullPointerException e3222) {
                            throw e3222;
                        } catch (IOException e7) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream2 = null;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
                throw th;
            }
            try {
                exec.waitFor();
                int available = bufferedInputStream2.available();
                bufferedInputStream2.read(new byte[available], 0, available);
                available = bufferedInputStream.available();
                byte[] bArr = new byte[available];
                bufferedInputStream.read(bArr, 0, available);
                if (new String(bArr).contains(z[13])) {
                    z = true;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (NullPointerException e32222) {
                            throw e32222;
                        } catch (IOException e8) {
                        }
                    }
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (NullPointerException e322222) {
                            throw e322222;
                        } catch (IOException e9) {
                        }
                    }
                } else {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (NullPointerException e3222222) {
                            throw e3222222;
                        } catch (IOException e10) {
                        }
                    }
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (NullPointerException e32222222) {
                            throw e32222222;
                        } catch (IOException e11) {
                        }
                    }
                }
            } catch (Exception e12) {
                e = e12;
                bufferedInputStream3 = bufferedInputStream;
                Log.a(e);
                if (bufferedInputStream3 != null) {
                    bufferedInputStream3.close();
                }
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
                return z;
            } catch (Throwable th4) {
                th = th4;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            bufferedInputStream2 = null;
            Log.a(e);
            if (bufferedInputStream3 != null) {
                bufferedInputStream3.close();
            }
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            return z;
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream2 = null;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            throw th;
        }
        return z;
    }

    public static void b() {
        String externalStorageState = Environment.getExternalStorageState();
        try {
            if (App.p(externalStorageState)) {
                File i = i();
                File k = k();
                byte[] a = a(k);
                byte[] a2 = a(i);
                boolean exists = i.exists();
                try {
                    Object valueOf;
                    StringBuilder append = new StringBuilder().append(z[8]).append(exists).append(" ");
                    if (exists) {
                        valueOf = Long.valueOf(i.lastModified());
                    } else {
                        valueOf = "";
                    }
                    try {
                        Log.i(append.append(valueOf).toString());
                        if (a != null || a2 != null) {
                            if (!Arrays.equals(a, a2)) {
                                byte[] bArr;
                                String str;
                                File file;
                                if (a != null) {
                                    String str2 = "e";
                                    Log.i(z[5]);
                                    if (!DialogToastActivity.f) {
                                        bArr = a;
                                        File file2 = i;
                                        str = str2;
                                        file = file2;
                                        a(bArr, file);
                                        Arrays.equals(bArr, a(file));
                                        if ("i".equals(str)) {
                                            A();
                                        }
                                    }
                                }
                                Log.i(z[6]);
                                c(externalStorageState);
                                a(i.exists());
                                str = "i";
                                file = k;
                                bArr = a2;
                                try {
                                    a(bArr, file);
                                    Arrays.equals(bArr, a(file));
                                    if ("i".equals(str)) {
                                        A();
                                    }
                                } catch (Exception e) {
                                    throw e;
                                } catch (Exception e2) {
                                    Log.e(z[7] + str);
                                }
                            }
                        }
                    } catch (Exception e3) {
                        throw e3;
                    } catch (Exception e32) {
                        try {
                            throw e32;
                        } catch (Exception e322) {
                            throw e322;
                        }
                    }
                } catch (Exception e3222) {
                    throw e3222;
                }
            }
        } catch (Exception e32222) {
            throw e32222;
        }
    }

    public static byte[] g(String str) {
        try {
            return a(k(), azx.k + str + r(), m);
        } catch (Throwable e) {
            Log.c(z[128], e);
            return null;
        }
    }

    public static byte[] b(String str) {
        try {
            return a(q(), azx.i + str, j);
        } catch (Throwable e) {
            Log.c(z[131], e);
            return null;
        }
    }

    public static aae a(InputStream inputStream) {
        boolean z = DialogToastActivity.f;
        Object obj = new byte[k.length];
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        Object obj2 = new byte[((((obj.length + 1) + bArr.length) + bArr2.length) + bArr3.length)];
        inputStream.read(obj2);
        System.arraycopy(obj2, 0, obj, 0, k.length);
        int length = 0 + k.length;
        try {
            if (!Arrays.equals(obj, l)) {
                if (!Arrays.equals(obj, c)) {
                    throw new te(null);
                }
            }
            int i = length + 1;
            String valueOf = String.valueOf(obj2[length]);
            byte[][] bArr4 = new byte[][]{bArr, bArr2, bArr3};
            int length2 = bArr4.length;
            int i2 = i;
            i = 0;
            while (i < length2) {
                Object obj3 = bArr4[i];
                System.arraycopy(obj2, i2, obj3, 0, obj3.length);
                i2 += obj3.length;
                i++;
                if (z) {
                    break;
                }
            }
            return new aae(obj, valueOf, bArr, bArr2, bArr3);
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static Boolean j() {
        try {
            if (App.p.o(z[2]) != 0) {
                return null;
            }
            Object subscriberId = App.W.getSubscriberId();
            try {
                if (TextUtils.isEmpty(subscriberId)) {
                    return Boolean.TRUE;
                }
                try {
                    return subscriberId.contains(z[1]) ? Boolean.TRUE : Boolean.FALSE;
                } catch (NullPointerException e) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    private static byte[] t() {
        return a(4);
    }

    private static boolean a(File file, byte[] bArr, String str, byte[] bArr2) {
        boolean z = false;
        boolean z2 = DialogToastActivity.f;
        try {
            byte[] t = t();
            byte[] D = D();
            Key secretKeySpec = new SecretKeySpec(a(str, t), z[9]);
            Cipher instance = Cipher.getInstance(z[10]);
            instance.init(1, secretKeySpec, new IvParameterSpec(D));
            byte[] bArr3 = new byte[(((bArr2.length + t.length) + D.length) + instance.doFinal(bArr).length)];
            byte[][] bArr4 = new byte[][]{bArr2, t, D, instance.doFinal(bArr)};
            int length = bArr4.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Object obj = bArr4[i];
                System.arraycopy(obj, 0, bArr3, i2, obj.length);
                i2 += obj.length;
                i++;
                if (z2) {
                    break;
                }
            }
            a(bArr3, file);
            z = Arrays.equals(bArr3, a(file));
        } catch (Throwable e) {
            Log.b(z[11] + file.toString(), e);
        }
        return z;
    }

    public static void a(OutputStream outputStream, ask com_whatsapp_ask) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        byte[] bArr = new byte[]{Byte.parseByte(com_whatsapp_ask.c.e)};
        byte[][] bArr2 = new byte[][]{k, bArr, com_whatsapp_ask.c.a, com_whatsapp_ask.c.b, com_whatsapp_ask.c.d};
        int length = bArr2.length;
        while (i < length) {
            outputStream.write(bArr2[i]);
            i++;
            if (z) {
                return;
            }
        }
    }

    static Boolean K() {
        try {
            return Boolean.valueOf(Environment.getExternalStorageState().equals(z[0]));
        } catch (Exception e) {
            return null;
        }
    }

    public static void c() {
        q().delete();
    }

    public static boolean I() {
        try {
            return !z().exists();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static int a() {
        AccountManager accountManager = AccountManager.get(App.z());
        int i = -1;
        if (accountManager == null) {
            return i;
        }
        try {
            return accountManager.getAccountsByType(z[49]).length;
        } catch (Exception e) {
            return i;
        }
    }

    public static void H() {
        k().delete();
        i().delete();
    }

    public static String e() {
        return App.z().getSharedPreferences(z[3], 0).getString(z[4], null);
    }

    public static void o() {
        s().delete();
    }

    public static boolean w() {
        return z().delete();
    }

    public static byte[] n() {
        return D();
    }

    private static byte[] a(File file) {
        Throwable e;
        try {
            if (file.exists() && file.length() > 0) {
                ObjectInputStream objectInputStream;
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    try {
                        byte[] bArr = (byte[]) objectInputStream.readObject();
                        if (objectInputStream == null) {
                            return bArr;
                        }
                        try {
                            objectInputStream.close();
                            return bArr;
                        } catch (NullPointerException e2) {
                            throw e2;
                        } catch (Throwable e3) {
                            Log.a(e3);
                            return bArr;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        try {
                            Log.c(z[137], e);
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (Throwable e5) {
                                    Log.a(e5);
                                }
                            }
                            return null;
                        } catch (Throwable th) {
                            e5 = th;
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (NullPointerException e22) {
                                    throw e22;
                                } catch (Throwable e32) {
                                    Log.a(e32);
                                }
                            }
                            throw e5;
                        }
                    }
                } catch (Exception e6) {
                    e5 = e6;
                    objectInputStream = null;
                    Log.c(z[137], e5);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    e5 = th2;
                    objectInputStream = null;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw e5;
                }
            }
            return null;
        } catch (IOException e7) {
            throw e7;
        }
    }

    public static byte[] e(String str) {
        try {
            byte[] a = a(k(), azx.k + str + r(), m);
            if (a == null) {
                try {
                    c(Environment.getExternalStorageState());
                } catch (Exception e) {
                    Log.w(z[124] + e.toString());
                }
                File i = i();
                a(i.exists());
                a = a(i, azx.k + str + r(), m);
                if (a != null) {
                    File k = k();
                    try {
                        byte[] a2 = a(i);
                        a(a2, k);
                        Arrays.equals(a2, a(k));
                        Log.i(z[126]);
                        A();
                    } catch (Exception e2) {
                        Log.e(z[127]);
                    }
                }
                if (!DialogToastActivity.f) {
                    return a;
                }
            }
            b();
            return a;
        } catch (Exception e3) {
            throw e3;
        } catch (Throwable e4) {
            Log.c(z[125], e4);
            return null;
        }
    }

    public static byte[] d() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance(z[173]);
            instance.init(160, SecureRandom.getInstance(z[172]));
            return instance.generateKey().getEncoded();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r10, byte[] r11, byte[] r12, byte[] r13, byte[] r14, byte[] r15) {
        /*
        r8 = 1;
        r0 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = new java.io.File;
        r1 = com.whatsapp.App.z();
        r1 = r1.getFilesDir();
        r2 = z;
        r5 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r2 = r2[r5];
        r4.<init>(r1, r2);
        r1 = 16;
        r1 = new byte[r1];
        r2 = new byte[r8];
        r5 = java.lang.Byte.parseByte(r10);
        r2[r0] = r5;
        r5 = k;
        r5 = r5.length;
        r6 = r2.length;
        r5 = r5 + r6;
        r6 = r11.length;
        r5 = r5 + r6;
        r6 = r14.length;
        r5 = r5 + r6;
        r6 = r13.length;
        r5 = r5 + r6;
        r6 = r1.length;
        r5 = r5 + r6;
        r6 = r12.length;
        r5 = r5 + r6;
        r5 = new byte[r5];
        r6 = 7;
        r6 = new byte[r6][];
        r7 = k;
        r6[r0] = r7;
        r6[r8] = r2;
        r2 = 2;
        r6[r2] = r11;
        r2 = 3;
        r6[r2] = r14;
        r2 = 4;
        r6[r2] = r13;
        r2 = 5;
        r6[r2] = r1;
        r1 = 6;
        r6[r1] = r12;
        r7 = r6.length;
        r1 = r0;
        r2 = r0;
    L_0x004f:
        if (r1 >= r7) goto L_0x005d;
    L_0x0051:
        r8 = r6[r1];
        r9 = r8.length;
        java.lang.System.arraycopy(r8, r0, r5, r2, r9);
        r8 = r8.length;
        r2 = r2 + r8;
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x004f;
    L_0x005d:
        a(r5, r4);	 Catch:{ Exception -> 0x006c }
        r1 = a(r4);	 Catch:{ Exception -> 0x006c }
        f();	 Catch:{ Exception -> 0x006c }
        r0 = java.util.Arrays.equals(r5, r1);	 Catch:{ Exception -> 0x006c }
    L_0x006b:
        return r0;
    L_0x006c:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ve.a(java.lang.String, byte[], byte[], byte[], byte[], byte[]):boolean");
    }

    static boolean x() {
        try {
            Class.forName(z[159]);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static SecretKey a(byte[] bArr, byte[] bArr2, int i, int i2) {
        boolean z = DialogToastActivity.f;
        char[] cArr = new char[bArr.length];
        int i3 = 0;
        while (i3 < bArr.length) {
            cArr[i3] = (char) bArr[i3];
            i3++;
            if (z) {
                break;
            }
        }
        try {
            try {
                return SecretKeyFactory.getInstance(z[44]).generateSecret(new PBEKeySpec(cArr, bArr2, i, i2));
            } catch (InvalidKeySpecException e) {
                throw new AssertionError(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static byte[] a(byte[] bArr) {
        return a(bArr, k, false);
    }

    private static File J() {
        return new File(App.a3, z[38]);
    }

    private static byte[] a(int i) {
        try {
            byte[] bArr = new byte[i];
            SecureRandom.getInstance(z[37]).nextBytes(bArr);
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static void c(String str) {
        Log.i(z[156] + str);
        Editor edit = App.z().getSharedPreferences(z[155], 0).edit();
        try {
            edit.putString(z[154], str);
            if (!edit.commit()) {
                Log.w(z[157]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String M() {
        /*
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = i;	 Catch:{ NullPointerException -> 0x0009 }
        if (r0 == 0) goto L_0x000b;
    L_0x0006:
        r0 = i;	 Catch:{ NullPointerException -> 0x0009 }
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r0 = android.os.Build.MANUFACTURER;	 Catch:{ NullPointerException -> 0x0324 }
        if (r0 != 0) goto L_0x0326;
    L_0x000f:
        r0 = "";
    L_0x0012:
        r1 = android.os.Build.VERSION.RELEASE;	 Catch:{ NullPointerException -> 0x032a }
        if (r1 != 0) goto L_0x032c;
    L_0x0016:
        r1 = "";
    L_0x0019:
        r2 = android.os.Build.DISPLAY;	 Catch:{ NullPointerException -> 0x0330 }
        if (r2 != 0) goto L_0x0332;
    L_0x001d:
        r2 = "";
    L_0x0020:
        r3 = android.os.Build.MODEL;	 Catch:{ NullPointerException -> 0x0336 }
        if (r3 != 0) goto L_0x0338;
    L_0x0024:
        r3 = "";
    L_0x0027:
        r6 = com.whatsapp.asx.b();
        r4 = java.util.Locale.US;
        r4 = r6.toLowerCase(r4);
        r7 = z;
        r8 = 61;
        r7 = r7[r8];
        r4 = r4.contains(r7);
        if (r4 == 0) goto L_0x0045;
    L_0x003d:
        r4 = z;
        r7 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r4 = r4[r7];
        if (r5 == 0) goto L_0x037e;
    L_0x0045:
        r4 = java.util.Locale.US;	 Catch:{ NullPointerException -> 0x033c }
        r4 = r0.toLowerCase(r4);	 Catch:{ NullPointerException -> 0x033c }
        r7 = z;	 Catch:{ NullPointerException -> 0x033c }
        r8 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r7 = r7[r8];	 Catch:{ NullPointerException -> 0x033c }
        r4 = r4.contains(r7);	 Catch:{ NullPointerException -> 0x033c }
        if (r4 == 0) goto L_0x005f;
    L_0x0057:
        r4 = z;
        r7 = 81;
        r4 = r4[r7];
        if (r5 == 0) goto L_0x037e;
    L_0x005f:
        r4 = java.util.Locale.US;	 Catch:{ NullPointerException -> 0x033e }
        r4 = r1.toLowerCase(r4);	 Catch:{ NullPointerException -> 0x033e }
        r7 = z;	 Catch:{ NullPointerException -> 0x033e }
        r8 = 64;
        r7 = r7[r8];	 Catch:{ NullPointerException -> 0x033e }
        r4 = r4.contains(r7);	 Catch:{ NullPointerException -> 0x033e }
        if (r4 == 0) goto L_0x0079;
    L_0x0071:
        r4 = z;
        r7 = 83;
        r4 = r4[r7];
        if (r5 == 0) goto L_0x037e;
    L_0x0079:
        r4 = java.util.Locale.US;	 Catch:{ NullPointerException -> 0x0340 }
        r4 = r2.toLowerCase(r4);	 Catch:{ NullPointerException -> 0x0340 }
        r7 = z;	 Catch:{ NullPointerException -> 0x0340 }
        r8 = 91;
        r7 = r7[r8];	 Catch:{ NullPointerException -> 0x0340 }
        r4 = r4.contains(r7);	 Catch:{ NullPointerException -> 0x0340 }
        if (r4 == 0) goto L_0x0093;
    L_0x008b:
        r4 = z;
        r7 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r4 = r4[r7];
        if (r5 == 0) goto L_0x037e;
    L_0x0093:
        r4 = java.util.Locale.US;	 Catch:{ NullPointerException -> 0x0342 }
        r4 = r3.toLowerCase(r4);	 Catch:{ NullPointerException -> 0x0342 }
        r7 = z;	 Catch:{ NullPointerException -> 0x0342 }
        r8 = 92;
        r7 = r7[r8];	 Catch:{ NullPointerException -> 0x0342 }
        r4 = r4.contains(r7);	 Catch:{ NullPointerException -> 0x0342 }
        if (r4 == 0) goto L_0x00ad;
    L_0x00a5:
        r4 = z;
        r7 = 56;
        r4 = r4[r7];
        if (r5 == 0) goto L_0x037e;
    L_0x00ad:
        r4 = java.util.Locale.US;	 Catch:{ NullPointerException -> 0x0344 }
        r4 = r6.toLowerCase(r4);	 Catch:{ NullPointerException -> 0x0344 }
        r7 = z;	 Catch:{ NullPointerException -> 0x0344 }
        r8 = 90;
        r7 = r7[r8];	 Catch:{ NullPointerException -> 0x0344 }
        r4 = r4.contains(r7);	 Catch:{ NullPointerException -> 0x0344 }
        if (r4 == 0) goto L_0x00c7;
    L_0x00bf:
        r4 = z;
        r7 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r4 = r4[r7];
        if (r5 == 0) goto L_0x037e;
    L_0x00c7:
        r4 = z;	 Catch:{ NullPointerException -> 0x0346 }
        r7 = 68;
        r4 = r4[r7];	 Catch:{ NullPointerException -> 0x0346 }
        r4 = r2.startsWith(r4);	 Catch:{ NullPointerException -> 0x0346 }
        if (r4 == 0) goto L_0x00db;
    L_0x00d3:
        r4 = z;
        r7 = 72;
        r4 = r4[r7];
        if (r5 == 0) goto L_0x037e;
    L_0x00db:
        r4 = z;	 Catch:{ NullPointerException -> 0x0348 }
        r7 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r4 = r4[r7];	 Catch:{ NullPointerException -> 0x0348 }
        r0 = r0.startsWith(r4);	 Catch:{ NullPointerException -> 0x0348 }
        if (r0 == 0) goto L_0x00ef;
    L_0x00e7:
        r0 = z;
        r4 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r0 = r0[r4];
        if (r5 == 0) goto L_0x0306;
    L_0x00ef:
        r0 = z;	 Catch:{ NullPointerException -> 0x034a }
        r4 = 62;
        r0 = r0[r4];	 Catch:{ NullPointerException -> 0x034a }
        r0 = r1.startsWith(r0);	 Catch:{ NullPointerException -> 0x034a }
        if (r0 == 0) goto L_0x0103;
    L_0x00fb:
        r0 = z;
        r4 = 80;
        r0 = r0[r4];
        if (r5 == 0) goto L_0x0306;
    L_0x0103:
        r0 = z;	 Catch:{ NullPointerException -> 0x034c }
        r4 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r0 = r0[r4];	 Catch:{ NullPointerException -> 0x034c }
        r0 = r1.startsWith(r0);	 Catch:{ NullPointerException -> 0x034c }
        if (r0 != 0) goto L_0x011b;
    L_0x010f:
        r0 = z;	 Catch:{ NullPointerException -> 0x034c }
        r4 = 99;
        r0 = r0[r4];	 Catch:{ NullPointerException -> 0x034c }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x034c }
        if (r0 == 0) goto L_0x0123;
    L_0x011b:
        r0 = z;
        r4 = 74;
        r0 = r0[r4];
        if (r5 == 0) goto L_0x0306;
    L_0x0123:
        r0 = z;	 Catch:{ NullPointerException -> 0x034e }
        r4 = 98;
        r0 = r0[r4];	 Catch:{ NullPointerException -> 0x034e }
        r0 = r1.startsWith(r0);	 Catch:{ NullPointerException -> 0x034e }
        if (r0 == 0) goto L_0x0137;
    L_0x012f:
        r0 = z;
        r1 = 55;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x0137:
        r0 = z;	 Catch:{ NullPointerException -> 0x0350 }
        r1 = 84;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0350 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0350 }
        if (r0 == 0) goto L_0x014b;
    L_0x0143:
        r0 = z;
        r1 = 100;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x014b:
        r0 = z;	 Catch:{ NullPointerException -> 0x0352 }
        r1 = 88;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0352 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0352 }
        if (r0 == 0) goto L_0x015f;
    L_0x0157:
        r0 = z;
        r1 = 69;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x015f:
        r0 = z;	 Catch:{ NullPointerException -> 0x0354 }
        r1 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0354 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0354 }
        if (r0 == 0) goto L_0x0173;
    L_0x016b:
        r0 = z;
        r1 = 59;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x0173:
        r0 = z;	 Catch:{ NullPointerException -> 0x0356 }
        r1 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0356 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0356 }
        if (r0 == 0) goto L_0x0187;
    L_0x017f:
        r0 = z;
        r1 = 70;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x0187:
        r0 = z;	 Catch:{ NullPointerException -> 0x0358 }
        r1 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0358 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0358 }
        if (r0 == 0) goto L_0x019b;
    L_0x0193:
        r0 = z;
        r1 = 89;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x019b:
        r0 = z;	 Catch:{ NullPointerException -> 0x035a }
        r1 = 71;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x035a }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x035a }
        if (r0 == 0) goto L_0x01af;
    L_0x01a7:
        r0 = z;
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x01af:
        r0 = z;	 Catch:{ NullPointerException -> 0x035c }
        r1 = 60;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x035c }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x035c }
        if (r0 == 0) goto L_0x01c3;
    L_0x01bb:
        r0 = z;
        r1 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x01c3:
        r0 = z;	 Catch:{ NullPointerException -> 0x035e }
        r1 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x035e }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x035e }
        if (r0 == 0) goto L_0x01d7;
    L_0x01cf:
        r0 = z;
        r1 = 75;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x01d7:
        r0 = z;	 Catch:{ NullPointerException -> 0x0360 }
        r1 = 95;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0360 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0360 }
        if (r0 == 0) goto L_0x01eb;
    L_0x01e3:
        r0 = z;
        r1 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x01eb:
        r0 = z;	 Catch:{ NullPointerException -> 0x0362 }
        r1 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0362 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0362 }
        if (r0 == 0) goto L_0x01ff;
    L_0x01f7:
        r0 = z;
        r1 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x01ff:
        r0 = z;	 Catch:{ NullPointerException -> 0x0364 }
        r1 = 96;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0364 }
        r0 = r3.startsWith(r0);	 Catch:{ NullPointerException -> 0x0364 }
        if (r0 == 0) goto L_0x0213;
    L_0x020b:
        r0 = z;
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x0213:
        r0 = z;	 Catch:{ NullPointerException -> 0x0366 }
        r1 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0366 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0366 }
        if (r0 == 0) goto L_0x0227;
    L_0x021f:
        r0 = z;
        r1 = 66;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x0227:
        r0 = z;	 Catch:{ NullPointerException -> 0x0368 }
        r1 = 63;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0368 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0368 }
        if (r0 == 0) goto L_0x023b;
    L_0x0233:
        r0 = z;
        r1 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x023b:
        r0 = z;	 Catch:{ NullPointerException -> 0x036a }
        r1 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x036a }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x036a }
        if (r0 == 0) goto L_0x024f;
    L_0x0247:
        r0 = z;
        r1 = 73;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x024f:
        r0 = z;	 Catch:{ NullPointerException -> 0x036c }
        r1 = 77;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x036c }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x036c }
        if (r0 == 0) goto L_0x0263;
    L_0x025b:
        r0 = z;
        r1 = 97;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x0263:
        r0 = z;	 Catch:{ NullPointerException -> 0x036e }
        r1 = 58;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x036e }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x036e }
        if (r0 == 0) goto L_0x0277;
    L_0x026f:
        r0 = z;
        r1 = 86;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x0277:
        r0 = z;	 Catch:{ NullPointerException -> 0x0370 }
        r1 = 79;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0370 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0370 }
        if (r0 == 0) goto L_0x028b;
    L_0x0283:
        r0 = z;
        r1 = 85;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x028b:
        r0 = z;	 Catch:{ NullPointerException -> 0x0372 }
        r1 = 67;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0372 }
        r0 = r2.startsWith(r0);	 Catch:{ NullPointerException -> 0x0372 }
        if (r0 == 0) goto L_0x029f;
    L_0x0297:
        r0 = z;
        r1 = 65;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x029f:
        r0 = z;	 Catch:{ NullPointerException -> 0x0374 }
        r1 = 57;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0374 }
        r0 = r6.contains(r0);	 Catch:{ NullPointerException -> 0x0374 }
        if (r0 == 0) goto L_0x02b3;
    L_0x02ab:
        r0 = z;
        r1 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x02b3:
        r0 = z;	 Catch:{ NullPointerException -> 0x0376 }
        r1 = 94;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0376 }
        r0 = r6.contains(r0);	 Catch:{ NullPointerException -> 0x0376 }
        if (r0 == 0) goto L_0x02c7;
    L_0x02bf:
        r0 = z;
        r1 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x02c7:
        r0 = z;	 Catch:{ NullPointerException -> 0x0378 }
        r1 = 93;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0378 }
        r0 = r6.contains(r0);	 Catch:{ NullPointerException -> 0x0378 }
        if (r0 == 0) goto L_0x02db;
    L_0x02d3:
        r0 = z;
        r1 = 76;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x02db:
        r0 = z;	 Catch:{ NullPointerException -> 0x037a }
        r1 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x037a }
        r0 = r6.contains(r0);	 Catch:{ NullPointerException -> 0x037a }
        if (r0 == 0) goto L_0x02ef;
    L_0x02e7:
        r0 = z;
        r1 = 78;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x02ef:
        r0 = z;	 Catch:{ NullPointerException -> 0x037c }
        r1 = 54;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x037c }
        r0 = r2.contains(r0);	 Catch:{ NullPointerException -> 0x037c }
        if (r0 == 0) goto L_0x0303;
    L_0x02fb:
        r0 = z;
        r1 = 87;
        r0 = r0[r1];
        if (r5 == 0) goto L_0x0306;
    L_0x0303:
        r0 = "";
    L_0x0306:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 82;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        i = r0;
        goto L_0x0008;
    L_0x0324:
        r0 = move-exception;
        throw r0;
    L_0x0326:
        r0 = android.os.Build.MANUFACTURER;
        goto L_0x0012;
    L_0x032a:
        r0 = move-exception;
        throw r0;
    L_0x032c:
        r1 = android.os.Build.VERSION.RELEASE;
        goto L_0x0019;
    L_0x0330:
        r0 = move-exception;
        throw r0;
    L_0x0332:
        r2 = android.os.Build.DISPLAY;
        goto L_0x0020;
    L_0x0336:
        r0 = move-exception;
        throw r0;
    L_0x0338:
        r3 = android.os.Build.MODEL;
        goto L_0x0027;
    L_0x033c:
        r0 = move-exception;
        throw r0;
    L_0x033e:
        r0 = move-exception;
        throw r0;
    L_0x0340:
        r0 = move-exception;
        throw r0;
    L_0x0342:
        r0 = move-exception;
        throw r0;
    L_0x0344:
        r0 = move-exception;
        throw r0;
    L_0x0346:
        r0 = move-exception;
        throw r0;
    L_0x0348:
        r0 = move-exception;
        throw r0;
    L_0x034a:
        r0 = move-exception;
        throw r0;
    L_0x034c:
        r0 = move-exception;
        throw r0;
    L_0x034e:
        r0 = move-exception;
        throw r0;
    L_0x0350:
        r0 = move-exception;
        throw r0;
    L_0x0352:
        r0 = move-exception;
        throw r0;
    L_0x0354:
        r0 = move-exception;
        throw r0;
    L_0x0356:
        r0 = move-exception;
        throw r0;
    L_0x0358:
        r0 = move-exception;
        throw r0;
    L_0x035a:
        r0 = move-exception;
        throw r0;
    L_0x035c:
        r0 = move-exception;
        throw r0;
    L_0x035e:
        r0 = move-exception;
        throw r0;
    L_0x0360:
        r0 = move-exception;
        throw r0;
    L_0x0362:
        r0 = move-exception;
        throw r0;
    L_0x0364:
        r0 = move-exception;
        throw r0;
    L_0x0366:
        r0 = move-exception;
        throw r0;
    L_0x0368:
        r0 = move-exception;
        throw r0;
    L_0x036a:
        r0 = move-exception;
        throw r0;
    L_0x036c:
        r0 = move-exception;
        throw r0;
    L_0x036e:
        r0 = move-exception;
        throw r0;
    L_0x0370:
        r0 = move-exception;
        throw r0;
    L_0x0372:
        r0 = move-exception;
        throw r0;
    L_0x0374:
        r0 = move-exception;
        throw r0;
    L_0x0376:
        r0 = move-exception;
        throw r0;
    L_0x0378:
        r0 = move-exception;
        throw r0;
    L_0x037a:
        r0 = move-exception;
        throw r0;
    L_0x037c:
        r0 = move-exception;
        throw r0;
    L_0x037e:
        r0 = r4;
        goto L_0x0306;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ve.M():java.lang.String");
    }

    static boolean L() {
        int i = 0;
        boolean z = DialogToastActivity.f;
        try {
            if (d != null) {
                return d.booleanValue();
            }
            boolean z2;
            try {
                z2 = new File(z[169]).exists();
            } catch (Exception e) {
                z2 = false;
            }
            String[] strArr = a;
            int length = strArr.length;
            while (i < length) {
                try {
                    App.z().getPackageManager().getPackageInfo(strArr[i], 128);
                    z2 = true;
                } catch (NameNotFoundException e2) {
                }
                i++;
                if (z) {
                    break;
                }
            }
            d = Boolean.valueOf(z2);
            return d.booleanValue();
        } catch (Exception e3) {
            throw e3;
        }
    }

    public static String b(Context context) {
        boolean z = DialogToastActivity.f;
        Signature[] a = aq.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (a.length == 0) {
                return null;
            }
            try {
                MessageDigest instance = MessageDigest.getInstance(z[136]);
                instance.reset();
                int length = a.length;
                int i = 0;
                while (i < length) {
                    instance.update(a[i].toByteArray());
                    i++;
                    if (z) {
                        break;
                    }
                }
                return Base64.encodeToString(instance.digest(), 2);
            } catch (Throwable e) {
                Log.a(e);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            throw e2;
        } catch (NoSuchAlgorithmException e22) {
            throw e22;
        }
    }

    static {
        String[] strArr = new String[174];
        String str = "W?|\u0018\u001f_4";
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
                        i4 = 58;
                        break;
                    case at.g /*1*/:
                        i4 = 80;
                        break;
                    case at.i /*2*/:
                        i4 = 9;
                        break;
                    case at.o /*3*/:
                        i4 = 118;
                        break;
                    default:
                        i4 = arj.Theme_seekBarStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "[>m\u0004\u0004S4'\u0006\u000eH=`\u0005\u0018S?gX9\u007f\u0011M);r\u001fG34i\u0004H\".";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "Y?dX\u001cR1}\u0005\nJ V\u0006\u0019_6l\u0004\u000eT3l\u0005";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "_(}\u0013\u0019T1e)\u0006_4`\u00174I$h\u0002\u000e";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "I)g\u0015\u0019\u00155";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "I)g\u0015\u0019\u00159";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "I)g\u0015\u0019\u0015%g\u0017\tV5)\u0002\u0004\u001a'{\u001f\u001f_p";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "I)g\u0015\u0019\u00155)";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    str = "{\u0015ZY$|\u0012&8\u0004j1m\u0012\u0002T7";
                    i = 8;
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    strArr2 = strArr3;
                    str = "{\u0015ZY$|\u0012&8\u0004j1m\u0012\u0002T7";
                    i = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "O>h\u0014\u0007_p}\u0019KM\"`\u0002\u000e\u001a";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "J#";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "Y?dX\nT4{\u0019\u0002^~j\u0019\u0006W1g\u0012\u0018\u0014=f\u0018\u0000_)";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u0014`";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "[ yY\u000fV))";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "[ yY\bR5j\u001dDT?d\u0013\u001fR?mV";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "[ yY\u000fV))";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "N5z\u0002FQ5p\u0005";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u0014`";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u0015#p\u0005\u001f_=&\u0014\u0002T\u007fz\u0003";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u0015#p\u0005\u001f_=&\u0017\u001bJ\u007fZ\u0003\u001b_\"|\u0005\u000eH~h\u0006\u0000";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "\u0015#p\u0005\u001f_=&\u000e\tS>&\u0005\u001e";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "\u001a#`\f\u000e\u001a=`\u0005\u0006[$j\u001e";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "{\u0015ZY$|\u0012&8\u0004j1m\u0012\u0002T7";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "{\u0015ZY$|\u0012&8\u0004j1m\u0012\u0002T7";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "_(}\u0013\u0019T1e)\u0019Y\u000fj\u0019\u001bS5m)\u001fU\u000f`\u0018\u001f_\"g\u0017\u0007";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "Y?dX\u001cR1}\u0005\nJ V\u0006\u0019_6l\u0004\u000eT3l\u0005";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "X1j\u001d\u001eJ3`\u0006\u0003_\"&\u0012\t\u00157l\u0002DS?l\u0004\u0019U\")";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "X1j\u001d\u001eJ;l\u000fD^2&\u0011\u000eN h\u0004\nW#&\u0012\u0004_#$\u0018\u0004N}l\u000e\u0002I$";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "X1j\u001d\u001eJ3`\u0006\u0003_\"&\u0012\t\u00157l\u0002D_\"{\u0019\u0019\u001a";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "X1j\u001d\u001eJ3`\u0006\u0003_\"&\u0012\t\u00157l\u0002DS?l\u0004\u0019U\")";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "X1j\u001d\u001eJ3`\u0006\u0003_\"&\u0012\t\u00157l\u0002DS?l\u0004\u0019U\")";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "X1j\u001d\u001eJ3`\u0006\u0003_\"&\u0012\t\u00157l\u0002DS?l\u0004\u0019U\")";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "X1j\u001d\u001eJ3`\u0006\u0003_\"&\u001e\u000e[4l\u0004FW9z\u001b\nN3a";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "X1j\u001d\u001eJ3`\u0006\u0003_\"&\u0012\t\u00157l\u0002DS?l\u0004\u0019U\")";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "X1j\u001d\u001eJ3`\u0006\u0003_\"&\u0012\t\u00157l\u0002DY1gQ\u001f\u001a6`\u0018\u000f\u001a";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "i\u0018HG;h\u001eN";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "j\"f\u0010\u0002V5)&\u0002Y$|\u0004\u000eI";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "I)g\u0015\u0019\u0015 {\u0013\r\u0015#l\u0002D_\u007fl\u000e\u0002I$&\u0013\u0019H?{";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "_(}\u0013\u0019T1e)\u0019Y\u000fl\u000e\u0002I$z";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "I)g\u0015\u0019\u0015 {\u0013\r\u0015#l\u0002D_\u007fl\u000e\u0002I$";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "Y?dX\u001cR1}\u0005\nJ V\u0006\u0019_6l\u0004\u000eT3l\u0005";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "J'";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "j\u0012B2-\b\u0007`\u0002\u0003r=h\u00158r\u001187\u0005^hK??";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "I5}Y\u001eT1k\u001a\u000e\u001a$fV\u001cH9}\u0013K_";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "H\u007flY";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "[8\u007f\u0017\u0007S4`\u0002\u0012\u00155{\u0004\u0004H";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "U<m)\u001bM";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "Y?dX\fU?n\u001a\u000e";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "I)g\u0015\u0019\u0015 {\u0013\r\u0015#l\u0002";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "Y?dX\u001cR1}\u0005\nJ V\u0006\u0019_6l\u0004\u000eT3l\u0005";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "I)g\u0015\u0019\u0015 {\u0013\r\u0015#l\u0002D_\"{\u0019\u0019";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "_(}\u0013\u0019T1e)\u0019Y\u000fj\u0019\u001bS5m)\u001fU\u000f`\u0018\u001f_\"g\u0017\u0007";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "~1d\u001f\nT\u0017]9";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "M9e\u0012\u001bO*s\u001a\u000e";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "^5k\u0003\f";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "|%n\u0003&U4";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "|\"f\u000f\u0004j<|\u0005";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "^5k\u0003\u0018";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "v9}\u0013LT9g\u0011Kh?d";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "Y)h\u0018\u0004]5g";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "|\"f\u000f\u000fl9e\u001a\nS>";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "v5l2\u0019u9M";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "^5k\u0003\f";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "[3a\u0019\u001fP1g";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "Y\"`\u0005\u0000_<f\u0004\u0004W";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "{3a\u0019\u001fP1g";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "~1{\u001d\u0012";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "S$o\u0003\u0005@";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "\\\"l\u0013\u0013\u000b`";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "x9f\u0018\u0002B";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "^1{\u001d\u0012";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "\\?e\u001f\u0004W?m";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "L9e\u001a\nS>{\u0019\u0006";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "]9g\u0011\u000eH&`\u001a\u0007S1g";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "V?{\u0012\u0006U4";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "{>m\u0004\u0004\u0017\u0019M";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "H3d\u001f\u0013";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "j9e\u0019\u001fB\u0002f\u001b";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "\\\"f\u000f\u000fL9e\u001a\nS>";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "^5k\u0003\f";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = "[ yY\bO#}\u0019\u0006\u0017\"f\u001bK";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "^5k\u0003\f";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "w\u0019\\?";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "J9e\u0019\u001fB";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "\\\"f\u000f\u0004J<|\u0005";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "^1d\u001f\nT7}\u0019";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "s\u0004O#%`";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "J5{\u0015\u000eJ$`\u0019\u0005";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "^5k\u0003\f";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = "^5k\u0003\f";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = "^5k\u0003\f";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "v?{2\u0006U4G5?_1d";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "\\1b\u00138R=f\u0019";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "}9g\u0011\u000eH\u0002l\u0017\u0007";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = "w?M\u0017(U";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = "[>m\u0004\u0004\u00179m";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = "m9e\u0012;O*s\u001a\u000e";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = "l9e\u001a\nS>[9&";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = "W9|\u001f";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_buttonStyleSmall;
                    str = "l9e\u001a\nS>[9&";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkboxStyle;
                    str = "b\u0014H\u0018\u000fH?`\u0012";
                    i = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkedTextViewStyle;
                    str = "X9f\u0018\u0002B";
                    i = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_editTextStyle;
                    str = "W?m\u0017\bU";
                    i = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_radioButtonStyle;
                    str = "~5q\u0002\u000eHwzV-U<`\u0019&U4";
                    i = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_ratingBarStyle;
                    str = "B4h\u0018\u000fH?`\u0012";
                    i = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_seekBarStyle;
                    str = "^5k\u0003\f";
                    i = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_spinnerStyle;
                    str = "\\%n\u0003";
                    i = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_switchStyle;
                    str = "^5k\u0003\f";
                    i = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i2] = str;
                    i2 = 110;
                    str = "\u0017\u0002J;\"b";
                    i = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i2] = str;
                    i2 = 111;
                    str = "~5k\u0003\u0018h\u001fD";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    i2 = 112;
                    str = "y\"`\u0005\u0000_<f$$w";
                    i = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 113;
                    str = "|\"l\u00133\u000b`";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 114;
                    str = "]9g\u0011\u000eH\"l\u0017\u0007";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 115;
                    str = "^5k\u0003\f";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 116;
                    str = "j5{\u0015\u000eJ$`\u0019\u0005\u001a\u0012|\u001f\u0007^";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 117;
                    str = "\\1b\u0013\u0018R=f\u0019";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 118;
                    str = "H%{GR\b`";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 119;
                    str = "V5l\u0012\u0019U9m";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 120;
                    str = "Y)h\u0018\u0004]5g";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 121;
                    str = "}\u0019G1.h\u0006`\u001a\u0007[9g";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    i2 = 122;
                    str = "V9}\u0013\u0005S>n";
                    i = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i2] = str;
                    i2 = 123;
                    str = "h~\\X9\u0014a0D[";
                    i = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i2] = str;
                    i2 = 124;
                    str = "]5}Y\u0019\u0015#}\u0017\u001f_\u007fl\u0004\u0019U\")";
                    i = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i2] = str;
                    i2 = 125;
                    str = "H5j\u0019\u001d_\"pV\u001fU;l\u0018KR5h\u0012\u000eHpd\u001f\u0018W1}\u0015\u0003";
                    i = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i2] = str;
                    i2 = 126;
                    str = "]5}Y\u0019\u00155";
                    i = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i2] = str;
                    i2 = 127;
                    str = "O>h\u0014\u0007_p}\u0019KM\"`\u0002\u000e\u001a9";
                    i = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i2] = str;
                    i2 = 128;
                    str = "H5j\u0019\u001d_\"pV\u001fU;l\u0018KR5h\u0012\u000eHpd\u001f\u0018W1}\u0015\u0003";
                    i = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i2] = str;
                    i2 = 129;
                    str = "_(}\u0013\u0019T1e)\u0019Y\u000fl\u000e\u0002I$z";
                    i = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i2] = str;
                    i2 = 130;
                    str = "Y?dX\u001cR1}\u0005\nJ V\u0006\u0019_6l\u0004\u000eT3l\u0005";
                    i = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i2] = str;
                    i2 = 131;
                    str = "J1z\u0005\u001cU\"mV\u0003_1m\u0013\u0019\u001a=`\u0005\u0006[$j\u001e";
                    i = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i2] = str;
                    i2 = 132;
                    str = "\u001a#`\f\u000e\u001a=`\u0005\u0006[$j\u001e";
                    i = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i2] = str;
                    i2 = 133;
                    str = "X1j\u001d\u001eJ;l\u000fD]5}\u001f\u0005\\?&\u0012\u0004_#$\u0018\u0004N}l\u000e\u0002I$";
                    i = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i2] = str;
                    i2 = 134;
                    str = "Q5p";
                    i = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i2] = str;
                    i2 = 135;
                    str = "X1j\u001d\u001eJ;l\u000fDI5}Y\u001eT1k\u001a\u000e\u0017$f[\u001cH9}\u0013K";
                    i = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i2] = str;
                    i2 = 136;
                    str = "i\u0018H[Y\u000ff";
                    i = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i2] = str;
                    i2 = 137;
                    str = "]5}V\tC$lV\nH\"h\u000f";
                    i = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i2] = str;
                    i2 = 138;
                    str = "\u0014>f\u001b\u000e^9h";
                    i = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i2] = str;
                    i2 = 139;
                    str = "o\u0004O[S";
                    i = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i2] = str;
                    i2 = 140;
                    str = "w\u0014<";
                    i = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i2] = str;
                    i2 = 141;
                    str = "\u00154l\u0000DY?dX\f_>p\u001b\u0004N9f\u0018EI%y\u0013\u0019O#l\u0004E^1l\u001b\u0004T";
                    i = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i2] = str;
                    i2 = 142;
                    str = "Y?dX\f_>p\u001b\u0004N9f\u0018EI%y\u0013\u0019O#l\u0004";
                    i = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i2] = str;
                    i2 = 143;
                    str = "Y<h\u0005\u0018_#'\u0012\u000eB";
                    i = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i2] = str;
                    i2 = 144;
                    str = "T%e\u001a";
                    i = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i2] = str;
                    i2 = 145;
                    str = "[ yY\u0006^e&\u0014\u0012N5zY\u000eH\"f\u0004K";
                    i = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i2] = str;
                    i2 = 146;
                    str = "w\u0014<";
                    i = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i2] = str;
                    i2 = 147;
                    str = "o\u0004O[S";
                    i = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i2] = str;
                    i2 = 148;
                    str = "w\u0014<";
                    i = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i2] = str;
                    i2 = 149;
                    str = "I4b";
                    i = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i2] = str;
                    i2 = 150;
                    str = "[>m\u0004\u0004S4V\u001f\u000f";
                    i = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i2] = str;
                    i2 = 151;
                    str = "I4b";
                    i = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i2] = str;
                    i2 = 152;
                    str = "[>m\u0004\u0004S4V\u001f\u000f";
                    i = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i2] = str;
                    i2 = 153;
                    str = "I4b";
                    i = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i2] = str;
                    i2 = 154;
                    str = "_(}\u0013\u0019T1e)\u0006_4`\u00174I$h\u0002\u000e";
                    i = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i2] = str;
                    i2 = 155;
                    str = "Y?dX\u001cR1}\u0005\nJ V\u0006\u0019_6l\u0004\u000eT3l\u0005";
                    i = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i2] = str;
                    i2 = 156;
                    str = "I)g\u0015\u0019\u0015 {\u0013\r\u0015#l\u0002DI$h\u0002\u000e\u001a";
                    i = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i2] = str;
                    i2 = 157;
                    str = "I)g\u0015\u0019\u0015 {\u0013\r\u0015#l\u0002DI$h\u0002\u000e\u00155{\u0004\u0004H";
                    i = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i2] = str;
                    i2 = 158;
                    str = "H3";
                    i = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i2] = str;
                    i2 = 159;
                    str = "U\"nX\nY\"hX*y\u0002H";
                    i = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i2] = str;
                    i2 = 160;
                    str = "o\u0004O[S";
                    i = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i2] = str;
                    i2 = 161;
                    str = "Y1e\u0015\u001eV1}\u0013\nR1z\u001eD^9n\u0013\u0018N5{V";
                    i = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i2] = str;
                    i2 = 162;
                    str = "Y1e\u0015\u001eV1}\u0013\nR1z\u001eD_>j\u0019\u000fS>nY\u000eH\"f\u0004K";
                    i = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i2] = str;
                    i2 = 163;
                    str = "i\u0018H[Y\u000ff";
                    i = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i2] = str;
                    i2 = 164;
                    str = "Y1e\u0015\u001eV1}\u0013\nR1z\u001eD^9n\u0013\u0018N5{V\u0002Ipg\u0003\u0007V";
                    i = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i2] = str;
                    i2 = 165;
                    str = "{\u0015Z";
                    i = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i2] = str;
                    i2 = 166;
                    str = "i\u0018H[Y\u000ff";
                    i = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i2] = str;
                    i2 = 167;
                    str = "Q5p";
                    i = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i2] = str;
                    i2 = 168;
                    str = "\u0015#p\u0005\u001f_=&\u001a\u0002X\u007fe\u001f\tY\u000fd\u0017\u0007V?j)\u000f_2|\u00114K5d\u0003EI?";
                    i = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i2] = str;
                    i2 = 169;
                    str = "\u0015=g\u0002DI4j\u0017\u0019^\u007fk\u0005\u001f\\?e\u0012\u000eH\u007f@\u0018\u001bO$D\u0017\u001bJ5{Y\bU='\u0014\u0007O5z\u0002\nY;zX\nJ d\u0017\u0019N~j\u0010\f";
                    i = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i2] = str;
                    i2 = 170;
                    str = "Y?dX\fU?n\u001a\u000e";
                    i = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i2] = str;
                    i2 = 171;
                    str = "U2oY\u001bM\u007ff\u001a\u000f\u00158l\u0017\u000f_\"$\u001b\u0002I=h\u0002\bR";
                    i = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i2] = str;
                    i2 = 172;
                    str = "i\u0018HG;h\u001eN";
                    i = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i2] = str;
                    i2 = 173;
                    str = "{\u0015Z";
                    i = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[11];
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005EI5h\u0004\bR1y\u0006";
                    i = 173;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 173:
                    strArr2[i2] = str;
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005ER?d\u0013";
                    i = 174;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i2] = str;
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005EI5}\u0003\u001b";
                    i = 175;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i2] = str;
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005E[ y\u0010\u0002T4l\u0004";
                    i = 176;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005EI5}\u0002\u0002T7z";
                    i = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005EX#}\u0010\u0004V4l\u0004";
                    i = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005E[ y\u0005\u000eN$`\u0018\fI";
                    i = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005E[ y\u001b\nH$";
                    i = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005E[3j\u0013\u0007_\"f\u001b\u000eN5{\u0003\u0002";
                    i = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i2] = str;
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005Ex#}5\u0004W=h\u0018\u000fj\"f\u0015\u000eI#f\u0004";
                    i = 182;
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "Y?dX\tV%l\u0005\u001f[3b\u0005EIby";
                    i = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i2] = str;
                    a = strArr3;
                    j = new byte[]{(byte) 0, (byte) 1};
                    m = new byte[]{(byte) 0, (byte) 2};
                    c = new byte[]{(byte) 0, (byte) 1};
                    l = new byte[]{(byte) 0, (byte) 2};
                    k = new byte[]{(byte) 0, (byte) 1};
                    h = null;
                    i = null;
                    f = 0;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\n`9F[\n`9F";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static aae b(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        IOException iOException;
        aae com_whatsapp_aae = null;
        try {
            if (file.exists()) {
                FileInputStream fileInputStream2;
                try {
                    fileInputStream2 = new FileInputStream(file);
                    try {
                        com_whatsapp_aae = a((InputStream) fileInputStream2);
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e) {
                                Log.e(z[32] + e.toString());
                            }
                        }
                    } catch (te e2) {
                        try {
                            Log.w(z[34]);
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (Exception e3) {
                                    Log.e(z[33] + e3.toString());
                                }
                            }
                            return com_whatsapp_aae;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (Exception e32) {
                                    Log.e(z[35] + e32.toString());
                                }
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e4) {
                        Log.e(z[36] + file.getAbsolutePath());
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e322) {
                                Log.e(z[28] + e322.toString());
                            }
                        }
                        return com_whatsapp_aae;
                    } catch (IOException e5) {
                        IOException iOException2 = e5;
                        fileInputStream = fileInputStream2;
                        iOException = iOException2;
                        try {
                            Log.e(z[30] + iOException.toString());
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e3222) {
                                    Log.e(z[31] + e3222.toString());
                                }
                            }
                            return com_whatsapp_aae;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            throw th;
                        }
                    }
                } catch (te e6) {
                    fileInputStream2 = com_whatsapp_aae;
                    Log.w(z[34]);
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    return com_whatsapp_aae;
                } catch (FileNotFoundException e7) {
                    fileInputStream2 = com_whatsapp_aae;
                    Log.e(z[36] + file.getAbsolutePath());
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    return com_whatsapp_aae;
                } catch (IOException e8) {
                    iOException = e8;
                    fileInputStream = com_whatsapp_aae;
                    Log.e(z[30] + iOException.toString());
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return com_whatsapp_aae;
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    fileInputStream2 = com_whatsapp_aae;
                    th = th5;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    throw th;
                }
            }
            Log.w(z[29]);
            return com_whatsapp_aae;
        } catch (Exception e9) {
            throw e9;
        }
    }

    public static String b(byte[] bArr) {
        boolean z = DialogToastActivity.f;
        StringBuilder stringBuilder = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            stringBuilder.append(Character.forDigit((b >>> 4) & 15, 16));
            stringBuilder.append(Character.forDigit(b & 15, 16));
            i++;
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    public static ask f() {
        File z = z();
        try {
            if (z.exists()) {
                Object a = a(z);
                if (a == null) {
                    return null;
                }
                try {
                    if (a.length < (((((k.length + 1) + 32) + 16) + 32) + 16) + 32) {
                        throw new InvalidParameterException(z.toString() + z[132]);
                    }
                    Object obj = new byte[k.length];
                    System.arraycopy(a, 0, obj, 0, k.length);
                    int length = k.length + 0;
                    try {
                        if (Arrays.equals(obj, k)) {
                            int i = length + 1;
                            String valueOf = String.valueOf(a[length]);
                            Object obj2 = new byte[32];
                            System.arraycopy(a, i, obj2, 0, 32);
                            length = i + 32;
                            Object obj3 = new byte[16];
                            System.arraycopy(a, length, obj3, 0, 16);
                            length += 16;
                            Object obj4 = new byte[32];
                            System.arraycopy(a, length, obj4, 0, 32);
                            length += 32;
                            byte[] D = D();
                            Object obj5 = new byte[32];
                            System.arraycopy(a, length + 16, obj5, 0, 32);
                            return new ask(obj, valueOf, obj2, obj3, obj4, D, obj5);
                        }
                        throw new te(null);
                    } catch (NullPointerException e) {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            Log.w(z[133]);
            return null;
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    public static byte[] a(String str) {
        try {
            return a(s(), azx.i + str, j);
        } catch (te e) {
            Log.w(z[171]);
            return null;
        }
    }

    private static File i() {
        return new File(J(), z[138]);
    }

    public static byte[] a(Context context) {
        byte[] digest;
        boolean z = DialogToastActivity.f;
        Closeable closeable = null;
        try {
            ZipFile zipFile = new ZipFile(new ContextWrapper(context).getPackageCodePath());
            closeable = zipFile.getInputStream(zipFile.getEntry(z[143]));
            MessageDigest instance = MessageDigest.getInstance(z[146]);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = closeable.read(bArr);
                if (read <= 0) {
                    break;
                }
                instance.update(bArr, 0, read);
                if (z) {
                    break;
                }
            }
            digest = instance.digest();
        } catch (Exception e) {
            digest = z[145] + e.toString();
            Log.e(digest);
            try {
                digest = z[144].getBytes(z[147]);
                return digest;
            } catch (Throwable e2) {
                throw new Error(e2);
            }
        } finally {
            ao.a(closeable);
        }
        return digest;
    }

    public static byte[] c(byte[] bArr) {
        byte[] digest;
        byte[] bArr2 = null;
        boolean z = DialogToastActivity.f;
        try {
            digest = MessageDigest.getInstance(z[140]).digest(r().getBytes(z[139]));
        } catch (NoSuchAlgorithmException e) {
            digest = bArr2;
        } catch (UnsupportedEncodingException e2) {
            digest = bArr2;
        }
        if (digest != null) {
            try {
                if (digest.length > 0) {
                    int i = 0;
                    while (i < bArr.length) {
                        bArr[i] = (byte) (bArr[i] ^ digest[i % digest.length]);
                        i++;
                        if (z) {
                            break;
                        }
                    }
                }
            } catch (NoSuchAlgorithmException e3) {
                throw e3;
            }
        }
        return bArr;
    }

    public static String f(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(z[148]);
            instance.update(str.getBytes());
            return b(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static boolean d(String str) {
        File k = k();
        try {
            if (!k.exists()) {
                return false;
            }
            if (k.length() > 0 && g(str) != null) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static boolean B() {
        boolean z = true;
        try {
            if (g != null) {
                return g.booleanValue();
            }
            boolean z2 = false;
            try {
                if (new File(z[141]).exists()) {
                    z2 = true;
                }
            } catch (Exception e) {
            }
            try {
                App.z().getPackageManager().getPackageInfo(z[142], 128);
            } catch (NameNotFoundException e2) {
                z = z2;
            }
            g = Boolean.valueOf(z);
            return g.booleanValue();
        } catch (Exception e3) {
            throw e3;
        }
    }

    static boolean C() {
        try {
            return M().length() != 0;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static boolean p() {
        Object obj = Build.PRODUCT;
        try {
            if (TextUtils.isEmpty(obj)) {
                return true;
            }
            try {
                if (obj.toLowerCase(Locale.US).contains(z[151])) {
                    return true;
                }
                obj = Build.MODEL;
                try {
                    if (TextUtils.isEmpty(obj)) {
                        return true;
                    }
                    try {
                        if (obj.toLowerCase(Locale.US).contains(z[153])) {
                            return true;
                        }
                        obj = Build.MANUFACTURER;
                        try {
                            if (TextUtils.isEmpty(obj)) {
                                return true;
                            }
                            try {
                                if (obj.toLowerCase(Locale.US).contains(z[149])) {
                                    return true;
                                }
                                try {
                                    if (App.at == null) {
                                        return true;
                                    }
                                    try {
                                        if (z[150] == null) {
                                            return true;
                                        }
                                        try {
                                            try {
                                                if (TextUtils.isEmpty(Secure.getString(App.at, z[152]))) {
                                                    return true;
                                                }
                                                try {
                                                    if (App.W != null) {
                                                        return false;
                                                    }
                                                    return true;
                                                } catch (NullPointerException e) {
                                                    throw e;
                                                }
                                            } catch (NullPointerException e2) {
                                                throw e2;
                                            }
                                        } catch (NullPointerException e3) {
                                            return true;
                                        }
                                    } catch (NullPointerException e22) {
                                        throw e22;
                                    }
                                } catch (NullPointerException e222) {
                                    throw e222;
                                }
                            } catch (NullPointerException e2222) {
                                throw e2222;
                            }
                        } catch (NullPointerException e22222) {
                            throw e22222;
                        }
                    } catch (NullPointerException e222222) {
                        throw e222222;
                    }
                } catch (NullPointerException e2222222) {
                    throw e2222222;
                }
            } catch (NullPointerException e22222222) {
                throw e22222222;
            }
        } catch (NullPointerException e222222222) {
            throw e222222222;
        }
    }

    private static String r() {
        try {
            if (h == null) {
                h = g();
            }
            return h;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private static String g() {
        return b(true);
    }

    private static String b(boolean z) {
        boolean z2 = DialogToastActivity.f;
        AccountManager accountManager = AccountManager.get(App.z().getApplicationContext());
        if (accountManager != null) {
            Account[] accountsByType = accountManager.getAccountsByType(z[170]);
            if (accountsByType != null) {
                int length = accountsByType.length;
                int i = 0;
                while (i < length) {
                    Account account = accountsByType[i];
                    try {
                        if (account.name == null) {
                            i++;
                            if (z2) {
                                break;
                            }
                        } else if (z) {
                            return account.name;
                        } else {
                            i = account.name.indexOf(64);
                            return i > 0 ? account.name.substring(0, i) : account.name;
                        }
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                }
            }
        }
        return "";
    }

    private static byte[] a(File file, String str, byte[] bArr) {
        byte[] bArr2 = null;
        Object a = a(file);
        if (a != null) {
            try {
                if (a.length < ((bArr.length + 4) + 16) + 20) {
                    throw new InvalidParameterException(file.toString() + z[23]);
                }
                Object obj = new byte[bArr.length];
                System.arraycopy(a, 0, obj, 0, bArr.length);
                int length = bArr.length + 0;
                if (Arrays.equals(obj, bArr)) {
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(a, length, bArr3, 0, 4);
                    length += 4;
                    Object obj2 = new byte[16];
                    System.arraycopy(a, length, obj2, 0, 16);
                    length += 16;
                    Key secretKeySpec = new SecretKeySpec(a(str, bArr3), z[25]);
                    Cipher instance = Cipher.getInstance(z[24]);
                    instance.init(2, secretKeySpec, new IvParameterSpec(obj2));
                    bArr2 = instance.doFinal(a, length, a.length - length);
                } else {
                    throw new te(null);
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable e3) {
                try {
                    file.delete();
                    if (e3 instanceof te) {
                        throw ((te) e3);
                    }
                    throw new RuntimeException(e3);
                } catch (Exception e22) {
                    throw e22;
                }
            }
        }
        return bArr2;
    }

    public static int u() {
        boolean z = DialogToastActivity.f;
        try {
            if (f != 0) {
                return f;
            }
            try {
                Enumeration entries = new DexFile(App.z().getApplicationInfo().sourceDir).entries();
                while (entries.hasMoreElements()) {
                    entries.nextElement();
                    f++;
                    if (z) {
                        break;
                    }
                }
            } catch (Throwable e) {
                Log.a(e);
            }
            return f;
        } catch (IOException e2) {
            throw e2;
        }
    }

    public static boolean N() {
        return k().exists();
    }

    public static boolean m() {
        return App.z().getSharedPreferences(z[27], 0).getBoolean(z[26], false);
    }

    private static byte[] a(String str, byte[] bArr) {
        return new SecretKeySpec(a(str.getBytes(), bArr, 16, 128).getEncoded(), z[165]).getEncoded();
    }

    private static void A() {
        Log.i(z[50]);
        Editor edit = App.z().getSharedPreferences(z[51], 0).edit();
        try {
            edit.putBoolean(z[53], true);
            if (!edit.commit()) {
                Log.w(z[52]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, boolean z) {
        MessageDigest instance;
        UnsupportedEncodingException unsupportedEncodingException;
        Object obj = null;
        try {
            instance = MessageDigest.getInstance(z[163]);
        } catch (NoSuchAlgorithmException e) {
            Log.e(z[161] + e.toString());
            instance = null;
        }
        if (instance == null) {
            try {
                Log.e(z[164]);
                return null;
            } catch (NoSuchAlgorithmException e2) {
                throw e2;
            }
        }
        Object bytes;
        int length;
        Object obj2;
        String str = "";
        if (z) {
            str = b(Arrays.equals(bArr2, c));
        }
        if (str != null) {
            try {
                bytes = str.getBytes(z[160]);
                try {
                    length = bytes.length;
                } catch (UnsupportedEncodingException e3) {
                    UnsupportedEncodingException unsupportedEncodingException2 = e3;
                    obj = bytes;
                    unsupportedEncodingException = unsupportedEncodingException2;
                    Log.e(z[162] + unsupportedEncodingException.toString());
                    bytes = obj;
                    length = 0;
                    obj2 = new byte[(bArr.length + length)];
                    if (length > 0) {
                        length = 0;
                    } else {
                        System.arraycopy(bytes, 0, obj2, 0, bytes.length);
                        length += 0;
                    }
                    System.arraycopy(bArr, 0, obj2, length, bArr.length);
                    instance.reset();
                    instance.update(obj2);
                    return instance.digest();
                }
            } catch (UnsupportedEncodingException e4) {
                unsupportedEncodingException = e4;
                Log.e(z[162] + unsupportedEncodingException.toString());
                bytes = obj;
                length = 0;
                obj2 = new byte[(bArr.length + length)];
                if (length > 0) {
                    System.arraycopy(bytes, 0, obj2, 0, bytes.length);
                    length += 0;
                } else {
                    length = 0;
                }
                System.arraycopy(bArr, 0, obj2, length, bArr.length);
                instance.reset();
                instance.update(obj2);
                return instance.digest();
            }
        }
        bytes = null;
        length = 0;
        obj2 = new byte[(bArr.length + length)];
        if (length > 0) {
            System.arraycopy(bytes, 0, obj2, 0, bytes.length);
            length += 0;
        } else {
            length = 0;
        }
        System.arraycopy(bArr, 0, obj2, length, bArr.length);
        instance.reset();
        instance.update(obj2);
        return instance.digest();
    }
}
