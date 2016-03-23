package com.whatsapp;

import android.os.AsyncTask;

class eo extends AsyncTask {
    final SettingsChatHistory a;
    final boolean b;
    final long c;

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected void a(Void voidR) {
        App.a(false, false);
        this.a.e();
    }

    eo(SettingsChatHistory settingsChatHistory, boolean z, long j) {
        this.a = settingsChatHistory;
        this.b = z;
        this.c = j;
    }

    protected Object doInBackground(Object[] objArr) {
        return a(objArr);
    }

    protected Void a(Object[] objArr) {
        App.a(this.a, this.b);
        SettingsChatHistory.a(this.c, 300);
        return null;
    }
}
