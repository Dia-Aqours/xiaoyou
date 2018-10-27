/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class RoyaltyInfo
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6839449628946883373L;
/* 12:   */   @ApiListField("royalty_detail_infos")
/* 13:   */   @ApiField("royalty_detail_infos")
/* 14:   */   private List<RoyaltyDetailInfos> royaltyDetailInfos;
/* 15:   */   @ApiField("royalty_type")
/* 16:   */   private String royaltyType;
/* 17:   */   
/* 18:   */   public List<RoyaltyDetailInfos> getRoyaltyDetailInfos()
/* 19:   */   {
/* 20:34 */     return this.royaltyDetailInfos;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setRoyaltyDetailInfos(List<RoyaltyDetailInfos> royaltyDetailInfos)
/* 24:   */   {
/* 25:37 */     this.royaltyDetailInfos = royaltyDetailInfos;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getRoyaltyType()
/* 29:   */   {
/* 30:41 */     return this.royaltyType;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setRoyaltyType(String royaltyType)
/* 34:   */   {
/* 35:44 */     this.royaltyType = royaltyType;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RoyaltyInfo
 * JD-Core Version:    0.7.0.1
 */