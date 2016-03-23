package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;

final class tj extends Handler {
    private tj(@NonNull Looper looper) {
        super((Looper) auv.a((Object) looper));
    }

    tj(Looper looper, asi com_whatsapp_asi) {
        this(looper);
    }

    public void handleMessage(Message message) {
        if (message.obj != null) {
            int i = message.arg1;
            if (message.obj instanceof Drawable) {
                aol.a(i, (Drawable) message.obj);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            EmojiPicker$EmojiImageView emojiPicker$EmojiImageView = (EmojiPicker$EmojiImageView) message.obj;
            Drawable drawable = (Drawable) emojiPicker$EmojiImageView.getTag();
            aol.a(i, drawable);
            emojiPicker$EmojiImageView.setDrawable(i, drawable);
        }
    }
}
