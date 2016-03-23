package com.whatsapp.gdrive;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Pair;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.VerifyMessageStoreActivity;
import com.whatsapp.arj;
import com.whatsapp.auv;
import com.whatsapp.fieldstats.b6;
import com.whatsapp.fieldstats.bn;
import com.whatsapp.fieldstats.i;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.ab;
import com.whatsapp.util.bf;
import com.whatsapp.util.bq;
import com.whatsapp.util.cs;
import com.whatsapp.util.h;
import com.whatsapp.util.l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class GoogleDriveActivity extends VerifyMessageStoreActivity implements cg, fv {
    private static final String[] O;
    private long A;
    private boolean B;
    private int C;
    private TextView D;
    private long E;
    private final AtomicBoolean F;
    private final ServiceConnection G;
    private final ConditionVariable H;
    private GoogleDriveRestoreAnimationView I;
    @c7
    private int J;
    private final AtomicBoolean K;
    private final bs L;
    private final List M;
    @Nullable
    private c4 N;
    private final ConditionVariable o;
    private GoogleDriveService p;
    private boolean q;
    private String r;
    private final bf s;
    private boolean t;
    private final Set u;
    private boolean v;
    private TextView w;
    private final ConditionVariable x;
    private final bi y;
    private ProgressBar z;

    static {
        String[] strArr = new String[178];
        String str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nX]\u001b\u0013\u0006\u0011R\u001c\u0003\u001a\u0012Z\u0001M\u0000\u0007U\u0016\u0005^\u0013]\u0014\f\u001c\u0010\u001b\u001b\u0005\u0006\u0003F\u0014\f^\u0014X\u001c\u0003\u0018";
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
                        i3 = 119;
                        break;
                    case at.g /*1*/:
                        i3 = 52;
                        break;
                    case at.i /*2*/:
                        i3 = 117;
                        break;
                    case at.o /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 115;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nX[\u001b\u0005^\u0003]\u0018\u0005^\u0004Q\u0001\u0015\u0003WZ\u001a@\u0014\u0018[\u0012\f\u0016WP\u0007\t\u0005\u0012\u0014\u0017\u0001\u0010\u001cA\u0005\u0013S\u0011[\u0000\u000e\u0017WU\u001b\u0004S\u0002G\u0010\u0012S\u0013Q\u0016\t\u0017\u0012PU\u0014\u001cWU\u0011\u0004S\u0016ZU\u0001\u0010\u0014[\u0000\u000e\u0007W[\u0007@\u0014\u001eB\u0010@\u0003\u0012F\u0018\t\u0000\u0004]\u001a\u000eS\u0003[U\u0001\u001dWQ\r\t\u0000\u0003]\u001b\u0007S\u0018Z\u0010N";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nX]\u001b\u0013\u0006\u0011R\u001c\u0003\u001a\u0012Z\u0001M\u0000\u0003[\u0007\u0001\u0014\u0012\u0019\u0013\u000f\u0001ZF\u0010\u0013\u0007\u0018F\u0010O\u0006\u0004Q\u0007M\u0017\u0012W\u001c\u0004\u0016\u0013\u0019\u0001\u000f^\u0001]\u0006\t\u0007ZG\u0001\u000f\u0001\u0016S\u0010M\u0000\u0012@\u0001\t\u001d\u0010G";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0013]\u0006\u0001\u0011\u001bQ\u0011?\u001a\u0003Q\u0018?\u0007\u0018U\u0006\u0014,\u001cQ\f";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXS\u001a\u000f\u0014\u001bQX\u0010\u001f\u0016MX\u0013\u0016\u0005B\u001c\u0003\u0016\u0004\u0019\u001c\u0013^\u0015F\u001a\u000b\u0016\u0019\u001b\u0000\u0013\u0016\u0005\u0019\u0011\u0005\u0010\u001eP\u0010\u0004^\u0003[X\u0013\u0018\u001eD";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZF\u0010\u0013\u0007\u0018F\u0010@\u0006\u0004Q\u0007@\u0017\u0012W\u0019\t\u001d\u0012PU\u0014\u001cWF\u0010\u0013\u0007\u0018F\u0010@\u0015\u0005[\u0018@\u001f\u0018W\u0014\fS\u0015U\u0016\u000b\u0006\u0007";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0016Z\u0011\u0012\u001c\u001eP[\u0013\u0016\u0003@\u001c\u000e\u0014\u0004\u001a<.'2f;!?(g!/!6s0? 2`!)=0g";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "WP\u0010\f\u0016\u0003Q\u0011";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nX[\u001b\u0005^\u0003]\u0018\u0005^\u0004Q\u0001\u0015\u0003Z@\u0014\u000b\u001a\u0019SX\u0014\u001c\u0018\u0019\u0019\u000f\u001d\u0010\u001b\u0000\u0013\u0016\u0005\u0019\u0011\u0005\u0010\u001eP\u0010\u0004^\u0003[X\u0017\u0012\u001e@";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZY\u0006\u0007\u0000\u0003[\u0007\u0005^\u0013[\u0002\u000e\u001f\u0018U\u0011\t\u001d\u0010\u0019\u0003\t\u0016\u0000\u001b\u0007\u0005\u0000\u0003[\u0007\u0005^\u0011U\u001c\f\u0016\u0013\u0014";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXR\u0014\t\u001f\u0012PX\u0014\u001cZF\u0010\u0013\u0007\u0018F\u0010M\u0015\u0005[\u0018M\u0000\u0012X\u0010\u0003\u0007\u0012PX\u0002\u0012\u0014_\u0000\u0010";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0003]\u0001\f\u0016";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "WQ\r\t\u0000\u0003GU\u0002\u0006\u0003\u0014\u0016\u0001\u001d\u0019[\u0001@\u0011\u0012\u0014\u0011\u0005\u001f\u0012@\u0010\u0004_WY\u0010\u0013\u0000\u0016S\u0010@\u0001\u0012G\u0001\u000f\u0001\u0012\u0014\u0018\t\u0014\u001f@U\u0006\u0012\u001eX";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZY\u0006\u0007\u0000\u0003[\u0007\u0005^\u0013[\u0002\u000e\u001f\u0018U\u0011\t\u001d\u0010\u0019\u0003\t\u0016\u0000\u001b\u0007\u0005\u0000\u0003[\u0007\u0005^\u0011U\u001c\f\u0016\u0013\u0014";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0002Z\u0010\u0018\u0003\u0012W\u0001\u0005\u0017WP\u001c\u0001\u001f\u0018SU\u0002\u001c\u000f\u000eU";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXF\u0010\u0013\u0007\u0018F\u0010M\u001e\u0012P\u001c\u0001^\u0018ZX\u0003\u0016\u001bX\u0000\f\u0012\u0005\u0019\u0011\t\u0012\u001b[\u0012LS ]X&\u001aWA\u001b\u0001\u0005\u0016]\u0019\u0001\u0011\u001bQU\u0001\u001d\u0013\u0014\u0000\u0013\u0016\u0005\u0014\u0011\u0005\u0010\u001b]\u001b\u0005\u0017W@\u001a@\u0001\u0012G\u0001\u000f\u0001\u0012\u0014\u0018\u0005\u0017\u001eUU\u000f\u001dWW\u0010\f\u001f\u0002X\u0014\u0012]";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0013]\u0014\f\u001c\u0010k\u001c\u0004";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0014[\u0018N\u0014\u0018[\u0012\f\u0016";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u001aA\u0019\u0014\u001a(X\u001c\u000e\u0016(X\u001c\u0013\u0007(]\u0001\u0005\u001e(B\u0014\f\u0006\u0012G*\u000b\u0016\u000e";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXA\u0006\u0005\u0001ZW\u001a\u000e\u0015\u001eF\u0018\u0005\u0017ZG\u001e\t\u0003ZF\u0010\u0013\u0007\u0018F\u0010";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001aA\u0019\u0014\u001a(X\u001c\u000e\u0016(X\u001c\u0013\u0007(]\u0001\u0005\u001e\u0004k\u001e\u0005\n";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001b]\u0006\u0014,\u001e@\u0010\r,\u0012Z\u0014\u0002\u001f\u0012P*\u000b\u0016\u000e";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXU\u0013\u0014\u0016\u0005\u0019\u0018\u0013\u0014\u0004@\u001a\u0012\u0016ZB\u0010\u0012\u001a\u0011]\u0010\u0004\\\u0004@\u0014\u0014\u0016Z]\u0006M\u001e\u0004S\u0006\u0014\u001c\u0005QX\u0012\u0016\u0004@\u001a\u0012\u0016\u0013\u001b\u0016\u0001\u001f\u001b\u0019\u001c\u0007\u001d\u0018F\u0010\u0004S";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0007[\u0006\t\u0007\u001eB\u0010?\u0011\u0002@\u0001\u000f\u001d";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0019Q\u0012\u0001\u0007\u001eB\u0010?\u0011\u0002@\u0001\u000f\u001d";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u001aQ\u0006\u0013\u0012\u0010Q";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0014U\u001b\u0003\u0016\u001bU\u0017\f\u0016";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXU\u0013\u0014\u0016\u0005\u0019\u0018\u0013\u0014\u0004@\u001a\u0012\u0016ZB\u0010\u0012\u001a\u0011]\u0010\u0004\\\u0011U\u001c\f\u0016\u0013\u001b\u0000\u000e\u0001\u0012G\u0001\u000f\u0001\u0016V\u0019\u0005^\u001b[\u0016\u0001\u001fZV\u0014\u0003\u0018\u0002D";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXU\u0013\u0014\u0016\u0005\u0019\u0018\u0013\u0014\u0004@\u001a\u0012\u0016ZB\u0010\u0012\u001a\u0011]\u0010\u0004\\";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0013]\u0014\f\u001c\u0010k\u001c\u0004";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXU\u0013\u0014\u0016\u0005\u0019\u0018\u0013\u0014\u0004@\u001a\u0012\u0016ZB\u0010\u0012\u001a\u0011]\u0010\u0004\\\u0011U\u001c\f\u0016\u0013\u001b\u0000\u000e\u0001\u0012G\u0001\u000f\u0001\u0016V\u0019\u0005^\u0010P\u0007\t\u0005\u0012\u0019\u0017\u0001\u0010\u001cA\u0005O";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0014[\u0018N\u0014\u0018[\u0012\f\u0016";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0014[\u0018N\u0004\u001fU\u0001\u0013\u0012\u0007D*\u0010\u0001\u0012R\u0010\u0012\u0016\u0019W\u0010\u0013";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nX]\u0006M\u001d\u0012CX\n\u001a\u0013\u001b";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0019Q\u0002?\u0019\u001eP";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0014[\u0018N\u0004\u001fU\u0001\u0013\u0012\u0007D*\u0010\u0001\u0012R\u0010\u0012\u0016\u0019W\u0010\u0013";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0010P\u0007\t\u0005\u0012k\u0014\u0010\u0003\u0005[\r?\u001e\u0012P\u001c\u0001,\u0013[\u0002\u000e\u001f\u0018U\u0011?\u0000\u001eN\u0010";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXY\u0006\u0007\u0000\u0003[\u0007\u0005^\u0013[\u0002\u000e\u001f\u0018U\u0011M\u0015\u001eZ\u001c\u0013\u001b\u0012PU\u0017\u001a\u0003\\U\u0013\u0006\u0014W\u0010\u0013\u0000M\u0014";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "[\u0014\u001b\u000f\u0004[\u0014\u0007\u0005\u0000\u0003[\u0007\t\u001d\u0010\u0014\u001c\u0014]";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nX[\u001b\u0005^\u0003]\u0018\u0005^\u0004Q\u0001\u0015\u0003";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0014[\u0018N\u0014\u0018[\u0012\f\u0016";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nX[\u001b\u0005^\u0003]\u0018\u0005^\u0004Q\u0001\u0015\u0003Wu64:8z*3;8c*26$`:26({;%,#}8%,$q!5#WW\u0014\f\u001f\u0012P";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0016Z\u0011\u0012\u001c\u001eP[\u0010\u0016\u0005Y\u001c\u0013\u0000\u001e[\u001bN42`*!04{ .'$";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXD\u0010\u0012\u0015\u0018F\u0018M\u001c\u0019QX\u0014\u001a\u001aQX\u0013\u0016\u0003A\u0005";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0007Q\u0007\u0006\u001c\u0005YX\u000f\u001d\u0012\u0019\u0001\t\u001e\u0012\u0019\u0006\u0005\u0007\u0002D";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nX[\u001b\u0005^\u0003]\u0018\u0005^\u0004Q\u0001\u0015\u0003";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXF\u0010\u0013\u0007\u0018F\u0010M\u001e\u0012P\u001c\u0001";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0016W\u0001\t\u001c\u0019k\u0007\u0005\u0000\u0003[\u0007\u0005,\u001aQ\u0011\t\u0012";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0007[\u0006\t\u0007\u001eB\u0010?\u0011\u0002@\u0001\u000f\u001d";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0019Q\u0012\u0001\u0007\u001eB\u0010?\u0011\u0002@\u0001\u000f\u001d";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u001aQ\u0006\u0013\u0012\u0010Q";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    str = "\u0013]\u0014\f\u001c\u0010k\u001c\u0004";
                    obj = 51;
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    strArr2 = strArr3;
                    str = "\u0014U\u001b\u0003\u0016\u001bU\u0017\f\u0016";
                    obj = 52;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXF\u0010\u0013\u0006\u001aQ";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0003\u001a\u0013QU,\u001c\u0014U\u0019@\u001e\u0012G\u0006\u0001\u0014\u0012\u0014\u0017\u0001\u0010\u001cA\u0005@\u001b\u0016GU\u0013\u0012\u001aQU\r\u0017B\u0014\u0014\u0013S\u0010[\u001a\u0007\u001f\u0012\u0014\u0011\u0012\u001a\u0001Q[";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0016\u001a\u0014QU\u0015\u001d\u0016V\u0019\u0005S\u0003[U\u0001\u0010\u0014Q\u0006\u0013S\u001b[\u0016\u0001\u001fWV\u0014\u0003\u0018\u0002D";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0003\u001a\u0013QU\r\u0012\u001c]\u001b\u0007S\u0016\u0014\u0007\u0005\u0002\u0002Q\u0006\u0014S\u0003[U\u0006\u0016\u0003W\u001d@\u001f\u0016G\u0001@\u001e\u0018P\u001c\u0006\u001a\u0012PU\u0014\u001a\u001aQ\u0006\u0014\u0012\u001aDU\u000f\u0015WF\u0010\r\u001c\u0003QU\u0004\u0011WR\u001c\f\u0016Y";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0003\u001a\u0013QU'\u001c\u0018S\u0019\u0005S3F\u001c\u0016\u0016W\u001c\u0001\t\u001e\u0012G\u0001\u0001\u001e\u0007\u0014";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "[\u0014\u0001\t\u001e\u0012\u000eU";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0003\u001a\u0013QU\u0012\u0016\u001a[\u0001\u0005S\u0013V3\t\u001f\u0012\u0014\u0011\u000f\u0016\u0004\u0014\u001b\u000f\u0007WQ\r\t\u0000\u0003";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "[\u0014\u0001\t\u001e\u0012\u000eU";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0003\u001a\u0013QU\f\u001c\u0014U\u0019@\u0011\u0016W\u001e\u0015\u0003WR\u001c\f\u0016W\u001c\u0001\t\u001e\u0012G\u0001\u0001\u001e\u0007\u0014";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0003\u001a\u0013QU\u0012\u0016\u001a[\u0001\u0005S\u0013V3\t\u001f\u0012\u0014\u0011\u000f\u0016\u0004\u0014\u001b\u000f\u0007WQ\r\t\u0000\u0003";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "[\u0014\u0001\t\u001e\u0012\u000eU";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "[\u0014\u0001\t\u001e\u0012\u000eU";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "^\u0014\u0014\u000e\u0017W@\u001d\u0005S\u0003C\u001a@\u0015\u001eX\u0010\u0013S\u0016F\u0010@\u0017\u001eR\u0013\u0005\u0001\u0012Z\u0001@\u0012\u0004\u0014\u0002\u0005\u001f\u001b\u0018U\u0014\u001b\u0012F\u0010\u0006\u001c\u0005QY@\u0004\u0012\u0014\u0002\t\u001f\u001b\u0014\u0000\u0013\u0016W@\u001d\u0005S\u001b[\u0016\u0001\u001f";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "^\u0014\u001c\u0013S\u0019Q\u0002\u0005\u0001W@\u001d\u0001\u001dWX\u001a\u0003\u0012\u001b\u0014\u0018\u0005\u0000\u0004U\u0012\u0005S\u0015U\u0016\u000b\u0006\u0007\u0014]\u0014\u001a\u001aQ\u0006\u0014\u0012\u001aDU";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "^\u0014\u0014\u000e\u0017W]\u0006@\u001d\u0012C\u0010\u0012S\u0003\\\u0014\u000eS\u0018Z\u0010@\u001c\u0019\u00142\u000f\u001c\u0010X\u0010@7\u0005]\u0003\u0005S_@\u001c\r\u0016\u0004@\u0014\r\u0003W";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0003\u001a\u0013QZ\u0006\u0012\u001eX\u0010\u0004^\u0003[X\u0006\u0016\u0003W\u001dM\u0017\u0015R\u001c\f\u0016";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0003\u001a\u0013QU\f\u001c\u0014U\u0019@\u001e\u0004S\u0006\u0014\u001c\u0005QU\u0005\u000b\u001eG\u0001\u0013S\u0015A\u0001@\u001a\u0004\u0014\u0010\r\u0003\u0003M[";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0003\u001a\u0013QZ\u0012\u0016\u001a[\u0001\u0005^\u0013VX\u0012\u0016\u0004}\u0011M\u001a\u0004\u0019\u001b\u0015\u001f\u001b";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0003\u001a\u0013QU\f\u001c\u0014U\u0019@\u001e\u0004S\u0006\u0014\u001c\u0005QU\u0004\u001c\u0012GU\u000e\u001c\u0003\u0014\u0010\u0018\u001a\u0004@U\u000f\u0001W]\u0006@\u0006\u0019A\u0006\u0001\u0011\u001bQ";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXU\u0016\u0014\u001a\u0001]\u0001\u0019^\u0005Q\u0006\u0015\u001f\u0003\u001b\u0014\u0003\u0010\u0018A\u001b\u0014^\u0016P\u0011\u0005\u0017ZF\u0010\u0011\u0006\u0012G\u0001O";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "\u0016A\u0001\b\u0007\u0018_\u0010\u000e";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXU\u0016\u0014\u001a\u0001]\u0001\u0019^\u0005Q\u0006\u0015\u001f\u0003\u001b\u0014\u0003\u0010\u0018A\u001b\u0014^\u0007]\u0016\u000b\u0016\u0005\u0019\u0007\u0005\u0002\u0002Q\u0006\u0014\\";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXU\u0016\u0014\u001a\u0001]\u0001\u0019^\u0005Q\u0006\u0015\u001f\u0003\u001b\u0014\u0003\u0010\u0018A\u001b\u0014^\u0007]\u0016\u000b\u0016\u0005\u0019\u0007\u0005\u0007\u0002F\u001b\u0005\u0017ZZ\u0000\f\u001fZU\u0016\u0003\u001c\u0002Z\u0001";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u0016W\u0001\t\u001c\u0019k\u0006\b\u001c\u0000k\u0007\u0005\u0000\u0003[\u0007\u0005,\u0018Z\u0010?\u0007\u001eY\u0010?\u0000\u0012@\u0000\u0010";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "\u0016A\u0001\b2\u0014W\u001a\u0015\u001d\u0003";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXU\u0000\u0014\u001bZF\u0010\u0011\u0006\u0012G\u0001@\u0012\u0014W\u001a\u0015\u001d\u0003\u0014\u0017\u0005\u001a\u0019SU\u0015\u0000\u0012PU\t\u0000W";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXU\u0000\u0014\u001bZF\u0010\u0011\u0006\u0012G\u0001@\u0011\u001b[\u0016\u000b\u001a\u0019SU\u000f\u001dW@\u001a\u000b\u0016\u0019f\u0010\u0003\u0016\u001eB\u0010\u0004";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u0014\u0016\u0016ZS\u0011\u0012\u001a\u0001QX\r\u0016\u0013]\u0014M\u0017\u0018C\u001b\f\u001c\u0016PX\u0014\u0001\u0016Z\u0006\u0006\u0016\u0005\u0019\u0006\t\t\u0012\u001b";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u0014[\u0018N\u0004\u001fU\u0001\u0013\u0012\u0007D*\u0010\u0001\u0012R\u0010\u0012\u0016\u0019W\u0010\u0013";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0010P\u0007\t\u0005\u0012k\u0014\u0010\u0003\u0005[\r?\u001e\u0012P\u001c\u0001,\u0013[\u0002\u000e\u001f\u0018U\u0011?\u0000\u001eN\u0010";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u0014\u0016\u0016ZS\u0011\u0012\u001a\u0001QX\r\u0016\u0013]\u0014M\u0017\u0018C\u001b\f\u001c\u0016PX\u0014\u0001\u0016Z\u0006\u0006\u0016\u0005\u0019\u0006\t\t\u0012\u001b\u0013\u0001\u001a\u001bQ\u0011";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZZ\u0010\u0017^\u0002G\u0010\u0012^\u0004Q\u0001\u0014\u001a\u0019S\u0006";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "\"Z\u0010\u0018\u0003\u0012W\u0001\u0005\u0017WQ\u0007\u0012\u001c\u0005";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u001c\u0013\u0003\u001bU\fM\u001e\u0004S\u0006\u0014\u001c\u0005QX\u0004\u001c\u0000Z\u0019\u000f\u0012\u0013\u0019\u0010\u0012\u0001\u0018FZ\u0015\u001d\u001fU\u001b\u0004\u001f\u0012PX\u0005\u0001\u0005[\u0007O";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u001c\u0013\u0003\u001bU\fM\u001e\u0004S\u0006\u0014\u001c\u0005QX\u0004\u001c\u0000Z\u0019\u000f\u0012\u0013\u0019\u0010\u0012\u0001\u0018FU\u0006\u0012\u001eX\u0010\u0004S\u0003[U\u0004\u001a\u0004D\u0019\u0001\nWQ\u0007\u0012\u001c\u0005\u0014";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "WP\u001a\u0017\u001d\u001b[\u0014\u0004IW";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "WG\u001c\u000e\u0010\u0012\u00144\u0003\u0007\u001eB\u001c\u0014\nW]\u0006@\u0012\u0015[\u0000\u0014S\u0003[U\u0006\u001a\u0019]\u0006\b]";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "WP\u001a\u0017\u001d\u001b[\u0014\u0004\u0016\u0013\u0014\u0016\u0001\u001d\u0019[\u0001@\u0011\u0012\u0014\u0018\u000f\u0001\u0012\u0014\u0001\b\u0012\u0019\u0014\u0001\u000f\u0007\u0016X[";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "W@\u001a\u0014\u0012\u001b\u000eU";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nZ[\u0017\u0013\u0016\u0005B\u0010\u0012\\\u0013]\u0006\u0010\u001f\u0016MX\r\u0000\u0010G\u0001\u000f\u0001\u0012\u0019\u0011\u000f\u0004\u0019X\u001a\u0001\u0017ZQ\u0007\u0012\u001c\u0005\u001b";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u001c\u0013\u0003\u001bU\fM\u001e\u0004S\u0006\u0014\u001c\u0005QX\u0004\u001c\u0000Z\u0019\u000f\u0012\u0013\u0019\u0010\u0012\u0001\u0018FZ";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u001c\u0013\u0003\u001bU\fM\u001e\u0004S\u0006\u0014\u001c\u0005QX\u0004\u001c\u0000Z\u0019\u000f\u0012\u0013\u0019\u0010\u0012\u0001\u0018FZ\u0015\u001d\u0012L\u0005\u0005\u0010\u0003Q\u0011O";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    str = "\u0018Z\u0010M\u0007\u001eY\u0010M\u0000\u0012@\u0000\u0010^\u0003U\u001e\t\u001d\u0010\u0019\u0001\u000f\u001cZX\u001a\u000e\u0014";
                    obj = 95;
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    strArr2 = strArr3;
                    str = "\u0007[\u0006\t\u0007\u001eB\u0010?\u0011\u0002@\u0001\u000f\u001d";
                    obj = 96;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "\u0014U\u001b\u0003\u0016\u001bU\u0017\f\u0016";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "\u0019Q\u0012\u0001\u0007\u001eB\u0010?\u0011\u0002@\u0001\u000f\u001d";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "\u0013]\u0014\f\u001c\u0010k\u001c\u0004";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "\u001aQ\u0006\u0013\u0012\u0010Q";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXF\u0010\u0013\u0007\u0018F\u0010M\u001e\u0012G\u0006\u0001\u0014\u0012G";
                    obj = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "\u0016W\u0001\t\u001c\u0019k\u0007\u0005\u0000\u0003[\u0007\u0005";
                    obj = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "\u0016W\u0001\t\u0005\u001e@\f?\u0000\u0003U\u0001\u0005";
                    obj = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u0014\u0016\u0016ZG\u0001\u0001\u0007\u0012\u001b\u0018\u0005\u0017\u001eUX\u0004\u001c\u0000Z\u0019\u000f\u0012\u0013\u0019\u0006\t\t\u0012\u001b";
                    obj = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u0014\u0016\u0016ZG\u0001\u0001\u0007\u0012\u001b\u0007\u0005\u0000\u0003[\u0007\u0005^\u0016W\u0016\u000f\u0006\u0019@X\u0004\u0012\u0003UZ@";
                    obj = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u0014\u0016\u0016ZG\u0001\u0001\u0007\u0012\u001b\u0001\u000f\u0007\u0016XX\u0004\u001c\u0000Z\u0019\u000f\u0012\u0013\u0019\u0006\t\t\u0012\u001b";
                    obj = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "\u0003[\u0001\u0001\u001f(P\u001a\u0017\u001d\u001b[\u0014\u0004,\u0004]\u000f\u0005";
                    obj = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "\u0005Q\u0006\u0014\u001c\u0005Q*\u0001\u0010\u0014[\u0000\u000e\u0007(P\u0014\u0014\u0012";
                    obj = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "\u001aQ\u0011\t\u0012(P\u001a\u0017\u001d\u001b[\u0014\u0004,\u0004]\u000f\u0005";
                    obj = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u0014\u0016\u0016ZG\u0001\u0001\u0007\u0012\u001b";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "KA\u001b\u0013\u0016\u0003\u0014\u0014\u0003\u0010\u0018A\u001b\u0014M";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZF\u0010\u0013\u0007\u0018F\u0010@\u0006\u0004Q\u0007@\u0017\u0012W\u0019\t\u001d\u0012PU\u0014\u001cWF\u0010\u0013\u0007\u0018F\u0010@\u0011\u0016W\u001e\u0015\u0003WR\u0007\u000f\u001eW";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZF\u0010\u0013\u0007\u0018F\u0010O\u0000\u0003[\u0005\u0010\u001a\u0019SX\u0001\u0003\u0007F\u001a\u0018^\u0003F\u0014\u000e\u0000\u0011Q\u0007M\u0000\u001eN\u0010M\u0010\u0016X\u0016M\u0007\u001fF\u0010\u0001\u0017";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZF\u0010\u0013\u0007\u0018F\u0010M\u0015\u0018FX\f\u001c\u0014U\u0019M\u0011\u0016W\u001e\u0015\u0003";
                    obj = 114;
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    strArr2 = strArr3;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZF\u0010\u0013\u0007\u0018F\u0010M\u0015\u0018FX\u0007\u0017\u0005]\u0003\u0005^\u0015U\u0016\u000b\u0006\u0007\u001b";
                    obj = 115;
                    break;
                case 115:
                    strArr2[i] = str;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZF\u0010\u0013\u0007\u0018F\u0010O";
                    obj = 116;
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    strArr2 = strArr3;
                    str = "\u0016Z\u0011\u0012\u001c\u001eP[\t\u001d\u0003Q\u001b\u0014]\u0014U\u0001\u0005\u0014\u0018F\fN;8y0";
                    obj = 117;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = "\u0016Z\u0011\u0012\u001c\u001eP[\t\u001d\u0003Q\u001b\u0014]\u0016W\u0001\t\u001c\u0019\u001a8!:9";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXY\u0006\u0007^\u0005Q\u0006\u0014\u001c\u0005QX\u0010\u0001\u0018S\u0007\u0005\u0000\u0004\u001b";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXU\u0013\u0014\u0016\u0005\u0019\u0018\u0013\u0014\u0004@\u001a\u0012\u0016ZB\u0010\u0012\u001a\u0011]\u0010\u0004\\W";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXS\u0010\u0014^\u0015Q\u0006\u0014^\u0015U\u0006\u0005^\u0011[\u0019\u0004\u0016\u0005\u001b\u0000\u000e\u0012\u0015X\u0010M\u0007\u0018\u0019\u0012\u0005\u0007ZR\u001c\f\u0016ZX\u001c\u0013\u0007W\u001c\u0005\u0012\u001c\u0015U\u0017\f\nWUU\u000e\u0016\u0003C\u001a\u0012\u0018WQ\u0007\u0012\u001c\u0005\u000b\\";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXS\u0010\u0014^\u0015Q\u0006\u0014^\u0015U\u0006\u0005^\u0011[\u0019\u0004\u0016\u0005\u001b\u0013\u0001\u001a\u001bQ\u0011M\u0007\u0018\u0019\u0012\u0005\u0007ZS\u0011\u0012\u001a\u0001QX\u0006\u001a\u001bQX\r\u0012\u0007\u0014\u0017\u0001\u0000\u0012\u0014\u0013\u000f\u001f\u0013Q\u0007Z";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "\u0010P\u0007\t\u0005\u0012k\u0013\t\u001f\u0012k\u0018\u0001\u0003(]\u0011";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXS\u0010\u0014^\u0015Q\u0006\u0014^\u0015U\u0006\u0005^\u0011[\u0019\u0004\u0016\u0005\u001b\u001b\u000f^\u0015U\u0006\u0005^\u0011[\u0019\u0004\u0016\u0005\u0019\u0013\u000f\u0006\u0019PY@\u001f\u0018[\u001e\t\u001d\u0010\u0014\u0013\u000f\u0001W[\u0019\u0004\u0016\u0005\u0014\u0017\u0001\u0000\u0012\u0014\u0013\u000f\u001f\u0013Q\u0007\u0013S\u0000]\u0001\bS\u0019U\u0018\u0005S";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = "W\\\u0014\u0013S";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = "\u0010P\u0007\t\u0005\u0012k\u0013\t\u001f\u0012k\u0018\u0001\u0003";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXS\u0010\u0014^\u0015Q\u0006\u0014^\u0015U\u0006\u0005^\u0011[\u0019\u0004\u0016\u0005\u0014";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "\u0016D\u0005$\u0012\u0003U3\u000f\u001f\u0013Q\u0007";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = "\u0010P\u0007\t\u0005\u0012k\u0013\t\u001f\u0012k\u0018\u0001\u0003";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = "WC\u001c\u0014\u001bWS\u0011\u0012\u001a\u0001Q3\t\u001f\u0012y\u0014\u0010S";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = "\u0010P\u0007\t\u0005\u0012k\u0013\t\u001f\u0012k\u0018\u0001\u0003";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXS\u0010\u0014^\u0015Q\u0006\u0014^\u0015U\u0006\u0005^\u0011[\u0019\u0004\u0016\u0005\u001b\u0005\u0012\u001c\u0007Q\u0007\u0014\nZR\u001a\u0015\u001d\u0013\u0019\u0017\u0015\u0007ZR\u001c\f\u0016ZZ\u001a\u0014^\u0011[\u0000\u000e\u0017W";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXS\u0010\u0014^\u0015Q\u0006\u0014^\u0015U\u0006\u0005^\u0011[\u0019\u0004\u0016\u0005\u001b\u0005\u0012\u001a\u001aU\u0007\u0019^\u0015U\u0006\u0005^\u0011[\u0019\u0004\u0016\u0005\u0019\u001b\u0001\u001e\u0012\u0019\u001c\u0013^\u0019A\u0019\f";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXS\u0010\u0014^\u0015Q\u0006\u0014^\u0015U\u0006\u0005^\u0011[\u0019\u0004\u0016\u0005\u0014\u0013\t\u001d\u0016XU\u0002\u0012\u0004Q3\u000f\u001f\u0013Q\u0007@\u001a\u0004\u0014";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "\u0010P\u0007\t\u0005\u0012k\u0013\t\u001f\u0012k\u0018\u0001\u0003";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "\u0010P\u0007\t\u0005\u0012k\u0013\t\u001f\u0012k\u0018\u0001\u0003";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXA\u0005\u0004\u0012\u0003QX\u0012\u0016\u0004@\u001a\u0012\u0016Z]\u001b\u0006\u001cX\u0014\u0001\u000f\u0007\u0016XU\u0004\u001c\u0000Z\u0019\u000f\u0012\u0013\u0014\u0006\t\t\u0012\u000eU";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = "WY\u0010\u0004\u001a\u0016\u0014\u0011\u000f\u0004\u0019X\u001a\u0001\u0017WG\u001c\u001a\u0016M\u0014";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXA\u0006\u0005\u0001ZP\u001c\u0013\u001e\u001eG\u0006\u0005\u0017ZU\u0016\u0003\u001c\u0002Z\u0001M\u0000\u0012X\u0010\u0003\u0007\u0018FX\u0004\u001a\u0016X\u001a\u0007^\u0013]\u0006\r\u001a\u0004G\u0010\u0004";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = "\"Z\u0010\u0018\u0003\u0012W\u0001\u0005\u0017WP\u001c\u0001\u001f\u0018SU\t\u0017M";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = "\u0016A\u0001\b2\u0014W\u001a\u0015\u001d\u0003";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = "W]\u001b\u0004\u0016\u000f\u000e";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = "\u0014[\u0018N\u0014\u0018[\u0012\f\u0016";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    i = 145;
                    str = "\"Z\u0010\u0018\u0003\u0012W\u0001\u0005\u0017WP\u001c\u0001\u001f\u0018S<\u0004IW";
                    obj = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i] = str;
                    i = 146;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZU\u0016\u0003\u001c\u0002Z\u0001\u0013\\\u0000U\u001c\u0014\u001a\u0019SX\u0006\u001c\u0005\u0019\u0014\u0004\u0017ZU\u0016\u0003\u001c\u0002Z\u0001M\u0012\u0014@\u001c\u0016\u001a\u0003MX\u0014\u001cZF\u0010\u0014\u0006\u0005Z";
                    obj = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i] = str;
                    i = 147;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXG\u001d\u000f\u0004ZY\u0006\u0007\u0000\u0003[\u0007\u0005^\u0013[\u0002\u000e\u001f\u0018U\u0011\t\u001d\u0010\u0019\u0003\t\u0016\u0000";
                    obj = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i] = str;
                    i = 148;
                    str = "\u0005Q\u0006\u0014\u001c\u0005Q*\u0001\u0010\u0014[\u0000\u000e\u0007(P\u0014\u0014\u0012WW\u0014\u000e\u001d\u0018@U\u0002\u0016WZ\u0000\f\u001f";
                    obj = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i] = str;
                    i = 149;
                    str = "\u0005Q\u0006\u0014\u001c\u0005Q*\u0001\u0010\u0014[\u0000\u000e\u0007(P\u0014\u0014\u0012WW\u0014\u000e\u001d\u0018@U\u0002\u0016WZ\u0000\f\u001f";
                    obj = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i] = str;
                    i = 150;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXZ\u001aM\u0014\u0018[\u0012\f\u0016ZP\u0007\t\u0005\u0012\u0019\u0014\u0003\u0010\u0012G\u0006M\u0003\u0018G\u0006\t\u0011\u001bQ";
                    obj = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i] = str;
                    i = 151;
                    str = "\u0005Q\u0006\u0014\u001c\u0005Q*\u0001\u0010\u0014[\u0000\u000e\u0007(P\u0014\u0014\u0012";
                    obj = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i] = str;
                    i = 152;
                    str = "\"Z\u001e\u000e\u001c\u0000ZU\u0013\u0007\u0016@\u0010ZS";
                    obj = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i] = str;
                    i = 153;
                    str = "\u0016W\u0001\t\u0005\u001e@\f?\u0000\u0003U\u0001\u0005";
                    obj = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i] = str;
                    i = 154;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXW\u0007\u0005\u0012\u0003QZ\u0013\u0007\u0016@\u0010O";
                    obj = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i] = str;
                    i = 155;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXW\u0007\u0005\u0012\u0003Q";
                    obj = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i] = str;
                    i = 156;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXW\u0007\u0005\u0012\u0003QU\u000e\u001cWU\u0016\u0014\u001a\u0018ZU\u0010\u0001\u0018B\u001c\u0004\u0016\u0013\u001a";
                    obj = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i] = str;
                    i = 157;
                    str = "\u0005Q\u0006\u0014\u001c\u0005QX\u0006\u0001\u0018YX\f\u001c\u0014U\u0019";
                    obj = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i] = str;
                    i = 158;
                    str = "\u0019Q\u0002";
                    obj = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i] = str;
                    i = 159;
                    str = "\u0005Q\u0006\u0014\u001c\u0005]\u001b\u0007^\u0011F\u001a\r^\u001b[\u0016\u0001\u001f";
                    obj = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i] = str;
                    i = 160;
                    str = "\u0005Q\u0001\u0015\u0001\u0019\u0019\u0013\u0012\u001c\u001a\u0019\u0014\u0015\u0007\u001f";
                    obj = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i] = str;
                    i = 161;
                    str = "\"Z\u001e\u000e\u001c\u0000ZU\u0013\u0007\u0016@\u0010ZS";
                    obj = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i] = str;
                    i = 162;
                    str = "\u0005Q\u0006\u0014\u001c\u0005QX\u0006\u0001\u0018YX\u0007\u0017\u0005]\u0003\u0005";
                    obj = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i] = str;
                    i = 163;
                    str = "\u0005Q\u0006\u0014\u001c\u0005]\u001b\u0007^\u0011F\u001a\r^\u0010P\u0007\t\u0005\u0012";
                    obj = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i] = str;
                    i = 164;
                    str = "\u001aG\u0012\u0013\u0007\u0018F\u0010M\u0001\u0012G\u0001\u000f\u0001\u0012P";
                    obj = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i] = str;
                    i = 165;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u0010\u0013\u0007\u0005[\f";
                    obj = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i] = str;
                    i = 166;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXW\u0007\u0005\u0012\u0003QZ\r\u0000\u0010G\u0001\u000f\u0001\u0012\u0019\u0011\u000f\u0004\u0019X\u001a\u0001\u0017ZU\u0019\u0012\u0016\u0016P\fM\u0015\u001eZ\u001c\u0013\u001b\u0012PY@\u0001\u0012G\u0001\u000f\u0001\u001eZ\u0012";
                    obj = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i] = str;
                    i = 167;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXS\u001a\u000f\u0014\u001bQX\u0010\u001f\u0016MX\u0013\u0016\u0005B\u001c\u0003\u0016ZA\u001b\u0001\u0005\u0016]\u0019\u0001\u0011\u001bQZ\u0005\u000b\u001eG\u0001\t\u001d\u0010\u0019\u0000\u0013\u0016\u0005";
                    obj = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i] = str;
                    i = 168;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXW\u0007\u0005\u0012\u0003QZ\u0003\u001c\u0019@\u001c\u000e\u0006\u0012\u0019\u0018\u0013\u0014\u0004@\u001a\u0012\u0016ZP\u001a\u0017\u001d\u001b[\u0014\u0004";
                    obj = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i] = str;
                    i = 169;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXZ\u0010\u0017^\u001eZ\u0001\u0005\u001d\u0003\u0014\u0000\u000e\u0016\u000fD\u0010\u0003\u0007\u0012PU\u0001\u0010\u0003]\u001a\u000eIW";
                    obj = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i] = str;
                    i = 170;
                    str = "\u0016W\u0001\t\u001c\u0019k\u0006\b\u001c\u0000k\u0007\u0005\u0000\u0003[\u0007\u0005,\u0018Z\u0010?\u0007\u001eY\u0010?\u0000\u0012@\u0000\u0010";
                    obj = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i] = str;
                    i = 171;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXP\u001c\u0001\u001f\u0018SX\u000e\u0016\u0010U\u0001\t\u0005\u0012\u0019\u0016\f\u001a\u0014_Z\u0004\u001a\u0016X\u001a\u0007^\u001ePZ";
                    obj = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i] = str;
                    i = 172;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXY\u0006\u0007\u0000\u0003[\u0007\u0005^\u0013[\u0002\u000e\u001f\u0018U\u0011M\u0015\u001eZ\u001c\u0013\u001bWG\u0010\u0014\u0007\u001eZ\u0012@\u0001\u0012G\u0000\f\u0007W[\u0013@4\u0018[\u0012\f\u0016Wp\u0007\t\u0005\u0012\u0014\u0014\u0003\u0007\u001eB\u001c\u0014\nW@\u001a@16w>5#(r:5=3k4.7(f03'8f0$]";
                    obj = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i] = str;
                    i = 173;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nX[\u001b\u0005^\u0003]\u0018\u0005^\u0004Q\u0001\u0015\u0003Z]\u0006M\u0007\u0016_\u001c\u000e\u0014Z@\u001a\u000f^\u001b[\u001b\u0007\\\u0002G\u0010\u0012^\u0013Q\u0016\t\u0017\u0012PX\u0014\u001cZW\u0014\u000e\u0010\u0012X";
                    obj = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i] = str;
                    i = 174;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXF\u0010\u0013\u0007\u0018F\u0010M\u001e\u0012P\u001c\u0001^\u0018ZX\u0003\u0016\u001bX\u0000\f\u0012\u0005\u0019\u0011\t\u0012\u001b[\u0012@$\u001e\u00193\tS\u0002Z\u0014\u0016\u0012\u001eX\u0014\u0002\u001f\u0012\u0014\u0014\u000e\u0017WA\u0006\u0005\u0001WU\u0012\u0012\u0016\u0012PU\u0014\u001cWF\u0010\u0013\u0007\u0018F\u0010@\u001e\u0012P\u001c\u0001S\u0018ZU\u0003\u0016\u001bX\u0000\f\u0012\u0005\u001a";
                    obj = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i] = str;
                    i = 175;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXR\u0014\t\u001f\u0012PX\u0014\u001cZF\u0010\u0013\u0007\u0018F\u0010M\u001e\u0012G\u0006\u0001\u0014\u0012GX\u0006\u0001\u0018YX\u0013\u0016\u001bQ\u0016\u0014\u0016\u0013\u0019\u0017\u0001\u0010\u001cA\u0005O\u0006\u0004Q\u0007M\u0017\u0012W\u001c\u0004\u0016\u0013\u0019\u0001\u000f^\u0014[\u001b\u0014\u001a\u0019A\u0010";
                    obj = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i] = str;
                    i = 176;
                    str = "\u0010P\u0007\t\u0005\u0012\u0019\u0014\u0003\u0007\u001eB\u001c\u0014\nXZ\u001aM\u001f\u0018W\u0014\f^\u0018FX\u0007\u0017\u0005]\u0003\u0005^\u0015U\u0016\u000b\u0006\u0007\u0019\u0013\u000f\u0006\u0019PX\u0004\u001a\u0016X\u001a\u0007S\u0019[U\u0007\u001c\u0018S\u0019\u0005S\u0013F\u001c\u0016\u0016WV\u0014\u0003\u0018\u0002D\u0006@\u0015\u0018A\u001b\u0004S\u0016Z\u0011@\u0006\u0004Q\u0007@\u001a\u0004\u0014\u001b\u000f\u0007W]\u001b\u0014\u0016\u0005Q\u0006\u0014\u0016\u0013\u0014\u001c\u000eS\u0016P\u0011\t\u001d\u0010\u0014\u0014\u000eS\u0016W\u0016\u000f\u0006\u0019@U\u0006\u001c\u0005\u0014\u0001\b\u0012\u0003\u0014\u0010\t\u0007\u001fQ\u0007N";
                    obj = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i] = str;
                    i = 177;
                    str = "\u0002Z\u0010\u0018\u0003\u0012W\u0001\u0005\u0017WP\u001c\u0001\u001f\u0018SU\u0002\u001c\u000f\u000eU";
                    obj = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i] = str;
                    O = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0002Z\u0010\u0018\u0003\u0012W\u0001\u0005\u0017WP\u001c\u0001\u001f\u0018SU\u0002\u001c\u000f\u000eU";
                    obj = null;
                    break;
            }
        }
    }

    static void b(GoogleDriveActivity googleDriveActivity, int i) {
        googleDriveActivity.j(i);
    }

    static void a(GoogleDriveActivity googleDriveActivity, c4 c4Var) {
        googleDriveActivity.a(c4Var);
    }

    static bs l(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.L;
    }

    static long m(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.A;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(int r12) {
        /*
        r11 = this;
        r5 = 2;
        r10 = 1;
        r1 = 0;
        r9 = 8;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = 10;
        if (r12 != r0) goto L_0x001c;
    L_0x000b:
        r0 = O;	 Catch:{ IllegalStateException -> 0x0264 }
        r3 = 6;
        r0 = r0[r3];	 Catch:{ IllegalStateException -> 0x0264 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0264 }
        r0 = 2;
        r11.setResult(r0);	 Catch:{ IllegalStateException -> 0x0264 }
        r11.q();	 Catch:{ IllegalStateException -> 0x0264 }
        if (r2 == 0) goto L_0x0284;
    L_0x001c:
        r0 = 11;
        if (r12 != r0) goto L_0x002e;
    L_0x0020:
        r0 = O;	 Catch:{ IllegalStateException -> 0x0268 }
        r3 = 20;
        r0 = r0[r3];	 Catch:{ IllegalStateException -> 0x0268 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0268 }
        r11.l();	 Catch:{ IllegalStateException -> 0x0268 }
        if (r2 == 0) goto L_0x0284;
    L_0x002e:
        r0 = 12;
        if (r12 != r0) goto L_0x0044;
    L_0x0032:
        r0 = O;	 Catch:{ IllegalStateException -> 0x026c }
        r3 = 16;
        r0 = r0[r3];	 Catch:{ IllegalStateException -> 0x026c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x026c }
        r0 = 3;
        r11.setResult(r0);	 Catch:{ IllegalStateException -> 0x026c }
        r11.finish();	 Catch:{ IllegalStateException -> 0x026c }
        if (r2 == 0) goto L_0x0284;
    L_0x0044:
        r0 = 13;
        if (r12 != r0) goto L_0x005f;
    L_0x0048:
        r0 = O;	 Catch:{ IllegalStateException -> 0x0270 }
        r3 = 3;
        r0 = r0[r3];	 Catch:{ IllegalStateException -> 0x0270 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0270 }
        r0 = new android.content.Intent;	 Catch:{ IllegalStateException -> 0x0270 }
        r3 = O;	 Catch:{ IllegalStateException -> 0x0270 }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0270 }
        r0.<init>(r3);	 Catch:{ IllegalStateException -> 0x0270 }
        r11.startActivity(r0);	 Catch:{ IllegalStateException -> 0x0270 }
        if (r2 == 0) goto L_0x0284;
    L_0x005f:
        r0 = 14;
        if (r12 != r0) goto L_0x013a;
    L_0x0063:
        r0 = O;
        r0 = r0[r5];
        com.whatsapp.util.Log.i(r0);
        r0 = android.accounts.AccountManager.get(r11);
        r3 = O;
        r4 = 18;
        r3 = r3[r4];
        r3 = r0.getAccountsByType(r3);
        r0 = r3.length;
        r0 = r0 + 1;
        r4 = new java.lang.String[r0];
        r0 = r1;
    L_0x007e:
        r5 = r3.length;
        if (r0 >= r5) goto L_0x008b;
    L_0x0081:
        r5 = r3[r0];
        r5 = r5.name;
        r4[r0] = r5;
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x007e;
    L_0x008b:
        r0 = r4.length;
        r0 = r0 + -1;
        r5 = 2131231248; // 0x7f080210 float:1.8078572E38 double:1.052968143E-314;
        r5 = r11.getString(r5);
        r4[r0] = r5;
        r0 = r3.length;
        r0 = r0 + 1;
        r5 = new java.lang.String[r0];
        r0 = r3.length;
        r0 = r0 + 1;
        r6 = new boolean[r0];
        r0 = r11.M;
        r0.clear();
        r0 = r1;
    L_0x00a7:
        r7 = r3.length;
        if (r0 >= r7) goto L_0x00d3;
    L_0x00aa:
        r7 = r11.M;	 Catch:{ IllegalStateException -> 0x0272 }
        r8 = r3[r0];	 Catch:{ IllegalStateException -> 0x0272 }
        r7.add(r8);	 Catch:{ IllegalStateException -> 0x0272 }
        r7 = r11.u;	 Catch:{ IllegalStateException -> 0x0272 }
        r8 = r3[r0];	 Catch:{ IllegalStateException -> 0x0272 }
        r7 = r7.contains(r8);	 Catch:{ IllegalStateException -> 0x0272 }
        if (r7 == 0) goto L_0x00c9;
    L_0x00bb:
        r7 = 2131231266; // 0x7f080222 float:1.8078608E38 double:1.052968152E-314;
        r7 = r11.getString(r7);	 Catch:{ IllegalStateException -> 0x0274 }
        r5[r0] = r7;	 Catch:{ IllegalStateException -> 0x0274 }
        r7 = 0;
        r6[r0] = r7;	 Catch:{ IllegalStateException -> 0x0274 }
        if (r2 == 0) goto L_0x00cf;
    L_0x00c9:
        r7 = 0;
        r5[r0] = r7;	 Catch:{ IllegalStateException -> 0x0274 }
        r7 = 1;
        r6[r0] = r7;	 Catch:{ IllegalStateException -> 0x0274 }
    L_0x00cf:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x00a7;
    L_0x00d3:
        r0 = r6.length;
        r0 = r0 + -1;
        r6[r0] = r10;
        r0 = new com.whatsapp.gdrive.SingleChoiceListDialogFragment;
        r0.<init>();
        r3 = new android.os.Bundle;
        r3.<init>();
        r7 = O;	 Catch:{ IllegalStateException -> 0x0276 }
        r8 = 17;
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0276 }
        r8 = 17;
        r3.putInt(r7, r8);	 Catch:{ IllegalStateException -> 0x0276 }
        r7 = O;	 Catch:{ IllegalStateException -> 0x0276 }
        r8 = 12;
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0276 }
        r8 = 2131231249; // 0x7f080211 float:1.8078574E38 double:1.0529681435E-314;
        r8 = r11.getString(r8);	 Catch:{ IllegalStateException -> 0x0276 }
        r3.putString(r7, r8);	 Catch:{ IllegalStateException -> 0x0276 }
        r7 = O;	 Catch:{ IllegalStateException -> 0x0276 }
        r8 = 21;
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0276 }
        r3.putStringArray(r7, r4);	 Catch:{ IllegalStateException -> 0x0276 }
        r4 = O;	 Catch:{ IllegalStateException -> 0x0276 }
        r7 = 19;
        r4 = r4[r7];	 Catch:{ IllegalStateException -> 0x0276 }
        r3.putStringArray(r4, r5);	 Catch:{ IllegalStateException -> 0x0276 }
        r4 = O;	 Catch:{ IllegalStateException -> 0x0276 }
        r5 = 22;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0276 }
        r3.putBooleanArray(r4, r6);	 Catch:{ IllegalStateException -> 0x0276 }
        r4 = O;	 Catch:{ IllegalStateException -> 0x0276 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0276 }
        r5 = 2131231239; // 0x7f080207 float:1.8078553E38 double:1.0529681385E-314;
        r5 = r11.getString(r5);	 Catch:{ IllegalStateException -> 0x0276 }
        r3.putString(r4, r5);	 Catch:{ IllegalStateException -> 0x0276 }
        r0.setArguments(r3);	 Catch:{ IllegalStateException -> 0x0276 }
        r3 = com.whatsapp.gdrive.fn.a(r11);	 Catch:{ IllegalStateException -> 0x0276 }
        if (r3 != 0) goto L_0x0138;
    L_0x0130:
        r3 = r11.getSupportFragmentManager();	 Catch:{ IllegalStateException -> 0x0276 }
        r4 = 0;
        r0.show(r3, r4);	 Catch:{ IllegalStateException -> 0x0276 }
    L_0x0138:
        if (r2 == 0) goto L_0x0284;
    L_0x013a:
        r0 = 15;
        if (r12 != r0) goto L_0x014f;
    L_0x013e:
        r0 = O;	 Catch:{ IllegalStateException -> 0x0278 }
        r3 = 5;
        r0 = r0[r3];	 Catch:{ IllegalStateException -> 0x0278 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0278 }
        r0 = 1;
        r11.setResult(r0);	 Catch:{ IllegalStateException -> 0x0278 }
        r11.finish();	 Catch:{ IllegalStateException -> 0x0278 }
        if (r2 == 0) goto L_0x0284;
    L_0x014f:
        r0 = 16;
        if (r12 != r0) goto L_0x015e;
    L_0x0153:
        r0 = O;	 Catch:{ IllegalStateException -> 0x027c }
        r3 = 9;
        r0 = r0[r3];	 Catch:{ IllegalStateException -> 0x027c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x027c }
        if (r2 == 0) goto L_0x0284;
    L_0x015e:
        r0 = 18;
        if (r12 != r0) goto L_0x0245;
    L_0x0162:
        r0 = O;
        r3 = 11;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = 2131755217; // 0x7f1000d1 float:1.9141307E38 double:1.053227018E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r1);
        r0 = 2131755213; // 0x7f1000cd float:1.9141299E38 double:1.053227016E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r1);
        r0 = 2131755220; // 0x7f1000d4 float:1.9141313E38 double:1.0532270195E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r1);
        r0 = 2131755209; // 0x7f1000c9 float:1.914129E38 double:1.053227014E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r1);
        r0 = 2131755223; // 0x7f1000d7 float:1.914132E38 double:1.053227021E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r9);
        r0 = 2131755225; // 0x7f1000d9 float:1.9141323E38 double:1.053227022E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r9);
        r0 = 2131755226; // 0x7f1000da float:1.9141325E38 double:1.0532270225E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r9);
        r0 = 2131755210; // 0x7f1000ca float:1.9141293E38 double:1.0532270146E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r9);
        r0 = 2131755227; // 0x7f1000db float:1.9141327E38 double:1.053227023E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r9);
        r0 = 2131755228; // 0x7f1000dc float:1.914133E38 double:1.0532270235E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r9);
        r0 = 2131755229; // 0x7f1000dd float:1.9141331E38 double:1.053227024E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r9);
        r0 = com.whatsapp.App.z();
        r1 = com.whatsapp.azf.a();
        r0 = r0.getDatabasePath(r1);
        r1 = r0.exists();	 Catch:{ IllegalStateException -> 0x027e }
        if (r1 == 0) goto L_0x023b;
    L_0x01eb:
        r1 = r0.delete();	 Catch:{ IllegalStateException -> 0x0280 }
        if (r1 != 0) goto L_0x0217;
    L_0x01f1:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0282 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0282 }
        r3 = O;	 Catch:{ IllegalStateException -> 0x0282 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0282 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x0282 }
        r1 = r1.append(r0);	 Catch:{ IllegalStateException -> 0x0282 }
        r3 = O;	 Catch:{ IllegalStateException -> 0x0282 }
        r4 = 13;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0282 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x0282 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0282 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x0282 }
        if (r2 == 0) goto L_0x023b;
    L_0x0217:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0282 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0282 }
        r3 = O;	 Catch:{ IllegalStateException -> 0x0282 }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0282 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x0282 }
        r0 = r1.append(r0);	 Catch:{ IllegalStateException -> 0x0282 }
        r1 = O;	 Catch:{ IllegalStateException -> 0x0282 }
        r3 = 8;
        r1 = r1[r3];	 Catch:{ IllegalStateException -> 0x0282 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0282 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0282 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0282 }
    L_0x023b:
        r0 = com.whatsapp.App.aK;	 Catch:{ IllegalStateException -> 0x0262 }
        r0.h();	 Catch:{ IllegalStateException -> 0x0262 }
        r11.i();	 Catch:{ IllegalStateException -> 0x0262 }
        if (r2 == 0) goto L_0x0284;
    L_0x0245:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0262 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0262 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0262 }
        r2 = O;	 Catch:{ IllegalStateException -> 0x0262 }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0262 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0262 }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x0262 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0262 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0262 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0262 }
    L_0x0262:
        r0 = move-exception;
        throw r0;
    L_0x0264:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0266 }
    L_0x0266:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0268 }
    L_0x0268:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x026a }
    L_0x026a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x026c }
    L_0x026c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x026e }
    L_0x026e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0270 }
    L_0x0270:
        r0 = move-exception;
        throw r0;
    L_0x0272:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0274 }
    L_0x0274:
        r0 = move-exception;
        throw r0;
    L_0x0276:
        r0 = move-exception;
        throw r0;
    L_0x0278:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x027a }
    L_0x027a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x027c }
    L_0x027c:
        r0 = move-exception;
        throw r0;
    L_0x027e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0280 }
    L_0x0280:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0282 }
    L_0x0282:
        r0 = move-exception;
        throw r0;
    L_0x0284:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveActivity.d(int):void");
    }

    static void g(GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.j();
    }

    private void n() {
        try {
            auv.a();
            Log.i(O[147]);
            this.t = true;
            findViewById(2131755217).setVisibility(8);
            findViewById(2131755213).setVisibility(8);
            findViewById(2131755220).setVisibility(8);
            findViewById(2131755223).setVisibility(0);
            this.z = (ProgressBar) findViewById(2131755225);
            this.D = (TextView) findViewById(2131755226);
            this.z.setVisibility(0);
            this.z.setIndeterminate(true);
            h.a(this.z, getResources().getColor(2131624046));
            this.D.setVisibility(0);
            this.w = (TextView) findViewById(2131755227);
            if (this.E == 0) {
                this.E = k();
            }
            if (this.E > 0) {
                String a = l.a((Context) this, this.E);
                this.w.setText(getString(2131230778, new Object[]{a}));
                this.w.setVisibility(0);
            }
            try {
                if (App.a1()) {
                    ((TextView) findViewById(2131755211)).setCompoundDrawablesWithIntrinsicBounds(2130839459, 0, 0, 0);
                    if (!GoogleDriveService.c) {
                        return;
                    }
                }
                ((TextView) findViewById(2131755211)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130839459, 0);
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private void j() {
        Log.i(O[115]);
        this.J = 23;
        findViewById(2131755209).setVisibility(8);
        findViewById(2131755210).setVisibility(0);
        p();
        this.x.open();
        setTitle(2131230781);
        findViewById(2131755221).setVisibility(8);
        findViewById(2131755222).setVisibility(8);
        try {
            ((TextView) findViewById(2131755212)).setText(getString(2131231402, new Object[]{cs.o(this, App.aH())}));
            if (this.I == null) {
                this.I = (GoogleDriveRestoreAnimationView) findViewById(2131755224);
            }
            try {
                int i;
                bq.a(new d3(this, r1));
                TextView textView = (TextView) findViewById(2131755213);
                if (App.V()) {
                    i = 2131231844;
                } else {
                    i = 2131232025;
                }
                textView.setText(i);
                ((Button) findViewById(2131755219)).setOnClickListener(new ex(this));
                ((Button) findViewById(2131755218)).setOnClickListener(new al(this));
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
        r3 = this;
        r2 = 3;
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = com.whatsapp.App.j;	 Catch:{ IllegalStateException -> 0x0013 }
        if (r1 == r2) goto L_0x000b;
    L_0x0007:
        r1 = com.whatsapp.App.am;	 Catch:{ IllegalStateException -> 0x0015 }
        if (r1 != r2) goto L_0x000e;
    L_0x000b:
        switch(r4) {
            case 29: goto L_0x001f;
            case 30: goto L_0x002d;
            case 31: goto L_0x003b;
            case 32: goto L_0x0049;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = super.onKeyDown(r4, r5);
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;
    L_0x001f:
        r1 = r3.p;	 Catch:{ IllegalStateException -> 0x0019 }
        r2 = 11;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x0019 }
        r1 = r3.p;	 Catch:{ IllegalStateException -> 0x0019 }
        r1.u();	 Catch:{ IllegalStateException -> 0x0019 }
        if (r0 == 0) goto L_0x000e;
    L_0x002d:
        r1 = r3.p;	 Catch:{ IllegalStateException -> 0x001b }
        r2 = 12;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x001b }
        r1 = r3.p;	 Catch:{ IllegalStateException -> 0x001b }
        r1.u();	 Catch:{ IllegalStateException -> 0x001b }
        if (r0 == 0) goto L_0x000e;
    L_0x003b:
        r1 = r3.p;	 Catch:{ IllegalStateException -> 0x001d }
        r2 = 14;
        r1.d(r2);	 Catch:{ IllegalStateException -> 0x001d }
        r1 = r3.p;	 Catch:{ IllegalStateException -> 0x001d }
        r1.u();	 Catch:{ IllegalStateException -> 0x001d }
        if (r0 == 0) goto L_0x000e;
    L_0x0049:
        r0 = r3.p;	 Catch:{ IllegalStateException -> 0x001d }
        r1 = 15;
        r0.d(r1);	 Catch:{ IllegalStateException -> 0x001d }
        r0 = r3.p;	 Catch:{ IllegalStateException -> 0x001d }
        r0.u();	 Catch:{ IllegalStateException -> 0x001d }
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    static void a(GoogleDriveActivity googleDriveActivity, int i) {
        googleDriveActivity.i(i);
    }

    static void h(GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.o();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j(@com.whatsapp.gdrive.fk int r12) {
        /*
        r11 = this;
        r0 = 0;
        r5 = 2;
        r10 = 1;
        r9 = 8;
        r8 = 0;
        r3 = com.whatsapp.gdrive.GoogleDriveService.c;
        com.whatsapp.auv.a();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = O;
        r4 = 93;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = com.whatsapp.gdrive.fn.a(r12);
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = 2131232324; // 0x7f080644 float:1.8080754E38 double:1.0529686746E-314;
        r4 = r11.getString(r1);
        r2 = com.whatsapp.gdrive.GoogleDriveService.g();
        switch(r12) {
            case 10: goto L_0x0111;
            case 11: goto L_0x0128;
            case 12: goto L_0x0112;
            case 13: goto L_0x013c;
            case 14: goto L_0x0158;
            case 15: goto L_0x016c;
            case 16: goto L_0x01e0;
            case 17: goto L_0x0158;
            case 18: goto L_0x0158;
            case 19: goto L_0x0158;
            case 20: goto L_0x01e0;
            case 21: goto L_0x0128;
            case 22: goto L_0x0158;
            case 23: goto L_0x01ec;
            default: goto L_0x0037;
        };
    L_0x0037:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01f2 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x01f2 }
        r2 = O;	 Catch:{ IllegalStateException -> 0x01f2 }
        r5 = 87;
        r2 = r2[r5];	 Catch:{ IllegalStateException -> 0x01f2 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x01f2 }
        r2 = com.whatsapp.gdrive.fn.a(r12);	 Catch:{ IllegalStateException -> 0x01f2 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x01f2 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x01f2 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IllegalStateException -> 0x01f2 }
        r1 = r0;
        r2 = r0;
    L_0x0057:
        r0 = com.whatsapp.gdrive.fn.a(r11);	 Catch:{ IllegalStateException -> 0x01f4 }
        if (r0 != 0) goto L_0x00ed;
    L_0x005d:
        r0 = r11.z;	 Catch:{ IllegalStateException -> 0x01f6 }
        r5 = 0;
        r0.setIndeterminate(r5);	 Catch:{ IllegalStateException -> 0x01f6 }
        r0 = r11.D;	 Catch:{ IllegalStateException -> 0x01f6 }
        r5 = 2131230779; // 0x7f08003b float:1.807762E38 double:1.0529679113E-314;
        r0.setText(r5);	 Catch:{ IllegalStateException -> 0x01f6 }
        r0 = r11.I;	 Catch:{ IllegalStateException -> 0x01f6 }
        if (r0 != 0) goto L_0x007a;
    L_0x006f:
        r0 = 2131755224; // 0x7f1000d8 float:1.9141321E38 double:1.0532270215E-314;
        r0 = r11.findViewById(r0);	 Catch:{ IllegalStateException -> 0x01f6 }
        r0 = (com.whatsapp.gdrive.GoogleDriveRestoreAnimationView) r0;	 Catch:{ IllegalStateException -> 0x01f6 }
        r11.I = r0;	 Catch:{ IllegalStateException -> 0x01f6 }
    L_0x007a:
        r0 = r11.I;
        r0.a();
        r0 = 2131755214; // 0x7f1000ce float:1.91413E38 double:1.0532270166E-314;
        r5 = r11.findViewById(r0);
        if (r2 == 0) goto L_0x0099;
    L_0x0088:
        r5.setVisibility(r8);
        r0 = 2131755216; // 0x7f1000d0 float:1.9141305E38 double:1.0532270176E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0.setText(r2);	 Catch:{ IllegalStateException -> 0x01f8 }
        if (r3 == 0) goto L_0x009e;
    L_0x0099:
        r0 = 8;
        r5.setVisibility(r0);	 Catch:{ IllegalStateException -> 0x01f8 }
    L_0x009e:
        r0 = 2131755212; // 0x7f1000cc float:1.9141297E38 double:1.0532270156E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r8);
        r0 = 2131755217; // 0x7f1000d1 float:1.9141307E38 double:1.053227018E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r8);
        r0 = 2131755227; // 0x7f1000db float:1.9141327E38 double:1.053227023E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r9);
        r0 = r11.I;
        r0.setVisibility(r9);
        r0 = r11.z;
        r0.setVisibility(r9);
        r0 = r11.D;
        r0.setVisibility(r9);
        r0 = 2131755219; // 0x7f1000d3 float:1.9141311E38 double:1.053227019E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r2 = new com.whatsapp.gdrive.a;
        r2.<init>(r11);
        r0.setOnClickListener(r2);
        r0 = 2131755218; // 0x7f1000d2 float:1.914131E38 double:1.0532270186E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r0.setText(r4);	 Catch:{ IllegalStateException -> 0x01fa }
        r0.setOnClickListener(r1);	 Catch:{ IllegalStateException -> 0x01fa }
        if (r3 == 0) goto L_0x0111;
    L_0x00ed:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01fa }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x01fa }
        r1 = O;	 Catch:{ IllegalStateException -> 0x01fa }
        r2 = 88;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x01fa }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x01fa }
        r0 = r0.append(r12);	 Catch:{ IllegalStateException -> 0x01fa }
        r1 = O;	 Catch:{ IllegalStateException -> 0x01fa }
        r2 = 90;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x01fa }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x01fa }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x01fa }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x01fa }
    L_0x0111:
        return;
    L_0x0112:
        r0 = 2131231225; // 0x7f0801f9 float:1.8078525E38 double:1.0529681316E-314;
        r1 = new java.lang.Object[r5];
        r1[r8] = r2;
        r1[r10] = r4;
        r1 = r11.getString(r0, r1);
        r0 = new com.whatsapp.gdrive.fa;
        r0.<init>(r11, r2);
        r2 = r1;
        r1 = r0;
        goto L_0x0057;
    L_0x0128:
        r0 = 2131231226; // 0x7f0801fa float:1.8078527E38 double:1.052968132E-314;
        r1 = new java.lang.Object[r10];
        r1[r8] = r4;
        r1 = r11.getString(r0, r1);
        r0 = new com.whatsapp.gdrive.de;
        r0.<init>(r11, r2);
        r2 = r1;
        r1 = r0;
        goto L_0x0057;
    L_0x013c:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = O;
        r5 = 95;
        r2 = r2[r5];
        r1 = r1.append(r2);
        r1 = r1.append(r12);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        if (r3 == 0) goto L_0x01ee;
    L_0x0158:
        r0 = 2131231229; // 0x7f0801fd float:1.8078533E38 double:1.0529681336E-314;
        r1 = new java.lang.Object[r10];
        r1[r8] = r4;
        r1 = r11.getString(r0, r1);
        r0 = new com.whatsapp.gdrive.af;
        r0.<init>(r11);
        r2 = r1;
        r1 = r0;
        goto L_0x0057;
    L_0x016c:
        r0 = r11.p;
        r0 = r0.U();
        r6 = 0;
        r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x01c6;
    L_0x0178:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = O;
        r2 = 94;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r1 = O;
        r2 = 92;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.p;
        r6 = r1.N();
        r0 = r0.append(r6);
        r1 = O;
        r2 = 89;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.p;
        r6 = r1.T();
        r0 = r0.append(r6);
        r1 = O;
        r2 = 91;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = 0;
    L_0x01c6:
        r2 = 2131231227; // 0x7f0801fb float:1.807853E38 double:1.0529681326E-314;
        r5 = new java.lang.Object[r5];
        r0 = com.whatsapp.util.l.a(r11, r0);
        r5[r8] = r0;
        r5[r10] = r4;
        r1 = r11.getString(r2, r5);
        r0 = new com.whatsapp.gdrive.c2;
        r0.<init>(r11, r12);
        r2 = r1;
        r1 = r0;
        goto L_0x0057;
    L_0x01e0:
        r0 = new java.lang.IllegalStateException;
        r1 = O;
        r2 = 86;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x01ec:
        if (r3 != 0) goto L_0x0037;
    L_0x01ee:
        r1 = r0;
        r2 = r0;
        goto L_0x0057;
    L_0x01f2:
        r0 = move-exception;
        throw r0;
    L_0x01f4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01f6 }
    L_0x01f6:
        r0 = move-exception;
        throw r0;
    L_0x01f8:
        r0 = move-exception;
        throw r0;
    L_0x01fa:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveActivity.j(int):void");
    }

    static bi j(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.y;
    }

    static Set f(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.u;
    }

    static ConditionVariable p(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.H;
    }

    static void c(GoogleDriveActivity googleDriveActivity, boolean z) {
        googleDriveActivity.c(z);
    }

    static AtomicBoolean x(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.K;
    }

    static void v(GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.f();
    }

    private boolean a(long j) {
        Editor edit = App.z().getSharedPreferences(O[82], 0).edit();
        try {
            edit.putLong(O[83], j);
            Log.i(O[81] + j);
            if (edit.commit()) {
                return true;
            }
            Log.w(O[84]);
            return false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void p() {
        TextView textView = (TextView) findViewById(2131755211);
        if (textView != null) {
            try {
                int i;
                if (this.t) {
                    i = 2130839459;
                } else {
                    i = 2130839458;
                }
                try {
                    if (App.a1()) {
                        textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
                        if (!GoogleDriveService.c) {
                            return;
                        }
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
    }

    static TextView s(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.D;
    }

    static ProgressBar c(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.z;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.putInt(O[arj.Theme_editTextStyle], this.J);
                if (this.N != null) {
                    Log.i(O[arj.Theme_ratingBarStyle] + this.N);
                    bundle.putBundle(O[arj.Theme_switchStyle], this.N.a());
                }
                Log.i(O[arj.Theme_seekBarStyle] + this.A);
                bundle.putLong(O[arj.Theme_spinnerStyle], this.A);
                Log.i(O[arj.Theme_radioButtonStyle] + this.E);
                bundle.putLong(O[110], this.E);
                Log.i(O[111] + a(this.J));
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    private void r() {
        int i = 1;
        Button button = (Button) findViewById(2131755219);
        Button button2 = (Button) findViewById(2131755218);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131755217);
        if (button != null) {
            int i2;
            if (button2 != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (linearLayout == null) {
                i = 0;
            }
            if ((i & i2) != 0) {
                float width = (float) button2.getWidth();
                float width2 = (float) button.getWidth();
                if (width != 0.0f && width2 != 0.0f) {
                    float dimensionPixelSize = (float) getResources().getDimensionPixelSize(2131427423);
                    float f = (float) ((LayoutParams) button2.getLayoutParams()).rightMargin;
                    if (width + width2 < (((((float) getWindowManager().getDefaultDisplay().getWidth()) - ((float) getResources().getDimensionPixelSize(2131427493))) - dimensionPixelSize) - f) - ((float) ((LayoutParams) button.getLayoutParams()).leftMargin)) {
                        try {
                            linearLayout.setOrientation(0);
                            if (!GoogleDriveService.c) {
                                return;
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    linearLayout.setOrientation(1);
                }
            }
        }
    }

    private boolean a(@NonNull String str, int i) {
        try {
            auv.b();
            Log.i(O[79] + fn.a(str));
            bq.a(new dn(this, str, i));
            Log.i(O[80]);
            this.o.block(100000);
            return this.r != null;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onResume() {
        super.onResume();
        d(true);
        Log.i(O[54]);
        p();
    }

    public void b(int i) {
        if (i == 13) {
            try {
                Log.i(O[0]);
                if (!GoogleDriveService.c) {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        throw new IllegalStateException(O[1] + i);
    }

    public void c(int i) {
        boolean z = GoogleDriveService.c;
        if (i == 10 || i == 11) {
            try {
                Log.i(O[171] + i);
                if (!z) {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        if (i == 12) {
            try {
                Log.i(O[174]);
                GoogleDriveService.e(1);
                o();
                Log.i(O[172]);
                setResult(3);
                finish();
                if (!z) {
                    return;
                }
            } catch (IllegalStateException e22) {
                try {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        }
        if (i == 14) {
            try {
                Log.i(O[176]);
                q();
                setResult(1);
                if (!z) {
                    return;
                }
            } catch (IllegalStateException e2222) {
                try {
                    throw e2222;
                } catch (IllegalStateException e22222) {
                    throw e22222;
                }
            }
        }
        if (i == 16) {
            try {
                Log.i(O[173]);
                by.a();
                this.K.set(true);
                if (App.aK.F() > 0) {
                    try {
                        j();
                        if (!z) {
                            return;
                        }
                    } catch (IllegalStateException e222222) {
                        throw e222222;
                    }
                }
                try {
                    this.v = true;
                    c(false);
                    if (!z) {
                        return;
                    }
                } catch (IllegalStateException e2222222) {
                    try {
                        throw e2222222;
                    } catch (IllegalStateException e22222222) {
                        throw e22222222;
                    }
                }
            } catch (IllegalStateException e222222222) {
                throw e222222222;
            }
        }
        if (i == 18) {
            try {
                Log.i(O[175]);
                m();
                if (!z) {
                    return;
                }
            } catch (IllegalStateException e2222222222) {
                throw e2222222222;
            }
        }
        throw new IllegalStateException(O[177] + i);
    }

    static boolean o(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.B;
    }

    static boolean a(GoogleDriveActivity googleDriveActivity, String str, bc bcVar, String str2) {
        return googleDriveActivity.a(str, bcVar, str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.gdrive.c4 r15) {
        /*
        r14 = this;
        r6 = 0;
        r13 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = O;
        r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r15.f;
        r1 = com.whatsapp.gdrive.fn.a(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = 22;
        r14.J = r0;
        r2 = r15.f;
        r5 = r15.g;
        r3 = r15.d;
        r10 = r15.c;
        r8 = r15.e;
        if (r5 == 0) goto L_0x005b;
    L_0x0033:
        r0 = r5.r();	 Catch:{ IllegalStateException -> 0x0154 }
        if (r0 == 0) goto L_0x005b;
    L_0x0039:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0154 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0154 }
        r1 = O;	 Catch:{ IllegalStateException -> 0x0154 }
        r4 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x0154 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0154 }
        r1 = r5.r();	 Catch:{ IllegalStateException -> 0x0154 }
        r1 = r1.i();	 Catch:{ IllegalStateException -> 0x0154 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0154 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0154 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0154 }
    L_0x005b:
        r0 = 2131755209; // 0x7f1000c9 float:1.914129E38 double:1.053227014E-314;
        r0 = r14.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0156 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x0156 }
        r0 = 2131755210; // 0x7f1000ca float:1.9141293E38 double:1.0532270146E-314;
        r0 = r14.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0156 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x0156 }
        r14.p();	 Catch:{ IllegalStateException -> 0x0156 }
        r0 = r14.x;	 Catch:{ IllegalStateException -> 0x0156 }
        r0.open();	 Catch:{ IllegalStateException -> 0x0156 }
        r0 = 2131230781; // 0x7f08003d float:1.8077624E38 double:1.0529679123E-314;
        r14.setTitle(r0);	 Catch:{ IllegalStateException -> 0x0156 }
        r0 = r14.I;	 Catch:{ IllegalStateException -> 0x0156 }
        if (r0 != 0) goto L_0x008f;
    L_0x0084:
        r0 = 2131755224; // 0x7f1000d8 float:1.9141321E38 double:1.0532270215E-314;
        r0 = r14.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0156 }
        r0 = (com.whatsapp.gdrive.GoogleDriveRestoreAnimationView) r0;	 Catch:{ IllegalStateException -> 0x0156 }
        r14.I = r0;	 Catch:{ IllegalStateException -> 0x0156 }
    L_0x008f:
        r0 = r15.i;	 Catch:{ IllegalStateException -> 0x0158 }
        if (r0 == 0) goto L_0x00ac;
    L_0x0093:
        r0 = 2131755213; // 0x7f1000cd float:1.9141299E38 double:1.053227016E-314;
        r0 = r14.findViewById(r0);	 Catch:{ IllegalStateException -> 0x015a }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x015a }
        r1 = com.whatsapp.App.V();	 Catch:{ IllegalStateException -> 0x015a }
        if (r1 == 0) goto L_0x015c;
    L_0x00a2:
        r1 = 2131231844; // 0x7f080464 float:1.807978E38 double:1.0529684374E-314;
    L_0x00a5:
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x0161 }
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;	 Catch:{ IllegalStateException -> 0x0161 }
        if (r0 == 0) goto L_0x00bb;
    L_0x00ac:
        r0 = 2131755213; // 0x7f1000cd float:1.9141299E38 double:1.053227016E-314;
        r0 = r14.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0161 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x0161 }
        r1 = 2131231245; // 0x7f08020d float:1.8078566E38 double:1.0529681415E-314;
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x0161 }
    L_0x00bb:
        r4 = new java.lang.StringBuilder;
        r0 = 2131231181; // 0x7f0801cd float:1.8078436E38 double:1.05296811E-314;
        r0 = r14.getString(r0);
        r4.<init>(r0);
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00db;
    L_0x00d0:
        r0 = 0;
        r4.setLength(r0);	 Catch:{ IllegalStateException -> 0x0163 }
        r0 = com.whatsapp.util.cs.o(r14, r10);	 Catch:{ IllegalStateException -> 0x0163 }
        r4.append(r0);	 Catch:{ IllegalStateException -> 0x0163 }
    L_0x00db:
        r0 = r15.i;	 Catch:{ IllegalStateException -> 0x0165 }
        if (r0 == 0) goto L_0x0167;
    L_0x00df:
        r0 = r6;
    L_0x00e0:
        r14.A = r0;	 Catch:{ IllegalStateException -> 0x016a }
        r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x00f1;
    L_0x00e6:
        r0 = 0;
        r12.setLength(r0);	 Catch:{ IllegalStateException -> 0x016a }
        r0 = com.whatsapp.util.l.a(r14, r8);	 Catch:{ IllegalStateException -> 0x016a }
        r12.append(r0);	 Catch:{ IllegalStateException -> 0x016a }
    L_0x00f1:
        r0 = r15.h;	 Catch:{ IllegalStateException -> 0x016c }
        if (r0 != 0) goto L_0x0104;
    L_0x00f5:
        r0 = 0;
        r4.setLength(r0);	 Catch:{ IllegalStateException -> 0x016c }
        r0 = com.whatsapp.App.aH();	 Catch:{ IllegalStateException -> 0x016c }
        r0 = com.whatsapp.util.cs.o(r14, r0);	 Catch:{ IllegalStateException -> 0x016c }
        r4.append(r0);	 Catch:{ IllegalStateException -> 0x016c }
    L_0x0104:
        r0 = 2131755212; // 0x7f1000cc float:1.9141297E38 double:1.0532270156E-314;
        r0 = r14.findViewById(r0);	 Catch:{ IllegalStateException -> 0x016e }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x016e }
        r1 = r15.i;	 Catch:{ IllegalStateException -> 0x016e }
        if (r1 == 0) goto L_0x0170;
    L_0x0111:
        r1 = 2131231401; // 0x7f0802a9 float:1.8078882E38 double:1.0529682186E-314;
    L_0x0114:
        r6 = 3;
        r6 = new java.lang.Object[r6];
        r6[r13] = r2;
        r7 = 1;
        r4 = r4.toString();
        r6[r7] = r4;
        r4 = 2;
        r7 = r12.toString();
        r6[r4] = r7;
        r1 = r14.getString(r1, r6);
        r0.setText(r1);
        r0 = 2131755219; // 0x7f1000d3 float:1.9141311E38 double:1.053227019E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.gdrive.dd;
        r1.<init>(r14);
        r0.setOnClickListener(r1);
        r0 = 2131755218; // 0x7f1000d2 float:1.914131E38 double:1.0532270186E-314;
        r0 = r14.findViewById(r0);
        r6 = r0;
        r6 = (android.widget.Button) r6;
        r0 = new com.whatsapp.gdrive.bb;
        r1 = r14;
        r4 = r15;
        r0.<init>(r1, r2, r3, r4, r5);
        r6.setOnClickListener(r0);
        return;
    L_0x0154:
        r0 = move-exception;
        throw r0;
    L_0x0156:
        r0 = move-exception;
        throw r0;
    L_0x0158:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x015a }
    L_0x015a:
        r0 = move-exception;
        throw r0;
    L_0x015c:
        r1 = 2131232025; // 0x7f080519 float:1.8080148E38 double:1.052968527E-314;
        goto L_0x00a5;
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r0 = move-exception;
        throw r0;
    L_0x0165:
        r0 = move-exception;
        throw r0;
    L_0x0167:
        r0 = r8;
        goto L_0x00e0;
    L_0x016a:
        r0 = move-exception;
        throw r0;
    L_0x016c:
        r0 = move-exception;
        throw r0;
    L_0x016e:
        r0 = move-exception;
        throw r0;
    L_0x0170:
        r1 = 2131231246; // 0x7f08020e float:1.8078568E38 double:1.052968142E-314;
        goto L_0x0114;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveActivity.a(com.whatsapp.gdrive.c4):void");
    }

    private void i() {
        try {
            Log.i(O[44]);
            if (App.h(this, O[43]) == 0 && App.aO()) {
                Account[] accountsByType;
                Timer timer = new Timer(O[45]);
                ab abVar = new ab(O[46]);
                try {
                    accountsByType = AccountManager.get(this).getAccountsByType(O[41]);
                } catch (Throwable e) {
                    Log.b(O[40], e);
                    accountsByType = new Account[0];
                }
                this.M.clear();
                Collections.addAll(this.M, accountsByType);
                Log.i(O[42]);
                bq.a(new fu(this, accountsByType, abVar, timer), new Object[0]);
                timer.schedule(new b7(this, abVar), 30000);
            }
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }

    public boolean c() {
        return this.q;
    }

    private void a(b6 b6Var) {
        bq.a(new b0(this, b6Var));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
        r7 = this;
        r6 = 2131623943; // 0x7f0e0007 float:1.8875052E38 double:1.05316216E-314;
        r5 = 21;
        r3 = 0;
        r4 = 1;
        r1 = com.whatsapp.gdrive.GoogleDriveService.c;
        super.onCreate(r8);	 Catch:{ IllegalStateException -> 0x002c }
        r0 = O;	 Catch:{ IllegalStateException -> 0x002c }
        r2 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x002c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x002c }
        r0 = com.whatsapp.gdrive.GoogleDriveService.X();	 Catch:{ IllegalStateException -> 0x002c }
        if (r0 != 0) goto L_0x002e;
    L_0x001b:
        r0 = O;	 Catch:{ IllegalStateException -> 0x002c }
        r1 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x002c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x002c }
        r0 = 0;
        r7.setResult(r0);	 Catch:{ IllegalStateException -> 0x002c }
        r7.finish();	 Catch:{ IllegalStateException -> 0x002c }
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = 2130903071; // 0x7f03001f float:1.741295E38 double:1.052806002E-314;
        r7.setContentView(r0);
        r0 = 2131232305; // 0x7f080631 float:1.8080716E38 double:1.052968665E-314;
        r7.setTitle(r0);
        r0 = r7.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r3);
        r0 = 2131755207; // 0x7f1000c7 float:1.9141287E38 double:1.053227013E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r2 = r7.getResources();
        r2 = r2.getColor(r6);
        com.whatsapp.util.h.a(r0, r2);
        r0 = 2131755222; // 0x7f1000d6 float:1.9141317E38 double:1.0532270205E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r2 = r7.getResources();
        r2 = r2.getColor(r6);
        com.whatsapp.util.h.a(r0, r2);
        r0 = r7.getApplicationContext();
        r2 = new android.content.Intent;
        r3 = com.whatsapp.gdrive.GoogleDriveService.class;
        r2.<init>(r7, r3);
        r3 = r7.G;
        r0.bindService(r2, r3, r4);
        if (r8 != 0) goto L_0x0080;
    L_0x007b:
        r7.J = r5;
        r0 = 0;
        if (r1 == 0) goto L_0x0096;
    L_0x0080:
        r0 = O;
        r2 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r0 = r0[r2];
        r0 = r8.getInt(r0, r5);
        r7.J = r0;
        r0 = O;
        r2 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r0 = r0[r2];
        r0 = r8.getBundle(r0);
    L_0x0096:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00ec }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x00ec }
        r3 = O;	 Catch:{ IllegalStateException -> 0x00ec }
        r4 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00ec }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00ec }
        r3 = r7.J;	 Catch:{ IllegalStateException -> 0x00ec }
        r3 = r7.a(r3);	 Catch:{ IllegalStateException -> 0x00ec }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00ec }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x00ec }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x00ec }
        r2 = r7.J;	 Catch:{ IllegalStateException -> 0x00ec }
        switch(r2) {
            case 21: goto L_0x010c;
            case 22: goto L_0x012d;
            case 23: goto L_0x0154;
            case 24: goto L_0x00dc;
            case 25: goto L_0x0169;
            case 26: goto L_0x0173;
            case 27: goto L_0x0159;
            default: goto L_0x00bb;
        };
    L_0x00bb:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x00da }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00da }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00da }
        r2 = O;	 Catch:{ IllegalStateException -> 0x00da }
        r3 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00da }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00da }
        r2 = r7.J;	 Catch:{ IllegalStateException -> 0x00da }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00da }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x00da }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x00da }
        throw r0;	 Catch:{ IllegalStateException -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        throw r0;
    L_0x00dc:
        if (r0 != 0) goto L_0x00ee;
    L_0x00de:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x00ea }
        r1 = O;	 Catch:{ IllegalStateException -> 0x00ea }
        r2 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00ea }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x00ea }
        throw r0;	 Catch:{ IllegalStateException -> 0x00ea }
    L_0x00ea:
        r0 = move-exception;
        throw r0;
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ea }
    L_0x00ee:
        r2 = com.whatsapp.gdrive.c4.a(r0);	 Catch:{ IllegalStateException -> 0x0126 }
        r7.N = r2;	 Catch:{ IllegalStateException -> 0x0126 }
        r2 = r7.N;	 Catch:{ IllegalStateException -> 0x0126 }
        r7.a(r2);	 Catch:{ IllegalStateException -> 0x0126 }
        r2 = 24;
        r7.J = r2;	 Catch:{ IllegalStateException -> 0x0126 }
        r7.n();	 Catch:{ IllegalStateException -> 0x0126 }
        r2 = com.whatsapp.gdrive.GoogleDriveService.m();	 Catch:{ IllegalStateException -> 0x0126 }
        if (r2 != 0) goto L_0x018e;
    L_0x0106:
        r2 = 1;
        r7.f(r2);	 Catch:{ IllegalStateException -> 0x0126 }
        if (r1 == 0) goto L_0x018e;
    L_0x010c:
        r2 = r7.getIntent();
        r3 = r2.getAction();	 Catch:{ IllegalStateException -> 0x0124 }
        if (r3 != 0) goto L_0x0128;
    L_0x0116:
        r0 = O;	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0124 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r7.finish();	 Catch:{ IllegalStateException -> 0x0124 }
        goto L_0x002b;
    L_0x0124:
        r0 = move-exception;
        throw r0;
    L_0x0126:
        r0 = move-exception;
        throw r0;
    L_0x0128:
        r7.onNewIntent(r2);	 Catch:{ IllegalStateException -> 0x013d }
        if (r1 == 0) goto L_0x018e;
    L_0x012d:
        if (r0 != 0) goto L_0x013f;
    L_0x012f:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x013b }
        r1 = O;	 Catch:{ IllegalStateException -> 0x013b }
        r2 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x013b }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x013b }
        throw r0;	 Catch:{ IllegalStateException -> 0x013b }
    L_0x013b:
        r0 = move-exception;
        throw r0;
    L_0x013d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x013b }
    L_0x013f:
        r2 = com.whatsapp.gdrive.c4.a(r0);	 Catch:{ IllegalStateException -> 0x01a3 }
        r7.N = r2;	 Catch:{ IllegalStateException -> 0x01a3 }
        r2 = r7.N;	 Catch:{ IllegalStateException -> 0x01a3 }
        r7.a(r2);	 Catch:{ IllegalStateException -> 0x01a3 }
        r2 = new com.whatsapp.gdrive.fo;	 Catch:{ IllegalStateException -> 0x01a3 }
        r2.<init>(r7, r8);	 Catch:{ IllegalStateException -> 0x01a3 }
        com.whatsapp.util.bq.a(r2);	 Catch:{ IllegalStateException -> 0x01a3 }
        if (r1 == 0) goto L_0x018e;
    L_0x0154:
        r7.j();	 Catch:{ IllegalStateException -> 0x01a5 }
        if (r1 == 0) goto L_0x018e;
    L_0x0159:
        r7.j();	 Catch:{ IllegalStateException -> 0x01a7 }
        r7.n();	 Catch:{ IllegalStateException -> 0x01a7 }
        r2 = 1;
        r7.f(r2);	 Catch:{ IllegalStateException -> 0x01a7 }
        r2 = 27;
        r7.J = r2;	 Catch:{ IllegalStateException -> 0x01a7 }
        if (r1 == 0) goto L_0x018e;
    L_0x0169:
        if (r0 == 0) goto L_0x018e;
    L_0x016b:
        r2 = com.whatsapp.gdrive.c4.a(r0);	 Catch:{ IllegalStateException -> 0x01ab }
        r7.N = r2;	 Catch:{ IllegalStateException -> 0x01ab }
        if (r1 == 0) goto L_0x018e;
    L_0x0173:
        if (r0 == 0) goto L_0x0182;
    L_0x0175:
        r0 = com.whatsapp.gdrive.c4.a(r0);	 Catch:{ IllegalStateException -> 0x01af }
        r7.N = r0;	 Catch:{ IllegalStateException -> 0x01af }
        r0 = r7.N;	 Catch:{ IllegalStateException -> 0x01af }
        r7.a(r0);	 Catch:{ IllegalStateException -> 0x01af }
        if (r1 == 0) goto L_0x0185;
    L_0x0182:
        r7.j();	 Catch:{ IllegalStateException -> 0x01af }
    L_0x0185:
        r7.n();	 Catch:{ IllegalStateException -> 0x00da }
        r0 = 1;
        r7.e(r0);	 Catch:{ IllegalStateException -> 0x00da }
        if (r1 != 0) goto L_0x00bb;
    L_0x018e:
        r0 = 2131755217; // 0x7f1000d1 float:1.9141307E38 double:1.053227018E-314;
        r0 = r7.findViewById(r0);
        r0 = r0.getViewTreeObserver();
        r1 = new com.whatsapp.gdrive.a4;
        r1.<init>(r7);
        r0.addOnGlobalLayoutListener(r1);
        goto L_0x002b;
    L_0x01a3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01a5 }
    L_0x01a5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01a7 }
    L_0x01a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01a9 }
    L_0x01a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01ab }
    L_0x01ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01ad }
    L_0x01ad:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01af }
    L_0x01af:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveActivity.onCreate(android.os.Bundle):void");
    }

    static GoogleDriveService k(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.p;
    }

    private boolean s() {
        boolean z = App.z().getSharedPreferences(O[33], 0).getBoolean(O[35], false);
        Log.i(O[34] + z);
        return z;
    }

    public void b(int i, int i2, String[] strArr) {
        boolean z = GoogleDriveService.c;
        if (i == 17) {
            try {
                if (strArr[i2].equals(getString(2131231248))) {
                    fd.a(new ft(this, AccountManager.get(this).addAccount(O[144], null, null, null, this, null, null)));
                    Log.i(O[146]);
                    if (!z) {
                        return;
                    }
                }
                Intent intent = new Intent();
                try {
                    intent.putExtra(O[142], strArr[i2]);
                    onActivityResult(3, -1, intent);
                    if (!z) {
                        return;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        throw new IllegalStateException(O[145] + i + O[143] + i2);
    }

    private boolean a(@Nullable String str, @NonNull bc bcVar, @Nullable String str2) {
        File t;
        b6 b6Var;
        try {
            t = App.aK.t();
        } catch (IOException e) {
            Log.e(O[56]);
            t = null;
        }
        if (t != null) {
            try {
                if (t.exists()) {
                    if (this.B) {
                        try {
                            if (t.length() == 0) {
                                Log.i(O[70]);
                                GoogleDriveService.d(true);
                                if (str2 != null) {
                                    b6Var = b6.ONLY_REMOTE_BACKUP_FOUND;
                                } else {
                                    b6Var = b6.NO_BACKUP_FOUND;
                                }
                                a(b6Var);
                                return true;
                            } else if (str == null) {
                                try {
                                    Log.e(O[63]);
                                    GoogleDriveService.d(false);
                                    a(b6.ONLY_LOCAL_BACKUP_FOUND);
                                    return false;
                                } catch (IOException e2) {
                                    throw e2;
                                }
                            } else {
                                try {
                                    if (str.equals(fn.a(t))) {
                                        Log.i(O[55]);
                                        GoogleDriveService.d(false);
                                        a(b6.REMOTE_BACKUP_IS_SAME_AS_LOCAL);
                                        return false;
                                    }
                                    fs fsVar = (fs) this.s.get(str2);
                                    if (fsVar == null) {
                                        if (str2 == null) {
                                            Log.e(O[71]);
                                            fsVar = null;
                                        } else {
                                            Log.i(O[57]);
                                            try {
                                                fsVar = (fs) by.a(GoogleDriveService.v, new u(this, bcVar, str2), O[69]);
                                            } catch (Throwable e3) {
                                                Log.a(e3);
                                            }
                                        }
                                    }
                                    if (fsVar == null) {
                                        try {
                                            Log.e(O[60]);
                                            GoogleDriveService.d(false);
                                            a(b6.ONLY_LOCAL_BACKUP_FOUND);
                                            return false;
                                        } catch (IOException e22) {
                                            throw e22;
                                        }
                                    }
                                    try {
                                        if (t.lastModified() < fsVar.c()) {
                                            Log.i(O[58] + fsVar.c() + O[61] + cs.o(this, fsVar.c()) + O[67] + t.lastModified() + O[59] + cs.o(this, t.lastModified()) + ")");
                                            GoogleDriveService.d(true);
                                            a(b6.REMOTE_BACKUP_IS_NEWER_THAN_LOCAL);
                                            return true;
                                        }
                                        Log.i(O[62] + t.lastModified() + O[65] + cs.o(this, t.lastModified()) + O[68] + fsVar.c() + O[64] + cs.o(this, fsVar.c()) + O[66]);
                                        GoogleDriveService.d(false);
                                        a(b6.LOCAL_BACKUP_IS_NEWER_THAN_REMOTE);
                                        return false;
                                    } catch (IOException e222) {
                                        throw e222;
                                    }
                                } catch (IOException e2222) {
                                    throw e2222;
                                }
                            }
                        } catch (IOException e22222) {
                            throw e22222;
                        } catch (IOException e222222) {
                            throw e222222;
                        }
                    }
                }
            } catch (IOException e2222222) {
                throw e2222222;
            } catch (IOException e22222222) {
                throw e22222222;
            }
        }
        try {
            Log.i(O[72]);
            GoogleDriveService.d(true);
            if (str2 != null) {
                try {
                    b6Var = b6.ONLY_REMOTE_BACKUP_FOUND;
                } catch (IOException e222222222) {
                    throw e222222222;
                }
            }
            b6Var = b6.NO_BACKUP_FOUND;
            a(b6Var);
            return true;
        } catch (IOException e2222222222) {
            throw e2222222222;
        }
    }

    static void a(GoogleDriveActivity googleDriveActivity, b6 b6Var) {
        googleDriveActivity.a(b6Var);
    }

    static void a(GoogleDriveActivity googleDriveActivity, boolean z) {
        googleDriveActivity.f(z);
    }

    public void e(int i) {
        if (i == 17) {
            try {
                Log.i(O[140]);
                i();
                if (!GoogleDriveService.c) {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        throw new IllegalStateException(O[141] + i);
    }

    private String a(@c7 int i) {
        switch (i) {
            case arj.Toolbar_navigationContentDescription /*21*/:
                try {
                    return O[158];
                } catch (IllegalStateException e) {
                    throw e;
                }
            case arj.Toolbar_logoDescription /*22*/:
                return O[162];
            case arj.Toolbar_titleTextColor /*23*/:
                return O[157];
            case arj.Toolbar_subtitleTextColor /*24*/:
                return O[163];
            case arj.Theme_actionMenuTextAppearance /*25*/:
                return O[160];
            case arj.Theme_actionMenuTextColor /*26*/:
                return O[164];
            case arj.Theme_actionModeStyle /*27*/:
                return O[159];
            default:
                throw new IllegalStateException(O[161] + i);
        }
    }

    private void i(int i) {
        Fragment promptDialogFragment = new PromptDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(O[52], i);
        bundle.putString(O[51], getString(2131231075));
        bundle.putBoolean(O[53], true);
        bundle.putString(O[49], getString(2131232318));
        bundle.putString(O[50], getString(2131230884));
        promptDialogFragment.setArguments(bundle);
        if (!fn.a((Activity) this)) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(promptDialogFragment, null);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    static Pair a(GoogleDriveActivity googleDriveActivity, bc bcVar) {
        return googleDriveActivity.a(bcVar);
    }

    public void onBackPressed() {
        Intent intent = new Intent(O[119]);
        intent.addCategory(O[118]);
        intent.setFlags(268435456);
        startActivity(intent);
    }

    public void onDestroy() {
        try {
            Log.i(O[165]);
            this.q = true;
            if (this.p != null) {
                this.p.a(this.y);
            }
            super.onDestroy();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static GoogleDriveRestoreAnimationView a(GoogleDriveActivity googleDriveActivity, GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView) {
        googleDriveActivity.I = googleDriveRestoreAnimationView;
        return googleDriveRestoreAnimationView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
        r3 = this;
        r0 = O;	 Catch:{ IllegalStateException -> 0x003d }
        r1 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x003d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x003d }
        r0 = r3.N;	 Catch:{ IllegalStateException -> 0x003d }
        if (r0 == 0) goto L_0x0013;
    L_0x000d:
        r0 = r3.N;	 Catch:{ IllegalStateException -> 0x003d }
        r0 = r0.i;	 Catch:{ IllegalStateException -> 0x003d }
        if (r0 != 0) goto L_0x002e;
    L_0x0013:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.gdrive.GoogleDriveService.class;
        r0.<init>(r3, r1);
        r1 = O;	 Catch:{ IllegalStateException -> 0x003f }
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x003f }
        r0.setAction(r1);	 Catch:{ IllegalStateException -> 0x003f }
        r1 = r3.getApplicationContext();	 Catch:{ IllegalStateException -> 0x003f }
        r1.startService(r0);	 Catch:{ IllegalStateException -> 0x003f }
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;	 Catch:{ IllegalStateException -> 0x003f }
        if (r0 == 0) goto L_0x0034;
    L_0x002e:
        r0 = r3.y;	 Catch:{ IllegalStateException -> 0x003f }
        r1 = 1;
        r0.a(r1);	 Catch:{ IllegalStateException -> 0x003f }
    L_0x0034:
        r0 = new com.whatsapp.gdrive.eb;
        r0.<init>(r3);
        r3.runOnUiThread(r0);
        return;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveActivity.f():void");
    }

    static boolean a(GoogleDriveActivity googleDriveActivity, String str, int i) {
        return googleDriveActivity.a(str, i);
    }

    static String a(GoogleDriveActivity googleDriveActivity, String str) {
        googleDriveActivity.r = str;
        return str;
    }

    public GoogleDriveActivity() {
        this.s = new bf(100);
        this.M = new ArrayList();
        this.u = new HashSet();
        this.x = new ConditionVariable(false);
        this.H = new ConditionVariable(false);
        this.o = new ConditionVariable(false);
        this.F = new AtomicBoolean(false);
        this.K = new AtomicBoolean(false);
        this.J = 21;
        this.B = true;
        this.G = new dl(this);
        this.L = new b_(this);
        this.y = new el(this);
    }

    static String r(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.r;
    }

    static GoogleDriveRestoreAnimationView b(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.I;
    }

    static c4 b(GoogleDriveActivity googleDriveActivity, c4 c4Var) {
        googleDriveActivity.N = c4Var;
        return c4Var;
    }

    static GoogleDriveService a(GoogleDriveActivity googleDriveActivity, GoogleDriveService googleDriveService) {
        googleDriveActivity.p = googleDriveService;
        return googleDriveService;
    }

    private void f(boolean z) {
        setTitle(2131230781);
        Log.i(O[38] + z + O[39]);
        super.c(z);
    }

    static int c(GoogleDriveActivity googleDriveActivity, int i) {
        googleDriveActivity.J = i;
        return i;
    }

    private void b(long j, long j2) {
        try {
            String string;
            auv.b();
            this.A = j;
            this.E = j2;
            a(this.E);
            if (j <= 0) {
                string = getString(2131231192);
            } else {
                string = getString(2131231190, new Object[]{l.a((Context) this, j)});
            }
            try {
                this.x.block();
                Log.i(O[138] + j + O[139] + j2);
                runOnUiThread(new aj(this, string));
                if (this.N != null && this.N.d == null) {
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static void a(GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.n();
    }

    private void d() {
        Fragment promptDialogFragment = new PromptDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(O[100], 16);
        bundle.putString(O[arj.Theme_buttonStyleSmall], getString(2131231241));
        bundle.putBoolean(O[98], false);
        bundle.putString(O[97], getString(2131231580));
        bundle.putString(O[99], getString(2131232028));
        promptDialogFragment.setArguments(bundle);
        if (!fn.a((Activity) this)) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(promptDialogFragment, O[96]);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    private void l() {
        try {
            Log.i(O[113] + (this.N == null ? O[112] : fn.a(this.N.f)));
            Log.i(O[114]);
            this.F.set(true);
            GoogleDriveService.B();
            GoogleDriveService.x();
            setResult(2);
            q();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onNewIntent(android.content.Intent r16) {
        /*
        r15 = this;
        r13 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = r16.getAction();
        r0 = -1;
        r2 = r1.hashCode();	 Catch:{ IllegalStateException -> 0x0041 }
        switch(r2) {
            case -1725923122: goto L_0x0033;
            default: goto L_0x000e;
        };
    L_0x000e:
        switch(r0) {
            case 0: goto L_0x0043;
            default: goto L_0x0011;
        };
    L_0x0011:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0169 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0169 }
        r1 = O;	 Catch:{ IllegalStateException -> 0x0169 }
        r2 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0169 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0169 }
        r1 = r16.getAction();	 Catch:{ IllegalStateException -> 0x0169 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0169 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0169 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0169 }
        r15.finish();	 Catch:{ IllegalStateException -> 0x0169 }
    L_0x0032:
        return;
    L_0x0033:
        r2 = O;	 Catch:{ IllegalStateException -> 0x0041 }
        r3 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0041 }
        r1 = r1.equals(r2);	 Catch:{ IllegalStateException -> 0x0041 }
        if (r1 == 0) goto L_0x000e;
    L_0x003f:
        r0 = 0;
        goto L_0x000e;
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r15);
        r1 = 2;
        r2 = new com.whatsapp.gdrive.cn;
        r2.<init>(r15);
        r3 = 0;
        r0 = com.whatsapp.gdrive.fn.a(r0, r15, r1, r2, r3);
        if (r0 == 0) goto L_0x006e;
    L_0x0054:
        r1 = com.whatsapp.gdrive.fn.a(r15);	 Catch:{ IllegalStateException -> 0x0157 }
        if (r1 != 0) goto L_0x006e;
    L_0x005a:
        r1 = r15.s();	 Catch:{ IllegalStateException -> 0x0159 }
        if (r1 != 0) goto L_0x006e;
    L_0x0060:
        r1 = O;	 Catch:{ IllegalStateException -> 0x015b }
        r2 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x015b }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x015b }
        r0.show();	 Catch:{ IllegalStateException -> 0x015b }
        if (r13 == 0) goto L_0x0032;
    L_0x006e:
        r0 = com.whatsapp.gdrive.GoogleDriveService.g();	 Catch:{ IllegalStateException -> 0x015d }
        if (r0 != 0) goto L_0x0079;
    L_0x0074:
        r15.i();	 Catch:{ IllegalStateException -> 0x015f }
        if (r13 == 0) goto L_0x0032;
    L_0x0079:
        r0 = com.whatsapp.gdrive.GoogleDriveService.m();	 Catch:{ IllegalStateException -> 0x015f }
        if (r0 == 0) goto L_0x010d;
    L_0x007f:
        r0 = O;
        r1 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = 2131755209; // 0x7f1000c9 float:1.914129E38 double:1.053227014E-314;
        r0 = r15.findViewById(r0);
        r1 = 8;
        r0.setVisibility(r1);
        r0 = 2131755210; // 0x7f1000ca float:1.9141293E38 double:1.0532270146E-314;
        r0 = r15.findViewById(r0);
        r1 = 0;
        r0.setVisibility(r1);
        r15.p();
        r15.n();
        r1 = com.whatsapp.gdrive.GoogleDriveService.g();
        r8 = com.whatsapp.gdrive.GoogleDriveService.k(r1);
        r6 = com.whatsapp.gdrive.GoogleDriveService.d(r1);
        r0 = 2131231181; // 0x7f0801cd float:1.8078436E38 double:1.05296811E-314;
        r0 = r15.getString(r0);
        r2 = 0;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x00c2;
    L_0x00be:
        r0 = com.whatsapp.util.cs.o(r15, r6);
    L_0x00c2:
        r2 = com.whatsapp.gdrive.GoogleDriveService.V();
        if (r2 != 0) goto L_0x016b;
    L_0x00c8:
        r2 = com.whatsapp.App.aH();
        r0 = com.whatsapp.util.cs.o(r15, r2);
        r12 = r0;
    L_0x00d1:
        r14 = com.whatsapp.util.l.a(r15, r8);
        r0 = r15.N;	 Catch:{ IllegalStateException -> 0x0161 }
        if (r0 != 0) goto L_0x00e9;
    L_0x00d9:
        r0 = new com.whatsapp.gdrive.c4;	 Catch:{ IllegalStateException -> 0x0161 }
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r10 = com.whatsapp.gdrive.GoogleDriveService.V();	 Catch:{ IllegalStateException -> 0x0161 }
        r11 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11);	 Catch:{ IllegalStateException -> 0x0161 }
        r15.N = r0;	 Catch:{ IllegalStateException -> 0x0161 }
    L_0x00e9:
        r0 = 2131755212; // 0x7f1000cc float:1.9141297E38 double:1.0532270156E-314;
        r0 = r15.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0163 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x0163 }
        r2 = 2131231246; // 0x7f08020e float:1.8078568E38 double:1.052968142E-314;
        r3 = 3;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalStateException -> 0x0163 }
        r4 = 0;
        r3[r4] = r1;	 Catch:{ IllegalStateException -> 0x0163 }
        r1 = 1;
        r3[r1] = r12;	 Catch:{ IllegalStateException -> 0x0163 }
        r1 = 2;
        r3[r1] = r14;	 Catch:{ IllegalStateException -> 0x0163 }
        r1 = r15.getString(r2, r3);	 Catch:{ IllegalStateException -> 0x0163 }
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x0163 }
        r15.f();	 Catch:{ IllegalStateException -> 0x0163 }
        if (r13 == 0) goto L_0x0032;
    L_0x010d:
        r0 = com.whatsapp.gdrive.GoogleDriveService.Y();	 Catch:{ IllegalStateException -> 0x0165 }
        if (r0 == 0) goto L_0x014c;
    L_0x0113:
        r0 = O;	 Catch:{ IllegalStateException -> 0x0167 }
        r1 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0167 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0167 }
        r0 = 2131755209; // 0x7f1000c9 float:1.914129E38 double:1.053227014E-314;
        r0 = r15.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0167 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x0167 }
        r0 = 2131755210; // 0x7f1000ca float:1.9141293E38 double:1.0532270146E-314;
        r0 = r15.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0167 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x0167 }
        r0 = 2131755212; // 0x7f1000cc float:1.9141297E38 double:1.0532270156E-314;
        r0 = r15.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0167 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x0167 }
        r1 = com.whatsapp.SettingsChat.a(r15);	 Catch:{ IllegalStateException -> 0x0167 }
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x0167 }
        r15.n();	 Catch:{ IllegalStateException -> 0x0167 }
        r0 = 1;
        r15.f(r0);	 Catch:{ IllegalStateException -> 0x0167 }
        if (r13 == 0) goto L_0x0032;
    L_0x014c:
        r15.q();	 Catch:{ IllegalStateException -> 0x0169 }
        r0 = 2;
        r15.setResult(r0);	 Catch:{ IllegalStateException -> 0x0169 }
        if (r13 == 0) goto L_0x0032;
    L_0x0155:
        goto L_0x0011;
    L_0x0157:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0159 }
    L_0x0159:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x015b }
    L_0x015b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x015d }
    L_0x015d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x015f }
    L_0x015f:
        r0 = move-exception;
        throw r0;
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0165 }
    L_0x0165:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0167 }
    L_0x0167:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0169 }
    L_0x0169:
        r0 = move-exception;
        throw r0;
    L_0x016b:
        r12 = r0;
        goto L_0x00d1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveActivity.onNewIntent(android.content.Intent):void");
    }

    private void a(b6 b6Var) {
        i.a((Context) this, bn.BACKUP_RESTORE_STATUS_OF_BACKUP_FOUND_AT_RESTORE_TIME, Integer.valueOf(b6Var.getCode()));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void e(boolean r9) {
        /*
        r8 = this;
        r7 = 0;
        r6 = 26;
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        com.whatsapp.auv.a();	 Catch:{ IllegalStateException -> 0x0014 }
        r1 = r8.v;	 Catch:{ IllegalStateException -> 0x0014 }
        if (r1 == 0) goto L_0x0016;
    L_0x000c:
        r0 = 2;
        r8.setResult(r0);	 Catch:{ IllegalStateException -> 0x0014 }
        r8.finish();	 Catch:{ IllegalStateException -> 0x0014 }
    L_0x0013:
        return;
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r1 = r8.J;	 Catch:{ IllegalStateException -> 0x0035 }
        if (r1 != r6) goto L_0x0037;
    L_0x001a:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0035 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0035 }
        r1 = O;	 Catch:{ IllegalStateException -> 0x0035 }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0035 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0035 }
        r0 = r0.append(r9);	 Catch:{ IllegalStateException -> 0x0035 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0035 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0035 }
        goto L_0x0013;
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0133 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0133 }
        r2 = O;	 Catch:{ IllegalStateException -> 0x0133 }
        r3 = 29;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0133 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0133 }
        r1 = r1.append(r9);	 Catch:{ IllegalStateException -> 0x0133 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0133 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0133 }
        r1 = 26;
        r8.J = r1;	 Catch:{ IllegalStateException -> 0x0133 }
        if (r9 == 0) goto L_0x005c;
    L_0x0057:
        r8.m();	 Catch:{ IllegalStateException -> 0x0135 }
        if (r0 == 0) goto L_0x0013;
    L_0x005c:
        r1 = r8.N;	 Catch:{ IllegalStateException -> 0x0137 }
        if (r1 == 0) goto L_0x009e;
    L_0x0060:
        r1 = r8.N;	 Catch:{ IllegalStateException -> 0x0139 }
        r1 = r1.h;	 Catch:{ IllegalStateException -> 0x0139 }
        if (r1 == 0) goto L_0x009e;
    L_0x0066:
        r1 = r8.u;	 Catch:{ IllegalStateException -> 0x013b }
        r2 = new android.accounts.Account;	 Catch:{ IllegalStateException -> 0x013b }
        r3 = r8.N;	 Catch:{ IllegalStateException -> 0x013b }
        r3 = r3.f;	 Catch:{ IllegalStateException -> 0x013b }
        r4 = O;	 Catch:{ IllegalStateException -> 0x013b }
        r5 = 32;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x013b }
        r2.<init>(r3, r4);	 Catch:{ IllegalStateException -> 0x013b }
        r1.add(r2);	 Catch:{ IllegalStateException -> 0x013b }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x013b }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x013b }
        r2 = O;	 Catch:{ IllegalStateException -> 0x013b }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x013b }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x013b }
        r2 = r8.N;	 Catch:{ IllegalStateException -> 0x013b }
        r2 = r2.f;	 Catch:{ IllegalStateException -> 0x013b }
        r2 = com.whatsapp.gdrive.fn.a(r2);	 Catch:{ IllegalStateException -> 0x013b }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x013b }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x013b }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x013b }
        if (r0 == 0) goto L_0x00aa;
    L_0x009e:
        r1 = 0;
        r8.B = r1;	 Catch:{ IllegalStateException -> 0x013b }
        r1 = O;	 Catch:{ IllegalStateException -> 0x013b }
        r2 = 28;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x013b }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x013b }
    L_0x00aa:
        r1 = r8.u;	 Catch:{ IllegalStateException -> 0x013d }
        r1 = r1.size();	 Catch:{ IllegalStateException -> 0x013d }
        r2 = r8.M;	 Catch:{ IllegalStateException -> 0x013d }
        r2 = r2.size();	 Catch:{ IllegalStateException -> 0x013d }
        if (r1 < r2) goto L_0x00bc;
    L_0x00b8:
        r1 = r8.B;	 Catch:{ IllegalStateException -> 0x013f }
        if (r1 == 0) goto L_0x0122;
    L_0x00bc:
        r1 = com.whatsapp.gdrive.fn.a(r8);	 Catch:{ IllegalStateException -> 0x013f }
        if (r1 != 0) goto L_0x0013;
    L_0x00c2:
        r1 = new com.whatsapp.gdrive.PromptDialogFragment;
        r1.<init>();
        r2 = new android.os.Bundle;
        r2.<init>();
        r3 = O;
        r4 = 30;
        r3 = r3[r4];
        r4 = 18;
        r2.putInt(r3, r4);
        r3 = O;
        r3 = r3[r6];
        r4 = 2131231224; // 0x7f0801f8 float:1.8078523E38 double:1.052968131E-314;
        r4 = r8.getString(r4);
        r2.putString(r3, r4);
        r3 = O;
        r4 = 27;
        r3 = r3[r4];
        r2.putBoolean(r3, r7);
        r3 = O;
        r4 = 24;
        r3 = r3[r4];
        r4 = 2131231837; // 0x7f08045d float:1.8079766E38 double:1.052968434E-314;
        r4 = r8.getString(r4);
        r2.putString(r3, r4);
        r3 = O;
        r4 = 25;
        r3 = r3[r4];
        r4 = 2131232028; // 0x7f08051c float:1.8080154E38 double:1.0529685284E-314;
        r4 = r8.getString(r4);
        r2.putString(r3, r4);
        r1.setArguments(r2);
        r2 = r8.getSupportFragmentManager();
        r2 = r2.beginTransaction();
        r3 = 0;
        r2.add(r1, r3);	 Catch:{ IllegalStateException -> 0x0131 }
        r2.commitAllowingStateLoss();	 Catch:{ IllegalStateException -> 0x0131 }
        if (r0 == 0) goto L_0x0013;
    L_0x0122:
        r8.m();	 Catch:{ IllegalStateException -> 0x0131 }
        r0 = 2131231490; // 0x7f080302 float:1.8079062E38 double:1.0529682625E-314;
        r0 = r8.getString(r0);	 Catch:{ IllegalStateException -> 0x0131 }
        com.whatsapp.App.a(r8, r0);	 Catch:{ IllegalStateException -> 0x0131 }
        goto L_0x0013;
    L_0x0131:
        r0 = move-exception;
        throw r0;
    L_0x0133:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0135 }
    L_0x0135:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0137 }
    L_0x0137:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0139 }
    L_0x0139:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x013b }
    L_0x013b:
        r0 = move-exception;
        throw r0;
    L_0x013d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x013f }
    L_0x013f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveActivity.e(boolean):void");
    }

    private long k() {
        return App.z().getSharedPreferences(O[36], 0).getLong(O[37], 0);
    }

    private void q() {
        Log.i(O[85]);
        this.v = true;
        c(false);
        GoogleDriveNewUserSetupActivity.a(System.currentTimeMillis() + 604800000);
    }

    static void u(GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.i();
    }

    private void m() {
        try {
            boolean z;
            TextView textView;
            String a;
            Object obj;
            CharSequence a2;
            Button button;
            if (this.N != null) {
                if (this.N.f != null) {
                    try {
                        if (!this.N.i) {
                            z = true;
                            if (this.I == null) {
                                this.I = (GoogleDriveRestoreAnimationView) findViewById(2131755224);
                            }
                            this.I.c();
                            findViewById(2131755217).setVisibility(8);
                            if (this.z != null) {
                                this.z.setVisibility(8);
                            }
                            if (this.D != null) {
                                this.D.setVisibility(8);
                            }
                            try {
                                if (this.w == null) {
                                    this.w = (TextView) findViewById(2131755227);
                                }
                                this.w.setVisibility(8);
                                textView = (TextView) findViewById(2131755228);
                                textView.setVisibility(0);
                                if (z) {
                                    GoogleDriveService.ax();
                                    a = App.az.a(2131296275, App.aK.p(), new Object[]{Integer.valueOf(App.aK.p())});
                                    if (!GoogleDriveService.c) {
                                        obj = a;
                                        Log.i(O[121] + a2);
                                        textView.setText(a2);
                                        button = (Button) findViewById(2131755229);
                                        button.setVisibility(0);
                                        button.setOnClickListener(new ey(this, z));
                                    }
                                }
                                a2 = App.az.a(2131296276, App.aK.p(), new Object[]{Integer.valueOf(App.aK.p())});
                                Log.i(O[121] + a2);
                                textView.setText(a2);
                                button = (Button) findViewById(2131755229);
                                button.setVisibility(0);
                                button.setOnClickListener(new ey(this, z));
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            }
            z = false;
            try {
                if (this.I == null) {
                    this.I = (GoogleDriveRestoreAnimationView) findViewById(2131755224);
                }
                try {
                    this.I.c();
                    findViewById(2131755217).setVisibility(8);
                    if (this.z != null) {
                        this.z.setVisibility(8);
                    }
                    try {
                        if (this.D != null) {
                            this.D.setVisibility(8);
                        }
                        if (this.w == null) {
                            this.w = (TextView) findViewById(2131755227);
                        }
                        this.w.setVisibility(8);
                        textView = (TextView) findViewById(2131755228);
                        textView.setVisibility(0);
                        if (z) {
                            GoogleDriveService.ax();
                            a = App.az.a(2131296275, App.aK.p(), new Object[]{Integer.valueOf(App.aK.p())});
                            if (GoogleDriveService.c) {
                                obj = a;
                                Log.i(O[121] + a2);
                                textView.setText(a2);
                                button = (Button) findViewById(2131755229);
                                button.setVisibility(0);
                                button.setOnClickListener(new ey(this, z));
                            }
                        }
                        a2 = App.az.a(2131296276, App.aK.p(), new Object[]{Integer.valueOf(App.aK.p())});
                        Log.i(O[121] + a2);
                        textView.setText(a2);
                        button = (Button) findViewById(2131755229);
                        button.setVisibility(0);
                        button.setOnClickListener(new ey(this, z));
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }

    static void i(GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.r();
    }

    static void a(GoogleDriveActivity googleDriveActivity, long j, long j2) {
        googleDriveActivity.b(j, j2);
    }

    static void t(GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.d();
    }

    static void d(GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.l();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
        r4 = this;
        r2 = 1;
        r3 = -1;
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = 2;
        if (r5 != r1) goto L_0x000c;
    L_0x0007:
        r4.i();	 Catch:{ IllegalStateException -> 0x00ae }
        if (r0 == 0) goto L_0x00ad;
    L_0x000c:
        if (r5 != r2) goto L_0x002b;
    L_0x000e:
        if (r6 != r3) goto L_0x00ad;
    L_0x0010:
        r1 = O;	 Catch:{ IllegalStateException -> 0x00b4 }
        r2 = 74;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00b4 }
        r1 = r7.getStringExtra(r1);	 Catch:{ IllegalStateException -> 0x00b4 }
        r4.r = r1;	 Catch:{ IllegalStateException -> 0x00b4 }
        r1 = r4.o;	 Catch:{ IllegalStateException -> 0x00b4 }
        r1.open();	 Catch:{ IllegalStateException -> 0x00b4 }
        r1 = new com.whatsapp.gdrive.eg;	 Catch:{ IllegalStateException -> 0x00b4 }
        r1.<init>(r4);	 Catch:{ IllegalStateException -> 0x00b4 }
        com.whatsapp.util.bq.a(r1);	 Catch:{ IllegalStateException -> 0x00b4 }
        if (r0 == 0) goto L_0x00ad;
    L_0x002b:
        r1 = 3;
        if (r5 != r1) goto L_0x0078;
    L_0x002e:
        if (r6 != r3) goto L_0x0055;
    L_0x0030:
        r1 = r7.getExtras();
        r2 = O;
        r3 = 78;
        r2 = r2[r3];
        r1 = r1.getString(r2);
        if (r1 != 0) goto L_0x004b;
    L_0x0040:
        r2 = O;	 Catch:{ IllegalStateException -> 0x00b8 }
        r3 = 76;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00b8 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x00b8 }
        if (r0 == 0) goto L_0x0053;
    L_0x004b:
        r2 = new com.whatsapp.gdrive.f3;	 Catch:{ IllegalStateException -> 0x00b8 }
        r2.<init>(r4, r1);	 Catch:{ IllegalStateException -> 0x00b8 }
        com.whatsapp.util.bq.a(r2);	 Catch:{ IllegalStateException -> 0x00b8 }
    L_0x0053:
        if (r0 == 0) goto L_0x00ad;
    L_0x0055:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00ba }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00ba }
        r2 = O;	 Catch:{ IllegalStateException -> 0x00ba }
        r3 = 75;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00ba }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00ba }
        r1 = r1.append(r6);	 Catch:{ IllegalStateException -> 0x00ba }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x00ba }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IllegalStateException -> 0x00ba }
        r1 = 1;
        r4.v = r1;	 Catch:{ IllegalStateException -> 0x00ba }
        r1 = 0;
        r4.c(r1);	 Catch:{ IllegalStateException -> 0x00ba }
        if (r0 == 0) goto L_0x00ad;
    L_0x0078:
        r1 = 4;
        if (r5 != r1) goto L_0x00aa;
    L_0x007b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = O;
        r3 = 73;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = new android.content.Intent;
        r2 = com.whatsapp.gdrive.GoogleDriveActivity.class;
        r1.<init>(r4, r2);
        r2 = O;	 Catch:{ IllegalStateException -> 0x00bc }
        r3 = 77;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00bc }
        r1.setAction(r2);	 Catch:{ IllegalStateException -> 0x00bc }
        r4.startActivity(r1);	 Catch:{ IllegalStateException -> 0x00bc }
        if (r0 == 0) goto L_0x00ad;
    L_0x00aa:
        super.onActivityResult(r5, r6, r7);	 Catch:{ IllegalStateException -> 0x00bc }
    L_0x00ad:
        return;
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    static boolean w(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.s();
    }

    protected void h(int i) {
        try {
            if (i - this.C > 0) {
                this.C = i;
                if (i % 10 == 0) {
                    Log.i(O[120] + i + "%");
                }
                if (i <= 100) {
                    try {
                        if (this.D != null) {
                            this.D.setText(getString(2131231936, new Object[]{Integer.valueOf(i)}));
                        }
                        try {
                            if (this.z != null) {
                                this.z.setIndeterminate(true);
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    static ConditionVariable n(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.o;
    }

    static boolean b(GoogleDriveActivity googleDriveActivity, boolean z) {
        googleDriveActivity.v = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    private android.util.Pair a(@android.support.annotation.NonNull com.whatsapp.gdrive.bc r14) {
        /*
        r13 = this;
        r10 = 1;
        r1 = 0;
        r3 = 0;
        r5 = com.whatsapp.gdrive.GoogleDriveService.c;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c(r13);
        r4 = com.whatsapp.gdrive.GoogleDriveService.d(r13);
        r0 = O;
        r6 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r0 = r0[r6];
        r6 = new java.util.ArrayList;
        r6.<init>();
        r7 = com.whatsapp.azf.f();
        r8 = r7.length;
        r0 = r1;
    L_0x001e:
        if (r0 >= r8) goto L_0x0031;
    L_0x0020:
        r9 = r7[r0];
        r9 = r9.getAbsolutePath();
        r9 = com.whatsapp.gdrive.fn.b(r9);
        r6.add(r9);
        r0 = r0 + 1;
        if (r5 == 0) goto L_0x001e;
    L_0x0031:
        if (r2 != 0) goto L_0x0046;
    L_0x0033:
        r0 = O;	 Catch:{ IllegalStateException -> 0x0044 }
        r1 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0044 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0044 }
        r0 = new android.util.Pair;	 Catch:{ IllegalStateException -> 0x0044 }
        r1 = 0;
        r2 = 0;
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0044 }
    L_0x0043:
        return r0;
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = new java.util.ArrayList;
        r7 = 3;
        r7 = new java.lang.String[r7];
        r7[r1] = r2;
        r7[r10] = r4;
        r1 = 2;
        r8 = O;
        r9 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r8 = r8[r9];
        r7[r1] = r8;
        r1 = java.util.Arrays.asList(r7);
        r0.<init>(r1);
        r0.addAll(r6);
        r1 = O;
        r7 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r1 = r1[r7];
        r7 = com.whatsapp.gdrive.GoogleDriveService.v;
        r7 = r14.a(r0, r1, r7, r10);
        if (r7 != 0) goto L_0x0083;
    L_0x0070:
        r0 = O;	 Catch:{ IllegalStateException -> 0x0081 }
        r1 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0081 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0081 }
        r0 = new android.util.Pair;	 Catch:{ IllegalStateException -> 0x0081 }
        r1 = 0;
        r2 = 0;
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0081 }
        goto L_0x0043;
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r8 = r7.iterator();
    L_0x008c:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x00ca;
    L_0x0092:
        r0 = r8.next();
        r0 = (com.whatsapp.gdrive.fs) r0;
        r9 = r0.e();	 Catch:{ IllegalStateException -> 0x011a }
        r9 = r2.equals(r9);	 Catch:{ IllegalStateException -> 0x011a }
        if (r9 == 0) goto L_0x00a5;
    L_0x00a2:
        r1.add(r0);	 Catch:{ IllegalStateException -> 0x011a }
    L_0x00a5:
        r9 = r0.e();	 Catch:{ IllegalStateException -> 0x011c }
        r9 = r6.contains(r9);	 Catch:{ IllegalStateException -> 0x011c }
        if (r9 != 0) goto L_0x00bf;
    L_0x00af:
        r9 = O;	 Catch:{ IllegalStateException -> 0x011e }
        r10 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x011e }
        r10 = r0.e();	 Catch:{ IllegalStateException -> 0x011e }
        r9 = r9.equals(r10);	 Catch:{ IllegalStateException -> 0x011e }
        if (r9 == 0) goto L_0x00c8;
    L_0x00bf:
        r9 = r13.s;	 Catch:{ IllegalStateException -> 0x011e }
        r10 = r0.g();	 Catch:{ IllegalStateException -> 0x011e }
        r9.put(r10, r0);	 Catch:{ IllegalStateException -> 0x011e }
    L_0x00c8:
        if (r5 == 0) goto L_0x008c;
    L_0x00ca:
        r0 = r1.size();
        if (r0 != 0) goto L_0x0122;
    L_0x00d0:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = O;
        r6 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r2 = r2[r6];
        r0 = r0.append(r2);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r2 = r7.iterator();
    L_0x00ee:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0109;
    L_0x00f4:
        r0 = r2.next();
        r0 = (com.whatsapp.gdrive.fs) r0;
        r6 = r0.e();	 Catch:{ IllegalStateException -> 0x0120 }
        r6 = r4.equals(r6);	 Catch:{ IllegalStateException -> 0x0120 }
        if (r6 == 0) goto L_0x0107;
    L_0x0104:
        r1.add(r0);	 Catch:{ IllegalStateException -> 0x0120 }
    L_0x0107:
        if (r5 == 0) goto L_0x00ee;
    L_0x0109:
        r0 = r1.size();	 Catch:{ IllegalStateException -> 0x0118 }
        if (r0 != 0) goto L_0x0122;
    L_0x010f:
        r0 = new android.util.Pair;	 Catch:{ IllegalStateException -> 0x0118 }
        r1 = 0;
        r2 = 0;
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0118 }
        goto L_0x0043;
    L_0x0118:
        r0 = move-exception;
        throw r0;
    L_0x011a:
        r0 = move-exception;
        throw r0;
    L_0x011c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x011e }
    L_0x011e:
        r0 = move-exception;
        throw r0;
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r6 = r1.iterator();
        r2 = r3;
        r4 = r3;
    L_0x0128:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0234;
    L_0x012e:
        r0 = r6.next();
        r0 = (com.whatsapp.gdrive.fs) r0;
        r1 = O;
        r8 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r1 = r1[r8];
        r1 = r0.b(r1);
        r8 = r13.s;
        r8 = r8.containsKey(r1);
        if (r8 == 0) goto L_0x01dd;
    L_0x0146:
        r8 = r13.s;
        r1 = r8.get(r1);
        r1 = (com.whatsapp.gdrive.fs) r1;
    L_0x014e:
        if (r1 != 0) goto L_0x016c;
    L_0x0150:
        r8 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0229 }
        r8.<init>();	 Catch:{ IllegalStateException -> 0x0229 }
        r9 = O;	 Catch:{ IllegalStateException -> 0x0229 }
        r10 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x0229 }
        r8 = r8.append(r9);	 Catch:{ IllegalStateException -> 0x0229 }
        r8 = r8.append(r0);	 Catch:{ IllegalStateException -> 0x0229 }
        r8 = r8.toString();	 Catch:{ IllegalStateException -> 0x0229 }
        com.whatsapp.util.Log.e(r8);	 Catch:{ IllegalStateException -> 0x0229 }
        if (r5 == 0) goto L_0x022d;
    L_0x016c:
        r8 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x022b }
        r8.<init>();	 Catch:{ IllegalStateException -> 0x022b }
        r9 = O;	 Catch:{ IllegalStateException -> 0x022b }
        r10 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x022b }
        r8 = r8.append(r9);	 Catch:{ IllegalStateException -> 0x022b }
        r8 = r8.append(r0);	 Catch:{ IllegalStateException -> 0x022b }
        r9 = O;	 Catch:{ IllegalStateException -> 0x022b }
        r10 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x022b }
        r8 = r8.append(r9);	 Catch:{ IllegalStateException -> 0x022b }
        r9 = O;	 Catch:{ IllegalStateException -> 0x022b }
        r10 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x022b }
        r8 = r8.append(r9);	 Catch:{ IllegalStateException -> 0x022b }
        r8 = r8.toString();	 Catch:{ IllegalStateException -> 0x022b }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IllegalStateException -> 0x022b }
        if (r2 == 0) goto L_0x01a8;
    L_0x019c:
        r8 = r1.c();	 Catch:{ IllegalStateException -> 0x022b }
        r10 = r2.c();	 Catch:{ IllegalStateException -> 0x022b }
        r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r8 <= 0) goto L_0x022d;
    L_0x01a8:
        r12 = r1;
        r1 = r0;
        r0 = r12;
    L_0x01ab:
        if (r5 == 0) goto L_0x0238;
    L_0x01ad:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = O;
        r4 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r3 = O;
        r4 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = new android.util.Pair;
        r2.<init>(r1, r0);
        r0 = r2;
        goto L_0x0043;
    L_0x01dd:
        if (r1 == 0) goto L_0x01f9;
    L_0x01df:
        r8 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0225 }
        r8.<init>();	 Catch:{ IllegalStateException -> 0x0225 }
        r9 = O;	 Catch:{ IllegalStateException -> 0x0225 }
        r10 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x0225 }
        r8 = r8.append(r9);	 Catch:{ IllegalStateException -> 0x0225 }
        r1 = r8.append(r1);	 Catch:{ IllegalStateException -> 0x0225 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0225 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IllegalStateException -> 0x0225 }
    L_0x01f9:
        r8 = r7.iterator();
    L_0x01fd:
        r1 = r8.hasNext();
        if (r1 == 0) goto L_0x0231;
    L_0x0203:
        r1 = r8.next();
        r1 = (com.whatsapp.gdrive.fs) r1;
        r9 = O;	 Catch:{ IllegalStateException -> 0x0227 }
        r10 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x0227 }
        r10 = r1.e();	 Catch:{ IllegalStateException -> 0x0227 }
        r9 = r9.equals(r10);	 Catch:{ IllegalStateException -> 0x0227 }
        if (r9 == 0) goto L_0x01fd;
    L_0x0219:
        r9 = r0.g();	 Catch:{ IllegalStateException -> 0x0227 }
        r9 = r1.a(r9);	 Catch:{ IllegalStateException -> 0x0227 }
        if (r9 == 0) goto L_0x01fd;
    L_0x0223:
        goto L_0x014e;
    L_0x0225:
        r0 = move-exception;
        throw r0;
    L_0x0227:
        r0 = move-exception;
        throw r0;
    L_0x0229:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x022b }
    L_0x022b:
        r0 = move-exception;
        throw r0;
    L_0x022d:
        r0 = r2;
        r1 = r4;
        goto L_0x01ab;
    L_0x0231:
        r1 = r3;
        goto L_0x014e;
    L_0x0234:
        r0 = r2;
        r1 = r4;
        goto L_0x01ad;
    L_0x0238:
        r2 = r0;
        r4 = r1;
        goto L_0x0128;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveActivity.a(com.whatsapp.gdrive.bc):android.util.Pair");
    }

    private void o() {
        Log.i(O[47]);
        Intent intent = new Intent(this, GoogleDriveService.class);
        intent.setAction(O[48]);
        getApplicationContext().startService(intent);
    }

    static void a(GoogleDriveActivity googleDriveActivity, b6 b6Var) {
        googleDriveActivity.a(b6Var);
    }

    static void q(GoogleDriveActivity googleDriveActivity) {
        googleDriveActivity.q();
    }

    static AtomicBoolean e(GoogleDriveActivity googleDriveActivity) {
        return googleDriveActivity.F;
    }
}
