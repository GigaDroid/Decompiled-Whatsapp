package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import com.whatsapp.protocol.c2;
import com.whatsapp.util.Log;
import com.whatsapp.util.ao;
import com.whatsapp.util.bz;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

public class aol {
    private static final int[][] C;
    private static av2 D;
    private static final int[][] F;
    private static final String[] H;
    private static final SparseArray b;
    private static HandlerThread c;
    private static tj d;
    private static final int[][] e;
    private static final int[][] f;
    private static final int[][] g;
    private static int j;
    private static final int[][] l;
    private static List o;
    private static final avc[] p;
    private static Comparator q;
    private static final int[][] s;
    private static int t;
    private static final int[][] x;
    private static int y;
    private Context A;
    private ViewPager B;
    private int E;
    private LayoutInflater G;
    private int a;
    private View h;
    private ImageView i;
    private l_ k;
    private OnClickListener m;
    private ViewGroup n;
    private Paint r;
    private a_2[] u;
    private View v;
    private int w;
    private a23 z;

    static {
        String[] strArr = new String[6];
        String str = "Li&|\"TW6}1Li+v%";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 32;
                        break;
                    case at.g /*1*/:
                        i4 = 8;
                        break;
                    case at.i /*2*/:
                        i4 = 95;
                        break;
                    case at.o /*3*/:
                        i4 = 19;
                        break;
                    default:
                        i4 = 87;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "Ee0y>";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "Ee0y>";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "Ee0y>Pa<x2R'-v6Dz:p2N|\u007f";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    str = "Ee0y>\u007fe0w>Fa:a$";
                    i = 4;
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    H = strArr3;
                    b = new SparseArray();
                    y = 500;
                    j = 50;
                    if (VERSION.SDK_INT >= 12) {
                        y = ViewConfiguration.getKeyRepeatTimeout();
                        j = ViewConfiguration.getKeyRepeatDelay();
                    }
                    r0 = new int[204][];
                    r0[0] = new int[]{128512};
                    r0[1] = new int[]{128556};
                    r0[2] = new int[]{128513};
                    r0[3] = new int[]{128514};
                    r0[4] = new int[]{128515};
                    r0[5] = new int[]{128516};
                    r0[6] = new int[]{128517};
                    r0[7] = new int[]{128518};
                    r0[8] = new int[]{128519};
                    r0[9] = new int[]{128521};
                    r0[10] = new int[]{128522};
                    r0[11] = new int[]{128578};
                    r0[12] = new int[]{128579};
                    r0[13] = new int[]{9786};
                    r0[14] = new int[]{128523};
                    r0[15] = new int[]{128524};
                    r0[16] = new int[]{128525};
                    r0[17] = new int[]{128536};
                    r0[18] = new int[]{128535};
                    r0[19] = new int[]{128537};
                    r0[20] = new int[]{128538};
                    r0[21] = new int[]{128540};
                    r0[22] = new int[]{128541};
                    r0[23] = new int[]{128539};
                    r0[24] = new int[]{129297};
                    r0[25] = new int[]{129299};
                    r0[26] = new int[]{128526};
                    r0[27] = new int[]{129303};
                    r0[28] = new int[]{128527};
                    r0[29] = new int[]{128566};
                    r0[30] = new int[]{128528};
                    r0[31] = new int[]{128529};
                    r0[32] = new int[]{128530};
                    r0[33] = new int[]{128580};
                    r0[34] = new int[]{129300};
                    r0[35] = new int[]{128563};
                    r0[36] = new int[]{128542};
                    r0[37] = new int[]{128543};
                    r0[38] = new int[]{128544};
                    r0[39] = new int[]{128545};
                    r0[40] = new int[]{128532};
                    r0[41] = new int[]{128533};
                    r0[42] = new int[]{128577};
                    r0[43] = new int[]{9785};
                    r0[44] = new int[]{128547};
                    r0[45] = new int[]{128534};
                    r0[46] = new int[]{128555};
                    r0[47] = new int[]{128553};
                    r0[48] = new int[]{128548};
                    r0[49] = new int[]{128558};
                    r0[50] = new int[]{128561};
                    r0[51] = new int[]{128552};
                    r0[52] = new int[]{128560};
                    r0[53] = new int[]{128559};
                    r0[54] = new int[]{128550};
                    r0[55] = new int[]{128551};
                    r0[56] = new int[]{128546};
                    r0[57] = new int[]{128549};
                    r0[58] = new int[]{128554};
                    r0[59] = new int[]{128531};
                    r0[60] = new int[]{128557};
                    r0[61] = new int[]{128565};
                    r0[62] = new int[]{128562};
                    r0[63] = new int[]{129296};
                    r0[64] = new int[]{128567};
                    r0[65] = new int[]{129298};
                    r0[66] = new int[]{129301};
                    r0[67] = new int[]{128564};
                    r0[68] = new int[]{128164};
                    r0[69] = new int[]{128169};
                    r0[70] = new int[]{128520};
                    r0[71] = new int[]{128127};
                    r0[72] = new int[]{128121};
                    r0[73] = new int[]{128122};
                    r0[74] = new int[]{128128};
                    r0[75] = new int[]{128123};
                    r0[76] = new int[]{128125};
                    r0[77] = new int[]{129302};
                    r0[78] = new int[]{128570};
                    r0[79] = new int[]{128568};
                    r0[80] = new int[]{128569};
                    r0[81] = new int[]{128571};
                    r0[82] = new int[]{128572};
                    r0[83] = new int[]{128573};
                    r0[84] = new int[]{128576};
                    r0[85] = new int[]{128575};
                    r0[86] = new int[]{128574};
                    r0[87] = new int[]{128588};
                    r0[88] = new int[]{128079};
                    r0[89] = new int[]{128075};
                    r0[90] = new int[]{128077};
                    r0[91] = new int[]{128078};
                    r0[92] = new int[]{128074};
                    r0[93] = new int[]{9994};
                    r0[94] = new int[]{9996};
                    r0[95] = new int[]{128076};
                    r0[96] = new int[]{9995};
                    r0[97] = new int[]{128080};
                    r0[98] = new int[]{128170};
                    r0[99] = new int[]{128591};
                    r0[100] = new int[]{9757};
                    r0[arj.Theme_buttonStyleSmall] = new int[]{128070};
                    r0[arj.Theme_checkboxStyle] = new int[]{128071};
                    r0[arj.Theme_checkedTextViewStyle] = new int[]{128072};
                    r0[arj.Theme_editTextStyle] = new int[]{128073};
                    r0[arj.Theme_radioButtonStyle] = new int[]{128405};
                    r0[arj.Theme_ratingBarStyle] = new int[]{128400};
                    r0[arj.Theme_seekBarStyle] = new int[]{129304};
                    r0[arj.Theme_spinnerStyle] = new int[]{128406};
                    r0[arj.Theme_switchStyle] = new int[]{9997};
                    r0[110] = new int[]{128133};
                    r0[111] = new int[]{128068};
                    r0[112] = new int[]{128069};
                    r0[113] = new int[]{128066};
                    r0[114] = new int[]{128067};
                    r0[115] = new int[]{128065};
                    r0[116] = new int[]{128064};
                    r0[117] = new int[]{128100};
                    r0[118] = new int[]{128101};
                    r0[119] = new int[]{128483};
                    r0[120] = new int[]{128118};
                    r0[121] = new int[]{128102};
                    r0[122] = new int[]{128103};
                    r0[123] = new int[]{128104};
                    r0[124] = new int[]{128105};
                    r0[125] = new int[]{128113};
                    r0[126] = new int[]{128116};
                    r0[127] = new int[]{128117};
                    r0[128] = new int[]{128114};
                    r0[129] = new int[]{128115};
                    r0[130] = new int[]{128110};
                    r0[131] = new int[]{128119};
                    r0[132] = new int[]{128130};
                    r0[133] = new int[]{128373};
                    r0[134] = new int[]{127877};
                    r0[135] = new int[]{128124};
                    r0[136] = new int[]{128120};
                    r0[137] = new int[]{128112};
                    r0[138] = new int[]{128694};
                    r0[139] = new int[]{127939};
                    r0[140] = new int[]{128131};
                    r0[141] = new int[]{128111};
                    r0[142] = new int[]{128107};
                    r0[143] = new int[]{128108};
                    r0[144] = new int[]{128109};
                    r0[145] = new int[]{128583};
                    r0[146] = new int[]{128129};
                    r0[147] = new int[]{128581};
                    r0[148] = new int[]{128582};
                    r0[149] = new int[]{128587};
                    r0[150] = new int[]{128590};
                    r0[151] = new int[]{128589};
                    r0[152] = new int[]{128135};
                    r0[153] = new int[]{128134};
                    r0[154] = new int[]{128145};
                    r0[155] = new int[]{128105, 8205, 10084, 65039, 8205, 128105};
                    r0[156] = new int[]{128104, 8205, 10084, 65039, 8205, 128104};
                    r0[157] = new int[]{128143};
                    r0[158] = new int[]{128105, 8205, 10084, 65039, 8205, 128139, 8205, 128105};
                    r0[159] = new int[]{128104, 8205, 10084, 65039, 8205, 128139, 8205, 128104};
                    r0[160] = new int[]{128106};
                    r0[161] = new int[]{128104, 8205, 128105, 8205, 128103};
                    r0[162] = new int[]{128104, 8205, 128105, 8205, 128103, 8205, 128102};
                    r0[163] = new int[]{128104, 8205, 128105, 8205, 128102, 8205, 128102};
                    r0[164] = new int[]{128104, 8205, 128105, 8205, 128103, 8205, 128103};
                    r0[165] = new int[]{128105, 8205, 128105, 8205, 128102};
                    r0[166] = new int[]{128105, 8205, 128105, 8205, 128103};
                    r0[167] = new int[]{128105, 8205, 128105, 8205, 128103, 8205, 128102};
                    r0[168] = new int[]{128105, 8205, 128105, 8205, 128102, 8205, 128102};
                    r0[169] = new int[]{128105, 8205, 128105, 8205, 128103, 8205, 128103};
                    r0[170] = new int[]{128104, 8205, 128104, 8205, 128102};
                    r0[171] = new int[]{128104, 8205, 128104, 8205, 128103};
                    r0[172] = new int[]{128104, 8205, 128104, 8205, 128103, 8205, 128102};
                    r0[173] = new int[]{128104, 8205, 128104, 8205, 128102, 8205, 128102};
                    r0[174] = new int[]{128104, 8205, 128104, 8205, 128103, 8205, 128103};
                    r0[175] = new int[]{128090};
                    r0[176] = new int[]{128085};
                    r0[177] = new int[]{128086};
                    r0[178] = new int[]{128084};
                    r0[179] = new int[]{128087};
                    r0[180] = new int[]{128089};
                    r0[181] = new int[]{128088};
                    r0[182] = new int[]{128132};
                    r0[183] = new int[]{128139};
                    r0[184] = new int[]{128099};
                    r0[185] = new int[]{128096};
                    r0[186] = new int[]{128097};
                    r0[187] = new int[]{128098};
                    r0[188] = new int[]{128094};
                    r0[189] = new int[]{128095};
                    r0[190] = new int[]{128082};
                    r0[191] = new int[]{127913};
                    r0[192] = new int[]{127891};
                    r0[193] = new int[]{128081};
                    r0[194] = new int[]{9937};
                    r0[195] = new int[]{127890};
                    r0[196] = new int[]{128093};
                    r0[197] = new int[]{128091};
                    r0[198] = new int[]{128092};
                    r0[199] = new int[]{128188};
                    r0[200] = new int[]{128083};
                    r0[201] = new int[]{128374};
                    r0[202] = new int[]{128141};
                    r0[203] = new int[]{127746};
                    f = r0;
                    r0 = new int[147][];
                    r0[0] = new int[]{128054};
                    r0[1] = new int[]{128049};
                    r0[2] = new int[]{128045};
                    r0[3] = new int[]{128057};
                    r0[4] = new int[]{128048};
                    r0[5] = new int[]{128059};
                    r0[6] = new int[]{128060};
                    r0[7] = new int[]{128040};
                    r0[8] = new int[]{128047};
                    r0[9] = new int[]{129409};
                    r0[10] = new int[]{128046};
                    r0[11] = new int[]{128055};
                    r0[12] = new int[]{128061};
                    r0[13] = new int[]{128056};
                    r0[14] = new int[]{128025};
                    r0[15] = new int[]{128053};
                    r0[16] = new int[]{128584};
                    r0[17] = new int[]{128585};
                    r0[18] = new int[]{128586};
                    r0[19] = new int[]{128018};
                    r0[20] = new int[]{128020};
                    r0[21] = new int[]{128039};
                    r0[22] = new int[]{128038};
                    r0[23] = new int[]{128036};
                    r0[24] = new int[]{128035};
                    r0[25] = new int[]{128037};
                    r0[26] = new int[]{128058};
                    r0[27] = new int[]{128023};
                    r0[28] = new int[]{128052};
                    r0[29] = new int[]{129412};
                    r0[30] = new int[]{128029};
                    r0[31] = new int[]{128027};
                    r0[32] = new int[]{128012};
                    r0[33] = new int[]{128030};
                    r0[34] = new int[]{128028};
                    r0[35] = new int[]{128375};
                    r0[36] = new int[]{129410};
                    r0[37] = new int[]{129408};
                    r0[38] = new int[]{128013};
                    r0[39] = new int[]{128034};
                    r0[40] = new int[]{128032};
                    r0[41] = new int[]{128031};
                    r0[42] = new int[]{128033};
                    r0[43] = new int[]{128044};
                    r0[44] = new int[]{128051};
                    r0[45] = new int[]{128011};
                    r0[46] = new int[]{128010};
                    r0[47] = new int[]{128006};
                    r0[48] = new int[]{128005};
                    r0[49] = new int[]{128003};
                    r0[50] = new int[]{128002};
                    r0[51] = new int[]{128004};
                    r0[52] = new int[]{128042};
                    r0[53] = new int[]{128043};
                    r0[54] = new int[]{128024};
                    r0[55] = new int[]{128016};
                    r0[56] = new int[]{128015};
                    r0[57] = new int[]{128017};
                    r0[58] = new int[]{128014};
                    r0[59] = new int[]{128022};
                    r0[60] = new int[]{128000};
                    r0[61] = new int[]{128001};
                    r0[62] = new int[]{128019};
                    r0[63] = new int[]{129411};
                    r0[64] = new int[]{128330};
                    r0[65] = new int[]{128021};
                    r0[66] = new int[]{128041};
                    r0[67] = new int[]{128008};
                    r0[68] = new int[]{128007};
                    r0[69] = new int[]{128063};
                    r0[70] = new int[]{128062};
                    r0[71] = new int[]{128009};
                    r0[72] = new int[]{128050};
                    r0[73] = new int[]{127797};
                    r0[74] = new int[]{127876};
                    r0[75] = new int[]{127794};
                    r0[76] = new int[]{127795};
                    r0[77] = new int[]{127796};
                    r0[78] = new int[]{127793};
                    r0[79] = new int[]{127807};
                    r0[80] = new int[]{9752};
                    r0[81] = new int[]{127808};
                    r0[82] = new int[]{127885};
                    r0[83] = new int[]{127883};
                    r0[84] = new int[]{127811};
                    r0[85] = new int[]{127810};
                    r0[86] = new int[]{127809};
                    r0[87] = new int[]{127806};
                    r0[88] = new int[]{127802};
                    r0[89] = new int[]{127803};
                    r0[90] = new int[]{127801};
                    r0[91] = new int[]{127799};
                    r0[92] = new int[]{127804};
                    r0[93] = new int[]{127800};
                    r0[94] = new int[]{128144};
                    r0[95] = new int[]{127812};
                    r0[96] = new int[]{127792};
                    r0[97] = new int[]{127875};
                    r0[98] = new int[]{128026};
                    r0[99] = new int[]{128376};
                    r0[100] = new int[]{127758};
                    r0[arj.Theme_buttonStyleSmall] = new int[]{127757};
                    r0[arj.Theme_checkboxStyle] = new int[]{127759};
                    r0[arj.Theme_checkedTextViewStyle] = new int[]{127765};
                    r0[arj.Theme_editTextStyle] = new int[]{127766};
                    r0[arj.Theme_radioButtonStyle] = new int[]{127767};
                    r0[arj.Theme_ratingBarStyle] = new int[]{127768};
                    r0[arj.Theme_seekBarStyle] = new int[]{127761};
                    r0[arj.Theme_spinnerStyle] = new int[]{127762};
                    r0[arj.Theme_switchStyle] = new int[]{127763};
                    r0[110] = new int[]{127764};
                    r0[111] = new int[]{127770};
                    r0[112] = new int[]{127773};
                    r0[113] = new int[]{127771};
                    r0[114] = new int[]{127772};
                    r0[115] = new int[]{127774};
                    r0[116] = new int[]{127769};
                    r0[117] = new int[]{11088};
                    r0[118] = new int[]{127775};
                    r0[119] = new int[]{128171};
                    r0[120] = new int[]{10024};
                    r0[121] = new int[]{9732};
                    r0[122] = new int[]{9728};
                    r0[123] = new int[]{127780};
                    r0[124] = new int[]{9925};
                    r0[125] = new int[]{127781};
                    r0[126] = new int[]{127782};
                    r0[127] = new int[]{9729};
                    r0[128] = new int[]{127783};
                    r0[129] = new int[]{9928};
                    r0[130] = new int[]{127785};
                    r0[131] = new int[]{9889};
                    r0[132] = new int[]{128293};
                    r0[133] = new int[]{128165};
                    r0[134] = new int[]{10052};
                    r0[135] = new int[]{127784};
                    r0[136] = new int[]{9731};
                    r0[137] = new int[]{9924};
                    r0[138] = new int[]{127788};
                    r0[139] = new int[]{128168};
                    r0[140] = new int[]{127786};
                    r0[141] = new int[]{127787};
                    r0[142] = new int[]{9730};
                    r0[143] = new int[]{9748};
                    r0[144] = new int[]{128167};
                    r0[145] = new int[]{128166};
                    r0[146] = new int[]{127754};
                    C = r0;
                    r0 = new int[67][];
                    r0[0] = new int[]{127823};
                    r0[1] = new int[]{127822};
                    r0[2] = new int[]{127824};
                    r0[3] = new int[]{127818};
                    r0[4] = new int[]{127819};
                    r0[5] = new int[]{127820};
                    r0[6] = new int[]{127817};
                    r0[7] = new int[]{127815};
                    r0[8] = new int[]{127827};
                    r0[9] = new int[]{127816};
                    r0[10] = new int[]{127826};
                    r0[11] = new int[]{127825};
                    r0[12] = new int[]{127821};
                    r0[13] = new int[]{127813};
                    r0[14] = new int[]{127814};
                    r0[15] = new int[]{127798};
                    r0[16] = new int[]{127805};
                    r0[17] = new int[]{127840};
                    r0[18] = new int[]{127855};
                    r0[19] = new int[]{127838};
                    r0[20] = new int[]{129472};
                    r0[21] = new int[]{127831};
                    r0[22] = new int[]{127830};
                    r0[23] = new int[]{127844};
                    r0[24] = new int[]{127859};
                    r0[25] = new int[]{127828};
                    r0[26] = new int[]{127839};
                    r0[27] = new int[]{127789};
                    r0[28] = new int[]{127829};
                    r0[29] = new int[]{127837};
                    r0[30] = new int[]{127790};
                    r0[31] = new int[]{127791};
                    r0[32] = new int[]{127836};
                    r0[33] = new int[]{127858};
                    r0[34] = new int[]{127845};
                    r0[35] = new int[]{127843};
                    r0[36] = new int[]{127857};
                    r0[37] = new int[]{127835};
                    r0[38] = new int[]{127833};
                    r0[39] = new int[]{127834};
                    r0[40] = new int[]{127832};
                    r0[41] = new int[]{127842};
                    r0[42] = new int[]{127841};
                    r0[43] = new int[]{127847};
                    r0[44] = new int[]{127848};
                    r0[45] = new int[]{127846};
                    r0[46] = new int[]{127856};
                    r0[47] = new int[]{127874};
                    r0[48] = new int[]{127854};
                    r0[49] = new int[]{127852};
                    r0[50] = new int[]{127853};
                    r0[51] = new int[]{127851};
                    r0[52] = new int[]{127871};
                    r0[53] = new int[]{127849};
                    r0[54] = new int[]{127850};
                    r0[55] = new int[]{127866};
                    r0[56] = new int[]{127867};
                    r0[57] = new int[]{127863};
                    r0[58] = new int[]{127864};
                    r0[59] = new int[]{127865};
                    r0[60] = new int[]{127870};
                    r0[61] = new int[]{127862};
                    r0[62] = new int[]{127861};
                    r0[63] = new int[]{9749};
                    r0[64] = new int[]{127868};
                    r0[65] = new int[]{127860};
                    r0[66] = new int[]{127869};
                    x = r0;
                    r0 = new int[57][];
                    r0[0] = new int[]{9917};
                    r0[1] = new int[]{127936};
                    r0[2] = new int[]{127944};
                    r0[3] = new int[]{9918};
                    r0[4] = new int[]{127934};
                    r0[5] = new int[]{127952};
                    r0[6] = new int[]{127945};
                    r0[7] = new int[]{127921};
                    r0[8] = new int[]{9971};
                    r0[9] = new int[]{127948};
                    r0[10] = new int[]{127955};
                    r0[11] = new int[]{127992};
                    r0[12] = new int[]{127954};
                    r0[13] = new int[]{127953};
                    r0[14] = new int[]{127951};
                    r0[15] = new int[]{127935};
                    r0[16] = new int[]{9975};
                    r0[17] = new int[]{127938};
                    r0[18] = new int[]{9976};
                    r0[19] = new int[]{127993};
                    r0[20] = new int[]{127907};
                    r0[21] = new int[]{128675};
                    r0[22] = new int[]{127946};
                    r0[23] = new int[]{127940};
                    r0[24] = new int[]{128704};
                    r0[25] = new int[]{9977};
                    r0[26] = new int[]{127947};
                    r0[27] = new int[]{128692};
                    r0[28] = new int[]{128693};
                    r0[29] = new int[]{127943};
                    r0[30] = new int[]{128372};
                    r0[31] = new int[]{127942};
                    r0[32] = new int[]{127933};
                    r0[33] = new int[]{127941};
                    r0[34] = new int[]{127894};
                    r0[35] = new int[]{127895};
                    r0[36] = new int[]{127989};
                    r0[37] = new int[]{127915};
                    r0[38] = new int[]{127903};
                    r0[39] = new int[]{127917};
                    r0[40] = new int[]{127912};
                    r0[41] = new int[]{127914};
                    r0[42] = new int[]{127908};
                    r0[43] = new int[]{127911};
                    r0[44] = new int[]{127932};
                    r0[45] = new int[]{127929};
                    r0[46] = new int[]{127927};
                    r0[47] = new int[]{127930};
                    r0[48] = new int[]{127928};
                    r0[49] = new int[]{127931};
                    r0[50] = new int[]{127916};
                    r0[51] = new int[]{127918};
                    r0[52] = new int[]{128126};
                    r0[53] = new int[]{127919};
                    r0[54] = new int[]{127922};
                    r0[55] = new int[]{127920};
                    r0[56] = new int[]{127923};
                    e = r0;
                    r0 = new int[115][];
                    r0[0] = new int[]{128663};
                    r0[1] = new int[]{128661};
                    r0[2] = new int[]{128665};
                    r0[3] = new int[]{128652};
                    r0[4] = new int[]{128654};
                    r0[5] = new int[]{127950};
                    r0[6] = new int[]{128659};
                    r0[7] = new int[]{128657};
                    r0[8] = new int[]{128658};
                    r0[9] = new int[]{128656};
                    r0[10] = new int[]{128666};
                    r0[11] = new int[]{128667};
                    r0[12] = new int[]{128668};
                    r0[13] = new int[]{127949};
                    r0[14] = new int[]{128690};
                    r0[15] = new int[]{128680};
                    r0[16] = new int[]{128660};
                    r0[17] = new int[]{128653};
                    r0[18] = new int[]{128664};
                    r0[19] = new int[]{128662};
                    r0[20] = new int[]{128673};
                    r0[21] = new int[]{128672};
                    r0[22] = new int[]{128671};
                    r0[23] = new int[]{128643};
                    r0[24] = new int[]{128651};
                    r0[25] = new int[]{128669};
                    r0[26] = new int[]{128644};
                    r0[27] = new int[]{128645};
                    r0[28] = new int[]{128648};
                    r0[29] = new int[]{128670};
                    r0[30] = new int[]{128642};
                    r0[31] = new int[]{128646};
                    r0[32] = new int[]{128647};
                    r0[33] = new int[]{128650};
                    r0[34] = new int[]{128649};
                    r0[35] = new int[]{128641};
                    r0[36] = new int[]{128745};
                    r0[37] = new int[]{9992};
                    r0[38] = new int[]{128747};
                    r0[39] = new int[]{128748};
                    r0[40] = new int[]{9973};
                    r0[41] = new int[]{128741};
                    r0[42] = new int[]{128676};
                    r0[43] = new int[]{9972};
                    r0[44] = new int[]{128755};
                    r0[45] = new int[]{128640};
                    r0[46] = new int[]{128752};
                    r0[47] = new int[]{128186};
                    r0[48] = new int[]{9875};
                    r0[49] = new int[]{128679};
                    r0[50] = new int[]{9981};
                    r0[51] = new int[]{128655};
                    r0[52] = new int[]{128678};
                    r0[53] = new int[]{128677};
                    r0[54] = new int[]{127937};
                    r0[55] = new int[]{128674};
                    r0[56] = new int[]{127905};
                    r0[57] = new int[]{127906};
                    r0[58] = new int[]{127904};
                    r0[59] = new int[]{127959};
                    r0[60] = new int[]{127745};
                    r0[61] = new int[]{128508};
                    r0[62] = new int[]{127981};
                    r0[63] = new int[]{9970};
                    r0[64] = new int[]{127889};
                    r0[65] = new int[]{9968};
                    r0[66] = new int[]{127956};
                    r0[67] = new int[]{128507};
                    r0[68] = new int[]{127755};
                    r0[69] = new int[]{128510};
                    r0[70] = new int[]{127957};
                    r0[71] = new int[]{9978};
                    r0[72] = new int[]{127966};
                    r0[73] = new int[]{128739};
                    r0[74] = new int[]{128740};
                    r0[75] = new int[]{127749};
                    r0[76] = new int[]{127748};
                    r0[77] = new int[]{127964};
                    r0[78] = new int[]{127958};
                    r0[79] = new int[]{127965};
                    r0[80] = new int[]{127751};
                    r0[81] = new int[]{127750};
                    r0[82] = new int[]{127961};
                    r0[83] = new int[]{127747};
                    r0[84] = new int[]{127753};
                    r0[85] = new int[]{127756};
                    r0[86] = new int[]{127776};
                    r0[87] = new int[]{127879};
                    r0[88] = new int[]{127878};
                    r0[89] = new int[]{127752};
                    r0[90] = new int[]{127960};
                    r0[91] = new int[]{127984};
                    r0[92] = new int[]{127983};
                    r0[93] = new int[]{127967};
                    r0[94] = new int[]{128509};
                    r0[95] = new int[]{127968};
                    r0[96] = new int[]{127969};
                    r0[97] = new int[]{127962};
                    r0[98] = new int[]{127970};
                    r0[99] = new int[]{127980};
                    r0[100] = new int[]{127971};
                    r0[arj.Theme_buttonStyleSmall] = new int[]{127972};
                    r0[arj.Theme_checkboxStyle] = new int[]{127973};
                    r0[arj.Theme_checkedTextViewStyle] = new int[]{127974};
                    r0[arj.Theme_editTextStyle] = new int[]{127976};
                    r0[arj.Theme_radioButtonStyle] = new int[]{127978};
                    r0[arj.Theme_ratingBarStyle] = new int[]{127979};
                    r0[arj.Theme_seekBarStyle] = new int[]{127977};
                    r0[arj.Theme_spinnerStyle] = new int[]{128146};
                    r0[arj.Theme_switchStyle] = new int[]{127963};
                    r0[110] = new int[]{9962};
                    r0[111] = new int[]{128332};
                    r0[112] = new int[]{128333};
                    r0[113] = new int[]{128331};
                    r0[114] = new int[]{9961};
                    l = r0;
                    r0 = new int[178][];
                    r0[0] = new int[]{8986};
                    r0[1] = new int[]{128241};
                    r0[2] = new int[]{128242};
                    r0[3] = new int[]{128187};
                    r0[4] = new int[]{9000};
                    r0[5] = new int[]{128421};
                    r0[6] = new int[]{128424};
                    r0[7] = new int[]{128433};
                    r0[8] = new int[]{128434};
                    r0[9] = new int[]{128377};
                    r0[10] = new int[]{128476};
                    r0[11] = new int[]{128189};
                    r0[12] = new int[]{128190};
                    r0[13] = new int[]{128191};
                    r0[14] = new int[]{128192};
                    r0[15] = new int[]{128252};
                    r0[16] = new int[]{128247};
                    r0[17] = new int[]{128248};
                    r0[18] = new int[]{128249};
                    r0[19] = new int[]{127909};
                    r0[20] = new int[]{128253};
                    r0[21] = new int[]{127902};
                    r0[22] = new int[]{128222};
                    r0[23] = new int[]{9742};
                    r0[24] = new int[]{128223};
                    r0[25] = new int[]{128224};
                    r0[26] = new int[]{128250};
                    r0[27] = new int[]{128251};
                    r0[28] = new int[]{127897};
                    r0[29] = new int[]{127898};
                    r0[30] = new int[]{127899};
                    r0[31] = new int[]{9201};
                    r0[32] = new int[]{9202};
                    r0[33] = new int[]{9200};
                    r0[34] = new int[]{128368};
                    r0[35] = new int[]{9203};
                    r0[36] = new int[]{8987};
                    r0[37] = new int[]{128225};
                    r0[38] = new int[]{128267};
                    r0[39] = new int[]{128268};
                    r0[40] = new int[]{128161};
                    r0[41] = new int[]{128294};
                    r0[42] = new int[]{128367};
                    r0[43] = new int[]{128465};
                    r0[44] = new int[]{128738};
                    r0[45] = new int[]{128184};
                    r0[46] = new int[]{128181};
                    r0[47] = new int[]{128180};
                    r0[48] = new int[]{128182};
                    r0[49] = new int[]{128183};
                    r0[50] = new int[]{128176};
                    r0[51] = new int[]{128179};
                    r0[52] = new int[]{128142};
                    r0[53] = new int[]{9878};
                    r0[54] = new int[]{128295};
                    r0[55] = new int[]{128296};
                    r0[56] = new int[]{9874};
                    r0[57] = new int[]{128736};
                    r0[58] = new int[]{9935};
                    r0[59] = new int[]{128297};
                    r0[60] = new int[]{9881};
                    r0[61] = new int[]{9939};
                    r0[62] = new int[]{128299};
                    r0[63] = new int[]{128163};
                    r0[64] = new int[]{128298};
                    r0[65] = new int[]{128481};
                    r0[66] = new int[]{9876};
                    r0[67] = new int[]{128737};
                    r0[68] = new int[]{128684};
                    r0[69] = new int[]{9760};
                    r0[70] = new int[]{9904};
                    r0[71] = new int[]{9905};
                    r0[72] = new int[]{127994};
                    r0[73] = new int[]{128302};
                    r0[74] = new int[]{128255};
                    r0[75] = new int[]{128136};
                    r0[76] = new int[]{9879};
                    r0[77] = new int[]{128301};
                    r0[78] = new int[]{128300};
                    r0[79] = new int[]{128371};
                    r0[80] = new int[]{128138};
                    r0[81] = new int[]{128137};
                    r0[82] = new int[]{127777};
                    r0[83] = new int[]{127991};
                    r0[84] = new int[]{128278};
                    r0[85] = new int[]{128701};
                    r0[86] = new int[]{128703};
                    r0[87] = new int[]{128705};
                    r0[88] = new int[]{128273};
                    r0[89] = new int[]{128477};
                    r0[90] = new int[]{128715};
                    r0[91] = new int[]{128716};
                    r0[92] = new int[]{128719};
                    r0[93] = new int[]{128682};
                    r0[94] = new int[]{128718};
                    r0[95] = new int[]{128444};
                    r0[96] = new int[]{128506};
                    r0[97] = new int[]{9969};
                    r0[98] = new int[]{128511};
                    r0[99] = new int[]{128717};
                    r0[100] = new int[]{127880};
                    r0[arj.Theme_buttonStyleSmall] = new int[]{127887};
                    r0[arj.Theme_checkboxStyle] = new int[]{127872};
                    r0[arj.Theme_checkedTextViewStyle] = new int[]{127873};
                    r0[arj.Theme_editTextStyle] = new int[]{127882};
                    r0[arj.Theme_radioButtonStyle] = new int[]{127881};
                    r0[arj.Theme_ratingBarStyle] = new int[]{127886};
                    r0[arj.Theme_seekBarStyle] = new int[]{127888};
                    r0[arj.Theme_spinnerStyle] = new int[]{127884};
                    r0[arj.Theme_switchStyle] = new int[]{127982};
                    r0[110] = new int[]{9993};
                    r0[111] = new int[]{128233};
                    r0[112] = new int[]{128232};
                    r0[113] = new int[]{128231};
                    r0[114] = new int[]{128140};
                    r0[115] = new int[]{128238};
                    r0[116] = new int[]{128234};
                    r0[117] = new int[]{128235};
                    r0[118] = new int[]{128236};
                    r0[119] = new int[]{128237};
                    r0[120] = new int[]{128230};
                    r0[121] = new int[]{128239};
                    r0[122] = new int[]{128229};
                    r0[123] = new int[]{128228};
                    r0[124] = new int[]{128220};
                    r0[125] = new int[]{128195};
                    r0[126] = new int[]{128209};
                    r0[127] = new int[]{128202};
                    r0[128] = new int[]{128200};
                    r0[129] = new int[]{128201};
                    r0[130] = new int[]{128196};
                    r0[131] = new int[]{128197};
                    r0[132] = new int[]{128198};
                    r0[133] = new int[]{128467};
                    r0[134] = new int[]{128199};
                    r0[135] = new int[]{128451};
                    r0[136] = new int[]{128499};
                    r0[137] = new int[]{128452};
                    r0[138] = new int[]{128203};
                    r0[139] = new int[]{128466};
                    r0[140] = new int[]{128193};
                    r0[141] = new int[]{128194};
                    r0[142] = new int[]{128450};
                    r0[143] = new int[]{128478};
                    r0[144] = new int[]{128240};
                    r0[145] = new int[]{128211};
                    r0[146] = new int[]{128213};
                    r0[147] = new int[]{128215};
                    r0[148] = new int[]{128216};
                    r0[149] = new int[]{128217};
                    r0[150] = new int[]{128212};
                    r0[151] = new int[]{128210};
                    r0[152] = new int[]{128218};
                    r0[153] = new int[]{128214};
                    r0[154] = new int[]{128279};
                    r0[155] = new int[]{128206};
                    r0[156] = new int[]{128391};
                    r0[157] = new int[]{9986};
                    r0[158] = new int[]{128208};
                    r0[159] = new int[]{128207};
                    r0[160] = new int[]{128204};
                    r0[161] = new int[]{128205};
                    r0[162] = new int[]{128681};
                    r0[163] = new int[]{127987};
                    r0[164] = new int[]{127988};
                    r0[165] = new int[]{128272};
                    r0[166] = new int[]{128274};
                    r0[167] = new int[]{128275};
                    r0[168] = new int[]{128271};
                    r0[169] = new int[]{128394};
                    r0[170] = new int[]{128395};
                    r0[171] = new int[]{10002};
                    r0[172] = new int[]{128221};
                    r0[173] = new int[]{9999};
                    r0[174] = new int[]{128397};
                    r0[175] = new int[]{128396};
                    r0[176] = new int[]{128269};
                    r0[177] = new int[]{128270};
                    g = r0;
                    r0 = new int[269][];
                    r0[0] = new int[]{10084};
                    r0[1] = new int[]{128155};
                    r0[2] = new int[]{128154};
                    r0[3] = new int[]{128153};
                    r0[4] = new int[]{128156};
                    r0[5] = new int[]{128148};
                    r0[6] = new int[]{10083};
                    r0[7] = new int[]{128149};
                    r0[8] = new int[]{128158};
                    r0[9] = new int[]{128147};
                    r0[10] = new int[]{128151};
                    r0[11] = new int[]{128150};
                    r0[12] = new int[]{128152};
                    r0[13] = new int[]{128157};
                    r0[14] = new int[]{128159};
                    r0[15] = new int[]{9774};
                    r0[16] = new int[]{10013};
                    r0[17] = new int[]{9770};
                    r0[18] = new int[]{128329};
                    r0[19] = new int[]{9784};
                    r0[20] = new int[]{10017};
                    r0[21] = new int[]{128303};
                    r0[22] = new int[]{128334};
                    r0[23] = new int[]{9775};
                    r0[24] = new int[]{9766};
                    r0[25] = new int[]{128720};
                    r0[26] = new int[]{9934};
                    r0[27] = new int[]{9800};
                    r0[28] = new int[]{9801};
                    r0[29] = new int[]{9802};
                    r0[30] = new int[]{9803};
                    r0[31] = new int[]{9804};
                    r0[32] = new int[]{9805};
                    r0[33] = new int[]{9806};
                    r0[34] = new int[]{9807};
                    r0[35] = new int[]{9808};
                    r0[36] = new int[]{9809};
                    r0[37] = new int[]{9810};
                    r0[38] = new int[]{9811};
                    r0[39] = new int[]{127380};
                    r0[40] = new int[]{9883};
                    r0[41] = new int[]{127539};
                    r0[42] = new int[]{127545};
                    r0[43] = new int[]{9762};
                    r0[44] = new int[]{9763};
                    r0[45] = new int[]{128244};
                    r0[46] = new int[]{128243};
                    r0[47] = new int[]{127542};
                    r0[48] = new int[]{127514};
                    r0[49] = new int[]{127544};
                    r0[50] = new int[]{127546};
                    r0[51] = new int[]{127543};
                    r0[52] = new int[]{10036};
                    r0[53] = new int[]{127386};
                    r0[54] = new int[]{127569};
                    r0[55] = new int[]{128174};
                    r0[56] = new int[]{127568};
                    r0[57] = new int[]{12953};
                    r0[58] = new int[]{12951};
                    r0[59] = new int[]{127540};
                    r0[60] = new int[]{127541};
                    r0[61] = new int[]{127538};
                    r0[62] = new int[]{127344};
                    r0[63] = new int[]{127345};
                    r0[64] = new int[]{127374};
                    r0[65] = new int[]{127377};
                    r0[66] = new int[]{127358};
                    r0[67] = new int[]{127384};
                    r0[68] = new int[]{9940};
                    r0[69] = new int[]{128219};
                    r0[70] = new int[]{128683};
                    r0[71] = new int[]{10060};
                    r0[72] = new int[]{11093};
                    r0[73] = new int[]{128162};
                    r0[74] = new int[]{9832};
                    r0[75] = new int[]{128695};
                    r0[76] = new int[]{128687};
                    r0[77] = new int[]{128691};
                    r0[78] = new int[]{128689};
                    r0[79] = new int[]{128286};
                    r0[80] = new int[]{128245};
                    r0[81] = new int[]{10071};
                    r0[82] = new int[]{10069};
                    r0[83] = new int[]{10067};
                    r0[84] = new int[]{10068};
                    r0[85] = new int[]{8252};
                    r0[86] = new int[]{8265};
                    r0[87] = new int[]{128175};
                    r0[88] = new int[]{128261};
                    r0[89] = new int[]{128262};
                    r0[90] = new int[]{128305};
                    r0[91] = new int[]{9884};
                    r0[92] = new int[]{12349};
                    r0[93] = new int[]{9888};
                    r0[94] = new int[]{128696};
                    r0[95] = new int[]{128304};
                    r0[96] = new int[]{9851};
                    r0[97] = new int[]{127535};
                    r0[98] = new int[]{128185};
                    r0[99] = new int[]{10055};
                    r0[100] = new int[]{10035};
                    r0[arj.Theme_buttonStyleSmall] = new int[]{10062};
                    r0[arj.Theme_checkboxStyle] = new int[]{9989};
                    r0[arj.Theme_checkedTextViewStyle] = new int[]{128160};
                    r0[arj.Theme_editTextStyle] = new int[]{127744};
                    r0[arj.Theme_radioButtonStyle] = new int[]{10175};
                    r0[arj.Theme_ratingBarStyle] = new int[]{127760};
                    r0[arj.Theme_seekBarStyle] = new int[]{9410};
                    r0[arj.Theme_spinnerStyle] = new int[]{127975};
                    r0[arj.Theme_switchStyle] = new int[]{127490};
                    r0[110] = new int[]{128706};
                    r0[111] = new int[]{128707};
                    r0[112] = new int[]{128708};
                    r0[113] = new int[]{128709};
                    r0[114] = new int[]{9855};
                    r0[115] = new int[]{128685};
                    r0[116] = new int[]{128702};
                    r0[117] = new int[]{127359};
                    r0[118] = new int[]{128688};
                    r0[119] = new int[]{128697};
                    r0[120] = new int[]{128698};
                    r0[121] = new int[]{128700};
                    r0[122] = new int[]{128699};
                    r0[123] = new int[]{128686};
                    r0[124] = new int[]{127910};
                    r0[125] = new int[]{128246};
                    r0[126] = new int[]{127489};
                    r0[127] = new int[]{127382};
                    r0[128] = new int[]{127383};
                    r0[129] = new int[]{127385};
                    r0[130] = new int[]{127378};
                    r0[131] = new int[]{127381};
                    r0[132] = new int[]{127379};
                    r0[133] = new int[]{48, 8419};
                    r0[134] = new int[]{49, 8419};
                    r0[135] = new int[]{50, 8419};
                    r0[136] = new int[]{51, 8419};
                    r0[137] = new int[]{52, 8419};
                    r0[138] = new int[]{53, 8419};
                    r0[139] = new int[]{54, 8419};
                    r0[140] = new int[]{55, 8419};
                    r0[141] = new int[]{56, 8419};
                    r0[142] = new int[]{57, 8419};
                    r0[143] = new int[]{128287};
                    r0[144] = new int[]{128290};
                    r0[145] = new int[]{9654};
                    r0[146] = new int[]{9208};
                    r0[147] = new int[]{9199};
                    r0[148] = new int[]{9209};
                    r0[149] = new int[]{9210};
                    r0[150] = new int[]{9197};
                    r0[151] = new int[]{9198};
                    r0[152] = new int[]{9193};
                    r0[153] = new int[]{9194};
                    r0[154] = new int[]{128256};
                    r0[155] = new int[]{128257};
                    r0[156] = new int[]{128258};
                    r0[157] = new int[]{9664};
                    r0[158] = new int[]{128316};
                    r0[159] = new int[]{128317};
                    r0[160] = new int[]{9195};
                    r0[161] = new int[]{9196};
                    r0[162] = new int[]{10145};
                    r0[163] = new int[]{11013};
                    r0[164] = new int[]{11014};
                    r0[165] = new int[]{11015};
                    r0[166] = new int[]{8599};
                    r0[167] = new int[]{8600};
                    r0[168] = new int[]{8601};
                    r0[169] = new int[]{8598};
                    r0[170] = new int[]{8597};
                    r0[171] = new int[]{8596};
                    r0[172] = new int[]{128260};
                    r0[173] = new int[]{8618};
                    r0[174] = new int[]{8617};
                    r0[175] = new int[]{10548};
                    r0[176] = new int[]{10549};
                    r0[177] = new int[]{35, 8419};
                    r0[178] = new int[]{42, 8419};
                    r0[179] = new int[]{8505};
                    r0[180] = new int[]{128292};
                    r0[181] = new int[]{128289};
                    r0[182] = new int[]{128288};
                    r0[183] = new int[]{128291};
                    r0[184] = new int[]{127925};
                    r0[185] = new int[]{127926};
                    r0[186] = new int[]{12336};
                    r0[187] = new int[]{10160};
                    r0[188] = new int[]{10004};
                    r0[189] = new int[]{128259};
                    r0[190] = new int[]{10133};
                    r0[191] = new int[]{10134};
                    r0[192] = new int[]{10135};
                    r0[193] = new int[]{10006};
                    r0[194] = new int[]{128178};
                    r0[195] = new int[]{128177};
                    r0[196] = new int[]{169};
                    r0[197] = new int[]{174};
                    r0[198] = new int[]{8482};
                    r0[199] = new int[]{128282};
                    r0[200] = new int[]{128281};
                    r0[201] = new int[]{128283};
                    r0[202] = new int[]{128285};
                    r0[203] = new int[]{128284};
                    r0[204] = new int[]{9745};
                    r0[205] = new int[]{128280};
                    r0[206] = new int[]{9898};
                    r0[207] = new int[]{9899};
                    r0[208] = new int[]{128308};
                    r0[209] = new int[]{128309};
                    r0[210] = new int[]{128312};
                    r0[211] = new int[]{128313};
                    r0[212] = new int[]{128310};
                    r0[213] = new int[]{128311};
                    r0[214] = new int[]{128314};
                    r0[215] = new int[]{9642};
                    r0[216] = new int[]{9643};
                    r0[217] = new int[]{11035};
                    r0[218] = new int[]{11036};
                    r0[219] = new int[]{128315};
                    r0[220] = new int[]{9724};
                    r0[221] = new int[]{9723};
                    r0[222] = new int[]{9726};
                    r0[223] = new int[]{9725};
                    r0[224] = new int[]{128306};
                    r0[225] = new int[]{128307};
                    r0[226] = new int[]{128264};
                    r0[227] = new int[]{128265};
                    r0[228] = new int[]{128266};
                    r0[229] = new int[]{128263};
                    r0[230] = new int[]{128227};
                    r0[231] = new int[]{128226};
                    r0[232] = new int[]{128276};
                    r0[233] = new int[]{128277};
                    r0[234] = new int[]{127183};
                    r0[235] = new int[]{126980};
                    r0[236] = new int[]{9824};
                    r0[237] = new int[]{9827};
                    r0[238] = new int[]{9829};
                    r0[239] = new int[]{9830};
                    r0[240] = new int[]{127924};
                    r0[241] = new int[]{128065, 8205, 128488};
                    r0[242] = new int[]{128173};
                    r0[243] = new int[]{128495};
                    r0[244] = new int[]{128172};
                    r0[245] = new int[]{128336};
                    r0[246] = new int[]{128337};
                    r0[247] = new int[]{128338};
                    r0[248] = new int[]{128339};
                    r0[249] = new int[]{128340};
                    r0[250] = new int[]{128341};
                    r0[251] = new int[]{128342};
                    r0[252] = new int[]{128343};
                    r0[253] = new int[]{128344};
                    r0[254] = new int[]{128345};
                    r0[255] = new int[]{128346};
                    r0[256] = new int[]{128347};
                    r0[257] = new int[]{128348};
                    r0[258] = new int[]{128349};
                    r0[259] = new int[]{128350};
                    r0[260] = new int[]{128351};
                    r0[261] = new int[]{128352};
                    r0[262] = new int[]{128353};
                    r0[263] = new int[]{128354};
                    r0[264] = new int[]{128355};
                    r0[265] = new int[]{128356};
                    r0[266] = new int[]{128357};
                    r0[267] = new int[]{128358};
                    r0[268] = new int[]{128359};
                    F = r0;
                    s = new int[][]{new int[]{127462, 127467}, new int[]{127462, 127485}, new int[]{127462, 127473}, new int[]{127465, 127487}, new int[]{127462, 127480}, new int[]{127462, 127465}, new int[]{127462, 127476}, new int[]{127462, 127470}, new int[]{127462, 127478}, new int[]{127462, 127468}, new int[]{127462, 127479}, new int[]{127462, 127474}, new int[]{127462, 127484}, new int[]{127462, 127482}, new int[]{127462, 127481}, new int[]{127462, 127487}, new int[]{127463, 127480}, new int[]{127463, 127469}, new int[]{127463, 127465}, new int[]{127463, 127463}, new int[]{127463, 127486}, new int[]{127463, 127466}, new int[]{127463, 127487}, new int[]{127463, 127471}, new int[]{127463, 127474}, new int[]{127463, 127481}, new int[]{127463, 127476}, new int[]{127463, 127478}, new int[]{127463, 127462}, new int[]{127463, 127484}, new int[]{127463, 127479}, new int[]{127470, 127476}, new int[]{127483, 127468}, new int[]{127463, 127475}, new int[]{127463, 127468}, new int[]{127463, 127467}, new int[]{127463, 127470}, new int[]{127464, 127483}, new int[]{127472, 127469}, new int[]{127464, 127474}, new int[]{127464, 127462}, new int[]{127470, 127464}, new int[]{127472, 127486}, new int[]{127464, 127467}, new int[]{127481, 127465}, new int[]{127464, 127473}, new int[]{127464, 127475}, new int[]{127464, 127485}, new int[]{127464, 127464}, new int[]{127464, 127476}, new int[]{127472, 127474}, new int[]{127464, 127468}, new int[]{127464, 127465}, new int[]{127464, 127472}, new int[]{127464, 127479}, new int[]{127469, 127479}, new int[]{127464, 127482}, new int[]{127464, 127484}, new int[]{127464, 127486}, new int[]{127464, 127487}, new int[]{127465, 127472}, new int[]{127465, 127471}, new int[]{127465, 127474}, new int[]{127465, 127476}, new int[]{127466, 127464}, new int[]{127466, 127468}, new int[]{127480, 127483}, new int[]{127468, 127478}, new int[]{127466, 127479}, new int[]{127466, 127466}, new int[]{127466, 127481}, new int[]{127466, 127482}, new int[]{127467, 127472}, new int[]{127467, 127476}, new int[]{127467, 127471}, new int[]{127467, 127470}, new int[]{127467, 127479}, new int[]{127468, 127467}, new int[]{127477, 127467}, new int[]{127481, 127467}, new int[]{127468, 127462}, new int[]{127468, 127474}, new int[]{127468, 127466}, new int[]{127465, 127466}, new int[]{127468, 127469}, new int[]{127468, 127470}, new int[]{127468, 127479}, new int[]{127468, 127473}, new int[]{127468, 127465}, new int[]{127468, 127477}, new int[]{127468, 127482}, new int[]{127468, 127481}, new int[]{127468, 127468}, new int[]{127468, 127475}, new int[]{127468, 127484}, new int[]{127468, 127486}, new int[]{127469, 127481}, new int[]{127469, 127475}, new int[]{127469, 127472}, new int[]{127469, 127482}, new int[]{127470, 127480}, new int[]{127470, 127475}, new int[]{127470, 127465}, new int[]{127470, 127479}, new int[]{127470, 127478}, new int[]{127470, 127466}, new int[]{127470, 127474}, new int[]{127470, 127473}, new int[]{127470, 127481}, new int[]{127464, 127470}, new int[]{127471, 127474}, new int[]{127471, 127477}, new int[]{127471, 127466}, new int[]{127471, 127476}, new int[]{127472, 127487}, new int[]{127472, 127466}, new int[]{127472, 127470}, new int[]{127485, 127472}, new int[]{127472, 127484}, new int[]{127472, 127468}, new int[]{127473, 127462}, new int[]{127473, 127483}, new int[]{127473, 127463}, new int[]{127473, 127480}, new int[]{127473, 127479}, new int[]{127473, 127486}, new int[]{127473, 127470}, new int[]{127473, 127481}, new int[]{127473, 127482}, new int[]{127474, 127476}, new int[]{127474, 127472}, new int[]{127474, 127468}, new int[]{127474, 127484}, new int[]{127474, 127486}, new int[]{127474, 127483}, new int[]{127474, 127473}, new int[]{127474, 127481}, new int[]{127474, 127469}, new int[]{127474, 127478}, new int[]{127474, 127479}, new int[]{127474, 127482}, new int[]{127486, 127481}, new int[]{127474, 127485}, new int[]{127467, 127474}, new int[]{127474, 127465}, new int[]{127474, 127464}, new int[]{127474, 127475}, new int[]{127474, 127466}, new int[]{127474, 127480}, new int[]{127474, 127462}, new int[]{127474, 127487}, new int[]{127474, 127474}, new int[]{127475, 127462}, new int[]{127475, 127479}, new int[]{127475, 127477}, new int[]{127475, 127473}, new int[]{127475, 127464}, new int[]{127475, 127487}, new int[]{127475, 127470}, new int[]{127475, 127466}, new int[]{127475, 127468}, new int[]{127475, 127482}, new int[]{127475, 127467}, new int[]{127474, 127477}, new int[]{127472, 127477}, new int[]{127475, 127476}, new int[]{127476, 127474}, new int[]{127477, 127472}, new int[]{127477, 127484}, new int[]{127477, 127480}, new int[]{127477, 127462}, new int[]{127477, 127468}, new int[]{127477, 127486}, new int[]{127477, 127466}, new int[]{127477, 127469}, new int[]{127477, 127475}, new int[]{127477, 127473}, new int[]{127477, 127481}, new int[]{127477, 127479}, new int[]{127478, 127462}, new int[]{127479, 127466}, new int[]{127479, 127476}, new int[]{127479, 127482}, new int[]{127479, 127484}, new int[]{127463, 127473}, new int[]{127480, 127469}, new int[]{127472, 127475}, new int[]{127473, 127464}, new int[]{127477, 127474}, new int[]{127483, 127464}, new int[]{127484, 127480}, new int[]{127480, 127474}, new int[]{127480, 127481}, new int[]{127480, 127462}, new int[]{127480, 127475}, new int[]{127479, 127480}, new int[]{127480, 127464}, new int[]{127480, 127473}, new int[]{127480, 127468}, new int[]{127480, 127485}, new int[]{127480, 127472}, new int[]{127480, 127470}, new int[]{127480, 127463}, new int[]{127480, 127476}, new int[]{127487, 127462}, new int[]{127468, 127480}, new int[]{127472, 127479}, new int[]{127480, 127480}, new int[]{127466, 127480}, new int[]{127473, 127472}, new int[]{127480, 127465}, new int[]{127480, 127479}, new int[]{127480, 127487}, new int[]{127480, 127466}, new int[]{127464, 127469}, new int[]{127480, 127486}, new int[]{127481, 127484}, new int[]{127481, 127471}, new int[]{127481, 127487}, new int[]{127481, 127469}, new int[]{127481, 127473}, new int[]{127481, 127468}, new int[]{127481, 127472}, new int[]{127481, 127476}, new int[]{127481, 127481}, new int[]{127481, 127475}, new int[]{127481, 127479}, new int[]{127481, 127474}, new int[]{127481, 127464}, new int[]{127481, 127483}, new int[]{127482, 127468}, new int[]{127482, 127462}, new int[]{127462, 127466}, new int[]{127468, 127463}, new int[]{127482, 127480}, new int[]{127483, 127470}, new int[]{127482, 127486}, new int[]{127482, 127487}, new int[]{127483, 127482}, new int[]{127483, 127462}, new int[]{127483, 127466}, new int[]{127483, 127475}, new int[]{127484, 127467}, new int[]{127466, 127469}, new int[]{127486, 127466}, new int[]{127487, 127474}, new int[]{127487, 127484}, new int[]{127485, 127466}};
                    t = 1;
                    r8 = new avc[9];
                    r8[2] = new avc(2, C, 2131755640, 2131755641, null);
                    r8[3] = new avc(3, x, 2131755642, 2131755643, null);
                    r8[4] = new avc(4, e, 2131755644, 2131755645, null);
                    r8[5] = new avc(5, l, 2131755646, 2131755647, null);
                    r8[6] = new avc(6, g, 2131755648, 2131755649, null);
                    r8[7] = new avc(7, F, 2131755650, 2131755651, null);
                    r8[8] = new avc(8, s, 2131755652, 2131755653, null);
                    p = r8;
                    q = new asi();
                    return;
                default:
                    strArr2[i2] = str;
                    str = "ee0y>\u0000\\7a2Al";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static int d(int i) {
        t = i;
        return i;
    }

    static SharedPreferences l() {
        return n();
    }

    private static SharedPreferences n() {
        return App.z().getSharedPreferences(H[5], 0);
    }

    static a23 h(aol com_whatsapp_aol) {
        return com_whatsapp_aol.z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r10) {
        /*
        r9 = this;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = p;
        r5 = r4.length;
        r1 = r2;
    L_0x0007:
        if (r1 >= r5) goto L_0x0049;
    L_0x0009:
        r6 = r4[r1];
        r0 = r9.n;
        r7 = com.whatsapp.avc.a(r6);
        r7 = r0.findViewById(r7);
        r0 = r9.n;
        r8 = com.whatsapp.avc.c(r6);
        r0 = r0.findViewById(r8);
        r0 = (android.widget.ImageView) r0;
        r0 = (android.widget.ImageView) r0;
        if (r0 == 0) goto L_0x0045;
    L_0x0025:
        r6 = com.whatsapp.avc.b(r6);
        if (r6 != r10) goto L_0x003f;
    L_0x002b:
        r6 = 1;
        r0.setSelected(r6);
        r6 = r7.getContext();
        r8 = 2131623943; // 0x7f0e0007 float:1.8875052E38 double:1.05316216E-314;
        r6 = android.support.v4.content.ContextCompat.getColor(r6, r8);
        r7.setBackgroundColor(r6);
        if (r3 == 0) goto L_0x0045;
    L_0x003f:
        r0.setSelected(r2);
        r7.setBackgroundColor(r2);
    L_0x0045:
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x004a;
    L_0x0049:
        return;
    L_0x004a:
        r1 = r0;
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aol.b(int):void");
    }

    static a_2[] e(aol com_whatsapp_aol) {
        return com_whatsapp_aol.u;
    }

    public static int a(int[] iArr) {
        return er.a(new a_9(iArr));
    }

    static int[][] h() {
        return f;
    }

    private static void o() {
        Closeable objectOutputStream;
        Throwable e;
        synchronized (o) {
            Closeable closeable = null;
            try {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(App.z().getFilesDir(), H[2])));
                try {
                    objectOutputStream.writeObject(o);
                    ao.a(objectOutputStream);
                } catch (IOException e2) {
                    e = e2;
                    try {
                        Log.a(e);
                        ao.a(objectOutputStream);
                    } catch (Throwable th) {
                        e = th;
                        closeable = objectOutputStream;
                        ao.a(closeable);
                        throw e;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                objectOutputStream = null;
                Log.a(e);
                ao.a(objectOutputStream);
            } catch (Throwable th2) {
                e = th2;
                ao.a(closeable);
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c() {
        /*
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = o;
        if (r0 != 0) goto L_0x00c8;
    L_0x0006:
        r0 = new java.io.File;
        r1 = com.whatsapp.App.z();
        r1 = r1.getFilesDir();
        r2 = H;
        r4 = 3;
        r2 = r2[r4];
        r0.<init>(r1, r2);
        r1 = r0.exists();
        if (r1 == 0) goto L_0x00b1;
    L_0x001e:
        r2 = 0;
        r1 = new com.whatsapp.fj;	 Catch:{ Exception -> 0x010e, all -> 0x00fc }
        r4 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x010e, all -> 0x00fc }
        r4.<init>(r0);	 Catch:{ Exception -> 0x010e, all -> 0x00fc }
        r1.<init>(r4);	 Catch:{ Exception -> 0x010e, all -> 0x00fc }
        r2 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00d0 }
        r0 = r1.readObject();	 Catch:{ Exception -> 0x00d0 }
        r0 = (java.util.List) r0;	 Catch:{ Exception -> 0x00d0 }
        r0 = (java.util.List) r0;	 Catch:{ Exception -> 0x00d0 }
        r2.<init>(r0);	 Catch:{ Exception -> 0x00d0 }
        r0 = java.util.Collections.synchronizedList(r2);	 Catch:{ Exception -> 0x00d0 }
        o = r0;	 Catch:{ Exception -> 0x00d0 }
        r2 = o;	 Catch:{ Exception -> 0x00d0 }
        monitor-enter(r2);	 Catch:{ Exception -> 0x00d0 }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x00cd }
        r4.<init>();	 Catch:{ all -> 0x00cd }
        r0 = o;	 Catch:{ all -> 0x00cd }
        r5 = r0.iterator();	 Catch:{ all -> 0x00cd }
    L_0x004a:
        r0 = r5.hasNext();	 Catch:{ all -> 0x00cd }
        if (r0 == 0) goto L_0x00a6;
    L_0x0050:
        r0 = r5.next();	 Catch:{ all -> 0x00cd }
        r0 = (com.whatsapp.EmojiPicker$EmojiWeight) r0;	 Catch:{ all -> 0x00cd }
        r6 = r0.emoji;	 Catch:{ IOException -> 0x00c9 }
        if (r6 != 0) goto L_0x0093;
    L_0x005a:
        r6 = r0.modifier;	 Catch:{ IOException -> 0x00c9 }
        if (r6 == 0) goto L_0x0077;
    L_0x005e:
        r6 = 2;
        r6 = new int[r6];	 Catch:{ IOException -> 0x00cb }
        r0.emoji = r6;	 Catch:{ IOException -> 0x00cb }
        r6 = r0.emoji;	 Catch:{ IOException -> 0x00cb }
        r7 = 0;
        r8 = r0.code;	 Catch:{ IOException -> 0x00cb }
        r8 = com.whatsapp.ax0.b(r8);	 Catch:{ IOException -> 0x00cb }
        r6[r7] = r8;	 Catch:{ IOException -> 0x00cb }
        r6 = r0.emoji;	 Catch:{ IOException -> 0x00cb }
        r7 = 1;
        r8 = r0.modifier;	 Catch:{ IOException -> 0x00cb }
        r6[r7] = r8;	 Catch:{ IOException -> 0x00cb }
        if (r3 == 0) goto L_0x0093;
    L_0x0077:
        r6 = r0.code;	 Catch:{ all -> 0x00cd }
        r6 = com.whatsapp.ax0.a(r6);	 Catch:{ all -> 0x00cd }
        if (r6 == 0) goto L_0x0083;
    L_0x007f:
        r0.emoji = r6;	 Catch:{ IOException -> 0x00f6 }
        if (r3 == 0) goto L_0x0093;
    L_0x0083:
        r6 = 1;
        r6 = new int[r6];	 Catch:{ IOException -> 0x00f8 }
        r0.emoji = r6;	 Catch:{ IOException -> 0x00f8 }
        r6 = r0.emoji;	 Catch:{ IOException -> 0x00f8 }
        r7 = 0;
        r8 = r0.code;	 Catch:{ IOException -> 0x00f8 }
        r8 = com.whatsapp.ax0.b(r8);	 Catch:{ IOException -> 0x00f8 }
        r6[r7] = r8;	 Catch:{ IOException -> 0x00f8 }
    L_0x0093:
        r6 = new com.whatsapp.a_9;	 Catch:{ IOException -> 0x00fa }
        r7 = r0.emoji;	 Catch:{ IOException -> 0x00fa }
        r6.<init>(r7);	 Catch:{ IOException -> 0x00fa }
        r6 = com.whatsapp.er.a(r6);	 Catch:{ IOException -> 0x00fa }
        r7 = -1;
        if (r6 != r7) goto L_0x00a4;
    L_0x00a1:
        r4.add(r0);	 Catch:{ IOException -> 0x00fa }
    L_0x00a4:
        if (r3 == 0) goto L_0x004a;
    L_0x00a6:
        r0 = o;	 Catch:{ all -> 0x00cd }
        r0.removeAll(r4);	 Catch:{ all -> 0x00cd }
        monitor-exit(r2);	 Catch:{ all -> 0x00cd }
        if (r1 == 0) goto L_0x00b1;
    L_0x00ae:
        r1.close();	 Catch:{ IOException -> 0x0108 }
    L_0x00b1:
        r0 = o;	 Catch:{ IOException -> 0x0104 }
        if (r0 != 0) goto L_0x00c5;
    L_0x00b5:
        r0 = new java.util.ArrayList;	 Catch:{ IOException -> 0x0106 }
        r0.<init>();	 Catch:{ IOException -> 0x0106 }
        r0 = java.util.Collections.synchronizedList(r0);	 Catch:{ IOException -> 0x0106 }
        o = r0;	 Catch:{ IOException -> 0x0106 }
        r0 = 1;
        t = r0;	 Catch:{ IOException -> 0x0106 }
        if (r3 == 0) goto L_0x00c8;
    L_0x00c5:
        r0 = 0;
        t = r0;	 Catch:{ IOException -> 0x0106 }
    L_0x00c8:
        return;
    L_0x00c9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00cd }
        throw r0;	 Catch:{ Exception -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
    L_0x00d1:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010c }
        r2.<init>();	 Catch:{ all -> 0x010c }
        r4 = H;	 Catch:{ all -> 0x010c }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ all -> 0x010c }
        r2 = r2.append(r4);	 Catch:{ all -> 0x010c }
        r0 = r0.toString();	 Catch:{ all -> 0x010c }
        r0 = r2.append(r0);	 Catch:{ all -> 0x010c }
        r0 = r0.toString();	 Catch:{ all -> 0x010c }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x010c }
        if (r1 == 0) goto L_0x00b1;
    L_0x00f0:
        r1.close();	 Catch:{ IOException -> 0x00f4 }
        goto L_0x00b1;
    L_0x00f4:
        r0 = move-exception;
        goto L_0x00b1;
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00cd }
    L_0x00fa:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00cd }
    L_0x00fc:
        r0 = move-exception;
        r1 = r2;
    L_0x00fe:
        if (r1 == 0) goto L_0x0103;
    L_0x0100:
        r1.close();	 Catch:{ IOException -> 0x010a }
    L_0x0103:
        throw r0;
    L_0x0104:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0106 }
    L_0x0106:
        r0 = move-exception;
        throw r0;
    L_0x0108:
        r0 = move-exception;
        goto L_0x00b1;
    L_0x010a:
        r1 = move-exception;
        goto L_0x0103;
    L_0x010c:
        r0 = move-exception;
        goto L_0x00fe;
    L_0x010e:
        r0 = move-exception;
        r1 = r2;
        goto L_0x00d1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aol.c():void");
    }

    private static Drawable a(int i) {
        SoftReference softReference = (SoftReference) b.get(i);
        return softReference == null ? null : (Drawable) softReference.get();
    }

    static int c(aol com_whatsapp_aol) {
        return com_whatsapp_aol.w;
    }

    static List a() {
        return o;
    }

    public void a(boolean z) {
        if (this.i != null) {
            int i;
            ImageView imageView = this.i;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    static void a(aol com_whatsapp_aol, int[] iArr) {
        com_whatsapp_aol.b(iArr);
    }

    static l_ i(aol com_whatsapp_aol) {
        return com_whatsapp_aol.k;
    }

    private void a(EmojiPicker$EmojiImageView emojiPicker$EmojiImageView) {
        View view;
        this.k = new l_(this, emojiPicker$EmojiImageView);
        int[] iArr = new int[2];
        emojiPicker$EmojiImageView.getLocationOnScreen(iArr);
        Activity activity = (Activity) emojiPicker$EmojiImageView.getContext();
        if (this.h != null) {
            view = this.h;
        } else {
            view = activity.getWindow().getDecorView();
        }
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        this.k.showAtLocation(view, 51, ((iArr[0] - iArr2[0]) + (emojiPicker$EmojiImageView.getMeasuredWidth() / 2)) - (this.k.getContentView().getMeasuredWidth() / 2), ((iArr[1] - iArr2[1]) - this.k.getContentView().getMeasuredHeight()) - emojiPicker$EmojiImageView.getContext().getResources().getDimensionPixelSize(2131427543));
    }

    static View b(aol com_whatsapp_aol) {
        return com_whatsapp_aol.v;
    }

    static int g() {
        return y;
    }

    public aol(Context context, ViewGroup viewGroup) {
        boolean z = DialogToastActivity.f;
        this.u = new a_2[p.length];
        this.r = new Paint();
        c();
        this.A = context;
        this.n = (ViewGroup) viewGroup.findViewById(2131755635);
        this.u[0] = new a_2(this, this.A, 0);
        this.B = (ViewPager) viewGroup.findViewById(2131755458);
        this.B.setAdapter(new ch(this, null));
        this.B.setOnPageChangeListener(new aqz(this));
        this.G = (LayoutInflater) context.getSystemService(H[0]);
        this.E = context.getResources().getDimensionPixelSize(2131427483);
        this.w = context.getResources().getDimensionPixelSize(2131427482);
        avc[] com_whatsapp_avcArr = p;
        int length = com_whatsapp_avcArr.length;
        int i = 0;
        while (i < length) {
            avc com_whatsapp_avc = com_whatsapp_avcArr[i];
            this.n.findViewById(avc.c(com_whatsapp_avc)).setOnClickListener(new ae6(this, com_whatsapp_avc));
            i++;
            if (z) {
                break;
            }
        }
        if (App.a1()) {
            i = t;
        } else {
            i = (this.u.length - 1) - t;
        }
        this.B.setCurrentItem(i, false);
        b(t);
        this.m = new azn(this);
        this.i = (ImageView) viewGroup.findViewById(2131755654);
        if (this.i != null) {
            Handler qwVar = new qw(this, Looper.getMainLooper());
            this.i.setClickable(true);
            this.i.setOnTouchListener(new a46(this, qwVar));
            this.i.setImageDrawable(new bz(ContextCompat.getDrawable(this.A, 2130839395)));
        }
        this.v = viewGroup.findViewById(2131755656);
        this.v.setVisibility(8);
        this.v.findViewById(2131755404).setOnClickListener(new aao(this));
    }

    static av2 d() {
        return D;
    }

    static Drawable b(Context context, int i) {
        return a(context, i);
    }

    static void a(int i, Drawable drawable) {
        b(i, drawable);
    }

    static Context l(aol com_whatsapp_aol) {
        return com_whatsapp_aol.A;
    }

    static avc[] i() {
        return p;
    }

    public void k() {
        if (c == null) {
            c = new HandlerThread(H[1]);
            c.start();
            D = new av2(c.getLooper(), null);
            d = new tj(App.z().getMainLooper(), null);
        }
    }

    public void b() {
        this.v.setVisibility(8);
    }

    public void a(View view) {
        this.h = view;
    }

    public void e(int i) {
        boolean z = DialogToastActivity.f;
        if (this.a != i) {
            this.a = i;
            int i2 = 1;
            while (i2 < this.u.length) {
                if (this.u[i2] != null) {
                    this.u[i2].notifyDataSetChanged();
                }
                i2++;
                if (z) {
                    break;
                }
            }
        }
        if (this.u[0] != null) {
            this.u[0].notifyDataSetChanged();
        }
    }

    private static Drawable a(Context context, int i) {
        return _3.a(context, i);
    }

    static void a(aol com_whatsapp_aol, int i, int i2) {
        com_whatsapp_aol.a(i, i2);
    }

    private void a(int i, int i2) {
        int i3;
        boolean z = DialogToastActivity.f;
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(2131755657);
        viewGroup.removeAllViews();
        int dimensionPixelSize = this.A.getResources().getDimensionPixelSize(2131427483);
        int dimensionPixelSize2 = (dimensionPixelSize - this.A.getResources().getDimensionPixelSize(2131427482)) / 2;
        int i4 = 0;
        while (i4 <= 5) {
            View imageView = new ImageView(this.v.getContext());
            imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            imageView.setScaleType(ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new LayoutParams(dimensionPixelSize, dimensionPixelSize));
            int[] iArr = new int[2];
            iArr[0] = i;
            iArr[1] = i4 == 0 ? 0 : (127995 + i4) - 1;
            imageView.setImageDrawable(_3.a(this.A, er.a(new a_9(iArr))));
            viewGroup.addView(imageView);
            i3 = i4 + 1;
            if (z) {
                break;
            }
            i4 = i3;
        }
        i3 = er.a(new a_9(new int[]{i, i2}));
        ImageView imageView2 = (ImageView) this.v.findViewById(2131755658);
        imageView2.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        imageView2.setScaleType(ScaleType.FIT_CENTER);
        imageView2.setImageDrawable(_3.a(this.A, i3));
        this.v.setVisibility(0);
    }

    public static List a(Vector vector) {
        boolean z = DialogToastActivity.f;
        c();
        if (vector != null && vector.size() > 0) {
            HashMap hashMap = new HashMap(vector.size());
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                c2 c2Var = (c2) it.next();
                hashMap.put(c2Var.i, Float.valueOf(c2Var.f));
                if (z) {
                    break;
                }
            }
            synchronized (o) {
                for (EmojiPicker$EmojiWeight emojiPicker$EmojiWeight : o) {
                    String str = new String(emojiPicker$EmojiWeight.emoji, 0, emojiPicker$EmojiWeight.emoji.length);
                    Float f = (Float) hashMap.get(str);
                    if (f != null) {
                        emojiPicker$EmojiWeight.weight = (f.floatValue() + emojiPicker$EmojiWeight.weight) / 2.0f;
                        hashMap.remove(str);
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                for (String str2 : hashMap.keySet()) {
                    int[] iArr = new int[str2.codePointCount(0, str2.length())];
                    int length = str2.length();
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int codePointAt = str2.codePointAt(i);
                        iArr[i2] = codePointAt;
                        i += Character.charCount(codePointAt);
                        i2++;
                        if (z) {
                            break;
                        }
                    }
                    o.add(new EmojiPicker$EmojiWeight(iArr, ((Float) hashMap.get(str2)).floatValue()));
                    if (z) {
                        break;
                    }
                }
                Collections.sort(o, q);
                m();
                o();
            }
        }
        List arrayList = new ArrayList(o.size());
        synchronized (o) {
            for (EmojiPicker$EmojiWeight emojiPicker$EmojiWeight2 : o) {
                c2 c2Var2 = new c2();
                c2Var2.i = new String(emojiPicker$EmojiWeight2.emoji, 0, emojiPicker$EmojiWeight2.emoji.length);
                c2Var2.f = emojiPicker$EmojiWeight2.weight;
                arrayList.add(c2Var2);
                if (z) {
                    break;
                }
            }
        }
        return arrayList;
    }

    static Drawable c(int i) {
        return a(i);
    }

    static ViewPager a(aol com_whatsapp_aol) {
        return com_whatsapp_aol.B;
    }

    private static void b(int i, Drawable drawable) {
        b.put(i, new SoftReference(drawable));
    }

    static int g(aol com_whatsapp_aol) {
        return com_whatsapp_aol.E;
    }

    static int k(aol com_whatsapp_aol) {
        return com_whatsapp_aol.a;
    }

    static tj e() {
        return d;
    }

    private void b(int[] iArr) {
        boolean z = DialogToastActivity.f;
        synchronized (o) {
            int i;
            int i2 = 0;
            for (EmojiPicker$EmojiWeight emojiPicker$EmojiWeight : o) {
                if (!emojiPicker$EmojiWeight.compareEmoji(iArr)) {
                    emojiPicker$EmojiWeight.weight *= 0.9f;
                    if (!z) {
                        i = i2;
                        if (z) {
                            break;
                        }
                        i2 = i;
                    }
                }
                emojiPicker$EmojiWeight.weight += 1.0f;
                i = 1;
                if (z) {
                    break;
                }
                i2 = i;
            }
            i = i2;
            if (i == 0) {
                o.add(new EmojiPicker$EmojiWeight(iArr, 1.0f));
            }
            Collections.sort(o, q);
            m();
            o();
        }
        if (t != 0) {
            this.u[0].notifyDataSetChanged();
        }
        if (this.z != null) {
            i2 = iArr.length;
            i = 0;
            while (i < i2) {
                this.z.a(iArr[i]);
                i++;
                if (z) {
                    return;
                }
            }
        }
    }

    public void a(a23 com_whatsapp_a23) {
        this.z = com_whatsapp_a23;
    }

    public boolean a(View view, MotionEvent motionEvent) {
        if (this.k == null || !this.k.isShowing()) {
            return false;
        }
        this.k.a(view, motionEvent);
        return true;
    }

    static OnClickListener j(aol com_whatsapp_aol) {
        return com_whatsapp_aol.m;
    }

    private static void m() {
        boolean z = DialogToastActivity.f;
        synchronized (o) {
            int size = o.size() - 1;
            while (size > 35) {
                if (((EmojiPicker$EmojiWeight) o.get(size)).weight < 0.1f) {
                    o.remove(size);
                }
                int i = size - 1;
                if (z) {
                    break;
                }
                size = i;
            }
        }
    }

    static void a(aol com_whatsapp_aol, int i) {
        com_whatsapp_aol.b(i);
    }

    static void a(aol com_whatsapp_aol, EmojiPicker$EmojiImageView emojiPicker$EmojiImageView) {
        com_whatsapp_aol.a(emojiPicker$EmojiImageView);
    }

    static int j() {
        return t;
    }

    static Paint f(aol com_whatsapp_aol) {
        return com_whatsapp_aol.r;
    }

    static int f() {
        return j;
    }

    static LayoutInflater d(aol com_whatsapp_aol) {
        return com_whatsapp_aol.G;
    }
}
