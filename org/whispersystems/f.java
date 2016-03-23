package org.whispersystems;

import com.whatsapp.arj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.v;

public class f {
    private static final String z;

    static {
        char[] toCharArray = "U,`\u0006\u0019g6]\u0010\u0011v".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 2;
                    break;
                case at.g /*1*/:
                    i2 = 68;
                    break;
                case at.i /*2*/:
                    i2 = 9;
                    break;
                case at.o /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private static byte[] a() {
        byte[] bArr = new byte[32];
        Arrays.fill(bArr, (byte) -1);
        return bArr;
    }

    public static void a(t tVar, int i, d dVar) {
        boolean z = cd.d;
        try {
            tVar.d(i);
            tVar.b(dVar.g());
            tVar.a(dVar.e().b());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (i >= 3) {
                byteArrayOutputStream.write(a());
            }
            try {
                byteArrayOutputStream.write(bx.a(dVar.g().a(), dVar.a().a()));
                byteArrayOutputStream.write(bx.a(dVar.c(), dVar.e().a()));
                byteArrayOutputStream.write(bx.a(dVar.c(), dVar.a().a()));
                if (i >= 3 && dVar.f().a()) {
                    byteArrayOutputStream.write(bx.a(dVar.c(), ((e) dVar.f().c()).a()));
                }
                b9 a = a(i, byteArrayOutputStream.toByteArray());
                tVar.a(dVar.d(), a.b());
                tVar.a(a.a());
                try {
                    if (a5.o) {
                        boolean z2;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        cd.d = z2;
                    }
                } catch (IOException e) {
                    throw e;
                } catch (IOException e2) {
                    throw e2;
                }
            } catch (IOException e22) {
                throw e22;
            } catch (IOException e222) {
                throw e222;
            }
        } catch (IOException e2222) {
            throw e2222;
        } catch (IOException e22222) {
            throw new AssertionError(e22222);
        }
    }

    public static void a(t tVar, int i, aS aSVar) {
        boolean z = cd.d;
        try {
            tVar.d(i);
            tVar.b(aSVar.f());
            tVar.a(aSVar.b().b());
            e a = bx.a();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (i >= 3) {
                byteArrayOutputStream.write(a());
            }
            try {
                byteArrayOutputStream.write(bx.a(aSVar.d(), aSVar.b().a()));
                byteArrayOutputStream.write(bx.a(aSVar.f().a(), aSVar.g().a()));
                byteArrayOutputStream.write(bx.a(aSVar.d(), aSVar.g().a()));
                if (i >= 3 && aSVar.a().a()) {
                    byteArrayOutputStream.write(bx.a((E) aSVar.a().c(), aSVar.g().a()));
                }
                b9 a2 = a(i, byteArrayOutputStream.toByteArray());
                C a3 = a2.a().a(aSVar.e(), a);
                tVar.b(aSVar.e(), a2.b());
                tVar.a(a, (cd) a3.b());
                tVar.a((h) a3.a());
                if (z) {
                    try {
                        a5.o = !a5.o;
                    } catch (IOException e) {
                        throw e;
                    }
                }
            } catch (IOException e2) {
                throw e2;
            } catch (IOException e22) {
                throw e22;
            }
        } catch (IOException e222) {
            throw e222;
        } catch (IOException e2222) {
            throw new AssertionError(e2222);
        }
    }

    private static b9 a(int i, byte[] bArr) {
        ag a = ag.a(i);
        byte[][] c = aw.c(a.b(bArr, z.getBytes(), 64), 32, 32);
        return new b9(new h(a, c[0]), new cd(a, c[1], 0), null);
    }
}
