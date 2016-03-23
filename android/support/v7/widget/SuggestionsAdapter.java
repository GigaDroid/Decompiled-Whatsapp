package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.ResourceCursorAdapter;
import android.support.v7.appcompat.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.WeakHashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class SuggestionsAdapter extends ResourceCursorAdapter implements OnClickListener {
    private static final String[] z;
    private boolean mClosed;
    private final int mCommitIconResId;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private final WeakHashMap mOutsideDrawablesCache;
    private final Context mProviderContext;
    private int mQueryRefinement;
    private final SearchView mSearchView;
    private final SearchableInfo mSearchable;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private ColorStateList mUrlColor;

    final class ChildViewCache {
        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public ChildViewCache(View view) {
            this.mText1 = (TextView) view.findViewById(16908308);
            this.mText2 = (TextView) view.findViewById(16908309);
            this.mIcon1 = (ImageView) view.findViewById(16908295);
            this.mIcon2 = (ImageView) view.findViewById(16908296);
            this.mIconRefine = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    static {
        String[] strArr = new String[46];
        String str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
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
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 96;
                        break;
                    case at.i /*2*/:
                        i3 = 82;
                        break;
                    case at.o /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 18;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0018\u00155Jw\u0018\u0014\rD|\u001f\u0005<YM\u000f\u0001&L";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0018\u00155Jw\u0018\u0014\rD|\u001f\u0005<YM\u001a\u00157_k";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0018\u00155Jw\u0018\u0014\rYw\u0013\u0014\r\u001c";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0018\u00155Jw\u0018\u0014\rDq\u0004\u000e\r\u001f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0018\u00155Jw\u0018\u0014\rDq\u0004\u000e\r\u001c";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0018\u00155Jw\u0018\u0014\rYw\u0013\u0014\r\u001c";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u000e\u0012 B`K\u0003:L|\f\t<J2\b\u0015 ^}\u0019@3CvK\u00033Nz\u0002\u000e5\rq\u0004\f'@|\u0018";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0018\u00155Jw\u0018\u0014\rYw\u0013\u0014\r\u001fM\u001e\u0012>";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "?\u0012;HvK\u0014=\rq\u0003\u0001<JwK\u0003'_a\u0004\u0012rLt\u001f\u0005 \rs\u000f\u0001\"Yw\u0019@%LaK\u0003>Ba\u000e\u0004|";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0018\u00155Jw\u0018\u0014\rYw\u0013\u0014\r\u001f";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0018\u00155Jw\u0018\u0014\rK~\n\u0007!";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0002\u000e\r]`\u0004\u0007 Ha\u0018";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "-\u0001;Aw\u000f@&B2\u0004\u00107C2";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
                    obj = 17;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "\n\u000e6_}\u0002\u0004|_w\u0018\u000f'_q\u000e";
                    obj = 18;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = ".\u0012 B`K\u0003>Ba\u0002\u000e5\r{\b\u000f<\ra\u001f\u00127L\u007fK\u0006=_2";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\"\u0003=C2\u0005\u000f&\rt\u0004\u0015<I(K";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ".\u0012 B`K\u0003>Ba\u0002\u000e5\r{\b\u000f<\ra\u001f\u00127L\u007fK\u0006=_2";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "G@";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "9\u0005!Bg\u0019\u00037\rv\u0004\u0005!\r|\u0004\u0014rHj\u0002\u0013&\u00172";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\"\u000e$L~\u0002\u0004rDq\u0004\u000er_w\u0018\u000f'_q\u000e@";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "K\u0006=_2";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "8\u00053_q\u0003@!Xu\f\u0005!Y{\u0004\u000e!\rq\u001e\u0012!B`K\u0014:_w\u001c@7Uq\u000e\u0010&D}\u0005N";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\n\u000e6_}\u0002\u0004|_w\u0018\u000f'_q\u000eZ}\u0002";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\"\u0003=C2\u0019\u0005!Bg\u0019\u00037\r|\u0004\u0014rK}\u001e\u000e6\u00172";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "%\u000fr_w\u0018\u000f'_q\u000e@4Bg\u0005\u0004rK}\u0019Zr";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "%\u000fr]s\b\u000b3JwK\u0006=X|\u000f@4B`K\u0001'Yz\u0004\u0012;YkQ@";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "%\u000fr]s\u001f\bh\r";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "8\t<J~\u000e@\"Lf\u0003@!Hu\u0006\u0005<Y2\u0002\u0013rC}\u001f@3\r`\u000e\u0013=X`\b\u0005rdVQ@";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "&\u000f H2\u001f\b3C2\u001f\u0017=\rb\n\u0014:\ra\u000e\u0007?H|\u001f\u0013h\r";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "%\u000frLg\u001f\b=_{\u001f\u0019h\r";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "8\u00155Jw\u0018\u0014;B|\u0018!6Lb\u001f\u0005 ";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u001e\u000e7Ub\u000e\u0003&HvK\u0005 _}\u0019@ Hf\u0019\t7[{\u0005\u0007r[s\u0007\t6\rq\u0004\f'@|K\u0006 B\u007fK\u0003'_a\u0004\u0012~\rv\u0002\u0004rYz\u000e@ H\u007f\u0004\u00147\rb\u0019\u000f1Ha\u0018@6DwT";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\b\u000f<Yw\u0005\u0014";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0007\t?Df";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0018\u00053_q\u0003?!Xu\f\u0005!YM\u001a\u00157_k";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "8\u00053_q\u0003@!Xu\f\u0005!Y{\u0004\u000e!\rc\u001e\u0005 T2\u001f\b HeK\u0001<\rw\u0013\u00037]f\u0002\u000f<\u0003";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void changeCursor(Cursor cursor) {
        try {
            if (this.mClosed) {
                Log.w(z[6], z[12]);
                if (cursor != null) {
                    cursor.close();
                    return;
                }
                return;
            }
            try {
                super.changeCursor(cursor);
                if (cursor != null) {
                    this.mText1Col = cursor.getColumnIndex(z[8]);
                    this.mText2Col = cursor.getColumnIndex(z[13]);
                    this.mText2UrlCol = cursor.getColumnIndex(z[11]);
                    this.mIconName1Col = cursor.getColumnIndex(z[7]);
                    this.mIconName2Col = cursor.getColumnIndex(z[5]);
                    this.mFlagsCol = cursor.getColumnIndex(z[14]);
                }
            } catch (Throwable e) {
                Log.e(z[9], z[10], e);
            }
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }

    private static String getStringOrNull(Cursor cursor, int i) {
        String str = null;
        if (i != -1) {
            try {
                str = cursor.getString(i);
            } catch (Throwable e) {
                Log.e(z[41], z[42], e);
            }
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bindView(android.view.View r9, android.content.Context r10, android.database.Cursor r11) {
        /*
        r8 = this;
        r7 = 2;
        r6 = 1;
        r1 = 0;
        r3 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r9.getTag();
        r0 = (android.support.v7.widget.SuggestionsAdapter.ChildViewCache) r0;
        r2 = r8.mFlagsCol;
        r4 = -1;
        if (r2 == r4) goto L_0x0016;
    L_0x0010:
        r1 = r8.mFlagsCol;
        r1 = r11.getInt(r1);
    L_0x0016:
        r2 = r0.mText1;
        if (r2 == 0) goto L_0x0025;
    L_0x001a:
        r2 = r8.mText1Col;
        r2 = getStringOrNull(r11, r2);
        r4 = r0.mText1;
        r8.setViewText(r4, r2);
    L_0x0025:
        r2 = r0.mText2;
        if (r2 == 0) goto L_0x0062;
    L_0x0029:
        r2 = r8.mText2UrlCol;
        r2 = getStringOrNull(r11, r2);
        if (r2 == 0) goto L_0x00ab;
    L_0x0031:
        r2 = r8.formatUrl(r2);
    L_0x0035:
        r4 = android.text.TextUtils.isEmpty(r2);	 Catch:{ RuntimeException -> 0x00b2 }
        if (r4 == 0) goto L_0x004d;
    L_0x003b:
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b4 }
        if (r4 == 0) goto L_0x005d;
    L_0x003f:
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b6 }
        r5 = 0;
        r4.setSingleLine(r5);	 Catch:{ RuntimeException -> 0x00b6 }
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b6 }
        r5 = 2;
        r4.setMaxLines(r5);	 Catch:{ RuntimeException -> 0x00b6 }
        if (r3 == 0) goto L_0x005d;
    L_0x004d:
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b8 }
        if (r4 == 0) goto L_0x005d;
    L_0x0051:
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b8 }
        r5 = 1;
        r4.setSingleLine(r5);	 Catch:{ RuntimeException -> 0x00b8 }
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b8 }
        r5 = 1;
        r4.setMaxLines(r5);	 Catch:{ RuntimeException -> 0x00b8 }
    L_0x005d:
        r4 = r0.mText2;
        r8.setViewText(r4, r2);
    L_0x0062:
        r2 = r0.mIcon1;	 Catch:{ RuntimeException -> 0x00ba }
        if (r2 == 0) goto L_0x0070;
    L_0x0066:
        r2 = r0.mIcon1;	 Catch:{ RuntimeException -> 0x00ba }
        r4 = r8.getIcon1(r11);	 Catch:{ RuntimeException -> 0x00ba }
        r5 = 4;
        r8.setViewDrawable(r2, r4, r5);	 Catch:{ RuntimeException -> 0x00ba }
    L_0x0070:
        r2 = r0.mIcon2;	 Catch:{ RuntimeException -> 0x00bc }
        if (r2 == 0) goto L_0x007f;
    L_0x0074:
        r2 = r0.mIcon2;	 Catch:{ RuntimeException -> 0x00bc }
        r4 = r8.getIcon2(r11);	 Catch:{ RuntimeException -> 0x00bc }
        r5 = 8;
        r8.setViewDrawable(r2, r4, r5);	 Catch:{ RuntimeException -> 0x00bc }
    L_0x007f:
        r2 = r8.mQueryRefinement;	 Catch:{ RuntimeException -> 0x00be }
        if (r2 == r7) goto L_0x008b;
    L_0x0083:
        r2 = r8.mQueryRefinement;	 Catch:{ RuntimeException -> 0x00c0 }
        if (r2 != r6) goto L_0x00a3;
    L_0x0087:
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x00a3;
    L_0x008b:
        r1 = r0.mIconRefine;	 Catch:{ RuntimeException -> 0x00c4 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ RuntimeException -> 0x00c4 }
        r1 = r0.mIconRefine;	 Catch:{ RuntimeException -> 0x00c4 }
        r2 = r0.mText1;	 Catch:{ RuntimeException -> 0x00c4 }
        r2 = r2.getText();	 Catch:{ RuntimeException -> 0x00c4 }
        r1.setTag(r2);	 Catch:{ RuntimeException -> 0x00c4 }
        r1 = r0.mIconRefine;	 Catch:{ RuntimeException -> 0x00c4 }
        r1.setOnClickListener(r8);	 Catch:{ RuntimeException -> 0x00c4 }
        if (r3 == 0) goto L_0x00aa;
    L_0x00a3:
        r0 = r0.mIconRefine;	 Catch:{ RuntimeException -> 0x00c4 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ RuntimeException -> 0x00c4 }
    L_0x00aa:
        return;
    L_0x00ab:
        r2 = r8.mText2Col;
        r2 = getStringOrNull(r11, r2);
        goto L_0x0035;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SuggestionsAdapter.bindView(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    private Drawable getActivityIcon(ComponentName componentName) {
        PackageManager packageManager = this.mContext.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            try {
                Log.w(z[26], z[27] + iconResource + z[28] + componentName.flattenToShortString());
                return null;
            } catch (NameNotFoundException e) {
                throw e;
            }
        } catch (NameNotFoundException e2) {
            Log.w(z[29], e2.toString());
            return null;
        }
    }

    private Drawable checkIconCache(String str) {
        ConstantState constantState = (ConstantState) this.mOutsideDrawablesCache.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private void updateSpinnerState(Cursor cursor) {
        if (cursor != null) {
            try {
                Bundle extras = cursor.getExtras();
            } catch (RuntimeException e) {
                throw e;
            }
        }
        extras = null;
        if (extras != null) {
            try {
                if (!extras.getBoolean(z[15])) {
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    private Drawable getIcon1(Cursor cursor) {
        try {
            if (this.mIconName1Col == -1) {
                return null;
            }
            Drawable drawableFromResourceValue = getDrawableFromResourceValue(cursor.getString(this.mIconName1Col));
            return drawableFromResourceValue == null ? getDefaultIcon1(cursor) : drawableFromResourceValue;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private Drawable getDrawableFromResourceValue(String str) {
        Drawable checkIconCache;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (!"0".equals(str)) {
                        try {
                            int parseInt = Integer.parseInt(str);
                            String str2 = z[32] + this.mProviderContext.getPackageName() + "/" + parseInt;
                            checkIconCache = checkIconCache(str2);
                            if (checkIconCache != null) {
                                return checkIconCache;
                            }
                            checkIconCache = ContextCompat.getDrawable(this.mProviderContext, parseInt);
                            storeInIconCache(str2, checkIconCache);
                            return checkIconCache;
                        } catch (NumberFormatException e) {
                            checkIconCache = checkIconCache(str);
                            if (checkIconCache != null) {
                                return checkIconCache;
                            }
                            checkIconCache = getDrawable(Uri.parse(str));
                            storeInIconCache(str, checkIconCache);
                            return checkIconCache;
                        } catch (NotFoundException e2) {
                            Log.w(z[33], z[34] + str);
                            return null;
                        }
                    }
                }
            } catch (NumberFormatException e3) {
                throw e3;
            } catch (NumberFormatException e32) {
                try {
                    throw e32;
                } catch (NumberFormatException e322) {
                    throw e322;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.graphics.drawable.Drawable getDrawableFromResourceUri(android.net.Uri r8) {
        /*
        r7 = this;
        r6 = 1;
        r5 = 0;
        r2 = r8.getAuthority();
        r0 = android.text.TextUtils.isEmpty(r2);	 Catch:{ NameNotFoundException -> 0x0029 }
        if (r0 == 0) goto L_0x002b;
    L_0x000c:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NameNotFoundException -> 0x0029 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x0029 }
        r1.<init>();	 Catch:{ NameNotFoundException -> 0x0029 }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x0029 }
        r3 = 40;
        r2 = r2[r3];	 Catch:{ NameNotFoundException -> 0x0029 }
        r1 = r1.append(r2);	 Catch:{ NameNotFoundException -> 0x0029 }
        r1 = r1.append(r8);	 Catch:{ NameNotFoundException -> 0x0029 }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x0029 }
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x0029 }
        throw r0;	 Catch:{ NameNotFoundException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = r7.mContext;	 Catch:{ NameNotFoundException -> 0x005a }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x005a }
        r3 = r0.getResourcesForApplication(r2);	 Catch:{ NameNotFoundException -> 0x005a }
        r1 = r8.getPathSegments();
        if (r1 != 0) goto L_0x0078;
    L_0x003b:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NameNotFoundException -> 0x0058 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x0058 }
        r1.<init>();	 Catch:{ NameNotFoundException -> 0x0058 }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x0058 }
        r3 = 37;
        r2 = r2[r3];	 Catch:{ NameNotFoundException -> 0x0058 }
        r1 = r1.append(r2);	 Catch:{ NameNotFoundException -> 0x0058 }
        r1 = r1.append(r8);	 Catch:{ NameNotFoundException -> 0x0058 }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x0058 }
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x0058 }
        throw r0;	 Catch:{ NameNotFoundException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = move-exception;
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 36;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0078:
        r0 = r1.size();
        if (r0 != r6) goto L_0x00c8;
    L_0x007e:
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ NumberFormatException -> 0x00aa }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x00aa }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00aa }
    L_0x0089:
        if (r0 != 0) goto L_0x00fe;
    L_0x008b:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NameNotFoundException -> 0x00a8 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x00a8 }
        r1.<init>();	 Catch:{ NameNotFoundException -> 0x00a8 }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x00a8 }
        r3 = 35;
        r2 = r2[r3];	 Catch:{ NameNotFoundException -> 0x00a8 }
        r1 = r1.append(r2);	 Catch:{ NameNotFoundException -> 0x00a8 }
        r1 = r1.append(r8);	 Catch:{ NameNotFoundException -> 0x00a8 }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x00a8 }
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x00a8 }
        throw r0;	 Catch:{ NameNotFoundException -> 0x00a8 }
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 38;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00c8:
        r4 = 2;
        if (r0 != r4) goto L_0x00df;
    L_0x00cb:
        r0 = r1.get(r6);
        r0 = (java.lang.String) r0;
        r1 = r1.get(r5);
        r1 = (java.lang.String) r1;
        r0 = r3.getIdentifier(r0, r1, r2);
        r1 = android.support.v7.widget.LinearLayoutCompat.a;	 Catch:{ NameNotFoundException -> 0x00fc }
        if (r1 == 0) goto L_0x0089;
    L_0x00df:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NameNotFoundException -> 0x00fc }
        r1 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x00fc }
        r1.<init>();	 Catch:{ NameNotFoundException -> 0x00fc }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x00fc }
        r3 = 39;
        r2 = r2[r3];	 Catch:{ NameNotFoundException -> 0x00fc }
        r1 = r1.append(r2);	 Catch:{ NameNotFoundException -> 0x00fc }
        r1 = r1.append(r8);	 Catch:{ NameNotFoundException -> 0x00fc }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x00fc }
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x00fc }
        throw r0;	 Catch:{ NameNotFoundException -> 0x00fc }
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r0 = r3.getDrawable(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SuggestionsAdapter.getDrawableFromResourceUri(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private Drawable getActivityIconWithCache(ComponentName componentName) {
        Object obj = null;
        String flattenToShortString = componentName.flattenToShortString();
        if (this.mOutsideDrawablesCache.containsKey(flattenToShortString)) {
            ConstantState constantState = (ConstantState) this.mOutsideDrawablesCache.get(flattenToShortString);
            return constantState == null ? null : constantState.newDrawable(this.mProviderContext.getResources());
        } else {
            Drawable activityIcon = getActivityIcon(componentName);
            if (activityIcon != null) {
                obj = activityIcon.getConstantState();
            }
            this.mOutsideDrawablesCache.put(flattenToShortString, obj);
            return activityIcon;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    private Drawable getDrawable(Uri uri) {
        InputStream openInputStream;
        try {
            if (z[19].equals(uri.getScheme())) {
                return getDrawableFromResourceUri(uri);
            }
            openInputStream = this.mProviderContext.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException(z[16] + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
                return createFromStream;
            } catch (Throwable e) {
                Log.e(z[18], z[22] + uri, e);
                return createFromStream;
            }
        } catch (NotFoundException e2) {
            throw e2;
        } catch (NotFoundException e3) {
            throw new FileNotFoundException(z[24] + uri);
        } catch (FileNotFoundException e4) {
            Log.w(z[17], z[21] + uri + z[23] + e4.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                openInputStream.close();
            } catch (Throwable e5) {
                Log.e(z[25], z[20] + uri, e5);
            }
        }
    }

    public static String getColumnString(Cursor cursor, String str) {
        return getStringOrNull(cursor, cursor.getColumnIndex(str));
    }

    Cursor getSearchManagerSuggestions(SearchableInfo searchableInfo, String str, int i) {
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        String[] strArr;
        Builder fragment = new Builder().scheme(z[43]).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            try {
                fragment.appendEncodedPath(suggestPath);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        fragment.appendPath(z[45]);
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
            strArr = null;
        }
        if (i > 0) {
            try {
                fragment.appendQueryParameter(z[44], String.valueOf(i));
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        return this.mContext.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new ChildViewCache(newView));
        ((ImageView) newView.findViewById(R.id.edit_query)).setImageResource(this.mCommitIconResId);
        return newView;
    }

    private Drawable getDefaultIcon1(Cursor cursor) {
        Drawable activityIconWithCache = getActivityIconWithCache(this.mSearchable.getSearchActivity());
        return activityIconWithCache != null ? activityIconWithCache : this.mContext.getPackageManager().getDefaultActivityIcon();
    }

    private void setViewDrawable(ImageView imageView, Drawable drawable, int i) {
        try {
            imageView.setImageDrawable(drawable);
            if (drawable == null) {
                imageView.setVisibility(i);
                if (!LinearLayoutCompat.a) {
                    return;
                }
            }
            imageView.setVisibility(0);
            drawable.setVisible(false, false);
            drawable.setVisible(true, false);
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        updateSpinnerState(getCursor());
    }

    public CharSequence convertToString(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String columnString = getColumnString(cursor, z[3]);
        if (columnString != null) {
            return columnString;
        }
        if (this.mSearchable.shouldRewriteQueryFromData()) {
            columnString = getColumnString(cursor, z[2]);
            if (columnString != null) {
                return columnString;
            }
        }
        if (!this.mSearchable.shouldRewriteQueryFromText()) {
            return null;
        }
        columnString = getColumnString(cursor, z[4]);
        if (columnString != null) {
            return columnString;
        }
        return null;
    }

    private void storeInIconCache(String str, Drawable drawable) {
        if (drawable != null) {
            try {
                this.mOutsideDrawablesCache.put(str, drawable.getConstantState());
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        if (charSequence == null) {
            try {
                String str = "";
            } catch (RuntimeException e) {
                throw e;
            }
        }
        str = charSequence.toString();
        try {
            if (this.mSearchView.getVisibility() != 0 || this.mSearchView.getWindowVisibility() != 0) {
                return null;
            }
            try {
                Cursor searchManagerSuggestions = getSearchManagerSuggestions(this.mSearchable, str, 50);
                if (searchManagerSuggestions != null) {
                    searchManagerSuggestions.getCount();
                    return searchManagerSuggestions;
                }
            } catch (Throwable e2) {
                Log.w(z[0], z[1], e2);
            }
            return null;
        } catch (RuntimeException e3) {
            throw e3;
        } catch (RuntimeException e32) {
            throw e32;
        }
    }

    private CharSequence formatUrl(CharSequence charSequence) {
        if (this.mUrlColor == null) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
            this.mUrlColor = this.mContext.getResources().getColorStateList(typedValue.resourceId);
        }
        CharSequence spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.mUrlColor, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private void setViewText(TextView textView, CharSequence charSequence) {
        try {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
                if (!LinearLayoutCompat.a) {
                    return;
                }
            }
            textView.setVisibility(0);
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        updateSpinnerState(getCursor());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        try {
            if (tag instanceof CharSequence) {
                this.mSearchView.onQueryRefine((CharSequence) tag);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private Drawable getIcon2(Cursor cursor) {
        try {
            if (this.mIconName2Col == -1) {
                return null;
            }
            return getDrawableFromResourceValue(cursor.getString(this.mIconName2Col));
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w(z[31], z[30], e);
            View newView = newView(this.mContext, this.mCursor, viewGroup);
            if (newView != null) {
                ((ChildViewCache) newView.getTag()).mText1.setText(e.toString());
            }
            return newView;
        }
    }
}
