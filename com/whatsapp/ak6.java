package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import java.util.Map;

class ak6 extends akc {
    final DocumentsGalleryFragment a;

    ak6(DocumentsGalleryFragment documentsGalleryFragment) {
        this.a = documentsGalleryFragment;
    }

    public void a(Collection collection, String str, Map map, boolean z) {
        boolean z2 = DialogToastActivity.f;
        if (!(collection == null || collection.isEmpty())) {
            for (co coVar : collection) {
                if (coVar.k.c.equals(DocumentsGalleryFragment.f(this.a))) {
                    DocumentsGalleryFragment.e(this.a);
                    if (!z2) {
                        break;
                    }
                }
                if (z2) {
                    break;
                }
            }
            if (!z2) {
                return;
            }
        }
        if (str == null || str.equals(DocumentsGalleryFragment.f(this.a))) {
            DocumentsGalleryFragment.e(this.a);
        }
    }

    public void a(Collection collection, Map map) {
        boolean z = DialogToastActivity.f;
        for (co coVar : collection) {
            if (coVar.k.c.equals(DocumentsGalleryFragment.f(this.a))) {
                DocumentsGalleryFragment.e(this.a);
                if (!z) {
                    return;
                }
            }
            if (z) {
                return;
            }
        }
    }
}
