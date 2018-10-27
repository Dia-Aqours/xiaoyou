/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataMemberReportQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3759784637112734544L;
/* 10:   */   @ApiField("biz_date")
/* 11:   */   private String bizDate;
/* 12:   */   
/* 13:   */   public String getBizDate()
/* 14:   */   {
/* 15:23 */     return this.bizDate;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setBizDate(String bizDate)
/* 19:   */   {
/* 20:26 */     this.bizDate = bizDate;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataMemberReportQueryModel
 * JD-Core Version:    0.7.0.1
 */