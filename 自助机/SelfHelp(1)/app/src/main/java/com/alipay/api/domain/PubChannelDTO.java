/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class PubChannelDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2245156839226621424L;
/* 10:   */   @ApiField("ext_info")
/* 11:   */   private String extInfo;
/* 12:   */   @ApiField("pub_channel")
/* 13:   */   private String pubChannel;
/* 14:   */   
/* 15:   */   public String getExtInfo()
/* 16:   */   {
/* 17:30 */     return this.extInfo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setExtInfo(String extInfo)
/* 21:   */   {
/* 22:33 */     this.extInfo = extInfo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getPubChannel()
/* 26:   */   {
/* 27:37 */     return this.pubChannel;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setPubChannel(String pubChannel)
/* 31:   */   {
/* 32:40 */     this.pubChannel = pubChannel;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PubChannelDTO
 * JD-Core Version:    0.7.0.1
 */