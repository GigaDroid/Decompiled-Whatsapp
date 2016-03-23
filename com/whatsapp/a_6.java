package com.whatsapp;

import com.whatsapp.protocol.b5;
import com.whatsapp.util.Log;
import java.util.HashSet;
import org.v;
import org.whispersystems.at;

public class a_6 implements Runnable, b5 {
    private static final HashSet a;
    private static final String[] z;
    public String b;
    private final Runnable c;

    public void a() {
        Log.e(z[1]);
        a.remove(this.b);
    }

    public void a(int i) {
        Log.e(z[2] + i);
        App.p.M().removeCallbacks(this.c);
        a.remove(this.b);
    }

    static {
        String[] strArr = new String[3];
        String str = "e\u000e8\u000b\u0018`\u000e5\u0019\u0004h\u00132\u0004\u000b{\u0004(\u001a\u0003g\u0012>\u0002\rg\u00057\u000f\u001e&\u0012.\t\u000fl\u0012(";
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
                        i3 = 9;
                        break;
                    case at.g /*1*/:
                        i3 = 97;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    default:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "e\u000e8\u000b\u0018`\u000e5\u0019\u0004h\u00132\u0004\u000b{\u0004(\u001a\u0003g\u0012>\u0002\rg\u00057\u000f\u001e&\u0004)\u0018\u0003{A";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new HashSet();
                    return;
                default:
                    strArr2[i] = str;
                    str = "e\u000e8\u000b\u0018`\u000e5\u0019\u0004h\u00132\u0004\u000b{\u0004(\u001a\u0003g\u0012>\u0002\rg\u00057\u000f\u001e&\u00152\u0007\tf\u0014/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        Log.i(z[0]);
        App.p.M().removeCallbacks(this.c);
        a.remove(this.b);
    }

    public a_6(String str) {
        this.c = new azb(this);
        this.b = str;
        Log.b(a.add(str));
        App.p.M().postDelayed(this.c, 20000);
    }
}
