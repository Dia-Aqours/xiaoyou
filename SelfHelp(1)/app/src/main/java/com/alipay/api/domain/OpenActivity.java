/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class OpenActivity
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7574572923362729215L;
/* 10:   */   @ApiField("activity_end_date")
/* 11:   */   private String activityEndDate;
/* 12:   */   @ApiField("activity_id")
/* 13:   */   private String activityId;
/* 14:   */   @ApiField("activity_name")
/* 15:   */   private String activityName;
/* 16:   */   @ApiField("activity_start_date")
/* 17:   */   private String activityStartDate;
/* 18:   */   @ApiField("activity_status")
/* 19:   */   private String activityStatus;
/* 20:   */   @ApiField("store_id")
/* 21:   */   private String storeId;
/* 22:   */   
/* 23:   */   public String getActivityEndDate()
/* 24:   */   {
/* 25:56 */     return this.activityEndDate;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setActivityEndDate(String activityEndDate)
/* 29:   */   {
/* 30:59 */     this.activityEndDate = activityEndDate;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getActivityId()
/* 34:   */   {
/* 35:63 */     return this.activityId;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setActivityId(String activityId)
/* 39:   */   {
/* 40:66 */     this.activityId = activityId;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getActivityName()
/* 44:   */   {
/* 45:70 */     return this.activityName;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setActivityName(String activityName)
/* 49:   */   {
/* 50:73 */     this.activityName = activityName;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getActivityStartDate()
/* 54:   */   {
/* 55:77 */     return this.activityStartDate;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setActivityStartDate(String activityStartDate)
/* 59:   */   {
/* 60:80 */     this.activityStartDate = activityStartDate;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getActivityStatus()
/* 64:   */   {
/* 65:84 */     return this.activityStatus;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setActivityStatus(String activityStatus)
/* 69:   */   {
/* 70:87 */     this.activityStatus = activityStatus;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getStoreId()
/* 74:   */   {
/* 75:91 */     return this.storeId;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setStoreId(String storeId)
/* 79:   */   {
/* 80:94 */     this.storeId = storeId;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OpenActivity
 * JD-Core Version:    0.7.0.1
 */