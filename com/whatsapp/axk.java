package com.whatsapp;

import java.util.Date;
import org.whispersystems.bp;

public final class axk {
    private final Date a;
    private final bp b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axk com_whatsapp_axk = (axk) obj;
        if (this.a == null ? com_whatsapp_axk.a != null : !this.a.equals(com_whatsapp_axk.a)) {
            return false;
        }
        if (this.b != null) {
            if (this.b.equals(com_whatsapp_axk.b)) {
                return true;
            }
        } else if (com_whatsapp_axk.b == null) {
            return true;
        }
        return false;
    }

    public bp b() {
        return this.b;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.b != null ? this.b.hashCode() : 0) * 31;
        if (this.a != null) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }

    public Date a() {
        return this.a;
    }

    public axk(bp bpVar, Date date) {
        this.b = bpVar;
        this.a = date;
    }
}
