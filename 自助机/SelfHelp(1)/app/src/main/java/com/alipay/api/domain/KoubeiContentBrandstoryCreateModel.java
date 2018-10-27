/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KoubeiContentBrandstoryCreateModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5153767835849921619L;
/* 12:   */   @ApiField("cover")
/* 13:   */   private Picture cover;
/* 14:   */   @ApiListField("paragraph_list")
/* 15:   */   @ApiField("paragraph")
/* 16:   */   private List<Paragraph> paragraphList;
/* 17:   */   @ApiListField("shop_ids")
/* 18:   */   @ApiField("string")
/* 19:   */   private List<String> shopIds;
/* 20:   */   @ApiField("title")
/* 21:   */   private String title;
/* 22:   */   @ApiField("video")
/* 23:   */   private Video video;
/* 24:   */   
/* 25:   */   public Picture getCover()
/* 26:   */   {
/* 27:52 */     return this.cover;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setCover(Picture cover)
/* 31:   */   {
/* 32:55 */     this.cover = cover;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public List<Paragraph> getParagraphList()
/* 36:   */   {
/* 37:59 */     return this.paragraphList;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setParagraphList(List<Paragraph> paragraphList)
/* 41:   */   {
/* 42:62 */     this.paragraphList = paragraphList;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public List<String> getShopIds()
/* 46:   */   {
/* 47:66 */     return this.shopIds;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setShopIds(List<String> shopIds)
/* 51:   */   {
/* 52:69 */     this.shopIds = shopIds;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public String getTitle()
/* 56:   */   {
/* 57:73 */     return this.title;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void setTitle(String title)
/* 61:   */   {
/* 62:76 */     this.title = title;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public Video getVideo()
/* 66:   */   {
/* 67:80 */     return this.video;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public void setVideo(Video video)
/* 71:   */   {
/* 72:83 */     this.video = video;
/* 73:   */   }
/* 74:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiContentBrandstoryCreateModel
 * JD-Core Version:    0.7.0.1
 */