package com.whatsapp;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ao;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.v;
import org.whispersystems.at;

public class a9v extends AsyncTask {
    private static final String[] z;
    final TosUpdateDetailsActivity a;

    static {
        String[] strArr = new String[7];
        String str = " L\u00174";
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
                        i3 = 6;
                        break;
                    case at.g /*1*/:
                        i3 = 32;
                        break;
                    case at.i /*2*/:
                        i3 = 116;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 126;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "rE\f}QnT\u0019e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "St2$F";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "nT\u0000y\r<\u000f[~\tq\u000e\u0003a\u001frS\u0015y\u000e(C\u001bdQjE\u0013h\u0012)C\u0018`\u001bhT[6\u000ejA\u0000o\u0011tMIh\u0010bR\u001b`\u001a L\u00134";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "rO\u0007|\u000ebA\u0000l\u001acT\u0015`\u0012u\u000f\u0018f\u001fbT\u001bz\u001acT\u0015`\u0012uT\u0015z\u0015&";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = " L\u00174";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "nT\u0000y\r<\u000f[~\tq\u000e\u0003a\u001frS\u0015y\u000e(C\u001bdQjE\u0013h\u0012)C\u0018`\u001bhT[6\u000ejA\u0000o\u0011tMIh\u0010bR\u001b`\u001a L\u00134";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(String str) {
        this.a.findViewById(2131755623).setVisibility(8);
        WebView webView = (WebView) this.a.findViewById(2131755664);
        if (str != null) {
            webView.loadDataWithBaseURL(z[1] + aqu.g() + z[0] + aqu.c(), str, z[2], z[3], null);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.findViewById(2131755918).setVisibility(0);
    }

    protected void onPostExecute(Object obj) {
        a((String) obj);
    }

    protected void onPreExecute() {
        this.a.findViewById(2131755623).setVisibility(0);
        this.a.findViewById(2131755918).setVisibility(8);
    }

    protected a9v(TosUpdateDetailsActivity tosUpdateDetailsActivity) {
        this.a = tosUpdateDetailsActivity;
    }

    protected String a(Void[] voidArr) {
        Closeable bufferedReader;
        Throwable th;
        Throwable th2;
        HttpURLConnection httpURLConnection = null;
        boolean z = DialogToastActivity.f;
        HttpURLConnection httpURLConnection2 = null;
        try {
            URLConnection openConnection = new URL(z[4] + aqu.g() + z[6] + aqu.c()).openConnection();
            if (openConnection instanceof HttpURLConnection) {
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) openConnection;
                try {
                    httpURLConnection3.setConnectTimeout(20000);
                    httpURLConnection3.setReadTimeout(20000);
                    httpURLConnection3.connect();
                    if (httpURLConnection3.getResponseCode() != 200) {
                        httpURLConnection3.disconnect();
                        if (httpURLConnection3 != null) {
                            try {
                                httpURLConnection3.disconnect();
                            } catch (Exception e) {
                                throw e;
                            }
                        }
                        ao.a(null);
                        return null;
                    }
                    InputStream inputStream = httpURLConnection3.getInputStream();
                    StringBuilder stringBuilder = new StringBuilder();
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    try {
                        String readLine = bufferedReader.readLine();
                        while (readLine != null) {
                            stringBuilder.append(readLine);
                            readLine = bufferedReader.readLine();
                            if (z) {
                                break;
                            }
                        }
                        String stringBuilder2 = stringBuilder.toString();
                        if (httpURLConnection3 != null) {
                            try {
                                httpURLConnection3.disconnect();
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }
                        ao.a(bufferedReader);
                        return stringBuilder2;
                    } catch (Throwable e3) {
                        th = e3;
                        httpURLConnection2 = httpURLConnection3;
                        th2 = th;
                        try {
                            Log.b(z[5], th2);
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            ao.a(bufferedReader);
                            return null;
                        } catch (Throwable th3) {
                            th2 = th3;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception e22) {
                                    throw e22;
                                }
                            }
                            ao.a(bufferedReader);
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        httpURLConnection = httpURLConnection3;
                        th2 = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        ao.a(bufferedReader);
                        throw th2;
                    }
                } catch (Throwable e32) {
                    bufferedReader = null;
                    HttpURLConnection httpURLConnection4 = httpURLConnection3;
                    th2 = e32;
                    httpURLConnection2 = httpURLConnection4;
                    Log.b(z[5], th2);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    ao.a(bufferedReader);
                    return null;
                } catch (Throwable e322) {
                    bufferedReader = null;
                    httpURLConnection = httpURLConnection3;
                    th2 = e322;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    ao.a(bufferedReader);
                    throw th2;
                }
            }
            if (null != null) {
                try {
                    httpURLConnection2.disconnect();
                } catch (Exception e222) {
                    throw e222;
                }
            }
            ao.a(null);
            return null;
        } catch (Exception e4) {
            th2 = e4;
            httpURLConnection2 = null;
            bufferedReader = null;
            Log.b(z[5], th2);
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            ao.a(bufferedReader);
            return null;
        } catch (Throwable th5) {
            th2 = th5;
            bufferedReader = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            ao.a(bufferedReader);
            throw th2;
        }
    }
}
