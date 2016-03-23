package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;

class a4m extends AsyncTask {
    final Conversation a;

    a4m(Conversation conversation, an1 com_whatsapp_an1) {
        this(conversation);
    }

    protected Bitmap a(Void[] voidArr) {
        Bitmap a = this.a.aI.a(this.a.getResources().getDimensionPixelSize(2131427353), this.a.getResources().getDimension(2131427359), false);
        if (a == null) {
            return this.a.aI.w();
        }
        return a;
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    protected void a(Bitmap bitmap) {
        Conversation.p(this.a).setImageDrawable(new asn(this.a, this.a.getResources(), bitmap));
        Conversation.p(this.a).setVisibility(0);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    private a4m(Conversation conversation) {
        this.a = conversation;
    }
}
