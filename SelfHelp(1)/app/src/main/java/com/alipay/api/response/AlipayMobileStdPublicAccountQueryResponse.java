/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.PublicBindAccount;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayMobileStdPublicAccountQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 6896998532626136383L;
/* 13:   */   @ApiListField("public_bind_accounts")
/* 14:   */   @ApiField("public_bind_account")
/* 15:   */   private List<PublicBindAccount> publicBindAccounts;
/* 16:   */   
/* 17:   */   public void setPublicBindAccounts(List<PublicBindAccount> publicBindAccounts)
/* 18:   */   {
/* 19:28 */     this.publicBindAccounts = publicBindAccounts;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<PublicBindAccount> getPublicBindAccounts()
/* 23:   */   {
/* 24:31 */     return this.publicBindAccounts;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobileStdPublicAccountQueryResponse
 * JD-Core Version:    0.7.0.1
 */