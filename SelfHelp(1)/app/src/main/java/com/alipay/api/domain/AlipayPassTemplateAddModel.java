/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPassTemplateAddModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3797947714388453868L;
/* 10:   */   @ApiField("tpl_content")
/* 11:   */   private String tplContent;
/* 12:   */   @ApiField("unique_id")
/* 13:   */   private String uniqueId;
/* 14:   */   
/* 15:   */   public String getTplContent()
/* 16:   */   {
/* 17:29 */     return this.tplContent;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setTplContent(String tplContent)
/* 21:   */   {
/* 22:32 */     this.tplContent = tplContent;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getUniqueId()
/* 26:   */   {
/* 27:36 */     return this.uniqueId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setUniqueId(String uniqueId)
/* 31:   */   {
/* 32:39 */     this.uniqueId = uniqueId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayPassTemplateAddModel
 * JD-Core Version:    0.7.0.1
 */