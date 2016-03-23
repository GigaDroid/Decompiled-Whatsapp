package com.whatsapp.protocol;

public class cz extends Exception {
    private static final long serialVersionUID = 1;
    String a;

    public cz(String str) {
        super(str);
    }

    public cz(String str, String str2) {
        super(str);
        this.a = str2;
    }

    public String a() {
        return this.a;
    }
}
