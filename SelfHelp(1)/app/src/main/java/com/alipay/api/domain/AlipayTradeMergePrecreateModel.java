/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayTradeMergePrecreateModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2678488112492235496L;
/* 12:   */   @ApiListField("order_details")
/* 13:   */   @ApiField("order_detail")
/* 14:   */   private List<OrderDetail> orderDetails;
/* 15:   */   @ApiField("out_merge_no")
/* 16:   */   private String outMergeNo;
/* 17:   */   @ApiField("timeout_express")
/* 18:   */   private String timeoutExpress;
/* 19:   */   
/* 20:   */   public List<OrderDetail> getOrderDetails()
/* 21:   */   {
/* 22:40 */     return this.orderDetails;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setOrderDetails(List<OrderDetail> orderDetails)
/* 26:   */   {
/* 27:43 */     this.orderDetails = orderDetails;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getOutMergeNo()
/* 31:   */   {
/* 32:47 */     return this.outMergeNo;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setOutMergeNo(String outMergeNo)
/* 36:   */   {
/* 37:50 */     this.outMergeNo = outMergeNo;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getTimeoutExpress()
/* 41:   */   {
/* 42:54 */     return this.timeoutExpress;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setTimeoutExpress(String timeoutExpress)
/* 46:   */   {
/* 47:57 */     this.timeoutExpress = timeoutExpress;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeMergePrecreateModel
 * JD-Core Version:    0.7.0.1
 */