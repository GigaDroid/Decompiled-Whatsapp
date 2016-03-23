package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.v;
import org.whispersystems.at;

public class qi {
    private static final String z;

    static {
        char[] toCharArray = "c\u0018C\u001fqJ3V\u000e@V9J\u0016U@\u0003\u00005PQ\\`\u001c\bh\u0014B\u0015W\\Q@\u0014\u0005I\u001eN\u001eLK\u0016\u000f\u0013KU\u0004[WVQ\u0003J\u001bH\u0005\u001eIZVL\u000bJ@\u0005".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 113;
                    break;
                case at.i /*2*/:
                    i2 = 47;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static byte[] a(InputStream inputStream) {
        boolean z = DialogToastActivity.f;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            byte[] bArr = new byte[4096];
            do {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } while (!z);
            a((Closeable) inputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (OutOfMemoryError e) {
            Log.w(z + inputStream.available());
            throw e;
        }
    }

    public static byte[] a(File file) {
        return a(new FileInputStream(file));
    }
}
