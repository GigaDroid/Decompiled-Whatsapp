package org.spongycastle.jcajce.provider.digest;

import com.whatsapp.arj;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.v;
import org.whispersystems.at;

abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    private static final String[] z;

    static {
        int i;
        int i2;
        String[] strArr = new String[7];
        char[] toCharArray = "!n\u00118".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 123;
                    break;
                default:
                    i2 = arj.Theme_spinnerStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "(O7U-\u0005J1\bB\"F)<\t\u0007F\"\u001a\u0018\u0006Q~3!(`}".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 123;
                    break;
                default:
                    i2 = arj.Theme_spinnerStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\"F)<\t\u0007F\"\u001a\u0018\u0006Q~".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 123;
                    break;
                default:
                    i2 = arj.Theme_spinnerStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "(O7U-\u0005J1\bB\"F)<\t\u0007F\"\u001a\u0018\u0006Q~3!(`\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 123;
                    break;
                default:
                    i2 = arj.Theme_spinnerStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "(O7U-\u0005J1\bB$B3U$$b\u0013T".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 123;
                    break;
                default:
                    i2 = arj.Theme_spinnerStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "$B3U".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 123;
                    break;
                default:
                    i2 = arj.Theme_spinnerStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "(O7U-\u0005J1\bB$B3U$$b\u0013V".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 123;
                    break;
                default:
                    i2 = arj.Theme_spinnerStyle;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[6] = new String(cArr).intern();
        z = strArr;
    }

    protected void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String str4 = z[0] + str;
        configurableProvider.addAlgorithm(z[5] + str4, str2);
        configurableProvider.addAlgorithm(z[6] + str, str4);
        configurableProvider.addAlgorithm(z[4] + str, str4);
        configurableProvider.addAlgorithm(z[2] + str4, str3);
        configurableProvider.addAlgorithm(z[1] + str, str4);
        configurableProvider.addAlgorithm(z[3] + str, str4);
    }

    DigestAlgorithmProvider() {
    }
}
