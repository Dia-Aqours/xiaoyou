/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayMarketingCampaignDiscountBudgetCreateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7875997838257574765L;
/*  10:    */   @ApiField("biz_from")
/*  11:    */   private String bizFrom;
/*  12:    */   @ApiField("gmt_end")
/*  13:    */   private String gmtEnd;
/*  14:    */   @ApiField("name")
/*  15:    */   private String name;
/*  16:    */   @ApiField("out_biz_no")
/*  17:    */   private String outBizNo;
/*  18:    */   @ApiField("out_budget_no")
/*  19:    */   private String outBudgetNo;
/*  20:    */   @ApiField("publisher_logon_id")
/*  21:    */   private String publisherLogonId;
/*  22:    */   @ApiField("total_amount")
/*  23:    */   private String totalAmount;
/*  24:    */   
/*  25:    */   public String getBizFrom()
/*  26:    */   {
/*  27: 59 */     return this.bizFrom;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setBizFrom(String bizFrom)
/*  31:    */   {
/*  32: 62 */     this.bizFrom = bizFrom;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getGmtEnd()
/*  36:    */   {
/*  37: 66 */     return this.gmtEnd;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setGmtEnd(String gmtEnd)
/*  41:    */   {
/*  42: 69 */     this.gmtEnd = gmtEnd;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getName()
/*  46:    */   {
/*  47: 73 */     return this.name;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setName(String name)
/*  51:    */   {
/*  52: 76 */     this.name = name;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getOutBizNo()
/*  56:    */   {
/*  57: 80 */     return this.outBizNo;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setOutBizNo(String outBizNo)
/*  61:    */   {
/*  62: 83 */     this.outBizNo = outBizNo;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getOutBudgetNo()
/*  66:    */   {
/*  67: 87 */     return this.outBudgetNo;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setOutBudgetNo(String outBudgetNo)
/*  71:    */   {
/*  72: 90 */     this.outBudgetNo = outBudgetNo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getPublisherLogonId()
/*  76:    */   {
/*  77: 94 */     return this.publisherLogonId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setPublisherLogonId(String publisherLogonId)
/*  81:    */   {
/*  82: 97 */     this.publisherLogonId = publisherLogonId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getTotalAmount()
/*  86:    */   {
/*  87:101 */     return this.totalAmount;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setTotalAmount(String totalAmount)
/*  91:    */   {
/*  92:104 */     this.totalAmount = totalAmount;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignDiscountBudgetCreateModel
 * JD-Core Version:    0.7.0.1
 */