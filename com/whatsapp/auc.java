package com.whatsapp;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.ao;
import com.whatsapp.util.bq;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class auc {
    private static String a;
    private static String b;
    private static String c;
    private static volatile boolean d;
    private static String e;
    private static final String[] z;

    private static void a(String str, File file) {
        Closeable content;
        Object e;
        Throwable th;
        Closeable closeable = null;
        boolean z = DialogToastActivity.f;
        try {
            byte[] bArr = new byte[4096];
            HttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
            HttpProtocolParams.setUserAgent(basicHttpParams, vn.a());
            content = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str)).getEntity().getContent();
            try {
                Closeable fileOutputStream = new FileOutputStream(file);
                do {
                    try {
                        int read = content.read(bArr, 0, bArr.length);
                        if (read < 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException e2) {
                        e = e2;
                        closeable = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = fileOutputStream;
                    }
                } while (!z);
                fileOutputStream.flush();
                ao.a(fileOutputStream);
                ao.a(content);
            } catch (IOException e3) {
                e = e3;
                try {
                    Log.e(z[20] + e);
                    ao.a(closeable);
                    ao.a(content);
                } catch (Throwable th3) {
                    th = th3;
                    ao.a(closeable);
                    ao.a(content);
                    throw th;
                }
            }
        } catch (IOException e4) {
            e = e4;
            content = null;
            Log.e(z[20] + e);
            ao.a(closeable);
            ao.a(content);
        } catch (Throwable th4) {
            th = th4;
            content = null;
            ao.a(closeable);
            ao.a(content);
            throw th;
        }
    }

    static {
        String[] strArr = new String[28];
        String str = "L?b=4\u0001g),!I|&;0\u0007y$h'\t`$,*Aah,!\np<-d\u000f{;<%\nyi";
        boolean z = true;
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
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 68;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "1})<7'e8f \tb&$+\u0007q";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "1})<7'e8f%\u0016~";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "L?b=4\u0001g),!Iq'?*\nz),k\u0002z?&(\tt,h'\t`$,*Aah,!\np<-d\u0002z?&(\tt,i";
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "L?b=4\u0001g),!I|&;0\u0007y$h'\t`$,*Aah,!\np<-d\u0002z?&(\tt,i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "L?b=4\u0001g),!Iq'?*\nz),d\u0005z=$ \b2<h6\u0003{)%!Fq'?*\nz),e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "1})<7'e8f1\u0016r:) \u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "L?b=4\u0001g),!Iq'?*\nz),k\u0002z?&(\tt,h'\t`$,*Aah:!\bt%-d\u0002z?&(\tt,i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "1})<7'e8f%\u0016~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u000ea<87\\:g?3\u0011;? %\u0012f)84Hv'%k\u0007{,:+\u000fqg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "1})<7'e8f,\u0012x$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "1})<7'e8f'\rf=%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0013e/:%\u0002pg;+\u0013g+-d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "1})<7'e8f2\u0003g;!+\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u000ea<87\\:g?3\u0011;? %\u0012f)84Hv'%k\u0007{,:+\u000fqg+1\u0014g-&0IB )0\u0015T88j\u0007e#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u000bt:#!\u0012/gg \u0003a)!(\u0015*!,y\u0005z%f3\u000et<;%\u0016e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0007x2&~I:)84\u0015:)& \u0014z!,{\u0016(+')Hb )0\u0015t88";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "1})<7'e8f%\u0016~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "1})<7'e8f1\u0016r:) \u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0013e/:%\u0002pg,+\u0011{$'%\u00028.!(\u00035";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    str = "1})<7'e8f1\u0016r:) \u0003";
                    z = true;
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    strArr2 = strArr3;
                    str = "\u0013e/:%\u0002pg;!\ba!&!\n:.)-\n";
                    z = true;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "1})<7'e8f \tb&$+\u0007q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "1})<7'e8f1\u0016r:) \u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "1})<7'e8f%\u0016~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0005z%f3\u000et<;%\u0016e\u001786\u0003s-:!\bv-;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\nt;<\u001b\u0013e/:%\u0002p\u0017+,\u0003v#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    z = strArr3;
                    d = false;
                    return;
                default:
                    strArr2[i] = str;
                    str = "L?b=4\u0001g),!Iq'?*\nz),d\u0005z=$ \b2<h \u0003y-<!Fq'?*\nz),e";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public static void h() {
        boolean z = true;
        File file = App.a3;
        File file2 = new File(file, z[23]);
        try {
            if (file2.exists()) {
                boolean z2;
                if (file2.delete()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Log.b(z2);
            }
            try {
                if (!new File(file, z[24]).exists()) {
                    file2 = new File(file, z[25]);
                    try {
                        if (file2.exists()) {
                            if (!file2.delete()) {
                                z = false;
                            }
                            Log.b(z);
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    public static void a(Context context, String str) {
        try {
            if (d) {
                try {
                    if (a()) {
                        try {
                            if (context.getSharedPreferences(z[26], 0).getLong(z[27], 0) + 21600000 <= System.currentTimeMillis()) {
                                bq.a(new hd(str, context));
                            }
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    static void j() {
        b();
    }

    public static void f() {
        try {
            new File(App.a3, z[21]).createNewFile();
        } catch (IOException e) {
            Log.e(z[22]);
        }
    }

    private static String a(String str) {
        String stringBuilder;
        Throwable th;
        boolean z = DialogToastActivity.f;
        InputStream content;
        try {
            HttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
            HttpProtocolParams.setUserAgent(basicHttpParams, vn.a());
            content = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str)).getEntity().getContent();
            try {
                StringBuilder stringBuilder2 = new StringBuilder();
                do {
                    int read = content.read();
                    if (read < 0) {
                        break;
                    }
                    stringBuilder2.append((char) read);
                } while (!z);
                content.close();
                stringBuilder = stringBuilder2.toString();
                if (content != null) {
                    try {
                        content.close();
                    } catch (NumberFormatException e) {
                        throw e;
                    } catch (IOException e2) {
                    }
                }
            } catch (IOException e3) {
                try {
                    stringBuilder = "";
                    if (content != null) {
                        try {
                            content.close();
                        } catch (NumberFormatException e4) {
                            throw e4;
                        } catch (IOException e5) {
                        }
                    }
                    return stringBuilder;
                } catch (Throwable th2) {
                    th = th2;
                    if (content != null) {
                        try {
                            content.close();
                        } catch (NumberFormatException e42) {
                            throw e42;
                        } catch (IOException e6) {
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e7) {
            content = null;
            stringBuilder = "";
            if (content != null) {
                content.close();
            }
            return stringBuilder;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            content = null;
            th = th4;
            if (content != null) {
                content.close();
            }
            throw th;
        }
        return stringBuilder;
    }

    private static void b() {
        File file = App.a3;
        File file2 = new File(file, z[2]);
        File file3 = new File(file, z[3]);
        File file4 = new File(file, z[7]);
        long k = k();
        if (file3.exists()) {
            if (k == a(file3)) {
                try {
                    if (file2.exists()) {
                        if (!file2.delete()) {
                            Log.w(z[5]);
                        }
                    }
                    f();
                    return;
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            try {
                if (!file3.delete()) {
                    Log.w(z[0]);
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
        if (file2.exists()) {
            if (k == a(file2)) {
                try {
                    if (!file2.renameTo(file3)) {
                        Log.w(z[6]);
                    }
                    f();
                    return;
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            }
            try {
                if (!file2.delete()) {
                    Log.w(z[1]);
                }
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        }
        try {
            if (a()) {
                a(a, file2);
                if (!file2.exists()) {
                    return;
                }
                if (k == a(file2)) {
                    try {
                        if (!file2.renameTo(file3)) {
                            Log.w(z[8]);
                        }
                        f();
                        return;
                    } catch (NumberFormatException e22222) {
                        throw e22222;
                    }
                }
                try {
                    if (!file2.delete()) {
                        Log.w(z[4]);
                    }
                } catch (NumberFormatException e222222) {
                    throw e222222;
                }
            }
        } catch (NumberFormatException e2222222) {
            throw e2222222;
        }
    }

    private static String i() {
        return a(e).trim();
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        try {
            if (str.length() < 1) {
                return false;
            }
            try {
                if (d) {
                    return true;
                }
                String str2 = z[10] + str.substring(str.length() - 1) + "/";
                Log.i(z[13] + str2);
                a = str2 + z[9];
                b = str2 + z[12];
                e = str2 + z[14];
                c = str2 + z[11];
                d = true;
                return true;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static Uri e() {
        File file = App.a3;
        File file2 = new File(file, z[18]);
        try {
            if (new File(file, z[19]).delete()) {
                if (file2.exists()) {
                    return Uri.fromFile(file2);
                }
            }
            return null;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static String c() {
        return i();
    }

    private static long a(File file) {
        FileInputStream fileInputStream;
        Throwable e;
        long value;
        boolean z = DialogToastActivity.f;
        try {
            byte[] bArr = new byte[4096];
            CRC32 crc32 = new CRC32();
            fileInputStream = new FileInputStream(file);
            do {
                try {
                    int read = fileInputStream.read(bArr, 0, bArr.length);
                    if (read < 0) {
                        break;
                    }
                    crc32.update(bArr, 0, read);
                } catch (IOException e2) {
                    e = e2;
                }
            } while (!z);
            value = crc32.getValue();
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (NumberFormatException e3) {
                    throw e3;
                } catch (IOException e4) {
                }
            }
        } catch (IOException e5) {
            e = e5;
            fileInputStream = null;
            try {
                Log.a(e);
                value = 0;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (NumberFormatException e32) {
                        throw e32;
                    } catch (IOException e6) {
                    }
                }
                return value;
            } catch (Throwable th) {
                e = th;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (NumberFormatException e7) {
                        throw e7;
                    } catch (IOException e8) {
                    }
                }
                throw e;
            }
        } catch (Throwable th2) {
            e = th2;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw e;
        }
        return value;
    }

    private static long k() {
        String trim = a(b).trim();
        try {
            return Long.parseLong(trim);
        } catch (Throwable e) {
            Log.b(trim, e);
            return -1;
        }
    }

    public static Uri g() {
        try {
            if (App.j != 1) {
                try {
                    return App.a2() ? Uri.parse(z[17]) : Uri.parse(z[16]);
                } catch (NumberFormatException e) {
                    throw e;
                }
            } else if (a != null) {
                return Uri.parse(a);
            } else {
                return Uri.parse(z[15]);
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static Uri d() {
        try {
            if (d) {
                return Uri.parse(c);
            }
            return null;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean a() {
        int az = App.az();
        if (az == 1) {
            return true;
        }
        try {
            if ((App.c(az) & 4) != 0) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
