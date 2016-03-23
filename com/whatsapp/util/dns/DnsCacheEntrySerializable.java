package com.whatsapp.util.dns;

import com.whatsapp.util.Log;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

public final class DnsCacheEntrySerializable implements Serializable {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    public final Long expirationTime;
    public final boolean forceOverride;
    public final InetAddress inetAddress;
    public final Short portNumber;
    public final boolean secureSocket;

    static {
        String[] strArr = new String[4];
        String str = "i?2\u001f\u0017l\tPj:\u001e\t2\u001aV8/";
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
                        i3 = 76;
                        break;
                    case at.g /*1*/:
                        i3 = 76;
                        break;
                    case at.i /*2*/:
                        i3 = 8;
                        break;
                    case at.o /*3*/:
                        i3 = 58;
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
                    str = "\b\"{y\u0012/$m\u007f\u001d8>qi\u0016>%iV\u001a6-jV\u0016c<iH\u0000)\niV\u001f.-kQ:<\u001f|H\u001a\"+'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u00100";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\b\"{y\u0012/$m\u007f\u001d8>qi\u0016>%iV\u001a6-jV\u0016c<iH\u0000)\niV\u001f.-kQ:<\u001f|H\u001a\"+'";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public DnsCacheEntrySerializable(Long l, InetAddress inetAddress) {
        this(l, inetAddress, null, false, false);
    }

    public DnsCacheEntrySerializable(Long l, InetAddress inetAddress, Short sh, boolean z, boolean z2) {
        this.expirationTime = l;
        this.inetAddress = inetAddress;
        this.portNumber = sh;
        this.secureSocket = z;
        this.forceOverride = z2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (!(obj instanceof DnsCacheEntrySerializable)) {
                return false;
            }
            DnsCacheEntrySerializable dnsCacheEntrySerializable = (DnsCacheEntrySerializable) obj;
            try {
                if (this.expirationTime != dnsCacheEntrySerializable.expirationTime) {
                    if (this.expirationTime == null) {
                        return false;
                    }
                    try {
                        if (!this.expirationTime.equals(dnsCacheEntrySerializable.expirationTime)) {
                            return false;
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                try {
                    if (this.inetAddress != dnsCacheEntrySerializable.inetAddress) {
                        try {
                            if (this.inetAddress == null) {
                                return false;
                            }
                            try {
                                if (!this.inetAddress.equals(dnsCacheEntrySerializable.inetAddress)) {
                                    return false;
                                }
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        } catch (NumberFormatException e22) {
                            throw e22;
                        }
                    }
                    try {
                        if (this.portNumber != dnsCacheEntrySerializable.portNumber) {
                            try {
                                if (this.portNumber == null) {
                                    return false;
                                }
                                try {
                                    if (!this.portNumber.equals(dnsCacheEntrySerializable.portNumber)) {
                                        return false;
                                    }
                                } catch (NumberFormatException e222) {
                                    throw e222;
                                }
                            } catch (NumberFormatException e2222) {
                                throw e2222;
                            }
                        }
                        return true;
                    } catch (NumberFormatException e22222) {
                        throw e22222;
                    }
                } catch (NumberFormatException e222222) {
                    throw e222222;
                }
            } catch (NumberFormatException e2222222) {
                throw e2222222;
            } catch (NumberFormatException e22222222) {
                throw e22222222;
            }
        } catch (NumberFormatException e222222222) {
            throw e222222222;
        }
    }

    public String toString() {
        return String.format(Locale.US, z[0], new Object[]{this.inetAddress, this.portNumber, this.expirationTime});
    }

    public InetSocketAddress getInetSocketAddress() {
        try {
            if (this.inetAddress != null) {
                if (this.portNumber != null) {
                    return new InetSocketAddress(this.inetAddress, this.portNumber.shortValue());
                }
            }
            return null;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static DnsCacheEntrySerializable parseFallbackIpString(String str) {
        Throwable e;
        if (str == null) {
            return null;
        }
        String[] split = str.split(z[3], 6);
        try {
            if (split.length != 6) {
                Log.e(z[1] + str);
                return null;
            }
            try {
                InetAddress byName = InetAddress.getByName(split[0]);
                short parseShort = Short.parseShort(split[1]);
                long parseLong = Long.parseLong(split[2]);
                long parseLong2 = Long.parseLong(split[3]);
                return new DnsCacheEntrySerializable(Long.valueOf((parseLong + parseLong2) * 1000), byName, Short.valueOf(parseShort), Boolean.parseBoolean(split[4]), Boolean.parseBoolean(split[5]));
            } catch (NumberFormatException e2) {
                e = e2;
                Log.b(z[2] + str, e);
                return null;
            } catch (UnknownHostException e3) {
                e = e3;
                Log.b(z[2] + str, e);
                return null;
            }
        } catch (NumberFormatException e4) {
            throw e4;
        }
    }

    public boolean isExpired() {
        try {
            if (this.expirationTime != null) {
                if (System.currentTimeMillis() >= this.expirationTime.longValue()) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = 0;
        try {
            int hashCode;
            if (this.expirationTime != null) {
                hashCode = this.expirationTime.hashCode();
            } else {
                hashCode = 0;
            }
            int i2 = (hashCode + 41) * 41;
            try {
                if (this.inetAddress != null) {
                    hashCode = this.inetAddress.hashCode();
                } else {
                    hashCode = 0;
                }
                hashCode = (hashCode + i2) * 41;
                try {
                    if (this.portNumber != null) {
                        i = this.portNumber.hashCode();
                    }
                    return hashCode + i;
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }
}
