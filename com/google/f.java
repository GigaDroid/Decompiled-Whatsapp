package com.google;

public final class f {
    private final y a;

    private void a(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = a.f;
        int length = bArr.length;
        int[] iArr = new int[length];
        int i4 = 0;
        while (i4 < length) {
            iArr[i4] = bArr[i4] & 255;
            i4++;
            if (i3 != 0) {
                break;
            }
        }
        try {
            this.a.a(iArr, bArr.length - i);
            while (i2 < i) {
                bArr[i2] = (byte) iArr[i2];
                i2++;
                if (i3 != 0) {
                    return;
                }
            }
        } catch (em e) {
            throw aC.a();
        }
    }

    public f() {
        this.a = new y(aj.n);
    }

    public am a(hX hXVar) {
        int i = a.f;
        dR dRVar = new dR(hXVar);
        cx[] a = cx.a(dRVar.b(), dRVar.a());
        int length = a.length;
        int length2 = a.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            i3 += a[i2].b();
            i2++;
            if (i != 0) {
                break;
            }
        }
        byte[] bArr = new byte[i3];
        i3 = 0;
        while (i3 < length) {
            cx cxVar = a[i3];
            byte[] a2 = cxVar.a();
            int b = cxVar.b();
            a(a2, b);
            i2 = 0;
            while (i2 < b) {
                bArr[(i2 * length) + i3] = a2[i2];
                i2++;
                if (i != 0) {
                    break;
                }
            }
            i3++;
            if (i != 0) {
                break;
            }
        }
        return eU.a(bArr);
    }
}
