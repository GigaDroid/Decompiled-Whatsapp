package com.whatsapp;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v7.appcompat.R;
import android.widget.Toast;
import com.whatsapp.fieldstats.a;
import com.whatsapp.fieldstats.i;
import com.whatsapp.protocol.co;

class hp extends AsyncTask {
    private boolean a;
    private co b;
    private String c;
    final Conversation d;
    private ProgressDialog e;

    public nj a(Void[] voidArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nj a = App.aK.a(this.d.aI.p, this.b, this.a, this.c, 100, Conversation.ar(this.d));
        if (!(a == null || a.a == null)) {
            a.a.moveToPosition(Math.max(0, (a.a.getCount() - a.b) - 50));
        }
        DialogToastActivity.a(elapsedRealtime, 300);
        return a;
    }

    public void a(nj njVar) {
        this.e.dismiss();
        if (!isCancelled()) {
            if (njVar != null) {
                if (njVar.a != null) {
                    Conversation.ar(this.d).b();
                    this.d.bd.changeCursor(njVar.a);
                }
                this.d.bc.setTranscriptMode(0);
                this.d.bc.setSelectionFromTop(njVar.b + this.d.bc.getHeaderViewsCount(), this.d.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material));
                Conversation.a(this.d, null);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            Toast.makeText(this.d.getApplicationContext(), this.d.getString(2131231575), 0).show();
        }
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public hp(Conversation conversation, String str, boolean z, co coVar) {
        this.d = conversation;
        this.c = str;
        this.a = z;
        this.b = coVar;
        this.e = ProgressDialog.show(conversation, "", conversation.getString(2131231857), true, false);
        this.e.setCancelable(true);
        i.a(App.z(), a.CONTENT_SEARCH_C, Integer.valueOf(1));
    }

    public void onPostExecute(Object obj) {
        a((nj) obj);
    }
}
