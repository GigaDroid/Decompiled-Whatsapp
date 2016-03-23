package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;

class cb implements OnClickListener {
    final PromptDialogFragment a;
    final int b;

    public void onClick(View view) {
        this.a.b.d(this.b);
        this.a.dismiss();
    }

    cb(PromptDialogFragment promptDialogFragment, int i) {
        this.a = promptDialogFragment;
        this.b = i;
    }
}
