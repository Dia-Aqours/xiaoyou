/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayOfflineMarketShopPublicBindResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2666443945536157184L;
/* 12:   */   @ApiListField("error_binding_shop_ids")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> errorBindingShopIds;
/* 15:   */   @ApiField("total_error")
/* 16:   */   private Long totalError;
/* 17:   */   @ApiField("total_success")
/* 18:   */   private Long totalSuccess;
/* 19:   */   
/* 20:   */   public void setErrorBindingShopIds(List<String> errorBindingShopIds)
/* 21:   */   {
/* 22:39 */     this.errorBindingShopIds = errorBindingShopIds;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public List<String> getErrorBindingShopIds()
/* 26:   */   {
/* 27:42 */     return this.errorBindingShopIds;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setTotalError(Long totalError)
/* 31:   */   {
/* 32:46 */     this.totalError = totalError;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public Long getTotalError()
/* 36:   */   {
/* 37:49 */     return this.totalError;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setTotalSuccess(Long totalSuccess)
/* 41:   */   {
/* 42:53 */     this.totalSuccess = totalSuccess;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public Long getTotalSuccess()
/* 46:   */   {
/* 47:56 */     return this.totalSuccess;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketShopPublicBindResponse
 * JD-Core Version:    0.7.0.1
 */