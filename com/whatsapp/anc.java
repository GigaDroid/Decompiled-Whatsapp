package com.whatsapp;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class anc extends ClickableSpan {
    private static final String z;
    final String a;
    final an5 b;
    final String c;

    static {
        char[] toCharArray = "}\u0014ON\u0007{\u0014Z\b\u0004g\u001eFB[|\u0004O@\u0011|\u0005MC[{\u0010XW\u0011kQ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 15;
                    break;
                case at.g /*1*/:
                    i2 = 113;
                    break;
                case at.i /*2*/:
                    i2 = 40;
                    break;
                case at.o /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    anc(an5 com_whatsapp_an5, String str, String str2) {
        this.b = com_whatsapp_an5;
        this.c = str;
        this.a = str2;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public void onClick(View view) {
        this.b.a.v.c.setText(VerifyNumber.a(this.c, this.a).substring(this.c.length() + 2));
        this.b.a.v.c.setSelection(this.b.a.v.c.getText().length());
        this.b.a.k();
        Toast.makeText(this.b.a, this.b.a.getString(2131231762), 1).show();
        Log.i(z + this.a);
        RegisterPhone.c(this.b.a, true);
    }
}
