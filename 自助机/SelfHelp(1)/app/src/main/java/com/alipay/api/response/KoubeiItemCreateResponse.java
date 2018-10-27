/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiItemCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8834429319583818884L;
/* 10:   */   @ApiField("item_id")
/* 11:   */   private String itemId;
/* 12:   */   @ApiField("request_id")
/* 13:   */   private String requestId;
/* 14:   */   
/* 15:   */   public void setItemId(String itemId)
/* 16:   */   {
/* 17:30 */     this.itemId = itemId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getItemId()
/* 21:   */   {
/* 22:33 */     return this.itemId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setRequestId(String requestId)
/* 26:   */   {
/* 27:37 */     this.requestId = requestId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getRequestId()
/* 31:   */   {
/* 32:40 */     return this.requestId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiItemCreateResponse
 * JD-Core Version:    0.7.0.1
 */