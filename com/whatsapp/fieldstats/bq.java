package com.whatsapp.fieldstats;

public enum bq {
    A(0),
    B(1);
    
    public static final bq A;
    public static final bq B;
    private static final bq[] a;
    private final int b;

    private bq(int i) {
        this.b = i;
    }

    static {
        A = new bq("A", 0, 0);
        B = new bq("B", 1, 1);
        a = new bq[]{A, B};
    }

    public int getCode() {
        return this.b;
    }
}
