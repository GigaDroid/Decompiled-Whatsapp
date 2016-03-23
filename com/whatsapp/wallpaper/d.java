package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class d implements OnClickListener {
    final WallpaperPicker a;

    d(WallpaperPicker wallpaperPicker) {
        this.a = wallpaperPicker;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
