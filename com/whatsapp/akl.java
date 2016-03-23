package com.whatsapp;

class akl implements w_ {
    private int a;
    private CharSequence b;

    public akl(CharSequence charSequence) {
        this.b = charSequence;
    }

    public int a() {
        if (this.a >= this.b.length()) {
            return 0;
        }
        int codePointAt = Character.codePointAt(this.b, this.a);
        this.a += Character.charCount(codePointAt);
        return (a28.a() && a28.a(codePointAt | 65536)) ? codePointAt | 65536 : codePointAt;
    }

    int a(int i, int i2) {
        int i3 = 0;
        boolean z = a28.a;
        if (i2 != -1) {
            int b = er.b(i2);
            int i4 = 0;
            while (i4 < b) {
                i3 += Character.charCount(Character.codePointAt(this.b, i + i3));
                i4++;
                if (z) {
                    break;
                }
            }
            if (!z) {
                return i3;
            }
        }
        return Character.charCount(Character.codePointAt(this.b, i));
    }

    void a(int i) {
        this.a = i;
    }
}
