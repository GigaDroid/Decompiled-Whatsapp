package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.v;
import org.whispersystems.at;

public class SHA256 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA256Digest());
        }

        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA256Digest((SHA256Digest) this.digest);
            return digest;
        }
    }

    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA256Digest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "\u000fXn8r\u000fT\u001dN\u0017".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 71;
                        break;
                    case at.g /*1*/:
                        i2 = 21;
                        break;
                    case at.i /*2*/:
                        i2 = 47;
                        break;
                    case at.o /*3*/:
                        i2 = 123;
                        break;
                    default:
                        i2 = 33;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGenerator() {
            super(z, 256, new CipherKeyGenerator());
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        static {
            int i;
            String[] strArr = new String[7];
            char[] toCharArray = "\u0005\u0010\nj]D5\na{U4\u001d".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 33;
                        break;
                    case at.g /*1*/:
                        i2 = 91;
                        break;
                    case at.i /*2*/:
                        i2 = 111;
                        break;
                    case at.o /*3*/:
                        i2 = 19;
                        break;
                    default:
                        i2 = 26;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "r\u0013.>(\u0014m".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 33;
                        break;
                    case at.g /*1*/:
                        i2 = 91;
                        break;
                    case at.i /*2*/:
                        i2 = 111;
                        break;
                    case at.o /*3*/:
                        i2 = 19;
                        break;
                    default:
                        i2 = 26;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "\u0005\u001f\u0006t\u007fR/".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 33;
                        break;
                    case at.g /*1*/:
                        i2 = 91;
                        break;
                    case at.i /*2*/:
                        i2 = 111;
                        break;
                    case at.o /*3*/:
                        i2 = 19;
                        break;
                    default:
                        i2 = 26;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "`7\b=[M2\u000e`4l>\u001c`{F>+z}D(\u001b=Ii\u001a]&,".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 33;
                        break;
                    case at.g /*1*/:
                        i2 = 91;
                        break;
                    case at.i /*2*/:
                        i2 = 111;
                        break;
                    case at.o /*3*/:
                        i2 = 19;
                        break;
                    default:
                        i2 = 26;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "r\u0013.!/\u0017".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 33;
                        break;
                    case at.g /*1*/:
                        i2 = 91;
                        break;
                    case at.i /*2*/:
                        i2 = 111;
                        break;
                    case at.o /*3*/:
                        i2 = 19;
                        break;
                    default:
                        i2 = 26;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "l>\u001c`{F>+z}D(\u001b=Ii\u001aB!/\u0017".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 33;
                        break;
                    case at.g /*1*/:
                        i2 = 91;
                        break;
                    case at.i /*2*/:
                        i2 = 111;
                        break;
                    case at.o /*3*/:
                        i2 = 19;
                        break;
                    default:
                        i2 = 26;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "\u0005\u0013\u000e`rl:\f".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = 33;
                        break;
                    case at.g /*1*/:
                        i2 = 91;
                        break;
                    case at.i /*2*/:
                        i2 = 111;
                        break;
                    case at.o /*3*/:
                        i2 = 19;
                        break;
                    default:
                        i2 = 26;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[6] = new String(cArr).intern();
            z = strArr;
            PREFIX = SHA256.class.getName();
        }

        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(z[5], PREFIX + z[2]);
            configurableProvider.addAlgorithm(z[3], z[1]);
            addHMACAlgorithm(configurableProvider, z[4], PREFIX + z[6], PREFIX + z[0]);
        }
    }

    private SHA256() {
    }
}
