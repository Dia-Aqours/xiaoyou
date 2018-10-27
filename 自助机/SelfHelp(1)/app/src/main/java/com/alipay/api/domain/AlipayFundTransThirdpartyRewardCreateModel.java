/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayFundTransThirdpartyRewardCreateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6464124514889385816L;
/*  10:    */   @ApiField("amount")
/*  11:    */   private String amount;
/*  12:    */   @ApiField("ext_param")
/*  13:    */   private String extParam;
/*  14:    */   @ApiField("out_no")
/*  15:    */   private String outNo;
/*  16:    */   @ApiField("receiver_user_id")
/*  17:    */   private String receiverUserId;
/*  18:    */   @ApiField("scene")
/*  19:    */   private String scene;
/*  20:    */   @ApiField("sender_user_id")
/*  21:    */   private String senderUserId;
/*  22:    */   @ApiField("title")
/*  23:    */   private String title;
/*  24:    */   
/*  25:    */   public String getAmount()
/*  26:    */   {
/*  27: 59 */     return this.amount;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setAmount(String amount)
/*  31:    */   {
/*  32: 62 */     this.amount = amount;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getExtParam()
/*  36:    */   {
/*  37: 66 */     return this.extParam;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setExtParam(String extParam)
/*  41:    */   {
/*  42: 69 */     this.extParam = extParam;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getOutNo()
/*  46:    */   {
/*  47: 73 */     return this.outNo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setOutNo(String outNo)
/*  51:    */   {
/*  52: 76 */     this.outNo = outNo;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getReceiverUserId()
/*  56:    */   {
/*  57: 80 */     return this.receiverUserId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setReceiverUserId(String receiverUserId)
/*  61:    */   {
/*  62: 83 */     this.receiverUserId = receiverUserId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getScene()
/*  66:    */   {
/*  67: 87 */     return this.scene;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setScene(String scene)
/*  71:    */   {
/*  72: 90 */     this.scene = scene;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getSenderUserId()
/*  76:    */   {
/*  77: 94 */     return this.senderUserId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setSenderUserId(String senderUserId)
/*  81:    */   {
/*  82: 97 */     this.senderUserId = senderUserId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getTitle()
/*  86:    */   {
/*  87:101 */     return this.title;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setTitle(String title)
/*  91:    */   {
/*  92:104 */     this.title = title;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayFundTransThirdpartyRewardCreateModel
 * JD-Core Version:    0.7.0.1
 */