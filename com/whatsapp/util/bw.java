package com.whatsapp.util;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.whatsapp.ael;
import java.text.BreakIterator;
import java.util.List;

public abstract class bw {
    public static final bw a;
    public static final bw b;

    abstract void a(Context context, SpannableStringBuilder spannableStringBuilder, int i, int i2);

    public static CharSequence a(Context context, SpannableStringBuilder spannableStringBuilder, String str, List list, bw bwVar) {
        SpannableStringBuilder spannableStringBuilder2;
        int i = Log.h;
        if (list == null || list.isEmpty()) {
            spannableStringBuilder2 = spannableStringBuilder;
        } else {
            String replaceAll = ael.q.matcher(str).replaceAll(" ");
            BreakIterator a = l.a();
            a.setText(replaceAll);
            int first = a.first();
            int next = a.next();
            spannableStringBuilder2 = spannableStringBuilder;
            while (next != -1) {
                String o = ael.o(replaceAll.substring(first, next));
                SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                for (String str2 : list) {
                    if (o.startsWith(str2)) {
                        if (spannableStringBuilder3 == null) {
                            spannableStringBuilder3 = new SpannableStringBuilder(str);
                        }
                        bwVar.a(context, spannableStringBuilder3, first, str2.length() + first);
                    }
                    spannableStringBuilder2 = spannableStringBuilder3;
                    if (i != 0) {
                        break;
                    }
                    spannableStringBuilder3 = spannableStringBuilder2;
                }
                spannableStringBuilder2 = spannableStringBuilder3;
                int next2 = a.next();
                if (i != 0) {
                    break;
                }
                first = next;
                next = next2;
            }
        }
        return spannableStringBuilder2 == null ? str : spannableStringBuilder2;
    }

    static {
        a = new be();
        b = new b9();
    }

    public static CharSequence a(Context context, CharSequence charSequence, List list) {
        return a(context, charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : null, charSequence.toString(), list);
    }

    public static CharSequence a(Context context, SpannableStringBuilder spannableStringBuilder, String str, List list) {
        return a(context, spannableStringBuilder, str, list, a);
    }
}
