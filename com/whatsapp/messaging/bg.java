package com.whatsapp.messaging;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import org.v;
import org.whispersystems.at;

final class bg implements X509TrustManager {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u0015\t\u0016 ,";
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
                        i3 = 77;
                        break;
                    case at.g /*1*/:
                        i3 = 39;
                        break;
                    case at.i /*2*/:
                        i3 = 35;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 21;
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
                    str = "\u0003H\u0003sy$BMd5.BQd|+N@qa(\u0007Uug$AJst9NL~5=ULf|)BG";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001dljH";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    bg() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void checkServerTrusted(java.security.cert.X509Certificate[] r13, java.lang.String r14) {
        /*
        r12 = this;
        r1 = 0;
        r2 = com.whatsapp.messaging.co.a;
        r3 = new java.util.Date;
        r3.<init>();
        r4 = r13.length;
        r0 = r1;
    L_0x000a:
        if (r0 >= r4) goto L_0x0015;
    L_0x000c:
        r5 = r13[r0];
        r5.checkValidity(r3);
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x000a;
    L_0x0015:
        r0 = z;	 Catch:{ NoSuchAlgorithmException -> 0x005a }
        r4 = 1;
        r0 = r0[r4];	 Catch:{ NoSuchAlgorithmException -> 0x005a }
        r4 = java.security.cert.CertPathValidator.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x005a }
        r0 = z;
        r0 = r0[r1];
        r0 = java.security.cert.CertificateFactory.getInstance(r0);
        r5 = java.util.Arrays.asList(r13);
        r5 = r0.generateCertPath(r5);
        r6 = r12.getAcceptedIssuers();
        r7 = new java.util.HashSet;
        r0 = r6.length;
        r7.<init>(r0);
        r8 = r6.length;
        r0 = r1;
    L_0x003a:
        if (r0 >= r8) goto L_0x004b;
    L_0x003c:
        r9 = r6[r0];
        r10 = new java.security.cert.TrustAnchor;
        r11 = 0;
        r10.<init>(r9, r11);
        r7.add(r10);
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x003a;
    L_0x004b:
        r0 = new java.security.cert.PKIXParameters;	 Catch:{ InvalidAlgorithmParameterException -> 0x0061 }
        r0.<init>(r7);	 Catch:{ InvalidAlgorithmParameterException -> 0x0061 }
        r0.setDate(r3);
        r0.setRevocationEnabled(r1);
        r4.validate(r5, r0);	 Catch:{ CertPathValidatorException -> 0x0068, InvalidAlgorithmParameterException -> 0x006f }
        return;
    L_0x005a:
        r0 = move-exception;
        r1 = new java.security.cert.CertificateException;
        r1.<init>(r0);
        throw r1;
    L_0x0061:
        r0 = move-exception;
        r1 = new java.security.cert.CertificateException;
        r1.<init>(r0);
        throw r1;
    L_0x0068:
        r0 = move-exception;
    L_0x0069:
        r1 = new java.security.cert.CertificateException;
        r1.<init>(r0);
        throw r1;
    L_0x006f:
        r0 = move-exception;
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.bg.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String):void");
    }

    public X509Certificate[] getAcceptedIssuers() {
        return at.a();
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException(z[2]);
    }
}
