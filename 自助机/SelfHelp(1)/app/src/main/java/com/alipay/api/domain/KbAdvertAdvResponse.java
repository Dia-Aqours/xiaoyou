/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbAdvertAdvResponse
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2878227819432742725L;
/* 10:   */   @ApiField("adv_id")
/* 11:   */   private String advId;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   @ApiField("single_voucher")
/* 15:   */   private KbAdvertAdvSingleVoucherResponse singleVoucher;
/* 16:   */   @ApiField("type")
/* 17:   */   private String type;
/* 18:   */   
/* 19:   */   public String getAdvId()
/* 20:   */   {
/* 21:42 */     return this.advId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAdvId(String advId)
/* 25:   */   {
/* 26:45 */     this.advId = advId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getName()
/* 30:   */   {
/* 31:49 */     return this.name;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setName(String name)
/* 35:   */   {
/* 36:52 */     this.name = name;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public KbAdvertAdvSingleVoucherResponse getSingleVoucher()
/* 40:   */   {
/* 41:56 */     return this.singleVoucher;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setSingleVoucher(KbAdvertAdvSingleVoucherResponse singleVoucher)
/* 45:   */   {
/* 46:59 */     this.singleVoucher = singleVoucher;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getType()
/* 50:   */   {
/* 51:63 */     return this.type;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setType(String type)
/* 55:   */   {
/* 56:66 */     this.type = type;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertAdvResponse
 * JD-Core Version:    0.7.0.1
 */