package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.whatsapp.arj;
import java.io.FileDescriptor;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

public class ad {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "\u0014\u0007\u0012/'<\u0005Fj00\r\u0016{!<\u0006F";
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
                        i3 = 83;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 15;
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
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0006\u001c\u000fc";
                    obj = null;
            }
        }
    }

    private static int b(Options options, int i, int i2) {
        int i3;
        double d = (double) options.outWidth;
        double d2 = (double) options.outHeight;
        int ceil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / ((double) i2)));
        if (i == -1) {
            i3 = 128;
        } else {
            i3 = (int) Math.min(Math.floor(d / ((double) i)), Math.floor(d2 / ((double) i)));
        }
        if (i3 < ceil) {
            return ceil;
        }
        if (i2 == -1 && i == -1) {
            return 1;
        }
        if (i != -1) {
            return i3;
        }
        return ceil;
    }

    public static Bitmap a(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        return a(i, i2, null, null, parcelFileDescriptor, null);
    }

    public static int a(Options options, int i, int i2) {
        int i3 = MediaGalleryFragmentBase.e;
        int b = b(options, i, i2);
        if (b <= 8) {
            int i4 = 1;
            while (i4 < b) {
                i4 <<= 1;
                if (i3 != 0) {
                }
            }
            return i4;
        }
        return ((b + 7) / 8) * 8;
    }

    public static Bitmap a(int i, int i2, Uri uri, ContentResolver contentResolver) {
        Throwable th;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            try {
                Bitmap a = a(i, i2, uri, contentResolver, openFileDescriptor, null);
                a(openFileDescriptor);
                return a;
            } catch (IOException e) {
                a(openFileDescriptor);
                return null;
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptor = openFileDescriptor;
                a(parcelFileDescriptor);
                throw th;
            }
        } catch (IOException e2) {
            openFileDescriptor = null;
            a(openFileDescriptor);
            return null;
        } catch (Throwable th3) {
            th = th3;
            a(parcelFileDescriptor);
            throw th;
        }
    }

    public static Bitmap a(int i, int i2, Uri uri, ContentResolver contentResolver, ParcelFileDescriptor parcelFileDescriptor, Options options) {
        Bitmap bitmap = null;
        if (parcelFileDescriptor == null) {
            try {
                parcelFileDescriptor = a(uri, contentResolver);
            } catch (Throwable e) {
                try {
                    Log.e(z[1], z[0], e);
                } finally {
                    a(parcelFileDescriptor);
                }
            }
        }
        if (parcelFileDescriptor == null) {
            a(parcelFileDescriptor);
        } else {
            if (options == null) {
                options = new Options();
            }
            FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
            try {
                options.inJustDecodeBounds = true;
                m.a().a(fileDescriptor, options);
                if (!(options.mCancel || options.outWidth == -1)) {
                    if (options.outHeight != -1) {
                        options.inSampleSize = a(options, i, i2);
                        options.inJustDecodeBounds = false;
                        options.inDither = false;
                        options.inPreferredConfig = Config.ARGB_8888;
                        bitmap = m.a().a(fileDescriptor, options);
                        a(parcelFileDescriptor);
                    }
                }
                a(parcelFileDescriptor);
            } catch (OutOfMemoryError e2) {
                throw e2;
            } catch (OutOfMemoryError e22) {
                throw e22;
            }
        }
        return bitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap == createBitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e) {
            return bitmap;
        }
    }

    private static ParcelFileDescriptor a(Uri uri, ContentResolver contentResolver) {
        try {
            return contentResolver.openFileDescriptor(uri, "r");
        } catch (IOException e) {
            return null;
        }
    }

    public static void a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th) {
            }
        }
    }
}
