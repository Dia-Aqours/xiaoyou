/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class MerchantCard
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 7257653436962113761L;
/*  11:    */   @ApiField("balance")
/*  12:    */   private String balance;
/*  13:    */   @ApiField("biz_card_no")
/*  14:    */   private String bizCardNo;
/*  15:    */   @ApiField("external_card_no")
/*  16:    */   private String externalCardNo;
/*  17:    */   @ApiField("level")
/*  18:    */   private String level;
/*  19:    */   @ApiField("open_date")
/*  20:    */   private Date openDate;
/*  21:    */   @ApiField("point")
/*  22:    */   private String point;
/*  23:    */   @ApiField("valid_date")
/*  24:    */   private String validDate;
/*  25:    */   
/*  26:    */   public String getBalance()
/*  27:    */   {
/*  28: 67 */     return this.balance;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setBalance(String balance)
/*  32:    */   {
/*  33: 70 */     this.balance = balance;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getBizCardNo()
/*  37:    */   {
/*  38: 74 */     return this.bizCardNo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setBizCardNo(String bizCardNo)
/*  42:    */   {
/*  43: 77 */     this.bizCardNo = bizCardNo;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getExternalCardNo()
/*  47:    */   {
/*  48: 81 */     return this.externalCardNo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setExternalCardNo(String externalCardNo)
/*  52:    */   {
/*  53: 84 */     this.externalCardNo = externalCardNo;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getLevel()
/*  57:    */   {
/*  58: 88 */     return this.level;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setLevel(String level)
/*  62:    */   {
/*  63: 91 */     this.level = level;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public Date getOpenDate()
/*  67:    */   {
/*  68: 95 */     return this.openDate;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setOpenDate(Date openDate)
/*  72:    */   {
/*  73: 98 */     this.openDate = openDate;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getPoint()
/*  77:    */   {
/*  78:102 */     return this.point;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setPoint(String point)
/*  82:    */   {
/*  83:105 */     this.point = point;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getValidDate()
/*  87:    */   {
/*  88:109 */     return this.validDate;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setValidDate(String validDate)
/*  92:    */   {
/*  93:112 */     this.validDate = validDate;
/*  94:    */   }
/*  95:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MerchantCard
 * JD-Core Version:    0.7.0.1
 */