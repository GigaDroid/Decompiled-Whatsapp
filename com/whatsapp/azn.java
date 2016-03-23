package com.whatsapp;

import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class azn implements OnClickListener {
    private static final String[] z;
    final aol a;

    static {
        String[] strArr = new String[3];
        String str = "\rjAjB\u001blGnt!uAt";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 126;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = 40;
                        break;
                    case at.o /*3*/:
                        i3 = 4;
                        break;
                    default:
                        i3 = 29;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\rjAjB\u001blGnt!uAt";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001dnE*j\u0016`\\w|\u000eqwto\u001bgMvx\u0010bMw";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        int i = 0;
        if (aol.i(this.a) == null || !aol.i(this.a).isShowing()) {
            EmojiPicker$EmojiImageView emojiPicker$EmojiImageView = (EmojiPicker$EmojiImageView) view;
            if (EmojiPicker$EmojiImageView.a(emojiPicker$EmojiImageView) != null) {
                if (aqj.a(EmojiPicker$EmojiImageView.a(emojiPicker$EmojiImageView)) && aol.l().getInt(Integer.toString(EmojiPicker$EmojiImageView.a(emojiPicker$EmojiImageView)[0]), -1) < 0) {
                    aol.a(this.a, (EmojiPicker$EmojiImageView) view);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                if (aqj.a(EmojiPicker$EmojiImageView.a(emojiPicker$EmojiImageView))) {
                    SharedPreferences sharedPreferences = App.z().getSharedPreferences(z[1], 0);
                    int i2 = sharedPreferences.getInt(z[0], 0);
                    if (i2 < 3) {
                        sharedPreferences.edit().putInt(z[2], i2 + 1).commit();
                        aol com_whatsapp_aol = this.a;
                        i2 = EmojiPicker$EmojiImageView.a(emojiPicker$EmojiImageView)[0];
                        if (EmojiPicker$EmojiImageView.a(emojiPicker$EmojiImageView).length != 1) {
                            i = EmojiPicker$EmojiImageView.a(emojiPicker$EmojiImageView)[1];
                        }
                        aol.a(com_whatsapp_aol, i2, i);
                    }
                }
                aol.a(this.a, EmojiPicker$EmojiImageView.a(emojiPicker$EmojiImageView));
            }
        }
    }

    azn(aol com_whatsapp_aol) {
        this.a = com_whatsapp_aol;
    }
}
