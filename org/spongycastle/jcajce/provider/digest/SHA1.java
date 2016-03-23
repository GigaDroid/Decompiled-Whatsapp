package org.spongycastle.jcajce.provider.digest;

import com.whatsapp.arj;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.spongycastle.jcajce.provider.symmetric.util.PBE.Util;
import org.v;
import org.whispersystems.at;

public class SHA1 {

    public class BasePBKDF2WithHmacSHA1 extends BaseSecretKeyFactory {
        private static final String[] z;
        private int scheme;

        static {
            int i;
            String[] strArr = new String[5];
            char[] toCharArray = "I\f\f*TP\u0015\u001acIM\u0006\r\"TP\f\u0011cCV\u0016\u00117\u0000K\u0006\u000e6IK\u0006\u001by\u0000".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 57;
                        break;
                    case at.g /*1*/:
                        i2 = 99;
                        break;
                    case at.i /*2*/:
                        i2 = 127;
                        break;
                    case at.o /*3*/:
                        i2 = 67;
                        break;
                    default:
                        i2 = 32;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "I\f\f*TP\u0015\u001acK\\\u001a_/EW\u0004\u000b+\u0000K\u0006\u000e6IK\u0006\u001by\u0000".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 57;
                        break;
                    case at.g /*1*/:
                        i2 = 99;
                        break;
                    case at.i /*2*/:
                        i2 = 127;
                        break;
                    case at.o /*3*/:
                        i2 = 67;
                        break;
                    default:
                        i2 = 32;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "I\u0002\f0WV\u0011\u001bcET\u0013\u000b:".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 57;
                        break;
                    case at.g /*1*/:
                        i2 = 99;
                        break;
                    case at.i /*2*/:
                        i2 = 127;
                        break;
                    case at.o /*3*/:
                        i2 = 67;
                        break;
                    default:
                        i2 = 32;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "T\n\f0IW\u0004_1EH\u0016\u00161E]C\f\"LM".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 57;
                        break;
                    case at.g /*1*/:
                        i2 = 99;
                        break;
                    case at.i /*2*/:
                        i2 = 127;
                        break;
                    case at.o /*3*/:
                        i2 = 67;
                        break;
                    default:
                        i2 = 32;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "p\r\t\"LP\u0007_\bE@0\u000f&C".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = 57;
                        break;
                    case at.g /*1*/:
                        i2 = 99;
                        break;
                    case at.i /*2*/:
                        i2 = 127;
                        break;
                    case at.o /*3*/:
                        i2 = 67;
                        break;
                    default:
                        i2 = 32;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[4] = new String(cArr).intern();
            z = strArr;
        }

        public BasePBKDF2WithHmacSHA1(String str, int i) {
            super(str);
            this.scheme = i;
        }

