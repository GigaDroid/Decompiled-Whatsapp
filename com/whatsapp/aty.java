package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class aty implements OnClickListener {
    private static final String z;
    final MultipleContactPicker a;

    static {
        char[] toCharArray = "/\u0007R\u001e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 69;
                    break;
                case at.g /*1*/:
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = 54;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                default:
                    i2 = 73;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        boolean z = DialogToastActivity.f;
        if (!MultipleContactPicker.d(this.a).isEmpty() || MultipleContactPicker.f(this.a)) {
            Intent intent = new Intent();
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : MultipleContactPicker.d(this.a)) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(str);
                if (z) {
                    break;
                }
            }
            intent.putExtra(z, stringBuilder.toString());
            this.a.setResult(-1, intent);
            this.a.finish();
            if (!z) {
                return;
            }
        }
        App.b(this.a.getBaseContext(), String.format(App.az.a(2131296293, 1), new Object[]{Integer.valueOf(1)}), 0);
    }

    aty(MultipleContactPicker multipleContactPicker) {
        this.a = multipleContactPicker;
    }
}
