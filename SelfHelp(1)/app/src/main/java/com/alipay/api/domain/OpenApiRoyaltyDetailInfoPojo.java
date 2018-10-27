/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class OpenApiRoyaltyDetailInfoPojo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1473973266364719842L;
/* 10:   */   @ApiField("amount")
/* 11:   */   private Long amount;
/* 12:   */   @ApiField("amount_percentage")
/* 13:   */   private Long amountPercentage;
/* 14:   */   @ApiField("desc")
/* 15:   */   private String desc;
/* 16:   */   @ApiField("trans_in")
/* 17:   */   private String transIn;
/* 18:   */   @ApiField("trans_out")
/* 19:   */   private String transOut;
/* 20:   */   
/* 21:   */   public Long getAmount()
/* 22:   */   {
/* 23:47 */     return this.amount;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setAmount(Long amount)
/* 27:   */   {
/* 28:50 */     this.amount = amount;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public Long getAmountPercentage()
/* 32:   */   {
/* 33:54 */     return this.amountPercentage;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setAmountPercentage(Long amountPercentage)
/* 37:   */   {
/* 38:57 */     this.amountPercentage = amountPercentage;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getDesc()
/* 42:   */   {
/* 43:61 */     return this.desc;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setDesc(String desc)
/* 47:   */   {
/* 48:64 */     this.desc = desc;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getTransIn()
/* 52:   */   {
/* 53:68 */     return this.transIn;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setTransIn(String transIn)
/* 57:   */   {
/* 58:71 */     this.transIn = transIn;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getTransOut()
/* 62:   */   {
/* 63:75 */     return this.transOut;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setTransOut(String transOut)
/* 67:   */   {
/* 68:78 */     this.transOut = transOut;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OpenApiRoyaltyDetailInfoPojo
 * JD-Core Version:    0.7.0.1
 */