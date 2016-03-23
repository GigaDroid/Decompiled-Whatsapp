package com.whatsapp;

import android.backport.util.Base64;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.b;
import com.whatsapp.util.bg;
import java.io.InputStream;
import java.security.SecureRandom;
import org.v;
import org.whispersystems.at;

public class ss extends sx {
    private static final bg u;
    private static final String[] z;
    private boolean v;
    public boolean w;

    public void onPostExecute(Object obj) {
        a((aki) obj);
    }

    protected String g() {
        return b.a(u);
    }

    protected String h() {
        try {
            byte[] bArr = new byte[32];
            SecureRandom.getInstance(z[5]).nextBytes(bArr);
            return Base64.encodeToString(bArr, 2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static boolean a(ss ssVar) {
        return ssVar.v;
    }

    protected long f() {
        return 65536;
    }

    protected boolean e() {
        return this.w;
    }

    public void b(boolean z) {
        Log.i(z[4] + z);
        this.v = true;
        if (z) {
            MediaData l = l();
            try {
                m().z = l.file.length();
                App.aK.a(m(), 1);
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.aki r6) {
        /*
        r5 = this;
        r3 = 2;
        r2 = 1;
        r0 = com.whatsapp.aki.SUCCESS;
        if (r6 != r0) goto L_0x004e;
    L_0x0006:
        r0 = com.whatsapp.App.z();
        r1 = r5.l();
        r1 = r1.file;
        r0 = com.whatsapp.util.ag.a(r0, r1, r3, r2, r2);
        r1 = r5.l();
        r2 = r1.file;	 Catch:{ RuntimeException -> 0x0052 }
        r2 = r2.renameTo(r0);	 Catch:{ RuntimeException -> 0x0052 }
        if (r2 == 0) goto L_0x0026;
    L_0x0020:
        r1.file = r0;	 Catch:{ RuntimeException -> 0x0054 }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ RuntimeException -> 0x0054 }
        if (r2 == 0) goto L_0x004e;
    L_0x0026:
        r2 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0054 }
        r2.<init>();	 Catch:{ RuntimeException -> 0x0054 }
        r3 = z;	 Catch:{ RuntimeException -> 0x0054 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x0054 }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x0054 }
        r1 = r1.file;	 Catch:{ RuntimeException -> 0x0054 }
        r1 = r2.append(r1);	 Catch:{ RuntimeException -> 0x0054 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0054 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0054 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0054 }
        r0 = r1.append(r0);	 Catch:{ RuntimeException -> 0x0054 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0054 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x0054 }
    L_0x004e:
        super.a(r6);
        return;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ss.a(com.whatsapp.aki):void");
    }

    protected boolean i() {
        return true;
    }

    public void d() {
        String str = this.p.k.c;
        try {
            if (!((!qm.i(str) && !co.a(str)) || App.as.a(str, it.ALLOW) || App.as.a(str, a3m.ALLOW))) {
                try {
                    Log.w(z[0] + this.p.k);
                    this.w = false;
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            super.d();
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static {
        String[] strArr = new String[6];
        String str = "\u0005MC| \rAT='\u000fGBd2\u0015AT=2\u0015P\u000b=/\u0004WC|%\u0004\n[x;\\";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 97;
                        break;
                    case at.g /*1*/:
                        i4 = 36;
                        break;
                    case at.i /*2*/:
                        i4 = 48;
                        break;
                    case at.o /*3*/:
                        i4 = 29;
                        break;
                    default:
                        i4 = 66;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0007EYq'\u0005\u0004Drb\u0013A^|/\u0004\u0004";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0017KY~'\u000fKDxm\fATt#\u0014T\\r#\u0005\u000bWx6\bJ@h6\u0012PBx#\f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0017KY~'\u000fKDxm\fATt#\u0014T\\r#\u0005\u000b_s0\u0004G_o&\bJWn6\u000eT@x&A";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "2lq,\u00123jw";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    u = new bg(3);
                    return;
                default:
                    strArr2[i2] = str;
                    str = "AP_=";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public ss(co coVar) {
        super(coVar, false, false);
        this.w = true;
    }

    protected InputStream k() {
        Log.i(z[3]);
        return new _u(this, l().file);
    }
}
