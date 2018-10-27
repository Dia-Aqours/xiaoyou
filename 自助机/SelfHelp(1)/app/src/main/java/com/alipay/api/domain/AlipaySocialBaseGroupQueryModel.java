/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipaySocialBaseGroupQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4363248321264546672L;
/* 10:   */   @ApiField("group_id")
/* 11:   */   private String groupId;
/* 12:   */   
/* 13:   */   public String getGroupId()
/* 14:   */   {
/* 15:23 */     return this.groupId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setGroupId(String groupId)
/* 19:   */   {
/* 20:26 */     this.groupId = groupId;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipaySocialBaseGroupQueryModel

 * JD-Core Version:    0.7.0.1

 */