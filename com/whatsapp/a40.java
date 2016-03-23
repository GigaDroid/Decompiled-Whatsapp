package com.whatsapp;

import com.whatsapp.messaging.at;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

final class a40 implements LayeredSocketFactory {
    private final SSLSocketFactory a;
    final boolean b;

    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        if (socket == null) {
            socket = createSocket();
        }
        socket.bind(new InetSocketAddress(inetAddress, i2));
        socket.connect(new InetSocketAddress(str, i), HttpConnectionParams.getConnectionTimeout(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        return this.a.createSocket(socket, str, i, true);
    }

    public boolean isSecure(Socket socket) {
        return socket instanceof SSLSocket;
    }

    public Socket createSocket() {
        return this.a.createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.a.createSocket(socket, str, i, z);
    }

    a40(boolean z) {
        this.b = z;
        this.a = this.b ? at.b() : (SSLSocketFactory) SSLSocketFactory.getDefault();
    }
}
