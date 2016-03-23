package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.b7;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public abstract class adp implements Callback {
    private static final String[] z;
    protected MenuItem a;
    protected MenuItem b;
    protected MenuItem c;
    protected MenuItem d;
    protected MenuItem e;
    protected MenuItem f;
    protected MenuItem g;
    protected MenuItem h;
    protected Activity i;
    protected MenuItem j;
    protected MenuItem k;
    protected MenuItem l;
    protected MenuItem m;
    protected MenuItem n;

    static {
        String[] strArr = new String[33];
        String str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0016 C\u0019|\u001c \u001d\tr\u00151Q\tiT B\u0018r\te^\u00050\t C\u0005h\t&U";
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
                        i3 = 48;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 29;
                        break;
                    case at.o /*3*/:
                        i3 = 123;
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
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0018$\\\u00060\u0018*^\u001e|\u00181\u001f\u000fo\t*BJw\u0012!\r";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0018$\\\u00060\u0018*^\u001e|\u00181\u001f\u000fo\t*BJs\u0014hB\u000fn\u00140B\tx";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "S\u0006t\u000b'_\u000bo\u001f";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "mJ";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0018*@\u0013n\u001e)U\ti\u001e!U\u0019n\u001a\"U\u00192\u0015*D\u0002t\u0015\"C\u000fq\u001e&D\u000fy";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\nJ";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0018*@\u0013p\u001e6C\u000bz\u001ej^\u001ax";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0010\u0001x\u0002\u007f";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0010\u001eo\u001a+C\fx\t7Y\u0004zA";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0014+S\u000bs\u0018 \\\u0007x\u001f,Q\u000er\f+\\\u0005|\u001fe]\u000fy\u0012$o\u000e|\u000f$\u0010\u0003n[+E\u0006q[(U\u000et\u001a\u001aG\u000bB\u000f<@\u000f'";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0014+S\u000bs\u0018 \\\u0007x\u001f,Q\u000er\f+\\\u0005|\u001fe]\u000fn\b$W\u000f=\u00126\u0010\u0004h\u0017)";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0010\u0001x\u0002\u007f";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0014+S\u000bs\u0018 \\\u0007x\u001f,Q\u000er\f+\\\u0005|\u001feT\u0005j\u0015)_\u000by\u001e7\u0010\u0003n[+E\u0006q[(U\u000et\u001a\u001aG\u000bB\u000f<@\u000f'";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0010\u0019i\u001a1E\u0019'";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0010\u0019i\u001a1E\u0019'";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0010\u001eo\u001a+C\fx\t7U\u000e'";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u001f \\\u000fi\u001e6U\u0006x\u00181U\u000ex\b6Q\rx\bj^\u0005i\u0013,^\rn\u001e)U\ti\u001e!";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u001d*B\u001d|\t!\u001f\f|\u0012)\u001f\t|\u0017)";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u001d*B\u001d|\t!C\u000fq\u001e&D\u000fy\u001e6C\u000bz\u001e6\u001f\u0004r\u000f-Y\u0004z\b \\\u000f~\u000f T";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "V\u0005o\f$B\u000e";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u001d*B\u001d|\t!\u001f\f|\u0012)\u001f\u001fs\u001d,^\u0019u\u001e!\u001d\u001fm\u0017*Q\u000e";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "]\u000fn\b$W\u000fB\u000f<@\u000fn";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\b \\\u000f~\u000f,_\u0004x\u0015!U\u000e";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0010\u001eo\u001a+C\fx\t7Y\u0004zA";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0010\u0019i\u001a1E\u0019'";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0014+S\u000bs\u0018 \\\u0007x\u001f,Q\u001fm\u0017*Q\u000e=\u0016 T\u0003|$!Q\u001e|[,CJs\u000e)\\Jp\u001e!Y\u000bB\f$o\u001ed\u000b \n";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0010\u0001x\u0002\u007f";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    str = "\u0010\u0019i\u001a1E\u0019'";
                    obj = 28;
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    strArr2 = strArr3;
                    str = "\u0010\u0001x\u0002\u007f";
                    obj = 29;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0010\u001eo\u001a+C\fx\t7U\u000e'";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0014+S\u000bs\u0018 \\\u0007x\u001f,Q\u001fm\u0017*Q\u000e=\u000e5\\\u0005|\u001f BJt\be^\u001fq\u0017e]\u000fy\u0012$o\u001d|$1I\u001axA";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "S\u0005s\r B\u0019|\u000f,_\u00042\u0016 C\u0019|\u001c \u001d\tr\u00151Q\tiT B\u0018r\teZ\u0003yF";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract Map a();

    public abstract void f();

    public adp(Activity activity) {
        this.i = activity;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        Log.i(z[24]);
    }

    private void f(co coVar) {
        Intent intent = new Intent(this.i, MessageDetailsActivity.class);
        intent.putExtra(MessageDetailsActivity.y, coVar.k.b);
        intent.putExtra(MessageDetailsActivity.v, coVar.k.c);
        this.i.startActivity(intent);
    }

    public co b() {
        return (co) ((Entry) a().entrySet().iterator().next()).getValue();
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        Map a = a();
        if (a == null) {
            return true;
        }
        try {
            if (a.size() == 0) {
                return true;
            }
            try {
                if (menuItem.getItemId() == 2131755037) {
                    c();
                    return true;
                }
                try {
                    if (menuItem.getItemId() == 2131755035) {
                        e();
                        return true;
                    }
                    try {
                        if (menuItem.getItemId() == 2131755033) {
                            d();
                            f();
                            return true;
                        }
                        try {
                            if (menuItem.getItemId() == 2131755050) {
                                d(b());
                                f();
                                return true;
                            }
                            try {
                                if (menuItem.getItemId() == 2131755019) {
                                    e(b());
                                    f();
                                    return true;
                                }
                                try {
                                    if (menuItem.getItemId() == 2131755018) {
                                        a(b());
                                        f();
                                        return true;
                                    }
                                    try {
                                        if (menuItem.getItemId() == 2131755036) {
                                            f(b());
                                            f();
                                            return true;
                                        }
                                        try {
                                            if (menuItem.getItemId() == 2131755051) {
                                                App.aK.b(a.values(), true, true);
                                                f();
                                                return true;
                                            }
                                            try {
                                                if (menuItem.getItemId() == 2131755056) {
                                                    App.aK.b(a.values(), false, true);
                                                    f();
                                                    return true;
                                                }
                                                try {
                                                    if (menuItem.getItemId() == 2131755038) {
                                                        c(b());
                                                        f();
                                                        return true;
                                                    }
                                                    try {
                                                        if (menuItem.getItemId() != 2131755017) {
                                                            return false;
                                                        }
                                                        b(b());
                                                        f();
                                                        return true;
                                                    } catch (NullPointerException e) {
                                                        throw e;
                                                    }
                                                } catch (NullPointerException e2) {
                                                    throw e2;
                                                }
                                            } catch (NullPointerException e22) {
                                                throw e22;
                                            }
                                        } catch (NullPointerException e222) {
                                            throw e222;
                                        }
                                    } catch (NullPointerException e2222) {
                                        throw e2222;
                                    }
                                } catch (NullPointerException e22222) {
                                    throw e22222;
                                }
                            } catch (NullPointerException e222222) {
                                throw e222222;
                            }
                        } catch (NullPointerException e2222222) {
                            throw e2222222;
                        }
                    } catch (NullPointerException e22222222) {
                        throw e22222222;
                    }
                } catch (NullPointerException e222222222) {
                    throw e222222222;
                }
            } catch (NullPointerException e2222222222) {
                throw e2222222222;
            }
        } catch (NullPointerException e22222222222) {
            throw e22222222222;
        }
    }

    private void e(co coVar) {
        boolean z = DialogToastActivity.f;
        try {
            if (b7.a(coVar.d, 2) >= 0) {
                App.a(this.i.getBaseContext(), 2131231150, 0);
                return;
            }
            MediaData mediaData = (MediaData) coVar.Q;
            if (mediaData != null) {
                try {
                    if (mediaData.uploader != null) {
                        mediaData.uploader.b();
                        if (!z) {
                            return;
                        }
                    }
                    try {
                        Log.e(z[32] + coVar.c + z[29] + coVar.d + z[25] + mediaData.transferring + z[31] + mediaData.transferred + z[28] + coVar.k);
                        if (!z) {
                            return;
                        }
                    } catch (NullPointerException e) {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                } catch (NullPointerException e22) {
                    throw e22;
                }
            }
            Log.e(z[27] + coVar.c + z[26] + coVar.d + z[30] + coVar.k);
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r6) {
        /*
        r5 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r6 == 0) goto L_0x00b1;
    L_0x0004:
        r0 = r6.Q;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0073;
    L_0x000a:
        r2 = r0.downloader;	 Catch:{ NullPointerException -> 0x00bb }
        if (r2 == 0) goto L_0x0015;
    L_0x000e:
        r2 = r0.downloader;	 Catch:{ NullPointerException -> 0x00bd }
        r2.d();	 Catch:{ NullPointerException -> 0x00bd }
        if (r1 == 0) goto L_0x00af;
    L_0x0015:
        r2 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00bf }
        r2.<init>();	 Catch:{ NullPointerException -> 0x00bf }
        r3 = z;	 Catch:{ NullPointerException -> 0x00bf }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00bf }
        r3 = r6.c;	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00bf }
        r3 = z;	 Catch:{ NullPointerException -> 0x00bf }
        r4 = 15;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00bf }
        r3 = r6.d;	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00bf }
        r3 = z;	 Catch:{ NullPointerException -> 0x00bf }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00bf }
        r3 = r0.transferring;	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00bf }
        r3 = z;	 Catch:{ NullPointerException -> 0x00bf }
        r4 = 17;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.transferred;	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r2.append(r0);	 Catch:{ NullPointerException -> 0x00bf }
        r2 = z;	 Catch:{ NullPointerException -> 0x00bf }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r6.k;	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x00bf }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x00bf }
        if (r1 == 0) goto L_0x00af;
    L_0x0073:
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00bf }
        r0.<init>();	 Catch:{ NullPointerException -> 0x00bf }
        r2 = z;	 Catch:{ NullPointerException -> 0x00bf }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r6.c;	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ NullPointerException -> 0x00bf }
        r2 = z;	 Catch:{ NullPointerException -> 0x00bf }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r6.d;	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ NullPointerException -> 0x00bf }
        r2 = z;	 Catch:{ NullPointerException -> 0x00bf }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ NullPointerException -> 0x00bf }
        r2 = r6.k;	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x00bf }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x00bf }
    L_0x00af:
        if (r1 == 0) goto L_0x00ba;
    L_0x00b1:
        r0 = z;	 Catch:{ NullPointerException -> 0x00c1 }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x00c1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x00c1 }
    L_0x00ba:
        return;
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adp.a(com.whatsapp.protocol.co):void");
    }

    private void e() {
        Map a = a();
        if (a != null) {
            try {
                if (!a.isEmpty()) {
                    this.i.showDialog(13);
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        Log.e(z[18]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.whatsapp.protocol.co r6) {
        /*
        r5 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = com.whatsapp.qm.c(r6);
        if (r1 == 0) goto L_0x003b;
    L_0x0008:
        r2 = com.whatsapp.App.as;
        r2 = r2.b(r1);
        if (r2 == 0) goto L_0x0020;
    L_0x0010:
        r3 = r5.i;	 Catch:{ NullPointerException -> 0x0044 }
        r2 = com.whatsapp.Conversation.a(r2);	 Catch:{ NullPointerException -> 0x0044 }
        r3.startActivity(r2);	 Catch:{ NullPointerException -> 0x0044 }
        r2 = r5.i;	 Catch:{ NullPointerException -> 0x0044 }
        r2.finish();	 Catch:{ NullPointerException -> 0x0044 }
        if (r0 == 0) goto L_0x0039;
    L_0x0020:
        r2 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0044 }
        r2.<init>();	 Catch:{ NullPointerException -> 0x0044 }
        r3 = z;	 Catch:{ NullPointerException -> 0x0044 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x0044 }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x0044 }
        r1 = r2.append(r1);	 Catch:{ NullPointerException -> 0x0044 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0044 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NullPointerException -> 0x0044 }
    L_0x0039:
        if (r0 == 0) goto L_0x0043;
    L_0x003b:
        r0 = z;	 Catch:{ NullPointerException -> 0x0046 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0046 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x0046 }
    L_0x0043:
        return;
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adp.c(com.whatsapp.protocol.co):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareActionMode(android.support.v7.view.ActionMode r11, android.view.Menu r12) {
        /*
        r10 = this;
        r4 = 1;
        r2 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.c;
        r0.setVisible(r4);
        r0 = r10.a;
        r0.setVisible(r2);
        r0 = r10.b;
        r0.setVisible(r2);
        r0 = r10.f;
        r0.setVisible(r2);
        r0 = r10.g;
        r0.setVisible(r2);
        r0 = r10.j;
        r0.setVisible(r2);
        r0 = r10.d;
        r0.setVisible(r2);
        r0 = r10.l;
        r0.setVisible(r2);
        r0 = r10.k;
        r0.setVisible(r2);
        r6 = r10.a();
        if (r6 == 0) goto L_0x003d;
    L_0x0037:
        r0 = r6.size();	 Catch:{ NullPointerException -> 0x003e }
        if (r0 != 0) goto L_0x0040;
    L_0x003d:
        return r4;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = r6.values();
        r7 = r0.iterator();
        r1 = r2;
        r3 = r4;
    L_0x004a:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x006d;
    L_0x0050:
        r0 = r7.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r8 = r0.c;
        if (r8 == 0) goto L_0x005d;
    L_0x005a:
        if (r5 == 0) goto L_0x01ce;
    L_0x005c:
        r3 = r2;
    L_0x005d:
        r0 = r0.c();	 Catch:{ NullPointerException -> 0x0148 }
        r0 = com.whatsapp.util.ac.a(r0);	 Catch:{ NullPointerException -> 0x0148 }
        if (r0 == 0) goto L_0x01ca;
    L_0x0067:
        r0 = r4;
        r1 = r3;
    L_0x0069:
        if (r5 == 0) goto L_0x01c6;
    L_0x006b:
        r3 = r1;
        r1 = r0;
    L_0x006d:
        r7 = r10.e;	 Catch:{ NullPointerException -> 0x014a }
        if (r3 == 0) goto L_0x014e;
    L_0x0071:
        if (r1 != 0) goto L_0x014e;
    L_0x0073:
        r0 = r4;
    L_0x0074:
        r7.setVisible(r0);	 Catch:{ NullPointerException -> 0x0151 }
        r3 = r10.h;	 Catch:{ NullPointerException -> 0x0151 }
        if (r1 != 0) goto L_0x0153;
    L_0x007b:
        r0 = r4;
    L_0x007c:
        r3.setVisible(r0);
        r0 = r6.size();
        if (r0 != r4) goto L_0x0112;
    L_0x0085:
        r1 = r10.b();
        r0 = r1.c;	 Catch:{ NullPointerException -> 0x01a2 }
        switch(r0) {
            case 0: goto L_0x0156;
            case 1: goto L_0x015a;
            case 2: goto L_0x015a;
            case 3: goto L_0x015a;
            case 4: goto L_0x008e;
            case 5: goto L_0x0158;
            case 6: goto L_0x008e;
            case 7: goto L_0x008e;
            case 8: goto L_0x008e;
            case 9: goto L_0x015a;
            default: goto L_0x008e;
        };
    L_0x008e:
        r3 = r10.g;	 Catch:{ NullPointerException -> 0x01ae }
        r0 = r1.k;	 Catch:{ NullPointerException -> 0x01ae }
        r0 = r0.a;	 Catch:{ NullPointerException -> 0x01ae }
        if (r0 == 0) goto L_0x01b2;
    L_0x0096:
        r0 = r1.d;	 Catch:{ NullPointerException -> 0x01b0 }
        r7 = 4;
        r0 = com.whatsapp.protocol.b7.a(r0, r7);	 Catch:{ NullPointerException -> 0x01b0 }
        if (r0 < 0) goto L_0x01b2;
    L_0x009f:
        r0 = r4;
    L_0x00a0:
        r3.setVisible(r0);	 Catch:{ NullPointerException -> 0x01b5 }
        r0 = r1.k;	 Catch:{ NullPointerException -> 0x01b5 }
        r0 = r0.c;	 Catch:{ NullPointerException -> 0x01b5 }
        r0 = com.whatsapp.qm.i(r0);	 Catch:{ NullPointerException -> 0x01b5 }
        if (r0 == 0) goto L_0x0112;
    L_0x00ad:
        r0 = r1.k;	 Catch:{ NullPointerException -> 0x01b7 }
        r0 = r0.a;	 Catch:{ NullPointerException -> 0x01b7 }
        if (r0 == 0) goto L_0x00b8;
    L_0x00b3:
        r0 = r1.d;	 Catch:{ NullPointerException -> 0x01b7 }
        r3 = 6;
        if (r0 != r3) goto L_0x0112;
    L_0x00b8:
        r0 = com.whatsapp.qm.c(r1);
        if (r0 == 0) goto L_0x0112;
    L_0x00be:
        r1 = com.whatsapp.App.as;
        r0 = r1.b(r0);
        r1 = r0.l;	 Catch:{ NullPointerException -> 0x01b9 }
        if (r1 != 0) goto L_0x00d4;
    L_0x00c8:
        r1 = r10.j;	 Catch:{ NullPointerException -> 0x01b9 }
        r3 = 1;
        r1.setVisible(r3);	 Catch:{ NullPointerException -> 0x01b9 }
        r1 = r10.d;	 Catch:{ NullPointerException -> 0x01b9 }
        r3 = 1;
        r1.setVisible(r3);	 Catch:{ NullPointerException -> 0x01b9 }
    L_0x00d4:
        r1 = r10.l;
        r1.setVisible(r4);
        r1 = r10.l;
        r3 = r10.i;
        r3 = r3.getResources();
        r7 = 2131231445; // 0x7f0802d5 float:1.8078971E38 double:1.0529682403E-314;
        r8 = new java.lang.Object[r4];
        r9 = r0.i();
        r8[r2] = r9;
        r3 = r3.getString(r7, r8);
        r1.setTitle(r3);
        r1 = r10.k;
        r1.setVisible(r4);
        r1 = r10.k;
        r3 = r10.i;
        r3 = r3.getResources();
        r7 = 2131230866; // 0x7f080092 float:1.8077797E38 double:1.0529679542E-314;
        r8 = new java.lang.Object[r4];
        r0 = r0.i();
        r8[r2] = r0;
        r0 = r3.getString(r7, r8);
        r1.setTitle(r0);
    L_0x0112:
        r0 = r6.values();
        r3 = r0.iterator();
        r1 = r4;
    L_0x011b:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x01c3;
    L_0x0121:
        r0 = r3.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r0 = r0.P;
        if (r0 != 0) goto L_0x01c0;
    L_0x012b:
        r0 = r2;
    L_0x012c:
        if (r5 == 0) goto L_0x01bd;
    L_0x012e:
        r1 = r10.n;	 Catch:{ NullPointerException -> 0x01bb }
        if (r0 != 0) goto L_0x0133;
    L_0x0132:
        r2 = r4;
    L_0x0133:
        r1.setVisible(r2);
        r1 = r10.m;
        r1.setVisible(r0);
        r0 = r6.size();
        r0 = java.lang.String.valueOf(r0);
        r11.setTitle(r0);
        goto L_0x003d;
    L_0x0148:
        r0 = move-exception;
        throw r0;
    L_0x014a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x014c }
    L_0x014c:
        r0 = move-exception;
        throw r0;
    L_0x014e:
        r0 = r2;
        goto L_0x0074;
    L_0x0151:
        r0 = move-exception;
        throw r0;
    L_0x0153:
        r0 = r2;
        goto L_0x007c;
    L_0x0156:
        if (r5 == 0) goto L_0x008e;
    L_0x0158:
        if (r5 == 0) goto L_0x008e;
    L_0x015a:
        r0 = r1.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r3 = r1.k;	 Catch:{ NullPointerException -> 0x01a6 }
        r3 = r3.a;	 Catch:{ NullPointerException -> 0x01a6 }
        if (r3 != 0) goto L_0x0168;
    L_0x0164:
        r3 = r0.transferred;	 Catch:{ NullPointerException -> 0x01a8 }
        if (r3 == 0) goto L_0x016e;
    L_0x0168:
        r3 = r10.a;	 Catch:{ NullPointerException -> 0x01a8 }
        r7 = 1;
        r3.setVisible(r7);	 Catch:{ NullPointerException -> 0x01a8 }
    L_0x016e:
        r0 = r0.transferring;	 Catch:{ NullPointerException -> 0x01aa }
        if (r0 == 0) goto L_0x008e;
    L_0x0172:
        r0 = r1.k;	 Catch:{ NullPointerException -> 0x01ac }
        r0 = r0.a;	 Catch:{ NullPointerException -> 0x01ac }
        if (r0 == 0) goto L_0x018c;
    L_0x0178:
        r0 = r10.b;	 Catch:{ NullPointerException -> 0x01a0 }
        r3 = 1;
        r0.setVisible(r3);	 Catch:{ NullPointerException -> 0x01a0 }
        r0 = r10.c;	 Catch:{ NullPointerException -> 0x01a0 }
        r3 = 0;
        r0.setVisible(r3);	 Catch:{ NullPointerException -> 0x01a0 }
        r0 = r10.h;	 Catch:{ NullPointerException -> 0x01a0 }
        r3 = 0;
        r0.setVisible(r3);	 Catch:{ NullPointerException -> 0x01a0 }
        if (r5 == 0) goto L_0x008e;
    L_0x018c:
        r0 = r10.f;	 Catch:{ NullPointerException -> 0x01a0 }
        r3 = 1;
        r0.setVisible(r3);	 Catch:{ NullPointerException -> 0x01a0 }
        r0 = r10.c;	 Catch:{ NullPointerException -> 0x01a0 }
        r3 = 0;
        r0.setVisible(r3);	 Catch:{ NullPointerException -> 0x01a0 }
        r0 = r10.h;	 Catch:{ NullPointerException -> 0x01a0 }
        r3 = 0;
        r0.setVisible(r3);	 Catch:{ NullPointerException -> 0x01a0 }
        goto L_0x008e;
    L_0x01a0:
        r0 = move-exception;
        throw r0;
    L_0x01a2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01a4 }
    L_0x01a4:
        r0 = move-exception;
        throw r0;
    L_0x01a6:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01a8 }
    L_0x01a8:
        r0 = move-exception;
        throw r0;
    L_0x01aa:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01ac }
    L_0x01ac:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01a0 }
    L_0x01ae:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01b0 }
    L_0x01b0:
        r0 = move-exception;
        throw r0;
    L_0x01b2:
        r0 = r2;
        goto L_0x00a0;
    L_0x01b5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x01b7 }
    L_0x01b7:
        r0 = move-exception;
        throw r0;
    L_0x01b9:
        r0 = move-exception;
        throw r0;
    L_0x01bb:
        r0 = move-exception;
        throw r0;
    L_0x01bd:
        r1 = r0;
        goto L_0x011b;
    L_0x01c0:
        r0 = r1;
        goto L_0x012c;
    L_0x01c3:
        r0 = r1;
        goto L_0x012e;
    L_0x01c6:
        r3 = r1;
        r1 = r0;
        goto L_0x004a;
    L_0x01ca:
        r0 = r1;
        r1 = r3;
        goto L_0x0069;
    L_0x01ce:
        r0 = r1;
        r1 = r2;
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adp.onPrepareActionMode(android.support.v7.view.ActionMode, android.view.Menu):boolean");
    }

    void d(co coVar) {
        App.b(this.i, coVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r12 = this;
        r11 = 1;
        r10 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.a();
        if (r0 == 0) goto L_0x0010;
    L_0x000a:
        r1 = r0.isEmpty();	 Catch:{ NullPointerException -> 0x0019 }
        if (r1 == 0) goto L_0x001d;
    L_0x0010:
        r0 = z;	 Catch:{ NullPointerException -> 0x001b }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x001b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x001b }
    L_0x0018:
        return;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;
    L_0x001d:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = r0.values();
        r4 = com.whatsapp.qa.a(r0);
        r5 = r4.iterator();
    L_0x002e:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x00b5;
    L_0x0034:
        r0 = r5.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r1 = r0.c;	 Catch:{ NullPointerException -> 0x0117 }
        if (r1 != 0) goto L_0x00b3;
    L_0x003e:
        r1 = r3.length();	 Catch:{ NullPointerException -> 0x0117 }
        if (r1 == 0) goto L_0x0049;
    L_0x0044:
        r1 = 10;
        r3.append(r1);	 Catch:{ NullPointerException -> 0x0119 }
    L_0x0049:
        r1 = r4.size();	 Catch:{ NullPointerException -> 0x011b }
        if (r1 <= r11) goto L_0x00ac;
    L_0x004f:
        r1 = 91;
        r1 = r3.append(r1);	 Catch:{ NullPointerException -> 0x011b }
        r6 = r12.i;	 Catch:{ NullPointerException -> 0x011b }
        r8 = r0.b;	 Catch:{ NullPointerException -> 0x011b }
        r7 = 655377; // 0xa0011 float:9.18379E-40 double:3.237993E-318;
        r6 = android.text.format.DateUtils.formatDateTime(r6, r8, r7);	 Catch:{ NullPointerException -> 0x011b }
        r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x011b }
        r6 = z;	 Catch:{ NullPointerException -> 0x011b }
        r7 = 5;
        r6 = r6[r7];	 Catch:{ NullPointerException -> 0x011b }
        r1.append(r6);	 Catch:{ NullPointerException -> 0x011b }
        r1 = r0.k;	 Catch:{ NullPointerException -> 0x011b }
        r1 = r1.a;	 Catch:{ NullPointerException -> 0x011b }
        if (r1 == 0) goto L_0x007d;
    L_0x0072:
        r1 = r12.i;	 Catch:{ NullPointerException -> 0x011d }
        r1 = com.whatsapp.App.h(r1);	 Catch:{ NullPointerException -> 0x011d }
        r3.append(r1);	 Catch:{ NullPointerException -> 0x011d }
        if (r2 == 0) goto L_0x00a4;
    L_0x007d:
        r1 = r0.k;	 Catch:{ NullPointerException -> 0x011f }
        r1 = r1.c;	 Catch:{ NullPointerException -> 0x011f }
        r1 = com.whatsapp.qm.i(r1);	 Catch:{ NullPointerException -> 0x011f }
        if (r1 == 0) goto L_0x0091;
    L_0x0087:
        r1 = com.whatsapp.App.as;
        r6 = r0.t;
        r1 = r1.b(r6);
        if (r2 == 0) goto L_0x009b;
    L_0x0091:
        r1 = com.whatsapp.App.as;
        r6 = r0.k;
        r6 = r6.c;
        r1 = r1.b(r6);
    L_0x009b:
        r6 = r12.i;
        r1 = r1.a(r6);
        r3.append(r1);
    L_0x00a4:
        r1 = z;
        r6 = 7;
        r1 = r1[r6];
        r3.append(r1);
    L_0x00ac:
        r0 = r0.c();
        r3.append(r0);
    L_0x00b3:
        if (r2 == 0) goto L_0x002e;
    L_0x00b5:
        r0 = r12.i;
        r1 = z;
        r5 = 4;
        r1 = r1[r5];
        r0 = r0.getSystemService(r1);
        r0 = (android.text.ClipboardManager) r0;
        r1 = r3.toString();	 Catch:{ NullPointerException -> 0x0121 }
        r0.setText(r1);	 Catch:{ NullPointerException -> 0x0121 }
        r0 = r4.size();	 Catch:{ NullPointerException -> 0x0121 }
        if (r0 != r11) goto L_0x00da;
    L_0x00cf:
        r0 = r12.i;	 Catch:{ NullPointerException -> 0x0121 }
        r1 = 2131231446; // 0x7f0802d6 float:1.8078973E38 double:1.052968241E-314;
        r3 = 0;
        com.whatsapp.App.a(r0, r1, r3);	 Catch:{ NullPointerException -> 0x0121 }
        if (r2 == 0) goto L_0x0018;
    L_0x00da:
        r0 = r12.i;	 Catch:{ NullPointerException -> 0x0101 }
        r1 = com.whatsapp.App.az;	 Catch:{ NullPointerException -> 0x0101 }
        r2 = 2131296284; // 0x7f09001c float:1.821048E38 double:1.053000275E-314;
        r3 = r4.size();	 Catch:{ NullPointerException -> 0x0101 }
        r1 = r1.a(r2, r3);	 Catch:{ NullPointerException -> 0x0101 }
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ NullPointerException -> 0x0101 }
        r3 = 0;
        r4 = r4.size();	 Catch:{ NullPointerException -> 0x0101 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ NullPointerException -> 0x0101 }
        r2[r3] = r4;	 Catch:{ NullPointerException -> 0x0101 }
        r1 = java.lang.String.format(r1, r2);	 Catch:{ NullPointerException -> 0x0101 }
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ NullPointerException -> 0x0101 }
        goto L_0x0018;
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0103 }
    L_0x0103:
        r0 = move-exception;
        r0 = z;
        r1 = 8;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = r12.i;
        r1 = 2131232229; // 0x7f0805e5 float:1.8080561E38 double:1.0529686277E-314;
        com.whatsapp.App.a(r0, r1, r10);
        goto L_0x0018;
    L_0x0117:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0119 }
    L_0x0119:
        r0 = move-exception;
        throw r0;
    L_0x011b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x011d }
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x011f }
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0101 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adp.d():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.protocol.co r7) {
        /*
        r6 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = com.whatsapp.qm.c(r7);
        if (r1 == 0) goto L_0x0035;
    L_0x0008:
        r2 = com.whatsapp.App.as;
        r2 = r2.b(r1);
        if (r2 == 0) goto L_0x001a;
    L_0x0010:
        r3 = r6.i;	 Catch:{ NullPointerException -> 0x003e }
        r4 = com.whatsapp.fieldstats.cd.CONVERSATION;	 Catch:{ NullPointerException -> 0x003e }
        r5 = 0;
        com.whatsapp.App.a(r2, r3, r4, r5);	 Catch:{ NullPointerException -> 0x003e }
        if (r0 == 0) goto L_0x0033;
    L_0x001a:
        r2 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x003e }
        r2.<init>();	 Catch:{ NullPointerException -> 0x003e }
        r3 = z;	 Catch:{ NullPointerException -> 0x003e }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x003e }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x003e }
        r1 = r2.append(r1);	 Catch:{ NullPointerException -> 0x003e }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x003e }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NullPointerException -> 0x003e }
    L_0x0033:
        if (r0 == 0) goto L_0x003d;
    L_0x0035:
        r0 = z;	 Catch:{ NullPointerException -> 0x0040 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x0040 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x0040 }
    L_0x003d:
        return;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adp.b(com.whatsapp.protocol.co):void");
    }

    void c() {
        boolean z = DialogToastActivity.f;
        Map a = a();
        if (a != null) {
            try {
                if (!a.isEmpty()) {
                    int i;
                    boolean z2;
                    boolean z3 = true;
                    for (co coVar : a.values()) {
                        try {
                            boolean z4;
                            MediaData mediaData = coVar.Q instanceof MediaData ? (MediaData) coVar.Q : null;
                            if (mediaData != null) {
                                try {
                                    if (!mediaData.transferred) {
                                        if (coVar.c != 4) {
                                            try {
                                                if (coVar.c != 5 && coVar.k.a) {
                                                    Log.w(z[22]);
                                                    App.a(this.i, 2131231443, 0);
                                                    if (!z) {
                                                        i = 0;
                                                        break;
                                                    }
                                                    z4 = false;
                                                    if (coVar.c != 8) {
                                                        Log.w(z[19]);
                                                        App.a(this.i, 2131231442, 0);
                                                        if (z) {
                                                            i = 0;
                                                            break;
                                                        }
                                                        z2 = false;
                                                    } else {
                                                        z2 = z4;
                                                    }
                                                    if (z) {
                                                        break;
                                                    }
                                                    z3 = z2;
                                                }
                                            } catch (NullPointerException e) {
                                                throw e;
                                            }
                                        }
                                    }
                                } catch (NullPointerException e2) {
                                    throw e2;
                                } catch (NullPointerException e22) {
                                    throw e22;
                                }
                            }
                            z4 = z3;
                            try {
                                if (coVar.c != 8) {
                                    z2 = z4;
                                } else {
                                    Log.w(z[19]);
                                    App.a(this.i, 2131231442, 0);
                                    if (z) {
                                        i = 0;
                                        break;
                                    }
                                    z2 = false;
                                }
                                if (z) {
                                    break;
                                }
                                z3 = z2;
                            } catch (NullPointerException e222) {
                                throw e222;
                            }
                        } catch (NullPointerException e2222) {
                            throw e2222;
                        }
                    }
                    z2 = z3;
                    if (i != 0) {
                        Intent intent = new Intent(this.i, ContactPicker.class);
                        intent.putExtra(z[21], true);
                        Collection hashSet = new HashSet();
                        for (co coVar2 : a.values()) {
                            hashSet.add(Integer.valueOf(Byte.valueOf(coVar2.c).intValue()));
                            if (z) {
                                break;
                            }
                        }
                        intent.putIntegerArrayListExtra(z[23], new ArrayList(hashSet));
                        this.i.startActivityForResult(intent, 2);
                        return;
                    }
                    return;
                }
            } catch (NullPointerException e22222) {
                throw e22222;
            }
        }
        Log.e(z[20]);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.n = menu.add(0, 2131755051, 0, 2131230795).setIcon(2130839450);
        this.m = menu.add(0, 2131755056, 0, 2131231829).setIcon(2130839451);
        this.g = menu.add(0, 2131755036, 0, 2131231369).setIcon(2130839438);
        this.c = menu.add(0, 2131755035, 0, 2131231020).setIcon(2130839433);
        this.e = menu.add(0, 2131755033, 0, 2131231005).setIcon(2130839431);
        this.a = menu.add(0, 2131755050, 0, 2131232015).setIcon(2130839448);
        this.b = menu.add(0, 2131755019, 0, 2131230884).setIcon(2130839429);
        this.f = menu.add(0, 2131755018, 0, 2131230884).setIcon(2130839429);
        this.h = menu.add(0, 2131755037, 0, 2131230989).setIcon(2130839437);
        this.j = menu.add(0, 2131755014, 0, 2131230786);
        this.d = menu.add(0, 2131755015, 0, 2131230789);
        this.l = menu.add(0, 2131755038, 0, 2131231445);
        this.k = menu.add(0, 2131755017, 0, 2131230866);
        MenuItemCompat.setShowAsAction(this.h, 2);
        MenuItemCompat.setShowAsAction(this.c, 2);
        MenuItemCompat.setShowAsAction(this.e, 2);
        MenuItemCompat.setShowAsAction(this.a, 2);
        MenuItemCompat.setShowAsAction(this.b, 2);
        MenuItemCompat.setShowAsAction(this.f, 2);
        MenuItemCompat.setShowAsAction(this.g, 2);
        MenuItemCompat.setShowAsAction(this.n, 2);
        MenuItemCompat.setShowAsAction(this.m, 2);
        MenuItemCompat.setShowAsAction(this.j, 0);
        MenuItemCompat.setShowAsAction(this.d, 0);
        MenuItemCompat.setShowAsAction(this.l, 0);
        MenuItemCompat.setShowAsAction(this.k, 0);
        return true;
    }
}
