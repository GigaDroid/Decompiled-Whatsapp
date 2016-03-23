package com.whatsapp;

import android.content.Intent;
import android.os.ConditionVariable;
import org.v;
import org.whispersystems.at;

public class SpamWarningActivity extends DialogToastActivity {
    private static ConditionVariable n;
    private static final String[] z;
    private int o;

    public static void c(boolean z) {
        if (z) {
            n.open();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        n.close();
    }

    static ConditionVariable b() {
        return n;
    }

    private void c() {
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(2131755177);
        circularProgressBar.setVisibility(0);
        circularProgressBar.setProgressBarBackgroundColor(-65536);
        circularProgressBar.setProgressBarColor(-2039584);
        circularProgressBar.setPaintStrokeFactor(30.0f);
        circularProgressBar.setKnobEnabled(true);
        circularProgressBar.setMax(this.o * 1000);
        new ax4(this, (long) (this.o * 1000), 10, circularProgressBar).start();
    }

    static {
        String[] strArr = new String[6];
        String str = "#YCh[?~Zov5DPnG\"R";
        boolean z = true;
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
                        i3 = 70;
                        break;
                    case at.g /*1*/:
                        i3 = 33;
                        break;
                    case at.i /*2*/:
                        i3 = 51;
                        break;
                    case at.o /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "f@]e\t#YCh[?\u0001\u001bhGfRVbF(E@(\t";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "5QRlv1@Ao@(FlsL'R\\ov-DJ";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "'OWsF/E\u001dhG2D]u\u0007%@GdN)SJ/a\tlv";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "'OWsF/E\u001dhG2D]u\u0007'BGhF(\u000f~@`\b";
                    z = true;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    n = new ConditionVariable(false);
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0015QRl~'S]hG!`Pu@0HGx\t5URs]#E\u0013v@2I\u0013bF\"D\u0013";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    private void a() {
        new qr(this).start();
    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(z[5]);
        intent.addCategory(z[4]);
        intent.setFlags(268435456);
        startActivity(intent);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r8) {
        /*
        r7 = this;
        r6 = 8;
        r5 = -1;
        r2 = com.whatsapp.DialogToastActivity.f;
        super.onCreate(r8);
        r0 = 2130903075; // 0x7f030023 float:1.7412958E38 double:1.052806004E-314;
        r7.setContentView(r0);
        r0 = 2131232056; // 0x7f080538 float:1.808021E38 double:1.052968542E-314;
        r7.setTitle(r0);
        r0 = r7.getIntent();
        r1 = z;
        r3 = 3;
        r1 = r1[r3];
        r3 = 100;
        r3 = r0.getIntExtra(r1, r3);
        r0 = r7.getIntent();
        r1 = z;
        r4 = 0;
        r1 = r1[r4];
        r0 = r0.getIntExtra(r1, r5);
        r7.o = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r4 = 1;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r1 = z;
        r4 = 2;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = r7.o;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        switch(r3) {
            case 101: goto L_0x00a8;
            case 102: goto L_0x00ad;
            case 103: goto L_0x00b2;
            case 104: goto L_0x00b7;
            case 105: goto L_0x005d;
            case 106: goto L_0x00bc;
            default: goto L_0x005d;
        };
    L_0x005d:
        r0 = r7.o;
        if (r0 != r5) goto L_0x0066;
    L_0x0061:
        r0 = 2131232054; // 0x7f080536 float:1.8080206E38 double:1.052968541E-314;
        if (r2 == 0) goto L_0x00c1;
    L_0x0066:
        r0 = 2131232052; // 0x7f080534 float:1.8080202E38 double:1.05296854E-314;
        r1 = r0;
    L_0x006a:
        r0 = 2131755267; // 0x7f100103 float:1.9141408E38 double:1.053227043E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r4 = new com.whatsapp.a2l;
        r4.<init>(r7, r3);
        r0.setOnClickListener(r4);
        r0 = 2131755266; // 0x7f100102 float:1.9141406E38 double:1.0532270423E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0.setText(r1);
        r0 = r7.o;
        if (r0 != r5) goto L_0x009a;
    L_0x008b:
        r0 = 2131755177; // 0x7f1000a9 float:1.9141226E38 double:1.0532269983E-314;
        r0 = r7.findViewById(r0);
        r0.setVisibility(r6);
        r7.a();
        if (r2 == 0) goto L_0x00a7;
    L_0x009a:
        r0 = 2131755268; // 0x7f100104 float:1.914141E38 double:1.0532270433E-314;
        r0 = r7.findViewById(r0);
        r0.setVisibility(r6);
        r7.c();
    L_0x00a7:
        return;
    L_0x00a8:
        r0 = 2131232059; // 0x7f08053b float:1.8080217E38 double:1.0529685437E-314;
        if (r2 == 0) goto L_0x00c1;
    L_0x00ad:
        r0 = 2131232057; // 0x7f080539 float:1.8080213E38 double:1.0529685427E-314;
        if (r2 == 0) goto L_0x00c1;
    L_0x00b2:
        r0 = 2131232058; // 0x7f08053a float:1.8080215E38 double:1.052968543E-314;
        if (r2 == 0) goto L_0x00c1;
    L_0x00b7:
        r0 = 2131232061; // 0x7f08053d float:1.808022E38 double:1.0529685447E-314;
        if (r2 == 0) goto L_0x00c1;
    L_0x00bc:
        r0 = 2131232060; // 0x7f08053c float:1.8080219E38 double:1.052968544E-314;
        if (r2 != 0) goto L_0x005d;
    L_0x00c1:
        r1 = r0;
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SpamWarningActivity.onCreate(android.os.Bundle):void");
    }
}
