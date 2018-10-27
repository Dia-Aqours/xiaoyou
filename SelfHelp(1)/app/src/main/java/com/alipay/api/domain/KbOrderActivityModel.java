/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbOrderActivityModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7345396816681217315L;
/* 10:   */   @ApiField("activity_id")
/* 11:   */   private String activityId;
/* 12:   */   @ApiField("item_id")
/* 13:   */   private String itemId;
/* 14:   */   
/* 15:   */   public String getActivityId()
/* 16:   */   {
/* 17:29 */     return this.activityId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setActivityId(String activityId)
/* 21:   */   {
/* 22:32 */     this.activityId = activityId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getItemId()
/* 26:   */   {
/* 27:36 */     return this.itemId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setItemId(String itemId)
/* 31:   */   {
/* 32:39 */     this.itemId = itemId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbOrderActivityModel
 * JD-Core Version:    0.7.0.1
 */