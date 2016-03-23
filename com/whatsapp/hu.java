package com.whatsapp;

import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

public class hu implements TextWatcher {
    private final TextView a;
    private final int b;
    private final EditText c;
    private final int d;
    private int e;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public hu(EditText editText, TextView textView, int i, int i2) {
        this.c = editText;
        this.a = textView;
        this.b = i;
        this.d = i2;
        if (textView != null && i != 0 && i2 == 0) {
            textView.setText(NumberFormat.getInstance().format((long) i));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r10) {
        /*
        r9 = this;
        r8 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r9.c;
        r1 = r1.getContext();
        r2 = r9.c;
        r2 = r2.getPaint();
        com.whatsapp.a28.a(r10, r1, r2);
        r1 = r9.b;
        if (r1 <= 0) goto L_0x0094;
    L_0x0016:
        r1 = r10.toString();
        r2 = com.whatsapp.a28.c(r1);
        r3 = r9.a;
        if (r3 == 0) goto L_0x0059;
    L_0x0022:
        r3 = r9.b;
        r3 = r3 - r2;
        r4 = r9.d;
        if (r4 <= 0) goto L_0x004b;
    L_0x0029:
        r4 = r9.d;
        if (r3 >= r4) goto L_0x0042;
    L_0x002d:
        r4 = r9.a;
        r4.setVisibility(r8);
        r4 = r9.a;
        r5 = java.text.NumberFormat.getInstance();
        r6 = (long) r3;
        r5 = r5.format(r6);
        r4.setText(r5);
        if (r0 == 0) goto L_0x0059;
    L_0x0042:
        r4 = r9.a;
        r5 = 8;
        r4.setVisibility(r5);
        if (r0 == 0) goto L_0x0059;
    L_0x004b:
        r4 = r9.a;
        r5 = java.text.NumberFormat.getInstance();
        r6 = (long) r3;
        r3 = r5.format(r6);
        r4.setText(r3);
    L_0x0059:
        r3 = r9.b;
        if (r2 < r3) goto L_0x0087;
    L_0x005d:
        r2 = r9.e;
        if (r2 != 0) goto L_0x0087;
    L_0x0061:
        r2 = r9.c;
        r2 = r2.getInputType();
        r9.e = r2;
        r2 = r9.e;
        if (r2 == 0) goto L_0x0094;
    L_0x006d:
        r2 = r9.c;
        r3 = r9.e;
        r4 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r3 = r3 | r4;
        r2.setInputType(r3);
        r2 = r9.c;
        r2.setText(r1);
        r2 = r9.c;
        r1 = r1.length();
        r2.setSelection(r1);
        if (r0 == 0) goto L_0x0094;
    L_0x0087:
        r0 = r9.e;
        if (r0 == 0) goto L_0x0094;
    L_0x008b:
        r0 = r9.c;
        r1 = r9.e;
        r0.setInputType(r1);
        r9.e = r8;
    L_0x0094:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.hu.afterTextChanged(android.text.Editable):void");
    }

    public hu(EditText editText, TextView textView, int i) {
        this(editText, textView, i, 0);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aam.a(this.c, charSequence);
    }
}
