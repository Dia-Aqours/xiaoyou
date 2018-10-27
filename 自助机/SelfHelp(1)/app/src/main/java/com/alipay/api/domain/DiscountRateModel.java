/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class DiscountRateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4893894998372137275L;
/*  10:    */   @ApiField("discount_dst_camp_prize_model")
/*  11:    */   private DiscountDstCampPrizeModel discountDstCampPrizeModel;
/*  12:    */   @ApiField("lower_trade_fee")
/*  13:    */   private String lowerTradeFee;
/*  14:    */   @ApiField("prize_type")
/*  15:    */   private String prizeType;
/*  16:    */   @ApiField("reduce_dst_camp_prize_model")
/*  17:    */   private ReduceDstCampPrizeModel reduceDstCampPrizeModel;
/*  18:    */   @ApiField("reduce_to_amt_dst_camp_prize_model")
/*  19:    */   private ReduceToAmtDstCampPrizeModel reduceToAmtDstCampPrizeModel;
/*  20:    */   @ApiField("single_dst_camp_prize_model")
/*  21:    */   private SingleDstCampPrizeModel singleDstCampPrizeModel;
/*  22:    */   @ApiField("upper_trade_fee")
/*  23:    */   private String upperTradeFee;
/*  24:    */   
/*  25:    */   public DiscountDstCampPrizeModel getDiscountDstCampPrizeModel()
/*  26:    */   {
/*  27: 64 */     return this.discountDstCampPrizeModel;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setDiscountDstCampPrizeModel(DiscountDstCampPrizeModel discountDstCampPrizeModel)
/*  31:    */   {
/*  32: 67 */     this.discountDstCampPrizeModel = discountDstCampPrizeModel;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getLowerTradeFee()
/*  36:    */   {
/*  37: 71 */     return this.lowerTradeFee;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setLowerTradeFee(String lowerTradeFee)
/*  41:    */   {
/*  42: 74 */     this.lowerTradeFee = lowerTradeFee;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getPrizeType()
/*  46:    */   {
/*  47: 78 */     return this.prizeType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setPrizeType(String prizeType)
/*  51:    */   {
/*  52: 81 */     this.prizeType = prizeType;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public ReduceDstCampPrizeModel getReduceDstCampPrizeModel()
/*  56:    */   {
/*  57: 85 */     return this.reduceDstCampPrizeModel;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setReduceDstCampPrizeModel(ReduceDstCampPrizeModel reduceDstCampPrizeModel)
/*  61:    */   {
/*  62: 88 */     this.reduceDstCampPrizeModel = reduceDstCampPrizeModel;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public ReduceToAmtDstCampPrizeModel getReduceToAmtDstCampPrizeModel()
/*  66:    */   {
/*  67: 92 */     return this.reduceToAmtDstCampPrizeModel;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setReduceToAmtDstCampPrizeModel(ReduceToAmtDstCampPrizeModel reduceToAmtDstCampPrizeModel)
/*  71:    */   {
/*  72: 95 */     this.reduceToAmtDstCampPrizeModel = reduceToAmtDstCampPrizeModel;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public SingleDstCampPrizeModel getSingleDstCampPrizeModel()
/*  76:    */   {
/*  77: 99 */     return this.singleDstCampPrizeModel;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setSingleDstCampPrizeModel(SingleDstCampPrizeModel singleDstCampPrizeModel)
/*  81:    */   {
/*  82:102 */     this.singleDstCampPrizeModel = singleDstCampPrizeModel;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getUpperTradeFee()
/*  86:    */   {
/*  87:106 */     return this.upperTradeFee;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setUpperTradeFee(String upperTradeFee)
/*  91:    */   {
/*  92:109 */     this.upperTradeFee = upperTradeFee;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.DiscountRateModel
 * JD-Core Version:    0.7.0.1
 */