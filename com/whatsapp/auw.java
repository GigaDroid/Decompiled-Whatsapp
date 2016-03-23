package com.whatsapp;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class auw extends ClickableSpan {
    private static final String z;
    final VerifySms a;

    static {
        char[] toCharArray = "^Fdo.QP{ugMG\u007fr".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 40;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 22;
                    break;
                case at.o /*3*/:
                    i2 = 6;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    auw(VerifySms verifySms) {
        this.a = verifySms;
    }

    public void onClick(View view) {
        Log.i(z);
        VerifySms.t(this.a);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
