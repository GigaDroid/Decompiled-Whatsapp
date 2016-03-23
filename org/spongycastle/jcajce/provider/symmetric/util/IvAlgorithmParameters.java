package org.spongycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.util.Arrays;
import org.v;
import org.whispersystems.at;

public class IvAlgorithmParameters extends BaseAlgorithmParameters {
    private static final String[] z;
    private byte[] iv;

    static {
        int i;
        int i2;
        String[] strArr = new String[7];
        char[] toCharArray = "C\tM".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 26;
                    break;
                case at.o /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "d&q{\u0001f&:e\u000fc)wp\u001at::f\u001et+:e\u000fb;\u007fqNe':\\818{g\u000f|-np\u001cbhuw\u0004t+n;".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 26;
                    break;
                case at.o /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "X\u001e:E\u000fc)wp\u001at:i".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 26;
                    break;
                case at.o /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "P\u001bT;_".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 26;
                    break;
                case at.o /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "X>Jt\u001cp%\u007fa\u000bc\u001bjp\r1:\u007fd\u001bx:\u007fqNe':|\u0000x<st\u0002x;\u007f5\u000f1\u0001L5\u001ep:{x\u000be-hfNp$}z\u001cx<rxNa)ht\u0003t<\u007fg\u001d1'x\u007f\u000br<".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 26;
                    break;
                case at.o /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "D&q{\u0001f&:e\u000fc)wp\u001at:i5\b~:wt\u001a1!t5'Ghjt\u001cp%\u007fa\u000bc;:z\f{-ya".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 26;
                    break;
                case at.o /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "C\tM".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 26;
                    break;
                case at.o /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[6] = new String(cArr).intern();
        z = strArr;
    }

    protected String engineToString() {
        return z[2];
    }

    protected byte[] engineGetEncoded() {
        return engineGetEncoded(z[3]);
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.iv);
        }
        throw new InvalidParameterSpecException(z[1]);
    }

    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            return;
        }
        throw new InvalidParameterSpecException(z[4]);
    }

    protected void engineInit(byte[] bArr) {
        this.iv = Arrays.clone(bArr);
    }

    protected void engineInit(byte[] bArr, String str) {
        if (str.equals(z[6])) {
            engineInit(bArr);
            return;
        }
        throw new IOException(z[5]);
    }

    protected byte[] engineGetEncoded(String str) {
        return str.equals(z[0]) ? Arrays.clone(this.iv) : null;
    }
}
