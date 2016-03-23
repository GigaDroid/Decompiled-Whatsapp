package com.whatsapp.appwidget;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.whatsapp.arj;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class a implements Runnable {
    private static final String[] z;
    final h a;
    final ArrayList b;

    static {
        String[] strArr = new String[2];
        String str = "dq\u001a@\u0011af\u000fc5lo=~\u001cqi";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 5;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 120;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "dq\u001a@\u0011af\u000fc5lo\"r\u0011bi\u001e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
            }
        }
    }

    public void run() {
        boolean z = WidgetProvider.a;
        WidgetProvider.a(this.b);
        int[] b = h.b(this.a);
        int length = b.length;
        int i = 0;
        while (i < length) {
            int i2;
            int i3;
            int i4 = b[i];
            if (VERSION.SDK_INT >= 16) {
                Bundle appWidgetOptions = h.c(this.a).getAppWidgetOptions(i4);
                if (appWidgetOptions != null) {
                    i2 = appWidgetOptions.getInt(z[0]);
                    i3 = appWidgetOptions.getInt(z[1]);
                    if (i2 == 0 || i3 == 0) {
                        i3 = Integer.MAX_VALUE;
                        i2 = Integer.MAX_VALUE;
                    }
                    h.c(this.a).updateAppWidget(i4, WidgetProvider.a(h.a(this.a), i4, i2, i3));
                    if (WidgetProvider.b(i2, i3)) {
                        h.c(this.a).notifyAppWidgetViewDataChanged(i4, 2131755992);
                    }
                    i3 = i + 1;
                    if (z) {
                        i = i3;
                    } else {
                        return;
                    }
                }
            }
            i3 = Integer.MAX_VALUE;
            i2 = Integer.MAX_VALUE;
            h.c(this.a).updateAppWidget(i4, WidgetProvider.a(h.a(this.a), i4, i2, i3));
            if (WidgetProvider.b(i2, i3)) {
                h.c(this.a).notifyAppWidgetViewDataChanged(i4, 2131755992);
            }
            i3 = i + 1;
            if (z) {
                i = i3;
            } else {
                return;
            }
        }
    }

    a(h hVar, ArrayList arrayList) {
        this.a = hVar;
        this.b = arrayList;
    }
}
