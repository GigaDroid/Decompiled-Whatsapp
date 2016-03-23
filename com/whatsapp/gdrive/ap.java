package com.whatsapp.gdrive;

import android.annotation.TargetApi;
import android.text.TextUtils;
import com.whatsapp.ak2;
import com.whatsapp.at2;
import com.whatsapp.util.Log;
import com.whatsapp.vf;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.v;
import org.whispersystems.at;

class ap extends SSLSocket {
    private static final String[] z;
    private SSLSocket a;
    @ak2
    private final int b;

    static {
        String[] strArr = new String[7];
        String str = "\nc7+O";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 89;
                        break;
                    case at.g /*1*/:
                        i3 = 48;
                        break;
                    case at.i /*2*/:
                        i3 = 123;
                        break;
                    case at.o /*3*/:
                        i3 = 93;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ">T\t4\n<\u001f\u001a>\u001f6E\u0015)\u00157WV.\u0013:[\u001e)S*U\u000fp\u00197Q\u00191\u0019=\u001d\u000b/\u0013-_\u00182\u0010*\u001f\u00162\u00180V\u00128\u0018t\\\u0012.\bc\u0010";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ">T\t4\n<\u001f\u001a>\u001f6E\u0015)\u00157WV.\u0013:[\u001e)S*U\u000fp\u00197Q\u00191\u0019=\u001d\u000b/\u0013-_\u00182\u0010*\u001f\u0018(\u000e+U\u0015)Q5Y\b)Fy";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ">T\t4\n<\u001f\u001a>\u001f6E\u0015)\u00157WV.\u0013:[\u001e)S*U\u000fp\u00197Q\u00191\u0019=\u001d\u000b/\u0013-_\u00182\u0010*\u001f\u0018(\u000e+U\u0015)Q5Y\b)Fy";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "u\u0010";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "u\u0010";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "u\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    @TargetApi(9)
    public void setSSLParameters(SSLParameters sSLParameters) {
        this.a.setSSLParameters(sSLParameters);
    }

    public void setEnabledProtocols(String[] strArr) {
        boolean z = GoogleDriveService.c;
        if (strArr.length > 1) {
            String[] strArr2;
            List arrayList = new ArrayList();
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                Object obj = strArr[i];
                if (!z[0].equals(obj)) {
                    arrayList.add(obj);
                }
                i++;
                if (z) {
                    break;
                }
            }
            if (strArr.length != arrayList.size()) {
                Log.i(z[4] + TextUtils.join(z[1], strArr));
                Log.i(z[2] + TextUtils.join(z[6], arrayList));
            }
            SSLSocket sSLSocket = this.a;
            if (arrayList.size() > 0) {
                strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } else {
                strArr2 = strArr;
            }
            sSLSocket.setEnabledProtocols(strArr2);
            if (!z) {
                return;
            }
        }
        Log.i(z[3] + TextUtils.join(z[5], strArr));
        this.a.setEnabledProtocols(strArr);
    }

    public void setUseClientMode(boolean z) {
        this.a.setUseClientMode(z);
    }

    public boolean getWantClientAuth() {
        return this.a.getWantClientAuth();
    }

    public void connect(SocketAddress socketAddress, int i) {
        this.a.connect(socketAddress, i);
    }

    public InputStream getInputStream() {
        return new vf(this.a.getInputStream(), this.b);
    }

    public void setWantClientAuth(boolean z) {
        this.a.setWantClientAuth(z);
    }

