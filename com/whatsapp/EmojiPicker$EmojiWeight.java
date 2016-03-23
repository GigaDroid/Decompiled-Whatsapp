package com.whatsapp;

import java.io.Serializable;
import java.util.Arrays;

class EmojiPicker$EmojiWeight implements Serializable {
    private static final long serialVersionUID = 1;
    @Deprecated
    int code;
    int[] emoji;
    @Deprecated
    int modifier;
    float weight;

    public boolean compareEmoji(int[] iArr) {
        return Arrays.equals(this.emoji, iArr);
    }

    public EmojiPicker$EmojiWeight(int[] iArr, float f) {
        this.emoji = iArr;
        this.weight = f;
    }
}
