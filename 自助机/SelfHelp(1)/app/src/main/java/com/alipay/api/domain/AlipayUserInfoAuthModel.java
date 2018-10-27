/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayUserInfoAuthModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4385728367722842833L;
/* 12:   */   @ApiListField("scopes")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> scopes;
/* 15:   */   @ApiField("state")
/* 16:   */   private String state;
/* 17:   */   
/* 18:   */   public List<String> getScopes()
/* 19:   */   {
/* 20:36 */     return this.scopes;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setScopes(List<String> scopes)
/* 24:   */   {
/* 25:39 */     this.scopes = scopes;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getState()
/* 29:   */   {
/* 30:43 */     return this.state;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setState(String state)
/* 34:   */   {
/* 35:46 */     this.state = state;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserInfoAuthModel
 * JD-Core Version:    0.7.0.1
 */