package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import java.util.Map;

class atz extends akc {
    final MediaGalleryFragment a;

    public void a(Collection collection, Map map) {
        boolean z = DialogToastActivity.f;
        for (co coVar : collection) {
            if (coVar.k.c.equals(MediaGalleryFragment.b(this.a))) {
                MediaGalleryFragment.a(this.a, false, false);
                if (!z) {
                    return;
                }
            }
            if (z) {
                return;
            }
        }
    }

    public void a(Collection collection, String str, Map map, boolean z) {
        boolean z2 = DialogToastActivity.f;
        if (!(collection == null || collection.isEmpty())) {
            for (co coVar : collection) {
                if (coVar.k.c.equals(MediaGalleryFragment.b(this.a))) {
                    MediaGalleryFragment.e(this.a).d();
                    MediaGalleryFragment.c(this.a).notifyDataSetChanged();
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
        if (str == null || str.equals(MediaGalleryFragment.b(this.a))) {
            MediaGalleryFragment.e(this.a).d();
            MediaGalleryFragment.d(this.a).notifyDataSetChanged();
        }
    }

    atz(MediaGalleryFragment mediaGalleryFragment) {
        this.a = mediaGalleryFragment;
    }
}
