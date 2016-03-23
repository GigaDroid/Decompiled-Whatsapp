package org.whispersystems.jobqueue;

import android.content.Context;
import org.whispersystems.jobqueue.requirements.d;

public class u {
    public static boolean a;
    private final o b;

    public void a(Context context, v vVar) {
        boolean z = a;
        if (vVar instanceof g) {
            ((g) vVar).a(context);
        }
        for (d dVar : vVar.e()) {
            if (dVar instanceof g) {
                ((g) dVar).a(context);
                continue;
            }
            if (z) {
                v.d++;
                break;
            }
        }
        if (this.b != null) {
            this.b.a(vVar);
            for (d dVar2 : vVar.e()) {
                this.b.a(dVar2);
                if (z) {
                    return;
                }
            }
        }
    }

    public u(o oVar) {
        boolean z = a;
        this.b = oVar;
        if (v.d != 0) {
            a = !z;
        }
    }
}
