package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

public class px extends AsyncTask {
    private static final String[] z;
    final aqq a;
    boolean b;
    boolean c;
    boolean d;

    static {
        String[] strArr = new String[5];
        String str = "\u0005S:\u001bn\n[;\u0015{\u0007Y:\u0017'\u0001C&\u0002z\u0016F)\u0000m\u001eE/\u0001|\u001cD-\u0006i\u0000]h\u0001m\u0007B!\u001coS[\u0007\u001cm#D-\u0002i\u0001S\u0005\u0001o\u0000B'\u0000m'W;\u0019I\u001fD-\u0013l\np!\u001ca\u0000^-\u0016(\u0007Yh\u0006z\u0006S";
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
                        i3 = 115;
                        break;
                    case at.g /*1*/:
                        i3 = 54;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = 8;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0005S:\u001bn\n[;\u0015{\u0007Y:\u0017'\u0001S;\u0007d\u0007\u0019";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0005S:\u001bn\n[;\u0015{\u0007Y:\u0017'\u0001C&\u0002z\u0016F)\u0000m\u001eE/\u0001|\u001cD-\u0006i\u0000]h\u0006`\u001aEh\u0013|\u0007S%\u0002|SP)\u001bd\u0016Rh\u0010}\u0007\u0016)\u001cg\u0007^-\u0000(\u0012B<\u0017e\u0003Bh\u001bfSF)\u0000i\u001fZ-\u001e(\u0003D'\u0011m\u0016R-\u0016(\u0015C:\u0006`\u0016Dh\u0006`\u0012Xh\u0006`\u001aEh\u0001|\u0012Q-^(\u0007^-\u0000m\u0015Y:\u0017$SW*\u001dz\u0007_&\u0015(\u0007^!\u0001(\u0012B<\u0017e\u0003Bh";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0005S:\u001bn\n[;\u0015{\u0007Y:\u0017'\u0003D-\u0002i\u0001S%\u0001o\u0000B'\u0000m\\X'\u0006z\u0016Q&\u0013e\u0016\u0019;\u0017f\u0017\u001b)\u0011|\u001a@-";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0005S:\u001bn\n[;\u0015{\u0007Y:\u0017'\u0015W!\u001em\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public px(aqq com_whatsapp_aqq, boolean z, boolean z2, boolean z3) {
        this.a = com_whatsapp_aqq;
        this.c = false;
        this.d = z;
        this.b = z3;
    }

    protected axj a(Object[] objArr) {
        axj a;
        Throwable e;
        axj com_whatsapp_axj = axj.FAILED;
        gj kgVar = new kg(this);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            a = App.aK.a(this.d, kgVar);
            try {
                publishProgress(new Integer[]{Integer.valueOf(100)});
                currentTimeMillis = 3000 - (System.currentTimeMillis() - currentTimeMillis);
                try {
                    if (this.d && currentTimeMillis > 0) {
                        try {
                            Thread.sleep(currentTimeMillis);
                        } catch (InterruptedException e2) {
                        }
                    }
                } catch (InterruptedException e3) {
                    throw e3;
                } catch (IOException e4) {
                    throw e4;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable e6) {
            Throwable th = e6;
            a = com_whatsapp_axj;
            e = th;
            Log.a(e);
            this.c = true;
            return a;
        }
        return a;
    }

    public void a(Integer[] numArr) {
        this.a.a(numArr[0].intValue());
        if (aqq.c != null && aqq.c.getProgress() != numArr[0].intValue()) {
            aqq.c.setProgress(numArr[0].intValue());
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a(objArr);
    }

    static void a(px pxVar, Object[] objArr) {
        pxVar.publishProgress(objArr);
    }

    public void onProgressUpdate(Object[] objArr) {
        a((Integer[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((axj) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.axj r7) {
        /*
        r6 = this;
        r1 = 0;
        r2 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.aqq.c;
        if (r0 == 0) goto L_0x0016;
    L_0x0008:
        r0 = r6.a;
        r0 = com.whatsapp.aqq.b(r0);
        r4 = 100;
        r0.removeDialog(r4);
        r0 = 0;
        com.whatsapp.aqq.c = r0;
    L_0x0016:
        r0 = com.whatsapp.axj.FAILED;
        if (r7 != r0) goto L_0x0031;
    L_0x001a:
        r0 = com.whatsapp.aqq.c();
        r0 = r0.get();
        if (r0 == 0) goto L_0x0031;
    L_0x0024:
        r0 = com.whatsapp.aqq.c();
        r0 = r0.get();
        r0 = (com.whatsapp.axj) r0;
        if (r3 == 0) goto L_0x0117;
    L_0x0030:
        r7 = r0;
    L_0x0031:
        r0 = com.whatsapp.aqq.c();
        r0 = r0.get();
        if (r0 != 0) goto L_0x0042;
    L_0x003b:
        r0 = com.whatsapp.aqq.c();
        r0.set(r7);
    L_0x0042:
        r0 = com.whatsapp.axj.FAILED;
        if (r7 != r0) goto L_0x004d;
    L_0x0046:
        r0 = z;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
    L_0x004d:
        r0 = com.whatsapp.axj.FAILED;
        if (r7 != r0) goto L_0x0077;
    L_0x0051:
        r0 = r6.a;
        r0 = com.whatsapp.aqq.c(r0);
        r0 = r0.getAndSet(r2);
        if (r0 != 0) goto L_0x0077;
    L_0x005d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r7);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x0076:
        return;
    L_0x0077:
        r0 = com.whatsapp.App.aK;
        r0.m();
        r0 = com.whatsapp.axj.FAILED;
        if (r7 == r0) goto L_0x00e1;
    L_0x0080:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 2;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.append(r7);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r6.d;
        if (r0 == 0) goto L_0x00b8;
    L_0x009d:
        r0 = com.whatsapp.axj.SUCCESS_CREATED;
        if (r7 != r0) goto L_0x00b8;
    L_0x00a1:
        r0 = r6.a;
        r0 = com.whatsapp.aqq.b(r0);
        r0 = r0 instanceof com.whatsapp.gdrive.GoogleDriveActivity;
        if (r0 != 0) goto L_0x0115;
    L_0x00ab:
        r0 = r6.a;
        r0 = com.whatsapp.aqq.b(r0);
        r4 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r0.showDialog(r4);
        if (r3 == 0) goto L_0x0115;
    L_0x00b8:
        r0 = r2;
    L_0x00b9:
        r4 = com.whatsapp.App.aK;
        r4.j();
        com.whatsapp.App.ao();
        com.whatsapp.App.k();
        r4 = r6.a;
        r4 = r4.d;
        if (r4 != 0) goto L_0x00dc;
    L_0x00ca:
        r4 = com.whatsapp.App.z();
        com.whatsapp.App.e(r4);
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        com.whatsapp.App.i(r2);
    L_0x00dc:
        com.whatsapp.App.x();
        if (r3 == 0) goto L_0x00e9;
    L_0x00e1:
        r0 = z;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r1;
    L_0x00e9:
        r1 = r6.a;
        r1 = r1.d;
        if (r1 != 0) goto L_0x00f6;
    L_0x00ef:
        r1 = com.whatsapp.App.z();
        com.whatsapp.messaging.MessageService.b(r1);
    L_0x00f6:
        r1 = r6.a;
        r1 = r1.d;
        if (r1 == 0) goto L_0x0109;
    L_0x00fc:
        r1 = r6.d;
        if (r1 == 0) goto L_0x0109;
    L_0x0100:
        r1 = r6.a;
        r1 = com.whatsapp.aqq.b(r1);
        com.whatsapp.wallpaper.k.c(r1);
    L_0x0109:
        r1 = r6.a;
        r1.a();
        r1 = r6.a;
        r1.c(r0);
        goto L_0x0076;
    L_0x0115:
        r0 = r1;
        goto L_0x00b9;
    L_0x0117:
        r7 = r0;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.px.a(com.whatsapp.axj):void");
    }
}
