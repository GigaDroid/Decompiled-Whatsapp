package com.whatsapp;

import android.os.ConditionVariable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

final class aoo implements ui {
    private static final String z;
    final ConditionVariable a;
    final StringBuffer b;

    static {
        char[] toCharArray = "!\u0011uR=\u0016]DG5TzIN4TuD".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 121;
                    break;
                case at.g /*1*/:
                    i2 = 60;
                    break;
                case at.i /*2*/:
                    i2 = 32;
                    break;
                case at.o /*3*/:
                    i2 = 34;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(long j) {
    }

    public void a(Map map, String str) {
        boolean z = DialogToastActivity.f;
        for (Entry entry : map.entrySet()) {
            if (z) {
                break;
            }
        }
        List list = (List) map.get(z);
        if (!(list == null || list.isEmpty())) {
            this.b.append((String) list.get(0));
        }
        this.a.open();
    }

    aoo(StringBuffer stringBuffer, ConditionVariable conditionVariable) {
        this.b = stringBuffer;
        this.a = conditionVariable;
    }
}
