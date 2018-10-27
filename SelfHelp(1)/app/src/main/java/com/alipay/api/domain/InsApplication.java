/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class InsApplication
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 5184496489486459698L;
/*  11:    */   @ApiField("biz_data")
/*  12:    */   private String bizData;
/*  13:    */   @ApiField("copies")
/*  14:    */   private Long copies;
/*  15:    */   @ApiField("effect_end_time")
/*  16:    */   private Date effectEndTime;
/*  17:    */   @ApiField("effect_start_time")
/*  18:    */   private Date effectStartTime;
/*  19:    */   @ApiField("ins_object")
/*  20:    */   private InsObject insObject;
/*  21:    */   @ApiField("insured")
/*  22:    */   private InsPerson insured;
/*  23:    */   @ApiField("period")
/*  24:    */   private String period;
/*  25:    */   @ApiField("premium")
/*  26:    */   private Long premium;
/*  27:    */   @ApiField("sum_insured")
/*  28:    */   private Long sumInsured;
/*  29:    */   
/*  30:    */   public String getBizData()
/*  31:    */   {
/*  32: 73 */     return this.bizData;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setBizData(String bizData)
/*  36:    */   {
/*  37: 76 */     this.bizData = bizData;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public Long getCopies()
/*  41:    */   {
/*  42: 80 */     return this.copies;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setCopies(Long copies)
/*  46:    */   {
/*  47: 83 */     this.copies = copies;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public Date getEffectEndTime()
/*  51:    */   {
/*  52: 87 */     return this.effectEndTime;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setEffectEndTime(Date effectEndTime)
/*  56:    */   {
/*  57: 90 */     this.effectEndTime = effectEndTime;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public Date getEffectStartTime()
/*  61:    */   {
/*  62: 94 */     return this.effectStartTime;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setEffectStartTime(Date effectStartTime)
/*  66:    */   {
/*  67: 97 */     this.effectStartTime = effectStartTime;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public InsObject getInsObject()
/*  71:    */   {
/*  72:101 */     return this.insObject;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setInsObject(InsObject insObject)
/*  76:    */   {
/*  77:104 */     this.insObject = insObject;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public InsPerson getInsured()
/*  81:    */   {
/*  82:108 */     return this.insured;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setInsured(InsPerson insured)
/*  86:    */   {
/*  87:111 */     this.insured = insured;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getPeriod()
/*  91:    */   {
/*  92:115 */     return this.period;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setPeriod(String period)
/*  96:    */   {
/*  97:118 */     this.period = period;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public Long getPremium()
/* 101:    */   {
/* 102:122 */     return this.premium;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setPremium(Long premium)
/* 106:    */   {
/* 107:125 */     this.premium = premium;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public Long getSumInsured()
/* 111:    */   {
/* 112:129 */     return this.sumInsured;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setSumInsured(Long sumInsured)
/* 116:    */   {
/* 117:132 */     this.sumInsured = sumInsured;
/* 118:    */   }
/* 119:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsApplication
 * JD-Core Version:    0.7.0.1
 */