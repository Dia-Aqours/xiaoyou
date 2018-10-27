/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.Date;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class RecruitTool
/* 10:   */   extends AlipayObject
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 6676874598852548515L;
/* 13:   */   @ApiField("end_time")
/* 14:   */   private Date endTime;
/* 15:   */   @ApiField("exclude_constraint_shops")
/* 16:   */   private Boolean excludeConstraintShops;
/* 17:   */   @ApiListField("pid_shops")
/* 18:   */   @ApiField("pid_shop_info")
/* 19:   */   private List<PidShopInfo> pidShops;
/* 20:   */   @ApiField("start_time")
/* 21:   */   private Date startTime;
/* 22:   */   
/* 23:   */   public Date getEndTime()
/* 24:   */   {
/* 25:46 */     return this.endTime;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setEndTime(Date endTime)
/* 29:   */   {
/* 30:49 */     this.endTime = endTime;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public Boolean getExcludeConstraintShops()
/* 34:   */   {
/* 35:53 */     return this.excludeConstraintShops;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setExcludeConstraintShops(Boolean excludeConstraintShops)
/* 39:   */   {
/* 40:56 */     this.excludeConstraintShops = excludeConstraintShops;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public List<PidShopInfo> getPidShops()
/* 44:   */   {
/* 45:60 */     return this.pidShops;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setPidShops(List<PidShopInfo> pidShops)
/* 49:   */   {
/* 50:63 */     this.pidShops = pidShops;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public Date getStartTime()
/* 54:   */   {
/* 55:67 */     return this.startTime;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setStartTime(Date startTime)
/* 59:   */   {
/* 60:70 */     this.startTime = startTime;
/* 61:   */   }
/* 62:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RecruitTool
 * JD-Core Version:    0.7.0.1
 */