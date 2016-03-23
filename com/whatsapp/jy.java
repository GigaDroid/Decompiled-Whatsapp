package com.whatsapp;

class jy implements Runnable {
    final _c a;

    jy(_c _cVar) {
        this.a = _cVar;
    }

    public void run() {
        this.a.a.bc.setFastScrollEnabled(false);
        this.a.a.bc.setTranscriptMode(2);
        this.a.a.bc.setSelection(0);
    }
}
