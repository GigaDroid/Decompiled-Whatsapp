package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class zzf extends AbstractDataBuffer {
    private boolean zzaby;
    private ArrayList zzabz;

    protected zzf(DataHolder dataHolder) {
        super(dataHolder);
        this.zzaby = false;
    }

    private void zznX() {
        boolean z = DataHolder.a;
        synchronized (this) {
            if (!this.zzaby) {
                int count = this.zzYX.getCount();
                this.zzabz = new ArrayList();
                if (count > 0) {
                    this.zzabz.add(Integer.valueOf(0));
                    String zznW = zznW();
                    String zzd = this.zzYX.zzd(zznW, 0, this.zzYX.zzbo(0));
                    int i = 1;
                    while (i < count) {
                        int zzbo = this.zzYX.zzbo(i);
                        String zzd2 = this.zzYX.zzd(zznW, i, zzbo);
                        if (zzd2 == null) {
                            try {
                                throw new NullPointerException("Missing value for markerColumn: " + zznW + ", at row: " + i + ", for window: " + zzbo);
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        if (zzd2.equals(zzd)) {
                            zzd2 = zzd;
                        } else {
                            this.zzabz.add(Integer.valueOf(i));
                        }
                        int i2 = i + 1;
                        if (z) {
                            break;
                        }
                        i = i2;
                        zzd = zzd2;
                    }
                }
                this.zzaby = true;
            }
        }
    }

    public final Object get(int i) {
        zznX();
        return zzk(zzbr(i), zzbs(i));
    }

    public int getCount() {
        zznX();
        return this.zzabz.size();
    }

    int zzbr(int i) {
        if (i >= 0) {
            try {
                if (i < this.zzabz.size()) {
                    return ((Integer) this.zzabz.get(i)).intValue();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int zzbs(int r7) {
        /*
        r6 = this;
        r1 = 0;
        if (r7 < 0) goto L_0x000b;
    L_0x0003:
        r0 = r6.zzabz;	 Catch:{ IllegalArgumentException -> 0x000d }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x000d }
        if (r7 != r0) goto L_0x000f;
    L_0x000b:
        r0 = r1;
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = r6.zzabz;
        r0 = r0.size();
        r0 = r0 + -1;
        if (r7 != r0) goto L_0x0031;
    L_0x0019:
        r0 = r6.zzYX;
        r2 = r0.getCount();
        r0 = r6.zzabz;
        r0 = r0.get(r7);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = r2 - r0;
        r2 = com.google.android.gms.common.data.DataHolder.a;
        if (r2 == 0) goto L_0x004d;
    L_0x0031:
        r0 = r6.zzabz;
        r2 = r7 + 1;
        r0 = r0.get(r2);
        r0 = (java.lang.Integer) r0;
        r2 = r0.intValue();
        r0 = r6.zzabz;
        r0 = r0.get(r7);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = r2 - r0;
    L_0x004d:
        r2 = 1;
        if (r0 != r2) goto L_0x000c;
    L_0x0050:
        r2 = r6.zzbr(r7);
        r3 = r6.zzYX;
        r3 = r3.zzbo(r2);
        r4 = r6.zznY();
        if (r4 == 0) goto L_0x000c;
    L_0x0060:
        r5 = r6.zzYX;
        r2 = r5.zzd(r4, r2, r3);
        if (r2 != 0) goto L_0x000c;
    L_0x0068:
        r0 = r1;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.zzf.zzbs(int):int");
    }

    protected abstract Object zzk(int i, int i2);

    protected abstract String zznW();

    protected String zznY() {
        return null;
    }
}
