/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class SsdataDataserviceInfoAtlasnegQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3269957356667137135L;
/* 10:   */   @ApiField("edges")
/* 11:   */   private String edges;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   @ApiField("step")
/* 15:   */   private String step;
/* 16:   */   
/* 17:   */   public String getEdges()
/* 18:   */   {
/* 19:35 */     return this.edges;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setEdges(String edges)
/* 23:   */   {
/* 24:38 */     this.edges = edges;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getName()
/* 28:   */   {
/* 29:42 */     return this.name;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setName(String name)
/* 33:   */   {
/* 34:45 */     this.name = name;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getStep()
/* 38:   */   {
/* 39:49 */     return this.step;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setStep(String step)
/* 43:   */   {
/* 44:52 */     this.step = step;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.SsdataDataserviceInfoAtlasnegQueryModel
 * JD-Core Version:    0.7.0.1
 */