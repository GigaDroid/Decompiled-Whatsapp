package com.whatsapp.util.undobar;

import android.view.View;
import android.view.View.OnClickListener;

class e implements OnClickListener {
    final UndoBarController a;

    public void onClick(View view) {
        if (UndoBarController.a(this.a) != null) {
            UndoBarController.a(this.a).b(UndoBarController.b(this.a));
        }
        UndoBarController.a(this.a, false);
    }

    e(UndoBarController undoBarController) {
        this.a = undoBarController;
    }
}
