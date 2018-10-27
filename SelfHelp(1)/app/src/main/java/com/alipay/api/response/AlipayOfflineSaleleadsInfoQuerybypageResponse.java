/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.MerchantSaleLeadsQueryBypageDTO;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOfflineSaleleadsInfoQuerybypageResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 6644213821516866135L;
/* 13:   */   @ApiListField("merchantsaleleadsquerybypagelist")
/* 14:   */   @ApiField("merchant_sale_leads_query_bypage_d_t_o")
/* 15:   */   private List<MerchantSaleLeadsQueryBypageDTO> merchantsaleleadsquerybypagelist;
/* 16:   */   
/* 17:   */   public void setMerchantsaleleadsquerybypagelist(List<MerchantSaleLeadsQueryBypageDTO> merchantsaleleadsquerybypagelist)
/* 18:   */   {
/* 19:28 */     this.merchantsaleleadsquerybypagelist = merchantsaleleadsquerybypagelist;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<MerchantSaleLeadsQueryBypageDTO> getMerchantsaleleadsquerybypagelist()
/* 23:   */   {
/* 24:31 */     return this.merchantsaleleadsquerybypagelist;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineSaleleadsInfoQuerybypageResponse
 * JD-Core Version:    0.7.0.1
 */