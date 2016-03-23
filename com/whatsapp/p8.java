package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.whatsapp.ConversationRowContact.AddOrEditContactDialogFragment;

class p8 extends AsyncTask {
    final AddOrEditContactDialogFragment a;

    p8(AddOrEditContactDialogFragment addOrEditContactDialogFragment) {
        this.a = addOrEditContactDialogFragment;
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Bitmap bitmap) {
        if (this.a.isAdded() && bitmap != null) {
            AddOrEditContactDialogFragment.a(this.a, bitmap);
            AddOrEditContactDialogFragment.a(this.a, true);
        }
    }

    protected Bitmap a(Void[] voidArr) {
        return AddOrEditContactDialogFragment.b(this.a).a(96, 0.0f, true);
    }
}
