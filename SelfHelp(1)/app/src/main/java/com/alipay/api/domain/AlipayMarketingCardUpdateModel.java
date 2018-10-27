/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class AlipayMarketingCardUpdateModel
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5837231834497937276L;
/* 11:   */   @ApiField("card_info")
/* 12:   */   private MerchantCard cardInfo;
/* 13:   */   @ApiField("ext_info")
/* 14:   */   private String extInfo;
/* 15:   */   @ApiField("occur_time")
/* 16:   */   private Date occurTime;
/* 17:   */   @ApiField("target_card_no")
/* 18:   */   private String targetCardNo;
/* 19:   */   @ApiField("target_card_no_type")
/* 20:   */   private String targetCardNoType;
/* 21:   */   
/* 22:   */   public MerchantCard getCardInfo()
/* 23:   */   {
/* 24:50 */     return this.cardInfo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setCardInfo(MerchantCard cardInfo)
/* 28:   */   {
/* 29:53 */     this.cardInfo = cardInfo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getExtInfo()
/* 33:   */   {
/* 34:57 */     return this.extInfo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setExtInfo(String extInfo)
/* 38:   */   {
/* 39:60 */     this.extInfo = extInfo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public Date getOccurTime()
/* 43:   */   {
/* 44:64 */     return this.occurTime;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setOccurTime(Date occurTime)
/* 48:   */   {
/* 49:67 */     this.occurTime = occurTime;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getTargetCardNo()
/* 53:   */   {
/* 54:71 */     return this.targetCardNo;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setTargetCardNo(String targetCardNo)
/* 58:   */   {
/* 59:74 */     this.targetCardNo = targetCardNo;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public String getTargetCardNoType()
/* 63:   */   {
/* 64:78 */     return this.targetCardNoType;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public void setTargetCardNoType(String targetCardNoType)
/* 68:   */   {
/* 69:81 */     this.targetCardNoType = targetCardNoType;
/* 70:   */   }
/* 71:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCardUpdateModel
 * JD-Core Version:    0.7.0.1
 */