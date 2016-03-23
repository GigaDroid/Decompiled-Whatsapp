package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.digests.SHA512tDigest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.v;
import org.whispersystems.at;

public class SHA512 {
    public static boolean a;

    public class Digest extends BCMessageDigest implements Cloneable {
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA512Digest((SHA512Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new SHA512Digest());
        }
    }

    public class DigestT extends BCMessageDigest implements Cloneable {
        public Object clone() {
            DigestT digestT = (DigestT) super.clone();
            digestT.digest = new SHA512tDigest((SHA512tDigest) this.digest);
            return digestT;
        }

        public DigestT(int i) {
            super(new SHA512tDigest(i));
        }
    }

    public class DigestT224 extends DigestT {
        public DigestT224() {
            super(224);
        }
    }

    public class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA512Digest()));
        }
    }

    public class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new HMac(new SHA512tDigest(224)));
        }
    }

    public class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new HMac(new SHA512tDigest(256)));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "8D:|s8HN\u000e\u0012".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 112;
                        break;
                    case at.g /*1*/:
                        i2 = 9;
                        break;
                    case at.i /*2*/:
                        i2 = 123;
                        break;
                    case at.o /*3*/:
                        i2 = 63;
                        break;
                    default:
                        i2 = 32;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGenerator() {
            super(z, 512, new CipherKeyGenerator());
        }
    }

    public class KeyGeneratorT224 extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "\u001e\u000f`>T\u001e\u0003\u0014L5yp\u0013I".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 86;
                        break;
                    case at.g /*1*/:
                        i2 = 66;
                        break;
                    case at.i /*2*/:
                        i2 = 33;
                        break;
                    case at.o /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGeneratorT224() {
            super(z, 224, new CipherKeyGenerator());
        }
    }

    public class KeyGeneratorT256 extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "\u0014C\u000f\t\u0003\u0014O{{bs<{|".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 92;
                        break;
                    case at.g /*1*/:
                        i2 = 14;
                        break;
                    case at.i /*2*/:
                        i2 = 78;
                        break;
                    case at.o /*3*/:
                        i2 = 74;
                        break;
                    default:
                        i2 = 80;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGeneratorT256() {
            super(z, 256, new CipherKeyGenerator());
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        static {
            int i;
            int i2;
            String[] strArr = new String[21];
            char[] toCharArray = "~@J\u0005,)pwP{n".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "~OF\u001b\u000e?jF\u0010(.kQ".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "~@J\u0005,)pwP|l".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "\u001bhDL\b6mB\u0011g\u0017aP\u0011(=ag\u000b.?wWL\u001a\u0012E\u0016S{h1\u0015".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "\u0017aP\u0011(=ag\u000b.?wWL\u001a\u0012E\u000eWxh".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "\u0017aP\u0011(=ag\u000b.?wWL\u001a\u0012E\u000eWxh+\u0011W\u007f".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "\tLbO|k6".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[6] = new String(cArr).intern();
            toCharArray = "~OF\u001b\u000e?jF\u0010(.kQ6{o2".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[7] = new String(cArr).intern();
            toCharArray = "\u0017aP\u0011(=ag\u000b.?wWL\u001a\u0012E\u000eWxh+\u0011P}".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[8] = new String(cArr).intern();
            toCharArray = "~LB\u0011!\u0017e@6{h0".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[9] = new String(cArr).intern();
            toCharArray = "~OF\u001b\u000e?jF\u0010(.kQ6{h0".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[10] = new String(cArr).intern();
            toCharArray = "~LB\u0011!\u0017e@6{o2".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[11] = new String(cArr).intern();
            toCharArray = "\tLbO|k6\fP|l".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[12] = new String(cArr).intern();
            toCharArray = "\tLbWxh+\u0011P}".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[13] = new String(cArr).intern();
            toCharArray = "\u001bhDL\b6mB\u0011g\u0017aP\u0011(=ag\u000b.?wWL\u001a\u0012E\u0016S{u6\u0011V".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[14] = new String(cArr).intern();
            toCharArray = "~@J\u0005,)p".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[15] = new String(cArr).intern();
            toCharArray = "\u001bhDL\b6mB\u0011g\u0017aP\u0011(=ag\u000b.?wWL\u001a\u0012E\u0016S{".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[16] = new String(cArr).intern();
            toCharArray = "~LB\u0011!\u0017e@".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[17] = new String(cArr).intern();
            toCharArray = "\tLbWxh+\u0011W\u007f".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[18] = new String(cArr).intern();
            toCharArray = "\tLbO|k6\fP{n".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[19] = new String(cArr).intern();
            toCharArray = "\tLbWxh".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = 90;
                        break;
                    case at.g /*1*/:
                        i2 = 4;
                        break;
                    case at.i /*2*/:
                        i2 = 35;
                        break;
                    case at.o /*3*/:
                        i2 = 98;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[20] = new String(cArr).intern();
            z = strArr;
            PREFIX = SHA512.class.getName();
        }

        public void configure(ConfigurableProvider configurableProvider) {
            boolean z = false;
            boolean z2 = SHA512.a;
            configurableProvider.addAlgorithm(z[4], PREFIX + z[15]);
            configurableProvider.addAlgorithm(z[16], z[6]);
            configurableProvider.addAlgorithm(z[8], PREFIX + z[0]);
            configurableProvider.addAlgorithm(z[14], z[19]);
            configurableProvider.addAlgorithm(z[5], PREFIX + z[2]);
            configurableProvider.addAlgorithm(z[3], z[12]);
            addHMACAlgorithm(configurableProvider, z[20], PREFIX + z[17], PREFIX + z[1]);
            addHMACAlgorithm(configurableProvider, z[13], PREFIX + z[9], PREFIX + z[10]);
            addHMACAlgorithm(configurableProvider, z[18], PREFIX + z[11], PREFIX + z[7]);
            if (z2) {
                if (!BCMessageDigest.a) {
                    z = true;
                }
                BCMessageDigest.a = z;
            }
        }
    }

    private SHA512() {
    }
}
