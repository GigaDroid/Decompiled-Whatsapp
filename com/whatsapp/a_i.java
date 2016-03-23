package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class a_i implements Runnable {
    private static final String[] z;
    final aqc a;
    final ArrayList b;

    static {
        String[] strArr = new String[8];
        String str = ">\u0002f\u000fK6\b,\u0014J+\tl\t\n:\u0014v\u000fEq?V/a\u001e!";
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
                        i3 = 95;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 2;
                        break;
                    case at.o /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 36;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "+\tz\t\u000bu";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ">\u0002f\u000fK6\b,\u0014J+\tl\t\n>\u000fv\u0014K1BQ8j\u001b3O(h\u000b%R1a";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "<\u0003oSS7\rv\u000eE/\u001c,\u001bM3\tr\u000fK)\u0005f\u0018V";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ">\u0002f\u000fK6\b,\u0014J+\tl\t\n:\u0014v\u000fEq?W?n\u001a/V";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ">\u0002f\u000fK6\b,\u0014J+\tl\t\n:\u0014v\u000fEq8G%p";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0004S8!\u000buN>CX\u0002";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "q\u0018z\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a_i(aqc com_whatsapp_aqc, ArrayList arrayList) {
        this.a = com_whatsapp_aqc;
        this.b = arrayList;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        this.a.d.e();
        if (this.b != null) {
            String str = App.z().getString(2131231091, new Object[]{this.a.a.a(this.a.c)}).replaceAll(z[7], "") + z[1];
            ArrayList arrayList = new ArrayList(this.b.size());
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                Object fromFile;
                File file = (File) it.next();
                if (VERSION.SDK_INT < 23) {
                    fromFile = Uri.fromFile(file);
                } else {
                    fromFile = FileProvider.getUriForFile(this.a.c, z[4], file);
                }
                arrayList.add(fromFile);
                if (z) {
                    break;
                }
            }
            Intent putParcelableArrayListExtra = new Intent(z[3]).setType(z[2]).putExtra(z[5], App.z().getString(2131231091, new Object[]{this.a.a.a(this.a.c)})).putExtra(z[6], App.z().getString(2131231087, new Object[]{str})).putParcelableArrayListExtra(z[0], arrayList);
            putParcelableArrayListExtra.setFlags(1);
            asx.a(putParcelableArrayListExtra, this.a.c, this.a.d, this.a.c.getString(2131231864));
            if (!z) {
                return;
            }
        }
        this.a.d.a(2131231088);
    }
}
