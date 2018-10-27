/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class AlipayCommerceTransportOfflinepayUserblacklistQueryResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4324276853167579434L;
/* 12:   */   @ApiListField("black_list")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> blackList;
/* 15:   */   
/* 16:   */   public void setBlackList(List<String> blackList)
/* 17:   */   {
/* 18:27 */     this.blackList = blackList;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public List<String> getBlackList()
/* 22:   */   {
/* 23:30 */     return this.blackList;
/* 24:   */   }
/* 25:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayCommerceTransportOfflinepayUserblacklistQueryResponse

 * JD-Core Version:    0.7.0.1

 */