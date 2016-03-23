package com.whatsapp.gallerypicker;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;

class au implements OnCreateContextMenuListener {
    final GalleryPickerFragment a;

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        GalleryPickerFragment.a(this.a, contextMenu, contextMenuInfo);
    }

    au(GalleryPickerFragment galleryPickerFragment) {
        this.a = galleryPickerFragment;
    }
}
