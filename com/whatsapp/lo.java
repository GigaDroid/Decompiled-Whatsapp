package com.whatsapp;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.ConversationRowDivider.EncryptionChangeDialogFragment;
import com.whatsapp.ConversationRowDivider.IdentityChangeDialogFragment;

class lo implements OnClickListener {
    final ConversationRowDivider a;

    lo(ConversationRowDivider conversationRowDivider) {
        this.a = conversationRowDivider;
    }

    public void onClick(View view) {
        boolean z = DialogToastActivity.f;
        switch ((int) this.a.e.z) {
            case arj.Toolbar_collapseIcon /*18*/:
                String str;
                if (this.a.e.t == null) {
                    str = this.a.e.k.c;
                } else {
                    str = this.a.e.t;
                }
                IdentityChangeDialogFragment.a(str).show(((AppCompatActivity) this.a.getContext()).getSupportFragmentManager(), null);
                if (!z) {
                    return;
                }
                break;
            case arj.Toolbar_collapseContentDescription /*19*/:
                break;
        }
        EncryptionChangeDialogFragment.a(this.a.e.k.c).show(((AppCompatActivity) this.a.getContext()).getSupportFragmentManager(), null);
        if (z) {
            this.a.e();
        }
    }
}
