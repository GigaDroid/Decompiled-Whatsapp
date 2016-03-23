package com.whatsapp;

class ad2 {
    private final long a;
    private long b;

    public long b() {
        return (this.a - 10) - this.b;
    }

    public zc a() {
        if (this.b < this.a - 10) {
            return zc.DATA_REMAINING;
        }
        if (this.b == this.a - 10) {
            return zc.MAC_REMAINING;
        }
        return zc.FINISHED;
    }

    public void a(long j) {
        this.b += j;
    }

    public ad2(long j) {
        this.a = j;
        this.b = 0;
    }
}
