package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.whatsapp.ConversationTextEntry;

class bu implements OnClickListener {
    final ImageButton a;
    final q b;
    final ConversationTextEntry c;

    public void onClick(View view) {
        int i = MediaGalleryFragmentBase.e;
        if (ImagePreview.u(this.b.a).isShowing()) {
            ImagePreview.u(this.b.a).dismiss();
            if (i == 0) {
                return;
            }
        }
        ImagePreview.u(this.b.a).a(this.a, this.a, this.a, this.c);
        int childCount = ImagePreview.e(this.b.a).getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            ImageButton imageButton = (ImageButton) ImagePreview.e(this.b.a).getChildAt(i2).findViewById(2131755508);
            if (imageButton != null) {
                imageButton.setImageResource(2130839607);
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    bu(q qVar, ImageButton imageButton, ConversationTextEntry conversationTextEntry) {
        this.b = qVar;
        this.a = imageButton;
        this.c = conversationTextEntry;
    }
}
