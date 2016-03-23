package org.spongycastle.jcajce.provider.digest;

import com.whatsapp.arj;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.v;
import org.whispersystems.at;

public class SHA224 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA224Digest());
        }

        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA224Digest((SHA224Digest) this.digest);
            return digest;
        }
    }

    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA224Digest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "(*\u0019)\u0004(&jXc".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 96;
                        break;
                    case at.g /*1*/:
                        i2 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i2 = 88;
                        break;
                    case at.o /*3*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    default:
                        i2 = 87;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGenerator() {
            super(z, 224, new CipherKeyGenerator());
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        static {
            int i;
            int i2;
            String[] strArr = new String[7];
            char[] toCharArray = ";,\u0019FYz\t\u0019M\u007fk\b\u000e".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 31;
                        break;
                    case at.g /*1*/:
                        i2 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i2 = 124;
                        break;
                    case at.o /*3*/:
                        i2 = 63;
                        break;
                    default:
                        i2 = 30;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "L/=\r,+".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 31;
                        break;
                    case at.g /*1*/:
                        i2 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i2 = 124;
                        break;
                    case at.o /*3*/:
                        i2 = 63;
                        break;
                    default:
                        i2 = 30;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = ";/\u001dLvR\u0006\u001f".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 31;
                        break;
                    case at.g /*1*/:
                        i2 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i2 = 124;
                        break;
                    case at.o /*3*/:
                        i2 = 63;
                        break;
                    default:
                        i2 = 30;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "R\u0002\u000fL\u007fx\u00028Vyz\u0014\b\u0011MW&Q\r,+".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 31;
                        break;
                    case at.g /*1*/:
                        i2 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i2 = 124;
                        break;
                    case at.o /*3*/:
                        i2 = 63;
                        break;
                    default:
                        i2 = 30;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "L/=\u0012,-S".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 31;
                        break;
                    case at.g /*1*/:
                        i2 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i2 = 124;
                        break;
                    case at.o /*3*/:
                        i2 = 63;
                        break;
                    default:
                        i2 = 30;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = ";#\u0015X{l\u0013".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 31;
                        break;
                    case at.g /*1*/:
                        i2 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i2 = 124;
                        break;
                    case at.o /*3*/:
                        i2 = 63;
                        break;
                    default:
                        i2 = 30;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "^\u000b\u001b\u0011_s\u000e\u001dL0R\u0002\u000fL\u007fx\u00028Vyz\u0014\b\u0011MW&N\r*".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = 31;
                        break;
                    case at.g /*1*/:
                        i2 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i2 = 124;
                        break;
                    case at.o /*3*/:
                        i2 = 63;
                        break;
                    default:
                        i2 = 30;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[6] = new String(cArr).intern();
            z = strArr;
            PREFIX = SHA224.class.getName();
        }

        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(z[3], PREFIX + z[5]);
            configurableProvider.addAlgorithm(z[6], z[4]);
            addHMACAlgorithm(configurableProvider, z[1], PREFIX + z[2], PREFIX + z[0]);
        }
    }

    private SHA224() {
    }
}
