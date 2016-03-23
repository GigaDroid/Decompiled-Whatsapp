package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.ImageView.ScaleType;
import org.v;
import org.whispersystems.at;

class a0 extends AsyncTask {
    private static final String[] z;
    final Uri a;
    final int b;
    final ThumbImageView c;

    static {
        String[] strArr = new String[4];
        String str = ";}\u0003G\u0019\"b\u0007V\u00157gMS\u0019&e\u0010I";
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
                        i3 = 82;
                        break;
                    case at.g /*1*/:
                        i3 = 16;
                        break;
                    case at.i /*2*/:
                        i3 = 98;
                        break;
                    case at.o /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ";}\u0003G\u0019\"b\u0007V\u00157gMS\u0019&e\u0010I";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ";}\u0003G\u0019\"b\u0007V\u00157gMS\u0019&e\u0010I";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ";}\u0003G\u0019\"b\u0007V\u00157gMS\u0019&e\u0010I";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.c.setScaleType(ScaleType.CENTER_CROP);
            this.c.setBackgroundResource(0);
            this.c.setImageBitmap(bitmap);
            if (MediaGalleryFragmentBase.e == 0) {
                return;
            }
        }
        this.c.setScaleType(ScaleType.CENTER);
        this.c.setBackgroundColor(this.c.getResources().getColor(2131624017));
        this.c.setImageResource(2130839525);
    }

    a0(ThumbImageView thumbImageView, Uri uri, int i) {
        this.c = thumbImageView;
        this.a = uri;
        this.b = i;
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.graphics.Bitmap a(java.lang.Void[] r4) {
        /*
        r3 = this;
        r0 = r3.a;	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, c_ -> 0x0033 }
        r1 = r3.b;	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, c_ -> 0x0033 }
        r2 = r3.b;	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, c_ -> 0x0033 }
        r0 = com.whatsapp.util.ag.a(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, c_ -> 0x0033 }
        r1 = r3.c;	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, c_ -> 0x0033 }
        r1 = com.whatsapp.gallerypicker.ImagePreview.ThumbImageView.a(r1);	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, c_ -> 0x0033 }
        com.whatsapp.util.ag.a(r1, r0);	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, c_ -> 0x0033 }
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
    L_0x001d:
        r0 = 0;
        goto L_0x0013;
    L_0x001f:
        r0 = move-exception;
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x001d;
    L_0x0029:
        r0 = move-exception;
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x001d;
    L_0x0033:
        r0 = move-exception;
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.a0.a(java.lang.Void[]):android.graphics.Bitmap");
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
