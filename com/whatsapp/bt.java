package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.ConversationRowImage.RowImageView;
import com.whatsapp.protocol.co;
import com.whatsapp.util.bi;

class bt implements bi {
    final ConversationRowImage a;

    bt(ConversationRowImage conversationRowImage) {
        this.a = conversationRowImage;
    }

    public void a(ImageView imageView, Bitmap bitmap, co coVar) {
        if (bitmap != null) {
            RowImageView.a(ConversationRowImage.a(this.a), bitmap);
            ConversationRowImage.a(this.a).invalidate();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        ConversationRowImage.a(this.a).setImageResource(2130839629);
    }

    public int a() {
        View decorView = ((Activity) this.a.getContext()).getWindow().getDecorView();
        return (Math.min(decorView.getWidth(), decorView.getHeight()) * 70) / 100;
    }
}
