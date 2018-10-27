/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicLabelUserQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4416969847577342647L;
/* 10:   */   @ApiField("label_ids")
/* 11:   */   private String labelIds;
/* 12:   */   
/* 13:   */   public void setLabelIds(String labelIds)
/* 14:   */   {
/* 15:24 */     this.labelIds = labelIds;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getLabelIds()
/* 19:   */   {
/* 20:27 */     return this.labelIds;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicLabelUserQueryResponse
 * JD-Core Version:    0.7.0.1
 */