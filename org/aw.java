package org;

import com.whatsapp.WAAppCompatActivity;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.crypto.modes.GCMBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

public class aw {
    private final byte[] a;

    public byte[] a(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = a9.b;
        try {
            GCMBlockCipher a = a(j, true);
            a.processAADBytes(bArr, 0, bArr.length);
            byte[] a2 = a(a, bArr2, i, i2);
            if (WAAppCompatActivity.c != 0) {
                a9.b = i3 + 1;
            }
            return a2;
        } catch (InvalidCipherTextException e) {
            throw new AssertionError(e);
        }
    }

    private byte[] a(GCMBlockCipher gCMBlockCipher, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[gCMBlockCipher.getOutputSize(i2)];
        int processBytes = gCMBlockCipher.processBytes(bArr, i, i2, bArr2, 0);
        int doFinal = gCMBlockCipher.doFinal(bArr2, processBytes);
        if (processBytes + doFinal >= bArr2.length) {
            return bArr2;
        }
        Object obj = new byte[(processBytes + doFinal)];
        System.arraycopy(bArr2, 0, obj, 0, obj.length);
        return obj;
    }

    public byte[] a(long j, byte[] bArr, byte[] bArr2) {
        return a(j, bArr, bArr2, 0, bArr2.length);
    }

    public byte[] b(long j, byte[] bArr, byte[] bArr2) {
        int i = a9.b;
        try {
            GCMBlockCipher a = a(j, false);
            a.processAADBytes(bArr, 0, bArr.length);
            byte[] a2 = a(a, bArr2, 0, bArr2.length);
            if (i != 0) {
                WAAppCompatActivity.c++;
            }
            return a2;
        } catch (Throwable e) {
            throw new ae(this, e);
        }
    }

    private GCMBlockCipher a(long j, boolean z) {
        GCMBlockCipher gCMBlockCipher = new GCMBlockCipher(new AESFastEngine());
        byte[] bArr = new byte[12];
        org.whispersystems.aw.a(bArr, 4, j);
        gCMBlockCipher.init(z, new ParametersWithIV(new KeyParameter(this.a), bArr));
        return gCMBlockCipher;
    }

    public aw(byte[] bArr) {
        this.a = bArr;
    }
}
