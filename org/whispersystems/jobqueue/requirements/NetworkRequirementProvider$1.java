package org.whispersystems.jobqueue.requirements;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class NetworkRequirementProvider$1 extends BroadcastReceiver {
    final e a;

    public void onReceive(Context context, Intent intent) {
        if (e.b(this.a) != null && e.a(this.a).a()) {
            e.b(this.a).a();
        }
    }
}
