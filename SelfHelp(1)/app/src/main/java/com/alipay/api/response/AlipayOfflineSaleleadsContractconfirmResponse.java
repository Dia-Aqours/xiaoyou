/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineSaleleadsContractconfirmResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6167236581647252142L;
/*  10:    */   @ApiField("ff_audit_status")
/*  11:    */   private String ffAuditStatus;
/*  12:    */   @ApiField("ff_audit_time")
/*  13:    */   private String ffAuditTime;
/*  14:    */   @ApiField("ff_online")
/*  15:    */   private String ffOnline;
/*  16:    */   @ApiField("is_open_shop")
/*  17:    */   private String isOpenShop;
/*  18:    */   @ApiField("is_sign")
/*  19:    */   private String isSign;
/*  20:    */   @ApiField("leads_id")
/*  21:    */   private String leadsId;
/*  22:    */   @ApiField("merchant_id")
/*  23:    */   private String merchantId;
/*  24:    */   
/*  25:    */   public void setFfAuditStatus(String ffAuditStatus)
/*  26:    */   {
/*  27: 60 */     this.ffAuditStatus = ffAuditStatus;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getFfAuditStatus()
/*  31:    */   {
/*  32: 63 */     return this.ffAuditStatus;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setFfAuditTime(String ffAuditTime)
/*  36:    */   {
/*  37: 67 */     this.ffAuditTime = ffAuditTime;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getFfAuditTime()
/*  41:    */   {
/*  42: 70 */     return this.ffAuditTime;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setFfOnline(String ffOnline)
/*  46:    */   {
/*  47: 74 */     this.ffOnline = ffOnline;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getFfOnline()
/*  51:    */   {
/*  52: 77 */     return this.ffOnline;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setIsOpenShop(String isOpenShop)
/*  56:    */   {
/*  57: 81 */     this.isOpenShop = isOpenShop;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getIsOpenShop()
/*  61:    */   {
/*  62: 84 */     return this.isOpenShop;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setIsSign(String isSign)
/*  66:    */   {
/*  67: 88 */     this.isSign = isSign;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getIsSign()
/*  71:    */   {
/*  72: 91 */     return this.isSign;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setLeadsId(String leadsId)
/*  76:    */   {
/*  77: 95 */     this.leadsId = leadsId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getLeadsId()
/*  81:    */   {
/*  82: 98 */     return this.leadsId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setMerchantId(String merchantId)
/*  86:    */   {
/*  87:102 */     this.merchantId = merchantId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getMerchantId()
/*  91:    */   {
/*  92:105 */     return this.merchantId;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineSaleleadsContractconfirmResponse
 * JD-Core Version:    0.7.0.1
 */