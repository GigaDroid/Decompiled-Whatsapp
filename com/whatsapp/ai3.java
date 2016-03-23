package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.co;
import java.util.ArrayList;

public class ai3 extends AsyncTask {
    private ArrayList a;
    final MediaView b;

    public void a() {
        cancel(true);
    }

    public ai3(MediaView mediaView) {
        this.b = mediaView;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Integer num) {
        MediaView.a(this.b, this.a);
        MediaView.a(this.b, num.intValue());
        if (MediaView.g(this.b).size() > 0) {
            MediaView.o(this.b).notifyDataSetChanged();
            MediaView.b(this.b).setCurrentItem(MediaView.a(this.b), false);
            this.b.getSupportActionBar().setDisplayShowTitleEnabled(true);
            this.b.getSupportActionBar().setTitle(this.b.getString(2131231425, new Object[]{Integer.valueOf(MediaView.a(this.b) + 1), Integer.valueOf(MediaView.g(this.b).size())}));
            this.b.invalidateOptionsMenu();
        }
        this.b.setSupportProgressBarIndeterminateVisibility(false);
    }

    protected void onPostExecute(Object obj) {
        a((Integer) obj);
    }

    protected Integer a(Void[] voidArr) {
        boolean z = DialogToastActivity.f;
        Integer valueOf = Integer.valueOf(0);
        this.a = App.aK.b(MediaView.j(this.b), new m1(this));
        Integer num = valueOf;
        int i = 0;
        while (i < this.a.size()) {
            if (((co) this.a.get(i)).k.equals(MediaView.c(this.b))) {
                num = Integer.valueOf((this.a.size() - i) - 1);
                if (!z) {
                    break;
                }
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return num;
    }
}
