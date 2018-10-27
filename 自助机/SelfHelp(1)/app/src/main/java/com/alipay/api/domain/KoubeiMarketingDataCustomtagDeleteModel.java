/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataCustomtagDeleteModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4862244931339891684L;
/* 10:   */   @ApiField("tag_code")
/* 11:   */   private String tagCode;
/* 12:   */   
/* 13:   */   public String getTagCode()
/* 14:   */   {
/* 15:23 */     return this.tagCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setTagCode(String tagCode)
/* 19:   */   {
/* 20:26 */     this.tagCode = tagCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataCustomtagDeleteModel
 * JD-Core Version:    0.7.0.1
 */