/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class OldComplextMockModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4593362181946333948L;
/* 10:   */   @ApiField("biz_num")
/* 11:   */   private Long bizNum;
/* 12:   */   @ApiField("biz_type")
/* 13:   */   private String bizType;
/* 14:   */   @ApiField("simple_mock_model")
/* 15:   */   private SimpleMockModel simpleMockModel;
/* 16:   */   
/* 17:   */   public Long getBizNum()
/* 18:   */   {
/* 19:35 */     return this.bizNum;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setBizNum(Long bizNum)
/* 23:   */   {
/* 24:38 */     this.bizNum = bizNum;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getBizType()
/* 28:   */   {
/* 29:42 */     return this.bizType;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setBizType(String bizType)
/* 33:   */   {
/* 34:45 */     this.bizType = bizType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public SimpleMockModel getSimpleMockModel()
/* 38:   */   {
/* 39:49 */     return this.simpleMockModel;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setSimpleMockModel(SimpleMockModel simpleMockModel)
/* 43:   */   {
/* 44:52 */     this.simpleMockModel = simpleMockModel;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.OldComplextMockModel

 * JD-Core Version:    0.7.0.1

 */