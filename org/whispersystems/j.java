package org.whispersystems;

public class j {
    private final int a;
    private final String b;

    public j(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a;
    }

    public String toString() {
        return this.b + ":" + this.a;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.b.equals(jVar.b) && this.a == jVar.a) {
            return true;
        }
        return false;
    }
}
