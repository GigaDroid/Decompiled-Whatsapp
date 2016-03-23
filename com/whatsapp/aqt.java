package com.whatsapp;

import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class aqt {
    private static final File b;
    private static final String[] z;
    public int a;
    private int c;
    public ArrayList d;
    public int e;
    private String f;

    public String d() {
        return this.f;
    }

    static {
        String[] strArr = new String[19];
        String str = "\u000b:$T)\r,yM \u00178#ImP\u007fj\u0001";
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
                        i3 = 121;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 87;
                        break;
                    case at.o /*3*/:
                        i3 = 33;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "4:3H$,-;";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "U\u007f#N1\u00183m";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "-7\"L'\u0017>>M";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "*:6S&\u0011\r2R5\u00161$D";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ".63U-";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Y6:@\"\u001c,";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "+:$T)\r,";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "026F ";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "-0#@)";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "1:>F-\r";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ",-;";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "026F W\u001c8T+\r";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ",\u000b\u0011\f}";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "026F W\u00101G6\u001c+";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "(*2S<";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ":0:L0\u001764@1\u001009\u0001#\u00186;D!U\u007f$U$\r*$\u001c";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ";69F";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new File(App.z().getCacheDir(), z[18]);
                    return;
                default:
                    strArr2[i] = str;
                    str = "?6;D\u0016\u0010%2";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public aqt(int i, String str) {
        this.a = i;
        this.f = str;
        b.mkdirs();
    }

    private void a(JSONObject jSONObject) {
        JSONArray jSONArray;
        boolean z = DialogToastActivity.f;
        JSONArray jSONArray2 = null;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(z[5]);
            if (jSONObject2 != null) {
                jSONObject2 = jSONObject2.getJSONObject(z[9]);
                if (jSONObject2 != null) {
                    jSONArray2 = jSONObject2.getJSONArray(z[8]);
                    this.e = jSONObject2.getInt(z[10]);
                }
            }
            jSONArray = jSONArray2;
        } catch (JSONException e) {
            this.e = 0;
            jSONArray = null;
        }
        if (jSONArray != null) {
            Log.i(z[0] + jSONArray.length() + z[3] + this.e);
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    anw com_whatsapp_anw = new anw();
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    com_whatsapp_anw.e = jSONObject3.getString(z[2]);
                    com_whatsapp_anw.c = jSONObject3.getInt(z[1]);
                    com_whatsapp_anw.a = jSONObject3.getInt(z[6]);
                    com_whatsapp_anw.b = jSONObject3.getInt(z[11]);
                    jSONObject3 = jSONObject3.getJSONObject(z[4]);
                    if (jSONObject3 != null) {
                        com_whatsapp_anw.d = jSONObject3.getString(z[12]);
                    }
                    try {
                        if (com_whatsapp_anw.a >= 300 && com_whatsapp_anw.b >= 300) {
                            if (com_whatsapp_anw.c <= 512000) {
                                try {
                                    this.d.add(com_whatsapp_anw);
                                } catch (JSONException e2) {
                                    throw e2;
                                }
                            }
                        }
                        i++;
                        if (z) {
                            break;
                        }
                    } catch (JSONException e22) {
                        throw e22;
                    } catch (JSONException e222) {
                        throw e222;
                    }
                } catch (JSONException e2222) {
                    throw e2222;
                } catch (JSONException e3) {
                }
            }
            this.c += jSONArray.length();
            Log.i(this.d.size() + z[7]);
        }
    }

    public List b() {
        Throwable e;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream = null;
        this.d = new ArrayList();
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair(z[16], this.f.trim()));
        arrayList.add(new BasicNameValuePair(z[15], Integer.toString(this.c)));
        arrayList.add(new BasicNameValuePair(z[13], Integer.toString(this.a)));
        String str = azx.d + URLEncodedUtils.format(arrayList, z[14]);
        File file = new File(b, ve.f(str).toString());
        try {
            if (!file.exists() || file.lastModified() + 86400000 <= System.currentTimeMillis()) {
                file.delete();
                HttpUriRequest httpGet = new HttpGet(str);
                HttpParams basicHttpParams = new BasicHttpParams();
                HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
                HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
                HttpProtocolParams.setUserAgent(basicHttpParams, vn.a());
                HttpResponse execute = new DefaultHttpClient(basicHttpParams).execute(httpGet);
                int statusCode = execute.getStatusLine().getStatusCode();
                if (statusCode == 200) {
                    String entityUtils = EntityUtils.toString(execute.getEntity());
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(file));
                        try {
                            objectOutputStream2.writeObject(entityUtils);
                            if (objectOutputStream2 != null) {
                                try {
                                    objectOutputStream2.close();
                                } catch (IOException e2) {
                                }
                            }
                        } catch (FileNotFoundException e3) {
                            e = e3;
                            objectOutputStream = objectOutputStream2;
                            try {
                                Log.a(e);
                                if (objectOutputStream != null) {
                                    try {
                                        objectOutputStream.close();
                                    } catch (IOException e4) {
                                    }
                                }
                                str = entityUtils;
                                if (str != null) {
                                    a(new JSONObject(str));
                                }
                                return this.d;
                            } catch (Throwable th) {
                                e = th;
                                if (objectOutputStream != null) {
                                    try {
                                        objectOutputStream.close();
                                    } catch (IOException e5) {
                                    } catch (ClassNotFoundException e6) {
                                        throw e6;
                                    }
                                }
                                throw e;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            objectOutputStream = objectOutputStream2;
                            Log.a(e);
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                } catch (IOException e8) {
                                }
                            }
                            str = entityUtils;
                            if (str != null) {
                                a(new JSONObject(str));
                            }
                            return this.d;
                        } catch (Throwable th2) {
                            e = th2;
                            objectOutputStream = objectOutputStream2;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            throw e;
                        }
                    } catch (FileNotFoundException e9) {
                        e = e9;
                        Log.a(e);
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        str = entityUtils;
                        if (str != null) {
                            a(new JSONObject(str));
                        }
                        return this.d;
                    } catch (IOException e10) {
                        e = e10;
                        Log.a(e);
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        str = entityUtils;
                        if (str != null) {
                            a(new JSONObject(str));
                        }
                        return this.d;
                    }
                    str = entityUtils;
                } else {
                    throw new IOException(z[17] + statusCode);
                }
            }
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(file));
                try {
                    str = (String) objectInputStream.readObject();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                        } catch (ClassNotFoundException e62) {
                            throw e62;
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                    try {
                        Log.a(e);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                                str = null;
                            } catch (IOException e13) {
                                str = null;
                            }
                            if (str != null) {
                                a(new JSONObject(str));
                            }
                            return this.d;
                        }
                        str = null;
                        if (str != null) {
                            a(new JSONObject(str));
                        }
                        return this.d;
                    } catch (Throwable th3) {
                        e = th3;
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e14) {
                            } catch (ClassNotFoundException e622) {
                                throw e622;
                            }
                        }
                        throw e;
                    }
                } catch (ClassNotFoundException e15) {
                    e = e15;
                    Log.a(e);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                            str = null;
                        } catch (IOException e16) {
                            str = null;
                        }
                        if (str != null) {
                            a(new JSONObject(str));
                        }
                        return this.d;
                    }
                    str = null;
                    if (str != null) {
                        a(new JSONObject(str));
                    }
                    return this.d;
                }
            } catch (IOException e17) {
                e = e17;
                objectInputStream = null;
                Log.a(e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                    str = null;
                    if (str != null) {
                        a(new JSONObject(str));
                    }
                    return this.d;
                }
                str = null;
                if (str != null) {
                    a(new JSONObject(str));
                }
                return this.d;
            } catch (ClassNotFoundException e18) {
                e = e18;
                objectInputStream = null;
                Log.a(e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                    str = null;
                    if (str != null) {
                        a(new JSONObject(str));
                    }
                    return this.d;
                }
                str = null;
                if (str != null) {
                    a(new JSONObject(str));
                }
                return this.d;
            } catch (Throwable th4) {
                e = th4;
                objectInputStream = null;
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                throw e;
            }
            if (str != null) {
                a(new JSONObject(str));
            }
            return this.d;
        } catch (IOException e19) {
            throw e19;
        }
    }

    public boolean c() {
        return this.e > this.c;
    }

    public static void a() {
        boolean z = DialogToastActivity.f;
        File[] listFiles = b.listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, new av6());
            int i = 0;
            while (i < listFiles.length) {
                File file = listFiles[i];
                if (i <= listFiles.length - 16 || file.lastModified() + 86400000 <= System.currentTimeMillis()) {
                    file.delete();
                }
                i++;
                if (z) {
                    return;
                }
            }
        }
    }

    public aqt(String str) {
        this(50, str);
    }
}
