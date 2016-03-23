package com.whatsapp;

import android.os.Bundle;
import android.support.design.R;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ai0 extends aic {
    private static final String[] z;
    private int c;
    final RegisterName d;
    private OnClickListener e;
    private boolean f;

    static {
        String[] strArr = new String[4];
        String str = "~\u001a7C,";
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
                        i3 = 13;
                        break;
                    case at.g /*1*/:
                        i3 = 110;
                        break;
                    case at.i /*2*/:
                        i3 = 86;
                        break;
                    case at.o /*3*/:
                        i3 = 55;
                        break;
                    default:
                        i3 = 73;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u007f\u000b1^:y\u000b$Y(`\u000byB9i\u000f\"R:y\u000f\"Rf~\u001a7C,-";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u007f\u000b1^:y\u000b$Y(`\u000byD0c\ryQ c\u0007%_,i";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "~\u001a7C,";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b() {
        RegisterName.a(this.d, findViewById(2131755821));
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            onSaveInstanceState.putInt(z[0], this.c);
        }
        return onSaveInstanceState;
    }

    public ai0(RegisterName registerName) {
        this.d = registerName;
        super(registerName, 2130903248);
        this.c = 0;
        this.e = new a4t(this);
    }

    protected void a(int i) {
        Log.i(z[2] + i);
        this.c = i;
        if (i == 1 || App.t(getContext()) == 3) {
            findViewById(2131755829).setVisibility(0);
            findViewById(2131755830).setVisibility(8);
            RegisterName.f(this.d);
            if (RegisterName.c(this.d) != null) {
                RegisterName.c(this.d).setVisibility(8);
            }
            RegisterName.g(this.d).removeMessages(0);
            Log.i(z[3]);
            findViewById(2131755829).setOnClickListener(new a5n(this));
            View findViewById = findViewById(R.id.center);
            View findViewById2 = findViewById(2131755823);
            if (!this.f) {
                this.f = true;
                findViewById.startAnimation(new ub(this, findViewById, findViewById2));
            }
            findViewById.setOnClickListener(new au0(this, findViewById, findViewById2));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        findViewById(2131755829).setVisibility(8);
        findViewById(2131755830).setVisibility(0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r15) {
        /*
        r14 = this;
        r13 = 2131755824; // 0x7f100330 float:1.9142538E38 double:1.053227318E-314;
        r12 = 1;
        r11 = 10;
        r10 = 8;
        r4 = 0;
        r7 = com.whatsapp.DialogToastActivity.f;
        super.onCreate(r15);
        r0 = r14.getWindow();
        r0.setFormat(r12);
        r0 = r14.getWindow();
        r1 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0.addFlags(r1);
        r0 = r14.getWindow();
        r1 = 3;
        r0.setSoftInputMode(r1);
        r0 = 2131755827; // 0x7f100333 float:1.9142544E38 double:1.0532273194E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r0.getPaintFlags();
        r1 = r1 | 8;
        r0.setPaintFlags(r1);
        r1 = r14.e;
        r0.setOnClickListener(r1);
        r1 = r14.d;
        r1 = com.whatsapp.RegisterName.k(r1);
        r0.setOnTouchListener(r1);
        r0 = r14.d;
        r1 = 2131231392; // 0x7f0802a0 float:1.8078864E38 double:1.052968214E-314;
        r8 = r0.getString(r1);
        r0 = 2131755825; // 0x7f100331 float:1.914254E38 double:1.0532273185E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        if (r0 == 0) goto L_0x00b8;
    L_0x005a:
        r2 = r8.indexOf(r11, r4);
        r1 = r2 + 1;
        r3 = r8.indexOf(r11, r1);
        if (r2 <= 0) goto L_0x00f0;
    L_0x0066:
        r1 = r8.substring(r4, r2);
        r6 = r1;
    L_0x006b:
        if (r3 <= r2) goto L_0x00f6;
    L_0x006d:
        r1 = r2 + 1;
        r1 = r8.substring(r1, r3);
        r5 = r1;
    L_0x0074:
        if (r3 <= 0) goto L_0x00ff;
    L_0x0076:
        r1 = r3 + 1;
        r1 = r8.substring(r1);
        r3 = r1;
    L_0x007d:
        r1 = r14.findViewById(r13);
        r1 = (android.widget.TextView) r1;
        r2 = 2131755826; // 0x7f100332 float:1.9142542E38 double:1.053227319E-314;
        r2 = r14.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r9 = android.text.TextUtils.isEmpty(r6);
        if (r9 != 0) goto L_0x0097;
    L_0x0092:
        r1.setText(r6);
        if (r7 == 0) goto L_0x009a;
    L_0x0097:
        r1.setVisibility(r10);
    L_0x009a:
        r1 = android.text.TextUtils.isEmpty(r5);
        if (r1 != 0) goto L_0x00a5;
    L_0x00a0:
        r0.setText(r5);
        if (r7 == 0) goto L_0x00a8;
    L_0x00a5:
        r0.setVisibility(r10);
    L_0x00a8:
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 != 0) goto L_0x00b3;
    L_0x00ae:
        r2.setText(r3);
        if (r7 == 0) goto L_0x00b6;
    L_0x00b3:
        r2.setVisibility(r10);
    L_0x00b6:
        if (r7 == 0) goto L_0x00c7;
    L_0x00b8:
        r0 = r14.findViewById(r13);
        r0 = (android.widget.TextView) r0;
        r1 = 32;
        r1 = r8.replace(r11, r1);
        r0.setText(r1);
    L_0x00c7:
        if (r15 != 0) goto L_0x0105;
    L_0x00c9:
        r0 = r4;
    L_0x00ca:
        r14.a(r0);
        r0 = r14.d;
        r1 = 2131755821; // 0x7f10032d float:1.9142532E38 double:1.0532273165E-314;
        r1 = r14.findViewById(r1);
        com.whatsapp.RegisterName.a(r0, r1);
        r0 = r14.d;
        r0 = com.whatsapp.RegisterName.c(r0);
        if (r0 == 0) goto L_0x00ef;
    L_0x00e1:
        r0 = r14.d;
        r0 = com.whatsapp.RegisterName.c(r0);
        r1 = new com.whatsapp.ps;
        r1.<init>(r14);
        r0.setOnClickListener(r1);
    L_0x00ef:
        return;
    L_0x00f0:
        r1 = "";
        r6 = r1;
        goto L_0x006b;
    L_0x00f6:
        r1 = r2 + 1;
        r1 = r8.substring(r1);
        r5 = r1;
        goto L_0x0074;
    L_0x00ff:
        r1 = "";
        r3 = r1;
        goto L_0x007d;
    L_0x0105:
        r0 = z;
        r0 = r0[r12];
        r0 = r15.getInt(r0);
        goto L_0x00ca;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ai0.onCreate(android.os.Bundle):void");
    }
}
