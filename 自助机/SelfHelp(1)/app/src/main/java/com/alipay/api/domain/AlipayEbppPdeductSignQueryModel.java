/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEbppPdeductSignQueryModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7734656212275354673L;
/*  10:    */   @ApiField("agreement_id")
/*  11:    */   private String agreementId;
/*  12:    */   @ApiField("bill_key")
/*  13:    */   private String billKey;
/*  14:    */   @ApiField("biz_type")
/*  15:    */   private String bizType;
/*  16:    */   @ApiField("charge_inst")
/*  17:    */   private String chargeInst;
/*  18:    */   @ApiField("sub_biz_type")
/*  19:    */   private String subBizType;
/*  20:    */   @ApiField("user_id")
/*  21:    */   private String userId;
/*  22:    */   
/*  23:    */   public String getAgreementId()
/*  24:    */   {
/*  25: 66 */     return this.agreementId;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void setAgreementId(String agreementId)
/*  29:    */   {
/*  30: 69 */     this.agreementId = agreementId;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String getBillKey()
/*  34:    */   {
/*  35: 73 */     return this.billKey;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setBillKey(String billKey)
/*  39:    */   {
/*  40: 76 */     this.billKey = billKey;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getBizType()
/*  44:    */   {
/*  45: 80 */     return this.bizType;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setBizType(String bizType)
/*  49:    */   {
/*  50: 83 */     this.bizType = bizType;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getChargeInst()
/*  54:    */   {
/*  55: 87 */     return this.chargeInst;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setChargeInst(String chargeInst)
/*  59:    */   {
/*  60: 90 */     this.chargeInst = chargeInst;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getSubBizType()
/*  64:    */   {
/*  65: 94 */     return this.subBizType;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setSubBizType(String subBizType)
/*  69:    */   {
/*  70: 97 */     this.subBizType = subBizType;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getUserId()
/*  74:    */   {
/*  75:101 */     return this.userId;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setUserId(String userId)
/*  79:    */   {
/*  80:104 */     this.userId = userId;
/*  81:    */   }
/*  82:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEbppPdeductSignQueryModel
 * JD-Core Version:    0.7.0.1
 */