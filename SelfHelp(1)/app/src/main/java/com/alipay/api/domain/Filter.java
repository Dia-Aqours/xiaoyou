/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class Filter
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7242269627881318239L;
/* 10:   */   @ApiField("context")
/* 11:   */   private LabelContext context;
/* 12:   */   @ApiField("template")
/* 13:   */   private String template;
/* 14:   */   
/* 15:   */   public LabelContext getContext()
/* 16:   */   {
/* 17:31 */     return this.context;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setContext(LabelContext context)
/* 21:   */   {
/* 22:34 */     this.context = context;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getTemplate()
/* 26:   */   {
/* 27:38 */     return this.template;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setTemplate(String template)
/* 31:   */   {
/* 32:41 */     this.template = template;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.Filter
 * JD-Core Version:    0.7.0.1
 */