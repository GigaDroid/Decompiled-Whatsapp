package org.spongycastle.crypto.modes.gcm;

import java.util.Vector;
import org.spongycastle.util.Arrays;

public class Tables1kGCMExponentiator {
    private Vector lookupPowX2;

    public void exponentiateX(long j, byte[] bArr) {
        int i = GCMUtil.a;
        int[] oneAsInts = GCMUtil.oneAsInts();
        int i2 = 0;
        while (j > 0) {
            if ((1 & j) != 0) {
                ensureAvailable(i2);
                GCMUtil.multiply(oneAsInts, (int[]) this.lookupPowX2.elementAt(i2));
            }
            int i3 = i2 + 1;
            j >>>= 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        GCMUtil.asBytes(oneAsInts, bArr);
    }

    private void ensureAvailable(int i) {
        int size = this.lookupPowX2.size();
        if (size <= i) {
            int[] iArr = (int[]) this.lookupPowX2.elementAt(size - 1);
            do {
                iArr = Arrays.clone(iArr);
                GCMUtil.multiply(iArr, iArr);
                this.lookupPowX2.addElement(iArr);
                size++;
            } while (size <= i);
        }
    }

    public void init(byte[] bArr) {
        int[] asInts = GCMUtil.asInts(bArr);
        if (this.lookupPowX2 == null || !Arrays.areEqual(asInts, (int[]) this.lookupPowX2.elementAt(0))) {
            this.lookupPowX2 = new Vector(8);
            this.lookupPowX2.addElement(asInts);
        }
    }
}
