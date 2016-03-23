package org.whispersystems;

public class bI {
    public static int a;
    private final String b;
    private final j c;

    public bI(String str, j jVar) {
        this.b = str;
        this.c = jVar;
    }

    public String a() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bI)) {
            return false;
        }
        bI bIVar = (bI) obj;
        if (this.b.equals(bIVar.b) && this.c.equals(bIVar.c)) {
            return true;
        }
        return false;
    }

    public j b() {
        return this.c;
    }
}
