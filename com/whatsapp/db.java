package com.whatsapp;

import android.text.TextUtils;

public class db {
    final long a;
    final String b;

    public String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        db dbVar = (db) obj;
        if (this.a == dbVar.a && TextUtils.equals(this.b, dbVar.b)) {
            return true;
        }
        return false;
    }

    public db(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public int hashCode() {
        int hashCode;
        int i = ((int) (this.a ^ (this.a >>> 32))) * 31;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return this.a + ":" + this.b;
    }
}
