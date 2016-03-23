package com.whatsapp;

import android.content.res.Configuration;
import android.widget.LinearLayout;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class VoipNotAllowedActivity extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "L\u0010?\"wP";
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
                        i3 = 62;
                        break;
                    case at.g /*1*/:
                        i3 = 117;
                        break;
                    case at.i /*2*/:
                        i3 = 94;
                        break;
                    case at.o /*3*/:
                        i3 = 81;
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
                    str = "T\u001c:";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "V\u0001*!k\u0004Zq&oI[)9yJ\u0006?!h\u0010\u00161<7X\u0014/~\u007f[\u001b;#yRZli(\rEna ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "V\u0001*!k\u0004Zq&oI[)9yJ\u0006?!h\u0010\u00161<7X\u0014/~\u007f[\u001b;#yRZli(\rEna ";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "H\u001a7!vQ\u0001?=tQ\u0002;5y]\u00017'qJ\fq2j[\u0014*4";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "H\u001a7!vQ\u0001?=tQ\u0002;5y]\u00017'qJ\fq5}M\u0001,>a";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "S\u0010-\"yY\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131755310);
        if (configuration.orientation == 1) {
            linearLayout.setOrientation(1);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        linearLayout.setOrientation(0);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[6]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
        r11 = this;
        r10 = 2131232265; // 0x7f080609 float:1.8080634E38 double:1.0529686454E-314;
        r2 = 0;
        r9 = 1;
        r8 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        super.onCreate(r12);
        r0 = z;
        r1 = 5;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = 2130903291; // 0x7f0300fb float:1.7413396E38 double:1.0528061107E-314;
        r11.setContentView(r0);
        r0 = 2131755127; // 0x7f100077 float:1.9141124E38 double:1.0532269736E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.a4d.a(r0);
        r1 = r11.getIntent();
        r3 = z;
        r5 = 2;
        r3 = r3[r5];
        r1 = r1.getStringExtra(r3);
        r3 = r11.getIntent();
        r5 = z;
        r5 = r5[r8];
        r3 = r3.getIntExtra(r5, r8);
        r5 = com.whatsapp.App.as;
        r5 = r5.b(r1);
        r1 = 2131755606; // 0x7f100256 float:1.9142096E38 double:1.0532272103E-314;
        r1 = r11.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        switch(r3) {
            case 1: goto L_0x00ba;
            case 2: goto L_0x00ce;
            case 3: goto L_0x00e2;
            case 4: goto L_0x00fb;
            case 5: goto L_0x0114;
            case 6: goto L_0x0128;
            default: goto L_0x0050;
        };
    L_0x0050:
        r0 = 2131232257; // 0x7f080601 float:1.8080618E38 double:1.0529686415E-314;
        r3 = new java.lang.Object[r9];
        r5 = r5.i();
        r3[r8] = r5;
        r0 = r11.getString(r0, r3);
        r1.setText(r0);
    L_0x0062:
        r0 = 2131755404; // 0x7f10018c float:1.9141686E38 double:1.0532271105E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755981; // 0x7f1003cd float:1.9142857E38 double:1.0532273955E-314;
        r1 = r11.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        if (r2 != 0) goto L_0x0083;
    L_0x0076:
        r3 = 8;
        r1.setVisibility(r3);
        r3 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r0.setText(r3);
        if (r4 == 0) goto L_0x0094;
    L_0x0083:
        r1.setVisibility(r8);
        r3 = new com.whatsapp.ws;
        r3.<init>(r11, r2);
        r1.setOnClickListener(r3);
        r1 = 2131231581; // 0x7f08035d float:1.8079247E38 double:1.0529683075E-314;
        r0.setText(r1);
    L_0x0094:
        r1 = new com.whatsapp.bz;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r0 = 2131755310; // 0x7f10012e float:1.9141496E38 double:1.053227064E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.LinearLayout) r0;
        r1 = r11.getResources();
        r1 = r1.getConfiguration();
        r1 = r1.orientation;
        if (r1 != r9) goto L_0x00b6;
    L_0x00b1:
        r0.setOrientation(r9);
        if (r4 == 0) goto L_0x00b9;
    L_0x00b6:
        r0.setOrientation(r8);
    L_0x00b9:
        return;
    L_0x00ba:
        r3 = 2131232260; // 0x7f080604 float:1.8080624E38 double:1.052968643E-314;
        r6 = new java.lang.Object[r9];
        r7 = r5.i();
        r6[r8] = r7;
        r3 = r11.getString(r3, r6);
        r1.setText(r3);
        if (r4 == 0) goto L_0x0062;
    L_0x00ce:
        r3 = 2131232261; // 0x7f080605 float:1.8080626E38 double:1.0529686435E-314;
        r6 = new java.lang.Object[r9];
        r7 = r5.i();
        r6[r8] = r7;
        r3 = r11.getString(r3, r6);
        r1.setText(r3);
        if (r4 == 0) goto L_0x0062;
    L_0x00e2:
        r3 = 2131232259; // 0x7f080603 float:1.8080622E38 double:1.0529686425E-314;
        r6 = new java.lang.Object[r9];
        r7 = r5.i();
        r6[r8] = r7;
        r3 = r11.getString(r3, r6);
        r1.setText(r3);
        r3 = z;
        r6 = 3;
        r3 = r3[r6];
        if (r4 == 0) goto L_0x0141;
    L_0x00fb:
        r3 = 2131232258; // 0x7f080602 float:1.808062E38 double:1.052968642E-314;
        r6 = new java.lang.Object[r9];
        r7 = r5.i();
        r6[r8] = r7;
        r3 = r11.getString(r3, r6);
        r1.setText(r3);
        r3 = z;
        r6 = 4;
        r3 = r3[r6];
        if (r4 == 0) goto L_0x0141;
    L_0x0114:
        r0.setText(r10);
        r3 = r11.getIntent();
        r6 = z;
        r6 = r6[r9];
        r3 = r3.getStringExtra(r6);
        r1.setText(r3);
        if (r4 == 0) goto L_0x0062;
    L_0x0128:
        r0.setText(r10);
        r0 = 2131232264; // 0x7f080608 float:1.8080632E38 double:1.052968645E-314;
        r3 = new java.lang.Object[r9];
        r6 = r5.i();
        r3[r8] = r6;
        r0 = r11.getString(r0, r3);
        r1.setText(r0);
        if (r4 == 0) goto L_0x0062;
    L_0x013f:
        goto L_0x0050;
    L_0x0141:
        r2 = r3;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipNotAllowedActivity.onCreate(android.os.Bundle):void");
    }
}
