package com.whatsapp.fieldstats;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Random;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class i {
    private static volatile boolean a;
    private static final EnumMap b;
    private static final Random c;
    private static final EnumMap d;
    private static final Handler e;
    private static final HandlerThread f;
    private static volatile OutputStream g;
    private static volatile long h;
    private static final byte[] i;
    private static final String[] z;

    static {
        String[] strArr = new String[50];
        String str = "\u0019\u0010,y:\u001a\u0002qa4\t_o";
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
                        i4 = 110;
                        break;
                    case at.g /*1*/:
                        i4 = 113;
                        break;
                    case at.i /*2*/:
                        i4 = 95;
                        break;
                    case at.o /*3*/:
                        i4 = 13;
                        break;
                    default:
                        i4 = 91;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0019\u0010,y:\u001a\u0002qy2\u0003\u0014,y:\u0003\u0001";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "\u0007^0->\u001c\u00030\u007f{\u0019\u00196a>N\u0006-d/\u0007\u001f8-+\u000b\u001f;d5\tQ,y:\u001a\u0002\u007fa:\u001d\u0005\u007f\u007f4\u001a\u0010+h{\u001a\u00182h{\b\u00183h";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "\u0019\u0010,y:\u001a\u0002qa4\t";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u001b\u001f>o7\u000bQ+b{\u001c\u00141l6\u000bQ,y:\u001a\u0002\u007fk2\u0002\u0014\u007f%";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0019\u0010,y:\u001a\u0002qa4\t_o";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "GQ+b{\u001a\u0019:-+\u000b\u001f;d5\tQ*}7\u0001\u0010;-(\u001a\u0010+~{\b\u00183h{F";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    str = "\u001b\u001f>o7\u000bQ+b{\n\u00143h/\u000bQ/h5\n\u00181j{\u001b\u00013b:\nQ,y:\u001a\u0002\u007fk2\u0002\u0014\u007f%";
                    i = 7;
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    strArr2 = strArr3;
                    str = "\u0019\u0010,y:\u001a\u0002qa4\t";
                    i = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\r\u0010<e>\nQ;d6\u000b\u001f,d4\u0000\u0002\u007fk2\u0002\u0014\u007fz:\u001dQ(\u007f2\u001a\u0005:c`N\u00156`>\u0000\u00026b5*\u001e*o7\u000b<>}u\u001d\u0018%hsGL";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "UQ;d6\u000b\u001f,d4\u0000\"+\u007f2\u0000\u0016\u0012l+@\u00026w>FXb";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u001b\u001f>o7\u000bQ+b{\u001b\u0001;l/\u000bQ<l8\u0006\u0014;-?\u0007\u001c:c(\u0007\u001e1~{\b\u00183h";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    str = "\r\u001e1k2\u001c\u001c>y2\u0001\u001f\u007fb=N\u0012>n3\u000b\u0015\u007fi2\u0003\u00141~2\u0001\u001f,-=\u0007\u001d:-=\u000f\u00183h?UQ;d6\u000b\u001f,d4\u000050x9\u0002\u0014\u0012l+@\u00026w>FXb";
                    i = 12;
                    i2 = 13;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    strArr2 = strArr3;
                    str = "\u001c\u0014>i{\n\u00182h5\u001d\u00180c(N\u0015*`+TQ;~f";
                    i = 13;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "UQ;~u\u001d\u0018%hsGL";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\b\u00043a{\r\u0010<e>\nQ;d6\u000b\u001f,d4\u0000\u0002\u007fi.\u0003\u0001e-?\u0007\u001c:c(\u0007\u001e1^/\u001c\u00181j\u0016\u000f\u0001b";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\r\u001e2#,\u0006\u0010+~:\u001e\u0001";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\u0019\u0010,y:\u001a\u0002qi2\u0003\u0002";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\b\u00043a{\r\u0010<e>\nQ;d6\u000b\u001f,d4\u0000\u0002\u007fi.\u0003\u0001e-?\u0007\u001c:c(\u0007\u001e1I4\u001b\u00133h\u0016\u000f\u0001b";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u001c\u0014>i{\n\u00182h5\u001d\u00180c(N\u0015*`+TQ;if";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "-\u001d>~( \u001e+K4\u001b\u001f;H#\r\u0014/y2\u0001\u001fe-";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "UQ;iu\u001d\u0018%hsGL";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "UQ;d6\u000b\u001f,d4\u0000\"+\u007f2\u0000\u0016\u0012l+@\u00026w>FXb";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\r\u001e2#,\u0006\u0010+~:\u001e\u0001qA\u0014).\u001c_\u0012:8\u001cL\u001714\tH\u0015:";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\n\u00182h5\u001d\u00180c(N\u0012>n3\u000bQ)h)\u0007\u00176n:\u001a\u00180c{\b\u00106a>\n";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "\r\u00036y2\r\u00103H-\u000b\u001f+";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\u0019\u0010,y:\u001a\u0002qy2\u0003\u0014,y:\u0003\u0001";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "'>\u001au8\u000b\u0001+d4\u0000Q;x)\u0007\u001f8-)\u000b\u0010;-=\u001c\u001e2-+\u000b\u001f;d5\tQ,y:\u001a\u0002\u007fa:\u001d\u0005\u007f\u007f4\u001a\u0010+h{\u001a\u00182h{\b\u00183h";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "N\u0014'd(\u001a\u0002\u007fo.\u001aQ6~{\u0000\u001e+-)\u000b\u0010;l9\u0002\u0014";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\u0019\u0010,y:\u001a\u0002qi2\u0003\u0002";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "\u001b\u0001;l/\u0007\u001f8-8\u000f\u00127h?N\u00156`>\u0000\u00026b5\u001dQ9\u007f4\u0003Q9d7\u000b";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "UQ;d6\u000b\u001f,d4\u0000\"+\u007f2\u0000\u0016\u0012l+@\u00026w>FXb";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "\u001b\u001f>o7\u000bQ+b{\u001c\u0014>i{\r\u0010<e>\nQ;d6\u000b\u001f,d4\u0000\u0002\u007fk2\u0002\u0014";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\r\u0010<e>\nQ;d6\u000b\u001f,d4\u0000\u0002\u007f\u007f>\u000f\u0015d-?\u0007\u001c:c(\u0007\u001e1I4\u001b\u00133h\u0016\u000f\u0001q~2\u0014\u0014w$f";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\u0019\u0010,y:\u001a\u0002qa4\t_o";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "\u0019\u0010,y:\u001a\u0002qi2\u0003\u0002";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\u001b\u001f>o7\u000bQ+b{\r\u0003:l/\u000bQ,y:\u001a\u0002\u007fk2\u0002\u0014";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "\u001b\u001f>o7\u000bQ+b{\u0019\u00036y>N\u00050-(\u001a\u0010+~{\b\u00183h";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "\u001b\u001f>o7\u000bQ+b{\u0001\u0001:c{\u001d\u0005>y(N\u00176a>";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "\u0019\u0010,y:\u001a\u0002qi2\u0003\u0002";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\u0019\u0010,y:\u001a\u0002qa4\t";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "\r\u0004-\u007f>\u0000\u0005\u007f~\"\u001d\u0005:`{\u001a\u00182h{\u0007\u0002\u007fd7\u0002\u00148l7TQ";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "\u0019\u0010,y:\u001a\u0002qa4\t";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "\u0019\u0010,y:\u001a\u0002qa4\t_o";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "\u001e\u00141i2\u0000\u0016\u007f~/\u000f\u0005,-.\u001e\u001d0l?N\u001e=a2\u001a\u0014-l/\u000b\u0015\u007fi.\u000bQ+b{\u000b\t<h(\u001d\u0018)h{\u001d\u0018%h";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "\u0007\u001e\u007fh)\u001c\u001e--9\u0002\u001e<f>\nQ,y:\u001a\u0002\u007f\u007f4\u001a\u0010+d4\u0000";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "\u001e\u00141i2\u0000\u0016\u007f~/\u000f\u0005,-.\u001e\u001d0l?N\u00133b8\u0005\u0014;-(\u001a\u0010+~{\u001c\u001e+l/\u0007\u001e1";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "\u0019\u0010,y:\u001a\u0002qa4\t_o";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "=\u0005>y(";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    c = new Random();
                    f = new HandlerThread(z[49]);
                    f.start();
                    e = new Handler(f.getLooper(), new as());
                    i = new byte[]{(byte) 87, (byte) 65, (byte) 83, (byte) 84, (byte) 65, (byte) 84, (byte) 83, (byte) 1};
                    d = new EnumMap(bn.class);
                    b = new EnumMap(bn.class);
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001b\u001f>o7\u000bQ+b{\u0001\u0001:c{\u001e\u00141i2\u0000\u0016\u007f~/\u000f\u0005,-7\u000f\u0002+-)\u0001\u0005>y>N\u00056`>N\u00176a>N\u00170\u007f{\u0019\u00036y2\u0000\u0016";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static void a(Context context, bn bnVar) {
        e(context);
        a(context, bnVar, (Double) null);
    }

    private static void a(long j, OutputStream outputStream) {
        outputStream.write(i);
        int i = (int) (j / 1000);
        outputStream.write((byte) i);
        outputStream.write((byte) (i >> 8));
        outputStream.write((byte) (i >> 16));
        outputStream.write((byte) (i >> 24));
        outputStream.flush();
    }

    private static double a(Integer num) {
        return num == null ? Double.NaN : num.doubleValue();
    }

    public static void a(Context context, a aVar, Integer num) {
        a(context, aVar, Double.valueOf(a(num)));
    }

    public static synchronized void e(Context context) {
        synchronized (i.class) {
            try {
                if (!a) {
                    Log.i(z[31]);
                    try {
                        l(context);
                        Log.i(z[34] + b.size() + z[32] + d.size());
                    } catch (Throwable e) {
                        Log.b(z[33], e);
                        m(context);
                    }
                    a = true;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    private static synchronized void d(Context context) {
        synchronized (i.class) {
            a();
            File file = new File(context.getFilesDir(), z[9]);
            File file2 = new File(context.getFilesDir(), z[6]);
            try {
                if (file2.exists()) {
                    if (!file2.delete()) {
                        Log.w(z[8] + file2 + ')');
                    }
                }
                try {
                    if (file.exists()) {
                        if (!file.renameTo(file2)) {
                            throw new IOException(z[5] + file + z[7] + file2 + ')');
                        }
                    }
                    m(context);
                    a(context, System.currentTimeMillis());
                    b(context);
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
    }

    public static void a(Context context, bn bnVar, Boolean bool) {
        a(context, bnVar, Double.valueOf(a(bool)));
    }

    public static synchronized boolean g(Context context) {
        boolean z;
        synchronized (i.class) {
            try {
                e(context);
                if (h == 0) {
                    h(context);
                }
                try {
                    if (h + 86400000 < System.currentTimeMillis()) {
                        if (j(context)) {
                            z = true;
                        }
                    }
                    z = false;
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        return z;
    }

    public static synchronized byte[] k(Context context) {
        byte[] toByteArray;
        synchronized (i.class) {
            int i = b7.a;
            e(context);
            File file = new File(context.getFilesDir(), z[48]);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                do {
                    int read = fileInputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } while (i == 0);
                fileInputStream.close();
            } catch (Throwable e) {
                Log.c(e);
            } catch (Throwable e2) {
                Log.a(e2);
            }
            toByteArray = byteArrayOutputStream.toByteArray();
        }
        return toByteArray;
    }

    public static void a(Context context, bn bnVar, Integer num) {
        a(context, bnVar, Double.valueOf(a(num)));
    }

    private static synchronized void r(Context context) {
        synchronized (i.class) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), z[40]))));
            objectOutputStream.writeObject(b);
            objectOutputStream.writeObject(d);
            objectOutputStream.close();
        }
    }

    public static synchronized boolean o(Context context) {
        boolean delete;
        synchronized (i.class) {
            e(context);
            delete = new File(context.getFilesDir(), z[0]).delete();
        }
        return delete;
    }

    public static synchronized boolean n(Context context) {
        boolean z;
        synchronized (i.class) {
            e(context);
            try {
                if (new File(context.getFilesDir(), z[4]).length() >= 153600) {
                    if (j(context)) {
                        z = true;
                    }
                }
                z = false;
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        return z;
    }

    private static synchronized void h(Context context) {
        Throwable th;
        Throwable th2;
        synchronized (i.class) {
            DataInputStream dataInputStream = null;
            DataInputStream dataInputStream2;
            try {
                dataInputStream2 = new DataInputStream(new FileInputStream(new File(context.getFilesDir(), z[27])));
                try {
                    h = dataInputStream2.readLong();
                    if (dataInputStream2 != null) {
                        try {
                            dataInputStream2.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (FileNotFoundException e2) {
                    try {
                        h = -1;
                        if (dataInputStream2 != null) {
                            try {
                                dataInputStream2.close();
                            } catch (IOException e3) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        dataInputStream = dataInputStream2;
                        th2 = th;
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (IOException e4) {
                            } catch (IllegalStateException e5) {
                                throw e5;
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th32) {
                    th = th32;
                    dataInputStream = dataInputStream2;
                    th2 = th;
                    try {
                        Log.c(z[28], th2);
                        h = -1;
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        throw th2;
                    }
                }
            } catch (FileNotFoundException e7) {
                dataInputStream2 = null;
                h = -1;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
            } catch (IOException e8) {
                th2 = e8;
                Log.c(z[28], th2);
                h = -1;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
            }
        }
    }

    public static void a(Context context, a aVar, Double d) {
        e(context);
        ByteBuffer b = w.b();
        try {
            double d2;
            byte type = aVar.getType();
            int code = aVar.getCode();
            long currentTimeMillis = System.currentTimeMillis();
            if (d == null) {
                d2 = Double.NaN;
            } else {
                d2 = d.doubleValue();
            }
            w.a(type, code, currentTimeMillis, Double.valueOf(d2), b);
            b.flip();
            a(context, b, false);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static synchronized boolean f(Context context) {
        boolean z;
        synchronized (i.class) {
            e(context);
            try {
                if (new File(context.getFilesDir(), z[35]).length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return z;
    }

    private static synchronized void a() {
        synchronized (i.class) {
            try {
                if (g != null) {
                    g.close();
                    g = null;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    private static synchronized void b(Context context) {
        synchronized (i.class) {
            File file = new File(context.getFilesDir(), z[41]);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                if (currentTimeMillis / 1000 >= 0) {
                    if (currentTimeMillis / 1000 < 4294967296L) {
                        OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        a(currentTimeMillis, bufferedOutputStream);
                        g = bufferedOutputStream;
                    }
                }
                throw new IllegalStateException(z[42] + currentTimeMillis);
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    private static synchronized void i(Context context) {
        synchronized (i.class) {
            try {
                r(context);
                if (App.j == 1) {
                    Log.i(z[10] + b.size() + z[11] + d.size());
                    c(context);
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable e2) {
                Log.b(z[12], e2);
                m(context);
            }
        }
    }

    private static synchronized void m(Context context) {
        synchronized (i.class) {
            new File(context.getFilesDir(), z[36]).delete();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r10, com.whatsapp.fieldstats.bn r11, java.lang.String r12) {
        /*
        r6 = com.whatsapp.fieldstats.i.class;
        monitor-enter(r6);
        r7 = com.whatsapp.fieldstats.b7.a;	 Catch:{ all -> 0x0024 }
        e(r10);	 Catch:{ all -> 0x0024 }
        r0 = d;	 Catch:{ all -> 0x0024 }
        r0 = r0.get(r11);	 Catch:{ all -> 0x0024 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0024 }
        r1 = d;	 Catch:{ IllegalStateException -> 0x001e }
        r1 = r1.containsKey(r11);	 Catch:{ IllegalStateException -> 0x001e }
        if (r1 == 0) goto L_0x002d;
    L_0x0018:
        if (r0 != 0) goto L_0x0027;
    L_0x001a:
        if (r12 != 0) goto L_0x002d;
    L_0x001c:
        monitor-exit(r6);
        return;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0027:
        r0 = r0.equals(r12);	 Catch:{ all -> 0x0024 }
        if (r0 != 0) goto L_0x001c;
    L_0x002d:
        r5 = com.whatsapp.fieldstats.w.a();	 Catch:{ all -> 0x0024 }
        if (r12 != 0) goto L_0x004a;
    L_0x0033:
        r0 = r11.getType();	 Catch:{ IllegalStateException -> 0x0077 }
        r1 = r11.getCode();	 Catch:{ IllegalStateException -> 0x0077 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x0077 }
        r8 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
        r4 = java.lang.Double.valueOf(r8);	 Catch:{ IllegalStateException -> 0x0077 }
        com.whatsapp.fieldstats.w.a(r0, r1, r2, r4, r5);	 Catch:{ IllegalStateException -> 0x0077 }
        if (r7 == 0) goto L_0x005a;
    L_0x004a:
        r0 = r11.getType();	 Catch:{ IllegalStateException -> 0x0077 }
        r1 = r11.getCode();	 Catch:{ IllegalStateException -> 0x0077 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x0077 }
        r4 = r12;
        com.whatsapp.fieldstats.w.a(r0, r1, r2, r4, r5);	 Catch:{ IllegalStateException -> 0x0077 }
    L_0x005a:
        r5.flip();	 Catch:{ IllegalStateException -> 0x0079 }
        if (r12 != 0) goto L_0x006d;
    L_0x005f:
        r0 = b;	 Catch:{ IllegalStateException -> 0x007b }
        r1 = 0;
        r0.put(r11, r1);	 Catch:{ IllegalStateException -> 0x007b }
        r0 = d;	 Catch:{ IllegalStateException -> 0x007b }
        r1 = 0;
        r0.put(r11, r1);	 Catch:{ IllegalStateException -> 0x007b }
        if (r7 == 0) goto L_0x0072;
    L_0x006d:
        r0 = d;	 Catch:{ IllegalStateException -> 0x007b }
        r0.put(r11, r12);	 Catch:{ IllegalStateException -> 0x007b }
    L_0x0072:
        r0 = 1;
        a(r10, r5, r0);	 Catch:{ all -> 0x0024 }
        goto L_0x001c;
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0024 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0024 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.i.a(android.content.Context, com.whatsapp.fieldstats.bn, java.lang.String):void");
    }

    private static synchronized void a(Context context, long j) {
        DataOutputStream dataOutputStream;
        Throwable e;
        synchronized (i.class) {
            h = j;
            DataOutputStream dataOutputStream2 = null;
            try {
                dataOutputStream = new DataOutputStream(new FileOutputStream(new File(context.getFilesDir(), z[2])));
                try {
                    dataOutputStream.writeLong(j);
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e2) {
                        }
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    try {
                        Log.c(z[1], e);
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                    } catch (Throwable th) {
                        e = th;
                        dataOutputStream2 = dataOutputStream;
                        if (dataOutputStream2 != null) {
                            try {
                                dataOutputStream2.close();
                            } catch (IOException e5) {
                            } catch (IllegalStateException e6) {
                                throw e6;
                            }
                        }
                        throw e;
                    }
                } catch (IOException e7) {
                    e = e7;
                    dataOutputStream2 = dataOutputStream;
                    try {
                        Log.c(z[3], e);
                        if (dataOutputStream2 != null) {
                            try {
                                dataOutputStream2.close();
                            } catch (IOException e8) {
                            }
                        }
                    } catch (Throwable th2) {
                        e = th2;
                        if (dataOutputStream2 != null) {
                            dataOutputStream2.close();
                        }
                        throw e;
                    }
                }
            } catch (FileNotFoundException e9) {
                e = e9;
                dataOutputStream = null;
                Log.c(z[1], e);
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
            } catch (IOException e10) {
                e = e10;
                Log.c(z[3], e);
                if (dataOutputStream2 != null) {
                    dataOutputStream2.close();
                }
            }
        }
    }

    private static synchronized boolean s(Context context) {
        boolean z = false;
        synchronized (i.class) {
            File file = new File(context.getFilesDir(), z[43]);
            try {
                if (file.exists()) {
                    if (file.length() != 0) {
                        OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
                        a(System.currentTimeMillis(), bufferedOutputStream);
                        g = bufferedOutputStream;
                        z = true;
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r3, com.whatsapp.fieldstats.av r4) {
        /*
        r1 = com.whatsapp.fieldstats.i.class;
        monitor-enter(r1);
        r0 = android.os.Looper.myLooper();	 Catch:{ IllegalStateException -> 0x0021 }
        r2 = android.os.Looper.getMainLooper();	 Catch:{ IllegalStateException -> 0x0021 }
        if (r0 == r2) goto L_0x0017;
    L_0x000d:
        e(r3);	 Catch:{ IllegalStateException -> 0x0023 }
        r4.updateFields(r3);	 Catch:{ IllegalStateException -> 0x0023 }
        r0 = com.whatsapp.fieldstats.b7.a;	 Catch:{ IllegalStateException -> 0x0023 }
        if (r0 == 0) goto L_0x001f;
    L_0x0017:
        r0 = new com.whatsapp.fieldstats.ae;	 Catch:{ IllegalStateException -> 0x0023 }
        r0.<init>(r3, r4);	 Catch:{ IllegalStateException -> 0x0023 }
        com.whatsapp.util.bq.a(r0);	 Catch:{ IllegalStateException -> 0x0023 }
    L_0x001f:
        monitor-exit(r1);
        return;
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.i.a(android.content.Context, com.whatsapp.fieldstats.av):void");
    }

    private static double a(Boolean bool) {
        if (bool == null) {
            return Double.NaN;
        }
        try {
            return (double) (bool.booleanValue() ? 1 : 0);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void p(android.content.Context r12) {
        /*
        r8 = com.whatsapp.fieldstats.i.class;
        monitor-enter(r8);
        r9 = com.whatsapp.fieldstats.b7.a;	 Catch:{ all -> 0x00c4 }
        r2 = g;	 Catch:{ all -> 0x00c4 }
        if (r2 == 0) goto L_0x00c0;
    L_0x0009:
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00c4 }
        r7 = com.whatsapp.fieldstats.w.b();	 Catch:{ all -> 0x00c4 }
        r2 = b;	 Catch:{ all -> 0x00c4 }
        r2 = r2.entrySet();	 Catch:{ all -> 0x00c4 }
        r10 = r2.iterator();	 Catch:{ all -> 0x00c4 }
    L_0x001b:
        r2 = r10.hasNext();	 Catch:{ all -> 0x00c4 }
        if (r2 == 0) goto L_0x0065;
    L_0x0021:
        r2 = r10.next();	 Catch:{ all -> 0x00c4 }
        r0 = r2;
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00c4 }
        r6 = r0;
        r2 = r6.getValue();	 Catch:{ IllegalStateException -> 0x00c2 }
        if (r2 == 0) goto L_0x0063;
    L_0x002f:
        r7.clear();	 Catch:{ IllegalStateException -> 0x00c2 }
        r2 = r6.getKey();	 Catch:{ IllegalStateException -> 0x00c2 }
        r2 = (com.whatsapp.fieldstats.bn) r2;	 Catch:{ IllegalStateException -> 0x00c2 }
        r2 = r2.getType();	 Catch:{ IllegalStateException -> 0x00c2 }
        r3 = r6.getKey();	 Catch:{ IllegalStateException -> 0x00c2 }
        r3 = (com.whatsapp.fieldstats.bn) r3;	 Catch:{ IllegalStateException -> 0x00c2 }
        r3 = r3.getCode();	 Catch:{ IllegalStateException -> 0x00c2 }
        r6 = r6.getValue();	 Catch:{ IllegalStateException -> 0x00c2 }
        r6 = (java.lang.Double) r6;	 Catch:{ IllegalStateException -> 0x00c2 }
        com.whatsapp.fieldstats.w.a(r2, r3, r4, r6, r7);	 Catch:{ IllegalStateException -> 0x00c2 }
        r7.flip();	 Catch:{ IllegalStateException -> 0x00c2 }
        r2 = g;	 Catch:{ IllegalStateException -> 0x00c2 }
        r3 = r7.array();	 Catch:{ IllegalStateException -> 0x00c2 }
        r6 = r7.arrayOffset();	 Catch:{ IllegalStateException -> 0x00c2 }
        r11 = r7.remaining();	 Catch:{ IllegalStateException -> 0x00c2 }
        r2.write(r3, r6, r11);	 Catch:{ IllegalStateException -> 0x00c2 }
    L_0x0063:
        if (r9 == 0) goto L_0x001b;
    L_0x0065:
        r7 = com.whatsapp.fieldstats.w.a();	 Catch:{ all -> 0x00c4 }
        r2 = d;	 Catch:{ all -> 0x00c4 }
        r2 = r2.entrySet();	 Catch:{ all -> 0x00c4 }
        r10 = r2.iterator();	 Catch:{ all -> 0x00c4 }
    L_0x0073:
        r2 = r10.hasNext();	 Catch:{ all -> 0x00c4 }
        if (r2 == 0) goto L_0x00bd;
    L_0x0079:
        r2 = r10.next();	 Catch:{ all -> 0x00c4 }
        r0 = r2;
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00c4 }
        r6 = r0;
        r2 = r6.getValue();	 Catch:{ IllegalStateException -> 0x00c7 }
        if (r2 == 0) goto L_0x00bb;
    L_0x0087:
        r7.clear();	 Catch:{ IllegalStateException -> 0x00c7 }
        r2 = r6.getKey();	 Catch:{ IllegalStateException -> 0x00c7 }
        r2 = (com.whatsapp.fieldstats.bn) r2;	 Catch:{ IllegalStateException -> 0x00c7 }
        r2 = r2.getType();	 Catch:{ IllegalStateException -> 0x00c7 }
        r3 = r6.getKey();	 Catch:{ IllegalStateException -> 0x00c7 }
        r3 = (com.whatsapp.fieldstats.bn) r3;	 Catch:{ IllegalStateException -> 0x00c7 }
        r3 = r3.getCode();	 Catch:{ IllegalStateException -> 0x00c7 }
        r6 = r6.getValue();	 Catch:{ IllegalStateException -> 0x00c7 }
        r6 = (java.lang.String) r6;	 Catch:{ IllegalStateException -> 0x00c7 }
        com.whatsapp.fieldstats.w.a(r2, r3, r4, r6, r7);	 Catch:{ IllegalStateException -> 0x00c7 }
        r7.flip();	 Catch:{ IllegalStateException -> 0x00c7 }
        r2 = g;	 Catch:{ IllegalStateException -> 0x00c7 }
        r3 = r7.array();	 Catch:{ IllegalStateException -> 0x00c7 }
        r6 = r7.arrayOffset();	 Catch:{ IllegalStateException -> 0x00c7 }
        r11 = r7.remaining();	 Catch:{ IllegalStateException -> 0x00c7 }
        r2.write(r3, r6, r11);	 Catch:{ IllegalStateException -> 0x00c7 }
    L_0x00bb:
        if (r9 == 0) goto L_0x0073;
    L_0x00bd:
        i(r12);	 Catch:{ all -> 0x00c4 }
    L_0x00c0:
        monitor-exit(r8);
        return;
    L_0x00c2:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00c4 }
    L_0x00c4:
        r2 = move-exception;
        monitor-exit(r8);
        throw r2;
    L_0x00c7:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00c4 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.i.p(android.content.Context):void");
    }

    private static synchronized boolean q(Context context) {
        boolean z;
        synchronized (i.class) {
            try {
                z = new File(context.getFilesDir(), z[44]).length() >= 524288;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return z;
    }

    private static synchronized void a(Context context, ByteBuffer byteBuffer, boolean z) {
        int i = 0;
        synchronized (i.class) {
            try {
                if (g == null) {
                    try {
                        s(context);
                    } catch (Throwable e) {
                        Log.c(z[39], e);
                    }
                }
                if (g == null) {
                    try {
                        b(context);
                        p(context);
                    } catch (Throwable e2) {
                        Log.b(z[37], e2);
                    }
                }
                if (g != null) {
                    try {
                        int i2;
                        g.write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining());
                        if (z || e.hasMessages(0)) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        try {
                            e.removeMessages(1);
                            e.removeMessages(0);
                            Handler handler = e;
                            if (i2 == 0) {
                                i = 1;
                            }
                            e.sendMessageDelayed(Message.obtain(handler, i, context), 500);
                        } catch (IOException e3) {
                            throw e3;
                        } catch (Throwable e22) {
                            Log.b(z[38], e22);
                        }
                    } catch (IOException e32) {
                        throw e32;
                    } catch (IOException e322) {
                        throw e322;
                    }
                }
            } catch (IllegalStateException e4) {
                throw e4;
            } catch (IllegalStateException e42) {
                throw e42;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void c(android.content.Context r7) {
        /*
        r2 = 0;
        r4 = com.whatsapp.fieldstats.i.class;
        monitor-enter(r4);
        r0 = new java.io.File;	 Catch:{ all -> 0x0154 }
        r1 = r7.getFilesDir();	 Catch:{ all -> 0x0154 }
        r3 = z;	 Catch:{ all -> 0x0154 }
        r5 = 18;
        r3 = r3[r5];	 Catch:{ all -> 0x0154 }
        r0.<init>(r1, r3);	 Catch:{ all -> 0x0154 }
        r1 = new java.io.ObjectInputStream;	 Catch:{ all -> 0x0154 }
        r3 = new java.io.BufferedInputStream;	 Catch:{ all -> 0x0154 }
        r5 = new java.io.FileInputStream;	 Catch:{ all -> 0x0154 }
        r5.<init>(r0);	 Catch:{ all -> 0x0154 }
        r3.<init>(r5);	 Catch:{ all -> 0x0154 }
        r1.<init>(r3);	 Catch:{ all -> 0x0154 }
        r0 = r1.readObject();	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0 = (java.util.EnumMap) r0;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r1 = r1.readObject();	 Catch:{ ClassNotFoundException -> 0x0145 }
        r1 = (java.util.EnumMap) r1;	 Catch:{ ClassNotFoundException -> 0x0145 }
        if (r0 == 0) goto L_0x0042;
    L_0x0030:
        if (r1 == 0) goto L_0x0042;
    L_0x0032:
        r3 = b;	 Catch:{ ClassNotFoundException -> 0x013d }
        r3 = r0.equals(r3);	 Catch:{ ClassNotFoundException -> 0x013d }
        if (r3 == 0) goto L_0x0042;
    L_0x003a:
        r3 = d;	 Catch:{ ClassNotFoundException -> 0x013f }
        r3 = r1.equals(r3);	 Catch:{ ClassNotFoundException -> 0x013f }
        if (r3 != 0) goto L_0x013b;
    L_0x0042:
        r3 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0141 }
        r3.<init>();	 Catch:{ ClassNotFoundException -> 0x0141 }
        r5 = z;	 Catch:{ ClassNotFoundException -> 0x0141 }
        r6 = 13;
        r5 = r5[r6];	 Catch:{ ClassNotFoundException -> 0x0141 }
        r3 = r3.append(r5);	 Catch:{ ClassNotFoundException -> 0x0141 }
        r5 = b;	 Catch:{ ClassNotFoundException -> 0x0141 }
        r5 = r5.size();	 Catch:{ ClassNotFoundException -> 0x0141 }
        r3 = r3.append(r5);	 Catch:{ ClassNotFoundException -> 0x0141 }
        r5 = z;	 Catch:{ ClassNotFoundException -> 0x0141 }
        r6 = 23;
        r5 = r5[r6];	 Catch:{ ClassNotFoundException -> 0x0141 }
        r3 = r3.append(r5);	 Catch:{ ClassNotFoundException -> 0x0141 }
        r5 = d;	 Catch:{ ClassNotFoundException -> 0x0141 }
        r5 = r5.size();	 Catch:{ ClassNotFoundException -> 0x0141 }
        r3 = r3.append(r5);	 Catch:{ ClassNotFoundException -> 0x0141 }
        r5 = z;	 Catch:{ ClassNotFoundException -> 0x0141 }
        r6 = 22;
        r5 = r5[r6];	 Catch:{ ClassNotFoundException -> 0x0141 }
        r5 = r3.append(r5);	 Catch:{ ClassNotFoundException -> 0x0141 }
        if (r0 == 0) goto L_0x0157;
    L_0x007b:
        r3 = r0.size();	 Catch:{ ClassNotFoundException -> 0x0143 }
    L_0x007f:
        r3 = r5.append(r3);	 Catch:{ ClassNotFoundException -> 0x015a }
        r5 = z;	 Catch:{ ClassNotFoundException -> 0x015a }
        r6 = 15;
        r5 = r5[r6];	 Catch:{ ClassNotFoundException -> 0x015a }
        r3 = r3.append(r5);	 Catch:{ ClassNotFoundException -> 0x015a }
        if (r1 == 0) goto L_0x0093;
    L_0x008f:
        r2 = r1.size();	 Catch:{ ClassNotFoundException -> 0x015a }
    L_0x0093:
        r2 = r3.append(r2);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x0145 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x0145 }
        r3 = z;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r5 = 19;
        r3 = r3[r5];	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = r2.append(r3);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r3 = b;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = r2.append(r3);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x0145 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x0145 }
        r3 = z;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r5 = 16;
        r3 = r3[r5];	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = r2.append(r3);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r3 = d;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = r2.append(r3);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x0145 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x0145 }
        r3 = z;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r5 = 20;
        r3 = r3[r5];	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = r2.append(r3);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0 = r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0 = r0.toString();	 Catch:{ ClassNotFoundException -> 0x0145 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = z;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0 = r0.append(r2);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0 = r0.append(r1);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0 = r0.toString();	 Catch:{ ClassNotFoundException -> 0x0145 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r1 = 100;
        r0 = r0.nextInt(r1);	 Catch:{ ClassNotFoundException -> 0x0145 }
        if (r0 != 0) goto L_0x013b;
    L_0x0114:
        r0 = new android.content.Intent;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r1 = z;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = 24;
        r1 = r1[r2];	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0.<init>(r1);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r1 = z;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0 = r0.setPackage(r1);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r1 = z;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = 26;
        r1 = r1[r2];	 Catch:{ ClassNotFoundException -> 0x0145 }
        r2 = z;	 Catch:{ ClassNotFoundException -> 0x0145 }
        r3 = 25;
        r2 = r2[r3];	 Catch:{ ClassNotFoundException -> 0x0145 }
        r0.putExtra(r1, r2);	 Catch:{ ClassNotFoundException -> 0x0145 }
        r7.sendBroadcast(r0);	 Catch:{ ClassNotFoundException -> 0x0145 }
    L_0x013b:
        monitor-exit(r4);
        return;
    L_0x013d:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x013f }
    L_0x013f:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0141 }
    L_0x0141:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0143 }
    L_0x0143:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0145 }
    L_0x0145:
        r0 = move-exception;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ClassNotFoundException -> 0x0152 }
        r2 = 9;
        if (r1 < r2) goto L_0x015c;
    L_0x014c:
        r1 = new java.io.IOException;	 Catch:{ ClassNotFoundException -> 0x0152 }
        r1.<init>(r0);	 Catch:{ ClassNotFoundException -> 0x0152 }
        throw r1;	 Catch:{ ClassNotFoundException -> 0x0152 }
    L_0x0152:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0154 }
    L_0x0154:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0157:
        r3 = r2;
        goto L_0x007f;
    L_0x015a:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0145 }
    L_0x015c:
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0154 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0154 }
        r2.<init>();	 Catch:{ all -> 0x0154 }
        r3 = z;	 Catch:{ all -> 0x0154 }
        r5 = 21;
        r3 = r3[r5];	 Catch:{ all -> 0x0154 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0154 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x0154 }
        r0 = r0.toString();	 Catch:{ all -> 0x0154 }
        r1.<init>(r0);	 Catch:{ all -> 0x0154 }
        throw r1;	 Catch:{ all -> 0x0154 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.i.c(android.content.Context):void");
    }

    public static synchronized boolean j(Context context) {
        boolean z = false;
        synchronized (i.class) {
            try {
                e(context);
                if (!f(context) || q(context)) {
                    try {
                        if (f(context)) {
                            Log.w(z[45]);
                            o(context);
                        }
                        try {
                            d(context);
                            p(context);
                            z = true;
                        } catch (Throwable e) {
                            Log.b(z[46], e);
                        }
                    } catch (IOException e2) {
                        throw e2;
                    }
                }
                Log.w(z[47]);
            } catch (IOException e22) {
                throw e22;
            } catch (IOException e222) {
                throw e222;
            }
        }
        return z;
    }

    private static synchronized void l(Context context) {
        synchronized (i.class) {
            b.clear();
            d.clear();
            File file = new File(context.getFilesDir(), z[30]);
            try {
                if (file.exists() && file.canRead()) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                    try {
                        EnumMap enumMap = (EnumMap) objectInputStream.readObject();
                        b.putAll((EnumMap) objectInputStream.readObject());
                        d.putAll(enumMap);
                    } catch (Throwable e) {
                        Log.c(e);
                        file.delete();
                    }
                    objectInputStream.close();
                } else if (file.exists()) {
                    try {
                        Log.w(file + z[29]);
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            } catch (Exception e22) {
                throw e22;
            } catch (Exception e222) {
                throw e222;
            }
        }
    }

    static void a(Context context) {
        i(context);
    }

    static OutputStream b() {
        return g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r9, com.whatsapp.fieldstats.bn r10, java.lang.Double r11) {
        /*
        r8 = com.whatsapp.fieldstats.i.class;
        monitor-enter(r8);
        e(r9);	 Catch:{ all -> 0x0022 }
        r0 = b;	 Catch:{ all -> 0x0022 }
        r0 = r0.get(r10);	 Catch:{ all -> 0x0022 }
        r0 = (java.lang.Double) r0;	 Catch:{ all -> 0x0022 }
        r1 = b;	 Catch:{ IllegalStateException -> 0x001c }
        r1 = r1.containsKey(r10);	 Catch:{ IllegalStateException -> 0x001c }
        if (r1 == 0) goto L_0x002b;
    L_0x0016:
        if (r0 != 0) goto L_0x0025;
    L_0x0018:
        if (r11 != 0) goto L_0x002b;
    L_0x001a:
        monitor-exit(r8);
        return;
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
    L_0x0025:
        r0 = r0.equals(r11);	 Catch:{ all -> 0x0022 }
        if (r0 != 0) goto L_0x001a;
    L_0x002b:
        r5 = com.whatsapp.fieldstats.w.b();	 Catch:{ all -> 0x0022 }
        r0 = r10.getType();	 Catch:{ IllegalStateException -> 0x0065 }
        r1 = r10.getCode();	 Catch:{ IllegalStateException -> 0x0065 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x0065 }
        if (r11 != 0) goto L_0x0067;
    L_0x003d:
        r6 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
    L_0x003f:
        r4 = java.lang.Double.valueOf(r6);	 Catch:{ IllegalStateException -> 0x006c }
        com.whatsapp.fieldstats.w.a(r0, r1, r2, r4, r5);	 Catch:{ IllegalStateException -> 0x006c }
        r5.flip();	 Catch:{ IllegalStateException -> 0x006c }
        if (r11 != 0) goto L_0x005b;
    L_0x004b:
        r0 = b;	 Catch:{ IllegalStateException -> 0x006e }
        r1 = 0;
        r0.put(r10, r1);	 Catch:{ IllegalStateException -> 0x006e }
        r0 = d;	 Catch:{ IllegalStateException -> 0x006e }
        r1 = 0;
        r0.put(r10, r1);	 Catch:{ IllegalStateException -> 0x006e }
        r0 = com.whatsapp.fieldstats.b7.a;	 Catch:{ IllegalStateException -> 0x006e }
        if (r0 == 0) goto L_0x0060;
    L_0x005b:
        r0 = b;	 Catch:{ IllegalStateException -> 0x006e }
        r0.put(r10, r11);	 Catch:{ IllegalStateException -> 0x006e }
    L_0x0060:
        r0 = 1;
        a(r9, r5, r0);	 Catch:{ all -> 0x0022 }
        goto L_0x001a;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0022 }
    L_0x0067:
        r6 = r11.doubleValue();	 Catch:{ all -> 0x0022 }
        goto L_0x003f;
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0022 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.i.a(android.content.Context, com.whatsapp.fieldstats.bn, java.lang.Double):void");
    }

    public static void a(Context context, ax axVar) {
        double d;
        if (axVar == null) {
            d = Double.NaN;
        } else {
            d = (double) axVar.getCode();
        }
        a(context, bn.PLATFORM, Double.valueOf(d));
    }
}
