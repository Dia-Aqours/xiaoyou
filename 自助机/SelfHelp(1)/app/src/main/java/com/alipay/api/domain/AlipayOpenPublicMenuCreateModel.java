/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayOpenPublicMenuCreateModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6136662311791965991L;
/* 12:   */   @ApiListField("button")
/* 13:   */   @ApiField("button_object")
/* 14:   */   private List<ButtonObject> button;
/* 15:   */   
/* 16:   */   public List<ButtonObject> getButton()
/* 17:   */   {
/* 18:27 */     return this.button;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setButton(List<ButtonObject> button)
/* 22:   */   {
/* 23:30 */     this.button = button;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicMenuCreateModel
 * JD-Core Version:    0.7.0.1
 */