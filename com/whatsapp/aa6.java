package com.whatsapp;

import android.content.Intent;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class aa6 implements OnClickListener {
    private static final String[] z;
    final int a;
    final DescribeProblemActivity b;

    static {
        String[] strArr = new String[4];
        String str = "T@-\u0013t\\Jg\buAK'\u00155PV=\u0013z\u001bg\u0007(O|o\u0005>R{z\f/Of";
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
                        i3 = 53;
                        break;
                    case at.g /*1*/:
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = 73;
                        break;
                    case at.o /*3*/:
                        i3 = 97;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\\C(\u0006~\u001a\u0004";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "VA$Ol]O=\u0012zE^g\buAK'\u00155TM=\bt[\u0000\u001b$Vzx\f>Hv|\f$Uff\u00065";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "T@-\u0013t\\Jg\buAK'\u00155TM=\bt[\u0000\u0019(X~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(z[1], Media.INTERNAL_CONTENT_URI);
        intent.setType(z[2]);
        intent = Intent.createChooser(intent, null);
        if (DescribeProblemActivity.b(this.b)[this.a] != null) {
            intent.putExtra(z[0], new Intent[]{new Intent(z[3], null)});
        }
        this.b.startActivityForResult(intent, this.a + 1);
    }

    aa6(DescribeProblemActivity describeProblemActivity, int i) {
        this.b = describeProblemActivity;
        this.a = i;
    }
}
