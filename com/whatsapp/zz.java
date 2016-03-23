package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

public class zz extends ap {
    private static final String z;
    private String b;
    private Context c;

    static {
        char[] toCharArray = "\u0011>N".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 123;
                    break;
                case at.g /*1*/:
                    i2 = 87;
                    break;
                case at.i /*2*/:
                    i2 = 42;
                    break;
                case at.o /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public zz(String str, Context context) {
        this.b = str;
        this.c = context;
    }

    public void a(View view) {
        Intent intent = new Intent(this.c, QuickContactActivity.class);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.left = (int) ((((float) iArr[0]) * 1.0f) + 0.5f);
        rect.top = (int) ((((float) iArr[1]) * 1.0f) + 0.5f);
        rect.right = (int) ((((float) (iArr[0] + view.getWidth())) * 1.0f) + 0.5f);
        rect.bottom = (int) ((((float) (iArr[1] + view.getHeight())) * 1.0f) + 0.5f);
        intent.setSourceBounds(rect);
        intent.putExtra(z, this.b);
        this.c.startActivity(intent);
    }
}
