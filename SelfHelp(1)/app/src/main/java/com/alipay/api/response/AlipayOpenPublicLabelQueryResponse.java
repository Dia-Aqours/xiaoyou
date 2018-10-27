/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.PublicLabel;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOpenPublicLabelQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4629585856393515312L;
/* 13:   */   @ApiListField("label_list")
/* 14:   */   @ApiField("public_label")
/* 15:   */   private List<PublicLabel> labelList;
/* 16:   */   
/* 17:   */   public void setLabelList(List<PublicLabel> labelList)
/* 18:   */   {
/* 19:28 */     this.labelList = labelList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<PublicLabel> getLabelList()
/* 23:   */   {
/* 24:31 */     return this.labelList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicLabelQueryResponse
 * JD-Core Version:    0.7.0.1
 */