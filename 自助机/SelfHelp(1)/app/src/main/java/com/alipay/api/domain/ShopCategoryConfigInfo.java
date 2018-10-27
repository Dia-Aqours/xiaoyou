/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ShopCategoryConfigInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4427144681612457372L;
/* 10:   */   @ApiField("id")
/* 11:   */   private String id;
/* 12:   */   @ApiField("is_leaf")
/* 13:   */   private String isLeaf;
/* 14:   */   @ApiField("level")
/* 15:   */   private String level;
/* 16:   */   @ApiField("link")
/* 17:   */   private String link;
/* 18:   */   @ApiField("nm")
/* 19:   */   private String nm;
/* 20:   */   
/* 21:   */   public String getId()
/* 22:   */   {
/* 23:47 */     return this.id;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setId(String id)
/* 27:   */   {
/* 28:50 */     this.id = id;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getIsLeaf()
/* 32:   */   {
/* 33:54 */     return this.isLeaf;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setIsLeaf(String isLeaf)
/* 37:   */   {
/* 38:57 */     this.isLeaf = isLeaf;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getLevel()
/* 42:   */   {
/* 43:61 */     return this.level;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setLevel(String level)
/* 47:   */   {
/* 48:64 */     this.level = level;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getLink()
/* 52:   */   {
/* 53:68 */     return this.link;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setLink(String link)
/* 57:   */   {
/* 58:71 */     this.link = link;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getNm()
/* 62:   */   {
/* 63:75 */     return this.nm;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setNm(String nm)
/* 67:   */   {
/* 68:78 */     this.nm = nm;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ShopCategoryConfigInfo
 * JD-Core Version:    0.7.0.1
 */