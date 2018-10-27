/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.OpenActivity;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiQualityTestCloudacptActivityQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 8144825145365711124L;
/* 13:   */   @ApiListField("activity_list")
/* 14:   */   @ApiField("open_activity")
/* 15:   */   private List<OpenActivity> activityList;
/* 16:   */   
/* 17:   */   public void setActivityList(List<OpenActivity> activityList)
/* 18:   */   {
/* 19:28 */     this.activityList = activityList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<OpenActivity> getActivityList()
/* 23:   */   {
/* 24:31 */     return this.activityList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiQualityTestCloudacptActivityQueryResponse
 * JD-Core Version:    0.7.0.1
 */