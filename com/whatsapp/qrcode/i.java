package com.whatsapp.qrcode;

import android.hardware.Camera.ErrorCallback;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class i implements ErrorCallback {
    private static final String[] z;
    final QrCodeView a;

    static {
        String[] strArr = new String[2];
        String str = "\u0010)\u0004b\r\u0016t\u0001\u007f\t\u0013/\u0011j\u0005\u0004)\u0013+";
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
                        i3 = 97;
                        break;
                    case at.g /*1*/:
                        i3 = 91;
                        break;
                    case at.i /*2*/:
                        i3 = 114;
                        break;
                    case at.o /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = arj.Theme_editTextStyle;
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
                    str = "\u0010)\u0004b\r\u0016t\u0001\u007f\t\u0013/\u0011j\u0005\u0004)\u0013+\u000b\u00006\u0017y\tA>\u0000y\u0007\u0013a";
                    obj = null;
            }
        }
    }

    i(QrCodeView qrCodeView) {
        this.a = qrCodeView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(int r4, android.hardware.Camera r5) {
        /*
        r3 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = 100;
        if (r4 != r0) goto L_0x003b;
    L_0x001d:
        r0 = r3.a;
        com.whatsapp.qrcode.QrCodeView.d(r0);
        r0 = r3.a;
        com.whatsapp.qrcode.QrCodeView.e(r0);
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r0 = com.whatsapp.qrcode.QrCodeView.f(r0);	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r1 = r3.a;	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r1 = com.whatsapp.qrcode.QrCodeView.a(r1);	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r0.setPreviewDisplay(r1);	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r0.g();	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
    L_0x003b:
        return;
    L_0x003c:
        r0 = move-exception;
    L_0x003d:
        r1 = r3.a;
        r1 = com.whatsapp.qrcode.QrCodeView.f(r1);
        r1.release();
        r1 = r3.a;
        r2 = 0;
        com.whatsapp.qrcode.QrCodeView.a(r1, r2);
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r0 = r3.a;
        com.whatsapp.qrcode.QrCodeView.b(r0);
        goto L_0x003b;
    L_0x005a:
        r0 = move-exception;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.i.onError(int, android.hardware.Camera):void");
    }
}
