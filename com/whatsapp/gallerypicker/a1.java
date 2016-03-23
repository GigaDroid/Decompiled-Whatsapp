package com.whatsapp.gallerypicker;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class a1 implements OnItemClickListener {
    final GalleryPickerFragment a;

    a1(GalleryPickerFragment galleryPickerFragment) {
        this.a = galleryPickerFragment;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        GalleryPickerFragment.a(this.a, i, view);
    }
}
