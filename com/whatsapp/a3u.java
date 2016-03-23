package com.whatsapp;

import com.whatsapp.protocol.bb;
import com.whatsapp.util.Log;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

class a3u extends a3i {
    private static final String z;
    final v9 j;

    static {
        char[] toCharArray = "\tTXJ\u007f\u0005TXJu\rG^Jv\u001a{I\u0006s\u0001KF:t\rPw\u0002u\u0007QXEd\u001aAI\u0011bHCZ\nr\u0018\u0004|*C'\u0004I\u0001cHTA\u0006s\u001dVM".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_editTextStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 40;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a3u(v9 v9Var, String str, String str2, Vector vector, int i, bb bbVar) {
        this.j = v9Var;
        super(str, str2, vector, i, bbVar);
    }

    public void a(String str) {
        Log.i(z);
        super.a(str);
    }
}
