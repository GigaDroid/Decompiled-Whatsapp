package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.protocol.co;
import com.whatsapp.util.bi;

class a9e implements bi {
    final ConversationRowVideo a;

    public void a(ImageView imageView, Bitmap bitmap, co coVar) {
        if (bitmap != null) {
            ConversationRowVideo.b(this.a).setImageDrawable(new BitmapDrawable(this.a.getContext().getResources(), bitmap));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        ConversationRowVideo.b(this.a).setImageDrawable(new ColorDrawable(this.a.getResources().getColor(2131623992)));
    }

    public int a() {
        View decorView = ((Activity) this.a.getContext()).getWindow().getDecorView();
        return (Math.min(decorView.getWidth(), decorView.getHeight()) * 70) / 100;
    }

    a9e(ConversationRowVideo conversationRowVideo) {
        this.a = conversationRowVideo;
    }
}
