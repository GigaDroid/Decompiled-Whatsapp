package com.whatsapp.util;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPOutputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class a1 {
    private static final String[] z;

    static {
        String[] strArr = new String[20];
        String str = "%_ \u000547_ \u0013n Y<\u0019'*Z)O'\"_ \u0005%cB#@\",F5@";
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 54;
                        break;
                    case at.i /*2*/:
                        i3 = 76;
                        break;
                    case at.o /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 65;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = " D-\u0013)/Y+";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "j\u0016/\u0001/-Y8@#&\u0016 \u000520\u00168\b -\u0016.\u0015'%S>3(9Sd";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "cZ)\u000e&7^v";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "c[-\u0018\u0003:B)\u0013{";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "%_ \u0005l6B%\f2lB>\u0015/ W8\u0005l%D#\rl&X(@\",[<\u0012$0E)\u0004\u0007*Z)Z";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "cT9\u0006'&D\u001f\t;&\fl";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "%_ \u0005l6B%\f2lB>\u0015/ W8\u0005l%D#\rl&X(O5,Ya\u0013,\"Z M/,\u001b8\u00124-U-\u0014(,Xa\u0012$2C%\u0012$'";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ".W4\"87S?H";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "6X/\u000f,3D)\u00132&Ra\u00033\"E$\f.$";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "1A";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "%_ \u0005l6B%\f2lB>\u0015/ W8\u0005l%D#\rl&X(@";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = " Y!\u00103&E?O\"/Y?\u0005n%W%\fa";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = " Y!\u00103&E?O'\"_ @";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = " Y!\u00103&E?O'\"_ ";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "mQ6";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = " Y!\u00103&E?O\"/Y?\u0005n%W%\fa";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = " Y!\u00103&E?O\"/Y?\u0005n%W%\fa";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "0Y9\u0012\"&";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "%_ \u0005l6B%\f2lB>\u0015/ W8\u0005l%D#\rl&X(";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static String b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (str.lastIndexOf(File.separator) > lastIndexOf) {
            lastIndexOf = -1;
        }
        if (lastIndexOf < 0) {
            return "";
        }
        try {
            return str.substring(lastIndexOf + 1);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static String b(File file) {
        return b(file.getAbsolutePath());
    }

    public static java.io.File a(@android.support.annotation.NonNull java.io.File r10, int r11, int r12) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.util.a1.a(java.io.File, int, int):java.io.File. bs: [B:11:0x0053, B:22:0x0070]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r1 = 0;
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0047 }
        r0.<init>();	 Catch:{ IOException -> 0x0047 }
        r2 = z;	 Catch:{ IOException -> 0x0047 }
        r3 = 6;	 Catch:{ IOException -> 0x0047 }
        r2 = r2[r3];	 Catch:{ IOException -> 0x0047 }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x0047 }
        r0 = r0.append(r10);	 Catch:{ IOException -> 0x0047 }
        r2 = z;	 Catch:{ IOException -> 0x0047 }
        r3 = 5;	 Catch:{ IOException -> 0x0047 }
        r2 = r2[r3];	 Catch:{ IOException -> 0x0047 }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x0047 }
        r0 = r0.append(r11);	 Catch:{ IOException -> 0x0047 }
        r2 = z;	 Catch:{ IOException -> 0x0047 }
        r3 = 7;	 Catch:{ IOException -> 0x0047 }
        r2 = r2[r3];	 Catch:{ IOException -> 0x0047 }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x0047 }
        r0 = r0.append(r12);	 Catch:{ IOException -> 0x0047 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0047 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0047 }
        r2 = r10.length();	 Catch:{ IOException -> 0x0047 }
        r4 = (long) r11;	 Catch:{ IOException -> 0x0047 }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ IOException -> 0x0047 }
        if (r0 > 0) goto L_0x0049;	 Catch:{ IOException -> 0x0047 }
    L_0x003d:
        r0 = z;	 Catch:{ IOException -> 0x0047 }
        r1 = 8;	 Catch:{ IOException -> 0x0047 }
        r0 = r0[r1];	 Catch:{ IOException -> 0x0047 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0047 }
    L_0x0046:
        return r10;
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        if (r12 > 0) goto L_0x004d;
    L_0x004b:
        r12 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
    L_0x004d:
        r0 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        if (r11 != 0) goto L_0x006e;
    L_0x0053:
        r5 = z;	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
        r6 = 2;	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
        r5 = r5[r6];	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
        r6 = 0;	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
        r10 = java.io.File.createTempFile(r5, r6);	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
        com.whatsapp.util.ao.a(r2);	 Catch:{ IOException -> 0x006c }
        com.whatsapp.util.ao.a(r3);	 Catch:{ IOException -> 0x006c }
        com.whatsapp.util.ao.a(r4);	 Catch:{ IOException -> 0x006c }
        if (r1 == 0) goto L_0x0046;	 Catch:{ IOException -> 0x006c }
    L_0x0068:
        r0.delete();	 Catch:{ IOException -> 0x006c }
        goto L_0x0046;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        if (r11 >= r12) goto L_0x00c0;
    L_0x0070:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r2.<init>();	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r3 = z;	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r4 = 9;	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r3 = r3[r4];	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r2 = r2.append(r11);	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r3 = z;	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r4 = 3;	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r3 = r3[r4];	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r2 = r2.append(r12);	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r3 = ")";	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
        throw r0;	 Catch:{ IOException -> 0x00a1, all -> 0x0164 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
    L_0x00a3:
        r0 = move-exception;
        r2 = r1;
        r3 = r1;
        r4 = r1;
        r5 = r1;
    L_0x00a8:
        r6 = z;	 Catch:{ all -> 0x0182 }
        r7 = 1;	 Catch:{ all -> 0x0182 }
        r6 = r6[r7];	 Catch:{ all -> 0x0182 }
        com.whatsapp.util.Log.b(r6, r0);	 Catch:{ all -> 0x0182 }
        com.whatsapp.util.ao.a(r4);	 Catch:{ IOException -> 0x0162 }
        com.whatsapp.util.ao.a(r3);	 Catch:{ IOException -> 0x0162 }
        com.whatsapp.util.ao.a(r2);	 Catch:{ IOException -> 0x0162 }
        if (r5 == 0) goto L_0x00be;	 Catch:{ IOException -> 0x0162 }
    L_0x00bb:
        r5.delete();	 Catch:{ IOException -> 0x0162 }
    L_0x00be:
        r10 = r1;
        goto L_0x0046;
    L_0x00c0:
        r6 = new byte[r12];	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
        r4 = new java.util.zip.GZIPInputStream;	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
        r0 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
        r0.<init>(r10);	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
        r4.<init>(r0, r12);	 Catch:{ IOException -> 0x00a3, all -> 0x0164 }
        r0 = z;	 Catch:{ IOException -> 0x0185, all -> 0x0179 }
        r2 = 10;	 Catch:{ IOException -> 0x0185, all -> 0x0179 }
        r0 = r0[r2];	 Catch:{ IOException -> 0x0185, all -> 0x0179 }
        r2 = 0;	 Catch:{ IOException -> 0x0185, all -> 0x0179 }
        r5 = java.io.File.createTempFile(r0, r2);	 Catch:{ IOException -> 0x0185, all -> 0x0179 }
        r2 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x018b, all -> 0x017d }
        r0 = z;	 Catch:{ IOException -> 0x018b, all -> 0x017d }
        r3 = 11;	 Catch:{ IOException -> 0x018b, all -> 0x017d }
        r0 = r0[r3];	 Catch:{ IOException -> 0x018b, all -> 0x017d }
        r2.<init>(r5, r0);	 Catch:{ IOException -> 0x018b, all -> 0x017d }
    L_0x00e2:
        r7 = a(r4, r2, r11, r6);	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r8 = 0;	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r2.seek(r8);	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        if (r7 == r11) goto L_0x00e2;	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
    L_0x00ed:
        r4.close();	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r0 = r2.getFD();	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r0.sync();	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r0 = new java.io.File;	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r3 = com.whatsapp.App.J;	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r3 = r3.b();	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r8 = r10.getName();	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r0.<init>(r3, r8);	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r3 = new java.util.zip.GZIPOutputStream;	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r8 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r8.<init>(r0);	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r3.<init>(r8);	 Catch:{ IOException -> 0x0190, all -> 0x0180 }
        r8 = (long) r7;
        r2.seek(r8);	 Catch:{ IOException -> 0x0194 }
        r8 = r11 - r7;	 Catch:{ IOException -> 0x0194 }
        a(r3, r2, r8, r6);	 Catch:{ IOException -> 0x0194 }
        r8 = 0;	 Catch:{ IOException -> 0x0194 }
        r2.seek(r8);	 Catch:{ IOException -> 0x0194 }
        a(r3, r2, r7, r6);	 Catch:{ IOException -> 0x0194 }
        r3.close();	 Catch:{ IOException -> 0x0194 }
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0194 }
        r6.<init>();	 Catch:{ IOException -> 0x0194 }
        r7 = z;	 Catch:{ IOException -> 0x0194 }
        r8 = 12;	 Catch:{ IOException -> 0x0194 }
        r7 = r7[r8];	 Catch:{ IOException -> 0x0194 }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x0194 }
        r6 = r6.append(r0);	 Catch:{ IOException -> 0x0194 }
        r7 = z;	 Catch:{ IOException -> 0x0194 }
        r8 = 4;	 Catch:{ IOException -> 0x0194 }
        r7 = r7[r8];	 Catch:{ IOException -> 0x0194 }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x0194 }
        r8 = r0.length();	 Catch:{ IOException -> 0x0194 }
        r6 = r6.append(r8);	 Catch:{ IOException -> 0x0194 }
        r6 = r6.toString();	 Catch:{ IOException -> 0x0194 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IOException -> 0x0194 }
        com.whatsapp.util.ao.a(r4);	 Catch:{ IOException -> 0x0160 }
        com.whatsapp.util.ao.a(r3);	 Catch:{ IOException -> 0x0160 }
        com.whatsapp.util.ao.a(r2);	 Catch:{ IOException -> 0x0160 }
        if (r5 == 0) goto L_0x015d;	 Catch:{ IOException -> 0x0160 }
    L_0x015a:
        r5.delete();	 Catch:{ IOException -> 0x0160 }
    L_0x015d:
        r10 = r0;
        goto L_0x0046;
    L_0x0160:
        r0 = move-exception;
        throw r0;
    L_0x0162:
        r0 = move-exception;
        throw r0;
    L_0x0164:
        r0 = move-exception;
        r2 = r1;
        r4 = r1;
        r5 = r1;
    L_0x0168:
        com.whatsapp.util.ao.a(r4);	 Catch:{ IOException -> 0x0177 }
        com.whatsapp.util.ao.a(r1);	 Catch:{ IOException -> 0x0177 }
        com.whatsapp.util.ao.a(r2);	 Catch:{ IOException -> 0x0177 }
        if (r5 == 0) goto L_0x0176;	 Catch:{ IOException -> 0x0177 }
    L_0x0173:
        r5.delete();	 Catch:{ IOException -> 0x0177 }
    L_0x0176:
        throw r0;
    L_0x0177:
        r0 = move-exception;
        throw r0;
    L_0x0179:
        r0 = move-exception;
        r2 = r1;
        r5 = r1;
        goto L_0x0168;
    L_0x017d:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0168;
    L_0x0180:
        r0 = move-exception;
        goto L_0x0168;
    L_0x0182:
        r0 = move-exception;
        r1 = r3;
        goto L_0x0168;
    L_0x0185:
        r0 = move-exception;
        r2 = r1;
        r3 = r1;
        r5 = r1;
        goto L_0x00a8;
    L_0x018b:
        r0 = move-exception;
        r2 = r1;
        r3 = r1;
        goto L_0x00a8;
    L_0x0190:
        r0 = move-exception;
        r3 = r1;
        goto L_0x00a8;
    L_0x0194:
        r0 = move-exception;
        goto L_0x00a8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.a1.a(java.io.File, int, int):java.io.File");
    }

    public static File a(File file) {
        GZIPOutputStream gZIPOutputStream;
        BufferedInputStream bufferedInputStream;
        FileNotFoundException e;
        File file2;
        Throwable th;
        int i = Log.h;
        if (file == null) {
            return null;
        }
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            name = z[19];
        }
        File file3 = new File(App.z().getFilesDir(), name + z[16]);
        if (!file3.exists() || file3.delete()) {
            try {
                gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file3));
                try {
                    byte[] bArr = new byte[32768];
                    if (file.length() > 0) {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            int read = bufferedInputStream.read(bArr, 0, bArr.length);
                            while (read != -1) {
                                gZIPOutputStream.write(bArr, 0, read);
                                read = bufferedInputStream.read(bArr, 0, bArr.length);
                                if (i != 0) {
                                    break;
                                }
                            }
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            try {
                                Log.e(z[14] + e.toString());
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e3) {
                                        throw e3;
                                    } catch (IOException e32) {
                                        Log.e(z[17] + e32.toString());
                                        file2 = null;
                                    }
                                }
                                if (gZIPOutputStream != null) {
                                    gZIPOutputStream.close();
                                }
                                file2 = file3;
                                return file2;
                            } catch (Throwable th2) {
                                th = th2;
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e4) {
                                        throw e4;
                                    } catch (IOException e42) {
                                        throw e42;
                                    } catch (IOException e422) {
                                        Log.e(z[13] + e422.toString());
                                    }
                                }
                                if (gZIPOutputStream != null) {
                                    gZIPOutputStream.close();
                                }
                                throw th;
                            }
                        }
                    }
                    bufferedInputStream = null;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e322) {
                            throw e322;
                        } catch (IOException e3222) {
                            throw e3222;
                        } catch (IOException e32222) {
                            Log.e(z[18] + e32222.toString());
                            file2 = null;
                        }
                    }
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    file2 = file3;
                } catch (FileNotFoundException e5) {
                    e = e5;
                    bufferedInputStream = null;
                    Log.e(z[14] + e.toString());
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    file2 = file3;
                    return file2;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException e6) {
                e = e6;
                gZIPOutputStream = null;
                bufferedInputStream = null;
                Log.e(z[14] + e.toString());
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                file2 = file3;
                return file2;
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
                bufferedInputStream = null;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                throw th;
            }
            return file2;
        }
        try {
            Log.e(z[15]);
            return null;
        } catch (IOException e322222) {
            throw e322222;
        }
    }

    private static int a(@NonNull OutputStream outputStream, @NonNull RandomAccessFile randomAccessFile, int i, @NonNull byte[] bArr) {
        int i2 = Log.h;
        int i3 = 0;
        while (i3 < i) {
            int read = randomAccessFile.read(bArr, 0, Math.min(bArr.length, i - i3));
            if (read <= 0 && i2 == 0) {
                break;
            }
            outputStream.write(bArr, 0, read);
            i3 += read;
            if (i2 != 0) {
                break;
            }
        }
        return i3;
    }

    private static int a(@NonNull InputStream inputStream, @NonNull RandomAccessFile randomAccessFile, int i, @NonNull byte[] bArr) {
        int i2 = Log.h;
        int i3 = 0;
        while (i3 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i3));
            if (read <= 0 && i2 == 0) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i3 += read;
            if (i2 != 0) {
                break;
            }
        }
        return i3;
    }

    public static boolean a(@NonNull File file, @NonNull File file2) {
        Closeable qVar;
        Object e;
        Throwable th;
        Closeable closeable = null;
        int i = Log.h;
        try {
            Closeable fileInputStream = new FileInputStream(file);
            try {
                qVar = new q(App.J, file2);
                try {
                    byte[] bArr = new byte[131072];
                    do {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        qVar.write(bArr, 0, read);
                    } while (i == 0);
                    ao.a(fileInputStream);
                    ao.a(qVar);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    closeable = fileInputStream;
                    try {
                        Log.e(z[0] + e);
                        ao.a(closeable);
                        ao.a(qVar);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        ao.a(closeable);
                        ao.a(qVar);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    closeable = fileInputStream;
                    ao.a(closeable);
                    ao.a(qVar);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                qVar = null;
                closeable = fileInputStream;
                Log.e(z[0] + e);
                ao.a(closeable);
                ao.a(qVar);
                return false;
            } catch (Throwable th4) {
                th = th4;
                qVar = null;
                closeable = fileInputStream;
                ao.a(closeable);
                ao.a(qVar);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            qVar = null;
            Log.e(z[0] + e);
            ao.a(closeable);
            ao.a(qVar);
            return false;
        } catch (Throwable th5) {
            th = th5;
            qVar = null;
            ao.a(closeable);
            ao.a(qVar);
            throw th;
        }
    }

    public static String a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        if (lastIndexOf2 > lastIndexOf) {
            lastIndexOf = -1;
        }
        if (lastIndexOf2 < 0) {
            lastIndexOf2 = 0;
        }
        if (lastIndexOf < 0) {
            return str.substring(lastIndexOf2);
        }
        try {
            return str.substring(lastIndexOf2, lastIndexOf);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
