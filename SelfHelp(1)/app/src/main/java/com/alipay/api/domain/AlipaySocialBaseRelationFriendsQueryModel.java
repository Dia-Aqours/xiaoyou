/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySocialBaseRelationFriendsQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3847174565463148167L;
/* 10:   */   @ApiField("get_type")
/* 11:   */   private Long getType;
/* 12:   */   @ApiField("include_self")
/* 13:   */   private Boolean includeSelf;
/* 14:   */   
/* 15:   */   public Long getGetType()
/* 16:   */   {
/* 17:29 */     return this.getType;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setGetType(Long getType)
/* 21:   */   {
/* 22:32 */     this.getType = getType;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Boolean getIncludeSelf()
/* 26:   */   {
/* 27:36 */     return this.includeSelf;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setIncludeSelf(Boolean includeSelf)
/* 31:   */   {
/* 32:39 */     this.includeSelf = includeSelf;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySocialBaseRelationFriendsQueryModel
 * JD-Core Version:    0.7.0.1
 */