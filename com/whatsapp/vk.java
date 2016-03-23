package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;

class vk extends AsyncTask {
    final GroupChatInfo a;

    protected void a(Bitmap bitmap) {
        this.a.a(bitmap, 2130837615, 2131623953);
    }

    vk(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    protected Bitmap a(Void[] voidArr) {
        return GroupChatInfo.z(this.a).a(640, 0.0f, false);
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
