package com.whatsapp;

class ef implements a23 {
    final RegisterName a;

    public void a(int i) {
        RegisterName.e(this.a).dismiss();
        int selectionStart = RegisterName.i(this.a).getSelectionStart();
        int selectionEnd = RegisterName.i(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(RegisterName.i(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a28.b(i));
        if (a28.c(stringBuilder) <= 25) {
            RegisterName.i(this.a).setText(stringBuilder);
            if (selectionEnd <= RegisterName.i(this.a).length() - a28.d(i)) {
                RegisterName.i(this.a).setSelection(selectionEnd + a28.d(i));
            }
        }
    }

    public void a() {
    }

    ef(RegisterName registerName) {
        this.a = registerName;
    }
}
