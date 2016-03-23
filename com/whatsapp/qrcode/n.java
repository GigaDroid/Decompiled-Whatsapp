package com.whatsapp.qrcode;

import org.v;
import org.whispersystems.at;

class n implements Runnable {
    private static final String z;
    final QrCodeView a;

    static {
        char[] toCharArray = "Mo=vPK28kTNi(~XYo*?".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 60;
                    break;
                case at.g /*1*/:
                    i2 = 29;
                    break;
                case at.i /*2*/:
                    i2 = 75;
                    break;
                case at.o /*3*/:
                    i2 = 31;
                    break;
                default:
                    i2 = 53;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    n(QrCodeView qrCodeView) {
        this.a = qrCodeView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r3 = this;
        r0 = r3.a;
        com.whatsapp.qrcode.QrCodeView.c(r0);
        r0 = r3.a;
        r0 = com.whatsapp.qrcode.QrCodeView.f(r0);
        if (r0 == 0) goto L_0x0021;
    L_0x000d:
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x0022, IOException -> 0x003d }
        r0 = com.whatsapp.qrcode.QrCodeView.f(r0);	 Catch:{ RuntimeException -> 0x0022, IOException -> 0x003d }
        r1 = r3.a;	 Catch:{ RuntimeException -> 0x0022, IOException -> 0x003d }
        r1 = com.whatsapp.qrcode.QrCodeView.a(r1);	 Catch:{ RuntimeException -> 0x0022, IOException -> 0x003d }
        r0.setPreviewDisplay(r1);	 Catch:{ RuntimeException -> 0x0022, IOException -> 0x003d }
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x0022, IOException -> 0x003d }
        r0.g();	 Catch:{ RuntimeException -> 0x0022, IOException -> 0x003d }
    L_0x0021:
        return;
    L_0x0022:
        r0 = move-exception;
    L_0x0023:
        r1 = r3.a;
        r1 = com.whatsapp.qrcode.QrCodeView.f(r1);
        r1.release();
        r1 = r3.a;
        r2 = 0;
        com.whatsapp.qrcode.QrCodeView.a(r1, r2);
        r1 = z;
        com.whatsapp.util.Log.b(r1, r0);
        r0 = r3.a;
        com.whatsapp.qrcode.QrCodeView.b(r0);
        goto L_0x0021;
    L_0x003d:
        r0 = move-exception;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.n.run():void");
    }
}
