package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.dns.i;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.impl.DefaultHttpClientConnection;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestExpectContinue;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class avp {
    private static final String[] z;

    static {
        String[] strArr = new String[19];
        String str = "C[be*JKrg*E@;}jX[";
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
                        i3 = 43;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 22;
                        break;
                    case at.o /*3*/:
                        i3 = 21;
                        break;
                    default:
                        i3 = 5;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "C[be*E@;adYHsa";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0002\u000f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "HCyf`";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    str = "C[bebN[9{j\u0006NrqwN\\epv";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "\u0002\u000f";
                    obj = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "C[be*INr8uY@bzfDC";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "ljB";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u000b\u0007";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0002\u000f";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "C[bebN[9pwY@d5-";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "C[be+H@x{`H[\u007fzk";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "~{P8=";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "C[beuD\\b:gJK;fqJ[cffDKs5";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "C[bebN[9|jN]dzw\u000b\u0007";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "C[bebN[9}q__sgwD]6=";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "C[be*INr`wG";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "h@x{`H[\u007fzk";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "C[bev";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static HttpResponse a(String str) {
        int i;
        int i2 = amb.a;
        try {
            if (TextUtils.isEmpty(str)) {
                Log.e(z[2]);
                return null;
            }
            try {
                URL url = new URL(str);
                try {
                    if (url.getProtocol().equals(z[1])) {
                        List b = b(url.getHost());
                        if (b == null) {
                            try {
                                Log.w(z[5]);
                                return null;
                            } catch (MalformedURLException e) {
                                throw e;
                            }
                        }
                        int defaultPort;
                        int port = url.getPort();
                        if (port == -1) {
                            defaultPort = url.getDefaultPort();
                        } else {
                            defaultPort = port;
                        }
                        try {
                            Collections.shuffle(b);
                            if (b.size() > 4) {
                                i = 4;
                            } else {
                                i = b.size();
                            }
                            HttpProcessor basicHttpProcessor = new BasicHttpProcessor();
                            basicHttpProcessor.addInterceptor(new RequestContent());
                            basicHttpProcessor.addInterceptor(new RequestTargetHost());
                            basicHttpProcessor.addInterceptor(new RequestUserAgent());
                            basicHttpProcessor.removeRequestInterceptorByClass(RequestExpectContinue.class);
                            int i3 = 0;
                            while (i3 < i) {
                                HttpParams basicHttpParams = new BasicHttpParams();
                                HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
                                HttpProtocolParams.setContentCharset(basicHttpParams, z[13]);
                                HttpProtocolParams.setUserAgent(basicHttpParams, vn.a());
                                HttpRequestExecutor httpRequestExecutor = new HttpRequestExecutor();
                                HttpContext basicHttpContext = new BasicHttpContext(null);
                                HttpClientConnection defaultHttpClientConnection = new DefaultHttpClientConnection();
                                InetAddress inetAddress = (InetAddress) b.get(i3);
                                try {
                                    Thread.sleep((long) ((int) (Math.random() * ((Math.pow(2.0d, (double) i3) - 1.0d) * 4000.0d))));
                                    Socket socket = new Socket();
                                    socket.connect(new InetSocketAddress(inetAddress, defaultPort), 60000);
                                    socket.setSoTimeout(60000);
                                    Socket createSocket = com.whatsapp.messaging.at.b().createSocket(socket, url.getHost(), defaultPort, true);
                                    basicHttpContext.setAttribute(z[12], defaultHttpClientConnection);
                                    if (!defaultHttpClientConnection.isOpen()) {
                                        defaultHttpClientConnection.bind(createSocket, basicHttpParams);
                                    }
                                    String path = url.getPath();
                                    if (url.getQuery() != null) {
                                        path = path + "?" + url.getQuery();
                                    }
                                    HttpRequest basicHttpRequest = new BasicHttpRequest(z[8], path);
                                    basicHttpRequest.addHeader(z[18], z[4]);
                                    basicHttpRequest.setParams(basicHttpParams);
                                    httpRequestExecutor.preProcess(basicHttpRequest, basicHttpProcessor, basicHttpContext);
                                    HttpResponse execute = httpRequestExecutor.execute(basicHttpRequest, defaultHttpClientConnection, basicHttpContext);
                                    execute.setParams(basicHttpParams);
                                    httpRequestExecutor.postProcess(execute, basicHttpProcessor, basicHttpContext);
                                    int statusCode = execute.getStatusLine().getStatusCode();
                                    if (statusCode < 500 || i3 == i - 1) {
                                        return execute;
                                    }
                                    if (!App.Q()) {
                                        return execute;
                                    }
                                    Log.w(z[14] + statusCode + z[9] + i3 + "/" + i + ")");
                                    if (i2 != 0) {
                                        return execute;
                                    }
                                    port = i3 + 1;
                                    if (i2 != 0) {
                                        break;
                                    }
                                    i3 = port;
                                } catch (MalformedURLException e2) {
                                    throw e2;
                                } catch (MalformedURLException e22) {
                                    throw e22;
                                } catch (IOException e3) {
                                    try {
                                        Log.w(z[15] + i3 + "/" + i + z[3] + e3.toString());
                                        if (i3 != i - 1) {
                                            if (!App.Q()) {
                                            }
                                        }
                                        throw e3;
                                    } catch (MalformedURLException e222) {
                                        throw e222;
                                    } catch (MalformedURLException e2222) {
                                        throw e2222;
                                    } catch (MalformedURLException e22222) {
                                        throw e22222;
                                    } catch (MalformedURLException e222222) {
                                        throw e222222;
                                    }
                                } catch (HttpException e4) {
                                    Log.w(z[16] + i3 + "/" + i + z[10] + e4.toString());
                                    if (i3 != i - 1) {
                                        if (!App.Q()) {
                                        }
                                    }
                                    throw e4;
                                } catch (Exception e5) {
                                    try {
                                        Log.w(z[11] + i3 + "/" + i + z[6] + e5.toString());
                                        if (i3 != i - 1) {
                                            if (!App.Q()) {
                                            }
                                        }
                                        throw e5;
                                    } catch (MalformedURLException e2222222) {
                                        throw e2222222;
                                    } catch (MalformedURLException e22222222) {
                                        throw e22222222;
                                    }
                                }
                            }
                            return null;
                        } catch (MalformedURLException e222222222) {
                            throw e222222222;
                        }
                    }
                    Log.e(z[7]);
                    return null;
                } catch (MalformedURLException e2222222222) {
                    throw e2222222222;
                }
            } catch (MalformedURLException e6) {
                Log.e(z[17]);
                return null;
            }
        } catch (MalformedURLException e22222222222) {
            throw e22222222222;
        }
    }

    private static List b(String str) {
        if (str != null) {
            return i.a().d(str);
        }
        Log.e(z[0]);
        return null;
    }
}
