package com.google.android.gms.wearable;

import java.io.IOException;

public class ChannelIOException extends IOException {
    private final int zzaYM;
    private final int zzaYN;

    public ChannelIOException(String str, int i, int i2) {
        super(str);
        this.zzaYM = i;
        this.zzaYN = i2;
    }

    public int getAppSpecificErrorCode() {
        return this.zzaYN;
    }

    public int getCloseReason() {
        return this.zzaYM;
    }
}
