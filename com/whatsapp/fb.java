package com.whatsapp;

import android.text.GetChars;
import android.text.Spannable;
import android.text.SpannableString;

public final class fb implements CharSequence, GetChars, Spannable {
    private SpannableString a;

    public Object[] getSpans(int i, int i2, Class cls) {
        return this.a.getSpans(i, i2, cls);
    }

    public char charAt(int i) {
        if (i >= 0 && i < length()) {
            return this.a.charAt(i);
        }
        return ' ';
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        if (i2 >= i) {
            int length = length();
            if (i <= length && i2 <= length && i >= 0 && i2 >= 0) {
                this.a.getChars(i, i2, cArr, i3);
            }
        }
    }

    public int getSpanStart(Object obj) {
        return this.a.getSpanStart(obj);
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.a.nextSpanTransition(i, i2, cls);
    }

    public final String toString() {
        return this.a.toString();
    }

    public int getSpanEnd(Object obj) {
        return this.a.getSpanEnd(obj);
    }

    public int length() {
        return this.a.length();
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        this.a.setSpan(obj, i, i2, i3);
    }

    public void removeSpan(Object obj) {
        this.a.removeSpan(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.a.getSpanFlags(obj);
    }

    public fb(CharSequence charSequence) {
        this.a = new SpannableString(charSequence);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }
}
