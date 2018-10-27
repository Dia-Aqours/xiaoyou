/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlisisReportColumn
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5696491681222472168L;
/* 10:   */   @ApiField("alias")
/* 11:   */   private String alias;
/* 12:   */   @ApiField("data")
/* 13:   */   private String data;
/* 14:   */   
/* 15:   */   public String getAlias()
/* 16:   */   {
/* 17:29 */     return this.alias;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setAlias(String alias)
/* 21:   */   {
/* 22:32 */     this.alias = alias;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getData()
/* 26:   */   {
/* 27:36 */     return this.data;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setData(String data)
/* 31:   */   {
/* 32:39 */     this.data = data;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlisisReportColumn

 * JD-Core Version:    0.7.0.1

 */