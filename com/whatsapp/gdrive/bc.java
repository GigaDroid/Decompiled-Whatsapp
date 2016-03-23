package com.whatsapp.gdrive;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.fh;
import com.whatsapp.App;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.mk;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.ao;
import com.whatsapp.vn;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.DefaultHttpRoutePlanner;
import org.apache.http.impl.conn.DefaultResponseParser;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
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

final class bc {
    private static final Comparator h;
    private static final Pattern k;
    private static final String m;
    private static final String[] z;
    private SharedPreferences a;
    private final String b;
    private String c;
    private final SSLSocketFactory d;
    private final AtomicInteger e;
    private final Set f;
    private long g;
    private final d2 i;
    private final Context j;
    private boolean l;
    private final DefaultHttpClient n;

    private static void b(@Nullable HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (SecurityException e) {
                throw e;
            }
        }
    }

    static {
        String[] strArr = new String[336];
        String str = "\u000bR\u0007%";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            int i2;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i2 = 127;
                        break;
                    case at.g /*1*/:
                        i2 = 32;
                        break;
                    case at.i /*2*/:
                        i2 = 114;
                        break;
                    case at.o /*3*/:
                        i2 = 64;
                        break;
                    default:
                        i2 = 43;
                        break;
                }
                cArr[i3] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "\fU\u001cnE\u001aT\\(_\u000bP\\!G\u0013O\u0005\u0012N\fT\u0000)H\u000bE\u0016\bN\u001eD\u00172X";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = ">U\u0006(D\rI\b!_\u0016O\u001c";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "*S\u00172\u0006>G\u0017._";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\bW\u0005nL\u0010O\u0015,N\u001eP\u001b3\u0005\u001cO\u001f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "=E\u00132N\r\u0000";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "7O\u00014";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\bW\u0005nL\u0010O\u0015,N\u001eP\u001b3\u0005\u001cO\u001f";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "N\u0010BmH\u0010N\u0006)E\nE";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ":X\u0002%H\u000b";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u0017,N\u000bE_\"J\u000bC\u001aoB\u0011T\u00172Y\nP\u0006%O";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u0017,N\u000bE_&B\u0013E\u0001`O\u001aL\u00174B\u0011GR#D\u0012P\u001e%_\u001a\u0000\u0010!_\u001cHRc";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u0017,N\u000bE_&B\u0013E\u0001`O\u001aL\u00174B\u0011GR#D\u0012P\u001e%_\u001a\u0000\u0010!_\u001cHRc";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "_S\u0007#H\u001aE\u0016%OQ";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "_C\u001d._\u001eI\u001c)E\u0018\u0000";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u0017,N\u000bE_&B\u0013E\u0001`O\u001aL\u00174B\u0011GR&B\u0011A\u001e`I\u001eT\u0011(\u000b\u001cO\u001c4J\u0016N\u001b.L_";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "_C\u001d._\u001eI\u001c)E\u0018\u0000";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "_R\u00171^\u001aS\u00063\u0005";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "8O\u001d'G\u001ad\u0000)]\u001aa\u0002)\u0004\u001bE\u001e%_\u001a\r\u0014)G\u001aSR$N\u0013E\u0006)E\u0018\u0000\u0011/F\u000fL\u00174N_B\u00134H\u0017\u0000Q";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "_F\u0013)G\u001aD\\";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "_C\u001d._\u001eI\u001c)E\u0018\u0000";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001cO\u001fn\\\u0017A\u00063J\u000fP-0Y\u001aF\u00172N\u0011C\u00173";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006oY\u001aC\u0017)]\u001aD_!^\u000bH_4D\u0014E\u001c";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "=A\u0016\u0015X\u001aR\u001c!F\u001a";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "_I\u0001`E\u0010TR!]\u001eI\u001e!I\u0013ER!E\u001b\u0000\u0005%\u000b\u001cA\u001c.D\u000b\u0000\u00133@_U\u0001%Y_F\u001d2\u000b\u000fE\u0000-B\fS\u001b/E_E\u001b4C\u001aR\\";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006`[\u001aR\u001f)X\fI\u001d.\u000b\u000bOR!H\u001cE\u00013\u000b8O\u001d'G\u001a\u000062B\tER&D\r\u0000";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006`^\u0011E\n0N\u001cT\u0017$\u000b1U\u001e,{\u0010I\u001c4N\re\n#N\u000fT\u001b/E_W\u001a)G\u001a\u0000\u00062R\u0016N\u0015`_\u0010\u0000\u0015%__\u0000\u00135_\u0017\u0000\u0006/@\u001aNR&D\r\u0000\u0006(N_A\u0011#D\nN\u0006`";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0010A\u00074CM\u001a\u001a4_\u000fSHo\u0004\bW\u0005nL\u0010O\u0015,N\u001eP\u001b3\u0005\u001cO\u001foJ\nT\u001aoO\rI\u0004%\u0005\u001eP\u0002$J\u000bAR(_\u000bP\u0001z\u0004PW\u00057\u0005\u0018O\u001d'G\u001aA\u0002)XQC\u001d-\u0004\u001eU\u0006(\u0004\u001bR\u001b6NQF\u001b,N";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = ",E\u00006B\u001cE'.J\tA\u001b,J\u001dL\u0017";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006";
                    obj = 31;
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    strArr2 = strArr3;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006";
                    obj = 32;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "=A\u0016\u0001^\u000bH\u0017._\u0016C\u00134B\u0010N";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006`J\fK\u001b.L_g\u001d/L\u0013E35_\u0017u\u0006)G_F\u001d2\u000b\u001eU\u0006(\u000b\u000bO\u0019%EE\u0000";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPA\u00074CRR\u00171^\u001aS\u0006`l\u0010O\u0015,N_p\u001e!R_S\u00172]\u0016C\u00173\u000b\u0016SR5E\u001eV\u0013)G\u001eB\u001e%\u0007_I\u0014`B\u000b\u0000\u0005!X_U\u001c!]\u001eI\u001e!I\u0013ER&Y\u0010MR4C\u001a\u0000\u0010%L\u0016N\u001c)E\u0018\u0000\u0011/O\u001a\u0000\u0005/^\u0013DR.D\u000b\u0000\u001a!]\u001a\u0000\u0000%J\u001cH\u0017$\u000b\u0017E\u0000%\u0007_S\u001dl\u000b\u0012O\u00014\u000b\u0013I\u0019%G\u0006\u0000\u001b4\u000b\u001dE\u0011!F\u001a\u0000\u0007.J\tA\u001b,J\u001dL\u0017`\\\u0017I\u001e%\u000b\u000bH\u0017`I\u001eC\u00195[PR\u00173_\u0010R\u0017`\\\u001eSR)E_P\u0000/L\rE\u00013";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPC\u001d.X\nM\u0017mN\u0011T\u001b4R";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPE\u001c!I\u0013E\u0016";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u001b3J\u001dL\u0017$";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\bW\u0005nL\u0010O\u0015,N\u001eP\u001b3\u0005\u001cO\u001f";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    str = "\bW\u0005nL\u0010O\u0015,N\u001eP\u001b3\u0005\u001cO\u001f";
                    obj = 42;
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    strArr2 = strArr3;
                    str = "\u0017O\u00014";
                    obj = 43;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPI\u0001mL\u001bR\u001b6NRF\u0007,G";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u001aR\u0000/Y";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u001aR\u0000/Y\f";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\rE\u00133D\u0011";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u001aR\u0000/Y";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u000eU\u001d4J:X\u0011%N\u001bE\u0016";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u001aR\u0000/Y";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u001cO\u0016%";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "QI\u001c#D\u0012P\u001e%_\u001a";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPL\u001b3_RF\u001b,N\f\u000f";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPR\u0017-D\tE_2N\fU\u001f!I\u0013E_5Y\u0016\u0000\u0007.J\u001dL\u0017`_\u0010\u0000\u0011/F\u0012I\u0006`Y\u001aS\u0007-J\u001dL\u0017`^\rIR4D_S\u001a!Y\u001aDR0Y\u001aF\u0001n";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0019I\u0017,O\f";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "/o!\u0014";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "<O\u001c4N\u0011T_\u0014R\u000fEH`J\u000fP\u001e)H\u001eT\u001b/EPJ\u0001/ED\u0000\u0011(J\rS\u00174\u0016*t4m\u0013r*\u007fJ";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPC\u0000%J\u000bE_&D\u0013D\u00172";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "_R\u00173[\u0010N\u0001%\u0011_";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "*t4m\u0013";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "r*";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPC\u0000%J\u000bE_&D\u0013D\u00172\u0004\nN\u00178[\u001aC\u0006%ORR\u00173[\u0010N\u0001%\u0004";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    str = "\u001bR\u001b6N\\F\u001b,N";
                    obj = 63;
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    strArr2 = strArr3;
                    str = "\u001eP\u0002,B\u001cA\u0006)D\u0011\u000f\u0004.OQG\u001d/L\u0013E_![\u000fS\\&D\u0013D\u00172";
                    obj = 64;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "ZS^eX";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0016D";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u0017T\u00060XE\u000f]7\\\b\u000e\u0015/D\u0018L\u0017![\u0016S\\#D\u0012\u000f\u00070G\u0010A\u0016oO\rI\u0004%\u0004\t\u0012]&B\u0013E\u0001";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0012I\u001f%\u007f\u0006P\u0017";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "*t4m\u0013";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPC\u0000%J\u000bE_&D\u0013D\u00172";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "r*_m";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "_R\u00173[\u0010N\u0001%\u0011_";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "R\r";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPC\u0000%J\u000bE_&D\u0013D\u00172";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "r*_m";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u0012U\u001e4B\u000fA\u00004\u0004\rE\u001e!_\u001aDI`I\u0010U\u001c$J\rYOb";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "\u000bI\u0006,N";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0014I\u001c$";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u000fA\u0000%E\u000bS";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "-E\u00010D\u0011S\u0017`H\u0010D\u0017z\u000b";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "<O\u001c4N\u0011T_\u0014R\u000fE";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "S\u0000\u001f!S_";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "r*";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "r*";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = ">U\u0006(D\rI\b!_\u0016O\u001c";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "<O\u001c4N\u0011T_\u0014Y\u001eN\u0001&N\r\r7.H\u0010D\u001b.LE\u0000\u0010)E\u001eR\u000bM!r*";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u0017.ORB\u00134H\u0017\u0000\u0007.J\u001dL\u0017`_\u0010\u0000\u0014)E\u001b\u0000\u0010/^\u0011D\u00132R_H\u0017!O\u001aRR)E_T\u001a%\u000b\rE\u00010D\u0011S\u0017n";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "ZS^eX";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "<O\u001c4N\u0011T_\u0014R\u000fEH`J\u000fP\u001e)H\u001eT\u001b/EPH\u00064[r*";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u001eP\u0002\u0003D\u0011T\u0017._";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "ZSRz\u000bZS\u007fJ";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "=E\u00132N\r\u0000";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u001dO\u0007.O\u001eR\u000b";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u0017.ORB\u00134H\u0017\u0000\u0000%X\u000fO\u001c3N_B\u001d$R_M\u001b3X\u0016N\u0015n";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "\u0017T\u00060XE\u000f]7\\\b\u000e\u0015/D\u0018L\u0017![\u0016S\\#D\u0012\u000f\u0010!_\u001cH";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "<O\u001c4N\u0011T_\u0014R\u000fE";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u0017.ORB\u00134H\u0017";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "r*";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "\u0012U\u001e4B\u000fA\u00004\u0004\u0012I\n%OD\u0000\u0010/^\u0011D\u00132RB\u0002";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "\fP\u0013#N\f";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u0017.ORB\u00134H\u0017\u0000\u0005%B\rDR3_\u001eT\u00073\u000b\u001cO\u0016%\u0011_";
                    obj = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u0017.ORB\u00134H\u0017";
                    obj = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "+O\u001d`F\u001eN\u000b`I\u001eT\u0011(\u000b\rE\u00035N\fT\u0001z\u000b";
                    obj = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "\u001dO\u0007.O\u001eR\u000b";
                    obj = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u0017.ORB\u00134H\u0017";
                    obj = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "r*\u007fJ\u0006R";
                    obj = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "\u001eP\u0002\u0004J\u000bA4/G\u001bE\u0000";
                    obj = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "R\r\u007fJ";
                    obj = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "\nT\u0014m\u0013";
                    obj = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "<O\u001c4N\u0011T_\u0014R\u000fE";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "r*_m\u000e\f-x";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "_A\u001e,D\bE\u0016";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPI\u001c3N\rT_0Y\u0010P\u00172_\u0006\u000f\u00135_\u0017\r\u00178[\u0016R\u0017$";
                    obj = 113;
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    strArr2 = strArr3;
                    str = "\tA\u001e5N";
                    obj = 114;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "/r;\u0016j+e";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = "\u0017T\u00060XE\u000f]7\\\b\u000e\u0015/D\u0018L\u0017![\u0016S\\#D\u0012\u000f\u00162B\tE]6\u0019PF\u001b,N\f\u000fW3\u0004\u000fR\u001d0N\rT\u001b%X";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = "<O\u001c4N\u0011T_\u0014R\u000fE";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = "\tI\u0001)I\u0016L\u001b4R";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPI\u001c3N\rT_0Y\u0010P\u00172_\u0006\u000f\u0007.N\u0007P\u0017#_\u001aD_2N\fP\u001d.X\u001a\u000f";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPI\u001c3N\rT_0Y\u0010P\u00172_\u0006";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u0014E\u000b";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "\u001eP\u0002,B\u001cA\u0006)D\u0011\u000f\u00183D\u0011\u001bR#C\u001eR\u0001%_Bu&\u0006\u0006G";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPI\u001c3N\rT_0Y\u0010P\u00172_\u0006\u000f\u00015H\u001cE\u00013";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPI\u001c3N\rT_0Y\u0010P\u00172_\u0006\u000f\u0014)G\u001a\r\u001c/_RF\u001d5E\u001b";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = "\u0014I\u001c$";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPI\u001c3N\rT_0Y\u0010P\u00172_\u0006";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "\u001bR\u001b6N\\P\u0000/[\u001aR\u00069";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "-E\u00015F\u001eB\u001e%~\rL_";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = "\u0018D\u0000)]\u001a\r %X\nM\u0013\"G\u001au\u0000,\u0006";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPR\u0017-D\tE_!G\u0013\r\u0000%X\nM\u0013\"G\u001a\r\u00072B\f\u0000\u0007.J\u001dL\u0017`_\u0010\u0000\u0011/F\u0012I\u0006`J\u0019T\u00172\u000b\u001cL\u0017!E\nPR4D_S\u001a!Y\u001aDR0Y\u001aF\u0001n";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = "\u0018D\u0000)]\u001a\r %X\nM\u0013\"G\u001au\u0000,\u0006";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = "_O\u0000`";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPL\u001b3_RF\u001b,N\f\u000f\u001b._\u001aR\u00005[\u000bE\u0016";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "\u001eP\u0002\u0003D\u0011T\u0017._";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "\u001eP\u0002&D\u0013D\u00172";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "\u001eP\u0002\u0004J\u000bA4/G\u001bE\u0000";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = "X\u0005\u0001g\u000b\u0016NR0J\rE\u001c4X";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = "ZS^eX";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = "\u001eP\u0002\u0004J\u000bA4/G\u001bE\u0000";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPL\u001b3_RF\u001b,N\f\u000f";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = "ZSZeXV\fW3";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPQ\u0007%Y\u0006\r\u0014)G\u001aS])E\u000bE\u00002^\u000fT\u0017$";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = "]\u0000\u0002!L\u001at\u001d+N\u0011\u001a";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    i = 145;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPQ\u0007%Y\u0006\r\u0014)G\u001aSR5Y\u0013\u0000\u0006/\u000b\u001dER/[\u001aN\u0017$\u000b\u0016SR";
                    obj = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i] = str;
                    i = 146;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPQ\u0007%Y\u0006\r\u0014)G\u001aSR1^\u001aR\u000bz\u000b]";
                    obj = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i] = str;
                    i = 147;
                    str = "\u0012A\n\u0012N\fU\u001e4X";
                    obj = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i] = str;
                    i = 148;
                    str = "\u0011E\n4{\u001eG\u0017\u0014D\u0014E\u001c";
                    obj = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i] = str;
                    i = 149;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPQ\u0007%Y\u0006\r\u0014)G\u001aSR2N\u000bR\u001b%]\u001aDReO_M\u001d2N_F\u001b,N\f\u0000\u001c%\\_T\u001d4J\u0013\u0000\u001b3\u000bZD";
                    obj = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i] = str;
                    i = 150;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPQ\u0007%Y\u0006\r\u0014)G\u001aS]";
                    obj = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i] = str;
                    i = 151;
                    str = "_S\u0002!H\u001a\u001a";
                    obj = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i] = str;
                    i = 152;
                    str = "\u0016T\u0017-X";
                    obj = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i] = str;
                    i = 153;
                    str = "\u0016T\u0017-X";
                    obj = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i] = str;
                    i = 154;
                    str = "\u000fA\u0015%\u007f\u0010K\u0017.";
                    obj = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i] = str;
                    i = 155;
                    str = "_P\u0013'N+O\u0019%EE";
                    obj = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i] = str;
                    i = 156;
                    str = "_A\u0011#N\fS_#D\u0011D\u001b4B\u0010NH";
                    obj = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i] = str;
                    i = 157;
                    str = "\fP\u0013#N\f";
                    obj = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i] = str;
                    i = 158;
                    str = "ZSZeXS\u0005\u0001i\u0007ZS";
                    obj = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i] = str;
                    i = 159;
                    str = "PQ\u0007%Y\u0006\u001a";
                    obj = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i] = str;
                    i = 160;
                    str = "_F\u00174H\u0017\r\u00022D\u000fE\u00004B\u001aSH";
                    obj = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i] = str;
                    i = 161;
                    str = "\u0017T\u00060XE\u000f]7\\\b\u000e\u0015/D\u0018L\u0017![\u0016S\\#D\u0012\u000f\u00162B\tE]6\u0019PF\u001b,N\f";
                    obj = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i] = str;
                    i = 162;
                    str = "\u0019I\u0017,O\f";
                    obj = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i] = str;
                    i = 163;
                    str = "\u0011E\n4{\u001eG\u0017\u0014D\u0014E\u001c";
                    obj = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i] = str;
                    i = 164;
                    str = "\u001aN\u0016\tE\u001bE\n`\u0003";
                    obj = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i] = str;
                    i = 165;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u0017,N\u000bE_\"J\u000bC\u001aoB\u0011T\u00172Y\nP\u0006%O";
                    obj = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i] = str;
                    i = 166;
                    str = "\u0017T\u00060XE\u000f]7\\\b\u000e\u0015/D\u0018L\u0017![\u0016S\\#D\u0012\u000f\u00162B\tE]6\u0019PF\u001b,N\f\u000fW3";
                    obj = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i] = str;
                    i = 167;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u0017,N\u000bE_\"J\u000bC\u001a";
                    obj = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i] = str;
                    i = 168;
                    str = "V\u0000\u0011!E\u0011O\u0006`I\u001a\u0000\u0001-J\u0013L\u00172\u000b\u000bH\u0013.\u000b\fT\u00132_6N\u0016%SW";
                    obj = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i] = str;
                    i = 169;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u0017,N\u000bE_\"J\u000bC\u001ao_\u0010O_-J\u0011Y_&B\u0013E\u0001o";
                    obj = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i] = str;
                    i = 170;
                    str = "\u001eP\u0002&D\u0013D\u00172";
                    obj = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i] = str;
                    i = 171;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPG\u00174\u0006\u0019I\u001e%XPI\u001c4N\rR\u00070_\u001aD";
                    obj = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i] = str;
                    i = 172;
                    str = "\u001eP\u0002\u0004J\u000bA4/G\u001bE\u0000";
                    obj = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i] = str;
                    i = 173;
                    str = "X\u0000\u001b.\u000b\u000fA\u0000%E\u000bS";
                    obj = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i] = str;
                    i = 174;
                    str = "*N\u00178[\u001aC\u0006%O_S\u0002!H\u001a\u0000\u001c!F\u001a\u001aR";
                    obj = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i] = str;
                    i = 175;
                    str = "\u000bI\u0006,N_\u001dRg";
                    obj = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i] = str;
                    i = 176;
                    str = "\u001eP\u0002\u0004J\u000bA4/G\u001bE\u0000";
                    obj = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i] = str;
                    i = 177;
                    str = "\u001eP\u0002\u0003D\u0011T\u0017._";
                    obj = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i] = str;
                    i = 178;
                    str = "X\u0000\u0013.O_\u0007";
                    obj = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i] = str;
                    i = 179;
                    str = "'\r'0G\u0010A\u0016mh\u0010N\u0006%E\u000b\r&9[\u001a";
                    obj = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i] = str;
                    i = 180;
                    str = "\nT\u0014m\u0013";
                    obj = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i] = str;
                    i = 181;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E";
                    obj = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i] = str;
                    i = 182;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]`";
                    obj = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i] = str;
                    i = 183;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]!I\u0010R\u0006%O";
                    obj = 182;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i] = str;
                    i = 184;
                    str = "\u0019I\u001e%\u000b";
                    obj = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i] = str;
                    i = 185;
                    str = "\u001eP\u0002,B\u001cA\u0006)D\u0011\u000f\u0010)E\u001eR\u000b";
                    obj = 184;
                    strArr2 = strArr3;
                    break;
                case 184:
                    strArr2[i] = str;
                    i = 186;
                    str = "<O\u001c4N\u0011T_\u0012J\u0011G\u0017";
                    obj = 185;
                    strArr2 = strArr3;
                    break;
                case 185:
                    strArr2[i] = str;
                    i = 187;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]2N\u000eU\u00173_RA\u0010/Y\u000bE\u0016";
                    obj = 186;
                    strArr2 = strArr3;
                    break;
                case 186:
                    strArr2[i] = str;
                    i = 188;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]-B\fS\u001b.LRR\u0017!ORE\n4N\rN\u0013,\u0006\fT\u001d2J\u0018E_0N\rM\u001b3X\u0016O\u001co\u000b";
                    obj = 187;
                    strArr2 = strArr3;
                    break;
                case 187:
                    strArr2[i] = str;
                    i = 189;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]%Y\rO\u0000mO\nR\u001b.LRS\u0017%@";
                    obj = 188;
                    strArr2 = strArr3;
                    break;
                case 188:
                    strArr2[i] = str;
                    i = 190;
                    str = "\u001dY\u0006%X_";
                    obj = 189;
                    strArr2 = strArr3;
                    break;
                case 189:
                    strArr2[i] = str;
                    i = 191;
                    str = "\u0017T\u00060XE\u000f]7\\\b\u000e\u0015/D\u0018L\u0017![\u0016S\\#D\u0012\u000f\u00070G\u0010A\u0016oO\rI\u0004%\u0004\t\u0012]&B\u0013E\u0001\u007f^\u000fL\u001d!O+Y\u0002%\u0016\rE\u00015F\u001eB\u001e%";
                    obj = 190;
                    strArr2 = strArr3;
                    break;
                case 190:
                    strArr2[i] = str;
                    i = 192;
                    str = "=E\u00132N\r\u0000";
                    obj = 191;
                    strArr2 = strArr3;
                    break;
                case 191:
                    strArr2[i] = str;
                    i = 193;
                    str = "\u0014I\u001c$";
                    obj = 192;
                    strArr2 = strArr3;
                    break;
                case 192:
                    strArr2[i] = str;
                    i = 194;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E].D\u0011\r\u00183D\u0011\r\u0000%X\u000fO\u001c3NP";
                    obj = 193;
                    strArr2 = strArr3;
                    break;
                case 193:
                    strArr2[i] = str;
                    i = 195;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]5E\u001aX\u0002%H\u000bE\u0016mY\u001aS\u0002/E\fE]";
                    obj = 194;
                    strArr2 = strArr3;
                    break;
                case 194:
                    strArr2[i] = str;
                    i = 196;
                    str = "\u001eP\u0002,B\u001cA\u0006)D\u0011\u000f\u00183D\u0011\u001bR#C\u001eR\u0001%_Bu&\u0006\u0006G";
                    obj = 195;
                    strArr2 = strArr3;
                    break;
                case 195:
                    strArr2[i] = str;
                    i = 197;
                    str = "\u001eP\u0002,B\u001cA\u0006)D\u0011\u000f\u0010)E\u001eR\u000b";
                    obj = 196;
                    strArr2 = strArr3;
                    break;
                case 196:
                    strArr2[i] = str;
                    i = 198;
                    str = "\u001bE\u0001#Y\u0016P\u0006)D\u0011";
                    obj = 197;
                    strArr2 = strArr3;
                    break;
                case 197:
                    strArr2[i] = str;
                    i = 199;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]5E\u001aX\u0002%H\u000bE\u0016mY\u001aS\u0002/E\fE]&B\u0013E_5[\u0013O\u0013$N\u001b\r\u00105_RN\u001dmN\u0011T\u001b4RRI\u001cmY\u001aS\u0002/E\fE";
                    obj = 198;
                    strArr2 = strArr3;
                    break;
                case 198:
                    strArr2[i] = str;
                    i = 200;
                    str = "\u001bR\u001b6N\\F\u001b,N";
                    obj = 199;
                    strArr2 = strArr3;
                    break;
                case 199:
                    strArr2[i] = str;
                    i = 201;
                    str = ">U\u0006(D\rI\b!_\u0016O\u001c";
                    obj = 200;
                    strArr2 = strArr3;
                    break;
                case 200:
                    strArr2[i] = str;
                    i = 202;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E";
                    obj = 201;
                    strArr2 = strArr3;
                    break;
                case 201:
                    strArr2[i] = str;
                    i = 203;
                    str = "<O\u001c4N\u0011T_\u0014R\u000fE";
                    obj = 202;
                    strArr2 = strArr3;
                    break;
                case 202:
                    strArr2[i] = str;
                    i = 204;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013ER%Y\rO\u0000z\u000b\u0012U\u001e4B\u000fL\u0017`Y\u001eN\u0015%\u000b\u0017E\u0013$N\rS^`B\u0018N\u001d2B\u0011GH`";
                    obj = 203;
                    strArr2 = strArr3;
                    break;
                case 203:
                    strArr2[i] = str;
                    i = 205;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E";
                    obj = 204;
                    strArr2 = strArr3;
                    break;
                case 204:
                    strArr2[i] = str;
                    i = 206;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E";
                    obj = 205;
                    strArr2 = strArr3;
                    break;
                case 205:
                    strArr2[i] = str;
                    i = 207;
                    str = "_D\u001d%X_N\u001d4\u000b\u001aX\u001b3_Q";
                    obj = 206;
                    strArr2 = strArr3;
                    break;
                case 206:
                    strArr2[i] = str;
                    i = 208;
                    str = "\u0016D";
                    obj = 207;
                    strArr2 = strArr3;
                    break;
                case 207:
                    strArr2[i] = str;
                    i = 209;
                    str = "3O\u0011!_\u0016O\u001c";
                    obj = 208;
                    strArr2 = strArr3;
                    break;
                case 208:
                    strArr2[i] = str;
                    i = 210;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]5E\u001aX\u0002%H\u000bE\u0016mY\u001aS\u0002/E\fE]";
                    obj = 209;
                    strArr2 = strArr3;
                    break;
                case 209:
                    strArr2[i] = str;
                    i = 211;
                    str = ">U\u0006(D\rI\b!_\u0016O\u001c";
                    obj = 210;
                    strArr2 = strArr3;
                    break;
                case 210:
                    strArr2[i] = str;
                    i = 212;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013ER&B\u0013ER";
                    obj = 211;
                    strArr2 = strArr3;
                    break;
                case 211:
                    strArr2[i] = str;
                    i = 213;
                    str = "\u001dY\u0006%X_\n]";
                    obj = 212;
                    strArr2 = strArr3;
                    break;
                case 212:
                    strArr2[i] = str;
                    i = 214;
                    str = "=E\u00132N\r\u0000";
                    obj = 213;
                    strArr2 = strArr3;
                    break;
                case 213:
                    strArr2[i] = str;
                    i = 215;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]2N\fP\u001d.X\u001a\u000f";
                    obj = 214;
                    strArr2 = strArr3;
                    break;
                case 214:
                    strArr2[i] = str;
                    i = 216;
                    str = "\u001eP\u0002,B\u001cA\u0006)D\u0011\u000f\u0010)E\u001eR\u000b";
                    obj = 215;
                    strArr2 = strArr3;
                    break;
                case 215:
                    strArr2[i] = str;
                    i = 217;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]5E\u001aX\u0002%H\u000bE\u0016mY\u001aS\u0002/E\fE]";
                    obj = 216;
                    strArr2 = strArr3;
                    break;
                case 216:
                    strArr2[i] = str;
                    i = 218;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E])E\u000bE\u00002^\u000fT\u0017$";
                    obj = 217;
                    strArr2 = strArr3;
                    break;
                case 217:
                    strArr2[i] = str;
                    i = 219;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]&B\u0013E_.D\u000b\r\u0014/^\u0011D]`";
                    obj = 218;
                    strArr2 = strArr3;
                    break;
                case 218:
                    strArr2[i] = str;
                    i = 220;
                    str = "'\r'0G\u0010A\u0016mh\u0010N\u0006%E\u000b\r>%E\u0018T\u001a";
                    obj = 219;
                    strArr2 = strArr3;
                    break;
                case 219:
                    strArr2[i] = str;
                    i = 221;
                    str = "\u000fA\u0000%E\u000bS";
                    obj = 220;
                    strArr2 = strArr3;
                    break;
                case 220:
                    strArr2[i] = str;
                    i = 222;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]5E\u001aX\u0002%H\u000bE\u0016mY\u001aS\u0002/E\fE]";
                    obj = 221;
                    strArr2 = strArr3;
                    break;
                case 221:
                    strArr2[i] = str;
                    i = 223;
                    str = ">U\u0006(D\rI\b!_\u0016O\u001c";
                    obj = 222;
                    strArr2 = strArr3;
                    break;
                case 222:
                    strArr2[i] = str;
                    i = 224;
                    str = "<O\u001c4N\u0011T_\u0012J\u0011G\u0017";
                    obj = 223;
                    strArr2 = strArr3;
                    break;
                case 223:
                    strArr2[i] = str;
                    i = 225;
                    str = "_S\u0017%@_R\u00171^\u0016R\u0017$\u0011_";
                    obj = 224;
                    strArr2 = strArr3;
                    break;
                case 224:
                    strArr2[i] = str;
                    i = 226;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E]5E\u001aX\u0002%H\u000bE\u0016mN\rR\u001d2\u0004";
                    obj = 225;
                    strArr2 = strArr3;
                    break;
                case 225:
                    strArr2[i] = str;
                    i = 227;
                    str = "_D\u001d%X_N\u001d4\u000b\u001aX\u001b3_Q";
                    obj = 226;
                    strArr2 = strArr3;
                    break;
                case 226:
                    strArr2[i] = str;
                    i = 228;
                    str = "\u000bI\u0006,N";
                    obj = 227;
                    strArr2 = strArr3;
                    break;
                case 227:
                    strArr2[i] = str;
                    i = 229;
                    str = "_H\u0017!O\u001aR\u0001n";
                    obj = 228;
                    strArr2 = strArr3;
                    break;
                case 228:
                    strArr2[i] = str;
                    i = 230;
                    str = "\u0019I\u0017,O\f";
                    obj = 229;
                    strArr2 = strArr3;
                    break;
                case 229:
                    strArr2[i] = str;
                    i = 231;
                    str = "=E\u00132N\r\u0000";
                    obj = 230;
                    strArr2 = strArr3;
                    break;
                case 230:
                    strArr2[i] = str;
                    i = 232;
                    str = "_S\u0017%@_A\u00114^\u001eLH`";
                    obj = 231;
                    strArr2 = strArr3;
                    break;
                case 231:
                    strArr2[i] = str;
                    i = 233;
                    str = "-A\u001c'N";
                    obj = 232;
                    strArr2 = strArr3;
                    break;
                case 232:
                    strArr2[i] = str;
                    i = 234;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013ER%S\u001eC\u0006,R_O\u001c%\u000b\u0013O\u0011!_\u0016O\u001c`C\u001aA\u0016%Y_S\u001a/^\u0013DR(J\tER\"N\u001aNR2N\u000bU\u0000.N\u001b\u0000\u00109\u000b8O\u001d'G\u001a\u0000\u00162B\tE^`B\u000b\u0000\u0000%_\nR\u001c%O_";
                    obj = 233;
                    strArr2 = strArr3;
                    break;
                case 233:
                    strArr2[i] = str;
                    i = 235;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002,D\u001eD_&B\u0013E";
                    obj = 234;
                    strArr2 = strArr3;
                    break;
                case 234:
                    strArr2[i] = str;
                    i = 236;
                    str = "<O\u001c4N\u0011T_\u0014R\u000fE";
                    obj = 235;
                    strArr2 = strArr3;
                    break;
                case 235:
                    strArr2[i] = str;
                    i = 237;
                    str = "'\r !E\u0018E_\roJ";
                    obj = 236;
                    strArr2 = strArr3;
                    break;
                case 236:
                    strArr2[i] = str;
                    i = 238;
                    str = "\u000bI\u0006,N_\u001dRg\u000e\f\u0007";
                    obj = 237;
                    strArr2 = strArr3;
                    break;
                case 237:
                    strArr2[i] = str;
                    i = 239;
                    str = "_O\u0000`";
                    obj = 238;
                    strArr2 = strArr3;
                    break;
                case 238:
                    strArr2[i] = str;
                    i = 240;
                    str = "*N\u00178[\u001aC\u0006%O_S\u0002!H\u001a\u0000\u001c!F\u001a\u001aR";
                    obj = 239;
                    strArr2 = strArr3;
                    break;
                case 239:
                    strArr2[i] = str;
                    i = 241;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPG\u00174\u0006\u0019I\u001e%XPI\u001c4N\rR\u00070_\u001aD";
                    obj = 240;
                    strArr2 = strArr3;
                    break;
                case 240:
                    strArr2[i] = str;
                    i = 242;
                    str = "\u001eP\u0002\u0004J\u000bA4/G\u001bE\u0000";
                    obj = 241;
                    strArr2 = strArr3;
                    break;
                case 241:
                    strArr2[i] = str;
                    i = 243;
                    str = "\u001eP\u0002\u0003D\u0011T\u0017._";
                    obj = 242;
                    strArr2 = strArr3;
                    break;
                case 242:
                    strArr2[i] = str;
                    i = 244;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPP\u00132X\u001a\r\u0010!_\u001cHR.^\u0012B\u00172\u000b\u0010FR2N\u000eU\u00173_\f\u001aR";
                    obj = 243;
                    strArr2 = strArr3;
                    break;
                case 243:
                    strArr2[i] = str;
                    i = 245;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPP\u00132X\u001a\r\u0010!_\u001cH";
                    obj = 244;
                    strArr2 = strArr3;
                    break;
                case 244:
                    strArr2[i] = str;
                    i = 246;
                    str = "R\r";
                    obj = 245;
                    strArr2 = strArr3;
                    break;
                case 245:
                    strArr2[i] = str;
                    i = 247;
                    str = "_N\u0007-I\u001aRR/M_R\u00170G\u0016E\u0001z\u000b";
                    obj = 246;
                    strArr2 = strArr3;
                    break;
                case 246:
                    strArr2[i] = str;
                    i = 248;
                    str = "r*\u007fJ";
                    obj = 247;
                    strArr2 = strArr3;
                    break;
                case 247:
                    strArr2[i] = str;
                    i = 249;
                    str = "r*\u007fJ";
                    obj = 248;
                    strArr2 = strArr3;
                    break;
                case 248:
                    strArr2[i] = str;
                    i = 250;
                    str = "\nT\u0014m\u0013";
                    obj = 249;
                    strArr2 = strArr3;
                    break;
                case 249:
                    strArr2[i] = str;
                    i = 251;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPG\u00174\u0006\u0019I\u001e%\u0004";
                    obj = 250;
                    strArr2 = strArr3;
                    break;
                case 250:
                    strArr2[i] = str;
                    i = 252;
                    str = "\fP\u0013#N\f";
                    obj = 251;
                    strArr2 = strArr3;
                    break;
                case 251:
                    strArr2[i] = str;
                    i = 253;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPG\u00174\u0006\u0019I\u001e%\u000b\u0019I\u001e%\u000bW";
                    obj = 252;
                    strArr2 = strArr3;
                    break;
                case 252:
                    strArr2[i] = str;
                    i = 254;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPG\u00174\u0006\u0019I\u001e%\u0004\u001eU\u0006(\u0006\u001aX\u0002)Y\u001aD";
                    obj = 253;
                    strArr2 = strArr3;
                    break;
                case 253:
                    strArr2[i] = str;
                    i = 255;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPG\u00174\u0006\u0019I\u001e%\u0004\nN\u00178[\u001aC\u0006%ORS\u0006!_\nS_#D\u001bE]";
                    obj = 254;
                    strArr2 = strArr3;
                    break;
                case 254:
                    strArr2[i] = str;
                    i = 256;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPG\u00174\u0006\u0019I\u001e%\u000b\nR\u001e`_\u0010\u0000\u0010%\u000b\u0010P\u0017.N\u001b\u0000\u001b3\u000b";
                    obj = 255;
                    strArr2 = strArr3;
                    break;
                case 255:
                    strArr2[i] = str;
                    i = 257;
                    str = "V\u0000\u001c/__F\u001d5E\u001b\u0000\u001d.\u000b\rE\u001f/_\u001a\u0000\u0001%Y\tE\u00003\u0005";
                    obj = 256;
                    strArr2 = strArr3;
                    break;
                case 256:
                    strArr2[i] = str;
                    i = 258;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPG\u00174\u0006\u0019I\u001e%\u0004";
                    obj = 257;
                    strArr2 = strArr3;
                    break;
                case 257:
                    strArr2[i] = str;
                    i = 259;
                    str = "\u0019I\u0017,O\f";
                    obj = 258;
                    strArr2 = strArr3;
                    break;
                case 258:
                    strArr2[i] = str;
                    i = 260;
                    str = "\u0017T\u00060XE\u000f]7\\\b\u000e\u0015/D\u0018L\u0017![\u0016S\\#D\u0012\u000f\u00162B\tE]6\u0019PF\u001b,N\f\u000fW3";
                    obj = 259;
                    strArr2 = strArr3;
                    break;
                case 259:
                    strArr2[i] = str;
                    i = 261;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPG\u00174\u0006\u0019I\u001e%";
                    obj = 260;
                    strArr2 = strArr3;
                    break;
                case 260:
                    strArr2[i] = str;
                    i = 262;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002$J\u000bE_4B\u000bL\u0017";
                    obj = 261;
                    strArr2 = strArr3;
                    break;
                case 261:
                    strArr2[i] = str;
                    i = 263;
                    str = "\u000bI\u0006,N";
                    obj = 262;
                    strArr2 = strArr3;
                    break;
                case 262:
                    strArr2[i] = str;
                    i = 264;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002$J\u000bE_4B\u000bL\u0017";
                    obj = 263;
                    strArr2 = strArr3;
                    break;
                case 263:
                    strArr2[i] = str;
                    i = 265;
                    str = "\u0017T\u00060XE\u000f]7\\\b\u000e\u0015/D\u0018L\u0017![\u0016S\\#D\u0012\u000f\u00162B\tE]6\u0019PF\u001b,N\f\u000fW3";
                    obj = 264;
                    strArr2 = strArr3;
                    break;
                case 264:
                    strArr2[i] = str;
                    i = 266;
                    str = "\fP\u0013#N\f";
                    obj = 265;
                    strArr2 = strArr3;
                    break;
                case 265:
                    strArr2[i] = str;
                    i = 267;
                    str = "/u&";
                    obj = 266;
                    strArr2 = strArr3;
                    break;
                case 266:
                    strArr2[i] = str;
                    i = 268;
                    str = "<O\u001c4N\u0011T_\u0014R\u000fE";
                    obj = 267;
                    strArr2 = strArr3;
                    break;
                case 267:
                    strArr2[i] = str;
                    i = 269;
                    str = "\u0019I\u0017,O\f";
                    obj = 268;
                    strArr2 = strArr3;
                    break;
                case 268:
                    strArr2[i] = str;
                    i = 270;
                    str = "\u001eP\u0002,B\u001cA\u0006)D\u0011\u000f\u00183D\u0011\u001bR#C\u001eR\u0001%_Bu&\u0006\u0006G";
                    obj = 269;
                    strArr2 = strArr3;
                    break;
                case 269:
                    strArr2[i] = str;
                    i = 271;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002$J\u000bE_4B\u000bL\u0017oY\u001aS\u0002/E\fER";
                    obj = 270;
                    strArr2 = strArr3;
                    break;
                case 270:
                    strArr2[i] = str;
                    i = 272;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPU\u0002$J\u000bE_4B\u000bL\u0017`\\\u001aI\u0000$\u000b\fT\u00134^\f\u0000\u0011/O\u001a\u001aR";
                    obj = 271;
                    strArr2 = strArr3;
                    break;
                case 271:
                    strArr2[i] = str;
                    i = 273;
                    str = "(ER(J\tER!E_i\u001c%_>D\u00162N\fSR7C\u0016C\u001a`B\f\u0000\u001c%B\u000bH\u00172\u000b6p\u0004t\u000b\u001eN\u0016`E\u0010RR\t{\t\u0016H`";
                    obj = 272;
                    strArr2 = strArr3;
                    break;
                case 272:
                    strArr2[i] = str;
                    i = 274;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPG\u00174\u0006\u0016P_&D\r\r\u0015/D\u0018L\u0017![\u0016S]&J\u0016L\u0017$";
                    obj = 273;
                    strArr2 = strArr3;
                    break;
                case 273:
                    strArr2[i] = str;
                    i = 275;
                    str = "1OR\t{_F\u001d5E\u001b\u0000\u0014/Y_W\u00057\u0005\u0018O\u001d'G\u001aA\u0002)XQC\u001d-";
                    obj = 274;
                    strArr2 = strArr3;
                    break;
                case 274:
                    strArr2[i] = str;
                    i = 276;
                    str = "\bW\u0005nL\u0010O\u0015,N\u001eP\u001b3\u0005\u001cO\u001f";
                    obj = 275;
                    strArr2 = strArr3;
                    break;
                case 275:
                    strArr2[i] = str;
                    i = 277;
                    str = "\fP\u0013#N\f";
                    obj = 276;
                    strArr2 = strArr3;
                    break;
                case 276:
                    strArr2[i] = str;
                    i = 278;
                    str = "ZS^eX";
                    obj = 277;
                    strArr2 = strArr3;
                    break;
                case 277:
                    strArr2[i] = str;
                    i = 279;
                    str = "\u0017T\u00060XE\u000f]7\\\b\u000e\u0015/D\u0018L\u0017![\u0016S\\#D\u0012\u000f\u00162B\tE]6\u0019PF\u001b,N\f\u000fW3\u0014\u001eL\u0006}F\u001aD\u001b!";
                    obj = 278;
                    strArr2 = strArr3;
                    break;
                case 278:
                    strArr2[i] = str;
                    i = 280;
                    str = "\u001eP\u0002\u0003D\u0011T\u0017._";
                    obj = 279;
                    strArr2 = strArr3;
                    break;
                case 279:
                    strArr2[i] = str;
                    i = 281;
                    str = "\u001eP\u0002\u0004J\u000bA4/G\u001bE\u0000";
                    obj = 280;
                    strArr2 = strArr3;
                    break;
                case 280:
                    strArr2[i] = str;
                    i = 282;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u0017,N\u000bE_&B\u0013E]&B\u0013E_.D\u000b\r\u0014/^\u0011D";
                    obj = 281;
                    strArr2 = strArr3;
                    break;
                case 281:
                    strArr2[i] = str;
                    i = 283;
                    str = ";e>\u0005\u007f:";
                    obj = 282;
                    strArr2 = strArr3;
                    break;
                case 282:
                    strArr2[i] = str;
                    i = 284;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u0017,N\u000bE_&B\u0013E";
                    obj = 283;
                    strArr2 = strArr3;
                    break;
                case 283:
                    strArr2[i] = str;
                    i = 285;
                    str = "\u0017T\u00060XE\u000f]7\\\b\u000e\u0015/D\u0018L\u0017![\u0016S\\#D\u0012\u000f\u00162B\tE]6\u0019PF\u001b,N\f\u000fW3";
                    obj = 284;
                    strArr2 = strArr3;
                    break;
                case 284:
                    strArr2[i] = str;
                    i = 286;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPD\u0017,N\u000bE_&B\u0013E]5E\u001aX\u0002%H\u000bE\u0016mY\u001aS\u0002/E\fE]";
                    obj = 285;
                    strArr2 = strArr3;
                    break;
                case 285:
                    strArr2[i] = str;
                    i = 287;
                    str = "S\u0000\u0016%G\u001aT\u001b.L_I\u0006n";
                    obj = 286;
                    strArr2 = strArr3;
                    break;
                case 286:
                    strArr2[i] = str;
                    i = 288;
                    str = "_T\u001d`";
                    obj = 287;
                    strArr2 = strArr3;
                    break;
                case 287:
                    strArr2[i] = str;
                    i = 289;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_D\u001d.N_W\u0000)_\u0016N\u0015`";
                    obj = 288;
                    strArr2 = strArr3;
                    break;
                case 288:
                    strArr2[i] = str;
                    i = 290;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_";
                    obj = 289;
                    strArr2 = strArr3;
                    break;
                case 289:
                    strArr2[i] = str;
                    i = 291;
                    str = "_E\n)X\u000bSR!E\u001b\u0000\u001b3\u000b\u001e\u0000\u0016)Y\u001aC\u0006/Y\u0006\fR#J\u0011N\u001d4\u000b\u000fR\u001d#N\u001aDR&^\rT\u001a%YQ";
                    obj = 290;
                    strArr2 = strArr3;
                    break;
                case 290:
                    strArr2[i] = str;
                    i = 292;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_D\u0017,N\u000bE\u0016`[\u001eR\u0006)J\u0013\u0000\u0016/\\\u0011L\u001d!O_F\u001b,N_";
                    obj = 291;
                    strArr2 = strArr3;
                    break;
                case 291:
                    strArr2[i] = str;
                    i = 293;
                    str = "_A\u001e2N\u001eD\u000b`H\u0010N\u0006!B\u0011SR!G\u0013\u0000\u0006(N_C\u001d._\u001aN\u0006`";
                    obj = 292;
                    strArr2 = strArr3;
                    break;
                case 292:
                    strArr2[i] = str;
                    i = 294;
                    str = "_S\u0006!_\nS>)E\u001a\u0000";
                    obj = 293;
                    strArr2 = strArr3;
                    break;
                case 293:
                    strArr2[i] = str;
                    i = 295;
                    str = "_B\u000b4N\f\u0000\u001a!]\u001a\u0000\u0013,Y\u001aA\u00169\u000b\u001dE\u0017.\u000b\u001bO\u0005.G\u0010A\u0016%OQ";
                    obj = 294;
                    strArr2 = strArr3;
                    break;
                case 294:
                    strArr2[i] = str;
                    i = 296;
                    str = "\u001dY\u0006%XB\u0005\u0016m";
                    obj = 295;
                    strArr2 = strArr3;
                    break;
                case 295:
                    strArr2[i] = str;
                    i = 297;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_S\u0006!_\nSR/M_T\u001a%\u000b\rE\u00010D\u0011S\u0017`B\f\u0000";
                    obj = 296;
                    strArr2 = strArr3;
                    break;
                case 296:
                    strArr2[i] = str;
                    i = 298;
                    str = "V\u0000\u0016/N\f\u0000\u001c/__M\u00134H\u0017\u0000\u0000%F\u0010T\u0017`F\u001b\u0015Z";
                    obj = 297;
                    strArr2 = strArr3;
                    break;
                case 297:
                    strArr2[i] = str;
                    i = 299;
                    str = "_I\u0001`F\u0010R\u0017`_\u0017A\u001c`";
                    obj = 298;
                    strArr2 = strArr3;
                    break;
                case 298:
                    strArr2[i] = str;
                    i = 300;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_S\u001b:N_O\u0014`";
                    obj = 299;
                    strArr2 = strArr3;
                    break;
                case 299:
                    strArr2[i] = str;
                    i = 301;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_";
                    obj = 300;
                    strArr2 = strArr3;
                    break;
                case 300:
                    strArr2[i] = str;
                    i = 302;
                    str = "V\u000e";
                    obj = 301;
                    strArr2 = strArr3;
                    break;
                case 301:
                    strArr2[i] = str;
                    i = 303;
                    str = "-A\u001c'N";
                    obj = 302;
                    strArr2 = strArr3;
                    break;
                case 302:
                    strArr2[i] = str;
                    i = 304;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_U\u001c!I\u0013ER4D_R\u0017.J\u0012ER";
                    obj = 303;
                    strArr2 = strArr3;
                    break;
                case 303:
                    strArr2[i] = str;
                    i = 305;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_N\u001d4C\u0016N\u0015`_\u0010\u0000\u0016/\\\u0011L\u001d!OS\u0000\u0000%E\u001eM\u001b.L_";
                    obj = 304;
                    strArr2 = strArr3;
                    break;
                case 304:
                    strArr2[i] = str;
                    i = 306;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_U\u001c!I\u0013ER4D_A\u0011#N\fSR";
                    obj = 305;
                    strArr2 = strArr3;
                    break;
                case 305:
                    strArr2[i] = str;
                    i = 307;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_";
                    obj = 306;
                    strArr2 = strArr3;
                    break;
                case 306:
                    strArr2[i] = str;
                    i = 308;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N";
                    obj = 307;
                    strArr2 = strArr3;
                    break;
                case 307:
                    strArr2[i] = str;
                    i = 309;
                    str = ":n=\u0013{<";
                    obj = 308;
                    strArr2 = strArr3;
                    break;
                case 308:
                    strArr2[i] = str;
                    i = 310;
                    str = "_T\u001d`G\u0010C\u00134B\u0010NH`";
                    obj = 309;
                    strArr2 = strArr3;
                    break;
                case 309:
                    strArr2[i] = str;
                    i = 311;
                    str = "_D\u001d7E\u0013O\u0013$N\u001b\u0000\u00105__I\u00063\u000b2dGh";
                    obj = 310;
                    strArr2 = strArr3;
                    break;
                case 310:
                    strArr2[i] = str;
                    i = 312;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_S\u0006!_\nSR/M_T\u001a%\u000b\rE\u00010D\u0011S\u0017`B\f\u0000";
                    obj = 311;
                    strArr2 = strArr3;
                    break;
                case 311:
                    strArr2[i] = str;
                    i = 313;
                    str = "_T\u001d`";
                    obj = 312;
                    strArr2 = strArr3;
                    break;
                case 312:
                    strArr2[i] = str;
                    i = 314;
                    str = "_T\u001d`";
                    obj = 313;
                    strArr2 = strArr3;
                    break;
                case 313:
                    strArr2[i] = str;
                    i = 315;
                    str = "V\u0000\u0016/N\f\u0000\u001c/__M\u00134H\u0017\u0000\u0000%F\u0010T\u0017`F\u001b\u0015Z";
                    obj = 314;
                    strArr2 = strArr3;
                    break;
                case 314:
                    strArr2[i] = str;
                    i = 316;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_N\u001d`X\u000fA\u0011%\u000b\u0013E\u00144\u000b\u0010NR4C\u001a\u0000\u0016%]\u0016C\u0017n";
                    obj = 315;
                    strArr2 = strArr3;
                    break;
                case 315:
                    strArr2[i] = str;
                    i = 317;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_F\u0013)G\u001aDR4D_C\u0000%J\u000bER";
                    obj = 316;
                    strArr2 = strArr3;
                    break;
                case 316:
                    strArr2[i] = str;
                    i = 318;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_";
                    obj = 317;
                    strArr2 = strArr3;
                    break;
                case 317:
                    strArr2[i] = str;
                    i = 319;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_R\u0017-D\u000bE?\u0004\u001e_C\u0013.E\u0010TR\"N_N\u0007,GS\u0000\u00178B\u000bI\u001c'\u0005";
                    obj = 318;
                    strArr2 = strArr3;
                    break;
                case 318:
                    strArr2[i] = str;
                    i = 320;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,NPF\u0013)G\u001aD_4DRD\u0017,N\u000bER";
                    obj = 319;
                    strArr2 = strArr3;
                    break;
                case 319:
                    strArr2[i] = str;
                    i = 321;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_D\u0017,N\u000bE\u0016`[\u001eR\u0006)J\u0013\u0000\u0016/\\\u0011L\u001d!O_F\u001b,N_";
                    obj = 320;
                    strArr2 = strArr3;
                    break;
                case 320:
                    strArr2[i] = str;
                    i = 322;
                    str = "_S\u0006!_\nS>)E\u001a\u0000";
                    obj = 321;
                    strArr2 = strArr3;
                    break;
                case 321:
                    strArr2[i] = str;
                    i = 323;
                    str = "\u001dU\u0006`B\u000bSR\roJ\b";
                    obj = 322;
                    strArr2 = strArr3;
                    break;
                case 322:
                    strArr2[i] = str;
                    i = 324;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_R\u00173b\u001b\u0000\u0011!E\u0011O\u0006`I\u001a\u0000\u001c5G\u0013\fR%S\u0016T\u001b.LQ";
                    obj = 323;
                    strArr2 = strArr3;
                    break;
                case 323:
                    strArr2[i] = str;
                    i = 325;
                    str = "_I\u0001`";
                    obj = 324;
                    strArr2 = strArr3;
                    break;
                case 324:
                    strArr2[i] = str;
                    i = 326;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_";
                    obj = 325;
                    strArr2 = strArr3;
                    break;
                case 325:
                    strArr2[i] = str;
                    i = 327;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_S\u001b:N_C\u0013.E\u0010TR\"N_N\u0017'J\u000bI\u0004%\u0007_E\n)_\u0016N\u0015n";
                    obj = 326;
                    strArr2 = strArr3;
                    break;
                case 326:
                    strArr2[i] = str;
                    i = 328;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,NPF\u0013)G\u001aD_4DRD\u0017,N\u000bER";
                    obj = 327;
                    strArr2 = strArr3;
                    break;
                case 327:
                    strArr2[i] = str;
                    i = 329;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,NPF\u0013)G\u001aD_4DRD\u0017,N\u000bE_0J\rT\u001b!GRF\u001b,NP\u0000";
                    obj = 328;
                    strArr2 = strArr3;
                    break;
                case 328:
                    strArr2[i] = str;
                    i = 330;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_";
                    obj = 329;
                    strArr2 = strArr3;
                    break;
                case 329:
                    strArr2[i] = str;
                    i = 331;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_";
                    obj = 330;
                    strArr2 = strArr3;
                    break;
                case 330:
                    strArr2[i] = str;
                    i = 332;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_U\u001c!I\u0013ER4D_R\u0017.J\u0012ER";
                    obj = 331;
                    strArr2 = strArr3;
                    break;
                case 331:
                    strArr2[i] = str;
                    i = 333;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_D\u0017,N\u000bE\u0016`[\u001eR\u0006)J\u0013\u0000\u0016/\\\u0011L\u001d!O_F\u001b,N_";
                    obj = 332;
                    strArr2 = strArr3;
                    break;
                case 332:
                    strArr2[i] = str;
                    i = 334;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPS\u00136NRF\u001b,N_E\u00002D\r\u0000\u0005(B\u0013ER$D\bN\u001e/J\u001bI\u001c'\u000b\u0019I\u001e%\u000b";
                    obj = 333;
                    strArr2 = strArr3;
                    break;
                case 333:
                    strArr2[i] = str;
                    i = 335;
                    str = "\u0018D\u0000)]\u001a\r\u00130BPI\u001c3N\rT_2N\fU\u001f!I\u0013E_5Y\u0016\u0000\u0007.J\u001dL\u0017`_\u0010\u0000\u0011/F\u0012I\u0006`Y\u001aS\u0007-J\u001dL\u0017`^\rIR4D_S\u001a!Y\u001aDR0Y\u001aF\u0001n";
                    obj = 334;
                    strArr2 = strArr3;
                    break;
                case 334:
                    int i4;
                    strArr2[i] = str;
                    z = strArr3;
                    StringBuilder stringBuilder = new StringBuilder();
                    char[] toCharArray2 = "\u0019O\u001d\u001fI\u001eR-\"J\u0005".toCharArray();
                    i = toCharArray2.length;
                    toCharArray = toCharArray2;
                    for (int i5 = 0; i > i5; i5++) {
                        char c2 = toCharArray[i5];
                        switch (i5 % 5) {
                            case v.m /*0*/:
                                i4 = 127;
                                break;
                            case at.g /*1*/:
                                i4 = 32;
                                break;
                            case at.i /*2*/:
                                i4 = 114;
                                break;
                            case at.o /*3*/:
                                i4 = 64;
                                break;
                            default:
                                i4 = 43;
                                break;
                        }
                        toCharArray[i5] = (char) (i4 ^ c2);
                    }
                    m = stringBuilder.append(new String(toCharArray).intern()).append(UUID.randomUUID().toString()).toString();
                    toCharArray2 = "\u001dY\u0006%XB\u0010_hw\u001b\n[".toCharArray();
                    i2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (i = 0; i2 > i; i++) {
                        char c3 = cArr2[i];
                        switch (i % 5) {
                            case v.m /*0*/:
                                i4 = 127;
                                break;
                            case at.g /*1*/:
                                i4 = 32;
                                break;
                            case at.i /*2*/:
                                i4 = 114;
                                break;
                            case at.o /*3*/:
                                i4 = 64;
                                break;
                            default:
                                i4 = 43;
                                break;
                        }
                        cArr2[i] = (char) (i4 ^ c3);
                    }
                    k = Pattern.compile(new String(cArr2).intern());
                    h = new fm();
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0017T\u00060\u0005\u000fR\u001d4D\u001cO\u001en]\u001aR\u0001)D\u0011";
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    private java.lang.String d() {
        /*
        r10 = this;
        r3 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = com.whatsapp.util.dns.i.a();
        r1 = z;
        r2 = 276; // 0x114 float:3.87E-43 double:1.364E-321;
        r1 = r1[r2];
        r1 = r0.d(r1);
        if (r1 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r1.size();	 Catch:{ SecurityException -> 0x0024 }
        if (r0 != 0) goto L_0x0026;
    L_0x0018:
        r0 = new java.io.IOException;	 Catch:{ SecurityException -> 0x0024 }
        r1 = z;	 Catch:{ SecurityException -> 0x0024 }
        r2 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x0024 }
        r0.<init>(r1);	 Catch:{ SecurityException -> 0x0024 }
        throw r0;	 Catch:{ SecurityException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = 0;
        r4 = r1.iterator();
        r1 = r0;
    L_0x002c:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00cf;
    L_0x0032:
        r0 = r4.next();
        r0 = (java.net.InetAddress) r0;
        r2 = r0.getHostAddress();
        r5 = r0 instanceof java.net.Inet6Address;	 Catch:{ SecurityException -> 0x0094 }
        if (r5 == 0) goto L_0x006b;
    L_0x0040:
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ SecurityException -> 0x0094 }
        r8 = r10.g;	 Catch:{ SecurityException -> 0x0094 }
        r6 = r6 - r8;
        r8 = 600000; // 0x927c0 float:8.40779E-40 double:2.964394E-318;
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 <= 0) goto L_0x0098;
    L_0x004e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = "[";
        r1 = r1.append(r4);
        r1 = r1.append(r2);
        r4 = "]";
        r1 = r1.append(r4);
        r1 = r1.toString();
        if (r3 == 0) goto L_0x00cf;
    L_0x006b:
        r1 = r0 instanceof java.net.Inet4Address;	 Catch:{ SecurityException -> 0x0096 }
        if (r1 == 0) goto L_0x0071;
    L_0x006f:
        if (r3 == 0) goto L_0x00d4;
    L_0x0071:
        r1 = new java.lang.IllegalStateException;	 Catch:{ SecurityException -> 0x0092 }
        r2 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0092 }
        r2.<init>();	 Catch:{ SecurityException -> 0x0092 }
        r3 = z;	 Catch:{ SecurityException -> 0x0092 }
        r4 = 273; // 0x111 float:3.83E-43 double:1.35E-321;
        r3 = r3[r4];	 Catch:{ SecurityException -> 0x0092 }
        r2 = r2.append(r3);	 Catch:{ SecurityException -> 0x0092 }
        r0 = r0.getHostAddress();	 Catch:{ SecurityException -> 0x0092 }
        r0 = r2.append(r0);	 Catch:{ SecurityException -> 0x0092 }
        r0 = r0.toString();	 Catch:{ SecurityException -> 0x0092 }
        r1.<init>(r0);	 Catch:{ SecurityException -> 0x0092 }
        throw r1;	 Catch:{ SecurityException -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        if (r1 != 0) goto L_0x00cd;
    L_0x009a:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "[";
        r0 = r0.append(r1);
        r0 = r0.append(r2);
        r1 = "]";
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x00b5:
        if (r3 == 0) goto L_0x00d1;
    L_0x00b7:
        if (r0 != 0) goto L_0x00c7;
    L_0x00b9:
        r0 = new java.io.IOException;	 Catch:{ SecurityException -> 0x00c5 }
        r1 = z;	 Catch:{ SecurityException -> 0x00c5 }
        r2 = 275; // 0x113 float:3.85E-43 double:1.36E-321;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x00c5 }
        r0.<init>(r1);	 Catch:{ SecurityException -> 0x00c5 }
        throw r0;	 Catch:{ SecurityException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r1 = r10.f;
        r1.add(r0);
        return r0;
    L_0x00cd:
        r0 = r1;
        goto L_0x00b5;
    L_0x00cf:
        r0 = r1;
        goto L_0x00b7;
    L_0x00d1:
        r1 = r0;
        goto L_0x002c;
    L_0x00d4:
        r0 = r2;
        goto L_0x00b7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bc.d():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.gdrive.fs a(@android.support.annotation.NonNull java.lang.String r19, @android.support.annotation.NonNull java.lang.String r20, @android.support.annotation.NonNull java.lang.String r21, @android.support.annotation.NonNull com.whatsapp.gdrive.bs r22, @android.support.annotation.Nullable com.whatsapp.gdrive.er r23, @android.support.annotation.Nullable java.lang.String r24) {
        /*
        r18 = this;
        r15 = com.whatsapp.gdrive.GoogleDriveService.c;
        r2 = com.whatsapp.App.am;
        r3 = 3;
        if (r2 != r3) goto L_0x0007;
    L_0x0007:
        r4 = new java.io.File;
        r0 = r20;
        r4.<init>(r0);
        r2 = r4.exists();	 Catch:{ IOException -> 0x0067 }
        if (r2 != 0) goto L_0x0069;
    L_0x0014:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0067 }
        r2.<init>();	 Catch:{ IOException -> 0x0067 }
        r3 = z;	 Catch:{ IOException -> 0x0067 }
        r5 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r3 = r3[r5];	 Catch:{ IOException -> 0x0067 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0067 }
        r3 = r4.getAbsolutePath();	 Catch:{ IOException -> 0x0067 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0067 }
        r3 = z;	 Catch:{ IOException -> 0x0067 }
        r5 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r3 = r3[r5];	 Catch:{ IOException -> 0x0067 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0067 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0067 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0067 }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IOException -> 0x0067 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0067 }
        r3.<init>();	 Catch:{ IOException -> 0x0067 }
        r5 = z;	 Catch:{ IOException -> 0x0067 }
        r6 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0067 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x0067 }
        r4 = r4.getAbsolutePath();	 Catch:{ IOException -> 0x0067 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0067 }
        r4 = z;	 Catch:{ IOException -> 0x0067 }
        r5 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0067 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0067 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0067 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x0067 }
        throw r2;	 Catch:{ IOException -> 0x0067 }
    L_0x0067:
        r2 = move-exception;
        throw r2;
    L_0x0069:
        r0 = r18;
        r1 = r21;
        r5 = r0.f(r1);
        r2 = 0;
        if (r5 == 0) goto L_0x07ab;
    L_0x0075:
        r7 = new org.apache.http.client.methods.HttpPut;
        r7.<init>(r5);
        r6 = z;
        r8 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r6 = r6[r8];
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = z;
        r10 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r0 = r18;
        r9 = r0.c;
        r8 = r8.append(r9);
        r8 = r8.toString();
        r7.setHeader(r6, r8);
        r6 = z;
        r8 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r6 = r6[r8];
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = z;
        r10 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r10 = r4.length();
        r8 = r8.append(r10);
        r8 = r8.toString();
        r7.setHeader(r6, r8);
        r6 = 0;
        r8 = r22.a();	 Catch:{ IOException -> 0x00cb }
        if (r8 != 0) goto L_0x00cd;
    L_0x00c9:
        r2 = 0;
    L_0x00ca:
        return r2;
    L_0x00cb:
        r2 = move-exception;
        throw r2;
    L_0x00cd:
        r0 = r18;
        r8 = r0.n;	 Catch:{ IOException -> 0x07a7, all -> 0x011b }
        r0 = r18;
        r8 = r0.a(r8, r7);	 Catch:{ IOException -> 0x07a7, all -> 0x011b }
        r6 = r8.getEntity();	 Catch:{ IOException -> 0x07a7, all -> 0x011b }
        com.whatsapp.gdrive.fn.a(r7);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r7 = r8.getStatusLine();	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r7 = r7.getStatusCode();	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r9 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r7 != r9) goto L_0x014b;
    L_0x00ea:
        if (r6 == 0) goto L_0x0122;
    L_0x00ec:
        r2 = org.apache.http.util.EntityUtils.toString(r6);	 Catch:{ IOException -> 0x0119, all -> 0x011b }
    L_0x00f0:
        r0 = r18;
        r1 = r21;
        r0.h(r1);	 Catch:{ IOException -> 0x0105, all -> 0x011b }
        r0 = r18;
        r3 = r0.c(r2);	 Catch:{ IOException -> 0x0105, all -> 0x011b }
        if (r3 == 0) goto L_0x0124;
    L_0x00ff:
        r2 = new com.whatsapp.gdrive.e9;	 Catch:{ IOException -> 0x0105, all -> 0x011b }
        r2.<init>();	 Catch:{ IOException -> 0x0105, all -> 0x011b }
        throw r2;	 Catch:{ IOException -> 0x0105, all -> 0x011b }
    L_0x0105:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0107, all -> 0x011b }
    L_0x0107:
        r2 = move-exception;
        r3 = r6;
    L_0x0109:
        r4 = z;	 Catch:{ all -> 0x07a3 }
        r5 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x07a3 }
        com.whatsapp.util.Log.b(r4, r2);	 Catch:{ all -> 0x07a3 }
        r2 = 0;
        r0 = r18;
        r0.a(r3);
        goto L_0x00ca;
    L_0x0119:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0107, all -> 0x011b }
    L_0x011b:
        r2 = move-exception;
    L_0x011c:
        r0 = r18;
        r0.a(r6);
        throw r2;
    L_0x0122:
        r2 = 0;
        goto L_0x00f0;
    L_0x0124:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0147, all -> 0x011b }
        r3.<init>();	 Catch:{ IOException -> 0x0147, all -> 0x011b }
        r4 = z;	 Catch:{ IOException -> 0x0147, all -> 0x011b }
        r5 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0147, all -> 0x011b }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0147, all -> 0x011b }
        if (r6 == 0) goto L_0x0149;
    L_0x0135:
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r2 = 0;
        r0 = r18;
        r0.a(r6);
        goto L_0x00ca;
    L_0x0147:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0107, all -> 0x011b }
    L_0x0149:
        r2 = 0;
        goto L_0x0135;
    L_0x014b:
        r9 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r7 != r9) goto L_0x015a;
    L_0x014f:
        r18.e();	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r2 = 0;
        r0 = r18;
        r0.a(r6);
        goto L_0x00ca;
    L_0x015a:
        r9 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        if (r7 != r9) goto L_0x01e3;
    L_0x015e:
        r7 = z;	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r9 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r7 = r7[r9];	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r7 = r8.getHeaders(r7);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r9 = r7.length;	 Catch:{ IOException -> 0x02ab, all -> 0x011b }
        r10 = 1;
        if (r9 <= r10) goto L_0x018f;
    L_0x016c:
        r9 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02ab, all -> 0x011b }
        r9.<init>();	 Catch:{ IOException -> 0x02ab, all -> 0x011b }
        r10 = z;	 Catch:{ IOException -> 0x02ab, all -> 0x011b }
        r11 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r10 = r10[r11];	 Catch:{ IOException -> 0x02ab, all -> 0x011b }
        r9 = r9.append(r10);	 Catch:{ IOException -> 0x02ab, all -> 0x011b }
        r10 = " ";
        r10 = android.text.TextUtils.join(r10, r7);	 Catch:{ IOException -> 0x02ab, all -> 0x011b }
        r9 = r9.append(r10);	 Catch:{ IOException -> 0x02ab, all -> 0x011b }
        r9 = r9.toString();	 Catch:{ IOException -> 0x02ab, all -> 0x011b }
        com.whatsapp.util.Log.e(r9);	 Catch:{ IOException -> 0x02ab, all -> 0x011b }
        if (r15 == 0) goto L_0x01e3;
    L_0x018f:
        r9 = r7.length;	 Catch:{ IOException -> 0x02ad, all -> 0x011b }
        r10 = 1;
        if (r9 != r10) goto L_0x01d8;
    L_0x0193:
        r9 = k;	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r10 = 0;
        r7 = r7[r10];	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r7 = r7.getValue();	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r7 = r9.matcher(r7);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r9 = r7.find();	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        if (r9 == 0) goto L_0x01d6;
    L_0x01a6:
        r2 = 1;
        r2 = r7.group(r2);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r2 = r2 + 1;
        r2 = (long) r2;	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r7 = z;	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r9 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r7 = r7[r9];	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r7 = r8.getHeaders(r7);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r9 = 0;
        r7 = r7[r9];	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r7 = r7.getValue();	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r9 = new java.io.File;	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r0 = r20;
        r9.<init>(r0);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r9 = com.whatsapp.gdrive.fn.a(r9, r2);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        if (r7 == 0) goto L_0x02b3;
    L_0x01d0:
        r7 = r7.equals(r9);	 Catch:{ IOException -> 0x02af, all -> 0x011b }
        if (r7 == 0) goto L_0x02b3;
    L_0x01d6:
        if (r15 == 0) goto L_0x01e3;
    L_0x01d8:
        com.whatsapp.gdrive.fn.a(r8);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r0 = r18;
        r1 = r21;
        r0.h(r1);	 Catch:{ IOException -> 0x0107, all -> 0x011b }
        r5 = 0;
    L_0x01e3:
        r0 = r18;
        r0.a(r6);
        r8 = r2;
        r2 = r5;
    L_0x01ea:
        r6 = 0;
        r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0411;
    L_0x01f0:
        r2 = z;
        r3 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r2 = r2[r3];
        r3 = z;
        r5 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r3 = r3[r5];
        r5 = ",";
        r6 = com.whatsapp.gdrive.fs.d();
        r5 = android.text.TextUtils.join(r5, r6);
        r2 = com.whatsapp.gdrive.fn.a(r2, r3, r5);
        r5 = new org.apache.http.client.methods.HttpPost;
        r5.<init>(r2);
        r2 = z;
        r3 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r2 = r2[r3];
        r3 = z;
        r6 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r3 = r3[r6];
        r5.setHeader(r2, r3);
        r2 = z;
        r3 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r2 = r2[r3];
        r3 = z;
        r6 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r3 = r3[r6];
        r5.setHeader(r2, r3);
        r2 = z;
        r3 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r2 = r2[r3];
        r6 = r4.length();
        r3 = java.lang.String.valueOf(r6);
        r5.setHeader(r2, r3);
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r2.<init>();	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r3 = z;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r6 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r3 = r3[r6];	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r0 = r21;
        r2 = r2.put(r3, r0);	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r3 = z;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r6 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r3 = r3[r6];	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r6 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r6.<init>();	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r7 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r7.<init>();	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r10 = z;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r11 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r10 = r10[r11];	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r11 = z;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r12 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r11 = r11[r12];	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r7 = r7.put(r10, r11);	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r10 = z;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r11 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r10 = r10[r11];	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r0 = r19;
        r7 = r7.put(r10, r0);	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r6 = r6.put(r7);	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r2 = r2.put(r3, r6);	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r3 = z;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r6 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r3 = r3[r6];	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r0 = r24;
        r2 = r2.putOpt(r3, r0);	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r3 = new org.apache.http.entity.StringEntity;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r6 = z;	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r7 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r6 = r6[r7];	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r3.<init>(r2, r6);	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r5.setEntity(r3);	 Catch:{ JSONException -> 0x02b7, UnsupportedEncodingException -> 0x02c4 }
        r2 = r22.a();	 Catch:{ IOException -> 0x02d1 }
        if (r2 != 0) goto L_0x02d3;
    L_0x02a8:
        r2 = 0;
        goto L_0x00ca;
    L_0x02ab:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x02ad, all -> 0x011b }
    L_0x02ad:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0107, all -> 0x011b }
    L_0x02af:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x02b1, all -> 0x011b }
    L_0x02b1:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0107, all -> 0x011b }
    L_0x02b3:
        r2 = 0;
        goto L_0x01d6;
    L_0x02b7:
        r2 = move-exception;
        r3 = z;
        r4 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        r2 = 0;
        goto L_0x00ca;
    L_0x02c4:
        r2 = move-exception;
        r3 = z;
        r4 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        r2 = 0;
        goto L_0x00ca;
    L_0x02d1:
        r2 = move-exception;
        throw r2;
    L_0x02d3:
        r3 = 0;
        r2 = z;	 Catch:{ IOException -> 0x035b }
        r6 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r2 = r2[r6];	 Catch:{ IOException -> 0x035b }
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x035b }
        r6.<init>();	 Catch:{ IOException -> 0x035b }
        r7 = z;	 Catch:{ IOException -> 0x035b }
        r10 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r7 = r7[r10];	 Catch:{ IOException -> 0x035b }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x035b }
        r0 = r18;
        r7 = r0.c;	 Catch:{ IOException -> 0x035b }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x035b }
        r6 = r6.toString();	 Catch:{ IOException -> 0x035b }
        r5.setHeader(r2, r6);	 Catch:{ IOException -> 0x035b }
        r0 = r18;
        r2 = r0.n;	 Catch:{ IOException -> 0x035b }
        r0 = r18;
        r6 = r0.a(r2, r5);	 Catch:{ IOException -> 0x035b }
        r3 = r6.getEntity();	 Catch:{ IOException -> 0x035b }
        if (r3 == 0) goto L_0x036d;
    L_0x0308:
        r2 = org.apache.http.util.EntityUtils.toString(r3);	 Catch:{ IOException -> 0x0359 }
    L_0x030c:
        com.whatsapp.gdrive.fn.a(r5);	 Catch:{ IOException -> 0x035b }
        com.whatsapp.gdrive.fn.a(r6);	 Catch:{ IOException -> 0x035b }
        r5 = r6.getStatusLine();	 Catch:{ IOException -> 0x035b }
        r5 = r5.getStatusCode();	 Catch:{ IOException -> 0x035b }
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r5 != r7) goto L_0x036f;
    L_0x031e:
        r2 = z;	 Catch:{ IOException -> 0x035b }
        r5 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r2 = r2[r5];	 Catch:{ IOException -> 0x035b }
        r2 = r6.getHeaders(r2);	 Catch:{ IOException -> 0x035b }
        r5 = r2.length;	 Catch:{ IOException -> 0x035b }
        r6 = 1;
        if (r5 == r6) goto L_0x03fe;
    L_0x032c:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x035b }
        r4.<init>();	 Catch:{ IOException -> 0x035b }
        r5 = z;	 Catch:{ IOException -> 0x035b }
        r6 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r5 = r5[r6];	 Catch:{ IOException -> 0x035b }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x035b }
        r2 = r2.length;	 Catch:{ IOException -> 0x035b }
        r2 = r4.append(r2);	 Catch:{ IOException -> 0x035b }
        r4 = z;	 Catch:{ IOException -> 0x035b }
        r5 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r4 = r4[r5];	 Catch:{ IOException -> 0x035b }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x035b }
        r2 = r2.toString();	 Catch:{ IOException -> 0x035b }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x035b }
        r2 = 0;
        r0 = r18;
        r0.a(r3);
        goto L_0x00ca;
    L_0x0359:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x035b }
    L_0x035b:
        r2 = move-exception;
        r4 = z;	 Catch:{ all -> 0x0399 }
        r5 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0399 }
        com.whatsapp.util.Log.b(r4, r2);	 Catch:{ all -> 0x0399 }
        r2 = 0;
        r0 = r18;
        r0.a(r3);
        goto L_0x00ca;
    L_0x036d:
        r2 = 0;
        goto L_0x030c;
    L_0x036f:
        r4 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r5 != r4) goto L_0x037e;
    L_0x0373:
        r18.e();	 Catch:{ IOException -> 0x035b }
        r2 = 0;
        r0 = r18;
        r0.a(r3);
        goto L_0x00ca;
    L_0x037e:
        r4 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r5 != r4) goto L_0x03c4;
    L_0x0382:
        r0 = r18;
        r1 = r21;
        r0.h(r1);	 Catch:{ IOException -> 0x03a0 }
        r0 = r18;
        r4 = r0.c(r2);	 Catch:{ IOException -> 0x03a0 }
        if (r4 == 0) goto L_0x03a2;
    L_0x0391:
        r2 = new com.whatsapp.gdrive.e9;	 Catch:{ IOException -> 0x0397 }
        r2.<init>();	 Catch:{ IOException -> 0x0397 }
        throw r2;	 Catch:{ IOException -> 0x0397 }
    L_0x0397:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x035b }
    L_0x0399:
        r2 = move-exception;
        r0 = r18;
        r0.a(r3);
        throw r2;
    L_0x03a0:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0397 }
    L_0x03a2:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x035b }
        r4.<init>();	 Catch:{ IOException -> 0x035b }
        r5 = z;	 Catch:{ IOException -> 0x035b }
        r6 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r5 = r5[r6];	 Catch:{ IOException -> 0x035b }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x035b }
        r2 = r4.append(r2);	 Catch:{ IOException -> 0x035b }
        r2 = r2.toString();	 Catch:{ IOException -> 0x035b }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x035b }
        r2 = 0;
        r0 = r18;
        r0.a(r3);
        goto L_0x00ca;
    L_0x03c4:
        r4 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r5 != r4) goto L_0x03d7;
    L_0x03c8:
        r0 = r18;
        r1 = r21;
        r0.h(r1);	 Catch:{ IOException -> 0x03d5 }
        r2 = new com.whatsapp.gdrive.ew;	 Catch:{ IOException -> 0x03d5 }
        r2.<init>();	 Catch:{ IOException -> 0x03d5 }
        throw r2;	 Catch:{ IOException -> 0x03d5 }
    L_0x03d5:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x035b }
    L_0x03d7:
        r0 = r18;
        r1 = r21;
        r0.h(r1);	 Catch:{ IOException -> 0x035b }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x035b }
        r4.<init>();	 Catch:{ IOException -> 0x035b }
        r6 = z;	 Catch:{ IOException -> 0x035b }
        r7 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x035b }
        r4 = r4.append(r6);	 Catch:{ IOException -> 0x035b }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x035b }
        r4 = r4.toString();	 Catch:{ IOException -> 0x035b }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IOException -> 0x035b }
        r4 = new com.whatsapp.gdrive.e3;	 Catch:{ IOException -> 0x035b }
        r4.<init>(r2);	 Catch:{ IOException -> 0x035b }
        throw r4;	 Catch:{ IOException -> 0x035b }
    L_0x03fe:
        r5 = 0;
        r2 = r2[r5];	 Catch:{ IOException -> 0x035b }
        r2 = r2.getValue();	 Catch:{ IOException -> 0x035b }
        r0 = r18;
        r1 = r21;
        r0.b(r1, r2);	 Catch:{ IOException -> 0x035b }
        r0 = r18;
        r0.a(r3);
    L_0x0411:
        r13 = new java.util.concurrent.atomic.AtomicLong;
        r6 = 0;
        r13.<init>(r6);
        r10 = new org.apache.http.client.methods.HttpPut;
        r10.<init>(r2);
        r16 = r4.length();
        r2 = 1;
        r6 = r16 - r2;
        r11 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x048d }
        r11.<init>(r4);	 Catch:{ FileNotFoundException -> 0x048d }
        r2 = r11.skip(r8);	 Catch:{ IOException -> 0x04e5 }
        r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r5 == 0) goto L_0x046c;
    L_0x0432:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x04e3 }
        r5.<init>();	 Catch:{ IOException -> 0x04e3 }
        r12 = z;	 Catch:{ IOException -> 0x04e3 }
        r14 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r12 = r12[r14];	 Catch:{ IOException -> 0x04e3 }
        r5 = r5.append(r12);	 Catch:{ IOException -> 0x04e3 }
        r12 = r4.getAbsolutePath();	 Catch:{ IOException -> 0x04e3 }
        r5 = r5.append(r12);	 Catch:{ IOException -> 0x04e3 }
        r12 = z;	 Catch:{ IOException -> 0x04e3 }
        r14 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r12 = r12[r14];	 Catch:{ IOException -> 0x04e3 }
        r5 = r5.append(r12);	 Catch:{ IOException -> 0x04e3 }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x04e3 }
        r12 = z;	 Catch:{ IOException -> 0x04e3 }
        r14 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r12 = r12[r14];	 Catch:{ IOException -> 0x04e3 }
        r5 = r5.append(r12);	 Catch:{ IOException -> 0x04e3 }
        r2 = r5.append(r2);	 Catch:{ IOException -> 0x04e3 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x04e3 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x04e3 }
    L_0x046c:
        r2 = new com.whatsapp.gdrive.ep;
        r3 = z;
        r5 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r5 = r3[r5];
        r3 = r18;
        r12 = r22;
        r14 = r23;
        r2.<init>(r3, r4, r5, r6, r8, r10, r11, r12, r13, r14);
        if (r23 == 0) goto L_0x0484;
    L_0x047f:
        r0 = r23;
        r0.a(r8);	 Catch:{ IOException -> 0x04f2 }
    L_0x0484:
        r3 = r22.a();	 Catch:{ IOException -> 0x04f4 }
        if (r3 != 0) goto L_0x04f6;
    L_0x048a:
        r2 = 0;
        goto L_0x00ca;
    L_0x048d:
        r2 = move-exception;
        r3 = r4.getAbsolutePath();	 Catch:{ IOException -> 0x04c6 }
        r5 = com.whatsapp.App.a3;	 Catch:{ IOException -> 0x04c6 }
        r5 = r5.getAbsolutePath();	 Catch:{ IOException -> 0x04c6 }
        r3 = r3.startsWith(r5);	 Catch:{ IOException -> 0x04c6 }
        if (r3 == 0) goto L_0x04c8;
    L_0x049e:
        r3 = com.whatsapp.App.aO();	 Catch:{ IOException -> 0x04c6 }
        if (r3 != 0) goto L_0x04c8;
    L_0x04a4:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x04c4 }
        r3.<init>();	 Catch:{ IOException -> 0x04c4 }
        r5 = z;	 Catch:{ IOException -> 0x04c4 }
        r6 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r5 = r5[r6];	 Catch:{ IOException -> 0x04c4 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x04c4 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x04c4 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x04c4 }
        com.whatsapp.util.Log.b(r3, r2);	 Catch:{ IOException -> 0x04c4 }
        r3 = new com.whatsapp.gdrive.ez;	 Catch:{ IOException -> 0x04c4 }
        r3.<init>(r2);	 Catch:{ IOException -> 0x04c4 }
        throw r3;	 Catch:{ IOException -> 0x04c4 }
    L_0x04c4:
        r2 = move-exception;
        throw r2;
    L_0x04c6:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x04c4 }
    L_0x04c8:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = z;
        r6 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.whatsapp.util.Log.b(r3, r2);
        throw r2;
    L_0x04e3:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x04e5 }
    L_0x04e5:
        r2 = move-exception;
        r3 = z;
        r4 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        r2 = 0;
        goto L_0x00ca;
    L_0x04f2:
        r2 = move-exception;
        throw r2;
    L_0x04f4:
        r2 = move-exception;
        throw r2;
    L_0x04f6:
        r3 = z;	 Catch:{ IOException -> 0x0576 }
        r4 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0576 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0576 }
        r4.<init>();	 Catch:{ IOException -> 0x0576 }
        r5 = z;	 Catch:{ IOException -> 0x0576 }
        r12 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r5 = r5[r12];	 Catch:{ IOException -> 0x0576 }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x0576 }
        r0 = r18;
        r5 = r0.c;	 Catch:{ IOException -> 0x0576 }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x0576 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x0576 }
        r10.setHeader(r3, r4);	 Catch:{ IOException -> 0x0576 }
        r3 = z;	 Catch:{ IOException -> 0x0576 }
        r4 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0576 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0576 }
        r4.<init>();	 Catch:{ IOException -> 0x0576 }
        r5 = z;	 Catch:{ IOException -> 0x0576 }
        r12 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r5 = r5[r12];	 Catch:{ IOException -> 0x0576 }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x0576 }
        r4 = r4.append(r8);	 Catch:{ IOException -> 0x0576 }
        r5 = "-";
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x0576 }
        r4 = r4.append(r6);	 Catch:{ IOException -> 0x0576 }
        r5 = "/";
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x0576 }
        r0 = r16;
        r4 = r4.append(r0);	 Catch:{ IOException -> 0x0576 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x0576 }
        r10.setHeader(r3, r4);	 Catch:{ IOException -> 0x0576 }
        r3 = z;	 Catch:{ IOException -> 0x0576 }
        r4 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0576 }
        r4 = z;	 Catch:{ IOException -> 0x0576 }
        r5 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0576 }
        r10.setHeader(r3, r4);	 Catch:{ IOException -> 0x0576 }
        r10.setEntity(r2);	 Catch:{ IOException -> 0x0576 }
        r3 = r18.f();	 Catch:{ IOException -> 0x0576 }
        if (r3 == 0) goto L_0x0578;
    L_0x056a:
        r2 = z;	 Catch:{ IOException -> 0x0576 }
        r3 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0576 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x0576 }
        r2 = 0;
        goto L_0x00ca;
    L_0x0576:
        r2 = move-exception;
        throw r2;
    L_0x0578:
        r4 = 0;
        r3 = r10.isAborted();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        if (r3 == 0) goto L_0x05a7;
    L_0x057f:
        r3 = z;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r3 = r3[r5];	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r3 = 0;
        if (r23 == 0) goto L_0x0598;
    L_0x058b:
        r6 = -1;
        r10 = r13.get();	 Catch:{ IOException -> 0x05a5 }
        r8 = r8 + r10;
        r6 = r6 * r8;
        r0 = r23;
        r0.a(r6);	 Catch:{ IOException -> 0x05a5 }
    L_0x0598:
        r0 = r18;
        r0.a(r2);
        r0 = r18;
        r0.a(r4);
        r2 = r3;
        goto L_0x00ca;
    L_0x05a5:
        r2 = move-exception;
        throw r2;
    L_0x05a7:
        r0 = r18;
        r3 = r0.n;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r0 = r18;
        r3 = r0.a(r3, r10);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        com.whatsapp.gdrive.fn.a(r10);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        com.whatsapp.gdrive.fn.a(r3);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r11.close();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5 = r3.getStatusLine();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5 = r5.getStatusCode();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r4 = r3.getEntity();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r5 != r3) goto L_0x0603;
    L_0x05ca:
        if (r4 != 0) goto L_0x05f4;
    L_0x05cc:
        r3 = z;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r3 = r3[r5];	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        com.whatsapp.util.Log.e(r3);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r3 = 0;
        if (r23 == 0) goto L_0x05e5;
    L_0x05d8:
        r6 = -1;
        r10 = r13.get();	 Catch:{ IOException -> 0x05f2 }
        r8 = r8 + r10;
        r6 = r6 * r8;
        r0 = r23;
        r0.a(r6);	 Catch:{ IOException -> 0x05f2 }
    L_0x05e5:
        r0 = r18;
        r0.a(r2);
        r0 = r18;
        r0.a(r4);
        r2 = r3;
        goto L_0x00ca;
    L_0x05f2:
        r2 = move-exception;
        throw r2;
    L_0x05f4:
        r3 = org.apache.http.util.EntityUtils.toString(r4);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r6 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0627 }
        r6.<init>(r3);	 Catch:{ JSONException -> 0x0627 }
        r3 = com.whatsapp.gdrive.fs.a(r6);	 Catch:{ JSONException -> 0x0627 }
        if (r15 == 0) goto L_0x0777;
    L_0x0603:
        r3 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r5 != r3) goto L_0x0663;
    L_0x0607:
        r18.e();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r3 = 0;
        if (r23 == 0) goto L_0x061a;
    L_0x060d:
        r6 = -1;
        r10 = r13.get();	 Catch:{ IOException -> 0x0661 }
        r8 = r8 + r10;
        r6 = r6 * r8;
        r0 = r23;
        r0.a(r6);	 Catch:{ IOException -> 0x0661 }
    L_0x061a:
        r0 = r18;
        r0.a(r2);
        r0 = r18;
        r0.a(r4);
        r2 = r3;
        goto L_0x00ca;
    L_0x0627:
        r5 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5.<init>();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r6 = z;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r7 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5 = r5.append(r6);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r3 = r5.append(r3);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        com.whatsapp.util.Log.e(r3);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r3 = 0;
        if (r23 == 0) goto L_0x0652;
    L_0x0645:
        r6 = -1;
        r10 = r13.get();	 Catch:{ IOException -> 0x065f }
        r8 = r8 + r10;
        r6 = r6 * r8;
        r0 = r23;
        r0.a(r6);	 Catch:{ IOException -> 0x065f }
    L_0x0652:
        r0 = r18;
        r0.a(r2);
        r0 = r18;
        r0.a(r4);
        r2 = r3;
        goto L_0x00ca;
    L_0x065f:
        r2 = move-exception;
        throw r2;
    L_0x0661:
        r2 = move-exception;
        throw r2;
    L_0x0663:
        r3 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r5 != r3) goto L_0x0732;
    L_0x0667:
        r0 = r18;
        r1 = r21;
        r0.h(r1);	 Catch:{ IOException -> 0x06cb, IllegalStateException -> 0x069e }
        if (r4 == 0) goto L_0x06f6;
    L_0x0670:
        r3 = org.apache.http.util.EntityUtils.toString(r4);	 Catch:{ IOException -> 0x06cd, IllegalStateException -> 0x069e }
    L_0x0674:
        r0 = r18;
        r5 = r0.c(r3);	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        if (r5 == 0) goto L_0x06f9;
    L_0x067c:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        r5.<init>();	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        r6 = z;	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        r7 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r6 = r6[r7];	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        r3 = r5.append(r3);	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        r3 = r3.toString();	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        r3 = new com.whatsapp.gdrive.e9;	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        r3.<init>();	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
        throw r3;	 Catch:{ IOException -> 0x069c, IllegalStateException -> 0x069e }
    L_0x069c:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
    L_0x069e:
        r3 = move-exception;
        r5 = r10.isAborted();	 Catch:{ all -> 0x0758 }
        if (r5 == 0) goto L_0x079e;
    L_0x06a5:
        r5 = z;	 Catch:{ all -> 0x0758 }
        r6 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r5 = r5[r6];	 Catch:{ all -> 0x0758 }
        com.whatsapp.util.Log.a(r5, r3);	 Catch:{ all -> 0x0758 }
        r3 = 0;
        if (r23 == 0) goto L_0x06be;
    L_0x06b1:
        r6 = -1;
        r10 = r13.get();	 Catch:{ IOException -> 0x079c }
        r8 = r8 + r10;
        r6 = r6 * r8;
        r0 = r23;
        r0.a(r6);	 Catch:{ IOException -> 0x079c }
    L_0x06be:
        r0 = r18;
        r0.a(r2);
        r0 = r18;
        r0.a(r4);
        r2 = r3;
        goto L_0x00ca;
    L_0x06cb:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x06cd, IllegalStateException -> 0x069e }
    L_0x06cd:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
    L_0x06cf:
        r3 = move-exception;
        r5 = z;	 Catch:{ all -> 0x0758 }
        r6 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x0758 }
        com.whatsapp.util.Log.b(r5, r3);	 Catch:{ all -> 0x0758 }
        r3 = 0;
        if (r23 == 0) goto L_0x06e9;
    L_0x06dc:
        r6 = -1;
        r10 = r13.get();	 Catch:{ IOException -> 0x079f }
        r8 = r8 + r10;
        r6 = r6 * r8;
        r0 = r23;
        r0.a(r6);	 Catch:{ IOException -> 0x079f }
    L_0x06e9:
        r0 = r18;
        r0.a(r2);
        r0 = r18;
        r0.a(r4);
        r2 = r3;
        goto L_0x00ca;
    L_0x06f6:
        r3 = 0;
        goto L_0x0674;
    L_0x06f9:
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5.<init>();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r6 = z;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r7 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5 = r5.append(r6);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r3 = r5.append(r3);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r3 = 0;
        if (r23 == 0) goto L_0x0723;
    L_0x0716:
        r6 = -1;
        r10 = r13.get();	 Catch:{ IOException -> 0x0730 }
        r8 = r8 + r10;
        r6 = r6 * r8;
        r0 = r23;
        r0.a(r6);	 Catch:{ IOException -> 0x0730 }
    L_0x0723:
        r0 = r18;
        r0.a(r2);
        r0 = r18;
        r0.a(r4);
        r2 = r3;
        goto L_0x00ca;
    L_0x0730:
        r2 = move-exception;
        throw r2;
    L_0x0732:
        if (r4 == 0) goto L_0x0775;
    L_0x0734:
        r3 = org.apache.http.util.EntityUtils.toString(r4);	 Catch:{ IOException -> 0x0773, IllegalStateException -> 0x069e }
    L_0x0738:
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5.<init>();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r6 = z;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r7 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5 = r5.append(r6);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5 = r5.append(r3);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5 = r5.toString();	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5 = new com.whatsapp.gdrive.e3;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        r5.<init>(r3);	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
        throw r5;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
    L_0x0758:
        r3 = move-exception;
        if (r23 == 0) goto L_0x0768;
    L_0x075b:
        r6 = -1;
        r10 = r13.get();	 Catch:{ IOException -> 0x07a1 }
        r8 = r8 + r10;
        r6 = r6 * r8;
        r0 = r23;
        r0.a(r6);	 Catch:{ IOException -> 0x07a1 }
    L_0x0768:
        r0 = r18;
        r0.a(r2);
        r0 = r18;
        r0.a(r4);
        throw r3;
    L_0x0773:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x069e, IOException -> 0x06cf }
    L_0x0775:
        r3 = 0;
        goto L_0x0738;
    L_0x0777:
        if (r23 == 0) goto L_0x0786;
    L_0x0779:
        r6 = -1;
        r10 = r13.get();	 Catch:{ IOException -> 0x079a }
        r8 = r8 + r10;
        r6 = r6 * r8;
        r0 = r23;
        r0.a(r6);	 Catch:{ IOException -> 0x079a }
    L_0x0786:
        r0 = r18;
        r0.a(r2);
        r0 = r18;
        r0.a(r4);
        r0 = r18;
        r1 = r21;
        r0.h(r1);
        r2 = r3;
        goto L_0x00ca;
    L_0x079a:
        r2 = move-exception;
        throw r2;
    L_0x079c:
        r2 = move-exception;
        throw r2;
    L_0x079e:
        throw r3;	 Catch:{ all -> 0x0758 }
    L_0x079f:
        r2 = move-exception;
        throw r2;
    L_0x07a1:
        r2 = move-exception;
        throw r2;
    L_0x07a3:
        r2 = move-exception;
        r6 = r3;
        goto L_0x011c;
    L_0x07a7:
        r2 = move-exception;
        r3 = r6;
        goto L_0x0109;
    L_0x07ab:
        r8 = r2;
        r2 = r5;
        goto L_0x01ea;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bc.a(java.lang.String, java.lang.String, java.lang.String, com.whatsapp.gdrive.bs, com.whatsapp.gdrive.er, java.lang.String):com.whatsapp.gdrive.fs");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
        r7 = this;
        r1 = com.whatsapp.gdrive.GoogleDriveService.c;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = r7.g();
        r0 = r0.getAll();
        r0 = r0.keySet();
        r3 = r0.iterator();
    L_0x0017:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0055;
    L_0x001d:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x0053;
    L_0x0025:
        r4 = z;	 Catch:{ SecurityException -> 0x0083 }
        r5 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x0083 }
        r4 = r0.startsWith(r4);	 Catch:{ SecurityException -> 0x0083 }
        if (r4 != 0) goto L_0x0050;
    L_0x0031:
        r4 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0085 }
        r4.<init>();	 Catch:{ SecurityException -> 0x0085 }
        r5 = z;	 Catch:{ SecurityException -> 0x0085 }
        r6 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r5 = r5[r6];	 Catch:{ SecurityException -> 0x0085 }
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x0085 }
        r5 = r7.b;	 Catch:{ SecurityException -> 0x0085 }
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x0085 }
        r4 = r4.toString();	 Catch:{ SecurityException -> 0x0085 }
        r4 = r0.startsWith(r4);	 Catch:{ SecurityException -> 0x0085 }
        if (r4 == 0) goto L_0x0053;
    L_0x0050:
        r2.add(r0);	 Catch:{ SecurityException -> 0x0085 }
    L_0x0053:
        if (r1 == 0) goto L_0x0017;
    L_0x0055:
        r0 = r7.g();
        r3 = r0.edit();
        r2 = r2.iterator();
    L_0x0061:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0072;
    L_0x0067:
        r0 = r2.next();
        r0 = (java.lang.String) r0;
        r3.remove(r0);
        if (r1 == 0) goto L_0x0061;
    L_0x0072:
        r0 = r3.commit();	 Catch:{ SecurityException -> 0x0087 }
        if (r0 != 0) goto L_0x0089;
    L_0x0078:
        r0 = z;	 Catch:{ SecurityException -> 0x0087 }
        r1 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r0 = r0[r1];	 Catch:{ SecurityException -> 0x0087 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ SecurityException -> 0x0087 }
        r0 = 0;
    L_0x0082:
        return r0;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = 1;
        goto L_0x0082;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bc.b():boolean");
    }

    static long a(bc bcVar, long j) {
        bcVar.g = j;
        return j;
    }

    private HttpResponse a(@NonNull DefaultHttpClient defaultHttpClient, @NonNull HttpRequestBase httpRequestBase) {
        ConnectTimeoutException e;
        httpRequestBase.setURI(URI.create(httpRequestBase.getURI().toString().replace(z[42], d())));
        httpRequestBase.setHeader(z[44], z[43]);
        try {
            return defaultHttpClient.execute(httpRequestBase);
        } catch (ConnectTimeoutException e2) {
            e = e2;
            try {
                if (httpRequestBase.getURI().getHost().startsWith("[")) {
                    this.g = System.currentTimeMillis();
                }
                throw e;
            } catch (ConnectTimeoutException e3) {
                throw e3;
            }
        } catch (SocketException e4) {
            e3 = e4;
            if (httpRequestBase.getURI().getHost().startsWith("[")) {
                this.g = System.currentTimeMillis();
            }
            throw e3;
        } catch (SocketTimeoutException e5) {
            e3 = e5;
            if (httpRequestBase.getURI().getHost().startsWith("[")) {
                this.g = System.currentTimeMillis();
            }
            throw e3;
        }
    }

    private String g(@NonNull String str) {
        return z[132] + this.b + "-" + str;
    }

    public boolean f() {
        try {
            return !this.l;
        } catch (SecurityException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(@android.support.annotation.NonNull java.io.File r20, @android.support.annotation.NonNull com.whatsapp.gdrive.fs r21, @android.support.annotation.Nullable com.whatsapp.gdrive.as r22) {
        /*
        r19 = this;
        r9 = com.whatsapp.gdrive.GoogleDriveService.c;
        r2 = r21.g();
        if (r2 != 0) goto L_0x0015;
    L_0x0008:
        r2 = z;	 Catch:{ IOException -> 0x0013 }
        r3 = 324; // 0x144 float:4.54E-43 double:1.6E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0013 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0013 }
        r2 = 0;
    L_0x0012:
        return r2;
    L_0x0013:
        r2 = move-exception;
        throw r2;
    L_0x0015:
        r12 = e(r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r12);
        r3 = z;
        r4 = 310; // 0x136 float:4.34E-43 double:1.53E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r20.getAbsolutePath();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r13 = r21.h();
        r6 = r21.b();
        if (r13 != 0) goto L_0x005c;
    L_0x004f:
        r2 = z;	 Catch:{ IOException -> 0x005a }
        r3 = 319; // 0x13f float:4.47E-43 double:1.576E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x005a }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x005a }
        r2 = 0;
        goto L_0x0012;
    L_0x005a:
        r2 = move-exception;
        throw r2;
    L_0x005c:
        r2 = 0;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x006f;
    L_0x0062:
        r2 = z;	 Catch:{ IOException -> 0x006d }
        r3 = 327; // 0x147 float:4.58E-43 double:1.616E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x006d }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x006d }
        r2 = 0;
        goto L_0x0012;
    L_0x006d:
        r2 = move-exception;
        throw r2;
    L_0x006f:
        r2 = r20.exists();	 Catch:{ IOException -> 0x00a4 }
        if (r2 == 0) goto L_0x00a8;
    L_0x0075:
        r2 = r20.isDirectory();	 Catch:{ IOException -> 0x00a4 }
        if (r2 == 0) goto L_0x00a8;
    L_0x007b:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00a6 }
        r2.<init>();	 Catch:{ IOException -> 0x00a6 }
        r3 = z;	 Catch:{ IOException -> 0x00a6 }
        r4 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00a6 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x00a6 }
        r0 = r20;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x00a6 }
        r3 = z;	 Catch:{ IOException -> 0x00a6 }
        r4 = 291; // 0x123 float:4.08E-43 double:1.44E-321;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00a6 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x00a6 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x00a6 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x00a6 }
        r2 = 0;
        goto L_0x0012;
    L_0x00a4:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x00a6 }
    L_0x00a6:
        r2 = move-exception;
        throw r2;
    L_0x00a8:
        r2 = r20.getParentFile();
        r3 = r2.exists();	 Catch:{ IOException -> 0x00d9 }
        if (r3 != 0) goto L_0x00dd;
    L_0x00b2:
        r3 = r2.mkdirs();	 Catch:{ IOException -> 0x00d9 }
        if (r3 != 0) goto L_0x00dd;
    L_0x00b8:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00db }
        r3.<init>();	 Catch:{ IOException -> 0x00db }
        r4 = z;	 Catch:{ IOException -> 0x00db }
        r5 = 317; // 0x13d float:4.44E-43 double:1.566E-321;
        r4 = r4[r5];	 Catch:{ IOException -> 0x00db }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x00db }
        r2 = r2.getAbsolutePath();	 Catch:{ IOException -> 0x00db }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x00db }
        r2 = r2.toString();	 Catch:{ IOException -> 0x00db }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x00db }
        r2 = 0;
        goto L_0x0012;
    L_0x00d9:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x00db }
    L_0x00db:
        r2 = move-exception;
        throw r2;
    L_0x00dd:
        r0 = r19;
        r4 = r0.a(r12);	 Catch:{ IOException -> 0x0205 }
        r14 = r19.a(r20);
        r2 = 0;
        r5 = r14.exists();	 Catch:{ IOException -> 0x0212 }
        if (r5 == 0) goto L_0x061e;
    L_0x00ef:
        r10 = r14.length();	 Catch:{ IOException -> 0x0212 }
        r16 = 0;
        r5 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1));
        if (r5 <= 0) goto L_0x061e;
    L_0x00f9:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0214 }
        r5.<init>();	 Catch:{ IOException -> 0x0214 }
        r8 = z;	 Catch:{ IOException -> 0x0214 }
        r10 = 330; // 0x14a float:4.62E-43 double:1.63E-321;
        r8 = r8[r10];	 Catch:{ IOException -> 0x0214 }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x0214 }
        r10 = r14.length();	 Catch:{ IOException -> 0x0214 }
        r5 = r5.append(r10);	 Catch:{ IOException -> 0x0214 }
        r8 = z;	 Catch:{ IOException -> 0x0214 }
        r10 = 295; // 0x127 float:4.13E-43 double:1.457E-321;
        r8 = r8[r10];	 Catch:{ IOException -> 0x0214 }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x0214 }
        r5 = r5.toString();	 Catch:{ IOException -> 0x0214 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IOException -> 0x0214 }
        r10 = r14.length();	 Catch:{ IOException -> 0x0214 }
        r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x01b3;
    L_0x0129:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0216 }
        r5.<init>();	 Catch:{ IOException -> 0x0216 }
        r8 = z;	 Catch:{ IOException -> 0x0216 }
        r10 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r8 = r8[r10];	 Catch:{ IOException -> 0x0216 }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x0216 }
        r5 = r5.append(r14);	 Catch:{ IOException -> 0x0216 }
        r8 = z;	 Catch:{ IOException -> 0x0216 }
        r10 = 325; // 0x145 float:4.55E-43 double:1.606E-321;
        r8 = r8[r10];	 Catch:{ IOException -> 0x0216 }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x0216 }
        r10 = r14.length();	 Catch:{ IOException -> 0x0216 }
        r5 = r5.append(r10);	 Catch:{ IOException -> 0x0216 }
        r8 = z;	 Catch:{ IOException -> 0x0216 }
        r10 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        r8 = r8[r10];	 Catch:{ IOException -> 0x0216 }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x0216 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0216 }
        r8 = z;	 Catch:{ IOException -> 0x0216 }
        r10 = 287; // 0x11f float:4.02E-43 double:1.42E-321;
        r8 = r8[r10];	 Catch:{ IOException -> 0x0216 }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x0216 }
        r5 = r5.toString();	 Catch:{ IOException -> 0x0216 }
        com.whatsapp.util.Log.e(r5);	 Catch:{ IOException -> 0x0216 }
        r5 = r14.delete();	 Catch:{ IOException -> 0x0216 }
        if (r5 != 0) goto L_0x0193;
    L_0x0173:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0218 }
        r5.<init>();	 Catch:{ IOException -> 0x0218 }
        r8 = z;	 Catch:{ IOException -> 0x0218 }
        r10 = 328; // 0x148 float:4.6E-43 double:1.62E-321;
        r8 = r8[r10];	 Catch:{ IOException -> 0x0218 }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x0218 }
        r8 = r14.getAbsolutePath();	 Catch:{ IOException -> 0x0218 }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x0218 }
        r5 = r5.toString();	 Catch:{ IOException -> 0x0218 }
        com.whatsapp.util.Log.e(r5);	 Catch:{ IOException -> 0x0218 }
        if (r9 == 0) goto L_0x061e;
    L_0x0193:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x021a }
        r5.<init>();	 Catch:{ IOException -> 0x021a }
        r8 = z;	 Catch:{ IOException -> 0x021a }
        r10 = 333; // 0x14d float:4.67E-43 double:1.645E-321;
        r8 = r8[r10];	 Catch:{ IOException -> 0x021a }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x021a }
        r8 = r14.getAbsolutePath();	 Catch:{ IOException -> 0x021a }
        r5 = r5.append(r8);	 Catch:{ IOException -> 0x021a }
        r5 = r5.toString();	 Catch:{ IOException -> 0x021a }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IOException -> 0x021a }
        if (r9 == 0) goto L_0x061e;
    L_0x01b3:
        r10 = r14.length();	 Catch:{ IOException -> 0x021c }
        r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r5 != 0) goto L_0x02db;
    L_0x01bb:
        r5 = com.whatsapp.gdrive.fn.a(r14);
        r6 = r13.equals(r5);	 Catch:{ IOException -> 0x021e }
        if (r6 == 0) goto L_0x024e;
    L_0x01c5:
        r0 = r20;
        r6 = r14.renameTo(r0);	 Catch:{ IOException -> 0x021e }
        if (r6 == 0) goto L_0x0222;
    L_0x01cd:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 305; // 0x131 float:4.27E-43 double:1.507E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r14);
        r3 = z;
        r4 = 314; // 0x13a float:4.4E-43 double:1.55E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r20;
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r14.length();
        if (r22 == 0) goto L_0x0202;
    L_0x01fd:
        r0 = r22;
        r0.a(r2);	 Catch:{ IOException -> 0x0220 }
    L_0x0202:
        r2 = 1;
        goto L_0x0012;
    L_0x0205:
        r2 = move-exception;
        r3 = z;
        r4 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        r2 = 0;
        goto L_0x0012;
    L_0x0212:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0214 }
    L_0x0214:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0216 }
    L_0x0216:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0218 }
    L_0x0218:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x021a }
    L_0x021a:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x021c }
    L_0x021c:
        r2 = move-exception;
        throw r2;
    L_0x021e:
        r2 = move-exception;
        throw r2;
    L_0x0220:
        r2 = move-exception;
        throw r2;
    L_0x0222:
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x031f }
        r6.<init>();	 Catch:{ IOException -> 0x031f }
        r7 = z;	 Catch:{ IOException -> 0x031f }
        r8 = 332; // 0x14c float:4.65E-43 double:1.64E-321;
        r7 = r7[r8];	 Catch:{ IOException -> 0x031f }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x031f }
        r6 = r6.append(r14);	 Catch:{ IOException -> 0x031f }
        r7 = z;	 Catch:{ IOException -> 0x031f }
        r8 = 288; // 0x120 float:4.04E-43 double:1.423E-321;
        r7 = r7[r8];	 Catch:{ IOException -> 0x031f }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x031f }
        r0 = r20;
        r6 = r6.append(r0);	 Catch:{ IOException -> 0x031f }
        r6 = r6.toString();	 Catch:{ IOException -> 0x031f }
        com.whatsapp.util.Log.e(r6);	 Catch:{ IOException -> 0x031f }
        if (r9 == 0) goto L_0x02d9;
    L_0x024e:
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x031f }
        r6.<init>();	 Catch:{ IOException -> 0x031f }
        r7 = z;	 Catch:{ IOException -> 0x031f }
        r8 = 331; // 0x14b float:4.64E-43 double:1.635E-321;
        r7 = r7[r8];	 Catch:{ IOException -> 0x031f }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x031f }
        r6 = r6.append(r14);	 Catch:{ IOException -> 0x031f }
        r7 = z;	 Catch:{ IOException -> 0x031f }
        r8 = 293; // 0x125 float:4.1E-43 double:1.45E-321;
        r7 = r7[r8];	 Catch:{ IOException -> 0x031f }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x031f }
        r7 = z;	 Catch:{ IOException -> 0x031f }
        r8 = 323; // 0x143 float:4.53E-43 double:1.596E-321;
        r7 = r7[r8];	 Catch:{ IOException -> 0x031f }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x031f }
        r5 = r6.append(r5);	 Catch:{ IOException -> 0x031f }
        r6 = z;	 Catch:{ IOException -> 0x031f }
        r7 = 298; // 0x12a float:4.18E-43 double:1.47E-321;
        r6 = r6[r7];	 Catch:{ IOException -> 0x031f }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x031f }
        r5 = r5.append(r13);	 Catch:{ IOException -> 0x031f }
        r6 = ")";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x031f }
        r5 = r5.toString();	 Catch:{ IOException -> 0x031f }
        com.whatsapp.util.Log.e(r5);	 Catch:{ IOException -> 0x031f }
        r5 = r14.delete();	 Catch:{ IOException -> 0x031f }
        if (r5 != 0) goto L_0x02bb;
    L_0x029b:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0321 }
        r5.<init>();	 Catch:{ IOException -> 0x0321 }
        r6 = z;	 Catch:{ IOException -> 0x0321 }
        r7 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0321 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0321 }
        r6 = r14.getAbsolutePath();	 Catch:{ IOException -> 0x0321 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0321 }
        r5 = r5.toString();	 Catch:{ IOException -> 0x0321 }
        com.whatsapp.util.Log.e(r5);	 Catch:{ IOException -> 0x0321 }
        if (r9 == 0) goto L_0x02d9;
    L_0x02bb:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0323 }
        r5.<init>();	 Catch:{ IOException -> 0x0323 }
        r6 = z;	 Catch:{ IOException -> 0x0323 }
        r7 = 292; // 0x124 float:4.09E-43 double:1.443E-321;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0323 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0323 }
        r6 = r14.getAbsolutePath();	 Catch:{ IOException -> 0x0323 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0323 }
        r5 = r5.toString();	 Catch:{ IOException -> 0x0323 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IOException -> 0x0323 }
    L_0x02d9:
        if (r9 == 0) goto L_0x061e;
    L_0x02db:
        r2 = z;
        r3 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        r2 = r2[r3];
        r3 = java.util.Locale.ENGLISH;
        r5 = z;
        r6 = 296; // 0x128 float:4.15E-43 double:1.46E-321;
        r5 = r5[r6];
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r10 = r14.length();
        r8 = java.lang.Long.valueOf(r10);
        r6[r7] = r8;
        r3 = java.lang.String.format(r3, r5, r6);
        r4.setRequestProperty(r2, r3);
        r2 = r14.length();
        if (r22 == 0) goto L_0x061e;
    L_0x0304:
        r0 = r22;
        r0.a(r2);	 Catch:{ IOException -> 0x0325 }
        r10 = r2;
    L_0x030a:
        r7 = new java.util.concurrent.atomic.AtomicLong;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r2 = 0;
        r7.<init>(r2);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        if (r22 == 0) goto L_0x034a;
    L_0x0313:
        r2 = r22.a();	 Catch:{ IOException -> 0x0327, UnknownHostException -> 0x0329 }
        if (r2 != 0) goto L_0x034a;
    L_0x0319:
        r2 = 0;
        b(r4);
        goto L_0x0012;
    L_0x031f:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0321 }
    L_0x0321:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0323 }
    L_0x0323:
        r2 = move-exception;
        throw r2;
    L_0x0325:
        r2 = move-exception;
        throw r2;
    L_0x0327:
        r2 = move-exception;
        throw r2;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
    L_0x0329:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x04af }
        r2.<init>();	 Catch:{ all -> 0x04af }
        r3 = z;	 Catch:{ all -> 0x04af }
        r5 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r3 = r3[r5];	 Catch:{ all -> 0x04af }
        r2 = r2.append(r3);	 Catch:{ all -> 0x04af }
        r2 = r2.append(r12);	 Catch:{ all -> 0x04af }
        r2 = r2.toString();	 Catch:{ all -> 0x04af }
        com.whatsapp.util.Log.i(r2);	 Catch:{ all -> 0x04af }
        r2 = 0;
        b(r4);
        goto L_0x0012;
    L_0x034a:
        r2 = r4.getResponseCode();	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 == r3) goto L_0x0356;
    L_0x0352:
        r3 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        if (r2 != r3) goto L_0x0525;
    L_0x0356:
        r8 = 0;
        r5 = new java.io.FileOutputStream;	 Catch:{ all -> 0x061a }
        r2 = 1;
        r5.<init>(r14, r2);	 Catch:{ all -> 0x061a }
        r2 = new com.whatsapp.gdrive.fi;	 Catch:{ all -> 0x061a }
        r3 = r19;
        r6 = r22;
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x061a }
        r3 = new java.io.BufferedInputStream;	 Catch:{ all -> 0x0453 }
        r5 = r4.getInputStream();	 Catch:{ all -> 0x0453 }
        r3.<init>(r5);	 Catch:{ all -> 0x0453 }
        r5 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r5 = new byte[r5];	 Catch:{ all -> 0x0453 }
    L_0x0373:
        r6 = 0;
        r8 = r5.length;	 Catch:{ all -> 0x0453 }
        r6 = r3.read(r5, r6, r8);	 Catch:{ all -> 0x0453 }
        if (r6 <= 0) goto L_0x0381;
    L_0x037b:
        r8 = 0;
        r2.write(r5, r8, r6);	 Catch:{ all -> 0x0453 }
        if (r9 == 0) goto L_0x0373;
    L_0x0381:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0453 }
        r3.<init>();	 Catch:{ all -> 0x0453 }
        r5 = z;	 Catch:{ all -> 0x0453 }
        r6 = 289; // 0x121 float:4.05E-43 double:1.43E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x0453 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x0453 }
        r5 = r14.getAbsolutePath();	 Catch:{ all -> 0x0453 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x0453 }
        r3 = r3.toString();	 Catch:{ all -> 0x0453 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ all -> 0x0453 }
        r3 = com.whatsapp.gdrive.fn.a(r14);	 Catch:{ all -> 0x0453 }
        r5 = r13.equals(r3);	 Catch:{ IOException -> 0x044d }
        if (r5 != 0) goto L_0x04b6;
    L_0x03a9:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x044d }
        r5.<init>();	 Catch:{ IOException -> 0x044d }
        r6 = z;	 Catch:{ IOException -> 0x044d }
        r8 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        r6 = r6[r8];	 Catch:{ IOException -> 0x044d }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x044d }
        r6 = r14.getAbsolutePath();	 Catch:{ IOException -> 0x044d }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x044d }
        r6 = z;	 Catch:{ IOException -> 0x044d }
        r8 = 311; // 0x137 float:4.36E-43 double:1.537E-321;
        r6 = r6[r8];	 Catch:{ IOException -> 0x044d }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x044d }
        r3 = r5.append(r3);	 Catch:{ IOException -> 0x044d }
        r5 = z;	 Catch:{ IOException -> 0x044d }
        r6 = 315; // 0x13b float:4.41E-43 double:1.556E-321;
        r5 = r5[r6];	 Catch:{ IOException -> 0x044d }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x044d }
        r3 = r3.append(r13);	 Catch:{ IOException -> 0x044d }
        r5 = z;	 Catch:{ IOException -> 0x044d }
        r6 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        r5 = r5[r6];	 Catch:{ IOException -> 0x044d }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x044d }
        r3 = r3.toString();	 Catch:{ IOException -> 0x044d }
        com.whatsapp.util.Log.e(r3);	 Catch:{ IOException -> 0x044d }
        r3 = r14.delete();	 Catch:{ IOException -> 0x044d }
        if (r3 != 0) goto L_0x0413;
    L_0x03f3:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x044f }
        r3.<init>();	 Catch:{ IOException -> 0x044f }
        r5 = z;	 Catch:{ IOException -> 0x044f }
        r6 = 329; // 0x149 float:4.61E-43 double:1.625E-321;
        r5 = r5[r6];	 Catch:{ IOException -> 0x044f }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x044f }
        r5 = r14.getAbsolutePath();	 Catch:{ IOException -> 0x044f }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x044f }
        r3 = r3.toString();	 Catch:{ IOException -> 0x044f }
        com.whatsapp.util.Log.e(r3);	 Catch:{ IOException -> 0x044f }
        if (r9 == 0) goto L_0x0431;
    L_0x0413:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0451 }
        r3.<init>();	 Catch:{ IOException -> 0x0451 }
        r5 = z;	 Catch:{ IOException -> 0x0451 }
        r6 = 321; // 0x141 float:4.5E-43 double:1.586E-321;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0451 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x0451 }
        r5 = r14.getAbsolutePath();	 Catch:{ IOException -> 0x0451 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x0451 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0451 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IOException -> 0x0451 }
    L_0x0431:
        r3 = 0;
        if (r22 == 0) goto L_0x0441;
    L_0x0434:
        r8 = -1;
        r6 = r7.get();	 Catch:{ IOException -> 0x04b4, UnknownHostException -> 0x0329 }
        r6 = r6 + r10;
        r6 = r6 * r8;
        r0 = r22;
        r0.a(r6);	 Catch:{ IOException -> 0x04b4, UnknownHostException -> 0x0329 }
    L_0x0441:
        com.whatsapp.util.ao.a(r2);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        b(r4);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        b(r4);
        r2 = r3;
        goto L_0x0012;
    L_0x044d:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x044f }
    L_0x044f:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0451 }
    L_0x0451:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x0453 }
    L_0x0453:
        r3 = move-exception;
        r18 = r3;
        r3 = r2;
        r2 = r18;
    L_0x0459:
        if (r22 == 0) goto L_0x0468;
    L_0x045b:
        r8 = -1;
        r6 = r7.get();	 Catch:{ IOException -> 0x0523, UnknownHostException -> 0x0329 }
        r6 = r6 + r10;
        r6 = r6 * r8;
        r0 = r22;
        r0.a(r6);	 Catch:{ IOException -> 0x0523, UnknownHostException -> 0x0329 }
    L_0x0468:
        com.whatsapp.util.ao.a(r3);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        b(r4);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        throw r2;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
    L_0x046f:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x04af }
        r3.<init>();	 Catch:{ all -> 0x04af }
        r5 = z;	 Catch:{ all -> 0x04af }
        r6 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x04af }
        r3 = r3.append(r5);	 Catch:{ all -> 0x04af }
        r0 = r20;
        r3 = r3.append(r0);	 Catch:{ all -> 0x04af }
        r3 = r3.toString();	 Catch:{ all -> 0x04af }
        com.whatsapp.util.Log.b(r3, r2);	 Catch:{ all -> 0x04af }
        r3 = r2.getMessage();	 Catch:{ all -> 0x04af }
        if (r3 == 0) goto L_0x05e2;
    L_0x0492:
        r5 = z;	 Catch:{ IOException -> 0x05e0 }
        r6 = 309; // 0x135 float:4.33E-43 double:1.527E-321;
        r5 = r5[r6];	 Catch:{ IOException -> 0x05e0 }
        r3 = r3.contains(r5);	 Catch:{ IOException -> 0x05e0 }
        if (r3 == 0) goto L_0x05e2;
    L_0x049e:
        r2 = z;	 Catch:{ IOException -> 0x04ad }
        r3 = 316; // 0x13c float:4.43E-43 double:1.56E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x04ad }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x04ad }
        r2 = new com.whatsapp.gdrive.eu;	 Catch:{ IOException -> 0x04ad }
        r2.<init>();	 Catch:{ IOException -> 0x04ad }
        throw r2;	 Catch:{ IOException -> 0x04ad }
    L_0x04ad:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x04af }
    L_0x04af:
        r2 = move-exception;
        b(r4);
        throw r2;
    L_0x04b4:
        r2 = move-exception;
        throw r2;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
    L_0x04b6:
        r0 = r20;
        r3 = r14.renameTo(r0);	 Catch:{ all -> 0x0453 }
        if (r3 != 0) goto L_0x0506;
    L_0x04be:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0453 }
        r3.<init>();	 Catch:{ all -> 0x0453 }
        r5 = z;	 Catch:{ all -> 0x0453 }
        r6 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x0453 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x0453 }
        r3 = r3.append(r14);	 Catch:{ all -> 0x0453 }
        r5 = z;	 Catch:{ all -> 0x0453 }
        r6 = 313; // 0x139 float:4.39E-43 double:1.546E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x0453 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x0453 }
        r0 = r20;
        r3 = r3.append(r0);	 Catch:{ all -> 0x0453 }
        r3 = r3.toString();	 Catch:{ all -> 0x0453 }
        com.whatsapp.util.Log.e(r3);	 Catch:{ all -> 0x0453 }
        r3 = 0;
        if (r22 == 0) goto L_0x04f8;
    L_0x04eb:
        r8 = -1;
        r6 = r7.get();	 Catch:{ IOException -> 0x0504, UnknownHostException -> 0x0329 }
        r6 = r6 + r10;
        r6 = r6 * r8;
        r0 = r22;
        r0.a(r6);	 Catch:{ IOException -> 0x0504, UnknownHostException -> 0x0329 }
    L_0x04f8:
        com.whatsapp.util.ao.a(r2);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        b(r4);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        b(r4);
        r2 = r3;
        goto L_0x0012;
    L_0x0504:
        r2 = move-exception;
        throw r2;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
    L_0x0506:
        if (r22 == 0) goto L_0x0515;
    L_0x0508:
        r8 = -1;
        r6 = r7.get();	 Catch:{ IOException -> 0x0521, UnknownHostException -> 0x0329 }
        r6 = r6 + r10;
        r6 = r6 * r8;
        r0 = r22;
        r0.a(r6);	 Catch:{ IOException -> 0x0521, UnknownHostException -> 0x0329 }
    L_0x0515:
        com.whatsapp.util.ao.a(r2);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        b(r4);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r2 = 1;
        b(r4);
        goto L_0x0012;
    L_0x0521:
        r2 = move-exception;
        throw r2;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
    L_0x0523:
        r2 = move-exception;
        throw r2;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
    L_0x0525:
        r3 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r2 != r3) goto L_0x0532;
    L_0x0529:
        r19.e();	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r2 = 0;
        b(r4);
        goto L_0x0012;
    L_0x0532:
        r3 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r2 != r3) goto L_0x058c;
    L_0x0536:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r3.<init>();	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r5 = z;	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r6 = 312; // 0x138 float:4.37E-43 double:1.54E-321;
        r5 = r5[r6];	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r3 = z;	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r5 = 294; // 0x126 float:4.12E-43 double:1.453E-321;
        r3 = r3[r5];	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r3 = r4.getResponseMessage();	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2.<init>();	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r3 = z;	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r5 = 326; // 0x146 float:4.57E-43 double:1.61E-321;
        r3 = r3[r5];	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r3 = r4.getErrorStream();	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r3 = com.whatsapp.gdrive.fn.a(r3);	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2 = new com.whatsapp.gdrive.ee;	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        r2.<init>();	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
        throw r2;	 Catch:{ IOException -> 0x058a, UnknownHostException -> 0x0329 }
    L_0x058a:
        r2 = move-exception;
        throw r2;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
    L_0x058c:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3.<init>();	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r5 = z;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r6 = 297; // 0x129 float:4.16E-43 double:1.467E-321;
        r5 = r5[r6];	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3 = r3.append(r5);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r2 = r3.append(r2);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3 = z;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r5 = 322; // 0x142 float:4.51E-43 double:1.59E-321;
        r3 = r3[r5];	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r2 = r2.append(r3);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3 = r4.getResponseMessage();	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r2 = r2.append(r3);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r2 = r2.toString();	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        com.whatsapp.util.Log.e(r2);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r2 = r4.getErrorStream();	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r2 = com.whatsapp.gdrive.fn.a(r2);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3 = new java.lang.StringBuilder;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3.<init>();	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r5 = z;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r6 = 318; // 0x13e float:4.46E-43 double:1.57E-321;
        r5 = r5[r6];	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3 = r3.append(r5);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3 = r3.append(r2);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3 = r3.toString();	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3 = new com.whatsapp.gdrive.e3;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        r3.<init>(r2);	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
        throw r3;	 Catch:{ UnknownHostException -> 0x0329, IOException -> 0x046f }
    L_0x05e0:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x04ad }
    L_0x05e2:
        r3 = r20.getAbsolutePath();	 Catch:{ IOException -> 0x0600 }
        r5 = com.whatsapp.App.a3;	 Catch:{ IOException -> 0x0600 }
        r5 = r5.getAbsolutePath();	 Catch:{ IOException -> 0x0600 }
        r3 = r3.startsWith(r5);	 Catch:{ IOException -> 0x0600 }
        if (r3 == 0) goto L_0x0602;
    L_0x05f2:
        r3 = com.whatsapp.App.aO();	 Catch:{ IOException -> 0x0600 }
        if (r3 != 0) goto L_0x0602;
    L_0x05f8:
        r3 = new com.whatsapp.gdrive.ez;	 Catch:{ IOException -> 0x05fe }
        r3.<init>(r2);	 Catch:{ IOException -> 0x05fe }
        throw r3;	 Catch:{ IOException -> 0x05fe }
    L_0x05fe:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x04af }
    L_0x0600:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05fe }
    L_0x0602:
        r0 = r19;
        r2 = r0.a(r4, r2);	 Catch:{ IOException -> 0x0618 }
        if (r2 == 0) goto L_0x0612;
    L_0x060a:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0618 }
        r0 = r19;
        r0.g = r2;	 Catch:{ IOException -> 0x0618 }
    L_0x0612:
        b(r4);
        r2 = 0;
        goto L_0x0012;
    L_0x0618:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x04af }
    L_0x061a:
        r2 = move-exception;
        r3 = r8;
        goto L_0x0459;
    L_0x061e:
        r10 = r2;
        goto L_0x030a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bc.a(java.io.File, com.whatsapp.gdrive.fs, com.whatsapp.gdrive.as):boolean");
    }

    public List a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull bs bsVar, boolean z) {
        boolean z2 = GoogleDriveService.c;
        String replace = str2.replace("'", "");
        String replace2 = str.replace("'", "");
        try {
            if (z[176].equals(str3) || z[177].equals(str3)) {
                if (z[172].equals(replace2)) {
                    replace2 = z[170];
                }
                try {
                    List<fs> a = a(z[175] + replace + z[178] + replace2 + z[173], z, str3, bsVar);
                    if (a != null) {
                        Collections.sort(a, h);
                        for (fs fsVar : a) {
                            if (z2) {
                                break;
                            }
                        }
                    }
                    return a;
                } catch (InterruptedException e) {
                    Log.i(z[171]);
                    return null;
                }
            }
            throw new IllegalArgumentException(z[174] + str3);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (InterruptedException e22) {
            throw e22;
        }
    }

    private boolean a(@Nullable HttpEntity httpEntity) {
        if (httpEntity != null) {
            try {
                httpEntity.consumeContent();
            } catch (Throwable e) {
                Log.b(z[39], e);
                return false;
            } catch (SecurityException e2) {
                throw e2;
            }
        }
        return true;
    }

    private HttpURLConnection a(@NonNull String str) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str.replace(z[8], d())).openConnection();
        httpsURLConnection.setSSLSocketFactory(this.d);
        httpsURLConnection.setRequestProperty(z[7], z[5]);
        httpsURLConnection.setHostnameVerifier(new df());
        httpsURLConnection.setRequestProperty(z[3], z[6] + this.c);
        httpsURLConnection.setRequestProperty(z[10], z[9]);
        httpsURLConnection.setRequestProperty(z[4], vn.a());
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        this.e.incrementAndGet();
        return httpsURLConnection;
    }

    private static String e(@NonNull String str) {
        return fn.a(String.format(z[279], new Object[]{str}), z[277], String.format(z[278], new Object[]{z[281], z[280]}));
    }

    public boolean b(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        String encode = URLEncoder.encode(str);
        String a = fn.a(fn.a(String.format(z[265], new Object[]{encode}), z[266], str3), z[269], TextUtils.join(",", fs.d()));
        HttpURLConnection httpURLConnection = null;
        try {
            String jSONObject = new JSONObject().put(z[263], str2).toString();
            try {
                httpURLConnection = a(a);
                httpURLConnection.setRequestMethod(z[267]);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty(z[268], z[270]);
                fn.a(httpURLConnection);
                httpURLConnection.getOutputStream().write(jSONObject.getBytes());
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                fn.b(httpURLConnection);
                if (responseCode == 200) {
                    Log.i(z[271] + fn.a(httpURLConnection.getInputStream()));
                    b(httpURLConnection);
                    return true;
                }
                if (responseCode == 401) {
                    e();
                    if (!GoogleDriveService.c) {
                        b(httpURLConnection);
                        return false;
                    }
                }
                String a2 = fn.a(httpURLConnection.getErrorStream());
                Log.e(z[272] + responseCode + " " + a2);
                throw new e3(a2);
            } catch (JSONException e) {
                throw e;
            } catch (Throwable e2) {
                Log.b(z[264], e2);
                b(httpURLConnection);
                return false;
            } catch (Throwable th) {
                b(httpURLConnection);
            }
        } catch (Throwable e22) {
            Log.b(z[262], e22);
            return false;
        }
    }

    public List a(@NonNull String[] strArr, @NonNull bs bsVar) {
        boolean z = GoogleDriveService.c;
        Log.i(z[141] + TextUtils.join(",", strArr));
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        while (i < strArr.length) {
            try {
                if (z[137].equals(strArr[i])) {
                    strArr[i] = z[136];
                }
                strArr2[i] = String.format(z[138], new Object[]{strArr[i].replace("'", "")});
                i++;
                if (z) {
                    break;
                }
            } catch (InterruptedException e) {
                throw e;
            }
        }
        try {
            return a(TextUtils.join(z[133], strArr2), false, String.format(z[139], new Object[]{z[140], z[135]}), bsVar);
        } catch (InterruptedException e2) {
            Log.i(z[134]);
            return null;
        }
    }

    public int c() {
        return this.i.a() + this.e.get();
    }

    private BasicHttpResponse[] a(@NonNull String str, @NonNull String str2, int i) {
        Throwable e;
        boolean z = GoogleDriveService.c;
        BasicHttpResponse[] basicHttpResponseArr = new BasicHttpResponse[i];
        String[] split = str.split(z[246] + str2);
        try {
            if (split.length != i + 2) {
                Log.i(z[244] + i + z[247] + (split.length - 2));
                return null;
            }
            LineParser basicLineParser = new BasicLineParser(HttpVersion.HTTP_1_1);
            HttpResponseFactory defaultHttpResponseFactory = new DefaultHttpResponseFactory();
            HttpParams basicHttpParams = new BasicHttpParams();
            int i2 = 0;
            loop0:
            while (i2 < basicHttpResponseArr.length) {
                int i3;
                split[i2 + 1] = split[i2 + 1].substring(split[i2 + 1].indexOf(z[248]) + 2);
                Closeable byteArrayInputStream = new ByteArrayInputStream(split[i2 + 1].getBytes());
                try {
                    basicHttpResponseArr[i2] = (BasicHttpResponse) new DefaultResponseParser(new fw(this, byteArrayInputStream, basicHttpParams), basicLineParser, defaultHttpResponseFactory, basicHttpParams).parse();
                    split[i2 + 1] = split[i2 + 1].substring(split[i2 + 1].indexOf(z[249]) + 2);
                    if (split[i2 + 1].length() > 0) {
                        basicHttpResponseArr[i2].setEntity(new StringEntity(split[i2 + 1], z[250]));
                    }
                    ao.a(byteArrayInputStream);
                } catch (HttpException e2) {
                    e = e2;
                    try {
                        Log.b(z[245], e);
                        basicHttpResponseArr[i2] = null;
                        i3 = i2 + 1;
                        if (z) {
                            break loop0;
                            return basicHttpResponseArr;
                        }
                        i2 = i3;
                    } finally {
                        ao.a(byteArrayInputStream);
                    }
                } catch (IOException e3) {
                    e = e3;
                    Log.b(z[245], e);
                    basicHttpResponseArr[i2] = null;
                    i3 = i2 + 1;
                    if (z) {
                        break loop0;
                        return basicHttpResponseArr;
                    }
                    i2 = i3;
                } catch (ParseException e4) {
                    e = e4;
                    Log.b(z[245], e);
                    basicHttpResponseArr[i2] = null;
                    i3 = i2 + 1;
                    if (z) {
                        i2 = i3;
                    } else {
                        break loop0;
                        return basicHttpResponseArr;
                    }
                }
                i3 = i2 + 1;
                if (z) {
                    break loop0;
                }
                i2 = i3;
            }
            return basicHttpResponseArr;
        } catch (HttpException e5) {
            throw e5;
        }
    }

    static HttpURLConnection a(bc bcVar, String str) {
        return bcVar.a(str);
    }

    public fs c(@NonNull String str, @NonNull String str2) {
        IOException e;
        Throwable th;
        String encode = URLEncoder.encode(str);
        String a = fn.a(fn.a(String.format(z[260], new Object[]{encode}), z[252], str2), z[259], TextUtils.join(",", fs.d()));
        Log.i(z[256] + a);
        HttpURLConnection a2;
        try {
            a2 = a(a);
            try {
                int responseCode = a2.getResponseCode();
                if (responseCode == 401) {
                    Log.i(z[254]);
                    e();
                    if (a2 == null) {
                        return null;
                    }
                    try {
                        a2.disconnect();
                        return null;
                    } catch (IOException e2) {
                        throw e2;
                    }
                } else if (responseCode == 404) {
                    Log.e(z[253] + encode + z[257]);
                    Log.e(z[258] + fn.a(a2.getErrorStream()));
                    throw new ee();
                } else if (responseCode == 200) {
                    fh fhVar = new fh(new InputStreamReader(a2.getInputStream()));
                    fhVar.l();
                    fs a3 = fs.a(fhVar);
                    fhVar.k();
                    if (a2 != null) {
                        try {
                            a2.disconnect();
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                    return a3;
                } else {
                    Log.e(z[255] + responseCode);
                    fn.b(a2);
                    encode = fn.a(a2.getErrorStream());
                    Log.e(z[251] + encode);
                    throw new e3(encode);
                }
            } catch (IOException e3) {
                throw e3;
            } catch (IOException e4) {
                e3 = e4;
            }
        } catch (IOException e5) {
            e3 = e5;
            a2 = null;
            try {
                Log.b(z[261], (Throwable) e3);
                if (a(a2, e3)) {
                    this.g = System.currentTimeMillis();
                }
                if (a2 == null) {
                    return null;
                }
                try {
                    a2.disconnect();
                    return null;
                } catch (IOException e222) {
                    throw e222;
                }
            } catch (IOException e2222) {
                throw e2222;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            a2 = null;
            th = th3;
            if (a2 != null) {
                try {
                    a2.disconnect();
                } catch (IOException e22222) {
                    throw e22222;
                }
            }
            throw th;
        }
    }

    public List a(@NonNull String str, @NonNull bs bsVar) {
        Log.i(z[54] + str);
        return a(new String[]{str}, bsVar);
    }

    private List a(@NonNull String str, boolean z, @NonNull String str2, @NonNull bs bsVar) {
        String format;
        String str3;
        int i;
        String str4;
        int i2;
        Uri build;
        List list;
        boolean z2 = GoogleDriveService.c;
        List arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer("");
        if (z) {
            format = String.format(z[158], new Object[]{z[153], TextUtils.join(",", fs.d()), fs.a(), z[148]});
            if (!z2) {
                str3 = format;
                i = 0;
                str4 = str3;
                while (true) {
                    StringBuilder append = new StringBuilder().append(z[150]);
                    i2 = i + 1;
                    Log.i(append.append(i).append(z[159]).append(str).append(z[155]).append(stringBuffer).append(z[151]).append(str2).append(z[160]).append(z).append(z[156]).append(bsVar).toString());
                    build = Uri.parse(z[161]).buildUpon().appendQueryParameter(z[157], str2).appendQueryParameter(z[147], String.valueOf(1000)).appendQueryParameter(z[162], str4).appendQueryParameter("q", str).build();
                    if (stringBuffer.length() > 0) {
                        build = build.buildUpon().appendQueryParameter(z[154], stringBuffer.toString()).build();
                    }
                    format = build.toString();
                    try {
                        Log.i(z[145] + format);
                        if (f()) {
                            break;
                        }
                        list = (List) by.a(bsVar, new v(this, format, bsVar, stringBuffer), z[146] + str + z[144] + stringBuffer);
                        if (list == null) {
                            break;
                        }
                        try {
                            arrayList.addAll(list);
                            Log.i(String.format(Locale.ENGLISH, z[149], new Object[]{Integer.valueOf(list.size()), Integer.valueOf(arrayList.size())}));
                            if (z2) {
                                break;
                            } else if (stringBuffer.length() <= 0) {
                                return arrayList;
                            } else {
                                i = i2;
                            }
                        } catch (SecurityException e) {
                            throw e;
                        }
                    } catch (SecurityException e2) {
                        throw e2;
                    }
                }
                throw new InterruptedException(z[143]);
            }
        }
        str3 = String.format(z[142], new Object[]{z[152], TextUtils.join(",", fs.d()), z[163]});
        i = 0;
        str4 = str3;
        while (true) {
            StringBuilder append2 = new StringBuilder().append(z[150]);
            i2 = i + 1;
            Log.i(append2.append(i).append(z[159]).append(str).append(z[155]).append(stringBuffer).append(z[151]).append(str2).append(z[160]).append(z).append(z[156]).append(bsVar).toString());
            build = Uri.parse(z[161]).buildUpon().appendQueryParameter(z[157], str2).appendQueryParameter(z[147], String.valueOf(1000)).appendQueryParameter(z[162], str4).appendQueryParameter("q", str).build();
            if (stringBuffer.length() > 0) {
                build = build.buildUpon().appendQueryParameter(z[154], stringBuffer.toString()).build();
            }
            format = build.toString();
            Log.i(z[145] + format);
            if (f()) {
                break;
                throw new InterruptedException(z[143]);
            }
            list = (List) by.a(bsVar, new v(this, format, bsVar, stringBuffer), z[146] + str + z[144] + stringBuffer);
            if (list == null) {
                arrayList.addAll(list);
                Log.i(String.format(Locale.ENGLISH, z[149], new Object[]{Integer.valueOf(list.size()), Integer.valueOf(arrayList.size())}));
                if (z2) {
                    break;
                } else if (stringBuffer.length() <= 0) {
                    return arrayList;
                } else {
                    i = i2;
                }
            } else {
                break;
            }
            return null;
        }
    }

    private boolean c(@Nullable String str) {
        boolean z = GoogleDriveService.c;
        if (str == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(z[51])) {
                return false;
            }
            try {
                if (jSONObject.getJSONObject(z[49]).optInt(z[52], -1) != 403) {
                    return false;
                }
                JSONArray jSONArray = jSONObject.getJSONObject(z[46]).getJSONArray(z[47]);
                int i = 0;
                boolean z2 = false;
                while (i < jSONArray.length()) {
                    if (z[50].equals(jSONArray.getJSONObject(i).optString(z[48]))) {
                        z2 = true;
                        if (!z) {
                            return true;
                        }
                    }
                    i++;
                    if (z) {
                        return z2;
                    }
                }
                return z2;
            } catch (SecurityException e) {
                throw e;
            }
        } catch (Throwable e2) {
            Log.b(z[45], e2);
            return false;
        }
    }

    private boolean b(@NonNull String str, @NonNull String str2) {
        Editor edit = g().edit();
        try {
            edit.putString(g(str), str2);
            if (edit.commit()) {
                return true;
            }
            Log.w(z[335]);
            return false;
        } catch (SecurityException e) {
            throw e;
        }
    }

    static void a(HttpURLConnection httpURLConnection) {
        b(httpURLConnection);
    }

    static boolean a(bc bcVar, HttpURLConnection httpURLConnection, IOException iOException) {
        return bcVar.a(httpURLConnection, iOException);
    }

    public List a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull bs bsVar) {
        return a(str, str2, str3, bsVar, false);
    }

    private BasicHttpResponse[] a(@NonNull HttpRequestBase[] httpRequestBaseArr) {
        boolean z = GoogleDriveService.c;
        try {
            if (httpRequestBaseArr.length == 0) {
                return null;
            }
            try {
                if (httpRequestBaseArr.length > 50) {
                    throw new IllegalArgumentException(z[arj.Theme_editTextStyle] + httpRequestBaseArr.length + z[83] + 50 + z[113]);
                }
                int i;
                HttpRequestBase httpPost = new HttpPost(fn.a(z[96], z[arj.Theme_buttonStyleSmall], String.format(z[89], new Object[]{z[arj.Theme_spinnerStyle], z[91]})));
                httpPost.setHeader(z[97], z[100] + m + "\"");
                StringBuilder stringBuilder = new StringBuilder(z[arj.Theme_seekBarStyle] + m + z[84]);
                int length = httpRequestBaseArr.length;
                int i2 = 0;
                while (i2 < length) {
                    HttpRequestBase httpRequestBase = httpRequestBaseArr[i2];
                    stringBuilder.append(z[90]);
                    stringBuilder.append(z[87]);
                    stringBuilder.append(httpRequestBase.getRequestLine()).append(z[99]);
                    Header[] allHeaders = httpRequestBase.getAllHeaders();
                    int length2 = allHeaders.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        Header header = allHeaders[i3];
                        stringBuilder.append(String.format(z[92], new Object[]{header.getName(), header.getValue()}));
                        i3++;
                        if (z) {
                            break;
                        }
                    }
                    if (httpRequestBase instanceof HttpEntityEnclosingRequestBase) {
                        stringBuilder.append(z[85]);
                        try {
                            stringBuilder.append(EntityUtils.toString(((HttpEntityEnclosingRequestBase) httpRequestBase).getEntity()));
                        } catch (Throwable e) {
                            Log.b(z[arj.Theme_checkedTextViewStyle], e);
                            return null;
                        }
                    }
                    stringBuilder.append(String.format(z[112], new Object[]{m}));
                    i = i2 + 1;
                    if (z) {
                        break;
                    }
                    i2 = i;
                }
                stringBuilder.append(z[arj.Theme_switchStyle]);
                try {
                    httpPost.setEntity(new StringEntity(stringBuilder.toString(), z[110]));
                } catch (Throwable e2) {
                    Log.b(z[98], e2);
                }
                httpPost.setHeader(z[86], z[93] + this.c);
                HttpEntity httpEntity = null;
                try {
                    String entityUtils;
                    HttpResponse a = a(this.n, httpPost);
                    httpEntity = a.getEntity();
                    if (httpEntity != null) {
                        entityUtils = EntityUtils.toString(httpEntity);
                    } else {
                        entityUtils = null;
                    }
                    i = a.getStatusLine().getStatusCode();
                    if (i == 200) {
                        String str = null;
                        Header firstHeader = a.getFirstHeader(z[111]);
                        if (firstHeader.getElements() != null && firstHeader.getElements().length > 0) {
                            HeaderElement headerElement = firstHeader.getElements()[0];
                            if (headerElement != null) {
                                if (headerElement.getParameterByName(z[94]) != null) {
                                    str = headerElement.getParameterByName(z[arj.Theme_radioButtonStyle]).getValue();
                                }
                            }
                        }
                        if (str == null) {
                            Log.e(z[88]);
                            fn.a(a);
                            a(httpEntity);
                            return null;
                        } else if (entityUtils == null) {
                            Log.e(z[95]);
                            fn.a(a);
                            a(httpEntity);
                            return null;
                        } else {
                            BasicHttpResponse[] a2 = a(entityUtils, str, httpRequestBaseArr.length);
                            a(httpEntity);
                            return a2;
                        }
                    }
                    if (i == 401) {
                        e();
                        if (!z) {
                            a(httpEntity);
                            return null;
                        }
                    }
                    Log.e(z[arj.Theme_checkboxStyle] + i + " " + entityUtils);
                    throw new e3(entityUtils);
                } catch (IOException e3) {
                    throw e3;
                } catch (IOException e32) {
                    throw e32;
                } catch (IOException e322) {
                    throw e322;
                } catch (IOException e3222) {
                    throw e3222;
                } catch (IOException e32222) {
                    throw e32222;
                } catch (Throwable e22) {
                    try {
                        Log.b(z[arj.Theme_ratingBarStyle], e22);
                    } finally {
                        a(httpEntity);
                    }
                }
            } catch (IOException e322222) {
                throw e322222;
            }
        } catch (IOException e3222222) {
            throw e3222222;
        }
    }

    public boolean b(@NonNull String str) {
        String encode = URLEncoder.encode(str);
        Object[] objArr = new Object[]{encode};
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = a(String.format(z[285], objArr));
            httpURLConnection.setRequestMethod(z[283]);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 204) {
                b(httpURLConnection);
                return true;
            }
            if (responseCode == 401) {
                try {
                    e();
                    if (!GoogleDriveService.c) {
                        b(httpURLConnection);
                        return false;
                    }
                } catch (IOException e) {
                    throw e;
                } catch (IOException e2) {
                    throw e2;
                }
            }
            String a;
            if (responseCode == 404) {
                a = fn.a(httpURLConnection.getErrorStream());
                Log.i(z[282] + a);
                throw new ee(a);
            }
            a = fn.a(httpURLConnection.getErrorStream());
            Log.e(z[286] + responseCode + " " + a);
            throw new e3(a);
        } catch (IOException e22) {
            try {
                Log.b(z[284], (Throwable) e22);
                if (a(httpURLConnection, e22)) {
                    this.g = System.currentTimeMillis();
                }
                b(httpURLConnection);
                return false;
            } catch (IOException e222) {
                throw e222;
            } catch (Throwable th) {
                b(httpURLConnection);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(@android.support.annotation.NonNull java.util.List r10) {
        /*
        r9 = this;
        r0 = 0;
        r7 = 50;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = r9.f();	 Catch:{ SecurityException -> 0x0015 }
        if (r1 == 0) goto L_0x0017;
    L_0x000b:
        r1 = z;	 Catch:{ SecurityException -> 0x0015 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x0015 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ SecurityException -> 0x0015 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r1 = r10.size();
        r3 = r1 / 50;
        r1 = 1;
        r8 = r0;
        r0 = r1;
        r1 = r8;
    L_0x0021:
        if (r1 >= r3) goto L_0x00f8;
    L_0x0023:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 12;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r1 + 1;
        r0 = r0.append(r4);
        r4 = "/";
        r0 = r0.append(r4);
        r0 = r0.append(r3);
        r4 = z;
        r5 = 21;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.append(r7);
        r4 = z;
        r5 = 18;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r1 * 50;
        r4 = r1 + 1;
        r4 = r4 * 50;
        r0 = r9.a(r10, r0, r4);
        if (r0 == 0) goto L_0x00b1;
    L_0x006e:
        r4 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x012e }
        r4.<init>();	 Catch:{ SecurityException -> 0x012e }
        r5 = z;	 Catch:{ SecurityException -> 0x012e }
        r6 = 13;
        r5 = r5[r6];	 Catch:{ SecurityException -> 0x012e }
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x012e }
        r5 = r1 + 1;
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x012e }
        r5 = "/";
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x012e }
        r4 = r4.append(r3);	 Catch:{ SecurityException -> 0x012e }
        r5 = z;	 Catch:{ SecurityException -> 0x012e }
        r6 = 17;
        r5 = r5[r6];	 Catch:{ SecurityException -> 0x012e }
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x012e }
        r5 = 50;
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x012e }
        r5 = z;	 Catch:{ SecurityException -> 0x012e }
        r6 = 14;
        r5 = r5[r6];	 Catch:{ SecurityException -> 0x012e }
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x012e }
        r4 = r4.toString();	 Catch:{ SecurityException -> 0x012e }
        com.whatsapp.util.Log.i(r4);	 Catch:{ SecurityException -> 0x012e }
        if (r2 == 0) goto L_0x00f4;
    L_0x00b1:
        r4 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0130 }
        r4.<init>();	 Catch:{ SecurityException -> 0x0130 }
        r5 = z;	 Catch:{ SecurityException -> 0x0130 }
        r6 = 19;
        r5 = r5[r6];	 Catch:{ SecurityException -> 0x0130 }
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x0130 }
        r5 = r1 + 1;
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x0130 }
        r5 = "/";
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x0130 }
        r4 = r4.append(r3);	 Catch:{ SecurityException -> 0x0130 }
        r5 = z;	 Catch:{ SecurityException -> 0x0130 }
        r6 = 15;
        r5 = r5[r6];	 Catch:{ SecurityException -> 0x0130 }
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x0130 }
        r5 = 50;
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x0130 }
        r5 = z;	 Catch:{ SecurityException -> 0x0130 }
        r6 = 20;
        r5 = r5[r6];	 Catch:{ SecurityException -> 0x0130 }
        r4 = r4.append(r5);	 Catch:{ SecurityException -> 0x0130 }
        r4 = r4.toString();	 Catch:{ SecurityException -> 0x0130 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ SecurityException -> 0x0130 }
        if (r2 == 0) goto L_0x00f8;
    L_0x00f4:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0021;
    L_0x00f8:
        r1 = r10.size();
        r1 = r1 % 50;
        if (r1 == 0) goto L_0x0014;
    L_0x0100:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r4 = 16;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r10.size();
        r4 = r3 * 50;
        r2 = r2 - r4;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r3 * 50;
        r2 = r10.size();
        r1 = r9.a(r10, r1, r2);
        r0 = r0 & r1;
        goto L_0x0014;
    L_0x012e:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0130 }
    L_0x0130:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bc.a(java.util.List):boolean");
    }

    private SharedPreferences g() {
        try {
            if (this.a == null) {
                this.a = App.z().getSharedPreferences(z[22], 0);
            }
            return this.a;
        } catch (SecurityException e) {
            throw e;
        }
    }

    public boolean a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        String format = String.format(z[117], new Object[]{URLEncoder.encode(str)});
        try {
            String jSONObject = new JSONObject().put(z[126], z[128]).put(z[122], str2).put(z[115], str3).put(z[119], z[116]).toString();
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = a(format);
                httpURLConnection.setRequestProperty(z[118], z[123]);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.getOutputStream().write(jSONObject.getBytes());
                httpURLConnection.getOutputStream().close();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    Log.i(z[124]);
                    b(httpURLConnection);
                    return true;
                } else if (responseCode == 401) {
                    Log.i(z[114]);
                    e();
                    b(httpURLConnection);
                    return false;
                } else if (responseCode == 404) {
                    Log.e(z[125]);
                    throw new ee();
                } else if (responseCode == 403) {
                    String a = fn.a(httpURLConnection.getErrorStream());
                    if (c(a)) {
                        throw new e9();
                    }
                    Log.e(z[120] + a);
                    b(httpURLConnection);
                    return false;
                } else {
                    throw new e3(fn.a(httpURLConnection.getErrorStream()));
                }
            } catch (JSONException e) {
                throw e;
            } catch (JSONException e2) {
                throw e2;
            } catch (IOException e3) {
                try {
                    Log.b(z[127], (Throwable) e3);
                    if (a(httpURLConnection, e3)) {
                        this.g = System.currentTimeMillis();
                    }
                    b(httpURLConnection);
                    return false;
                } catch (JSONException e22) {
                    throw e22;
                } catch (Throwable th) {
                    b(httpURLConnection);
                }
            }
        } catch (Throwable e4) {
            Log.b(z[121], e4);
            return false;
        }
    }

    public void a() {
        this.i.b();
        this.e.set(0);
    }

    @TargetApi(8)
    public bc(@NonNull String str, @NonNull Context context) {
        boolean z = GoogleDriveService.c;
        this.f = new HashSet();
        this.e = new AtomicInteger(0);
        this.l = true;
        this.b = str;
        this.j = context;
        HttpParams basicHttpParams = new BasicHttpParams();
        basicHttpParams.setParameter(z[1], HttpVersion.HTTP_1_1);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new dj(this));
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, true);
        HttpProtocolParams.setUserAgent(basicHttpParams, vn.a());
        SchemeRegistry a = mk.a(false);
        this.n = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, a), basicHttpParams);
        this.n.setRoutePlanner(new DefaultHttpRoutePlanner(a));
        this.n.addResponseInterceptor(new ar(3));
        this.i = new d2(3);
        this.n.addRequestInterceptor(this.i);
        try {
            this.d = new f((SSLSocketFactory) SSLSocketFactory.getDefault(), 3, new c1(this));
            System.setProperty(z[2], z[0]);
            if (WAAppCompatActivity.c != 0) {
                GoogleDriveService.c = !z;
            }
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public boolean d(@NonNull String str) {
        try {
            Log.i(z[37] + fn.a(str));
            if (this.c != null) {
                GoogleAuthUtil.clearToken(this.j, this.c);
            }
            this.c = GoogleAuthUtil.getToken(this.j, str, z[28], null);
            Log.i(z[23]);
            return true;
        } catch (GooglePlayServicesAvailabilityException e) {
            throw e;
        } catch (Throwable e2) {
            try {
                if (z[34].equals(e2.getMessage())) {
                    Log.a(z[36], e2);
                    return false;
                }
                Log.i(z[26] + fn.a(str) + z[25]);
                throw new ei(e2);
            } catch (GooglePlayServicesAvailabilityException e3) {
                throw e3;
            }
        } catch (Throwable e22) {
            Log.b(z[31], e22);
            this.c = null;
            return false;
        } catch (Throwable e222) {
            try {
                Log.b(z[32], e222);
                if (z[24].equals(e222.getMessage())) {
                    throw new ea(e222);
                }
                try {
                    if (z[29].equals(e222.getMessage())) {
                        return false;
                    }
                    this.c = null;
                    throw new ei(e222);
                } catch (GooglePlayServicesAvailabilityException e32) {
                    throw e32;
                }
            } catch (GooglePlayServicesAvailabilityException e322) {
                throw e322;
            }
        } catch (Throwable e4) {
            Log.b(z[33], e4);
            this.c = null;
            throw new ei(e4);
        } catch (Throwable e42) {
            Log.e(z[27] + fn.a(str));
            Log.b(z[30], e42);
            this.c = null;
            throw new ei(e42);
        } catch (Throwable e422) {
            Log.e(z[38]);
            Log.b(z[35], e422);
            this.c = null;
            throw new ei(e422);
        }
    }

    private boolean e() {
        return d(this.b);
    }

    public List a(@NonNull List list, @NonNull String str, @NonNull bs bsVar, boolean z) {
        boolean z2 = GoogleDriveService.c;
        try {
            if (z[242].equals(str) || z[243].equals(str)) {
                String[] strArr = new String[list.size()];
                int i = 0;
                while (i < list.size()) {
                    strArr[i] = String.format(z[238], new Object[]{((String) list.get(i)).replace("'", "")});
                    int i2 = i + 1;
                    if (z2) {
                        break;
                    }
                    i = i2;
                }
                try {
                    List<fs> a = a(TextUtils.join(z[239], strArr), z, str, bsVar);
                    if (a != null) {
                        Collections.sort(a, h);
                        for (fs fsVar : a) {
                            if (z2) {
                                break;
                            }
                        }
                    }
                    return a;
                } catch (InterruptedException e) {
                    Log.i(z[241]);
                    return null;
                }
            }
            throw new IllegalArgumentException(z[240] + str);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (InterruptedException e22) {
            throw e22;
        }
    }

    private boolean h(@NonNull String str) {
        Editor edit = g().edit();
        try {
            edit.remove(g(str));
            if (edit.commit()) {
                return true;
            }
            Log.w(z[55]);
            return false;
        } catch (SecurityException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(@android.support.annotation.Nullable java.net.HttpURLConnection r3, @android.support.annotation.NonNull java.io.IOException r4) {
        /*
        r2 = this;
        r0 = r4 instanceof java.net.SocketException;	 Catch:{ SecurityException -> 0x001d }
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r4 instanceof java.net.SocketTimeoutException;	 Catch:{ SecurityException -> 0x001f }
        if (r0 == 0) goto L_0x0025;
    L_0x0008:
        if (r3 == 0) goto L_0x0025;
    L_0x000a:
        r0 = r3.getURL();	 Catch:{ SecurityException -> 0x0023 }
        r0 = r0.getHost();	 Catch:{ SecurityException -> 0x0023 }
        r1 = ":";
        r0 = r0.contains(r1);	 Catch:{ SecurityException -> 0x0023 }
        if (r0 == 0) goto L_0x0025;
    L_0x001b:
        r0 = 1;
    L_0x001c:
        return r0;
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r0 = 0;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bc.a(java.net.HttpURLConnection, java.io.IOException):boolean");
    }

    private String f(@NonNull String str) {
        return g().getString(g(str), null);
    }

    private File a(@NonNull File file) {
        return new File(file.getParentFile(), file.getName() + z[53]);
    }

    public void a(boolean z) {
        try {
            if (this.l != z) {
                String str;
                if (z) {
                    str = z[40];
                } else {
                    str = z[41];
                }
                Log.i(str);
            }
            this.l = z;
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    static boolean a(bc bcVar) {
        return bcVar.e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.gdrive.fs a(@android.support.annotation.NonNull java.lang.String r12, java.lang.String r13) {
        /*
        r11 = this;
        r9 = 1;
        r0 = 0;
        r3 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = z;
        r2 = 68;
        r1 = r1[r2];
        r2 = z;
        r4 = 56;
        r2 = r2[r4];
        r4 = z;
        r5 = 66;
        r4 = r4[r5];
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = ",";
        r8 = com.whatsapp.gdrive.fs.d();
        r7 = android.text.TextUtils.join(r7, r8);
        r5[r6] = r7;
        r6 = com.whatsapp.gdrive.fs.a();
        r5[r9] = r6;
        r4 = java.lang.String.format(r4, r5);
        r1 = com.whatsapp.gdrive.fn.a(r1, r2, r4);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 76;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = m;
        r2 = r2.append(r4);
        r4 = z;
        r5 = 62;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.toString();
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r2 = r4.append(r2);
        r4 = z;
        r5 = 58;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.toString();
        r4 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0175 }
        r4.<init>();	 Catch:{ JSONException -> 0x0175 }
        r2 = r4.append(r2);	 Catch:{ JSONException -> 0x0175 }
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0175 }
        r4.<init>();	 Catch:{ JSONException -> 0x0175 }
        r5 = z;	 Catch:{ JSONException -> 0x0175 }
        r6 = 78;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0175 }
        r4 = r4.put(r5, r12);	 Catch:{ JSONException -> 0x0175 }
        r5 = z;	 Catch:{ JSONException -> 0x0175 }
        r6 = 80;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0175 }
        r6 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0175 }
        r6.<init>();	 Catch:{ JSONException -> 0x0175 }
        r7 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0175 }
        r7.<init>();	 Catch:{ JSONException -> 0x0175 }
        r8 = z;	 Catch:{ JSONException -> 0x0175 }
        r9 = 79;
        r8 = r8[r9];	 Catch:{ JSONException -> 0x0175 }
        r9 = z;	 Catch:{ JSONException -> 0x0175 }
        r10 = 64;
        r9 = r9[r10];	 Catch:{ JSONException -> 0x0175 }
        r7 = r7.put(r8, r9);	 Catch:{ JSONException -> 0x0175 }
        r8 = z;	 Catch:{ JSONException -> 0x0175 }
        r9 = 67;
        r8 = r8[r9];	 Catch:{ JSONException -> 0x0175 }
        r7 = r7.put(r8, r13);	 Catch:{ JSONException -> 0x0175 }
        r6 = r6.put(r7);	 Catch:{ JSONException -> 0x0175 }
        r4 = r4.put(r5, r6);	 Catch:{ JSONException -> 0x0175 }
        r5 = z;	 Catch:{ JSONException -> 0x0175 }
        r6 = 69;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0175 }
        r6 = z;	 Catch:{ JSONException -> 0x0175 }
        r7 = 65;
        r6 = r6[r7];	 Catch:{ JSONException -> 0x0175 }
        r4 = r4.put(r5, r6);	 Catch:{ JSONException -> 0x0175 }
        r4 = r4.toString();	 Catch:{ JSONException -> 0x0175 }
        r2 = r2.append(r4);	 Catch:{ JSONException -> 0x0175 }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x0175 }
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r2 = r4.append(r2);
        r4 = z;
        r5 = 72;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = m;
        r2 = r2.append(r4);
        r4 = z;
        r5 = 74;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r2.toString();
        r2 = r11.a(r1);	 Catch:{ IOException -> 0x021f, all -> 0x021b }
        r1 = z;	 Catch:{ IOException -> 0x01f0 }
        r5 = 57;
        r1 = r1[r5];	 Catch:{ IOException -> 0x01f0 }
        r2.setRequestMethod(r1);	 Catch:{ IOException -> 0x01f0 }
        r1 = z;	 Catch:{ IOException -> 0x01f0 }
        r5 = 82;
        r1 = r1[r5];	 Catch:{ IOException -> 0x01f0 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01f0 }
        r5.<init>();	 Catch:{ IOException -> 0x01f0 }
        r6 = z;	 Catch:{ IOException -> 0x01f0 }
        r7 = 77;
        r6 = r6[r7];	 Catch:{ IOException -> 0x01f0 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x01f0 }
        r6 = m;	 Catch:{ IOException -> 0x01f0 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x01f0 }
        r6 = "\"";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x01f0 }
        r5 = r5.toString();	 Catch:{ IOException -> 0x01f0 }
        r2.setRequestProperty(r1, r5);	 Catch:{ IOException -> 0x01f0 }
        r1 = 1;
        r2.setDoOutput(r1);	 Catch:{ IOException -> 0x01f0 }
        r1 = z;	 Catch:{ IOException -> 0x01f0 }
        r5 = 61;
        r1 = r1[r5];	 Catch:{ IOException -> 0x01f0 }
        r1 = r4.getBytes(r1);	 Catch:{ IOException -> 0x01f0 }
        r1 = r1.length;	 Catch:{ IOException -> 0x01f0 }
        r2.setFixedLengthStreamingMode(r1);	 Catch:{ IOException -> 0x01f0 }
        r1 = r2.getOutputStream();	 Catch:{ IOException -> 0x01f0 }
        r5 = z;	 Catch:{ IOException -> 0x01f0 }
        r6 = 70;
        r5 = r5[r6];	 Catch:{ IOException -> 0x01f0 }
        r4 = r4.getBytes(r5);	 Catch:{ IOException -> 0x01f0 }
        r1.write(r4);	 Catch:{ IOException -> 0x01f0 }
        r2.connect();	 Catch:{ IOException -> 0x01f0 }
        r4 = r2.getResponseCode();	 Catch:{ IOException -> 0x01f0 }
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 != r1) goto L_0x018c;
    L_0x0160:
        r1 = r2.getInputStream();	 Catch:{ IOException -> 0x01f0 }
        r1 = com.whatsapp.gdrive.fn.a(r1);	 Catch:{ IOException -> 0x01f0 }
        r5 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0180 }
        r5.<init>(r1);	 Catch:{ JSONException -> 0x0180 }
        r0 = com.whatsapp.gdrive.fs.a(r5);	 Catch:{ JSONException -> 0x0180 }
        b(r2);
    L_0x0174:
        return r0;
    L_0x0175:
        r1 = move-exception;
        r2 = z;
        r3 = 71;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x0174;
    L_0x0180:
        r1 = move-exception;
        r5 = z;	 Catch:{ JSONException -> 0x020b }
        r6 = 59;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x020b }
        com.whatsapp.util.Log.b(r5, r1);	 Catch:{ JSONException -> 0x020b }
        if (r3 == 0) goto L_0x0214;
    L_0x018c:
        r1 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r4 != r1) goto L_0x0195;
    L_0x0190:
        r11.e();	 Catch:{ JSONException -> 0x020d }
        if (r3 == 0) goto L_0x0214;
    L_0x0195:
        r1 = r2.getErrorStream();	 Catch:{ IOException -> 0x01f0 }
        r1 = com.whatsapp.gdrive.fn.a(r1);	 Catch:{ IOException -> 0x01f0 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01f0 }
        r3.<init>();	 Catch:{ IOException -> 0x01f0 }
        r5 = z;	 Catch:{ IOException -> 0x01f0 }
        r6 = 63;
        r5 = r5[r6];	 Catch:{ IOException -> 0x01f0 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x01f0 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x01f0 }
        r5 = z;	 Catch:{ IOException -> 0x01f0 }
        r6 = 73;
        r5 = r5[r6];	 Catch:{ IOException -> 0x01f0 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x01f0 }
        r3 = r3.append(r1);	 Catch:{ IOException -> 0x01f0 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x01f0 }
        com.whatsapp.util.Log.e(r3);	 Catch:{ IOException -> 0x01f0 }
        r3 = new com.whatsapp.gdrive.e3;	 Catch:{ IOException -> 0x01f0 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01f0 }
        r5.<init>();	 Catch:{ IOException -> 0x01f0 }
        r6 = z;	 Catch:{ IOException -> 0x01f0 }
        r7 = 81;
        r6 = r6[r7];	 Catch:{ IOException -> 0x01f0 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x01f0 }
        r4 = r5.append(r4);	 Catch:{ IOException -> 0x01f0 }
        r5 = z;	 Catch:{ IOException -> 0x01f0 }
        r6 = 60;
        r5 = r5[r6];	 Catch:{ IOException -> 0x01f0 }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x01f0 }
        r1 = r4.append(r1);	 Catch:{ IOException -> 0x01f0 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x01f0 }
        r3.<init>(r1);	 Catch:{ IOException -> 0x01f0 }
        throw r3;	 Catch:{ IOException -> 0x01f0 }
    L_0x01f0:
        r1 = move-exception;
    L_0x01f1:
        r3 = z;	 Catch:{ JSONException -> 0x0219 }
        r4 = 75;
        r3 = r3[r4];	 Catch:{ JSONException -> 0x0219 }
        com.whatsapp.util.Log.b(r3, r1);	 Catch:{ JSONException -> 0x0219 }
        r1 = r11.a(r2, r1);	 Catch:{ JSONException -> 0x0219 }
        if (r1 == 0) goto L_0x0206;
    L_0x0200:
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x0219 }
        r11.g = r4;	 Catch:{ JSONException -> 0x0219 }
    L_0x0206:
        b(r2);
        goto L_0x0174;
    L_0x020b:
        r1 = move-exception;
        throw r1;	 Catch:{ JSONException -> 0x020d }
    L_0x020d:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x01f0 }
    L_0x020f:
        r0 = move-exception;
    L_0x0210:
        b(r2);
        throw r0;
    L_0x0214:
        b(r2);
        goto L_0x0174;
    L_0x0219:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x020f }
    L_0x021b:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x0210;
    L_0x021f:
        r1 = move-exception;
        r2 = r0;
        goto L_0x01f1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bc.a(java.lang.String, java.lang.String):com.whatsapp.gdrive.fs");
    }

    static Set b(bc bcVar) {
        return bcVar.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(@android.support.annotation.NonNull java.util.List r12, int r13, int r14) {
        /*
        r11 = this;
        r3 = com.whatsapp.gdrive.GoogleDriveService.c;
        if (r14 >= r13) goto L_0x0038;
    L_0x0004:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0036 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0036 }
        r1.<init>();	 Catch:{ IOException -> 0x0036 }
        r2 = z;	 Catch:{ IOException -> 0x0036 }
        r3 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0036 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0036 }
        r1 = r1.append(r14);	 Catch:{ IOException -> 0x0036 }
        r2 = z;	 Catch:{ IOException -> 0x0036 }
        r3 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0036 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0036 }
        r1 = r1.append(r13);	 Catch:{ IOException -> 0x0036 }
        r2 = ")";
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0036 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0036 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0036 }
        throw r0;	 Catch:{ IOException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r0 = r11.f();	 Catch:{ IOException -> 0x0049 }
        if (r0 == 0) goto L_0x004b;
    L_0x003e:
        r0 = z;	 Catch:{ IOException -> 0x0049 }
        r1 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0049 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0049 }
        r0 = 0;
    L_0x0048:
        return r0;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r0 = 1;
        r1 = r14 - r13;
        r2 = 50;
        if (r1 <= r2) goto L_0x012d;
    L_0x0052:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r4 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r1 = r1.append(r13);
        r2 = "-";
        r1 = r1.append(r2);
        r1 = r1.append(r14);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r0;
        r0 = r13;
    L_0x0079:
        if (r0 >= r14) goto L_0x0130;
    L_0x007b:
        r1 = r0 * 50;
        r1 = r1 + r13;
        r2 = r0 + 1;
        r2 = r2 * 50;
        r2 = r2 + r13;
        r1 = r11.a(r12, r1, r2);
        if (r1 != 0) goto L_0x008b;
    L_0x0089:
        r0 = 0;
        goto L_0x0048;
    L_0x008b:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0079;
    L_0x008f:
        r10 = r0;
        r0 = r1;
        r1 = r10;
    L_0x0092:
        if (r1 >= r14) goto L_0x012d;
    L_0x0094:
        r0 = r11.a(r12, r1, r14);
        r1 = r0;
    L_0x0099:
        r0 = r14 - r13;
        r4 = new org.apache.http.client.methods.HttpDelete[r0];
        r2 = r13;
    L_0x009e:
        if (r2 >= r14) goto L_0x00cb;
    L_0x00a0:
        r5 = r2 - r13;
        r6 = new org.apache.http.client.methods.HttpDelete;
        r0 = z;
        r7 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r7 = r0[r7];
        r0 = 1;
        r8 = new java.lang.Object[r0];
        r9 = 0;
        r0 = r12.get(r2);
        r0 = (com.whatsapp.gdrive.fs) r0;
        r0 = r0.g();
        r0 = java.net.URLEncoder.encode(r0);
        r8[r9] = r0;
        r0 = java.lang.String.format(r7, r8);
        r6.<init>(r0);
        r4[r5] = r6;
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x012a;
    L_0x00cb:
        r4 = r11.a(r4);
        if (r4 == 0) goto L_0x0100;
    L_0x00d1:
        r0 = 1;
    L_0x00d2:
        r0 = r0 & r1;
        if (r4 == 0) goto L_0x0048;
    L_0x00d5:
        r5 = r4.length;
        r1 = 0;
        r2 = r1;
        r1 = r0;
    L_0x00d9:
        if (r2 >= r5) goto L_0x0127;
    L_0x00db:
        r6 = r4[r2];
        r0 = r6.getStatusLine();
        r7 = r0.getStatusCode();
        r0 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        if (r7 != r0) goto L_0x0102;
    L_0x00e9:
        r0 = 1;
    L_0x00ea:
        r0 = r0 & r1;
        r1 = r6.getEntity();
        if (r1 == 0) goto L_0x00f4;
    L_0x00f1:
        org.apache.http.util.EntityUtils.toString(r1);	 Catch:{ IOException -> 0x0104 }
    L_0x00f4:
        r1 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r7 != r1) goto L_0x0111;
    L_0x00f8:
        r0 = new com.whatsapp.gdrive.ee;	 Catch:{ IOException -> 0x00fe }
        r0.<init>();	 Catch:{ IOException -> 0x00fe }
        throw r0;	 Catch:{ IOException -> 0x00fe }
    L_0x00fe:
        r0 = move-exception;
        throw r0;
    L_0x0100:
        r0 = 0;
        goto L_0x00d2;
    L_0x0102:
        r0 = 0;
        goto L_0x00ea;
    L_0x0104:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0106 }
    L_0x0106:
        r1 = move-exception;
        r6 = z;
        r8 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r6 = r6[r8];
        com.whatsapp.util.Log.b(r6, r1);
        goto L_0x00f4;
    L_0x0111:
        r1 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r7 != r1) goto L_0x011a;
    L_0x0115:
        r11.e();	 Catch:{ IOException -> 0x0125 }
        if (r3 == 0) goto L_0x011e;
    L_0x011a:
        r1 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        if (r7 == r1) goto L_0x011e;
    L_0x011e:
        r1 = r2 + 1;
        if (r3 != 0) goto L_0x0048;
    L_0x0122:
        r2 = r1;
        r1 = r0;
        goto L_0x00d9;
    L_0x0125:
        r0 = move-exception;
        throw r0;
    L_0x0127:
        r0 = r1;
        goto L_0x0048;
    L_0x012a:
        r2 = r0;
        goto L_0x009e;
    L_0x012d:
        r1 = r0;
        goto L_0x0099;
    L_0x0130:
        r10 = r0;
        r0 = r1;
        r1 = r10;
        goto L_0x0092;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bc.a(java.util.List, int, int):boolean");
    }
}
