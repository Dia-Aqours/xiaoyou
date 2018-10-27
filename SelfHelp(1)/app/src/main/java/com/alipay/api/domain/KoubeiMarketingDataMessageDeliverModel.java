/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataMessageDeliverModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7718561411184449248L;
/* 10:   */   @ApiField("content")
/* 11:   */   private String content;
/* 12:   */   @ApiField("ext_info")
/* 13:   */   private String extInfo;
/* 14:   */   @ApiField("msg_type")
/* 15:   */   private String msgType;
/* 16:   */   
/* 17:   */   public String getContent()
/* 18:   */   {
/* 19:40 */     return this.content;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setContent(String content)
/* 23:   */   {
/* 24:43 */     this.content = content;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getExtInfo()
/* 28:   */   {
/* 29:47 */     return this.extInfo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setExtInfo(String extInfo)
/* 33:   */   {
/* 34:50 */     this.extInfo = extInfo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getMsgType()
/* 38:   */   {
/* 39:54 */     return this.msgType;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setMsgType(String msgType)
/* 43:   */   {
/* 44:57 */     this.msgType = msgType;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataMessageDeliverModel
 * JD-Core Version:    0.7.0.1
 */