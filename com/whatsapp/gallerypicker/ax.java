package com.whatsapp.gallerypicker;

import android.app.Activity;
import android.widget.ImageButton;
import com.whatsapp.pz;

class ax extends pz {
    final ImagePreview k;

    ax(ImagePreview imagePreview, Activity activity) {
        this.k = imagePreview;
        super(activity);
    }

    public void dismiss() {
        int i = MediaGalleryFragmentBase.e;
        super.dismiss();
        int childCount = ImagePreview.e(this.k).getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            ImageButton imageButton = (ImageButton) ImagePreview.e(this.k).getChildAt(i2).findViewById(2131755508);
            if (imageButton != null) {
                imageButton.setImageResource(2130839605);
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }
}
