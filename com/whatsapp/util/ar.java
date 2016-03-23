package com.whatsapp.util;

import android.text.Spannable;
import java.util.Comparator;

final class ar implements Comparator {
    final Spannable a;

    public final int compare(Object obj, Object obj2) {
        if (this.a.getSpanStart(obj) < this.a.getSpanStart(obj2)) {
            return -1;
        }
        if (this.a.getSpanStart(obj) > this.a.getSpanStart(obj2)) {
            return 1;
        }
        if (this.a.getSpanEnd(obj) < this.a.getSpanEnd(obj2)) {
            return 1;
        }
        if (this.a.getSpanEnd(obj) <= this.a.getSpanEnd(obj2)) {
            return 0;
        }
        return -1;
    }

    ar(Spannable spannable) {
        this.a = spannable;
    }
}
