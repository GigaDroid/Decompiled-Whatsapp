package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;

class bw implements OnClickListener {
    final PromptDialogFragment a;
    final int b;

    public void onClick(View view) {
        this.a.b.c(this.b);
        this.a.dismiss();
    }

    bw(PromptDialogFragment promptDialogFragment, int i) {
        this.a = promptDialogFragment;
        this.b = i;
    }
}
