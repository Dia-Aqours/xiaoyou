/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ArrangementInvolvedPartyQuerier
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2224696131177645287L;
/* 10:   */   @ApiField("ip_id")
/* 11:   */   private String ipId;
/* 12:   */   @ApiField("ip_role_id")
/* 13:   */   private String ipRoleId;
/* 14:   */   @ApiField("ip_type")
/* 15:   */   private String ipType;
/* 16:   */   
/* 17:   */   public String getIpId()
/* 18:   */   {
/* 19:36 */     return this.ipId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setIpId(String ipId)
/* 23:   */   {
/* 24:39 */     this.ipId = ipId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getIpRoleId()
/* 28:   */   {
/* 29:43 */     return this.ipRoleId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setIpRoleId(String ipRoleId)
/* 33:   */   {
/* 34:46 */     this.ipRoleId = ipRoleId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getIpType()
/* 38:   */   {
/* 39:50 */     return this.ipType;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setIpType(String ipType)
/* 43:   */   {
/* 44:53 */     this.ipType = ipType;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ArrangementInvolvedPartyQuerier
 * JD-Core Version:    0.7.0.1
 */