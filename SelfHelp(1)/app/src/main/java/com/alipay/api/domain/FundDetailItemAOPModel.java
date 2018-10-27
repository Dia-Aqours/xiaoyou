/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class FundDetailItemAOPModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 7816952486534515696L;
/* 12:   */   @ApiListField("single_fund_detail_item_aopmodel_list")
/* 13:   */   @ApiField("single_fund_detail_item_a_o_p_model")
/* 14:   */   private List<SingleFundDetailItemAOPModel> singleFundDetailItemAopmodelList;
/* 15:   */   
/* 16:   */   public List<SingleFundDetailItemAOPModel> getSingleFundDetailItemAopmodelList()
/* 17:   */   {
/* 18:27 */     return this.singleFundDetailItemAopmodelList;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setSingleFundDetailItemAopmodelList(List<SingleFundDetailItemAOPModel> singleFundDetailItemAopmodelList)
/* 22:   */   {
/* 23:30 */     this.singleFundDetailItemAopmodelList = singleFundDetailItemAopmodelList;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.FundDetailItemAOPModel
 * JD-Core Version:    0.7.0.1
 */