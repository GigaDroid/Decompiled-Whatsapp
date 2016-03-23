package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;

final class av2 extends Handler {
    av2(Looper looper, asi com_whatsapp_asi) {
        this(looper);
    }

    public void handleMessage(Message message) {
        EmojiPicker$EmojiImageView emojiPicker$EmojiImageView = (EmojiPicker$EmojiImageView) message.obj;
        int i = message.arg1;
        Drawable b = aol.b(App.z(), i);
        if (b != null) {
            if (emojiPicker$EmojiImageView != null) {
                emojiPicker$EmojiImageView.setTag(b);
                Message.obtain(aol.e(), 0, i, 0, emojiPicker$EmojiImageView).sendToTarget();
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            Message.obtain(aol.e(), 1, i, 0, b).sendToTarget();
        }
    }

    private av2(@NonNull Looper looper) {
        super((Looper) auv.a((Object) looper));
    }
}
