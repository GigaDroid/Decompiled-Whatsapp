package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.Conversation.CapturePictureOrVideoDialogFragment;
import org.v;
import org.whispersystems.at;

class su implements OnClickListener {
    final CapturePictureOrVideoDialogFragment a;

    public void onClick(DialogInterface dialogInterface, int i) {
        Conversation conversation = (Conversation) this.a.getActivity();
        switch (i) {
            case v.m /*0*/:
                Conversation.T(conversation);
                if (!DialogToastActivity.f) {
                    return;
                }
                break;
            case at.g /*1*/:
                break;
            default:
                return;
        }
        Conversation.F(conversation);
    }

    su(CapturePictureOrVideoDialogFragment capturePictureOrVideoDialogFragment) {
        this.a = capturePictureOrVideoDialogFragment;
    }
}
