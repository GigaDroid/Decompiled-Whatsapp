package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationRowContact.MessageSharedContactDialogFragment;
import com.whatsapp.util.bu;
import java.util.List;

class al7 implements OnClickListener {
    final MessageSharedContactDialogFragment a;
    final List b;

    al7(MessageSharedContactDialogFragment messageSharedContactDialogFragment, List list) {
        this.a = messageSharedContactDialogFragment;
        this.b = list;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        bu.a(((a96) this.b.get(i)).a, this.a.getContext());
    }
}
