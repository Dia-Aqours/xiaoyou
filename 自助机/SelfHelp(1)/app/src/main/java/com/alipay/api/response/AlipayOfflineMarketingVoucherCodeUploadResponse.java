/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketingVoucherCodeUploadResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6863587444967471765L;
/* 10:   */   @ApiField("code_inventory_id")
/* 11:   */   private String codeInventoryId;
/* 12:   */   
/* 13:   */   public void setCodeInventoryId(String codeInventoryId)
/* 14:   */   {
/* 15:24 */     this.codeInventoryId = codeInventoryId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getCodeInventoryId()
/* 19:   */   {
/* 20:27 */     return this.codeInventoryId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketingVoucherCodeUploadResponse
 * JD-Core Version:    0.7.0.1
 */