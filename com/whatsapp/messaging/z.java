package com.whatsapp.messaging;

import com.whatsapp.arj;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.UnsupportedCharsetException;
import org.v;
import org.whispersystems.at;

final class z extends FilterOutputStream {
    private static final String[] z;
    private final ByteBuffer a;
    private boolean b;

    static {
        String[] strArr = new String[6];
        String str = "\tz\t>0\u0007v]p2\u0012/\u001f{}\bz\u0011r";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 15;
                        break;
                    case at.i /*2*/:
                        i3 = 125;
                        break;
                    case at.o /*3*/:
                        i3 = 30;
                        break;
                    default:
                        i3 = 93;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "6@.J}Il\u0015\u007f)FG)J\rI>S/PlG\u0012m)\\/\u001e0*\u000en\tm<\u0016\u007fSp8\u0012\u0002wK.\u0003}P_:\u0003a\t$}+`\u0007w1\nnR+sV/U}2\u000b\u007f\u001cj4\u0004c\u0018%}1N>v<\u0012 L0o]/Vv)\u0012\u007fG1r\u0011x\n0*\u000en\tm<\u0016\u007fS}2\u000b \u001eq3\u0012n\u001ejtk\u0005)l<\b|\u001b{/KJ\u0013}2\u0002f\u0013ygFl\u0015k3\rj\u0019\u0013Wk\u0005";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "3[;3e";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "3[;3e";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "V\u0002w\u0013W";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "3[;3e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public synchronized void flush() {
        try {
            if (!this.b) {
                a();
            }
            if (this.a.position() > 0) {
                this.out.write(Integer.toHexString(this.a.position()).getBytes(z[1]));
                this.out.write(13);
                this.out.write(10);
                this.out.write(this.a.array(), 0, this.a.position());
                this.out.write(13);
                this.out.write(10);
                this.a.clear();
            }
            super.flush();
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public z(OutputStream outputStream) {
        super(outputStream);
        if (outputStream == null) {
            throw new NullPointerException(z[0]);
        }
        this.a = ByteBuffer.allocate(8192);
    }

    private void a() {
        this.out.write(z[2].getBytes(z[3]));
        this.b = true;
    }

    public synchronized void close() {
        Throwable th = null;
        try {
            flush();
            this.out.write(z[5].getBytes(z[4]));
        } catch (UnsupportedCharsetException e) {
            throw e;
        } catch (Throwable th2) {
            throw new Error(th2);
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            super.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        if (th2 != null) {
            Thread.currentThread().stop(th2);
        }
    }

    public synchronized void write(int i) {
        try {
            if (!this.a.hasRemaining()) {
                flush();
            }
            this.a.put((byte) i);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        int i3 = co.a;
        int i4 = i2;
        int i5 = i;
        while (i4 > this.a.remaining()) {
            int remaining = this.a.remaining();
            this.a.put(bArr, i5, remaining);
            flush();
            i5 += remaining;
            i4 -= remaining;
            if (i3 != 0) {
                break;
            }
        }
        this.a.put(bArr, i5, i4);
    }
}
