package com.whatsapp;

import android.widget.TextView;
import java.text.NumberFormat;

class aq7 implements Runnable {
    final a2g a;
    final int b;

    aq7(a2g com_whatsapp_a2g, int i) {
        this.a = com_whatsapp_a2g;
        this.b = i;
    }

    public void run() {
        if (!this.a.isCancelled()) {
            TextView textView = (TextView) this.a.a.findViewById(2131755758);
            textView.setText(NumberFormat.getInstance().format((long) this.b));
            aam.a(textView, 2130837714);
        }
    }
}
