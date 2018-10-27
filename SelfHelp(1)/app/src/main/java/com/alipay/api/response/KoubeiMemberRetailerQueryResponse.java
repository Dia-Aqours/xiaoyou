/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.Retailer;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiMemberRetailerQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4546243432514196651L;
/* 13:   */   @ApiListField("retailer_list")
/* 14:   */   @ApiField("retailer")
/* 15:   */   private List<Retailer> retailerList;
/* 16:   */   
/* 17:   */   public void setRetailerList(List<Retailer> retailerList)
/* 18:   */   {
/* 19:28 */     this.retailerList = retailerList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<Retailer> getRetailerList()
/* 23:   */   {
/* 24:31 */     return this.retailerList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMemberRetailerQueryResponse
 * JD-Core Version:    0.7.0.1
 */