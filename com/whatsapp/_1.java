package com.whatsapp;

class _1 implements a23 {
    final NewGroup a;

    _1(NewGroup newGroup) {
        this.a = newGroup;
    }

    public void a() {
    }

    public void a(int i) {
        NewGroup.b(this.a).dismiss();
        int selectionStart = NewGroup.c(this.a).getSelectionStart();
        int selectionEnd = NewGroup.c(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(NewGroup.c(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a28.b(i));
        if (a28.c(stringBuilder) <= a59.h) {
            NewGroup.c(this.a).setText(stringBuilder);
            if (selectionEnd <= NewGroup.c(this.a).length() - a28.d(i)) {
                NewGroup.c(this.a).setSelection(selectionEnd + a28.d(i));
            }
        }
    }
}
