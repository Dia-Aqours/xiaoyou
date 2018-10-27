/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class Template
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3569652317736123883L;
/* 10:   */   @ApiField("context")
/* 11:   */   private Context context;
/* 12:   */   @ApiField("template_id")
/* 13:   */   private String templateId;
/* 14:   */   
/* 15:   */   public Context getContext()
/* 16:   */   {
/* 17:29 */     return this.context;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setContext(Context context)
/* 21:   */   {
/* 22:32 */     this.context = context;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getTemplateId()
/* 26:   */   {
/* 27:36 */     return this.templateId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setTemplateId(String templateId)
/* 31:   */   {
/* 32:39 */     this.templateId = templateId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.Template
 * JD-Core Version:    0.7.0.1
 */