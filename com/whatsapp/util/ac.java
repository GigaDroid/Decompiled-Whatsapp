package com.whatsapp.util;

import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ac {
    private static final String[] a;
    private static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    private static final Pattern[] f;
    private static final String[] z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 24;
                    break;
                case at.g /*1*/:
                    i2 = 10;
                    break;
                case at.i /*2*/:
                    i2 = 90;
                    break;
                case at.o /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 21);
        }
        return toCharArray;
    }

    public static boolean a(CharSequence charSequence) {
        Matcher matcher = c.matcher(charSequence);
        while (matcher.find()) {
            if (a(matcher.group(3))) {
                return true;
            }
        }
        return false;
    }

    private static final void a(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    public static String d(String str) {
        String c = c(str);
        return c != null ? b(c) : null;
    }

    public static final String b(String str) {
        return a(str, a);
    }

    public static ArrayList g(String str) {
        ArrayList arrayList = null;
        int i = Log.h;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList2;
        Matcher matcher = c.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            if (!((start != 0 && str.charAt(start - 1) == '@' && i == 0) || (a(matcher.group(3)) && i == 0))) {
                String group = matcher.group(0);
                if (f(group) || i != 0) {
                    boolean z;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 < a.length) {
                        if (group.regionMatches(true, 0, a[i2], 0, a[i2].length())) {
                            if (i == 0) {
                                z = true;
                                break;
                            }
                            z = true;
                        } else {
                            z = z2;
                        }
                        int i3 = i2 + 1;
                        if (i != 0) {
                            break;
                        }
                        i2 = i3;
                        z2 = z;
                    }
                    z = z2;
                    if (z || i != 0) {
                        if (arrayList == null) {
                            arrayList2 = new ArrayList();
                        } else {
                            arrayList2 = arrayList;
                        }
                        group = b(group);
                        if (!arrayList2.contains(group)) {
                            arrayList2.add(group);
                        }
                        if (i != 0) {
                            break;
                        }
                        arrayList = arrayList2;
                    }
                }
            }
        }
        arrayList2 = arrayList;
        return arrayList2;
    }

    static {
        String[] strArr = new String[6];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "p~.?/7%";
        int i2 = -1;
        while (true) {
            str = z(z(str));
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "P~.?/7%";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "o}-a";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "p~.?f\"%u";
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "O}-a";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    str = "0\"r} C:wzHd8\u0001\u007f8,W\u0001\u007f8!W&\u0014%5;\u0007\u0014%53\u00074'ev\u0001~8!W\u0001\u007f8!W&\u0014$53\u0007fI6\"hzN('o\u0012i*Qjb!EQjb,Ev\u0001\u007f8)W\u0001\u007f8!W!}hdQkb,EQjb,Ev\u0001~8!W&\u007f<D$r} C:wzHd8\u0001\u007f8,W\u0001\u007f8!W&\u0014%5;\u0007\u0014%53\u00074'ev\u0001~8!W\u0001\u007f8!W&\u0014$53\u00073%1Vtg'-Qjb Evh\u0014%5>\u0007\u0014%53\u00073N('k\u0012N('c\u0012n*w&\u0014$53\u0007\u0014%53\u00073N('c\u0012<1vr\u0014%53;bsY'\u001c\u0012n(&n2\u00b8\"#!}9/wr\u00e2/dQjb,y'<\u000e8^W!~9,wsf";
                    i2 = -1;
                    while (true) {
                        str = z(z(str));
                        switch (i2) {
                            case v.m /*0*/:
                                c = Pattern.compile(str);
                                str = "F\"rp/0b.;edb.;ekv\u0012;ahv\u0012;ahy&=akz&\u001dakzsuI7Vug*\"\"euNy' \u000e8B:wvI<Vw\u0013JD$\u0006dI9Vp\u00132D\"\u0006fI4Va\u0013*D,\u0006rHd\"euI=Q;bsY'\u001c\u007f8!W!}h1#!~9.>'g*\"V`g*\"Q;boY'\u0000\u007f8!V~\u00138DU\u0006aI3V{\u0013?D-\u0006gI1Vv\u0013.D5\u0006iI%W&g*\"V\u007f\u0014t5l\u001bbS('c\u0012n*wsfn)&hzh15\u0006\u000f<'#eg='0rp/Ckw5T5Pjb,\u00b8'\ud7a5\uf94f8\ufdd7\ufdfaw\uffa0HCkw5T5Pjb,\u00b8'\ud7a5\uf94f8\ufdd7\ufdfaw\uffa0I5W!\u007f9.>'\u0013;1!rp/05`.pje&.ghk&.fqk&.N{n?)rqf7!zix);`or \u0012<d\"euwqp&-Nyh>*s\u007fb3%xve(<an}#5H1vrp/{k.3vwg&,zwz&,Nyi>)rpc1#xve(:c`s \u0012<dn\u0001*\u007fsg55Hd\"eup|\u007f&*N{o==fl\u007f\u0007fi~Q3%~ue(\u0012i05`(znv=\u0014tzn?)rpc6\"{h{(<am}#\u0012<db\u0001$xvx.:Hd\"eu|vl53|v~&&N|o6\"{w{(<aE#&g*\"`5-fd`\u0001*xwz\u0007fisQ?(}qg4?gos \u0012itQ;-vqa(<am|#\u0012i05`\"|tv7 wqv7:f}\u007f73xCk9+p\u007fb1#xve*>gk~/9b`s \u0012<d\"eu{yg?3{}~&!Nyi?)rqf5?gmp\u0007fi05` g\u007fv5\"<d\"eueje&?Nyo<(}sf7!gk~-6H1v+.ijQ? fm}\u00073fCk8,q}m2&\u007fsf7!zj~/9lbW&g*\"~?#ilx;9ptv.\u0014v|l='\u007fsf7!zhx.9bbWs3`Ck=$fap\u00073cCk9*rqd/\u0012ioQ<<Hd\"eu\u03a1\u03a7\u03b0\u03e3\u03f3\u03bbd\u0432\u041b\u0470\u045e\u045a\u043a\u0467\u0477\u0420d\u044a\u041e3\u0454\u0458\u043b&\u0597\u05f7\u05f9\u05d2&\u066d\u0627\u065d\u062d\u0696\u067b\u06d9d\u062f\u0674\u0665\u063d\u063f\u063b&\u0668\u0651\u063f\u063b\u0675\u0609i\u063f\u064e\u0676\u067d\u0632\u063e\u063b&\u0668\u0651\u062b\u0633\u0612\u0660\u065f\u0631v\u067d\u060b\u0650\u0622\u063b\u06723\u0632\u065d\u062d\u066b\u0668\u063fd\u0622\u06e4\u0668\u0624\u0632v\u0670\u0607\u0653\u062bv\u0669\u0607\u0624\u0652\u0623&\u060e\u0651\u062b\u063d\u0610\u0609i\u065a\u063d\u066b3\u0650\u062d\u063b&\u0965\u0925\u0958\u091f\u0917\u0978\u092bd\u0927\u0964\u097f\u0931d\u09a7\u09e4\u09ff\u09b1d\u0a27\u0a64\u0a7f\u0a31d\u0aa7\u0ae4\u0aff\u0ab1d\u0b8d\u0bf2\u0b82\u0bb1\u0ba7\u0ba5\u0be43\u0b92\u0baa\u0b93\u0b97\u0bda\u0bddd\u0b90\u0be5\u0bd6\u0bd8\u0b8d\u0ba0\u0b97\u0be5\u0bd7\u0ba8\u0bc7&\u0be5\u0ba5\u0ba7\u0b95\u0b97\u0bd5\u0bddd\u0c27\u0c64\u0c7f\u0c31\u0c55v\u0de7\u0dcd\u0d8f\u0dd7v\u0e1e\u0e58\u0e37d\u30cc\u30e3\u3087i\u4e35\u56f7&\u4e62\u571ed\u53fa\u6e243\u53e5\u707bv\u65ea\u52ef\u5774d\u6d41\u8b8f3\u6e39\u8a7ev\u99c3\u6e60i\ud154\uc2ae\ud2e23\ud549\uad75v\"!I5Vw\u007foogoyqdr4\u00138D'k~w-h)|t!k0yrdr4\u00138D'i*%z=jxpdr4\u00138D'nzwj`c,i`d\u0006bI52j.~ph#${r><3mvVw\u00138!:;|t{v\"!I5Vwva,hk~lq?;3mvVw\u00138{f9'v(o;\u007fw*mh.,\u007fi>3mvVw\u00138|o8.%yn&7{D'\u0006bsq{)wfdr4\u00138D'<&db3)3mvVw\u00138~z9=\u007f!ii+i`d\u0006bI5l ,'{3?}vdr4\u00138D'=yb*?k+i`d\u0006bI5m?,gr393mvVw\u00138p88=\u007f!i&7{D'\u0006b}\u007fh1ytr=<z&zh;3mvVw\u00138pf9%#ys;vpkim.i`d\u0006bI5`l8$!9=3mvVw\u00138rr;#e|f*3mvVw\u00138sm8*vp~,3mvVw\u00138sz(8$+n&7{D'\u0006b~hx#z\"|v\"!I5Vw#rzh;;$ynb%i`d\u0006bI5g=-tygm.-pv\"!I5Vw\"rzk#'\"\u007fz;3mvVw\u00138um8-})km~pdr4\u00138D'7(w{:;vtbi=3mvVw\u00138um8*gh>;zq,k(3mvVw\u00138w998!pv\"!I5Vw rzz<wstv\"!I5Vw?$yc&7{D'\u0006be\u007fh)\u007fqpv\"!I5Vw<,zx0vvdr4\u00138D'-(wp;93mvVw\u00138om8##yv\"!I5Vw7~{8;#&ps?}tdr4\u00138D'\"$v*n6|t-o?\u007f}dr4\u00138D'#)gw>3y\"wv\"!I5Vw6rzch.xur&7{D'\u0006bo{a .}dr\"7<ds\u0001*aEv \u0014tu}\u0007f<1\"euI\"V>4$4?'f*1\"\u0006`='0rp/Ckw5T5Pjb,\u00b8'\ud7a5\uf94f8\ufdd7\ufdfaw\uffa0I#Vu\u0013*D0\u0006\u000fI>Vg\u00136Dt\u0006bI6Vq\u00134D \u0006hI0Vs\u00139DU\u0007fi05`\u00130Ckw)T5Ljb,Eqh2<1 sp='0\u0006-i<#";
                                i2 = 1;
                                break;
                            case at.g /*1*/:
                                e = Pattern.compile(str);
                                String[] strArr4 = new String[3];
                                str = "p~.?/7%";
                                i2 = 5;
                                strArr2 = strArr4;
                                strArr3 = strArr4;
                                i = 0;
                                continue;
                            default:
                                b = Pattern.compile(str);
                                d = Pattern.compile(z(z("0\"euNy' \u000e8B:wv\u00b55\ud7f5\uf95ab\ufdda\ufde8'\uffb5\u0012='0\u0001.8bKw\u0015%53\u00fab\ud7ea\uf918'\ufd95\ufdbf8\ufff7Vw\u0012n(&l~hCkw5T5Pjb,\u00b8'\ud7a5\uf94f8\ufdd7\ufdfaw\uffa0H1qjc$eVtf>0Q;boY'\u0000\u00ef8\ud7e7\uf90aw\ufd80\ufde55\uffe5\u00074'4<i2<d")) + b + ")");
                                str = "0\"eu=p~.?ip~.?fdB.;edB.;ekv(;fhv\b;fh#`\u0013:D%rp/05`\u0014t5p\u001bbO('c\u00131D'\u0006\u0010I6Vq\u00134D \u0006hI0Vs\u00139D1\u0006pI>Vg\u0012i05`\u00130Ckw)T5Ljb,Eqh2<1qkc#,wrp/D0rp/Ckw5T5Pjb,D.\u0006bIGVt\u0013>D+\u0006eI?Vr\u0013<D&\u0006tI'V|\u0013(Evrp/D/\u0001.8~Kw\t%53\u00074'e#s4$48o2<'V\u001af*15rg*\"Q;boY'\u0000\u007f8!\u00aaw\ud7b0\uf9155\ufdc5\ufdaab\ufffaE\"euNy' \u000e8B:wv\u00b55\ud7f5\uf95ab\ufdda\ufde8'\uffb5\u00138Eqjc#)w\u0001.8bKw\u0015%53\u00fab\ud7ea\uf918'\ufd95\ufdbf8\ufff7Ws4%4;'\u0013;1!r\u0014t5p\u001bbO\u00b8'\ud7a5\uf94f8\ufdd7\ufdfaw\uffa0Hc8vy&e#sg*\"V`\u0013qc;vzh15sgI7\"eu='0\u0001.8bKw\u0015%53\u00fab\ud7ea\uf918'\ufd95\ufdbf8\ufff7Va\u0013:D5\u0006uIXV|\u0013(D)\u00061I5Vt\u0013>D+\u0006eI?Vr\u0013<D&\u0006\u0010H1vrp/D/\u0001.8~Kw\t%53\u00074'e#se<'\"euIzv~f";
                                i2 = 0;
                                break;
                        }
                    }
                case at.m /*5*/:
                    strArr2[i] = str;
                    str = "p~.?f\"%u";
                    i2 = 6;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "j~)?/7%";
                    i2 = 7;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    a = strArr3;
                    f = new Pattern[]{Pattern.compile(z(z("0V\r3Iz#.*y}m(.x0Vt\u0013b3#!~9*w\u00065")), 2)};
                    return;
                default:
                    strArr2[i] = str;
                    str = "P~.?f\"%u";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    public static boolean e(String str) {
        if (str.startsWith(z[0]) || str.startsWith(z[4]) || str.startsWith(z[2]) || str.startsWith(z[1]) || str.startsWith(z[3]) || str.startsWith(z[5])) {
            return true;
        }
        return false;
    }

    private static final String a(String str, String[] strArr) {
        boolean z = true;
        int i = Log.h;
        int i2 = 0;
        boolean z2 = false;
        String str2 = str;
        while (i2 < strArr.length) {
            if (str2.regionMatches(true, 0, strArr[i2], 0, strArr[i2].length())) {
                if (!str2.regionMatches(false, 0, strArr[i2], 0, strArr[i2].length())) {
                    str2 = strArr[i2] + str2.substring(strArr[i2].length());
                    if (i == 0) {
                        break;
                    }
                    boolean z3 = true;
                    str = str2;
                } else {
                    break;
                }
            }
            z3 = z2;
            str = str2;
            int i3 = i2 + 1;
            if (i != 0) {
                z = z3;
                str2 = str;
                break;
            }
            i2 = i3;
            z2 = z3;
            str2 = str;
        }
        z = z2;
        return !z ? strArr[0] + str2 : str2;
    }

    public static boolean a(Spannable spannable) {
        int i = Log.h;
        Matcher matcher = c.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (!((start != 0 && spannable.charAt(start - 1) == '@' && i == 0) || (a(matcher.group(3)) && i == 0))) {
                String group = matcher.group(0);
                if (f(group) || i != 0) {
                    int i2;
                    if (spannable.length() <= end || spannable.charAt(end) != '/') {
                        i2 = end;
                    } else {
                        i2 = end + 1;
                    }
                    a(a(group, a), start, i2, spannable);
                    z = true;
                    if (i != 0) {
                        break;
                    }
                }
            }
        }
        return z;
    }

    private static boolean a(String str) {
        int i = Log.h;
        if (str == null) {
            return true;
        }
        Pattern[] patternArr = f;
        int length = patternArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (!patternArr[i2].matcher(str).find()) {
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public static String c(String str) {
        int i = Log.h;
        Matcher matcher = c.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            if (!((start != 0 && str.charAt(start - 1) == '@' && i == 0) || (a(matcher.group(3)) && i == 0))) {
                String group = matcher.group(0);
                if (f(group) || i != 0) {
                    int i2 = 0;
                    while (i2 < a.length) {
                        if (group.regionMatches(true, 0, a[i2], 0, a[i2].length())) {
                            return group;
                        }
                        int i3 = i2 + 1;
                        if (i != 0) {
                            break;
                        }
                        i2 = i3;
                    }
                    if (i != 0) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    private static boolean f(String str) {
        if (e(str) || e.matcher(str).find()) {
            return true;
        }
        return false;
    }
}
