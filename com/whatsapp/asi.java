package com.whatsapp;

import java.util.Comparator;

final class asi implements Comparator {
    public int a(EmojiPicker$EmojiWeight emojiPicker$EmojiWeight, EmojiPicker$EmojiWeight emojiPicker$EmojiWeight2) {
        return Float.compare(emojiPicker$EmojiWeight2.weight, emojiPicker$EmojiWeight.weight);
    }

    public int compare(Object obj, Object obj2) {
        return a((EmojiPicker$EmojiWeight) obj, (EmojiPicker$EmojiWeight) obj2);
    }

    asi() {
    }
}
