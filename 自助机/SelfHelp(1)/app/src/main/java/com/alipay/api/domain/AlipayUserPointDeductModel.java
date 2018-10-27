/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class AlipayUserPointDeductModel
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 4795692929759347226L;
/* 11:   */   @ApiField("benefit_id")
/* 12:   */   private String benefitId;
/* 13:   */   @ApiField("biz_date")
/* 14:   */   private Date bizDate;
/* 15:   */   @ApiField("biz_type")
/* 16:   */   private String bizType;
/* 17:   */   @ApiField("out_biz_no")
/* 18:   */   private String outBizNo;
/* 19:   */   @ApiField("sub_biz_type")
/* 20:   */   private String subBizType;
/* 21:   */   
/* 22:   */   public String getBenefitId()
/* 23:   */   {
/* 24:49 */     return this.benefitId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setBenefitId(String benefitId)
/* 28:   */   {
/* 29:52 */     this.benefitId = benefitId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public Date getBizDate()
/* 33:   */   {
/* 34:56 */     return this.bizDate;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setBizDate(Date bizDate)
/* 38:   */   {
/* 39:59 */     this.bizDate = bizDate;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getBizType()
/* 43:   */   {
/* 44:63 */     return this.bizType;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setBizType(String bizType)
/* 48:   */   {
/* 49:66 */     this.bizType = bizType;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getOutBizNo()
/* 53:   */   {
/* 54:70 */     return this.outBizNo;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setOutBizNo(String outBizNo)
/* 58:   */   {
/* 59:73 */     this.outBizNo = outBizNo;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public String getSubBizType()
/* 63:   */   {
/* 64:77 */     return this.subBizType;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public void setSubBizType(String subBizType)
/* 68:   */   {
/* 69:80 */     this.subBizType = subBizType;
/* 70:   */   }
/* 71:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserPointDeductModel
 * JD-Core Version:    0.7.0.1
 */