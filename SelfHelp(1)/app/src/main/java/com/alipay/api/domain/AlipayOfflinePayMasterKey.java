/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflinePayMasterKey
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8192994114735252694L;
/* 10:   */   @ApiField("key_id")
/* 11:   */   private Long keyId;
/* 12:   */   @ApiField("public_key")
/* 13:   */   private String publicKey;
/* 14:   */   
/* 15:   */   public Long getKeyId()
/* 16:   */   {
/* 17:29 */     return this.keyId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setKeyId(Long keyId)
/* 21:   */   {
/* 22:32 */     this.keyId = keyId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getPublicKey()
/* 26:   */   {
/* 27:36 */     return this.publicKey;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setPublicKey(String publicKey)
/* 31:   */   {
/* 32:39 */     this.publicKey = publicKey;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflinePayMasterKey
 * JD-Core Version:    0.7.0.1
 */