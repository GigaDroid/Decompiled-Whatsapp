package com.whatsapp.util;

import com.whatsapp.arj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.v;
import org.whispersystems.at;

public class q extends OutputStream {
    private static final String z;
    final FileOutputStream a;
    final File b;
    final File c;
    boolean d;

    static {
        char[] toCharArray = "@Vm\u0003ztZo\u00079cknF2gVm\u00030".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 6;
                    break;
                case at.g /*1*/:
                    i2 = 63;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    public synchronized void close() {
        if (!this.d) {
            this.d = true;
            this.a.close();
            this.b.delete();
            if (!this.c.renameTo(this.b)) {
                throw new IOException(z);
            }
        }
    }

    public q(bk bkVar, File file) {
        this(bkVar, file, false);
    }

    public void write(int i) {
        this.a.write(i);
    }

    public void write(byte[] bArr) {
        this.a.write(bArr);
    }

    public void flush() {
        this.a.flush();
    }

    public q(bk bkVar, File file, boolean z) {
        IOException iOException;
        Throwable th;
        this.d = false;
        this.c = bkVar.a();
        this.b = file;
        this.a = new FileOutputStream(this.c);
        if (z && this.b.exists()) {
            FileInputStream fileInputStream = null;
            FileInputStream fileInputStream2;
            try {
                fileInputStream2 = new FileInputStream(this.b);
                try {
                    ak.a(fileInputStream2.getChannel(), this.a.getChannel());
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                } catch (FileNotFoundException e) {
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (FileNotFoundException e2) {
                            throw e2;
                        }
                    }
                } catch (IOException e3) {
                    IOException iOException2 = e3;
                    fileInputStream = fileInputStream2;
                    iOException = iOException2;
                    try {
                        this.a.close();
                        throw iOException;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (FileNotFoundException e22) {
                                throw e22;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    fileInputStream = fileInputStream2;
                    th = th4;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException e4) {
                fileInputStream2 = null;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
            } catch (IOException e5) {
                iOException = e5;
                this.a.close();
                throw iOException;
            }
        }
    }
}
