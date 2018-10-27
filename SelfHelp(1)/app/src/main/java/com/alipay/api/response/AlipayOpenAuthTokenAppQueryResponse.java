/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayOpenAuthTokenAppQueryResponse
/*  10:    */   extends AlipayResponse
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 6749293338431566974L;
/*  13:    */   @ApiField("auth_app_id")
/*  14:    */   private String authAppId;
/*  15:    */   @ApiField("auth_end")
/*  16:    */   private Date authEnd;
/*  17:    */   @ApiListField("auth_methods")
/*  18:    */   @ApiField("string")
/*  19:    */   private List<String> authMethods;
/*  20:    */   @ApiField("auth_start")
/*  21:    */   private Date authStart;
/*  22:    */   @ApiField("expires_in")
/*  23:    */   private Long expiresIn;
/*  24:    */   @ApiField("status")
/*  25:    */   private String status;
/*  26:    */   @ApiField("user_id")
/*  27:    */   private String userId;
/*  28:    */   
/*  29:    */   public void setAuthAppId(String authAppId)
/*  30:    */   {
/*  31: 64 */     this.authAppId = authAppId;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String getAuthAppId()
/*  35:    */   {
/*  36: 67 */     return this.authAppId;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setAuthEnd(Date authEnd)
/*  40:    */   {
/*  41: 71 */     this.authEnd = authEnd;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public Date getAuthEnd()
/*  45:    */   {
/*  46: 74 */     return this.authEnd;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setAuthMethods(List<String> authMethods)
/*  50:    */   {
/*  51: 78 */     this.authMethods = authMethods;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public List<String> getAuthMethods()
/*  55:    */   {
/*  56: 81 */     return this.authMethods;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setAuthStart(Date authStart)
/*  60:    */   {
/*  61: 85 */     this.authStart = authStart;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public Date getAuthStart()
/*  65:    */   {
/*  66: 88 */     return this.authStart;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setExpiresIn(Long expiresIn)
/*  70:    */   {
/*  71: 92 */     this.expiresIn = expiresIn;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public Long getExpiresIn()
/*  75:    */   {
/*  76: 95 */     return this.expiresIn;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setStatus(String status)
/*  80:    */   {
/*  81: 99 */     this.status = status;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getStatus()
/*  85:    */   {
/*  86:102 */     return this.status;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setUserId(String userId)
/*  90:    */   {
/*  91:106 */     this.userId = userId;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getUserId()
/*  95:    */   {
/*  96:109 */     return this.userId;
/*  97:    */   }
/*  98:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenAuthTokenAppQueryResponse
 * JD-Core Version:    0.7.0.1
 */