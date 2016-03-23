package com.google;

import java.util.Map;

public final class dx {
    private final y a;

    public dx() {
        this.a = new y(aj.g);
    }

    private void a(byte[] bArr, int i) {
        int i2 = 0;
        boolean z = fQ.b;
        int length = bArr.length;
        int[] iArr = new int[length];
        int i3 = 0;
        while (i3 < length) {
            iArr[i3] = bArr[i3] & 255;
            i3++;
            if (z) {
                break;
            }
        }
        try {
            this.a.a(iArr, bArr.length - i);
            while (i2 < i) {
                bArr[i2] = (byte) iArr[i2];
                i2++;
                if (z) {
                    return;
                }
            }
        } catch (em e) {
            throw aC.a();
        }
    }

    private am a(dF dFVar, Map map) {
        boolean z = fQ.b;
        fQ b = dFVar.b();
        hP b2 = dFVar.d().b();
        gu[] a = gu.a(dFVar.a(), b, b2);
        int length = a.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            i += a[i2].a();
            i2++;
            if (z) {
                break;
            }
        }
        byte[] bArr = new byte[i];
        i2 = 0;
        int length2 = a.length;
        int i3 = 0;
        while (i3 < length2) {
            gu guVar = a[i3];
            byte[] b3 = guVar.b();
            int a2 = guVar.a();
            a(b3, a2);
            length = 0;
            while (length < a2) {
                i = i2 + 1;
                bArr[i2] = b3[length];
                i2 = length + 1;
                if (z) {
                    break;
                }
                length = i2;
                i2 = i;
            }
            i = i2;
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
            i2 = i;
        }
        return aS.a(bArr, b, b2, map);
    }

    public am a(hX hXVar, Map map) {
        am a;
        aC aCVar;
        aG e;
        aK aKVar = null;
        dF dFVar = new dF(hXVar);
        try {
            a = a(dFVar, map);
        } catch (aG e2) {
            aG aGVar = e2;
            aCVar = aKVar;
            try {
                dFVar.e();
                dFVar.a(true);
                dFVar.b();
                dFVar.d();
                dFVar.c();
                a = a(dFVar, map);
                a.a(new p(true));
                return a;
            } catch (aG e3) {
                e = e3;
                if (aGVar != null) {
                    try {
                        throw aGVar;
                    } catch (aG e4) {
                        throw e4;
                    }
                } else if (aCVar == null) {
                    try {
                        throw aCVar;
                    } catch (aG e42) {
                        throw e42;
                    }
                } else {
                    throw e42;
                }
            } catch (aC e5) {
                e42 = e5;
                if (aGVar != null) {
                    throw aGVar;
                } else if (aCVar == null) {
                    throw e42;
                } else {
                    throw aCVar;
                }
            }
        } catch (aC e6) {
            aCVar = e6;
            aK aKVar2 = aKVar;
            dFVar.e();
            dFVar.a(true);
            dFVar.b();
            dFVar.d();
            dFVar.c();
            a = a(dFVar, map);
            a.a(new p(true));
            return a;
        }
        return a;
    }
}
