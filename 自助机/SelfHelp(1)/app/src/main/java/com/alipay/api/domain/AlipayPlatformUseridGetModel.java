/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayPlatformUseridGetModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8148953313249196544L;
/* 12:   */   @ApiListField("open_ids")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> openIds;
/* 15:   */   
/* 16:   */   public List<String> getOpenIds()
/* 17:   */   {
/* 18:27 */     return this.openIds;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setOpenIds(List<String> openIds)
/* 22:   */   {
/* 23:30 */     this.openIds = openIds;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayPlatformUseridGetModel
 * JD-Core Version:    0.7.0.1
 */