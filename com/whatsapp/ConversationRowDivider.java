package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.appcompat.R;
import android.view.View.OnClickListener;
import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.at;

public class ConversationRowDivider extends ConversationRow {
    private static final String[] S;
    OnClickListener Q;
    private final DividerView R;

    public class EncryptionChangeDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[2];
            String str = "\u0015,7";
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
                            i3 = 127;
                            break;
                        case at.g /*1*/:
                            i3 = 69;
                            break;
                        case at.i /*2*/:
                            i3 = 83;
                            break;
                        case at.o /*3*/:
                            i3 = 84;
                            break;
                        default:
                            i3 = 60;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "\u0015,7";
                        obj = null;
                }
            }
        }

        @NonNull
        public static EncryptionChangeDialogFragment a(@NonNull String str) {
            EncryptionChangeDialogFragment encryptionChangeDialogFragment = new EncryptionChangeDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[1], str);
            encryptionChangeDialogFragment.setArguments(bundle);
            return encryptionChangeDialogFragment;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.support.annotation.NonNull
        public android.app.Dialog onCreateDialog(android.os.Bundle r6) {
            /*
            r5 = this;
            r1 = com.whatsapp.DialogToastActivity.f;
            r0 = com.whatsapp.App.as;
            r2 = r5.getArguments();
            r3 = z;
            r4 = 0;
            r3 = r3[r4];
            r2 = r2.getString(r3);
            r2 = r0.b(r2);
            r0 = r2.c();
            if (r0 == 0) goto L_0x0028;
        L_0x001b:
            r0 = r5.getContext();
            r3 = 2131231288; // 0x7f080238 float:1.8078653E38 double:1.0529681627E-314;
            r0 = r0.getString(r3);
            if (r1 == 0) goto L_0x0046;
        L_0x0028:
            r0 = r2.m();
            if (r0 == 0) goto L_0x003b;
        L_0x002e:
            r0 = r5.getContext();
            r3 = 2131230846; // 0x7f08007e float:1.8077756E38 double:1.0529679444E-314;
            r0 = r0.getString(r3);
            if (r1 == 0) goto L_0x0046;
        L_0x003b:
            r0 = r5.getContext();
            r1 = 2131230908; // 0x7f0800bc float:1.8077882E38 double:1.052967975E-314;
            r0 = r0.getString(r1);
        L_0x0046:
            r1 = new android.support.v7.app.AlertDialog$Builder;
            r3 = r5.getActivity();
            r1.<init>(r3);
            r3 = r5.getActivity();
            r3 = r3.getBaseContext();
            r0 = com.whatsapp.a28.b(r0, r3);
            r0 = r1.setMessage(r0);
            r1 = 1;
            r0 = r0.setCancelable(r1);
            r1 = 2131231355; // 0x7f08027b float:1.8078789E38 double:1.052968196E-314;
            r3 = new com.whatsapp.n6;
            r3.<init>(r5);
            r0 = r0.setNeutralButton(r1, r3);
            r1 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
            r3 = new com.whatsapp.el;
            r3.<init>(r5);
            r0 = r0.setNegativeButton(r1, r3);
            r1 = r2.c();
            if (r1 != 0) goto L_0x0093;
        L_0x0082:
            r1 = r2.m();
            if (r1 != 0) goto L_0x0093;
        L_0x0088:
            r1 = 2131231356; // 0x7f08027c float:1.807879E38 double:1.0529681963E-314;
            r3 = new com.whatsapp.nb;
            r3.<init>(r5, r2);
            r0.setPositiveButton(r1, r3);
        L_0x0093:
            r0 = r0.create();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowDivider.EncryptionChangeDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }
    }

    public class IdentityChangeDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[2];
            String str = "r\u001c#";
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
                            i3 = 117;
                            break;
                        case at.i /*2*/:
                            i3 = 71;
                            break;
                        case at.o /*3*/:
                            i3 = 32;
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
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "r\u001c#";
                        obj = null;
                }
            }
        }

        public static IdentityChangeDialogFragment a(@NonNull String str) {
            IdentityChangeDialogFragment identityChangeDialogFragment = new IdentityChangeDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[0], str);
            identityChangeDialogFragment.setArguments(bundle);
            return identityChangeDialogFragment;
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            Object string = getArguments().getString(z[1]);
            l5 b = App.as.b((String) auv.a(string));
            return new Builder(getContext()).setMessage(a28.b(getString(2131231354, new Object[]{b.k()}), getContext())).setPositiveButton(2131231356, new fx(this, string)).setNegativeButton(2131231580, null).setNeutralButton(2131231355, new a_x(this)).create();
        }
    }

    static {
        String[] strArr = new String[5];
        String str = "\u001932";
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
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = 64;
                        break;
                    case at.i /*2*/:
                        i3 = 15;
                        break;
                    case at.o /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "y3!R-X4|D5Ina@1";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0019*fAx";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0019`";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    S = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "])yL!\\2PW*No}Wx";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(com.whatsapp.protocol.co r13) {
        /*
        r4 = com.whatsapp.DialogToastActivity.f;
        r1 = 0;
        r0 = 0;
        r2 = r13.t;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x0671;
    L_0x000c:
        r0 = com.whatsapp.App.as;
        r1 = r13.t;
        r0 = r0.b(r1);
        r1 = r0.k();
        r2 = r0;
        r0 = r1;
    L_0x001a:
        r1 = "";
        r6 = r13.z;
        r3 = (int) r6;
        switch(r3) {
            case 1: goto L_0x0025;
            case 2: goto L_0x0023;
            case 3: goto L_0x0023;
            case 4: goto L_0x0235;
            case 5: goto L_0x0280;
            case 6: goto L_0x01d2;
            case 7: goto L_0x02ac;
            case 8: goto L_0x0668;
            case 9: goto L_0x066b;
            case 10: goto L_0x066e;
            case 11: goto L_0x0185;
            case 12: goto L_0x02f7;
            case 13: goto L_0x0653;
            case 14: goto L_0x0656;
            case 15: goto L_0x0659;
            case 16: goto L_0x065c;
            case 17: goto L_0x065f;
            case 18: goto L_0x0662;
            case 19: goto L_0x0665;
            default: goto L_0x0023;
        };
    L_0x0023:
        r0 = r1;
    L_0x0024:
        return r0;
    L_0x0025:
        r1 = 0;
        r3 = r13.c();
        if (r3 == 0) goto L_0x0037;
    L_0x002c:
        r1 = r13.c();
        r3 = "\n";
        r1 = r1.split(r3);
    L_0x0037:
        if (r1 == 0) goto L_0x00ed;
    L_0x0039:
        r3 = r1.length;
        r5 = 2;
        if (r3 != r5) goto L_0x00ed;
    L_0x003d:
        r3 = r13.t;
        if (r3 == 0) goto L_0x0065;
    L_0x0041:
        r3 = 0;
        r3 = r1[r3];
        r5 = S;
        r6 = 2;
        r5 = r5[r6];
        r3 = r3.endsWith(r5);
        if (r3 == 0) goto L_0x00ed;
    L_0x004f:
        r3 = 1;
        r3 = r1[r3];
        r5 = "\"";
        r3 = r3.lastIndexOf(r5);
        r5 = 1;
        r5 = r1[r5];
        r6 = "\"";
        r5 = r5.indexOf(r6);
        if (r3 <= r5) goto L_0x00ed;
    L_0x0065:
        r0 = com.whatsapp.App.as;
        r3 = 0;
        r3 = r1[r3];
        r0 = r0.b(r3);
        r0 = r0.k();
        r3 = 1;
        r3 = r1[r3];
        r5 = "\"";
        r3 = r3.indexOf(r5);
        r5 = 1;
        r5 = r1[r5];
        r6 = "\"";
        r5 = r5.lastIndexOf(r6);
        if (r5 > r3) goto L_0x00c3;
    L_0x0088:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = S;
        r8 = 1;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r7 = r13.t;
        r6 = r6.append(r7);
        r7 = S;
        r8 = 3;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r7 = 0;
        r7 = r1[r7];
        r6 = r6.append(r7);
        r7 = S;
        r8 = 0;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r7 = 1;
        r7 = r1[r7];
        r6 = r6.append(r7);
        r6 = r6.toString();
        com.whatsapp.util.Log.e(r6);
    L_0x00c3:
        r6 = com.whatsapp.App.z();
        r7 = 0;
        r7 = r1[r7];
        r8 = 2131231343; // 0x7f08026f float:1.8078764E38 double:1.05296819E-314;
        r9 = 2;
        r9 = new java.lang.Object[r9];
        r10 = 0;
        r9[r10] = r0;
        r10 = 1;
        r11 = android.support.v4.text.BidiFormatter.getInstance();
        r12 = 1;
        r1 = r1[r12];
        r3 = r3 + 1;
        r1 = r1.substring(r3, r5);
        r1 = r11.unicodeWrap(r1);
        r9[r10] = r1;
        r1 = com.whatsapp.util.a6.a(r6, r7, r8, r9);
        if (r4 == 0) goto L_0x0023;
    L_0x00ed:
        r1 = com.whatsapp.App.as;
        r3 = r13.t;
        r1 = r1.d(r3);
        if (r1 != 0) goto L_0x011b;
    L_0x00f7:
        r1 = com.whatsapp.App.z();
        r3 = r13.t;
        r5 = 2131231343; // 0x7f08026f float:1.8078764E38 double:1.05296819E-314;
        r6 = 2;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r0;
        r7 = 1;
        r8 = android.support.v4.text.BidiFormatter.getInstance();
        r9 = r13.c();
        r8 = r8.unicodeWrap(r9);
        r6[r7] = r8;
        r1 = com.whatsapp.util.a6.a(r1, r3, r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x011b:
        r1 = r13.c();
        r3 = "\"";
        r1 = r1.indexOf(r3);
        r3 = r13.c();
        r5 = "\"";
        r3 = r3.lastIndexOf(r5);
        if (r1 != 0) goto L_0x0166;
    L_0x0133:
        r5 = r13.c();
        r5 = r5.length();
        r5 = r5 + -1;
        if (r3 != r5) goto L_0x0166;
    L_0x013f:
        if (r1 == r3) goto L_0x0166;
    L_0x0141:
        r5 = r13.c();
        r1 = r1 + 1;
        r1 = r5.substring(r1, r3);
        r3 = com.whatsapp.App.z();
        r5 = 2131231344; // 0x7f080270 float:1.8078766E38 double:1.0529681904E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r8 = android.support.v4.text.BidiFormatter.getInstance();
        r1 = r8.unicodeWrap(r1);
        r6[r7] = r1;
        r1 = r3.getString(r5, r6);
        if (r4 == 0) goto L_0x0183;
    L_0x0166:
        r1 = com.whatsapp.App.z();
        r3 = 2131231344; // 0x7f080270 float:1.8078766E38 double:1.0529681904E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = android.support.v4.text.BidiFormatter.getInstance();
        r8 = r13.c();
        r7 = r7.unicodeWrap(r8);
        r5[r6] = r7;
        r1 = r1.getString(r3, r5);
    L_0x0183:
        if (r4 == 0) goto L_0x0023;
    L_0x0185:
        r1 = com.whatsapp.App.as;
        r3 = r13.t;
        r1 = r1.d(r3);
        if (r1 != 0) goto L_0x01b3;
    L_0x018f:
        r1 = com.whatsapp.App.z();
        r3 = r13.t;
        r5 = 2131231279; // 0x7f08022f float:1.8078635E38 double:1.0529681583E-314;
        r6 = 2;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r0;
        r7 = 1;
        r8 = android.support.v4.text.BidiFormatter.getInstance();
        r9 = r13.c();
        r8 = r8.unicodeWrap(r9);
        r6[r7] = r8;
        r1 = com.whatsapp.util.a6.a(r1, r3, r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x01b3:
        r1 = com.whatsapp.App.z();
        r3 = 2131231280; // 0x7f080230 float:1.8078637E38 double:1.052968159E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = android.support.v4.text.BidiFormatter.getInstance();
        r8 = r13.c();
        r7 = r7.unicodeWrap(r8);
        r5[r6] = r7;
        r1 = r1.getString(r3, r5);
        if (r4 == 0) goto L_0x0023;
    L_0x01d2:
        r1 = r13.t;
        if (r1 == 0) goto L_0x0230;
    L_0x01d6:
        r1 = com.whatsapp.App.as;
        r3 = r13.t;
        r1 = r1.d(r3);
        if (r1 == 0) goto L_0x0200;
    L_0x01e0:
        r1 = r13.c();
        if (r1 != 0) goto L_0x01f3;
    L_0x01e6:
        r1 = com.whatsapp.App.z();
        r3 = 2131231688; // 0x7f0803c8 float:1.8079464E38 double:1.0529683604E-314;
        r1 = r1.getString(r3);
        if (r4 == 0) goto L_0x0023;
    L_0x01f3:
        r1 = com.whatsapp.App.z();
        r3 = 2131231682; // 0x7f0803c2 float:1.8079452E38 double:1.0529683574E-314;
        r1 = r1.getString(r3);
        if (r4 == 0) goto L_0x0023;
    L_0x0200:
        r1 = r13.c();
        if (r1 != 0) goto L_0x021b;
    L_0x0206:
        r1 = com.whatsapp.App.z();
        r3 = r13.t;
        r5 = 2131231687; // 0x7f0803c7 float:1.8079462E38 double:1.05296836E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r0;
        r1 = com.whatsapp.util.a6.a(r1, r3, r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x021b:
        r1 = com.whatsapp.App.z();
        r3 = r13.t;
        r5 = 2131231681; // 0x7f0803c1 float:1.807945E38 double:1.052968357E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r0;
        r1 = com.whatsapp.util.a6.a(r1, r3, r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x0230:
        r1 = "";
        if (r4 == 0) goto L_0x0023;
    L_0x0235:
        r1 = r13.k;
        r1 = r1.c;
        r1 = com.whatsapp.l5.g(r1);
        if (r1 == 0) goto L_0x0254;
    L_0x023f:
        r1 = com.whatsapp.App.z();
        r3 = r13.t;
        r5 = 2131231395; // 0x7f0802a3 float:1.807887E38 double:1.0529682156E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r0;
        r1 = com.whatsapp.util.a6.a(r1, r3, r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x0254:
        r1 = com.whatsapp.App.as;
        r3 = r13.t;
        r1 = r1.d(r3);
        if (r1 == 0) goto L_0x026b;
    L_0x025e:
        r1 = com.whatsapp.App.z();
        r3 = 2131231327; // 0x7f08025f float:1.8078732E38 double:1.052968182E-314;
        r1 = r1.getString(r3);
        if (r4 == 0) goto L_0x0023;
    L_0x026b:
        r1 = com.whatsapp.App.z();
        r3 = r13.t;
        r5 = 2131231326; // 0x7f08025e float:1.807873E38 double:1.0529681815E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r0;
        r1 = com.whatsapp.util.a6.a(r1, r3, r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x0280:
        r1 = com.whatsapp.App.as;
        r3 = r13.t;
        r1 = r1.d(r3);
        if (r1 == 0) goto L_0x0297;
    L_0x028a:
        r1 = com.whatsapp.App.z();
        r3 = 2131231332; // 0x7f080264 float:1.8078742E38 double:1.0529681845E-314;
        r1 = r1.getString(r3);
        if (r4 == 0) goto L_0x0023;
    L_0x0297:
        r1 = com.whatsapp.App.z();
        r3 = r13.t;
        r5 = 2131231331; // 0x7f080263 float:1.807874E38 double:1.052968184E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r0;
        r1 = com.whatsapp.util.a6.a(r1, r3, r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x02ac:
        r1 = r13.k;
        r1 = r1.c;
        r1 = com.whatsapp.l5.g(r1);
        if (r1 == 0) goto L_0x02cb;
    L_0x02b6:
        r1 = com.whatsapp.App.z();
        r3 = r13.t;
        r5 = 2131231396; // 0x7f0802a4 float:1.8078872E38 double:1.052968216E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r0;
        r1 = com.whatsapp.util.a6.a(r1, r3, r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x02cb:
        r1 = com.whatsapp.App.as;
        r3 = r13.t;
        r1 = r1.d(r3);
        if (r1 == 0) goto L_0x02e2;
    L_0x02d5:
        r1 = com.whatsapp.App.z();
        r3 = 2131231335; // 0x7f080267 float:1.8078748E38 double:1.052968186E-314;
        r1 = r1.getString(r3);
        if (r4 == 0) goto L_0x0023;
    L_0x02e2:
        r1 = com.whatsapp.App.z();
        r3 = r13.t;
        r5 = 2131231334; // 0x7f080266 float:1.8078746E38 double:1.0529681855E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r0;
        r1 = com.whatsapp.util.a6.a(r1, r3, r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x02f7:
        r3 = r0;
        r0 = r13.Q;
        r0 = (java.util.Vector) r0;
        r1 = com.whatsapp.App.as;
        r5 = r13.t;
        r1 = r1.d(r5);
        if (r1 == 0) goto L_0x031d;
    L_0x0306:
        r1 = com.whatsapp.App.z();
        r5 = 2131231340; // 0x7f08026c float:1.8078758E38 double:1.0529681884E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r8 = com.whatsapp.qm.a(r0);
        r6[r7] = r8;
        r1 = r1.getString(r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x031d:
        if (r3 != 0) goto L_0x0359;
    L_0x031f:
        r1 = r0.size();
        r5 = 1;
        if (r1 != r5) goto L_0x0342;
    L_0x0326:
        r5 = com.whatsapp.App.as;
        r1 = 0;
        r1 = r0.get(r1);
        r1 = (java.lang.String) r1;
        r1 = r5.d(r1);
        if (r1 == 0) goto L_0x0342;
    L_0x0335:
        r1 = com.whatsapp.App.z();
        r5 = 2131231327; // 0x7f08025f float:1.8078732E38 double:1.052968182E-314;
        r1 = r1.getString(r5);
        if (r4 == 0) goto L_0x0023;
    L_0x0342:
        r1 = com.whatsapp.App.z();
        r5 = 2131231326; // 0x7f08025e float:1.807873E38 double:1.0529681815E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r8 = com.whatsapp.qm.a(r0);
        r6[r7] = r8;
        r1 = r1.getString(r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x0359:
        r1 = r0.size();
        r5 = 1;
        if (r1 != r5) goto L_0x0384;
    L_0x0360:
        r5 = com.whatsapp.App.as;
        r1 = 0;
        r1 = r0.get(r1);
        r1 = (java.lang.String) r1;
        r1 = r5.d(r1);
        if (r1 == 0) goto L_0x0384;
    L_0x036f:
        r1 = com.whatsapp.App.z();
        r5 = r13.t;
        r6 = 2131231337; // 0x7f080269 float:1.8078752E38 double:1.052968187E-314;
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r7[r8] = r3;
        r1 = com.whatsapp.util.a6.a(r1, r5, r6, r7);
        if (r4 == 0) goto L_0x0023;
    L_0x0384:
        r1 = com.whatsapp.App.z();
        r5 = r13.t;
        r6 = 2131231336; // 0x7f080268 float:1.807875E38 double:1.0529681865E-314;
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r7[r8] = r3;
        r8 = 1;
        r0 = com.whatsapp.qm.a(r0);
        r7[r8] = r0;
        r0 = com.whatsapp.util.a6.a(r1, r5, r6, r7);
        if (r4 == 0) goto L_0x0024;
    L_0x03a0:
        r0 = r13.Q;
        r0 = (java.util.Vector) r0;
        r1 = com.whatsapp.App.z();
        r5 = 2131231331; // 0x7f080263 float:1.807874E38 double:1.052968184E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r0 = com.whatsapp.qm.a(r0);
        r6[r7] = r0;
        r0 = r1.getString(r5, r6);
        if (r4 == 0) goto L_0x0024;
    L_0x03bb:
        r0 = r13.Q;
        r0 = (java.util.Vector) r0;
        r1 = com.whatsapp.App.as;
        r5 = r13.t;
        r1 = r1.d(r5);
        if (r1 == 0) goto L_0x03e0;
    L_0x03c9:
        r1 = com.whatsapp.App.z();
        r5 = 2131231341; // 0x7f08026d float:1.807876E38 double:1.052968189E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r8 = com.whatsapp.qm.a(r0);
        r6[r7] = r8;
        r1 = r1.getString(r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x03e0:
        if (r3 != 0) goto L_0x041c;
    L_0x03e2:
        r1 = r0.size();
        r5 = 1;
        if (r1 != r5) goto L_0x0405;
    L_0x03e9:
        r5 = com.whatsapp.App.as;
        r1 = 0;
        r1 = r0.get(r1);
        r1 = (java.lang.String) r1;
        r1 = r5.d(r1);
        if (r1 == 0) goto L_0x0405;
    L_0x03f8:
        r1 = com.whatsapp.App.z();
        r5 = 2131231335; // 0x7f080267 float:1.8078748E38 double:1.052968186E-314;
        r1 = r1.getString(r5);
        if (r4 == 0) goto L_0x0023;
    L_0x0405:
        r1 = com.whatsapp.App.z();
        r5 = 2131231334; // 0x7f080266 float:1.8078746E38 double:1.0529681855E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r8 = com.whatsapp.qm.a(r0);
        r6[r7] = r8;
        r1 = r1.getString(r5, r6);
        if (r4 == 0) goto L_0x0023;
    L_0x041c:
        r1 = r0.size();
        r5 = 1;
        if (r1 != r5) goto L_0x0447;
    L_0x0423:
        r5 = com.whatsapp.App.as;
        r1 = 0;
        r1 = r0.get(r1);
        r1 = (java.lang.String) r1;
        r1 = r5.d(r1);
        if (r1 == 0) goto L_0x0447;
    L_0x0432:
        r1 = com.whatsapp.App.z();
        r5 = r13.t;
        r6 = 2131231339; // 0x7f08026b float:1.8078756E38 double:1.052968188E-314;
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r7[r8] = r3;
        r1 = com.whatsapp.util.a6.a(r1, r5, r6, r7);
        if (r4 == 0) goto L_0x0023;
    L_0x0447:
        r1 = com.whatsapp.App.z();
        r5 = r13.t;
        r6 = 2131231338; // 0x7f08026a float:1.8078754E38 double:1.0529681874E-314;
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r7[r8] = r3;
        r8 = 1;
        r0 = com.whatsapp.qm.a(r0);
        r7[r8] = r0;
        r0 = com.whatsapp.util.a6.a(r1, r5, r6, r7);
        if (r4 == 0) goto L_0x0024;
    L_0x0463:
        r0 = r13.Q;
        r0 = (java.util.Vector) r0;
        r1 = r0.size();
        r5 = 1;
        if (r1 != r5) goto L_0x048a;
    L_0x046e:
        r5 = com.whatsapp.App.as;
        r1 = 0;
        r1 = r0.get(r1);
        r1 = (java.lang.String) r1;
        r1 = r5.d(r1);
        if (r1 == 0) goto L_0x048a;
    L_0x047d:
        r1 = com.whatsapp.App.z();
        r5 = 2131231333; // 0x7f080265 float:1.8078744E38 double:1.052968185E-314;
        r1 = r1.getString(r5);
        if (r4 == 0) goto L_0x0023;
    L_0x048a:
        r1 = com.whatsapp.App.az;
        r5 = 2131296280; // 0x7f090018 float:1.8210472E38 double:1.053000273E-314;
        r6 = r0.size();
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r0 = com.whatsapp.qm.a(r0);
        r7[r8] = r0;
        r0 = r1.a(r5, r6, r7);
        if (r4 == 0) goto L_0x0024;
    L_0x04a3:
        r0 = r13.Q;
        r0 = (java.util.Vector) r0;
        r1 = r0.size();
        r5 = 1;
        if (r1 != r5) goto L_0x04ca;
    L_0x04ae:
        r5 = com.whatsapp.App.as;
        r1 = 0;
        r1 = r0.get(r1);
        r1 = (java.lang.String) r1;
        r1 = r5.d(r1);
        if (r1 == 0) goto L_0x04ca;
    L_0x04bd:
        r1 = com.whatsapp.App.z();
        r5 = 2131231330; // 0x7f080262 float:1.8078738E38 double:1.0529681835E-314;
        r1 = r1.getString(r5);
        if (r4 == 0) goto L_0x0023;
    L_0x04ca:
        r1 = com.whatsapp.App.az;
        r5 = 2131296279; // 0x7f090017 float:1.821047E38 double:1.0530002726E-314;
        r6 = r0.size();
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r0 = com.whatsapp.qm.a(r0);
        r7[r8] = r0;
        r0 = r1.a(r5, r6, r7);
        if (r4 == 0) goto L_0x0024;
    L_0x04e3:
        r0 = com.whatsapp.App.as;
        r1 = r13.t;
        r0 = r0.d(r1);
        if (r0 == 0) goto L_0x04fa;
    L_0x04ed:
        r0 = com.whatsapp.App.z();
        r1 = 2131231291; // 0x7f08023b float:1.8078659E38 double:1.052968164E-314;
        r0 = r0.getString(r1);
        if (r4 == 0) goto L_0x0024;
    L_0x04fa:
        r0 = com.whatsapp.App.z();
        r1 = r13.t;
        r5 = 2131231290; // 0x7f08023a float:1.8078657E38 double:1.0529681637E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r3;
        r0 = com.whatsapp.util.a6.a(r0, r1, r5, r6);
        if (r4 == 0) goto L_0x0024;
    L_0x050f:
        r0 = r13.t;
        if (r0 != 0) goto L_0x0538;
    L_0x0513:
        r0 = com.whatsapp.App.z();
        r1 = r13.k;
        r1 = r1.c;
        r5 = 2131231357; // 0x7f08027d float:1.8078793E38 double:1.052968197E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r8 = com.whatsapp.App.as;
        r9 = r13.k;
        r9 = r9.c;
        r8 = r8.b(r9);
        r8 = r8.k();
        r6[r7] = r8;
        r0 = com.whatsapp.util.a6.a(r0, r1, r5, r6);
        if (r4 == 0) goto L_0x0024;
    L_0x0538:
        r0 = com.whatsapp.App.z();
        r1 = r13.t;
        r5 = 2131231357; // 0x7f08027d float:1.8078793E38 double:1.052968197E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r3;
        r0 = com.whatsapp.util.a6.a(r0, r1, r5, r6);
        if (r4 == 0) goto L_0x0024;
    L_0x054d:
        r0 = r13.k;
        r0 = r0.c;
        r0 = com.whatsapp.l5.g(r0);
        if (r0 == 0) goto L_0x0564;
    L_0x0557:
        r0 = com.whatsapp.App.z();
        r1 = 2131230845; // 0x7f08007d float:1.8077754E38 double:1.052967944E-314;
        r0 = r0.getString(r1);
        if (r4 == 0) goto L_0x0024;
    L_0x0564:
        r0 = r13.k;
        r0 = r0.c;
        r0 = com.whatsapp.qm.i(r0);
        if (r0 == 0) goto L_0x057b;
    L_0x056e:
        r0 = com.whatsapp.App.z();
        r1 = 2131231287; // 0x7f080237 float:1.807865E38 double:1.0529681622E-314;
        r0 = r0.getString(r1);
        if (r4 == 0) goto L_0x0024;
    L_0x057b:
        r0 = com.whatsapp.App.z();
        r1 = 2131230907; // 0x7f0800bb float:1.807788E38 double:1.0529679745E-314;
        r0 = r0.getString(r1);
        if (r4 == 0) goto L_0x0024;
    L_0x0588:
        r0 = com.whatsapp.App.z();
        r1 = 2131230892; // 0x7f0800ac float:1.807785E38 double:1.052967967E-314;
        r0 = r0.getString(r1);
        if (r4 == 0) goto L_0x0024;
    L_0x0595:
        r0 = r13.Q;
        r0 = (java.util.Vector) r0;
        r1 = r13.c();
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 == 0) goto L_0x05c0;
    L_0x05a3:
        r1 = com.whatsapp.App.az;
        r5 = 2131296324; // 0x7f090044 float:1.8210561E38 double:1.053000295E-314;
        r6 = r0.size();
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = r0.size();
        r9 = java.lang.Integer.valueOf(r9);
        r7[r8] = r9;
        r1 = r1.a(r5, r6, r7);
        if (r4 == 0) goto L_0x0023;
    L_0x05c0:
        r1 = com.whatsapp.App.az;
        r5 = 2131296323; // 0x7f090043 float:1.821056E38 double:1.0530002943E-314;
        r6 = r0.size();
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = r13.c();
        r7[r8] = r9;
        r8 = 1;
        r0 = r0.size();
        r0 = java.lang.Integer.valueOf(r0);
        r7[r8] = r0;
        r0 = r1.a(r5, r6, r7);
        if (r4 == 0) goto L_0x0024;
    L_0x05e4:
        r0 = r13.Q;
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x0651;
    L_0x05ea:
        r1 = 1;
    L_0x05eb:
        com.whatsapp.util.Log.b(r1);
        r1 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r5 = java.lang.Character.toString(r1);
        r1 = r2.n();
        if (r1 == 0) goto L_0x0622;
    L_0x05fa:
        r1 = com.whatsapp.App.z();
        r6 = 2131231329; // 0x7f080261 float:1.8078736E38 double:1.052968183E-314;
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = " ";
        r9 = r3.replace(r9, r5);
        r7[r8] = r9;
        r8 = 1;
        r9 = com.whatsapp.l5.h(r0);
        r10 = " ";
        r9 = r9.replace(r10, r5);
        r7[r8] = r9;
        r1 = r1.getString(r6, r7);
        if (r4 == 0) goto L_0x0023;
    L_0x0622:
        r1 = com.whatsapp.App.z();
        r4 = 2131231328; // 0x7f080260 float:1.8078734E38 double:1.0529681825E-314;
        r6 = 3;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r3;
        r3 = 1;
        r2 = r2.s();
        r7 = " ";
        r2 = r2.replace(r7, r5);
        r6[r3] = r2;
        r2 = 2;
        r0 = com.whatsapp.l5.h(r0);
        r3 = " ";
        r0 = r0.replace(r3, r5);
        r6[r2] = r0;
        r0 = r1.getString(r4, r6);
        goto L_0x0024;
    L_0x0651:
        r1 = 0;
        goto L_0x05eb;
    L_0x0653:
        r3 = r0;
        goto L_0x03a0;
    L_0x0656:
        r3 = r0;
        goto L_0x03bb;
    L_0x0659:
        r3 = r0;
        goto L_0x0463;
    L_0x065c:
        r3 = r0;
        goto L_0x04a3;
    L_0x065f:
        r3 = r0;
        goto L_0x04e3;
    L_0x0662:
        r3 = r0;
        goto L_0x050f;
    L_0x0665:
        r3 = r0;
        goto L_0x054d;
    L_0x0668:
        r3 = r0;
        goto L_0x0588;
    L_0x066b:
        r3 = r0;
        goto L_0x0595;
    L_0x066e:
        r3 = r0;
        goto L_0x05e4;
    L_0x0671:
        r2 = r0;
        r0 = r1;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowDivider.b(com.whatsapp.protocol.co):java.lang.String");
    }

    ConversationRowDivider(Context context, co coVar) {
        super(context, coVar);
        this.Q = new lo(this);
        setClickable(false);
        setLongClickable(false);
        this.R = (DividerView) findViewById(R.id.info);
        a(coVar);
    }

    public void i() {
        a(this.e);
        super.i();
    }

    protected int g() {
        return 2130903124;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r14) {
        /*
        r13 = this;
        r12 = 6;
        r9 = 1;
        r3 = -1;
        r10 = 19;
        r8 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r13.e = r14;
        r13.setClickable(r8);
        r0 = r13.R;
        r1 = r13.getResources();
        r1 = com.whatsapp.ConversationRow.b(r1);
        r0.setTextSize(r1);
        r0 = r14.d;
        if (r0 != r3) goto L_0x0033;
    L_0x001e:
        r0 = r14.c;
        if (r0 != r3) goto L_0x0033;
    L_0x0022:
        r0 = r13.R;
        r1 = com.whatsapp.App.z();
        r2 = 2131231142; // 0x7f0801a6 float:1.8078357E38 double:1.0529680906E-314;
        r1 = r1.getString(r2);
        r0.setText(r1);
    L_0x0032:
        return;
    L_0x0033:
        r0 = r14.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0055;
    L_0x0039:
        r0 = r14.d;
        if (r0 != r12) goto L_0x0055;
    L_0x003d:
        r0 = r14.z;
        r4 = 18;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x004b;
    L_0x0045:
        r0 = r14.z;
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 != 0) goto L_0x0055;
    L_0x004b:
        r0 = r13.R;
        r1 = 2130839750; // 0x7f0208c6 float:1.728452E38 double:1.0527747173E-314;
        r0.setBackgroundResource(r1);
        if (r2 == 0) goto L_0x005d;
    L_0x0055:
        r0 = r13.R;
        r1 = 2130837749; // 0x7f0200f5 float:1.728046E38 double:1.0527737286E-314;
        r0.setBackgroundResource(r1);
    L_0x005d:
        r0 = b(r14);
        r1 = r13.getContext();
        r3 = r13.R;
        r3 = r3.getPaint();
        r4 = 1067869798; // 0x3fa66666 float:1.3 double:5.275977814E-315;
        r1 = com.whatsapp.a28.b(r0, r1, r3, r4);
        r4 = r14.z;
        r6 = 1;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 == 0) goto L_0x0082;
    L_0x007a:
        r4 = r14.z;
        r6 = 11;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0086;
    L_0x0082:
        r1 = r13.a(r0, r1);
    L_0x0086:
        if (r1 != 0) goto L_0x0114;
    L_0x0088:
        r1 = r14.k;
        r1 = r1.a;
        if (r1 == 0) goto L_0x00c3;
    L_0x008e:
        r1 = r14.d;
        if (r1 != r12) goto L_0x00c3;
    L_0x0092:
        r4 = r14.z;
        r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r1 != 0) goto L_0x00c3;
    L_0x0098:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = S;
        r4 = 4;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        r1 = r13.getContext();
        r3 = 2130839549; // 0x7f0207fd float:1.7284112E38 double:1.052774618E-314;
        r1 = android.support.v4.content.ContextCompat.getDrawable(r1, r3);
        r3 = r13.R;
        r3 = r3.getPaint();
        r0 = com.whatsapp.util.ah.a(r0, r1, r3, r8, r9);
    L_0x00c3:
        r1 = r13.R;
        r1.setText(r0);
        r0 = com.whatsapp.App.as;
        r1 = r14.t;
        r0 = r0.d(r1);
        if (r0 != 0) goto L_0x00ec;
    L_0x00d2:
        r0 = r14.k;
        r0 = r0.c;
        r0 = com.whatsapp.qm.i(r0);
        if (r0 == 0) goto L_0x00ec;
    L_0x00dc:
        r0 = r14.z;
        r4 = 15;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x00ec;
    L_0x00e4:
        r0 = r14.z;
        r4 = 16;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x00fa;
    L_0x00ec:
        r0 = r14.z;
        r4 = 18;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x00fa;
    L_0x00f4:
        r0 = r14.z;
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 != 0) goto L_0x0106;
    L_0x00fa:
        r13.setClickable(r9);
        r0 = r13.R;
        r1 = r13.Q;
        r0.setOnClickListener(r1);
        if (r2 == 0) goto L_0x010f;
    L_0x0106:
        r13.setClickable(r8);
        r0 = r13.R;
        r1 = 0;
        r0.setOnClickListener(r1);
    L_0x010f:
        r13.setTag(r14);
        goto L_0x0032;
    L_0x0114:
        r0 = r1;
        goto L_0x0088;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowDivider.a(com.whatsapp.protocol.co):void");
    }

    protected int h() {
        return 2130903124;
    }

    public void a(co coVar, boolean z) {
        if (this.e != coVar || z) {
            a(coVar);
        }
        super.a(coVar, z);
    }
}
