package com.whatsapp.gallerypicker;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.whatsapp.ConversationTextEntry;
import org.v;
import org.whispersystems.at;

class y implements OnEditorActionListener {
    private static final String z;
    final ConversationTextEntry a;
    final q b;

    static {
        char[] toCharArray = "\u000bMN\u0011}=N[\u0010a\rG".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 62;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    y(q qVar, ConversationTextEntry conversationTextEntry) {
        this.b = qVar;
        this.a = conversationTextEntry;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        ((InputMethodManager) this.b.a.getSystemService(z)).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        return true;
    }
}