    public String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.a.setEnabledCipherSuites(strArr);
    }

    public boolean getUseClientMode() {
        return this.a.getUseClientMode();
    }

    public SSLSession getSession() {
        return this.a.getSession();
    }

    public boolean isBound() {
        return this.a.isBound();
    }

    public void setKeepAlive(boolean z) {
        this.a.setKeepAlive(z);
    }

    public SocketAddress getLocalSocketAddress() {
        return this.a.getLocalSocketAddress();
    }

    public boolean getKeepAlive() {
        return this.a.getKeepAlive();
    }

    public String[] getEnabledCipherSuites() {
        return this.a.getEnabledCipherSuites();
    }

    public synchronized void setReceiveBufferSize(int i) {
        this.a.setReceiveBufferSize(i);
    }

    public synchronized int getSoTimeout() {
        return this.a.getSoTimeout();
    }

    public String[] getEnabledProtocols() {
        return this.a.getEnabledProtocols();
    }

    public int getPort() {
        return this.a.getPort();
    }

    public void shutdownInput() {
        this.a.shutdownInput();
    }

    public void shutdownOutput() {
        this.a.shutdownOutput();
    }

    @TargetApi(9)
    public SSLParameters getSSLParameters() {
        return this.a.getSSLParameters();
    }

    public void setTrafficClass(int i) {
        this.a.setTrafficClass(i);
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.a.getRemoteSocketAddress();
    }

    public boolean getTcpNoDelay() {
        return this.a.getTcpNoDelay();
    }

    public boolean getReuseAddress() {
        return this.a.getReuseAddress();
    }

    public void setSoLinger(boolean z, int i) {
        this.a.setSoLinger(z, i);
    }

    public synchronized void setSoTimeout(int i) {
        this.a.setSoTimeout(i);
    }

    public void setOOBInline(boolean z) {
        this.a.setOOBInline(z);
    }

    public void connect(SocketAddress socketAddress) {
        this.a.connect(socketAddress);
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public OutputStream getOutputStream() {
        return new at2(this.a.getOutputStream(), this.b);
    }

    public void setTcpNoDelay(boolean z) {
        this.a.setTcpNoDelay(z);
    }

    public void setEnableSessionCreation(boolean z) {
        this.a.setEnableSessionCreation(z);
    }

    public boolean getNeedClientAuth() {
        return this.a.getNeedClientAuth();
    }

    public boolean isOutputShutdown() {
        return this.a.isOutputShutdown();
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public synchronized int getReceiveBufferSize() {
        return this.a.getReceiveBufferSize();
    }

    public void setReuseAddress(boolean z) {
        this.a.setReuseAddress(z);
    }

    public boolean isConnected() {
        return this.a.isConnected();
    }

    public void setNeedClientAuth(boolean z) {
        this.a.setNeedClientAuth(z);
    }

    public String[] getSupportedProtocols() {
        return this.a.getSupportedProtocols();
    }

    public synchronized void close() {
        this.a.close();
    }

    public String toString() {
        return this.a.toString();
    }

    public boolean isClosed() {
        return this.a.isClosed();
    }

    public void sendUrgentData(int i) {
        this.a.sendUrgentData(i);
    }

    public ap(SSLSocket sSLSocket, @ak2 int i) {
        this.b = i;
        this.a = sSLSocket;
    }

    public InetAddress getInetAddress() {
        return this.a.getInetAddress();
    }

    public boolean getOOBInline() {
        return this.a.getOOBInline();
    }

    public SocketChannel getChannel() {
        return this.a.getChannel();
    }

    public InetAddress getLocalAddress() {
        return this.a.getLocalAddress();
    }

    public synchronized void setSendBufferSize(int i) {
        this.a.setSendBufferSize(i);
    }

    public void bind(SocketAddress socketAddress) {
        this.a.bind(socketAddress);
    }

    public void startHandshake() {
        this.a.startHandshake();
    }

    public boolean getEnableSessionCreation() {
        return this.a.getEnableSessionCreation();
    }

    public void setPerformancePreferences(int i, int i2, int i3) {
        this.a.setPerformancePreferences(i, i2, i3);
    }

    public int getLocalPort() {
        return this.a.getLocalPort();
    }

    public int getTrafficClass() {
        return this.a.getTrafficClass();
    }

    public int getSoLinger() {
        return this.a.getSoLinger();
    }

    public boolean isInputShutdown() {
        return this.a.isInputShutdown();
    }

    public synchronized int getSendBufferSize() {
        return this.a.getSendBufferSize();
    }
}
