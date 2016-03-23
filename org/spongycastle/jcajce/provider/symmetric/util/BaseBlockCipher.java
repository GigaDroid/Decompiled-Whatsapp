package org.spongycastle.jcajce.provider.symmetric.util;

import com.whatsapp.arj;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.modes.AEADBlockCipher;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.modes.CFBBlockCipher;
import org.spongycastle.crypto.modes.GCMBlockCipher;
import org.spongycastle.crypto.modes.OFBBlockCipher;
import org.spongycastle.crypto.modes.SICBlockCipher;
import org.spongycastle.crypto.paddings.BlockCipherPadding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.jcajce.provider.digest.BCMessageDigest;
import org.spongycastle.util.Strings;
import org.v;
import org.whispersystems.at;

public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final Class gcmSpecClass;
    private static final String[] z;
    private AEADParameters aeadParams;
    private Class[] availableSpecs;
    private BlockCipher baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    class 1 extends InvalidKeyException {
        final BaseBlockCipher this$0;
        final Exception val$e;

        1(BaseBlockCipher baseBlockCipher, String str, Exception exception) {
            this.this$0 = baseBlockCipher;
            this.val$e = exception;
            super(str);
        }

        public Throwable getCause() {
            return this.val$e;
        }
    }

    interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i);

        String getAlgorithmName();

        int getOutputSize(int i);

        BlockCipher getUnderlyingCipher();

        int getUpdateOutputSize(int i);

        void init(boolean z, CipherParameters cipherParameters);

        int processByte(byte b, byte[] bArr, int i);

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

        void updateAAD(byte[] bArr, int i, int i2);

        boolean wrapOnNoPadding();
    }

    class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private AEADBlockCipher cipher;

        AEADGenericBlockCipher(AEADBlockCipher aEADBlockCipher) {
            this.cipher = aEADBlockCipher;
        }

        public int processByte(byte b, byte[] bArr, int i) {
            return this.cipher.processByte(b, bArr, i);
        }

        static {
            char[] toCharArray = " \u0013\u0001Y\u0007d\u0011\u0005A\u000f>\u001dYy:\u000b65Y\u001b\u001e\u0013\u0010}\u0007)\u0017\u0007L\u0016%\u001c".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 74;
                        break;
                    case at.g /*1*/:
                        i2 = 114;
                        break;
                    case at.i /*2*/:
                        i2 = 119;
                        break;
                    case at.o /*3*/:
                        i2 = 56;
                        break;
                    default:
                        i2 = 127;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            Class access$000 = BaseBlockCipher.access$000(new String(cArr).intern());
            if (access$000 != null) {
                aeadBadTagConstructor = findExceptionConstructor(access$000);
            } else {
                aeadBadTagConstructor = null;
            }
        }

        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        public boolean wrapOnNoPadding() {
            return false;
        }

        public int doFinal(byte[] bArr, int i) {
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                InvalidCipherTextException invalidCipherTextException = e;
                if (aeadBadTagConstructor != null) {
                    BadPaddingException badPaddingException;
                    try {
                        badPaddingException = (BadPaddingException) aeadBadTagConstructor.newInstance(new Object[]{invalidCipherTextException.getMessage()});
                    } catch (Exception e2) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(invalidCipherTextException.getMessage());
            } catch (InvalidCipherTextException e3) {
                throw e3;
            }
        }

        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        public void init(boolean z, CipherParameters cipherParameters) {
            this.cipher.init(z, cipherParameters);
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(new Class[]{String.class});
            } catch (Exception e) {
                return null;
            }
        }

        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        public void updateAAD(byte[] bArr, int i, int i2) {
            this.cipher.processAADBytes(bArr, i, i2);
        }

        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }
    }

    class BufferedGenericBlockCipher implements GenericBlockCipher {
        private static final String z;
        private BufferedBlockCipher cipher;

        static {
            char[] toCharArray = "fh3o\u001fT\t\u0019 \u0002\u0007Z\u0002?\u0006H[\u0003*\u0012\u0007@\u0019o\u0002OLW,\u0003U[\u0012!\u0002\u0007D\u0018+\u0013\t".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 39;
                        break;
                    case at.g /*1*/:
                        i2 = 41;
                        break;
                    case at.i /*2*/:
                        i2 = 119;
                        break;
                    case at.o /*3*/:
                        i2 = 79;
                        break;
                    default:
                        i2 = 118;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException(z);
        }

        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        BufferedGenericBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
        }

        public void init(boolean z, CipherParameters cipherParameters) {
            this.cipher.init(z, cipherParameters);
        }

        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        public int doFinal(byte[] bArr, int i) {
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        public boolean wrapOnNoPadding() {
            return true;
        }

        BufferedGenericBlockCipher(BlockCipher blockCipher) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher);
        }

        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        public int processByte(byte b, byte[] bArr, int i) {
            return this.cipher.processByte(b, bArr, i);
        }

        BufferedGenericBlockCipher(BufferedBlockCipher bufferedBlockCipher) {
            this.cipher = bufferedBlockCipher;
        }

        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }
    }

    protected int engineGetOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    protected void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.cipher.updateAAD(bArr, i, i2);
    }

    protected BaseBlockCipher(BlockCipher blockCipher, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
        this.ivLength = i / 8;
    }

    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i2);
        if (updateOutputSize > 0) {
            byte[] bArr2 = new byte[updateOutputSize];
            int processBytes = this.cipher.processBytes(bArr, i, i2, bArr2, 0);
            if (processBytes == 0) {
                return null;
            }
            if (processBytes == bArr2.length) {
                return bArr2;
            }
            Object obj = new byte[processBytes];
            System.arraycopy(bArr2, 0, obj, 0, processBytes);
            return obj;
        }
        this.cipher.processBytes(bArr, i, i2, null, 0);
        return null;
    }

    protected int engineGetBlockSize() {
        return this.baseEngine.getBlockSize();
    }

    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    protected BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = bufferedBlockCipher.getUnderlyingCipher();
        this.cipher = new BufferedGenericBlockCipher(bufferedBlockCipher);
        this.ivLength = i / 8;
    }

    protected BaseBlockCipher(BlockCipher blockCipher) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    protected BaseBlockCipher(AEADBlockCipher aEADBlockCipher) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.ivLength = this.baseEngine.getBlockSize();
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            if (this.cipher.getUpdateOutputSize(i2) + i3 > bArr2.length) {
                throw new ShortBufferException(z[6]);
            }
            try {
                return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
            } catch (DataLengthException e) {
                throw new IllegalStateException(e.toString());
            }
        } catch (DataLengthException e2) {
            throw e2;
        }
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec;
        int i2 = BaseKeyGenerator.a;
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i3 = 0;
            while (i3 != this.availableSpecs.length) {
                try {
                    if (!(this.availableSpecs[i3] == null && i2 == 0)) {
                        try {
                            parameterSpec = algorithmParameters.getParameterSpec(this.availableSpecs[i3]);
                            break;
                        } catch (Exception e) {
                        }
                    }
                    i3++;
                    if (i2 != 0) {
                        break;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            parameterSpec = algorithmParameterSpec;
            if (parameterSpec == null) {
                try {
                    throw new InvalidAlgorithmParameterException(z[5] + algorithmParameters.toString());
                } catch (Exception e22) {
                    throw e22;
                }
            }
        }
        parameterSpec = null;
        engineInit(i, key, parameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    protected byte[] engineGetIV() {
        try {
            if (this.aeadParams != null) {
                return this.aeadParams.getNonce();
            }
            try {
                return this.ivParam != null ? this.ivParam.getIV() : null;
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.security.AlgorithmParameters engineGetParameters() {
        /*
        r3 = this;
        r2 = 47;
        r0 = r3.engineParams;	 Catch:{ Exception -> 0x001c }
        if (r0 != 0) goto L_0x0019;
    L_0x0006:
        r0 = r3.pbeSpec;	 Catch:{ Exception -> 0x001c }
        if (r0 == 0) goto L_0x0021;
    L_0x000a:
        r0 = r3.pbeAlgorithm;	 Catch:{ Exception -> 0x001e }
        r0 = r3.createParametersInstance(r0);	 Catch:{ Exception -> 0x001e }
        r3.engineParams = r0;	 Catch:{ Exception -> 0x001e }
        r0 = r3.engineParams;	 Catch:{ Exception -> 0x001e }
        r1 = r3.pbeSpec;	 Catch:{ Exception -> 0x001e }
        r0.init(r1);	 Catch:{ Exception -> 0x001e }
    L_0x0019:
        r0 = r3.engineParams;
    L_0x001b:
        return r0;
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r0 = move-exception;
        r0 = 0;
        goto L_0x001b;
    L_0x0021:
        r0 = r3.ivParam;
        if (r0 == 0) goto L_0x0053;
    L_0x0025:
        r0 = r3.cipher;
        r0 = r0.getUnderlyingCipher();
        r0 = r0.getAlgorithmName();
        r1 = r0.indexOf(r2);
        if (r1 < 0) goto L_0x003e;
    L_0x0035:
        r1 = 0;
        r2 = r0.indexOf(r2);
        r0 = r0.substring(r1, r2);
    L_0x003e:
        r0 = r3.createParametersInstance(r0);	 Catch:{ Exception -> 0x0065 }
        r3.engineParams = r0;	 Catch:{ Exception -> 0x0065 }
        r0 = r3.engineParams;	 Catch:{ Exception -> 0x0065 }
        r1 = r3.ivParam;	 Catch:{ Exception -> 0x0065 }
        r1 = r1.getIV();	 Catch:{ Exception -> 0x0065 }
        r0.init(r1);	 Catch:{ Exception -> 0x0065 }
        r0 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;	 Catch:{ Exception -> 0x0070 }
        if (r0 == 0) goto L_0x0019;
    L_0x0053:
        r0 = r3.aeadParams;	 Catch:{ Exception -> 0x0063 }
        if (r0 == 0) goto L_0x0019;
    L_0x0057:
        r0 = new java.lang.UnsupportedOperationException;	 Catch:{ Exception -> 0x0063 }
        r1 = z;	 Catch:{ Exception -> 0x0063 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ Exception -> 0x0063 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0063 }
        throw r0;	 Catch:{ Exception -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0063 }
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineGetParameters():java.security.AlgorithmParameters");
    }

    private boolean isAEADModeName(String str) {
        try {
            if (!z[2].equals(str)) {
                if (!z[0].equals(str)) {
                    try {
                        if (!z[3].equals(str)) {
                            try {
                                if (!z[1].equals(str)) {
                                    return false;
                                }
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        }
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                }
            }
            return true;
        } catch (RuntimeException e22) {
            throw e22;
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    private CipherParameters adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            CipherParameters parameters = ((ParametersWithIV) cipherParameters).getParameters();
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                return cipherParameters;
            }
            this.ivParam = new ParametersWithIV(parameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
            cipherParameters = this.ivParam;
            try {
                if (BaseKeyGenerator.a == 0) {
                    return cipherParameters;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            return cipherParameters;
        }
        this.ivParam = new ParametersWithIV(cipherParameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
        return this.ivParam;
    }

    protected BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    protected void engineSetMode(String str) {
        int i = BaseKeyGenerator.a;
        try {
            this.modeName = Strings.toUpperCase(str);
            if (this.modeName.equals(z[15])) {
                this.ivLength = 0;
                this.cipher = new BufferedGenericBlockCipher(this.baseEngine);
                if (i == 0) {
                    return;
                }
            }
            try {
                if (this.modeName.equals(z[20])) {
                    try {
                        this.ivLength = this.baseEngine.getBlockSize();
                        this.cipher = new BufferedGenericBlockCipher(new CBCBlockCipher(this.baseEngine));
                        if (i == 0) {
                            return;
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
                try {
                    if (this.modeName.startsWith(z[17])) {
                        this.ivLength = this.baseEngine.getBlockSize();
                        if (this.modeName.length() != 3) {
                            try {
                                this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                                if (i == 0) {
                                    return;
                                }
                            } catch (RuntimeException e2) {
                                throw e2;
                            } catch (RuntimeException e22) {
                                throw e22;
                            }
                        }
                        this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(this.baseEngine, this.baseEngine.getBlockSize() * 8));
                        if (i == 0) {
                            return;
                        }
                    }
                    try {
                        if (this.modeName.startsWith(z[19])) {
                            this.ivLength = this.baseEngine.getBlockSize();
                            if (this.modeName.length() != 3) {
                                try {
                                    this.cipher = new BufferedGenericBlockCipher(new CFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                                    if (i == 0) {
                                        return;
                                    }
                                } catch (RuntimeException e222) {
                                    throw e222;
                                } catch (RuntimeException e2222) {
                                    throw e2222;
                                }
                            }
                            this.cipher = new BufferedGenericBlockCipher(new CFBBlockCipher(this.baseEngine, this.baseEngine.getBlockSize() * 8));
                            if (i == 0) {
                                return;
                            }
                        }
                        try {
                            if (this.modeName.startsWith(z[16])) {
                                try {
                                    this.ivLength = this.baseEngine.getBlockSize();
                                    this.fixedIv = false;
                                    this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new SICBlockCipher(this.baseEngine)));
                                    if (i == 0) {
                                        return;
                                    }
                                } catch (RuntimeException e22222) {
                                    throw e22222;
                                }
                            }
                        } catch (RuntimeException e222222) {
                            throw e222222;
                        }
                        try {
                            if (this.modeName.startsWith(z[14])) {
                                try {
                                    this.ivLength = this.baseEngine.getBlockSize();
                                    this.cipher = new AEADGenericBlockCipher(new GCMBlockCipher(this.baseEngine));
                                    if (i == 0) {
                                        return;
                                    }
                                } catch (RuntimeException e2222222) {
                                    throw e2222222;
                                }
                            }
                            throw new NoSuchAlgorithmException(z[18] + str);
                        } catch (RuntimeException e22222222) {
                            throw e22222222;
                        }
                    } catch (RuntimeException e222222222) {
                        throw e222222222;
                    }
                } catch (RuntimeException e2222222222) {
                    throw e2222222222;
                }
            } catch (RuntimeException e22222222222) {
                throw e22222222222;
            }
        } catch (RuntimeException e222222222222) {
            throw e222222222222;
        } catch (RuntimeException e2222222222222) {
            throw e2222222222222;
        }
    }

    private static Class lookup(String str) {
        try {
            return BaseBlockCipher.class.getClassLoader().loadClass(str);
        } catch (Exception e) {
            return null;
        }
    }

    protected void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        int processBytes;
        Object obj = new byte[engineGetOutputSize(i2)];
        if (i2 != 0) {
            processBytes = this.cipher.processBytes(bArr, i, i2, obj, 0);
        } else {
            processBytes = 0;
        }
        try {
            int doFinal = this.cipher.doFinal(obj, processBytes) + processBytes;
            try {
                if (doFinal == obj.length) {
                    return obj;
                }
                Object obj2 = new byte[doFinal];
                System.arraycopy(obj, 0, obj2, 0, doFinal);
                return obj2;
            } catch (DataLengthException e) {
                throw e;
            }
        } catch (DataLengthException e2) {
            throw new IllegalBlockSizeException(e2.getMessage());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void engineInit(int r11, java.security.Key r12, java.security.spec.AlgorithmParameterSpec r13, java.security.SecureRandom r14) {
        /*
        r10 = this;
        r9 = 1;
        r8 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
        r1 = 0;
        r10.pbeSpec = r1;	 Catch:{ Exception -> 0x003e }
        r1 = 0;
        r10.pbeAlgorithm = r1;	 Catch:{ Exception -> 0x003e }
        r1 = 0;
        r10.engineParams = r1;	 Catch:{ Exception -> 0x003e }
        r1 = 0;
        r10.aeadParams = r1;	 Catch:{ Exception -> 0x003e }
        r1 = r12 instanceof javax.crypto.SecretKey;	 Catch:{ Exception -> 0x003e }
        if (r1 != 0) goto L_0x0040;
    L_0x0013:
        r1 = new java.security.InvalidKeyException;	 Catch:{ Exception -> 0x003e }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x003e }
        r2.<init>();	 Catch:{ Exception -> 0x003e }
        r3 = z;	 Catch:{ Exception -> 0x003e }
        r4 = 39;
        r3 = r3[r4];	 Catch:{ Exception -> 0x003e }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x003e }
        r3 = r12.getAlgorithm();	 Catch:{ Exception -> 0x003e }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x003e }
        r3 = z;	 Catch:{ Exception -> 0x003e }
        r4 = 38;
        r3 = r3[r4];	 Catch:{ Exception -> 0x003e }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x003e }
        r2 = r2.toString();	 Catch:{ Exception -> 0x003e }
        r1.<init>(r2);	 Catch:{ Exception -> 0x003e }
        throw r1;	 Catch:{ Exception -> 0x003e }
    L_0x003e:
        r1 = move-exception;
        throw r1;
    L_0x0040:
        if (r13 != 0) goto L_0x0064;
    L_0x0042:
        r1 = r10.baseEngine;	 Catch:{ Exception -> 0x0062 }
        r1 = r1.getAlgorithmName();	 Catch:{ Exception -> 0x0062 }
        r2 = z;	 Catch:{ Exception -> 0x0062 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0062 }
        r1 = r1.startsWith(r2);	 Catch:{ Exception -> 0x0062 }
        if (r1 == 0) goto L_0x0064;
    L_0x0054:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x0060 }
        r2 = z;	 Catch:{ Exception -> 0x0060 }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0060 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0060 }
        throw r1;	 Catch:{ Exception -> 0x0060 }
    L_0x0060:
        r1 = move-exception;
        throw r1;
    L_0x0062:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0060 }
    L_0x0064:
        r1 = r12 instanceof org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
        if (r1 == 0) goto L_0x00b6;
    L_0x0068:
        r1 = r12;
        r1 = (org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey) r1;
        r2 = r1.getAlgorithm();
        r10.pbeAlgorithm = r2;
        r2 = r1.getParam();
        if (r2 == 0) goto L_0x0081;
    L_0x0077:
        r2 = r1.getParam();
        r2 = r10.adjustParameters(r13, r2);
        if (r8 == 0) goto L_0x00aa;
    L_0x0081:
        r2 = r13 instanceof javax.crypto.spec.PBEParameterSpec;	 Catch:{ Exception -> 0x00a8 }
        if (r2 == 0) goto L_0x009a;
    L_0x0085:
        r2 = r13;
        r2 = (javax.crypto.spec.PBEParameterSpec) r2;
        r10.pbeSpec = r2;
        r2 = r10.cipher;
        r2 = r2.getUnderlyingCipher();
        r2 = r2.getAlgorithmName();
        r2 = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r1, r13, r2);
        if (r8 == 0) goto L_0x00aa;
    L_0x009a:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x00a6 }
        r2 = z;	 Catch:{ Exception -> 0x00a6 }
        r3 = 27;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00a6 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00a6 }
        throw r1;	 Catch:{ Exception -> 0x00a6 }
    L_0x00a6:
        r1 = move-exception;
        throw r1;
    L_0x00a8:
        r1 = move-exception;
        throw r1;
    L_0x00aa:
        r1 = r2 instanceof org.spongycastle.crypto.params.ParametersWithIV;	 Catch:{ Exception -> 0x00ff }
        if (r1 == 0) goto L_0x00b4;
    L_0x00ae:
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x00ff }
        r1 = r0;
        r10.ivParam = r1;	 Catch:{ Exception -> 0x00ff }
    L_0x00b4:
        if (r8 == 0) goto L_0x0317;
    L_0x00b6:
        r1 = r12 instanceof javax.crypto.interfaces.PBEKey;	 Catch:{ Exception -> 0x0101 }
        if (r1 == 0) goto L_0x00e8;
    L_0x00ba:
        r1 = r12;
        r1 = (javax.crypto.interfaces.PBEKey) r1;
        r2 = r13;
        r2 = (javax.crypto.spec.PBEParameterSpec) r2;
        r10.pbeSpec = r2;
        r1 = r1.getEncoded();
        r2 = r10.scheme;
        r3 = r10.digest;
        r4 = r10.keySizeInBits;
        r5 = r10.ivLength;
        r5 = r5 * 8;
        r6 = r10.pbeSpec;
        r7 = r10.cipher;
        r7 = r7.getAlgorithmName();
        r2 = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r1, r2, r3, r4, r5, r6, r7);
        r1 = r2 instanceof org.spongycastle.crypto.params.ParametersWithIV;	 Catch:{ Exception -> 0x0103 }
        if (r1 == 0) goto L_0x00e6;
    L_0x00e0:
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x0103 }
        r1 = r0;
        r10.ivParam = r1;	 Catch:{ Exception -> 0x0103 }
    L_0x00e6:
        if (r8 == 0) goto L_0x0317;
    L_0x00e8:
        r1 = r10.scheme;	 Catch:{ Exception -> 0x0105 }
        if (r1 == r9) goto L_0x00f1;
    L_0x00ec:
        r1 = r10.scheme;	 Catch:{ Exception -> 0x0107 }
        r2 = 5;
        if (r1 != r2) goto L_0x0109;
    L_0x00f1:
        r1 = new java.security.InvalidKeyException;	 Catch:{ Exception -> 0x00fd }
        r2 = z;	 Catch:{ Exception -> 0x00fd }
        r3 = 25;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00fd }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00fd }
        throw r1;	 Catch:{ Exception -> 0x00fd }
    L_0x00fd:
        r1 = move-exception;
        throw r1;
    L_0x00ff:
        r1 = move-exception;
        throw r1;
    L_0x0101:
        r1 = move-exception;
        throw r1;
    L_0x0103:
        r1 = move-exception;
        throw r1;
    L_0x0105:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0107 }
    L_0x0107:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x00fd }
    L_0x0109:
        r2 = new org.spongycastle.crypto.params.KeyParameter;
        r1 = r12.getEncoded();
        r2.<init>(r1);
        r1 = r2;
    L_0x0113:
        r2 = r13 instanceof javax.crypto.spec.IvParameterSpec;	 Catch:{ Exception -> 0x015b }
        if (r2 == 0) goto L_0x01ad;
    L_0x0117:
        r2 = r10.ivLength;	 Catch:{ Exception -> 0x015b }
        if (r2 == 0) goto L_0x0189;
    L_0x011b:
        r13 = (javax.crypto.spec.IvParameterSpec) r13;
        r2 = r13.getIV();	 Catch:{ Exception -> 0x015d }
        r2 = r2.length;	 Catch:{ Exception -> 0x015d }
        r3 = r10.ivLength;	 Catch:{ Exception -> 0x015d }
        if (r2 == r3) goto L_0x0161;
    L_0x0126:
        r2 = r10.cipher;	 Catch:{ Exception -> 0x015d }
        r2 = r2 instanceof org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher;	 Catch:{ Exception -> 0x015d }
        if (r2 != 0) goto L_0x0161;
    L_0x012c:
        r2 = r10.fixedIv;	 Catch:{ Exception -> 0x015f }
        if (r2 == 0) goto L_0x0161;
    L_0x0130:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x0159 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0159 }
        r2.<init>();	 Catch:{ Exception -> 0x0159 }
        r3 = z;	 Catch:{ Exception -> 0x0159 }
        r4 = 34;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0159 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0159 }
        r3 = r10.ivLength;	 Catch:{ Exception -> 0x0159 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0159 }
        r3 = z;	 Catch:{ Exception -> 0x0159 }
        r4 = 37;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0159 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0159 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0159 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0159 }
        throw r1;	 Catch:{ Exception -> 0x0159 }
    L_0x0159:
        r1 = move-exception;
        throw r1;
    L_0x015b:
        r1 = move-exception;
        throw r1;
    L_0x015d:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x015f }
    L_0x015f:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0159 }
    L_0x0161:
        r2 = r1 instanceof org.spongycastle.crypto.params.ParametersWithIV;
        if (r2 == 0) goto L_0x0177;
    L_0x0165:
        r2 = new org.spongycastle.crypto.params.ParametersWithIV;
        r1 = (org.spongycastle.crypto.params.ParametersWithIV) r1;
        r1 = r1.getParameters();
        r3 = r13.getIV();
        r2.<init>(r1, r3);
        if (r8 == 0) goto L_0x0180;
    L_0x0176:
        r1 = r2;
    L_0x0177:
        r2 = new org.spongycastle.crypto.params.ParametersWithIV;
        r3 = r13.getIV();
        r2.<init>(r1, r3);
    L_0x0180:
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x01a9 }
        r1 = r0;
        r10.ivParam = r1;	 Catch:{ Exception -> 0x01a9 }
        if (r8 == 0) goto L_0x0314;
    L_0x0188:
        r1 = r2;
    L_0x0189:
        r2 = r10.modeName;	 Catch:{ Exception -> 0x01a9 }
        if (r2 == 0) goto L_0x022c;
    L_0x018d:
        r2 = r10.modeName;	 Catch:{ Exception -> 0x01ab }
        r3 = z;	 Catch:{ Exception -> 0x01ab }
        r4 = 28;
        r3 = r3[r4];	 Catch:{ Exception -> 0x01ab }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x01ab }
        if (r2 == 0) goto L_0x022c;
    L_0x019b:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x01a7 }
        r2 = z;	 Catch:{ Exception -> 0x01a7 }
        r3 = 35;
        r2 = r2[r3];	 Catch:{ Exception -> 0x01a7 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x01a7 }
        throw r1;	 Catch:{ Exception -> 0x01a7 }
    L_0x01a7:
        r1 = move-exception;
        throw r1;
    L_0x01a9:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x01ab }
    L_0x01ab:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x01a7 }
    L_0x01ad:
        r2 = gcmSpecClass;	 Catch:{ Exception -> 0x01d5 }
        if (r2 == 0) goto L_0x0289;
    L_0x01b1:
        r2 = gcmSpecClass;	 Catch:{ Exception -> 0x01d5 }
        r2 = r2.isInstance(r13);	 Catch:{ Exception -> 0x01d5 }
        if (r2 == 0) goto L_0x0289;
    L_0x01b9:
        r2 = r10.modeName;	 Catch:{ Exception -> 0x01d7 }
        r2 = r10.isAEADModeName(r2);	 Catch:{ Exception -> 0x01d7 }
        if (r2 != 0) goto L_0x01db;
    L_0x01c1:
        r2 = r10.cipher;	 Catch:{ Exception -> 0x01d9 }
        r2 = r2 instanceof org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher;	 Catch:{ Exception -> 0x01d9 }
        if (r2 != 0) goto L_0x01db;
    L_0x01c7:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x01d3 }
        r2 = z;	 Catch:{ Exception -> 0x01d3 }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ Exception -> 0x01d3 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x01d3 }
        throw r1;	 Catch:{ Exception -> 0x01d3 }
    L_0x01d3:
        r1 = move-exception;
        throw r1;
    L_0x01d5:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x01d7 }
    L_0x01d7:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x01d9 }
    L_0x01d9:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x01d3 }
    L_0x01db:
        r2 = gcmSpecClass;	 Catch:{ Exception -> 0x027c }
        r3 = z;	 Catch:{ Exception -> 0x027c }
        r4 = 29;
        r3 = r3[r4];	 Catch:{ Exception -> 0x027c }
        r4 = 0;
        r4 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x027c }
        r4 = r2.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x027c }
        r2 = gcmSpecClass;	 Catch:{ Exception -> 0x027c }
        r3 = z;	 Catch:{ Exception -> 0x027c }
        r5 = 24;
        r3 = r3[r5];	 Catch:{ Exception -> 0x027c }
        r5 = 0;
        r5 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x027c }
        r5 = r2.getDeclaredMethod(r3, r5);	 Catch:{ Exception -> 0x027c }
        r2 = r1 instanceof org.spongycastle.crypto.params.ParametersWithIV;	 Catch:{ Exception -> 0x027c }
        if (r2 == 0) goto L_0x0209;
    L_0x01fd:
        r0 = r1;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x027c }
        r2 = r0;
        r2 = r2.getParameters();	 Catch:{ Exception -> 0x027c }
        r2 = (org.spongycastle.crypto.params.KeyParameter) r2;	 Catch:{ Exception -> 0x027c }
        if (r8 == 0) goto L_0x0311;
    L_0x0209:
        r1 = (org.spongycastle.crypto.params.KeyParameter) r1;	 Catch:{ Exception -> 0x027c }
        r3 = r1;
    L_0x020c:
        r2 = new org.spongycastle.crypto.params.AEADParameters;	 Catch:{ Exception -> 0x027c }
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x027c }
        r1 = r4.invoke(r13, r1);	 Catch:{ Exception -> 0x027c }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x027c }
        r4 = r1.intValue();	 Catch:{ Exception -> 0x027c }
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x027c }
        r1 = r5.invoke(r13, r1);	 Catch:{ Exception -> 0x027c }
        r1 = (byte[]) r1;	 Catch:{ Exception -> 0x027c }
        r1 = (byte[]) r1;	 Catch:{ Exception -> 0x027c }
        r2.<init>(r3, r4, r1);	 Catch:{ Exception -> 0x027c }
        r10.aeadParams = r2;	 Catch:{ Exception -> 0x027c }
        r1 = r2;
    L_0x022c:
        r2 = r10.ivLength;	 Catch:{ Exception -> 0x029f }
        if (r2 == 0) goto L_0x02a5;
    L_0x0230:
        r2 = r1 instanceof org.spongycastle.crypto.params.ParametersWithIV;	 Catch:{ Exception -> 0x029f }
        if (r2 != 0) goto L_0x02a5;
    L_0x0234:
        r2 = r1 instanceof org.spongycastle.crypto.params.AEADParameters;	 Catch:{ Exception -> 0x02a1 }
        if (r2 != 0) goto L_0x02a5;
    L_0x0238:
        if (r14 != 0) goto L_0x030e;
    L_0x023a:
        r2 = new java.security.SecureRandom;
        r2.<init>();
    L_0x023f:
        if (r11 == r9) goto L_0x0244;
    L_0x0241:
        r3 = 3;
        if (r11 != r3) goto L_0x030b;
    L_0x0244:
        r3 = r10.ivLength;
        r3 = new byte[r3];
        r2.nextBytes(r3);
        r2 = new org.spongycastle.crypto.params.ParametersWithIV;
        r2.<init>(r1, r3);
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x02a3 }
        r1 = r0;
        r10.ivParam = r1;	 Catch:{ Exception -> 0x02a3 }
        if (r8 == 0) goto L_0x02a6;
    L_0x0258:
        r1 = r10.cipher;	 Catch:{ Exception -> 0x02a3 }
        r1 = r1.getUnderlyingCipher();	 Catch:{ Exception -> 0x02a3 }
        r1 = r1.getAlgorithmName();	 Catch:{ Exception -> 0x02a3 }
        r3 = z;	 Catch:{ Exception -> 0x02a3 }
        r4 = 26;
        r3 = r3[r4];	 Catch:{ Exception -> 0x02a3 }
        r1 = r1.indexOf(r3);	 Catch:{ Exception -> 0x02a3 }
        if (r1 >= 0) goto L_0x02a6;
    L_0x026e:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x027a }
        r2 = z;	 Catch:{ Exception -> 0x027a }
        r3 = 36;
        r2 = r2[r3];	 Catch:{ Exception -> 0x027a }
        r1.<init>(r2);	 Catch:{ Exception -> 0x027a }
        throw r1;	 Catch:{ Exception -> 0x027a }
    L_0x027a:
        r1 = move-exception;
        throw r1;
    L_0x027c:
        r1 = move-exception;
        r1 = new java.security.InvalidAlgorithmParameterException;
        r2 = z;
        r3 = 33;
        r2 = r2[r3];
        r1.<init>(r2);
        throw r1;
    L_0x0289:
        if (r13 == 0) goto L_0x022c;
    L_0x028b:
        r2 = r13 instanceof javax.crypto.spec.PBEParameterSpec;	 Catch:{ Exception -> 0x029d }
        if (r2 != 0) goto L_0x022c;
    L_0x028f:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x029b }
        r2 = z;	 Catch:{ Exception -> 0x029b }
        r3 = 32;
        r2 = r2[r3];	 Catch:{ Exception -> 0x029b }
        r1.<init>(r2);	 Catch:{ Exception -> 0x029b }
        throw r1;	 Catch:{ Exception -> 0x029b }
    L_0x029b:
        r1 = move-exception;
        throw r1;
    L_0x029d:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x029b }
    L_0x029f:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x02a1 }
    L_0x02a1:
        r1 = move-exception;
        throw r1;
    L_0x02a3:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x027a }
    L_0x02a5:
        r2 = r1;
    L_0x02a6:
        if (r14 == 0) goto L_0x0309;
    L_0x02a8:
        r1 = r10.padded;	 Catch:{ Exception -> 0x02e8 }
        if (r1 == 0) goto L_0x0309;
    L_0x02ac:
        r1 = new org.spongycastle.crypto.params.ParametersWithRandom;
        r1.<init>(r2, r14);
    L_0x02b1:
        switch(r11) {
            case 1: goto L_0x02ea;
            case 2: goto L_0x02f2;
            case 3: goto L_0x02ea;
            case 4: goto L_0x02f2;
            default: goto L_0x02b4;
        };
    L_0x02b4:
        r1 = new java.security.InvalidParameterException;	 Catch:{ Exception -> 0x02db }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x02db }
        r2.<init>();	 Catch:{ Exception -> 0x02db }
        r3 = z;	 Catch:{ Exception -> 0x02db }
        r4 = 23;
        r3 = r3[r4];	 Catch:{ Exception -> 0x02db }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x02db }
        r2 = r2.append(r11);	 Catch:{ Exception -> 0x02db }
        r3 = z;	 Catch:{ Exception -> 0x02db }
        r4 = 30;
        r3 = r3[r4];	 Catch:{ Exception -> 0x02db }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x02db }
        r2 = r2.toString();	 Catch:{ Exception -> 0x02db }
        r1.<init>(r2);	 Catch:{ Exception -> 0x02db }
        throw r1;	 Catch:{ Exception -> 0x02db }
    L_0x02db:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x02dd }
    L_0x02dd:
        r1 = move-exception;
        r2 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$1;
        r3 = r1.getMessage();
        r2.<init>(r10, r3, r1);
        throw r2;
    L_0x02e8:
        r1 = move-exception;
        throw r1;
    L_0x02ea:
        r2 = r10.cipher;	 Catch:{ Exception -> 0x0303 }
        r3 = 1;
        r2.init(r3, r1);	 Catch:{ Exception -> 0x0303 }
        if (r8 == 0) goto L_0x02fa;
    L_0x02f2:
        r2 = r10.cipher;	 Catch:{ Exception -> 0x0305 }
        r3 = 0;
        r2.init(r3, r1);	 Catch:{ Exception -> 0x0305 }
        if (r8 != 0) goto L_0x02b4;
    L_0x02fa:
        r1 = org.spongycastle.jcajce.provider.digest.BCMessageDigest.a;	 Catch:{ Exception -> 0x0307 }
        if (r1 == 0) goto L_0x0302;
    L_0x02fe:
        r1 = r8 + 1;
        org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a = r1;	 Catch:{ Exception -> 0x0307 }
    L_0x0302:
        return;
    L_0x0303:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0305 }
    L_0x0305:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x02db }
    L_0x0307:
        r1 = move-exception;
        throw r1;
    L_0x0309:
        r1 = r2;
        goto L_0x02b1;
    L_0x030b:
        r2 = r1;
        goto L_0x0258;
    L_0x030e:
        r2 = r14;
        goto L_0x023f;
    L_0x0311:
        r3 = r2;
        goto L_0x020c;
    L_0x0314:
        r1 = r2;
        goto L_0x022c;
    L_0x0317:
        r1 = r2;
        goto L_0x0113;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void engineSetPadding(java.lang.String r6) {
        /*
        r5 = this;
        r0 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;
        r1 = org.spongycastle.util.Strings.toUpperCase(r6);
        r2 = z;	 Catch:{ RuntimeException -> 0x0046 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0046 }
        r2 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x0046 }
        if (r2 == 0) goto L_0x002d;
    L_0x0011:
        r2 = r5.cipher;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = r2.wrapOnNoPadding();	 Catch:{ RuntimeException -> 0x0048 }
        if (r2 == 0) goto L_0x00a0;
    L_0x0019:
        r2 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x004a }
        r3 = new org.spongycastle.crypto.BufferedBlockCipher;	 Catch:{ RuntimeException -> 0x004a }
        r4 = r5.cipher;	 Catch:{ RuntimeException -> 0x004a }
        r4 = r4.getUnderlyingCipher();	 Catch:{ RuntimeException -> 0x004a }
        r3.<init>(r4);	 Catch:{ RuntimeException -> 0x004a }
        r2.<init>(r3);	 Catch:{ RuntimeException -> 0x004a }
        r5.cipher = r2;	 Catch:{ RuntimeException -> 0x004a }
        if (r0 == 0) goto L_0x00a0;
    L_0x002d:
        r2 = 1;
        r5.padded = r2;	 Catch:{ RuntimeException -> 0x0044 }
        r2 = r5.modeName;	 Catch:{ RuntimeException -> 0x0044 }
        r2 = r5.isAEADModeName(r2);	 Catch:{ RuntimeException -> 0x0044 }
        if (r2 == 0) goto L_0x004c;
    L_0x0038:
        r0 = new javax.crypto.NoSuchPaddingException;	 Catch:{ RuntimeException -> 0x0044 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0044 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0044 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0044 }
        throw r0;	 Catch:{ RuntimeException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0044 }
    L_0x004c:
        r2 = z;	 Catch:{ RuntimeException -> 0x009c }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x009c }
        r2 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x009c }
        if (r2 != 0) goto L_0x0064;
    L_0x0058:
        r2 = z;	 Catch:{ RuntimeException -> 0x009e }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x009e }
        r1 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x009e }
        if (r1 == 0) goto L_0x0073;
    L_0x0064:
        r1 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x009a }
        r2 = r5.cipher;	 Catch:{ RuntimeException -> 0x009a }
        r2 = r2.getUnderlyingCipher();	 Catch:{ RuntimeException -> 0x009a }
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x009a }
        r5.cipher = r1;	 Catch:{ RuntimeException -> 0x009a }
        if (r0 == 0) goto L_0x00a0;
    L_0x0073:
        r0 = new javax.crypto.NoSuchPaddingException;	 Catch:{ RuntimeException -> 0x009a }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x009a }
        r1.<init>();	 Catch:{ RuntimeException -> 0x009a }
        r2 = z;	 Catch:{ RuntimeException -> 0x009a }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x009a }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x009a }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x009a }
        r2 = z;	 Catch:{ RuntimeException -> 0x009a }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x009a }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x009a }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x009a }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x009a }
        throw r0;	 Catch:{ RuntimeException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009e }
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009a }
    L_0x00a0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineSetPadding(java.lang.String):void");
    }

    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        try {
            if (engineGetOutputSize(i2) + i3 > bArr2.length) {
                throw new ShortBufferException(z[4]);
            }
            if (i2 != 0) {
                try {
                    i4 = this.cipher.processBytes(bArr, i, i2, bArr2, i3);
                } catch (OutputLengthException e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                } catch (DataLengthException e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            }
            return i4 + this.cipher.doFinal(bArr2, i3 + i4);
        } catch (OutputLengthException e3) {
            throw e3;
        }
    }

    protected BaseBlockCipher(AEADBlockCipher aEADBlockCipher, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    protected BaseBlockCipher(BlockCipher blockCipher, int i, int i2, int i3, int i4) {
        boolean z = false;
        int i5 = BaseKeyGenerator.a;
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.scheme = i;
        this.digest = i2;
        this.keySizeInBits = i3;
        this.ivLength = i4;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
        if (i5 != 0) {
            try {
                if (!BCMessageDigest.a) {
                    z = true;
                }
                BCMessageDigest.a = z;
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    static Class access$000(String str) {
        return lookup(str);
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[40];
        char[] toCharArray = ",e]".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "&gG".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "*gH".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = ".gH".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u0006Qq|]\u001d\u0004gyN\u000fAw,\\\u0006K%\u007f@\u0006Vq,N\u0006V%eF\u0019Qq\"".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\nEk+\\ILdbL\u0005A%|I\u001bEhi\\\fV%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\u0006Qq|]\u001d\u0004gyN\u000fAw,\\\u0006K%\u007f@\u0006Vq,N\u0006V%eF\u0019Qq\"".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "'kUMl-mKK".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "9EahA\u0007C%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "9oF_\u001d9eAHa'c".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "9oF_\u001f9eAHa'c".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "&Jiu\b'KUmL\rMkk\b\nEk,J\f\u0004p\u007fM\r\u0004re\\\u0001\u0004DIi-\u0004hcL\fW+".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "IQkgF\u0006Sk\"".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "\bAdhx\bVda[IAkkA\u0007ABi\\9EwmE\u001a\u0004vyX\u0019Kwx\b\u001eEv,[\u001dVl|X\f@%c]\u001d".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = ".gH".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = ",gG".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "*pW".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "&bG".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        toCharArray = "\nEk+\\IWp|X\u0006Vq,E\u0006@`,".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[18] = new String(cArr).intern();
        toCharArray = "*bG".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[19] = new String(cArr).intern();
        toCharArray = "*fF".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[20] = new String(cArr).intern();
        toCharArray = ";g0,Z\fUpeZ\fW%mFIvF9x\bVdaM\u001dAw\u007f{\u0019Af,\\\u0006\u0004gi\b\u0019Ev\u007fM\r\u0004lb\u0006".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[21] = new String(cArr).intern();
        toCharArray = ";g0!\u001e]".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[22] = new String(cArr).intern();
        toCharArray = "\u001cJnbG\u001eJ%cX\u0004Kai\b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[23] = new String(cArr).intern();
        toCharArray = "\u000eAqE~".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[24] = new String(cArr).intern();
        toCharArray = "(HbcZ\u0000Pma\b\u001bAtyA\u001bAv,IItGI\b\u0002A|".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[25] = new String(cArr).intern();
        toCharArray = "9cUOn+".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[26] = new String(cArr).intern();
        toCharArray = "9f@,Z\fUpeZ\fW%\\j,\u0004umZ\bI`xM\u001bW%xGIF`,[\fP+".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[27] = new String(cArr).intern();
        toCharArray = ",gG".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[28] = new String(cArr).intern();
        toCharArray = "\u000eAqXd\fJ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[29] = new String(cArr).intern();
        toCharArray = "ITd\u007f[\f@".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[30] = new String(cArr).intern();
        toCharArray = ".gH\\I\u001bEhi\\\fVV|M\n\u0004fmFIKk`QIF`,]\u001aAa,_\u0000Pm,i,eA,E\u0006@`\u007f\u0006".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[31] = new String(cArr).intern();
        toCharArray = "\u001cJnbG\u001eJ%|I\u001bEhi\\\fV%xQ\u0019A+".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[32] = new String(cArr).intern();
        toCharArray = "*EkbG\u001d\u0004u~G\nAv\u007f\b.gH\\I\u001bEhi\\\fVV|M\n\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[33] = new String(cArr).intern();
        toCharArray = " r%a]\u001aP%nMI".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[34] = new String(cArr).intern();
        toCharArray = ",gG,E\u0006@`,L\u0006Av,F\u0006P%y[\f\u0004db\b r".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[35] = new String(cArr).intern();
        toCharArray = "\u0007K%E~IW`x\b\u001eL`b\b\u0006J`,M\u0011T`o\\\f@".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[36] = new String(cArr).intern();
        toCharArray = "IF|xM\u001a\u0004icF\u000e\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[37] = new String(cArr).intern();
        toCharArray = "IJjx\b\u001aQlxI\u000bH`,N\u0006V%\u007fQ\u0004I`xZ\u0000G%iF\u001b]uxA\u0006J+".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[38] = new String(cArr).intern();
        toCharArray = "\"A|,N\u0006V%mD\u000eKwe\\\u0001I%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[39] = new String(cArr).intern();
        z = strArr;
        toCharArray = "\u0003EsmPGGwuX\u001dK+\u007fX\fG+Kk$td~I\u0004AqiZ:T`o".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            char c3 = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[length] = (char) (i2 ^ c3);
        }
        gcmSpecClass = lookup(new String(cArr).intern());
    }
}
