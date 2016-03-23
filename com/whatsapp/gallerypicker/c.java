package com.whatsapp.gallerypicker;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.whatsapp.gallerypicker.MediaGalleryFragmentBase.MediaItemView;

class c implements OnPreDrawListener {
    final ah a;
    final MediaItemView b;

    c(ah ahVar, MediaItemView mediaItemView) {
        this.a = ahVar;
        this.b = mediaItemView;
    }

    public boolean onPreDraw() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.b.getActivity().supportStartPostponedEnterTransition();
        return true;
    }
}
