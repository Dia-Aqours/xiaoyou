/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicThirdCustomerServiceModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8512433484442278684L;
/* 10:   */   @ApiField("channel_uid")
/* 11:   */   private String channelUid;
/* 12:   */   
/* 13:   */   public String getChannelUid()
/* 14:   */   {
/* 15:23 */     return this.channelUid;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setChannelUid(String channelUid)
/* 19:   */   {
/* 20:26 */     this.channelUid = channelUid;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicThirdCustomerServiceModel
 * JD-Core Version:    0.7.0.1
 */