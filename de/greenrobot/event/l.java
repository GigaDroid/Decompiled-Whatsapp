package de.greenrobot.event;

class l extends ThreadLocal {
    final h a;

    l(h hVar) {
        this.a = hVar;
    }

    protected Object initialValue() {
        return a();
    }

    protected j a() {
        return new j();
    }
}
