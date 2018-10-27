/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbAdvertAdvSingleVoucherResponse
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4151192324836553813L;
/* 10:   */   @ApiField("content")
/* 11:   */   private KbAdvertAdvContent content;
/* 12:   */   @ApiField("voucher")
/* 13:   */   private KbAdvertSubjectVoucherResponse voucher;
/* 14:   */   
/* 15:   */   public KbAdvertAdvContent getContent()
/* 16:   */   {
/* 17:29 */     return this.content;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setContent(KbAdvertAdvContent content)
/* 21:   */   {
/* 22:32 */     this.content = content;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public KbAdvertSubjectVoucherResponse getVoucher()
/* 26:   */   {
/* 27:36 */     return this.voucher;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setVoucher(KbAdvertSubjectVoucherResponse voucher)
/* 31:   */   {
/* 32:39 */     this.voucher = voucher;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertAdvSingleVoucherResponse
 * JD-Core Version:    0.7.0.1
 */