/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class UseRule
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8852747862357579356L;
/* 12:   */   @ApiField("ext_info")
/* 13:   */   private String extInfo;
/* 14:   */   @ApiField("forbidden_time")
/* 15:   */   private ForbbidenTime forbiddenTime;
/* 16:   */   @ApiField("min_consume")
/* 17:   */   private String minConsume;
/* 18:   */   @ApiListField("suit_shops")
/* 19:   */   @ApiField("string")
/* 20:   */   private List<String> suitShops;
/* 21:   */   @ApiListField("use_time")
/* 22:   */   @ApiField("use_time")
/* 23:   */   private List<UseTime> useTime;
/* 24:   */   
/* 25:   */   public String getExtInfo()
/* 26:   */   {
/* 27:55 */     return this.extInfo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setExtInfo(String extInfo)
/* 31:   */   {
/* 32:58 */     this.extInfo = extInfo;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public ForbbidenTime getForbiddenTime()
/* 36:   */   {
/* 37:62 */     return this.forbiddenTime;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setForbiddenTime(ForbbidenTime forbiddenTime)
/* 41:   */   {
/* 42:65 */     this.forbiddenTime = forbiddenTime;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public String getMinConsume()
/* 46:   */   {
/* 47:69 */     return this.minConsume;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setMinConsume(String minConsume)
/* 51:   */   {
/* 52:72 */     this.minConsume = minConsume;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public List<String> getSuitShops()
/* 56:   */   {
/* 57:76 */     return this.suitShops;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void setSuitShops(List<String> suitShops)
/* 61:   */   {
/* 62:79 */     this.suitShops = suitShops;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public List<UseTime> getUseTime()
/* 66:   */   {
/* 67:83 */     return this.useTime;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public void setUseTime(List<UseTime> useTime)
/* 71:   */   {
/* 72:86 */     this.useTime = useTime;
/* 73:   */   }
/* 74:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.UseRule
 * JD-Core Version:    0.7.0.1
 */