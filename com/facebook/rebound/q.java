package com.facebook.rebound;

import com.whatsapp.arj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.v;
import org.whispersystems.at;

public class q {
    private static final q a;
    private static final String[] z;
    private final Map b;

    public Map a() {
        return Collections.unmodifiableMap(this.b);
    }

    public static q b() {
        return a;
    }

    static {
        String[] strArr = new String[3];
        String str = "\u00011tqg\t 2s}\u000b2{w";
        boolean z = true;
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
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.g /*1*/:
                        i3 = 84;
                        break;
                    case at.i /*2*/:
                        i3 = 18;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 18;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0006;|v{\u0002\u001as}wE=a0`\u0000%gy`\u00000";
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new q(true);
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016$`y|\u0002\u0017}~t\f32yaE&wag\f&wt";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    q(boolean z) {
        this.b = new HashMap();
        if (z) {
            a(o.b, z[0]);
        }
    }

    public boolean a(o oVar, String str) {
        if (oVar == null) {
            try {
                throw new IllegalArgumentException(z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (str == null) {
            try {
                throw new IllegalArgumentException(z[2]);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            try {
                if (this.b.containsKey(oVar)) {
                    return false;
                }
                this.b.put(oVar, str);
                return true;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }
}
