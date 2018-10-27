/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AntProdpaasArrangementCommonQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8342623317287479488L;
/* 10:   */   @ApiField("arrangement_base_selector")
/* 11:   */   private ArrangementBaseSelector arrangementBaseSelector;
/* 12:   */   @ApiField("arrangement_condition_group_selector")
/* 13:   */   private ArrangementConditionGroupSelector arrangementConditionGroupSelector;
/* 14:   */   @ApiField("arrangement_involved_party_querier")
/* 15:   */   private ArrangementInvolvedPartyQuerier arrangementInvolvedPartyQuerier;
/* 16:   */   @ApiField("arrangement_no_querier")
/* 17:   */   private ArrangementNoQuerier arrangementNoQuerier;
/* 18:   */   
/* 19:   */   public ArrangementBaseSelector getArrangementBaseSelector()
/* 20:   */   {
/* 21:41 */     return this.arrangementBaseSelector;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setArrangementBaseSelector(ArrangementBaseSelector arrangementBaseSelector)
/* 25:   */   {
/* 26:44 */     this.arrangementBaseSelector = arrangementBaseSelector;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public ArrangementConditionGroupSelector getArrangementConditionGroupSelector()
/* 30:   */   {
/* 31:48 */     return this.arrangementConditionGroupSelector;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setArrangementConditionGroupSelector(ArrangementConditionGroupSelector arrangementConditionGroupSelector)
/* 35:   */   {
/* 36:51 */     this.arrangementConditionGroupSelector = arrangementConditionGroupSelector;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public ArrangementInvolvedPartyQuerier getArrangementInvolvedPartyQuerier()
/* 40:   */   {
/* 41:55 */     return this.arrangementInvolvedPartyQuerier;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setArrangementInvolvedPartyQuerier(ArrangementInvolvedPartyQuerier arrangementInvolvedPartyQuerier)
/* 45:   */   {
/* 46:58 */     this.arrangementInvolvedPartyQuerier = arrangementInvolvedPartyQuerier;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public ArrangementNoQuerier getArrangementNoQuerier()
/* 50:   */   {
/* 51:62 */     return this.arrangementNoQuerier;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setArrangementNoQuerier(ArrangementNoQuerier arrangementNoQuerier)
/* 55:   */   {
/* 56:65 */     this.arrangementNoQuerier = arrangementNoQuerier;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AntProdpaasArrangementCommonQueryModel
 * JD-Core Version:    0.7.0.1
 */