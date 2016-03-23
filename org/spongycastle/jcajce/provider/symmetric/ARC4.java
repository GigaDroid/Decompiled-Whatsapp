package org.spongycastle.jcajce.provider.symmetric;

import com.whatsapp.arj;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.RC4Engine;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.digest.BCMessageDigest;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.v;
import org.whispersystems.at;

public final class ARC4 {

    public class Base extends BaseStreamCipher {
        public Base() {
            super(new RC4Engine(), 0);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "T%/".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 6;
                        break;
                    case at.g /*1*/:
                        i2 = arj.Theme_checkboxStyle;
                        break;
                    case at.i /*2*/:
                        i2 = 27;
                        break;
                    case at.o /*3*/:
                        i2 = arj.Theme_checkboxStyle;
                        break;
                    default:
                        i2 = 61;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGen() {
            super(z, 128, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        static {
            int i;
            int i2;
            String[] strArr = new String[10];
            char[] toCharArray = "[U\"\r".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 97;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "[k\u0006\u0017mvn\u0000J\u0002Qb\u0018~Itb\u0013XXuuOko.".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 97;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "[k\u0006\u0017mvn\u0000J\u0002Yn\u0011QIh) ko\\H4k".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 97;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "Qb\u0018~Itb\u0013XXuuOx~Y3".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 97;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = ">E\u0000JI".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 97;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "[k\u0006\u0017mvn\u0000J\u0002Yn\u0011QIh)3z\u0018".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 97;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "[U\"\r".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 97;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[6] = new String(cArr).intern();
            toCharArray = "[U\"\r".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 97;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[7] = new String(cArr).intern();
            toCharArray = "Yn\u0011QIh) ko.".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 97;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[8] = new String(cArr).intern();
            toCharArray = ">L\u0004@k\u007fi".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 97;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[9] = new String(cArr).intern();
            z = strArr;
            PREFIX = ARC4.class.getName();
        }

        public void configure(ConfigurableProvider configurableProvider) {
            boolean z = false;
            boolean z2 = AES.a;
            configurableProvider.addAlgorithm(z[8], PREFIX + z[4]);
            configurableProvider.addAlgorithm(z[2], z[0]);
            configurableProvider.addAlgorithm(z[5], z[6]);
            configurableProvider.addAlgorithm(z[3], PREFIX + z[9]);
            configurableProvider.addAlgorithm(z[1], z[7]);
            if (BCMessageDigest.a) {
                if (!z2) {
                    z = true;
                }
                AES.a = z;
            }
        }
    }

    private ARC4() {
    }
}
