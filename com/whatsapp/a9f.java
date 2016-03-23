package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.whatsapp.fieldstats.aj;
import com.whatsapp.fieldstats.i;
import org.v;
import org.whispersystems.at;

class a9f implements OnClickListener {
    private static final String[] z;
    final CheckBox a;
    final String b;
    final int[] c;
    final int[] d;
    final MuteDialogFragment e;

    static {
        String[] strArr = new String[2];
        String str = "Oe/L3Dk6\u0011%\\z\u001d\u00126Il'\u0010!Bi'\u0011";
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
                        i3 = 44;
                        break;
                    case at.g /*1*/:
                        i3 = 10;
                        break;
                    case at.i /*2*/:
                        i3 = 66;
                        break;
                    case at.o /*3*/:
                        i3 = 98;
                        break;
                    default:
                        i3 = 68;
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
                    str = "@k1\u0016\u001bA\u007f6\u0007\u001b_o.\u0007'Xc-\f";
                    obj = null;
            }
        }
    }

    a9f(MuteDialogFragment muteDialogFragment, int[] iArr, int[] iArr2, String str, CheckBox checkBox) {
        this.e = muteDialogFragment;
        this.c = iArr;
        this.d = iArr2;
        this.b = str;
        this.a = checkBox;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        App.z().getSharedPreferences(z[0], 0).edit().putInt(z[1], this.c[0]).commit();
        long j = (((long) this.d[this.c[0]]) * 60) * 1000;
        if (qm.i(this.b) && qm.h(this.b)) {
            av ajVar = new aj();
            ajVar.a = Double.valueOf((double) j);
            ajVar.b = Double.valueOf((double) qm.c(this.b).b());
            i.a(this.e.getActivity(), ajVar);
        }
        a3b.a(this.e.getActivity()).a(this.b, j + System.currentTimeMillis(), this.a.isChecked());
    }
}
