package com.whatsapp.camera;

import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.view.View;
import com.whatsapp.App;
import com.whatsapp.a59;
import com.whatsapp.util.ap;
import com.whatsapp.wallpaper.CropImage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class r extends ap {
    private static final String[] z;
    final Uri b;
    final CameraActivity c;

    static {
        String[] strArr = new String[11];
        String str = "j/0\u001e\u0001L<\u0018\u0014*|)5\u0017\u0000";
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
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 76;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = 100;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u007f 0\u0006\u0010|\"\u0003\u001d\u0010x88\u001d\n";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "t-)1\u0016v<";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "z>>\u0002&`\u0003$\u0006\u0014l8\u0002\u001b\u001e|";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u007f 8\u0002,";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "v9%\u0002\u0011m\n>\u0000\tx8";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "k#%\u0013\u0010p#?";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "z-<\u0017\u0016x";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "p\"8\u0006\rx \u0003\u0017\u0007m";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u007f 8\u0002Iq";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "v9%\u0002\u0011m";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    r(CameraActivity cameraActivity, Uri uri) {
        this.c = cameraActivity;
        this.b = uri;
    }

    public void a(View view) {
        Intent intent = new Intent(this.c, CropImage.class);
        intent.putExtra(z[0], false);
        intent.putExtra(z[4], false);
        intent.putExtra(z[2], false);
        intent.putExtra(z[3], a59.f);
        intent.putExtra(z[1], Uri.fromFile(App.j(z[8])));
        intent.putExtra(z[6], CompressFormat.JPEG.toString());
        intent.setData(this.b);
        if (CameraActivity.g(this.c) != null) {
            intent.putExtra(z[9], CameraActivity.g(this.c));
        }
        if (CameraActivity.s(this.c) != 0) {
            intent.putExtra(z[7], CameraActivity.s(this.c));
        }
        if (this.b.getQueryParameter(z[10]) != null) {
            intent.putExtra(z[5], true);
        }
        this.c.startActivityForResult(intent, 1);
    }
}
