package com.whatsapp.gdrive;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.whatsapp.ak2;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class f extends SSLSocketFactory {
    @Nullable
    private final d9 a;
    @NonNull
    private final SSLSocketFactory b;
    @ak2
    private final int c;

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return new ap((SSLSocket) this.b.createSocket(socket, this.a != null ? (String) this.a.a(str) : str, i, z), this.c);
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return new ap((SSLSocket) this.b.createSocket(this.a != null ? (String) this.a.a(str) : str, i, inetAddress, i2), this.c);
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return new ap((SSLSocket) this.b.createSocket(inetAddress, i), this.c);
    }

    public String[] getSupportedCipherSuites() {
        return this.b.getSupportedCipherSuites();
    }

    public f(@NonNull SSLSocketFactory sSLSocketFactory, @ak2 int i, @Nullable d9 d9Var) {
        this.c = i;
        this.b = sSLSocketFactory;
        this.a = d9Var;
    }

    public String[] getDefaultCipherSuites() {
        return this.b.getDefaultCipherSuites();
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return new ap((SSLSocket) this.b.createSocket(inetAddress, i, inetAddress2, i2), this.c);
    }

    public Socket createSocket(String str, int i) {
        String str2;
        if (this.a != null) {
            str2 = (String) this.a.a(str);
        } else {
            str2 = str;
        }
        return new ap((SSLSocket) this.b.createSocket(str2, i), this.c);
    }
}
