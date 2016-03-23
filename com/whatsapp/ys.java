package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog.Builder;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.util.ap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class ys extends ap {
    private static final String[] z;
    final ConversationRowContact b;

    static {
        String[] strArr = new String[9];
        String str = "\"Uy$7p\u000e\"#,+U~54:\u000fn;)eEa{";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 33;
                        break;
                    case at.i /*2*/:
                        i3 = 13;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 68;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\"Uy$7p\u000e\"#3=\u000fz<%>Rl$4dBb9k.Nz:(%@i{";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "@+";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "+Oi&+#E#=*>Dc j/Yy&%drX\u0016\u000e\u000fbY";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ">Du k:Ml=*";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "+Oi&+#E#=*>Dc j+By=+$\u000f^\u0011\n\u000e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "+Oi&+#E#=*>Dc j/Yy&%duH\f\u0010";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "+Oi&+#E#=*>Dc j/Yy&%dd@\u0015\r\u0006";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "9L~n";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(View view) {
        boolean z = DialogToastActivity.f;
        if (ConversationRowContact.c(ConversationRowContact.e(this.b))) {
            CharSequence string;
            Collection d = ConversationRowContact.d(ConversationRowContact.e(this.b));
            if (d.isEmpty() && ConversationRowContact.a(this.b) != null && ConversationRowContact.a(this.b).size() == 1) {
                b((String) ConversationRowContact.a(this.b).get(0));
                if (!z) {
                    return;
                }
            }
            if ((ConversationRowContact.a(this.b) == null || ConversationRowContact.a(this.b).isEmpty()) && d.size() == 1) {
                a((String) d.get(0));
                if (!z) {
                    return;
                }
            }
            List arrayList = new ArrayList(ConversationRowContact.a(this.b).size() + d.size());
            arrayList.addAll(ConversationRowContact.a(this.b));
            arrayList.addAll(d);
            if (TextUtils.isEmpty(ConversationRowContact.e(this.b).j.e)) {
                string = this.b.getContext().getString(2131231385);
            } else {
                string = this.b.getContext().getString(2131231387, new Object[]{ConversationRowContact.e(this.b).j.e});
            }
            new Builder(this.b.getContext()).setTitle(string).setItems((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), new ca(this, arrayList)).create().show();
        }
    }

    private ys(ConversationRowContact conversationRowContact) {
        this.b = conversationRowContact;
    }

    ys(ConversationRowContact conversationRowContact, ee eeVar) {
        this(conversationRowContact);
    }

    static void a(ys ysVar, String str) {
        ysVar.b(str);
    }

    static void b(ys ysVar, String str) {
        ysVar.a(str);
    }

    private void b(String str) {
        App.a(this.b.getContext(), Uri.parse(z[1] + str), this.b.getContext().getString(2131232144, new Object[]{z[0]}));
    }

    private void a(String str) {
        asx.a(new Intent(z[6]).setType(z[5]).putExtra(z[8], new String[]{str}).putExtra(z[4], this.b.getContext().getString(2131232143)).putExtra(z[7], this.b.getContext().getString(2131232142, new Object[]{z[2]}) + z[3]), this.b.getContext(), null, this.b.getContext().getString(2131231388));
    }
}
