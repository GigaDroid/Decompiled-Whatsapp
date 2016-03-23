package com.whatsapp.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.format.Formatter;
import java.text.BreakIterator;

public class l {
    private static final ThreadLocal a;

    public static BreakIterator a() {
        return (BreakIterator) a.get();
    }

    public static String a(@NonNull Context context, long j) {
        if (j < 0) {
            return Formatter.formatShortFileSize(context, j);
        }
        if (j == 0) {
            return context.getString(2131232302);
        }
        if (j >= 1024) {
            return Formatter.formatShortFileSize(context, j);
        }
        return context.getString(2131231521, new Object[]{Double.valueOf(((double) j) / 1024.0d)});
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList a(android.text.Spannable r14, java.lang.Class r15) {
        /*
        r3 = 0;
        r4 = -1;
        r5 = com.whatsapp.util.Log.h;
        r0 = r14.length();
        r1 = r14.getSpans(r3, r0, r15);
        if (r1 == 0) goto L_0x0011;
    L_0x000e:
        r0 = r1.length;
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        r0 = 0;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = new java.util.ArrayList;
        r1 = java.util.Arrays.asList(r1);
        r0.<init>(r1);
        r1 = new com.whatsapp.util.ar;
        r1.<init>(r14);
        java.util.Collections.sort(r0, r1);
        r1 = r0.size();
    L_0x0028:
        r2 = r1 + -1;
        if (r3 >= r2) goto L_0x0012;
    L_0x002c:
        r6 = r0.get(r3);
        r2 = r3 + 1;
        r7 = r0.get(r2);
        r8 = r14.getSpanStart(r6);
        r9 = r14.getSpanEnd(r6);
        r10 = r14.getSpanStart(r7);
        r11 = r14.getSpanEnd(r7);
        if (r8 > r10) goto L_0x0073;
    L_0x0048:
        if (r9 <= r10) goto L_0x0073;
    L_0x004a:
        if (r11 > r9) goto L_0x0078;
    L_0x004c:
        r2 = r3 + 1;
        r14.removeSpan(r7);
        if (r5 == 0) goto L_0x006a;
    L_0x0053:
        r12 = r9 - r8;
        r13 = r11 - r10;
        if (r12 <= r13) goto L_0x0060;
    L_0x0059:
        r2 = r3 + 1;
        r14.removeSpan(r7);
        if (r5 == 0) goto L_0x006a;
    L_0x0060:
        r7 = r9 - r8;
        r8 = r11 - r10;
        if (r7 >= r8) goto L_0x006a;
    L_0x0066:
        r14.removeSpan(r6);
        r2 = r3;
    L_0x006a:
        if (r2 == r4) goto L_0x0073;
    L_0x006c:
        r0.remove(r2);
        r1 = r1 + -1;
        if (r5 == 0) goto L_0x0028;
    L_0x0073:
        r3 = r3 + 1;
        if (r5 == 0) goto L_0x0028;
    L_0x0077:
        goto L_0x0012;
    L_0x0078:
        r2 = r4;
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.l.a(android.text.Spannable, java.lang.Class):java.util.ArrayList");
    }

    static {
        a = new bn();
    }
}
