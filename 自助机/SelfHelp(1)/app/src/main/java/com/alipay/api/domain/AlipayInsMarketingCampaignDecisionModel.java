/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayInsMarketingCampaignDecisionModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 3766518822195573738L;
/* 12:   */   @ApiField("business_type")
/* 13:   */   private Long businessType;
/* 14:   */   @ApiListField("market_types")
/* 15:   */   @ApiField("number")
/* 16:   */   private List<Long> marketTypes;
/* 17:   */   @ApiField("mkt_obj_id")
/* 18:   */   private String mktObjId;
/* 19:   */   @ApiField("mkt_obj_type")
/* 20:   */   private Long mktObjType;
/* 21:   */   @ApiField("request_id")
/* 22:   */   private String requestId;
/* 23:   */   
/* 24:   */   public Long getBusinessType()
/* 25:   */   {
/* 26:53 */     return this.businessType;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setBusinessType(Long businessType)
/* 30:   */   {
/* 31:56 */     this.businessType = businessType;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public List<Long> getMarketTypes()
/* 35:   */   {
/* 36:60 */     return this.marketTypes;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setMarketTypes(List<Long> marketTypes)
/* 40:   */   {
/* 41:63 */     this.marketTypes = marketTypes;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getMktObjId()
/* 45:   */   {
/* 46:67 */     return this.mktObjId;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setMktObjId(String mktObjId)
/* 50:   */   {
/* 51:70 */     this.mktObjId = mktObjId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public Long getMktObjType()
/* 55:   */   {
/* 56:74 */     return this.mktObjType;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setMktObjType(Long mktObjType)
/* 60:   */   {
/* 61:77 */     this.mktObjType = mktObjType;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String getRequestId()
/* 65:   */   {
/* 66:81 */     return this.requestId;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setRequestId(String requestId)
/* 70:   */   {
/* 71:84 */     this.requestId = requestId;
/* 72:   */   }
/* 73:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayInsMarketingCampaignDecisionModel
 * JD-Core Version:    0.7.0.1
 */