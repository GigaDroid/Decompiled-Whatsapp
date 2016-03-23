package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class asg implements OnClickListener {
    private static final String[] z;
    final a36 a;
    final fo b;

    static {
        String[] strArr = new String[4];
        String str = "\u0017\u001c\u000eQ\u0016";
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
                        i3 = 99;
                        break;
                    case at.g /*1*/:
                        i3 = 117;
                        break;
                    case at.i /*2*/:
                        i3 = 122;
                        break;
                    case at.o /*3*/:
                        i3 = 61;
                        break;
                    default:
                        i3 = 115;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0016\u0007\u0016";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0000\u001a\u0014I\u0016\r\u0001";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0002\u0007\u000eT\u0010\u000f\u0010%T\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        SearchFAQ.f(this.a.a).add(this.b.a);
        Intent intent = new Intent(this.a.a, FaqItemActivity.class);
        intent.putExtra(z[0], this.b.d);
        intent.putExtra(z[3], this.b.c);
        intent.putExtra(z[2], this.b.a);
        intent.putExtra(z[1], Integer.parseInt(this.b.a.substring(this.b.a.lastIndexOf(47) + 1)));
        this.a.a.startActivityForResult(intent, 1);
        this.a.a.overridePendingTransition(2130968593, 2130968594);
    }

    asg(a36 com_whatsapp_a36, fo foVar) {
        this.a = com_whatsapp_a36;
        this.b = foVar;
    }
}
