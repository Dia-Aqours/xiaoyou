/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CustomsDeclareRecordInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayTradeCustomsQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 6656329469217835461L;
/* 13:   */   @ApiField("not_found")
/* 14:   */   private String notFound;
/* 15:   */   @ApiListField("records")
/* 16:   */   @ApiField("customs_declare_record_info")
/* 17:   */   private List<CustomsDeclareRecordInfo> records;
/* 18:   */   
/* 19:   */   public void setNotFound(String notFound)
/* 20:   */   {
/* 21:34 */     this.notFound = notFound;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getNotFound()
/* 25:   */   {
/* 26:37 */     return this.notFound;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setRecords(List<CustomsDeclareRecordInfo> records)
/* 30:   */   {
/* 31:41 */     this.records = records;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public List<CustomsDeclareRecordInfo> getRecords()
/* 35:   */   {
/* 36:44 */     return this.records;
/* 37:   */   }
/* 38:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayTradeCustomsQueryResponse
 * JD-Core Version:    0.7.0.1
 */