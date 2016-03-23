package com.google;

final class bF extends aX {
    bF() {
    }

    public void a(eE eEVar, Object obj) {
        a(eEVar, (Boolean) obj);
    }

    public void a(eE eEVar, Boolean bool) {
        if (bool == null) {
            eEVar.b();
        } else {
            eEVar.a(bool.booleanValue());
        }
    }
}
