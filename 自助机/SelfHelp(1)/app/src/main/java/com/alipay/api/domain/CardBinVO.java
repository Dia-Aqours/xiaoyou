/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class CardBinVO
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7741555925436765778L;
/*  10:    */   @ApiField("card_alias")
/*  11:    */   private String cardAlias;
/*  12:    */   @ApiField("card_bin_value")
/*  13:    */   private String cardBinValue;
/*  14:    */   @ApiField("card_type_vo")
/*  15:    */   private CardTypeVO cardTypeVo;
/*  16:    */   @ApiField("domain_vo")
/*  17:    */   private CardDomainVO domainVo;
/*  18:    */   @ApiField("inst_id")
/*  19:    */   private String instId;
/*  20:    */   @ApiField("inst_len")
/*  21:    */   private String instLen;
/*  22:    */   @ApiField("memo")
/*  23:    */   private String memo;
/*  24:    */   @ApiField("operator")
/*  25:    */   private String operator;
/*  26:    */   @ApiField("version")
/*  27:    */   private String version;
/*  28:    */   
/*  29:    */   public String getCardAlias()
/*  30:    */   {
/*  31: 71 */     return this.cardAlias;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setCardAlias(String cardAlias)
/*  35:    */   {
/*  36: 74 */     this.cardAlias = cardAlias;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getCardBinValue()
/*  40:    */   {
/*  41: 78 */     return this.cardBinValue;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setCardBinValue(String cardBinValue)
/*  45:    */   {
/*  46: 81 */     this.cardBinValue = cardBinValue;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public CardTypeVO getCardTypeVo()
/*  50:    */   {
/*  51: 85 */     return this.cardTypeVo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setCardTypeVo(CardTypeVO cardTypeVo)
/*  55:    */   {
/*  56: 88 */     this.cardTypeVo = cardTypeVo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public CardDomainVO getDomainVo()
/*  60:    */   {
/*  61: 92 */     return this.domainVo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setDomainVo(CardDomainVO domainVo)
/*  65:    */   {
/*  66: 95 */     this.domainVo = domainVo;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getInstId()
/*  70:    */   {
/*  71: 99 */     return this.instId;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setInstId(String instId)
/*  75:    */   {
/*  76:102 */     this.instId = instId;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getInstLen()
/*  80:    */   {
/*  81:106 */     return this.instLen;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setInstLen(String instLen)
/*  85:    */   {
/*  86:109 */     this.instLen = instLen;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getMemo()
/*  90:    */   {
/*  91:113 */     return this.memo;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setMemo(String memo)
/*  95:    */   {
/*  96:116 */     this.memo = memo;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getOperator()
/* 100:    */   {
/* 101:120 */     return this.operator;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setOperator(String operator)
/* 105:    */   {
/* 106:123 */     this.operator = operator;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getVersion()
/* 110:    */   {
/* 111:127 */     return this.version;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setVersion(String version)
/* 115:    */   {
/* 116:130 */     this.version = version;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CardBinVO
 * JD-Core Version:    0.7.0.1
 */