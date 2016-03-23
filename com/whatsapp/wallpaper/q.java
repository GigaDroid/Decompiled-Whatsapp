package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class q implements OnCancelListener {
    final WallpaperPicker a;

    q(WallpaperPicker wallpaperPicker) {
        this.a = wallpaperPicker;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(1);
        this.a.finish();
    }
}
