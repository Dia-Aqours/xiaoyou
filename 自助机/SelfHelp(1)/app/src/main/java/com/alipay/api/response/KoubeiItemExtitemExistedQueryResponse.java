/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KoubeiItemExtitemExistedQueryResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2437196667725765223L;
/* 12:   */   @ApiListField("existed_list")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> existedList;
/* 15:   */   
/* 16:   */   public void setExistedList(List<String> existedList)
/* 17:   */   {
/* 18:27 */     this.existedList = existedList;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public List<String> getExistedList()
/* 22:   */   {
/* 23:30 */     return this.existedList;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiItemExtitemExistedQueryResponse
 * JD-Core Version:    0.7.0.1
 */