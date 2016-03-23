package com.whatsapp;

import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class ae9 implements OnClickListener {
    private static final String z;
    final ProfilePhotoReminder a;

    static {
        char[] toCharArray = "\t\u0010(J!\u000f\u0010=M3\u0016\u0010`M=V\u0005:P:\u0015\u0014\"F".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 123;
                    break;
                case at.g /*1*/:
                    i2 = 117;
                    break;
                case at.i /*2*/:
                    i2 = 79;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ae9(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
        r4 = this;
        r0 = r4.a;
        r0 = com.whatsapp.ProfilePhotoReminder.b(r0);
        r0 = r0.getText();
        r0 = r0.toString();
        r0 = r0.trim();
        r1 = r0.length();
        if (r1 != 0) goto L_0x002a;
    L_0x0018:
        r1 = z;
        com.whatsapp.util.Log.w(r1);
        r1 = r4.a;
        r2 = 2131231753; // 0x7f080409 float:1.8079596E38 double:1.0529683925E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x003e;
    L_0x002a:
        r1 = r4.a;
        r1 = com.whatsapp.App.h(r1);
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x003e;
    L_0x0036:
        r1 = com.whatsapp.App.p;
        r1.m(r0);
        com.whatsapp.App.a(r0);
    L_0x003e:
        r0 = r4.a;
        r0.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ae9.onClick(android.view.View):void");
    }
}
