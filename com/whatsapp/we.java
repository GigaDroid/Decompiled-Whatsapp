package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.cs;
import org.v;
import org.whispersystems.at;

class we implements OnClickListener {
    private static final String[] z;
    final Conversation a;

    static {
        String[] strArr = new String[7];
        String str = "e u\u0011Yt<z\u0013Ui!4\u000bSg+~\u0006Nj&~\u0015\u0013t*v\bJc'~\u0006Xc=;ORc8&";
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
                        i3 = 6;
                        break;
                    case at.g /*1*/:
                        i3 = 79;
                        break;
                    case at.i /*2*/:
                        i3 = 27;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "e u\u0011Yt<z\u0013Ui!4\u0004Nc.o\u0002\u0013j z\u0003Yg=w\u000eYt`i\u0002Qi9~\u000fYg+~\u0015";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "e u\u0011Yt<z\u0013Ui!4\u000bSg+~\u0006Nj&~\u0015\u0013n*z\u0003Yt,u\u0013\u001c";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "*ok\u0015Ypr";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "e u\u0011Yt<z\u0013Ui!4\u0004Nc.o\u0002\u0013j z\u0003Yg=w\u000eYt`s\u0002]b*i\u0004Rro";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "*ob\u0017Sur";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "e u\u0011Yt<z\u0013Ui!4\u000bSg+~\u0006Nj&~\u0015\u0013h:w\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        if (Conversation.i(this.a) == null) {
            Log.i(z[1]);
            return;
        }
        int count = this.a.bd.getCursor().getCount();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        if (this.a.bc.getChildCount() > 1 && (this.a.bc.getChildAt(1) instanceof ConversationRow)) {
            ConversationRow conversationRow = (ConversationRow) this.a.bc.getChildAt(1);
            i = conversationRow.d();
            boolean z2 = conversationRow.s;
            i2 = conversationRow.a();
            z = z2;
        }
        Conversation.j(this.a, true);
        int bottom = Conversation.i(this.a).getBottom();
        this.a.bd.changeCursor(App.aK.a(this.a.ae, Conversation.h(this.a, true), null, Conversation.ar(this.a)));
        this.a.bd.getCursor().requery();
        boolean O = App.aK.O(this.a.ae);
        if (!(O || Conversation.i(this.a) == null)) {
            Conversation.i(this.a).setVisibility(8);
            this.a.bc.removeHeaderView(Conversation.i(this.a));
            Log.i(z[5] + this.a.bc.getHeaderViewsCount());
            Conversation.a(this.a, null);
            Log.i(z[2]);
            this.a.bd.notifyDataSetChanged();
        }
        int count2 = this.a.bd.getCursor().getCount();
        Conversation.c(this.a, count2 - count);
        if (count2 != 0 && count2 > count && Conversation.P(this.a) < count2) {
            co b = this.a.bd.b(Conversation.P(this.a));
            co b2 = this.a.bd.b(Conversation.P(this.a) - 1);
            boolean a = (b == null || b2 == null) ? false : cs.a(b2.b, b.b);
            this.a.bc.setTranscriptMode(0);
            if (!(z && a)) {
                i = 0;
            }
            if (Conversation.g(this.a) && b.k.a == b2.k.a && !b.k.a && b.c == b2.c && b.c == null && b.t != null && b2.t != null && b.t.equals(b2.t)) {
                i += i2;
            }
            Conversation conversation = this.a;
            count = Conversation.P(this.a);
            int i3 = (!O || Conversation.P(this.a) >= count2 - 1) ? 0 : 1;
            Conversation.c(conversation, i3 + count);
            this.a.bc.setSelectionFromTop(Conversation.P(this.a), i + bottom);
        } else if (O && Conversation.i(this.a) != null) {
            Conversation.i(this.a).setVisibility(8);
            this.a.bc.removeHeaderView(Conversation.i(this.a));
            Log.i(z[3] + this.a.bc.getHeaderViewsCount());
            Conversation.a(this.a, null);
            Log.i(z[0] + count2 + z[4] + count + z[6] + Conversation.P(this.a) + ")");
            this.a.bd.notifyDataSetChanged();
        }
    }

    we(Conversation conversation) {
        this.a = conversation;
    }
}
