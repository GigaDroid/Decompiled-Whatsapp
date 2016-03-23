package com.whatsapp.gdrive;

class d8 implements as {
    long a;
    final l b;

    public boolean a() {
        return GoogleDriveService.r(this.b.c).a();
    }

    public void a(long j) {
        this.a += j;
        if (j > 0) {
            GoogleDriveService.f(this.b.c).j(this.a, this.b.a.b());
        }
    }

    d8(l lVar) {
        this.b = lVar;
        this.a = 0;
    }
}
