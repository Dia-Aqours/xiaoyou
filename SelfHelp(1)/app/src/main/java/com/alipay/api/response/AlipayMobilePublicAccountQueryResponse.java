/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.PublicBindAccount;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayMobilePublicAccountQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 7673816349627525788L;
/* 13:   */   @ApiField("code")
/* 14:   */   private String code;
/* 15:   */   @ApiField("menu_key")
/* 16:   */   private String menuKey;
/* 17:   */   @ApiField("msg")
/* 18:   */   private String msg;
/* 19:   */   @ApiListField("public_bind_accounts")
/* 20:   */   @ApiField("public_bind_account")
/* 21:   */   private List<PublicBindAccount> publicBindAccounts;
/* 22:   */   @ApiField("remark")
/* 23:   */   private String remark;
/* 24:   */   
/* 25:   */   public void setCode(String code)
/* 26:   */   {
/* 27:52 */     this.code = code;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getCode()
/* 31:   */   {
/* 32:55 */     return this.code;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setMenuKey(String menuKey)
/* 36:   */   {
/* 37:59 */     this.menuKey = menuKey;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getMenuKey()
/* 41:   */   {
/* 42:62 */     return this.menuKey;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setMsg(String msg)
/* 46:   */   {
/* 47:66 */     this.msg = msg;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public String getMsg()
/* 51:   */   {
/* 52:69 */     return this.msg;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void setPublicBindAccounts(List<PublicBindAccount> publicBindAccounts)
/* 56:   */   {
/* 57:73 */     this.publicBindAccounts = publicBindAccounts;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public List<PublicBindAccount> getPublicBindAccounts()
/* 61:   */   {
/* 62:76 */     return this.publicBindAccounts;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void setRemark(String remark)
/* 66:   */   {
/* 67:80 */     this.remark = remark;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public String getRemark()
/* 71:   */   {
/* 72:83 */     return this.remark;
/* 73:   */   }
/* 74:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicAccountQueryResponse
 * JD-Core Version:    0.7.0.1
 */