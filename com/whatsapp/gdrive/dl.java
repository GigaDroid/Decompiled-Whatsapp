package com.whatsapp.gdrive;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

class dl implements ServiceConnection {
    final GoogleDriveActivity a;

    dl(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        GoogleDriveActivity.a(this.a, ((dg) iBinder).a());
        GoogleDriveActivity.p(this.a).open();
        GoogleDriveActivity.k(this.a).b(GoogleDriveActivity.j(this.a));
    }

    public void onServiceDisconnected(ComponentName componentName) {
        GoogleDriveActivity.k(this.a).a(GoogleDriveActivity.j(this.a));
        GoogleDriveActivity.a(this.a, null);
        GoogleDriveActivity.p(this.a).close();
    }
}
