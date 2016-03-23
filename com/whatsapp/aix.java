package com.whatsapp;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableString;

final class aix extends Factory {
    aix() {
    }

    public Spannable newSpannable(CharSequence charSequence) {
        return new fb(new SpannableString(charSequence));
    }
}
