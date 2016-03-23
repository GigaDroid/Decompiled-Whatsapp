package com.google;

public final class p {
    private final boolean a;

    public void a(fI[] fIVarArr) {
        if (this.a && fIVarArr != null && fIVarArr.length >= 3) {
            fI fIVar = fIVarArr[0];
            fIVarArr[0] = fIVarArr[2];
            fIVarArr[2] = fIVar;
        }
    }

    p(boolean z) {
        this.a = z;
    }
}
