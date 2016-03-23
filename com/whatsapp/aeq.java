package com.whatsapp;

class aeq {
    String a;
    String b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof aeq)) {
            return false;
        }
        aeq com_whatsapp_aeq = (aeq) obj;
        if (this.a == null) {
            if (com_whatsapp_aeq.a != null) {
                return false;
            }
        } else if (!this.a.equals(com_whatsapp_aeq.a)) {
            return false;
        }
        if (this.b == null) {
            if (com_whatsapp_aeq.b != null) {
                return false;
            }
            return true;
        } else if (this.b.equals(com_whatsapp_aeq.b)) {
            return true;
        } else {
            return false;
        }
    }

    aeq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.a == null ? 0 : this.a.hashCode()) + 31) * 31;
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode + i;
    }
}
