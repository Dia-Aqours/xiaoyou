/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class KoubeiQualityTestCloudacptCheckresultSubmitModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4756764713887872691L;
/*  10:    */   @ApiField("activity_id")
/*  11:    */   private String activityId;
/*  12:    */   @ApiField("auth_code")
/*  13:    */   private String authCode;
/*  14:    */   @ApiField("batch_id")
/*  15:    */   private String batchId;
/*  16:    */   @ApiField("end_time")
/*  17:    */   private String endTime;
/*  18:    */   @ApiField("pid")
/*  19:    */   private String pid;
/*  20:    */   @ApiField("start_time")
/*  21:    */   private String startTime;
/*  22:    */   @ApiField("uid")
/*  23:    */   private String uid;
/*  24:    */   
/*  25:    */   public String getActivityId()
/*  26:    */   {
/*  27: 59 */     return this.activityId;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setActivityId(String activityId)
/*  31:    */   {
/*  32: 62 */     this.activityId = activityId;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getAuthCode()
/*  36:    */   {
/*  37: 66 */     return this.authCode;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setAuthCode(String authCode)
/*  41:    */   {
/*  42: 69 */     this.authCode = authCode;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getBatchId()
/*  46:    */   {
/*  47: 73 */     return this.batchId;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setBatchId(String batchId)
/*  51:    */   {
/*  52: 76 */     this.batchId = batchId;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getEndTime()
/*  56:    */   {
/*  57: 80 */     return this.endTime;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setEndTime(String endTime)
/*  61:    */   {
/*  62: 83 */     this.endTime = endTime;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getPid()
/*  66:    */   {
/*  67: 87 */     return this.pid;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setPid(String pid)
/*  71:    */   {
/*  72: 90 */     this.pid = pid;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getStartTime()
/*  76:    */   {
/*  77: 94 */     return this.startTime;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setStartTime(String startTime)
/*  81:    */   {
/*  82: 97 */     this.startTime = startTime;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getUid()
/*  86:    */   {
/*  87:101 */     return this.uid;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setUid(String uid)
/*  91:    */   {
/*  92:104 */     this.uid = uid;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiQualityTestCloudacptCheckresultSubmitModel
 * JD-Core Version:    0.7.0.1
 */