/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class KbOrderVoucherModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 6782554837337393354L;
/*  11:    */   @ApiField("expire_date")
/*  12:    */   private Date expireDate;
/*  13:    */   @ApiField("funds_voucher_no")
/*  14:    */   private String fundsVoucherNo;
/*  15:    */   @ApiField("item_id")
/*  16:    */   private String itemId;
/*  17:    */   @ApiField("refund_reason")
/*  18:    */   private String refundReason;
/*  19:    */   @ApiField("refund_type")
/*  20:    */   private String refundType;
/*  21:    */   @ApiField("shop_id")
/*  22:    */   private String shopId;
/*  23:    */   @ApiField("status")
/*  24:    */   private String status;
/*  25:    */   @ApiField("store_id")
/*  26:    */   private String storeId;
/*  27:    */   @ApiField("voucher_id")
/*  28:    */   private String voucherId;
/*  29:    */   
/*  30:    */   public Date getExpireDate()
/*  31:    */   {
/*  32: 73 */     return this.expireDate;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setExpireDate(Date expireDate)
/*  36:    */   {
/*  37: 76 */     this.expireDate = expireDate;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getFundsVoucherNo()
/*  41:    */   {
/*  42: 80 */     return this.fundsVoucherNo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setFundsVoucherNo(String fundsVoucherNo)
/*  46:    */   {
/*  47: 83 */     this.fundsVoucherNo = fundsVoucherNo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getItemId()
/*  51:    */   {
/*  52: 87 */     return this.itemId;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setItemId(String itemId)
/*  56:    */   {
/*  57: 90 */     this.itemId = itemId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getRefundReason()
/*  61:    */   {
/*  62: 94 */     return this.refundReason;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setRefundReason(String refundReason)
/*  66:    */   {
/*  67: 97 */     this.refundReason = refundReason;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getRefundType()
/*  71:    */   {
/*  72:101 */     return this.refundType;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setRefundType(String refundType)
/*  76:    */   {
/*  77:104 */     this.refundType = refundType;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getShopId()
/*  81:    */   {
/*  82:108 */     return this.shopId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setShopId(String shopId)
/*  86:    */   {
/*  87:111 */     this.shopId = shopId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getStatus()
/*  91:    */   {
/*  92:115 */     return this.status;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setStatus(String status)
/*  96:    */   {
/*  97:118 */     this.status = status;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getStoreId()
/* 101:    */   {
/* 102:122 */     return this.storeId;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setStoreId(String storeId)
/* 106:    */   {
/* 107:125 */     this.storeId = storeId;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getVoucherId()
/* 111:    */   {
/* 112:129 */     return this.voucherId;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setVoucherId(String voucherId)
/* 116:    */   {
/* 117:132 */     this.voucherId = voucherId;
/* 118:    */   }
/* 119:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbOrderVoucherModel
 * JD-Core Version:    0.7.0.1
 */