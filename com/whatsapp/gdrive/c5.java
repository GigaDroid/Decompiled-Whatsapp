package com.whatsapp.gdrive;

class c5 implements as {
    final m a;

    c5(m mVar) {
        this.a = mVar;
    }

    public void a(long j) {
        GoogleDriveService.p(this.a.a).addAndGet(j);
        if (j > 0) {
            GoogleDriveService.f(this.a.a).a(GoogleDriveService.p(this.a.a).get(), GoogleDriveService.l(this.a.a).get(), GoogleDriveService.e(this.a.a));
        }
    }

    public boolean a() {
        return GoogleDriveService.c(this.a.a).a();
    }
}
