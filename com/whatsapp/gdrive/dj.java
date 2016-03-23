package com.whatsapp.gdrive;

import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;

class dj implements ConnPerRoute {
    final bc a;

    public int getMaxForRoute(HttpRoute httpRoute) {
        return 2;
    }

    dj(bc bcVar) {
        this.a = bcVar;
    }
}
