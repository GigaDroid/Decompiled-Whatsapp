package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import org.v;
import org.whispersystems.at;

class ao5 implements OnItemClickListener {
    private static final String[] z;
    final CountryPicker a;

    static {
        String[] strArr = new String[3];
        String str = "\u0018|";
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
                        i3 = 123;
                        break;
                    case at.g /*1*/:
                        i3 = 31;
                        break;
                    case at.i /*2*/:
                        i3 = 85;
                        break;
                    case at.o /*3*/:
                        i3 = 64;
                        break;
                    default:
                        i3 = 85;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0018p .!\tf\n.4\u0016z";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0012l:";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ao5(CountryPicker countryPicker) {
        this.a = countryPicker;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        try {
            cj cjVar = (cj) adapterView.getItemAtPosition(i);
            Intent intent = new Intent();
            intent.putExtra(z[2], cjVar.b);
            intent.putExtra(z[0], cjVar.d);
            intent.putExtra(z[1], cjVar.a);
            this.a.setResult(-1, intent);
            this.a.finish();
        } catch (IndexOutOfBoundsException e) {
        }
    }
}
