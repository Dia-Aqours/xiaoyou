/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class KoubeiAdvertCommissionAdvertPurchaseModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 6438741558233872373L;
/*  12:    */   @ApiField("out_unique_id")
/*  13:    */   private String outUniqueId;
/*  14:    */   @ApiField("security_code")
/*  15:    */   private String securityCode;
/*  16:    */   @ApiField("tag")
/*  17:    */   private String tag;
/*  18:    */   @ApiListField("trigger_identifies")
/*  19:    */   @ApiField("string")
/*  20:    */   private List<String> triggerIdentifies;
/*  21:    */   @ApiField("trigger_identify_type")
/*  22:    */   private String triggerIdentifyType;
/*  23:    */   @ApiField("user_identify")
/*  24:    */   private String userIdentify;
/*  25:    */   @ApiField("user_identify_type")
/*  26:    */   private String userIdentifyType;
/*  27:    */   
/*  28:    */   public String getOutUniqueId()
/*  29:    */   {
/*  30: 85 */     return this.outUniqueId;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setOutUniqueId(String outUniqueId)
/*  34:    */   {
/*  35: 88 */     this.outUniqueId = outUniqueId;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getSecurityCode()
/*  39:    */   {
/*  40: 92 */     return this.securityCode;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setSecurityCode(String securityCode)
/*  44:    */   {
/*  45: 95 */     this.securityCode = securityCode;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getTag()
/*  49:    */   {
/*  50: 99 */     return this.tag;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setTag(String tag)
/*  54:    */   {
/*  55:102 */     this.tag = tag;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public List<String> getTriggerIdentifies()
/*  59:    */   {
/*  60:106 */     return this.triggerIdentifies;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setTriggerIdentifies(List<String> triggerIdentifies)
/*  64:    */   {
/*  65:109 */     this.triggerIdentifies = triggerIdentifies;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getTriggerIdentifyType()
/*  69:    */   {
/*  70:113 */     return this.triggerIdentifyType;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setTriggerIdentifyType(String triggerIdentifyType)
/*  74:    */   {
/*  75:116 */     this.triggerIdentifyType = triggerIdentifyType;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getUserIdentify()
/*  79:    */   {
/*  80:120 */     return this.userIdentify;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setUserIdentify(String userIdentify)
/*  84:    */   {
/*  85:123 */     this.userIdentify = userIdentify;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getUserIdentifyType()
/*  89:    */   {
/*  90:127 */     return this.userIdentifyType;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setUserIdentifyType(String userIdentifyType)
/*  94:    */   {
/*  95:130 */     this.userIdentifyType = userIdentifyType;
/*  96:    */   }
/*  97:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiAdvertCommissionAdvertPurchaseModel
 * JD-Core Version:    0.7.0.1
 */