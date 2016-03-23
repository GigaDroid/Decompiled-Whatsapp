package com.whatsapp.gallerypicker;

import android.graphics.BitmapFactory.Options;
import org.v;
import org.whispersystems.at;

class al {
    private static final String[] z;
    public boolean a;
    public Options b;
    public a_ c;

    static {
        String[] strArr = new String[4];
        String str = "e*_0O";
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
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = 70;
                        break;
                    case at.i /*2*/:
                        i3 = 51;
                        break;
                    case at.o /*3*/:
                        i3 = 95;
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
                    str = "g']<]H";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\bf\\/LM)],\u0018\u0019f";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "P.A:Y@f@+YP#\u0013b\u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private al() {
        this.c = a_.ALLOW;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r4 = this;
        r1 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = r4.c;
        r2 = com.whatsapp.gallerypicker.a_.CANCEL;
        if (r0 != r2) goto L_0x000f;
    L_0x0008:
        r0 = z;
        r2 = 2;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x001f;
    L_0x000f:
        r0 = r4.c;
        r2 = com.whatsapp.gallerypicker.a_.ALLOW;
        if (r0 != r2) goto L_0x001c;
    L_0x0015:
        r0 = z;
        r2 = 0;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x001f;
    L_0x001c:
        r0 = "?";
    L_0x001f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.b;
        r0 = r0.append(r1);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.al.toString():java.lang.String");
    }

    al(af afVar) {
        this();
    }
}
