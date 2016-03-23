package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.gdrive.SettingsGoogleDrive;

class ar7 implements OnClickListener {
    final ConversationsFragment a;

    ar7(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a.getActivity(), SettingsGoogleDrive.class));
    }
}
