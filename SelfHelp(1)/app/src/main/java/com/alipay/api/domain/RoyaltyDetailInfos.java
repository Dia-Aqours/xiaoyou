/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class RoyaltyDetailInfos
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8188859647732127489L;
/*  10:    */   @ApiField("amount")
/*  11:    */   private Long amount;
/*  12:    */   @ApiField("amount_percentage")
/*  13:    */   private String amountPercentage;
/*  14:    */   @ApiField("batch_no")
/*  15:    */   private String batchNo;
/*  16:    */   @ApiField("desc")
/*  17:    */   private String desc;
/*  18:    */   @ApiField("out_relation_id")
/*  19:    */   private String outRelationId;
/*  20:    */   @ApiField("serial_no")
/*  21:    */   private Long serialNo;
/*  22:    */   @ApiField("trans_in")
/*  23:    */   private String transIn;
/*  24:    */   @ApiField("trans_in_type")
/*  25:    */   private String transInType;
/*  26:    */   @ApiField("trans_out")
/*  27:    */   private String transOut;
/*  28:    */   @ApiField("trans_out_type")
/*  29:    */   private String transOutType;
/*  30:    */   
/*  31:    */   public Long getAmount()
/*  32:    */   {
/*  33: 88 */     return this.amount;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setAmount(Long amount)
/*  37:    */   {
/*  38: 91 */     this.amount = amount;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getAmountPercentage()
/*  42:    */   {
/*  43: 95 */     return this.amountPercentage;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAmountPercentage(String amountPercentage)
/*  47:    */   {
/*  48: 98 */     this.amountPercentage = amountPercentage;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getBatchNo()
/*  52:    */   {
/*  53:102 */     return this.batchNo;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setBatchNo(String batchNo)
/*  57:    */   {
/*  58:105 */     this.batchNo = batchNo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getDesc()
/*  62:    */   {
/*  63:109 */     return this.desc;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setDesc(String desc)
/*  67:    */   {
/*  68:112 */     this.desc = desc;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getOutRelationId()
/*  72:    */   {
/*  73:116 */     return this.outRelationId;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setOutRelationId(String outRelationId)
/*  77:    */   {
/*  78:119 */     this.outRelationId = outRelationId;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public Long getSerialNo()
/*  82:    */   {
/*  83:123 */     return this.serialNo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setSerialNo(Long serialNo)
/*  87:    */   {
/*  88:126 */     this.serialNo = serialNo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getTransIn()
/*  92:    */   {
/*  93:130 */     return this.transIn;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setTransIn(String transIn)
/*  97:    */   {
/*  98:133 */     this.transIn = transIn;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getTransInType()
/* 102:    */   {
/* 103:137 */     return this.transInType;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setTransInType(String transInType)
/* 107:    */   {
/* 108:140 */     this.transInType = transInType;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getTransOut()
/* 112:    */   {
/* 113:144 */     return this.transOut;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setTransOut(String transOut)
/* 117:    */   {
/* 118:147 */     this.transOut = transOut;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getTransOutType()
/* 122:    */   {
/* 123:151 */     return this.transOutType;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setTransOutType(String transOutType)
/* 127:    */   {
/* 128:154 */     this.transOutType = transOutType;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RoyaltyDetailInfos
 * JD-Core Version:    0.7.0.1
 */