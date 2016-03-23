package org;

import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

public abstract class K {
    private static final SocketFactory a;
    public static int b;
    private static final ServerSocketFactory c;

    static {
        a = SocketFactory.getDefault();
        c = ServerSocketFactory.getDefault();
    }
}
