package com.xiyo.selfhelp.utils;

import android.util.Base64;

import com.xiyo.selfhelp.Constant.Constants;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class AESUtil {

    /**
     * AES加密
     *
     * @param str
     *            待加密字符串
     * @return 加密后字符串
     */
    public static String aesEncrypt(String str) {
        try {
            String password = Constants.AesSeed;
            SecretKeySpec skeySpec = new SecretKeySpec(password.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            String strTmp = Base64.encodeToString(cipher.doFinal(str.getBytes()), Base64.DEFAULT);
            return strTmp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
    /**
     * AES解密
     *
     * @param str
     *            待解密字符串
     * @return 机密后字符串
     */
    public static String aesDecrypt(String str) {
        try {
            String password = Constants.AesSeed;
            SecretKeySpec skeySpec = new SecretKeySpec(password.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            String strTmp = new String(cipher.doFinal(Base64.decode(str, Base64.DEFAULT)));
            return strTmp;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
