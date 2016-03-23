package org.spongycastle.jcajce.provider.symmetric;

import com.whatsapp.arj;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.digest.BCMessageDigest;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.v;
import org.whispersystems.at;

public final class AES {
    public static boolean a;

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        private static final String[] z;

        static {
            int i;
            String[] strArr = new String[2];
            char[] toCharArray = "\u000e*?S+05pR*%!?a2'*mI*((OA,!(zT;2\u0016oE=`#pR~\u0001\u0000L\u0000.!7~M;4 m\u00009%+zR?4,pNp".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i = 64;
                        break;
                    case at.g /*1*/:
                        i = 69;
                        break;
                    case at.i /*2*/:
                        i = 31;
                        break;
                    case at.o /*3*/:
                        i = 32;
                        break;
                    default:
                        i = 94;
                        break;
                }
                cArr[i2] = (char) (i ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "\u0001\u0000L".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i = 64;
                        break;
                    case at.g /*1*/:
                        i = 69;
                        break;
                    case at.i /*2*/:
                        i = 31;
                        break;
                    case at.o /*3*/:
                        i = 32;
                        break;
                    default:
                        i = 94;
                        break;
                }
                cArr[length] = (char) (i ^ c);
            }
            strArr[1] = new String(cArr).intern();
            z = strArr;
        }

        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException(z[0]);
        }

        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            try {
                if (this.random == null) {
                    this.random = new SecureRandom();
                }
                this.random.nextBytes(bArr);
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance(z[1]);
                    createParametersInstance.init(new IvParameterSpec(bArr));
                    return createParametersInstance;
                } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public class AlgParams extends IvAlgorithmParameters {
        private static final String z;

        static {
            char[] toCharArray = "bS 1\u001au".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 35;
                        break;
                    case at.g /*1*/:
                        i2 = 22;
                        break;
                    case at.i /*2*/:
                        i2 = 115;
                        break;
                    case at.o /*3*/:
                        i2 = 17;
                        break;
                    default:
                        i2 = 83;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        protected String engineToString() {
            return z;
        }
    }

    public class ECB extends BaseBlockCipher {

        class 1 implements BlockCipherProvider {
            public BlockCipher get() {
                return new AESFastEngine();
            }

            1() {
            }
        }

        public ECB() {
            super(new 1());
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "*%\u0017".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i2 = 96;
                        break;
                    case at.i /*2*/:
                        i2 = 68;
                        break;
                    case at.o /*3*/:
                        i2 = 36;
                        break;
                    default:
                        i2 = 83;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGen() {
            super(z, 192, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        public void configure(ConfigurableProvider configurableProvider) {
            boolean z = false;
            boolean z2 = AES.a;
            configurableProvider.addAlgorithm(z[4], PREFIX + z[2]);
            configurableProvider.addAlgorithm(z[3], PREFIX + z[5]);
            configurableProvider.addAlgorithm(z[7], PREFIX + z[0]);
            configurableProvider.addAlgorithm(z[1], PREFIX + z[6]);
            if (z2) {
                if (!BCMessageDigest.a) {
                    z = true;
                }
                BCMessageDigest.a = z;
            }
        }

        static {
            int i;
            int i2;
            String[] strArr = new String[8];
            char[] toCharArray = "xQ^]".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 92;
                        break;
                    case at.g /*1*/:
                        i2 = 20;
                        break;
                    case at.i /*2*/:
                        i2 = 29;
                        break;
                    case at.o /*3*/:
                        i2 = 31;
                        break;
                    default:
                        i2 = 57;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "\u0017qdX\\2qo~M3f3^|\u000f".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 92;
                        break;
                    case at.g /*1*/:
                        i2 = 20;
                        break;
                    case at.i /*2*/:
                        i2 = 29;
                        break;
                    case at.o /*3*/:
                        i2 = 31;
                        break;
                    default:
                        i2 = 57;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "xUqxi=f|rJ".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 92;
                        break;
                    case at.g /*1*/:
                        i2 = 20;
                        break;
                    case at.i /*2*/:
                        i2 = 29;
                        break;
                    case at.o /*3*/:
                        i2 = 31;
                        break;
                    default:
                        i2 = 57;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "\u001dxzpK5`uri=f|r\\(qoX\\2qo~M3f3^|\u000f".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 92;
                        break;
                    case at.g /*1*/:
                        i2 = 20;
                        break;
                    case at.i /*2*/:
                        i2 = 29;
                        break;
                    case at.o /*3*/:
                        i2 = 31;
                        break;
                    default:
                        i2 = 57;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "\u001dxzpK5`uri=f|r\\(qol\u0017\u001dQN".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 92;
                        break;
                    case at.g /*1*/:
                        i2 = 20;
                        break;
                    case at.i /*2*/:
                        i2 = 29;
                        break;
                    case at.o /*3*/:
                        i2 = 31;
                        break;
                    default:
                        i2 = 57;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "xUqxi=f|r~9z".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 92;
                        break;
                    case at.g /*1*/:
                        i2 = 20;
                        break;
                    case at.i /*2*/:
                        i2 = 29;
                        break;
                    case at.o /*3*/:
                        i2 = 31;
                        break;
                    default:
                        i2 = 57;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "x_xf~9z".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 92;
                        break;
                    case at.g /*1*/:
                        i2 = 20;
                        break;
                    case at.i /*2*/:
                        i2 = 29;
                        break;
                    case at.o /*3*/:
                        i2 = 31;
                        break;
                    default:
                        i2 = 57;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[6] = new String(cArr).intern();
            toCharArray = "\u001f}mw\\.:\\Zj".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case v.m /*0*/:
                        i2 = 92;
                        break;
                    case at.g /*1*/:
                        i2 = 20;
                        break;
                    case at.i /*2*/:
                        i2 = 29;
                        break;
                    case at.o /*3*/:
                        i2 = 31;
                        break;
                    default:
                        i2 = 57;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[7] = new String(cArr).intern();
            z = strArr;
            PREFIX = AES.class.getName();
        }
    }

    private AES() {
    }
}
