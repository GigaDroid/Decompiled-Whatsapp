package com.whatsapp;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.protocol.co;
import com.whatsapp.util.bi;

class t8 implements bi {
    final ConversationRowDocument a;

    t8(ConversationRowDocument conversationRowDocument) {
        this.a = conversationRowDocument;
    }

    public int a() {
        return (int) (252.0f * a4d.a().g);
    }

    public void a(ImageView imageView, Bitmap bitmap, co coVar) {
        if (bitmap != null) {
            ConversationRowDocument.a(this.a).setImageBitmap(bitmap);
        }
    }
}
