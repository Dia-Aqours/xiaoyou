/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlipayOfflinePayMasterKey;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayCommerceTransportOfflinepayKeyQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 2698429768795373198L;
/* 13:   */   @ApiListField("keys")
/* 14:   */   @ApiField("alipay_offline_pay_master_key")
/* 15:   */   private List<AlipayOfflinePayMasterKey> keys;
/* 16:   */   
/* 17:   */   public void setKeys(List<AlipayOfflinePayMasterKey> keys)
/* 18:   */   {
/* 19:28 */     this.keys = keys;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<AlipayOfflinePayMasterKey> getKeys()
/* 23:   */   {
/* 24:31 */     return this.keys;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayCommerceTransportOfflinepayKeyQueryResponse
 * JD-Core Version:    0.7.0.1
 */