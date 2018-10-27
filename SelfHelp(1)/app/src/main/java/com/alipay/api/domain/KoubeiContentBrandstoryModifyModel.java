/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class KoubeiContentBrandstoryModifyModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2881561441151159854L;
/* 12:   */   @ApiField("content_id")
/* 13:   */   private String contentId;
/* 14:   */   @ApiField("cover")
/* 15:   */   private Picture cover;
/* 16:   */   @ApiListField("paragraph_list")
/* 17:   */   @ApiField("paragraph")
/* 18:   */   private List<Paragraph> paragraphList;
/* 19:   */   @ApiListField("shop_ids")
/* 20:   */   @ApiField("string")
/* 21:   */   private List<String> shopIds;
/* 22:   */   @ApiField("title")
/* 23:   */   private String title;
/* 24:   */   @ApiField("video")
/* 25:   */   private Video video;
/* 26:   */   
/* 27:   */   public String getContentId()
/* 28:   */   {
/* 29:58 */     return this.contentId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setContentId(String contentId)
/* 33:   */   {
/* 34:61 */     this.contentId = contentId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public Picture getCover()
/* 38:   */   {
/* 39:65 */     return this.cover;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setCover(Picture cover)
/* 43:   */   {
/* 44:68 */     this.cover = cover;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public List<Paragraph> getParagraphList()
/* 48:   */   {
/* 49:72 */     return this.paragraphList;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void setParagraphList(List<Paragraph> paragraphList)
/* 53:   */   {
/* 54:75 */     this.paragraphList = paragraphList;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public List<String> getShopIds()
/* 58:   */   {
/* 59:79 */     return this.shopIds;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void setShopIds(List<String> shopIds)
/* 63:   */   {
/* 64:82 */     this.shopIds = shopIds;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public String getTitle()
/* 68:   */   {
/* 69:86 */     return this.title;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public void setTitle(String title)
/* 73:   */   {
/* 74:89 */     this.title = title;
/* 75:   */   }
/* 76:   */   
/* 77:   */   public Video getVideo()
/* 78:   */   {
/* 79:93 */     return this.video;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public void setVideo(Video video)
/* 83:   */   {
/* 84:96 */     this.video = video;
/* 85:   */   }
/* 86:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiContentBrandstoryModifyModel

 * JD-Core Version:    0.7.0.1

 */