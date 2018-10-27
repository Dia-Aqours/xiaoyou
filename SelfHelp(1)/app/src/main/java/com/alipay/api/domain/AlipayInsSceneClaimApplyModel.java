/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class AlipayInsSceneClaimApplyModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 4344255949833662825L;
/*  11:    */   @ApiField("accident_address")
/*  12:    */   private String accidentAddress;
/*  13:    */   @ApiField("accident_desc")
/*  14:    */   private String accidentDesc;
/*  15:    */   @ApiField("accident_time")
/*  16:    */   private Date accidentTime;
/*  17:    */   @ApiField("bill_title")
/*  18:    */   private String billTitle;
/*  19:    */   @ApiField("biz_data")
/*  20:    */   private String bizData;
/*  21:    */   @ApiField("claim_fee")
/*  22:    */   private Long claimFee;
/*  23:    */   @ApiField("out_biz_no")
/*  24:    */   private String outBizNo;
/*  25:    */   @ApiField("out_request_no")
/*  26:    */   private String outRequestNo;
/*  27:    */   @ApiField("prod_code")
/*  28:    */   private String prodCode;
/*  29:    */   @ApiField("reporter")
/*  30:    */   private InsPerson reporter;
/*  31:    */   
/*  32:    */   public String getAccidentAddress()
/*  33:    */   {
/*  34: 79 */     return this.accidentAddress;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setAccidentAddress(String accidentAddress)
/*  38:    */   {
/*  39: 82 */     this.accidentAddress = accidentAddress;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getAccidentDesc()
/*  43:    */   {
/*  44: 86 */     return this.accidentDesc;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setAccidentDesc(String accidentDesc)
/*  48:    */   {
/*  49: 89 */     this.accidentDesc = accidentDesc;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public Date getAccidentTime()
/*  53:    */   {
/*  54: 93 */     return this.accidentTime;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setAccidentTime(Date accidentTime)
/*  58:    */   {
/*  59: 96 */     this.accidentTime = accidentTime;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getBillTitle()
/*  63:    */   {
/*  64:100 */     return this.billTitle;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setBillTitle(String billTitle)
/*  68:    */   {
/*  69:103 */     this.billTitle = billTitle;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getBizData()
/*  73:    */   {
/*  74:107 */     return this.bizData;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setBizData(String bizData)
/*  78:    */   {
/*  79:110 */     this.bizData = bizData;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public Long getClaimFee()
/*  83:    */   {
/*  84:114 */     return this.claimFee;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setClaimFee(Long claimFee)
/*  88:    */   {
/*  89:117 */     this.claimFee = claimFee;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getOutBizNo()
/*  93:    */   {
/*  94:121 */     return this.outBizNo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setOutBizNo(String outBizNo)
/*  98:    */   {
/*  99:124 */     this.outBizNo = outBizNo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getOutRequestNo()
/* 103:    */   {
/* 104:128 */     return this.outRequestNo;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setOutRequestNo(String outRequestNo)
/* 108:    */   {
/* 109:131 */     this.outRequestNo = outRequestNo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getProdCode()
/* 113:    */   {
/* 114:135 */     return this.prodCode;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setProdCode(String prodCode)
/* 118:    */   {
/* 119:138 */     this.prodCode = prodCode;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public InsPerson getReporter()
/* 123:    */   {
/* 124:142 */     return this.reporter;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setReporter(InsPerson reporter)
/* 128:    */   {
/* 129:145 */     this.reporter = reporter;
/* 130:    */   }
/* 131:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayInsSceneClaimApplyModel
 * JD-Core Version:    0.7.0.1
 */