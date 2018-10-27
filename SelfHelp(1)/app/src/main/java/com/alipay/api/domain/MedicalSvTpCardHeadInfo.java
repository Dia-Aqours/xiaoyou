/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MedicalSvTpCardHeadInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4181982485374611864L;
/* 10:   */   @ApiField("header_icon")
/* 11:   */   private String headerIcon;
/* 12:   */   @ApiField("header_title")
/* 13:   */   private String headerTitle;
/* 14:   */   
/* 15:   */   public String getHeaderIcon()
/* 16:   */   {
/* 17:30 */     return this.headerIcon;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setHeaderIcon(String headerIcon)
/* 21:   */   {
/* 22:33 */     this.headerIcon = headerIcon;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getHeaderTitle()
/* 26:   */   {
/* 27:37 */     return this.headerTitle;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setHeaderTitle(String headerTitle)
/* 31:   */   {
/* 32:40 */     this.headerTitle = headerTitle;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MedicalSvTpCardHeadInfo
 * JD-Core Version:    0.7.0.1
 */