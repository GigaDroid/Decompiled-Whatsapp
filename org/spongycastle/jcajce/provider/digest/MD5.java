package org.spongycastle.jcajce.provider.digest;

import com.whatsapp.arj;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.v;
import org.whispersystems.at;

public class MD5 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new MD5Digest((MD5Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new MD5Digest());
        }
    }

    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new MD5Digest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "R\u001a\rl`^b".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 26;
                        break;
                    case at.g /*1*/:
                        i2 = 87;
                        break;
                    case at.i /*2*/:
                        i2 = 76;
                        break;
                    case at.o /*3*/:
                        i2 = 47;
                        break;
                    default:
                        i2 = 45;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGenerator() {
            super(z, 128, new CipherKeyGenerator());
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(z[0], PREFIX + z[4]);
            addHMACAlgorithm(configurableProvider, z[2], PREFIX + z[3], PREFIX + z[1]);
        }

        static {
            int i;
            int i2;
            String[] strArr = new String[5];
            char[] toCharArray = "'7\u00195\u0007\r7./\u0001\u000f!\u001eh+.g".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i2 = 82;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i2 = 70;
                        break;
                    default:
                        i2 = arj.Theme_checkboxStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "N\u0019\u000f?!\u000f<\u000f4\u0007\u001e=\u0018".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i2 = 82;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i2 = 70;
                        break;
                    default:
                        i2 = arj.Theme_checkboxStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "'\u0016_".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i2 = 82;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i2 = 70;
                        break;
                    default:
                        i2 = arj.Theme_checkboxStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "N\u001a\u000b5\u000e'3\t".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i2 = 82;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i2 = 70;
                        break;
                    default:
                        i2 = arj.Theme_checkboxStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "N\u0016\u0003!\u0003\u0019&".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i2 = 82;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i2 = 70;
                        break;
                    default:
                        i2 = arj.Theme_checkboxStyle;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[4] = new String(cArr).intern();
            z = strArr;
            PREFIX = MD5.class.getName();
        }
    }

    private MD5() {
    }
}
