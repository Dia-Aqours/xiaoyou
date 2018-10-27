/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPcreditLoanApplyCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2661759327592966761L;
/* 10:   */   @ApiField("apply_amt")
/* 11:   */   private String applyAmt;
/* 12:   */   @ApiField("cert_no")
/* 13:   */   private String certNo;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   @ApiField("out_biz_no")
/* 17:   */   private String outBizNo;
/* 18:   */   @ApiField("ratio")
/* 19:   */   private Long ratio;
/* 20:   */   @ApiField("scene")
/* 21:   */   private String scene;
/* 22:   */   
/* 23:   */   public String getApplyAmt()
/* 24:   */   {
/* 25:53 */     return this.applyAmt;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setApplyAmt(String applyAmt)
/* 29:   */   {
/* 30:56 */     this.applyAmt = applyAmt;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getCertNo()
/* 34:   */   {
/* 35:60 */     return this.certNo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setCertNo(String certNo)
/* 39:   */   {
/* 40:63 */     this.certNo = certNo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getName()
/* 44:   */   {
/* 45:67 */     return this.name;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setName(String name)
/* 49:   */   {
/* 50:70 */     this.name = name;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOutBizNo()
/* 54:   */   {
/* 55:74 */     return this.outBizNo;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOutBizNo(String outBizNo)
/* 59:   */   {
/* 60:77 */     this.outBizNo = outBizNo;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public Long getRatio()
/* 64:   */   {
/* 65:81 */     return this.ratio;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setRatio(Long ratio)
/* 69:   */   {
/* 70:84 */     this.ratio = ratio;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getScene()
/* 74:   */   {
/* 75:88 */     return this.scene;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setScene(String scene)
/* 79:   */   {
/* 80:91 */     this.scene = scene;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayPcreditLoanApplyCreateModel
 * JD-Core Version:    0.7.0.1
 */