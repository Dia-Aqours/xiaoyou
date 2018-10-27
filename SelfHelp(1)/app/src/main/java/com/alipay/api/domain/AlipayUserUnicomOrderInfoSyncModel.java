/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayUserUnicomOrderInfoSyncModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 5532886146655756445L;
/*  10:    */   @ApiField("gmt_order_change")
/*  11:    */   private String gmtOrderChange;
/*  12:    */   @ApiField("order_no")
/*  13:    */   private String orderNo;
/*  14:    */   @ApiField("order_operate_type")
/*  15:    */   private String orderOperateType;
/*  16:    */   @ApiField("phone_no")
/*  17:    */   private String phoneNo;
/*  18:    */   @ApiField("product_name")
/*  19:    */   private String productName;
/*  20:    */   @ApiField("sec_key")
/*  21:    */   private String secKey;
/*  22:    */   @ApiField("user_id")
/*  23:    */   private String userId;
/*  24:    */   
/*  25:    */   public String getGmtOrderChange()
/*  26:    */   {
/*  27: 59 */     return this.gmtOrderChange;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setGmtOrderChange(String gmtOrderChange)
/*  31:    */   {
/*  32: 62 */     this.gmtOrderChange = gmtOrderChange;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getOrderNo()
/*  36:    */   {
/*  37: 66 */     return this.orderNo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setOrderNo(String orderNo)
/*  41:    */   {
/*  42: 69 */     this.orderNo = orderNo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getOrderOperateType()
/*  46:    */   {
/*  47: 73 */     return this.orderOperateType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setOrderOperateType(String orderOperateType)
/*  51:    */   {
/*  52: 76 */     this.orderOperateType = orderOperateType;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getPhoneNo()
/*  56:    */   {
/*  57: 80 */     return this.phoneNo;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setPhoneNo(String phoneNo)
/*  61:    */   {
/*  62: 83 */     this.phoneNo = phoneNo;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getProductName()
/*  66:    */   {
/*  67: 87 */     return this.productName;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setProductName(String productName)
/*  71:    */   {
/*  72: 90 */     this.productName = productName;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getSecKey()
/*  76:    */   {
/*  77: 94 */     return this.secKey;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setSecKey(String secKey)
/*  81:    */   {
/*  82: 97 */     this.secKey = secKey;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getUserId()
/*  86:    */   {
/*  87:101 */     return this.userId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setUserId(String userId)
/*  91:    */   {
/*  92:104 */     this.userId = userId;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserUnicomOrderInfoSyncModel
 * JD-Core Version:    0.7.0.1
 */