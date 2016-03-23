package com.whatsapp.gallerypicker;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class ap implements OnClickListener {
    private static final String[] z;
    final ImagePreview a;

    static {
        String[] strArr = new String[5];
        String str = "\u000ffbT)\u0014fxF";
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
                        i3 = 125;
                        break;
                    case at.g /*1*/:
                        i3 = 9;
                        break;
                    case at.i /*2*/:
                        i3 = 22;
                        break;
                    case at.o /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 93;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001e{yE(\u000f`e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001ehfA4\u0012ge";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u001cgrG2\u0014m8\\3\tlxAs\u0018qbG<SZBg\u0018<D";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001e{yE/\u0018jbF";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ap(ImagePreview imagePreview) {
        this.a = imagePreview;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra(z[4], ImagePreview.c(this.a));
        intent.putExtra(z[0], ImagePreview.i(this.a));
        intent.putExtra(z[2], ImagePreview.b(this.a));
        intent.putExtra(z[1], ImagePreview.v(this.a));
        intent.putExtra(z[3], ImagePreview.g(this.a));
        this.a.setResult(1, intent);
        this.a.finish();
    }
}
