package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;

class em implements OnClickListener {
    final PromptDialogFragment a;
    final int b;

    em(PromptDialogFragment promptDialogFragment, int i) {
        this.a = promptDialogFragment;
        this.b = i;
    }

    public void onClick(View view) {
        this.a.b.b(this.b);
        this.a.dismiss();
    }
}
