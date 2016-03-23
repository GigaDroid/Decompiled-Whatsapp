package com.whatsapp;

import android.content.Intent;
import org.v;
import org.whispersystems.at;

public class IncorrectAppReleaseVersionActivity extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "y?%,\u0012q5o7\u0013l4/*Sy257\u0012v\u007f\f\u001f4V";
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
                        i3 = 24;
                        break;
                    case at.g /*1*/:
                        i3 = 81;
                        break;
                    case at.i /*2*/:
                        i3 = 65;
                        break;
                    case at.o /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = 125;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "M?*0\u0012o?a(\u001ct$$~\u001bw#a;\u0005l# ~\ta!$~G8";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "l(1;";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "p%5.\u000e\"~n)\no\u007f66\u001cl\" .\r62.3Ry?%,\u0012q5";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "y<;0G7~ .\rk~ 0\u0019j>(:Bhl\"1\u00106&)?\tk01.";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "u035\u0018lknq\u0019}% 7\u0011kn(:@{>,p\np05-\u001ch!";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "y?%,\u0012q5o7\u0013l4/*S{05;\u001aw#8p5W\u001c\u0004";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent(z[0]);
        intent.addCategory(z[1]);
        intent.setFlags(268435456);
        startActivity(intent);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        r5 = 2;
        r8 = 1;
        r7 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        super.onCreate(r10);
        r0 = 2130903072; // 0x7f030020 float:1.7412952E38 double:1.0528060025E-314;
        r9.setContentView(r0);
        r0 = 2131755230; // 0x7f1000de float:1.9141333E38 double:1.0532270245E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = r9.getIntent();
        r2 = r2.getExtras();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.getInt(r3);
        r3 = android.text.method.LinkMovementMethod.getInstance();
        r0.setMovementMethod(r3);
        switch(r2) {
            case 1: goto L_0x0050;
            case 2: goto L_0x0074;
            default: goto L_0x0032;
        };
    L_0x0032:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004e }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004e }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x004e }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x004e }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x004e }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x004e }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004e }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x004e }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x004e }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r3 = 2131230803; // 0x7f080053 float:1.807767E38 double:1.052967923E-314;
        r3 = r9.getString(r3);
        r4 = new java.lang.Object[r5];
        r5 = z;
        r6 = 6;
        r5 = r5[r6];
        r4[r7] = r5;
        r5 = z;
        r6 = 4;
        r5 = r5[r6];
        r4[r8] = r5;
        r3 = java.lang.String.format(r3, r4);
        r3 = android.text.Html.fromHtml(r3);
        r0.setText(r3);
        if (r1 == 0) goto L_0x0091;
    L_0x0074:
        r3 = 2131231269; // 0x7f080225 float:1.8078614E38 double:1.0529681534E-314;
        r3 = r9.getString(r3);
        r4 = new java.lang.Object[r8];
        r5 = z;
        r6 = 5;
        r5 = r5[r6];
        r4[r7] = r5;
        r3 = java.lang.String.format(r3, r4);
        r3 = android.text.Html.fromHtml(r3);	 Catch:{ IllegalArgumentException -> 0x004e }
        r0.setText(r3);	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r1 != 0) goto L_0x0032;
    L_0x0091:
        r0 = 2131755205; // 0x7f1000c5 float:1.9141283E38 double:1.053227012E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.yo;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.IncorrectAppReleaseVersionActivity.onCreate(android.os.Bundle):void");
    }
}
