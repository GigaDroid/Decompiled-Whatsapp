package com.whatsapp.camera;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.os.Build.VERSION;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class y implements PictureCallback {
    private static final String[] z;
    final CameraView a;
    final c b;

    static {
        String[] strArr = new String[2];
        String str = "6y5.J4n1.Ozl9 ]%q;?M'}x?Y>}6k";
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
                        i3 = 85;
                        break;
                    case at.g /*1*/:
                        i3 = 24;
                        break;
                    case at.i /*2*/:
                        i3 = 88;
                        break;
                    case at.o /*3*/:
                        i3 = 75;
                        break;
                    default:
                        i3 = 56;
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
                    str = "6y5.J4n1.Ozl9 ]%q;?M'}x.J'w*kK!w(;Q;\u007fx(Y8}**\u0018%j==Q0o";
                    obj = null;
            }
        }
    }

    y(CameraView cameraView, c cVar) {
        this.a = cameraView;
        this.b = cVar;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        Log.i(z[0] + CameraView.a(this.a));
        if (VERSION.SDK_INT >= 11) {
            try {
                CameraView.e(this.a).stopPreview();
            } catch (Throwable e) {
                Log.c(z[1], e);
            }
        }
        CameraView.a(this.a, false);
        this.b.a(bArr, CameraView.a(this.a));
    }
}
