package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.v;
import org.whispersystems.at;

public class BaseKeyGenerator extends KeyGeneratorSpi {
    public static int a;
    private static final String z;
    protected String algName;
    protected int defaultKeySize;
    protected CipherKeyGenerator engine;
    protected int keySize;
    protected boolean uninitialised;

    static {
        char[] toCharArray = "\u001d\u001aLrM>\u0005T7i6\u001bL7`".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 117;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 82;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected BaseKeyGenerator(String str, int i, CipherKeyGenerator cipherKeyGenerator) {
        this.uninitialised = true;
        this.algName = str;
        this.defaultKeySize = i;
        this.keySize = i;
        this.engine = cipherKeyGenerator;
    }

    protected SecretKey engineGenerateKey() {
        try {
            if (this.uninitialised) {
                this.engine.init(new KeyGenerationParameters(new SecureRandom(), this.defaultKeySize));
                this.uninitialised = false;
            }
            return new SecretKeySpec(this.engine.generateKey(), this.algName);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = new SecureRandom();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        this.engine.init(new KeyGenerationParameters(secureRandom, i));
        this.uninitialised = false;
    }

    protected void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            try {
                this.engine.init(new KeyGenerationParameters(secureRandom, this.defaultKeySize));
                this.uninitialised = false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException(z);
    }
}
