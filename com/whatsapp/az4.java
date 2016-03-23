package com.whatsapp;

class az4 implements a23 {
    final ProfilePhotoReminder a;

    az4(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }

    public void a(int i) {
        ProfilePhotoReminder.d(this.a).dismiss();
        int selectionStart = ProfilePhotoReminder.b(this.a).getSelectionStart();
        int selectionEnd = ProfilePhotoReminder.b(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(ProfilePhotoReminder.b(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a28.b(i));
        if (a28.c(stringBuilder) <= 25) {
            ProfilePhotoReminder.b(this.a).setText(stringBuilder);
            if (selectionEnd <= ProfilePhotoReminder.b(this.a).length() - a28.d(i)) {
                ProfilePhotoReminder.b(this.a).setSelection(selectionEnd + a28.d(i));
            }
        }
    }

    public void a() {
    }
}
