package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.b7;
import com.whatsapp.util.ap;

class yp extends ap {
    final ConversationRowMedia b;

    public void a(View view) {
        MediaData mediaData = (MediaData) this.b.e.Q;
        int i = (this.b.e.k.a && mediaData.file == null && this.b.e.q != null) ? 1 : 0;
        if (this.b.e.k.a && i == 0) {
            if (b7.a(this.b.e.d, 2) >= 0) {
                App.a(this.b.getContext(), 2131231150, 0);
                return;
            }
            if (mediaData.transcoder != null) {
                mediaData.transcoder.b();
            }
            if (mediaData.uploader != null) {
                mediaData.uploader.b();
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            return;
        }
        mediaData.downloader.d();
    }

    yp(ConversationRowMedia conversationRowMedia) {
        this.b = conversationRowMedia;
    }
}
