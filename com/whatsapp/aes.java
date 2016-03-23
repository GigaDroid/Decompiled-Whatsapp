package com.whatsapp;

import android.text.InputFilter;
import android.text.Spanned;

public final class aes implements InputFilter {
    private final int a;

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int a = a28.a((CharSequence) spanned, 0, spanned.length());
        int a2 = a28.a((CharSequence) spanned, i3, i4);
        int a3 = a28.a(charSequence, i, i2);
        a = (this.a - a) + a2;
        if (a <= 0) {
            return "";
        }
        if (a >= a3) {
            return null;
        }
        return a28.a(charSequence, i, i2, a);
    }

    public aes(int i) {
        this.a = i;
    }
}
