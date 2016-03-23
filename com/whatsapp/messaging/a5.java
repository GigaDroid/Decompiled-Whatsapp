package com.whatsapp.messaging;

import android.content.Context;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

final class a5 {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[8];
        String str = "B'z:\u000b";
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
                        i3 = 69;
                        break;
                    case at.i /*2*/:
                        i3 = 19;
                        break;
                    case at.o /*3*/:
                        i3 = 74;
                        break;
                    default:
                        i3 = 120;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "B'z:\u000b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\\(c:WW a<\u0011G <,\u0019H)q+\u001bOj\u007f%\u0019@\u0003r&\u0014F$p!\u000b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "B'z:\u000b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "B'z:\u000b";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "g\tV\u000b*";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\\(c:WW a<\u0011G <,\u0019H)q+\u001bOj`+\u000eA\u0003r&\u0014F$p!\u000b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "B'z:\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public a5(Context context) {
        this.a = context;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList a() {
        /*
        r6 = this;
        r2 = com.whatsapp.messaging.co.a;
        r0 = r6.a;
        r1 = z;
        r3 = 1;
        r1 = r1[r3];
        r0 = r0.openFileInput(r1);
        r1 = new java.io.ObjectInputStream;
        r3 = new java.io.BufferedInputStream;
        r3.<init>(r0);
        r1.<init>(r3);
        r0 = r1.readObject();
        r0 = (java.util.ArrayList) r0;
        r1.close();
        r3 = new java.util.HashSet;
        r3.<init>();
        r4 = r0.iterator();
    L_0x0029:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x0040;
    L_0x002f:
        r1 = r4.next();
        r1 = (com.whatsapp.util.dns.DnsCacheEntrySerializable) r1;
        r5 = r1.isExpired();
        if (r5 == 0) goto L_0x003e;
    L_0x003b:
        r3.add(r1);
    L_0x003e:
        if (r2 == 0) goto L_0x0029;
    L_0x0040:
        r1 = r3.isEmpty();
        if (r1 != 0) goto L_0x005e;
    L_0x0046:
        r0.removeAll(r3);
        r1 = r0.isEmpty();
        if (r1 == 0) goto L_0x005b;
    L_0x004f:
        r1 = r6.a;
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r1.deleteFile(r3);
        if (r2 == 0) goto L_0x005e;
    L_0x005b:
        r6.a(r0);
    L_0x005e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.a5.a():java.util.ArrayList");
    }

    private void a(ArrayList arrayList) {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(this.a.openFileOutput(z[0], 0)));
        objectOutputStream.writeObject(arrayList);
        objectOutputStream.close();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList a(java.lang.String[] r6) {
        /*
        r5 = this;
        r1 = 0;
        r2 = com.whatsapp.messaging.co.a;
        if (r6 != 0) goto L_0x0031;
    L_0x0005:
        r0 = new java.io.File;	 Catch:{ IOException -> 0x0020 }
        r1 = r5.a;	 Catch:{ IOException -> 0x0020 }
        r1 = r1.getFilesDir();	 Catch:{ IOException -> 0x0020 }
        r2 = z;	 Catch:{ IOException -> 0x0020 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0020 }
        r0.<init>(r1, r2);	 Catch:{ IOException -> 0x0020 }
        r0 = r0.canRead();	 Catch:{ IOException -> 0x0020 }
        if (r0 == 0) goto L_0x002b;
    L_0x001b:
        r0 = r5.a();	 Catch:{ IOException -> 0x0022, ClassNotFoundException -> 0x007d }
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = move-exception;
    L_0x0023:
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
    L_0x002b:
        r0 = new java.util.ArrayList;
        r0.<init>();
        goto L_0x001f;
    L_0x0031:
        r0 = r6.length;	 Catch:{ IOException -> 0x0055 }
        r3 = 1;
        if (r0 != r3) goto L_0x0057;
    L_0x0035:
        r0 = 0;
        r0 = r6[r0];	 Catch:{ IOException -> 0x0055 }
        r3 = z;	 Catch:{ IOException -> 0x0055 }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0055 }
        r0 = r0.equalsIgnoreCase(r3);	 Catch:{ IOException -> 0x0055 }
        if (r0 == 0) goto L_0x0057;
    L_0x0043:
        r0 = r5.a;	 Catch:{ IOException -> 0x0053 }
        r1 = z;	 Catch:{ IOException -> 0x0053 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0053 }
        r0.deleteFile(r1);	 Catch:{ IOException -> 0x0053 }
        r0 = new java.util.ArrayList;	 Catch:{ IOException -> 0x0053 }
        r0.<init>();	 Catch:{ IOException -> 0x0053 }
        goto L_0x001f;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0053 }
    L_0x0057:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r3 = r6.length;
    L_0x005d:
        if (r1 >= r3) goto L_0x006b;
    L_0x005f:
        r4 = r6[r1];
        r4 = com.whatsapp.util.dns.DnsCacheEntrySerializable.parseFallbackIpString(r4);
        if (r4 != 0) goto L_0x0079;
    L_0x0067:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x005d;
    L_0x006b:
        r5.a(r0);	 Catch:{ IOException -> 0x006f }
        goto L_0x001f;
    L_0x006f:
        r1 = move-exception;
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x001f;
    L_0x0079:
        r0.add(r4);
        goto L_0x0067;
    L_0x007d:
        r0 = move-exception;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.a5.a(java.lang.String[]):java.util.ArrayList");
    }
}
