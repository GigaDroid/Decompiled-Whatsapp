package com.whatsapp.util.undobar;

class b implements Runnable {
    final UndoBarController a;

    b(UndoBarController undoBarController) {
        this.a = undoBarController;
    }

    public void run() {
        if (UndoBarController.a(this.a) instanceof a) {
            ((a) UndoBarController.a(this.a)).a(UndoBarController.b(this.a));
        }
        UndoBarController.a(this.a, false);
    }
}
