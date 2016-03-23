package com.whatsapp;

import com.whatsapp.util.ax;
import java.util.Collection;

class xp implements tm {
    final BroadcastDetails a;

    public void a(Collection collection) {
    }

    public void c(String str) {
        if (ax.a(BroadcastDetails.d(this.a), (Object) str)) {
            BroadcastDetails.c(this.a).notifyDataSetChanged();
        }
    }

    public void d(String str) {
        if (ax.a(BroadcastDetails.d(this.a), (Object) str)) {
            BroadcastDetails.c(this.a).notifyDataSetChanged();
        }
    }

    xp(BroadcastDetails broadcastDetails) {
        this.a = broadcastDetails;
    }

    public void b(String str) {
        if (ax.a(BroadcastDetails.d(this.a), (Object) str)) {
            BroadcastDetails.c(this.a).notifyDataSetChanged();
        }
    }

    public void a() {
        BroadcastDetails.c(this.a).notifyDataSetChanged();
    }

    public void a(String str) {
        if (ax.a(BroadcastDetails.d(this.a), (Object) str)) {
            BroadcastDetails.c(this.a).notifyDataSetChanged();
        }
    }
}
