package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.EmailConversationMediaChoiceDialogFragment;

class e_ implements OnClickListener {
    final EmailConversationMediaChoiceDialogFragment a;
    final l5 b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
        Conversation.a(this.a.getActivity(), (by) this.a.getActivity(), this.b, true);
    }

    e_(EmailConversationMediaChoiceDialogFragment emailConversationMediaChoiceDialogFragment, l5 l5Var) {
        this.a = emailConversationMediaChoiceDialogFragment;
        this.b = l5Var;
    }
}
