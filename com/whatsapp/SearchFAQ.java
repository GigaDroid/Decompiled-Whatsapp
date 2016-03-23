package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.f;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.bq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SearchFAQ extends DialogToastListActivity {
    private static final String[] B;
    private HashSet A;
    private String t;
    private ArrayList u;
    private String v;
    private HashMap w;
    private String x;
    private int y;
    private int z;

    static {
        String[] strArr = new String[26];
        String str = "\bq>[D\f}=JG\u0019j\u0012Lc\u0015{?[";
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
                        i3 = 124;
                        break;
                    case at.g /*1*/:
                        i3 = 24;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 62;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ":y\"wc\u0019u lr\u001d|\u0007Wc\u0010} ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}Ne\u0013z?[z";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}J~\bt6M";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}]x\tv'";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}Ke\u0010k";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}Mc\u001dl&M";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}Zr\u000f{!Wg\bq<Pd";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}Xe\u0013u";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001dv7Lx\u0015|}Wy\b}=J9\u0019`'LvRK\u0007lR=U";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001dv7Lx\u0015|}Wy\b}=J9\u0019`'LvRK\u0007lR=U";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}Zr\u000f{!Wg\bq<Pd";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0019`:JD\by'[";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0010y*Qb\bG:Pq\u0010y'[e";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\bq>[D\f}=JG\u0019j\u0012Lc\u0015{?[";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}]x\tv'";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}Xe\u0013u";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}Ne\u0013z?[z";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\bq>[D\f}=JG\u0019j\u0012Lc\u0015{?[";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}J~\bt6M";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = ":y\"wc\u0019u lr\u001d|\u0007Wc\u0010} ";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}Mc\u001dl&M";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    str = "\u001fw>\u0010`\u0014y'Mv\fh}mr\u001dj0VQ=I}Ke\u0010k";
                    obj = 22;
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    str = "\u001dj'Wt\u0010}\fWs";
                    i = 24;
                    strArr2 = strArr3;
                    obj = 23;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    strArr2 = strArr3;
                    str = "\bw'_{#l:Sr#k#[y\b";
                    obj = 24;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    B = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0019`:JD\by'[";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int b() {
        return this.y;
    }

    static String c(SearchFAQ searchFAQ) {
        return searchFAQ.x;
    }

    private void d() {
        al alVar = new al();
        alVar.m = Double.valueOf((double) this.z);
        alVar.g = this.t;
        if (this.w.size() > 0) {
            List arrayList = new ArrayList(this.w.entrySet());
            Collections.sort(arrayList, new az8(this));
            Collections.reverse(arrayList);
            alVar.j = Double.valueOf((double) ((Integer) ((Entry) arrayList.get(0)).getKey()).intValue());
            alVar.r = Double.valueOf((double) ((Long) ((Entry) arrayList.get(0)).getValue()).longValue());
            if (arrayList.size() > 1) {
                alVar.b = Double.valueOf((double) ((Integer) ((Entry) arrayList.get(1)).getKey()).intValue());
                alVar.f = Double.valueOf((double) ((Long) ((Entry) arrayList.get(1)).getValue()).longValue());
                if (arrayList.size() > 2) {
                    alVar.n = Double.valueOf((double) ((Integer) ((Entry) arrayList.get(2)).getKey()).intValue());
                    alVar.s = Double.valueOf((double) ((Long) ((Entry) arrayList.get(2)).getValue()).longValue());
                }
            }
        }
        alVar.o = Double.valueOf((double) e());
        alVar.e = Double.valueOf((double) this.y);
        alVar.c = Double.valueOf((double) this.A.size());
        bq.a(new az5(this, alVar));
    }

    static String a(SearchFAQ searchFAQ) {
        return searchFAQ.t;
    }

    static int a(SearchFAQ searchFAQ, int i) {
        searchFAQ.z = i;
        return i;
    }

    static ArrayList e(SearchFAQ searchFAQ) {
        return searchFAQ.u;
    }

    public void onCreate(Bundle bundle) {
        int length;
        int i;
        boolean z = DialogToastActivity.f;
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(2130903260);
        this.A = new HashSet();
        if (bundle != null) {
            String[] stringArray = bundle.getStringArray(B[21]);
            if (stringArray != null) {
                length = stringArray.length;
                i = 0;
                while (i < length) {
                    this.A.add(stringArray[i]);
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
            if (bundle.containsKey(B[15])) {
                this.w = (HashMap) bundle.getSerializable(B[19]);
            }
            this.z = bundle.getInt(B[13], f.PROBLEM_DESCRIPTION.getCode());
        }
        Intent intent = getIntent();
        this.x = intent.getStringExtra(B[17]);
        this.t = intent.getStringExtra(B[18]);
        this.v = intent.getStringExtra(B[22]);
        this.u = intent.getParcelableArrayListExtra(B[11]);
        if (this.w == null) {
            this.w = new HashMap();
        }
        ((Button) findViewById(2131755885)).setOnClickListener(new f2(this));
        ArrayList stringArrayListExtra = intent.getStringArrayListExtra(B[20]);
        ArrayList stringArrayListExtra2 = intent.getStringArrayListExtra(B[12]);
        ArrayList stringArrayListExtra3 = intent.getStringArrayListExtra(B[23]);
        int intExtra = intent.getIntExtra(B[16], 0);
        this.y = intExtra;
        List arrayList = new ArrayList();
        length = 0;
        while (length < intExtra) {
            arrayList.add(new fo(this, (String) stringArrayListExtra.get(length), (String) stringArrayListExtra2.get(length), (String) stringArrayListExtra3.get(length)));
            i = length + 1;
            if (z) {
                break;
            }
            length = i;
        }
        ListAdapter com_whatsapp_a36 = new a36(this, this, 2130903262, arrayList);
        View a = a();
        a.addHeaderView(aam.a((LayoutInflater) getSystemService(B[14]), 2130903261, null));
        a(com_whatsapp_a36);
        registerForContextMenu(a);
    }

    static void b(SearchFAQ searchFAQ) {
        searchFAQ.d();
    }

    public int a() {
        return this.A.size();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            if (this.A != null && this.A.size() > 0) {
                bundle.putStringArray(B[2], (String[]) this.A.toArray(new String[this.A.size()]));
            }
            if (this.w != null && this.w.size() > 0) {
                bundle.putSerializable(B[0], this.w);
            }
            bundle.putInt(B[1], this.z);
        }
        super.onSaveInstanceState(bundle);
    }

    static HashSet f(SearchFAQ searchFAQ) {
        return searchFAQ.A;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            long longValue;
            long longExtra = intent.getLongExtra(B[25], 0);
            int intExtra = intent.getIntExtra(B[24], -1);
            if (this.w.containsKey(Integer.valueOf(intExtra))) {
                longValue = ((Long) this.w.get(Integer.valueOf(intExtra))).longValue() + longExtra;
            } else {
                longValue = longExtra;
            }
            this.w.put(Integer.valueOf(intExtra), Long.valueOf(longValue));
        }
    }

    public void onBackPressed() {
        d();
        super.onBackPressed();
    }

    static String d(SearchFAQ searchFAQ) {
        return searchFAQ.v;
    }

    private long e() {
        boolean z = DialogToastActivity.f;
        long j = 0;
        for (Long longValue : this.w.values()) {
            long longValue2 = longValue.longValue() + j;
            if (z) {
                return longValue2;
            }
            j = longValue2;
        }
        return j;
    }

    public static void a(Context context, String str, String str2, ArrayList arrayList, String str3, int i, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        Intent intent = new Intent(context, SearchFAQ.class);
        intent.putExtra(B[9], str);
        intent.putExtra(B[3], str2);
        intent.putExtra(B[7], str3);
        intent.putExtra(B[5], i);
        intent.putStringArrayListExtra(B[4], arrayList2);
        intent.putStringArrayListExtra(B[8], arrayList3);
        intent.putStringArrayListExtra(B[6], arrayList4);
        intent.putParcelableArrayListExtra(B[10], arrayList);
        context.startActivity(intent);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case at.g /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131231768));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            default:
                return super.onCreateDialog(i);
        }
    }
}
