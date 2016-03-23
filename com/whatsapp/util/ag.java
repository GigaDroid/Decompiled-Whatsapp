package com.whatsapp.util;

import android.app.Activity;
import android.backport.util.Base64;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Images;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.whatsapp.App;
import com.whatsapp.DocumentPickerActivity;
import com.whatsapp.MediaData;
import com.whatsapp.Voip;
import com.whatsapp.a3m;
import com.whatsapp.a59;
import com.whatsapp.akr;
import com.whatsapp.arj;
import com.whatsapp.by;
import com.whatsapp.c7;
import com.whatsapp.gallerypicker.GalleryPicker;
import com.whatsapp.mn;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.qi;
import com.whatsapp.ve;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ag {
    private static File a;
    public static bf b;
    private static String c;
    private static int d;
    public static Options e;
    private static final DecimalFormat f;
    private static final String[] z;

    private static String a(int i, int i2) {
        switch (i) {
            case at.g /*1*/:
                return z[166];
            case at.i /*2*/:
                if (i2 != 1) {
                    return z[167];
                }
                try {
                    return z[170];
                } catch (NumberFormatException e) {
                    throw e;
                }
            case at.o /*3*/:
                return z[169];
            case Y.l /*9*/:
                return z[168];
            default:
                return null;
        }
    }

    public static String a(URL url) {
        if (url == null) {
            return null;
        }
        try {
            if (App.am >= 2) {
                return url.toString();
            }
            String substring;
            Builder builder;
            String path = url.getPath();
            if (path != null) {
                try {
                    if (path.length() > 25) {
                        substring = path.substring(0, path.length() - 25);
                        builder = new Builder();
                        builder.scheme(url.getProtocol()).authority(url.getHost()).path(substring + z[72] + path.substring(path.length() - 4)).encodedQuery(url.getQuery());
                        return builder.build().toString();
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            substring = "";
            builder = new Builder();
            builder.scheme(url.getProtocol()).authority(url.getHost()).path(substring + z[72] + path.substring(path.length() - 4)).encodedQuery(url.getQuery());
            return builder.build().toString();
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        int i = Log.h;
        byte[] bArr = new byte[4096];
        int i2 = 0;
        do {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read < 0) {
                break;
            }
            outputStream.write(bArr, 0, read);
            i2 += read;
        } while (i == 0);
        return i2;
    }

    public static long a(File file) {
        long j = 0;
        if (file != null) {
            try {
                if (file.exists()) {
                    if (!file.getName().endsWith(z[2]) && VERSION.SDK_INT >= 10) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            j = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                        } catch (Throwable e) {
                            Log.b(z[3], e);
                            mediaMetadataRetriever.release();
                        }
                    }
                }
            } catch (Exception e2) {
                throw e2;
            } catch (Exception e22) {
                try {
                    throw e22;
                } catch (Exception e222) {
                    throw e222;
                }
            }
        }
        return j;
    }

    public static Matrix f(Uri uri) {
        int i = Log.h;
        if (uri != null) {
            try {
                if (!TextUtils.isEmpty(uri.toString())) {
                    Matrix matrix;
                    Matrix a = a(g(uri));
                    if (uri.getQueryParameter(z[173]) != null) {
                        matrix = new Matrix();
                        matrix.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                        if (a == null) {
                            if (i != 0) {
                                a = matrix;
                            }
                        }
                        try {
                            a.postConcat(matrix);
                            matrix = a;
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                    matrix = a;
                    if (uri.getQueryParameter(z[172]) != null) {
                        a = new Matrix();
                        a.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                        if (matrix == null) {
                            if (i != 0) {
                                matrix = a;
                            } else {
                                matrix = a;
                            }
                        }
                        try {
                            matrix.postConcat(a);
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                    String queryParameter = uri.getQueryParameter(z[175]);
                    if (queryParameter != null) {
                        if (matrix == null) {
                            matrix = new Matrix();
                        }
                        matrix.postRotate((float) Integer.parseInt(queryParameter));
                    }
                    return matrix;
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
        throw new FileNotFoundException(z[174] + uri);
    }

    public static String h(Uri uri) {
        String type = App.at.getType(uri);
        if (type != null) {
            return type;
        }
        String a = a(uri.getPath());
        if (a != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(a);
        }
        return type;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte d(java.lang.String r2) {
        /*
        if (r2 == 0) goto L_0x00e2;
    L_0x0002:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0010 }
        r1 = 82;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0010 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x0010 }
        if (r0 == 0) goto L_0x0012;
    L_0x000e:
        r0 = 2;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0020 }
        r1 = 85;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0020 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x0020 }
        if (r0 == 0) goto L_0x0022;
    L_0x001e:
        r0 = 3;
        goto L_0x000f;
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0030 }
        r1 = 84;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0030 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x0030 }
        if (r0 == 0) goto L_0x0032;
    L_0x002e:
        r0 = 1;
        goto L_0x000f;
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0040 }
        r1 = 81;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0040 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x0040 }
        if (r0 == 0) goto L_0x0042;
    L_0x003e:
        r0 = 4;
        goto L_0x000f;
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0050 }
        r1 = 87;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0050 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x0050 }
        if (r0 == 0) goto L_0x0052;
    L_0x004e:
        r0 = 0;
        goto L_0x000f;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00ce }
        r1 = 86;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00ce }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x00ce }
        if (r0 != 0) goto L_0x00ca;
    L_0x005e:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00d0 }
        r1 = 79;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00d0 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x00d0 }
        if (r0 != 0) goto L_0x00ca;
    L_0x006a:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00d2 }
        r1 = 80;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00d2 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x00d2 }
        if (r0 != 0) goto L_0x00ca;
    L_0x0076:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00d4 }
        r1 = 88;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00d4 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x00d4 }
        if (r0 != 0) goto L_0x00ca;
    L_0x0082:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00d6 }
        r1 = 91;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00d6 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x00d6 }
        if (r0 != 0) goto L_0x00ca;
    L_0x008e:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00d8 }
        r1 = 83;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00d8 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x00d8 }
        if (r0 != 0) goto L_0x00ca;
    L_0x009a:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00da }
        r1 = 89;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00da }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x00da }
        if (r0 != 0) goto L_0x00ca;
    L_0x00a6:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00dc }
        r1 = 93;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00dc }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x00dc }
        if (r0 != 0) goto L_0x00ca;
    L_0x00b2:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00de }
        r1 = 92;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00de }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x00de }
        if (r0 != 0) goto L_0x00ca;
    L_0x00be:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00e0 }
        r1 = 90;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00e0 }
        r0 = r2.startsWith(r0);	 Catch:{ NumberFormatException -> 0x00e0 }
        if (r0 == 0) goto L_0x00e2;
    L_0x00ca:
        r0 = 9;
        goto L_0x000f;
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = -1;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.d(java.lang.String):byte");
    }

    public static File a(Context context, String str, byte b, int i, boolean z) {
        int i2 = Log.h;
        File file = null;
        int i3 = 0;
        while (i3 < 100) {
            file = App.a(a(context, (int) b, i) + str, b, i, z);
            try {
                if (!file.exists() && i2 == 0) {
                    break;
                }
                i3++;
                if (i2 != 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        return file;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(java.lang.String r5) {
        /*
        r1 = 0;
        r2 = com.whatsapp.util.Log.h;
        if (r5 != 0) goto L_0x000b;
    L_0x0005:
        r0 = "";
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r0 = -1;
        r3 = r5.hashCode();	 Catch:{ NumberFormatException -> 0x00d6 }
        switch(r3) {
            case -1487394660: goto L_0x002e;
            case -1248334925: goto L_0x003d;
            case -1248332507: goto L_0x00c6;
            case -1073633483: goto L_0x006a;
            case -1071817359: goto L_0x0097;
            case -1050893613: goto L_0x004c;
            case -1004732798: goto L_0x00b6;
            case -366307023: goto L_0x0088;
            case 817335912: goto L_0x00a6;
            case 904647503: goto L_0x0079;
            case 1993842850: goto L_0x005b;
            default: goto L_0x0013;
        };
    L_0x0013:
        switch(r0) {
            case 0: goto L_0x00ec;
            case 1: goto L_0x00f6;
            case 2: goto L_0x00fe;
            case 3: goto L_0x0106;
            case 4: goto L_0x010e;
            case 5: goto L_0x0116;
            case 6: goto L_0x011e;
            case 7: goto L_0x0126;
            case 8: goto L_0x012e;
            case 9: goto L_0x0136;
            case 10: goto L_0x013e;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = com.whatsapp.util.b.a(r5, r1);
        r2 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x0146 }
        if (r2 == 0) goto L_0x0008;
    L_0x0020:
        r0 = com.whatsapp.util.b.b(r5, r1);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x0148 }
        if (r1 == 0) goto L_0x0008;
    L_0x002a:
        r0 = "";
        goto L_0x0008;
    L_0x002e:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00d6 }
        r4 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00d6 }
        r3 = r5.equals(r3);	 Catch:{ NumberFormatException -> 0x00d6 }
        if (r3 == 0) goto L_0x0013;
    L_0x003a:
        if (r2 == 0) goto L_0x014a;
    L_0x003c:
        r0 = r1;
    L_0x003d:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00d8 }
        r4 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00d8 }
        r3 = r5.equals(r3);	 Catch:{ NumberFormatException -> 0x00d8 }
        if (r3 == 0) goto L_0x0013;
    L_0x0049:
        r0 = 1;
        if (r2 == 0) goto L_0x0013;
    L_0x004c:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00da }
        r4 = 94;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00da }
        r3 = r5.equals(r3);	 Catch:{ NumberFormatException -> 0x00da }
        if (r3 == 0) goto L_0x0013;
    L_0x0058:
        r0 = 2;
        if (r2 == 0) goto L_0x0013;
    L_0x005b:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00dc }
        r4 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00dc }
        r3 = r5.equals(r3);	 Catch:{ NumberFormatException -> 0x00dc }
        if (r3 == 0) goto L_0x0013;
    L_0x0067:
        r0 = 3;
        if (r2 == 0) goto L_0x0013;
    L_0x006a:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00de }
        r4 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00de }
        r3 = r5.equals(r3);	 Catch:{ NumberFormatException -> 0x00de }
        if (r3 == 0) goto L_0x0013;
    L_0x0076:
        r0 = 4;
        if (r2 == 0) goto L_0x0013;
    L_0x0079:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00e0 }
        r4 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00e0 }
        r3 = r5.equals(r3);	 Catch:{ NumberFormatException -> 0x00e0 }
        if (r3 == 0) goto L_0x0013;
    L_0x0085:
        r0 = 5;
        if (r2 == 0) goto L_0x0013;
    L_0x0088:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00e2 }
        r4 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00e2 }
        r3 = r5.equals(r3);	 Catch:{ NumberFormatException -> 0x00e2 }
        if (r3 == 0) goto L_0x0013;
    L_0x0094:
        r0 = 6;
        if (r2 == 0) goto L_0x0013;
    L_0x0097:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00e4 }
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00e4 }
        r3 = r5.equals(r3);	 Catch:{ NumberFormatException -> 0x00e4 }
        if (r3 == 0) goto L_0x0013;
    L_0x00a3:
        r0 = 7;
        if (r2 == 0) goto L_0x0013;
    L_0x00a6:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00e6 }
        r4 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00e6 }
        r3 = r5.equals(r3);	 Catch:{ NumberFormatException -> 0x00e6 }
        if (r3 == 0) goto L_0x0013;
    L_0x00b2:
        r0 = 8;
        if (r2 == 0) goto L_0x0013;
    L_0x00b6:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00e8 }
        r4 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00e8 }
        r3 = r5.equals(r3);	 Catch:{ NumberFormatException -> 0x00e8 }
        if (r3 == 0) goto L_0x0013;
    L_0x00c2:
        r0 = 9;
        if (r2 == 0) goto L_0x0013;
    L_0x00c6:
        r2 = z;	 Catch:{ NumberFormatException -> 0x00ea }
        r3 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00ea }
        r2 = r5.equals(r2);	 Catch:{ NumberFormatException -> 0x00ea }
        if (r2 == 0) goto L_0x0013;
    L_0x00d2:
        r0 = 10;
        goto L_0x0013;
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r0 = move-exception;
        throw r0;
    L_0x00dc:
        r0 = move-exception;
        throw r0;
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = move-exception;
        throw r0;
    L_0x00e8:
        r0 = move-exception;
        throw r0;
    L_0x00ea:
        r0 = move-exception;
        throw r0;
    L_0x00ec:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00f4 }
        r1 = 99;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00f4 }
        goto L_0x0008;
    L_0x00f4:
        r0 = move-exception;
        throw r0;
    L_0x00f6:
        r0 = z;
        r1 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r0 = r0[r1];
        goto L_0x0008;
    L_0x00fe:
        r0 = z;
        r1 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r0 = r0[r1];
        goto L_0x0008;
    L_0x0106:
        r0 = z;
        r1 = 95;
        r0 = r0[r1];
        goto L_0x0008;
    L_0x010e:
        r0 = z;
        r1 = 96;
        r0 = r0[r1];
        goto L_0x0008;
    L_0x0116:
        r0 = z;
        r1 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0 = r0[r1];
        goto L_0x0008;
    L_0x011e:
        r0 = z;
        r1 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r0 = r0[r1];
        goto L_0x0008;
    L_0x0126:
        r0 = z;
        r1 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r0 = r0[r1];
        goto L_0x0008;
    L_0x012e:
        r0 = z;
        r1 = 98;
        r0 = r0[r1];
        goto L_0x0008;
    L_0x0136:
        r0 = z;
        r1 = 100;
        r0 = r0[r1];
        goto L_0x0008;
    L_0x013e:
        r0 = z;
        r1 = 97;
        r0 = r0[r1];
        goto L_0x0008;
    L_0x0146:
        r0 = move-exception;
        throw r0;
    L_0x0148:
        r0 = move-exception;
        throw r0;
    L_0x014a:
        r0 = r1;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.c(java.lang.String):java.lang.String");
    }

    public static void a(String str, Uri uri) {
        byte[] bArr = null;
        MediaData mediaData = new MediaData();
        ByteBuffer byteBuffer = (ByteBuffer) b.get(uri.buildUpon().query(null).build());
        Bitmap decodeByteArray;
        if (byteBuffer != null) {
            byte[] toByteArray;
            byte[] array = byteBuffer.array();
            String queryParameter = uri.getQueryParameter(z[1]);
            if (queryParameter != null) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) Integer.parseInt(queryParameter));
                decodeByteArray = BitmapFactory.decodeByteArray(array, 0, array.length);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                if (createBitmap != decodeByteArray) {
                    decodeByteArray.recycle();
                } else {
                    createBitmap = decodeByteArray;
                }
                if (createBitmap != null) {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
                    toByteArray = byteArrayOutputStream.toByteArray();
                    createBitmap.recycle();
                    bArr = toByteArray;
                }
            }
            toByteArray = array;
            bArr = toByteArray;
        } else {
            decodeByteArray = a(uri, 100, 100);
            if (decodeByteArray != null) {
                OutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                decodeByteArray.compress(CompressFormat.JPEG, 80, byteArrayOutputStream2);
                bArr = byteArrayOutputStream2.toByteArray();
                decodeByteArray.recycle();
            }
        }
        App.a(str, bArr, mediaData, (byte) 1, 0, uri.getQueryParameter(z[0]), uri);
    }

    public static String b(File file) {
        MessageDigest instance;
        InputStream fileInputStream;
        IOException e;
        Throwable th;
        int i = Log.h;
        try {
            instance = MessageDigest.getInstance(z[135]);
        } catch (NoSuchAlgorithmException e2) {
            Log.e(z[137] + e2.toString());
            instance = null;
        }
        if (instance == null) {
            try {
                Log.e(z[134]);
                return null;
            } catch (NoSuchAlgorithmException e3) {
                throw e3;
            }
        }
        byte[] bArr = new byte[8192];
        try {
            fileInputStream = new FileInputStream(file);
            do {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                } catch (IOException e4) {
                    e = e4;
                }
            } while (i == 0);
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                    Log.e(z[136] + e5.toString());
                } catch (NoSuchAlgorithmException e32) {
                    throw e32;
                }
            }
            return Base64.encodeToString(instance.digest(), 2);
        } catch (IOException e6) {
            e = e6;
            fileInputStream = null;
            try {
                Log.e(z[133] + e.toString());
                if (fileInputStream == null) {
                    return null;
                }
                try {
                    fileInputStream.close();
                    return null;
                } catch (IOException e7) {
                    Log.e(z[131] + e7.toString());
                    return null;
                } catch (NoSuchAlgorithmException e322) {
                    throw e322;
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e72) {
                        Log.e(z[132] + e72.toString());
                    } catch (NoSuchAlgorithmException e3222) {
                        throw e3222;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public static Bitmap a(Uri uri) {
        return a(uri, a59.f, a59.f);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.whatsapp.protocol.co r6) {
        /*
        r4 = 0;
        r1 = 0;
        r0 = r6.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r2 = r6.c;	 Catch:{ NumberFormatException -> 0x002a }
        r3 = 3;
        if (r2 != r3) goto L_0x0036;
    L_0x000c:
        r2 = r0.file;	 Catch:{ NumberFormatException -> 0x002c }
        r2 = com.whatsapp.akr.d(r2);	 Catch:{ NumberFormatException -> 0x002c }
        if (r2 != 0) goto L_0x0028;
    L_0x0014:
        r2 = r0.trimFrom;	 Catch:{ NumberFormatException -> 0x002e }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 < 0) goto L_0x0034;
    L_0x001a:
        r2 = r0.trimTo;	 Catch:{ NumberFormatException -> 0x0030 }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0034;
    L_0x0020:
        r0 = r0.file;	 Catch:{ NumberFormatException -> 0x0032 }
        r0 = com.whatsapp.akr.b(r0);	 Catch:{ NumberFormatException -> 0x0032 }
        if (r0 == 0) goto L_0x0034;
    L_0x0028:
        r0 = 1;
    L_0x0029:
        return r0;
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = r1;
        goto L_0x0029;
    L_0x0036:
        r2 = r6.c;	 Catch:{ NumberFormatException -> 0x0042 }
        r3 = 2;
        if (r2 != r3) goto L_0x0044;
    L_0x003b:
        r0 = r0.file;	 Catch:{ NumberFormatException -> 0x0042 }
        r0 = com.whatsapp.mn.a(r0);	 Catch:{ NumberFormatException -> 0x0042 }
        goto L_0x0029;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r0 = r1;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.b(com.whatsapp.protocol.co):boolean");
    }

    public static void a(File file, File file2) {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                a(fileInputStream);
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                a((InputStream) fileInputStream, new FileOutputStream(file2));
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public static void a(@NonNull Context context, @NonNull File file) {
        String canonicalPath = file.getCanonicalPath();
        String canonicalPath2 = new File(context.getApplicationInfo().dataDir).getCanonicalPath();
        try {
            if (canonicalPath.startsWith(canonicalPath2)) {
                throw new IOException(z[217] + canonicalPath + z[218] + canonicalPath2);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (App.am >= 2) {
                return str;
            }
            try {
                return a(new URL(str));
            } catch (MalformedURLException e) {
                try {
                    Log.w(z[130]);
                    return str.length() <= 25 ? z[128] : str.substring(0, str.length() - 25) + z[129];
                } catch (MalformedURLException e2) {
                    throw e2;
                }
            }
        } catch (MalformedURLException e22) {
            throw e22;
        }
    }

    public static void a(Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
            b.put(uri, ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
        }
    }

    public static String c() {
        return ve.f(App.ay.jabber_id + System.currentTimeMillis());
    }

    public static void a(Context context, Uri uri) {
        context.sendBroadcast(new Intent(z[68]).setData(uri));
    }

    public static File c(Context context) {
        if (a == null) {
            String string = context.getSharedPreferences(z[123], 0).getString(z[122], null);
            if (string != null) {
                try {
                    a = new File(string);
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(android.graphics.Bitmap r7) {
        /*
        r6 = 100;
        r3 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r4 = 0;
        r5 = 1;
        r0 = 0;
        if (r7 == 0) goto L_0x00f7;
    L_0x0009:
        r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r1 = z;	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r2 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r1 = r7.getWidth();	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r1 = z;	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r2 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r1 = r7.getHeight();	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x00f8 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x00f8 }
        r0 = r7.getWidth();	 Catch:{ OutOfMemoryError -> 0x00f8 }
        if (r0 > r6) goto L_0x0045;
    L_0x003f:
        r0 = r7.getHeight();	 Catch:{ OutOfMemoryError -> 0x00fa }
        if (r0 <= r6) goto L_0x00e4;
    L_0x0045:
        r0 = r7.getWidth();
        r0 = (float) r0;
        r0 = r0 / r3;
        r1 = r7.getHeight();
        r1 = (float) r1;
        r1 = r1 / r3;
        r0 = java.lang.Math.max(r0, r1);
        r1 = new android.graphics.Rect;
        r2 = r7.getWidth();
        r2 = (float) r2;
        r2 = r2 / r0;
        r2 = (int) r2;
        r3 = r7.getHeight();
        r3 = (float) r3;
        r0 = r3 / r0;
        r0 = (int) r0;
        r1.<init>(r4, r4, r2, r0);
        r0 = r1.right;
        r0 = java.lang.Math.max(r0, r5);
        r1.right = r0;
        r0 = r1.bottom;
        r0 = java.lang.Math.max(r0, r5);
        r1.bottom = r0;
        r2 = new android.graphics.Rect;
        r0 = r7.getWidth();
        r3 = r7.getHeight();
        r2.<init>(r4, r4, r0, r3);
        r0 = r7.getConfig();
        r3 = r1.width();	 Catch:{ OutOfMemoryError -> 0x00fc }
        r4 = r1.height();	 Catch:{ OutOfMemoryError -> 0x00fc }
        if (r0 != 0) goto L_0x0096;
    L_0x0094:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ OutOfMemoryError -> 0x00fc }
    L_0x0096:
        r0 = android.graphics.Bitmap.createBitmap(r3, r4, r0);	 Catch:{ OutOfMemoryError -> 0x00fe }
        r3 = new android.graphics.Canvas;
        r3.<init>(r0);
        r4 = new android.graphics.Paint;
        r4.<init>();
        r4.setAntiAlias(r5);
        r4.setFilterBitmap(r5);
        r4.setDither(r5);
        r3.drawBitmap(r7, r2, r1, r4);
        r7.recycle();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r0.getWidth();
        r1 = r1.append(r2);
        r2 = z;
        r3 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r0.getHeight();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r7 = r0;
    L_0x00e4:
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;
        r2 = 80;
        r7.compress(r1, r2, r0);
        r0 = r0.toByteArray();
        r7.recycle();
    L_0x00f7:
        return r0;
    L_0x00f8:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00fa }
    L_0x00fa:
        r0 = move-exception;
        throw r0;
    L_0x00fc:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00fe }
    L_0x00fe:
        r0 = move-exception;
        r1 = z;
        r2 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
        r7.recycle();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.a(android.graphics.Bitmap):byte[]");
    }

    public static synchronized void a() {
        synchronized (ag.class) {
        }
    }

    public static void a(@NonNull FileInputStream fileInputStream) {
        try {
            if (Process.myUid() == StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(fileInputStream.getFD())).f) {
                throw new IOException(z[141] + fileInputStream);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static synchronized void b(Context context) {
        synchronized (ag.class) {
            try {
                if (d < 0) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(z[178], 0);
                    d = sharedPreferences.getInt(z[181], -1);
                    c = sharedPreferences.getString(z[183], null);
                    if (d >= 0) {
                        if (!TextUtils.isEmpty(c)) {
                            Log.i(z[177] + d + z[182] + c);
                        }
                    }
                    c = cs.a();
                    long currentTimeMillis = System.currentTimeMillis();
                    d = -1;
                    d = Math.max(d, a(c, (byte) 2, 0, true));
                    d = Math.max(d, a(c, (byte) 2, 0, false));
                    d = Math.max(d, a(c, (byte) 2, 1, true));
                    d = Math.max(d, a(c, (byte) 2, 1, false));
                    d = Math.max(d, a(c, (byte) 3, 0, true));
                    d = Math.max(d, a(c, (byte) 3, 0, false));
                    d = Math.max(d, a(c, (byte) 1, 0, true));
                    d = Math.max(d, a(c, (byte) 1, 0, false));
                    d = Math.max(d, a(c, (byte) 9, 0, true));
                    d = Math.max(d, a(c, (byte) 9, 0, false));
                    d++;
                    Editor edit = sharedPreferences.edit();
                    edit.putInt(z[184], d);
                    edit.putString(z[179], c);
                    if (!edit.commit()) {
                        Log.e(z[185]);
                    }
                    Log.i(z[186] + d + z[176] + c + z[180] + (System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            } catch (NumberFormatException e22) {
                throw e22;
            } catch (NumberFormatException e222) {
                throw e222;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(android.net.Uri r11) {
        /*
        r7 = 6;
        r10 = 2;
        r1 = 0;
        r4 = 1;
        r8 = 0;
        r9 = com.whatsapp.util.Log.h;
        r0 = r11.getScheme();	 Catch:{ Exception -> 0x00cd }
        if (r0 == 0) goto L_0x001d;
    L_0x000d:
        r0 = z;	 Catch:{ Exception -> 0x00cd }
        r2 = 10;
        r0 = r0[r2];	 Catch:{ Exception -> 0x00cd }
        r2 = r11.getScheme();	 Catch:{ Exception -> 0x00cd }
        r0 = r0.equals(r2);	 Catch:{ Exception -> 0x00cd }
        if (r0 == 0) goto L_0x0103;
    L_0x001d:
        r0 = new android.media.ExifInterface;
        r2 = r11.getPath();
        r0.<init>(r2);
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r0 = r0.getAttributeInt(r2, r4);
        if (r9 == 0) goto L_0x00b2;
    L_0x0032:
        r6 = r0;
    L_0x0033:
        r0 = z;	 Catch:{ Exception -> 0x00cf }
        r2 = 7;
        r0 = r0[r2];	 Catch:{ Exception -> 0x00cf }
        r2 = r11.getScheme();	 Catch:{ Exception -> 0x00cf }
        r0 = r0.equals(r2);	 Catch:{ Exception -> 0x00cf }
        if (r0 == 0) goto L_0x0101;
    L_0x0042:
        r2 = new java.lang.String[r10];
        r0 = z;
        r3 = 11;
        r0 = r0[r3];
        r2[r1] = r0;
        r0 = z;
        r1 = 13;
        r0 = r0[r1];
        r2[r4] = r0;
        r0 = r11.buildUpon();
        r0 = r0.query(r8);
        r1 = r0.build();
        r0 = com.whatsapp.App.at;	 Catch:{ Exception -> 0x00d1 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x00d1 }
        r1 = r0;
    L_0x006a:
        if (r1 == 0) goto L_0x00ff;
    L_0x006c:
        r0 = r1.moveToFirst();	 Catch:{ Exception -> 0x00dc }
        if (r0 == 0) goto L_0x00fd;
    L_0x0072:
        r0 = r1.getColumnCount();	 Catch:{ Exception -> 0x00de }
        if (r0 != r10) goto L_0x00fb;
    L_0x0078:
        r0 = 0;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x00e0 }
        if (r0 == 0) goto L_0x00f9;
    L_0x007f:
        r2 = new android.media.ExifInterface;	 Catch:{ all -> 0x00e0 }
        r2.<init>(r0);	 Catch:{ all -> 0x00e0 }
        r0 = z;	 Catch:{ all -> 0x00e0 }
        r3 = 5;
        r0 = r0[r3];	 Catch:{ all -> 0x00e0 }
        r3 = 1;
        r0 = r2.getAttributeInt(r0, r3);	 Catch:{ all -> 0x00e0 }
        if (r9 == 0) goto L_0x0098;
    L_0x0090:
        r2 = 1;
        r2 = r1.getInt(r2);	 Catch:{ all -> 0x00e0 }
        switch(r2) {
            case 90: goto L_0x00e7;
            case 180: goto L_0x00e9;
            case 270: goto L_0x00ec;
            default: goto L_0x0098;
        };
    L_0x0098:
        if (r9 == 0) goto L_0x00ad;
    L_0x009a:
        r2 = z;	 Catch:{ Exception -> 0x00ef }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00ef }
        com.whatsapp.util.Log.e(r2);	 Catch:{ Exception -> 0x00ef }
        if (r9 == 0) goto L_0x00ad;
    L_0x00a5:
        r2 = z;	 Catch:{ Exception -> 0x00f1 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00f1 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ Exception -> 0x00f1 }
    L_0x00ad:
        if (r1 == 0) goto L_0x00b2;
    L_0x00af:
        r1.close();	 Catch:{ Exception -> 0x00f3 }
    L_0x00b2:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        return r0;
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        com.whatsapp.util.Log.c(r1, r0);
        r1 = r8;
        goto L_0x006a;
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00e6;
    L_0x00e3:
        r1.close();	 Catch:{ Exception -> 0x00f5 }
    L_0x00e6:
        throw r0;
    L_0x00e7:
        if (r9 == 0) goto L_0x00f7;
    L_0x00e9:
        r0 = 3;
        if (r9 == 0) goto L_0x0098;
    L_0x00ec:
        r0 = 8;
        goto L_0x0098;
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e0 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = r7;
        goto L_0x0098;
    L_0x00f9:
        r0 = r6;
        goto L_0x0090;
    L_0x00fb:
        r0 = r6;
        goto L_0x009a;
    L_0x00fd:
        r0 = r6;
        goto L_0x00a5;
    L_0x00ff:
        r0 = r6;
        goto L_0x00ad;
    L_0x0101:
        r0 = r6;
        goto L_0x00b2;
    L_0x0103:
        r6 = r1;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.g(android.net.Uri):int");
    }

    public static Bitmap a(Uri uri, int i, int i2) {
        if (uri != null) {
            try {
                if (!TextUtils.isEmpty(uri.toString())) {
                    Bitmap a;
                    Log.i(z[78] + uri.toString());
                    Matrix f = f(uri);
                    Options a2 = a(uri, i);
                    try {
                        a = a(uri, i, i2, a2, f);
                    } catch (OutOfMemoryError e) {
                        a2.inSampleSize *= 2;
                        Log.i(z[74] + a2.inSampleSize);
                        a = a(uri, i, i2, a2, f);
                    }
                    Log.i(z[76] + a.getWidth() + z[77] + a.getHeight());
                    return a;
                }
            } catch (OutOfMemoryError e2) {
                throw e2;
            } catch (OutOfMemoryError e22) {
                throw e22;
            }
        }
        throw new FileNotFoundException(z[75] + uri);
    }

    public static void a(String str, Uri uri, String str2, by byVar) {
        byVar.a(0, 2131231424);
        bq.a(new c7(str, uri, str2, byVar), new Void[0]);
    }

    public static int c(File file) {
        long a = a(file);
        int i = (int) (a / 1000);
        if (i != 0 || a == 0) {
            return i;
        }
        return 1;
    }

    private static Options a(Uri uri, int i) {
        int i2 = Log.h;
        if (uri != null) {
            try {
                if (!TextUtils.isEmpty(uri.toString())) {
                    InputStream c = c(uri);
                    if (c == null) {
                        try {
                            Log.e(z[21]);
                            throw new FileNotFoundException(z[14] + uri);
                        } catch (NoSuchFieldError e) {
                            throw e;
                        }
                    }
                    Options options = new Options();
                    try {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(c, null, options);
                        c.close();
                        if (options.outWidth <= 0 || options.outHeight <= 0) {
                            Log.i(z[20] + uri);
                            throw new c_();
                        }
                        options.inSampleSize = 1;
                        int max = Math.max(options.outWidth, options.outHeight);
                        while (max / 2 > (i * 8) / 10) {
                            max /= 2;
                            options.inSampleSize *= 2;
                            if (i2 != 0) {
                                break;
                            }
                        }
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        options.inScaled = false;
                        options.inPurgeable = true;
                        options.inInputShareable = true;
                        Log.i(z[15] + options.outWidth + z[16] + options.outHeight + z[19] + options.inSampleSize);
                        try {
                            if (VERSION.SDK_INT >= 10) {
                                options.inPreferQualityOverSpeed = true;
                            }
                        } catch (NoSuchFieldError e2) {
                            Log.w(z[18] + VERSION.SDK_INT);
                        }
                        return options;
                    } catch (NoSuchFieldError e3) {
                        throw e3;
                    } catch (NoSuchFieldError e32) {
                        throw e32;
                    }
                }
            } catch (NoSuchFieldError e322) {
                throw e322;
            } catch (NoSuchFieldError e3222) {
                throw e3222;
            }
        }
        throw new FileNotFoundException(z[17] + uri);
    }

    public static void a(int i, Activity activity) {
        Intent intent;
        int i2 = Log.h;
        ArrayList arrayList = new ArrayList();
        switch (i) {
            case at.p /*4*/:
                intent = new Intent(z[43]);
                try {
                    if (VERSION.SDK_INT == 18 && Build.MODEL.contains(z[64])) {
                        intent.putExtra(z[60], Uri.fromFile(a((Context) activity, (byte) 3, z[65])));
                    }
                    try {
                        if (VERSION.SDK_INT < 9) {
                            intent.putExtra(z[41], ((long) a59.e) * 1048576);
                            break;
                        }
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                } catch (ActivityNotFoundException e22) {
                    throw e22;
                }
                break;
            case at.m /*5*/:
                if (Voip.d()) {
                    intent = new Intent(z[52], Media.EXTERNAL_CONTENT_URI);
                    break;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new Intent(z[57]).setType(z[55]).putExtra(z[53], ((long) a59.e) * 1048576));
                arrayList2.add(new Intent(z[42], Media.EXTERNAL_CONTENT_URI));
                HashSet hashSet = new HashSet();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    intent = (Intent) it.next();
                    List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
                    if (queryIntentActivities != null) {
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            String str = activityInfo.applicationInfo.packageName;
                            try {
                                Log.i(z[48] + str + z[46] + activityInfo.name);
                                if (!(str.contains(z[45]) || str.contains(z[56]))) {
                                    if (!str.contains(z[61])) {
                                        try {
                                            if (!str.contains(z[50])) {
                                                continue;
                                                if (i2 != 0) {
                                                    continue;
                                                }
                                            }
                                        } catch (ActivityNotFoundException e222) {
                                            throw e222;
                                        }
                                    }
                                }
                                try {
                                    if (hashSet.contains(str)) {
                                        continue;
                                    } else {
                                        Intent intent2 = (Intent) intent.clone();
                                        intent2.setClassName(str, activityInfo.name);
                                        intent2.setPackage(str);
                                        arrayList.add(intent2);
                                        hashSet.add(str);
                                        continue;
                                    }
                                    if (i2 != 0) {
                                        continue;
                                    }
                                } catch (ActivityNotFoundException e2222) {
                                    throw e2222;
                                }
                            } catch (ActivityNotFoundException e22222) {
                                throw e22222;
                            } catch (ActivityNotFoundException e222222) {
                                throw e222222;
                            }
                        }
                        continue;
                    }
                    if (i2 != 0) {
                        intent = new Intent(z[62]).setType(z[51]);
                        break;
                    }
                }
                intent = new Intent(z[62]).setType(z[51]);
            case arj.Toolbar_navigationContentDescription /*21*/:
            case arj.Toolbar_logoDescription /*22*/:
                if (i == 22) {
                    intent = new Intent(z[63], Images.Media.INTERNAL_CONTENT_URI, activity, GalleryPicker.class);
                    intent.putExtra(z[67], 10);
                } else {
                    intent = new Intent(z[49], Images.Media.INTERNAL_CONTENT_URI);
                }
                intent.setType(z[44]);
                break;
            case arj.Toolbar_titleTextColor /*23*/:
                intent = new Intent(z[58]).putExtra(z[59], Uri.fromFile(a((Context) activity, (byte) 1, z[47])));
                break;
            default:
                intent = null;
                break;
        }
        if (!arrayList.isEmpty()) {
            intent2 = Intent.createChooser(intent, null);
            intent2.putExtra(z[54], (Parcelable[]) arrayList.toArray(new Intent[0]));
            intent = intent2;
        }
        try {
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e2222222) {
            Log.e(z[66] + e2222222.toString());
            App.a((Context) activity, 2131230782, 0);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(android.graphics.Bitmap r11, int r12, float r13) {
        /*
        r6 = 0;
        r10 = 1;
        r9 = 0;
        if (r11 == 0) goto L_0x000b;
    L_0x0005:
        r0 = r11.isRecycled();	 Catch:{ NumberFormatException -> 0x000d }
        if (r0 == 0) goto L_0x000f;
    L_0x000b:
        r0 = 0;
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
        r1 = android.graphics.Bitmap.createBitmap(r12, r12, r0);
        r2 = new android.graphics.Canvas;
        r2.<init>(r1);
        r3 = new android.graphics.Paint;
        r3.<init>();
        r4 = new android.graphics.RectF;
        r0 = (float) r12;
        r5 = (float) r12;
        r4.<init>(r6, r6, r0, r5);
        r0 = r11.getWidth();
        r5 = r11.getHeight();
        r0 = r0 - r5;
        r5 = r0 / 2;
        if (r5 <= 0) goto L_0x0045;
    L_0x0033:
        r0 = new android.graphics.Rect;
        r6 = r11.getWidth();
        r6 = r6 - r5;
        r7 = r11.getHeight();
        r0.<init>(r5, r9, r6, r7);
        r6 = com.whatsapp.util.Log.h;
        if (r6 == 0) goto L_0x0054;
    L_0x0045:
        r0 = new android.graphics.Rect;
        r6 = -r5;
        r7 = r11.getWidth();
        r8 = r11.getHeight();
        r5 = r5 + r8;
        r0.<init>(r9, r6, r7, r5);
    L_0x0054:
        r3.setAntiAlias(r10);
        r3.setDither(r10);
        r3.setFilterBitmap(r10);
        r2.drawARGB(r9, r9, r9, r9);
        r5 = -1;
        r3.setColor(r5);
        r2.drawRoundRect(r4, r13, r13, r3);
        r5 = new android.graphics.PorterDuffXfermode;
        r6 = android.graphics.PorterDuff.Mode.SRC_IN;
        r5.<init>(r6);
        r3.setXfermode(r5);
        r2.drawBitmap(r11, r0, r4, r3);
        r0 = r1;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.a(android.graphics.Bitmap, int, float):android.graphics.Bitmap");
    }

    public static File a(Context context, byte b, String str) {
        a = a(context, str, b, 0, false);
        Editor edit = context.getSharedPreferences(z[71], 0).edit();
        try {
            edit.putString(z[69], a.getAbsolutePath());
            if (!edit.commit()) {
                Log.e(z[70]);
            }
            return a;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static Bitmap b(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(toByteArray, 0, toByteArray.length, e);
    }

    private static boolean b(Uri uri) {
        DataInputStream dataInputStream;
        Throwable th;
        boolean z = false;
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(c(uri));
            try {
                if (dataInputStream.readInt() == -2555936) {
                    dataInputStream.readShort();
                    if (dataInputStream.readInt() == 1246120262) {
                        z = true;
                    }
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (IOException e) {
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                } else if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException e3) {
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
            } catch (IOException e4) {
                throw e4;
            } catch (IOException e5) {
                dataInputStream2 = dataInputStream;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException e6) {
                    } catch (NumberFormatException e222) {
                        throw e222;
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            if (dataInputStream2 != null) {
                try {
                    dataInputStream2.close();
                } catch (IOException e8) {
                } catch (NumberFormatException e2222) {
                    throw e2222;
                }
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = null;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            throw th;
        }
        return z;
    }

    public static byte e(Uri uri) {
        String h = h(uri);
        if (h == null) {
            return (byte) -1;
        }
        try {
            return d(h);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void b() {
        Log.e(z[207] + (Debug.getNativeHeapAllocatedSize() / 1024) + z[208]);
        App.o.trimToSize(0);
    }

    public static boolean a(Activity activity, by byVar, String str, File file, byte b, int i, boolean z, String str2) {
        try {
            if (a(activity, byVar, file, b)) {
                return a(activity, str, file, b, i, z, str2);
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static File d(Uri uri) {
        Object obj;
        File file;
        String string;
        File file2;
        String str;
        File j;
        InputStream openInputStream;
        Throwable e;
        OutputStream outputStream = null;
        int i = Log.h;
        try {
            if (uri.getScheme() == null || uri.getScheme().equals(z[199])) {
                return new File(uri.getPath());
            }
            Cursor query;
            String str2;
            OutputStream outputStream2;
            byte[] bArr;
            int read;
            if (z[200].equals(uri.getAuthority())) {
                try {
                    query = App.at.query(uri, new String[]{z[197]}, null, null, null);
                } catch (IllegalArgumentException e2) {
                    query = null;
                    if (query != null) {
                        obj = null;
                        file = null;
                    } else {
                        try {
                            if (query.getColumnCount() > 0) {
                                if (query.moveToFirst()) {
                                    string = query.getString(0);
                                    if (string != null) {
                                        file2 = null;
                                    } else {
                                        file2 = new File(string);
                                        if (!file2.exists()) {
                                            string = null;
                                        }
                                    }
                                    query.close();
                                    str = string;
                                    file = file2;
                                    str2 = str;
                                }
                            }
                            string = null;
                            file2 = null;
                            query.close();
                            str = string;
                            file = file2;
                            str2 = str;
                        } catch (IllegalArgumentException e3) {
                            throw e3;
                        } catch (Throwable th) {
                            query.close();
                        }
                    }
                    if (str2 == null) {
                        return file;
                    }
                    try {
                        j = App.j(c());
                        openInputStream = App.at.openInputStream(uri);
                        if (openInputStream != null) {
                            outputStream2 = null;
                        } else {
                            try {
                                if (openInputStream instanceof FileInputStream) {
                                    a((FileInputStream) openInputStream);
                                }
                                try {
                                    outputStream2 = new FileOutputStream(j);
                                    try {
                                        bArr = new byte[4096];
                                        do {
                                            read = openInputStream.read(bArr, 0, bArr.length);
                                            if (read >= 0) {
                                                break;
                                            }
                                            outputStream2.write(bArr, 0, read);
                                            file = j;
                                        } while (i == 0);
                                        file = j;
                                    } catch (SecurityException e4) {
                                        e = e4;
                                        outputStream = outputStream2;
                                        try {
                                            Log.c(z[198], e);
                                            if (VERSION.SDK_INT < 9) {
                                                throw new IOException(e.getMessage());
                                            }
                                            throw new IOException(e);
                                        } catch (IllegalArgumentException e32) {
                                            throw e32;
                                        } catch (Throwable th2) {
                                            e = th2;
                                        }
                                    } catch (Throwable th3) {
                                        e = th3;
                                        outputStream = outputStream2;
                                        if (openInputStream != null) {
                                            try {
                                                openInputStream.close();
                                            } catch (IllegalArgumentException e322) {
                                                throw e322;
                                            }
                                        }
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (IllegalArgumentException e3222) {
                                                throw e3222;
                                            }
                                        }
                                        throw e;
                                    }
                                } catch (SecurityException e5) {
                                    e = e5;
                                }
                            } catch (IllegalArgumentException e32222) {
                                throw e32222;
                            } catch (IllegalArgumentException e322222) {
                                throw e322222;
                            }
                        }
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (IllegalArgumentException e3222222) {
                                throw e3222222;
                            }
                        }
                        if (outputStream2 != null) {
                            return file;
                        }
                        try {
                            outputStream2.close();
                            return file;
                        } catch (IllegalArgumentException e32222222) {
                            throw e32222222;
                        }
                    } catch (SecurityException e6) {
                        e = e6;
                        openInputStream = null;
                        Log.c(z[198], e);
                        if (VERSION.SDK_INT < 9) {
                            throw new IOException(e);
                        }
                        throw new IOException(e.getMessage());
                    } catch (Throwable th4) {
                        e = th4;
                        openInputStream = null;
                        if (openInputStream != null) {
                            openInputStream.close();
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw e;
                    }
                } catch (UnsupportedOperationException e7) {
                    query = null;
                    if (query != null) {
                        if (query.getColumnCount() > 0) {
                            if (query.moveToFirst()) {
                                string = query.getString(0);
                                if (string != null) {
                                    file2 = new File(string);
                                    if (file2.exists()) {
                                        string = null;
                                    }
                                } else {
                                    file2 = null;
                                }
                                query.close();
                                str = string;
                                file = file2;
                                str2 = str;
                            }
                        }
                        string = null;
                        file2 = null;
                        query.close();
                        str = string;
                        file = file2;
                        str2 = str;
                    } else {
                        obj = null;
                        file = null;
                    }
                    if (str2 == null) {
                        return file;
                    }
                    j = App.j(c());
                    openInputStream = App.at.openInputStream(uri);
                    if (openInputStream != null) {
                        if (openInputStream instanceof FileInputStream) {
                            a((FileInputStream) openInputStream);
                        }
                        outputStream2 = new FileOutputStream(j);
                        bArr = new byte[4096];
                        do {
                            read = openInputStream.read(bArr, 0, bArr.length);
                            if (read >= 0) {
                                break;
                            }
                            outputStream2.write(bArr, 0, read);
                            file = j;
                        } while (i == 0);
                        file = j;
                    } else {
                        outputStream2 = null;
                    }
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    if (outputStream2 != null) {
                        return file;
                    }
                    outputStream2.close();
                    return file;
                }
            }
            query = null;
            if (query != null) {
                if (query.getColumnCount() > 0) {
                    if (query.moveToFirst()) {
                        string = query.getString(0);
                        if (string != null) {
                            file2 = new File(string);
                            if (file2.exists()) {
                                string = null;
                            }
                        } else {
                            file2 = null;
                        }
                        query.close();
                        str = string;
                        file = file2;
                        str2 = str;
                    }
                }
                string = null;
                file2 = null;
                query.close();
                str = string;
                file = file2;
                str2 = str;
            } else {
                obj = null;
                file = null;
            }
            if (str2 == null) {
                return file;
            }
            j = App.j(c());
            openInputStream = App.at.openInputStream(uri);
            if (openInputStream != null) {
                if (openInputStream instanceof FileInputStream) {
                    a((FileInputStream) openInputStream);
                }
                outputStream2 = new FileOutputStream(j);
                bArr = new byte[4096];
                do {
                    read = openInputStream.read(bArr, 0, bArr.length);
                    if (read >= 0) {
                        break;
                    }
                    outputStream2.write(bArr, 0, read);
                } while (i == 0);
                file = j;
            } else {
                outputStream2 = null;
            }
            if (openInputStream != null) {
                openInputStream.close();
            }
            if (outputStream2 != null) {
                return file;
            }
            outputStream2.close();
            return file;
        } catch (IllegalArgumentException e322222222) {
            throw e322222222;
        }
    }

    public static byte[] a(String str, long j) {
        if (j == 0) {
            try {
                return b(str);
            } catch (Exception e) {
                throw e;
            }
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            return a(mediaMetadataRetriever.getFrameAtTime(j));
        } catch (Exception e2) {
            mediaMetadataRetriever.release();
            return null;
        } catch (NoSuchMethodError e3) {
            mediaMetadataRetriever.release();
            return null;
        }
    }

    public static void b(Activity activity, String str) {
        Intent intent = new Intent(z[127], Images.Media.INTERNAL_CONTENT_URI, activity, GalleryPicker.class);
        intent.putExtra(z[124], 10);
        intent.putExtra(z[126], str);
        intent.setType(z[125]);
        activity.startActivityForResult(intent, 22);
    }

    public static boolean a(Context context, String str, File file, byte b, int i, boolean z, String str2) {
        byte[] b2;
        Log.i(z[190] + file.getAbsolutePath() + " " + file.length());
        if (z || Log.h != 0) {
            File a = a(context, file, b, i, true);
            Log.i(z[189] + a.getAbsolutePath());
            a(file, a);
            file = a;
        }
        MediaData mediaData = new MediaData();
        mediaData.file = file;
        if (b == 3) {
            b2 = b(mediaData.file.getAbsolutePath());
        } else {
            b2 = null;
        }
        App.a(str, b2, mediaData, b, i, str2, null);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r12, byte r13, int r14, boolean r15) {
        /*
        r11 = 19;
        r0 = 0;
        r4 = com.whatsapp.util.Log.h;
        r1 = -1;
        r2 = com.whatsapp.dg.a(r13, r14, r15);
        r3 = r2.exists();
        if (r3 == 0) goto L_0x008f;
    L_0x0010:
        r5 = r2.listFiles();
        if (r5 == 0) goto L_0x0067;
    L_0x0016:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = a(r13, r14);
        r2 = r2.append(r3);
        r3 = "-";
        r2 = r2.append(r3);
        r2 = r2.append(r12);
        r3 = z;
        r6 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r6 = r2.toString();
        r2 = r5.length;
        r7 = r5.length;
        r3 = r0;
    L_0x003f:
        if (r3 >= r7) goto L_0x00fd;
    L_0x0041:
        r0 = r5[r3];
        r0 = r0.getName();
        r8 = r0.startsWith(r6);	 Catch:{ NumberFormatException -> 0x00d4 }
        if (r8 == 0) goto L_0x00f1;
    L_0x004d:
        r8 = r0.length();	 Catch:{ NumberFormatException -> 0x00d4 }
        if (r8 <= r11) goto L_0x00f1;
    L_0x0053:
        r8 = 15;
        r8 = r0.substring(r8, r11);
        r0 = java.lang.Integer.parseInt(r8);	 Catch:{ NumberFormatException -> 0x00d6 }
        if (r0 <= r1) goto L_0x00f1;
    L_0x005f:
        r1 = r3 + 1;
        if (r4 == 0) goto L_0x00f9;
    L_0x0063:
        if (r4 == 0) goto L_0x00f6;
    L_0x0065:
        r1 = r0;
        r0 = r2;
    L_0x0067:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00f4 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x00f4 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x00f4 }
        r4 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00f4 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x00f4 }
        r2 = r2.append(r13);	 Catch:{ NumberFormatException -> 0x00f4 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x00f4 }
        r4 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00f4 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x00f4 }
        r2 = r2.append(r14);	 Catch:{ NumberFormatException -> 0x00f4 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x00f4 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x00f4 }
    L_0x008f:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r13);
        r3 = z;
        r4 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r14);
        r3 = z;
        r4 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r3 = z;
        r4 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return r1;
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r8 = move-exception;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = z;
        r10 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r0 = r8.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x00f1:
        r0 = r1;
        goto L_0x005f;
    L_0x00f4:
        r0 = move-exception;
        throw r0;
    L_0x00f6:
        r1 = r0;
        r0 = r2;
        goto L_0x008f;
    L_0x00f9:
        r3 = r1;
        r1 = r0;
        goto L_0x003f;
    L_0x00fd:
        r0 = r1;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.a(java.lang.String, byte, int, boolean):int");
    }

    public static boolean a(String str, byte b, File file) {
        if (b == 3) {
            try {
                if (file.length() > ((long) a59.e) * 1048576) {
                    return true;
                }
                try {
                    if (App.as.a(str, c7.ALLOW)) {
                        if (!b.e(file)) {
                            return true;
                        }
                    }
                    return false;
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } else if (b != 2) {
            return false;
        } else {
            try {
                if (App.as.a(str, a3m.ALLOW)) {
                    if (!b.b(file)) {
                        return true;
                    }
                }
                return false;
            } catch (NumberFormatException e222) {
                throw e222;
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        }
    }

    public static File a(Context context, String str, String str2, byte b, int i, boolean z) {
        int i2 = Log.h;
        try {
            File a;
            if (TextUtils.isEmpty(str2)) {
                a = a(context, str, b, i, z);
            } else {
                a = null;
                int i3 = 0;
                while (i3 < 1000) {
                    try {
                        String str3;
                        StringBuilder append = new StringBuilder().append(str2);
                        if (i3 == 0) {
                            str3 = "";
                        } else {
                            str3 = "-" + i3;
                        }
                        a = App.a(append.append(str3).append(str).toString(), b, i, z);
                        try {
                            if (!a.exists() && i2 == 0) {
                                break;
                            }
                            i3++;
                            if (i2 != 0) {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            throw e;
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
            }
            return a;
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    public static void a(Context context, String str, Uri uri) {
        MediaData mediaData = new MediaData();
        byte[] a = a(context, uri, mediaData);
        String queryParameter = uri.getQueryParameter(z[73]);
        try {
            if (Looper.myLooper() == context.getMainLooper()) {
                App.a(str, a, mediaData, (byte) 1, 0, queryParameter, null);
                if (Log.h == 0) {
                    return;
                }
            }
            new Handler(context.getMainLooper()).post(new bo(str, a, mediaData, queryParameter));
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.whatsapp.protocol.co r12) {
        /*
        r10 = 0;
        r1 = 1;
        r2 = 0;
        r0 = r12.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r3 = r12.q;	 Catch:{ NumberFormatException -> 0x0013 }
        if (r3 == 0) goto L_0x0019;
    L_0x000c:
        if (r0 == 0) goto L_0x0012;
    L_0x000e:
        r3 = r0.file;	 Catch:{ NumberFormatException -> 0x0017 }
        if (r3 != 0) goto L_0x0019;
    L_0x0012:
        return r2;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r3 = r0.transcoded;	 Catch:{ NumberFormatException -> 0x003d }
        if (r3 != 0) goto L_0x0012;
    L_0x001d:
        r3 = r12.c;	 Catch:{ NumberFormatException -> 0x003f }
        r4 = 3;
        if (r3 != r4) goto L_0x0068;
    L_0x0022:
        r4 = r12.z;	 Catch:{ NumberFormatException -> 0x0041 }
        r3 = com.whatsapp.a59.e;	 Catch:{ NumberFormatException -> 0x0041 }
        r6 = (long) r3;
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r6 = r6 * r8;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 > 0) goto L_0x003b;
    L_0x002f:
        r4 = r0.trimFrom;	 Catch:{ NumberFormatException -> 0x0043 }
        r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r3 > 0) goto L_0x003b;
    L_0x0035:
        r4 = r0.trimTo;	 Catch:{ NumberFormatException -> 0x0045 }
        r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r3 <= 0) goto L_0x0047;
    L_0x003b:
        r2 = r1;
        goto L_0x0012;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r3 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x0062 }
        r4 = r12.k;	 Catch:{ NumberFormatException -> 0x0062 }
        r4 = r4.c;	 Catch:{ NumberFormatException -> 0x0062 }
        r5 = r12.g;	 Catch:{ NumberFormatException -> 0x0062 }
        r6 = com.whatsapp.c7.ALLOW;	 Catch:{ NumberFormatException -> 0x0062 }
        r3 = r3.a(r4, r5, r6);	 Catch:{ NumberFormatException -> 0x0062 }
        if (r3 == 0) goto L_0x0066;
    L_0x0057:
        r0 = r0.file;	 Catch:{ NumberFormatException -> 0x0064 }
        r0 = com.whatsapp.util.b.e(r0);	 Catch:{ NumberFormatException -> 0x0064 }
        if (r0 != 0) goto L_0x0066;
    L_0x005f:
        r0 = r1;
    L_0x0060:
        r2 = r0;
        goto L_0x0012;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = r2;
        goto L_0x0060;
    L_0x0068:
        r3 = r12.c;	 Catch:{ NumberFormatException -> 0x0087 }
        r4 = 2;
        if (r3 != r4) goto L_0x0012;
    L_0x006d:
        r3 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x0089 }
        r4 = r12.k;	 Catch:{ NumberFormatException -> 0x0089 }
        r4 = r4.c;	 Catch:{ NumberFormatException -> 0x0089 }
        r5 = r12.g;	 Catch:{ NumberFormatException -> 0x0089 }
        r6 = com.whatsapp.a3m.ALLOW;	 Catch:{ NumberFormatException -> 0x0089 }
        r3 = r3.a(r4, r5, r6);	 Catch:{ NumberFormatException -> 0x0089 }
        if (r3 == 0) goto L_0x008d;
    L_0x007d:
        r0 = r0.file;	 Catch:{ NumberFormatException -> 0x008b }
        r0 = com.whatsapp.util.b.b(r0);	 Catch:{ NumberFormatException -> 0x008b }
        if (r0 != 0) goto L_0x008d;
    L_0x0085:
        r2 = r1;
        goto L_0x0012;
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0089 }
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        throw r0;
    L_0x008d:
        r1 = r2;
        goto L_0x0085;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.a(com.whatsapp.protocol.co):boolean");
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(35);
            if (lastIndexOf > 0) {
                str = str.substring(0, lastIndexOf);
            }
            lastIndexOf = str.lastIndexOf(63);
            if (lastIndexOf > 0) {
                str = str.substring(0, lastIndexOf);
            }
            lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf >= 0) {
                try {
                    str = str.substring(lastIndexOf + 1);
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                try {
                    return str.substring(lastIndexOf + 1);
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        }
        return "";
    }

    private static synchronized String a(Context context, int i, int i2) {
        String a;
        synchronized (ag.class) {
            b(context);
            Editor edit = context.getSharedPreferences(z[118], 0).edit();
            a = cs.a();
            try {
                if (!a.equals(c)) {
                    d = 0;
                    c = a;
                    edit.putString(z[119], c);
                }
                a = a(i, i2) + "-" + c + z[120] + f.format((long) d);
                d++;
                edit.putInt(z[121], d);
                if (!edit.commit()) {
                    Log.e(z[116]);
                }
                Log.i(z[117] + a);
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        return a;
    }

    public static byte[] b(String str) {
        return a(e(str));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(java.lang.String r5) {
        /*
        r1 = com.whatsapp.util.Log.h;
        r2 = r5.toLowerCase();
        r0 = -1;
        r3 = r2.hashCode();	 Catch:{ NumberFormatException -> 0x00a2 }
        switch(r3) {
            case 99640: goto L_0x0029;
            case 110834: goto L_0x001a;
            case 111220: goto L_0x0047;
            case 113252: goto L_0x0092;
            case 115312: goto L_0x0083;
            case 118783: goto L_0x0065;
            case 3088960: goto L_0x0038;
            case 3447940: goto L_0x0056;
            case 3682393: goto L_0x0074;
            default: goto L_0x000e;
        };
    L_0x000e:
        switch(r0) {
            case 0: goto L_0x00b4;
            case 1: goto L_0x00be;
            case 2: goto L_0x00c6;
            case 3: goto L_0x00ce;
            case 4: goto L_0x00d6;
            case 5: goto L_0x00de;
            case 6: goto L_0x00e6;
            case 7: goto L_0x00ee;
            case 8: goto L_0x00f6;
            default: goto L_0x0011;
        };
    L_0x0011:
        r0 = android.webkit.MimeTypeMap.getSingleton();
        r0 = r0.getMimeTypeFromExtension(r5);
    L_0x0019:
        return r0;
    L_0x001a:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00a2 }
        r4 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00a2 }
        r3 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x00a2 }
        if (r3 == 0) goto L_0x000e;
    L_0x0026:
        r0 = 0;
        if (r1 == 0) goto L_0x000e;
    L_0x0029:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00a4 }
        r4 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00a4 }
        r3 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x00a4 }
        if (r3 == 0) goto L_0x000e;
    L_0x0035:
        r0 = 1;
        if (r1 == 0) goto L_0x000e;
    L_0x0038:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00a6 }
        r4 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00a6 }
        r3 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x00a6 }
        if (r3 == 0) goto L_0x000e;
    L_0x0044:
        r0 = 2;
        if (r1 == 0) goto L_0x000e;
    L_0x0047:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00a8 }
        r4 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00a8 }
        r3 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x00a8 }
        if (r3 == 0) goto L_0x000e;
    L_0x0053:
        r0 = 3;
        if (r1 == 0) goto L_0x000e;
    L_0x0056:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00aa }
        r4 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00aa }
        r3 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x00aa }
        if (r3 == 0) goto L_0x000e;
    L_0x0062:
        r0 = 4;
        if (r1 == 0) goto L_0x000e;
    L_0x0065:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00ac }
        r4 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00ac }
        r3 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x00ac }
        if (r3 == 0) goto L_0x000e;
    L_0x0071:
        r0 = 5;
        if (r1 == 0) goto L_0x000e;
    L_0x0074:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00ae }
        r4 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00ae }
        r3 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x00ae }
        if (r3 == 0) goto L_0x000e;
    L_0x0080:
        r0 = 6;
        if (r1 == 0) goto L_0x000e;
    L_0x0083:
        r3 = z;	 Catch:{ NumberFormatException -> 0x00b0 }
        r4 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x00b0 }
        r3 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x00b0 }
        if (r3 == 0) goto L_0x000e;
    L_0x008f:
        r0 = 7;
        if (r1 == 0) goto L_0x000e;
    L_0x0092:
        r1 = z;	 Catch:{ NumberFormatException -> 0x00b2 }
        r3 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x00b2 }
        r1 = r2.equals(r1);	 Catch:{ NumberFormatException -> 0x00b2 }
        if (r1 == 0) goto L_0x000e;
    L_0x009e:
        r0 = 8;
        goto L_0x000e;
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        throw r0;
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r0 = z;	 Catch:{ NumberFormatException -> 0x00bc }
        r1 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00bc }
        goto L_0x0019;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r0 = z;
        r1 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r0 = r0[r1];
        goto L_0x0019;
    L_0x00c6:
        r0 = z;
        r1 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r0 = r0[r1];
        goto L_0x0019;
    L_0x00ce:
        r0 = z;
        r1 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r0 = r0[r1];
        goto L_0x0019;
    L_0x00d6:
        r0 = z;
        r1 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r0 = r0[r1];
        goto L_0x0019;
    L_0x00de:
        r0 = z;
        r1 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r0 = r0[r1];
        goto L_0x0019;
    L_0x00e6:
        r0 = z;
        r1 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r0 = r0[r1];
        goto L_0x0019;
    L_0x00ee:
        r0 = z;
        r1 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r0 = r0[r1];
        goto L_0x0019;
    L_0x00f6:
        r0 = z;
        r1 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r0 = r0[r1];
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.f(java.lang.String):java.lang.String");
    }

    public static File a(Context context, File file, byte b, int i, boolean z) {
        return a(context, "." + a1.b(file), b, i, z);
    }

    public static Bitmap a(Uri uri, File file) {
        OutputStream fileOutputStream;
        Throwable th;
        InputStream inputStream = null;
        boolean z = true;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        Matrix f = f(uri);
        Options a = a(uri, a59.f);
        if (f == null) {
            try {
                if (a.outWidth <= a59.f) {
                    if (a.outHeight <= a59.f) {
                        try {
                            if (b(uri)) {
                                Log.i(z[206] + uri + " " + a.outWidth + "x" + a.outHeight);
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        inputStream = c(uri);
                                        int a2 = a(inputStream, fileOutputStream);
                                        if (a2 != 0) {
                                            try {
                                                if (((long) a2) <= ((long) a59.l) * 1024) {
                                                    z = false;
                                                }
                                            } catch (OutOfMemoryError e) {
                                                throw e;
                                            } catch (OutOfMemoryError e2) {
                                                throw e2;
                                            }
                                        }
                                        Log.i(z[203] + a2 + z[202] + a59.l + z[205] + z);
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (OutOfMemoryError e22) {
                                                throw e22;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (OutOfMemoryError e222) {
                                            throw e222;
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (OutOfMemoryError e2222) {
                                            throw e2222;
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } catch (OutOfMemoryError e22222) {
                            throw e22222;
                        }
                    }
                }
            } catch (OutOfMemoryError e222222) {
                throw e222222;
            } catch (OutOfMemoryError e2222222) {
                throw e2222222;
            }
        }
        if (z) {
            Bitmap a3;
            try {
                a3 = a(uri, a59.f, a59.f, a, f);
            } catch (OutOfMemoryError e3) {
                a.inSampleSize *= 2;
                Log.i(z[201] + a.inSampleSize);
                a3 = a(uri, a59.f, a59.f, a, f);
            }
            OutputStream fileOutputStream2 = new FileOutputStream(file);
            boolean compress = a3.compress(CompressFormat.JPEG, a59.d, fileOutputStream2);
            fileOutputStream2.close();
            a3.recycle();
            if (!compress) {
                try {
                    if (App.T() < ((long) (a59.l * 1024))) {
                        throw new IOException(z[204]);
                    }
                    throw new IOException();
                } catch (OutOfMemoryError e22222222) {
                    throw e22222222;
                }
            }
        }
        return a(uri, 100, 100);
    }

    public static void a(byte[] bArr, File file) {
        OutputStream bufferedOutputStream;
        Throwable th;
        if (bArr != null) {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    bufferedOutputStream.write(bArr);
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e2) {
                        } catch (NumberFormatException e3) {
                            throw e3;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        }
    }

    public static Bitmap e(String str) {
        Class cls;
        Object newInstance;
        Object obj;
        Class cls2;
        Throwable e;
        try {
            cls = Class.forName(z[31]);
            try {
                newInstance = cls.newInstance();
                try {
                    Bitmap bitmap;
                    cls.getMethod(z[24], new Class[]{String.class}).invoke(newInstance, new Object[]{str});
                    if (VERSION.SDK_INT <= 9) {
                        bitmap = (Bitmap) cls.getMethod(z[23], new Class[0]).invoke(newInstance, new Object[0]);
                    } else {
                        byte[] bArr = (byte[]) cls.getMethod(z[22], new Class[0]).invoke(newInstance, new Object[0]);
                        if (bArr != null) {
                            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, e);
                        } else {
                            bitmap = null;
                        }
                        if (bitmap == null) {
                            bitmap = (Bitmap) cls.getMethod(z[36], new Class[0]).invoke(newInstance, new Object[0]);
                            if (bitmap != null) {
                                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                bitmap.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
                                bArr = byteArrayOutputStream.toByteArray();
                                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, e);
                            }
                        }
                    }
                    if (bitmap != null) {
                        try {
                            if (VERSION.SDK_INT < 11) {
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    try {
                                        ck ckVar = new ck();
                                        ckVar.a(new File(str));
                                        cl a = ckVar.a();
                                        if (a != null) {
                                            try {
                                                if (a.b() > 0) {
                                                    if (a.a()) {
                                                        Log.i(z[27] + a.b());
                                                        bitmap = ao.a(bitmap, a.b());
                                                    }
                                                }
                                            } catch (IOException e2) {
                                                throw e2;
                                            } catch (IOException e22) {
                                                throw e22;
                                            }
                                        }
                                    } catch (Throwable e3) {
                                        Log.a(e3);
                                    }
                                }
                            }
                        } catch (IOException e4) {
                            throw e4;
                        } catch (IOException e42) {
                            throw e42;
                        }
                    }
                    if (newInstance == null) {
                        return bitmap;
                    }
                    try {
                        cls.getMethod(z[32], new Class[0]).invoke(newInstance, new Object[0]);
                        return bitmap;
                    } catch (LinkageError e5) {
                        throw e5;
                    } catch (Exception e6) {
                        return bitmap;
                    }
                } catch (IllegalArgumentException e7) {
                    obj = newInstance;
                    cls2 = cls;
                } catch (RuntimeException e8) {
                    if (newInstance != null) {
                        try {
                            cls.getMethod(z[28], new Class[0]).invoke(newInstance, new Object[0]);
                        } catch (LinkageError e9) {
                            throw e9;
                        } catch (Exception e10) {
                        }
                    }
                    return null;
                } catch (InstantiationException e11) {
                    e = e11;
                    try {
                        Log.a(e);
                        if (newInstance != null) {
                            try {
                                cls.getMethod(z[33], new Class[0]).invoke(newInstance, new Object[0]);
                            } catch (Exception e12) {
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        e = th;
                        if (newInstance != null) {
                            try {
                                cls.getMethod(z[26], new Class[0]).invoke(newInstance, new Object[0]);
                            } catch (LinkageError e52) {
                                throw e52;
                            } catch (Exception e13) {
                            }
                        }
                        throw e;
                    }
                } catch (InvocationTargetException e14) {
                    e = e14;
                    Log.a(e);
                    if (newInstance != null) {
                        try {
                            cls.getMethod(z[37], new Class[0]).invoke(newInstance, new Object[0]);
                        } catch (Exception e15) {
                        }
                    }
                    return null;
                } catch (ClassNotFoundException e16) {
                    e = e16;
                    Log.a(e);
                    if (newInstance != null) {
                        try {
                            cls.getMethod(z[25], new Class[0]).invoke(newInstance, new Object[0]);
                        } catch (Exception e17) {
                        }
                    }
                    return null;
                } catch (NoSuchMethodException e18) {
                    e = e18;
                    Log.a(e);
                    if (newInstance != null) {
                        try {
                            cls.getMethod(z[34], new Class[0]).invoke(newInstance, new Object[0]);
                        } catch (Exception e19) {
                        }
                    }
                    return null;
                } catch (IllegalAccessException e20) {
                    e = e20;
                    Log.a(e);
                    if (newInstance != null) {
                        try {
                            cls.getMethod(z[35], new Class[0]).invoke(newInstance, new Object[0]);
                        } catch (Exception e21) {
                        }
                    }
                    return null;
                } catch (LinkageError e23) {
                    e = e23;
                    Log.a(e);
                    if (newInstance != null) {
                        try {
                            cls.getMethod(z[30], new Class[0]).invoke(newInstance, new Object[0]);
                        } catch (Exception e24) {
                        }
                    }
                    return null;
                }
            } catch (IllegalArgumentException e25) {
                obj = null;
                cls2 = cls;
                if (obj != null) {
                    try {
                        cls2.getMethod(z[29], new Class[0]).invoke(obj, new Object[0]);
                    } catch (LinkageError e92) {
                        throw e92;
                    } catch (Exception e26) {
                    }
                }
                return null;
            } catch (RuntimeException e27) {
                newInstance = null;
                if (newInstance != null) {
                    cls.getMethod(z[28], new Class[0]).invoke(newInstance, new Object[0]);
                }
                return null;
            } catch (InstantiationException e28) {
                e = e28;
                newInstance = null;
                Log.a(e);
                if (newInstance != null) {
                    cls.getMethod(z[33], new Class[0]).invoke(newInstance, new Object[0]);
                }
                return null;
            } catch (InvocationTargetException e29) {
                e = e29;
                newInstance = null;
                Log.a(e);
                if (newInstance != null) {
                    cls.getMethod(z[37], new Class[0]).invoke(newInstance, new Object[0]);
                }
                return null;
            } catch (ClassNotFoundException e30) {
                e = e30;
                newInstance = null;
                Log.a(e);
                if (newInstance != null) {
                    cls.getMethod(z[25], new Class[0]).invoke(newInstance, new Object[0]);
                }
                return null;
            } catch (NoSuchMethodException e31) {
                e = e31;
                newInstance = null;
                Log.a(e);
                if (newInstance != null) {
                    cls.getMethod(z[34], new Class[0]).invoke(newInstance, new Object[0]);
                }
                return null;
            } catch (IllegalAccessException e32) {
                e = e32;
                newInstance = null;
                Log.a(e);
                if (newInstance != null) {
                    cls.getMethod(z[35], new Class[0]).invoke(newInstance, new Object[0]);
                }
                return null;
            } catch (LinkageError e33) {
                e = e33;
                newInstance = null;
                Log.a(e);
                if (newInstance != null) {
                    cls.getMethod(z[30], new Class[0]).invoke(newInstance, new Object[0]);
                }
                return null;
            } catch (Throwable th2) {
                e = th2;
                newInstance = null;
                if (newInstance != null) {
                    cls.getMethod(z[26], new Class[0]).invoke(newInstance, new Object[0]);
                }
                throw e;
            }
        } catch (IllegalArgumentException e34) {
            obj = null;
            cls2 = null;
            if (obj != null) {
                cls2.getMethod(z[29], new Class[0]).invoke(obj, new Object[0]);
            }
            return null;
        } catch (RuntimeException e35) {
            newInstance = null;
            cls = null;
            if (newInstance != null) {
                cls.getMethod(z[28], new Class[0]).invoke(newInstance, new Object[0]);
            }
            return null;
        } catch (InstantiationException e36) {
            e = e36;
            newInstance = null;
            cls = null;
            Log.a(e);
            if (newInstance != null) {
                cls.getMethod(z[33], new Class[0]).invoke(newInstance, new Object[0]);
            }
            return null;
        } catch (InvocationTargetException e37) {
            e = e37;
            newInstance = null;
            cls = null;
            Log.a(e);
            if (newInstance != null) {
                cls.getMethod(z[37], new Class[0]).invoke(newInstance, new Object[0]);
            }
            return null;
        } catch (ClassNotFoundException e38) {
            e = e38;
            newInstance = null;
            cls = null;
            Log.a(e);
            if (newInstance != null) {
                cls.getMethod(z[25], new Class[0]).invoke(newInstance, new Object[0]);
            }
            return null;
        } catch (NoSuchMethodException e39) {
            e = e39;
            newInstance = null;
            cls = null;
            Log.a(e);
            if (newInstance != null) {
                cls.getMethod(z[34], new Class[0]).invoke(newInstance, new Object[0]);
            }
            return null;
        } catch (IllegalAccessException e40) {
            e = e40;
            newInstance = null;
            cls = null;
            Log.a(e);
            if (newInstance != null) {
                cls.getMethod(z[35], new Class[0]).invoke(newInstance, new Object[0]);
            }
            return null;
        } catch (LinkageError e41) {
            e = e41;
            newInstance = null;
            cls = null;
            Log.a(e);
            if (newInstance != null) {
                cls.getMethod(z[30], new Class[0]).invoke(newInstance, new Object[0]);
            }
            return null;
        } catch (Throwable th3) {
            e = th3;
            newInstance = null;
            cls = null;
            if (newInstance != null) {
                cls.getMethod(z[26], new Class[0]).invoke(newInstance, new Object[0]);
            }
            throw e;
        }
    }

    public static Matrix a(int i) {
        Matrix matrix;
        switch (i) {
            case at.i /*2*/:
                matrix = new Matrix();
                matrix.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix;
            case at.o /*3*/:
                matrix = new Matrix();
                matrix.setRotate(180.0f);
                return matrix;
            case at.p /*4*/:
                matrix = new Matrix();
                matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix;
            case at.m /*5*/:
                matrix = new Matrix();
                matrix.setValues(new float[]{0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix;
            case Y.f /*6*/:
                matrix = new Matrix();
                matrix.setRotate(90.0f);
                return matrix;
            case aF.v /*7*/:
                matrix = new Matrix();
                matrix.setValues(new float[]{0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix;
            case aF.u /*8*/:
                matrix = new Matrix();
                matrix.setRotate(270.0f);
                return matrix;
            default:
                return null;
        }
    }

    public static void a(Activity activity, String str) {
        Intent intent = new Intent(activity, DocumentPickerActivity.class);
        intent.putExtra(z[171], str);
        activity.startActivityForResult(intent, 6);
    }

    public static boolean a(Activity activity, by byVar, File file, byte b) {
        try {
            int i;
            Log.i(z[188] + file.getAbsolutePath());
            long length = file.length();
            if (b == 9) {
                i = a59.i;
            } else {
                i = a59.e;
            }
            if (length <= ((long) i) * 1048576) {
                return true;
            }
            try {
                Log.w(z[187] + file.length());
                if (byVar == null) {
                    return false;
                }
                byVar.f(activity.getString(2131231149, new Object[]{Integer.valueOf(a59.e)}));
                return false;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.InputStream c(android.net.Uri r5) {
        /*
        r1 = r5.buildUpon();
        r2 = 0;
        r1 = r1.query(r2);
        r1 = r1.build();
        r2 = r1.getScheme();	 Catch:{ NumberFormatException -> 0x0047 }
        if (r2 == 0) goto L_0x0023;
    L_0x0013:
        r2 = r1.getScheme();	 Catch:{ NumberFormatException -> 0x0047 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0047 }
        r4 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0047 }
        r2 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x0047 }
        if (r2 == 0) goto L_0x0035;
    L_0x0023:
        r2 = new java.io.FileInputStream;
        r3 = new java.io.File;
        r4 = r1.getPath();
        r3.<init>(r4);
        r2.<init>(r3);
        r3 = com.whatsapp.util.Log.h;
        if (r3 == 0) goto L_0x003b;
    L_0x0035:
        r2 = com.whatsapp.App.at;
        r2 = r2.openInputStream(r1);
    L_0x003b:
        r1 = r2 instanceof java.io.FileInputStream;	 Catch:{ NumberFormatException -> 0x0049 }
        if (r1 == 0) goto L_0x0046;
    L_0x003f:
        r0 = r2;
        r0 = (java.io.FileInputStream) r0;	 Catch:{ NumberFormatException -> 0x0049 }
        r1 = r0;
        a(r1);	 Catch:{ NumberFormatException -> 0x0049 }
    L_0x0046:
        return r2;
    L_0x0047:
        r1 = move-exception;
        throw r1;
    L_0x0049:
        r1 = move-exception;
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.c(android.net.Uri):java.io.InputStream");
    }

    public static float a(int i, int i2, long j) {
        if (i == 0 || i2 == 0) {
            return 3.0f;
        }
        float f = (8000.0f * ((float) ((a59.e * 1024) * 1024))) / ((float) (((i * i2) * 3) + 96000));
        f = Math.max(0.0f, f - ((float) j)) / f;
        return 3.0f + (f * (6.0f * f));
    }

    public static boolean a(byte b, File file) {
        if (b == 3) {
            try {
                return akr.c(file);
            } catch (NumberFormatException e) {
                throw e;
            }
        } else if (b != 2) {
            return false;
        } else {
            try {
                return mn.a(file);
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
    }

    public static void a(Context context, co coVar) {
        try {
            if (coVar.c == 2) {
                if (coVar.r == 1) {
                    return;
                }
            }
            File file = ((MediaData) coVar.Q).file;
            if (file != null) {
                try {
                    if (file.exists()) {
                        a(context, Uri.fromFile(file));
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r8, com.whatsapp.MediaData r9) {
        /*
        r3 = 1;
        r2 = 0;
        r0 = new android.graphics.BitmapFactory$Options;
        r0.<init>();
        r0.inJustDecodeBounds = r3;
        r1 = r8.getAbsolutePath();
        android.graphics.BitmapFactory.decodeFile(r1, r0);
        r4 = r0.outWidth;
        r5 = r0.outHeight;
        r1 = r0.outWidth;
        r1 = r1 / 400;
        r6 = r0.outHeight;
        r6 = r6 / 400;
        r1 = java.lang.Math.max(r1, r6);
        r0.inSampleSize = r1;
        r0.inJustDecodeBounds = r2;
        r0.inInputShareable = r3;
        r0.inPurgeable = r3;
        r1 = android.graphics.Bitmap.Config.RGB_565;
        r0.inPreferredConfig = r1;
        r1 = com.whatsapp.qi.a(r8);	 Catch:{ IOException -> 0x00bf }
        r6 = r1.length;
        r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r6, r0);
        if (r1 != 0) goto L_0x0038;
    L_0x0037:
        return r2;
    L_0x0038:
        r0 = r1.getWidth();
        r0 = r0 & 1;
        if (r0 != r3) goto L_0x00c2;
    L_0x0040:
        r0 = r1.getWidth();
        r0 = r0 + -1;
        r6 = r1.getHeight();
        r0 = android.graphics.Bitmap.createBitmap(r1, r2, r2, r0, r6);
        if (r1 == r0) goto L_0x0053;
    L_0x0050:
        r1.recycle();	 Catch:{ IOException -> 0x00b3 }
    L_0x0053:
        r1 = new android.media.FaceDetector;
        r6 = r0.getWidth();
        r7 = r0.getHeight();
        r1.<init>(r6, r7, r3);
        r6 = new android.media.FaceDetector.Face[r3];
        r1 = r1.findFaces(r0, r6);
        if (r1 <= 0) goto L_0x009f;
    L_0x0068:
        r1 = 0;
        r1 = r6[r1];	 Catch:{ IOException -> 0x00b5 }
        r1 = r1.confidence();	 Catch:{ IOException -> 0x00b5 }
        r7 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r1 <= 0) goto L_0x009f;
    L_0x0076:
        r1 = new android.graphics.PointF;
        r1.<init>();
        r7 = 0;
        r6 = r6[r7];	 Catch:{ IOException -> 0x00b7 }
        r6.getMidPoint(r1);	 Catch:{ IOException -> 0x00b7 }
        r6 = r1.x;	 Catch:{ IOException -> 0x00b7 }
        r4 = (float) r4;	 Catch:{ IOException -> 0x00b7 }
        r4 = r4 * r6;
        r6 = r0.getWidth();	 Catch:{ IOException -> 0x00b7 }
        r6 = (float) r6;	 Catch:{ IOException -> 0x00b7 }
        r4 = r4 / r6;
        r4 = (int) r4;	 Catch:{ IOException -> 0x00b7 }
        r9.faceX = r4;	 Catch:{ IOException -> 0x00b7 }
        r1 = r1.y;	 Catch:{ IOException -> 0x00b7 }
        r4 = (float) r5;	 Catch:{ IOException -> 0x00b7 }
        r1 = r1 * r4;
        r4 = r0.getHeight();	 Catch:{ IOException -> 0x00b7 }
        r4 = (float) r4;	 Catch:{ IOException -> 0x00b7 }
        r1 = r1 / r4;
        r1 = (int) r1;	 Catch:{ IOException -> 0x00b7 }
        r9.faceY = r1;	 Catch:{ IOException -> 0x00b7 }
        r1 = com.whatsapp.util.Log.h;	 Catch:{ IOException -> 0x00b7 }
        if (r1 == 0) goto L_0x00a5;
    L_0x009f:
        r1 = -1;
        r9.faceX = r1;	 Catch:{ IOException -> 0x00b7 }
        r1 = -1;
        r9.faceY = r1;	 Catch:{ IOException -> 0x00b7 }
    L_0x00a5:
        r0.recycle();	 Catch:{ IOException -> 0x00b9 }
        r0 = r9.faceX;	 Catch:{ IOException -> 0x00b9 }
        if (r0 > 0) goto L_0x00b0;
    L_0x00ac:
        r0 = r9.faceY;	 Catch:{ IOException -> 0x00bb }
        if (r0 <= 0) goto L_0x00bd;
    L_0x00b0:
        r0 = r3;
    L_0x00b1:
        r2 = r0;
        goto L_0x0037;
    L_0x00b3:
        r0 = move-exception;
        throw r0;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        throw r0;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;
    L_0x00bd:
        r0 = r2;
        goto L_0x00b1;
    L_0x00bf:
        r0 = move-exception;
        goto L_0x0037;
    L_0x00c2:
        r0 = r1;
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ag.a(java.io.File, com.whatsapp.MediaData):boolean");
    }

    public static synchronized void a(Context context) {
        synchronized (ag.class) {
            if (d > 0) {
                Editor edit = context.getSharedPreferences(z[38], 0).edit();
                try {
                    d--;
                    edit.putInt(z[39], d);
                    if (!edit.commit()) {
                        Log.e(z[40]);
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        }
    }

    private static Bitmap a(Uri uri, int i, int i2, Options options, Matrix matrix) {
        byte[] a = qi.a(c(uri));
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length, options);
        if (decodeByteArray != null) {
            try {
                if (decodeByteArray.getWidth() != 0) {
                    if (decodeByteArray.getHeight() != 0) {
                        Bitmap createBitmap;
                        if (matrix != null) {
                            Log.i(z[195]);
                            try {
                                createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                                if (decodeByteArray != createBitmap) {
                                    try {
                                        decodeByteArray.recycle();
                                    } catch (OutOfMemoryError e) {
                                        throw e;
                                    }
                                }
                                decodeByteArray = createBitmap;
                            } catch (OutOfMemoryError e2) {
                                Log.e(z[193]);
                                decodeByteArray.recycle();
                                throw e2;
                            }
                        }
                        if (i2 <= 0) {
                            return decodeByteArray;
                        }
                        try {
                            if (decodeByteArray.getWidth() <= i2) {
                                if (decodeByteArray.getHeight() <= i2) {
                                    return decodeByteArray;
                                }
                            }
                            Log.i(z[196] + decodeByteArray.getWidth() + z[191] + decodeByteArray.getHeight());
                            float max = Math.max(((float) decodeByteArray.getWidth()) / ((float) i), ((float) decodeByteArray.getHeight()) / ((float) i));
                            Rect rect = new Rect(0, 0, (int) (((float) decodeByteArray.getWidth()) / max), (int) (((float) decodeByteArray.getHeight()) / max));
                            rect.right = Math.max(rect.right, 1);
                            rect.bottom = Math.max(rect.bottom, 1);
                            Rect rect2 = new Rect(0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight());
                            Config config = decodeByteArray.getConfig();
                            try {
                                int width = rect.width();
                                int height = rect.height();
                                if (config == null) {
                                    config = Config.ARGB_8888;
                                }
                                createBitmap = Bitmap.createBitmap(width, height, config);
                                Canvas canvas = new Canvas(createBitmap);
                                Paint paint = new Paint();
                                paint.setAntiAlias(true);
                                paint.setFilterBitmap(true);
                                paint.setDither(true);
                                canvas.drawBitmap(decodeByteArray, rect2, rect, paint);
                                decodeByteArray.recycle();
                                return createBitmap;
                            } catch (OutOfMemoryError e22) {
                                throw e22;
                            } catch (OutOfMemoryError e222) {
                                Log.e(z[192]);
                                decodeByteArray.recycle();
                                throw e222;
                            }
                        } catch (OutOfMemoryError e3) {
                            throw e3;
                        } catch (OutOfMemoryError e32) {
                            throw e32;
                        }
                    }
                }
            } catch (OutOfMemoryError e322) {
                throw e322;
            } catch (OutOfMemoryError e3222) {
                throw e3222;
            }
        }
        try {
            Log.i(z[194] + uri);
            throw new c_();
        } catch (OutOfMemoryError e32222) {
            throw e32222;
        }
    }

    public static void a(Uri uri, by byVar, m mVar) {
        byVar.a(0, 2131231424);
        bq.a(new ba(uri, byVar, mVar), new Void[0]);
    }

    public static byte[] a(Context context, Uri uri, MediaData mediaData) {
        File a = a(context, z[138], (byte) 1, 0, true);
        try {
            Bitmap a2 = a(uri, a);
            if (a2 == null) {
                try {
                    Log.e(z[140]);
                    throw new c_();
                } catch (SecurityException e) {
                    throw e;
                }
            }
            mediaData.file = a;
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a2.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            try {
                if (a2.getHeight() > a2.getWidth()) {
                    a(mediaData.file, mediaData);
                }
            } catch (Exception e2) {
            } catch (OutOfMemoryError e3) {
            }
            a2.recycle();
            return toByteArray;
        } catch (SecurityException e4) {
            Log.e(z[139] + e4.getMessage());
            throw e4;
        }
    }

    static {
        String[] strArr = new String[220];
        String str = "}w\u001f8=qx";
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
                        i3 = 30;
                        break;
                    case at.g /*1*/:
                        i3 = 22;
                        break;
                    case at.i /*2*/:
                        i3 = 111;
                        break;
                    case at.o /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 84;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "0y\u001f9'";
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "ys\u001b!1z\u007f\u000e(!lw\u001b%;pe\n/;pr\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){oc\n>-Ay\u001d%1pb\u000e8=qx0%:xy";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "Qd\u0006):jw\u001b%;p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){}c\u001d?;lI\u0006?\u000b{{\u001f8-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "}y\u000181pb";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){py0#&ws\u000185j\u007f\u0000\"\u000bwx\t#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Qd\u0006):jw\u001b%;p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    str = "x\u007f\u0003)";
                    z = true;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "Ar\u000e85";
                    z = true;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){qd\u0006):jw\u001b%;p6";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "qd\u0006):jw\u001b%;p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "]w\u0001\";j6\u0003#5z6\r% sw\u001fl'jd\n-9>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){i\u007f\u000b8<#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ">jO$1wq\u00078i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "PyO*=rsO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){nd\n*1lg\u001a-8wb\u0016c1ld\u0000>tmr\u0004%:j+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ">jO?5sf\u0003)\u000bm\u007f\u0015)i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){py\u001b\u00135A\u007f\u0002-3{,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){}w\u0001k >z\u0000-0>\u007f\u0001<!je\u001b>1\u007f{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    str = "ys\u001b\t9|s\u000b(1zF\u0006/ kd\n";
                    z = true;
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    strArr2 = strArr3;
                    str = "}w\u001f8!ls)>5ss";
                    z = true;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "ms\u001b\b5jw<#!lu\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "ls\u0003)5ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "ls\u0003)5ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{ly\u001b- {6\u0019%0{yO8<k{\rl";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "ls\u0003)5ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "ls\u0003)5ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    str = "ls\u0003)5ms";
                    z = true;
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    strArr2 = strArr3;
                    str = "\u007fx\u000b>;wrA!1z\u007f\u000eb\u0019{r\u0006-\u0019{b\u000e(5jw=) l\u007f\n:1l";
                    z = true;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "ls\u0003)5ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "ls\u0003)5ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "ls\u0003)5ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "ls\u0003)5ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "ys\u001b\n&\u007f{\n\r J\u007f\u0002)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "ls\u0003)5ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "}y\u0002b#vw\u001b?5nf0<&{p\n>1pu\n?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "x\u007f\u0003)\u000bwx\u000b),";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{wx\u000682wz\n/;kx\u001b)&1e\u000e:1Af\u001d)2mI\t-=rs\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u007fx\u000b>;wrA%:js\u00018z{n\u001b>50e\u000661R\u007f\u0002% ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u007fx\u000b>;wrA%:js\u00018z\u007fu\u001b%;p8?\u0005\u0017U";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u007fx\u000b>;wrA!1z\u007f\u000eb5}b\u0006#:0@&\b\u0011QI,\r\u0004JC=\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "w{\u000e+11<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "my\u001a\"0ls\f#&zs\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = ">jO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "0|\u001f+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{\u007fc\u000b%;>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u007fx\u000b>;wrA%:js\u00018z\u007fu\u001b%;p8?\u0005\u0017U";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "sy\u001b#&qz\u000eb7sf";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u007fc\u000b%;1<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u007fx\u000b>;wrA%:js\u00018z\u007fu\u001b%;p8?\u0005\u0017U";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u007fx\u000b>;wrA<&q`\u0006(1l8\")0ww<8;lsA),jd\u000eb\u0019_N0\u000e\rJS<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u007fx\u000b>;wrA%:js\u00018z{n\u001b>50_!\u0005\u0000WW#\u0013\u001dPB*\u0002\u0000M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u007fc\u000b%;1<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "sc\u001c%7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u007fx\u000b>;wrA%:js\u00018z\u007fu\u001b%;p8(\t\u0000AU \u0002\u0000[X;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u007fx\u000b>;wrA!1z\u007f\u000eb5}b\u0006#:0_\"\r\u0013[I,\r\u0004JC=\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "qc\u001b<!j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "qc\u001b<!j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "hy\u0006/1ls\f#&zs\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "}y\u0002b#vw\u001b?5nfA-7j\u007f\u0000\"zI^.\u0018\u0007_F?\u0013\u0006[U \u001e\u0010WX(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u007fx\u000b>;wrA%:js\u00018z\u007fu\u001b%;p8?\u0005\u0017U";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "Ps\u00179'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "0{\u001fx";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{mb\u000e> 3w\f8=h\u007f\u001b5t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "sw\u0017\u0013=js\u0002?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u007fx\u000b>;wrA%:js\u00018z\u007fu\u001b%;p8\"\t\u0010WW0\u001f\u0017_X!\t\u0006AE,\r\u001aAP&\u0000\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "{n\u001b)&pw\u0003\u00132wz\n\u0013=sw\b)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "ss\u000b%5kb\u0006 '1q\n\"1lw\u001b)1fb\n>:\u007fz\u0006!5ys\t%8{9\u001c-\"{I\u001f>1xe0*5wz\n(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "}y\u0002b#vw\u001b?5nf0<&{p\n>1pu\n?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "4<E";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "}w\u001f8=qx";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){qy\u0002l";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "PyO*=rsO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){x\u007f\u0001-8Ae\u000661$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = ">jO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){xd\u0000!tkd\u0006v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00y\u001f):f{\u0003*;l{\u000e8'3y\t*=}s\u000b#7k{\n\" 0a\u0000>0nd\u0000/1me\u0006\"3szA(;}c\u0002):j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00y\u001f):f{\u0003*;l{\u000e8'3y\t*=}s\u000b#7k{\n\" 0e\u001f>1\u007fr\u001c$1{b\u0002 zm~\n) ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "js\u00178{f;\u0019/5lr";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u007fc\u000b%;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00{\u001ca1fu\n ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "w{\u000e+1";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "h\u007f\u000b);";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u007ff\u001f =}w\u001b%;p9\u001f(2";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "js\u00178";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00y\u001f):f{\u0003*;l{\u000e8'3y\t*=}s\u000b#7k{\n\" 0f\u001d)'{x\u001b- wy\u0001!80f\u001d)'{x\u001b- wy\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00{\u001ca$qa\n>$q\u007f\u00018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u007ff\u001f =}w\u001b%;p9\u001d82";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0002?#qd\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "js\u00178{lb\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "js\u00178{nz\u000e%:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00y\u001f):f{\u0003*;l{\u000e8'3y\t*=}s\u000b#7k{\n\" 0a\u0000>0nd\u0000/1me\u0006\"3szA(;}c\u0002):j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "fz\u001c4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "nf\u001b4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "lb\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "jn\u001b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "tf\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "lb\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "fz\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00{\u001ca$qa\n>$q\u007f\u00018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00y\u001f):f{\u0003*;l{\u000e8'3y\t*=}s\u000b#7k{\n\" 0e\u001f>1\u007fr\u001c$1{b\u0002 zm~\n) ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "w{\u000e+11|\u001f)3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "\u007ff\u001f =}w\u001b%;p9\u001f(2";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0002?#qd\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "\u007ff\u001f =}w\u001b%;p9\u001d82";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "nr\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "zy\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00{\u001ca1fu\n ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "js\u00178{nz\u000e%:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "js\u00178{lb\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "zy\f4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "nf\u001b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00y\u001f):f{\u0003*;l{\u000e8'3y\t*=}s\u000b#7k{\n\" 0f\u001d)'{x\u001b- wy\u0001!80f\u001d)'{x\u001b- wy\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{wx\u000682wz\n/;kx\u001b)&1e\u000e:1Af\u001d)2mI\t-=rs\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{ls\u000e(5|z\n*=rs\u0001-9{9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "}y\u0002b#vw\u001b?5nf0<&{p\n>1pu\n?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "x\u007f\u0003)\u000bzw\u001b)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = "3A.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "x\u007f\u0003)\u000bwx\u000b),";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "{n\u001b)&pw\u0003\u00132wz\n\u0013=sw\b)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "}y\u0002b#vw\u001b?5nf0<&{p\n>1pu\n?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "sw\u0017\u0013=js\u0002?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "w{\u000e+11<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "t\u007f\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "\u007fx\u000b>;wrA%:js\u00018z\u007fu\u001b%;p8?\u0005\u0017U";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "4<E";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "4<E";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "ls\u000b-7js\u000b:1le\u0006#:1x\u00008ykd\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{}w\u0003/!rw\u001b)9{r\u0006-<\u007fe\u0007c7ry\u001c)t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{}w\u0003/!rw\u001b)9{r\u0006-<\u007fe\u0007c7ry\u001c)t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{}w\u0003/!rw\u001b)9{r\u0006-<\u007fe\u0007l";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{}w\u0003/!rw\u001b)9{r\u0006-<\u007fe\u0007c0wq\n? {dO%'>x\u001a 8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "M^.af+ ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{}w\u0003/!rw\u001b)9{r\u0006-<\u007fe\u0007c7ry\u001c)t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{}w\u0003/!rw\u001b)9{r\u0006-<\u007fe\u0007c0wq\n? {dO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "0|\u001f+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{ys\u001b%9\u007fq\n-:ze\n\"01e\n/!l\u007f\u001b51fu\n< wy\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{ys\u001b%9\u007fq\n-:ze\n\"01b\u000799|I\r% sw\u001fl=m6\u000198r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "x\u007f\u0003)tweO##ps\u000bl6g6\u00009&>w\u001f<8wu\u000e8=qxTl:qbO<1l{\u00068 wx\bl:{p\u000e>=qc\u001cl2wz\nl'vw\u001d)tqf\n>5j\u007f\u0000\"o>p\u0006 1Wx\u001f9 Mb\u001d)5s+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "1~\n%3vbU";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "qd\u0006+\u000bj~\u001a!6pw\u0006 {i\u007f\u000b8<$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "h\u007f\u000b);3b\u000799|x\u000e%81e\f-8{9\u00009 3y\ta9{{\u0000>-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "1~\n%3vbU";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "ls\u001c/5rs\u000b\u0013 vc\u0002.:\u007f\u007f\u0003c#wr\u001b$n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = "x\u007f\u0003)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = "fz\u001c4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "lb\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = "nf\u001b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 151;
                    str = "nf\u001b4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 152;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00y\u001f):f{\u0003*;l{\u000e8'3y\t*=}s\u000b#7k{\n\" 0f\u001d)'{x\u001b- wy\u0001!80f\u001d)'{x\u001b- wy\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 153;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00{\u001ca1fu\n ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 154;
                    str = "nr\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 155;
                    str = "js\u00178{nz\u000e%:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 156;
                    str = "zy\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 157;
                    str = "jn\u001b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 158;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0002?#qd\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 159;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00y\u001f):f{\u0003*;l{\u000e8'3y\t*=}s\u000b#7k{\n\" 0e\u001f>1\u007fr\u001c$1{b\u0002 zm~\n) ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 160;
                    str = "fz\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 161;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00y\u001f):f{\u0003*;l{\u000e8'3y\t*=}s\u000b#7k{\n\" 0a\u0000>0nd\u0000/1me\u0006\"3szA(;}c\u0002):j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 162;
                    str = "\u007ff\u001f =}w\u001b%;p9\u0019\"00{\u001ca$qa\n>$q\u007f\u00018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 163;
                    str = "\u007ff\u001f =}w\u001b%;p9\u001f(2";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 164;
                    str = "\u007ff\u001f =}w\u001b%;p9\u001d82";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 165;
                    str = "zy\f4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 166;
                    str = "W[(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 167;
                    str = "_C+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 168;
                    str = "ZY,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 169;
                    str = "H_+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 170;
                    str = "NB;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 171;
                    str = "t\u007f\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 172;
                    str = "xz\u0006<yh";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 173;
                    str = "xz\u0006<yv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 174;
                    str = "PyO*=rsO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 175;
                    str = "ly\u001b- wy\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 176;
                    str = ">jO*=rs0(5jsU";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 177;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{wx\u000682wz\n/;kx\u001b)&>p\u0006 1A\u007f\u0001(1f,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 178;
                    str = "}y\u0002b#vw\u001b?5nf0<&{p\n>1pu\n?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 179;
                    str = "x\u007f\u0003)\u000bzw\u001b)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 180;
                    str = ">jOl w{\nv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 181;
                    str = "x\u007f\u0003)\u000bwx\u000b),";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 182;
                    str = ">jO*=rs0(5jsU";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 183;
                    str = "x\u007f\u0003)\u000bzw\u001b)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 184;
                    str = "x\u007f\u0003)\u000bwx\u000b),";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 185;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{wx\u000682wz\n/;kx\u001b)&1e\u000e:1Af\u001d)2mI\t-=rs\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 186;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{wx\u000682wz\n/;kx\u001b)&>p\u0006 1A\u007f\u0001(1f,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 187;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{}~\n/?ss\u000b%5x\u007f\u0003)'wl\nc qyO 5lq\nv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 188;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{}~\n/?ss\u000b%5x\u007f\u0003)'wl\nl'luU";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 189;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{ms\u0001(9{r\u0006-2wz\nl'{x\u000bv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 190;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{ms\u0001(9{r\u0006-2wz\nl'luU";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 191;
                    str = ">jO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 192;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){mu\u000e 11y\u001a8yqpB!1sy\u001d5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 193;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){ly\u001b- {9\u00009 3y\ta9{{\u0000>-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 194;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){py\u001b\u00135A\u007f\u0002-3{,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 195;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){ly\u001b- {";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 196;
                    str = "mw\u0002<8{I\u001d# \u007fb\n\u0013=sw\b){mu\u000e 11";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 197;
                    str = "Ar\u000e85";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 198;
                    str = "Kx\u000e.8{6\u001b#tqf\n\"tmb\u001d)5s8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 199;
                    str = "x\u007f\u0003)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 200;
                    str = "ss\u000b%5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 201;
                    str = "nd\n<5ls0%9\u007fq\n\u00132qd0?1pr@#;s6";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 202;
                    str = ">{\u000e4n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 203;
                    str = "nd\n<5ls0%9\u007fq\n\u00132qd0?1pr@/;noO?=dsU";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 204;
                    str = "PyO?$\u007fu\nl8{p\u001bl;p6\u000b)\"wu\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 205;
                    str = ">d\n/;sf\u001d)'m,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 206;
                    str = "nd\n<5ls0%9\u007fq\n\u00132qd0?1pr@/;noO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 207;
                    str = "pw\u001b%\"{6\u0007)5n6\u001c%.{,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 208;
                    str = ">}-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 209;
                    str = ">b\u000085r,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 210;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{x\u007f\u0001(8\u007fd\b)'jp\u0006 1wx\u000b),>b\u0016<1$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 211;
                    str = "3A.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 212;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{x\u007f\u0001(8\u007fd\b)'jp\u0006 1wx\u000b),1x\u0000l2wz\n?txy\u001dl gf\nv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 213;
                    str = ">y\u001d%3wxU";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 214;
                    str = "x\u007f\u0003)\u000bwx\u000b),$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 215;
                    str = "ss\u000b%5x\u007f\u0003)!j\u007f\u0003?{x\u007f\u0001(8\u007fd\b)'jp\u0006 1wx\u000b),1x\t)n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 216;
                    str = ">y\u001d%3wxU";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 217;
                    str = "x\u007f\u0003)tweO\";j6\n4 {d\u0001-8>b\u0000l5nf\u0003%7\u007fb\u0006#:>r\u000e85>r\u0006>1}b\u0000>-%6\f-:qx\u0006/5rP\u0006 1Nw\u001b$i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 218;
                    str = "%6\f-:qx\u0006/5r_\u000181lx\u000e \u0004\u007fb\u0007q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 219;
                    str = ".&_|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    z = strArr3;
                    f = new DecimalFormat(z[219], new DecimalFormatSymbols(Locale.US));
                    d = -1;
                    e = new Options();
                    e.inDither = true;
                    e.inInputShareable = true;
                    e.inPurgeable = true;
                    b = new bf(10);
                    return;
                default:
                    strArr2[i] = str;
                    str = "ly\u001b- wy\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }
}
