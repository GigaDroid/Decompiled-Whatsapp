package com.whatsapp;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public final class n4 extends ClickableSpan {
    private static final String z;
    private final Intent a;

    static {
        char[] toCharArray = "&aLq5.vA5*)v]v7jqHy-heW8*)v]v7z".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 71;
                    break;
                case at.g /*1*/:
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 24;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Log.i(z + this.a);
        view.getContext().startActivity(this.a);
    }

    public n4(Intent intent) {
        this.a = intent;
    }
}
