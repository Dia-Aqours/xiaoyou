/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayMobilePublicContactFollowListResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1247496919369152327L;
/* 12:   */   @ApiField("code")
/* 13:   */   private String code;
/* 14:   */   @ApiListField("contact_follow_list")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> contactFollowList;
/* 17:   */   
/* 18:   */   public void setCode(String code)
/* 19:   */   {
/* 20:33 */     this.code = code;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public String getCode()
/* 24:   */   {
/* 25:36 */     return this.code;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setContactFollowList(List<String> contactFollowList)
/* 29:   */   {
/* 30:40 */     this.contactFollowList = contactFollowList;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public List<String> getContactFollowList()
/* 34:   */   {
/* 35:43 */     return this.contactFollowList;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicContactFollowListResponse
 * JD-Core Version:    0.7.0.1
 */