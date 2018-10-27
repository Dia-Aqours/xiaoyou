/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayInsSceneApplicationApplyModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 3841557976123586979L;
/*  13:    */   @ApiField("applicant")
/*  14:    */   private InsPerson applicant;
/*  15:    */   @ApiField("bill_title")
/*  16:    */   private String billTitle;
/*  17:    */   @ApiField("biz_data")
/*  18:    */   private String bizData;
/*  19:    */   @ApiField("effect_start_time")
/*  20:    */   private Date effectStartTime;
/*  21:    */   @ApiListField("insureds")
/*  22:    */   @ApiField("ins_person")
/*  23:    */   private List<InsPerson> insureds;
/*  24:    */   @ApiField("out_biz_no")
/*  25:    */   private String outBizNo;
/*  26:    */   @ApiField("period")
/*  27:    */   private String period;
/*  28:    */   @ApiField("prod_code")
/*  29:    */   private String prodCode;
/*  30:    */   @ApiField("source")
/*  31:    */   private String source;
/*  32:    */   
/*  33:    */   public InsPerson getApplicant()
/*  34:    */   {
/*  35: 76 */     return this.applicant;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setApplicant(InsPerson applicant)
/*  39:    */   {
/*  40: 79 */     this.applicant = applicant;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getBillTitle()
/*  44:    */   {
/*  45: 83 */     return this.billTitle;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setBillTitle(String billTitle)
/*  49:    */   {
/*  50: 86 */     this.billTitle = billTitle;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getBizData()
/*  54:    */   {
/*  55: 90 */     return this.bizData;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setBizData(String bizData)
/*  59:    */   {
/*  60: 93 */     this.bizData = bizData;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public Date getEffectStartTime()
/*  64:    */   {
/*  65: 97 */     return this.effectStartTime;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setEffectStartTime(Date effectStartTime)
/*  69:    */   {
/*  70:100 */     this.effectStartTime = effectStartTime;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public List<InsPerson> getInsureds()
/*  74:    */   {
/*  75:104 */     return this.insureds;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setInsureds(List<InsPerson> insureds)
/*  79:    */   {
/*  80:107 */     this.insureds = insureds;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getOutBizNo()
/*  84:    */   {
/*  85:111 */     return this.outBizNo;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setOutBizNo(String outBizNo)
/*  89:    */   {
/*  90:114 */     this.outBizNo = outBizNo;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getPeriod()
/*  94:    */   {
/*  95:118 */     return this.period;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setPeriod(String period)
/*  99:    */   {
/* 100:121 */     this.period = period;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getProdCode()
/* 104:    */   {
/* 105:125 */     return this.prodCode;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setProdCode(String prodCode)
/* 109:    */   {
/* 110:128 */     this.prodCode = prodCode;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getSource()
/* 114:    */   {
/* 115:132 */     return this.source;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setSource(String source)
/* 119:    */   {
/* 120:135 */     this.source = source;
/* 121:    */   }
/* 122:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayInsSceneApplicationApplyModel
 * JD-Core Version:    0.7.0.1
 */