/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.MerchantSaleLeadsQueryDTO;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;

/*  8:   */
/*  9:   */ public class AlipayOfflineSaleleadsQuerybyidsResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 3277214934236562971L;
/* 13:   */   @ApiListField("merchantsaleleadsquerylist")
/* 14:   */   @ApiField("merchant_sale_leads_query_d_t_o")
/* 15:   */   private List<MerchantSaleLeadsQueryDTO> merchantsaleleadsquerylist;
/* 16:   */   
/* 17:   */   public void setMerchantsaleleadsquerylist(List<MerchantSaleLeadsQueryDTO> merchantsaleleadsquerylist)
/* 18:   */   {
/* 19:28 */     this.merchantsaleleadsquerylist = merchantsaleleadsquerylist;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<MerchantSaleLeadsQueryDTO> getMerchantsaleleadsquerylist()
/* 23:   */   {
/* 24:31 */     return this.merchantsaleleadsquerylist;
/* 25:   */   }
/* 26:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayOfflineSaleleadsQuerybyidsResponse

 * JD-Core Version:    0.7.0.1

 */