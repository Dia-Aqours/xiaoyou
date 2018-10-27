/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MergeVerifyConfig
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6833382219984788455L;
/* 10:   */   @ApiField("general_merge_others")
/* 11:   */   private Boolean generalMergeOthers;
/* 12:   */   @ApiField("general_merge_single")
/* 13:   */   private Boolean generalMergeSingle;
/* 14:   */   
/* 15:   */   public Boolean getGeneralMergeOthers()
/* 16:   */   {
/* 17:29 */     return this.generalMergeOthers;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setGeneralMergeOthers(Boolean generalMergeOthers)
/* 21:   */   {
/* 22:32 */     this.generalMergeOthers = generalMergeOthers;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Boolean getGeneralMergeSingle()
/* 26:   */   {
/* 27:36 */     return this.generalMergeSingle;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setGeneralMergeSingle(Boolean generalMergeSingle)
/* 31:   */   {
/* 32:39 */     this.generalMergeSingle = generalMergeSingle;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MergeVerifyConfig
 * JD-Core Version:    0.7.0.1
 */