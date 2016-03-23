package org.spongycastle.jcajce.provider.digest;

import com.whatsapp.arj;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.v;
import org.whispersystems.at;

public class SHA384 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA384Digest());
        }

        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA384Digest((SHA384Digest) this.digest);
            return digest;
        }
    }

    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA384Digest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "\u001d9H|\u001e\u001d5:\u0007y".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 85;
                        break;
                    case at.g /*1*/:
                        i2 = 116;
                        break;
                    case at.i /*2*/:
                        i2 = 9;
                        break;
                    case at.o /*3*/:
                        i2 = 63;
                        break;
                    default:
                        i2 = 77;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGenerator() {
            super(z, 384, new CipherKeyGenerator());
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(z[3], PREFIX + z[4]);
            configurableProvider.addAlgorithm(z[2], z[0]);
            addHMACAlgorithm(configurableProvider, z[1], PREFIX + z[5], PREFIX + z[6]);
        }

        static {
            int i;
            int i2;
            String[] strArr = new String[7];
            char[] toCharArray = "\u0005I\u000f+[n5".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 86;
                        break;
                    case at.g /*1*/:
                        i2 = 1;
                        break;
                    case at.i /*2*/:
                        i2 = 78;
                        break;
                    case at.o /*3*/:
                        i2 = 6;
                        break;
                    default:
                        i2 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "\u0005I\u000f5Pb".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 86;
                        break;
                    case at.g /*1*/:
                        i2 = 1;
                        break;
                    case at.i /*2*/:
                        i2 = 78;
                        break;
                    case at.o /*3*/:
                        i2 = 6;
                        break;
                    default:
                        i2 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "\u0017m)():h/uF\u001bd=u\t1d\no\u000f3r:(;\u001e@}>\\".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 86;
                        break;
                    case at.g /*1*/:
                        i2 = 1;
                        break;
                    case at.i /*2*/:
                        i2 = 78;
                        break;
                    case at.o /*3*/:
                        i2 = 6;
                        break;
                    default:
                        i2 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "\u001bd=u\t1d\no\u000f3r:(;\u001e@c5Pb".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 86;
                        break;
                    case at.g /*1*/:
                        i2 = 1;
                        break;
                    case at.i /*2*/:
                        i2 = 78;
                        break;
                    case at.o /*3*/:
                        i2 = 6;
                        break;
                    default:
                        i2 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "rE'a\r%u".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 86;
                        break;
                    case at.g /*1*/:
                        i2 = 1;
                        break;
                    case at.i /*2*/:
                        i2 = 78;
                        break;
                    case at.o /*3*/:
                        i2 = 6;
                        break;
                    default:
                        i2 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "rI/u\u0000\u001b`-".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 86;
                        break;
                    case at.g /*1*/:
                        i2 = 1;
                        break;
                    case at.i /*2*/:
                        i2 = 78;
                        break;
                    case at.o /*3*/:
                        i2 = 6;
                        break;
                    default:
                        i2 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "rJ+\u007f/3o+t\t\"n<".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                char c3 = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = 86;
                        break;
                    case at.g /*1*/:
                        i2 = 1;
                        break;
                    case at.i /*2*/:
                        i2 = 78;
                        break;
                    case at.o /*3*/:
                        i2 = 6;
                        break;
                    default:
                        i2 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[length] = (char) (i2 ^ c3);
            }
            strArr[6] = new String(cArr).intern();
            z = strArr;
            PREFIX = SHA384.class.getName();
        }
    }

    private SHA384() {
    }
}
