/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayTradeBatchRefundModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5278447439635245934L;
/* 12:   */   @ApiField("batch_no")
/* 13:   */   private String batchNo;
/* 14:   */   @ApiField("batch_num")
/* 15:   */   private String batchNum;
/* 16:   */   @ApiListField("detail_data")
/* 17:   */   @ApiField("refund_detail")
/* 18:   */   private List<RefundDetail> detailData;
/* 19:   */   @ApiField("refund_date")
/* 20:   */   private String refundDate;
/* 21:   */   @ApiField("use_freeze_amount")
/* 22:   */   private String useFreezeAmount;
/* 23:   */   
/* 24:   */   public String getBatchNo()
/* 25:   */   {
/* 26:56 */     return this.batchNo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setBatchNo(String batchNo)
/* 30:   */   {
/* 31:59 */     this.batchNo = batchNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getBatchNum()
/* 35:   */   {
/* 36:63 */     return this.batchNum;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setBatchNum(String batchNum)
/* 40:   */   {
/* 41:66 */     this.batchNum = batchNum;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public List<RefundDetail> getDetailData()
/* 45:   */   {
/* 46:70 */     return this.detailData;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setDetailData(List<RefundDetail> detailData)
/* 50:   */   {
/* 51:73 */     this.detailData = detailData;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getRefundDate()
/* 55:   */   {
/* 56:77 */     return this.refundDate;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setRefundDate(String refundDate)
/* 60:   */   {
/* 61:80 */     this.refundDate = refundDate;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String getUseFreezeAmount()
/* 65:   */   {
/* 66:84 */     return this.useFreezeAmount;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setUseFreezeAmount(String useFreezeAmount)
/* 70:   */   {
/* 71:87 */     this.useFreezeAmount = useFreezeAmount;
/* 72:   */   }
/* 73:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeBatchRefundModel
 * JD-Core Version:    0.7.0.1
 */