        protected SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                try {
                    if (pBEKeySpec.getSalt() == null) {
                        throw new InvalidKeySpecException(z[3]);
                    }
                    try {
                        if (pBEKeySpec.getIterationCount() <= 0) {
                            throw new InvalidKeySpecException(z[0] + pBEKeySpec.getIterationCount());
                        }
                        try {
                            if (pBEKeySpec.getKeyLength() <= 0) {
                                throw new InvalidKeySpecException(z[1] + pBEKeySpec.getKeyLength());
                            }
                            try {
                                if (pBEKeySpec.getPassword().length == 0) {
                                    throw new IllegalArgumentException(z[2]);
                                }
                                int keyLength = pBEKeySpec.getKeyLength();
                                return new BCPBEKey(this.algName, this.scheme, 1, keyLength, -1, pBEKeySpec, Util.makePBEMacParameters(pBEKeySpec, this.scheme, 1, keyLength));
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            }
            throw new InvalidKeySpecException(z[4]);
        }
    }

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA1Digest());
        }

        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA1Digest((SHA1Digest) this.digest);
            return digest;
        }
    }

    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = ";hX&L;d(".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 115;
                        break;
                    case at.g /*1*/:
                        i2 = 37;
                        break;
                    case at.i /*2*/:
                        i2 = 25;
                        break;
                    case at.o /*3*/:
                        i2 = arj.Theme_buttonStyleSmall;
                        break;
                    default:
                        i2 = 31;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGenerator() {
            super(z, 160, new CipherKeyGenerator());
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        public void configure(ConfigurableProvider configurableProvider) {
            boolean z = false;
            boolean z2 = SHA512.a;
            configurableProvider.addAlgorithm(z[0], PREFIX + z[9]);
            configurableProvider.addAlgorithm(z[8], z[19]);
            configurableProvider.addAlgorithm(z[1], z[11]);
            addHMACAlgorithm(configurableProvider, z[3], PREFIX + z[17], PREFIX + z[20]);
            configurableProvider.addAlgorithm(z[21], PREFIX + z[18]);
            configurableProvider.addAlgorithm(z[12], PREFIX + z[4]);
            configurableProvider.addAlgorithm(z[7], z[13]);
            configurableProvider.addAlgorithm(z[2], PREFIX + z[10]);
            configurableProvider.addAlgorithm(z[15], z[5]);
            configurableProvider.addAlgorithm(z[22], PREFIX + z[14]);
            configurableProvider.addAlgorithm(z[23], z[24]);
            configurableProvider.addAlgorithm(z[6], z[16]);
            if (BCMessageDigest.a) {
                if (!z2) {
                    z = true;
                }
                SHA512.a = z;
            }
        }

        static {
            int i;
            int i2;
            String[] strArr = new String[25];
            char[] toCharArray = "?H~\u0003f\u0015HI\u0019`\u0017^y^T:l A".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "3Aj^F\u001eDl\u0003)?H~\u0003f\u0015HI\u0019`\u0017^y^T:l".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "!Hn\u0002b\u0006fh\tA\u0013Ny\u001fu\u000b\u0003]2L6k?'n\u0006EE\u001df\u0011~E16".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "!eLA".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "V~E16?Ln".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "\"oF4A@zd\u0004o:@l\u0013T:l<".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "3Aj^F\u001eDl\u0003)!Hn\u0002b\u0006fh\tA\u0013Ny\u001fu\u000b\u0003]2L6k?\u0007n\u0006E52N&".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[6] = new String(cArr).intern();
            toCharArray = "3Aj^F\u001eDl\u0003)!Hn\u0002b\u0006fh\tA\u0013Ny\u001fu\u000b\u0003]2B%dY8O?lN#O3".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[7] = new String(cArr).intern();
            toCharArray = "3Aj^F\u001eDl\u0003)?H~\u0003f\u0015HI\u0019`\u0017^y^T:l<".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[8] = new String(cArr).intern();
            toCharArray = "Vid\u0017b\u0001Y".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[9] = new String(cArr).intern();
            toCharArray = "V}O;C4\u001fZ\u0019s\u001ae`\u0011d!eLAR&k5".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[10] = new String(cArr).intern();
            toCharArray = "!eL]6".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[11] = new String(cArr).intern();
            toCharArray = "?Ln^W0hZ9S:e@1D!eLA".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[12] = new String(cArr).intern();
            toCharArray = "\"oH'N&eE=F1~E16".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[13] = new String(cArr).intern();
            toCharArray = "V}O;C4\u001fZ\u0019s\u001ae`\u0011d!eLA?0dY".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[14] = new String(cArr).intern();
            toCharArray = "3Aj^F\u001eDl\u0003)!Hn\u0002b\u0006fh\tA\u0013Ny\u001fu\u000b\u0003]2L6k?'n\u0006EE\u001df\u0011~E163Ci%S4\u0015".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[15] = new String(cArr).intern();
            toCharArray = "\"oF4A@zd\u0004o:@l\u0013T:l<1i\u0016\u0015O9S".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[16] = new String(cArr).intern();
            toCharArray = "Vel\u0003o?Ln".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[17] = new String(cArr).intern();
            toCharArray = "V~E16?Ln".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[18] = new String(cArr).intern();
            toCharArray = "!eL]6".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[19] = new String(cArr).intern();
            toCharArray = "Vfh\t@\u0017Ch\u0002f\u0006B\u007f".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[20] = new String(cArr).intern();
            toCharArray = "?Ln^W0hZ9S:e@1D!eL".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[21] = new String(cArr).intern();
            toCharArray = "!Hn\u0002b\u0006fh\tA\u0013Ny\u001fu\u000b\u0003]2L6k?'n\u0006EE\u001df\u0011~E163CiHE;y".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[22] = new String(cArr).intern();
            toCharArray = "3Aj^F\u001eDl\u0003)!Hn\u0002b\u0006fh\tA\u0013Ny\u001fu\u000b\u0003]2L6k?\u0007n\u0006EL#D;d".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[23] = new String(cArr).intern();
            toCharArray = "\"oF4A@zd\u0004o:@l\u0013T:l<1i\u0016\u0015O9S".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = 114;
                        break;
                    case at.g /*1*/:
                        i2 = 45;
                        break;
                    case at.i /*2*/:
                        i2 = 13;
                        break;
                    case at.o /*3*/:
                        i2 = 112;
                        break;
                    default:
                        i2 = 7;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[24] = new String(cArr).intern();
            z = strArr;
            PREFIX = SHA1.class.getName();
        }
    }

    public class PBKDF2WithHmacSHA18BIT extends BasePBKDF2WithHmacSHA1 {
        private static final String z;

        static {
            char[] toCharArray = "R`\u001a_~0u8oPJO0xkJc`ZVf\u001a3rL".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 2;
                        break;
                    case at.g /*1*/:
                        i2 = 34;
                        break;
                    case at.i /*2*/:
                        i2 = 81;
                        break;
                    case at.o /*3*/:
                        i2 = 27;
                        break;
                    default:
                        i2 = 56;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public PBKDF2WithHmacSHA18BIT() {
            super(z, 1);
        }
    }

    public class PBKDF2WithHmacSHA1UTF8 extends BasePBKDF2WithHmacSHA1 {
        private static final String z;

        static {
            char[] toCharArray = "pM-)-\u0012X\u000f\u0019\u0003hb\u0007\u000e8hNW".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 32;
                        break;
                    case at.g /*1*/:
                        i2 = 15;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i2 = arj.Theme_switchStyle;
                        break;
                    default:
                        i2 = arj.Theme_seekBarStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public PBKDF2WithHmacSHA1UTF8() {
            super(z, 5);
        }
    }

    public class SHA1Mac extends BaseMac {
        public SHA1Mac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    private SHA1() {
    }
}
