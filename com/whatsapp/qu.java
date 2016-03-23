package com.whatsapp;

class qu implements a23 {
    final aij a;

    public void a() {
    }

    public void a(int i) {
        aij.e(this.a).dismiss();
        int selectionStart = aij.f(this.a).getSelectionStart();
        int selectionEnd = aij.f(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(aij.f(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a28.b(i));
        if (aij.b(this.a) <= 0 || a28.c(stringBuilder) <= aij.b(this.a)) {
            aij.f(this.a).setText(stringBuilder);
            selectionStart = a28.d(i);
            if (selectionEnd <= aij.f(this.a).length() - selectionStart) {
                aij.f(this.a).setSelection(selectionStart + selectionEnd);
            }
        }
    }

    qu(aij com_whatsapp_aij) {
        this.a = com_whatsapp_aij;
    }
}
