package com.whatsapp.wallpaper;

import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Debug;
import android.widget.ImageView;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class j extends AsyncTask {
    private static final String[] z;
    Options a;
    final WallpaperPicker b;

    static {
        String[] strArr = new String[6];
        String str = "9M\u000b\u0000s2C\u0012]e*RHYe6N\u0016Ot?P";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = 34;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 46;
                        break;
                    default:
                        i3 = 4;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "zI$";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "-R9^m9I\u0003\\";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "-R9^m9I\u0003\\";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "9M\u000b\u0000s2C\u0012]e*RHYe6N\u0016Ot?P";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "-R9^m9I\u0003\\[5M\u000b\u0003j;V\u000fXazJ\u0003OtzQ\u000fTaz";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    j(WallpaperPicker wallpaperPicker) {
        this.b = wallpaperPicker;
        this.a = new Options();
        this.a.inDither = false;
        this.a.inPreferredConfig = Config.ARGB_8888;
        this.a.inSampleSize = 2;
    }

    protected Bitmap a(Integer[] numArr) {
        try {
            if (isCancelled()) {
                return null;
            }
            try {
                return BitmapFactory.decodeResource(this.b.i.getResourcesForApplication(z[0]), ((Integer) WallpaperPicker.d(this.b).get(numArr[0].intValue())).intValue(), this.a);
            } catch (OutOfMemoryError e) {
                this.a.inSampleSize = 3;
                Log.e(z[4] + e.toString());
                try {
                    return BitmapFactory.decodeResource(this.b.i.getResourcesForApplication(z[5]), ((Integer) WallpaperPicker.d(this.b).get(numArr[0].intValue())).intValue(), this.a);
                } catch (OutOfMemoryError e2) {
                    Log.e(z[1] + (Debug.getNativeHeapAllocatedSize() / 1024) + z[2]);
                    return null;
                } catch (NameNotFoundException e3) {
                    return null;
                }
            } catch (NameNotFoundException e4) {
                Log.e(z[3] + e4.toString());
                return null;
            }
        } catch (OutOfMemoryError e5) {
            throw e5;
        }
    }

    void a() {
        this.a.requestCancelDecode();
        super.cancel(true);
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Integer[]) objArr);
    }

    protected void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (!(isCancelled() || this.a.mCancel)) {
                if (WallpaperPicker.a(this.b) != null) {
                    WallpaperPicker.a(this.b).recycle();
                }
                ImageView b = WallpaperPicker.b(this.b);
                b.setImageBitmap(bitmap);
                WallpaperPicker.a(this.b, bitmap);
                Drawable drawable = b.getDrawable();
                drawable.setFilterBitmap(true);
                drawable.setDither(true);
                b.postInvalidate();
                WallpaperPicker.a(this.b, null);
                if (CropImage.c == 0) {
                    return;
                }
            }
            bitmap.recycle();
        }
    }
}
