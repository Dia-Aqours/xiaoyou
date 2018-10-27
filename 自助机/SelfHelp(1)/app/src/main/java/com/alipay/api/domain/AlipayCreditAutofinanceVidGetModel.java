/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCreditAutofinanceVidGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2772724162488444423L;
/* 10:   */   @ApiField("orgcode")
/* 11:   */   private String orgcode;
/* 12:   */   @ApiField("uid")
/* 13:   */   private String uid;
/* 14:   */   @ApiField("version")
/* 15:   */   private String version;
/* 16:   */   
/* 17:   */   public String getOrgcode()
/* 18:   */   {
/* 19:35 */     return this.orgcode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setOrgcode(String orgcode)
/* 23:   */   {
/* 24:38 */     this.orgcode = orgcode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getUid()
/* 28:   */   {
/* 29:42 */     return this.uid;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setUid(String uid)
/* 33:   */   {
/* 34:45 */     this.uid = uid;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getVersion()
/* 38:   */   {
/* 39:49 */     return this.version;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setVersion(String version)
/* 43:   */   {
/* 44:52 */     this.version = version;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCreditAutofinanceVidGetModel
 * JD-Core Version:    0.7.0.1
 */