/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayMarketingCardOpenModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2374678559547726228L;
/* 10:   */   @ApiField("card_ext_info")
/* 11:   */   private MerchantCard cardExtInfo;
/* 12:   */   @ApiField("card_template_id")
/* 13:   */   private String cardTemplateId;
/* 14:   */   @ApiField("card_user_info")
/* 15:   */   private CardUserInfo cardUserInfo;
/* 16:   */   @ApiField("member_ext_info")
/* 17:   */   private MerchantMenber memberExtInfo;
/* 18:   */   @ApiField("out_serial_no")
/* 19:   */   private String outSerialNo;
/* 20:   */   
/* 21:   */   public MerchantCard getCardExtInfo()
/* 22:   */   {
/* 23:47 */     return this.cardExtInfo;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setCardExtInfo(MerchantCard cardExtInfo)
/* 27:   */   {
/* 28:50 */     this.cardExtInfo = cardExtInfo;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getCardTemplateId()
/* 32:   */   {
/* 33:54 */     return this.cardTemplateId;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setCardTemplateId(String cardTemplateId)
/* 37:   */   {
/* 38:57 */     this.cardTemplateId = cardTemplateId;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public CardUserInfo getCardUserInfo()
/* 42:   */   {
/* 43:61 */     return this.cardUserInfo;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setCardUserInfo(CardUserInfo cardUserInfo)
/* 47:   */   {
/* 48:64 */     this.cardUserInfo = cardUserInfo;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public MerchantMenber getMemberExtInfo()
/* 52:   */   {
/* 53:68 */     return this.memberExtInfo;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setMemberExtInfo(MerchantMenber memberExtInfo)
/* 57:   */   {
/* 58:71 */     this.memberExtInfo = memberExtInfo;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getOutSerialNo()
/* 62:   */   {
/* 63:75 */     return this.outSerialNo;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setOutSerialNo(String outSerialNo)
/* 67:   */   {
/* 68:78 */     this.outSerialNo = outSerialNo;
/* 69:   */   }
/* 70:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCardOpenModel

 * JD-Core Version:    0.7.0.1

 */