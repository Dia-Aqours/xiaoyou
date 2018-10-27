/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class OpenPromoCamp
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5373452986769394125L;
/* 10:   */   @ApiField("camp_alias")
/* 11:   */   private String campAlias;
/* 12:   */   @ApiField("camp_desc")
/* 13:   */   private String campDesc;
/* 14:   */   @ApiField("camp_end_time")
/* 15:   */   private String campEndTime;
/* 16:   */   @ApiField("camp_name")
/* 17:   */   private String campName;
/* 18:   */   @ApiField("camp_start_time")
/* 19:   */   private String campStartTime;
/* 20:   */   @ApiField("camp_type")
/* 21:   */   private String campType;
/* 22:   */   
/* 23:   */   public String getCampAlias()
/* 24:   */   {
/* 25:53 */     return this.campAlias;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setCampAlias(String campAlias)
/* 29:   */   {
/* 30:56 */     this.campAlias = campAlias;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getCampDesc()
/* 34:   */   {
/* 35:60 */     return this.campDesc;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setCampDesc(String campDesc)
/* 39:   */   {
/* 40:63 */     this.campDesc = campDesc;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getCampEndTime()
/* 44:   */   {
/* 45:67 */     return this.campEndTime;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setCampEndTime(String campEndTime)
/* 49:   */   {
/* 50:70 */     this.campEndTime = campEndTime;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getCampName()
/* 54:   */   {
/* 55:74 */     return this.campName;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setCampName(String campName)
/* 59:   */   {
/* 60:77 */     this.campName = campName;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getCampStartTime()
/* 64:   */   {
/* 65:81 */     return this.campStartTime;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setCampStartTime(String campStartTime)
/* 69:   */   {
/* 70:84 */     this.campStartTime = campStartTime;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getCampType()
/* 74:   */   {
/* 75:88 */     return this.campType;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setCampType(String campType)
/* 79:   */   {
/* 80:91 */     this.campType = campType;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OpenPromoCamp
 * JD-Core Version:    0.7.0.1
 */