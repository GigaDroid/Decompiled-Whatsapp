package org.spongycastle.jcajce.provider.symmetric.util;

import com.whatsapp.arj;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.whispersystems.at;

public interface PBE {
    public static final int MD5 = 0;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int SHA1 = 1;
    public static final int SHA256 = 4;

    public class Util {
        private static final String[] z;

        static {
            int i;
            String[] strArr = new String[PBE.PKCS5S2_UTF8];
            char[] toCharArray = "Cb\u0000a\u001bl'5G~]f\u0017dVhs\u0000w\u001b~w\u0000f\u001bzn\u0011m\u001bl'5G~-l\u0000|\u0015".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = PBE.MD5; length > i; i += PBE.SHA1) {
                int i2;
                char c = cArr[i];
                switch (i % PBE.PKCS5S2_UTF8) {
                    case PBE.MD5 /*0*/:
                        i2 = 13;
                        break;
                    case PBE.SHA1 /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i2 = PBE.PKCS5S2_UTF8;
                        break;
                    default:
                        i2 = 59;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[PBE.MD5] = new String(cArr).intern();
            toCharArray = "Cb\u0000a\u001bl'5G~]f\u0017dVhs\u0000w\u001b~w\u0000f\u001bzn\u0011m\u001bl'5G~-l\u0000|\u0015".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = PBE.MD5; length > i; i += PBE.SHA1) {
                char c2 = cArr[i];
                switch (i % PBE.PKCS5S2_UTF8) {
                    case PBE.MD5 /*0*/:
                        i2 = 13;
                        break;
                    case PBE.SHA1 /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i2 = PBE.PKCS5S2_UTF8;
                        break;
                    default:
                        i2 = 59;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[PBE.SHA1] = new String(cArr).intern();
            toCharArray = "Cb\u0000a\u001bl'5G~]f\u0017dVhs\u0000w\u001b~w\u0000f\u001bzn\u0011m\u001bl'5G~-l\u0000|\u0015".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = PBE.MD5; length > i; i += PBE.SHA1) {
                c2 = cArr[i];
                switch (i % PBE.PKCS5S2_UTF8) {
                    case PBE.MD5 /*0*/:
                        i2 = 13;
                        break;
                    case PBE.SHA1 /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i2 = PBE.PKCS5S2_UTF8;
                        break;
                    default:
                        i2 = 59;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "xi\u000ekTziEaRjb\u0016q\u001b~d\r`Vh'\u0003jI-W'@\u001b]L&V\u000e^5E`Unu\u001cuOdh\u000b+".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = PBE.MD5; length > i; i += PBE.SHA1) {
                c2 = cArr[i];
                switch (i % PBE.PKCS5S2_UTF8) {
                    case PBE.MD5 /*0*/:
                        i2 = 13;
                        break;
                    case PBE.SHA1 /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i2 = PBE.PKCS5S2_UTF8;
                        break;
                    default:
                        i2 = 59;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "xi\u000ekTziEqB}bEvXeb\b`\u001bkh\u0017%kOBE`Unu\u001cuOdh\u000b+".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = PBE.MD5; length2 > length; length += PBE.SHA1) {
                c = cArr[length];
                switch (length % PBE.PKCS5S2_UTF8) {
                    case PBE.MD5 /*0*/:
                        i2 = 13;
                        break;
                    case PBE.SHA1 /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i2 = PBE.PKCS5S2_UTF8;
                        break;
                    default:
                        i2 = 59;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[PBE.SHA256] = new String(cArr).intern();
            z = strArr;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static org.spongycastle.crypto.CipherParameters makePBEParameters(org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey r6, java.security.spec.AlgorithmParameterSpec r7, java.lang.String r8) {
            /*
            r3 = 0;
            r4 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
            if (r7 == 0) goto L_0x0009;
        L_0x0005:
            r0 = r7 instanceof javax.crypto.spec.PBEParameterSpec;	 Catch:{ IllegalStateException -> 0x0014 }
            if (r0 != 0) goto L_0x0016;
        L_0x0009:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x0014 }
            r1 = z;	 Catch:{ IllegalStateException -> 0x0014 }
            r2 = 0;
            r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0014 }
            r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0014 }
            throw r0;	 Catch:{ IllegalStateException -> 0x0014 }
        L_0x0014:
            r0 = move-exception;
            throw r0;
        L_0x0016:
            r7 = (javax.crypto.spec.PBEParameterSpec) r7;
            r0 = r6.getType();
            r1 = r6.getDigest();
            r2 = makePBEGenerator(r0, r1);
            r0 = r6.getEncoded();
            r1 = r6.shouldTryWrongPKCS12();
            if (r1 == 0) goto L_0x0031;
        L_0x002e:
            r0 = 2;
            r0 = new byte[r0];
        L_0x0031:
            r1 = r7.getSalt();
            r5 = r7.getIterationCount();
            r2.init(r0, r1, r5);
            r1 = r6.getIvSize();
            if (r1 == 0) goto L_0x0050;
        L_0x0042:
            r1 = r6.getKeySize();
            r5 = r6.getIvSize();
            r1 = r2.generateDerivedParameters(r1, r5);
            if (r4 == 0) goto L_0x0058;
        L_0x0050:
            r1 = r6.getKeySize();
            r1 = r2.generateDerivedParameters(r1);
        L_0x0058:
            r2 = r3;
        L_0x0059:
            r5 = r0.length;
            if (r2 == r5) goto L_0x0062;
        L_0x005c:
            r0[r2] = r3;
            r2 = r2 + 1;
            if (r4 == 0) goto L_0x0059;
        L_0x0062:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey, java.security.spec.AlgorithmParameterSpec, java.lang.String):org.spongycastle.crypto.CipherParameters");
        }

        private static byte[] convertPassword(int i, PBEKeySpec pBEKeySpec) {
            if (i == PBE.PKCS5S2_UTF8) {
                byte[] PKCS5PasswordToUTF8Bytes = PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(pBEKeySpec.getPassword());
                if (BaseKeyGenerator.a == 0) {
                    return PKCS5PasswordToUTF8Bytes;
                }
            }
            return PBEParametersGenerator.PKCS5PasswordToBytes(pBEKeySpec.getPassword());
        }

        public static CipherParameters makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            int i = BaseKeyGenerator.a;
            if (algorithmParameterSpec != null) {
                try {
                    if (algorithmParameterSpec instanceof PBEParameterSpec) {
                        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                        PBEParametersGenerator makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
                        byte[] encoded = bCPBEKey.getEncoded();
                        makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                        CipherParameters generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(bCPBEKey.getKeySize());
                        int i2 = PBE.MD5;
                        while (i2 != encoded.length) {
                            encoded[i2] = (byte) 0;
                            i2 += PBE.SHA1;
                            if (i != 0) {
                                break;
                            }
                        }
                        return generateDerivedMacParameters;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(z[2]);
        }

        public static CipherParameters makePBEMacParameters(SecretKey secretKey, int i, int i2, int i3, PBEParameterSpec pBEParameterSpec) {
            int i4 = BaseKeyGenerator.a;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i, i2);
            byte[] encoded = secretKey.getEncoded();
            makePBEGenerator.init(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i3);
            int i5 = PBE.MD5;
            while (i5 != encoded.length) {
                encoded[i5] = (byte) 0;
                i5 += PBE.SHA1;
                if (i4 != 0) {
                    break;
                }
            }
            return generateDerivedMacParameters;
        }

        public static CipherParameters makePBEMacParameters(PBEKeySpec pBEKeySpec, int i, int i2, int i3) {
            int i4 = BaseKeyGenerator.a;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i, i2);
            byte[] convertPassword = convertPassword(i, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            CipherParameters generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i3);
            int i5 = PBE.MD5;
            while (i5 != convertPassword.length) {
                convertPassword[i5] = (byte) 0;
                i5 += PBE.SHA1;
                if (i4 != 0) {
                    break;
                }
            }
            return generateDerivedMacParameters;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static org.spongycastle.crypto.CipherParameters makePBEParameters(javax.crypto.spec.PBEKeySpec r6, int r7, int r8, int r9, int r10) {
            /*
            r2 = 0;
            r3 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
            r1 = makePBEGenerator(r7, r8);
            r4 = convertPassword(r7, r6);
            r0 = r6.getSalt();
            r5 = r6.getIterationCount();
            r1.init(r4, r0, r5);
            if (r10 == 0) goto L_0x001e;
        L_0x0018:
            r0 = r1.generateDerivedParameters(r9, r10);
            if (r3 == 0) goto L_0x0022;
        L_0x001e:
            r0 = r1.generateDerivedParameters(r9);
        L_0x0022:
            r1 = r2;
        L_0x0023:
            r5 = r4.length;
            if (r1 == r5) goto L_0x002c;
        L_0x0026:
            r4[r1] = r2;
            r1 = r1 + 1;
            if (r3 == 0) goto L_0x0023;
        L_0x002c:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(javax.crypto.spec.PBEKeySpec, int, int, int, int):org.spongycastle.crypto.CipherParameters");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static org.spongycastle.crypto.PBEParametersGenerator makePBEGenerator(int r3, int r4) {
            /*
            r1 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
            r0 = 1;
            if (r3 == r0) goto L_0x0008;
        L_0x0005:
            r0 = 5;
            if (r3 != r0) goto L_0x003d;
        L_0x0008:
            switch(r4) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0024;
                case 2: goto L_0x000b;
                case 3: goto L_0x000b;
                case 4: goto L_0x0030;
                default: goto L_0x000b;
            };
        L_0x000b:
            r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0016 }
            r1 = z;	 Catch:{ IllegalStateException -> 0x0016 }
            r2 = 3;
            r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0016 }
            r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0016 }
            throw r0;	 Catch:{ IllegalStateException -> 0x0016 }
        L_0x0016:
            r0 = move-exception;
            throw r0;
        L_0x0018:
            r0 = new org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
            r2 = new org.spongycastle.crypto.digests.MD5Digest;
            r2.<init>();
            r0.<init>(r2);
            if (r1 == 0) goto L_0x003c;
        L_0x0024:
            r0 = new org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
            r2 = new org.spongycastle.crypto.digests.SHA1Digest;
            r2.<init>();
            r0.<init>(r2);
            if (r1 == 0) goto L_0x003c;
        L_0x0030:
            r0 = new org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
            r2 = new org.spongycastle.crypto.digests.SHA256Digest;
            r2.<init>();
            r0.<init>(r2);
            if (r1 != 0) goto L_0x000b;
        L_0x003c:
            return r0;
        L_0x003d:
            r0 = new java.lang.IllegalStateException;
            r1 = z;
            r2 = 4;
            r1 = r1[r2];
            r0.<init>(r1);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEGenerator(int, int):org.spongycastle.crypto.PBEParametersGenerator");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static org.spongycastle.crypto.CipherParameters makePBEParameters(byte[] r5, int r6, int r7, int r8, int r9, java.security.spec.AlgorithmParameterSpec r10, java.lang.String r11) {
            /*
            r2 = 0;
            r3 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
            if (r10 == 0) goto L_0x0009;
        L_0x0005:
            r0 = r10 instanceof javax.crypto.spec.PBEParameterSpec;	 Catch:{ IllegalStateException -> 0x0014 }
            if (r0 != 0) goto L_0x0016;
        L_0x0009:
            r0 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ IllegalStateException -> 0x0014 }
            r1 = z;	 Catch:{ IllegalStateException -> 0x0014 }
            r2 = 1;
            r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0014 }
            r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0014 }
            throw r0;	 Catch:{ IllegalStateException -> 0x0014 }
        L_0x0014:
            r0 = move-exception;
            throw r0;
        L_0x0016:
            r10 = (javax.crypto.spec.PBEParameterSpec) r10;
            r1 = makePBEGenerator(r6, r7);
            r0 = r10.getSalt();
            r4 = r10.getIterationCount();
            r1.init(r5, r0, r4);
            if (r9 == 0) goto L_0x002f;
        L_0x0029:
            r0 = r1.generateDerivedParameters(r8, r9);
            if (r3 == 0) goto L_0x0033;
        L_0x002f:
            r0 = r1.generateDerivedParameters(r8);
        L_0x0033:
            r1 = r2;
        L_0x0034:
            r4 = r5.length;
            if (r1 == r4) goto L_0x003d;
        L_0x0037:
            r5[r1] = r2;
            r1 = r1 + 1;
            if (r3 == 0) goto L_0x0034;
        L_0x003d:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(byte[], int, int, int, int, java.security.spec.AlgorithmParameterSpec, java.lang.String):org.spongycastle.crypto.CipherParameters");
        }
    }
}
