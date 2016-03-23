package com.whatsapp;

import android.os.ConditionVariable;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.v;
import org.whispersystems.at;

final class oe implements Runnable {
    private static final String[] z;
    final ConditionVariable a;
    final boolean b;
    final HashMap c;
    final ConditionVariable d;

    static {
        String[] strArr = new String[2];
        String str = "E\u001al](I\u001al]#A\u0004x]!V5o\u0017>@5\u007f\u001d>RJl\u00005A\u0007l\u0006j";
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
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 28;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = 80;
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
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0004\u0018y\u00115J\u001eoR5V\u0018s\u0000p";
                    obj = null;
            }
        }
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        List arrayList = new ArrayList();
        try {
            for (co coVar : this.c.values()) {
                if (coVar != null) {
                    arrayList.add(coVar);
                }
                if (z) {
                    break;
                }
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            Log.e(z[0] + this.b + z[1] + e2.toString());
        }
        App.a(0, arrayList, true, this.b, this.d, this.a);
    }

    oe(HashMap hashMap, boolean z, ConditionVariable conditionVariable, ConditionVariable conditionVariable2) {
        this.c = hashMap;
        this.b = z;
        this.d = conditionVariable;
        this.a = conditionVariable2;
    }
}
