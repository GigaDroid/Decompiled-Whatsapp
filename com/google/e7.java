package com.google;

import java.io.InputStream;

class e7 extends InputStream {
    private int a;
    final id b;
    private int c;
    private int d;
    private hg e;
    private int f;
    private hN g;

    public int available() {
        return this.b.a() - (this.d + this.a);
    }

    private void a() {
        this.g = new hN(this.b, null);
        this.e = this.g.b();
        this.c = this.e.a();
        this.a = 0;
        this.d = 0;
    }

    private void b() {
        try {
            if (this.e == null) {
                return;
            }
            if (this.a == this.c) {
                try {
                    this.d += this.c;
                    this.a = 0;
                    if (this.g.hasNext()) {
                        try {
                            this.e = this.g.b();
                            this.c = this.e.a();
                            if (!bA.b) {
                                return;
                            }
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    }
                    this.e = null;
                    this.c = 0;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
        } catch (NullPointerException e22) {
            throw e22;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    public long skip(long j) {
        if (j < 0) {
            try {
                throw new IndexOutOfBoundsException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (long) a(null, 0, (int) j);
    }

    public boolean markSupported() {
        return true;
    }

    public e7(id idVar) {
        this.b = idVar;
        a();
    }

    public int read() {
        try {
            b();
            if (this.e == null) {
                return -1;
            }
            hg hgVar = this.e;
            int i = this.a;
            this.a = i + 1;
            return hgVar.b(i) & 255;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        if (i >= 0 && i2 >= 0) {
            try {
                if (i2 <= bArr.length - i) {
                    return a(bArr, i, i2);
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public synchronized void reset() {
        a();
        a(null, 0, this.f);
    }

    private int a(byte[] bArr, int i, int i2) {
        boolean z = bA.b;
        int i3 = i2;
        int i4 = i;
        while (i3 > 0) {
            try {
                b();
                if (this.e != null) {
                    int min = Math.min(this.c - this.a, i3);
                    if (bArr != null) {
                        this.e.b(bArr, this.a, i4, min);
                        i4 += min;
                    }
                    this.a += min;
                    i3 -= min;
                    if (z) {
                        break;
                    }
                } else if (i3 == i2) {
                    return -1;
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        return i2 - i3;
    }

    public void mark(int i) {
        this.f = this.d + this.a;
    }
}
