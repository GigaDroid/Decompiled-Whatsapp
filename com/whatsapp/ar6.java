package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

class ar6 implements OnItemClickListener {
    private static final String[] z;
    final ConversationsFragment a;

    static {
        String[] strArr = new String[7];
        String str = "v\\\f\u007fHwO\u0010j";
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
                        i3 = 20;
                        break;
                    case at.g /*1*/:
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = 99;
                        break;
                    case at.o /*3*/:
                        i3 = 30;
                        break;
                    default:
                        i3 = 44;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "wA\rhIf]\u0002jE{@\u00101OxG\u0000u\u0003z[\u000fr\u0003dA\u0010>";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "fA\u0014AEp";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "e[\u0006lU";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "4^\fm\u0011";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "}@\u0013kXKC\u0006jD{J";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "wA\rhIf]\u0002jE{@\u00101OxG\u0000u\u0003~G\u0007>";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ar6(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = DialogToastActivity.f;
        a9l com_whatsapp_a9l = (a9l) view.getTag();
        if (com_whatsapp_a9l == null) {
            Log.i(z[2] + i);
            return;
        }
        String a = com_whatsapp_a9l.h.a();
        if (a != null) {
            Log.i(z[1] + a + z[5] + i);
            l5 d = qa.d(a);
            if (com_whatsapp_a9l.i.getVisibility() != 0) {
                if (l5.b(a)) {
                    if (App.Q()) {
                        co m = App.aK.m(a);
                        if (m != null) {
                            App.aK.a(qm.a(a, m.c(), (Vector) m.Q, 2));
                            bq.a(new pv(this, a, m));
                            if (!z) {
                                return;
                            }
                        }
                        return;
                    }
                    App.a(this.a.getActivity(), 2131231518, 0);
                    if (!z) {
                        return;
                    }
                }
                if (z[0].equals(a)) {
                    this.a.startActivity(new Intent(this.a.getActivity(), Broadcasts.class));
                    if (!z) {
                        return;
                    }
                }
                if (!d.A()) {
                    Intent a2 = Conversation.a(d);
                    if (com_whatsapp_a9l.h instanceof df) {
                        a2.putExtra(z[3], ((df) com_whatsapp_a9l.h).b);
                        a2.putExtra(z[4], g7.a(ConversationsFragment.j(this.a)));
                        View currentFocus = this.a.getActivity().getCurrentFocus();
                        if (currentFocus != null) {
                            ((InputMethodManager) App.z().getSystemService(z[6])).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
                        }
                    }
                    this.a.startActivity(a2);
                }
            }
        }
    }
}
