package com.whatsapp.camera;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import com.whatsapp.App;
import com.whatsapp.ContactPicker;
import com.whatsapp.util.ag;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class k extends AsyncTask {
    private static final String[] z;
    final g a;
    final boolean b;
    final File c;
    final byte[] d;

    static {
        String[] strArr = new String[11];
        String str = "\u0016%\u001b@\u0004\u0014%\u0015Q\u001f\u0003-\u0002\\Y\u0013%\u001fI\u0013\u0011d";
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
                        i3 = 117;
                        break;
                    case at.g /*1*/:
                        i3 = 68;
                        break;
                    case at.i /*2*/:
                        i3 = 118;
                        break;
                    case at.o /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 118;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0013(\u001fU[\u001d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0016%\u001b@\u0004\u0014%\u0015Q\u001f\u0003-\u0002\\YU\u0001\u0004W\u0019\u0007d\u0015I\u0019\u0006-\u0018BV\u0013-\u001a@LU";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0016%\u001b@\u0004\u0014%\u0015Q\u001f\u0003-\u0002\\YU\u0001\u0004W\u0019\u0007d\u0015I\u0019\u0006-\u0018BV\u0013-\u001a@LU";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0016%\u001b@\u0004\u0014%\u0015Q\u001f\u0003-\u0002\\YU\u0002\u001fI\u0013U*\u0019QV\u0013+\u0003K\u0012Od";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0016%\u001b@\u0004\u0014%\u0015Q\u001f\u0003-\u0002\\YU\u0001\u0004W\u0019\u0007d\u0015I\u0019\u0006-\u0018BV\u0013-\u001a@LU";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0016%\u001b@\u0004\u0014%\u0015Q\u001f\u0003-\u0002\\YU\u0001\u0004W\u0019\u0007d\u0017F\u0015\u00107\u0005L\u0018\u0012d\u0010L\u001a\u0010~V";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0014*\u0012W\u0019\u001c XL\u0018\u0001!\u0018QX\u0010<\u0002W\u0017[\u0017\"w34\t";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0013(\u001fU[\u001d";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001c)\u0017B\u0013Zn";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016%\u001b@\u0004\u0014%\u0015Q\u001f\u0003-\u0002\\YU\u0001\u0004W\u0019\u0007d\u0015I\u0019\u0006-\u0018BV\u0013-\u001a@LU";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void a(Boolean bool) {
        int i = CameraActivity.I;
        try {
            this.a.a.findViewById(2131755410).setVisibility(8);
            if (!bool.booleanValue()) {
                App.a(this.a.a, 2131230876, 1);
                this.a.a.finish();
                if (i == 0) {
                    return;
                }
            }
            Uri fromFile = Uri.fromFile(this.c);
            if (this.b) {
                fromFile = fromFile.buildUpon().appendQueryParameter(z[9], "1").build();
            }
            try {
                if (CameraActivity.d(this.a.a)) {
                    CameraActivity.a(this.a.a, fromFile);
                    if (i == 0) {
                        return;
                    }
                }
                if (CameraActivity.e(this.a.a) == null) {
                    Intent intent = new Intent(this.a.a.getBaseContext(), ContactPicker.class);
                    intent.setType(z[10]);
                    intent.putExtra(z[8], fromFile);
                    this.a.a.startActivity(intent);
                }
                ag.a(this.a.a, Uri.fromFile(this.c));
                this.a.a.finish();
            } catch (SecurityException e) {
                throw e;
            } catch (SecurityException e2) {
                throw e2;
            }
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Boolean a(java.lang.Void[] r7) {
        /*
        r6 = this;
        r0 = java.lang.Boolean.TRUE;
        r2 = 0;
        r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x00ca }
        r3 = r6.c;	 Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x00ca }
        r1.<init>(r3);	 Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x00ca }
        r2 = r6.d;	 Catch:{ FileNotFoundException -> 0x0171, IOException -> 0x016d }
        r1.write(r2);	 Catch:{ FileNotFoundException -> 0x0171, IOException -> 0x016d }
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        r1.close();	 Catch:{ IOException -> 0x005e }
    L_0x0014:
        r1 = r0.booleanValue();	 Catch:{ IOException -> 0x013e }
        if (r1 == 0) goto L_0x005d;
    L_0x001a:
        r1 = r6.a;	 Catch:{ IOException -> 0x013e }
        r1 = r1.a;	 Catch:{ IOException -> 0x013e }
        r1 = com.whatsapp.camera.CameraActivity.e(r1);	 Catch:{ IOException -> 0x013e }
        if (r1 == 0) goto L_0x005d;
    L_0x0024:
        r1 = r6.a;	 Catch:{ IOException -> 0x0140 }
        r1 = r1.a;	 Catch:{ IOException -> 0x0140 }
        r1 = com.whatsapp.camera.CameraActivity.d(r1);	 Catch:{ IOException -> 0x0140 }
        if (r1 != 0) goto L_0x005d;
    L_0x002e:
        r1 = r6.c;
        r1 = android.net.Uri.fromFile(r1);
        r2 = r6.b;
        if (r2 == 0) goto L_0x004c;
    L_0x0038:
        r1 = r1.buildUpon();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r3 = "1";
        r1 = r1.appendQueryParameter(r2, r3);
        r1 = r1.build();
    L_0x004c:
        r2 = r6.a;	 Catch:{ IOException -> 0x0166, OutOfMemoryError -> 0x0142, c_ -> 0x0164, SecurityException -> 0x0168 }
        r2 = r2.a;	 Catch:{ IOException -> 0x0166, OutOfMemoryError -> 0x0142, c_ -> 0x0164, SecurityException -> 0x0168 }
        r3 = r6.a;	 Catch:{ IOException -> 0x0166, OutOfMemoryError -> 0x0142, c_ -> 0x0164, SecurityException -> 0x0168 }
        r3 = r3.a;	 Catch:{ IOException -> 0x0166, OutOfMemoryError -> 0x0142, c_ -> 0x0164, SecurityException -> 0x0168 }
        r3 = com.whatsapp.camera.CameraActivity.e(r3);	 Catch:{ IOException -> 0x0166, OutOfMemoryError -> 0x0142, c_ -> 0x0164, SecurityException -> 0x0168 }
        r3 = r3.p;	 Catch:{ IOException -> 0x0166, OutOfMemoryError -> 0x0142, c_ -> 0x0164, SecurityException -> 0x0168 }
        com.whatsapp.util.ag.a(r2, r3, r1);	 Catch:{ IOException -> 0x0166, OutOfMemoryError -> 0x0142, c_ -> 0x0164, SecurityException -> 0x0168 }
    L_0x005d:
        return r0;
    L_0x005e:
        r1 = move-exception;
        r0 = java.lang.Boolean.FALSE;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.getMessage();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0014;
    L_0x007f:
        r0 = move-exception;
        r1 = r2;
    L_0x0081:
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x016a }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x016a }
        r3.<init>();	 Catch:{ all -> 0x016a }
        r4 = z;	 Catch:{ all -> 0x016a }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ all -> 0x016a }
        r3 = r3.append(r4);	 Catch:{ all -> 0x016a }
        r0 = r0.getMessage();	 Catch:{ all -> 0x016a }
        r0 = r3.append(r0);	 Catch:{ all -> 0x016a }
        r0 = r0.toString();	 Catch:{ all -> 0x016a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x016a }
        if (r1 == 0) goto L_0x0177;
    L_0x00a2:
        r1.close();	 Catch:{ IOException -> 0x00a8 }
        r0 = r2;
        goto L_0x0014;
    L_0x00a8:
        r1 = move-exception;
        r0 = java.lang.Boolean.FALSE;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.getMessage();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0014;
    L_0x00ca:
        r0 = move-exception;
    L_0x00cb:
        r1 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0114 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0114 }
        r3.<init>();	 Catch:{ all -> 0x0114 }
        r4 = z;	 Catch:{ all -> 0x0114 }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ all -> 0x0114 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0114 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0114 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x0114 }
        r0 = r0.toString();	 Catch:{ all -> 0x0114 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x0114 }
        if (r2 == 0) goto L_0x0174;
    L_0x00ec:
        r2.close();	 Catch:{ IOException -> 0x00f2 }
        r0 = r1;
        goto L_0x0014;
    L_0x00f2:
        r1 = move-exception;
        r0 = java.lang.Boolean.FALSE;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.getMessage();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0014;
    L_0x0114:
        r0 = move-exception;
    L_0x0115:
        if (r2 == 0) goto L_0x011a;
    L_0x0117:
        r2.close();	 Catch:{ IOException -> 0x011d, OutOfMemoryError -> 0x011b }
    L_0x011a:
        throw r0;
    L_0x011b:
        r0 = move-exception;
        throw r0;
    L_0x011d:
        r1 = move-exception;
        r2 = java.lang.Boolean.FALSE;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.getMessage();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x011a;
    L_0x013e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0140 }
    L_0x0140:
        r0 = move-exception;
        throw r0;
    L_0x0142:
        r0 = move-exception;
    L_0x0143:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = java.lang.Boolean.FALSE;
        goto L_0x005d;
    L_0x0164:
        r0 = move-exception;
        goto L_0x0143;
    L_0x0166:
        r0 = move-exception;
        goto L_0x0143;
    L_0x0168:
        r0 = move-exception;
        goto L_0x0143;
    L_0x016a:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0115;
    L_0x016d:
        r0 = move-exception;
        r2 = r1;
        goto L_0x00cb;
    L_0x0171:
        r0 = move-exception;
        goto L_0x0081;
    L_0x0174:
        r0 = r1;
        goto L_0x0014;
    L_0x0177:
        r0 = r2;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.k.a(java.lang.Void[]):java.lang.Boolean");
    }

    k(g gVar, File file, byte[] bArr, boolean z) {
        this.a = gVar;
        this.c = file;
        this.d = bArr;
        this.b = z;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
