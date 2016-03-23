package com.google.android.gms.internal;

import java.io.IOException;

public class zzrw extends IOException {
    public zzrw(String str) {
        super(str);
    }

    static zzrw zzDp() {
        return new zzrw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzrw zzDq() {
        return new zzrw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzrw zzDr() {
        return new zzrw("CodedInputStream encountered a malformed varint.");
    }

    static zzrw zzDs() {
        return new zzrw("Protocol message contained an invalid tag (zero).");
    }

    static zzrw zzDt() {
        return new zzrw("Protocol message end-group tag did not match expected tag.");
    }

    static zzrw zzDu() {
        return new zzrw("Protocol message tag had invalid wire type.");
    }

    static zzrw zzDv() {
        return new zzrw("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
