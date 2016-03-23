package com.whatsapp.gdrive;

class eo extends Exception {
    public eo(Throwable th) {
        super(th);
    }

    public eo(String str, Throwable th) {
        super(str, th);
    }

    public eo(String str) {
        super(str);
    }
}
