package com.whatsapp.gdrive;

class bp implements er {
    final i a;

    public void a(long j) {
        if (this.a.a) {
            GoogleDriveService.o(this.a.e).addAndGet(j);
            if (j >= 10240) {
                GoogleDriveService.f(this.a.e).l(GoogleDriveService.o(this.a.e).get(), GoogleDriveService.i(this.a.e));
            }
        }
    }

    bp(i iVar) {
        this.a = iVar;
    }
}
