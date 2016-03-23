package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class g implements OnClickListener {
    final WallpaperPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
        this.a.finish();
    }

    g(WallpaperPicker wallpaperPicker) {
        this.a = wallpaperPicker;
    }
}
