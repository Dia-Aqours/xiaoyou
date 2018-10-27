/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayOfflineTrade
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 2726137428838728278L;
/*  13:    */   @ApiField("actual_order_time")
/*  14:    */   private Date actualOrderTime;
/*  15:    */   @ApiField("amount")
/*  16:    */   private String amount;
/*  17:    */   @ApiField("order_biz_context")
/*  18:    */   private String orderBizContext;
/*  19:    */   @ApiField("out_trade_no")
/*  20:    */   private String outTradeNo;
/*  21:    */   @ApiListField("records")
/*  22:    */   @ApiField("string")
/*  23:    */   private List<String> records;
/*  24:    */   @ApiField("seller_login_name")
/*  25:    */   private String sellerLoginName;
/*  26:    */   @ApiField("subject")
/*  27:    */   private String subject;
/*  28:    */   @ApiField("user_id")
/*  29:    */   private String userId;
/*  30:    */   
/*  31:    */   public Date getActualOrderTime()
/*  32:    */   {
/*  33: 70 */     return this.actualOrderTime;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setActualOrderTime(Date actualOrderTime)
/*  37:    */   {
/*  38: 73 */     this.actualOrderTime = actualOrderTime;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getAmount()
/*  42:    */   {
/*  43: 77 */     return this.amount;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAmount(String amount)
/*  47:    */   {
/*  48: 80 */     this.amount = amount;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getOrderBizContext()
/*  52:    */   {
/*  53: 84 */     return this.orderBizContext;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setOrderBizContext(String orderBizContext)
/*  57:    */   {
/*  58: 87 */     this.orderBizContext = orderBizContext;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getOutTradeNo()
/*  62:    */   {
/*  63: 91 */     return this.outTradeNo;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setOutTradeNo(String outTradeNo)
/*  67:    */   {
/*  68: 94 */     this.outTradeNo = outTradeNo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public List<String> getRecords()
/*  72:    */   {
/*  73: 98 */     return this.records;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setRecords(List<String> records)
/*  77:    */   {
/*  78:101 */     this.records = records;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getSellerLoginName()
/*  82:    */   {
/*  83:105 */     return this.sellerLoginName;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setSellerLoginName(String sellerLoginName)
/*  87:    */   {
/*  88:108 */     this.sellerLoginName = sellerLoginName;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getSubject()
/*  92:    */   {
/*  93:112 */     return this.subject;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setSubject(String subject)
/*  97:    */   {
/*  98:115 */     this.subject = subject;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getUserId()
/* 102:    */   {
/* 103:119 */     return this.userId;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setUserId(String userId)
/* 107:    */   {
/* 108:122 */     this.userId = userId;
/* 109:    */   }
/* 110:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineTrade
 * JD-Core Version:    0.7.0.1
 */