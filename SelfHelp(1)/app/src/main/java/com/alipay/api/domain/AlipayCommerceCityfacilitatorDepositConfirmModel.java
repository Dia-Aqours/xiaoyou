/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayCommerceCityfacilitatorDepositConfirmModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8611396125891578468L;
/*  10:    */   @ApiField("biz_info_ext")
/*  11:    */   private String bizInfoExt;
/*  12:    */   @ApiField("card_no")
/*  13:    */   private String cardNo;
/*  14:    */   @ApiField("card_type")
/*  15:    */   private String cardType;
/*  16:    */   @ApiField("operate_time")
/*  17:    */   private String operateTime;
/*  18:    */   @ApiField("out_biz_no")
/*  19:    */   private String outBizNo;
/*  20:    */   @ApiField("request_id")
/*  21:    */   private String requestId;
/*  22:    */   @ApiField("trade_no")
/*  23:    */   private String tradeNo;
/*  24:    */   
/*  25:    */   public String getBizInfoExt()
/*  26:    */   {
/*  27: 59 */     return this.bizInfoExt;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setBizInfoExt(String bizInfoExt)
/*  31:    */   {
/*  32: 62 */     this.bizInfoExt = bizInfoExt;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getCardNo()
/*  36:    */   {
/*  37: 66 */     return this.cardNo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setCardNo(String cardNo)
/*  41:    */   {
/*  42: 69 */     this.cardNo = cardNo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getCardType()
/*  46:    */   {
/*  47: 73 */     return this.cardType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setCardType(String cardType)
/*  51:    */   {
/*  52: 76 */     this.cardType = cardType;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getOperateTime()
/*  56:    */   {
/*  57: 80 */     return this.operateTime;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setOperateTime(String operateTime)
/*  61:    */   {
/*  62: 83 */     this.operateTime = operateTime;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getOutBizNo()
/*  66:    */   {
/*  67: 87 */     return this.outBizNo;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setOutBizNo(String outBizNo)
/*  71:    */   {
/*  72: 90 */     this.outBizNo = outBizNo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getRequestId()
/*  76:    */   {
/*  77: 94 */     return this.requestId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setRequestId(String requestId)
/*  81:    */   {
/*  82: 97 */     this.requestId = requestId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getTradeNo()
/*  86:    */   {
/*  87:101 */     return this.tradeNo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setTradeNo(String tradeNo)
/*  91:    */   {
/*  92:104 */     this.tradeNo = tradeNo;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorDepositConfirmModel
 * JD-Core Version:    0.7.0.1
 */