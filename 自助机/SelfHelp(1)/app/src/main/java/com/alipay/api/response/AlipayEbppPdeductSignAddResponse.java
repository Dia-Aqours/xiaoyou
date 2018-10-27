/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayEbppPdeductSignAddResponse
/*   9:    */   extends AlipayResponse
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 2276939486482364948L;
/*  12:    */   @ApiField("agreement_id")
/*  13:    */   private String agreementId;
/*  14:    */   @ApiField("agreement_status")
/*  15:    */   private String agreementStatus;
/*  16:    */   @ApiField("extend_field")
/*  17:    */   private String extendField;
/*  18:    */   @ApiField("notify_config")
/*  19:    */   private String notifyConfig;
/*  20:    */   @ApiField("out_agreement_id")
/*  21:    */   private String outAgreementId;
/*  22:    */   @ApiListField("pay_config")
/*  23:    */   @ApiField("string")
/*  24:    */   private List<String> payConfig;
/*  25:    */   @ApiField("sign_date")
/*  26:    */   private String signDate;
/*  27:    */   
/*  28:    */   public void setAgreementId(String agreementId)
/*  29:    */   {
/*  30: 63 */     this.agreementId = agreementId;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String getAgreementId()
/*  34:    */   {
/*  35: 66 */     return this.agreementId;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setAgreementStatus(String agreementStatus)
/*  39:    */   {
/*  40: 70 */     this.agreementStatus = agreementStatus;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getAgreementStatus()
/*  44:    */   {
/*  45: 73 */     return this.agreementStatus;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setExtendField(String extendField)
/*  49:    */   {
/*  50: 77 */     this.extendField = extendField;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getExtendField()
/*  54:    */   {
/*  55: 80 */     return this.extendField;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setNotifyConfig(String notifyConfig)
/*  59:    */   {
/*  60: 84 */     this.notifyConfig = notifyConfig;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getNotifyConfig()
/*  64:    */   {
/*  65: 87 */     return this.notifyConfig;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setOutAgreementId(String outAgreementId)
/*  69:    */   {
/*  70: 91 */     this.outAgreementId = outAgreementId;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getOutAgreementId()
/*  74:    */   {
/*  75: 94 */     return this.outAgreementId;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setPayConfig(List<String> payConfig)
/*  79:    */   {
/*  80: 98 */     this.payConfig = payConfig;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public List<String> getPayConfig()
/*  84:    */   {
/*  85:101 */     return this.payConfig;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setSignDate(String signDate)
/*  89:    */   {
/*  90:105 */     this.signDate = signDate;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getSignDate()
/*  94:    */   {
/*  95:108 */     return this.signDate;
/*  96:    */   }
/*  97:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEbppPdeductSignAddResponse
 * JD-Core Version:    0.7.0.1
 */