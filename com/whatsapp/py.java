package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.io.File;

class py implements OnItemClickListener {
    final DocumentPickerActivity a;

    py(DocumentPickerActivity documentPickerActivity) {
        this.a = documentPickerActivity;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = DialogToastActivity.f;
        int headerViewsCount = i - this.a.a().getHeaderViewsCount();
        if (headerViewsCount < 0) {
            DocumentPickerActivity.h(this.a);
            if (!z) {
                return;
            }
        }
        File file = (File) DocumentPickerActivity.g(this.a).get(headerViewsCount);
        if (DocumentPickerActivity.c(this.a) != null) {
            DocumentPickerActivity.a(this.a, file);
            if (!z) {
                return;
            }
        }
        DocumentPickerActivity.k(this.a).clear();
        DocumentPickerActivity.k(this.a).add(file);
        DocumentPickerActivity.e(this.a);
    }
}
