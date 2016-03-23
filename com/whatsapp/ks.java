package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.GroupChatInfo.ExitGroupDialogFragment;

class ks extends AsyncTask {
    final aqi a;

    protected Object doInBackground(Object[] objArr) {
        return a(objArr);
    }

    ks(aqi com_whatsapp_aqi) {
        this.a = com_whatsapp_aqi;
    }

    protected Integer a(Object[] objArr) {
        return Integer.valueOf(ael.q(GroupChatInfo.z(this.a.a).p));
    }

    protected void onPostExecute(Object obj) {
        a((Integer) obj);
    }

    protected void a(Integer num) {
        this.a.a.e();
        ExitGroupDialogFragment.a(GroupChatInfo.z(this.a.a).p, num.intValue()).show(this.a.a.getSupportFragmentManager(), null);
    }
}
