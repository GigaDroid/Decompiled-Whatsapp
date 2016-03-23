package com.whatsapp.util;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;

final class b9 extends bw {
    b9() {
    }

    void a(Context context, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new BackgroundColorSpan(-256), i, i2, 33);
    }
}
