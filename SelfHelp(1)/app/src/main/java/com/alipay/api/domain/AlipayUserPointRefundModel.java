/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserPointRefundModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5652986239921865852L;
/* 10:   */   @ApiField("biz_type")
/* 11:   */   private String bizType;
/* 12:   */   @ApiField("out_biz_no")
/* 13:   */   private String outBizNo;
/* 14:   */   @ApiField("sub_biz_type")
/* 15:   */   private String subBizType;
/* 16:   */   @ApiField("user_id")
/* 17:   */   private String userId;
/* 18:   */   
/* 19:   */   public String getBizType()
/* 20:   */   {
/* 21:41 */     return this.bizType;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setBizType(String bizType)
/* 25:   */   {
/* 26:44 */     this.bizType = bizType;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getOutBizNo()
/* 30:   */   {
/* 31:48 */     return this.outBizNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setOutBizNo(String outBizNo)
/* 35:   */   {
/* 36:51 */     this.outBizNo = outBizNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getSubBizType()
/* 40:   */   {
/* 41:55 */     return this.subBizType;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setSubBizType(String subBizType)
/* 45:   */   {
/* 46:58 */     this.subBizType = subBizType;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getUserId()
/* 50:   */   {
/* 51:62 */     return this.userId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setUserId(String userId)
/* 55:   */   {
/* 56:65 */     this.userId = userId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserPointRefundModel
 * JD-Core Version:    0.7.0.1
 */