/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class SingleFundDetailItemAOPModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4184533725365719236L;
/* 12:   */   @ApiListField("batch_fund_item_model_list")
/* 13:   */   @ApiField("batch_fund_item_a_o_p_model")
/* 14:   */   private List<BatchFundItemAOPModel> batchFundItemModelList;
/* 15:   */   @ApiField("consume_record")
/* 16:   */   private ConsumeRecordAOPModel consumeRecord;
/* 17:   */   
/* 18:   */   public List<BatchFundItemAOPModel> getBatchFundItemModelList()
/* 19:   */   {
/* 20:33 */     return this.batchFundItemModelList;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setBatchFundItemModelList(List<BatchFundItemAOPModel> batchFundItemModelList)
/* 24:   */   {
/* 25:36 */     this.batchFundItemModelList = batchFundItemModelList;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public ConsumeRecordAOPModel getConsumeRecord()
/* 29:   */   {
/* 30:40 */     return this.consumeRecord;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setConsumeRecord(ConsumeRecordAOPModel consumeRecord)
/* 34:   */   {
/* 35:43 */     this.consumeRecord = consumeRecord;
/* 36:   */   }
/* 37:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.SingleFundDetailItemAOPModel

 * JD-Core Version:    0.7.0.1

 */