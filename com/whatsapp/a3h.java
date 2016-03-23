package com.whatsapp;

import android.os.AsyncTask;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import org.v;
import org.whispersystems.at;

class a3h extends AsyncTask {
    private static final String z;
    final ConversationsFragment a;
    final DialogFragment b;
    final l5 c;

    static {
        char[] toCharArray = ";Yi\u0011\u001f:tu\u0001\u001f:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 78;
                    break;
                case at.g /*1*/:
                    i2 = 55;
                    break;
                case at.i /*2*/:
                    i2 = 26;
                    break;
                case at.o /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 113;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a3h(ConversationsFragment conversationsFragment, l5 l5Var, DialogFragment dialogFragment) {
        this.a = conversationsFragment;
        this.c = l5Var;
        this.b = dialogFragment;
    }

    protected void a(Integer num) {
        FragmentActivity activity = this.a.getActivity();
        if (activity != null && !activity.isFinishing()) {
            ((by) activity).e();
            ConversationsFragment.a(this.a, this.c, this.b).getArguments().putInt(z, num.intValue());
            FragmentTransaction beginTransaction = this.a.getFragmentManager().beginTransaction();
            beginTransaction.add(this.b, null);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a(objArr);
    }

    protected Integer a(Object[] objArr) {
        return Integer.valueOf(ael.q(this.c.p));
    }

    protected void onPostExecute(Object obj) {
        a((Integer) obj);
    }
}
