/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class VoucherDetail
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7213298944155397762L;
/*  10:    */   @ApiField("amount")
/*  11:    */   private String amount;
/*  12:    */   @ApiField("id")
/*  13:    */   private String id;
/*  14:    */   @ApiField("memo")
/*  15:    */   private String memo;
/*  16:    */   @ApiField("merchant_contribute")
/*  17:    */   private String merchantContribute;
/*  18:    */   @ApiField("name")
/*  19:    */   private String name;
/*  20:    */   @ApiField("other_contribute")
/*  21:    */   private String otherContribute;
/*  22:    */   @ApiField("type")
/*  23:    */   private String type;
/*  24:    */   
/*  25:    */   public String getAmount()
/*  26:    */   {
/*  27: 63 */     return this.amount;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setAmount(String amount)
/*  31:    */   {
/*  32: 66 */     this.amount = amount;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getId()
/*  36:    */   {
/*  37: 70 */     return this.id;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setId(String id)
/*  41:    */   {
/*  42: 73 */     this.id = id;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getMemo()
/*  46:    */   {
/*  47: 77 */     return this.memo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setMemo(String memo)
/*  51:    */   {
/*  52: 80 */     this.memo = memo;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getMerchantContribute()
/*  56:    */   {
/*  57: 84 */     return this.merchantContribute;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setMerchantContribute(String merchantContribute)
/*  61:    */   {
/*  62: 87 */     this.merchantContribute = merchantContribute;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getName()
/*  66:    */   {
/*  67: 91 */     return this.name;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setName(String name)
/*  71:    */   {
/*  72: 94 */     this.name = name;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getOtherContribute()
/*  76:    */   {
/*  77: 98 */     return this.otherContribute;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setOtherContribute(String otherContribute)
/*  81:    */   {
/*  82:101 */     this.otherContribute = otherContribute;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getType()
/*  86:    */   {
/*  87:105 */     return this.type;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setType(String type)
/*  91:    */   {
/*  92:108 */     this.type = type;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.VoucherDetail
 * JD-Core Version:    0.7.0.1
 */