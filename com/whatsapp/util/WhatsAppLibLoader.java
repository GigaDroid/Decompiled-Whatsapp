package com.whatsapp.util;

import android.content.Context;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class WhatsAppLibLoader {
    private static Boolean a;
    private static String b;
    private static final String[] z;

    private static native String getJNICodeVersion();

    private static native void testLibraryUsable(byte[] bArr);

    static {
        String[] strArr = new String[39];
        String str = ";@\u001f))-X\u000e13.D\u0011<>)ZQ15-L\u001b/(#Z";
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
                        i3 = 76;
                        break;
                    case at.g /*1*/:
                        i3 = 40;
                        break;
                    case at.i /*2*/:
                        i3 = 126;
                        break;
                    case at.o /*3*/:
                        i3 = 93;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "4\u0010H";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "-Z\u00138;.A";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "-Z\u00138;.A";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = " A\u001c";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = " A\u001cr";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "cD\u0017?";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "cD\u0017?";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "/I\u0010}4#\\^;3\"L^13.\u0007";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "!A\u000e.";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "/I\u0010}4#\\^;3\"L^13.\b\u001826(M\f}<#Z^\u001c\u0018\u0005\b";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "b[\u0011";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ";@\u001f))-X\u000e13.D\u0011<>)ZQ>6#[\u001b'<";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "-Z\u00138;.AS+m-";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "4\u0010H";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ";@\u001f))-X\u000e13.D\u0011<>)ZQ45)Z\f2(";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ";@\u001f))-X\u000e13.D\u0011<>)ZQ>6#[\u001b'<";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "!A\u000e.";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "-Z\u00138;.AS+m";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0005g;%9)X\n45\"\b\t5?\"\b\u00173)8I\u00121z\"I\n4,)\b\u001248>I\f$";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "b[\u0011";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ")Z\f2(v\b\b8(?A\u00113z(G\u001b.z\"G\n}7-\\\u001d5tlb?\u000b\u001bl^\u001b/)%G\u0010gz~\u0006Ooty\u001dNqz\u0006f7},)Z\r45\"";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = ")Z\f2(l_\u001646)\b\n8)8A\u0010:z A\u001c/;>Q^()-J\u0017138Q^:?8k\u001f16\u0005F\u00182";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = ")Z\f2(l_\u001646)\b\n8)8A\u0010:z A\u001c/;>Q^()-J\u0017138Q^:?8b0\u0014\u0019#L\u001b\u000b?>[\u001724";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = ")Z\f2(l_\u001646)\b\n8)8A\u0010:z A\u001c/;>Q^()-J\u0017138Q^)??\\248>I\f$\u000f?I\u001c1?";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "&F\u0017\u000b?>[\u001724v\b";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = ")Z\f2(v\b\n8)8\b\u001f/(-Q^95)[\u0010z.lF\u0011)z!I\n>2";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "~\u0006Ooty\u001dN";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "%[248>I\f$\u000f?I\u001c1?v\b*//)";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = ";@\u001f))-X\u000e";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "9F\u001f?6)\b\n2z9[\u001b}6#I\u001a8>lD\u0017?(-Z\u00178)w\b\n/#%F\u0019}3\"[\n<6 \b\u001a4()K\n}<>G\u0013};<C";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "%F\r); D\u001f)3#F^4)lK\u0011/(9X\nfz\"I\n4,)\b\u001248>I\f4??\b\u001f/?lE\u0017.)%F\u0019";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = ">M\r<7<D\u001b";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ":D\u001d";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "%F\r); D^93>M\u001d)z*Z\u00110z-X\u0015}-#Z\u00158>w\b\f8.)[\n44+\b\u001248>I\f$z9[\u001f?3 A\n$";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "9F\u001f?6)\b\n2z9[\u001b}6%J\f<(%M\r}>)[\u000e4.)\b\r(9/M\r.<9D^44?\\\u001f16lL\u0017/?/\\\u0012$z*Z\u00110z-X\u0015";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "/]\f+?~\u001dKlc";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = " A\u001c/;>Q^()-J\u0017138Q^..%D\u0012}8>G\u001584w\b\n5(#_\u00173=l\\\u0011}9#Z\f(*8\b\u00173)8I\u00121;8A\u00113z-K\n4,%\\\u0007";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "\u0019f5\u0013\u0015\u001bf!\u000b\u001f\u001e{7\u0012\u0014".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case v.m /*0*/:
                                i5 = 76;
                                break;
                            case at.g /*1*/:
                                i5 = 40;
                                break;
                            case at.i /*2*/:
                                i5 = 126;
                                break;
                            case at.o /*3*/:
                                i5 = 93;
                                break;
                            default:
                                i5 = 90;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    b = new String(cArr2).intern();
                    a = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = "b[\u0011}3\"\b\n5?lX\u001f>1-O\u001b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a() {
        /*
        r5 = 3;
        r0 = 0;
        r1 = new byte[r5];
        testLibraryUsable(r1);	 Catch:{ UnsatisfiedLinkError -> 0x001d }
        r2 = 3;
        r2 = new byte[r2];	 Catch:{ UnsatisfiedLinkError -> 0x0028 }
        r2 = {31, 41, 59};	 Catch:{ UnsatisfiedLinkError -> 0x0028 }
        r1 = java.util.Arrays.equals(r2, r1);	 Catch:{ UnsatisfiedLinkError -> 0x0028 }
        if (r1 != 0) goto L_0x002a;
    L_0x0013:
        r1 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0028 }
        r2 = 27;
        r1 = r1[r2];	 Catch:{ UnsatisfiedLinkError -> 0x0028 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ UnsatisfiedLinkError -> 0x0028 }
    L_0x001c:
        return r0;
    L_0x001d:
        r1 = move-exception;
        r2 = z;
        r3 = 25;
        r2 = r2[r3];
        com.whatsapp.util.Log.c(r2, r1);
        goto L_0x001c;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r1 = getJNICodeVersion();	 Catch:{ UnsatisfiedLinkError -> 0x007f }
        r2 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        r2.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        r3 = z;	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        r4 = 26;
        r3 = r3[r4];	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        r2 = r2.append(r3);	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        r2 = r2.append(r1);	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        r2 = r2.toString();	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        com.whatsapp.util.Log.i(r2);	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        r2 = z;	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        r3 = 28;
        r2 = r2[r3];	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        r2 = r2.equals(r1);	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        if (r2 != 0) goto L_0x0090;
    L_0x0054:
        r2 = com.whatsapp.App.am;	 Catch:{ UnsatisfiedLinkError -> 0x008a }
        if (r2 == r5) goto L_0x005c;
    L_0x0058:
        r2 = com.whatsapp.App.j;	 Catch:{ UnsatisfiedLinkError -> 0x008c }
        if (r2 != r5) goto L_0x0064;
    L_0x005c:
        r2 = b;	 Catch:{ UnsatisfiedLinkError -> 0x008e }
        r2 = r2.equals(r1);	 Catch:{ UnsatisfiedLinkError -> 0x008e }
        if (r2 != 0) goto L_0x0090;
    L_0x0064:
        r2 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x007f }
        r2.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x007f }
        r3 = z;	 Catch:{ UnsatisfiedLinkError -> 0x007f }
        r4 = 22;
        r3 = r3[r4];	 Catch:{ UnsatisfiedLinkError -> 0x007f }
        r2 = r2.append(r3);	 Catch:{ UnsatisfiedLinkError -> 0x007f }
        r1 = r2.append(r1);	 Catch:{ UnsatisfiedLinkError -> 0x007f }
        r1 = r1.toString();	 Catch:{ UnsatisfiedLinkError -> 0x007f }
        com.whatsapp.util.Log.w(r1);	 Catch:{ UnsatisfiedLinkError -> 0x007f }
        goto L_0x001c;
    L_0x007f:
        r1 = move-exception;
        r2 = z;
        r3 = 24;
        r2 = r2[r3];
        com.whatsapp.util.Log.c(r2, r1);
        goto L_0x001c;
    L_0x008a:
        r1 = move-exception;
        throw r1;	 Catch:{ UnsatisfiedLinkError -> 0x008c }
    L_0x008c:
        r1 = move-exception;
        throw r1;	 Catch:{ UnsatisfiedLinkError -> 0x008e }
    L_0x008e:
        r1 = move-exception;
        throw r1;	 Catch:{ UnsatisfiedLinkError -> 0x007f }
    L_0x0090:
        com.whatsapp.Voip.getCallInfo();	 Catch:{ UnsatisfiedLinkError -> 0x009f }
        r0 = z;
        r1 = 29;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = 1;
        goto L_0x001c;
    L_0x009f:
        r1 = move-exception;
        r2 = z;
        r3 = 23;
        r2 = r2[r3];
        com.whatsapp.util.Log.c(r2, r1);
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.WhatsAppLibLoader.a():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r11, java.lang.String[] r12) {
        /*
        r3 = 0;
        r4 = com.whatsapp.util.Log.h;
        r0 = android.os.Build.CPU_ABI;
        r1 = z;
        r2 = 19;
        r1 = r1[r2];
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x0019;
    L_0x0011:
        r0 = z;
        r1 = 14;
        r0 = r0[r1];
        if (r4 == 0) goto L_0x007f;
    L_0x0019:
        r0 = android.os.Build.CPU_ABI;	 Catch:{ IOException -> 0x0079 }
        r1 = z;	 Catch:{ IOException -> 0x0079 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0079 }
        r0 = r0.startsWith(r1);	 Catch:{ IOException -> 0x0079 }
        if (r0 == 0) goto L_0x002d;
    L_0x0026:
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        if (r4 == 0) goto L_0x007f;
    L_0x002d:
        r0 = android.os.Build.CPU_ABI;	 Catch:{ IOException -> 0x007b }
        r1 = z;	 Catch:{ IOException -> 0x007b }
        r2 = 15;
        r1 = r1[r2];	 Catch:{ IOException -> 0x007b }
        r0 = r0.startsWith(r1);	 Catch:{ IOException -> 0x007b }
        if (r0 == 0) goto L_0x0042;
    L_0x003b:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        if (r4 == 0) goto L_0x007f;
    L_0x0042:
        r0 = android.os.Build.CPU_ABI;	 Catch:{ IOException -> 0x007d }
        r1 = z;	 Catch:{ IOException -> 0x007d }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ IOException -> 0x007d }
        r0 = r0.startsWith(r1);	 Catch:{ IOException -> 0x007d }
        if (r0 == 0) goto L_0x0058;
    L_0x0050:
        r0 = z;
        r1 = 18;
        r0 = r0[r1];
        if (r4 == 0) goto L_0x007f;
    L_0x0058:
        r0 = new java.lang.UnsatisfiedLinkError;	 Catch:{ IOException -> 0x0077 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0077 }
        r1.<init>();	 Catch:{ IOException -> 0x0077 }
        r2 = z;	 Catch:{ IOException -> 0x0077 }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0077 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0077 }
        r2 = android.os.Build.CPU_ABI;	 Catch:{ IOException -> 0x0077 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0077 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0077 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0077 }
        throw r0;	 Catch:{ IOException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r2 = 0;
        r1 = new java.util.zip.ZipFile;	 Catch:{ IOException -> 0x01a4, all -> 0x01a1 }
        r5 = new android.content.ContextWrapper;	 Catch:{ IOException -> 0x01a4, all -> 0x01a1 }
        r5.<init>(r11);	 Catch:{ IOException -> 0x01a4, all -> 0x01a1 }
        r5 = r5.getPackageCodePath();	 Catch:{ IOException -> 0x01a4, all -> 0x01a1 }
        r1.<init>(r5);	 Catch:{ IOException -> 0x01a4, all -> 0x01a1 }
        r5 = r12.length;	 Catch:{ IOException -> 0x0126 }
        r2 = r3;
    L_0x0090:
        if (r2 >= r5) goto L_0x0171;
    L_0x0092:
        r3 = r12[r2];	 Catch:{ IOException -> 0x0126 }
        r6 = new java.io.File;	 Catch:{ IOException -> 0x0126 }
        r7 = r11.getFilesDir();	 Catch:{ IOException -> 0x0126 }
        r8 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0126 }
        r8.<init>();	 Catch:{ IOException -> 0x0126 }
        r9 = z;	 Catch:{ IOException -> 0x0126 }
        r10 = 5;
        r9 = r9[r10];	 Catch:{ IOException -> 0x0126 }
        r8 = r8.append(r9);	 Catch:{ IOException -> 0x0126 }
        r8 = r8.append(r3);	 Catch:{ IOException -> 0x0126 }
        r9 = z;	 Catch:{ IOException -> 0x0126 }
        r10 = 12;
        r9 = r9[r10];	 Catch:{ IOException -> 0x0126 }
        r8 = r8.append(r9);	 Catch:{ IOException -> 0x0126 }
        r8 = r8.toString();	 Catch:{ IOException -> 0x0126 }
        r6.<init>(r7, r8);	 Catch:{ IOException -> 0x0126 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0126 }
        r7.<init>();	 Catch:{ IOException -> 0x0126 }
        r8 = z;	 Catch:{ IOException -> 0x0126 }
        r9 = 6;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0126 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0126 }
        r7 = r7.append(r0);	 Catch:{ IOException -> 0x0126 }
        r8 = z;	 Catch:{ IOException -> 0x0126 }
        r9 = 8;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0126 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0126 }
        r7 = r7.append(r3);	 Catch:{ IOException -> 0x0126 }
        r8 = z;	 Catch:{ IOException -> 0x0126 }
        r9 = 21;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0126 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0126 }
        r7 = r7.toString();	 Catch:{ IOException -> 0x0126 }
        r7 = r1.getEntry(r7);	 Catch:{ IOException -> 0x0126 }
        if (r7 != 0) goto L_0x0143;
    L_0x00f1:
        r2 = new java.lang.UnsatisfiedLinkError;	 Catch:{ IOException -> 0x0124 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0124 }
        r4.<init>();	 Catch:{ IOException -> 0x0124 }
        r5 = z;	 Catch:{ IOException -> 0x0124 }
        r6 = 9;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0124 }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x0124 }
        r0 = r4.append(r0);	 Catch:{ IOException -> 0x0124 }
        r4 = z;	 Catch:{ IOException -> 0x0124 }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0124 }
        r0 = r0.append(r4);	 Catch:{ IOException -> 0x0124 }
        r0 = r0.append(r3);	 Catch:{ IOException -> 0x0124 }
        r3 = z;	 Catch:{ IOException -> 0x0124 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0124 }
        r0 = r0.append(r3);	 Catch:{ IOException -> 0x0124 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0124 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0124 }
        throw r2;	 Catch:{ IOException -> 0x0124 }
    L_0x0124:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0126 }
    L_0x0126:
        r0 = move-exception;
    L_0x0127:
        r2 = z;	 Catch:{ all -> 0x013c }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ all -> 0x013c }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ all -> 0x013c }
        r0 = new java.lang.UnsatisfiedLinkError;	 Catch:{ all -> 0x013c }
        r2 = z;	 Catch:{ all -> 0x013c }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ all -> 0x013c }
        r0.<init>(r2);	 Catch:{ all -> 0x013c }
        throw r0;	 Catch:{ all -> 0x013c }
    L_0x013c:
        r0 = move-exception;
    L_0x013d:
        if (r1 == 0) goto L_0x0142;
    L_0x013f:
        r1.close();	 Catch:{ IOException -> 0x0196 }
    L_0x0142:
        throw r0;
    L_0x0143:
        r3 = r1.getInputStream(r7);	 Catch:{ IOException -> 0x0126 }
        r7 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0126 }
        r7.<init>(r6);	 Catch:{ IOException -> 0x0126 }
        r8 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r8 = new byte[r8];	 Catch:{ IOException -> 0x0126 }
    L_0x0150:
        r9 = r3.read(r8);	 Catch:{ all -> 0x017b }
        if (r9 <= 0) goto L_0x015c;
    L_0x0156:
        r10 = 0;
        r7.write(r8, r10, r9);	 Catch:{ all -> 0x017b }
        if (r4 == 0) goto L_0x0150;
    L_0x015c:
        if (r3 == 0) goto L_0x0161;
    L_0x015e:
        r3.close();	 Catch:{ IOException -> 0x0177 }
    L_0x0161:
        if (r7 == 0) goto L_0x0166;
    L_0x0163:
        r7.close();	 Catch:{ IOException -> 0x0179 }
    L_0x0166:
        r3 = r6.getAbsolutePath();	 Catch:{ IOException -> 0x0126 }
        java.lang.System.load(r3);	 Catch:{ IOException -> 0x0126 }
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x0090;
    L_0x0171:
        if (r1 == 0) goto L_0x0176;
    L_0x0173:
        r1.close();	 Catch:{ IOException -> 0x018b }
    L_0x0176:
        return;
    L_0x0177:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0126 }
    L_0x0179:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0126 }
    L_0x017b:
        r0 = move-exception;
        if (r3 == 0) goto L_0x0181;
    L_0x017e:
        r3.close();	 Catch:{ IOException -> 0x0187 }
    L_0x0181:
        if (r7 == 0) goto L_0x0186;
    L_0x0183:
        r7.close();	 Catch:{ IOException -> 0x0189 }
    L_0x0186:
        throw r0;	 Catch:{ IOException -> 0x0126 }
    L_0x0187:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0126 }
    L_0x0189:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0126 }
    L_0x018b:
        r0 = move-exception;
        r1 = z;
        r2 = 13;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0176;
    L_0x0196:
        r1 = move-exception;
        r2 = z;
        r3 = 17;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x0142;
    L_0x01a1:
        r0 = move-exception;
        r1 = r2;
        goto L_0x013d;
    L_0x01a4:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0127;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.WhatsAppLibLoader.a(android.content.Context, java.lang.String[]):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r7) {
        /*
        r0 = 1;
        r1 = 0;
        r2 = com.whatsapp.util.WhatsAppLibLoader.class;
        monitor-enter(r2);
        r3 = a;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        if (r3 != 0) goto L_0x009c;
    L_0x0009:
        r3 = java.lang.Boolean.FALSE;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        a = r3;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r3 = 4;
        r3 = new java.lang.String[r3];	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r4 = 0;
        r5 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r6 = 34;
        r5 = r5[r6];	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r3[r4] = r5;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r4 = 1;
        r5 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r6 = 33;
        r5 = r5[r6];	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r3[r4] = r5;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r4 = 2;
        r5 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r6 = 30;
        r5 = r5[r6];	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r3[r4] = r5;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r4 = 3;
        r5 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r6 = 37;
        r5 = r5[r6];	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        r3[r4] = r5;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
        b(r7, r3);	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        r4 = java.lang.Boolean.TRUE;	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        a = r4;	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        r4 = a();	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        if (r4 != 0) goto L_0x0098;
    L_0x0041:
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        r5 = 31;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        a(r7, r3);	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        r3 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        r4 = 35;
        r3 = r3[r4];	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        r3 = a();	 Catch:{ UnsatisfiedLinkError -> 0x0093 }
        if (r3 != 0) goto L_0x0098;
    L_0x005c:
        r0 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0071 }
        r3 = 38;
        r0 = r0[r3];	 Catch:{ UnsatisfiedLinkError -> 0x0071 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ UnsatisfiedLinkError -> 0x0071 }
        r0 = new java.lang.UnsatisfiedLinkError;	 Catch:{ UnsatisfiedLinkError -> 0x0071 }
        r3 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0071 }
        r4 = 36;
        r3 = r3[r4];	 Catch:{ UnsatisfiedLinkError -> 0x0071 }
        r0.<init>(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0071 }
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        r3 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r4 = 32;
        r3 = r3[r4];	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        if (r7 == 0) goto L_0x0090;
    L_0x007f:
        r0 = new android.os.Handler;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3 = android.os.Looper.getMainLooper();	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r0.<init>(r3);	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3 = new com.whatsapp.util.bc;	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r3.<init>(r7);	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
        r0.post(r3);	 Catch:{ UnsatisfiedLinkError -> 0x00ae }
    L_0x0090:
        r0 = r1;
    L_0x0091:
        monitor-exit(r2);
        return r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x0071 }
    L_0x0095:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0098:
        r3 = com.whatsapp.util.Log.h;	 Catch:{ UnsatisfiedLinkError -> 0x00ac }
        if (r3 == 0) goto L_0x0091;
    L_0x009c:
        r3 = a;	 Catch:{ UnsatisfiedLinkError -> 0x00ac }
        r3 = r3.booleanValue();	 Catch:{ UnsatisfiedLinkError -> 0x00ac }
        if (r3 != 0) goto L_0x0091;
    L_0x00a4:
        r0 = new java.lang.UnsatisfiedLinkError;	 Catch:{ UnsatisfiedLinkError -> 0x00aa }
        r0.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x00aa }
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x00aa }
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x0073 }
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x00aa }
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0095 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.WhatsAppLibLoader.a(android.content.Context):boolean");
    }

    private static void b(Context context, String[] strArr) {
        int i = Log.h;
        try {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                System.loadLibrary(strArr[i2]);
                i2++;
                if (i != 0) {
                    return;
                }
            }
        } catch (Throwable e) {
            Log.c(z[0], e);
            a(context, strArr);
        }
    }
}
