package com.whatsapp.protocol;

class a8 extends a {
    final Runnable a;
    final by b;

    a8(by byVar, Runnable runnable) {
        this.b = byVar;
        this.a = runnable;
    }

    public void a(cw cwVar, String str) {
        long j = 0;
        String b = cwVar.b("t");
        if (b != null) {
            try {
                j = Long.parseLong(b);
            } catch (NumberFormatException e) {
            }
        }
        try {
            by.d(this.b).b(j);
            if (this.a != null) {
                this.a.run();
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public void a(cw cwVar) {
        by.d(this.b).b(0);
    }
}
