package com.whatsapp;

import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class PlaceInfo implements Serializable {
    public static final int SOURCES_COUNT = 3;
    public static final int SOURCE_FACEBOOK = 1;
    public static final int SOURCE_FOURSQUARE = 3;
    public static final int SOURCE_GOOGLE = 2;
    public static final int SOURCE_UNDEFINED = 0;
    private static final long serialVersionUID = 1;
    private static final String[] z;
    public String address;
    public double dist;
    public boolean hasDetails;
    public String icon;
    public double lat;
    private transient Location location;
    public double lon;
    public String name;
    public String phone;
    public String placeId;
    public String rating;
    public int source;
    public transient Object tag;
    public String url;
    public String vicinity;

    static {
        String[] strArr = new String[51];
        String str = "l\u00163";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = SOURCE_UNDEFINED;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = SOURCE_UNDEFINED; length > i2; i2 += SOURCE_FACEBOOK) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case SOURCE_UNDEFINED /*0*/:
                        i3 = 25;
                        break;
                    case SOURCE_FACEBOOK /*1*/:
                        i3 = 100;
                        break;
                    case SOURCE_GOOGLE /*2*/:
                        i3 = 95;
                        break;
                    case SOURCE_FOURSQUARE /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 44;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case SOURCE_UNDEFINED /*0*/:
                    strArr2[i] = str;
                    str = "u\n8";
                    i = SOURCE_GOOGLE;
                    strArr2 = strArr3;
                    obj = SOURCE_FACEBOOK;
                    break;
                case SOURCE_FACEBOOK /*1*/:
                    strArr2[i] = str;
                    i = SOURCE_FOURSQUARE;
                    strArr2 = strArr3;
                    str = "5D\n5Em\u0001;{\u007fm\u0005+>_";
                    obj = SOURCE_GOOGLE;
                    break;
                case SOURCE_GOOGLE /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "u\u0005+";
                    obj = SOURCE_FOURSQUARE;
                    strArr2 = strArr3;
                    break;
                case SOURCE_FOURSQUARE /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "p\u000705";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "w\u00052>";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u007f\u000b-6Mm\u0010:?si\f05IF\n*6N|\u0016";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "u\u000b<:Xp\u000b1";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "i\b>8IF\r;";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "o\r<2Bp\u0010&";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "k\u0005+2B~";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u007f\u000b-6Mm\u0010:?sx\u0000;)Ij\u0017";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "i\u001666Mk\u001d";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "z\u0005+>Kv\u00166>_";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "j\u0010>/I";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "w\u00052>";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "x\u0000;)Ij\u0017";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "u\u000b<:Xp\u000b1";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "i\u0016:=Ea";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "i\u000b,/Mu'0?I";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "u\u0005+";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "/Pq+B~";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "l\u00163";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "p\u0000";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    str = "5D";
                    obj = 24;
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    strArr2 = strArr3;
                    str = "5D";
                    obj = 25;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "p\u000705";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "q\u0010++_#Kp=Cl\u0016,*Yx\u0016:uOv\tp-\u0003";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "u\n8";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "z\r+\"";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "k\u0001,.@m";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "j\u0010>/Yj";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "V/";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "?\b>5Kl\u00058>\u0011";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "j\u0010>/I";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "i\b>8IF\u00100+Ez\u0017";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "p\u0000";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "j\u0010->Im";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "q\u0010++_#Kp,[nJ9:O|\u000604G7\u000706\u0003p\t><IjK/7Mz\u0001,tXv\u001468_6\u001465s.Vq+B~";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "u\u000b<:Xp\u000b1";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "FSmu\\w\u0003";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "w\u00052>";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "5D";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    str = "5D";
                    obj = 43;
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    strArr2 = strArr3;
                    str = "u\r10";
                    obj = 44;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "u\u0005+2Xl\u0000:";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "u\u000b1<Em\u0011;>";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "p\u000705sl\u00163";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "z\r+\"";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "}\u0005+:";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "~\u000106Im\u0016&";
                    i = SOURCE_FACEBOOK;
                    strArr2 = strArr3;
                    obj = SOURCE_UNDEFINED;
                    break;
            }
        }
    }

    public synchronized void downloadDetails() {
        if (!this.hasDetails) {
            switch (this.source) {
                case SOURCE_GOOGLE /*2*/:
                    downloadDetailsGoogle();
                    break;
                default:
                    break;
            }
        }
    }

    public void fromJsonGoogle(JSONObject jSONObject, boolean z) {
        this.source = SOURCE_GOOGLE;
        this.name = jSONObject.getString(z[6]);
        this.placeId = jSONObject.optString(z[9]);
        this.vicinity = jSONObject.optString(z[10]);
        JSONObject jSONObject2 = jSONObject.getJSONObject(z[SOURCE_FACEBOOK]);
        if (jSONObject2 != null) {
            jSONObject2 = jSONObject2.getJSONObject(z[8]);
            if (jSONObject2 != null) {
                this.lat = jSONObject2.getDouble(z[4]);
                this.lon = jSONObject2.getDouble(z[SOURCE_GOOGLE]);
            }
        }
        this.icon = jSONObject.optString(z[5]);
        if (z) {
            this.url = jSONObject.optString(z[SOURCE_UNDEFINED]);
            this.phone = jSONObject.optString(z[7]);
            this.address = jSONObject.optString(z[12]);
            this.rating = jSONObject.optString(z[11]);
            if (this.address != null) {
                this.address = this.address.replace(z[SOURCE_FOURSQUARE], "");
            }
            this.hasDetails = true;
        }
    }

    public void fromJsonFacebook(JSONObject jSONObject) {
        this.source = SOURCE_FACEBOOK;
        this.name = jSONObject.getString(z[42]);
        this.placeId = jSONObject.optString(z[37]);
        this.url = jSONObject.optString(z[45]);
        this.icon = z[39];
        JSONObject jSONObject2 = jSONObject.getJSONObject(z[40]);
        if (jSONObject2 != null) {
            this.lat = jSONObject2.optDouble(z[46]);
            this.lon = jSONObject2.optDouble(z[47]);
            this.address = jSONObject2.optString(z[38]);
            String optString = jSONObject2.optString(z[49]);
            if (!(optString == null || "".equals(optString))) {
                if (!(TextUtils.isEmpty(this.address) || this.address.endsWith(","))) {
                    this.address += z[43];
                }
                this.address += optString;
            }
            this.vicinity = this.address;
            String optString2 = jSONObject2.optString(z[35]);
            if (!(optString2 == null || "".equals(optString2))) {
                if (!TextUtils.isEmpty(this.address)) {
                    this.address += z[44];
                }
                this.address += optString2;
            }
        }
        jSONObject2 = jSONObject.optJSONObject(z[36]);
        if (jSONObject2 != null) {
            JSONArray optJSONArray = jSONObject2.optJSONArray(z[50]);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                jSONObject2 = optJSONArray.optJSONObject(SOURCE_UNDEFINED);
                if (jSONObject2 != null) {
                    this.icon = jSONObject2.optString(z[48]) + z[41];
                }
            }
        }
        this.hasDetails = true;
    }

    private synchronized void downloadDetailsGoogle() {
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpProtocolParams.setUserAgent(basicHttpParams, vn.a());
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
        String str = azx.q + this.placeId;
        Locale locale = App.z().getResources().getConfiguration().locale;
        if (locale != null) {
            str = str + z[34] + locale.getLanguage();
        }
        try {
            HttpResponse execute = defaultHttpClient.execute(new HttpGet(str));
            if (execute.getStatusLine().getStatusCode() == 200) {
                JSONObject jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                if (z[33].equals(jSONObject.getString(z[32]))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(z[31]);
                    if (jSONObject2 != null) {
                        fromJsonGoogle(jSONObject2, true);
                        this.hasDetails = true;
                    }
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            Log.a(e2);
        } catch (Throwable e22) {
            Log.a(e22);
        }
    }

    public Location getLocation() {
        if (this.location == null) {
            this.location = new Location("");
            this.location.setLatitude(this.lat);
            this.location.setLongitude(this.lon);
        }
        return this.location;
    }

    public void fromJsonFoursquare(JSONObject jSONObject) {
        int i = SOURCE_UNDEFINED;
        boolean z = DialogToastActivity.f;
        this.source = SOURCE_FOURSQUARE;
        this.name = jSONObject.getString(z[16]);
        this.url = jSONObject.optString(z[23]);
        this.placeId = jSONObject.optString(z[24]);
        if (this.url == null || "".equals(this.url)) {
            this.url = z[28] + this.placeId;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(z[18]);
        if (jSONObject2 != null) {
            this.lat = jSONObject2.optDouble(z[21]);
            this.lon = jSONObject2.optDouble(z[29]);
            this.address = jSONObject2.optString(z[17]);
            this.vicinity = this.address;
            String optString = jSONObject2.optString(z[30]);
            if (!(optString == null || "".equals(optString))) {
                if (!(this.address == null || "".equals(this.address))) {
                    this.address += z[26];
                }
                this.address += optString;
            }
            optString = jSONObject2.optString(z[15]);
            if (!(optString == null || "".equals(optString))) {
                if (!(this.address == null || "".equals(this.address))) {
                    this.address += z[25];
                }
                this.address += optString;
            }
            String optString2 = jSONObject2.optString(z[20]);
            if (!(optString2 == null || "".equals(optString2))) {
                if (!(this.address == null || "".equals(this.address))) {
                    this.address += " ";
                }
                this.address += optString2;
            }
            this.hasDetails = true;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(z[14]);
        if (optJSONArray != null) {
            jSONObject2 = optJSONArray.optJSONObject(SOURCE_UNDEFINED);
            while (i < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.optBoolean(z[13])) {
                    if (!z) {
                        jSONObject2 = optJSONObject;
                        break;
                    }
                    jSONObject2 = optJSONObject;
                }
                i += SOURCE_FACEBOOK;
                if (z) {
                    break;
                }
            }
            if (jSONObject2 != null) {
                JSONObject optJSONObject2 = jSONObject2.optJSONObject(z[27]);
                if (optJSONObject2 != null) {
                    this.icon = optJSONObject2.optString(z[19]);
                    if (this.icon != null) {
                        this.icon += z[22];
                    }
                }
            }
        }
    }
}
