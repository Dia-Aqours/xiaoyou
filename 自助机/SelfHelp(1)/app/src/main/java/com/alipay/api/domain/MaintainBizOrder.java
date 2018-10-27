/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class MaintainBizOrder
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3352567656838151981L;
/*  10:    */   @ApiField("origin_cost")
/*  11:    */   private String originCost;
/*  12:    */   @ApiField("out_product_id")
/*  13:    */   private String outProductId;
/*  14:    */   @ApiField("real_cost")
/*  15:    */   private String realCost;
/*  16:    */   @ApiField("sale_num")
/*  17:    */   private Long saleNum;
/*  18:    */   @ApiField("service_category_id")
/*  19:    */   private Long serviceCategoryId;
/*  20:    */   
/*  21:    */   public String getOriginCost()
/*  22:    */   {
/*  23: 82 */     return this.originCost;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void setOriginCost(String originCost)
/*  27:    */   {
/*  28: 85 */     this.originCost = originCost;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getOutProductId()
/*  32:    */   {
/*  33: 89 */     return this.outProductId;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setOutProductId(String outProductId)
/*  37:    */   {
/*  38: 92 */     this.outProductId = outProductId;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getRealCost()
/*  42:    */   {
/*  43: 96 */     return this.realCost;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setRealCost(String realCost)
/*  47:    */   {
/*  48: 99 */     this.realCost = realCost;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public Long getSaleNum()
/*  52:    */   {
/*  53:103 */     return this.saleNum;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setSaleNum(Long saleNum)
/*  57:    */   {
/*  58:106 */     this.saleNum = saleNum;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public Long getServiceCategoryId()
/*  62:    */   {
/*  63:110 */     return this.serviceCategoryId;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setServiceCategoryId(Long serviceCategoryId)
/*  67:    */   {
/*  68:113 */     this.serviceCategoryId = serviceCategoryId;
/*  69:    */   }
/*  70:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MaintainBizOrder
 * JD-Core Version:    0.7.0.1
 */