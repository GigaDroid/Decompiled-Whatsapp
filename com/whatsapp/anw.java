package com.whatsapp;

public class anw {
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        anw com_whatsapp_anw = (anw) obj;
        if (this.e != null) {
            return this.e.equals(com_whatsapp_anw.e);
        }
        if (com_whatsapp_anw.e != null) {
            return false;
        }
        return true;
    }
}
