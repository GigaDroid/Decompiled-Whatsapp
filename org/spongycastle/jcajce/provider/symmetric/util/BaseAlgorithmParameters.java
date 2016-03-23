package org.spongycastle.jcajce.provider.symmetric.util;

import com.whatsapp.arj;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.v;
import org.whispersystems.at;

public abstract class BaseAlgorithmParameters extends AlgorithmParametersSpi {
    private static final String z;

    static {
        char[] toCharArray = "\u0006nuCN\u0002rf\u0016W\b<uSW7}`WN\u0002hwDp\u0017yq\u0016N\u0012of\u0016M\bh2TFGrgZO".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.g /*1*/:
                    i2 = 28;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 54;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls);

    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        try {
            throw new NullPointerException(z);
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
