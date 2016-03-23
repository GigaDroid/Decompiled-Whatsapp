package com.whatsapp;

import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class x4 {
    public long a;
    public long b;
    public long c;
    public long d;

    public long a(int i) {
        switch (i) {
            case at.m /*5*/:
                if (this.d > 0) {
                    return this.d;
                }
                break;
            case aF.u /*8*/:
                break;
            case Y.q /*13*/:
                break;
            default:
                return 0;
        }
        if (this.a > 0) {
            return this.a;
        }
        if (this.c > 0) {
            return this.c;
        }
        return 0;
    }

    public int a() {
        if (this.c > 0) {
            return 8;
        }
        if (this.a > 0) {
            return 13;
        }
        if (this.d > 0) {
            return 5;
        }
        return 4;
    }
}
