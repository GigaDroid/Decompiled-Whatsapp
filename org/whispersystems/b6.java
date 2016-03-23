package org.whispersystems;

public class b6 {
    private final String a;
    private final String b;

    public b6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String a() {
        if (this.a.compareTo(this.b) <= 0) {
            return this.a + this.b;
        }
        return this.b + this.a;
    }
}
