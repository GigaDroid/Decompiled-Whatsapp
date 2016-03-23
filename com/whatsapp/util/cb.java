package com.whatsapp.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfRenderer;
import android.graphics.pdf.PdfRenderer.Page;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class cb {
    private static final Object a;
    private static final String[] z;

    public static Drawable a(Context context, File file) {
        String str;
        if (file == null) {
            try {
                str = "";
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        str = a1.b(file);
        return a(context, ag.f(str), str);
    }

    private static byte[] a(Bitmap bitmap) {
        byte[] toByteArray;
        int i = 80;
        do {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(CompressFormat.JPEG, i, byteArrayOutputStream);
            toByteArray = byteArrayOutputStream.toByteArray();
            Log.i(z[59] + toByteArray.length + " " + i);
            i -= 5;
            if (toByteArray.length <= 20480) {
                break;
            }
        } while (i > 0);
        return toByteArray;
    }

    private static int d(File file) {
        Throwable e;
        Throwable th;
        int i = 0;
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(file.getAbsolutePath());
            try {
                i = a(zipFile, z[12]);
            } catch (Throwable e2) {
                try {
                    Log.a(z[15], e2);
                } catch (IOException e3) {
                    e2 = e3;
                    try {
                        Log.a(z[16], e2);
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (Throwable e22) {
                                Log.a(z[17], e22);
                            }
                        }
                        return i;
                    } catch (Throwable th2) {
                        th = th2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (Throwable e222) {
                                Log.a(z[14], e222);
                            } catch (IllegalArgumentException e4) {
                                throw e4;
                            }
                        }
                        throw th;
                    }
                }
            }
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (Throwable e2222) {
                    Log.a(z[13], e2222);
                } catch (IllegalArgumentException e42) {
                    throw e42;
                }
            }
        } catch (IOException e5) {
            e2222 = e5;
            zipFile = null;
            Log.a(z[16], e2222);
            if (zipFile != null) {
                zipFile.close();
            }
            return i;
        } catch (Throwable th3) {
            th = th3;
            zipFile = null;
            if (zipFile != null) {
                zipFile.close();
            }
            throw th;
        }
        return i;
    }

    private static int a(File file) {
        Throwable e;
        int i = Log.h;
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(file.getAbsolutePath());
            int i2 = 0;
            do {
                try {
                    if (zipFile.getEntry(z[44] + (i2 + 1) + z[46]) == null) {
                        break;
                    }
                    i2++;
                } catch (IOException e2) {
                    e = e2;
                }
            } while (i == 0);
            if (zipFile == null) {
                return i2;
            }
            try {
                zipFile.close();
                return i2;
            } catch (Throwable e3) {
                Log.a(z[45], e3);
                return i2;
            } catch (IllegalArgumentException e4) {
                throw e4;
            }
        } catch (IOException e5) {
            e = e5;
            zipFile = null;
            try {
                Log.a(z[47], e);
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Throwable e6) {
                        Log.a(z[48], e6);
                    }
                }
                return 0;
            } catch (Throwable th) {
                e6 = th;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Throwable e32) {
                        Log.a(z[49], e32);
                    } catch (IllegalArgumentException e42) {
                        throw e42;
                    }
                }
                throw e6;
            }
        } catch (Throwable th2) {
            e6 = th2;
            zipFile = null;
            if (zipFile != null) {
                zipFile.close();
            }
            throw e6;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r12) {
        /*
        r2 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r0 = 0;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ FileNotFoundException -> 0x000a }
        r3 = 21;
        if (r1 >= r3) goto L_0x000c;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r4 = a;
        monitor-enter(r4);
        r1 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x0022 }
        r1.<init>(r12);	 Catch:{ FileNotFoundException -> 0x0022 }
        r3 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r1 = android.os.ParcelFileDescriptor.open(r1, r3);	 Catch:{ FileNotFoundException -> 0x0022 }
        r3 = r1;
    L_0x001b:
        if (r3 != 0) goto L_0x0028;
    L_0x001d:
        monitor-exit(r4);	 Catch:{ all -> 0x001f }
        goto L_0x0009;
    L_0x001f:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x001f }
        throw r0;
    L_0x0022:
        r1 = move-exception;
        com.whatsapp.util.Log.c(r1);	 Catch:{ all -> 0x001f }
        r3 = r0;
        goto L_0x001b;
    L_0x0028:
        r1 = new android.graphics.pdf.PdfRenderer;	 Catch:{ IOException -> 0x0034 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x0034 }
    L_0x002d:
        if (r1 != 0) goto L_0x003c;
    L_0x002f:
        r3.close();	 Catch:{ IOException -> 0x00c4, IllegalArgumentException -> 0x003a }
    L_0x0032:
        monitor-exit(r4);	 Catch:{ all -> 0x001f }
        goto L_0x0009;
    L_0x0034:
        r1 = move-exception;
        com.whatsapp.util.Log.c(r1);	 Catch:{ all -> 0x001f }
        r1 = r0;
        goto L_0x002d;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001f }
    L_0x003c:
        r5 = r1.getPageCount();	 Catch:{ all -> 0x001f }
        if (r5 <= 0) goto L_0x00bb;
    L_0x0042:
        r0 = 0;
        r5 = r1.openPage(r0);	 Catch:{ all -> 0x001f }
        r6 = r5.getWidth();	 Catch:{ all -> 0x001f }
        r7 = r5.getHeight();	 Catch:{ all -> 0x001f }
        if (r6 <= r7) goto L_0x0058;
    L_0x0051:
        r0 = r7 * 480;
        r0 = r0 / r6;
        r8 = com.whatsapp.util.Log.h;	 Catch:{ all -> 0x001f }
        if (r8 == 0) goto L_0x005e;
    L_0x0058:
        r0 = r6 * 480;
        r0 = r0 / r7;
        r11 = r2;
        r2 = r0;
        r0 = r11;
    L_0x005e:
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x001f }
        r8.<init>();	 Catch:{ all -> 0x001f }
        r9 = z;	 Catch:{ all -> 0x001f }
        r10 = 71;
        r9 = r9[r10];	 Catch:{ all -> 0x001f }
        r8 = r8.append(r9);	 Catch:{ all -> 0x001f }
        r6 = r8.append(r6);	 Catch:{ all -> 0x001f }
        r8 = "x";
        r6 = r6.append(r8);	 Catch:{ all -> 0x001f }
        r6 = r6.append(r7);	 Catch:{ all -> 0x001f }
        r7 = z;	 Catch:{ all -> 0x001f }
        r8 = 70;
        r7 = r7[r8];	 Catch:{ all -> 0x001f }
        r6 = r6.append(r7);	 Catch:{ all -> 0x001f }
        r6 = r6.append(r2);	 Catch:{ all -> 0x001f }
        r7 = "x";
        r6 = r6.append(r7);	 Catch:{ all -> 0x001f }
        r6 = r6.append(r0);	 Catch:{ all -> 0x001f }
        r6 = r6.toString();	 Catch:{ all -> 0x001f }
        com.whatsapp.util.Log.i(r6);	 Catch:{ all -> 0x001f }
        r6 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ all -> 0x001f }
        r2 = android.graphics.Bitmap.createBitmap(r2, r0, r6);	 Catch:{ all -> 0x001f }
        r0 = new android.graphics.Canvas;	 Catch:{ all -> 0x001f }
        r0.<init>(r2);	 Catch:{ all -> 0x001f }
        r6 = -1;
        r0.drawColor(r6);	 Catch:{ all -> 0x001f }
        r0 = 0;
        r6 = 0;
        r7 = 1;
        r5.render(r2, r0, r6, r7);	 Catch:{ all -> 0x001f }
        r0 = a(r2);	 Catch:{ all -> 0x001f }
        r2.recycle();	 Catch:{ all -> 0x001f }
        r5.close();	 Catch:{ all -> 0x001f }
    L_0x00bb:
        r1.close();	 Catch:{ all -> 0x001f }
        r3.close();	 Catch:{ IOException -> 0x00c7 }
    L_0x00c1:
        monitor-exit(r4);	 Catch:{ all -> 0x001f }
        goto L_0x0009;
    L_0x00c4:
        r1 = move-exception;
        goto L_0x0032;
    L_0x00c7:
        r1 = move-exception;
        goto L_0x00c1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cb.a(java.lang.String):byte[]");
    }

    public static String a(co coVar) {
        try {
            if (coVar.c != 9) {
                return "";
            }
            return a(coVar.n, coVar.R);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static String a(InputStream inputStream) {
        Throwable th;
        int i = Log.h;
        Closeable inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(inputStream, z[29]);
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[1024];
                do {
                    int read = inputStreamReader.read(cArr);
                    if (read == -1) {
                        break;
                    }
                    stringWriter.write(cArr, 0, read);
                } while (i == 0);
                String stringWriter2 = stringWriter.toString();
                ao.a(inputStreamReader);
                return stringWriter2;
            } catch (Throwable th2) {
                th = th2;
                ao.a(inputStreamReader);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
            ao.a(inputStreamReader);
            throw th;
        }
    }

    public static Drawable a(Context context, co coVar) {
        String toUpperCase = ag.c(coVar.n).toUpperCase();
        try {
            if (TextUtils.isEmpty(toUpperCase) && !TextUtils.isEmpty(coVar.A)) {
                toUpperCase = a1.b(coVar.A).toUpperCase();
            }
            return a(context, coVar.n, toUpperCase);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable a(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
        r4 = 2130839568; // 0x7f020810 float:1.728415E38 double:1.0527746273E-314;
        r1 = com.whatsapp.util.Log.h;
        if (r6 != 0) goto L_0x001e;
    L_0x0007:
        r1 = new com.whatsapp.avu;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r0 = android.text.TextUtils.isEmpty(r7);	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r0 == 0) goto L_0x0019;
    L_0x000f:
        r0 = "";
    L_0x0012:
        r1.<init>(r5, r4, r0);
        r0 = r1;
    L_0x0016:
        return r0;
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r0 = r7.toUpperCase();
        goto L_0x0012;
    L_0x001e:
        r0 = -1;
        r2 = r6.hashCode();	 Catch:{ IllegalArgumentException -> 0x00c6 }
        switch(r2) {
            case -1248334925: goto L_0x003e;
            case -1248332507: goto L_0x007a;
            case -1073633483: goto L_0x00a7;
            case -1071817359: goto L_0x00b6;
            case -1050893613: goto L_0x004d;
            case -1004732798: goto L_0x006b;
            case -366307023: goto L_0x0098;
            case 904647503: goto L_0x005c;
            case 1993842850: goto L_0x0089;
            default: goto L_0x0026;
        };
    L_0x0026:
        switch(r0) {
            case 0: goto L_0x00d8;
            case 1: goto L_0x00ec;
            case 2: goto L_0x00ec;
            case 3: goto L_0x00ec;
            case 4: goto L_0x00ec;
            case 5: goto L_0x00f5;
            case 6: goto L_0x00f5;
            case 7: goto L_0x00fe;
            case 8: goto L_0x00fe;
            default: goto L_0x0029;
        };
    L_0x0029:
        r1 = new com.whatsapp.avu;	 Catch:{ IllegalArgumentException -> 0x0107 }
        r0 = android.text.TextUtils.isEmpty(r7);	 Catch:{ IllegalArgumentException -> 0x0107 }
        if (r0 == 0) goto L_0x0109;
    L_0x0031:
        r0 = com.whatsapp.util.ag.c(r6);	 Catch:{ IllegalArgumentException -> 0x0107 }
        r0 = r0.toUpperCase();	 Catch:{ IllegalArgumentException -> 0x0107 }
    L_0x0039:
        r1.<init>(r5, r4, r0);
        r0 = r1;
        goto L_0x0016;
    L_0x003e:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r3 = 50;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00c6 }
        if (r2 == 0) goto L_0x0026;
    L_0x004a:
        r0 = 0;
        if (r1 == 0) goto L_0x0026;
    L_0x004d:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3 = 54;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        if (r2 == 0) goto L_0x0026;
    L_0x0059:
        r0 = 1;
        if (r1 == 0) goto L_0x0026;
    L_0x005c:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00ca }
        r3 = 58;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00ca }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00ca }
        if (r2 == 0) goto L_0x0026;
    L_0x0068:
        r0 = 2;
        if (r1 == 0) goto L_0x0026;
    L_0x006b:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r3 = 55;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00cc }
        if (r2 == 0) goto L_0x0026;
    L_0x0077:
        r0 = 3;
        if (r1 == 0) goto L_0x0026;
    L_0x007a:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = 57;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00ce }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00ce }
        if (r2 == 0) goto L_0x0026;
    L_0x0086:
        r0 = 4;
        if (r1 == 0) goto L_0x0026;
    L_0x0089:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r3 = 53;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        if (r2 == 0) goto L_0x0026;
    L_0x0095:
        r0 = 5;
        if (r1 == 0) goto L_0x0026;
    L_0x0098:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d2 }
        r3 = 56;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d2 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00d2 }
        if (r2 == 0) goto L_0x0026;
    L_0x00a4:
        r0 = 6;
        if (r1 == 0) goto L_0x0026;
    L_0x00a7:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r3 = 52;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2 = r6.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00d4 }
        if (r2 == 0) goto L_0x0026;
    L_0x00b3:
        r0 = 7;
        if (r1 == 0) goto L_0x0026;
    L_0x00b6:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        r2 = 51;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00d6 }
        r1 = r6.equals(r1);	 Catch:{ IllegalArgumentException -> 0x00d6 }
        if (r1 == 0) goto L_0x0026;
    L_0x00c2:
        r0 = 8;
        goto L_0x0026;
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        throw r0;
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
    L_0x00d0:
        r0 = move-exception;
        throw r0;
    L_0x00d2:
        r0 = move-exception;
        throw r0;
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r0 = new com.whatsapp.avu;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r1 = 2130839566; // 0x7f02080e float:1.7284146E38 double:1.0527746264E-314;
        r2 = com.whatsapp.util.ag.c(r6);	 Catch:{ IllegalArgumentException -> 0x00ea }
        r2 = r2.toUpperCase();	 Catch:{ IllegalArgumentException -> 0x00ea }
        r0.<init>(r5, r1, r2);	 Catch:{ IllegalArgumentException -> 0x00ea }
        goto L_0x0016;
    L_0x00ea:
        r0 = move-exception;
        throw r0;
    L_0x00ec:
        r0 = 2130839565; // 0x7f02080d float:1.7284144E38 double:1.052774626E-314;
        r0 = android.support.v4.content.ContextCompat.getDrawable(r5, r0);
        goto L_0x0016;
    L_0x00f5:
        r0 = 2130839569; // 0x7f020811 float:1.7284152E38 double:1.052774628E-314;
        r0 = android.support.v4.content.ContextCompat.getDrawable(r5, r0);
        goto L_0x0016;
    L_0x00fe:
        r0 = 2130839567; // 0x7f02080f float:1.7284148E38 double:1.052774627E-314;
        r0 = android.support.v4.content.ContextCompat.getDrawable(r5, r0);
        goto L_0x0016;
    L_0x0107:
        r0 = move-exception;
        throw r0;
    L_0x0109:
        r0 = r7.toUpperCase();
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cb.a(android.content.Context, java.lang.String, java.lang.String):android.graphics.drawable.Drawable");
    }

    public static Bitmap a(String str, int i, int i2) {
        Bitmap bitmap = null;
        try {
            if (VERSION.SDK_INT >= 21) {
                synchronized (a) {
                    ParcelFileDescriptor open;
                    try {
                        open = ParcelFileDescriptor.open(new File(str), 268435456);
                    } catch (IOException e) {
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    } catch (Throwable e3) {
                        Log.c(e3);
                        open = null;
                    }
                    if (open == null) {
                    } else {
                        PdfRenderer pdfRenderer;
                        try {
                            pdfRenderer = new PdfRenderer(open);
                        } catch (Throwable e32) {
                            Log.c(e32);
                            pdfRenderer = null;
                        }
                        if (pdfRenderer == null) {
                            open.close();
                        } else {
                            if (pdfRenderer.getPageCount() > 0) {
                                Page openPage = pdfRenderer.openPage(0);
                                bitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                                new Canvas(bitmap).drawColor(-1);
                                int width = openPage.getWidth();
                                openPage.getHeight();
                                Matrix matrix = new Matrix();
                                float f = (((float) i) * 1.0f) / ((float) width);
                                matrix.setScale(f, f);
                                openPage.render(bitmap, null, matrix, 1);
                                openPage.close();
                            }
                            pdfRenderer.close();
                            try {
                                open.close();
                            } catch (IOException e4) {
                            }
                        }
                    }
                }
            }
            return bitmap;
        } catch (FileNotFoundException e5) {
            throw e5;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.net.Uri r7) {
        /*
        r6 = 0;
        r0 = 2;
        r2 = new java.lang.String[r0];	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        r0 = 0;
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        r3 = 30;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        r2[r0] = r1;	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        r0 = 1;
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        r3 = 31;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        r2[r0] = r1;	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        r0 = com.whatsapp.App.at;	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r7;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        if (r1 == 0) goto L_0x0042;
    L_0x0022:
        r0 = r1.getColumnCount();	 Catch:{ all -> 0x0039 }
        if (r0 <= 0) goto L_0x0044;
    L_0x0028:
        r0 = r1.moveToFirst();	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r0 == 0) goto L_0x0044;
    L_0x002e:
        r0 = 0;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x0039 }
        r1.close();	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
    L_0x0036:
        return r0;
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        r1.close();	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
    L_0x003e:
        r0 = move-exception;
    L_0x003f:
        com.whatsapp.util.Log.b(r0);
    L_0x0042:
        r0 = r6;
        goto L_0x0036;
    L_0x0044:
        r1.close();	 Catch:{ IllegalArgumentException -> 0x003e, UnsupportedOperationException -> 0x0048 }
        goto L_0x0042;
    L_0x0048:
        r0 = move-exception;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cb.a(android.net.Uri):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] b(java.io.File r11) {
        /*
        r8 = 0;
        r10 = 1;
        r9 = new java.util.zip.ZipFile;	 Catch:{ IOException -> 0x00cd, all -> 0x00b4 }
        r0 = r11.getAbsolutePath();	 Catch:{ IOException -> 0x00cd, all -> 0x00b4 }
        r9.<init>(r0);	 Catch:{ IOException -> 0x00cd, all -> 0x00b4 }
        r0 = z;	 Catch:{ IOException -> 0x00d1, all -> 0x00c8 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ IOException -> 0x00d1, all -> 0x00c8 }
        r0 = r9.getEntry(r0);	 Catch:{ IOException -> 0x00d1, all -> 0x00c8 }
        if (r0 == 0) goto L_0x00d9;
    L_0x0016:
        r7 = r9.getInputStream(r0);	 Catch:{ all -> 0x00d6 }
        r0 = com.whatsapp.qi.a(r7);	 Catch:{ all -> 0x0087 }
        r1 = new android.graphics.BitmapFactory$Options;	 Catch:{ all -> 0x0087 }
        r1.<init>();	 Catch:{ all -> 0x0087 }
        r2 = 1;
        r1.inDither = r2;	 Catch:{ all -> 0x0087 }
        r2 = 1;
        r1.inInputShareable = r2;	 Catch:{ all -> 0x0087 }
        r2 = 1;
        r1.inPurgeable = r2;	 Catch:{ all -> 0x0087 }
        r2 = 0;
        r3 = r0.length;	 Catch:{ all -> 0x0087 }
        r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r2, r3, r1);	 Catch:{ all -> 0x0087 }
        if (r0 == 0) goto L_0x0079;
    L_0x0034:
        r1 = r0.getWidth();	 Catch:{ IOException -> 0x0083 }
        if (r1 == 0) goto L_0x0079;
    L_0x003a:
        r1 = r0.getHeight();	 Catch:{ IOException -> 0x0085 }
        if (r1 == 0) goto L_0x0079;
    L_0x0040:
        r1 = r0.getWidth();	 Catch:{ all -> 0x0087 }
        r2 = r0.getHeight();	 Catch:{ all -> 0x0087 }
        r1 = java.lang.Math.max(r1, r2);	 Catch:{ all -> 0x0087 }
        r2 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        if (r1 <= r2) goto L_0x0072;
    L_0x0050:
        r2 = 1139802112; // 0x43f00000 float:480.0 double:5.631370666E-315;
        r1 = (float) r1;	 Catch:{ all -> 0x0087 }
        r1 = r2 / r1;
        r5 = new android.graphics.Matrix;	 Catch:{ all -> 0x0087 }
        r5.<init>();	 Catch:{ all -> 0x0087 }
        r5.setScale(r1, r1);	 Catch:{ all -> 0x0087 }
        r1 = 0;
        r2 = 0;
        r3 = r0.getWidth();	 Catch:{ all -> 0x0087 }
        r4 = r0.getHeight();	 Catch:{ all -> 0x0087 }
        r6 = 1;
        r1 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0087 }
        if (r1 == r0) goto L_0x0072;
    L_0x006e:
        r0.recycle();	 Catch:{ all -> 0x0087 }
        r0 = r1;
    L_0x0072:
        r8 = a(r0);	 Catch:{ all -> 0x0087 }
        r0.recycle();	 Catch:{ all -> 0x0087 }
    L_0x0079:
        com.whatsapp.util.ao.a(r7);	 Catch:{ IOException -> 0x008d, all -> 0x00c8 }
        r0 = r8;
    L_0x007d:
        if (r9 == 0) goto L_0x0082;
    L_0x007f:
        r9.close();	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00a9 }
    L_0x0082:
        return r0;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        r1 = r7;
    L_0x0089:
        com.whatsapp.util.ao.a(r1);	 Catch:{ IOException -> 0x008d, all -> 0x00c8 }
        throw r0;	 Catch:{ IOException -> 0x008d, all -> 0x00c8 }
    L_0x008d:
        r0 = move-exception;
        r1 = r0;
        r0 = r8;
        r8 = r9;
    L_0x0091:
        r2 = z;	 Catch:{ all -> 0x00ca }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ all -> 0x00ca }
        com.whatsapp.util.Log.a(r2, r1);	 Catch:{ all -> 0x00ca }
        if (r8 == 0) goto L_0x0082;
    L_0x009b:
        r8.close();	 Catch:{ IOException -> 0x009f }
        goto L_0x0082;
    L_0x009f:
        r1 = move-exception;
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        com.whatsapp.util.Log.a(r2, r1);
        goto L_0x0082;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r1 = move-exception;
        r2 = z;
        r2 = r2[r10];
        com.whatsapp.util.Log.a(r2, r1);
        goto L_0x0082;
    L_0x00b4:
        r0 = move-exception;
        r9 = r8;
    L_0x00b6:
        if (r9 == 0) goto L_0x00bb;
    L_0x00b8:
        r9.close();	 Catch:{ IOException -> 0x00be, IllegalArgumentException -> 0x00bc }
    L_0x00bb:
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r1 = move-exception;
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        com.whatsapp.util.Log.a(r2, r1);
        goto L_0x00bb;
    L_0x00c8:
        r0 = move-exception;
        goto L_0x00b6;
    L_0x00ca:
        r0 = move-exception;
        r9 = r8;
        goto L_0x00b6;
    L_0x00cd:
        r0 = move-exception;
        r1 = r0;
        r0 = r8;
        goto L_0x0091;
    L_0x00d1:
        r0 = move-exception;
        r1 = r0;
        r0 = r8;
        r8 = r9;
        goto L_0x0091;
    L_0x00d6:
        r0 = move-exception;
        r1 = r8;
        goto L_0x0089;
    L_0x00d9:
        r0 = r8;
        goto L_0x007d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cb.b(java.io.File):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r8, int r9) {
        /*
        r2 = 6;
        r3 = 5;
        r4 = 1;
        r1 = 0;
        r5 = com.whatsapp.util.Log.h;
        if (r8 == 0) goto L_0x000a;
    L_0x0008:
        if (r9 != 0) goto L_0x0010;
    L_0x000a:
        r0 = "";
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = -1;
        r6 = r8.hashCode();	 Catch:{ IllegalArgumentException -> 0x0087 }
        switch(r6) {
            case -1248334925: goto L_0x0022;
            case -1073633483: goto L_0x006a;
            case -1071817359: goto L_0x0079;
            case -1050893613: goto L_0x0030;
            case -366307023: goto L_0x005b;
            case 904647503: goto L_0x003e;
            case 1993842850: goto L_0x004d;
            default: goto L_0x0018;
        };
    L_0x0018:
        switch(r0) {
            case 0: goto L_0x0095;
            case 1: goto L_0x0095;
            case 2: goto L_0x0095;
            case 3: goto L_0x009a;
            case 4: goto L_0x009a;
            case 5: goto L_0x009f;
            case 6: goto L_0x009f;
            default: goto L_0x001b;
        };
    L_0x001b:
        r0 = r1;
    L_0x001c:
        if (r0 != 0) goto L_0x00a6;
    L_0x001e:
        r0 = "";
        goto L_0x000d;
    L_0x0022:
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r7 = 6;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x0087 }
        r6 = r8.equals(r6);	 Catch:{ IllegalArgumentException -> 0x0087 }
        if (r6 == 0) goto L_0x0018;
    L_0x002d:
        if (r5 == 0) goto L_0x00c0;
    L_0x002f:
        r0 = r1;
    L_0x0030:
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x0089 }
        r7 = 7;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x0089 }
        r6 = r8.equals(r6);	 Catch:{ IllegalArgumentException -> 0x0089 }
        if (r6 == 0) goto L_0x0018;
    L_0x003b:
        if (r5 == 0) goto L_0x00bd;
    L_0x003d:
        r0 = r4;
    L_0x003e:
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x008b }
        r7 = 10;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x008b }
        r6 = r8.equals(r6);	 Catch:{ IllegalArgumentException -> 0x008b }
        if (r6 == 0) goto L_0x0018;
    L_0x004a:
        r0 = 2;
        if (r5 == 0) goto L_0x0018;
    L_0x004d:
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x008d }
        r7 = 5;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x008d }
        r6 = r8.equals(r6);	 Catch:{ IllegalArgumentException -> 0x008d }
        if (r6 == 0) goto L_0x0018;
    L_0x0058:
        r0 = 3;
        if (r5 == 0) goto L_0x0018;
    L_0x005b:
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x008f }
        r7 = 9;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x008f }
        r6 = r8.equals(r6);	 Catch:{ IllegalArgumentException -> 0x008f }
        if (r6 == 0) goto L_0x0018;
    L_0x0067:
        r0 = 4;
        if (r5 == 0) goto L_0x0018;
    L_0x006a:
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r7 = 11;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x0091 }
        r6 = r8.equals(r6);	 Catch:{ IllegalArgumentException -> 0x0091 }
        if (r6 == 0) goto L_0x0018;
    L_0x0076:
        if (r5 == 0) goto L_0x00ba;
    L_0x0078:
        r0 = r3;
    L_0x0079:
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0093 }
        r6 = 8;
        r3 = r3[r6];	 Catch:{ IllegalArgumentException -> 0x0093 }
        r3 = r8.equals(r3);	 Catch:{ IllegalArgumentException -> 0x0093 }
        if (r3 == 0) goto L_0x0018;
    L_0x0085:
        r0 = r2;
        goto L_0x0018;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r0 = move-exception;
        throw r0;
    L_0x008d:
        r0 = move-exception;
        throw r0;
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = 2131296303; // 0x7f09002f float:1.8210519E38 double:1.0530002844E-314;
        if (r5 == 0) goto L_0x001c;
    L_0x009a:
        r0 = 2131296304; // 0x7f090030 float:1.821052E38 double:1.053000285E-314;
        if (r5 == 0) goto L_0x001c;
    L_0x009f:
        r0 = 2131296305; // 0x7f090031 float:1.8210523E38 double:1.0530002854E-314;
        goto L_0x001c;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r2 = com.whatsapp.App.az;
        r0 = r2.a(r0, r9);
        r2 = new java.lang.Object[r4];
        r3 = java.lang.Integer.valueOf(r9);
        r2[r1] = r3;
        r0 = java.lang.String.format(r0, r2);
        goto L_0x000d;
    L_0x00ba:
        r0 = r3;
        goto L_0x0018;
    L_0x00bd:
        r0 = r4;
        goto L_0x0018;
    L_0x00c0:
        r0 = r1;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cb.a(java.lang.String, int):java.lang.String");
    }

    private static int a(ZipFile zipFile, String str) {
        int i = 0;
        ZipEntry entry = zipFile.getEntry(z[20]);
        if (entry != null) {
            Pattern compile = Pattern.compile("<" + str + z[19] + str + ">", 34);
            Closeable closeable = null;
            try {
                closeable = zipFile.getInputStream(entry);
                Matcher matcher = compile.matcher(a((InputStream) closeable));
                if (matcher.find()) {
                    i = Integer.parseInt(matcher.group(1).trim());
                }
            } catch (Throwable e) {
                Log.a(z[18], e);
            } catch (Throwable th) {
                ao.a(closeable);
            }
            ao.a(closeable);
        }
        return i;
    }

    static {
        String[] strArr = new String[72];
        String str = "\u0017}\u007fc\u001b\u001cbo\u001c\u001d\u001bgqQ\u0007\u0012{p\u001d\u0003\u0003w{";
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
                        i3 = 115;
                        break;
                    case at.g /*1*/:
                        i3 = 18;
                        break;
                    case at.i /*2*/:
                        i3 = 28;
                        break;
                    case at.o /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u0006\u0003wrK\u0004\u001fftF\u0004\u00112";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u0006\u0003wrK\u0004\u001fftF\u0004\u00112";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u001ewxZ\b\u0015{pV\u001c\u0007{p@F\u001cby]\u0011\u001e~h[\u001c\u001ep<";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]alA\f\u0012vo[\f\u0016fq_G\u0000zyV\u001d";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=lW\u000f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]esA\r\u0003`sP\f\u0000au]\u000e\u001e~2W\u0006\u0010gqV\u0007\u0007";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]\u007fo\u001e\u0019\u001ceyA\u0019\u001c{rG";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]\u007fo\u001e\f\u000bqy_";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=q@\u001e\u001c`x";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]bnV\u001a\u0016|hR\u001d\u001a}r^\u0005]bnV\u001a\u0016|hR\u001d\u001a}r";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "#s{V\u001a";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001f{xV\n\u001cgrGI";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001f{xV\n\u001cgrGI";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001f{xV\n\u001cgrGI";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001f{xV\n\u001cgrGI";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001f{xV\n\u001cgrGI";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\n\u001cgrGI";
                    obj = 17;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "(L\"nCM:2\u0019@O=";
                    obj = 18;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0017}\u007fc\u001b\u001cbo\u001c\b\u0003b2K\u0004\u001f";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001f{xV\n\u001cgrGI";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0003bh\u001c\u001a\u001f{xV\u001a\\apZ\r\u0016";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "]jq_";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = " ~uW\f\u0000";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001f{xV\n\u001cgrGI";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001f{xV\n\u001cgrGI";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001f{xV\n\u001cgrGI";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001f{xV\n\u001cgrGI";
                    obj = 27;
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    strArr2 = strArr3;
                    str = "&FZ\u001eQ";
                    obj = 28;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = ",vu@\u0019\u001fsel\u0007\u0012\u007fy";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = ",auI\f";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u001ewxZ\b\u0015{pV\u001c\u0007{p@F\u0003`yC\b\u0001wx\\\n\u0006\u007fy]\u001dS";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]alA\f\u0012vo[\f\u0016fq_G\u0000zyV\u001d";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]bnV\u001a\u0016|hR\u001d\u001a}r^\u0005]bnV\u001a\u0016|hR\u001d\u001a}r";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]esA\r\u0003`sP\f\u0000au]\u000e\u001e~2W\u0006\u0010gqV\u0007\u0007";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0015{pV";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]bnV\u001a\u0016|hR\u001d\u001a}r^\u0005]bnV\u001a\u0016|hR\u001d\u001a}r";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]esA\r\u0003`sP\f\u0000au]\u000e\u001e~2W\u0006\u0010gqV\u0007\u0007";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u001ewxZ\b\u0015{pV\u001c\u0007{p@F\u0003`yC\b\u0001wx\\\n\u0006\u007fy]\u001dS";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]alA\f\u0012vo[\f\u0016fq_G\u0000zyV\u001d";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=lW\u000f";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=lW\u000f";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u001ewxZ\b\u0015{pV\u001c\u0007{p@F\u0003`yC\b\u0001wx\\\n\u0006\u007fy]\u001dS";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u000b~3D\u0006\u0001yo[\f\u0016fo\u001c\u001a\u001bwyG";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001bwyG\n\u001cgrGI";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "]jq_";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001bwyG\n\u001cgrGI";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001bwyG\n\u001cgrGI";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u001a\u001bwyG\n\u001cgrGI";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=lW\u000f";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]\u007fo\u001e\u0019\u001ceyA\u0019\u001c{rG";
                    obj = 50;
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    strArr2 = strArr3;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]bnV\u001a\u0016|hR\u001d\u001a}r^\u0005]bnV\u001a\u0016|hR\u001d\u001a}r";
                    obj = 51;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]alA\f\u0012vo[\f\u0016fq_G\u0000zyV\u001d";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]esA\r\u0003`sP\f\u0000au]\u000e\u001e~2W\u0006\u0010gqV\u0007\u0007";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0007wdGF\u0001fz";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]\u007fo\u001e\f\u000bqy_";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=nG\u000f";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=q@\u001e\u001c`x";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u001ewxZ\b\u0015{pV\u001c\u0007{p@F\u0017}\u007fG\u0001\u0006\u007f~\u0013";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]\u007fo\u001e\f\u000bqy_";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]bnV\u001a\u0016|hR\u001d\u001a}r^\u0005]bnV\u001a\u0016|hR\u001d\u001a}r";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0007wdGF\u0001fz";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=nG\u000f";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=lW\u000f";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]alA\f\u0012vo[\f\u0016fq_G\u0000zyV\u001d";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0007wdGF\u0003~}Z\u0007";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=q@\u001e\u001c`x";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]}lV\u0007\u000b\u007fpU\u0006\u0001\u007f}G\u001a^}zU\u0000\u0010wx\\\n\u0006\u007fy]\u001d]esA\r\u0003`sP\f\u0000au]\u000e\u001e~2W\u0006\u0010gqV\u0007\u0007";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0012bl_\u0000\u0010shZ\u0006\u001d=j]\r]\u007fo\u001e\u0019\u001ceyA\u0019\u001c{rG";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "SftF\u0004\u00112";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u001ewxZ\b\u0015{pV\u001c\u0007{p@F\u0017}\u007fG\u0001\u0006\u007f~\u0013\u0019\u0012uy\u0013";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0017}\u007fF\u0004\u0016|hF\u001d\u001a~o\u001c\u0006\u0003wrK\u0004\u001fftF\u0004\u00112";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static Drawable a(Context context, String str) {
        return a(context, str, null);
    }

    private static int c(File file) {
        ZipFile zipFile;
        Throwable e;
        int i = Log.h;
        try {
            int a;
            zipFile = new ZipFile(file.getAbsolutePath());
            try {
                a = a(zipFile, z[24]);
            } catch (Throwable e2) {
                try {
                    Log.a(z[27], e2);
                    a = 0;
                } catch (IOException e3) {
                    throw e3;
                } catch (IOException e4) {
                    e2 = e4;
                }
            }
            if (a == 0) {
                do {
                    if (zipFile.getEntry(z[22] + (a + 1) + z[23]) == null) {
                        break;
                    }
                    a++;
                } while (i == 0);
            }
            if (zipFile == null) {
                return a;
            }
            try {
                zipFile.close();
                return a;
            } catch (Throwable e5) {
                Log.a(z[28], e5);
                return a;
            } catch (IllegalArgumentException e6) {
                throw e6;
            }
        } catch (IOException e7) {
            e2 = e7;
            zipFile = null;
            try {
                Log.a(z[21], e2);
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Throwable e22) {
                        Log.a(z[25], e22);
                    }
                }
                return 0;
            } catch (Throwable th) {
                e22 = th;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Throwable e52) {
                        Log.a(z[26], e52);
                    } catch (IllegalArgumentException e62) {
                        throw e62;
                    }
                }
                throw e22;
            }
        } catch (Throwable th2) {
            e22 = th2;
            zipFile = null;
            if (zipFile != null) {
                zipFile.close();
            }
            throw e22;
        }
    }

    public static boolean b(String str) {
        try {
            if (!z[64].equals(str)) {
                if (!z[68].equals(str)) {
                    try {
                        if (!z[65].equals(str)) {
                            try {
                                if (!z[61].equals(str)) {
                                    try {
                                        if (!z[67].equals(str)) {
                                            try {
                                                if (!z[60].equals(str)) {
                                                    try {
                                                        if (!z[69].equals(str)) {
                                                            try {
                                                                if (!z[66].equals(str)) {
                                                                    try {
                                                                        if (!z[62].equals(str)) {
                                                                            try {
                                                                                if (!z[63].equals(str)) {
                                                                                    return false;
                                                                                }
                                                                            } catch (IllegalArgumentException e) {
                                                                                throw e;
                                                                            }
                                                                        }
                                                                    } catch (IllegalArgumentException e2) {
                                                                        throw e2;
                                                                    }
                                                                }
                                                            } catch (IllegalArgumentException e22) {
                                                                throw e22;
                                                            }
                                                        }
                                                    } catch (IllegalArgumentException e222) {
                                                        throw e222;
                                                    }
                                                }
                                            } catch (IllegalArgumentException e2222) {
                                                throw e2222;
                                            }
                                        }
                                    } catch (IllegalArgumentException e22222) {
                                        throw e22222;
                                    }
                                }
                            } catch (IllegalArgumentException e222222) {
                                throw e222222;
                            }
                        }
                    } catch (IllegalArgumentException e2222222) {
                        throw e2222222;
                    }
                }
            }
            return true;
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        } catch (IllegalArgumentException e222222222) {
            throw e222222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.protocol.co a(java.lang.String r12, android.net.Uri r13, java.lang.String r14) {
        /*
        r3 = 9;
        r6 = 0;
        r4 = 0;
        r5 = com.whatsapp.util.Log.h;
        r9 = com.whatsapp.util.ag.d(r13);
        r1 = a(r13);
        r0 = z;
        r2 = 36;
        r0 = r0[r2];
        r2 = r13.getScheme();
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x014b;
    L_0x001e:
        r0 = r13.getLastPathSegment();
        r2 = android.text.TextUtils.isEmpty(r1);
        if (r2 == 0) goto L_0x0147;
    L_0x0028:
        r7 = r0;
    L_0x0029:
        r1 = z;	 Catch:{ aw -> 0x00dd, Exception -> 0x013a }
        r2 = 41;
        r1 = r1[r2];	 Catch:{ aw -> 0x00dd, Exception -> 0x013a }
        r1 = r1.equals(r14);	 Catch:{ aw -> 0x00dd, Exception -> 0x013a }
        if (r1 == 0) goto L_0x0144;
    L_0x0035:
        r1 = new com.whatsapp.util.i;	 Catch:{ aw -> 0x00dd, Exception -> 0x013a }
        r1.<init>(r9);	 Catch:{ aw -> 0x00dd, Exception -> 0x013a }
        r1.a();	 Catch:{ aw -> 0x00dd, Exception -> 0x013a }
        r1 = r1.b();	 Catch:{ aw -> 0x00dd, Exception -> 0x013a }
        if (r5 == 0) goto L_0x0079;
    L_0x0043:
        r2 = r1;
    L_0x0044:
        r1 = z;	 Catch:{ aw -> 0x00db, Exception -> 0x00ea }
        r8 = 37;
        r1 = r1[r8];	 Catch:{ aw -> 0x00db, Exception -> 0x00ea }
        r1 = r1.equals(r14);	 Catch:{ aw -> 0x00db, Exception -> 0x00ea }
        if (r1 == 0) goto L_0x0057;
    L_0x0050:
        r1 = c(r9);	 Catch:{ aw -> 0x00dd, Exception -> 0x00ea }
        if (r5 == 0) goto L_0x0079;
    L_0x0056:
        r2 = r1;
    L_0x0057:
        r1 = z;	 Catch:{ aw -> 0x00e8, Exception -> 0x00ea }
        r8 = 40;
        r1 = r1[r8];	 Catch:{ aw -> 0x00e8, Exception -> 0x00ea }
        r1 = r1.equals(r14);	 Catch:{ aw -> 0x00e8, Exception -> 0x00ea }
        if (r1 == 0) goto L_0x0141;
    L_0x0063:
        r1 = a(r9);	 Catch:{ aw -> 0x00dd, Exception -> 0x00ea }
        if (r5 == 0) goto L_0x0079;
    L_0x0069:
        r2 = z;	 Catch:{ aw -> 0x00f9, Exception -> 0x00fb }
        r5 = 35;
        r2 = r2[r5];	 Catch:{ aw -> 0x00f9, Exception -> 0x00fb }
        r2 = r2.equals(r14);	 Catch:{ aw -> 0x00f9, Exception -> 0x00fb }
        if (r2 == 0) goto L_0x0079;
    L_0x0075:
        r1 = d(r9);	 Catch:{ aw -> 0x00dd, Exception -> 0x00fb }
    L_0x0079:
        r8 = r1;
    L_0x007a:
        r1 = z;	 Catch:{ Exception -> 0x012b }
        r2 = 42;
        r1 = r1[r2];	 Catch:{ Exception -> 0x012b }
        r1 = r1.equals(r14);	 Catch:{ Exception -> 0x012b }
        if (r1 == 0) goto L_0x00fd;
    L_0x0086:
        r1 = r9.getAbsolutePath();	 Catch:{ Exception -> 0x012b }
        r1 = a(r1);	 Catch:{ Exception -> 0x012b }
    L_0x008e:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r5 = ".";
        r2 = r2.append(r5);
        r5 = com.whatsapp.util.ag.c(r14);
        r2 = r2.append(r5);
        r2 = r2.toString();
        if (r0 == 0) goto L_0x013e;
    L_0x00a8:
        r5 = r0.endsWith(r2);	 Catch:{ aw -> 0x0138 }
        if (r5 == 0) goto L_0x013e;
    L_0x00ae:
        r5 = r0.length();
        r10 = r2.length();
        r5 = r5 - r10;
        r0 = r0.substring(r4, r5);
        r5 = r0;
    L_0x00bc:
        r0 = com.whatsapp.App.z();
        r10 = 1;
        r0 = com.whatsapp.util.ag.a(r0, r2, r3, r4, r10);
        com.whatsapp.util.ag.a(r9, r0);
        r2 = new com.whatsapp.MediaData;
        r2.<init>();
        r2.file = r0;
        r0 = r12;
        r0 = com.whatsapp.App.b(r0, r1, r2, r3, r4, r5, r6);
        r0.R = r8;
        r0.n = r14;
        r0.A = r7;
        return r0;
    L_0x00db:
        r1 = move-exception;
        throw r1;	 Catch:{ aw -> 0x00dd, Exception -> 0x00ea }
    L_0x00dd:
        r0 = move-exception;
        r1 = z;
        r2 = 32;
        r1 = r1[r2];
        com.whatsapp.util.Log.a(r1, r0);
        throw r0;
    L_0x00e8:
        r1 = move-exception;
        throw r1;	 Catch:{ aw -> 0x00dd, Exception -> 0x00ea }
    L_0x00ea:
        r1 = move-exception;
        r11 = r1;
        r1 = r2;
        r2 = r11;
    L_0x00ee:
        r5 = z;
        r8 = 43;
        r5 = r5[r8];
        com.whatsapp.util.Log.a(r5, r2);
        r8 = r1;
        goto L_0x007a;
    L_0x00f9:
        r2 = move-exception;
        throw r2;	 Catch:{ aw -> 0x00dd, Exception -> 0x00fb }
    L_0x00fb:
        r2 = move-exception;
        goto L_0x00ee;
    L_0x00fd:
        r1 = z;	 Catch:{ aw -> 0x0127 }
        r2 = 34;
        r1 = r1[r2];	 Catch:{ aw -> 0x0127 }
        r1 = r1.equals(r14);	 Catch:{ aw -> 0x0127 }
        if (r1 != 0) goto L_0x0121;
    L_0x0109:
        r1 = z;	 Catch:{ aw -> 0x0127 }
        r2 = 33;
        r1 = r1[r2];	 Catch:{ aw -> 0x0127 }
        r1 = r1.equals(r14);	 Catch:{ aw -> 0x0127 }
        if (r1 != 0) goto L_0x0121;
    L_0x0115:
        r1 = z;	 Catch:{ aw -> 0x0129 }
        r2 = 38;
        r1 = r1[r2];	 Catch:{ aw -> 0x0129 }
        r1 = r1.equals(r14);	 Catch:{ aw -> 0x0129 }
        if (r1 == 0) goto L_0x0135;
    L_0x0121:
        r1 = b(r9);	 Catch:{ Exception -> 0x012b }
        goto L_0x008e;
    L_0x0127:
        r1 = move-exception;
        throw r1;	 Catch:{ aw -> 0x0129 }
    L_0x0129:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x012b }
    L_0x012b:
        r1 = move-exception;
        r2 = z;
        r5 = 39;
        r2 = r2[r5];
        com.whatsapp.util.Log.a(r2, r1);
    L_0x0135:
        r1 = r6;
        goto L_0x008e;
    L_0x0138:
        r0 = move-exception;
        throw r0;
    L_0x013a:
        r1 = move-exception;
        r2 = r1;
        r1 = r4;
        goto L_0x00ee;
    L_0x013e:
        r5 = r0;
        goto L_0x00bc;
    L_0x0141:
        r1 = r2;
        goto L_0x0069;
    L_0x0144:
        r2 = r4;
        goto L_0x0044;
    L_0x0147:
        r7 = r0;
        r0 = r1;
        goto L_0x0029;
    L_0x014b:
        r7 = r6;
        r0 = r1;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cb.a(java.lang.String, android.net.Uri, java.lang.String):com.whatsapp.protocol.co");
    }
}
