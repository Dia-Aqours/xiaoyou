/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEcoMycarMaintainOrderCreateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7527758159197883555L;
/*  10:    */   @ApiField("biz_status")
/*  11:    */   private String bizStatus;
/*  12:    */   @ApiField("biz_status_txt")
/*  13:    */   private String bizStatusTxt;
/*  14:    */   @ApiField("ext_param")
/*  15:    */   private String extParam;
/*  16:    */   @ApiField("out_order_no")
/*  17:    */   private String outOrderNo;
/*  18:    */   @ApiField("subject")
/*  19:    */   private String subject;
/*  20:    */   @ApiField("summary")
/*  21:    */   private String summary;
/*  22:    */   @ApiField("total_fee")
/*  23:    */   private String totalFee;
/*  24:    */   @ApiField("user_id")
/*  25:    */   private String userId;
/*  26:    */   
/*  27:    */   public String getBizStatus()
/*  28:    */   {
/*  29: 67 */     return this.bizStatus;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setBizStatus(String bizStatus)
/*  33:    */   {
/*  34: 70 */     this.bizStatus = bizStatus;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getBizStatusTxt()
/*  38:    */   {
/*  39: 74 */     return this.bizStatusTxt;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setBizStatusTxt(String bizStatusTxt)
/*  43:    */   {
/*  44: 77 */     this.bizStatusTxt = bizStatusTxt;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getExtParam()
/*  48:    */   {
/*  49: 81 */     return this.extParam;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setExtParam(String extParam)
/*  53:    */   {
/*  54: 84 */     this.extParam = extParam;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getOutOrderNo()
/*  58:    */   {
/*  59: 88 */     return this.outOrderNo;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setOutOrderNo(String outOrderNo)
/*  63:    */   {
/*  64: 91 */     this.outOrderNo = outOrderNo;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getSubject()
/*  68:    */   {
/*  69: 95 */     return this.subject;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setSubject(String subject)
/*  73:    */   {
/*  74: 98 */     this.subject = subject;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getSummary()
/*  78:    */   {
/*  79:102 */     return this.summary;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setSummary(String summary)
/*  83:    */   {
/*  84:105 */     this.summary = summary;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTotalFee()
/*  88:    */   {
/*  89:109 */     return this.totalFee;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTotalFee(String totalFee)
/*  93:    */   {
/*  94:112 */     this.totalFee = totalFee;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getUserId()
/*  98:    */   {
/*  99:116 */     return this.userId;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setUserId(String userId)
/* 103:    */   {
/* 104:119 */     this.userId = userId;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainOrderCreateModel
 * JD-Core Version:    0.7.0.1
 */