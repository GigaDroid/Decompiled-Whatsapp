package com.whatsapp;

import android.os.SystemClock;
import android.widget.ListView;
import com.whatsapp.observablelistview.ObservableListView;
import com.whatsapp.observablelistview.j;
import org.v;
import org.whispersystems.at;

public class a2c {
    private static final String z;

    static {
        char[] toCharArray = "}Wf_$J\u0016a_8JWd]kQXLC*IzaB?[XmCkXYz\u0011'WE|G\"[A".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 62;
                    break;
                case at.g /*1*/:
                    i2 = 54;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 49;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static long a() {
        return SystemClock.elapsedRealtime();
    }

    public static void b(ListView listView, ce ceVar) {
        try {
            if (listView instanceof j) {
                ((j) listView).a(new asm(ceVar));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static void a(ListView listView, ce ceVar) {
        try {
            if (listView instanceof ObservableListView) {
                ((ObservableListView) listView).a(new __(ceVar));
                return;
            }
            throw new IllegalArgumentException(z);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
