package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.whatsapp.ConversationRowDocument.DocumentWarningDialogFragment;
import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.at;

class s9 implements OnItemClickListener {
    private static final String z;
    final DocumentsGalleryFragment a;

    static {
        char[] toCharArray = "n.\b\u0000Vf$B\u001bW{%\u0002\u0006\u0017n#\u0018\u001bVan:;|X".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 15;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.o /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    s9(DocumentsGalleryFragment documentsGalleryFragment) {
        this.a = documentsGalleryFragment;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = DialogToastActivity.f;
        co a = DocumentsGalleryFragment.c(this.a).a(i);
        if (DocumentsGalleryFragment.b(this.a).a()) {
            DocumentsGalleryFragment.b(this.a).c(a);
            DocumentsGalleryFragment.c(this.a).notifyDataSetChanged();
            if (!z) {
                return;
            }
        }
        MediaData mediaData = (MediaData) a.Q;
        if (mediaData.file == null || !mediaData.file.exists()) {
            App.a((DialogToastActivity) this.a.getActivity());
            if (!z) {
                return;
            }
        }
        if (mediaData.suspiciousContent == MediaData.SUSPICIOUS_CONTENT_YES) {
            DocumentWarningDialogFragment.a(a.I).show(((AppCompatActivity) this.a.getContext()).getSupportFragmentManager(), null);
            if (!z) {
                return;
            }
        }
        Intent intent = new Intent(z);
        intent.setDataAndType(Uri.fromFile(mediaData.file), a.n);
        App.a(this.a.getContext(), intent);
    }
}
