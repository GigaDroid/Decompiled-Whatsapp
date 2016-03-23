package com.whatsapp;

import android.app.KeyguardManager;
import android.support.v4.app.DialogFragment;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public final class RequestPermissionsDialogFragment extends DialogFragment {
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "xSf0k~Mb4";
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
                        i3 = 28;
                        break;
                    case at.g /*1*/:
                        i3 = 33;
                        break;
                    case at.i /*2*/:
                        i3 = 7;
                        break;
                    case at.o /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 10;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "lDu*coRn(do\u000ec.kpN`hln@`*orU()e<Qb5guRt.erR'7xsWn#ox";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "pNd,ox~j4mCHc";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "lDu*UxDi.kp~j4mCHc";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "wD~ \u007f}Sc";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "qR`\u0018cx";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "pNd,ox~w\"xq~c\"du@k\u0018goFX.n";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "lDu*coRn(do";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private int a(boolean z) {
        boolean inKeyguardRestrictedInputMode = ((KeyguardManager) getContext().getSystemService(z[5])).inKeyguardRestrictedInputMode();
        if (!z) {
            return inKeyguardRestrictedInputMode ? getArguments().getInt(z[7]) : getArguments().getInt(z[4]);
        } else {
            if (inKeyguardRestrictedInputMode) {
                return getArguments().getInt(z[3]);
            }
            return getArguments().getInt(z[6]);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    public android.app.Dialog onCreateDialog(android.os.Bundle r12) {
        /*
        r11 = this;
        r10 = 2;
        r9 = 2131755834; // 0x7f10033a float:1.9142558E38 double:1.053227323E-314;
        r8 = 2131755743; // 0x7f1002df float:1.9142374E38 double:1.053227278E-314;
        r7 = 1;
        r6 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r2 = new android.app.Dialog;
        r0 = r11.getActivity();
        r2.<init>(r0);
        r2.requestWindowFeature(r7);
        r0 = r2.getWindow();
        r1 = new android.graphics.drawable.ColorDrawable;
        r1.<init>(r6);
        r0.setBackgroundDrawable(r1);
        r2.setCancelable(r6);
        r2.setCanceledOnTouchOutside(r6);
        r0 = r11.getActivity();
        r0 = r0.getLayoutInflater();
        r1 = 2130903249; // 0x7f0300d1 float:1.741331E38 double:1.05280609E-314;
        r4 = 0;
        r0 = com.whatsapp.aam.a(r0, r1, r4, r6);
        r2.setContentView(r0);
        r1 = r11.getArguments();
        r0 = z;
        r0 = r0[r6];
        r4 = r1.getIntArray(r0);
        if (r4 == 0) goto L_0x00a1;
    L_0x004a:
        r0 = r4.length;
        if (r0 != r7) goto L_0x006f;
    L_0x004d:
        r0 = 2131755833; // 0x7f100339 float:1.9142556E38 double:1.0532273224E-314;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r5 = r4[r6];
        r0.setImageResource(r5);
        r0 = r2.findViewById(r8);
        r5 = 8;
        r0.setVisibility(r5);
        r0 = r2.findViewById(r9);
        r5 = 8;
        r0.setVisibility(r5);
        if (r3 == 0) goto L_0x00a1;
    L_0x006f:
        r0 = r2.findViewById(r8);
        r0 = (android.widget.ImageView) r0;
        r5 = r4[r6];
        r0.setImageResource(r5);
        r0 = 2131755833; // 0x7f100339 float:1.9142556E38 double:1.0532273224E-314;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r5 = r4[r7];
        r0.setImageResource(r5);
        r0 = r2.findViewById(r9);
        r0 = (android.widget.ImageView) r0;
        r4 = r4[r10];
        r0.setImageResource(r4);
        r0 = r2.findViewById(r8);
        r0.setVisibility(r6);
        r0 = r2.findViewById(r9);
        r0.setVisibility(r6);
    L_0x00a1:
        r0 = 2131755369; // 0x7f100169 float:1.9141615E38 double:1.053227093E-314;
        r0 = r2.findViewById(r0);
        r4 = new com.whatsapp.z3;
        r4.<init>(r11);
        r0.setOnClickListener(r4);
        r0 = z;
        r0 = r0[r7];
        r4 = r1.getStringArray(r0);
        if (r4 != 0) goto L_0x00c3;
    L_0x00ba:
        r0 = z;
        r0 = r0[r10];
        com.whatsapp.util.Log.e(r0);
        r0 = r2;
    L_0x00c2:
        return r0;
    L_0x00c3:
        r0 = 2131755370; // 0x7f10016a float:1.9141617E38 double:1.0532270937E-314;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = r11.getActivity();
        r5 = com.whatsapp.RequestPermissionActivity.b(r1, r4);
        r1 = 2131755835; // 0x7f10033b float:1.914256E38 double:1.0532273234E-314;
        r1 = r2.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r6 = r11.a(r5);
        r1.setText(r6);
        if (r5 == 0) goto L_0x00f0;
    L_0x00e6:
        r1 = new com.whatsapp.zk;
        r1.<init>(r11, r4);
        r0.setOnClickListener(r1);
        if (r3 == 0) goto L_0x00fe;
    L_0x00f0:
        r1 = 2131231634; // 0x7f080392 float:1.8079355E38 double:1.0529683337E-314;
        r0.setText(r1);
        r1 = new com.whatsapp.zt;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
    L_0x00fe:
        r0 = r2;
        goto L_0x00c2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionsDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    public void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
    }
}
