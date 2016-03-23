package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.SHA3Digest;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.v;
import org.whispersystems.at;

public class SHA3 {

    public class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i) {
            super(new SHA3Digest(i));
        }

        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHA3Digest((SHA3Digest) this.digest);
            return bCMessageDigest;
        }
    }

    public class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(224);
        }
    }

    public class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    public class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(384);
        }
    }

    public class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        static {
            int i;
            int i2;
            String[] strArr = new String[8];
            char[] toCharArray = "\nGD-O]w\u0018{\u0018".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 46;
                        break;
                    case at.g /*1*/:
                        i2 = 3;
                        break;
                    case at.i /*2*/:
                        i2 = 45;
                        break;
                    case at.o /*3*/:
                        i2 = 74;
                        break;
                    default:
                        i2 = 42;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "cf^9KIfi#MKpYdyfB\u001eg\u001f\u001f1".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 46;
                        break;
                    case at.g /*1*/:
                        i2 = 3;
                        break;
                    case at.i /*2*/:
                        i2 = 45;
                        break;
                    case at.o /*3*/:
                        i2 = 74;
                        break;
                    default:
                        i2 = 42;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "cf^9KIfi#MKpYdyfB\u001eg\u0018\u001c7".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 46;
                        break;
                    case at.g /*1*/:
                        i2 = 3;
                        break;
                    case at.i /*2*/:
                        i2 = 45;
                        break;
                    case at.o /*3*/:
                        i2 = 74;
                        break;
                    default:
                        i2 = 42;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "cf^9KIfi#MKpYdyfB\u001eg\u0018\u001b5".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 46;
                        break;
                    case at.g /*1*/:
                        i2 = 3;
                        break;
                    case at.i /*2*/:
                        i2 = 45;
                        break;
                    case at.o /*3*/:
                        i2 = 74;
                        break;
                    default:
                        i2 = 42;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "\nGD-O]w\u001er\u001e".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 46;
                        break;
                    case at.g /*1*/:
                        i2 = 3;
                        break;
                    case at.i /*2*/:
                        i2 = 45;
                        break;
                    case at.o /*3*/:
                        i2 = 74;
                        break;
                    default:
                        i2 = 42;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "\nGD-O]w\u001fx\u001e".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 46;
                        break;
                    case at.g /*1*/:
                        i2 = 3;
                        break;
                    case at.i /*2*/:
                        i2 = 45;
                        break;
                    case at.o /*3*/:
                        i2 = 74;
                        break;
                    default:
                        i2 = 42;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "\nGD-O]w\u001f\u007f\u001c".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 46;
                        break;
                    case at.g /*1*/:
                        i2 = 3;
                        break;
                    case at.i /*2*/:
                        i2 = 45;
                        break;
                    case at.o /*3*/:
                        i2 = 74;
                        break;
                    default:
                        i2 = 42;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[6] = new String(cArr).intern();
            toCharArray = "cf^9KIfi#MKpYdyfB\u001eg\u0019\u00167".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = 46;
                        break;
                    case at.g /*1*/:
                        i2 = 3;
                        break;
                    case at.i /*2*/:
                        i2 = 45;
                        break;
                    case at.o /*3*/:
                        i2 = 74;
                        break;
                    default:
                        i2 = 42;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[7] = new String(cArr).intern();
            z = strArr;
            PREFIX = SHA3.class.getName();
        }

        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(z[2], PREFIX + z[5]);
            configurableProvider.addAlgorithm(z[3], PREFIX + z[6]);
            configurableProvider.addAlgorithm(z[7], PREFIX + z[4]);
            configurableProvider.addAlgorithm(z[1], PREFIX + z[0]);
        }
    }

    private SHA3() {
    }
}
