/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class MpPrizeInfoModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6244612398918516764L;
/*  10:    */   @ApiField("certlot_number")
/*  11:    */   private String certlotNumber;
/*  12:    */   @ApiField("frequency_count")
/*  13:    */   private String frequencyCount;
/*  14:    */   @ApiField("frequency_type")
/*  15:    */   private String frequencyType;
/*  16:    */   @ApiField("prize_end_time")
/*  17:    */   private String prizeEndTime;
/*  18:    */   @ApiField("prize_id")
/*  19:    */   private String prizeId;
/*  20:    */   @ApiField("prize_max_award_limit")
/*  21:    */   private String prizeMaxAwardLimit;
/*  22:    */   @ApiField("prize_name")
/*  23:    */   private String prizeName;
/*  24:    */   @ApiField("prize_start_time")
/*  25:    */   private String prizeStartTime;
/*  26:    */   @ApiField("prize_total")
/*  27:    */   private String prizeTotal;
/*  28:    */   @ApiField("prize_type")
/*  29:    */   private String prizeType;
/*  30:    */   
/*  31:    */   public String getCertlotNumber()
/*  32:    */   {
/*  33: 77 */     return this.certlotNumber;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setCertlotNumber(String certlotNumber)
/*  37:    */   {
/*  38: 80 */     this.certlotNumber = certlotNumber;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getFrequencyCount()
/*  42:    */   {
/*  43: 84 */     return this.frequencyCount;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setFrequencyCount(String frequencyCount)
/*  47:    */   {
/*  48: 87 */     this.frequencyCount = frequencyCount;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getFrequencyType()
/*  52:    */   {
/*  53: 91 */     return this.frequencyType;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setFrequencyType(String frequencyType)
/*  57:    */   {
/*  58: 94 */     this.frequencyType = frequencyType;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getPrizeEndTime()
/*  62:    */   {
/*  63: 98 */     return this.prizeEndTime;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setPrizeEndTime(String prizeEndTime)
/*  67:    */   {
/*  68:101 */     this.prizeEndTime = prizeEndTime;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getPrizeId()
/*  72:    */   {
/*  73:105 */     return this.prizeId;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setPrizeId(String prizeId)
/*  77:    */   {
/*  78:108 */     this.prizeId = prizeId;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getPrizeMaxAwardLimit()
/*  82:    */   {
/*  83:112 */     return this.prizeMaxAwardLimit;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setPrizeMaxAwardLimit(String prizeMaxAwardLimit)
/*  87:    */   {
/*  88:115 */     this.prizeMaxAwardLimit = prizeMaxAwardLimit;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getPrizeName()
/*  92:    */   {
/*  93:119 */     return this.prizeName;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setPrizeName(String prizeName)
/*  97:    */   {
/*  98:122 */     this.prizeName = prizeName;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getPrizeStartTime()
/* 102:    */   {
/* 103:126 */     return this.prizeStartTime;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setPrizeStartTime(String prizeStartTime)
/* 107:    */   {
/* 108:129 */     this.prizeStartTime = prizeStartTime;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getPrizeTotal()
/* 112:    */   {
/* 113:133 */     return this.prizeTotal;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setPrizeTotal(String prizeTotal)
/* 117:    */   {
/* 118:136 */     this.prizeTotal = prizeTotal;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getPrizeType()
/* 122:    */   {
/* 123:140 */     return this.prizeType;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setPrizeType(String prizeType)
/* 127:    */   {
/* 128:143 */     this.prizeType = prizeType;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MpPrizeInfoModel
 * JD-Core Version:    0.7.0.1
 */