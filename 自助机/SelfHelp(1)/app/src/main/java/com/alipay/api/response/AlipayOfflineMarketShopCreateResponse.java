/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineMarketShopCreateResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6282761715139649379L;
/*  10:    */   @ApiField("apply_id")
/*  11:    */   private String applyId;
/*  12:    */   @ApiField("audit_desc")
/*  13:    */   private String auditDesc;
/*  14:    */   @ApiField("audit_status")
/*  15:    */   private String auditStatus;
/*  16:    */   @ApiField("is_online")
/*  17:    */   private String isOnline;
/*  18:    */   @ApiField("is_show")
/*  19:    */   private String isShow;
/*  20:    */   @ApiField("result_code")
/*  21:    */   private String resultCode;
/*  22:    */   @ApiField("shop_id")
/*  23:    */   private String shopId;
/*  24:    */   
/*  25:    */   public void setApplyId(String applyId)
/*  26:    */   {
/*  27: 63 */     this.applyId = applyId;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getApplyId()
/*  31:    */   {
/*  32: 66 */     return this.applyId;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setAuditDesc(String auditDesc)
/*  36:    */   {
/*  37: 70 */     this.auditDesc = auditDesc;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getAuditDesc()
/*  41:    */   {
/*  42: 73 */     return this.auditDesc;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setAuditStatus(String auditStatus)
/*  46:    */   {
/*  47: 77 */     this.auditStatus = auditStatus;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getAuditStatus()
/*  51:    */   {
/*  52: 80 */     return this.auditStatus;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setIsOnline(String isOnline)
/*  56:    */   {
/*  57: 84 */     this.isOnline = isOnline;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getIsOnline()
/*  61:    */   {
/*  62: 87 */     return this.isOnline;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setIsShow(String isShow)
/*  66:    */   {
/*  67: 91 */     this.isShow = isShow;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getIsShow()
/*  71:    */   {
/*  72: 94 */     return this.isShow;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setResultCode(String resultCode)
/*  76:    */   {
/*  77: 98 */     this.resultCode = resultCode;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getResultCode()
/*  81:    */   {
/*  82:101 */     return this.resultCode;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setShopId(String shopId)
/*  86:    */   {
/*  87:105 */     this.shopId = shopId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getShopId()
/*  91:    */   {
/*  92:108 */     return this.shopId;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketShopCreateResponse
 * JD-Core Version:    0.7.0.1
 */