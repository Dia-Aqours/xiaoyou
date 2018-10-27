/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class GroupSetting
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3115257275642794834L;
/* 10:   */   @ApiField("group_name")
/* 11:   */   private String groupName;
/* 12:   */   @ApiField("is_openinv")
/* 13:   */   private Boolean isOpeninv;
/* 14:   */   @ApiField("public_notice")
/* 15:   */   private String publicNotice;
/* 16:   */   
/* 17:   */   public String getGroupName()
/* 18:   */   {
/* 19:35 */     return this.groupName;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setGroupName(String groupName)
/* 23:   */   {
/* 24:38 */     this.groupName = groupName;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public Boolean getIsOpeninv()
/* 28:   */   {
/* 29:42 */     return this.isOpeninv;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setIsOpeninv(Boolean isOpeninv)
/* 33:   */   {
/* 34:45 */     this.isOpeninv = isOpeninv;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getPublicNotice()
/* 38:   */   {
/* 39:49 */     return this.publicNotice;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setPublicNotice(String publicNotice)
/* 43:   */   {
/* 44:52 */     this.publicNotice = publicNotice;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.GroupSetting
 * JD-Core Version:    0.7.0.1
 */