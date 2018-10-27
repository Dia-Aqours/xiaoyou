/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ZmWatchListDetail;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class ZhimaCreditWatchlistiiGetResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 5723527531846877728L;
/* 13:   */   @ApiField("biz_no")
/* 14:   */   private String bizNo;
/* 15:   */   @ApiListField("details")
/* 16:   */   @ApiField("zm_watch_list_detail")
/* 17:   */   private List<ZmWatchListDetail> details;
/* 18:   */   @ApiField("is_matched")
/* 19:   */   private Boolean isMatched;
/* 20:   */   
/* 21:   */   public void setBizNo(String bizNo)
/* 22:   */   {
/* 23:41 */     this.bizNo = bizNo;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getBizNo()
/* 27:   */   {
/* 28:44 */     return this.bizNo;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setDetails(List<ZmWatchListDetail> details)
/* 32:   */   {
/* 33:48 */     this.details = details;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public List<ZmWatchListDetail> getDetails()
/* 37:   */   {
/* 38:51 */     return this.details;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setIsMatched(Boolean isMatched)
/* 42:   */   {
/* 43:55 */     this.isMatched = isMatched;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public Boolean getIsMatched()
/* 47:   */   {
/* 48:58 */     return this.isMatched;
/* 49:   */   }
/* 50:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.ZhimaCreditWatchlistiiGetResponse
 * JD-Core Version:    0.7.0.1
 */