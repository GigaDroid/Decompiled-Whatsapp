package com.whatsapp.gdrive;

class ay implements Runnable {
    final bb a;

    public void run() {
        GoogleDriveActivity.p(this.a.a).block();
        GoogleDriveActivity.c(this.a.a, 24);
        if (this.a.b != null) {
            GoogleDriveActivity.k(this.a.a).b(this.a.b);
        }
        if (this.a.c != null) {
            GoogleDriveActivity.k(this.a.a).a(this.a.c);
        }
        if (this.a.d.b != null) {
            GoogleDriveActivity.k(this.a.a).b(this.a.d.b);
        }
        if (this.a.d.a != null) {
            GoogleDriveActivity.k(this.a.a).a(this.a.d.a);
        }
        if (this.a.e != null) {
            GoogleDriveActivity.k(this.a.a).a(this.a.e);
            GoogleDriveActivity.k(this.a.a).an();
        }
        if (this.a.e != null) {
            GoogleDriveActivity.a(this.a.a, this.a.e);
        }
        GoogleDriveActivity.v(this.a.a);
    }

    ay(bb bbVar) {
        this.a = bbVar;
    }
}
