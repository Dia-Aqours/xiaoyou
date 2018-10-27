/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class YLBTransDetailInfo
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 1371191972675993416L;
/*  11:    */   @ApiField("amount")
/*  12:    */   private String amount;
/*  13:    */   @ApiField("biz_no")
/*  14:    */   private String bizNo;
/*  15:    */   @ApiField("memo")
/*  16:    */   private String memo;
/*  17:    */   @ApiField("trans_account_date")
/*  18:    */   private Date transAccountDate;
/*  19:    */   @ApiField("trans_date")
/*  20:    */   private Date transDate;
/*  21:    */   @ApiField("trans_name")
/*  22:    */   private String transName;
/*  23:    */   @ApiField("trans_status")
/*  24:    */   private String transStatus;
/*  25:    */   @ApiField("trans_type")
/*  26:    */   private String transType;
/*  27:    */   
/*  28:    */   public String getAmount()
/*  29:    */   {
/*  30: 67 */     return this.amount;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setAmount(String amount)
/*  34:    */   {
/*  35: 70 */     this.amount = amount;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getBizNo()
/*  39:    */   {
/*  40: 74 */     return this.bizNo;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setBizNo(String bizNo)
/*  44:    */   {
/*  45: 77 */     this.bizNo = bizNo;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getMemo()
/*  49:    */   {
/*  50: 81 */     return this.memo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setMemo(String memo)
/*  54:    */   {
/*  55: 84 */     this.memo = memo;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public Date getTransAccountDate()
/*  59:    */   {
/*  60: 88 */     return this.transAccountDate;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setTransAccountDate(Date transAccountDate)
/*  64:    */   {
/*  65: 91 */     this.transAccountDate = transAccountDate;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public Date getTransDate()
/*  69:    */   {
/*  70: 95 */     return this.transDate;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setTransDate(Date transDate)
/*  74:    */   {
/*  75: 98 */     this.transDate = transDate;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getTransName()
/*  79:    */   {
/*  80:102 */     return this.transName;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setTransName(String transName)
/*  84:    */   {
/*  85:105 */     this.transName = transName;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getTransStatus()
/*  89:    */   {
/*  90:109 */     return this.transStatus;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setTransStatus(String transStatus)
/*  94:    */   {
/*  95:112 */     this.transStatus = transStatus;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getTransType()
/*  99:    */   {
/* 100:116 */     return this.transType;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setTransType(String transType)
/* 104:    */   {
/* 105:119 */     this.transType = transType;
/* 106:    */   }
/* 107:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.YLBTransDetailInfo
 * JD-Core Version:    0.7.0.1
 */