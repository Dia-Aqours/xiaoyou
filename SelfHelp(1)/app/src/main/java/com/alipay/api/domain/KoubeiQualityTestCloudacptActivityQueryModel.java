/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiQualityTestCloudacptActivityQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8664284922533372371L;
/* 10:   */   @ApiField("pid")
/* 11:   */   private String pid;
/* 12:   */   @ApiField("uid")
/* 13:   */   private String uid;
/* 14:   */   
/* 15:   */   public String getPid()
/* 16:   */   {
/* 17:29 */     return this.pid;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setPid(String pid)
/* 21:   */   {
/* 22:32 */     this.pid = pid;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getUid()
/* 26:   */   {
/* 27:36 */     return this.uid;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setUid(String uid)
/* 31:   */   {
/* 32:39 */     this.uid = uid;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiQualityTestCloudacptActivityQueryModel
 * JD-Core Version:    0.7.0.1
 */