/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class KoubeiContentArticleCreateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 4793198534765916984L;
/*  12:    */   @ApiField("author_intro")
/*  13:    */   private String authorIntro;
/*  14:    */   @ApiField("author_name")
/*  15:    */   private String authorName;
/*  16:    */   @ApiField("cover")
/*  17:    */   private ArticlePicture cover;
/*  18:    */   @ApiField("introduction")
/*  19:    */   private String introduction;
/*  20:    */   @ApiListField("paragraph_list")
/*  21:    */   @ApiField("article_paragraph")
/*  22:    */   private List<ArticleParagraph> paragraphList;
/*  23:    */   @ApiField("provider")
/*  24:    */   private String provider;
/*  25:    */   @ApiField("shop_address")
/*  26:    */   private String shopAddress;
/*  27:    */   @ApiListField("shop_ids")
/*  28:    */   @ApiField("string")
/*  29:    */   private List<String> shopIds;
/*  30:    */   @ApiField("shop_name")
/*  31:    */   private String shopName;
/*  32:    */   @ApiField("title")
/*  33:    */   private String title;
/*  34:    */   
/*  35:    */   public String getAuthorIntro()
/*  36:    */   {
/*  37: 82 */     return this.authorIntro;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setAuthorIntro(String authorIntro)
/*  41:    */   {
/*  42: 85 */     this.authorIntro = authorIntro;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getAuthorName()
/*  46:    */   {
/*  47: 89 */     return this.authorName;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setAuthorName(String authorName)
/*  51:    */   {
/*  52: 92 */     this.authorName = authorName;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public ArticlePicture getCover()
/*  56:    */   {
/*  57: 96 */     return this.cover;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setCover(ArticlePicture cover)
/*  61:    */   {
/*  62: 99 */     this.cover = cover;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getIntroduction()
/*  66:    */   {
/*  67:103 */     return this.introduction;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setIntroduction(String introduction)
/*  71:    */   {
/*  72:106 */     this.introduction = introduction;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public List<ArticleParagraph> getParagraphList()
/*  76:    */   {
/*  77:110 */     return this.paragraphList;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setParagraphList(List<ArticleParagraph> paragraphList)
/*  81:    */   {
/*  82:113 */     this.paragraphList = paragraphList;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getProvider()
/*  86:    */   {
/*  87:117 */     return this.provider;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setProvider(String provider)
/*  91:    */   {
/*  92:120 */     this.provider = provider;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getShopAddress()
/*  96:    */   {
/*  97:124 */     return this.shopAddress;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setShopAddress(String shopAddress)
/* 101:    */   {
/* 102:127 */     this.shopAddress = shopAddress;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public List<String> getShopIds()
/* 106:    */   {
/* 107:131 */     return this.shopIds;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setShopIds(List<String> shopIds)
/* 111:    */   {
/* 112:134 */     this.shopIds = shopIds;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getShopName()
/* 116:    */   {
/* 117:138 */     return this.shopName;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setShopName(String shopName)
/* 121:    */   {
/* 122:141 */     this.shopName = shopName;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getTitle()
/* 126:    */   {
/* 127:145 */     return this.title;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setTitle(String title)
/* 131:    */   {
/* 132:148 */     this.title = title;
/* 133:    */   }
/* 134:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiContentArticleCreateModel
 * JD-Core Version:    0.7.0.1
 */