/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipaySecurityRiskContentAnalyzeModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 6263571393349281411L;
/*  13:    */   @ApiField("account_id")
/*  14:    */   private String accountId;
/*  15:    */   @ApiField("account_type")
/*  16:    */   private String accountType;
/*  17:    */   @ApiField("app_main_scene")
/*  18:    */   private String appMainScene;
/*  19:    */   @ApiField("app_main_scene_id")
/*  20:    */   private String appMainSceneId;
/*  21:    */   @ApiField("app_name")
/*  22:    */   private String appName;
/*  23:    */   @ApiField("app_scene")
/*  24:    */   private String appScene;
/*  25:    */   @ApiField("app_scene_data_id")
/*  26:    */   private String appSceneDataId;
/*  27:    */   @ApiListField("audio_urls")
/*  28:    */   @ApiField("string")
/*  29:    */   private List<String> audioUrls;
/*  30:    */   @ApiListField("link_urls")
/*  31:    */   @ApiField("string")
/*  32:    */   private List<String> linkUrls;
/*  33:    */   @ApiListField("picture_urls")
/*  34:    */   @ApiField("string")
/*  35:    */   private List<String> pictureUrls;
/*  36:    */   @ApiField("publish_date")
/*  37:    */   private Date publishDate;
/*  38:    */   @ApiField("text")
/*  39:    */   private String text;
/*  40:    */   @ApiListField("video_urls")
/*  41:    */   @ApiField("string")
/*  42:    */   private List<String> videoUrls;
/*  43:    */   
/*  44:    */   public String getAccountId()
/*  45:    */   {
/*  46:106 */     return this.accountId;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setAccountId(String accountId)
/*  50:    */   {
/*  51:109 */     this.accountId = accountId;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getAccountType()
/*  55:    */   {
/*  56:113 */     return this.accountType;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setAccountType(String accountType)
/*  60:    */   {
/*  61:116 */     this.accountType = accountType;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getAppMainScene()
/*  65:    */   {
/*  66:120 */     return this.appMainScene;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setAppMainScene(String appMainScene)
/*  70:    */   {
/*  71:123 */     this.appMainScene = appMainScene;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getAppMainSceneId()
/*  75:    */   {
/*  76:127 */     return this.appMainSceneId;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setAppMainSceneId(String appMainSceneId)
/*  80:    */   {
/*  81:130 */     this.appMainSceneId = appMainSceneId;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getAppName()
/*  85:    */   {
/*  86:134 */     return this.appName;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setAppName(String appName)
/*  90:    */   {
/*  91:137 */     this.appName = appName;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getAppScene()
/*  95:    */   {
/*  96:141 */     return this.appScene;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setAppScene(String appScene)
/* 100:    */   {
/* 101:144 */     this.appScene = appScene;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getAppSceneDataId()
/* 105:    */   {
/* 106:148 */     return this.appSceneDataId;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setAppSceneDataId(String appSceneDataId)
/* 110:    */   {
/* 111:151 */     this.appSceneDataId = appSceneDataId;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public List<String> getAudioUrls()
/* 115:    */   {
/* 116:155 */     return this.audioUrls;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setAudioUrls(List<String> audioUrls)
/* 120:    */   {
/* 121:158 */     this.audioUrls = audioUrls;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public List<String> getLinkUrls()
/* 125:    */   {
/* 126:162 */     return this.linkUrls;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setLinkUrls(List<String> linkUrls)
/* 130:    */   {
/* 131:165 */     this.linkUrls = linkUrls;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public List<String> getPictureUrls()
/* 135:    */   {
/* 136:169 */     return this.pictureUrls;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setPictureUrls(List<String> pictureUrls)
/* 140:    */   {
/* 141:172 */     this.pictureUrls = pictureUrls;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public Date getPublishDate()
/* 145:    */   {
/* 146:176 */     return this.publishDate;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setPublishDate(Date publishDate)
/* 150:    */   {
/* 151:179 */     this.publishDate = publishDate;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public String getText()
/* 155:    */   {
/* 156:183 */     return this.text;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setText(String text)
/* 160:    */   {
/* 161:186 */     this.text = text;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public List<String> getVideoUrls()
/* 165:    */   {
/* 166:190 */     return this.videoUrls;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setVideoUrls(List<String> videoUrls)
/* 170:    */   {
/* 171:193 */     this.videoUrls = videoUrls;
/* 172:    */   }
/* 173:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySecurityRiskContentAnalyzeModel
 * JD-Core Version:    0.7.0.1
 */