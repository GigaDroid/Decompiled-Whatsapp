package com.whatsapp.messaging;

import com.whatsapp.protocol.cm;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class b3 implements cm {
    public byte[] b(byte[] bArr, int i, int i2, byte[] bArr2) {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
            if (bArr2 != null) {
                byteArrayOutputStream.write(bArr2);
            }
            deflaterOutputStream.write(bArr, i, i2);
            deflaterOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public byte[] a(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3 = co.a;
        InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr, i, i2));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        if (bArr2 != null) {
            byteArrayOutputStream.write(bArr2);
        }
        byte[] bArr3 = new byte[8192];
        int read = inflaterInputStream.read(bArr3);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr3, 0, read);
            read = inflaterInputStream.read(bArr3);
            if (i3 != 0) {
                break;
            }
        }
        inflaterInputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
