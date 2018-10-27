package com.xiyo.selfhelp.utils;

import com.xiyo.selfhelp.Constant.Constants;

public class IDcardUtil {

    // 加密算法（Des+BASE64加密方式，以下为加密算法）
    public static String encryptStr(String value){
        String result = "";
        try{
            value = new String(Base64.encode(value.
                    getBytes(java.nio.charset.StandardCharsets.UTF_8)));
            result = toHexString(encrypt(value)).toUpperCase();
        }catch(Exception ex) {
            ex.printStackTrace();
            return "";
        }
        return result;
    }
    // 转换
    public static String toHexString(byte b[]) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            String plainText = Integer.toHexString(0xff & b[i]);
            if (plainText.length() < 2)
                plainText = "0" + plainText;
            hexString.append(plainText);
        }
        return hexString.toString();
    }
    // 加密口令请咨询开发人员获取
    public static byte[] encrypt(String message) throws Exception {
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding");
        javax.crypto.spec.DESKeySpec desKeySpec =
                new javax.crypto.spec.DESKeySpec(Constants.ENCRYPTED_PASSWORD.getBytes("UTF-8"));
        javax.crypto.SecretKeyFactory keyFactory =
                javax.crypto.SecretKeyFactory.getInstance("DES");
        javax.crypto.SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
        javax.crypto.spec.IvParameterSpec iv =
                new javax.crypto.spec.IvParameterSpec(Constants.ENCRYPTED_PASSWORD.getBytes("UTF-8"));
        cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, secretKey, iv);
        return cipher.doFinal(message.getBytes("UTF-8"));
    }
}
