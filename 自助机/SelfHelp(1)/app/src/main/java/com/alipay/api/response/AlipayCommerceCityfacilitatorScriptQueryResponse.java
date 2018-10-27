/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorScriptQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1184619964789391595L;
/* 10:   */   @ApiField("content")
/* 11:   */   private String content;
/* 12:   */   @ApiField("gmt_modified")
/* 13:   */   private String gmtModified;
/* 14:   */   
/* 15:   */   public void setContent(String content)
/* 16:   */   {
/* 17:30 */     this.content = content;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getContent()
/* 21:   */   {
/* 22:33 */     return this.content;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setGmtModified(String gmtModified)
/* 26:   */   {
/* 27:37 */     this.gmtModified = gmtModified;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getGmtModified()
/* 31:   */   {
/* 32:40 */     return this.gmtModified;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayCommerceCityfacilitatorScriptQueryResponse
 * JD-Core Version:    0.7.0.1
 */