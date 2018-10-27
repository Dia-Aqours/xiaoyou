/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayMarketingCampaignDrawcampTriggerResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 5876114338186658817L;
/*  10:    */   @ApiField("camp_id")
/*  11:    */   private String campId;
/*  12:    */   @ApiField("camp_log_id")
/*  13:    */   private String campLogId;
/*  14:    */   @ApiField("extend_field")
/*  15:    */   private String extendField;
/*  16:    */   @ApiField("prize_flag")
/*  17:    */   private String prizeFlag;
/*  18:    */   @ApiField("prize_id")
/*  19:    */   private String prizeId;
/*  20:    */   @ApiField("prize_name")
/*  21:    */   private String prizeName;
/*  22:    */   @ApiField("trigger_result")
/*  23:    */   private Boolean triggerResult;
/*  24:    */   
/*  25:    */   public void setCampId(String campId)
/*  26:    */   {
/*  27: 60 */     this.campId = campId;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getCampId()
/*  31:    */   {
/*  32: 63 */     return this.campId;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setCampLogId(String campLogId)
/*  36:    */   {
/*  37: 67 */     this.campLogId = campLogId;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getCampLogId()
/*  41:    */   {
/*  42: 70 */     return this.campLogId;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setExtendField(String extendField)
/*  46:    */   {
/*  47: 74 */     this.extendField = extendField;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getExtendField()
/*  51:    */   {
/*  52: 77 */     return this.extendField;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setPrizeFlag(String prizeFlag)
/*  56:    */   {
/*  57: 81 */     this.prizeFlag = prizeFlag;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getPrizeFlag()
/*  61:    */   {
/*  62: 84 */     return this.prizeFlag;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setPrizeId(String prizeId)
/*  66:    */   {
/*  67: 88 */     this.prizeId = prizeId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getPrizeId()
/*  71:    */   {
/*  72: 91 */     return this.prizeId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setPrizeName(String prizeName)
/*  76:    */   {
/*  77: 95 */     this.prizeName = prizeName;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getPrizeName()
/*  81:    */   {
/*  82: 98 */     return this.prizeName;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setTriggerResult(Boolean triggerResult)
/*  86:    */   {
/*  87:102 */     this.triggerResult = triggerResult;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public Boolean getTriggerResult()
/*  91:    */   {
/*  92:105 */     return this.triggerResult;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignDrawcampTriggerResponse
 * JD-Core Version:    0.7.0.1
 */