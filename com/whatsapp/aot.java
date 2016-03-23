package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.FragmentActivity;
import com.whatsapp.ConversationRow.GroupNameDialogFragment;
import java.util.List;

class aot implements OnClickListener {
    final GroupNameDialogFragment a;
    final String b;
    final List c;

    public void onClick(DialogInterface dialogInterface, int i) {
        FragmentActivity activity = this.a.getActivity();
        if (activity instanceof Conversation) {
            ((Conversation) activity).a(((a96) this.c.get(i)).c, this.b);
        }
    }

    aot(GroupNameDialogFragment groupNameDialogFragment, List list, String str) {
        this.a = groupNameDialogFragment;
        this.c = list;
        this.b = str;
    }
}
