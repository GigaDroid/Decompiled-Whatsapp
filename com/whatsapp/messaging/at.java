package com.whatsapp.messaging;

import android.support.annotation.Nullable;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.v;

public final class at extends a3 {
    private static final X509Certificate[] c;
    private static at e;
    private static final TrustManager[] f;
    private static final String[] z;
    @Nullable
    private final AtomicReference d;

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return super.createSocket(str, i, inetAddress, i2);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return super.createSocket(inetAddress, i, inetAddress2, i2);
    }

    protected SSLSocketFactory a(SSLContext sSLContext) {
        try {
            sSLContext.init(null, f, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            return this.d == null ? socketFactory : new bz(this, socketFactory);
        } catch (Throwable e) {
            Log.a(e);
            throw new RuntimeException(e);
        }
    }

    public String[] getSupportedCipherSuites() {
        return super.getSupportedCipherSuites();
    }

    public Socket createSocket() {
        return super.createSocket();
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return super.createSocket(inetAddress, i);
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return super.createSocket(socket, str, i, z);
    }

    public Socket createSocket(String str, int i) {
        return super.createSocket(str, i);
    }

    static AtomicReference a(at atVar) {
        return atVar.d;
    }

    public at(@Nullable AtomicReference atomicReference) {
        this.d = atomicReference;
    }

    static X509Certificate[] a() {
        return c;
    }

    public String[] getDefaultCipherSuites() {
        return super.getDefaultCipherSuites();
    }

    public static at b() {
        return e;
    }

    static {
        String[] strArr = new String[2];
        String str = "B&$!\"-NNEAOHL^[&M@ON;N$!\"B&\u0003AF&H<vL,JeML.ZL{K>RCG`5Bazl!JXII-ZH{h\rxqFK.bKkA9IHo[(:Sdm(gMVW%;\u0003EI5ckKc\u0004RQ^\u007f\r9=k[\u0002]9h=VrhvJ7FKYH.:\\IL\u0007FFZb)xhYA\u0003hg]|&NeyV\u0016?qB[.q\u0003Nh!]KM|;GOVg\rLeHU7A9EJ!xPTA\u0015BMEh:L0\u007fn8E<EI5ckKc\u0004RQ^\u007f\r9=k^7]9mHVr\u0003mW=>D_J\u0018C~UK9ZXHJ\u0017cfhG=|Fe7\u0019o:h<#eSdm(gcVW%;EaA\u0019iZ4w&OHiM\b`xdd\u0006L\u00035x_IJ]J8N^`z5f0Mk\u0002MzmX!gjb^\u001aR;5{\"I=TK;`<AK6rGfN\u0018F]g>!MfTK;N<AK6r\u0003Be.|DXd^EOcx\biztE+J`Nh!]KMl;L8Vg\rLeHU7A9EI5ckKc\u0004RQ^\u007f\r9=k[\u0002]9h=Vr\u0003mu*SDNZ(J8YJ,cDCY\u0002MzmZ!gjb^\u001cBL`z6r=tA;JsNh!]KM|;GOVg\rLeHU7A9EJ!x\u0003UW!q@HF\b^N5|\u000e\\G9F)QanH\u0003`PT]\u001fi;8h>S_<n(2pmW=>D_J\u0018C~UK9ZXHJ\u0017cfhG=|\u0003CfW}m?k\\GgVg\rLefU7A9@b!}k_7\u0017BMMj-lb}g\u0004bN5x_IJ]J8N^`z5f0Mk\u0002MzmX!g\u0003oa>~P>6\u001bF@Ki\"J9KL<zN_F\r8M]J-JXYN.?NBN+HKe^$In]K DgDDZj\u007fEX5A_=9\u0019R\u0003hNX>>xa]]\\hU5^jCM9Sj::\b9YJw;SmAx\u0015qc\u007fy:LC;\\9HJ_]\u001dHe:u\tE8_C:qd=A52\u0003[c\u0002{Sh]%Np<d;Yq]mXSKdY><&bG\u0004;8tLDRMkd=dB[u\u00049S#B@]Q{m?<[jU'F988>X\u0003z;\u000b`\"B`<$soa\u0018iGHzD2>nfZ{0{F+JXMM\"J9KL<zN_F\r8M]J-IXYN.?NNN+\u007f&YHV}\u0003YE<QZ[F[DK5CD@QE_\u001enJki6yq'e)q|k9*BE@H.HFXm]d^D$\u0007nXO>\u001a dB}_CSHu;~\u0003EV*QfHE%@YXJ\u0005gkZZ\u0005[0YA9 d[x+>D`B@F}\u007f~]js_f(F<nZ\"Fc8^\u001cxq\u007f`\u000brhaJ\u0018H\u0003[ ?D|V9\u0003hn9D\u001bq14:\u0007Qf'CX\u007fmIvW\\0Zf';Yh\u0005B&$!\"*EM,L*Y]EI&HHXJB&$!\"e&$!\"BILKF!+JI];BOEL._L!\"B&$\u0006B&BM~u,HH|j\bJ~EM.l@]L+}nZ\u007f-H[~H\u0007o^~E8QAD\\\u0005JGNh\u0004zagf(2~<M.Z\\JN+Ia\u0006B>x~O^6O_]^(N~FY:qLZB-FNM>:NJdB\"YN`a\u000e^G`l\u0001Zn_XZaD^d\u0018M~UK9ZX@J\u0017I:\u0006k\\h|VH\u0003eh[A\u0003hg]z690xB<J~Dh6O_]^+NqhJ\u000e\\m|^]]phL-CkK6\u0006R^{h:f0zk,IM\u0006^;JlJx_|GfJ\u0017F]Mx\"OH{B+IhJx_qDXJ\u0017F]Mx\"OH{B+IhAH*sJvN%InBY-JPXN\u0003]]\u0006B=^~Ix6O_]^$N~tJ\u000e\\m|^]]phL-AkaB\u0017L]MW-lGZM.x]IG\u000b8mu:\u0004j^h\u007f69_uk,>c\u0006m];qEK.nKkA9IHA[);[|U]gMVW%;@Ik\u001ci;Fg\rHK_m]29EJ!IDEF-BcMA-lb}g\u0004bN\u00066\u0018;KM^*MHM@,JX4N\"B@NL\b@JM^*J=fy\u0007NQ@j\u001e@]X`^nxYD$[J?j>rhGcXcECc\u0003xK\u0006L<ODMU e]fL\\^&hK\u0017LbMYZ8`f\\#oa{U.J@IE\u0015x=nhX$ov[\u001bs[yC8QzoI\u001c8PbI\u00002>\u0006a\u0007=_jjY8ZGB&9}my\nl~9M\u0002]&_c_m\u007fNi[z>;z$Em<i\\{=aY\u0002MhK:\fBsFC\u0019;>M9){}\u0006;\\H&hw,$&MG]cma`=IKUB\u001eg8KA7Yf~:'?`h~VAfv$*`@UF\u0019^Q;^YcE'g\u001e`yAi;<Y\u0006[^2zhcYlZvj=e}{fZf:CI-zFm|\u0019 snB:QKjG8rdiB\u001d$p;y\u001d_J<C:z>hM\"\u007ffA> $=\u0006h\u000b\\>fY\b$}^y\u0000XZef\fEftM!8:\u007fg\rr]M\u007f I?f{<a8i{7 cgB }C{F+JXMM\u00009D{V;JF\u0006M\bE_D^WIHj7*IHAL.RP{K\u0018RMZ]__H]G@IHYx.|LN \u0015JmNh!]A];*Mn]Z.2<]A9i[\u0006[#\u007fd4D?bNty+g>E6_]\\{G\u0018RMZ]_aKNh\u0018MfMZ.2<]A9i[XC\u001bf1G_\u0006LqzK\u0003<@5?9^~\u0006K>RCG`5Bazl!JXII-ZHHh\bNKMB\u001ahG:\u007f&NqEDD\u007f8Ia*2Z\u007f_;m{k[^nQgF\u0000rXU *x{\u0006g\"J}yk7C&z[-C8fC\u001aL;oj\u0001_gaL\u0002yLnW\u0005hBOg\u0015^pEb5DDgW+bx{7\f}yC\u007f@9YZ:.on\u0006?YD&bY\u001cA1hX ?8\\?\u0005fY:_YmkxH\rmPam8;^9M\u0005m@x{\n{:_\u007fDo^CF\u001d\\jNN& 9xD&AO\u0006_\u0001g\\gf\u000eR=EM&zMjyWES9V-il~@\bDs[9\u001cYKo;#;gm;:^\"G}\u00049\\47Y^Hn<#~cIY_gz\u0006V<NP=^<\u007flHx\u001cDfN}\u001f |zI=_y>F\u0001I|Xg\u001c?yJ|\u0006}0gz7heZu+JNu\\\u0005?mv\u007f\\;m4{\rZb\u0006L.^~;L]2J;6)}8O:\u001emY~b.NZ~l\u0006Bq|h_S=<D?Fk|>5\\_nk[6\u0003!\"B&$IA++JI];BOEL._L!\"B&$\u0006\"B&$!M*L@B/,N[XF)BJM[*&$!\"B\u0001DEF*JMOL.~`kN\u0018BKMh&IHHN!Ing~\u0007``K6\u0018;KM^:MHHM\u0005FX\u007fx,ZPHY>ZNIx%]\\vJ\u0007\u0001DN7(J8YJ,cDUY(ceEJ\u000b}@I]\u0007QN^:&Nmum\\]~@L-AkaB\u001aF]Ix#|PHY>ZEIv\u0007CkuM*\u0001P[]\u0004nZNK\rLOvl\u0016JpEJ!gjb]\u001fQd`e6S[|m]?n]W9;hK6\u0016jQ^:\"I=TK;J9AK6rFXJ\\\u0001DHV\u0016FOcW+_D<B+RpC[*8DHV\u0016FOcx6qL@B.`NM>:NKdB,]_Aw&_HjM\bE_NN\u0000_NJ]\u0000\u0001S_M'ipNJ6\\[gj<IAobV:jOx\bX^9e#aLtB,3NM>:NJtB\u0000Y;4h=LOgU'`n]=\u0017cj?B\b\u0001DeM+QQF?\u000e\\S|V]M9mXV~@II^oNdy\ffe<j;HJM\\.|M]V%@fVF\u0007}jBN>NKN^.OnkJ!\u0001HHL,JXkL\blLNN!=m=$\u001fSNIb\u0007\\\"zW7;`K9\u001d<m#$;}Stu_Q^eu98NkW\u0001n>;U\u001bA?TL.\u0001YZV6R~dy]}EA?+2&Mc>b_NK6xfDZ\u0018C\\5\\\\$Ah7\" lG|\u000eJ>Yh\u000er0}DXCOeGXN|t9\u0018\u0001~hg)A;'~!:c?g\u0016iQ>L\\9x^j\\C:E=;zPT_]\\Pg{\u001czk`=\u0006$ffh,2<#:6;_8j\u0019GFxW\u0006\u0001L}F;Gme@\u001d:1__\u000eJ@N^\u00069QGY\u0003DH^I\u0002Y?fV(I9tZ(gjaF\rRzYi\r:1m^\u001d?JYX8d{eB6\u0001hzw[J?`A\t?MH$\u001e\u007fh#D)JyA`5M\u007f:v\u0016D0il\u00188|h8]j0bb6}EIG5=@ZK\u000b9n[B5Nl{`D\u0001Peg\t~bIG::c\\J7?=hB7?&;Y\u001f`@'J\u000bDxTHY3JM^ anoN\u0018lk<x'ZPHY=;FNM6NOBC*\u0001zBD=:L{]\fiGdv\u00159a#{]dhx[\u0005F@KA-lGZG<FLkV:|nUD.MG@J\u001cEB^>*|[om!cpv=\u0007\u0001&x=\u0000j}Xe\u0000\\lgU;IcA^\u001c|J]V+]X]H*|CZZ\u0015NaAMWLH=Z*HaAV9La`F*o\u007fEJ=cSK]Z\u0001@Ik\u0016i:Zx#HKFm\u0002F|A[*|E{V+]X]C*raDm\u0016ILUX=`l_M+iNJu\frHuF*Eeoa={Sac\u0005\u0001PT]\u001fi;8h>S_<n(2pmW=>nkJ.FH{H.:\\hJ\u0018ZOAN\"IHj7\u0018OXUE$dSEg\u0019hGM^*MK]N+\u0001nkJ-JMFCW<EG_\u001fC1I|\u000ecK8v o?Mu-c[od-?P5x\u0006fY]`5 PiN*\\<|:%RQA_W;b[A\u0016\u0001FC8\"CHKe'QXc\u007f+C;i|=^8#m\u0003F_kK\u0000xsCV\u001b~\\^W :\u007f<W%AETY\blBxF\\gyfm\u00069]o8?\u0001]A`\u0015B\"kl\u0006@xhf_M|J|\u0004l<Ub\nq]zn\f[m'b<RnJI>gx>:\u0015clmm&Q9Gm&BF}_\u0005HM\\`>\u0001Aav8<=oA\u0017J0dfY8|kv\u001a]\"E9<cAE:YrM}hD9MvU\u000b~J@u\u001d_`m=\fr\u007fg?@QD#f5s=aJ=\u0001mI}@]q}G+8_EC\u001c2[m]\nlHdE\u0007gmT]>G@][ <L~M-Oy}X\nH}[Y6{fBu[bJt[&F<Oz\t\u0001[iV!epel\u001cib}X\u0003n}BxD}AT \r}S42e&$!\"BNGH/,N[XF)BJM[*&$!\"B\u0001$!\"B&KIH&E)OJ=_@JF,J]I\"B&$!\u0005\"B@Hk\u0015HJMcDlH{F-JnEJ.lHMz;JGNh\u0004zagf(2~<M.Z\\JN+IhA^\u001c|J]V+]X]H*|CF\u0005=_L_B-JNM>:NJdB%ZdJ|\u000bLexm\\AeA]\"|L]V+]X]C*|yHj8Aeoc=rmTA_FZEx&JPH\u00059ZXHJ\u0017gJUX\u0017;h[>\u0019hdYh>8eeU7A\\oa9qmOM<i;5?\"I=TK;J~AK:sDfJ[EMUx\"MfT\u0005+_@=B+^qAe&qGXd\u0018FOcx8aL@B.`NM>:NKdB,X\\Yw*aH]M\bE_NN\u0000_JYE\u0007iA^\u007f\r\\0u\u00055_LXB-NNM>:NJtB$Z:`f5SCYl\u0001]shK*bDON(J8YJ.sDV^\u0002MzhH\u0003\u007fk?E\u0003BLB:6f_u\u00059CC=l\\ZnYbV}mHL,JZEx+ZPFD\u0000Q@dy\fEH]J-IXMK\blL\\N+HJM^\u0000HnkJ-JBAJ\u001arB~\u0005\u0002O8T9,Qpa}9>8Oa\u0006?leY\bGN{;^~FGv\u0002jSB$\u0007Sl>x,Z_x=\u0016l|vb$bPz9_bGc\\Yqc~\u0005&Q:M^<xKYa\u001aBm5B\fa1i9\u001aR`=n\bego$\bYXGi=qD|f\u0005X:`e\u0018~dYA$d\\AB\u0000=\u007f[}%RlG\u0005\u0002{Po~8n=\\x\u0015]0#c<Np#L(2_{l?HY{M#@K\u007fz\u000e?mbD\"8y?>\u0019azyi)d[IE&N0@N\u0018zZy\u00057fM'{\u001eRO#C;oK=d,:OgV\u0002LY=\u007f8[ngN\u00172QnF(n\u007fCIY~\u007fYNY>ldKZm&tW\u001bjkv: _Su\u0005\u000bh0?Z\u00048suU.x|X<\u0003rZB[?s1gb,MjN:\u0004{\u007foVY<Fhz\u0007ay~c\\YcA8^dNHG\u0018n@==\u0019$pi\u0005\u0005g9}g\u001eoGgA\u0018eNfd,J~IN.jGJB*F~D^6O_^? IKUJ)D^hX;HJ^>\u0005F{\\`&]MmH\nqx=\u0005-N:{B-BNM>:oL{J-$~]F\"JPNN\t3JM^\"|MkV+][<_.ZA#M.ZMMh*LDM?(HZ}H<Bk?\u0005+ZLNM>^HM;&IH]L)OO>@ZL0^n*BOcA]<]ul\u0003cHC6V9]5C\u000bh~89>ZO'y\u000e@Za=\n_0>\u0005VcbXFXlXOy\u0003RyB]\u0007hE<J6\\f_f\u0007m_O}\\M\u007fHMW:|gB%R;K^*$zvD! FAV\\N\\#{\\\\nt\u0005\u0005`s_|\u0018M9;}Z:Qkk&Lg5x@sSog\"I<dm\bM&T$DQ[Ke+3HO{?cZBu\u0004N8md\u0017nae \u0000H{<\u0005*{g?`_\\J8u\u0017n0V=\n\u007fjej\tH>E\u007f%>FOM=Gkj>\u0018i^\u007fn6<8g:\u0007 :vy+rgu9XL>jv:Bav\u0005\u0004xEe;\u0017jGae&Hx8;68lg^*n<'A\u000e~X~u[|eD}>Fs>a5Z&= &=lU|VC[Ox-Sk\u007fk\u001b_E_\u0005=2@8C\u001bO\"kk\u0018rhd9^<cvY@DlNG=eMFJ#zPvb\u001f\u0001$!\"B&LBKOHL^[&M@ON;N$!\"B&\u0003!\"B&$NJ(BG,L*Y]EI&HHXJB&$!\"eF@EK\u0017_JON\u001e9nMx&IHkF>Jxtl%ff@^%~YO<\u0001r{gV\u0003osMA-lb}g\u0004bN5x_IH]Z)JMN|eFX\u007fx,ZPHY>ZNIx%]\\vJ9FKAH.:\\IL\u0007FD^H\u0003ehYA\u0003hg]h<\\<fB=`~Jx6O_]^#NqN<eo:oz5Lebn8Eeoa>~P>6\u001bFZ\u007fx$ZPHY>ZMIv%Nh[k\u001fZ;Zv\u000bHKEn8ofEJ)qj?Y\u0016R^9eeQZNI9bK_m]29EJ!IDN;7O]M=\"_LtB+J~AK.|DJ`7O]Aw\"_LtB+J~AK.|DJ`\u0018iMICeFHgH.:\\IM\u0007FJZY\"sOXN;InBY-JfXK*YyV=\u0003OSTE_BL`z6qLVB-hNM>:NJtB>o:h<eGd^\u007f59efU7A9@b!}kXJ\u001dFJgH.:\\IN\u0017F`^H\u0003ehYA\u0003hg]h<Lebn,IKo<!:jaI\u001aR;YheY_Uh:f0zk,IM][,HH_F\u0018OXUE$dSEg\u0019hGM^*IK]N+lnI_.OJON>dJkh*IHAm\">Q\\be 0_8ZX9xB\u001eio9V*$po?\u0003XkVw$xYZc+Ygch\u0000hzJ6\u001f{bOw\u0017GlueVHP|D\u0003I^X};8CXXe[Gx? @[Gu*;eky\u000b@yZB<DF;u<\\8td7>cx~\u001afQ4@\u0004cYd_6gN'$\"Sz>u\u0006X={m\u0003HCIBesJdM9m\u007f@X\u0000`_ja'dGn6!hng6\u0019af8Z)\u007f:A]\u001aEz4l\u0004YS}a\u001dL9MI)dLx8\u0000_?=J$fLJMeBb9c6RlN^9HdiY\u0016A:dc$]0YzZg9oZ\u0016s\"aB_jKdn\u0004jA\\^!JXXW$Mq<>\u001f3_h{\nQFI<ecsNX-D\\^{,fHIy)>FUf\u0006JaJ7%9h?f#o=4|\u0000@xHf\u001dHdXL\u00199Shc6_Kc\\:na=?\u000e^H\u007fheNztM\u001a9=@Z;b=_7\u001cHH{J.JhBe\"LL{K\bRMZ]_[H]G@IH]K.lNKB.3NM>:oL{J-$~]IeFHAM.m1{G>RMZ]_DKNV*MEI$\u00189bH$#2AMk<RCd`&J|5e5H\u007fHB-3NM>:o@{^6FKmNeMEI$\u00189bH$#2AMk<RCd`&J|5e5H\u007fHB.;NO\\\u001eLZEm\\OXIM-Z\\MN[BKM^.hNkn78GileesuF5lPEY\u0016CkEZ\t?Baj\u001e}qkv\u000b`H]YWLB4<\u001dQL[X Eo}j@N^=a\u001bgDAZ\u001a?big+G@:uenD;m[:G9l\u000bieEU>I;`X'f`^dVdyau!=jB7]dG@I\u001ffp\\F\u0001eneD\\IM8>9CD[J5<8fIecZ5@\"[hkB=Rcu@\tbS^V\u0015r>4n(=H5$\"{leu(GPMf%GX{H7MB?w?`BaA*]Q97<}g{=eRse6=@[#:,R{O|<Sh]<\u001faF@N*Ml8v'RZgY7rZKa6}JcL8|0I>,Jq> <=jOU\u000b`NOje}L\u007fW,X\"<v\u0017>MmB\u0004CC4G<SYj~&iecJ\u001f|1bCDn&EM\ff;\\AXNl}E<ogcK\tqHEEV]Gi\u007fe Fgz*=G?9-2B\u0006\"B&$!J!O)OJ=_@JF,J]I\"B&$!\u0005";
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
                        i4 = 111;
                        break;
                    case org.whispersystems.at.g /*1*/:
                        i4 = 11;
                        break;
                    case org.whispersystems.at.i /*2*/:
                        i4 = 9;
                        break;
                    case org.whispersystems.at.o /*3*/:
                        i4 = 12;
                        break;
                    default:
                        i4 = 15;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    try {
                        char[] toCharArray2 = "7%<<6".toCharArray();
                        i2 = toCharArray2.length;
                        toCharArray = toCharArray2;
                        for (int i5 = 0; i2 > i5; i5++) {
                            char c2 = toCharArray[i5];
                            switch (i5 % 5) {
                                case v.m /*0*/:
                                    i = 111;
                                    break;
                                case org.whispersystems.at.g /*1*/:
                                    i = 11;
                                    break;
                                case org.whispersystems.at.i /*2*/:
                                    i = 9;
                                    break;
                                case org.whispersystems.at.o /*3*/:
                                    i = 12;
                                    break;
                                default:
                                    i = 15;
                                    break;
                            }
                            toCharArray[i5] = (char) (i ^ c2);
                        }
                        try {
                            Collection generateCertificates = CertificateFactory.getInstance(new String(toCharArray).intern()).generateCertificates(new ByteArrayInputStream(z[0].getBytes(z[1])));
                            c = (X509Certificate[]) generateCertificates.toArray(new X509Certificate[generateCertificates.size()]);
                            f = new TrustManager[]{new bg()};
                            e = new at(null);
                            return;
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        } catch (Throwable e2) {
                            throw new Error(e2);
                        }
                    } catch (Throwable e22) {
                        throw new RuntimeException(e22);
                    }
                default:
                    strArr2[i2] = str;
                    str = ":_O!7";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }
}
