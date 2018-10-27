/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KoubeiTradeVoucherItemTemplete
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6642538643217447731L;
/* 12:   */   @ApiListField("buyer_notes")
/* 13:   */   @ApiField("koubei_item_description")
/* 14:   */   private List<KoubeiItemDescription> buyerNotes;
/* 15:   */   @ApiField("validity_period")
/* 16:   */   private String validityPeriod;
/* 17:   */   
/* 18:   */   public List<KoubeiItemDescription> getBuyerNotes()
/* 19:   */   {
/* 20:33 */     return this.buyerNotes;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setBuyerNotes(List<KoubeiItemDescription> buyerNotes)
/* 24:   */   {
/* 25:36 */     this.buyerNotes = buyerNotes;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getValidityPeriod()
/* 29:   */   {
/* 30:40 */     return this.validityPeriod;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setValidityPeriod(String validityPeriod)
/* 34:   */   {
/* 35:43 */     this.validityPeriod = validityPeriod;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiTradeVoucherItemTemplete
 * JD-Core Version:    0.7.0.1
 */