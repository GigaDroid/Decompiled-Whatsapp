package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import org.v;
import org.whispersystems.at;

final class aa3 extends Handler {
    private static final String[] z;
    private final WeakReference a;

    static {
        String[] strArr = new String[5];
        String str = "w\t98lvA4>{|\u0019;)7p\u00040>s>\u0002 0zv\u001ez0yg\u000f=";
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
                        i3 = 19;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 85;
                        break;
                    case at.o /*3*/:
                        i3 = 93;
                        break;
                    default:
                        i3 = 24;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "w\t98lvA4>{|\u0019;)7v\u001e'2j";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "w\t98lvL4>{|\u0019;)8d\r&}\u007fr\u001e7<\u007fvL62t\u007f\t6)}wL\"4l{L4>lz\u001a0}uv\u001f&<\u007fv\u001fu.lz\u00009}}}\u001d 8mv\bo}";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "w\t98lvA4>{|\u0019;)7g\u000588wf\u0018";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "w\t98lvA4>{|\u0019;)7p\u00040>s>\u0002 0zv\u001ez0q`\u00014){{";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public aa3(DeleteAccount deleteAccount) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(deleteAccount);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r9) {
        /*
        r8 = this;
        r7 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r6 = 4;
        r5 = 1;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.a;
        r0 = r0.get();
        r0 = (com.whatsapp.DeleteAccount) r0;
        if (r0 != 0) goto L_0x0029;
    L_0x0010:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r9);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
    L_0x0029:
        r2 = r9.what;
        switch(r2) {
            case 1: goto L_0x002f;
            case 2: goto L_0x004e;
            case 3: goto L_0x0065;
            case 4: goto L_0x0077;
            default: goto L_0x002e;
        };
    L_0x002e:
        return;
    L_0x002f:
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        com.whatsapp.util.Log.w(r2);
        r8.removeMessages(r6);
        if (r0 == 0) goto L_0x002e;
    L_0x003c:
        r0.removeDialog(r5);
        r2 = new android.content.Intent;
        r3 = com.whatsapp.DeleteAccountFeedback.class;
        r2.<init>(r0, r3);
        r0.startActivity(r2);
        r0.finish();
        if (r1 == 0) goto L_0x002e;
    L_0x004e:
        r2 = z;
        r2 = r2[r5];
        com.whatsapp.util.Log.w(r2);
        r8.removeMessages(r6);
        if (r0 == 0) goto L_0x002e;
    L_0x005a:
        r0.removeDialog(r5);
        r2 = 2131231033; // 0x7f080139 float:1.8078136E38 double:1.052968037E-314;
        r0.a(r2);
        if (r1 == 0) goto L_0x002e;
    L_0x0065:
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        com.whatsapp.util.Log.e(r2);
        if (r0 == 0) goto L_0x002e;
    L_0x006f:
        r0.removeDialog(r5);
        r0.showDialog(r7);
        if (r1 == 0) goto L_0x002e;
    L_0x0077:
        r1 = z;
        r1 = r1[r6];
        com.whatsapp.util.Log.e(r1);
        r8.removeMessages(r6);
        if (r0 == 0) goto L_0x002e;
    L_0x0083:
        r0.removeDialog(r5);
        r0.showDialog(r7);
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aa3.handleMessage(android.os.Message):void");
    }
}
