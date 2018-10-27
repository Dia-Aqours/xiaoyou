/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarMaintainOrderstatusUpdateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7521578674367146445L;
/* 10:   */   @ApiField("ext_param")
/* 11:   */   private MaintainOrderStatusExtParams extParam;
/* 12:   */   @ApiField("industry_code")
/* 13:   */   private String industryCode;
/* 14:   */   @ApiField("order_no")
/* 15:   */   private String orderNo;
/* 16:   */   @ApiField("order_status")
/* 17:   */   private String orderStatus;
/* 18:   */   @ApiField("type")
/* 19:   */   private String type;
/* 20:   */   
/* 21:   */   public MaintainOrderStatusExtParams getExtParam()
/* 22:   */   {
/* 23:47 */     return this.extParam;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setExtParam(MaintainOrderStatusExtParams extParam)
/* 27:   */   {
/* 28:50 */     this.extParam = extParam;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getIndustryCode()
/* 32:   */   {
/* 33:54 */     return this.industryCode;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setIndustryCode(String industryCode)
/* 37:   */   {
/* 38:57 */     this.industryCode = industryCode;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getOrderNo()
/* 42:   */   {
/* 43:61 */     return this.orderNo;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setOrderNo(String orderNo)
/* 47:   */   {
/* 48:64 */     this.orderNo = orderNo;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getOrderStatus()
/* 52:   */   {
/* 53:68 */     return this.orderStatus;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setOrderStatus(String orderStatus)
/* 57:   */   {
/* 58:71 */     this.orderStatus = orderStatus;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getType()
/* 62:   */   {
/* 63:75 */     return this.type;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setType(String type)
/* 67:   */   {
/* 68:78 */     this.type = type;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainOrderstatusUpdateModel
 * JD-Core Version:    0.7.0.1
 */