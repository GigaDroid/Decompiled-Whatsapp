package com.whatsapp.gcm.experiment;

import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

public class j {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "0\u0010?A\tm\u001aq\u0017\t7\u000e&\bN/\u00166JLn\u001a>K";
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
                        i3 = 64;
                        break;
                    case at.g /*1*/:
                        i3 = 121;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 38;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0010\u0010?Aj(\u001c2M\u0006\t\u0017%C[2\f!RL$<)EL0\r8IG";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0010\u0010?Aj(\u001c2M\u0006\t6\u0014^J%\t%OF.";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0010\u0010?Aj(\u001c2M\u00066\u0018=SL}";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static boolean a() {
        boolean z = true;
        try {
            Process exec = Runtime.getRuntime().exec(z[0]);
            try {
                exec.waitFor();
                int exitValue = exec.exitValue();
                try {
                    exec.destroy();
                    Log.i(z[1] + exitValue);
                    if (exitValue != 0) {
                        z = false;
                    }
                    return z;
                } catch (IOException e) {
                    throw e;
                }
            } catch (InterruptedException e2) {
                Log.w(z[2]);
                return false;
            }
        } catch (IOException e3) {
            Log.w(z[3]);
            return false;
        }
    }
}
