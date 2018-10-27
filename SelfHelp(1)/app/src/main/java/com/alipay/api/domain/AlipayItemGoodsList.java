/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayItemGoodsList
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 3185763752412431135L;
/* 12:   */   @ApiField("desc")
/* 13:   */   private String desc;
/* 14:   */   @ApiListField("goods_list")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> goodsList;
/* 17:   */   
/* 18:   */   public String getDesc()
/* 19:   */   {
/* 20:33 */     return this.desc;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setDesc(String desc)
/* 24:   */   {
/* 25:36 */     this.desc = desc;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public List<String> getGoodsList()
/* 29:   */   {
/* 30:40 */     return this.goodsList;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setGoodsList(List<String> goodsList)
/* 34:   */   {
/* 35:43 */     this.goodsList = goodsList;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayItemGoodsList
 * JD-Core Version:    0.7.0.1
 */