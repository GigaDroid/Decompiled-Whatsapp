package com.whatsapp.util;

import android.content.Context;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class Log {
    private static String a;
    private static final int b;
    private static AtomicReference c;
    private static final Object d;
    private static final Object e;
    private static final int f;
    private static boolean g;
    public static int h;
    private static final Object i;
    private static FileChannel j;
    private static AtomicReference k;
    private static final SimpleDateFormat l;
    private static File m;
    private static File n;
    private static int o;
    private static final String[] z;

    static {
        String[] strArr = new String[66];
        String str = "n\u0003%7k[\u00199<9i\u0011?>|K";
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
                        i3 = 47;
                        break;
                    case at.g /*1*/:
                        i3 = 112;
                        break;
                    case at.i /*2*/:
                        i3 = 86;
                        break;
                    case at.o /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = 25;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "c<\t\u00139";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "c<\t\u001b9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "c<\t\u001b9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    str = "c<\t\u001b9";
                    z = true;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "\u000f\u0004,o";
                    z = true;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000fMko$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0012Mko9C\u001f14pC\u0015v$|]\u0003?=w\u0012Bxc+\u0001Ecb9C\u0015 7u\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "f?\u0013*zJ\u0000\";vAP9<9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "x\u00187&jn\u0000&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001f@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "c<\t\u00169";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "c<\t\u00169";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001d^g`7\u001aEf\u007f\u007fN\u0004{%|M\u0003?&|\u0002\u00023>|N\u00033";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\n\u0013sb+KUf`}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u000fMko$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "c\u001f1!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "X\u00187&jN\u0000&|u@\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "c<\t\u001b9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u000f\u0004,o";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "X\u00187&jN\u0000&|mB\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0012Mko9C\u001f14pC\u0015v>|Y\u0015:o";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\fSur|A\u0014v!mN\u0013=rm]\u001157";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "c<\t\u00059";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    str = "c<\t\u00059";
                    z = true;
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    strArr2 = strArr3;
                    str = "c<\t\u001b9";
                    z = true;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "c<\t\u001b9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0001^x";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0001^x";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "C\u001f1rx_\u0000:;zN\u0004?=w\u000f\u00139<mJ\b\"rxC\u000233}VP7!jF\u001787}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\fSur{J\u0017?<9\\\u000471r\u000f\u0004$3zJP";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u001d^g`7\u001aEf";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0000\u0004/\"|\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "I\u001d%56\\\u00047&l\\J";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0000\u0017$\"FN\u0013\";vAJ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0000\u0002;&4\\\u00025h";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "c<\t\u00179";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "c<\t\u00179";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "A\u0011\";oJ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "rP";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "c<\t\u00059";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "c<\t\u00169";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "c<\t\u00139";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "c<\t\u00179";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "c<\t\u00049";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "f\u001e 3uF\u0014v>vHP:7oJ\u001cv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    str = "c<\t\u001b9";
                    z = true;
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    strArr2 = strArr3;
                    str = "c<\t\u00179";
                    z = true;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "c<\t\u00179";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "c<\t\u00059";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "c<\t\u00059";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "c<\t\u00179";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "c<\t\u00179";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "c<\t\u00059";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "c<\t\u00059";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "c<\t\u00049";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "j\u0002$=k\u0015P";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "x\u00187&jn\u0000&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "x\u00187&jn\u0000&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "x\u00187&jn\u0000&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "x\u00187&jn\u0000&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "x\u00187&jn\u0000&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "c<\t\u001b9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "c<\t\u001b9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "V\t/+4b={6}\u000f8\u001ehtBJ%!7|#\u0005r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    z = strArr3;
                    f = "\n".length();
                    l = new SimpleDateFormat(z[65], Locale.US);
                    b = l.toPattern().length();
                    c = new AtomicReference();
                    k = new c0("D");
                    n = null;
                    m = null;
                    o = 5;
                    g = false;
                    j = null;
                    e = new Object();
                    d = new Object();
                    i = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "c<\t\u00139";
                    z = false;
                    break;
            }
        }
    }

    public static void d() {
        n.a(n, 3);
    }

    public static String a(co coVar) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(z[34]).append(coVar.d).append(z[33]).append(coVar.c);
            if (coVar.k.c.contains("-")) {
                stringBuilder.append(z[35]).append(coVar.z);
            }
            stringBuilder.append(z[36]).append(coVar.t).append(" ").append(coVar.k.toString());
            return stringBuilder.toString();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static void b(Throwable th) {
        try {
            if (o == 5) {
                a(3, a(z[63], d(th)));
                if (h == 0) {
                    return;
                }
            }
            try {
                if (o >= 3) {
                    a(z[64], d(th));
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private static void d(int i, String str) {
        if (i == 0 || i == 5) {
            try {
                android.util.Log.v(z[61], str);
            } catch (IllegalStateException e) {
                throw e;
            }
        } else if (i == 4) {
            try {
                android.util.Log.d(z[58], str);
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } else if (i == 3) {
            try {
                android.util.Log.i(z[59], str);
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } else if (i == 2) {
            try {
                android.util.Log.w(z[62], str);
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } else if (i == 1) {
            try {
                android.util.Log.e(z[60], str);
                if (App.am == 3) {
                    StringBuilder append = new StringBuilder().append(z[57]);
                    if (str.length() > 50) {
                        str = str.substring(0, 47) + "\u2026";
                    }
                    App.v(append.append(str).toString());
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        }
    }

    public static void b(String str, Throwable th) {
        try {
            if (o == 5) {
                a(1, a(z[52], str, d(th)));
                return;
            }
            try {
                if (o >= 1) {
                    a(z[53], str, d(th));
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public static File b() {
        Throwable e;
        Throwable th;
        Throwable e2;
        int i = h;
        File file = null;
        if (c()) {
            synchronized (i) {
                synchronized (d) {
                    File file2;
                    try {
                        Iterator it = g().iterator();
                        file2 = null;
                        do {
                            try {
                                if (!it.hasNext()) {
                                    break;
                                }
                                file = (File) it.next();
                                file2 = n.a(n, file);
                                file.delete();
                            } catch (IOException e3) {
                                e = e3;
                            } catch (SecurityException e4) {
                                e = e4;
                            }
                        } while (i == 0);
                        file = file2;
                    } catch (Throwable e22) {
                        th = e22;
                        file2 = null;
                        e = th;
                        th = e;
                        file = file2;
                        e22 = th;
                        a(e22);
                        return file;
                    } catch (Throwable e222) {
                        th = e222;
                        file2 = null;
                        e = th;
                        th = e;
                        file = file2;
                        e222 = th;
                        a(e222);
                        return file;
                    }
                }
            }
        }
        return file;
    }

    private static String a(String str, String str2) {
        return a(a(str, new StringBuilder(str2))).toString();
    }

    public static void a(Throwable th) {
        try {
            if (o == 5) {
                a(1, a(z[38], d(th)));
                return;
            }
            try {
                if (o >= 1) {
                    a(z[37], d(th));
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public static ArrayList b(int i) {
        return n.b(n, i);
    }

    static int h() {
        return o;
    }

    public static String i() {
        return z[31] + f();
    }

    public static String e() {
        return z[23];
    }

    private static String c(int i) {
        switch (i) {
            case v.m /*0*/:
                try {
                    return z[43];
                } catch (IllegalStateException e) {
                    throw e;
                }
            case at.g /*1*/:
                return z[44];
            case at.i /*2*/:
                return z[41];
            case at.o /*3*/:
                return z[47];
            case at.p /*4*/:
                return z[42];
            case at.m /*5*/:
                return z[45];
            default:
                throw new IllegalArgumentException(z[46] + i);
        }
    }

    public static void c(String str, Throwable th) {
        try {
            if (o == 5) {
                a(2, a(z[50], str, d(th)));
                if (h == 0) {
                    return;
                }
            }
            try {
                if (o >= 2) {
                    a(z[51], str, d(th));
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public static void a(String str) {
        a(z[2], str);
    }

    private static StringBuilder a(String str, StringBuilder stringBuilder) {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        String str2 = str + ((String) k.get()) + " ";
        if (o < 5) {
            return new StringBuilder((((str2.length() + 20) + name.length()) + stringBuilder.length()) + 4).append(str2).append('[').append(id).append(':').append(name).append(z[40]).append(stringBuilder);
        }
        String str3 = "";
        String str4 = "";
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 5;
        while (i < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            try {
                if (!stackTraceElement.isNativeMethod()) {
                    str3 = stackTraceElement.getFileName();
                    str4 = String.valueOf(stackTraceElement.getLineNumber());
                    break;
                }
                if (i == 5) {
                    str3 = stackTraceElement.getFileName();
                    str4 = z[39];
                }
                i++;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return new StringBuilder((((((((((str2.length() + 1) + 20) + 1) + name.length()) + 1) + str3.length()) + 1) + str4.length()) + 1) + stringBuilder.length()).append(str2).append('[').append(id).append(':').append(name).append(']').append(str3).append(':').append(str4).append(' ').append(stringBuilder);
    }

    static void c(int i, String str) {
        a(i, str);
    }

    public static void d(String str) {
        try {
            if (o == 5) {
                a(4, a(z[12], str));
                if (h == 0) {
                    return;
                }
            }
            try {
                if (o >= 4) {
                    a(z[13], str);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public static void e(String str) {
        try {
            if (o == 5) {
                a(1, a(z[48], str));
                return;
            }
            try {
                if (o >= 1) {
                    a(z[49], str);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private static String d(Throwable th) {
        if (th == null) {
            try {
                return "";
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            if (z[32] != null) {
                printWriter.println(i());
            }
            th.printStackTrace(printWriter);
            printWriter.println(e());
            return stringWriter.toString();
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private static void a(int i, String str) {
        while (str.length() > 4000) {
            String substring = str.substring(0, 3997);
            str = z[28] + str.substring(3997);
            d(i, substring + z[29]);
        }
        d(i, str);
    }

    public static void b(boolean z) {
        if (!z) {
            try {
                a(z[1], z[0]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    public static boolean a() {
        boolean z = false;
        if (c()) {
            synchronized (d) {
                synchronized (e) {
                    try {
                        j.close();
                        z = n.b(n, m);
                        g = false;
                        c();
                    } catch (IOException e) {
                    }
                }
            }
        }
        return z;
    }

    public static void i(String str) {
        try {
            if (o == 5) {
                a(3, a(z[4], str));
                return;
            }
            try {
                if (o >= 3) {
                    a(z[3], str);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public static void a(String str, Throwable th) {
        try {
            if (o == 5) {
                a(3, a(z[26], str, d(th)));
                if (h == 0) {
                    return;
                }
            }
            try {
                if (o >= 3) {
                    a(z[27], str, d(th));
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private static StringBuilder a(StringBuilder stringBuilder) {
        if (c()) {
            StringBuilder stringBuilder2 = new StringBuilder((b + stringBuilder.length()) + f);
            Calendar instance = Calendar.getInstance();
            try {
                stringBuilder2.append(instance.get(1)).append('-');
                if (instance.get(2) < 9) {
                    stringBuilder2.append('0');
                }
                try {
                    stringBuilder2.append(instance.get(2) + 1).append('-');
                    if (instance.get(5) < 10) {
                        stringBuilder2.append('0');
                    }
                    try {
                        stringBuilder2.append(instance.get(5)).append(' ');
                        if (instance.get(11) < 10) {
                            stringBuilder2.append('0');
                        }
                        try {
                            stringBuilder2.append(instance.get(11)).append(':');
                            if (instance.get(12) < 10) {
                                stringBuilder2.append('0');
                            }
                            try {
                                stringBuilder2.append(instance.get(12)).append(':');
                                if (instance.get(13) < 10) {
                                    stringBuilder2.append('0');
                                }
                                try {
                                    stringBuilder2.append(instance.get(13)).append('.');
                                    if (instance.get(14) < 10) {
                                        stringBuilder2.append(z[11]);
                                    } else {
                                        try {
                                            if (instance.get(14) < 100) {
                                                stringBuilder2.append('0');
                                            }
                                        } catch (IOException e) {
                                            throw e;
                                        }
                                    }
                                    stringBuilder2.append(instance.get(14)).append(' ');
                                    stringBuilder2.append(stringBuilder).append("\n");
                                    ByteBuffer wrap = ByteBuffer.wrap(stringBuilder2.toString().getBytes());
                                    try {
                                        synchronized (e) {
                                            FileLock fileLock = null;
                                            try {
                                                fileLock = j.lock();
                                                j.position(j.size());
                                                j.write(wrap);
                                                if (fileLock != null) {
                                                    fileLock.release();
                                                }
                                            } catch (IOException e2) {
                                                throw e2;
                                            } catch (Throwable th) {
                                                if (fileLock != null) {
                                                    fileLock.release();
                                                }
                                            }
                                        }
                                    } catch (Throwable e3) {
                                        android.util.Log.e(z[10], z[9] + stringBuilder, e3);
                                    }
                                } catch (IOException e22) {
                                    throw e22;
                                }
                            } catch (IOException e222) {
                                throw e222;
                            }
                        } catch (IOException e2222) {
                            throw e2222;
                        }
                    } catch (IOException e22222) {
                        throw e22222;
                    }
                } catch (IOException e222222) {
                    throw e222222;
                }
            } catch (IOException e2222222) {
                throw e2222222;
            }
        }
        return stringBuilder;
    }

    public static File j() {
        return n.a(n);
    }

    public static void a(int i) {
        o = i;
        a(z[5], z[8] + o + z[6] + a + z[7]);
    }

    public static void v(String str) {
        try {
            if (o >= 5) {
                a(5, a(z[56], str));
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static String f() {
        return z[14];
    }

    public static void w(String str) {
        try {
            if (o == 5) {
                a(2, a(z[25], str));
                return;
            }
            try {
                if (o >= 2) {
                    a(z[24], str);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private static ArrayList g() {
        return ak.a(n, m);
    }

    public static void c(Throwable th) {
        try {
            if (o == 5) {
                a(2, a(z[54], d(th)));
                if (h == 0) {
                    return;
                }
            }
            try {
                if (o >= 2) {
                    a(z[55], d(th));
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static String b(String str, String str2) {
        return a(str, str2);
    }

    public static void b(int i, String str) {
        if (i <= o) {
            String a = a(c(i), str);
            try {
                if (o == 5) {
                    a(i, a);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    public static void a(Context context) {
        try {
            if (!c.compareAndSet(null, context)) {
                throw new IllegalStateException(z[30]);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private static String a(String str, String str2, String str3) {
        return a(a(str, new StringBuilder((str2.length() + f) + str3.length()).append(str2).append("\n").append(str3))).toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c() {
        /*
        r2 = 0;
        r1 = 1;
        r0 = g;	 Catch:{ FileNotFoundException -> 0x0028 }
        if (r0 == 0) goto L_0x0012;
    L_0x0006:
        r0 = j;	 Catch:{ FileNotFoundException -> 0x0028 }
        if (r0 == 0) goto L_0x0012;
    L_0x000a:
        r0 = j;	 Catch:{ FileNotFoundException -> 0x002a }
        r0 = r0.isOpen();	 Catch:{ FileNotFoundException -> 0x002a }
        if (r0 != 0) goto L_0x012b;
    L_0x0012:
        r3 = e;
        monitor-enter(r3);
        r0 = g;	 Catch:{ all -> 0x002e }
        if (r0 == 0) goto L_0x0031;
    L_0x0019:
        r0 = j;	 Catch:{ FileNotFoundException -> 0x002c }
        if (r0 == 0) goto L_0x0031;
    L_0x001d:
        r0 = j;	 Catch:{ FileNotFoundException -> 0x002c }
        r0 = r0.isOpen();	 Catch:{ FileNotFoundException -> 0x002c }
        if (r0 == 0) goto L_0x0031;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
        r0 = r1;
    L_0x0027:
        return r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
        throw r0;
    L_0x0031:
        r0 = c;	 Catch:{ all -> 0x002e }
        r0 = r0.get();	 Catch:{ all -> 0x002e }
        r0 = (android.content.Context) r0;	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x003e;
    L_0x003b:
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
        r0 = r2;
        goto L_0x0027;
    L_0x003e:
        r4 = new java.io.File;	 Catch:{ all -> 0x002e }
        r0 = r0.getFilesDir();	 Catch:{ all -> 0x002e }
        r5 = z;	 Catch:{ all -> 0x002e }
        r6 = 17;
        r5 = r5[r6];	 Catch:{ all -> 0x002e }
        r4.<init>(r0, r5);	 Catch:{ all -> 0x002e }
        r0 = r4.exists();	 Catch:{ FileNotFoundException -> 0x005f }
        if (r0 != 0) goto L_0x0061;
    L_0x0053:
        r4.mkdirs();	 Catch:{ FileNotFoundException -> 0x005f }
        r0 = r4.exists();	 Catch:{ FileNotFoundException -> 0x005f }
        if (r0 != 0) goto L_0x0061;
    L_0x005c:
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
        r0 = r2;
        goto L_0x0027;
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x0061:
        r0 = new java.io.File;	 Catch:{ all -> 0x002e }
        r5 = z;	 Catch:{ all -> 0x002e }
        r6 = 18;
        r5 = r5[r6];	 Catch:{ all -> 0x002e }
        r0.<init>(r4, r5);	 Catch:{ all -> 0x002e }
        n = r0;	 Catch:{ all -> 0x002e }
        r0 = new java.io.File;	 Catch:{ all -> 0x002e }
        r5 = z;	 Catch:{ all -> 0x002e }
        r6 = 21;
        r5 = r5[r6];	 Catch:{ all -> 0x002e }
        r0.<init>(r4, r5);	 Catch:{ all -> 0x002e }
        m = r0;	 Catch:{ all -> 0x002e }
        r0 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x012e }
        r4 = n;	 Catch:{ FileNotFoundException -> 0x012e }
        r5 = 1;
        r0.<init>(r4, r5);	 Catch:{ FileNotFoundException -> 0x012e }
        r0 = r0.getChannel();	 Catch:{ FileNotFoundException -> 0x012e }
        j = r0;	 Catch:{ FileNotFoundException -> 0x012e }
        r0 = new java.io.PrintStream;	 Catch:{ all -> 0x002e }
        r2 = new com.whatsapp.util.au;	 Catch:{ all -> 0x002e }
        r4 = java.lang.System.err;	 Catch:{ all -> 0x002e }
        r5 = j;	 Catch:{ all -> 0x002e }
        r5 = java.nio.channels.Channels.newOutputStream(r5);	 Catch:{ all -> 0x002e }
        r2.<init>(r4, r5);	 Catch:{ all -> 0x002e }
        r4 = 1;
        r0.<init>(r2, r4);	 Catch:{ all -> 0x002e }
        java.lang.System.setErr(r0);	 Catch:{ all -> 0x002e }
        r0 = 1;
        g = r0;	 Catch:{ all -> 0x002e }
        r0 = java.util.Calendar.getInstance();	 Catch:{ all -> 0x002e }
        r2 = 15;
        r2 = r0.get(r2);	 Catch:{ all -> 0x002e }
        r4 = 16;
        r0 = r0.get(r4);	 Catch:{ all -> 0x002e }
        r0 = r0 + r2;
        r2 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = r0 / r2;
        r4 = r2 / 60;
        r5 = java.util.Locale.US;	 Catch:{ FileNotFoundException -> 0x0133 }
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0133 }
        r6 = 15;
        r6 = r0[r6];	 Catch:{ FileNotFoundException -> 0x0133 }
        r0 = 3;
        r7 = new java.lang.Object[r0];	 Catch:{ FileNotFoundException -> 0x0133 }
        r8 = 0;
        if (r4 >= 0) goto L_0x0135;
    L_0x00c8:
        r0 = 45;
    L_0x00ca:
        r0 = java.lang.Character.valueOf(r0);	 Catch:{ all -> 0x002e }
        r7[r8] = r0;	 Catch:{ all -> 0x002e }
        r0 = 1;
        r4 = java.lang.Math.abs(r4);	 Catch:{ all -> 0x002e }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x002e }
        r7[r0] = r4;	 Catch:{ all -> 0x002e }
        r0 = 2;
        r2 = r2 % 60;
        r2 = java.lang.Math.abs(r2);	 Catch:{ all -> 0x002e }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x002e }
        r7[r0] = r2;	 Catch:{ all -> 0x002e }
        r0 = java.lang.String.format(r5, r6, r7);	 Catch:{ all -> 0x002e }
        a = r0;	 Catch:{ all -> 0x002e }
        r0 = z;	 Catch:{ all -> 0x002e }
        r2 = 19;
        r0 = r0[r2];	 Catch:{ all -> 0x002e }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002e }
        r2.<init>();	 Catch:{ all -> 0x002e }
        r4 = z;	 Catch:{ all -> 0x002e }
        r5 = 22;
        r4 = r4[r5];	 Catch:{ all -> 0x002e }
        r2 = r2.append(r4);	 Catch:{ all -> 0x002e }
        r4 = o;	 Catch:{ all -> 0x002e }
        r2 = r2.append(r4);	 Catch:{ all -> 0x002e }
        r4 = z;	 Catch:{ all -> 0x002e }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ all -> 0x002e }
        r2 = r2.append(r4);	 Catch:{ all -> 0x002e }
        r4 = a;	 Catch:{ all -> 0x002e }
        r2 = r2.append(r4);	 Catch:{ all -> 0x002e }
        r4 = z;	 Catch:{ all -> 0x002e }
        r5 = 16;
        r4 = r4[r5];	 Catch:{ all -> 0x002e }
        r2 = r2.append(r4);	 Catch:{ all -> 0x002e }
        r2 = r2.toString();	 Catch:{ all -> 0x002e }
        a(r0, r2);	 Catch:{ all -> 0x002e }
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
    L_0x012b:
        r0 = r1;
        goto L_0x0027;
    L_0x012e:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
        r0 = r2;
        goto L_0x0027;
    L_0x0133:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x0135:
        r0 = 43;
        goto L_0x00ca;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.c():boolean");
    }
}
