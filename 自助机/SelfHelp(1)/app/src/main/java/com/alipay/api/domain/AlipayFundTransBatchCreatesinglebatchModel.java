/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayFundTransBatchCreatesinglebatchModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4453568477275573182L;
/*  10:    */   @ApiField("batch_memo")
/*  11:    */   private String batchMemo;
/*  12:    */   @ApiField("biz_type")
/*  13:    */   private String bizType;
/*  14:    */   @ApiField("create_user_id")
/*  15:    */   private String createUserId;
/*  16:    */   @ApiField("ext_param")
/*  17:    */   private String extParam;
/*  18:    */   @ApiField("pay_amount_single")
/*  19:    */   private String payAmountSingle;
/*  20:    */   @ApiField("pay_amount_total")
/*  21:    */   private String payAmountTotal;
/*  22:    */   @ApiField("real_items_total")
/*  23:    */   private String realItemsTotal;
/*  24:    */   @ApiField("show_items_total")
/*  25:    */   private String showItemsTotal;
/*  26:    */   
/*  27:    */   public String getBatchMemo()
/*  28:    */   {
/*  29: 65 */     return this.batchMemo;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setBatchMemo(String batchMemo)
/*  33:    */   {
/*  34: 68 */     this.batchMemo = batchMemo;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getBizType()
/*  38:    */   {
/*  39: 72 */     return this.bizType;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setBizType(String bizType)
/*  43:    */   {
/*  44: 75 */     this.bizType = bizType;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getCreateUserId()
/*  48:    */   {
/*  49: 79 */     return this.createUserId;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setCreateUserId(String createUserId)
/*  53:    */   {
/*  54: 82 */     this.createUserId = createUserId;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getExtParam()
/*  58:    */   {
/*  59: 86 */     return this.extParam;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setExtParam(String extParam)
/*  63:    */   {
/*  64: 89 */     this.extParam = extParam;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getPayAmountSingle()
/*  68:    */   {
/*  69: 93 */     return this.payAmountSingle;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setPayAmountSingle(String payAmountSingle)
/*  73:    */   {
/*  74: 96 */     this.payAmountSingle = payAmountSingle;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getPayAmountTotal()
/*  78:    */   {
/*  79:100 */     return this.payAmountTotal;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setPayAmountTotal(String payAmountTotal)
/*  83:    */   {
/*  84:103 */     this.payAmountTotal = payAmountTotal;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getRealItemsTotal()
/*  88:    */   {
/*  89:107 */     return this.realItemsTotal;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setRealItemsTotal(String realItemsTotal)
/*  93:    */   {
/*  94:110 */     this.realItemsTotal = realItemsTotal;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getShowItemsTotal()
/*  98:    */   {
/*  99:114 */     return this.showItemsTotal;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setShowItemsTotal(String showItemsTotal)
/* 103:    */   {
/* 104:117 */     this.showItemsTotal = showItemsTotal;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayFundTransBatchCreatesinglebatchModel
 * JD-Core Version:    0.7.0.1
 */