/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class TemplateCardLevelConfDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1849882125922896761L;
/* 10:   */   @ApiField("level")
/* 11:   */   private String level;
/* 12:   */   @ApiField("level_desc")
/* 13:   */   private String levelDesc;
/* 14:   */   @ApiField("level_icon")
/* 15:   */   private String levelIcon;
/* 16:   */   @ApiField("level_show_name")
/* 17:   */   private String levelShowName;
/* 18:   */   
/* 19:   */   public String getLevel()
/* 20:   */   {
/* 21:41 */     return this.level;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setLevel(String level)
/* 25:   */   {
/* 26:44 */     this.level = level;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getLevelDesc()
/* 30:   */   {
/* 31:48 */     return this.levelDesc;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setLevelDesc(String levelDesc)
/* 35:   */   {
/* 36:51 */     this.levelDesc = levelDesc;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getLevelIcon()
/* 40:   */   {
/* 41:55 */     return this.levelIcon;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setLevelIcon(String levelIcon)
/* 45:   */   {
/* 46:58 */     this.levelIcon = levelIcon;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getLevelShowName()
/* 50:   */   {
/* 51:62 */     return this.levelShowName;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setLevelShowName(String levelShowName)
/* 55:   */   {
/* 56:65 */     this.levelShowName = levelShowName;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.TemplateCardLevelConfDTO
 * JD-Core Version:    0.7.0.1
 */