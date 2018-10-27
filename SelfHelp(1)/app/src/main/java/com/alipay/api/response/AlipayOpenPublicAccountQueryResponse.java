/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.StdPublicBindAccount;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOpenPublicAccountQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 6472163748864838733L;
/* 13:   */   @ApiListField("public_bind_accounts")
/* 14:   */   @ApiField("std_public_bind_account")
/* 15:   */   private List<StdPublicBindAccount> publicBindAccounts;
/* 16:   */   
/* 17:   */   public void setPublicBindAccounts(List<StdPublicBindAccount> publicBindAccounts)
/* 18:   */   {
/* 19:28 */     this.publicBindAccounts = publicBindAccounts;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<StdPublicBindAccount> getPublicBindAccounts()
/* 23:   */   {
/* 24:31 */     return this.publicBindAccounts;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicAccountQueryResponse
 * JD-Core Version:    0.7.0.1
 */