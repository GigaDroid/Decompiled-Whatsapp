package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.VoipActivity.ReplyWithMessageDialogFragment;
import org.v;
import org.whispersystems.at;

class j7 implements OnClickListener {
    private static final String[] z;
    final String[] a;
    final ReplyWithMessageDialogFragment b;

    static {
        String[] strArr = new String[4];
        String str = "f\u001cn\rFf\u001co7";
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
                        i3 = 14;
                        break;
                    case at.g /*1*/:
                        i3 = 125;
                        break;
                    case at.i /*2*/:
                        i3 = 29;
                        break;
                    case at.o /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = 53;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "d\u0014y";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "y\u001cB&L~\u0018";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "}\u0015| PQ\u0010n5";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    j7(ReplyWithMessageDialogFragment replyWithMessageDialogFragment, String[] strArr) {
        this.b = replyWithMessageDialogFragment;
        this.a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        VoipActivity voipActivity = (VoipActivity) this.b.getActivity();
        Intent intent = new Intent(this.b.getActivity(), Conversation.class);
        String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            intent.putExtra(z[2], peerJid);
        }
        intent.addFlags(335544320);
        if (i != this.a.length - 1) {
            intent.putExtra(z[3], (byte) 0);
            intent.putExtra(z[1], this.a[i]);
            intent.putExtra(z[0], true);
            Conversation.ad = true;
        }
        this.b.getActivity().startActivity(intent);
        VoipActivity.g(voipActivity);
    }
}
