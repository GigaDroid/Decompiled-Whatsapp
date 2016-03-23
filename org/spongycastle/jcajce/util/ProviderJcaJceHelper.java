package org.spongycastle.jcajce.util;

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import org.spongycastle.jcajce.provider.digest.BCMessageDigest;

public class ProviderJcaJceHelper implements JcaJceHelper {
    public static int a;
    protected final Provider provider;

    public KeyGenerator createKeyGenerator(String str) {
        return KeyGenerator.getInstance(str, this.provider);
    }

    public SecretKeyFactory createSecretKeyFactory(String str) {
        return SecretKeyFactory.getInstance(str, this.provider);
    }

    public AlgorithmParameters createAlgorithmParameters(String str) {
        return AlgorithmParameters.getInstance(str, this.provider);
    }

    public CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str, this.provider);
    }

    public MessageDigest createDigest(String str) {
        return MessageDigest.getInstance(str, this.provider);
    }

    public Mac createMac(String str) {
        return Mac.getInstance(str, this.provider);
    }

    public KeyFactory createKeyFactory(String str) {
        return KeyFactory.getInstance(str, this.provider);
    }

    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String str) {
        return AlgorithmParameterGenerator.getInstance(str, this.provider);
    }

    public Signature createSignature(String str) {
        return Signature.getInstance(str, this.provider);
    }

    public KeyAgreement createKeyAgreement(String str) {
        return KeyAgreement.getInstance(str, this.provider);
    }

    public ProviderJcaJceHelper(Provider provider) {
        int i = a;
        this.provider = provider;
        if (BCMessageDigest.a) {
            a = i + 1;
        }
    }

    public Cipher createCipher(String str) {
        return Cipher.getInstance(str, this.provider);
    }

    public KeyPairGenerator createKeyPairGenerator(String str) {
        return KeyPairGenerator.getInstance(str, this.provider);
    }
}
