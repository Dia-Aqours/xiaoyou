/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayApiException;
/*   4:    */ import com.alipay.api.internal.util.codec.Base64;
/*   5:    */ import javax.crypto.Cipher;
/*   6:    */ import javax.crypto.spec.IvParameterSpec;
/*   7:    */ import javax.crypto.spec.SecretKeySpec;

/*   8:    */
/*   9:    */ public class AlipayEncrypt
/*  10:    */ {
/*  11:    */   private static final String AES_ALG = "AES";
/*  12:    */   private static final String AES_CBC_PCK_ALG = "AES/CBC/PKCS5Padding";
/*  13: 31 */   private static final byte[] AES_IV = initIv("AES/CBC/PKCS5Padding");
/*  14:    */   
/*  15:    */   public static String encryptContent(String content, String encryptType, String encryptKey, String charset)
/*  16:    */     throws AlipayApiException
/*  17:    */   {
/*  18: 46 */     if ("AES".equals(encryptType)) {
/*  19: 48 */       return aesEncrypt(content, encryptKey, charset);
/*  20:    */     }
/*  21: 52 */     throw new AlipayApiException("当前不支持该算法类型：encrypeType=" + encryptType);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public static String decryptContent(String content, String encryptType, String encryptKey, String charset)
/*  25:    */     throws AlipayApiException
/*  26:    */   {
/*  27: 70 */     if ("AES".equals(encryptType)) {
/*  28: 72 */       return aesDecrypt(content, encryptKey, charset);
/*  29:    */     }
/*  30: 76 */     throw new AlipayApiException("当前不支持该算法类型：encrypeType=" + encryptType);
/*  31:    */   }
/*  32:    */   
/*  33:    */   private static String aesEncrypt(String content, String aesKey, String charset)
/*  34:    */     throws AlipayApiException
/*  35:    */   {
/*  36:    */     try
/*  37:    */     {
/*  38: 94 */       Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
/*  39:    */       
/*  40: 96 */       IvParameterSpec iv = new IvParameterSpec(AES_IV);
/*  41: 97 */       cipher.init(1, new SecretKeySpec(Base64.decodeBase64(aesKey.getBytes()), "AES"), iv);
/*  42:    */       
/*  43:    */ 
/*  44:100 */       byte[] encryptBytes = cipher.doFinal(content.getBytes(charset));
/*  45:101 */       return new String(Base64.encodeBase64(encryptBytes));
/*  46:    */     }
/*  47:    */     catch (Exception e)
/*  48:    */     {
/*  49:103 */       throw new AlipayApiException("AES加密失败：Aescontent = " + content + "; charset = " + charset, e);
/*  50:    */     }
/*  51:    */   }
/*  52:    */   
/*  53:    */   private static String aesDecrypt(String content, String key, String charset)
/*  54:    */     throws AlipayApiException
/*  55:    */   {
/*  56:    */     try
/*  57:    */     {
/*  58:121 */       Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
/*  59:122 */       IvParameterSpec iv = new IvParameterSpec(initIv("AES/CBC/PKCS5Padding"));
/*  60:123 */       cipher.init(2, new SecretKeySpec(Base64.decodeBase64(key.getBytes()), "AES"), iv);
/*  61:    */       
/*  62:    */ 
/*  63:126 */       byte[] cleanBytes = cipher.doFinal(Base64.decodeBase64(content.getBytes()));
/*  64:127 */       return new String(cleanBytes, charset);
/*  65:    */     }
/*  66:    */     catch (Exception e)
/*  67:    */     {
/*  68:129 */       throw new AlipayApiException("AES解密失败：Aescontent = " + content + "; charset = " + charset, e);
/*  69:    */     }
/*  70:    */   }
/*  71:    */   
/*  72:    */   private static byte[] initIv(String fullAlg)
/*  73:    */   {
/*  74:    */     try
/*  75:    */     {
/*  76:144 */       Cipher cipher = Cipher.getInstance(fullAlg);
/*  77:145 */       int blockSize = cipher.getBlockSize();
/*  78:146 */       byte[] iv = new byte[blockSize];
/*  79:147 */       for (int i = 0; i < blockSize; i++) {
/*  80:148 */         iv[i] = 0;
/*  81:    */       }
/*  82:150 */       return iv;
/*  83:    */     }
/*  84:    */     catch (Exception e)
/*  85:    */     {
/*  86:153 */       int blockSize = 16;
/*  87:154 */       byte[] iv = new byte[blockSize];
/*  88:155 */       for (int i = 0; i < blockSize; i++) {
/*  89:156 */         iv[i] = 0;
/*  90:    */       }
/*  91:158 */       return iv;
/*  92:    */     }
/*  93:    */   }
/*  94:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.internal.util.AlipayEncrypt

 * JD-Core Version:    0.7.0.1

 */