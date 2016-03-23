package com.whatsapp.camera;

import android.hardware.Camera.ErrorCallback;
import org.v;
import org.whispersystems.at;

class b implements ErrorCallback {
    private static final String[] z;
    final CameraView a;

    static {
        String[] strArr = new String[5];
        String str = "h\u0013`[/j\u0004d[*$\u0001y_/\u007f\u0011lS8y\u0013-]<f\u0017\u007f_}n\u0000\u007fQ/1";
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
                        i3 = 11;
                        break;
                    case at.g /*1*/:
                        i3 = 114;
                        break;
                    case at.i /*2*/:
                        i3 = 13;
                        break;
                    case at.o /*3*/:
                        i3 = 62;
                        break;
                    default:
                        i3 = 93;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "+\u0006lU4e\u0015}W>\u007f\u0007\u007f[g";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "+\u001bcN/n\u0004d[*1";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "+\u0000h]2y\u0016dP:1";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "h\u0013`[/j\u0004d[*$\u0001y_/\u007f\u0011lS8y\u0013-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(int r4, android.hardware.Camera r5) {
        /*
        r3 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.a;
        r1 = com.whatsapp.camera.CameraView.c(r1);
        r0 = r0.append(r1);
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.a;
        r1 = com.whatsapp.camera.CameraView.l(r1);
        r0 = r0.append(r1);
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.a;
        r1 = com.whatsapp.camera.CameraView.k(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = 100;
        if (r4 != r0) goto L_0x0074;
    L_0x0056:
        r0 = r3.a;
        com.whatsapp.camera.CameraView.i(r0);
        r0 = r3.a;
        com.whatsapp.camera.CameraView.j(r0);
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        r0 = com.whatsapp.camera.CameraView.e(r0);	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        r1 = r3.a;	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        r1 = com.whatsapp.camera.CameraView.h(r1);	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        r0.setPreviewDisplay(r1);	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
        com.whatsapp.camera.CameraView.b(r0);	 Catch:{ RuntimeException -> 0x0075, IOException -> 0x0093 }
    L_0x0074:
        return;
    L_0x0075:
        r0 = move-exception;
    L_0x0076:
        r1 = r3.a;
        r1 = com.whatsapp.camera.CameraView.e(r1);
        r1.release();
        r1 = r3.a;
        r2 = 0;
        com.whatsapp.camera.CameraView.a(r1, r2);
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r0 = r3.a;
        com.whatsapp.camera.CameraView.g(r0);
        goto L_0x0074;
    L_0x0093:
        r0 = move-exception;
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.b.onError(int, android.hardware.Camera):void");
    }

    b(CameraView cameraView) {
        this.a = cameraView;
    }
}
