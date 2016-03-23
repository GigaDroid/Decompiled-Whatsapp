package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import java.util.Map;

class aky extends akc {
    final LinksGalleryFragment a;

    public void a(Collection collection, String str, Map map, boolean z) {
        boolean z2 = DialogToastActivity.f;
        if (!(collection == null || collection.isEmpty())) {
            for (co coVar : collection) {
                if (coVar.k.c.equals(LinksGalleryFragment.f(this.a))) {
                    LinksGalleryFragment.c(this.a);
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
        if (str == null || str.equals(LinksGalleryFragment.f(this.a))) {
            LinksGalleryFragment.c(this.a);
        }
    }

    public void a(Collection collection, Map map) {
        boolean z = DialogToastActivity.f;
        for (co coVar : collection) {
            if (coVar.k.c.equals(LinksGalleryFragment.f(this.a))) {
                LinksGalleryFragment.c(this.a);
                if (!z) {
                    return;
                }
            }
            if (z) {
                return;
            }
        }
    }

    aky(LinksGalleryFragment linksGalleryFragment) {
        this.a = linksGalleryFragment;
    }
}
