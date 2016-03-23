import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.telephony.PhoneNumberUtils;
import com.whatsapp.App;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.l5;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.cs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class q {
    public static HashMap b;
    public static HashMap c;
    public static boolean h;
    private static final String[] z;
    public String a;
    private Context d;
    public byte[] e;
    public String f;
    public Map g;
    public List i;
    public j j;
    public List k;
    public List l;
    public List m;

    public q() {
        this.j = new j();
        this.m = new ArrayList();
    }

    public void a(Class cls, int i, String str, String str2, boolean z) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        c cVar = new c();
        cVar.c = cls;
        cVar.f = i;
        cVar.e = str;
        cVar.b = str2;
        cVar.d = z;
        this.l.add(cVar);
    }

    public void h(String str) {
        boolean z = h;
        String[] strArr = new String[]{z[56], z[61], z[70], z[63], z[57], z[59], z[64]};
        Cursor query = this.d.getContentResolver().query(Data.CONTENT_URI, strArr, z[65], new String[]{str, z[62]}, null);
        if (query != null) {
            while (query.moveToNext()) {
                this.j.g = query.getString(query.getColumnIndex(z[58]));
                this.j.h = query.getString(query.getColumnIndex(z[67]));
                this.j.c = query.getString(query.getColumnIndex(z[71]));
                this.j.f = query.getString(query.getColumnIndex(z[66]));
                this.j.a = query.getString(query.getColumnIndex(z[69]));
                this.j.d = query.getString(query.getColumnIndex(z[68]));
                this.j.b = query.getString(query.getColumnIndex(z[60]));
                if (z) {
                    break;
                }
            }
            query.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(m r4) {
        /*
        r3 = this;
        r0 = r4.c;
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        r0 = r4.c;
        r0 = r0.length();
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r1 = r4.a;
        r0 = r3.g;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new java.util.HashMap;
        r0.<init>();
        r3.g = r0;
    L_0x001a:
        r0 = r3.g;
        r0 = r0.containsKey(r1);
        if (r0 != 0) goto L_0x0030;
    L_0x0022:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r2 = r3.g;
        r2.put(r1, r0);
        r2 = h;
        if (r2 == 0) goto L_0x0038;
    L_0x0030:
        r0 = r3.g;
        r0 = r0.get(r1);
        r0 = (java.util.List) r0;
    L_0x0038:
        r0.add(r4);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a(m):void");
    }

    public void i(String str) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        int size = this.i.size();
        if (size == 0) {
            a(2, "", null, false);
            size = 1;
        }
        ((o) this.i.get(size - 1)).a = str;
    }

    public void d(String str) {
        Cursor query = this.d.getContentResolver().query(Data.CONTENT_URI, null, z[52], new String[]{str, z[53], String.valueOf(3)}, null);
        if (query != null) {
            if (query.moveToFirst()) {
                m mVar = new m();
                mVar.a = z[54];
                mVar.c = cs.a(query.getString(query.getColumnIndex(z[55])));
                a(mVar);
            }
            query.close();
        }
    }

    public void a(String str) {
        Cursor query = this.d.getContentResolver().query(Data.CONTENT_URI, null, z[76], new String[]{str, z[72]}, null);
        if (query != null) {
            if (query.moveToFirst()) {
                boolean z;
                String string = query.getString(query.getColumnIndex(z[77]));
                String string2 = query.getString(query.getColumnIndex(z[75]));
                StringBuilder append = new StringBuilder().append(string);
                if (string2 == null || string2.length() == 0) {
                    string = "";
                } else {
                    string = ";" + string2;
                }
                string2 = append.append(string).toString();
                String string3 = query.getString(query.getColumnIndex(z[74]));
                if (query.getInt(query.getColumnIndex(z[73])) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                a(1, string2, string3, z);
            }
            query.close();
        }
    }

    public static q k(String str) {
        if (str == null) {
            return null;
        }
        l lVar = new l();
        h hVar = new h();
        if (!lVar.a(str, z[10], hVar)) {
            Log.w(z[9] + str);
        }
        Iterator it = hVar.d.iterator();
        if (it.hasNext()) {
            return a((s) it.next(), 0, str);
        }
        return null;
    }

    public void a(int i, String str, String str2, boolean z) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        o oVar = new o();
        oVar.b = i;
        oVar.c = str;
        oVar.a = str2;
        oVar.d = z;
        this.i.add(oVar);
    }

    public void a(int i, String str, i iVar, String str2, boolean z) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        c cVar = new c();
        cVar.c = StructuredPostal.class;
        cVar.f = i;
        cVar.e = str;
        cVar.a = iVar;
        cVar.b = str2;
        cVar.d = z;
        this.l.add(cVar);
    }

    public void l(String str) {
        boolean z = h;
        Cursor query = this.d.getContentResolver().query(Email.CONTENT_URI, null, z[0], new String[]{str}, null);
        if (query != null) {
            while (query.moveToNext()) {
                boolean z2;
                Class cls = Email.class;
                int i = query.getInt(query.getColumnIndex(z[2]));
                String string = query.getString(query.getColumnIndex(z[4]));
                String string2 = query.getString(query.getColumnIndex(z[3]));
                if (query.getInt(query.getColumnIndex(z[1])) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a(cls, i, string, string2, z2);
                if (z) {
                    break;
                }
            }
            query.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static q a(s r20, int r21, java.lang.String r22) {
        /*
        r12 = h;
        r0 = r20;
        r1 = r0.b;
        r2 = z;
        r3 = 86;
        r2 = r2[r3];
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x001d;
    L_0x0012:
        r1 = z;
        r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
        r1 = 0;
    L_0x001c:
        return r1;
    L_0x001d:
        r1 = new q;
        r1.<init>();
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r0 = r20;
        r6 = r0.c;
        r13 = r6.iterator();
        r8 = r2;
        r9 = r3;
        r10 = r4;
        r3 = r5;
    L_0x0032:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0720;
    L_0x0038:
        r2 = r13.next();
        r7 = r2;
        r7 = (m) r7;
        r14 = r7.a;
        r2 = r7.c;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 == 0) goto L_0x004b;
    L_0x0049:
        if (r12 == 0) goto L_0x0032;
    L_0x004b:
        r2 = z;
        r4 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x00de;
    L_0x0057:
        r2 = r8;
        r4 = r10;
        r5 = r3;
        r3 = r9;
    L_0x005b:
        if (r12 == 0) goto L_0x06d1;
    L_0x005d:
        r8 = r2;
    L_0x005e:
        if (r4 != 0) goto L_0x0078;
    L_0x0060:
        r2 = r1.k;
        if (r2 == 0) goto L_0x0078;
    L_0x0064:
        r2 = r1.k;
        r2 = r2.size();
        if (r2 <= 0) goto L_0x0078;
    L_0x006c:
        r2 = r1.k;
        r4 = 0;
        r2 = r2.get(r4);
        r2 = (g) r2;
        r4 = 1;
        r2.e = r4;
    L_0x0078:
        if (r5 != 0) goto L_0x009d;
    L_0x007a:
        r2 = r1.l;
        if (r2 == 0) goto L_0x009d;
    L_0x007e:
        r2 = r1.l;
        r4 = r2.iterator();
    L_0x0084:
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x009d;
    L_0x008a:
        r2 = r4.next();
        r2 = (c) r2;
        r5 = r2.c;
        r6 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class;
        if (r5 != r6) goto L_0x009b;
    L_0x0096:
        r5 = 1;
        r2.d = r5;
        if (r12 == 0) goto L_0x009d;
    L_0x009b:
        if (r12 == 0) goto L_0x0084;
    L_0x009d:
        if (r3 != 0) goto L_0x00c2;
    L_0x009f:
        r2 = r1.l;
        if (r2 == 0) goto L_0x00c2;
    L_0x00a3:
        r2 = r1.l;
        r3 = r2.iterator();
    L_0x00a9:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x00c2;
    L_0x00af:
        r2 = r3.next();
        r2 = (c) r2;
        r4 = r2.c;
        r5 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        if (r4 != r5) goto L_0x00c0;
    L_0x00bb:
        r4 = 1;
        r2.d = r4;
        if (r12 == 0) goto L_0x00c2;
    L_0x00c0:
        if (r12 == 0) goto L_0x00a9;
    L_0x00c2:
        if (r8 != 0) goto L_0x001c;
    L_0x00c4:
        r2 = r1.i;
        if (r2 == 0) goto L_0x001c;
    L_0x00c8:
        r2 = r1.i;
        r2 = r2.size();
        if (r2 <= 0) goto L_0x001c;
    L_0x00d0:
        r2 = r1.i;
        r3 = 0;
        r2 = r2.get(r3);
        r2 = (o) r2;
        r3 = 1;
        r2.d = r3;
        goto L_0x001c;
    L_0x00de:
        r2 = z;
        r4 = 79;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x00f2;
    L_0x00ea:
        r2 = r1.j;
        r4 = r7.c;
        r2.e = r4;
        if (r12 == 0) goto L_0x071a;
    L_0x00f2:
        r2 = z;
        r4 = 96;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x010c;
    L_0x00fe:
        r2 = r1.j;
        r2 = r2.e;
        if (r2 != 0) goto L_0x010c;
    L_0x0104:
        r2 = r1.j;
        r4 = r7.c;
        r2.e = r4;
        if (r12 == 0) goto L_0x071a;
    L_0x010c:
        r2 = "N";
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0120;
    L_0x0115:
        r2 = r1.j;
        r4 = r7.f;
        r0 = r21;
        a(r2, r4, r0);
        if (r12 == 0) goto L_0x071a;
    L_0x0120:
        r2 = z;
        r4 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0132;
    L_0x012c:
        r2 = r7.c;
        r1.f = r2;
        if (r12 == 0) goto L_0x071a;
    L_0x0132:
        r2 = z;
        r4 = 89;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x017a;
    L_0x013e:
        r2 = r7.d;
        r4 = z;
        r5 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r4 = r4[r5];
        r2 = r2.contains(r4);
        if (r2 == 0) goto L_0x0175;
    L_0x014c:
        r2 = r1.f;
        if (r2 != 0) goto L_0x0175;
    L_0x0150:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = r7.c;
        r6 = r5.length();
        r2 = 0;
    L_0x015c:
        if (r2 >= r6) goto L_0x016d;
    L_0x015e:
        r11 = r5.charAt(r2);
        r15 = 59;
        if (r11 == r15) goto L_0x0169;
    L_0x0166:
        r4.append(r11);
    L_0x0169:
        r2 = r2 + 1;
        if (r12 == 0) goto L_0x015c;
    L_0x016d:
        r2 = r4.toString();
        r1.f = r2;
        if (r12 == 0) goto L_0x071a;
    L_0x0175:
        r1.a(r7);
        if (r12 == 0) goto L_0x071a;
    L_0x017a:
        r2 = z;
        r4 = 98;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0717;
    L_0x0186:
        r4 = r7.f;
        r2 = 1;
        r5 = r4.iterator();
        r4 = r2;
    L_0x018e:
        r2 = r5.hasNext();
        if (r2 == 0) goto L_0x0714;
    L_0x0194:
        r2 = r5.next();
        r2 = (java.lang.String) r2;
        r2 = r2.length();
        if (r2 <= 0) goto L_0x0711;
    L_0x01a0:
        r2 = 0;
        if (r12 == 0) goto L_0x01a5;
    L_0x01a3:
        if (r12 == 0) goto L_0x070e;
    L_0x01a5:
        if (r2 == 0) goto L_0x01a9;
    L_0x01a7:
        if (r12 == 0) goto L_0x0032;
    L_0x01a9:
        r5 = -1;
        r4 = "";
        r2 = 0;
        r6 = r7.d;
        r11 = r6.iterator();
        r6 = r3;
        r3 = r2;
    L_0x01b6:
        r2 = r11.hasNext();
        if (r2 == 0) goto L_0x0702;
    L_0x01bc:
        r2 = r11.next();
        r2 = (java.lang.String) r2;
        r15 = z;
        r16 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r15 = r15[r16];
        r15 = r2.equals(r15);
        if (r15 == 0) goto L_0x01d4;
    L_0x01ce:
        if (r6 != 0) goto L_0x01d4;
    L_0x01d0:
        r6 = 1;
        r3 = 1;
        if (r12 == 0) goto L_0x06fc;
    L_0x01d4:
        r15 = z;
        r16 = 90;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x01e6;
    L_0x01e0:
        r5 = 1;
        r4 = "";
        if (r12 == 0) goto L_0x06fc;
    L_0x01e6:
        r15 = z;
        r16 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 != 0) goto L_0x01fe;
    L_0x01f2:
        r15 = z;
        r16 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x0204;
    L_0x01fe:
        r5 = 2;
        r4 = "";
        if (r12 == 0) goto L_0x06fc;
    L_0x0204:
        r15 = z;
        r16 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x063a;
    L_0x0210:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
    L_0x0214:
        if (r12 == 0) goto L_0x0708;
    L_0x0216:
        r6 = r2;
        r11 = r5;
        r2 = r4;
        r5 = r3;
    L_0x021a:
        if (r2 >= 0) goto L_0x021d;
    L_0x021c:
        r2 = 1;
    L_0x021d:
        r15 = r7.f;
        r3 = r15.size();
        r4 = 0;
        r16 = 1;
        r0 = r16;
        if (r3 <= r0) goto L_0x068a;
    L_0x022a:
        r4 = new i;
        r4.<init>();
        r3 = r15.size();
        r16 = 2;
        r0 = r16;
        if (r3 <= r0) goto L_0x0242;
    L_0x0239:
        r3 = 2;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.b = r3;
    L_0x0242:
        r3 = r15.size();
        r16 = 3;
        r0 = r16;
        if (r3 <= r0) goto L_0x0255;
    L_0x024c:
        r3 = 3;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.c = r3;
    L_0x0255:
        r3 = r15.size();
        r16 = 4;
        r0 = r16;
        if (r3 <= r0) goto L_0x0268;
    L_0x025f:
        r3 = 4;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.e = r3;
    L_0x0268:
        r3 = r15.size();
        r16 = 5;
        r0 = r16;
        if (r3 <= r0) goto L_0x027b;
    L_0x0272:
        r3 = 5;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.f = r3;
    L_0x027b:
        r3 = r15.size();
        r16 = 6;
        r0 = r16;
        if (r3 <= r0) goto L_0x028e;
    L_0x0285:
        r3 = 6;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.d = r3;
    L_0x028e:
        r3 = r15.size();
        r16 = 7;
        r0 = r16;
        if (r3 <= r0) goto L_0x02a3;
    L_0x0298:
        r3 = 7;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.a = r3;
        if (r12 == 0) goto L_0x02bf;
    L_0x02a3:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r15 = z;
        r16 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r15 = r15[r16];
        r3 = r3.append(r15);
        r0 = r22;
        r3 = r3.append(r0);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
    L_0x02bf:
        r3 = r4.toString();
        r3 = r3.trim();
    L_0x02c7:
        r1.a(r2, r3, r4, r5, r6);
        if (r12 == 0) goto L_0x06cb;
    L_0x02cc:
        r2 = z;
        r3 = 85;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0334;
    L_0x02d8:
        r4 = 1;
        r2 = 0;
        r3 = r7.d;
        r5 = r3.iterator();
        r3 = r2;
    L_0x02e1:
        r2 = r5.hasNext();
        if (r2 == 0) goto L_0x0301;
    L_0x02e7:
        r2 = r5.next();
        r2 = (java.lang.String) r2;
        r6 = z;
        r15 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r6 = r6[r15];
        r2 = r2.equals(r6);
        if (r2 == 0) goto L_0x06f9;
    L_0x02f9:
        if (r8 != 0) goto L_0x06f9;
    L_0x02fb:
        r8 = 1;
        r3 = 1;
        r2 = r3;
    L_0x02fe:
        if (r12 == 0) goto L_0x06f6;
    L_0x0300:
        r3 = r2;
    L_0x0301:
        r2 = r7.f;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r2.iterator();
    L_0x030c:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x0328;
    L_0x0312:
        r2 = r6.next();
        r2 = (java.lang.String) r2;
        r5.append(r2);
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x030c;
    L_0x0321:
        r2 = 32;
        r5.append(r2);
        if (r12 == 0) goto L_0x030c;
    L_0x0328:
        r2 = r5.toString();
        r5 = "";
        r1.a(r4, r2, r5, r3);
        if (r12 == 0) goto L_0x06cb;
    L_0x0334:
        r2 = z;
        r3 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0347;
    L_0x0340:
        r2 = r7.c;
        r1.i(r2);
        if (r12 == 0) goto L_0x06cb;
    L_0x0347:
        r2 = z;
        r3 = 97;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x035a;
    L_0x0353:
        r2 = r7.c;
        r1.i(r2);
        if (r12 == 0) goto L_0x06cb;
    L_0x035a:
        r2 = z;
        r3 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0370;
    L_0x0366:
        r2 = r7.c;
        r2 = r2.getBytes();
        r1.e = r2;
        if (r12 == 0) goto L_0x06cb;
    L_0x0370:
        r2 = z;
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0387;
    L_0x037c:
        r2 = z;
        r3 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r2 = r2[r3];
        com.whatsapp.util.Log.e(r2);
        if (r12 == 0) goto L_0x06cb;
    L_0x0387:
        r2 = z;
        r3 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x041e;
    L_0x0393:
        r4 = -1;
        r3 = 0;
        r2 = 0;
        r5 = r7.d;
        r6 = r5.iterator();
        r5 = r4;
        r4 = r3;
        r3 = r2;
    L_0x039f:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x06ec;
    L_0x03a5:
        r2 = r6.next();
        r2 = (java.lang.String) r2;
        r15 = z;
        r16 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r15 = r15[r16];
        r15 = r2.equals(r15);
        if (r15 == 0) goto L_0x03bd;
    L_0x03b7:
        if (r9 != 0) goto L_0x03bd;
    L_0x03b9:
        r9 = 1;
        r3 = 1;
        if (r12 == 0) goto L_0x06e7;
    L_0x03bd:
        r15 = z;
        r16 = 81;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x03cc;
    L_0x03c9:
        r5 = 1;
        if (r12 == 0) goto L_0x06e7;
    L_0x03cc:
        r15 = z;
        r16 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x03db;
    L_0x03d8:
        r5 = 2;
        if (r12 == 0) goto L_0x06e7;
    L_0x03db:
        r15 = z;
        r16 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x03ea;
    L_0x03e7:
        r5 = 4;
        if (r12 == 0) goto L_0x06e7;
    L_0x03ea:
        r15 = r2.toUpperCase();
        r16 = z;
        r17 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r16 = r16[r17];
        r15 = r15.startsWith(r16);
        if (r15 == 0) goto L_0x0404;
    L_0x03fa:
        if (r5 >= 0) goto L_0x0404;
    L_0x03fc:
        r5 = 0;
        r4 = 2;
        r4 = r2.substring(r4);
        if (r12 == 0) goto L_0x06e7;
    L_0x0404:
        if (r5 >= 0) goto L_0x06e7;
    L_0x0406:
        r5 = 0;
        r4 = r5;
        r19 = r2;
        r2 = r3;
        r3 = r19;
    L_0x040d:
        if (r12 == 0) goto L_0x06f1;
    L_0x040f:
        r6 = r2;
        r5 = r3;
        r3 = r4;
    L_0x0412:
        if (r3 >= 0) goto L_0x0415;
    L_0x0414:
        r3 = 3;
    L_0x0415:
        r2 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        r4 = r7.c;
        r1.a(r2, r3, r4, r5, r6);
        if (r12 == 0) goto L_0x06cb;
    L_0x041e:
        r2 = z;
        r3 = 91;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0511;
    L_0x042a:
        r5 = -1;
        r2 = z;
        r3 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r4 = r2[r3];
        r3 = 0;
        r2 = 0;
        r6 = r7.d;
        r15 = r6.iterator();
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
    L_0x043d:
        r2 = r15.hasNext();
        if (r2 == 0) goto L_0x06e3;
    L_0x0443:
        r2 = r15.next();
        r2 = (java.lang.String) r2;
        if (r3 == 0) goto L_0x046d;
    L_0x044b:
        r16 = z;
        r17 = 93;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equals(r0);
        if (r16 == 0) goto L_0x045c;
    L_0x0459:
        r6 = 5;
        if (r12 == 0) goto L_0x06e3;
    L_0x045c:
        r16 = z;
        r17 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equals(r0);
        if (r16 == 0) goto L_0x06e3;
    L_0x046a:
        r6 = 4;
        if (r12 == 0) goto L_0x06e3;
    L_0x046d:
        r16 = z;
        r17 = 82;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equals(r0);
        if (r16 == 0) goto L_0x0481;
    L_0x047b:
        if (r10 != 0) goto L_0x0481;
    L_0x047d:
        r10 = 1;
        r4 = 1;
        if (r12 == 0) goto L_0x06dd;
    L_0x0481:
        r16 = z;
        r17 = 88;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x0492;
    L_0x048f:
        r6 = 1;
        if (r12 == 0) goto L_0x06dd;
    L_0x0492:
        r16 = z;
        r17 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x04a3;
    L_0x04a0:
        r6 = 3;
        if (r12 == 0) goto L_0x06dd;
    L_0x04a3:
        r16 = z;
        r17 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x04b4;
    L_0x04b1:
        r6 = 2;
        if (r12 == 0) goto L_0x06dd;
    L_0x04b4:
        r16 = z;
        r17 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x04c5;
    L_0x04c2:
        r6 = 6;
        if (r12 == 0) goto L_0x06dd;
    L_0x04c5:
        r16 = z;
        r17 = 80;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x04d6;
    L_0x04d3:
        r3 = 1;
        if (r12 == 0) goto L_0x06dd;
    L_0x04d6:
        r16 = z;
        r17 = 83;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 != 0) goto L_0x06dd;
    L_0x04e4:
        r16 = z;
        r17 = 95;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x068e;
    L_0x04f2:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
    L_0x04f6:
        if (r12 == 0) goto L_0x06d7;
    L_0x04f8:
        r6 = r3;
        r2 = r5;
        r5 = r4;
    L_0x04fb:
        if (r2 >= 0) goto L_0x04fe;
    L_0x04fd:
        r2 = 1;
    L_0x04fe:
        r3 = r7.b;
        r4 = z;
        r15 = 100;
        r4 = r4[r15];
        r3 = r3.getAsString(r4);
        r4 = r7.c;
        r1.a(r2, r3, r4, r5, r6);
        if (r12 == 0) goto L_0x06cb;
    L_0x0511:
        r2 = z;
        r3 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0526;
    L_0x051d:
        r2 = r1.m;
        r3 = r7.c;
        r2.add(r3);
        if (r12 == 0) goto L_0x06cb;
    L_0x0526:
        r2 = z;
        r3 = 87;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0537;
    L_0x0532:
        r1.b(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x0537:
        r2 = z;
        r3 = 99;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0548;
    L_0x0543:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x0548:
        r2 = z;
        r3 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0559;
    L_0x0554:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x0559:
        r2 = z;
        r3 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x056a;
    L_0x0565:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x056a:
        r2 = z;
        r3 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x057b;
    L_0x0576:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x057b:
        r2 = z;
        r3 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x058c;
    L_0x0587:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x058c:
        r2 = z;
        r3 = 78;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x059d;
    L_0x0598:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x059d:
        r2 = z;
        r3 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05ae;
    L_0x05a9:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x05ae:
        r2 = z;
        r3 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05bf;
    L_0x05ba:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x05bf:
        r2 = z;
        r3 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05d0;
    L_0x05cb:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x05d0:
        r2 = z;
        r3 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05e1;
    L_0x05dc:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x05e1:
        r2 = z;
        r3 = 94;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05f2;
    L_0x05ed:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x05f2:
        r2 = z;
        r3 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0603;
    L_0x05fe:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x0603:
        r2 = z;
        r3 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0614;
    L_0x060f:
        r1.a(r7);
        if (r12 == 0) goto L_0x06cb;
    L_0x0614:
        r2 = z;
        r3 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0628;
    L_0x0620:
        r2 = r1.j;
        r3 = r7.c;
        r2.d = r3;
        if (r12 == 0) goto L_0x06cb;
    L_0x0628:
        r2 = z;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x06b4;
    L_0x0634:
        r2 = r8;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        goto L_0x005b;
    L_0x063a:
        r15 = z;
        r16 = 92;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 != 0) goto L_0x06fc;
    L_0x0646:
        r15 = z;
        r16 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 != 0) goto L_0x06fc;
    L_0x0652:
        r15 = z;
        r16 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x0664;
    L_0x065e:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        goto L_0x0214;
    L_0x0664:
        r15 = r2.toUpperCase();
        r16 = z;
        r17 = 84;
        r16 = r16[r17];
        r15 = r15.startsWith(r16);
        if (r15 == 0) goto L_0x067e;
    L_0x0674:
        if (r5 >= 0) goto L_0x067e;
    L_0x0676:
        r5 = 0;
        r4 = 2;
        r4 = r2.substring(r4);
        if (r12 == 0) goto L_0x06fc;
    L_0x067e:
        if (r5 >= 0) goto L_0x06fc;
    L_0x0680:
        r5 = 0;
        r4 = r5;
        r5 = r6;
        r19 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0214;
    L_0x068a:
        r3 = r7.c;
        goto L_0x02c7;
    L_0x068e:
        r16 = r2.toUpperCase();
        r17 = z;
        r18 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r17 = r17[r18];
        r16 = r16.startsWith(r17);
        if (r16 == 0) goto L_0x06a8;
    L_0x069e:
        if (r6 >= 0) goto L_0x06a8;
    L_0x06a0:
        r6 = 0;
        r5 = 2;
        r5 = r2.substring(r5);
        if (r12 == 0) goto L_0x06dd;
    L_0x06a8:
        if (r6 >= 0) goto L_0x06dd;
    L_0x06aa:
        r6 = 0;
        r5 = r6;
        r19 = r4;
        r4 = r2;
        r2 = r3;
        r3 = r19;
        goto L_0x04f6;
    L_0x06b4:
        r2 = z;
        r3 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x06c8;
    L_0x06c0:
        r2 = r1.j;
        r3 = r7.c;
        r2.b = r3;
        if (r12 == 0) goto L_0x06cb;
    L_0x06c8:
        r1.a(r7);
    L_0x06cb:
        r2 = r8;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        goto L_0x005b;
    L_0x06d1:
        r8 = r2;
        r9 = r3;
        r10 = r4;
        r3 = r5;
        goto L_0x0032;
    L_0x06d7:
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        goto L_0x043d;
    L_0x06dd:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        goto L_0x04f6;
    L_0x06e3:
        r2 = r6;
        r6 = r4;
        goto L_0x04fb;
    L_0x06e7:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x040d;
    L_0x06ec:
        r6 = r3;
        r3 = r5;
        r5 = r4;
        goto L_0x0412;
    L_0x06f1:
        r5 = r4;
        r4 = r3;
        r3 = r2;
        goto L_0x039f;
    L_0x06f6:
        r3 = r2;
        goto L_0x02e1;
    L_0x06f9:
        r2 = r3;
        goto L_0x02fe;
    L_0x06fc:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        goto L_0x0214;
    L_0x0702:
        r2 = r5;
        r11 = r6;
        r6 = r3;
        r5 = r4;
        goto L_0x021a;
    L_0x0708:
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        goto L_0x01b6;
    L_0x070e:
        r4 = r2;
        goto L_0x018e;
    L_0x0711:
        r2 = r4;
        goto L_0x01a3;
    L_0x0714:
        r2 = r4;
        goto L_0x01a5;
    L_0x0717:
        r11 = r3;
        goto L_0x02cc;
    L_0x071a:
        r2 = r8;
        r4 = r10;
        r5 = r3;
        r3 = r9;
        goto L_0x005b;
    L_0x0720:
        r4 = r10;
        r5 = r3;
        r3 = r9;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a(s, int, java.lang.String):q");
    }

    public void a(Cursor cursor) {
        boolean z = true;
        boolean z2 = h;
        if (this.l == null) {
            this.l = new ArrayList();
        }
        c cVar = new c();
        cVar.c = StructuredPostal.class;
        cVar.f = cursor.getInt(cursor.getColumnIndex(z[31]));
        cVar.e = cursor.getString(cursor.getColumnIndex(z[40]));
        cVar.a = new i();
        String string = cursor.getString(cursor.getColumnIndex(z[37]));
        if (string != null) {
            cVar.a.b = string.replaceAll(z[34], " ");
        }
        cVar.a.c = cursor.getString(cursor.getColumnIndex(z[32]));
        cVar.a.e = cursor.getString(cursor.getColumnIndex(z[36]));
        cVar.a.f = cursor.getString(cursor.getColumnIndex(z[38]));
        cVar.a.d = cursor.getString(cursor.getColumnIndex(z[35]));
        cVar.b = cursor.getString(cursor.getColumnIndex(z[39]));
        if (cursor.getInt(cursor.getColumnIndex(z[33])) != 1) {
            z = false;
        }
        cVar.d = z;
        this.l.add(cVar);
        if (z2) {
            WAAppCompatActivity.c++;
        }
    }

    private String j(String str) {
        String substring;
        String stripSeparators = PhoneNumberUtils.stripSeparators(str);
        int indexOf = stripSeparators.indexOf(44);
        if (indexOf != -1) {
            substring = stripSeparators.substring(0, indexOf);
        } else {
            substring = stripSeparators;
        }
        l5 e = App.as.e(substring);
        if (e == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(l5.h(e.p));
        if (indexOf != -1) {
            stringBuilder.append(stripSeparators.substring(indexOf));
        }
        return stringBuilder.toString();
    }

    public void f(String str) {
        boolean z = h;
        Cursor query = this.d.getContentResolver().query(Data.CONTENT_URI, null, z[28], new String[]{str, z[29]}, null);
        if (query != null) {
            while (query.moveToNext()) {
                int i = query.getInt(query.getColumnIndex(z[27]));
                m mVar = new m();
                mVar.c = query.getString(query.getColumnIndex(z[30]));
                String string = this.d.getString(Im.getProtocolLabelResource(i));
                for (Entry entry : c.entrySet()) {
                    if (((String) entry.getValue()).equalsIgnoreCase(string)) {
                        mVar.a = (String) entry.getKey();
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                mVar.a(this.d.getString(Im.getTypeLabelResource(i)));
                a(mVar);
                if (z) {
                    break;
                }
            }
            query.close();
        }
    }

    public static byte[] a(Context context, String str) {
        String str2 = z[11];
        String[] strArr = new String[]{str, z[13]};
        Cursor query = context.getContentResolver().query(Data.CONTENT_URI, new String[]{z[12]}, str2, strArr, null);
        if (query == null || !query.moveToFirst()) {
            return null;
        }
        byte[] blob = query.getBlob(0);
        query.close();
        return blob;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
        r5 = this;
        r0 = h;
        r1 = r5.k;
        if (r1 != 0) goto L_0x000d;
    L_0x0006:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5.k = r1;
    L_0x000d:
        r1 = new g;
        r1.<init>();
        r1.a = r6;
        r1.b = r7;
        if (r7 == 0) goto L_0x0037;
    L_0x0018:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2 = r2.append(r7);
        r3 = z;
        r4 = 24;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r2 = com.whatsapp.l5.h(r2);
        r1.c = r2;
        if (r0 == 0) goto L_0x0041;
    L_0x0037:
        r2 = r8.trim();
        r2 = r5.j(r2);
        r1.c = r2;
    L_0x0041:
        if (r6 != 0) goto L_0x0060;
    L_0x0043:
        if (r9 == 0) goto L_0x0051;
    L_0x0045:
        r2 = z;
        r3 = 25;
        r2 = r2[r3];
        r2 = r9.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x0060;
    L_0x0051:
        r2 = com.whatsapp.App.z();
        r3 = 2131231562; // 0x7f08034a float:1.8079209E38 double:1.052968298E-314;
        r2 = r2.getString(r3);
        r1.d = r2;
        if (r0 == 0) goto L_0x0062;
    L_0x0060:
        r1.d = r9;
    L_0x0062:
        r1.e = r10;
        r0 = r5.k;
        r0.add(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a(int, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public void c(String str) {
        boolean z = h;
        String[] strArr = new String[]{z[49], z[45], z[47], z[43], z[46]};
        Cursor query = this.d.getContentResolver().query(Phone.CONTENT_URI, strArr, z[48], new String[]{str}, null);
        HashMap e = e(str);
        if (query != null) {
            while (query.moveToNext()) {
                boolean z2;
                String str2 = (String) e.get(query.getString(query.getColumnIndex(z[50])));
                int i = query.getInt(query.getColumnIndex(z[44]));
                String string = query.getString(query.getColumnIndex(z[41]));
                String string2 = query.getString(query.getColumnIndex(z[42]));
                if (query.getInt(query.getColumnIndex(z[51])) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a(i, str2, string, string2, z2);
                if (z) {
                    break;
                }
            }
            query.close();
        }
    }

    public void g(String str) {
        boolean z = h;
        Cursor query = this.d.getContentResolver().query(StructuredPostal.CONTENT_URI, null, z[26], new String[]{str}, null);
        if (query != null) {
            while (query.moveToNext()) {
                a(query);
                if (z) {
                    break;
                }
            }
            query.close();
        }
    }

    private HashMap e(String str) {
        boolean z = h;
        String[] strArr = new String[]{z[23], z[19]};
        HashMap hashMap = new HashMap();
        Uri build = RawContacts.CONTENT_URI.buildUpon().appendQueryParameter(z[20], this.d.getString(2131232306)).appendQueryParameter(z[18], z[22]).build();
        Cursor query = this.d.getContentResolver().query(build, strArr, z[17], new String[]{str}, null);
        if (query != null) {
            while (query.moveToNext()) {
                String string = query.getString(query.getColumnIndex(z[16]));
                String string2 = query.getString(query.getColumnIndex(z[21]));
                hashMap.put(string, string2.substring(0, string2.indexOf("@")));
                if (z) {
                    break;
                }
            }
            query.close();
        }
        return hashMap;
    }

    public String a() {
        boolean z = h;
        if (this.j.e != null) {
            return this.j.e;
        }
        if (this.l != null && this.l.size() > 0) {
            for (c cVar : this.l) {
                if (cVar.c != Email.class || !cVar.d) {
                    if (z) {
                        break;
                    }
                }
                return cVar.e;
            }
        }
        if (this.k != null && this.k.size() > 0) {
            for (g gVar : this.k) {
                if (!gVar.e) {
                    if (z) {
                        break;
                    }
                }
                return gVar.c;
            }
        }
        return "";
    }

    public void b(String str) {
        Cursor query = this.d.getContentResolver().query(Data.CONTENT_URI, null, z[5], new String[]{str, z[7]}, null);
        if (query != null) {
            if (query.moveToFirst()) {
                m mVar = new m();
                mVar.a = z[6];
                mVar.c = query.getString(query.getColumnIndex(z[8]));
                a(mVar);
            }
            query.close();
        }
    }

    public void b(m mVar) {
        String str = mVar.c;
        if (str != null && str.startsWith(z[14])) {
            mVar.c = "-" + str.substring(z[15].length());
        }
        a(mVar);
    }

    static {
        String[] strArr = new String[142];
        String str = "P\u001e\u000eL\tP\u0005?Q\f\u0013L@\u0007";
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
                        i4 = 51;
                        break;
                    case at.g /*1*/:
                        i4 = 113;
                        break;
                    case at.i /*2*/:
                        i4 = 96;
                        break;
                    case at.o /*3*/:
                        i4 = 56;
                        break;
                    default:
                        i4 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "W\u0010\u0014YZ";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "W\u0010\u0014Y[";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "W\u0010\u0014YY";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    str = "P\u001e\u000eL\tP\u0005?Q\f\u0013L@\u0007Hr?$\u0018\u0005Z\u001c\u0005L\u0011C\u0014@\u0005H\f";
                    i = 4;
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    strArr2 = strArr3;
                    str = "}8#s&r<%";
                    i = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "E\u001f\u0004\u0016\t]\u0015\u0012W\u0001W_\u0003M\u001a@\u001e\u0012\u0016\u0001G\u0014\r\u0017\u0006Z\u0012\u000bV\t^\u0014";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "W\u0010\u0014YY";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "p\u001e\u0015T\f\u0013\u001f\u000fLHC\u0010\u0012K\r\u0013\u0007#Y\u001aWQ\u0006Q\u0004VK@";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "f%&\u0015P";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "P\u001e\u000eL\tP\u0005?Q\f\u0013L@\u0007Hr?$\u0018\u0005Z\u001c\u0005L\u0011C\u0014@\u0005H\fQ";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "W\u0010\u0014YY\u0006";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "E\u001f\u0004\u0016\t]\u0015\u0012W\u0001W_\u0003M\u001a@\u001e\u0012\u0016\u0001G\u0014\r\u0017\u0018[\u001e\u0014W";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u0002GP\f";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0002GP\f";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "l\u0018\u0004";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "P\u001e\u000eL\tP\u0005?Q\f\u000eN";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "R\u0012\u0003W\u001d]\u0005?L\u0011C\u0014";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "l\u0018\u0004";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "R\u0012\u0003W\u001d]\u0005?V\t^\u0014";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "@\b\u000e[Y";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "P\u001e\r\u0016\u001f[\u0010\u0014K\tC\u0001";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "@\b\u000e[Y";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "s\u0002NO\u0000R\u0005\u0013Y\u0018C_\u000e]\u001c";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "]\u0004\fT";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "P\u001e\u000eL\tP\u0005?Q\f\u0013L@\u0007";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "W\u0010\u0014Y]";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "P\u001e\u000eL\tP\u0005?Q\f\u0013L@\u0007Hr?$\u0018\u0005Z\u001c\u0005L\u0011C\u0014@\u0005H\fQ";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "E\u001f\u0004\u0016\t]\u0015\u0012W\u0001W_\u0003M\u001a@\u001e\u0012\u0016\u0001G\u0014\r\u0017\u0001^";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "W\u0010\u0014YY";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "W\u0010\u0014YZ";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "W\u0010\u0014Y_";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "Z\u0002?H\u001aZ\u001c\u0001J\u0011";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\u001b|jDeO{\u001c2e\u001a";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "W\u0010\u0014YY\u0003";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "W\u0010\u0014YP";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "W\u0010\u0014Y\\";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "W\u0010\u0014YQ";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "W\u0010\u0014Y[";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "W\u0010\u0014YY";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "W\u0010\u0014YY";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "W\u0010\u0014Y[";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "Z\u0002?H\u001aZ\u001c\u0001J\u0011";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "W\u0010\u0014YZ";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "W\u0010\u0014YY";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "A\u0010\u0017g\u000b\\\u001f\u0014Y\u000bG.\t\\";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "W\u0010\u0014Y[";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "P\u001e\u000eL\tP\u0005?Q\f\u0013L_";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "W\u0010\u0014YZ";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "A\u0010\u0017g\u000b\\\u001f\u0014Y\u000bG.\t\\";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "Z\u0002?H\u001aZ\u001c\u0001J\u0011";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "P\u001e\u000eL\tP\u0005?Q\f\u0013L@\u0007Hr?$\u0018\u0005Z\u001c\u0005L\u0011C\u0014@\u0005H\fQ!v,\u0013\u0015\u0001L\t\u0001Q]\u0007H";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "E\u001f\u0004\u0016\t]\u0015\u0012W\u0001W_\u0003M\u001a@\u001e\u0012\u0016\u0001G\u0014\r\u0017\u000b\\\u001f\u0014Y\u000bG.\u0005N\r]\u0005";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "q5!a";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "W\u0010\u0014YY";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "W\u0010\u0014YZ";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "W\u0010\u0014Y^";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "W\u0010\u0014YZ";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "W\u0010\u0014Y_";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "W\u0010\u0014YQ";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "W\u0010\u0014Y[";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "E\u001f\u0004\u0016\t]\u0015\u0012W\u0001W_\u0003M\u001a@\u001e\u0012\u0016\u0001G\u0014\r\u0017\u0006R\u001c\u0005";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "W\u0010\u0014Y\\";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "W\u0010\u0014YQ";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "P\u001e\u000eL\tP\u0005?Q\f\u0013L@\u0007Hr?$\u0018\u0005Z\u001c\u0005L\u0011C\u0014]\u0007";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "W\u0010\u0014Y\\";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "W\u0010\u0014Y[";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "W\u0010\u0014Y_";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "W\u0010\u0014Y^";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "W\u0010\u0014Y]";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "W\u0010\u0014Y]";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "E\u001f\u0004\u0016\t]\u0015\u0012W\u0001W_\u0003M\u001a@\u001e\u0012\u0016\u0001G\u0014\r\u0017\u0007A\u0016\u0001V\u0001I\u0010\u0014Q\u0007]";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "Z\u0002?H\u001aZ\u001c\u0001J\u0011";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "W\u0010\u0014Y\\";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "W\u0010\u0014Y]";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "P\u001e\u000eL\tP\u0005?Q\f\u0013L@\u0007Hr?$\u0018\u0005Z\u001c\u0005L\u0011C\u0014@\u0005H\f";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "W\u0010\u0014YY";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "g+";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "u?";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "u08";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "{>-}";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = "c#%~";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "e>){-";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "k\\";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "|#'";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "e2!j,";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "q5!a";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "{>-}";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "`>5v,";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "{>-}";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = "g4,";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = "c02{-\u007f";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "{>-}";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "p04}/|#)};";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "~\"'";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = "}0-}";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = "a>,}";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = "r52";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = "f#,";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = "D\u0010)\\";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_buttonStyleSmall;
                    str = "\u007f>'w";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkboxStyle;
                    str = "c0'}:";
                    i = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkedTextViewStyle;
                    str = "~0)t-a";
                    i = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_editTextStyle;
                    str = "p>-h)}(";
                    i = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_radioButtonStyle;
                    str = "`>2lE`%2q&t";
                    i = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_ratingBarStyle;
                    str = "c9/l'";
                    i = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_seekBarStyle;
                    str = "k\\";
                    i = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_spinnerStyle;
                    str = "w>-";
                    i = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_switchStyle;
                    str = "k\\";
                    i = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i2] = str;
                    i2 = 110;
                    str = "}>4}";
                    i = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i2] = str;
                    i2 = 111;
                    str = "c#%~";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    i2 = 112;
                    str = "}\u001e\u000e\u0018>p02|HW\u0010\u0014YHZ\u0002@Q\u0006@\u0014\u0012L\rW_";
                    i = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 113;
                    str = "k\\0p'}44q+\u001e=!k<\u001e?!u-";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 114;
                    str = "x49";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 115;
                    str = "a46";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 116;
                    str = "d>2s";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 117;
                    str = "c#%~";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 118;
                    str = "]\u0010\r]G\u007f>'wGD\u0014?\\\u0007]V\u0014g\u001bF\u0001\u0010W\u001aG";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 119;
                    str = "d>2s";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 120;
                    str = "`>5j+v";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 121;
                    str = "{>-}";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    i2 = 122;
                    str = "c#/|!w";
                    i = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i2] = str;
                    i2 = 123;
                    str = "z?4t";
                    i = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i2] = str;
                    i2 = 124;
                    str = "p=!k;";
                    i = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i2] = str;
                    i2 = 125;
                    str = "}8#s&r<%";
                    i = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i2] = str;
                    i2 = 126;
                    str = "p4,t";
                    i = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i2] = str;
                    i2 = 127;
                    str = "P\u001e\u000eK\u001cA\u0004\u0003L\u000b\\\u001f\u0014Y\u000bG\u0017\u0012W\u0005E\u001f\u000f\\\r\u001c$\u000e[\tF\u0016\bLHv\t\u0003]\u0018G\u0018\u000fVGp\u001e\u000eL\tP\u00053L\u001aF\u0012\u0014\u0002";
                    i = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i2] = str;
                    i2 = 128;
                    str = "k\\0p'}44q+\u001e<)|,\u007f4Mv)~4";
                    i = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i2] = str;
                    i2 = 129;
                    str = "k\\0p'}44q+\u001e7)j;g\\.y%v";
                    i = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i2] = str;
                    i2 = 130;
                    str = "k\\)j%p\\.";
                    i = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i2] = str;
                    i2 = 131;
                    str = "e42k!|?";
                    i = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i2] = str;
                    i2 = 132;
                    str = "g84t-";
                    i = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i2] = str;
                    i2 = 133;
                    str = "t4/";
                    i = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i2] = str;
                    i2 = 134;
                    str = "f8$";
                    i = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i2] = str;
                    i2 = 135;
                    str = "d>2s";
                    i = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i2] = str;
                    i2 = 136;
                    str = "d>2s";
                    i = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i2] = str;
                    i2 = 137;
                    str = "p4,t";
                    i = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i2] = str;
                    i2 = 138;
                    str = "c#%~";
                    i = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i2] = str;
                    i2 = 139;
                    str = "v<!q$";
                    i = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i2] = str;
                    i2 = 140;
                    str = "c#/~!\u007f4";
                    i = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i2] = str;
                    i2 = 141;
                    str = "c>3l)\u007f";
                    i = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i2] = str;
                    z = strArr3;
                    b = new HashMap();
                    c = new HashMap();
                    HashMap hashMap = b;
                    str = "k\\!q%";
                    i = -1;
                    while (true) {
                        int i5;
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (i5 = 0; length2 > i5; i5++) {
                            char c2 = cArr2[i5];
                            switch (i5 % 5) {
                                case v.m /*0*/:
                                    i4 = 51;
                                    break;
                                case at.g /*1*/:
                                    i4 = 113;
                                    break;
                                case at.i /*2*/:
                                    i4 = 96;
                                    break;
                                case at.o /*3*/:
                                    i4 = 56;
                                    break;
                                default:
                                    i4 = arj.Theme_editTextStyle;
                                    break;
                            }
                            cArr2[i5] = (char) (i4 ^ c2);
                        }
                        String intern = new String(cArr2).intern();
                        switch (i) {
                            case v.m /*0*/:
                                hashMap.put(intern, Integer.valueOf(1));
                                hashMap = b;
                                str = "k\\9y |>";
                                i = 1;
                                continue;
                            case at.g /*1*/:
                                hashMap.put(intern, Integer.valueOf(2));
                                hashMap = b;
                                str = "k\\'w't=%\u0015<r=+";
                                i = 2;
                                continue;
                            case at.i /*2*/:
                                hashMap.put(intern, Integer.valueOf(5));
                                hashMap = b;
                                str = "k\\'w't=%\u0018<r=";
                                i = 3;
                                continue;
                            case at.o /*3*/:
                                hashMap.put(intern, Integer.valueOf(5));
                                hashMap = b;
                                str = "k\\){9";
                                i = 4;
                                continue;
                            case at.p /*4*/:
                                hashMap.put(intern, Integer.valueOf(6));
                                hashMap = b;
                                str = "k\\*y*q42";
                                i = 5;
                                continue;
                            case at.m /*5*/:
                                hashMap.put(intern, Integer.valueOf(7));
                                hashMap = b;
                                str = "k\\3s1c4Mm;v#.y%v";
                                i = 6;
                                continue;
                            case Y.f /*6*/:
                                hashMap.put(intern, Integer.valueOf(3));
                                hashMap = c;
                                str = "k\\!q%";
                                i = 7;
                                continue;
                            case aF.v /*7*/:
                                str = "r8-";
                                i = -1;
                                break;
                            case aF.u /*8*/:
                                str = "d\u0018\u000e\\\u0007D\u0002@t\u0001E\u0014";
                                i = 0;
                                break;
                            case Y.l /*9*/:
                                str = "j0(w'";
                                i = 1;
                                break;
                            case Y.t /*10*/:
                                str = "t\u001e\u000f_\u0004VQ4Y\u0004X";
                                i = 2;
                                break;
                            case Y.j /*11*/:
                                str = "t\u001e\u000f_\u0004VQ4Y\u0004X";
                                i = 3;
                                break;
                            case Y.p /*12*/:
                                str = "z21";
                                i = 4;
                                break;
                            case Y.q /*13*/:
                                str = "y\u0010\u0002Z\rA";
                                i = 5;
                                break;
                            case arj.Toolbar_titleMarginEnd /*14*/:
                                str = "`\u001a\u0019H\r";
                                i = 6;
                                break;
                            case arj.Toolbar_titleMarginTop /*15*/:
                                str = "}\u0018\u0003S\u0006R\u001c\u0005";
                                i = 7;
                                break;
                            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                                str = "q\u0018\u0012L\u0000W\u0010\u0019";
                                i = 8;
                                break;
                            default:
                                hashMap.put(intern, Integer.valueOf(0));
                                hashMap = b;
                                str = "k\\-k&";
                                i = 0;
                                continue;
                        }
                        toCharArray = str.toCharArray();
                        length2 = toCharArray.length;
                        cArr2 = toCharArray;
                        for (i5 = 0; length2 > i5; i5++) {
                            char c3 = cArr2[i5];
                            switch (i5 % 5) {
                                case v.m /*0*/:
                                    i4 = 51;
                                    break;
                                case at.g /*1*/:
                                    i4 = 113;
                                    break;
                                case at.i /*2*/:
                                    i4 = 96;
                                    break;
                                case at.o /*3*/:
                                    i4 = 56;
                                    break;
                                default:
                                    i4 = arj.Theme_editTextStyle;
                                    break;
                            }
                            cArr2[i5] = (char) (i4 ^ c3);
                        }
                        str = new String(cArr2).intern();
                        switch (i) {
                            case v.m /*0*/:
                                hashMap.put(intern, str);
                                hashMap = c;
                                str = "k\\9y |>";
                                i = 9;
                                break;
                            case at.g /*1*/:
                                hashMap.put(intern, str);
                                hashMap = c;
                                str = "k\\'w't=%\u0015<r=+";
                                i = 10;
                                break;
                            case at.i /*2*/:
                                hashMap.put(intern, str);
                                hashMap = c;
                                str = "k\\'w't=%\u0018<r=";
                                i = 11;
                                break;
                            case at.o /*3*/:
                                hashMap.put(intern, str);
                                hashMap = c;
                                str = "k\\){9";
                                i = 12;
                                break;
                            case at.p /*4*/:
                                hashMap.put(intern, str);
                                hashMap = c;
                                str = "k\\*y*q42";
                                i = 13;
                                break;
                            case at.m /*5*/:
                                hashMap.put(intern, str);
                                hashMap = c;
                                str = "k\\3s1c4Mm;v#.y%v";
                                i = 14;
                                break;
                            case Y.f /*6*/:
                                hashMap.put(intern, str);
                                hashMap = c;
                                str = "}8#s&r<%";
                                i = 15;
                                break;
                            case aF.v /*7*/:
                                hashMap.put(intern, str);
                                hashMap = c;
                                str = "q5!a";
                                i = 16;
                                break;
                            case aF.u /*8*/:
                                hashMap.put(intern, str);
                                return;
                            default:
                                hashMap.put(intern, str);
                                hashMap = c;
                                str = "k\\-k&";
                                i = 8;
                                break;
                        }
                    }
                default:
                    strArr2[i2] = str;
                    str = "Z\u0002?H\u001aZ\u001c\u0001J\u0011";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public q(Context context) {
        this.j = new j();
        this.m = new ArrayList();
        this.d = context;
    }

    private static void a(j jVar, List list, int i) {
        int size = list.size();
        if (size > 1) {
            jVar.h = (String) list.get(0);
            jVar.g = (String) list.get(1);
            if (size > 2 && ((String) list.get(2)).length() > 0) {
                jVar.c = (String) list.get(2);
            }
            if (size > 3 && ((String) list.get(3)).length() > 0) {
                jVar.f = (String) list.get(3);
            }
            if (size > 4 && ((String) list.get(4)).length() > 0) {
                jVar.a = (String) list.get(4);
            }
        }
    }
}
