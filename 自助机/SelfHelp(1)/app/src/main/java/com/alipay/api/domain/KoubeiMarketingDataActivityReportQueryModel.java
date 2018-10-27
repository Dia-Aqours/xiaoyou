/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataActivityReportQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4419611573317546476L;
/* 10:   */   @ApiField("biz_date")
/* 11:   */   private String bizDate;
/* 12:   */   @ApiField("camp_id")
/* 13:   */   private String campId;
/* 14:   */   
/* 15:   */   public String getBizDate()
/* 16:   */   {
/* 17:29 */     return this.bizDate;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBizDate(String bizDate)
/* 21:   */   {
/* 22:32 */     this.bizDate = bizDate;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getCampId()
/* 26:   */   {
/* 27:36 */     return this.campId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setCampId(String campId)
/* 31:   */   {
/* 32:39 */     this.campId = campId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataActivityReportQueryModel
 * JD-Core Version:    0.7.0.1
 */