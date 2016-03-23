package com.google;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ha implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean a;
    private String b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;

    public ha a(String str) {
        this.d = true;
        this.f = str;
        return this;
    }

    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            objectOutput.writeUTF(this.e);
        }
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            objectOutput.writeUTF(this.b);
        }
        objectOutput.writeBoolean(this.d);
        if (this.d) {
            objectOutput.writeUTF(this.f);
        }
    }

    public static hi d() {
        return new hi();
    }

    public String a() {
        return this.f;
    }

    public ha() {
        this.e = "";
        this.b = "";
        this.f = "";
    }

    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            c(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            b(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            a(objectInput.readUTF());
        }
    }

    public boolean b() {
        return this.d;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.e;
    }

    public ha a(ha haVar) {
        if (haVar.e()) {
            c(haVar.g());
        }
        if (haVar.c()) {
            b(haVar.f());
        }
        if (haVar.b()) {
            a(haVar.a());
        }
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public boolean b(ha haVar) {
        return this.e.equals(haVar.e) && this.b.equals(haVar.b) && this.f.equals(haVar.f);
    }

    public ha b(String str) {
        this.c = true;
        this.b = str;
        return this;
    }

    public ha c(String str) {
        this.a = true;
        this.e = str;
        return this;
    }
}
