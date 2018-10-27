/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class PidShopInfo
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 7569987353736112391L;
/* 12:   */   @ApiField("pid")
/* 13:   */   private String pid;
/* 14:   */   @ApiListField("shop_ids")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> shopIds;
/* 17:   */   
/* 18:   */   public String getPid()
/* 19:   */   {
/* 20:33 */     return this.pid;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setPid(String pid)
/* 24:   */   {
/* 25:36 */     this.pid = pid;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public List<String> getShopIds()
/* 29:   */   {
/* 30:40 */     return this.shopIds;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setShopIds(List<String> shopIds)
/* 34:   */   {
/* 35:43 */     this.shopIds = shopIds;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PidShopInfo
 * JD-Core Version:    0.7.0.1
 */