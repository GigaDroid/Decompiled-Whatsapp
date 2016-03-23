package org.spongycastle.jcajce.util;

import java.security.Provider;
import java.security.Security;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.v;
import org.whispersystems.at;

public class BCJcaJceHelper extends ProviderJcaJceHelper {
    private static final String[] z;

    static {
        int i;
        String[] strArr = new String[2];
        char[] toCharArray = "vO".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case v.m /*0*/:
                    i = 37;
                    break;
                case at.g /*1*/:
                    i = 12;
                    break;
                case at.i /*2*/:
                    i = 92;
                    break;
                case at.o /*3*/:
                    i = 92;
                    break;
                default:
                    i = 96;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "vO".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i = 37;
                    break;
                case at.g /*1*/:
                    i = 12;
                    break;
                case at.i /*2*/:
                    i = 92;
                    break;
                case at.o /*3*/:
                    i = 92;
                    break;
                default:
                    i = 96;
                    break;
            }
            cArr[length] = (char) (i ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public BCJcaJceHelper() {
        super(getBouncyCastleProvider());
    }

    private static Provider getBouncyCastleProvider() {
        if (Security.getProvider(z[0]) != null) {
            return Security.getProvider(z[1]);
        }
        return new BouncyCastleProvider();
    }
}
