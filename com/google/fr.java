package com.google;

import java.util.List;
import java.util.Map;

public final class fr implements cO {
    public f6 a(b1 b1Var, Map map) {
        by a;
        fI[] b;
        am a2;
        aN aNVar;
        aN e;
        am amVar;
        fI[] fIVarArr;
        aG e2;
        dB dBVar;
        int length;
        int i;
        boolean z;
        f6 f6Var;
        List g;
        String e3;
        aG aGVar;
        aG aGVar2 = null;
        boolean z2 = by.c;
        gl glVar = new gl(b1Var.d());
        try {
            a = glVar.a(false);
            b = a.b();
            try {
                a2 = new gV().a(a);
                aNVar = null;
            } catch (aN e4) {
                e = e4;
                aNVar = e;
                a2 = null;
                if (a2 == null) {
                    amVar = a2;
                    fIVarArr = b;
                } else {
                    try {
                        a = glVar.a(true);
                        amVar = new gV().a(a);
                        fIVarArr = a.b();
                    } catch (aN e5) {
                        e2 = e5;
                        if (aNVar != null) {
                            try {
                                throw aNVar;
                            } catch (aN e6) {
                                throw e6;
                            }
                        } else if (aGVar2 == null) {
                            try {
                                throw aGVar2;
                            } catch (aN e62) {
                                throw e62;
                            }
                        } else {
                            throw e2;
                        }
                    } catch (aG e7) {
                        e2 = e7;
                        if (aNVar != null) {
                            throw aNVar;
                        } else if (aGVar2 == null) {
                            throw e2;
                        } else {
                            throw aGVar2;
                        }
                    }
                }
                if (map != null) {
                    dBVar = (dB) map.get(b3.NEED_RESULT_POINT_CALLBACK);
                    if (dBVar != null) {
                        length = fIVarArr.length;
                        i = 0;
                        while (i < length) {
                            dBVar.a(fIVarArr[i]);
                            i++;
                            if (z2) {
                                try {
                                    if (aK.a) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    aK.a = z;
                                } catch (aN e622) {
                                    throw e622;
                                }
                            }
                        }
                    }
                }
                f6Var = new f6(amVar.f(), amVar.b(), fIVarArr, gg.AZTEC);
                g = amVar.g();
                if (g != null) {
                    try {
                        f6Var.a(eD.BYTE_SEGMENTS, g);
                    } catch (aN e6222) {
                        throw e6222;
                    }
                }
                e3 = amVar.e();
                if (e3 != null) {
                    try {
                        f6Var.a(eD.ERROR_CORRECTION_LEVEL, e3);
                    } catch (aN e62222) {
                        throw e62222;
                    }
                }
                return f6Var;
            } catch (aG e8) {
                e2 = e8;
                aNVar = null;
                aGVar = e2;
                a2 = null;
                aGVar2 = aGVar;
                if (a2 == null) {
                    a = glVar.a(true);
                    amVar = new gV().a(a);
                    fIVarArr = a.b();
                } else {
                    amVar = a2;
                    fIVarArr = b;
                }
                if (map != null) {
                    dBVar = (dB) map.get(b3.NEED_RESULT_POINT_CALLBACK);
                    if (dBVar != null) {
                        length = fIVarArr.length;
                        i = 0;
                        while (i < length) {
                            dBVar.a(fIVarArr[i]);
                            i++;
                            if (z2) {
                                if (aK.a) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                aK.a = z;
                            }
                        }
                    }
                }
                f6Var = new f6(amVar.f(), amVar.b(), fIVarArr, gg.AZTEC);
                g = amVar.g();
                if (g != null) {
                    f6Var.a(eD.BYTE_SEGMENTS, g);
                }
                e3 = amVar.e();
                if (e3 != null) {
                    f6Var.a(eD.ERROR_CORRECTION_LEVEL, e3);
                }
                return f6Var;
            }
        } catch (aN e9) {
            e62222 = e9;
            b = null;
            aNVar = e62222;
            a2 = null;
            if (a2 == null) {
                amVar = a2;
                fIVarArr = b;
            } else {
                a = glVar.a(true);
                amVar = new gV().a(a);
                fIVarArr = a.b();
            }
            if (map != null) {
                dBVar = (dB) map.get(b3.NEED_RESULT_POINT_CALLBACK);
                if (dBVar != null) {
                    length = fIVarArr.length;
                    i = 0;
                    while (i < length) {
                        dBVar.a(fIVarArr[i]);
                        i++;
                        if (z2) {
                            if (aK.a) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aK.a = z;
                        }
                    }
                }
            }
            f6Var = new f6(amVar.f(), amVar.b(), fIVarArr, gg.AZTEC);
            g = amVar.g();
            if (g != null) {
                f6Var.a(eD.BYTE_SEGMENTS, g);
            }
            e3 = amVar.e();
            if (e3 != null) {
                f6Var.a(eD.ERROR_CORRECTION_LEVEL, e3);
            }
            return f6Var;
        } catch (aG e10) {
            e2 = e10;
            b = null;
            aNVar = null;
            aGVar = e2;
            a2 = null;
            aGVar2 = aGVar;
            if (a2 == null) {
                a = glVar.a(true);
                amVar = new gV().a(a);
                fIVarArr = a.b();
            } else {
                amVar = a2;
                fIVarArr = b;
            }
            if (map != null) {
                dBVar = (dB) map.get(b3.NEED_RESULT_POINT_CALLBACK);
                if (dBVar != null) {
                    length = fIVarArr.length;
                    i = 0;
                    while (i < length) {
                        dBVar.a(fIVarArr[i]);
                        i++;
                        if (z2) {
                            if (aK.a) {
                                z = false;
                            } else {
                                z = true;
                            }
                            aK.a = z;
                        }
                    }
                }
            }
            f6Var = new f6(amVar.f(), amVar.b(), fIVarArr, gg.AZTEC);
            g = amVar.g();
            if (g != null) {
                f6Var.a(eD.BYTE_SEGMENTS, g);
            }
            e3 = amVar.e();
            if (e3 != null) {
                f6Var.a(eD.ERROR_CORRECTION_LEVEL, e3);
            }
            return f6Var;
        }
        if (a2 == null) {
            a = glVar.a(true);
            amVar = new gV().a(a);
            fIVarArr = a.b();
        } else {
            amVar = a2;
            fIVarArr = b;
        }
        if (map != null) {
            dBVar = (dB) map.get(b3.NEED_RESULT_POINT_CALLBACK);
            if (dBVar != null) {
                length = fIVarArr.length;
                i = 0;
                while (i < length) {
                    dBVar.a(fIVarArr[i]);
                    i++;
                    if (z2) {
                        if (aK.a) {
                            z = false;
                        } else {
                            z = true;
                        }
                        aK.a = z;
                    }
                }
            }
        }
        f6Var = new f6(amVar.f(), amVar.b(), fIVarArr, gg.AZTEC);
        g = amVar.g();
        if (g != null) {
            f6Var.a(eD.BYTE_SEGMENTS, g);
        }
        e3 = amVar.e();
        if (e3 != null) {
            f6Var.a(eD.ERROR_CORRECTION_LEVEL, e3);
        }
        return f6Var;
    }

    public void a() {
    }
}
