/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CustomTagInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiMarketingDataCustomtagBatchqueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1452385567323498673L;
/* 13:   */   @ApiListField("custom_tag_list")
/* 14:   */   @ApiField("custom_tag_info")
/* 15:   */   private List<CustomTagInfo> customTagList;
/* 16:   */   
/* 17:   */   public void setCustomTagList(List<CustomTagInfo> customTagList)
/* 18:   */   {
/* 19:28 */     this.customTagList = customTagList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<CustomTagInfo> getCustomTagList()
/* 23:   */   {
/* 24:31 */     return this.customTagList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataCustomtagBatchqueryResponse
 * JD-Core Version:    0.7.0.1
 */