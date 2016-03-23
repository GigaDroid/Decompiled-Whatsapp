package com.whatsapp;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.Button;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

public class About extends DialogToastActivity {
    private static final String z;

    static {
        char[] toCharArray = "\u0003c\r0$\u0004x\f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 77;
                    break;
                case at.i /*2*/:
                    i2 = 60;
                    break;
                case at.o /*3*/:
                    i2 = 2;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130903065);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this, 2131623942));
        }
        ((TextView) findViewById(2131755168)).setText(getString(2131232218) + " " + z);
        Button button = (Button) findViewById(2131755171);
        CharSequence spannableString = new SpannableString(getText(2131232233));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        button.setText(spannableString);
        button.setOnClickListener(new ya(this));
    }
}
