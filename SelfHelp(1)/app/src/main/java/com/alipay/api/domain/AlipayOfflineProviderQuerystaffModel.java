/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineProviderQuerystaffModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4382521983798515669L;
/* 10:   */   @ApiField("ope_pid")
/* 11:   */   private String opePid;
/* 12:   */   @ApiField("page_no")
/* 13:   */   private String pageNo;
/* 14:   */   @ApiField("page_size")
/* 15:   */   private String pageSize;
/* 16:   */   @ApiField("request_id")
/* 17:   */   private String requestId;
/* 18:   */   
/* 19:   */   public String getOpePid()
/* 20:   */   {
/* 21:41 */     return this.opePid;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setOpePid(String opePid)
/* 25:   */   {
/* 26:44 */     this.opePid = opePid;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getPageNo()
/* 30:   */   {
/* 31:48 */     return this.pageNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setPageNo(String pageNo)
/* 35:   */   {
/* 36:51 */     this.pageNo = pageNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getPageSize()
/* 40:   */   {
/* 41:55 */     return this.pageSize;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setPageSize(String pageSize)
/* 45:   */   {
/* 46:58 */     this.pageSize = pageSize;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getRequestId()
/* 50:   */   {
/* 51:62 */     return this.requestId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setRequestId(String requestId)
/* 55:   */   {
/* 56:65 */     this.requestId = requestId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineProviderQuerystaffModel
 * JD-Core Version:    0.7.0.1
 */