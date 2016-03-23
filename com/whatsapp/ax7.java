package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

class ax7 extends AsyncTask {
    private static final String z;
    final CallsFragment a;

    static {
        char[] toCharArray = "aM!ry-~(xxg_%]kn@>JkqGbzeKB\u000f\u007fiiK?q\u007flH".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 2;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 77;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(ArrayList arrayList) {
        CallsFragment.a(this.a, null);
        if (arrayList != null) {
            CallsFragment.a(this.a, arrayList);
            CallsFragment.h(this.a).getFilter().filter(CallsFragment.c(this.a));
        }
        CallsFragment.g(this.a);
        CallsFragment.f(this.a);
    }

    protected void a(ArrayList[] arrayListArr) {
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            CallsFragment.a(this.a, arrayList);
            CallsFragment.h(this.a).getFilter().filter(CallsFragment.c(this.a));
        }
    }

    protected ArrayList a(Void[] voidArr) {
        boolean z = DialogToastActivity.f;
        a57 k5Var = new k5(this);
        ArrayList a = App.aK.a(0, 100, k5Var);
        try {
            if (isCancelled()) {
                return null;
            }
            Object g;
            co coVar;
            rd rdVar;
            Log.i(z);
            ArrayList arrayList = new ArrayList();
            rd rdVar2 = new rd(this.a);
            try {
                g = Voip.g();
            } catch (Throwable e) {
                Log.a(e);
                g = null;
            }
            Iterator it = a.iterator();
            while (it.hasNext()) {
                coVar = (co) it.next();
                try {
                    if (coVar.k.equals(g) || rdVar2.b(coVar)) {
                        rdVar = rdVar2;
                    } else {
                        arrayList.add(rdVar2);
                        rdVar = new rd(this.a, coVar);
                    }
                    if (z) {
                        break;
                    }
                    rdVar2 = rdVar;
                } catch (UnsatisfiedLinkError e2) {
                    throw e2;
                }
            }
            rdVar = rdVar2;
            if (a.size() >= 100) {
                publishProgress(new ArrayList[]{new ArrayList(arrayList)});
                ArrayList a2 = App.aK.a(100, 1000, k5Var);
                try {
                    if (isCancelled()) {
                        return null;
                    }
                    Iterator it2 = a2.iterator();
                    rd rdVar3 = rdVar;
                    while (it2.hasNext()) {
                        coVar = (co) it2.next();
                        if (rdVar3.b(coVar)) {
                            rdVar = rdVar3;
                        } else {
                            arrayList.add(rdVar3);
                            rdVar = new rd(this.a, coVar);
                        }
                        if (!z) {
                            rdVar3 = rdVar;
                        }
                    }
                    rdVar = rdVar3;
                } catch (UnsatisfiedLinkError e22) {
                    throw e22;
                }
            }
            try {
                break;
                if (!rdVar.b()) {
                    arrayList.add(rdVar);
                }
                return arrayList;
            } catch (UnsatisfiedLinkError e222) {
                throw e222;
            }
        } catch (UnsatisfiedLinkError e2222) {
            throw e2222;
        }
    }

    ax7(CallsFragment callsFragment, xq xqVar) {
        this(callsFragment);
    }

    protected void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    protected void onProgressUpdate(Object[] objArr) {
        a((ArrayList[]) objArr);
    }

    private ax7(CallsFragment callsFragment) {
        this.a = callsFragment;
    }
}
