package com.whatsapp.util;

import android.app.Activity;
import android.graphics.Bitmap;

class as extends Thread {
    final bb a;

    public void run() {
        do {
            try {
                if (bs.a(bb.c(this.a)).size() == 0) {
                    synchronized (bs.a(bb.c(this.a))) {
                        bs.a(bb.c(this.a)).wait();
                    }
                }
                if (bs.a(bb.c(this.a)).size() != 0) {
                    v vVar;
                    synchronized (bs.a(bb.c(this.a))) {
                        if (bs.a(bb.c(this.a)).size() != 0) {
                            vVar = (v) bs.a(bb.c(this.a)).pop();
                        } else {
                            vVar = null;
                        }
                    }
                    if (vVar != null) {
                        Bitmap a = bb.a(this.a, vVar);
                        synchronized (bb.a(this.a)) {
                            bb.a(this.a).put(vVar.c, a != null ? a : bb.a());
                        }
                        if (vVar.b.getTag().equals(vVar.c)) {
                            ((Activity) vVar.b.getContext()).runOnUiThread(new y(this.a, a, vVar.b, vVar.c));
                        }
                    }
                }
            } catch (InterruptedException e) {
                return;
            }
        } while (!Thread.interrupted());
    }

    private as(bb bbVar) {
        this.a = bbVar;
    }

    as(bb bbVar, by byVar) {
        this(bbVar);
    }
}
