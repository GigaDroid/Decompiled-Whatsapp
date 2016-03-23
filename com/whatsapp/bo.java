package com.whatsapp;

import android.support.v7.widget.SearchView.OnQueryTextListener;

class bo implements OnQueryTextListener {
    final DocumentPickerActivity a;

    public boolean onQueryTextChange(String str) {
        DocumentPickerActivity.a(this.a, str);
        DocumentPickerActivity.a(this.a, ael.h(str));
        DocumentPickerActivity.a(this.a, DocumentPickerActivity.b(this.a));
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }

    bo(DocumentPickerActivity documentPickerActivity) {
        this.a = documentPickerActivity;
    }
}
