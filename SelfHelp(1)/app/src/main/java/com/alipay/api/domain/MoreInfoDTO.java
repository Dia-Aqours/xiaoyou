/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class MoreInfoDTO
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2696676281444187515L;
/* 12:   */   @ApiListField("descs")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> descs;
/* 15:   */   @ApiField("params")
/* 16:   */   private String params;
/* 17:   */   @ApiField("title")
/* 18:   */   private String title;
/* 19:   */   @ApiField("url")
/* 20:   */   private String url;
/* 21:   */   
/* 22:   */   public List<String> getDescs()
/* 23:   */   {
/* 24:45 */     return this.descs;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setDescs(List<String> descs)
/* 28:   */   {
/* 29:48 */     this.descs = descs;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getParams()
/* 33:   */   {
/* 34:52 */     return this.params;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setParams(String params)
/* 38:   */   {
/* 39:55 */     this.params = params;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getTitle()
/* 43:   */   {
/* 44:59 */     return this.title;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setTitle(String title)
/* 48:   */   {
/* 49:62 */     this.title = title;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getUrl()
/* 53:   */   {
/* 54:66 */     return this.url;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setUrl(String url)
/* 58:   */   {
/* 59:69 */     this.url = url;
/* 60:   */   }
/* 61:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.MoreInfoDTO

 * JD-Core Version:    0.7.0.1

 */