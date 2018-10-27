/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class AlipayMarketingCdpAdvertiseModifyModel
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 7428952794361258257L;
/* 11:   */   @ApiField("action_url")
/* 12:   */   private String actionUrl;
/* 13:   */   @ApiField("ad_id")
/* 14:   */   private String adId;
/* 15:   */   @ApiField("content")
/* 16:   */   private String content;
/* 17:   */   @ApiField("end_time")
/* 18:   */   private Date endTime;
/* 19:   */   @ApiField("height")
/* 20:   */   private String height;
/* 21:   */   @ApiField("start_time")
/* 22:   */   private Date startTime;
/* 23:   */   
/* 24:   */   public String getActionUrl()
/* 25:   */   {
/* 26:55 */     return this.actionUrl;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setActionUrl(String actionUrl)
/* 30:   */   {
/* 31:58 */     this.actionUrl = actionUrl;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getAdId()
/* 35:   */   {
/* 36:62 */     return this.adId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setAdId(String adId)
/* 40:   */   {
/* 41:65 */     this.adId = adId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getContent()
/* 45:   */   {
/* 46:69 */     return this.content;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setContent(String content)
/* 50:   */   {
/* 51:72 */     this.content = content;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public Date getEndTime()
/* 55:   */   {
/* 56:76 */     return this.endTime;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setEndTime(Date endTime)
/* 60:   */   {
/* 61:79 */     this.endTime = endTime;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String getHeight()
/* 65:   */   {
/* 66:83 */     return this.height;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setHeight(String height)
/* 70:   */   {
/* 71:86 */     this.height = height;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public Date getStartTime()
/* 75:   */   {
/* 76:90 */     return this.startTime;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void setStartTime(Date startTime)
/* 80:   */   {
/* 81:93 */     this.startTime = startTime;
/* 82:   */   }
/* 83:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCdpAdvertiseModifyModel
 * JD-Core Version:    0.7.0.1
 */