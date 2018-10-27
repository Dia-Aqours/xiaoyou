/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;

/*   6:    */
/*   7:    */ public class KbOrderFundsVoucherModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 8485846983778352337L;
/*  11:    */   @ApiField("account")
/*  12:    */   private String account;
/*  13:    */   @ApiField("amount")
/*  14:    */   private String amount;
/*  15:    */   @ApiField("funds_voucher_no")
/*  16:    */   private String fundsVoucherNo;
/*  17:    */   @ApiField("gmt_create")
/*  18:    */   private Date gmtCreate;
/*  19:    */   @ApiField("shop_id")
/*  20:    */   private String shopId;
/*  21:    */   @ApiField("store_id")
/*  22:    */   private String storeId;
/*  23:    */   @ApiField("trans_type")
/*  24:    */   private String transType;
/*  25:    */   
/*  26:    */   public String getAccount()
/*  27:    */   {
/*  28: 61 */     return this.account;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setAccount(String account)
/*  32:    */   {
/*  33: 64 */     this.account = account;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getAmount()
/*  37:    */   {
/*  38: 68 */     return this.amount;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setAmount(String amount)
/*  42:    */   {
/*  43: 71 */     this.amount = amount;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getFundsVoucherNo()
/*  47:    */   {
/*  48: 75 */     return this.fundsVoucherNo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setFundsVoucherNo(String fundsVoucherNo)
/*  52:    */   {
/*  53: 78 */     this.fundsVoucherNo = fundsVoucherNo;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public Date getGmtCreate()
/*  57:    */   {
/*  58: 82 */     return this.gmtCreate;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setGmtCreate(Date gmtCreate)
/*  62:    */   {
/*  63: 85 */     this.gmtCreate = gmtCreate;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getShopId()
/*  67:    */   {
/*  68: 89 */     return this.shopId;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setShopId(String shopId)
/*  72:    */   {
/*  73: 92 */     this.shopId = shopId;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getStoreId()
/*  77:    */   {
/*  78: 96 */     return this.storeId;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setStoreId(String storeId)
/*  82:    */   {
/*  83: 99 */     this.storeId = storeId;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getTransType()
/*  87:    */   {
/*  88:103 */     return this.transType;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setTransType(String transType)
/*  92:    */   {
/*  93:106 */     this.transType = transType;
/*  94:    */   }
/*  95:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KbOrderFundsVoucherModel

 * JD-Core Version:    0.7.0.1

 */