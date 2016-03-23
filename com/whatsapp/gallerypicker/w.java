package com.whatsapp.gallerypicker;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class w implements OnItemClickListener {
    final MediaPickerFragment a;

    w(MediaPickerFragment mediaPickerFragment) {
        this.a = mediaPickerFragment;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        f a = this.a.f.a(i);
        MediaPickerFragment.a(this.a, view);
        MediaPickerFragment.a(this.a, a);
    }
}
