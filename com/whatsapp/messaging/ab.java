package com.whatsapp.messaging;

import com.whatsapp.protocol.b2;
import com.whatsapp.protocol.bf;
import com.whatsapp.protocol.bk;
import com.whatsapp.protocol.bx;
import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.ci;

public class ab {
    int a;
    bf b;
    b2 c;
    int d;
    String e;
    c3 f;
    String g;
    bx h;
    String i;
    c2 j;
    bk k;
    String l;
    ci m;

    public ab(String str, String str2, String str3, c3 c3Var) {
        this(str, str2);
        this.i = str3;
        this.f = c3Var;
    }

    public ab(String str, String str2, b2 b2Var) {
        this(str, str2);
        this.c = b2Var;
    }

    public ab(String str, String str2, bk bkVar) {
        this(str, str2);
        this.k = bkVar;
    }

    public ab(String str, String str2, bf bfVar) {
        this(str, str2);
        this.b = bfVar;
    }

    public ab(String str, String str2, String str3, c3 c3Var, int i) {
        this(str, str2);
        this.e = str3;
        this.f = c3Var;
        this.d = i;
    }

    public ab(String str, String str2, c2 c2Var) {
        this(str, str2);
        this.j = c2Var;
    }

    public ab(String str, String str2, bx bxVar) {
        this(str, str2);
        this.h = bxVar;
    }

    public ab(String str, String str2, String str3) {
        this(str, str2);
        this.e = str3;
    }

    public ab(String str, String str2, ci ciVar) {
        this(str, str2);
        this.m = ciVar;
    }

    public ab(String str, String str2, int i, c2 c2Var) {
        this(str, str2);
        this.a = i;
        this.j = c2Var;
    }

    public ab(String str, String str2) {
        this.g = str;
        this.l = str2;
    }
}
