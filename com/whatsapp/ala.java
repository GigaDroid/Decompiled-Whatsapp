package com.whatsapp;

public class ala {
    String a;
    String b;
    String c;
    String d;
    String e;

    public ala(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
        this.d = str5;
    }

    public boolean a(String str, String str2) {
        return str != null && str.equals(this.e) && str2 != null && str2.equals(this.d);
    }

    public boolean a(String str, String str2, String str3, String str4) {
        return str2 != null && str2.equals(this.c) && str != null && str.equals(this.b) && a(str3, str4);
    }
}
