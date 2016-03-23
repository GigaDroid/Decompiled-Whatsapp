package com.whatsapp;

import android.os.Bundle;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

public class Licenses extends DialogToastActivity {
    private static final String z;

    static {
        char[] toCharArray = "in`I3vbp\u0003>dimC)(klM9%".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 5;
                    break;
                case at.g /*1*/:
                    i2 = 7;
                    break;
                case at.i /*2*/:
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130903207);
        TextView textView = (TextView) findViewById(2131755721);
        CharSequence a = a(2131165187);
        if (a == null) {
            a = getString(2131232170);
        }
        textView.setText(a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(int r6) {
        /*
        r5 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r5.getResources();
        r2 = r0.openRawResource(r6);
        r3 = new java.io.ByteArrayOutputStream;
        r3.<init>();
        r0 = r2.read();	 Catch:{ IOException -> 0x002a }
    L_0x0013:
        r4 = -1;
        if (r0 == r4) goto L_0x001f;
    L_0x0016:
        r3.write(r0);	 Catch:{ IOException -> 0x002a }
        r0 = r2.read();	 Catch:{ IOException -> 0x002a }
        if (r1 == 0) goto L_0x0013;
    L_0x001f:
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.util.ao.a(r3);
        r0 = r3.toString();
    L_0x0029:
        return r0;
    L_0x002a:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004d }
        r1.<init>();	 Catch:{ all -> 0x004d }
        r4 = z;	 Catch:{ all -> 0x004d }
        r1 = r1.append(r4);	 Catch:{ all -> 0x004d }
        r0 = r0.toString();	 Catch:{ all -> 0x004d }
        r0 = r1.append(r0);	 Catch:{ all -> 0x004d }
        r0 = r0.toString();	 Catch:{ all -> 0x004d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x004d }
        r0 = 0;
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.util.ao.a(r3);
        goto L_0x0029;
    L_0x004d:
        r0 = move-exception;
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.util.ao.a(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Licenses.a(int):java.lang.String");
    }
}
